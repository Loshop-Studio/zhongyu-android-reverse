.class public Lcom/xuexiang/xui/widget/imageview/IconImageView;
.super Landroidx/appcompat/widget/AppCompatImageView;
.source "SourceFile"


# instance fields
.field public a:Landroid/graphics/Bitmap;

.field public b:F

.field public c:Landroid/graphics/Paint;

.field public d:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;)V

    const v0, 0x3e99999a    # 0.3f

    .line 2
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/IconImageView;->b:F

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/IconImageView;->d:Z

    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/imageview/IconImageView;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 5
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const v0, 0x3e99999a    # 0.3f

    .line 6
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/IconImageView;->b:F

    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/IconImageView;->d:Z

    .line 8
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/imageview/IconImageView;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 9
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const p3, 0x3e99999a    # 0.3f

    .line 10
    iput p3, p0, Lcom/xuexiang/xui/widget/imageview/IconImageView;->b:F

    const/4 p3, 0x1

    .line 11
    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/imageview/IconImageView;->d:Z

    .line 12
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/imageview/IconImageView;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->IconImageView:[I

    .line 4
    .line 5
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    sget p2, Lcom/xuexiang/xui/R$styleable;->IconImageView_iiv_icon_res:I

    .line 13
    .line 14
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    if-eqz p2, :cond_0

    .line 19
    .line 20
    invoke-static {p2}, Lt6/a;->c(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    iput-object p2, p0, Lcom/xuexiang/xui/widget/imageview/IconImageView;->a:Landroid/graphics/Bitmap;

    .line 25
    .line 26
    :cond_0
    sget p2, Lcom/xuexiang/xui/R$styleable;->IconImageView_iiv_icon_scale:I

    .line 27
    .line 28
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/IconImageView;->b:F

    .line 29
    .line 30
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/IconImageView;->b:F

    .line 35
    .line 36
    sget p2, Lcom/xuexiang/xui/R$styleable;->IconImageView_iiv_is_show:I

    .line 37
    .line 38
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/IconImageView;->d:Z

    .line 39
    .line 40
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/imageview/IconImageView;->d:Z

    .line 45
    .line 46
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 47
    .line 48
    .line 49
    :cond_1
    new-instance p1, Landroid/graphics/Paint;

    .line 50
    .line 51
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/IconImageView;->c:Landroid/graphics/Paint;

    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    sget v0, Lcom/xuexiang/xui/R$attr;->colorAccent:I

    .line 61
    .line 62
    const/4 v1, 0x0

    .line 63
    invoke-static {p2, v0, v1}, Lkotlin/collections/u;->F(Landroid/content/Context;II)I

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 68
    .line 69
    .line 70
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/IconImageView;->c:Landroid/graphics/Paint;

    .line 71
    .line 72
    const/4 p2, 0x1

    .line 73
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 74
    .line 75
    .line 76
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/IconImageView;->c:Landroid/graphics/Paint;

    .line 77
    .line 78
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 79
    .line 80
    .line 81
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/IconImageView;->c:Landroid/graphics/Paint;

    .line 82
    .line 83
    sget-object p2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 84
    .line 85
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 86
    .line 87
    .line 88
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/IconImageView;->c:Landroid/graphics/Paint;

    .line 89
    .line 90
    sget-object p2, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 91
    .line 92
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/IconImageView;->a:Landroid/graphics/Bitmap;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/imageview/IconImageView;->d:Z

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    int-to-float v1, v1

    .line 17
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    int-to-float v2, v2

    .line 22
    cmpl-float v3, v1, v2

    .line 23
    .line 24
    if-ltz v3, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    int-to-float v3, v3

    .line 31
    div-float/2addr v3, v1

    .line 32
    mul-float/2addr v3, v2

    .line 33
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    int-to-float v1, v1

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    int-to-float v3, v3

    .line 44
    div-float/2addr v3, v2

    .line 45
    mul-float/2addr v1, v3

    .line 46
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    int-to-float v3, v2

    .line 51
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    int-to-float v2, v2

    .line 56
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/IconImageView;->b:F

    .line 57
    .line 58
    const/high16 v5, 0x40000000    # 2.0f

    .line 59
    .line 60
    invoke-static {v1, v4, v2, v5}, Landroidx/compose/material3/c;->a(FFFF)F

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    int-to-float v2, v2

    .line 69
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/IconImageView;->b:F

    .line 70
    .line 71
    invoke-static {v3, v4, v2, v5}, Landroidx/compose/material3/c;->a(FFFF)F

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    int-to-float v3, v3

    .line 80
    sub-float/2addr v3, v1

    .line 81
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    int-to-float v4, v4

    .line 86
    sub-float/2addr v4, v2

    .line 87
    new-instance v5, Landroid/graphics/RectF;

    .line 88
    .line 89
    invoke-direct {v5, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 90
    .line 91
    .line 92
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/IconImageView;->c:Landroid/graphics/Paint;

    .line 93
    .line 94
    const/4 v2, 0x0

    .line 95
    invoke-virtual {p1, v0, v2, v5, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 96
    .line 97
    .line 98
    :cond_1
    return-void
.end method
