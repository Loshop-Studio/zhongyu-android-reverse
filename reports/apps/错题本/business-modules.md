# 错题本 业务代码导航

每个表格对应一个保留业务命名空间的包，方法来自 DEX 的类定义。点击类名可查看参与编译的实现。生成绑定、单字母类及第三方库另见完整包索引。

## com.zykj.blackboard.bean

| 类 | 方法摘录 |
|---|---|
| [Author](../../../android/错题本/smali_classes3/com/zykj/blackboard/bean/Author.smali) | `getAuthorId`、`getAuthorName`、`getSchoolId`、`setAuthorId`、`setAuthorName`、`setSchoolId` |
| [BackgroundLineConfig](../../../android/错题本/smali_classes3/com/zykj/blackboard/bean/BackgroundLineConfig.smali) | `getLineColor`、`getLineSpace`、`getLineType`、`getLineWidth`、`setLineColor`、`setLineSpace`、`setLineType` |
| [BoardConfig](../../../android/错题本/smali_classes3/com/zykj/blackboard/bean/BoardConfig.smali) | `getAddTextOriginalText`、`getAddTextOriginalTextColor`、`getAddTextOriginalTextMaxSize`、`getAddTextOriginalTextMinSize`、`getAddTextOriginalTextSize`、`getAddTextRectF`、`getAuthor` |
| [CommonSourceResult](../../../android/错题本/smali_classes3/com/zykj/blackboard/bean/CommonSourceResult.smali) | `getSourceFileName`、`getSourceId` |
| [MoveActionConfig](../../../android/错题本/smali_classes3/com/zykj/blackboard/bean/MoveActionConfig.smali) | `getHorizontalTranslate`、`getMaxHeightTimes`、`getMaxWidthTimes`、`getRotate`、`getScale`、`getVerticalTranslate`、`isMoveActionEnable` |
| [PlaySpeed](../../../android/错题本/smali_classes3/com/zykj/blackboard/bean/PlaySpeed.smali) | `getPlayIncrement`、`setRate` |

## com.zykj.blackboard.core.action

| 类 | 方法摘录 |
|---|---|
| [ActionManager](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/action/ActionManager.smali) | `handleNewSelectTouchEvent`、`changeGraph`、`deleteGraphEvent`、`geometryGraphEvent`、`getAreaMoveListener`、`getBoardConfig`、`getCurrentAction` |
| [BaseTouchAction](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/action/BaseTouchAction.smali) | `touchEnableCheck`、`getBoardConfig`、`getGraphControl`、`getListener`、`getMatrixAdapter`、`isFingerTouch`、`isSingleFingerInput` |
| [BaseWriteAction](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/action/BaseWriteAction.smali) | `buildSimpleGraph`、`executorsTaskDone`、`getEventList`、`getGraphEnum`、`getMFirstX`、`getMFirstY`、`getPaint` |
| [CursorAction](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/action/CursorAction.smali) | `handleTouch`、`initPointConfig`、`reset`、`singleTouchCancel`、`singleTouchDown`、`singleTouchMove`、`singleTouchUp` |
| [EraseWritingAction](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/action/EraseWritingAction.smali) | `deleteCommand`、`deleteGraph`、`drawDeleteCircle`、`filterDeleteGraphList`、`getDeleteGraphByPoint`、`getIntersectGraphByAreaRectF`、`getMinOutRectF` |
| [GeometryAction](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/action/GeometryAction.smali) | `getRenderPointF`、`reset`、`singleTouchCancel`、`singleTouchDown`、`singleTouchMove`、`singleTouchUp` |
| [GeometryActionEnum](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/action/GeometryActionEnum.smali) | `valueOf`、`values` |
| [IActionListener](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/action/IActionListener.smali) | `changeGraph`、`deleteGraphEvent`、`geometryGraphEvent`、`getAreaMoveListener`、`getBoardConfig`、`getGeometryCreateListener`、`getGeometrySelectListener` |
| [ITouchAction](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/action/ITouchAction.smali) | `onTouchDown`、`onTouchMove`、`onTouchPointerDown`、`onTouchPointerUp`、`onTouchUp`、`reset` |
| [MoveAction](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/action/MoveAction.smali) | `calculateMatrixByTranslateProgress`、`calculateMiddlePointF`、`doubleTouchDown`、`doubleTouchMove`、`doubleTouchUp`、`getRenderPointF`、`handleMatrixDown` |
| [SeeAction](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/action/SeeAction.smali) | `addMatrixList`、`calculateDegrees`、`calculateDistance`、`calculateMatrixByTranslateProgress`、`calculateMiddlePointF`、`checkMoveEnable`、`getRenderPointF` |
| [SelectAction](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/action/SelectAction.smali) | `calculateRadians`、`calculateScaleOffset`、`checkColorLight`、`countRectF`、`getClickGraph`、`getRenderPointF`、`handleRotate` |
| [TextAction](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/action/TextAction.smali) | `buildSelectedRectF`、`buildTextGraph`、`calculateRadians`、`calculateRectF`、`calculateScaleOffset`、`getRenderPointF`、`handleMatrix` |
| [TouchActionModeFactory](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/action/TouchActionModeFactory.smali) | `create`、`getCurrentAction`、`onEvent`、`setListener` |
| [WriteBeelineAction](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/action/WriteBeelineAction.smali) | `buildSimpleGraph`、`getGraphEnum`、`handleTouchDown`、`handleTouchMove`、`handleTouchUp`、`initPaint` |
| [WritingAction](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/action/WritingAction.smali) | `buildSimpleGraph`、`getGraphEnum`、`handleTouchDown`、`handleTouchMove`、`handleTouchUp`、`initPaint` |

## com.zykj.blackboard.core.action.newSelectAtion

| 类 | 方法摘录 |
|---|---|
| [NewSelectAction](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/action/newSelectAtion/NewSelectAction.smali) | `checkMinOutRectF`、`checkMinOutRectFWithMatrix`、`countRectF`、`getRenderPointF`、`handleClickToSelect`、`handleDragToSelect`、`handleSelectedRectF` |
| [NewSelectDrawControl](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl.smali) | `checkColorLight`、`drawColorView`、`drawCustomColor`、`drawTextSizeView`、`drawWriteSizeView`、`drawSelect`、`drawSelectingPaint` |
| [NewSelectFunctionType](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType.smali) | `getText`、`isSelected`、`setSelected` |
| [NewSelectFunctionTypeKt](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionTypeKt.smali) | `createSelectColorList`、`defaultSelectColorList`、`getCustomColor`、`getGeometryStrokeType`、`getTextEditType`、`getWriteEditType`、`handleWithColor` |
| [NewSelectGraphControl](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/action/newSelectAtion/NewSelectGraphControl.smali) | `drawNewSelectRectF`、`drawNewSelectRectF`、`newChangeHandleEnd`、`newChangeHandleStart`、`newChangeHandling` |
| [SelectColor](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/action/newSelectAtion/SelectColor.smali) | `getValue`、`isSelected`、`setSelected`、`setValue` |

## com.zykj.blackboard.core.action.newSelectAtion.function

| 类 | 方法摘录 |
|---|---|
| [BaseSelectFunction](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction.smali) | `calculateRadians`、`calculateScaleOffset`、`getAdapterMatrix`、`handleRotate`、`handleScale`、`handleTranslate`、`getBoardConfig` |
| [DefaultFunction](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/action/newSelectAtion/function/DefaultFunction.smali) | `initFunctionRelativeRectF`、`initFunctionTypeList`、`getCurrentFunctionTypeList`、`getHasTextGraph`、`getMaxFunctionRectF`、`handleClick`、`isClickInSelectFunction` |
| [FunctionBackgroundRectF](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF.smali) | `getColorRectF`、`getCustomColorRectF`、`getEditRectF`、`getTextSizeRectF`、`getWriteStrokeRectF` |
| [FunctionManager](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager.smali) | `handleClick`、`handleDoubleClick`、`handleMoveEnd`、`handleMoveStart`、`handleMoving`、`handleTouchEvent`、`initCurrentFunction` |
| [FunctionRectF](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF.smali) | `getColorList`、`getCustomColor`、`getDelete`、`getGeometryStroke`、`getImageCrop`、`getTextEdit`、`getTextSizeAdd` |
| [GeometryFunction](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction.smali) | `calculateFunctionRectF`、`calculateRadians`、`calculateScaleOffset`、`getFunctionColorList`、`getSingleGraph`、`handleMovedPoint`、`handleStretch` |
| [ICustomColorFunction](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/action/newSelectAtion/function/ICustomColorFunction.smali) | `getLastChangeColor`、`handleCustomColorUsed`、`handleTouchEvent`、`setLastChangeColor` |
| [ImageFunction](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction.smali) | `calculateFunctionRectF`、`initFunctionRelativeRectF`、`initFunctionTypeList`、`updateSingleSelectedRectF`、`getCurrentFunctionTypeList`、`getMaxFunctionRectF`、`handleClick` |
| [TextFunction](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/action/newSelectAtion/function/TextFunction.smali) | `calculateFunctionRectF`、`calculateRectF`、`getFunctionColorList`、`getSingleGraph`、`handleHScale`、`handleTextSize`、`initFunctionRelativeRectF` |
| [WriteFunction](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction.smali) | `getFunctionColorList`、`initFunctionRelativeRectF`、`initFunctionTypeList`、`recalculateColorRectFList`、`getCurrentFunctionTypeList`、`getLastChangeColor`、`getMaxFunctionRectF` |

## com.zykj.blackboard.core.canvas

| 类 | 方法摘录 |
|---|---|
| [MatrixAdapter](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/canvas/MatrixAdapter.smali) | `notifyCameraChange`、`notifyRenderRectChange`、`cameraMatrixConcat`、`getAdapterMatrix`、`getAdapterRectF`、`getCameraMatrix`、`getRenderRectF` |
| [SketchPlayView](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/canvas/SketchPlayView.smali) | `onDetachedFromWindow`、`onTouchEvent`、`ready` |
| [SketchRecorderView](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/canvas/SketchRecorderView.smali) | `onDetachedFromWindow`、`onTouchEvent`、`ready`、`ready` |

## com.zykj.blackboard.core.canvas.control

| 类 | 方法摘录 |
|---|---|
| [DrawControl](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/canvas/control/DrawControl.smali) | `checkActiveLayer`、`clearActiveBitmapAndCanvas`、`drawActiveLayer`、`drawBackground`、`drawCameraBitmap`、`drawCameraRegion`、`drawFixLayer` |
| [DrawControlKt](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/canvas/control/DrawControlKt.smali) | `clear` |
| [GraphControl](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/canvas/control/GraphControl.smali) | `resetBackground`、`addGraph`、`addImageGraph`、`cameraChangeEnd`、`cameraChangeStart`、`cameraChanging`、`changeImageGraph` |
| [IGraphControl](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/canvas/control/IGraphControl.smali) | `addGraph`、`addImageGraph`、`cameraChangeEnd`、`cameraChangeStart`、`cameraChanging`、`changeImageGraph`、`changeTextGraph` |

## com.zykj.blackboard.core.canvas.view

| 类 | 方法摘录 |
|---|---|
| [ActiveLayer](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/canvas/view/ActiveLayer.smali) | `clear`、`refresh` |
| [ActiveView](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/canvas/view/ActiveView.smali) | `clear`、`drawReference`、`drawRegion`、`onDraw`、`refresh` |
| [BackgroundLayer](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/canvas/view/BackgroundLayer.smali) | `drawBackground`、`getBackgroundLineConfig`、`getMyBackgroundColor`、`refresh`、`setBackgroundLineConfig`、`setMatrix`、`setMyBackgroundColor` |
| [BackgroundView](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/canvas/view/BackgroundView.smali) | `calculateLinePath`、`calculateOriginLinePath`、`checkNeedLine`、`drawBackground`、`getBackgroundLineConfig`、`getMyBackgroundColor`、`onDraw` |
| [FixLayer](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/canvas/view/FixLayer.smali) | `refresh`、`reset` |
| [FixView](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/canvas/view/FixView.smali) | `fallbackSafeCopy`、`getMBitmap`、`onDraw`、`refresh`、`reset` |
| [MaskLayer](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/canvas/view/MaskLayer.smali) | `changeClipRectF`、`refresh` |
| [MaskView](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/canvas/view/MaskView.smali) | `getMBitmap`、`changeClipRectF`、`onDraw`、`refresh` |
| [RenderLayer](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/canvas/view/RenderLayer.smali) | `getActiveLayer`、`getBackgroundLayer`、`getFixLayer`、`getMaskLayer`、`getRenderRect`、`reset` |

## com.zykj.blackboard.core.data

| 类 | 方法摘录 |
|---|---|
| [SourceLoad](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/SourceLoad.smali) | `buildAuthorEntity`、`buildBackgroundLineConfigEntity`、`buildMoveConfigEntity`、`getAudioRecord`、`getCommandRecord`、`getFileRecord`、`getGeometryRecord` |
| [SourceSave](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/SourceSave.smali) | `buildAuthor`、`buildBackgroundLineConfig`、`buildMoveConfig`、`saveAudio`、`saveCommand`、`saveFile`、`saveGeometry` |

## com.zykj.blackboard.core.data.dao

| 类 | 方法摘录 |
|---|---|
| [AudioInfoEntity](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/AudioInfoEntity.smali) | `getCommandEnum`、`getData`、`getDelayTime`、`getDuration`、`getId`、`getRecord`、`isPlay` |
| [AudioInfoEntityCursor](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/AudioInfoEntityCursor.smali) | `attachEntity`、`getId`、`getId` |
| [AudioInfoEntity_](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/AudioInfoEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [AudioRecordEntity](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/AudioRecordEntity.smali) | `getAudioInfoEntity`、`getFileName`、`getId`、`getRecord`、`getValidate`、`remove`、`setAudioInfoEntity` |
| [AudioRecordEntityCursor](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/AudioRecordEntityCursor.smali) | `attachEntity`、`getId`、`getId` |
| [AudioRecordEntity_](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/AudioRecordEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [AuthorEntity](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/AuthorEntity.smali) | `getAuthorId`、`getAuthorName`、`getDuration`、`getId`、`getSchoolId`、`getStartTime`、`getUrl` |
| [AuthorEntityCursor](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/AuthorEntityCursor.smali) | `getId`、`getId` |
| [AuthorEntity_](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/AuthorEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [BackgroundLineConfigEntity](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity.smali) | `getId`、`getLineColor`、`getLineSpace`、`getLineType`、`getLineWidth`、`setId`、`setLineColor` |
| [BackgroundLineConfigEntityCursor](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/BackgroundLineConfigEntityCursor.smali) | `getId`、`getId` |
| [BackgroundLineConfigEntity_](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [BackgroundLineTypeEnumConverter](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/BackgroundLineTypeEnumConverter.smali) | `convertToDatabaseValue`、`convertToDatabaseValue`、`convertToEntityProperty`、`convertToEntityProperty` |
| [BlackBoardEntity](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/BlackBoardEntity.smali) | `getDir`、`getId`、`getPages`、`remove`、`setDir`、`setId`、`setPages` |
| [BlackBoardEntityCursor](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/BlackBoardEntityCursor.smali) | `attachEntity`、`getId`、`getId` |
| [BlackBoardEntity_](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/BlackBoardEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [CommandEnumConverter](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/CommandEnumConverter.smali) | `convertToDatabaseValue`、`convertToDatabaseValue`、`convertToEntityProperty`、`convertToEntityProperty` |
| [CommandInfoEntity](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/CommandInfoEntity.smali) | `getCommandEnum`、`getData`、`getDelayTime`、`getDuration`、`getId`、`getRecord`、`isPlay` |
| [CommandInfoEntityCursor](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/CommandInfoEntityCursor.smali) | `attachEntity`、`getId`、`getId` |
| [CommandInfoEntity_](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/CommandInfoEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [CommandRecordEntity](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/CommandRecordEntity.smali) | `getCommandInfoEntity`、`getFileName`、`getId`、`getRecord`、`getValidate`、`remove`、`setCommandInfoEntity` |
| [CommandRecordEntityCursor](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/CommandRecordEntityCursor.smali) | `attachEntity`、`getId`、`getId` |
| [CommandRecordEntity_](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/CommandRecordEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [FileInfoEntity](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/FileInfoEntity.smali) | `getFileName`、`getHeight`、`getId`、`getRecord`、`getValidate`、`getWidth`、`remove` |
| [FileInfoEntityCursor](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/FileInfoEntityCursor.smali) | `attachEntity`、`getId`、`getId` |
| [FileInfoEntity_](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/FileInfoEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [FileRecordEntity](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/FileRecordEntity.smali) | `getFileInfoEntity`、`getFileName`、`getId`、`getRecord`、`getValidate`、`remove`、`setFileInfoEntity` |
| [FileRecordEntityCursor](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/FileRecordEntityCursor.smali) | `attachEntity`、`getId`、`getId` |
| [FileRecordEntity_](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/FileRecordEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [GeometryInfoEntity](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/GeometryInfoEntity.smali) | `getColor`、`getGeometryType`、`getId`、`getPointList`、`getRecord`、`getStyle`、`getTextSize` |
| [GeometryInfoEntityCursor](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/GeometryInfoEntityCursor.smali) | `attachEntity`、`getId`、`getId` |
| [GeometryInfoEntity_](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/GeometryInfoEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [GeometryPointFEntity](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/GeometryPointFEntity.smali) | `getId`、`getRecord`、`remove`、`setId`、`setRecord` |
| [GeometryPointFEntityCursor](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/GeometryPointFEntityCursor.smali) | `attachEntity`、`getId`、`getId` |
| [GeometryPointFEntity_](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/GeometryPointFEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [GeometryRecordEntity](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/GeometryRecordEntity.smali) | `getFileName`、`getGeometryInfoEntityList`、`getId`、`getRecord`、`getValidate`、`remove`、`setFileName` |
| [GeometryRecordEntityCursor](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/GeometryRecordEntityCursor.smali) | `attachEntity`、`getId`、`getId` |
| [GeometryRecordEntity_](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/GeometryRecordEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [HeaderEntity](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/HeaderEntity.smali) | `getAuthor`、`getConvertUrl`、`getCreateDate`、`getDefaultBackgroundColor`、`getDefaultBackgroundLineConfig`、`getDuration`、`getHeight` |
| [HeaderEntityCursor](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/HeaderEntityCursor.smali) | `attachEntity`、`getId`、`getId` |
| [HeaderEntity_](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/HeaderEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [MatrixEventEntity](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/MatrixEventEntity.smali) | `getId`、`getMatrixInfo`、`getRecord`、`remove`、`setId`、`setMatrixInfo`、`setRecord` |
| [MatrixEventEntityCursor](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/MatrixEventEntityCursor.smali) | `attachEntity`、`getId`、`getId` |
| [MatrixEventEntity_](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/MatrixEventEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [MatrixInfoEntity](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/MatrixInfoEntity.smali) | `getEventTime`、`getId`、`getPerSp0`、`getPerSp1`、`getPerSp2`、`getRecord`、`getScaleX` |
| [MatrixInfoEntityCursor](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor.smali) | `attachEntity`、`getId`、`getId` |
| [MatrixInfoEntity_](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/MatrixInfoEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [MatrixRecordEntity](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/MatrixRecordEntity.smali) | `getFileName`、`getId`、`getMatrixEventEntity`、`getRecord`、`getValidate`、`remove`、`setFileName` |
| [MatrixRecordEntityCursor](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/MatrixRecordEntityCursor.smali) | `attachEntity`、`getId`、`getId` |
| [MatrixRecordEntity_](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/MatrixRecordEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [MoveConfigEntity](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/MoveConfigEntity.smali) | `getHorizontalTranslate`、`getId`、`getMaxHeightTimes`、`getMaxWidthTimes`、`getRotate`、`getScale`、`getVerticalTranslate` |
| [MoveConfigEntityCursor](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/MoveConfigEntityCursor.smali) | `getId`、`getId` |
| [MoveConfigEntity_](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/MoveConfigEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [MyObjectBox](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/MyObjectBox.smali) | `buildEntityAudioInfoEntity`、`buildEntityAudioRecordEntity`、`buildEntityAuthorEntity`、`buildEntityBackgroundLineConfigEntity`、`buildEntityBlackBoardEntity`、`buildEntityCommandInfoEntity`、`buildEntityCommandRecordEntity` |
| [PageEntity](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/PageEntity.smali) | `getBlackBoardEntity`、`getCommandFileName`、`getCommandIndex`、`getDirName`、`getHeaderEntity`、`getId`、`getRecordEntity` |
| [PageEntityCursor](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/PageEntityCursor.smali) | `attachEntity`、`getId`、`getId` |
| [PageEntity_](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/PageEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [RecordEntity](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/RecordEntity.smali) | `getAudioList`、`getCommandList`、`getFileList`、`getGeometryList`、`getId`、`getMatrixList`、`getPage` |
| [RecordEntityCursor](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/RecordEntityCursor.smali) | `attachEntity`、`getId`、`getId` |
| [RecordEntity_](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/RecordEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [TextInfoEntity](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/TextInfoEntity.smali) | `getColor`、`getContent`、`getId`、`getRecord`、`getStyle`、`getTextSize`、`getWidth` |
| [TextInfoEntityCursor](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/TextInfoEntityCursor.smali) | `attachEntity`、`getId`、`getId` |
| [TextInfoEntity_](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/TextInfoEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [TextRecordEntity](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/TextRecordEntity.smali) | `getFileName`、`getId`、`getRecord`、`getTextInfoEntityList`、`getValidate`、`remove`、`setFileName` |
| [TextRecordEntityCursor](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/TextRecordEntityCursor.smali) | `attachEntity`、`getId`、`getId` |
| [TextRecordEntity_](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/TextRecordEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [TouchEventEntity](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/TouchEventEntity.smali) | `getColor`、`getId`、`getItemLength`、`getRecord`、`getSpacing`、`getStyle`、`getTextSize` |
| [TouchEventEntityCursor](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/TouchEventEntityCursor.smali) | `attachEntity`、`getId`、`getId` |
| [TouchEventEntity_](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/TouchEventEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [TouchInfoEntity](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/TouchInfoEntity.smali) | `getEventTime`、`getId`、`getRecord`、`remove`、`setEventTime`、`setId`、`setRecord` |
| [TouchInfoEntityCursor](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/TouchInfoEntityCursor.smali) | `attachEntity`、`getId`、`getId` |
| [TouchInfoEntity_](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/TouchInfoEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |
| [TouchRecordEntity](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/TouchRecordEntity.smali) | `getFileName`、`getId`、`getRecord`、`getTouchEventList`、`getValidate`、`remove`、`setFileName` |
| [TouchRecordEntityCursor](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/TouchRecordEntityCursor.smali) | `attachEntity`、`getId`、`getId` |
| [TouchRecordEntity_](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/data/dao/TouchRecordEntity_.smali) | `getAllProperties`、`getCursorFactory`、`getDbName`、`getEntityClass`、`getEntityId`、`getEntityName`、`getIdGetter` |

## com.zykj.blackboard.core.edit

| 类 | 方法摘录 |
|---|---|
| [AudioControl](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/edit/AudioControl.smali) | `initDirPath`、`isMicroTurnOn`、`setListener`、`startRecord`、`stopRecord` |
| [BasePageControl](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/edit/BasePageControl.smali) | `addRootGraph`、`calculateAudioCommandTime`、`calculateCommandTime`、`createPageEntity`、`initCommonSetting`、`initPageEntity`、`updateAudioRecord` |
| [BoardControl](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/edit/BoardControl.smali) | `getPage`、`getSingleExecutor`、`initDir`、`initPageControl`、`renderPage`、`createPage`、`currentPage` |
| [HistoryControl](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/edit/HistoryControl.smali) | `addWithdrawListener`、`clearHistoryList`、`clearHistoryListWithoutCurrent`、`recover`、`removeWithdrawListener`、`saveSnapshot`、`withDraw` |
| [HistoryData](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/edit/HistoryData.smali) | `getBackgroundColor`、`getBackgroundLineConfig`、`getRootGraph` |
| [IBoardControl](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/edit/IBoardControl.smali) | `createPage`、`currentPage`、`deletePage`、`getBoardDirPath`、`getConfig`、`getCurrentPage`、`getCurrentPageIndex` |
| [IEditPageControl](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/edit/IEditPageControl.smali) | `duration`、`getFileName`、`onDelete`、`refresh`、`release` |
| [IPageControl](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/edit/IPageControl.smali) | `addEventListener`、`addGraphDeleteListener`、`addImage`、`addImage`、`addImage`、`addImageList`、`addRenderRectChangeListener` |
| [PageControl](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/edit/PageControl.smali) | `addImageGraphFromLocal`、`buildImageGraph`、`calculateMatrixForSpecial`、`safeCountProgress`、`saveData`、`addEventListener`、`addGraphDeleteListener` |
| [PageControlExtKt](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/edit/PageControlExtKt.smali) | `countScale`、`getScreenMatrix`、`getTranslateMatrix`、`getWHFromLocalByType`、`saveBitmapToLocal`、`saveFileToLocal` |
| [RenderChangeListener](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/edit/RenderChangeListener.smali) | `onCameraChange`、`onRenderChange` |

## com.zykj.blackboard.core.execute

| 类 | 方法摘录 |
|---|---|
| [BaseCommandExecuteFactory](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/execute/BaseCommandExecuteFactory.smali) | `asyncExecute`、`execute`、`executeCommand`、`executeCommand` |
| [CommandExecute](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/execute/CommandExecute.smali) | `asyncExecute`、`execute` |
| [CommandFactory](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/execute/CommandFactory.smali) | `createCommandFactory` |
| [EventPlayThread](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/execute/EventPlayThread.smali) | `getStartPlayTime`、`handle`、`initStartPlayTime`、`needHandle`、`seekTo`、`setListIterator` |
| [PlayFinishListener](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/execute/PlayFinishListener.smali) | `finish` |
| [PlayThread](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/execute/PlayThread.smali) | `getFinishListener`、`getGraphControl`、`getMatrixAdapter`、`getPlayListener`、`getPlaySpeed`、`getPlayStatus`、`getSourceLoader` |

## com.zykj.blackboard.core.execute.version6

| 类 | 方法摘录 |
|---|---|
| [CameraExecute](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/execute/version6/CameraExecute.smali) | `asyncExecute`、`asyncExecute`、`execute`、`execute` |
| [CameraMatrixExecute](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/execute/version6/CameraMatrixExecute.smali) | `asyncExecute`、`asyncExecute`、`execute`、`execute` |
| [CommandExecuteFactory6](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/execute/version6/CommandExecuteFactory6.smali) | `executeCommand`、`executeCommand` |
| [ConfigExecute](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/execute/version6/ConfigExecute.smali) | `asyncExecute`、`asyncExecute`、`execute`、`execute` |
| [CursorMoveExecute](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/execute/version6/CursorMoveExecute.smali) | `asyncExecute`、`asyncExecute`、`execute`、`execute` |
| [GraphChangeExecute](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/execute/version6/GraphChangeExecute.smali) | `asyncExecute`、`asyncExecute`、`execute`、`execute` |
| [GraphDataExecute](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/execute/version6/GraphDataExecute.smali) | `asyncExecute`、`asyncExecute`、`execute`、`execute` |
| [GraphMatrixExecute](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/execute/version6/GraphMatrixExecute.smali) | `asyncExecute`、`asyncExecute`、`execute`、`execute` |
| [GraphRemoveExecute](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/execute/version6/GraphRemoveExecute.smali) | `asyncExecute`、`asyncExecute`、`execute`、`execute` |
| [RebuildExecute](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/execute/version6/RebuildExecute.smali) | `asyncExecute`、`asyncExecute`、`execute`、`execute` |
| [RecordStopExecute](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/execute/version6/RecordStopExecute.smali) | `asyncExecute`、`asyncExecute`、`execute`、`execute` |

## com.zykj.blackboard.core.graph

| 类 | 方法摘录 |
|---|---|
| [Graph](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/graph/Graph.smali) | `addGraph`、`addImageGraph`、`concatMatrix`、`deleteGraphList`、`findById`、`findByPoint`、`findByRectF` |
| [IDraw](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/graph/IDraw.smali) | `onDraw`、`render` |
| [IGraph](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/graph/IGraph.smali) | `deleteGraphList`、`findById`、`findByPoint`、`findByRectF`、`findGraphListByPoint`、`getChildGraph`、`getGraphData` |
| [IGraphChange](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/graph/IGraphChange.smali) | `addGraph`、`addImageGraph`、`concatMatrix`、`initMatrix`、`removeGraph`、`updateRenderRectF` |

## com.zykj.blackboard.core.graph.group

| 类 | 方法摘录 |
|---|---|
| [FileGraph](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/graph/group/FileGraph.smali) | `getFilePath`、`getPaint`、`getSnapshot`、`getSourceFileName`、`getSourceId`、`getSourceLoader`、`initPath` |
| [GeometryGraph](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/graph/group/GeometryGraph.smali) | `initData`、`changeOriginalRectF`、`getGeometryType`、`getMinOutRectF`、`getMovePointFList`、`getPaint`、`getPointList` |
| [GroupGraph](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/graph/group/GroupGraph.smali) | `canDrawBitmap`、`drawChildrenDirectly`、`getBitmapRenderRect`、`shouldRebuildBitmapForMatrix`、`updateGroupBitmap`、`updateReusableBitmapRenderRect`、`addGraph` |
| [IChangeField](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/graph/group/IChangeField.smali) | `changeOriginalRectF`、`changeRenderMatrix`、`changeUpdate` |
| [ImageGraph](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/graph/group/ImageGraph.smali) | `renderBitmap`、`getBitmap`、`graphType`、`onDestroy`、`render`、`setBitmap`、`updateFilePath` |
| [TextGraph](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/graph/group/TextGraph.smali) | `getContent`、`getPaint`、`getSnapshot`、`getSourceFileName`、`getSourceId`、`graphType`、`render` |

## com.zykj.blackboard.core.graph.root

| 类 | 方法摘录 |
|---|---|
| [BoundedContainerGraph](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/graph/root/BoundedContainerGraph.smali) | `getGraphData`、`getSnapshot`、`getSourceFileName`、`getSourceId`、`graphType`、`render`、`setSourceFileName` |

## com.zykj.blackboard.core.graph.stroke

| 类 | 方法摘录 |
|---|---|
| [BeelineStrokeGraph](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/graph/stroke/BeelineStrokeGraph.smali) | `graphType` |
| [StrokeGraph](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/graph/stroke/StrokeGraph.smali) | `renderPath`、`graphType`、`render` |
| [WritingGraph](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/graph/stroke/WritingGraph.smali) | `getTouchInfo`、`lineSpace`、`pointToLine`、`getMEventList`、`getMPaint`、`getMinOutRectF`、`getPaintItemLength` |

## com.zykj.blackboard.core.graphBuilder

| 类 | 方法摘录 |
|---|---|
| [BeelineStrokeGraphBuilder](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/graphBuilder/BeelineStrokeGraphBuilder.smali) | `build` |
| [BoundedContainerGraphBuilder](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/graphBuilder/BoundedContainerGraphBuilder.smali) | `build` |
| [GeometryGraphBuilder](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/graphBuilder/GeometryGraphBuilder.smali) | `build` |
| [GraphBuild](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/graphBuilder/GraphBuild.smali) | `build` |
| [GraphBuildFactory](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/graphBuilder/GraphBuildFactory.smali) | `valueOf`、`values`、`parse` |
| [GroupGraphBuilder](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/graphBuilder/GroupGraphBuilder.smali) | `build` |
| [ImageGraphBuilder](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/graphBuilder/ImageGraphBuilder.smali) | `build` |
| [StrokeGraphBuilder](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/graphBuilder/StrokeGraphBuilder.smali) | `build` |
| [TextGraphBuilder](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/graphBuilder/TextGraphBuilder.smali) | `build` |

## com.zykj.blackboard.core.loader

| 类 | 方法摘录 |
|---|---|
| [CacheSourceLoader](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/loader/CacheSourceLoader.smali) | `getDataByCache`、`getIndexInList`、`getFileCache`、`getGeometryCache`、`getMatrixCache`、`getTextCache`、`getTouchCache` |
| [EntityConvertEzy](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/loader/EntityConvertEzy.smali) | `commandInfoConvertEzyCommandInfo`、`fileInfoConvertEzyFileInfo`、`geometryInfoConvertEzyGeometryInfo`、`matrixEventConvertEzyMatrixInfo`、`textInfoConvertEzyTextInfo`、`touchInfoConvertEzyTouchInfo` |
| [LocalSourceLoader](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/loader/LocalSourceLoader.smali) | `handleRecordEntity`、`cleanCache`、`getFileCache`、`getGeometryCache`、`getMatrixCache`、`getTextCache`、`getTouchCache` |
| [SimpleSourceLoader](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/loader/SimpleSourceLoader.smali) | `getFileCache`、`getGeometryCache`、`getMatrixCache`、`getTextCache`、`getTouchCache`、`initPath`、`release` |
| [SourceLoader](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/loader/SourceLoader.smali) | `getFileCache`、`getGeometryCache`、`getMatrixCache`、`getTextCache`、`getTouchCache`、`initPath`、`release` |

## com.zykj.blackboard.core.play

| 类 | 方法摘录 |
|---|---|
| [AudioCommandThread](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/play/AudioCommandThread.smali) | `fastLoading`、`isNeedPlay`、`loadNextCommandIterator`、`readCommand`、`readCommandAndPause`、`releaseCurrentMediaPlayer`、`syncExecuteCommand` |
| [BasePlayPageControl](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/play/BasePlayPageControl.smali) | `setSeeActionIsPlay`、`addPlayActionListener`、`getActionManager`、`getAudioCommandThread`、`getBoardConfig`、`getCacheSourceLoad`、`getCommandThread` |
| [CameraMatrixThread](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/play/CameraMatrixThread.smali) | `handle`、`handle`、`needHandle`、`needHandle`、`setMatrixInfo` |
| [CommandThread](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/play/CommandThread.smali) | `fastLoading`、`fastReadCommandAndPause`、`isNeedPlay`、`loadNextCommandIterator`、`readCommand`、`pausePlay`、`reset` |
| [CursorMoveThread](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/play/CursorMoveThread.smali) | `getPath`、`handle`、`handle`、`needHandle`、`needHandle`、`setPath`、`setTouchInfo` |
| [GraphMatrixThread](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/play/GraphMatrixThread.smali) | `handle`、`handle`、`needHandle`、`needHandle`、`setMatrixInfo` |
| [IEditPlayPageControl](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/play/IEditPlayPageControl.smali) | `loadPath`、`release` |
| [IPlayControl](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/play/IPlayControl.smali) | `getCurrentPlayPageControl`、`getCurrentPlayPageIndex`、`getPlayPageControlList`、`getRootPath`、`loadPath`、`release`、`setPageListener` |
| [IPlayPageControl](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/play/IPlayPageControl.smali) | `addPlayActionListener`、`areaMoveEnd`、`areaMoveStart`、`areaMoving`、`getCurrentScreenShot`、`getDuration`、`getMoveHorizontalProgress` |
| [PlayControl](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/play/PlayControl.smali) | `getSingleExecutor`、`runOnMainThread`、`getCurrentPlayPageControl`、`getCurrentPlayPageIndex`、`getPlayPageControlList`、`getRootPath`、`loadPath` |
| [PlayPageControl](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/play/PlayPageControl.smali) | `getSingleExecutor`、`initCommandThread`、`areaMoveEnd`、`areaMoveStart`、`areaMoving`、`getCurrentScreenShot`、`getDuration` |
| [TouchEventThread](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/play/TouchEventThread.smali) | `getPath`、`handle`、`handle`、`needHandle`、`needHandle`、`setPath`、`setTouchInfo` |

## com.zykj.blackboard.core.record

| 类 | 方法摘录 |
|---|---|
| [DataRecorder](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/record/DataRecorder.smali) | `buildAudioInfoEntity`、`buildCommandInfoEntity`、`getStartEventTime`、`getTimeRecord` |
| [ITimeRecord](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/record/ITimeRecord.smali) | `getDelayTime`、`getTime`、`isRecord`、`reset`、`setListener`、`startRecord`、`stopRecord` |
| [SourceRouterRecord](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/record/SourceRouterRecord.smali) | `getAudioRecord`、`getCanSave`、`getCommandRecord`、`getRecord`、`initRecord`、`setRecord` |
| [TimeRecord](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/record/TimeRecord.smali) | `getDelayTime`、`getTime`、`isRecord`、`reset`、`setListener`、`setOffsetForAudio`、`setOffsetForCommand` |

## com.zykj.blackboard.core.record.dataRecorder

| 类 | 方法摘录 |
|---|---|
| [AudioRecord](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/record/dataRecorder/AudioRecord.smali) | `buildRecordEntity`、`checkLength`、`initRecordEntity`、`updateEntity`、`addAudio`、`isRecordChange`、`setRecord` |
| [CommandRecord](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/record/dataRecorder/CommandRecord.smali) | `buildRecordEntity`、`checkLength`、`initRecordEntity`、`notifyEvent`、`updateEntity`、`addCamera`、`addCameraMatrix` |
| [FileSourceRecord](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/record/dataRecorder/FileSourceRecord.smali) | `buildRecordEntity`、`checkLength`、`initRecordEntity`、`addFile`、`setRecord` |
| [GeometrySourceRecord](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/record/dataRecorder/GeometrySourceRecord.smali) | `buildRecordEntity`、`checkLength`、`initRecordEntity`、`addGeometry`、`setRecord` |
| [MatrixSourceRecord](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/record/dataRecorder/MatrixSourceRecord.smali) | `buildRecordEntity`、`checkLength`、`initRecordEntity`、`setRecord` |
| [TextSourceRecord](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/record/dataRecorder/TextSourceRecord.smali) | `buildRecordEntity`、`checkLength`、`initRecordEntity`、`addText`、`setRecord` |
| [TouchSourceRecord](../../../android/错题本/smali_classes3/com/zykj/blackboard/core/record/dataRecorder/TouchSourceRecord.smali) | `buildRecordEntity`、`checkLength`、`initRecordEntity`、`addTouchEvent`、`setRecord` |

## com.zykj.blackboard.crop

| 类 | 方法摘录 |
|---|---|
| [CropManager](../../../android/错题本/smali_classes3/com/zykj/blackboard/crop/CropManager.smali) | `createGraphControl`、`cropAudioByTime`、`cropCommandByIndex`、`deleteFileEntity`、`deleteMatrixEntity`、`deleteTextEntity`、`deleteTouchEntity` |
| [SimpleBackgroundView](../../../android/错题本/smali_classes3/com/zykj/blackboard/crop/SimpleBackgroundView.smali) | `drawBackground`、`getBackgroundLineConfig`、`getMyBackgroundColor`、`refresh`、`setBackgroundLineConfig`、`setMatrix`、`setMyBackgroundColor` |
| [SimpleFixView](../../../android/错题本/smali_classes3/com/zykj/blackboard/crop/SimpleFixView.smali) | `refresh`、`reset` |

## com.zykj.blackboard.enums

| 类 | 方法摘录 |
|---|---|
| [DocumentType](../../../android/错题本/smali_classes3/com/zykj/blackboard/enums/DocumentType.smali) | `valueOf`、`values` |
| [PlayStatus](../../../android/错题本/smali_classes3/com/zykj/blackboard/enums/PlayStatus.smali) | `valueOf`、`values`、`getState`、`getStateName`、`setState`、`setStateName` |
| [SelectGraphEnum](../../../android/错题本/smali_classes3/com/zykj/blackboard/enums/SelectGraphEnum.smali) | `valueOf`、`values` |
| [SelectGraphEnumKt](../../../android/错题本/smali_classes3/com/zykj/blackboard/enums/SelectGraphEnumKt.smali) | `convert2SelectGraphEnum`、`getAllSelectGraphEnumList` |
| [TextActionType](../../../android/错题本/smali_classes3/com/zykj/blackboard/enums/TextActionType.smali) | `valueOf`、`values`、`getValue`、`setValue` |
| [TranslationType](../../../android/错题本/smali_classes3/com/zykj/blackboard/enums/TranslationType.smali) | `valueOf`、`values`、`getValue`、`setValue` |

## com.zykj.blackboard.exception

| 类 | 方法摘录 |
|---|---|
| [FileVerificationException](../../../android/错题本/smali_classes3/com/zykj/blackboard/exception/FileVerificationException.smali) | `getMessage` |

## com.zykj.blackboard.extensions

| 类 | 方法摘录 |
|---|---|
| [ExtensionsKt](../../../android/错题本/smali_classes3/com/zykj/blackboard/extensions/ExtensionsKt.smali) | `capture`、`getDistance`、`getMidPoint`、`getRotation`、`lineSpace`、`pointToLine` |

## com.zykj.blackboard.listener

| 类 | 方法摘录 |
|---|---|
| [ErrorListener](../../../android/错题本/smali_classes3/com/zykj/blackboard/listener/ErrorListener.smali) | `reportError` |
| [EventListener](../../../android/错题本/smali_classes3/com/zykj/blackboard/listener/EventListener.smali) | `onEvent` |
| [GraphDeleteListener](../../../android/错题本/smali_classes3/com/zykj/blackboard/listener/GraphDeleteListener.smali) | `onGraphDelete` |
| [IAreaMoveListener](../../../android/错题本/smali_classes3/com/zykj/blackboard/listener/IAreaMoveListener.smali) | `onHorizontalMove`、`onMoveEnd`、`onMoveStart`、`onVerticalMove` |
| [IGeometrySelectListener](../../../android/错题本/smali_classes3/com/zykj/blackboard/listener/IGeometrySelectListener.smali) | `geometryColorChange` |
| [ITextSelectListener](../../../android/错题本/smali_classes3/com/zykj/blackboard/listener/ITextSelectListener.smali) | `textColorChange`、`textSelected`、`textSelectedCancel`、`textSizeChange` |
| [MicroPhoneListener](../../../android/错题本/smali_classes3/com/zykj/blackboard/listener/MicroPhoneListener.smali) | `turnOffMicroPhone`、`turnOnMicroPhone` |
| [PageListener](../../../android/错题本/smali_classes3/com/zykj/blackboard/listener/PageListener.smali) | `addPage`、`changPage`、`removePage` |
| [PlayStatusListener](../../../android/错题本/smali_classes3/com/zykj/blackboard/listener/PlayStatusListener.smali) | `onPlayEnd`、`onPlayPause`、`onPlayResume`、`onPlayStart`、`onProgress` |
| [RecordListener](../../../android/错题本/smali_classes3/com/zykj/blackboard/listener/RecordListener.smali) | `progress`、`startRecord`、`stopRecord` |
| [WithdrawListener](../../../android/错题本/smali_classes3/com/zykj/blackboard/listener/WithdrawListener.smali) | `onWithdraw` |

## com.zykj.blackboard.proxy

| 类 | 方法摘录 |
|---|---|
| [CustomColorView](../../../android/错题本/smali_classes3/com/zykj/blackboard/proxy/CustomColorView.smali) | `dispatchTouchEvent`、`getChangeColor`、`getHeight`、`getWidth`、`initColor`、`isColorExist`、`onColorUsed` |
| [ImageCropView](../../../android/错题本/smali_classes3/com/zykj/blackboard/proxy/ImageCropView.smali) | `showCropView` |
| [TextEditView](../../../android/错题本/smali_classes3/com/zykj/blackboard/proxy/TextEditView.smali) | `showEditView` |

## com.zykj.blackboard.utils

| 类 | 方法摘录 |
|---|---|
| [AppContext](../../../android/错题本/smali_classes3/com/zykj/blackboard/utils/AppContext.smali) | `getContext` |
| [AudioUtils](../../../android/错题本/smali_classes3/com/zykj/blackboard/utils/AudioUtils.smali) | `audioCut`、`audioCut`、`timeFormat` |
| [BitmapUtil](../../../android/错题本/smali_classes3/com/zykj/blackboard/utils/BitmapUtil.smali) | `recycle` |
| [BoardBox](../../../android/错题本/smali_classes3/com/zykj/blackboard/utils/BoardBox.smali) | `setBoxStore`、`checkBoardFileExist`、`clearLocalData`、`clearPageData`、`getBoxStore` |
| [CanvasUtils](../../../android/错题本/smali_classes3/com/zykj/blackboard/utils/CanvasUtils.smali) | `drawLargeBitmap` |
| [ColorUtils](../../../android/错题本/smali_classes3/com/zykj/blackboard/utils/ColorUtils.smali) | `toAlphaColor`、`toNoAlphaColor` |
| [ConvertExtKt](../../../android/错题本/smali_classes3/com/zykj/blackboard/utils/ConvertExtKt.smali) | `toBackgroundLineTypeEnum`、`toConfig`、`toConfig`、`toEntity`、`toEntity`、`toEntity`、`toEzyBackgroundLineTypeEnum` |
| [DefaultTextEditView](../../../android/错题本/smali_classes3/com/zykj/blackboard/utils/DefaultTextEditView.smali) | `getDialog`、`setDialog`、`showEditView` |
| [EventBus](../../../android/错题本/smali_classes3/com/zykj/blackboard/utils/EventBus.smali) | `clear`、`register`、`unregister` |
| [EventConvert](../../../android/错题本/smali_classes3/com/zykj/blackboard/utils/EventConvert.smali) | `buildPointPropertiesList`、`motionEventConvertTouchEvent`、`updateTouchEventByNewMatrix` |
| [EventKey](../../../android/错题本/smali_classes3/com/zykj/blackboard/utils/EventKey.smali) | `valueOf`、`values` |
| [FileUtils](../../../android/错题本/smali_classes3/com/zykj/blackboard/utils/FileUtils.smali) | `delete`、`saveBitmap2SDCard`、`saveToFile` |
| [FileValidateUtils](../../../android/错题本/smali_classes3/com/zykj/blackboard/utils/FileValidateUtils.smali) | `getFileSignature`、`validateFile` |
| [GraphHelper](../../../android/错题本/smali_classes3/com/zykj/blackboard/utils/GraphHelper.smali) | `createStrokeGraph` |
| [GraphUtils](../../../android/错题本/smali_classes3/com/zykj/blackboard/utils/GraphUtils.smali) | `convertMatrix`、`buildGraph`、`eventConvertPath`、`findPointListRectF`、`snapshotGraphToGraph` |
| [GraphUtilsKt](../../../android/错题本/smali_classes3/com/zykj/blackboard/utils/GraphUtilsKt.smali) | `covertEzyPaint`、`covertEzyPointF`、`covertEzyRectF`、`covertPaint`、`covertPointF`、`covertRectF` |
| [MatrixExtKt](../../../android/错题本/smali_classes3/com/zykj/blackboard/utils/MatrixExtKt.smali) | `getScaleX`、`invert`、`mapRect`、`toEzyMatrix`、`toMatrix` |
| [PointUtils](../../../android/错题本/smali_classes3/com/zykj/blackboard/utils/PointUtils.smali) | `getCross`、`isPointInRect`、`isPointInRect`、`isRectFinRectF`、`mapPoint`、`mapPoint`、`rectConvertPath` |
| [RectBoardUtils](../../../android/错题本/smali_classes3/com/zykj/blackboard/utils/RectBoardUtils.smali) | `getSelectActionRectBoardPath`、`getTextActionRectBoardPath` |
| [RectExtKt](../../../android/错题本/smali_classes3/com/zykj/blackboard/utils/RectExtKt.smali) | `toRect`、`toRectF` |
| [ShapeUtils](../../../android/错题本/smali_classes3/com/zykj/blackboard/utils/ShapeUtils.smali) | `drawDeleteIconToPath`、`drawNewRotateIconToPath`、`drawNewScaleIconToPath`、`drawRotateIconToPath`、`drawScaleIconToPath`、`drawTickInRectFToPath`、`drawTranslateIconToPath` |
| [StringUtils](../../../android/错题本/smali_classes3/com/zykj/blackboard/utils/StringUtils.smali) | `matchLong` |
| [TextGraphUtils](../../../android/错题本/smali_classes3/com/zykj/blackboard/utils/TextGraphUtils.smali) | `calculateTextToList` |
| [TimeCountTestUtils](../../../android/错题本/smali_classes3/com/zykj/blackboard/utils/TimeCountTestUtils.smali) | `endTest`、`startTest` |

## com.zykj.blackboard.widgets

| 类 | 方法摘录 |
|---|---|
| [TextDialog](../../../android/错题本/smali_classes3/com/zykj/blackboard/widgets/TextDialog.smali) | `getAfterTextChangedCallback`、`getCancelCallback`、`getDoneCallback`、`onCreate`、`onKeyDown`、`onStart`、`setAfterTextChangedCallback` |

## com.zykj.board

| 类 | 方法摘录 |
|---|---|
| [a0](../../../android/错题本/smali_classes3/com/zykj/board/a0.smali) | `addRepeatedField`、`addRepeatedField`、`build`、`build`、`buildPartial`、`buildPartial`、`clear` |
| [a1](../../../android/错题本/smali_classes3/com/zykj/board/a1.smali) | `parsePartialFrom` |
| [b0](../../../android/错题本/smali_classes3/com/zykj/board/b0.smali) | `addRepeatedField`、`addRepeatedField`、`build`、`build`、`buildPartial`、`buildPartial`、`clear` |
| [b1](../../../android/错题本/smali_classes3/com/zykj/board/b1.smali) | `addRepeatedField`、`addRepeatedField`、`build`、`build`、`buildPartial`、`buildPartial`、`clear` |
| [c0](../../../android/错题本/smali_classes3/com/zykj/board/c0.smali) | `parsePartialFrom` |
| [d0](../../../android/错题本/smali_classes3/com/zykj/board/d0.smali) | `addRepeatedField`、`addRepeatedField`、`build`、`build`、`buildPartial`、`buildPartial`、`clear` |
| [f0](../../../android/错题本/smali_classes3/com/zykj/board/f0.smali) | `addRepeatedField`、`addRepeatedField`、`build`、`build`、`buildPartial`、`buildPartial`、`clear` |
| [g0](../../../android/错题本/smali_classes3/com/zykj/board/g0.smali) | `parsePartialFrom` |
| [h0](../../../android/错题本/smali_classes3/com/zykj/board/h0.smali) | `addRepeatedField`、`addRepeatedField`、`build`、`build`、`buildPartial`、`buildPartial`、`clear` |
| [i0](../../../android/错题本/smali_classes3/com/zykj/board/i0.smali) | `addRepeatedField`、`addRepeatedField`、`build`、`build`、`buildPartial`、`buildPartial`、`clear` |
| [j0](../../../android/错题本/smali_classes3/com/zykj/board/j0.smali) | `parsePartialFrom` |
| [k0](../../../android/错题本/smali_classes3/com/zykj/board/k0.smali) | `addRepeatedField`、`addRepeatedField`、`build`、`build`、`buildPartial`、`buildPartial`、`clear` |
| [l0](../../../android/错题本/smali_classes3/com/zykj/board/l0.smali) | `addRepeatedField`、`addRepeatedField`、`build`、`build`、`buildPartial`、`buildPartial`、`clear` |
| [m0](../../../android/错题本/smali_classes3/com/zykj/board/m0.smali) | `parsePartialFrom` |
| [n0](../../../android/错题本/smali_classes3/com/zykj/board/n0.smali) | `addRepeatedField`、`addRepeatedField`、`build`、`build`、`buildPartial`、`buildPartial`、`clear` |
| [o0](../../../android/错题本/smali_classes3/com/zykj/board/o0.smali) | `addRepeatedField`、`addRepeatedField`、`build`、`build`、`buildPartial`、`buildPartial`、`clear` |
| [p0](../../../android/错题本/smali_classes3/com/zykj/board/p0.smali) | `parsePartialFrom` |
| [q0](../../../android/错题本/smali_classes3/com/zykj/board/q0.smali) | `addRepeatedField`、`addRepeatedField`、`build`、`build`、`buildPartial`、`buildPartial`、`clear` |
| [r0](../../../android/错题本/smali_classes3/com/zykj/board/r0.smali) | `addRepeatedField`、`addRepeatedField`、`build`、`build`、`buildPartial`、`buildPartial`、`clear` |
| [s0](../../../android/错题本/smali_classes3/com/zykj/board/s0.smali) | `parsePartialFrom` |
| [t0](../../../android/错题本/smali_classes3/com/zykj/board/t0.smali) | `addRepeatedField`、`addRepeatedField`、`build`、`build`、`buildPartial`、`buildPartial`、`clear` |
| [u0](../../../android/错题本/smali_classes3/com/zykj/board/u0.smali) | `addRepeatedField`、`addRepeatedField`、`build`、`build`、`buildPartial`、`buildPartial`、`clear` |
| [v0](../../../android/错题本/smali_classes3/com/zykj/board/v0.smali) | `parsePartialFrom` |
| [w0](../../../android/错题本/smali_classes3/com/zykj/board/w0.smali) | `addRepeatedField`、`addRepeatedField`、`build`、`build`、`buildPartial`、`buildPartial`、`clear` |
| [x0](../../../android/错题本/smali_classes3/com/zykj/board/x0.smali) | `addRepeatedField`、`addRepeatedField`、`build`、`build`、`buildPartial`、`buildPartial`、`clear` |
| [y0](../../../android/错题本/smali_classes3/com/zykj/board/y0.smali) | `parsePartialFrom` |
| [z0](../../../android/错题本/smali_classes3/com/zykj/board/z0.smali) | `addRepeatedField`、`addRepeatedField`、`build`、`build`、`buildPartial`、`buildPartial`、`clear` |

## com.zykj.merge.sketch.config

| 类 | 方法摘录 |
|---|---|
| [RecorderConfig](../../../android/错题本/smali_classes3/com/zykj/merge/sketch/config/RecorderConfig.smali) | `getMaxImageCount`、`getPaintColor`、`getPaintWidth`、`getShapeType`、`getSourcePath`、`isRecord`、`isTouchable` |

## com.zykj.merge.sketch.constant

| 类 | 方法摘录 |
|---|---|
| [PlayStatus](../../../android/错题本/smali_classes3/com/zykj/merge/sketch/constant/PlayStatus.smali) | `valueOf`、`values`、`getState`、`getStateName`、`setState`、`setStateName` |

## com.zykj.merge.sketch.listener

| 类 | 方法摘录 |
|---|---|
| [MoveProxy](../../../android/错题本/smali_classes3/com/zykj/merge/sketch/listener/MoveProxy.smali) | `areaMoveEnd`、`areaMoveStart`、`areaMoving`、`getCurrentScreenBitmap`、`getMoveHorizontalProgress`、`getMoveMaxHeightTimes`、`getMoveMaxWidthTimes` |
| [Play](../../../android/错题本/smali_classes3/com/zykj/merge/sketch/listener/Play.smali) | `addPlayActionListener`、`destroy`、`getPath`、`isRend`、`loadData`、`pause`、`release` |
| [PlayStatusListener](../../../android/错题本/smali_classes3/com/zykj/merge/sketch/listener/PlayStatusListener.smali) | `onPlayEnd`、`onPlayPause`、`onPlayStart`、`onPlayWait`、`onProgress` |

## com.zykj.merge.sketch.view

| 类 | 方法摘录 |
|---|---|
| [BlackBoardProxyView](../../../android/错题本/smali_classes3/com/zykj/merge/sketch/view/BlackBoardProxyView.smali) | `runAtLeastCreated`、`addPlayActionListener`、`areaMoveEnd`、`areaMoveStart`、`areaMoving`、`destroy`、`getCurrentScreenBitmap` |
| [MergeSketchPlayView](../../../android/错题本/smali_classes3/com/zykj/merge/sketch/view/MergeSketchPlayView.smali) | `addPlayActionListener`、`areaMoveEnd`、`areaMoveStart`、`areaMoving`、`destroy`、`getMoveHorizontalProgress`、`getMoveMaxHeightTimes` |
| [NewSketchProxyView](../../../android/错题本/smali_classes3/com/zykj/merge/sketch/view/NewSketchProxyView.smali) | `addPlayActionListener`、`destroy`、`getPath`、`isRend`、`loadData`、`pause`、`release` |
| [OldSketchProxyView](../../../android/错题本/smali_classes3/com/zykj/merge/sketch/view/OldSketchProxyView.smali) | `getLoadDataExecutor`、`getSeekExecutor`、`runAtLeastCreated`、`runOnMainThread`、`addPlayActionListener`、`destroy`、`getPath` |

## com.zykj.message

| 类 | 方法摘录 |
|---|---|
| [KillSelfService](../../../android/错题本/smali_classes3/com/zykj/message/KillSelfService.smali) | `onBind`、`onStartCommand` |
| [UnInstallActivity](../../../android/错题本/smali_classes3/com/zykj/message/UnInstallActivity.smali) | `onBackPressed`、`onCreate`、`onResume` |
| [UnLoginActivity](../../../android/错题本/smali_classes3/com/zykj/message/UnLoginActivity.smali) | `onActivityResult`、`onBackPressed`、`onCreate`、`onDestroy`、`onPause`、`onRestart`、`onResume` |

## com.zykj.message.client

| 类 | 方法摘录 |
|---|---|
| [MessageClient](../../../android/错题本/smali_classes3/com/zykj/message/client/MessageClient.smali) | `valueOf`、`values`、`checkUrl`、`getSNInfo`、`getSNInfo`、`getServerInfo`、`getServerInfo` |
| [a0](../../../android/错题本/smali_classes3/com/zykj/message/client/a0.smali) | `handleMessage` |

## com.zykj.message.server.bean

| 类 | 方法摘录 |
|---|---|
| [ServerInfo](../../../android/错题本/smali_classes3/com/zykj/message/server/bean/ServerInfo.smali) | `describeContents`、`writeToParcel` |
| [Status](../../../android/错题本/smali_classes3/com/zykj/message/server/bean/Status.smali) | `getStatus`、`valueOf`、`values`、`describeContents`、`getStatusCode`、`writeToParcel` |
| [UserInfo](../../../android/错题本/smali_classes3/com/zykj/message/server/bean/UserInfo.smali) | `describeContents`、`writeToParcel` |

## com.zykj.mistake

| 类 | 方法摘录 |
|---|---|
| [DataBinderMapperImpl](../../../android/错题本/smali_classes3/com/zykj/mistake/DataBinderMapperImpl.smali) | `collectDependencies`、`convertBrIdToString`、`getDataBinder`、`getDataBinder`、`getLayoutId` |

## com.zykj.mistake.activity

| 类 | 方法摘录 |
|---|---|
| [MainActivity](../../../android/错题本/smali_classes3/com/zykj/mistake/activity/MainActivity.smali) | `attachBaseContext`、`onCreate`、`onDestroy`、`onResume` |
| [MistakeDetailActivity](../../../android/错题本/smali_classes3/com/zykj/mistake/activity/MistakeDetailActivity.smali) | `onActivityResult`、`onKeyDown` |
| [MistakeListActivity](../../../android/错题本/smali_classes3/com/zykj/mistake/activity/MistakeListActivity.smali) | `onActivityResult`、`onDestroy`、`onKeyDown`、`onResume` |
| [SketchActivity](../../../android/错题本/smali_classes3/com/zykj/mistake/activity/SketchActivity.smali) | `onKeyDown` |
| [SketchPlayerActivity](../../../android/错题本/smali_classes3/com/zykj/mistake/activity/SketchPlayerActivity.smali) | `onKeyDown` |
| [a0](../../../android/错题本/smali_classes3/com/zykj/mistake/activity/a0.smali) | `invoke` |
| [b0](../../../android/错题本/smali_classes3/com/zykj/mistake/activity/b0.smali) | `invoke` |
| [c0](../../../android/错题本/smali_classes3/com/zykj/mistake/activity/c0.smali) | `invoke` |
| [e0](../../../android/错题本/smali_classes3/com/zykj/mistake/activity/e0.smali) | `onClick` |
| [f0](../../../android/错题本/smali_classes3/com/zykj/mistake/activity/f0.smali) | `invoke` |
| [g0](../../../android/错题本/smali_classes3/com/zykj/mistake/activity/g0.smali) | `invoke` |

## com.zykj.mistake.adapter

| 类 | 方法摘录 |
|---|---|
| [DetailPagerAdapter](../../../android/错题本/smali_classes3/com/zykj/mistake/adapter/DetailPagerAdapter.smali) | `getCount`、`getItem`、`getItemPosition`、`getPageTitle` |
| [MainLessonAdapter](../../../android/错题本/smali_classes3/com/zykj/mistake/adapter/MainLessonAdapter.smali) | `getItemCount`、`onBindViewHolder`、`onBindViewHolder`、`onCreateViewHolder` |
| [MistakeListAdapter](../../../android/错题本/smali_classes3/com/zykj/mistake/adapter/MistakeListAdapter.smali) | `getItemCount`、`onBindViewHolder`、`onBindViewHolder`、`onCreateViewHolder` |
| [SketchMaterialAdapter](../../../android/错题本/smali_classes3/com/zykj/mistake/adapter/SketchMaterialAdapter.smali) | `getItemCount`、`onBindViewHolder`、`onCreateViewHolder` |

## com.zykj.mistake.application

| 类 | 方法摘录 |
|---|---|
| [MistakeApplication](../../../android/错题本/smali_classes3/com/zykj/mistake/application/MistakeApplication.smali) | `attachBaseContext`、`onCreate`、`onTerminate` |

## com.zykj.mistake.base

| 类 | 方法摘录 |
|---|---|
| [BaseActivity](../../../android/错题本/smali_classes3/com/zykj/mistake/base/BaseActivity.smali) | `attachBaseContext`、`onCreate` |
| [BaseFragment](../../../android/错题本/smali_classes3/com/zykj/mistake/base/BaseFragment.smali) | `onCreateView` |
| [BaseMVPActivity](../../../android/错题本/smali_classes3/com/zykj/mistake/base/BaseMVPActivity.smali) | `onCreate`、`onDestroy` |
| [BaseMVPFragment](../../../android/错题本/smali_classes3/com/zykj/mistake/base/BaseMVPFragment.smali) | `onCreateView`、`onDestroy` |

## com.zykj.mistake.dialog

| 类 | 方法摘录 |
|---|---|
| [BaseDialogFragment](../../../android/错题本/smali_classes3/com/zykj/mistake/dialog/BaseDialogFragment.smali) | `dismiss`、`onCreateView`、`onStart`、`onViewCreated` |

## com.zykj.mistake.entity

| 类 | 方法摘录 |
|---|---|
| [EditMistakeData](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/EditMistakeData.smali) | `getAnswer`、`getId`、`getStem`、`getStemShoot`、`getTag`、`getTitle`、`getTopicId` |

## com.zykj.mistake.entity.req

| 类 | 方法摘录 |
|---|---|
| [AddItemsToCollectionReq](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/req/AddItemsToCollectionReq.smali) | `getCollectionIds`、`getItemIds` |
| [AddMistakeQstReviewStateReq](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/req/AddMistakeQstReviewStateReq.smali) | `getItemId` |
| [AddPictureNoteReq](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/req/AddPictureNoteReq.smali) | `getMistakeItemId`、`getPictureNote` |
| [CreateOrUpdateCollectionReq](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/req/CreateOrUpdateCollectionReq.smali) | `getId`、`getName` |
| [CreateOrUpdateMistakeReq](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/req/CreateOrUpdateMistakeReq.smali) | `getAttainedLevel`、`getDiff`、`getErrorReason`、`getExtraAnswers`、`getExtraStems`、`getId`、`getStemShoot` |
| [CreateTagReq](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/req/CreateTagReq.smali) | `getId`、`getName`、`setId`、`setName` |
| [DeleteMyCollectionsReq](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/req/DeleteMyCollectionsReq.smali) | `getCollectionIds` |
| [GetCollectionItemsReq](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/req/GetCollectionItemsReq.smali) | `getCollectionId`、`getMaxResultCount`、`getSkipCount`、`getSortDirection`、`getSortType` |
| [MistakeListReq](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/req/MistakeListReq.smali) | `getAttainedLevel`、`getBookId`、`getDiff`、`getEndTime`、`getErrorReason`、`getHaveNoTag`、`getMaxResultCount` |
| [MonitorPictureReq](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/req/MonitorPictureReq.smali) | `getAppName`、`getPackageName`、`getPictures` |
| [MultiRemoveMistakeReq](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/req/MultiRemoveMistakeReq.smali) | `getBookId`、`getItemIds`、`setBookId`、`setItemIds` |
| [MultiSetTagsReq](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/req/MultiSetTagsReq.smali) | `getAttainedLevel`、`getBookId`、`getDiff`、`getErrorReason`、`getItemIds`、`getTagIdList`、`setAttainedLevel` |
| [RemoveItemsFromCollectionReq](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/req/RemoveItemsFromCollectionReq.smali) | `getCollectionId`、`getItemIds` |
| [RemovePicReq](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/req/RemovePicReq.smali) | `getMistakeItemId`、`getPictureNote` |
| [SearchMistakeCollectionReq](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/req/SearchMistakeCollectionReq.smali) | `getAttainedLevel`、`getCollectionId`、`getCurrentCollectionStatus`、`getDiff`、`getEndTime`、`getErrorReason`、`getMaxResultCount` |
| [SetMistakeQstItemDraftReq](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/req/SetMistakeQstItemDraftReq.smali) | `getDraft`、`getMistakeItemId`、`setDraft`、`setMistakeItemId` |
| [SetMistakeQstItemPracticeResultReq](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/req/SetMistakeQstItemPracticeResultReq.smali) | `getItemId`、`isCorrect` |
| [SetNoteReq](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/req/SetNoteReq.smali) | `getMistakeItemId`、`getNote`、`setMistakeItemId`、`setNote` |
| [StartReviewSessionReq](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/req/StartReviewSessionReq.smali) | `getMode` |
| [SubmitReviewResultReq](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/req/SubmitReviewResultReq.smali) | `getItemId`、`getSessionId`、`isCorrect` |
| [TokenReq](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/req/TokenReq.smali) | `getFc`、`getFe`、`getFo`、`getFr`、`getFt`、`getNonce`、`getSign` |
| [UpdatePictureNoteListReq](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/req/UpdatePictureNoteListReq.smali) | `getMistakeItemId`、`getPictureNotes` |

## com.zykj.mistake.entity.resp

| 类 | 方法摘录 |
|---|---|
| [CameraPermissionResp](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/resp/CameraPermissionResp.smali) | `getResult`、`setResult` |
| [CreateOrEditTagResp](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/resp/CreateOrEditTagResp.smali) | `getResult`、`setResult` |
| [CreateOrUpdateCollectionResp](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/resp/CreateOrUpdateCollectionResp.smali) | `getResult`、`setResult` |
| [CreateOrUpdateCollectionResult](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/resp/CreateOrUpdateCollectionResult.smali) | `getId`、`getName` |
| [CustomTagInfo](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/resp/CustomTagInfo.smali) | `getBindItemsCount`、`getId`、`getLocalType`、`getName`、`setBindItemsCount`、`setId`、`setLocalType` |
| [CustomTagInfoKt](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/resp/CustomTagInfoKt.smali) | `isSystemTag` |
| [GeneratorResp](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/resp/GeneratorResp.smali) | `getResult`、`setResult` |
| [GetMyTagResp](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/resp/GetMyTagResp.smali) | `getResult`、`setResult` |
| [GetNextReviewQuestionResp](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/resp/GetNextReviewQuestionResp.smali) | `getResult`、`setResult` |
| [MistakeBookFilterOptionsResp](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp.smali) | `getResult`、`setResult` |
| [MistakeBookResp](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/resp/MistakeBookResp.smali) | `getResult`、`setResult` |
| [MistakeCollectionListResp](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/resp/MistakeCollectionListResp.smali) | `getResult`、`setResult` |
| [MistakeCollectionListResult](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/resp/MistakeCollectionListResult.smali) | `getItems`、`getTotalCount` |
| [MistakeCollectionResp](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/resp/MistakeCollectionResp.smali) | `getCreationTime`、`getDescription`、`getId`、`getItemCount`、`getName` |
| [MistakeDetail](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/resp/MistakeDetail.smali) | `getAnswerInfos`、`getAttachments`、`getAttainedLevel`、`getBookId`、`getCollectionIds`、`getDiff`、`getDraft` |
| [MistakeDetailResp](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/resp/MistakeDetailResp.smali) | `getResult`、`setResult` |
| [MistakeGroupDetailResp](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/resp/MistakeGroupDetailResp.smali) | `getResult`、`setResult` |
| [MistakeListResp](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/resp/MistakeListResp.smali) | `getResult`、`setResult` |
| [NextReviewQuestionResult](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/resp/NextReviewQuestionResult.smali) | `getExamName`、`getHasStem`、`getId`、`getItemId`、`getName`、`getNumber`、`getQuestionDetail` |
| [ReviewHomeResp](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/resp/ReviewHomeResp.smali) | `getResult`、`setResult` |
| [ReviewHomeResult](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/resp/ReviewHomeResult.smali) | `getConsolidating`、`getMastered`、`getNeedStrengthen`、`getPerformance`、`getRecommend`、`getRecommendCount`、`getShouldDefaultReviewTab` |
| [ReviewPerformance](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/resp/ReviewPerformance.smali) | `getConsolidatingItemCount`、`getContinuousReviewDays`、`getMasteredItemCount`、`getNewMistakeCount`、`getPracticeDayCount`、`getPracticeQuestionCount`、`getSummaryText` |
| [ReviewPracticeMode](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/resp/ReviewPracticeMode.smali) | `getCanPractice`、`getCount`、`getDescription`、`getMode`、`getName` |
| [ReviewResultSummary](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/resp/ReviewResultSummary.smali) | `getHasMastered`、`getHasPromoted`、`getMasteredCount`、`getPromotedCount`、`getRightCount`、`getSubmittedCount`、`getTotalCount` |
| [SchoolYearResp](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/resp/SchoolYearResp.smali) | `getResult`、`setResult` |
| [SearchMistakeCollectionIdsResp](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/resp/SearchMistakeCollectionIdsResp.smali) | `getResult`、`setResult` |
| [SearchMistakeCollectionIdsResult](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/resp/SearchMistakeCollectionIdsResult.smali) | `getItemIds`、`getTotalCount` |
| [StartReviewSessionResp](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/resp/StartReviewSessionResp.smali) | `getResult`、`setResult` |
| [StartReviewSessionResult](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/resp/StartReviewSessionResult.smali) | `getConsolidatingCount`、`getHasQuestion`、`getMasteredCount`、`getMode`、`getNeedStrengthenCount`、`getSessionId`、`getTotalCount` |
| [SubjectResp](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/resp/SubjectResp.smali) | `getResult`、`setResult` |
| [SubmitReviewResult](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/resp/SubmitReviewResult.smali) | `getAfterNextReviewTime`、`getAfterStage`、`getBeforeNextReviewTime`、`getBeforeStage`、`getEnteredMastered`、`getItemId`、`getReviewRecordId` |
| [SubmitReviewResultResp](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/resp/SubmitReviewResultResp.smali) | `getResult`、`setResult` |
| [UserInfoResp](../../../android/错题本/smali_classes3/com/zykj/mistake/entity/resp/UserInfoResp.smali) | `getResult`、`setResult` |

## com.zykj.mistake.feature.ask

| 类 | 方法摘录 |
|---|---|
| [a0](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/ask/a0.smali) | `childSerializers`、`deserialize`、`getDescriptor`、`serialize`、`typeParametersSerializers` |
| [b0](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/ask/b0.smali) | `serializer` |
| [d0](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/ask/d0.smali) | `invoke` |
| [e0](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/ask/e0.smali) | `invoke` |
| [f0](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/ask/f0.smali) | `invoke` |
| [g0](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/ask/g0.smali) | `invoke` |
| [h0](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/ask/h0.smali) | `invoke` |
| [i0](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/ask/i0.smali) | `invoke` |
| [j0](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/ask/j0.smali) | `invoke` |
| [k0](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/ask/k0.smali) | `invoke` |
| [l0](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/ask/l0.smali) | `invoke` |
| [m0](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/ask/m0.smali) | `invoke` |

## com.zykj.mistake.feature.collection.detail

| 类 | 方法摘录 |
|---|---|
| [a1](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/collection/detail/a1.smali) | `invoke` |
| [b1](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/collection/detail/b1.smali) | `invoke` |
| [c1](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/collection/detail/c1.smali) | `invoke` |
| [d1](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/collection/detail/d1.smali) | `invoke` |
| [e1](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/collection/detail/e1.smali) | `invoke` |

## com.zykj.mistake.feature.collection.filter

| 类 | 方法摘录 |
|---|---|
| [t0](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/collection/filter/t0.smali) | `invoke` |
| [u0](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/collection/filter/u0.smali) | `invoke` |
| [v0](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/collection/filter/v0.smali) | `invoke` |
| [w0](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/collection/filter/w0.smali) | `invoke` |

## com.zykj.mistake.feature.collection.list

| 类 | 方法摘录 |
|---|---|
| [a0](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/collection/list/a0.smali) | `invoke` |
| [b0](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/collection/list/b0.smali) | `invoke` |

## com.zykj.mistake.feature.home

| 类 | 方法摘录 |
|---|---|
| [HomeTab](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/home/HomeTab.smali) | `getEntries`、`valueOf`、`values`、`getIndex` |

## com.zykj.mistake.feature.mistake.model

| 类 | 方法摘录 |
|---|---|
| [MistakeTagType](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/mistake/model/MistakeTagType.smali) | `getEntries`、`valueOf`、`values` |

## com.zykj.mistake.feature.notebook.detail

| 类 | 方法摘录 |
|---|---|
| [DraftActionMode](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/DraftActionMode.smali) | `getEntries`、`valueOf`、`values` |
| [a0](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/a0.smali) | `invoke` |
| [a4](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/a4.smali) | `invoke` |
| [b0](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/b0.smali) | `invoke` |
| [b4](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/b4.smali) | `invoke` |
| [c0](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/c0.smali) | `invoke` |
| [c5](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/c5.smali) | `handleMessage` |
| [d0](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/d0.smali) | `invoke` |
| [e0](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/e0.smali) | `invoke` |
| [h0](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/h0.smali) | `invoke` |
| [i0](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/i0.smali) | `invoke` |
| [j0](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/j0.smali) | `invoke` |
| [j4](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/j4.smali) | `invoke` |
| [k4](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/k4.smali) | `invoke` |
| [l0](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/l0.smali) | `invoke` |
| [l4](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/l4.smali) | `invoke` |
| [m0](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/m0.smali) | `invoke` |
| [m4](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/m4.smali) | `invoke` |
| [n4](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/n4.smali) | `invoke` |
| [o4](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/o4.smali) | `invoke` |
| [p3](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/p3.smali) | `invoke` |
| [p4](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/p4.smali) | `invoke` |
| [q3](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/q3.smali) | `invoke` |
| [r3](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/r3.smali) | `invoke` |
| [s3](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/s3.smali) | `invoke` |
| [t3](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/t3.smali) | `invoke` |
| [u3](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/u3.smali) | `invoke` |
| [u4](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/u4.smali) | `invoke` |
| [v3](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/v3.smali) | `invoke` |
| [w3](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/w3.smali) | `invoke` |
| [w4](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/w4.smali) | `invoke` |
| [x4](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/x4.smali) | `accept` |
| [y3](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/y3.smali) | `invoke` |
| [z3](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/z3.smali) | `invoke` |

## com.zykj.mistake.feature.notebook.list

| 类 | 方法摘录 |
|---|---|
| [JoinCollectionDialogMode](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/list/JoinCollectionDialogMode.smali) | `getEntries`、`valueOf`、`values` |
| [f1](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/list/f1.smali) | `invoke` |
| [g1](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/list/g1.smali) | `invoke` |
| [h1](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/list/h1.smali) | `invoke` |
| [j1](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/list/j1.smali) | `invoke` |
| [k1](../../../android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/list/k1.smali) | `invoke` |

## com.zykj.mistake.fragment

| 类 | 方法摘录 |
|---|---|
| [MistakeCollectionLegacyFragment](../../../android/错题本/smali_classes3/com/zykj/mistake/fragment/MistakeCollectionLegacyFragment.smali) | `onDestroy`、`onResume` |
| [NoteFragment](../../../android/错题本/smali_classes3/com/zykj/mistake/fragment/NoteFragment.smali) | `onCreate`、`onResume` |

## com.zykj.mistake.main

| 类 | 方法摘录 |
|---|---|
| [RemoveDialogTarget](../../../android/错题本/smali_classes3/com/zykj/mistake/main/RemoveDialogTarget.smali) | `getEntries`、`valueOf`、`values` |
| [TagEditorTarget](../../../android/错题本/smali_classes3/com/zykj/mistake/main/TagEditorTarget.smali) | `getEntries`、`valueOf`、`values` |
| [b1](../../../android/错题本/smali_classes3/com/zykj/mistake/main/b1.smali) | `invoke` |

## com.zykj.mistake.network

| 类 | 方法摘录 |
|---|---|
| [ApiException](../../../android/错题本/smali_classes3/com/zykj/mistake/network/ApiException.smali) | `getCode` |
| [ApiResp](../../../android/错题本/smali_classes3/com/zykj/mistake/network/ApiResp.smali) | `getErrorCode`、`getErrorMessage`、`getSuccess`、`getUnAuthorizedRequest`、`setSuccess`、`setUnAuthorizedRequest` |

## com.zykj.mistake.platform.picker

| 类 | 方法摘录 |
|---|---|
| [CollectionDatePickerTarget](../../../android/错题本/smali_classes3/com/zykj/mistake/platform/picker/CollectionDatePickerTarget.smali) | `getEntries`、`valueOf`、`values` |

## com.zykj.mistake.service

| 类 | 方法摘录 |
|---|---|
| [UploadFolderIntentService](../../../android/错题本/smali_classes3/com/zykj/mistake/service/UploadFolderIntentService.smali) | `onHandleIntent` |
| [UploadIntentService](../../../android/错题本/smali_classes3/com/zykj/mistake/service/UploadIntentService.smali) | `onHandleIntent` |

## com.zykj.mistake.update.network

| 类 | 方法摘录 |
|---|---|
| [UpdateResp](../../../android/错题本/smali_classes3/com/zykj/mistake/update/network/UpdateResp.smali) | `getError`、`getResult`、`getSuccess`、`setError`、`setResult`、`setSuccess` |

## com.zykj.mistake.update.view

| 类 | 方法摘录 |
|---|---|
| [PercentCircleView](../../../android/错题本/smali_classes3/com/zykj/mistake/update/view/PercentCircleView.smali) | `onDraw`、`onLayout`、`onMeasure`、`setTargetPercent` |

## com.zykj.mistake.utils

| 类 | 方法摘录 |
|---|---|
| [NoteRemoteFileInfo](../../../android/错题本/smali_classes3/com/zykj/mistake/utils/NoteRemoteFileInfo.smali) | `getMd5`、`getUrl` |
| [QuestionType](../../../android/错题本/smali_classes3/com/zykj/mistake/utils/QuestionType.smali) | `getEntries`、`valueOf`、`values`、`getType`、`getTypeName`、`setType`、`setTypeName` |

## com.zykj.mistake.widget

| 类 | 方法摘录 |
|---|---|
| [BaseProView](../../../android/错题本/smali_classes3/com/zykj/mistake/widget/BaseProView.smali) | `getLightColor`、`getLightPaint`、`getMaxProgress`、`getProgress`、`getProgressBgPaint`、`getProgressColor`、`getProgressColorBackground` |
| [CustomViewPager](../../../android/错题本/smali_classes3/com/zykj/mistake/widget/CustomViewPager.smali) | `onInterceptTouchEvent`、`onTouchEvent`、`setSlidingEnabled` |
| [FlowLayout](../../../android/错题本/smali_classes3/com/zykj/mistake/widget/FlowLayout.smali) | `generateLayoutParams`、`getFirstSelectedIndex`、`onLayout`、`onMeasure` |
| [IntrinsicWidthImageView](../../../android/错题本/smali_classes3/com/zykj/mistake/widget/IntrinsicWidthImageView.smali) | `onMeasure`、`setForceOrigin` |
| [LineBaseProView](../../../android/错题本/smali_classes3/com/zykj/mistake/widget/LineBaseProView.smali) | `getLeftBottomRadius`、`getLeftTopRadius`、`getProgressRadius`、`getRadius`、`getRightBottomRadius`、`getRightTopRadius`、`setLeftBottomRadius` |
| [LineBottomProView](../../../android/错题本/smali_classes3/com/zykj/mistake/widget/LineBottomProView.smali) | `getBoxPaint`、`getBoxRadius`、`getBoxWidth`、`onDraw`、`setBoxPaint`、`setBoxRadius`、`setBoxWidth` |
| [ResizableImageView](../../../android/错题本/smali_classes3/com/zykj/mistake/widget/ResizableImageView.smali) | `onMeasure` |
| [StemWebView](../../../android/错题本/smali_classes3/com/zykj/mistake/widget/StemWebView.smali) | `getCurrentPageBitmap`、`getPageFinishListener`、`setPageFinishListener`、`setRemoveEmptyStemTopSpacing`、`setScaleButtonsVisible`、`setZoomOffset` |
| [ToggleRadioButton](../../../android/错题本/smali_classes3/com/zykj/mistake/widget/ToggleRadioButton.smali) | `toggle` |
| [WrapLinearLayout](../../../android/错题本/smali_classes3/com/zykj/mistake/widget/WrapLinearLayout.smali) | `getGravity`、`getHorizontal_Space`、`getVertical_Space`、`onLayout`、`onMeasure`、`setGravity`、`setHorizontal_Space` |

## com.zykj.paint

| 类 | 方法摘录 |
|---|---|
| [Actions](../../../android/错题本/smali_classes3/com/zykj/paint/Actions.smali) | `getDescriptor`、`registerAllExtensions`、`registerAllExtensions` |
| [SketchSyncView](../../../android/错题本/smali_classes3/com/zykj/paint/SketchSyncView.smali) | `ezyColor`、`handleEvent`、`handleMultiFingerEvent`、`addAction`、`addMatrixAction`、`addPenTempPolylinePoint`、`addSketchAction` |

## com.zykj.paint.data

| 类 | 方法摘录 |
|---|---|
| [Rect2D](../../../android/错题本/smali_classes3/com/zykj/paint/data/Rect2D.smali) | `nestPoint`、`nestRect`、`scaleRect`、`ToRectF`、`getHeight`、`getMiddle`、`getWidth` |

## com.zykj.paint.draw

| 类 | 方法摘录 |
|---|---|
| [ISketchDraw](../../../android/错题本/smali_classes3/com/zykj/paint/draw/ISketchDraw.smali) | `cleanAll`、`hasDraw`、`touchDown`、`touchMove`、`touchUp` |
| [PolylineDrawer](../../../android/错题本/smali_classes3/com/zykj/paint/draw/PolylineDrawer.smali) | `cleanAll`、`hasDraw`、`touchDown`、`touchMove`、`touchUp` |

## com.zykj.paint.extensions

| 类 | 方法摘录 |
|---|---|
| [GraphExtKt](../../../android/错题本/smali_classes3/com/zykj/paint/extensions/GraphExtKt.smali) | `inverts`、`mapPoint`、`mapPoint`、`mapPoint` |

## com.zykj.paint.graphic

| 类 | 方法摘录 |
|---|---|
| [Graph](../../../android/错题本/smali_classes3/com/zykj/paint/graphic/Graph.smali) | `addGraph`、`directRender`、`getBaseColor`、`getBoundBox`、`getGraphs`、`getName`、`isVisable` |
| [Layer](../../../android/错题本/smali_classes3/com/zykj/paint/graphic/Layer.smali) | `directRender`、`findGraph`、`getBoundBox`、`render`、`render` |
| [Map](../../../android/错题本/smali_classes3/com/zykj/paint/graphic/Map.smali) | `addLayer`、`directRender`、`getBoundBox`、`getCurrentLayer`、`render`、`render`、`reset` |
| [PolyLine](../../../android/错题本/smali_classes3/com/zykj/paint/graphic/PolyLine.smali) | `directRender`、`directRender`、`getBoundBox`、`render`、`render` |
| [RectBmp](../../../android/错题本/smali_classes3/com/zykj/paint/graphic/RectBmp.smali) | `directRender`、`getBoundBox`、`release`、`render`、`render`、`setDstVector`、`setFilePath` |

## com.zykj.paint.player

| 类 | 方法摘录 |
|---|---|
| [PlayActionListener](../../../android/错题本/smali_classes3/com/zykj/paint/player/PlayActionListener.smali) | `onPause`、`onPlayEnd`、`onRerecord`、`onResume` |
| [PlayStatusListener](../../../android/错题本/smali_classes3/com/zykj/paint/player/PlayStatusListener.smali) | `onPlayEnd`、`onPlayPause`、`onPlayStart`、`onUpdate` |

## com.zykj.paint.record

| 类 | 方法摘录 |
|---|---|
| [AESUtils](../../../android/错题本/smali_classes3/com/zykj/paint/record/AESUtils.smali) | `Decrypt`、`Encrypt`、`decrypt`、`decryptVoice`、`encrypt`、`encryptVoice`、`getRawKey` |
| [AmrEncoder](../../../android/错题本/smali_classes3/com/zykj/paint/record/AmrEncoder.smali) | `encode` |
| [AudioEncoder](../../../android/错题本/smali_classes3/com/zykj/paint/record/AudioEncoder.smali) | `encode`、`getDestFile`、`getMediaFormat` |
| [AudioFileUtils](../../../android/错题本/smali_classes3/com/zykj/paint/record/AudioFileUtils.smali) | `clearPcmFiles`、`deleteDir`、`deleteDirWithFile`、`getAmrFileAbsolutePath`、`getAmrFiles`、`getPcmFileAbsolutePath`、`getPcmFiles` |
| [AudioRecorder](../../../android/错题本/smali_classes3/com/zykj/paint/record/AudioRecorder.smali) | `getInstance`、`makePCMFile2Amr`、`makePCMFileToWAVFile`、`mergePCMFilesToWAVFile`、`writeDataTOFile`、`canel`、`clearTempRecord` |
| [PcmToWav](../../../android/错题本/smali_classes3/com/zykj/paint/record/PcmToWav.smali) | `clearFiles`、`makePCMFileToWAVFile`、`mergePCMFilesToWAVFile`、`wavFileHeader` |
| [RecordListener](../../../android/错题本/smali_classes3/com/zykj/paint/record/RecordListener.smali) | `recordPause`、`recordResume` |
| [RecordStreamListener](../../../android/错题本/smali_classes3/com/zykj/paint/record/RecordStreamListener.smali) | `recordOfByte` |
| [WaveHeader](../../../android/错题本/smali_classes3/com/zykj/paint/record/WaveHeader.smali) | `WriteChar`、`WriteInt`、`WriteShort`、`getHeader` |

## com.zykj.paint.record.control

| 类 | 方法摘录 |
|---|---|
| [BaseControl](../../../android/错题本/smali_classes3/com/zykj/paint/record/control/BaseControl.smali) | `getBitmapPoints`、`getBitmapPoints`、`getDistance`、`getDistance`、`getRotation`、`getRotation`、`midPoint` |
| [CompassesControl](../../../android/错题本/smali_classes3/com/zykj/paint/record/control/CompassesControl.smali) | `circleCheck`、`isTouchInGraph`、`pointCheck`、`cleanAll`、`getGraphSnapShot`、`hasDraw`、`touchDown` |
| [DefaultControl](../../../android/错题本/smali_classes3/com/zykj/paint/record/control/DefaultControl.smali) | `cleanAll`、`getGraphSnapShot`、`hasDraw`、`touchDown`、`touchMove`、`touchPointerDown`、`touchPointerUp` |
| [EraserControl](../../../android/错题本/smali_classes3/com/zykj/paint/record/control/EraserControl.smali) | `cleanAll`、`getGraphSnapShot`、`hasDraw`、`touchDown`、`touchMove`、`touchPointerDown`、`touchPointerUp` |
| [ISketchControl](../../../android/错题本/smali_classes3/com/zykj/paint/record/control/ISketchControl.smali) | `cleanAll`、`getGraphSnapShot`、`hasDraw`、`touchDown`、`touchMove`、`touchPointerDown`、`touchPointerUp` |
| [MapControl](../../../android/错题本/smali_classes3/com/zykj/paint/record/control/MapControl.smali) | `cleanAll`、`getGraphSnapShot`、`hasDraw`、`tempDraw`、`touchDown`、`touchMove`、`touchPointerDown` |
| [PenControl](../../../android/错题本/smali_classes3/com/zykj/paint/record/control/PenControl.smali) | `cleanAll`、`getGraphSnapShot`、`hasDraw`、`touchDown`、`touchMove`、`touchPointerDown`、`touchPointerUp` |
| [PictureControl](../../../android/错题本/smali_classes3/com/zykj/paint/record/control/PictureControl.smali) | `circleCheck`、`getActionMode`、`isTouchInGraph`、`pointCheck`、`cleanAll`、`getGraphSnapShot`、`hasDraw` |
| [RulerControl](../../../android/错题本/smali_classes3/com/zykj/paint/record/control/RulerControl.smali) | `cleanAll`、`getGraphSnapShot`、`hasDraw`、`touchDown`、`touchMove`、`touchPointerDown`、`touchPointerUp` |

## com.zykj.paint.record.model

| 类 | 方法摘录 |
|---|---|
| [CompassSnapShot](../../../android/错题本/smali_classes3/com/zykj/paint/record/model/CompassSnapShot.smali) | `calculateRadius`、`getCompassMode`、`onGraphChange`、`setCenterPoint`、`setDownMatrix`、`updateGraph` |
| [GraphSnapShot](../../../android/错题本/smali_classes3/com/zykj/paint/record/model/GraphSnapShot.smali) | `calculateDegree`、`calculateDegree`、`delByLines`、`exactCalculateDegree`、`exactCalculateDegree`、`getActionMode`、`getPointsLength` |
| [MapSnapShot](../../../android/错题本/smali_classes3/com/zykj/paint/record/model/MapSnapShot.smali) | `randomColor`、`updateSketchSnapshot`、`addStickyEzyPath`、`clear`、`delByLines`、`getBitmapPoints`、`setSelect` |
| [PictureSnapShot](../../../android/错题本/smali_classes3/com/zykj/paint/record/model/PictureSnapShot.smali) | `randomColor`、`updateSketchSnapshot`、`updateSketchWithLocalProtobufData`、`addStickyEzyPath`、`delByLines`、`getBitmapPoints`、`setSelect` |
| [RulerSnapShot](../../../android/错题本/smali_classes3/com/zykj/paint/record/model/RulerSnapShot.smali) | `isInDrawGraphRect`、`setDownScale`、`setScaleMatrix` |

## com.zykj.paint.render

| 类 | 方法摘录 |
|---|---|
| [MapRender](../../../android/错题本/smali_classes3/com/zykj/paint/render/MapRender.smali) | `clear`、`directDrawBitmap`、`directDrawPolyLine`、`drawBezierLine`、`drawBitmap`、`drawBitmap`、`drawPolyLine` |
| [MapViewer](../../../android/错题本/smali_classes3/com/zykj/paint/render/MapViewer.smali) | `GeoRect2ViewRect`、`clear`、`destroy`、`directRenderAll`、`geoVector2ViewVector`、`geoVector2ViewVector`、`moveViewPort` |
| [SketchPlayer](../../../android/错题本/smali_classes3/com/zykj/paint/render/SketchPlayer.smali) | `getTotalTime`、`playMusic`、`playWithLocalSource`、`destroyPlayer`、`getSnapshot`、`hideSeekBar`、`pausePlayer` |
| [SketchRender](../../../android/错题本/smali_classes3/com/zykj/paint/render/SketchRender.smali) | `clear`、`directDrawBitmap`、`directDrawPolyLine`、`drawBezierLine`、`drawBitmap`、`drawBitmap`、`drawPolyLine` |
| [SketchViewer](../../../android/错题本/smali_classes3/com/zykj/paint/render/SketchViewer.smali) | `getScaleMatrix`、`getTotalTime`、`playMusic`、`renderTemp`、`getCapture`、`getTotalTime`、`isEnded` |

## com.zykj.paint.runner

| 类 | 方法摘录 |
|---|---|
| [ActionProcessor](../../../android/错题本/smali_classes3/com/zykj/paint/runner/ActionProcessor.smali) | `addAction`、`addMultiAction`、`destroy`、`pause`、`renderAction`、`renderHistory`、`renderImage` |
| [ActionRunner](../../../android/错题本/smali_classes3/com/zykj/paint/runner/ActionRunner.smali) | `pause`、`resume` |
| [ImageActionRunner](../../../android/错题本/smali_classes3/com/zykj/paint/runner/ImageActionRunner.smali) | `getSourceUrl`、`pause`、`resume`、`setSourceUrl` |
| [LayerActionRunner](../../../android/错题本/smali_classes3/com/zykj/paint/runner/LayerActionRunner.smali) | `pause`、`resume` |
| [MatrixActionRunner](../../../android/错题本/smali_classes3/com/zykj/paint/runner/MatrixActionRunner.smali) | `pause`、`resume` |
| [MoveActionRunner](../../../android/错题本/smali_classes3/com/zykj/paint/runner/MoveActionRunner.smali) | `pause`、`resume` |
| [PolylineActionRunner](../../../android/错题本/smali_classes3/com/zykj/paint/runner/PolylineActionRunner.smali) | `processPreActions`、`getTaskScheduledExecutorService`、`isImmediate`、`pause`、`resume`、`setImmediate`、`setTaskScheduledExecutorService` |
| [ZoomActionRunner](../../../android/错题本/smali_classes3/com/zykj/paint/runner/ZoomActionRunner.smali) | `pause`、`resume` |

## com.zykj.paint.util

| 类 | 方法摘录 |
|---|---|
| [LineUtils](../../../android/错题本/smali_classes3/com/zykj/paint/util/LineUtils.smali) | `lineSpace`、`point2Line`、`point2Polyline`、`pointToLine` |
| [TimeUtils](../../../android/错题本/smali_classes3/com/zykj/paint/util/TimeUtils.smali) | `formatPhotoDate`、`formatPhotoDate`、`formatTime`、`getNowTimeString`、`timeFormat` |

## com.zykj.sketch

| 类 | 方法摘录 |
|---|---|
| [EzyDrawBoard](../../../android/错题本/smali_classes3/com/zykj/sketch/EzyDrawBoard.smali) | `getDescriptor`、`registerAllExtensions`、`registerAllExtensions` |
| [GraphSnapshot](../../../android/错题本/smali_classes3/com/zykj/sketch/GraphSnapshot.smali) | `getDescriptor`、`registerAllExtensions`、`registerAllExtensions` |
| [SketchHeader](../../../android/错题本/smali_classes3/com/zykj/sketch/SketchHeader.smali) | `getDescriptor`、`registerAllExtensions`、`registerAllExtensions` |

## com.zykj.sketch.core

| 类 | 方法摘录 |
|---|---|
| [ActionExecute](../../../android/错题本/smali_classes3/com/zykj/sketch/core/ActionExecute.smali) | `addNewGraph`、`buildHistoryGraph`、`setAttribute`、`setAttribute2`、`addViewControl`、`buildGraph`、`buildMatrix` |
| [ActionRecord](../../../android/错题本/smali_classes3/com/zykj/sketch/core/ActionRecord.smali) | `buildActionContent`、`buildHistoryRendData`、`notifyListener`、`addActionChangeListener`、`addHistoryRecord`、`addHistoryRenderGraphSnapshot`、`addNextPrevListener` |
| [ActionRecordExecute](../../../android/错题本/smali_classes3/com/zykj/sketch/core/ActionRecordExecute.smali) | `addRecord`、`onActionModeEvent`、`onAddImageEvent`、`onAddPPTEvent`、`onAudioStartRecord`、`onAudioStopRecord`、`onClearBoardEvent` |
| [ActionStrategyFactory](../../../android/错题本/smali_classes3/com/zykj/sketch/core/ActionStrategyFactory.smali) | `getActionGraphName`、`getGraphName`、`buildActionMode`、`clearAction`、`create`、`getAction`、`parseActionMode` |
| [GraphControl](../../../android/错题本/smali_classes3/com/zykj/sketch/core/GraphControl.smali) | `handleDeleteListener`、`initGraphConfig`、`clear`、`clearTempPaint`、`findGraph`、`findSelectGraph`、`forceRender` |

## com.zykj.sketch.core.action

| 类 | 方法摘录 |
|---|---|
| [BaseAction](../../../android/错题本/smali_classes3/com/zykj/sketch/core/action/BaseAction.smali) | `getTouchEventList`、`getTouchStartTime`、`isRecord`、`isTouchEnable`、`onTouchDown`、`onTouchMove`、`onTouchPointerDown` |
| [EraseViewAction](../../../android/错题本/smali_classes3/com/zykj/sketch/core/action/EraseViewAction.smali) | `deleteGraph`、`handleListener`、`enumType`、`onTouchDown` |
| [EraseWritingAction](../../../android/错题本/smali_classes3/com/zykj/sketch/core/action/EraseWritingAction.smali) | `deleteGraph`、`enumType`、`onTouchDown`、`onTouchMove`、`onTouchPointerDown`、`onTouchPointerUp`、`onTouchUp` |
| [SelectAction](../../../android/错题本/smali_classes3/com/zykj/sketch/core/action/SelectAction.smali) | `initTempValue`、`enumType`、`getMode`、`onTouchDown`、`onTouchMove`、`onTouchPointerDown`、`onTouchPointerUp` |
| [WritingAction](../../../android/错题本/smali_classes3/com/zykj/sketch/core/action/WritingAction.smali) | `createGraph`、`enumType`、`getGraph`、`getMX`、`getMY`、`getParentGraphName`、`getPath` |
| [WritingAndMoveAction](../../../android/错题本/smali_classes3/com/zykj/sketch/core/action/WritingAndMoveAction.smali) | `initTempValue`、`enumType`、`getGraph`、`getMX`、`getMY`、`getParentGraphName`、`getPath` |
| [WritingAndMoveVerticalAction](../../../android/错题本/smali_classes3/com/zykj/sketch/core/action/WritingAndMoveVerticalAction.smali) | `initTempValue`、`enumType`、`getGraph`、`getMX`、`getMY`、`getParentGraphName`、`getPath` |

## com.zykj.sketch.core.config

| 类 | 方法摘录 |
|---|---|
| [GraphConfig](../../../android/错题本/smali_classes3/com/zykj/sketch/core/config/GraphConfig.smali) | `getColor`、`getWidth`、`setColor`、`setWidth` |
| [SketchConfig](../../../android/错题本/smali_classes3/com/zykj/sketch/core/config/SketchConfig.smali) | `getContext`、`getMaxImageCount`、`getMaxPPTCount`、`getSourcePath`、`isTouchable`、`setMaxImageCount`、`setMaxPPTCount` |

## com.zykj.sketch.core.data

| 类 | 方法摘录 |
|---|---|
| [AudioTask](../../../android/错题本/smali_classes3/com/zykj/sketch/core/data/AudioTask.smali) | `getDuration`、`getFileName`、`getPath`、`getStartTime`、`setDuration`、`setPath` |
| [CORNER](../../../android/错题本/smali_classes3/com/zykj/sketch/core/data/CORNER.smali) | `valueOf`、`values` |
| [GraphTask](../../../android/错题本/smali_classes3/com/zykj/sketch/core/data/GraphTask.smali) | `getActionContent`、`getExecuteVoid`、`getHasSnapshot`、`getSnapshotVoid`、`getStartTime` |
| [Mode](../../../android/错题本/smali_classes3/com/zykj/sketch/core/data/Mode.smali) | `valueOf`、`values` |
| [PlayStatus](../../../android/错题本/smali_classes3/com/zykj/sketch/core/data/PlayStatus.smali) | `valueOf`、`values`、`getState`、`getStateName`、`setState`、`setStateName` |
| [RenderTask](../../../android/错题本/smali_classes3/com/zykj/sketch/core/data/RenderTask.smali) | `getAudioTaskList`、`getGraphTask`、`getLastSnapshot`、`getProgress`、`setLastSnapshot`、`setProgress` |
| [ThumbnailBean](../../../android/错题本/smali_classes3/com/zykj/sketch/core/data/ThumbnailBean.smali) | `getBitmap`、`getLimitRenderRectF`、`getMaxRenderRectF` |

## com.zykj.sketch.core.graph

| 类 | 方法摘录 |
|---|---|
| [BoundedContainerGraph](../../../android/错题本/smali_classes3/com/zykj/sketch/core/graph/BoundedContainerGraph.smali) | `getSnapshot`、`graphType`、`onMeasure` |
| [CircleGraph](../../../android/错题本/smali_classes3/com/zykj/sketch/core/graph/CircleGraph.smali) | `onMeasure`、`render` |
| [Graph](../../../android/错题本/smali_classes3/com/zykj/sketch/core/graph/Graph.smali) | `drawBorder`、`showDelete`、`addGraph`、`cancelSelected`、`childTypeNumber`、`clear`、`findGraph` |
| [GraphExtKt](../../../android/错题本/smali_classes3/com/zykj/sketch/core/graph/GraphExtKt.smali) | `convert2FM`、`convert2WM`、`getFP2WPMatrix`、`getFP2WPRendMatrix`、`getWP2FPMatrix`、`getWP2LPMatrix`、`initPaint` |
| [ImageGraph](../../../android/错题本/smali_classes3/com/zykj/sketch/core/graph/ImageGraph.smali) | `getTranslateCenterMatrix`、`reloadBitmap`、`checkOldData`、`getFileName`、`getSnapshot`、`graphType`、`onMeasure` |
| [ImageHistoryGraph](../../../android/错题本/smali_classes3/com/zykj/sketch/core/graph/ImageHistoryGraph.smali) | `getSaleCenterMatrix`、`getFileName`、`getSnapshot`、`graphType`、`onDestroy`、`onDraw`、`onMeasure` |
| [RectGraph](../../../android/错题本/smali_classes3/com/zykj/sketch/core/graph/RectGraph.smali) | `onMeasure`、`render` |
| [StrokeGraph](../../../android/错题本/smali_classes3/com/zykj/sketch/core/graph/StrokeGraph.smali) | `isIntersect`、`addFPPoint`、`addPoint`、`addPoint`、`findGraph`、`getActionControl`、`getSnapshot` |
| [UnBoundedContainerGraph](../../../android/错题本/smali_classes3/com/zykj/sketch/core/graph/UnBoundedContainerGraph.smali) | `getSnapshot`、`graphType`、`isInRect`、`onMeasure` |
| [ViewGraph](../../../android/错题本/smali_classes3/com/zykj/sketch/core/graph/ViewGraph.smali) | `compressImage` |
| [WebViewGraph](../../../android/错题本/smali_classes3/com/zykj/sketch/core/graph/WebViewGraph.smali) | `getSaleCenterMatrix`、`startRefresh`、`getBitmap`、`getCompressbitmap`、`getSnapshot`、`graphType`、`onDestroy` |
| [WritingGroupGraph](../../../android/错题本/smali_classes3/com/zykj/sketch/core/graph/WritingGroupGraph.smali) | `addGraph`、`createPath`、`crossLine`、`getIntersectGraph`、`getIntersectGraph`、`getSnapshot`、`graphType` |

## com.zykj.sketch.core.listener

| 类 | 方法摘录 |
|---|---|
| [ActionChangeListener](../../../android/错题本/smali_classes3/com/zykj/sketch/core/listener/ActionChangeListener.smali) | `change` |
| [AudioOperation](../../../android/错题本/smali_classes3/com/zykj/sketch/core/listener/AudioOperation.smali) | `isRecord`、`setProgressListener`、`startRecord`、`stopRecord` |
| [EventListener](../../../android/错题本/smali_classes3/com/zykj/sketch/core/listener/EventListener.smali) | `addViewControl`、`graphSnapShot`、`graphSnapShot`、`initConfig`、`onActionModeEvent`、`onAddImageEvent`、`onAddPPTEvent` |
| [GraphMatrixListener](../../../android/错题本/smali_classes3/com/zykj/sketch/core/listener/GraphMatrixListener.smali) | `onScale`、`onTranslation` |
| [IAction](../../../android/错题本/smali_classes3/com/zykj/sketch/core/listener/IAction.smali) | `enumType`、`getTouchEventList`、`getTouchStartTime`、`isRecord`、`onTouchDown`、`onTouchMove`、`onTouchPointerDown` |
| [IControl](../../../android/错题本/smali_classes3/com/zykj/sketch/core/listener/IControl.smali) | `clear`、`clearTempPaint`、`findGraph`、`findSelectGraph`、`forceRender`、`getBackgroundColor`、`getCameraMatrix` |
| [IDraw](../../../android/错题本/smali_classes3/com/zykj/sketch/core/listener/IDraw.smali) | `onDraw`、`onDrawComplete`、`render` |
| [IGraph](../../../android/错题本/smali_classes3/com/zykj/sketch/core/listener/IGraph.smali) | `findGraphByName`、`findGraphByType`、`getGraphName`、`getSnapshot`、`graphType`、`isComplete`、`isInRect` |
| [IUserPlay](../../../android/错题本/smali_classes3/com/zykj/sketch/core/listener/IUserPlay.smali) | `addPlayActionListener`、`destroy`、`getPlayStatus`、`loadData`、`pause`、`removePlayActionListener`、`seekTo` |
| [ImageDeleteListener](../../../android/错题本/smali_classes3/com/zykj/sketch/core/listener/ImageDeleteListener.smali) | `onDeleteImagePath` |
| [ImitateDraw](../../../android/错题本/smali_classes3/com/zykj/sketch/core/listener/ImitateDraw.smali) | `clearGraph`、`drawPath`、`drawThumbnail`、`graphMatrix`、`setLimitDrawArea` |
| [ModeChangeListener](../../../android/错题本/smali_classes3/com/zykj/sketch/core/listener/ModeChangeListener.smali) | `onChange` |
| [NextPrevListener](../../../android/错题本/smali_classes3/com/zykj/sketch/core/listener/NextPrevListener.smali) | `listener` |
| [PPTControl](../../../android/错题本/smali_classes3/com/zykj/sketch/core/listener/PPTControl.smali) | `goPage`、`nextAction`、`nextSlide`、`preAction`、`preSlide` |
| [PPTListener](../../../android/错题本/smali_classes3/com/zykj/sketch/core/listener/PPTListener.smali) | `currentPage`、`onPageFinished`、`totalPageCount` |
| [PlayActionListener](../../../android/错题本/smali_classes3/com/zykj/sketch/core/listener/PlayActionListener.smali) | `onPlayEnd`、`onPlayPause`、`onPlayStart`、`onProgress`、`onWaitPlay` |
| [ProgressListener](../../../android/错题本/smali_classes3/com/zykj/sketch/core/listener/ProgressListener.smali) | `progress`、`recordError` |
| [RealDraw](../../../android/错题本/smali_classes3/com/zykj/sketch/core/listener/RealDraw.smali) | `drawGraph`、`setDrawBackground`、`setLimitDrawArea`、`shutdown` |

## com.zykj.sketch.core.player

| 类 | 方法摘录 |
|---|---|
| [AudioThread](../../../android/错题本/smali_classes3/com/zykj/sketch/core/player/AudioThread.smali) | `getTotalDuration`、`initMediaPlayer`、`notifyProgress`、`resetMediaPlay`、`stopAllAudio`、`initSeekTo`、`pausePlay` |
| [PaintThread](../../../android/错题本/smali_classes3/com/zykj/sketch/core/player/PaintThread.smali) | `getTotalDuration`、`notifyProgress`、`initSeekTo`、`pausePlay`、`resumePlay`、`seekTo`、`setData` |
| [PlayControl](../../../android/错题本/smali_classes3/com/zykj/sketch/core/player/PlayControl.smali) | `checkAudioFile`、`parseDrawBoardData`、`addPlayActionListener`、`getPlayStatus`、`loadData`、`onDestroy`、`pause` |
| [PlayThread](../../../android/错题本/smali_classes3/com/zykj/sketch/core/player/PlayThread.smali) | `getPlayStatus`、`getStatus`、`pausePlay`、`reset`、`resumePlay`、`setPlayStatus`、`shutdown` |
| [SketchPlayerView](../../../android/错题本/smali_classes3/com/zykj/sketch/core/player/SketchPlayerView.smali) | `getLoadDataExecutor`、`getSeekExecutor`、`runAtLeastCreated`、`addPlayActionListener`、`destroy`、`getPlayStatus`、`isRend` |

## com.zykj.sketch.core.record

| 类 | 方法摘录 |
|---|---|
| [AudioControl](../../../android/错题本/smali_classes3/com/zykj/sketch/core/record/AudioControl.smali) | `addListener`、`isRecord`、`reset`、`startRecord`、`stopRecord` |
| [GraphOperation](../../../android/错题本/smali_classes3/com/zykj/sketch/core/record/GraphOperation.smali) | `addImage`、`addImage`、`addImage`、`addImage`、`addPPT`、`clear`、`getConfig` |
| [RecordControl](../../../android/错题本/smali_classes3/com/zykj/sketch/core/record/RecordControl.smali) | `addImage`、`countScale`、`executeActionContent`、`executeTask`、`getImagePath`、`saveBitmap`、`addActionChangeListener` |
| [SketchRecorderView](../../../android/错题本/smali_classes3/com/zykj/sketch/core/record/SketchRecorderView.smali) | `addImage`、`addImage`、`addImage`、`addImage`、`addPPT`、`clear`、`getConfig` |

## com.zykj.sketch.core.version

| 类 | 方法摘录 |
|---|---|
| [GraphTaskParseVersion1](../../../android/错题本/smali_classes3/com/zykj/sketch/core/version/GraphTaskParseVersion1.smali) | `parseEventAsTask`、`parse` |
| [GraphTaskParseVersion3](../../../android/错题本/smali_classes3/com/zykj/sketch/core/version/GraphTaskParseVersion3.smali) | `addGraphTask`、`countTaskStartTime`、`deleteSnapShot`、`parseEventAsTask`、`parseEventAsTask`、`getFlag`、`parse` |
| [GraphTaskParseVersion4](../../../android/错题本/smali_classes3/com/zykj/sketch/core/version/GraphTaskParseVersion4.smali) | `addGraphTask`、`countTaskStartTime`、`deleteSnapShot`、`parseEventAsTask`、`parseEventAsTask`、`getFlag`、`parse` |
| [GraphTaskParseVersion5](../../../android/错题本/smali_classes3/com/zykj/sketch/core/version/GraphTaskParseVersion5.smali) | `addGraphTask`、`countTaskStartTime`、`deleteSnapShot`、`parseEventAsTask`、`parseEventAsTask`、`getFlag`、`parse` |
| [ITaskParse](../../../android/错题本/smali_classes3/com/zykj/sketch/core/version/ITaskParse.smali) | `parse` |

## com.zykj.sketch.extensions

| 类 | 方法摘录 |
|---|---|
| [ExtensionsKt](../../../android/错题本/smali_classes3/com/zykj/sketch/extensions/ExtensionsKt.smali) | `capture`、`getDegree`、`getDistance`、`getDistance`、`getMidPoint`、`getRotation`、`lineSpace` |

## com.zykj.sketch.utils

| 类 | 方法摘录 |
|---|---|
| [ToastUtils](../../../android/错题本/smali_classes3/com/zykj/sketch/utils/ToastUtils.smali) | `showLong`、`showLong`、`showShort`、`showShort` |

## com.zykj.sketch.widgets

| 类 | 方法摘录 |
|---|---|
| [DrawTempView](../../../android/错题本/smali_classes3/com/zykj/sketch/widgets/DrawTempView.smali) | `clearGraph`、`drawPath`、`drawThumbnail`、`graphMatrix`、`onDraw`、`setLimitDrawArea` |
| [DrawView](../../../android/错题本/smali_classes3/com/zykj/sketch/widgets/DrawView.smali) | `drawGraph`、`onDraw`、`setDrawBackground`、`setLimitDrawArea`、`shutdown` |
| [PPTWebView](../../../android/错题本/smali_classes3/com/zykj/sketch/widgets/PPTWebView.smali) | `goPage`、`loadSlider`、`nextAction`、`nextSlide`、`onTouchEvent`、`preAction`、`preSlide` |
| [SurfaceDrawView](../../../android/错题本/smali_classes3/com/zykj/sketch/widgets/SurfaceDrawView.smali) | `drawGraph`、`setDrawBackground`、`setLimitDrawArea`、`shutdown`、`surfaceChanged`、`surfaceCreated`、`surfaceDestroyed` |
| [TempView](../../../android/错题本/smali_classes3/com/zykj/sketch/widgets/TempView.smali) | `onDraw`、`rectConvertRegion` |
| [TextureDrawView](../../../android/错题本/smali_classes3/com/zykj/sketch/widgets/TextureDrawView.smali) | `dispatchVisibilityChanged`、`drawGraph`、`isRend`、`onDetachedFromWindow`、`onSurfaceTextureAvailable`、`onSurfaceTextureDestroyed`、`onSurfaceTextureSizeChanged` |

## com.zykj.view

| 类 | 方法摘录 |
|---|---|
| [DataBinderMapperImpl](../../../android/错题本/smali_classes3/com/zykj/view/DataBinderMapperImpl.smali) | `collectDependencies`、`convertBrIdToString`、`getDataBinder`、`getDataBinder`、`getLayoutId` |
| [EzySimpleBoardData](../../../android/错题本/smali_classes3/com/zykj/view/EzySimpleBoardData.smali) | `registerAllExtensions` |

## com.zykj.view.board.board

| 类 | 方法摘录 |
|---|---|
| [BackgroundToolState](../../../android/错题本/smali_classes3/com/zykj/view/board/board/BackgroundToolState.smali) | `getBackgroundLineVisible`、`getBackgroundType` |
| [BackgroundType](../../../android/错题本/smali_classes3/com/zykj/view/board/board/BackgroundType.smali) | `getBackgroundColor`、`getLineColor`、`getLineSpace`、`getLineType`、`getOrdinal` |
| [BoardCallbackConfig](../../../android/错题本/smali_classes3/com/zykj/view/board/board/BoardCallbackConfig.smali) | `getNeedLoading`、`getOnAddCameraImage`、`getOnAddGalleryImage`、`getOnBackClick`、`getOnCameraClick`、`getOnCommitClick`、`getOnCropClick` |
| [BoardFragment](../../../android/错题本/smali_classes3/com/zykj/view/board/board/BoardFragment.smali) | `getMViewModel`、`getPath`、`initBackgroundClickListener`、`initBasicData`、`initClickListener`、`initDismissCustomColorPaletteOnSketchTouch`、`initEraserClickListener` |
| [BoardSketchConfig](../../../android/错题本/smali_classes3/com/zykj/view/board/board/BoardSketchConfig.smali) | `getDefaultMoveRange`、`getMaxImageCount`、`getNeedCommitWithDeleteCache`、`getNeedTranslate`、`getZoomFiveLevel`、`getZoomPointSolution`、`isThumbnailContent` |
| [BoardViewConfig](../../../android/错题本/smali_classes3/com/zykj/view/board/board/BoardViewConfig.smali) | `getConfirmButtonType`、`getNeedBackgroundLine`、`getNeedCamera`、`getNeedDot`、`getNeedGallery`、`getNeedGraph`、`getNeedPenHighlighter` |
| [BoardViewModel](../../../android/错题本/smali_classes3/com/zykj/view/board/board/BoardViewModel.smali) | `applyGeometryStyleFromPenState`、`getBoardConfig`、`getCurrentZoomLevelList`、`getPageControl`、`initAreaMoveListener`、`initBackgroundLevel`、`initEraserSizeLevel` |
| [ConfirmButtonType](../../../android/错题本/smali_classes3/com/zykj/view/board/board/ConfirmButtonType.smali) | `isCommitVisible`、`isRecordVisible` |
| [DataStateKt](../../../android/错题本/smali_classes3/com/zykj/view/board/board/DataStateKt.smali) | `getBackgroundTypeList`、`getEraserTypeList`、`getPenColorList`、`getPenTypeList`、`getZoomLevelList`、`getZoomLevelList5` |
| [DialogKt](../../../android/错题本/smali_classes3/com/zykj/view/board/board/DialogKt.smali) | `showAskForCleanDialog`、`showTextEditDialog` |
| [EraserToolState](../../../android/错题本/smali_classes3/com/zykj/view/board/board/EraserToolState.smali) | `getEraserType` |
| [EraserType](../../../android/错题本/smali_classes3/com/zykj/view/board/board/EraserType.smali) | `getOrdinal`、`getSize` |
| [ExpandState](../../../android/错题本/smali_classes3/com/zykj/view/board/board/ExpandState.smali) | `getExpandStatus` |
| [ExpandStatus](../../../android/错题本/smali_classes3/com/zykj/view/board/board/ExpandStatus.smali) | `getIcon` |
| [ExtraUIState](../../../android/错题本/smali_classes3/com/zykj/view/board/board/ExtraUIState.smali) | `getConfirmButtonType`、`getHorizontalProgress`、`getHorizontalThumbTime`、`getMinorToolType`、`getVerticalProgress`、`getVerticalThumbTime`、`isDeleteDraftVisible` |
| [GraphToolState](../../../android/错题本/smali_classes3/com/zykj/view/board/board/GraphToolState.smali) | `getCameraVisible`、`getGalleryVisible`、`getGraphType`、`getGraphVisible`、`getTextVisible` |
| [GraphType](../../../android/错题本/smali_classes3/com/zykj/view/board/board/GraphType.smali) | `getGeometryActionEnum`、`isOvalChecked`、`isRectangleChecked`、`isTriangleChecked` |
| [MainToolState](../../../android/错题本/smali_classes3/com/zykj/view/board/board/MainToolState.smali) | `getMainToolType`、`getRevokeVisible`、`getZoomVisible`、`isRecoverEnable`、`isTouchable`、`isWithdrawEnable` |
| [MainToolType](../../../android/错题本/smali_classes3/com/zykj/view/board/board/MainToolType.smali) | `isEraserChecked`、`isGraphChecked`、`isPenChecked`、`isSelectChecked` |
| [MinorToolType](../../../android/错题本/smali_classes3/com/zykj/view/board/board/MinorToolType.smali) | `getBackgroundVisible`、`getEraserVisible`、`getGraphVisible`、`getPenVisible`、`getSelectVisible` |
| [PageControlExtKt](../../../android/错题本/smali_classes3/com/zykj/view/board/board/PageControlExtKt.smali) | `addRevokeListener`、`addTempEventListener`、`bindGeometryColorSelectListener`、`setAreaMoveListener`、`setMicroPhoneListener`、`setRecordListener`、`setTextSelectListener` |
| [PenColor](../../../android/错题本/smali_classes3/com/zykj/view/board/board/PenColor.smali) | `getColor`、`getOrdinal` |
| [PenToolState](../../../android/错题本/smali_classes3/com/zykj/view/board/board/PenToolState.smali) | `getDotVisible`、`getHighlighterVisible`、`getPenColor`、`getPenCustomColor`、`getPenSizeLevel`、`getPenType`、`isShowCustomColor` |
| [PenType](../../../android/错题本/smali_classes3/com/zykj/view/board/board/PenType.smali) | `getMode`、`getOrdinal`、`getPaintColorAlpha`、`getPaintWidthList`、`isDotted` |
| [RecordState](../../../android/错题本/smali_classes3/com/zykj/view/board/board/RecordState.smali) | `getProgress`、`getRecordStatus`、`isMicrophoneOn` |
| [RecordStatus](../../../android/错题本/smali_classes3/com/zykj/view/board/board/RecordStatus.smali) | `getIcon`、`isCropVisible`、`isFunctionVisible`、`isProgressVisible`、`isRecordVisible` |
| [SelectToolState](../../../android/错题本/smali_classes3/com/zykj/view/board/board/SelectToolState.smali) | `getGeometrySelected`、`getHighlighterSelected`、`getImageSelected`、`getPenSelected`、`getTextSelected` |
| [SimpleUIState](../../../android/错题本/smali_classes3/com/zykj/view/board/board/SimpleUIState.smali) | `getExpandStatus`、`getMainToolType`、`getMinorToolType` |
| [ZoomLevel](../../../android/错题本/smali_classes3/com/zykj/view/board/board/ZoomLevel.smali) | `getOrdinal`、`getZoomValue` |

## com.zykj.view.board.crop

| 类 | 方法摘录 |
|---|---|
| [BlackboardCropConfig](../../../android/错题本/smali_classes3/com/zykj/view/board/crop/BlackboardCropConfig.smali) | `getCallbackForBack`、`getCallbackForConfirm`、`getCallbackForNoSupport`、`getCallbackForNoTime`、`setCallbackForBack`、`setCallbackForConfirm`、`setCallbackForNoSupport` |
| [BlackboardCropFragment](../../../android/错题本/smali_classes3/com/zykj/view/board/crop/BlackboardCropFragment.smali) | `initView`、`hideProgress`、`onActivityCreated`、`onCreateView`、`onDestroyView`、`onHiddenChanged`、`onPause` |

## com.zykj.view.board.evaluation

| 类 | 方法摘录 |
|---|---|
| [BlackboardEvaluationConfig](../../../android/错题本/smali_classes3/com/zykj/view/board/evaluation/BlackboardEvaluationConfig.smali) | `getBottomOffset`、`getCallbackForSubmit`、`getDefaultLocationRatio`、`getDefaultTextSize`、`getEnableMove`、`getMaxImageCount`、`getMaxVerticalTime` |
| [BlackboardEvaluationFragment](../../../android/错题本/smali_classes3/com/zykj/view/board/evaluation/BlackboardEvaluationFragment.smali) | `activatePenTool`、`alignEvaluationPenColorPanelToPen`、`applyEvaluationPenColorAtSlot`、`askForErase`、`attachPenColorListeners`、`buildEvaluationSelectCustomColorView`、`calculateTranslationY` |

## com.zykj.view.board.play

| 类 | 方法摘录 |
|---|---|
| [NewPlayerConfig](../../../android/错题本/smali_classes3/com/zykj/view/board/play/NewPlayerConfig.smali) | `getCallbackFor`、`getCallbackForBack`、`getCallbackForDelete`、`getCallbackForRecord`、`getExtrasForSetting`、`getNeedBack`、`getNeedDelete` |
| [PlayActionListener](../../../android/错题本/smali_classes3/com/zykj/view/board/play/PlayActionListener.smali) | `getCallbackForEnd`、`getCallbackForPause`、`getCallbackForResume`、`getCallbackForRunning`、`getCallbackForStart`、`setCallbackForEnd`、`setCallbackForPause` |
| [PlaySettingAdapter](../../../android/错题本/smali_classes3/com/zykj/view/board/play/PlaySettingAdapter.smali) | `getItemCount`、`onBindViewHolder`、`onBindViewHolder`、`onCreateViewHolder`、`onCreateViewHolder` |
| [PlaySettingPopup](../../../android/错题本/smali_classes3/com/zykj/view/board/play/PlaySettingPopup.smali) | `showPopup` |
| [PlaySpeedRatePopup](../../../android/错题本/smali_classes3/com/zykj/view/board/play/PlaySpeedRatePopup.smali) | `getCurrentSpeedRate`、`setItemTextColor`、`showPopup` |
| [PlayerConfigSetting](../../../android/错题本/smali_classes3/com/zykj/view/board/play/PlayerConfigSetting.smali) | `getClickCallback`、`getDisplayText`、`getDrawableId`、`setClickCallback`、`setDisplayText`、`setDrawableId` |
| [SketchPlayExtraConfig](../../../android/错题本/smali_classes3/com/zykj/view/board/play/SketchPlayExtraConfig.smali) | `getAutoHideSeekBar`、`getFullscreenClickListener`、`getInterceptWhenVideo`、`getOnAutoHideAction`、`getSeekBarVisibleManually`、`getShowFullscreenButton`、`getSketchTapAction` |
| [SketchPlayFragment](../../../android/错题本/smali_classes3/com/zykj/view/board/play/SketchPlayFragment.smali) | `getPlayStatusListener`、`handleConfig`、`hideSeekBar`、`initPlaySketch`、`initStaticSketch`、`initView`、`showSeekBar` |
| [SpeedRate](../../../android/错题本/smali_classes3/com/zykj/view/board/play/SpeedRate.smali) | `getLabel`、`getSelected`、`getSpeed`、`getTextColor` |
| [SpeedRateAdapter](../../../android/错题本/smali_classes3/com/zykj/view/board/play/SpeedRateAdapter.smali) | `onBindViewHolder`、`onBindViewHolder`、`onCreateViewHolder`、`onCreateViewHolder` |

## com.zykj.view.board.simple

| 类 | 方法摘录 |
|---|---|
| [DataStateKt](../../../android/错题本/smali_classes3/com/zykj/view/board/simple/DataStateKt.smali) | `getSimplePenSizeList` |
| [SimpleFragment](../../../android/错题本/smali_classes3/com/zykj/view/board/simple/SimpleFragment.smali) | `getMViewModel`、`getPath`、`getSketchConfig`、`getSketchView`、`initClickListener`、`initEraserClickListener`、`initExtraClickListener` |
| [SimplePenSize](../../../android/错题本/smali_classes3/com/zykj/view/board/simple/SimplePenSize.smali) | `getOrdinal`、`getSize` |
| [SimplePenType](../../../android/错题本/smali_classes3/com/zykj/view/board/simple/SimplePenType.smali) | `getMode`、`getOrdinal`、`isPenDashed` |
| [SimpleUIState](../../../android/错题本/smali_classes3/com/zykj/view/board/simple/SimpleUIState.smali) | `getEraserType`、`getExpandStatus`、`getMainToolType`、`getMinorToolType`、`getPenColor`、`getPenSize`、`getPenType` |
| [SimpleViewModel](../../../android/错题本/smali_classes3/com/zykj/view/board/simple/SimpleViewModel.smali) | `updateConfigAboutEraser`、`updateConfigAboutPen`、`cleanPage`、`getEvent`、`getUiState`、`handleExpandClick`、`switchEraserTool` |

## com.zykj.view.dialog

| 类 | 方法摘录 |
|---|---|
| [CommonTipDialog](../../../android/错题本/smali_classes3/com/zykj/view/dialog/CommonTipDialog.smali) | `onCreate`、`onKeyDown`、`showDialog` |
| [TextEditDialog](../../../android/错题本/smali_classes3/com/zykj/view/dialog/TextEditDialog.smali) | `calculateStatusBarHeight`、`forceCloseKeyboard`、`setWindow`、`showSoftInputForce`、`onCreate`、`onKeyDown`、`onStart` |

## com.zykj.view.simpleBoard

| 类 | 方法摘录 |
|---|---|
| [ActionManager](../../../android/错题本/smali_classes3/com/zykj/view/simpleBoard/ActionManager.smali) | `handTouchEvent`、`setActonMode` |
| [DrawControl](../../../android/错题本/smali_classes3/com/zykj/view/simpleBoard/DrawControl.smali) | `buildWritePathData`、`checkPointFUnionPath`、`initEraserPaint`、`initPenPaint`、`buildBitmap`、`clean`、`drawBackgroundBitmap` |
| [SimpleBoardConfig](../../../android/错题本/smali_classes3/com/zykj/view/simpleBoard/SimpleBoardConfig.smali) | `getEnableControl`、`getEnableFinger`、`getEraserColor`、`getEraserSize`、`getMaxScaleTime`、`getMinScaleTime`、`getPenColor` |
| [SimpleBoardView](../../../android/错题本/smali_classes3/com/zykj/view/simpleBoard/SimpleBoardView.smali) | `buildBitmap`、`clean`、`getImageBackground`、`getSimpleBoardConfig`、`isEmpty`、`loadData`、`loadStrokeData` |

## com.zykj.view.simpleBoard.action

| 类 | 方法摘录 |
|---|---|
| [BaseAction](../../../android/错题本/smali_classes3/com/zykj/view/simpleBoard/action/BaseAction.smali) | `calculateDistance`、`calculateMiddlePointF`、`doubleTouchDown`、`doubleTouchMove`、`doubleTouchUp`、`handleMatrixDown`、`handleMatrixMove` |
| [EraserAction](../../../android/错题本/smali_classes3/com/zykj/view/simpleBoard/action/EraserAction.smali) | `singleTouchCancel`、`singleTouchDown`、`singleTouchMove`、`singleTouchUp` |
| [LineAction](../../../android/错题本/smali_classes3/com/zykj/view/simpleBoard/action/LineAction.smali) | `singleTouchCancel`、`singleTouchDown`、`singleTouchMove`、`singleTouchUp` |
| [SeeAction](../../../android/错题本/smali_classes3/com/zykj/view/simpleBoard/action/SeeAction.smali) | `onTouchPointerUp`、`singleTouchCancel`、`singleTouchDown`、`singleTouchMove`、`singleTouchUp` |
| [WriteAction](../../../android/错题本/smali_classes3/com/zykj/view/simpleBoard/action/WriteAction.smali) | `singleTouchCancel`、`singleTouchDown`、`singleTouchMove`、`singleTouchUp` |
| [WritePath](../../../android/错题本/smali_classes3/com/zykj/view/simpleBoard/action/WritePath.smali) | `getPaint`、`getPath`、`getPointList`、`getRectF` |

## com.zykj.view.simpleBoard.view

| 类 | 方法摘录 |
|---|---|
| [BoardImageView](../../../android/错题本/smali_classes3/com/zykj/view/simpleBoard/view/BoardImageView.smali) | `getMDrawControl`、`onDraw`、`setMDrawControl` |
| [BoardPathView](../../../android/错题本/smali_classes3/com/zykj/view/simpleBoard/view/BoardPathView.smali) | `getMDrawControl`、`onDraw`、`setMDrawControl` |
| [BoardTempPathView](../../../android/错题本/smali_classes3/com/zykj/view/simpleBoard/view/BoardTempPathView.smali) | `getMDrawControl`、`onDraw`、`setMDrawControl` |
| [IBoardView](../../../android/错题本/smali_classes3/com/zykj/view/simpleBoard/view/IBoardView.smali) | `updateImageView`、`updatePathView`、`updateTempPathView` |

## com.zykj.view.ui.camera

| 类 | 方法摘录 |
|---|---|
| [EzyCameraActivity](../../../android/错题本/smali_classes3/com/zykj/view/ui/camera/EzyCameraActivity.smali) | `onCreate` |
| [ImagePickFragment](../../../android/错题本/smali_classes3/com/zykj/view/ui/camera/ImagePickFragment.smali) | `bindCameraUseCases`、`getUri`、`initData`、`initView`、`requestCameraPermission`、`setUpCamera`、`startCamera` |
| [ImagePickFragmentKt](../../../android/错题本/smali_classes3/com/zykj/view/ui/camera/ImagePickFragmentKt.smali) | `afterMeasured` |

## com.zykj.view.ui.crop

| 类 | 方法摘录 |
|---|---|
| [EzyCropActivity](../../../android/错题本/smali_classes3/com/zykj/view/ui/crop/EzyCropActivity.smali) | `getCropImageOptions`、`getImageUri`、`initClickListener`、`initCropView`、`onCreate`、`onCropImageComplete`、`onSetImageUriComplete` |

## com.zykj.view.utils

| 类 | 方法摘录 |
|---|---|
| [ColorUtils](../../../android/错题本/smali_classes3/com/zykj/view/utils/ColorUtils.smali) | `isLight` |
| [CustomColorManager](../../../android/错题本/smali_classes3/com/zykj/view/utils/CustomColorManager.smali) | `rebuildColorWithBlackAlpha`、`rebuildColorWithWhiteAlpha`、`getBaseColorList`、`getCustomColorList`、`isColorExist` |
| [ExtKt](../../../android/错题本/smali_classes3/com/zykj/view/utils/ExtKt.smali) | `checkAt`、`setCustomColor`、`setLight`、`setProgressListener`、`singleClick`、`toPenColor`、`withAlpha` |
| [ImagePicker](../../../android/错题本/smali_classes3/com/zykj/view/utils/ImagePicker.smali) | `checkCameraPermission`、`registerForActivityResult`、`getCropImageOptions`、`startCapture`、`startCrop`、`startGallery`、`startSystemCamera` |
| [ImagePickerKt](../../../android/错题本/smali_classes3/com/zykj/view/utils/ImagePickerKt.smali) | `getRandomUri` |
| [LatestColorManager](../../../android/错题本/smali_classes3/com/zykj/view/utils/LatestColorManager.smali) | `getSpLatestColorList`、`getSpUtils`、`setSpLatestColorList`、`getLatestColorList`、`putNewColor` |
| [ProtoFileUtils](../../../android/错题本/smali_classes3/com/zykj/view/utils/ProtoFileUtils.smali) | `createSimpleBoardDataFile`、`loadDataToList`、`saveListToFile` |
| [ProtoFileUtilsKt](../../../android/错题本/smali_classes3/com/zykj/view/utils/ProtoFileUtilsKt.smali) | `convertToProtoPaint`、`convertToProtoPaint`、`convertToProtoPath`、`convertToProtoPath` |
| [ProtoPath](../../../android/错题本/smali_classes3/com/zykj/view/utils/ProtoPath.smali) | `getPaint`、`getPointList` |
| [SPDataKt](../../../android/错题本/smali_classes3/com/zykj/view/utils/SPDataKt.smali) | `getSpBackgroundColor`、`getSpEraserSize`、`getSpGeometryColor`、`getSpPenColor`、`getSpPenSizeLevel`、`getSpPenTypeLevel`、`getSpSelectGraphEnum` |
| [TimeFormatUtils](../../../android/错题本/smali_classes3/com/zykj/view/utils/TimeFormatUtils.smali) | `formatTime`、`formatTimeWithHour` |
| [ZoomPointSolution](../../../android/错题本/smali_classes3/com/zykj/view/utils/ZoomPointSolution.smali) | `getEntries`、`valueOf`、`values`、`getValue`、`setValue` |

## com.zykj.view.widget

| 类 | 方法摘录 |
|---|---|
| [DoubleSeekBar](../../../android/错题本/smali_classes3/com/zykj/view/widget/DoubleSeekBar.smali) | `calculateKeyPointLocation`、`calculateLineInRectF`、`calculateMaskLocation`、`calculateThumbLocation`、`calculateTrackLocation`、`drawKeyPoint`、`drawMask` |
| [SketchBoardTouchFrameLayout](../../../android/错题本/smali_classes3/com/zykj/view/widget/SketchBoardTouchFrameLayout.smali) | `dispatchTouchEvent`、`getOnBeforeTouchDispatchToChildren`、`setOnBeforeTouchDispatchToChildren` |
| [SketchProgressView](../../../android/错题本/smali_classes3/com/zykj/view/widget/SketchProgressView.smali) | `calculateMoveRange`、`calculateThumbRect`、`calculateTouchOffset`、`checkTouchThumb`、`closeVisible`、`drawThumb`、`getLengthPointByEvent` |
| [TouchSwitchView](../../../android/错题本/smali_classes3/com/zykj/view/widget/TouchSwitchView.smali) | `canTouch`、`onInterceptTouchEvent`、`setCanTouch` |

## com.zykj.view.widget.customColor

| 类 | 方法摘录 |
|---|---|
| [CustomColorFrameLayout](../../../android/错题本/smali_classes3/com/zykj/view/widget/customColor/CustomColorFrameLayout.smali) | `getOnColorChangeListener`、`getSelectColor`、`refresh`、`setBackgroundLight`、`setOnColorChangeListener`、`setSelectColor` |
| [CustomColorLayout](../../../android/错题本/smali_classes3/com/zykj/view/widget/customColor/CustomColorLayout.smali) | `getChild`、`toView`、`getOnColorChangeListener`、`getSelectColor`、`setOnColorChangeListener`、`setSelectColor` |
| [LatestColorLayout](../../../android/错题本/smali_classes3/com/zykj/view/widget/customColor/LatestColorLayout.smali) | `buildColorView`、`getChild`、`getOnColorChangeListener`、`getSelectColor`、`refresh`、`setOnColorChangeListener`、`setSelectColor` |

## com.zykj.view.widget.radio

| 类 | 方法摘录 |
|---|---|
| [CustomColorRadioButton](../../../android/错题本/smali_classes3/com/zykj/view/widget/radio/CustomColorRadioButton.smali) | `getNoColorBitmap`、`getNoColorRect`、`getWithColorBitmap`、`getWithColorRect`、`getColor`、`isCustomBackgroundShow`、`isLight` |
| [NormalColorRadioButton](../../../android/错题本/smali_classes3/com/zykj/view/widget/radio/NormalColorRadioButton.smali) | `isCustomBackgroundShow` |
| [WithSelectedRadioButton](../../../android/错题本/smali_classes3/com/zykj/view/widget/radio/WithSelectedRadioButton.smali) | `isLight`、`onDraw`、`onLayout`、`setChecked`、`setPressed` |
