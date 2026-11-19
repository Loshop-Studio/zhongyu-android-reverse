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
        "\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010!\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008f\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\n\u001a\u00020\tH&\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u000cH&\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000fH&\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H&\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u00062\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0015H&\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH&\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001bH&\u00a2\u0006\u0004\u0008\u001f\u0010 J/\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u001b0%2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0008\u0008\u0002\u0010$\u001a\u00020!H&\u00a2\u0006\u0004\u0008&\u0010\'J\u0015\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\u001b0%H&\u00a2\u0006\u0004\u0008(\u0010)J\u000f\u0010*\u001a\u00020\u0006H&\u00a2\u0006\u0004\u0008*\u0010+J\u000f\u0010,\u001a\u00020\u0006H&\u00a2\u0006\u0004\u0008,\u0010+J\u0017\u0010*\u001a\u00020\u00062\u0006\u0010.\u001a\u00020-H&\u00a2\u0006\u0004\u0008*\u0010/J\u0019\u00102\u001a\u00020\u00062\u0008\u00101\u001a\u0004\u0018\u000100H&\u00a2\u0006\u0004\u00082\u00103J\u001f\u00108\u001a\u00020\u00062\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H&\u00a2\u0006\u0004\u00088\u00109J\u000f\u0010;\u001a\u00020:H&\u00a2\u0006\u0004\u0008;\u0010<J\u0017\u0010>\u001a\u00020\u00062\u0006\u0010=\u001a\u00020:H&\u00a2\u0006\u0004\u0008>\u0010?J\u0017\u0010A\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\tH&\u00a2\u0006\u0004\u0008A\u0010BJ\u0017\u0010C\u001a\u00020\u00062\u0006\u0010C\u001a\u00020:H&\u00a2\u0006\u0004\u0008C\u0010?J\u000f\u0010C\u001a\u00020:H&\u00a2\u0006\u0004\u0008C\u0010<J/\u0010H\u001a\u00020\u00062\u0006\u0010D\u001a\u00020\u000f2\u0006\u0010E\u001a\u00020\u000f2\u0006\u0010F\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020\u000fH&\u00a2\u0006\u0004\u0008H\u0010IJ\u0017\u0010H\u001a\u00020\u00062\u0006\u0010K\u001a\u00020JH&\u00a2\u0006\u0004\u0008H\u0010LJ\u000f\u0010M\u001a\u00020!H&\u00a2\u0006\u0004\u0008M\u0010NJ\u000f\u0010O\u001a\u000200H&\u00a2\u0006\u0004\u0008O\u0010PJ\u000f\u0010Q\u001a\u00020JH&\u00a2\u0006\u0004\u0008Q\u0010RJ\u000f\u0010S\u001a\u00020\u0006H&\u00a2\u0006\u0004\u0008S\u0010+J\u000f\u0010T\u001a\u00020\u0006H&\u00a2\u0006\u0004\u0008T\u0010+J\u000f\u0010U\u001a\u00020\u0006H&\u00a2\u0006\u0004\u0008U\u0010+J\u000f\u0010V\u001a\u00020\u0006H&\u00a2\u0006\u0004\u0008V\u0010+J\u000f\u0010W\u001a\u00020\u0006H&\u00a2\u0006\u0004\u0008W\u0010+J\u000f\u0010X\u001a\u00020\u0006H&\u00a2\u0006\u0004\u0008X\u0010+J\u0019\u0010[\u001a\u00020\u00062\u0008\u0010Z\u001a\u0004\u0018\u00010YH&\u00a2\u0006\u0004\u0008[\u0010\\J\u0011\u0010]\u001a\u0004\u0018\u00010YH&\u00a2\u0006\u0004\u0008]\u0010^J\u0019\u0010`\u001a\u00020\u00062\u0008\u0010Z\u001a\u0004\u0018\u00010_H&\u00a2\u0006\u0004\u0008`\u0010aJ\u0011\u0010b\u001a\u0004\u0018\u00010_H&\u00a2\u0006\u0004\u0008b\u0010c\u00a8\u0006d"
    }
    d2 = {
        "Lcom/zykj/sketch/core/listener/IControl;",
        "",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;",
        "getMode",
        "()Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;",
        "mode",
        "Ld6/s;",
        "setMode",
        "(Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;)V",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;",
        "getGraphConfig",
        "()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;",
        "Lcom/zykj/sketch/core/config/SketchConfig;",
        "getSketchConfig",
        "()Lcom/zykj/sketch/core/config/SketchConfig;",
        "",
        "getBackgroundColor",
        "()I",
        "color",
        "setBackgroundColor",
        "(I)V",
        "Lcom/zykj/sketch/EzyDrawBoard$DrawArea;",
        "getDrawArea",
        "()Lcom/zykj/sketch/EzyDrawBoard$DrawArea;",
        "drawArea",
        "setDrawArea",
        "(Lcom/zykj/sketch/EzyDrawBoard$DrawArea;)V",
        "Lcom/zykj/sketch/core/graph/Graph;",
        "getRootGraph",
        "()Lcom/zykj/sketch/core/graph/Graph;",
        "graph",
        "setRootGraph",
        "(Lcom/zykj/sketch/core/graph/Graph;)V",
        "",
        "x",
        "y",
        "offset",
        "",
        "findGraph",
        "(FFF)Ljava/util/List;",
        "findSelectGraph",
        "()Ljava/util/List;",
        "render",
        "()V",
        "forceRender",
        "Landroid/graphics/Canvas;",
        "canvas",
        "(Landroid/graphics/Canvas;)V",
        "Landroid/graphics/Bitmap;",
        "bitmap",
        "renderTempThumbnail",
        "(Landroid/graphics/Bitmap;)V",
        "Landroid/graphics/Path;",
        "path",
        "Landroid/graphics/Paint;",
        "paint",
        "renderTempPath",
        "(Landroid/graphics/Path;Landroid/graphics/Paint;)V",
        "",
        "isTouch",
        "()Z",
        "touch",
        "setTouch",
        "(Z)V",
        "config",
        "setRecordConfig",
        "(Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;)V",
        "isRender",
        "targetWidth",
        "targetHeight",
        "width",
        "height",
        "setCameraMatrix",
        "(IIII)V",
        "Landroid/graphics/Matrix;",
        "matrix",
        "(Landroid/graphics/Matrix;)V",
        "getScale",
        "()F",
        "getDeleteBitmap",
        "()Landroid/graphics/Bitmap;",
        "getCameraMatrix",
        "()Landroid/graphics/Matrix;",
        "clearTempPaint",
        "resetStatus",
        "resetGraph",
        "reset",
        "onDestroy",
        "clear",
        "Lcom/zykj/sketch/core/listener/GraphMatrixListener;",
        "listener",
        "setGraphMatrixListener",
        "(Lcom/zykj/sketch/core/listener/GraphMatrixListener;)V",
        "getGraphMatrixListener",
        "()Lcom/zykj/sketch/core/listener/GraphMatrixListener;",
        "Lcom/zykj/sketch/core/listener/ImageDeleteListener;",
        "setImageDeleteListener",
        "(Lcom/zykj/sketch/core/listener/ImageDeleteListener;)V",
        "getImageDeleteListener",
        "()Lcom/zykj/sketch/core/listener/ImageDeleteListener;",
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

    .annotation build Lorg/jetbrains/annotations/NotNull;
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

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract forceRender()V
.end method

.method public abstract getBackgroundColor()I
.end method

.method public abstract getCameraMatrix()Landroid/graphics/Matrix;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getDeleteBitmap()Landroid/graphics/Bitmap;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getDrawArea()Lcom/zykj/sketch/EzyDrawBoard$DrawArea;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getGraphConfig()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getGraphMatrixListener()Lcom/zykj/sketch/core/listener/GraphMatrixListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getImageDeleteListener()Lcom/zykj/sketch/core/listener/ImageDeleteListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getMode()Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getRootGraph()Lcom/zykj/sketch/core/graph/Graph;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getScale()F
.end method

.method public abstract getSketchConfig()Lcom/zykj/sketch/core/config/SketchConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
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
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract renderTempPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V
    .param p1    # Landroid/graphics/Path;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Paint;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract renderTempThumbnail(Landroid/graphics/Bitmap;)V
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
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
    .param p1    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract setDrawArea(Lcom/zykj/sketch/EzyDrawBoard$DrawArea;)V
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$DrawArea;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract setGraphMatrixListener(Lcom/zykj/sketch/core/listener/GraphMatrixListener;)V
    .param p1    # Lcom/zykj/sketch/core/listener/GraphMatrixListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract setImageDeleteListener(Lcom/zykj/sketch/core/listener/ImageDeleteListener;)V
    .param p1    # Lcom/zykj/sketch/core/listener/ImageDeleteListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract setMode(Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;)V
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract setRecordConfig(Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;)V
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract setRootGraph(Lcom/zykj/sketch/core/graph/Graph;)V
    .param p1    # Lcom/zykj/sketch/core/graph/Graph;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract setTouch(Z)V
.end method
