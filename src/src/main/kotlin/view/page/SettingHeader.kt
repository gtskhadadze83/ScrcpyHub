package view.page

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import resource.Images

@Composable
fun SettingHeader(onNavigateDevices: () -> Unit) {
    Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(8.dp).padding(bottom = 4.dp)) {
        Text(text = "Setting", fontSize = 18.sp, modifier = Modifier.wrapContentHeight().fillMaxWidth(fraction = 0.95f))
        Image(
            painter = painterResource(Images.CLOSE_BLACK),
            contentDescription = Images.CLOSE_BLACK,
            contentScale = ContentScale.FillHeight,
            modifier = Modifier
                .wrapContentWidth()
                .height(18.dp)
                .align(Alignment.CenterVertically)
                .clickable { onNavigateDevices() }
        )
    }
}