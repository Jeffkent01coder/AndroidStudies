//package com.example.androidstudies.presentation.home
//
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.shape.CircleShape
//import androidx.compose.material.MaterialTheme
//import androidx.compose.material.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.unit.dp
//import com.example.androidstudies.data.Story
//
//@Composable
//fun InstagramListItem() {
//    Column {
//
//
//    }
//}
//
//@Composable
//private fun InstagramLikesSection(post: Story) {
//    Row(
//        modifier = Modifier
//            .padding(start = 8.dp)
//            .fillMaxWidth(),
//        verticalAlignment = Alignment.CenterVertically
//    ) {
//        Image(
//            painter = painterResource(id = post.authorImageId),
//            contentDescription = null,
//            contentScale = ContentScale.Crop,
//            modifier = Modifier
//                .size(20.dp)
//                .clip(CircleShape)
//        )
//        Text(
//            text = "Liked by ${post.author} and " +
//                    "${post.likesCount} others",
//            style = MaterialTheme.typography.caption,
//            modifier = Modifier.padding(start = 8.dp)
//        )
//    }
//
//    @Composable
//    fun InstagramIconSection(){
//        Row{
//            var fav
//
//        }
//    }
//}