.class public abstract Li5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, ";"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Li5/a;->a:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    return-void
.end method

.method public static a(Landroid/hardware/Camera$Parameters;Landroid/graphics/Point;)Landroid/graphics/Point;
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Landroid/hardware/Camera$Parameters;->getSupportedPictureSizes()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "Parameters contained no preview size!"

    .line 8
    .line 9
    const-string v3, "CameraConfiguration"

    .line 10
    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    const-string v0, "Device returned no supported preview sizes; using default"

    .line 14
    .line 15
    invoke-static {v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    invoke-virtual/range {p0 .. p0}, Landroid/hardware/Camera$Parameters;->getPreviewSize()Landroid/hardware/Camera$Size;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    new-instance v1, Landroid/graphics/Point;

    .line 25
    .line 26
    iget v2, v0, Landroid/hardware/Camera$Size;->width:I

    .line 27
    .line 28
    iget v0, v0, Landroid/hardware/Camera$Size;->height:I

    .line 29
    .line 30
    invoke-direct {v1, v2, v0}, Landroid/graphics/Point;-><init>(II)V

    .line 31
    .line 32
    .line 33
    return-object v1

    .line 34
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v0

    .line 40
    :cond_1
    const/4 v4, 0x4

    .line 41
    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_3

    .line 46
    .line 47
    new-instance v4, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    if-eqz v6, :cond_2

    .line 61
    .line 62
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    check-cast v6, Landroid/hardware/Camera$Size;

    .line 67
    .line 68
    iget v7, v6, Landroid/hardware/Camera$Size;->width:I

    .line 69
    .line 70
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const/16 v7, 0x78

    .line 74
    .line 75
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget v6, v6, Landroid/hardware/Camera$Size;->height:I

    .line 79
    .line 80
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const/16 v6, 0x20

    .line 84
    .line 85
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_2
    new-instance v5, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    .line 93
    .line 94
    const-string v6, "Supported camera sizes: "

    .line 95
    .line 96
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    invoke-static {v3, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    :cond_3
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    const/4 v5, 0x0

    .line 114
    const/4 v6, 0x0

    .line 115
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v7

    .line 119
    if-eqz v7, :cond_b

    .line 120
    .line 121
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v7

    .line 125
    check-cast v7, Landroid/hardware/Camera$Size;

    .line 126
    .line 127
    iget v8, v7, Landroid/hardware/Camera$Size;->width:I

    .line 128
    .line 129
    iget v9, v7, Landroid/hardware/Camera$Size;->height:I

    .line 130
    .line 131
    mul-int v10, v8, v9

    .line 132
    .line 133
    const v11, 0x5dc00

    .line 134
    .line 135
    .line 136
    if-ge v10, v11, :cond_4

    .line 137
    .line 138
    move-object v15, v5

    .line 139
    goto/16 :goto_5

    .line 140
    .line 141
    :cond_4
    if-ge v8, v9, :cond_5

    .line 142
    .line 143
    const/4 v11, 0x1

    .line 144
    goto :goto_2

    .line 145
    :cond_5
    const/4 v11, 0x0

    .line 146
    :goto_2
    if-eqz v11, :cond_6

    .line 147
    .line 148
    move v12, v9

    .line 149
    goto :goto_3

    .line 150
    :cond_6
    move v12, v8

    .line 151
    :goto_3
    if-eqz v11, :cond_7

    .line 152
    .line 153
    move v11, v8

    .line 154
    goto :goto_4

    .line 155
    :cond_7
    move v11, v9

    .line 156
    :goto_4
    int-to-double v13, v12

    .line 157
    move-object v15, v5

    .line 158
    int-to-double v4, v11

    .line 159
    div-double/2addr v13, v4

    .line 160
    new-instance v4, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 163
    .line 164
    .line 165
    const-string v5, "picture aspectRatio-->>"

    .line 166
    .line 167
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v4, v13, v14}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    invoke-static {v3, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 178
    .line 179
    .line 180
    new-instance v4, Ljava/lang/StringBuilder;

    .line 181
    .line 182
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 183
    .line 184
    .line 185
    const-string v5, "picture width="

    .line 186
    .line 187
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    const-string v5, ",height="

    .line 194
    .line 195
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    invoke-static {v3, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 206
    .line 207
    .line 208
    const-wide v4, 0x3ff68f5c28f5c28fL    # 1.41

    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    sub-double/2addr v13, v4

    .line 214
    invoke-static {v13, v14}, Ljava/lang/Math;->abs(D)D

    .line 215
    .line 216
    .line 217
    move-result-wide v4

    .line 218
    const-wide v13, 0x3fc3333333333333L    # 0.15

    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    cmpl-double v4, v4, v13

    .line 224
    .line 225
    if-gtz v4, :cond_a

    .line 226
    .line 227
    const/16 v4, 0x7d0

    .line 228
    .line 229
    if-lt v12, v4, :cond_a

    .line 230
    .line 231
    const/16 v4, 0xfa0

    .line 232
    .line 233
    if-le v12, v4, :cond_8

    .line 234
    .line 235
    goto :goto_5

    .line 236
    :cond_8
    iget v4, v0, Landroid/graphics/Point;->x:I

    .line 237
    .line 238
    if-ne v12, v4, :cond_9

    .line 239
    .line 240
    iget v4, v0, Landroid/graphics/Point;->y:I

    .line 241
    .line 242
    if-ne v11, v4, :cond_9

    .line 243
    .line 244
    new-instance v0, Landroid/graphics/Point;

    .line 245
    .line 246
    invoke-direct {v0, v8, v9}, Landroid/graphics/Point;-><init>(II)V

    .line 247
    .line 248
    .line 249
    new-instance v1, Ljava/lang/StringBuilder;

    .line 250
    .line 251
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 252
    .line 253
    .line 254
    const-string v2, "Found camera size exactly matching screen size: "

    .line 255
    .line 256
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    invoke-static {v3, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 267
    .line 268
    .line 269
    return-object v0

    .line 270
    :cond_9
    if-le v10, v6, :cond_a

    .line 271
    .line 272
    move-object v5, v7

    .line 273
    move v6, v10

    .line 274
    goto/16 :goto_1

    .line 275
    .line 276
    :cond_a
    :goto_5
    move-object v5, v15

    .line 277
    goto/16 :goto_1

    .line 278
    .line 279
    :cond_b
    move-object v15, v5

    .line 280
    if-eqz v15, :cond_c

    .line 281
    .line 282
    new-instance v0, Landroid/graphics/Point;

    .line 283
    .line 284
    move-object v5, v15

    .line 285
    iget v1, v5, Landroid/hardware/Camera$Size;->width:I

    .line 286
    .line 287
    iget v2, v5, Landroid/hardware/Camera$Size;->height:I

    .line 288
    .line 289
    invoke-direct {v0, v1, v2}, Landroid/graphics/Point;-><init>(II)V

    .line 290
    .line 291
    .line 292
    new-instance v1, Ljava/lang/StringBuilder;

    .line 293
    .line 294
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 295
    .line 296
    .line 297
    const-string v2, "Using largest suitable camera size: "

    .line 298
    .line 299
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v1

    .line 309
    invoke-static {v3, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 310
    .line 311
    .line 312
    return-object v0

    .line 313
    :cond_c
    invoke-virtual/range {p0 .. p0}, Landroid/hardware/Camera$Parameters;->getPreviewSize()Landroid/hardware/Camera$Size;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    if-eqz v0, :cond_d

    .line 318
    .line 319
    new-instance v1, Landroid/graphics/Point;

    .line 320
    .line 321
    iget v2, v0, Landroid/hardware/Camera$Size;->width:I

    .line 322
    .line 323
    iget v0, v0, Landroid/hardware/Camera$Size;->height:I

    .line 324
    .line 325
    invoke-direct {v1, v2, v0}, Landroid/graphics/Point;-><init>(II)V

    .line 326
    .line 327
    .line 328
    new-instance v0, Ljava/lang/StringBuilder;

    .line 329
    .line 330
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 331
    .line 332
    .line 333
    const-string v2, "No suitable preview sizes, using default: "

    .line 334
    .line 335
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    invoke-static {v3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 346
    .line 347
    .line 348
    return-object v1

    .line 349
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 350
    .line 351
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    throw v0
.end method

.method public static b(Landroid/hardware/Camera$Parameters;Landroid/graphics/Point;F)Landroid/graphics/Point;
    .locals 18

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Landroid/hardware/Camera$Parameters;->getSupportedPreviewSizes()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "Parameters contained no preview size!"

    .line 8
    .line 9
    const-string v3, "CameraConfiguration"

    .line 10
    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    const-string v0, "Device returned no supported preview sizes; using default"

    .line 14
    .line 15
    invoke-static {v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    invoke-virtual/range {p0 .. p0}, Landroid/hardware/Camera$Parameters;->getPreviewSize()Landroid/hardware/Camera$Size;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    new-instance v1, Landroid/graphics/Point;

    .line 25
    .line 26
    iget v2, v0, Landroid/hardware/Camera$Size;->width:I

    .line 27
    .line 28
    iget v0, v0, Landroid/hardware/Camera$Size;->height:I

    .line 29
    .line 30
    invoke-direct {v1, v2, v0}, Landroid/graphics/Point;-><init>(II)V

    .line 31
    .line 32
    .line 33
    return-object v1

    .line 34
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v0

    .line 40
    :cond_1
    const/4 v4, 0x4

    .line 41
    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_3

    .line 46
    .line 47
    new-instance v4, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    if-eqz v6, :cond_2

    .line 61
    .line 62
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    check-cast v6, Landroid/hardware/Camera$Size;

    .line 67
    .line 68
    iget v7, v6, Landroid/hardware/Camera$Size;->width:I

    .line 69
    .line 70
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const/16 v7, 0x78

    .line 74
    .line 75
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget v6, v6, Landroid/hardware/Camera$Size;->height:I

    .line 79
    .line 80
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const/16 v6, 0x20

    .line 84
    .line 85
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_2
    new-instance v5, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    .line 93
    .line 94
    const-string v6, "Supported preview sizes: "

    .line 95
    .line 96
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    invoke-static {v3, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    :cond_3
    move/from16 v4, p2

    .line 110
    .line 111
    float-to-double v4, v4

    .line 112
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    const/4 v7, 0x0

    .line 117
    const/4 v8, 0x0

    .line 118
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result v9

    .line 122
    if-eqz v9, :cond_b

    .line 123
    .line 124
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v9

    .line 128
    check-cast v9, Landroid/hardware/Camera$Size;

    .line 129
    .line 130
    iget v10, v9, Landroid/hardware/Camera$Size;->width:I

    .line 131
    .line 132
    iget v11, v9, Landroid/hardware/Camera$Size;->height:I

    .line 133
    .line 134
    mul-int v12, v10, v11

    .line 135
    .line 136
    const v13, 0x5dc00

    .line 137
    .line 138
    .line 139
    if-ge v12, v13, :cond_4

    .line 140
    .line 141
    move-wide/from16 v16, v4

    .line 142
    .line 143
    move-object v15, v7

    .line 144
    goto :goto_6

    .line 145
    :cond_4
    if-ge v10, v11, :cond_5

    .line 146
    .line 147
    const/4 v13, 0x1

    .line 148
    goto :goto_2

    .line 149
    :cond_5
    const/4 v13, 0x0

    .line 150
    :goto_2
    if-eqz v13, :cond_6

    .line 151
    .line 152
    move v14, v11

    .line 153
    goto :goto_3

    .line 154
    :cond_6
    move v14, v10

    .line 155
    :goto_3
    if-eqz v13, :cond_7

    .line 156
    .line 157
    move v13, v10

    .line 158
    :goto_4
    move-object v15, v7

    .line 159
    goto :goto_5

    .line 160
    :cond_7
    move v13, v11

    .line 161
    goto :goto_4

    .line 162
    :goto_5
    int-to-double v6, v14

    .line 163
    move-wide/from16 v16, v4

    .line 164
    .line 165
    int-to-double v4, v13

    .line 166
    div-double/2addr v6, v4

    .line 167
    new-instance v4, Ljava/lang/StringBuilder;

    .line 168
    .line 169
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 170
    .line 171
    .line 172
    const-string v5, "aspectRatio-->>"

    .line 173
    .line 174
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v4, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    invoke-static {v3, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 185
    .line 186
    .line 187
    sub-double v6, v6, v16

    .line 188
    .line 189
    invoke-static {v6, v7}, Ljava/lang/Math;->abs(D)D

    .line 190
    .line 191
    .line 192
    move-result-wide v4

    .line 193
    const-wide v6, 0x3fc3333333333333L    # 0.15

    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    cmpl-double v4, v4, v6

    .line 199
    .line 200
    if-lez v4, :cond_9

    .line 201
    .line 202
    :cond_8
    :goto_6
    move-object v7, v15

    .line 203
    :goto_7
    move-wide/from16 v4, v16

    .line 204
    .line 205
    goto :goto_1

    .line 206
    :cond_9
    iget v4, v0, Landroid/graphics/Point;->x:I

    .line 207
    .line 208
    if-ne v14, v4, :cond_a

    .line 209
    .line 210
    iget v4, v0, Landroid/graphics/Point;->y:I

    .line 211
    .line 212
    if-ne v13, v4, :cond_a

    .line 213
    .line 214
    new-instance v0, Landroid/graphics/Point;

    .line 215
    .line 216
    invoke-direct {v0, v10, v11}, Landroid/graphics/Point;-><init>(II)V

    .line 217
    .line 218
    .line 219
    new-instance v1, Ljava/lang/StringBuilder;

    .line 220
    .line 221
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 222
    .line 223
    .line 224
    const-string v2, "Found preview size exactly matching screen size: "

    .line 225
    .line 226
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    invoke-static {v3, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 237
    .line 238
    .line 239
    return-object v0

    .line 240
    :cond_a
    if-le v12, v8, :cond_8

    .line 241
    .line 242
    move-object v7, v9

    .line 243
    move v8, v12

    .line 244
    goto :goto_7

    .line 245
    :cond_b
    move-object v15, v7

    .line 246
    if-eqz v15, :cond_c

    .line 247
    .line 248
    new-instance v0, Landroid/graphics/Point;

    .line 249
    .line 250
    iget v1, v15, Landroid/hardware/Camera$Size;->width:I

    .line 251
    .line 252
    iget v2, v15, Landroid/hardware/Camera$Size;->height:I

    .line 253
    .line 254
    invoke-direct {v0, v1, v2}, Landroid/graphics/Point;-><init>(II)V

    .line 255
    .line 256
    .line 257
    new-instance v1, Ljava/lang/StringBuilder;

    .line 258
    .line 259
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 260
    .line 261
    .line 262
    const-string v2, "Using largest suitable preview size: "

    .line 263
    .line 264
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    invoke-static {v3, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 275
    .line 276
    .line 277
    return-object v0

    .line 278
    :cond_c
    invoke-virtual/range {p0 .. p0}, Landroid/hardware/Camera$Parameters;->getPreviewSize()Landroid/hardware/Camera$Size;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    if-eqz v0, :cond_d

    .line 283
    .line 284
    new-instance v1, Landroid/graphics/Point;

    .line 285
    .line 286
    iget v2, v0, Landroid/hardware/Camera$Size;->width:I

    .line 287
    .line 288
    iget v0, v0, Landroid/hardware/Camera$Size;->height:I

    .line 289
    .line 290
    invoke-direct {v1, v2, v0}, Landroid/graphics/Point;-><init>(II)V

    .line 291
    .line 292
    .line 293
    new-instance v0, Ljava/lang/StringBuilder;

    .line 294
    .line 295
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 296
    .line 297
    .line 298
    const-string v2, "No suitable preview sizes, using default: "

    .line 299
    .line 300
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    invoke-static {v3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 311
    .line 312
    .line 313
    return-object v1

    .line 314
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 315
    .line 316
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    throw v0
.end method
