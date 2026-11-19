.class public Lcom/zykj/satisfaction/update/PercentCircleView;
.super Landroid/view/View;
.source ""


# instance fields
.field public b:Landroid/graphics/Paint;

.field public c:Landroid/graphics/Paint;

.field public d:Landroid/graphics/Paint;

.field public e:Landroid/graphics/Paint;

.field public f:I

.field public g:I

.field public h:F

.field public i:Landroid/graphics/RectF;

.field public j:F

.field public k:I

.field public l:Ljava/lang/String;

.field public m:I

.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:I

.field public u:I

.field public v:I

.field public w:I

.field public x:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    iput v0, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->h:F

    const/16 v1, 0x7b

    iput v1, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->k:I

    const-string v2, "0%"

    iput-object v2, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->l:Ljava/lang/String;

    iput v1, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->m:I

    const/4 v1, -0x1

    iput v1, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->n:I

    const v1, 0xf3f3f3

    iput v1, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->p:I

    const v1, 0x27c69a

    iput v1, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->r:I

    const/16 v1, 0x1e

    iput v1, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->t:I

    const/high16 v1, -0x5a000000

    iput v1, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->u:I

    const/16 v1, 0xa

    iput v1, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->w:I

    sget-object v1, Lb/d/b/g;->a:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    iget p2, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->k:I

    const/4 v1, 0x2

    invoke-virtual {p1, v1, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->m:I

    iget p2, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->n:I

    const/4 v1, 0x0

    invoke-virtual {p1, v1, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->o:I

    iget p2, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->u:I

    const/4 v1, 0x4

    invoke-virtual {p1, v1, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->v:I

    iget p2, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->p:I

    const/4 v1, 0x3

    invoke-virtual {p1, v1, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->q:I

    iget p2, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->r:I

    const/4 v1, 0x1

    invoke-virtual {p1, v1, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->s:I

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    const/high16 p1, -0x3d4c0000    # -90.0f

    .line 1
    iput p1, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->j:F

    iput v0, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->h:F

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->c:Landroid/graphics/Paint;

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object p1, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->c:Landroid/graphics/Paint;

    iget p2, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->o:I

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->c:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->b:Landroid/graphics/Paint;

    iget p2, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->v:I

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->b:Landroid/graphics/Paint;

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object p1, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->b:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object p1, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->b:Landroid/graphics/Paint;

    iget p2, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->t:I

    int-to-float p2, p2

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object p1, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->b:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object p1, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->d:Landroid/graphics/Paint;

    iget p2, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->q:I

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->d:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object p1, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->d:Landroid/graphics/Paint;

    iget p2, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->w:I

    int-to-float p2, p2

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->e:Landroid/graphics/Paint;

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object p1, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->e:Landroid/graphics/Paint;

    iget p2, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->s:I

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->e:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object p1, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->e:Landroid/graphics/Paint;

    iget p2, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->w:I

    int-to-float p2, p2

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object p1, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->b:Landroid/graphics/Paint;

    invoke-virtual {p1}, Landroid/graphics/Paint;->getTextSize()F

    move-result p1

    float-to-int p1, p1

    iput p1, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->t:I

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 3

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    const/high16 v1, 0x40000000    # 2.0f

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget v1, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->m:I

    mul-int/lit8 v1, v1, 0x2

    const/high16 v2, -0x80000000

    if-ne v0, v2, :cond_1

    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    goto :goto_0

    :cond_1
    move p1, v1

    :goto_0
    return p1
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 6

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    iget v0, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->f:I

    int-to-float v0, v0

    iget v1, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->g:I

    int-to-float v1, v1

    iget v2, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->m:I

    int-to-float v2, v2

    iget-object v3, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->c:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget-object v0, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->l:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->f:I

    int-to-float v1, v1

    iget v2, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->g:I

    int-to-float v2, v2

    iget v3, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->t:I

    int-to-float v3, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    add-float/2addr v3, v2

    iget-object v2, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->b:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v3, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    iget-object v1, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->x:Landroid/graphics/RectF;

    iget v2, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->j:F

    iget-object v5, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->d:Landroid/graphics/Paint;

    const/high16 v3, 0x43b40000    # 360.0f

    const/4 v4, 0x0

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    iget-object v1, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->i:Landroid/graphics/RectF;

    iget v2, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->j:F

    iget v3, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->h:F

    iget-object v5, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->e:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DrawAllocation"
        }
    .end annotation

    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    iput p1, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->f:I

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    iput p1, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->g:I

    iget p1, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->m:I

    iget p2, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->f:I

    if-le p1, p2, :cond_0

    iput p2, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->m:I

    :cond_0
    new-instance p1, Landroid/graphics/RectF;

    iget p2, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->f:I

    iget p3, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->m:I

    sub-int p4, p2, p3

    int-to-float p4, p4

    iget p5, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->w:I

    int-to-float v0, p5

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    add-float/2addr v0, p4

    iget p4, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->g:I

    sub-int v2, p4, p3

    int-to-float v2, v2

    int-to-float v3, p5

    div-float/2addr v3, v1

    add-float/2addr v3, v2

    add-int/2addr p2, p3

    int-to-float p2, p2

    int-to-float v2, p5

    div-float/2addr v2, v1

    sub-float/2addr p2, v2

    add-int/2addr p4, p3

    int-to-float p3, p4

    int-to-float p4, p5

    div-float/2addr p4, v1

    sub-float/2addr p3, p4

    invoke-direct {p1, v0, v3, p2, p3}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object p1, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->i:Landroid/graphics/RectF;

    new-instance p1, Landroid/graphics/RectF;

    iget p2, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->f:I

    iget p3, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->m:I

    sub-int p4, p2, p3

    int-to-float p4, p4

    iget p5, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->w:I

    int-to-float v0, p5

    div-float/2addr v0, v1

    add-float/2addr v0, p4

    iget p4, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->g:I

    sub-int v2, p4, p3

    int-to-float v2, v2

    int-to-float v3, p5

    div-float/2addr v3, v1

    add-float/2addr v3, v2

    add-int/2addr p2, p3

    int-to-float p2, p2

    int-to-float v2, p5

    div-float/2addr v2, v1

    sub-float/2addr p2, v2

    add-int/2addr p4, p3

    int-to-float p3, p4

    int-to-float p4, p5

    div-float/2addr p4, v1

    sub-float/2addr p3, p4

    invoke-direct {p1, v0, v3, p2, p3}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object p1, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->x:Landroid/graphics/RectF;

    return-void
.end method

.method public onMeasure(II)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/zykj/satisfaction/update/PercentCircleView;->a(I)I

    move-result p2

    invoke-virtual {p0, p1}, Lcom/zykj/satisfaction/update/PercentCircleView;->a(I)I

    move-result p1

    invoke-virtual {p0, p2, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public setTargetPercent(F)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/high16 v1, 0x42c80000    # 100.0f

    mul-float/2addr v1, p1

    float-to-int v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "%"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->l:Ljava/lang/String;

    const/high16 v0, 0x43b40000    # 360.0f

    mul-float/2addr p1, v0

    iput p1, p0, Lcom/zykj/satisfaction/update/PercentCircleView;->h:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method
