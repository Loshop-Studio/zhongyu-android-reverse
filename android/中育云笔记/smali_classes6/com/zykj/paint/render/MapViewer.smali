.class public Lcom/zykj/paint/render/MapViewer;
.super Landroid/view/View;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "MapViewer"


# instance fields
.field private context:Landroid/content/Context;

.field private index:I

.field private mBitmapPaint:Landroid/graphics/Paint;

.field public mHeight:I

.field public mWidth:I

.field public map:Lcom/zykj/paint/graphic/Map;

.field public mapRender:Lcom/zykj/paint/render/MapRender;

.field public middleX:D

.field public middleY:D

.field public moveX:I

.field public moveY:I

.field public rotate:D

.field public scaleX:F

.field public scaleY:F

.field private startX:I

.field private startY:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const-wide/16 v0, 0x0

    .line 2
    iput-wide v0, p0, Lcom/zykj/paint/render/MapViewer;->middleX:D

    .line 3
    iput-wide v0, p0, Lcom/zykj/paint/render/MapViewer;->middleY:D

    const/high16 v2, 0x3f800000    # 1.0f

    .line 4
    iput v2, p0, Lcom/zykj/paint/render/MapViewer;->scaleX:F

    .line 5
    iput v2, p0, Lcom/zykj/paint/render/MapViewer;->scaleY:F

    .line 6
    iput-wide v0, p0, Lcom/zykj/paint/render/MapViewer;->rotate:D

    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lcom/zykj/paint/render/MapViewer;->moveX:I

    .line 8
    iput v0, p0, Lcom/zykj/paint/render/MapViewer;->moveY:I

    .line 9
    iput v0, p0, Lcom/zykj/paint/render/MapViewer;->index:I

    .line 10
    iput-object p1, p0, Lcom/zykj/paint/render/MapViewer;->context:Landroid/content/Context;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 11
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const-wide/16 v0, 0x0

    .line 12
    iput-wide v0, p0, Lcom/zykj/paint/render/MapViewer;->middleX:D

    .line 13
    iput-wide v0, p0, Lcom/zykj/paint/render/MapViewer;->middleY:D

    const/high16 p2, 0x3f800000    # 1.0f

    .line 14
    iput p2, p0, Lcom/zykj/paint/render/MapViewer;->scaleX:F

    .line 15
    iput p2, p0, Lcom/zykj/paint/render/MapViewer;->scaleY:F

    .line 16
    iput-wide v0, p0, Lcom/zykj/paint/render/MapViewer;->rotate:D

    const/4 p2, 0x0

    .line 17
    iput p2, p0, Lcom/zykj/paint/render/MapViewer;->moveX:I

    .line 18
    iput p2, p0, Lcom/zykj/paint/render/MapViewer;->moveY:I

    .line 19
    iput p2, p0, Lcom/zykj/paint/render/MapViewer;->index:I

    .line 20
    iput-object p1, p0, Lcom/zykj/paint/render/MapViewer;->context:Landroid/content/Context;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 21
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const-wide/16 p2, 0x0

    .line 22
    iput-wide p2, p0, Lcom/zykj/paint/render/MapViewer;->middleX:D

    .line 23
    iput-wide p2, p0, Lcom/zykj/paint/render/MapViewer;->middleY:D

    const/high16 v0, 0x3f800000    # 1.0f

    .line 24
    iput v0, p0, Lcom/zykj/paint/render/MapViewer;->scaleX:F

    .line 25
    iput v0, p0, Lcom/zykj/paint/render/MapViewer;->scaleY:F

    .line 26
    iput-wide p2, p0, Lcom/zykj/paint/render/MapViewer;->rotate:D

    const/4 p2, 0x0

    .line 27
    iput p2, p0, Lcom/zykj/paint/render/MapViewer;->moveX:I

    .line 28
    iput p2, p0, Lcom/zykj/paint/render/MapViewer;->moveY:I

    .line 29
    iput p2, p0, Lcom/zykj/paint/render/MapViewer;->index:I

    .line 30
    iput-object p1, p0, Lcom/zykj/paint/render/MapViewer;->context:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public GeoRect2ViewRect(Lcom/zykj/paint/data/Rect2D;)Lcom/zykj/paint/data/Rect2D;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    new-instance v2, Lcom/zykj/paint/data/Vector2D;

    .line 6
    .line 7
    invoke-direct {v2}, Lcom/zykj/paint/data/Vector2D;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v3, Lcom/zykj/paint/data/Vector2D;

    .line 11
    .line 12
    invoke-direct {v3}, Lcom/zykj/paint/data/Vector2D;-><init>()V

    .line 13
    .line 14
    .line 15
    iget-wide v4, v1, Lcom/zykj/paint/data/Rect2D;->minX:D

    .line 16
    .line 17
    iget v6, v0, Lcom/zykj/paint/render/MapViewer;->scaleX:F

    .line 18
    .line 19
    float-to-double v7, v6

    .line 20
    mul-double/2addr v4, v7

    .line 21
    iput-wide v4, v2, Lcom/zykj/paint/data/Vector2D;->x:D

    .line 22
    .line 23
    iget-wide v4, v1, Lcom/zykj/paint/data/Rect2D;->minY:D

    .line 24
    .line 25
    iget v7, v0, Lcom/zykj/paint/render/MapViewer;->scaleY:F

    .line 26
    .line 27
    float-to-double v8, v7

    .line 28
    mul-double/2addr v4, v8

    .line 29
    iput-wide v4, v2, Lcom/zykj/paint/data/Vector2D;->y:D

    .line 30
    .line 31
    iget-wide v4, v1, Lcom/zykj/paint/data/Rect2D;->maxX:D

    .line 32
    .line 33
    float-to-double v8, v6

    .line 34
    mul-double/2addr v4, v8

    .line 35
    iput-wide v4, v3, Lcom/zykj/paint/data/Vector2D;->x:D

    .line 36
    .line 37
    iget-wide v8, v1, Lcom/zykj/paint/data/Rect2D;->maxY:D

    .line 38
    .line 39
    float-to-double v6, v7

    .line 40
    mul-double/2addr v8, v6

    .line 41
    iput-wide v8, v3, Lcom/zykj/paint/data/Vector2D;->y:D

    .line 42
    .line 43
    new-instance v10, Lcom/zykj/paint/data/Rect2D;

    .line 44
    .line 45
    iget-wide v11, v2, Lcom/zykj/paint/data/Vector2D;->x:D

    .line 46
    .line 47
    iget-wide v13, v2, Lcom/zykj/paint/data/Vector2D;->y:D

    .line 48
    .line 49
    move-wide v15, v4

    .line 50
    move-wide/from16 v17, v8

    .line 51
    .line 52
    invoke-direct/range {v10 .. v18}, Lcom/zykj/paint/data/Rect2D;-><init>(DDDD)V

    .line 53
    .line 54
    .line 55
    return-object v10
.end method

.method public clear()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/render/MapViewer;->map:Lcom/zykj/paint/graphic/Map;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/paint/graphic/Map;->reset()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/paint/render/MapViewer;->mapRender:Lcom/zykj/paint/render/MapRender;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/paint/render/MapRender;->clear()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public destroy()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/render/MapViewer;->mapRender:Lcom/zykj/paint/render/MapRender;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/paint/render/MapRender;->release()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public directRenderAll()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/paint/render/MapViewer;->index:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lcom/zykj/paint/render/MapViewer;->index:I

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public geoVector2ViewVector(Lcom/zykj/paint/data/Vector2D;)Lcom/zykj/paint/data/Vector2D;
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    .line 3
    iget-wide v2, p1, Lcom/zykj/paint/data/Vector2D;->x:D

    iget v4, p0, Lcom/zykj/paint/render/MapViewer;->moveX:I

    int-to-double v4, v4

    add-double/2addr v2, v4

    iget v4, p0, Lcom/zykj/paint/render/MapViewer;->scaleX:F

    float-to-double v4, v4

    mul-double/2addr v2, v4

    float-to-double v4, v0

    add-double/2addr v2, v4

    .line 4
    iget-wide v4, p1, Lcom/zykj/paint/data/Vector2D;->y:D

    iget p1, p0, Lcom/zykj/paint/render/MapViewer;->moveY:I

    int-to-double v6, p1

    add-double/2addr v4, v6

    iget p1, p0, Lcom/zykj/paint/render/MapViewer;->scaleY:F

    float-to-double v6, p1

    mul-double/2addr v4, v6

    float-to-double v0, v1

    add-double/2addr v4, v0

    .line 5
    new-instance p1, Lcom/zykj/paint/data/Vector2D;

    invoke-direct {p1, v2, v3, v4, v5}, Lcom/zykj/paint/data/Vector2D;-><init>(DD)V

    return-object p1
.end method

.method public geoVector2ViewVector(Lcom/zykj/paint/data/Vector2D;Z)Lcom/zykj/paint/data/Vector2D;
    .locals 6

    .line 6
    iget-wide v0, p1, Lcom/zykj/paint/data/Vector2D;->x:D

    iget v2, p0, Lcom/zykj/paint/render/MapViewer;->moveX:I

    int-to-double v2, v2

    add-double/2addr v0, v2

    iget v2, p0, Lcom/zykj/paint/render/MapViewer;->scaleX:F

    float-to-double v2, v2

    mul-double/2addr v0, v2

    .line 7
    iget-wide v2, p1, Lcom/zykj/paint/data/Vector2D;->y:D

    iget p1, p0, Lcom/zykj/paint/render/MapViewer;->moveY:I

    int-to-double v4, p1

    add-double/2addr v2, v4

    iget p1, p0, Lcom/zykj/paint/render/MapViewer;->scaleY:F

    float-to-double v4, p1

    mul-double/2addr v2, v4

    if-eqz p2, :cond_0

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    int-to-float p1, p1

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p2

    div-int/lit8 p2, p2, 0x2

    int-to-float p2, p2

    float-to-double v4, p1

    add-double/2addr v0, v4

    float-to-double p1, p2

    add-double/2addr v2, p1

    .line 10
    :cond_0
    new-instance p1, Lcom/zykj/paint/data/Vector2D;

    invoke-direct {p1, v0, v1, v2, v3}, Lcom/zykj/paint/data/Vector2D;-><init>(DD)V

    return-object p1
.end method

.method public init(Lcom/zykj/paint/graphic/Map;Lcom/zykj/paint/render/MapRender;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lcom/zykj/paint/render/MapViewer;->map:Lcom/zykj/paint/graphic/Map;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/zykj/paint/render/MapViewer;->mapRender:Lcom/zykj/paint/render/MapRender;

    .line 8
    .line 9
    invoke-virtual {p2, p0}, Lcom/zykj/paint/render/MapRender;->init(Lcom/zykj/paint/render/MapViewer;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public moveViewPort(DD)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/paint/render/MapViewer;->moveX:I

    .line 2
    .line 3
    int-to-double v0, v0

    .line 4
    add-double/2addr v0, p1

    .line 5
    double-to-int p1, v0

    .line 6
    iput p1, p0, Lcom/zykj/paint/render/MapViewer;->moveX:I

    .line 7
    .line 8
    iget p1, p0, Lcom/zykj/paint/render/MapViewer;->moveY:I

    .line 9
    .line 10
    int-to-double p1, p1

    .line 11
    add-double/2addr p1, p3

    .line 12
    double-to-int p1, p1

    .line 13
    iput p1, p0, Lcom/zykj/paint/render/MapViewer;->moveY:I

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/paint/render/MapViewer;->map:Lcom/zykj/paint/graphic/Map;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/zykj/paint/render/MapViewer;->mapRender:Lcom/zykj/paint/render/MapRender;

    .line 7
    .line 8
    invoke-virtual {v0, v1, p1}, Lcom/zykj/paint/graphic/Map;->directRender(Lcom/zykj/paint/render/MapRender;Landroid/graphics/Canvas;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onMeasure(II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    float-to-int v0, v0

    .line 23
    iput v0, p0, Lcom/zykj/paint/render/MapViewer;->startX:I

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    float-to-int p1, p1

    .line 30
    iput p1, p0, Lcom/zykj/paint/render/MapViewer;->startY:I

    .line 31
    .line 32
    :goto_0
    const/4 p1, 0x1

    .line 33
    return p1
.end method

.method public render(Lcom/zykj/paint/graphic/Graph;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/render/MapViewer;->mapRender:Lcom/zykj/paint/render/MapRender;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lcom/zykj/paint/graphic/Graph;->render(Lcom/zykj/paint/render/MapRender;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public renderAll()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/render/MapViewer;->map:Lcom/zykj/paint/graphic/Map;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/paint/render/MapViewer;->mapRender:Lcom/zykj/paint/render/MapRender;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/zykj/paint/graphic/Map;->render(Lcom/zykj/paint/render/MapRender;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public renderAllAndUpdateMatrix()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/paint/render/MapViewer;->index:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lcom/zykj/paint/render/MapViewer;->index:I

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v1, "\u7533\u8bf7\u7b2c"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    iget v1, p0, Lcom/zykj/paint/render/MapViewer;->index:I

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, "\u6b21\u7ed8\u5236"

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v1, "MapViewer"

    .line 32
    .line 33
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public renderBezierLine(Ljava/util/List;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/paint/Actions$EzyPoint;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/render/MapViewer;->mapRender:Lcom/zykj/paint/render/MapRender;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lcom/zykj/paint/render/MapRender;->drawBezierLine(Ljava/util/List;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public scaleViewPort(DD)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "scale-->"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "MapViewer"

    .line 19
    .line 20
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    double-to-float p1, p1

    .line 24
    iput p1, p0, Lcom/zykj/paint/render/MapViewer;->scaleX:F

    .line 25
    .line 26
    double-to-float p1, p3

    .line 27
    iput p1, p0, Lcom/zykj/paint/render/MapViewer;->scaleY:F

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 30
    .line 31
    .line 32
    return-void
.end method
