.class public Lcom/zykj/paint/draw/PolylineDrawer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/paint/draw/ISketchDraw;


# static fields
.field private static final TAG:Ljava/lang/String; = "PolylineDrawer"

.field private static final TOUCH_TOLERANCE:F = 4.0f


# instance fields
.field private mPaint:Landroid/graphics/Paint;

.field private mPath:Landroid/graphics/Path;

.field private mX:F

.field private mY:F

.field private m_hasDrawn:Z


# direct methods
.method public constructor <init>(Landroid/graphics/Paint;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Path;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/zykj/paint/draw/PolylineDrawer;->mPath:Landroid/graphics/Path;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lcom/zykj/paint/draw/PolylineDrawer;->m_hasDrawn:Z

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput v0, p0, Lcom/zykj/paint/draw/PolylineDrawer;->mX:F

    .line 16
    .line 17
    iput v0, p0, Lcom/zykj/paint/draw/PolylineDrawer;->mY:F

    .line 18
    .line 19
    iput-object p1, p0, Lcom/zykj/paint/draw/PolylineDrawer;->mPaint:Landroid/graphics/Paint;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public cleanAll()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/draw/PolylineDrawer;->mPath:Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/draw/PolylineDrawer;->mPath:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/zykj/paint/draw/PolylineDrawer;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :cond_0
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;Ljava/util/List;Z)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Canvas;",
            "Ljava/util/List<",
            "Lcom/zykj/paint/Actions$EzyPoint;",
            ">;Z)V"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    .line 2
    const-string p3, "PolylineDrawer"

    const-string v1, "[\u7b2c\u4e00\u4e2a\u70b9]"

    invoke-static {p3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/zykj/paint/Actions$EzyPoint;

    .line 4
    invoke-virtual {p3}, Lcom/zykj/paint/Actions$EzyPoint;->getX()D

    move-result-wide v1

    double-to-float v1, v1

    .line 5
    invoke-virtual {p3}, Lcom/zykj/paint/Actions$EzyPoint;->getY()D

    move-result-wide v2

    double-to-float p3, v2

    .line 6
    new-instance v2, Landroid/graphics/Path;

    invoke-direct {v2}, Landroid/graphics/Path;-><init>()V

    iput-object v2, p0, Lcom/zykj/paint/draw/PolylineDrawer;->mPath:Landroid/graphics/Path;

    .line 7
    invoke-virtual {v2, v1, p3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 8
    iput v1, p0, Lcom/zykj/paint/draw/PolylineDrawer;->mX:F

    .line 9
    iput p3, p0, Lcom/zykj/paint/draw/PolylineDrawer;->mY:F

    .line 10
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    :goto_0
    if-ge v0, p3, :cond_1

    .line 11
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/zykj/paint/Actions$EzyPoint;

    .line 12
    invoke-virtual {v1}, Lcom/zykj/paint/Actions$EzyPoint;->getX()D

    move-result-wide v2

    double-to-float v2, v2

    .line 13
    invoke-virtual {v1}, Lcom/zykj/paint/Actions$EzyPoint;->getY()D

    move-result-wide v3

    double-to-float v1, v3

    .line 14
    iget-object v3, p0, Lcom/zykj/paint/draw/PolylineDrawer;->mPath:Landroid/graphics/Path;

    iget v4, p0, Lcom/zykj/paint/draw/PolylineDrawer;->mX:F

    iget v5, p0, Lcom/zykj/paint/draw/PolylineDrawer;->mY:F

    add-float v6, v2, v4

    const/high16 v7, 0x40000000    # 2.0f

    div-float/2addr v6, v7

    add-float v8, v1, v5

    div-float/2addr v8, v7

    invoke-virtual {v3, v4, v5, v6, v8}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 15
    iput v2, p0, Lcom/zykj/paint/draw/PolylineDrawer;->mX:F

    .line 16
    iput v1, p0, Lcom/zykj/paint/draw/PolylineDrawer;->mY:F

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 17
    :cond_1
    iget-object p2, p0, Lcom/zykj/paint/draw/PolylineDrawer;->mPath:Landroid/graphics/Path;

    iget-object p3, p0, Lcom/zykj/paint/draw/PolylineDrawer;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method

.method public hasDraw()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/paint/draw/PolylineDrawer;->m_hasDrawn:Z

    .line 2
    .line 3
    return v0
.end method

.method public touchDown(FF)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/draw/PolylineDrawer;->mPath:Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/paint/draw/PolylineDrawer;->mPath:Landroid/graphics/Path;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 9
    .line 10
    .line 11
    iput p1, p0, Lcom/zykj/paint/draw/PolylineDrawer;->mX:F

    .line 12
    .line 13
    iput p2, p0, Lcom/zykj/paint/draw/PolylineDrawer;->mY:F

    .line 14
    .line 15
    return-void
.end method

.method public touchMove(FF)V
    .locals 6

    .line 1
    iget v0, p0, Lcom/zykj/paint/draw/PolylineDrawer;->mX:F

    .line 2
    .line 3
    sub-float v0, p1, v0

    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget v1, p0, Lcom/zykj/paint/draw/PolylineDrawer;->mY:F

    .line 10
    .line 11
    sub-float v1, p2, v1

    .line 12
    .line 13
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/high16 v2, 0x40800000    # 4.0f

    .line 18
    .line 19
    cmpl-float v0, v0, v2

    .line 20
    .line 21
    if-gez v0, :cond_1

    .line 22
    .line 23
    cmpl-float v0, v1, v2

    .line 24
    .line 25
    if-ltz v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void

    .line 29
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/zykj/paint/draw/PolylineDrawer;->mPath:Landroid/graphics/Path;

    .line 30
    .line 31
    iget v1, p0, Lcom/zykj/paint/draw/PolylineDrawer;->mX:F

    .line 32
    .line 33
    iget v2, p0, Lcom/zykj/paint/draw/PolylineDrawer;->mY:F

    .line 34
    .line 35
    add-float v3, p1, v1

    .line 36
    .line 37
    const/high16 v4, 0x40000000    # 2.0f

    .line 38
    .line 39
    div-float/2addr v3, v4

    .line 40
    add-float v5, p2, v2

    .line 41
    .line 42
    div-float/2addr v5, v4

    .line 43
    invoke-virtual {v0, v1, v2, v3, v5}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    iput-boolean v0, p0, Lcom/zykj/paint/draw/PolylineDrawer;->m_hasDrawn:Z

    .line 48
    .line 49
    iput p1, p0, Lcom/zykj/paint/draw/PolylineDrawer;->mX:F

    .line 50
    .line 51
    iput p2, p0, Lcom/zykj/paint/draw/PolylineDrawer;->mY:F

    .line 52
    .line 53
    iget-object v0, p0, Lcom/zykj/paint/draw/PolylineDrawer;->mPath:Landroid/graphics/Path;

    .line 54
    .line 55
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public touchUp(FF)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/draw/PolylineDrawer;->mPath:Landroid/graphics/Path;

    .line 2
    .line 3
    iget v1, p0, Lcom/zykj/paint/draw/PolylineDrawer;->mX:F

    .line 4
    .line 5
    iget v2, p0, Lcom/zykj/paint/draw/PolylineDrawer;->mY:F

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 8
    .line 9
    .line 10
    iput p1, p0, Lcom/zykj/paint/draw/PolylineDrawer;->mX:F

    .line 11
    .line 12
    iput p2, p0, Lcom/zykj/paint/draw/PolylineDrawer;->mY:F

    .line 13
    .line 14
    return-void
.end method
