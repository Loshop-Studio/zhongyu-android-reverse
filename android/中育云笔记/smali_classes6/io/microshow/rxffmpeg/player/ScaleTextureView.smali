.class public Lio/microshow/rxffmpeg/player/ScaleTextureView;
.super Landroid/view/TextureView;
.source "SourceFile"


# instance fields
.field public c:F

.field public d:F

.field public e:F

.field public f:F

.field public g:F

.field public h:F

.field public i:F

.field public j:F

.field public k:I

.field public l:Z

.field public m:Z

.field public n:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lio/microshow/rxffmpeg/player/ScaleTextureView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lio/microshow/rxffmpeg/player/ScaleTextureView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/TextureView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/high16 p1, 0x3f800000    # 1.0f

    .line 4
    iput p1, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->e:F

    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->l:Z

    .line 6
    iput-boolean p1, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->m:Z

    .line 7
    iput-boolean p1, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->n:Z

    .line 8
    invoke-virtual {p0, p1}, Landroid/view/View;->setClickable(Z)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/MotionEvent;)F
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getX(I)F

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    sub-float/2addr v1, v3

    .line 12
    float-to-double v3, v1

    .line 13
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getY(I)F

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    sub-float/2addr v0, p1

    .line 22
    float-to-double v0, v0

    .line 23
    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->atan2(DD)D

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    invoke-static {v0, v1}, Ljava/lang/Math;->toDegrees(D)D

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    double-to-float p1, v0

    .line 32
    return p1
.end method

.method public final b(Landroid/view/MotionEvent;)F
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getX(I)F

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    sub-float/2addr v1, v3

    .line 12
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getY(I)F

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    sub-float/2addr v0, p1

    .line 21
    mul-float/2addr v1, v1

    .line 22
    mul-float/2addr v0, v0

    .line 23
    add-float/2addr v1, v0

    .line 24
    float-to-double v0, v1

    .line 25
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    double-to-float p1, v0

    .line 30
    return p1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->l:Z

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    and-int/lit16 v0, v0, 0xff

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-eqz v0, :cond_6

    .line 13
    .line 14
    if-eq v0, v1, :cond_5

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    if-eq v0, v2, :cond_1

    .line 18
    .line 19
    const/4 v1, 0x5

    .line 20
    if-eq v0, v1, :cond_0

    .line 21
    .line 22
    const/4 v1, 0x6

    .line 23
    if-eq v0, v1, :cond_5

    .line 24
    .line 25
    goto/16 :goto_0

    .line 26
    .line 27
    :cond_0
    iput v2, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->k:I

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Lio/microshow/rxffmpeg/player/ScaleTextureView;->b(Landroid/view/MotionEvent;)F

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iput v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->i:F

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Lio/microshow/rxffmpeg/player/ScaleTextureView;->a(Landroid/view/MotionEvent;)F

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    iput v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->j:F

    .line 40
    .line 41
    goto/16 :goto_0

    .line 42
    .line 43
    :cond_1
    iget v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->k:I

    .line 44
    .line 45
    if-ne v0, v1, :cond_2

    .line 46
    .line 47
    iget-boolean v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->n:Z

    .line 48
    .line 49
    if-eqz v0, :cond_7

    .line 50
    .line 51
    iget v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->c:F

    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    add-float/2addr v0, v1

    .line 58
    iget v1, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->g:F

    .line 59
    .line 60
    sub-float/2addr v0, v1

    .line 61
    iput v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->c:F

    .line 62
    .line 63
    iget v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->d:F

    .line 64
    .line 65
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    add-float/2addr v0, v1

    .line 70
    iget v1, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->h:F

    .line 71
    .line 72
    sub-float/2addr v0, v1

    .line 73
    iput v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->d:F

    .line 74
    .line 75
    iget v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->c:F

    .line 76
    .line 77
    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationX(F)V

    .line 78
    .line 79
    .line 80
    iget v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->d:F

    .line 81
    .line 82
    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    iput v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->g:F

    .line 90
    .line 91
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    iput v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->h:F

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_2
    if-ne v0, v2, :cond_7

    .line 99
    .line 100
    iget v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->e:F

    .line 101
    .line 102
    invoke-virtual {p0, p1}, Lio/microshow/rxffmpeg/player/ScaleTextureView;->b(Landroid/view/MotionEvent;)F

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    mul-float/2addr v0, v1

    .line 107
    iget v1, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->i:F

    .line 108
    .line 109
    div-float/2addr v0, v1

    .line 110
    iput v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->e:F

    .line 111
    .line 112
    invoke-virtual {p0, v0}, Landroid/view/View;->setScaleX(F)V

    .line 113
    .line 114
    .line 115
    iget v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->e:F

    .line 116
    .line 117
    invoke-virtual {p0, v0}, Landroid/view/View;->setScaleY(F)V

    .line 118
    .line 119
    .line 120
    iget-boolean v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->m:Z

    .line 121
    .line 122
    if-eqz v0, :cond_7

    .line 123
    .line 124
    iget v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->f:F

    .line 125
    .line 126
    invoke-virtual {p0, p1}, Lio/microshow/rxffmpeg/player/ScaleTextureView;->a(Landroid/view/MotionEvent;)F

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    add-float/2addr v0, v1

    .line 131
    iget v1, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->j:F

    .line 132
    .line 133
    sub-float/2addr v0, v1

    .line 134
    iput v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->f:F

    .line 135
    .line 136
    const/high16 v1, 0x43b40000    # 360.0f

    .line 137
    .line 138
    cmpl-float v2, v0, v1

    .line 139
    .line 140
    if-lez v2, :cond_3

    .line 141
    .line 142
    sub-float/2addr v0, v1

    .line 143
    iput v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->f:F

    .line 144
    .line 145
    :cond_3
    iget v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->f:F

    .line 146
    .line 147
    const/high16 v2, -0x3c4c0000    # -360.0f

    .line 148
    .line 149
    cmpg-float v2, v0, v2

    .line 150
    .line 151
    if-gez v2, :cond_4

    .line 152
    .line 153
    add-float/2addr v0, v1

    .line 154
    iput v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->f:F

    .line 155
    .line 156
    :cond_4
    iget v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->f:F

    .line 157
    .line 158
    invoke-virtual {p0, v0}, Landroid/view/View;->setRotation(F)V

    .line 159
    .line 160
    .line 161
    goto :goto_0

    .line 162
    :cond_5
    const/4 v0, 0x0

    .line 163
    iput v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->k:I

    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_6
    iput v1, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->k:I

    .line 167
    .line 168
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    iput v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->g:F

    .line 173
    .line 174
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    iput v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->h:F

    .line 179
    .line 180
    :cond_7
    :goto_0
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 181
    .line 182
    .line 183
    move-result p1

    .line 184
    return p1
.end method

.method public setEnabledRotation(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->m:Z

    .line 2
    .line 3
    return-void
.end method

.method public setEnabledTouch(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->l:Z

    .line 2
    .line 3
    return-void
.end method

.method public setEnabledTranslation(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->n:Z

    .line 2
    .line 3
    return-void
.end method
