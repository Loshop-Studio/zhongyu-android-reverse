.class public Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;
.super Landroid/view/View;
.source ""

# interfaces
.implements La/t/a/b$i;


# static fields
.field public static final L:Ljava/lang/String;


# instance fields
.field public A:I

.field public B:I

.field public C:I

.field public D:F

.field public E:F

.field public F:F

.field public G:F

.field public H:F

.field public I:F

.field public J:I

.field public K:Landroid/view/animation/Interpolator;

.field public b:Landroid/graphics/Paint;

.field public c:Landroid/graphics/Paint;

.field public d:Landroid/graphics/Path;

.field public e:Landroid/graphics/Path;

.field public f:I

.field public g:I

.field public h:F

.field public i:F

.field public j:F

.field public k:F

.field public l:F

.field public m:F

.field public n:F

.field public o:F

.field public p:F

.field public q:F

.field public r:F

.field public s:F

.field public t:F

.field public u:F

.field public v:F

.field public w:F

.field public x:F

.field public y:F

.field public z:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->L:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d:Landroid/graphics/Path;

    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->e:Landroid/graphics/Path;

    const/high16 p1, 0x42a00000    # 80.0f

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    const/high16 p1, 0x41f00000    # 30.0f

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    const/high16 p1, 0x41a00000    # 20.0f

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->k:F

    const/4 p1, 0x0

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->w:F

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->x:F

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    const/4 p1, 0x1

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->B:I

    const/4 v1, 0x2

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->C:I

    new-instance v2, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    iput-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->K:Landroid/view/animation/Interpolator;

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    sget-object v3, Lb/c/a/b;->c:[I

    invoke-virtual {v2, p2, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    const/4 v2, -0x1

    invoke-virtual {p2, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->f:I

    const/4 v0, 0x3

    const v2, -0x555556

    invoke-virtual {p2, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->g:I

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->k:F

    const/4 v2, 0x4

    invoke-virtual {p2, v2, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->k:F

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    invoke-virtual {p2, v1, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 3
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2, p1}, Landroid/graphics/Paint;-><init>(I)V

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->f:I

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setDither(Z)V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b:Landroid/graphics/Paint;

    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2, p1}, Landroid/graphics/Paint;-><init>(I)V

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->g:I

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setDither(Z)V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c:Landroid/graphics/Paint;

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0

    return-void
.end method

.method public b(IFI)V
    .locals 5

    sget-object p3, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->L:Ljava/lang/String;

    const/4 v0, 0x0

    cmpl-float v1, p2, v0

    if-nez v1, :cond_0

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    const-string v1, "\u5230\u8fbe"

    invoke-static {p3, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->w:F

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->x:F

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->y:F

    :cond_0
    int-to-float v1, p1

    add-float/2addr v1, p2

    .line 2
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    int-to-float v3, v2

    sub-float v3, v1, v3

    cmpl-float v3, v3, v0

    const/4 v4, 0x1

    if-lez v3, :cond_2

    const/4 v0, 0x2

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->J:I

    add-int/2addr v2, v4

    int-to-float v0, v2

    cmpl-float v0, v1, v0

    if-lez v0, :cond_1

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    const-string p1, "\u5411\u5de6\u5feb\u901f\u6ed1\u52a8"

    :goto_0
    invoke-static {p3, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_1
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->setProgress(F)V

    goto :goto_1

    :cond_2
    int-to-float v3, v2

    sub-float v3, v1, v3

    cmpg-float v0, v3, v0

    if-gez v0, :cond_4

    iput v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->J:I

    sub-int/2addr v2, v4

    int-to-float v0, v2

    cmpg-float v0, v1, v0

    if-gez v0, :cond_3

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    const-string p1, "\u5411\u53f3\u5feb\u901f\u6ed1\u52a8"

    goto :goto_0

    :cond_3
    const/high16 p1, 0x3f800000    # 1.0f

    sub-float/2addr p1, p2

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->setProgress(F)V

    :cond_4
    :goto_1
    return-void
.end method

.method public c(I)V
    .locals 0

    return-void
.end method

.method public final d(I)F
    .locals 3

    if-nez p1, :cond_0

    iget p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    return p1

    :cond_0
    int-to-float p1, p1

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    const/high16 v1, 0x40000000    # 2.0f

    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->k:F

    mul-float/2addr v1, v2

    add-float/2addr v1, v0

    mul-float/2addr v1, p1

    add-float/2addr v1, v2

    iget p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    sub-float/2addr p1, v2

    add-float/2addr p1, v1

    return p1
.end method

.method public e(FFF)F
    .locals 0

    invoke-static {p2, p1, p3, p1}, Lb/a/a/a/a;->a(FFFF)F

    move-result p1

    return p1
.end method

.method public f(FFI)F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->B:I

    sub-float/2addr p2, p1

    if-ne p3, v0, :cond_0

    iget p3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->w:F

    :goto_0
    mul-float/2addr p2, p3

    add-float/2addr p2, p1

    return p2

    :cond_0
    iget p3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->x:F

    goto :goto_0
.end method

.method public g(FF)F
    .locals 1

    sub-float/2addr p2, p1

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->y:F

    mul-float/2addr p2, v0

    add-float/2addr p2, p1

    return p2
.end method

.method public final h()V
    .locals 12

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->e:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->K:Landroid/view/animation/Interpolator;

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->y:F

    invoke-interface {v0, v1}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v0

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d(I)F

    move-result v1

    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {p0, v2}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d(I)F

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    sub-float/2addr v2, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->C:I

    invoke-virtual {p0, v1, v2, v3}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->f(FFI)F

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->o:F

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->p:F

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->e(FFF)F

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j:F

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->B:I

    const/high16 v3, 0x42340000    # 45.0f

    invoke-virtual {p0, v3, v2, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->f(FFI)F

    move-result v1

    float-to-double v4, v1

    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v6

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j:F

    float-to-double v8, v1

    mul-double/2addr v6, v8

    double-to-float v1, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j:F

    float-to-double v6, v6

    mul-double/2addr v4, v6

    double-to-float v4, v4

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    invoke-virtual {p0, v5}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d(I)F

    move-result v5

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    add-float/2addr v5, v6

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    add-int/lit8 v6, v6, 0x1

    invoke-virtual {p0, v6}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d(I)F

    move-result v6

    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->B:I

    invoke-virtual {p0, v5, v6, v7}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->f(FFI)F

    move-result v5

    iput v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->q:F

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    iput v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->r:F

    invoke-virtual {p0, v2, v5, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->e(FFF)F

    move-result v5

    iput v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->m:F

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->C:I

    invoke-virtual {p0, v2, v3, v5}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->f(FFI)F

    move-result v5

    float-to-double v5, v5

    invoke-static {v5, v6}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Math;->sin(D)D

    move-result-wide v7

    iget v9, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->m:F

    float-to-double v9, v9

    mul-double/2addr v7, v9

    double-to-float v7, v7

    invoke-static {v5, v6}, Ljava/lang/Math;->cos(D)D

    move-result-wide v5

    iget v8, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->m:F

    float-to-double v8, v8

    mul-double/2addr v5, v8

    double-to-float v5, v5

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->o:F

    add-float/2addr v6, v1

    iput v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->F:F

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->p:F

    sub-float/2addr v1, v4

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->G:F

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->q:F

    sub-float/2addr v1, v7

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->H:F

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    sub-float/2addr v1, v5

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->I:F

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d(I)F

    move-result v1

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    add-float/2addr v1, v6

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    add-int/lit8 v6, v6, 0x1

    invoke-virtual {p0, v6}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d(I)F

    move-result v6

    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    sub-float/2addr v6, v7

    invoke-virtual {p0, v1, v6}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->g(FF)F

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->D:F

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->E:F

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d:Landroid/graphics/Path;

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->F:F

    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->G:F

    invoke-virtual {v1, v6, v7}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d:Landroid/graphics/Path;

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->D:F

    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->E:F

    iget v8, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->H:F

    iget v9, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->I:F

    invoke-virtual {v1, v6, v7, v8, v9}, Landroid/graphics/Path;->quadTo(FFFF)V

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d:Landroid/graphics/Path;

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->H:F

    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    add-float/2addr v7, v5

    invoke-virtual {v1, v6, v7}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d:Landroid/graphics/Path;

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->D:F

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->F:F

    iget v8, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->G:F

    const/high16 v9, 0x40000000    # 2.0f

    mul-float/2addr v4, v9

    add-float/2addr v4, v8

    invoke-virtual {v1, v5, v6, v7, v4}, Landroid/graphics/Path;->quadTo(FFFF)V

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d:Landroid/graphics/Path;

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->F:F

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->G:F

    invoke-virtual {v1, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d(I)F

    move-result v1

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    invoke-virtual {p0, v4}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d(I)F

    move-result v4

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->k:F

    add-float/2addr v4, v5

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->C:I

    invoke-virtual {p0, v1, v4, v5}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->f(FFI)F

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->u:F

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->v:F

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->k:F

    invoke-virtual {p0, v1, v2, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->e(FFF)F

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->l:F

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->B:I

    invoke-virtual {p0, v3, v2, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->f(FFI)F

    move-result v1

    float-to-double v4, v1

    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v6

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->l:F

    float-to-double v10, v1

    mul-double/2addr v6, v10

    double-to-float v1, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->l:F

    float-to-double v6, v6

    mul-double/2addr v4, v6

    double-to-float v4, v4

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    add-int/lit8 v5, v5, 0x1

    invoke-virtual {p0, v5}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d(I)F

    move-result v5

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->k:F

    sub-float/2addr v5, v6

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    invoke-virtual {p0, v6}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d(I)F

    move-result v6

    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->B:I

    invoke-virtual {p0, v5, v6, v7}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->f(FFI)F

    move-result v5

    iput v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->s:F

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    iput v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->t:F

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->k:F

    invoke-virtual {p0, v2, v5, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->e(FFF)F

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->n:F

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->C:I

    invoke-virtual {p0, v2, v3, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->f(FFI)F

    move-result v0

    float-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v5

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->n:F

    float-to-double v7, v0

    mul-double/2addr v5, v7

    double-to-float v0, v5

    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->n:F

    float-to-double v5, v5

    mul-double/2addr v2, v5

    double-to-float v2, v2

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->u:F

    sub-float/2addr v3, v1

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->v:F

    sub-float/2addr v1, v4

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->s:F

    add-float/2addr v5, v0

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->t:F

    sub-float/2addr v0, v2

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    add-int/lit8 v6, v6, 0x1

    invoke-virtual {p0, v6}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d(I)F

    move-result v6

    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->k:F

    sub-float/2addr v6, v7

    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    invoke-virtual {p0, v7}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d(I)F

    move-result v7

    iget v8, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->k:F

    add-float/2addr v7, v8

    invoke-virtual {p0, v6, v7}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->g(FF)F

    move-result v6

    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    iget-object v8, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->e:Landroid/graphics/Path;

    invoke-virtual {v8, v3, v1}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v8, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->e:Landroid/graphics/Path;

    invoke-virtual {v8, v6, v7, v5, v0}, Landroid/graphics/Path;->quadTo(FFFF)V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->e:Landroid/graphics/Path;

    iget v8, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    add-float/2addr v8, v2

    invoke-virtual {v0, v5, v8}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->e:Landroid/graphics/Path;

    mul-float/2addr v4, v9

    add-float/2addr v4, v1

    invoke-virtual {v0, v6, v7, v3, v4}, Landroid/graphics/Path;->quadTo(FFFF)V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->e:Landroid/graphics/Path;

    invoke-virtual {v0, v3, v1}, Landroid/graphics/Path;->lineTo(FF)V

    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->A:I

    if-ge v0, v1, :cond_3

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->J:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    if-eq v0, v1, :cond_2

    add-int/lit8 v1, v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d(I)F

    move-result v1

    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->k:F

    iget-object v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    goto :goto_1

    :cond_1
    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    if-eq v0, v1, :cond_2

    add-int/lit8 v1, v1, -0x1

    if-ne v0, v1, :cond_0

    :cond_2
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->s:F

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->t:F

    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->n:F

    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->u:F

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->v:F

    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->l:F

    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->e:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->q:F

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->r:F

    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->m:F

    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->o:F

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->p:F

    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j:F

    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method public onMeasure(II)V
    .locals 7

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->k:F

    const/high16 v3, 0x40000000    # 2.0f

    mul-float v4, v2, v3

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->A:I

    int-to-float v6, v5

    mul-float/2addr v4, v6

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    invoke-static {v6, v2, v3, v4}, Lb/a/a/a/a;->a(FFFF)F

    move-result v2

    add-int/lit8 v5, v5, -0x1

    int-to-float v4, v5

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    mul-float/2addr v4, v5

    add-float/2addr v4, v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v4, v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v4, v2

    float-to-int v2, v4

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    mul-float/2addr v4, v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    int-to-float v3, v3

    add-float/2addr v4, v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    int-to-float v3, v3

    add-float/2addr v4, v3

    float-to-int v3, v4

    const/high16 v4, -0x80000000

    const/high16 v5, 0x40000000    # 2.0f

    if-ne v0, v5, :cond_0

    goto :goto_0

    :cond_0
    if-ne v0, v4, :cond_1

    invoke-static {p1, v2}, Ljava/lang/Math;->min(II)I

    move-result p1

    :cond_1
    :goto_0
    if-ne v1, v5, :cond_2

    goto :goto_1

    :cond_2
    if-ne v1, v4, :cond_3

    invoke-static {p2, v3}, Ljava/lang/Math;->min(II)I

    move-result p2

    :cond_3
    :goto_1
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public setDirection(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->J:I

    return-void
.end method

.method public setProgress(F)V
    .locals 11

    const/4 v0, 0x0

    cmpl-float v1, p1, v0

    if-nez v1, :cond_0

    return-void

    :cond_0
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->y:F

    float-to-double v1, p1

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    cmpg-double v1, v1, v3

    const/high16 v2, 0x3f000000    # 0.5f

    if-gtz v1, :cond_1

    div-float/2addr p1, v2

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->w:F

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->x:F

    goto :goto_0

    :cond_1
    sub-float/2addr p1, v2

    div-float/2addr p1, v2

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->x:F

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->w:F

    :goto_0
    iget p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->J:I

    const/4 v1, 0x2

    if-ne p1, v1, :cond_2

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h()V

    goto/16 :goto_1

    .line 1
    :cond_2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d:Landroid/graphics/Path;

    invoke-virtual {p1}, Landroid/graphics/Path;->reset()V

    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->e:Landroid/graphics/Path;

    invoke-virtual {p1}, Landroid/graphics/Path;->reset()V

    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->K:Landroid/view/animation/Interpolator;

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->y:F

    invoke-interface {p1, v1}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result p1

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d(I)F

    move-result v1

    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {p0, v2}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d(I)F

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    add-float/2addr v2, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->C:I

    invoke-virtual {p0, v1, v2, v3}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->f(FFI)F

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->o:F

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->p:F

    invoke-virtual {p0, v1, v0, p1}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->e(FFF)F

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j:F

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->B:I

    const/high16 v2, 0x42340000    # 45.0f

    invoke-virtual {p0, v2, v0, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->f(FFI)F

    move-result v1

    float-to-double v3, v1

    invoke-static {v3, v4}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    move-result-wide v5

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j:F

    float-to-double v7, v1

    mul-double/2addr v5, v7

    double-to-float v1, v5

    invoke-static {v3, v4}, Ljava/lang/Math;->cos(D)D

    move-result-wide v3

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j:F

    float-to-double v5, v5

    mul-double/2addr v3, v5

    double-to-float v3, v3

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    invoke-virtual {p0, v4}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d(I)F

    move-result v4

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    sub-float/2addr v4, v5

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    add-int/lit8 v5, v5, -0x1

    invoke-virtual {p0, v5}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d(I)F

    move-result v5

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->B:I

    invoke-virtual {p0, v4, v5, v6}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->f(FFI)F

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->q:F

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    iput v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->r:F

    invoke-virtual {p0, v0, v4, p1}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->e(FFF)F

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->m:F

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->C:I

    invoke-virtual {p0, v0, v2, v4}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->f(FFI)F

    move-result v4

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v6

    iget v8, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->m:F

    float-to-double v8, v8

    mul-double/2addr v6, v8

    double-to-float v6, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->m:F

    float-to-double v7, v7

    mul-double/2addr v4, v7

    double-to-float v4, v4

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->o:F

    sub-float/2addr v5, v1

    iput v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->F:F

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->p:F

    sub-float/2addr v1, v3

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->G:F

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->q:F

    add-float/2addr v1, v6

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->H:F

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    sub-float/2addr v1, v4

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->I:F

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d(I)F

    move-result v1

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    sub-float/2addr v1, v5

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    add-int/lit8 v5, v5, -0x1

    invoke-virtual {p0, v5}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d(I)F

    move-result v5

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    add-float/2addr v5, v6

    invoke-virtual {p0, v1, v5}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->g(FF)F

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->D:F

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->E:F

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d:Landroid/graphics/Path;

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->F:F

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->G:F

    invoke-virtual {v1, v5, v6}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d:Landroid/graphics/Path;

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->D:F

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->E:F

    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->H:F

    iget v8, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->I:F

    invoke-virtual {v1, v5, v6, v7, v8}, Landroid/graphics/Path;->quadTo(FFFF)V

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d:Landroid/graphics/Path;

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->H:F

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    add-float/2addr v6, v4

    invoke-virtual {v1, v5, v6}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d:Landroid/graphics/Path;

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->D:F

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->F:F

    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->G:F

    const/high16 v8, 0x40000000    # 2.0f

    mul-float/2addr v3, v8

    add-float/2addr v3, v7

    invoke-virtual {v1, v4, v5, v6, v3}, Landroid/graphics/Path;->quadTo(FFFF)V

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d:Landroid/graphics/Path;

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->F:F

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->G:F

    invoke-virtual {v1, v3, v4}, Landroid/graphics/Path;->lineTo(FF)V

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d(I)F

    move-result v1

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    invoke-virtual {p0, v3}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d(I)F

    move-result v3

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->k:F

    sub-float/2addr v3, v4

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->C:I

    invoke-virtual {p0, v1, v3, v4}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->f(FFI)F

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->u:F

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->v:F

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->k:F

    invoke-virtual {p0, v1, v0, p1}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->e(FFF)F

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->l:F

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->B:I

    invoke-virtual {p0, v2, v0, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->f(FFI)F

    move-result v1

    float-to-double v3, v1

    invoke-static {v3, v4}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    move-result-wide v5

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->l:F

    float-to-double v9, v1

    mul-double/2addr v5, v9

    double-to-float v1, v5

    invoke-static {v3, v4}, Ljava/lang/Math;->cos(D)D

    move-result-wide v3

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->l:F

    float-to-double v5, v5

    mul-double/2addr v3, v5

    double-to-float v3, v3

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    add-int/lit8 v4, v4, -0x1

    invoke-virtual {p0, v4}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d(I)F

    move-result v4

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->k:F

    add-float/2addr v4, v5

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    invoke-virtual {p0, v5}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d(I)F

    move-result v5

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->B:I

    invoke-virtual {p0, v4, v5, v6}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->f(FFI)F

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->s:F

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    iput v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->t:F

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->k:F

    invoke-virtual {p0, v0, v4, p1}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->e(FFF)F

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->n:F

    iget p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->C:I

    invoke-virtual {p0, v0, v2, p1}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->f(FFI)F

    move-result p1

    float-to-double v4, p1

    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v6

    iget p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->n:F

    float-to-double v9, p1

    mul-double/2addr v6, v9

    double-to-float p1, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->n:F

    float-to-double v6, v0

    mul-double/2addr v4, v6

    double-to-float v0, v4

    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->u:F

    add-float/2addr v2, v1

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->v:F

    sub-float/2addr v1, v3

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->s:F

    sub-float/2addr v4, p1

    iget p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->t:F

    sub-float/2addr p1, v0

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    add-int/lit8 v5, v5, -0x1

    invoke-virtual {p0, v5}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d(I)F

    move-result v5

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->k:F

    add-float/2addr v5, v6

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    invoke-virtual {p0, v6}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d(I)F

    move-result v6

    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->k:F

    sub-float/2addr v6, v7

    invoke-virtual {p0, v5, v6}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->g(FF)F

    move-result v5

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    iget-object v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->e:Landroid/graphics/Path;

    invoke-virtual {v7, v2, v1}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->e:Landroid/graphics/Path;

    invoke-virtual {v7, v5, v6, v4, p1}, Landroid/graphics/Path;->quadTo(FFFF)V

    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->e:Landroid/graphics/Path;

    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    add-float/2addr v7, v0

    invoke-virtual {p1, v4, v7}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->e:Landroid/graphics/Path;

    mul-float/2addr v3, v8

    add-float/2addr v3, v1

    invoke-virtual {p1, v5, v6, v2, v3}, Landroid/graphics/Path;->quadTo(FFFF)V

    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->e:Landroid/graphics/Path;

    invoke-virtual {p1, v2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 2
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method
