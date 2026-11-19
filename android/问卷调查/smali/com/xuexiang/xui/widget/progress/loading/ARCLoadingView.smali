.class public Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;
.super Landroid/view/View;
.source ""


# instance fields
.field public b:Z

.field public c:Landroid/graphics/Paint;

.field public d:I

.field public e:I

.field public f:Landroid/graphics/RectF;

.field public g:I

.field public h:F

.field public i:I

.field public j:Landroid/graphics/Bitmap;

.field public k:F

.field public l:Landroid/graphics/Paint;

.field public m:[I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 v0, 0xa

    iput v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->g:I

    .line 1
    sget-object v0, Lb/c/a/b;->d:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 2
    sget-object v0, La/h/c/a;->a:Ljava/lang/Object;

    const v0, 0x7f060141

    invoke-static {p1, v0}, La/h/c/a$d;->a(Landroid/content/Context;I)I

    move-result v0

    const v1, 0x7f04015c

    .line 3
    invoke-static {p1, v1, v0}, Lb/c/a/a;->B(Landroid/content/Context;II)I

    move-result p1

    const/4 v0, 0x3

    .line 4
    invoke-virtual {p2, v0, p1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->e:I

    const/16 p1, 0x13b

    const/4 v0, 0x0

    invoke-virtual {p2, v0, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->h:F

    const/4 p1, 0x2

    new-array v1, p1, [I

    aput v0, v1, v0

    iget v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->e:I

    const/4 v2, 0x1

    aput v0, v1, v2

    iput-object v1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->m:[I

    const/16 v0, 0x8

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const/high16 v3, 0x40c00000    # 6.0f

    invoke-static {v1, v3}, Lb/c/a/a;->h(Landroid/content/Context;F)I

    move-result v1

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->d:I

    const/4 v0, 0x7

    const/4 v1, 0x5

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->i:I

    invoke-virtual {p2, p1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->b:Z

    const/4 p1, 0x4

    invoke-virtual {p2, p1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 5
    invoke-virtual {p2, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_1

    .line 6
    :cond_0
    sget-object p1, Lb/c/a/c;->b:Lb/c/a/c;

    if-nez p1, :cond_2

    const-class p1, Lb/c/a/c;

    monitor-enter p1

    :try_start_0
    sget-object v0, Lb/c/a/c;->b:Lb/c/a/c;

    if-nez v0, :cond_1

    new-instance v0, Lb/c/a/c;

    invoke-direct {v0}, Lb/c/a/c;-><init>()V

    sput-object v0, Lb/c/a/c;->b:Lb/c/a/c;

    :cond_1
    monitor-exit p1

    goto :goto_0

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2

    :cond_2
    :goto_0
    sget-object p1, Lb/c/a/c;->b:Lb/c/a/c;

    .line 7
    iget-object p1, p1, Lb/c/a/c;->a:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_3

    .line 8
    :goto_1
    invoke-static {p1}, Lb/c/a/a;->k(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->j:Landroid/graphics/Bitmap;

    :cond_3
    const/4 p1, 0x6

    const/high16 v0, 0x3f000000    # 0.5f

    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->k:F

    :cond_4
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 9
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->c:Landroid/graphics/Paint;

    iget p2, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->e:I

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->c:Landroid/graphics/Paint;

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->c:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->c:Landroid/graphics/Paint;

    iget p2, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->d:I

    int-to-float p2, p2

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->l:Landroid/graphics/Paint;

    iget p2, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->e:I

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->l:Landroid/graphics/Paint;

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->l:Landroid/graphics/Paint;

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->l:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->l:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    return-void
.end method


# virtual methods
.method public getIconScale()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->k:F

    return v0
.end method

.method public getLoadingColor()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->e:I

    return v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 12

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->b:Z

    if-nez v0, :cond_0

    return-void

    .line 1
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->j:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 2
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    int-to-float v3, v3

    cmpl-float v4, v2, v3

    if-ltz v4, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v4, v2

    mul-float/2addr v4, v3

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v4, v3

    mul-float/2addr v2, v4

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-float v4, v3

    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    iget v5, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->k:F

    mul-float/2addr v2, v5

    sub-float/2addr v3, v2

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v3, v2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v5

    int-to-float v5, v5

    iget v6, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->k:F

    mul-float/2addr v4, v6

    sub-float/2addr v5, v4

    div-float/2addr v5, v2

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    int-to-float v4, v4

    sub-float/2addr v4, v5

    new-instance v6, Landroid/graphics/RectF;

    invoke-direct {v6, v3, v5, v2, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 3
    iget-object v2, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->l:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v6, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->c:Landroid/graphics/Paint;

    .line 4
    new-instance v2, Landroid/graphics/SweepGradient;

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v3

    shr-int/lit8 v3, v3, 0x1

    int-to-float v3, v3

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v4

    shr-int/lit8 v4, v4, 0x1

    int-to-float v4, v4

    iget-object v5, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->m:[I

    invoke-direct {v2, v3, v4, v5, v1}, Landroid/graphics/SweepGradient;-><init>(FF[I[F)V

    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iget v3, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->g:I

    int-to-float v3, v3

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v4

    shr-int/lit8 v4, v4, 0x1

    int-to-float v4, v4

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v5

    shr-int/lit8 v5, v5, 0x1

    int-to-float v5, v5

    invoke-virtual {v1, v3, v4, v5}, Landroid/graphics/Matrix;->setRotate(FFF)V

    invoke-virtual {v2, v1}, Landroid/graphics/SweepGradient;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 5
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    iget-object v7, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->f:Landroid/graphics/RectF;

    iget v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->g:I

    int-to-float v8, v0

    iget v9, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->h:F

    const/4 v10, 0x0

    iget-object v11, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->c:Landroid/graphics/Paint;

    move-object v6, p1

    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    iget p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->g:I

    iget v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->i:I

    add-int/2addr p1, v0

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->g:I

    const/16 v0, 0x168

    if-le p1, v0, :cond_3

    sub-int/2addr p1, v0

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->g:I

    .line 6
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 3

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    new-instance p3, Landroid/graphics/RectF;

    iget p4, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->d:I

    mul-int/lit8 v0, p4, 0x2

    int-to-float v0, v0

    mul-int/lit8 v1, p4, 0x2

    int-to-float v1, v1

    mul-int/lit8 v2, p4, 0x2

    sub-int/2addr p1, v2

    int-to-float p1, p1

    mul-int/lit8 p4, p4, 0x2

    sub-int/2addr p2, p4

    int-to-float p2, p2

    invoke-direct {p3, v0, v1, p1, p2}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->f:Landroid/graphics/RectF;

    return-void
.end method
