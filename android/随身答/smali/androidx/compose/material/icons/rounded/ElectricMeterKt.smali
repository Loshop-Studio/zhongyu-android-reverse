.class public final Landroidx/compose/material/icons/rounded/ElectricMeterKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_electricMeter",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "ElectricMeter",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getElectricMeter",
        "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;",
        "material-icons-extended_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nElectricMeter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElectricMeter.kt\nandroidx/compose/material/icons/rounded/ElectricMeterKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,81:1\n212#2,12:82\n233#2,18:95\n253#2:132\n174#3:94\n705#4,2:113\n717#4,2:115\n719#4,11:121\n72#5,4:117\n*S KotlinDebug\n*F\n+ 1 ElectricMeter.kt\nandroidx/compose/material/icons/rounded/ElectricMeterKt\n*L\n29#1:82,12\n30#1:95,18\n30#1:132\n29#1:94\n30#1:113,2\n30#1:115,2\n30#1:121,11\n30#1:117,4\n*E\n"
    }
.end annotation


# static fields
.field private static _electricMeter:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getElectricMeter(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ElectricMeterKt;->_electricMeter:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

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
    const-string v2, "Rounded.ElectricMeter"

    .line 33
    .line 34
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    const v0, 0x413bae14    # 11.73f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x40000000    # 2.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v17, 0x40400000    # 3.0f

    .line 79
    .line 80
    const v18, 0x412b5c29    # 10.71f

    .line 81
    .line 82
    .line 83
    const v13, 0x40e1999a    # 7.05f

    .line 84
    .line 85
    .line 86
    const v14, 0x4008f5c3    # 2.14f

    .line 87
    .line 88
    .line 89
    const v15, 0x4049999a    # 3.15f

    .line 90
    .line 91
    .line 92
    const v16, 0x40c0f5c3    # 6.03f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v17, 0x40c00000    # 6.0f

    .line 99
    .line 100
    const v18, 0x410c51ec    # 8.77f

    .line 101
    .line 102
    .line 103
    const v13, -0x41fae148    # -0.13f

    .line 104
    .line 105
    .line 106
    const v14, 0x408147ae    # 4.04f

    .line 107
    .line 108
    .line 109
    const v15, 0x401ae148    # 2.42f

    .line 110
    .line 111
    .line 112
    const/high16 v16, 0x40f00000    # 7.5f

    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v0, 0x41a80000    # 21.0f

    .line 118
    .line 119
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v17, 0x3f800000    # 1.0f

    .line 123
    .line 124
    const/high16 v18, 0x3f800000    # 1.0f

    .line 125
    .line 126
    const/4 v13, 0x0

    .line 127
    const v14, 0x3f0ccccd    # 0.55f

    .line 128
    .line 129
    .line 130
    const v15, 0x3ee66666    # 0.45f

    .line 131
    .line 132
    .line 133
    const/high16 v16, 0x3f800000    # 1.0f

    .line 134
    .line 135
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/4 v0, 0x0

    .line 139
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v18, -0x40800000    # -1.0f

    .line 143
    .line 144
    const v13, 0x3f0ccccd    # 0.55f

    .line 145
    .line 146
    .line 147
    const/4 v14, 0x0

    .line 148
    const/high16 v15, 0x3f800000    # 1.0f

    .line 149
    .line 150
    const v16, -0x4119999a    # -0.45f

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v0, -0x407851ec    # -1.06f

    .line 157
    .line 158
    .line 159
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v18, 0x3d75c28f    # 0.06f

    .line 163
    .line 164
    .line 165
    const v13, 0x3ea8f5c3    # 0.33f

    .line 166
    .line 167
    .line 168
    const v14, 0x3d23d70a    # 0.04f

    .line 169
    .line 170
    .line 171
    const v15, 0x3f28f5c3    # 0.66f

    .line 172
    .line 173
    .line 174
    const v16, 0x3d75c28f    # 0.06f

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const/high16 v0, 0x3f800000    # 1.0f

    .line 181
    .line 182
    const v2, -0x428a3d71    # -0.06f

    .line 183
    .line 184
    .line 185
    const v4, 0x3f2b851f    # 0.67f

    .line 186
    .line 187
    .line 188
    const v6, -0x435c28f6    # -0.02f

    .line 189
    .line 190
    .line 191
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v0, 0x41a80000    # 21.0f

    .line 195
    .line 196
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/high16 v18, 0x3f800000    # 1.0f

    .line 200
    .line 201
    const/4 v13, 0x0

    .line 202
    const v14, 0x3f0ccccd    # 0.55f

    .line 203
    .line 204
    .line 205
    const v15, 0x3ee66666    # 0.45f

    .line 206
    .line 207
    .line 208
    const/high16 v16, 0x3f800000    # 1.0f

    .line 209
    .line 210
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/4 v0, 0x0

    .line 214
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v18, -0x40800000    # -1.0f

    .line 218
    .line 219
    const v13, 0x3f0ccccd    # 0.55f

    .line 220
    .line 221
    .line 222
    const/4 v14, 0x0

    .line 223
    const/high16 v15, 0x3f800000    # 1.0f

    .line 224
    .line 225
    const v16, -0x4119999a    # -0.45f

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v0, -0x403c28f6    # -1.53f

    .line 232
    .line 233
    .line 234
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/high16 v17, 0x40c00000    # 6.0f

    .line 238
    .line 239
    const v18, -0x3ef87ae1    # -8.47f

    .line 240
    .line 241
    .line 242
    const v13, 0x405f5c29    # 3.49f

    .line 243
    .line 244
    .line 245
    const v14, -0x406147ae    # -1.24f

    .line 246
    .line 247
    .line 248
    const/high16 v15, 0x40c00000    # 6.0f

    .line 249
    .line 250
    const v16, -0x3f6dc28f    # -4.57f

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v17, 0x413bae14    # 11.73f

    .line 257
    .line 258
    .line 259
    const/high16 v18, 0x40000000    # 2.0f

    .line 260
    .line 261
    const/high16 v13, 0x41a80000    # 21.0f

    .line 262
    .line 263
    const v14, 0x40be6666    # 5.95f

    .line 264
    .line 265
    .line 266
    const v15, 0x41868f5c    # 16.82f

    .line 267
    .line 268
    .line 269
    const v16, 0x3feccccd    # 1.85f

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v0, 0x4158a3d7    # 13.54f

    .line 279
    .line 280
    .line 281
    const v2, 0x416b5c29    # 14.71f

    .line 282
    .line 283
    .line 284
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/high16 v0, 0x41820000    # 16.25f

    .line 288
    .line 289
    const/high16 v2, 0x41400000    # 12.0f

    .line 290
    .line 291
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v17, -0x40400000    # -1.5f

    .line 295
    .line 296
    const/16 v18, 0x0

    .line 297
    .line 298
    const v13, -0x412e147b    # -0.41f

    .line 299
    .line 300
    .line 301
    const v14, 0x3ed1eb85    # 0.41f

    .line 302
    .line 303
    .line 304
    const v15, -0x40747ae1    # -1.09f

    .line 305
    .line 306
    .line 307
    const v16, 0x3ed1eb85    # 0.41f

    .line 308
    .line 309
    .line 310
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/4 v0, 0x0

    .line 314
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const/16 v17, 0x0

    .line 318
    .line 319
    const/high16 v18, -0x40400000    # -1.5f

    .line 320
    .line 321
    const v14, -0x412e147b    # -0.41f

    .line 322
    .line 323
    .line 324
    const v15, -0x412e147b    # -0.41f

    .line 325
    .line 326
    .line 327
    const v16, -0x40747ae1    # -1.09f

    .line 328
    .line 329
    .line 330
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const/high16 v0, -0x41000000    # -0.5f

    .line 334
    .line 335
    const/high16 v2, 0x3f000000    # 0.5f

    .line 336
    .line 337
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const v0, -0x40f5c28f    # -0.54f

    .line 341
    .line 342
    .line 343
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v18, -0x404b851f    # -1.41f

    .line 347
    .line 348
    .line 349
    const v13, -0x413851ec    # -0.39f

    .line 350
    .line 351
    .line 352
    const v14, -0x413851ec    # -0.39f

    .line 353
    .line 354
    .line 355
    const v15, -0x413851ec    # -0.39f

    .line 356
    .line 357
    .line 358
    const v16, -0x407d70a4    # -1.02f

    .line 359
    .line 360
    .line 361
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/high16 v0, 0x412c0000    # 10.75f

    .line 365
    .line 366
    const/high16 v2, 0x41400000    # 12.0f

    .line 367
    .line 368
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 372
    .line 373
    const/16 v18, 0x0

    .line 374
    .line 375
    const v13, 0x3ed1eb85    # 0.41f

    .line 376
    .line 377
    .line 378
    const v14, -0x412e147b    # -0.41f

    .line 379
    .line 380
    .line 381
    const v15, 0x3f8b851f    # 1.09f

    .line 382
    .line 383
    .line 384
    const v16, -0x412e147b    # -0.41f

    .line 385
    .line 386
    .line 387
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/4 v0, 0x0

    .line 391
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/16 v17, 0x0

    .line 395
    .line 396
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 397
    .line 398
    const v14, 0x3ed1eb85    # 0.41f

    .line 399
    .line 400
    .line 401
    const v15, 0x3ed1eb85    # 0.41f

    .line 402
    .line 403
    .line 404
    const v16, 0x3f8b851f    # 1.09f

    .line 405
    .line 406
    .line 407
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v0, -0x41000000    # -0.5f

    .line 411
    .line 412
    const/high16 v2, 0x3f000000    # 0.5f

    .line 413
    .line 414
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const v0, 0x3f0a3d71    # 0.54f

    .line 418
    .line 419
    .line 420
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v17, 0x4158a3d7    # 13.54f

    .line 424
    .line 425
    .line 426
    const v18, 0x416b5c29    # 14.71f

    .line 427
    .line 428
    .line 429
    const v13, 0x415ee148    # 13.93f

    .line 430
    .line 431
    .line 432
    const v14, 0x415ae148    # 13.68f

    .line 433
    .line 434
    .line 435
    const v15, 0x415ee148    # 13.93f

    .line 436
    .line 437
    .line 438
    const v16, 0x41651eb8    # 14.32f

    .line 439
    .line 440
    .line 441
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const/high16 v0, 0x41700000    # 15.0f

    .line 448
    .line 449
    const/high16 v2, 0x41100000    # 9.0f

    .line 450
    .line 451
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const/high16 v0, 0x41100000    # 9.0f

    .line 455
    .line 456
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/high16 v17, 0x41000000    # 8.0f

    .line 460
    .line 461
    const/high16 v18, 0x41000000    # 8.0f

    .line 462
    .line 463
    const v13, 0x41073333    # 8.45f

    .line 464
    .line 465
    .line 466
    const/high16 v14, 0x41100000    # 9.0f

    .line 467
    .line 468
    const/high16 v15, 0x41000000    # 8.0f

    .line 469
    .line 470
    const v16, 0x4108cccd    # 8.55f

    .line 471
    .line 472
    .line 473
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/4 v0, 0x0

    .line 477
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const/high16 v17, 0x3f800000    # 1.0f

    .line 481
    .line 482
    const/high16 v18, -0x40800000    # -1.0f

    .line 483
    .line 484
    const/4 v13, 0x0

    .line 485
    const v14, -0x40f33333    # -0.55f

    .line 486
    .line 487
    .line 488
    const v15, 0x3ee66666    # 0.45f

    .line 489
    .line 490
    .line 491
    const/high16 v16, -0x40800000    # -1.0f

    .line 492
    .line 493
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const/high16 v0, 0x40c00000    # 6.0f

    .line 497
    .line 498
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const/high16 v18, 0x3f800000    # 1.0f

    .line 502
    .line 503
    const v13, 0x3f0ccccd    # 0.55f

    .line 504
    .line 505
    .line 506
    const/4 v14, 0x0

    .line 507
    const/high16 v15, 0x3f800000    # 1.0f

    .line 508
    .line 509
    const v16, 0x3ee66666    # 0.45f

    .line 510
    .line 511
    .line 512
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/4 v0, 0x0

    .line 516
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/high16 v17, 0x41700000    # 15.0f

    .line 520
    .line 521
    const/high16 v18, 0x41100000    # 9.0f

    .line 522
    .line 523
    const/high16 v13, 0x41800000    # 16.0f

    .line 524
    .line 525
    const v14, 0x4108cccd    # 8.55f

    .line 526
    .line 527
    .line 528
    const v15, 0x4178cccd    # 15.55f

    .line 529
    .line 530
    .line 531
    const/high16 v16, 0x41100000    # 9.0f

    .line 532
    .line 533
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 540
    .line 541
    .line 542
    move-result-object v2

    .line 543
    const/16 v16, 0x3800

    .line 544
    .line 545
    const/16 v17, 0x0

    .line 546
    .line 547
    const/high16 v6, 0x3f800000    # 1.0f

    .line 548
    .line 549
    const/high16 v8, 0x3f800000    # 1.0f

    .line 550
    .line 551
    const/4 v7, 0x0

    .line 552
    const/high16 v9, 0x3f800000    # 1.0f

    .line 553
    .line 554
    const/high16 v12, 0x3f800000    # 1.0f

    .line 555
    .line 556
    const/4 v13, 0x0

    .line 557
    const/4 v14, 0x0

    .line 558
    const/4 v15, 0x0

    .line 559
    const-string v4, ""

    .line 560
    .line 561
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 562
    .line 563
    .line 564
    move-result-object v0

    .line 565
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 566
    .line 567
    .line 568
    move-result-object v0

    .line 569
    sput-object v0, Landroidx/compose/material/icons/rounded/ElectricMeterKt;->_electricMeter:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 570
    .line 571
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 572
    .line 573
    .line 574
    return-object v0
.end method
