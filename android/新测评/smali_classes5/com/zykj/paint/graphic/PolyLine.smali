.class public Lcom/zykj/paint/graphic/PolyLine;
.super Lcom/zykj/paint/graphic/Graph;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "PolyLine"


# instance fields
.field public pointList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/paint/data/Vector2D;",
            ">;"
        }
    .end annotation
.end field

.field public width:D


# direct methods
.method public constructor <init>(Lcom/zykj/paint/graphic/Map;)V
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
    iput-object v0, p0, Lcom/zykj/paint/graphic/PolyLine;->pointList:Ljava/util/List;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/zykj/paint/graphic/Graph;->map:Lcom/zykj/paint/graphic/Map;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public directRender(Lcom/zykj/paint/render/MapRender;Landroid/graphics/Canvas;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/paint/graphic/Graph;->isVisable()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 3
    iget-object v1, p0, Lcom/zykj/paint/graphic/Graph;->graphMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 4
    iget-object v1, p0, Lcom/zykj/paint/graphic/Graph;->matrix:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 5
    iget-object v1, p0, Lcom/zykj/paint/graphic/PolyLine;->pointList:Ljava/util/List;

    invoke-virtual {p0}, Lcom/zykj/paint/graphic/Graph;->getBaseColor()I

    move-result v2

    invoke-virtual {p1, v1, p2, v0, v2}, Lcom/zykj/paint/render/MapRender;->directDrawPolyLine(Ljava/util/List;Landroid/graphics/Canvas;Landroid/graphics/Matrix;I)V

    return-void
.end method

.method public directRender(Lcom/zykj/paint/render/MapRender;Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V
    .locals 2

    .line 6
    invoke-virtual {p0}, Lcom/zykj/paint/graphic/Graph;->isVisable()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/zykj/paint/graphic/PolyLine;->pointList:Ljava/util/List;

    invoke-virtual {p0}, Lcom/zykj/paint/graphic/Graph;->getBaseColor()I

    move-result v1

    invoke-virtual {p1, v0, p2, p3, v1}, Lcom/zykj/paint/render/MapRender;->directDrawPolyLine(Ljava/util/List;Landroid/graphics/Canvas;Landroid/graphics/Matrix;I)V

    return-void
.end method

.method public getBoundBox()Lcom/zykj/paint/data/Rect2D;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/graphic/PolyLine;->pointList:Ljava/util/List;

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
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lcom/zykj/paint/data/Vector2D;

    .line 26
    .line 27
    iget-object v2, p0, Lcom/zykj/paint/graphic/Graph;->mBoundBox:Lcom/zykj/paint/data/Rect2D;

    .line 28
    .line 29
    invoke-static {v2, v1}, Lcom/zykj/paint/data/Rect2D;->nestPoint(Lcom/zykj/paint/data/Rect2D;Lcom/zykj/paint/data/Vector2D;)Lcom/zykj/paint/data/Rect2D;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    iput-object v1, p0, Lcom/zykj/paint/graphic/Graph;->mBoundBox:Lcom/zykj/paint/data/Rect2D;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    iget-object v0, p0, Lcom/zykj/paint/graphic/Graph;->mBoundBox:Lcom/zykj/paint/data/Rect2D;

    .line 37
    .line 38
    return-object v0
.end method

.method public render(Lcom/zykj/paint/render/MapRender;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/paint/graphic/Graph;->isVisable()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p1, Lcom/zykj/paint/render/MapRender;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lcom/zykj/paint/graphic/Graph;->getBaseColor()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 3
    iget-object v0, p1, Lcom/zykj/paint/render/MapRender;->mPaint:Landroid/graphics/Paint;

    iget-wide v1, p0, Lcom/zykj/paint/graphic/PolyLine;->width:D

    double-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 4
    iget-object v0, p0, Lcom/zykj/paint/graphic/PolyLine;->pointList:Ljava/util/List;

    invoke-virtual {p1, v0}, Lcom/zykj/paint/render/MapRender;->drawPolyLine(Ljava/util/List;)V

    return-void
.end method

.method public render(Lcom/zykj/paint/render/MapRender;Lcom/zykj/paint/data/Rect2D;)V
    .locals 0

    .line 5
    invoke-virtual {p0, p1}, Lcom/zykj/paint/graphic/PolyLine;->render(Lcom/zykj/paint/render/MapRender;)V

    return-void
.end method
