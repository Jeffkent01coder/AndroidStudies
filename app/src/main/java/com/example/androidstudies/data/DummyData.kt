package com.example.androidstudies.data

import com.example.androidstudies.R

object DummyData {
    val story = Story(
        1,
        "Jetpack compose is the next thing for andorid. Declarative UI is the way to go for all screens.",
        "The Verge",
        "@verge",
        "12m",
        R.drawable.addt,
        100,
        12,
        15,
        "Twitter for web"
    )

    val storyList = listOf(
        story,
        story.copy(
            id = 2,
            author = "Google",
            handle = "@google",
            authorImageId = R.drawable.strange,
            storyImageId = R.drawable.adsh,
            time = "11m"
        ),
        story.copy(
            id = 3,
            author = "Amazon",
            handle = "@Amazon",
            authorImageId = R.drawable.adss,
            time = "1h"
        ),
        story.copy(
            id = 4,
            author = "Facebook",
            handle = "@Facebook",
            authorImageId = R.drawable.asht,
            time = "1h"
        ),
        story.copy(
            id = 5,
            author = "Instagram",
            handle = "@Instagram",
            authorImageId = R.drawable.stranget,
            storyImageId = R.drawable.cdsh,
            time = "11m"
        ),
        story.copy(
            id = 6,
            author = "Twitter",
            handle = "@Twitter",
            authorImageId = R.drawable.lv,
            storyImageId = R.drawable.lvs,
            time = "11m"
        ),
        story.copy(
            id = 7,
            author = "Netflix",
            handle = "@Netflix",
            authorImageId = R.drawable.ssl,
            storyImageId = R.drawable.nch,
            time = "11m"
        ),
        story.copy(
            id = 8,
            author = "Tesla",
            handle = "@Tesla",
            authorImageId = R.drawable.gsh,
            time = "1h"
        ),
        story.copy(
            id = 9,
            author = "Microsoft",
            handle = "@Microsoft",
            authorImageId = R.drawable.gss,
            time = "1h"
        ),
        story.copy(
            id = 3,
            author = "Tencent",
            handle = "@Tencent",
            authorImageId = R.drawable.stranget,
            time = "1h"
        ),
        story.copy(
            id = 4,
            author = "Snapchat",
            handle = "@Snapchat",
            authorImageId = R.drawable.diort,
            time = "1h"
        ),
        story.copy(
            id = 5,
            author = "Snapchat",
            handle = "@Snapchat",
            authorImageId = R.drawable.dt,
            storyImageId = R.drawable.lsh,
            time = "11m"
        ),
        story.copy(
            id = 6,
            author = "Tiktok",
            handle = "@Tiktok",
            authorImageId = R.drawable.cdsh,
            storyImageId = R.drawable.cds,
            time = "11m"
        ),
        story.copy(
            id = 7,
            author = "Samsung",
            handle = "@Samsung",
            authorImageId = R.drawable.strange,
            storyImageId = R.drawable.stranget,
            time = "11m"
        ),
        story.copy(
            id = 8,
            author = "Youtube",
            handle = "@Youtube",
            authorImageId = R.drawable.ssl,
            time = "1h"
        ),
        story.copy(
            id = 9,
            author = "Gmail",
            handle = "@Gmail",
            authorImageId = R.drawable.lsh,
            time = "1h"
        ),
        story.copy(
            id = 3,
            author = "Android",
            handle = "@Android",
            authorImageId = R.drawable.cds,
            time = "1h"
        ),
        story.copy(
            id = 4,
            author = "Whatsapp",
            handle = "@Whatsapp",
            authorImageId = R.drawable.stranget,
            time = "1h"
        ),
        story.copy(
            id = 5,
            author = "Telegram",
            handle = "@Telegram",
            authorImageId = R.drawable.strange,
            storyImageId = R.drawable.asht,
            time = "11m"
        ),
        story.copy(
            id = 6,
            author = "Spotify",
            handle = "@Spotify",
            authorImageId = R.drawable.diort,
            storyImageId = R.drawable.addt,
            time = "11m"
        ),
        story.copy(
            id = 7,
            author = "WeChat",
            handle = "@WeChat",
            authorImageId = R.drawable.cds,
            storyImageId = R.drawable.dt,
            time = "11m"
        ),
        story.copy(
            id = 8,
            author = "Airbnb",
            handle = "@Airbnb",
            authorImageId = R.drawable.adsh,
            time = "1h"
        ),
        story.copy(
            id = 9,
            author = "LinkedIn",
            handle = "@LinkedIn",
            authorImageId = R.drawable.gss,
            time = "1h"
        ),
        story.copy(
            id = 6,
            author = "Shazam",
            handle = "@Shazam",
            authorImageId = R.drawable.ssl,
            storyImageId = R.drawable.asht,
            time = "11m"
        ),
        story.copy(
            id = 7,
            author = "Chrome",
            handle = "@Chrome",
            authorImageId = R.drawable.nch,
            storyImageId = R.drawable.stranget,
            time = "11m"
        ),
        story.copy(
            id = 6,
            author = "Safari",
            handle = "@Safari",
            authorImageId = R.drawable.lv,
            storyImageId = R.drawable.lvsh,
            time = "11m"
        ),
        story.copy(
            id = 7,
            author = "Disney",
            handle = "@Disney",
            authorImageId = R.drawable.stranget,
            storyImageId = R.drawable.dt,
            time = "11m"
        )


    )
}