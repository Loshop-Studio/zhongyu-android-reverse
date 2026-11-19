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
        "\u0000\u00a6\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0007\n\u0002\u0008\u000b\u0008f\u0018\u00002\u00020\u0001JT\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0016\u0008\u0002\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00030\n2\u0016\u0008\u0002\u0010\u000c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00030\nH&J\\\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0016\u0008\u0002\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00030\n2\u0016\u0008\u0002\u0010\u000c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00030\nH&JT\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0016\u0008\u0002\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00030\n2\u0016\u0008\u0002\u0010\u000c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00030\nH&J\\\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0016\u0008\u0002\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00030\n2\u0016\u0008\u0002\u0010\u000c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00030\nH&J$\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\nH&J\u0008\u0010\u0013\u001a\u00020\u0003H&J\u0008\u0010\u0014\u001a\u00020\u0015H&J\u0008\u0010\u0016\u001a\u00020\u0017H&J-\u0010\u0018\u001a\u00020\u00032#\u0010\u0011\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\r\u00a2\u0006\u000c\u0008\u0019\u0012\u0008\u0008\u001a\u0012\u0004\u0008\u0008(\u000f\u0012\u0004\u0012\u00020\u00030\nH&J\u000e\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u001cH&J?\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00152\u0008\u0008\u0002\u0010\u001f\u001a\u00020 2#\u0008\u0002\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110 \u00a2\u0006\u000c\u0008\u0019\u0012\u0008\u0008\u001a\u0012\u0004\u0008\u0008(!\u0012\u0004\u0012\u00020\u00030\nH&J\u0008\u0010\"\u001a\u00020 H&J\n\u0010#\u001a\u0004\u0018\u00010$H&JJ\u0010%\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00030\n2\u0012\u0010\'\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00030\n2\u0010\u0008\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010*H&J\u0008\u0010+\u001a\u00020\u0003H&J\u0008\u0010,\u001a\u00020\u0003H&J\u0012\u0010-\u001a\u00020\u00032\u0008\u0008\u0002\u0010.\u001a\u00020 H&J\u0008\u0010/\u001a\u00020\u0003H&J\u0008\u00100\u001a\u00020\u0003H&J\u0012\u00101\u001a\u00020\u00032\u0008\u00102\u001a\u0004\u0018\u000103H&J\u0010\u00104\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u0017H&J\u0010\u00106\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u000207H&J\u0012\u00108\u001a\u00020\u00032\u0008\u00102\u001a\u0004\u0018\u000109H&J\u0012\u0010:\u001a\u00020\u00032\u0008\u00102\u001a\u0004\u0018\u00010;H&J\u0010\u0010<\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020=H&J\u0012\u0010>\u001a\u00020\u00032\u0008\u00102\u001a\u0004\u0018\u00010?H&J\u0010\u0010@\u001a\u00020\u00032\u0006\u0010A\u001a\u00020\u0007H&J\u0008\u0010B\u001a\u00020\u0005H&J+\u0010C\u001a\u00020 2\u0008\u0010D\u001a\u0004\u0018\u00010E2\u0008\u0010F\u001a\u0004\u0018\u00010E2\u0008\u0008\u0002\u0010G\u001a\u00020 H&\u00a2\u0006\u0002\u0010HJ2\u0010I\u001a\u00020 2\u0006\u0010J\u001a\u00020E2\u0006\u0010K\u001a\u00020E2\u0006\u0010L\u001a\u00020E2\u0006\u0010M\u001a\u00020E2\u0008\u0008\u0002\u0010G\u001a\u00020 H&J\u0008\u0010N\u001a\u00020 H&J\u0008\u0010O\u001a\u00020 H&\u00a8\u0006P"
    }
    d2 = {
        "Lcom/zykj/sketch/core/record/GraphOperation;",
        "",
        "addImage",
        "",
        "bitmap",
        "Landroid/graphics/Bitmap;",
        "positionFlag",
        "",
        "mode",
        "imageCallBack",
        "Lkotlin/Function1;",
        "Lcom/zykj/sketch/core/graph/ImageGraph;",
        "pathCallBack",
        "",
        "imageName",
        "path",
        "addPPT",
        "callBack",
        "Lcom/zykj/sketch/core/listener/PPTControl;",
        "clear",
        "getConfig",
        "Lcom/zykj/sketch/core/config/SketchConfig;",
        "getDrawArea",
        "Landroid/graphics/RectF;",
        "getRecordPath",
        "Lkotlin/ParameterName;",
        "name",
        "getResList",
        "",
        "initConfig",
        "config",
        "copy",
        "",
        "success",
        "isTouch",
        "limitThumbnail",
        "Lcom/zykj/sketch/core/data/ThumbnailBean;",
        "loadData",
        "Lcom/zykj/sketch/core/listener/ViewControl;",
        "finish",
        "Lcom/zykj/sketch/core/graph/Graph;",
        "exception",
        "Lkotlin/Function0;",
        "next",
        "prev",
        "reset",
        "isDelete",
        "resetMatrix",
        "save",
        "setActionChangeListener",
        "listener",
        "Lcom/zykj/sketch/core/listener/ActionChangeListener;",
        "setDrawArea",
        "rectF",
        "setGraphConfig",
        "Lcom/zykj/sketch/core/config/GraphConfig;",
        "setGraphMatrixListener",
        "Lcom/zykj/sketch/core/listener/GraphMatrixListener;",
        "setImageDeleteListener",
        "Lcom/zykj/sketch/core/listener/ImageDeleteListener;",
        "setMode",
        "Lcom/zykj/sketch/core/data/Mode;",
        "setNextPrevListener",
        "Lcom/zykj/sketch/core/listener/NextPrevListener;",
        "setSketchBackground",
        "color",
        "thumbnail",
        "tranlation",
        "translateX",
        "",
        "translateY",
        "keep",
        "(Ljava/lang/Float;Ljava/lang/Float;Z)Z",
        "zoom",
        "scaleX",
        "scaleY",
        "centerX",
        "centerY",
        "zoomIn",
        "zoomOut",
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
.method public abstract addImage(Landroid/graphics/Bitmap;IILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "II",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/zykj/sketch/core/graph/ImageGraph;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract addImage(Landroid/graphics/Bitmap;Ljava/lang/String;IILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Ljava/lang/String;",
            "II",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/zykj/sketch/core/graph/ImageGraph;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract addImage(Ljava/lang/String;IILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/zykj/sketch/core/graph/ImageGraph;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract addImage(Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/zykj/sketch/core/graph/ImageGraph;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract addPPT(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/zykj/sketch/core/listener/PPTControl;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract clear()V
.end method

.method public abstract getConfig()Lcom/zykj/sketch/core/config/SketchConfig;
.end method

.method public abstract getDrawArea()Landroid/graphics/RectF;
.end method

.method public abstract getRecordPath(Lkotlin/jvm/functions/Function1;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
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
.end method

.method public abstract initConfig(Lcom/zykj/sketch/core/config/SketchConfig;ZLkotlin/jvm/functions/Function1;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/sketch/core/config/SketchConfig;",
            "Z",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract isTouch()Z
.end method

.method public abstract limitThumbnail()Lcom/zykj/sketch/core/data/ThumbnailBean;
.end method

.method public abstract loadData(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/zykj/sketch/core/listener/ViewControl;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/zykj/sketch/core/graph/Graph;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
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
.end method

.method public abstract setDrawArea(Landroid/graphics/RectF;)V
.end method

.method public abstract setGraphConfig(Lcom/zykj/sketch/core/config/GraphConfig;)V
.end method

.method public abstract setGraphMatrixListener(Lcom/zykj/sketch/core/listener/GraphMatrixListener;)V
.end method

.method public abstract setImageDeleteListener(Lcom/zykj/sketch/core/listener/ImageDeleteListener;)V
.end method

.method public abstract setMode(Lcom/zykj/sketch/core/data/Mode;)V
.end method

.method public abstract setNextPrevListener(Lcom/zykj/sketch/core/listener/NextPrevListener;)V
.end method

.method public abstract setSketchBackground(I)V
.end method

.method public abstract thumbnail()Landroid/graphics/Bitmap;
.end method

.method public abstract tranlation(Ljava/lang/Float;Ljava/lang/Float;Z)Z
.end method

.method public abstract zoom(FFFFZ)Z
.end method

.method public abstract zoomIn()Z
.end method

.method public abstract zoomOut()Z
.end method
