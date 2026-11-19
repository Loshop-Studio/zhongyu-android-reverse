.class public final Landroidx/compose/material/icons/twotone/VrpanoKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_vrpano",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Vrpano",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getVrpano",
        "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nVrpano.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vrpano.kt\nandroidx/compose/material/icons/twotone/VrpanoKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,85:1\n212#2,12:86\n233#2,18:99\n253#2:136\n233#2,18:137\n253#2:174\n233#2,18:175\n253#2:212\n174#3:98\n705#4,2:117\n717#4,2:119\n719#4,11:125\n705#4,2:155\n717#4,2:157\n719#4,11:163\n705#4,2:193\n717#4,2:195\n719#4,11:201\n72#5,4:121\n72#5,4:159\n72#5,4:197\n*S KotlinDebug\n*F\n+ 1 Vrpano.kt\nandroidx/compose/material/icons/twotone/VrpanoKt\n*L\n29#1:86,12\n30#1:99,18\n30#1:136\n48#1:137,18\n48#1:174\n70#1:175,18\n70#1:212\n29#1:98\n30#1:117,2\n30#1:119,2\n30#1:125,11\n48#1:155,2\n48#1:157,2\n48#1:163,11\n70#1:193,2\n70#1:195,2\n70#1:201,11\n30#1:121,4\n48#1:159,4\n70#1:197,4\n*E\n"
    }
.end annotation


# static fields
.field private static _vrpano:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getVrpano(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/VrpanoKt;->_vrpano:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Vrpano"

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
    const/4 v2, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    const v4, 0x40cc28f6    # 6.38f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x40800000    # 4.0f

    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v4, 0x41340000    # 11.25f

    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v25, 0x41000000    # 8.0f

    .line 84
    .line 85
    const v26, -0x406f5c29    # -1.13f

    .line 86
    .line 87
    .line 88
    const v21, 0x4000a3d7    # 2.01f

    .line 89
    .line 90
    .line 91
    const v22, -0x40e8f5c3    # -0.59f

    .line 92
    .line 93
    .line 94
    const v23, 0x4093851f    # 4.61f

    .line 95
    .line 96
    .line 97
    const v24, -0x406f5c29    # -1.13f

    .line 98
    .line 99
    .line 100
    move-object/from16 v20, v2

    .line 101
    .line 102
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v26, 0x3f90a3d7    # 1.13f

    .line 106
    .line 107
    .line 108
    const v21, 0x405851ec    # 3.38f

    .line 109
    .line 110
    .line 111
    const/16 v22, 0x0

    .line 112
    .line 113
    const v23, 0x40bfae14    # 5.99f

    .line 114
    .line 115
    .line 116
    const v24, 0x3f0a3d71    # 0.54f

    .line 117
    .line 118
    .line 119
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const v4, 0x40cbd70a    # 6.37f

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v25, -0x3f000000    # -8.0f

    .line 129
    .line 130
    const v21, -0x3fff5c29    # -2.01f

    .line 131
    .line 132
    .line 133
    const v22, 0x3f170a3d    # 0.59f

    .line 134
    .line 135
    .line 136
    const v23, -0x3f6c28f6    # -4.62f

    .line 137
    .line 138
    .line 139
    const v24, 0x3f90a3d7    # 1.13f

    .line 140
    .line 141
    .line 142
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const/high16 v25, 0x40800000    # 4.0f

    .line 146
    .line 147
    const v26, 0x40cc28f6    # 6.38f

    .line 148
    .line 149
    .line 150
    const v21, 0x41151eb8    # 9.32f

    .line 151
    .line 152
    .line 153
    const/high16 v22, 0x40f00000    # 7.5f

    .line 154
    .line 155
    const v23, 0x40d28f5c    # 6.58f

    .line 156
    .line 157
    .line 158
    const v24, 0x40e3851f    # 7.11f

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v4, 0x41766666    # 15.4f

    .line 168
    .line 169
    .line 170
    const v6, 0x4194147b    # 18.51f

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/high16 v25, 0x41400000    # 12.0f

    .line 177
    .line 178
    const/high16 v26, 0x41700000    # 15.0f

    .line 179
    .line 180
    const v21, 0x418428f6    # 16.52f

    .line 181
    .line 182
    .line 183
    const v22, 0x41726666    # 15.15f

    .line 184
    .line 185
    .line 186
    const v23, 0x4164cccd    # 14.3f

    .line 187
    .line 188
    .line 189
    const/high16 v24, 0x41700000    # 15.0f

    .line 190
    .line 191
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v25, -0x3f2f5c29    # -6.52f

    .line 195
    .line 196
    .line 197
    const v26, 0x3ed1eb85    # 0.41f

    .line 198
    .line 199
    .line 200
    const v21, -0x3fea3d71    # -2.34f

    .line 201
    .line 202
    .line 203
    const/16 v22, 0x0

    .line 204
    .line 205
    const v23, -0x3f6f5c29    # -4.52f

    .line 206
    .line 207
    .line 208
    const v24, 0x3e19999a    # 0.15f

    .line 209
    .line 210
    .line 211
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v4, 0x406c28f6    # 3.69f

    .line 215
    .line 216
    .line 217
    const v6, -0x3f728f5c    # -4.42f

    .line 218
    .line 219
    .line 220
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v4, 0x40000000    # 2.0f

    .line 224
    .line 225
    const v6, 0x4019999a    # 2.4f

    .line 226
    .line 227
    .line 228
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const/high16 v4, 0x41200000    # 10.0f

    .line 232
    .line 233
    const/high16 v6, 0x41600000    # 14.0f

    .line 234
    .line 235
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v4, 0x41766666    # 15.4f

    .line 239
    .line 240
    .line 241
    const v6, 0x4194147b    # 18.51f

    .line 242
    .line 243
    .line 244
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    const/16 v16, 0x3800

    .line 255
    .line 256
    const/16 v17, 0x0

    .line 257
    .line 258
    const v6, 0x3e99999a    # 0.3f

    .line 259
    .line 260
    .line 261
    const v8, 0x3e99999a    # 0.3f

    .line 262
    .line 263
    .line 264
    const/4 v7, 0x0

    .line 265
    const/high16 v9, 0x3f800000    # 1.0f

    .line 266
    .line 267
    const/high16 v12, 0x3f800000    # 1.0f

    .line 268
    .line 269
    const/4 v13, 0x0

    .line 270
    const/4 v14, 0x0

    .line 271
    const/4 v15, 0x0

    .line 272
    const-string v4, ""

    .line 273
    .line 274
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 275
    .line 276
    .line 277
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 278
    .line 279
    .line 280
    move-result v3

    .line 281
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 282
    .line 283
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 284
    .line 285
    .line 286
    move-result-wide v6

    .line 287
    const/4 v2, 0x0

    .line 288
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 292
    .line 293
    .line 294
    move-result v10

    .line 295
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 296
    .line 297
    .line 298
    move-result v11

    .line 299
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 302
    .line 303
    .line 304
    const v4, 0x41a8147b    # 21.01f

    .line 305
    .line 306
    .line 307
    const/high16 v6, 0x40800000    # 4.0f

    .line 308
    .line 309
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v25, 0x41400000    # 12.0f

    .line 313
    .line 314
    const/high16 v26, 0x40b00000    # 5.5f

    .line 315
    .line 316
    const v21, 0x41a3999a    # 20.45f

    .line 317
    .line 318
    .line 319
    const/high16 v22, 0x40800000    # 4.0f

    .line 320
    .line 321
    const v23, 0x418b3333    # 17.4f

    .line 322
    .line 323
    .line 324
    const/high16 v24, 0x40b00000    # 5.5f

    .line 325
    .line 326
    move-object/from16 v20, v2

    .line 327
    .line 328
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v25, -0x3eefd70a    # -9.01f

    .line 332
    .line 333
    .line 334
    const v26, -0x404147ae    # -1.49f

    .line 335
    .line 336
    .line 337
    const v21, -0x3f56147b    # -5.31f

    .line 338
    .line 339
    .line 340
    const/16 v22, 0x0

    .line 341
    .line 342
    const v23, -0x3ef828f6    # -8.49f

    .line 343
    .line 344
    .line 345
    const v24, -0x404147ae    # -1.49f

    .line 346
    .line 347
    .line 348
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const/high16 v25, 0x40000000    # 2.0f

    .line 352
    .line 353
    const v26, 0x40a0a3d7    # 5.02f

    .line 354
    .line 355
    .line 356
    const v21, 0x401d70a4    # 2.46f

    .line 357
    .line 358
    .line 359
    const v22, 0x408051ec    # 4.01f

    .line 360
    .line 361
    .line 362
    const/high16 v23, 0x40000000    # 2.0f

    .line 363
    .line 364
    const v24, 0x408e6666    # 4.45f

    .line 365
    .line 366
    .line 367
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v4, 0x41980000    # 19.0f

    .line 371
    .line 372
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v25, 0x3f7d70a4    # 0.99f

    .line 376
    .line 377
    .line 378
    const/high16 v26, 0x3f800000    # 1.0f

    .line 379
    .line 380
    const/16 v21, 0x0

    .line 381
    .line 382
    const v22, 0x3f11eb85    # 0.57f

    .line 383
    .line 384
    .line 385
    const v23, 0x3eeb851f    # 0.46f

    .line 386
    .line 387
    .line 388
    const/high16 v24, 0x3f800000    # 1.0f

    .line 389
    .line 390
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v25, 0x411028f6    # 9.01f

    .line 394
    .line 395
    .line 396
    const/high16 v26, -0x40400000    # -1.5f

    .line 397
    .line 398
    const v21, 0x3f11eb85    # 0.57f

    .line 399
    .line 400
    .line 401
    const/16 v22, 0x0

    .line 402
    .line 403
    const v23, 0x40633333    # 3.55f

    .line 404
    .line 405
    .line 406
    const/high16 v24, -0x40400000    # -1.5f

    .line 407
    .line 408
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 412
    .line 413
    const v21, 0x40ad70a4    # 5.42f

    .line 414
    .line 415
    .line 416
    const v23, 0x41070a3d    # 8.44f

    .line 417
    .line 418
    .line 419
    const/high16 v24, 0x3fc00000    # 1.5f

    .line 420
    .line 421
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v25, 0x3f7d70a4    # 0.99f

    .line 425
    .line 426
    .line 427
    const/high16 v26, -0x40800000    # -1.0f

    .line 428
    .line 429
    const v21, 0x3f07ae14    # 0.53f

    .line 430
    .line 431
    .line 432
    const v23, 0x3f7d70a4    # 0.99f

    .line 433
    .line 434
    .line 435
    const v24, -0x4123d70a    # -0.43f

    .line 436
    .line 437
    .line 438
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v4, 0x40a00000    # 5.0f

    .line 442
    .line 443
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const v25, 0x41a8147b    # 21.01f

    .line 447
    .line 448
    .line 449
    const/high16 v26, 0x40800000    # 4.0f

    .line 450
    .line 451
    const/high16 v21, 0x41b00000    # 22.0f

    .line 452
    .line 453
    const v22, 0x408dc28f    # 4.43f

    .line 454
    .line 455
    .line 456
    const v23, 0x41ac51ec    # 21.54f

    .line 457
    .line 458
    .line 459
    const/high16 v24, 0x40800000    # 4.0f

    .line 460
    .line 461
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const/high16 v4, 0x41a00000    # 20.0f

    .line 468
    .line 469
    const v6, 0x418d0a3d    # 17.63f

    .line 470
    .line 471
    .line 472
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const/high16 v25, -0x3f000000    # -8.0f

    .line 476
    .line 477
    const v26, -0x406f5c29    # -1.13f

    .line 478
    .line 479
    .line 480
    const v21, -0x3fff5c29    # -2.01f

    .line 481
    .line 482
    .line 483
    const v22, -0x40e8f5c3    # -0.59f

    .line 484
    .line 485
    .line 486
    const v23, -0x3f6c28f6    # -4.62f

    .line 487
    .line 488
    .line 489
    const v24, -0x406f5c29    # -1.13f

    .line 490
    .line 491
    .line 492
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const v26, 0x3f90a3d7    # 1.13f

    .line 496
    .line 497
    .line 498
    const v21, -0x3fa70a3d    # -3.39f

    .line 499
    .line 500
    .line 501
    const/16 v22, 0x0

    .line 502
    .line 503
    const v23, -0x3f4051ec    # -5.99f

    .line 504
    .line 505
    .line 506
    const v24, 0x3f0a3d71    # 0.54f

    .line 507
    .line 508
    .line 509
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const v4, 0x40cc28f6    # 6.38f

    .line 513
    .line 514
    .line 515
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const/high16 v25, 0x41400000    # 12.0f

    .line 519
    .line 520
    const/high16 v26, 0x40f00000    # 7.5f

    .line 521
    .line 522
    const v21, 0x40d28f5c    # 6.58f

    .line 523
    .line 524
    .line 525
    const v22, 0x40e3851f    # 7.11f

    .line 526
    .line 527
    .line 528
    const v23, 0x41151eb8    # 9.32f

    .line 529
    .line 530
    .line 531
    const/high16 v24, 0x40f00000    # 7.5f

    .line 532
    .line 533
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const/high16 v25, 0x41000000    # 8.0f

    .line 537
    .line 538
    const v26, -0x406f5c29    # -1.13f

    .line 539
    .line 540
    .line 541
    const v21, 0x405851ec    # 3.38f

    .line 542
    .line 543
    .line 544
    const/16 v22, 0x0

    .line 545
    .line 546
    const v23, 0x40bfae14    # 5.99f

    .line 547
    .line 548
    .line 549
    const v24, -0x40f5c28f    # -0.54f

    .line 550
    .line 551
    .line 552
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const v4, 0x418d0a3d    # 17.63f

    .line 556
    .line 557
    .line 558
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 565
    .line 566
    .line 567
    move-result-object v2

    .line 568
    const/high16 v6, 0x3f800000    # 1.0f

    .line 569
    .line 570
    const/high16 v8, 0x3f800000    # 1.0f

    .line 571
    .line 572
    const/4 v7, 0x0

    .line 573
    const-string v4, ""

    .line 574
    .line 575
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 576
    .line 577
    .line 578
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 579
    .line 580
    .line 581
    move-result v3

    .line 582
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 583
    .line 584
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 585
    .line 586
    .line 587
    move-result-wide v6

    .line 588
    const/4 v0, 0x0

    .line 589
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 590
    .line 591
    .line 592
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 593
    .line 594
    .line 595
    move-result v10

    .line 596
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 597
    .line 598
    .line 599
    move-result v11

    .line 600
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 603
    .line 604
    .line 605
    const v0, 0x412fd70a    # 10.99f

    .line 606
    .line 607
    .line 608
    const v2, 0x4112b852    # 9.17f

    .line 609
    .line 610
    .line 611
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const v0, -0x3f93d70a    # -3.69f

    .line 615
    .line 616
    .line 617
    const v2, 0x408d70a4    # 4.42f

    .line 618
    .line 619
    .line 620
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const/high16 v17, 0x41400000    # 12.0f

    .line 624
    .line 625
    const/high16 v18, 0x41700000    # 15.0f

    .line 626
    .line 627
    const v13, 0x40ef5c29    # 7.48f

    .line 628
    .line 629
    .line 630
    const v14, 0x41726666    # 15.15f

    .line 631
    .line 632
    .line 633
    const v15, 0x411a8f5c    # 9.66f

    .line 634
    .line 635
    .line 636
    const/high16 v16, 0x41700000    # 15.0f

    .line 637
    .line 638
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const v17, 0x40d051ec    # 6.51f

    .line 642
    .line 643
    .line 644
    const v18, 0x3ecccccd    # 0.4f

    .line 645
    .line 646
    .line 647
    const v13, 0x40133333    # 2.3f

    .line 648
    .line 649
    .line 650
    const/4 v14, 0x0

    .line 651
    const v15, 0x4090a3d7    # 4.52f

    .line 652
    .line 653
    .line 654
    const v16, 0x3e19999a    # 0.15f

    .line 655
    .line 656
    .line 657
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const/high16 v0, 0x41200000    # 10.0f

    .line 661
    .line 662
    const/high16 v2, 0x41600000    # 14.0f

    .line 663
    .line 664
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    const v0, -0x3fcae148    # -2.83f

    .line 668
    .line 669
    .line 670
    const v2, 0x4058f5c3    # 3.39f

    .line 671
    .line 672
    .line 673
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const v0, 0x412fd70a    # 10.99f

    .line 677
    .line 678
    .line 679
    const v2, 0x4112b852    # 9.17f

    .line 680
    .line 681
    .line 682
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 683
    .line 684
    .line 685
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 689
    .line 690
    .line 691
    move-result-object v2

    .line 692
    const/16 v16, 0x3800

    .line 693
    .line 694
    const/16 v17, 0x0

    .line 695
    .line 696
    const/high16 v6, 0x3f800000    # 1.0f

    .line 697
    .line 698
    const/4 v7, 0x0

    .line 699
    const/high16 v12, 0x3f800000    # 1.0f

    .line 700
    .line 701
    const/4 v13, 0x0

    .line 702
    const/4 v15, 0x0

    .line 703
    const-string v4, ""

    .line 704
    .line 705
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 706
    .line 707
    .line 708
    move-result-object v0

    .line 709
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 710
    .line 711
    .line 712
    move-result-object v0

    .line 713
    sput-object v0, Landroidx/compose/material/icons/twotone/VrpanoKt;->_vrpano:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 714
    .line 715
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 716
    .line 717
    .line 718
    return-object v0
.end method
