.class public Lcom/xuexiang/xui/widget/imageview/RadiusImageView;
.super Landroidx/appcompat/widget/AppCompatImageView;
.source "SourceFile"


# static fields
.field public static final v:Landroid/graphics/Bitmap$Config;


# instance fields
.field public a:Z

.field public b:Z

.field public c:Z

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:Z

.field public j:I

.field public k:Landroid/graphics/Paint;

.field public final l:Landroid/graphics/Paint;

.field public m:Landroid/graphics/ColorFilter;

.field public n:Landroid/graphics/ColorFilter;

.field public o:Landroid/graphics/BitmapShader;

.field public p:Z

.field public final q:Landroid/graphics/RectF;

.field public r:Landroid/graphics/Bitmap;

.field public final s:Landroid/graphics/Matrix;

.field public t:I

.field public u:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 2
    .line 3
    sput-object v0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->v:Landroid/graphics/Bitmap$Config;

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x0

    .line 1
    sget v1, Lcom/xuexiang/xui/R$attr;->RadiusImageViewStyle:I

    invoke-direct {p0, p1, v0, v1}, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->RadiusImageViewStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->a:Z

    .line 5
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->b:Z

    .line 6
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->c:Z

    const/4 v1, 0x1

    .line 7
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->i:Z

    .line 8
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->p:Z

    .line 9
    new-instance v2, Landroid/graphics/RectF;

    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    iput-object v2, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->q:Landroid/graphics/RectF;

    .line 10
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    iput-object v2, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->l:Landroid/graphics/Paint;

    .line 11
    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 12
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->l:Landroid/graphics/Paint;

    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 13
    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    iput-object v2, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->s:Landroid/graphics/Matrix;

    .line 14
    sget-object v2, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, v2}, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 15
    sget-object v2, Lcom/xuexiang/xui/R$styleable;->RadiusImageView:[I

    invoke-virtual {p1, p2, v2, p3, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 16
    sget p2, Lcom/xuexiang/xui/R$styleable;->RadiusImageView_riv_border_width:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->d:I

    .line 17
    sget p2, Lcom/xuexiang/xui/R$styleable;->RadiusImageView_riv_border_color:I

    const p3, -0x777778

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->e:I

    .line 18
    sget p2, Lcom/xuexiang/xui/R$styleable;->RadiusImageView_riv_selected_border_width:I

    iget p3, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->d:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->f:I

    .line 19
    sget p2, Lcom/xuexiang/xui/R$styleable;->RadiusImageView_riv_selected_border_color:I

    iget p3, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->e:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->g:I

    .line 20
    sget p2, Lcom/xuexiang/xui/R$styleable;->RadiusImageView_riv_selected_mask_color:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->h:I

    if-eqz p2, :cond_0

    .line 21
    new-instance p2, Landroid/graphics/PorterDuffColorFilter;

    iget p3, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->h:I

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->DARKEN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {p2, p3, v2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->n:Landroid/graphics/ColorFilter;

    .line 22
    :cond_0
    sget p2, Lcom/xuexiang/xui/R$styleable;->RadiusImageView_riv_is_touch_select_mode_enabled:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->i:Z

    .line 23
    sget p2, Lcom/xuexiang/xui/R$styleable;->RadiusImageView_riv_is_circle:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->c:Z

    if-nez p2, :cond_1

    .line 24
    sget p2, Lcom/xuexiang/xui/R$styleable;->RadiusImageView_riv_is_oval:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->b:Z

    .line 25
    :cond_1
    iget-boolean p2, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->b:Z

    if-nez p2, :cond_2

    .line 26
    sget p2, Lcom/xuexiang/xui/R$styleable;->RadiusImageView_riv_corner_radius:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->j:I

    .line 27
    :cond_2
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private getBitmap()Landroid/graphics/Bitmap;
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    instance-of v2, v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 10
    .line 11
    if-eqz v2, :cond_6

    .line 12
    .line 13
    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-nez v2, :cond_1

    .line 20
    .line 21
    return-object v1

    .line 22
    :cond_1
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    int-to-float v0, v0

    .line 27
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    int-to-float v3, v3

    .line 32
    const/4 v4, 0x0

    .line 33
    cmpl-float v5, v0, v4

    .line 34
    .line 35
    if-eqz v5, :cond_5

    .line 36
    .line 37
    cmpl-float v4, v3, v4

    .line 38
    .line 39
    if-nez v4, :cond_2

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getMinimumWidth()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    int-to-float v1, v1

    .line 47
    div-float/2addr v1, v0

    .line 48
    invoke-virtual {p0}, Landroid/view/View;->getMinimumHeight()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    int-to-float v4, v4

    .line 53
    div-float/2addr v4, v3

    .line 54
    const/high16 v5, 0x3f800000    # 1.0f

    .line 55
    .line 56
    cmpl-float v6, v1, v5

    .line 57
    .line 58
    if-gtz v6, :cond_4

    .line 59
    .line 60
    cmpl-float v5, v4, v5

    .line 61
    .line 62
    if-lez v5, :cond_3

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    return-object v2

    .line 66
    :cond_4
    :goto_0
    invoke-static {v1, v4}, Ljava/lang/Math;->max(FF)F

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    new-instance v7, Landroid/graphics/Matrix;

    .line 71
    .line 72
    invoke-direct {v7}, Landroid/graphics/Matrix;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v7, v1, v1}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 76
    .line 77
    .line 78
    float-to-int v5, v0

    .line 79
    float-to-int v6, v3

    .line 80
    const/4 v8, 0x0

    .line 81
    const/4 v3, 0x0

    .line 82
    const/4 v4, 0x0

    .line 83
    invoke-static/range {v2 .. v8}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    return-object v0

    .line 88
    :cond_5
    :goto_1
    return-object v1

    .line 89
    :cond_6
    :try_start_0
    instance-of v2, v0, Landroid/graphics/drawable/ColorDrawable;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 90
    .line 91
    sget-object v3, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->v:Landroid/graphics/Bitmap$Config;

    .line 92
    .line 93
    if-eqz v2, :cond_7

    .line 94
    .line 95
    const/4 v2, 0x2

    .line 96
    :try_start_1
    invoke-static {v2, v2, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    goto :goto_2

    .line 101
    :catch_0
    move-exception v0

    .line 102
    goto :goto_3

    .line 103
    :cond_7
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    invoke-static {v2, v4, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    :goto_2
    new-instance v3, Landroid/graphics/Canvas;

    .line 116
    .line 117
    invoke-direct {v3, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v3}, Landroid/graphics/Canvas;->getWidth()I

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    invoke-virtual {v3}, Landroid/graphics/Canvas;->getHeight()I

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    const/4 v6, 0x0

    .line 129
    invoke-virtual {v0, v6, v6, v4, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v3}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 133
    .line 134
    .line 135
    return-object v2

    .line 136
    :goto_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 137
    .line 138
    .line 139
    return-object v1
.end method


# virtual methods
.method public final a(Landroid/graphics/Canvas;I)V
    .locals 3

    .line 1
    if-gtz p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    int-to-float p2, p2

    .line 5
    const/high16 v0, 0x3f800000    # 1.0f

    .line 6
    .line 7
    mul-float/2addr v0, p2

    .line 8
    const/high16 v1, 0x40000000    # 2.0f

    .line 9
    .line 10
    div-float/2addr v0, v1

    .line 11
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->a:Z

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->g:I

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->e:I

    .line 19
    .line 20
    :goto_0
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->l:Landroid/graphics/Paint;

    .line 21
    .line 22
    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->l:Landroid/graphics/Paint;

    .line 26
    .line 27
    invoke-virtual {v1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 28
    .line 29
    .line 30
    iget-boolean p2, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->c:Z

    .line 31
    .line 32
    if-eqz p2, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    div-int/lit8 p2, p2, 0x2

    .line 39
    .line 40
    int-to-float p2, p2

    .line 41
    sub-float v0, p2, v0

    .line 42
    .line 43
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->l:Landroid/graphics/Paint;

    .line 44
    .line 45
    invoke-virtual {p1, p2, p2, v0, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_2
    iget-object p2, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->q:Landroid/graphics/RectF;

    .line 50
    .line 51
    iput v0, p2, Landroid/graphics/RectF;->left:F

    .line 52
    .line 53
    iput v0, p2, Landroid/graphics/RectF;->top:F

    .line 54
    .line 55
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    int-to-float v1, v1

    .line 60
    sub-float/2addr v1, v0

    .line 61
    iput v1, p2, Landroid/graphics/RectF;->right:F

    .line 62
    .line 63
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    int-to-float v1, v1

    .line 68
    sub-float/2addr v1, v0

    .line 69
    iput v1, p2, Landroid/graphics/RectF;->bottom:F

    .line 70
    .line 71
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->b:Z

    .line 72
    .line 73
    if-eqz v0, :cond_3

    .line 74
    .line 75
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->l:Landroid/graphics/Paint;

    .line 76
    .line 77
    invoke-virtual {p1, p2, v0}, Landroid/graphics/Canvas;->drawOval(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_3
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->j:I

    .line 82
    .line 83
    int-to-float v1, v0

    .line 84
    int-to-float v0, v0

    .line 85
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->l:Landroid/graphics/Paint;

    .line 86
    .line 87
    invoke-virtual {p1, p2, v1, v0, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method public final b()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->getBitmap()Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->r:Landroid/graphics/Bitmap;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->r:Landroid/graphics/Bitmap;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->o:Landroid/graphics/BitmapShader;

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    const/4 v0, 0x1

    .line 22
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->p:Z

    .line 23
    .line 24
    new-instance v1, Landroid/graphics/BitmapShader;

    .line 25
    .line 26
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->r:Landroid/graphics/Bitmap;

    .line 27
    .line 28
    sget-object v3, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 29
    .line 30
    invoke-direct {v1, v2, v3, v3}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    .line 31
    .line 32
    .line 33
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->o:Landroid/graphics/BitmapShader;

    .line 34
    .line 35
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->k:Landroid/graphics/Paint;

    .line 36
    .line 37
    if-nez v1, :cond_2

    .line 38
    .line 39
    new-instance v1, Landroid/graphics/Paint;

    .line 40
    .line 41
    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->k:Landroid/graphics/Paint;

    .line 45
    .line 46
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 47
    .line 48
    .line 49
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->k:Landroid/graphics/Paint;

    .line 50
    .line 51
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->o:Landroid/graphics/BitmapShader;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public getBorderColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public getBorderWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public getCornerRadius()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->j:I

    .line 2
    .line 3
    return v0
.end method

.method public getSelectedBorderColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public getSelectedBorderWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->f:I

    .line 2
    .line 3
    return v0
.end method

.method public getSelectedMaskColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public final isSelected()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->a:Z

    .line 2
    .line 3
    return v0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-lez v0, :cond_a

    .line 10
    .line 11
    if-gtz v1, :cond_0

    .line 12
    .line 13
    goto/16 :goto_5

    .line 14
    .line 15
    :cond_0
    iget-boolean v2, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->a:Z

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->f:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->d:I

    .line 23
    .line 24
    :goto_0
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->r:Landroid/graphics/Bitmap;

    .line 25
    .line 26
    if-eqz v3, :cond_9

    .line 27
    .line 28
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->o:Landroid/graphics/BitmapShader;

    .line 29
    .line 30
    if-nez v3, :cond_2

    .line 31
    .line 32
    goto/16 :goto_4

    .line 33
    .line 34
    :cond_2
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->t:I

    .line 35
    .line 36
    const/high16 v4, 0x40000000    # 2.0f

    .line 37
    .line 38
    if-ne v3, v0, :cond_3

    .line 39
    .line 40
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->u:I

    .line 41
    .line 42
    if-ne v3, v1, :cond_3

    .line 43
    .line 44
    iget-boolean v3, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->p:Z

    .line 45
    .line 46
    if-eqz v3, :cond_5

    .line 47
    .line 48
    :cond_3
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->t:I

    .line 49
    .line 50
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->u:I

    .line 51
    .line 52
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->s:Landroid/graphics/Matrix;

    .line 53
    .line 54
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 55
    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->p:Z

    .line 59
    .line 60
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->o:Landroid/graphics/BitmapShader;

    .line 61
    .line 62
    if-eqz v0, :cond_5

    .line 63
    .line 64
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->r:Landroid/graphics/Bitmap;

    .line 65
    .line 66
    if-nez v0, :cond_4

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_4
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    int-to-float v0, v0

    .line 74
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->r:Landroid/graphics/Bitmap;

    .line 75
    .line 76
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    int-to-float v1, v1

    .line 81
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->t:I

    .line 82
    .line 83
    int-to-float v3, v3

    .line 84
    div-float/2addr v3, v0

    .line 85
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->u:I

    .line 86
    .line 87
    int-to-float v5, v5

    .line 88
    div-float/2addr v5, v1

    .line 89
    invoke-static {v3, v5}, Ljava/lang/Math;->max(FF)F

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    iget-object v5, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->s:Landroid/graphics/Matrix;

    .line 94
    .line 95
    invoke-virtual {v5, v3, v3}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 96
    .line 97
    .line 98
    mul-float/2addr v0, v3

    .line 99
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->t:I

    .line 100
    .line 101
    int-to-float v5, v5

    .line 102
    sub-float/2addr v0, v5

    .line 103
    neg-float v0, v0

    .line 104
    div-float/2addr v0, v4

    .line 105
    mul-float/2addr v3, v1

    .line 106
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->u:I

    .line 107
    .line 108
    int-to-float v1, v1

    .line 109
    sub-float/2addr v3, v1

    .line 110
    neg-float v1, v3

    .line 111
    div-float/2addr v1, v4

    .line 112
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->s:Landroid/graphics/Matrix;

    .line 113
    .line 114
    invoke-virtual {v3, v0, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 115
    .line 116
    .line 117
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->o:Landroid/graphics/BitmapShader;

    .line 118
    .line 119
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->s:Landroid/graphics/Matrix;

    .line 120
    .line 121
    invoke-virtual {v0, v1}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 122
    .line 123
    .line 124
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->k:Landroid/graphics/Paint;

    .line 125
    .line 126
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->o:Landroid/graphics/BitmapShader;

    .line 127
    .line 128
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 129
    .line 130
    .line 131
    :cond_5
    :goto_1
    int-to-float v0, v2

    .line 132
    const/high16 v1, 0x3f800000    # 1.0f

    .line 133
    .line 134
    mul-float/2addr v0, v1

    .line 135
    div-float/2addr v0, v4

    .line 136
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->k:Landroid/graphics/Paint;

    .line 137
    .line 138
    iget-boolean v3, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->a:Z

    .line 139
    .line 140
    if-eqz v3, :cond_6

    .line 141
    .line 142
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->n:Landroid/graphics/ColorFilter;

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_6
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->m:Landroid/graphics/ColorFilter;

    .line 146
    .line 147
    :goto_2
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 148
    .line 149
    .line 150
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->c:Z

    .line 151
    .line 152
    if-eqz v1, :cond_7

    .line 153
    .line 154
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    div-int/lit8 v1, v1, 0x2

    .line 159
    .line 160
    int-to-float v1, v1

    .line 161
    sub-float v0, v1, v0

    .line 162
    .line 163
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->k:Landroid/graphics/Paint;

    .line 164
    .line 165
    invoke-virtual {p1, v1, v1, v0, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 166
    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_7
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->q:Landroid/graphics/RectF;

    .line 170
    .line 171
    iput v0, v1, Landroid/graphics/RectF;->left:F

    .line 172
    .line 173
    iput v0, v1, Landroid/graphics/RectF;->top:F

    .line 174
    .line 175
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    int-to-float v3, v3

    .line 180
    sub-float/2addr v3, v0

    .line 181
    iput v3, v1, Landroid/graphics/RectF;->right:F

    .line 182
    .line 183
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    int-to-float v3, v3

    .line 188
    sub-float/2addr v3, v0

    .line 189
    iput v3, v1, Landroid/graphics/RectF;->bottom:F

    .line 190
    .line 191
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->b:Z

    .line 192
    .line 193
    if-eqz v0, :cond_8

    .line 194
    .line 195
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->k:Landroid/graphics/Paint;

    .line 196
    .line 197
    invoke-virtual {p1, v1, v0}, Landroid/graphics/Canvas;->drawOval(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 198
    .line 199
    .line 200
    goto :goto_3

    .line 201
    :cond_8
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->j:I

    .line 202
    .line 203
    int-to-float v0, v0

    .line 204
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->k:Landroid/graphics/Paint;

    .line 205
    .line 206
    invoke-virtual {p1, v1, v0, v0, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 207
    .line 208
    .line 209
    :goto_3
    invoke-virtual {p0, p1, v2}, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->a(Landroid/graphics/Canvas;I)V

    .line 210
    .line 211
    .line 212
    return-void

    .line 213
    :cond_9
    :goto_4
    invoke-virtual {p0, p1, v2}, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->a(Landroid/graphics/Canvas;I)V

    .line 214
    .line 215
    .line 216
    :cond_a
    :goto_5
    return-void
.end method

.method public final onMeasure(II)V
    .locals 7

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    iget-boolean v2, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->c:Z

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-virtual {p0, p1, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->r:Landroid/graphics/Bitmap;

    .line 33
    .line 34
    if-nez v2, :cond_1

    .line 35
    .line 36
    goto/16 :goto_3

    .line 37
    .line 38
    :cond_1
    const/4 v3, 0x1

    .line 39
    const/4 v4, 0x0

    .line 40
    const/high16 v5, -0x80000000

    .line 41
    .line 42
    if-eq p1, v5, :cond_3

    .line 43
    .line 44
    if-nez p1, :cond_2

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    move p1, v4

    .line 48
    goto :goto_1

    .line 49
    :cond_3
    :goto_0
    move p1, v3

    .line 50
    :goto_1
    if-eq p2, v5, :cond_5

    .line 51
    .line 52
    if-nez p2, :cond_4

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_4
    move v3, v4

    .line 56
    :cond_5
    :goto_2
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    int-to-float p2, p2

    .line 61
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->r:Landroid/graphics/Bitmap;

    .line 62
    .line 63
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    int-to-float v2, v2

    .line 68
    int-to-float v4, v0

    .line 69
    div-float/2addr v4, p2

    .line 70
    int-to-float v5, v1

    .line 71
    div-float/2addr v5, v2

    .line 72
    if-eqz p1, :cond_a

    .line 73
    .line 74
    if-eqz v3, :cond_a

    .line 75
    .line 76
    const/high16 p1, 0x3f800000    # 1.0f

    .line 77
    .line 78
    cmpl-float v3, v4, p1

    .line 79
    .line 80
    if-ltz v3, :cond_6

    .line 81
    .line 82
    cmpl-float v6, v5, p1

    .line 83
    .line 84
    if-ltz v6, :cond_6

    .line 85
    .line 86
    float-to-int p1, p2

    .line 87
    float-to-int p2, v2

    .line 88
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_6
    if-ltz v3, :cond_7

    .line 93
    .line 94
    mul-float/2addr v2, v5

    .line 95
    float-to-int p1, v2

    .line 96
    invoke-virtual {p0, p1, v1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_7
    cmpl-float p1, v5, p1

    .line 101
    .line 102
    if-ltz p1, :cond_8

    .line 103
    .line 104
    mul-float/2addr v2, v4

    .line 105
    float-to-int p1, v2

    .line 106
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :cond_8
    cmpg-float p1, v4, v5

    .line 111
    .line 112
    if-gez p1, :cond_9

    .line 113
    .line 114
    mul-float/2addr v2, v4

    .line 115
    float-to-int p1, v2

    .line 116
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :cond_9
    mul-float/2addr p2, v5

    .line 121
    float-to-int p1, p2

    .line 122
    invoke-virtual {p0, p1, v1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :cond_a
    if-eqz p1, :cond_b

    .line 127
    .line 128
    mul-float/2addr p2, v5

    .line 129
    float-to-int p1, p2

    .line 130
    invoke-virtual {p0, p1, v1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :cond_b
    if-eqz v3, :cond_c

    .line 135
    .line 136
    mul-float/2addr v2, v4

    .line 137
    float-to-int p1, v2

    .line 138
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 139
    .line 140
    .line 141
    :cond_c
    :goto_3
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isClickable()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->setSelected(Z)V

    .line 9
    .line 10
    .line 11
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    :cond_0
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->i:Z

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    return p1

    .line 25
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    if-eq v0, v2, :cond_2

    .line 33
    .line 34
    const/4 v2, 0x3

    .line 35
    if-eq v0, v2, :cond_2

    .line 36
    .line 37
    const/4 v2, 0x4

    .line 38
    if-eq v0, v2, :cond_2

    .line 39
    .line 40
    const/16 v2, 0x8

    .line 41
    .line 42
    if-eq v0, v2, :cond_2

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->setSelected(Z)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_3
    invoke-virtual {p0, v2}, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->setSelected(Z)V

    .line 50
    .line 51
    .line 52
    :goto_0
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    return p1
.end method

.method public setAdjustViewBounds(Z)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 5
    .line 6
    const-string v0, "\u4e0d\u652f\u6301adjustViewBounds"

    .line 7
    .line 8
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    throw p1
.end method

.method public setBorderColor(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->e:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->e:I

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setBorderWidth(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->d:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->d:I

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setCircle(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->c:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->c:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->m:Landroid/graphics/ColorFilter;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->m:Landroid/graphics/ColorFilter;

    .line 7
    .line 8
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->a:Z

    .line 9
    .line 10
    if-nez p1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 13
    .line 14
    .line 15
    :cond_1
    :goto_0
    return-void
.end method

.method public setCornerRadius(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->j:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->j:I

    .line 6
    .line 7
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->c:Z

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->b:Z

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->b()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setImageURI(Landroid/net/Uri;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageURI(Landroid/net/Uri;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->b()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setOval(Z)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->c:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->c:Z

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    :cond_0
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->b:Z

    .line 12
    .line 13
    if-ne v1, p1, :cond_2

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    return-void

    .line 19
    :cond_2
    :goto_0
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->b:Z

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public setScaleType(Landroid/widget/ImageView$ScaleType;)V
    .locals 3

    .line 1
    sget-object v0, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 10
    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v2, "\u4e0d\u652f\u6301ScaleType "

    .line 14
    .line 15
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw v0
.end method

.method public setSelected(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->a:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->a:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setSelectedBorderColor(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->g:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->g:I

    .line 6
    .line 7
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->a:Z

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public setSelectedBorderWidth(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->f:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->f:I

    .line 6
    .line 7
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->a:Z

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public setSelectedColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->n:Landroid/graphics/ColorFilter;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->n:Landroid/graphics/ColorFilter;

    .line 7
    .line 8
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->a:Z

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 13
    .line 14
    .line 15
    :cond_1
    :goto_0
    return-void
.end method

.method public setSelectedMaskColor(I)V
    .locals 3
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->h:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_1

    .line 4
    .line 5
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->h:I

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    new-instance v0, Landroid/graphics/PorterDuffColorFilter;

    .line 10
    .line 11
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->h:I

    .line 12
    .line 13
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->DARKEN:Landroid/graphics/PorterDuff$Mode;

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->n:Landroid/graphics/ColorFilter;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->n:Landroid/graphics/ColorFilter;

    .line 23
    .line 24
    :goto_0
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->a:Z

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 29
    .line 30
    .line 31
    :cond_1
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->h:I

    .line 32
    .line 33
    return-void
.end method

.method public setTouchSelectModeEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/RadiusImageView;->i:Z

    .line 2
    .line 3
    return-void
.end method
