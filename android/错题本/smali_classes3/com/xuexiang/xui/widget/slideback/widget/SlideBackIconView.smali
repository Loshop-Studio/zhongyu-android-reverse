.class public Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field public final a:Landroid/graphics/Path;

.field public final b:Landroid/graphics/Path;

.field public final c:Landroid/graphics/Paint;

.field public final d:Landroid/graphics/Paint;

.field public e:I

.field public f:F

.field public g:F

.field public h:F


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
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/high16 p1, -0x1000000

    .line 4
    iput p1, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->e:I

    const/4 p1, 0x0

    .line 5
    iput p1, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->f:F

    const/high16 p2, 0x41200000    # 10.0f

    .line 6
    iput p2, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->g:F

    .line 7
    iput p1, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->h:F

    .line 8
    new-instance p2, Landroid/graphics/Path;

    invoke-direct {p2}, Landroid/graphics/Path;-><init>()V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->a:Landroid/graphics/Path;

    .line 9
    new-instance p2, Landroid/graphics/Path;

    invoke-direct {p2}, Landroid/graphics/Path;-><init>()V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->b:Landroid/graphics/Path;

    .line 10
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->c:Landroid/graphics/Paint;

    const/4 p3, 0x1

    .line 11
    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 12
    iget-object p2, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->c:Landroid/graphics/Paint;

    sget-object v0, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 13
    iget-object p2, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->c:Landroid/graphics/Paint;

    iget v0, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->e:I

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 14
    iget-object p2, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->c:Landroid/graphics/Paint;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 15
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->d:Landroid/graphics/Paint;

    .line 16
    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 17
    iget-object p2, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->d:Landroid/graphics/Paint;

    sget-object p3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 18
    iget-object p2, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->d:Landroid/graphics/Paint;

    const/4 p3, -0x1

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 19
    iget-object p2, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->d:Landroid/graphics/Paint;

    const/high16 p3, 0x41000000    # 8.0f

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 20
    iget-object p2, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->d:Landroid/graphics/Paint;

    sget-object p3, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 21
    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method


# virtual methods
.method public getBackViewHeight()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->f:F

    .line 2
    .line 3
    return v0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
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
    iget-object v2, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->a:Landroid/graphics/Path;

    .line 9
    .line 10
    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    .line 11
    .line 12
    .line 13
    iget-object v2, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->a:Landroid/graphics/Path;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-virtual {v2, v3, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 17
    .line 18
    .line 19
    iget v2, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->f:F

    .line 20
    .line 21
    const/high16 v4, 0x40000000    # 2.0f

    .line 22
    .line 23
    mul-float v5, v2, v4

    .line 24
    .line 25
    const/high16 v6, 0x41100000    # 9.0f

    .line 26
    .line 27
    div-float v9, v5, v6

    .line 28
    .line 29
    const/high16 v5, 0x40400000    # 3.0f

    .line 30
    .line 31
    div-float v11, v2, v5

    .line 32
    .line 33
    const/4 v12, 0x0

    .line 34
    div-float v13, v2, v4

    .line 35
    .line 36
    iget-object v7, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->a:Landroid/graphics/Path;

    .line 37
    .line 38
    const/4 v8, 0x0

    .line 39
    const/4 v10, 0x0

    .line 40
    invoke-virtual/range {v7 .. v13}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 41
    .line 42
    .line 43
    iget v2, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->f:F

    .line 44
    .line 45
    mul-float v7, v2, v4

    .line 46
    .line 47
    div-float v16, v7, v5

    .line 48
    .line 49
    const/high16 v5, 0x40e00000    # 7.0f

    .line 50
    .line 51
    mul-float/2addr v5, v2

    .line 52
    div-float v18, v5, v6

    .line 53
    .line 54
    const/16 v19, 0x0

    .line 55
    .line 56
    iget-object v14, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->a:Landroid/graphics/Path;

    .line 57
    .line 58
    const/4 v15, 0x0

    .line 59
    const/16 v17, 0x0

    .line 60
    .line 61
    move/from16 v20, v2

    .line 62
    .line 63
    invoke-virtual/range {v14 .. v20}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 64
    .line 65
    .line 66
    iget-object v2, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->a:Landroid/graphics/Path;

    .line 67
    .line 68
    iget-object v5, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->c:Landroid/graphics/Paint;

    .line 69
    .line 70
    invoke-virtual {v1, v2, v5}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 71
    .line 72
    .line 73
    iget v2, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->h:F

    .line 74
    .line 75
    div-float v2, v3, v2

    .line 76
    .line 77
    const/high16 v5, 0x3f400000    # 0.75f

    .line 78
    .line 79
    cmpg-float v6, v2, v5

    .line 80
    .line 81
    if-gez v6, :cond_0

    .line 82
    .line 83
    move v5, v3

    .line 84
    goto :goto_0

    .line 85
    :cond_0
    sub-float v5, v2, v5

    .line 86
    .line 87
    mul-float/2addr v5, v4

    .line 88
    :goto_0
    iget-object v6, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->b:Landroid/graphics/Path;

    .line 89
    .line 90
    invoke-virtual {v6}, Landroid/graphics/Path;->reset()V

    .line 91
    .line 92
    .line 93
    iget v6, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->g:F

    .line 94
    .line 95
    mul-float v7, v6, v5

    .line 96
    .line 97
    add-float/2addr v7, v3

    .line 98
    iget v8, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->f:F

    .line 99
    .line 100
    div-float/2addr v8, v4

    .line 101
    mul-float/2addr v6, v2

    .line 102
    sub-float/2addr v8, v6

    .line 103
    iget-object v6, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->b:Landroid/graphics/Path;

    .line 104
    .line 105
    invoke-virtual {v6, v7, v8}, Landroid/graphics/Path;->moveTo(FF)V

    .line 106
    .line 107
    .line 108
    iget v6, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->g:F

    .line 109
    .line 110
    mul-float/2addr v6, v5

    .line 111
    sub-float v6, v3, v6

    .line 112
    .line 113
    iget v7, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->f:F

    .line 114
    .line 115
    div-float/2addr v7, v4

    .line 116
    iget-object v8, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->b:Landroid/graphics/Path;

    .line 117
    .line 118
    invoke-virtual {v8, v6, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 119
    .line 120
    .line 121
    iget v6, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->g:F

    .line 122
    .line 123
    mul-float/2addr v5, v6

    .line 124
    add-float/2addr v5, v3

    .line 125
    iget v7, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->f:F

    .line 126
    .line 127
    div-float/2addr v7, v4

    .line 128
    mul-float/2addr v2, v6

    .line 129
    add-float/2addr v2, v7

    .line 130
    iget-object v4, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->b:Landroid/graphics/Path;

    .line 131
    .line 132
    invoke-virtual {v4, v5, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 133
    .line 134
    .line 135
    iget-object v2, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->b:Landroid/graphics/Path;

    .line 136
    .line 137
    iget-object v4, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->d:Landroid/graphics/Paint;

    .line 138
    .line 139
    invoke-virtual {v1, v2, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 140
    .line 141
    .line 142
    iget v1, v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->h:F

    .line 143
    .line 144
    div-float/2addr v3, v1

    .line 145
    const v1, 0x3e4ccccd    # 0.2f

    .line 146
    .line 147
    .line 148
    sub-float/2addr v3, v1

    .line 149
    invoke-virtual {v0, v3}, Landroid/view/View;->setAlpha(F)V

    .line 150
    .line 151
    .line 152
    return-void
.end method

.method public setArrowSize(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->g:F

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
    iput p1, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->e:I

    .line 2
    .line 3
    return-void
.end method

.method public setBackViewHeight(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->f:F

    .line 2
    .line 3
    return-void
.end method

.method public setMaxSlideLength(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->h:F

    .line 2
    .line 3
    return-void
.end method
