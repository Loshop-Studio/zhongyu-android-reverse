.class public Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;
.super Landroid/view/View;
.source "SourceFile"


# static fields
.field public static final x:F

.field public static final y:F


# instance fields
.field public a:Landroid/graphics/Paint;

.field public b:Landroid/graphics/Paint;

.field public c:Landroid/graphics/Paint;

.field public d:Landroid/graphics/Paint;

.field public e:Landroid/graphics/Rect;

.field public f:F

.field public g:F

.field public h:Landroid/util/Pair;

.field public i:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

.field public j:Z

.field public k:I

.field public l:I

.field public m:F

.field public n:I

.field public o:Z

.field public p:F

.field public q:F

.field public r:F

.field public s:I

.field public t:I

.field public u:Landroid/graphics/Bitmap;

.field public v:I

.field public w:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/high16 v0, 0x40a00000    # 5.0f

    .line 2
    .line 3
    const/high16 v1, 0x40000000    # 2.0f

    .line 4
    .line 5
    div-float v2, v0, v1

    .line 6
    .line 7
    const/high16 v3, 0x40400000    # 3.0f

    .line 8
    .line 9
    div-float/2addr v3, v1

    .line 10
    sub-float/2addr v2, v3

    .line 11
    sput v2, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->x:F

    .line 12
    .line 13
    div-float/2addr v0, v1

    .line 14
    add-float/2addr v0, v2

    .line 15
    sput v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->y:F

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->j:Z

    const/4 v1, 0x1

    .line 3
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->k:I

    .line 4
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->l:I

    int-to-float v2, v1

    int-to-float v1, v1

    div-float/2addr v2, v1

    .line 5
    iput v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->m:F

    .line 6
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->o:Z

    .line 7
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->s:I

    .line 8
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->t:I

    const/4 v1, 0x0

    .line 9
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->u:Landroid/graphics/Bitmap;

    .line 10
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->v:I

    .line 11
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->w:I

    .line 12
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->c(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 13
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, 0x0

    .line 14
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->j:Z

    const/4 v0, 0x1

    .line 15
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->k:I

    .line 16
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->l:I

    int-to-float v1, v0

    int-to-float v0, v0

    div-float/2addr v1, v0

    .line 17
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->m:F

    .line 18
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->o:Z

    .line 19
    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->s:I

    .line 20
    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->t:I

    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->u:Landroid/graphics/Bitmap;

    .line 22
    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->v:I

    .line 23
    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->w:I

    .line 24
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->c(Landroid/content/Context;)V

    return-void
.end method

.method public static f()Z
    .locals 3

    .line 1
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    sub-float/2addr v0, v1

    .line 14
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/high16 v1, 0x42c80000    # 100.0f

    .line 19
    .line 20
    cmpg-float v0, v0, v1

    .line 21
    .line 22
    if-ltz v0, :cond_0

    .line 23
    .line 24
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    sget-object v2, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 31
    .line 32
    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    sub-float/2addr v0, v2

    .line 37
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    cmpg-float v0, v0, v1

    .line 42
    .line 43
    if-ltz v0, :cond_0

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    return v0

    .line 47
    :cond_0
    const/4 v0, 0x0

    .line 48
    return v0
.end method


# virtual methods
.method public final a(Landroid/graphics/Canvas;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->e:Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    int-to-float v0, v0

    .line 8
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->e:Landroid/graphics/Rect;

    .line 9
    .line 10
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    int-to-float v1, v1

    .line 15
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->s:I

    .line 16
    .line 17
    int-to-float v2, v2

    .line 18
    div-float/2addr v2, v0

    .line 19
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->t:I

    .line 20
    .line 21
    int-to-float v0, v0

    .line 22
    div-float/2addr v0, v1

    .line 23
    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getWidth()F

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    mul-float/2addr v1, v2

    .line 28
    float-to-int v1, v1

    .line 29
    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getHeight()F

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    mul-float/2addr v2, v0

    .line 34
    float-to-int v0, v2

    .line 35
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->a:Landroid/graphics/Paint;

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 39
    .line 40
    .line 41
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->a:Landroid/graphics/Paint;

    .line 42
    .line 43
    sget-object v3, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    .line 44
    .line 45
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 46
    .line 47
    .line 48
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->a:Landroid/graphics/Paint;

    .line 49
    .line 50
    const/high16 v3, 0x41c80000    # 25.0f

    .line 51
    .line 52
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 53
    .line 54
    .line 55
    new-instance v2, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, "x"

    .line 64
    .line 65
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 76
    .line 77
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    const/high16 v2, 0x40000000    # 2.0f

    .line 82
    .line 83
    div-float/2addr v1, v2

    .line 84
    sget-object v3, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 85
    .line 86
    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    div-float/2addr v3, v2

    .line 91
    add-float/2addr v3, v1

    .line 92
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 93
    .line 94
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    div-float/2addr v1, v2

    .line 99
    sget-object v4, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 100
    .line 101
    invoke-virtual {v4}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    div-float/2addr v4, v2

    .line 106
    add-float/2addr v4, v1

    .line 107
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->a:Landroid/graphics/Paint;

    .line 108
    .line 109
    invoke-virtual {p1, v0, v3, v4, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 110
    .line 111
    .line 112
    return-void
.end method

.method public final b(Landroid/graphics/Canvas;)V
    .locals 10

    .line 1
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 10
    .line 11
    .line 12
    move-result v5

    .line 13
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 20
    .line 21
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 22
    .line 23
    .line 24
    move-result v7

    .line 25
    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getWidth()F

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    const/high16 v9, 0x40400000    # 3.0f

    .line 30
    .line 31
    div-float/2addr v1, v9

    .line 32
    add-float v4, v2, v1

    .line 33
    .line 34
    iget-object v8, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->b:Landroid/graphics/Paint;

    .line 35
    .line 36
    move v6, v4

    .line 37
    move-object v3, p1

    .line 38
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 39
    .line 40
    .line 41
    sub-float v4, v0, v1

    .line 42
    .line 43
    iget-object v8, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->b:Landroid/graphics/Paint;

    .line 44
    .line 45
    move v6, v4

    .line 46
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 47
    .line 48
    .line 49
    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getHeight()F

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    div-float/2addr p1, v9

    .line 54
    add-float/2addr v5, p1

    .line 55
    iget-object v6, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->b:Landroid/graphics/Paint;

    .line 56
    .line 57
    move-object v1, v3

    .line 58
    move v3, v5

    .line 59
    move v4, v0

    .line 60
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 61
    .line 62
    .line 63
    move-object v3, v1

    .line 64
    sub-float/2addr v7, p1

    .line 65
    iget-object v6, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->b:Landroid/graphics/Paint;

    .line 66
    .line 67
    move v5, v7

    .line 68
    move v3, v7

    .line 69
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public final c(Landroid/content/Context;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x1

    .line 18
    const/high16 v3, 0x41c00000    # 24.0f

    .line 19
    .line 20
    invoke-static {v2, v3, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->f:F

    .line 25
    .line 26
    const/high16 v1, 0x40c00000    # 6.0f

    .line 27
    .line 28
    invoke-static {v2, v1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->g:F

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const/high16 v3, 0x40400000    # 3.0f

    .line 43
    .line 44
    invoke-static {v2, v3, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    new-instance v3, Landroid/graphics/Paint;

    .line 49
    .line 50
    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    .line 51
    .line 52
    .line 53
    const-string v4, "#AAFFFFFF"

    .line 54
    .line 55
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 63
    .line 64
    .line 65
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 66
    .line 67
    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 68
    .line 69
    .line 70
    iput-object v3, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->a:Landroid/graphics/Paint;

    .line 71
    .line 72
    new-instance v3, Landroid/graphics/Paint;

    .line 73
    .line 74
    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    .line 75
    .line 76
    .line 77
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 82
    .line 83
    .line 84
    const/high16 v4, 0x3f800000    # 1.0f

    .line 85
    .line 86
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 87
    .line 88
    .line 89
    iput-object v3, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->b:Landroid/graphics/Paint;

    .line 90
    .line 91
    new-instance v3, Landroid/graphics/Paint;

    .line 92
    .line 93
    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    .line 94
    .line 95
    .line 96
    const-string v4, "#B0000000"

    .line 97
    .line 98
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 103
    .line 104
    .line 105
    iput-object v3, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->d:Landroid/graphics/Paint;

    .line 106
    .line 107
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    const/high16 v4, 0x40a00000    # 5.0f

    .line 116
    .line 117
    invoke-static {v2, v4, v3}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    new-instance v4, Landroid/graphics/Paint;

    .line 122
    .line 123
    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    .line 124
    .line 125
    .line 126
    sget v5, Lcom/xuexiang/xui/R$attr;->colorAccent:I

    .line 127
    .line 128
    const/4 v6, 0x0

    .line 129
    invoke-static {p1, v5, v6}, Lkotlin/collections/u;->F(Landroid/content/Context;II)I

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    invoke-virtual {v4, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v4, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v4, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 140
    .line 141
    .line 142
    iput-object v4, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->c:Landroid/graphics/Paint;

    .line 143
    .line 144
    sget p1, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->x:F

    .line 145
    .line 146
    invoke-static {v2, p1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->q:F

    .line 151
    .line 152
    sget p1, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->y:F

    .line 153
    .line 154
    invoke-static {v2, p1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->p:F

    .line 159
    .line 160
    const/high16 p1, 0x41a00000    # 20.0f

    .line 161
    .line 162
    invoke-static {v2, p1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->r:F

    .line 167
    .line 168
    iput v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->n:I

    .line 169
    .line 170
    return-void
.end method

.method public final d(Landroid/graphics/Rect;)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->o:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->o:Z

    .line 7
    .line 8
    :cond_0
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->j:Z

    .line 9
    .line 10
    if-eqz v0, :cond_4

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    int-to-float v0, v0

    .line 17
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    int-to-float v1, v1

    .line 22
    div-float/2addr v0, v1

    .line 23
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->m:F

    .line 24
    .line 25
    cmpl-float v0, v0, v1

    .line 26
    .line 27
    const/high16 v1, 0x40000000    # 2.0f

    .line 28
    .line 29
    const/high16 v2, 0x42200000    # 40.0f

    .line 30
    .line 31
    if-lez v0, :cond_2

    .line 32
    .line 33
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 34
    .line 35
    iget v3, p1, Landroid/graphics/Rect;->top:I

    .line 36
    .line 37
    int-to-float v3, v3

    .line 38
    invoke-virtual {v0, v3}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->setCoordinate(F)V

    .line 39
    .line 40
    .line 41
    sget-object v3, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 42
    .line 43
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 44
    .line 45
    int-to-float p1, p1

    .line 46
    invoke-virtual {v3, p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->setCoordinate(F)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    int-to-float p1, p1

    .line 54
    div-float/2addr p1, v1

    .line 55
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->m:F

    .line 64
    .line 65
    sub-float/2addr v5, v4

    .line 66
    mul-float/2addr v5, v6

    .line 67
    invoke-static {v2, v5}, Ljava/lang/Math;->max(FF)F

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    cmpl-float v5, v4, v2

    .line 72
    .line 73
    if-nez v5, :cond_1

    .line 74
    .line 75
    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    sub-float/2addr v3, v0

    .line 84
    div-float/2addr v2, v3

    .line 85
    iput v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->m:F

    .line 86
    .line 87
    :cond_1
    div-float/2addr v4, v1

    .line 88
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 89
    .line 90
    sub-float v1, p1, v4

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->setCoordinate(F)V

    .line 93
    .line 94
    .line 95
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 96
    .line 97
    add-float/2addr p1, v4

    .line 98
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->setCoordinate(F)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_2
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 103
    .line 104
    iget v3, p1, Landroid/graphics/Rect;->left:I

    .line 105
    .line 106
    int-to-float v3, v3

    .line 107
    invoke-virtual {v0, v3}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->setCoordinate(F)V

    .line 108
    .line 109
    .line 110
    sget-object v3, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 111
    .line 112
    iget p1, p1, Landroid/graphics/Rect;->right:I

    .line 113
    .line 114
    int-to-float p1, p1

    .line 115
    invoke-virtual {v3, p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->setCoordinate(F)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    int-to-float p1, p1

    .line 123
    div-float/2addr p1, v1

    .line 124
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->m:F

    .line 133
    .line 134
    sub-float/2addr v5, v4

    .line 135
    div-float/2addr v5, v6

    .line 136
    invoke-static {v2, v5}, Ljava/lang/Math;->max(FF)F

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    cmpl-float v5, v4, v2

    .line 141
    .line 142
    if-nez v5, :cond_3

    .line 143
    .line 144
    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    sub-float/2addr v3, v0

    .line 153
    const/4 v0, 0x0

    .line 154
    cmpl-float v0, v3, v0

    .line 155
    .line 156
    if-lez v0, :cond_3

    .line 157
    .line 158
    div-float/2addr v3, v2

    .line 159
    iput v3, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->m:F

    .line 160
    .line 161
    :cond_3
    div-float/2addr v4, v1

    .line 162
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 163
    .line 164
    sub-float v1, p1, v4

    .line 165
    .line 166
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->setCoordinate(F)V

    .line 167
    .line 168
    .line 169
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 170
    .line 171
    add-float/2addr p1, v4

    .line 172
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->setCoordinate(F)V

    .line 173
    .line 174
    .line 175
    return-void

    .line 176
    :cond_4
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    int-to-float v0, v0

    .line 181
    const v1, 0x3dcccccd    # 0.1f

    .line 182
    .line 183
    .line 184
    mul-float/2addr v0, v1

    .line 185
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    int-to-float v2, v2

    .line 190
    mul-float/2addr v2, v1

    .line 191
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 192
    .line 193
    iget v3, p1, Landroid/graphics/Rect;->left:I

    .line 194
    .line 195
    int-to-float v3, v3

    .line 196
    add-float/2addr v3, v0

    .line 197
    invoke-virtual {v1, v3}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->setCoordinate(F)V

    .line 198
    .line 199
    .line 200
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 201
    .line 202
    iget v3, p1, Landroid/graphics/Rect;->top:I

    .line 203
    .line 204
    int-to-float v3, v3

    .line 205
    add-float/2addr v3, v2

    .line 206
    invoke-virtual {v1, v3}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->setCoordinate(F)V

    .line 207
    .line 208
    .line 209
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 210
    .line 211
    iget v3, p1, Landroid/graphics/Rect;->right:I

    .line 212
    .line 213
    int-to-float v3, v3

    .line 214
    sub-float/2addr v3, v0

    .line 215
    invoke-virtual {v1, v3}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->setCoordinate(F)V

    .line 216
    .line 217
    .line 218
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 219
    .line 220
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 221
    .line 222
    int-to-float p1, p1

    .line 223
    sub-float/2addr p1, v2

    .line 224
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->setCoordinate(F)V

    .line 225
    .line 226
    .line 227
    return-void
.end method

.method public final e()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->e:Landroid/graphics/Rect;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->d(Landroid/graphics/Rect;)V

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

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 4
    .line 5
    .line 6
    iget-object v7, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->e:Landroid/graphics/Rect;

    .line 7
    .line 8
    sget-object v8, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 9
    .line 10
    invoke-virtual {v8}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 11
    .line 12
    .line 13
    move-result v9

    .line 14
    sget-object v10, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 15
    .line 16
    invoke-virtual {v10}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    sget-object v11, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 21
    .line 22
    invoke-virtual {v11}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 23
    .line 24
    .line 25
    move-result v12

    .line 26
    sget-object v13, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 27
    .line 28
    invoke-virtual {v13}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 29
    .line 30
    .line 31
    move-result v14

    .line 32
    iget v1, v7, Landroid/graphics/Rect;->left:I

    .line 33
    .line 34
    int-to-float v2, v1

    .line 35
    iget v1, v7, Landroid/graphics/Rect;->top:I

    .line 36
    .line 37
    int-to-float v1, v1

    .line 38
    iget v4, v7, Landroid/graphics/Rect;->right:I

    .line 39
    .line 40
    int-to-float v4, v4

    .line 41
    iget-object v6, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->d:Landroid/graphics/Paint;

    .line 42
    .line 43
    move v5, v3

    .line 44
    move v3, v1

    .line 45
    move-object/from16 v1, p1

    .line 46
    .line 47
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 48
    .line 49
    .line 50
    move v15, v5

    .line 51
    iget v1, v7, Landroid/graphics/Rect;->left:I

    .line 52
    .line 53
    int-to-float v2, v1

    .line 54
    iget v1, v7, Landroid/graphics/Rect;->right:I

    .line 55
    .line 56
    int-to-float v4, v1

    .line 57
    iget v1, v7, Landroid/graphics/Rect;->bottom:I

    .line 58
    .line 59
    int-to-float v5, v1

    .line 60
    iget-object v6, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->d:Landroid/graphics/Paint;

    .line 61
    .line 62
    move-object/from16 v1, p1

    .line 63
    .line 64
    move v3, v14

    .line 65
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 66
    .line 67
    .line 68
    move v5, v3

    .line 69
    iget v1, v7, Landroid/graphics/Rect;->left:I

    .line 70
    .line 71
    int-to-float v2, v1

    .line 72
    iget-object v6, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->d:Landroid/graphics/Paint;

    .line 73
    .line 74
    move-object/from16 v1, p1

    .line 75
    .line 76
    move v4, v9

    .line 77
    move v3, v15

    .line 78
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 79
    .line 80
    .line 81
    iget v1, v7, Landroid/graphics/Rect;->right:I

    .line 82
    .line 83
    int-to-float v4, v1

    .line 84
    iget-object v6, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->d:Landroid/graphics/Paint;

    .line 85
    .line 86
    move-object/from16 v1, p1

    .line 87
    .line 88
    move v2, v12

    .line 89
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 90
    .line 91
    .line 92
    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->f()Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-eqz v1, :cond_1

    .line 97
    .line 98
    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->n:I

    .line 99
    .line 100
    const/4 v2, 0x2

    .line 101
    if-ne v1, v2, :cond_0

    .line 102
    .line 103
    invoke-virtual/range {p0 .. p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->b(Landroid/graphics/Canvas;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual/range {p0 .. p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->a(Landroid/graphics/Canvas;)V

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_0
    const/4 v2, 0x1

    .line 111
    if-ne v1, v2, :cond_1

    .line 112
    .line 113
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->i:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 114
    .line 115
    if-eqz v1, :cond_1

    .line 116
    .line 117
    invoke-virtual/range {p0 .. p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->b(Landroid/graphics/Canvas;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual/range {p0 .. p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->a(Landroid/graphics/Canvas;)V

    .line 121
    .line 122
    .line 123
    :cond_1
    :goto_0
    invoke-virtual {v8}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    invoke-virtual {v10}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    invoke-virtual {v11}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    invoke-virtual {v13}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    iget-object v6, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->a:Landroid/graphics/Paint;

    .line 140
    .line 141
    move-object/from16 v1, p1

    .line 142
    .line 143
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v8}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 147
    .line 148
    .line 149
    move-result v7

    .line 150
    invoke-virtual {v10}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 151
    .line 152
    .line 153
    move-result v8

    .line 154
    invoke-virtual {v11}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 155
    .line 156
    .line 157
    move-result v9

    .line 158
    invoke-virtual {v13}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 159
    .line 160
    .line 161
    move-result v10

    .line 162
    iget-object v2, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->u:Landroid/graphics/Bitmap;

    .line 163
    .line 164
    if-eqz v2, :cond_2

    .line 165
    .line 166
    iget v3, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->v:I

    .line 167
    .line 168
    int-to-float v3, v3

    .line 169
    const/high16 v4, 0x40000000    # 2.0f

    .line 170
    .line 171
    div-float/2addr v3, v4

    .line 172
    sub-float v3, v7, v3

    .line 173
    .line 174
    iget v5, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->w:I

    .line 175
    .line 176
    int-to-float v5, v5

    .line 177
    div-float/2addr v5, v4

    .line 178
    sub-float v5, v8, v5

    .line 179
    .line 180
    const/4 v6, 0x0

    .line 181
    invoke-virtual {v1, v2, v3, v5, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 182
    .line 183
    .line 184
    iget-object v2, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->u:Landroid/graphics/Bitmap;

    .line 185
    .line 186
    iget v3, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->v:I

    .line 187
    .line 188
    int-to-float v3, v3

    .line 189
    div-float/2addr v3, v4

    .line 190
    sub-float v3, v9, v3

    .line 191
    .line 192
    iget v5, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->w:I

    .line 193
    .line 194
    int-to-float v5, v5

    .line 195
    div-float/2addr v5, v4

    .line 196
    sub-float/2addr v8, v5

    .line 197
    invoke-virtual {v1, v2, v3, v8, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 198
    .line 199
    .line 200
    iget-object v2, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->u:Landroid/graphics/Bitmap;

    .line 201
    .line 202
    iget v3, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->v:I

    .line 203
    .line 204
    int-to-float v3, v3

    .line 205
    div-float/2addr v3, v4

    .line 206
    sub-float/2addr v7, v3

    .line 207
    iget v3, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->w:I

    .line 208
    .line 209
    int-to-float v3, v3

    .line 210
    div-float/2addr v3, v4

    .line 211
    sub-float v3, v10, v3

    .line 212
    .line 213
    invoke-virtual {v1, v2, v7, v3, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 214
    .line 215
    .line 216
    iget-object v2, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->u:Landroid/graphics/Bitmap;

    .line 217
    .line 218
    iget v3, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->v:I

    .line 219
    .line 220
    int-to-float v3, v3

    .line 221
    div-float/2addr v3, v4

    .line 222
    sub-float/2addr v9, v3

    .line 223
    iget v3, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->w:I

    .line 224
    .line 225
    int-to-float v3, v3

    .line 226
    div-float/2addr v3, v4

    .line 227
    sub-float/2addr v10, v3

    .line 228
    invoke-virtual {v1, v2, v9, v10, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 229
    .line 230
    .line 231
    return-void

    .line 232
    :cond_2
    iget v2, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->q:F

    .line 233
    .line 234
    sub-float v2, v7, v2

    .line 235
    .line 236
    iget v3, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->p:F

    .line 237
    .line 238
    sub-float v3, v8, v3

    .line 239
    .line 240
    iget v4, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->r:F

    .line 241
    .line 242
    add-float v5, v8, v4

    .line 243
    .line 244
    iget-object v6, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->c:Landroid/graphics/Paint;

    .line 245
    .line 246
    move v4, v2

    .line 247
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 248
    .line 249
    .line 250
    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->q:F

    .line 251
    .line 252
    sub-float v3, v8, v1

    .line 253
    .line 254
    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->r:F

    .line 255
    .line 256
    add-float v4, v7, v1

    .line 257
    .line 258
    iget-object v6, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->c:Landroid/graphics/Paint;

    .line 259
    .line 260
    move v5, v3

    .line 261
    move-object/from16 v1, p1

    .line 262
    .line 263
    move v2, v7

    .line 264
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 265
    .line 266
    .line 267
    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->q:F

    .line 268
    .line 269
    add-float v2, v9, v1

    .line 270
    .line 271
    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->p:F

    .line 272
    .line 273
    sub-float v3, v8, v1

    .line 274
    .line 275
    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->r:F

    .line 276
    .line 277
    add-float v5, v8, v1

    .line 278
    .line 279
    iget-object v6, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->c:Landroid/graphics/Paint;

    .line 280
    .line 281
    move v4, v2

    .line 282
    move-object/from16 v1, p1

    .line 283
    .line 284
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 285
    .line 286
    .line 287
    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->q:F

    .line 288
    .line 289
    sub-float v3, v8, v1

    .line 290
    .line 291
    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->r:F

    .line 292
    .line 293
    sub-float v4, v9, v1

    .line 294
    .line 295
    iget-object v6, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->c:Landroid/graphics/Paint;

    .line 296
    .line 297
    move v5, v3

    .line 298
    move-object/from16 v1, p1

    .line 299
    .line 300
    move v2, v9

    .line 301
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 302
    .line 303
    .line 304
    move v8, v2

    .line 305
    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->q:F

    .line 306
    .line 307
    sub-float v2, v7, v1

    .line 308
    .line 309
    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->p:F

    .line 310
    .line 311
    add-float v3, v10, v1

    .line 312
    .line 313
    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->r:F

    .line 314
    .line 315
    sub-float v5, v10, v1

    .line 316
    .line 317
    iget-object v6, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->c:Landroid/graphics/Paint;

    .line 318
    .line 319
    move v4, v2

    .line 320
    move-object/from16 v1, p1

    .line 321
    .line 322
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 323
    .line 324
    .line 325
    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->q:F

    .line 326
    .line 327
    add-float v3, v10, v1

    .line 328
    .line 329
    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->r:F

    .line 330
    .line 331
    add-float v4, v7, v1

    .line 332
    .line 333
    iget-object v6, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->c:Landroid/graphics/Paint;

    .line 334
    .line 335
    move v5, v3

    .line 336
    move-object/from16 v1, p1

    .line 337
    .line 338
    move v2, v7

    .line 339
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 340
    .line 341
    .line 342
    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->q:F

    .line 343
    .line 344
    add-float v2, v8, v1

    .line 345
    .line 346
    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->p:F

    .line 347
    .line 348
    add-float v3, v10, v1

    .line 349
    .line 350
    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->r:F

    .line 351
    .line 352
    sub-float v5, v10, v1

    .line 353
    .line 354
    iget-object v6, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->c:Landroid/graphics/Paint;

    .line 355
    .line 356
    move v4, v2

    .line 357
    move-object/from16 v1, p1

    .line 358
    .line 359
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 360
    .line 361
    .line 362
    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->q:F

    .line 363
    .line 364
    add-float v3, v10, v1

    .line 365
    .line 366
    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->r:F

    .line 367
    .line 368
    sub-float v4, v8, v1

    .line 369
    .line 370
    iget-object v6, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->c:Landroid/graphics/Paint;

    .line 371
    .line 372
    move v5, v3

    .line 373
    move-object/from16 v1, p1

    .line 374
    .line 375
    move v2, v8

    .line 376
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 377
    .line 378
    .line 379
    return-void
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->e:Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->d(Landroid/graphics/Rect;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

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
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x1

    .line 15
    if-eqz v0, :cond_6

    .line 16
    .line 17
    if-eq v0, v3, :cond_4

    .line 18
    .line 19
    const/4 v4, 0x2

    .line 20
    if-eq v0, v4, :cond_1

    .line 21
    .line 22
    const/4 p1, 0x3

    .line 23
    if-eq v0, p1, :cond_4

    .line 24
    .line 25
    :goto_0
    return v1

    .line 26
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->i:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 35
    .line 36
    if-nez v1, :cond_2

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->h:Landroid/util/Pair;

    .line 40
    .line 41
    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, Ljava/lang/Float;

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    add-float v5, v1, v0

    .line 50
    .line 51
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->h:Landroid/util/Pair;

    .line 52
    .line 53
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Ljava/lang/Float;

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    add-float v6, v0, p1

    .line 62
    .line 63
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->j:Z

    .line 64
    .line 65
    if-eqz p1, :cond_3

    .line 66
    .line 67
    iget-object v4, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->i:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 68
    .line 69
    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->m:F

    .line 70
    .line 71
    iget-object v8, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->e:Landroid/graphics/Rect;

    .line 72
    .line 73
    iget v9, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->g:F

    .line 74
    .line 75
    invoke-virtual/range {v4 .. v9}, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->updateCropWindow(FFFLandroid/graphics/Rect;F)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->i:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 80
    .line 81
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->e:Landroid/graphics/Rect;

    .line 82
    .line 83
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->g:F

    .line 84
    .line 85
    invoke-virtual {p1, v5, v6, v0, v1}, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->updateCropWindow(FFLandroid/graphics/Rect;F)V

    .line 86
    .line 87
    .line 88
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 89
    .line 90
    .line 91
    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-interface {p1, v3}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 96
    .line 97
    .line 98
    return v3

    .line 99
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-interface {p1, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 104
    .line 105
    .line 106
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->i:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 107
    .line 108
    if-nez p1, :cond_5

    .line 109
    .line 110
    goto/16 :goto_4

    .line 111
    .line 112
    :cond_5
    iput-object v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->i:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 113
    .line 114
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 115
    .line 116
    .line 117
    return v3

    .line 118
    :cond_6
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 127
    .line 128
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    sget-object v4, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 133
    .line 134
    invoke-virtual {v4}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    sget-object v5, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 139
    .line 140
    invoke-virtual {v5}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    sget-object v6, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 145
    .line 146
    invoke-virtual {v6}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 147
    .line 148
    .line 149
    move-result v6

    .line 150
    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->f:F

    .line 151
    .line 152
    invoke-static {v0, p1, v1, v4, v7}, Lv7/l;->o(FFFFF)Z

    .line 153
    .line 154
    .line 155
    move-result v8

    .line 156
    if-eqz v8, :cond_7

    .line 157
    .line 158
    sget-object v2, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->TOP_LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 159
    .line 160
    goto/16 :goto_3

    .line 161
    .line 162
    :cond_7
    invoke-static {v0, p1, v5, v4, v7}, Lv7/l;->o(FFFFF)Z

    .line 163
    .line 164
    .line 165
    move-result v8

    .line 166
    if-eqz v8, :cond_8

    .line 167
    .line 168
    sget-object v2, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->TOP_RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 169
    .line 170
    goto/16 :goto_3

    .line 171
    .line 172
    :cond_8
    invoke-static {v0, p1, v1, v6, v7}, Lv7/l;->o(FFFFF)Z

    .line 173
    .line 174
    .line 175
    move-result v8

    .line 176
    if-eqz v8, :cond_9

    .line 177
    .line 178
    sget-object v2, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->BOTTOM_LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 179
    .line 180
    goto/16 :goto_3

    .line 181
    .line 182
    :cond_9
    invoke-static {v0, p1, v5, v6, v7}, Lv7/l;->o(FFFFF)Z

    .line 183
    .line 184
    .line 185
    move-result v8

    .line 186
    if-eqz v8, :cond_a

    .line 187
    .line 188
    sget-object v2, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->BOTTOM_RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 189
    .line 190
    goto/16 :goto_3

    .line 191
    .line 192
    :cond_a
    cmpl-float v8, v0, v1

    .line 193
    .line 194
    if-lez v8, :cond_b

    .line 195
    .line 196
    cmpg-float v9, v0, v5

    .line 197
    .line 198
    if-gez v9, :cond_b

    .line 199
    .line 200
    cmpl-float v9, p1, v4

    .line 201
    .line 202
    if-lez v9, :cond_b

    .line 203
    .line 204
    cmpg-float v9, p1, v6

    .line 205
    .line 206
    if-gez v9, :cond_b

    .line 207
    .line 208
    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->f()Z

    .line 209
    .line 210
    .line 211
    move-result v9

    .line 212
    if-nez v9, :cond_b

    .line 213
    .line 214
    sget-object v2, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->CENTER:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 215
    .line 216
    goto/16 :goto_3

    .line 217
    .line 218
    :cond_b
    if-lez v8, :cond_c

    .line 219
    .line 220
    cmpg-float v9, v0, v5

    .line 221
    .line 222
    if-gez v9, :cond_c

    .line 223
    .line 224
    sub-float v9, p1, v4

    .line 225
    .line 226
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    .line 227
    .line 228
    .line 229
    move-result v9

    .line 230
    cmpg-float v9, v9, v7

    .line 231
    .line 232
    if-gtz v9, :cond_c

    .line 233
    .line 234
    sget-object v2, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 235
    .line 236
    goto :goto_3

    .line 237
    :cond_c
    if-lez v8, :cond_d

    .line 238
    .line 239
    cmpg-float v9, v0, v5

    .line 240
    .line 241
    if-gez v9, :cond_d

    .line 242
    .line 243
    sub-float v9, p1, v6

    .line 244
    .line 245
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    .line 246
    .line 247
    .line 248
    move-result v9

    .line 249
    cmpg-float v9, v9, v7

    .line 250
    .line 251
    if-gtz v9, :cond_d

    .line 252
    .line 253
    sget-object v2, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 254
    .line 255
    goto :goto_3

    .line 256
    :cond_d
    sub-float v9, v0, v1

    .line 257
    .line 258
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    .line 259
    .line 260
    .line 261
    move-result v9

    .line 262
    cmpg-float v9, v9, v7

    .line 263
    .line 264
    if-gtz v9, :cond_e

    .line 265
    .line 266
    cmpl-float v9, p1, v4

    .line 267
    .line 268
    if-lez v9, :cond_e

    .line 269
    .line 270
    cmpg-float v9, p1, v6

    .line 271
    .line 272
    if-gez v9, :cond_e

    .line 273
    .line 274
    sget-object v2, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 275
    .line 276
    goto :goto_3

    .line 277
    :cond_e
    sub-float v9, v0, v5

    .line 278
    .line 279
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    .line 280
    .line 281
    .line 282
    move-result v9

    .line 283
    cmpg-float v7, v9, v7

    .line 284
    .line 285
    if-gtz v7, :cond_f

    .line 286
    .line 287
    cmpl-float v7, p1, v4

    .line 288
    .line 289
    if-lez v7, :cond_f

    .line 290
    .line 291
    cmpg-float v7, p1, v6

    .line 292
    .line 293
    if-gez v7, :cond_f

    .line 294
    .line 295
    sget-object v2, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 296
    .line 297
    goto :goto_3

    .line 298
    :cond_f
    if-lez v8, :cond_10

    .line 299
    .line 300
    cmpg-float v7, v0, v5

    .line 301
    .line 302
    if-gez v7, :cond_10

    .line 303
    .line 304
    cmpl-float v7, p1, v4

    .line 305
    .line 306
    if-lez v7, :cond_10

    .line 307
    .line 308
    cmpg-float v7, p1, v6

    .line 309
    .line 310
    if-gez v7, :cond_10

    .line 311
    .line 312
    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->f()Z

    .line 313
    .line 314
    .line 315
    move-result v7

    .line 316
    if-eqz v7, :cond_10

    .line 317
    .line 318
    sget-object v2, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->CENTER:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 319
    .line 320
    :cond_10
    :goto_3
    iput-object v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->i:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 321
    .line 322
    if-nez v2, :cond_11

    .line 323
    .line 324
    :goto_4
    return v3

    .line 325
    :cond_11
    sget-object v7, Lp2/d;->a:[I

    .line 326
    .line 327
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 328
    .line 329
    .line 330
    move-result v2

    .line 331
    aget v2, v7, v2

    .line 332
    .line 333
    const/4 v7, 0x0

    .line 334
    packed-switch v2, :pswitch_data_0

    .line 335
    .line 336
    .line 337
    move p1, v7

    .line 338
    goto :goto_7

    .line 339
    :pswitch_0
    add-float/2addr v5, v1

    .line 340
    const/high16 v1, 0x40000000    # 2.0f

    .line 341
    .line 342
    div-float/2addr v5, v1

    .line 343
    add-float/2addr v4, v6

    .line 344
    div-float/2addr v4, v1

    .line 345
    :pswitch_1
    sub-float v7, v5, v0

    .line 346
    .line 347
    :goto_5
    sub-float p1, v4, p1

    .line 348
    .line 349
    goto :goto_7

    .line 350
    :pswitch_2
    sub-float/2addr v6, p1

    .line 351
    move p1, v6

    .line 352
    goto :goto_7

    .line 353
    :pswitch_3
    sub-float/2addr v5, v0

    .line 354
    move p1, v7

    .line 355
    move v7, v5

    .line 356
    goto :goto_7

    .line 357
    :pswitch_4
    sub-float/2addr v4, p1

    .line 358
    move p1, v4

    .line 359
    goto :goto_7

    .line 360
    :pswitch_5
    sub-float/2addr v1, v0

    .line 361
    move p1, v7

    .line 362
    move v7, v1

    .line 363
    goto :goto_7

    .line 364
    :pswitch_6
    sub-float v7, v5, v0

    .line 365
    .line 366
    :goto_6
    sub-float p1, v6, p1

    .line 367
    .line 368
    goto :goto_7

    .line 369
    :pswitch_7
    sub-float v7, v1, v0

    .line 370
    .line 371
    goto :goto_6

    .line 372
    :pswitch_8
    sub-float v7, v1, v0

    .line 373
    .line 374
    goto :goto_5

    .line 375
    :goto_7
    new-instance v0, Landroid/util/Pair;

    .line 376
    .line 377
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 382
    .line 383
    .line 384
    move-result-object p1

    .line 385
    invoke-direct {v0, v1, p1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->h:Landroid/util/Pair;

    .line 389
    .line 390
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 391
    .line 392
    .line 393
    return v3

    .line 394
    nop

    .line 395
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method public setAspectRatioX(I)V
    .locals 1

    .line 1
    if-lez p1, :cond_0

    .line 2
    .line 3
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->k:I

    .line 4
    .line 5
    int-to-float p1, p1

    .line 6
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->l:I

    .line 7
    .line 8
    int-to-float v0, v0

    .line 9
    div-float/2addr p1, v0

    .line 10
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->m:F

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->e()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    const-string v0, "Cannot set aspect ratio value to a number less than or equal to 0."

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1
.end method

.method public setAspectRatioY(I)V
    .locals 1

    .line 1
    if-lez p1, :cond_0

    .line 2
    .line 3
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->l:I

    .line 4
    .line 5
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->k:I

    .line 6
    .line 7
    int-to-float v0, v0

    .line 8
    int-to-float p1, p1

    .line 9
    div-float/2addr v0, p1

    .line 10
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->m:F

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->e()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    const-string v0, "Cannot set aspect ratio value to a number less than or equal to 0."

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1
.end method

.method public setBitmapRect(Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->e:Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->d(Landroid/graphics/Rect;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setBorderAndGuidelineColor(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->a:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->b:Landroid/graphics/Paint;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->e()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public setBorderColor(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->a:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->e()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setBorderWidth(F)V
    .locals 1
    .param p1    # F
        .annotation build Landroidx/annotation/Dimension;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->a:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->e()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setCornerColor(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->c:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->e()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setCornerWidth(F)V
    .locals 1
    .param p1    # F
        .annotation build Landroidx/annotation/Dimension;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->c:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->e()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setCropOverlayCornerBitmap(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->u:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->v:I

    .line 10
    .line 11
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->u:Landroid/graphics/Bitmap;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->w:I

    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public setFixedAspectRatio(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->j:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->e()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setGuidelineColor(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->b:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->e()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setGuidelineWidth(F)V
    .locals 1
    .param p1    # F
        .annotation build Landroidx/annotation/Dimension;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->b:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->e()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setGuidelines(I)V
    .locals 1

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    if-gt p1, v0, :cond_0

    .line 5
    .line 6
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->n:I

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->e()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 13
    .line 14
    const-string v0, "Guideline value must be set between 0 and 2. See documentation."

    .line 15
    .line 16
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1
.end method
