package com.example.androidstudies.presentation.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidstudies.R
import com.example.androidstudies.ui.theme.AndroidStudiesTheme

@Composable
fun ProfileScreen() {
    var selectedTabIndex by remember {
        mutableStateOf(0)
    }
    Column(modifier = Modifier.fillMaxSize()) {
        TopBar()
        Spacer(modifier = Modifier.height(4.dp))
        ProfileSection()
        Spacer(modifier = Modifier.height(3.dp))
        ButtonSection(modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.height(4.dp))
        StoryHighlight(
            highlights = listOf(
                ImageWithText(
                    image = painterResource(id = R.drawable.dt),
                    text = "Begin"
                ),
                ImageWithText(
                    image = painterResource(id = R.drawable.lv),
                    text = "Hey"
                ),
                ImageWithText(
                    image = painterResource(id = R.drawable.lvs),
                    text = "You"
                ),
                ImageWithText(
                    image = painterResource(id = R.drawable.lvsh),
                    text = "Beautiful"
                ),
                ImageWithText(
                    image = painterResource(id = R.drawable.asht),
                    text = "Girl"
                ),
                ImageWithText(
                    image = painterResource(id = R.drawable.adsh),
                    text = "I"
                ),
                ImageWithText(
                    image = painterResource(id = R.drawable.cdsh),
                    text = "want"
                ),
                ImageWithText(
                    image = painterResource(id = R.drawable.nch),
                    text = "Another"
                ),
                ImageWithText(
                    image = painterResource(id = R.drawable.stranget),
                    text = "Love"
                ),

                )
        )
        Spacer(modifier = Modifier.height(4.dp))
        PostTabView(
            imageWithText = listOf(
                ImageWithText(
                    image = painterResource(id = R.drawable.ic_baseline_grid_on_24),
                    text = "Posts"
                ),
                ImageWithText(
                    image = painterResource(id = R.drawable.ic_baseline_cast_24),
                    text = "Reels"
                ),
                ImageWithText(
                    image = painterResource(id = R.drawable.ic_baseline_live_tv_24),
                    text = "IG_LIVE"
                ),
                ImageWithText(
                    image = painterResource(id = R.drawable.ic_baseline_account_circle_24),
                    text = "Profile"
                )
            )
        ) {
            selectedTabIndex = it
        }
        when (selectedTabIndex) {
            0 -> PostSection(
                posts = listOf(
                    painterResource(id = R.drawable.dt),
                    painterResource(id = R.drawable.lv),
                    painterResource(id = R.drawable.lvs),
                    painterResource(id = R.drawable.stranget),
                    painterResource(id = R.drawable.gss),
                    painterResource(id = R.drawable.strange),
                    painterResource(id = R.drawable.ssl),
                    painterResource(id = R.drawable.nch),
                    painterResource(id = R.drawable.lvsh),
                    painterResource(id = R.drawable.diort)

                ),
                modifier = Modifier.fillMaxWidth()
            )
        }

    }
}

@Composable
fun TopBar(modifier: Modifier = Modifier) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        Icon(
            imageVector = Icons.Default.ArrowBack,
            contentDescription = "back",
            tint = Color.Black,
            modifier = modifier.size(24.dp)

        )
        Text(
            text = "HushPuppy",
            overflow = TextOverflow.Ellipsis,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_baseline_notifications_24),
            contentDescription = "Notification",
            tint = Color.Black,
            modifier = modifier.size(24.dp)
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_baseline_more_vert_24),
            contentDescription = "Notification",
            tint = Color.Black,
            modifier = modifier.size(24.dp)
        )

    }
}

@Composable
fun ProfileSection() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        ) {
            RoundImage(
                image = painterResource(id = R.drawable.nch),
                modifier = Modifier
                    .size(100.dp)
                    .weight(3f)
            )
            Spacer(modifier = Modifier.height(16.dp))
            StatSection(modifier = Modifier.weight(7f))

        }
    }
}

@Composable
fun RoundImage(image: Painter, modifier: Modifier) {
    Image(
        painter = image,
        contentDescription = "ProfileImage",
        modifier = modifier
            .clip(
                RoundedCornerShape(8.dp)
            )
            .aspectRatio(1f, matchHeightConstraintsFirst = true)
            .border(width = 1.dp, color = Color.LightGray, shape = CircleShape)
            .padding(3.dp)
            .clip(CircleShape),
        contentScale = ContentScale.Crop
    )
}

@Composable
fun StatSection(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        ProfileStat(numberText = "100", text = "Posts")
        ProfileStat(numberText = "99.9k", text = "Followers")
        ProfileStat(numberText = "12k", text = "Following")
    }

}

@Composable
fun ProfileStat(
    numberText: String,
    text: String,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = numberText,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
        Spacer(modifier = modifier.height(4.dp))
        Text(text = text)
    }

}

@Composable
fun ButtonSection(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.padding(start = 5.dp, end = 5.dp),
        horizontalArrangement = Arrangement.spacedBy(5.dp)
    ) {
        ActionButtons(
            text = "Following",
            icon = Icons.Default.KeyboardArrowDown,
            modifier = Modifier
                .weight(1f)
                .defaultMinSize(minHeight = 40.dp)
        )
        ActionButtons(
            text = "Messages",
            modifier = Modifier
                .weight(1f)
                .defaultMinSize(minHeight = 40.dp)
        )
        ActionButtons(
            text = "Contacts",
            modifier = Modifier
                .weight(1f)
                .defaultMinSize(minHeight = 40.dp)
        )
        ActionButtons(
            icon = Icons.Default.KeyboardArrowDown,
            modifier = Modifier
                .size(40.dp)
        )

    }

}

@Composable
fun ActionButtons(
    modifier: Modifier = Modifier,
    text: String? = null,
    icon: ImageVector? = null
) {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .border(
                width = 1.dp,
                color = Color.LightGray,
                shape = RoundedCornerShape(5.dp)
            )
            .padding(5.dp)
    ) {
        if (text != null) {
            Text(
                text = text,
                fontWeight = FontWeight.SemiBold,
                fontSize = 14.sp
            )
        }
        if (icon != null) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = Color.Black
            )
        }

    }

}

@Composable
fun StoryHighlight(
    modifier: Modifier = Modifier,
    highlights: List<ImageWithText>
) {
    LazyRow(modifier = modifier) {
        items(highlights.size) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.padding(end = 15.dp)
            ) {
                RoundImage(
                    image = highlights[it].image,
                    modifier = Modifier
                        .size(70.dp)
                )
                Text(
                    text = highlights[it].text,
                    overflow = TextOverflow.Ellipsis,
                    textAlign = TextAlign.Center
                )

            }
        }
    }

}

@Composable
fun PostTabView(
    modifier: Modifier = Modifier,
    imageWithText: List<ImageWithText>,
    onTabSelect: (SelectedIndex: Int) -> Unit
) {
    var selectedTabIndex by remember {
        mutableStateOf(0)
    }
    val inactiveColor = Color(0xFF777777)
    TabRow(
        selectedTabIndex = selectedTabIndex,
        backgroundColor = Color.Transparent,
        contentColor = Color.Black,
        modifier = modifier
    ) {
        imageWithText.forEachIndexed { index, item ->
            Tab(
                selected = selectedTabIndex == index,
                selectedContentColor = Color.Black,
                unselectedContentColor = inactiveColor,
                onClick = {
                    selectedTabIndex = index
                    onTabSelect(0)

                }) {
                Icon(
                    painter = item.image,
                    contentDescription = item.text,
                    tint = if (selectedTabIndex == index) Color.Black
                    else inactiveColor,
                    modifier = Modifier
                        .padding(10.dp)
                        .size(20.dp)
                )

            }
        }

    }

}

@Composable
fun PostSection(
    posts: List<Painter>,
    modifier: Modifier = Modifier
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        modifier = modifier
            .scale(1.01f)
    ) {
        items(posts.size) {
            Image(
                painter = posts[it],
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = modifier
                    .aspectRatio(1f)
                    .border(width = 1.dp, color = Color.White)
            )
        }
    }

}


@Composable
@Preview(showBackground = true)
fun ProfileScreenPrev() {
    AndroidStudiesTheme {
        ProfileScreen()
    }
}