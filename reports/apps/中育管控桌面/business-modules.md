# 中育管控桌面 业务代码导航

每个表格对应一个保留业务命名空间的包，方法来自 DEX 的类定义。点击类名可查看参与编译的实现。生成绑定、单字母类及第三方库另见完整包索引。

## com.zykj.base

| 类 | 方法摘录 |
|---|---|
| [BaseActivity](../../../android/中育管控桌面/smali_classes3/com/zykj/base/BaseActivity.smali) | `getMBindView`、`initData`、`initView`、`layoutId`、`onCreate`、`setMBindView` |
| [BaseApplication](../../../android/中育管控桌面/smali_classes3/com/zykj/base/BaseApplication.smali) | `onCreate` |
| [BaseDialogFragment](../../../android/中育管控桌面/smali_classes3/com/zykj/base/BaseDialogFragment.smali) | `cancelable`、`canceledOnTouchOutside`、`dismiss`、`getMBindView`、`initData`、`initView`、`isFullDialog` |
| [BaseFragment](../../../android/中育管控桌面/smali_classes3/com/zykj/base/BaseFragment.smali) | `getMBindView`、`initData`、`initView`、`layoutId`、`onCreate`、`onCreateView`、`onViewCreated` |
| [BaseViewModel](../../../android/中育管控桌面/smali_classes3/com/zykj/base/BaseViewModel.smali) | `getToastLiveData`、`handlerThrowable`、`isDialogVisible`、`launch`、`launchAsync`、`launchAsyncData`、`launchData` |
| [DataBinderMapperImpl](../../../android/中育管控桌面/smali_classes3/com/zykj/base/DataBinderMapperImpl.smali) | `collectDependencies`、`convertBrIdToString`、`getDataBinder`、`getDataBinder`、`getLayoutId` |

## com.zykj.base.bean.toast

| 类 | 方法摘录 |
|---|---|
| [ToastErrorCodeMessage](../../../android/中育管控桌面/smali_classes3/com/zykj/base/bean/toast/ToastErrorCodeMessage.smali) | `getErrorInfo` |
| [ToastErrorMessage](../../../android/中育管控桌面/smali_classes3/com/zykj/base/bean/toast/ToastErrorMessage.smali) | `getCode` |
| [ToastMessage](../../../android/中育管控桌面/smali_classes3/com/zykj/base/bean/toast/ToastMessage.smali) | `getMessage`、`getMessageResId`、`setMessage`、`setMessageResId` |

## com.zykj.base.ext

| 类 | 方法摘录 |
|---|---|
| [BindingAdaptersKt](../../../android/中育管控桌面/smali_classes3/com/zykj/base/ext/BindingAdaptersKt.smali) | `bindLiveData`、`netUrl`、`netUrlHeader`、`netUrlSnapshot`、`onClick`、`visibleOrGone` |

## com.zykj.base.utils

| 类 | 方法摘录 |
|---|---|
| [ActivityCollectionHelper](../../../android/中育管控桌面/smali_classes3/com/zykj/base/utils/ActivityCollectionHelper.smali) | `getEntries`、`valueOf`、`values`、`exitApp`、`finishAll`、`register`、`topActivity` |
| [ExceptionHandle](../../../android/中育管控桌面/smali_classes3/com/zykj/base/utils/ExceptionHandle.smali) | `caseRemoteCodeException`、`handleException` |
| [XToastUtils](../../../android/中育管控桌面/smali_classes3/com/zykj/base/utils/XToastUtils.smali) | `error`、`error`、`error`、`error`、`error`、`success`、`success` |

## com.zykj.base.view

| 类 | 方法摘录 |
|---|---|
| [LoadingDialogView](../../../android/中育管控桌面/smali_classes3/com/zykj/base/view/LoadingDialogView.smali) | `setDialogVisibility`、`getVisibility`、`onDetachedFromWindow`、`onMeasure`、`setVisibility` |
| [ToastView](../../../android/中育管控桌面/smali_classes3/com/zykj/base/view/ToastView.smali) | `getToastLiveData`、`setToastLiveData` |

## com.zykj.download

| 类 | 方法摘录 |
|---|---|
| [DataBinderMapperImpl](../../../android/中育管控桌面/smali_classes3/com/zykj/download/DataBinderMapperImpl.smali) | `collectDependencies`、`convertBrIdToString`、`getDataBinder`、`getDataBinder`、`getLayoutId` |
| [DownloadFlag](../../../android/中育管控桌面/smali_classes3/com/zykj/download/DownloadFlag.smali) | `valueOf`、`values` |
| [FileCheckDownloadResult](../../../android/中育管控桌面/smali_classes3/com/zykj/download/FileCheckDownloadResult.smali) | `getDownloadEntity`、`getResultType` |
| [FileCheckResultType](../../../android/中育管控桌面/smali_classes3/com/zykj/download/FileCheckResultType.smali) | `valueOf`、`values` |
| [FileCheckUploadResult](../../../android/中育管控桌面/smali_classes3/com/zykj/download/FileCheckUploadResult.smali) | `getLocalPath`、`getProgress`、`getResultType`、`getServerUrl`、`getUrl`、`getVerifyCode` |
| [OssToken](../../../android/中育管控桌面/smali_classes3/com/zykj/download/OssToken.smali) | `getAccessKeyId`、`getAccessKeySecret`、`getBucket`、`getEndpoint`、`getSecurityToken`、`getStrategy` |
| [OssUtils](../../../android/中育管控桌面/smali_classes3/com/zykj/download/OssUtils.smali) | `getCacheDir`、`checkDownloadDir`、`checkFileName`、`getObjectKey`、`getOssClient`、`getOssToken`、`isNetworkConnected` |
| [StrategyEnum](../../../android/中育管控桌面/smali_classes3/com/zykj/download/StrategyEnum.smali) | `valueOf`、`values` |
| [UploadResultType](../../../android/中育管控桌面/smali_classes3/com/zykj/download/UploadResultType.smali) | `valueOf`、`values` |

## com.zykj.download.api

| 类 | 方法摘录 |
|---|---|
| [DownLoadApi](../../../android/中育管控桌面/smali_classes3/com/zykj/download/api/DownLoadApi.smali) | `download` |
| [UploadApi](../../../android/中育管控桌面/smali_classes3/com/zykj/download/api/UploadApi.smali) | `gridFs` |

## com.zykj.download.data

| 类 | 方法摘录 |
|---|---|
| [AppDatabase_Impl](../../../android/中育管控桌面/smali_classes3/com/zykj/download/data/AppDatabase_Impl.smali) | `clearAllTables`、`createInvalidationTracker`、`createOpenHelper`、`getRequiredTypeConverters` |

## com.zykj.download.work

| 类 | 方法摘录 |
|---|---|
| [DownloadFileCommonWork](../../../android/中育管控桌面/smali_classes3/com/zykj/download/work/DownloadFileCommonWork.smali) | `checkContentLength`、`checkMD5`、`downloadFile`、`initParameter` |
| [DownloadFileWork](../../../android/中育管控桌面/smali_classes3/com/zykj/download/work/DownloadFileWork.smali) | `checkParam`、`downloadFileWithProgress`、`doWork`、`downloadFile`、`getAppDataBase`、`getDir`、`getDownloadUrl` |
| [DownloadFileWorkProxy](../../../android/中育管控桌面/smali_classes3/com/zykj/download/work/DownloadFileWorkProxy.smali) | `checkFileIntegrity`、`checkDownloadSuccess`、`checkRecord`、`updateDownloadSize`、`updateFlag`、`updateTotalSize`、`updateVerifyCode` |
| [DownloadOssFileWork](../../../android/中育管控桌面/smali_classes3/com/zykj/download/work/DownloadOssFileWork.smali) | `downloadFile`、`getOssToken`、`initParameter`、`setOssToken` |
| [UploadFileOssWork](../../../android/中育管控桌面/smali_classes3/com/zykj/download/work/UploadFileOssWork.smali) | `initParameter`、`uploadFile` |
| [UploadFileWork](../../../android/中育管控桌面/smali_classes3/com/zykj/download/work/UploadFileWork.smali) | `uploadFileWithProgress`、`doWork`、`getProgressLiveData`、`getReceiverLengthLiveData`、`initParameter`、`sendSpeedAndProgress`、`uploadFile` |

## com.zykj.gallery.api

| 类 | 方法摘录 |
|---|---|
| [PictureService](../../../android/中育管控桌面/smali/com/zykj/gallery/api/PictureService.smali) | `addPicture`、`deleteClear`、`deletePicture`、`getGarryList`、`getGeneratorTokenTypeV2`、`moveToRecycleBinAsync`、`receiverPicture` |

## com.zykj.gallery.bean

| 类 | 方法摘录 |
|---|---|
| [GalleryBody](../../../android/中育管控桌面/smali/com/zykj/gallery/bean/GalleryBody.smali) | `getAppName`、`getName`、`getPicture`、`getSize` |
| [GalleryImgBean](../../../android/中育管控桌面/smali/com/zykj/gallery/bean/GalleryImgBean.smali) | `getAppName`、`getBucketName`、`getCheckTime`、`getCheckUser`、`getCreateTime`、`getGradeName`、`getId` |
| [ListBody](../../../android/中育管控桌面/smali/com/zykj/gallery/bean/ListBody.smali) | `getMaxResultCount`、`getSkipCount`、`isRecycleBin` |
| [PagedData](../../../android/中育管控桌面/smali/com/zykj/gallery/bean/PagedData.smali) | `getItems`、`getTotalCount` |
| [RecordImgBean](../../../android/中育管控桌面/smali/com/zykj/gallery/bean/RecordImgBean.smali) | `getAppName`、`getPackageName`、`getPictures` |

## com.zykj.gallery.factory

| 类 | 方法摘录 |
|---|---|
| [GalleryPagingSourceFactory](../../../android/中育管控桌面/smali/com/zykj/gallery/factory/GalleryPagingSourceFactory.smali) | `create` |

## com.zykj.gallery.oss

| 类 | 方法摘录 |
|---|---|
| [FileResource](../../../android/中育管控桌面/smali/com/zykj/gallery/oss/FileResource.smali) | `getName`、`getValue` |
| [FileType](../../../android/中育管控桌面/smali/com/zykj/gallery/oss/FileType.smali) | `getValue` |
| [OssData](../../../android/中育管控桌面/smali/com/zykj/gallery/oss/OssData.smali) | `getObjectKey`、`getToken` |
| [OssToken](../../../android/中育管控桌面/smali/com/zykj/gallery/oss/OssToken.smali) | `getAccessKeyId`、`getAccessKeySecret`、`getAppId`、`getBucket`、`getEndpoint`、`getExpiration`、`getSecurityToken` |
| [TokenReq](../../../android/中育管控桌面/smali/com/zykj/gallery/oss/TokenReq.smali) | `getFc`、`getFe`、`getFo`、`getFr`、`getFt`、`getNonce`、`getSign` |
| [UploadUtils](../../../android/中育管控桌面/smali/com/zykj/gallery/oss/UploadUtils.smali) | `gridFsUpload`、`ossUpload`、`zyFsUpload`、`getFileNameFromUrlWithRegex`、`uploadFile` |

## com.zykj.gallery.page

| 类 | 方法摘录 |
|---|---|
| [GenericPagingSource](../../../android/中育管控桌面/smali_classes2/com/zykj/gallery/page/GenericPagingSource.smali) | `getRefreshKey`、`getRefreshKey` |
| [OffsetPagingSource](../../../android/中育管控桌面/smali_classes2/com/zykj/gallery/page/OffsetPagingSource.smali) | `getRefreshKey`、`getRefreshKey` |

## com.zykj.gallery.ui.activity

| 类 | 方法摘录 |
|---|---|
| [GalleryActivity](../../../android/中育管控桌面/smali_classes4/com/zykj/gallery/ui/activity/GalleryActivity.smali) | `onCreate` |
| [Hilt_GalleryActivity](../../../android/中育管控桌面/smali_classes4/com/zykj/gallery/ui/activity/Hilt_GalleryActivity.smali) | `generatedComponent`、`getDefaultViewModelProviderFactory`、`onCreate`、`onDestroy` |

## com.zykj.gallery.ui.gallery.commonState

| 类 | 方法摘录 |
|---|---|
| [GalleryCommonState](../../../android/中育管控桌面/smali_classes4/com/zykj/gallery/ui/gallery/commonState/GalleryCommonState.smali) | `forceRefreshList`、`getListPager`、`getListPagingFlow`、`getTotalCount` |
| [GalleryStateDelegate](../../../android/中育管控桌面/smali_classes4/com/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate.smali) | `forceRefreshList`、`getListPager`、`getListPagingFlow`、`getTotalCount` |
| [GalleryStateDelegate_Factory](../../../android/中育管控桌面/smali_classes4/com/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate_Factory.smali) | `create`、`newInstance` |
| [ViewModelModule](../../../android/中育管控桌面/smali_classes4/com/zykj/gallery/ui/gallery/commonState/ViewModelModule.smali) | `bindGalleryCommonState` |

## com.zykj.gallery.ui.gallery.screenList

| 类 | 方法摘录 |
|---|---|
| [ScreenState](../../../android/中育管控桌面/smali_classes4/com/zykj/gallery/ui/gallery/screenList/ScreenState.smali) | `valueOf`、`values` |

## com.zykj.gallery.ui.share

| 类 | 方法摘录 |
|---|---|
| [Hilt_ShareActivity](../../../android/中育管控桌面/smali_classes4/com/zykj/gallery/ui/share/Hilt_ShareActivity.smali) | `generatedComponent`、`getDefaultViewModelProviderFactory`、`onCreate`、`onDestroy` |
| [ShareActivity](../../../android/中育管控桌面/smali_classes4/com/zykj/gallery/ui/share/ShareActivity.smali) | `onCreate` |

## com.zykj.http.bean

| 类 | 方法摘录 |
|---|---|
| [ApiResp](../../../android/中育管控桌面/smali_classes4/com/zykj/http/bean/ApiResp.smali) | `getCode`、`getError`、`getMsg`、`getResult`、`getSuccess` |
| [ErrorInfo](../../../android/中育管控桌面/smali_classes4/com/zykj/http/bean/ErrorInfo.smali) | `getCode`、`getDetails`、`getMessage` |
| [HeaderBean](../../../android/中育管控桌面/smali_classes4/com/zykj/http/bean/HeaderBean.smali) | `getAccessToken`、`getAppName`、`getRefreshToken`、`getServerUrl`、`getVersionCode` |

## com.zykj.http.exception

| 类 | 方法摘录 |
|---|---|
| [RemoteCodeException](../../../android/中育管控桌面/smali_classes4/com/zykj/http/exception/RemoteCodeException.smali) | `getErrorCodeInfo`、`setErrorCodeInfo` |

## com.zykj.http.interceptor

| 类 | 方法摘录 |
|---|---|
| [GzipInterceptor](../../../android/中育管控桌面/smali_classes4/com/zykj/http/interceptor/GzipInterceptor.smali) | `isGzipped`、`unzip`、`intercept` |
| [HeadInterceptor](../../../android/中育管控桌面/smali_classes4/com/zykj/http/interceptor/HeadInterceptor.smali) | `getHeaderBeanFlow`、`intercept`、`setHeaderBeanFlow` |
| [NetworkInterceptor](../../../android/中育管控桌面/smali_classes4/com/zykj/http/interceptor/NetworkInterceptor.smali) | `intercept` |
| [RefreshTokenInterceptor](../../../android/中育管控桌面/smali_classes4/com/zykj/http/interceptor/RefreshTokenInterceptor.smali) | `refreshTokenAndContinueRequest`、`getRefreshRepository`、`getUnauthorizedFlow`、`intercept`、`setRefreshRepository`、`setUnauthorizedFlow` |

## com.zykj.http.listener

| 类 | 方法摘录 |
|---|---|
| [UploadProgressListener](../../../android/中育管控桌面/smali_classes4/com/zykj/http/listener/UploadProgressListener.smali) | `onProgressUpdate` |

## com.zykj.http.progress

| 类 | 方法摘录 |
|---|---|
| [ProgressRequestBody](../../../android/中育管控桌面/smali_classes4/com/zykj/http/progress/ProgressRequestBody.smali) | `contentType`、`writeTo` |
| [ProgressRequestBodyKt](../../../android/中育管控桌面/smali_classes4/com/zykj/http/progress/ProgressRequestBodyKt.smali) | `asProgressRequestBody` |

## com.zykj.huiwei.launcher

| 类 | 方法摘录 |
|---|---|
| [DataBinderMapperImpl](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/DataBinderMapperImpl.smali) | `collectDependencies`、`convertBrIdToString`、`getDataBinder`、`getDataBinder`、`getLayoutId` |

## com.zykj.huiwei.launcher.api

| 类 | 方法摘录 |
|---|---|
| [AuthService](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/api/AuthService.smali) | `getToken`、`refreshToken` |
| [DeviceService](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/api/DeviceService.smali) | `deviceAuthorized`、`getDeviceState`、`getWhiteIPList`、`getWhiteListApps`、`uploadTrackInfo` |
| [GatewayService](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/api/GatewayService.smali) | `gateway` |
| [HomeService](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/api/HomeService.smali) | `getAllProfilesAsync`、`getDisableAppsAsync`、`getDnUrl`、`getSettings`、`getStorageCredentialAsync`、`getStudentUserTodo`、`getSystemSettings` |
| [NotificationService](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/api/NotificationService.smali) | `getMyMessageList`、`getMyUnreadMessageCount`、`getNotice`、`setMessageRead` |
| [UserService](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/api/UserService.smali) | `checkUpdateAsync`、`forceChangePsdAsync`、`getPolicy`、`schoolInfoSettingsAsync`、`updatePwd`、`userInfo` |
| [VersionService](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/api/VersionService.smali) | `checkUpdateAsync` |
| [WhiteUrlService](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/api/WhiteUrlService.smali) | `getWhiteList` |

## com.zykj.huiwei.launcher.app

| 类 | 方法摘录 |
|---|---|
| [App](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/app/App.smali) | `onCreate`、`onTerminate` |
| [Hilt_App](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/app/Hilt_App.smali) | `generatedComponent`、`hiltInternalInject`、`onCreate` |

## com.zykj.huiwei.launcher.base

| 类 | 方法摘录 |
|---|---|
| [CommonActivity](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/base/CommonActivity.smali) | `getResources`、`onClick`、`onResume` |
| [CommonDialogFragment](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/base/CommonDialogFragment.smali) | `initView`、`onClick`、`onCreateView` |
| [CommonFragment](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/base/CommonFragment.smali) | `initView`、`onClick`、`onCreateView`、`onResume` |

## com.zykj.huiwei.launcher.bean

| 类 | 方法摘录 |
|---|---|
| [AppPackageInfo](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/AppPackageInfo.smali) | `getFirstInstallTime`、`getPackageName`、`getSize` |
| [AppType](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/AppType.smali) | `getEntries`、`valueOf`、`values` |
| [AvatarItem](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/AvatarItem.smali) | `getId`、`getUrl` |
| [BaseAppInfo](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/BaseAppInfo.smali) | `getActivityName`、`getIcon`、`getLabel`、`getPackageName` |
| [CertificationInfo](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/CertificationInfo.smali) | `getAppsList`、`getDevice`、`setAppsList`、`setDevice` |
| [DnClientType](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/DnClientType.smali) | `getEntries`、`valueOf`、`values` |
| [GetTaskListReq](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/GetTaskListReq.smali) | `getEndTime`、`getExamTaskType`、`getGradeId`、`getKeyword`、`getMaxResultCount`、`getSkipCount`、`getStartTime` |
| [GetTaskListResponse](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/GetTaskListResponse.smali) | `getItems`、`getTotalCount`、`getTotalUrge` |
| [HomeTime](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/HomeTime.smali) | `getDate`、`getTime`、`setDate`、`setTime` |
| [Homework](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/Homework.smali) | `getId`、`getTime`、`getTitle` |
| [LcAppInfo](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/LcAppInfo.smali) | `getName`、`getVisible` |
| [Location](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/Location.smali) | `getCity`、`getProvince` |
| [PolicyTypeBean](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/PolicyTypeBean.smali) | `getType`、`setType` |
| [StudentInfoBean](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/StudentInfoBean.smali) | `getEnterSchoolYear`、`getGradeName`、`getId`、`getNumber`、`getUser`、`setClassId`、`setClassName` |
| [SystemSettingsBean](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/SystemSettingsBean.smali) | `getUserPasswordStrength` |
| [TaskInfo](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/TaskInfo.smali) | `getAddress`、`getAnswerPad`、`getAnswerSheet`、`getAnsweringUrge`、`getCorrectOnline`、`getCorrectOnlineState`、`getCorrectWithSelf` |
| [UpdateInfo](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/UpdateInfo.smali) | `getAppVersionId`、`getCreationTime`、`getCreatorUserId`、`getDescription`、`getDisabled`、`getDownloads`、`getFileUrl` |
| [UserBean](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/UserBean.smali) | `getId`、`getName`、`getPassword`、`getPicture`、`getRoleType`、`getSchoolCode`、`getSurname` |

## com.zykj.huiwei.launcher.bean.paging

| 类 | 方法摘录 |
|---|---|
| [NotificationPagingSource](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/paging/NotificationPagingSource.smali) | `getRefreshKey`、`getRefreshKey` |

## com.zykj.huiwei.launcher.bean.req

| 类 | 方法摘录 |
|---|---|
| [AvatarSetReq](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/req/AvatarSetReq.smali) | `getProfileId` |
| [ForcePsdReq](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/req/ForcePsdReq.smali) | `getPassword`、`setPassword` |
| [GetMessageReq](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/req/GetMessageReq.smali) | `getMaxResultCount`、`getPublishTimeFrom`、`getPublishTimeTo`、`getSkipCount`、`getTitle`、`getType`、`setMaxResultCount` |
| [LoginReq](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/req/LoginReq.smali) | `getClientType`、`getDeviceNumber`、`getIm`、`getPassword`、`getRole`、`getSchoolName`、`getUsername` |
| [TrackInfoReq](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/req/TrackInfoReq.smali) | `getDescription`、`getDeviceNumber`、`setDescription`、`setDeviceNumber` |
| [UpdatePwdReq](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/req/UpdatePwdReq.smali) | `getOldPassword`、`getPassword`、`setOldPassword`、`setPassword` |
| [UploadDnsInfoReq](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/req/UploadDnsInfoReq.smali) | `getAppName`、`getAppPackageName`、`getDetailInfo`、`getType`、`setAppName`、`setAppPackageName`、`setDetailInfo` |
| [VersionInfoReq](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/req/VersionInfoReq.smali) | `getAppType`、`getPackageName`、`getVersion` |

## com.zykj.huiwei.launcher.bean.resp

| 类 | 方法摘录 |
|---|---|
| [AppData](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/resp/AppData.smali) | `getAppInfo`、`getSort` |
| [Credential](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/resp/Credential.smali) | `getAccessKeyId`、`getAccessKeySecret`、`getAppId`、`getBucket`、`getEndpoint`、`getExpiration`、`getSecurityToken` |
| [DisableAppInfo](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/resp/DisableAppInfo.smali) | `getAppName`、`getPackageName` |
| [GatewayBean](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/resp/GatewayBean.smali) | `getCode`、`getLcid`、`getName`、`getServer`、`getWebServer`、`setCode`、`setName` |
| [LoginResp](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/resp/LoginResp.smali) | `getAccessToken`、`getClientCode`、`getExpireInSeconds`、`getMobile`、`getNeedChangePwd`、`getNeedSmsVerification`、`getPasswordLevel` |
| [MessageInfo](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/resp/MessageInfo.smali) | `getCreationTime`、`getCreatorUserId`、`getDeleterUserId`、`getDeletionTime`、`getId`、`getLastModificationTime`、`getLastModifierUserId` |
| [MessageResp](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/resp/MessageResp.smali) | `getItems`、`getTotalCount` |
| [MessageType](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/resp/MessageType.smali) | `getEntries`、`valueOf`、`values`、`getType` |
| [NoticeBean](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/resp/NoticeBean.smali) | `getContent`、`getReadCount`、`getTargetCount`、`getTitle`、`getType` |
| [Parameter](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/resp/Parameter.smali) | `getId` |
| [SchoolSettingResp](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/resp/SchoolSettingResp.smali) | `getEmailAddress`、`getMobile`、`getSchoolName`、`getSchoolShortName`、`getWechat`、`setEmailAddress`、`setMobile` |
| [SenderInfo](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/resp/SenderInfo.smali) | `getFullName`、`getGender`、`getPicture`、`getRoleType` |
| [SettingResp](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/resp/SettingResp.smali) | `getDnOrder`、`setDnOrder` |
| [SettingSwitch](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/resp/SettingSwitch.smali) | `getEntries`、`valueOf`、`values` |
| [TodoResp](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/resp/TodoResp.smali) | `getHomeworkCount`、`getQuoraCount`、`getReviseCount`、`getUnReadSpecialCount`、`getUnReplySpecialCount` |
| [TokenResp](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/resp/TokenResp.smali) | `getAccessToken`、`getExpireInSeconds`、`getRefreshExpireInSeconds`、`getRefreshToken`、`setAccessToken`、`setExpireInSeconds`、`setRefreshExpireInSeconds` |
| [UnReadMessageBean](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/resp/UnReadMessageBean.smali) | `getCount`、`getType` |
| [UnReadMessageResp](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/resp/UnReadMessageResp.smali) | `getData` |
| [VersionInfo](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/resp/VersionInfo.smali) | `describeContents`、`getDescription`、`getFileUrl`、`getForceUpdate`、`getName`、`getSize`、`getVersionCode` |
| [WeatherBean](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/resp/WeatherBean.smali) | `getCode`、`getDaily`、`getFxLink`、`getUpdateTime` |
| [WeatherCityBean](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/resp/WeatherCityBean.smali) | `getFxDate`、`getIconDay`、`getIconNight`、`getTempMax`、`getTempMin`、`getTextDay`、`getTextNight` |
| [WebsitesUsedOftenBean](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/resp/WebsitesUsedOftenBean.smali) | `getCreationTime`、`getCreatorUserId`、`getId`、`getLastModificationTime`、`getLastModifierUserId`、`getLogo`、`getName` |

## com.zykj.huiwei.launcher.callback

| 类 | 方法摘录 |
|---|---|
| [MessageInfoDiffCallback](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/callback/MessageInfoDiffCallback.smali) | `areContentsTheSame`、`areItemsTheSame` |

## com.zykj.huiwei.launcher.dao

| 类 | 方法摘录 |
|---|---|
| [PDFPreviewDatabase_Impl](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/dao/PDFPreviewDatabase_Impl.smali) | `clearAllTables`、`createAutoMigrations`、`createInvalidationTracker`、`createOpenDelegate`、`getRequiredAutoMigrationSpecClasses`、`getRequiredTypeConverterClasses` |
| [PDFPreviewInfo](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/dao/PDFPreviewInfo.smali) | `getPageIndex`、`getPageOffset`、`getPath` |

## com.zykj.huiwei.launcher.proto

| 类 | 方法摘录 |
|---|---|
| [RoleType](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/proto/RoleType.smali) | `forNumber`、`internalGetValueMap`、`internalGetVerifier`、`valueOf`、`valueOf`、`values`、`getNumber` |

## com.zykj.huiwei.launcher.providers

| 类 | 方法摘录 |
|---|---|
| [AnalyticsModule](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/providers/AnalyticsModule.smali) | `bindRefreshRepository` |
| [ApiProvide](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/providers/ApiProvide.smali) | `provideAuthService`、`provideDeviceService`、`provideGalleryService`、`provideGatewayService`、`provideHomeService`、`provideNotification`、`provideUserService` |
| [ApiProvide_ProvideAuthServiceFactory](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/providers/ApiProvide_ProvideAuthServiceFactory.smali) | `create`、`provideAuthService` |
| [ApiProvide_ProvideDeviceServiceFactory](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/providers/ApiProvide_ProvideDeviceServiceFactory.smali) | `create`、`provideDeviceService` |
| [ApiProvide_ProvideGalleryServiceFactory](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/providers/ApiProvide_ProvideGalleryServiceFactory.smali) | `create`、`provideGalleryService` |
| [ApiProvide_ProvideGatewayServiceFactory](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/providers/ApiProvide_ProvideGatewayServiceFactory.smali) | `create`、`provideGatewayService` |
| [ApiProvide_ProvideHomeServiceFactory](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/providers/ApiProvide_ProvideHomeServiceFactory.smali) | `create`、`provideHomeService` |
| [ApiProvide_ProvideNotificationFactory](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/providers/ApiProvide_ProvideNotificationFactory.smali) | `create`、`provideNotification` |
| [ApiProvide_ProvideUserServiceFactory](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/providers/ApiProvide_ProvideUserServiceFactory.smali) | `create`、`provideUserService` |
| [ApiProvide_ProvideVersionServiceFactory](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/providers/ApiProvide_ProvideVersionServiceFactory.smali) | `create`、`provideVersionService` |
| [ApiProvide_ProvideWhiteUrlServiceFactory](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/providers/ApiProvide_ProvideWhiteUrlServiceFactory.smali) | `create`、`provideWhiteUrlService` |
| [GlobalObjectProvide](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/providers/GlobalObjectProvide.smali) | `provideAppList`、`provideServerLiveDataBean`、`provideUserLiveDataBean` |
| [GlobalObjectProvide_ProvideAppListFactory](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/providers/GlobalObjectProvide_ProvideAppListFactory.smali) | `create`、`provideAppList` |
| [GlobalObjectProvide_ProvideServerLiveDataBeanFactory](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/providers/GlobalObjectProvide_ProvideServerLiveDataBeanFactory.smali) | `create`、`provideServerLiveDataBean` |
| [GlobalObjectProvide_ProvideUserLiveDataBeanFactory](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/providers/GlobalObjectProvide_ProvideUserLiveDataBeanFactory.smali) | `create`、`provideUserLiveDataBean` |
| [LocalCacheProvide](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/providers/LocalCacheProvide.smali) | `getServerBeanDataStore`、`getSettingDataStore`、`getStudentInfoDataStore`、`getUpdateSettingsDataStore`、`getUserCacheBeanDataStore`、`serverBeanDataStore`、`settingDataStore` |
| [LocalCacheProvide_ServerBeanDataStoreFactory](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/providers/LocalCacheProvide_ServerBeanDataStoreFactory.smali) | `create`、`serverBeanDataStore` |
| [LocalCacheProvide_SettingDataStoreFactory](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/providers/LocalCacheProvide_SettingDataStoreFactory.smali) | `create`、`settingDataStore` |
| [LocalCacheProvide_StudentInfoDataStoreFactory](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/providers/LocalCacheProvide_StudentInfoDataStoreFactory.smali) | `create`、`studentInfoDataStore` |
| [LocalCacheProvide_UpdateSettingsDataStoreFactory](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/providers/LocalCacheProvide_UpdateSettingsDataStoreFactory.smali) | `create`、`updateSettingsDataStore` |
| [LocalCacheProvide_UserCacheBeanDataStoreFactory](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/providers/LocalCacheProvide_UserCacheBeanDataStoreFactory.smali) | `create`、`userCacheBeanDataStore` |
| [OkHttpClientProvide](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/providers/OkHttpClientProvide.smali) | `provideAuthOkHttpClient`、`provideCommonOkHttpClient`、`provideCommonResponseOkHttpClient`、`provideFileOkHttpClient`、`provideHeaderBeanFlow`、`provideResponseOkHttpClient`、`provideUnauthorizedFlow` |
| [OkHttpClientProvide_ProvideAuthOkHttpClientFactory](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/providers/OkHttpClientProvide_ProvideAuthOkHttpClientFactory.smali) | `create`、`provideAuthOkHttpClient` |
| [OkHttpClientProvide_ProvideCommonOkHttpClientFactory](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/providers/OkHttpClientProvide_ProvideCommonOkHttpClientFactory.smali) | `create`、`provideCommonOkHttpClient` |
| [OkHttpClientProvide_ProvideCommonResponseOkHttpClientFactory](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/providers/OkHttpClientProvide_ProvideCommonResponseOkHttpClientFactory.smali) | `create`、`provideCommonResponseOkHttpClient` |
| [OkHttpClientProvide_ProvideFileOkHttpClientFactory](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/providers/OkHttpClientProvide_ProvideFileOkHttpClientFactory.smali) | `create`、`provideFileOkHttpClient` |
| [OkHttpClientProvide_ProvideHeaderBeanFlowFactory](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/providers/OkHttpClientProvide_ProvideHeaderBeanFlowFactory.smali) | `create`、`provideHeaderBeanFlow` |
| [OkHttpClientProvide_ProvideResponseOkHttpClientFactory](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/providers/OkHttpClientProvide_ProvideResponseOkHttpClientFactory.smali) | `create`、`provideResponseOkHttpClient` |
| [OkHttpClientProvide_ProvideUnauthorizedFlowFactory](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/providers/OkHttpClientProvide_ProvideUnauthorizedFlowFactory.smali) | `create`、`provideUnauthorizedFlow` |
| [ServerBeanSerializer](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/providers/ServerBeanSerializer.smali) | `getDefaultValue`、`getDefaultValue`、`readFrom`、`writeTo`、`writeTo` |
| [SettingsSerializer](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/providers/SettingsSerializer.smali) | `getDefaultValue`、`getDefaultValue`、`readFrom`、`writeTo`、`writeTo` |
| [StudentInfoSerializer](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/providers/StudentInfoSerializer.smali) | `getDefaultValue`、`getDefaultValue`、`readFrom`、`writeTo`、`writeTo` |
| [UpdateSettingsSerializer](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/providers/UpdateSettingsSerializer.smali) | `getDefaultValue`、`getDefaultValue`、`readFrom`、`writeTo`、`writeTo` |
| [UserCacheBeanSerializer](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/providers/UserCacheBeanSerializer.smali) | `getDefaultValue`、`getDefaultValue`、`readFrom`、`writeTo`、`writeTo` |

## com.zykj.huiwei.launcher.receiver

| 类 | 方法摘录 |
|---|---|
| [LogoutReceiver](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/receiver/LogoutReceiver.smali) | `onReceive` |

## com.zykj.huiwei.launcher.server

| 类 | 方法摘录 |
|---|---|
| [MyFloatingToolService](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/server/MyFloatingToolService.smali) | `onBind`、`onCreate`、`onDestroy` |
| [MyService](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/server/MyService.smali) | `onCreate`、`onDestroy` |

## com.zykj.huiwei.launcher.ui

| 类 | 方法摘录 |
|---|---|
| [Hilt_MainActivity](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/Hilt_MainActivity.smali) | `generatedComponent`、`getDefaultViewModelProviderFactory`、`onCreate`、`onDestroy` |
| [MainActivity](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/MainActivity.smali) | `getNavController`、`initView`、`layoutId`、`onCreate`、`onDestroy`、`onPause`、`onResume` |

## com.zykj.huiwei.launcher.ui.activity

| 类 | 方法摘录 |
|---|---|
| [CrashActivity](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/activity/CrashActivity.smali) | `onCreate` |
| [FileActivity](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/activity/FileActivity.smali) | `initView`、`layoutId` |
| [Hilt_CrashActivity](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/activity/Hilt_CrashActivity.smali) | `generatedComponent`、`getDefaultViewModelProviderFactory`、`onCreate`、`onDestroy` |
| [ImageFragment](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/activity/ImageFragment.smali) | `initData`、`initView`、`layoutId` |
| [PdfFragment](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/activity/PdfFragment.smali) | `initData`、`initView`、`layoutId`、`onAttach`、`onDestroyView`、`onPause` |

## com.zykj.huiwei.launcher.ui.adapter

| 类 | 方法摘录 |
|---|---|
| [AppListAdapter](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/adapter/AppListAdapter.smali) | `addDraggableModule`、`convert`、`onItemViewHolderCreated` |
| [AvatarAdapter](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/adapter/AvatarAdapter.smali) | `convert`、`onItemViewHolderCreated` |
| [DotAdapter](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/adapter/DotAdapter.smali) | `convert` |
| [HomeworkAdapter](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/adapter/HomeworkAdapter.smali) | `convert` |
| [MainPageAdapter](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/adapter/MainPageAdapter.smali) | `createFragment`、`getItemCount` |
| [NotificationPagingAdapter](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter.smali) | `onBindViewHolder`、`onCreateViewHolder` |

## com.zykj.huiwei.launcher.ui.dialog

| 类 | 方法摘录 |
|---|---|
| [AppUpdateDialog](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog.smali) | `layoutId`、`onClick` |
| [AppUpdateDialogArgs](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/dialog/AppUpdateDialogArgs.smali) | `fromBundle` |
| [ChangeAvatarDialog](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog.smali) | `layoutId`、`onClick` |
| [ChangeAvatarDialogArgs](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialogArgs.smali) | `fromBundle` |
| [CrashHintDialog](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/dialog/CrashHintDialog.smali) | `layoutId` |
| [CustomerServiceDialog](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/dialog/CustomerServiceDialog.smali) | `layoutId`、`onClick` |
| [Hilt_AppUpdateDialog](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/dialog/Hilt_AppUpdateDialog.smali) | `generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`onAttach`、`onAttach`、`onGetLayoutInflater` |
| [Hilt_ChangeAvatarDialog](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/dialog/Hilt_ChangeAvatarDialog.smali) | `generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`onAttach`、`onAttach`、`onGetLayoutInflater` |
| [Hilt_CrashHintDialog](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/dialog/Hilt_CrashHintDialog.smali) | `generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`onAttach`、`onAttach`、`onGetLayoutInflater` |
| [Hilt_CustomerServiceDialog](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/dialog/Hilt_CustomerServiceDialog.smali) | `generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`onAttach`、`onAttach`、`onGetLayoutInflater` |
| [Hilt_ModifyGestureDialog](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/dialog/Hilt_ModifyGestureDialog.smali) | `generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`onAttach`、`onAttach`、`onGetLayoutInflater` |
| [Hilt_ModifyPasswordDialog](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/dialog/Hilt_ModifyPasswordDialog.smali) | `generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`onAttach`、`onAttach`、`onGetLayoutInflater` |
| [Hilt_TipsDialog](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/dialog/Hilt_TipsDialog.smali) | `generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`onAttach`、`onAttach`、`onGetLayoutInflater` |
| [Hilt_UnAuthorDialog](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/dialog/Hilt_UnAuthorDialog.smali) | `generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`onAttach`、`onAttach`、`onGetLayoutInflater` |
| [ModifyGestureDialog](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/dialog/ModifyGestureDialog.smali) | `layoutId`、`onClick` |
| [ModifyPasswordDialog](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/dialog/ModifyPasswordDialog.smali) | `layoutId`、`onClick` |
| [TipsDialog](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/dialog/TipsDialog.smali) | `layoutId`、`onClick`、`onDestroy` |
| [TipsDialogArgs](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/dialog/TipsDialogArgs.smali) | `fromBundle` |
| [UnAuthorDialog](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/dialog/UnAuthorDialog.smali) | `layoutId`、`onClick` |

## com.zykj.huiwei.launcher.ui.dialog.Login

| 类 | 方法摘录 |
|---|---|
| [Hilt_ResetPwdDialogFragment](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/dialog/Login/Hilt_ResetPwdDialogFragment.smali) | `generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`onAttach`、`onAttach`、`onGetLayoutInflater` |
| [ResetPwdDialogFragment](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/dialog/Login/ResetPwdDialogFragment.smali) | `onCreate`、`onCreateDialog`、`onCreateView` |

## com.zykj.huiwei.launcher.ui.dialog.changePsdDialog

| 类 | 方法摘录 |
|---|---|
| [ComposeModifyPasswordDialog](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ComposeModifyPasswordDialog.smali) | `onCreate`、`onCreateDialog`、`onCreateView`、`onViewCreated` |
| [ComposeModifyPasswordDialogArgs](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ComposeModifyPasswordDialogArgs.smali) | `fromBundle` |
| [Hilt_ComposeModifyPasswordDialog](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/dialog/changePsdDialog/Hilt_ComposeModifyPasswordDialog.smali) | `generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`onAttach`、`onAttach`、`onGetLayoutInflater` |

## com.zykj.huiwei.launcher.ui.dialog.screenShoot

| 类 | 方法摘录 |
|---|---|
| [CommonDialogFragment](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment.smali) | `onCreateView`、`onDestroy`、`onStart`、`onViewCreated` |

## com.zykj.huiwei.launcher.ui.fragment

| 类 | 方法摘录 |
|---|---|
| [Hilt_HomeFragment](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/fragment/Hilt_HomeFragment.smali) | `generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`onAttach`、`onAttach`、`onGetLayoutInflater` |
| [Hilt_LoginFragment](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/fragment/Hilt_LoginFragment.smali) | `generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`onAttach`、`onAttach`、`onGetLayoutInflater` |
| [Hilt_MainFragment](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/fragment/Hilt_MainFragment.smali) | `generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`onAttach`、`onAttach`、`onGetLayoutInflater` |
| [Hilt_NotificationDetailFragment](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/fragment/Hilt_NotificationDetailFragment.smali) | `generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`onAttach`、`onAttach`、`onGetLayoutInflater` |
| [Hilt_NotificationFragment](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/fragment/Hilt_NotificationFragment.smali) | `generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`onAttach`、`onAttach`、`onGetLayoutInflater` |
| [HomeFragment](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/fragment/HomeFragment.smali) | `layoutId`、`onClick`、`onDestroy` |
| [LoginFragment](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/fragment/LoginFragment.smali) | `initView`、`layoutId`、`onDestroy` |
| [MainFragment](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/fragment/MainFragment.smali) | `layoutId`、`onDestroyView`、`onViewCreated` |
| [NotificationDetailFragment](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment.smali) | `initData`、`layoutId` |
| [NotificationDetailFragmentArgs](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragmentArgs.smali) | `fromBundle` |
| [NotificationFragment](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/fragment/NotificationFragment.smali) | `initData`、`layoutId` |

## com.zykj.huiwei.launcher.ui.fragment.applist

| 类 | 方法摘录 |
|---|---|
| [BaseAppFragment](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment.smali) | `initView`、`layoutId` |
| [Hilt_BaseAppFragment](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/fragment/applist/Hilt_BaseAppFragment.smali) | `generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`onAttach`、`onAttach`、`onGetLayoutInflater` |
| [Hilt_HuiWeiAppFragment](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/fragment/applist/Hilt_HuiWeiAppFragment.smali) | `getContext`、`onAttach`、`onAttach`、`onGetLayoutInflater` |
| [Hilt_LCAppFragment](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/fragment/applist/Hilt_LCAppFragment.smali) | `getContext`、`onAttach`、`onAttach`、`onGetLayoutInflater` |
| [HuiWeiAppFragment](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/fragment/applist/HuiWeiAppFragment.smali) | `initView` |
| [LCAppFragment](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/fragment/applist/LCAppFragment.smali) | `initView` |

## com.zykj.huiwei.launcher.ui.view

| 类 | 方法摘录 |
|---|---|
| [BubbleProgressView](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/view/BubbleProgressView.smali) | `onDraw`、`onSizeChanged`、`setProgress`、`setProgressWithAnim` |
| [MenuItemView](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/view/MenuItemView.smali) | `getBinding`、`setContent` |

## com.zykj.huiwei.launcher.viewmodels

| 类 | 方法摘录 |
|---|---|
| [PasswordSecurityLevel](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel.smali) | `valueOf`、`values` |

## com.zykj.lib.error.code

| 类 | 方法摘录 |
|---|---|
| [ErrorCode](../../../android/中育管控桌面/smali_classes4/com/zykj/lib/error/code/ErrorCode.smali) | `valueOf`、`values`、`getErrorCodeInfo` |
| [ErrorCodeHandler](../../../android/中育管控桌面/smali_classes4/com/zykj/lib/error/code/ErrorCodeHandler.smali) | `getErrorCode` |
| [ErrorCodeInfo](../../../android/中育管控桌面/smali_classes4/com/zykj/lib/error/code/ErrorCodeInfo.smali) | `getCode`、`getDesc`、`getMessage`、`getMessageResId` |

## com.zykj.message.server

| 类 | 方法摘录 |
|---|---|
| [ClientManage](../../../android/中育管控桌面/smali_classes4/com/zykj/message/server/ClientManage.smali) | `valueOf`、`values` |
| [MessageManage](../../../android/中育管控桌面/smali_classes4/com/zykj/message/server/MessageManage.smali) | `valueOf`、`values` |
| [TransferActivity](../../../android/中育管控桌面/smali_classes4/com/zykj/message/server/TransferActivity.smali) | `onCreate`、`onDestroy` |

## com.zykj.message.server.bean

| 类 | 方法摘录 |
|---|---|
| [ServerInfo](../../../android/中育管控桌面/smali_classes4/com/zykj/message/server/bean/ServerInfo.smali) | `describeContents`、`writeToParcel` |
| [Status](../../../android/中育管控桌面/smali_classes4/com/zykj/message/server/bean/Status.smali) | `valueOf`、`values`、`describeContents`、`writeToParcel` |
| [UserInfo](../../../android/中育管控桌面/smali_classes4/com/zykj/message/server/bean/UserInfo.smali) | `describeContents`、`writeToParcel` |

## com.zykj.policy

| 类 | 方法摘录 |
|---|---|
| [DataBinderMapperImpl](../../../android/中育管控桌面/smali_classes4/com/zykj/policy/DataBinderMapperImpl.smali) | `collectDependencies`、`convertBrIdToString`、`getDataBinder`、`getDataBinder`、`getLayoutId` |

## com.zykj.policy.ui

| 类 | 方法摘录 |
|---|---|
| [PolicyCheckView](../../../android/中育管控桌面/smali_classes4/com/zykj/policy/ui/PolicyCheckView.smali) | `setData` |
| [PolicyDetailActivity](../../../android/中育管控桌面/smali_classes4/com/zykj/policy/ui/PolicyDetailActivity.smali) | `onCreate`、`onDestroy` |
| [PolicyDialogFragment](../../../android/中育管控桌面/smali_classes4/com/zykj/policy/ui/PolicyDialogFragment.smali) | `onCreateDialog`、`onCreateView`、`onViewCreated` |
