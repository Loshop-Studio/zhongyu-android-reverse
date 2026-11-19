.class public final Lcom/zykj/merge/sketch/view/BlackBoardProxyView;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"

# interfaces
.implements Lx3/b;
.implements Lx3/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/merge/sketch/view/BlackBoardProxyView$a;
    }
.end annotation


# instance fields
.field public final a:Lcom/zykj/blackboard/core/canvas/SketchPlayView;

.field public final b:Ljava/util/List;

.field public c:Lcom/zykj/blackboard/core/play/IPlayPageControl;

.field public d:Ljava/util/Map;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    iput-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->d:Ljava/util/Map;

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
    iput-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->a:Lcom/zykj/blackboard/core/canvas/SketchPlayView;

    .line 22
    .line 23
    new-instance p1, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->b:Ljava/util/List;

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public static synthetic d(Lx7/l;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->j(Lx7/l;)V

    return-void
.end method

.method public static final synthetic e(Lcom/zykj/merge/sketch/view/BlackBoardProxyView;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->b:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic f(Lcom/zykj/merge/sketch/view/BlackBoardProxyView;)Lcom/zykj/blackboard/core/play/IPlayPageControl;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->c:Lcom/zykj/blackboard/core/play/IPlayPageControl;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic g(Lcom/zykj/merge/sketch/view/BlackBoardProxyView;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->i(Ljava/lang/Runnable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic h(Lcom/zykj/merge/sketch/view/BlackBoardProxyView;Lcom/zykj/blackboard/core/play/IPlayPageControl;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->c:Lcom/zykj/blackboard/core/play/IPlayPageControl;

    .line 2
    .line 3
    return-void
.end method

.method public static final j(Lx7/l;)V
    .locals 1

    .line 1
    const-string v0, "$onFailure"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-interface {p0, v0}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public a(Lx3/c;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->b:Ljava/util/List;

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
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->c:Lcom/zykj/blackboard/core/play/IPlayPageControl;

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
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->c:Lcom/zykj/blackboard/core/play/IPlayPageControl;

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

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->c:Lcom/zykj/blackboard/core/play/IPlayPageControl;

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

.method public b(Lx3/c;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->b:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public c(D)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->c:Lcom/zykj/blackboard/core/play/IPlayPageControl;

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

.method public destroy()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->a:Lcom/zykj/blackboard/core/canvas/SketchPlayView;

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
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->c:Lcom/zykj/blackboard/core/play/IPlayPageControl;

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
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->c:Lcom/zykj/blackboard/core/play/IPlayPageControl;

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
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->c:Lcom/zykj/blackboard/core/play/IPlayPageControl;

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
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->c:Lcom/zykj/blackboard/core/play/IPlayPageControl;

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
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->c:Lcom/zykj/blackboard/core/play/IPlayPageControl;

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

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->c:Lcom/zykj/blackboard/core/play/IPlayPageControl;

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

.method public final i(Ljava/lang/Runnable;)V
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

.method public loadData(Ljava/lang/String;Lx7/l;Lx7/l;)V
    .locals 2

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onSuccess"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onFailure"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->a:Lcom/zykj/blackboard/core/canvas/SketchPlayView;

    .line 17
    .line 18
    new-instance v1, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1;

    .line 19
    .line 20
    invoke-direct {v1, p1, p0, p2, p3}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1;-><init>(Ljava/lang/String;Lcom/zykj/merge/sketch/view/BlackBoardProxyView;Lx7/l;Lx7/l;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/canvas/SketchPlayView;->ready(Lx7/l;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public pause()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->c:Lcom/zykj/blackboard/core/play/IPlayPageControl;

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
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->c:Lcom/zykj/blackboard/core/play/IPlayPageControl;

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

.method public resume()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->c:Lcom/zykj/blackboard/core/play/IPlayPageControl;

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

.method public seekTo(ILx7/l;Lx7/l;)V
    .locals 4

    .line 1
    const-string v0, "onSuccess"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onFailure"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->c:Lcom/zykj/blackboard/core/play/IPlayPageControl;

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
    invoke-direct {v3, p0, p2, p1}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$seekTo$1;-><init>(Lcom/zykj/merge/sketch/view/BlackBoardProxyView;Lx7/l;I)V

    .line 19
    .line 20
    .line 21
    new-instance p1, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$seekTo$2;

    .line 22
    .line 23
    invoke-direct {p1, p0, p3}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$seekTo$2;-><init>(Lcom/zykj/merge/sketch/view/BlackBoardProxyView;Lx7/l;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, v1, v2, v3, p1}, Lcom/zykj/blackboard/core/play/IPlayPageControl;->seekTo(JLx7/a;Lx7/l;)V

    .line 27
    .line 28
    .line 29
    sget-object p1, Lh7/p;->a:Lh7/p;

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
    new-instance p1, Ly3/a;

    .line 36
    .line 37
    invoke-direct {p1, p3}, Ly3/a;-><init>(Lx7/l;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p1}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->i(Ljava/lang/Runnable;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void
.end method

.method public setAreaMoveListener(Lcom/zykj/blackboard/listener/IAreaMoveListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->c:Lcom/zykj/blackboard/core/play/IPlayPageControl;

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

.method public setScaleEnable(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->c:Lcom/zykj/blackboard/core/play/IPlayPageControl;

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
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->c:Lcom/zykj/blackboard/core/play/IPlayPageControl;

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
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->c:Lcom/zykj/blackboard/core/play/IPlayPageControl;

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

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->c:Lcom/zykj/blackboard/core/play/IPlayPageControl;

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
    sget-object v1, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$a;->a:[I

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
    sget-object v0, Lcom/zykj/merge/sketch/constant/PlayStatus;->f:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_2
    sget-object v0, Lcom/zykj/merge/sketch/constant/PlayStatus;->f:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 39
    .line 40
    return-object v0

    .line 41
    :cond_3
    sget-object v0, Lcom/zykj/merge/sketch/constant/PlayStatus;->e:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_4
    sget-object v0, Lcom/zykj/merge/sketch/constant/PlayStatus;->d:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 45
    .line 46
    return-object v0

    .line 47
    :cond_5
    sget-object v0, Lcom/zykj/merge/sketch/constant/PlayStatus;->c:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 48
    .line 49
    return-object v0
.end method

.method public waiting()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->c:Lcom/zykj/blackboard/core/play/IPlayPageControl;

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
