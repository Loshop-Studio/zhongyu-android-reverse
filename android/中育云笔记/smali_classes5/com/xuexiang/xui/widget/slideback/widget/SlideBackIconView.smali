.class public Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field public c:Landroid/graphics/Path;

.field public d:Landroid/graphics/Path;

.field public e:Landroid/graphics/Paint;

.field public f:Landroid/graphics/Paint;

.field public g:I

.field public h:F

.field public i:F

.field public j:F

.field public k:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

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
    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/high16 p1, -0x1000000

    .line 4
    iput p1, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->g:I

    const/4 p1, 0x0

    .line 5
    iput p1, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->h:F

    const/high16 p2, 0x41200000    # 10.0f

    .line 6
    iput p2, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->i:F

    .line 7
    iput p1, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->j:F

    .line 8
    iput p1, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->k:F

    .line 9
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->a()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->c:Landroid/graphics/Path;

    .line 7
    .line 8
    new-instance v0, Landroid/graphics/Path;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->d:Landroid/graphics/Path;

    .line 14
    .line 15
    new-instance v0, Landroid/graphics/Paint;

    .line 16
    .line 17
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->e:Landroid/graphics/Paint;

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->e:Landroid/graphics/Paint;

    .line 27
    .line 28
    sget-object v2, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    .line 29
    .line 30
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->e:Landroid/graphics/Paint;

    .line 34
    .line 35
    iget v2, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->g:I

    .line 36
    .line 37
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->e:Landroid/graphics/Paint;

    .line 41
    .line 42
    const/high16 v2, 0x3f800000    # 1.0f

    .line 43
    .line 44
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 45
    .line 46
    .line 47
    new-instance v0, Landroid/graphics/Paint;

    .line 48
    .line 49
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object v0, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->f:Landroid/graphics/Paint;

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->f:Landroid/graphics/Paint;

    .line 58
    .line 59
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->f:Landroid/graphics/Paint;

    .line 65
    .line 66
    const/4 v1, -0x1

    .line 67
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 68
    .line 69
    .line 70
    iget-object v0, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->f:Landroid/graphics/Paint;

    .line 71
    .line 72
    const/high16 v1, 0x41000000    # 8.0f

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 75
    .line 76
    .line 77
    iget-object v0, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->f:Landroid/graphics/Paint;

    .line 78
    .line 79
    sget-object v1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 82
    .line 83
    .line 84
    const/4 v0, 0x0

    .line 85
    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public getBackViewHeight()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->h:F

    .line 2
    .line 3
    return v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 6
    .line 7
    .line 8
    iget-object v2, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->c:Landroid/graphics/Path;

    .line 9
    .line 10
    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    .line 11
    .line 12
    .line 13
    iget-object v2, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->c:Landroid/graphics/Path;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-virtual {v2, v3, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 17
    .line 18
    .line 19
    iget-object v4, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->c:Landroid/graphics/Path;

    .line 20
    .line 21
    iget v2, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->h:F

    .line 22
    .line 23
    const/high16 v11, 0x40000000    # 2.0f

    .line 24
    .line 25
    mul-float v5, v2, v11

    .line 26
    .line 27
    const/high16 v12, 0x41100000    # 9.0f

    .line 28
    .line 29
    div-float v6, v5, v12

    .line 30
    .line 31
    iget v7, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->k:F

    .line 32
    .line 33
    const/high16 v13, 0x40400000    # 3.0f

    .line 34
    .line 35
    div-float v8, v2, v13

    .line 36
    .line 37
    div-float v10, v2, v11

    .line 38
    .line 39
    const/4 v5, 0x0

    .line 40
    move v9, v7

    .line 41
    invoke-virtual/range {v4 .. v10}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 42
    .line 43
    .line 44
    iget-object v14, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->c:Landroid/graphics/Path;

    .line 45
    .line 46
    iget v15, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->k:F

    .line 47
    .line 48
    iget v2, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->h:F

    .line 49
    .line 50
    mul-float v4, v2, v11

    .line 51
    .line 52
    div-float v16, v4, v13

    .line 53
    .line 54
    const/high16 v4, 0x40e00000    # 7.0f

    .line 55
    .line 56
    mul-float/2addr v4, v2

    .line 57
    div-float v18, v4, v12

    .line 58
    .line 59
    const/16 v19, 0x0

    .line 60
    .line 61
    const/16 v17, 0x0

    .line 62
    .line 63
    move/from16 v20, v2

    .line 64
    .line 65
    invoke-virtual/range {v14 .. v20}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 66
    .line 67
    .line 68
    iget-object v2, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->c:Landroid/graphics/Path;

    .line 69
    .line 70
    iget-object v4, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->e:Landroid/graphics/Paint;

    .line 71
    .line 72
    invoke-virtual {v1, v2, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 73
    .line 74
    .line 75
    iget v2, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->k:F

    .line 76
    .line 77
    iget v4, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->j:F

    .line 78
    .line 79
    div-float/2addr v2, v4

    .line 80
    const/high16 v4, 0x3f400000    # 0.75f

    .line 81
    .line 82
    cmpg-float v5, v2, v4

    .line 83
    .line 84
    if-gez v5, :cond_0

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_0
    sub-float v3, v2, v4

    .line 88
    .line 89
    mul-float/2addr v3, v11

    .line 90
    :goto_0
    iget-object v4, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->d:Landroid/graphics/Path;

    .line 91
    .line 92
    invoke-virtual {v4}, Landroid/graphics/Path;->reset()V

    .line 93
    .line 94
    .line 95
    iget-object v4, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->d:Landroid/graphics/Path;

    .line 96
    .line 97
    iget v5, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->k:F

    .line 98
    .line 99
    div-float/2addr v5, v11

    .line 100
    iget v6, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->i:F

    .line 101
    .line 102
    mul-float v7, v6, v3

    .line 103
    .line 104
    add-float/2addr v5, v7

    .line 105
    iget v7, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->h:F

    .line 106
    .line 107
    div-float/2addr v7, v11

    .line 108
    mul-float/2addr v6, v2

    .line 109
    sub-float/2addr v7, v6

    .line 110
    invoke-virtual {v4, v5, v7}, Landroid/graphics/Path;->moveTo(FF)V

    .line 111
    .line 112
    .line 113
    iget-object v4, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->d:Landroid/graphics/Path;

    .line 114
    .line 115
    iget v5, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->k:F

    .line 116
    .line 117
    div-float/2addr v5, v11

    .line 118
    iget v6, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->i:F

    .line 119
    .line 120
    mul-float/2addr v6, v3

    .line 121
    sub-float/2addr v5, v6

    .line 122
    iget v6, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->h:F

    .line 123
    .line 124
    div-float/2addr v6, v11

    .line 125
    invoke-virtual {v4, v5, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 126
    .line 127
    .line 128
    iget-object v4, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->d:Landroid/graphics/Path;

    .line 129
    .line 130
    iget v5, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->k:F

    .line 131
    .line 132
    div-float/2addr v5, v11

    .line 133
    iget v6, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->i:F

    .line 134
    .line 135
    mul-float/2addr v3, v6

    .line 136
    add-float/2addr v5, v3

    .line 137
    iget v3, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->h:F

    .line 138
    .line 139
    div-float/2addr v3, v11

    .line 140
    mul-float/2addr v2, v6

    .line 141
    add-float/2addr v3, v2

    .line 142
    invoke-virtual {v4, v5, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 143
    .line 144
    .line 145
    iget-object v2, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->d:Landroid/graphics/Path;

    .line 146
    .line 147
    iget-object v3, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->f:Landroid/graphics/Paint;

    .line 148
    .line 149
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 150
    .line 151
    .line 152
    iget v1, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->k:F

    .line 153
    .line 154
    iget v2, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->j:F

    .line 155
    .line 156
    div-float/2addr v1, v2

    .line 157
    const v2, 0x3e4ccccd    # 0.2f

    .line 158
    .line 159
    .line 160
    sub-float/2addr v1, v2

    .line 161
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 162
    .line 163
    .line 164
    return-void
.end method

.method public setArrowSize(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->i:F

    .line 2
    .line 3
    return-void
.end method

.method public setBackViewColor(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->g:I

    .line 2
    .line 3
    return-void
.end method

.method public setBackViewHeight(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->h:F

    .line 2
    .line 3
    return-void
.end method

.method public setMaxSlideLength(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->j:F

    .line 2
    .line 3
    return-void
.end method
