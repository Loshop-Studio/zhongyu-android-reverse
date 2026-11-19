.class public interface abstract Lcom/zykj/sketch/core/listener/IControl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/sketch/core/listener/IControl$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001b\u0008f\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H&J\u0008\u0010\u0004\u001a\u00020\u0003H&J(\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\tH&J\u000e\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H&J\u0008\u0010\r\u001a\u00020\u0003H&J\u0008\u0010\u000e\u001a\u00020\u000fH&J\u0008\u0010\u0010\u001a\u00020\u0011H&J\u0008\u0010\u0012\u001a\u00020\u0013H&J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H&J\u0008\u0010\u0016\u001a\u00020\u0017H&J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H&J\n\u0010\u001a\u001a\u0004\u0018\u00010\u001bH&J\u0008\u0010\u001c\u001a\u00020\u001dH&J\u0008\u0010\u001e\u001a\u00020\u0007H&J\u0008\u0010\u001f\u001a\u00020\tH&J\u0008\u0010 \u001a\u00020!H&J\u0008\u0010\"\u001a\u00020#H&J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020#H&J\u0008\u0010$\u001a\u00020#H&J\u0008\u0010%\u001a\u00020\u0003H&J\u0008\u0010&\u001a\u00020\u0003H&J\u0010\u0010&\u001a\u00020\u00032\u0006\u0010\'\u001a\u00020(H&J\u0018\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H&J\u0012\u0010.\u001a\u00020\u00032\u0008\u0010/\u001a\u0004\u0018\u00010\u0013H&J\u0008\u00100\u001a\u00020\u0003H&J\u0008\u00101\u001a\u00020\u0003H&J\u0008\u00102\u001a\u00020\u0003H&J\u0010\u00103\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u000fH&J\u0010\u00105\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u0011H&J(\u00105\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u000f2\u0006\u00108\u001a\u00020\u000f2\u0006\u00109\u001a\u00020\u000f2\u0006\u0010:\u001a\u00020\u000fH&J\u0012\u0010;\u001a\u00020\u00032\u0008\u0010<\u001a\u0004\u0018\u00010\u0015H&J\u0012\u0010=\u001a\u00020\u00032\u0008\u0010>\u001a\u0004\u0018\u00010\u0019H&J\u0012\u0010?\u001a\u00020\u00032\u0008\u0010>\u001a\u0004\u0018\u00010\u001bH&J\u0010\u0010@\u001a\u00020\u00032\u0006\u0010A\u001a\u00020\u001dH&J\u0010\u0010B\u001a\u00020\u00032\u0006\u0010C\u001a\u00020\u0017H&J\u0010\u0010D\u001a\u00020\u00032\u0006\u0010E\u001a\u00020\u0007H&J\u0010\u0010F\u001a\u00020\u00032\u0006\u0010G\u001a\u00020#H&\u00a8\u0006H"
    }
    d2 = {
        "Lcom/zykj/sketch/core/listener/IControl;",
        "",
        "clear",
        "",
        "clearTempPaint",
        "findGraph",
        "",
        "Lcom/zykj/sketch/core/graph/Graph;",
        "x",
        "",
        "y",
        "offset",
        "findSelectGraph",
        "forceRender",
        "getBackgroundColor",
        "",
        "getCameraMatrix",
        "Landroid/graphics/Matrix;",
        "getDeleteBitmap",
        "Landroid/graphics/Bitmap;",
        "getDrawArea",
        "Lcom/zykj/sketch/EzyDrawBoard$DrawArea;",
        "getGraphConfig",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;",
        "getGraphMatrixListener",
        "Lcom/zykj/sketch/core/listener/GraphMatrixListener;",
        "getImageDeleteListener",
        "Lcom/zykj/sketch/core/listener/ImageDeleteListener;",
        "getMode",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;",
        "getRootGraph",
        "getScale",
        "getSketchConfig",
        "Lcom/zykj/sketch/core/config/SketchConfig;",
        "isRender",
        "",
        "isTouch",
        "onDestroy",
        "render",
        "canvas",
        "Landroid/graphics/Canvas;",
        "renderTempPath",
        "path",
        "Landroid/graphics/Path;",
        "paint",
        "Landroid/graphics/Paint;",
        "renderTempThumbnail",
        "bitmap",
        "reset",
        "resetGraph",
        "resetStatus",
        "setBackgroundColor",
        "color",
        "setCameraMatrix",
        "matrix",
        "targetWidth",
        "targetHeight",
        "width",
        "height",
        "setDrawArea",
        "drawArea",
        "setGraphMatrixListener",
        "listener",
        "setImageDeleteListener",
        "setMode",
        "mode",
        "setRecordConfig",
        "config",
        "setRootGraph",
        "graph",
        "setTouch",
        "touch",
        "sketch_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
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
