.class public Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->s(Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/Float;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {v0, p1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->i(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;F)F

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 17
    .line 18
    invoke-static {p1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->j(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    const/high16 v0, 0x40000000    # 2.0f

    .line 23
    .line 24
    const/high16 v1, 0x40400000    # 3.0f

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 29
    .line 30
    invoke-static {p1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->j(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-lez p1, :cond_0

    .line 35
    .line 36
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 37
    .line 38
    invoke-static {p1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->l(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)Landroid/graphics/Paint;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 43
    .line 44
    invoke-static {v2}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->j(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    int-to-float v2, v2

    .line 49
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 50
    .line 51
    invoke-static {v3}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->k(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 56
    .line 57
    invoke-static {v4}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->h(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    sub-float/2addr v3, v4

    .line 62
    mul-float/2addr v2, v3

    .line 63
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 64
    .line 65
    .line 66
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 67
    .line 68
    invoke-static {p1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->m(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)Landroid/graphics/Paint;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 73
    .line 74
    invoke-static {v2}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->j(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    int-to-float v2, v2

    .line 79
    div-float/2addr v2, v1

    .line 80
    mul-float/2addr v2, v0

    .line 81
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 82
    .line 83
    invoke-static {v0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->k(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 88
    .line 89
    invoke-static {v3}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->h(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    sub-float/2addr v0, v3

    .line 94
    mul-float/2addr v2, v0

    .line 95
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 100
    .line 101
    invoke-static {p1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->l(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)Landroid/graphics/Paint;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 106
    .line 107
    invoke-static {v2}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->n(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    int-to-float v2, v2

    .line 112
    div-float/2addr v2, v0

    .line 113
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 114
    .line 115
    invoke-static {v0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->k(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 120
    .line 121
    invoke-static {v3}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->h(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    sub-float/2addr v0, v3

    .line 126
    mul-float/2addr v2, v0

    .line 127
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 128
    .line 129
    .line 130
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 131
    .line 132
    invoke-static {p1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->m(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)Landroid/graphics/Paint;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 137
    .line 138
    invoke-static {v0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->n(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    int-to-float v0, v0

    .line 143
    div-float/2addr v0, v1

    .line 144
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 145
    .line 146
    invoke-static {v2}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->k(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 151
    .line 152
    invoke-static {v3}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->h(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    sub-float/2addr v2, v3

    .line 157
    mul-float/2addr v0, v2

    .line 158
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 159
    .line 160
    .line 161
    :goto_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 162
    .line 163
    invoke-static {p1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->d(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)Landroid/graphics/RectF;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 168
    .line 169
    invoke-static {v0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->o(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    int-to-float v0, v0

    .line 174
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 175
    .line 176
    invoke-static {v2}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->n(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    int-to-float v2, v2

    .line 181
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 182
    .line 183
    invoke-static {v3}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->k(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    sub-float v3, v1, v3

    .line 188
    .line 189
    div-float/2addr v2, v3

    .line 190
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 191
    .line 192
    invoke-static {v3}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->h(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    mul-float/2addr v2, v3

    .line 197
    sub-float/2addr v0, v2

    .line 198
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 199
    .line 200
    invoke-static {v2}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->p(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    int-to-float v2, v2

    .line 205
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 206
    .line 207
    invoke-static {v3}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->c(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    int-to-float v3, v3

    .line 212
    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 213
    .line 214
    invoke-static {v4}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->k(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    .line 215
    .line 216
    .line 217
    move-result v4

    .line 218
    sub-float v4, v1, v4

    .line 219
    .line 220
    div-float/2addr v3, v4

    .line 221
    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 222
    .line 223
    invoke-static {v4}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->h(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    .line 224
    .line 225
    .line 226
    move-result v4

    .line 227
    mul-float/2addr v3, v4

    .line 228
    sub-float/2addr v2, v3

    .line 229
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 230
    .line 231
    invoke-static {v3}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->o(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I

    .line 232
    .line 233
    .line 234
    move-result v3

    .line 235
    int-to-float v3, v3

    .line 236
    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 237
    .line 238
    invoke-static {v4}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->n(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I

    .line 239
    .line 240
    .line 241
    move-result v4

    .line 242
    int-to-float v4, v4

    .line 243
    iget-object v5, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 244
    .line 245
    invoke-static {v5}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->k(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    .line 246
    .line 247
    .line 248
    move-result v5

    .line 249
    sub-float v5, v1, v5

    .line 250
    .line 251
    div-float/2addr v4, v5

    .line 252
    iget-object v5, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 253
    .line 254
    invoke-static {v5}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->h(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    .line 255
    .line 256
    .line 257
    move-result v5

    .line 258
    mul-float/2addr v4, v5

    .line 259
    add-float/2addr v3, v4

    .line 260
    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 261
    .line 262
    invoke-static {v4}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->p(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I

    .line 263
    .line 264
    .line 265
    move-result v4

    .line 266
    int-to-float v4, v4

    .line 267
    iget-object v5, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 268
    .line 269
    invoke-static {v5}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->c(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I

    .line 270
    .line 271
    .line 272
    move-result v5

    .line 273
    int-to-float v5, v5

    .line 274
    iget-object v6, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 275
    .line 276
    invoke-static {v6}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->k(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    .line 277
    .line 278
    .line 279
    move-result v6

    .line 280
    sub-float v6, v1, v6

    .line 281
    .line 282
    div-float/2addr v5, v6

    .line 283
    iget-object v6, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 284
    .line 285
    invoke-static {v6}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->h(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    .line 286
    .line 287
    .line 288
    move-result v6

    .line 289
    mul-float/2addr v5, v6

    .line 290
    add-float/2addr v4, v5

    .line 291
    invoke-virtual {p1, v0, v2, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 292
    .line 293
    .line 294
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 295
    .line 296
    invoke-static {p1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->f(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)Landroid/graphics/RectF;

    .line 297
    .line 298
    .line 299
    move-result-object p1

    .line 300
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 301
    .line 302
    invoke-static {v0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->o(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I

    .line 303
    .line 304
    .line 305
    move-result v0

    .line 306
    int-to-float v0, v0

    .line 307
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 308
    .line 309
    invoke-static {v2}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->n(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I

    .line 310
    .line 311
    .line 312
    move-result v2

    .line 313
    int-to-float v2, v2

    .line 314
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 315
    .line 316
    invoke-static {v3}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->k(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    .line 317
    .line 318
    .line 319
    move-result v3

    .line 320
    sub-float v3, v1, v3

    .line 321
    .line 322
    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 323
    .line 324
    invoke-static {v4}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->e(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    .line 325
    .line 326
    .line 327
    move-result v4

    .line 328
    add-float/2addr v3, v4

    .line 329
    div-float/2addr v2, v3

    .line 330
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 331
    .line 332
    invoke-static {v3}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->h(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    .line 333
    .line 334
    .line 335
    move-result v3

    .line 336
    mul-float/2addr v2, v3

    .line 337
    sub-float/2addr v0, v2

    .line 338
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 339
    .line 340
    invoke-static {v2}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->p(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I

    .line 341
    .line 342
    .line 343
    move-result v2

    .line 344
    int-to-float v2, v2

    .line 345
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 346
    .line 347
    invoke-static {v3}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->c(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I

    .line 348
    .line 349
    .line 350
    move-result v3

    .line 351
    int-to-float v3, v3

    .line 352
    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 353
    .line 354
    invoke-static {v4}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->k(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    .line 355
    .line 356
    .line 357
    move-result v4

    .line 358
    sub-float v4, v1, v4

    .line 359
    .line 360
    iget-object v5, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 361
    .line 362
    invoke-static {v5}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->e(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    .line 363
    .line 364
    .line 365
    move-result v5

    .line 366
    add-float/2addr v4, v5

    .line 367
    div-float/2addr v3, v4

    .line 368
    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 369
    .line 370
    invoke-static {v4}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->h(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    .line 371
    .line 372
    .line 373
    move-result v4

    .line 374
    mul-float/2addr v3, v4

    .line 375
    sub-float/2addr v2, v3

    .line 376
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 377
    .line 378
    invoke-static {v3}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->o(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I

    .line 379
    .line 380
    .line 381
    move-result v3

    .line 382
    int-to-float v3, v3

    .line 383
    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 384
    .line 385
    invoke-static {v4}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->n(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I

    .line 386
    .line 387
    .line 388
    move-result v4

    .line 389
    int-to-float v4, v4

    .line 390
    iget-object v5, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 391
    .line 392
    invoke-static {v5}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->k(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    .line 393
    .line 394
    .line 395
    move-result v5

    .line 396
    sub-float v5, v1, v5

    .line 397
    .line 398
    iget-object v6, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 399
    .line 400
    invoke-static {v6}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->e(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    .line 401
    .line 402
    .line 403
    move-result v6

    .line 404
    add-float/2addr v5, v6

    .line 405
    div-float/2addr v4, v5

    .line 406
    iget-object v5, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 407
    .line 408
    invoke-static {v5}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->h(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    .line 409
    .line 410
    .line 411
    move-result v5

    .line 412
    mul-float/2addr v4, v5

    .line 413
    add-float/2addr v3, v4

    .line 414
    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 415
    .line 416
    invoke-static {v4}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->p(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I

    .line 417
    .line 418
    .line 419
    move-result v4

    .line 420
    int-to-float v4, v4

    .line 421
    iget-object v5, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 422
    .line 423
    invoke-static {v5}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->c(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I

    .line 424
    .line 425
    .line 426
    move-result v5

    .line 427
    int-to-float v5, v5

    .line 428
    iget-object v6, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 429
    .line 430
    invoke-static {v6}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->k(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    .line 431
    .line 432
    .line 433
    move-result v6

    .line 434
    sub-float/2addr v1, v6

    .line 435
    iget-object v6, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 436
    .line 437
    invoke-static {v6}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->e(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    .line 438
    .line 439
    .line 440
    move-result v6

    .line 441
    add-float/2addr v1, v6

    .line 442
    div-float/2addr v5, v1

    .line 443
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 444
    .line 445
    invoke-static {v1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->h(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    .line 446
    .line 447
    .line 448
    move-result v1

    .line 449
    mul-float/2addr v5, v1

    .line 450
    add-float/2addr v4, v5

    .line 451
    invoke-virtual {p1, v0, v2, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 452
    .line 453
    .line 454
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$d;->a:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    .line 455
    .line 456
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 457
    .line 458
    .line 459
    return-void
.end method
