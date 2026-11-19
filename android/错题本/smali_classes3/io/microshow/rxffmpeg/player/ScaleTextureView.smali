.class public Lio/microshow/rxffmpeg/player/ScaleTextureView;
.super Landroid/view/TextureView;
.source "SourceFile"


# instance fields
.field public a:F

.field public b:F

.field public c:F

.field public d:F

.field public e:F

.field public f:F

.field public g:F

.field public h:F

.field public i:I

.field public j:Z

.field public k:Z

.field public l:Z


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
    iput p1, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->c:F

    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->j:Z

    .line 6
    iput-boolean p1, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->k:Z

    .line 7
    iput-boolean p1, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->l:Z

    .line 8
    invoke-virtual {p0, p1}, Landroid/view/View;->setClickable(Z)V

    return-void
.end method

.method public static a(Landroid/view/MotionEvent;)F
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/MotionEvent;->getX(I)F

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-virtual {p0, v2}, Landroid/view/MotionEvent;->getX(I)F

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    sub-float/2addr v1, v3

    .line 12
    invoke-virtual {p0, v0}, Landroid/view/MotionEvent;->getY(I)F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p0, v2}, Landroid/view/MotionEvent;->getY(I)F

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    sub-float/2addr v0, p0

    .line 21
    mul-float/2addr v1, v1

    .line 22
    mul-float/2addr v0, v0

    .line 23
    add-float/2addr v0, v1

    .line 24
    float-to-double v0, v0

    .line 25
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    double-to-float p0, v0

    .line 30
    return p0
.end method


# virtual methods
.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    iget-boolean v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->j:Z

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
    const/4 v2, 0x0

    .line 15
    if-eq v0, v1, :cond_5

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    if-eq v0, v3, :cond_1

    .line 19
    .line 20
    const/4 v4, 0x5

    .line 21
    if-eq v0, v4, :cond_0

    .line 22
    .line 23
    const/4 v1, 0x6

    .line 24
    if-eq v0, v1, :cond_5

    .line 25
    .line 26
    goto/16 :goto_0

    .line 27
    .line 28
    :cond_0
    iput v3, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->i:I

    .line 29
    .line 30
    invoke-static {p1}, Lio/microshow/rxffmpeg/player/ScaleTextureView;->a(Landroid/view/MotionEvent;)F

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iput v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->g:F

    .line 35
    .line 36
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getX(I)F

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    sub-float/2addr v0, v3

    .line 45
    float-to-double v3, v0

    .line 46
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getY(I)F

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    sub-float/2addr v0, v1

    .line 55
    float-to-double v0, v0

    .line 56
    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->atan2(DD)D

    .line 57
    .line 58
    .line 59
    move-result-wide v0

    .line 60
    invoke-static {v0, v1}, Ljava/lang/Math;->toDegrees(D)D

    .line 61
    .line 62
    .line 63
    move-result-wide v0

    .line 64
    double-to-float v0, v0

    .line 65
    iput v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->h:F

    .line 66
    .line 67
    goto/16 :goto_0

    .line 68
    .line 69
    :cond_1
    iget v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->i:I

    .line 70
    .line 71
    if-ne v0, v1, :cond_2

    .line 72
    .line 73
    iget-boolean v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->l:Z

    .line 74
    .line 75
    if-eqz v0, :cond_7

    .line 76
    .line 77
    iget v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->a:F

    .line 78
    .line 79
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    add-float/2addr v1, v0

    .line 84
    iget v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->e:F

    .line 85
    .line 86
    sub-float/2addr v1, v0

    .line 87
    iput v1, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->a:F

    .line 88
    .line 89
    iget v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->b:F

    .line 90
    .line 91
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    add-float/2addr v1, v0

    .line 96
    iget v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->f:F

    .line 97
    .line 98
    sub-float/2addr v1, v0

    .line 99
    iput v1, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->b:F

    .line 100
    .line 101
    iget v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->a:F

    .line 102
    .line 103
    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationX(F)V

    .line 104
    .line 105
    .line 106
    iget v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->b:F

    .line 107
    .line 108
    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    iput v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->e:F

    .line 116
    .line 117
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    iput v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->f:F

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_2
    if-ne v0, v3, :cond_7

    .line 125
    .line 126
    iget v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->c:F

    .line 127
    .line 128
    invoke-static {p1}, Lio/microshow/rxffmpeg/player/ScaleTextureView;->a(Landroid/view/MotionEvent;)F

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    mul-float/2addr v3, v0

    .line 133
    iget v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->g:F

    .line 134
    .line 135
    div-float/2addr v3, v0

    .line 136
    iput v3, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->c:F

    .line 137
    .line 138
    invoke-virtual {p0, v3}, Landroid/view/View;->setScaleX(F)V

    .line 139
    .line 140
    .line 141
    iget v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->c:F

    .line 142
    .line 143
    invoke-virtual {p0, v0}, Landroid/view/View;->setScaleY(F)V

    .line 144
    .line 145
    .line 146
    iget-boolean v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->k:Z

    .line 147
    .line 148
    if-eqz v0, :cond_7

    .line 149
    .line 150
    iget v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->d:F

    .line 151
    .line 152
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getX(I)F

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    sub-float/2addr v3, v4

    .line 161
    float-to-double v3, v3

    .line 162
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getY(I)F

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    sub-float/2addr v2, v1

    .line 171
    float-to-double v1, v2

    .line 172
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->atan2(DD)D

    .line 173
    .line 174
    .line 175
    move-result-wide v1

    .line 176
    invoke-static {v1, v2}, Ljava/lang/Math;->toDegrees(D)D

    .line 177
    .line 178
    .line 179
    move-result-wide v1

    .line 180
    double-to-float v1, v1

    .line 181
    add-float/2addr v1, v0

    .line 182
    iget v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->h:F

    .line 183
    .line 184
    sub-float/2addr v1, v0

    .line 185
    iput v1, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->d:F

    .line 186
    .line 187
    const/high16 v0, 0x43b40000    # 360.0f

    .line 188
    .line 189
    cmpl-float v2, v1, v0

    .line 190
    .line 191
    if-lez v2, :cond_3

    .line 192
    .line 193
    sub-float/2addr v1, v0

    .line 194
    iput v1, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->d:F

    .line 195
    .line 196
    :cond_3
    iget v1, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->d:F

    .line 197
    .line 198
    const/high16 v2, -0x3c4c0000    # -360.0f

    .line 199
    .line 200
    cmpg-float v2, v1, v2

    .line 201
    .line 202
    if-gez v2, :cond_4

    .line 203
    .line 204
    add-float/2addr v1, v0

    .line 205
    iput v1, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->d:F

    .line 206
    .line 207
    :cond_4
    iget v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->d:F

    .line 208
    .line 209
    invoke-virtual {p0, v0}, Landroid/view/View;->setRotation(F)V

    .line 210
    .line 211
    .line 212
    goto :goto_0

    .line 213
    :cond_5
    iput v2, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->i:I

    .line 214
    .line 215
    goto :goto_0

    .line 216
    :cond_6
    iput v1, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->i:I

    .line 217
    .line 218
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    iput v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->e:F

    .line 223
    .line 224
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    iput v0, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->f:F

    .line 229
    .line 230
    :cond_7
    :goto_0
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 231
    .line 232
    .line 233
    move-result p1

    .line 234
    return p1
.end method

.method public setEnabledRotation(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->k:Z

    .line 2
    .line 3
    return-void
.end method

.method public setEnabledTouch(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->j:Z

    .line 2
    .line 3
    return-void
.end method

.method public setEnabledTranslation(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lio/microshow/rxffmpeg/player/ScaleTextureView;->l:Z

    .line 2
    .line 3
    return-void
.end method
