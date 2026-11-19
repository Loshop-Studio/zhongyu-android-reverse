.class public Lcom/zykj/paint/graphic/Layer;
.super Lcom/zykj/paint/graphic/Graph;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "Layer"


# instance fields
.field public graphList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/paint/graphic/Graph;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/paint/graphic/Graph;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/zykj/paint/graphic/Layer;->graphList:Ljava/util/List;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public directRender(Lcom/zykj/paint/render/MapRender;Landroid/graphics/Canvas;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/paint/graphic/Graph;->isVisable()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/zykj/paint/graphic/Layer;->graphList:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    :goto_0
    if-ge v1, v0, :cond_1

    .line 16
    .line 17
    iget-object v2, p0, Lcom/zykj/paint/graphic/Layer;->graphList:Ljava/util/List;

    .line 18
    .line 19
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lcom/zykj/paint/graphic/Graph;

    .line 24
    .line 25
    invoke-virtual {v2, p1, p2}, Lcom/zykj/paint/graphic/Graph;->directRender(Lcom/zykj/paint/render/MapRender;Landroid/graphics/Canvas;)V

    .line 26
    .line 27
    .line 28
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    :goto_1
    return-void
.end method

.method public findGraph(I)Lcom/zykj/paint/graphic/Graph;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/graphic/Layer;->graphList:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-ge v1, v0, :cond_1

    .line 9
    .line 10
    iget-object v2, p0, Lcom/zykj/paint/graphic/Layer;->graphList:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Lcom/zykj/paint/graphic/Graph;

    .line 17
    .line 18
    iget v3, v2, Lcom/zykj/paint/graphic/Graph;->graphId:I

    .line 19
    .line 20
    if-ne v3, p1, :cond_0

    .line 21
    .line 22
    return-object v2

    .line 23
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 p1, 0x0

    .line 27
    return-object p1
.end method

.method public getBoundBox()Lcom/zykj/paint/data/Rect2D;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/graphic/Layer;->graphList:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/zykj/paint/data/Rect2D;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/zykj/paint/data/Rect2D;-><init>()V

    .line 8
    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    if-ge v1, v0, :cond_1

    .line 17
    .line 18
    iget-object v2, p0, Lcom/zykj/paint/graphic/Graph;->mBoundBox:Lcom/zykj/paint/data/Rect2D;

    .line 19
    .line 20
    iget-object v3, p0, Lcom/zykj/paint/graphic/Layer;->graphList:Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Lcom/zykj/paint/graphic/Graph;

    .line 27
    .line 28
    invoke-virtual {v3}, Lcom/zykj/paint/graphic/Graph;->getBoundBox()Lcom/zykj/paint/data/Rect2D;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-static {v2, v3}, Lcom/zykj/paint/data/Rect2D;->nestRect(Lcom/zykj/paint/data/Rect2D;Lcom/zykj/paint/data/Rect2D;)Lcom/zykj/paint/data/Rect2D;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    iput-object v2, p0, Lcom/zykj/paint/graphic/Graph;->mBoundBox:Lcom/zykj/paint/data/Rect2D;

    .line 37
    .line 38
    add-int/lit8 v1, v1, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    iget-object v0, p0, Lcom/zykj/paint/graphic/Graph;->mBoundBox:Lcom/zykj/paint/data/Rect2D;

    .line 42
    .line 43
    return-object v0
.end method

.method public hide(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/graphic/Layer;->graphList:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    :goto_0
    if-ge v2, v0, :cond_1

    .line 10
    .line 11
    iget-object v3, p0, Lcom/zykj/paint/graphic/Layer;->graphList:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Lcom/zykj/paint/graphic/Graph;

    .line 18
    .line 19
    iget v4, v3, Lcom/zykj/paint/graphic/Graph;->graphId:I

    .line 20
    .line 21
    if-ne v4, p1, :cond_0

    .line 22
    .line 23
    invoke-virtual {v3, v1}, Lcom/zykj/paint/graphic/Graph;->setVisable(Z)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-virtual {v3, p1}, Lcom/zykj/paint/graphic/Graph;->hide(I)V

    .line 28
    .line 29
    .line 30
    add-int/lit8 v2, v2, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    return-void
.end method

.method public render(Lcom/zykj/paint/render/MapRender;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/paint/graphic/Graph;->isVisable()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    iget-object v0, p1, Lcom/zykj/paint/render/MapRender;->mScreenCanvas:Landroid/graphics/Canvas;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 3
    iget-object v0, p1, Lcom/zykj/paint/render/MapRender;->mCanvas:Landroid/graphics/Canvas;

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 4
    iget-object v0, p0, Lcom/zykj/paint/graphic/Layer;->graphList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 5
    iget-object v1, p0, Lcom/zykj/paint/graphic/Layer;->graphList:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/zykj/paint/graphic/Graph;

    invoke-virtual {v1, p1}, Lcom/zykj/paint/graphic/Graph;->render(Lcom/zykj/paint/render/MapRender;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public render(Lcom/zykj/paint/render/MapRender;Lcom/zykj/paint/data/Rect2D;)V
    .locals 3

    .line 6
    invoke-virtual {p0}, Lcom/zykj/paint/graphic/Graph;->isVisable()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/zykj/paint/graphic/Layer;->graphList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/zykj/paint/graphic/Graph;

    if-eqz p2, :cond_1

    .line 8
    invoke-virtual {v1}, Lcom/zykj/paint/graphic/Graph;->getBoundBox()Lcom/zykj/paint/data/Rect2D;

    move-result-object v2

    invoke-virtual {p2, v2}, Lcom/zykj/paint/data/Rect2D;->isRectCross(Lcom/zykj/paint/data/Rect2D;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 9
    invoke-virtual {v1, p1, p2}, Lcom/zykj/paint/graphic/Graph;->render(Lcom/zykj/paint/render/MapRender;Lcom/zykj/paint/data/Rect2D;)V

    goto :goto_0

    .line 10
    :cond_1
    invoke-virtual {v1, p1}, Lcom/zykj/paint/graphic/Graph;->render(Lcom/zykj/paint/render/MapRender;)V

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method
