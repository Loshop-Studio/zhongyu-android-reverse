.class public Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Landroid/graphics/Paint;

.field public c:I

.field public d:I

.field public e:Landroid/graphics/RectF;

.field public f:I

.field public g:F

.field public h:I

.field public i:Landroid/graphics/Bitmap;

.field public j:F

.field public k:Landroid/graphics/Paint;

.field public l:[I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/16 v0, 0xa

    .line 2
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->f:I

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 4
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 v0, 0xa

    .line 5
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->f:I

    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 p3, 0xa

    .line 8
    iput p3, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->f:I

    .line 9
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->LoadingView:[I

    .line 2
    .line 3
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    sget v0, Lcom/xuexiang/xui/R$styleable;->LoadingView_lv_color:I

    .line 8
    .line 9
    sget v1, Lcom/xuexiang/xui/R$attr;->colorAccent:I

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-static {p1, v1, v2}, Lkotlin/collections/u;->F(Landroid/content/Context;II)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-virtual {p2, v0, p1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->d:I

    .line 21
    .line 22
    sget p1, Lcom/xuexiang/xui/R$styleable;->LoadingView_lv_arc_degree:I

    .line 23
    .line 24
    const/16 v0, 0x13b

    .line 25
    .line 26
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    int-to-float p1, p1

    .line 31
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->g:F

    .line 32
    .line 33
    iget p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->d:I

    .line 34
    .line 35
    filled-new-array {v2, p1}, [I

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->l:[I

    .line 40
    .line 41
    sget p1, Lcom/xuexiang/xui/R$styleable;->LoadingView_lv_width:I

    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const/high16 v1, 0x40c00000    # 6.0f

    .line 48
    .line 49
    invoke-static {v0, v1}, Lh4/a;->h(Landroid/content/Context;F)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->c:I

    .line 58
    .line 59
    sget p1, Lcom/xuexiang/xui/R$styleable;->LoadingView_lv_speed:I

    .line 60
    .line 61
    const/4 v0, 0x5

    .line 62
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->h:I

    .line 67
    .line 68
    sget p1, Lcom/xuexiang/xui/R$styleable;->LoadingView_lv_auto:I

    .line 69
    .line 70
    const/4 v0, 0x1

    .line 71
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->a:Z

    .line 76
    .line 77
    sget p1, Lcom/xuexiang/xui/R$styleable;->LoadingView_lv_has_icon:I

    .line 78
    .line 79
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-eqz p1, :cond_1

    .line 84
    .line 85
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 86
    .line 87
    .line 88
    sget p1, Lcom/xuexiang/xui/R$styleable;->LoadingView_lv_icon:I

    .line 89
    .line 90
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    if-eqz p1, :cond_0

    .line 95
    .line 96
    invoke-static {p1}, Lt6/a;->c(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->i:Landroid/graphics/Bitmap;

    .line 101
    .line 102
    sget p1, Lcom/xuexiang/xui/R$styleable;->LoadingView_lv_icon_scale:I

    .line 103
    .line 104
    const/high16 v1, 0x3f000000    # 0.5f

    .line 105
    .line 106
    invoke-virtual {p2, p1, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->j:F

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_0
    invoke-static {}, Lkotlin/collections/u;->t()V

    .line 114
    .line 115
    .line 116
    const/4 p1, 0x0

    .line 117
    throw p1

    .line 118
    :cond_1
    :goto_0
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 119
    .line 120
    .line 121
    new-instance p1, Landroid/graphics/Paint;

    .line 122
    .line 123
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 124
    .line 125
    .line 126
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->b:Landroid/graphics/Paint;

    .line 127
    .line 128
    iget p2, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->d:I

    .line 129
    .line 130
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 131
    .line 132
    .line 133
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->b:Landroid/graphics/Paint;

    .line 134
    .line 135
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 136
    .line 137
    .line 138
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->b:Landroid/graphics/Paint;

    .line 139
    .line 140
    sget-object p2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 141
    .line 142
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 143
    .line 144
    .line 145
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->b:Landroid/graphics/Paint;

    .line 146
    .line 147
    iget v1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->c:I

    .line 148
    .line 149
    int-to-float v1, v1

    .line 150
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 151
    .line 152
    .line 153
    new-instance p1, Landroid/graphics/Paint;

    .line 154
    .line 155
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 156
    .line 157
    .line 158
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->k:Landroid/graphics/Paint;

    .line 159
    .line 160
    iget v1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->d:I

    .line 161
    .line 162
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 163
    .line 164
    .line 165
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->k:Landroid/graphics/Paint;

    .line 166
    .line 167
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 168
    .line 169
    .line 170
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->k:Landroid/graphics/Paint;

    .line 171
    .line 172
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 173
    .line 174
    .line 175
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->k:Landroid/graphics/Paint;

    .line 176
    .line 177
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 178
    .line 179
    .line 180
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->k:Landroid/graphics/Paint;

    .line 181
    .line 182
    sget-object p2, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 183
    .line 184
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 185
    .line 186
    .line 187
    return-void
.end method

.method public getIconScale()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->j:F

    .line 2
    .line 3
    return v0
.end method

.method public getLoadingColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 12

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->a:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->i:Landroid/graphics/Bitmap;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    int-to-float v2, v2

    .line 19
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    int-to-float v3, v3

    .line 24
    cmpl-float v4, v2, v3

    .line 25
    .line 26
    if-ltz v4, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    int-to-float v4, v4

    .line 33
    div-float/2addr v4, v2

    .line 34
    mul-float/2addr v4, v3

    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    int-to-float v2, v2

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    int-to-float v4, v4

    .line 46
    div-float/2addr v4, v3

    .line 47
    mul-float/2addr v2, v4

    .line 48
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    int-to-float v4, v3

    .line 53
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    int-to-float v3, v3

    .line 58
    iget v5, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->j:F

    .line 59
    .line 60
    const/high16 v6, 0x40000000    # 2.0f

    .line 61
    .line 62
    invoke-static {v2, v5, v3, v6}, Landroidx/compose/material3/c;->a(FFFF)F

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    int-to-float v3, v3

    .line 71
    iget v5, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->j:F

    .line 72
    .line 73
    invoke-static {v4, v5, v3, v6}, Landroidx/compose/material3/c;->a(FFFF)F

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    int-to-float v4, v4

    .line 82
    sub-float/2addr v4, v2

    .line 83
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    int-to-float v5, v5

    .line 88
    sub-float/2addr v5, v3

    .line 89
    new-instance v6, Landroid/graphics/RectF;

    .line 90
    .line 91
    invoke-direct {v6, v2, v3, v4, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 92
    .line 93
    .line 94
    iget-object v2, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->k:Landroid/graphics/Paint;

    .line 95
    .line 96
    invoke-virtual {p1, v0, v1, v6, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 97
    .line 98
    .line 99
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->b:Landroid/graphics/Paint;

    .line 100
    .line 101
    new-instance v2, Landroid/graphics/SweepGradient;

    .line 102
    .line 103
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    shr-int/lit8 v3, v3, 0x1

    .line 108
    .line 109
    int-to-float v3, v3

    .line 110
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    shr-int/lit8 v4, v4, 0x1

    .line 115
    .line 116
    int-to-float v4, v4

    .line 117
    iget-object v5, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->l:[I

    .line 118
    .line 119
    invoke-direct {v2, v3, v4, v5, v1}, Landroid/graphics/SweepGradient;-><init>(FF[I[F)V

    .line 120
    .line 121
    .line 122
    new-instance v1, Landroid/graphics/Matrix;

    .line 123
    .line 124
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 125
    .line 126
    .line 127
    iget v3, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->f:I

    .line 128
    .line 129
    int-to-float v3, v3

    .line 130
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    shr-int/lit8 v4, v4, 0x1

    .line 135
    .line 136
    int-to-float v4, v4

    .line 137
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    .line 138
    .line 139
    .line 140
    move-result v5

    .line 141
    shr-int/lit8 v5, v5, 0x1

    .line 142
    .line 143
    int-to-float v5, v5

    .line 144
    invoke-virtual {v1, v3, v4, v5}, Landroid/graphics/Matrix;->setRotate(FFF)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2, v1}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 151
    .line 152
    .line 153
    iget-object v7, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->e:Landroid/graphics/RectF;

    .line 154
    .line 155
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->f:I

    .line 156
    .line 157
    int-to-float v8, v0

    .line 158
    iget v9, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->g:F

    .line 159
    .line 160
    const/4 v10, 0x0

    .line 161
    iget-object v11, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->b:Landroid/graphics/Paint;

    .line 162
    .line 163
    move-object v6, p1

    .line 164
    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 165
    .line 166
    .line 167
    iget p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->f:I

    .line 168
    .line 169
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->h:I

    .line 170
    .line 171
    add-int/2addr p1, v0

    .line 172
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->f:I

    .line 173
    .line 174
    const/16 v0, 0x168

    .line 175
    .line 176
    if-le p1, v0, :cond_3

    .line 177
    .line 178
    sub-int/2addr p1, v0

    .line 179
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->f:I

    .line 180
    .line 181
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 182
    .line 183
    .line 184
    return-void
.end method

.method public final onSizeChanged(IIII)V
    .locals 3

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    new-instance p3, Landroid/graphics/RectF;

    .line 5
    .line 6
    iget p4, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->c:I

    .line 7
    .line 8
    mul-int/lit8 v0, p4, 0x2

    .line 9
    .line 10
    int-to-float v0, v0

    .line 11
    mul-int/lit8 v1, p4, 0x2

    .line 12
    .line 13
    int-to-float v1, v1

    .line 14
    mul-int/lit8 v2, p4, 0x2

    .line 15
    .line 16
    sub-int/2addr p1, v2

    .line 17
    int-to-float p1, p1

    .line 18
    mul-int/lit8 p4, p4, 0x2

    .line 19
    .line 20
    sub-int/2addr p2, p4

    .line 21
    int-to-float p2, p2

    .line 22
    invoke-direct {p3, v0, v1, p1, p2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 23
    .line 24
    .line 25
    iput-object p3, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->e:Landroid/graphics/RectF;

    .line 26
    .line 27
    return-void
.end method
