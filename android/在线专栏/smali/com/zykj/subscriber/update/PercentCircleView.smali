.class public Lcom/zykj/subscriber/update/PercentCircleView;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private a:Landroid/graphics/Paint;

.field private b:Landroid/graphics/Paint;

.field private c:Landroid/graphics/Paint;

.field private d:Landroid/graphics/Paint;

.field private e:I

.field private f:I

.field private g:F

.field private h:Landroid/graphics/RectF;

.field private i:F

.field private j:I

.field private k:Ljava/lang/String;

.field private l:I

.field private m:I

.field private n:I

.field private o:I

.field private p:I

.field private q:I

.field private r:I

.field private s:I

.field private t:I

.field private u:I

.field private v:I

.field private w:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/zykj/subscriber/update/PercentCircleView;->g:F

    const/16 v0, 0x7b

    .line 3
    iput v0, p0, Lcom/zykj/subscriber/update/PercentCircleView;->j:I

    const-string v1, "0%"

    .line 4
    iput-object v1, p0, Lcom/zykj/subscriber/update/PercentCircleView;->k:Ljava/lang/String;

    .line 5
    iput v0, p0, Lcom/zykj/subscriber/update/PercentCircleView;->l:I

    const/4 v0, -0x1

    .line 6
    iput v0, p0, Lcom/zykj/subscriber/update/PercentCircleView;->m:I

    const v0, 0xf3f3f3

    .line 7
    iput v0, p0, Lcom/zykj/subscriber/update/PercentCircleView;->o:I

    const v0, 0x27c69a

    .line 8
    iput v0, p0, Lcom/zykj/subscriber/update/PercentCircleView;->q:I

    const/16 v0, 0x1e

    .line 9
    iput v0, p0, Lcom/zykj/subscriber/update/PercentCircleView;->s:I

    const/high16 v0, -0x5a000000

    .line 10
    iput v0, p0, Lcom/zykj/subscriber/update/PercentCircleView;->t:I

    const/16 v0, 0xa

    .line 11
    iput v0, p0, Lcom/zykj/subscriber/update/PercentCircleView;->v:I

    .line 12
    sget-object v0, Lc2/v;->x1:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 13
    iget p2, p0, Lcom/zykj/subscriber/update/PercentCircleView;->j:I

    const/4 v0, 0x2

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/zykj/subscriber/update/PercentCircleView;->l:I

    .line 14
    iget p2, p0, Lcom/zykj/subscriber/update/PercentCircleView;->m:I

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/zykj/subscriber/update/PercentCircleView;->n:I

    .line 15
    iget p2, p0, Lcom/zykj/subscriber/update/PercentCircleView;->t:I

    const/4 v0, 0x4

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/zykj/subscriber/update/PercentCircleView;->u:I

    .line 16
    iget p2, p0, Lcom/zykj/subscriber/update/PercentCircleView;->o:I

    const/4 v0, 0x3

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/zykj/subscriber/update/PercentCircleView;->p:I

    .line 17
    iget p2, p0, Lcom/zykj/subscriber/update/PercentCircleView;->q:I

    const/4 v0, 0x1

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/zykj/subscriber/update/PercentCircleView;->r:I

    .line 18
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 19
    invoke-direct {p0}, Lcom/zykj/subscriber/update/PercentCircleView;->a()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 20
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x0

    .line 21
    iput p1, p0, Lcom/zykj/subscriber/update/PercentCircleView;->g:F

    const/16 p1, 0x7b

    .line 22
    iput p1, p0, Lcom/zykj/subscriber/update/PercentCircleView;->j:I

    const-string p2, "0%"

    .line 23
    iput-object p2, p0, Lcom/zykj/subscriber/update/PercentCircleView;->k:Ljava/lang/String;

    .line 24
    iput p1, p0, Lcom/zykj/subscriber/update/PercentCircleView;->l:I

    const/4 p1, -0x1

    .line 25
    iput p1, p0, Lcom/zykj/subscriber/update/PercentCircleView;->m:I

    const p1, 0xf3f3f3

    .line 26
    iput p1, p0, Lcom/zykj/subscriber/update/PercentCircleView;->o:I

    const p1, 0x27c69a

    .line 27
    iput p1, p0, Lcom/zykj/subscriber/update/PercentCircleView;->q:I

    const/16 p1, 0x1e

    .line 28
    iput p1, p0, Lcom/zykj/subscriber/update/PercentCircleView;->s:I

    const/high16 p1, -0x5a000000

    .line 29
    iput p1, p0, Lcom/zykj/subscriber/update/PercentCircleView;->t:I

    const/16 p1, 0xa

    .line 30
    iput p1, p0, Lcom/zykj/subscriber/update/PercentCircleView;->v:I

    .line 31
    invoke-direct {p0}, Lcom/zykj/subscriber/update/PercentCircleView;->a()V

    return-void
.end method

.method private a()V
    .locals 3

    const/high16 v0, -0x3d4c0000    # -90.0f

    .line 1
    iput v0, p0, Lcom/zykj/subscriber/update/PercentCircleView;->i:F

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/zykj/subscriber/update/PercentCircleView;->g:F

    .line 3
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/zykj/subscriber/update/PercentCircleView;->b:Landroid/graphics/Paint;

    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 5
    iget-object v0, p0, Lcom/zykj/subscriber/update/PercentCircleView;->b:Landroid/graphics/Paint;

    iget v2, p0, Lcom/zykj/subscriber/update/PercentCircleView;->n:I

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 6
    iget-object v0, p0, Lcom/zykj/subscriber/update/PercentCircleView;->b:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 7
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/zykj/subscriber/update/PercentCircleView;->a:Landroid/graphics/Paint;

    .line 8
    iget v2, p0, Lcom/zykj/subscriber/update/PercentCircleView;->u:I

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 9
    iget-object v0, p0, Lcom/zykj/subscriber/update/PercentCircleView;->a:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 10
    iget-object v0, p0, Lcom/zykj/subscriber/update/PercentCircleView;->a:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 11
    iget-object v0, p0, Lcom/zykj/subscriber/update/PercentCircleView;->a:Landroid/graphics/Paint;

    iget v2, p0, Lcom/zykj/subscriber/update/PercentCircleView;->s:I

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 12
    iget-object v0, p0, Lcom/zykj/subscriber/update/PercentCircleView;->a:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 13
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/zykj/subscriber/update/PercentCircleView;->c:Landroid/graphics/Paint;

    .line 14
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 15
    iget-object v0, p0, Lcom/zykj/subscriber/update/PercentCircleView;->c:Landroid/graphics/Paint;

    iget v2, p0, Lcom/zykj/subscriber/update/PercentCircleView;->p:I

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 16
    iget-object v0, p0, Lcom/zykj/subscriber/update/PercentCircleView;->c:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 17
    iget-object v0, p0, Lcom/zykj/subscriber/update/PercentCircleView;->c:Landroid/graphics/Paint;

    iget v2, p0, Lcom/zykj/subscriber/update/PercentCircleView;->v:I

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 18
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/zykj/subscriber/update/PercentCircleView;->d:Landroid/graphics/Paint;

    .line 19
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 20
    iget-object v0, p0, Lcom/zykj/subscriber/update/PercentCircleView;->d:Landroid/graphics/Paint;

    iget v1, p0, Lcom/zykj/subscriber/update/PercentCircleView;->r:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 21
    iget-object v0, p0, Lcom/zykj/subscriber/update/PercentCircleView;->d:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 22
    iget-object v0, p0, Lcom/zykj/subscriber/update/PercentCircleView;->d:Landroid/graphics/Paint;

    iget v1, p0, Lcom/zykj/subscriber/update/PercentCircleView;->v:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 23
    iget-object v0, p0, Lcom/zykj/subscriber/update/PercentCircleView;->a:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getTextSize()F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/zykj/subscriber/update/PercentCircleView;->s:I

    return-void
.end method

.method private b(I)I
    .locals 3

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 2
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    const/high16 v1, 0x40000000    # 2.0f

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget v1, p0, Lcom/zykj/subscriber/update/PercentCircleView;->l:I

    mul-int/lit8 v1, v1, 0x2

    const/high16 v2, -0x80000000

    if-ne v0, v2, :cond_1

    .line 4
    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    goto :goto_0

    :cond_1
    move p1, v1

    :goto_0
    return p1
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    iget v0, p0, Lcom/zykj/subscriber/update/PercentCircleView;->e:I

    int-to-float v0, v0

    iget v1, p0, Lcom/zykj/subscriber/update/PercentCircleView;->f:I

    int-to-float v1, v1

    iget v2, p0, Lcom/zykj/subscriber/update/PercentCircleView;->l:I

    int-to-float v2, v2

    iget-object v3, p0, Lcom/zykj/subscriber/update/PercentCircleView;->b:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 3
    iget-object v0, p0, Lcom/zykj/subscriber/update/PercentCircleView;->k:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lcom/zykj/subscriber/update/PercentCircleView;->e:I

    int-to-float v1, v1

    iget v2, p0, Lcom/zykj/subscriber/update/PercentCircleView;->f:I

    int-to-float v2, v2

    iget v3, p0, Lcom/zykj/subscriber/update/PercentCircleView;->s:I

    int-to-float v3, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    add-float/2addr v2, v3

    iget-object v3, p0, Lcom/zykj/subscriber/update/PercentCircleView;->a:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 4
    iget-object v1, p0, Lcom/zykj/subscriber/update/PercentCircleView;->w:Landroid/graphics/RectF;

    iget v2, p0, Lcom/zykj/subscriber/update/PercentCircleView;->i:F

    iget-object v5, p0, Lcom/zykj/subscriber/update/PercentCircleView;->c:Landroid/graphics/Paint;

    const/high16 v3, 0x43b40000    # 360.0f

    const/4 v4, 0x0

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 5
    iget-object v1, p0, Lcom/zykj/subscriber/update/PercentCircleView;->h:Landroid/graphics/RectF;

    iget v2, p0, Lcom/zykj/subscriber/update/PercentCircleView;->i:F

    iget v3, p0, Lcom/zykj/subscriber/update/PercentCircleView;->g:F

    iget-object v5, p0, Lcom/zykj/subscriber/update/PercentCircleView;->d:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DrawAllocation"
        }
    .end annotation

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    iput p1, p0, Lcom/zykj/subscriber/update/PercentCircleView;->e:I

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    iput p1, p0, Lcom/zykj/subscriber/update/PercentCircleView;->f:I

    .line 4
    iget p1, p0, Lcom/zykj/subscriber/update/PercentCircleView;->l:I

    iget p2, p0, Lcom/zykj/subscriber/update/PercentCircleView;->e:I

    if-le p1, p2, :cond_0

    .line 5
    iput p2, p0, Lcom/zykj/subscriber/update/PercentCircleView;->l:I

    .line 6
    :cond_0
    new-instance p1, Landroid/graphics/RectF;

    iget p2, p0, Lcom/zykj/subscriber/update/PercentCircleView;->e:I

    iget p3, p0, Lcom/zykj/subscriber/update/PercentCircleView;->l:I

    sub-int p4, p2, p3

    int-to-float p4, p4

    iget p5, p0, Lcom/zykj/subscriber/update/PercentCircleView;->v:I

    int-to-float v0, p5

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    add-float/2addr p4, v0

    iget v0, p0, Lcom/zykj/subscriber/update/PercentCircleView;->f:I

    sub-int v2, v0, p3

    int-to-float v2, v2

    int-to-float v3, p5

    div-float/2addr v3, v1

    add-float/2addr v2, v3

    add-int/2addr p2, p3

    int-to-float p2, p2

    int-to-float v3, p5

    div-float/2addr v3, v1

    sub-float/2addr p2, v3

    add-int/2addr v0, p3

    int-to-float p3, v0

    int-to-float p5, p5

    div-float/2addr p5, v1

    sub-float/2addr p3, p5

    invoke-direct {p1, p4, v2, p2, p3}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object p1, p0, Lcom/zykj/subscriber/update/PercentCircleView;->h:Landroid/graphics/RectF;

    .line 7
    new-instance p1, Landroid/graphics/RectF;

    iget p2, p0, Lcom/zykj/subscriber/update/PercentCircleView;->e:I

    iget p3, p0, Lcom/zykj/subscriber/update/PercentCircleView;->l:I

    sub-int p4, p2, p3

    int-to-float p4, p4

    iget p5, p0, Lcom/zykj/subscriber/update/PercentCircleView;->v:I

    int-to-float v0, p5

    div-float/2addr v0, v1

    add-float/2addr p4, v0

    iget v0, p0, Lcom/zykj/subscriber/update/PercentCircleView;->f:I

    sub-int v2, v0, p3

    int-to-float v2, v2

    int-to-float v3, p5

    div-float/2addr v3, v1

    add-float/2addr v2, v3

    add-int/2addr p2, p3

    int-to-float p2, p2

    int-to-float v3, p5

    div-float/2addr v3, v1

    sub-float/2addr p2, v3

    add-int/2addr v0, p3

    int-to-float p3, v0

    int-to-float p5, p5

    div-float/2addr p5, v1

    sub-float/2addr p3, p5

    invoke-direct {p1, p4, v2, p2, p3}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object p1, p0, Lcom/zykj/subscriber/update/PercentCircleView;->w:Landroid/graphics/RectF;

    return-void
.end method

.method protected onMeasure(II)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/zykj/subscriber/update/PercentCircleView;->b(I)I

    move-result p2

    invoke-direct {p0, p1}, Lcom/zykj/subscriber/update/PercentCircleView;->b(I)I

    move-result p1

    invoke-virtual {p0, p2, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public setTargetPercent(F)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/high16 v1, 0x42c80000    # 100.0f

    mul-float v1, v1, p1

    float-to-int v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "%"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/zykj/subscriber/update/PercentCircleView;->k:Ljava/lang/String;

    const/high16 v0, 0x43b40000    # 360.0f

    mul-float p1, p1, v0

    .line 2
    iput p1, p0, Lcom/zykj/subscriber/update/PercentCircleView;->g:F

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method
