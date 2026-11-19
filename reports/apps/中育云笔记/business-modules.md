# 中育云笔记 业务代码导航

每个表格对应一个保留业务命名空间的包，方法来自 DEX 的类定义。点击类名可查看参与编译的实现。生成绑定、单字母类及第三方库另见完整包索引。

## com.friday.cloudsnote

| 类 | 方法摘录 |
|---|---|
| [App](../../../android/中育云笔记/smali_classes3/com/friday/cloudsnote/App.smali) | `initBugly`、`initCloudChannel`、`initHelper`、`initLogHelper`、`initRouter`、`initStrictMode`、`initTalkingData` |
| [DataBinderMapperImpl](../../../android/中育云笔记/smali_classes3/com/friday/cloudsnote/DataBinderMapperImpl.smali) | `collectDependencies`、`convertBrIdToString`、`getDataBinder`、`getDataBinder`、`getLayoutId` |
| [SophixStubApplication](../../../android/中育云笔记/smali_classes3/com/friday/cloudsnote/SophixStubApplication.smali) | `initSophix`、`attachBaseContext` |

## com.friday.cloudsnote.view

| 类 | 方法摘录 |
|---|---|
| [Hilt_MainActivity](../../../android/中育云笔记/smali_classes3/com/friday/cloudsnote/view/Hilt_MainActivity.smali) | `createComponentManager`、`generatedComponent`、`getDefaultViewModelProviderFactory`、`inject`、`onCreate`、`onDestroy` |
| [MainActivity](../../../android/中育云笔记/smali_classes3/com/friday/cloudsnote/view/MainActivity.smali) | `getLayoutId`、`initData`、`onBackPressed`、`onCreate` |

## com.friday.common

| 类 | 方法摘录 |
|---|---|
| [DataBinderMapperImpl](../../../android/中育云笔记/smali_classes3/com/friday/common/DataBinderMapperImpl.smali) | `collectDependencies`、`convertBrIdToString`、`getDataBinder`、`getDataBinder`、`getLayoutId` |
| [MyDataBase_Impl](../../../android/中育云笔记/smali_classes3/com/friday/common/MyDataBase_Impl.smali) | `clearAllTables`、`createAutoMigrations`、`createInvalidationTracker`、`createOpenDelegate`、`getRequiredAutoMigrationSpecClasses`、`getRequiredTypeConverterClasses` |

## com.friday.common.activity

| 类 | 方法摘录 |
|---|---|
| [Hilt_RequestScreenCastActivity](../../../android/中育云笔记/smali_classes3/com/friday/common/activity/Hilt_RequestScreenCastActivity.smali) | `createComponentManager`、`generatedComponent`、`getDefaultViewModelProviderFactory`、`inject`、`onCreate`、`onDestroy` |
| [PusherService](../../../android/中育云笔记/smali_classes3/com/friday/common/activity/PusherService.smali) | `onCreate`、`onDestroy`、`onStartCommand` |
| [RequestScreenCastActivity](../../../android/中育云笔记/smali_classes3/com/friday/common/activity/RequestScreenCastActivity.smali) | `onCreate` |

## com.friday.common.base

| 类 | 方法摘录 |
|---|---|
| [BaseActivity](../../../android/中育云笔记/smali_classes3/com/friday/common/base/BaseActivity.smali) | `getCoroutineContext`、`getMBinding`、`initDataSource`、`initView`、`isShowLoading`、`onClick`、`onCreate` |
| [BaseCameraResponse](../../../android/中育云笔记/smali_classes3/com/friday/common/base/BaseCameraResponse.smali) | `getError`、`getResult`、`getSuccess`、`getTargetUrl`、`getUnAuthorizedRequest`、`get__abp` |
| [BaseDialogFragment](../../../android/中育云笔记/smali_classes3/com/friday/common/base/BaseDialogFragment.smali) | `getMBinding`、`isShowLoading`、`onActivityCreated`、`onClick`、`onCreateView`、`setClickListener`、`setMBinding` |
| [BaseFragment](../../../android/中育云笔记/smali_classes3/com/friday/common/base/BaseFragment.smali) | `getMBinding`、`getMContext`、`hideLoadingOffline`、`initDataSource`、`initView`、`isShowLoading`、`needHideLoadingOnDestroy` |
| [ErrorMessage](../../../android/中育云笔记/smali_classes3/com/friday/common/base/ErrorMessage.smali) | `getCode`、`getCurrentUserDidNotLoginToTheApplication`、`getDetails`、`getMessage`、`getValidationErrors` |
| [SimpleFragment](../../../android/中育云笔记/smali_classes3/com/friday/common/base/SimpleFragment.smali) | `onClick`、`onDestroy` |

## com.friday.common.camera

| 类 | 方法摘录 |
|---|---|
| [CameraActivity](../../../android/中育云笔记/smali_classes3/com/friday/common/camera/CameraActivity.smali) | `getLayoutId`、`initData`、`onDestroy`、`onNewIntent` |
| [CameraBean](../../../android/中育云笔记/smali_classes3/com/friday/common/camera/CameraBean.smali) | `describeContents`、`writeToParcel` |
| [Hilt_CameraActivity](../../../android/中育云笔记/smali_classes3/com/friday/common/camera/Hilt_CameraActivity.smali) | `createComponentManager`、`generatedComponent`、`getDefaultViewModelProviderFactory`、`inject`、`onCreate`、`onDestroy` |
| [Hilt_ImageCropFragment](../../../android/中育云笔记/smali_classes3/com/friday/common/camera/Hilt_ImageCropFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_ImagePickFragment](../../../android/中育云笔记/smali_classes3/com/friday/common/camera/Hilt_ImagePickFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [ImageCropFragment](../../../android/中育云笔记/smali_classes3/com/friday/common/camera/ImageCropFragment.smali) | `getLayoutId`、`initData`、`onCreateView`、`onViewCreated` |
| [ImagePickFragment](../../../android/中育云笔记/smali_classes3/com/friday/common/camera/ImagePickFragment.smali) | `initData`、`initView`、`onAttach`、`onCreateView`、`onResume`、`onViewCreated` |
| [ZoomControlView](../../../android/中育云笔记/smali_classes3/com/friday/common/camera/ZoomControlView.smali) | `getRealTimeValue`、`onDraw`、`onMeasure`、`setRealTimeValue` |

## com.friday.common.classtest

| 类 | 方法摘录 |
|---|---|
| [MqttRequestEntity](../../../android/中育云笔记/smali_classes3/com/friday/common/classtest/MqttRequestEntity.smali) | `getData`、`getType` |
| [MqttResponse](../../../android/中育云笔记/smali_classes3/com/friday/common/classtest/MqttResponse.smali) | `getData`、`getGuid`、`getType` |
| [MqttResponseEntity](../../../android/中育云笔记/smali_classes3/com/friday/common/classtest/MqttResponseEntity.smali) | `getData`、`getType` |
| [RequestScreencastData](../../../android/中育云笔记/smali_classes3/com/friday/common/classtest/RequestScreencastData.smali) | `getIp`、`getUserId`、`isScreenCast` |
| [RequestScreencastList](../../../android/中育云笔记/smali_classes3/com/friday/common/classtest/RequestScreencastList.smali) | `getData`、`getType` |
| [ResponseScreenCaptureData](../../../android/中育云笔记/smali_classes3/com/friday/common/classtest/ResponseScreenCaptureData.smali) | `getData`、`getType` |
| [ResponseScreencastData](../../../android/中育云笔记/smali_classes3/com/friday/common/classtest/ResponseScreencastData.smali) | `getFtpPort`、`getStudentList`、`getTimeStamp`、`getTopic` |
| [ScreencastResponse](../../../android/中育云笔记/smali_classes3/com/friday/common/classtest/ScreencastResponse.smali) | `getPort`、`getType` |

## com.friday.common.di

| 类 | 方法摘录 |
|---|---|
| [OkHttpClientProvide](../../../android/中育云笔记/smali_classes3/com/friday/common/di/OkHttpClientProvide.smali) | `provideAesOkhttpClient`、`provideAuthTokenOkHttpClient`、`provideCommonOkHttpClient`、`provideEzyService`、`provideHeaderBeanFlow`、`provideRefreshTokenOkHttpClient`、`provideResponseOkHttpClient` |

## com.friday.common.entity

| 类 | 方法摘录 |
|---|---|
| [AddShareTableRequest](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/AddShareTableRequest.smali) | `getFileId`、`getFileName`、`getType`、`getUserName` |
| [AnswerCache](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/AnswerCache.smali) | `getDataList`、`getFromServer`、`getGuid`、`getHasStopped`、`getHasSubmit`、`getHomeworkPage`、`getOptions` |
| [CreateNoteInput](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/CreateNoteInput.smali) | `getFileType`、`getLocalPath`、`getNoteId`、`getNoteName`、`getParentId`、`getUserId` |
| [ErrorRemote](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/ErrorRemote.smali) | `describeContents`、`getCode`、`getDetails`、`getMessage`、`getValidationErrors`、`writeToParcel` |
| [EzyLoginRequest](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/EzyLoginRequest.smali) | `getClientType`、`getDeviceNumber`、`getPassword`、`getSchoolName`、`getSmsVerificationCode`、`getUsername` |
| [FileBean](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/FileBean.smali) | `getNoteList`、`getSchoolCode`、`getTotalCount`、`getUserId` |
| [FileDownloadEntity](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/FileDownloadEntity.smali) | `getFileName`、`isSuccess` |
| [FileEntity](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/FileEntity.smali) | `getAccountId`、`getCached`、`getCreateTime`、`getDepth`、`getErrorTimes`、`getExpiredTime`、`getFileId` |
| [FlagNote](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/FlagNote.smali) | `getUserId` |
| [FromPage](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/FromPage.smali) | `getEntries`、`valueOf`、`values` |
| [GetResourceEntity](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/GetResourceEntity.smali) | `getCode`、`getResourceList`、`getTotalCount`、`getUserId` |
| [GetShareIdResponse](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/GetShareIdResponse.smali) | `getShareId` |
| [HomeworkStatus](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/HomeworkStatus.smali) | `getEntries`、`valueOf`、`values` |
| [IfStudentOnline](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/IfStudentOnline.smali) | `getUserId`、`getUuid` |
| [ImageSafetyEntity](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/ImageSafetyEntity.smali) | `getImageId`、`getRiskScore` |
| [LoginResp](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/LoginResp.smali) | `describeContents`、`getAccessToken`、`getClientCode`、`getExpireInSeconds`、`getMobile`、`getNeedChangePwd`、`getNeedSmsVerification` |
| [MonitorRequest](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/MonitorRequest.smali) | `getAppName`、`getNote`、`getPackageName`、`getPictures`、`getPornScore` |
| [MqttEntity](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/MqttEntity.smali) | `getMessage`、`getSpecifiedId`、`getType` |
| [MqttType](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/MqttType.smali) | `getEntries`、`valueOf`、`values` |
| [MyShareResponse](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/MyShareResponse.smali) | `getFileId`、`getShareId`、`setFileId`、`setShareId` |
| [NoteBean](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/NoteBean.smali) | `getCreateTime`、`getExpirationTimeStamp`、`getFileId`、`getFileName`、`getFileUrl`、`getFullMicroLessonOssUrl`、`getMicroCoverOssUrl` |
| [NoteResource](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/NoteResource.smali) | `getLocal`、`getService` |
| [OnlineDemoEntity](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/OnlineDemoEntity.smali) | `describeContents`、`getAccountId`、`getAdd`、`getHandsUp`、`getMikeEnable`、`getNickname`、`getRoomId` |
| [OptionEntity](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/OptionEntity.smali) | `getOption`、`isSelected`、`isSingle`、`setSelected` |
| [OptionListEntity](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/OptionListEntity.smali) | `getIndex`、`getList` |
| [OriginalShareInfo](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/OriginalShareInfo.smali) | `getShareFileList`、`getTotalCount` |
| [OriginalShareInfoChild](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/OriginalShareInfoChild.smali) | `getCreateTime`、`getFileId`、`getFileName`、`getFileUrl`、`getOwnerId`、`getOwnerName`、`getParentId` |
| [OssFileResource](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/OssFileResource.smali) | `getName`、`getValue` |
| [OssFileType](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/OssFileType.smali) | `getValue` |
| [OssReqData](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/OssReqData.smali) | `getObjectKey`、`getTokenReq` |
| [OssTokenReq](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/OssTokenReq.smali) | `getFc`、`getFe`、`getFo`、`getFr`、`getFt`、`getNonce`、`getSign` |
| [OssTokenResponse](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/OssTokenResponse.smali) | `getAccessKeyId`、`getAccessKeySecret`、`getBucket`、`getEndpoint`、`getExpiration`、`getRequestId`、`getSecurityToken` |
| [OssTokenResult](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/OssTokenResult.smali) | `getResult`、`getSuccess` |
| [PPTAnim](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/PPTAnim.smali) | `getIdx`、`getTotal` |
| [PPTInfo](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/PPTInfo.smali) | `getAnim`、`getInfo`、`getPage`、`getUrl` |
| [PPTPage](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/PPTPage.smali) | `getIdx`、`getTotal` |
| [PayloadKey](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/PayloadKey.smali) | `getEntries`、`valueOf`、`values` |
| [PdfEntity](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/PdfEntity.smali) | `getCurrentPage`、`getId`、`getPageCount` |
| [ResourceEntity](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/ResourceEntity.smali) | `describeContents`、`getCreateTimeStamp`、`getFileId`、`getId`、`getMd5`、`getOssImageUrl`、`getPageIndex` |
| [RestoreResponse](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/RestoreResponse.smali) | `getExpirationTimeStamp`、`getFileId`、`getParentId`、`getUpdateTime`、`getVersion`、`isRecycleBin` |
| [ScreenCaptureEntity](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/ScreenCaptureEntity.smali) | `getDeviceCode`、`getName`、`getVersionCode` |
| [SendSmsBean](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/SendSmsBean.smali) | `getMobile`、`getSchoolCode`、`getSn`、`getUserId` |
| [ShareCacheEntity](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/ShareCacheEntity.smali) | `getAccountId`、`getCacheId`、`getFileId`、`getPreviewTime`、`getVersion` |
| [SubmitHomeworkStatus](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/SubmitHomeworkStatus.smali) | `getEntries`、`valueOf`、`values` |
| [TokenResponse](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/TokenResponse.smali) | `describeContents`、`getError`、`getResult`、`getSuccess`、`getTargetUrl`、`writeToParcel` |
| [UpdateRequest](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/UpdateRequest.smali) | `getFileId`、`getFileName`、`getFileUrl`、`getParentId`、`getType` |
| [UpdateResponse](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/UpdateResponse.smali) | `getVersion` |
| [UpdateSpecifiedItem](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/UpdateSpecifiedItem.smali) | `getFileId`、`getFromPage` |
| [User](../../../android/中育云笔记/smali_classes3/com/friday/common/entity/User.smali) | `getAccountId`、`getAccountName`、`getAlbumPermission`、`getCameraPermission`、`getHeadPhotoUrl`、`getScreenshotsPermission`、`getUnit` |

## com.friday.common.event

| 类 | 方法摘录 |
|---|---|
| [EventObserver](../../../android/中育云笔记/smali_classes3/com/friday/common/event/EventObserver.smali) | `onChanged` |

## com.friday.common.helper

| 类 | 方法摘录 |
|---|---|
| [GridSpacingItemDecoration](../../../android/中育云笔记/smali_classes3/com/friday/common/helper/GridSpacingItemDecoration.smali) | `getItemOffsets` |
| [RightListDecoration](../../../android/中育云笔记/smali_classes3/com/friday/common/helper/RightListDecoration.smali) | `onDraw` |

## com.friday.common.network

| 类 | 方法摘录 |
|---|---|
| [StudentSessionInterceptor](../../../android/中育云笔记/smali_classes3/com/friday/common/network/StudentSessionInterceptor.smali) | `intercept` |

## com.friday.common.property

| 类 | 方法摘录 |
|---|---|
| [BaseResponse](../../../android/中育云笔记/smali_classes3/com/friday/common/property/BaseResponse.smali) | `getCode`、`getData`、`getMsg` |

## com.friday.common.service

| 类 | 方法摘录 |
|---|---|
| [BaseLifecycleService](../../../android/中育云笔记/smali_classes3/com/friday/common/service/BaseLifecycleService.smali) | `onCreate`、`onDestroy` |

## com.friday.common.util

| 类 | 方法摘录 |
|---|---|
| [StudentState](../../../android/中育云笔记/smali_classes3/com/friday/common/util/StudentState.smali) | `valueOf`、`values` |
| [SyncException](../../../android/中育云笔记/smali_classes3/com/friday/common/util/SyncException.smali) | `getMessage` |

## com.friday.common.widget

| 类 | 方法摘录 |
|---|---|
| [FridayNoTouchViewPager](../../../android/中育云笔记/smali_classes3/com/friday/common/widget/FridayNoTouchViewPager.smali) | `onInterceptTouchEvent`、`onTouchEvent`、`setCurrentItem` |
| [ScaleImageView](../../../android/中育云笔记/smali_classes3/com/friday/common/widget/ScaleImageView.smali) | `onMeasure` |
| [SlideViewPager](../../../android/中育云笔记/smali_classes3/com/friday/common/widget/SlideViewPager.smali) | `onInterceptTouchEvent`、`onTouchEvent` |
| [TouchSwitchView](../../../android/中育云笔记/smali_classes3/com/friday/common/widget/TouchSwitchView.smali) | `onInterceptTouchEvent`、`setCanTouch` |

## com.friday.common.widget.dialog

| 类 | 方法摘录 |
|---|---|
| [BaseDialog](../../../android/中育云笔记/smali_classes3/com/friday/common/widget/dialog/BaseDialog.smali) | `onCreateDialog`、`onStart` |
| [FBIWarningDialog](../../../android/中育云笔记/smali_classes3/com/friday/common/widget/dialog/FBIWarningDialog.smali) | `onActivityCreated`、`onCreate`、`onCreateView`、`onStart` |
| [WPSDownloadDialog](../../../android/中育云笔记/smali_classes3/com/friday/common/widget/dialog/WPSDownloadDialog.smali) | `onActivityCreated`、`onCreate`、`onCreateView`、`onDestroy`、`onStart` |

## com.friday.document

| 类 | 方法摘录 |
|---|---|
| [DataBinderMapperImpl](../../../android/中育云笔记/smali_classes2/com/friday/document/DataBinderMapperImpl.smali) | `collectDependencies`、`convertBrIdToString`、`getDataBinder`、`getDataBinder`、`getLayoutId` |

## com.friday.document.adapter

| 类 | 方法摘录 |
|---|---|
| [DocumentAdapter](../../../android/中育云笔记/smali_classes3/com/friday/document/adapter/DocumentAdapter.smali) | `onBindViewHolder`、`onBindViewHolder`、`onCreateViewHolder` |
| [ImagePagerAdapter](../../../android/中育云笔记/smali_classes3/com/friday/document/adapter/ImagePagerAdapter.smali) | `getItemCount`、`onBindViewHolder`、`onCreateViewHolder` |
| [MultiModeFileEntity](../../../android/中育云笔记/smali_classes3/com/friday/document/adapter/MultiModeFileEntity.smali) | `getEntity`、`isInMultiSelectMode`、`isSelected` |
| [PreviewAdapter](../../../android/中育云笔记/smali_classes3/com/friday/document/adapter/PreviewAdapter.smali) | `onBindViewHolder`、`onCreateViewHolder` |
| [RecycleBinAdapter](../../../android/中育云笔记/smali_classes3/com/friday/document/adapter/RecycleBinAdapter.smali) | `onBindViewHolder`、`onBindViewHolder`、`onCreateViewHolder` |
| [RecycleBinPayloadKeys](../../../android/中育云笔记/smali_classes3/com/friday/document/adapter/RecycleBinPayloadKeys.smali) | `valueOf`、`values` |
| [ShareFileAdapter](../../../android/中育云笔记/smali_classes3/com/friday/document/adapter/ShareFileAdapter.smali) | `onBindViewHolder`、`onBindViewHolder`、`onCreateViewHolder` |
| [SyncFailedAdapter](../../../android/中育云笔记/smali_classes3/com/friday/document/adapter/SyncFailedAdapter.smali) | `convert` |
| [SyncFileAdapter](../../../android/中育云笔记/smali_classes3/com/friday/document/adapter/SyncFileAdapter.smali) | `convert` |
| [TeacherListShareAdapter](../../../android/中育云笔记/smali_classes3/com/friday/document/adapter/TeacherListShareAdapter.smali) | `onBindViewHolder`、`onBindViewHolder`、`onCreateViewHolder` |

## com.friday.document.model

| 类 | 方法摘录 |
|---|---|
| [AddRelationBean](../../../android/中育云笔记/smali_classes3/com/friday/document/model/AddRelationBean.smali) | `getShareId`、`getShareUserId` |
| [ConvertEntity](../../../android/中育云笔记/smali_classes3/com/friday/document/model/ConvertEntity.smali) | `getData`、`getError`、`getSuccess` |
| [FileDiffCallback](../../../android/中育云笔记/smali_classes3/com/friday/document/model/FileDiffCallback.smali) | `areContentsTheSame`、`areContentsTheSame`、`areItemsTheSame`、`areItemsTheSame` |
| [FolderLevelEntity](../../../android/中育云笔记/smali_classes3/com/friday/document/model/FolderLevelEntity.smali) | `getFileId`、`getFileName`、`getOwnerId`、`getOwnerName`、`getParentId`、`getShareTime` |
| [ManualSyncEntity](../../../android/中育云笔记/smali_classes3/com/friday/document/model/ManualSyncEntity.smali) | `getFileEntity`、`getSyncState`、`setSyncState` |
| [ResourceDeleteEntity](../../../android/中育云笔记/smali_classes3/com/friday/document/model/ResourceDeleteEntity.smali) | `getFileId`、`getResourceIdList` |
| [ShareAddMemberReqBean](../../../android/中育云笔记/smali_classes3/com/friday/document/model/ShareAddMemberReqBean.smali) | `getEzyCourses`、`getFileId` |
| [ShareClassEntity](../../../android/中育云笔记/smali_classes3/com/friday/document/model/ShareClassEntity.smali) | `getChecked`、`getDeleteMode`、`getId`、`getName`、`getShareStatus`、`setChecked`、`setDeleteMode` |
| [ShareDelMemberReqBean](../../../android/中育云笔记/smali_classes3/com/friday/document/model/ShareDelMemberReqBean.smali) | `getEzyCourseId`、`getFileId` |
| [ShareFile](../../../android/中育云笔记/smali_classes3/com/friday/document/model/ShareFile.smali) | `userId`、`getCoverFilePath`、`getCreateTime`、`getDirPath`、`getFileId`、`getFileName`、`getFileUrl` |
| [ShareIntentEntity](../../../android/中育云笔记/smali_classes3/com/friday/document/model/ShareIntentEntity.smali) | `getFileName`、`getFileType`、`getOriginalUserId`、`getOriginalUserName`、`getShareId` |
| [ShareListEntity](../../../android/中育云笔记/smali_classes3/com/friday/document/model/ShareListEntity.smali) | `getRoot`、`getShareFile`、`isSelected` |
| [StudentShareEntity](../../../android/中育云笔记/smali_classes3/com/friday/document/model/StudentShareEntity.smali) | `getShareFileList`、`getTotalCount` |
| [StudentShareEntityKt](../../../android/中育云笔记/smali_classes3/com/friday/document/model/StudentShareEntityKt.smali) | `toShareListEntity` |
| [TchByCloudEntity](../../../android/中育云笔记/smali_classes3/com/friday/document/model/TchByCloudEntity.smali) | `getPicture`、`getTeacherId`、`getTeacherName`、`getUpdateTime`、`isSelected`、`setSelected` |
| [TchListEntity](../../../android/中育云笔记/smali_classes3/com/friday/document/model/TchListEntity.smali) | `getTeachers` |

## com.friday.document.receiver

| 类 | 方法摘录 |
|---|---|
| [AliMessageReceiver](../../../android/中育云笔记/smali_classes3/com/friday/document/receiver/AliMessageReceiver.smali) | `onMessage`、`onNotification`、`onNotificationClickedWithNoAction`、`onNotificationOpened`、`onNotificationReceivedInApp`、`onNotificationRemoved` |

## com.friday.document.view

| 类 | 方法摘录 |
|---|---|
| [FolderPreviewFragment](../../../android/中育云笔记/smali_classes3/com/friday/document/view/FolderPreviewFragment.smali) | `getLayoutId`、`initData`、`initView`、`onClick`、`onResume` |
| [Hilt_FolderPreviewFragment](../../../android/中育云笔记/smali_classes3/com/friday/document/view/Hilt_FolderPreviewFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_ManualSyncFileDialog](../../../android/中育云笔记/smali_classes3/com/friday/document/view/Hilt_ManualSyncFileDialog.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_NewestPreviewFragment](../../../android/中育云笔记/smali_classes3/com/friday/document/view/Hilt_NewestPreviewFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_RecycleBinPreviewFragment](../../../android/中育云笔记/smali_classes3/com/friday/document/view/Hilt_RecycleBinPreviewFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_TeacherOnlyActivity](../../../android/中育云笔记/smali_classes3/com/friday/document/view/Hilt_TeacherOnlyActivity.smali) | `createComponentManager`、`generatedComponent`、`getDefaultViewModelProviderFactory`、`inject`、`onCreate`、`onDestroy` |
| [ManualSyncFileDialog](../../../android/中育云笔记/smali_classes3/com/friday/document/view/ManualSyncFileDialog.smali) | `getLayoutId`、`initData`、`onStart`、`updateTitle` |
| [NewestPreviewFragment](../../../android/中育云笔记/smali_classes3/com/friday/document/view/NewestPreviewFragment.smali) | `getLayoutId`、`initData`、`initView`、`onClick`、`onResume` |
| [RecycleBinPreviewFragment](../../../android/中育云笔记/smali_classes3/com/friday/document/view/RecycleBinPreviewFragment.smali) | `getLayoutId`、`initData`、`initView`、`onClick`、`onResume` |
| [TeacherOnlyActivity](../../../android/中育云笔记/smali_classes3/com/friday/document/view/TeacherOnlyActivity.smali) | `getLayoutId`、`initData` |

## com.friday.document.view.document

| 类 | 方法摘录 |
|---|---|
| [BaseDocumentFragment](../../../android/中育云笔记/smali_classes3/com/friday/document/view/document/BaseDocumentFragment.smali) | `moveToPosition` |
| [FileListFragment](../../../android/中育云笔记/smali_classes3/com/friday/document/view/document/FileListFragment.smali) | `initObserver`、`getLayoutId`、`initData`、`initView` |
| [FolderFragment](../../../android/中育云笔记/smali_classes3/com/friday/document/view/document/FolderFragment.smali) | `initObserver`、`getLayoutId`、`initData`、`initView`、`onClick`、`onResume` |
| [Hilt_FileListFragment](../../../android/中育云笔记/smali_classes3/com/friday/document/view/document/Hilt_FileListFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_FolderFragment](../../../android/中育云笔记/smali_classes3/com/friday/document/view/document/Hilt_FolderFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_NewestFragment](../../../android/中育云笔记/smali_classes3/com/friday/document/view/document/Hilt_NewestFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_RecycleBinFragment](../../../android/中育云笔记/smali_classes3/com/friday/document/view/document/Hilt_RecycleBinFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [NewestFragment](../../../android/中育云笔记/smali_classes3/com/friday/document/view/document/NewestFragment.smali) | `getLayoutId`、`initData`、`initDataSource`、`initView`、`onClick`、`onDestroy` |
| [RecycleBinFragment](../../../android/中育云笔记/smali_classes3/com/friday/document/view/document/RecycleBinFragment.smali) | `initObserver`、`getLayoutId`、`initData`、`initView` |

## com.friday.document.view.preview

| 类 | 方法摘录 |
|---|---|
| [EmptyPreviewFragment](../../../android/中育云笔记/smali_classes3/com/friday/document/view/preview/EmptyPreviewFragment.smali) | `getLayoutId`、`initData`、`needHideLoadingOnDestroy`、`onViewCreated` |
| [Hilt_PdfPreviewFragment](../../../android/中育云笔记/smali_classes3/com/friday/document/view/preview/Hilt_PdfPreviewFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_TxtPreviewFragment](../../../android/中育云笔记/smali_classes3/com/friday/document/view/preview/Hilt_TxtPreviewFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_VideoPreviewFragment](../../../android/中育云笔记/smali_classes3/com/friday/document/view/preview/Hilt_VideoPreviewFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [MicroClassPreviewFragment](../../../android/中育云笔记/smali_classes3/com/friday/document/view/preview/MicroClassPreviewFragment.smali) | `getLayoutId`、`initData`、`needHideLoadingOnDestroy`、`onViewCreated` |
| [NotePreviewFragment](../../../android/中育云笔记/smali_classes3/com/friday/document/view/preview/NotePreviewFragment.smali) | `getLayoutId`、`initData`、`initView`、`needHideLoadingOnDestroy` |
| [PdfPreviewFragment](../../../android/中育云笔记/smali_classes3/com/friday/document/view/preview/PdfPreviewFragment.smali) | `getLayoutId`、`initData`、`needHideLoadingOnDestroy`、`onViewCreated` |
| [PicturePreviewFragment](../../../android/中育云笔记/smali_classes3/com/friday/document/view/preview/PicturePreviewFragment.smali) | `getLayoutId`、`initData`、`needHideLoadingOnDestroy` |
| [TxtPreviewFragment](../../../android/中育云笔记/smali_classes3/com/friday/document/view/preview/TxtPreviewFragment.smali) | `getLayoutId`、`initData`、`needHideLoadingOnDestroy` |
| [VideoPreviewFragment](../../../android/中育云笔记/smali_classes3/com/friday/document/view/preview/VideoPreviewFragment.smali) | `getLayoutId`、`initData`、`needHideLoadingOnDestroy`、`onDestroy`、`onPause` |

## com.friday.document.view.share

| 类 | 方法摘录 |
|---|---|
| [Hilt_ShareBaseFileFragment](../../../android/中育云笔记/smali_classes3/com/friday/document/view/share/Hilt_ShareBaseFileFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_ShareByTeacherFragment](../../../android/中育云笔记/smali_classes3/com/friday/document/view/share/Hilt_ShareByTeacherFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_ShareListFragment](../../../android/中育云笔记/smali_classes3/com/friday/document/view/share/Hilt_ShareListFragment.smali) | `getContext`、`inject`、`onAttach`、`onAttach`、`onGetLayoutInflater` |
| [Hilt_ShareSearchActivity](../../../android/中育云笔记/smali_classes3/com/friday/document/view/share/Hilt_ShareSearchActivity.smali) | `createComponentManager`、`generatedComponent`、`getDefaultViewModelProviderFactory`、`inject`、`onCreate`、`onDestroy` |
| [Hilt_ShareTeacherFileFragment](../../../android/中育云笔记/smali_classes3/com/friday/document/view/share/Hilt_ShareTeacherFileFragment.smali) | `getContext`、`inject`、`onAttach`、`onAttach`、`onGetLayoutInflater` |
| [Hilt_StudentShareFragment](../../../android/中育云笔记/smali_classes3/com/friday/document/view/share/Hilt_StudentShareFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_StudentSharePreviewFragment](../../../android/中育云笔记/smali_classes3/com/friday/document/view/share/Hilt_StudentSharePreviewFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [ShareBaseFileFragment](../../../android/中育云笔记/smali_classes3/com/friday/document/view/share/ShareBaseFileFragment.smali) | `initData`、`initObserver`、`initView`、`onClick` |
| [ShareByTeacherFragment](../../../android/中育云笔记/smali_classes3/com/friday/document/view/share/ShareByTeacherFragment.smali) | `initObserver`、`getLayoutId`、`initClick`、`initData`、`initView`、`onResume` |
| [ShareListFragment](../../../android/中育云笔记/smali_classes3/com/friday/document/view/share/ShareListFragment.smali) | `getLayoutId` |
| [ShareSearchActivity](../../../android/中育云笔记/smali_classes3/com/friday/document/view/share/ShareSearchActivity.smali) | `getLayoutId`、`initData`、`initDataSource`、`initView`、`onOptionsItemSelected` |
| [ShareSearchAdapter](../../../android/中育云笔记/smali_classes3/com/friday/document/view/share/ShareSearchAdapter.smali) | `onBindViewHolder`、`onCreateViewHolder` |
| [ShareTeacherFileFragment](../../../android/中育云笔记/smali_classes3/com/friday/document/view/share/ShareTeacherFileFragment.smali) | `getLayoutId`、`initView` |
| [StudentShareFragment](../../../android/中育云笔记/smali_classes3/com/friday/document/view/share/StudentShareFragment.smali) | `getLayoutId`、`initData`、`initView` |
| [StudentSharePreviewFragment](../../../android/中育云笔记/smali_classes3/com/friday/document/view/share/StudentSharePreviewFragment.smali) | `getLayoutId`、`initData`、`initView`、`onClick` |

## com.friday.document.view.viewer

| 类 | 方法摘录 |
|---|---|
| [Hilt_ImagePreviewActivity](../../../android/中育云笔记/smali_classes3/com/friday/document/view/viewer/Hilt_ImagePreviewActivity.smali) | `createComponentManager`、`generatedComponent`、`getDefaultViewModelProviderFactory`、`inject`、`onCreate`、`onDestroy` |
| [Hilt_MicroClassPlayActivity](../../../android/中育云笔记/smali_classes3/com/friday/document/view/viewer/Hilt_MicroClassPlayActivity.smali) | `createComponentManager`、`generatedComponent`、`getDefaultViewModelProviderFactory`、`inject`、`onCreate`、`onDestroy` |
| [Hilt_PdfViewerActivity](../../../android/中育云笔记/smali_classes3/com/friday/document/view/viewer/Hilt_PdfViewerActivity.smali) | `createComponentManager`、`generatedComponent`、`getDefaultViewModelProviderFactory`、`inject`、`onCreate`、`onDestroy` |
| [Hilt_TxtEditActivity](../../../android/中育云笔记/smali_classes3/com/friday/document/view/viewer/Hilt_TxtEditActivity.smali) | `createComponentManager`、`generatedComponent`、`getDefaultViewModelProviderFactory`、`inject`、`onCreate`、`onDestroy` |
| [Hilt_VideoPlayerActivity](../../../android/中育云笔记/smali_classes3/com/friday/document/view/viewer/Hilt_VideoPlayerActivity.smali) | `createComponentManager`、`generatedComponent`、`getDefaultViewModelProviderFactory`、`inject`、`onCreate`、`onDestroy` |
| [ImagePreviewActivity](../../../android/中育云笔记/smali_classes3/com/friday/document/view/viewer/ImagePreviewActivity.smali) | `getLayoutId`、`initData` |
| [ImagePreviewDialogFragment](../../../android/中育云笔记/smali_classes3/com/friday/document/view/viewer/ImagePreviewDialogFragment.smali) | `initClick`、`getLayoutId`、`initData`、`onCreate`、`onViewCreated` |
| [MicroClassPlayActivity](../../../android/中育云笔记/smali_classes3/com/friday/document/view/viewer/MicroClassPlayActivity.smali) | `getLayoutId`、`initData`、`initView` |
| [PdfViewerActivity](../../../android/中育云笔记/smali_classes3/com/friday/document/view/viewer/PdfViewerActivity.smali) | `getLayoutId`、`initData` |
| [TxtEditActivity](../../../android/中育云笔记/smali_classes3/com/friday/document/view/viewer/TxtEditActivity.smali) | `getLayoutId`、`initData`、`onBackPressed` |
| [VideoPlayerActivity](../../../android/中育云笔记/smali_classes3/com/friday/document/view/viewer/VideoPlayerActivity.smali) | `getLayoutId`、`initData`、`onBackPressed`、`onDestroy`、`onPause`、`onResume` |

## com.friday.lecture

| 类 | 方法摘录 |
|---|---|
| [DataBinderMapperImpl](../../../android/中育云笔记/smali_classes4/com/friday/lecture/DataBinderMapperImpl.smali) | `collectDependencies`、`convertBrIdToString`、`getDataBinder`、`getDataBinder`、`getLayoutId` |

## com.friday.lecture.adapter

| 类 | 方法摘录 |
|---|---|
| [CodeAdapter](../../../android/中育云笔记/smali_classes4/com/friday/lecture/adapter/CodeAdapter.smali) | `convert` |
| [DemonstratingAdapter](../../../android/中育云笔记/smali_classes4/com/friday/lecture/adapter/DemonstratingAdapter.smali) | `convert` |
| [KeyboardAdapter](../../../android/中育云笔记/smali_classes4/com/friday/lecture/adapter/KeyboardAdapter.smali) | `convert` |
| [OnlineListAdapter](../../../android/中育云笔记/smali_classes4/com/friday/lecture/adapter/OnlineListAdapter.smali) | `convert` |
| [PaintColorAdapter](../../../android/中育云笔记/smali_classes4/com/friday/lecture/adapter/PaintColorAdapter.smali) | `convert` |
| [ViewSubjectiveAnswerAdapter](../../../android/中育云笔记/smali_classes4/com/friday/lecture/adapter/ViewSubjectiveAnswerAdapter.smali) | `convert` |

## com.friday.lecture.floatwindow

| 类 | 方法摘录 |
|---|---|
| [FloatWindowService](../../../android/中育云笔记/smali_classes4/com/friday/lecture/floatwindow/FloatWindowService.smali) | `onCreate`、`onDestroy` |
| [FloatWindowStatus](../../../android/中育云笔记/smali_classes4/com/friday/lecture/floatwindow/FloatWindowStatus.smali) | `valueOf`、`values` |
| [StudentDemoService](../../../android/中育云笔记/smali_classes4/com/friday/lecture/floatwindow/StudentDemoService.smali) | `onCreate`、`onDestroy` |

## com.friday.lecture.floatwindow.canvas

| 类 | 方法摘录 |
|---|---|
| [CanvasListLayout](../../../android/中育云笔记/smali_classes4/com/friday/lecture/floatwindow/canvas/CanvasListLayout.smali) | `getTheAdapter`、`onAttachedToWindow` |
| [NonSlidableViewPager](../../../android/中育云笔记/smali_classes4/com/friday/lecture/floatwindow/canvas/NonSlidableViewPager.smali) | `setMyScroller`、`onInterceptTouchEvent`、`onTouchEvent` |
| [SimpleCanvasLayout](../../../android/中育云笔记/smali_classes4/com/friday/lecture/floatwindow/canvas/SimpleCanvasLayout.smali) | `getGcvPaintEntity`、`onAttachedToWindow`、`setImage`、`setOnClose` |

## com.friday.lecture.floatwindow.options

| 类 | 方法摘录 |
|---|---|
| [OptionLayout](../../../android/中育云笔记/smali_classes4/com/friday/lecture/floatwindow/options/OptionLayout.smali) | `getTouchDownX`、`getTouchDownY`、`onAttachedToWindow`、`onInterceptTouchEvent`、`setAirPlayState`、`setClassState`、`setTouchDownX` |

## com.friday.lecture.floatwindow.studentdemo

| 类 | 方法摘录 |
|---|---|
| [StudentDemoListLayout](../../../android/中育云笔记/smali_classes4/com/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout.smali) | `onAttachedToWindow`、`onDetachedFromWindow` |

## com.friday.lecture.floatwindow.viewanswer

| 类 | 方法摘录 |
|---|---|
| [ViewAnswerObjectiveLayout](../../../android/中育云笔记/smali_classes4/com/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout.smali) | `onAttachedToWindow` |
| [ViewAnswerSubjectiveLayout](../../../android/中育云笔记/smali_classes4/com/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout.smali) | `onAttachedToWindow` |

## com.friday.lecture.model

| 类 | 方法摘录 |
|---|---|
| [ClassTestHelper](../../../android/中育云笔记/smali_classes4/com/friday/lecture/model/ClassTestHelper.smali) | `defaultDemonstratingList`、`defaultSelectedList`、`getName`、`getUserId`、`resetSelectedAndDemoList`、`addSubmitted`、`classEnd` |
| [ConnectMode](../../../android/中育云笔记/smali_classes4/com/friday/lecture/model/ConnectMode.smali) | `getKeyboardList`、`getPasswordMaxSize` |
| [ConnectionStatus](../../../android/中育云笔记/smali_classes4/com/friday/lecture/model/ConnectionStatus.smali) | `getEntries`、`valueOf`、`values` |
| [ConnectionStatusKt](../../../android/中育云笔记/smali_classes4/com/friday/lecture/model/ConnectionStatusKt.smali) | `convert2ConnectMode` |
| [KeyboardData](../../../android/中育云笔记/smali_classes4/com/friday/lecture/model/KeyboardData.smali) | `getItemType`、`getValue`、`isValue` |
| [PaintColorEntity](../../../android/中育云笔记/smali_classes4/com/friday/lecture/model/PaintColorEntity.smali) | `getColor`、`getSelected`、`setSelected` |
| [PolicyEntity](../../../android/中育云笔记/smali_classes4/com/friday/lecture/model/PolicyEntity.smali) | `isCanLive` |
| [SubjectiveHomeworkAnswer](../../../android/中育云笔记/smali_classes4/com/friday/lecture/model/SubjectiveHomeworkAnswer.smali) | `getLocalPath`、`getRemoteUrl`、`getStudent`、`setLocalPath` |

## com.friday.lecture.service

| 类 | 方法摘录 |
|---|---|
| [MyMqttService](../../../android/中育云笔记/smali_classes4/com/friday/lecture/service/MyMqttService.smali) | `onCreate`、`onDestroy` |

## com.friday.lecture.view

| 类 | 方法摘录 |
|---|---|
| [Hilt_LectureDialogFragment](../../../android/中育云笔记/smali_classes4/com/friday/lecture/view/Hilt_LectureDialogFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [LectureDialogFragment](../../../android/中育云笔记/smali_classes4/com/friday/lecture/view/LectureDialogFragment.smali) | `initObserver`、`initView`、`getLayoutId`、`initData`、`onClick`、`onCreate`、`onDestroy` |

## com.friday.lecture.widget

| 类 | 方法摘录 |
|---|---|
| [GlobalCanvasView](../../../android/中育云笔记/smali_classes4/com/friday/lecture/widget/GlobalCanvasView.smali) | `getBitmap`、`getMode`、`getPaintColor`、`getPaintSize`、`onDraw`、`onTouch`、`setBitmap` |
| [LifecycleFrameLayout](../../../android/中育云笔记/smali_classes4/com/friday/lecture/widget/LifecycleFrameLayout.smali) | `getMRegistry`、`getLifecycle`、`onAttachedToWindow`、`onDetachedFromWindow`、`onWindowVisibilityChanged` |

## com.friday.login

| 类 | 方法摘录 |
|---|---|
| [DataBinderMapperImpl](../../../android/中育云笔记/smali_classes4/com/friday/login/DataBinderMapperImpl.smali) | `collectDependencies`、`convertBrIdToString`、`getDataBinder`、`getDataBinder`、`getLayoutId` |

## com.friday.login.service

| 类 | 方法摘录 |
|---|---|
| [GatewayBean](../../../android/中育云笔记/smali_classes4/com/friday/login/service/GatewayBean.smali) | `getCode`、`getName`、`getServer`、`setCode`、`setName`、`setServer` |

## com.friday.login.view

| 类 | 方法摘录 |
|---|---|
| [Hilt_LoginActivity](../../../android/中育云笔记/smali_classes4/com/friday/login/view/Hilt_LoginActivity.smali) | `createComponentManager`、`generatedComponent`、`getDefaultViewModelProviderFactory`、`inject`、`onCreate`、`onDestroy` |
| [Hilt_SMSVerificationDialog](../../../android/中育云笔记/smali_classes4/com/friday/login/view/Hilt_SMSVerificationDialog.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [LoginActivity](../../../android/中育云笔记/smali_classes4/com/friday/login/view/LoginActivity.smali) | `dispatchKeyEvent`、`getLayoutId`、`initData`、`initDataSource`、`initView`、`onClick` |
| [SMSVerificationDialog](../../../android/中育云笔记/smali_classes4/com/friday/login/view/SMSVerificationDialog.smali) | `getLayoutId`、`initData`、`onCreate`、`onDestroy`、`onStart` |

## com.friday.main

| 类 | 方法摘录 |
|---|---|
| [DataBinderMapperImpl](../../../android/中育云笔记/smali_classes4/com/friday/main/DataBinderMapperImpl.smali) | `collectDependencies`、`convertBrIdToString`、`getDataBinder`、`getDataBinder`、`getLayoutId` |

## com.friday.main.adapter

| 类 | 方法摘录 |
|---|---|
| [FolderMoveAdapter](../../../android/中育云笔记/smali_classes4/com/friday/main/adapter/FolderMoveAdapter.smali) | `convert` |
| [FullScreenPreviewAdapter](../../../android/中育云笔记/smali_classes4/com/friday/main/adapter/FullScreenPreviewAdapter.smali) | `convert` |
| [PathNameAdapter](../../../android/中育云笔记/smali_classes4/com/friday/main/adapter/PathNameAdapter.smali) | `convert` |
| [SearchAdapter](../../../android/中育云笔记/smali_classes4/com/friday/main/adapter/SearchAdapter.smali) | `onBindViewHolder`、`onCreateViewHolder` |
| [TabAdapter](../../../android/中育云笔记/smali_classes4/com/friday/main/adapter/TabAdapter.smali) | `convert` |

## com.friday.main.model

| 类 | 方法摘录 |
|---|---|
| [AddRelationResponse](../../../android/中育云笔记/smali_classes4/com/friday/main/model/AddRelationResponse.smali) | `getIsexist` |
| [AddShareTableRequest](../../../android/中育云笔记/smali_classes4/com/friday/main/model/AddShareTableRequest.smali) | `getFileId`、`getFileName`、`getType`、`getUserName` |
| [FileDiffCallback](../../../android/中育云笔记/smali_classes4/com/friday/main/model/FileDiffCallback.smali) | `areContentsTheSame`、`areContentsTheSame`、`areItemsTheSame`、`areItemsTheSame` |
| [GetShareIdResponse](../../../android/中育云笔记/smali_classes4/com/friday/main/model/GetShareIdResponse.smali) | `getShareId` |
| [NimInfo](../../../android/中育云笔记/smali_classes4/com/friday/main/model/NimInfo.smali) | `getNimId`、`getNimRoomName`、`getNimToken`、`getUserId` |
| [NoteResource](../../../android/中育云笔记/smali_classes4/com/friday/main/model/NoteResource.smali) | `getLocal`、`getService` |
| [OssTokenResponse](../../../android/中育云笔记/smali_classes4/com/friday/main/model/OssTokenResponse.smali) | `getAccessKeyId`、`getAccessKeySecret`、`getRequestId`、`getSecurityToken` |
| [ReceiveData](../../../android/中育云笔记/smali_classes4/com/friday/main/model/ReceiveData.smali) | `getFilename`、`getFiletype`、`getSharername` |
| [RestoreReq](../../../android/中育云笔记/smali_classes4/com/friday/main/model/RestoreReq.smali) | `getFileId`、`getParentId` |
| [Result](../../../android/中育云笔记/smali_classes4/com/friday/main/model/Result.smali) | `getAppType`、`getAppVersionId`、`getCreationTime`、`getCreatorUserId`、`getDescription`、`getDisabled`、`getDownloads` |
| [VersionUpdate](../../../android/中育云笔记/smali_classes4/com/friday/main/model/VersionUpdate.smali) | `getError`、`getResult`、`getSuccess`、`getTargetUrl`、`getUnAuthorizedRequest`、`get__abp` |

## com.friday.main.view

| 类 | 方法摘录 |
|---|---|
| [AppUpdateDialog](../../../android/中育云笔记/smali_classes4/com/friday/main/view/AppUpdateDialog.smali) | `getLayoutId`、`initData`、`onCreate`、`onStart` |
| [DBActivity](../../../android/中育云笔记/smali_classes4/com/friday/main/view/DBActivity.smali) | `onCreate` |
| [FolderMoveActivity](../../../android/中育云笔记/smali_classes4/com/friday/main/view/FolderMoveActivity.smali) | `getLayoutId`、`initData`、`initDataSource`、`initView` |
| [FullScreenPreviewActivity](../../../android/中育云笔记/smali_classes4/com/friday/main/view/FullScreenPreviewActivity.smali) | `getLayoutId`、`initData`、`initDataSource`、`initView`、`onClick`、`onResume` |
| [Hilt_AppUpdateDialog](../../../android/中育云笔记/smali_classes4/com/friday/main/view/Hilt_AppUpdateDialog.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_DBActivity](../../../android/中育云笔记/smali_classes4/com/friday/main/view/Hilt_DBActivity.smali) | `createComponentManager`、`generatedComponent`、`getDefaultViewModelProviderFactory`、`inject`、`onCreate`、`onDestroy` |
| [Hilt_FolderMoveActivity](../../../android/中育云笔记/smali_classes4/com/friday/main/view/Hilt_FolderMoveActivity.smali) | `createComponentManager`、`generatedComponent`、`getDefaultViewModelProviderFactory`、`inject`、`onCreate`、`onDestroy` |
| [Hilt_FullScreenPreviewActivity](../../../android/中育云笔记/smali_classes4/com/friday/main/view/Hilt_FullScreenPreviewActivity.smali) | `createComponentManager`、`generatedComponent`、`getDefaultViewModelProviderFactory`、`inject`、`onCreate`、`onDestroy` |
| [Hilt_HomeActivity](../../../android/中育云笔记/smali_classes4/com/friday/main/view/Hilt_HomeActivity.smali) | `createComponentManager`、`generatedComponent`、`getDefaultViewModelProviderFactory`、`inject`、`onCreate`、`onDestroy` |
| [Hilt_HuiweiAppUpdateDialog](../../../android/中育云笔记/smali_classes4/com/friday/main/view/Hilt_HuiweiAppUpdateDialog.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_SearchActivity](../../../android/中育云笔记/smali_classes4/com/friday/main/view/Hilt_SearchActivity.smali) | `createComponentManager`、`generatedComponent`、`getDefaultViewModelProviderFactory`、`inject`、`onCreate`、`onDestroy` |
| [HomeActivity](../../../android/中育云笔记/smali_classes4/com/friday/main/view/HomeActivity.smali) | `getLayoutId`、`initData`、`initFragment`、`initView`、`onBackPressed`、`onClick`、`onDestroy` |
| [HuiweiAppUpdateDialog](../../../android/中育云笔记/smali_classes4/com/friday/main/view/HuiweiAppUpdateDialog.smali) | `getLayoutId`、`initData`、`onCreate`、`onStart` |
| [SearchActivity](../../../android/中育云笔记/smali_classes4/com/friday/main/view/SearchActivity.smali) | `getLayoutId`、`initData`、`initDataSource`、`initView`、`onOptionsItemSelected` |

## com.friday.paint

| 类 | 方法摘录 |
|---|---|
| [DataBinderMapperImpl](../../../android/中育云笔记/smali_classes4/com/friday/paint/DataBinderMapperImpl.smali) | `collectDependencies`、`convertBrIdToString`、`getDataBinder`、`getDataBinder`、`getLayoutId` |

## com.friday.paint.adapter

| 类 | 方法摘录 |
|---|---|
| [NoteFragmentStateAdapter](../../../android/中育云笔记/smali_classes4/com/friday/paint/adapter/NoteFragmentStateAdapter.smali) | `containsItem`、`createFragment`、`getData`、`getItemCount`、`getItemId` |
| [OptionsAdapter](../../../android/中育云笔记/smali_classes4/com/friday/paint/adapter/OptionsAdapter.smali) | `convert` |
| [OptionsListAdapter](../../../android/中育云笔记/smali_classes4/com/friday/paint/adapter/OptionsListAdapter.smali) | `convert` |
| [ThumbnailListAdapter](../../../android/中育云笔记/smali_classes4/com/friday/paint/adapter/ThumbnailListAdapter.smali) | `addDraggableModule`、`convert`、`convert`、`convert`、`convert`、`updateSelectedItem`、`updateThumbnailExceptCurrent` |

## com.friday.paint.dialog

| 类 | 方法摘录 |
|---|---|
| [HomeworkSubmitConfirmDialog](../../../android/中育云笔记/smali_classes4/com/friday/paint/dialog/HomeworkSubmitConfirmDialog.smali) | `onActivityCreated`、`onCreate`、`onCreateView`、`onStart` |
| [ObjectiveHomeworkSubmitDialog](../../../android/中育云笔记/smali_classes4/com/friday/paint/dialog/ObjectiveHomeworkSubmitDialog.smali) | `startBtEnableStatusJob`、`getLayoutId`、`initData`、`onCreate`、`onStart` |
| [ReceiveClassTestDialog](../../../android/中育云笔记/smali_classes4/com/friday/paint/dialog/ReceiveClassTestDialog.smali) | `onActivityCreated`、`onCreate`、`onCreateView`、`onStart` |

## com.friday.paint.model

| 类 | 方法摘录 |
|---|---|
| [IPaintMenuController](../../../android/中育云笔记/smali_classes4/com/friday/paint/model/IPaintMenuController.smali) | `addNote`、`deleteNote`、`getNotesCount`、`getSavePath`、`goToNote`、`saveFile`、`updateFile` |
| [NoteListEntity](../../../android/中育云笔记/smali_classes4/com/friday/paint/model/NoteListEntity.smali) | `getInClass`、`getNoteDir`、`getSelected`、`getThumbnailFile`、`setInClass`、`setNoteDir`、`setSelected` |
| [PaintEntity](../../../android/中育云笔记/smali_classes4/com/friday/paint/model/PaintEntity.smali) | `getPath` |

## com.friday.paint.view

| 类 | 方法摘录 |
|---|---|
| [Hilt_NoteActivity](../../../android/中育云笔记/smali_classes4/com/friday/paint/view/Hilt_NoteActivity.smali) | `createComponentManager`、`generatedComponent`、`getDefaultViewModelProviderFactory`、`inject`、`onCreate`、`onDestroy` |
| [Hilt_StudentPaintFragment](../../../android/中育云笔记/smali_classes4/com/friday/paint/view/Hilt_StudentPaintFragment.smali) | `getContext`、`inject`、`onAttach`、`onAttach`、`onGetLayoutInflater` |
| [Hilt_ThePaintFragment](../../../android/中育云笔记/smali_classes4/com/friday/paint/view/Hilt_ThePaintFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_TheSketchFragment](../../../android/中育云笔记/smali_classes4/com/friday/paint/view/Hilt_TheSketchFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [NoteActivity](../../../android/中育云笔记/smali_classes4/com/friday/paint/view/NoteActivity.smali) | `getLayoutId`、`initData`、`onBackPressed`、`onCreate`、`onPause`、`onResume` |
| [StudentPaintFragment](../../../android/中育云笔记/smali_classes4/com/friday/paint/view/StudentPaintFragment.smali) | `initObserver`、`base64ToBitmap`、`getViewModel`、`handleHomework`、`initData`、`onResume`、`saveScreenShoot` |
| [ThePaintFragment](../../../android/中育云笔记/smali_classes4/com/friday/paint/view/ThePaintFragment.smali) | `initClick`、`initObserver`、`convertEnable`、`getIClassManager`、`getLayoutId`、`initData`、`initDrawerRight` |
| [TheSketchFragment](../../../android/中育云笔记/smali_classes4/com/friday/paint/view/TheSketchFragment.smali) | `checkImageSafety`、`getLayoutId`、`initData`、`onPause` |

## com.friday.paint.view.six

| 类 | 方法摘录 |
|---|---|
| [Hilt_NewNoteActivity](../../../android/中育云笔记/smali_classes4/com/friday/paint/view/six/Hilt_NewNoteActivity.smali) | `createComponentManager`、`generatedComponent`、`getDefaultViewModelProviderFactory`、`inject`、`onCreate`、`onDestroy` |
| [Hilt_NewPaintFragment](../../../android/中育云笔记/smali_classes4/com/friday/paint/view/six/Hilt_NewPaintFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_NewStudentPaintFragment](../../../android/中育云笔记/smali_classes4/com/friday/paint/view/six/Hilt_NewStudentPaintFragment.smali) | `getContext`、`inject`、`onAttach`、`onAttach`、`onGetLayoutInflater` |
| [NewNoteActivity](../../../android/中育云笔记/smali_classes4/com/friday/paint/view/six/NewNoteActivity.smali) | `getViewModel`、`initFragment`、`initViewModel`、`isRestoreArgsMissing`、`getLayoutId`、`initData`、`onCreate` |
| [NewPaintFragment](../../../android/中育云笔记/smali_classes4/com/friday/paint/view/six/NewPaintFragment.smali) | `changeNote`、`checkImageSafety`、`convertEnable`、`getHomeworkViewModel`、`getNoteFragment`、`getViewModel`、`handleMdbUpdate` |
| [NewStudentPaintFragment](../../../android/中育云笔记/smali_classes4/com/friday/paint/view/six/NewStudentPaintFragment.smali) | `base64ToBitmap`、`getViewModel`、`getViewModel2`、`handleHomework`、`initObserver`、`saveScreenShoot`、`startBtEnableStatusJob` |
| [NewThumbnailListAdapter](../../../android/中育云笔记/smali_classes4/com/friday/paint/view/six/NewThumbnailListAdapter.smali) | `addDraggableModule`、`convert`、`convert`、`convert`、`convert`、`updateSelectedItem`、`updateThumbnailExceptCurrent` |

## com.friday.user

| 类 | 方法摘录 |
|---|---|
| [DataBinderMapperImpl](../../../android/中育云笔记/smali_classes5/com/friday/user/DataBinderMapperImpl.smali) | `collectDependencies`、`convertBrIdToString`、`getDataBinder`、`getDataBinder`、`getLayoutId` |

## com.friday.user.adapter

| 类 | 方法摘录 |
|---|---|
| [UserMenuAdapter](../../../android/中育云笔记/smali_classes5/com/friday/user/adapter/UserMenuAdapter.smali) | `convert` |
| [UserViewPageAdapter](../../../android/中育云笔记/smali_classes5/com/friday/user/adapter/UserViewPageAdapter.smali) | `getCount`、`getItem` |

## com.friday.user.view

| 类 | 方法摘录 |
|---|---|
| [AboutFragment](../../../android/中育云笔记/smali_classes5/com/friday/user/view/AboutFragment.smali) | `onCreateView` |
| [HelpFragment](../../../android/中育云笔记/smali_classes5/com/friday/user/view/HelpFragment.smali) | `onCreateView` |
| [Hilt_AboutFragment](../../../android/中育云笔记/smali_classes5/com/friday/user/view/Hilt_AboutFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_HelpFragment](../../../android/中育云笔记/smali_classes5/com/friday/user/view/Hilt_HelpFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_PersonalInfoFragment](../../../android/中育云笔记/smali_classes5/com/friday/user/view/Hilt_PersonalInfoFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_UserFragment](../../../android/中育云笔记/smali_classes5/com/friday/user/view/Hilt_UserFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [PersonalInfoFragment](../../../android/中育云笔记/smali_classes5/com/friday/user/view/PersonalInfoFragment.smali) | `onCreateView` |
| [UserFragment](../../../android/中育云笔记/smali_classes5/com/friday/user/view/UserFragment.smali) | `getLayoutId`、`initData`、`initDataSource` |

## com.friday.user.work

| 类 | 方法摘录 |
|---|---|
| [ClearCacheWork](../../../android/中育云笔记/smali_classes5/com/friday/user/work/ClearCacheWork.smali) | `doWork` |

## com.zykj.blackboard.core.action

| 类 | 方法摘录 |
|---|---|
| [GeometryActionEnum](../../../android/中育云笔记/smali_classes5/com/zykj/blackboard/core/action/GeometryActionEnum.smali) | `valueOf`、`values` |

## com.zykj.blackboard.core.canvas

| 类 | 方法摘录 |
|---|---|
| [SketchPlayView](../../../android/中育云笔记/smali_classes5/com/zykj/blackboard/core/canvas/SketchPlayView.smali) | `onDetachedFromWindow`、`onTouchEvent` |
| [SketchRecorderView](../../../android/中育云笔记/smali_classes5/com/zykj/blackboard/core/canvas/SketchRecorderView.smali) | `onDetachedFromWindow`、`onTouchEvent` |

## com.zykj.blackboard.core.canvas.view

| 类 | 方法摘录 |
|---|---|
| [ActiveView](../../../android/中育云笔记/smali_classes5/com/zykj/blackboard/core/canvas/view/ActiveView.smali) | `clear`、`onDraw` |
| [BackgroundView](../../../android/中育云笔记/smali_classes5/com/zykj/blackboard/core/canvas/view/BackgroundView.smali) | `getBackgroundLineConfig`、`getMyBackgroundColor`、`onDraw`、`refresh`、`setBackgroundLineConfig`、`setMatrix`、`setMyBackgroundColor` |
| [FixView](../../../android/中育云笔记/smali_classes5/com/zykj/blackboard/core/canvas/view/FixView.smali) | `getMBitmap`、`onDraw`、`reset` |
| [MaskView](../../../android/中育云笔记/smali_classes5/com/zykj/blackboard/core/canvas/view/MaskView.smali) | `getMBitmap`、`onDraw`、`refresh` |

## com.zykj.blackboard.core.data.dao

| 类 | 方法摘录 |
|---|---|
| [BackgroundLineTypeEnumConverter](../../../android/中育云笔记/smali_classes5/com/zykj/blackboard/core/data/dao/BackgroundLineTypeEnumConverter.smali) | `convertToDatabaseValue`、`convertToDatabaseValue`、`convertToEntityProperty`、`convertToEntityProperty` |
| [CommandEnumConverter](../../../android/中育云笔记/smali_classes5/com/zykj/blackboard/core/data/dao/CommandEnumConverter.smali) | `convertToDatabaseValue`、`convertToDatabaseValue`、`convertToEntityProperty`、`convertToEntityProperty` |

## com.zykj.blackboard.core.edit

| 类 | 方法摘录 |
|---|---|
| [BasePageControl](../../../android/中育云笔记/smali_classes5/com/zykj/blackboard/core/edit/BasePageControl.smali) | `getFileName`、`onDelete`、`release` |
| [BoardControl](../../../android/中育云笔记/smali_classes5/com/zykj/blackboard/core/edit/BoardControl.smali) | `getConfig` |
| [IBoardControl](../../../android/中育云笔记/smali_classes5/com/zykj/blackboard/core/edit/IBoardControl.smali) | `getConfig` |
| [PageControl](../../../android/中育云笔记/smali_classes5/com/zykj/blackboard/core/edit/PageControl.smali) | `areaMoveEnd`、`areaMoveStart`、`areaMoving`、`getBackgroundColor`、`getMoveHorizontalProgress`、`getMoveVerticalProgress`、`setAreaMoveListener` |

## com.zykj.blackboard.core.graph.group

| 类 | 方法摘录 |
|---|---|
| [GroupGraph](../../../android/中育云笔记/smali_classes5/com/zykj/blackboard/core/graph/group/GroupGraph.smali) | `graphType`、`onDestroy` |
| [ImageGraph](../../../android/中育云笔记/smali_classes5/com/zykj/blackboard/core/graph/group/ImageGraph.smali) | `graphType`、`onDestroy` |

## com.zykj.blackboard.core.graphBuilder

| 类 | 方法摘录 |
|---|---|
| [GraphBuildFactory](../../../android/中育云笔记/smali_classes5/com/zykj/blackboard/core/graphBuilder/GraphBuildFactory.smali) | `valueOf`、`values` |

## com.zykj.blackboard.core.play

| 类 | 方法摘录 |
|---|---|
| [PlayPageControl](../../../android/中育云笔记/smali_classes5/com/zykj/blackboard/core/play/PlayPageControl.smali) | `areaMoveEnd`、`areaMoveStart`、`areaMoving`、`getDuration`、`getMoveHorizontalProgress`、`getMoveMaxHeightTimes`、`getMoveMaxWidthTimes` |

## com.zykj.blackboard.enums

| 类 | 方法摘录 |
|---|---|
| [DocumentType](../../../android/中育云笔记/smali_classes5/com/zykj/blackboard/enums/DocumentType.smali) | `valueOf`、`values` |
| [PlayStatus](../../../android/中育云笔记/smali_classes5/com/zykj/blackboard/enums/PlayStatus.smali) | `valueOf`、`values` |
| [TextActionType](../../../android/中育云笔记/smali_classes5/com/zykj/blackboard/enums/TextActionType.smali) | `valueOf`、`values` |
| [TranslationType](../../../android/中育云笔记/smali_classes5/com/zykj/blackboard/enums/TranslationType.smali) | `valueOf`、`values` |

## com.zykj.blackboard.utils

| 类 | 方法摘录 |
|---|---|
| [EventKey](../../../android/中育云笔记/smali_classes5/com/zykj/blackboard/utils/EventKey.smali) | `valueOf`、`values` |

## com.zykj.blackboard.widgets

| 类 | 方法摘录 |
|---|---|
| [TextDialog](../../../android/中育云笔记/smali_classes5/com/zykj/blackboard/widgets/TextDialog.smali) | `onCreate`、`onKeyDown`、`onStart` |

## com.zykj.cloudhelper

| 类 | 方法摘录 |
|---|---|
| [DataBinderMapperImpl](../../../android/中育云笔记/smali_classes6/com/zykj/cloudhelper/DataBinderMapperImpl.smali) | `collectDependencies`、`convertBrIdToString`、`getDataBinder`、`getDataBinder`、`getLayoutId` |

## com.zykj.cloudhelper.activity

| 类 | 方法摘录 |
|---|---|
| [Hilt_NoteManagerActivity](../../../android/中育云笔记/smali_classes6/com/zykj/cloudhelper/activity/Hilt_NoteManagerActivity.smali) | `createComponentManager`、`generatedComponent`、`getDefaultViewModelProviderFactory`、`inject`、`onCreate`、`onDestroy` |
| [NoteManagerActivity](../../../android/中育云笔记/smali_classes6/com/zykj/cloudhelper/activity/NoteManagerActivity.smali) | `getLayoutId`、`initData` |

## com.zykj.cloudhelper.dialog

| 类 | 方法摘录 |
|---|---|
| [CreateFolderDialogFragment](../../../android/中育云笔记/smali_classes6/com/zykj/cloudhelper/dialog/CreateFolderDialogFragment.smali) | `getLayoutId`、`initData`、`onDestroy` |
| [Hilt_CreateFolderDialogFragment](../../../android/中育云笔记/smali_classes6/com/zykj/cloudhelper/dialog/Hilt_CreateFolderDialogFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |

## com.zykj.cloudhelper.fragment

| 类 | 方法摘录 |
|---|---|
| [Hilt_StoreNoteFragment](../../../android/中育云笔记/smali_classes6/com/zykj/cloudhelper/fragment/Hilt_StoreNoteFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [PickNoteFragment](../../../android/中育云笔记/smali_classes6/com/zykj/cloudhelper/fragment/PickNoteFragment.smali) | `getLayoutId`、`initData` |
| [StoreNoteFragment](../../../android/中育云笔记/smali_classes6/com/zykj/cloudhelper/fragment/StoreNoteFragment.smali) | `getLayoutId`、`initData` |

## com.zykj.download

| 类 | 方法摘录 |
|---|---|
| [DataBinderMapperImpl](../../../android/中育云笔记/smali_classes6/com/zykj/download/DataBinderMapperImpl.smali) | `collectDependencies`、`convertBrIdToString`、`getDataBinder`、`getDataBinder`、`getLayoutId` |
| [DownloadFlag](../../../android/中育云笔记/smali_classes6/com/zykj/download/DownloadFlag.smali) | `valueOf`、`values` |
| [FileCheckDownloadResult](../../../android/中育云笔记/smali_classes6/com/zykj/download/FileCheckDownloadResult.smali) | `getDownloadEntity`、`getResultType` |
| [FileCheckResultType](../../../android/中育云笔记/smali_classes6/com/zykj/download/FileCheckResultType.smali) | `valueOf`、`values` |
| [FileCheckUploadResult](../../../android/中育云笔记/smali_classes6/com/zykj/download/FileCheckUploadResult.smali) | `getLocalPath`、`getProgress`、`getResultType`、`getServerUrl`、`getUrl`、`getVerifyCode` |
| [OssToken](../../../android/中育云笔记/smali_classes6/com/zykj/download/OssToken.smali) | `getAccessKeyId`、`getAccessKeySecret`、`getBucket`、`getEndpoint`、`getSecurityToken`、`getStrategy` |
| [OssUtils](../../../android/中育云笔记/smali_classes6/com/zykj/download/OssUtils.smali) | `getCacheDir`、`checkDownloadDir`、`checkFileName`、`getObjectKey`、`getOssClient`、`getOssToken`、`isNetworkConnected` |
| [StrategyEnum](../../../android/中育云笔记/smali_classes6/com/zykj/download/StrategyEnum.smali) | `valueOf`、`values` |
| [UploadResultType](../../../android/中育云笔记/smali_classes6/com/zykj/download/UploadResultType.smali) | `valueOf`、`values` |

## com.zykj.download.api

| 类 | 方法摘录 |
|---|---|
| [DownLoadApi](../../../android/中育云笔记/smali_classes6/com/zykj/download/api/DownLoadApi.smali) | `download` |
| [UploadApi](../../../android/中育云笔记/smali_classes6/com/zykj/download/api/UploadApi.smali) | `gridFs` |

## com.zykj.download.data

| 类 | 方法摘录 |
|---|---|
| [AppDatabase_Impl](../../../android/中育云笔记/smali_classes6/com/zykj/download/data/AppDatabase_Impl.smali) | `clearAllTables`、`createInvalidationTracker`、`createOpenHelper`、`getRequiredTypeConverters` |

## com.zykj.download.work

| 类 | 方法摘录 |
|---|---|
| [DownloadFileCommonWork](../../../android/中育云笔记/smali_classes6/com/zykj/download/work/DownloadFileCommonWork.smali) | `checkContentLength`、`checkMD5`、`downloadFile`、`initParameter` |
| [DownloadFileWork](../../../android/中育云笔记/smali_classes6/com/zykj/download/work/DownloadFileWork.smali) | `checkParam`、`downloadFileWithProgress`、`doWork`、`downloadFile`、`getAppDataBase`、`getDir`、`getDownloadUrl` |
| [DownloadFileWorkProxy](../../../android/中育云笔记/smali_classes6/com/zykj/download/work/DownloadFileWorkProxy.smali) | `checkFileIntegrity`、`checkDownloadSuccess`、`checkRecord`、`updateDownloadSize`、`updateFlag`、`updateTotalSize`、`updateVerifyCode` |
| [DownloadOssFileWork](../../../android/中育云笔记/smali_classes6/com/zykj/download/work/DownloadOssFileWork.smali) | `downloadFile`、`getOssToken`、`initParameter`、`setOssToken` |
| [UploadFileOssWork](../../../android/中育云笔记/smali_classes6/com/zykj/download/work/UploadFileOssWork.smali) | `initParameter`、`uploadFile` |
| [UploadFileWork](../../../android/中育云笔记/smali_classes6/com/zykj/download/work/UploadFileWork.smali) | `uploadFileWithProgress`、`doWork`、`getProgressLiveData`、`getReceiverLengthLiveData`、`initParameter`、`sendSpeedAndProgress`、`uploadFile` |

## com.zykj.http.bean

| 类 | 方法摘录 |
|---|---|
| [ApiResp](../../../android/中育云笔记/smali_classes6/com/zykj/http/bean/ApiResp.smali) | `getCode`、`getError`、`getMsg`、`getResult`、`getSuccess` |
| [ErrorInfo](../../../android/中育云笔记/smali_classes6/com/zykj/http/bean/ErrorInfo.smali) | `getCode`、`getDetails`、`getMessage` |
| [HeaderBean](../../../android/中育云笔记/smali_classes6/com/zykj/http/bean/HeaderBean.smali) | `getAccessToken`、`getAppName`、`getRefreshToken`、`getServerUrl`、`getVersionCode` |

## com.zykj.http.exception

| 类 | 方法摘录 |
|---|---|
| [RemoteCodeException](../../../android/中育云笔记/smali_classes6/com/zykj/http/exception/RemoteCodeException.smali) | `getErrorCodeInfo`、`setErrorCodeInfo` |

## com.zykj.http.interceptor

| 类 | 方法摘录 |
|---|---|
| [GzipInterceptor](../../../android/中育云笔记/smali_classes6/com/zykj/http/interceptor/GzipInterceptor.smali) | `isGzipped`、`unzip`、`intercept` |
| [HeadInterceptor](../../../android/中育云笔记/smali_classes6/com/zykj/http/interceptor/HeadInterceptor.smali) | `getHeaderBeanFlow`、`intercept`、`setHeaderBeanFlow` |
| [NetworkInterceptor](../../../android/中育云笔记/smali_classes6/com/zykj/http/interceptor/NetworkInterceptor.smali) | `intercept` |
| [RefreshTokenInterceptor](../../../android/中育云笔记/smali_classes6/com/zykj/http/interceptor/RefreshTokenInterceptor.smali) | `refreshTokenAndContinueRequest`、`getRefreshRepository`、`getUnauthorizedFlow`、`intercept`、`setRefreshRepository`、`setUnauthorizedFlow` |

## com.zykj.http.listener

| 类 | 方法摘录 |
|---|---|
| [UploadProgressListener](../../../android/中育云笔记/smali_classes6/com/zykj/http/listener/UploadProgressListener.smali) | `onProgressUpdate` |

## com.zykj.http.progress

| 类 | 方法摘录 |
|---|---|
| [ProgressRequestBody](../../../android/中育云笔记/smali_classes6/com/zykj/http/progress/ProgressRequestBody.smali) | `contentType`、`writeTo` |
| [ProgressRequestBodyKt](../../../android/中育云笔记/smali_classes6/com/zykj/http/progress/ProgressRequestBodyKt.smali) | `asProgressRequestBody` |

## com.zykj.lib.error.code

| 类 | 方法摘录 |
|---|---|
| [ErrorCode](../../../android/中育云笔记/smali_classes6/com/zykj/lib/error/code/ErrorCode.smali) | `valueOf`、`values`、`getErrorCodeInfo` |
| [ErrorCodeHandler](../../../android/中育云笔记/smali_classes6/com/zykj/lib/error/code/ErrorCodeHandler.smali) | `getErrorCode` |
| [ErrorCodeInfo](../../../android/中育云笔记/smali_classes6/com/zykj/lib/error/code/ErrorCodeInfo.smali) | `getCode`、`getDesc`、`getMessage`、`getMessageResId` |

## com.zykj.merge.sketch.config

| 类 | 方法摘录 |
|---|---|
| [RecorderConfig](../../../android/中育云笔记/smali_classes6/com/zykj/merge/sketch/config/RecorderConfig.smali) | `getMaxImageCount`、`getPaintColor`、`getPaintWidth`、`getShapeType`、`getSourcePath`、`isRecord`、`isTouchable` |

## com.zykj.merge.sketch.constant

| 类 | 方法摘录 |
|---|---|
| [PlayStatus](../../../android/中育云笔记/smali_classes6/com/zykj/merge/sketch/constant/PlayStatus.smali) | `valueOf`、`values`、`getState`、`getStateName`、`setState`、`setStateName` |

## com.zykj.merge.sketch.listener

| 类 | 方法摘录 |
|---|---|
| [MoveProxy](../../../android/中育云笔记/smali_classes6/com/zykj/merge/sketch/listener/MoveProxy.smali) | `areaMoveEnd`、`areaMoveStart`、`areaMoving`、`getCurrentScreenBitmap`、`getMoveHorizontalProgress`、`getMoveMaxHeightTimes`、`getMoveMaxWidthTimes` |
| [Play](../../../android/中育云笔记/smali_classes6/com/zykj/merge/sketch/listener/Play.smali) | `addPlayActionListener`、`destroy`、`getPath`、`isRend`、`loadData`、`pause`、`release` |
| [PlayStatusListener](../../../android/中育云笔记/smali_classes6/com/zykj/merge/sketch/listener/PlayStatusListener.smali) | `onPlayEnd`、`onPlayPause`、`onPlayStart`、`onPlayWait`、`onProgress` |

## com.zykj.merge.sketch.view

| 类 | 方法摘录 |
|---|---|
| [BlackBoardProxyView](../../../android/中育云笔记/smali_classes6/com/zykj/merge/sketch/view/BlackBoardProxyView.smali) | `runAtLeastCreated`、`addPlayActionListener`、`areaMoveEnd`、`areaMoveStart`、`areaMoving`、`destroy`、`getCurrentScreenBitmap` |
| [MergeSketchPlayView](../../../android/中育云笔记/smali_classes6/com/zykj/merge/sketch/view/MergeSketchPlayView.smali) | `addPlayActionListener`、`areaMoveEnd`、`areaMoveStart`、`areaMoving`、`destroy`、`getMoveHorizontalProgress`、`getMoveMaxHeightTimes` |
| [NewSketchProxyView](../../../android/中育云笔记/smali_classes6/com/zykj/merge/sketch/view/NewSketchProxyView.smali) | `addPlayActionListener`、`destroy`、`getPath`、`isRend`、`loadData`、`pause`、`release` |
| [OldSketchProxyView](../../../android/中育云笔记/smali_classes6/com/zykj/merge/sketch/view/OldSketchProxyView.smali) | `getLoadDataExecutor`、`getSeekExecutor`、`runAtLeastCreated`、`runOnMainThread`、`addPlayActionListener`、`destroy`、`getPath` |

## com.zykj.message

| 类 | 方法摘录 |
|---|---|
| [KillSelfService](../../../android/中育云笔记/smali_classes6/com/zykj/message/KillSelfService.smali) | `onBind`、`onStartCommand` |
| [UnInstallActivity](../../../android/中育云笔记/smali_classes6/com/zykj/message/UnInstallActivity.smali) | `onBackPressed`、`onCreate`、`onResume` |
| [UnLoginActivity](../../../android/中育云笔记/smali_classes6/com/zykj/message/UnLoginActivity.smali) | `onActivityResult`、`onBackPressed`、`onCreate`、`onDestroy`、`onPause`、`onRestart`、`onResume` |

## com.zykj.message.client

| 类 | 方法摘录 |
|---|---|
| [MessageClient](../../../android/中育云笔记/smali_classes6/com/zykj/message/client/MessageClient.smali) | `valueOf`、`values` |

## com.zykj.message.server.bean

| 类 | 方法摘录 |
|---|---|
| [ServerInfo](../../../android/中育云笔记/smali_classes6/com/zykj/message/server/bean/ServerInfo.smali) | `describeContents`、`writeToParcel` |
| [Status](../../../android/中育云笔记/smali_classes6/com/zykj/message/server/bean/Status.smali) | `valueOf`、`values`、`describeContents`、`writeToParcel` |
| [UserInfo](../../../android/中育云笔记/smali_classes6/com/zykj/message/server/bean/UserInfo.smali) | `describeContents`、`writeToParcel` |

## com.zykj.paint

| 类 | 方法摘录 |
|---|---|
| [Actions](../../../android/中育云笔记/smali_classes6/com/zykj/paint/Actions.smali) | `getDescriptor`、`registerAllExtensions`、`registerAllExtensions` |
| [SketchSyncView](../../../android/中育云笔记/smali_classes6/com/zykj/paint/SketchSyncView.smali) | `ezyColor`、`handleEvent`、`handleMultiFingerEvent`、`addAction`、`addMatrixAction`、`addPenTempPolylinePoint`、`addSketchAction` |

## com.zykj.paint.data

| 类 | 方法摘录 |
|---|---|
| [Rect2D](../../../android/中育云笔记/smali_classes6/com/zykj/paint/data/Rect2D.smali) | `nestPoint`、`nestRect`、`scaleRect`、`ToRectF`、`getHeight`、`getMiddle`、`getWidth` |

## com.zykj.paint.draw

| 类 | 方法摘录 |
|---|---|
| [ISketchDraw](../../../android/中育云笔记/smali_classes6/com/zykj/paint/draw/ISketchDraw.smali) | `cleanAll`、`hasDraw`、`touchDown`、`touchMove`、`touchUp` |
| [PolylineDrawer](../../../android/中育云笔记/smali_classes6/com/zykj/paint/draw/PolylineDrawer.smali) | `cleanAll`、`hasDraw`、`touchDown`、`touchMove`、`touchUp` |

## com.zykj.paint.extensions

| 类 | 方法摘录 |
|---|---|
| [GraphExtKt](../../../android/中育云笔记/smali_classes6/com/zykj/paint/extensions/GraphExtKt.smali) | `inverts`、`mapPoint`、`mapPoint`、`mapPoint` |

## com.zykj.paint.graphic

| 类 | 方法摘录 |
|---|---|
| [Graph](../../../android/中育云笔记/smali_classes6/com/zykj/paint/graphic/Graph.smali) | `addGraph`、`directRender`、`getBaseColor`、`getBoundBox`、`getGraphs`、`getName`、`isVisable` |
| [Layer](../../../android/中育云笔记/smali_classes6/com/zykj/paint/graphic/Layer.smali) | `directRender`、`findGraph`、`getBoundBox`、`render`、`render` |
| [Map](../../../android/中育云笔记/smali_classes6/com/zykj/paint/graphic/Map.smali) | `addLayer`、`directRender`、`getBoundBox`、`getCurrentLayer`、`render`、`render`、`reset` |
| [PolyLine](../../../android/中育云笔记/smali_classes6/com/zykj/paint/graphic/PolyLine.smali) | `directRender`、`directRender`、`getBoundBox`、`render`、`render` |
| [RectBmp](../../../android/中育云笔记/smali_classes6/com/zykj/paint/graphic/RectBmp.smali) | `directRender`、`getBoundBox`、`release`、`render`、`render`、`setDstVector`、`setFilePath` |

## com.zykj.paint.player

| 类 | 方法摘录 |
|---|---|
| [PlayActionListener](../../../android/中育云笔记/smali_classes6/com/zykj/paint/player/PlayActionListener.smali) | `onPause`、`onPlayEnd`、`onRerecord`、`onResume` |
| [PlayStatusListener](../../../android/中育云笔记/smali_classes6/com/zykj/paint/player/PlayStatusListener.smali) | `onPlayEnd`、`onPlayPause`、`onPlayStart`、`onUpdate` |

## com.zykj.paint.record

| 类 | 方法摘录 |
|---|---|
| [AESUtils](../../../android/中育云笔记/smali_classes6/com/zykj/paint/record/AESUtils.smali) | `Decrypt`、`Encrypt`、`decrypt`、`decryptVoice`、`encrypt`、`encryptVoice`、`getRawKey` |
| [AmrEncoder](../../../android/中育云笔记/smali_classes6/com/zykj/paint/record/AmrEncoder.smali) | `encode` |
| [AudioEncoder](../../../android/中育云笔记/smali_classes6/com/zykj/paint/record/AudioEncoder.smali) | `encode`、`getDestFile`、`getMediaFormat` |
| [AudioFileUtils](../../../android/中育云笔记/smali_classes6/com/zykj/paint/record/AudioFileUtils.smali) | `clearPcmFiles`、`deleteDir`、`deleteDirWithFile`、`getAmrFileAbsolutePath`、`getAmrFiles`、`getPcmFileAbsolutePath`、`getPcmFiles` |
| [AudioRecorder](../../../android/中育云笔记/smali_classes6/com/zykj/paint/record/AudioRecorder.smali) | `getInstance`、`makePCMFile2Amr`、`makePCMFileToWAVFile`、`mergePCMFilesToWAVFile`、`writeDataTOFile`、`canel`、`clearTempRecord` |
| [PcmToWav](../../../android/中育云笔记/smali_classes6/com/zykj/paint/record/PcmToWav.smali) | `clearFiles`、`makePCMFileToWAVFile`、`mergePCMFilesToWAVFile`、`wavFileHeader` |
| [RecordListener](../../../android/中育云笔记/smali_classes6/com/zykj/paint/record/RecordListener.smali) | `recordPause`、`recordResume` |
| [RecordStreamListener](../../../android/中育云笔记/smali_classes6/com/zykj/paint/record/RecordStreamListener.smali) | `recordOfByte` |
| [WaveHeader](../../../android/中育云笔记/smali_classes6/com/zykj/paint/record/WaveHeader.smali) | `WriteChar`、`WriteInt`、`WriteShort`、`getHeader` |

## com.zykj.paint.record.control

| 类 | 方法摘录 |
|---|---|
| [BaseControl](../../../android/中育云笔记/smali_classes6/com/zykj/paint/record/control/BaseControl.smali) | `getBitmapPoints`、`getBitmapPoints`、`getDistance`、`getDistance`、`getRotation`、`getRotation`、`midPoint` |
| [CompassesControl](../../../android/中育云笔记/smali_classes6/com/zykj/paint/record/control/CompassesControl.smali) | `circleCheck`、`isTouchInGraph`、`pointCheck`、`cleanAll`、`getGraphSnapShot`、`hasDraw`、`touchDown` |
| [DefaultControl](../../../android/中育云笔记/smali_classes6/com/zykj/paint/record/control/DefaultControl.smali) | `cleanAll`、`getGraphSnapShot`、`hasDraw`、`touchDown`、`touchMove`、`touchPointerDown`、`touchPointerUp` |
| [EraserControl](../../../android/中育云笔记/smali_classes6/com/zykj/paint/record/control/EraserControl.smali) | `cleanAll`、`getGraphSnapShot`、`hasDraw`、`touchDown`、`touchMove`、`touchPointerDown`、`touchPointerUp` |
| [ISketchControl](../../../android/中育云笔记/smali_classes6/com/zykj/paint/record/control/ISketchControl.smali) | `cleanAll`、`getGraphSnapShot`、`hasDraw`、`touchDown`、`touchMove`、`touchPointerDown`、`touchPointerUp` |
| [MapControl](../../../android/中育云笔记/smali_classes6/com/zykj/paint/record/control/MapControl.smali) | `cleanAll`、`getGraphSnapShot`、`hasDraw`、`tempDraw`、`touchDown`、`touchMove`、`touchPointerDown` |
| [PenControl](../../../android/中育云笔记/smali_classes6/com/zykj/paint/record/control/PenControl.smali) | `cleanAll`、`getGraphSnapShot`、`hasDraw`、`touchDown`、`touchMove`、`touchPointerDown`、`touchPointerUp` |
| [PictureControl](../../../android/中育云笔记/smali_classes6/com/zykj/paint/record/control/PictureControl.smali) | `circleCheck`、`getActionMode`、`isTouchInGraph`、`pointCheck`、`cleanAll`、`getGraphSnapShot`、`hasDraw` |
| [RulerControl](../../../android/中育云笔记/smali_classes6/com/zykj/paint/record/control/RulerControl.smali) | `cleanAll`、`getGraphSnapShot`、`hasDraw`、`touchDown`、`touchMove`、`touchPointerDown`、`touchPointerUp` |

## com.zykj.paint.record.model

| 类 | 方法摘录 |
|---|---|
| [CompassSnapShot](../../../android/中育云笔记/smali_classes6/com/zykj/paint/record/model/CompassSnapShot.smali) | `calculateRadius`、`getCompassMode`、`onGraphChange`、`setCenterPoint`、`setDownMatrix`、`updateGraph` |
| [GraphSnapShot](../../../android/中育云笔记/smali_classes6/com/zykj/paint/record/model/GraphSnapShot.smali) | `calculateDegree`、`calculateDegree`、`delByLines`、`exactCalculateDegree`、`exactCalculateDegree`、`getActionMode`、`getPointsLength` |
| [MapSnapShot](../../../android/中育云笔记/smali_classes6/com/zykj/paint/record/model/MapSnapShot.smali) | `randomColor`、`updateSketchSnapshot`、`addStickyEzyPath`、`clear`、`delByLines`、`getBitmapPoints`、`setSelect` |
| [PictureSnapShot](../../../android/中育云笔记/smali_classes6/com/zykj/paint/record/model/PictureSnapShot.smali) | `randomColor`、`updateSketchSnapshot`、`updateSketchWithLocalProtobufData`、`addStickyEzyPath`、`delByLines`、`getBitmapPoints`、`setSelect` |
| [RulerSnapShot](../../../android/中育云笔记/smali_classes6/com/zykj/paint/record/model/RulerSnapShot.smali) | `isInDrawGraphRect`、`setDownScale`、`setScaleMatrix` |

## com.zykj.paint.render

| 类 | 方法摘录 |
|---|---|
| [MapRender](../../../android/中育云笔记/smali_classes6/com/zykj/paint/render/MapRender.smali) | `clear`、`directDrawBitmap`、`directDrawPolyLine`、`drawBezierLine`、`drawBitmap`、`drawBitmap`、`drawPolyLine` |
| [MapViewer](../../../android/中育云笔记/smali_classes6/com/zykj/paint/render/MapViewer.smali) | `GeoRect2ViewRect`、`clear`、`destroy`、`directRenderAll`、`geoVector2ViewVector`、`geoVector2ViewVector`、`moveViewPort` |
| [SketchPlayer](../../../android/中育云笔记/smali_classes6/com/zykj/paint/render/SketchPlayer.smali) | `getTotalTime`、`playMusic`、`playWithLocalSource`、`destroyPlayer`、`getSnapshot`、`hideSeekBar`、`pausePlayer` |
| [SketchRender](../../../android/中育云笔记/smali_classes6/com/zykj/paint/render/SketchRender.smali) | `clear`、`directDrawBitmap`、`directDrawPolyLine`、`drawBezierLine`、`drawBitmap`、`drawBitmap`、`drawPolyLine` |
| [SketchViewer](../../../android/中育云笔记/smali_classes6/com/zykj/paint/render/SketchViewer.smali) | `getScaleMatrix`、`getTotalTime`、`playMusic`、`renderTemp`、`getCapture`、`getTotalTime`、`isEnded` |

## com.zykj.paint.runner

| 类 | 方法摘录 |
|---|---|
| [ActionProcessor](../../../android/中育云笔记/smali_classes6/com/zykj/paint/runner/ActionProcessor.smali) | `addAction`、`addMultiAction`、`destroy`、`pause`、`renderAction`、`renderHistory`、`renderImage` |
| [ActionRunner](../../../android/中育云笔记/smali_classes6/com/zykj/paint/runner/ActionRunner.smali) | `pause`、`resume` |
| [ImageActionRunner](../../../android/中育云笔记/smali_classes6/com/zykj/paint/runner/ImageActionRunner.smali) | `getSourceUrl`、`pause`、`resume`、`setSourceUrl` |
| [LayerActionRunner](../../../android/中育云笔记/smali_classes6/com/zykj/paint/runner/LayerActionRunner.smali) | `pause`、`resume` |
| [MatrixActionRunner](../../../android/中育云笔记/smali_classes6/com/zykj/paint/runner/MatrixActionRunner.smali) | `pause`、`resume` |
| [MoveActionRunner](../../../android/中育云笔记/smali_classes6/com/zykj/paint/runner/MoveActionRunner.smali) | `pause`、`resume` |
| [PolylineActionRunner](../../../android/中育云笔记/smali_classes6/com/zykj/paint/runner/PolylineActionRunner.smali) | `processPreActions`、`getTaskScheduledExecutorService`、`isImmediate`、`pause`、`resume`、`setImmediate`、`setTaskScheduledExecutorService` |
| [ZoomActionRunner](../../../android/中育云笔记/smali_classes6/com/zykj/paint/runner/ZoomActionRunner.smali) | `pause`、`resume` |

## com.zykj.paint.util

| 类 | 方法摘录 |
|---|---|
| [LineUtils](../../../android/中育云笔记/smali_classes6/com/zykj/paint/util/LineUtils.smali) | `lineSpace`、`point2Line`、`point2Polyline`、`pointToLine` |
| [TimeUtils](../../../android/中育云笔记/smali_classes6/com/zykj/paint/util/TimeUtils.smali) | `formatPhotoDate`、`formatPhotoDate`、`formatTime`、`getNowTimeString`、`timeFormat` |

## com.zykj.policy

| 类 | 方法摘录 |
|---|---|
| [DataBinderMapperImpl](../../../android/中育云笔记/smali_classes6/com/zykj/policy/DataBinderMapperImpl.smali) | `collectDependencies`、`convertBrIdToString`、`getDataBinder`、`getDataBinder`、`getLayoutId` |

## com.zykj.policy.ui

| 类 | 方法摘录 |
|---|---|
| [PolicyCheckView](../../../android/中育云笔记/smali_classes6/com/zykj/policy/ui/PolicyCheckView.smali) | `setData` |
| [PolicyDetailActivity](../../../android/中育云笔记/smali_classes6/com/zykj/policy/ui/PolicyDetailActivity.smali) | `onCreate`、`onDestroy` |
| [PolicyDialogFragment](../../../android/中育云笔记/smali_classes6/com/zykj/policy/ui/PolicyDialogFragment.smali) | `onCreateDialog`、`onCreateView`、`onViewCreated` |

## com.zykj.sketch

| 类 | 方法摘录 |
|---|---|
| [EzyDrawBoard](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/EzyDrawBoard.smali) | `getDescriptor`、`registerAllExtensions`、`registerAllExtensions` |
| [GraphSnapshot](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/GraphSnapshot.smali) | `getDescriptor`、`registerAllExtensions`、`registerAllExtensions` |
| [SketchHeader](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/SketchHeader.smali) | `getDescriptor`、`registerAllExtensions`、`registerAllExtensions` |

## com.zykj.sketch.core

| 类 | 方法摘录 |
|---|---|
| [ActionExecute](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/ActionExecute.smali) | `addNewGraph`、`buildHistoryGraph`、`setAttribute`、`setAttribute2`、`addViewControl`、`buildGraph`、`buildMatrix` |
| [ActionRecord](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/ActionRecord.smali) | `buildActionContent`、`buildHistoryRendData`、`notifyListener`、`addActionChangeListener`、`addHistoryRecord`、`addHistoryRenderGraphSnapshot`、`addNextPrevListener` |
| [ActionRecordExecute](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/ActionRecordExecute.smali) | `addRecord`、`onActionModeEvent`、`onAddImageEvent`、`onAddPPTEvent`、`onAudioStartRecord`、`onAudioStopRecord`、`onClearBoardEvent` |
| [ActionStrategyFactory](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/ActionStrategyFactory.smali) | `getActionGraphName`、`getGraphName`、`buildActionMode`、`clearAction`、`create`、`getAction`、`parseActionMode` |
| [GraphControl](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/GraphControl.smali) | `handleDeleteListener`、`initGraphConfig`、`clear`、`clearTempPaint`、`findGraph`、`findSelectGraph`、`forceRender` |

## com.zykj.sketch.core.action

| 类 | 方法摘录 |
|---|---|
| [BaseAction](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/action/BaseAction.smali) | `getTouchEventList`、`getTouchStartTime`、`isRecord`、`isTouchEnable`、`onTouchDown`、`onTouchMove`、`onTouchPointerDown` |
| [EraseViewAction](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/action/EraseViewAction.smali) | `deleteGraph`、`handleListener`、`enumType`、`onTouchDown` |
| [EraseWritingAction](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/action/EraseWritingAction.smali) | `deleteGraph`、`enumType`、`onTouchDown`、`onTouchMove`、`onTouchPointerDown`、`onTouchPointerUp`、`onTouchUp` |
| [SelectAction](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/action/SelectAction.smali) | `initTempValue`、`enumType`、`getMode`、`onTouchDown`、`onTouchMove`、`onTouchPointerDown`、`onTouchPointerUp` |
| [WritingAction](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/action/WritingAction.smali) | `createGraph`、`enumType`、`getGraph`、`getMX`、`getMY`、`getParentGraphName`、`getPath` |
| [WritingAndMoveAction](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/action/WritingAndMoveAction.smali) | `initTempValue`、`enumType`、`getGraph`、`getMX`、`getMY`、`getParentGraphName`、`getPath` |
| [WritingAndMoveVerticalAction](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/action/WritingAndMoveVerticalAction.smali) | `initTempValue`、`enumType`、`getGraph`、`getMX`、`getMY`、`getParentGraphName`、`getPath` |

## com.zykj.sketch.core.config

| 类 | 方法摘录 |
|---|---|
| [GraphConfig](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/config/GraphConfig.smali) | `getColor`、`getWidth`、`setColor`、`setWidth` |
| [SketchConfig](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/config/SketchConfig.smali) | `getContext`、`getMaxImageCount`、`getMaxPPTCount`、`getSourcePath`、`isTouchable`、`setMaxImageCount`、`setMaxPPTCount` |

## com.zykj.sketch.core.data

| 类 | 方法摘录 |
|---|---|
| [AudioTask](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/data/AudioTask.smali) | `getDuration`、`getFileName`、`getPath`、`getStartTime`、`setDuration`、`setPath` |
| [CORNER](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/data/CORNER.smali) | `valueOf`、`values` |
| [GraphTask](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/data/GraphTask.smali) | `getActionContent`、`getExecuteVoid`、`getHasSnapshot`、`getSnapshotVoid`、`getStartTime` |
| [Mode](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/data/Mode.smali) | `valueOf`、`values` |
| [PlayStatus](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/data/PlayStatus.smali) | `valueOf`、`values`、`getState`、`getStateName`、`setState`、`setStateName` |
| [RenderTask](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/data/RenderTask.smali) | `getAudioTaskList`、`getGraphTask`、`getLastSnapshot`、`getProgress`、`setLastSnapshot`、`setProgress` |
| [ThumbnailBean](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/data/ThumbnailBean.smali) | `getBitmap`、`getLimitRenderRectF`、`getMaxRenderRectF` |

## com.zykj.sketch.core.graph

| 类 | 方法摘录 |
|---|---|
| [BoundedContainerGraph](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/graph/BoundedContainerGraph.smali) | `getSnapshot`、`graphType`、`onMeasure` |
| [CircleGraph](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/graph/CircleGraph.smali) | `onMeasure`、`render` |
| [Graph](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/graph/Graph.smali) | `drawBorder`、`showDelete`、`addGraph`、`cancelSelected`、`childTypeNumber`、`clear`、`findGraph` |
| [GraphExtKt](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/graph/GraphExtKt.smali) | `convert2FM`、`convert2WM`、`getFP2WPMatrix`、`getFP2WPRendMatrix`、`getWP2FPMatrix`、`getWP2LPMatrix`、`initPaint` |
| [ImageGraph](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/graph/ImageGraph.smali) | `getTranslateCenterMatrix`、`reloadBitmap`、`checkOldData`、`getFileName`、`getSnapshot`、`graphType`、`onMeasure` |
| [ImageHistoryGraph](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/graph/ImageHistoryGraph.smali) | `getSaleCenterMatrix`、`getFileName`、`getSnapshot`、`graphType`、`onDestroy`、`onDraw`、`onMeasure` |
| [RectGraph](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/graph/RectGraph.smali) | `onMeasure`、`render` |
| [StrokeGraph](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/graph/StrokeGraph.smali) | `isIntersect`、`addFPPoint`、`addPoint`、`addPoint`、`findGraph`、`getActionControl`、`getSnapshot` |
| [UnBoundedContainerGraph](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/graph/UnBoundedContainerGraph.smali) | `getSnapshot`、`graphType`、`isInRect`、`onMeasure` |
| [ViewGraph](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/graph/ViewGraph.smali) | `compressImage` |
| [WebViewGraph](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/graph/WebViewGraph.smali) | `getSaleCenterMatrix`、`startRefresh`、`getBitmap`、`getCompressbitmap`、`getSnapshot`、`graphType`、`onDestroy` |
| [WritingGroupGraph](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/graph/WritingGroupGraph.smali) | `addGraph`、`createPath`、`crossLine`、`getIntersectGraph`、`getIntersectGraph`、`getSnapshot`、`graphType` |

## com.zykj.sketch.core.listener

| 类 | 方法摘录 |
|---|---|
| [ActionChangeListener](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/listener/ActionChangeListener.smali) | `change` |
| [AudioOperation](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/listener/AudioOperation.smali) | `isRecord`、`setProgressListener`、`startRecord`、`stopRecord` |
| [EventListener](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/listener/EventListener.smali) | `addViewControl`、`graphSnapShot`、`graphSnapShot`、`initConfig`、`onActionModeEvent`、`onAddImageEvent`、`onAddPPTEvent` |
| [GraphMatrixListener](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/listener/GraphMatrixListener.smali) | `onScale`、`onTranslation` |
| [IAction](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/listener/IAction.smali) | `enumType`、`getTouchEventList`、`getTouchStartTime`、`isRecord`、`onTouchDown`、`onTouchMove`、`onTouchPointerDown` |
| [IControl](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/listener/IControl.smali) | `clear`、`clearTempPaint`、`findGraph`、`findSelectGraph`、`forceRender`、`getBackgroundColor`、`getCameraMatrix` |
| [IDraw](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/listener/IDraw.smali) | `onDraw`、`onDrawComplete`、`render` |
| [IGraph](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/listener/IGraph.smali) | `findGraphByName`、`findGraphByType`、`getGraphName`、`getSnapshot`、`graphType`、`isComplete`、`isInRect` |
| [IUserPlay](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/listener/IUserPlay.smali) | `addPlayActionListener`、`destroy`、`getPlayStatus`、`loadData`、`pause`、`removePlayActionListener`、`seekTo` |
| [ImageDeleteListener](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/listener/ImageDeleteListener.smali) | `onDeleteImagePath` |
| [ImitateDraw](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/listener/ImitateDraw.smali) | `clearGraph`、`drawPath`、`drawThumbnail`、`graphMatrix`、`setLimitDrawArea` |
| [ModeChangeListener](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/listener/ModeChangeListener.smali) | `onChange` |
| [NextPrevListener](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/listener/NextPrevListener.smali) | `listener` |
| [PPTControl](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/listener/PPTControl.smali) | `goPage`、`nextAction`、`nextSlide`、`preAction`、`preSlide` |
| [PPTListener](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/listener/PPTListener.smali) | `currentPage`、`onPageFinished`、`totalPageCount` |
| [PlayActionListener](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/listener/PlayActionListener.smali) | `onPlayEnd`、`onPlayPause`、`onPlayStart`、`onProgress`、`onWaitPlay` |
| [ProgressListener](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/listener/ProgressListener.smali) | `progress`、`recordError` |
| [RealDraw](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/listener/RealDraw.smali) | `drawGraph`、`setDrawBackground`、`setLimitDrawArea`、`shutdown` |

## com.zykj.sketch.core.player

| 类 | 方法摘录 |
|---|---|
| [AudioThread](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/player/AudioThread.smali) | `getTotalDuration`、`initMediaPlayer`、`notifyProgress`、`resetMediaPlay`、`stopAllAudio`、`initSeekTo`、`pausePlay` |
| [PaintThread](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/player/PaintThread.smali) | `getTotalDuration`、`notifyProgress`、`initSeekTo`、`pausePlay`、`resumePlay`、`seekTo`、`setData` |
| [PlayControl](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/player/PlayControl.smali) | `checkAudioFile`、`parseDrawBoardData`、`addPlayActionListener`、`getPlayStatus`、`loadData`、`onDestroy`、`pause` |
| [PlayThread](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/player/PlayThread.smali) | `getPlayStatus`、`getStatus`、`pausePlay`、`reset`、`resumePlay`、`setPlayStatus`、`shutdown` |
| [SketchPlayerView](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/player/SketchPlayerView.smali) | `getLoadDataExecutor`、`getSeekExecutor`、`runAtLeastCreated`、`addPlayActionListener`、`destroy`、`getPlayStatus`、`isRend` |

## com.zykj.sketch.core.record

| 类 | 方法摘录 |
|---|---|
| [AudioControl](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/record/AudioControl.smali) | `addListener`、`isRecord`、`reset`、`startRecord`、`stopRecord` |
| [GraphOperation](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/record/GraphOperation.smali) | `addImage`、`addImage`、`addImage`、`addImage`、`addPPT`、`clear`、`getConfig` |
| [RecordControl](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/record/RecordControl.smali) | `addImage`、`countScale`、`executeActionContent`、`executeTask`、`getImagePath`、`saveBitmap`、`addActionChangeListener` |
| [SketchRecorderView](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/record/SketchRecorderView.smali) | `addImage`、`addImage`、`addImage`、`addImage`、`addPPT`、`clear`、`getConfig` |

## com.zykj.sketch.core.version

| 类 | 方法摘录 |
|---|---|
| [GraphTaskParseVersion1](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/version/GraphTaskParseVersion1.smali) | `parseEventAsTask`、`parse` |
| [GraphTaskParseVersion3](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/version/GraphTaskParseVersion3.smali) | `addGraphTask`、`countTaskStartTime`、`deleteSnapShot`、`parseEventAsTask`、`parseEventAsTask`、`getFlag`、`parse` |
| [GraphTaskParseVersion4](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/version/GraphTaskParseVersion4.smali) | `addGraphTask`、`countTaskStartTime`、`deleteSnapShot`、`parseEventAsTask`、`parseEventAsTask`、`getFlag`、`parse` |
| [GraphTaskParseVersion5](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/version/GraphTaskParseVersion5.smali) | `addGraphTask`、`countTaskStartTime`、`deleteSnapShot`、`parseEventAsTask`、`parseEventAsTask`、`getFlag`、`parse` |
| [ITaskParse](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/core/version/ITaskParse.smali) | `parse` |

## com.zykj.sketch.extensions

| 类 | 方法摘录 |
|---|---|
| [ExtensionsKt](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/extensions/ExtensionsKt.smali) | `capture`、`getDegree`、`getDistance`、`getDistance`、`getMidPoint`、`getRotation`、`lineSpace` |

## com.zykj.sketch.utils

| 类 | 方法摘录 |
|---|---|
| [ToastUtils](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/utils/ToastUtils.smali) | `showLong`、`showLong`、`showShort`、`showShort` |

## com.zykj.sketch.widgets

| 类 | 方法摘录 |
|---|---|
| [DrawTempView](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/widgets/DrawTempView.smali) | `clearGraph`、`drawPath`、`drawThumbnail`、`graphMatrix`、`onDraw`、`setLimitDrawArea` |
| [DrawView](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/widgets/DrawView.smali) | `drawGraph`、`onDraw`、`setDrawBackground`、`setLimitDrawArea`、`shutdown` |
| [PPTWebView](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/widgets/PPTWebView.smali) | `goPage`、`loadSlider`、`nextAction`、`nextSlide`、`onTouchEvent`、`preAction`、`preSlide` |
| [SurfaceDrawView](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/widgets/SurfaceDrawView.smali) | `drawGraph`、`setDrawBackground`、`setLimitDrawArea`、`shutdown`、`surfaceChanged`、`surfaceCreated`、`surfaceDestroyed` |
| [TempView](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/widgets/TempView.smali) | `onDraw`、`rectConvertRegion` |
| [TextureDrawView](../../../android/中育云笔记/smali_classes6/com/zykj/sketch/widgets/TextureDrawView.smali) | `dispatchVisibilityChanged`、`drawGraph`、`isRend`、`onDetachedFromWindow`、`onSurfaceTextureAvailable`、`onSurfaceTextureDestroyed`、`onSurfaceTextureSizeChanged` |

## com.zykj.view

| 类 | 方法摘录 |
|---|---|
| [DataBinderMapperImpl](../../../android/中育云笔记/smali_classes6/com/zykj/view/DataBinderMapperImpl.smali) | `collectDependencies`、`convertBrIdToString`、`getDataBinder`、`getDataBinder`、`getLayoutId` |

## com.zykj.view.board.board

| 类 | 方法摘录 |
|---|---|
| [BoardFragment](../../../android/中育云笔记/smali_classes6/com/zykj/view/board/board/BoardFragment.smali) | `initObserver`、`initView`、`onCreateView`、`onDestroyView`、`onViewCreated` |

## com.zykj.view.board.crop

| 类 | 方法摘录 |
|---|---|
| [BlackboardCropFragment](../../../android/中育云笔记/smali_classes6/com/zykj/view/board/crop/BlackboardCropFragment.smali) | `initView`、`onActivityCreated`、`onCreateView`、`onDestroyView`、`onHiddenChanged`、`onPause`、`onResume` |

## com.zykj.view.board.evaluation

| 类 | 方法摘录 |
|---|---|
| [BlackboardEvaluationFragment](../../../android/中育云笔记/smali_classes6/com/zykj/view/board/evaluation/BlackboardEvaluationFragment.smali) | `initData`、`initView`、`onCreate`、`onCreateView`、`onDestroyView`、`onViewCreated` |

## com.zykj.view.board.play

| 类 | 方法摘录 |
|---|---|
| [PlaySettingAdapter](../../../android/中育云笔记/smali_classes6/com/zykj/view/board/play/PlaySettingAdapter.smali) | `getItemCount`、`onBindViewHolder`、`onCreateViewHolder` |
| [SketchPlayFragment](../../../android/中育云笔记/smali_classes6/com/zykj/view/board/play/SketchPlayFragment.smali) | `initView`、`onCreateView`、`onDestroyView`、`onHiddenChanged`、`onPause`、`onResume`、`onViewCreated` |
| [SpeedRateAdapter](../../../android/中育云笔记/smali_classes6/com/zykj/view/board/play/SpeedRateAdapter.smali) | `onBindViewHolder`、`onCreateViewHolder` |

## com.zykj.view.board.simple

| 类 | 方法摘录 |
|---|---|
| [SimpleFragment](../../../android/中育云笔记/smali_classes6/com/zykj/view/board/simple/SimpleFragment.smali) | `initObserver`、`initView`、`onCreateView`、`onViewCreated` |

## com.zykj.view.simpleBoard

| 类 | 方法摘录 |
|---|---|
| [SimpleBoardView](../../../android/中育云笔记/smali_classes6/com/zykj/view/simpleBoard/SimpleBoardView.smali) | `getImageBackground`、`getSimpleBoardConfig`、`onMeasure`、`onTouchEvent`、`setActonMode`、`setImageBackground`、`setOnActionListener` |

## com.zykj.view.simpleBoard.view

| 类 | 方法摘录 |
|---|---|
| [BoardImageView](../../../android/中育云笔记/smali_classes6/com/zykj/view/simpleBoard/view/BoardImageView.smali) | `getMDrawControl`、`onDraw`、`setMDrawControl` |
| [BoardPathView](../../../android/中育云笔记/smali_classes6/com/zykj/view/simpleBoard/view/BoardPathView.smali) | `getMDrawControl`、`onDraw`、`setMDrawControl` |
| [BoardTempPathView](../../../android/中育云笔记/smali_classes6/com/zykj/view/simpleBoard/view/BoardTempPathView.smali) | `getMDrawControl`、`onDraw`、`setMDrawControl` |

## com.zykj.view.ui.camera

| 类 | 方法摘录 |
|---|---|
| [EzyCameraActivity](../../../android/中育云笔记/smali_classes6/com/zykj/view/ui/camera/EzyCameraActivity.smali) | `onCreate` |
| [ImagePickFragment](../../../android/中育云笔记/smali_classes6/com/zykj/view/ui/camera/ImagePickFragment.smali) | `initData`、`initView`、`onCreateView`、`onResume`、`onViewCreated` |

## com.zykj.view.ui.crop

| 类 | 方法摘录 |
|---|---|
| [EzyCropActivity](../../../android/中育云笔记/smali_classes6/com/zykj/view/ui/crop/EzyCropActivity.smali) | `onCreate` |

## com.zykj.view.utils

| 类 | 方法摘录 |
|---|---|
| [ProtoPath](../../../android/中育云笔记/smali_classes6/com/zykj/view/utils/ProtoPath.smali) | `getPaint`、`getPointList` |
| [ZoomPointSolution](../../../android/中育云笔记/smali_classes6/com/zykj/view/utils/ZoomPointSolution.smali) | `valueOf`、`values` |

## com.zykj.view.widget

| 类 | 方法摘录 |
|---|---|
| [DoubleSeekBar](../../../android/中育云笔记/smali_classes6/com/zykj/view/widget/DoubleSeekBar.smali) | `getBarSize`、`getKeyPointColor`、`getKeyPointList`、`getMaskChangeListener`、`getMaskColor`、`getMaskProgress`、`getMax` |
| [SketchProgressView](../../../android/中育云笔记/smali_classes6/com/zykj/view/widget/SketchProgressView.smali) | `getViewCrossLength`、`getViewMainLength`、`getOrientation`、`getProgress`、`getProgressListener`、`getThumbTime`、`onDetachedFromWindow` |
| [TouchSwitchView](../../../android/中育云笔记/smali_classes6/com/zykj/view/widget/TouchSwitchView.smali) | `onInterceptTouchEvent`、`setCanTouch` |
