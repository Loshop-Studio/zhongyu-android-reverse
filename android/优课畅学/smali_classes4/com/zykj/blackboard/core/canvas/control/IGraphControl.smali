.class public interface abstract Lcom/zykj/blackboard/core/canvas/control/IGraphControl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/canvas/control/IGraphControl$DefaultImpls;
    }
.end annotation


# virtual methods
.method public abstract addGraph(Ljava/lang/String;Lcom/zykj/blackboard/core/graph/IGraph;)V
.end method

.method public abstract addImageGraph(Lcom/zykj/blackboard/core/graph/group/ImageGraph;)V
.end method

.method public abstract cameraChangeEnd(Landroid/graphics/Matrix;)V
.end method

.method public abstract cameraChangeStart()V
.end method

.method public abstract cameraChanging(Landroid/graphics/Matrix;)V
.end method

.method public abstract changeImageGraph(Ljava/lang/String;Landroid/graphics/RectF;Landroid/graphics/Matrix;Ljava/lang/String;)V
.end method

.method public abstract changeTextGraph(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)V
.end method

.method public abstract concatMatrix(Lcom/zykj/blackboard/core/graph/IGraph;Landroid/graphics/Matrix;)V
.end method

.method public abstract contentThumbnail()Landroid/graphics/Bitmap;
.end method

.method public abstract delete(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract drawGraphInActive(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Matrix;)V
.end method

.method public abstract getBackgroundColor()I
.end method

.method public abstract getBackgroundLineConfig()Lcom/zykj/blackboard/bean/BackgroundLineConfig;
.end method

.method public abstract getDefaultBackgroundColor()I
.end method

.method public abstract getDefaultBackgroundLineConfig()Lcom/zykj/blackboard/bean/BackgroundLineConfig;
.end method

.method public abstract getImageGraphCount()I
.end method

.method public abstract getOldPageRectF()Landroid/graphics/RectF;
.end method

.method public abstract getPageRectF()Landroid/graphics/RectF;
.end method

.method public abstract getRenderRectF()Landroid/graphics/RectF;
.end method

.method public abstract init(Lcom/zykj/blackboard/core/graph/IGraph;)V
.end method

.method public abstract isDraw(Z)V
.end method

.method public abstract isDraw()Z
.end method

.method public abstract minScreenShot(IIIIZZZLcom/zykj/blackboard/core/graph/IGraph;)Landroid/graphics/Bitmap;
.end method

.method public abstract newChangeHandleEnd(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Ljava/util/List;Landroid/graphics/PointF;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/RectF;",
            "Landroid/graphics/Matrix;",
            "Landroid/graphics/RectF;",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;",
            ">;",
            "Landroid/graphics/PointF;",
            ")V"
        }
    .end annotation
.end method

.method public abstract newChangeHandleStart(Lcom/zykj/blackboard/core/graph/group/GroupGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Ljava/util/List;Landroid/graphics/PointF;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/blackboard/core/graph/group/GroupGraph;",
            "Landroid/graphics/RectF;",
            "Landroid/graphics/Matrix;",
            "Landroid/graphics/RectF;",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;",
            ">;",
            "Landroid/graphics/PointF;",
            ")V"
        }
    .end annotation
.end method

.method public abstract newChangeHandling(Lcom/zykj/blackboard/core/graph/group/GroupGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Ljava/util/List;Landroid/graphics/PointF;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/blackboard/core/graph/group/GroupGraph;",
            "Landroid/graphics/RectF;",
            "Landroid/graphics/Matrix;",
            "Landroid/graphics/RectF;",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;",
            ">;",
            "Landroid/graphics/PointF;",
            ")V"
        }
    .end annotation
.end method

.method public abstract newSelect(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Ljava/util/List;Landroid/graphics/PointF;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/RectF;",
            "Landroid/graphics/Matrix;",
            "Landroid/graphics/RectF;",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;",
            ">;",
            "Landroid/graphics/PointF;",
            ")V"
        }
    .end annotation
.end method

.method public abstract newSelecting(FFFF)V
.end method

.method public abstract reDrawFixView()V
.end method

.method public abstract refresh()V
.end method

.method public abstract registerRenderRectFChangeListener(Lcom/zykj/blackboard/core/edit/RenderChangeListener;)V
.end method

.method public abstract release()V
.end method

.method public abstract renderRectF(Landroid/graphics/RectF;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/RectF;",
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract reset()V
.end method

.method public abstract resetCamera()V
.end method

.method public abstract rootGraph()Lcom/zykj/blackboard/core/graph/IGraph;
.end method

.method public abstract rootGraphId()Ljava/lang/String;
.end method

.method public abstract screenshot()Landroid/graphics/Bitmap;
.end method

.method public abstract select(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/Paint;FZ)V
.end method

.method public abstract selectCancel()V
.end method

.method public abstract setDefaultBackgroundColor(I)V
.end method

.method public abstract setDefaultBackgroundLineConfig(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V
.end method

.method public abstract setGraphMatrix(Ljava/lang/String;Landroid/graphics/Matrix;)V
.end method

.method public abstract setOldPageRectF(Landroid/graphics/RectF;)V
.end method

.method public abstract snapshot()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;
.end method

.method public abstract textHandle(Lcom/zykj/blackboard/core/graph/group/TextGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;)V
.end method

.method public abstract textHandleEnd(Lcom/zykj/blackboard/core/graph/group/TextGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;)V
.end method

.method public abstract textHandleStart(Lcom/zykj/blackboard/core/graph/group/TextGraph;)V
.end method

.method public abstract translation(Ljava/util/List;Landroid/graphics/Matrix;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;",
            "Landroid/graphics/Matrix;",
            ")V"
        }
    .end annotation
.end method

.method public abstract translationEnd(Ljava/util/List;Landroid/graphics/Matrix;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;",
            "Landroid/graphics/Matrix;",
            ")V"
        }
    .end annotation
.end method

.method public abstract translationStart(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract unRegisterRenderRectFChangeListener(Lcom/zykj/blackboard/core/edit/RenderChangeListener;)V
.end method

.method public abstract updateBackgroundColor(I)V
.end method

.method public abstract updateBackgroundLineConfig(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V
.end method

.method public abstract updateBackgroundMatrix()V
.end method
