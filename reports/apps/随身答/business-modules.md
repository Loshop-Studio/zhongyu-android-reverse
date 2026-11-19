# 随身答 业务代码导航

每个表格对应一个保留业务命名空间的包，方法来自 DEX 的类定义。点击类名可查看参与编译的实现。生成绑定、单字母类及第三方库另见完整包索引。

## com.zykj.base

| 类 | 方法摘录 |
|---|---|
| [BaseActivity](../../../android/随身答/smali_classes4/com/zykj/base/BaseActivity.smali) | `getMBindView`、`initData`、`initView`、`layoutId`、`onCreate`、`onSupportNavigateUp`、`setMBindView` |
| [BaseApplication](../../../android/随身答/smali_classes4/com/zykj/base/BaseApplication.smali) | `attachBaseContext`、`initAppKey`、`onCreate`、`onTerminate` |
| [BaseDialogFragment](../../../android/随身答/smali_classes4/com/zykj/base/BaseDialogFragment.smali) | `getMBindView`、`initData`、`initView`、`layoutId`、`onCreate`、`onCreateView`、`onViewCreated` |
| [BaseFragment](../../../android/随身答/smali_classes4/com/zykj/base/BaseFragment.smali) | `getMBindView`、`initData`、`initView`、`layoutId`、`onCreate`、`onCreateView`、`onViewCreated` |
| [BaseViewModel](../../../android/随身答/smali_classes4/com/zykj/base/BaseViewModel.smali) | `getToastLiveData`、`handlerThrowable`、`isDialogVisible`、`launch`、`launchAsync`、`launchAsyncData`、`launchData` |
| [DataBinderMapperImpl](../../../android/随身答/smali_classes4/com/zykj/base/DataBinderMapperImpl.smali) | `collectDependencies`、`convertBrIdToString`、`getDataBinder`、`getDataBinder`、`getLayoutId` |

## com.zykj.base.adapter

| 类 | 方法摘录 |
|---|---|
| [FragmentAdapter](../../../android/随身答/smali_classes4/com/zykj/base/adapter/FragmentAdapter.smali) | `getCount`、`getItem`、`getPageTitle` |

## com.zykj.base.bean

| 类 | 方法摘录 |
|---|---|
| [FragmentBean](../../../android/随身答/smali_classes4/com/zykj/base/bean/FragmentBean.smali) | `getFragment`、`getTitle` |

## com.zykj.base.bean.toast

| 类 | 方法摘录 |
|---|---|
| [ToastErrorCodeMessage](../../../android/随身答/smali_classes4/com/zykj/base/bean/toast/ToastErrorCodeMessage.smali) | `getErrorInfo` |
| [ToastErrorMessage](../../../android/随身答/smali_classes4/com/zykj/base/bean/toast/ToastErrorMessage.smali) | `getCode` |
| [ToastMessage](../../../android/随身答/smali_classes4/com/zykj/base/bean/toast/ToastMessage.smali) | `getMessage`、`getMessageResId`、`setMessage`、`setMessageResId` |

## com.zykj.base.event

| 类 | 方法摘录 |
|---|---|
| [SingleLiveEvent](../../../android/随身答/smali_classes4/com/zykj/base/event/SingleLiveEvent.smali) | `observe`、`setValue` |

## com.zykj.base.ext

| 类 | 方法摘录 |
|---|---|
| [BindingAdaptersKt](../../../android/随身答/smali_classes4/com/zykj/base/ext/BindingAdaptersKt.smali) | `netUrl`、`netUrlHeader`、`netUrlSnapshot`、`onClick`、`visibleOrGone` |
| [ContextExtKt](../../../android/随身答/smali_classes4/com/zykj/base/ext/ContextExtKt.smali) | `alarmManager`、`connectivityManager`、`density`、`getSharedPreferences`、`inflate`、`installPkg`、`isGranted` |

## com.zykj.base.utils

| 类 | 方法摘录 |
|---|---|
| [ActivityCollectionHelper](../../../android/随身答/smali_classes4/com/zykj/base/utils/ActivityCollectionHelper.smali) | `valueOf`、`values`、`exitApp`、`finishAll`、`register`、`topActivity`、`unRegister` |
| [ExceptionHandle](../../../android/随身答/smali_classes4/com/zykj/base/utils/ExceptionHandle.smali) | `caseRemoteCodeException`、`handleException` |
| [MD5Utils](../../../android/随身答/smali_classes4/com/zykj/base/utils/MD5Utils.smali) | `getMD5` |
| [XToastUtils](../../../android/随身答/smali_classes4/com/zykj/base/utils/XToastUtils.smali) | `error`、`error`、`error`、`error`、`error`、`success`、`success` |

## com.zykj.blackboard.core.action

| 类 | 方法摘录 |
|---|---|
| [GeometryActionEnum](../../../android/随身答/smali_classes4/com/zykj/blackboard/core/action/GeometryActionEnum.smali) | `valueOf`、`values` |

## com.zykj.blackboard.core.canvas

| 类 | 方法摘录 |
|---|---|
| [SketchRecorderView](../../../android/随身答/smali_classes4/com/zykj/blackboard/core/canvas/SketchRecorderView.smali) | `onDetachedFromWindow`、`onTouchEvent` |

## com.zykj.blackboard.core.canvas.view

| 类 | 方法摘录 |
|---|---|
| [BackgroundView](../../../android/随身答/smali_classes4/com/zykj/blackboard/core/canvas/view/BackgroundView.smali) | `getBackgroundLineConfig`、`getMyBackgroundColor`、`onDraw`、`refresh`、`setBackgroundLineConfig`、`setMatrix`、`setMyBackgroundColor` |

## com.zykj.blackboard.core.data.dao

| 类 | 方法摘录 |
|---|---|
| [BackgroundLineTypeEnumConverter](../../../android/随身答/smali_classes4/com/zykj/blackboard/core/data/dao/BackgroundLineTypeEnumConverter.smali) | `convertToDatabaseValue`、`convertToDatabaseValue`、`convertToEntityProperty`、`convertToEntityProperty` |
| [CommandEnumConverter](../../../android/随身答/smali_classes4/com/zykj/blackboard/core/data/dao/CommandEnumConverter.smali) | `convertToDatabaseValue`、`convertToDatabaseValue`、`convertToEntityProperty`、`convertToEntityProperty` |

## com.zykj.blackboard.core.edit

| 类 | 方法摘录 |
|---|---|
| [BasePageControl](../../../android/随身答/smali_classes4/com/zykj/blackboard/core/edit/BasePageControl.smali) | `getFileName`、`onDelete`、`release` |
| [BoardControl](../../../android/随身答/smali_classes4/com/zykj/blackboard/core/edit/BoardControl.smali) | `getConfig` |
| [IBoardControl](../../../android/随身答/smali_classes4/com/zykj/blackboard/core/edit/IBoardControl.smali) | `getConfig` |
| [PageControl](../../../android/随身答/smali_classes4/com/zykj/blackboard/core/edit/PageControl.smali) | `areaMoveEnd`、`areaMoveStart`、`areaMoving`、`getBackgroundColor`、`getMoveHorizontalProgress`、`getMoveVerticalProgress`、`setAreaMoveListener` |

## com.zykj.blackboard.core.graph.group

| 类 | 方法摘录 |
|---|---|
| [GroupGraph](../../../android/随身答/smali_classes4/com/zykj/blackboard/core/graph/group/GroupGraph.smali) | `graphType`、`onDestroy` |
| [ImageGraph](../../../android/随身答/smali_classes4/com/zykj/blackboard/core/graph/group/ImageGraph.smali) | `graphType`、`onDestroy` |

## com.zykj.blackboard.core.graphBuilder

| 类 | 方法摘录 |
|---|---|
| [GraphBuildFactory](../../../android/随身答/smali_classes4/com/zykj/blackboard/core/graphBuilder/GraphBuildFactory.smali) | `valueOf`、`values` |

## com.zykj.blackboard.core.play

| 类 | 方法摘录 |
|---|---|
| [PlayPageControl](../../../android/随身答/smali_classes4/com/zykj/blackboard/core/play/PlayPageControl.smali) | `areaMoveEnd`、`areaMoveStart`、`areaMoving`、`getDuration`、`getMoveHorizontalProgress`、`getMoveMaxHeightTimes`、`getMoveMaxWidthTimes` |

## com.zykj.blackboard.enums

| 类 | 方法摘录 |
|---|---|
| [DocumentType](../../../android/随身答/smali_classes4/com/zykj/blackboard/enums/DocumentType.smali) | `valueOf`、`values` |
| [PlayStatus](../../../android/随身答/smali_classes4/com/zykj/blackboard/enums/PlayStatus.smali) | `valueOf`、`values` |
| [SelectGraphEnum](../../../android/随身答/smali_classes4/com/zykj/blackboard/enums/SelectGraphEnum.smali) | `valueOf`、`values` |
| [TextActionType](../../../android/随身答/smali_classes4/com/zykj/blackboard/enums/TextActionType.smali) | `valueOf`、`values` |
| [TranslationType](../../../android/随身答/smali_classes4/com/zykj/blackboard/enums/TranslationType.smali) | `valueOf`、`values` |

## com.zykj.blackboard.utils

| 类 | 方法摘录 |
|---|---|
| [EventKey](../../../android/随身答/smali_classes4/com/zykj/blackboard/utils/EventKey.smali) | `valueOf`、`values` |

## com.zykj.blackboard.widgets

| 类 | 方法摘录 |
|---|---|
| [TextDialog](../../../android/随身答/smali_classes4/com/zykj/blackboard/widgets/TextDialog.smali) | `onCreate`、`onKeyDown`、`onStart` |

## com.zykj.download

| 类 | 方法摘录 |
|---|---|
| [DataBinderMapperImpl](../../../android/随身答/smali_classes4/com/zykj/download/DataBinderMapperImpl.smali) | `collectDependencies`、`convertBrIdToString`、`getDataBinder`、`getDataBinder`、`getLayoutId` |
| [DownloadFlag](../../../android/随身答/smali_classes4/com/zykj/download/DownloadFlag.smali) | `valueOf`、`values` |
| [FileCheckDownloadResult](../../../android/随身答/smali_classes4/com/zykj/download/FileCheckDownloadResult.smali) | `getDownloadEntity`、`getResultType` |
| [FileCheckResultType](../../../android/随身答/smali_classes4/com/zykj/download/FileCheckResultType.smali) | `valueOf`、`values` |
| [FileCheckUploadResult](../../../android/随身答/smali_classes4/com/zykj/download/FileCheckUploadResult.smali) | `getLocalPath`、`getProgress`、`getResultType`、`getServerUrl`、`getUrl`、`getVerifyCode` |
| [OssToken](../../../android/随身答/smali_classes4/com/zykj/download/OssToken.smali) | `getAccessKeyId`、`getAccessKeySecret`、`getBucket`、`getEndpoint`、`getSecurityToken`、`getStrategy` |
| [OssUtils](../../../android/随身答/smali_classes4/com/zykj/download/OssUtils.smali) | `getCacheDir`、`checkDownloadDir`、`checkFileName`、`getObjectKey`、`getOssClient`、`getOssToken`、`isNetworkConnected` |
| [StrategyEnum](../../../android/随身答/smali_classes4/com/zykj/download/StrategyEnum.smali) | `valueOf`、`values` |
| [UploadResultType](../../../android/随身答/smali_classes4/com/zykj/download/UploadResultType.smali) | `valueOf`、`values` |

## com.zykj.download.api

| 类 | 方法摘录 |
|---|---|
| [DownLoadApi](../../../android/随身答/smali_classes4/com/zykj/download/api/DownLoadApi.smali) | `download` |
| [UploadApi](../../../android/随身答/smali_classes4/com/zykj/download/api/UploadApi.smali) | `gridFs` |

## com.zykj.download.data

| 类 | 方法摘录 |
|---|---|
| [AppDatabase_Impl](../../../android/随身答/smali_classes4/com/zykj/download/data/AppDatabase_Impl.smali) | `clearAllTables`、`createInvalidationTracker`、`createOpenHelper`、`getRequiredTypeConverters` |

## com.zykj.download.work

| 类 | 方法摘录 |
|---|---|
| [DownloadFileCommonWork](../../../android/随身答/smali_classes4/com/zykj/download/work/DownloadFileCommonWork.smali) | `checkContentLength`、`checkMD5`、`downloadFile`、`initParameter` |
| [DownloadFileWork](../../../android/随身答/smali_classes4/com/zykj/download/work/DownloadFileWork.smali) | `checkParam`、`downloadFileWithProgress`、`doWork`、`downloadFile`、`getAppDataBase`、`getDir`、`getDownloadUrl` |
| [DownloadFileWorkProxy](../../../android/随身答/smali_classes4/com/zykj/download/work/DownloadFileWorkProxy.smali) | `checkFileIntegrity`、`checkDownloadSuccess`、`checkRecord`、`updateDownloadSize`、`updateFlag`、`updateTotalSize`、`updateVerifyCode` |
| [DownloadOssFileWork](../../../android/随身答/smali_classes4/com/zykj/download/work/DownloadOssFileWork.smali) | `downloadFile`、`getOssToken`、`initParameter`、`setOssToken` |
| [UploadFileOssWork](../../../android/随身答/smali_classes4/com/zykj/download/work/UploadFileOssWork.smali) | `initParameter`、`uploadFile` |
| [UploadFileWork](../../../android/随身答/smali_classes4/com/zykj/download/work/UploadFileWork.smali) | `uploadFileWithProgress`、`doWork`、`getProgressLiveData`、`getReceiverLengthLiveData`、`initParameter`、`sendSpeedAndProgress`、`uploadFile` |

## com.zykj.http

| 类 | 方法摘录 |
|---|---|
| [BaseUrlEnum](../../../android/随身答/smali_classes4/com/zykj/http/BaseUrlEnum.smali) | `valueOf`、`values`、`getUrl`、`setUrl` |

## com.zykj.http.bean

| 类 | 方法摘录 |
|---|---|
| [ApiResp](../../../android/随身答/smali_classes4/com/zykj/http/bean/ApiResp.smali) | `getError`、`getResult`、`getSuccess` |
| [CommonApiResp](../../../android/随身答/smali_classes4/com/zykj/http/bean/CommonApiResp.smali) | `getCode`、`getMessage`、`getResult` |
| [ErrorInfo](../../../android/随身答/smali_classes4/com/zykj/http/bean/ErrorInfo.smali) | `getCode`、`getDetails`、`getMessage` |
| [HeaderBean](../../../android/随身答/smali_classes4/com/zykj/http/bean/HeaderBean.smali) | `getAccessToken`、`getAppName`、`getRefreshToken`、`getServerUrl`、`getVersionCode` |
| [HeaderLiveData](../../../android/随身答/smali_classes4/com/zykj/http/bean/HeaderLiveData.smali) | `getLessonDeauthorized`、`getOfflineMode`、`getUnauthorized` |

## com.zykj.http.exception

| 类 | 方法摘录 |
|---|---|
| [RemoteCodeException](../../../android/随身答/smali_classes4/com/zykj/http/exception/RemoteCodeException.smali) | `getErrorCodeInfo`、`setErrorCodeInfo` |

## com.zykj.http.interceptor

| 类 | 方法摘录 |
|---|---|
| [CommonResponseInterceptor](../../../android/随身答/smali_classes4/com/zykj/http/interceptor/CommonResponseInterceptor.smali) | `parseJson`、`reBuildResponse`、`getHeaderLiveData`、`intercept`、`setHeaderLiveData` |
| [GzipInterceptor](../../../android/随身答/smali_classes4/com/zykj/http/interceptor/GzipInterceptor.smali) | `isGzipped`、`unzip`、`intercept` |
| [HeadInterceptor](../../../android/随身答/smali_classes4/com/zykj/http/interceptor/HeadInterceptor.smali) | `getHeaderLiveData`、`intercept`、`setHeaderLiveData` |
| [NetWorkResponseWithRefreshTokenInterceptor](../../../android/随身答/smali_classes4/com/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor.smali) | `parseJson`、`refreshTokenAndContinueRequest`、`getHeaderLiveData`、`getRefreshRepository`、`intercept`、`setHeaderLiveData`、`setRefreshRepository` |
| [NetworkInterceptor](../../../android/随身答/smali_classes4/com/zykj/http/interceptor/NetworkInterceptor.smali) | `getNetworkMonitor`、`getContext`、`intercept`、`setContext` |
| [OfflineModeInterceptor](../../../android/随身答/smali_classes4/com/zykj/http/interceptor/OfflineModeInterceptor.smali) | `getHeaderLiveData`、`intercept`、`setHeaderLiveData` |
| [ResponseInterceptor](../../../android/随身答/smali_classes4/com/zykj/http/interceptor/ResponseInterceptor.smali) | `parseJson`、`reBuildResponse`、`getHeaderLiveData`、`intercept`、`setHeaderLiveData` |
| [ResponseWithRefreshTokenInterceptor](../../../android/随身答/smali_classes4/com/zykj/http/interceptor/ResponseWithRefreshTokenInterceptor.smali) | `parseJson`、`reBuildResponse`、`refreshTokenAndContinueRequest`、`getHeaderLiveData`、`getRefreshRepository`、`intercept`、`setHeaderLiveData` |

## com.zykj.http.listener

| 类 | 方法摘录 |
|---|---|
| [UploadProgressListener](../../../android/随身答/smali_classes4/com/zykj/http/listener/UploadProgressListener.smali) | `onProgressUpdate` |

## com.zykj.http.progress

| 类 | 方法摘录 |
|---|---|
| [ProgressRequestBody](../../../android/随身答/smali_classes4/com/zykj/http/progress/ProgressRequestBody.smali) | `contentType`、`writeTo` |
| [ProgressRequestBodyKt](../../../android/随身答/smali_classes4/com/zykj/http/progress/ProgressRequestBodyKt.smali) | `asProgressRequestBody` |

## com.zykj.lib.error.code

| 类 | 方法摘录 |
|---|---|
| [ErrorCode](../../../android/随身答/smali_classes4/com/zykj/lib/error/code/ErrorCode.smali) | `valueOf`、`values`、`getErrorCodeInfo` |
| [ErrorCodeHandler](../../../android/随身答/smali_classes4/com/zykj/lib/error/code/ErrorCodeHandler.smali) | `getErrorCode` |
| [ErrorCodeInfo](../../../android/随身答/smali_classes4/com/zykj/lib/error/code/ErrorCodeInfo.smali) | `getCode`、`getDesc`、`getMessage`、`getMessageResId` |

## com.zykj.merge.sketch.config

| 类 | 方法摘录 |
|---|---|
| [RecorderConfig](../../../android/随身答/smali_classes4/com/zykj/merge/sketch/config/RecorderConfig.smali) | `getMaxImageCount`、`getPaintColor`、`getPaintWidth`、`getShapeType`、`getSourcePath`、`isRecord`、`isTouchable` |

## com.zykj.merge.sketch.constant

| 类 | 方法摘录 |
|---|---|
| [PlayStatus](../../../android/随身答/smali_classes4/com/zykj/merge/sketch/constant/PlayStatus.smali) | `valueOf`、`values`、`getState`、`getStateName`、`setState`、`setStateName` |

## com.zykj.merge.sketch.listener

| 类 | 方法摘录 |
|---|---|
| [MoveProxy](../../../android/随身答/smali_classes4/com/zykj/merge/sketch/listener/MoveProxy.smali) | `areaMoveEnd`、`areaMoveStart`、`areaMoving`、`getCurrentScreenBitmap`、`getMoveHorizontalProgress`、`getMoveMaxHeightTimes`、`getMoveMaxWidthTimes` |
| [Play](../../../android/随身答/smali_classes4/com/zykj/merge/sketch/listener/Play.smali) | `addPlayActionListener`、`destroy`、`getPath`、`isRend`、`loadData`、`pause`、`release` |
| [PlayStatusListener](../../../android/随身答/smali_classes4/com/zykj/merge/sketch/listener/PlayStatusListener.smali) | `onPlayEnd`、`onPlayPause`、`onPlayStart`、`onPlayWait`、`onProgress` |

## com.zykj.merge.sketch.view

| 类 | 方法摘录 |
|---|---|
| [BlackBoardProxyView](../../../android/随身答/smali_classes4/com/zykj/merge/sketch/view/BlackBoardProxyView.smali) | `runAtLeastCreated`、`addPlayActionListener`、`areaMoveEnd`、`areaMoveStart`、`areaMoving`、`destroy`、`getCurrentScreenBitmap` |
| [MergeSketchPlayView](../../../android/随身答/smali_classes4/com/zykj/merge/sketch/view/MergeSketchPlayView.smali) | `addPlayActionListener`、`areaMoveEnd`、`areaMoveStart`、`areaMoving`、`destroy`、`getMoveHorizontalProgress`、`getMoveMaxHeightTimes` |
| [NewSketchProxyView](../../../android/随身答/smali_classes4/com/zykj/merge/sketch/view/NewSketchProxyView.smali) | `addPlayActionListener`、`destroy`、`getPath`、`isRend`、`loadData`、`pause`、`release` |
| [OldSketchProxyView](../../../android/随身答/smali_classes4/com/zykj/merge/sketch/view/OldSketchProxyView.smali) | `getLoadDataExecutor`、`getSeekExecutor`、`runAtLeastCreated`、`runOnMainThread`、`addPlayActionListener`、`destroy`、`getPath` |

## com.zykj.message

| 类 | 方法摘录 |
|---|---|
| [KillSelfService](../../../android/随身答/smali_classes4/com/zykj/message/KillSelfService.smali) | `onBind`、`onStartCommand` |
| [UnInstallActivity](../../../android/随身答/smali_classes4/com/zykj/message/UnInstallActivity.smali) | `onBackPressed`、`onCreate`、`onResume` |
| [UnLoginActivity](../../../android/随身答/smali_classes4/com/zykj/message/UnLoginActivity.smali) | `onActivityResult`、`onBackPressed`、`onCreate`、`onDestroy`、`onPause`、`onRestart`、`onResume` |

## com.zykj.message.client

| 类 | 方法摘录 |
|---|---|
| [MessageClient](../../../android/随身答/smali_classes4/com/zykj/message/client/MessageClient.smali) | `valueOf`、`values` |

## com.zykj.message.server.bean

| 类 | 方法摘录 |
|---|---|
| [ServerInfo](../../../android/随身答/smali_classes4/com/zykj/message/server/bean/ServerInfo.smali) | `describeContents`、`writeToParcel` |
| [Status](../../../android/随身答/smali_classes4/com/zykj/message/server/bean/Status.smali) | `valueOf`、`values`、`describeContents`、`writeToParcel` |
| [UserInfo](../../../android/随身答/smali_classes4/com/zykj/message/server/bean/UserInfo.smali) | `describeContents`、`writeToParcel` |

## com.zykj.paint

| 类 | 方法摘录 |
|---|---|
| [Actions](../../../android/随身答/smali/com/zykj/paint/Actions.smali) | `getDescriptor`、`registerAllExtensions`、`registerAllExtensions` |
| [SketchSyncView](../../../android/随身答/smali/com/zykj/paint/SketchSyncView.smali) | `ezyColor`、`handleEvent`、`handleMultiFingerEvent`、`addAction`、`addMatrixAction`、`addPenTempPolylinePoint`、`addSketchAction` |

## com.zykj.paint.data

| 类 | 方法摘录 |
|---|---|
| [Rect2D](../../../android/随身答/smali/com/zykj/paint/data/Rect2D.smali) | `nestPoint`、`nestRect`、`scaleRect`、`ToRectF`、`getHeight`、`getMiddle`、`getWidth` |

## com.zykj.paint.draw

| 类 | 方法摘录 |
|---|---|
| [ISketchDraw](../../../android/随身答/smali/com/zykj/paint/draw/ISketchDraw.smali) | `cleanAll`、`hasDraw`、`touchDown`、`touchMove`、`touchUp` |
| [PolylineDrawer](../../../android/随身答/smali/com/zykj/paint/draw/PolylineDrawer.smali) | `cleanAll`、`hasDraw`、`touchDown`、`touchMove`、`touchUp` |

## com.zykj.paint.extensions

| 类 | 方法摘录 |
|---|---|
| [GraphExtKt](../../../android/随身答/smali/com/zykj/paint/extensions/GraphExtKt.smali) | `inverts`、`mapPoint`、`mapPoint`、`mapPoint` |

## com.zykj.paint.graphic

| 类 | 方法摘录 |
|---|---|
| [Graph](../../../android/随身答/smali/com/zykj/paint/graphic/Graph.smali) | `addGraph`、`directRender`、`getBaseColor`、`getBoundBox`、`getGraphs`、`getName`、`isVisable` |
| [Layer](../../../android/随身答/smali/com/zykj/paint/graphic/Layer.smali) | `directRender`、`findGraph`、`getBoundBox`、`render`、`render` |
| [Map](../../../android/随身答/smali/com/zykj/paint/graphic/Map.smali) | `addLayer`、`directRender`、`getBoundBox`、`getCurrentLayer`、`render`、`render`、`reset` |
| [PolyLine](../../../android/随身答/smali/com/zykj/paint/graphic/PolyLine.smali) | `directRender`、`directRender`、`getBoundBox`、`render`、`render` |
| [RectBmp](../../../android/随身答/smali/com/zykj/paint/graphic/RectBmp.smali) | `directRender`、`getBoundBox`、`release`、`render`、`render`、`setDstVector`、`setFilePath` |

## com.zykj.paint.player

| 类 | 方法摘录 |
|---|---|
| [PlayActionListener](../../../android/随身答/smali/com/zykj/paint/player/PlayActionListener.smali) | `onPause`、`onPlayEnd`、`onRerecord`、`onResume` |
| [PlayStatusListener](../../../android/随身答/smali/com/zykj/paint/player/PlayStatusListener.smali) | `onPlayEnd`、`onPlayPause`、`onPlayStart`、`onUpdate` |

## com.zykj.paint.record

| 类 | 方法摘录 |
|---|---|
| [AESUtils](../../../android/随身答/smali/com/zykj/paint/record/AESUtils.smali) | `Decrypt`、`Encrypt`、`decrypt`、`decryptVoice`、`encrypt`、`encryptVoice`、`getRawKey` |
| [AmrEncoder](../../../android/随身答/smali/com/zykj/paint/record/AmrEncoder.smali) | `encode` |
| [AudioEncoder](../../../android/随身答/smali/com/zykj/paint/record/AudioEncoder.smali) | `encode`、`getDestFile`、`getMediaFormat` |
| [AudioFileUtils](../../../android/随身答/smali/com/zykj/paint/record/AudioFileUtils.smali) | `clearPcmFiles`、`deleteDir`、`deleteDirWithFile`、`getAmrFileAbsolutePath`、`getAmrFiles`、`getPcmFileAbsolutePath`、`getPcmFiles` |
| [AudioRecorder](../../../android/随身答/smali/com/zykj/paint/record/AudioRecorder.smali) | `getInstance`、`makePCMFile2Amr`、`makePCMFileToWAVFile`、`mergePCMFilesToWAVFile`、`writeDataTOFile`、`canel`、`clearTempRecord` |
| [PcmToWav](../../../android/随身答/smali/com/zykj/paint/record/PcmToWav.smali) | `clearFiles`、`makePCMFileToWAVFile`、`mergePCMFilesToWAVFile`、`wavFileHeader` |
| [RecordListener](../../../android/随身答/smali/com/zykj/paint/record/RecordListener.smali) | `recordPause`、`recordResume` |
| [RecordStreamListener](../../../android/随身答/smali/com/zykj/paint/record/RecordStreamListener.smali) | `recordOfByte` |
| [WaveHeader](../../../android/随身答/smali/com/zykj/paint/record/WaveHeader.smali) | `WriteChar`、`WriteInt`、`WriteShort`、`getHeader` |

## com.zykj.paint.record.control

| 类 | 方法摘录 |
|---|---|
| [BaseControl](../../../android/随身答/smali/com/zykj/paint/record/control/BaseControl.smali) | `getBitmapPoints`、`getBitmapPoints`、`getDistance`、`getDistance`、`getRotation`、`getRotation`、`midPoint` |
| [CompassesControl](../../../android/随身答/smali/com/zykj/paint/record/control/CompassesControl.smali) | `circleCheck`、`isTouchInGraph`、`pointCheck`、`cleanAll`、`getGraphSnapShot`、`hasDraw`、`touchDown` |
| [DefaultControl](../../../android/随身答/smali/com/zykj/paint/record/control/DefaultControl.smali) | `cleanAll`、`getGraphSnapShot`、`hasDraw`、`touchDown`、`touchMove`、`touchPointerDown`、`touchPointerUp` |
| [EraserControl](../../../android/随身答/smali/com/zykj/paint/record/control/EraserControl.smali) | `cleanAll`、`getGraphSnapShot`、`hasDraw`、`touchDown`、`touchMove`、`touchPointerDown`、`touchPointerUp` |
| [ISketchControl](../../../android/随身答/smali/com/zykj/paint/record/control/ISketchControl.smali) | `cleanAll`、`getGraphSnapShot`、`hasDraw`、`touchDown`、`touchMove`、`touchPointerDown`、`touchPointerUp` |
| [MapControl](../../../android/随身答/smali/com/zykj/paint/record/control/MapControl.smali) | `cleanAll`、`getGraphSnapShot`、`hasDraw`、`tempDraw`、`touchDown`、`touchMove`、`touchPointerDown` |
| [PenControl](../../../android/随身答/smali/com/zykj/paint/record/control/PenControl.smali) | `cleanAll`、`getGraphSnapShot`、`hasDraw`、`touchDown`、`touchMove`、`touchPointerDown`、`touchPointerUp` |
| [PictureControl](../../../android/随身答/smali/com/zykj/paint/record/control/PictureControl.smali) | `circleCheck`、`getActionMode`、`isTouchInGraph`、`pointCheck`、`cleanAll`、`getGraphSnapShot`、`hasDraw` |
| [RulerControl](../../../android/随身答/smali/com/zykj/paint/record/control/RulerControl.smali) | `cleanAll`、`getGraphSnapShot`、`hasDraw`、`touchDown`、`touchMove`、`touchPointerDown`、`touchPointerUp` |

## com.zykj.paint.record.model

| 类 | 方法摘录 |
|---|---|
| [CompassSnapShot](../../../android/随身答/smali/com/zykj/paint/record/model/CompassSnapShot.smali) | `calculateRadius`、`getCompassMode`、`onGraphChange`、`setCenterPoint`、`setDownMatrix`、`updateGraph` |
| [GraphSnapShot](../../../android/随身答/smali/com/zykj/paint/record/model/GraphSnapShot.smali) | `calculateDegree`、`calculateDegree`、`delByLines`、`exactCalculateDegree`、`exactCalculateDegree`、`getActionMode`、`getPointsLength` |
| [MapSnapShot](../../../android/随身答/smali/com/zykj/paint/record/model/MapSnapShot.smali) | `randomColor`、`updateSketchSnapshot`、`addStickyEzyPath`、`clear`、`delByLines`、`getBitmapPoints`、`setSelect` |
| [PictureSnapShot](../../../android/随身答/smali/com/zykj/paint/record/model/PictureSnapShot.smali) | `randomColor`、`updateSketchSnapshot`、`updateSketchWithLocalProtobufData`、`addStickyEzyPath`、`delByLines`、`getBitmapPoints`、`setSelect` |
| [RulerSnapShot](../../../android/随身答/smali/com/zykj/paint/record/model/RulerSnapShot.smali) | `isInDrawGraphRect`、`setDownScale`、`setScaleMatrix` |

## com.zykj.paint.render

| 类 | 方法摘录 |
|---|---|
| [MapRender](../../../android/随身答/smali_classes2/com/zykj/paint/render/MapRender.smali) | `clear`、`directDrawBitmap`、`directDrawPolyLine`、`drawBezierLine`、`drawBitmap`、`drawBitmap`、`drawPolyLine` |
| [MapViewer](../../../android/随身答/smali_classes2/com/zykj/paint/render/MapViewer.smali) | `GeoRect2ViewRect`、`clear`、`destroy`、`directRenderAll`、`geoVector2ViewVector`、`geoVector2ViewVector`、`moveViewPort` |
| [SketchPlayer](../../../android/随身答/smali_classes2/com/zykj/paint/render/SketchPlayer.smali) | `getTotalTime`、`playMusic`、`playWithLocalSource`、`destroyPlayer`、`getSnapshot`、`hideSeekBar`、`pausePlayer` |
| [SketchRender](../../../android/随身答/smali_classes2/com/zykj/paint/render/SketchRender.smali) | `clear`、`directDrawBitmap`、`directDrawPolyLine`、`drawBezierLine`、`drawBitmap`、`drawBitmap`、`drawPolyLine` |
| [SketchViewer](../../../android/随身答/smali_classes2/com/zykj/paint/render/SketchViewer.smali) | `getScaleMatrix`、`getTotalTime`、`playMusic`、`renderTemp`、`getCapture`、`getTotalTime`、`isEnded` |

## com.zykj.paint.runner

| 类 | 方法摘录 |
|---|---|
| [ActionProcessor](../../../android/随身答/smali_classes2/com/zykj/paint/runner/ActionProcessor.smali) | `addAction`、`addMultiAction`、`destroy`、`pause`、`renderAction`、`renderHistory`、`renderImage` |
| [ActionRunner](../../../android/随身答/smali_classes2/com/zykj/paint/runner/ActionRunner.smali) | `pause`、`resume` |
| [ImageActionRunner](../../../android/随身答/smali_classes2/com/zykj/paint/runner/ImageActionRunner.smali) | `getSourceUrl`、`pause`、`resume`、`setSourceUrl` |
| [LayerActionRunner](../../../android/随身答/smali_classes2/com/zykj/paint/runner/LayerActionRunner.smali) | `pause`、`resume` |
| [MatrixActionRunner](../../../android/随身答/smali_classes2/com/zykj/paint/runner/MatrixActionRunner.smali) | `pause`、`resume` |
| [MoveActionRunner](../../../android/随身答/smali_classes2/com/zykj/paint/runner/MoveActionRunner.smali) | `pause`、`resume` |
| [PolylineActionRunner](../../../android/随身答/smali_classes2/com/zykj/paint/runner/PolylineActionRunner.smali) | `processPreActions`、`getTaskScheduledExecutorService`、`isImmediate`、`pause`、`resume`、`setImmediate`、`setTaskScheduledExecutorService` |
| [ZoomActionRunner](../../../android/随身答/smali_classes2/com/zykj/paint/runner/ZoomActionRunner.smali) | `pause`、`resume` |

## com.zykj.paint.util

| 类 | 方法摘录 |
|---|---|
| [LineUtils](../../../android/随身答/smali_classes2/com/zykj/paint/util/LineUtils.smali) | `lineSpace`、`point2Line`、`point2Polyline`、`pointToLine` |
| [TimeUtils](../../../android/随身答/smali_classes2/com/zykj/paint/util/TimeUtils.smali) | `formatPhotoDate`、`formatPhotoDate`、`formatTime`、`getNowTimeString`、`timeFormat` |

## com.zykj.sketch

| 类 | 方法摘录 |
|---|---|
| [EzyDrawBoard](../../../android/随身答/smali_classes5/com/zykj/sketch/EzyDrawBoard.smali) | `getDescriptor`、`registerAllExtensions`、`registerAllExtensions` |
| [GraphSnapshot](../../../android/随身答/smali_classes5/com/zykj/sketch/GraphSnapshot.smali) | `getDescriptor`、`registerAllExtensions`、`registerAllExtensions` |
| [SketchHeader](../../../android/随身答/smali_classes5/com/zykj/sketch/SketchHeader.smali) | `getDescriptor`、`registerAllExtensions`、`registerAllExtensions` |

## com.zykj.sketch.core

| 类 | 方法摘录 |
|---|---|
| [ActionExecute](../../../android/随身答/smali_classes5/com/zykj/sketch/core/ActionExecute.smali) | `addNewGraph`、`buildHistoryGraph`、`setAttribute`、`setAttribute2`、`addViewControl`、`buildGraph`、`buildMatrix` |
| [ActionRecord](../../../android/随身答/smali_classes5/com/zykj/sketch/core/ActionRecord.smali) | `buildActionContent`、`buildHistoryRendData`、`notifyListener`、`addActionChangeListener`、`addHistoryRecord`、`addHistoryRenderGraphSnapshot`、`addNextPrevListener` |
| [ActionRecordExecute](../../../android/随身答/smali_classes5/com/zykj/sketch/core/ActionRecordExecute.smali) | `addRecord`、`onActionModeEvent`、`onAddImageEvent`、`onAddPPTEvent`、`onAudioStartRecord`、`onAudioStopRecord`、`onClearBoardEvent` |
| [ActionStrategyFactory](../../../android/随身答/smali_classes5/com/zykj/sketch/core/ActionStrategyFactory.smali) | `getActionGraphName`、`getGraphName`、`buildActionMode`、`clearAction`、`create`、`getAction`、`parseActionMode` |
| [GraphControl](../../../android/随身答/smali_classes5/com/zykj/sketch/core/GraphControl.smali) | `handleDeleteListener`、`initGraphConfig`、`clear`、`clearTempPaint`、`findGraph`、`findSelectGraph`、`forceRender` |

## com.zykj.sketch.core.action

| 类 | 方法摘录 |
|---|---|
| [BaseAction](../../../android/随身答/smali_classes5/com/zykj/sketch/core/action/BaseAction.smali) | `getTouchEventList`、`getTouchStartTime`、`isRecord`、`isTouchEnable`、`onTouchDown`、`onTouchMove`、`onTouchPointerDown` |
| [EraseViewAction](../../../android/随身答/smali_classes5/com/zykj/sketch/core/action/EraseViewAction.smali) | `deleteGraph`、`handleListener`、`enumType`、`onTouchDown` |
| [EraseWritingAction](../../../android/随身答/smali_classes5/com/zykj/sketch/core/action/EraseWritingAction.smali) | `deleteGraph`、`enumType`、`onTouchDown`、`onTouchMove`、`onTouchPointerDown`、`onTouchPointerUp`、`onTouchUp` |
| [SelectAction](../../../android/随身答/smali_classes5/com/zykj/sketch/core/action/SelectAction.smali) | `initTempValue`、`enumType`、`getMode`、`onTouchDown`、`onTouchMove`、`onTouchPointerDown`、`onTouchPointerUp` |
| [WritingAction](../../../android/随身答/smali_classes5/com/zykj/sketch/core/action/WritingAction.smali) | `createGraph`、`enumType`、`getGraph`、`getMX`、`getMY`、`getParentGraphName`、`getPath` |
| [WritingAndMoveAction](../../../android/随身答/smali_classes5/com/zykj/sketch/core/action/WritingAndMoveAction.smali) | `initTempValue`、`enumType`、`getGraph`、`getMX`、`getMY`、`getParentGraphName`、`getPath` |
| [WritingAndMoveVerticalAction](../../../android/随身答/smali_classes5/com/zykj/sketch/core/action/WritingAndMoveVerticalAction.smali) | `initTempValue`、`enumType`、`getGraph`、`getMX`、`getMY`、`getParentGraphName`、`getPath` |

## com.zykj.sketch.core.config

| 类 | 方法摘录 |
|---|---|
| [GraphConfig](../../../android/随身答/smali_classes5/com/zykj/sketch/core/config/GraphConfig.smali) | `getColor`、`getWidth`、`setColor`、`setWidth` |
| [SketchConfig](../../../android/随身答/smali_classes5/com/zykj/sketch/core/config/SketchConfig.smali) | `getContext`、`getMaxImageCount`、`getMaxPPTCount`、`getSourcePath`、`isTouchable`、`setMaxImageCount`、`setMaxPPTCount` |

## com.zykj.sketch.core.data

| 类 | 方法摘录 |
|---|---|
| [AudioTask](../../../android/随身答/smali_classes5/com/zykj/sketch/core/data/AudioTask.smali) | `getDuration`、`getFileName`、`getPath`、`getStartTime`、`setDuration`、`setPath` |
| [CORNER](../../../android/随身答/smali_classes5/com/zykj/sketch/core/data/CORNER.smali) | `valueOf`、`values` |
| [GraphTask](../../../android/随身答/smali_classes5/com/zykj/sketch/core/data/GraphTask.smali) | `getActionContent`、`getExecuteVoid`、`getHasSnapshot`、`getSnapshotVoid`、`getStartTime` |
| [Mode](../../../android/随身答/smali_classes5/com/zykj/sketch/core/data/Mode.smali) | `valueOf`、`values` |
| [PlayStatus](../../../android/随身答/smali_classes5/com/zykj/sketch/core/data/PlayStatus.smali) | `valueOf`、`values`、`getState`、`getStateName`、`setState`、`setStateName` |
| [RenderTask](../../../android/随身答/smali_classes5/com/zykj/sketch/core/data/RenderTask.smali) | `getAudioTaskList`、`getGraphTask`、`getLastSnapshot`、`getProgress`、`setLastSnapshot`、`setProgress` |
| [ThumbnailBean](../../../android/随身答/smali_classes5/com/zykj/sketch/core/data/ThumbnailBean.smali) | `getBitmap`、`getLimitRenderRectF`、`getMaxRenderRectF` |

## com.zykj.sketch.core.graph

| 类 | 方法摘录 |
|---|---|
| [BoundedContainerGraph](../../../android/随身答/smali_classes5/com/zykj/sketch/core/graph/BoundedContainerGraph.smali) | `getSnapshot`、`graphType`、`onMeasure` |
| [CircleGraph](../../../android/随身答/smali_classes5/com/zykj/sketch/core/graph/CircleGraph.smali) | `onMeasure`、`render` |
| [Graph](../../../android/随身答/smali_classes5/com/zykj/sketch/core/graph/Graph.smali) | `drawBorder`、`showDelete`、`addGraph`、`cancelSelected`、`childTypeNumber`、`clear`、`findGraph` |
| [GraphExtKt](../../../android/随身答/smali_classes5/com/zykj/sketch/core/graph/GraphExtKt.smali) | `convert2FM`、`convert2WM`、`getFP2WPMatrix`、`getFP2WPRendMatrix`、`getWP2FPMatrix`、`getWP2LPMatrix`、`initPaint` |
| [ImageGraph](../../../android/随身答/smali_classes5/com/zykj/sketch/core/graph/ImageGraph.smali) | `getTranslateCenterMatrix`、`reloadBitmap`、`checkOldData`、`getFileName`、`getSnapshot`、`graphType`、`onMeasure` |
| [ImageHistoryGraph](../../../android/随身答/smali_classes5/com/zykj/sketch/core/graph/ImageHistoryGraph.smali) | `getSaleCenterMatrix`、`getFileName`、`getSnapshot`、`graphType`、`onDestroy`、`onDraw`、`onMeasure` |
| [RectGraph](../../../android/随身答/smali_classes5/com/zykj/sketch/core/graph/RectGraph.smali) | `onMeasure`、`render` |
| [StrokeGraph](../../../android/随身答/smali_classes5/com/zykj/sketch/core/graph/StrokeGraph.smali) | `isIntersect`、`addFPPoint`、`addPoint`、`addPoint`、`findGraph`、`getActionControl`、`getSnapshot` |
| [UnBoundedContainerGraph](../../../android/随身答/smali_classes5/com/zykj/sketch/core/graph/UnBoundedContainerGraph.smali) | `getSnapshot`、`graphType`、`isInRect`、`onMeasure` |
| [ViewGraph](../../../android/随身答/smali_classes5/com/zykj/sketch/core/graph/ViewGraph.smali) | `compressImage` |
| [WebViewGraph](../../../android/随身答/smali_classes5/com/zykj/sketch/core/graph/WebViewGraph.smali) | `getSaleCenterMatrix`、`startRefresh`、`getBitmap`、`getCompressbitmap`、`getSnapshot`、`graphType`、`onDestroy` |
| [WritingGroupGraph](../../../android/随身答/smali_classes5/com/zykj/sketch/core/graph/WritingGroupGraph.smali) | `addGraph`、`createPath`、`crossLine`、`getIntersectGraph`、`getIntersectGraph`、`getSnapshot`、`graphType` |

## com.zykj.sketch.core.listener

| 类 | 方法摘录 |
|---|---|
| [ActionChangeListener](../../../android/随身答/smali_classes5/com/zykj/sketch/core/listener/ActionChangeListener.smali) | `change` |
| [AudioOperation](../../../android/随身答/smali_classes5/com/zykj/sketch/core/listener/AudioOperation.smali) | `isRecord`、`setProgressListener`、`startRecord`、`stopRecord` |
| [EventListener](../../../android/随身答/smali_classes5/com/zykj/sketch/core/listener/EventListener.smali) | `addViewControl`、`graphSnapShot`、`graphSnapShot`、`initConfig`、`onActionModeEvent`、`onAddImageEvent`、`onAddPPTEvent` |
| [GraphMatrixListener](../../../android/随身答/smali_classes5/com/zykj/sketch/core/listener/GraphMatrixListener.smali) | `onScale`、`onTranslation` |
| [IAction](../../../android/随身答/smali_classes5/com/zykj/sketch/core/listener/IAction.smali) | `enumType`、`getTouchEventList`、`getTouchStartTime`、`isRecord`、`onTouchDown`、`onTouchMove`、`onTouchPointerDown` |
| [IControl](../../../android/随身答/smali_classes5/com/zykj/sketch/core/listener/IControl.smali) | `clear`、`clearTempPaint`、`findGraph`、`findSelectGraph`、`forceRender`、`getBackgroundColor`、`getCameraMatrix` |
| [IDraw](../../../android/随身答/smali_classes5/com/zykj/sketch/core/listener/IDraw.smali) | `onDraw`、`onDrawComplete`、`render` |
| [IGraph](../../../android/随身答/smali_classes5/com/zykj/sketch/core/listener/IGraph.smali) | `findGraphByName`、`findGraphByType`、`getGraphName`、`getSnapshot`、`graphType`、`isComplete`、`isInRect` |
| [IUserPlay](../../../android/随身答/smali_classes5/com/zykj/sketch/core/listener/IUserPlay.smali) | `addPlayActionListener`、`destroy`、`getPlayStatus`、`loadData`、`pause`、`removePlayActionListener`、`seekTo` |
| [ImageDeleteListener](../../../android/随身答/smali_classes5/com/zykj/sketch/core/listener/ImageDeleteListener.smali) | `onDeleteImagePath` |
| [ImitateDraw](../../../android/随身答/smali_classes5/com/zykj/sketch/core/listener/ImitateDraw.smali) | `clearGraph`、`drawPath`、`drawThumbnail`、`graphMatrix`、`setLimitDrawArea` |
| [ModeChangeListener](../../../android/随身答/smali_classes5/com/zykj/sketch/core/listener/ModeChangeListener.smali) | `onChange` |
| [NextPrevListener](../../../android/随身答/smali_classes5/com/zykj/sketch/core/listener/NextPrevListener.smali) | `listener` |
| [PPTControl](../../../android/随身答/smali_classes5/com/zykj/sketch/core/listener/PPTControl.smali) | `goPage`、`nextAction`、`nextSlide`、`preAction`、`preSlide` |
| [PPTListener](../../../android/随身答/smali_classes5/com/zykj/sketch/core/listener/PPTListener.smali) | `currentPage`、`onPageFinished`、`totalPageCount` |
| [PlayActionListener](../../../android/随身答/smali_classes5/com/zykj/sketch/core/listener/PlayActionListener.smali) | `onPlayEnd`、`onPlayPause`、`onPlayStart`、`onProgress`、`onWaitPlay` |
| [ProgressListener](../../../android/随身答/smali_classes5/com/zykj/sketch/core/listener/ProgressListener.smali) | `progress`、`recordError` |
| [RealDraw](../../../android/随身答/smali_classes5/com/zykj/sketch/core/listener/RealDraw.smali) | `drawGraph`、`setDrawBackground`、`setLimitDrawArea`、`shutdown` |

## com.zykj.sketch.core.player

| 类 | 方法摘录 |
|---|---|
| [AudioThread](../../../android/随身答/smali_classes5/com/zykj/sketch/core/player/AudioThread.smali) | `getTotalDuration`、`initMediaPlayer`、`notifyProgress`、`resetMediaPlay`、`stopAllAudio`、`initSeekTo`、`pausePlay` |
| [PaintThread](../../../android/随身答/smali_classes5/com/zykj/sketch/core/player/PaintThread.smali) | `getTotalDuration`、`notifyProgress`、`initSeekTo`、`pausePlay`、`resumePlay`、`seekTo`、`setData` |
| [PlayControl](../../../android/随身答/smali_classes5/com/zykj/sketch/core/player/PlayControl.smali) | `checkAudioFile`、`parseDrawBoardData`、`addPlayActionListener`、`getPlayStatus`、`loadData`、`onDestroy`、`pause` |
| [PlayThread](../../../android/随身答/smali_classes5/com/zykj/sketch/core/player/PlayThread.smali) | `getPlayStatus`、`getStatus`、`pausePlay`、`reset`、`resumePlay`、`setPlayStatus`、`shutdown` |
| [SketchPlayerView](../../../android/随身答/smali_classes5/com/zykj/sketch/core/player/SketchPlayerView.smali) | `getLoadDataExecutor`、`getSeekExecutor`、`runAtLeastCreated`、`addPlayActionListener`、`destroy`、`getPlayStatus`、`isRend` |

## com.zykj.sketch.core.record

| 类 | 方法摘录 |
|---|---|
| [AudioControl](../../../android/随身答/smali_classes5/com/zykj/sketch/core/record/AudioControl.smali) | `addListener`、`isRecord`、`reset`、`startRecord`、`stopRecord` |
| [GraphOperation](../../../android/随身答/smali_classes5/com/zykj/sketch/core/record/GraphOperation.smali) | `addImage`、`addImage`、`addImage`、`addImage`、`addPPT`、`clear`、`getConfig` |
| [RecordControl](../../../android/随身答/smali_classes5/com/zykj/sketch/core/record/RecordControl.smali) | `addImage`、`countScale`、`executeActionContent`、`executeTask`、`getImagePath`、`saveBitmap`、`addActionChangeListener` |
| [SketchRecorderView](../../../android/随身答/smali_classes5/com/zykj/sketch/core/record/SketchRecorderView.smali) | `addImage`、`addImage`、`addImage`、`addImage`、`addPPT`、`clear`、`getConfig` |

## com.zykj.sketch.core.version

| 类 | 方法摘录 |
|---|---|
| [GraphTaskParseVersion1](../../../android/随身答/smali_classes5/com/zykj/sketch/core/version/GraphTaskParseVersion1.smali) | `parseEventAsTask`、`parse` |
| [GraphTaskParseVersion3](../../../android/随身答/smali_classes5/com/zykj/sketch/core/version/GraphTaskParseVersion3.smali) | `addGraphTask`、`countTaskStartTime`、`deleteSnapShot`、`parseEventAsTask`、`parseEventAsTask`、`getFlag`、`parse` |
| [GraphTaskParseVersion4](../../../android/随身答/smali_classes5/com/zykj/sketch/core/version/GraphTaskParseVersion4.smali) | `addGraphTask`、`countTaskStartTime`、`deleteSnapShot`、`parseEventAsTask`、`parseEventAsTask`、`getFlag`、`parse` |
| [GraphTaskParseVersion5](../../../android/随身答/smali_classes5/com/zykj/sketch/core/version/GraphTaskParseVersion5.smali) | `addGraphTask`、`countTaskStartTime`、`deleteSnapShot`、`parseEventAsTask`、`parseEventAsTask`、`getFlag`、`parse` |
| [ITaskParse](../../../android/随身答/smali_classes5/com/zykj/sketch/core/version/ITaskParse.smali) | `parse` |

## com.zykj.sketch.extensions

| 类 | 方法摘录 |
|---|---|
| [ExtensionsKt](../../../android/随身答/smali_classes5/com/zykj/sketch/extensions/ExtensionsKt.smali) | `capture`、`getDegree`、`getDistance`、`getDistance`、`getMidPoint`、`getRotation`、`lineSpace` |

## com.zykj.sketch.permission

| 类 | 方法摘录 |
|---|---|
| [Permission](../../../android/随身答/smali_classes5/com/zykj/sketch/permission/Permission.smali) | `combineGranted`、`combineName`、`combineShouldShowRequestPermissionRationale` |
| [RxPermissions](../../../android/随身答/smali_classes5/com/zykj/sketch/permission/RxPermissions.smali) | `findRxPermissionsFragment`、`getLazySingleton`、`getRxPermissionsFragment`、`oneOf`、`pending`、`request`、`requestImplementation` |
| [RxPermissionsFragment](../../../android/随身答/smali_classes5/com/zykj/sketch/permission/RxPermissionsFragment.smali) | `containsByPermission`、`getSubjectByPermission`、`isGranted`、`isRevoked`、`onCreate`、`onRequestPermissionsResult`、`onRequestPermissionsResult` |

## com.zykj.sketch.utils

| 类 | 方法摘录 |
|---|---|
| [ToastUtils](../../../android/随身答/smali_classes5/com/zykj/sketch/utils/ToastUtils.smali) | `showLong`、`showLong`、`showShort`、`showShort` |

## com.zykj.sketch.widgets

| 类 | 方法摘录 |
|---|---|
| [DrawTempView](../../../android/随身答/smali_classes5/com/zykj/sketch/widgets/DrawTempView.smali) | `clearGraph`、`drawPath`、`drawThumbnail`、`graphMatrix`、`onDraw`、`setLimitDrawArea` |
| [DrawView](../../../android/随身答/smali_classes5/com/zykj/sketch/widgets/DrawView.smali) | `drawGraph`、`onDraw`、`setDrawBackground`、`setLimitDrawArea`、`shutdown` |
| [PPTWebView](../../../android/随身答/smali_classes5/com/zykj/sketch/widgets/PPTWebView.smali) | `goPage`、`loadSlider`、`nextAction`、`nextSlide`、`onTouchEvent`、`preAction`、`preSlide` |
| [SurfaceDrawView](../../../android/随身答/smali_classes5/com/zykj/sketch/widgets/SurfaceDrawView.smali) | `drawGraph`、`setDrawBackground`、`setLimitDrawArea`、`shutdown`、`surfaceChanged`、`surfaceCreated`、`surfaceDestroyed` |
| [TempView](../../../android/随身答/smali_classes5/com/zykj/sketch/widgets/TempView.smali) | `onDraw`、`rectConvertRegion` |
| [TextureDrawView](../../../android/随身答/smali_classes5/com/zykj/sketch/widgets/TextureDrawView.smali) | `dispatchVisibilityChanged`、`drawGraph`、`isRend`、`onDetachedFromWindow`、`onSurfaceTextureAvailable`、`onSurfaceTextureDestroyed`、`onSurfaceTextureSizeChanged` |

## com.zykj.student.dialogue

| 类 | 方法摘录 |
|---|---|
| [App](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/App.smali) | `initBugly`、`initLogHelper`、`initMessageClient`、`reflectComposeValue`、`getOssTaskManger`、`getWorkManagerConfiguration`、`getWorkerFactory` |
| [DataBinderMapperImpl](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/DataBinderMapperImpl.smali) | `collectDependencies`、`convertBrIdToString`、`getDataBinder`、`getDataBinder`、`getLayoutId` |

## com.zykj.student.dialogue.base

| 类 | 方法摘录 |
|---|---|
| [BaseFragment](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/base/BaseFragment.smali) | `onResume` |

## com.zykj.student.dialogue.bean.req

| 类 | 方法摘录 |
|---|---|
| [AddCategoryReq](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/bean/req/AddCategoryReq.smali) | `getName` |
| [AddMessageReq](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/bean/req/AddMessageReq.smali) | `getContent`、`getSessionId`、`getSnapshot`、`setContent`、`setSessionId`、`setSnapshot` |
| [CollectReq](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/bean/req/CollectReq.smali) | `getSessionId`、`isCollect` |
| [CollectSessionReq](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/bean/req/CollectSessionReq.smali) | `describeContents`、`getCollectTime`、`getKeyword`、`getSkip`、`getTake`、`getTopicId`、`writeToParcel` |
| [CreateSessionReq](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/bean/req/CreateSessionReq.smali) | `getAnswerUserIds`、`getContent`、`getCourseId`、`getSnapshot`、`getSummary` |
| [JoinTimeReq](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/bean/req/JoinTimeReq.smali) | `describeContents`、`getEnd`、`getStart`、`writeToParcel` |
| [MessageRequest](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/bean/req/MessageRequest.smali) | `getSessionId`、`getSkip`、`getTake`、`isCollectList` |
| [MessageStateReq](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/bean/req/MessageStateReq.smali) | `getMessageId`、`getSessionId`、`getState` |
| [MonitorPictureReq](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/bean/req/MonitorPictureReq.smali) | `getAppName`、`getPackageName`、`getPictures`、`setAppName`、`setPackageName`、`setPictures` |
| [MoveCategoryReq](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/bean/req/MoveCategoryReq.smali) | `describeContents`、`getCatalogId`、`getSessionIds`、`writeToParcel` |
| [SessionsReq](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/bean/req/SessionsReq.smali) | `describeContents`、`getCatalogId`、`getJoinTime`、`getJustWatch`、`getJustWatchByTeacher`、`getKeyword`、`getOrderBy` |
| [SetSessionStateReq](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/bean/req/SetSessionStateReq.smali) | `getSessionId`、`getState` |
| [SettingProperty](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/bean/req/SettingProperty.smali) | `getValue` |
| [SortCatalogReq](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/bean/req/SortCatalogReq.smali) | `getId`、`getSort` |
| [UpdateCategoryReq](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/bean/req/UpdateCategoryReq.smali) | `getId`、`getName` |
| [UpdateTimeReq](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/bean/req/UpdateTimeReq.smali) | `describeContents`、`getEnd`、`getStart`、`writeToParcel` |

## com.zykj.student.dialogue.bean.resp

| 类 | 方法摘录 |
|---|---|
| [CatalogResp](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/bean/resp/CatalogResp.smali) | `describeContents`、`getHasNewMsgs`、`getHasNewParimaryMsgs`、`getId`、`getName`、`getNewMsgCount`、`getNewParimarMsgCount` |
| [CollectSession](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/bean/resp/CollectSession.smali) | `describeContents`、`getAskUserName`、`getAskUserPhoto`、`getCollectTime`、`getCourseId`、`getFormatSummary`、`getId` |
| [CourseItem](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/bean/resp/CourseItem.smali) | `getAllowQuora`、`getCreateTime`、`getCreateUserId`、`getEditTime`、`getEditUserId`、`getId`、`getIntroduce` |
| [FilterType](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/bean/resp/FilterType.smali) | `getLabel`、`isCustomTime` |
| [HomeKt](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/bean/resp/HomeKt.smali) | `getInitialFavoriteTime`、`getInitialJoinedTime`、`getInitialQuestionState`、`getInitialSortType`、`getInitialSubject`、`getInitialTeacherViewStatus`、`getInitialUpdatedTime` |
| [MessageResponse](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/bean/resp/MessageResponse.smali) | `getApplaud`、`getApplaudTime`、`getApplauds`、`getChecked`、`getContent`、`getId`、`getMsgFlag` |
| [QuestionResp](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/bean/resp/QuestionResp.smali) | `describeContents`、`fetchJoinedTime`、`fetchUpdatedTime`、`getAskUserId`、`getAskUserName`、`getAskUserPhoto`、`getClosed` |
| [SearchQuestion](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/bean/resp/SearchQuestion.smali) | `getAskUserId`、`getAskUserName`、`getAskUserPhoto`、`getCleared`、`getClosed`、`getCourseId`、`getCreateTime` |
| [SubjectResp](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/bean/resp/SubjectResp.smali) | `getTopicId`、`getTopicName` |
| [SystemSettingsBean](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/bean/resp/SystemSettingsBean.smali) | `getQuoraSearchEnabled`、`getQuoraSearchable` |
| [VersionResult](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/bean/resp/VersionResult.smali) | `describeContents`、`getAppType`、`getAppVersionId`、`getCreationTime`、`getCreatorUserId`、`getDescription`、`getDisabled` |
| [VersionUpdate](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/bean/resp/VersionUpdate.smali) | `getError`、`getResult`、`getSuccess` |

## com.zykj.student.dialogue.network

| 类 | 方法摘录 |
|---|---|
| [BaseResponse](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/network/BaseResponse.smali) | `getError`、`getResult`、`getSuccess` |

## com.zykj.student.dialogue.ui

| 类 | 方法摘录 |
|---|---|
| [Hilt_MainActivity](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/Hilt_MainActivity.smali) | `generatedComponent`、`getDefaultViewModelProviderFactory`、`onCreate`、`onDestroy` |
| [MainActivity](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/MainActivity.smali) | `onCreate` |

## com.zykj.student.dialogue.ui.ask

| 类 | 方法摘录 |
|---|---|
| [AskDescriptionFragment](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/ask/AskDescriptionFragment.smali) | `onAttach`、`onCreate`、`onCreateView` |
| [AskDescriptionFragmentArgs](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/ask/AskDescriptionFragmentArgs.smali) | `fromBundle` |
| [AskQuestionDialogFragment](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment.smali) | `onCreate`、`onCreateView`、`onStart` |
| [AskQuestionDialogFragmentArgs](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/ask/AskQuestionDialogFragmentArgs.smali) | `fromBundle` |
| [Hilt_AskDescriptionFragment](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/ask/Hilt_AskDescriptionFragment.smali) | `generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`onAttach`、`onAttach`、`onGetLayoutInflater` |
| [Hilt_AskQuestionDialogFragment](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/ask/Hilt_AskQuestionDialogFragment.smali) | `generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`onAttach`、`onAttach`、`onGetLayoutInflater` |

## com.zykj.student.dialogue.ui.collect

| 类 | 方法摘录 |
|---|---|
| [CollectDifferCallback](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/collect/CollectDifferCallback.smali) | `areContentsTheSame`、`areItemsTheSame`、`getChangePayload` |
| [CollectHistoryFragment](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/collect/CollectHistoryFragment.smali) | `onAttach`、`onCreateView`、`onResume`、`onViewCreated` |
| [CollectListAdapter](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/collect/CollectListAdapter.smali) | `onBindViewHolder`、`onBindViewHolder`、`onCreateViewHolder` |
| [CollectPagingSource](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/collect/CollectPagingSource.smali) | `getRefreshKey`、`getRefreshKey` |
| [CollectPayloadKey](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/collect/CollectPayloadKey.smali) | `valueOf`、`values` |
| [Hilt_CollectHistoryFragment](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/collect/Hilt_CollectHistoryFragment.smali) | `generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`onAttach`、`onAttach`、`onGetLayoutInflater` |
| [Hilt_SearchedQuestionFragment](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/collect/Hilt_SearchedQuestionFragment.smali) | `generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`onAttach`、`onAttach`、`onGetLayoutInflater` |
| [SearchedQuestionDifferCallback](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/collect/SearchedQuestionDifferCallback.smali) | `areContentsTheSame`、`areItemsTheSame`、`getChangePayload` |
| [SearchedQuestionFragment](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/collect/SearchedQuestionFragment.smali) | `onAttach`、`onCreate`、`onCreateView`、`onViewCreated` |
| [SearchedQuestionFragmentArgs](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/collect/SearchedQuestionFragmentArgs.smali) | `fromBundle` |
| [SearchedQuestionListAdapter](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/collect/SearchedQuestionListAdapter.smali) | `onBindViewHolder`、`onBindViewHolder`、`onCreateViewHolder` |
| [SearchedQuestionPayloadKey](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/collect/SearchedQuestionPayloadKey.smali) | `valueOf`、`values` |

## com.zykj.student.dialogue.ui.detail

| 类 | 方法摘录 |
|---|---|
| [AnswerDetailFragment](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/detail/AnswerDetailFragment.smali) | `onAttach`、`onCreate`、`onCreateView`、`onDestroy`、`onViewCreated` |
| [AnswerDetailFragmentArgs](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/detail/AnswerDetailFragmentArgs.smali) | `fromBundle` |
| [AnswerPagerFragment](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/detail/AnswerPagerFragment.smali) | `onAttach`、`onCreateView`、`onViewCreated` |
| [AnswerTabFragment](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/detail/AnswerTabFragment.smali) | `onCreateView`、`onViewCreated` |
| [DeleteAction](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/detail/DeleteAction.smali) | `valueOf`、`values` |
| [DeleteDialogFragment](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/detail/DeleteDialogFragment.smali) | `initView`、`layoutId`、`onStart` |
| [DetailTabAdapter](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/detail/DetailTabAdapter.smali) | `onBindViewHolder`、`onBindViewHolder`、`onCreateViewHolder` |
| [DetailTabFragment](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/detail/DetailTabFragment.smali) | `onCreateView`、`onViewCreated` |
| [DialogueSketchCropFragment](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment.smali) | `initData`、`initView`、`layoutId` |
| [DialogueSketchCropFragmentArgs](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/detail/DialogueSketchCropFragmentArgs.smali) | `fromBundle` |
| [Hilt_AnswerDetailFragment](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/detail/Hilt_AnswerDetailFragment.smali) | `generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`onAttach`、`onAttach`、`onGetLayoutInflater` |
| [Hilt_AnswerPagerFragment](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/detail/Hilt_AnswerPagerFragment.smali) | `generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`onAttach`、`onAttach`、`onGetLayoutInflater` |
| [Hilt_AnswerTabFragment](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/detail/Hilt_AnswerTabFragment.smali) | `generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`onAttach`、`onAttach`、`onGetLayoutInflater` |
| [Hilt_DeleteDialogFragment](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/detail/Hilt_DeleteDialogFragment.smali) | `generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`onAttach`、`onAttach`、`onGetLayoutInflater` |
| [Hilt_DetailTabFragment](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/detail/Hilt_DetailTabFragment.smali) | `generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`onAttach`、`onAttach`、`onGetLayoutInflater` |
| [Hilt_NewAnswerFragment](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/detail/Hilt_NewAnswerFragment.smali) | `generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`onAttach`、`onAttach`、`onGetLayoutInflater` |
| [Hilt_PlayLessonFragment](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/detail/Hilt_PlayLessonFragment.smali) | `generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`onAttach`、`onAttach`、`onGetLayoutInflater` |
| [NewAnswerFragment](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/detail/NewAnswerFragment.smali) | `onAttach`、`onCreate`、`onCreateView`、`onViewCreated` |
| [NewAnswerFragmentArgs](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/detail/NewAnswerFragmentArgs.smali) | `fromBundle` |
| [PlayLessonFragment](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/detail/PlayLessonFragment.smali) | `onAttach`、`onCreateView`、`onViewCreated` |
| [PlayLessonFragmentArgs](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/detail/PlayLessonFragmentArgs.smali) | `fromBundle` |

## com.zykj.student.dialogue.ui.detail.viewmodel

| 类 | 方法摘录 |
|---|---|
| [Tab](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/detail/viewmodel/Tab.smali) | `valueOf`、`values` |

## com.zykj.student.dialogue.ui.dialog

| 类 | 方法摘录 |
|---|---|
| [UnderstandDialog](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/dialog/UnderstandDialog.smali) | `onCreate`、`onCreateDialog`、`onCreateView`、`onViewCreated` |

## com.zykj.student.dialogue.ui.home

| 类 | 方法摘录 |
|---|---|
| [DatePickerFragment](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/home/DatePickerFragment.smali) | `onCreate`、`onCreateView`、`onStart`、`onViewCreated` |
| [DatePickerFragmentArgs](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/home/DatePickerFragmentArgs.smali) | `fromBundle` |
| [Hilt_DatePickerFragment](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/home/Hilt_DatePickerFragment.smali) | `generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`onAttach`、`onAttach`、`onGetLayoutInflater` |
| [Hilt_HomeFragment](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/home/Hilt_HomeFragment.smali) | `generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`onAttach`、`onAttach`、`onGetLayoutInflater` |
| [Hilt_HomePagerFragment](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/home/Hilt_HomePagerFragment.smali) | `generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`onAttach`、`onAttach`、`onGetLayoutInflater` |
| [HomeFragment](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/home/HomeFragment.smali) | `onAttach`、`onCreate`、`onCreateView`、`onViewCreated` |
| [HomePagerFragment](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/home/HomePagerFragment.smali) | `onCreate`、`onCreateView`、`onViewCreated` |
| [HomePagingSource](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/home/HomePagingSource.smali) | `getRefreshKey`、`getRefreshKey` |
| [SessionDifferCallback](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/home/SessionDifferCallback.smali) | `areContentsTheSame`、`areItemsTheSame` |
| [SessionListAdapter](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/home/SessionListAdapter.smali) | `onBindViewHolder`、`onBindViewHolder`、`onCreateViewHolder` |

## com.zykj.student.dialogue.ui.home.category

| 类 | 方法摘录 |
|---|---|
| [AddCategoryFragment](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/home/category/AddCategoryFragment.smali) | `initView`、`layoutId` |
| [CategoryEditAdapter](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/home/category/CategoryEditAdapter.smali) | `addDraggableModule`、`convert` |
| [CategoryListFragment](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/home/category/CategoryListFragment.smali) | `initView`、`layoutId` |
| [EditDialogFragment](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/home/category/EditDialogFragment.smali) | `initView`、`layoutId`、`onCreate`、`onDestroy`、`onStart` |
| [EditDialogFragmentArgs](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/home/category/EditDialogFragmentArgs.smali) | `fromBundle` |
| [Hilt_AddCategoryFragment](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/home/category/Hilt_AddCategoryFragment.smali) | `generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`onAttach`、`onAttach`、`onGetLayoutInflater` |
| [Hilt_EditDialogFragment](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/home/category/Hilt_EditDialogFragment.smali) | `generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`onAttach`、`onAttach`、`onGetLayoutInflater` |
| [Hilt_UpdateCategoryFragment](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/home/category/Hilt_UpdateCategoryFragment.smali) | `generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`onAttach`、`onAttach`、`onGetLayoutInflater` |
| [UpdateCategoryFragment](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/home/category/UpdateCategoryFragment.smali) | `initView`、`layoutId` |
| [UpdateCategoryFragmentArgs](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/home/category/UpdateCategoryFragmentArgs.smali) | `fromBundle` |

## com.zykj.student.dialogue.ui.home.dialog

| 类 | 方法摘录 |
|---|---|
| [Hilt_SessionDeleteDialogFragment](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/home/dialog/Hilt_SessionDeleteDialogFragment.smali) | `generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`onAttach`、`onAttach`、`onGetLayoutInflater` |
| [Hilt_SessionMoveDialogFragment](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/home/dialog/Hilt_SessionMoveDialogFragment.smali) | `generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`onAttach`、`onAttach`、`onGetLayoutInflater` |
| [SessionDeleteDialogFragment](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/home/dialog/SessionDeleteDialogFragment.smali) | `onCreate`、`onCreateView`、`onStart` |
| [SessionMoveDialogFragment](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/home/dialog/SessionMoveDialogFragment.smali) | `onCreate`、`onCreateView`、`onStart` |

## com.zykj.student.dialogue.ui.version

| 类 | 方法摘录 |
|---|---|
| [VersionUpgradeDialogFragment](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment.smali) | `initView`、`layoutId`、`onStart` |

## com.zykj.student.dialogue.ui.widget

| 类 | 方法摘录 |
|---|---|
| [CustomIndication](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/widget/CustomIndication.smali) | `create`、`rememberUpdatedInstance` |
| [TouchSwitchMotionLayout](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/ui/widget/TouchSwitchMotionLayout.smali) | `onInterceptTouchEvent`、`setIntercepted` |

## com.zykj.student.dialogue.upload

| 类 | 方法摘录 |
|---|---|
| [OssData](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/upload/OssData.smali) | `getObjectKey`、`getToken` |
| [OssToken](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/upload/OssToken.smali) | `getAccessKeyId`、`getAccessKeySecret`、`getAppId`、`getBucket`、`getEndpoint`、`getExpiration`、`getSecurityToken` |
| [TokenReq](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/upload/TokenReq.smali) | `getFc`、`getFe`、`getFo`、`getFr`、`getFt`、`getNonce`、`getSign` |
| [UploadWork](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/upload/UploadWork.smali) | `doWork` |
| [UploadWork_AssistedFactory_Impl](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/upload/UploadWork_AssistedFactory_Impl.smali) | `create` |

## com.zykj.student.dialogue.utils

| 类 | 方法摘录 |
|---|---|
| [ExceptionHandle](../../../android/随身答/smali_classes5/com/zykj/student/dialogue/utils/ExceptionHandle.smali) | `caseRemoteCodeException`、`handleException` |

## com.zykj.view

| 类 | 方法摘录 |
|---|---|
| [DataBinderMapperImpl](../../../android/随身答/smali_classes5/com/zykj/view/DataBinderMapperImpl.smali) | `collectDependencies`、`convertBrIdToString`、`getDataBinder`、`getDataBinder`、`getLayoutId` |

## com.zykj.view.board.board

| 类 | 方法摘录 |
|---|---|
| [BoardFragment](../../../android/随身答/smali_classes5/com/zykj/view/board/board/BoardFragment.smali) | `onCreateView`、`onDestroyView`、`onViewCreated` |

## com.zykj.view.board.crop

| 类 | 方法摘录 |
|---|---|
| [BlackboardCropFragment](../../../android/随身答/smali_classes5/com/zykj/view/board/crop/BlackboardCropFragment.smali) | `onActivityCreated`、`onCreateView`、`onDestroyView`、`onHiddenChanged`、`onPause`、`onResume`、`setUserVisibleHint` |

## com.zykj.view.board.evaluation

| 类 | 方法摘录 |
|---|---|
| [BlackboardEvaluationFragment](../../../android/随身答/smali_classes5/com/zykj/view/board/evaluation/BlackboardEvaluationFragment.smali) | `onCreate`、`onCreateView`、`onDestroyView`、`onViewCreated` |

## com.zykj.view.board.play

| 类 | 方法摘录 |
|---|---|
| [PlaySettingAdapter](../../../android/随身答/smali_classes5/com/zykj/view/board/play/PlaySettingAdapter.smali) | `getItemCount`、`onBindViewHolder`、`onCreateViewHolder` |
| [SketchPlayFragment](../../../android/随身答/smali_classes5/com/zykj/view/board/play/SketchPlayFragment.smali) | `onCreateView`、`onDestroyView`、`onHiddenChanged`、`onPause`、`onResume`、`onViewCreated`、`setUserVisibleHint` |
| [SpeedRateAdapter](../../../android/随身答/smali_classes5/com/zykj/view/board/play/SpeedRateAdapter.smali) | `onBindViewHolder`、`onCreateViewHolder` |

## com.zykj.view.board.simple

| 类 | 方法摘录 |
|---|---|
| [SimpleFragment](../../../android/随身答/smali_classes5/com/zykj/view/board/simple/SimpleFragment.smali) | `onCreateView`、`onViewCreated` |

## com.zykj.view.simpleBoard

| 类 | 方法摘录 |
|---|---|
| [SelectionTarget](../../../android/随身答/smali_classes5/com/zykj/view/simpleBoard/SelectionTarget.smali) | `valueOf`、`values` |
| [SimpleBoardView](../../../android/随身答/smali_classes5/com/zykj/view/simpleBoard/SimpleBoardView.smali) | `getImageBackground`、`getSimpleBoardConfig`、`onMeasure`、`onTouchEvent`、`setActonMode`、`setImageBackground`、`setOnActionListener` |

## com.zykj.view.ui.camera

| 类 | 方法摘录 |
|---|---|
| [EzyCameraActivity](../../../android/随身答/smali_classes5/com/zykj/view/ui/camera/EzyCameraActivity.smali) | `onCreate` |
| [ImagePickFragment](../../../android/随身答/smali_classes5/com/zykj/view/ui/camera/ImagePickFragment.smali) | `onCreateView`、`onResume`、`onViewCreated` |

## com.zykj.view.ui.crop

| 类 | 方法摘录 |
|---|---|
| [EzyCropActivity](../../../android/随身答/smali_classes5/com/zykj/view/ui/crop/EzyCropActivity.smali) | `onCreate`、`onWindowFocusChanged` |
| [EzyCropTheme](../../../android/随身答/smali_classes5/com/zykj/view/ui/crop/EzyCropTheme.smali) | `valueOf`、`values` |

## com.zykj.view.utils

| 类 | 方法摘录 |
|---|---|
| [ProtoPath](../../../android/随身答/smali_classes5/com/zykj/view/utils/ProtoPath.smali) | `getPaint`、`getPointList` |
| [ZoomPointSolution](../../../android/随身答/smali_classes5/com/zykj/view/utils/ZoomPointSolution.smali) | `valueOf`、`values` |

## com.zykj.view.widget

| 类 | 方法摘录 |
|---|---|
| [DoubleSeekBar](../../../android/随身答/smali_classes5/com/zykj/view/widget/DoubleSeekBar.smali) | `getBarSize`、`getKeyPointColor`、`getKeyPointList`、`getMaskChangeListener`、`getMaskColor`、`getMaskProgress`、`getMax` |
| [SketchBoardTouchFrameLayout](../../../android/随身答/smali_classes5/com/zykj/view/widget/SketchBoardTouchFrameLayout.smali) | `dispatchTouchEvent`、`getOnBeforeTouchDispatchToChildren`、`setOnBeforeTouchDispatchToChildren` |
| [SketchProgressView](../../../android/随身答/smali_classes5/com/zykj/view/widget/SketchProgressView.smali) | `getViewCrossLength`、`getViewMainLength`、`getOrientation`、`getProgress`、`getProgressListener`、`getThumbTime`、`onDetachedFromWindow` |
| [TouchSwitchView](../../../android/随身答/smali_classes5/com/zykj/view/widget/TouchSwitchView.smali) | `onInterceptTouchEvent`、`setCanTouch` |

## com.zykj.view.widget.customColor

| 类 | 方法摘录 |
|---|---|
| [CustomColorFrameLayout](../../../android/随身答/smali_classes5/com/zykj/view/widget/customColor/CustomColorFrameLayout.smali) | `getOnColorChangeListener`、`getSelectColor`、`setBackgroundLight`、`setOnColorChangeListener`、`setSelectColor` |
| [CustomColorLayout](../../../android/随身答/smali_classes5/com/zykj/view/widget/customColor/CustomColorLayout.smali) | `getOnColorChangeListener`、`getSelectColor`、`setOnColorChangeListener`、`setSelectColor` |
| [LatestColorLayout](../../../android/随身答/smali_classes5/com/zykj/view/widget/customColor/LatestColorLayout.smali) | `getOnColorChangeListener`、`getSelectColor`、`setOnColorChangeListener`、`setSelectColor` |

## com.zykj.view.widget.radio

| 类 | 方法摘录 |
|---|---|
| [CustomColorRadioButton](../../../android/随身答/smali_classes5/com/zykj/view/widget/radio/CustomColorRadioButton.smali) | `getNoColorBitmap`、`getNoColorRect`、`getWithColorBitmap`、`getWithColorRect`、`getColor`、`onDraw`、`onLayout` |
| [WithSelectedRadioButton](../../../android/随身答/smali_classes5/com/zykj/view/widget/radio/WithSelectedRadioButton.smali) | `onDraw`、`onLayout`、`setChecked`、`setPressed` |
