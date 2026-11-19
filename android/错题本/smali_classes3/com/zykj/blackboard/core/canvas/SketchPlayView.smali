.class public final Lcom/zykj/blackboard/core/canvas/SketchPlayView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0017\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\u000e\u001a\u00020\rH\u0014\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ!\u0010\u0013\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u0010\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/canvas/SketchPlayView;",
        "Landroid/widget/FrameLayout;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "Landroid/view/MotionEvent;",
        "event",
        "",
        "onTouchEvent",
        "(Landroid/view/MotionEvent;)Z",
        "Ld6/s;",
        "onDetachedFromWindow",
        "()V",
        "Lkotlin/Function1;",
        "Lcom/zykj/blackboard/core/play/IPlayControl;",
        "callBack",
        "ready",
        "(Lr6/c;)V",
        "Lcom/zykj/blackboard/core/canvas/view/BackgroundView;",
        "backgroundLayer",
        "Lcom/zykj/blackboard/core/canvas/view/BackgroundView;",
        "Lcom/zykj/blackboard/core/canvas/view/FixView;",
        "fixLayer",
        "Lcom/zykj/blackboard/core/canvas/view/FixView;",
        "Lcom/zykj/blackboard/core/canvas/view/ActiveView;",
        "activeLayer",
        "Lcom/zykj/blackboard/core/canvas/view/ActiveView;",
        "Lcom/zykj/blackboard/core/canvas/view/MaskView;",
        "maskLayer",
        "Lcom/zykj/blackboard/core/canvas/view/MaskView;",
        "Lcom/zykj/blackboard/core/play/PlayControl;",
        "playControl",
        "Lcom/zykj/blackboard/core/play/PlayControl;",
        "blackboard_release"
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

.field private final activeLayer:Lcom/zykj/blackboard/core/canvas/view/ActiveView;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final backgroundLayer:Lcom/zykj/blackboard/core/canvas/view/BackgroundView;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final fixLayer:Lcom/zykj/blackboard/core/canvas/view/FixView;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final maskLayer:Lcom/zykj/blackboard/core/canvas/view/MaskView;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private playControl:Lcom/zykj/blackboard/core/play/PlayControl;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 13
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
    iput-object v0, p0, Lcom/zykj/blackboard/core/canvas/SketchPlayView;->_$_findViewCache:Ljava/util/Map;

    .line 12
    .line 13
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;

    .line 17
    .line 18
    const/4 v5, 0x4

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v4, 0x0

    .line 21
    move-object v2, p1

    .line 22
    move-object v3, p2

    .line 23
    invoke-direct/range {v1 .. v6}, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/e;)V

    .line 24
    .line 25
    .line 26
    move-object v8, v2

    .line 27
    move-object v9, v3

    .line 28
    iput-object v1, p0, Lcom/zykj/blackboard/core/canvas/SketchPlayView;->backgroundLayer:Lcom/zykj/blackboard/core/canvas/view/BackgroundView;

    .line 29
    .line 30
    new-instance v7, Lcom/zykj/blackboard/core/canvas/view/FixView;

    .line 31
    .line 32
    const/4 v11, 0x4

    .line 33
    const/4 v12, 0x0

    .line 34
    const/4 v10, 0x0

    .line 35
    invoke-direct/range {v7 .. v12}, Lcom/zykj/blackboard/core/canvas/view/FixView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/e;)V

    .line 36
    .line 37
    .line 38
    move-object p1, v7

    .line 39
    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/SketchPlayView;->fixLayer:Lcom/zykj/blackboard/core/canvas/view/FixView;

    .line 40
    .line 41
    new-instance v7, Lcom/zykj/blackboard/core/canvas/view/ActiveView;

    .line 42
    .line 43
    invoke-direct/range {v7 .. v12}, Lcom/zykj/blackboard/core/canvas/view/ActiveView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/e;)V

    .line 44
    .line 45
    .line 46
    move-object p2, v7

    .line 47
    iput-object p2, p0, Lcom/zykj/blackboard/core/canvas/SketchPlayView;->activeLayer:Lcom/zykj/blackboard/core/canvas/view/ActiveView;

    .line 48
    .line 49
    new-instance v7, Lcom/zykj/blackboard/core/canvas/view/MaskView;

    .line 50
    .line 51
    invoke-direct/range {v7 .. v12}, Lcom/zykj/blackboard/core/canvas/view/MaskView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/e;)V

    .line 52
    .line 53
    .line 54
    iput-object v7, p0, Lcom/zykj/blackboard/core/canvas/SketchPlayView;->maskLayer:Lcom/zykj/blackboard/core/canvas/view/MaskView;

    .line 55
    .line 56
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public static synthetic a(Lcom/zykj/blackboard/core/canvas/SketchPlayView;Lr6/c;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/blackboard/core/canvas/SketchPlayView;->ready$lambda-2(Lcom/zykj/blackboard/core/canvas/SketchPlayView;Lr6/c;)V

    return-void
.end method

.method private static final ready$lambda-2(Lcom/zykj/blackboard/core/canvas/SketchPlayView;Lr6/c;)V
    .locals 6

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$callBack"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lcom/zykj/blackboard/utils/BoardBox;->INSTANCE:Lcom/zykj/blackboard/utils/BoardBox;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, "context"

    .line 18
    .line 19
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/utils/BoardBox;->init(Landroid/content/Context;)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Lcom/zykj/blackboard/core/play/PlayControl;

    .line 26
    .line 27
    new-instance v1, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 28
    .line 29
    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/SketchPlayView;->backgroundLayer:Lcom/zykj/blackboard/core/canvas/view/BackgroundView;

    .line 30
    .line 31
    iget-object v3, p0, Lcom/zykj/blackboard/core/canvas/SketchPlayView;->fixLayer:Lcom/zykj/blackboard/core/canvas/view/FixView;

    .line 32
    .line 33
    iget-object v4, p0, Lcom/zykj/blackboard/core/canvas/SketchPlayView;->activeLayer:Lcom/zykj/blackboard/core/canvas/view/ActiveView;

    .line 34
    .line 35
    iget-object v5, p0, Lcom/zykj/blackboard/core/canvas/SketchPlayView;->maskLayer:Lcom/zykj/blackboard/core/canvas/view/MaskView;

    .line 36
    .line 37
    invoke-direct {v1, v2, v3, v4, v5}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;-><init>(Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer;Lcom/zykj/blackboard/core/canvas/view/FixLayer;Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;Lcom/zykj/blackboard/core/canvas/view/MaskLayer;)V

    .line 38
    .line 39
    .line 40
    invoke-direct {v0, v1}, Lcom/zykj/blackboard/core/play/PlayControl;-><init>(Lcom/zykj/blackboard/core/canvas/view/RenderLayer;)V

    .line 41
    .line 42
    .line 43
    invoke-interface {p1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Lcom/zykj/blackboard/core/canvas/SketchPlayView;->playControl:Lcom/zykj/blackboard/core/play/PlayControl;

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/SketchPlayView;->_$_findViewCache:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/SketchPlayView;->_$_findViewCache:Ljava/util/Map;

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

.method public onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/SketchPlayView;->playControl:Lcom/zykj/blackboard/core/play/PlayControl;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/play/PlayControl;->release()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/SketchPlayView;->playControl:Lcom/zykj/blackboard/core/play/PlayControl;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/play/PlayControl;->getCurrentPlayPageControl()Lcom/zykj/blackboard/core/play/IPlayPageControl;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {v0, p1}, Lcom/zykj/blackboard/core/play/IPlayPageControl;->onTouchEvent(Landroid/view/MotionEvent;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    const/4 p1, 0x1

    .line 17
    return p1
.end method

.method public final ready(Lr6/c;)V
    .locals 2
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
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/SketchPlayView;->fixLayer:Lcom/zykj/blackboard/core/canvas/view/FixView;

    .line 7
    .line 8
    new-instance v1, Lcom/zykj/blackboard/core/canvas/c;

    .line 9
    .line 10
    invoke-direct {v1, p0, p1}, Lcom/zykj/blackboard/core/canvas/c;-><init>(Lcom/zykj/blackboard/core/canvas/SketchPlayView;Lr6/c;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method
