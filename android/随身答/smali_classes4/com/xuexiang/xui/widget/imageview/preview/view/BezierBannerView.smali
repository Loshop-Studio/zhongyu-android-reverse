.class public Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;
.super Landroid/view/View;
.source "SourceFile"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;


# static fields
.field public static L:I = 0x1

.field public static M:I = 0x2


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

.field public a:Landroid/graphics/Paint;

.field public b:Landroid/graphics/Paint;

.field public c:Landroid/graphics/Path;

.field public d:Landroid/graphics/Path;

.field public e:I

.field public f:I

.field public g:F

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

.field public v:Z

.field public w:F

.field public x:F

.field public y:F

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c:Landroid/graphics/Path;

    .line 4
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d:Landroid/graphics/Path;

    const/high16 p1, 0x42a00000    # 80.0f

    .line 5
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->g:F

    const/high16 p1, 0x41f00000    # 30.0f

    .line 6
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    const/high16 p1, 0x41a00000    # 20.0f

    .line 7
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j:F

    const/4 p1, 0x0

    .line 8
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->v:Z

    const/4 p3, 0x0

    .line 9
    iput p3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->w:F

    .line 10
    iput p3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->x:F

    .line 11
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    const/4 p1, 0x1

    .line 12
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->B:I

    const/4 p1, 0x2

    .line 13
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->C:I

    .line 14
    new-instance p1, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {p1}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->K:Landroid/view/animation/Interpolator;

    .line 15
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->f(Landroid/util/AttributeSet;)V

    .line 16
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->g()V

    return-void
.end method


# virtual methods
.method public a(Landroidx/viewpager/widget/ViewPager;)V
    .locals 1

    .line 1
    invoke-virtual {p1, p0}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Landroidx/viewpager/widget/PagerAdapter;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Landroidx/viewpager/widget/PagerAdapter;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroidx/viewpager/widget/PagerAdapter;->getCount()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->A:I

    .line 19
    .line 20
    :cond_0
    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h()V

    .line 27
    .line 28
    .line 29
    sget p1, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->M:I

    .line 30
    .line 31
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->J:I

    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final b(I)F
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 4
    .line 5
    return p1

    .line 6
    :cond_0
    int-to-float p1, p1

    .line 7
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->g:F

    .line 8
    .line 9
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j:F

    .line 10
    .line 11
    const/high16 v2, 0x40000000    # 2.0f

    .line 12
    .line 13
    mul-float/2addr v2, v1

    .line 14
    add-float/2addr v0, v2

    .line 15
    mul-float/2addr p1, v0

    .line 16
    add-float/2addr p1, v1

    .line 17
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 18
    .line 19
    sub-float/2addr v0, v1

    .line 20
    add-float/2addr p1, v0

    .line 21
    return p1
.end method

.method public c(FFF)F
    .locals 0

    .line 1
    sub-float/2addr p2, p1

    mul-float/2addr p2, p3

    add-float/2addr p1, p2

    return p1
.end method

.method public d(FFI)F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->B:I

    .line 2
    .line 3
    if-ne p3, v0, :cond_0

    .line 4
    .line 5
    sub-float/2addr p2, p1

    .line 6
    iget p3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->w:F

    .line 7
    .line 8
    :goto_0
    mul-float/2addr p2, p3

    .line 9
    add-float/2addr p1, p2

    .line 10
    return p1

    .line 11
    :cond_0
    sub-float/2addr p2, p1

    .line 12
    iget p3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->x:F

    .line 13
    .line 14
    goto :goto_0
.end method

.method public e(FF)F
    .locals 1

    .line 1
    sub-float/2addr p2, p1

    .line 2
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->y:F

    .line 3
    .line 4
    mul-float/2addr p2, v0

    .line 5
    add-float/2addr p1, p2

    .line 6
    return p1
.end method

.method public final f(Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/xuexiang/xui/R$styleable;->BezierBannerView:[I

    .line 6
    .line 7
    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    sget v0, Lcom/xuexiang/xui/R$styleable;->BezierBannerView_bbv_selectedColor:I

    .line 12
    .line 13
    const/4 v1, -0x1

    .line 14
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->e:I

    .line 19
    .line 20
    sget v0, Lcom/xuexiang/xui/R$styleable;->BezierBannerView_bbv_unSelectedColor:I

    .line 21
    .line 22
    const v1, -0x555556

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->f:I

    .line 30
    .line 31
    sget v0, Lcom/xuexiang/xui/R$styleable;->BezierBannerView_bbv_selectedRadius:I

    .line 32
    .line 33
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 34
    .line 35
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 40
    .line 41
    sget v0, Lcom/xuexiang/xui/R$styleable;->BezierBannerView_bbv_unSelectedRadius:I

    .line 42
    .line 43
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j:F

    .line 44
    .line 45
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j:F

    .line 50
    .line 51
    sget v0, Lcom/xuexiang/xui/R$styleable;->BezierBannerView_bbv_spacing:I

    .line 52
    .line 53
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->g:F

    .line 54
    .line 55
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->g:F

    .line 60
    .line 61
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public final g()V
    .locals 4

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->e:I

    .line 8
    .line 9
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 10
    .line 11
    .line 12
    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->a:Landroid/graphics/Paint;

    .line 24
    .line 25
    new-instance v0, Landroid/graphics/Paint;

    .line 26
    .line 27
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 28
    .line 29
    .line 30
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->f:I

    .line 31
    .line 32
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b:Landroid/graphics/Paint;

    .line 45
    .line 46
    return-void
.end method

.method public final h()V
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c:Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d:Landroid/graphics/Path;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->K:Landroid/view/animation/Interpolator;

    .line 12
    .line 13
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->y:F

    .line 14
    .line 15
    invoke-interface {v0, v1}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b(I)F

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    .line 26
    .line 27
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    invoke-virtual {p0, v2}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b(I)F

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 34
    .line 35
    sub-float/2addr v2, v3

    .line 36
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->C:I

    .line 37
    .line 38
    invoke-virtual {p0, v1, v2, v3}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d(FFI)F

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->n:F

    .line 43
    .line 44
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 45
    .line 46
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->o:F

    .line 47
    .line 48
    const/4 v2, 0x0

    .line 49
    invoke-virtual {p0, v1, v2, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c(FFF)F

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    .line 54
    .line 55
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->B:I

    .line 56
    .line 57
    const/high16 v3, 0x42340000    # 45.0f

    .line 58
    .line 59
    invoke-virtual {p0, v3, v2, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d(FFI)F

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    float-to-double v4, v1

    .line 64
    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    .line 65
    .line 66
    .line 67
    move-result-wide v4

    .line 68
    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    .line 69
    .line 70
    .line 71
    move-result-wide v6

    .line 72
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    .line 73
    .line 74
    float-to-double v8, v1

    .line 75
    mul-double/2addr v6, v8

    .line 76
    double-to-float v1, v6

    .line 77
    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    .line 78
    .line 79
    .line 80
    move-result-wide v4

    .line 81
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    .line 82
    .line 83
    float-to-double v6, v6

    .line 84
    mul-double/2addr v4, v6

    .line 85
    double-to-float v4, v4

    .line 86
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    .line 87
    .line 88
    invoke-virtual {p0, v5}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b(I)F

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 93
    .line 94
    add-float/2addr v5, v6

    .line 95
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    .line 96
    .line 97
    add-int/lit8 v6, v6, 0x1

    .line 98
    .line 99
    invoke-virtual {p0, v6}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b(I)F

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->B:I

    .line 104
    .line 105
    invoke-virtual {p0, v5, v6, v7}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d(FFI)F

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    iput v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->p:F

    .line 110
    .line 111
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 112
    .line 113
    iput v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->q:F

    .line 114
    .line 115
    invoke-virtual {p0, v2, v5, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c(FFF)F

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    iput v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->l:F

    .line 120
    .line 121
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->C:I

    .line 122
    .line 123
    invoke-virtual {p0, v2, v3, v5}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d(FFI)F

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    float-to-double v5, v5

    .line 128
    invoke-static {v5, v6}, Ljava/lang/Math;->toRadians(D)D

    .line 129
    .line 130
    .line 131
    move-result-wide v5

    .line 132
    invoke-static {v5, v6}, Ljava/lang/Math;->sin(D)D

    .line 133
    .line 134
    .line 135
    move-result-wide v7

    .line 136
    iget v9, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->l:F

    .line 137
    .line 138
    float-to-double v9, v9

    .line 139
    mul-double/2addr v7, v9

    .line 140
    double-to-float v7, v7

    .line 141
    invoke-static {v5, v6}, Ljava/lang/Math;->cos(D)D

    .line 142
    .line 143
    .line 144
    move-result-wide v5

    .line 145
    iget v8, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->l:F

    .line 146
    .line 147
    float-to-double v8, v8

    .line 148
    mul-double/2addr v5, v8

    .line 149
    double-to-float v5, v5

    .line 150
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->n:F

    .line 151
    .line 152
    add-float/2addr v6, v1

    .line 153
    iput v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->F:F

    .line 154
    .line 155
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->o:F

    .line 156
    .line 157
    sub-float/2addr v1, v4

    .line 158
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->G:F

    .line 159
    .line 160
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->p:F

    .line 161
    .line 162
    sub-float/2addr v1, v7

    .line 163
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->H:F

    .line 164
    .line 165
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 166
    .line 167
    sub-float/2addr v1, v5

    .line 168
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->I:F

    .line 169
    .line 170
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    .line 171
    .line 172
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b(I)F

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 177
    .line 178
    add-float/2addr v1, v6

    .line 179
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    .line 180
    .line 181
    add-int/lit8 v6, v6, 0x1

    .line 182
    .line 183
    invoke-virtual {p0, v6}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b(I)F

    .line 184
    .line 185
    .line 186
    move-result v6

    .line 187
    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 188
    .line 189
    sub-float/2addr v6, v7

    .line 190
    invoke-virtual {p0, v1, v6}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->e(FF)F

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->D:F

    .line 195
    .line 196
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 197
    .line 198
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->E:F

    .line 199
    .line 200
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c:Landroid/graphics/Path;

    .line 201
    .line 202
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->F:F

    .line 203
    .line 204
    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->G:F

    .line 205
    .line 206
    invoke-virtual {v1, v6, v7}, Landroid/graphics/Path;->moveTo(FF)V

    .line 207
    .line 208
    .line 209
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c:Landroid/graphics/Path;

    .line 210
    .line 211
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->D:F

    .line 212
    .line 213
    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->E:F

    .line 214
    .line 215
    iget v8, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->H:F

    .line 216
    .line 217
    iget v9, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->I:F

    .line 218
    .line 219
    invoke-virtual {v1, v6, v7, v8, v9}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 220
    .line 221
    .line 222
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c:Landroid/graphics/Path;

    .line 223
    .line 224
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->H:F

    .line 225
    .line 226
    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 227
    .line 228
    add-float/2addr v7, v5

    .line 229
    invoke-virtual {v1, v6, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 230
    .line 231
    .line 232
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c:Landroid/graphics/Path;

    .line 233
    .line 234
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->D:F

    .line 235
    .line 236
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 237
    .line 238
    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->F:F

    .line 239
    .line 240
    iget v8, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->G:F

    .line 241
    .line 242
    const/high16 v9, 0x40000000    # 2.0f

    .line 243
    .line 244
    mul-float/2addr v4, v9

    .line 245
    add-float/2addr v8, v4

    .line 246
    invoke-virtual {v1, v5, v6, v7, v8}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 247
    .line 248
    .line 249
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c:Landroid/graphics/Path;

    .line 250
    .line 251
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->F:F

    .line 252
    .line 253
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->G:F

    .line 254
    .line 255
    invoke-virtual {v1, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 256
    .line 257
    .line 258
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    .line 259
    .line 260
    add-int/lit8 v1, v1, 0x1

    .line 261
    .line 262
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b(I)F

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    .line 267
    .line 268
    invoke-virtual {p0, v4}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b(I)F

    .line 269
    .line 270
    .line 271
    move-result v4

    .line 272
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j:F

    .line 273
    .line 274
    add-float/2addr v4, v5

    .line 275
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->C:I

    .line 276
    .line 277
    invoke-virtual {p0, v1, v4, v5}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d(FFI)F

    .line 278
    .line 279
    .line 280
    move-result v1

    .line 281
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->t:F

    .line 282
    .line 283
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 284
    .line 285
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->u:F

    .line 286
    .line 287
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j:F

    .line 288
    .line 289
    invoke-virtual {p0, v1, v2, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c(FFF)F

    .line 290
    .line 291
    .line 292
    move-result v1

    .line 293
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->k:F

    .line 294
    .line 295
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->B:I

    .line 296
    .line 297
    invoke-virtual {p0, v3, v2, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d(FFI)F

    .line 298
    .line 299
    .line 300
    move-result v1

    .line 301
    float-to-double v4, v1

    .line 302
    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    .line 303
    .line 304
    .line 305
    move-result-wide v4

    .line 306
    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    .line 307
    .line 308
    .line 309
    move-result-wide v6

    .line 310
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->k:F

    .line 311
    .line 312
    float-to-double v10, v1

    .line 313
    mul-double/2addr v6, v10

    .line 314
    double-to-float v1, v6

    .line 315
    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    .line 316
    .line 317
    .line 318
    move-result-wide v4

    .line 319
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->k:F

    .line 320
    .line 321
    float-to-double v6, v6

    .line 322
    mul-double/2addr v4, v6

    .line 323
    double-to-float v4, v4

    .line 324
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    .line 325
    .line 326
    add-int/lit8 v5, v5, 0x1

    .line 327
    .line 328
    invoke-virtual {p0, v5}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b(I)F

    .line 329
    .line 330
    .line 331
    move-result v5

    .line 332
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j:F

    .line 333
    .line 334
    sub-float/2addr v5, v6

    .line 335
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    .line 336
    .line 337
    invoke-virtual {p0, v6}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b(I)F

    .line 338
    .line 339
    .line 340
    move-result v6

    .line 341
    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->B:I

    .line 342
    .line 343
    invoke-virtual {p0, v5, v6, v7}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d(FFI)F

    .line 344
    .line 345
    .line 346
    move-result v5

    .line 347
    iput v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->r:F

    .line 348
    .line 349
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 350
    .line 351
    iput v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->s:F

    .line 352
    .line 353
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j:F

    .line 354
    .line 355
    invoke-virtual {p0, v2, v5, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c(FFF)F

    .line 356
    .line 357
    .line 358
    move-result v0

    .line 359
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->m:F

    .line 360
    .line 361
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->C:I

    .line 362
    .line 363
    invoke-virtual {p0, v2, v3, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d(FFI)F

    .line 364
    .line 365
    .line 366
    move-result v0

    .line 367
    float-to-double v2, v0

    .line 368
    invoke-static {v2, v3}, Ljava/lang/Math;->toRadians(D)D

    .line 369
    .line 370
    .line 371
    move-result-wide v2

    .line 372
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    .line 373
    .line 374
    .line 375
    move-result-wide v5

    .line 376
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->m:F

    .line 377
    .line 378
    float-to-double v7, v0

    .line 379
    mul-double/2addr v5, v7

    .line 380
    double-to-float v0, v5

    .line 381
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    .line 382
    .line 383
    .line 384
    move-result-wide v2

    .line 385
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->m:F

    .line 386
    .line 387
    float-to-double v5, v5

    .line 388
    mul-double/2addr v2, v5

    .line 389
    double-to-float v2, v2

    .line 390
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->t:F

    .line 391
    .line 392
    sub-float/2addr v3, v1

    .line 393
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->u:F

    .line 394
    .line 395
    sub-float/2addr v1, v4

    .line 396
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->r:F

    .line 397
    .line 398
    add-float/2addr v5, v0

    .line 399
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->s:F

    .line 400
    .line 401
    sub-float/2addr v0, v2

    .line 402
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    .line 403
    .line 404
    add-int/lit8 v6, v6, 0x1

    .line 405
    .line 406
    invoke-virtual {p0, v6}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b(I)F

    .line 407
    .line 408
    .line 409
    move-result v6

    .line 410
    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j:F

    .line 411
    .line 412
    sub-float/2addr v6, v7

    .line 413
    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    .line 414
    .line 415
    invoke-virtual {p0, v7}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b(I)F

    .line 416
    .line 417
    .line 418
    move-result v7

    .line 419
    iget v8, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j:F

    .line 420
    .line 421
    add-float/2addr v7, v8

    .line 422
    invoke-virtual {p0, v6, v7}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->e(FF)F

    .line 423
    .line 424
    .line 425
    move-result v6

    .line 426
    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 427
    .line 428
    iget-object v8, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d:Landroid/graphics/Path;

    .line 429
    .line 430
    invoke-virtual {v8, v3, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 431
    .line 432
    .line 433
    iget-object v8, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d:Landroid/graphics/Path;

    .line 434
    .line 435
    invoke-virtual {v8, v6, v7, v5, v0}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 436
    .line 437
    .line 438
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d:Landroid/graphics/Path;

    .line 439
    .line 440
    iget v8, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 441
    .line 442
    add-float/2addr v8, v2

    .line 443
    invoke-virtual {v0, v5, v8}, Landroid/graphics/Path;->lineTo(FF)V

    .line 444
    .line 445
    .line 446
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d:Landroid/graphics/Path;

    .line 447
    .line 448
    mul-float/2addr v4, v9

    .line 449
    add-float/2addr v4, v1

    .line 450
    invoke-virtual {v0, v6, v7, v3, v4}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 451
    .line 452
    .line 453
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d:Landroid/graphics/Path;

    .line 454
    .line 455
    invoke-virtual {v0, v3, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 456
    .line 457
    .line 458
    return-void
.end method

.method public final i()V
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c:Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d:Landroid/graphics/Path;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->K:Landroid/view/animation/Interpolator;

    .line 12
    .line 13
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->y:F

    .line 14
    .line 15
    invoke-interface {v0, v1}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b(I)F

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    .line 26
    .line 27
    add-int/lit8 v2, v2, -0x1

    .line 28
    .line 29
    invoke-virtual {p0, v2}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b(I)F

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 34
    .line 35
    add-float/2addr v2, v3

    .line 36
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->C:I

    .line 37
    .line 38
    invoke-virtual {p0, v1, v2, v3}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d(FFI)F

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->n:F

    .line 43
    .line 44
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 45
    .line 46
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->o:F

    .line 47
    .line 48
    const/4 v2, 0x0

    .line 49
    invoke-virtual {p0, v1, v2, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c(FFF)F

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    .line 54
    .line 55
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->B:I

    .line 56
    .line 57
    const/high16 v3, 0x42340000    # 45.0f

    .line 58
    .line 59
    invoke-virtual {p0, v3, v2, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d(FFI)F

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    float-to-double v4, v1

    .line 64
    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    .line 65
    .line 66
    .line 67
    move-result-wide v4

    .line 68
    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    .line 69
    .line 70
    .line 71
    move-result-wide v6

    .line 72
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    .line 73
    .line 74
    float-to-double v8, v1

    .line 75
    mul-double/2addr v6, v8

    .line 76
    double-to-float v1, v6

    .line 77
    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    .line 78
    .line 79
    .line 80
    move-result-wide v4

    .line 81
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    .line 82
    .line 83
    float-to-double v6, v6

    .line 84
    mul-double/2addr v4, v6

    .line 85
    double-to-float v4, v4

    .line 86
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    .line 87
    .line 88
    invoke-virtual {p0, v5}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b(I)F

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 93
    .line 94
    sub-float/2addr v5, v6

    .line 95
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    .line 96
    .line 97
    add-int/lit8 v6, v6, -0x1

    .line 98
    .line 99
    invoke-virtual {p0, v6}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b(I)F

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->B:I

    .line 104
    .line 105
    invoke-virtual {p0, v5, v6, v7}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d(FFI)F

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    iput v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->p:F

    .line 110
    .line 111
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 112
    .line 113
    iput v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->q:F

    .line 114
    .line 115
    invoke-virtual {p0, v2, v5, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c(FFF)F

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    iput v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->l:F

    .line 120
    .line 121
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->C:I

    .line 122
    .line 123
    invoke-virtual {p0, v2, v3, v5}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d(FFI)F

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    float-to-double v5, v5

    .line 128
    invoke-static {v5, v6}, Ljava/lang/Math;->toRadians(D)D

    .line 129
    .line 130
    .line 131
    move-result-wide v5

    .line 132
    invoke-static {v5, v6}, Ljava/lang/Math;->sin(D)D

    .line 133
    .line 134
    .line 135
    move-result-wide v7

    .line 136
    iget v9, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->l:F

    .line 137
    .line 138
    float-to-double v9, v9

    .line 139
    mul-double/2addr v7, v9

    .line 140
    double-to-float v7, v7

    .line 141
    invoke-static {v5, v6}, Ljava/lang/Math;->cos(D)D

    .line 142
    .line 143
    .line 144
    move-result-wide v5

    .line 145
    iget v8, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->l:F

    .line 146
    .line 147
    float-to-double v8, v8

    .line 148
    mul-double/2addr v5, v8

    .line 149
    double-to-float v5, v5

    .line 150
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->n:F

    .line 151
    .line 152
    sub-float/2addr v6, v1

    .line 153
    iput v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->F:F

    .line 154
    .line 155
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->o:F

    .line 156
    .line 157
    sub-float/2addr v1, v4

    .line 158
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->G:F

    .line 159
    .line 160
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->p:F

    .line 161
    .line 162
    add-float/2addr v1, v7

    .line 163
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->H:F

    .line 164
    .line 165
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 166
    .line 167
    sub-float/2addr v1, v5

    .line 168
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->I:F

    .line 169
    .line 170
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    .line 171
    .line 172
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b(I)F

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 177
    .line 178
    sub-float/2addr v1, v6

    .line 179
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    .line 180
    .line 181
    add-int/lit8 v6, v6, -0x1

    .line 182
    .line 183
    invoke-virtual {p0, v6}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b(I)F

    .line 184
    .line 185
    .line 186
    move-result v6

    .line 187
    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 188
    .line 189
    add-float/2addr v6, v7

    .line 190
    invoke-virtual {p0, v1, v6}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->e(FF)F

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->D:F

    .line 195
    .line 196
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 197
    .line 198
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->E:F

    .line 199
    .line 200
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c:Landroid/graphics/Path;

    .line 201
    .line 202
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->F:F

    .line 203
    .line 204
    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->G:F

    .line 205
    .line 206
    invoke-virtual {v1, v6, v7}, Landroid/graphics/Path;->moveTo(FF)V

    .line 207
    .line 208
    .line 209
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c:Landroid/graphics/Path;

    .line 210
    .line 211
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->D:F

    .line 212
    .line 213
    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->E:F

    .line 214
    .line 215
    iget v8, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->H:F

    .line 216
    .line 217
    iget v9, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->I:F

    .line 218
    .line 219
    invoke-virtual {v1, v6, v7, v8, v9}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 220
    .line 221
    .line 222
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c:Landroid/graphics/Path;

    .line 223
    .line 224
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->H:F

    .line 225
    .line 226
    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 227
    .line 228
    add-float/2addr v7, v5

    .line 229
    invoke-virtual {v1, v6, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 230
    .line 231
    .line 232
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c:Landroid/graphics/Path;

    .line 233
    .line 234
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->D:F

    .line 235
    .line 236
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 237
    .line 238
    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->F:F

    .line 239
    .line 240
    iget v8, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->G:F

    .line 241
    .line 242
    const/high16 v9, 0x40000000    # 2.0f

    .line 243
    .line 244
    mul-float/2addr v4, v9

    .line 245
    add-float/2addr v8, v4

    .line 246
    invoke-virtual {v1, v5, v6, v7, v8}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 247
    .line 248
    .line 249
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c:Landroid/graphics/Path;

    .line 250
    .line 251
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->F:F

    .line 252
    .line 253
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->G:F

    .line 254
    .line 255
    invoke-virtual {v1, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 256
    .line 257
    .line 258
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    .line 259
    .line 260
    add-int/lit8 v1, v1, -0x1

    .line 261
    .line 262
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b(I)F

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    .line 267
    .line 268
    invoke-virtual {p0, v4}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b(I)F

    .line 269
    .line 270
    .line 271
    move-result v4

    .line 272
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j:F

    .line 273
    .line 274
    sub-float/2addr v4, v5

    .line 275
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->C:I

    .line 276
    .line 277
    invoke-virtual {p0, v1, v4, v5}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d(FFI)F

    .line 278
    .line 279
    .line 280
    move-result v1

    .line 281
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->t:F

    .line 282
    .line 283
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 284
    .line 285
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->u:F

    .line 286
    .line 287
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j:F

    .line 288
    .line 289
    invoke-virtual {p0, v1, v2, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c(FFF)F

    .line 290
    .line 291
    .line 292
    move-result v1

    .line 293
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->k:F

    .line 294
    .line 295
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->B:I

    .line 296
    .line 297
    invoke-virtual {p0, v3, v2, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d(FFI)F

    .line 298
    .line 299
    .line 300
    move-result v1

    .line 301
    float-to-double v4, v1

    .line 302
    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    .line 303
    .line 304
    .line 305
    move-result-wide v4

    .line 306
    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    .line 307
    .line 308
    .line 309
    move-result-wide v6

    .line 310
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->k:F

    .line 311
    .line 312
    float-to-double v10, v1

    .line 313
    mul-double/2addr v6, v10

    .line 314
    double-to-float v1, v6

    .line 315
    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    .line 316
    .line 317
    .line 318
    move-result-wide v4

    .line 319
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->k:F

    .line 320
    .line 321
    float-to-double v6, v6

    .line 322
    mul-double/2addr v4, v6

    .line 323
    double-to-float v4, v4

    .line 324
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    .line 325
    .line 326
    add-int/lit8 v5, v5, -0x1

    .line 327
    .line 328
    invoke-virtual {p0, v5}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b(I)F

    .line 329
    .line 330
    .line 331
    move-result v5

    .line 332
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j:F

    .line 333
    .line 334
    add-float/2addr v5, v6

    .line 335
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    .line 336
    .line 337
    invoke-virtual {p0, v6}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b(I)F

    .line 338
    .line 339
    .line 340
    move-result v6

    .line 341
    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->B:I

    .line 342
    .line 343
    invoke-virtual {p0, v5, v6, v7}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d(FFI)F

    .line 344
    .line 345
    .line 346
    move-result v5

    .line 347
    iput v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->r:F

    .line 348
    .line 349
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 350
    .line 351
    iput v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->s:F

    .line 352
    .line 353
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j:F

    .line 354
    .line 355
    invoke-virtual {p0, v2, v5, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c(FFF)F

    .line 356
    .line 357
    .line 358
    move-result v0

    .line 359
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->m:F

    .line 360
    .line 361
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->C:I

    .line 362
    .line 363
    invoke-virtual {p0, v2, v3, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d(FFI)F

    .line 364
    .line 365
    .line 366
    move-result v0

    .line 367
    float-to-double v2, v0

    .line 368
    invoke-static {v2, v3}, Ljava/lang/Math;->toRadians(D)D

    .line 369
    .line 370
    .line 371
    move-result-wide v2

    .line 372
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    .line 373
    .line 374
    .line 375
    move-result-wide v5

    .line 376
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->m:F

    .line 377
    .line 378
    float-to-double v7, v0

    .line 379
    mul-double/2addr v5, v7

    .line 380
    double-to-float v0, v5

    .line 381
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    .line 382
    .line 383
    .line 384
    move-result-wide v2

    .line 385
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->m:F

    .line 386
    .line 387
    float-to-double v5, v5

    .line 388
    mul-double/2addr v2, v5

    .line 389
    double-to-float v2, v2

    .line 390
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->t:F

    .line 391
    .line 392
    add-float/2addr v3, v1

    .line 393
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->u:F

    .line 394
    .line 395
    sub-float/2addr v1, v4

    .line 396
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->r:F

    .line 397
    .line 398
    sub-float/2addr v5, v0

    .line 399
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->s:F

    .line 400
    .line 401
    sub-float/2addr v0, v2

    .line 402
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    .line 403
    .line 404
    add-int/lit8 v6, v6, -0x1

    .line 405
    .line 406
    invoke-virtual {p0, v6}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b(I)F

    .line 407
    .line 408
    .line 409
    move-result v6

    .line 410
    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j:F

    .line 411
    .line 412
    add-float/2addr v6, v7

    .line 413
    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    .line 414
    .line 415
    invoke-virtual {p0, v7}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b(I)F

    .line 416
    .line 417
    .line 418
    move-result v7

    .line 419
    iget v8, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j:F

    .line 420
    .line 421
    sub-float/2addr v7, v8

    .line 422
    invoke-virtual {p0, v6, v7}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->e(FF)F

    .line 423
    .line 424
    .line 425
    move-result v6

    .line 426
    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 427
    .line 428
    iget-object v8, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d:Landroid/graphics/Path;

    .line 429
    .line 430
    invoke-virtual {v8, v3, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 431
    .line 432
    .line 433
    iget-object v8, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d:Landroid/graphics/Path;

    .line 434
    .line 435
    invoke-virtual {v8, v6, v7, v5, v0}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 436
    .line 437
    .line 438
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d:Landroid/graphics/Path;

    .line 439
    .line 440
    iget v8, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 441
    .line 442
    add-float/2addr v8, v2

    .line 443
    invoke-virtual {v0, v5, v8}, Landroid/graphics/Path;->lineTo(FF)V

    .line 444
    .line 445
    .line 446
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d:Landroid/graphics/Path;

    .line 447
    .line 448
    mul-float/2addr v4, v9

    .line 449
    add-float/2addr v4, v1

    .line 450
    invoke-virtual {v0, v6, v7, v3, v4}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 451
    .line 452
    .line 453
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d:Landroid/graphics/Path;

    .line 454
    .line 455
    invoke-virtual {v0, v3, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 456
    .line 457
    .line 458
    return-void
.end method

.method public j()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->w:F

    .line 3
    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->x:F

    .line 5
    .line 6
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->y:F

    .line 7
    .line 8
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    int-to-float v0, v0

    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    int-to-float v1, v1

    .line 17
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    :goto_0
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->A:I

    .line 22
    .line 23
    if-ge v0, v1, :cond_4

    .line 24
    .line 25
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->J:I

    .line 26
    .line 27
    sget v2, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->M:I

    .line 28
    .line 29
    if-ne v1, v2, :cond_1

    .line 30
    .line 31
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    .line 32
    .line 33
    if-eq v0, v1, :cond_3

    .line 34
    .line 35
    add-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    if-ne v0, v1, :cond_0

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b(I)F

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 45
    .line 46
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j:F

    .line 47
    .line 48
    iget-object v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b:Landroid/graphics/Paint;

    .line 49
    .line 50
    invoke-virtual {p1, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    sget v2, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->L:I

    .line 55
    .line 56
    if-ne v1, v2, :cond_3

    .line 57
    .line 58
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    .line 59
    .line 60
    if-eq v0, v1, :cond_3

    .line 61
    .line 62
    add-int/lit8 v1, v1, -0x1

    .line 63
    .line 64
    if-ne v0, v1, :cond_2

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b(I)F

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 72
    .line 73
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j:F

    .line 74
    .line 75
    iget-object v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b:Landroid/graphics/Paint;

    .line 76
    .line 77
    invoke-virtual {p1, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 78
    .line 79
    .line 80
    :cond_3
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_4
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->r:F

    .line 84
    .line 85
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->s:F

    .line 86
    .line 87
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->m:F

    .line 88
    .line 89
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b:Landroid/graphics/Paint;

    .line 90
    .line 91
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 92
    .line 93
    .line 94
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->t:F

    .line 95
    .line 96
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->u:F

    .line 97
    .line 98
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->k:F

    .line 99
    .line 100
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b:Landroid/graphics/Paint;

    .line 101
    .line 102
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 103
    .line 104
    .line 105
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d:Landroid/graphics/Path;

    .line 106
    .line 107
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b:Landroid/graphics/Paint;

    .line 108
    .line 109
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 110
    .line 111
    .line 112
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->p:F

    .line 113
    .line 114
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->q:F

    .line 115
    .line 116
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->l:F

    .line 117
    .line 118
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->a:Landroid/graphics/Paint;

    .line 119
    .line 120
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 121
    .line 122
    .line 123
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->n:F

    .line 124
    .line 125
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->o:F

    .line 126
    .line 127
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    .line 128
    .line 129
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->a:Landroid/graphics/Paint;

    .line 130
    .line 131
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 132
    .line 133
    .line 134
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c:Landroid/graphics/Path;

    .line 135
    .line 136
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->a:Landroid/graphics/Paint;

    .line 137
    .line 138
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 142
    .line 143
    .line 144
    return-void
.end method

.method public onMeasure(II)V
    .locals 7

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
    move-result p1

    .line 9
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j:F

    .line 18
    .line 19
    const/high16 v3, 0x40000000    # 2.0f

    .line 20
    .line 21
    mul-float v4, v2, v3

    .line 22
    .line 23
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->A:I

    .line 24
    .line 25
    int-to-float v6, v5

    .line 26
    mul-float/2addr v4, v6

    .line 27
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 28
    .line 29
    sub-float/2addr v6, v2

    .line 30
    mul-float/2addr v6, v3

    .line 31
    add-float/2addr v4, v6

    .line 32
    add-int/lit8 v5, v5, -0x1

    .line 33
    .line 34
    int-to-float v2, v5

    .line 35
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->g:F

    .line 36
    .line 37
    mul-float/2addr v2, v5

    .line 38
    add-float/2addr v4, v2

    .line 39
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    int-to-float v2, v2

    .line 44
    add-float/2addr v4, v2

    .line 45
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    int-to-float v2, v2

    .line 50
    add-float/2addr v4, v2

    .line 51
    float-to-int v2, v4

    .line 52
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 53
    .line 54
    mul-float/2addr v4, v3

    .line 55
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    int-to-float v3, v3

    .line 60
    add-float/2addr v4, v3

    .line 61
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    int-to-float v3, v3

    .line 66
    add-float/2addr v4, v3

    .line 67
    float-to-int v3, v4

    .line 68
    const/high16 v4, -0x80000000

    .line 69
    .line 70
    const/high16 v5, 0x40000000    # 2.0f

    .line 71
    .line 72
    if-ne v0, v5, :cond_0

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    if-ne v0, v4, :cond_1

    .line 76
    .line 77
    invoke-static {p1, v2}, Ljava/lang/Math;->min(II)I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    :cond_1
    :goto_0
    if-ne v1, v5, :cond_2

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_2
    if-ne v1, v4, :cond_3

    .line 85
    .line 86
    invoke-static {p2, v3}, Ljava/lang/Math;->min(II)I

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    :cond_3
    :goto_1
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method public onPageScrollStateChanged(I)V
    .locals 0

    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 3

    .line 1
    const/4 p3, 0x0

    .line 2
    cmpl-float v0, p2, p3

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j()V

    .line 9
    .line 10
    .line 11
    :cond_0
    int-to-float v0, p1

    .line 12
    add-float/2addr v0, p2

    .line 13
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    .line 14
    .line 15
    int-to-float v2, v1

    .line 16
    sub-float v2, v0, v2

    .line 17
    .line 18
    cmpl-float v2, v2, p3

    .line 19
    .line 20
    if-lez v2, :cond_2

    .line 21
    .line 22
    sget p3, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->M:I

    .line 23
    .line 24
    iput p3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->J:I

    .line 25
    .line 26
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    int-to-float p3, v1

    .line 29
    cmpl-float p3, v0, p3

    .line 30
    .line 31
    if-lez p3, :cond_1

    .line 32
    .line 33
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->setProgress(F)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_2
    int-to-float v2, v1

    .line 41
    sub-float v2, v0, v2

    .line 42
    .line 43
    cmpg-float p3, v2, p3

    .line 44
    .line 45
    if-gez p3, :cond_4

    .line 46
    .line 47
    sget p3, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->L:I

    .line 48
    .line 49
    iput p3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->J:I

    .line 50
    .line 51
    add-int/lit8 v1, v1, -0x1

    .line 52
    .line 53
    int-to-float p3, v1

    .line 54
    cmpg-float p3, v0, p3

    .line 55
    .line 56
    if-gez p3, :cond_3

    .line 57
    .line 58
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    .line 59
    .line 60
    return-void

    .line 61
    :cond_3
    const/high16 p1, 0x3f800000    # 1.0f

    .line 62
    .line 63
    sub-float/2addr p1, p2

    .line 64
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->setProgress(F)V

    .line 65
    .line 66
    .line 67
    :cond_4
    return-void
.end method

.method public onPageSelected(I)V
    .locals 0

    return-void
.end method

.method public setDirection(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->J:I

    .line 2
    .line 3
    return-void
.end method

.method public setProgress(F)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v1, p1, v0

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->y:F

    .line 8
    .line 9
    float-to-double v1, p1

    .line 10
    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    .line 11
    .line 12
    cmpg-double v1, v1, v3

    .line 13
    .line 14
    const/high16 v2, 0x3f000000    # 0.5f

    .line 15
    .line 16
    if-gtz v1, :cond_1

    .line 17
    .line 18
    div-float/2addr p1, v2

    .line 19
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->w:F

    .line 20
    .line 21
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->x:F

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    sub-float/2addr p1, v2

    .line 25
    div-float/2addr p1, v2

    .line 26
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->x:F

    .line 27
    .line 28
    const/high16 p1, 0x3f800000    # 1.0f

    .line 29
    .line 30
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->w:F

    .line 31
    .line 32
    :goto_0
    iget p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->J:I

    .line 33
    .line 34
    sget v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->M:I

    .line 35
    .line 36
    if-ne p1, v0, :cond_2

    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h()V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i()V

    .line 43
    .line 44
    .line 45
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 46
    .line 47
    .line 48
    return-void
.end method
