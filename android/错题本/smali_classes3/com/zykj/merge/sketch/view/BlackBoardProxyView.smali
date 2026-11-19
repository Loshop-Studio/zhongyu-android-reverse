.class public final Lcom/zykj/merge/sketch/view/BlackBoardProxyView;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/merge/sketch/listener/Play;
.implements Lcom/zykj/merge/sketch/listener/MoveProxy;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/merge/sketch/view/BlackBoardProxyView$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJN\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\r\u00a2\u0006\u000c\u0008\u000e\u0012\u0008\u0008\u000f\u0012\u0004\u0008\u0008(\u0010\u0012\u0004\u0012\u00020\u00110\u000c2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00110\u000cH\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\nH\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008 \u0010\u001fJ]\u0010$\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\r2!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\r\u00a2\u0006\u000c\u0008\u000e\u0012\u0008\u0008\u000f\u0012\u0004\u0008\u0008(\"\u0012\u0004\u0012\u00020\u00110\u000c2!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0013\u00a2\u0006\u000c\u0008\u000e\u0012\u0008\u0008\u000f\u0012\u0004\u0008\u0008(#\u0012\u0004\u0012\u00020\u00110\u000cH\u0016\u00a2\u0006\u0004\u0008$\u0010%J\u000f\u0010&\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008&\u0010\u001fJ\u000f\u0010\'\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\'\u0010\u001fJ\u000f\u0010)\u001a\u00020(H\u0016\u00a2\u0006\u0004\u0008)\u0010*J\u000f\u0010+\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008+\u0010\u001fJ\u000f\u0010,\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008,\u0010\u001fJ\u000f\u0010-\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008-\u0010\u001fJ\u0017\u0010/\u001a\u00020\u00112\u0006\u0010/\u001a\u00020.H\u0016\u00a2\u0006\u0004\u0008/\u00100J\u0017\u00103\u001a\u00020.2\u0006\u00102\u001a\u000201H\u0016\u00a2\u0006\u0004\u00083\u00104J\u0019\u00106\u001a\u00020\u00112\u0008\u0010\u001a\u001a\u0004\u0018\u000105H\u0016\u00a2\u0006\u0004\u00086\u00107J\u000f\u00108\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u00088\u0010\u001fJ#\u0010<\u001a\u00020\u00112\u0008\u0010:\u001a\u0004\u0018\u0001092\u0008\u0010;\u001a\u0004\u0018\u000109H\u0016\u00a2\u0006\u0004\u0008<\u0010=J#\u0010>\u001a\u00020\u00112\u0008\u0010:\u001a\u0004\u0018\u0001092\u0008\u0010;\u001a\u0004\u0018\u000109H\u0016\u00a2\u0006\u0004\u0008>\u0010=J\u000f\u0010?\u001a\u000209H\u0016\u00a2\u0006\u0004\u0008?\u0010@J\u000f\u0010A\u001a\u000209H\u0016\u00a2\u0006\u0004\u0008A\u0010@J\u000f\u0010B\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008B\u0010CJ\u000f\u0010D\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008D\u0010CJ\u0017\u0010F\u001a\u00020\u00112\u0006\u0010E\u001a\u00020.H\u0016\u00a2\u0006\u0004\u0008F\u00100J\u0017\u0010G\u001a\u00020\u00112\u0006\u0010E\u001a\u00020.H\u0016\u00a2\u0006\u0004\u0008G\u00100J\u0011\u0010I\u001a\u0004\u0018\u00010HH\u0016\u00a2\u0006\u0004\u0008I\u0010JJ\u0017\u0010M\u001a\u00020\u00112\u0006\u0010L\u001a\u00020KH\u0002\u00a2\u0006\u0004\u0008M\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008P\u0010QR\u001a\u0010S\u001a\u0008\u0012\u0004\u0012\u00020\u00190R8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008S\u0010TR\u0018\u0010V\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008V\u0010W\u00a8\u0006X"
    }
    d2 = {
        "Lcom/zykj/merge/sketch/view/BlackBoardProxyView;",
        "Landroid/widget/RelativeLayout;",
        "Lcom/zykj/merge/sketch/listener/Play;",
        "Lcom/zykj/merge/sketch/listener/MoveProxy;",
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
        "Lkotlin/ParameterName;",
        "name",
        "duration",
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
        "Lcom/zykj/blackboard/listener/IAreaMoveListener;",
        "setAreaMoveListener",
        "(Lcom/zykj/blackboard/listener/IAreaMoveListener;)V",
        "areaMoveStart",
        "",
        "horizontalProgress",
        "verticalProgress",
        "areaMoving",
        "(Ljava/lang/Float;Ljava/lang/Float;)V",
        "areaMoveEnd",
        "getMoveVerticalProgress",
        "()F",
        "getMoveHorizontalProgress",
        "getMoveMaxHeightTimes",
        "()I",
        "getMoveMaxWidthTimes",
        "isEnable",
        "setTranslateEnable",
        "setScaleEnable",
        "Landroid/graphics/Bitmap;",
        "getCurrentScreenBitmap",
        "()Landroid/graphics/Bitmap;",
        "Ljava/lang/Runnable;",
        "runnable",
        "runAtLeastCreated",
        "(Ljava/lang/Runnable;)V",
        "Lcom/zykj/blackboard/core/canvas/SketchPlayView;",
        "sketchPlayView",
        "Lcom/zykj/blackboard/core/canvas/SketchPlayView;",
        "",
        "playActionListener",
        "Ljava/util/List;",
        "Lcom/zykj/blackboard/core/play/IPlayPageControl;",
        "playPageControl",
        "Lcom/zykj/blackboard/core/play/IPlayPageControl;",
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

.field private playPageControl:Lcom/zykj/blackboard/core/play/IPlayPageControl;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final sketchPlayView:Lcom/zykj/blackboard/core/canvas/SketchPlayView;
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
    iput-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->_$_findViewCache:Ljava/util/Map;

    .line 12
    .line 13
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lcom/zykj/blackboard/core/canvas/SketchPlayView;

    .line 17
    .line 18
    invoke-direct {v0, p1, p2}, Lcom/zykj/blackboard/core/canvas/SketchPlayView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->sketchPlayView:Lcom/zykj/blackboard/core/canvas/SketchPlayView;

    .line 22
    .line 23
    new-instance p1, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playActionListener:Ljava/util/List;

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public static synthetic a(Lr6/c;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->seekTo$lambda-0(Lr6/c;)V

    return-void
.end method

.method public static final synthetic access$getPlayActionListener$p(Lcom/zykj/merge/sketch/view/BlackBoardProxyView;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playActionListener:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getPlayPageControl$p(Lcom/zykj/merge/sketch/view/BlackBoardProxyView;)Lcom/zykj/blackboard/core/play/IPlayPageControl;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lcom/zykj/blackboard/core/play/IPlayPageControl;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$runAtLeastCreated(Lcom/zykj/merge/sketch/view/BlackBoardProxyView;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->runAtLeastCreated(Ljava/lang/Runnable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$setPlayPageControl$p(Lcom/zykj/merge/sketch/view/BlackBoardProxyView;Lcom/zykj/blackboard/core/play/IPlayPageControl;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lcom/zykj/blackboard/core/play/IPlayPageControl;

    .line 2
    .line 3
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

.method private static final seekTo$lambda-0(Lr6/c;)V
    .locals 1

    .line 1
    const-string v0, "$onFailure"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/Exception;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->_$_findViewCache:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->_$_findViewCache:Ljava/util/Map;

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
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playActionListener:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public areaMoveEnd(Ljava/lang/Float;Ljava/lang/Float;)V
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
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lcom/zykj/blackboard/core/play/IPlayPageControl;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Lcom/zykj/blackboard/core/play/IPlayPageControl;->areaMoveEnd(Ljava/lang/Float;Ljava/lang/Float;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public areaMoveStart()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lcom/zykj/blackboard/core/play/IPlayPageControl;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/zykj/blackboard/core/play/IPlayPageControl;->areaMoveStart()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public areaMoving(Ljava/lang/Float;Ljava/lang/Float;)V
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
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lcom/zykj/blackboard/core/play/IPlayPageControl;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Lcom/zykj/blackboard/core/play/IPlayPageControl;->areaMoving(Ljava/lang/Float;Ljava/lang/Float;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public destroy()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->sketchPlayView:Lcom/zykj/blackboard/core/canvas/SketchPlayView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->destroyDrawingCache()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public getCurrentScreenBitmap()Landroid/graphics/Bitmap;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lcom/zykj/blackboard/core/play/IPlayPageControl;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/zykj/blackboard/core/play/IPlayPageControl;->getCurrentScreenShot()Landroid/graphics/Bitmap;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public getMoveHorizontalProgress()F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lcom/zykj/blackboard/core/play/IPlayPageControl;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/zykj/blackboard/core/play/IPlayPageControl;->getMoveHorizontalProgress()F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public getMoveMaxHeightTimes()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lcom/zykj/blackboard/core/play/IPlayPageControl;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/zykj/blackboard/core/play/IPlayPageControl;->getMoveMaxHeightTimes()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public getMoveMaxWidthTimes()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lcom/zykj/blackboard/core/play/IPlayPageControl;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/zykj/blackboard/core/play/IPlayPageControl;->getMoveMaxWidthTimes()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public getMoveVerticalProgress()F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lcom/zykj/blackboard/core/play/IPlayPageControl;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/zykj/blackboard/core/play/IPlayPageControl;->getMoveVerticalProgress()F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public getPath()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lcom/zykj/blackboard/core/play/IPlayPageControl;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/zykj/blackboard/core/play/IPlayPageControl;->getPageDirPath()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public isRend(Z)V
    .locals 0

    return-void
.end method

.method public loadData(Ljava/lang/String;Lr6/c;Lr6/c;)V
    .locals 2
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
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->sketchPlayView:Lcom/zykj/blackboard/core/canvas/SketchPlayView;

    .line 17
    .line 18
    new-instance v1, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1;

    .line 19
    .line 20
    invoke-direct {v1, p1, p0, p2, p3}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1;-><init>(Ljava/lang/String;Lcom/zykj/merge/sketch/view/BlackBoardProxyView;Lr6/c;Lr6/c;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/canvas/SketchPlayView;->ready(Lr6/c;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public pause()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lcom/zykj/blackboard/core/play/IPlayPageControl;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/zykj/blackboard/core/play/IPlayPageControl;->pause()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public release()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lcom/zykj/blackboard/core/play/IPlayPageControl;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/zykj/blackboard/core/play/IEditPlayPageControl;->release()V

    .line 6
    .line 7
    .line 8
    :cond_0
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
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playActionListener:Ljava/util/List;

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
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lcom/zykj/blackboard/core/play/IPlayPageControl;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/zykj/blackboard/core/play/IPlayPageControl;->start()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public resume()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lcom/zykj/blackboard/core/play/IPlayPageControl;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/zykj/blackboard/core/play/IPlayPageControl;->resume()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public seekTo(ILr6/c;Lr6/c;)V
    .locals 4
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
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lcom/zykj/blackboard/core/play/IPlayPageControl;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    int-to-long v1, p1

    .line 16
    new-instance v3, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$seekTo$1;

    .line 17
    .line 18
    invoke-direct {v3, p0, p2, p1}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$seekTo$1;-><init>(Lcom/zykj/merge/sketch/view/BlackBoardProxyView;Lr6/c;I)V

    .line 19
    .line 20
    .line 21
    new-instance p1, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$seekTo$2;

    .line 22
    .line 23
    invoke-direct {p1, p0, p3}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$seekTo$2;-><init>(Lcom/zykj/merge/sketch/view/BlackBoardProxyView;Lr6/c;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, v1, v2, v3, p1}, Lcom/zykj/blackboard/core/play/IPlayPageControl;->seekTo(JLr6/a;Lr6/c;)V

    .line 27
    .line 28
    .line 29
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 p1, 0x0

    .line 33
    :goto_0
    if-nez p1, :cond_1

    .line 34
    .line 35
    new-instance p1, Lcom/zykj/merge/sketch/view/b;

    .line 36
    .line 37
    const/4 p2, 0x1

    .line 38
    invoke-direct {p1, p3, p2}, Lcom/zykj/merge/sketch/view/b;-><init>(Lr6/c;I)V

    .line 39
    .line 40
    .line 41
    invoke-direct {p0, p1}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->runAtLeastCreated(Ljava/lang/Runnable;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    return-void
.end method

.method public setAreaMoveListener(Lcom/zykj/blackboard/listener/IAreaMoveListener;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/listener/IAreaMoveListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lcom/zykj/blackboard/core/play/IPlayPageControl;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/zykj/blackboard/core/play/IPlayPageControl;->setAreaMoveListener(Lcom/zykj/blackboard/listener/IAreaMoveListener;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setRate(D)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lcom/zykj/blackboard/core/play/IPlayPageControl;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    double-to-float p1, p1

    .line 6
    invoke-interface {v0, p1}, Lcom/zykj/blackboard/core/play/IPlayPageControl;->setRate(F)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    return p1
.end method

.method public setScaleEnable(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lcom/zykj/blackboard/core/play/IPlayPageControl;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/zykj/blackboard/core/play/IPlayPageControl;->setScaleEnable(Z)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setTranslateEnable(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lcom/zykj/blackboard/core/play/IPlayPageControl;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/zykj/blackboard/core/play/IPlayPageControl;->setTranslateEnable(Z)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public start()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lcom/zykj/blackboard/core/play/IPlayPageControl;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/zykj/blackboard/core/play/IPlayPageControl;->start()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public status()Lcom/zykj/merge/sketch/constant/PlayStatus;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lcom/zykj/blackboard/core/play/IPlayPageControl;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/zykj/blackboard/core/play/IPlayPageControl;->status()Lcom/zykj/blackboard/enums/PlayStatus;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    if-nez v0, :cond_1

    .line 12
    .line 13
    const/4 v0, -0x1

    .line 14
    goto :goto_1

    .line 15
    :cond_1
    sget-object v1, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    aget v0, v1, v0

    .line 22
    .line 23
    :goto_1
    const/4 v1, 0x1

    .line 24
    if-eq v0, v1, :cond_5

    .line 25
    .line 26
    const/4 v1, 0x2

    .line 27
    if-eq v0, v1, :cond_4

    .line 28
    .line 29
    const/4 v1, 0x3

    .line 30
    if-eq v0, v1, :cond_3

    .line 31
    .line 32
    const/4 v1, 0x4

    .line 33
    if-eq v0, v1, :cond_2

    .line 34
    .line 35
    sget-object v0, Lcom/zykj/merge/sketch/constant/PlayStatus;->RECORD_END:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_2
    sget-object v0, Lcom/zykj/merge/sketch/constant/PlayStatus;->RECORD_END:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 39
    .line 40
    return-object v0

    .line 41
    :cond_3
    sget-object v0, Lcom/zykj/merge/sketch/constant/PlayStatus;->RECORD_RESUME:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_4
    sget-object v0, Lcom/zykj/merge/sketch/constant/PlayStatus;->RECORD_PAUSE:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 45
    .line 46
    return-object v0

    .line 47
    :cond_5
    sget-object v0, Lcom/zykj/merge/sketch/constant/PlayStatus;->RECORD_START:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 48
    .line 49
    return-object v0
.end method

.method public waiting()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lcom/zykj/blackboard/core/play/IPlayPageControl;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/zykj/blackboard/core/play/IPlayPageControl;->pause()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method
