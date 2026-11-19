.class public interface abstract Lcom/zykj/sketch/core/record/GraphOperation;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/sketch/core/record/GraphOperation$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b0\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u0007\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001JF\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042#\u0008\u0002\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\u000c\u0008\u0007\u0012\u0008\u0008\u0008\u0012\u0004\u0008\u0008(\t\u0012\u0004\u0012\u00020\n0\u0006H&\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0010H&\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H&\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H&\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0017H&\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJQ\u0010$\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\n0\u00062\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n0\u00062\u0010\u0008\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\"H&\u00a2\u0006\u0004\u0008$\u0010%J\u0017\u0010(\u001a\u00020\n2\u0006\u0010\'\u001a\u00020&H&\u00a2\u0006\u0004\u0008(\u0010)J[\u00100\u001a\u00020\n2\u0006\u0010+\u001a\u00020*2\u0008\u0008\u0002\u0010,\u001a\u00020\u00132\u0008\u0008\u0002\u0010\'\u001a\u00020\u00132\u0016\u0008\u0002\u0010.\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010-\u0012\u0004\u0012\u00020\n0\u00062\u0016\u0008\u0002\u0010/\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\n0\u0006H&\u00a2\u0006\u0004\u00080\u00101J[\u00100\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d2\u0008\u0008\u0002\u0010,\u001a\u00020\u00132\u0008\u0008\u0002\u0010\'\u001a\u00020\u00132\u0016\u0008\u0002\u0010.\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010-\u0012\u0004\u0012\u00020\n0\u00062\u0016\u0008\u0002\u0010/\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\n0\u0006H&\u00a2\u0006\u0004\u00080\u00102Jc\u00100\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u00103\u001a\u00020\u001d2\u0008\u0008\u0002\u0010,\u001a\u00020\u00132\u0008\u0008\u0002\u0010\'\u001a\u00020\u00132\u0016\u0008\u0002\u0010.\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010-\u0012\u0004\u0012\u00020\n0\u00062\u0016\u0008\u0002\u0010/\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\n0\u0006H&\u00a2\u0006\u0004\u00080\u00104Jc\u00100\u001a\u00020\n2\u0006\u0010+\u001a\u00020*2\u0006\u00103\u001a\u00020\u001d2\u0008\u0008\u0002\u0010,\u001a\u00020\u00132\u0008\u0008\u0002\u0010\'\u001a\u00020\u00132\u0016\u0008\u0002\u0010.\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010-\u0012\u0004\u0012\u00020\n0\u00062\u0016\u0008\u0002\u0010/\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\n0\u0006H&\u00a2\u0006\u0004\u00080\u00105J+\u00107\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\n0\u0006H&\u00a2\u0006\u0004\u00087\u00108J\u000f\u00109\u001a\u00020\nH&\u00a2\u0006\u0004\u00089\u0010:J\u0019\u0010<\u001a\u00020\n2\u0008\u0008\u0002\u0010;\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008<\u0010=J\u000f\u0010>\u001a\u00020\nH&\u00a2\u0006\u0004\u0008>\u0010:J\u000f\u0010?\u001a\u00020\nH&\u00a2\u0006\u0004\u0008?\u0010:J\u000f\u0010@\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008@\u0010AJ\u000f\u0010B\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008B\u0010AJ9\u0010I\u001a\u00020\u00042\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020C2\u0006\u0010F\u001a\u00020C2\u0006\u0010G\u001a\u00020C2\u0008\u0008\u0002\u0010H\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008I\u0010JJ-\u0010M\u001a\u00020\u00042\u0008\u0010K\u001a\u0004\u0018\u00010C2\u0008\u0010L\u001a\u0004\u0018\u00010C2\u0008\u0008\u0002\u0010H\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008M\u0010NJ\u000f\u0010O\u001a\u00020\nH&\u00a2\u0006\u0004\u0008O\u0010:J\u000f\u0010P\u001a\u00020\nH&\u00a2\u0006\u0004\u0008P\u0010:J4\u0010Q\u001a\u00020\n2#\u0010\u000b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u001d\u00a2\u0006\u000c\u0008\u0007\u0012\u0008\u0008\u0008\u0012\u0004\u0008\u0008(\u001e\u0012\u0004\u0012\u00020\n0\u0006H&\u00a2\u0006\u0004\u0008Q\u0010RJ\u000f\u0010S\u001a\u00020*H&\u00a2\u0006\u0004\u0008S\u0010TJ\u0011\u0010V\u001a\u0004\u0018\u00010UH&\u00a2\u0006\u0004\u0008V\u0010WJ\u000f\u0010X\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008X\u0010AJ\u0019\u0010[\u001a\u00020\n2\u0008\u0010Z\u001a\u0004\u0018\u00010YH&\u00a2\u0006\u0004\u0008[\u0010\\J\u0019\u0010^\u001a\u00020\n2\u0008\u0010Z\u001a\u0004\u0018\u00010]H&\u00a2\u0006\u0004\u0008^\u0010_J\u0019\u0010a\u001a\u00020\n2\u0008\u0010Z\u001a\u0004\u0018\u00010`H&\u00a2\u0006\u0004\u0008a\u0010bJ\u0015\u0010d\u001a\u0008\u0012\u0004\u0012\u00020\u001d0cH&\u00a2\u0006\u0004\u0008d\u0010eJ\u0019\u0010g\u001a\u00020\n2\u0008\u0010Z\u001a\u0004\u0018\u00010fH&\u00a2\u0006\u0004\u0008g\u0010h\u00a8\u0006i"
    }
    d2 = {
        "Lcom/zykj/sketch/core/record/GraphOperation;",
        "",
        "Lcom/zykj/sketch/core/config/SketchConfig;",
        "config",
        "",
        "copy",
        "Lkotlin/Function1;",
        "Lkotlin/ParameterName;",
        "name",
        "success",
        "Ld6/s;",
        "callBack",
        "initConfig",
        "(Lcom/zykj/sketch/core/config/SketchConfig;ZLr6/c;)V",
        "getConfig",
        "()Lcom/zykj/sketch/core/config/SketchConfig;",
        "Lcom/zykj/sketch/core/config/GraphConfig;",
        "setGraphConfig",
        "(Lcom/zykj/sketch/core/config/GraphConfig;)V",
        "",
        "color",
        "setSketchBackground",
        "(I)V",
        "Landroid/graphics/RectF;",
        "rectF",
        "setDrawArea",
        "(Landroid/graphics/RectF;)V",
        "getDrawArea",
        "()Landroid/graphics/RectF;",
        "",
        "path",
        "Lcom/zykj/sketch/core/listener/ViewControl;",
        "Lcom/zykj/sketch/core/graph/Graph;",
        "finish",
        "Lkotlin/Function0;",
        "exception",
        "loadData",
        "(Ljava/lang/String;Lr6/c;Lr6/c;Lr6/a;)V",
        "Lcom/zykj/sketch/core/data/Mode;",
        "mode",
        "setMode",
        "(Lcom/zykj/sketch/core/data/Mode;)V",
        "Landroid/graphics/Bitmap;",
        "bitmap",
        "positionFlag",
        "Lcom/zykj/sketch/core/graph/ImageGraph;",
        "imageCallBack",
        "pathCallBack",
        "addImage",
        "(Landroid/graphics/Bitmap;IILr6/c;Lr6/c;)V",
        "(Ljava/lang/String;IILr6/c;Lr6/c;)V",
        "imageName",
        "(Ljava/lang/String;Ljava/lang/String;IILr6/c;Lr6/c;)V",
        "(Landroid/graphics/Bitmap;Ljava/lang/String;IILr6/c;Lr6/c;)V",
        "Lcom/zykj/sketch/core/listener/PPTControl;",
        "addPPT",
        "(Ljava/lang/String;Lr6/c;)V",
        "clear",
        "()V",
        "isDelete",
        "reset",
        "(Z)V",
        "prev",
        "next",
        "zoomIn",
        "()Z",
        "zoomOut",
        "",
        "scaleX",
        "scaleY",
        "centerX",
        "centerY",
        "keep",
        "zoom",
        "(FFFFZ)Z",
        "translateX",
        "translateY",
        "tranlation",
        "(Ljava/lang/Float;Ljava/lang/Float;Z)Z",
        "resetMatrix",
        "save",
        "getRecordPath",
        "(Lr6/c;)V",
        "thumbnail",
        "()Landroid/graphics/Bitmap;",
        "Lcom/zykj/sketch/core/data/ThumbnailBean;",
        "limitThumbnail",
        "()Lcom/zykj/sketch/core/data/ThumbnailBean;",
        "isTouch",
        "Lcom/zykj/sketch/core/listener/NextPrevListener;",
        "listener",
        "setNextPrevListener",
        "(Lcom/zykj/sketch/core/listener/NextPrevListener;)V",
        "Lcom/zykj/sketch/core/listener/ActionChangeListener;",
        "setActionChangeListener",
        "(Lcom/zykj/sketch/core/listener/ActionChangeListener;)V",
        "Lcom/zykj/sketch/core/listener/GraphMatrixListener;",
        "setGraphMatrixListener",
        "(Lcom/zykj/sketch/core/listener/GraphMatrixListener;)V",
        "",
        "getResList",
        "()Ljava/util/List;",
        "Lcom/zykj/sketch/core/listener/ImageDeleteListener;",
        "setImageDeleteListener",
        "(Lcom/zykj/sketch/core/listener/ImageDeleteListener;)V",
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
.method public abstract addImage(Landroid/graphics/Bitmap;IILr6/c;Lr6/c;)V
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "II",
            "Lr6/c;",
            "Lr6/c;",
            ")V"
        }
    .end annotation
.end method

.method public abstract addImage(Landroid/graphics/Bitmap;Ljava/lang/String;IILr6/c;Lr6/c;)V
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Ljava/lang/String;",
            "II",
            "Lr6/c;",
            "Lr6/c;",
            ")V"
        }
    .end annotation
.end method

.method public abstract addImage(Ljava/lang/String;IILr6/c;Lr6/c;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Lr6/c;",
            "Lr6/c;",
            ")V"
        }
    .end annotation
.end method

.method public abstract addImage(Ljava/lang/String;Ljava/lang/String;IILr6/c;Lr6/c;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II",
            "Lr6/c;",
            "Lr6/c;",
            ")V"
        }
    .end annotation
.end method

.method public abstract addPPT(Ljava/lang/String;Lr6/c;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lr6/c;",
            ")V"
        }
    .end annotation
.end method

.method public abstract clear()V
.end method

.method public abstract getConfig()Lcom/zykj/sketch/core/config/SketchConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getDrawArea()Landroid/graphics/RectF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getRecordPath(Lr6/c;)V
    .param p1    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/c;",
            ")V"
        }
    .end annotation
.end method

.method public abstract getResList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract initConfig(Lcom/zykj/sketch/core/config/SketchConfig;ZLr6/c;)V
    .param p1    # Lcom/zykj/sketch/core/config/SketchConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/sketch/core/config/SketchConfig;",
            "Z",
            "Lr6/c;",
            ")V"
        }
    .end annotation
.end method

.method public abstract isTouch()Z
.end method

.method public abstract limitThumbnail()Lcom/zykj/sketch/core/data/ThumbnailBean;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract loadData(Ljava/lang/String;Lr6/c;Lr6/c;Lr6/a;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lr6/c;",
            "Lr6/c;",
            "Lr6/a;",
            ")V"
        }
    .end annotation
.end method

.method public abstract next()V
.end method

.method public abstract prev()V
.end method

.method public abstract reset(Z)V
.end method

.method public abstract resetMatrix()V
.end method

.method public abstract save()V
.end method

.method public abstract setActionChangeListener(Lcom/zykj/sketch/core/listener/ActionChangeListener;)V
    .param p1    # Lcom/zykj/sketch/core/listener/ActionChangeListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract setDrawArea(Landroid/graphics/RectF;)V
    .param p1    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract setGraphConfig(Lcom/zykj/sketch/core/config/GraphConfig;)V
    .param p1    # Lcom/zykj/sketch/core/config/GraphConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
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

.method public abstract setMode(Lcom/zykj/sketch/core/data/Mode;)V
    .param p1    # Lcom/zykj/sketch/core/data/Mode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract setNextPrevListener(Lcom/zykj/sketch/core/listener/NextPrevListener;)V
    .param p1    # Lcom/zykj/sketch/core/listener/NextPrevListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract setSketchBackground(I)V
.end method

.method public abstract thumbnail()Landroid/graphics/Bitmap;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract tranlation(Ljava/lang/Float;Ljava/lang/Float;Z)Z
    .param p1    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract zoom(FFFFZ)Z
.end method

.method public abstract zoomIn()Z
.end method

.method public abstract zoomOut()Z
.end method
