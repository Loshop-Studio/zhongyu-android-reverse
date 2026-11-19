# 优课畅学 业务代码导航

每个表格对应一个保留业务命名空间的包，方法来自 DEX 的类定义。点击类名可查看参与编译的实现。生成绑定、单字母类及第三方库另见完整包索引。

## com.zykj.base

| 类 | 方法摘录 |
|---|---|
| [BaseActivity](../../../android/优课畅学/smali_classes4/com/zykj/base/BaseActivity.smali) | `getMBindView`、`initData`、`initView`、`layoutId`、`onCreate`、`setMBindView` |
| [BaseApplication](../../../android/优课畅学/smali_classes4/com/zykj/base/BaseApplication.smali) | `onCreate` |
| [BaseDialogFragment](../../../android/优课畅学/smali_classes4/com/zykj/base/BaseDialogFragment.smali) | `cancelable`、`canceledOnTouchOutside`、`dismiss`、`getMBindView`、`initData`、`initView`、`isFullDialog` |
| [BaseFragment](../../../android/优课畅学/smali_classes4/com/zykj/base/BaseFragment.smali) | `getMBindView`、`initData`、`initView`、`layoutId`、`onCreate`、`onCreateView`、`onViewCreated` |
| [BaseViewModel](../../../android/优课畅学/smali_classes4/com/zykj/base/BaseViewModel.smali) | `getToastLiveData`、`handlerThrowable`、`isDialogVisible`、`launch`、`launchAsync`、`launchAsyncData`、`launchData` |
| [DataBinderMapperImpl](../../../android/优课畅学/smali_classes4/com/zykj/base/DataBinderMapperImpl.smali) | `collectDependencies`、`convertBrIdToString`、`getDataBinder`、`getDataBinder`、`getLayoutId` |

## com.zykj.base.bean.toast

| 类 | 方法摘录 |
|---|---|
| [ToastErrorCodeMessage](../../../android/优课畅学/smali_classes4/com/zykj/base/bean/toast/ToastErrorCodeMessage.smali) | `getErrorInfo` |
| [ToastErrorMessage](../../../android/优课畅学/smali_classes4/com/zykj/base/bean/toast/ToastErrorMessage.smali) | `getCode` |
| [ToastMessage](../../../android/优课畅学/smali_classes4/com/zykj/base/bean/toast/ToastMessage.smali) | `getMessage`、`getMessageResId`、`setMessage`、`setMessageResId` |

## com.zykj.base.ext

| 类 | 方法摘录 |
|---|---|
| [BindingAdaptersKt](../../../android/优课畅学/smali_classes4/com/zykj/base/ext/BindingAdaptersKt.smali) | `bindLiveData`、`netUrl`、`netUrlHeader`、`netUrlSnapshot`、`onClick`、`visibleOrGone` |

## com.zykj.base.utils

| 类 | 方法摘录 |
|---|---|
| [ActivityCollectionHelper](../../../android/优课畅学/smali_classes4/com/zykj/base/utils/ActivityCollectionHelper.smali) | `getEntries`、`valueOf`、`values`、`exitApp`、`finishAll`、`register`、`topActivity` |
| [ExceptionHandle](../../../android/优课畅学/smali_classes4/com/zykj/base/utils/ExceptionHandle.smali) | `caseRemoteCodeException`、`handleException` |
| [XToastUtils](../../../android/优课畅学/smali_classes4/com/zykj/base/utils/XToastUtils.smali) | `error`、`error`、`error`、`error`、`error`、`success`、`success` |

## com.zykj.base.view

| 类 | 方法摘录 |
|---|---|
| [LoadingDialogView](../../../android/优课畅学/smali_classes4/com/zykj/base/view/LoadingDialogView.smali) | `setDialogVisibility`、`getVisibility`、`onDetachedFromWindow`、`onMeasure`、`setVisibility` |
| [ToastView](../../../android/优课畅学/smali_classes4/com/zykj/base/view/ToastView.smali) | `getToastLiveData`、`setToastLiveData` |

## com.zykj.blackboard.bean

| 类 | 方法摘录 |
|---|---|
| [Author](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/bean/Author.smali) | `getAuthorId`、`getAuthorName`、`getSchoolId`、`setAuthorId`、`setAuthorName`、`setSchoolId` |
| [BackgroundLineConfig](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/bean/BackgroundLineConfig.smali) | `getLineColor`、`getLineSpace`、`getLineType`、`getLineWidth`、`setLineColor`、`setLineSpace`、`setLineType` |
| [BoardConfig](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/bean/BoardConfig.smali) | `getAddTextOriginalText`、`getAddTextOriginalTextColor`、`getAddTextOriginalTextMaxSize`、`getAddTextOriginalTextMinSize`、`getAddTextOriginalTextSize`、`getAddTextRectF`、`getAuthor` |
| [CommonSourceResult](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/bean/CommonSourceResult.smali) | `getSourceFileName`、`getSourceId` |
| [MoveActionConfig](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/bean/MoveActionConfig.smali) | `getHorizontalTranslate`、`getMaxHeightTimes`、`getMaxWidthTimes`、`getRotate`、`getScale`、`getVerticalTranslate`、`isMoveActionEnable` |
| [PlaySpeed](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/bean/PlaySpeed.smali) | `getPlayIncrement`、`setRate` |

## com.zykj.blackboard.core.action

| 类 | 方法摘录 |
|---|---|
| [ActionManager](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/action/ActionManager.smali) | `changeGraph`、`deleteGraphEvent`、`geometryGraphEvent`、`getAreaMoveListener`、`getBoardConfig`、`getCurrentAction`、`getGeometryCreateListener` |
| [BaseTouchAction](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/action/BaseTouchAction.smali) | `touchEnableCheck`、`getBoardConfig`、`getGraphControl`、`getListener`、`getMatrixAdapter`、`isFingerTouch`、`isSingleFingerInput` |
| [BaseWriteAction](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/action/BaseWriteAction.smali) | `buildSimpleGraph`、`executorsTaskDone`、`getEventList`、`getGraphEnum`、`getMFirstX`、`getMFirstY`、`getPaint` |
| [CursorAction](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/action/CursorAction.smali) | `handleTouch`、`initPointConfig`、`reset`、`singleTouchCancel`、`singleTouchDown`、`singleTouchMove`、`singleTouchUp` |
| [EraseWritingAction](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/action/EraseWritingAction.smali) | `deleteCommand`、`deleteGraph`、`drawDeleteCircle`、`filterDeleteGraphList`、`getDeleteGraphByPoint`、`getIntersectGraphByAreaRectF`、`getMinOutRectF` |
| [GeometryAction](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/action/GeometryAction.smali) | `getRenderPointF`、`reset`、`singleTouchCancel`、`singleTouchDown`、`singleTouchMove`、`singleTouchUp` |
| [GeometryActionEnum](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/action/GeometryActionEnum.smali) | `valueOf`、`values` |
| [IActionListener](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/action/IActionListener.smali) | `changeGraph`、`deleteGraphEvent`、`geometryGraphEvent`、`getAreaMoveListener`、`getBoardConfig`、`getGeometryCreateListener`、`getGraphControl` |
| [ITouchAction](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/action/ITouchAction.smali) | `onTouchDown`、`onTouchMove`、`onTouchPointerDown`、`onTouchPointerUp`、`onTouchUp`、`reset` |
| [MoveAction](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/action/MoveAction.smali) | `calculateMatrixByTranslateProgress`、`calculateMiddlePointF`、`doubleTouchDown`、`doubleTouchMove`、`doubleTouchUp`、`getRenderPointF`、`handleMatrixDown` |
| [SeeAction](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/action/SeeAction.smali) | `addMatrixList`、`calculateDegrees`、`calculateDistance`、`calculateMatrixByTranslateProgress`、`calculateMiddlePointF`、`checkMoveEnable`、`getRenderPointF` |
| [SelectAction](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/action/SelectAction.smali) | `calculateRadians`、`calculateScaleOffset`、`checkColorLight`、`countRectF`、`getClickGraph`、`getRenderPointF`、`handleRotate` |
| [TextAction](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/action/TextAction.smali) | `buildSelectedRectF`、`buildTextGraph`、`calculateRadians`、`calculateRectF`、`calculateScaleOffset`、`getRenderPointF`、`handleMatrix` |
| [TouchActionModeFactory](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/action/TouchActionModeFactory.smali) | `create`、`getCurrentAction`、`onEvent`、`setListener` |
| [WriteBeelineAction](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/action/WriteBeelineAction.smali) | `buildSimpleGraph`、`getGraphEnum`、`handleTouchDown`、`handleTouchMove`、`handleTouchUp`、`initPaint` |
| [WritingAction](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/action/WritingAction.smali) | `buildSimpleGraph`、`getGraphEnum`、`handleTouchDown`、`handleTouchMove`、`handleTouchUp`、`initPaint` |

## com.zykj.blackboard.core.action.newSelectAtion

| 类 | 方法摘录 |
|---|---|
| [NewSelectAction](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/action/newSelectAtion/NewSelectAction.smali) | `checkMinOutRectF`、`checkMinOutRectFWithMatrix`、`countRectF`、`getRenderPointF`、`handleClickToSelect`、`handleDragToSelect`、`handleSelectedRectF` |
| [NewSelectDrawControl](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl.smali) | `checkColorLight`、`drawColorView`、`drawTextSizeView`、`drawWriteSizeView`、`drawSelect`、`drawSelectingPaint`、`drawSelectingPath` |
| [NewSelectFunctionType](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType.smali) | `getText`、`isSelected`、`setSelected` |
| [NewSelectGraphControl](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/action/newSelectAtion/NewSelectGraphControl.smali) | `drawNewSelectRectF`、`drawNewSelectRectF`、`newChangeHandleEnd`、`newChangeHandleStart`、`newChangeHandling` |

## com.zykj.blackboard.core.action.newSelectAtion.function

| 类 | 方法摘录 |
|---|---|
| [BaseSelectFunction](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction.smali) | `calculateRadians`、`calculateScaleOffset`、`getAdapterMatrix`、`handleRotate`、`handleScale`、`handleTranslate`、`getBoardConfig` |
| [DefaultFunction](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction.smali) | `initFunctionRelativeRectF`、`initFunctionTypeList`、`getCurrentFunctionTypeList`、`getHasTextGraph`、`getMaxFunctionRectF`、`handleClick`、`isClickInSelectFunction` |
| [FunctionManager](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager.smali) | `handleClick`、`handleDoubleClick`、`handleMoveEnd`、`handleMoveStart`、`handleMoving`、`initCurrentFunction`、`initForFunctionTouch` |
| [FunctionRectF](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF.smali) | `getColorList`、`getDelete`、`getGeometryStroke`、`getImageCrop`、`getTextEdit`、`getTextSizeAdd`、`getTextSizeReduce` |
| [GeometryFunction](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction.smali) | `calculateFunctionRectF`、`calculateRadians`、`calculateScaleOffset`、`getSingleGraph`、`handleMovedPoint`、`handleStretch`、`initFunctionRelativeRectF` |
| [ImageFunction](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction.smali) | `calculateFunctionRectF`、`initFunctionRelativeRectF`、`initFunctionTypeList`、`updateSingleSelectedRectF`、`getCurrentFunctionTypeList`、`getMaxFunctionRectF`、`handleClick` |
| [TextFunction](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/action/newSelectAtion/function/TextFunction.smali) | `calculateFunctionRectF`、`calculateRectF`、`getSingleGraph`、`handleHScale`、`handleTextSize`、`initFunctionRelativeRectF`、`initFunctionTypeList` |
| [WriteFunction](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction.smali) | `initFunctionRelativeRectF`、`initFunctionTypeList`、`getCurrentFunctionTypeList`、`getMaxFunctionRectF`、`handleClick`、`isClickInSelectFunction`、`isHighlighter` |

## com.zykj.blackboard.core.canvas

| 类 | 方法摘录 |
|---|---|
| [MatrixAdapter](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/canvas/MatrixAdapter.smali) | `notifyCameraChange`、`notifyRenderRectChange`、`cameraMatrixConcat`、`getAdapterMatrix`、`getAdapterRectF`、`getCameraMatrix`、`getRenderRectF` |
| [SketchPlayView](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/canvas/SketchPlayView.smali) | `onDetachedFromWindow`、`onTouchEvent`、`ready` |
| [SketchRecorderView](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/canvas/SketchRecorderView.smali) | `onDetachedFromWindow`、`onTouchEvent`、`ready`、`ready` |

## com.zykj.blackboard.core.canvas.control

| 类 | 方法摘录 |
|---|---|
| [DrawControl](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/canvas/control/DrawControl.smali) | `checkActiveLayer`、`clearActiveBitmapAndCanvas`、`drawActiveLayer`、`drawBackground`、`drawFixLayer`、`drawMaskLayer`、`initActiveLayer` |
| [DrawControlKt](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/canvas/control/DrawControlKt.smali) | `clear` |
| [GraphControl](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/canvas/control/GraphControl.smali) | `resetBackground`、`addGraph`、`addImageGraph`、`cameraChangeEnd`、`cameraChangeStart`、`cameraChanging`、`changeImageGraph` |
| [IGraphControl](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/canvas/control/IGraphControl.smali) | `addGraph`、`addImageGraph`、`cameraChangeEnd`、`cameraChangeStart`、`cameraChanging`、`changeImageGraph`、`changeTextGraph` |

## com.zykj.blackboard.core.canvas.view

| 类 | 方法摘录 |
|---|---|
| [ActiveLayer](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/canvas/view/ActiveLayer.smali) | `clear`、`refresh` |
| [ActiveView](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/canvas/view/ActiveView.smali) | `clear`、`onDraw`、`refresh` |
| [BackgroundLayer](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/canvas/view/BackgroundLayer.smali) | `drawBackground`、`getBackgroundLineConfig`、`getMyBackgroundColor`、`refresh`、`setBackgroundLineConfig`、`setMatrix`、`setMyBackgroundColor` |
| [BackgroundView](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/canvas/view/BackgroundView.smali) | `calculateLinePath`、`calculateOriginLinePath`、`checkNeedLine`、`drawBackground`、`getBackgroundLineConfig`、`getMyBackgroundColor`、`onDraw` |
| [FixLayer](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/canvas/view/FixLayer.smali) | `refresh`、`reset` |
| [FixView](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/canvas/view/FixView.smali) | `getMBitmap`、`onDraw`、`refresh`、`reset` |
| [MaskLayer](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/canvas/view/MaskLayer.smali) | `changeClipRectF`、`refresh` |
| [MaskView](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/canvas/view/MaskView.smali) | `getMBitmap`、`changeClipRectF`、`onDraw`、`refresh` |
| [RenderLayer](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/canvas/view/RenderLayer.smali) | `getActiveLayer`、`getBackgroundLayer`、`getFixLayer`、`getMaskLayer`、`getRenderRect`、`reset` |

## com.zykj.blackboard.core.data

| 类 | 方法摘录 |
|---|---|
| [SourceLoad](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/SourceLoad.smali) | `buildAuthorEntity`、`buildBackgroundLineConfigEntity`、`buildMoveConfigEntity`、`getAudioRecord`、`getCommandRecord`、`getFileRecord`、`getGeometryRecord` |
| [SourceSave](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/SourceSave.smali) | `buildAuthor`、`buildBackgroundLineConfig`、`buildMoveConfig`、`saveAudio`、`saveCommand`、`saveFile`、`saveGeometry` |

## com.zykj.blackboard.core.data.dao

| 类 | 方法摘录 |
|---|---|
| [AudioInfoEntity](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/AudioInfoEntity.smali) | `getCommandEnum`、`getData`、`getDelayTime`、`getDuration`、`getId`、`getRecord`、`isPlay` |
| [AudioInfoEntityCursor](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/AudioInfoEntityCursor.smali) | `attachEntity`、`getId`、`getId` |
| [AudioInfoEntity_](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/AudioInfoEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [AudioRecordEntity](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/AudioRecordEntity.smali) | `getAudioInfoEntity`、`getFileName`、`getId`、`getRecord`、`getValidate`、`remove`、`setAudioInfoEntity` |
| [AudioRecordEntityCursor](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/AudioRecordEntityCursor.smali) | `attachEntity`、`getId`、`getId` |
| [AudioRecordEntity_](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/AudioRecordEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [AuthorEntity](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/AuthorEntity.smali) | `getAuthorId`、`getAuthorName`、`getDuration`、`getId`、`getSchoolId`、`getStartTime`、`getUrl` |
| [AuthorEntityCursor](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/AuthorEntityCursor.smali) | `getId`、`getId` |
| [AuthorEntity_](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/AuthorEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [BackgroundLineConfigEntity](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity.smali) | `getId`、`getLineColor`、`getLineSpace`、`getLineType`、`getLineWidth`、`setId`、`setLineColor` |
| [BackgroundLineConfigEntityCursor](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/BackgroundLineConfigEntityCursor.smali) | `getId`、`getId` |
| [BackgroundLineConfigEntity_](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [BackgroundLineTypeEnumConverter](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/BackgroundLineTypeEnumConverter.smali) | `convertToDatabaseValue`、`convertToDatabaseValue`、`convertToEntityProperty`、`convertToEntityProperty` |
| [BlackBoardEntity](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/BlackBoardEntity.smali) | `getDir`、`getId`、`getPages`、`remove`、`setDir`、`setId`、`setPages` |
| [BlackBoardEntityCursor](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/BlackBoardEntityCursor.smali) | `attachEntity`、`getId`、`getId` |
| [BlackBoardEntity_](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/BlackBoardEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [CommandEnumConverter](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/CommandEnumConverter.smali) | `convertToDatabaseValue`、`convertToDatabaseValue`、`convertToEntityProperty`、`convertToEntityProperty` |
| [CommandInfoEntity](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/CommandInfoEntity.smali) | `getCommandEnum`、`getData`、`getDelayTime`、`getDuration`、`getId`、`getRecord`、`isPlay` |
| [CommandInfoEntityCursor](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/CommandInfoEntityCursor.smali) | `attachEntity`、`getId`、`getId` |
| [CommandInfoEntity_](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/CommandInfoEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [CommandRecordEntity](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/CommandRecordEntity.smali) | `getCommandInfoEntity`、`getFileName`、`getId`、`getRecord`、`getValidate`、`remove`、`setCommandInfoEntity` |
| [CommandRecordEntityCursor](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/CommandRecordEntityCursor.smali) | `attachEntity`、`getId`、`getId` |
| [CommandRecordEntity_](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/CommandRecordEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [FileInfoEntity](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/FileInfoEntity.smali) | `getFileName`、`getHeight`、`getId`、`getRecord`、`getValidate`、`getWidth`、`remove` |
| [FileInfoEntityCursor](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/FileInfoEntityCursor.smali) | `attachEntity`、`getId`、`getId` |
| [FileInfoEntity_](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/FileInfoEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [FileRecordEntity](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/FileRecordEntity.smali) | `getFileInfoEntity`、`getFileName`、`getId`、`getRecord`、`getValidate`、`remove`、`setFileInfoEntity` |
| [FileRecordEntityCursor](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/FileRecordEntityCursor.smali) | `attachEntity`、`getId`、`getId` |
| [FileRecordEntity_](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/FileRecordEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [GeometryInfoEntity](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/GeometryInfoEntity.smali) | `getColor`、`getGeometryType`、`getId`、`getPointList`、`getRecord`、`getStyle`、`getTextSize` |
| [GeometryInfoEntityCursor](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/GeometryInfoEntityCursor.smali) | `attachEntity`、`getId`、`getId` |
| [GeometryInfoEntity_](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/GeometryInfoEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [GeometryPointFEntity](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/GeometryPointFEntity.smali) | `getId`、`getRecord`、`remove`、`setId`、`setRecord` |
| [GeometryPointFEntityCursor](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/GeometryPointFEntityCursor.smali) | `attachEntity`、`getId`、`getId` |
| [GeometryPointFEntity_](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/GeometryPointFEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [GeometryRecordEntity](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/GeometryRecordEntity.smali) | `getFileName`、`getGeometryInfoEntityList`、`getId`、`getRecord`、`getValidate`、`remove`、`setFileName` |
| [GeometryRecordEntityCursor](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/GeometryRecordEntityCursor.smali) | `attachEntity`、`getId`、`getId` |
| [GeometryRecordEntity_](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/GeometryRecordEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [HeaderEntity](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/HeaderEntity.smali) | `getAuthor`、`getConvertUrl`、`getCreateDate`、`getDefaultBackgroundColor`、`getDefaultBackgroundLineConfig`、`getDuration`、`getHeight` |
| [HeaderEntityCursor](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/HeaderEntityCursor.smali) | `attachEntity`、`getId`、`getId` |
| [HeaderEntity_](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/HeaderEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [MatrixEventEntity](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/MatrixEventEntity.smali) | `getId`、`getMatrixInfo`、`getRecord`、`remove`、`setId`、`setMatrixInfo`、`setRecord` |
| [MatrixEventEntityCursor](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/MatrixEventEntityCursor.smali) | `attachEntity`、`getId`、`getId` |
| [MatrixEventEntity_](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/MatrixEventEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [MatrixInfoEntity](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/MatrixInfoEntity.smali) | `getEventTime`、`getId`、`getPerSp0`、`getPerSp1`、`getPerSp2`、`getRecord`、`getScaleX` |
| [MatrixInfoEntityCursor](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor.smali) | `attachEntity`、`getId`、`getId` |
| [MatrixInfoEntity_](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/MatrixInfoEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [MatrixRecordEntity](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/MatrixRecordEntity.smali) | `getFileName`、`getId`、`getMatrixEventEntity`、`getRecord`、`getValidate`、`remove`、`setFileName` |
| [MatrixRecordEntityCursor](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/MatrixRecordEntityCursor.smali) | `attachEntity`、`getId`、`getId` |
| [MatrixRecordEntity_](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/MatrixRecordEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [MoveConfigEntity](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/MoveConfigEntity.smali) | `getHorizontalTranslate`、`getId`、`getMaxHeightTimes`、`getMaxWidthTimes`、`getRotate`、`getScale`、`getVerticalTranslate` |
| [MoveConfigEntityCursor](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/MoveConfigEntityCursor.smali) | `getId`、`getId` |
| [MoveConfigEntity_](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/MoveConfigEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [MyObjectBox](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/MyObjectBox.smali) | `buildEntityAudioInfoEntity`、`buildEntityAudioRecordEntity`、`buildEntityAuthorEntity`、`buildEntityBackgroundLineConfigEntity`、`buildEntityBlackBoardEntity`、`buildEntityCommandInfoEntity`、`buildEntityCommandRecordEntity` |
| [PageEntity](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/PageEntity.smali) | `getBlackBoardEntity`、`getCommandFileName`、`getCommandIndex`、`getDirName`、`getHeaderEntity`、`getId`、`getRecordEntity` |
| [PageEntityCursor](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/PageEntityCursor.smali) | `attachEntity`、`getId`、`getId` |
| [PageEntity_](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/PageEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [RecordEntity](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/RecordEntity.smali) | `getAudioList`、`getCommandList`、`getFileList`、`getGeometryList`、`getId`、`getMatrixList`、`getPage` |
| [RecordEntityCursor](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/RecordEntityCursor.smali) | `attachEntity`、`getId`、`getId` |
| [RecordEntity_](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/RecordEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [TextInfoEntity](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/TextInfoEntity.smali) | `getColor`、`getContent`、`getId`、`getRecord`、`getStyle`、`getTextSize`、`getWidth` |
| [TextInfoEntityCursor](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/TextInfoEntityCursor.smali) | `attachEntity`、`getId`、`getId` |
| [TextInfoEntity_](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/TextInfoEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [TextRecordEntity](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/TextRecordEntity.smali) | `getFileName`、`getId`、`getRecord`、`getTextInfoEntityList`、`getValidate`、`remove`、`setFileName` |
| [TextRecordEntityCursor](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/TextRecordEntityCursor.smali) | `attachEntity`、`getId`、`getId` |
| [TextRecordEntity_](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/TextRecordEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [TouchEventEntity](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/TouchEventEntity.smali) | `getColor`、`getId`、`getItemLength`、`getRecord`、`getSpacing`、`getStyle`、`getTextSize` |
| [TouchEventEntityCursor](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/TouchEventEntityCursor.smali) | `attachEntity`、`getId`、`getId` |
| [TouchEventEntity_](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/TouchEventEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [TouchInfoEntity](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/TouchInfoEntity.smali) | `getEventTime`、`getId`、`getRecord`、`remove`、`setEventTime`、`setId`、`setRecord` |
| [TouchInfoEntityCursor](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/TouchInfoEntityCursor.smali) | `attachEntity`、`getId`、`getId` |
| [TouchInfoEntity_](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/TouchInfoEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [TouchRecordEntity](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/TouchRecordEntity.smali) | `getFileName`、`getId`、`getRecord`、`getTouchEventList`、`getValidate`、`remove`、`setFileName` |
| [TouchRecordEntityCursor](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/TouchRecordEntityCursor.smali) | `attachEntity`、`getId`、`getId` |
| [TouchRecordEntity_](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/data/dao/TouchRecordEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |

## com.zykj.blackboard.core.edit

| 类 | 方法摘录 |
|---|---|
| [AudioControl](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/edit/AudioControl.smali) | `initDirPath`、`isMicroTurnOn`、`setListener`、`startRecord`、`stopRecord` |
| [BasePageControl](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/edit/BasePageControl.smali) | `addRootGraph`、`calculateAudioCommandTime`、`calculateCommandTime`、`createPageEntity`、`initCommonSetting`、`initPageEntity`、`updateAudioRecord` |
| [BoardControl](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/edit/BoardControl.smali) | `getPage`、`getSingleExecutor`、`initDir`、`initPageControl`、`renderPage`、`createPage`、`currentPage` |
| [HistoryControl](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/edit/HistoryControl.smali) | `addWithdrawListener`、`clearHistoryList`、`clearHistoryListWithoutCurrent`、`recover`、`removeWithdrawListener`、`saveSnapshot`、`withDraw` |
| [HistoryData](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/edit/HistoryData.smali) | `getBackgroundColor`、`getBackgroundLineConfig`、`getRootGraph` |
| [IBoardControl](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/edit/IBoardControl.smali) | `createPage`、`currentPage`、`deletePage`、`getBoardDirPath`、`getConfig`、`getCurrentPage`、`getCurrentPageIndex` |
| [IEditPageControl](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/edit/IEditPageControl.smali) | `duration`、`getFileName`、`onDelete`、`refresh`、`release` |
| [IPageControl](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/edit/IPageControl.smali) | `addEventListener`、`addGraphDeleteListener`、`addImage`、`addImage`、`addImage`、`addImageList`、`addRenderRectChangeListener` |
| [PageControl](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/edit/PageControl.smali) | `addImageGraphFromLocal`、`buildImageGraph`、`calculateMatrixForSpecial`、`safeCountProgress`、`saveData`、`addEventListener`、`addGraphDeleteListener` |
| [PageControlExtKt](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/edit/PageControlExtKt.smali) | `countScale`、`getScreenMatrix`、`getTranslateMatrix`、`getWHFromLocalByType`、`saveBitmapToLocal`、`saveFileToLocal` |
| [RenderChangeListener](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/edit/RenderChangeListener.smali) | `onCameraChange`、`onRenderChange` |

## com.zykj.blackboard.core.execute

| 类 | 方法摘录 |
|---|---|
| [BaseCommandExecuteFactory](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/execute/BaseCommandExecuteFactory.smali) | `asyncExecute`、`execute`、`executeCommand`、`executeCommand` |
| [CommandExecute](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/execute/CommandExecute.smali) | `asyncExecute`、`execute` |
| [CommandFactory](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/execute/CommandFactory.smali) | `createCommandFactory` |
| [EventPlayThread](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/execute/EventPlayThread.smali) | `getStartPlayTime`、`handle`、`initStartPlayTime`、`needHandle`、`seekTo`、`setListIterator` |
| [PlayFinishListener](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/execute/PlayFinishListener.smali) | `finish` |
| [PlayThread](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/execute/PlayThread.smali) | `getFinishListener`、`getGraphControl`、`getMatrixAdapter`、`getPlayListener`、`getPlaySpeed`、`getPlayStatus`、`getSourceLoader` |

## com.zykj.blackboard.core.execute.version6

| 类 | 方法摘录 |
|---|---|
| [CameraExecute](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/execute/version6/CameraExecute.smali) | `asyncExecute`、`asyncExecute`、`execute`、`execute` |
| [CameraMatrixExecute](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/execute/version6/CameraMatrixExecute.smali) | `asyncExecute`、`asyncExecute`、`execute`、`execute` |
| [CommandExecuteFactory6](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/execute/version6/CommandExecuteFactory6.smali) | `executeCommand`、`executeCommand` |
| [ConfigExecute](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/execute/version6/ConfigExecute.smali) | `asyncExecute`、`asyncExecute`、`execute`、`execute` |
| [CursorMoveExecute](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/execute/version6/CursorMoveExecute.smali) | `asyncExecute`、`asyncExecute`、`execute`、`execute` |
| [GraphChangeExecute](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/execute/version6/GraphChangeExecute.smali) | `asyncExecute`、`asyncExecute`、`execute`、`execute` |
| [GraphDataExecute](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/execute/version6/GraphDataExecute.smali) | `asyncExecute`、`asyncExecute`、`execute`、`execute` |
| [GraphMatrixExecute](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/execute/version6/GraphMatrixExecute.smali) | `asyncExecute`、`asyncExecute`、`execute`、`execute` |
| [GraphRemoveExecute](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/execute/version6/GraphRemoveExecute.smali) | `asyncExecute`、`asyncExecute`、`execute`、`execute` |
| [RebuildExecute](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/execute/version6/RebuildExecute.smali) | `asyncExecute`、`asyncExecute`、`execute`、`execute` |
| [RecordStopExecute](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/execute/version6/RecordStopExecute.smali) | `asyncExecute`、`asyncExecute`、`execute`、`execute` |

## com.zykj.blackboard.core.graph

| 类 | 方法摘录 |
|---|---|
| [Graph](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/graph/Graph.smali) | `addGraph`、`addImageGraph`、`concatMatrix`、`deleteGraphList`、`findById`、`findByPoint`、`findByRectF` |
| [IDraw](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/graph/IDraw.smali) | `onDraw`、`render` |
| [IGraph](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/graph/IGraph.smali) | `deleteGraphList`、`findById`、`findByPoint`、`findByRectF`、`findGraphListByPoint`、`getChildGraph`、`getGraphData` |
| [IGraphChange](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/graph/IGraphChange.smali) | `addGraph`、`addImageGraph`、`concatMatrix`、`initMatrix`、`removeGraph`、`updateRenderRectF` |

## com.zykj.blackboard.core.graph.group

| 类 | 方法摘录 |
|---|---|
| [FileGraph](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/graph/group/FileGraph.smali) | `getFilePath`、`getPaint`、`getSnapshot`、`getSourceFileName`、`getSourceId`、`getSourceLoader`、`initPath` |
| [GeometryGraph](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/graph/group/GeometryGraph.smali) | `initData`、`changeOriginalRectF`、`getGeometryType`、`getMinOutRectF`、`getMovePointFList`、`getPaint`、`getPointList` |
| [GroupGraph](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/graph/group/GroupGraph.smali) | `renderGroupBitmap`、`updateGroupBitmap`、`addGraph`、`changeOriginalRectF`、`changeRenderMatrix`、`changeUpdate`、`concatMatrix` |
| [IChangeField](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/graph/group/IChangeField.smali) | `changeOriginalRectF`、`changeRenderMatrix`、`changeUpdate` |
| [ImageGraph](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/graph/group/ImageGraph.smali) | `renderBitmap`、`getBitmap`、`graphType`、`onDestroy`、`render`、`setBitmap`、`updateFilePath` |
| [TextGraph](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/graph/group/TextGraph.smali) | `getContent`、`getPaint`、`getSnapshot`、`getSourceFileName`、`getSourceId`、`graphType`、`render` |

## com.zykj.blackboard.core.graph.root

| 类 | 方法摘录 |
|---|---|
| [BoundedContainerGraph](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/graph/root/BoundedContainerGraph.smali) | `getGraphData`、`getSnapshot`、`getSourceFileName`、`getSourceId`、`graphType`、`render`、`setSourceFileName` |

## com.zykj.blackboard.core.graph.stroke

| 类 | 方法摘录 |
|---|---|
| [BeelineStrokeGraph](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/graph/stroke/BeelineStrokeGraph.smali) | `graphType` |
| [StrokeGraph](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/graph/stroke/StrokeGraph.smali) | `renderPath`、`graphType`、`render` |
| [WritingGraph](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/graph/stroke/WritingGraph.smali) | `getTouchInfo`、`lineSpace`、`pointToLine`、`getMEventList`、`getMPaint`、`getMinOutRectF`、`getPaintItemLength` |

## com.zykj.blackboard.core.graphBuilder

| 类 | 方法摘录 |
|---|---|
| [BeelineStrokeGraphBuilder](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/graphBuilder/BeelineStrokeGraphBuilder.smali) | `build` |
| [BoundedContainerGraphBuilder](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/graphBuilder/BoundedContainerGraphBuilder.smali) | `build` |
| [GeometryGraphBuilder](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/graphBuilder/GeometryGraphBuilder.smali) | `build` |
| [GraphBuild](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/graphBuilder/GraphBuild.smali) | `build` |
| [GraphBuildFactory](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/graphBuilder/GraphBuildFactory.smali) | `valueOf`、`values`、`parse` |
| [GroupGraphBuilder](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/graphBuilder/GroupGraphBuilder.smali) | `build` |
| [ImageGraphBuilder](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/graphBuilder/ImageGraphBuilder.smali) | `build` |
| [StrokeGraphBuilder](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/graphBuilder/StrokeGraphBuilder.smali) | `build` |
| [TextGraphBuilder](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/graphBuilder/TextGraphBuilder.smali) | `build` |

## com.zykj.blackboard.core.loader

| 类 | 方法摘录 |
|---|---|
| [CacheSourceLoader](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/loader/CacheSourceLoader.smali) | `getDataByCache`、`getIndexInList`、`getFileCache`、`getGeometryCache`、`getMatrixCache`、`getTextCache`、`getTouchCache` |
| [EntityConvertEzy](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/loader/EntityConvertEzy.smali) | `commandInfoConvertEzyCommandInfo`、`fileInfoConvertEzyFileInfo`、`geometryInfoConvertEzyGeometryInfo`、`matrixEventConvertEzyMatrixInfo`、`textInfoConvertEzyTextInfo`、`touchInfoConvertEzyTouchInfo` |
| [LocalSourceLoader](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/loader/LocalSourceLoader.smali) | `handleRecordEntity`、`cleanCache`、`getFileCache`、`getGeometryCache`、`getMatrixCache`、`getTextCache`、`getTouchCache` |
| [SimpleSourceLoader](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/loader/SimpleSourceLoader.smali) | `getFileCache`、`getGeometryCache`、`getMatrixCache`、`getTextCache`、`getTouchCache`、`initPath`、`release` |
| [SourceLoader](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/loader/SourceLoader.smali) | `getFileCache`、`getGeometryCache`、`getMatrixCache`、`getTextCache`、`getTouchCache`、`initPath`、`release` |

## com.zykj.blackboard.core.play

| 类 | 方法摘录 |
|---|---|
| [AudioCommandThread](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/play/AudioCommandThread.smali) | `fastLoading`、`isNeedPlay`、`loadNextCommandIterator`、`readCommand`、`readCommandAndPause`、`releaseCurrentMediaPlayer`、`syncExecuteCommand` |
| [BasePlayPageControl](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/play/BasePlayPageControl.smali) | `setSeeActionIsPlay`、`addPlayActionListener`、`getActionManager`、`getAudioCommandThread`、`getBoardConfig`、`getCacheSourceLoad`、`getCommandThread` |
| [CameraMatrixThread](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/play/CameraMatrixThread.smali) | `handle`、`handle`、`needHandle`、`needHandle`、`setMatrixInfo` |
| [CommandThread](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/play/CommandThread.smali) | `fastLoading`、`fastReadCommandAndPause`、`isNeedPlay`、`loadNextCommandIterator`、`readCommand`、`pausePlay`、`reset` |
| [CursorMoveThread](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/play/CursorMoveThread.smali) | `getPath`、`handle`、`handle`、`needHandle`、`needHandle`、`setPath`、`setTouchInfo` |
| [GraphMatrixThread](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/play/GraphMatrixThread.smali) | `handle`、`handle`、`needHandle`、`needHandle`、`setMatrixInfo` |
| [IEditPlayPageControl](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/play/IEditPlayPageControl.smali) | `loadPath`、`release` |
| [IPlayControl](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/play/IPlayControl.smali) | `getCurrentPlayPageControl`、`getCurrentPlayPageIndex`、`getPlayPageControlList`、`getRootPath`、`loadPath`、`release`、`setPageListener` |
| [IPlayPageControl](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/play/IPlayPageControl.smali) | `addPlayActionListener`、`areaMoveEnd`、`areaMoveStart`、`areaMoving`、`getCurrentScreenShot`、`getDuration`、`getMoveHorizontalProgress` |
| [PlayControl](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/play/PlayControl.smali) | `getSingleExecutor`、`runOnMainThread`、`getCurrentPlayPageControl`、`getCurrentPlayPageIndex`、`getPlayPageControlList`、`getRootPath`、`loadPath` |
| [PlayPageControl](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/play/PlayPageControl.smali) | `getSingleExecutor`、`initCommandThread`、`areaMoveEnd`、`areaMoveStart`、`areaMoving`、`getCurrentScreenShot`、`getDuration` |
| [TouchEventThread](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/play/TouchEventThread.smali) | `getPath`、`handle`、`handle`、`needHandle`、`needHandle`、`setPath`、`setTouchInfo` |

## com.zykj.blackboard.core.record

| 类 | 方法摘录 |
|---|---|
| [DataRecorder](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/record/DataRecorder.smali) | `buildAudioInfoEntity`、`buildCommandInfoEntity`、`getStartEventTime`、`getTimeRecord` |
| [ITimeRecord](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/record/ITimeRecord.smali) | `getDelayTime`、`getTime`、`isRecord`、`reset`、`setListener`、`startRecord`、`stopRecord` |
| [SourceRouterRecord](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/record/SourceRouterRecord.smali) | `getAudioRecord`、`getCanSave`、`getCommandRecord`、`getRecord`、`initRecord`、`setRecord` |
| [TimeRecord](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/record/TimeRecord.smali) | `getDelayTime`、`getTime`、`isRecord`、`reset`、`setListener`、`setOffsetForAudio`、`setOffsetForCommand` |

## com.zykj.blackboard.core.record.dataRecorder

| 类 | 方法摘录 |
|---|---|
| [AudioRecord](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/record/dataRecorder/AudioRecord.smali) | `buildRecordEntity`、`checkLength`、`initRecordEntity`、`updateEntity`、`addAudio`、`isRecordChange`、`setRecord` |
| [CommandRecord](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/record/dataRecorder/CommandRecord.smali) | `buildRecordEntity`、`checkLength`、`initRecordEntity`、`notifyEvent`、`updateEntity`、`addCamera`、`addCameraMatrix` |
| [FileSourceRecord](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/record/dataRecorder/FileSourceRecord.smali) | `buildRecordEntity`、`checkLength`、`initRecordEntity`、`addFile`、`setRecord` |
| [GeometrySourceRecord](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/record/dataRecorder/GeometrySourceRecord.smali) | `buildRecordEntity`、`checkLength`、`initRecordEntity`、`addGeometry`、`setRecord` |
| [MatrixSourceRecord](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/record/dataRecorder/MatrixSourceRecord.smali) | `buildRecordEntity`、`checkLength`、`initRecordEntity`、`setRecord` |
| [TextSourceRecord](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/record/dataRecorder/TextSourceRecord.smali) | `buildRecordEntity`、`checkLength`、`initRecordEntity`、`addText`、`setRecord` |
| [TouchSourceRecord](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/core/record/dataRecorder/TouchSourceRecord.smali) | `buildRecordEntity`、`checkLength`、`initRecordEntity`、`addTouchEvent`、`setRecord` |

## com.zykj.blackboard.crop

| 类 | 方法摘录 |
|---|---|
| [CropManager](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/crop/CropManager.smali) | `createGraphControl`、`cropAudioByTime`、`cropCommandByIndex`、`deleteFileEntity`、`deleteMatrixEntity`、`deleteTextEntity`、`deleteTouchEntity` |
| [SimpleBackgroundView](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/crop/SimpleBackgroundView.smali) | `drawBackground`、`getBackgroundLineConfig`、`getMyBackgroundColor`、`refresh`、`setBackgroundLineConfig`、`setMatrix`、`setMyBackgroundColor` |
| [SimpleFixView](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/crop/SimpleFixView.smali) | `refresh`、`reset` |

## com.zykj.blackboard.enums

| 类 | 方法摘录 |
|---|---|
| [DocumentType](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/enums/DocumentType.smali) | `valueOf`、`values` |
| [PlayStatus](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/enums/PlayStatus.smali) | `valueOf`、`values`、`getState`、`getStateName`、`setState`、`setStateName` |
| [TextActionType](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/enums/TextActionType.smali) | `valueOf`、`values`、`getValue`、`setValue` |
| [TranslationType](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/enums/TranslationType.smali) | `valueOf`、`values`、`getValue`、`setValue` |

## com.zykj.blackboard.exception

| 类 | 方法摘录 |
|---|---|
| [FileVerificationException](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/exception/FileVerificationException.smali) | `getMessage` |

## com.zykj.blackboard.extensions

| 类 | 方法摘录 |
|---|---|
| [ExtensionsKt](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/extensions/ExtensionsKt.smali) | `capture`、`getDistance`、`getMidPoint`、`getRotation`、`lineSpace`、`pointToLine` |

## com.zykj.blackboard.listener

| 类 | 方法摘录 |
|---|---|
| [ErrorListener](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/listener/ErrorListener.smali) | `reportError` |
| [EventListener](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/listener/EventListener.smali) | `onEvent` |
| [GraphDeleteListener](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/listener/GraphDeleteListener.smali) | `onGraphDelete` |
| [IAreaMoveListener](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/listener/IAreaMoveListener.smali) | `onHorizontalMove`、`onMoveEnd`、`onMoveStart`、`onVerticalMove` |
| [ITextSelectListener](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/listener/ITextSelectListener.smali) | `textColorChange`、`textSelected`、`textSelectedCancel`、`textSizeChange` |
| [ImageCropView](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/listener/ImageCropView.smali) | `showCropView` |
| [MicroPhoneListener](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/listener/MicroPhoneListener.smali) | `turnOffMicroPhone`、`turnOnMicroPhone` |
| [PageListener](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/listener/PageListener.smali) | `addPage`、`changPage`、`removePage` |
| [PlayStatusListener](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/listener/PlayStatusListener.smali) | `onPlayEnd`、`onPlayPause`、`onPlayResume`、`onPlayStart`、`onProgress` |
| [RecordListener](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/listener/RecordListener.smali) | `progress`、`startRecord`、`stopRecord` |
| [TextEditView](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/listener/TextEditView.smali) | `showEditView` |
| [WithdrawListener](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/listener/WithdrawListener.smali) | `onWithdraw` |

## com.zykj.blackboard.utils

| 类 | 方法摘录 |
|---|---|
| [AppContext](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/utils/AppContext.smali) | `getContext` |
| [AudioUtils](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/utils/AudioUtils.smali) | `audioCut`、`audioCut`、`timeFormat` |
| [BitmapUtil](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/utils/BitmapUtil.smali) | `recycle` |
| [BoardBox](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/utils/BoardBox.smali) | `setBoxStore`、`checkBoardFileExist`、`clearLocalData`、`clearPageData`、`getBoxStore` |
| [CanvasUtils](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/utils/CanvasUtils.smali) | `drawLargeBitmap` |
| [ConvertExtKt](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/utils/ConvertExtKt.smali) | `toBackgroundLineTypeEnum`、`toConfig`、`toConfig`、`toEntity`、`toEntity`、`toEntity`、`toEzyBackgroundLineTypeEnum` |
| [DefaultTextEditView](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/utils/DefaultTextEditView.smali) | `getDialog`、`setDialog`、`showEditView` |
| [EventBus](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/utils/EventBus.smali) | `clear`、`register`、`unregister` |
| [EventConvert](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/utils/EventConvert.smali) | `buildPointPropertiesList`、`motionEventConvertTouchEvent`、`updateTouchEventByNewMatrix` |
| [EventKey](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/utils/EventKey.smali) | `valueOf`、`values` |
| [FileUtils](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/utils/FileUtils.smali) | `delete`、`saveBitmap2SDCard`、`saveToFile` |
| [FileValidateUtils](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/utils/FileValidateUtils.smali) | `getFileSignature`、`validateFile` |
| [GraphHelper](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/utils/GraphHelper.smali) | `createStrokeGraph` |
| [GraphUtils](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/utils/GraphUtils.smali) | `convertMatrix`、`buildGraph`、`eventConvertPath`、`findPointListRectF`、`snapshotGraphToGraph` |
| [GraphUtilsKt](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/utils/GraphUtilsKt.smali) | `covertEzyPaint`、`covertEzyPointF`、`covertEzyRectF`、`covertPaint`、`covertPointF`、`covertRectF` |
| [MatrixExtKt](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/utils/MatrixExtKt.smali) | `getScaleX`、`invert`、`mapRect`、`toEzyMatrix`、`toMatrix` |
| [PointUtils](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/utils/PointUtils.smali) | `getCross`、`isPointInRect`、`isPointInRect`、`isRectFinRectF`、`mapPoint`、`mapPoint`、`rectConvertPath` |
| [RectBoardUtils](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/utils/RectBoardUtils.smali) | `getSelectActionRectBoardPath`、`getTextActionRectBoardPath` |
| [RectExtKt](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/utils/RectExtKt.smali) | `toRect`、`toRectF` |
| [ShapeUtils](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/utils/ShapeUtils.smali) | `drawDeleteIconToPath`、`drawNewRotateIconToPath`、`drawNewScaleIconToPath`、`drawRotateIconToPath`、`drawScaleIconToPath`、`drawTickInRectFToPath`、`drawTranslateIconToPath` |
| [StringUtils](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/utils/StringUtils.smali) | `matchLong` |
| [TextGraphUtils](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/utils/TextGraphUtils.smali) | `calculateTextToList` |
| [TimeCountTestUtils](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/utils/TimeCountTestUtils.smali) | `endTest`、`startTest` |

## com.zykj.blackboard.widgets

| 类 | 方法摘录 |
|---|---|
| [TextDialog](../../../android/优课畅学/smali_classes4/com/zykj/blackboard/widgets/TextDialog.smali) | `getAfterTextChangedCallback`、`getCancelCallback`、`getDoneCallback`、`onCreate`、`onKeyDown`、`onStart`、`setAfterTextChangedCallback` |

## com.zykj.download

| 类 | 方法摘录 |
|---|---|
| [DataBinderMapperImpl](../../../android/优课畅学/smali_classes4/com/zykj/download/DataBinderMapperImpl.smali) | `collectDependencies`、`convertBrIdToString`、`getDataBinder`、`getDataBinder`、`getLayoutId` |
| [DownloadFlag](../../../android/优课畅学/smali_classes4/com/zykj/download/DownloadFlag.smali) | `valueOf`、`values` |
| [FileCheckDownloadResult](../../../android/优课畅学/smali_classes4/com/zykj/download/FileCheckDownloadResult.smali) | `getDownloadEntity`、`getResultType` |
| [FileCheckResultType](../../../android/优课畅学/smali_classes4/com/zykj/download/FileCheckResultType.smali) | `valueOf`、`values` |
| [FileCheckUploadResult](../../../android/优课畅学/smali_classes4/com/zykj/download/FileCheckUploadResult.smali) | `getLocalPath`、`getProgress`、`getResultType`、`getServerUrl`、`getUrl`、`getVerifyCode` |
| [OssToken](../../../android/优课畅学/smali_classes4/com/zykj/download/OssToken.smali) | `getAccessKeyId`、`getAccessKeySecret`、`getBucket`、`getEndpoint`、`getSecurityToken`、`getStrategy` |
| [OssUtils](../../../android/优课畅学/smali_classes4/com/zykj/download/OssUtils.smali) | `getCacheDir`、`checkDownloadDir`、`checkFileName`、`getObjectKey`、`getOssClient`、`getOssToken`、`isNetworkConnected` |
| [StrategyEnum](../../../android/优课畅学/smali_classes4/com/zykj/download/StrategyEnum.smali) | `valueOf`、`values` |
| [UploadResultType](../../../android/优课畅学/smali_classes4/com/zykj/download/UploadResultType.smali) | `valueOf`、`values` |

## com.zykj.download.api

| 类 | 方法摘录 |
|---|---|
| [DownLoadApi](../../../android/优课畅学/smali_classes4/com/zykj/download/api/DownLoadApi.smali) | `download` |
| [UploadApi](../../../android/优课畅学/smali_classes4/com/zykj/download/api/UploadApi.smali) | `gridFs` |

## com.zykj.download.data

| 类 | 方法摘录 |
|---|---|
| [AppDatabase_Impl](../../../android/优课畅学/smali_classes4/com/zykj/download/data/AppDatabase_Impl.smali) | `clearAllTables`、`createInvalidationTracker`、`createOpenHelper`、`getRequiredTypeConverters` |

## com.zykj.download.work

| 类 | 方法摘录 |
|---|---|
| [DownloadFileCommonWork](../../../android/优课畅学/smali_classes4/com/zykj/download/work/DownloadFileCommonWork.smali) | `checkContentLength`、`checkMD5`、`downloadFile`、`initParameter` |
| [DownloadFileWork](../../../android/优课畅学/smali_classes4/com/zykj/download/work/DownloadFileWork.smali) | `checkParam`、`downloadFileWithProgress`、`doWork`、`downloadFile`、`getAppDataBase`、`getDir`、`getDownloadUrl` |
| [DownloadFileWorkProxy](../../../android/优课畅学/smali_classes4/com/zykj/download/work/DownloadFileWorkProxy.smali) | `checkFileIntegrity`、`checkDownloadSuccess`、`checkRecord`、`updateDownloadSize`、`updateFlag`、`updateTotalSize`、`updateVerifyCode` |
| [DownloadOssFileWork](../../../android/优课畅学/smali_classes4/com/zykj/download/work/DownloadOssFileWork.smali) | `downloadFile`、`getOssToken`、`initParameter`、`setOssToken` |
| [UploadFileOssWork](../../../android/优课畅学/smali_classes4/com/zykj/download/work/UploadFileOssWork.smali) | `initParameter`、`uploadFile` |
| [UploadFileWork](../../../android/优课畅学/smali_classes4/com/zykj/download/work/UploadFileWork.smali) | `uploadFileWithProgress`、`doWork`、`getProgressLiveData`、`getReceiverLengthLiveData`、`initParameter`、`sendSpeedAndProgress`、`uploadFile` |

## com.zykj.http.bean

| 类 | 方法摘录 |
|---|---|
| [ApiResp](../../../android/优课畅学/smali_classes4/com/zykj/http/bean/ApiResp.smali) | `getCode`、`getError`、`getMsg`、`getResult`、`getSuccess` |
| [ErrorInfo](../../../android/优课畅学/smali_classes4/com/zykj/http/bean/ErrorInfo.smali) | `getCode`、`getDetails`、`getMessage` |
| [HeaderBean](../../../android/优课畅学/smali_classes4/com/zykj/http/bean/HeaderBean.smali) | `getAccessToken`、`getAppName`、`getRefreshToken`、`getServerUrl`、`getVersionCode` |

## com.zykj.http.exception

| 类 | 方法摘录 |
|---|---|
| [RemoteCodeException](../../../android/优课畅学/smali_classes4/com/zykj/http/exception/RemoteCodeException.smali) | `getErrorCodeInfo`、`setErrorCodeInfo` |

## com.zykj.http.interceptor

| 类 | 方法摘录 |
|---|---|
| [GzipInterceptor](../../../android/优课畅学/smali_classes4/com/zykj/http/interceptor/GzipInterceptor.smali) | `isGzipped`、`unzip`、`intercept` |
| [HeadInterceptor](../../../android/优课畅学/smali_classes4/com/zykj/http/interceptor/HeadInterceptor.smali) | `getHeaderBeanFlow`、`intercept`、`setHeaderBeanFlow` |
| [NetworkInterceptor](../../../android/优课畅学/smali_classes4/com/zykj/http/interceptor/NetworkInterceptor.smali) | `intercept` |
| [RefreshTokenInterceptor](../../../android/优课畅学/smali_classes4/com/zykj/http/interceptor/RefreshTokenInterceptor.smali) | `refreshTokenAndContinueRequest`、`getRefreshRepository`、`getUnauthorizedFlow`、`intercept`、`setRefreshRepository`、`setUnauthorizedFlow` |

## com.zykj.http.listener

| 类 | 方法摘录 |
|---|---|
| [UploadProgressListener](../../../android/优课畅学/smali_classes4/com/zykj/http/listener/UploadProgressListener.smali) | `onProgressUpdate` |

## com.zykj.http.progress

| 类 | 方法摘录 |
|---|---|
| [ProgressRequestBody](../../../android/优课畅学/smali_classes4/com/zykj/http/progress/ProgressRequestBody.smali) | `contentType`、`writeTo` |
| [ProgressRequestBodyKt](../../../android/优课畅学/smali_classes4/com/zykj/http/progress/ProgressRequestBodyKt.smali) | `asProgressRequestBody` |

## com.zykj.image

| 类 | 方法摘录 |
|---|---|
| [DataBinderMapperImpl](../../../android/优课畅学/smali_classes4/com/zykj/image/DataBinderMapperImpl.smali) | `collectDependencies`、`convertBrIdToString`、`getDataBinder`、`getDataBinder`、`getLayoutId` |
| [Hilt_ImageCropFragment](../../../android/优课畅学/smali_classes4/com/zykj/image/Hilt_ImageCropFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_ImagePickFragment](../../../android/优课畅学/smali_classes4/com/zykj/image/Hilt_ImagePickFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_QRCodeFragment](../../../android/优课畅学/smali_classes4/com/zykj/image/Hilt_QRCodeFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [ImageCropFragment](../../../android/优课畅学/smali_classes4/com/zykj/image/ImageCropFragment.smali) | `getArgs`、`saveToLocal`、`showCropDialog`、`initData`、`initView`、`layoutId` |
| [ImageCropFragmentArgs](../../../android/优课畅学/smali_classes4/com/zykj/image/ImageCropFragmentArgs.smali) | `fromBundle` |
| [ImagePickFragment](../../../android/优课畅学/smali_classes4/com/zykj/image/ImagePickFragment.smali) | `bindCameraUseCases`、`getArgs`、`requestCameraPermission`、`setUpCamera`、`startCamera`、`takePic`、`initData` |
| [ImagePickFragmentArgs](../../../android/优课畅学/smali_classes4/com/zykj/image/ImagePickFragmentArgs.smali) | `fromBundle` |
| [QRCodeFragment](../../../android/优课畅学/smali_classes4/com/zykj/image/QRCodeFragment.smali) | `bindCameraUseCases`、`requestCameraPermission`、`setUpCamera`、`startCamera`、`initView`、`layoutId`、`onDestroyView` |
| [ViewfinderView](../../../android/优课畅学/smali_classes4/com/zykj/image/ViewfinderView.smali) | `onDraw` |

## com.zykj.lib.error.code

| 类 | 方法摘录 |
|---|---|
| [ErrorCode](../../../android/优课畅学/smali_classes4/com/zykj/lib/error/code/ErrorCode.smali) | `valueOf`、`values`、`getErrorCodeInfo` |
| [ErrorCodeHandler](../../../android/优课畅学/smali_classes4/com/zykj/lib/error/code/ErrorCodeHandler.smali) | `getErrorCode` |
| [ErrorCodeInfo](../../../android/优课畅学/smali_classes4/com/zykj/lib/error/code/ErrorCodeInfo.smali) | `getCode`、`getDesc`、`getMessage`、`getMessageResId` |

## com.zykj.lib.login

| 类 | 方法摘录 |
|---|---|
| [DataBinderMapperImpl](../../../android/优课畅学/smali_classes4/com/zykj/lib/login/DataBinderMapperImpl.smali) | `collectDependencies`、`convertBrIdToString`、`getDataBinder`、`getDataBinder`、`getLayoutId` |

## com.zykj.lib.login.bean

| 类 | 方法摘录 |
|---|---|
| [LoginInfo](../../../android/优课畅学/smali_classes4/com/zykj/lib/login/bean/LoginInfo.smali) | `getNeedChangePwd`、`getNeedSendSms`、`getPasswordStrength`、`isTeacher` |

## com.zykj.lib.login.proto

| 类 | 方法摘录 |
|---|---|
| [RoleType](../../../android/优课畅学/smali_classes4/com/zykj/lib/login/proto/RoleType.smali) | `forNumber`、`internalGetValueMap`、`internalGetVerifier`、`valueOf`、`valueOf`、`values`、`getNumber` |
| [RoleTypeOuterClass](../../../android/优课畅学/smali_classes4/com/zykj/lib/login/proto/RoleTypeOuterClass.smali) | `registerAllExtensions` |
| [ServerBean](../../../android/优课畅学/smali_classes4/com/zykj/lib/login/proto/ServerBean.smali) | `clearAccessToken`、`clearRefreshToken`、`clearSchoolCode`、`clearServerUrl`、`clearWebServerUrl`、`getDefaultInstance`、`newBuilder` |
| [ServerBeanOrBuilder](../../../android/优课畅学/smali_classes4/com/zykj/lib/login/proto/ServerBeanOrBuilder.smali) | `getAccessToken`、`getAccessTokenBytes`、`getRefreshToken`、`getRefreshTokenBytes`、`getSchoolCode`、`getSchoolCodeBytes`、`getServerUrl` |
| [ServerBeanOuterClass](../../../android/优课畅学/smali_classes4/com/zykj/lib/login/proto/ServerBeanOuterClass.smali) | `registerAllExtensions` |
| [UserBean](../../../android/优课畅学/smali_classes4/com/zykj/lib/login/proto/UserBean.smali) | `clearAvatar`、`clearId`、`clearRealName`、`clearRole`、`clearUserName`、`getDefaultInstance`、`newBuilder` |
| [UserBeanOrBuilder](../../../android/优课畅学/smali_classes4/com/zykj/lib/login/proto/UserBeanOrBuilder.smali) | `getAvatar`、`getAvatarBytes`、`getId`、`getIdBytes`、`getRealName`、`getRealNameBytes`、`getRole` |
| [UserBeanOuterClass](../../../android/优课畅学/smali_classes4/com/zykj/lib/login/proto/UserBeanOuterClass.smali) | `registerAllExtensions` |

## com.zykj.lib.login.provide

| 类 | 方法摘录 |
|---|---|
| [ServerBeanSerializer](../../../android/优课畅学/smali_classes4/com/zykj/lib/login/provide/ServerBeanSerializer.smali) | `getDefaultValue`、`readFrom`、`writeTo` |
| [UserBeanSerializer](../../../android/优课畅学/smali_classes4/com/zykj/lib/login/provide/UserBeanSerializer.smali) | `getDefaultValue`、`readFrom`、`writeTo` |

## com.zykj.lib.login.ui.main

| 类 | 方法摘录 |
|---|---|
| [LoginFragment](../../../android/优课畅学/smali_classes4/com/zykj/lib/login/ui/main/LoginFragment.smali) | `initView`、`layoutId` |

## com.zykj.lib.login.ui.student

| 类 | 方法摘录 |
|---|---|
| [Hilt_StudentLoginFragment](../../../android/优课畅学/smali_classes4/com/zykj/lib/login/ui/student/Hilt_StudentLoginFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [StudentLoginFragment](../../../android/优课畅学/smali_classes4/com/zykj/lib/login/ui/student/StudentLoginFragment.smali) | `initView`、`layoutId` |

## com.zykj.lib.login.ui.teacher

| 类 | 方法摘录 |
|---|---|
| [Hilt_TeacherLoginFragment](../../../android/优课畅学/smali_classes4/com/zykj/lib/login/ui/teacher/Hilt_TeacherLoginFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [TeacherLoginFragment](../../../android/优课畅学/smali_classes4/com/zykj/lib/login/ui/teacher/TeacherLoginFragment.smali) | `initData`、`initView`、`layoutId` |

## com.zykj.lib.login.ui.teacher.pwd

| 类 | 方法摘录 |
|---|---|
| [ChangePwdDialog](../../../android/优课畅学/smali_classes4/com/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog.smali) | `initView`、`layoutId` |
| [ComposeModifyPasswordDialog](../../../android/优课畅学/smali_classes4/com/zykj/lib/login/ui/teacher/pwd/ComposeModifyPasswordDialog.smali) | `onCreate`、`onCreateDialog`、`onCreateView`、`onViewCreated` |
| [ComposeModifyPasswordDialogArgs](../../../android/优课畅学/smali_classes4/com/zykj/lib/login/ui/teacher/pwd/ComposeModifyPasswordDialogArgs.smali) | `fromBundle` |
| [Hilt_ChangePwdDialog](../../../android/优课畅学/smali_classes4/com/zykj/lib/login/ui/teacher/pwd/Hilt_ChangePwdDialog.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_ComposeModifyPasswordDialog](../../../android/优课畅学/smali_classes4/com/zykj/lib/login/ui/teacher/pwd/Hilt_ComposeModifyPasswordDialog.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [PasswordSecurityLevel](../../../android/优课畅学/smali_classes4/com/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel.smali) | `valueOf`、`values` |

## com.zykj.lib.login.ui.teacher.sms

| 类 | 方法摘录 |
|---|---|
| [Hilt_SendSmsDialog](../../../android/优课畅学/smali_classes4/com/zykj/lib/login/ui/teacher/sms/Hilt_SendSmsDialog.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [SendSmsDialog](../../../android/优课畅学/smali_classes4/com/zykj/lib/login/ui/teacher/sms/SendSmsDialog.smali) | `initView`、`layoutId` |

## com.zykj.lib.ota

| 类 | 方法摘录 |
|---|---|
| [CheckVersionProgressDialog](../../../android/优课畅学/smali_classes4/com/zykj/lib/ota/CheckVersionProgressDialog.smali) | `initView`、`layoutId` |
| [CheckVersionProgressDialogArgs](../../../android/优课畅学/smali_classes4/com/zykj/lib/ota/CheckVersionProgressDialogArgs.smali) | `fromBundle` |
| [DataBinderMapperImpl](../../../android/优课畅学/smali_classes4/com/zykj/lib/ota/DataBinderMapperImpl.smali) | `collectDependencies`、`convertBrIdToString`、`getDataBinder`、`getDataBinder`、`getLayoutId` |
| [DownloadProgressDialog](../../../android/优课畅学/smali_classes4/com/zykj/lib/ota/DownloadProgressDialog.smali) | `initView`、`layoutId` |
| [DownloadProgressDialogArgs](../../../android/优课畅学/smali_classes4/com/zykj/lib/ota/DownloadProgressDialogArgs.smali) | `fromBundle` |
| [Hilt_CheckVersionProgressDialog](../../../android/优课畅学/smali_classes4/com/zykj/lib/ota/Hilt_CheckVersionProgressDialog.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_DownloadProgressDialog](../../../android/优课畅学/smali_classes4/com/zykj/lib/ota/Hilt_DownloadProgressDialog.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_LatestVersionDialog](../../../android/优课畅学/smali_classes4/com/zykj/lib/ota/Hilt_LatestVersionDialog.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_UpdateChoiceDialog](../../../android/优课畅学/smali_classes4/com/zykj/lib/ota/Hilt_UpdateChoiceDialog.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [LatestVersionDialog](../../../android/优课畅学/smali_classes4/com/zykj/lib/ota/LatestVersionDialog.smali) | `initView`、`layoutId` |
| [LatestVersionDialogArgs](../../../android/优课畅学/smali_classes4/com/zykj/lib/ota/LatestVersionDialogArgs.smali) | `fromBundle` |
| [UpdateChoiceDialog](../../../android/优课畅学/smali_classes4/com/zykj/lib/ota/UpdateChoiceDialog.smali) | `initView`、`layoutId` |
| [UpdateChoiceDialogArgs](../../../android/优课畅学/smali_classes4/com/zykj/lib/ota/UpdateChoiceDialogArgs.smali) | `fromBundle` |

## com.zykj.lib.ota.bean

| 类 | 方法摘录 |
|---|---|
| [AppType](../../../android/优课畅学/smali_classes4/com/zykj/lib/ota/bean/AppType.smali) | `getEntries`、`valueOf`、`values` |
| [VersionInfo](../../../android/优课畅学/smali_classes4/com/zykj/lib/ota/bean/VersionInfo.smali) | `describeContents`、`getDescription`、`getFileUrl`、`getForceUpdate`、`getName`、`getSize`、`getVersionCode` |
| [VersionInfoReq](../../../android/优课畅学/smali_classes4/com/zykj/lib/ota/bean/VersionInfoReq.smali) | `getAppType`、`getPackageName`、`getVersion` |

## com.zykj.lib.ota.provide

| 类 | 方法摘录 |
|---|---|
| [UpdateSettingsSerializer](../../../android/优课畅学/smali_classes4/com/zykj/lib/ota/provide/UpdateSettingsSerializer.smali) | `getDefaultValue`、`readFrom`、`writeTo` |

## com.zykj.lib.ota.view

| 类 | 方法摘录 |
|---|---|
| [ProgressBar](../../../android/优课畅学/smali_classes4/com/zykj/lib/ota/view/ProgressBar.smali) | `onDraw`、`onMeasure` |

## com.zykj.merge.sketch.constant

| 类 | 方法摘录 |
|---|---|
| [PlayStatus](../../../android/优课畅学/smali_classes4/com/zykj/merge/sketch/constant/PlayStatus.smali) | `valueOf`、`values` |

## com.zykj.merge.sketch.view

| 类 | 方法摘录 |
|---|---|
| [BlackBoardProxyView](../../../android/优课畅学/smali_classes4/com/zykj/merge/sketch/view/BlackBoardProxyView.smali) | `areaMoveEnd`、`areaMoveStart`、`areaMoving`、`destroy`、`getCurrentScreenBitmap`、`getMoveHorizontalProgress`、`getMoveMaxHeightTimes` |
| [MergeSketchPlayView](../../../android/优课畅学/smali_classes4/com/zykj/merge/sketch/view/MergeSketchPlayView.smali) | `getMoveHorizontalProgress`、`getMoveMaxHeightTimes`、`getMoveMaxWidthTimes`、`getMoveVerticalProgress`、`getPath`、`getScreenBitmap`、`setAreaMoveListener` |
| [OldSketchProxyView](../../../android/优课畅学/smali_classes4/com/zykj/merge/sketch/view/OldSketchProxyView.smali) | `getLoadDataExecutor`、`getSeekExecutor`、`destroy`、`getPath`、`loadData`、`pause`、`release` |

## com.zykj.message

| 类 | 方法摘录 |
|---|---|
| [KillSelfService](../../../android/优课畅学/smali_classes4/com/zykj/message/KillSelfService.smali) | `onBind`、`onStartCommand` |
| [UnInstallActivity](../../../android/优课畅学/smali_classes4/com/zykj/message/UnInstallActivity.smali) | `onBackPressed`、`onCreate`、`onResume` |
| [UnLoginActivity](../../../android/优课畅学/smali_classes4/com/zykj/message/UnLoginActivity.smali) | `onActivityResult`、`onBackPressed`、`onCreate`、`onDestroy`、`onPause`、`onRestart`、`onResume` |

## com.zykj.message.client

| 类 | 方法摘录 |
|---|---|
| [MessageClient](../../../android/优课畅学/smali_classes4/com/zykj/message/client/MessageClient.smali) | `valueOf`、`values` |

## com.zykj.message.server.bean

| 类 | 方法摘录 |
|---|---|
| [ServerInfo](../../../android/优课畅学/smali_classes4/com/zykj/message/server/bean/ServerInfo.smali) | `describeContents`、`writeToParcel` |
| [Status](../../../android/优课畅学/smali_classes4/com/zykj/message/server/bean/Status.smali) | `valueOf`、`values`、`describeContents`、`writeToParcel` |
| [UserInfo](../../../android/优课畅学/smali_classes4/com/zykj/message/server/bean/UserInfo.smali) | `describeContents`、`writeToParcel` |

## com.zykj.paint.render

| 类 | 方法摘录 |
|---|---|
| [SketchViewer](../../../android/优课畅学/smali/com/zykj/paint/render/SketchViewer.smali) | `getCapture`、`getTotalTime`、`setPlayStatusListener`、`surfaceChanged`、`surfaceCreated`、`surfaceDestroyed` |

## com.zykj.policy

| 类 | 方法摘录 |
|---|---|
| [DataBinderMapperImpl](../../../android/优课畅学/smali/com/zykj/policy/DataBinderMapperImpl.smali) | `collectDependencies`、`convertBrIdToString`、`getDataBinder`、`getDataBinder`、`getLayoutId` |

## com.zykj.policy.ui

| 类 | 方法摘录 |
|---|---|
| [PolicyCheckView](../../../android/优课畅学/smali/com/zykj/policy/ui/PolicyCheckView.smali) | `setData` |
| [PolicyDetailActivity](../../../android/优课畅学/smali/com/zykj/policy/ui/PolicyDetailActivity.smali) | `onCreate`、`onDestroy` |
| [PolicyDialogFragment](../../../android/优课畅学/smali/com/zykj/policy/ui/PolicyDialogFragment.smali) | `onCreateDialog`、`onCreateView`、`onViewCreated` |

## com.zykj.sketch

| 类 | 方法摘录 |
|---|---|
| [EzyDrawBoard](../../../android/优课畅学/smali_classes2/com/zykj/sketch/EzyDrawBoard.smali) | `getDescriptor`、`registerAllExtensions`、`registerAllExtensions` |
| [GraphSnapshot](../../../android/优课畅学/smali_classes2/com/zykj/sketch/GraphSnapshot.smali) | `getDescriptor`、`registerAllExtensions`、`registerAllExtensions` |
| [SketchHeader](../../../android/优课畅学/smali_classes2/com/zykj/sketch/SketchHeader.smali) | `getDescriptor`、`registerAllExtensions`、`registerAllExtensions` |

## com.zykj.sketch.core

| 类 | 方法摘录 |
|---|---|
| [ActionExecute](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/ActionExecute.smali) | `addNewGraph`、`buildHistoryGraph`、`setAttribute`、`setAttribute2`、`addViewControl`、`buildGraph`、`buildMatrix` |
| [ActionRecord](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/ActionRecord.smali) | `buildActionContent`、`buildHistoryRendData`、`notifyListener`、`addActionChangeListener`、`addHistoryRecord`、`addHistoryRenderGraphSnapshot`、`addNextPrevListener` |
| [ActionRecordExecute](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/ActionRecordExecute.smali) | `addRecord`、`onActionModeEvent`、`onAddImageEvent`、`onAddPPTEvent`、`onAudioStartRecord`、`onAudioStopRecord`、`onClearBoardEvent` |
| [ActionStrategyFactory](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/ActionStrategyFactory.smali) | `getActionGraphName`、`getGraphName`、`buildActionMode`、`clearAction`、`create`、`getAction`、`parseActionMode` |
| [GraphControl](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/GraphControl.smali) | `handleDeleteListener`、`initGraphConfig`、`clear`、`clearTempPaint`、`findGraph`、`findSelectGraph`、`forceRender` |

## com.zykj.sketch.core.action

| 类 | 方法摘录 |
|---|---|
| [BaseAction](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/action/BaseAction.smali) | `getTouchEventList`、`getTouchStartTime`、`isRecord`、`isTouchEnable`、`onTouchDown`、`onTouchMove`、`onTouchPointerDown` |
| [EraseViewAction](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/action/EraseViewAction.smali) | `deleteGraph`、`handleListener`、`enumType`、`onTouchDown` |
| [EraseWritingAction](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/action/EraseWritingAction.smali) | `deleteGraph`、`enumType`、`onTouchDown`、`onTouchMove`、`onTouchPointerDown`、`onTouchPointerUp`、`onTouchUp` |
| [SelectAction](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/action/SelectAction.smali) | `initTempValue`、`enumType`、`getMode`、`onTouchDown`、`onTouchMove`、`onTouchPointerDown`、`onTouchPointerUp` |
| [WritingAction](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/action/WritingAction.smali) | `createGraph`、`enumType`、`getGraph`、`getMX`、`getMY`、`getParentGraphName`、`getPath` |
| [WritingAndMoveAction](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/action/WritingAndMoveAction.smali) | `initTempValue`、`enumType`、`getGraph`、`getMX`、`getMY`、`getParentGraphName`、`getPath` |
| [WritingAndMoveVerticalAction](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/action/WritingAndMoveVerticalAction.smali) | `initTempValue`、`enumType`、`getGraph`、`getMX`、`getMY`、`getParentGraphName`、`getPath` |

## com.zykj.sketch.core.config

| 类 | 方法摘录 |
|---|---|
| [GraphConfig](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/config/GraphConfig.smali) | `getColor`、`getWidth`、`setColor`、`setWidth` |
| [SketchConfig](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/config/SketchConfig.smali) | `getContext`、`getMaxImageCount`、`getMaxPPTCount`、`getSourcePath`、`isTouchable`、`setMaxImageCount`、`setMaxPPTCount` |

## com.zykj.sketch.core.data

| 类 | 方法摘录 |
|---|---|
| [AudioTask](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/data/AudioTask.smali) | `getDuration`、`getFileName`、`getPath`、`getStartTime`、`setDuration`、`setPath` |
| [CORNER](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/data/CORNER.smali) | `valueOf`、`values` |
| [GraphTask](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/data/GraphTask.smali) | `getActionContent`、`getExecuteVoid`、`getHasSnapshot`、`getSnapshotVoid`、`getStartTime` |
| [Mode](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/data/Mode.smali) | `valueOf`、`values` |
| [PlayStatus](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/data/PlayStatus.smali) | `valueOf`、`values`、`getState`、`getStateName`、`setState`、`setStateName` |
| [RenderTask](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/data/RenderTask.smali) | `getAudioTaskList`、`getGraphTask`、`getLastSnapshot`、`getProgress`、`setLastSnapshot`、`setProgress` |
| [ThumbnailBean](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/data/ThumbnailBean.smali) | `getBitmap`、`getLimitRenderRectF`、`getMaxRenderRectF` |

## com.zykj.sketch.core.graph

| 类 | 方法摘录 |
|---|---|
| [BoundedContainerGraph](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/graph/BoundedContainerGraph.smali) | `getSnapshot`、`graphType`、`onMeasure` |
| [CircleGraph](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/graph/CircleGraph.smali) | `onMeasure`、`render` |
| [Graph](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/graph/Graph.smali) | `drawBorder`、`showDelete`、`addGraph`、`cancelSelected`、`childTypeNumber`、`clear`、`findGraph` |
| [GraphExtKt](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/graph/GraphExtKt.smali) | `convert2FM`、`convert2WM`、`getFP2WPMatrix`、`getFP2WPRendMatrix`、`getWP2FPMatrix`、`getWP2LPMatrix`、`initPaint` |
| [ImageGraph](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/graph/ImageGraph.smali) | `getTranslateCenterMatrix`、`reloadBitmap`、`checkOldData`、`getFileName`、`getSnapshot`、`graphType`、`onMeasure` |
| [ImageHistoryGraph](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/graph/ImageHistoryGraph.smali) | `getSaleCenterMatrix`、`getFileName`、`getSnapshot`、`graphType`、`onDestroy`、`onDraw`、`onMeasure` |
| [RectGraph](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/graph/RectGraph.smali) | `onMeasure`、`render` |
| [StrokeGraph](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/graph/StrokeGraph.smali) | `isIntersect`、`addFPPoint`、`addPoint`、`addPoint`、`findGraph`、`getActionControl`、`getSnapshot` |
| [UnBoundedContainerGraph](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/graph/UnBoundedContainerGraph.smali) | `getSnapshot`、`graphType`、`isInRect`、`onMeasure` |
| [ViewGraph](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/graph/ViewGraph.smali) | `compressImage` |
| [WebViewGraph](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/graph/WebViewGraph.smali) | `getSaleCenterMatrix`、`startRefresh`、`getBitmap`、`getCompressbitmap`、`getSnapshot`、`graphType`、`onDestroy` |
| [WritingGroupGraph](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/graph/WritingGroupGraph.smali) | `addGraph`、`createPath`、`crossLine`、`getIntersectGraph`、`getIntersectGraph`、`getSnapshot`、`graphType` |

## com.zykj.sketch.core.listener

| 类 | 方法摘录 |
|---|---|
| [ActionChangeListener](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/listener/ActionChangeListener.smali) | `change` |
| [AudioOperation](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/listener/AudioOperation.smali) | `isRecord`、`setProgressListener`、`startRecord`、`stopRecord` |
| [EventListener](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/listener/EventListener.smali) | `addViewControl`、`graphSnapShot`、`graphSnapShot`、`initConfig`、`onActionModeEvent`、`onAddImageEvent`、`onAddPPTEvent` |
| [GraphMatrixListener](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/listener/GraphMatrixListener.smali) | `onScale`、`onTranslation` |
| [IAction](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/listener/IAction.smali) | `enumType`、`getTouchEventList`、`getTouchStartTime`、`isRecord`、`onTouchDown`、`onTouchMove`、`onTouchPointerDown` |
| [IControl](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/listener/IControl.smali) | `clear`、`clearTempPaint`、`findGraph`、`findSelectGraph`、`forceRender`、`getBackgroundColor`、`getCameraMatrix` |
| [IDraw](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/listener/IDraw.smali) | `onDraw`、`onDrawComplete`、`render` |
| [IGraph](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/listener/IGraph.smali) | `findGraphByName`、`findGraphByType`、`getGraphName`、`getSnapshot`、`graphType`、`isComplete`、`isInRect` |
| [IUserPlay](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/listener/IUserPlay.smali) | `addPlayActionListener`、`destroy`、`getPlayStatus`、`loadData`、`pause`、`removePlayActionListener`、`seekTo` |
| [ImageDeleteListener](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/listener/ImageDeleteListener.smali) | `onDeleteImagePath` |
| [ImitateDraw](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/listener/ImitateDraw.smali) | `clearGraph`、`drawPath`、`drawThumbnail`、`graphMatrix`、`setLimitDrawArea` |
| [ModeChangeListener](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/listener/ModeChangeListener.smali) | `onChange` |
| [NextPrevListener](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/listener/NextPrevListener.smali) | `listener` |
| [PPTControl](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/listener/PPTControl.smali) | `goPage`、`nextAction`、`nextSlide`、`preAction`、`preSlide` |
| [PPTListener](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/listener/PPTListener.smali) | `currentPage`、`onPageFinished`、`totalPageCount` |
| [PlayActionListener](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/listener/PlayActionListener.smali) | `onPlayEnd`、`onPlayPause`、`onPlayStart`、`onProgress`、`onWaitPlay` |
| [ProgressListener](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/listener/ProgressListener.smali) | `progress`、`recordError` |
| [RealDraw](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/listener/RealDraw.smali) | `drawGraph`、`setDrawBackground`、`setLimitDrawArea`、`shutdown` |

## com.zykj.sketch.core.player

| 类 | 方法摘录 |
|---|---|
| [AudioThread](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/player/AudioThread.smali) | `getTotalDuration`、`initMediaPlayer`、`notifyProgress`、`resetMediaPlay`、`stopAllAudio`、`initSeekTo`、`pausePlay` |
| [PaintThread](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/player/PaintThread.smali) | `getTotalDuration`、`notifyProgress`、`initSeekTo`、`pausePlay`、`resumePlay`、`seekTo`、`setData` |
| [PlayControl](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/player/PlayControl.smali) | `checkAudioFile`、`parseDrawBoardData`、`addPlayActionListener`、`getPlayStatus`、`loadData`、`onDestroy`、`pause` |
| [PlayThread](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/player/PlayThread.smali) | `getPlayStatus`、`getStatus`、`pausePlay`、`reset`、`resumePlay`、`setPlayStatus`、`shutdown` |
| [SketchPlayerView](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/player/SketchPlayerView.smali) | `getLoadDataExecutor`、`getSeekExecutor`、`runAtLeastCreated`、`addPlayActionListener`、`destroy`、`getPlayStatus`、`isRend` |

## com.zykj.sketch.core.record

| 类 | 方法摘录 |
|---|---|
| [AudioControl](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/record/AudioControl.smali) | `addListener`、`isRecord`、`reset`、`startRecord`、`stopRecord` |
| [GraphOperation](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/record/GraphOperation.smali) | `addImage`、`addImage`、`addImage`、`addImage`、`addPPT`、`clear`、`getConfig` |
| [RecordControl](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/record/RecordControl.smali) | `addImage`、`countScale`、`executeActionContent`、`executeTask`、`getImagePath`、`saveBitmap`、`addActionChangeListener` |
| [SketchRecorderView](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/record/SketchRecorderView.smali) | `addImage`、`addImage`、`addImage`、`addImage`、`addPPT`、`clear`、`getConfig` |

## com.zykj.sketch.core.version

| 类 | 方法摘录 |
|---|---|
| [GraphTaskParseVersion1](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/version/GraphTaskParseVersion1.smali) | `parseEventAsTask`、`parse` |
| [GraphTaskParseVersion3](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/version/GraphTaskParseVersion3.smali) | `addGraphTask`、`countTaskStartTime`、`deleteSnapShot`、`parseEventAsTask`、`parseEventAsTask`、`getFlag`、`parse` |
| [GraphTaskParseVersion4](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/version/GraphTaskParseVersion4.smali) | `addGraphTask`、`countTaskStartTime`、`deleteSnapShot`、`parseEventAsTask`、`parseEventAsTask`、`getFlag`、`parse` |
| [GraphTaskParseVersion5](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/version/GraphTaskParseVersion5.smali) | `addGraphTask`、`countTaskStartTime`、`deleteSnapShot`、`parseEventAsTask`、`parseEventAsTask`、`getFlag`、`parse` |
| [ITaskParse](../../../android/优课畅学/smali_classes3/com/zykj/sketch/core/version/ITaskParse.smali) | `parse` |

## com.zykj.sketch.extensions

| 类 | 方法摘录 |
|---|---|
| [ExtensionsKt](../../../android/优课畅学/smali_classes3/com/zykj/sketch/extensions/ExtensionsKt.smali) | `capture`、`getDegree`、`getDistance`、`getDistance`、`getMidPoint`、`getRotation`、`lineSpace` |

## com.zykj.sketch.utils

| 类 | 方法摘录 |
|---|---|
| [ToastUtils](../../../android/优课畅学/smali_classes3/com/zykj/sketch/utils/ToastUtils.smali) | `showLong`、`showLong`、`showShort`、`showShort` |

## com.zykj.sketch.widgets

| 类 | 方法摘录 |
|---|---|
| [DrawTempView](../../../android/优课畅学/smali_classes3/com/zykj/sketch/widgets/DrawTempView.smali) | `clearGraph`、`drawPath`、`drawThumbnail`、`graphMatrix`、`onDraw`、`setLimitDrawArea` |
| [DrawView](../../../android/优课畅学/smali_classes3/com/zykj/sketch/widgets/DrawView.smali) | `drawGraph`、`onDraw`、`setDrawBackground`、`setLimitDrawArea`、`shutdown` |
| [PPTWebView](../../../android/优课畅学/smali_classes3/com/zykj/sketch/widgets/PPTWebView.smali) | `goPage`、`loadSlider`、`nextAction`、`nextSlide`、`onTouchEvent`、`preAction`、`preSlide` |
| [SurfaceDrawView](../../../android/优课畅学/smali_classes3/com/zykj/sketch/widgets/SurfaceDrawView.smali) | `drawGraph`、`setDrawBackground`、`setLimitDrawArea`、`shutdown`、`surfaceChanged`、`surfaceCreated`、`surfaceDestroyed` |
| [TempView](../../../android/优课畅学/smali_classes3/com/zykj/sketch/widgets/TempView.smali) | `onDraw`、`rectConvertRegion` |
| [TextureDrawView](../../../android/优课畅学/smali_classes3/com/zykj/sketch/widgets/TextureDrawView.smali) | `dispatchVisibilityChanged`、`drawGraph`、`isRend`、`onDetachedFromWindow`、`onSurfaceTextureAvailable`、`onSurfaceTextureDestroyed`、`onSurfaceTextureSizeChanged` |

## com.zykj.study

| 类 | 方法摘录 |
|---|---|
| [DataBinderMapperImpl](../../../android/优课畅学/smali_classes4/com/zykj/study/DataBinderMapperImpl.smali) | `collectDependencies`、`convertBrIdToString`、`getDataBinder`、`getDataBinder`、`getLayoutId` |
| [Hilt_MyApplication](../../../android/优课畅学/smali_classes4/com/zykj/study/Hilt_MyApplication.smali) | `generatedComponent`、`hiltInternalInject`、`onCreate` |
| [MyApplication](../../../android/优课畅学/smali_classes4/com/zykj/study/MyApplication.smali) | `initX5`、`attachBaseContext`、`getClientCodeLiveData`、`onCreate`、`onTerminate`、`setClientCodeLiveData` |

## com.zykj.study.adapter

| 类 | 方法摘录 |
|---|---|
| [CatalogAdapter](../../../android/优课畅学/smali_classes4/com/zykj/study/adapter/CatalogAdapter.smali) | `getItemCount`、`getItemViewType`、`onBindViewHolder`、`onCreateViewHolder` |
| [CatalogCompleteAdapter](../../../android/优课畅学/smali_classes4/com/zykj/study/adapter/CatalogCompleteAdapter.smali) | `getItemCount`、`getItemViewType`、`onBindViewHolder`、`onCreateViewHolder` |
| [CatalogGradeAdapter](../../../android/优课畅学/smali_classes4/com/zykj/study/adapter/CatalogGradeAdapter.smali) | `getItemCount`、`onBindViewHolder`、`onCreateViewHolder` |
| [CatalogPeriodAdapter](../../../android/优课畅学/smali_classes4/com/zykj/study/adapter/CatalogPeriodAdapter.smali) | `getItemCount`、`onBindViewHolder`、`onCreateViewHolder` |
| [CatalogProgressAdapter](../../../android/优课畅学/smali_classes4/com/zykj/study/adapter/CatalogProgressAdapter.smali) | `getItemCount`、`getItemViewType`、`onBindViewHolder`、`onCreateViewHolder` |
| [CatalogSubjectAdapter](../../../android/优课畅学/smali_classes4/com/zykj/study/adapter/CatalogSubjectAdapter.smali) | `getItemCount`、`onBindViewHolder`、`onCreateViewHolder` |
| [ChartBarAdapter](../../../android/优课畅学/smali_classes4/com/zykj/study/adapter/ChartBarAdapter.smali) | `onBindViewHolder`、`onCreateViewHolder` |
| [ChoiceChartDataDiffCallback](../../../android/优课畅学/smali_classes4/com/zykj/study/adapter/ChoiceChartDataDiffCallback.smali) | `areContentsTheSame`、`areItemsTheSame` |
| [CourseAdapter](../../../android/优课畅学/smali_classes4/com/zykj/study/adapter/CourseAdapter.smali) | `onBindViewHolder`、`onCreateViewHolder` |
| [CourseFragmentAdapter](../../../android/优课畅学/smali_classes4/com/zykj/study/adapter/CourseFragmentAdapter.smali) | `createFragment`、`getItemCount` |
| [CourseManageAdapter](../../../android/优课畅学/smali_classes4/com/zykj/study/adapter/CourseManageAdapter.smali) | `getItemViewType`、`onBindViewHolder`、`onBindViewHolder`、`onCreateViewHolder` |
| [CourseStudyAdapter](../../../android/优课畅学/smali_classes4/com/zykj/study/adapter/CourseStudyAdapter.smali) | `onBindViewHolder`、`onBindViewHolder`、`onCreateViewHolder` |
| [CoverAdapter](../../../android/优课畅学/smali_classes4/com/zykj/study/adapter/CoverAdapter.smali) | `getItemCount`、`onBindViewHolder`、`onCreateViewHolder` |
| [FreeSubscribeAdapter](../../../android/优课畅学/smali_classes4/com/zykj/study/adapter/FreeSubscribeAdapter.smali) | `onBindViewHolder`、`onCreateViewHolder` |
| [FreeSubscribeDiffCallback](../../../android/优课畅学/smali_classes4/com/zykj/study/adapter/FreeSubscribeDiffCallback.smali) | `areContentsTheSame`、`areItemsTheSame` |
| [GroupStatisticAdapter](../../../android/优课畅学/smali_classes4/com/zykj/study/adapter/GroupStatisticAdapter.smali) | `getItemCount`、`onBindViewHolder`、`onCreateViewHolder` |
| [HomeFragmentAdapter](../../../android/优课畅学/smali_classes4/com/zykj/study/adapter/HomeFragmentAdapter.smali) | `createFragment`、`getItemCount` |
| [MicroAdapter](../../../android/优课畅学/smali_classes4/com/zykj/study/adapter/MicroAdapter.smali) | `getItemCount`、`onBindViewHolder`、`onCreateViewHolder` |
| [MicroEditAdapter](../../../android/优课畅学/smali_classes4/com/zykj/study/adapter/MicroEditAdapter.smali) | `getItemCount`、`getItemViewType`、`onBindViewHolder`、`onCreateViewHolder` |
| [MicroViewAdapter](../../../android/优课畅学/smali_classes4/com/zykj/study/adapter/MicroViewAdapter.smali) | `getItemCount`、`onBindViewHolder`、`onCreateViewHolder` |
| [MyCourseAdapter](../../../android/优课畅学/smali_classes4/com/zykj/study/adapter/MyCourseAdapter.smali) | `onBindViewHolder`、`onCreateViewHolder` |
| [MyTeachCourseAdapter](../../../android/优课畅学/smali_classes4/com/zykj/study/adapter/MyTeachCourseAdapter.smali) | `onBindViewHolder`、`onCreateViewHolder` |
| [MyTeachCourseAddAdapter](../../../android/优课畅学/smali_classes4/com/zykj/study/adapter/MyTeachCourseAddAdapter.smali) | `onBindViewHolder`、`onCreateViewHolder` |
| [SearchHistoryAdapter](../../../android/优课畅学/smali_classes4/com/zykj/study/adapter/SearchHistoryAdapter.smali) | `getItemCount`、`onBindViewHolder`、`onCreateViewHolder` |
| [StatisticsAdapter](../../../android/优课畅学/smali_classes4/com/zykj/study/adapter/StatisticsAdapter.smali) | `getItemCount`、`onBindViewHolder`、`onCreateViewHolder` |
| [StuNameAdapter](../../../android/优课畅学/smali_classes4/com/zykj/study/adapter/StuNameAdapter.smali) | `onBindViewHolder`、`onCreateViewHolder` |
| [StudentAchievementAdapter](../../../android/优课畅学/smali_classes4/com/zykj/study/adapter/StudentAchievementAdapter.smali) | `getItemCount`、`onBindViewHolder`、`onCreateViewHolder` |
| [StudentViewMemberAdapter](../../../android/优课畅学/smali_classes4/com/zykj/study/adapter/StudentViewMemberAdapter.smali) | `getItemCount`、`onBindViewHolder`、`onCreateViewHolder` |
| [StudentViewMemberItemAdapter](../../../android/优课畅学/smali_classes4/com/zykj/study/adapter/StudentViewMemberItemAdapter.smali) | `getItemCount`、`onBindViewHolder`、`onCreateViewHolder` |
| [StudentViewMemberSearchAdapter](../../../android/优课畅学/smali_classes4/com/zykj/study/adapter/StudentViewMemberSearchAdapter.smali) | `getItemCount`、`onBindViewHolder`、`onCreateViewHolder` |
| [SubscribeTabListAdapter](../../../android/优课畅学/smali_classes4/com/zykj/study/adapter/SubscribeTabListAdapter.smali) | `getItemCount`、`onBindViewHolder`、`onCreateViewHolder` |
| [SuperviseGroupAddAdapter](../../../android/优课畅学/smali_classes4/com/zykj/study/adapter/SuperviseGroupAddAdapter.smali) | `getItemCount`、`onBindViewHolder`、`onCreateViewHolder` |
| [TitleListAdapter](../../../android/优课畅学/smali_classes4/com/zykj/study/adapter/TitleListAdapter.smali) | `getItemViewType`、`onBindViewHolder`、`onCreateViewHolder` |

## com.zykj.study.bean

| 类 | 方法摘录 |
|---|---|
| [AttachmentExtraInput](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/AttachmentExtraInput.smali) | `getAttachmentId`、`getUrl` |
| [AttachmentIdInput](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/AttachmentIdInput.smali) | `getCourseId`、`getName`、`getType`、`getUrl` |
| [AttachmentInput](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/AttachmentInput.smali) | `getCode`、`getCodeType`、`getExtra` |
| [ConvertEntity](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/ConvertEntity.smali) | `getData`、`getError`、`getSuccess` |
| [CourseContentDetailBean](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/CourseContentDetailBean.smali) | `getCatalogId`、`getExerciseList` |
| [DataStoreManager](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/DataStoreManager.smali) | `exerciseRevised`、`getSettingsDataStore`、`removeKey`、`setExerciseRevised` |
| [DeleteSubBatchReq](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/DeleteSubBatchReq.smali) | `describeContents`、`getCourseId`、`getLearnDateTimeEnd`、`getLearnDateTimeStart`、`getName`、`getRoleType`、`writeToParcel` |
| [DeleteSubSingReq](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/DeleteSubSingReq.smali) | `describeContents`、`getCourseId`、`getUserId`、`writeToParcel` |
| [ErrorRemote](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/ErrorRemote.smali) | `describeContents`、`getCode`、`getDetails`、`getMessage`、`getValidationErrors`、`writeToParcel` |
| [FreeSubscribe](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/FreeSubscribe.smali) | `describeContents`、`getId`、`getName`、`getRole`、`getSubTime`、`writeToParcel` |
| [FreeSubscribeReq](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/FreeSubscribeReq.smali) | `describeContents`、`getCourseId`、`getLearnDateTimeEnd`、`getLearnDateTimeStart`、`getName`、`getPageSize`、`getRoleType` |
| [FreeSubscribeResp](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/FreeSubscribeResp.smali) | `describeContents`、`getItems`、`getTotalCount`、`writeToParcel` |
| [GatewayBean](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/GatewayBean.smali) | `getCode`、`getLcid`、`getName`、`getServer`、`getWebServer`、`setCode` |
| [Group](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/Group.smali) | `describeContents`、`getGroupId`、`getGroupName`、`writeToParcel` |
| [ImageViewInfo](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/ImageViewInfo.smali) | `getUrl` |
| [LoginResp](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/LoginResp.smali) | `describeContents`、`getAccessToken`、`getClientCode`、`getExpireInSeconds`、`getMobile`、`getNeedChangePwd`、`getNeedSmsVerification` |
| [MatrixEnum](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/MatrixEnum.smali) | `getEntries`、`valueOf`、`values` |
| [MenuBean](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/MenuBean.smali) | `getMNormalIcon`、`getMSelectIcon`、`getMTitle`、`setMNormalIcon`、`setMSelectIcon`、`setMTitle` |
| [OssData](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/OssData.smali) | `getObjectKey`、`getOssToken` |
| [OssFileResource](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/OssFileResource.smali) | `getName`、`getValue` |
| [OssFileType](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/OssFileType.smali) | `getValue` |
| [OssTokenReq](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/OssTokenReq.smali) | `getFc`、`getFe`、`getFo`、`getFr`、`getFt`、`getNonce`、`getSign` |
| [OtherSubscribe](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/OtherSubscribe.smali) | `describeContents`、`getName`、`getSuperviseId`、`setName`、`writeToParcel` |
| [Paging](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/Paging.smali) | `getStartId`、`getTake` |
| [RoleType](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/RoleType.smali) | `getEntries`、`valueOf`、`values` |
| [ScanResult](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/ScanResult.smali) | `getCode`、`getCodeType` |
| [ScanResultType](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/ScanResultType.smali) | `getEntries`、`valueOf`、`values` |
| [SelectModel](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/SelectModel.smali) | `getData`、`isSelectModel`、`setData`、`setSelectModel` |
| [SelfSubscribeList](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/SelfSubscribeList.smali) | `describeContents`、`getGroups`、`getStudents`、`isSupervise`、`writeToParcel` |
| [SendSmsReq](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/SendSmsReq.smali) | `getLoginType`、`getMobile`、`getSchoolCode`、`getSn`、`getUserId` |
| [SmsReq](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/SmsReq.smali) | `describeContents`、`getMobile`、`getSn`、`getUserId`、`writeToParcel` |
| [Student](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/Student.smali) | `describeContents`、`getGroupId`、`getStudentName`、`writeToParcel` |
| [TokenReq](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/TokenReq.smali) | `getClientType`、`getDeviceNumber`、`getIm`、`getPassword`、`getRole`、`getSmsVerificationCode`、`getUsername` |
| [TokenResp](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/TokenResp.smali) | `describeContents`、`getAccessToken`、`getExpireInSeconds`、`getRefreshExpireInSeconds`、`getRefreshToken`、`writeToParcel` |
| [TokenResponse](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/TokenResponse.smali) | `describeContents`、`getError`、`getResult`、`getSuccess`、`getTargetUrl`、`writeToParcel` |
| [UiState](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/UiState.smali) | `onError`、`onInitial`、`onSuccess` |
| [UpdatePwdReq](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/UpdatePwdReq.smali) | `getOldPassword`、`getPassword`、`setOldPassword`、`setPassword` |
| [UpdatePwdResponse](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/UpdatePwdResponse.smali) | `getError`、`getSuccess` |
| [UserInfo](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/UserInfo.smali) | `getAvatar`、`getEmail`、`getId`、`getMobile`、`getName`、`getRealName`、`getRoleType` |
| [UserResponse](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/UserResponse.smali) | `getCode`、`getMessage`、`getResult` |

## com.zykj.study.bean.course

| 类 | 方法摘录 |
|---|---|
| [AuthorizeLessonReqBody](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/course/AuthorizeLessonReqBody.smali) | `getCourseId`、`getTeacherId` |
| [BatchCatalogReq](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/course/BatchCatalogReq.smali) | `getCatalogIds`、`getCourseId` |
| [CatalogBean](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/course/CatalogBean.smali) | `getChildNode`、`getChildren`、`getId`、`getLocked`、`getParentId`、`getProgress`、`getSort` |
| [CatalogIdInput](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/course/CatalogIdInput.smali) | `getId` |
| [CatalogInput](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/course/CatalogInput.smali) | `getCourseId`、`getParentId`、`getTitle`、`isLeaf` |
| [CatalogLockedBean](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/course/CatalogLockedBean.smali) | `getChildren`、`getId`、`getLocked`、`getTitle`、`isLeaf` |
| [CatalogManageData](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/course/CatalogManageData.smali) | `getId`、`getName`、`isExpanded`、`isLeaf`、`isLockable`、`isRoot`、`isUnlock` |
| [CatalogUpdateInput](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/course/CatalogUpdateInput.smali) | `getId`、`getTitle` |
| [CourseBean](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/course/CourseBean.smali) | `describeContents`、`getCover`、`getCreateTime`、`getDescription`、`getGradeId`、`getId`、`getLearning` |
| [CourseCreateInput](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/course/CourseCreateInput.smali) | `getCover`、`getDescription`、`getGrade`、`getId`、`getSchoolLevel`、`getSubject`、`getTitle` |
| [CourseDeleteInput](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/course/CourseDeleteInput.smali) | `getForce`、`getId` |
| [CourseDetailsBean](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/course/CourseDetailsBean.smali) | `getCatalogs`、`getCourseName`、`getLearnTime`、`getProgress`、`getStudents`、`getSuperviseId`、`getUserAvatar` |
| [CourseIdInput](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/course/CourseIdInput.smali) | `getId` |
| [CourseSimpleBean](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/course/CourseSimpleBean.smali) | `describeContents`、`getGradeName`、`getLevelName`、`getSubjectName`、`getUserName`、`setGradeName`、`setLevelName` |
| [CourseSubscribeInput](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/course/CourseSubscribeInput.smali) | `getId` |
| [CourseType](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/course/CourseType.smali) | `getEntries`、`valueOf`、`values`、`describeContents`、`writeToParcel` |
| [ReorderCatalogReq](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/course/ReorderCatalogReq.smali) | `getCatalogDtos`、`getCourseId` |
| [SearchReqBody](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/course/SearchReqBody.smali) | `getCourseId`、`getParam` |
| [StudyStatus](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/course/StudyStatus.smali) | `getEntries`、`valueOf`、`values` |

## com.zykj.study.bean.dict

| 类 | 方法摘录 |
|---|---|
| [DictBean](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/dict/DictBean.smali) | `getPeriodList`、`getSubjectList` |
| [PeriodBean](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/dict/PeriodBean.smali) | `getChildren`、`getId`、`getName` |

## com.zykj.study.bean.exercise

| 类 | 方法摘录 |
|---|---|
| [AnswerMicroResultInput](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/exercise/AnswerMicroResultInput.smali) | `getAnswerEx`、`getCorrect`、`getExerciseId`、`getGroupId`、`getQuestionId` |
| [AnswerResultInput](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/exercise/AnswerResultInput.smali) | `getAnswer`、`getCorrect`、`getExerciseId`、`getGroupId`、`getQuestionId` |
| [AuthorizeLesson](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/exercise/AuthorizeLesson.smali) | `getCreateTime`、`getName`、`getUserId`、`getUserName`、`isAuthorized` |
| [ChoiceBean](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/exercise/ChoiceBean.smali) | `getShowStatus` |
| [ChoiceStatus](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/exercise/ChoiceStatus.smali) | `getEntries`、`valueOf`、`values` |
| [CompleteExerciseInput](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/exercise/CompleteExerciseInput.smali) | `getCatalogId`、`getCourseId`、`getExerciseId`、`getGroupId` |
| [ExerciseBean](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/exercise/ExerciseBean.smali) | `describeContents`、`getAvg`、`getCompleted`、`getExerciseId`、`getGroupId`、`getProgress`、`getQuestions` |
| [ExerciseInput](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/exercise/ExerciseInput.smali) | `getCatalogId`、`getCourseId`、`getGroupId` |
| [ExerciseType](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/exercise/ExerciseType.smali) | `getEntries`、`valueOf`、`values` |
| [GroupStatistic](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/exercise/GroupStatistic.smali) | `describeContents`、`getGroupId`、`getGroupName`、`getMembers`、`getQuestionGroups`、`writeToParcel` |
| [MicroAddInput](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/exercise/MicroAddInput.smali) | `getAttachment`、`getName`、`getQuestionGroupId`、`getQuestionId`、`getType` |
| [MicroBean](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/exercise/MicroBean.smali) | `getId`、`getName`、`getType`、`getUrl`、`snapshotUrl` |
| [MicroDeleteInput](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/exercise/MicroDeleteInput.smali) | `getId`、`getQuestionGroupId`、`getQuestionId` |
| [QuestionBean](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/exercise/QuestionBean.smali) | `screenWidthDp`、`describeContents`、`fetchAdaptAnalysis`、`fetchAdaptContent`、`getAdaptStandardAnswerStr`、`getAnalysis`、`getAnswerEx` |
| [QuestionExtra](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/exercise/QuestionExtra.smali) | `describeContents`、`getOptions`、`writeToParcel` |
| [QuestionGroupBean](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/exercise/QuestionGroupBean.smali) | `getId`、`getRounds`、`getTitle`、`getUpdateTime`、`setRounds` |
| [QuestionStatus](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/exercise/QuestionStatus.smali) | `getEntries`、`valueOf`、`values` |
| [QuestionType](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/exercise/QuestionType.smali) | `getEntries`、`valueOf`、`values` |
| [RoundBean](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/exercise/RoundBean.smali) | `getQuestionCount`、`getQuestions` |

## com.zykj.study.bean.teach

| 类 | 方法摘录 |
|---|---|
| [CatalogProgress](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/teach/CatalogProgress.smali) | `getCatalogId`、`getCatalogName`、`getGroupList`、`getSuperviseId` |
| [CatalogStudyProgress](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/teach/CatalogStudyProgress.smali) | `getCatalogId`、`getCatalogName`、`getGroupList`、`getSuperviseId` |
| [ChoiceChartData](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/teach/ChoiceChartData.smali) | `getName`、`getProgress`、`getShowName`、`getStudentList`、`isRight`、`isSelected` |
| [CourseBindBean](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/teach/CourseBindBean.smali) | `getId`、`getName`、`isBind`、`setBind` |
| [CourseProgress](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/teach/CourseProgress.smali) | `getCourseCover`、`getCourseId`、`getCourseName`、`getGroupProgress`、`getSuperviseId` |
| [GetQuizDetailBean](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/teach/GetQuizDetailBean.smali) | `getChoiceOptions`、`getCorrectAnswers`、`getId`、`getOptions`、`getQstType`、`getQuestionId`、`getStudentGroups` |
| [GroupMember](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/teach/GroupMember.smali) | `getCatalogs`、`getCourseCover`、`getCourseName`、`getGroupName`、`getProgress`、`getUserAvatar`、`getUserId` |
| [GroupMemberProgress](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/teach/GroupMemberProgress.smali) | `getCatalogs`、`getCompleted`、`getGroupId`、`getGroupName`、`getMembers` |
| [Member](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/teach/Member.smali) | `getGroupId`、`getUserId`、`getUserName` |
| [QuizScore](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/teach/QuizScore.smali) | `getGroupId`、`getSuperviseGroups`、`getTitle` |
| [QuizStatistic](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/teach/QuizStatistic.smali) | `getCatalogId`、`getSuperviseGroups`、`getSuperviseId` |
| [StatisticsGroupItem](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/teach/StatisticsGroupItem.smali) | `getCorrect`、`getProgress`、`getQuestionId`、`getStatus` |
| [StuQuizBean](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/teach/StuQuizBean.smali) | `getAnswerForStu`、`getAvg`、`getAvgRaw`、`getCompleteList`、`getCompleteNum`、`getGroupId`、`getGroupName` |
| [SuperviseBindCourseInput](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/teach/SuperviseBindCourseInput.smali) | `getCourseId`、`getSuperviseId` |
| [SuperviseGroup](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/teach/SuperviseGroup.smali) | `getAvg`、`getCompleted`、`getId`、`getMemberList`、`getMembers`、`getName`、`getProgress` |
| [SuperviseGroupMember](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/teach/SuperviseGroupMember.smali) | `getAvatar`、`getGroupId`、`getGroupName`、`getProgress`、`getScore`、`getStatus`、`getUserId` |
| [SuperviseGroupMemberProgress](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/teach/SuperviseGroupMemberProgress.smali) | `getAvatar`、`getGroupName`、`getProgress`、`getStatus`、`getUserId`、`getUserName` |
| [SuperviseGroupProgress](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/teach/SuperviseGroupProgress.smali) | `getId`、`getMemberList`、`getName`、`getProgress`、`setMemberList` |
| [SuperviseGroupRefreshInput](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/teach/SuperviseGroupRefreshInput.smali) | `getGroupId`、`getSuperviseId` |
| [SuperviseGroupRemoveInput](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/teach/SuperviseGroupRemoveInput.smali) | `getGroupId`、`getSuperviseId` |
| [SuperviseGroupSelectBean](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/teach/SuperviseGroupSelectBean.smali) | `getSuperviseGroup`、`getSuperviseGroupMember` |
| [TeachCourseAddInput](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/teach/TeachCourseAddInput.smali) | `getCourseId` |
| [TeachCourseRemoveInput](../../../android/优课畅学/smali_classes4/com/zykj/study/bean/teach/TeachCourseRemoveInput.smali) | `getSuperviseId` |

## com.zykj.study.data

| 类 | 方法摘录 |
|---|---|
| [AppDatabase](../../../android/优课畅学/smali_classes3/com/zykj/study/data/AppDatabase.smali) | `catalogEntityDao`、`courseStudyEntityDao`、`courseStudyKeyEntityDao`、`gradeEntityDao`、`myCourseEntityDao`、`myCourseKeyEntityDao`、`pdfDao` |
| [AppDatabase_Impl](../../../android/优课畅学/smali_classes3/com/zykj/study/data/AppDatabase_Impl.smali) | `catalogEntityDao`、`clearAllTables`、`courseStudyEntityDao`、`courseStudyKeyEntityDao`、`createAutoMigrations`、`createInvalidationTracker`、`createOpenDelegate` |
| [CatalogEntity](../../../android/优课畅学/smali_classes3/com/zykj/study/data/CatalogEntity.smali) | `getCourseId`、`getId`、`getParentId`、`getProgress`、`getTitle`、`isLeaf` |
| [CatalogEntityDao](../../../android/优课畅学/smali_classes3/com/zykj/study/data/CatalogEntityDao.smali) | `deleteAll`、`deleteByCatalogId`、`deleteByCourse`、`findCourse`、`insert`、`insert`、`updateCatalogTitle` |
| [CatalogEntityDao_Impl](../../../android/优课畅学/smali_classes3/com/zykj/study/data/CatalogEntityDao_Impl.smali) | `deleteAll`、`deleteByCatalogId`、`deleteByCourse`、`findCourse`、`insert`、`insert`、`updateCatalogTitle` |
| [Converters](../../../android/优课畅学/smali_classes3/com/zykj/study/data/Converters.smali) | `calendarToDateStamp`、`dateStampToCalendar`、`dateToLong`、`longToDate`、`sessionOrderTypeToString`、`stringToSessionOrderType` |
| [CourseStudyEntity](../../../android/优课畅学/smali_classes3/com/zykj/study/data/CourseStudyEntity.smali) | `getLearnTime`、`getProgress`、`getStudyUserId`、`getUserName`、`setLearnTime`、`setProgress`、`setStudyUserId` |
| [CourseStudyEntityDao](../../../android/优课畅学/smali_classes3/com/zykj/study/data/CourseStudyEntityDao.smali) | `deleteAll`、`deleteById`、`deleteByUserId`、`findByIdAndUserId`、`getCourseStudyList`、`insert`、`insert` |
| [CourseStudyEntityDao_Impl](../../../android/优课畅学/smali_classes3/com/zykj/study/data/CourseStudyEntityDao_Impl.smali) | `deleteAll`、`deleteById`、`deleteByUserId`、`findByIdAndUserId`、`getCourseStudyList`、`insert`、`insert` |
| [CourseStudyKeyEntity](../../../android/优课畅学/smali_classes3/com/zykj/study/data/CourseStudyKeyEntity.smali) | `describeContents`、`getId`、`getNextPage`、`getPageIndex`、`getUserId`、`setId`、`setNextPage` |
| [CourseStudyKeyEntityDao](../../../android/优课畅学/smali_classes3/com/zykj/study/data/CourseStudyKeyEntityDao.smali) | `deleteById`、`deleteByUserId`、`getKeyById`、`getKeyByUserId`、`insert`、`update` |
| [CourseStudyKeyEntityDao_Impl](../../../android/优课畅学/smali_classes3/com/zykj/study/data/CourseStudyKeyEntityDao_Impl.smali) | `deleteById`、`deleteByUserId`、`getKeyById`、`getKeyByUserId`、`insert`、`update` |
| [GradeEntity](../../../android/优课畅学/smali_classes3/com/zykj/study/data/GradeEntity.smali) | `describeContents`、`getId`、`getName`、`getParentId`、`setId`、`setName`、`setParentId` |
| [GradeEntityDao](../../../android/优课畅学/smali_classes3/com/zykj/study/data/GradeEntityDao.smali) | `deleteAll`、`getGradeById`、`getGradeByPeriodId`、`getList`、`insert` |
| [GradeEntityDao_Impl](../../../android/优课畅学/smali_classes3/com/zykj/study/data/GradeEntityDao_Impl.smali) | `deleteAll`、`getGradeById`、`getGradeByPeriodId`、`getList`、`insert` |
| [MyCourseEntity](../../../android/优课畅学/smali_classes3/com/zykj/study/data/MyCourseEntity.smali) | `describeContents`、`getSort`、`isSuperviser`、`setSort`、`setSuperviser`、`writeToParcel` |
| [MyCourseEntityDao](../../../android/优课畅学/smali_classes3/com/zykj/study/data/MyCourseEntityDao.smali) | `deleteAll`、`deleteByCourse`、`deleteByUserId`、`findCourse`、`getMyCourseList`、`insert`、`insert` |
| [MyCourseEntityDao_Impl](../../../android/优课畅学/smali_classes3/com/zykj/study/data/MyCourseEntityDao_Impl.smali) | `deleteAll`、`deleteByCourse`、`deleteByUserId`、`findCourse`、`getMyCourseList`、`insert`、`insert` |
| [MyCourseKeyEntity](../../../android/优课畅学/smali_classes3/com/zykj/study/data/MyCourseKeyEntity.smali) | `describeContents`、`getId`、`getNextStartId`、`getStartId`、`getTake`、`getUserId`、`setId` |
| [MyCourseKeyEntityDao](../../../android/优课畅学/smali_classes3/com/zykj/study/data/MyCourseKeyEntityDao.smali) | `deleteById`、`deleteByUserId`、`getKeyById`、`getKeyByUserId`、`insert`、`update` |
| [MyCourseKeyEntityDao_Impl](../../../android/优课畅学/smali_classes3/com/zykj/study/data/MyCourseKeyEntityDao_Impl.smali) | `deleteById`、`deleteByUserId`、`getKeyById`、`getKeyByUserId`、`insert`、`update` |
| [PdfDao](../../../android/优课畅学/smali_classes3/com/zykj/study/data/PdfDao.smali) | `insertPdf`、`queryPdf` |
| [PdfDao_Impl](../../../android/优课畅学/smali_classes3/com/zykj/study/data/PdfDao_Impl.smali) | `insertPdf`、`queryPdf` |
| [PdfEntity](../../../android/优课畅学/smali_classes3/com/zykj/study/data/PdfEntity.smali) | `getCurrentPage`、`getId`、`getPageCount` |
| [PeriodEntity](../../../android/优课畅学/smali_classes3/com/zykj/study/data/PeriodEntity.smali) | `describeContents`、`getId`、`getName`、`setId`、`setName`、`writeToParcel` |
| [PeriodEntityDao](../../../android/优课畅学/smali_classes3/com/zykj/study/data/PeriodEntityDao.smali) | `deleteAll`、`getList`、`getPeriodById`、`insert` |
| [PeriodEntityDao_Impl](../../../android/优课畅学/smali_classes3/com/zykj/study/data/PeriodEntityDao_Impl.smali) | `deleteAll`、`getList`、`getPeriodById`、`insert` |
| [SearchHistoryEntity](../../../android/优课畅学/smali_classes3/com/zykj/study/data/SearchHistoryEntity.smali) | `getCreateDate`、`getId`、`getSearchKey`、`getUserId` |
| [SearchHistoryEntityDao](../../../android/优课畅学/smali_classes3/com/zykj/study/data/SearchHistoryEntityDao.smali) | `delete`、`delete`、`deleteAll`、`getHistoryList`、`getList`、`insert` |
| [SearchHistoryEntityDao_Impl](../../../android/优课畅学/smali_classes3/com/zykj/study/data/SearchHistoryEntityDao_Impl.smali) | `delete`、`delete`、`deleteAll`、`getHistoryList`、`getList`、`insert` |
| [SubjectEntity](../../../android/优课畅学/smali_classes3/com/zykj/study/data/SubjectEntity.smali) | `describeContents`、`getId`、`getName`、`setId`、`setName`、`writeToParcel` |
| [SubjectEntityDao](../../../android/优课畅学/smali_classes3/com/zykj/study/data/SubjectEntityDao.smali) | `deleteAll`、`getList`、`getSubjectId`、`insert` |
| [SubjectEntityDao_Impl](../../../android/优课畅学/smali_classes3/com/zykj/study/data/SubjectEntityDao_Impl.smali) | `deleteAll`、`getList`、`getSubjectId`、`insert` |
| [a0](../../../android/优课畅学/smali_classes3/com/zykj/study/data/a0.smali) | `invoke` |
| [a1](../../../android/优课畅学/smali_classes3/com/zykj/study/data/a1.smali) | `invoke` |
| [b0](../../../android/优课畅学/smali_classes3/com/zykj/study/data/b0.smali) | `invoke` |
| [b1](../../../android/优课畅学/smali_classes3/com/zykj/study/data/b1.smali) | `invoke` |
| [c0](../../../android/优课畅学/smali_classes3/com/zykj/study/data/c0.smali) | `invoke` |
| [c1](../../../android/优课畅学/smali_classes3/com/zykj/study/data/c1.smali) | `invoke` |
| [d0](../../../android/优课畅学/smali_classes3/com/zykj/study/data/d0.smali) | `invoke` |
| [d1](../../../android/优课畅学/smali_classes3/com/zykj/study/data/d1.smali) | `invoke` |
| [e0](../../../android/优课畅学/smali_classes3/com/zykj/study/data/e0.smali) | `invoke` |
| [e1](../../../android/优课畅学/smali_classes3/com/zykj/study/data/e1.smali) | `invoke` |
| [f0](../../../android/优课畅学/smali_classes3/com/zykj/study/data/f0.smali) | `invoke` |
| [f1](../../../android/优课畅学/smali_classes3/com/zykj/study/data/f1.smali) | `invoke` |
| [g0](../../../android/优课畅学/smali_classes3/com/zykj/study/data/g0.smali) | `invoke` |
| [g1](../../../android/优课畅学/smali_classes3/com/zykj/study/data/g1.smali) | `invoke` |
| [h0](../../../android/优课畅学/smali_classes3/com/zykj/study/data/h0.smali) | `invoke` |
| [h1](../../../android/优课畅学/smali_classes3/com/zykj/study/data/h1.smali) | `invoke` |
| [i0](../../../android/优课畅学/smali_classes3/com/zykj/study/data/i0.smali) | `invoke` |
| [i1](../../../android/优课畅学/smali_classes3/com/zykj/study/data/i1.smali) | `invoke` |
| [j0](../../../android/优课畅学/smali_classes3/com/zykj/study/data/j0.smali) | `invoke` |
| [j1](../../../android/优课畅学/smali_classes3/com/zykj/study/data/j1.smali) | `invoke` |
| [k0](../../../android/优课畅学/smali_classes3/com/zykj/study/data/k0.smali) | `invoke` |
| [k1](../../../android/优课畅学/smali_classes3/com/zykj/study/data/k1.smali) | `invoke` |
| [l0](../../../android/优课畅学/smali_classes3/com/zykj/study/data/l0.smali) | `invoke` |
| [l1](../../../android/优课畅学/smali_classes3/com/zykj/study/data/l1.smali) | `invoke` |
| [m0](../../../android/优课畅学/smali_classes3/com/zykj/study/data/m0.smali) | `invoke` |
| [m1](../../../android/优课畅学/smali_classes3/com/zykj/study/data/m1.smali) | `invoke` |
| [n0](../../../android/优课畅学/smali_classes3/com/zykj/study/data/n0.smali) | `invoke` |
| [n1](../../../android/优课畅学/smali_classes3/com/zykj/study/data/n1.smali) | `invoke` |
| [o0](../../../android/优课畅学/smali_classes3/com/zykj/study/data/o0.smali) | `invoke` |
| [o1](../../../android/优课畅学/smali_classes3/com/zykj/study/data/o1.smali) | `invoke` |
| [p0](../../../android/优课畅学/smali_classes3/com/zykj/study/data/p0.smali) | `invoke` |
| [p1](../../../android/优课畅学/smali_classes3/com/zykj/study/data/p1.smali) | `invoke` |
| [q0](../../../android/优课畅学/smali_classes3/com/zykj/study/data/q0.smali) | `invoke` |
| [r0](../../../android/优课畅学/smali_classes3/com/zykj/study/data/r0.smali) | `invoke` |
| [s0](../../../android/优课畅学/smali_classes3/com/zykj/study/data/s0.smali) | `invoke` |
| [t0](../../../android/优课畅学/smali_classes3/com/zykj/study/data/t0.smali) | `invoke` |
| [u0](../../../android/优课畅学/smali_classes3/com/zykj/study/data/u0.smali) | `invoke` |
| [v0](../../../android/优课畅学/smali_classes3/com/zykj/study/data/v0.smali) | `invoke` |
| [w0](../../../android/优课畅学/smali_classes3/com/zykj/study/data/w0.smali) | `invoke` |
| [x0](../../../android/优课畅学/smali_classes3/com/zykj/study/data/x0.smali) | `invoke` |
| [y0](../../../android/优课畅学/smali_classes3/com/zykj/study/data/y0.smali) | `invoke` |
| [z0](../../../android/优课畅学/smali_classes3/com/zykj/study/data/z0.smali) | `invoke` |

## com.zykj.study.dialog

| 类 | 方法摘录 |
|---|---|
| [CatalogDialog](../../../android/优课畅学/smali_classes3/com/zykj/study/dialog/CatalogDialog.smali) | `initView`、`layoutId` |
| [CatalogDialogArgs](../../../android/优课畅学/smali_classes3/com/zykj/study/dialog/CatalogDialogArgs.smali) | `fromBundle` |
| [DateSelectedDialog](../../../android/优课畅学/smali_classes3/com/zykj/study/dialog/DateSelectedDialog.smali) | `initView`、`layoutId` |
| [DateSelectedDialogArgs](../../../android/优课畅学/smali_classes3/com/zykj/study/dialog/DateSelectedDialogArgs.smali) | `fromBundle` |
| [DeleteSubscribeBatchDialog](../../../android/优课畅学/smali_classes3/com/zykj/study/dialog/DeleteSubscribeBatchDialog.smali) | `initView`、`layoutId` |
| [DeleteSubscribeBatchDialogArgs](../../../android/优课畅学/smali_classes3/com/zykj/study/dialog/DeleteSubscribeBatchDialogArgs.smali) | `fromBundle` |
| [DeleteSubscribeSingleDialog](../../../android/优课畅学/smali_classes3/com/zykj/study/dialog/DeleteSubscribeSingleDialog.smali) | `initView`、`layoutId` |
| [DeleteSubscribeSingleDialogArgs](../../../android/优课畅学/smali_classes3/com/zykj/study/dialog/DeleteSubscribeSingleDialogArgs.smali) | `fromBundle` |
| [ExerciseFinishDetailFragment](../../../android/优课畅学/smali_classes3/com/zykj/study/dialog/ExerciseFinishDetailFragment.smali) | `initView`、`layoutId` |
| [ExerciseFinishDialog](../../../android/优课畅学/smali_classes3/com/zykj/study/dialog/ExerciseFinishDialog.smali) | `initView`、`layoutId` |
| [Hilt_CatalogDialog](../../../android/优课畅学/smali_classes3/com/zykj/study/dialog/Hilt_CatalogDialog.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_ShowBigImageDialog](../../../android/优课畅学/smali_classes3/com/zykj/study/dialog/Hilt_ShowBigImageDialog.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_UpdateChoiceDialogMain](../../../android/优课畅学/smali_classes3/com/zykj/study/dialog/Hilt_UpdateChoiceDialogMain.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [ShowBigImageDialog](../../../android/优课畅学/smali_classes3/com/zykj/study/dialog/ShowBigImageDialog.smali) | `initView`、`layoutId`、`onActivityCreated` |
| [ShowBigImageDialogArgs](../../../android/优课畅学/smali_classes3/com/zykj/study/dialog/ShowBigImageDialogArgs.smali) | `fromBundle` |
| [UpdateChoiceDialogMain](../../../android/优课畅学/smali_classes3/com/zykj/study/dialog/UpdateChoiceDialogMain.smali) | `initView`、`layoutId` |
| [UpdateChoiceDialogMainArgs](../../../android/优课畅学/smali_classes3/com/zykj/study/dialog/UpdateChoiceDialogMainArgs.smali) | `fromBundle` |

## com.zykj.study.proto

| 类 | 方法摘录 |
|---|---|
| [Settings](../../../android/优课畅学/smali_classes3/com/zykj/study/proto/Settings.smali) | `clearCachePageIndex`、`clearCachePagePositionOffset`、`getDefaultInstance`、`newBuilder`、`newBuilder`、`parseDelimitedFrom`、`parseDelimitedFrom` |
| [SettingsOrBuilder](../../../android/优课畅学/smali_classes3/com/zykj/study/proto/SettingsOrBuilder.smali) | `getCachePageIndex`、`getCachePagePositionOffset` |
| [SettingsOuterClass](../../../android/优课畅学/smali_classes3/com/zykj/study/proto/SettingsOuterClass.smali) | `registerAllExtensions` |

## com.zykj.study.provide

| 类 | 方法摘录 |
|---|---|
| [ClientCodeInterceptor](../../../android/优课畅学/smali_classes3/com/zykj/study/provide/ClientCodeInterceptor.smali) | `getClientCodeLiveData`、`intercept`、`setClientCodeLiveData` |
| [OkHttpClientProvide](../../../android/优课畅学/smali_classes3/com/zykj/study/provide/OkHttpClientProvide.smali) | `provideAuthOkHttpClient`、`provideCommonOkHttpClient`、`provideCommonResponseOkHttpClient`、`provideHeaderBeanFlow`、`provideLessonDeauthorizedFlow`、`provideRefreshTokenOkHttpClient`、`provideResponseOkHttpClient` |
| [ResponseRefreshTokenInterceptor](../../../android/优课畅学/smali_classes3/com/zykj/study/provide/ResponseRefreshTokenInterceptor.smali) | `parseJson`、`reBuildResponse`、`refreshTokenAndContinueRequest`、`getRefreshRepository`、`getUnauthorizedFlow`、`intercept`、`setRefreshRepository` |
| [SettingsSerializer](../../../android/优课畅学/smali_classes3/com/zykj/study/provide/SettingsSerializer.smali) | `getDefaultValue`、`readFrom`、`writeTo` |

## com.zykj.study.repository

| 类 | 方法摘录 |
|---|---|
| [CourseRemoteMediator](../../../android/优课畅学/smali_classes3/com/zykj/study/repository/CourseRemoteMediator.smali) | `getRefreshKey`、`getRefreshKey` |
| [CourseSearchMediator](../../../android/优课畅学/smali_classes3/com/zykj/study/repository/CourseSearchMediator.smali) | `getRefreshKey`、`getRefreshKey` |
| [FreeSubscribeSource](../../../android/优课畅学/smali_classes3/com/zykj/study/repository/FreeSubscribeSource.smali) | `getRefreshKey`、`getRefreshKey` |
| [TeachCourseRemoteMediator](../../../android/优课畅学/smali_classes3/com/zykj/study/repository/TeachCourseRemoteMediator.smali) | `getRefreshKey`、`getRefreshKey` |

## com.zykj.study.ui

| 类 | 方法摘录 |
|---|---|
| [GuideFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/GuideFragment.smali) | `initData`、`initView`、`layoutId` |
| [Hilt_GuideFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/Hilt_GuideFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_ImageFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/Hilt_ImageFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_MainActivity](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/Hilt_MainActivity.smali) | `generatedComponent`、`getDefaultViewModelProviderFactory`、`onCreate`、`onDestroy` |
| [Hilt_MainFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/Hilt_MainFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_OpenFileFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/Hilt_OpenFileFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_PdfFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/Hilt_PdfFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [ImageFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/ImageFragment.smali) | `initView`、`layoutId` |
| [ImageFragmentArgs](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/ImageFragmentArgs.smali) | `fromBundle` |
| [MainActivity](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/MainActivity.smali) | `initData`、`initView`、`layoutId`、`onDestroy`、`onSupportNavigateUp` |
| [MainFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/MainFragment.smali) | `initData`、`initView`、`layoutId` |
| [OpenFileFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/OpenFileFragment.smali) | `initView`、`layoutId` |
| [OpenFileFragmentArgs](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/OpenFileFragmentArgs.smali) | `fromBundle` |
| [PdfFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/PdfFragment.smali) | `initView`、`layoutId` |
| [PdfFragmentArgs](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/PdfFragmentArgs.smali) | `fromBundle` |
| [SuperPlayerActivity](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/SuperPlayerActivity.smali) | `onClick`、`onCreate`、`onDestroy`、`onPause`、`onResume` |

## com.zykj.study.ui.home

| 类 | 方法摘录 |
|---|---|
| [Hilt_HomeFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/Hilt_HomeFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [HomeFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/HomeFragment.smali) | `initData`、`initView`、`layoutId`、`onDestroy`、`onDestroyView` |

## com.zykj.study.ui.home.exercise

| 类 | 方法摘录 |
|---|---|
| [ExerciseFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/ExerciseFragment.smali) | `initData`、`initView`、`layoutId` |
| [ExerciseFragmentArgs](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/ExerciseFragmentArgs.smali) | `fromBundle` |
| [ExerciseHistoryFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/ExerciseHistoryFragment.smali) | `initData`、`initView`、`layoutId`、`onDestroyView` |
| [ExerciseHistoryFragmentArgs](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/ExerciseHistoryFragmentArgs.smali) | `fromBundle` |
| [ExerciseHistoryStudentFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment.smali) | `initData`、`initView`、`layoutId`、`onDestroyView` |
| [ExerciseHistoryStudentFragmentArgs](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragmentArgs.smali) | `fromBundle` |
| [ExerciseTrainFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/ExerciseTrainFragment.smali) | `initData`、`initView`、`layoutId` |
| [ExerciseTrainFragmentArgs](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/ExerciseTrainFragmentArgs.smali) | `fromBundle` |
| [ExerciseViewerFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/ExerciseViewerFragment.smali) | `initData`、`initView`、`layoutId`、`onDestroyView` |
| [ExerciseViewerFragmentArgs](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs.smali) | `fromBundle` |
| [Hilt_ExerciseFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/Hilt_ExerciseFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_ExerciseHistoryFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/Hilt_ExerciseHistoryFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_ExerciseHistoryStudentFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/Hilt_ExerciseHistoryStudentFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_ExerciseTrainFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/Hilt_ExerciseTrainFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_ExerciseViewerFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/Hilt_ExerciseViewerFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_MicroCropExtraFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/Hilt_MicroCropExtraFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_MicroEditFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/Hilt_MicroEditFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [MicroCropExtraFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/MicroCropExtraFragment.smali) | `initView`、`layoutId` |
| [MicroEditFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/MicroEditFragment.smali) | `initData`、`initView`、`layoutId`、`onDestroy` |
| [MicroEditFragmentArgs](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/MicroEditFragmentArgs.smali) | `fromBundle` |

## com.zykj.study.ui.home.exercise.train

| 类 | 方法摘录 |
|---|---|
| [AnswerAreaFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/train/AnswerAreaFragment.smali) | `initData`、`initView`、`layoutId` |
| [AnswerFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/train/AnswerFragment.smali) | `initData`、`initView`、`layoutId` |
| [AnswerFragmentArgs](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/train/AnswerFragmentArgs.smali) | `fromBundle` |
| [AnswerResultFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/train/AnswerResultFragment.smali) | `initData`、`initView`、`layoutId`、`onDestroyView` |
| [Hilt_AnswerAreaFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/train/Hilt_AnswerAreaFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_AnswerFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/train/Hilt_AnswerFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_AnswerResultFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/train/Hilt_AnswerResultFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_MicroPlayDialogFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/train/Hilt_MicroPlayDialogFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_MultipleChoiceFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/train/Hilt_MultipleChoiceFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_MultipleChoiceResultFailFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/train/Hilt_MultipleChoiceResultFailFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_MultipleChoiceResultSuccessFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/train/Hilt_MultipleChoiceResultSuccessFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_SingleChoiceFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/train/Hilt_SingleChoiceFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_SingleChoiceResultFailFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/train/Hilt_SingleChoiceResultFailFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_SingleChoiceResultSuccessFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/train/Hilt_SingleChoiceResultSuccessFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [MicroPlayDialogFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/train/MicroPlayDialogFragment.smali) | `initView`、`layoutId`、`onActivityCreated` |
| [MicroPlayDialogFragmentArgs](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/train/MicroPlayDialogFragmentArgs.smali) | `fromBundle` |
| [MultipleChoiceFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/train/MultipleChoiceFragment.smali) | `initData`、`initView`、`layoutId` |
| [MultipleChoiceFragmentArgs](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/train/MultipleChoiceFragmentArgs.smali) | `fromBundle` |
| [MultipleChoiceResultFailFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/train/MultipleChoiceResultFailFragment.smali) | `initData`、`initView`、`layoutId`、`onDestroyView` |
| [MultipleChoiceResultFailFragmentArgs](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/train/MultipleChoiceResultFailFragmentArgs.smali) | `fromBundle` |
| [MultipleChoiceResultSuccessFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment.smali) | `initData`、`initView`、`layoutId`、`onDestroyView` |
| [SingleChoiceFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/train/SingleChoiceFragment.smali) | `initData`、`initView`、`layoutId` |
| [SingleChoiceFragmentArgs](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/train/SingleChoiceFragmentArgs.smali) | `fromBundle` |
| [SingleChoiceResultFailFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragment.smali) | `initData`、`initView`、`layoutId`、`onDestroyView` |
| [SingleChoiceResultFailFragmentArgs](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/train/SingleChoiceResultFailFragmentArgs.smali) | `fromBundle` |
| [SingleChoiceResultSuccessFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/train/SingleChoiceResultSuccessFragment.smali) | `initData`、`initView`、`layoutId`、`onDestroyView` |

## com.zykj.study.ui.home.find

| 类 | 方法摘录 |
|---|---|
| [CourseDetailsFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/find/CourseDetailsFragment.smali) | `initData`、`initView`、`layoutId` |
| [CourseDetailsFragmentArgs](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/find/CourseDetailsFragmentArgs.smali) | `fromBundle` |
| [CourseFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/find/CourseFragment.smali) | `initData`、`initView`、`layoutId` |
| [FindFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/find/FindFragment.smali) | `initData`、`initView`、`layoutId` |
| [Hilt_CourseDetailsFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/find/Hilt_CourseDetailsFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_CourseFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/find/Hilt_CourseFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_FindFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/find/Hilt_FindFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_MicroCodeFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/find/Hilt_MicroCodeFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_MicroPlayFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/find/Hilt_MicroPlayFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [MicroCodeFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/find/MicroCodeFragment.smali) | `initData`、`initView`、`layoutId` |
| [MicroCodeFragmentArgs](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/find/MicroCodeFragmentArgs.smali) | `fromBundle` |
| [MicroCropFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/find/MicroCropFragment.smali) | `initData`、`initView`、`layoutId` |
| [MicroCropFragmentArgs](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/find/MicroCropFragmentArgs.smali) | `fromBundle` |
| [MicroPlayFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/find/MicroPlayFragment.smali) | `initView`、`layoutId` |
| [MicroPlayFragmentArgs](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/find/MicroPlayFragmentArgs.smali) | `fromBundle` |

## com.zykj.study.ui.home.find.search

| 类 | 方法摘录 |
|---|---|
| [Hilt_SearchFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/find/search/Hilt_SearchFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_SearchHistoryFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/find/search/Hilt_SearchHistoryFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_SearchResultFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/find/search/Hilt_SearchResultFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [SearchFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/find/search/SearchFragment.smali) | `initData`、`initView`、`layoutId`、`onDestroy`、`onDestroyView` |
| [SearchHistoryFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/find/search/SearchHistoryFragment.smali) | `initData`、`initView`、`layoutId` |
| [SearchResultFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/find/search/SearchResultFragment.smali) | `initData`、`initView`、`layoutId` |

## com.zykj.study.ui.home.message

| 类 | 方法摘录 |
|---|---|
| [Hilt_MessageFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/message/Hilt_MessageFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [MessageFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/message/MessageFragment.smali) | `initView`、`layoutId` |

## com.zykj.study.ui.home.my

| 类 | 方法摘录 |
|---|---|
| [AuthorizedLessonFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/AuthorizedLessonFragment.smali) | `onCreateView`、`onViewCreated` |
| [AuthorizedLessonFragmentArgs](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/AuthorizedLessonFragmentArgs.smali) | `fromBundle` |
| [CourseContentFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/CourseContentFragment.smali) | `initData`、`initView`、`layoutId`、`onDestroyView` |
| [CourseContentFragmentArgs](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/CourseContentFragmentArgs.smali) | `fromBundle` |
| [CourseManageDialogFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/CourseManageDialogFragment.smali) | `initData`、`initView`、`layoutId` |
| [CourseManageDialogFragmentArgs](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/CourseManageDialogFragmentArgs.smali) | `fromBundle` |
| [CourseViewCatalogFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/CourseViewCatalogFragment.smali) | `initData`、`initView`、`layoutId` |
| [CourseViewFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/CourseViewFragment.smali) | `initData`、`initView`、`layoutId` |
| [CourseViewStatisticsFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/CourseViewStatisticsFragment.smali) | `initView`、`layoutId` |
| [EditCourseFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/EditCourseFragment.smali) | `initData`、`initView`、`layoutId`、`onDestroyView` |
| [EditCourseFragmentArgs](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/EditCourseFragmentArgs.smali) | `fromBundle` |
| [EditUserFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/EditUserFragment.smali) | `initView`、`layoutId` |
| [ExerciseStatisticsFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/ExerciseStatisticsFragment.smali) | `initView`、`layoutId` |
| [ExerciseStatisticsFragmentArgs](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs.smali) | `fromBundle` |
| [ExerciseStatisticsResultFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/ExerciseStatisticsResultFragment.smali) | `initView`、`layoutId` |
| [ExerciseStatisticsSingleDetailFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/ExerciseStatisticsSingleDetailFragment.smali) | `initView`、`layoutId` |
| [Hilt_AuthorizedLessonFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/Hilt_AuthorizedLessonFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_CourseContentFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/Hilt_CourseContentFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_CourseManageDialogFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/Hilt_CourseManageDialogFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_CourseViewCatalogFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/Hilt_CourseViewCatalogFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_CourseViewFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/Hilt_CourseViewFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_CourseViewStatisticsFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/Hilt_CourseViewStatisticsFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_EditCourseFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/Hilt_EditCourseFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_EditUserFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/Hilt_EditUserFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_ExerciseStatisticsFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/Hilt_ExerciseStatisticsFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_ExerciseStatisticsResultFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/Hilt_ExerciseStatisticsResultFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_ManagementSubscribeFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/Hilt_ManagementSubscribeFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_MyCourseDetailsFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/Hilt_MyCourseDetailsFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_MyCourseFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/Hilt_MyCourseFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_MyFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/Hilt_MyFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_SettingFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/Hilt_SettingFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_StudentExercisesFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/Hilt_StudentExercisesFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_StudentViewContentFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/Hilt_StudentViewContentFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_StudentViewFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/Hilt_StudentViewFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_StudentViewMemberFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/Hilt_StudentViewMemberFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_TeachCourseAddFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/Hilt_TeachCourseAddFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_TeachDetailsFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/Hilt_TeachDetailsFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_TeacherFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/Hilt_TeacherFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [ManagementSubscribeFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/ManagementSubscribeFragment.smali) | `initData`、`initView`、`layoutId` |
| [ManagementSubscribeFragmentArgs](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/ManagementSubscribeFragmentArgs.smali) | `fromBundle` |
| [MyCourseDetailsFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/MyCourseDetailsFragment.smali) | `initData`、`initView`、`layoutId`、`onDestroyView` |
| [MyCourseDetailsFragmentArgs](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/MyCourseDetailsFragmentArgs.smali) | `fromBundle` |
| [MyCourseFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/MyCourseFragment.smali) | `initData`、`initView`、`layoutId` |
| [MyFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/MyFragment.smali) | `initData`、`initView`、`layoutId` |
| [SettingFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/SettingFragment.smali) | `initView`、`layoutId` |
| [StudentExercisesFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/StudentExercisesFragment.smali) | `initData`、`initView`、`layoutId`、`onDestroy` |
| [StudentExercisesFragmentArgs](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/StudentExercisesFragmentArgs.smali) | `fromBundle` |
| [StudentViewContentFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/StudentViewContentFragment.smali) | `initData`、`initView`、`layoutId` |
| [StudentViewFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/StudentViewFragment.smali) | `initData`、`initView`、`layoutId` |
| [StudentViewMemberFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/StudentViewMemberFragment.smali) | `initData`、`initView`、`layoutId`、`onDestroyView` |
| [TeachCourseAddFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/TeachCourseAddFragment.smali) | `initData`、`initView`、`layoutId` |
| [TeachDetailsFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/TeachDetailsFragment.smali) | `initData`、`initView`、`layoutId` |
| [TeachDetailsFragmentArgs](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/TeachDetailsFragmentArgs.smali) | `fromBundle` |
| [TeacherFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/TeacherFragment.smali) | `initData`、`initView`、`layoutId` |

## com.zykj.study.ui.home.study

| 类 | 方法摘录 |
|---|---|
| [Hilt_StudyFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/study/Hilt_StudyFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_StudyListFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/study/Hilt_StudyListFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [Hilt_StudyProgressFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/study/Hilt_StudyProgressFragment.smali) | `createComponentManager`、`generatedComponent`、`getContext`、`getDefaultViewModelProviderFactory`、`inject`、`onAttach`、`onAttach` |
| [StudyFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/study/StudyFragment.smali) | `initView`、`layoutId` |
| [StudyListFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/study/StudyListFragment.smali) | `initData`、`initView`、`layoutId` |
| [StudyProgressFragment](../../../android/优课畅学/smali_classes5/com/zykj/study/ui/home/study/StudyProgressFragment.smali) | `initData`、`initView`、`layoutId` |

## com.zykj.study.utils

| 类 | 方法摘录 |
|---|---|
| [AppContext](../../../android/优课畅学/smali_classes5/com/zykj/study/utils/AppContext.smali) | `valueOf`、`values` |
| [ChoiceList](../../../android/优课畅学/smali_classes5/com/zykj/study/utils/ChoiceList.smali) | `contains`、`contains`、`indexOf`、`lastIndexOf`、`remove` |
| [CommonDecoration](../../../android/优课畅学/smali_classes5/com/zykj/study/utils/CommonDecoration.smali) | `getItemOffsets` |
| [CustomIndication](../../../android/优课畅学/smali_classes5/com/zykj/study/utils/CustomIndication.smali) | `create`、`rememberUpdatedInstance` |
| [GamItemTouchCallback](../../../android/优课畅学/smali_classes5/com/zykj/study/utils/GamItemTouchCallback.smali) | `clearView`、`getMovementFlags`、`getSwipeEscapeVelocity`、`getSwipeThreshold`、`onChildDraw`、`onMove`、`onSelectedChanged` |

## com.zykj.study.view

| 类 | 方法摘录 |
|---|---|
| [CustomWebView](../../../android/优课畅学/smali_classes5/com/zykj/study/view/CustomWebView.smali) | `setWhiteHostList` |
| [CustomX5WebView](../../../android/优课畅学/smali_classes5/com/zykj/study/view/CustomX5WebView.smali) | `onVisibilityChanged`、`resize`、`setAutoHeight`、`setMaxHeight`、`setWhiteHostList` |
| [KnowledgeCompleteView](../../../android/优课畅学/smali_classes5/com/zykj/study/view/KnowledgeCompleteView.smali) | `setKnowLedge`、`setKnowLedgeClickListener`、`setProgressClickListener`、`setSelectCatalogId`、`setTotalMember` |
| [KnowledgeProgressView](../../../android/优课畅学/smali_classes5/com/zykj/study/view/KnowledgeProgressView.smali) | `setKnowLedgeClickListener` |
| [KnowledgeView](../../../android/优课畅学/smali_classes5/com/zykj/study/view/KnowledgeView.smali) | `setKnowLedge`、`setKnowLedgeClickListener` |
| [MultipleChoiceAnimationView](../../../android/优课畅学/smali_classes5/com/zykj/study/view/MultipleChoiceAnimationView.smali) | `setAnswerList`、`setItemClickListener`、`setOptionList`、`setRightOptionList`、`setSelectedIndex` |
| [MultipleChoiceView](../../../android/优课畅学/smali_classes5/com/zykj/study/view/MultipleChoiceView.smali) | `setAnswerList`、`setItemClickListener`、`setJudgingStatus`、`setOptionList`、`setRightOptionList` |
| [MultipleStatusView](../../../android/优课畅学/smali_classes5/com/zykj/study/view/MultipleStatusView.smali) | `getContentView`、`getEmptyView`、`getErrorView`、`getLoadingView`、`getNoNetworkView`、`getViewStatus`、`onDetachedFromWindow` |
| [SpecialToastView](../../../android/优课畅学/smali_classes5/com/zykj/study/view/SpecialToastView.smali) | `getToastLiveData`、`setToastLiveData` |

## com.zykj.study.view.itemtouchhelper

| 类 | 方法摘录 |
|---|---|
| [ItemTouchHelper](../../../android/优课畅学/smali_classes5/com/zykj/study/view/itemtouchhelper/ItemTouchHelper.smali) | `addChildDrawingOrderCallback`、`getItemOffsets`、`getSelectedDxDy`、`hasRunningRecoverAnim`、`onChildViewAttachedToWindow`、`onChildViewDetachedFromWindow`、`onDraw` |
| [ItemTouchUIUtilImpl](../../../android/优课畅学/smali_classes5/com/zykj/study/view/itemtouchhelper/ItemTouchUIUtilImpl.smali) | `clearView`、`onDraw`、`onDrawOver`、`onSelected` |

## com.zykj.utils

| 类 | 方法摘录 |
|---|---|
| [AppUtils](../../../android/优课畅学/smali_classes5/com/zykj/utils/AppUtils.smali) | `valueOf`、`values` |

## com.zykj.video.play

| 类 | 方法摘录 |
|---|---|
| [SuperPlayerView](../../../android/优课畅学/smali_classes5/com/zykj/video/play/SuperPlayerView.smali) | `finalize`、`getPlayMode`、`getPlayState`、`onNetStatus`、`onNetStatus`、`onPlayEvent`、`onPlayEvent` |

## com.zykj.video.play.controller

| 类 | 方法摘录 |
|---|---|
| [TCControllerFloat](../../../android/优课畅学/smali_classes5/com/zykj/video/play/controller/TCControllerFloat.smali) | `getStatusBarHeight`、`getFloatVideoView`、`onClick`、`onTouchEvent`、`setBackground`、`setCallback`、`setVideoQualityList` |
| [TCControllerFullScreen](../../../android/优课畅学/smali_classes5/com/zykj/video/play/controller/TCControllerFullScreen.smali) | `setThumbnail`、`getSpeed`、`onClick`、`onTouchEvent`、`setBackground`、`setCallback`、`setVideoQualityList` |
| [TCControllerWindow](../../../android/优课畅学/smali_classes5/com/zykj/video/play/controller/TCControllerWindow.smali) | `onClick`、`onItemSelected`、`onNothingSelected`、`onTouchEvent`、`setBackground`、`setCallback`、`setVideoQualityList` |

## com.zykj.video.play.view

| 类 | 方法摘录 |
|---|---|
| [TCPointSeekBar](../../../android/优课畅学/smali_classes5/com/zykj/video/play/view/TCPointSeekBar.smali) | `getMax`、`getProgress`、`onDraw`、`onSizeChanged`、`onTouchEvent`、`setMax`、`setOnPointClickListener` |
| [TCVideoProgressLayout](../../../android/优课畅学/smali_classes5/com/zykj/video/play/view/TCVideoProgressLayout.smali) | `setDuration`、`setProgress`、`setProgressVisibility`、`setThumbnail`、`setTimeText` |
| [TCVodMoreView](../../../android/优课畅学/smali_classes5/com/zykj/video/play/view/TCVodMoreView.smali) | `onCheckedChanged`、`onCheckedChanged`、`setCallback`、`setVisibility` |
| [TCVodQualityView](../../../android/优课畅学/smali_classes5/com/zykj/video/play/view/TCVodQualityView.smali) | `setCallback`、`setDefaultSelectedQuality`、`setVideoQualityList` |
| [TCVolumeBrightnessProgressLayout](../../../android/优课畅学/smali_classes5/com/zykj/video/play/view/TCVolumeBrightnessProgressLayout.smali) | `setDuration`、`setImageResource`、`setProgress` |

## com.zykj.view

| 类 | 方法摘录 |
|---|---|
| [DataBinderMapperImpl](../../../android/优课畅学/smali_classes5/com/zykj/view/DataBinderMapperImpl.smali) | `collectDependencies`、`convertBrIdToString`、`getDataBinder`、`getDataBinder`、`getLayoutId` |

## com.zykj.view.board.board

| 类 | 方法摘录 |
|---|---|
| [BoardFragment](../../../android/优课畅学/smali_classes5/com/zykj/view/board/board/BoardFragment.smali) | `onCreateView`、`onDestroyView`、`onViewCreated` |

## com.zykj.view.board.crop

| 类 | 方法摘录 |
|---|---|
| [BlackboardCropFragment](../../../android/优课畅学/smali_classes5/com/zykj/view/board/crop/BlackboardCropFragment.smali) | `onActivityCreated`、`onCreateView`、`onDestroyView`、`onHiddenChanged`、`onPause`、`onResume`、`setUserVisibleHint` |

## com.zykj.view.board.evaluation

| 类 | 方法摘录 |
|---|---|
| [BlackboardEvaluationFragment](../../../android/优课畅学/smali_classes5/com/zykj/view/board/evaluation/BlackboardEvaluationFragment.smali) | `onCreate`、`onCreateView`、`onDestroyView`、`onViewCreated` |

## com.zykj.view.board.play

| 类 | 方法摘录 |
|---|---|
| [PlaySettingAdapter](../../../android/优课畅学/smali_classes5/com/zykj/view/board/play/PlaySettingAdapter.smali) | `getItemCount`、`onBindViewHolder`、`onCreateViewHolder` |
| [SketchPlayFragment](../../../android/优课畅学/smali_classes5/com/zykj/view/board/play/SketchPlayFragment.smali) | `onCreateView`、`onDestroyView`、`onHiddenChanged`、`onPause`、`onResume`、`onViewCreated`、`setUserVisibleHint` |
| [SpeedRateAdapter](../../../android/优课畅学/smali_classes5/com/zykj/view/board/play/SpeedRateAdapter.smali) | `onBindViewHolder`、`onCreateViewHolder` |

## com.zykj.view.board.simple

| 类 | 方法摘录 |
|---|---|
| [SimpleFragment](../../../android/优课畅学/smali_classes5/com/zykj/view/board/simple/SimpleFragment.smali) | `onCreateView`、`onViewCreated` |

## com.zykj.view.simpleBoard

| 类 | 方法摘录 |
|---|---|
| [SimpleBoardView](../../../android/优课畅学/smali_classes5/com/zykj/view/simpleBoard/SimpleBoardView.smali) | `getImageBackground`、`getSimpleBoardConfig`、`onMeasure`、`onTouchEvent`、`setActonMode`、`setImageBackground`、`setOnActionListener` |

## com.zykj.view.ui.camera

| 类 | 方法摘录 |
|---|---|
| [EzyCameraActivity](../../../android/优课畅学/smali_classes5/com/zykj/view/ui/camera/EzyCameraActivity.smali) | `onCreate` |
| [ImagePickFragment](../../../android/优课畅学/smali_classes5/com/zykj/view/ui/camera/ImagePickFragment.smali) | `bindCameraUseCases`、`onCreateView`、`onResume`、`onViewCreated`、`requestCameraPermission`、`setUpCamera`、`startCamera` |

## com.zykj.view.ui.crop

| 类 | 方法摘录 |
|---|---|
| [EzyCropActivity](../../../android/优课畅学/smali_classes5/com/zykj/view/ui/crop/EzyCropActivity.smali) | `onCreate` |

## com.zykj.view.utils

| 类 | 方法摘录 |
|---|---|
| [ProtoPath](../../../android/优课畅学/smali_classes5/com/zykj/view/utils/ProtoPath.smali) | `getPaint`、`getPointList` |
| [ZoomPointSolution](../../../android/优课畅学/smali_classes5/com/zykj/view/utils/ZoomPointSolution.smali) | `valueOf`、`values` |

## com.zykj.view.widget

| 类 | 方法摘录 |
|---|---|
| [DoubleSeekBar](../../../android/优课畅学/smali_classes5/com/zykj/view/widget/DoubleSeekBar.smali) | `getBarSize`、`getKeyPointColor`、`getKeyPointList`、`getMaskChangeListener`、`getMaskColor`、`getMaskProgress`、`getMax` |
| [SketchProgressView](../../../android/优课畅学/smali_classes5/com/zykj/view/widget/SketchProgressView.smali) | `getViewCrossLength`、`getViewMainLength`、`getOrientation`、`getProgress`、`getProgressListener`、`getThumbTime`、`onDetachedFromWindow` |
| [TouchSwitchView](../../../android/优课畅学/smali_classes5/com/zykj/view/widget/TouchSwitchView.smali) | `onInterceptTouchEvent`、`setCanTouch` |
