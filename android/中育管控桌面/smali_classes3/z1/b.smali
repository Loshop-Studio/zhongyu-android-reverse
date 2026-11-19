.class public abstract Lz1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lcom/xuexiang/xui/widget/button/shinebutton/interpolator/Ease;F)F
    .locals 27

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    sget-object v1, Lz1/b$a;->a:[I

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
    const-wide v8, 0x3fd3333333333333L    # 0.3

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    const/high16 v10, -0x3ee00000    # -10.0f

    .line 17
    .line 18
    const/high16 v11, 0x41200000    # 10.0f

    .line 19
    .line 20
    const-wide/high16 v12, 0x4008000000000000L    # 3.0

    .line 21
    .line 22
    const-wide/high16 v14, 0x4010000000000000L    # 4.0

    .line 23
    .line 24
    const-wide v16, 0x3ffb333333333333L    # 1.7

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    const-wide/high16 v2, 0x4014000000000000L    # 5.0

    .line 30
    .line 31
    const-wide v18, 0x400921fb54442d18L    # Math.PI

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    const/high16 v20, 0x40000000    # 2.0f

    .line 37
    .line 38
    const/high16 v21, 0x3f000000    # 0.5f

    .line 39
    .line 40
    const-wide v22, 0x400599999999999aL    # 2.7

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    .line 46
    .line 47
    const-wide/high16 v24, -0x4020000000000000L    # -0.5

    .line 48
    .line 49
    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    .line 50
    .line 51
    const/high16 v26, 0x3f800000    # 1.0f

    .line 52
    .line 53
    packed-switch v1, :pswitch_data_0

    .line 54
    .line 55
    .line 56
    return v0

    .line 57
    :pswitch_0
    mul-float v0, v0, v20

    .line 58
    .line 59
    cmpg-float v1, v0, v26

    .line 60
    .line 61
    if-gez v1, :cond_0

    .line 62
    .line 63
    sub-float v0, v0, v26

    .line 64
    .line 65
    mul-float/2addr v0, v11

    .line 66
    float-to-double v0, v0

    .line 67
    invoke-static {v6, v7, v0, v1}, Ljava/lang/Math;->pow(DD)D

    .line 68
    .line 69
    .line 70
    move-result-wide v0

    .line 71
    double-to-float v0, v0

    .line 72
    mul-float v0, v0, v21

    .line 73
    .line 74
    return v0

    .line 75
    :cond_0
    sub-float v0, v0, v26

    .line 76
    .line 77
    mul-float/2addr v0, v10

    .line 78
    float-to-double v0, v0

    .line 79
    invoke-static {v6, v7, v0, v1}, Ljava/lang/Math;->pow(DD)D

    .line 80
    .line 81
    .line 82
    move-result-wide v0

    .line 83
    neg-double v0, v0

    .line 84
    add-double/2addr v0, v6

    .line 85
    double-to-float v0, v0

    .line 86
    mul-float v0, v0, v21

    .line 87
    .line 88
    return v0

    .line 89
    :pswitch_1
    mul-float/2addr v0, v10

    .line 90
    float-to-double v0, v0

    .line 91
    invoke-static {v6, v7, v0, v1}, Ljava/lang/Math;->pow(DD)D

    .line 92
    .line 93
    .line 94
    move-result-wide v0

    .line 95
    neg-double v0, v0

    .line 96
    double-to-float v0, v0

    .line 97
    add-float v0, v0, v26

    .line 98
    .line 99
    return v0

    .line 100
    :pswitch_2
    sub-float v0, v0, v26

    .line 101
    .line 102
    mul-float/2addr v0, v11

    .line 103
    float-to-double v0, v0

    .line 104
    invoke-static {v6, v7, v0, v1}, Ljava/lang/Math;->pow(DD)D

    .line 105
    .line 106
    .line 107
    move-result-wide v0

    .line 108
    double-to-float v0, v0

    .line 109
    return v0

    .line 110
    :pswitch_3
    const-wide v1, 0x3fdccccccccccccdL    # 0.45

    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    invoke-static {v0, v4, v5, v1, v2}, Lz1/b;->f(FDD)F

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    return v0

    .line 120
    :pswitch_4
    invoke-static {v0, v4, v5, v8, v9}, Lz1/b;->g(FDD)F

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    return v0

    .line 125
    :pswitch_5
    invoke-static {v0, v4, v5, v8, v9}, Lz1/b;->e(FDD)F

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    return v0

    .line 130
    :pswitch_6
    cmpg-float v1, v0, v21

    .line 131
    .line 132
    if-gez v1, :cond_1

    .line 133
    .line 134
    mul-float v0, v0, v20

    .line 135
    .line 136
    invoke-static {v0}, Lz1/b;->c(F)F

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    mul-float v0, v0, v21

    .line 141
    .line 142
    return v0

    .line 143
    :cond_1
    mul-float v0, v0, v20

    .line 144
    .line 145
    sub-float v0, v0, v26

    .line 146
    .line 147
    invoke-static {v0}, Lz1/b;->d(F)F

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    mul-float v0, v0, v21

    .line 152
    .line 153
    add-float v0, v0, v21

    .line 154
    .line 155
    return v0

    .line 156
    :pswitch_7
    invoke-static {v0}, Lz1/b;->d(F)F

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    return v0

    .line 161
    :pswitch_8
    invoke-static {v0}, Lz1/b;->c(F)F

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    return v0

    .line 166
    :pswitch_9
    mul-float v0, v0, v20

    .line 167
    .line 168
    cmpg-float v1, v0, v26

    .line 169
    .line 170
    if-gez v1, :cond_2

    .line 171
    .line 172
    mul-float/2addr v0, v0

    .line 173
    sub-float v0, v26, v0

    .line 174
    .line 175
    float-to-double v0, v0

    .line 176
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 177
    .line 178
    .line 179
    move-result-wide v0

    .line 180
    sub-double/2addr v0, v4

    .line 181
    mul-double v0, v0, v24

    .line 182
    .line 183
    double-to-float v0, v0

    .line 184
    return v0

    .line 185
    :cond_2
    sub-float v0, v0, v20

    .line 186
    .line 187
    mul-float/2addr v0, v0

    .line 188
    sub-float v0, v26, v0

    .line 189
    .line 190
    float-to-double v0, v0

    .line 191
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 192
    .line 193
    .line 194
    move-result-wide v0

    .line 195
    add-double/2addr v0, v4

    .line 196
    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    .line 197
    .line 198
    mul-double/2addr v0, v2

    .line 199
    double-to-float v0, v0

    .line 200
    return v0

    .line 201
    :pswitch_a
    sub-float v0, v0, v26

    .line 202
    .line 203
    mul-float/2addr v0, v0

    .line 204
    sub-float v0, v26, v0

    .line 205
    .line 206
    float-to-double v0, v0

    .line 207
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 208
    .line 209
    .line 210
    move-result-wide v0

    .line 211
    double-to-float v0, v0

    .line 212
    return v0

    .line 213
    :pswitch_b
    mul-float/2addr v0, v0

    .line 214
    sub-float v0, v26, v0

    .line 215
    .line 216
    float-to-double v0, v0

    .line 217
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 218
    .line 219
    .line 220
    move-result-wide v0

    .line 221
    sub-double/2addr v0, v4

    .line 222
    neg-double v0, v0

    .line 223
    double-to-float v0, v0

    .line 224
    return v0

    .line 225
    :pswitch_c
    const v1, 0x3fd9999a    # 1.7f

    .line 226
    .line 227
    .line 228
    invoke-static {v0, v1}, Lz1/b;->b(FF)F

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    return v0

    .line 233
    :pswitch_d
    sub-float v0, v0, v26

    .line 234
    .line 235
    mul-float v1, v0, v0

    .line 236
    .line 237
    float-to-double v1, v1

    .line 238
    float-to-double v6, v0

    .line 239
    mul-double v6, v6, v22

    .line 240
    .line 241
    add-double v6, v6, v16

    .line 242
    .line 243
    mul-double/2addr v1, v6

    .line 244
    add-double/2addr v1, v4

    .line 245
    double-to-float v0, v1

    .line 246
    return v0

    .line 247
    :pswitch_e
    mul-float v1, v0, v0

    .line 248
    .line 249
    float-to-double v1, v1

    .line 250
    float-to-double v3, v0

    .line 251
    mul-double v3, v3, v22

    .line 252
    .line 253
    sub-double v3, v3, v16

    .line 254
    .line 255
    mul-double/2addr v1, v3

    .line 256
    double-to-float v0, v1

    .line 257
    return v0

    .line 258
    :pswitch_f
    float-to-double v0, v0

    .line 259
    mul-double v0, v0, v18

    .line 260
    .line 261
    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    .line 262
    .line 263
    .line 264
    move-result-wide v0

    .line 265
    sub-double/2addr v0, v4

    .line 266
    mul-double v0, v0, v24

    .line 267
    .line 268
    double-to-float v0, v0

    .line 269
    return v0

    .line 270
    :pswitch_10
    float-to-double v0, v0

    .line 271
    mul-double v0, v0, v18

    .line 272
    .line 273
    div-double/2addr v0, v6

    .line 274
    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    .line 275
    .line 276
    .line 277
    move-result-wide v0

    .line 278
    double-to-float v0, v0

    .line 279
    return v0

    .line 280
    :pswitch_11
    float-to-double v0, v0

    .line 281
    mul-double v0, v0, v18

    .line 282
    .line 283
    div-double/2addr v0, v6

    .line 284
    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    .line 285
    .line 286
    .line 287
    move-result-wide v0

    .line 288
    sub-double/2addr v4, v0

    .line 289
    double-to-float v0, v4

    .line 290
    return v0

    .line 291
    :pswitch_12
    invoke-static {v0, v2, v3}, Lz1/b;->i(FD)F

    .line 292
    .line 293
    .line 294
    move-result v0

    .line 295
    return v0

    .line 296
    :pswitch_13
    invoke-static {v0, v2, v3}, Lz1/b;->j(FD)F

    .line 297
    .line 298
    .line 299
    move-result v0

    .line 300
    return v0

    .line 301
    :pswitch_14
    invoke-static {v0, v2, v3}, Lz1/b;->h(FD)F

    .line 302
    .line 303
    .line 304
    move-result v0

    .line 305
    return v0

    .line 306
    :pswitch_15
    invoke-static {v0, v14, v15}, Lz1/b;->i(FD)F

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    return v0

    .line 311
    :pswitch_16
    invoke-static {v0, v14, v15}, Lz1/b;->j(FD)F

    .line 312
    .line 313
    .line 314
    move-result v0

    .line 315
    return v0

    .line 316
    :pswitch_17
    invoke-static {v0, v14, v15}, Lz1/b;->h(FD)F

    .line 317
    .line 318
    .line 319
    move-result v0

    .line 320
    return v0

    .line 321
    :pswitch_18
    invoke-static {v0, v12, v13}, Lz1/b;->i(FD)F

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    return v0

    .line 326
    :pswitch_19
    invoke-static {v0, v12, v13}, Lz1/b;->j(FD)F

    .line 327
    .line 328
    .line 329
    move-result v0

    .line 330
    return v0

    .line 331
    :pswitch_1a
    invoke-static {v0, v12, v13}, Lz1/b;->h(FD)F

    .line 332
    .line 333
    .line 334
    move-result v0

    .line 335
    return v0

    .line 336
    :pswitch_1b
    invoke-static {v0, v6, v7}, Lz1/b;->i(FD)F

    .line 337
    .line 338
    .line 339
    move-result v0

    .line 340
    return v0

    .line 341
    :pswitch_1c
    invoke-static {v0, v6, v7}, Lz1/b;->j(FD)F

    .line 342
    .line 343
    .line 344
    move-result v0

    .line 345
    return v0

    .line 346
    :pswitch_1d
    invoke-static {v0, v6, v7}, Lz1/b;->h(FD)F

    .line 347
    .line 348
    .line 349
    move-result v0

    .line 350
    return v0

    .line 351
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

    .line 2
    const-wide v2, 0x3ff8666666666666L    # 1.525

    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    mul-double/2addr v0, v2

    .line 8
    double-to-float p1, v0

    .line 9
    const/high16 v0, 0x40000000    # 2.0f

    .line 10
    .line 11
    mul-float/2addr p0, v0

    .line 12
    const/high16 v1, 0x3f800000    # 1.0f

    .line 13
    .line 14
    cmpg-float v2, p0, v1

    .line 15
    .line 16
    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    .line 17
    .line 18
    if-gez v2, :cond_0

    .line 19
    .line 20
    mul-float v0, p0, p0

    .line 21
    .line 22
    add-float/2addr v1, p1

    .line 23
    mul-float/2addr v1, p0

    .line 24
    sub-float/2addr v1, p1

    .line 25
    mul-float/2addr v0, v1

    .line 26
    float-to-double p0, v0

    .line 27
    :goto_0
    mul-double/2addr p0, v3

    .line 28
    double-to-float p0, p0

    .line 29
    return p0

    .line 30
    :cond_0
    sub-float/2addr p0, v0

    .line 31
    mul-float v2, p0, p0

    .line 32
    .line 33
    add-float/2addr v1, p1

    .line 34
    mul-float/2addr v1, p0

    .line 35
    add-float/2addr v1, p1

    .line 36
    mul-float/2addr v2, v1

    .line 37
    add-float/2addr v2, v0

    .line 38
    float-to-double p0, v2

    .line 39
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
    invoke-static {p0}, Lz1/b;->d(F)F

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

    .line 2
    const-wide v2, 0x3fd745d1745d1746L    # 0.36363636363636365

    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    cmpg-double p0, v0, v2

    .line 8
    .line 9
    const-wide v2, 0x401e400000000000L    # 7.5625

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    if-gez p0, :cond_0

    .line 15
    .line 16
    mul-double/2addr v2, v0

    .line 17
    mul-double/2addr v2, v0

    .line 18
    :goto_0
    double-to-float p0, v2

    .line 19
    return p0

    .line 20
    :cond_0
    const-wide v4, 0x3fe745d1745d1746L    # 0.7272727272727273

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    cmpg-double p0, v0, v4

    .line 26
    .line 27
    if-gez p0, :cond_1

    .line 28
    .line 29
    const-wide v4, 0x3fe1745d1745d174L    # 0.5454545454545454

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    sub-double/2addr v0, v4

    .line 35
    double-to-float p0, v0

    .line 36
    float-to-double v0, p0

    .line 37
    mul-double/2addr v2, v0

    .line 38
    mul-double/2addr v2, v0

    .line 39
    const-wide/high16 v0, 0x3fe8000000000000L    # 0.75

    .line 40
    .line 41
    :goto_1
    add-double/2addr v2, v0

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const-wide v4, 0x3fed1745d1745d17L    # 0.9090909090909091

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    cmpg-double p0, v0, v4

    .line 49
    .line 50
    if-gez p0, :cond_2

    .line 51
    .line 52
    const-wide v4, 0x3fea2e8ba2e8ba2fL    # 0.8181818181818182

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    sub-double/2addr v0, v4

    .line 58
    double-to-float p0, v0

    .line 59
    float-to-double v0, p0

    .line 60
    mul-double/2addr v2, v0

    .line 61
    mul-double/2addr v2, v0

    .line 62
    const-wide/high16 v0, 0x3fee000000000000L    # 0.9375

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    const-wide v4, 0x3fee8ba2e8ba2e8cL    # 0.9545454545454546

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    sub-double/2addr v0, v4

    .line 71
    double-to-float p0, v0

    .line 72
    float-to-double v0, p0

    .line 73
    mul-double/2addr v2, v0

    .line 74
    mul-double/2addr v2, v0

    .line 75
    const-wide v0, 0x3fef800000000000L    # 0.984375

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
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
