.class public abstract Ls0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lcom/xuexiang/xui/widget/button/shinebutton/interpolator/Ease;F)F
    .locals 19

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    sget-object v1, Ls0/b$a;->a:[I

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    aget v1, v1, v2

    .line 10
    .line 11
    const/high16 v2, -0x3ee00000    # -10.0f

    .line 12
    .line 13
    const/high16 v3, 0x41200000    # 10.0f

    .line 14
    .line 15
    const-wide v4, 0x3fd3333333333333L    # 0.3

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    const-wide v6, 0x3ffb333333333333L    # 1.7

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    const-wide v8, 0x400599999999999aL    # 2.7

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    const-wide/high16 v10, -0x4020000000000000L    # -0.5

    .line 31
    .line 32
    const/high16 v16, 0x40000000    # 2.0f

    .line 33
    .line 34
    const/high16 v17, 0x3f000000    # 0.5f

    .line 35
    .line 36
    const-wide/high16 v14, 0x3ff0000000000000L    # 1.0

    .line 37
    .line 38
    const-wide/high16 v12, 0x4000000000000000L    # 2.0

    .line 39
    .line 40
    const/high16 v18, 0x3f800000    # 1.0f

    .line 41
    .line 42
    packed-switch v1, :pswitch_data_0

    .line 43
    .line 44
    .line 45
    return v0

    .line 46
    :pswitch_0
    mul-float v0, v0, v16

    .line 47
    .line 48
    cmpg-float v1, v0, v18

    .line 49
    .line 50
    if-gez v1, :cond_0

    .line 51
    .line 52
    sub-float v0, v0, v18

    .line 53
    .line 54
    mul-float/2addr v0, v3

    .line 55
    float-to-double v0, v0

    .line 56
    invoke-static {v12, v13, v0, v1}, Ljava/lang/Math;->pow(DD)D

    .line 57
    .line 58
    .line 59
    move-result-wide v0

    .line 60
    double-to-float v0, v0

    .line 61
    mul-float v0, v0, v17

    .line 62
    .line 63
    return v0

    .line 64
    :cond_0
    sub-float v0, v0, v18

    .line 65
    .line 66
    mul-float/2addr v0, v2

    .line 67
    float-to-double v0, v0

    .line 68
    invoke-static {v12, v13, v0, v1}, Ljava/lang/Math;->pow(DD)D

    .line 69
    .line 70
    .line 71
    move-result-wide v0

    .line 72
    neg-double v0, v0

    .line 73
    add-double/2addr v0, v12

    .line 74
    double-to-float v0, v0

    .line 75
    mul-float v0, v0, v17

    .line 76
    .line 77
    return v0

    .line 78
    :pswitch_1
    mul-float/2addr v0, v2

    .line 79
    float-to-double v0, v0

    .line 80
    invoke-static {v12, v13, v0, v1}, Ljava/lang/Math;->pow(DD)D

    .line 81
    .line 82
    .line 83
    move-result-wide v0

    .line 84
    neg-double v0, v0

    .line 85
    double-to-float v0, v0

    .line 86
    add-float v0, v0, v18

    .line 87
    .line 88
    return v0

    .line 89
    :pswitch_2
    sub-float v0, v0, v18

    .line 90
    .line 91
    mul-float/2addr v0, v3

    .line 92
    float-to-double v0, v0

    .line 93
    invoke-static {v12, v13, v0, v1}, Ljava/lang/Math;->pow(DD)D

    .line 94
    .line 95
    .line 96
    move-result-wide v0

    .line 97
    double-to-float v0, v0

    .line 98
    return v0

    .line 99
    :pswitch_3
    const-wide v1, 0x3fdccccccccccccdL    # 0.45

    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    invoke-static {v0, v14, v15, v1, v2}, Ls0/b;->f(FDD)F

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    return v0

    .line 109
    :pswitch_4
    invoke-static {v0, v14, v15, v4, v5}, Ls0/b;->g(FDD)F

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    return v0

    .line 114
    :pswitch_5
    invoke-static {v0, v14, v15, v4, v5}, Ls0/b;->e(FDD)F

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    return v0

    .line 119
    :pswitch_6
    cmpg-float v1, v0, v17

    .line 120
    .line 121
    if-gez v1, :cond_1

    .line 122
    .line 123
    mul-float v0, v0, v16

    .line 124
    .line 125
    invoke-static {v0}, Ls0/b;->c(F)F

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    mul-float v0, v0, v17

    .line 130
    .line 131
    return v0

    .line 132
    :cond_1
    mul-float v0, v0, v16

    .line 133
    .line 134
    sub-float v0, v0, v18

    .line 135
    .line 136
    invoke-static {v0}, Ls0/b;->d(F)F

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    mul-float v0, v0, v17

    .line 141
    .line 142
    add-float v0, v0, v17

    .line 143
    .line 144
    return v0

    .line 145
    :pswitch_7
    invoke-static/range {p1 .. p1}, Ls0/b;->d(F)F

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    return v0

    .line 150
    :pswitch_8
    invoke-static/range {p1 .. p1}, Ls0/b;->c(F)F

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    return v0

    .line 155
    :pswitch_9
    mul-float v0, v0, v16

    .line 156
    .line 157
    cmpg-float v1, v0, v18

    .line 158
    .line 159
    if-gez v1, :cond_2

    .line 160
    .line 161
    mul-float/2addr v0, v0

    .line 162
    sub-float v0, v18, v0

    .line 163
    .line 164
    float-to-double v0, v0

    .line 165
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 166
    .line 167
    .line 168
    move-result-wide v0

    .line 169
    sub-double/2addr v0, v14

    .line 170
    mul-double/2addr v0, v10

    .line 171
    double-to-float v0, v0

    .line 172
    return v0

    .line 173
    :cond_2
    sub-float v0, v0, v16

    .line 174
    .line 175
    mul-float/2addr v0, v0

    .line 176
    sub-float v0, v18, v0

    .line 177
    .line 178
    float-to-double v0, v0

    .line 179
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 180
    .line 181
    .line 182
    move-result-wide v0

    .line 183
    add-double/2addr v0, v14

    .line 184
    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    .line 185
    .line 186
    mul-double/2addr v0, v2

    .line 187
    double-to-float v0, v0

    .line 188
    return v0

    .line 189
    :pswitch_a
    sub-float v0, v0, v18

    .line 190
    .line 191
    mul-float/2addr v0, v0

    .line 192
    sub-float v0, v18, v0

    .line 193
    .line 194
    float-to-double v0, v0

    .line 195
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 196
    .line 197
    .line 198
    move-result-wide v0

    .line 199
    double-to-float v0, v0

    .line 200
    return v0

    .line 201
    :pswitch_b
    mul-float/2addr v0, v0

    .line 202
    sub-float v0, v18, v0

    .line 203
    .line 204
    float-to-double v0, v0

    .line 205
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 206
    .line 207
    .line 208
    move-result-wide v0

    .line 209
    sub-double/2addr v0, v14

    .line 210
    neg-double v0, v0

    .line 211
    double-to-float v0, v0

    .line 212
    return v0

    .line 213
    :pswitch_c
    const v1, 0x3fd9999a    # 1.7f

    .line 214
    .line 215
    .line 216
    invoke-static {v0, v1}, Ls0/b;->b(FF)F

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    return v0

    .line 221
    :pswitch_d
    sub-float v0, v0, v18

    .line 222
    .line 223
    mul-float v1, v0, v0

    .line 224
    .line 225
    float-to-double v1, v1

    .line 226
    float-to-double v3, v0

    .line 227
    mul-double/2addr v3, v8

    .line 228
    add-double/2addr v3, v6

    .line 229
    mul-double/2addr v1, v3

    .line 230
    add-double/2addr v1, v14

    .line 231
    double-to-float v0, v1

    .line 232
    return v0

    .line 233
    :pswitch_e
    mul-float v1, v0, v0

    .line 234
    .line 235
    float-to-double v1, v1

    .line 236
    float-to-double v3, v0

    .line 237
    mul-double/2addr v3, v8

    .line 238
    sub-double/2addr v3, v6

    .line 239
    mul-double/2addr v1, v3

    .line 240
    double-to-float v0, v1

    .line 241
    return v0

    .line 242
    :pswitch_f
    float-to-double v0, v0

    .line 243
    const-wide v2, 0x400921fb54442d18L    # Math.PI

    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    mul-double/2addr v0, v2

    .line 249
    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    .line 250
    .line 251
    .line 252
    move-result-wide v0

    .line 253
    sub-double/2addr v0, v14

    .line 254
    mul-double/2addr v0, v10

    .line 255
    double-to-float v0, v0

    .line 256
    return v0

    .line 257
    :pswitch_10
    const-wide v2, 0x400921fb54442d18L    # Math.PI

    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    float-to-double v0, v0

    .line 263
    mul-double/2addr v0, v2

    .line 264
    div-double/2addr v0, v12

    .line 265
    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    .line 266
    .line 267
    .line 268
    move-result-wide v0

    .line 269
    double-to-float v0, v0

    .line 270
    return v0

    .line 271
    :pswitch_11
    const-wide v2, 0x400921fb54442d18L    # Math.PI

    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    float-to-double v0, v0

    .line 277
    mul-double/2addr v0, v2

    .line 278
    div-double/2addr v0, v12

    .line 279
    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    .line 280
    .line 281
    .line 282
    move-result-wide v0

    .line 283
    sub-double/2addr v14, v0

    .line 284
    double-to-float v0, v14

    .line 285
    return v0

    .line 286
    :pswitch_12
    const-wide/high16 v1, 0x4014000000000000L    # 5.0

    .line 287
    .line 288
    invoke-static {v0, v1, v2}, Ls0/b;->i(FD)F

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    return v0

    .line 293
    :pswitch_13
    const-wide/high16 v1, 0x4014000000000000L    # 5.0

    .line 294
    .line 295
    invoke-static {v0, v1, v2}, Ls0/b;->j(FD)F

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    return v0

    .line 300
    :pswitch_14
    const-wide/high16 v1, 0x4014000000000000L    # 5.0

    .line 301
    .line 302
    invoke-static {v0, v1, v2}, Ls0/b;->h(FD)F

    .line 303
    .line 304
    .line 305
    move-result v0

    .line 306
    return v0

    .line 307
    :pswitch_15
    const-wide/high16 v1, 0x4010000000000000L    # 4.0

    .line 308
    .line 309
    invoke-static {v0, v1, v2}, Ls0/b;->i(FD)F

    .line 310
    .line 311
    .line 312
    move-result v0

    .line 313
    return v0

    .line 314
    :pswitch_16
    const-wide/high16 v1, 0x4010000000000000L    # 4.0

    .line 315
    .line 316
    invoke-static {v0, v1, v2}, Ls0/b;->j(FD)F

    .line 317
    .line 318
    .line 319
    move-result v0

    .line 320
    return v0

    .line 321
    :pswitch_17
    const-wide/high16 v1, 0x4010000000000000L    # 4.0

    .line 322
    .line 323
    invoke-static {v0, v1, v2}, Ls0/b;->h(FD)F

    .line 324
    .line 325
    .line 326
    move-result v0

    .line 327
    return v0

    .line 328
    :pswitch_18
    const-wide/high16 v1, 0x4008000000000000L    # 3.0

    .line 329
    .line 330
    invoke-static {v0, v1, v2}, Ls0/b;->i(FD)F

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    return v0

    .line 335
    :pswitch_19
    const-wide/high16 v1, 0x4008000000000000L    # 3.0

    .line 336
    .line 337
    invoke-static {v0, v1, v2}, Ls0/b;->j(FD)F

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    return v0

    .line 342
    :pswitch_1a
    const-wide/high16 v1, 0x4008000000000000L    # 3.0

    .line 343
    .line 344
    invoke-static {v0, v1, v2}, Ls0/b;->h(FD)F

    .line 345
    .line 346
    .line 347
    move-result v0

    .line 348
    return v0

    .line 349
    :pswitch_1b
    invoke-static {v0, v12, v13}, Ls0/b;->i(FD)F

    .line 350
    .line 351
    .line 352
    move-result v0

    .line 353
    return v0

    .line 354
    :pswitch_1c
    invoke-static {v0, v12, v13}, Ls0/b;->j(FD)F

    .line 355
    .line 356
    .line 357
    move-result v0

    .line 358
    return v0

    .line 359
    :pswitch_1d
    invoke-static {v0, v12, v13}, Ls0/b;->h(FD)F

    .line 360
    .line 361
    .line 362
    move-result v0

    .line 363
    return v0

    .line 364
    nop

    .line 365
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static b(FF)F
    .locals 5

    .line 1
    float-to-double v0, p1

    const-wide v2, 0x3ff8666666666666L    # 1.525

    mul-double/2addr v0, v2

    double-to-float p1, v0

    const/high16 v0, 0x40000000    # 2.0f

    mul-float/2addr p0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpg-float v2, p0, v1

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    if-gez v2, :cond_0

    mul-float v0, p0, p0

    add-float/2addr v1, p1

    mul-float/2addr v1, p0

    sub-float/2addr v1, p1

    mul-float/2addr v0, v1

    float-to-double p0, v0

    :goto_0
    mul-double/2addr p0, v3

    double-to-float p0, p0

    return p0

    :cond_0
    sub-float/2addr p0, v0

    mul-float v2, p0, p0

    add-float/2addr v1, p1

    mul-float/2addr v1, p0

    add-float/2addr v1, p1

    mul-float/2addr v2, v1

    add-float/2addr v2, v0

    float-to-double p0, v2

    goto :goto_0
.end method

.method public static c(F)F
    .locals 1

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    sub-float p0, v0, p0

    .line 4
    .line 5
    invoke-static {p0}, Ls0/b;->d(F)F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    sub-float/2addr v0, p0

    .line 10
    return v0
.end method

.method public static d(F)F
    .locals 6

    .line 1
    float-to-double v0, p0

    const-wide v2, 0x3fd745d1745d1746L    # 0.36363636363636365

    cmpg-double p0, v0, v2

    const-wide v2, 0x401e400000000000L    # 7.5625

    if-gez p0, :cond_0

    mul-double/2addr v2, v0

    mul-double/2addr v2, v0

    :goto_0
    double-to-float p0, v2

    return p0

    :cond_0
    const-wide v4, 0x3fe745d1745d1746L    # 0.7272727272727273

    cmpg-double p0, v0, v4

    if-gez p0, :cond_1

    const-wide v4, 0x3fe1745d1745d174L    # 0.5454545454545454

    sub-double/2addr v0, v4

    double-to-float p0, v0

    float-to-double v0, p0

    mul-double/2addr v2, v0

    mul-double/2addr v2, v0

    const-wide/high16 v0, 0x3fe8000000000000L    # 0.75

    :goto_1
    add-double/2addr v2, v0

    goto :goto_0

    :cond_1
    const-wide v4, 0x3fed1745d1745d17L    # 0.9090909090909091

    cmpg-double p0, v0, v4

    if-gez p0, :cond_2

    const-wide v4, 0x3fea2e8ba2e8ba2fL    # 0.8181818181818182

    sub-double/2addr v0, v4

    double-to-float p0, v0

    float-to-double v0, p0

    mul-double/2addr v2, v0

    mul-double/2addr v2, v0

    const-wide/high16 v0, 0x3fee000000000000L    # 0.9375

    goto :goto_1

    :cond_2
    const-wide v4, 0x3fee8ba2e8ba2e8cL    # 0.9545454545454546

    sub-double/2addr v0, v4

    double-to-float p0, v0

    float-to-double v0, p0

    mul-double/2addr v2, v0

    mul-double/2addr v2, v0

    const-wide v0, 0x3fef800000000000L    # 0.984375

    goto :goto_1
.end method

.method public static e(FDD)F
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v0, p0, v0

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    const/high16 v0, 0x3f800000    # 1.0f

    .line 7
    .line 8
    cmpl-float v1, p0, v0

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-wide v1, 0x401921fb54442d18L    # 6.283185307179586

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    div-double v3, p3, v1

    .line 19
    .line 20
    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    .line 21
    .line 22
    div-double/2addr v5, p1

    .line 23
    invoke-static {v5, v6}, Ljava/lang/Math;->asin(D)D

    .line 24
    .line 25
    .line 26
    move-result-wide v5

    .line 27
    mul-double/2addr v3, v5

    .line 28
    sub-float/2addr p0, v0

    .line 29
    const/high16 v0, 0x41200000    # 10.0f

    .line 30
    .line 31
    mul-float/2addr v0, p0

    .line 32
    float-to-double v5, v0

    .line 33
    const-wide/high16 v7, 0x4000000000000000L    # 2.0

    .line 34
    .line 35
    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->pow(DD)D

    .line 36
    .line 37
    .line 38
    move-result-wide v5

    .line 39
    mul-double/2addr p1, v5

    .line 40
    float-to-double v5, p0

    .line 41
    sub-double/2addr v5, v3

    .line 42
    mul-double/2addr v5, v1

    .line 43
    div-double/2addr v5, p3

    .line 44
    invoke-static {v5, v6}, Ljava/lang/Math;->sin(D)D

    .line 45
    .line 46
    .line 47
    move-result-wide p3

    .line 48
    mul-double/2addr p1, p3

    .line 49
    neg-double p0, p1

    .line 50
    double-to-float p0, p0

    .line 51
    :cond_1
    :goto_0
    return p0
.end method

.method public static f(FDD)F
    .locals 10

    .line 1
    const-wide v0, 0x401921fb54442d18L    # 6.283185307179586

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    div-double v2, p3, v0

    .line 7
    .line 8
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    .line 9
    .line 10
    div-double v6, v4, p1

    .line 11
    .line 12
    invoke-static {v6, v7}, Ljava/lang/Math;->asin(D)D

    .line 13
    .line 14
    .line 15
    move-result-wide v6

    .line 16
    mul-double/2addr v2, v6

    .line 17
    const/high16 v6, 0x40000000    # 2.0f

    .line 18
    .line 19
    mul-float/2addr p0, v6

    .line 20
    const/high16 v6, 0x3f800000    # 1.0f

    .line 21
    .line 22
    cmpg-float v7, p0, v6

    .line 23
    .line 24
    const-wide/high16 v8, 0x4000000000000000L    # 2.0

    .line 25
    .line 26
    if-gez v7, :cond_0

    .line 27
    .line 28
    sub-float/2addr p0, v6

    .line 29
    const/high16 v4, 0x41200000    # 10.0f

    .line 30
    .line 31
    mul-float/2addr v4, p0

    .line 32
    float-to-double v4, v4

    .line 33
    invoke-static {v8, v9, v4, v5}, Ljava/lang/Math;->pow(DD)D

    .line 34
    .line 35
    .line 36
    move-result-wide v4

    .line 37
    mul-double/2addr p1, v4

    .line 38
    float-to-double v4, p0

    .line 39
    sub-double/2addr v4, v2

    .line 40
    mul-double/2addr v4, v0

    .line 41
    div-double/2addr v4, p3

    .line 42
    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    .line 43
    .line 44
    .line 45
    move-result-wide p3

    .line 46
    mul-double/2addr p1, p3

    .line 47
    const-wide/high16 p3, -0x4020000000000000L    # -0.5

    .line 48
    .line 49
    mul-double/2addr p1, p3

    .line 50
    :goto_0
    double-to-float p0, p1

    .line 51
    return p0

    .line 52
    :cond_0
    sub-float/2addr p0, v6

    .line 53
    const/high16 v6, -0x3ee00000    # -10.0f

    .line 54
    .line 55
    mul-float/2addr v6, p0

    .line 56
    float-to-double v6, v6

    .line 57
    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 58
    .line 59
    .line 60
    move-result-wide v6

    .line 61
    mul-double/2addr p1, v6

    .line 62
    float-to-double v6, p0

    .line 63
    sub-double/2addr v6, v2

    .line 64
    mul-double/2addr v6, v0

    .line 65
    div-double/2addr v6, p3

    .line 66
    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    .line 67
    .line 68
    .line 69
    move-result-wide p3

    .line 70
    mul-double/2addr p1, p3

    .line 71
    const-wide/high16 p3, 0x3fe0000000000000L    # 0.5

    .line 72
    .line 73
    mul-double/2addr p1, p3

    .line 74
    add-double/2addr p1, v4

    .line 75
    goto :goto_0
.end method

.method public static g(FDD)F
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v0, p0, v0

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    const/high16 v0, 0x3f800000    # 1.0f

    .line 7
    .line 8
    cmpl-float v0, p0, v0

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-wide v0, 0x401921fb54442d18L    # 6.283185307179586

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    div-double v2, p3, v0

    .line 19
    .line 20
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    .line 21
    .line 22
    div-double v6, v4, p1

    .line 23
    .line 24
    invoke-static {v6, v7}, Ljava/lang/Math;->asin(D)D

    .line 25
    .line 26
    .line 27
    move-result-wide v6

    .line 28
    mul-double/2addr v2, v6

    .line 29
    const/high16 v6, -0x3ee00000    # -10.0f

    .line 30
    .line 31
    mul-float/2addr v6, p0

    .line 32
    float-to-double v6, v6

    .line 33
    const-wide/high16 v8, 0x4000000000000000L    # 2.0

    .line 34
    .line 35
    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 36
    .line 37
    .line 38
    move-result-wide v6

    .line 39
    mul-double/2addr p1, v6

    .line 40
    float-to-double v6, p0

    .line 41
    sub-double/2addr v6, v2

    .line 42
    mul-double/2addr v6, v0

    .line 43
    div-double/2addr v6, p3

    .line 44
    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    .line 45
    .line 46
    .line 47
    move-result-wide p3

    .line 48
    mul-double/2addr p1, p3

    .line 49
    add-double/2addr p1, v4

    .line 50
    double-to-float p0, p1

    .line 51
    :cond_1
    :goto_0
    return p0
.end method

.method public static h(FD)F
    .locals 2

    .line 1
    float-to-double v0, p0

    .line 2
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->pow(DD)D

    .line 3
    .line 4
    .line 5
    move-result-wide p0

    .line 6
    double-to-float p0, p0

    .line 7
    return p0
.end method

.method public static i(FD)F
    .locals 4

    .line 1
    const/high16 v0, 0x40000000    # 2.0f

    .line 2
    .line 3
    mul-float/2addr p0, v0

    .line 4
    const/high16 v1, 0x3f800000    # 1.0f

    .line 5
    .line 6
    cmpg-float v1, p0, v1

    .line 7
    .line 8
    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    .line 9
    .line 10
    if-gez v1, :cond_0

    .line 11
    .line 12
    float-to-double v0, p0

    .line 13
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->pow(DD)D

    .line 14
    .line 15
    .line 16
    move-result-wide p0

    .line 17
    mul-double/2addr p0, v2

    .line 18
    double-to-float p0, p0

    .line 19
    return p0

    .line 20
    :cond_0
    sub-float/2addr v0, p0

    .line 21
    float-to-double v0, v0

    .line 22
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->pow(DD)D

    .line 23
    .line 24
    .line 25
    move-result-wide p0

    .line 26
    invoke-static {p0, p1}, Ljava/lang/Math;->abs(D)D

    .line 27
    .line 28
    .line 29
    move-result-wide p0

    .line 30
    mul-double/2addr p0, v2

    .line 31
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 32
    .line 33
    sub-double/2addr v0, p0

    .line 34
    double-to-float p0, v0

    .line 35
    return p0
.end method

.method public static j(FD)F
    .locals 2

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    sub-float/2addr v0, p0

    .line 4
    float-to-double v0, v0

    .line 5
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->pow(DD)D

    .line 6
    .line 7
    .line 8
    move-result-wide p0

    .line 9
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 10
    .line 11
    sub-double/2addr v0, p0

    .line 12
    double-to-float p0, v0

    .line 13
    return p0
.end method
