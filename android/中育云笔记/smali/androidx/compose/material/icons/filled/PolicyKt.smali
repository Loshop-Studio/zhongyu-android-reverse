.class public final Landroidx/compose/material/icons/filled/PolicyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _policy:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPolicy(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/PolicyKt;->_policy:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    new-instance v1, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 10
    .line 11
    const/high16 v0, 0x41c00000    # 24.0f

    .line 12
    .line 13
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    const/16 v11, 0x60

    .line 22
    .line 23
    const/4 v12, 0x0

    .line 24
    const/4 v10, 0x0

    .line 25
    const/high16 v5, 0x41c00000    # 24.0f

    .line 26
    .line 27
    const/high16 v6, 0x41c00000    # 24.0f

    .line 28
    .line 29
    const-wide/16 v7, 0x0

    .line 30
    .line 31
    const/4 v9, 0x0

    .line 32
    const-string v2, "Filled.Policy"

    .line 33
    .line 34
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/n;)V

    .line 35
    .line 36
    .line 37
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 42
    .line 43
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 44
    .line 45
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 46
    .line 47
    .line 48
    move-result-wide v6

    .line 49
    const/4 v2, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 51
    .line 52
    .line 53
    sget-object v18, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v19, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const/high16 v4, 0x41a80000    # 21.0f

    .line 71
    .line 72
    const/high16 v6, 0x40a00000    # 5.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, -0x3ef00000    # -9.0f

    .line 78
    .line 79
    const/high16 v6, -0x3f800000    # -4.0f

    .line 80
    .line 81
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const/high16 v4, 0x40400000    # 3.0f

    .line 85
    .line 86
    const/high16 v6, 0x40a00000    # 5.0f

    .line 87
    .line 88
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 89
    .line 90
    .line 91
    const/high16 v4, 0x40c00000    # 6.0f

    .line 92
    .line 93
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v25, 0x41100000    # 9.0f

    .line 97
    .line 98
    const/high16 v26, 0x41400000    # 12.0f

    .line 99
    .line 100
    const/16 v21, 0x0

    .line 101
    .line 102
    const v22, 0x40b1999a    # 5.55f

    .line 103
    .line 104
    .line 105
    const v23, 0x4075c28f    # 3.84f

    .line 106
    .line 107
    .line 108
    const v24, 0x412bd70a    # 10.74f

    .line 109
    .line 110
    .line 111
    move-object/from16 v20, v2

    .line 112
    .line 113
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v25, 0x40bc28f6    # 5.88f

    .line 117
    .line 118
    .line 119
    const v26, -0x3f928f5c    # -3.71f

    .line 120
    .line 121
    .line 122
    const v21, 0x40133333    # 2.3f

    .line 123
    .line 124
    .line 125
    const v22, -0x40f0a3d7    # -0.56f

    .line 126
    .line 127
    .line 128
    const v23, 0x408a8f5c    # 4.33f

    .line 129
    .line 130
    .line 131
    const v24, -0x400ccccd    # -1.9f

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v4, -0x3fb851ec    # -3.12f

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v25, -0x3f36b852    # -6.29f

    .line 144
    .line 145
    .line 146
    const v26, -0x40dc28f6    # -0.64f

    .line 147
    .line 148
    .line 149
    const v21, -0x4007ae14    # -1.94f

    .line 150
    .line 151
    .line 152
    const v22, 0x3fa51eb8    # 1.29f

    .line 153
    .line 154
    .line 155
    const v23, -0x3f6d70a4    # -4.58f

    .line 156
    .line 157
    .line 158
    const v24, 0x3f88f5c3    # 1.07f

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/16 v25, 0x0

    .line 165
    .line 166
    const v26, -0x3f1dc28f    # -7.07f

    .line 167
    .line 168
    .line 169
    const v21, -0x40066666    # -1.95f

    .line 170
    .line 171
    .line 172
    const v22, -0x40066666    # -1.95f

    .line 173
    .line 174
    .line 175
    const v23, -0x40066666    # -1.95f

    .line 176
    .line 177
    .line 178
    const v24, -0x3f5c28f6    # -5.12f

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v25, 0x40e23d71    # 7.07f

    .line 185
    .line 186
    .line 187
    const/16 v26, 0x0

    .line 188
    .line 189
    const v21, 0x3ff9999a    # 1.95f

    .line 190
    .line 191
    .line 192
    const v23, 0x40a3d70a    # 5.12f

    .line 193
    .line 194
    .line 195
    const v24, -0x40066666    # -1.95f

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v25, 0x3f23d70a    # 0.64f

    .line 202
    .line 203
    .line 204
    const v26, 0x40c947ae    # 6.29f

    .line 205
    .line 206
    .line 207
    const v21, 0x3fdae148    # 1.71f

    .line 208
    .line 209
    .line 210
    const v22, 0x3fdae148    # 1.71f

    .line 211
    .line 212
    .line 213
    const v23, 0x3ff5c28f    # 1.92f

    .line 214
    .line 215
    .line 216
    const v24, 0x408b3333    # 4.35f

    .line 217
    .line 218
    .line 219
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v4, 0x4039999a    # 2.9f

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v25, 0x41a80000    # 21.0f

    .line 229
    .line 230
    const/high16 v26, 0x41300000    # 11.0f

    .line 231
    .line 232
    const v21, 0x41a251ec    # 20.29f

    .line 233
    .line 234
    .line 235
    const v22, 0x417b0a3d    # 15.69f

    .line 236
    .line 237
    .line 238
    const/high16 v23, 0x41a80000    # 21.0f

    .line 239
    .line 240
    const v24, 0x4156147b    # 13.38f

    .line 241
    .line 242
    .line 243
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/high16 v4, 0x40a00000    # 5.0f

    .line 247
    .line 248
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    const/16 v16, 0x3800

    .line 259
    .line 260
    const/16 v17, 0x0

    .line 261
    .line 262
    const/high16 v6, 0x3f800000    # 1.0f

    .line 263
    .line 264
    const/high16 v8, 0x3f800000    # 1.0f

    .line 265
    .line 266
    const/4 v7, 0x0

    .line 267
    const/high16 v9, 0x3f800000    # 1.0f

    .line 268
    .line 269
    const/high16 v12, 0x3f800000    # 1.0f

    .line 270
    .line 271
    const/4 v13, 0x0

    .line 272
    const/4 v14, 0x0

    .line 273
    const/4 v15, 0x0

    .line 274
    const-string v4, ""

    .line 275
    .line 276
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 277
    .line 278
    .line 279
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 280
    .line 281
    .line 282
    move-result v3

    .line 283
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 284
    .line 285
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 286
    .line 287
    .line 288
    move-result-wide v6

    .line 289
    const/4 v0, 0x0

    .line 290
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 294
    .line 295
    .line 296
    move-result v10

    .line 297
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 298
    .line 299
    .line 300
    move-result v11

    .line 301
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 304
    .line 305
    .line 306
    const/high16 v0, 0x41400000    # 12.0f

    .line 307
    .line 308
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 312
    .line 313
    const/4 v2, 0x0

    .line 314
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const/high16 v18, 0x40c00000    # 6.0f

    .line 318
    .line 319
    const/16 v19, 0x0

    .line 320
    .line 321
    const/high16 v13, 0x40400000    # 3.0f

    .line 322
    .line 323
    const/high16 v14, 0x40400000    # 3.0f

    .line 324
    .line 325
    const/16 v16, 0x1

    .line 326
    .line 327
    const/16 v17, 0x1

    .line 328
    .line 329
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v18, -0x3f400000    # -6.0f

    .line 333
    .line 334
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    const/16 v16, 0x3800

    .line 342
    .line 343
    const/16 v17, 0x0

    .line 344
    .line 345
    const/high16 v6, 0x3f800000    # 1.0f

    .line 346
    .line 347
    const/4 v7, 0x0

    .line 348
    const/high16 v12, 0x3f800000    # 1.0f

    .line 349
    .line 350
    const/4 v13, 0x0

    .line 351
    const/4 v14, 0x0

    .line 352
    const-string v4, ""

    .line 353
    .line 354
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    sput-object v0, Landroidx/compose/material/icons/filled/PolicyKt;->_policy:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 363
    .line 364
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 365
    .line 366
    .line 367
    return-object v0
.end method
