.class public final Landroidx/compose/material/icons/outlined/PanToolAltKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _panToolAlt:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPanToolAlt(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/PanToolAltKt;->_panToolAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.PanToolAlt"

    .line 25
    .line 26
    const/high16 v5, 0x41c00000    # 24.0f

    .line 27
    .line 28
    const/high16 v6, 0x41c00000    # 24.0f

    .line 29
    .line 30
    const-wide/16 v7, 0x0

    .line 31
    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v10, 0x0

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
    const v0, 0x41971eb8    # 18.89f

    .line 71
    .line 72
    .line 73
    const v2, 0x413c51ec    # 11.77f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, -0x3f8ccccd    # -3.8f

    .line 80
    .line 81
    .line 82
    const v2, -0x402a3d71    # -1.67f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v17, 0x416a6666    # 14.65f

    .line 89
    .line 90
    .line 91
    const/high16 v18, 0x41200000    # 10.0f

    .line 92
    .line 93
    const v13, 0x416f5c29    # 14.96f

    .line 94
    .line 95
    .line 96
    const v14, 0x4120a3d7    # 10.04f

    .line 97
    .line 98
    .line 99
    const v15, 0x416cf5c3    # 14.81f

    .line 100
    .line 101
    .line 102
    const/high16 v16, 0x41200000    # 10.0f

    .line 103
    .line 104
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v0, 0x41600000    # 14.0f

    .line 108
    .line 109
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const/high16 v0, 0x40b00000    # 5.5f

    .line 113
    .line 114
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v17, 0x41380000    # 11.5f

    .line 118
    .line 119
    const/high16 v18, 0x40400000    # 3.0f

    .line 120
    .line 121
    const/high16 v13, 0x41600000    # 14.0f

    .line 122
    .line 123
    const v14, 0x4083d70a    # 4.12f

    .line 124
    .line 125
    .line 126
    const v15, 0x414e147b    # 12.88f

    .line 127
    .line 128
    .line 129
    const/high16 v16, 0x40400000    # 3.0f

    .line 130
    .line 131
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v2, 0x4083d70a    # 4.12f

    .line 135
    .line 136
    .line 137
    const/high16 v4, 0x41100000    # 9.0f

    .line 138
    .line 139
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v2, 0x41026666    # 8.15f

    .line 143
    .line 144
    .line 145
    invoke-virtual {v12, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v2, -0x4010a3d7    # -1.87f

    .line 149
    .line 150
    .line 151
    const v4, -0x41333333    # -0.4f

    .line 152
    .line 153
    .line 154
    invoke-virtual {v12, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v17, -0x40228f5c    # -1.73f

    .line 158
    .line 159
    .line 160
    const v18, 0x3f0f5c29    # 0.56f

    .line 161
    .line 162
    .line 163
    const v13, -0x41bd70a4    # -0.19f

    .line 164
    .line 165
    .line 166
    const v14, -0x430a3d71    # -0.03f

    .line 167
    .line 168
    .line 169
    const v15, -0x407d70a4    # -1.02f

    .line 170
    .line 171
    .line 172
    const v16, -0x41e66666    # -0.15f

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const/high16 v2, 0x40800000    # 4.0f

    .line 179
    .line 180
    const v4, 0x4173851f    # 15.22f

    .line 181
    .line 182
    .line 183
    invoke-virtual {v12, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v2, 0x40a3d70a    # 5.12f

    .line 187
    .line 188
    .line 189
    const v4, 0x40a6147b    # 5.19f

    .line 190
    .line 191
    .line 192
    invoke-virtual {v12, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v17, 0x41287ae1    # 10.53f

    .line 196
    .line 197
    .line 198
    const/high16 v18, 0x41a80000    # 21.0f

    .line 199
    .line 200
    const v13, 0x4117d70a    # 9.49f

    .line 201
    .line 202
    .line 203
    const v14, 0x41a651ec    # 20.79f

    .line 204
    .line 205
    .line 206
    const/high16 v15, 0x41200000    # 10.0f

    .line 207
    .line 208
    const/high16 v16, 0x41a80000    # 21.0f

    .line 209
    .line 210
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v2, 0x40d1999a    # 6.55f

    .line 214
    .line 215
    .line 216
    invoke-virtual {v12, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v17, 0x3ffc28f6    # 1.97f

    .line 220
    .line 221
    .line 222
    const v18, -0x402a3d71    # -1.67f

    .line 223
    .line 224
    .line 225
    const v13, 0x3f7ae148    # 0.98f

    .line 226
    .line 227
    .line 228
    const/4 v14, 0x0

    .line 229
    const v15, 0x3fe7ae14    # 1.81f

    .line 230
    .line 231
    .line 232
    const v16, -0x40cccccd    # -0.7f

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v2, 0x3f6b851f    # 0.92f

    .line 239
    .line 240
    .line 241
    const v4, -0x3f51eb85    # -5.44f

    .line 242
    .line 243
    .line 244
    invoke-virtual {v12, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v17, 0x41971eb8    # 18.89f

    .line 248
    .line 249
    .line 250
    const v18, 0x413c51ec    # 11.77f

    .line 251
    .line 252
    .line 253
    const v13, 0x41a0f5c3    # 20.12f

    .line 254
    .line 255
    .line 256
    const v14, 0x41507ae1    # 13.03f

    .line 257
    .line 258
    .line 259
    const v15, 0x419d70a4    # 19.68f

    .line 260
    .line 261
    .line 262
    const v16, 0x4142b852    # 12.17f

    .line 263
    .line 264
    .line 265
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v2, 0x4188a3d7    # 17.08f

    .line 272
    .line 273
    .line 274
    const/high16 v4, 0x41980000    # 19.0f

    .line 275
    .line 276
    invoke-virtual {v12, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v6, -0x3f2e6666    # -6.55f

    .line 280
    .line 281
    .line 282
    invoke-virtual {v12, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v6, -0x3f933333    # -3.7f

    .line 286
    .line 287
    .line 288
    const v7, -0x3f8e147b    # -3.78f

    .line 289
    .line 290
    .line 291
    invoke-virtual {v12, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v6, 0x41300000    # 11.0f

    .line 295
    .line 296
    const v7, 0x4180e148    # 16.11f

    .line 297
    .line 298
    .line 299
    invoke-virtual {v12, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v17, 0x41380000    # 11.5f

    .line 306
    .line 307
    const/high16 v18, 0x40a00000    # 5.0f

    .line 308
    .line 309
    const/high16 v13, 0x41300000    # 11.0f

    .line 310
    .line 311
    const v14, 0x40a70a3d    # 5.22f

    .line 312
    .line 313
    .line 314
    const v15, 0x4133851f    # 11.22f

    .line 315
    .line 316
    .line 317
    const/high16 v16, 0x40a00000    # 5.0f

    .line 318
    .line 319
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v6, 0x40a70a3d    # 5.22f

    .line 323
    .line 324
    .line 325
    const/high16 v7, 0x41400000    # 12.0f

    .line 326
    .line 327
    invoke-virtual {v12, v7, v6, v7, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v0, 0x40c5c28f    # 6.18f

    .line 331
    .line 332
    .line 333
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v0, 0x3fe147ae    # 1.76f

    .line 337
    .line 338
    .line 339
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v0, 0x41900000    # 18.0f

    .line 343
    .line 344
    const v6, 0x4158f5c3    # 13.56f

    .line 345
    .line 346
    .line 347
    invoke-virtual {v12, v0, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v12, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const-string v4, ""

    .line 365
    .line 366
    const/high16 v6, 0x3f800000    # 1.0f

    .line 367
    .line 368
    const/4 v7, 0x0

    .line 369
    const/high16 v8, 0x3f800000    # 1.0f

    .line 370
    .line 371
    const/high16 v9, 0x3f800000    # 1.0f

    .line 372
    .line 373
    const/high16 v12, 0x3f800000    # 1.0f

    .line 374
    .line 375
    const/4 v13, 0x0

    .line 376
    const/4 v14, 0x0

    .line 377
    const/4 v15, 0x0

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
    sput-object v0, Landroidx/compose/material/icons/outlined/PanToolAltKt;->_panToolAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 387
    .line 388
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 389
    .line 390
    .line 391
    return-object v0
.end method
