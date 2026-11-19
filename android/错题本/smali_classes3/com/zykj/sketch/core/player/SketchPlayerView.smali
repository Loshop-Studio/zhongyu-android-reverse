.class public final Lcom/zykj/sketch/core/player/SketchPlayerView;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/sketch/core/listener/IUserPlay;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/sketch/core/player/SketchPlayerView$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J]\u0010\u0015\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u000c\u00a2\u0006\u000c\u0008\r\u0012\u0008\u0008\u000e\u0012\u0004\u0008\u0008(\u000f\u0012\u0004\u0012\u00020\u00100\u000b2!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0012\u00a2\u0006\u000c\u0008\r\u0012\u0008\u0008\u000e\u0012\u0004\u0008\u0008(\u0013\u0012\u0004\u0012\u00020\u00100\u000bH\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u0018J]\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u000c2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u000c\u00a2\u0006\u000c\u0008\r\u0012\u0008\u0008\u000e\u0012\u0004\u0008\u0008(\u000f\u0012\u0004\u0012\u00020\u00100\u000b2!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0012\u00a2\u0006\u000c\u0008\r\u0012\u0008\u0008\u000e\u0012\u0004\u0008\u0008(\u0013\u0012\u0004\u0012\u00020\u00100\u000bH\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!H\u0016\u00a2\u0006\u0004\u0008#\u0010$J\u0017\u0010%\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!H\u0016\u00a2\u0006\u0004\u0008%\u0010$J\u0017\u0010\'\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u000cH\u0014\u00a2\u0006\u0004\u0008\'\u0010(J\u000f\u0010)\u001a\u00020\u0010H\u0014\u00a2\u0006\u0004\u0008)\u0010\u0018J\u000f\u0010*\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008*\u0010\u0018J\u0015\u0010,\u001a\u00020\u00102\u0006\u0010,\u001a\u00020+\u00a2\u0006\u0004\u0008,\u0010-J\u0017\u00100\u001a\u00020\u00102\u0006\u0010/\u001a\u00020.H\u0002\u00a2\u0006\u0004\u00080\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00083\u00104R\u0016\u00106\u001a\u0002058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00086\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00089\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008<\u0010=R\u0016\u0010>\u001a\u00020+8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008>\u0010?R#\u0010F\u001a\n A*\u0004\u0018\u00010@0@8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008B\u0010C\u001a\u0004\u0008D\u0010ER#\u0010I\u001a\n A*\u0004\u0018\u00010@0@8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008G\u0010C\u001a\u0004\u0008H\u0010E\u00a8\u0006J"
    }
    d2 = {
        "Lcom/zykj/sketch/core/player/SketchPlayerView;",
        "Landroid/widget/RelativeLayout;",
        "Lcom/zykj/sketch/core/listener/IUserPlay;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "path",
        "Lkotlin/Function1;",
        "",
        "Lkotlin/ParameterName;",
        "name",
        "duration",
        "Ld6/s;",
        "onSuccess",
        "",
        "throwable",
        "onFailure",
        "loadData",
        "(Ljava/lang/String;Lr6/c;Lr6/c;)V",
        "start",
        "()V",
        "pause",
        "waiting",
        "position",
        "seekTo",
        "(ILr6/c;Lr6/c;)V",
        "Lcom/zykj/sketch/core/data/PlayStatus;",
        "getPlayStatus",
        "()Lcom/zykj/sketch/core/data/PlayStatus;",
        "Lcom/zykj/sketch/core/listener/PlayActionListener;",
        "listener",
        "addPlayActionListener",
        "(Lcom/zykj/sketch/core/listener/PlayActionListener;)V",
        "removePlayActionListener",
        "visibility",
        "onWindowVisibilityChanged",
        "(I)V",
        "onDetachedFromWindow",
        "destroy",
        "",
        "isRend",
        "(Z)V",
        "Ljava/lang/Runnable;",
        "runnable",
        "runAtLeastCreated",
        "(Ljava/lang/Runnable;)V",
        "Lcom/zykj/sketch/core/player/PlayControl;",
        "playControl",
        "Lcom/zykj/sketch/core/player/PlayControl;",
        "Lcom/zykj/sketch/core/config/SketchConfig;",
        "sketchConfig",
        "Lcom/zykj/sketch/core/config/SketchConfig;",
        "Lcom/zykj/sketch/widgets/DrawTempView;",
        "drawTempView",
        "Lcom/zykj/sketch/widgets/DrawTempView;",
        "Lcom/zykj/sketch/widgets/TextureDrawView;",
        "drawView",
        "Lcom/zykj/sketch/widgets/TextureDrawView;",
        "isRun",
        "Z",
        "Ljava/util/concurrent/ExecutorService;",
        "kotlin.jvm.PlatformType",
        "loadDataExecutor$delegate",
        "Ld6/e;",
        "getLoadDataExecutor",
        "()Ljava/util/concurrent/ExecutorService;",
        "loadDataExecutor",
        "seekExecutor$delegate",
        "getSeekExecutor",
        "seekExecutor",
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

.field private final drawTempView:Lcom/zykj/sketch/widgets/DrawTempView;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final drawView:Lcom/zykj/sketch/widgets/TextureDrawView;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private volatile isRun:Z

.field private final loadDataExecutor$delegate:Ld6/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final playControl:Lcom/zykj/sketch/core/player/PlayControl;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final seekExecutor$delegate:Ld6/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private sketchConfig:Lcom/zykj/sketch/core/config/SketchConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2
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
    iput-object v0, p0, Lcom/zykj/sketch/core/player/SketchPlayerView;->_$_findViewCache:Ljava/util/Map;

    .line 12
    .line 13
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lcom/zykj/sketch/core/config/SketchConfig$Builder;

    .line 17
    .line 18
    invoke-direct {v0}, Lcom/zykj/sketch/core/config/SketchConfig$Builder;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/core/config/SketchConfig$Builder;->build(Landroid/content/Context;)Lcom/zykj/sketch/core/config/SketchConfig;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Lcom/zykj/sketch/core/player/SketchPlayerView;->sketchConfig:Lcom/zykj/sketch/core/config/SketchConfig;

    .line 26
    .line 27
    new-instance v0, Lcom/zykj/sketch/widgets/DrawTempView;

    .line 28
    .line 29
    invoke-direct {v0, p1, p2}, Lcom/zykj/sketch/widgets/DrawTempView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lcom/zykj/sketch/core/player/SketchPlayerView;->drawTempView:Lcom/zykj/sketch/widgets/DrawTempView;

    .line 33
    .line 34
    new-instance v1, Lcom/zykj/sketch/widgets/TextureDrawView;

    .line 35
    .line 36
    invoke-direct {v1, p1, p2}, Lcom/zykj/sketch/widgets/TextureDrawView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 37
    .line 38
    .line 39
    iput-object v1, p0, Lcom/zykj/sketch/core/player/SketchPlayerView;->drawView:Lcom/zykj/sketch/widgets/TextureDrawView;

    .line 40
    .line 41
    const/4 p1, 0x1

    .line 42
    invoke-virtual {p0, p1}, Landroid/view/View;->setKeepScreenOn(Z)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 49
    .line 50
    .line 51
    new-instance p1, Lcom/zykj/sketch/core/player/PlayControl;

    .line 52
    .line 53
    iget-object p2, p0, Lcom/zykj/sketch/core/player/SketchPlayerView;->sketchConfig:Lcom/zykj/sketch/core/config/SketchConfig;

    .line 54
    .line 55
    invoke-direct {p1, p0, p2, v1, v0}, Lcom/zykj/sketch/core/player/PlayControl;-><init>(Landroid/view/ViewGroup;Lcom/zykj/sketch/core/config/SketchConfig;Lcom/zykj/sketch/core/listener/RealDraw;Lcom/zykj/sketch/core/listener/ImitateDraw;)V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, Lcom/zykj/sketch/core/player/SketchPlayerView;->playControl:Lcom/zykj/sketch/core/player/PlayControl;

    .line 59
    .line 60
    sget-object p1, Lcom/zykj/sketch/core/player/SketchPlayerView$loadDataExecutor$2;->INSTANCE:Lcom/zykj/sketch/core/player/SketchPlayerView$loadDataExecutor$2;

    .line 61
    .line 62
    invoke-static {p1}, Lkotlin/a;->b(Lr6/a;)Ld6/e;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iput-object p1, p0, Lcom/zykj/sketch/core/player/SketchPlayerView;->loadDataExecutor$delegate:Ld6/e;

    .line 67
    .line 68
    sget-object p1, Lcom/zykj/sketch/core/player/SketchPlayerView$seekExecutor$2;->INSTANCE:Lcom/zykj/sketch/core/player/SketchPlayerView$seekExecutor$2;

    .line 69
    .line 70
    invoke-static {p1}, Lkotlin/a;->b(Lr6/a;)Ld6/e;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    iput-object p1, p0, Lcom/zykj/sketch/core/player/SketchPlayerView;->seekExecutor$delegate:Ld6/e;

    .line 75
    .line 76
    return-void
.end method

.method public static synthetic a(Lcom/zykj/sketch/core/player/SketchPlayerView;Lr6/c;Ljava/io/IOException;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/sketch/core/player/SketchPlayerView;->loadData$lambda-13$lambda-12$lambda-11(Lcom/zykj/sketch/core/player/SketchPlayerView;Lr6/c;Ljava/io/IOException;)V

    return-void
.end method

.method public static final synthetic access$runAtLeastCreated(Lcom/zykj/sketch/core/player/SketchPlayerView;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/sketch/core/player/SketchPlayerView;->runAtLeastCreated(Ljava/lang/Runnable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Lr6/c;Lcom/zykj/sketch/exception/LowVersionException;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/sketch/core/player/SketchPlayerView;->loadData$lambda-13$lambda-12$lambda-2$lambda-0(Lr6/c;Lcom/zykj/sketch/exception/LowVersionException;)V

    return-void
.end method

.method public static synthetic c(Lr6/c;Ljava/io/FileNotFoundException;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/sketch/core/player/SketchPlayerView;->loadData$lambda-13$lambda-12$lambda-8$lambda-6(Lr6/c;Ljava/io/FileNotFoundException;)V

    return-void
.end method

.method public static synthetic d(Lr6/c;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/sketch/core/player/SketchPlayerView;->seekTo$lambda-22$lambda-21$lambda-20$lambda-19(Lr6/c;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic e(Lr6/c;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/sketch/core/player/SketchPlayerView;->seekTo$lambda-22$lambda-18$lambda-17$lambda-16(Lr6/c;I)V

    return-void
.end method

.method public static synthetic f(Lcom/zykj/sketch/core/player/SketchPlayerView;Lr6/c;Ljava/io/FileNotFoundException;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/sketch/core/player/SketchPlayerView;->loadData$lambda-13$lambda-12$lambda-8(Lcom/zykj/sketch/core/player/SketchPlayerView;Lr6/c;Ljava/io/FileNotFoundException;)V

    return-void
.end method

.method public static synthetic g(Lr6/c;Lcom/zykj/sketch/exception/HighVersionException;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/sketch/core/player/SketchPlayerView;->loadData$lambda-13$lambda-12$lambda-5$lambda-3(Lr6/c;Lcom/zykj/sketch/exception/HighVersionException;)V

    return-void
.end method

.method private final getLoadDataExecutor()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/player/SketchPlayerView;->loadDataExecutor$delegate:Ld6/e;

    .line 2
    .line 3
    invoke-interface {v0}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/concurrent/ExecutorService;

    .line 8
    .line 9
    return-object v0
.end method

.method private final getSeekExecutor()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/player/SketchPlayerView;->seekExecutor$delegate:Ld6/e;

    .line 2
    .line 3
    invoke-interface {v0}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/concurrent/ExecutorService;

    .line 8
    .line 9
    return-object v0
.end method

.method public static synthetic h(Lr6/c;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/sketch/core/player/SketchPlayerView;->loadData$lambda-14(Lr6/c;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic i(Lcom/zykj/sketch/core/player/SketchPlayerView;Lr6/c;Lcom/zykj/sketch/exception/LowVersionException;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/sketch/core/player/SketchPlayerView;->loadData$lambda-13$lambda-12$lambda-2(Lcom/zykj/sketch/core/player/SketchPlayerView;Lr6/c;Lcom/zykj/sketch/exception/LowVersionException;)V

    return-void
.end method

.method public static synthetic j(Lcom/zykj/sketch/core/player/SketchPlayerView;Lr6/c;Lcom/zykj/sketch/exception/HighVersionException;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/sketch/core/player/SketchPlayerView;->loadData$lambda-13$lambda-12$lambda-5(Lcom/zykj/sketch/core/player/SketchPlayerView;Lr6/c;Lcom/zykj/sketch/exception/HighVersionException;)V

    return-void
.end method

.method public static synthetic k(Lcom/zykj/sketch/core/player/SketchPlayerView;Ljava/lang/String;Lr6/c;Lr6/c;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/sketch/core/player/SketchPlayerView;->loadData$lambda-13(Lcom/zykj/sketch/core/player/SketchPlayerView;Ljava/lang/String;Lr6/c;Lr6/c;)V

    return-void
.end method

.method public static synthetic l(Lr6/c;Ljava/io/IOException;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/sketch/core/player/SketchPlayerView;->loadData$lambda-13$lambda-12$lambda-11$lambda-9(Lr6/c;Ljava/io/IOException;)V

    return-void
.end method

.method private static final loadData$lambda-13(Lcom/zykj/sketch/core/player/SketchPlayerView;Ljava/lang/String;Lr6/c;Lr6/c;)V
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
    const-string v0, "$onSuccess"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "$onFailure"

    .line 17
    .line 18
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Lcom/zykj/sketch/core/player/SketchPlayerView;->getLoadDataExecutor()Ljava/util/concurrent/ExecutorService;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-instance v1, Lcom/zykj/sketch/core/player/c;

    .line 26
    .line 27
    const/4 v6, 0x1

    .line 28
    move-object v2, p0

    .line 29
    move-object v3, p1

    .line 30
    move-object v4, p2

    .line 31
    move-object v5, p3

    .line 32
    invoke-direct/range {v1 .. v6}, Lcom/zykj/sketch/core/player/c;-><init>(Lcom/zykj/sketch/core/player/SketchPlayerView;Ljava/lang/String;Lr6/c;Lr6/c;I)V

    .line 33
    .line 34
    .line 35
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method private static final loadData$lambda-13$lambda-12(Lcom/zykj/sketch/core/player/SketchPlayerView;Ljava/lang/String;Lr6/c;Lr6/c;)V
    .locals 2

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
    const-string v0, "$onSuccess"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "$onFailure"

    .line 17
    .line 18
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :try_start_0
    iget-object v0, p0, Lcom/zykj/sketch/core/player/SketchPlayerView;->playControl:Lcom/zykj/sketch/core/player/PlayControl;

    .line 22
    .line 23
    new-instance v1, Lcom/zykj/sketch/core/player/SketchPlayerView$loadData$1$1$1;

    .line 24
    .line 25
    invoke-direct {v1, p0, p2}, Lcom/zykj/sketch/core/player/SketchPlayerView$loadData$1$1$1;-><init>(Lcom/zykj/sketch/core/player/SketchPlayerView;Lr6/c;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p1, v1}, Lcom/zykj/sketch/core/player/PlayControl;->loadData(Ljava/lang/String;Lr6/c;)V
    :try_end_0
    .catch Lcom/zykj/sketch/exception/LowVersionException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lcom/zykj/sketch/exception/HighVersionException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :catch_0
    move-exception p1

    .line 33
    goto :goto_0

    .line 34
    :catch_1
    move-exception p1

    .line 35
    goto :goto_1

    .line 36
    :catch_2
    move-exception p1

    .line 37
    goto :goto_2

    .line 38
    :catch_3
    move-exception p1

    .line 39
    goto :goto_3

    .line 40
    :goto_0
    new-instance p2, La5/h;

    .line 41
    .line 42
    const/16 v0, 0xe

    .line 43
    .line 44
    invoke-direct {p2, p0, p3, v0, p1}, La5/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 48
    .line 49
    .line 50
    goto :goto_4

    .line 51
    :goto_1
    new-instance p2, La5/h;

    .line 52
    .line 53
    const/16 v0, 0xd

    .line 54
    .line 55
    invoke-direct {p2, p0, p3, v0, p1}, La5/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_4

    .line 62
    :goto_2
    new-instance p2, La5/h;

    .line 63
    .line 64
    const/16 v0, 0xc

    .line 65
    .line 66
    invoke-direct {p2, p0, p3, v0, p1}, La5/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 70
    .line 71
    .line 72
    goto :goto_4

    .line 73
    :goto_3
    new-instance p2, La5/h;

    .line 74
    .line 75
    const/16 v0, 0xb

    .line 76
    .line 77
    invoke-direct {p2, p0, p3, v0, p1}, La5/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 81
    .line 82
    .line 83
    :goto_4
    return-void
.end method

.method private static final loadData$lambda-13$lambda-12$lambda-11(Lcom/zykj/sketch/core/player/SketchPlayerView;Lr6/c;Ljava/io/IOException;)V
    .locals 2

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$onFailure"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$e"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Landroidx/camera/core/impl/utils/a;

    .line 17
    .line 18
    const/16 v1, 0xf

    .line 19
    .line 20
    invoke-direct {v0, v1, p1, p2}, Landroidx/camera/core/impl/utils/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, v0}, Lcom/zykj/sketch/core/player/SketchPlayerView;->runAtLeastCreated(Ljava/lang/Runnable;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    if-eqz p0, :cond_0

    .line 31
    .line 32
    sget p1, Lcom/zykj/sketch/R$string;->tips_audio_file_corrupted:I

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const/4 p2, 0x0

    .line 39
    invoke-static {p0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 44
    .line 45
    .line 46
    :cond_0
    return-void
.end method

.method private static final loadData$lambda-13$lambda-12$lambda-11$lambda-9(Lr6/c;Ljava/io/IOException;)V
    .locals 1

    .line 1
    const-string v0, "$onFailure"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$e"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private static final loadData$lambda-13$lambda-12$lambda-2(Lcom/zykj/sketch/core/player/SketchPlayerView;Lr6/c;Lcom/zykj/sketch/exception/LowVersionException;)V
    .locals 2

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$onFailure"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$e"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Landroidx/camera/core/impl/utils/a;

    .line 17
    .line 18
    const/16 v1, 0x11

    .line 19
    .line 20
    invoke-direct {v0, v1, p1, p2}, Landroidx/camera/core/impl/utils/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, v0}, Lcom/zykj/sketch/core/player/SketchPlayerView;->runAtLeastCreated(Ljava/lang/Runnable;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    if-eqz p0, :cond_0

    .line 31
    .line 32
    sget p1, Lcom/zykj/sketch/R$string;->tips_low_version:I

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const/4 p2, 0x0

    .line 39
    invoke-static {p0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 44
    .line 45
    .line 46
    :cond_0
    return-void
.end method

.method private static final loadData$lambda-13$lambda-12$lambda-2$lambda-0(Lr6/c;Lcom/zykj/sketch/exception/LowVersionException;)V
    .locals 1

    .line 1
    const-string v0, "$onFailure"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$e"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private static final loadData$lambda-13$lambda-12$lambda-5(Lcom/zykj/sketch/core/player/SketchPlayerView;Lr6/c;Lcom/zykj/sketch/exception/HighVersionException;)V
    .locals 2

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$onFailure"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$e"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Landroidx/camera/core/impl/utils/a;

    .line 17
    .line 18
    const/16 v1, 0xe

    .line 19
    .line 20
    invoke-direct {v0, v1, p1, p2}, Landroidx/camera/core/impl/utils/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, v0}, Lcom/zykj/sketch/core/player/SketchPlayerView;->runAtLeastCreated(Ljava/lang/Runnable;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    if-eqz p0, :cond_0

    .line 31
    .line 32
    sget p1, Lcom/zykj/sketch/R$string;->tips_height_version:I

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const/4 p2, 0x0

    .line 39
    invoke-static {p0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 44
    .line 45
    .line 46
    :cond_0
    return-void
.end method

.method private static final loadData$lambda-13$lambda-12$lambda-5$lambda-3(Lr6/c;Lcom/zykj/sketch/exception/HighVersionException;)V
    .locals 1

    .line 1
    const-string v0, "$onFailure"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$e"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private static final loadData$lambda-13$lambda-12$lambda-8(Lcom/zykj/sketch/core/player/SketchPlayerView;Lr6/c;Ljava/io/FileNotFoundException;)V
    .locals 2

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$onFailure"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$e"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Landroidx/camera/core/impl/utils/a;

    .line 17
    .line 18
    const/16 v1, 0xd

    .line 19
    .line 20
    invoke-direct {v0, v1, p1, p2}, Landroidx/camera/core/impl/utils/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, v0}, Lcom/zykj/sketch/core/player/SketchPlayerView;->runAtLeastCreated(Ljava/lang/Runnable;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    if-eqz p0, :cond_0

    .line 31
    .line 32
    sget p1, Lcom/zykj/sketch/R$string;->tips_file_corrupted:I

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const/4 p2, 0x0

    .line 39
    invoke-static {p0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 44
    .line 45
    .line 46
    :cond_0
    return-void
.end method

.method private static final loadData$lambda-13$lambda-12$lambda-8$lambda-6(Lr6/c;Ljava/io/FileNotFoundException;)V
    .locals 1

    .line 1
    const-string v0, "$onFailure"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$e"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private static final loadData$lambda-14(Lr6/c;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "$onFailure"

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
    new-instance v0, Ljava/io/FileNotFoundException;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p0, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static synthetic m(Lcom/zykj/sketch/core/player/SketchPlayerView;ILr6/c;Lr6/c;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/sketch/core/player/SketchPlayerView;->seekTo$lambda-22(Lcom/zykj/sketch/core/player/SketchPlayerView;ILr6/c;Lr6/c;)V

    return-void
.end method

.method public static synthetic n(Lcom/zykj/sketch/core/player/SketchPlayerView;Lr6/c;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/sketch/core/player/SketchPlayerView;->seekTo$lambda-22$lambda-18$lambda-17(Lcom/zykj/sketch/core/player/SketchPlayerView;Lr6/c;I)V

    return-void
.end method

.method public static synthetic o(Lcom/zykj/sketch/core/player/SketchPlayerView;Lr6/c;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/sketch/core/player/SketchPlayerView;->seekTo$lambda-22$lambda-21$lambda-20(Lcom/zykj/sketch/core/player/SketchPlayerView;Lr6/c;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic p(Lcom/zykj/sketch/core/player/SketchPlayerView;Ljava/lang/String;Lr6/c;Lr6/c;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/sketch/core/player/SketchPlayerView;->loadData$lambda-13$lambda-12(Lcom/zykj/sketch/core/player/SketchPlayerView;Ljava/lang/String;Lr6/c;Lr6/c;)V

    return-void
.end method

.method private final runAtLeastCreated(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewKt;->findViewTreeLifecycleOwner(Landroid/view/View;)Landroidx/lifecycle/LifecycleOwner;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Landroidx/lifecycle/LifecycleOwner;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/lifecycle/Lifecycle;->getCurrentState()Landroidx/lifecycle/Lifecycle$State;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    sget-object v1, Landroidx/lifecycle/Lifecycle$State;->CREATED:Landroidx/lifecycle/Lifecycle$State;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroidx/lifecycle/Lifecycle$State;->isAtLeast(Landroidx/lifecycle/Lifecycle$State;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x1

    .line 26
    if-ne v0, v1, :cond_0

    .line 27
    .line 28
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method private static final seekTo$lambda-22(Lcom/zykj/sketch/core/player/SketchPlayerView;ILr6/c;Lr6/c;)V
    .locals 3

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$onSuccess"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$onFailure"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    iput-boolean v0, p0, Lcom/zykj/sketch/core/player/SketchPlayerView;->isRun:Z

    .line 18
    .line 19
    :try_start_0
    iget-object v0, p0, Lcom/zykj/sketch/core/player/SketchPlayerView;->playControl:Lcom/zykj/sketch/core/player/PlayControl;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/core/player/PlayControl;->seekTo(I)V

    .line 22
    .line 23
    .line 24
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 25
    .line 26
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    :goto_0
    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    move-object v1, v0

    .line 47
    check-cast v1, Ld6/s;

    .line 48
    .line 49
    new-instance v1, Lcom/zykj/sketch/core/player/e;

    .line 50
    .line 51
    const/4 v2, 0x1

    .line 52
    invoke-direct {v1, p0, p2, p1, v2}, Lcom/zykj/sketch/core/player/e;-><init>(Lcom/zykj/sketch/core/player/SketchPlayerView;Lr6/c;II)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 56
    .line 57
    .line 58
    :cond_0
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-eqz p1, :cond_1

    .line 63
    .line 64
    new-instance p2, La5/h;

    .line 65
    .line 66
    const/16 v0, 0xa

    .line 67
    .line 68
    invoke-direct {p2, p0, p3, v0, p1}, La5/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 72
    .line 73
    .line 74
    :cond_1
    const/4 p1, 0x0

    .line 75
    iput-boolean p1, p0, Lcom/zykj/sketch/core/player/SketchPlayerView;->isRun:Z

    .line 76
    .line 77
    return-void
.end method

.method private static final seekTo$lambda-22$lambda-18$lambda-17(Lcom/zykj/sketch/core/player/SketchPlayerView;Lr6/c;I)V
    .locals 2

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$onSuccess"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/zykj/sketch/core/player/d;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-direct {v0, p2, v1, p1}, Lcom/zykj/sketch/core/player/d;-><init>(IILr6/c;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v0}, Lcom/zykj/sketch/core/player/SketchPlayerView;->runAtLeastCreated(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private static final seekTo$lambda-22$lambda-18$lambda-17$lambda-16(Lr6/c;I)V
    .locals 1

    .line 1
    const-string v0, "$onSuccess"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {p0, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private static final seekTo$lambda-22$lambda-21$lambda-20(Lcom/zykj/sketch/core/player/SketchPlayerView;Lr6/c;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$onFailure"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$it"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Landroidx/camera/core/impl/utils/a;

    .line 17
    .line 18
    const/16 v1, 0x12

    .line 19
    .line 20
    invoke-direct {v0, v1, p1, p2}, Landroidx/camera/core/impl/utils/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, v0}, Lcom/zykj/sketch/core/player/SketchPlayerView;->runAtLeastCreated(Ljava/lang/Runnable;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method private static final seekTo$lambda-22$lambda-21$lambda-20$lambda-19(Lr6/c;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    const-string v0, "$onFailure"

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
    invoke-interface {p0, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/zykj/sketch/core/player/SketchPlayerView;->_$_findViewCache:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/zykj/sketch/core/player/SketchPlayerView;->_$_findViewCache:Ljava/util/Map;

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

.method public addPlayActionListener(Lcom/zykj/sketch/core/listener/PlayActionListener;)V
    .locals 1
    .param p1    # Lcom/zykj/sketch/core/listener/PlayActionListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/sketch/core/player/SketchPlayerView;->playControl:Lcom/zykj/sketch/core/player/PlayControl;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/core/player/PlayControl;->addPlayActionListener(Lcom/zykj/sketch/core/listener/PlayActionListener;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public destroy()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/player/SketchPlayerView;->drawView:Lcom/zykj/sketch/widgets/TextureDrawView;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/sketch/widgets/TextureDrawView;->shutdown()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/sketch/core/player/SketchPlayerView;->playControl:Lcom/zykj/sketch/core/player/PlayControl;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/sketch/core/player/PlayControl;->onDestroy()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public getPlayStatus()Lcom/zykj/sketch/core/data/PlayStatus;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/player/SketchPlayerView;->playControl:Lcom/zykj/sketch/core/player/PlayControl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/sketch/core/player/PlayControl;->getPlayStatus()Lcom/zykj/sketch/core/data/PlayStatus;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final isRend(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/player/SketchPlayerView;->drawView:Lcom/zykj/sketch/widgets/TextureDrawView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/widgets/TextureDrawView;->isRend(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public loadData(Ljava/lang/String;Lr6/c;Lr6/c;)V
    .locals 7
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
            Ljava/lang/Exception;
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
    const-string v0, "onSuccess"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onFailure"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Ljava/io/File;

    .line 17
    .line 18
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    new-instance v1, Lcom/zykj/sketch/core/player/c;

    .line 28
    .line 29
    const/4 v6, 0x0

    .line 30
    move-object v2, p0

    .line 31
    move-object v3, p1

    .line 32
    move-object v4, p2

    .line 33
    move-object v5, p3

    .line 34
    invoke-direct/range {v1 .. v6}, Lcom/zykj/sketch/core/player/c;-><init>(Lcom/zykj/sketch/core/player/SketchPlayerView;Ljava/lang/String;Lr6/c;Lr6/c;I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    move-object v2, p0

    .line 42
    move-object v3, p1

    .line 43
    move-object v5, p3

    .line 44
    new-instance p1, Landroidx/camera/core/impl/utils/a;

    .line 45
    .line 46
    const/16 p2, 0x10

    .line 47
    .line 48
    invoke-direct {p1, p2, v5, v3}, Landroidx/camera/core/impl/utils/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-direct {p0, p1}, Lcom/zykj/sketch/core/player/SketchPlayerView;->runAtLeastCreated(Ljava/lang/Runnable;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/sketch/core/player/SketchPlayerView;->drawView:Lcom/zykj/sketch/widgets/TextureDrawView;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/zykj/sketch/widgets/TextureDrawView;->shutdown()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/sketch/core/player/SketchPlayerView;->playControl:Lcom/zykj/sketch/core/player/PlayControl;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/zykj/sketch/core/player/PlayControl;->onDestroy()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public onWindowVisibilityChanged(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onWindowVisibilityChanged(I)V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x8

    .line 5
    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/sketch/core/player/SketchPlayerView;->pause()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public pause()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/sketch/core/player/SketchPlayerView;->isRun:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/zykj/sketch/core/player/SketchPlayerView;->playControl:Lcom/zykj/sketch/core/player/PlayControl;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/sketch/core/player/PlayControl;->pause()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public removePlayActionListener(Lcom/zykj/sketch/core/listener/PlayActionListener;)V
    .locals 1
    .param p1    # Lcom/zykj/sketch/core/listener/PlayActionListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/sketch/core/player/SketchPlayerView;->playControl:Lcom/zykj/sketch/core/player/PlayControl;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/core/player/PlayControl;->removePlayActionListener(Lcom/zykj/sketch/core/listener/PlayActionListener;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public seekTo(ILr6/c;Lr6/c;)V
    .locals 7
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
            "(I",
            "Lr6/c;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "onSuccess"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onFailure"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-boolean v0, p0, Lcom/zykj/sketch/core/player/SketchPlayerView;->isRun:Z

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-direct {p0}, Lcom/zykj/sketch/core/player/SketchPlayerView;->getSeekExecutor()Ljava/util/concurrent/ExecutorService;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Lcom/zykj/merge/sketch/view/f;

    .line 20
    .line 21
    const/4 v6, 0x2

    .line 22
    move-object v2, p0

    .line 23
    move v3, p1

    .line 24
    move-object v4, p2

    .line 25
    move-object v5, p3

    .line 26
    invoke-direct/range {v1 .. v6}, Lcom/zykj/merge/sketch/view/f;-><init>(Landroid/widget/RelativeLayout;ILr6/c;Lr6/c;I)V

    .line 27
    .line 28
    .line 29
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method public start()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/zykj/sketch/core/player/SketchPlayerView;->isRun:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/zykj/sketch/core/player/SketchPlayerView;->playControl:Lcom/zykj/sketch/core/player/PlayControl;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/sketch/core/player/PlayControl;->getPlayStatus()Lcom/zykj/sketch/core/data/PlayStatus;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, Lcom/zykj/sketch/core/player/SketchPlayerView$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    aget v0, v1, v0

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    if-eq v0, v1, :cond_4

    .line 22
    .line 23
    const/4 v1, 0x2

    .line 24
    if-eq v0, v1, :cond_3

    .line 25
    .line 26
    const/4 v1, 0x3

    .line 27
    if-eq v0, v1, :cond_2

    .line 28
    .line 29
    const/4 v1, 0x4

    .line 30
    if-eq v0, v1, :cond_1

    .line 31
    .line 32
    :goto_0
    return-void

    .line 33
    :cond_1
    iget-object v0, p0, Lcom/zykj/sketch/core/player/SketchPlayerView;->playControl:Lcom/zykj/sketch/core/player/PlayControl;

    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/zykj/sketch/core/player/PlayControl;->start()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    iget-object v0, p0, Lcom/zykj/sketch/core/player/SketchPlayerView;->playControl:Lcom/zykj/sketch/core/player/PlayControl;

    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/zykj/sketch/core/player/PlayControl;->resume()V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_3
    iget-object v0, p0, Lcom/zykj/sketch/core/player/SketchPlayerView;->playControl:Lcom/zykj/sketch/core/player/PlayControl;

    .line 46
    .line 47
    invoke-virtual {v0}, Lcom/zykj/sketch/core/player/PlayControl;->resume()V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_4
    iget-object v0, p0, Lcom/zykj/sketch/core/player/SketchPlayerView;->playControl:Lcom/zykj/sketch/core/player/PlayControl;

    .line 52
    .line 53
    invoke-virtual {v0}, Lcom/zykj/sketch/core/player/PlayControl;->resume()V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public waiting()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/zykj/sketch/core/player/SketchPlayerView;->isRun:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/zykj/sketch/utils/LogUtils;->Companion:Lcom/zykj/sketch/utils/LogUtils$Companion;

    .line 6
    .line 7
    const-string v1, "waiting \u8bbe\u7f6e\u5931\u8d25"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/utils/LogUtils$Companion;->e(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/zykj/sketch/core/player/SketchPlayerView;->playControl:Lcom/zykj/sketch/core/player/PlayControl;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/zykj/sketch/core/player/PlayControl;->waiting()V

    .line 16
    .line 17
    .line 18
    sget-object v0, Lcom/zykj/sketch/utils/LogUtils;->Companion:Lcom/zykj/sketch/utils/LogUtils$Companion;

    .line 19
    .line 20
    const-string v1, "waiting \u8bbe\u7f6e\u6210\u529f"

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/utils/LogUtils$Companion;->i(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method
