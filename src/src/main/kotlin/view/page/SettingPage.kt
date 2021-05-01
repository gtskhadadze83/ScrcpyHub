package view.page

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import resource.Strings.ADB_LOCATION
import resource.Strings.IF_ADB_LOCATION_IS_EMPTY
import resource.Strings.IF_SCRCPY_LOCATION_IS_EMPTY
import resource.Strings.SAVE
import resource.Strings.SCRCPY_LOCATION
import view.extention.onCreated
import view.extention.onDestroyed
import viewmodel.SettingPageViewModel

@Composable
fun SettingPage(settingPageViewModel: SettingPageViewModel = SettingPageViewModel()) {
    onCreated(settingPageViewModel)
    onDrawPage(settingPageViewModel)
    onDestroyed(settingPageViewModel)
}

@Composable
private fun onDrawPage(viewModel: SettingPageViewModel) {
    Column(modifier = Modifier.fillMaxSize().padding(horizontal = 16.dp)) {
        Text(ADB_LOCATION, fontSize = 16.sp, fontWeight = FontWeight.SemiBold)
        Text(IF_ADB_LOCATION_IS_EMPTY, fontSize = 14.sp)
        Spacer(modifier = Modifier.height(8.dp))
        TextField(value = "", modifier = Modifier.fillMaxWidth(), onValueChange = { })

        Spacer(modifier = Modifier.height(16.dp))

        Text(SCRCPY_LOCATION, fontSize = 16.sp, fontWeight = FontWeight.SemiBold)
        Text(IF_SCRCPY_LOCATION_IS_EMPTY, fontSize = 14.sp)
        Spacer(modifier = Modifier.height(8.dp))
        TextField(value = "", modifier = Modifier.fillMaxWidth(), onValueChange = { })

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {}, Modifier.fillMaxWidth().wrapContentHeight()) {
            Text(SAVE)
        }
    }
}