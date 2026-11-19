.class public Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;
.super Lcom/xuexiang/xui/widget/button/shadowbutton/BaseShadowButton;
.source "SourceFile"


# instance fields
.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:F

.field public l:F

.field public m:Landroid/graphics/Paint;

.field public n:Landroid/graphics/RectF;

.field public o:Landroid/graphics/Path;

.field public p:Ljava/util/Timer;

.field public q:Ljava/util/TimerTask;

.field public r:I


# virtual methods
.method public final b(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    iget v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->k:F

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    cmpl-float v0, v0, v1

    .line 7
    .line 8
    if-ltz v0, :cond_3

    .line 9
    .line 10
    iget v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->l:F

    .line 11
    .line 12
    cmpl-float v0, v0, v1

    .line 13
    .line 14
    if-ltz v0, :cond_3

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    iget v3, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->k:F

    .line 25
    .line 26
    int-to-float v4, v0

    .line 27
    sub-float/2addr v4, v3

    .line 28
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    iget v4, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->l:F

    .line 37
    .line 38
    int-to-float v5, v2

    .line 39
    sub-float/2addr v5, v4

    .line 40
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    invoke-static {v4, v5}, Ljava/lang/Math;->max(FF)F

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    mul-float/2addr v3, v3

    .line 49
    mul-float/2addr v4, v4

    .line 50
    add-float/2addr v3, v4

    .line 51
    float-to-double v3, v3

    .line 52
    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    .line 53
    .line 54
    .line 55
    move-result-wide v3

    .line 56
    double-to-float v3, v3

    .line 57
    iget v4, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->j:I

    .line 58
    .line 59
    int-to-float v5, v4

    .line 60
    cmpl-float v5, v5, v3

    .line 61
    .line 62
    if-lez v5, :cond_0

    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->c()V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_0
    iget v5, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->i:I

    .line 69
    .line 70
    int-to-float v5, v5

    .line 71
    div-float/2addr v3, v5

    .line 72
    const/high16 v5, 0x420c0000    # 35.0f

    .line 73
    .line 74
    mul-float/2addr v3, v5

    .line 75
    int-to-float v4, v4

    .line 76
    add-float/2addr v4, v3

    .line 77
    float-to-int v3, v4

    .line 78
    iput v3, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->j:I

    .line 79
    .line 80
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 81
    .line 82
    .line 83
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->o:Landroid/graphics/Path;

    .line 84
    .line 85
    invoke-virtual {v3}, Landroid/graphics/Path;->reset()V

    .line 86
    .line 87
    .line 88
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->o:Landroid/graphics/Path;

    .line 89
    .line 90
    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 91
    .line 92
    .line 93
    iget v3, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/BaseShadowButton;->d:I

    .line 94
    .line 95
    if-nez v3, :cond_1

    .line 96
    .line 97
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->o:Landroid/graphics/Path;

    .line 98
    .line 99
    shr-int/lit8 v0, v0, 0x1

    .line 100
    .line 101
    int-to-float v0, v0

    .line 102
    shr-int/lit8 v2, v2, 0x1

    .line 103
    .line 104
    int-to-float v2, v2

    .line 105
    iget v3, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/BaseShadowButton;->a:I

    .line 106
    .line 107
    shr-int/lit8 v3, v3, 0x1

    .line 108
    .line 109
    int-to-float v3, v3

    .line 110
    sget-object v4, Landroid/graphics/Path$Direction;->CCW:Landroid/graphics/Path$Direction;

    .line 111
    .line 112
    invoke-virtual {v1, v0, v2, v3, v4}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 113
    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->n:Landroid/graphics/RectF;

    .line 117
    .line 118
    iget v2, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/BaseShadowButton;->a:I

    .line 119
    .line 120
    int-to-float v2, v2

    .line 121
    iget v3, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/BaseShadowButton;->b:I

    .line 122
    .line 123
    int-to-float v3, v3

    .line 124
    invoke-virtual {v0, v1, v1, v2, v3}, Landroid/graphics/RectF;->set(FFFF)V

    .line 125
    .line 126
    .line 127
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->o:Landroid/graphics/Path;

    .line 128
    .line 129
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->n:Landroid/graphics/RectF;

    .line 130
    .line 131
    iget v2, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->g:I

    .line 132
    .line 133
    int-to-float v3, v2

    .line 134
    int-to-float v2, v2

    .line 135
    sget-object v4, Landroid/graphics/Path$Direction;->CCW:Landroid/graphics/Path$Direction;

    .line 136
    .line 137
    invoke-virtual {v0, v1, v3, v2, v4}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Path$Direction;)V

    .line 138
    .line 139
    .line 140
    :goto_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 141
    .line 142
    const/16 v1, 0x1a

    .line 143
    .line 144
    if-lt v0, v1, :cond_2

    .line 145
    .line 146
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->o:Landroid/graphics/Path;

    .line 147
    .line 148
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 149
    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->o:Landroid/graphics/Path;

    .line 153
    .line 154
    sget-object v1, Landroid/graphics/Region$Op;->REPLACE:Landroid/graphics/Region$Op;

    .line 155
    .line 156
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z

    .line 157
    .line 158
    .line 159
    :goto_1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->k:F

    .line 160
    .line 161
    iget v1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->l:F

    .line 162
    .line 163
    iget v2, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->j:I

    .line 164
    .line 165
    int-to-float v2, v2

    .line 166
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->m:Landroid/graphics/Paint;

    .line 167
    .line 168
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 172
    .line 173
    .line 174
    :cond_3
    return-void
.end method

.method public final c()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->p:Ljava/util/Timer;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->q:Ljava/util/TimerTask;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/TimerTask;->cancel()Z

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->p:Ljava/util/Timer;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 15
    .line 16
    .line 17
    :cond_1
    const/4 v0, 0x0

    .line 18
    iput v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->j:I

    .line 19
    .line 20
    return-void
.end method

.method public final d()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->c()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton$a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton$a;-><init>(Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->q:Ljava/util/TimerTask;

    .line 10
    .line 11
    new-instance v1, Ljava/util/Timer;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/Timer;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->p:Ljava/util/Timer;

    .line 17
    .line 18
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->q:Ljava/util/TimerTask;

    .line 19
    .line 20
    const-wide/16 v3, 0x0

    .line 21
    .line 22
    const-wide/16 v5, 0x1e

    .line 23
    .line 24
    invoke-virtual/range {v1 .. v6}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public getRippleAlpha()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->r:I

    .line 2
    .line 3
    return v0
.end method

.method public getRippleColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public getRippleDuration()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->i:I

    .line 2
    .line 3
    return v0
.end method

.method public getRippleRadius()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->j:I

    .line 2
    .line 3
    return v0
.end method

.method public getRoundRadius()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public onDetachedFromWindow()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->c()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Landroid/widget/Button;->onDetachedFromWindow()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/xuexiang/xui/widget/button/shadowbutton/BaseShadowButton;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->m:Landroid/graphics/Paint;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->b(Landroid/graphics/Canvas;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iput v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->k:F

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iput v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->l:F

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->d()V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/Button;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1
.end method

.method public setRippleAlpha(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->r:I

    .line 2
    .line 3
    return-void
.end method

.method public setRippleColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->h:I

    .line 2
    .line 3
    return-void
.end method

.method public setRippleDuration(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->i:I

    .line 2
    .line 3
    return-void
.end method

.method public setRippleRadius(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->j:I

    .line 2
    .line 3
    return-void
.end method

.method public setRoundRadius(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->g:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
