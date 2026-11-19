# 新测评 业务代码导航

每个表格对应一个保留业务命名空间的包，方法来自 DEX 的类定义。点击类名可查看参与编译的实现。生成绑定、单字母类及第三方库另见完整包索引。

## com.zykj.base

| 类 | 方法摘录 |
|---|---|
| [BaseActivity](../../../android/新测评/smali_classes4/com/zykj/base/BaseActivity.smali) | `getMBindView`、`initData`、`initView`、`layoutId`、`onCreate`、`setMBindView` |
| [BaseApplication](../../../android/新测评/smali_classes4/com/zykj/base/BaseApplication.smali) | `onCreate` |
| [BaseDialogFragment](../../../android/新测评/smali_classes4/com/zykj/base/BaseDialogFragment.smali) | `cancelable`、`canceledOnTouchOutside`、`dismiss`、`getMBindView`、`initData`、`initView`、`isFullDialog` |
| [BaseFragment](../../../android/新测评/smali_classes4/com/zykj/base/BaseFragment.smali) | `getMBindView`、`initData`、`initView`、`layoutId`、`onCreate`、`onCreateView`、`onViewCreated` |
| [BaseViewModel](../../../android/新测评/smali_classes4/com/zykj/base/BaseViewModel.smali) | `getToastLiveData`、`handlerThrowable`、`isDialogVisible`、`launch`、`launchAsync`、`launchAsyncData`、`launchData` |
| [DataBinderMapperImpl](../../../android/新测评/smali_classes4/com/zykj/base/DataBinderMapperImpl.smali) | `collectDependencies`、`convertBrIdToString`、`getDataBinder`、`getDataBinder`、`getLayoutId` |

## com.zykj.base.bean.toast

| 类 | 方法摘录 |
|---|---|
| [ToastErrorCodeMessage](../../../android/新测评/smali_classes4/com/zykj/base/bean/toast/ToastErrorCodeMessage.smali) | `getErrorInfo` |
| [ToastErrorMessage](../../../android/新测评/smali_classes4/com/zykj/base/bean/toast/ToastErrorMessage.smali) | `getCode` |
| [ToastMessage](../../../android/新测评/smali_classes4/com/zykj/base/bean/toast/ToastMessage.smali) | `getMessage`、`getMessageResId`、`setMessage`、`setMessageResId` |

## com.zykj.base.ext

| 类 | 方法摘录 |
|---|---|
| [BindingAdaptersKt](../../../android/新测评/smali_classes4/com/zykj/base/ext/BindingAdaptersKt.smali) | `bindLiveData`、`netUrl`、`netUrlHeader`、`netUrlSnapshot`、`onClick`、`visibleOrGone` |

## com.zykj.base.utils

| 类 | 方法摘录 |
|---|---|
| [ActivityCollectionHelper](../../../android/新测评/smali_classes4/com/zykj/base/utils/ActivityCollectionHelper.smali) | `getEntries`、`valueOf`、`values`、`exitApp`、`finishAll`、`register`、`topActivity` |
| [ExceptionHandle](../../../android/新测评/smali_classes4/com/zykj/base/utils/ExceptionHandle.smali) | `caseRemoteCodeException`、`handleException` |
| [XToastUtils](../../../android/新测评/smali_classes4/com/zykj/base/utils/XToastUtils.smali) | `error`、`error`、`error`、`error`、`error`、`success`、`success` |

## com.zykj.blackboard.bean

| 类 | 方法摘录 |
|---|---|
| [BoardConfig](../../../android/新测评/smali_classes4/com/zykj/blackboard/bean/BoardConfig.smali) | `getAddTextOriginalText`、`getAddTextOriginalTextColor`、`getAddTextOriginalTextMaxSize`、`getAddTextOriginalTextMinSize`、`getAddTextOriginalTextSize`、`getAddTextRectF`、`getAuthor` |

## com.zykj.blackboard.core.action

| 类 | 方法摘录 |
|---|---|
| [GeometryActionEnum](../../../android/新测评/smali_classes4/com/zykj/blackboard/core/action/GeometryActionEnum.smali) | `valueOf`、`values` |

## com.zykj.blackboard.core.canvas

| 类 | 方法摘录 |
|---|---|
| [SketchRecorderView](../../../android/新测评/smali_classes4/com/zykj/blackboard/core/canvas/SketchRecorderView.smali) | `onDetachedFromWindow`、`onTouchEvent` |

## com.zykj.blackboard.core.canvas.view

| 类 | 方法摘录 |
|---|---|
| [BackgroundView](../../../android/新测评/smali_classes4/com/zykj/blackboard/core/canvas/view/BackgroundView.smali) | `getBackgroundLineConfig`、`getMyBackgroundColor`、`onDraw`、`refresh`、`setBackgroundLineConfig`、`setMatrix`、`setMyBackgroundColor` |

## com.zykj.blackboard.core.data.dao

| 类 | 方法摘录 |
|---|---|
| [BackgroundLineTypeEnumConverter](../../../android/新测评/smali_classes4/com/zykj/blackboard/core/data/dao/BackgroundLineTypeEnumConverter.smali) | `convertToDatabaseValue`、`convertToDatabaseValue`、`convertToEntityProperty`、`convertToEntityProperty` |
| [CommandEnumConverter](../../../android/新测评/smali_classes4/com/zykj/blackboard/core/data/dao/CommandEnumConverter.smali) | `convertToDatabaseValue`、`convertToDatabaseValue`、`convertToEntityProperty`、`convertToEntityProperty` |

## com.zykj.blackboard.core.edit

| 类 | 方法摘录 |
|---|---|
| [BasePageControl](../../../android/新测评/smali_classes4/com/zykj/blackboard/core/edit/BasePageControl.smali) | `getFileName`、`onDelete`、`release` |
| [BoardControl](../../../android/新测评/smali_classes4/com/zykj/blackboard/core/edit/BoardControl.smali) | `getConfig` |
| [IBoardControl](../../../android/新测评/smali_classes4/com/zykj/blackboard/core/edit/IBoardControl.smali) | `getConfig` |
| [PageControl](../../../android/新测评/smali_classes4/com/zykj/blackboard/core/edit/PageControl.smali) | `areaMoveEnd`、`areaMoveStart`、`areaMoving`、`getBackgroundColor`、`getMoveHorizontalProgress`、`getMoveVerticalProgress`、`setAreaMoveListener` |

## com.zykj.blackboard.core.graph.group

| 类 | 方法摘录 |
|---|---|
| [GroupGraph](../../../android/新测评/smali_classes4/com/zykj/blackboard/core/graph/group/GroupGraph.smali) | `graphType`、`onDestroy` |
| [ImageGraph](../../../android/新测评/smali_classes4/com/zykj/blackboard/core/graph/group/ImageGraph.smali) | `graphType`、`onDestroy` |

## com.zykj.blackboard.core.graphBuilder

| 类 | 方法摘录 |
|---|---|
| [GraphBuildFactory](../../../android/新测评/smali_classes4/com/zykj/blackboard/core/graphBuilder/GraphBuildFactory.smali) | `valueOf`、`values` |

## com.zykj.blackboard.core.play

| 类 | 方法摘录 |
|---|---|
| [PlayPageControl](../../../android/新测评/smali_classes4/com/zykj/blackboard/core/play/PlayPageControl.smali) | `areaMoveEnd`、`areaMoveStart`、`areaMoving`、`getDuration`、`getMoveHorizontalProgress`、`getMoveMaxHeightTimes`、`getMoveMaxWidthTimes` |

## com.zykj.blackboard.enums

| 类 | 方法摘录 |
|---|---|
| [DocumentType](../../../android/新测评/smali_classes4/com/zykj/blackboard/enums/DocumentType.smali) | `valueOf`、`values` |
| [PlayStatus](../../../android/新测评/smali_classes4/com/zykj/blackboard/enums/PlayStatus.smali) | `valueOf`、`values` |
| [SelectGraphEnum](../../../android/新测评/smali_classes4/com/zykj/blackboard/enums/SelectGraphEnum.smali) | `valueOf`、`values` |
| [TextActionType](../../../android/新测评/smali_classes4/com/zykj/blackboard/enums/TextActionType.smali) | `valueOf`、`values` |
| [TranslationType](../../../android/新测评/smali_classes4/com/zykj/blackboard/enums/TranslationType.smali) | `valueOf`、`values` |

## com.zykj.blackboard.utils

| 类 | 方法摘录 |
|---|---|
| [EventKey](../../../android/新测评/smali_classes4/com/zykj/blackboard/utils/EventKey.smali) | `valueOf`、`values` |

## com.zykj.blackboard.widgets

| 类 | 方法摘录 |
|---|---|
| [TextDialog](../../../android/新测评/smali_classes4/com/zykj/blackboard/widgets/TextDialog.smali) | `onCreate`、`onKeyDown`、`onStart` |

## com.zykj.camera

| 类 | 方法摘录 |
|---|---|
| [AnswerSheetNative](../../../android/新测评/smali_classes4/com/zykj/camera/AnswerSheetNative.smali) | `nativeCutImage`、`nativeGetAnswerSheetIds`、`nativePreScanImageInfo`、`nativeScanAnswerSheet`、`nativeScanAnswerSheetEx`、`nativeScanAnswerSheetInChoice` |

## com.zykj.camera.view

| 类 | 方法摘录 |
|---|---|
| [AnswerSheetCompositionView](../../../android/新测评/smali_classes4/com/zykj/camera/view/AnswerSheetCompositionView.smali) | `getIndex`、`getTipsView`、`setIndex` |
| [AnswerSheetTrebleView](../../../android/新测评/smali_classes4/com/zykj/camera/view/AnswerSheetTrebleView.smali) | `getTipsView` |
| [AnswerSheetView](../../../android/新测评/smali_classes4/com/zykj/camera/view/AnswerSheetView.smali) | `getLimitRectF`、`getTipsView` |
| [ManualPointView](../../../android/新测评/smali_classes4/com/zykj/camera/view/ManualPointView.smali) | `getCurrentClickPointType`、`getPointMap`、`getRangeRectMap`、`onDetachedFromWindow`、`onDraw`、`onTouchEvent`、`setBackBitmap` |

## com.zykj.evaluation

| 类 | 方法摘录 |
|---|---|
| [App](../../../android/新测评/smali_classes4/com/zykj/evaluation/App.smali) | `initLogHelper`、`initMessageClient`、`reflectComposeValue`、`getOssTaskManger`、`getWorkManagerConfiguration`、`getWorkerFactory`、`newImageLoader` |
| [DataBinderMapperImpl](../../../android/新测评/smali_classes4/com/zykj/evaluation/DataBinderMapperImpl.smali) | `collectDependencies`、`convertBrIdToString`、`getDataBinder`、`getDataBinder`、`getLayoutId` |
| [SophixStubApplication](../../../android/新测评/smali_classes4/com/zykj/evaluation/SophixStubApplication.smali) | `initSophix`、`attachBaseContext` |

## com.zykj.evaluation.base

| 类 | 方法摘录 |
|---|---|
| [BaseDialogFragment](../../../android/新测评/smali_classes4/com/zykj/evaluation/base/BaseDialogFragment.smali) | `cancelable`、`canceledOnTouchOutside`、`dismiss`、`getMBindView`、`hideProgress`、`initData`、`initView` |

## com.zykj.evaluation.bean

| 类 | 方法摘录 |
|---|---|
| [AddMistakeReq](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/AddMistakeReq.smali) | `getAttainedLevel`、`getDiff`、`getErrorReason`、`getExamId`、`getExtraStems`、`getQuestionId`、`getStemShoot` |
| [AskForHelpReq](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/AskForHelpReq.smali) | `getAskForHelp`、`getExamTaskId`、`getQuestionId` |
| [BaseGuideQuestion](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/BaseGuideQuestion.smali) | `getAskForHelp`、`getCompleted`、`getId`、`getMyScore`、`getName`、`getNumber`、`getScore` |
| [ClassItem](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/ClassItem.smali) | `getId`、`getName` |
| [CommitAnswer](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/CommitAnswer.smali) | `getAnswers`、`getUuid`、`setAnswers` |
| [CommitSelfCorrectReq](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/CommitSelfCorrectReq.smali) | `getQuestionId`、`getResults`、`getTaskId` |
| [CommitTaskAnswer](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/CommitTaskAnswer.smali) | `getAnswers`、`getDraft`、`getQuestionId`、`setAnswers` |
| [CreateTagReq](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/CreateTagReq.smali) | `getId`、`getName` |
| [DetailAnswerInfo](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/DetailAnswerInfo.smali) | `getExamAnswers`、`getExamComments`、`getExamMicroLessonComment`、`getOriginResult`、`getOriginScore`、`getResult`、`getReviseMicroLessonComment` |
| [DetailGroupQstAnswer](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/DetailGroupQstAnswer.smali) | `getAnswers`、`getUuid` |
| [DetailSubQuestion](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/DetailSubQuestion.smali) | `getDisplayNumber`、`getNumber`、`getOptions`、`getOriginScore`、`getQstType`、`getQuestionId`、`getScore` |
| [ExamProgress](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/ExamProgress.smali) | `getRevisingCount`、`getRevisingStudents`、`getTestingCount`、`getTestingStudents`、`setRevisingCount`、`setRevisingStudents`、`setTestingCount` |
| [ExamState](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/ExamState.smali) | `getValue` |
| [ExamTaskType](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/ExamTaskType.smali) | `getType` |
| [GetTaskListKt](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/GetTaskListKt.smali) | `convertToTaskState` |
| [GetTaskListReq](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/GetTaskListReq.smali) | `getEndTime`、`getExamTaskType`、`getGradeId`、`getKeyword`、`getMaxResultCount`、`getSkipCount`、`getStartTime` |
| [GetTaskListResponse](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/GetTaskListResponse.smali) | `getItems`、`getTotalCount` |
| [GetTopicList](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/GetTopicList.smali) | `getContent`、`getId`、`getName`、`getSort`、`isActive` |
| [GuideGroup](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/GuideGroup.smali) | `getDescription`、`getName`、`getNumber`、`getQstCount`、`getQuestions`、`getScore`、`getShowGroupNumber` |
| [GuideNoStemQuestion](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/GuideNoStemQuestion.smali) | `getAnswerWithQuestion`、`getQstFlows` |
| [GuideNormalQuestion](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/GuideNormalQuestion.smali) | `getAnswerByGroup`、`getHasMicroClass`、`getItemType`、`getNeedRevise`、`getOriginScore`、`getRelatedGroupId`、`getRevisingResult` |
| [GuideSubQuestion](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/GuideSubQuestion.smali) | `getNumber`、`getOptions`、`getQstType`、`getSubQuestions`、`getType`、`getUuid` |
| [GuideTaskInfo](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/GuideTaskInfo.smali) | `getCorrectWithSelf`、`getEnableScore`、`getEndTime`、`getExamDescription`、`getExamId`、`getExamName`、`getExamState` |
| [HomeFilterCondition](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/HomeFilterCondition.smali) | `convertToReq`、`getCheckedEvaluationType`、`getCheckedGrade`、`getCheckedOverdueType`、`getCheckedSubject`、`getCheckedTime`、`getKeyword` |
| [MicroClassInfo](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/MicroClassInfo.smali) | `getAddress`、`getCreationTime`、`getCreatorUserId`、`getId`、`getName`、`getSnapshot`、`isRevising` |
| [MonitorPictureReq](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/MonitorPictureReq.smali) | `getAppName`、`getPackageName`、`getPictures` |
| [PageSize](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/PageSize.smali) | `getValue` |
| [PaperBlank](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/PaperBlank.smali) | `getPosition`、`getUuid` |
| [PaperConfig](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/PaperConfig.smali) | `getPages`、`getVersion` |
| [PaperHand](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/PaperHand.smali) | `getUuid` |
| [PaperJson](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/PaperJson.smali) | `getConfig` |
| [PaperOption](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/PaperOption.smali) | `getLabel`、`getPosition` |
| [PaperPage](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/PaperPage.smali) | `getQuestions` |
| [PaperPoint](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/PaperPoint.smali) | `getXRate`、`getYRate` |
| [PaperPosition](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/PaperPosition.smali) | `getEnd`、`getStart` |
| [PaperQuestion](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/PaperQuestion.smali) | `getBlanks`、`getGroupKey`、`getId`、`getItems`、`getNumericalOrder`、`getPosition`、`getSelects` |
| [PaperResponse](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/PaperResponse.smali) | `getAnswerSheet` |
| [PaperSelect](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/PaperSelect.smali) | `getOptions`、`getOrder`、`getPosition`、`getUuid` |
| [RevisingRecord](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/RevisingRecord.smali) | `getResult`、`getRevisingAnswers`、`getRevisingComments`、`getUuid` |
| [SelfCorrectResult](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/SelfCorrectResult.smali) | `getResult`、`getRevisingAnswer`、`getUuid` |
| [SetTaskFavoriteReq](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/SetTaskFavoriteReq.smali) | `getExamTaskId`、`isCollect` |
| [SpecificTrainingType](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/SpecificTrainingType.smali) | `getType` |
| [TagInfo](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/TagInfo.smali) | `getId`、`getName` |
| [TaskCount](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/TaskCount.smali) | `getEnd`、`getExamCorrecting`、`getRevising`、`getRevisingCorrecting`、`getTesting`、`getWaitExamCorrect`、`getWaitRevisingCorrect` |
| [TaskDetailInfo](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/TaskDetailInfo.smali) | `getAnswerList`、`getAnswerWithQuestion`、`getAskForHelp`、`getExamDraft`、`getId`、`getItemType`、`getLastRoundRevisingRecords` |
| [TaskInfo](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/TaskInfo.smali) | `getAddress`、`getAnswerPad`、`getAnswerSheet`、`getAnsweringUrge`、`getCorrectOnline`、`getCorrectOnlineState`、`getCorrectWithSelf` |
| [TaskListType](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/TaskListType.smali) | `getType` |
| [TaskState](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/TaskState.smali) | `getName`、`getState` |
| [TypicalAnswer](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/TypicalAnswer.smali) | `getAnswers`、`getComments`、`getFullname` |
| [UploadData](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/UploadData.smali) | `getCommitState`、`getLocalPath`、`getUploadUrl`、`getUuid` |

## com.zykj.evaluation.bean.bundle

| 类 | 方法摘录 |
|---|---|
| [AnswerData](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/bundle/AnswerData.smali) | `getAnswerPath`、`getUuid` |
| [AnswerSheetBundle](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/bundle/AnswerSheetBundle.smali) | `getAddress`、`getPath`、`getSerialNum`、`getTaskId`、`getTaskState`、`getTestPagerId`、`getUuid` |
| [DetailBundle](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/bundle/DetailBundle.smali) | `describeContents`、`getCanShowAnswer`、`getCanShowMicroClass`、`getCurrentIndex`、`getExamDescription`、`getExamId`、`getExamName` |
| [MistakeDataBundle](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/bundle/MistakeDataBundle.smali) | `describeContents`、`getExamId`、`getExamName`、`getQuestionId`、`getStemLocalPath`、`getTaskId`、`getTopicId` |
| [SketchPlayBundle](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/bundle/SketchPlayBundle.smali) | `getExamId`、`getQuestionId`、`getUrl` |

## com.zykj.evaluation.bean.constant

| 类 | 方法摘录 |
|---|---|
| [MistakeTag](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/constant/MistakeTag.smali) | `getId`、`getName` |
| [QuestionResultEnum](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/constant/QuestionResultEnum.smali) | `getEntries`、`valueOf`、`values` |
| [QuestionStateEnum](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/constant/QuestionStateEnum.smali) | `getEntries`、`valueOf`、`values` |
| [QuestionTypeEnum](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/constant/QuestionTypeEnum.smali) | `getEntries`、`valueOf`、`values`、`getType` |
| [RevisingResultEnum](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/constant/RevisingResultEnum.smali) | `getEntries`、`valueOf`、`values` |
| [WhenShowState](../../../android/新测评/smali_classes4/com/zykj/evaluation/bean/constant/WhenShowState.smali) | `getState` |

## com.zykj.evaluation.di

| 类 | 方法摘录 |
|---|---|
| [AppDatabase_Impl](../../../android/新测评/smali_classes4/com/zykj/evaluation/di/AppDatabase_Impl.smali) | `clearAllTables`、`createAutoMigrations`、`createInvalidationTracker`、`createOpenDelegate`、`getRequiredAutoMigrationSpecClasses`、`getRequiredTypeConverterClasses` |

## com.zykj.evaluation.network

| 类 | 方法摘录 |
|---|---|
| [BaseResponse](../../../android/新测评/smali_classes4/com/zykj/evaluation/network/BaseResponse.smali) | `getError`、`getResult`、`getSuccess` |

## com.zykj.evaluation.submit

| 类 | 方法摘录 |
|---|---|
| [SubmitCorrectSelfWork_AssistedFactory_Impl](../../../android/新测评/smali_classes4/com/zykj/evaluation/submit/SubmitCorrectSelfWork_AssistedFactory_Impl.smali) | `create` |
| [SubmitNoStemWork_AssistedFactory_Impl](../../../android/新测评/smali_classes4/com/zykj/evaluation/submit/SubmitNoStemWork_AssistedFactory_Impl.smali) | `create` |
| [SubmitNormalWork_AssistedFactory_Impl](../../../android/新测评/smali_classes4/com/zykj/evaluation/submit/SubmitNormalWork_AssistedFactory_Impl.smali) | `create` |
| [SubmitWork](../../../android/新测评/smali_classes4/com/zykj/evaluation/submit/SubmitWork.smali) | `doWork` |

## com.zykj.evaluation.ui

| 类 | 方法摘录 |
|---|---|
| [Hilt_MainActivity](../../../android/新测评/smali_classes4/com/zykj/evaluation/ui/Hilt_MainActivity.smali) | `generatedComponent`、`getDefaultViewModelProviderFactory`、`onCreate`、`onDestroy` |
| [Hilt_MainFragment](../../../android/新测评/smali_classes4/com/zykj/evaluation/ui/Hilt_MainFragment.smali) | `generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`onAttach`、`onAttach`、`onGetLayoutInflater` |
| [MainActivity](../../../android/新测评/smali_classes4/com/zykj/evaluation/ui/MainActivity.smali) | `onCreate`、`onResume` |
| [MainFragment](../../../android/新测评/smali_classes4/com/zykj/evaluation/ui/MainFragment.smali) | `onCreateView` |

## com.zykj.evaluation.ui.board

| 类 | 方法摘录 |
|---|---|
| [Hilt_WhiteBoardDialogFragment](../../../android/新测评/smali_classes4/com/zykj/evaluation/ui/board/Hilt_WhiteBoardDialogFragment.smali) | `generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`onAttach`、`onAttach`、`onGetLayoutInflater` |
| [SketchDraftFragment](../../../android/新测评/smali_classes4/com/zykj/evaluation/ui/board/SketchDraftFragment.smali) | `onCreateView`、`onViewCreated` |
| [WhiteBoardDialogFragment](../../../android/新测评/smali_classes4/com/zykj/evaluation/ui/board/WhiteBoardDialogFragment.smali) | `initView`、`isFullDialog`、`isShowDim`、`layoutId` |
| [WhiteBoardDialogFragmentArgs](../../../android/新测评/smali_classes4/com/zykj/evaluation/ui/board/WhiteBoardDialogFragmentArgs.smali) | `fromBundle` |

## com.zykj.evaluation.ui.datepicker

| 类 | 方法摘录 |
|---|---|
| [DatePickerFragment](../../../android/新测评/smali_classes4/com/zykj/evaluation/ui/datepicker/DatePickerFragment.smali) | `initView`、`isFullDialog`、`layoutId`、`onCancel` |
| [DatePickerFragmentArgs](../../../android/新测评/smali_classes4/com/zykj/evaluation/ui/datepicker/DatePickerFragmentArgs.smali) | `fromBundle` |
| [Hilt_DatePickerFragment](../../../android/新测评/smali_classes4/com/zykj/evaluation/ui/datepicker/Hilt_DatePickerFragment.smali) | `generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`onAttach`、`onAttach`、`onGetLayoutInflater` |

## com.zykj.evaluation.ui.detail

| 类 | 方法摘录 |
|---|---|
| [GuideQuestion](../../../android/新测评/smali_classes4/com/zykj/evaluation/ui/detail/GuideQuestion.smali) | `describeContents`、`getDescription`、`getGroupId`、`getNeedRevise`、`getQuestionId`、`getTitle`、`isRelatedGroup` |

## com.zykj.evaluation.ui.detail.mistake

| 类 | 方法摘录 |
|---|---|
| [TagData](../../../android/新测评/smali_classes4/com/zykj/evaluation/ui/detail/mistake/TagData.smali) | `getId`、`getName`、`isSelected` |

## com.zykj.evaluation.ui.home

| 类 | 方法摘录 |
|---|---|
| [HomeFilterState](../../../android/新测评/smali_classes4/com/zykj/evaluation/ui/home/HomeFilterState.smali) | `getFilterDataList` |
| [HomeViewState](../../../android/新测评/smali_classes4/com/zykj/evaluation/ui/home/HomeViewState.smali) | `getCheckedFilterList`、`getPageTitleList`、`getSearchText`、`getStudentInfo` |

## com.zykj.evaluation.ui.widget

| 类 | 方法摘录 |
|---|---|
| [AnswerSheetCorrectView](../../../android/新测评/smali_classes4/com/zykj/evaluation/ui/widget/AnswerSheetCorrectView.smali) | `getCurrentBlankQuestionArea`、`getOnClickListener`、`onDraw`、`onSizeChanged`、`onTouchEvent`、`setImageBitmap`、`setOnClickListener` |
| [CustomIndicationFactory](../../../android/新测评/smali_classes4/com/zykj/evaluation/ui/widget/CustomIndicationFactory.smali) | `create`、`rememberUpdatedInstance` |
| [LoadingDialog](../../../android/新测评/smali_classes4/com/zykj/evaluation/ui/widget/LoadingDialog.smali) | `onCreateView`、`onStart` |

## com.zykj.evaluation.upload

| 类 | 方法摘录 |
|---|---|
| [AnswerUploadWork_AssistedFactory_Impl](../../../android/新测评/smali_classes4/com/zykj/evaluation/upload/AnswerUploadWork_AssistedFactory_Impl.smali) | `create` |
| [FileUploadWork_AssistedFactory_Impl](../../../android/新测评/smali_classes4/com/zykj/evaluation/upload/FileUploadWork_AssistedFactory_Impl.smali) | `create` |
| [MultiAnswerUploadWork](../../../android/新测评/smali_classes4/com/zykj/evaluation/upload/MultiAnswerUploadWork.smali) | `doWork` |
| [MultiAnswerUploadWork_AssistedFactory_Impl](../../../android/新测评/smali_classes4/com/zykj/evaluation/upload/MultiAnswerUploadWork_AssistedFactory_Impl.smali) | `create` |
| [OssData](../../../android/新测评/smali_classes4/com/zykj/evaluation/upload/OssData.smali) | `getObjectKey`、`getToken` |
| [OssToken](../../../android/新测评/smali_classes4/com/zykj/evaluation/upload/OssToken.smali) | `getAccessKeyId`、`getAccessKeySecret`、`getAppId`、`getBucket`、`getEndpoint`、`getExpiration`、`getSecurityToken` |
| [QuestionUploadWork](../../../android/新测评/smali_classes4/com/zykj/evaluation/upload/QuestionUploadWork.smali) | `doWork` |
| [QuestionUploadWork_AssistedFactory_Impl](../../../android/新测评/smali_classes4/com/zykj/evaluation/upload/QuestionUploadWork_AssistedFactory_Impl.smali) | `create` |
| [SelfCorrectQuestionUploadWork](../../../android/新测评/smali_classes4/com/zykj/evaluation/upload/SelfCorrectQuestionUploadWork.smali) | `doWork` |
| [SelfCorrectQuestionUploadWork_AssistedFactory_Impl](../../../android/新测评/smali_classes4/com/zykj/evaluation/upload/SelfCorrectQuestionUploadWork_AssistedFactory_Impl.smali) | `create` |
| [TokenReq](../../../android/新测评/smali_classes4/com/zykj/evaluation/upload/TokenReq.smali) | `getFc`、`getFe`、`getFo`、`getFr`、`getFt`、`getNonce`、`getSign` |
| [UploadWork](../../../android/新测评/smali_classes4/com/zykj/evaluation/upload/UploadWork.smali) | `doWork` |

## com.zykj.evaluation.utils

| 类 | 方法摘录 |
|---|---|
| [ExceptionHandle](../../../android/新测评/smali_classes4/com/zykj/evaluation/utils/ExceptionHandle.smali) | `caseRemoteCodeException`、`handleException` |
| [NeedReviseData](../../../android/新测评/smali_classes4/com/zykj/evaluation/utils/NeedReviseData.smali) | `getNeedRevise`、`getQuestionId`、`getUuid` |

## com.zykj.evaluation.version

| 类 | 方法摘录 |
|---|---|
| [ErrorInfo](../../../android/新测评/smali_classes4/com/zykj/evaluation/version/ErrorInfo.smali) | `getMessage` |
| [VersionResp](../../../android/新测评/smali_classes4/com/zykj/evaluation/version/VersionResp.smali) | `getError`、`getResult`、`getSuccess` |
| [VersionResult](../../../android/新测评/smali_classes4/com/zykj/evaluation/version/VersionResult.smali) | `describeContents`、`getAppType`、`getAppVersionId`、`getCreationTime`、`getCreatorUserId`、`getDescription`、`getDisabled` |
| [VersionUpgradeDialogFragment](../../../android/新测评/smali_classes4/com/zykj/evaluation/version/VersionUpgradeDialogFragment.smali) | `initView`、`layoutId`、`onStart` |

## com.zykj.http.bean

| 类 | 方法摘录 |
|---|---|
| [ApiResp](../../../android/新测评/smali_classes4/com/zykj/http/bean/ApiResp.smali) | `getCode`、`getError`、`getMsg`、`getResult`、`getSuccess` |
| [ErrorInfo](../../../android/新测评/smali_classes4/com/zykj/http/bean/ErrorInfo.smali) | `getCode`、`getDetails`、`getMessage` |
| [HeaderBean](../../../android/新测评/smali_classes4/com/zykj/http/bean/HeaderBean.smali) | `getAccessToken`、`getAppName`、`getRefreshToken`、`getServerUrl`、`getVersionCode` |

## com.zykj.http.exception

| 类 | 方法摘录 |
|---|---|
| [RemoteCodeException](../../../android/新测评/smali_classes4/com/zykj/http/exception/RemoteCodeException.smali) | `getErrorCodeInfo`、`setErrorCodeInfo` |

## com.zykj.http.interceptor

| 类 | 方法摘录 |
|---|---|
| [GzipInterceptor](../../../android/新测评/smali_classes4/com/zykj/http/interceptor/GzipInterceptor.smali) | `isGzipped`、`unzip`、`intercept` |
| [HeadInterceptor](../../../android/新测评/smali_classes4/com/zykj/http/interceptor/HeadInterceptor.smali) | `getHeaderBeanFlow`、`intercept`、`setHeaderBeanFlow` |
| [NetworkInterceptor](../../../android/新测评/smali_classes4/com/zykj/http/interceptor/NetworkInterceptor.smali) | `intercept` |
| [RefreshTokenInterceptor](../../../android/新测评/smali_classes4/com/zykj/http/interceptor/RefreshTokenInterceptor.smali) | `refreshTokenAndContinueRequest`、`getRefreshRepository`、`getUnauthorizedFlow`、`intercept`、`setRefreshRepository`、`setUnauthorizedFlow` |

## com.zykj.http.listener

| 类 | 方法摘录 |
|---|---|
| [UploadProgressListener](../../../android/新测评/smali_classes4/com/zykj/http/listener/UploadProgressListener.smali) | `onProgressUpdate` |

## com.zykj.http.progress

| 类 | 方法摘录 |
|---|---|
| [ProgressRequestBody](../../../android/新测评/smali_classes4/com/zykj/http/progress/ProgressRequestBody.smali) | `contentType`、`writeTo` |
| [ProgressRequestBodyKt](../../../android/新测评/smali_classes4/com/zykj/http/progress/ProgressRequestBodyKt.smali) | `asProgressRequestBody` |

## com.zykj.lib.error.code

| 类 | 方法摘录 |
|---|---|
| [ErrorCode](../../../android/新测评/smali_classes4/com/zykj/lib/error/code/ErrorCode.smali) | `valueOf`、`values`、`getErrorCodeInfo` |
| [ErrorCodeHandler](../../../android/新测评/smali_classes4/com/zykj/lib/error/code/ErrorCodeHandler.smali) | `getErrorCode` |
| [ErrorCodeInfo](../../../android/新测评/smali_classes4/com/zykj/lib/error/code/ErrorCodeInfo.smali) | `getCode`、`getDesc`、`getMessage`、`getMessageResId` |

## com.zykj.merge.sketch.config

| 类 | 方法摘录 |
|---|---|
| [RecorderConfig](../../../android/新测评/smali_classes4/com/zykj/merge/sketch/config/RecorderConfig.smali) | `getMaxImageCount`、`getPaintColor`、`getPaintWidth`、`getShapeType`、`getSourcePath`、`isRecord`、`isTouchable` |

## com.zykj.merge.sketch.constant

| 类 | 方法摘录 |
|---|---|
| [PlayStatus](../../../android/新测评/smali_classes4/com/zykj/merge/sketch/constant/PlayStatus.smali) | `valueOf`、`values`、`getState`、`getStateName`、`setState`、`setStateName` |

## com.zykj.merge.sketch.listener

| 类 | 方法摘录 |
|---|---|
| [MoveProxy](../../../android/新测评/smali_classes4/com/zykj/merge/sketch/listener/MoveProxy.smali) | `areaMoveEnd`、`areaMoveStart`、`areaMoving`、`getCurrentScreenBitmap`、`getMoveHorizontalProgress`、`getMoveMaxHeightTimes`、`getMoveMaxWidthTimes` |
| [Play](../../../android/新测评/smali_classes4/com/zykj/merge/sketch/listener/Play.smali) | `addPlayActionListener`、`destroy`、`getPath`、`isRend`、`loadData`、`pause`、`release` |
| [PlayStatusListener](../../../android/新测评/smali_classes4/com/zykj/merge/sketch/listener/PlayStatusListener.smali) | `onPlayEnd`、`onPlayPause`、`onPlayStart`、`onPlayWait`、`onProgress` |

## com.zykj.merge.sketch.view

| 类 | 方法摘录 |
|---|---|
| [BlackBoardProxyView](../../../android/新测评/smali_classes4/com/zykj/merge/sketch/view/BlackBoardProxyView.smali) | `runAtLeastCreated`、`addPlayActionListener`、`areaMoveEnd`、`areaMoveStart`、`areaMoving`、`destroy`、`getCurrentScreenBitmap` |
| [MergeSketchPlayView](../../../android/新测评/smali_classes4/com/zykj/merge/sketch/view/MergeSketchPlayView.smali) | `addPlayActionListener`、`areaMoveEnd`、`areaMoveStart`、`areaMoving`、`destroy`、`getMoveHorizontalProgress`、`getMoveMaxHeightTimes` |
| [NewSketchProxyView](../../../android/新测评/smali_classes4/com/zykj/merge/sketch/view/NewSketchProxyView.smali) | `addPlayActionListener`、`destroy`、`getPath`、`isRend`、`loadData`、`pause`、`release` |
| [OldSketchProxyView](../../../android/新测评/smali_classes4/com/zykj/merge/sketch/view/OldSketchProxyView.smali) | `getLoadDataExecutor`、`getSeekExecutor`、`runAtLeastCreated`、`runOnMainThread`、`addPlayActionListener`、`destroy`、`getPath` |

## com.zykj.message

| 类 | 方法摘录 |
|---|---|
| [KillSelfService](../../../android/新测评/smali/com/zykj/message/KillSelfService.smali) | `onBind`、`onStartCommand` |
| [UnInstallActivity](../../../android/新测评/smali/com/zykj/message/UnInstallActivity.smali) | `onBackPressed`、`onCreate`、`onResume` |
| [UnLoginActivity](../../../android/新测评/smali/com/zykj/message/UnLoginActivity.smali) | `onActivityResult`、`onBackPressed`、`onCreate`、`onDestroy`、`onPause`、`onRestart`、`onResume` |

## com.zykj.message.client

| 类 | 方法摘录 |
|---|---|
| [MessageClient](../../../android/新测评/smali/com/zykj/message/client/MessageClient.smali) | `valueOf`、`values` |

## com.zykj.message.server.bean

| 类 | 方法摘录 |
|---|---|
| [ServerInfo](../../../android/新测评/smali/com/zykj/message/server/bean/ServerInfo.smali) | `describeContents`、`writeToParcel` |
| [Status](../../../android/新测评/smali/com/zykj/message/server/bean/Status.smali) | `valueOf`、`values`、`describeContents`、`writeToParcel` |
| [UserInfo](../../../android/新测评/smali/com/zykj/message/server/bean/UserInfo.smali) | `describeContents`、`writeToParcel` |

## com.zykj.paint

| 类 | 方法摘录 |
|---|---|
| [Actions](../../../android/新测评/smali_classes5/com/zykj/paint/Actions.smali) | `getDescriptor`、`registerAllExtensions`、`registerAllExtensions` |
| [SketchSyncView](../../../android/新测评/smali_classes5/com/zykj/paint/SketchSyncView.smali) | `ezyColor`、`handleEvent`、`handleMultiFingerEvent`、`addAction`、`addMatrixAction`、`addPenTempPolylinePoint`、`addSketchAction` |

## com.zykj.paint.data

| 类 | 方法摘录 |
|---|---|
| [Rect2D](../../../android/新测评/smali_classes5/com/zykj/paint/data/Rect2D.smali) | `nestPoint`、`nestRect`、`scaleRect`、`ToRectF`、`getHeight`、`getMiddle`、`getWidth` |

## com.zykj.paint.draw

| 类 | 方法摘录 |
|---|---|
| [ISketchDraw](../../../android/新测评/smali_classes5/com/zykj/paint/draw/ISketchDraw.smali) | `cleanAll`、`hasDraw`、`touchDown`、`touchMove`、`touchUp` |
| [PolylineDrawer](../../../android/新测评/smali_classes5/com/zykj/paint/draw/PolylineDrawer.smali) | `cleanAll`、`hasDraw`、`touchDown`、`touchMove`、`touchUp` |

## com.zykj.paint.extensions

| 类 | 方法摘录 |
|---|---|
| [GraphExtKt](../../../android/新测评/smali_classes5/com/zykj/paint/extensions/GraphExtKt.smali) | `inverts`、`mapPoint`、`mapPoint`、`mapPoint` |

## com.zykj.paint.graphic

| 类 | 方法摘录 |
|---|---|
| [Graph](../../../android/新测评/smali_classes5/com/zykj/paint/graphic/Graph.smali) | `addGraph`、`directRender`、`getBaseColor`、`getBoundBox`、`getGraphs`、`getName`、`isVisable` |
| [Layer](../../../android/新测评/smali_classes5/com/zykj/paint/graphic/Layer.smali) | `directRender`、`findGraph`、`getBoundBox`、`render`、`render` |
| [Map](../../../android/新测评/smali_classes5/com/zykj/paint/graphic/Map.smali) | `addLayer`、`directRender`、`getBoundBox`、`getCurrentLayer`、`render`、`render`、`reset` |
| [PolyLine](../../../android/新测评/smali_classes5/com/zykj/paint/graphic/PolyLine.smali) | `directRender`、`directRender`、`getBoundBox`、`render`、`render` |
| [RectBmp](../../../android/新测评/smali_classes5/com/zykj/paint/graphic/RectBmp.smali) | `directRender`、`getBoundBox`、`release`、`render`、`render`、`setDstVector`、`setFilePath` |

## com.zykj.paint.player

| 类 | 方法摘录 |
|---|---|
| [PlayActionListener](../../../android/新测评/smali_classes5/com/zykj/paint/player/PlayActionListener.smali) | `onPause`、`onPlayEnd`、`onRerecord`、`onResume` |
| [PlayStatusListener](../../../android/新测评/smali_classes5/com/zykj/paint/player/PlayStatusListener.smali) | `onPlayEnd`、`onPlayPause`、`onPlayStart`、`onUpdate` |

## com.zykj.paint.record

| 类 | 方法摘录 |
|---|---|
| [AESUtils](../../../android/新测评/smali_classes5/com/zykj/paint/record/AESUtils.smali) | `Decrypt`、`Encrypt`、`decrypt`、`decryptVoice`、`encrypt`、`encryptVoice`、`getRawKey` |
| [AmrEncoder](../../../android/新测评/smali_classes5/com/zykj/paint/record/AmrEncoder.smali) | `encode` |
| [AudioEncoder](../../../android/新测评/smali_classes5/com/zykj/paint/record/AudioEncoder.smali) | `encode`、`getDestFile`、`getMediaFormat` |
| [AudioFileUtils](../../../android/新测评/smali_classes5/com/zykj/paint/record/AudioFileUtils.smali) | `clearPcmFiles`、`deleteDir`、`deleteDirWithFile`、`getAmrFileAbsolutePath`、`getAmrFiles`、`getPcmFileAbsolutePath`、`getPcmFiles` |
| [AudioRecorder](../../../android/新测评/smali_classes5/com/zykj/paint/record/AudioRecorder.smali) | `getInstance`、`makePCMFile2Amr`、`makePCMFileToWAVFile`、`mergePCMFilesToWAVFile`、`writeDataTOFile`、`canel`、`clearTempRecord` |
| [PcmToWav](../../../android/新测评/smali_classes5/com/zykj/paint/record/PcmToWav.smali) | `clearFiles`、`makePCMFileToWAVFile`、`mergePCMFilesToWAVFile`、`wavFileHeader` |
| [RecordListener](../../../android/新测评/smali_classes5/com/zykj/paint/record/RecordListener.smali) | `recordPause`、`recordResume` |
| [RecordStreamListener](../../../android/新测评/smali_classes5/com/zykj/paint/record/RecordStreamListener.smali) | `recordOfByte` |
| [WaveHeader](../../../android/新测评/smali_classes5/com/zykj/paint/record/WaveHeader.smali) | `WriteChar`、`WriteInt`、`WriteShort`、`getHeader` |

## com.zykj.paint.record.control

| 类 | 方法摘录 |
|---|---|
| [BaseControl](../../../android/新测评/smali_classes5/com/zykj/paint/record/control/BaseControl.smali) | `getBitmapPoints`、`getBitmapPoints`、`getDistance`、`getDistance`、`getRotation`、`getRotation`、`midPoint` |
| [CompassesControl](../../../android/新测评/smali_classes5/com/zykj/paint/record/control/CompassesControl.smali) | `circleCheck`、`isTouchInGraph`、`pointCheck`、`cleanAll`、`getGraphSnapShot`、`hasDraw`、`touchDown` |
| [DefaultControl](../../../android/新测评/smali_classes5/com/zykj/paint/record/control/DefaultControl.smali) | `cleanAll`、`getGraphSnapShot`、`hasDraw`、`touchDown`、`touchMove`、`touchPointerDown`、`touchPointerUp` |
| [EraserControl](../../../android/新测评/smali_classes5/com/zykj/paint/record/control/EraserControl.smali) | `cleanAll`、`getGraphSnapShot`、`hasDraw`、`touchDown`、`touchMove`、`touchPointerDown`、`touchPointerUp` |
| [ISketchControl](../../../android/新测评/smali_classes5/com/zykj/paint/record/control/ISketchControl.smali) | `cleanAll`、`getGraphSnapShot`、`hasDraw`、`touchDown`、`touchMove`、`touchPointerDown`、`touchPointerUp` |
| [MapControl](../../../android/新测评/smali_classes5/com/zykj/paint/record/control/MapControl.smali) | `cleanAll`、`getGraphSnapShot`、`hasDraw`、`tempDraw`、`touchDown`、`touchMove`、`touchPointerDown` |
| [PenControl](../../../android/新测评/smali_classes5/com/zykj/paint/record/control/PenControl.smali) | `cleanAll`、`getGraphSnapShot`、`hasDraw`、`touchDown`、`touchMove`、`touchPointerDown`、`touchPointerUp` |
| [PictureControl](../../../android/新测评/smali_classes5/com/zykj/paint/record/control/PictureControl.smali) | `circleCheck`、`getActionMode`、`isTouchInGraph`、`pointCheck`、`cleanAll`、`getGraphSnapShot`、`hasDraw` |
| [RulerControl](../../../android/新测评/smali_classes5/com/zykj/paint/record/control/RulerControl.smali) | `cleanAll`、`getGraphSnapShot`、`hasDraw`、`touchDown`、`touchMove`、`touchPointerDown`、`touchPointerUp` |

## com.zykj.paint.record.model

| 类 | 方法摘录 |
|---|---|
| [CompassSnapShot](../../../android/新测评/smali_classes5/com/zykj/paint/record/model/CompassSnapShot.smali) | `calculateRadius`、`getCompassMode`、`onGraphChange`、`setCenterPoint`、`setDownMatrix`、`updateGraph` |
| [GraphSnapShot](../../../android/新测评/smali_classes5/com/zykj/paint/record/model/GraphSnapShot.smali) | `calculateDegree`、`calculateDegree`、`delByLines`、`exactCalculateDegree`、`exactCalculateDegree`、`getActionMode`、`getPointsLength` |
| [MapSnapShot](../../../android/新测评/smali_classes5/com/zykj/paint/record/model/MapSnapShot.smali) | `randomColor`、`updateSketchSnapshot`、`addStickyEzyPath`、`clear`、`delByLines`、`getBitmapPoints`、`setSelect` |
| [PictureSnapShot](../../../android/新测评/smali_classes5/com/zykj/paint/record/model/PictureSnapShot.smali) | `randomColor`、`updateSketchSnapshot`、`updateSketchWithLocalProtobufData`、`addStickyEzyPath`、`delByLines`、`getBitmapPoints`、`setSelect` |
| [RulerSnapShot](../../../android/新测评/smali_classes5/com/zykj/paint/record/model/RulerSnapShot.smali) | `isInDrawGraphRect`、`setDownScale`、`setScaleMatrix` |

## com.zykj.paint.render

| 类 | 方法摘录 |
|---|---|
| [MapRender](../../../android/新测评/smali_classes5/com/zykj/paint/render/MapRender.smali) | `clear`、`directDrawBitmap`、`directDrawPolyLine`、`drawBezierLine`、`drawBitmap`、`drawBitmap`、`drawPolyLine` |
| [MapViewer](../../../android/新测评/smali_classes5/com/zykj/paint/render/MapViewer.smali) | `GeoRect2ViewRect`、`clear`、`destroy`、`directRenderAll`、`geoVector2ViewVector`、`geoVector2ViewVector`、`moveViewPort` |
| [SketchPlayer](../../../android/新测评/smali_classes5/com/zykj/paint/render/SketchPlayer.smali) | `getTotalTime`、`playMusic`、`playWithLocalSource`、`destroyPlayer`、`getSnapshot`、`hideSeekBar`、`pausePlayer` |
| [SketchRender](../../../android/新测评/smali_classes5/com/zykj/paint/render/SketchRender.smali) | `clear`、`directDrawBitmap`、`directDrawPolyLine`、`drawBezierLine`、`drawBitmap`、`drawBitmap`、`drawPolyLine` |
| [SketchViewer](../../../android/新测评/smali_classes5/com/zykj/paint/render/SketchViewer.smali) | `getScaleMatrix`、`getTotalTime`、`playMusic`、`renderTemp`、`getCapture`、`getTotalTime`、`isEnded` |

## com.zykj.paint.runner

| 类 | 方法摘录 |
|---|---|
| [ActionProcessor](../../../android/新测评/smali_classes5/com/zykj/paint/runner/ActionProcessor.smali) | `addAction`、`addMultiAction`、`destroy`、`pause`、`renderAction`、`renderHistory`、`renderImage` |
| [ActionRunner](../../../android/新测评/smali_classes5/com/zykj/paint/runner/ActionRunner.smali) | `pause`、`resume` |
| [ImageActionRunner](../../../android/新测评/smali_classes5/com/zykj/paint/runner/ImageActionRunner.smali) | `getSourceUrl`、`pause`、`resume`、`setSourceUrl` |
| [LayerActionRunner](../../../android/新测评/smali_classes5/com/zykj/paint/runner/LayerActionRunner.smali) | `pause`、`resume` |
| [MatrixActionRunner](../../../android/新测评/smali_classes5/com/zykj/paint/runner/MatrixActionRunner.smali) | `pause`、`resume` |
| [MoveActionRunner](../../../android/新测评/smali_classes5/com/zykj/paint/runner/MoveActionRunner.smali) | `pause`、`resume` |
| [PolylineActionRunner](../../../android/新测评/smali_classes5/com/zykj/paint/runner/PolylineActionRunner.smali) | `processPreActions`、`getTaskScheduledExecutorService`、`isImmediate`、`pause`、`resume`、`setImmediate`、`setTaskScheduledExecutorService` |
| [ZoomActionRunner](../../../android/新测评/smali_classes5/com/zykj/paint/runner/ZoomActionRunner.smali) | `pause`、`resume` |

## com.zykj.paint.util

| 类 | 方法摘录 |
|---|---|
| [LineUtils](../../../android/新测评/smali_classes5/com/zykj/paint/util/LineUtils.smali) | `lineSpace`、`point2Line`、`point2Polyline`、`pointToLine` |
| [TimeUtils](../../../android/新测评/smali_classes5/com/zykj/paint/util/TimeUtils.smali) | `formatPhotoDate`、`formatPhotoDate`、`formatTime`、`getNowTimeString`、`timeFormat` |

## com.zykj.sketch

| 类 | 方法摘录 |
|---|---|
| [EzyDrawBoard](../../../android/新测评/smali_classes5/com/zykj/sketch/EzyDrawBoard.smali) | `getDescriptor`、`registerAllExtensions`、`registerAllExtensions` |
| [GraphSnapshot](../../../android/新测评/smali_classes5/com/zykj/sketch/GraphSnapshot.smali) | `getDescriptor`、`registerAllExtensions`、`registerAllExtensions` |
| [SketchHeader](../../../android/新测评/smali_classes5/com/zykj/sketch/SketchHeader.smali) | `getDescriptor`、`registerAllExtensions`、`registerAllExtensions` |

## com.zykj.sketch.core

| 类 | 方法摘录 |
|---|---|
| [ActionExecute](../../../android/新测评/smali_classes5/com/zykj/sketch/core/ActionExecute.smali) | `addNewGraph`、`buildHistoryGraph`、`setAttribute`、`setAttribute2`、`addViewControl`、`buildGraph`、`buildMatrix` |
| [ActionRecord](../../../android/新测评/smali_classes5/com/zykj/sketch/core/ActionRecord.smali) | `buildActionContent`、`buildHistoryRendData`、`notifyListener`、`addActionChangeListener`、`addHistoryRecord`、`addHistoryRenderGraphSnapshot`、`addNextPrevListener` |
| [ActionRecordExecute](../../../android/新测评/smali_classes5/com/zykj/sketch/core/ActionRecordExecute.smali) | `addRecord`、`onActionModeEvent`、`onAddImageEvent`、`onAddPPTEvent`、`onAudioStartRecord`、`onAudioStopRecord`、`onClearBoardEvent` |
| [ActionStrategyFactory](../../../android/新测评/smali_classes5/com/zykj/sketch/core/ActionStrategyFactory.smali) | `getActionGraphName`、`getGraphName`、`buildActionMode`、`clearAction`、`create`、`getAction`、`parseActionMode` |
| [GraphControl](../../../android/新测评/smali_classes5/com/zykj/sketch/core/GraphControl.smali) | `handleDeleteListener`、`initGraphConfig`、`clear`、`clearTempPaint`、`findGraph`、`findSelectGraph`、`forceRender` |

## com.zykj.sketch.core.action

| 类 | 方法摘录 |
|---|---|
| [BaseAction](../../../android/新测评/smali_classes5/com/zykj/sketch/core/action/BaseAction.smali) | `getTouchEventList`、`getTouchStartTime`、`isRecord`、`isTouchEnable`、`onTouchDown`、`onTouchMove`、`onTouchPointerDown` |
| [EraseViewAction](../../../android/新测评/smali_classes5/com/zykj/sketch/core/action/EraseViewAction.smali) | `deleteGraph`、`handleListener`、`enumType`、`onTouchDown` |
| [EraseWritingAction](../../../android/新测评/smali_classes5/com/zykj/sketch/core/action/EraseWritingAction.smali) | `deleteGraph`、`enumType`、`onTouchDown`、`onTouchMove`、`onTouchPointerDown`、`onTouchPointerUp`、`onTouchUp` |
| [SelectAction](../../../android/新测评/smali_classes5/com/zykj/sketch/core/action/SelectAction.smali) | `initTempValue`、`enumType`、`getMode`、`onTouchDown`、`onTouchMove`、`onTouchPointerDown`、`onTouchPointerUp` |
| [WritingAction](../../../android/新测评/smali_classes5/com/zykj/sketch/core/action/WritingAction.smali) | `createGraph`、`enumType`、`getGraph`、`getMX`、`getMY`、`getParentGraphName`、`getPath` |
| [WritingAndMoveAction](../../../android/新测评/smali_classes5/com/zykj/sketch/core/action/WritingAndMoveAction.smali) | `initTempValue`、`enumType`、`getGraph`、`getMX`、`getMY`、`getParentGraphName`、`getPath` |
| [WritingAndMoveVerticalAction](../../../android/新测评/smali_classes5/com/zykj/sketch/core/action/WritingAndMoveVerticalAction.smali) | `initTempValue`、`enumType`、`getGraph`、`getMX`、`getMY`、`getParentGraphName`、`getPath` |

## com.zykj.sketch.core.config

| 类 | 方法摘录 |
|---|---|
| [GraphConfig](../../../android/新测评/smali_classes5/com/zykj/sketch/core/config/GraphConfig.smali) | `getColor`、`getWidth`、`setColor`、`setWidth` |
| [SketchConfig](../../../android/新测评/smali_classes5/com/zykj/sketch/core/config/SketchConfig.smali) | `getContext`、`getMaxImageCount`、`getMaxPPTCount`、`getSourcePath`、`isTouchable`、`setMaxImageCount`、`setMaxPPTCount` |

## com.zykj.sketch.core.data

| 类 | 方法摘录 |
|---|---|
| [AudioTask](../../../android/新测评/smali_classes5/com/zykj/sketch/core/data/AudioTask.smali) | `getDuration`、`getFileName`、`getPath`、`getStartTime`、`setDuration`、`setPath` |
| [CORNER](../../../android/新测评/smali_classes5/com/zykj/sketch/core/data/CORNER.smali) | `valueOf`、`values` |
| [GraphTask](../../../android/新测评/smali_classes5/com/zykj/sketch/core/data/GraphTask.smali) | `getActionContent`、`getExecuteVoid`、`getHasSnapshot`、`getSnapshotVoid`、`getStartTime` |
| [Mode](../../../android/新测评/smali_classes5/com/zykj/sketch/core/data/Mode.smali) | `valueOf`、`values` |
| [PlayStatus](../../../android/新测评/smali_classes5/com/zykj/sketch/core/data/PlayStatus.smali) | `valueOf`、`values`、`getState`、`getStateName`、`setState`、`setStateName` |
| [RenderTask](../../../android/新测评/smali_classes5/com/zykj/sketch/core/data/RenderTask.smali) | `getAudioTaskList`、`getGraphTask`、`getLastSnapshot`、`getProgress`、`setLastSnapshot`、`setProgress` |
| [ThumbnailBean](../../../android/新测评/smali_classes5/com/zykj/sketch/core/data/ThumbnailBean.smali) | `getBitmap`、`getLimitRenderRectF`、`getMaxRenderRectF` |

## com.zykj.sketch.core.graph

| 类 | 方法摘录 |
|---|---|
| [BoundedContainerGraph](../../../android/新测评/smali_classes5/com/zykj/sketch/core/graph/BoundedContainerGraph.smali) | `getSnapshot`、`graphType`、`onMeasure` |
| [CircleGraph](../../../android/新测评/smali_classes5/com/zykj/sketch/core/graph/CircleGraph.smali) | `onMeasure`、`render` |
| [Graph](../../../android/新测评/smali_classes5/com/zykj/sketch/core/graph/Graph.smali) | `drawBorder`、`showDelete`、`addGraph`、`cancelSelected`、`childTypeNumber`、`clear`、`findGraph` |
| [GraphExtKt](../../../android/新测评/smali_classes5/com/zykj/sketch/core/graph/GraphExtKt.smali) | `convert2FM`、`convert2WM`、`getFP2WPMatrix`、`getFP2WPRendMatrix`、`getWP2FPMatrix`、`getWP2LPMatrix`、`initPaint` |
| [ImageGraph](../../../android/新测评/smali_classes5/com/zykj/sketch/core/graph/ImageGraph.smali) | `getTranslateCenterMatrix`、`reloadBitmap`、`checkOldData`、`getFileName`、`getSnapshot`、`graphType`、`onMeasure` |
| [ImageHistoryGraph](../../../android/新测评/smali_classes5/com/zykj/sketch/core/graph/ImageHistoryGraph.smali) | `getSaleCenterMatrix`、`getFileName`、`getSnapshot`、`graphType`、`onDestroy`、`onDraw`、`onMeasure` |
| [RectGraph](../../../android/新测评/smali_classes5/com/zykj/sketch/core/graph/RectGraph.smali) | `onMeasure`、`render` |
| [StrokeGraph](../../../android/新测评/smali_classes5/com/zykj/sketch/core/graph/StrokeGraph.smali) | `isIntersect`、`addFPPoint`、`addPoint`、`addPoint`、`findGraph`、`getActionControl`、`getSnapshot` |
| [UnBoundedContainerGraph](../../../android/新测评/smali_classes5/com/zykj/sketch/core/graph/UnBoundedContainerGraph.smali) | `getSnapshot`、`graphType`、`isInRect`、`onMeasure` |
| [ViewGraph](../../../android/新测评/smali_classes5/com/zykj/sketch/core/graph/ViewGraph.smali) | `compressImage` |
| [WebViewGraph](../../../android/新测评/smali_classes5/com/zykj/sketch/core/graph/WebViewGraph.smali) | `getSaleCenterMatrix`、`startRefresh`、`getBitmap`、`getCompressbitmap`、`getSnapshot`、`graphType`、`onDestroy` |
| [WritingGroupGraph](../../../android/新测评/smali_classes5/com/zykj/sketch/core/graph/WritingGroupGraph.smali) | `addGraph`、`createPath`、`crossLine`、`getIntersectGraph`、`getIntersectGraph`、`getSnapshot`、`graphType` |

## com.zykj.sketch.core.listener

| 类 | 方法摘录 |
|---|---|
| [ActionChangeListener](../../../android/新测评/smali_classes5/com/zykj/sketch/core/listener/ActionChangeListener.smali) | `change` |
| [AudioOperation](../../../android/新测评/smali_classes5/com/zykj/sketch/core/listener/AudioOperation.smali) | `isRecord`、`setProgressListener`、`startRecord`、`stopRecord` |
| [EventListener](../../../android/新测评/smali_classes5/com/zykj/sketch/core/listener/EventListener.smali) | `addViewControl`、`graphSnapShot`、`graphSnapShot`、`initConfig`、`onActionModeEvent`、`onAddImageEvent`、`onAddPPTEvent` |
| [GraphMatrixListener](../../../android/新测评/smali_classes5/com/zykj/sketch/core/listener/GraphMatrixListener.smali) | `onScale`、`onTranslation` |
| [IAction](../../../android/新测评/smali_classes5/com/zykj/sketch/core/listener/IAction.smali) | `enumType`、`getTouchEventList`、`getTouchStartTime`、`isRecord`、`onTouchDown`、`onTouchMove`、`onTouchPointerDown` |
| [IControl](../../../android/新测评/smali_classes5/com/zykj/sketch/core/listener/IControl.smali) | `clear`、`clearTempPaint`、`findGraph`、`findSelectGraph`、`forceRender`、`getBackgroundColor`、`getCameraMatrix` |
| [IDraw](../../../android/新测评/smali_classes5/com/zykj/sketch/core/listener/IDraw.smali) | `onDraw`、`onDrawComplete`、`render` |
| [IGraph](../../../android/新测评/smali_classes5/com/zykj/sketch/core/listener/IGraph.smali) | `findGraphByName`、`findGraphByType`、`getGraphName`、`getSnapshot`、`graphType`、`isComplete`、`isInRect` |
| [IUserPlay](../../../android/新测评/smali_classes5/com/zykj/sketch/core/listener/IUserPlay.smali) | `addPlayActionListener`、`destroy`、`getPlayStatus`、`loadData`、`pause`、`removePlayActionListener`、`seekTo` |
| [ImageDeleteListener](../../../android/新测评/smali_classes5/com/zykj/sketch/core/listener/ImageDeleteListener.smali) | `onDeleteImagePath` |
| [ImitateDraw](../../../android/新测评/smali_classes5/com/zykj/sketch/core/listener/ImitateDraw.smali) | `clearGraph`、`drawPath`、`drawThumbnail`、`graphMatrix`、`setLimitDrawArea` |
| [ModeChangeListener](../../../android/新测评/smali_classes5/com/zykj/sketch/core/listener/ModeChangeListener.smali) | `onChange` |
| [NextPrevListener](../../../android/新测评/smali_classes5/com/zykj/sketch/core/listener/NextPrevListener.smali) | `listener` |
| [PPTControl](../../../android/新测评/smali_classes5/com/zykj/sketch/core/listener/PPTControl.smali) | `goPage`、`nextAction`、`nextSlide`、`preAction`、`preSlide` |
| [PPTListener](../../../android/新测评/smali_classes5/com/zykj/sketch/core/listener/PPTListener.smali) | `currentPage`、`onPageFinished`、`totalPageCount` |
| [PlayActionListener](../../../android/新测评/smali_classes5/com/zykj/sketch/core/listener/PlayActionListener.smali) | `onPlayEnd`、`onPlayPause`、`onPlayStart`、`onProgress`、`onWaitPlay` |
| [ProgressListener](../../../android/新测评/smali_classes5/com/zykj/sketch/core/listener/ProgressListener.smali) | `progress`、`recordError` |
| [RealDraw](../../../android/新测评/smali_classes5/com/zykj/sketch/core/listener/RealDraw.smali) | `drawGraph`、`setDrawBackground`、`setLimitDrawArea`、`shutdown` |

## com.zykj.sketch.core.player

| 类 | 方法摘录 |
|---|---|
| [AudioThread](../../../android/新测评/smali_classes5/com/zykj/sketch/core/player/AudioThread.smali) | `getTotalDuration`、`initMediaPlayer`、`notifyProgress`、`resetMediaPlay`、`stopAllAudio`、`initSeekTo`、`pausePlay` |
| [PaintThread](../../../android/新测评/smali_classes5/com/zykj/sketch/core/player/PaintThread.smali) | `getTotalDuration`、`notifyProgress`、`initSeekTo`、`pausePlay`、`resumePlay`、`seekTo`、`setData` |
| [PlayControl](../../../android/新测评/smali_classes5/com/zykj/sketch/core/player/PlayControl.smali) | `checkAudioFile`、`parseDrawBoardData`、`addPlayActionListener`、`getPlayStatus`、`loadData`、`onDestroy`、`pause` |
| [PlayThread](../../../android/新测评/smali_classes5/com/zykj/sketch/core/player/PlayThread.smali) | `getPlayStatus`、`getStatus`、`pausePlay`、`reset`、`resumePlay`、`setPlayStatus`、`shutdown` |
| [SketchPlayerView](../../../android/新测评/smali_classes5/com/zykj/sketch/core/player/SketchPlayerView.smali) | `getLoadDataExecutor`、`getSeekExecutor`、`runAtLeastCreated`、`addPlayActionListener`、`destroy`、`getPlayStatus`、`isRend` |

## com.zykj.sketch.core.record

| 类 | 方法摘录 |
|---|---|
| [AudioControl](../../../android/新测评/smali_classes5/com/zykj/sketch/core/record/AudioControl.smali) | `addListener`、`isRecord`、`reset`、`startRecord`、`stopRecord` |
| [GraphOperation](../../../android/新测评/smali_classes5/com/zykj/sketch/core/record/GraphOperation.smali) | `addImage`、`addImage`、`addImage`、`addImage`、`addPPT`、`clear`、`getConfig` |
| [RecordControl](../../../android/新测评/smali_classes5/com/zykj/sketch/core/record/RecordControl.smali) | `addImage`、`countScale`、`executeActionContent`、`executeTask`、`getImagePath`、`saveBitmap`、`addActionChangeListener` |
| [SketchRecorderView](../../../android/新测评/smali_classes5/com/zykj/sketch/core/record/SketchRecorderView.smali) | `addImage`、`addImage`、`addImage`、`addImage`、`addPPT`、`clear`、`getConfig` |

## com.zykj.sketch.core.version

| 类 | 方法摘录 |
|---|---|
| [GraphTaskParseVersion1](../../../android/新测评/smali_classes5/com/zykj/sketch/core/version/GraphTaskParseVersion1.smali) | `parseEventAsTask`、`parse` |
| [GraphTaskParseVersion3](../../../android/新测评/smali_classes5/com/zykj/sketch/core/version/GraphTaskParseVersion3.smali) | `addGraphTask`、`countTaskStartTime`、`deleteSnapShot`、`parseEventAsTask`、`parseEventAsTask`、`getFlag`、`parse` |
| [GraphTaskParseVersion4](../../../android/新测评/smali_classes5/com/zykj/sketch/core/version/GraphTaskParseVersion4.smali) | `addGraphTask`、`countTaskStartTime`、`deleteSnapShot`、`parseEventAsTask`、`parseEventAsTask`、`getFlag`、`parse` |
| [GraphTaskParseVersion5](../../../android/新测评/smali_classes5/com/zykj/sketch/core/version/GraphTaskParseVersion5.smali) | `addGraphTask`、`countTaskStartTime`、`deleteSnapShot`、`parseEventAsTask`、`parseEventAsTask`、`getFlag`、`parse` |
| [ITaskParse](../../../android/新测评/smali_classes5/com/zykj/sketch/core/version/ITaskParse.smali) | `parse` |

## com.zykj.sketch.extensions

| 类 | 方法摘录 |
|---|---|
| [ExtensionsKt](../../../android/新测评/smali_classes5/com/zykj/sketch/extensions/ExtensionsKt.smali) | `capture`、`getDegree`、`getDistance`、`getDistance`、`getMidPoint`、`getRotation`、`lineSpace` |

## com.zykj.sketch.utils

| 类 | 方法摘录 |
|---|---|
| [ToastUtils](../../../android/新测评/smali_classes5/com/zykj/sketch/utils/ToastUtils.smali) | `showLong`、`showLong`、`showShort`、`showShort` |

## com.zykj.sketch.widgets

| 类 | 方法摘录 |
|---|---|
| [DrawTempView](../../../android/新测评/smali_classes5/com/zykj/sketch/widgets/DrawTempView.smali) | `clearGraph`、`drawPath`、`drawThumbnail`、`graphMatrix`、`onDraw`、`setLimitDrawArea` |
| [DrawView](../../../android/新测评/smali_classes5/com/zykj/sketch/widgets/DrawView.smali) | `drawGraph`、`onDraw`、`setDrawBackground`、`setLimitDrawArea`、`shutdown` |
| [PPTWebView](../../../android/新测评/smali_classes5/com/zykj/sketch/widgets/PPTWebView.smali) | `goPage`、`loadSlider`、`nextAction`、`nextSlide`、`onTouchEvent`、`preAction`、`preSlide` |
| [SurfaceDrawView](../../../android/新测评/smali_classes5/com/zykj/sketch/widgets/SurfaceDrawView.smali) | `drawGraph`、`setDrawBackground`、`setLimitDrawArea`、`shutdown`、`surfaceChanged`、`surfaceCreated`、`surfaceDestroyed` |
| [TempView](../../../android/新测评/smali_classes5/com/zykj/sketch/widgets/TempView.smali) | `onDraw`、`rectConvertRegion` |
| [TextureDrawView](../../../android/新测评/smali_classes5/com/zykj/sketch/widgets/TextureDrawView.smali) | `dispatchVisibilityChanged`、`drawGraph`、`isRend`、`onDetachedFromWindow`、`onSurfaceTextureAvailable`、`onSurfaceTextureDestroyed`、`onSurfaceTextureSizeChanged` |

## com.zykj.view

| 类 | 方法摘录 |
|---|---|
| [DataBinderMapperImpl](../../../android/新测评/smali_classes5/com/zykj/view/DataBinderMapperImpl.smali) | `collectDependencies`、`convertBrIdToString`、`getDataBinder`、`getDataBinder`、`getLayoutId` |
| [EzySimpleBoardData](../../../android/新测评/smali_classes5/com/zykj/view/EzySimpleBoardData.smali) | `registerAllExtensions` |

## com.zykj.view.board.board

| 类 | 方法摘录 |
|---|---|
| [BoardFragment](../../../android/新测评/smali_classes5/com/zykj/view/board/board/BoardFragment.smali) | `hideProgress`、`onCreateView`、`onDestroyView`、`onViewCreated`、`showProgress` |

## com.zykj.view.board.crop

| 类 | 方法摘录 |
|---|---|
| [BlackboardCropFragment](../../../android/新测评/smali_classes5/com/zykj/view/board/crop/BlackboardCropFragment.smali) | `hideProgress`、`onActivityCreated`、`onCreateView`、`onDestroyView`、`onHiddenChanged`、`onPause`、`onResume` |

## com.zykj.view.board.evaluation

| 类 | 方法摘录 |
|---|---|
| [BlackboardEvaluationFragment](../../../android/新测评/smali_classes5/com/zykj/view/board/evaluation/BlackboardEvaluationFragment.smali) | `onCreate`、`onCreateView`、`onDestroyView`、`onViewCreated` |

## com.zykj.view.board.play

| 类 | 方法摘录 |
|---|---|
| [PlaySettingAdapter](../../../android/新测评/smali_classes5/com/zykj/view/board/play/PlaySettingAdapter.smali) | `getItemCount`、`onBindViewHolder`、`onCreateViewHolder` |
| [SketchPlayFragment](../../../android/新测评/smali_classes5/com/zykj/view/board/play/SketchPlayFragment.smali) | `hideProgress`、`onCreateView`、`onDestroyView`、`onHiddenChanged`、`onPause`、`onResume`、`onViewCreated` |
| [SpeedRateAdapter](../../../android/新测评/smali_classes5/com/zykj/view/board/play/SpeedRateAdapter.smali) | `onBindViewHolder`、`onCreateViewHolder` |

## com.zykj.view.board.simple

| 类 | 方法摘录 |
|---|---|
| [SimpleFragment](../../../android/新测评/smali_classes5/com/zykj/view/board/simple/SimpleFragment.smali) | `onCreateView`、`onViewCreated` |

## com.zykj.view.simpleBoard

| 类 | 方法摘录 |
|---|---|
| [SimpleBoardView](../../../android/新测评/smali_classes5/com/zykj/view/simpleBoard/SimpleBoardView.smali) | `getImageBackground`、`getSimpleBoardConfig`、`onMeasure`、`onTouchEvent`、`setActonMode`、`setImageBackground`、`setOnActionListener` |

## com.zykj.view.ui.camera

| 类 | 方法摘录 |
|---|---|
| [EzyCameraActivity](../../../android/新测评/smali_classes5/com/zykj/view/ui/camera/EzyCameraActivity.smali) | `onCreate` |
| [ImagePickFragment](../../../android/新测评/smali_classes5/com/zykj/view/ui/camera/ImagePickFragment.smali) | `onCreateView`、`onResume`、`onViewCreated` |

## com.zykj.view.ui.crop

| 类 | 方法摘录 |
|---|---|
| [EzyCropActivity](../../../android/新测评/smali_classes5/com/zykj/view/ui/crop/EzyCropActivity.smali) | `onCreate` |

## com.zykj.view.utils

| 类 | 方法摘录 |
|---|---|
| [ProtoPath](../../../android/新测评/smali_classes5/com/zykj/view/utils/ProtoPath.smali) | `getPaint`、`getPointList` |
| [ZoomPointSolution](../../../android/新测评/smali_classes5/com/zykj/view/utils/ZoomPointSolution.smali) | `valueOf`、`values` |

## com.zykj.view.widget

| 类 | 方法摘录 |
|---|---|
| [DoubleSeekBar](../../../android/新测评/smali_classes5/com/zykj/view/widget/DoubleSeekBar.smali) | `getBarSize`、`getKeyPointColor`、`getKeyPointList`、`getMaskChangeListener`、`getMaskColor`、`getMaskProgress`、`getMax` |
| [SketchBoardTouchFrameLayout](../../../android/新测评/smali_classes5/com/zykj/view/widget/SketchBoardTouchFrameLayout.smali) | `dispatchTouchEvent`、`getOnBeforeTouchDispatchToChildren`、`setOnBeforeTouchDispatchToChildren` |
| [SketchProgressView](../../../android/新测评/smali_classes5/com/zykj/view/widget/SketchProgressView.smali) | `getViewCrossLength`、`getViewMainLength`、`getOrientation`、`getProgress`、`getProgressListener`、`getThumbTime`、`onDetachedFromWindow` |
| [TouchSwitchView](../../../android/新测评/smali_classes5/com/zykj/view/widget/TouchSwitchView.smali) | `onInterceptTouchEvent`、`setCanTouch` |

## com.zykj.view.widget.customColor

| 类 | 方法摘录 |
|---|---|
| [CustomColorFrameLayout](../../../android/新测评/smali_classes5/com/zykj/view/widget/customColor/CustomColorFrameLayout.smali) | `getOnColorChangeListener`、`getSelectColor`、`setBackgroundLight`、`setOnColorChangeListener`、`setSelectColor` |
| [CustomColorLayout](../../../android/新测评/smali_classes5/com/zykj/view/widget/customColor/CustomColorLayout.smali) | `getOnColorChangeListener`、`getSelectColor`、`setOnColorChangeListener`、`setSelectColor` |
| [LatestColorLayout](../../../android/新测评/smali_classes5/com/zykj/view/widget/customColor/LatestColorLayout.smali) | `getOnColorChangeListener`、`getSelectColor`、`setOnColorChangeListener`、`setSelectColor` |

## com.zykj.view.widget.radio

| 类 | 方法摘录 |
|---|---|
| [CustomColorRadioButton](../../../android/新测评/smali_classes5/com/zykj/view/widget/radio/CustomColorRadioButton.smali) | `getNoColorBitmap`、`getNoColorRect`、`getWithColorBitmap`、`getWithColorRect`、`getColor`、`onDraw`、`onLayout` |
| [WithSelectedRadioButton](../../../android/新测评/smali_classes5/com/zykj/view/widget/radio/WithSelectedRadioButton.smali) | `onDraw`、`onLayout`、`setChecked`、`setPressed` |
