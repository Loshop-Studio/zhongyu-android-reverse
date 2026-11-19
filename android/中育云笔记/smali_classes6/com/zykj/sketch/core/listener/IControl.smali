.class public interface abstract Lcom/zykj/sketch/core/listener/IControl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/sketch/core/listener/IControl$DefaultImpls;
    }
.end annotation


# virtual methods
.method public abstract clear()V
.end method

.method public abstract clearTempPaint()V
.end method

.method public abstract findGraph(FFF)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FFF)",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/core/graph/Graph;",
            ">;"
        }
    .end annotation
.end method

.method public abstract findSelectGraph()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/core/graph/Graph;",
            ">;"
        }
    .end annotation
.end method

.method public abstract forceRender()V
.end method

.method public abstract getBackgroundColor()I
.end method

.method public abstract getCameraMatrix()Landroid/graphics/Matrix;
.end method

.method public abstract getDeleteBitmap()Landroid/graphics/Bitmap;
.end method

.method public abstract getDrawArea()Lcom/zykj/sketch/EzyDrawBoard$DrawArea;
.end method

.method public abstract getGraphConfig()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;
.end method

.method public abstract getGraphMatrixListener()Lcom/zykj/sketch/core/listener/GraphMatrixListener;
.end method

.method public abstract getImageDeleteListener()Lcom/zykj/sketch/core/listener/ImageDeleteListener;
.end method

.method public abstract getMode()Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;
.end method

.method public abstract getRootGraph()Lcom/zykj/sketch/core/graph/Graph;
.end method

.method public abstract getScale()F
.end method

.method public abstract getSketchConfig()Lcom/zykj/sketch/core/config/SketchConfig;
.end method

.method public abstract isRender(Z)V
.end method

.method public abstract isRender()Z
.end method

.method public abstract isTouch()Z
.end method

.method public abstract onDestroy()V
.end method

.method public abstract render()V
.end method

.method public abstract render(Landroid/graphics/Canvas;)V
.end method

.method public abstract renderTempPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V
.end method

.method public abstract renderTempThumbnail(Landroid/graphics/Bitmap;)V
.end method

.method public abstract reset()V
.end method

.method public abstract resetGraph()V
.end method

.method public abstract resetStatus()V
.end method

.method public abstract setBackgroundColor(I)V
.end method

.method public abstract setCameraMatrix(IIII)V
.end method

.method public abstract setCameraMatrix(Landroid/graphics/Matrix;)V
.end method

.method public abstract setDrawArea(Lcom/zykj/sketch/EzyDrawBoard$DrawArea;)V
.end method

.method public abstract setGraphMatrixListener(Lcom/zykj/sketch/core/listener/GraphMatrixListener;)V
.end method

.method public abstract setImageDeleteListener(Lcom/zykj/sketch/core/listener/ImageDeleteListener;)V
.end method

.method public abstract setMode(Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;)V
.end method

.method public abstract setRecordConfig(Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;)V
.end method

.method public abstract setRootGraph(Lcom/zykj/sketch/core/graph/Graph;)V
.end method

.method public abstract setTouch(Z)V
.end method
