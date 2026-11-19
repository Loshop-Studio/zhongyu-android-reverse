# RE note 本类字节码直接引用的读写或显示接口包括文件流、位图。
.class public final Lcom/zykj/sketch/core/record/RecordControl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/sketch/core/record/RecordControl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a2\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u0000 \u00a0\u00012\u00020\u0001:\u0002\u00a0\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J?\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0014\u0008\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u00132\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000e0\u0013\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001e\u00a2\u0006\u0004\u0008 \u0010!J\u0015\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"\u00a2\u0006\u0004\u0008$\u0010%J!\u0010*\u001a\u00020\u000e2\u0008\u0010\'\u001a\u0004\u0018\u00010&2\u0008\u0010)\u001a\u0004\u0018\u00010(\u00a2\u0006\u0004\u0008*\u0010+J\r\u0010,\u001a\u00020(\u00a2\u0006\u0004\u0008,\u0010-Js\u00107\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020&2\u0006\u00101\u001a\u00020&2\u0008\u0008\u0002\u00102\u001a\u00020&2\u0008\u0008\u0002\u0010\u001f\u001a\u00020&2\u0016\u0008\u0002\u00104\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000103\u0012\u0004\u0012\u00020\u000e0\u00132\u0008\u0008\u0002\u00105\u001a\u00020\u00112\u0016\u0008\u0002\u00106\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u000e0\u0013\u00a2\u0006\u0004\u00087\u00108Jm\u00107\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u00100\u001a\u00020&2\u0006\u00101\u001a\u00020&2\u0006\u00102\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020&2\u0014\u00104\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000103\u0012\u0004\u0012\u00020\u000e0\u00132\u0008\u0008\u0002\u00105\u001a\u00020\u00112\u0016\u0008\u0002\u00106\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u000e0\u0013\u00a2\u0006\u0004\u00087\u00109JI\u0010=\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010:\u001a\u00020&2\u0006\u0010;\u001a\u00020&2\u0006\u00100\u001a\u00020&2\u0006\u00101\u001a\u00020&2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u000e0\u0013\u00a2\u0006\u0004\u0008=\u0010>J\r\u0010?\u001a\u00020\u000e\u00a2\u0006\u0004\u0008?\u0010@J\r\u0010A\u001a\u00020\u000e\u00a2\u0006\u0004\u0008A\u0010@J7\u0010I\u001a\u00020G2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020B2\u0006\u0010E\u001a\u00020B2\u0006\u0010F\u001a\u00020B2\u0008\u0008\u0002\u0010H\u001a\u00020G\u00a2\u0006\u0004\u0008I\u0010JJ)\u0010M\u001a\u00020G2\u0008\u0010K\u001a\u0004\u0018\u00010B2\u0008\u0010L\u001a\u0004\u0018\u00010B2\u0006\u0010H\u001a\u00020G\u00a2\u0006\u0004\u0008M\u0010NJ\r\u0010O\u001a\u00020\u000e\u00a2\u0006\u0004\u0008O\u0010@J\r\u0010P\u001a\u00020\u000e\u00a2\u0006\u0004\u0008P\u0010@J\u0017\u0010R\u001a\u00020\u000e2\u0008\u0008\u0002\u0010Q\u001a\u00020G\u00a2\u0006\u0004\u0008R\u0010SJD\u0010V\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020&2\u0006\u0010;\u001a\u00020&2%\u0008\u0002\u00104\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0011\u00a2\u0006\u000c\u0008T\u0012\u0008\u0008U\u0012\u0004\u0008\u0008(\u0012\u0012\u0004\u0012\u00020\u000e0\u0013\u00a2\u0006\u0004\u0008V\u0010WJ\r\u0010X\u001a\u00020\u000e\u00a2\u0006\u0004\u0008X\u0010@J\u001d\u0010Y\u001a\u00020.2\u0006\u0010:\u001a\u00020&2\u0006\u0010;\u001a\u00020&\u00a2\u0006\u0004\u0008Y\u0010ZJ\u000f\u0010\\\u001a\u0004\u0018\u00010[\u00a2\u0006\u0004\u0008\\\u0010]J\u0013\u0010_\u001a\u0008\u0012\u0004\u0012\u00020\u00110^\u00a2\u0006\u0004\u0008_\u0010`J\r\u0010a\u001a\u00020\u000e\u00a2\u0006\u0004\u0008a\u0010@J\r\u0010b\u001a\u00020\u000e\u00a2\u0006\u0004\u0008b\u0010@J\r\u0010c\u001a\u00020G\u00a2\u0006\u0004\u0008c\u0010dJ\u0017\u0010f\u001a\u00020\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010e\u00a2\u0006\u0004\u0008f\u0010gJ\u0017\u0010i\u001a\u00020\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010h\u00a2\u0006\u0004\u0008i\u0010jJ\u0017\u0010l\u001a\u00020\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010k\u00a2\u0006\u0004\u0008l\u0010mJ\u0017\u0010o\u001a\u00020\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010n\u00a2\u0006\u0004\u0008o\u0010pJ\r\u0010q\u001a\u00020G\u00a2\u0006\u0004\u0008q\u0010dJ;\u0010v\u001a\u00020\u000e2\u0006\u0010r\u001a\u00020&2\u000c\u0010u\u001a\u0008\u0012\u0004\u0012\u00020t0s2\u0014\u0008\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u0013H\u0002\u00a2\u0006\u0004\u0008v\u0010wJ\u001d\u0010y\u001a\u00020\u000e2\u000c\u0010u\u001a\u0008\u0012\u0004\u0012\u00020x0sH\u0002\u00a2\u0006\u0004\u0008y\u0010zJM\u0010|\u001a\u00020\u000e2\u0006\u0010{\u001a\u00020\u00112\u0006\u00100\u001a\u00020&2\u0006\u00101\u001a\u00020&2\u0006\u00102\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020&2\u0014\u00104\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000103\u0012\u0004\u0012\u00020\u000e0\u0013H\u0002\u00a2\u0006\u0004\u0008|\u0010>J8\u0010\u007f\u001a\u00020B2\u0006\u0010}\u001a\u00020&2\u0006\u0010~\u001a\u00020&2\u0006\u00100\u001a\u00020&2\u0006\u00101\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020&H\u0002\u00a2\u0006\u0005\u0008\u007f\u0010\u0080\u0001J+\u0010\u0084\u0001\u001a\u00020\u000e2\u000e\u0010\u0082\u0001\u001a\t\u0012\u0004\u0012\u00020\u00110\u0081\u00012\u0007\u0010\u0083\u0001\u001a\u00020\u0016H\u0002\u00a2\u0006\u0006\u0008\u0084\u0001\u0010\u0085\u0001J\"\u0010\u0086\u0001\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020&2\u0006\u0010;\u001a\u00020&H\u0002\u00a2\u0006\u0006\u0008\u0086\u0001\u0010\u0087\u0001R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0003\u0010\u0088\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0005\u0010\u0089\u0001R\"\u0010\u008c\u0001\u001a\r \u008b\u0001*\u0005\u0018\u00010\u008a\u00010\u008a\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008c\u0001\u0010\u008d\u0001R\u0018\u0010\u008f\u0001\u001a\u00030\u008e\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0092\u0001\u0010\u0093\u0001R\u0018\u0010\u0095\u0001\u001a\u00030\u0094\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0095\u0001\u0010\u0096\u0001R\u001a\u0010\u0098\u0001\u001a\u00030\u0097\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0098\u0001\u0010\u0099\u0001R\u0018\u0010\u009b\u0001\u001a\u00030\u009a\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u009b\u0001\u0010\u009c\u0001R\u001a\u0010\u009e\u0001\u001a\u00030\u009d\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u009e\u0001\u0010\u009f\u0001\u00a8\u0006\u00a1\u0001"
    }
    d2 = {
        "Lcom/zykj/sketch/core/record/RecordControl;",
        "",
        "Landroid/view/ViewGroup;",
        "viewGroup",
        "Lcom/zykj/sketch/core/config/SketchConfig;",
        "sketchConfig",
        "Lcom/zykj/sketch/core/listener/RealDraw;",
        "realDraw",
        "Lcom/zykj/sketch/core/listener/ImitateDraw;",
        "imitateDraw",
        "<init>",
        "(Landroid/view/ViewGroup;Lcom/zykj/sketch/core/config/SketchConfig;Lcom/zykj/sketch/core/listener/RealDraw;Lcom/zykj/sketch/core/listener/ImitateDraw;)V",
        "Lcom/zykj/sketch/core/listener/ImageDeleteListener;",
        "listener",
        "Ld6/s;",
        "setImageDeleteListener",
        "(Lcom/zykj/sketch/core/listener/ImageDeleteListener;)V",
        "",
        "path",
        "Lkotlin/Function1;",
        "Lcom/zykj/sketch/core/listener/ViewControl;",
        "viewBack",
        "Lcom/zykj/sketch/core/graph/Graph;",
        "finish",
        "loadData",
        "(Ljava/lang/String;Lr6/c;Lr6/c;)V",
        "Landroid/view/MotionEvent;",
        "event",
        "onTouchAdapterEvent",
        "(Landroid/view/MotionEvent;)V",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;",
        "mode",
        "setActionMode",
        "(Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;)V",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;",
        "config",
        "setGraphConfig",
        "(Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;)V",
        "",
        "color",
        "Landroid/graphics/RectF;",
        "rectF",
        "setDrawConfig",
        "(Ljava/lang/Integer;Landroid/graphics/RectF;)V",
        "getDrawConfig",
        "()Landroid/graphics/RectF;",
        "Landroid/graphics/Bitmap;",
        "bitmap",
        "viewWidth",
        "viewHeight",
        "positionFlag",
        "Lcom/zykj/sketch/core/graph/ImageGraph;",
        "callBack",
        "imageName",
        "pathCallBack",
        "addAdapterImage",
        "(Landroid/graphics/Bitmap;IIIILr6/c;Ljava/lang/String;Lr6/c;)V",
        "(Ljava/lang/String;IIIILr6/c;Ljava/lang/String;Lr6/c;)V",
        "width",
        "height",
        "Lcom/zykj/sketch/core/listener/PPTControl;",
        "addAdapterPPT",
        "(Ljava/lang/String;IIIILr6/c;)V",
        "prevAction",
        "()V",
        "nextAction",
        "",
        "scaleX",
        "scaleY",
        "centerX",
        "centerY",
        "",
        "keep",
        "zoom",
        "(FFFFZ)Z",
        "translateX",
        "translateY",
        "translation",
        "(Ljava/lang/Float;Ljava/lang/Float;Z)Z",
        "resetMatrix",
        "clear",
        "isDelete",
        "reset",
        "(Z)V",
        "Lkotlin/ParameterName;",
        "name",
        "getRecordPath",
        "(IILr6/c;)V",
        "onDestroy",
        "thumbnail",
        "(II)Landroid/graphics/Bitmap;",
        "Lcom/zykj/sketch/core/data/ThumbnailBean;",
        "limitThumbnail",
        "()Lcom/zykj/sketch/core/data/ThumbnailBean;",
        "",
        "getResList",
        "()Ljava/util/List;",
        "startAudio",
        "stopAudio",
        "isRecord",
        "()Z",
        "Lcom/zykj/sketch/core/listener/ProgressListener;",
        "addProgressListener",
        "(Lcom/zykj/sketch/core/listener/ProgressListener;)V",
        "Lcom/zykj/sketch/core/listener/NextPrevListener;",
        "addNextPrevListener",
        "(Lcom/zykj/sketch/core/listener/NextPrevListener;)V",
        "Lcom/zykj/sketch/core/listener/ActionChangeListener;",
        "addActionChangeListener",
        "(Lcom/zykj/sketch/core/listener/ActionChangeListener;)V",
        "Lcom/zykj/sketch/core/listener/GraphMatrixListener;",
        "setGraphMatrixListener",
        "(Lcom/zykj/sketch/core/listener/GraphMatrixListener;)V",
        "isTouch",
        "version",
        "",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
        "parseEventList",
        "executeActionContent",
        "(ILjava/util/List;Lr6/c;)V",
        "Lcom/zykj/sketch/core/data/GraphTask;",
        "executeTask",
        "(Ljava/util/List;)V",
        "filePath",
        "addImage",
        "bitmapWidth",
        "bitmapHeight",
        "countScale",
        "(IIIII)F",
        "Ljava/util/ArrayList;",
        "list",
        "graph",
        "getImagePath",
        "(Ljava/util/ArrayList;Lcom/zykj/sketch/core/graph/Graph;)V",
        "saveBitmap",
        "(II)V",
        "Landroid/view/ViewGroup;",
        "Lcom/zykj/sketch/core/config/SketchConfig;",
        "Landroid/content/Context;",
        "kotlin.jvm.PlatformType",
        "context",
        "Landroid/content/Context;",
        "Lcom/zykj/sketch/core/GraphControl;",
        "graphControl",
        "Lcom/zykj/sketch/core/GraphControl;",
        "Lcom/zykj/sketch/core/ActionStrategyFactory;",
        "actionFactory",
        "Lcom/zykj/sketch/core/ActionStrategyFactory;",
        "Lcom/zykj/sketch/core/ActionRecord;",
        "actionRecord",
        "Lcom/zykj/sketch/core/ActionRecord;",
        "Lcom/zykj/sketch/core/record/AudioControl;",
        "audioControl",
        "Lcom/zykj/sketch/core/record/AudioControl;",
        "Lcom/zykj/sketch/core/ActionRecordExecute;",
        "actionExecute",
        "Lcom/zykj/sketch/core/ActionRecordExecute;",
        "Landroid/graphics/Matrix;",
        "cameraInvertMatrix",
        "Landroid/graphics/Matrix;",
        "Companion",
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


# static fields
.field public static final Companion:Lcom/zykj/sketch/core/record/RecordControl$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final thumbnailFileName:Ljava/lang/String; = "thumbnail.jpg"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final actionExecute:Lcom/zykj/sketch/core/ActionRecordExecute;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final actionFactory:Lcom/zykj/sketch/core/ActionStrategyFactory;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final actionRecord:Lcom/zykj/sketch/core/ActionRecord;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private audioControl:Lcom/zykj/sketch/core/record/AudioControl;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private cameraInvertMatrix:Landroid/graphics/Matrix;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final context:Landroid/content/Context;

.field private final graphControl:Lcom/zykj/sketch/core/GraphControl;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final sketchConfig:Lcom/zykj/sketch/core/config/SketchConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final viewGroup:Landroid/view/ViewGroup;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/sketch/core/record/RecordControl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/sketch/core/record/RecordControl$Companion;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Lcom/zykj/sketch/core/record/RecordControl;->Companion:Lcom/zykj/sketch/core/record/RecordControl$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup;Lcom/zykj/sketch/core/config/SketchConfig;Lcom/zykj/sketch/core/listener/RealDraw;Lcom/zykj/sketch/core/listener/ImitateDraw;)V
    .locals 3
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/sketch/core/config/SketchConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/zykj/sketch/core/listener/RealDraw;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/zykj/sketch/core/listener/ImitateDraw;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "viewGroup"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "sketchConfig"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "realDraw"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "imitateDraw"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lcom/zykj/sketch/core/record/RecordControl;->viewGroup:Landroid/view/ViewGroup;

    .line 25
    .line 26
    iput-object p2, p0, Lcom/zykj/sketch/core/record/RecordControl;->sketchConfig:Lcom/zykj/sketch/core/config/SketchConfig;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Lcom/zykj/sketch/core/record/RecordControl;->context:Landroid/content/Context;

    .line 33
    .line 34
    new-instance v1, Lcom/zykj/sketch/core/GraphControl;

    .line 35
    .line 36
    const-string v2, "context"

    .line 37
    .line 38
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-direct {v1, v0, p3, p4, p2}, Lcom/zykj/sketch/core/GraphControl;-><init>(Landroid/content/Context;Lcom/zykj/sketch/core/listener/RealDraw;Lcom/zykj/sketch/core/listener/ImitateDraw;Lcom/zykj/sketch/core/config/SketchConfig;)V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 45
    .line 46
    new-instance p2, Lcom/zykj/sketch/core/ActionStrategyFactory;

    .line 47
    .line 48
    invoke-direct {p2, v1}, Lcom/zykj/sketch/core/ActionStrategyFactory;-><init>(Lcom/zykj/sketch/core/listener/IControl;)V

    .line 49
    .line 50
    .line 51
    iput-object p2, p0, Lcom/zykj/sketch/core/record/RecordControl;->actionFactory:Lcom/zykj/sketch/core/ActionStrategyFactory;

    .line 52
    .line 53
    new-instance p3, Lcom/zykj/sketch/core/ActionRecord;

    .line 54
    .line 55
    invoke-direct {p3, v1, p2}, Lcom/zykj/sketch/core/ActionRecord;-><init>(Lcom/zykj/sketch/core/listener/IControl;Lcom/zykj/sketch/core/ActionStrategyFactory;)V

    .line 56
    .line 57
    .line 58
    iput-object p3, p0, Lcom/zykj/sketch/core/record/RecordControl;->actionRecord:Lcom/zykj/sketch/core/ActionRecord;

    .line 59
    .line 60
    new-instance p4, Lcom/zykj/sketch/core/record/AudioControl;

    .line 61
    .line 62
    invoke-direct {p4, p3}, Lcom/zykj/sketch/core/record/AudioControl;-><init>(Lcom/zykj/sketch/core/ActionRecord;)V

    .line 63
    .line 64
    .line 65
    iput-object p4, p0, Lcom/zykj/sketch/core/record/RecordControl;->audioControl:Lcom/zykj/sketch/core/record/AudioControl;

    .line 66
    .line 67
    new-instance p4, Lcom/zykj/sketch/core/ActionRecordExecute;

    .line 68
    .line 69
    invoke-direct {p4, p1, v1, p3, p2}, Lcom/zykj/sketch/core/ActionRecordExecute;-><init>(Landroid/view/ViewGroup;Lcom/zykj/sketch/core/listener/IControl;Lcom/zykj/sketch/core/ActionRecord;Lcom/zykj/sketch/core/ActionStrategyFactory;)V

    .line 70
    .line 71
    .line 72
    iput-object p4, p0, Lcom/zykj/sketch/core/record/RecordControl;->actionExecute:Lcom/zykj/sketch/core/ActionRecordExecute;

    .line 73
    .line 74
    new-instance p1, Landroid/graphics/Matrix;

    .line 75
    .line 76
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 77
    .line 78
    .line 79
    iput-object p1, p0, Lcom/zykj/sketch/core/record/RecordControl;->cameraInvertMatrix:Landroid/graphics/Matrix;

    .line 80
    .line 81
    return-void
.end method

.method public static synthetic a(Lcom/zykj/sketch/EzyDrawBoard$BoardHead;Ljava/lang/String;Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;Lcom/zykj/sketch/core/record/RecordControl;Lr6/c;Lr6/c;)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/zykj/sketch/core/record/RecordControl;->loadData$lambda-1$lambda-0(Lcom/zykj/sketch/EzyDrawBoard$BoardHead;Ljava/lang/String;Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;Lcom/zykj/sketch/core/record/RecordControl;Lr6/c;Lr6/c;)V

    return-void
.end method

.method public static final synthetic access$getActionExecute$p(Lcom/zykj/sketch/core/record/RecordControl;)Lcom/zykj/sketch/core/ActionRecordExecute;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/sketch/core/record/RecordControl;->actionExecute:Lcom/zykj/sketch/core/ActionRecordExecute;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic addAdapterImage$default(Lcom/zykj/sketch/core/record/RecordControl;Landroid/graphics/Bitmap;IIIILr6/c;Ljava/lang/String;Lr6/c;ILjava/lang/Object;)V
    .locals 9

    move/from16 v0, p9

    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_0

    const/4 p4, 0x0

    :cond_0
    move v4, p4

    and-int/lit8 p4, v0, 0x10

    if-eqz p4, :cond_1

    const/16 p4, 0x18

    move v5, p4

    goto :goto_0

    :cond_1
    move v5, p5

    :goto_0
    and-int/lit8 p4, v0, 0x20

    if-eqz p4, :cond_2

    .line 1
    sget-object p4, Lcom/zykj/sketch/core/record/RecordControl$addAdapterImage$1;->INSTANCE:Lcom/zykj/sketch/core/record/RecordControl$addAdapterImage$1;

    move-object v6, p4

    goto :goto_1

    :cond_2
    move-object v6, p6

    :goto_1
    and-int/lit8 p4, v0, 0x40

    if-eqz p4, :cond_3

    .line 2
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p4

    invoke-virtual {p4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p4

    const-string v1, "randomUUID().toString()"

    invoke-static {p4, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "-"

    const-string v2, ""

    invoke-static {p4, v1, v2}, Lkotlin/text/w;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    move-object v7, p4

    goto :goto_2

    :cond_3
    move-object/from16 v7, p7

    :goto_2
    and-int/lit16 p4, v0, 0x80

    if-eqz p4, :cond_4

    .line 3
    sget-object p4, Lcom/zykj/sketch/core/record/RecordControl$addAdapterImage$2;->INSTANCE:Lcom/zykj/sketch/core/record/RecordControl$addAdapterImage$2;

    move-object v8, p4

    :goto_3
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    goto :goto_4

    :cond_4
    move-object/from16 v8, p8

    goto :goto_3

    .line 4
    :goto_4
    invoke-virtual/range {v0 .. v8}, Lcom/zykj/sketch/core/record/RecordControl;->addAdapterImage(Landroid/graphics/Bitmap;IIIILr6/c;Ljava/lang/String;Lr6/c;)V

    return-void
.end method

.method public static synthetic addAdapterImage$default(Lcom/zykj/sketch/core/record/RecordControl;Ljava/lang/String;IIIILr6/c;Ljava/lang/String;Lr6/c;ILjava/lang/Object;)V
    .locals 11

    move/from16 v0, p9

    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_0

    .line 5
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "randomUUID().toString()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "-"

    const-string v3, ""

    invoke-static {v1, v2, v3}, Lkotlin/text/w;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object v9, v1

    goto :goto_0

    :cond_0
    move-object/from16 v9, p7

    :goto_0
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_1

    .line 6
    sget-object v0, Lcom/zykj/sketch/core/record/RecordControl$addAdapterImage$3;->INSTANCE:Lcom/zykj/sketch/core/record/RecordControl$addAdapterImage$3;

    move-object v10, v0

    :goto_1
    move-object v2, p0

    move-object v3, p1

    move v4, p2

    move v5, p3

    move v6, p4

    move/from16 v7, p5

    move-object/from16 v8, p6

    goto :goto_2

    :cond_1
    move-object/from16 v10, p8

    goto :goto_1

    .line 7
    :goto_2
    invoke-virtual/range {v2 .. v10}, Lcom/zykj/sketch/core/record/RecordControl;->addAdapterImage(Ljava/lang/String;IIIILr6/c;Ljava/lang/String;Lr6/c;)V

    return-void
.end method

# RE I/O 解码本地图片（BitmapFactory.decodeFile）。
.method private final addImage(Ljava/lang/String;IIIILr6/c;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "IIII",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    move-object/from16 v6, p1

    .line 2
    .line 3
    new-instance v7, Landroid/graphics/BitmapFactory$Options;

    .line 4
    .line 5
    invoke-direct {v7}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, v7, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 10
    .line 11
    invoke-static {v6, v7}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 12
    .line 13
    .line 14
    iget v1, v7, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 15
    .line 16
    iget v2, v7, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 17
    .line 18
    move-object/from16 v0, p0

    .line 19
    .line 20
    move/from16 v3, p2

    .line 21
    .line 22
    move/from16 v4, p3

    .line 23
    .line 24
    move/from16 v5, p5

    .line 25
    .line 26
    invoke-direct/range {v0 .. v5}, Lcom/zykj/sketch/core/record/RecordControl;->countScale(IIIII)F

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    iget-object v2, v0, Lcom/zykj/sketch/core/record/RecordControl;->actionExecute:Lcom/zykj/sketch/core/ActionRecordExecute;

    .line 31
    .line 32
    iget-object v8, v0, Lcom/zykj/sketch/core/record/RecordControl;->actionRecord:Lcom/zykj/sketch/core/ActionRecord;

    .line 33
    .line 34
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 35
    .line 36
    .line 37
    move-result-wide v9

    .line 38
    new-instance v3, Ljava/io/File;

    .line 39
    .line 40
    invoke-direct {v3, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v11

    .line 47
    const-string v3, "File(filePath).name"

    .line 48
    .line 49
    invoke-static {v11, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iget v3, v7, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 53
    .line 54
    int-to-float v3, v3

    .line 55
    mul-float/2addr v3, v1

    .line 56
    float-to-int v12, v3

    .line 57
    iget v3, v7, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 58
    .line 59
    int-to-float v3, v3

    .line 60
    mul-float/2addr v3, v1

    .line 61
    float-to-int v13, v3

    .line 62
    move/from16 v3, p2

    .line 63
    .line 64
    int-to-float v1, v3

    .line 65
    iget-object v3, v0, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 66
    .line 67
    invoke-virtual {v3}, Lcom/zykj/sketch/core/GraphControl;->getScale()F

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    div-float/2addr v1, v3

    .line 72
    float-to-int v14, v1

    .line 73
    int-to-float v1, v4

    .line 74
    iget-object v3, v0, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 75
    .line 76
    invoke-virtual {v3}, Lcom/zykj/sketch/core/GraphControl;->getScale()F

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    div-float/2addr v1, v3

    .line 81
    float-to-int v15, v1

    .line 82
    move/from16 v16, p4

    .line 83
    .line 84
    invoke-virtual/range {v8 .. v16}, Lcom/zykj/sketch/core/ActionRecord;->buildImageData(JLjava/lang/String;IIIII)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    move-object/from16 v3, p6

    .line 89
    .line 90
    invoke-virtual {v2, v1, v3}, Lcom/zykj/sketch/core/ActionRecordExecute;->onAddImageEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;Lr6/c;)V

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method public static synthetic b(IILcom/zykj/sketch/core/record/RecordControl;Lr6/c;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/sketch/core/record/RecordControl;->getRecordPath$lambda-13(IILcom/zykj/sketch/core/record/RecordControl;Lr6/c;)V

    return-void
.end method

.method private final countScale(IIIII)F
    .locals 2

    .line 1
    const/16 v0, 0x18

    .line 2
    .line 3
    if-eq p5, v0, :cond_1

    .line 4
    .line 5
    const/16 v0, 0x19

    .line 6
    .line 7
    if-eq p5, v0, :cond_0

    .line 8
    .line 9
    int-to-float p3, p3

    .line 10
    iget-object v0, p0, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/zykj/sketch/core/GraphControl;->getScale()F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    div-float/2addr p3, v0

    .line 17
    int-to-float p4, p4

    .line 18
    iget-object v0, p0, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/zykj/sketch/core/GraphControl;->getScale()F

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    :goto_0
    div-float/2addr p4, v0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    int-to-float p3, p3

    .line 27
    iget-object v0, p0, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/zykj/sketch/core/GraphControl;->getScale()F

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    const v1, 0x3f666666    # 0.9f

    .line 34
    .line 35
    .line 36
    div-float/2addr v0, v1

    .line 37
    div-float/2addr p3, v0

    .line 38
    int-to-float p4, p4

    .line 39
    iget-object v0, p0, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/zykj/sketch/core/GraphControl;->getScale()F

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    div-float/2addr v0, v1

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    int-to-float p3, p3

    .line 48
    iget-object v0, p0, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 49
    .line 50
    invoke-virtual {v0}, Lcom/zykj/sketch/core/GraphControl;->getScale()F

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    div-float/2addr p3, v0

    .line 55
    const/4 v0, 0x2

    .line 56
    int-to-float v0, v0

    .line 57
    div-float/2addr p3, v0

    .line 58
    int-to-float p4, p4

    .line 59
    iget-object v1, p0, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 60
    .line 61
    invoke-virtual {v1}, Lcom/zykj/sketch/core/GraphControl;->getScale()F

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    div-float/2addr p4, v1

    .line 66
    goto :goto_0

    .line 67
    :goto_1
    int-to-float p1, p1

    .line 68
    div-float/2addr p3, p1

    .line 69
    const/high16 p1, 0x3f800000    # 1.0f

    .line 70
    .line 71
    cmpl-float v0, p3, p1

    .line 72
    .line 73
    if-lez v0, :cond_2

    .line 74
    .line 75
    move p3, p1

    .line 76
    :cond_2
    int-to-float p2, p2

    .line 77
    div-float/2addr p4, p2

    .line 78
    cmpl-float p2, p4, p1

    .line 79
    .line 80
    if-lez p2, :cond_3

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_3
    move p1, p4

    .line 84
    :goto_2
    packed-switch p5, :pswitch_data_0

    .line 85
    .line 86
    .line 87
    invoke-static {p3, p1}, Ljava/lang/Math;->min(FF)F

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    return p1

    .line 92
    :pswitch_0
    invoke-static {p3, p1}, Ljava/lang/Math;->min(FF)F

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    return p1

    .line 97
    :pswitch_1
    invoke-static {p3, p1}, Ljava/lang/Math;->min(FF)F

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    return p1

    .line 102
    :pswitch_2
    invoke-static {p3, p1}, Ljava/lang/Math;->max(FF)F

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    :pswitch_3
    return p1

    .line 107
    :pswitch_4
    return p3

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x14
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final executeActionContent(ILjava/util/List;Lr6/c;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
            ">;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    :goto_0
    const/4 v1, -0x1

    .line 8
    if-ge v1, v0, :cond_1

    .line 9
    .line 10
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    .line 15
    .line 16
    invoke-virtual {v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->hasGraphSnapshot()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move v0, v1

    .line 27
    :goto_1
    if-le v0, v1, :cond_3

    .line 28
    .line 29
    iget-object p3, p0, Lcom/zykj/sketch/core/record/RecordControl;->actionRecord:Lcom/zykj/sketch/core/ActionRecord;

    .line 30
    .line 31
    add-int/lit8 v1, v0, 0x1

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-interface {p2, v2, v1}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {p3, v3}, Lcom/zykj/sketch/core/ActionRecord;->addHistoryRecord(Ljava/util/List;)V

    .line 39
    .line 40
    .line 41
    iget-object p3, p0, Lcom/zykj/sketch/core/record/RecordControl;->actionExecute:Lcom/zykj/sketch/core/ActionRecordExecute;

    .line 42
    .line 43
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    .line 48
    .line 49
    const/4 v4, 0x2

    .line 50
    const/4 v5, 0x0

    .line 51
    invoke-static {p3, v3, v2, v4, v5}, Lcom/zykj/sketch/core/listener/EventListener$DefaultImpls;->graphSnapShot$default(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionContent;ZILjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object p3, p0, Lcom/zykj/sketch/core/record/RecordControl;->actionRecord:Lcom/zykj/sketch/core/ActionRecord;

    .line 55
    .line 56
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    check-cast v2, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    .line 61
    .line 62
    invoke-virtual {p3, v2}, Lcom/zykj/sketch/core/ActionRecord;->addHistoryRenderGraphSnapshot(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)V

    .line 63
    .line 64
    .line 65
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 66
    .line 67
    .line 68
    move-result p3

    .line 69
    add-int/lit8 p3, p3, -0x1

    .line 70
    .line 71
    if-eq v0, p3, :cond_2

    .line 72
    .line 73
    sget-object p3, Lcom/zykj/sketch/core/EventTaskParseFactory;->Companion:Lcom/zykj/sketch/core/EventTaskParseFactory$Companion;

    .line 74
    .line 75
    invoke-virtual {p3, p1}, Lcom/zykj/sketch/core/EventTaskParseFactory$Companion;->create(I)Lcom/zykj/sketch/core/version/ITaskParse;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    invoke-interface {p2, v1, p1}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    iget-object v4, p0, Lcom/zykj/sketch/core/record/RecordControl;->actionExecute:Lcom/zykj/sketch/core/ActionRecordExecute;

    .line 88
    .line 89
    const/4 v6, 0x4

    .line 90
    const/4 v7, 0x0

    .line 91
    const/4 v5, 0x0

    .line 92
    invoke-static/range {v2 .. v7}, Lcom/zykj/sketch/core/version/ITaskParse$DefaultImpls;->parse$default(Lcom/zykj/sketch/core/version/ITaskParse;Ljava/util/List;Lcom/zykj/sketch/core/listener/EventListener;Lr6/c;ILjava/lang/Object;)Lcom/zykj/sketch/core/data/RenderTask;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {p1}, Lcom/zykj/sketch/core/data/RenderTask;->getGraphTask()Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-direct {p0, p1}, Lcom/zykj/sketch/core/record/RecordControl;->executeTask(Ljava/util/List;)V

    .line 101
    .line 102
    .line 103
    :cond_2
    return-void

    .line 104
    :cond_3
    sget-object v0, Lcom/zykj/sketch/core/EventTaskParseFactory;->Companion:Lcom/zykj/sketch/core/EventTaskParseFactory$Companion;

    .line 105
    .line 106
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/core/EventTaskParseFactory$Companion;->create(I)Lcom/zykj/sketch/core/version/ITaskParse;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    iget-object v0, p0, Lcom/zykj/sketch/core/record/RecordControl;->actionExecute:Lcom/zykj/sketch/core/ActionRecordExecute;

    .line 111
    .line 112
    new-instance v1, Lcom/zykj/sketch/core/record/RecordControl$executeActionContent$3;

    .line 113
    .line 114
    invoke-direct {v1, p0, p3}, Lcom/zykj/sketch/core/record/RecordControl$executeActionContent$3;-><init>(Lcom/zykj/sketch/core/record/RecordControl;Lr6/c;)V

    .line 115
    .line 116
    .line 117
    invoke-interface {p1, p2, v0, v1}, Lcom/zykj/sketch/core/version/ITaskParse;->parse(Ljava/util/List;Lcom/zykj/sketch/core/listener/EventListener;Lr6/c;)Lcom/zykj/sketch/core/data/RenderTask;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-virtual {p1}, Lcom/zykj/sketch/core/data/RenderTask;->getGraphTask()Ljava/util/List;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-direct {p0, p1}, Lcom/zykj/sketch/core/record/RecordControl;->executeTask(Ljava/util/List;)V

    .line 126
    .line 127
    .line 128
    return-void
.end method

.method public static synthetic executeActionContent$default(Lcom/zykj/sketch/core/record/RecordControl;ILjava/util/List;Lr6/c;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    sget-object p3, Lcom/zykj/sketch/core/record/RecordControl$executeActionContent$1;->INSTANCE:Lcom/zykj/sketch/core/record/RecordControl$executeActionContent$1;

    .line 6
    .line 7
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/sketch/core/record/RecordControl;->executeActionContent(ILjava/util/List;Lr6/c;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private final executeTask(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/core/data/GraphTask;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/zykj/sketch/core/data/GraphTask;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/zykj/sketch/core/data/GraphTask;->getExecuteVoid()Lr6/a;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method private final getImagePath(Ljava/util/ArrayList;Lcom/zykj/sketch/core/graph/Graph;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/zykj/sketch/core/graph/Graph;",
            ")V"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Lcom/zykj/sketch/core/graph/ImageGraph;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/zykj/sketch/core/graph/ImageGraph;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/sketch/core/graph/ImageGraph;->getFileName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    instance-of v0, p2, Lcom/zykj/sketch/core/graph/ImageHistoryGraph;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    move-object v0, p2

    .line 21
    check-cast v0, Lcom/zykj/sketch/core/graph/ImageHistoryGraph;

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/zykj/sketch/core/graph/ImageHistoryGraph;->getFileName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    :cond_1
    :goto_0
    invoke-virtual {p2}, Lcom/zykj/sketch/core/graph/Graph;->getChild()Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Lcom/zykj/sketch/core/graph/Graph;

    .line 49
    .line 50
    invoke-direct {p0, p1, v0}, Lcom/zykj/sketch/core/record/RecordControl;->getImagePath(Ljava/util/ArrayList;Lcom/zykj/sketch/core/graph/Graph;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    return-void
.end method

.method public static synthetic getRecordPath$default(Lcom/zykj/sketch/core/record/RecordControl;IILr6/c;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    sget-object p3, Lcom/zykj/sketch/core/record/RecordControl$getRecordPath$1;->INSTANCE:Lcom/zykj/sketch/core/record/RecordControl$getRecordPath$1;

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/sketch/core/record/RecordControl;->getRecordPath(IILr6/c;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private static final getRecordPath$lambda-13(IILcom/zykj/sketch/core/record/RecordControl;Lr6/c;)V
    .locals 2

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$callBack"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    if-lez p0, :cond_0

    .line 12
    .line 13
    if-lez p1, :cond_0

    .line 14
    .line 15
    invoke-direct {p2, p0, p1}, Lcom/zykj/sketch/core/record/RecordControl;->saveBitmap(II)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p2, Lcom/zykj/sketch/core/record/RecordControl;->actionRecord:Lcom/zykj/sketch/core/ActionRecord;

    .line 19
    .line 20
    iget-object v1, p2, Lcom/zykj/sketch/core/record/RecordControl;->sketchConfig:Lcom/zykj/sketch/core/config/SketchConfig;

    .line 21
    .line 22
    invoke-virtual {v1}, Lcom/zykj/sketch/core/config/SketchConfig;->getSourcePath()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1, p0, p1}, Lcom/zykj/sketch/core/ActionRecord;->saveRecord(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    iget-object p0, p2, Lcom/zykj/sketch/core/record/RecordControl;->sketchConfig:Lcom/zykj/sketch/core/config/SketchConfig;

    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/zykj/sketch/core/config/SketchConfig;->getSourcePath()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-interface {p3, p0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    const/4 p0, 0x0

    .line 40
    invoke-interface {p3, p0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public static synthetic loadData$default(Lcom/zykj/sketch/core/record/RecordControl;Ljava/lang/String;Lr6/c;Lr6/c;ILjava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/zykj/sketch/exception/EmptyDataException;,
            Lcom/zykj/sketch/exception/LowVersionException;,
            Lcom/zykj/sketch/exception/HighVersionException;
        }
    .end annotation

    .line 1
    and-int/lit8 p4, p4, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    sget-object p2, Lcom/zykj/sketch/core/record/RecordControl$loadData$1;->INSTANCE:Lcom/zykj/sketch/core/record/RecordControl$loadData$1;

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/sketch/core/record/RecordControl;->loadData(Ljava/lang/String;Lr6/c;Lr6/c;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private static final loadData$lambda-1$lambda-0(Lcom/zykj/sketch/EzyDrawBoard$BoardHead;Ljava/lang/String;Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;Lcom/zykj/sketch/core/record/RecordControl;Lr6/c;Lr6/c;)V
    .locals 3

    .line 1
    const-string v0, "$it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$path"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "this$0"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "$viewBack"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "$finish"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sget-object v0, Lcom/zykj/sketch/core/data/VersionParseFactory;->Companion:Lcom/zykj/sketch/core/data/VersionParseFactory$Companion;

    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$BoardHead;->getVersion()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-virtual {p2}, Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;->getBoardBody()Lcom/zykj/sketch/EzyDrawBoard$BoardBody;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    const-string v2, "data.boardBody"

    .line 37
    .line 38
    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1, p1, p2}, Lcom/zykj/sketch/core/data/VersionParseFactory$Companion;->parse(ILjava/lang/String;Lcom/zykj/sketch/EzyDrawBoard$BoardBody;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$BoardHead;->getVersion()I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    invoke-direct {p3, p0, p1, p4}, Lcom/zykj/sketch/core/record/RecordControl;->executeActionContent(ILjava/util/List;Lr6/c;)V

    .line 50
    .line 51
    .line 52
    iget-object p0, p3, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 53
    .line 54
    invoke-virtual {p0}, Lcom/zykj/sketch/core/GraphControl;->render()V

    .line 55
    .line 56
    .line 57
    iget-object p0, p3, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 58
    .line 59
    sget-object p1, Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;->ACTION_WRITING:Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;

    .line 60
    .line 61
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/core/GraphControl;->setMode(Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;)V

    .line 62
    .line 63
    .line 64
    iget-object p0, p3, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/zykj/sketch/core/GraphControl;->resetGraph()V

    .line 67
    .line 68
    .line 69
    iget-object p0, p3, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/zykj/sketch/core/GraphControl;->resetStatus()V

    .line 72
    .line 73
    .line 74
    iget-object p0, p3, Lcom/zykj/sketch/core/record/RecordControl;->actionFactory:Lcom/zykj/sketch/core/ActionStrategyFactory;

    .line 75
    .line 76
    invoke-virtual {p0}, Lcom/zykj/sketch/core/ActionStrategyFactory;->reset()V

    .line 77
    .line 78
    .line 79
    iget-object p0, p3, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 80
    .line 81
    invoke-virtual {p0}, Lcom/zykj/sketch/core/GraphControl;->getRootGraph()Lcom/zykj/sketch/core/graph/Graph;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-interface {p5, p0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public static synthetic reset$default(Lcom/zykj/sketch/core/record/RecordControl;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/core/record/RecordControl;->reset(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final saveBitmap(II)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/core/record/RecordControl;->thumbnail(II)Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object p2, Lcom/zykj/sketch/utils/FileUtils;->Companion:Lcom/zykj/sketch/utils/FileUtils$Companion;

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 13
    .line 14
    invoke-virtual {v1}, Lcom/zykj/sketch/core/GraphControl;->getBasePath()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v1, "thumbnail.jpg"

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p2, p1, v0}, Lcom/zykj/sketch/utils/FileUtils$Companion;->saveBitmap2SDCard(Landroid/graphics/Bitmap;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public static synthetic zoom$default(Lcom/zykj/sketch/core/record/RecordControl;FFFFZILjava/lang/Object;)Z
    .locals 6

    .line 1
    and-int/lit8 p6, p6, 0x10

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    const/4 p5, 0x1

    .line 6
    :cond_0
    move-object v0, p0

    .line 7
    move v1, p1

    .line 8
    move v2, p2

    .line 9
    move v3, p3

    .line 10
    move v4, p4

    .line 11
    move v5, p5

    .line 12
    invoke-virtual/range {v0 .. v5}, Lcom/zykj/sketch/core/record/RecordControl;->zoom(FFFFZ)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method


# virtual methods
.method public final addActionChangeListener(Lcom/zykj/sketch/core/listener/ActionChangeListener;)V
    .locals 1
    .param p1    # Lcom/zykj/sketch/core/listener/ActionChangeListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/RecordControl;->actionRecord:Lcom/zykj/sketch/core/ActionRecord;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/core/ActionRecord;->addActionChangeListener(Lcom/zykj/sketch/core/listener/ActionChangeListener;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final addAdapterImage(Landroid/graphics/Bitmap;IIIILr6/c;Ljava/lang/String;Lr6/c;)V
    .locals 7
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "IIII",
            "Lr6/c;",
            "Ljava/lang/String;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    move-object v2, p8

    const-string v3, "bitmap"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "callBack"

    invoke-static {p6, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "imageName"

    invoke-static {p7, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "pathCallBack"

    invoke-static {p8, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v3, p0, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    invoke-virtual {v3}, Lcom/zykj/sketch/core/GraphControl;->getRootGraph()Lcom/zykj/sketch/core/graph/Graph;

    move-result-object v3

    const-class v4, Lcom/zykj/sketch/core/graph/ImageGraph;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/zykj/sketch/core/graph/Graph;->childTypeNumber(Ljava/lang/String;)I

    move-result v3

    .line 2
    iget-object v4, p0, Lcom/zykj/sketch/core/record/RecordControl;->sketchConfig:Lcom/zykj/sketch/core/config/SketchConfig;

    invoke-virtual {v4}, Lcom/zykj/sketch/core/config/SketchConfig;->getMaxImageCount()I

    move-result v4

    if-lt v3, v4, :cond_0

    .line 3
    iget-object v1, p0, Lcom/zykj/sketch/core/record/RecordControl;->context:Landroid/content/Context;

    .line 4
    sget v2, Lcom/zykj/sketch/R$string;->tips_max_image:I

    iget-object v3, p0, Lcom/zykj/sketch/core/record/RecordControl;->sketchConfig:Lcom/zykj/sketch/core/config/SketchConfig;

    invoke-virtual {v3}, Lcom/zykj/sketch/core/config/SketchConfig;->getMaxImageCount()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 5
    invoke-static {v1, v2}, Lcom/zykj/sketch/utils/ToastUtils;->showShort(Landroid/content/Context;Ljava/lang/CharSequence;)V

    const/4 v1, 0x0

    .line 6
    invoke-interface {p6, v1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 7
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    invoke-virtual {v4}, Lcom/zykj/sketch/core/GraphControl;->getBaseImagePath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".jpg"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 8
    sget-object v3, Lcom/zykj/sketch/utils/FileUtils;->Companion:Lcom/zykj/sketch/utils/FileUtils$Companion;

    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    const-string v5, "File(imagePath).absolutePath"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, p1, v4}, Lcom/zykj/sketch/utils/FileUtils$Companion;->saveBitmap2SDCard(Landroid/graphics/Bitmap;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p8, v3}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, p0

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move-object v6, p6

    .line 9
    invoke-direct/range {v0 .. v6}, Lcom/zykj/sketch/core/record/RecordControl;->addImage(Ljava/lang/String;IIIILr6/c;)V

    .line 10
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_1

    .line 11
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    :cond_1
    return-void
.end method

.method public final addAdapterImage(Ljava/lang/String;IIIILr6/c;Ljava/lang/String;Lr6/c;)V
    .locals 10
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "IIII",
            "Lr6/c;",
            "Ljava/lang/String;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    move-object/from16 v6, p6

    move-object/from16 v0, p7

    move-object/from16 v7, p8

    const-string v1, "path"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "callBack"

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "imageName"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "pathCallBack"

    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    iget-object v1, p0, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    invoke-virtual {v1}, Lcom/zykj/sketch/core/GraphControl;->getRootGraph()Lcom/zykj/sketch/core/graph/Graph;

    move-result-object v1

    const-class v2, Lcom/zykj/sketch/core/graph/ImageGraph;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/zykj/sketch/core/graph/Graph;->childTypeNumber(Ljava/lang/String;)I

    move-result v1

    .line 13
    iget-object v2, p0, Lcom/zykj/sketch/core/record/RecordControl;->sketchConfig:Lcom/zykj/sketch/core/config/SketchConfig;

    invoke-virtual {v2}, Lcom/zykj/sketch/core/config/SketchConfig;->getMaxImageCount()I

    move-result v2

    const/4 v3, 0x0

    if-lt v1, v2, :cond_0

    .line 14
    iget-object p1, p0, Lcom/zykj/sketch/core/record/RecordControl;->context:Landroid/content/Context;

    .line 15
    sget p2, Lcom/zykj/sketch/R$string;->tips_max_image:I

    iget-object p3, p0, Lcom/zykj/sketch/core/record/RecordControl;->sketchConfig:Lcom/zykj/sketch/core/config/SketchConfig;

    invoke-virtual {p3}, Lcom/zykj/sketch/core/config/SketchConfig;->getMaxImageCount()I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    .line 16
    invoke-static {p1, p2}, Lcom/zykj/sketch/utils/ToastUtils;->showShort(Landroid/content/Context;Ljava/lang/CharSequence;)V

    .line 17
    invoke-interface {v6, v3}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    invoke-interface {v7, v3}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 19
    :cond_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 20
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 21
    sget-object p1, Lcom/zykj/sketch/utils/FileUtils;->Companion:Lcom/zykj/sketch/utils/FileUtils$Companion;

    invoke-virtual {p1, v1}, Lcom/zykj/sketch/utils/FileUtils$Companion;->Md5HashCode(Ljava/io/File;)Ljava/lang/String;

    move-result-object v2

    .line 22
    new-instance v3, Ljava/io/File;

    iget-object v4, p0, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    invoke-virtual {v4}, Lcom/zykj/sketch/core/GraphControl;->getBaseImagePath()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 23
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v4

    const-string v5, ".jpg"

    if-eqz v4, :cond_3

    .line 24
    sget-object p1, Lkotlin/io/FileWalkDirection;->TOP_DOWN:Lkotlin/io/FileWalkDirection;

    invoke-static {v3, p1}, Lkotlin/io/a;->z(Ljava/io/File;Lkotlin/io/FileWalkDirection;)Ln6/i;

    move-result-object p1

    .line 25
    sget-object v4, Lcom/zykj/sketch/core/record/RecordControl$addAdapterImage$4$1$1;->INSTANCE:Lcom/zykj/sketch/core/record/RecordControl$addAdapterImage$4$1$1;

    invoke-static {p1, v4}, Lz6/k;->u(Ln6/i;Lr6/c;)Lz6/f;

    move-result-object p1

    .line 26
    new-instance v4, Lz6/e;

    invoke-direct {v4, p1}, Lz6/e;-><init>(Lz6/f;)V

    .line 27
    :goto_0
    invoke-virtual {v4}, Lz6/e;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v4}, Lz6/e;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/io/File;

    .line 28
    sget-object v8, Lcom/zykj/sketch/utils/FileUtils;->Companion:Lcom/zykj/sketch/utils/FileUtils$Companion;

    invoke-virtual {v8, p1}, Lcom/zykj/sketch/utils/FileUtils$Companion;->Md5HashCode(Ljava/io/File;)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    .line 29
    invoke-static {v8, v2, v9}, Lkotlin/text/w;->v(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v8

    if-eqz v8, :cond_1

    .line 30
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    const-string v0, "imageFile.absolutePath"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    .line 31
    invoke-direct/range {v0 .. v6}, Lcom/zykj/sketch/core/record/RecordControl;->addImage(Ljava/lang/String;IIIILr6/c;)V

    .line 32
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v7, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_1
    move-object/from16 v6, p6

    goto :goto_0

    .line 33
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    .line 34
    invoke-static {p1, v2, v0, v5}, Landroid/support/v4/media/f;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 35
    sget-object v0, Lcom/zykj/sketch/utils/FileUtils;->Companion:Lcom/zykj/sketch/utils/FileUtils$Companion;

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lcom/zykj/sketch/utils/FileUtils$Companion;->copyFileUsingFileChannels(Ljava/io/File;Ljava/io/File;)V

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move-object/from16 v6, p6

    .line 36
    invoke-direct/range {v0 .. v6}, Lcom/zykj/sketch/core/record/RecordControl;->addImage(Ljava/lang/String;IIIILr6/c;)V

    .line 37
    invoke-interface {v7, v1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 38
    :cond_3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    .line 39
    invoke-static {v2, v3, v0, v5}, Landroid/support/v4/media/f;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 40
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1, v2}, Lcom/zykj/sketch/utils/FileUtils$Companion;->copyFileUsingFileChannels(Ljava/io/File;Ljava/io/File;)V

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move-object/from16 v6, p6

    move-object v1, v0

    move-object v0, p0

    .line 41
    invoke-direct/range {v0 .. v6}, Lcom/zykj/sketch/core/record/RecordControl;->addImage(Ljava/lang/String;IIIILr6/c;)V

    .line 42
    invoke-interface {v7, v1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 43
    :cond_4
    invoke-interface {v6, v3}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final addAdapterPPT(Ljava/lang/String;IIIILr6/c;)V
    .locals 9
    .param p1    # Ljava/lang/String;
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
            "IIII",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callBack"

    .line 7
    .line 8
    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/zykj/sketch/core/GraphControl;->getRootGraph()Lcom/zykj/sketch/core/graph/Graph;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-class v1, Lcom/zykj/sketch/core/graph/WebViewGraph;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/core/graph/Graph;->childTypeNumber(Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iget-object v1, p0, Lcom/zykj/sketch/core/record/RecordControl;->sketchConfig:Lcom/zykj/sketch/core/config/SketchConfig;

    .line 28
    .line 29
    invoke-virtual {v1}, Lcom/zykj/sketch/core/config/SketchConfig;->getMaxPPTCount()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-lt v0, v1, :cond_0

    .line 34
    .line 35
    iget-object p1, p0, Lcom/zykj/sketch/core/record/RecordControl;->context:Landroid/content/Context;

    .line 36
    .line 37
    sget p2, Lcom/zykj/sketch/R$string;->tips_max_ppt:I

    .line 38
    .line 39
    iget-object p3, p0, Lcom/zykj/sketch/core/record/RecordControl;->sketchConfig:Lcom/zykj/sketch/core/config/SketchConfig;

    .line 40
    .line 41
    invoke-virtual {p3}, Lcom/zykj/sketch/core/config/SketchConfig;->getMaxPPTCount()I

    .line 42
    .line 43
    .line 44
    move-result p3

    .line 45
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object p3

    .line 49
    filled-new-array {p3}, [Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p3

    .line 53
    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-static {p1, p2}, Lcom/zykj/sketch/utils/ToastUtils;->showShort(Landroid/content/Context;Ljava/lang/CharSequence;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_0
    new-instance v0, Ljava/io/File;

    .line 62
    .line 63
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-eqz p1, :cond_1

    .line 71
    .line 72
    sget-object p1, Lcom/zykj/sketch/utils/FileUtils;->Companion:Lcom/zykj/sketch/utils/FileUtils$Companion;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    const-string v2, "file.parentFile.absolutePath"

    .line 83
    .line 84
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    new-instance v2, Ljava/io/File;

    .line 88
    .line 89
    iget-object v3, p0, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 90
    .line 91
    invoke-virtual {v3}, Lcom/zykj/sketch/core/GraphControl;->getBasePPTPath()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    const-string v3, "File(graphControl.getBas\u2026).parentFile.absolutePath"

    .line 107
    .line 108
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, v1, v2}, Lcom/zykj/sketch/utils/FileUtils$Companion;->copyFolder(Ljava/lang/String;Ljava/lang/String;)Z

    .line 112
    .line 113
    .line 114
    iget-object p1, p0, Lcom/zykj/sketch/core/record/RecordControl;->actionExecute:Lcom/zykj/sketch/core/ActionRecordExecute;

    .line 115
    .line 116
    iget-object v1, p0, Lcom/zykj/sketch/core/record/RecordControl;->actionRecord:Lcom/zykj/sketch/core/ActionRecord;

    .line 117
    .line 118
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 119
    .line 120
    .line 121
    move-result-wide v2

    .line 122
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    const-string v0, "file.name"

    .line 127
    .line 128
    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    move v5, p2

    .line 132
    move v6, p3

    .line 133
    move v7, p4

    .line 134
    move v8, p5

    .line 135
    invoke-virtual/range {v1 .. v8}, Lcom/zykj/sketch/core/ActionRecord;->buildWebViewData(JLjava/lang/String;IIII)Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    invoke-virtual {p1, p2, p6}, Lcom/zykj/sketch/core/ActionRecordExecute;->onAddPPTEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;Lr6/c;)V

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :cond_1
    iget-object p1, p0, Lcom/zykj/sketch/core/record/RecordControl;->context:Landroid/content/Context;

    .line 144
    .line 145
    sget p2, Lcom/zykj/sketch/R$string;->tips_file_not_found:I

    .line 146
    .line 147
    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    invoke-static {p1, p2}, Lcom/zykj/sketch/utils/ToastUtils;->showShort(Landroid/content/Context;Ljava/lang/CharSequence;)V

    .line 152
    .line 153
    .line 154
    return-void
.end method

.method public final addNextPrevListener(Lcom/zykj/sketch/core/listener/NextPrevListener;)V
    .locals 1
    .param p1    # Lcom/zykj/sketch/core/listener/NextPrevListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/RecordControl;->actionRecord:Lcom/zykj/sketch/core/ActionRecord;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/core/ActionRecord;->addNextPrevListener(Lcom/zykj/sketch/core/listener/NextPrevListener;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final addProgressListener(Lcom/zykj/sketch/core/listener/ProgressListener;)V
    .locals 1
    .param p1    # Lcom/zykj/sketch/core/listener/ProgressListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/RecordControl;->audioControl:Lcom/zykj/sketch/core/record/AudioControl;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/core/record/AudioControl;->addListener(Lcom/zykj/sketch/core/listener/ProgressListener;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final clear()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/RecordControl;->actionExecute:Lcom/zykj/sketch/core/ActionRecordExecute;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/sketch/core/record/RecordControl;->actionRecord:Lcom/zykj/sketch/core/ActionRecord;

    .line 4
    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    invoke-virtual {v1, v2, v3}, Lcom/zykj/sketch/core/ActionRecord;->buildClearBoardData(J)Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoard;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/core/ActionRecordExecute;->onClearBoardEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoard;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final getDrawConfig()Landroid/graphics/RectF;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/sketch/core/GraphControl;->getDrawArea()Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v1, Landroid/graphics/RectF;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getLeftTopPoint()Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v2}, Lcom/zykj/sketch/GraphSnapshot$PointF;->getX()F

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getLeftTopPoint()Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v3}, Lcom/zykj/sketch/GraphSnapshot$PointF;->getY()F

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getRightBottomPoint()Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {v4}, Lcom/zykj/sketch/GraphSnapshot$PointF;->getX()F

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getRightBottomPoint()Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Lcom/zykj/sketch/GraphSnapshot$PointF;->getY()F

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-direct {v1, v2, v3, v4, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 44
    .line 45
    .line 46
    return-object v1

    .line 47
    :cond_0
    new-instance v0, Landroid/graphics/RectF;

    .line 48
    .line 49
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 50
    .line 51
    .line 52
    return-object v0
.end method

.method public final getRecordPath(IILr6/c;)V
    .locals 2
    .param p3    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "callBack"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/Thread;

    .line 7
    .line 8
    new-instance v1, Lcom/zykj/sketch/core/record/a;

    .line 9
    .line 10
    invoke-direct {v1, p1, p2, p0, p3}, Lcom/zykj/sketch/core/record/a;-><init>(IILcom/zykj/sketch/core/record/RecordControl;Lr6/c;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final getResList()Ljava/util/List;
    .locals 2
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

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 7
    .line 8
    invoke-virtual {v1}, Lcom/zykj/sketch/core/GraphControl;->getRootGraph()Lcom/zykj/sketch/core/graph/Graph;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-direct {p0, v0, v1}, Lcom/zykj/sketch/core/record/RecordControl;->getImagePath(Ljava/util/ArrayList;Lcom/zykj/sketch/core/graph/Graph;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final isRecord()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/RecordControl;->audioControl:Lcom/zykj/sketch/core/record/AudioControl;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/zykj/sketch/core/record/RecordControl;->audioControl:Lcom/zykj/sketch/core/record/AudioControl;

    .line 5
    .line 6
    invoke-virtual {v1}, Lcom/zykj/sketch/core/record/AudioControl;->isRecord()Z

    .line 7
    .line 8
    .line 9
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    monitor-exit v0

    .line 11
    return v1

    .line 12
    :catchall_0
    move-exception v1

    .line 13
    monitor-exit v0

    .line 14
    throw v1
.end method

.method public final isTouch()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/sketch/core/GraphControl;->isTouch()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final limitThumbnail()Lcom/zykj/sketch/core/data/ThumbnailBean;
    .locals 8
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/sketch/core/GraphControl;->getDrawArea()Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v2, p0, Lcom/zykj/sketch/core/record/RecordControl;->actionExecute:Lcom/zykj/sketch/core/ActionRecordExecute;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getMatrixList()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    const-string v4, "this.matrixList"

    .line 17
    .line 18
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v3}, Lcom/zykj/sketch/core/ActionExecute;->buildMatrix(Ljava/util/List;)Landroid/graphics/Matrix;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    iget-object v3, p0, Lcom/zykj/sketch/core/record/RecordControl;->actionExecute:Lcom/zykj/sketch/core/ActionRecordExecute;

    .line 26
    .line 27
    iget-object v4, p0, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 28
    .line 29
    invoke-virtual {v4}, Lcom/zykj/sketch/core/GraphControl;->getRootGraph()Lcom/zykj/sketch/core/graph/Graph;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-interface {v4}, Lcom/zykj/sketch/core/listener/IGraph;->getSnapshot()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-virtual {v3, v1, v4}, Lcom/zykj/sketch/core/ActionExecute;->buildGraph(Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/GraphSnapshot$GraphData;)Lcom/zykj/sketch/core/graph/Graph;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    new-instance v4, Landroid/graphics/RectF;

    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getLeftTopPoint()Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-virtual {v5}, Lcom/zykj/sketch/GraphSnapshot$PointF;->getX()F

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getLeftTopPoint()Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    invoke-virtual {v6}, Lcom/zykj/sketch/GraphSnapshot$PointF;->getY()F

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getRightBottomPoint()Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    invoke-virtual {v7}, Lcom/zykj/sketch/GraphSnapshot$PointF;->getX()F

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getRightBottomPoint()Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0}, Lcom/zykj/sketch/GraphSnapshot$PointF;->getY()F

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    invoke-direct {v4, v5, v6, v7, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 78
    .line 79
    .line 80
    new-instance v0, Landroid/graphics/RectF;

    .line 81
    .line 82
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v0, v4}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    const/4 v6, 0x0

    .line 93
    cmpg-float v5, v5, v6

    .line 94
    .line 95
    if-lez v5, :cond_1

    .line 96
    .line 97
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    cmpg-float v5, v5, v6

    .line 102
    .line 103
    if-gtz v5, :cond_0

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    float-to-int v1, v1

    .line 111
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    float-to-int v5, v5

    .line 116
    sget-object v6, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 117
    .line 118
    invoke-static {v1, v5, v6}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    iget v5, v0, Landroid/graphics/RectF;->left:F

    .line 123
    .line 124
    neg-float v5, v5

    .line 125
    iget v6, v0, Landroid/graphics/RectF;->top:F

    .line 126
    .line 127
    neg-float v6, v6

    .line 128
    invoke-virtual {v2, v5, v6}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 129
    .line 130
    .line 131
    invoke-virtual {v3, v2}, Lcom/zykj/sketch/core/graph/Graph;->setMatrix(Landroid/graphics/Matrix;)V

    .line 132
    .line 133
    .line 134
    iget-object v5, p0, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 135
    .line 136
    invoke-virtual {v5}, Lcom/zykj/sketch/core/GraphControl;->getCameraMatrix()Landroid/graphics/Matrix;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    iget-object v6, p0, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 141
    .line 142
    new-instance v7, Landroid/graphics/Matrix;

    .line 143
    .line 144
    invoke-direct {v7}, Landroid/graphics/Matrix;-><init>()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v6, v7}, Lcom/zykj/sketch/core/GraphControl;->setCameraMatrix(Landroid/graphics/Matrix;)V

    .line 148
    .line 149
    .line 150
    new-instance v6, Landroid/graphics/Canvas;

    .line 151
    .line 152
    invoke-direct {v6, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 153
    .line 154
    .line 155
    sget-object v7, Lcom/zykj/sketch/core/record/RecordControl$limitThumbnail$1$1$1;->INSTANCE:Lcom/zykj/sketch/core/record/RecordControl$limitThumbnail$1$1$1;

    .line 156
    .line 157
    invoke-virtual {v3, v6, v7}, Lcom/zykj/sketch/core/graph/Graph;->onDrawComplete(Landroid/graphics/Canvas;Lr6/c;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2, v0, v4}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    .line 161
    .line 162
    .line 163
    invoke-static {v3}, Lcom/zykj/sketch/core/graph/GraphExtKt;->maxWritingRenderOutRectF(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/RectF;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    iget-object v3, p0, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 168
    .line 169
    invoke-virtual {v3, v5}, Lcom/zykj/sketch/core/GraphControl;->setCameraMatrix(Landroid/graphics/Matrix;)V

    .line 170
    .line 171
    .line 172
    new-instance v3, Lcom/zykj/sketch/core/data/ThumbnailBean;

    .line 173
    .line 174
    const-string v4, "bitmap"

    .line 175
    .line 176
    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    invoke-direct {v3, v1, v2, v0}, Lcom/zykj/sketch/core/data/ThumbnailBean;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/RectF;Landroid/graphics/RectF;)V

    .line 180
    .line 181
    .line 182
    return-object v3

    .line 183
    :cond_1
    :goto_0
    return-object v1
.end method

# RE I/O 解码本地图片（BitmapFactory.decodeFile）。
.method public final loadData(Ljava/lang/String;Lr6/c;Lr6/c;)V
    .locals 11
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
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lr6/c;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/zykj/sketch/exception/EmptyDataException;,
            Lcom/zykj/sketch/exception/LowVersionException;,
            Lcom/zykj/sketch/exception/HighVersionException;
        }
    .end annotation

    .line 1
    const-string v1, "path"

    .line 2
    .line 3
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "viewBack"

    .line 7
    .line 8
    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v1, "finish"

    .line 12
    .line 13
    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Ljava/io/FileInputStream;

    .line 17
    .line 18
    new-instance v3, Ljava/io/File;

    .line 19
    .line 20
    const-string v4, "actions.bin"

    .line 21
    .line 22
    invoke-direct {v3, p1, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {v1, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 26
    .line 27
    .line 28
    invoke-static {v1}, Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;->parseFrom(Ljava/io/InputStream;)Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {v3}, Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;->hasBoardHead()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_5

    .line 37
    .line 38
    invoke-virtual {v3}, Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;->getBoardHead()Lcom/zykj/sketch/EzyDrawBoard$BoardHead;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    if-eqz v1, :cond_4

    .line 43
    .line 44
    invoke-virtual {v1}, Lcom/zykj/sketch/EzyDrawBoard$BoardHead;->getCreateDate()J

    .line 45
    .line 46
    .line 47
    move-result-wide v7

    .line 48
    const-wide/32 v9, 0x5c2a3d00

    .line 49
    .line 50
    .line 51
    cmp-long v4, v7, v9

    .line 52
    .line 53
    if-ltz v4, :cond_2

    .line 54
    .line 55
    invoke-virtual {v1}, Lcom/zykj/sketch/EzyDrawBoard$BoardHead;->getVersion()I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    const/4 v7, 0x2

    .line 60
    if-ge v4, v7, :cond_0

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    invoke-virtual {v1}, Lcom/zykj/sketch/EzyDrawBoard$BoardHead;->getVersion()I

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    const/4 v7, 0x5

    .line 68
    if-gt v4, v7, :cond_1

    .line 69
    .line 70
    iget-object v4, p0, Lcom/zykj/sketch/core/record/RecordControl;->sketchConfig:Lcom/zykj/sketch/core/config/SketchConfig;

    .line 71
    .line 72
    invoke-virtual {v4, p1}, Lcom/zykj/sketch/core/config/SketchConfig;->setSourcePath(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    iget-object v4, p0, Lcom/zykj/sketch/core/record/RecordControl;->actionRecord:Lcom/zykj/sketch/core/ActionRecord;

    .line 76
    .line 77
    invoke-virtual {v4, v1}, Lcom/zykj/sketch/core/ActionRecord;->setHeader(Lcom/zykj/sketch/EzyDrawBoard$BoardHead;)V

    .line 78
    .line 79
    .line 80
    iget-object v4, p0, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 81
    .line 82
    iget-object v7, p0, Lcom/zykj/sketch/core/record/RecordControl;->viewGroup:Landroid/view/ViewGroup;

    .line 83
    .line 84
    invoke-virtual {v7}, Landroid/view/View;->getWidth()I

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    iget-object v8, p0, Lcom/zykj/sketch/core/record/RecordControl;->viewGroup:Landroid/view/ViewGroup;

    .line 89
    .line 90
    invoke-virtual {v8}, Landroid/view/View;->getHeight()I

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    invoke-virtual {v1}, Lcom/zykj/sketch/EzyDrawBoard$BoardHead;->getWidth()I

    .line 95
    .line 96
    .line 97
    move-result v9

    .line 98
    invoke-virtual {v1}, Lcom/zykj/sketch/EzyDrawBoard$BoardHead;->getHeight()I

    .line 99
    .line 100
    .line 101
    move-result v10

    .line 102
    invoke-virtual {v4, v7, v8, v9, v10}, Lcom/zykj/sketch/core/GraphControl;->setCameraMatrix(IIII)V

    .line 103
    .line 104
    .line 105
    iget-object v4, p0, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 106
    .line 107
    invoke-virtual {v4}, Lcom/zykj/sketch/core/GraphControl;->getCameraMatrix()Landroid/graphics/Matrix;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    iget-object v7, p0, Lcom/zykj/sketch/core/record/RecordControl;->cameraInvertMatrix:Landroid/graphics/Matrix;

    .line 112
    .line 113
    invoke-virtual {v4, v7}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 114
    .line 115
    .line 116
    new-instance v8, Ljava/lang/Thread;

    .line 117
    .line 118
    new-instance v0, Landroidx/camera/core/processing/concurrent/c;

    .line 119
    .line 120
    const/4 v7, 0x1

    .line 121
    move-object v4, p0

    .line 122
    move-object v2, p1

    .line 123
    move-object v5, p2

    .line 124
    move-object v6, p3

    .line 125
    invoke-direct/range {v0 .. v7}, Landroidx/camera/core/processing/concurrent/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 126
    .line 127
    .line 128
    move-object v1, v0

    .line 129
    invoke-direct {v8, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v8}, Ljava/lang/Thread;->start()V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :cond_1
    iget-object v2, p0, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 137
    .line 138
    invoke-virtual {v2}, Lcom/zykj/sketch/core/GraphControl;->getRootGraph()Lcom/zykj/sketch/core/graph/Graph;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    invoke-interface {p3, v2}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    new-instance v2, Lcom/zykj/sketch/exception/HighVersionException;

    .line 146
    .line 147
    new-instance v3, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    const-string v4, "version="

    .line 150
    .line 151
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1}, Lcom/zykj/sketch/EzyDrawBoard$BoardHead;->getVersion()I

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    const-string v1, " Maximum resolution version=5"

    .line 162
    .line 163
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    invoke-direct {v2, v1}, Lcom/zykj/sketch/exception/HighVersionException;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    throw v2

    .line 174
    :cond_2
    :goto_0
    new-instance v1, Ljava/io/File;

    .line 175
    .line 176
    invoke-static {p1}, Landroid/support/v4/media/f;->v(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    sget-object v4, Ljava/io/File;->separator:Ljava/lang/String;

    .line 181
    .line 182
    const-string v5, "thumbnail.jpg"

    .line 183
    .line 184
    invoke-static {v3, v4, v5}, Landroid/support/v4/media/f;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    invoke-direct {v1, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    if-eqz v3, :cond_3

    .line 196
    .line 197
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    invoke-static {v1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    const-string v2, "bitmap"

    .line 206
    .line 207
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    iget-object v2, p0, Lcom/zykj/sketch/core/record/RecordControl;->viewGroup:Landroid/view/ViewGroup;

    .line 211
    .line 212
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    iget-object v3, p0, Lcom/zykj/sketch/core/record/RecordControl;->viewGroup:Landroid/view/ViewGroup;

    .line 217
    .line 218
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    const/16 v9, 0xe0

    .line 223
    .line 224
    const/4 v10, 0x0

    .line 225
    const/4 v4, 0x0

    .line 226
    const/16 v5, 0x17

    .line 227
    .line 228
    const/4 v6, 0x0

    .line 229
    const/4 v7, 0x0

    .line 230
    const/4 v8, 0x0

    .line 231
    move-object v0, p0

    .line 232
    invoke-static/range {v0 .. v10}, Lcom/zykj/sketch/core/record/RecordControl;->addAdapterImage$default(Lcom/zykj/sketch/core/record/RecordControl;Landroid/graphics/Bitmap;IIIILr6/c;Ljava/lang/String;Lr6/c;ILjava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    iget-object v1, p0, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 236
    .line 237
    invoke-virtual {v1}, Lcom/zykj/sketch/core/GraphControl;->forceRender()V

    .line 238
    .line 239
    .line 240
    iget-object v1, p0, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 241
    .line 242
    invoke-virtual {v1}, Lcom/zykj/sketch/core/GraphControl;->getRootGraph()Lcom/zykj/sketch/core/graph/Graph;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    invoke-interface {p3, v1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    return-void

    .line 250
    :cond_3
    iget-object v1, p0, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 251
    .line 252
    invoke-virtual {v1}, Lcom/zykj/sketch/core/GraphControl;->getRootGraph()Lcom/zykj/sketch/core/graph/Graph;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    invoke-interface {p3, v1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    new-instance v1, Lcom/zykj/sketch/exception/EmptyDataException;

    .line 260
    .line 261
    invoke-direct {v1, p1}, Lcom/zykj/sketch/exception/EmptyDataException;-><init>(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    throw v1

    .line 265
    :cond_4
    return-void

    .line 266
    :cond_5
    iget-object v1, p0, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 267
    .line 268
    invoke-virtual {v1}, Lcom/zykj/sketch/core/GraphControl;->getRootGraph()Lcom/zykj/sketch/core/graph/Graph;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    invoke-interface {p3, v1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    new-instance v1, Lcom/zykj/sketch/exception/EmptyDataException;

    .line 276
    .line 277
    invoke-direct {v1, p1}, Lcom/zykj/sketch/exception/EmptyDataException;-><init>(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    throw v1
.end method

.method public final nextAction()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/RecordControl;->actionExecute:Lcom/zykj/sketch/core/ActionRecordExecute;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/sketch/core/record/RecordControl;->actionRecord:Lcom/zykj/sketch/core/ActionRecord;

    .line 4
    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    invoke-virtual {v1, v2, v3}, Lcom/zykj/sketch/core/ActionRecord;->buildNextActionData(J)Lcom/zykj/sketch/EzyDrawBoard$ActionNextAction;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/core/ActionRecordExecute;->onNextActionEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionNextAction;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final onDestroy()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/sketch/core/GraphControl;->onDestroy()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onTouchAdapterEvent(Landroid/view/MotionEvent;)V
    .locals 2
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/zykj/sketch/utils/EventConvertUtils;->Companion:Lcom/zykj/sketch/utils/EventConvertUtils$Companion;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/zykj/sketch/core/record/RecordControl;->cameraInvertMatrix:Landroid/graphics/Matrix;

    .line 9
    .line 10
    invoke-virtual {v0, p1, v1}, Lcom/zykj/sketch/utils/EventConvertUtils$Companion;->event2MotionEvent(Landroid/view/MotionEvent;Landroid/graphics/Matrix;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/sketch/core/record/RecordControl;->actionExecute:Lcom/zykj/sketch/core/ActionRecordExecute;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/core/ActionRecordExecute;->onTouchEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final prevAction()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/RecordControl;->actionExecute:Lcom/zykj/sketch/core/ActionRecordExecute;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/sketch/core/record/RecordControl;->actionRecord:Lcom/zykj/sketch/core/ActionRecord;

    .line 4
    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    invoke-virtual {v1, v2, v3}, Lcom/zykj/sketch/core/ActionRecord;->buildPrevActionData(J)Lcom/zykj/sketch/EzyDrawBoard$ActionPrevAction;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/core/ActionRecordExecute;->onPrevActionEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionPrevAction;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final reset(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/RecordControl;->actionFactory:Lcom/zykj/sketch/core/ActionStrategyFactory;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/sketch/core/ActionStrategyFactory;->reset()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/sketch/core/record/RecordControl;->actionExecute:Lcom/zykj/sketch/core/ActionRecordExecute;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/sketch/core/ActionRecordExecute;->reset()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/zykj/sketch/core/GraphControl;->reset()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/sketch/core/record/RecordControl;->audioControl:Lcom/zykj/sketch/core/record/AudioControl;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/zykj/sketch/core/record/AudioControl;->reset()V

    .line 19
    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    new-instance p1, Ljava/io/File;

    .line 24
    .line 25
    iget-object v0, p0, Lcom/zykj/sketch/core/record/RecordControl;->sketchConfig:Lcom/zykj/sketch/core/config/SketchConfig;

    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/zykj/sketch/core/config/SketchConfig;->getSourcePath()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-direct {p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    sget-object v0, Lkotlin/io/FileWalkDirection;->TOP_DOWN:Lkotlin/io/FileWalkDirection;

    .line 35
    .line 36
    invoke-static {p1, v0}, Lkotlin/io/a;->z(Ljava/io/File;Lkotlin/io/FileWalkDirection;)Ln6/i;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    sget-object v0, Lcom/zykj/sketch/core/record/RecordControl$reset$1;->INSTANCE:Lcom/zykj/sketch/core/record/RecordControl$reset$1;

    .line 41
    .line 42
    invoke-static {p1, v0}, Lz6/k;->u(Ln6/i;Lr6/c;)Lz6/f;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    new-instance v0, Lz6/e;

    .line 47
    .line 48
    invoke-direct {v0, p1}, Lz6/e;-><init>(Lz6/f;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    invoke-virtual {v0}, Lz6/e;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_0

    .line 56
    .line 57
    invoke-virtual {v0}, Lz6/e;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    check-cast p1, Ljava/io/File;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    return-void
.end method

.method public final resetMatrix()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/RecordControl;->actionExecute:Lcom/zykj/sketch/core/ActionRecordExecute;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/sketch/core/record/RecordControl;->actionRecord:Lcom/zykj/sketch/core/ActionRecord;

    .line 4
    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    invoke-virtual {v1, v2, v3}, Lcom/zykj/sketch/core/ActionRecord;->buildResetMatrix(J)Lcom/zykj/sketch/EzyDrawBoard$ActionResetMatrix;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/core/ActionRecordExecute;->resetMatrix(Lcom/zykj/sketch/EzyDrawBoard$ActionResetMatrix;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final setActionMode(Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;)V
    .locals 4
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "mode"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/sketch/core/record/RecordControl;->actionExecute:Lcom/zykj/sketch/core/ActionRecordExecute;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/zykj/sketch/core/record/RecordControl;->actionRecord:Lcom/zykj/sketch/core/ActionRecord;

    .line 9
    .line 10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 11
    .line 12
    .line 13
    move-result-wide v2

    .line 14
    invoke-virtual {v1, v2, v3, p1}, Lcom/zykj/sketch/core/ActionRecord;->buildModeConfig(JLcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;)Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/core/ActionRecordExecute;->onActionModeEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final setDrawConfig(Ljava/lang/Integer;Landroid/graphics/RectF;)V
    .locals 6
    .param p1    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    new-instance v0, Landroid/graphics/RectF;

    .line 4
    .line 5
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v1, Landroid/graphics/Matrix;

    .line 9
    .line 10
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lcom/zykj/sketch/core/record/RecordControl;->cameraInvertMatrix:Landroid/graphics/Matrix;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 16
    .line 17
    .line 18
    iget-object v2, p0, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 19
    .line 20
    invoke-virtual {v2}, Lcom/zykj/sketch/core/GraphControl;->getRootGraph()Lcom/zykj/sketch/core/graph/Graph;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v2}, Lcom/zykj/sketch/core/graph/Graph;->getMatrix()Landroid/graphics/Matrix;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-static {v2}, Lcom/zykj/sketch/core/graph/GraphExtKt;->inverts(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v0, p2}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    .line 36
    .line 37
    .line 38
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot$PointF;->newBuilder()Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 43
    .line 44
    invoke-virtual {p2, v1}, Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;->setX(F)Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    iget v1, v0, Landroid/graphics/RectF;->top:F

    .line 49
    .line 50
    invoke-virtual {p2, v1}, Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;->setY(F)Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-virtual {p2}, Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;->build()Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot$PointF;->newBuilder()Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    iget v2, v0, Landroid/graphics/RectF;->right:F

    .line 63
    .line 64
    invoke-virtual {v1, v2}, Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;->setX(F)Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 69
    .line 70
    invoke-virtual {v1, v0}, Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;->setY(F)Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v0}, Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;->build()Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    const/16 v1, 0x9

    .line 79
    .line 80
    new-array v2, v1, [F

    .line 81
    .line 82
    iget-object v3, p0, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 83
    .line 84
    invoke-virtual {v3}, Lcom/zykj/sketch/core/GraphControl;->getRootGraph()Lcom/zykj/sketch/core/graph/Graph;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-virtual {v3}, Lcom/zykj/sketch/core/graph/Graph;->getMatrix()Landroid/graphics/Matrix;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-virtual {v3, v2}, Landroid/graphics/Matrix;->getValues([F)V

    .line 93
    .line 94
    .line 95
    new-instance v3, Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 98
    .line 99
    .line 100
    const/4 v4, 0x0

    .line 101
    :goto_0
    if-ge v4, v1, :cond_0

    .line 102
    .line 103
    aget v5, v2, v4

    .line 104
    .line 105
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    add-int/lit8 v4, v4, 0x1

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_0
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->newBuilder()Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-virtual {v1, p2}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->setLeftTopPoint(Lcom/zykj/sketch/GraphSnapshot$PointF;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    invoke-virtual {p2, v0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->setRightBottomPoint(Lcom/zykj/sketch/GraphSnapshot$PointF;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    invoke-virtual {p2, v3}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->addAllMatrix(Ljava/lang/Iterable;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    invoke-virtual {p2}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    iget-object v0, p0, Lcom/zykj/sketch/core/record/RecordControl;->actionExecute:Lcom/zykj/sketch/core/ActionRecordExecute;

    .line 136
    .line 137
    iget-object v1, p0, Lcom/zykj/sketch/core/record/RecordControl;->actionRecord:Lcom/zykj/sketch/core/ActionRecord;

    .line 138
    .line 139
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 140
    .line 141
    .line 142
    move-result-wide v2

    .line 143
    invoke-virtual {v1, v2, v3, p1, p2}, Lcom/zykj/sketch/core/ActionRecord;->buildDrawConfig(JLjava/lang/Integer;Lcom/zykj/sketch/EzyDrawBoard$DrawArea;)Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/core/ActionRecordExecute;->onDrawConfigEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig;)V

    .line 148
    .line 149
    .line 150
    :cond_1
    return-void
.end method

.method public final setGraphConfig(Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;)V
    .locals 4
    .param p1    # Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "config"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/sketch/core/record/RecordControl;->actionExecute:Lcom/zykj/sketch/core/ActionRecordExecute;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/zykj/sketch/core/record/RecordControl;->actionRecord:Lcom/zykj/sketch/core/ActionRecord;

    .line 9
    .line 10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 11
    .line 12
    .line 13
    move-result-wide v2

    .line 14
    invoke-virtual {v1, v2, v3, p1}, Lcom/zykj/sketch/core/ActionRecord;->buildGraphConfig(JLcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;)Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/core/ActionRecordExecute;->onGraphConfigEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final setGraphMatrixListener(Lcom/zykj/sketch/core/listener/GraphMatrixListener;)V
    .locals 1
    .param p1    # Lcom/zykj/sketch/core/listener/GraphMatrixListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/core/GraphControl;->setGraphMatrixListener(Lcom/zykj/sketch/core/listener/GraphMatrixListener;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setImageDeleteListener(Lcom/zykj/sketch/core/listener/ImageDeleteListener;)V
    .locals 1
    .param p1    # Lcom/zykj/sketch/core/listener/ImageDeleteListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/core/GraphControl;->setImageDeleteListener(Lcom/zykj/sketch/core/listener/ImageDeleteListener;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final startAudio()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/RecordControl;->audioControl:Lcom/zykj/sketch/core/record/AudioControl;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/zykj/sketch/core/record/RecordControl;->audioControl:Lcom/zykj/sketch/core/record/AudioControl;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 7
    .line 8
    invoke-virtual {v2}, Lcom/zykj/sketch/core/GraphControl;->getBaseAudioPath()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v1, v2}, Lcom/zykj/sketch/core/record/AudioControl;->startRecord(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    monitor-exit v0

    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception v1

    .line 18
    monitor-exit v0

    .line 19
    throw v1
.end method

.method public final stopAudio()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/RecordControl;->audioControl:Lcom/zykj/sketch/core/record/AudioControl;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/zykj/sketch/core/record/RecordControl;->audioControl:Lcom/zykj/sketch/core/record/AudioControl;

    .line 5
    .line 6
    invoke-virtual {v1}, Lcom/zykj/sketch/core/record/AudioControl;->stopRecord()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception v1

    .line 12
    monitor-exit v0

    .line 13
    throw v1
.end method

.method public final thumbnail(II)Landroid/graphics/Bitmap;
    .locals 7
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 2
    .line 3
    invoke-static {p1, p2, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance p2, Landroid/graphics/Canvas;

    .line 8
    .line 9
    invoke-direct {p2, p1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/zykj/sketch/core/GraphControl;->getBackgroundColor()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {p2, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/zykj/sketch/core/GraphControl;->getDrawArea()Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    new-instance v1, Landroid/graphics/RectF;

    .line 30
    .line 31
    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    .line 32
    .line 33
    .line 34
    iget-object v2, p0, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 35
    .line 36
    invoke-virtual {v2}, Lcom/zykj/sketch/core/GraphControl;->getRootGraph()Lcom/zykj/sketch/core/graph/Graph;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v2}, Lcom/zykj/sketch/core/graph/Graph;->getMatrix()Landroid/graphics/Matrix;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    new-instance v3, Landroid/graphics/RectF;

    .line 45
    .line 46
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getLeftTopPoint()Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-virtual {v4}, Lcom/zykj/sketch/GraphSnapshot$PointF;->getX()F

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getLeftTopPoint()Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-virtual {v5}, Lcom/zykj/sketch/GraphSnapshot$PointF;->getY()F

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getRightBottomPoint()Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    invoke-virtual {v6}, Lcom/zykj/sketch/GraphSnapshot$PointF;->getX()F

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getRightBottomPoint()Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v0}, Lcom/zykj/sketch/GraphSnapshot$PointF;->getY()F

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    invoke-direct {v3, v4, v5, v6, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v1, v3}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2, v1}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;)Z

    .line 85
    .line 86
    .line 87
    :cond_0
    iget-object v0, p0, Lcom/zykj/sketch/core/record/RecordControl;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 88
    .line 89
    invoke-virtual {v0}, Lcom/zykj/sketch/core/GraphControl;->getRootGraph()Lcom/zykj/sketch/core/graph/Graph;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    sget-object v1, Lcom/zykj/sketch/core/record/RecordControl$thumbnail$2;->INSTANCE:Lcom/zykj/sketch/core/record/RecordControl$thumbnail$2;

    .line 94
    .line 95
    invoke-virtual {v0, p2, v1}, Lcom/zykj/sketch/core/graph/Graph;->onDrawComplete(Landroid/graphics/Canvas;Lr6/c;)V

    .line 96
    .line 97
    .line 98
    const-string p2, "bitmap"

    .line 99
    .line 100
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    return-object p1
.end method

.method public final translation(Ljava/lang/Float;Ljava/lang/Float;Z)Z
    .locals 7
    .param p1    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/RecordControl;->actionExecute:Lcom/zykj/sketch/core/ActionRecordExecute;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/sketch/core/record/RecordControl;->actionRecord:Lcom/zykj/sketch/core/ActionRecord;

    .line 4
    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    move-object v4, p1

    .line 10
    move-object v5, p2

    .line 11
    move v6, p3

    .line 12
    invoke-virtual/range {v1 .. v6}, Lcom/zykj/sketch/core/ActionRecord;->buildTranslation(JLjava/lang/Float;Ljava/lang/Float;Z)Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/core/ActionRecordExecute;->onTranslation(Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1
.end method

.method public final zoom(FFFFZ)Z
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/RecordControl;->actionExecute:Lcom/zykj/sketch/core/ActionRecordExecute;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/sketch/core/record/RecordControl;->actionRecord:Lcom/zykj/sketch/core/ActionRecord;

    .line 4
    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    move v4, p1

    .line 10
    move v5, p2

    .line 11
    move v6, p3

    .line 12
    move v7, p4

    .line 13
    move v8, p5

    .line 14
    invoke-virtual/range {v1 .. v8}, Lcom/zykj/sketch/core/ActionRecord;->buildZoomActionData(JFFFFZ)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/core/ActionRecordExecute;->onZoom(Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1
.end method
