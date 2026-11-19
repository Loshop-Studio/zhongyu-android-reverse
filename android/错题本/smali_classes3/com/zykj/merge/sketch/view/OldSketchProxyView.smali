.class public final Lcom/zykj/merge/sketch/view/OldSketchProxyView;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/merge/sketch/listener/Play;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010!\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J?\u0010\u0011\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000bH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ]\u0010\"\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u000c2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u000c\u00a2\u0006\u000c\u0008\u001e\u0012\u0008\u0008\u001f\u0012\u0004\u0008\u0008( \u0012\u0004\u0012\u00020\r0\u000b2!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u000f\u00a2\u0006\u000c\u0008\u001e\u0012\u0008\u0008\u001f\u0012\u0004\u0008\u0008(!\u0012\u0004\u0012\u00020\r0\u000bH\u0016\u00a2\u0006\u0004\u0008\"\u0010#J\u000f\u0010$\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008$\u0010\u001bJ\u000f\u0010%\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008%\u0010\u001bJ\u000f\u0010\'\u001a\u00020&H\u0016\u00a2\u0006\u0004\u0008\'\u0010(J\u000f\u0010)\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008)\u0010\u001bJ\u000f\u0010*\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008*\u0010\u001bJ\u000f\u0010+\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008+\u0010\u001bJ\u0017\u0010-\u001a\u00020\r2\u0006\u0010-\u001a\u00020,H\u0016\u00a2\u0006\u0004\u0008-\u0010.J\u0017\u00101\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0016\u00a2\u0006\u0004\u00081\u00102J\u0017\u00105\u001a\u00020\r2\u0006\u00104\u001a\u000203H\u0002\u00a2\u0006\u0004\u00085\u00106J\u0017\u00107\u001a\u00020\r2\u0006\u00104\u001a\u000203H\u0002\u00a2\u0006\u0004\u00087\u00106R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00089\u0010:R\u0016\u0010;\u001a\u00020&8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008;\u0010<R\u001a\u0010>\u001a\u0008\u0012\u0004\u0012\u00020\u00150=8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008>\u0010?R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\n\u0010@R#\u0010G\u001a\n B*\u0004\u0018\u00010A0A8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008C\u0010D\u001a\u0004\u0008E\u0010FR#\u0010J\u001a\n B*\u0004\u0018\u00010A0A8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008H\u0010D\u001a\u0004\u0008I\u0010F\u00a8\u0006K"
    }
    d2 = {
        "Lcom/zykj/merge/sketch/view/OldSketchProxyView;",
        "Landroid/widget/RelativeLayout;",
        "Lcom/zykj/merge/sketch/listener/Play;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attributeSet",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "path",
        "Lkotlin/Function1;",
        "",
        "Ld6/s;",
        "onSuccess",
        "",
        "onFailure",
        "loadData",
        "(Ljava/lang/String;Lr6/c;Lr6/c;)V",
        "getPath",
        "()Ljava/lang/String;",
        "Lcom/zykj/merge/sketch/listener/PlayStatusListener;",
        "listener",
        "addPlayActionListener",
        "(Lcom/zykj/merge/sketch/listener/PlayStatusListener;)V",
        "removePlayActionListener",
        "pause",
        "()V",
        "waiting",
        "position",
        "Lkotlin/ParameterName;",
        "name",
        "progress",
        "throwable",
        "seekTo",
        "(ILr6/c;Lr6/c;)V",
        "start",
        "resume",
        "Lcom/zykj/merge/sketch/constant/PlayStatus;",
        "status",
        "()Lcom/zykj/merge/sketch/constant/PlayStatus;",
        "reset",
        "release",
        "destroy",
        "",
        "isRend",
        "(Z)V",
        "",
        "rate",
        "setRate",
        "(D)Z",
        "Ljava/lang/Runnable;",
        "runnable",
        "runAtLeastCreated",
        "(Ljava/lang/Runnable;)V",
        "runOnMainThread",
        "Lcom/zykj/paint/render/SketchViewer;",
        "sketchPlayView",
        "Lcom/zykj/paint/render/SketchViewer;",
        "playStatus",
        "Lcom/zykj/merge/sketch/constant/PlayStatus;",
        "",
        "playActionListener",
        "Ljava/util/List;",
        "Ljava/lang/String;",
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
        "merge_release"
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

.field private final loadDataExecutor$delegate:Ld6/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private path:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final playActionListener:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/merge/sketch/listener/PlayStatusListener;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private playStatus:Lcom/zykj/merge/sketch/constant/PlayStatus;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final seekExecutor$delegate:Ld6/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final sketchPlayView:Lcom/zykj/paint/render/SketchViewer;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
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
    iput-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->_$_findViewCache:Ljava/util/Map;

    .line 12
    .line 13
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lcom/zykj/paint/render/SketchViewer;

    .line 17
    .line 18
    invoke-direct {v0, p1, p2}, Lcom/zykj/paint/render/SketchViewer;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->sketchPlayView:Lcom/zykj/paint/render/SketchViewer;

    .line 22
    .line 23
    sget-object p1, Lcom/zykj/merge/sketch/constant/PlayStatus;->RECORD_END:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 24
    .line 25
    iput-object p1, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->playStatus:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 26
    .line 27
    new-instance p1, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->playActionListener:Ljava/util/List;

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 35
    .line 36
    .line 37
    new-instance p1, Lcom/zykj/merge/sketch/view/OldSketchProxyView$1;

    .line 38
    .line 39
    invoke-direct {p1, p0}, Lcom/zykj/merge/sketch/view/OldSketchProxyView$1;-><init>(Lcom/zykj/merge/sketch/view/OldSketchProxyView;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p1}, Lcom/zykj/paint/render/SketchViewer;->setPlayStatusListener(Lcom/zykj/paint/player/PlayStatusListener;)V

    .line 43
    .line 44
    .line 45
    sget-object p1, Lcom/zykj/merge/sketch/view/OldSketchProxyView$loadDataExecutor$2;->INSTANCE:Lcom/zykj/merge/sketch/view/OldSketchProxyView$loadDataExecutor$2;

    .line 46
    .line 47
    invoke-static {p1}, Lkotlin/a;->b(Lr6/a;)Ld6/e;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iput-object p1, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->loadDataExecutor$delegate:Ld6/e;

    .line 52
    .line 53
    sget-object p1, Lcom/zykj/merge/sketch/view/OldSketchProxyView$seekExecutor$2;->INSTANCE:Lcom/zykj/merge/sketch/view/OldSketchProxyView$seekExecutor$2;

    .line 54
    .line 55
    invoke-static {p1}, Lkotlin/a;->b(Lr6/a;)Ld6/e;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iput-object p1, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->seekExecutor$delegate:Ld6/e;

    .line 60
    .line 61
    return-void
.end method

.method public static synthetic a(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lr6/c;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->loadData$lambda-4$lambda-3(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lr6/c;)V

    return-void
.end method

.method public static final synthetic access$getPlayActionListener$p(Lcom/zykj/merge/sketch/view/OldSketchProxyView;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->playActionListener:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$setPlayStatus$p(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lcom/zykj/merge/sketch/constant/PlayStatus;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->playStatus:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 2
    .line 3
    return-void
.end method

.method public static synthetic b(Lr6/c;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->loadData$lambda-4$lambda-1$lambda-0(Lr6/c;)V

    return-void
.end method

.method public static synthetic c(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lr6/c;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->seekTo$lambda-9$lambda-6(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lr6/c;I)V

    return-void
.end method

.method public static synthetic d(Lr6/c;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->seekTo$lambda-9$lambda-6$lambda-5(Lr6/c;I)V

    return-void
.end method

.method public static synthetic e(Lcom/zykj/merge/sketch/view/OldSketchProxyView;ILr6/c;Lr6/c;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->seekTo$lambda-9(Lcom/zykj/merge/sketch/view/OldSketchProxyView;ILr6/c;Lr6/c;)V

    return-void
.end method

.method public static synthetic f(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lr6/c;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->loadData$lambda-4$lambda-1(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lr6/c;)V

    return-void
.end method

.method public static synthetic g(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lr6/c;)V
    .locals 0

    .line 1
    invoke-static {p1, p0}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->loadData$lambda-4$lambda-3$lambda-2(Lr6/c;Lcom/zykj/merge/sketch/view/OldSketchProxyView;)V

    return-void
.end method

.method private final getLoadDataExecutor()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->loadDataExecutor$delegate:Ld6/e;

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
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->seekExecutor$delegate:Ld6/e;

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

.method public static synthetic h(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lr6/c;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->seekTo$lambda-9$lambda-8(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lr6/c;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic i(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Ljava/lang/String;Lr6/c;Lr6/c;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->loadData$lambda-4(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Ljava/lang/String;Lr6/c;Lr6/c;)V

    return-void
.end method

.method public static synthetic j(Lr6/c;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->seekTo$lambda-9$lambda-8$lambda-7(Lr6/c;Ljava/lang/Exception;)V

    return-void
.end method

.method private static final loadData$lambda-4(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Ljava/lang/String;Lr6/c;Lr6/c;)V
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
    const-string v0, "$onFailure"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "$onSuccess"

    .line 17
    .line 18
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->path:Ljava/lang/String;

    .line 22
    .line 23
    sget-object v0, Lcom/zykj/sketch/utils/ProtoFileUtils;->Companion:Lcom/zykj/sketch/utils/ProtoFileUtils$Companion;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/utils/ProtoFileUtils$Companion;->readProtoFile(Ljava/lang/String;)[B

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Lcom/zykj/paint/Actions$EzyActionList;->parseFrom([B)Lcom/zykj/paint/Actions$EzyActionList;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$EzyActionList;->getActionList()Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    new-instance p1, Lcom/zykj/merge/sketch/view/e;

    .line 44
    .line 45
    const/4 p3, 0x1

    .line 46
    invoke-direct {p1, p0, p2, p3}, Lcom/zykj/merge/sketch/view/e;-><init>(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lr6/c;I)V

    .line 47
    .line 48
    .line 49
    invoke-direct {p0, p1}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->runOnMainThread(Ljava/lang/Runnable;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_0
    iget-object p2, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->sketchPlayView:Lcom/zykj/paint/render/SketchViewer;

    .line 54
    .line 55
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$EzyActionList;->getActionList()Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {p2, v0, p1}, Lcom/zykj/paint/render/SketchViewer;->setDataSource(Ljava/util/List;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    new-instance p1, Lcom/zykj/merge/sketch/view/e;

    .line 63
    .line 64
    const/4 p2, 0x2

    .line 65
    invoke-direct {p1, p0, p3, p2}, Lcom/zykj/merge/sketch/view/e;-><init>(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lr6/c;I)V

    .line 66
    .line 67
    .line 68
    invoke-direct {p0, p1}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->runOnMainThread(Ljava/lang/Runnable;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method private static final loadData$lambda-4$lambda-1(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lr6/c;)V
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
    new-instance v0, Lcom/zykj/merge/sketch/view/b;

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    invoke-direct {v0, p1, v1}, Lcom/zykj/merge/sketch/view/b;-><init>(Lr6/c;I)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v0}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->runAtLeastCreated(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private static final loadData$lambda-4$lambda-1$lambda-0(Lr6/c;)V
    .locals 2

    .line 1
    const-string v0, "$onFailure"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/zykj/blackboard/exception/EmptyDataException;

    .line 7
    .line 8
    const-string v1, "\u627e\u4e0d\u5230\u6587\u4ef6"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Lcom/zykj/blackboard/exception/EmptyDataException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p0, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method private static final loadData$lambda-4$lambda-3(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lr6/c;)V
    .locals 1

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
    new-instance v0, Lcom/zykj/merge/sketch/view/e;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1}, Lcom/zykj/merge/sketch/view/e;-><init>(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lr6/c;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, v0}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->runAtLeastCreated(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private static final loadData$lambda-4$lambda-3$lambda-2(Lr6/c;Lcom/zykj/merge/sketch/view/OldSketchProxyView;)V
    .locals 2

    .line 1
    const-string v0, "$onSuccess"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "this$0"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p1, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->sketchPlayView:Lcom/zykj/paint/render/SketchViewer;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/zykj/paint/render/SketchViewer;->getTotalTime()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    long-to-int p1, v0

    .line 18
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p0, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
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

.method private final runOnMainThread(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private static final seekTo$lambda-9(Lcom/zykj/merge/sketch/view/OldSketchProxyView;ILr6/c;Lr6/c;)V
    .locals 1

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
    :try_start_0
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->sketchPlayView:Lcom/zykj/paint/render/SketchViewer;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/zykj/paint/render/SketchViewer;->seekToCurrentIndex(I)J

    .line 19
    .line 20
    .line 21
    new-instance v0, Landroidx/activity/f;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2, p1}, Landroidx/activity/f;-><init>(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lr6/c;I)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, v0}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->runOnMainThread(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :catch_0
    move-exception p1

    .line 31
    new-instance p2, La5/h;

    .line 32
    .line 33
    const/16 v0, 0x8

    .line 34
    .line 35
    invoke-direct {p2, p0, p3, v0, p1}, La5/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-direct {p0, p2}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->runOnMainThread(Ljava/lang/Runnable;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method private static final seekTo$lambda-9$lambda-6(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lr6/c;I)V
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
    new-instance v0, Lcom/zykj/merge/sketch/view/d;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-direct {v0, p2, v1, p1}, Lcom/zykj/merge/sketch/view/d;-><init>(IILr6/c;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v0}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->runAtLeastCreated(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private static final seekTo$lambda-9$lambda-6$lambda-5(Lr6/c;I)V
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

.method private static final seekTo$lambda-9$lambda-8(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lr6/c;Ljava/lang/Exception;)V
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
    new-instance v0, Lcom/zykj/merge/sketch/view/a;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-direct {v0, p1, p2, v1}, Lcom/zykj/merge/sketch/view/a;-><init>(Lr6/c;Ljava/lang/Object;I)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, v0}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->runAtLeastCreated(Ljava/lang/Runnable;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method private static final seekTo$lambda-9$lambda-8$lambda-7(Lr6/c;Ljava/lang/Exception;)V
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


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->_$_findViewCache:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->_$_findViewCache:Ljava/util/Map;

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

.method public addPlayActionListener(Lcom/zykj/merge/sketch/listener/PlayStatusListener;)V
    .locals 1
    .param p1    # Lcom/zykj/merge/sketch/listener/PlayStatusListener;
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
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->playActionListener:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public destroy()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/merge/sketch/constant/PlayStatus;->RECORD_END:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->playStatus:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->sketchPlayView:Lcom/zykj/paint/render/SketchViewer;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->destroyDrawingCache()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public getPath()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->path:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public isRend(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->sketchPlayView:Lcom/zykj/paint/render/SketchViewer;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/zykj/paint/render/SketchViewer;->isRend(Z)V

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
    invoke-direct {p0}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->getLoadDataExecutor()Ljava/util/concurrent/ExecutorService;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, La5/d;

    .line 21
    .line 22
    const/4 v6, 0x7

    .line 23
    move-object v2, p0

    .line 24
    move-object v3, p1

    .line 25
    move-object v5, p2

    .line 26
    move-object v4, p3

    .line 27
    invoke-direct/range {v1 .. v6}, La5/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public pause()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/merge/sketch/constant/PlayStatus;->RECORD_PAUSE:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->playStatus:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->sketchPlayView:Lcom/zykj/paint/render/SketchViewer;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/zykj/paint/render/SketchViewer;->pause()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public release()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/merge/sketch/constant/PlayStatus;->RECORD_END:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->playStatus:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->sketchPlayView:Lcom/zykj/paint/render/SketchViewer;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/zykj/paint/render/SketchViewer;->release()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public removePlayActionListener(Lcom/zykj/merge/sketch/listener/PlayStatusListener;)V
    .locals 1
    .param p1    # Lcom/zykj/merge/sketch/listener/PlayStatusListener;
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
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->playActionListener:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public reset()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/merge/sketch/constant/PlayStatus;->RECORD_END:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->playStatus:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->sketchPlayView:Lcom/zykj/paint/render/SketchViewer;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/zykj/paint/render/SketchViewer;->reset()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public resume()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/merge/sketch/constant/PlayStatus;->RECORD_RESUME:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->playStatus:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->sketchPlayView:Lcom/zykj/paint/render/SketchViewer;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/zykj/paint/render/SketchViewer;->resume()V

    .line 8
    .line 9
    .line 10
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
    invoke-direct {p0}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->getSeekExecutor()Ljava/util/concurrent/ExecutorService;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Lcom/zykj/merge/sketch/view/f;

    .line 16
    .line 17
    const/4 v6, 0x0

    .line 18
    move-object v2, p0

    .line 19
    move v3, p1

    .line 20
    move-object v4, p2

    .line 21
    move-object v5, p3

    .line 22
    invoke-direct/range {v1 .. v6}, Lcom/zykj/merge/sketch/view/f;-><init>(Landroid/widget/RelativeLayout;ILr6/c;Lr6/c;I)V

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public setRate(D)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public start()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->sketchPlayView:Lcom/zykj/paint/render/SketchViewer;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/paint/render/SketchViewer;->play()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public status()Lcom/zykj/merge/sketch/constant/PlayStatus;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->playStatus:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 2
    .line 3
    return-object v0
.end method

.method public waiting()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/merge/sketch/constant/PlayStatus;->RECORD_PAUSE:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->playStatus:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->sketchPlayView:Lcom/zykj/paint/render/SketchViewer;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/zykj/paint/render/SketchViewer;->pause()V

    .line 8
    .line 9
    .line 10
    return-void
.end method
