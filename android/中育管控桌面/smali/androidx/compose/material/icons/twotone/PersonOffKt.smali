.class public final Landroidx/compose/material/icons/twotone/PersonOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_personOff",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "PersonOff",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getPersonOff",
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
        "SMAP\nPersonOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersonOff.kt\nandroidx/compose/material/icons/twotone/PersonOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,85:1\n212#2,12:86\n233#2,18:99\n253#2:136\n233#2,18:137\n253#2:174\n174#3:98\n705#4,2:117\n717#4,2:119\n719#4,11:125\n705#4,2:155\n717#4,2:157\n719#4,11:163\n72#5,4:121\n72#5,4:159\n*S KotlinDebug\n*F\n+ 1 PersonOff.kt\nandroidx/compose/material/icons/twotone/PersonOffKt\n*L\n29#1:86,12\n30#1:99,18\n30#1:136\n44#1:137,18\n44#1:174\n29#1:98\n30#1:117,2\n30#1:119,2\n30#1:125,11\n44#1:155,2\n44#1:157,2\n44#1:163,11\n30#1:121,4\n44#1:159,4\n*E\n"
    }
.end annotation


# static fields
.field private static _personOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPersonOff(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PersonOffKt;->_personOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.PersonOff"

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
    const/high16 v4, 0x41900000    # 18.0f

    .line 71
    .line 72
    const v6, 0x4172b852    # 15.17f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 79
    .line 80
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v25, -0x41d1eb85    # -0.17f

    .line 84
    .line 85
    .line 86
    const/16 v26, 0x0

    .line 87
    .line 88
    const v21, -0x428a3d71    # -0.06f

    .line 89
    .line 90
    .line 91
    const/16 v22, 0x0

    .line 92
    .line 93
    const v23, -0x421eb852    # -0.11f

    .line 94
    .line 95
    .line 96
    const/16 v24, 0x0

    .line 97
    .line 98
    move-object/from16 v20, v2

    .line 99
    .line 100
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const v25, -0x3f50a3d7    # -5.48f

    .line 104
    .line 105
    .line 106
    const v26, 0x3fab851f    # 1.34f

    .line 107
    .line 108
    .line 109
    const v21, -0x3fe851ec    # -2.37f

    .line 110
    .line 111
    .line 112
    const v23, -0x3f76b852    # -4.29f

    .line 113
    .line 114
    .line 115
    const v24, 0x3f3ae148    # 0.73f

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v25, 0x40c00000    # 6.0f

    .line 122
    .line 123
    const v26, 0x4189c28f    # 17.22f

    .line 124
    .line 125
    .line 126
    const v21, 0x40c66666    # 6.2f

    .line 127
    .line 128
    .line 129
    const/high16 v22, 0x41840000    # 16.5f

    .line 130
    .line 131
    const/high16 v23, 0x40c00000    # 6.0f

    .line 132
    .line 133
    const v24, 0x4186b852    # 16.84f

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v4, 0x41900000    # 18.0f

    .line 140
    .line 141
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v4, 0x4172b852    # 15.17f

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v4, 0x4122147b    # 10.13f

    .line 154
    .line 155
    .line 156
    const v6, 0x40e9999a    # 7.3f

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v25, 0x41400000    # 12.0f

    .line 163
    .line 164
    const/high16 v26, 0x40c00000    # 6.0f

    .line 165
    .line 166
    const v21, 0x41268f5c    # 10.41f

    .line 167
    .line 168
    .line 169
    const v22, 0x40d147ae    # 6.54f

    .line 170
    .line 171
    .line 172
    const v23, 0x41323d71    # 11.14f

    .line 173
    .line 174
    .line 175
    const/high16 v24, 0x40c00000    # 6.0f

    .line 176
    .line 177
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const/high16 v25, 0x40000000    # 2.0f

    .line 181
    .line 182
    const/high16 v26, 0x40000000    # 2.0f

    .line 183
    .line 184
    const v21, 0x3f8ccccd    # 1.1f

    .line 185
    .line 186
    .line 187
    const/16 v22, 0x0

    .line 188
    .line 189
    const/high16 v23, 0x40000000    # 2.0f

    .line 190
    .line 191
    const v24, 0x3f666666    # 0.9f

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v25, -0x4059999a    # -1.3f

    .line 198
    .line 199
    .line 200
    const v26, 0x3fef5c29    # 1.87f

    .line 201
    .line 202
    .line 203
    const/16 v21, 0x0

    .line 204
    .line 205
    const v22, 0x3f5c28f6    # 0.86f

    .line 206
    .line 207
    .line 208
    const v23, -0x40f5c28f    # -0.54f

    .line 209
    .line 210
    .line 211
    const v24, 0x3fcb851f    # 1.59f

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    const/16 v16, 0x3800

    .line 222
    .line 223
    const/16 v17, 0x0

    .line 224
    .line 225
    const v6, 0x3e99999a    # 0.3f

    .line 226
    .line 227
    .line 228
    const v8, 0x3e99999a    # 0.3f

    .line 229
    .line 230
    .line 231
    const/4 v7, 0x0

    .line 232
    const/high16 v9, 0x3f800000    # 1.0f

    .line 233
    .line 234
    const/high16 v12, 0x3f800000    # 1.0f

    .line 235
    .line 236
    const/4 v13, 0x0

    .line 237
    const/4 v14, 0x0

    .line 238
    const/4 v15, 0x0

    .line 239
    const-string v4, ""

    .line 240
    .line 241
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 242
    .line 243
    .line 244
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 245
    .line 246
    .line 247
    move-result v3

    .line 248
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 249
    .line 250
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 251
    .line 252
    .line 253
    move-result-wide v6

    .line 254
    const/4 v0, 0x0

    .line 255
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 259
    .line 260
    .line 261
    move-result v10

    .line 262
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 263
    .line 264
    .line 265
    move-result v11

    .line 266
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 269
    .line 270
    .line 271
    const v0, 0x41895c29    # 17.17f

    .line 272
    .line 273
    .line 274
    const/high16 v2, 0x41a00000    # 20.0f

    .line 275
    .line 276
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v0, -0x3fa851ec    # -3.37f

    .line 280
    .line 281
    .line 282
    const v2, -0x3fa7ae14    # -3.38f

    .line 283
    .line 284
    .line 285
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v17, 0x3fe28f5c    # 1.77f

    .line 289
    .line 290
    .line 291
    const v18, 0x3f428f5c    # 0.76f

    .line 292
    .line 293
    .line 294
    const v13, 0x3f23d70a    # 0.64f

    .line 295
    .line 296
    .line 297
    const v14, 0x3e6147ae    # 0.22f

    .line 298
    .line 299
    .line 300
    const v15, 0x3f9d70a4    # 1.23f

    .line 301
    .line 302
    .line 303
    const v16, 0x3ef5c28f    # 0.48f

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const/high16 v17, 0x41a00000    # 20.0f

    .line 310
    .line 311
    const v18, 0x41895c29    # 17.17f

    .line 312
    .line 313
    .line 314
    const v13, 0x419af5c3    # 19.37f

    .line 315
    .line 316
    .line 317
    const v14, 0x4170f5c3    # 15.06f

    .line 318
    .line 319
    .line 320
    const v15, 0x419fd70a    # 19.98f

    .line 321
    .line 322
    .line 323
    const v16, 0x41808f5c    # 16.07f

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v0, 0x41a9851f    # 21.19f

    .line 333
    .line 334
    .line 335
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v0, 0x3fb47ae1    # 1.41f

    .line 339
    .line 340
    .line 341
    const v2, -0x404b851f    # -1.41f

    .line 342
    .line 343
    .line 344
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v0, 0x41895c29    # 17.17f

    .line 348
    .line 349
    .line 350
    const/high16 v2, 0x41a00000    # 20.0f

    .line 351
    .line 352
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/high16 v0, 0x40800000    # 4.0f

    .line 356
    .line 357
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v0, -0x3fce147b    # -2.78f

    .line 361
    .line 362
    .line 363
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const v17, 0x3fce147b    # 1.61f

    .line 367
    .line 368
    .line 369
    const v18, -0x3fd5c28f    # -2.66f

    .line 370
    .line 371
    .line 372
    const/4 v13, 0x0

    .line 373
    const v14, -0x4070a3d7    # -1.12f

    .line 374
    .line 375
    .line 376
    const v15, 0x3f1c28f6    # 0.61f

    .line 377
    .line 378
    .line 379
    const v16, -0x3ff66666    # -2.15f

    .line 380
    .line 381
    .line 382
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const v17, 0x409570a4    # 4.67f

    .line 386
    .line 387
    .line 388
    const v18, -0x40466666    # -1.45f

    .line 389
    .line 390
    .line 391
    const v13, 0x3fa51eb8    # 1.29f

    .line 392
    .line 393
    .line 394
    const v14, -0x40d70a3d    # -0.66f

    .line 395
    .line 396
    .line 397
    const v15, 0x4037ae14    # 2.87f

    .line 398
    .line 399
    .line 400
    const v16, -0x4063d70a    # -1.22f

    .line 401
    .line 402
    .line 403
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v0, 0x3fb1eb85    # 1.39f

    .line 407
    .line 408
    .line 409
    const v2, 0x40870a3d    # 4.22f

    .line 410
    .line 411
    .line 412
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v0, 0x3fb47ae1    # 1.41f

    .line 416
    .line 417
    .line 418
    const v2, -0x404b851f    # -1.41f

    .line 419
    .line 420
    .line 421
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v0, 0x41a9851f    # 21.19f

    .line 425
    .line 426
    .line 427
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const/high16 v0, 0x41900000    # 18.0f

    .line 434
    .line 435
    const v2, 0x4172b852    # 15.17f

    .line 436
    .line 437
    .line 438
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 442
    .line 443
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const v17, -0x41d1eb85    # -0.17f

    .line 447
    .line 448
    .line 449
    const/16 v18, 0x0

    .line 450
    .line 451
    const v13, -0x428a3d71    # -0.06f

    .line 452
    .line 453
    .line 454
    const/4 v14, 0x0

    .line 455
    const v15, -0x421eb852    # -0.11f

    .line 456
    .line 457
    .line 458
    const/16 v16, 0x0

    .line 459
    .line 460
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const v17, -0x3f50a3d7    # -5.48f

    .line 464
    .line 465
    .line 466
    const v18, 0x3fab851f    # 1.34f

    .line 467
    .line 468
    .line 469
    const v13, -0x3fe851ec    # -2.37f

    .line 470
    .line 471
    .line 472
    const v15, -0x3f76b852    # -4.29f

    .line 473
    .line 474
    .line 475
    const v16, 0x3f3ae148    # 0.73f

    .line 476
    .line 477
    .line 478
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const/high16 v17, 0x40c00000    # 6.0f

    .line 482
    .line 483
    const v18, 0x4189c28f    # 17.22f

    .line 484
    .line 485
    .line 486
    const v13, 0x40c66666    # 6.2f

    .line 487
    .line 488
    .line 489
    const/high16 v14, 0x41840000    # 16.5f

    .line 490
    .line 491
    const/high16 v15, 0x40c00000    # 6.0f

    .line 492
    .line 493
    const v16, 0x4186b852    # 16.84f

    .line 494
    .line 495
    .line 496
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const/high16 v0, 0x41900000    # 18.0f

    .line 500
    .line 501
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const v0, 0x4172b852    # 15.17f

    .line 505
    .line 506
    .line 507
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const/high16 v0, 0x41400000    # 12.0f

    .line 514
    .line 515
    const/high16 v2, 0x40c00000    # 6.0f

    .line 516
    .line 517
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const/high16 v17, 0x40000000    # 2.0f

    .line 521
    .line 522
    const/high16 v18, 0x40000000    # 2.0f

    .line 523
    .line 524
    const v13, 0x3f8ccccd    # 1.1f

    .line 525
    .line 526
    .line 527
    const/4 v14, 0x0

    .line 528
    const/high16 v15, 0x40000000    # 2.0f

    .line 529
    .line 530
    const v16, 0x3f666666    # 0.9f

    .line 531
    .line 532
    .line 533
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const v17, -0x4059999a    # -1.3f

    .line 537
    .line 538
    .line 539
    const v18, 0x3fef5c29    # 1.87f

    .line 540
    .line 541
    .line 542
    const/4 v13, 0x0

    .line 543
    const v14, 0x3f5c28f6    # 0.86f

    .line 544
    .line 545
    .line 546
    const v15, -0x40f5c28f    # -0.54f

    .line 547
    .line 548
    .line 549
    const v16, 0x3fcb851f    # 1.59f

    .line 550
    .line 551
    .line 552
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const v0, 0x3fbd70a4    # 1.48f

    .line 556
    .line 557
    .line 558
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const/high16 v17, 0x41800000    # 16.0f

    .line 562
    .line 563
    const/high16 v18, 0x41000000    # 8.0f

    .line 564
    .line 565
    const v13, 0x41747ae1    # 15.28f

    .line 566
    .line 567
    .line 568
    const v14, 0x412a3d71    # 10.64f

    .line 569
    .line 570
    .line 571
    const/high16 v15, 0x41800000    # 16.0f

    .line 572
    .line 573
    const v16, 0x41166666    # 9.4f

    .line 574
    .line 575
    .line 576
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const/high16 v17, -0x3f800000    # -4.0f

    .line 580
    .line 581
    const/high16 v18, -0x3f800000    # -4.0f

    .line 582
    .line 583
    const/4 v13, 0x0

    .line 584
    const v14, -0x3ff28f5c    # -2.21f

    .line 585
    .line 586
    .line 587
    const v15, -0x401ae148    # -1.79f

    .line 588
    .line 589
    .line 590
    const/high16 v16, -0x3f800000    # -4.0f

    .line 591
    .line 592
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    const v17, -0x3fa9999a    # -3.35f

    .line 596
    .line 597
    .line 598
    const v18, 0x3fe8f5c3    # 1.82f

    .line 599
    .line 600
    .line 601
    const v13, -0x404ccccd    # -1.4f

    .line 602
    .line 603
    .line 604
    const/4 v14, 0x0

    .line 605
    const v15, -0x3fd70a3d    # -2.64f

    .line 606
    .line 607
    .line 608
    const v16, 0x3f3851ec    # 0.72f

    .line 609
    .line 610
    .line 611
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const/high16 v17, 0x41400000    # 12.0f

    .line 618
    .line 619
    const/high16 v18, 0x40c00000    # 6.0f

    .line 620
    .line 621
    const v13, 0x41268f5c    # 10.41f

    .line 622
    .line 623
    .line 624
    const v14, 0x40d147ae    # 6.54f

    .line 625
    .line 626
    .line 627
    const v15, 0x41323d71    # 11.14f

    .line 628
    .line 629
    .line 630
    const/high16 v16, 0x40c00000    # 6.0f

    .line 631
    .line 632
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 639
    .line 640
    .line 641
    move-result-object v2

    .line 642
    const/16 v16, 0x3800

    .line 643
    .line 644
    const/16 v17, 0x0

    .line 645
    .line 646
    const/high16 v6, 0x3f800000    # 1.0f

    .line 647
    .line 648
    const/high16 v8, 0x3f800000    # 1.0f

    .line 649
    .line 650
    const/4 v7, 0x0

    .line 651
    const/high16 v12, 0x3f800000    # 1.0f

    .line 652
    .line 653
    const/4 v13, 0x0

    .line 654
    const/4 v14, 0x0

    .line 655
    const/4 v15, 0x0

    .line 656
    const-string v4, ""

    .line 657
    .line 658
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 659
    .line 660
    .line 661
    move-result-object v0

    .line 662
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 663
    .line 664
    .line 665
    move-result-object v0

    .line 666
    sput-object v0, Landroidx/compose/material/icons/twotone/PersonOffKt;->_personOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 667
    .line 668
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 669
    .line 670
    .line 671
    return-object v0
.end method
