.class public interface abstract Lcom/zykj/blackboard/core/edit/IPageControl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/edit/IPageControl$DefaultImpls;
    }
.end annotation


# virtual methods
.method public abstract addEventListener(Lcom/zykj/blackboard/listener/EventListener;)V
.end method

.method public abstract addGraphDeleteListener(Lcom/zykj/blackboard/listener/GraphDeleteListener;)V
.end method

.method public abstract addImage(Landroid/graphics/Bitmap;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;ZZ)Lcom/zykj/blackboard/core/graph/group/ImageGraph;
.end method

.method public abstract addImage(Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;ZZ)Lcom/zykj/blackboard/core/graph/group/ImageGraph;
.end method

.method public abstract addImage(Ljava/lang/String;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;Z)Lcom/zykj/blackboard/core/graph/group/ImageGraph;
.end method

.method public abstract addImageList(Ljava/util/List;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/zykj/board/EzyPositionEnum$PositionEnum;",
            "Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;",
            ")",
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/graph/group/ImageGraph;",
            ">;"
        }
    .end annotation
.end method

.method public abstract addRenderRectChangeListener(Lcom/zykj/blackboard/core/edit/RenderChangeListener;)V
.end method

.method public abstract addSpecialImage(Landroid/graphics/Bitmap;)Lcom/zykj/blackboard/core/graph/group/ImageGraph;
.end method

.method public abstract addSpecialImage(Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/group/ImageGraph;
.end method

.method public abstract addText(Ljava/lang/String;Lcom/zykj/board/EzyPositionEnum$PositionEnum;I)Lcom/zykj/blackboard/core/graph/group/TextGraph;
.end method

.method public abstract addWithdrawListener(Lcom/zykj/blackboard/listener/WithdrawListener;)V
.end method

.method public abstract areaMoveEnd(Ljava/lang/Float;Ljava/lang/Float;)V
.end method

.method public abstract areaMoveStart()V
.end method

.method public abstract areaMoving(Ljava/lang/Float;Ljava/lang/Float;)V
.end method

.method public abstract canSave()Z
.end method

.method public abstract changeImageOriginRect(Lcom/zykj/blackboard/core/graph/group/ImageGraph;Landroid/graphics/RectF;)V
.end method

.method public abstract changeTextColor(I)Z
.end method

.method public abstract changeTextSize(F)Z
.end method

.method public abstract cleanPage(Lcom/zykj/blackboard/core/graph/IGraph;)V
.end method

.method public abstract clearHistoryList()V
.end method

.method public abstract clearHistoryListWithoutCurrent()V
.end method

.method public abstract getBackgroundColor()I
.end method

.method public abstract getBackgroundLineConfig()Lcom/zykj/blackboard/bean/BackgroundLineConfig;
.end method

.method public abstract getFirstGraph()Lcom/zykj/blackboard/core/graph/IGraph;
.end method

.method public abstract getGroupGraphSize()I
.end method

.method public abstract getImageGraphCount()I
.end method

.method public abstract getMoveHorizontalProgress()F
.end method

.method public abstract getMoveVerticalProgress()F
.end method

.method public abstract getNoRecordImagePathList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getPageImagePathList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getRenderRect()Landroid/graphics/RectF;
.end method

.method public abstract getZoomLevel()F
.end method

.method public abstract isMicroTurnOn()Z
.end method

.method public abstract isPageNotEmpty()Z
.end method

.method public abstract isRecording()Z
.end method

.method public abstract minScreenshot(IIIIZZZLcom/zykj/blackboard/core/graph/IGraph;)Landroid/graphics/Bitmap;
.end method

.method public abstract newSelectGraph(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract onTouchEvent(Landroid/view/MotionEvent;)V
.end method

.method public abstract recover()Z
.end method

.method public abstract removeEventListener(Lcom/zykj/blackboard/listener/EventListener;)V
.end method

.method public abstract removeGraphDeleteListener(Lcom/zykj/blackboard/listener/GraphDeleteListener;)V
.end method

.method public abstract removeRenderRectChangeListener(Lcom/zykj/blackboard/core/edit/RenderChangeListener;)V
.end method

.method public abstract removeWithdrawListener(Lcom/zykj/blackboard/listener/WithdrawListener;)V
.end method

.method public abstract save()V
.end method

.method public abstract saveWithContentThumbnail()V
.end method

.method public abstract screenshot()Landroid/graphics/Bitmap;
.end method

.method public abstract selectedGraph(Ljava/lang/String;)V
.end method

.method public abstract setAreaMoveListener(Lcom/zykj/blackboard/listener/IAreaMoveListener;)V
.end method

.method public abstract setBackgroundColor(I)V
.end method

.method public abstract setBackgroundColorWithLineConfig(ILcom/zykj/blackboard/bean/BackgroundLineConfig;)V
.end method

.method public abstract setGeometryCreateListener(Lx7/l;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/l;",
            ")V"
        }
    .end annotation
.end method

.method public abstract setMicroPhoneListener(Lcom/zykj/blackboard/listener/MicroPhoneListener;)V
.end method

.method public abstract setRecordListener(Lcom/zykj/blackboard/listener/RecordListener;)V
.end method

.method public abstract setTextSelectListener(Lcom/zykj/blackboard/listener/ITextSelectListener;)V
.end method

.method public abstract setVisibleAreaProgress(Ljava/lang/Float;Ljava/lang/Float;)V
.end method

.method public abstract startRecord(Z)V
.end method

.method public abstract stopRecord()V
.end method

.method public abstract turnOffMicro()V
.end method

.method public abstract turnOnMicro()V
.end method

.method public abstract withdraw()Z
.end method

.method public abstract zoomLevel(FFF)V
.end method
