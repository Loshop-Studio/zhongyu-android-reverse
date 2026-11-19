# 在线专栏 业务代码导航

每个表格对应一个保留业务命名空间的包，方法来自 DEX 的类定义。点击类名可查看参与编译的实现。生成绑定、单字母类及第三方库另见完整包索引。

## com.zykj.download

| 类 | 方法摘录 |
|---|---|
| [DownloadFlag](../../../android/在线专栏/smali/com/zykj/download/DownloadFlag.smali) | `valueOf`、`values` |
| [FileCheckDownloadResult](../../../android/在线专栏/smali/com/zykj/download/FileCheckDownloadResult.smali) | `getDownloadEntity`、`getResultType` |
| [FileCheckResultType](../../../android/在线专栏/smali/com/zykj/download/FileCheckResultType.smali) | `valueOf`、`values` |
| [FileCheckUploadResult](../../../android/在线专栏/smali/com/zykj/download/FileCheckUploadResult.smali) | `getLocalPath`、`getProgress`、`getResultType`、`getServerUrl`、`getUrl`、`getVerifyCode` |
| [OssToken](../../../android/在线专栏/smali/com/zykj/download/OssToken.smali) | `getAccessKeyId`、`getAccessKeySecret`、`getBucket`、`getEndpoint`、`getSecurityToken`、`getStrategy` |
| [OssUtils](../../../android/在线专栏/smali/com/zykj/download/OssUtils.smali) | `getCacheDir`、`checkDownloadDir`、`checkFileName`、`getObjectKey`、`getOssClient`、`getOssToken`、`isNetworkConnected` |
| [StrategyEnum](../../../android/在线专栏/smali/com/zykj/download/StrategyEnum.smali) | `valueOf`、`values` |
| [UploadResultType](../../../android/在线专栏/smali/com/zykj/download/UploadResultType.smali) | `valueOf`、`values` |

## com.zykj.download.api

| 类 | 方法摘录 |
|---|---|
| [DownLoadApi](../../../android/在线专栏/smali/com/zykj/download/api/DownLoadApi.smali) | `download` |
| [UploadApi](../../../android/在线专栏/smali/com/zykj/download/api/UploadApi.smali) | `gridFs` |

## com.zykj.download.work

| 类 | 方法摘录 |
|---|---|
| [DownloadFileCommonWork](../../../android/在线专栏/smali/com/zykj/download/work/DownloadFileCommonWork.smali) | `checkContentLength`、`checkMD5`、`downloadFile`、`initParameter` |
| [DownloadFileWork](../../../android/在线专栏/smali/com/zykj/download/work/DownloadFileWork.smali) | `checkParam`、`downloadFileWithProgress`、`doWork`、`downloadFile`、`getAppDataBase`、`getDir`、`getDownloadUrl` |
| [DownloadFileWorkProxy](../../../android/在线专栏/smali/com/zykj/download/work/DownloadFileWorkProxy.smali) | `checkFileIntegrity`、`checkDownloadSuccess`、`checkRecord`、`updateDownloadSize`、`updateFlag`、`updateTotalSize`、`updateVerifyCode` |
| [DownloadOssFileWork](../../../android/在线专栏/smali/com/zykj/download/work/DownloadOssFileWork.smali) | `downloadFile`、`getOssToken`、`initParameter`、`setOssToken` |
| [UploadFileOssWork](../../../android/在线专栏/smali/com/zykj/download/work/UploadFileOssWork.smali) | `initParameter`、`uploadFile` |
| [UploadFileWork](../../../android/在线专栏/smali/com/zykj/download/work/UploadFileWork.smali) | `uploadFileWithProgress`、`doWork`、`getProgressLiveData`、`getReceiverLengthLiveData`、`initParameter`、`sendSpeedAndProgress`、`uploadFile` |

## com.zykj.http

| 类 | 方法摘录 |
|---|---|
| [BaseUrlEnum](../../../android/在线专栏/smali/com/zykj/http/BaseUrlEnum.smali) | `valueOf`、`values`、`getUrl`、`setUrl` |

## com.zykj.http.bean

| 类 | 方法摘录 |
|---|---|
| [ApiResp](../../../android/在线专栏/smali/com/zykj/http/bean/ApiResp.smali) | `getError`、`getResult`、`getSuccess` |
| [CommonApiResp](../../../android/在线专栏/smali/com/zykj/http/bean/CommonApiResp.smali) | `getCode`、`getMessage`、`getResult` |
| [ErrorInfo](../../../android/在线专栏/smali/com/zykj/http/bean/ErrorInfo.smali) | `getCode`、`getDetails`、`getMessage` |
| [HeaderBean](../../../android/在线专栏/smali/com/zykj/http/bean/HeaderBean.smali) | `getAccessToken`、`getAppName`、`getRefreshToken`、`getServerUrl`、`getVersionCode` |
| [HeaderLiveData](../../../android/在线专栏/smali/com/zykj/http/bean/HeaderLiveData.smali) | `getLessonDeauthorized`、`getOfflineMode`、`getUnauthorized` |

## com.zykj.http.exception

| 类 | 方法摘录 |
|---|---|
| [RemoteCodeException](../../../android/在线专栏/smali/com/zykj/http/exception/RemoteCodeException.smali) | `getErrorCodeInfo`、`setErrorCodeInfo` |

## com.zykj.http.interceptor

| 类 | 方法摘录 |
|---|---|
| [CommonResponseInterceptor](../../../android/在线专栏/smali/com/zykj/http/interceptor/CommonResponseInterceptor.smali) | `parseJson`、`reBuildResponse`、`getHeaderLiveData`、`intercept`、`setHeaderLiveData` |
| [GzipInterceptor](../../../android/在线专栏/smali/com/zykj/http/interceptor/GzipInterceptor.smali) | `isGzipped`、`unzip`、`intercept` |
| [HeadInterceptor](../../../android/在线专栏/smali/com/zykj/http/interceptor/HeadInterceptor.smali) | `getHeaderLiveData`、`intercept`、`setHeaderLiveData` |
| [NetWorkResponseWithRefreshTokenInterceptor](../../../android/在线专栏/smali/com/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor.smali) | `parseJson`、`refreshTokenAndContinueRequest`、`getHeaderLiveData`、`getRefreshRepository`、`intercept`、`setHeaderLiveData`、`setRefreshRepository` |
| [NetworkInterceptor](../../../android/在线专栏/smali/com/zykj/http/interceptor/NetworkInterceptor.smali) | `getNetworkMonitor`、`getContext`、`intercept`、`setContext` |
| [OfflineModeInterceptor](../../../android/在线专栏/smali/com/zykj/http/interceptor/OfflineModeInterceptor.smali) | `getHeaderLiveData`、`intercept`、`setHeaderLiveData` |
| [ResponseInterceptor](../../../android/在线专栏/smali/com/zykj/http/interceptor/ResponseInterceptor.smali) | `parseJson`、`reBuildResponse`、`getHeaderLiveData`、`intercept`、`setHeaderLiveData` |
| [ResponseWithRefreshTokenInterceptor](../../../android/在线专栏/smali/com/zykj/http/interceptor/ResponseWithRefreshTokenInterceptor.smali) | `parseJson`、`reBuildResponse`、`refreshTokenAndContinueRequest`、`getHeaderLiveData`、`getRefreshRepository`、`intercept`、`setHeaderLiveData` |

## com.zykj.http.listener

| 类 | 方法摘录 |
|---|---|
| [UploadProgressListener](../../../android/在线专栏/smali/com/zykj/http/listener/UploadProgressListener.smali) | `onProgressUpdate` |

## com.zykj.http.progress

| 类 | 方法摘录 |
|---|---|
| [ProgressRequestBody](../../../android/在线专栏/smali/com/zykj/http/progress/ProgressRequestBody.smali) | `contentType`、`writeTo` |
| [ProgressRequestBodyKt](../../../android/在线专栏/smali/com/zykj/http/progress/ProgressRequestBodyKt.smali) | `asProgressRequestBody` |

## com.zykj.lib.error.code

| 类 | 方法摘录 |
|---|---|
| [ErrorCode](../../../android/在线专栏/smali/com/zykj/lib/error/code/ErrorCode.smali) | `valueOf`、`values`、`getErrorCodeInfo` |
| [ErrorCodeHandler](../../../android/在线专栏/smali/com/zykj/lib/error/code/ErrorCodeHandler.smali) | `getErrorCode` |
| [ErrorCodeInfo](../../../android/在线专栏/smali/com/zykj/lib/error/code/ErrorCodeInfo.smali) | `getCode`、`getDesc`、`getMessage`、`getMessageResId` |

## com.zykj.message

| 类 | 方法摘录 |
|---|---|
| [KillSelfService](../../../android/在线专栏/smali/com/zykj/message/KillSelfService.smali) | `onBind`、`onStartCommand` |
| [UnInstallActivity](../../../android/在线专栏/smali/com/zykj/message/UnInstallActivity.smali) | `onBackPressed`、`onCreate`、`onResume` |
| [UnLoginActivity](../../../android/在线专栏/smali/com/zykj/message/UnLoginActivity.smali) | `onActivityResult`、`onBackPressed`、`onCreate`、`onDestroy`、`onPause`、`onRestart`、`onResume` |

## com.zykj.message.server.bean

| 类 | 方法摘录 |
|---|---|
| [ServerInfo](../../../android/在线专栏/smali/com/zykj/message/server/bean/ServerInfo.smali) | `describeContents`、`writeToParcel` |
| [Status](../../../android/在线专栏/smali/com/zykj/message/server/bean/Status.smali) | `valueOf`、`values`、`describeContents`、`writeToParcel` |
| [UserInfo](../../../android/在线专栏/smali/com/zykj/message/server/bean/UserInfo.smali) | `describeContents`、`writeToParcel` |

## com.zykj.subscriber

| 类 | 方法摘录 |
|---|---|
| [BaseActivity](../../../android/在线专栏/smali/com/zykj/subscriber/BaseActivity.smali) | `getResources`、`initView`、`onClick`、`onViewClick`、`setContentView` |
| [FileActivity](../../../android/在线专栏/smali/com/zykj/subscriber/FileActivity.smali) | `onCreate` |
| [MainActivity](../../../android/在线专栏/smali/com/zykj/subscriber/MainActivity.smali) | `initView`、`onBackPressed`、`onCreate`、`onDestroy`、`onKeyDown`、`onResume`、`onViewClick` |

## com.zykj.subscriber.application

| 类 | 方法摘录 |
|---|---|
| [MyApplication](../../../android/在线专栏/smali/com/zykj/subscriber/application/MyApplication.smali) | `onCreate`、`onTerminate` |

## com.zykj.subscriber.entity

| 类 | 方法摘录 |
|---|---|
| [LocalUserInfo](../../../android/在线专栏/smali/com/zykj/subscriber/entity/LocalUserInfo.smali) | `getRealName`、`getSnCode`、`getUsername`、`setRealName`、`setSnCode`、`setUsername` |

## com.zykj.subscriber.entity.resp

| 类 | 方法摘录 |
|---|---|
| [ApiResp](../../../android/在线专栏/smali/com/zykj/subscriber/entity/resp/ApiResp.smali) | `getError`、`getErrorCode`、`getErrorMessage`、`getSuccess`、`setError`、`setSuccess` |
| [GetWhiteListResp](../../../android/在线专栏/smali/com/zykj/subscriber/entity/resp/GetWhiteListResp.smali) | `getResult`、`setResult` |
| [IsAllowResp](../../../android/在线专栏/smali/com/zykj/subscriber/entity/resp/IsAllowResp.smali) | `getResult`、`setResult` |

## com.zykj.subscriber.receiver

| 类 | 方法摘录 |
|---|---|
| [AliMessageReceiver](../../../android/在线专栏/smali/com/zykj/subscriber/receiver/AliMessageReceiver.smali) | `onMessage`、`onNotification`、`onNotificationClickedWithNoAction`、`onNotificationOpened`、`onNotificationReceivedInApp`、`onNotificationRemoved` |

## com.zykj.subscriber.update

| 类 | 方法摘录 |
|---|---|
| [PercentCircleView](../../../android/在线专栏/smali/com/zykj/subscriber/update/PercentCircleView.smali) | `onDraw`、`onLayout`、`onMeasure`、`setTargetPercent` |
| [UpdateResp](../../../android/在线专栏/smali/com/zykj/subscriber/update/UpdateResp.smali) | `getError`、`getResult`、`getSuccess`、`setError`、`setResult`、`setSuccess` |

## com.zykj.subscriber.view

| 类 | 方法摘录 |
|---|---|
| [CommonTitleBar](../../../android/在线专栏/smali/com/zykj/subscriber/view/CommonTitleBar.smali) | `getStatusBarHeight`、`getActionCount`、`getCenterText`、`getDividerView`、`getLeftText`、`getSubTitleText`、`onClick` |
