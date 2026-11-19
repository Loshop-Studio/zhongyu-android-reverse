.class public Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Landroid/graphics/Paint;

.field public c:I

.field public d:I

.field public e:Z

.field public f:Landroid/graphics/RectF;

.field public g:I

.field public h:I

.field public i:F

.field public j:I

.field public k:I

.field public l:F

.field public m:Z

.field public n:Landroid/graphics/Bitmap;

.field public o:F

.field public p:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/16 v0, 0xa

    .line 2
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->g:I

    const/16 v0, 0xbe

    .line 3
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->h:I

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->m:Z

    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 6
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 v0, 0xa

    .line 7
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->g:I

    const/16 v0, 0xbe

    .line 8
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->h:I

    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->m:Z

    .line 10
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 11
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 p3, 0xa

    .line 12
    iput p3, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->g:I

    const/16 p3, 0xbe

    .line 13
    iput p3, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->h:I

    const/4 p3, 0x1

    .line 14
    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->m:Z

    .line 15
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

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
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->d:I

    .line 21
    .line 22
    sget p1, Lcom/xuexiang/xui/R$styleable;->LoadingView_lv_width:I

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const/high16 v1, 0x40c00000    # 6.0f

    .line 29
    .line 30
    invoke-static {v0, v1}, Lh4/a;->h(Landroid/content/Context;F)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->c:I

    .line 39
    .line 40
    sget p1, Lcom/xuexiang/xui/R$styleable;->LoadingView_lv_speed:I

    .line 41
    .line 42
    const/4 v0, 0x5

    .line 43
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->k:I

    .line 48
    .line 49
    shr-int/lit8 p1, p1, 0x2

    .line 50
    .line 51
    int-to-float p1, p1

    .line 52
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->l:F

    .line 53
    .line 54
    sget p1, Lcom/xuexiang/xui/R$styleable;->LoadingView_lv_auto:I

    .line 55
    .line 56
    const/4 v0, 0x1

    .line 57
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->a:Z

    .line 62
    .line 63
    sget p1, Lcom/xuexiang/xui/R$styleable;->LoadingView_lv_arc_single:I

    .line 64
    .line 65
    invoke-virtual {p2, p1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->e:Z

    .line 70
    .line 71
    if-eqz p1, :cond_0

    .line 72
    .line 73
    const/16 p1, 0x118

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    const/16 p1, 0xa0

    .line 77
    .line 78
    :goto_0
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->j:I

    .line 79
    .line 80
    sget p1, Lcom/xuexiang/xui/R$styleable;->LoadingView_lv_has_icon:I

    .line 81
    .line 82
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-eqz p1, :cond_2

    .line 87
    .line 88
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 89
    .line 90
    .line 91
    sget p1, Lcom/xuexiang/xui/R$styleable;->LoadingView_lv_icon:I

    .line 92
    .line 93
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    if-eqz p1, :cond_1

    .line 98
    .line 99
    invoke-static {p1}, Lt6/a;->c(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->n:Landroid/graphics/Bitmap;

    .line 104
    .line 105
    sget p1, Lcom/xuexiang/xui/R$styleable;->LoadingView_lv_icon_scale:I

    .line 106
    .line 107
    const/high16 v1, 0x3f000000    # 0.5f

    .line 108
    .line 109
    invoke-virtual {p2, p1, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->o:F

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_1
    invoke-static {}, Lkotlin/collections/u;->t()V

    .line 117
    .line 118
    .line 119
    const/4 p1, 0x0

    .line 120
    throw p1

    .line 121
    :cond_2
    :goto_1
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 122
    .line 123
    .line 124
    new-instance p1, Landroid/graphics/Paint;

    .line 125
    .line 126
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 127
    .line 128
    .line 129
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->b:Landroid/graphics/Paint;

    .line 130
    .line 131
    iget p2, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->d:I

    .line 132
    .line 133
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 134
    .line 135
    .line 136
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->b:Landroid/graphics/Paint;

    .line 137
    .line 138
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 139
    .line 140
    .line 141
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->b:Landroid/graphics/Paint;

    .line 142
    .line 143
    sget-object p2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 144
    .line 145
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 146
    .line 147
    .line 148
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->b:Landroid/graphics/Paint;

    .line 149
    .line 150
    iget v1, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->c:I

    .line 151
    .line 152
    int-to-float v1, v1

    .line 153
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 154
    .line 155
    .line 156
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->b:Landroid/graphics/Paint;

    .line 157
    .line 158
    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 159
    .line 160
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 161
    .line 162
    .line 163
    new-instance p1, Landroid/graphics/Paint;

    .line 164
    .line 165
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 166
    .line 167
    .line 168
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->p:Landroid/graphics/Paint;

    .line 169
    .line 170
    iget v2, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->d:I

    .line 171
    .line 172
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 173
    .line 174
    .line 175
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->p:Landroid/graphics/Paint;

    .line 176
    .line 177
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 178
    .line 179
    .line 180
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->p:Landroid/graphics/Paint;

    .line 181
    .line 182
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 183
    .line 184
    .line 185
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->p:Landroid/graphics/Paint;

    .line 186
    .line 187
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 188
    .line 189
    .line 190
    return-void
.end method

.method public getLoadingColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 13

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->a:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->n:Landroid/graphics/Bitmap;

    .line 10
    .line 11
    const/high16 v1, 0x40000000    # 2.0f

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    int-to-float v2, v2

    .line 20
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    int-to-float v3, v3

    .line 25
    cmpl-float v4, v2, v3

    .line 26
    .line 27
    if-ltz v4, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    int-to-float v4, v4

    .line 34
    div-float/2addr v4, v2

    .line 35
    mul-float/2addr v4, v3

    .line 36
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    int-to-float v2, v2

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    int-to-float v4, v4

    .line 47
    div-float/2addr v4, v3

    .line 48
    mul-float/2addr v2, v4

    .line 49
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    int-to-float v4, v3

    .line 54
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    int-to-float v3, v3

    .line 59
    iget v5, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->o:F

    .line 60
    .line 61
    invoke-static {v2, v5, v3, v1}, Landroidx/compose/material3/c;->a(FFFF)F

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    int-to-float v3, v3

    .line 70
    iget v5, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->o:F

    .line 71
    .line 72
    invoke-static {v4, v5, v3, v1}, Landroidx/compose/material3/c;->a(FFFF)F

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    int-to-float v4, v4

    .line 81
    sub-float/2addr v4, v2

    .line 82
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    int-to-float v5, v5

    .line 87
    sub-float/2addr v5, v3

    .line 88
    new-instance v6, Landroid/graphics/RectF;

    .line 89
    .line 90
    invoke-direct {v6, v2, v3, v4, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 91
    .line 92
    .line 93
    iget-object v2, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->p:Landroid/graphics/Paint;

    .line 94
    .line 95
    const/4 v3, 0x0

    .line 96
    invoke-virtual {p1, v0, v3, v6, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 97
    .line 98
    .line 99
    :cond_2
    iget-object v8, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->f:Landroid/graphics/RectF;

    .line 100
    .line 101
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->g:I

    .line 102
    .line 103
    int-to-float v9, v0

    .line 104
    iget v10, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->i:F

    .line 105
    .line 106
    const/4 v11, 0x0

    .line 107
    iget-object v12, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->b:Landroid/graphics/Paint;

    .line 108
    .line 109
    move-object v7, p1

    .line 110
    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 111
    .line 112
    .line 113
    move-object v2, v7

    .line 114
    iget p1, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->g:I

    .line 115
    .line 116
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->k:I

    .line 117
    .line 118
    add-int/2addr p1, v0

    .line 119
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->g:I

    .line 120
    .line 121
    const/16 v0, 0x168

    .line 122
    .line 123
    if-le p1, v0, :cond_3

    .line 124
    .line 125
    sub-int/2addr p1, v0

    .line 126
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->g:I

    .line 127
    .line 128
    :cond_3
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->e:Z

    .line 129
    .line 130
    if-nez p1, :cond_4

    .line 131
    .line 132
    iget-object v3, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->f:Landroid/graphics/RectF;

    .line 133
    .line 134
    iget p1, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->h:I

    .line 135
    .line 136
    int-to-float v4, p1

    .line 137
    iget v5, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->i:F

    .line 138
    .line 139
    const/4 v6, 0x0

    .line 140
    iget-object v7, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->b:Landroid/graphics/Paint;

    .line 141
    .line 142
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 143
    .line 144
    .line 145
    iget p1, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->h:I

    .line 146
    .line 147
    iget v2, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->k:I

    .line 148
    .line 149
    add-int/2addr p1, v2

    .line 150
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->h:I

    .line 151
    .line 152
    if-le p1, v0, :cond_4

    .line 153
    .line 154
    sub-int/2addr p1, v0

    .line 155
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->h:I

    .line 156
    .line 157
    :cond_4
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->m:Z

    .line 158
    .line 159
    if-eqz p1, :cond_5

    .line 160
    .line 161
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->i:F

    .line 162
    .line 163
    iget v1, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->j:I

    .line 164
    .line 165
    int-to-float v1, v1

    .line 166
    cmpg-float v1, v0, v1

    .line 167
    .line 168
    if-gez v1, :cond_6

    .line 169
    .line 170
    iget v1, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->l:F

    .line 171
    .line 172
    add-float/2addr v0, v1

    .line 173
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->i:F

    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_5
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->i:F

    .line 177
    .line 178
    iget v2, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->k:I

    .line 179
    .line 180
    int-to-float v2, v2

    .line 181
    cmpl-float v2, v0, v2

    .line 182
    .line 183
    if-lez v2, :cond_6

    .line 184
    .line 185
    iget v2, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->l:F

    .line 186
    .line 187
    mul-float/2addr v2, v1

    .line 188
    sub-float/2addr v0, v2

    .line 189
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->i:F

    .line 190
    .line 191
    :cond_6
    :goto_1
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->i:F

    .line 192
    .line 193
    iget v1, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->j:I

    .line 194
    .line 195
    int-to-float v1, v1

    .line 196
    cmpl-float v1, v0, v1

    .line 197
    .line 198
    if-gez v1, :cond_7

    .line 199
    .line 200
    iget v1, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->k:I

    .line 201
    .line 202
    int-to-float v1, v1

    .line 203
    cmpg-float v0, v0, v1

    .line 204
    .line 205
    if-gtz v0, :cond_8

    .line 206
    .line 207
    :cond_7
    xor-int/lit8 p1, p1, 0x1

    .line 208
    .line 209
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->m:Z

    .line 210
    .line 211
    :cond_8
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 212
    .line 213
    .line 214
    return-void
.end method

.method public final onSizeChanged(IIII)V
    .locals 3

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    const/high16 p3, 0x41200000    # 10.0f

    .line 5
    .line 6
    iput p3, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->i:F

    .line 7
    .line 8
    new-instance p3, Landroid/graphics/RectF;

    .line 9
    .line 10
    iget p4, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->c:I

    .line 11
    .line 12
    mul-int/lit8 v0, p4, 0x2

    .line 13
    .line 14
    int-to-float v0, v0

    .line 15
    mul-int/lit8 v1, p4, 0x2

    .line 16
    .line 17
    int-to-float v1, v1

    .line 18
    mul-int/lit8 v2, p4, 0x2

    .line 19
    .line 20
    sub-int/2addr p1, v2

    .line 21
    int-to-float p1, p1

    .line 22
    mul-int/lit8 p4, p4, 0x2

    .line 23
    .line 24
    sub-int/2addr p2, p4

    .line 25
    int-to-float p2, p2

    .line 26
    invoke-direct {p3, v0, v1, p1, p2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 27
    .line 28
    .line 29
    iput-object p3, p0, Lcom/xuexiang/xui/widget/progress/loading/RotateLoadingView;->f:Landroid/graphics/RectF;

    .line 30
    .line 31
    return-void
.end method
