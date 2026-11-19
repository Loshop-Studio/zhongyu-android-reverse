.class public final Lcom/xuexiang/xui/utils/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/CharSequence;

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public l:F

.field public m:F

.field public n:F

.field public o:F

.field public p:Landroid/graphics/drawable/Drawable;

.field public q:I

.field public r:I

.field public s:I

.field public t:Landroid/text/SpannableStringBuilder;

.field public u:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "line.separator"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/utils/i;->t:Landroid/text/SpannableStringBuilder;

    .line 2
    .line 3
    iget v1, p0, Lcom/xuexiang/xui/utils/i;->u:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, -0x1

    .line 7
    if-nez v1, :cond_d

    .line 8
    .line 9
    iget-object v1, p0, Lcom/xuexiang/xui/utils/i;->a:Ljava/lang/CharSequence;

    .line 10
    .line 11
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    goto/16 :goto_1

    .line 18
    .line 19
    :cond_0
    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    iget-object v4, p0, Lcom/xuexiang/xui/utils/i;->a:Ljava/lang/CharSequence;

    .line 24
    .line 25
    invoke-virtual {v0, v4}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    iget v5, p0, Lcom/xuexiang/xui/utils/i;->c:I

    .line 33
    .line 34
    const v6, -0x1000001

    .line 35
    .line 36
    .line 37
    if-eq v5, v6, :cond_1

    .line 38
    .line 39
    new-instance v5, Landroid/text/style/ForegroundColorSpan;

    .line 40
    .line 41
    iget v7, p0, Lcom/xuexiang/xui/utils/i;->c:I

    .line 42
    .line 43
    invoke-direct {v5, v7}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 44
    .line 45
    .line 46
    iget v7, p0, Lcom/xuexiang/xui/utils/i;->b:I

    .line 47
    .line 48
    invoke-virtual {v0, v5, v1, v4, v7}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 49
    .line 50
    .line 51
    :cond_1
    iget v5, p0, Lcom/xuexiang/xui/utils/i;->d:I

    .line 52
    .line 53
    if-eq v5, v6, :cond_2

    .line 54
    .line 55
    new-instance v5, Landroid/text/style/BackgroundColorSpan;

    .line 56
    .line 57
    iget v7, p0, Lcom/xuexiang/xui/utils/i;->d:I

    .line 58
    .line 59
    invoke-direct {v5, v7}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 60
    .line 61
    .line 62
    iget v7, p0, Lcom/xuexiang/xui/utils/i;->b:I

    .line 63
    .line 64
    invoke-virtual {v0, v5, v1, v4, v7}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 65
    .line 66
    .line 67
    :cond_2
    iget v5, p0, Lcom/xuexiang/xui/utils/i;->g:I

    .line 68
    .line 69
    if-eq v5, v3, :cond_3

    .line 70
    .line 71
    new-instance v5, Landroid/text/style/LeadingMarginSpan$Standard;

    .line 72
    .line 73
    iget v7, p0, Lcom/xuexiang/xui/utils/i;->g:I

    .line 74
    .line 75
    invoke-direct {v5, v7, v2}, Landroid/text/style/LeadingMarginSpan$Standard;-><init>(II)V

    .line 76
    .line 77
    .line 78
    iget v7, p0, Lcom/xuexiang/xui/utils/i;->b:I

    .line 79
    .line 80
    invoke-virtual {v0, v5, v1, v4, v7}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 81
    .line 82
    .line 83
    :cond_3
    iget v5, p0, Lcom/xuexiang/xui/utils/i;->f:I

    .line 84
    .line 85
    if-eq v5, v6, :cond_4

    .line 86
    .line 87
    new-instance v7, Lcom/xuexiang/xui/utils/f;

    .line 88
    .line 89
    invoke-direct {v7, v5}, Lcom/xuexiang/xui/utils/f;-><init>(I)V

    .line 90
    .line 91
    .line 92
    iget v5, p0, Lcom/xuexiang/xui/utils/i;->b:I

    .line 93
    .line 94
    invoke-virtual {v0, v7, v1, v4, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 95
    .line 96
    .line 97
    :cond_4
    iget v5, p0, Lcom/xuexiang/xui/utils/i;->h:I

    .line 98
    .line 99
    if-eq v5, v6, :cond_5

    .line 100
    .line 101
    new-instance v6, Lcom/xuexiang/xui/utils/c;

    .line 102
    .line 103
    invoke-direct {v6, v5}, Lcom/xuexiang/xui/utils/c;-><init>(I)V

    .line 104
    .line 105
    .line 106
    iget v5, p0, Lcom/xuexiang/xui/utils/i;->b:I

    .line 107
    .line 108
    invoke-virtual {v0, v6, v1, v4, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 109
    .line 110
    .line 111
    :cond_5
    iget v5, p0, Lcom/xuexiang/xui/utils/i;->j:I

    .line 112
    .line 113
    const/4 v6, 0x0

    .line 114
    if-eq v5, v3, :cond_7

    .line 115
    .line 116
    iget v5, p0, Lcom/xuexiang/xui/utils/i;->i:I

    .line 117
    .line 118
    if-ne v5, v3, :cond_6

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_6
    invoke-static {}, Lt1/a;->a()V

    .line 122
    .line 123
    .line 124
    throw v6

    .line 125
    :cond_7
    :goto_0
    iget v5, p0, Lcom/xuexiang/xui/utils/i;->k:I

    .line 126
    .line 127
    if-eq v5, v3, :cond_8

    .line 128
    .line 129
    new-instance v5, Landroid/text/style/AbsoluteSizeSpan;

    .line 130
    .line 131
    iget v7, p0, Lcom/xuexiang/xui/utils/i;->k:I

    .line 132
    .line 133
    invoke-direct {v5, v7, v2}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    .line 134
    .line 135
    .line 136
    iget v2, p0, Lcom/xuexiang/xui/utils/i;->b:I

    .line 137
    .line 138
    invoke-virtual {v0, v5, v1, v4, v2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 139
    .line 140
    .line 141
    :cond_8
    iget v2, p0, Lcom/xuexiang/xui/utils/i;->l:F

    .line 142
    .line 143
    const/high16 v5, -0x40800000    # -1.0f

    .line 144
    .line 145
    cmpl-float v2, v2, v5

    .line 146
    .line 147
    if-eqz v2, :cond_9

    .line 148
    .line 149
    new-instance v2, Landroid/text/style/RelativeSizeSpan;

    .line 150
    .line 151
    iget v7, p0, Lcom/xuexiang/xui/utils/i;->l:F

    .line 152
    .line 153
    invoke-direct {v2, v7}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    .line 154
    .line 155
    .line 156
    iget v7, p0, Lcom/xuexiang/xui/utils/i;->b:I

    .line 157
    .line 158
    invoke-virtual {v0, v2, v1, v4, v7}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 159
    .line 160
    .line 161
    :cond_9
    iget v2, p0, Lcom/xuexiang/xui/utils/i;->m:F

    .line 162
    .line 163
    cmpl-float v2, v2, v5

    .line 164
    .line 165
    if-eqz v2, :cond_a

    .line 166
    .line 167
    new-instance v2, Landroid/text/style/ScaleXSpan;

    .line 168
    .line 169
    iget v7, p0, Lcom/xuexiang/xui/utils/i;->m:F

    .line 170
    .line 171
    invoke-direct {v2, v7}, Landroid/text/style/ScaleXSpan;-><init>(F)V

    .line 172
    .line 173
    .line 174
    iget v7, p0, Lcom/xuexiang/xui/utils/i;->b:I

    .line 175
    .line 176
    invoke-virtual {v0, v2, v1, v4, v7}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 177
    .line 178
    .line 179
    :cond_a
    iget v2, p0, Lcom/xuexiang/xui/utils/i;->e:I

    .line 180
    .line 181
    if-eq v2, v3, :cond_b

    .line 182
    .line 183
    new-instance v2, Lcom/xuexiang/xui/utils/e;

    .line 184
    .line 185
    iget v3, p0, Lcom/xuexiang/xui/utils/i;->e:I

    .line 186
    .line 187
    invoke-direct {v2, v3}, Lcom/xuexiang/xui/utils/e;-><init>(I)V

    .line 188
    .line 189
    .line 190
    iget v3, p0, Lcom/xuexiang/xui/utils/i;->b:I

    .line 191
    .line 192
    invoke-virtual {v0, v2, v1, v4, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 193
    .line 194
    .line 195
    :cond_b
    iget v2, p0, Lcom/xuexiang/xui/utils/i;->n:F

    .line 196
    .line 197
    cmpl-float v2, v2, v5

    .line 198
    .line 199
    if-eqz v2, :cond_c

    .line 200
    .line 201
    new-instance v2, Landroid/text/style/MaskFilterSpan;

    .line 202
    .line 203
    new-instance v3, Landroid/graphics/BlurMaskFilter;

    .line 204
    .line 205
    iget v7, p0, Lcom/xuexiang/xui/utils/i;->n:F

    .line 206
    .line 207
    invoke-direct {v3, v7, v6}, Landroid/graphics/BlurMaskFilter;-><init>(FLandroid/graphics/BlurMaskFilter$Blur;)V

    .line 208
    .line 209
    .line 210
    invoke-direct {v2, v3}, Landroid/text/style/MaskFilterSpan;-><init>(Landroid/graphics/MaskFilter;)V

    .line 211
    .line 212
    .line 213
    iget v3, p0, Lcom/xuexiang/xui/utils/i;->b:I

    .line 214
    .line 215
    invoke-virtual {v0, v2, v1, v4, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 216
    .line 217
    .line 218
    :cond_c
    iget v2, p0, Lcom/xuexiang/xui/utils/i;->o:F

    .line 219
    .line 220
    cmpl-float v2, v2, v5

    .line 221
    .line 222
    if-eqz v2, :cond_10

    .line 223
    .line 224
    new-instance v2, Lcom/xuexiang/xui/utils/g;

    .line 225
    .line 226
    iget v3, p0, Lcom/xuexiang/xui/utils/i;->o:F

    .line 227
    .line 228
    invoke-direct {v2}, Landroid/text/style/CharacterStyle;-><init>()V

    .line 229
    .line 230
    .line 231
    iput v3, v2, Lcom/xuexiang/xui/utils/g;->a:F

    .line 232
    .line 233
    iget v3, p0, Lcom/xuexiang/xui/utils/i;->b:I

    .line 234
    .line 235
    invoke-virtual {v0, v2, v1, v4, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 236
    .line 237
    .line 238
    goto :goto_1

    .line 239
    :cond_d
    const/4 v4, 0x1

    .line 240
    if-ne v1, v4, :cond_f

    .line 241
    .line 242
    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 243
    .line 244
    .line 245
    move-result v1

    .line 246
    const-string v4, "<img>"

    .line 247
    .line 248
    invoke-virtual {v0, v4}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 249
    .line 250
    .line 251
    add-int/lit8 v4, v1, 0x5

    .line 252
    .line 253
    iget-object v5, p0, Lcom/xuexiang/xui/utils/i;->p:Landroid/graphics/drawable/Drawable;

    .line 254
    .line 255
    if-eqz v5, :cond_e

    .line 256
    .line 257
    new-instance v3, Lcom/xuexiang/xui/utils/d;

    .line 258
    .line 259
    iget-object v5, p0, Lcom/xuexiang/xui/utils/i;->p:Landroid/graphics/drawable/Drawable;

    .line 260
    .line 261
    iget v6, p0, Lcom/xuexiang/xui/utils/i;->r:I

    .line 262
    .line 263
    invoke-direct {v3, v6}, Lcom/xuexiang/xui/utils/d;-><init>(I)V

    .line 264
    .line 265
    .line 266
    iput-object v5, v3, Lcom/xuexiang/xui/utils/d;->c:Landroid/graphics/drawable/Drawable;

    .line 267
    .line 268
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 269
    .line 270
    .line 271
    move-result v6

    .line 272
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 273
    .line 274
    .line 275
    move-result v7

    .line 276
    invoke-virtual {v5, v2, v2, v6, v7}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 277
    .line 278
    .line 279
    iget v2, p0, Lcom/xuexiang/xui/utils/i;->b:I

    .line 280
    .line 281
    invoke-virtual {v0, v3, v1, v4, v2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 282
    .line 283
    .line 284
    goto :goto_1

    .line 285
    :cond_e
    iget v2, p0, Lcom/xuexiang/xui/utils/i;->q:I

    .line 286
    .line 287
    if-eq v2, v3, :cond_10

    .line 288
    .line 289
    new-instance v2, Lcom/xuexiang/xui/utils/d;

    .line 290
    .line 291
    iget v3, p0, Lcom/xuexiang/xui/utils/i;->q:I

    .line 292
    .line 293
    iget v5, p0, Lcom/xuexiang/xui/utils/i;->r:I

    .line 294
    .line 295
    invoke-direct {v2, v5}, Lcom/xuexiang/xui/utils/d;-><init>(I)V

    .line 296
    .line 297
    .line 298
    iput v3, v2, Lcom/xuexiang/xui/utils/d;->d:I

    .line 299
    .line 300
    iget v3, p0, Lcom/xuexiang/xui/utils/i;->b:I

    .line 301
    .line 302
    invoke-virtual {v0, v2, v1, v4, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 303
    .line 304
    .line 305
    goto :goto_1

    .line 306
    :cond_f
    const/4 v2, 0x2

    .line 307
    if-ne v1, v2, :cond_10

    .line 308
    .line 309
    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 310
    .line 311
    .line 312
    move-result v1

    .line 313
    const-string v2, "< >"

    .line 314
    .line 315
    invoke-virtual {v0, v2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 316
    .line 317
    .line 318
    add-int/lit8 v2, v1, 0x3

    .line 319
    .line 320
    new-instance v3, Lcom/xuexiang/xui/utils/h;

    .line 321
    .line 322
    iget v4, p0, Lcom/xuexiang/xui/utils/i;->s:I

    .line 323
    .line 324
    invoke-direct {v3, v4}, Lcom/xuexiang/xui/utils/h;-><init>(I)V

    .line 325
    .line 326
    .line 327
    iget v4, p0, Lcom/xuexiang/xui/utils/i;->b:I

    .line 328
    .line 329
    invoke-virtual {v0, v3, v1, v2, v4}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 330
    .line 331
    .line 332
    :cond_10
    :goto_1
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/i;->b()V

    .line 333
    .line 334
    .line 335
    return-void
.end method

.method public final b()V
    .locals 2

    .line 1
    const/16 v0, 0x21

    .line 2
    .line 3
    iput v0, p0, Lcom/xuexiang/xui/utils/i;->b:I

    .line 4
    .line 5
    const v0, -0x1000001

    .line 6
    .line 7
    .line 8
    iput v0, p0, Lcom/xuexiang/xui/utils/i;->c:I

    .line 9
    .line 10
    iput v0, p0, Lcom/xuexiang/xui/utils/i;->d:I

    .line 11
    .line 12
    const/4 v1, -0x1

    .line 13
    iput v1, p0, Lcom/xuexiang/xui/utils/i;->e:I

    .line 14
    .line 15
    iput v0, p0, Lcom/xuexiang/xui/utils/i;->f:I

    .line 16
    .line 17
    iput v1, p0, Lcom/xuexiang/xui/utils/i;->g:I

    .line 18
    .line 19
    iput v0, p0, Lcom/xuexiang/xui/utils/i;->h:I

    .line 20
    .line 21
    iput v1, p0, Lcom/xuexiang/xui/utils/i;->i:I

    .line 22
    .line 23
    iput v1, p0, Lcom/xuexiang/xui/utils/i;->j:I

    .line 24
    .line 25
    iput v1, p0, Lcom/xuexiang/xui/utils/i;->k:I

    .line 26
    .line 27
    const/high16 v0, -0x40800000    # -1.0f

    .line 28
    .line 29
    iput v0, p0, Lcom/xuexiang/xui/utils/i;->l:F

    .line 30
    .line 31
    iput v0, p0, Lcom/xuexiang/xui/utils/i;->m:F

    .line 32
    .line 33
    iput v0, p0, Lcom/xuexiang/xui/utils/i;->n:F

    .line 34
    .line 35
    iput v0, p0, Lcom/xuexiang/xui/utils/i;->o:F

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    iput-object v0, p0, Lcom/xuexiang/xui/utils/i;->p:Landroid/graphics/drawable/Drawable;

    .line 39
    .line 40
    iput v1, p0, Lcom/xuexiang/xui/utils/i;->q:I

    .line 41
    .line 42
    iput v1, p0, Lcom/xuexiang/xui/utils/i;->s:I

    .line 43
    .line 44
    return-void
.end method
