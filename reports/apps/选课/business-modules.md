# 选课 业务代码导航

每个表格对应一个保留业务命名空间的包，方法来自 DEX 的类定义。点击类名可查看参与编译的实现。生成绑定、单字母类及第三方库另见完整包索引。

## com.zykj

| 类 | 方法摘录 |
|---|---|
| [MyApplication](../../../android/选课/smali/com/zykj/MyApplication.smali) | `onCreate`、`onTerminate` |

## com.zykj.curricula

| 类 | 方法摘录 |
|---|---|
| [MainActivity](../../../android/选课/smali/com/zykj/curricula/MainActivity.smali) | `checkIsInWhiteWebUrlList`、`getPermission`、`initWebViewUrl`、`initWhiteUrlList`、`initialize`、`requestUserCenter`、`onCreate` |

## com.zykj.exception

| 类 | 方法摘录 |
|---|---|
| [GenericException](../../../android/选课/smali/com/zykj/exception/GenericException.smali) | `getErrId`、`getErrMsg`、`getErrMsgOri`、`getErrOri`、`getMessage`、`setErrId`、`setErrMsg` |
| [SysException](../../../android/选课/smali/com/zykj/exception/SysException.smali) | `writeSysException`、`appendMsg`、`getMessage`、`getTrace`、`printDebug` |

## com.zykj.message

| 类 | 方法摘录 |
|---|---|
| [KillSelfService](../../../android/选课/smali/com/zykj/message/KillSelfService.smali) | `onBind`、`onStartCommand` |
| [UnInstallActivity](../../../android/选课/smali/com/zykj/message/UnInstallActivity.smali) | `reStartApp`、`onBackPressed`、`onCreate`、`onResume` |
| [UnLoginActivity](../../../android/选课/smali/com/zykj/message/UnLoginActivity.smali) | `reStartApp`、`onActivityResult`、`onBackPressed`、`onCreate`、`onDestroy`、`onPause`、`onRestart` |

## com.zykj.message.client

| 类 | 方法摘录 |
|---|---|
| [ActivityCollectionHelper](../../../android/选课/smali/com/zykj/message/client/ActivityCollectionHelper.smali) | `exitApp`、`finishAll`、`getTopActivity`、`register`、`registerResumeListener`、`unRegister`、`unRegisterResumeListener` |
| [DataCallBack](../../../android/选课/smali/com/zykj/message/client/DataCallBack.smali) | `response` |
| [MessageClient](../../../android/选课/smali/com/zykj/message/client/MessageClient.smali) | `valueOf`、`values`、`checkUrl`、`getSNInfo`、`getSNInfo`、`getServerInfo`、`getServerInfo` |

## com.zykj.message.listener

| 类 | 方法摘录 |
|---|---|
| [BaseMessageCallBack](../../../android/选课/smali/com/zykj/message/listener/BaseMessageCallBack.smali) | `getName` |
| [DefaultMessageCallBack](../../../android/选课/smali/com/zykj/message/listener/DefaultMessageCallBack.smali) | `getServerCallBack`、`getUserCallBack`、`serverInfoUpdate`、`userInfoUpdate` |
| [ServerCallBack](../../../android/选课/smali/com/zykj/message/listener/ServerCallBack.smali) | `userInfoUpdate` |
| [UserCallBack](../../../android/选课/smali/com/zykj/message/listener/UserCallBack.smali) | `serverInfoUpdate` |

## com.zykj.message.server

| 类 | 方法摘录 |
|---|---|
| [MessageCallBack](../../../android/选课/smali/com/zykj/message/server/MessageCallBack.smali) | `getName`、`serverInfoUpdate`、`userInfoUpdate` |
| [MessageServer](../../../android/选课/smali/com/zykj/message/server/MessageServer.smali) | `checkUrl`、`getSNInfo`、`getServerInfo`、`getUserInfo`、`refreshToken`、`registerCallBack`、`setServerInfo` |

## com.zykj.message.server.bean

| 类 | 方法摘录 |
|---|---|
| [ServerInfo](../../../android/选课/smali/com/zykj/message/server/bean/ServerInfo.smali) | `describeContents`、`getIMToken`、`getServerUrl`、`getStatus`、`getToken`、`setIMToken`、`setServerUrl` |
| [Status](../../../android/选课/smali/com/zykj/message/server/bean/Status.smali) | `getStatus`、`valueOf`、`values`、`describeContents`、`getStatusCode`、`writeToParcel` |
| [UserInfo](../../../android/选课/smali/com/zykj/message/server/bean/UserInfo.smali) | `describeContents`、`getId`、`getPassword`、`getPhoto`、`getRealName`、`getRole`、`getSchoolCode` |

## com.zykj.utlils

| 类 | 方法摘录 |
|---|---|
| [EncryptUtil](../../../android/选课/smali/com/zykj/utlils/EncryptUtil.smali) | `decryptThreeDESECB`、`encryptThreeDESECB` |
| [FileUtils](../../../android/选课/smali/com/zykj/utlils/FileUtils.smali) | `byteToMB`、`getExcelFileIntent`、`getPptFileIntent`、`getWordFileIntent`、`kbToMB`、`readFile`、`readFile` |
| [SharedTokenProviderUtil](../../../android/选课/smali/com/zykj/utlils/SharedTokenProviderUtil.smali) | `getBaseUrl`、`getToken`、`setBaseUrl`、`setToken` |
