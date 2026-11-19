.class public Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;
.super Landroid/view/View;
.source "SourceFile"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;


# instance fields
.field public final A:I

.field public final B:I

.field public C:F

.field public D:F

.field public E:F

.field public F:F

.field public G:F

.field public H:F

.field public I:I

.field public final J:Landroid/view/animation/AccelerateDecelerateInterpolator;

.field public final a:Landroid/graphics/Paint;

.field public final b:Landroid/graphics/Paint;

.field public final c:Landroid/graphics/Path;

.field public final d:Landroid/graphics/Path;

.field public final e:I

.field public final f:I

.field public final g:F

.field public final h:F

.field public i:F

.field public final j:F

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

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c:Landroid/graphics/Path;

    .line 5
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d:Landroid/graphics/Path;

    const/high16 p1, 0x42a00000    # 80.0f

    .line 6
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->g:F

    const/high16 p1, 0x41f00000    # 30.0f

    .line 7
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    const/high16 p1, 0x41a00000    # 20.0f

    .line 8
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j:F

    const/4 p1, 0x0

    .line 9
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->v:F

    .line 10
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->w:F

    const/4 p1, 0x0

    .line 11
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->y:I

    const/4 p1, 0x1

    .line 12
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->A:I

    const/4 p3, 0x2

    .line 13
    iput p3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->B:I

    .line 14
    new-instance p3, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {p3}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->J:Landroid/view/animation/AccelerateDecelerateInterpolator;

    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    sget-object v0, Lcom/xuexiang/xui/R$styleable;->BezierBannerView:[I

    invoke-virtual {p3, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 16
    sget p3, Lcom/xuexiang/xui/R$styleable;->BezierBannerView_bbv_selectedColor:I

    const/4 v0, -0x1

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->e:I

    .line 17
    sget p3, Lcom/xuexiang/xui/R$styleable;->BezierBannerView_bbv_unSelectedColor:I

    const v0, -0x555556

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->f:I

    .line 18
    sget p3, Lcom/xuexiang/xui/R$styleable;->BezierBannerView_bbv_selectedRadius:I

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 19
    sget p3, Lcom/xuexiang/xui/R$styleable;->BezierBannerView_bbv_unSelectedRadius:I

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j:F

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j:F

    .line 20
    sget p3, Lcom/xuexiang/xui/R$styleable;->BezierBannerView_bbv_spacing:I

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->g:F

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->g:F

    .line 21
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 22
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2, p1}, Landroid/graphics/Paint;-><init>(I)V

    .line 23
    iget p3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->e:I

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 24
    sget-object p3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 25
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 26
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 27
    iput-object p2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->a:Landroid/graphics/Paint;

    .line 28
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2, p1}, Landroid/graphics/Paint;-><init>(I)V

    .line 29
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->f:I

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 30
    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 31
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 32
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 33
    iput-object p2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b:Landroid/graphics/Paint;

    return-void
.end method

.method public static b(FFF)F
    .locals 0

    .line 1
    invoke-static {p1, p0, p2, p0}, Landroid/support/v4/media/f;->b(FFFF)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method


# virtual methods
.method public final a(I)F
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
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j:F

    .line 8
    .line 9
    const/high16 v1, 0x40000000    # 2.0f

    .line 10
    .line 11
    mul-float/2addr v1, v0

    .line 12
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->g:F

    .line 13
    .line 14
    add-float/2addr v1, v2

    .line 15
    mul-float/2addr v1, p1

    .line 16
    add-float/2addr v1, v0

    .line 17
    iget p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 18
    .line 19
    sub-float/2addr p1, v0

    .line 20
    add-float/2addr p1, v1

    .line 21
    return p1
.end method

.method public final c(FFI)F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->A:I

    .line 2
    .line 3
    if-ne p3, v0, :cond_0

    .line 4
    .line 5
    sub-float/2addr p2, p1

    .line 6
    iget p3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->v:F

    .line 7
    .line 8
    :goto_0
    mul-float/2addr p2, p3

    .line 9
    add-float/2addr p2, p1

    .line 10
    return p2

    .line 11
    :cond_0
    sub-float/2addr p2, p1

    .line 12
    iget p3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->w:F

    .line 13
    .line 14
    goto :goto_0
.end method

.method public final d()V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c:Landroid/graphics/Path;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    .line 6
    .line 7
    .line 8
    iget-object v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d:Landroid/graphics/Path;

    .line 9
    .line 10
    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    .line 11
    .line 12
    .line 13
    iget-object v3, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->J:Landroid/view/animation/AccelerateDecelerateInterpolator;

    .line 14
    .line 15
    iget v4, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->x:F

    .line 16
    .line 17
    invoke-virtual {v3, v4}, Landroid/view/animation/AccelerateDecelerateInterpolator;->getInterpolation(F)F

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    iget v4, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->y:I

    .line 22
    .line 23
    invoke-virtual {v0, v4}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->a(I)F

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    iget v5, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->y:I

    .line 28
    .line 29
    add-int/lit8 v5, v5, 0x1

    .line 30
    .line 31
    invoke-virtual {v0, v5}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->a(I)F

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    iget v6, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 36
    .line 37
    sub-float/2addr v5, v6

    .line 38
    iget v6, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->B:I

    .line 39
    .line 40
    invoke-virtual {v0, v4, v5, v6}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c(FFI)F

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    iput v4, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->n:F

    .line 45
    .line 46
    iget v4, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 47
    .line 48
    iput v4, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->o:F

    .line 49
    .line 50
    const/4 v5, 0x0

    .line 51
    invoke-static {v4, v5, v3}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b(FFF)F

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    iput v4, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    .line 56
    .line 57
    const/high16 v4, 0x42340000    # 45.0f

    .line 58
    .line 59
    iget v7, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->A:I

    .line 60
    .line 61
    invoke-virtual {v0, v4, v5, v7}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c(FFI)F

    .line 62
    .line 63
    .line 64
    move-result v8

    .line 65
    float-to-double v8, v8

    .line 66
    invoke-static {v8, v9}, Ljava/lang/Math;->toRadians(D)D

    .line 67
    .line 68
    .line 69
    move-result-wide v8

    .line 70
    invoke-static {v8, v9}, Ljava/lang/Math;->sin(D)D

    .line 71
    .line 72
    .line 73
    move-result-wide v10

    .line 74
    iget v12, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    .line 75
    .line 76
    float-to-double v12, v12

    .line 77
    mul-double/2addr v10, v12

    .line 78
    double-to-float v10, v10

    .line 79
    invoke-static {v8, v9}, Ljava/lang/Math;->cos(D)D

    .line 80
    .line 81
    .line 82
    move-result-wide v8

    .line 83
    iget v11, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    .line 84
    .line 85
    float-to-double v11, v11

    .line 86
    mul-double/2addr v8, v11

    .line 87
    double-to-float v8, v8

    .line 88
    iget v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->y:I

    .line 89
    .line 90
    invoke-virtual {v0, v9}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->a(I)F

    .line 91
    .line 92
    .line 93
    move-result v9

    .line 94
    iget v11, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 95
    .line 96
    add-float/2addr v9, v11

    .line 97
    iget v11, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->y:I

    .line 98
    .line 99
    add-int/lit8 v11, v11, 0x1

    .line 100
    .line 101
    invoke-virtual {v0, v11}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->a(I)F

    .line 102
    .line 103
    .line 104
    move-result v11

    .line 105
    invoke-virtual {v0, v9, v11, v7}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c(FFI)F

    .line 106
    .line 107
    .line 108
    move-result v9

    .line 109
    iput v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->p:F

    .line 110
    .line 111
    iget v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 112
    .line 113
    iput v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->q:F

    .line 114
    .line 115
    invoke-static {v5, v9, v3}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b(FFF)F

    .line 116
    .line 117
    .line 118
    move-result v9

    .line 119
    iput v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->l:F

    .line 120
    .line 121
    invoke-virtual {v0, v5, v4, v6}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c(FFI)F

    .line 122
    .line 123
    .line 124
    move-result v9

    .line 125
    float-to-double v11, v9

    .line 126
    invoke-static {v11, v12}, Ljava/lang/Math;->toRadians(D)D

    .line 127
    .line 128
    .line 129
    move-result-wide v11

    .line 130
    invoke-static {v11, v12}, Ljava/lang/Math;->sin(D)D

    .line 131
    .line 132
    .line 133
    move-result-wide v13

    .line 134
    iget v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->l:F

    .line 135
    .line 136
    float-to-double v4, v9

    .line 137
    mul-double/2addr v13, v4

    .line 138
    double-to-float v4, v13

    .line 139
    invoke-static {v11, v12}, Ljava/lang/Math;->cos(D)D

    .line 140
    .line 141
    .line 142
    move-result-wide v11

    .line 143
    iget v5, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->l:F

    .line 144
    .line 145
    float-to-double v13, v5

    .line 146
    mul-double/2addr v11, v13

    .line 147
    double-to-float v5, v11

    .line 148
    iget v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->n:F

    .line 149
    .line 150
    add-float/2addr v9, v10

    .line 151
    iput v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->E:F

    .line 152
    .line 153
    iget v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->o:F

    .line 154
    .line 155
    sub-float/2addr v9, v8

    .line 156
    iput v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->F:F

    .line 157
    .line 158
    iget v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->p:F

    .line 159
    .line 160
    sub-float/2addr v9, v4

    .line 161
    iput v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->G:F

    .line 162
    .line 163
    iget v4, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 164
    .line 165
    sub-float/2addr v4, v5

    .line 166
    iput v4, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->H:F

    .line 167
    .line 168
    iget v4, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->y:I

    .line 169
    .line 170
    invoke-virtual {v0, v4}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->a(I)F

    .line 171
    .line 172
    .line 173
    move-result v4

    .line 174
    iget v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 175
    .line 176
    add-float/2addr v4, v9

    .line 177
    iget v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->y:I

    .line 178
    .line 179
    add-int/lit8 v9, v9, 0x1

    .line 180
    .line 181
    invoke-virtual {v0, v9}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->a(I)F

    .line 182
    .line 183
    .line 184
    move-result v9

    .line 185
    iget v10, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 186
    .line 187
    sub-float/2addr v9, v10

    .line 188
    sub-float/2addr v9, v4

    .line 189
    iget v11, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->x:F

    .line 190
    .line 191
    mul-float/2addr v9, v11

    .line 192
    add-float/2addr v9, v4

    .line 193
    iput v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->C:F

    .line 194
    .line 195
    iput v10, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->D:F

    .line 196
    .line 197
    iget v4, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->E:F

    .line 198
    .line 199
    iget v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->F:F

    .line 200
    .line 201
    invoke-virtual {v1, v4, v9}, Landroid/graphics/Path;->moveTo(FF)V

    .line 202
    .line 203
    .line 204
    iget v4, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->C:F

    .line 205
    .line 206
    iget v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->D:F

    .line 207
    .line 208
    iget v10, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->G:F

    .line 209
    .line 210
    iget v11, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->H:F

    .line 211
    .line 212
    invoke-virtual {v1, v4, v9, v10, v11}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 213
    .line 214
    .line 215
    iget v4, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->G:F

    .line 216
    .line 217
    iget v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 218
    .line 219
    add-float/2addr v9, v5

    .line 220
    invoke-virtual {v1, v4, v9}, Landroid/graphics/Path;->lineTo(FF)V

    .line 221
    .line 222
    .line 223
    iget v4, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->C:F

    .line 224
    .line 225
    iget v5, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->E:F

    .line 226
    .line 227
    iget v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->F:F

    .line 228
    .line 229
    const/high16 v10, 0x40000000    # 2.0f

    .line 230
    .line 231
    mul-float/2addr v8, v10

    .line 232
    add-float/2addr v8, v9

    .line 233
    iget v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 234
    .line 235
    invoke-virtual {v1, v4, v9, v5, v8}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 236
    .line 237
    .line 238
    iget v4, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->E:F

    .line 239
    .line 240
    iget v5, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->F:F

    .line 241
    .line 242
    invoke-virtual {v1, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 243
    .line 244
    .line 245
    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->y:I

    .line 246
    .line 247
    add-int/lit8 v1, v1, 0x1

    .line 248
    .line 249
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->a(I)F

    .line 250
    .line 251
    .line 252
    move-result v1

    .line 253
    iget v4, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->y:I

    .line 254
    .line 255
    invoke-virtual {v0, v4}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->a(I)F

    .line 256
    .line 257
    .line 258
    move-result v4

    .line 259
    iget v5, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j:F

    .line 260
    .line 261
    add-float/2addr v4, v5

    .line 262
    invoke-virtual {v0, v1, v4, v6}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c(FFI)F

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    iput v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->t:F

    .line 267
    .line 268
    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 269
    .line 270
    iput v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->u:F

    .line 271
    .line 272
    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j:F

    .line 273
    .line 274
    const/4 v15, 0x0

    .line 275
    invoke-static {v1, v15, v3}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b(FFF)F

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    iput v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->k:F

    .line 280
    .line 281
    const/high16 v1, 0x42340000    # 45.0f

    .line 282
    .line 283
    invoke-virtual {v0, v1, v15, v7}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c(FFI)F

    .line 284
    .line 285
    .line 286
    move-result v4

    .line 287
    float-to-double v4, v4

    .line 288
    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    .line 289
    .line 290
    .line 291
    move-result-wide v4

    .line 292
    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    .line 293
    .line 294
    .line 295
    move-result-wide v8

    .line 296
    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->k:F

    .line 297
    .line 298
    float-to-double v11, v1

    .line 299
    mul-double/2addr v8, v11

    .line 300
    double-to-float v1, v8

    .line 301
    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    .line 302
    .line 303
    .line 304
    move-result-wide v4

    .line 305
    iget v8, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->k:F

    .line 306
    .line 307
    float-to-double v8, v8

    .line 308
    mul-double/2addr v4, v8

    .line 309
    double-to-float v4, v4

    .line 310
    iget v5, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->y:I

    .line 311
    .line 312
    add-int/lit8 v5, v5, 0x1

    .line 313
    .line 314
    invoke-virtual {v0, v5}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->a(I)F

    .line 315
    .line 316
    .line 317
    move-result v5

    .line 318
    iget v8, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j:F

    .line 319
    .line 320
    sub-float/2addr v5, v8

    .line 321
    iget v8, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->y:I

    .line 322
    .line 323
    invoke-virtual {v0, v8}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->a(I)F

    .line 324
    .line 325
    .line 326
    move-result v8

    .line 327
    invoke-virtual {v0, v5, v8, v7}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c(FFI)F

    .line 328
    .line 329
    .line 330
    move-result v5

    .line 331
    iput v5, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->r:F

    .line 332
    .line 333
    iget v5, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 334
    .line 335
    iput v5, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->s:F

    .line 336
    .line 337
    iget v5, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j:F

    .line 338
    .line 339
    const/4 v15, 0x0

    .line 340
    invoke-static {v15, v5, v3}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b(FFF)F

    .line 341
    .line 342
    .line 343
    move-result v3

    .line 344
    iput v3, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->m:F

    .line 345
    .line 346
    const/high16 v3, 0x42340000    # 45.0f

    .line 347
    .line 348
    invoke-virtual {v0, v15, v3, v6}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c(FFI)F

    .line 349
    .line 350
    .line 351
    move-result v3

    .line 352
    float-to-double v5, v3

    .line 353
    invoke-static {v5, v6}, Ljava/lang/Math;->toRadians(D)D

    .line 354
    .line 355
    .line 356
    move-result-wide v5

    .line 357
    invoke-static {v5, v6}, Ljava/lang/Math;->sin(D)D

    .line 358
    .line 359
    .line 360
    move-result-wide v7

    .line 361
    iget v3, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->m:F

    .line 362
    .line 363
    float-to-double v11, v3

    .line 364
    mul-double/2addr v7, v11

    .line 365
    double-to-float v3, v7

    .line 366
    invoke-static {v5, v6}, Ljava/lang/Math;->cos(D)D

    .line 367
    .line 368
    .line 369
    move-result-wide v5

    .line 370
    iget v7, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->m:F

    .line 371
    .line 372
    float-to-double v7, v7

    .line 373
    mul-double/2addr v5, v7

    .line 374
    double-to-float v5, v5

    .line 375
    iget v6, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->t:F

    .line 376
    .line 377
    sub-float/2addr v6, v1

    .line 378
    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->u:F

    .line 379
    .line 380
    sub-float/2addr v1, v4

    .line 381
    iget v7, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->r:F

    .line 382
    .line 383
    add-float/2addr v7, v3

    .line 384
    iget v3, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->s:F

    .line 385
    .line 386
    sub-float/2addr v3, v5

    .line 387
    iget v8, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->y:I

    .line 388
    .line 389
    add-int/lit8 v8, v8, 0x1

    .line 390
    .line 391
    invoke-virtual {v0, v8}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->a(I)F

    .line 392
    .line 393
    .line 394
    move-result v8

    .line 395
    iget v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j:F

    .line 396
    .line 397
    sub-float/2addr v8, v9

    .line 398
    iget v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->y:I

    .line 399
    .line 400
    invoke-virtual {v0, v9}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->a(I)F

    .line 401
    .line 402
    .line 403
    move-result v9

    .line 404
    iget v11, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j:F

    .line 405
    .line 406
    add-float/2addr v9, v11

    .line 407
    sub-float/2addr v9, v8

    .line 408
    iget v11, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->x:F

    .line 409
    .line 410
    mul-float/2addr v9, v11

    .line 411
    add-float/2addr v9, v8

    .line 412
    invoke-virtual {v2, v6, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 413
    .line 414
    .line 415
    iget v8, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 416
    .line 417
    invoke-virtual {v2, v9, v8, v7, v3}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 418
    .line 419
    .line 420
    iget v3, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 421
    .line 422
    add-float/2addr v3, v5

    .line 423
    invoke-virtual {v2, v7, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 424
    .line 425
    .line 426
    mul-float/2addr v4, v10

    .line 427
    add-float/2addr v4, v1

    .line 428
    invoke-virtual {v2, v9, v8, v6, v4}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v2, v6, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 432
    .line 433
    .line 434
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
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
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    .line 22
    .line 23
    if-ge v0, v1, :cond_4

    .line 24
    .line 25
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->I:I

    .line 26
    .line 27
    const/4 v2, 0x2

    .line 28
    if-ne v1, v2, :cond_1

    .line 29
    .line 30
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->y:I

    .line 31
    .line 32
    if-eq v0, v1, :cond_3

    .line 33
    .line 34
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    if-ne v0, v1, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->a(I)F

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j:F

    .line 44
    .line 45
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b:Landroid/graphics/Paint;

    .line 46
    .line 47
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 48
    .line 49
    invoke-virtual {p1, v1, v4, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    const/4 v2, 0x1

    .line 54
    if-ne v1, v2, :cond_3

    .line 55
    .line 56
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->y:I

    .line 57
    .line 58
    if-eq v0, v1, :cond_3

    .line 59
    .line 60
    add-int/lit8 v1, v1, -0x1

    .line 61
    .line 62
    if-ne v0, v1, :cond_2

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->a(I)F

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j:F

    .line 70
    .line 71
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b:Landroid/graphics/Paint;

    .line 72
    .line 73
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 74
    .line 75
    invoke-virtual {p1, v1, v4, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 76
    .line 77
    .line 78
    :cond_3
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_4
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->r:F

    .line 82
    .line 83
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->s:F

    .line 84
    .line 85
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->m:F

    .line 86
    .line 87
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b:Landroid/graphics/Paint;

    .line 88
    .line 89
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 90
    .line 91
    .line 92
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->t:F

    .line 93
    .line 94
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->u:F

    .line 95
    .line 96
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->k:F

    .line 97
    .line 98
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b:Landroid/graphics/Paint;

    .line 99
    .line 100
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 101
    .line 102
    .line 103
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d:Landroid/graphics/Path;

    .line 104
    .line 105
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b:Landroid/graphics/Paint;

    .line 106
    .line 107
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 108
    .line 109
    .line 110
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->p:F

    .line 111
    .line 112
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->q:F

    .line 113
    .line 114
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->l:F

    .line 115
    .line 116
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->a:Landroid/graphics/Paint;

    .line 117
    .line 118
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 119
    .line 120
    .line 121
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->n:F

    .line 122
    .line 123
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->o:F

    .line 124
    .line 125
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    .line 126
    .line 127
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->a:Landroid/graphics/Paint;

    .line 128
    .line 129
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 130
    .line 131
    .line 132
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c:Landroid/graphics/Path;

    .line 133
    .line 134
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->a:Landroid/graphics/Paint;

    .line 135
    .line 136
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 140
    .line 141
    .line 142
    return-void
.end method

.method public final onMeasure(II)V
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
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->z:I

    .line 24
    .line 25
    int-to-float v6, v5

    .line 26
    mul-float/2addr v4, v6

    .line 27
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 28
    .line 29
    invoke-static {v6, v2, v3, v4}, Landroid/support/v4/media/f;->b(FFFF)F

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    add-int/lit8 v5, v5, -0x1

    .line 34
    .line 35
    int-to-float v4, v5

    .line 36
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->g:F

    .line 37
    .line 38
    mul-float/2addr v4, v5

    .line 39
    add-float/2addr v4, v2

    .line 40
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    int-to-float v2, v2

    .line 45
    add-float/2addr v4, v2

    .line 46
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    int-to-float v2, v2

    .line 51
    add-float/2addr v4, v2

    .line 52
    float-to-int v2, v4

    .line 53
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 54
    .line 55
    mul-float/2addr v4, v3

    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    int-to-float v3, v3

    .line 61
    add-float/2addr v4, v3

    .line 62
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    int-to-float v3, v3

    .line 67
    add-float/2addr v4, v3

    .line 68
    float-to-int v3, v4

    .line 69
    const/high16 v4, -0x80000000

    .line 70
    .line 71
    const/high16 v5, 0x40000000    # 2.0f

    .line 72
    .line 73
    if-ne v0, v5, :cond_0

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    if-ne v0, v4, :cond_1

    .line 77
    .line 78
    invoke-static {p1, v2}, Ljava/lang/Math;->min(II)I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    :cond_1
    :goto_0
    if-ne v1, v5, :cond_2

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_2
    if-ne v1, v4, :cond_3

    .line 86
    .line 87
    invoke-static {p2, v3}, Ljava/lang/Math;->min(II)I

    .line 88
    .line 89
    .line 90
    move-result p2

    .line 91
    :cond_3
    :goto_1
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 92
    .line 93
    .line 94
    return-void
.end method

.method public final onPageScrollStateChanged(I)V
    .locals 0

    return-void
.end method

.method public final onPageScrolled(IFI)V
    .locals 5

    .line 1
    const/4 p3, 0x0

    .line 2
    cmpl-float v0, p2, p3

    .line 3
    .line 4
    const-string v1, "com.xuexiang.xui.widget.imageview.preview.view.BezierBannerView"

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->y:I

    .line 9
    .line 10
    const-string v0, "\u5230\u8fbe"

    .line 11
    .line 12
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    iput p3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->v:F

    .line 16
    .line 17
    iput p3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->w:F

    .line 18
    .line 19
    iput p3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->x:F

    .line 20
    .line 21
    :cond_0
    int-to-float v0, p1

    .line 22
    add-float/2addr v0, p2

    .line 23
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->y:I

    .line 24
    .line 25
    int-to-float v3, v2

    .line 26
    sub-float v3, v0, v3

    .line 27
    .line 28
    cmpl-float v3, v3, p3

    .line 29
    .line 30
    const/4 v4, 0x1

    .line 31
    if-lez v3, :cond_2

    .line 32
    .line 33
    const/4 p3, 0x2

    .line 34
    iput p3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->I:I

    .line 35
    .line 36
    add-int/2addr v2, v4

    .line 37
    int-to-float p3, v2

    .line 38
    cmpl-float p3, v0, p3

    .line 39
    .line 40
    if-lez p3, :cond_1

    .line 41
    .line 42
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->y:I

    .line 43
    .line 44
    const-string p1, "\u5411\u5de6\u5feb\u901f\u6ed1\u52a8"

    .line 45
    .line 46
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_1
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->setProgress(F)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_2
    int-to-float v3, v2

    .line 55
    sub-float v3, v0, v3

    .line 56
    .line 57
    cmpg-float p3, v3, p3

    .line 58
    .line 59
    if-gez p3, :cond_4

    .line 60
    .line 61
    iput v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->I:I

    .line 62
    .line 63
    sub-int/2addr v2, v4

    .line 64
    int-to-float p3, v2

    .line 65
    cmpg-float p3, v0, p3

    .line 66
    .line 67
    if-gez p3, :cond_3

    .line 68
    .line 69
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->y:I

    .line 70
    .line 71
    const-string p1, "\u5411\u53f3\u5feb\u901f\u6ed1\u52a8"

    .line 72
    .line 73
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_3
    const/high16 p1, 0x3f800000    # 1.0f

    .line 78
    .line 79
    sub-float/2addr p1, p2

    .line 80
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->setProgress(F)V

    .line 81
    .line 82
    .line 83
    :cond_4
    return-void
.end method

.method public final onPageSelected(I)V
    .locals 0

    return-void
.end method

.method public setDirection(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->I:I

    .line 2
    .line 3
    return-void
.end method

.method public setProgress(F)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    cmpl-float v3, v1, v2

    .line 7
    .line 8
    if-nez v3, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iput v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->x:F

    .line 12
    .line 13
    float-to-double v3, v1

    .line 14
    const-wide/high16 v5, 0x3fe0000000000000L    # 0.5

    .line 15
    .line 16
    cmpg-double v3, v3, v5

    .line 17
    .line 18
    const/high16 v4, 0x3f000000    # 0.5f

    .line 19
    .line 20
    if-gtz v3, :cond_1

    .line 21
    .line 22
    div-float/2addr v1, v4

    .line 23
    iput v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->v:F

    .line 24
    .line 25
    iput v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->w:F

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    sub-float/2addr v1, v4

    .line 29
    div-float/2addr v1, v4

    .line 30
    iput v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->w:F

    .line 31
    .line 32
    const/high16 v1, 0x3f800000    # 1.0f

    .line 33
    .line 34
    iput v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->v:F

    .line 35
    .line 36
    :goto_0
    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->I:I

    .line 37
    .line 38
    const/4 v3, 0x2

    .line 39
    if-ne v1, v3, :cond_2

    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d()V

    .line 42
    .line 43
    .line 44
    goto/16 :goto_1

    .line 45
    .line 46
    :cond_2
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c:Landroid/graphics/Path;

    .line 47
    .line 48
    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    .line 49
    .line 50
    .line 51
    iget-object v3, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->d:Landroid/graphics/Path;

    .line 52
    .line 53
    invoke-virtual {v3}, Landroid/graphics/Path;->reset()V

    .line 54
    .line 55
    .line 56
    iget-object v4, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->J:Landroid/view/animation/AccelerateDecelerateInterpolator;

    .line 57
    .line 58
    iget v5, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->x:F

    .line 59
    .line 60
    invoke-virtual {v4, v5}, Landroid/view/animation/AccelerateDecelerateInterpolator;->getInterpolation(F)F

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    iget v5, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->y:I

    .line 65
    .line 66
    invoke-virtual {v0, v5}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->a(I)F

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    iget v6, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->y:I

    .line 71
    .line 72
    add-int/lit8 v6, v6, -0x1

    .line 73
    .line 74
    invoke-virtual {v0, v6}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->a(I)F

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    iget v7, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 79
    .line 80
    add-float/2addr v6, v7

    .line 81
    iget v7, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->B:I

    .line 82
    .line 83
    invoke-virtual {v0, v5, v6, v7}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c(FFI)F

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    iput v5, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->n:F

    .line 88
    .line 89
    iget v5, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 90
    .line 91
    iput v5, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->o:F

    .line 92
    .line 93
    invoke-static {v5, v2, v4}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b(FFF)F

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    iput v5, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    .line 98
    .line 99
    const/high16 v5, 0x42340000    # 45.0f

    .line 100
    .line 101
    iget v6, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->A:I

    .line 102
    .line 103
    invoke-virtual {v0, v5, v2, v6}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c(FFI)F

    .line 104
    .line 105
    .line 106
    move-result v8

    .line 107
    float-to-double v8, v8

    .line 108
    invoke-static {v8, v9}, Ljava/lang/Math;->toRadians(D)D

    .line 109
    .line 110
    .line 111
    move-result-wide v8

    .line 112
    invoke-static {v8, v9}, Ljava/lang/Math;->sin(D)D

    .line 113
    .line 114
    .line 115
    move-result-wide v10

    .line 116
    iget v12, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    .line 117
    .line 118
    float-to-double v12, v12

    .line 119
    mul-double/2addr v10, v12

    .line 120
    double-to-float v10, v10

    .line 121
    invoke-static {v8, v9}, Ljava/lang/Math;->cos(D)D

    .line 122
    .line 123
    .line 124
    move-result-wide v8

    .line 125
    iget v11, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->i:F

    .line 126
    .line 127
    float-to-double v11, v11

    .line 128
    mul-double/2addr v8, v11

    .line 129
    double-to-float v8, v8

    .line 130
    iget v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->y:I

    .line 131
    .line 132
    invoke-virtual {v0, v9}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->a(I)F

    .line 133
    .line 134
    .line 135
    move-result v9

    .line 136
    iget v11, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 137
    .line 138
    sub-float/2addr v9, v11

    .line 139
    iget v11, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->y:I

    .line 140
    .line 141
    add-int/lit8 v11, v11, -0x1

    .line 142
    .line 143
    invoke-virtual {v0, v11}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->a(I)F

    .line 144
    .line 145
    .line 146
    move-result v11

    .line 147
    invoke-virtual {v0, v9, v11, v6}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c(FFI)F

    .line 148
    .line 149
    .line 150
    move-result v9

    .line 151
    iput v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->p:F

    .line 152
    .line 153
    iget v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 154
    .line 155
    iput v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->q:F

    .line 156
    .line 157
    invoke-static {v2, v9, v4}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b(FFF)F

    .line 158
    .line 159
    .line 160
    move-result v9

    .line 161
    iput v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->l:F

    .line 162
    .line 163
    invoke-virtual {v0, v2, v5, v7}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c(FFI)F

    .line 164
    .line 165
    .line 166
    move-result v9

    .line 167
    float-to-double v11, v9

    .line 168
    invoke-static {v11, v12}, Ljava/lang/Math;->toRadians(D)D

    .line 169
    .line 170
    .line 171
    move-result-wide v11

    .line 172
    invoke-static {v11, v12}, Ljava/lang/Math;->sin(D)D

    .line 173
    .line 174
    .line 175
    move-result-wide v13

    .line 176
    iget v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->l:F

    .line 177
    .line 178
    move v15, v6

    .line 179
    float-to-double v5, v9

    .line 180
    mul-double/2addr v13, v5

    .line 181
    double-to-float v5, v13

    .line 182
    invoke-static {v11, v12}, Ljava/lang/Math;->cos(D)D

    .line 183
    .line 184
    .line 185
    move-result-wide v11

    .line 186
    iget v6, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->l:F

    .line 187
    .line 188
    float-to-double v13, v6

    .line 189
    mul-double/2addr v11, v13

    .line 190
    double-to-float v6, v11

    .line 191
    iget v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->n:F

    .line 192
    .line 193
    sub-float/2addr v9, v10

    .line 194
    iput v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->E:F

    .line 195
    .line 196
    iget v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->o:F

    .line 197
    .line 198
    sub-float/2addr v9, v8

    .line 199
    iput v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->F:F

    .line 200
    .line 201
    iget v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->p:F

    .line 202
    .line 203
    add-float/2addr v9, v5

    .line 204
    iput v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->G:F

    .line 205
    .line 206
    iget v5, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 207
    .line 208
    sub-float/2addr v5, v6

    .line 209
    iput v5, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->H:F

    .line 210
    .line 211
    iget v5, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->y:I

    .line 212
    .line 213
    invoke-virtual {v0, v5}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->a(I)F

    .line 214
    .line 215
    .line 216
    move-result v5

    .line 217
    iget v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 218
    .line 219
    sub-float/2addr v5, v9

    .line 220
    iget v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->y:I

    .line 221
    .line 222
    add-int/lit8 v9, v9, -0x1

    .line 223
    .line 224
    invoke-virtual {v0, v9}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->a(I)F

    .line 225
    .line 226
    .line 227
    move-result v9

    .line 228
    iget v10, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 229
    .line 230
    add-float/2addr v9, v10

    .line 231
    sub-float/2addr v9, v5

    .line 232
    iget v11, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->x:F

    .line 233
    .line 234
    mul-float/2addr v9, v11

    .line 235
    add-float/2addr v9, v5

    .line 236
    iput v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->C:F

    .line 237
    .line 238
    iput v10, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->D:F

    .line 239
    .line 240
    iget v5, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->E:F

    .line 241
    .line 242
    iget v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->F:F

    .line 243
    .line 244
    invoke-virtual {v1, v5, v9}, Landroid/graphics/Path;->moveTo(FF)V

    .line 245
    .line 246
    .line 247
    iget v5, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->C:F

    .line 248
    .line 249
    iget v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->D:F

    .line 250
    .line 251
    iget v10, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->G:F

    .line 252
    .line 253
    iget v11, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->H:F

    .line 254
    .line 255
    invoke-virtual {v1, v5, v9, v10, v11}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 256
    .line 257
    .line 258
    iget v5, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->G:F

    .line 259
    .line 260
    iget v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 261
    .line 262
    add-float/2addr v9, v6

    .line 263
    invoke-virtual {v1, v5, v9}, Landroid/graphics/Path;->lineTo(FF)V

    .line 264
    .line 265
    .line 266
    iget v5, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->C:F

    .line 267
    .line 268
    iget v6, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->E:F

    .line 269
    .line 270
    iget v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->F:F

    .line 271
    .line 272
    const/high16 v10, 0x40000000    # 2.0f

    .line 273
    .line 274
    mul-float/2addr v8, v10

    .line 275
    add-float/2addr v8, v9

    .line 276
    iget v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 277
    .line 278
    invoke-virtual {v1, v5, v9, v6, v8}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 279
    .line 280
    .line 281
    iget v5, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->E:F

    .line 282
    .line 283
    iget v6, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->F:F

    .line 284
    .line 285
    invoke-virtual {v1, v5, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 286
    .line 287
    .line 288
    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->y:I

    .line 289
    .line 290
    add-int/lit8 v1, v1, -0x1

    .line 291
    .line 292
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->a(I)F

    .line 293
    .line 294
    .line 295
    move-result v1

    .line 296
    iget v5, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->y:I

    .line 297
    .line 298
    invoke-virtual {v0, v5}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->a(I)F

    .line 299
    .line 300
    .line 301
    move-result v5

    .line 302
    iget v6, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j:F

    .line 303
    .line 304
    sub-float/2addr v5, v6

    .line 305
    invoke-virtual {v0, v1, v5, v7}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c(FFI)F

    .line 306
    .line 307
    .line 308
    move-result v1

    .line 309
    iput v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->t:F

    .line 310
    .line 311
    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 312
    .line 313
    iput v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->u:F

    .line 314
    .line 315
    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j:F

    .line 316
    .line 317
    invoke-static {v1, v2, v4}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b(FFF)F

    .line 318
    .line 319
    .line 320
    move-result v1

    .line 321
    iput v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->k:F

    .line 322
    .line 323
    const/high16 v1, 0x42340000    # 45.0f

    .line 324
    .line 325
    invoke-virtual {v0, v1, v2, v15}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c(FFI)F

    .line 326
    .line 327
    .line 328
    move-result v5

    .line 329
    float-to-double v5, v5

    .line 330
    invoke-static {v5, v6}, Ljava/lang/Math;->toRadians(D)D

    .line 331
    .line 332
    .line 333
    move-result-wide v5

    .line 334
    invoke-static {v5, v6}, Ljava/lang/Math;->sin(D)D

    .line 335
    .line 336
    .line 337
    move-result-wide v8

    .line 338
    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->k:F

    .line 339
    .line 340
    float-to-double v11, v1

    .line 341
    mul-double/2addr v8, v11

    .line 342
    double-to-float v1, v8

    .line 343
    invoke-static {v5, v6}, Ljava/lang/Math;->cos(D)D

    .line 344
    .line 345
    .line 346
    move-result-wide v5

    .line 347
    iget v8, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->k:F

    .line 348
    .line 349
    float-to-double v8, v8

    .line 350
    mul-double/2addr v5, v8

    .line 351
    double-to-float v5, v5

    .line 352
    iget v6, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->y:I

    .line 353
    .line 354
    add-int/lit8 v6, v6, -0x1

    .line 355
    .line 356
    invoke-virtual {v0, v6}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->a(I)F

    .line 357
    .line 358
    .line 359
    move-result v6

    .line 360
    iget v8, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j:F

    .line 361
    .line 362
    add-float/2addr v6, v8

    .line 363
    iget v8, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->y:I

    .line 364
    .line 365
    invoke-virtual {v0, v8}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->a(I)F

    .line 366
    .line 367
    .line 368
    move-result v8

    .line 369
    invoke-virtual {v0, v6, v8, v15}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c(FFI)F

    .line 370
    .line 371
    .line 372
    move-result v6

    .line 373
    iput v6, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->r:F

    .line 374
    .line 375
    iget v6, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 376
    .line 377
    iput v6, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->s:F

    .line 378
    .line 379
    iget v6, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j:F

    .line 380
    .line 381
    invoke-static {v2, v6, v4}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->b(FFF)F

    .line 382
    .line 383
    .line 384
    move-result v4

    .line 385
    iput v4, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->m:F

    .line 386
    .line 387
    const/high16 v4, 0x42340000    # 45.0f

    .line 388
    .line 389
    invoke-virtual {v0, v2, v4, v7}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->c(FFI)F

    .line 390
    .line 391
    .line 392
    move-result v2

    .line 393
    float-to-double v6, v2

    .line 394
    invoke-static {v6, v7}, Ljava/lang/Math;->toRadians(D)D

    .line 395
    .line 396
    .line 397
    move-result-wide v6

    .line 398
    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    .line 399
    .line 400
    .line 401
    move-result-wide v8

    .line 402
    iget v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->m:F

    .line 403
    .line 404
    float-to-double v11, v2

    .line 405
    mul-double/2addr v8, v11

    .line 406
    double-to-float v2, v8

    .line 407
    invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D

    .line 408
    .line 409
    .line 410
    move-result-wide v6

    .line 411
    iget v4, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->m:F

    .line 412
    .line 413
    float-to-double v8, v4

    .line 414
    mul-double/2addr v6, v8

    .line 415
    double-to-float v4, v6

    .line 416
    iget v6, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->t:F

    .line 417
    .line 418
    add-float/2addr v6, v1

    .line 419
    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->u:F

    .line 420
    .line 421
    sub-float/2addr v1, v5

    .line 422
    iget v7, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->r:F

    .line 423
    .line 424
    sub-float/2addr v7, v2

    .line 425
    iget v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->s:F

    .line 426
    .line 427
    sub-float/2addr v2, v4

    .line 428
    iget v8, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->y:I

    .line 429
    .line 430
    add-int/lit8 v8, v8, -0x1

    .line 431
    .line 432
    invoke-virtual {v0, v8}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->a(I)F

    .line 433
    .line 434
    .line 435
    move-result v8

    .line 436
    iget v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j:F

    .line 437
    .line 438
    add-float/2addr v8, v9

    .line 439
    iget v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->y:I

    .line 440
    .line 441
    invoke-virtual {v0, v9}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->a(I)F

    .line 442
    .line 443
    .line 444
    move-result v9

    .line 445
    iget v11, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->j:F

    .line 446
    .line 447
    sub-float/2addr v9, v11

    .line 448
    sub-float/2addr v9, v8

    .line 449
    iget v11, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->x:F

    .line 450
    .line 451
    mul-float/2addr v9, v11

    .line 452
    add-float/2addr v9, v8

    .line 453
    invoke-virtual {v3, v6, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 454
    .line 455
    .line 456
    iget v8, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 457
    .line 458
    invoke-virtual {v3, v9, v8, v7, v2}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 459
    .line 460
    .line 461
    iget v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->h:F

    .line 462
    .line 463
    add-float/2addr v2, v4

    .line 464
    invoke-virtual {v3, v7, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 465
    .line 466
    .line 467
    mul-float/2addr v5, v10

    .line 468
    add-float/2addr v5, v1

    .line 469
    invoke-virtual {v3, v9, v8, v6, v5}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {v3, v6, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 473
    .line 474
    .line 475
    :goto_1
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 476
    .line 477
    .line 478
    return-void
.end method
