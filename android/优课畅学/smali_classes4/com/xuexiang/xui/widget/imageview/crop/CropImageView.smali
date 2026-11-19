.class public Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final l:Landroid/graphics/Rect;


# instance fields
.field public a:Landroid/widget/ImageView;

.field public b:Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;

.field public c:Landroid/graphics/Bitmap;

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:Z

.field public i:I

.field public j:I

.field public k:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->l:Landroid/graphics/Rect;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->d:I

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->g:I

    .line 9
    .line 10
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->h:Z

    .line 11
    .line 12
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->i:I

    .line 13
    .line 14
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->j:I

    .line 15
    .line 16
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->k:I

    .line 17
    .line 18
    sget-object v2, Lcom/xuexiang/xui/R$styleable;->CropImageView:[I

    .line 19
    .line 20
    invoke-virtual {p1, p2, v2, v0, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    :try_start_0
    sget v2, Lcom/xuexiang/xui/R$styleable;->CropImageView_civ_guidelines:I

    .line 25
    .line 26
    invoke-virtual {p2, v2, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    iput v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->g:I

    .line 31
    .line 32
    sget v2, Lcom/xuexiang/xui/R$styleable;->CropImageView_civ_fixAspectRatio:I

    .line 33
    .line 34
    invoke-virtual {p2, v2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->h:Z

    .line 39
    .line 40
    sget v2, Lcom/xuexiang/xui/R$styleable;->CropImageView_civ_aspectRatioX:I

    .line 41
    .line 42
    invoke-virtual {p2, v2, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    iput v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->i:I

    .line 47
    .line 48
    sget v2, Lcom/xuexiang/xui/R$styleable;->CropImageView_civ_aspectRatioY:I

    .line 49
    .line 50
    invoke-virtual {p2, v2, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->j:I

    .line 55
    .line 56
    sget v1, Lcom/xuexiang/xui/R$styleable;->CropImageView_civ_imageResource:I

    .line 57
    .line 58
    invoke-virtual {p2, v1, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->k:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->b(Landroid/content/Context;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :catchall_0
    move-exception p1

    .line 72
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 73
    .line 74
    .line 75
    throw p1
.end method

.method public static a(III)I
    .locals 1

    .line 1
    const/high16 v0, 0x40000000    # 2.0f

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    return p1

    .line 6
    :cond_0
    const/high16 v0, -0x80000000

    .line 7
    .line 8
    if-ne p0, v0, :cond_1

    .line 9
    .line 10
    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0

    .line 15
    :cond_1
    return p2
.end method


# virtual methods
.method public final b(Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget v0, Lcom/xuexiang/xui/R$layout;->xui_layout_crop_image_view:I

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-virtual {p1, v0, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget v0, Lcom/xuexiang/xui/R$id;->iv_content:I

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Landroid/widget/ImageView;

    .line 19
    .line 20
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->a:Landroid/widget/ImageView;

    .line 21
    .line 22
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->k:I

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->setImageResource(I)V

    .line 25
    .line 26
    .line 27
    sget v0, Lcom/xuexiang/xui/R$id;->crop_overlay_view:I

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;

    .line 34
    .line 35
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->b:Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;

    .line 36
    .line 37
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->g:I

    .line 38
    .line 39
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->h:Z

    .line 40
    .line 41
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->i:I

    .line 42
    .line 43
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->j:I

    .line 44
    .line 45
    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->l(IZII)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public c(I)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v6, Landroid/graphics/Matrix;

    .line 7
    .line 8
    invoke-direct {v6}, Landroid/graphics/Matrix;-><init>()V

    .line 9
    .line 10
    .line 11
    int-to-float v0, p1

    .line 12
    invoke-virtual {v6, v0}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    const/4 v7, 0x1

    .line 28
    const/4 v2, 0x0

    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-static/range {v1 .. v7}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 37
    .line 38
    .line 39
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->d:I

    .line 40
    .line 41
    add-int/2addr v0, p1

    .line 42
    rem-int/lit16 v0, v0, 0x168

    .line 43
    .line 44
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->d:I

    .line 45
    .line 46
    return-void
.end method

.method public d(II)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->i:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->b:Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->setAspectRatioX(I)V

    .line 6
    .line 7
    .line 8
    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->j:I

    .line 9
    .line 10
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->b:Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;

    .line 11
    .line 12
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->setAspectRatioY(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public getActualCropRect()Landroid/graphics/RectF;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->a:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-static {v0, v1}, Ld2/h;->b(Landroid/graphics/Bitmap;Landroid/view/View;)Landroid/graphics/Rect;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    int-to-float v1, v1

    .line 16
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    int-to-float v2, v2

    .line 21
    div-float/2addr v1, v2

    .line 22
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 23
    .line 24
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    int-to-float v2, v2

    .line 29
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    int-to-float v3, v3

    .line 34
    div-float/2addr v2, v3

    .line 35
    sget-object v3, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->b:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 36
    .line 37
    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->h()F

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    iget v4, v0, Landroid/graphics/Rect;->left:I

    .line 42
    .line 43
    int-to-float v4, v4

    .line 44
    sub-float/2addr v3, v4

    .line 45
    sget-object v4, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->c:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 46
    .line 47
    invoke-virtual {v4}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->h()F

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    iget v0, v0, Landroid/graphics/Rect;->top:I

    .line 52
    .line 53
    int-to-float v0, v0

    .line 54
    sub-float/2addr v4, v0

    .line 55
    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->j()F

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->i()F

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    mul-float/2addr v3, v1

    .line 64
    mul-float/2addr v4, v2

    .line 65
    mul-float/2addr v0, v1

    .line 66
    add-float/2addr v0, v3

    .line 67
    mul-float/2addr v5, v2

    .line 68
    add-float/2addr v5, v4

    .line 69
    const/4 v1, 0x0

    .line 70
    invoke-static {v1, v3}, Ljava/lang/Math;->max(FF)F

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    invoke-static {v1, v4}, Ljava/lang/Math;->max(FF)F

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 79
    .line 80
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    int-to-float v3, v3

    .line 85
    invoke-static {v3, v0}, Ljava/lang/Math;->min(FF)F

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 90
    .line 91
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    int-to-float v3, v3

    .line 96
    invoke-static {v3, v5}, Ljava/lang/Math;->min(FF)F

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    new-instance v4, Landroid/graphics/RectF;

    .line 101
    .line 102
    invoke-direct {v4, v2, v1, v0, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 103
    .line 104
    .line 105
    return-object v4
.end method

.method public getCropOverlayView()Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->b:Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;

    .line 2
    .line 3
    return-object v0
.end method

.method public getCroppedImage()Landroid/graphics/Bitmap;
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->a:Landroid/widget/ImageView;

    .line 8
    .line 9
    invoke-static {v0, v1}, Ld2/h;->b(Landroid/graphics/Bitmap;Landroid/view/View;)Landroid/graphics/Rect;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 14
    .line 15
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    int-to-float v1, v1

    .line 20
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    int-to-float v2, v2

    .line 25
    div-float/2addr v1, v2

    .line 26
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 27
    .line 28
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    int-to-float v2, v2

    .line 33
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    int-to-float v3, v3

    .line 38
    div-float/2addr v2, v3

    .line 39
    sget-object v3, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->b:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 40
    .line 41
    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->h()F

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    iget v4, v0, Landroid/graphics/Rect;->left:I

    .line 46
    .line 47
    int-to-float v4, v4

    .line 48
    sub-float/2addr v3, v4

    .line 49
    sget-object v4, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->c:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 50
    .line 51
    invoke-virtual {v4}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->h()F

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    iget v0, v0, Landroid/graphics/Rect;->top:I

    .line 56
    .line 57
    int-to-float v0, v0

    .line 58
    sub-float/2addr v4, v0

    .line 59
    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->j()F

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->i()F

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    mul-float/2addr v3, v1

    .line 68
    mul-float/2addr v4, v2

    .line 69
    mul-float/2addr v0, v1

    .line 70
    mul-float/2addr v5, v2

    .line 71
    iget-object v6, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 72
    .line 73
    float-to-int v7, v3

    .line 74
    float-to-int v8, v4

    .line 75
    float-to-int v9, v0

    .line 76
    float-to-int v10, v5

    .line 77
    const/4 v11, 0x1

    .line 78
    invoke-static/range {v6 .. v11}, Lcom/xuexiang/xui/utils/c;->a(Landroid/graphics/Bitmap;IIIII)Landroid/graphics/Bitmap;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    return-object v0
.end method

.method public getImageResource()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public getImageView()Landroid/widget/ImageView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->a:Landroid/widget/ImageView;

    .line 2
    .line 3
    return-object v0
.end method

.method public onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    iget p2, p1, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->e:I

    .line 6
    .line 7
    if-lez p2, :cond_0

    .line 8
    .line 9
    iget p2, p1, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->f:I

    .line 10
    .line 11
    if-lez p2, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    iget p3, p1, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->e:I

    .line 18
    .line 19
    iput p3, p2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 20
    .line 21
    iget p3, p1, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->f:I

    .line 22
    .line 23
    iput p3, p2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 24
    .line 25
    invoke-virtual {p0, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public onMeasure(II)V
    .locals 10

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    iget-object v4, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 18
    .line 19
    if-eqz v4, :cond_6

    .line 20
    .line 21
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 22
    .line 23
    .line 24
    if-nez v3, :cond_0

    .line 25
    .line 26
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    const-wide/high16 v4, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    .line 39
    .line 40
    if-ge v1, p1, :cond_1

    .line 41
    .line 42
    int-to-double p1, v1

    .line 43
    iget-object v6, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 44
    .line 45
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    int-to-double v6, v6

    .line 50
    div-double/2addr p1, v6

    .line 51
    goto :goto_0

    .line 52
    :cond_1
    move-wide p1, v4

    .line 53
    :goto_0
    iget-object v6, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 54
    .line 55
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    if-ge v3, v6, :cond_2

    .line 60
    .line 61
    int-to-double v6, v3

    .line 62
    iget-object v8, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 63
    .line 64
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getHeight()I

    .line 65
    .line 66
    .line 67
    move-result v8

    .line 68
    int-to-double v8, v8

    .line 69
    div-double/2addr v6, v8

    .line 70
    goto :goto_1

    .line 71
    :cond_2
    move-wide v6, v4

    .line 72
    :goto_1
    cmpl-double v8, p1, v4

    .line 73
    .line 74
    if-nez v8, :cond_4

    .line 75
    .line 76
    cmpl-double v4, v6, v4

    .line 77
    .line 78
    if-eqz v4, :cond_3

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 82
    .line 83
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    iget-object p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 88
    .line 89
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    goto :goto_3

    .line 94
    :cond_4
    :goto_2
    cmpg-double v4, p1, v6

    .line 95
    .line 96
    if-gtz v4, :cond_5

    .line 97
    .line 98
    iget-object v4, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 99
    .line 100
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    int-to-double v4, v4

    .line 105
    mul-double/2addr v4, p1

    .line 106
    double-to-int p2, v4

    .line 107
    move p1, v1

    .line 108
    goto :goto_3

    .line 109
    :cond_5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 110
    .line 111
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    int-to-double p1, p1

    .line 116
    mul-double/2addr p1, v6

    .line 117
    double-to-int p1, p1

    .line 118
    move p2, v3

    .line 119
    :goto_3
    invoke-static {v0, v1, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->a(III)I

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    invoke-static {v2, v3, p2}, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->a(III)I

    .line 124
    .line 125
    .line 126
    move-result p2

    .line 127
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->e:I

    .line 128
    .line 129
    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->f:I

    .line 130
    .line 131
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 132
    .line 133
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    iget-object p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 138
    .line 139
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 140
    .line 141
    .line 142
    move-result p2

    .line 143
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->e:I

    .line 144
    .line 145
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->f:I

    .line 146
    .line 147
    invoke-static {p1, p2, v0, v1}, Ld2/h;->a(IIII)Landroid/graphics/Rect;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    iget-object p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->b:Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;

    .line 152
    .line 153
    invoke-virtual {p2, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->setBitmapRect(Landroid/graphics/Rect;)V

    .line 154
    .line 155
    .line 156
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->b:Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;

    .line 157
    .line 158
    iget-object p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 159
    .line 160
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 161
    .line 162
    .line 163
    move-result p2

    .line 164
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 165
    .line 166
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    invoke-virtual {p1, p2, v0}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->k(II)V

    .line 171
    .line 172
    .line 173
    iget p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->e:I

    .line 174
    .line 175
    iget p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->f:I

    .line 176
    .line 177
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 178
    .line 179
    .line 180
    return-void

    .line 181
    :cond_6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->b:Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;

    .line 182
    .line 183
    sget-object p2, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->l:Landroid/graphics/Rect;

    .line 184
    .line 185
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->setBitmapRect(Landroid/graphics/Rect;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p0, v1, v3}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 189
    .line 190
    .line 191
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Landroid/os/Bundle;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p1, Landroid/os/Bundle;

    .line 6
    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const-string v0, "DEGREES_ROTATED"

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->d:I

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c(I)V

    .line 20
    .line 21
    .line 22
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->d:I

    .line 23
    .line 24
    :cond_0
    const-string v0, "instanceState"

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "instanceState"

    .line 7
    .line 8
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 13
    .line 14
    .line 15
    const-string v1, "DEGREES_ROTATED"

    .line 16
    .line 17
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->d:I

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-static {p1, p0}, Ld2/h;->b(Landroid/graphics/Bitmap;Landroid/view/View;)Landroid/graphics/Rect;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->b:Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;

    .line 10
    .line 11
    invoke-virtual {p2, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->setBitmapRect(Landroid/graphics/Rect;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->b:Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;

    .line 16
    .line 17
    sget-object p2, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->l:Landroid/graphics/Rect;

    .line 18
    .line 19
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->setBitmapRect(Landroid/graphics/Rect;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public setCropOverlayCornerBitmap(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->b:Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->setCropOverlayCornerBitmap(Landroid/graphics/Bitmap;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setFixedAspectRatio(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->b:Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->setFixedAspectRatio(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setGuidelines(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->b:Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->setGuidelines(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->a:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->b:Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->j()V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->b:Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public setImagePath(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setImageResource(I)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0, p1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method
