.class public Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;
.super Landroid/view/View;
.source ""


# static fields
.field public static final w:F

.field public static final x:F


# instance fields
.field public b:Landroid/graphics/Paint;

.field public c:Landroid/graphics/Paint;

.field public d:Landroid/graphics/Paint;

.field public e:Landroid/graphics/Paint;

.field public f:Landroid/graphics/Rect;

.field public g:F

.field public h:F

.field public i:Landroid/util/Pair;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Pair<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public j:Lb/c/a/e/f/a/e;

.field public k:Z

.field public l:I

.field public m:I

.field public n:F

.field public o:I

.field public p:Z

.field public q:F

.field public r:F

.field public s:F

.field public t:Landroid/graphics/Bitmap;

.field public u:I

.field public v:I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const/high16 v0, 0x40a00000    # 5.0f

    const/high16 v1, 0x40000000    # 2.0f

    div-float v2, v0, v1

    const/high16 v3, 0x40400000    # 3.0f

    div-float/2addr v3, v1

    sub-float/2addr v2, v3

    sput v2, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->w:F

    div-float/2addr v0, v1

    add-float/2addr v0, v2

    sput v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->x:F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, 0x0

    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->k:Z

    const/4 v0, 0x1

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->l:I

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->m:I

    int-to-float v1, v0

    div-float/2addr v1, v1

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->n:F

    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->p:Z

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->t:Landroid/graphics/Bitmap;

    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->u:I

    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->v:I

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    const/high16 v2, 0x41c00000    # 24.0f

    invoke-static {v0, v2, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v1

    .line 3
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->g:F

    const/high16 v1, 0x40c00000    # 6.0f

    invoke-static {v0, v1, p2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->h:F

    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    const/high16 v2, 0x40400000    # 3.0f

    invoke-static {v0, v2, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v1

    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    const-string v3, "#AAFFFFFF"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 5
    iput-object v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->b:Landroid/graphics/Paint;

    .line 6
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 7
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->c:Landroid/graphics/Paint;

    .line 8
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    const-string v2, "#B0000000"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 9
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->e:Landroid/graphics/Paint;

    .line 10
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    const/high16 v2, 0x40a00000    # 5.0f

    invoke-static {v0, v2, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v1

    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    .line 11
    sget-object v3, La/h/c/a;->a:Ljava/lang/Object;

    const v3, 0x7f060141

    invoke-static {p1, v3}, La/h/c/a$d;->a(Landroid/content/Context;I)I

    move-result v3

    const v4, 0x7f04015c

    .line 12
    invoke-static {p1, v4, v3}, Lb/c/a/a;->B(Landroid/content/Context;II)I

    move-result p1

    .line 13
    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    sget-object p1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 14
    iput-object v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->d:Landroid/graphics/Paint;

    sget p1, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->w:F

    invoke-static {v0, p1, p2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->r:F

    sget p1, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->x:F

    invoke-static {v0, p1, p2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->q:F

    const/high16 p1, 0x41a00000    # 20.0f

    invoke-static {v0, p1, p2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->s:F

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->o:I

    return-void
.end method

.method public static e()Z
    .locals 3

    sget-object v0, Lb/c/a/e/f/a/c;->c:Lb/c/a/e/f/a/c;

    .line 1
    iget v0, v0, Lb/c/a/e/f/a/c;->b:F

    .line 2
    sget-object v1, Lb/c/a/e/f/a/c;->e:Lb/c/a/e/f/a/c;

    .line 3
    iget v1, v1, Lb/c/a/e/f/a/c;->b:F

    sub-float/2addr v0, v1

    .line 4
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v1, 0x42c80000    # 100.0f

    cmpg-float v0, v0, v1

    if-ltz v0, :cond_0

    sget-object v0, Lb/c/a/e/f/a/c;->d:Lb/c/a/e/f/a/c;

    .line 5
    iget v0, v0, Lb/c/a/e/f/a/c;->b:F

    .line 6
    sget-object v2, Lb/c/a/e/f/a/c;->f:Lb/c/a/e/f/a/c;

    .line 7
    iget v2, v2, Lb/c/a/e/f/a/c;->b:F

    sub-float/2addr v0, v2

    .line 8
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpg-float v0, v0, v1

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public final a(Landroid/graphics/Canvas;)V
    .locals 8

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->f:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->f:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v1

    int-to-float v1, v1

    const/4 v2, 0x0

    int-to-float v2, v2

    div-float v0, v2, v0

    div-float/2addr v2, v1

    .line 1
    sget-object v1, Lb/c/a/e/f/a/c;->e:Lb/c/a/e/f/a/c;

    .line 2
    iget v3, v1, Lb/c/a/e/f/a/c;->b:F

    .line 3
    sget-object v4, Lb/c/a/e/f/a/c;->c:Lb/c/a/e/f/a/c;

    .line 4
    iget v5, v4, Lb/c/a/e/f/a/c;->b:F

    sub-float/2addr v3, v5

    mul-float/2addr v3, v0

    float-to-int v0, v3

    .line 5
    sget-object v3, Lb/c/a/e/f/a/c;->f:Lb/c/a/e/f/a/c;

    .line 6
    iget v5, v3, Lb/c/a/e/f/a/c;->b:F

    .line 7
    sget-object v6, Lb/c/a/e/f/a/c;->d:Lb/c/a/e/f/a/c;

    .line 8
    iget v7, v6, Lb/c/a/e/f/a/c;->b:F

    sub-float/2addr v5, v7

    mul-float/2addr v5, v2

    float-to-int v2, v5

    .line 9
    iget-object v5, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->b:Landroid/graphics/Paint;

    const/4 v7, 0x0

    invoke-virtual {v5, v7}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v5, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->b:Landroid/graphics/Paint;

    sget-object v7, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v5, v7}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    iget-object v5, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->b:Landroid/graphics/Paint;

    const/high16 v7, 0x41c80000    # 25.0f

    invoke-virtual {v5, v7}, Landroid/graphics/Paint;->setTextSize(F)V

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "x"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 10
    iget v2, v4, Lb/c/a/e/f/a/c;->b:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v2, v4

    iget v1, v1, Lb/c/a/e/f/a/c;->b:F

    div-float/2addr v1, v4

    add-float/2addr v1, v2

    iget v2, v6, Lb/c/a/e/f/a/c;->b:F

    div-float/2addr v2, v4

    iget v3, v3, Lb/c/a/e/f/a/c;->b:F

    div-float/2addr v3, v4

    add-float/2addr v3, v2

    .line 11
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->b:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v3, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method public final b(Landroid/graphics/Canvas;)V
    .locals 14

    sget-object v0, Lb/c/a/e/f/a/c;->c:Lb/c/a/e/f/a/c;

    .line 1
    iget v0, v0, Lb/c/a/e/f/a/c;->b:F

    .line 2
    sget-object v1, Lb/c/a/e/f/a/c;->d:Lb/c/a/e/f/a/c;

    .line 3
    iget v8, v1, Lb/c/a/e/f/a/c;->b:F

    .line 4
    sget-object v2, Lb/c/a/e/f/a/c;->e:Lb/c/a/e/f/a/c;

    .line 5
    iget v9, v2, Lb/c/a/e/f/a/c;->b:F

    .line 6
    sget-object v10, Lb/c/a/e/f/a/c;->f:Lb/c/a/e/f/a/c;

    .line 7
    iget v11, v10, Lb/c/a/e/f/a/c;->b:F

    sub-float v2, v9, v0

    const/high16 v12, 0x40400000    # 3.0f

    div-float v13, v2, v12

    add-float v5, v0, v13

    .line 8
    iget-object v7, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->c:Landroid/graphics/Paint;

    move-object v2, p1

    move v3, v5

    move v4, v8

    move v6, v11

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    sub-float v5, v9, v13

    iget-object v7, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->c:Landroid/graphics/Paint;

    move v3, v5

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 9
    iget v2, v10, Lb/c/a/e/f/a/c;->b:F

    iget v1, v1, Lb/c/a/e/f/a/c;->b:F

    sub-float/2addr v2, v1

    div-float v7, v2, v12

    add-float v5, v8, v7

    .line 10
    iget-object v6, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->c:Landroid/graphics/Paint;

    move-object v1, p1

    move v2, v0

    move v3, v5

    move v4, v9

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    sub-float v5, v11, v7

    iget-object v6, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->c:Landroid/graphics/Paint;

    move v3, v5

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public final c(Landroid/graphics/Rect;)V
    .locals 9

    sget-object v0, Lb/c/a/e/f/a/c;->f:Lb/c/a/e/f/a/c;

    sget-object v1, Lb/c/a/e/f/a/c;->e:Lb/c/a/e/f/a/c;

    sget-object v2, Lb/c/a/e/f/a/c;->d:Lb/c/a/e/f/a/c;

    sget-object v3, Lb/c/a/e/f/a/c;->c:Lb/c/a/e/f/a/c;

    iget-boolean v4, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->p:Z

    if-nez v4, :cond_0

    const/4 v4, 0x1

    iput-boolean v4, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->p:Z

    :cond_0
    iget-boolean v4, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->k:Z

    if-eqz v4, :cond_4

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v4, v5

    .line 2
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->n:F

    cmpl-float v4, v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    const/high16 v6, 0x42200000    # 40.0f

    if-lez v4, :cond_2

    iget v4, p1, Landroid/graphics/Rect;->top:I

    int-to-float v4, v4

    .line 3
    iput v4, v2, Lb/c/a/e/f/a/c;->b:F

    .line 4
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    int-to-float p1, p1

    .line 5
    iput p1, v0, Lb/c/a/e/f/a/c;->b:F

    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    int-to-float p1, p1

    div-float/2addr p1, v5

    .line 7
    iget v4, v2, Lb/c/a/e/f/a/c;->b:F

    iget v7, v0, Lb/c/a/e/f/a/c;->b:F

    .line 8
    iget v8, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->n:F

    sub-float/2addr v7, v4

    mul-float/2addr v7, v8

    invoke-static {v6, v7}, Ljava/lang/Math;->max(FF)F

    move-result v4

    cmpl-float v7, v4, v6

    if-nez v7, :cond_1

    .line 9
    iget v0, v0, Lb/c/a/e/f/a/c;->b:F

    iget v2, v2, Lb/c/a/e/f/a/c;->b:F

    sub-float/2addr v0, v2

    div-float/2addr v6, v0

    .line 10
    iput v6, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->n:F

    :cond_1
    div-float/2addr v4, v5

    sub-float v0, p1, v4

    .line 11
    iput v0, v3, Lb/c/a/e/f/a/c;->b:F

    add-float/2addr p1, v4

    iput p1, v1, Lb/c/a/e/f/a/c;->b:F

    goto :goto_1

    .line 12
    :cond_2
    iget v4, p1, Landroid/graphics/Rect;->left:I

    int-to-float v4, v4

    .line 13
    iput v4, v3, Lb/c/a/e/f/a/c;->b:F

    .line 14
    iget p1, p1, Landroid/graphics/Rect;->right:I

    int-to-float p1, p1

    .line 15
    iput p1, v1, Lb/c/a/e/f/a/c;->b:F

    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p1

    int-to-float p1, p1

    div-float/2addr p1, v5

    .line 17
    iget v4, v3, Lb/c/a/e/f/a/c;->b:F

    iget v7, v1, Lb/c/a/e/f/a/c;->b:F

    .line 18
    iget v8, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->n:F

    sub-float/2addr v7, v4

    div-float/2addr v7, v8

    invoke-static {v6, v7}, Ljava/lang/Math;->max(FF)F

    move-result v4

    cmpl-float v7, v4, v6

    if-nez v7, :cond_3

    .line 19
    iget v1, v1, Lb/c/a/e/f/a/c;->b:F

    iget v3, v3, Lb/c/a/e/f/a/c;->b:F

    sub-float/2addr v1, v3

    const/4 v3, 0x0

    cmpl-float v3, v1, v3

    if-lez v3, :cond_3

    div-float/2addr v1, v6

    .line 20
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->n:F

    :cond_3
    div-float/2addr v4, v5

    sub-float v1, p1, v4

    .line 21
    iput v1, v2, Lb/c/a/e/f/a/c;->b:F

    add-float/2addr p1, v4

    goto :goto_0

    .line 22
    :cond_4
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v4

    int-to-float v4, v4

    const v5, 0x3dcccccd    # 0.1f

    mul-float/2addr v4, v5

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result v6

    int-to-float v6, v6

    mul-float/2addr v6, v5

    iget v5, p1, Landroid/graphics/Rect;->left:I

    int-to-float v5, v5

    add-float/2addr v5, v4

    .line 23
    iput v5, v3, Lb/c/a/e/f/a/c;->b:F

    .line 24
    iget v3, p1, Landroid/graphics/Rect;->top:I

    int-to-float v3, v3

    add-float/2addr v3, v6

    .line 25
    iput v3, v2, Lb/c/a/e/f/a/c;->b:F

    .line 26
    iget v2, p1, Landroid/graphics/Rect;->right:I

    int-to-float v2, v2

    sub-float/2addr v2, v4

    .line 27
    iput v2, v1, Lb/c/a/e/f/a/c;->b:F

    .line 28
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    int-to-float p1, p1

    sub-float/2addr p1, v6

    .line 29
    :goto_0
    iput p1, v0, Lb/c/a/e/f/a/c;->b:F

    :goto_1
    return-void
.end method

.method public d()V
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->p:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->f:Landroid/graphics/Rect;

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->c(Landroid/graphics/Rect;)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    iget-object v8, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->f:Landroid/graphics/Rect;

    .line 1
    sget-object v9, Lb/c/a/e/f/a/c;->c:Lb/c/a/e/f/a/c;

    .line 2
    iget v10, v9, Lb/c/a/e/f/a/c;->b:F

    .line 3
    sget-object v11, Lb/c/a/e/f/a/c;->d:Lb/c/a/e/f/a/c;

    .line 4
    iget v12, v11, Lb/c/a/e/f/a/c;->b:F

    .line 5
    sget-object v13, Lb/c/a/e/f/a/c;->e:Lb/c/a/e/f/a/c;

    .line 6
    iget v14, v13, Lb/c/a/e/f/a/c;->b:F

    .line 7
    sget-object v15, Lb/c/a/e/f/a/c;->f:Lb/c/a/e/f/a/c;

    .line 8
    iget v6, v15, Lb/c/a/e/f/a/c;->b:F

    .line 9
    iget v1, v8, Landroid/graphics/Rect;->left:I

    int-to-float v2, v1

    iget v1, v8, Landroid/graphics/Rect;->top:I

    int-to-float v3, v1

    iget v1, v8, Landroid/graphics/Rect;->right:I

    int-to-float v4, v1

    iget-object v5, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->e:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move-object/from16 v16, v5

    move v5, v12

    move/from16 v17, v6

    move-object/from16 v6, v16

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    iget v1, v8, Landroid/graphics/Rect;->left:I

    int-to-float v2, v1

    iget v1, v8, Landroid/graphics/Rect;->right:I

    int-to-float v4, v1

    iget v1, v8, Landroid/graphics/Rect;->bottom:I

    int-to-float v5, v1

    iget-object v6, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->e:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move/from16 v3, v17

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    iget v1, v8, Landroid/graphics/Rect;->left:I

    int-to-float v2, v1

    iget-object v6, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->e:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move v3, v12

    move v4, v10

    move/from16 v5, v17

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    iget v1, v8, Landroid/graphics/Rect;->right:I

    int-to-float v4, v1

    iget-object v6, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->e:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move v2, v14

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 10
    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->e()Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->o:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    :goto_0
    invoke-virtual/range {p0 .. p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->b(Landroid/graphics/Canvas;)V

    invoke-virtual/range {p0 .. p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->a(Landroid/graphics/Canvas;)V

    goto :goto_1

    :cond_0
    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->j:Lb/c/a/e/f/a/e;

    if-eqz v1, :cond_1

    goto :goto_0

    .line 11
    :cond_1
    :goto_1
    iget v2, v9, Lb/c/a/e/f/a/c;->b:F

    iget v3, v11, Lb/c/a/e/f/a/c;->b:F

    iget v4, v13, Lb/c/a/e/f/a/c;->b:F

    iget v5, v15, Lb/c/a/e/f/a/c;->b:F

    .line 12
    iget-object v6, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->b:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 13
    iget v8, v9, Lb/c/a/e/f/a/c;->b:F

    iget v9, v11, Lb/c/a/e/f/a/c;->b:F

    iget v10, v13, Lb/c/a/e/f/a/c;->b:F

    iget v11, v15, Lb/c/a/e/f/a/c;->b:F

    .line 14
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->t:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_2

    iget v2, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->u:I

    int-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    sub-float v2, v8, v2

    iget v4, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->v:I

    int-to-float v4, v4

    div-float/2addr v4, v3

    sub-float v4, v9, v4

    const/4 v5, 0x0

    invoke-virtual {v7, v1, v2, v4, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->t:Landroid/graphics/Bitmap;

    iget v2, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->u:I

    int-to-float v2, v2

    div-float/2addr v2, v3

    sub-float v2, v10, v2

    iget v4, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->v:I

    int-to-float v4, v4

    div-float/2addr v4, v3

    sub-float/2addr v9, v4

    invoke-virtual {v7, v1, v2, v9, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->t:Landroid/graphics/Bitmap;

    iget v2, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->u:I

    int-to-float v2, v2

    div-float/2addr v2, v3

    sub-float/2addr v8, v2

    iget v2, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->v:I

    int-to-float v2, v2

    div-float/2addr v2, v3

    sub-float v2, v11, v2

    invoke-virtual {v7, v1, v8, v2, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->t:Landroid/graphics/Bitmap;

    iget v2, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->u:I

    int-to-float v2, v2

    div-float/2addr v2, v3

    sub-float/2addr v10, v2

    iget v2, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->v:I

    int-to-float v2, v2

    div-float/2addr v2, v3

    sub-float/2addr v11, v2

    invoke-virtual {v7, v1, v10, v11, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    goto/16 :goto_2

    :cond_2
    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->r:F

    sub-float v4, v8, v1

    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->q:F

    sub-float v3, v9, v1

    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->s:F

    add-float v5, v9, v1

    iget-object v6, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->d:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move v2, v4

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->r:F

    sub-float v5, v9, v1

    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->s:F

    add-float v4, v8, v1

    iget-object v6, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->d:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move v2, v8

    move v3, v5

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->r:F

    add-float v4, v10, v1

    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->q:F

    sub-float v3, v9, v1

    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->s:F

    add-float v5, v9, v1

    iget-object v6, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->d:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move v2, v4

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->r:F

    sub-float v5, v9, v1

    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->s:F

    sub-float v4, v10, v1

    iget-object v6, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->d:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move v2, v10

    move v3, v5

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->r:F

    sub-float v4, v8, v1

    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->q:F

    add-float v3, v1, v11

    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->s:F

    sub-float v5, v11, v1

    iget-object v6, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->d:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move v2, v4

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->r:F

    add-float v5, v11, v1

    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->s:F

    add-float v4, v8, v1

    iget-object v6, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->d:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move v2, v8

    move v3, v5

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->r:F

    add-float v4, v10, v1

    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->q:F

    add-float v3, v1, v11

    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->s:F

    sub-float v5, v11, v1

    iget-object v6, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->d:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move v2, v4

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->r:F

    add-float v5, v11, v1

    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->s:F

    sub-float v4, v10, v1

    iget-object v6, v0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->d:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move v2, v10

    move v3, v5

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    :goto_2
    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->f:Landroid/graphics/Rect;

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->c(Landroid/graphics/Rect;)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 14

    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_6

    if-eq v0, v3, :cond_4

    const/4 v4, 0x2

    if-eq v0, v4, :cond_1

    const/4 p1, 0x3

    if-eq v0, p1, :cond_4

    return v1

    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    .line 1
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->j:Lb/c/a/e/f/a/e;

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->i:Landroid/util/Pair;

    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    add-float v5, v1, v0

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->i:Landroid/util/Pair;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    add-float v6, v0, p1

    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->k:Z

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->j:Lb/c/a/e/f/a/e;

    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->n:F

    iget-object v8, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->f:Landroid/graphics/Rect;

    iget v9, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->h:F

    .line 2
    iget-object v4, p1, Lb/c/a/e/f/a/e;->b:Lb/c/a/e/f/a/f;

    invoke-virtual/range {v4 .. v9}, Lb/c/a/e/f/a/f;->a(FFFLandroid/graphics/Rect;F)V

    goto :goto_0

    .line 3
    :cond_3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->j:Lb/c/a/e/f/a/e;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->f:Landroid/graphics/Rect;

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->h:F

    .line 4
    iget-object p1, p1, Lb/c/a/e/f/a/e;->b:Lb/c/a/e/f/a/f;

    invoke-virtual {p1, v5, v6, v0, v1}, Lb/c/a/e/f/a/f;->b(FFLandroid/graphics/Rect;F)V

    .line 5
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 6
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    invoke-interface {p1, v3}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    return v3

    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    invoke-interface {p1, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->j:Lb/c/a/e/f/a/e;

    if-nez p1, :cond_5

    goto :goto_2

    :cond_5
    iput-object v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->j:Lb/c/a/e/f/a/e;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :goto_2
    return v3

    .line 8
    :cond_6
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    .line 9
    sget-object v1, Lb/c/a/e/f/a/c;->c:Lb/c/a/e/f/a/c;

    .line 10
    iget v1, v1, Lb/c/a/e/f/a/c;->b:F

    .line 11
    sget-object v4, Lb/c/a/e/f/a/c;->d:Lb/c/a/e/f/a/c;

    .line 12
    iget v10, v4, Lb/c/a/e/f/a/c;->b:F

    .line 13
    sget-object v4, Lb/c/a/e/f/a/c;->e:Lb/c/a/e/f/a/c;

    .line 14
    iget v11, v4, Lb/c/a/e/f/a/c;->b:F

    .line 15
    sget-object v4, Lb/c/a/e/f/a/c;->f:Lb/c/a/e/f/a/c;

    .line 16
    iget v12, v4, Lb/c/a/e/f/a/c;->b:F

    .line 17
    iget v13, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->g:F

    .line 18
    invoke-static {v0, p1, v1, v10, v13}, Lb/c/a/a;->s(FFFFF)Z

    move-result v4

    if-eqz v4, :cond_7

    sget-object v2, Lb/c/a/e/f/a/e;->c:Lb/c/a/e/f/a/e;

    goto/16 :goto_4

    :cond_7
    invoke-static {v0, p1, v11, v10, v13}, Lb/c/a/a;->s(FFFFF)Z

    move-result v4

    if-eqz v4, :cond_8

    sget-object v2, Lb/c/a/e/f/a/e;->d:Lb/c/a/e/f/a/e;

    goto/16 :goto_4

    :cond_8
    invoke-static {v0, p1, v1, v12, v13}, Lb/c/a/a;->s(FFFFF)Z

    move-result v4

    if-eqz v4, :cond_9

    sget-object v2, Lb/c/a/e/f/a/e;->e:Lb/c/a/e/f/a/e;

    goto/16 :goto_4

    :cond_9
    invoke-static {v0, p1, v11, v12, v13}, Lb/c/a/a;->s(FFFFF)Z

    move-result v4

    if-eqz v4, :cond_a

    sget-object v2, Lb/c/a/e/f/a/e;->f:Lb/c/a/e/f/a/e;

    goto/16 :goto_4

    :cond_a
    move v4, v0

    move v5, p1

    move v6, v1

    move v7, v10

    move v8, v11

    move v9, v12

    invoke-static/range {v4 .. v9}, Lb/c/a/a;->r(FFFFFF)Z

    move-result v4

    if-eqz v4, :cond_b

    .line 19
    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->e()Z

    move-result v4

    xor-int/2addr v4, v3

    if-eqz v4, :cond_b

    goto/16 :goto_3

    :cond_b
    move v4, v0

    move v5, p1

    move v6, v1

    move v7, v11

    move v8, v10

    move v9, v13

    .line 20
    invoke-static/range {v4 .. v9}, Lb/c/a/a;->t(FFFFFF)Z

    move-result v4

    if-eqz v4, :cond_c

    sget-object v2, Lb/c/a/e/f/a/e;->h:Lb/c/a/e/f/a/e;

    goto/16 :goto_4

    :cond_c
    move v4, v0

    move v5, p1

    move v6, v1

    move v7, v11

    move v8, v12

    move v9, v13

    invoke-static/range {v4 .. v9}, Lb/c/a/a;->t(FFFFFF)Z

    move-result v4

    if-eqz v4, :cond_d

    sget-object v2, Lb/c/a/e/f/a/e;->j:Lb/c/a/e/f/a/e;

    goto :goto_4

    :cond_d
    move v4, v0

    move v5, p1

    move v6, v1

    move v7, v10

    move v8, v12

    move v9, v13

    invoke-static/range {v4 .. v9}, Lb/c/a/a;->u(FFFFFF)Z

    move-result v4

    if-eqz v4, :cond_e

    sget-object v2, Lb/c/a/e/f/a/e;->g:Lb/c/a/e/f/a/e;

    goto :goto_4

    :cond_e
    move v4, v0

    move v5, p1

    move v6, v11

    move v7, v10

    move v8, v12

    move v9, v13

    invoke-static/range {v4 .. v9}, Lb/c/a/a;->u(FFFFFF)Z

    move-result v4

    if-eqz v4, :cond_f

    sget-object v2, Lb/c/a/e/f/a/e;->i:Lb/c/a/e/f/a/e;

    goto :goto_4

    :cond_f
    move v4, v0

    move v5, p1

    move v6, v1

    move v7, v10

    move v8, v11

    move v9, v12

    invoke-static/range {v4 .. v9}, Lb/c/a/a;->r(FFFFFF)Z

    move-result v4

    if-eqz v4, :cond_10

    .line 21
    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->e()Z

    move-result v4

    xor-int/2addr v4, v3

    if-nez v4, :cond_10

    .line 22
    :goto_3
    sget-object v2, Lb/c/a/e/f/a/e;->k:Lb/c/a/e/f/a/e;

    .line 23
    :cond_10
    :goto_4
    iput-object v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->j:Lb/c/a/e/f/a/e;

    if-nez v2, :cond_11

    goto :goto_9

    .line 24
    :cond_11
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    const/4 v4, 0x0

    packed-switch v2, :pswitch_data_0

    move p1, v4

    goto :goto_8

    :pswitch_0
    add-float/2addr v11, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v11, v1

    add-float/2addr v10, v12

    div-float/2addr v10, v1

    goto :goto_6

    :pswitch_1
    sub-float/2addr v12, p1

    move p1, v12

    goto :goto_8

    :pswitch_2
    sub-float/2addr v11, v0

    move p1, v4

    move v4, v11

    goto :goto_8

    :pswitch_3
    sub-float/2addr v10, p1

    move p1, v10

    goto :goto_8

    :pswitch_4
    sub-float/2addr v1, v0

    move p1, v4

    move v4, v1

    goto :goto_8

    :pswitch_5
    sub-float/2addr v11, v0

    move v4, v11

    goto :goto_5

    :pswitch_6
    sub-float/2addr v1, v0

    move v4, v1

    :goto_5
    sub-float p1, v12, p1

    goto :goto_8

    :goto_6
    :pswitch_7
    sub-float/2addr v11, v0

    move v4, v11

    goto :goto_7

    :pswitch_8
    sub-float/2addr v1, v0

    move v4, v1

    :goto_7
    sub-float p1, v10, p1

    :goto_8
    new-instance v0, Landroid/util/Pair;

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 25
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->i:Landroid/util/Pair;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :goto_9
    return v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public setAspectRatioX(I)V
    .locals 1

    if-lez p1, :cond_0

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->l:I

    int-to-float p1, p1

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->m:I

    int-to-float v0, v0

    div-float/2addr p1, v0

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->n:F

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->d()V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot set aspect ratio value to a number less than or equal to 0."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setAspectRatioY(I)V
    .locals 1

    if-lez p1, :cond_0

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->m:I

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->l:I

    int-to-float v0, v0

    int-to-float p1, p1

    div-float/2addr v0, p1

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->n:F

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->d()V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot set aspect ratio value to a number less than or equal to 0."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setBitmapRect(Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->f:Landroid/graphics/Rect;

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->c(Landroid/graphics/Rect;)V

    return-void
.end method

.method public setBorderAndGuidelineColor(I)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->b:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->c:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->d()V

    return-void
.end method

.method public setBorderColor(I)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->b:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->d()V

    return-void
.end method

.method public setBorderWidth(F)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->b:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->d()V

    return-void
.end method

.method public setCornerColor(I)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->d:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->d()V

    return-void
.end method

.method public setCornerWidth(F)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->d:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->d()V

    return-void
.end method

.method public setCropOverlayCornerBitmap(Landroid/graphics/Bitmap;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->t:Landroid/graphics/Bitmap;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->u:I

    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->t:Landroid/graphics/Bitmap;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->v:I

    :cond_0
    return-void
.end method

.method public setFixedAspectRatio(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->k:Z

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->d()V

    return-void
.end method

.method public setGuidelineColor(I)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->c:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->d()V

    return-void
.end method

.method public setGuidelineWidth(F)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->c:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->d()V

    return-void
.end method

.method public setGuidelines(I)V
    .locals 1

    if-ltz p1, :cond_0

    const/4 v0, 0x2

    if-gt p1, v0, :cond_0

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->o:I

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/crop/CropOverlayView;->d()V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Guideline value must be set between 0 and 2. See documentation."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
