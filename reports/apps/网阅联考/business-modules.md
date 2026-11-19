# 网阅联考 业务代码导航

每个表格对应一个保留业务命名空间的包，方法来自 DEX 的类定义。点击类名可查看参与编译的实现。生成绑定、单字母类及第三方库另见完整包索引。

## com.zykj.base

| 类 | 方法摘录 |
|---|---|
| [BaseActivity](../../../android/网阅联考/smali_classes2/com/zykj/base/BaseActivity.smali) | `getMBindView`、`initData`、`initView`、`layoutId`、`onCreate`、`onSupportNavigateUp`、`setMBindView` |
| [BaseApplication](../../../android/网阅联考/smali_classes2/com/zykj/base/BaseApplication.smali) | `attachBaseContext`、`initAppKey`、`onCreate`、`onTerminate` |
| [BaseDialogFragment](../../../android/网阅联考/smali_classes2/com/zykj/base/BaseDialogFragment.smali) | `getMBindView`、`initData`、`initView`、`layoutId`、`onCreate`、`onCreateView`、`onViewCreated` |
| [BaseFragment](../../../android/网阅联考/smali_classes2/com/zykj/base/BaseFragment.smali) | `getMBindView`、`initData`、`initView`、`layoutId`、`onCreate`、`onCreateView`、`onViewCreated` |
| [BaseViewModel](../../../android/网阅联考/smali_classes2/com/zykj/base/BaseViewModel.smali) | `getToastLiveData`、`handlerThrowable`、`isDialogVisible`、`launch`、`launchAsync`、`launchAsyncData`、`launchData` |
| [DataBinderMapperImpl](../../../android/网阅联考/smali_classes2/com/zykj/base/DataBinderMapperImpl.smali) | `collectDependencies`、`convertBrIdToString`、`getDataBinder`、`getDataBinder`、`getLayoutId` |

## com.zykj.base.adapter

| 类 | 方法摘录 |
|---|---|
| [FragmentAdapter](../../../android/网阅联考/smali_classes2/com/zykj/base/adapter/FragmentAdapter.smali) | `getCount`、`getItem`、`getPageTitle` |

## com.zykj.base.bean

| 类 | 方法摘录 |
|---|---|
| [FragmentBean](../../../android/网阅联考/smali_classes2/com/zykj/base/bean/FragmentBean.smali) | `getFragment`、`getTitle` |

## com.zykj.base.bean.toast

| 类 | 方法摘录 |
|---|---|
| [ToastErrorCodeMessage](../../../android/网阅联考/smali_classes2/com/zykj/base/bean/toast/ToastErrorCodeMessage.smali) | `getErrorInfo` |
| [ToastErrorMessage](../../../android/网阅联考/smali_classes2/com/zykj/base/bean/toast/ToastErrorMessage.smali) | `getCode` |
| [ToastMessage](../../../android/网阅联考/smali_classes2/com/zykj/base/bean/toast/ToastMessage.smali) | `getMessage`、`getMessageResId`、`setMessage`、`setMessageResId` |

## com.zykj.base.event

| 类 | 方法摘录 |
|---|---|
| [SingleLiveEvent](../../../android/网阅联考/smali_classes2/com/zykj/base/event/SingleLiveEvent.smali) | `observe`、`setValue` |

## com.zykj.base.ext

| 类 | 方法摘录 |
|---|---|
| [BindingAdaptersKt](../../../android/网阅联考/smali_classes2/com/zykj/base/ext/BindingAdaptersKt.smali) | `netUrl`、`netUrlHeader`、`netUrlSnapshot`、`onClick`、`visibleOrGone` |
| [ContextExtKt](../../../android/网阅联考/smali_classes2/com/zykj/base/ext/ContextExtKt.smali) | `alarmManager`、`connectivityManager`、`density`、`getSharedPreferences`、`inflate`、`installPkg`、`isGranted` |

## com.zykj.base.utils

| 类 | 方法摘录 |
|---|---|
| [ActivityCollectionHelper](../../../android/网阅联考/smali_classes2/com/zykj/base/utils/ActivityCollectionHelper.smali) | `valueOf`、`values`、`exitApp`、`finishAll`、`register`、`topActivity`、`unRegister` |
| [ExceptionHandle](../../../android/网阅联考/smali_classes2/com/zykj/base/utils/ExceptionHandle.smali) | `caseRemoteCodeException`、`handleException` |
| [MD5Utils](../../../android/网阅联考/smali_classes2/com/zykj/base/utils/MD5Utils.smali) | `getMD5` |
| [XToastUtils](../../../android/网阅联考/smali_classes2/com/zykj/base/utils/XToastUtils.smali) | `error`、`error`、`error`、`error`、`error`、`success`、`success` |

## com.zykj.http

| 类 | 方法摘录 |
|---|---|
| [BaseUrlEnum](../../../android/网阅联考/smali_classes2/com/zykj/http/BaseUrlEnum.smali) | `valueOf`、`values`、`getUrl`、`setUrl` |

## com.zykj.http.bean

| 类 | 方法摘录 |
|---|---|
| [ApiResp](../../../android/网阅联考/smali_classes2/com/zykj/http/bean/ApiResp.smali) | `getError`、`getResult`、`getSuccess` |
| [CommonApiResp](../../../android/网阅联考/smali_classes2/com/zykj/http/bean/CommonApiResp.smali) | `getCode`、`getMessage`、`getResult` |
| [ErrorInfo](../../../android/网阅联考/smali_classes2/com/zykj/http/bean/ErrorInfo.smali) | `getCode`、`getDetails`、`getMessage` |
| [HeaderBean](../../../android/网阅联考/smali_classes2/com/zykj/http/bean/HeaderBean.smali) | `getAccessToken`、`getAppName`、`getRefreshToken`、`getServerUrl`、`getVersionCode` |
| [HeaderLiveData](../../../android/网阅联考/smali_classes2/com/zykj/http/bean/HeaderLiveData.smali) | `getLessonDeauthorized`、`getOfflineMode`、`getUnauthorized` |

## com.zykj.http.exception

| 类 | 方法摘录 |
|---|---|
| [RemoteCodeException](../../../android/网阅联考/smali_classes2/com/zykj/http/exception/RemoteCodeException.smali) | `getErrorCodeInfo`、`setErrorCodeInfo` |

## com.zykj.http.interceptor

| 类 | 方法摘录 |
|---|---|
| [CommonResponseInterceptor](../../../android/网阅联考/smali_classes2/com/zykj/http/interceptor/CommonResponseInterceptor.smali) | `parseJson`、`reBuildResponse`、`getHeaderLiveData`、`intercept`、`setHeaderLiveData` |
| [GzipInterceptor](../../../android/网阅联考/smali_classes2/com/zykj/http/interceptor/GzipInterceptor.smali) | `isGzipped`、`unzip`、`intercept` |
| [HeadInterceptor](../../../android/网阅联考/smali_classes2/com/zykj/http/interceptor/HeadInterceptor.smali) | `getHeaderLiveData`、`intercept`、`setHeaderLiveData` |
| [NetWorkResponseWithRefreshTokenInterceptor](../../../android/网阅联考/smali_classes2/com/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor.smali) | `parseJson`、`refreshTokenAndContinueRequest`、`getHeaderLiveData`、`getRefreshRepository`、`intercept`、`setHeaderLiveData`、`setRefreshRepository` |
| [NetworkInterceptor](../../../android/网阅联考/smali_classes2/com/zykj/http/interceptor/NetworkInterceptor.smali) | `getNetworkMonitor`、`getContext`、`intercept`、`setContext` |
| [OfflineModeInterceptor](../../../android/网阅联考/smali_classes2/com/zykj/http/interceptor/OfflineModeInterceptor.smali) | `getHeaderLiveData`、`intercept`、`setHeaderLiveData` |
| [ResponseInterceptor](../../../android/网阅联考/smali_classes2/com/zykj/http/interceptor/ResponseInterceptor.smali) | `parseJson`、`reBuildResponse`、`getHeaderLiveData`、`intercept`、`setHeaderLiveData` |
| [ResponseWithRefreshTokenInterceptor](../../../android/网阅联考/smali_classes2/com/zykj/http/interceptor/ResponseWithRefreshTokenInterceptor.smali) | `parseJson`、`reBuildResponse`、`refreshTokenAndContinueRequest`、`getHeaderLiveData`、`getRefreshRepository`、`intercept`、`setHeaderLiveData` |

## com.zykj.http.listener

| 类 | 方法摘录 |
|---|---|
| [UploadProgressListener](../../../android/网阅联考/smali_classes2/com/zykj/http/listener/UploadProgressListener.smali) | `onProgressUpdate` |

## com.zykj.http.progress

| 类 | 方法摘录 |
|---|---|
| [ProgressRequestBody](../../../android/网阅联考/smali_classes2/com/zykj/http/progress/ProgressRequestBody.smali) | `contentType`、`writeTo` |
| [ProgressRequestBodyKt](../../../android/网阅联考/smali_classes2/com/zykj/http/progress/ProgressRequestBodyKt.smali) | `asProgressRequestBody` |

## com.zykj.insight

| 类 | 方法摘录 |
|---|---|
| [App](../../../android/网阅联考/smali_classes2/com/zykj/insight/App.smali) | `onCreate`、`onTerminate` |

## com.zykj.insight.bean

| 类 | 方法摘录 |
|---|---|
| [GetAllSettingsResp](../../../android/网阅联考/smali_classes2/com/zykj/insight/bean/GetAllSettingsResp.smali) | `getDnOrder`、`setDnOrder` |
| [SettingSwitch](../../../android/网阅联考/smali_classes2/com/zykj/insight/bean/SettingSwitch.smali) | `valueOf`、`values` |

## com.zykj.insight.network

| 类 | 方法摘录 |
|---|---|
| [BaseResponse](../../../android/网阅联考/smali_classes2/com/zykj/insight/network/BaseResponse.smali) | `getError`、`getResult`、`getSuccess` |

## com.zykj.insight.ui

| 类 | 方法摘录 |
|---|---|
| [Hilt_MainActivity](../../../android/网阅联考/smali_classes2/com/zykj/insight/ui/Hilt_MainActivity.smali) | `getDefaultViewModelProviderFactory` |
| [MainActivity](../../../android/网阅联考/smali_classes2/com/zykj/insight/ui/MainActivity.smali) | `onCreate`、`onResume` |

## com.zykj.lib.error.code

| 类 | 方法摘录 |
|---|---|
| [ErrorCode](../../../android/网阅联考/smali_classes2/com/zykj/lib/error/code/ErrorCode.smali) | `valueOf`、`values`、`getErrorCodeInfo` |
| [ErrorCodeHandler](../../../android/网阅联考/smali_classes2/com/zykj/lib/error/code/ErrorCodeHandler.smali) | `getErrorCode` |
| [ErrorCodeInfo](../../../android/网阅联考/smali_classes2/com/zykj/lib/error/code/ErrorCodeInfo.smali) | `getCode`、`getDesc`、`getMessage`、`getMessageResId` |

## com.zykj.message

| 类 | 方法摘录 |
|---|---|
| [KillSelfService](../../../android/网阅联考/smali_classes2/com/zykj/message/KillSelfService.smali) | `onBind`、`onStartCommand` |
| [UnInstallActivity](../../../android/网阅联考/smali_classes2/com/zykj/message/UnInstallActivity.smali) | `onBackPressed`、`onCreate`、`onResume` |
| [UnLoginActivity](../../../android/网阅联考/smali_classes2/com/zykj/message/UnLoginActivity.smali) | `onActivityResult`、`onBackPressed`、`onCreate`、`onDestroy`、`onPause`、`onRestart`、`onResume` |

## com.zykj.message.client

| 类 | 方法摘录 |
|---|---|
| [MessageClient](../../../android/网阅联考/smali_classes2/com/zykj/message/client/MessageClient.smali) | `valueOf`、`values` |

## com.zykj.message.server.bean

| 类 | 方法摘录 |
|---|---|
| [ServerInfo](../../../android/网阅联考/smali_classes2/com/zykj/message/server/bean/ServerInfo.smali) | `describeContents`、`writeToParcel` |
| [Status](../../../android/网阅联考/smali_classes2/com/zykj/message/server/bean/Status.smali) | `valueOf`、`values`、`describeContents`、`writeToParcel` |
| [UserInfo](../../../android/网阅联考/smali_classes2/com/zykj/message/server/bean/UserInfo.smali) | `describeContents`、`writeToParcel` |

## com.zykj.sketch.permission

| 类 | 方法摘录 |
|---|---|
| [RxPermissionsFragment](../../../android/网阅联考/smali_classes2/com/zykj/sketch/permission/RxPermissionsFragment.smali) | `onCreate`、`onRequestPermissionsResult` |
