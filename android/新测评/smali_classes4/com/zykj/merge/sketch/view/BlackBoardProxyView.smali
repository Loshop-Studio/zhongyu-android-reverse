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
        "\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0003\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJN\u0010\u0019\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000f2!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0012\u00a2\u0006\u000c\u0008\u0013\u0012\u0008\u0008\u0014\u0012\u0004\u0008\u0008(\u0015\u0012\u0004\u0012\u00020\u000c0\u00112\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000c0\u0011H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u000fH\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u000c2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0017\u0010!\u001a\u00020\u000c2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016\u00a2\u0006\u0004\u0008!\u0010 J\u000f\u0010\"\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\"\u0010#J\u000f\u0010$\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008$\u0010#J]\u0010(\u001a\u00020\u000c2\u0006\u0010%\u001a\u00020\u00122!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0012\u00a2\u0006\u000c\u0008\u0013\u0012\u0008\u0008\u0014\u0012\u0004\u0008\u0008(&\u0012\u0004\u0012\u00020\u000c0\u00112!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0017\u00a2\u0006\u000c\u0008\u0013\u0012\u0008\u0008\u0014\u0012\u0004\u0008\u0008(\'\u0012\u0004\u0012\u00020\u000c0\u0011H\u0016\u00a2\u0006\u0004\u0008(\u0010)J\u000f\u0010*\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008*\u0010#J\u000f\u0010+\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008+\u0010#J\u000f\u0010-\u001a\u00020,H\u0016\u00a2\u0006\u0004\u0008-\u0010.J\u000f\u0010/\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008/\u0010#J\u000f\u00100\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u00080\u0010#J\u000f\u00101\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u00081\u0010#J\u0017\u00103\u001a\u00020\u000c2\u0006\u00103\u001a\u000202H\u0016\u00a2\u0006\u0004\u00083\u00104J\u0017\u00107\u001a\u0002022\u0006\u00106\u001a\u000205H\u0016\u00a2\u0006\u0004\u00087\u00108J\u0019\u0010:\u001a\u00020\u000c2\u0008\u0010\u001e\u001a\u0004\u0018\u000109H\u0016\u00a2\u0006\u0004\u0008:\u0010;J\u000f\u0010<\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008<\u0010#J#\u0010@\u001a\u00020\u000c2\u0008\u0010>\u001a\u0004\u0018\u00010=2\u0008\u0010?\u001a\u0004\u0018\u00010=H\u0016\u00a2\u0006\u0004\u0008@\u0010AJ#\u0010B\u001a\u00020\u000c2\u0008\u0010>\u001a\u0004\u0018\u00010=2\u0008\u0010?\u001a\u0004\u0018\u00010=H\u0016\u00a2\u0006\u0004\u0008B\u0010AJ\u000f\u0010C\u001a\u00020=H\u0016\u00a2\u0006\u0004\u0008C\u0010DJ\u000f\u0010E\u001a\u00020=H\u0016\u00a2\u0006\u0004\u0008E\u0010DJ\u000f\u0010F\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008F\u0010GJ\u000f\u0010H\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008H\u0010GJ\u0017\u0010J\u001a\u00020\u000c2\u0006\u0010I\u001a\u000202H\u0016\u00a2\u0006\u0004\u0008J\u00104J\u0017\u0010K\u001a\u00020\u000c2\u0006\u0010I\u001a\u000202H\u0016\u00a2\u0006\u0004\u0008K\u00104J\u0011\u0010M\u001a\u0004\u0018\u00010LH\u0016\u00a2\u0006\u0004\u0008M\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008P\u0010QR\u001a\u0010S\u001a\u0008\u0012\u0004\u0012\u00020\u001d0R8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008S\u0010TR\u0018\u0010V\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008V\u0010W\u00a8\u0006X"
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
        "Ljava/lang/Runnable;",
        "runnable",
        "",
        "runAtLeastCreated",
        "(Ljava/lang/Runnable;)V",
        "",
        "path",
        "Lkotlin/Function1;",
        "",
        "Lkotlin/ParameterName;",
        "name",
        "duration",
        "onSuccess",
        "",
        "onFailure",
        "loadData",
        "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V",
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
        "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V",
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
        "Lc5/d;",
        "setAreaMoveListener",
        "(Lc5/d;)V",
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
        "Lj4/c;",
        "sketchPlayView",
        "Lj4/c;",
        "",
        "playActionListener",
        "Ljava/util/List;",
        "Lw4/m;",
        "playPageControl",
        "Lw4/m;",
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
.end field

.field private final playActionListener:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/merge/sketch/listener/PlayStatusListener;",
            ">;"
        }
    .end annotation
.end field

.field private playPageControl:Lw4/m;

.field private final sketchPlayView:Lj4/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

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
    iput-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->_$_findViewCache:Ljava/util/Map;

    .line 12
    .line 13
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lj4/c;

    .line 17
    .line 18
    invoke-direct {v0, p1, p2}, Lj4/c;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->sketchPlayView:Lj4/c;

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

.method public static synthetic a(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->seekTo$lambda-0(Lkotlin/jvm/functions/Function1;)V

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

.method public static final synthetic access$getPlayPageControl$p(Lcom/zykj/merge/sketch/view/BlackBoardProxyView;)Lw4/m;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lw4/m;

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

.method public static final synthetic access$setPlayPageControl$p(Lcom/zykj/merge/sketch/view/BlackBoardProxyView;Lw4/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lw4/m;

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

.method private static final seekTo$lambda-0(Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const-string v0, "$onFailure"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lw4/m;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Lw4/m;->areaMoveEnd(Ljava/lang/Float;Ljava/lang/Float;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public areaMoveStart()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lw4/m;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lw4/m;->areaMoveStart()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public areaMoving(Ljava/lang/Float;Ljava/lang/Float;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lw4/m;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Lw4/m;->areaMoving(Ljava/lang/Float;Ljava/lang/Float;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public destroy()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->sketchPlayView:Lj4/c;

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

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lw4/m;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lw4/m;->c()Landroid/graphics/Bitmap;

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
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lw4/m;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lw4/m;->getMoveHorizontalProgress()F

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
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lw4/m;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lw4/m;->getMoveMaxHeightTimes()I

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
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lw4/m;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lw4/m;->getMoveMaxWidthTimes()I

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
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lw4/m;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lw4/m;->getMoveVerticalProgress()F

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

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lw4/m;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lw4/m;->e()Ljava/lang/String;

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

.method public loadData(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
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
    const-string v0, "onSuccess"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onFailure"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->sketchPlayView:Lj4/c;

    .line 17
    .line 18
    new-instance v1, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1;

    .line 19
    .line 20
    invoke-direct {v1, p1, p0, p2, p3}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1;-><init>(Ljava/lang/String;Lcom/zykj/merge/sketch/view/BlackBoardProxyView;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lj4/c;->b(Lkotlin/jvm/functions/Function1;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public pause()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lw4/m;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lw4/m;->pause()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public release()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lw4/m;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lw4/k;->release()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public removePlayActionListener(Lcom/zykj/merge/sketch/listener/PlayStatusListener;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lw4/m;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lw4/m;->start()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public resume()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lw4/m;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lw4/m;->resume()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public seekTo(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "onSuccess"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onFailure"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lw4/m;

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
    invoke-direct {v3, p0, p2, p1}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$seekTo$1;-><init>(Lcom/zykj/merge/sketch/view/BlackBoardProxyView;Lkotlin/jvm/functions/Function1;I)V

    .line 19
    .line 20
    .line 21
    new-instance p1, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$seekTo$2;

    .line 22
    .line 23
    invoke-direct {p1, p0, p3}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$seekTo$2;-><init>(Lcom/zykj/merge/sketch/view/BlackBoardProxyView;Lkotlin/jvm/functions/Function1;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, v1, v2, v3, p1}, Lw4/m;->d(JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    .line 27
    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

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
    new-instance p1, Lcom/zykj/merge/sketch/view/a;

    .line 36
    .line 37
    invoke-direct {p1, p3}, Lcom/zykj/merge/sketch/view/a;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 38
    .line 39
    .line 40
    invoke-direct {p0, p1}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->runAtLeastCreated(Ljava/lang/Runnable;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void
.end method

.method public setAreaMoveListener(Lc5/d;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lw4/m;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lw4/m;->setAreaMoveListener(Lc5/d;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setRate(D)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lw4/m;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    double-to-float p1, p1

    .line 6
    invoke-interface {v0, p1}, Lw4/m;->g(F)V

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
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lw4/m;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lw4/m;->setScaleEnable(Z)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setTranslateEnable(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lw4/m;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lw4/m;->setTranslateEnable(Z)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public start()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lw4/m;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lw4/m;->start()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public status()Lcom/zykj/merge/sketch/constant/PlayStatus;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lw4/m;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lw4/m;->status()Lcom/zykj/blackboard/enums/PlayStatus;

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
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->playPageControl:Lw4/m;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lw4/m;->pause()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method
