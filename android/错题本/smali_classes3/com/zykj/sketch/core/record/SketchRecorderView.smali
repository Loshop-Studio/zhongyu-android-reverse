.class public final Lcom/zykj/sketch/core/record/SketchRecorderView;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/sketch/core/record/GraphOperation;
.implements Lcom/zykj/sketch/core/listener/AudioOperation;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/sketch/core/record/SketchRecorderView$Companion;,
        Lcom/zykj/sketch/core/record/SketchRecorderView$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ec\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u0007\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u0000 \u008c\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u008c\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0019\u0010\r\u001a\u00020\u000c2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0017\u00a2\u0006\u0004\u0008\u0012\u0010\u0013JB\u0010\u001c\u001a\u00020\u000c2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00112!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\u000c\u0008\u0018\u0012\u0008\u0008\u0019\u0012\u0004\u0008\u0008(\u001a\u0012\u0004\u0012\u00020\u000c0\u0017H\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0015\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016\u00a2\u0006\u0004\u0008 \u0010!J\u000f\u0010\"\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\"\u0010#J\u0017\u0010%\u001a\u00020\u000c2\u0006\u0010\u0015\u001a\u00020$H\u0016\u00a2\u0006\u0004\u0008%\u0010&J\u0017\u0010)\u001a\u00020\u000c2\u0006\u0010(\u001a\u00020\'H\u0016\u00a2\u0006\u0004\u0008)\u0010*J\u0017\u0010+\u001a\u00020\u000c2\u0006\u0010(\u001a\u00020\'H\u0016\u00a2\u0006\u0004\u0008+\u0010*J\u0017\u0010.\u001a\u00020\u000c2\u0006\u0010-\u001a\u00020,H\u0016\u00a2\u0006\u0004\u0008.\u0010/J\u000f\u00100\u001a\u00020,H\u0016\u00a2\u0006\u0004\u00080\u00101J\u0017\u00104\u001a\u00020\u000c2\u0006\u00103\u001a\u000202H\u0016\u00a2\u0006\u0004\u00084\u00105JO\u0010<\u001a\u00020\u000c2\u0006\u00106\u001a\u00020\u001f2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u000c0\u00172\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u000c0\u00172\u000e\u0010;\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010:H\u0016\u00a2\u0006\u0004\u0008<\u0010=J+\u0010?\u001a\u00020\u000c2\u0006\u00106\u001a\u00020\u001f2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\u000c0\u0017H\u0016\u00a2\u0006\u0004\u0008?\u0010@JS\u0010G\u001a\u00020\u000c2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020\'2\u0006\u00103\u001a\u00020\'2\u0014\u0010E\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010D\u0012\u0004\u0012\u00020\u000c0\u00172\u0014\u0010F\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020\u000c0\u0017H\u0016\u00a2\u0006\u0004\u0008G\u0010HJS\u0010G\u001a\u00020\u000c2\u0006\u00106\u001a\u00020\u001f2\u0006\u0010C\u001a\u00020\'2\u0006\u00103\u001a\u00020\'2\u0014\u0010E\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010D\u0012\u0004\u0012\u00020\u000c0\u00172\u0014\u0010F\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020\u000c0\u0017H\u0016\u00a2\u0006\u0004\u0008G\u0010IJ[\u0010G\u001a\u00020\u000c2\u0006\u0010B\u001a\u00020A2\u0006\u0010J\u001a\u00020\u001f2\u0006\u0010C\u001a\u00020\'2\u0006\u00103\u001a\u00020\'2\u0014\u0010E\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010D\u0012\u0004\u0012\u00020\u000c0\u00172\u0014\u0010F\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020\u000c0\u0017H\u0016\u00a2\u0006\u0004\u0008G\u0010KJ[\u0010G\u001a\u00020\u000c2\u0006\u00106\u001a\u00020\u001f2\u0006\u0010J\u001a\u00020\u001f2\u0006\u0010C\u001a\u00020\'2\u0006\u00103\u001a\u00020\'2\u0014\u0010E\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010D\u0012\u0004\u0012\u00020\u000c0\u00172\u0014\u0010F\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020\u000c0\u0017H\u0016\u00a2\u0006\u0004\u0008G\u0010LJ\u000f\u0010M\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008M\u0010NJ\u0017\u0010P\u001a\u00020\u000c2\u0006\u0010O\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008P\u0010QJ\u000f\u0010R\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008R\u0010NJ\u000f\u0010S\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008S\u0010NJ\u000f\u0010T\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008T\u0010UJ\u000f\u0010V\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008V\u0010UJ+\u0010[\u001a\u00020\u00112\u0008\u0010X\u001a\u0004\u0018\u00010W2\u0008\u0010Y\u001a\u0004\u0018\u00010W2\u0006\u0010Z\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008[\u0010\\J7\u0010a\u001a\u00020\u00112\u0006\u0010]\u001a\u00020W2\u0006\u0010^\u001a\u00020W2\u0006\u0010_\u001a\u00020W2\u0006\u0010`\u001a\u00020W2\u0006\u0010Z\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008a\u0010bJ\u000f\u0010c\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008c\u0010NJ\u000f\u0010d\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008d\u0010NJ4\u0010e\u001a\u00020\u000c2#\u0010\u001b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u001f\u00a2\u0006\u000c\u0008\u0018\u0012\u0008\u0008\u0019\u0012\u0004\u0008\u0008(6\u0012\u0004\u0012\u00020\u000c0\u0017H\u0016\u00a2\u0006\u0004\u0008e\u0010fJ\u000f\u0010g\u001a\u00020AH\u0016\u00a2\u0006\u0004\u0008g\u0010hJ\u0011\u0010j\u001a\u0004\u0018\u00010iH\u0016\u00a2\u0006\u0004\u0008j\u0010kJ\u000f\u0010l\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008l\u0010UJ\u000f\u0010m\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008m\u0010NJ\u000f\u0010n\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008n\u0010UJ\u000f\u0010o\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008o\u0010NJ\u0019\u0010q\u001a\u00020\u000c2\u0008\u0010\u000b\u001a\u0004\u0018\u00010pH\u0016\u00a2\u0006\u0004\u0008q\u0010rJ\u0019\u0010t\u001a\u00020\u000c2\u0008\u0010\u000b\u001a\u0004\u0018\u00010sH\u0016\u00a2\u0006\u0004\u0008t\u0010uJ\u0019\u0010w\u001a\u00020\u000c2\u0008\u0010\u000b\u001a\u0004\u0018\u00010vH\u0016\u00a2\u0006\u0004\u0008w\u0010xJ\u0019\u0010z\u001a\u00020\u000c2\u0008\u0010\u000b\u001a\u0004\u0018\u00010yH\u0016\u00a2\u0006\u0004\u0008z\u0010{J\u0015\u0010}\u001a\u00020\u000c2\u0006\u0010|\u001a\u00020\u0011\u00a2\u0006\u0004\u0008}\u0010QR\u0015\u0010\u007f\u001a\u00020~8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u007f\u0010\u0080\u0001R\u0018\u0010\u0082\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0082\u0001\u0010\u0083\u0001R\u001a\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0085\u0001\u0010\u0086\u0001R\u0019\u0010\u0087\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0087\u0001\u0010\u0088\u0001R\u0019\u0010\u0089\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0089\u0001\u0010\u0088\u0001R\u0017\u0010|\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008|\u0010\u0088\u0001R\u0019\u0010\u008a\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u008a\u0001\u0010\u008b\u0001\u00a8\u0006\u008d\u0001"
    }
    d2 = {
        "Lcom/zykj/sketch/core/record/SketchRecorderView;",
        "Landroid/widget/RelativeLayout;",
        "Lcom/zykj/sketch/core/record/GraphOperation;",
        "Lcom/zykj/sketch/core/listener/AudioOperation;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "Lcom/zykj/sketch/core/listener/ImageDeleteListener;",
        "listener",
        "Ld6/s;",
        "setImageDeleteListener",
        "(Lcom/zykj/sketch/core/listener/ImageDeleteListener;)V",
        "Landroid/view/MotionEvent;",
        "event",
        "",
        "onTouchEvent",
        "(Landroid/view/MotionEvent;)Z",
        "Lcom/zykj/sketch/core/config/SketchConfig;",
        "config",
        "copy",
        "Lkotlin/Function1;",
        "Lkotlin/ParameterName;",
        "name",
        "success",
        "callBack",
        "initConfig",
        "(Lcom/zykj/sketch/core/config/SketchConfig;ZLr6/c;)V",
        "",
        "",
        "getResList",
        "()Ljava/util/List;",
        "getConfig",
        "()Lcom/zykj/sketch/core/config/SketchConfig;",
        "Lcom/zykj/sketch/core/config/GraphConfig;",
        "setGraphConfig",
        "(Lcom/zykj/sketch/core/config/GraphConfig;)V",
        "",
        "color",
        "setBackgroundColor",
        "(I)V",
        "setSketchBackground",
        "Landroid/graphics/RectF;",
        "rectF",
        "setDrawArea",
        "(Landroid/graphics/RectF;)V",
        "getDrawArea",
        "()Landroid/graphics/RectF;",
        "Lcom/zykj/sketch/core/data/Mode;",
        "mode",
        "setMode",
        "(Lcom/zykj/sketch/core/data/Mode;)V",
        "path",
        "Lcom/zykj/sketch/core/listener/ViewControl;",
        "Lcom/zykj/sketch/core/graph/Graph;",
        "finish",
        "Lkotlin/Function0;",
        "exception",
        "loadData",
        "(Ljava/lang/String;Lr6/c;Lr6/c;Lr6/a;)V",
        "Lcom/zykj/sketch/core/listener/PPTControl;",
        "addPPT",
        "(Ljava/lang/String;Lr6/c;)V",
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
        "(Landroid/graphics/Bitmap;Ljava/lang/String;IILr6/c;Lr6/c;)V",
        "(Ljava/lang/String;Ljava/lang/String;IILr6/c;Lr6/c;)V",
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
        "translateX",
        "translateY",
        "keep",
        "tranlation",
        "(Ljava/lang/Float;Ljava/lang/Float;Z)Z",
        "scaleX",
        "scaleY",
        "centerX",
        "centerY",
        "zoom",
        "(FFFFZ)Z",
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
        "startRecord",
        "isRecord",
        "stopRecord",
        "Lcom/zykj/sketch/core/listener/ProgressListener;",
        "setProgressListener",
        "(Lcom/zykj/sketch/core/listener/ProgressListener;)V",
        "Lcom/zykj/sketch/core/listener/NextPrevListener;",
        "setNextPrevListener",
        "(Lcom/zykj/sketch/core/listener/NextPrevListener;)V",
        "Lcom/zykj/sketch/core/listener/ActionChangeListener;",
        "setActionChangeListener",
        "(Lcom/zykj/sketch/core/listener/ActionChangeListener;)V",
        "Lcom/zykj/sketch/core/listener/GraphMatrixListener;",
        "setGraphMatrixListener",
        "(Lcom/zykj/sketch/core/listener/GraphMatrixListener;)V",
        "acceptTouchEvent",
        "setAcceptTouchEvent",
        "Lcom/zykj/sketch/widgets/DrawTempView;",
        "mTempDrawView",
        "Lcom/zykj/sketch/widgets/DrawTempView;",
        "Lcom/zykj/sketch/widgets/TextureDrawView;",
        "mDrawView",
        "Lcom/zykj/sketch/widgets/TextureDrawView;",
        "Lcom/zykj/sketch/core/record/RecordControl;",
        "recordControl",
        "Lcom/zykj/sketch/core/record/RecordControl;",
        "isReady",
        "Z",
        "isLoading",
        "sketchConfig",
        "Lcom/zykj/sketch/core/config/SketchConfig;",
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
.field public static final Companion:Lcom/zykj/sketch/core/record/SketchRecorderView$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final ZOOM_IN_X:F = 1.2f

.field public static final ZOOM_IN_Y:F = 1.2f

.field public static final ZOOM_OUT_X:F = 0.8f

.field public static final ZOOM_OUT_Y:F = 0.8f


# instance fields
.field public _$_findViewCache:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private acceptTouchEvent:Z

.field private isLoading:Z

.field private isReady:Z

.field private final mDrawView:Lcom/zykj/sketch/widgets/TextureDrawView;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final mTempDrawView:Lcom/zykj/sketch/widgets/DrawTempView;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private recordControl:Lcom/zykj/sketch/core/record/RecordControl;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private sketchConfig:Lcom/zykj/sketch/core/config/SketchConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/sketch/core/record/SketchRecorderView$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/sketch/core/record/SketchRecorderView$Companion;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Lcom/zykj/sketch/core/record/SketchRecorderView;->Companion:Lcom/zykj/sketch/core/record/SketchRecorderView$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->_$_findViewCache:Ljava/util/Map;

    .line 12
    .line 13
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lcom/zykj/sketch/widgets/DrawTempView;

    .line 17
    .line 18
    invoke-direct {v0, p1, p2}, Lcom/zykj/sketch/widgets/DrawTempView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->mTempDrawView:Lcom/zykj/sketch/widgets/DrawTempView;

    .line 22
    .line 23
    new-instance v1, Lcom/zykj/sketch/widgets/TextureDrawView;

    .line 24
    .line 25
    invoke-direct {v1, p1, p2}, Lcom/zykj/sketch/widgets/TextureDrawView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->mDrawView:Lcom/zykj/sketch/widgets/TextureDrawView;

    .line 29
    .line 30
    const/4 p2, 0x1

    .line 31
    iput-boolean p2, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->acceptTouchEvent:Z

    .line 32
    .line 33
    new-instance v2, Lcom/zykj/sketch/core/config/SketchConfig$Builder;

    .line 34
    .line 35
    invoke-direct {v2}, Lcom/zykj/sketch/core/config/SketchConfig$Builder;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, p1}, Lcom/zykj/sketch/core/config/SketchConfig$Builder;->build(Landroid/content/Context;)Lcom/zykj/sketch/core/config/SketchConfig;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput-object p1, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->sketchConfig:Lcom/zykj/sketch/core/config/SketchConfig;

    .line 43
    .line 44
    invoke-virtual {p0, p2}, Landroid/view/View;->setKeepScreenOn(Z)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 51
    .line 52
    .line 53
    new-instance p1, Lcom/zykj/sketch/core/record/RecordControl;

    .line 54
    .line 55
    iget-object p2, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->sketchConfig:Lcom/zykj/sketch/core/config/SketchConfig;

    .line 56
    .line 57
    invoke-direct {p1, p0, p2, v1, v0}, Lcom/zykj/sketch/core/record/RecordControl;-><init>(Landroid/view/ViewGroup;Lcom/zykj/sketch/core/config/SketchConfig;Lcom/zykj/sketch/core/listener/RealDraw;Lcom/zykj/sketch/core/listener/ImitateDraw;)V

    .line 58
    .line 59
    .line 60
    iput-object p1, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    .line 61
    .line 62
    new-instance p1, La8/a;

    .line 63
    .line 64
    const/16 p2, 0x14

    .line 65
    .line 66
    invoke-direct {p1, p0, p2}, La8/a;-><init>(Ljava/lang/Object;I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method private static final _init_$lambda-0(Lcom/zykj/sketch/core/record/SketchRecorderView;)V
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->isReady:Z

    .line 8
    .line 9
    return-void
.end method

.method public static synthetic a(Lcom/zykj/sketch/core/record/SketchRecorderView;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/sketch/core/record/SketchRecorderView;->_init_$lambda-0(Lcom/zykj/sketch/core/record/SketchRecorderView;)V

    return-void
.end method

.method public static final synthetic access$setLoading$p(Lcom/zykj/sketch/core/record/SketchRecorderView;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->isLoading:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setReady$p(Lcom/zykj/sketch/core/record/SketchRecorderView;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->isReady:Z

    .line 2
    .line 3
    return-void
.end method

.method public static synthetic b(Lcom/zykj/sketch/core/record/SketchRecorderView;Ljava/lang/String;Lr6/c;Lr6/a;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/sketch/core/record/SketchRecorderView;->loadData$lambda-12$lambda-11(Lcom/zykj/sketch/core/record/SketchRecorderView;Ljava/lang/String;Lr6/c;Lr6/a;)V

    return-void
.end method

.method public static synthetic c(Lcom/zykj/sketch/core/record/SketchRecorderView;Ljava/lang/String;Lcom/zykj/sketch/core/config/SketchConfig;Lr6/c;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/sketch/core/record/SketchRecorderView;->initConfig$lambda-2$lambda-1(Lcom/zykj/sketch/core/record/SketchRecorderView;Ljava/lang/String;Lcom/zykj/sketch/core/config/SketchConfig;Lr6/c;)V

    return-void
.end method

.method public static synthetic d(Lr6/a;Lcom/zykj/sketch/core/record/SketchRecorderView;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/sketch/core/record/SketchRecorderView;->loadData$lambda-12$lambda-11$lambda-8(Lr6/a;Lcom/zykj/sketch/core/record/SketchRecorderView;)V

    return-void
.end method

.method public static synthetic e(Lr6/a;Lcom/zykj/sketch/core/record/SketchRecorderView;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/sketch/core/record/SketchRecorderView;->loadData$lambda-12$lambda-11$lambda-4(Lr6/a;Lcom/zykj/sketch/core/record/SketchRecorderView;)V

    return-void
.end method

.method public static synthetic f(Lr6/a;Lcom/zykj/sketch/core/record/SketchRecorderView;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/sketch/core/record/SketchRecorderView;->loadData$lambda-12$lambda-11$lambda-6(Lr6/a;Lcom/zykj/sketch/core/record/SketchRecorderView;)V

    return-void
.end method

.method public static synthetic g(Lcom/zykj/sketch/core/record/SketchRecorderView;Ljava/lang/String;Lr6/c;Lr6/a;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/sketch/core/record/SketchRecorderView;->loadData$lambda-12(Lcom/zykj/sketch/core/record/SketchRecorderView;Ljava/lang/String;Lr6/c;Lr6/a;)V

    return-void
.end method

.method public static synthetic h(Lr6/a;Lcom/zykj/sketch/core/record/SketchRecorderView;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/sketch/core/record/SketchRecorderView;->loadData$lambda-12$lambda-11$lambda-10(Lr6/a;Lcom/zykj/sketch/core/record/SketchRecorderView;)V

    return-void
.end method

.method private static final initConfig$lambda-2$lambda-1(Lcom/zykj/sketch/core/record/SketchRecorderView;Ljava/lang/String;Lcom/zykj/sketch/core/config/SketchConfig;Lr6/c;)V
    .locals 2

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$it"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$config"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "$callBack"

    .line 17
    .line 18
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    sget-object v0, Lcom/zykj/sketch/utils/FileUtils;->Companion:Lcom/zykj/sketch/utils/FileUtils$Companion;

    .line 22
    .line 23
    iget-object v1, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->sketchConfig:Lcom/zykj/sketch/core/config/SketchConfig;

    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/zykj/sketch/core/config/SketchConfig;->getSourcePath()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v1, p1}, Lcom/zykj/sketch/utils/FileUtils$Companion;->copyFolder(Ljava/lang/String;Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    iget-object p0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->sketchConfig:Lcom/zykj/sketch/core/config/SketchConfig;

    .line 36
    .line 37
    invoke-virtual {p2}, Lcom/zykj/sketch/core/config/SketchConfig;->getSourcePath()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/core/config/SketchConfig;->setSourcePath(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 45
    .line 46
    invoke-interface {p3, p0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_0
    iget-object p0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->sketchConfig:Lcom/zykj/sketch/core/config/SketchConfig;

    .line 51
    .line 52
    invoke-virtual {p2}, Lcom/zykj/sketch/core/config/SketchConfig;->getSourcePath()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/core/config/SketchConfig;->setSourcePath(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 60
    .line 61
    invoke-interface {p3, p0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method private static final loadData$lambda-12(Lcom/zykj/sketch/core/record/SketchRecorderView;Ljava/lang/String;Lr6/c;Lr6/a;)V
    .locals 7

    .line 1
    const-string v0, "this$0"

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
    const-string v0, "$finish"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Ljava/lang/Thread;

    .line 17
    .line 18
    new-instance v1, Lcom/zykj/sketch/core/record/b;

    .line 19
    .line 20
    const/4 v6, 0x1

    .line 21
    move-object v2, p0

    .line 22
    move-object v3, p1

    .line 23
    move-object v4, p2

    .line 24
    move-object v5, p3

    .line 25
    invoke-direct/range {v1 .. v6}, Lcom/zykj/sketch/core/record/b;-><init>(Lcom/zykj/sketch/core/record/SketchRecorderView;Ljava/lang/String;Lr6/c;Lr6/a;I)V

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method private static final loadData$lambda-12$lambda-11(Lcom/zykj/sketch/core/record/SketchRecorderView;Ljava/lang/String;Lr6/c;Lr6/a;)V
    .locals 8

    .line 1
    const-string v0, "this$0"

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
    const-string v0, "$finish"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    const/4 v1, 0x1

    .line 18
    :try_start_0
    iget-object v2, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    .line 19
    .line 20
    new-instance v5, Lcom/zykj/sketch/core/record/SketchRecorderView$loadData$1$1$1;

    .line 21
    .line 22
    invoke-direct {v5, p0, p2}, Lcom/zykj/sketch/core/record/SketchRecorderView$loadData$1$1$1;-><init>(Lcom/zykj/sketch/core/record/SketchRecorderView;Lr6/c;)V

    .line 23
    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    const/4 v7, 0x0

    .line 27
    const/4 v4, 0x0

    .line 28
    move-object v3, p1

    .line 29
    invoke-static/range {v2 .. v7}, Lcom/zykj/sketch/core/record/RecordControl;->loadData$default(Lcom/zykj/sketch/core/record/RecordControl;Ljava/lang/String;Lr6/c;Lr6/c;ILjava/lang/Object;)V
    :try_end_0
    .catch Lcom/zykj/sketch/exception/LowVersionException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lcom/zykj/sketch/exception/HighVersionException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/zykj/sketch/exception/EmptyDataException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :catch_0
    new-instance p1, Lcom/zykj/sketch/core/record/c;

    .line 34
    .line 35
    const/4 p2, 0x3

    .line 36
    invoke-direct {p1, p3, p0, p2}, Lcom/zykj/sketch/core/record/c;-><init>(Lr6/a;Lcom/zykj/sketch/core/record/SketchRecorderView;I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 40
    .line 41
    .line 42
    iput-boolean v1, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->isReady:Z

    .line 43
    .line 44
    iput-boolean v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->isLoading:Z

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catch_1
    new-instance p1, Lcom/zykj/sketch/core/record/c;

    .line 48
    .line 49
    const/4 p2, 0x2

    .line 50
    invoke-direct {p1, p3, p0, p2}, Lcom/zykj/sketch/core/record/c;-><init>(Lr6/a;Lcom/zykj/sketch/core/record/SketchRecorderView;I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 54
    .line 55
    .line 56
    iput-boolean v1, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->isReady:Z

    .line 57
    .line 58
    iput-boolean v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->isLoading:Z

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catch_2
    new-instance p1, Lcom/zykj/sketch/core/record/c;

    .line 62
    .line 63
    const/4 p2, 0x1

    .line 64
    invoke-direct {p1, p3, p0, p2}, Lcom/zykj/sketch/core/record/c;-><init>(Lr6/a;Lcom/zykj/sketch/core/record/SketchRecorderView;I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 68
    .line 69
    .line 70
    iput-boolean v1, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->isReady:Z

    .line 71
    .line 72
    iput-boolean v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->isLoading:Z

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :catch_3
    new-instance p1, Lcom/zykj/sketch/core/record/c;

    .line 76
    .line 77
    const/4 p2, 0x0

    .line 78
    invoke-direct {p1, p3, p0, p2}, Lcom/zykj/sketch/core/record/c;-><init>(Lr6/a;Lcom/zykj/sketch/core/record/SketchRecorderView;I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 82
    .line 83
    .line 84
    iput-boolean v1, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->isReady:Z

    .line 85
    .line 86
    iput-boolean v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->isLoading:Z

    .line 87
    .line 88
    :goto_0
    return-void
.end method

.method private static final loadData$lambda-12$lambda-11$lambda-10(Lr6/a;Lcom/zykj/sketch/core/record/SketchRecorderView;)V
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-interface {p0}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-eqz p0, :cond_1

    .line 16
    .line 17
    sget p1, Lcom/zykj/sketch/R$string;->tips_file_not_found:I

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void
.end method

.method private static final loadData$lambda-12$lambda-11$lambda-4(Lr6/a;Lcom/zykj/sketch/core/record/SketchRecorderView;)V
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-interface {p0}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-eqz p0, :cond_1

    .line 16
    .line 17
    sget p1, Lcom/zykj/sketch/R$string;->tips_low_version:I

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void
.end method

.method private static final loadData$lambda-12$lambda-11$lambda-6(Lr6/a;Lcom/zykj/sketch/core/record/SketchRecorderView;)V
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-interface {p0}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-eqz p0, :cond_1

    .line 16
    .line 17
    sget p1, Lcom/zykj/sketch/R$string;->tips_height_version:I

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void
.end method

.method private static final loadData$lambda-12$lambda-11$lambda-8(Lr6/a;Lcom/zykj/sketch/core/record/SketchRecorderView;)V
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-interface {p0}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-eqz p0, :cond_1

    .line 16
    .line 17
    sget p1, Lcom/zykj/sketch/R$string;->tips_file_corrupted:I

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->_$_findViewCache:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->_$_findViewCache:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-nez v1, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1

    :cond_0
    const/4 p1, 0x0

    return-object p1

    :cond_1
    return-object v1
.end method

.method public addImage(Landroid/graphics/Bitmap;IILr6/c;Lr6/c;)V
    .locals 12
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

    const-string v0, "bitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageCallBack"

    move-object/from16 v7, p4

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pathCallBack"

    move-object/from16 v9, p5

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v1, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    const/16 v10, 0x40

    const/4 v11, 0x0

    const/4 v8, 0x0

    move-object v2, p1

    move v5, p2

    move v6, p3

    invoke-static/range {v1 .. v11}, Lcom/zykj/sketch/core/record/RecordControl;->addAdapterImage$default(Lcom/zykj/sketch/core/record/RecordControl;Landroid/graphics/Bitmap;IIIILr6/c;Ljava/lang/String;Lr6/c;ILjava/lang/Object;)V

    return-void
.end method

.method public addImage(Landroid/graphics/Bitmap;Ljava/lang/String;IILr6/c;Lr6/c;)V
    .locals 10
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

    const-string v0, "bitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageCallBack"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pathCallBack"

    move-object/from16 v9, p6

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object v1, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    move-object v2, p1

    move-object v8, p2

    move v5, p3

    move v6, p4

    move-object v7, p5

    invoke-virtual/range {v1 .. v9}, Lcom/zykj/sketch/core/record/RecordControl;->addAdapterImage(Landroid/graphics/Bitmap;IIIILr6/c;Ljava/lang/String;Lr6/c;)V

    return-void
.end method

.method public addImage(Ljava/lang/String;IILr6/c;Lr6/c;)V
    .locals 12
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

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageCallBack"

    move-object/from16 v7, p4

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pathCallBack"

    move-object/from16 v9, p5

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v1, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    const/16 v10, 0x40

    const/4 v11, 0x0

    const/4 v8, 0x0

    move-object v2, p1

    move v5, p2

    move v6, p3

    invoke-static/range {v1 .. v11}, Lcom/zykj/sketch/core/record/RecordControl;->addAdapterImage$default(Lcom/zykj/sketch/core/record/RecordControl;Ljava/lang/String;IIIILr6/c;Ljava/lang/String;Lr6/c;ILjava/lang/Object;)V

    return-void
.end method

.method public addImage(Ljava/lang/String;Ljava/lang/String;IILr6/c;Lr6/c;)V
    .locals 10
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

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageCallBack"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pathCallBack"

    move-object/from16 v9, p6

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    iget-object v1, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    move-object v2, p1

    move-object v8, p2

    move v5, p3

    move v6, p4

    move-object v7, p5

    invoke-virtual/range {v1 .. v9}, Lcom/zykj/sketch/core/record/RecordControl;->addAdapterImage(Ljava/lang/String;IIIILr6/c;Ljava/lang/String;Lr6/c;)V

    return-void
.end method

.method public addPPT(Ljava/lang/String;Lr6/c;)V
    .locals 8
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
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    move-object v2, p1

    .line 30
    move-object v7, p2

    .line 31
    invoke-virtual/range {v1 .. v7}, Lcom/zykj/sketch/core/record/RecordControl;->addAdapterPPT(Ljava/lang/String;IIIILr6/c;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public clear()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/sketch/core/record/RecordControl;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public getConfig()Lcom/zykj/sketch/core/config/SketchConfig;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->sketchConfig:Lcom/zykj/sketch/core/config/SketchConfig;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDrawArea()Landroid/graphics/RectF;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/sketch/core/record/RecordControl;->getDrawConfig()Landroid/graphics/RectF;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getRecordPath(Lr6/c;)V
    .locals 4
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

    .line 1
    const-string v0, "callBack"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/sketch/core/record/SketchRecorderView;->stopRecord()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    new-instance v3, Lcom/zykj/sketch/core/record/SketchRecorderView$getRecordPath$1;

    .line 20
    .line 21
    invoke-direct {v3, p1}, Lcom/zykj/sketch/core/record/SketchRecorderView$getRecordPath$1;-><init>(Lr6/c;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1, v2, v3}, Lcom/zykj/sketch/core/record/RecordControl;->getRecordPath(IILr6/c;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public getResList()Ljava/util/List;
    .locals 1
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
    iget-object v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/sketch/core/record/RecordControl;->getResList()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public initConfig(Lcom/zykj/sketch/core/config/SketchConfig;ZLr6/c;)V
    .locals 7
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

    .line 1
    const-string v0, "config"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callBack"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->sketchConfig:Lcom/zykj/sketch/core/config/SketchConfig;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/zykj/sketch/core/config/SketchConfig;->isTouchable()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/core/config/SketchConfig;->setTouchable(Z)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->sketchConfig:Lcom/zykj/sketch/core/config/SketchConfig;

    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/zykj/sketch/core/config/SketchConfig;->getMaxImageCount()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/core/config/SketchConfig;->setMaxImageCount(I)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->sketchConfig:Lcom/zykj/sketch/core/config/SketchConfig;

    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/zykj/sketch/core/config/SketchConfig;->getSourcePath()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p1}, Lcom/zykj/sketch/core/config/SketchConfig;->getSourcePath()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    new-instance v0, Ljava/io/File;

    .line 46
    .line 47
    iget-object v1, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->sketchConfig:Lcom/zykj/sketch/core/config/SketchConfig;

    .line 48
    .line 49
    invoke-virtual {v1}, Lcom/zykj/sketch/core/config/SketchConfig;->getSourcePath()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_1

    .line 61
    .line 62
    if-eqz p2, :cond_1

    .line 63
    .line 64
    invoke-virtual {p1}, Lcom/zykj/sketch/core/config/SketchConfig;->getSourcePath()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    new-instance p2, Ljava/io/File;

    .line 69
    .line 70
    invoke-direct {p2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_0

    .line 78
    .line 79
    invoke-virtual {p2}, Ljava/io/File;->mkdirs()Z

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    if-nez p2, :cond_0

    .line 84
    .line 85
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 86
    .line 87
    invoke-interface {p3, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_0
    new-instance p2, Ljava/lang/Thread;

    .line 92
    .line 93
    new-instance v1, La5/d;

    .line 94
    .line 95
    const/16 v6, 0x8

    .line 96
    .line 97
    move-object v2, p0

    .line 98
    move-object v4, p1

    .line 99
    move-object v5, p3

    .line 100
    invoke-direct/range {v1 .. v6}, La5/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 101
    .line 102
    .line 103
    invoke-direct {p2, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p2}, Ljava/lang/Thread;->start()V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :cond_1
    move-object v2, p0

    .line 111
    move-object v4, p1

    .line 112
    move-object v5, p3

    .line 113
    iget-object p1, v2, Lcom/zykj/sketch/core/record/SketchRecorderView;->sketchConfig:Lcom/zykj/sketch/core/config/SketchConfig;

    .line 114
    .line 115
    invoke-virtual {v4}, Lcom/zykj/sketch/core/config/SketchConfig;->getSourcePath()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    invoke-virtual {p1, p2}, Lcom/zykj/sketch/core/config/SketchConfig;->setSourcePath(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 123
    .line 124
    invoke-interface {v5, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    return-void
.end method

.method public isRecord()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/sketch/core/record/RecordControl;->isRecord()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public isTouch()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/sketch/core/record/RecordControl;->isTouch()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public limitThumbnail()Lcom/zykj/sketch/core/data/ThumbnailBean;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/sketch/core/record/RecordControl;->limitThumbnail()Lcom/zykj/sketch/core/data/ThumbnailBean;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public loadData(Ljava/lang/String;Lr6/c;Lr6/c;Lr6/a;)V
    .locals 6
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

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/zykj/sketch/exception/EmptyDataException;,
            Lcom/zykj/sketch/exception/LowVersionException;
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
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p2, "finish"

    .line 12
    .line 13
    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-boolean p2, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->isLoading:Z

    .line 17
    .line 18
    if-nez p2, :cond_0

    .line 19
    .line 20
    const/4 p2, 0x0

    .line 21
    iput-boolean p2, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->isReady:Z

    .line 22
    .line 23
    const/4 p2, 0x1

    .line 24
    iput-boolean p2, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->isLoading:Z

    .line 25
    .line 26
    new-instance v0, Lcom/zykj/sketch/core/record/b;

    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    move-object v1, p0

    .line 30
    move-object v2, p1

    .line 31
    move-object v3, p3

    .line 32
    move-object v4, p4

    .line 33
    invoke-direct/range {v0 .. v5}, Lcom/zykj/sketch/core/record/b;-><init>(Lcom/zykj/sketch/core/record/SketchRecorderView;Ljava/lang/String;Lr6/c;Lr6/a;I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    move-object v1, p0

    .line 41
    return-void
.end method

.method public next()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/sketch/core/record/RecordControl;->nextAction()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->isReady:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-boolean v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->isLoading:Z

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-boolean v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->acceptTouchEvent:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/core/record/RecordControl;->onTouchAdapterEvent(Landroid/view/MotionEvent;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    const/4 p1, 0x1

    .line 24
    return p1
.end method

.method public prev()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/sketch/core/record/RecordControl;->prevAction()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public reset(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/core/record/RecordControl;->reset(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public resetMatrix()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/sketch/core/record/RecordControl;->resetMatrix()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public save()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v4, 0x4

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Lcom/zykj/sketch/core/record/RecordControl;->getRecordPath$default(Lcom/zykj/sketch/core/record/RecordControl;IILr6/c;ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final setAcceptTouchEvent(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->acceptTouchEvent:Z

    .line 2
    .line 3
    return-void
.end method

.method public setActionChangeListener(Lcom/zykj/sketch/core/listener/ActionChangeListener;)V
    .locals 1
    .param p1    # Lcom/zykj/sketch/core/listener/ActionChangeListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/core/record/RecordControl;->addActionChangeListener(Lcom/zykj/sketch/core/listener/ActionChangeListener;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setBackgroundColor(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, p1, v1}, Lcom/zykj/sketch/core/record/RecordControl;->setDrawConfig(Ljava/lang/Integer;Landroid/graphics/RectF;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setDrawArea(Landroid/graphics/RectF;)V
    .locals 4
    .param p1    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "rectF"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p1, Landroid/graphics/RectF;->left:F

    .line 7
    .line 8
    float-to-int v0, v0

    .line 9
    int-to-float v0, v0

    .line 10
    iget v1, p1, Landroid/graphics/RectF;->top:F

    .line 11
    .line 12
    float-to-int v1, v1

    .line 13
    int-to-float v1, v1

    .line 14
    iget v2, p1, Landroid/graphics/RectF;->right:F

    .line 15
    .line 16
    float-to-int v2, v2

    .line 17
    int-to-float v2, v2

    .line 18
    iget v3, p1, Landroid/graphics/RectF;->bottom:F

    .line 19
    .line 20
    float-to-int v3, v3

    .line 21
    int-to-float v3, v3

    .line 22
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/RectF;->set(FFFF)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-virtual {v0, v1, p1}, Lcom/zykj/sketch/core/record/RecordControl;->setDrawConfig(Ljava/lang/Integer;Landroid/graphics/RectF;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public setGraphConfig(Lcom/zykj/sketch/core/config/GraphConfig;)V
    .locals 2
    .param p1    # Lcom/zykj/sketch/core/config/GraphConfig;
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
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;->newBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig$Builder;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p1}, Lcom/zykj/sketch/core/config/GraphConfig;->getColor()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig$Builder;->setColor(I)Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig$Builder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/zykj/sketch/core/config/GraphConfig;->getWidth()F

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig$Builder;->setWidth(F)Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig$Builder;

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v1, "newBuilder.build()"

    .line 31
    .line 32
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v0}, Lcom/zykj/sketch/core/record/RecordControl;->setGraphConfig(Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public setGraphMatrixListener(Lcom/zykj/sketch/core/listener/GraphMatrixListener;)V
    .locals 1
    .param p1    # Lcom/zykj/sketch/core/listener/GraphMatrixListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/core/record/RecordControl;->setGraphMatrixListener(Lcom/zykj/sketch/core/listener/GraphMatrixListener;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setImageDeleteListener(Lcom/zykj/sketch/core/listener/ImageDeleteListener;)V
    .locals 1
    .param p1    # Lcom/zykj/sketch/core/listener/ImageDeleteListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/core/record/RecordControl;->setImageDeleteListener(Lcom/zykj/sketch/core/listener/ImageDeleteListener;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setMode(Lcom/zykj/sketch/core/data/Mode;)V
    .locals 1
    .param p1    # Lcom/zykj/sketch/core/data/Mode;
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
    sget-object v0, Lcom/zykj/sketch/core/record/SketchRecorderView$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    aget p1, v0, p1

    .line 13
    .line 14
    packed-switch p1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object p1, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    .line 19
    .line 20
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;->ACTION_WRITING_MOVE_VERTICAL:Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Lcom/zykj/sketch/core/record/RecordControl;->setActionMode(Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    iget-object p1, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    .line 27
    .line 28
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;->ACTION_DELETE:Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Lcom/zykj/sketch/core/record/RecordControl;->setActionMode(Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_2
    iget-object p1, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    .line 35
    .line 36
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;->ACTION_ERASER_WRITING:Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Lcom/zykj/sketch/core/record/RecordControl;->setActionMode(Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_3
    iget-object p1, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    .line 43
    .line 44
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;->ACTION_ERASER_VIEW:Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Lcom/zykj/sketch/core/record/RecordControl;->setActionMode(Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_4
    iget-object p1, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    .line 51
    .line 52
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;->ACTION_SHAPE_CIRCLE:Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;

    .line 53
    .line 54
    invoke-virtual {p1, v0}, Lcom/zykj/sketch/core/record/RecordControl;->setActionMode(Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :pswitch_5
    iget-object p1, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    .line 59
    .line 60
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;->ACTION_SHAPE_RECT:Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;

    .line 61
    .line 62
    invoke-virtual {p1, v0}, Lcom/zykj/sketch/core/record/RecordControl;->setActionMode(Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :pswitch_6
    iget-object p1, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    .line 67
    .line 68
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;->ACTION_WRITING_MOVE:Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;

    .line 69
    .line 70
    invoke-virtual {p1, v0}, Lcom/zykj/sketch/core/record/RecordControl;->setActionMode(Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :pswitch_7
    iget-object p1, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    .line 75
    .line 76
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;->ACTION_WRITING:Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;

    .line 77
    .line 78
    invoke-virtual {p1, v0}, Lcom/zykj/sketch/core/record/RecordControl;->setActionMode(Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :pswitch_8
    iget-object p1, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    .line 83
    .line 84
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;->ACTION_SELECT:Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;

    .line 85
    .line 86
    invoke-virtual {p1, v0}, Lcom/zykj/sketch/core/record/RecordControl;->setActionMode(Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    nop

    .line 91
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public setNextPrevListener(Lcom/zykj/sketch/core/listener/NextPrevListener;)V
    .locals 1
    .param p1    # Lcom/zykj/sketch/core/listener/NextPrevListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/core/record/RecordControl;->addNextPrevListener(Lcom/zykj/sketch/core/listener/NextPrevListener;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setProgressListener(Lcom/zykj/sketch/core/listener/ProgressListener;)V
    .locals 1
    .param p1    # Lcom/zykj/sketch/core/listener/ProgressListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/core/record/RecordControl;->addProgressListener(Lcom/zykj/sketch/core/listener/ProgressListener;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setSketchBackground(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, p1, v1}, Lcom/zykj/sketch/core/record/RecordControl;->setDrawConfig(Ljava/lang/Integer;Landroid/graphics/RectF;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public startRecord()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/core/record/SketchRecorderView;->isRecord()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/zykj/sketch/core/record/RecordControl;->startAudio()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public stopRecord()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/core/record/SketchRecorderView;->isRecord()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/zykj/sketch/core/record/RecordControl;->stopAudio()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public thumbnail()Landroid/graphics/Bitmap;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {v0, v1, v2}, Lcom/zykj/sketch/core/record/RecordControl;->thumbnail(II)Landroid/graphics/Bitmap;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method public tranlation(Ljava/lang/Float;Ljava/lang/Float;Z)Z
    .locals 1
    .param p1    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lcom/zykj/sketch/core/record/RecordControl;->translation(Ljava/lang/Float;Ljava/lang/Float;Z)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public zoom(FFFFZ)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    .line 2
    .line 3
    move v1, p1

    .line 4
    move v2, p2

    .line 5
    move v3, p3

    .line 6
    move v4, p4

    .line 7
    move v5, p5

    .line 8
    invoke-virtual/range {v0 .. v5}, Lcom/zykj/sketch/core/record/RecordControl;->zoom(FFFFZ)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public zoomIn()Z
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    int-to-float v1, v1

    .line 8
    const/high16 v2, 0x40000000    # 2.0f

    .line 9
    .line 10
    div-float v3, v1, v2

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    int-to-float v1, v1

    .line 17
    div-float v4, v1, v2

    .line 18
    .line 19
    const/16 v6, 0x10

    .line 20
    .line 21
    const/4 v7, 0x0

    .line 22
    const v1, 0x3f99999a    # 1.2f

    .line 23
    .line 24
    .line 25
    const v2, 0x3f99999a    # 1.2f

    .line 26
    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    invoke-static/range {v0 .. v7}, Lcom/zykj/sketch/core/record/RecordControl;->zoom$default(Lcom/zykj/sketch/core/record/RecordControl;FFFFZILjava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    return v0
.end method

.method public zoomOut()Z
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->recordControl:Lcom/zykj/sketch/core/record/RecordControl;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    int-to-float v1, v1

    .line 8
    const/high16 v2, 0x40000000    # 2.0f

    .line 9
    .line 10
    div-float v3, v1, v2

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    int-to-float v1, v1

    .line 17
    div-float v4, v1, v2

    .line 18
    .line 19
    const/16 v6, 0x10

    .line 20
    .line 21
    const/4 v7, 0x0

    .line 22
    const v1, 0x3f4ccccd    # 0.8f

    .line 23
    .line 24
    .line 25
    const v2, 0x3f4ccccd    # 0.8f

    .line 26
    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    invoke-static/range {v0 .. v7}, Lcom/zykj/sketch/core/record/RecordControl;->zoom$default(Lcom/zykj/sketch/core/record/RecordControl;FFFFZILjava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    return v0
.end method
