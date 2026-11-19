.class public final Landroidx/compose/material/icons/filled/FireplaceKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _fireplace:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFireplace(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/FireplaceKt;->_fireplace:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.Fireplace"

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
    const/4 v0, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v0, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const/high16 v0, 0x40000000    # 2.0f

    .line 71
    .line 72
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 73
    .line 74
    .line 75
    const/high16 v0, 0x41a00000    # 20.0f

    .line 76
    .line 77
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v0, 0x40000000    # 2.0f

    .line 84
    .line 85
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v0, 0x413dc28f    # 11.86f

    .line 95
    .line 96
    .line 97
    const v2, 0x4187ae14    # 16.96f

    .line 98
    .line 99
    .line 100
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const v17, 0x3fc3d70a    # 1.53f

    .line 104
    .line 105
    .line 106
    const v18, -0x402f5c29    # -1.63f

    .line 107
    .line 108
    .line 109
    const v13, 0x3f428f5c    # 0.76f

    .line 110
    .line 111
    .line 112
    const v14, -0x418a3d71    # -0.24f

    .line 113
    .line 114
    .line 115
    const v15, 0x3fb33333    # 1.4f

    .line 116
    .line 117
    .line 118
    const v16, -0x407ae148    # -1.04f

    .line 119
    .line 120
    .line 121
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v17, -0x41b33333    # -0.2f

    .line 125
    .line 126
    .line 127
    const v18, -0x40333333    # -1.6f

    .line 128
    .line 129
    .line 130
    const v13, 0x3e051eb8    # 0.13f

    .line 131
    .line 132
    .line 133
    const v14, -0x40f0a3d7    # -0.56f

    .line 134
    .line 135
    .line 136
    const v15, -0x42333333    # -0.1f

    .line 137
    .line 138
    .line 139
    const v16, -0x4079999a    # -1.05f

    .line 140
    .line 141
    .line 142
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v17, 0x3da3d70a    # 0.08f

    .line 146
    .line 147
    .line 148
    const v18, -0x405c28f6    # -1.28f

    .line 149
    .line 150
    .line 151
    const v13, -0x425c28f6    # -0.08f

    .line 152
    .line 153
    .line 154
    const v14, -0x41147ae1    # -0.46f

    .line 155
    .line 156
    .line 157
    const v15, -0x4270a3d7    # -0.07f

    .line 158
    .line 159
    .line 160
    const v16, -0x40a66666    # -0.85f

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v17, 0x3ffd70a4    # 1.98f

    .line 167
    .line 168
    .line 169
    const v18, 0x404b851f    # 3.18f

    .line 170
    .line 171
    .line 172
    const v13, 0x3f0a3d71    # 0.54f

    .line 173
    .line 174
    .line 175
    const v14, 0x3f9ae148    # 1.21f

    .line 176
    .line 177
    .line 178
    const v15, 0x4009999a    # 2.15f

    .line 179
    .line 180
    .line 181
    const v16, 0x3fd1eb85    # 1.64f

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v17, 0x413dc28f    # 11.86f

    .line 188
    .line 189
    .line 190
    const v18, 0x4187ae14    # 16.96f

    .line 191
    .line 192
    .line 193
    const v13, 0x4170f5c3    # 15.06f

    .line 194
    .line 195
    .line 196
    const v14, 0x418aa3d7    # 17.33f

    .line 197
    .line 198
    .line 199
    const v15, 0x41523d71    # 13.14f

    .line 200
    .line 201
    .line 202
    const v16, 0x4190147b    # 18.01f

    .line 203
    .line 204
    .line 205
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v0, 0x41a00000    # 20.0f

    .line 212
    .line 213
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v0, -0x40000000    # -2.0f

    .line 217
    .line 218
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v0, -0x3ffeb852    # -2.02f

    .line 225
    .line 226
    .line 227
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v17, 0x3f828f5c    # 1.02f

    .line 231
    .line 232
    .line 233
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 234
    .line 235
    const v13, 0x3f2147ae    # 0.63f

    .line 236
    .line 237
    .line 238
    const v14, -0x40a8f5c3    # -0.84f

    .line 239
    .line 240
    .line 241
    const v15, 0x3f828f5c    # 1.02f

    .line 242
    .line 243
    .line 244
    const v16, -0x4010a3d7    # -1.87f

    .line 245
    .line 246
    .line 247
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v17, -0x40133333    # -1.85f

    .line 251
    .line 252
    .line 253
    const v18, -0x3fa851ec    # -3.37f

    .line 254
    .line 255
    .line 256
    const/4 v13, 0x0

    .line 257
    const v14, -0x400e147b    # -1.89f

    .line 258
    .line 259
    .line 260
    const v15, -0x40747ae1    # -1.09f

    .line 261
    .line 262
    .line 263
    const v16, -0x3fc9999a    # -2.85f

    .line 264
    .line 265
    .line 266
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/high16 v17, 0x41500000    # 13.0f

    .line 270
    .line 271
    const/high16 v18, 0x40e00000    # 7.0f

    .line 272
    .line 273
    const v13, 0x41433333    # 12.2f

    .line 274
    .line 275
    .line 276
    const v14, 0x4119c28f    # 9.61f

    .line 277
    .line 278
    .line 279
    const/high16 v15, 0x41500000    # 13.0f

    .line 280
    .line 281
    const/high16 v16, 0x40e00000    # 7.0f

    .line 282
    .line 283
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const/high16 v17, -0x3f400000    # -6.0f

    .line 287
    .line 288
    const/high16 v18, 0x41000000    # 8.0f

    .line 289
    .line 290
    const v13, -0x3f28a3d7    # -6.73f

    .line 291
    .line 292
    .line 293
    const v14, 0x40647ae1    # 3.57f

    .line 294
    .line 295
    .line 296
    const v15, -0x3f3f5c29    # -6.02f

    .line 297
    .line 298
    .line 299
    const v16, 0x40ef0a3d    # 7.47f

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v17, 0x3f9d70a4    # 1.23f

    .line 306
    .line 307
    .line 308
    const/high16 v18, 0x40400000    # 3.0f

    .line 309
    .line 310
    const v13, 0x3cf5c28f    # 0.03f

    .line 311
    .line 312
    .line 313
    const v14, 0x3f75c28f    # 0.96f

    .line 314
    .line 315
    .line 316
    const v15, 0x3efae148    # 0.49f

    .line 317
    .line 318
    .line 319
    const v16, 0x40047ae1    # 2.07f

    .line 320
    .line 321
    .line 322
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const/high16 v0, 0x40c00000    # 6.0f

    .line 326
    .line 327
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/high16 v0, 0x40000000    # 2.0f

    .line 331
    .line 332
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v0, 0x40800000    # 4.0f

    .line 336
    .line 337
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const/high16 v0, 0x41800000    # 16.0f

    .line 344
    .line 345
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const/high16 v0, 0x41a00000    # 20.0f

    .line 349
    .line 350
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 357
    .line 358
    .line 359
    move-result-object v2

    .line 360
    const/16 v16, 0x3800

    .line 361
    .line 362
    const/16 v17, 0x0

    .line 363
    .line 364
    const/high16 v6, 0x3f800000    # 1.0f

    .line 365
    .line 366
    const/high16 v8, 0x3f800000    # 1.0f

    .line 367
    .line 368
    const/4 v7, 0x0

    .line 369
    const/high16 v9, 0x3f800000    # 1.0f

    .line 370
    .line 371
    const/high16 v12, 0x3f800000    # 1.0f

    .line 372
    .line 373
    const/4 v13, 0x0

    .line 374
    const/4 v14, 0x0

    .line 375
    const/4 v15, 0x0

    .line 376
    const-string v4, ""

    .line 377
    .line 378
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    sput-object v0, Landroidx/compose/material/icons/filled/FireplaceKt;->_fireplace:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 387
    .line 388
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 389
    .line 390
    .line 391
    return-object v0
.end method
