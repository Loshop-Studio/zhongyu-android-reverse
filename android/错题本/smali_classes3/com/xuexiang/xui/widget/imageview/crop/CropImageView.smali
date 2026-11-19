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

.field public final g:I

.field public final h:Z

.field public final i:I

.field public final j:I

.field public final k:I


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

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->d:I

    const/4 v1, 0x1

    .line 3
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->g:I

    .line 4
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->h:Z

    .line 5
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->i:I

    .line 6
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->j:I

    .line 7
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->k:I

    .line 8
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->a(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 9
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    .line 10
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->d:I

    const/4 v1, 0x1

    .line 11
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->g:I

    .line 12
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->h:Z

    .line 13
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->i:I

    .line 14
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->j:I

    .line 15
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->k:I

    .line 16
    sget-object v2, Lcom/xuexiang/xui/R$styleable;->CropImageView:[I

    invoke-virtual {p1, p2, v2, v0, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 17
    :try_start_0
    sget v2, Lcom/xuexiang/xui/R$styleable;->CropImageView_civ_guidelines:I

    invoke-virtual {p2, v2, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v2

    iput v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->g:I

    .line 18
    sget v2, Lcom/xuexiang/xui/R$styleable;->CropImageView_civ_fixAspectRatio:I

    invoke-virtual {p2, v2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->h:Z

    .line 19
    sget v2, Lcom/xuexiang/xui/R$styleable;->CropImageView_civ_aspectRatioX:I

    invoke-virtual {p2, v2, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v2

    iput v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->i:I

    .line 20
    sget v2, Lcom/xuexiang/xui/R$styleable;->CropImageView_civ_aspectRatioY:I

    invoke-virtual {p2, v2, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->j:I

    .line 21
    sget v1, Lcom/xuexiang/xui/R$styleable;->CropImageView_civ_imageResource:I

    invoke-virtual {p2, v1, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->k:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 23
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->a(Landroid/content/Context;)V

    return-void

    :catchall_0
    move-exception p1

    .line 24
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 25
    throw p1
.end method


# virtual methods
.method public final a(Landroid/content/Context;)V
    .locals 3

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
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->g:I

    .line 41
    .line 42
    if-ltz v0, :cond_2

    .line 43
    .line 44
    const/4 v1, 0x2

    .line 45
    if-gt v0, v1, :cond_2

    .line 46
    .line 47
    iput v0, p1, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->n:I

    .line 48
    .line 49
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->h:Z

    .line 50
    .line 51
    iput-boolean v0, p1, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->j:Z

    .line 52
    .line 53
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->i:I

    .line 54
    .line 55
    const-string v1, "Cannot set aspect ratio value to a number less than or equal to 0."

    .line 56
    .line 57
    if-lez v0, :cond_1

    .line 58
    .line 59
    iput v0, p1, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->k:I

    .line 60
    .line 61
    int-to-float v0, v0

    .line 62
    iget v2, p1, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->l:I

    .line 63
    .line 64
    int-to-float v2, v2

    .line 65
    div-float v2, v0, v2

    .line 66
    .line 67
    iput v2, p1, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->m:F

    .line 68
    .line 69
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->j:I

    .line 70
    .line 71
    if-lez v2, :cond_0

    .line 72
    .line 73
    iput v2, p1, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->l:I

    .line 74
    .line 75
    int-to-float v1, v2

    .line 76
    div-float/2addr v0, v1

    .line 77
    iput v0, p1, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->m:F

    .line 78
    .line 79
    return-void

    .line 80
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 81
    .line 82
    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw p1

    .line 86
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 87
    .line 88
    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw p1

    .line 92
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 93
    .line 94
    const-string v0, "Guideline value must be set between 0 and 2. See documentation."

    .line 95
    .line 96
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw p1
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
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-static {v2, v0, v3, v1}, Ly1/a;->l(IIII)Landroid/graphics/Rect;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 26
    .line 27
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    int-to-float v1, v1

    .line 32
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    int-to-float v2, v2

    .line 37
    div-float/2addr v1, v2

    .line 38
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 39
    .line 40
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    int-to-float v2, v2

    .line 45
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    int-to-float v3, v3

    .line 50
    div-float/2addr v2, v3

    .line 51
    sget-object v3, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 52
    .line 53
    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    iget v4, v0, Landroid/graphics/Rect;->left:I

    .line 58
    .line 59
    int-to-float v4, v4

    .line 60
    sub-float/2addr v3, v4

    .line 61
    sget-object v4, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 62
    .line 63
    invoke-virtual {v4}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    iget v0, v0, Landroid/graphics/Rect;->top:I

    .line 68
    .line 69
    int-to-float v0, v0

    .line 70
    sub-float/2addr v4, v0

    .line 71
    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getWidth()F

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getHeight()F

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    mul-float/2addr v3, v1

    .line 80
    mul-float/2addr v4, v2

    .line 81
    mul-float/2addr v0, v1

    .line 82
    add-float/2addr v0, v3

    .line 83
    mul-float/2addr v5, v2

    .line 84
    add-float/2addr v5, v4

    .line 85
    const/4 v1, 0x0

    .line 86
    invoke-static {v1, v3}, Ljava/lang/Math;->max(FF)F

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    invoke-static {v1, v4}, Ljava/lang/Math;->max(FF)F

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 95
    .line 96
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    int-to-float v3, v3

    .line 101
    invoke-static {v3, v0}, Ljava/lang/Math;->min(FF)F

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 106
    .line 107
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    int-to-float v3, v3

    .line 112
    invoke-static {v3, v5}, Ljava/lang/Math;->min(FF)F

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    new-instance v4, Landroid/graphics/RectF;

    .line 117
    .line 118
    invoke-direct {v4, v2, v1, v0, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 119
    .line 120
    .line 121
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
    .locals 6

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
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-static {v2, v0, v3, v1}, Ly1/a;->l(IIII)Landroid/graphics/Rect;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 30
    .line 31
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    int-to-float v1, v1

    .line 36
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    int-to-float v2, v2

    .line 41
    div-float/2addr v1, v2

    .line 42
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 43
    .line 44
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    int-to-float v2, v2

    .line 49
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    int-to-float v3, v3

    .line 54
    div-float/2addr v2, v3

    .line 55
    sget-object v3, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 56
    .line 57
    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    iget v4, v0, Landroid/graphics/Rect;->left:I

    .line 62
    .line 63
    int-to-float v4, v4

    .line 64
    sub-float/2addr v3, v4

    .line 65
    sget-object v4, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 66
    .line 67
    invoke-virtual {v4}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    iget v0, v0, Landroid/graphics/Rect;->top:I

    .line 72
    .line 73
    int-to-float v0, v0

    .line 74
    sub-float/2addr v4, v0

    .line 75
    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getWidth()F

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getHeight()F

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    mul-float/2addr v3, v1

    .line 84
    mul-float/2addr v4, v2

    .line 85
    mul-float/2addr v0, v1

    .line 86
    mul-float/2addr v5, v2

    .line 87
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 88
    .line 89
    float-to-int v2, v3

    .line 90
    float-to-int v3, v4

    .line 91
    float-to-int v0, v0

    .line 92
    float-to-int v4, v5

    .line 93
    invoke-static {v1, v2, v3, v0, v4}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
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

.method public final onLayout(ZIIII)V
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

.method public final onMeasure(II)V
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
    if-eqz v4, :cond_a

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
    const/high16 v4, -0x80000000

    .line 120
    .line 121
    const/high16 v5, 0x40000000    # 2.0f

    .line 122
    .line 123
    if-ne v0, v5, :cond_6

    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_6
    if-ne v0, v4, :cond_7

    .line 127
    .line 128
    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    goto :goto_4

    .line 133
    :cond_7
    move v1, p1

    .line 134
    :goto_4
    if-ne v2, v5, :cond_8

    .line 135
    .line 136
    goto :goto_5

    .line 137
    :cond_8
    if-ne v2, v4, :cond_9

    .line 138
    .line 139
    invoke-static {p2, v3}, Ljava/lang/Math;->min(II)I

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    goto :goto_5

    .line 144
    :cond_9
    move v3, p2

    .line 145
    :goto_5
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->e:I

    .line 146
    .line 147
    iput v3, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->f:I

    .line 148
    .line 149
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 150
    .line 151
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    iget-object p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 156
    .line 157
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 158
    .line 159
    .line 160
    move-result p2

    .line 161
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->e:I

    .line 162
    .line 163
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->f:I

    .line 164
    .line 165
    invoke-static {p1, p2, v0, v1}, Ly1/a;->l(IIII)Landroid/graphics/Rect;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    iget-object p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->b:Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;

    .line 170
    .line 171
    invoke-virtual {p2, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->setBitmapRect(Landroid/graphics/Rect;)V

    .line 172
    .line 173
    .line 174
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->b:Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;

    .line 175
    .line 176
    iget-object p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 177
    .line 178
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 179
    .line 180
    .line 181
    move-result p2

    .line 182
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 183
    .line 184
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    iput p2, p1, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->s:I

    .line 189
    .line 190
    iput v0, p1, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->t:I

    .line 191
    .line 192
    iget p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->e:I

    .line 193
    .line 194
    iget p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->f:I

    .line 195
    .line 196
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 197
    .line 198
    .line 199
    return-void

    .line 200
    :cond_a
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->b:Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;

    .line 201
    .line 202
    sget-object p2, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->l:Landroid/graphics/Rect;

    .line 203
    .line 204
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->setBitmapRect(Landroid/graphics/Rect;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {p0, v1, v3}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 208
    .line 209
    .line 210
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 9

    .line 1
    instance-of v0, p1, Landroid/os/Bundle;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    check-cast p1, Landroid/os/Bundle;

    .line 6
    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 8
    .line 9
    if-eqz v0, :cond_1

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
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v7, Landroid/graphics/Matrix;

    .line 25
    .line 26
    invoke-direct {v7}, Landroid/graphics/Matrix;-><init>()V

    .line 27
    .line 28
    .line 29
    int-to-float v1, v0

    .line 30
    invoke-virtual {v7, v1}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 31
    .line 32
    .line 33
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 34
    .line 35
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 40
    .line 41
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    const/4 v8, 0x1

    .line 46
    const/4 v3, 0x0

    .line 47
    const/4 v4, 0x0

    .line 48
    invoke-static/range {v2 .. v8}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 53
    .line 54
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 55
    .line 56
    .line 57
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->d:I

    .line 58
    .line 59
    add-int/2addr v1, v0

    .line 60
    rem-int/lit16 v1, v1, 0x168

    .line 61
    .line 62
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->d:I

    .line 63
    .line 64
    :goto_0
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->d:I

    .line 65
    .line 66
    :cond_1
    const-string v0, "instanceState"

    .line 67
    .line 68
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_2
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
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

.method public final onSizeChanged(IIII)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->c:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 14
    .line 15
    .line 16
    move-result p3

    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 18
    .line 19
    .line 20
    move-result p4

    .line 21
    invoke-static {p2, p1, p3, p4}, Ly1/a;->l(IIII)Landroid/graphics/Rect;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->b:Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;

    .line 26
    .line 27
    invoke-virtual {p2, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->setBitmapRect(Landroid/graphics/Rect;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->b:Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;

    .line 32
    .line 33
    sget-object p2, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->l:Landroid/graphics/Rect;

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->setBitmapRect(Landroid/graphics/Rect;)V

    .line 36
    .line 37
    .line 38
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
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->e()V

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
