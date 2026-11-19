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
        "\u0000\u00dc\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0007\n\u0002\u0008\u000c\u0018\u0000 k2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001kB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u0008JL\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0014\u0010\u001c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u00160\u001d2\u0014\u0010\u001f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0004\u0012\u00020\u00160\u001dH\u0016JT\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0014\u0010\u001c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u00160\u001d2\u0014\u0010\u001f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0004\u0012\u00020\u00160\u001dH\u0016JL\u0010\u0015\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0014\u0010\u001c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u00160\u001d2\u0014\u0010\u001f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0004\u0012\u00020\u00160\u001dH\u0016JT\u0010\u0015\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0014\u0010\u001c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u00160\u001d2\u0014\u0010\u001f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0004\u0012\u00020\u00160\u001dH\u0016J$\u0010#\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020 2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00160\u001dH\u0016J\u0008\u0010&\u001a\u00020\u0016H\u0016J\u0008\u0010\'\u001a\u00020\u0014H\u0016J\u0008\u0010(\u001a\u00020)H\u0016J-\u0010*\u001a\u00020\u00162#\u0010$\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010 \u00a2\u0006\u000c\u0008+\u0012\u0008\u0008,\u0012\u0004\u0008\u0008(\"\u0012\u0004\u0012\u00020\u00160\u001dH\u0016J\u000e\u0010-\u001a\u0008\u0012\u0004\u0012\u00020 0.H\u0016J;\u0010/\u001a\u00020\u00162\u0006\u00100\u001a\u00020\u00142\u0006\u00101\u001a\u00020\n2!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110\n\u00a2\u0006\u000c\u0008+\u0012\u0008\u0008,\u0012\u0004\u0008\u0008(2\u0012\u0004\u0012\u00020\u00160\u001dH\u0016J\u0008\u00103\u001a\u00020\nH\u0016J\u0008\u00104\u001a\u00020\nH\u0016J\n\u00105\u001a\u0004\u0018\u000106H\u0016JH\u00107\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020 2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u00160\u001d2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u00160\u001d2\u000e\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010<H\u0016J\u0008\u0010=\u001a\u00020\u0016H\u0016J\u0010\u0010>\u001a\u00020\n2\u0006\u0010?\u001a\u00020@H\u0017J\u0008\u0010A\u001a\u00020\u0016H\u0016J\u0010\u0010B\u001a\u00020\u00162\u0006\u0010C\u001a\u00020\nH\u0016J\u0008\u0010D\u001a\u00020\u0016H\u0016J\u0008\u0010E\u001a\u00020\u0016H\u0016J\u000e\u0010F\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010G\u001a\u00020\u00162\u0008\u0010H\u001a\u0004\u0018\u00010IH\u0016J\u0010\u0010J\u001a\u00020\u00162\u0006\u0010K\u001a\u00020\u001aH\u0016J\u0010\u0010L\u001a\u00020\u00162\u0006\u0010M\u001a\u00020)H\u0016J\u0010\u0010N\u001a\u00020\u00162\u0006\u00100\u001a\u00020OH\u0016J\u0012\u0010P\u001a\u00020\u00162\u0008\u0010H\u001a\u0004\u0018\u00010QH\u0016J\u0012\u0010R\u001a\u00020\u00162\u0008\u0010H\u001a\u0004\u0018\u00010SH\u0016J\u0010\u0010T\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020UH\u0016J\u0012\u0010V\u001a\u00020\u00162\u0008\u0010H\u001a\u0004\u0018\u00010WH\u0016J\u0012\u0010X\u001a\u00020\u00162\u0008\u0010H\u001a\u0004\u0018\u00010YH\u0016J\u0010\u0010Z\u001a\u00020\u00162\u0006\u0010K\u001a\u00020\u001aH\u0016J\u0008\u0010[\u001a\u00020\u0016H\u0016J\u0008\u0010\\\u001a\u00020\u0016H\u0016J\u0008\u0010]\u001a\u00020\u0018H\u0016J)\u0010^\u001a\u00020\n2\u0008\u0010_\u001a\u0004\u0018\u00010`2\u0008\u0010a\u001a\u0004\u0018\u00010`2\u0006\u0010b\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010cJ0\u0010d\u001a\u00020\n2\u0006\u0010e\u001a\u00020`2\u0006\u0010f\u001a\u00020`2\u0006\u0010g\u001a\u00020`2\u0006\u0010h\u001a\u00020`2\u0006\u0010b\u001a\u00020\nH\u0016J\u0008\u0010i\u001a\u00020\nH\u0016J\u0008\u0010j\u001a\u00020\nH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006l"
    }
    d2 = {
        "Lcom/zykj/sketch/core/record/SketchRecorderView;",
        "Landroid/widget/RelativeLayout;",
        "Lcom/zykj/sketch/core/record/GraphOperation;",
        "Lcom/zykj/sketch/core/listener/AudioOperation;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "acceptTouchEvent",
        "",
        "isLoading",
        "isReady",
        "mDrawView",
        "Lcom/zykj/sketch/widgets/TextureDrawView;",
        "mTempDrawView",
        "Lcom/zykj/sketch/widgets/DrawTempView;",
        "recordControl",
        "Lcom/zykj/sketch/core/record/RecordControl;",
        "sketchConfig",
        "Lcom/zykj/sketch/core/config/SketchConfig;",
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
        "success",
        "isRecord",
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
        "onTouchEvent",
        "event",
        "Landroid/view/MotionEvent;",
        "prev",
        "reset",
        "isDelete",
        "resetMatrix",
        "save",
        "setAcceptTouchEvent",
        "setActionChangeListener",
        "listener",
        "Lcom/zykj/sketch/core/listener/ActionChangeListener;",
        "setBackgroundColor",
        "color",
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
        "setProgressListener",
        "Lcom/zykj/sketch/core/listener/ProgressListener;",
        "setSketchBackground",
        "startRecord",
        "stopRecord",
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
.end field

.field private acceptTouchEvent:Z

.field private isLoading:Z

.field private isReady:Z

.field private final mDrawView:Lcom/zykj/sketch/widgets/TextureDrawView;

.field private final mTempDrawView:Lcom/zykj/sketch/widgets/DrawTempView;

.field private recordControl:Lcom/zykj/sketch/core/record/RecordControl;

.field private sketchConfig:Lcom/zykj/sketch/core/config/SketchConfig;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/sketch/core/record/SketchRecorderView$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/sketch/core/record/SketchRecorderView$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/zykj/sketch/core/record/SketchRecorderView;->Companion:Lcom/zykj/sketch/core/record/SketchRecorderView$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
    new-instance p1, Lcom/zykj/sketch/core/record/c;

    .line 63
    .line 64
    invoke-direct {p1, p0}, Lcom/zykj/sketch/core/record/c;-><init>(Lcom/zykj/sketch/core/record/SketchRecorderView;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method private static final _init_$lambda-0(Lcom/zykj/sketch/core/record/SketchRecorderView;)V
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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

.method public static synthetic b(Lcom/zykj/sketch/core/record/SketchRecorderView;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/sketch/core/record/SketchRecorderView;->loadData$lambda-12$lambda-11(Lcom/zykj/sketch/core/record/SketchRecorderView;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public static synthetic c(Lcom/zykj/sketch/core/record/SketchRecorderView;Ljava/lang/String;Lcom/zykj/sketch/core/config/SketchConfig;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/sketch/core/record/SketchRecorderView;->initConfig$lambda-2$lambda-1(Lcom/zykj/sketch/core/record/SketchRecorderView;Ljava/lang/String;Lcom/zykj/sketch/core/config/SketchConfig;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function0;Lcom/zykj/sketch/core/record/SketchRecorderView;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/sketch/core/record/SketchRecorderView;->loadData$lambda-12$lambda-11$lambda-8(Lkotlin/jvm/functions/Function0;Lcom/zykj/sketch/core/record/SketchRecorderView;)V

    return-void
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function0;Lcom/zykj/sketch/core/record/SketchRecorderView;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/sketch/core/record/SketchRecorderView;->loadData$lambda-12$lambda-11$lambda-4(Lkotlin/jvm/functions/Function0;Lcom/zykj/sketch/core/record/SketchRecorderView;)V

    return-void
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function0;Lcom/zykj/sketch/core/record/SketchRecorderView;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/sketch/core/record/SketchRecorderView;->loadData$lambda-12$lambda-11$lambda-6(Lkotlin/jvm/functions/Function0;Lcom/zykj/sketch/core/record/SketchRecorderView;)V

    return-void
.end method

.method public static synthetic g(Lcom/zykj/sketch/core/record/SketchRecorderView;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/sketch/core/record/SketchRecorderView;->loadData$lambda-12(Lcom/zykj/sketch/core/record/SketchRecorderView;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function0;Lcom/zykj/sketch/core/record/SketchRecorderView;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/sketch/core/record/SketchRecorderView;->loadData$lambda-12$lambda-11$lambda-10(Lkotlin/jvm/functions/Function0;Lcom/zykj/sketch/core/record/SketchRecorderView;)V

    return-void
.end method

.method private static final initConfig$lambda-2$lambda-1(Lcom/zykj/sketch/core/record/SketchRecorderView;Ljava/lang/String;Lcom/zykj/sketch/core/config/SketchConfig;Lkotlin/jvm/functions/Function1;)V
    .locals 2

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$it"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$config"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "$callBack"

    .line 17
    .line 18
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-interface {p3, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-interface {p3, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method private static final loadData$lambda-12(Lcom/zykj/sketch/core/record/SketchRecorderView;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V
    .locals 2

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$path"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$finish"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Ljava/lang/Thread;

    .line 17
    .line 18
    new-instance v1, Lcom/zykj/sketch/core/record/e;

    .line 19
    .line 20
    invoke-direct {v1, p0, p1, p2, p3}, Lcom/zykj/sketch/core/record/e;-><init>(Lcom/zykj/sketch/core/record/SketchRecorderView;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method private static final loadData$lambda-12$lambda-11(Lcom/zykj/sketch/core/record/SketchRecorderView;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V
    .locals 8

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$path"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$finish"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-direct {v5, p0, p2}, Lcom/zykj/sketch/core/record/SketchRecorderView$loadData$1$1$1;-><init>(Lcom/zykj/sketch/core/record/SketchRecorderView;Lkotlin/jvm/functions/Function1;)V

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
    invoke-static/range {v2 .. v7}, Lcom/zykj/sketch/core/record/RecordControl;->loadData$default(Lcom/zykj/sketch/core/record/RecordControl;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
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
    new-instance p1, Lcom/zykj/sketch/core/record/i;

    .line 34
    .line 35
    invoke-direct {p1, p3, p0}, Lcom/zykj/sketch/core/record/i;-><init>(Lkotlin/jvm/functions/Function0;Lcom/zykj/sketch/core/record/SketchRecorderView;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 39
    .line 40
    .line 41
    iput-boolean v1, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->isReady:Z

    .line 42
    .line 43
    iput-boolean v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->isLoading:Z

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catch_1
    new-instance p1, Lcom/zykj/sketch/core/record/h;

    .line 47
    .line 48
    invoke-direct {p1, p3, p0}, Lcom/zykj/sketch/core/record/h;-><init>(Lkotlin/jvm/functions/Function0;Lcom/zykj/sketch/core/record/SketchRecorderView;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 52
    .line 53
    .line 54
    iput-boolean v1, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->isReady:Z

    .line 55
    .line 56
    iput-boolean v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->isLoading:Z

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catch_2
    new-instance p1, Lcom/zykj/sketch/core/record/g;

    .line 60
    .line 61
    invoke-direct {p1, p3, p0}, Lcom/zykj/sketch/core/record/g;-><init>(Lkotlin/jvm/functions/Function0;Lcom/zykj/sketch/core/record/SketchRecorderView;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 65
    .line 66
    .line 67
    iput-boolean v1, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->isReady:Z

    .line 68
    .line 69
    iput-boolean v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->isLoading:Z

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :catch_3
    new-instance p1, Lcom/zykj/sketch/core/record/f;

    .line 73
    .line 74
    invoke-direct {p1, p3, p0}, Lcom/zykj/sketch/core/record/f;-><init>(Lkotlin/jvm/functions/Function0;Lcom/zykj/sketch/core/record/SketchRecorderView;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 78
    .line 79
    .line 80
    iput-boolean v1, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->isReady:Z

    .line 81
    .line 82
    iput-boolean v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->isLoading:Z

    .line 83
    .line 84
    :goto_0
    return-void
.end method

.method private static final loadData$lambda-12$lambda-11$lambda-10(Lkotlin/jvm/functions/Function0;Lcom/zykj/sketch/core/record/SketchRecorderView;)V
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

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

.method private static final loadData$lambda-12$lambda-11$lambda-4(Lkotlin/jvm/functions/Function0;Lcom/zykj/sketch/core/record/SketchRecorderView;)V
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

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

.method private static final loadData$lambda-12$lambda-11$lambda-6(Lkotlin/jvm/functions/Function0;Lcom/zykj/sketch/core/record/SketchRecorderView;)V
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

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

.method private static final loadData$lambda-12$lambda-11$lambda-8(Lkotlin/jvm/functions/Function0;Lcom/zykj/sketch/core/record/SketchRecorderView;)V
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

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

.method public addImage(Landroid/graphics/Bitmap;IILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 12
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

    const-string v0, "bitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageCallBack"

    move-object/from16 v7, p4

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pathCallBack"

    move-object/from16 v9, p5

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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

    invoke-static/range {v1 .. v11}, Lcom/zykj/sketch/core/record/RecordControl;->addAdapterImage$default(Lcom/zykj/sketch/core/record/RecordControl;Landroid/graphics/Bitmap;IIIILkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void
.end method

.method public addImage(Landroid/graphics/Bitmap;Ljava/lang/String;IILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 10
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

    const-string v0, "bitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageCallBack"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pathCallBack"

    move-object/from16 v9, p6

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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

    invoke-virtual/range {v1 .. v9}, Lcom/zykj/sketch/core/record/RecordControl;->addAdapterImage(Landroid/graphics/Bitmap;IIIILkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public addImage(Ljava/lang/String;IILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 12
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

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageCallBack"

    move-object/from16 v7, p4

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pathCallBack"

    move-object/from16 v9, p5

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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

    invoke-static/range {v1 .. v11}, Lcom/zykj/sketch/core/record/RecordControl;->addAdapterImage$default(Lcom/zykj/sketch/core/record/RecordControl;Ljava/lang/String;IIIILkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void
.end method

.method public addImage(Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 10
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

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageCallBack"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pathCallBack"

    move-object/from16 v9, p6

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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

    invoke-virtual/range {v1 .. v9}, Lcom/zykj/sketch/core/record/RecordControl;->addAdapterImage(Ljava/lang/String;IIIILkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public addPPT(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 8
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

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callBack"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-virtual/range {v1 .. v7}, Lcom/zykj/sketch/core/record/RecordControl;->addAdapterPPT(Ljava/lang/String;IIIILkotlin/jvm/functions/Function1;)V

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

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->sketchConfig:Lcom/zykj/sketch/core/config/SketchConfig;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDrawArea()Landroid/graphics/RectF;
    .locals 1

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

.method public getRecordPath(Lkotlin/jvm/functions/Function1;)V
    .locals 4
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

    .line 1
    const-string v0, "callBack"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-direct {v3, p1}, Lcom/zykj/sketch/core/record/SketchRecorderView$getRecordPath$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1, v2, v3}, Lcom/zykj/sketch/core/record/RecordControl;->getRecordPath(IILkotlin/jvm/functions/Function1;)V

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

.method public initConfig(Lcom/zykj/sketch/core/config/SketchConfig;ZLkotlin/jvm/functions/Function1;)V
    .locals 2
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

    .line 1
    const-string v0, "config"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callBack"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    move-result-object p2

    .line 68
    new-instance v0, Ljava/io/File;

    .line 69
    .line 70
    invoke-direct {v0, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-nez v1, :cond_0

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-nez v0, :cond_0

    .line 84
    .line 85
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 86
    .line 87
    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_0
    new-instance v0, Ljava/lang/Thread;

    .line 92
    .line 93
    new-instance v1, Lcom/zykj/sketch/core/record/j;

    .line 94
    .line 95
    invoke-direct {v1, p0, p2, p1, p3}, Lcom/zykj/sketch/core/record/j;-><init>(Lcom/zykj/sketch/core/record/SketchRecorderView;Ljava/lang/String;Lcom/zykj/sketch/core/config/SketchConfig;Lkotlin/jvm/functions/Function1;)V

    .line 96
    .line 97
    .line 98
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_1
    iget-object p2, p0, Lcom/zykj/sketch/core/record/SketchRecorderView;->sketchConfig:Lcom/zykj/sketch/core/config/SketchConfig;

    .line 106
    .line 107
    invoke-virtual {p1}, Lcom/zykj/sketch/core/config/SketchConfig;->getSourcePath()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-virtual {p2, p1}, Lcom/zykj/sketch/core/config/SketchConfig;->setSourcePath(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 115
    .line 116
    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
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

.method public loadData(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V
    .locals 1
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
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callBack"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p2, "finish"

    .line 12
    .line 13
    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
    new-instance p2, Lcom/zykj/sketch/core/record/d;

    .line 27
    .line 28
    invoke-direct {p2, p0, p1, p3, p4}, Lcom/zykj/sketch/core/record/d;-><init>(Lcom/zykj/sketch/core/record/SketchRecorderView;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 32
    .line 33
    .line 34
    :cond_0
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
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-static/range {v0 .. v5}, Lcom/zykj/sketch/core/record/RecordControl;->getRecordPath$default(Lcom/zykj/sketch/core/record/RecordControl;IILkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

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

    .line 1
    const-string v0, "rectF"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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

    .line 1
    const-string v0, "config"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

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

    .line 1
    const-string v0, "mode"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
