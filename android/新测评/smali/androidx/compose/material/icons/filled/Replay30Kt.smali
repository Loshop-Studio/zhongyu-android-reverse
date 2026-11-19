.class public final Landroidx/compose/material/icons/filled/Replay30Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_replay30",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Replay30",
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getReplay30",
        "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nReplay30.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Replay30.kt\nandroidx/compose/material/icons/filled/Replay30Kt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,145:1\n212#2,12:146\n233#2,18:159\n253#2:196\n233#2,18:197\n253#2:234\n233#2,18:235\n253#2:272\n174#3:158\n705#4,2:177\n717#4,2:179\n719#4,11:185\n705#4,2:215\n717#4,2:217\n719#4,11:223\n705#4,2:253\n717#4,2:255\n719#4,11:261\n72#5,4:181\n72#5,4:219\n72#5,4:257\n*S KotlinDebug\n*F\n+ 1 Replay30.kt\nandroidx/compose/material/icons/filled/Replay30Kt\n*L\n29#1:146,12\n30#1:159,18\n30#1:196\n45#1:197,18\n45#1:234\n98#1:235,18\n98#1:272\n29#1:158\n30#1:177,2\n30#1:179,2\n30#1:185,11\n45#1:215,2\n45#1:217,2\n45#1:223,11\n98#1:253,2\n98#1:255,2\n98#1:261,11\n30#1:181,4\n45#1:219,4\n98#1:257,4\n*E\n"
    }
.end annotation


# static fields
.field private static _replay30:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getReplay30(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/Replay30Kt;->_replay30:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.Replay30"

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
    const/high16 v4, 0x41400000    # 12.0f

    .line 71
    .line 72
    const/high16 v6, 0x40a00000    # 5.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x3f800000    # 1.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x40e00000    # 7.0f

    .line 83
    .line 84
    const/high16 v6, 0x40c00000    # 6.0f

    .line 85
    .line 86
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 87
    .line 88
    .line 89
    const/high16 v4, 0x40a00000    # 5.0f

    .line 90
    .line 91
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const/high16 v4, 0x40e00000    # 7.0f

    .line 95
    .line 96
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v25, 0x40c00000    # 6.0f

    .line 100
    .line 101
    const/high16 v26, 0x40c00000    # 6.0f

    .line 102
    .line 103
    const v21, 0x4053d70a    # 3.31f

    .line 104
    .line 105
    .line 106
    const/16 v22, 0x0

    .line 107
    .line 108
    const/high16 v23, 0x40c00000    # 6.0f

    .line 109
    .line 110
    const v24, 0x402c28f6    # 2.69f

    .line 111
    .line 112
    .line 113
    move-object/from16 v20, v2

    .line 114
    .line 115
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const/high16 v4, 0x40c00000    # 6.0f

    .line 119
    .line 120
    const/high16 v7, -0x3f400000    # -6.0f

    .line 121
    .line 122
    const v8, -0x3fd3d70a    # -2.69f

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2, v8, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v4, -0x3fd3d70a    # -2.69f

    .line 129
    .line 130
    .line 131
    const/high16 v6, -0x3f400000    # -6.0f

    .line 132
    .line 133
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v4, 0x40800000    # 4.0f

    .line 137
    .line 138
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v25, 0x41000000    # 8.0f

    .line 142
    .line 143
    const/high16 v26, 0x41000000    # 8.0f

    .line 144
    .line 145
    const/16 v21, 0x0

    .line 146
    .line 147
    const v22, 0x408d70a4    # 4.42f

    .line 148
    .line 149
    .line 150
    const v23, 0x40651eb8    # 3.58f

    .line 151
    .line 152
    .line 153
    const/high16 v24, 0x41000000    # 8.0f

    .line 154
    .line 155
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v4, 0x41000000    # 8.0f

    .line 159
    .line 160
    const/high16 v6, -0x3f000000    # -8.0f

    .line 161
    .line 162
    const/high16 v7, 0x41000000    # 8.0f

    .line 163
    .line 164
    const v8, -0x3f9ae148    # -3.58f

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v4, 0x41835c29    # 16.42f

    .line 171
    .line 172
    .line 173
    const/high16 v6, 0x41400000    # 12.0f

    .line 174
    .line 175
    const/high16 v7, 0x40a00000    # 5.0f

    .line 176
    .line 177
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    const/16 v16, 0x3800

    .line 188
    .line 189
    const/16 v17, 0x0

    .line 190
    .line 191
    const/high16 v6, 0x3f800000    # 1.0f

    .line 192
    .line 193
    const/high16 v8, 0x3f800000    # 1.0f

    .line 194
    .line 195
    const/4 v7, 0x0

    .line 196
    const/high16 v9, 0x3f800000    # 1.0f

    .line 197
    .line 198
    const/high16 v12, 0x3f800000    # 1.0f

    .line 199
    .line 200
    const/4 v13, 0x0

    .line 201
    const/4 v14, 0x0

    .line 202
    const/4 v15, 0x0

    .line 203
    const-string v4, ""

    .line 204
    .line 205
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 206
    .line 207
    .line 208
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 209
    .line 210
    .line 211
    move-result v3

    .line 212
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 213
    .line 214
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 215
    .line 216
    .line 217
    move-result-wide v6

    .line 218
    const/4 v2, 0x0

    .line 219
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 223
    .line 224
    .line 225
    move-result v10

    .line 226
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 227
    .line 228
    .line 229
    move-result v11

    .line 230
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 233
    .line 234
    .line 235
    const v4, 0x4118f5c3    # 9.56f

    .line 236
    .line 237
    .line 238
    const v6, 0x4157d70a    # 13.49f

    .line 239
    .line 240
    .line 241
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v4, 0x3ee66666    # 0.45f

    .line 245
    .line 246
    .line 247
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v25, 0x3ef5c28f    # 0.48f

    .line 251
    .line 252
    .line 253
    const v26, -0x41dc28f6    # -0.16f

    .line 254
    .line 255
    .line 256
    const v21, 0x3e570a3d    # 0.21f

    .line 257
    .line 258
    .line 259
    const/16 v22, 0x0

    .line 260
    .line 261
    const v23, 0x3ebd70a4    # 0.37f

    .line 262
    .line 263
    .line 264
    const v24, -0x42b33333    # -0.05f

    .line 265
    .line 266
    .line 267
    move-object/from16 v20, v2

    .line 268
    .line 269
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v4, -0x4123d70a    # -0.43f

    .line 273
    .line 274
    .line 275
    const v6, 0x3e23d70a    # 0.16f

    .line 276
    .line 277
    .line 278
    const/high16 v7, -0x41800000    # -0.25f

    .line 279
    .line 280
    invoke-virtual {v2, v6, v7, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v25, -0x42dc28f6    # -0.04f

    .line 284
    .line 285
    .line 286
    const v26, -0x419eb852    # -0.22f

    .line 287
    .line 288
    .line 289
    const/16 v21, 0x0

    .line 290
    .line 291
    const v22, -0x425c28f6    # -0.08f

    .line 292
    .line 293
    .line 294
    const v23, -0x43dc28f6    # -0.01f

    .line 295
    .line 296
    .line 297
    const v24, -0x41e66666    # -0.15f

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const v4, -0x428a3d71    # -0.06f

    .line 304
    .line 305
    .line 306
    const v6, -0x41d1eb85    # -0.17f

    .line 307
    .line 308
    .line 309
    const v7, -0x421eb852    # -0.11f

    .line 310
    .line 311
    .line 312
    const v8, -0x420a3d71    # -0.12f

    .line 313
    .line 314
    .line 315
    invoke-virtual {v2, v4, v8, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v4, -0x4247ae14    # -0.09f

    .line 319
    .line 320
    .line 321
    const v6, -0x41c7ae14    # -0.18f

    .line 322
    .line 323
    .line 324
    invoke-virtual {v2, v7, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v4, -0x41dc28f6    # -0.16f

    .line 328
    .line 329
    .line 330
    const/high16 v6, -0x41800000    # -0.25f

    .line 331
    .line 332
    const v7, -0x42dc28f6    # -0.04f

    .line 333
    .line 334
    .line 335
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v25, -0x419eb852    # -0.22f

    .line 339
    .line 340
    .line 341
    const v26, 0x3cf5c28f    # 0.03f

    .line 342
    .line 343
    .line 344
    const v21, -0x425c28f6    # -0.08f

    .line 345
    .line 346
    .line 347
    const/16 v22, 0x0

    .line 348
    .line 349
    const v23, -0x41e66666    # -0.15f

    .line 350
    .line 351
    .line 352
    const v24, 0x3c23d70a    # 0.01f

    .line 353
    .line 354
    .line 355
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v4, -0x41fae148    # -0.13f

    .line 359
    .line 360
    .line 361
    const v6, 0x3d4ccccd    # 0.05f

    .line 362
    .line 363
    .line 364
    const v7, 0x3dcccccd    # 0.1f

    .line 365
    .line 366
    .line 367
    const v8, -0x41c7ae14    # -0.18f

    .line 368
    .line 369
    .line 370
    invoke-virtual {v2, v4, v6, v8, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v4, 0x3e19999a    # 0.15f

    .line 374
    .line 375
    .line 376
    const v6, 0x3db851ec    # 0.09f

    .line 377
    .line 378
    .line 379
    const v7, -0x4247ae14    # -0.09f

    .line 380
    .line 381
    .line 382
    const v8, -0x420a3d71    # -0.12f

    .line 383
    .line 384
    .line 385
    invoke-virtual {v2, v7, v6, v8, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v4, 0x3e4ccccd    # 0.2f

    .line 389
    .line 390
    .line 391
    const v6, 0x3e051eb8    # 0.13f

    .line 392
    .line 393
    .line 394
    const v7, -0x42b33333    # -0.05f

    .line 395
    .line 396
    .line 397
    invoke-virtual {v2, v7, v6, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v4, 0x410a6666    # 8.65f

    .line 401
    .line 402
    .line 403
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v25, 0x3de147ae    # 0.11f

    .line 407
    .line 408
    .line 409
    const v26, -0x410a3d71    # -0.48f

    .line 410
    .line 411
    .line 412
    const/16 v21, 0x0

    .line 413
    .line 414
    const v22, -0x41c7ae14    # -0.18f

    .line 415
    .line 416
    .line 417
    const v23, 0x3d23d70a    # 0.04f

    .line 418
    .line 419
    .line 420
    const v24, -0x4151eb85    # -0.34f

    .line 421
    .line 422
    .line 423
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const v4, 0x3e99999a    # 0.3f

    .line 427
    .line 428
    .line 429
    const v6, -0x41428f5c    # -0.37f

    .line 430
    .line 431
    .line 432
    const v7, 0x3e2e147b    # 0.17f

    .line 433
    .line 434
    .line 435
    const v8, -0x4175c28f    # -0.27f

    .line 436
    .line 437
    .line 438
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v4, 0x3e8a3d71    # 0.27f

    .line 442
    .line 443
    .line 444
    const v6, 0x3ee147ae    # 0.44f

    .line 445
    .line 446
    .line 447
    const v7, -0x41947ae1    # -0.23f

    .line 448
    .line 449
    .line 450
    const v8, -0x41c7ae14    # -0.18f

    .line 451
    .line 452
    .line 453
    invoke-virtual {v2, v4, v8, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const v4, 0x3f0a3d71    # 0.54f

    .line 457
    .line 458
    .line 459
    const v6, -0x425c28f6    # -0.08f

    .line 460
    .line 461
    .line 462
    const v7, 0x3eb33333    # 0.35f

    .line 463
    .line 464
    .line 465
    const v8, -0x425c28f6    # -0.08f

    .line 466
    .line 467
    .line 468
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v25, 0x3f170a3d    # 0.59f

    .line 472
    .line 473
    .line 474
    const v26, 0x3da3d70a    # 0.08f

    .line 475
    .line 476
    .line 477
    const v21, 0x3e570a3d    # 0.21f

    .line 478
    .line 479
    .line 480
    const/16 v22, 0x0

    .line 481
    .line 482
    const v23, 0x3ed1eb85    # 0.41f

    .line 483
    .line 484
    .line 485
    const v24, 0x3cf5c28f    # 0.03f

    .line 486
    .line 487
    .line 488
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const v4, 0x3eeb851f    # 0.46f

    .line 492
    .line 493
    .line 494
    const v6, 0x3e6b851f    # 0.23f

    .line 495
    .line 496
    .line 497
    const v7, 0x3e051eb8    # 0.13f

    .line 498
    .line 499
    .line 500
    const v8, 0x3ea8f5c3    # 0.33f

    .line 501
    .line 502
    .line 503
    invoke-virtual {v2, v8, v7, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v4, 0x3e99999a    # 0.3f

    .line 507
    .line 508
    .line 509
    const v6, 0x3ec28f5c    # 0.38f

    .line 510
    .line 511
    .line 512
    const v7, 0x3e6b851f    # 0.23f

    .line 513
    .line 514
    .line 515
    invoke-virtual {v2, v7, v7, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const v4, 0x3f07ae14    # 0.53f

    .line 519
    .line 520
    .line 521
    const v6, 0x3ea8f5c3    # 0.33f

    .line 522
    .line 523
    .line 524
    const v7, 0x3de147ae    # 0.11f

    .line 525
    .line 526
    .line 527
    invoke-virtual {v2, v7, v6, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const v25, -0x42dc28f6    # -0.04f

    .line 531
    .line 532
    .line 533
    const v26, 0x3e8a3d71    # 0.27f

    .line 534
    .line 535
    .line 536
    const/16 v21, 0x0

    .line 537
    .line 538
    const v22, 0x3db851ec    # 0.09f

    .line 539
    .line 540
    .line 541
    const v23, -0x43dc28f6    # -0.01f

    .line 542
    .line 543
    .line 544
    const v24, 0x3e3851ec    # 0.18f

    .line 545
    .line 546
    .line 547
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const v4, -0x41fae148    # -0.13f

    .line 551
    .line 552
    .line 553
    const/high16 v6, 0x3e800000    # 0.25f

    .line 554
    .line 555
    const v7, 0x3e2e147b    # 0.17f

    .line 556
    .line 557
    .line 558
    const v8, -0x4270a3d7    # -0.07f

    .line 559
    .line 560
    .line 561
    invoke-virtual {v2, v8, v7, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const v4, -0x41b33333    # -0.2f

    .line 565
    .line 566
    .line 567
    const v6, 0x3e6147ae    # 0.22f

    .line 568
    .line 569
    .line 570
    const v7, -0x420a3d71    # -0.12f

    .line 571
    .line 572
    .line 573
    const v8, 0x3e19999a    # 0.15f

    .line 574
    .line 575
    .line 576
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const v4, 0x3df5c28f    # 0.12f

    .line 580
    .line 581
    .line 582
    const v6, -0x4170a3d7    # -0.28f

    .line 583
    .line 584
    .line 585
    const v7, -0x41d1eb85    # -0.17f

    .line 586
    .line 587
    .line 588
    const v8, 0x3e2e147b    # 0.17f

    .line 589
    .line 590
    .line 591
    invoke-virtual {v2, v7, v4, v6, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const v25, 0x3f0a3d71    # 0.54f

    .line 595
    .line 596
    .line 597
    const v26, 0x3ec7ae14    # 0.39f

    .line 598
    .line 599
    .line 600
    const v21, 0x3e75c28f    # 0.24f

    .line 601
    .line 602
    .line 603
    const v23, 0x3ed70a3d    # 0.42f

    .line 604
    .line 605
    .line 606
    const v24, 0x3e570a3d    # 0.21f

    .line 607
    .line 608
    .line 609
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    const v4, 0x3ec28f5c    # 0.38f

    .line 613
    .line 614
    .line 615
    const v6, 0x3f1c28f6    # 0.61f

    .line 616
    .line 617
    .line 618
    const v7, 0x3e3851ec    # 0.18f

    .line 619
    .line 620
    .line 621
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const v25, -0x420a3d71    # -0.12f

    .line 625
    .line 626
    .line 627
    const v26, 0x3f07ae14    # 0.53f

    .line 628
    .line 629
    .line 630
    const/16 v21, 0x0

    .line 631
    .line 632
    const v22, 0x3e4ccccd    # 0.2f

    .line 633
    .line 634
    .line 635
    const v23, -0x42dc28f6    # -0.04f

    .line 636
    .line 637
    .line 638
    const v24, 0x3ec28f5c    # 0.38f

    .line 639
    .line 640
    .line 641
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const v4, -0x415c28f6    # -0.32f

    .line 645
    .line 646
    .line 647
    const v6, 0x3ec7ae14    # 0.39f

    .line 648
    .line 649
    .line 650
    const v7, -0x41c7ae14    # -0.18f

    .line 651
    .line 652
    .line 653
    const v8, 0x3e947ae1    # 0.29f

    .line 654
    .line 655
    .line 656
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    const v4, -0x410a3d71    # -0.48f

    .line 660
    .line 661
    .line 662
    const v6, 0x3e75c28f    # 0.24f

    .line 663
    .line 664
    .line 665
    const v7, -0x416b851f    # -0.29f

    .line 666
    .line 667
    .line 668
    const v8, 0x3e428f5c    # 0.19f

    .line 669
    .line 670
    .line 671
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    const v4, -0x40e66666    # -0.6f

    .line 675
    .line 676
    .line 677
    const v6, 0x3da3d70a    # 0.08f

    .line 678
    .line 679
    .line 680
    const v7, -0x413d70a4    # -0.38f

    .line 681
    .line 682
    .line 683
    const v8, 0x3da3d70a    # 0.08f

    .line 684
    .line 685
    .line 686
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const v25, -0x40f851ec    # -0.53f

    .line 690
    .line 691
    .line 692
    const v26, -0x4270a3d7    # -0.07f

    .line 693
    .line 694
    .line 695
    const v21, -0x41c7ae14    # -0.18f

    .line 696
    .line 697
    .line 698
    const/16 v22, 0x0

    .line 699
    .line 700
    const v23, -0x4147ae14    # -0.36f

    .line 701
    .line 702
    .line 703
    const v24, -0x435c28f6    # -0.02f

    .line 704
    .line 705
    .line 706
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    const v4, -0x41147ae1    # -0.46f

    .line 710
    .line 711
    .line 712
    const v6, -0x41947ae1    # -0.23f

    .line 713
    .line 714
    .line 715
    const v7, -0x41570a3d    # -0.33f

    .line 716
    .line 717
    .line 718
    const v8, -0x420a3d71    # -0.12f

    .line 719
    .line 720
    .line 721
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 722
    .line 723
    .line 724
    const v4, -0x413d70a4    # -0.38f

    .line 725
    .line 726
    .line 727
    const/high16 v8, -0x41800000    # -0.25f

    .line 728
    .line 729
    invoke-virtual {v2, v8, v6, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    const v4, -0x4151eb85    # -0.34f

    .line 733
    .line 734
    .line 735
    const v6, -0x40f33333    # -0.55f

    .line 736
    .line 737
    .line 738
    const v7, -0x420a3d71    # -0.12f

    .line 739
    .line 740
    .line 741
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 742
    .line 743
    .line 744
    const v4, 0x3f59999a    # 0.85f

    .line 745
    .line 746
    .line 747
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 748
    .line 749
    .line 750
    const v25, 0x3d4ccccd    # 0.05f

    .line 751
    .line 752
    .line 753
    const v26, 0x3e6147ae    # 0.22f

    .line 754
    .line 755
    .line 756
    const/16 v21, 0x0

    .line 757
    .line 758
    const v22, 0x3da3d70a    # 0.08f

    .line 759
    .line 760
    .line 761
    const v23, 0x3ca3d70a    # 0.02f

    .line 762
    .line 763
    .line 764
    const v24, 0x3e19999a    # 0.15f

    .line 765
    .line 766
    .line 767
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 768
    .line 769
    .line 770
    const v4, 0x3d8f5c29    # 0.07f

    .line 771
    .line 772
    .line 773
    const v6, 0x3df5c28f    # 0.12f

    .line 774
    .line 775
    .line 776
    const v7, 0x3e051eb8    # 0.13f

    .line 777
    .line 778
    .line 779
    const v8, 0x3e2e147b    # 0.17f

    .line 780
    .line 781
    .line 782
    invoke-virtual {v2, v4, v6, v7, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 783
    .line 784
    .line 785
    const v4, 0x3df5c28f    # 0.12f

    .line 786
    .line 787
    .line 788
    const v6, 0x3e4ccccd    # 0.2f

    .line 789
    .line 790
    .line 791
    const v7, 0x3db851ec    # 0.09f

    .line 792
    .line 793
    .line 794
    const v8, 0x3de147ae    # 0.11f

    .line 795
    .line 796
    .line 797
    invoke-virtual {v2, v4, v7, v6, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 798
    .line 799
    .line 800
    const/high16 v4, 0x3e800000    # 0.25f

    .line 801
    .line 802
    const v6, 0x3d23d70a    # 0.04f

    .line 803
    .line 804
    .line 805
    const v7, 0x3e23d70a    # 0.16f

    .line 806
    .line 807
    .line 808
    const v8, 0x3d23d70a    # 0.04f

    .line 809
    .line 810
    .line 811
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 812
    .line 813
    .line 814
    const v25, 0x3e8a3d71    # 0.27f

    .line 815
    .line 816
    .line 817
    const v26, -0x42dc28f6    # -0.04f

    .line 818
    .line 819
    .line 820
    const v21, 0x3dcccccd    # 0.1f

    .line 821
    .line 822
    .line 823
    const/16 v22, 0x0

    .line 824
    .line 825
    const v23, 0x3e428f5c    # 0.19f

    .line 826
    .line 827
    .line 828
    const v24, -0x43dc28f6    # -0.01f

    .line 829
    .line 830
    .line 831
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 832
    .line 833
    .line 834
    const v4, -0x4270a3d7    # -0.07f

    .line 835
    .line 836
    .line 837
    const v6, 0x3e4ccccd    # 0.2f

    .line 838
    .line 839
    .line 840
    const v7, -0x420a3d71    # -0.12f

    .line 841
    .line 842
    .line 843
    const v8, 0x3e19999a    # 0.15f

    .line 844
    .line 845
    .line 846
    invoke-virtual {v2, v8, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 847
    .line 848
    .line 849
    const v4, 0x3e051eb8    # 0.13f

    .line 850
    .line 851
    .line 852
    const v6, 0x3dcccccd    # 0.1f

    .line 853
    .line 854
    .line 855
    const v7, -0x41c7ae14    # -0.18f

    .line 856
    .line 857
    .line 858
    const v8, -0x421eb852    # -0.11f

    .line 859
    .line 860
    .line 861
    invoke-virtual {v2, v6, v8, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 862
    .line 863
    .line 864
    const v4, 0x3d23d70a    # 0.04f

    .line 865
    .line 866
    .line 867
    const v6, -0x418a3d71    # -0.24f

    .line 868
    .line 869
    .line 870
    const v7, 0x3d23d70a    # 0.04f

    .line 871
    .line 872
    .line 873
    const v8, -0x41e66666    # -0.15f

    .line 874
    .line 875
    .line 876
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 877
    .line 878
    .line 879
    const v25, -0x42b33333    # -0.05f

    .line 880
    .line 881
    .line 882
    const v26, -0x416b851f    # -0.29f

    .line 883
    .line 884
    .line 885
    const/16 v21, 0x0

    .line 886
    .line 887
    const v22, -0x421eb852    # -0.11f

    .line 888
    .line 889
    .line 890
    const v23, -0x435c28f6    # -0.02f

    .line 891
    .line 892
    .line 893
    const v24, -0x41a8f5c3    # -0.21f

    .line 894
    .line 895
    .line 896
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 897
    .line 898
    .line 899
    const v4, -0x41f0a3d7    # -0.14f

    .line 900
    .line 901
    .line 902
    const v6, -0x41b33333    # -0.2f

    .line 903
    .line 904
    .line 905
    const v7, -0x425c28f6    # -0.08f

    .line 906
    .line 907
    .line 908
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 909
    .line 910
    .line 911
    const v4, -0x41fae148    # -0.13f

    .line 912
    .line 913
    .line 914
    const v6, -0x419eb852    # -0.22f

    .line 915
    .line 916
    .line 917
    const v7, -0x4247ae14    # -0.09f

    .line 918
    .line 919
    .line 920
    const v8, -0x421eb852    # -0.11f

    .line 921
    .line 922
    .line 923
    invoke-virtual {v2, v4, v7, v6, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 924
    .line 925
    .line 926
    const v4, -0x416b851f    # -0.29f

    .line 927
    .line 928
    .line 929
    const v6, -0x42dc28f6    # -0.04f

    .line 930
    .line 931
    .line 932
    const v7, -0x41c7ae14    # -0.18f

    .line 933
    .line 934
    .line 935
    invoke-virtual {v2, v7, v6, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 936
    .line 937
    .line 938
    const v4, 0x4118f5c3    # 9.56f

    .line 939
    .line 940
    .line 941
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 942
    .line 943
    .line 944
    const v4, 0x4157d70a    # 13.49f

    .line 945
    .line 946
    .line 947
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 948
    .line 949
    .line 950
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 951
    .line 952
    .line 953
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 954
    .line 955
    .line 956
    move-result-object v2

    .line 957
    const/high16 v6, 0x3f800000    # 1.0f

    .line 958
    .line 959
    const/high16 v8, 0x3f800000    # 1.0f

    .line 960
    .line 961
    const/4 v7, 0x0

    .line 962
    const-string v4, ""

    .line 963
    .line 964
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 965
    .line 966
    .line 967
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 968
    .line 969
    .line 970
    move-result v3

    .line 971
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 972
    .line 973
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 974
    .line 975
    .line 976
    move-result-wide v6

    .line 977
    const/4 v0, 0x0

    .line 978
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 979
    .line 980
    .line 981
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 982
    .line 983
    .line 984
    move-result v10

    .line 985
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 986
    .line 987
    .line 988
    move-result v11

    .line 989
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 990
    .line 991
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 992
    .line 993
    .line 994
    const v0, 0x4174cccd    # 15.3f

    .line 995
    .line 996
    .line 997
    const v2, 0x4163d70a    # 14.24f

    .line 998
    .line 999
    .line 1000
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1001
    .line 1002
    .line 1003
    const v17, -0x42333333    # -0.1f

    .line 1004
    .line 1005
    .line 1006
    const v18, 0x3f51eb85    # 0.82f

    .line 1007
    .line 1008
    .line 1009
    const v14, 0x3ea3d70a    # 0.32f

    .line 1010
    .line 1011
    .line 1012
    const v15, -0x430a3d71    # -0.03f

    .line 1013
    .line 1014
    .line 1015
    const v16, 0x3f19999a    # 0.6f

    .line 1016
    .line 1017
    .line 1018
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1019
    .line 1020
    .line 1021
    const v0, -0x416b851f    # -0.29f

    .line 1022
    .line 1023
    .line 1024
    const v2, 0x3f11eb85    # 0.57f

    .line 1025
    .line 1026
    .line 1027
    const v4, -0x41d1eb85    # -0.17f

    .line 1028
    .line 1029
    .line 1030
    const v6, 0x3ed70a3d    # 0.42f

    .line 1031
    .line 1032
    .line 1033
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1034
    .line 1035
    .line 1036
    const v0, 0x3e851eb8    # 0.26f

    .line 1037
    .line 1038
    .line 1039
    const v2, -0x4119999a    # -0.45f

    .line 1040
    .line 1041
    .line 1042
    const v4, 0x3ea8f5c3    # 0.33f

    .line 1043
    .line 1044
    .line 1045
    const v6, -0x4170a3d7    # -0.28f

    .line 1046
    .line 1047
    .line 1048
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1049
    .line 1050
    .line 1051
    const v0, -0x41428f5c    # -0.37f

    .line 1052
    .line 1053
    .line 1054
    const v2, -0x40e8f5c3    # -0.59f

    .line 1055
    .line 1056
    .line 1057
    const v4, 0x3dcccccd    # 0.1f

    .line 1058
    .line 1059
    .line 1060
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1061
    .line 1062
    .line 1063
    const v0, -0x40e8f5c3    # -0.59f

    .line 1064
    .line 1065
    .line 1066
    const v2, -0x42333333    # -0.1f

    .line 1067
    .line 1068
    .line 1069
    const v4, -0x412e147b    # -0.41f

    .line 1070
    .line 1071
    .line 1072
    const v6, -0x430a3d71    # -0.03f

    .line 1073
    .line 1074
    .line 1075
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1076
    .line 1077
    .line 1078
    const v0, -0x41147ae1    # -0.46f

    .line 1079
    .line 1080
    .line 1081
    const v2, -0x41570a3d    # -0.33f

    .line 1082
    .line 1083
    .line 1084
    const v4, -0x41c7ae14    # -0.18f

    .line 1085
    .line 1086
    .line 1087
    invoke-virtual {v12, v2, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1088
    .line 1089
    .line 1090
    const v0, -0x41666666    # -0.3f

    .line 1091
    .line 1092
    .line 1093
    const v2, -0x40ee147b    # -0.57f

    .line 1094
    .line 1095
    .line 1096
    const v4, -0x41947ae1    # -0.23f

    .line 1097
    .line 1098
    .line 1099
    const v6, -0x4151eb85    # -0.34f

    .line 1100
    .line 1101
    .line 1102
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1103
    .line 1104
    .line 1105
    const/high16 v0, -0x41000000    # -0.5f

    .line 1106
    .line 1107
    const v2, -0x40ae147b    # -0.82f

    .line 1108
    .line 1109
    .line 1110
    const v4, -0x421eb852    # -0.11f

    .line 1111
    .line 1112
    .line 1113
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1114
    .line 1115
    .line 1116
    const/high16 v0, 0x41580000    # 13.5f

    .line 1117
    .line 1118
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1119
    .line 1120
    .line 1121
    const v17, 0x3dcccccd    # 0.1f

    .line 1122
    .line 1123
    .line 1124
    const v18, -0x40ae147b    # -0.82f

    .line 1125
    .line 1126
    .line 1127
    const v14, -0x415c28f6    # -0.32f

    .line 1128
    .line 1129
    .line 1130
    const v15, 0x3cf5c28f    # 0.03f

    .line 1131
    .line 1132
    .line 1133
    const v16, -0x40e66666    # -0.6f

    .line 1134
    .line 1135
    .line 1136
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1137
    .line 1138
    .line 1139
    const v0, 0x3e947ae1    # 0.29f

    .line 1140
    .line 1141
    .line 1142
    const v2, -0x40ee147b    # -0.57f

    .line 1143
    .line 1144
    .line 1145
    const v4, 0x3e2e147b    # 0.17f

    .line 1146
    .line 1147
    .line 1148
    const v6, -0x4128f5c3    # -0.42f

    .line 1149
    .line 1150
    .line 1151
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1152
    .line 1153
    .line 1154
    const v0, -0x417ae148    # -0.26f

    .line 1155
    .line 1156
    .line 1157
    const v2, 0x3ee66666    # 0.45f

    .line 1158
    .line 1159
    .line 1160
    const v4, -0x41570a3d    # -0.33f

    .line 1161
    .line 1162
    .line 1163
    const v6, 0x3e8f5c29    # 0.28f

    .line 1164
    .line 1165
    .line 1166
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1167
    .line 1168
    .line 1169
    const v0, 0x3f170a3d    # 0.59f

    .line 1170
    .line 1171
    .line 1172
    const v2, -0x42333333    # -0.1f

    .line 1173
    .line 1174
    .line 1175
    const v4, 0x3ebd70a4    # 0.37f

    .line 1176
    .line 1177
    .line 1178
    const v6, -0x42333333    # -0.1f

    .line 1179
    .line 1180
    .line 1181
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1182
    .line 1183
    .line 1184
    const v0, 0x3cf5c28f    # 0.03f

    .line 1185
    .line 1186
    .line 1187
    const v2, 0x3f170a3d    # 0.59f

    .line 1188
    .line 1189
    .line 1190
    const v4, 0x3dcccccd    # 0.1f

    .line 1191
    .line 1192
    .line 1193
    const v6, 0x3ed1eb85    # 0.41f

    .line 1194
    .line 1195
    .line 1196
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1197
    .line 1198
    .line 1199
    const v0, 0x3eeb851f    # 0.46f

    .line 1200
    .line 1201
    .line 1202
    const v2, 0x3e3851ec    # 0.18f

    .line 1203
    .line 1204
    .line 1205
    const v4, 0x3ea8f5c3    # 0.33f

    .line 1206
    .line 1207
    .line 1208
    invoke-virtual {v12, v4, v2, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1209
    .line 1210
    .line 1211
    const v0, 0x3e99999a    # 0.3f

    .line 1212
    .line 1213
    .line 1214
    const v2, 0x3f11eb85    # 0.57f

    .line 1215
    .line 1216
    .line 1217
    const v4, 0x3e6b851f    # 0.23f

    .line 1218
    .line 1219
    .line 1220
    const v6, 0x3eae147b    # 0.34f

    .line 1221
    .line 1222
    .line 1223
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1224
    .line 1225
    .line 1226
    const/high16 v0, 0x3f000000    # 0.5f

    .line 1227
    .line 1228
    const v2, 0x3f51eb85    # 0.82f

    .line 1229
    .line 1230
    .line 1231
    const v4, 0x3de147ae    # 0.11f

    .line 1232
    .line 1233
    .line 1234
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1235
    .line 1236
    .line 1237
    const v0, 0x4163d70a    # 14.24f

    .line 1238
    .line 1239
    .line 1240
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1241
    .line 1242
    .line 1243
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1244
    .line 1245
    .line 1246
    const v0, 0x41673333    # 14.45f

    .line 1247
    .line 1248
    .line 1249
    const v2, 0x4156147b    # 13.38f

    .line 1250
    .line 1251
    .line 1252
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1253
    .line 1254
    .line 1255
    const v17, -0x42dc28f6    # -0.04f

    .line 1256
    .line 1257
    .line 1258
    const v18, -0x410a3d71    # -0.48f

    .line 1259
    .line 1260
    .line 1261
    const v14, -0x41bd70a4    # -0.19f

    .line 1262
    .line 1263
    .line 1264
    const v15, -0x43dc28f6    # -0.01f

    .line 1265
    .line 1266
    .line 1267
    const v16, -0x414ccccd    # -0.35f

    .line 1268
    .line 1269
    .line 1270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1271
    .line 1272
    .line 1273
    const v17, -0x420a3d71    # -0.12f

    .line 1274
    .line 1275
    .line 1276
    const v18, -0x416147ae    # -0.31f

    .line 1277
    .line 1278
    .line 1279
    const v13, -0x430a3d71    # -0.03f

    .line 1280
    .line 1281
    .line 1282
    const v14, -0x41fae148    # -0.13f

    .line 1283
    .line 1284
    .line 1285
    const v15, -0x4270a3d7    # -0.07f

    .line 1286
    .line 1287
    .line 1288
    const v16, -0x41947ae1    # -0.23f

    .line 1289
    .line 1290
    .line 1291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1292
    .line 1293
    .line 1294
    const v0, -0x41f0a3d7    # -0.14f

    .line 1295
    .line 1296
    .line 1297
    const v2, -0x41bd70a4    # -0.19f

    .line 1298
    .line 1299
    .line 1300
    const v4, -0x41d1eb85    # -0.17f

    .line 1301
    .line 1302
    .line 1303
    const v6, -0x421eb852    # -0.11f

    .line 1304
    .line 1305
    .line 1306
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1307
    .line 1308
    .line 1309
    const v0, -0x41dc28f6    # -0.16f

    .line 1310
    .line 1311
    .line 1312
    const v2, -0x42b33333    # -0.05f

    .line 1313
    .line 1314
    .line 1315
    const/high16 v4, -0x41800000    # -0.25f

    .line 1316
    .line 1317
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1318
    .line 1319
    .line 1320
    const v0, 0x3ca3d70a    # 0.02f

    .line 1321
    .line 1322
    .line 1323
    const v2, 0x3d4ccccd    # 0.05f

    .line 1324
    .line 1325
    .line 1326
    const v6, -0x41c7ae14    # -0.18f

    .line 1327
    .line 1328
    .line 1329
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1330
    .line 1331
    .line 1332
    const v0, -0x41f0a3d7    # -0.14f

    .line 1333
    .line 1334
    .line 1335
    const v2, -0x41bd70a4    # -0.19f

    .line 1336
    .line 1337
    .line 1338
    const v4, 0x3db851ec    # 0.09f

    .line 1339
    .line 1340
    .line 1341
    const v6, 0x3e2e147b    # 0.17f

    .line 1342
    .line 1343
    .line 1344
    invoke-virtual {v12, v0, v4, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1345
    .line 1346
    .line 1347
    const v0, 0x3e9eb852    # 0.31f

    .line 1348
    .line 1349
    .line 1350
    const v2, 0x3e3851ec    # 0.18f

    .line 1351
    .line 1352
    .line 1353
    const v4, -0x4247ae14    # -0.09f

    .line 1354
    .line 1355
    .line 1356
    const v6, -0x420a3d71    # -0.12f

    .line 1357
    .line 1358
    .line 1359
    invoke-virtual {v12, v4, v2, v6, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1360
    .line 1361
    .line 1362
    const v0, 0x3e947ae1    # 0.29f

    .line 1363
    .line 1364
    .line 1365
    const v2, 0x3ef5c28f    # 0.48f

    .line 1366
    .line 1367
    .line 1368
    const v4, -0x42dc28f6    # -0.04f

    .line 1369
    .line 1370
    .line 1371
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1372
    .line 1373
    .line 1374
    const v0, 0x3f7851ec    # 0.97f

    .line 1375
    .line 1376
    .line 1377
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1378
    .line 1379
    .line 1380
    const v17, 0x3d23d70a    # 0.04f

    .line 1381
    .line 1382
    .line 1383
    const v18, 0x3ef5c28f    # 0.48f

    .line 1384
    .line 1385
    .line 1386
    const/4 v13, 0x0

    .line 1387
    const v14, 0x3e428f5c    # 0.19f

    .line 1388
    .line 1389
    .line 1390
    const v15, 0x3c23d70a    # 0.01f

    .line 1391
    .line 1392
    .line 1393
    const v16, 0x3eb33333    # 0.35f

    .line 1394
    .line 1395
    .line 1396
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1397
    .line 1398
    .line 1399
    const v0, 0x3df5c28f    # 0.12f

    .line 1400
    .line 1401
    .line 1402
    const v2, 0x3ea3d70a    # 0.32f

    .line 1403
    .line 1404
    .line 1405
    const v4, 0x3d8f5c29    # 0.07f

    .line 1406
    .line 1407
    .line 1408
    const v6, 0x3e75c28f    # 0.24f

    .line 1409
    .line 1410
    .line 1411
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1412
    .line 1413
    .line 1414
    const v0, 0x3e0f5c29    # 0.14f

    .line 1415
    .line 1416
    .line 1417
    const v2, 0x3e428f5c    # 0.19f

    .line 1418
    .line 1419
    .line 1420
    const v4, 0x3de147ae    # 0.11f

    .line 1421
    .line 1422
    .line 1423
    const v6, 0x3e2e147b    # 0.17f

    .line 1424
    .line 1425
    .line 1426
    invoke-virtual {v12, v4, v0, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1427
    .line 1428
    .line 1429
    const/high16 v0, 0x3e800000    # 0.25f

    .line 1430
    .line 1431
    const v2, 0x3d4ccccd    # 0.05f

    .line 1432
    .line 1433
    .line 1434
    const v4, 0x3e23d70a    # 0.16f

    .line 1435
    .line 1436
    .line 1437
    invoke-virtual {v12, v4, v2, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1438
    .line 1439
    .line 1440
    const v0, -0x435c28f6    # -0.02f

    .line 1441
    .line 1442
    .line 1443
    const/high16 v2, 0x3e800000    # 0.25f

    .line 1444
    .line 1445
    const v4, 0x3e3851ec    # 0.18f

    .line 1446
    .line 1447
    .line 1448
    const v6, -0x42b33333    # -0.05f

    .line 1449
    .line 1450
    .line 1451
    invoke-virtual {v12, v4, v0, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1452
    .line 1453
    .line 1454
    const v0, 0x3e0f5c29    # 0.14f

    .line 1455
    .line 1456
    .line 1457
    const v2, 0x3e428f5c    # 0.19f

    .line 1458
    .line 1459
    .line 1460
    const v4, -0x4247ae14    # -0.09f

    .line 1461
    .line 1462
    .line 1463
    const v6, -0x41d1eb85    # -0.17f

    .line 1464
    .line 1465
    .line 1466
    invoke-virtual {v12, v0, v4, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1467
    .line 1468
    .line 1469
    const v0, -0x41bd70a4    # -0.19f

    .line 1470
    .line 1471
    .line 1472
    const v2, -0x415c28f6    # -0.32f

    .line 1473
    .line 1474
    .line 1475
    const v4, 0x3db851ec    # 0.09f

    .line 1476
    .line 1477
    .line 1478
    const v6, 0x3de147ae    # 0.11f

    .line 1479
    .line 1480
    .line 1481
    invoke-virtual {v12, v4, v0, v6, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1482
    .line 1483
    .line 1484
    const v18, -0x410a3d71    # -0.48f

    .line 1485
    .line 1486
    .line 1487
    const v13, 0x3cf5c28f    # 0.03f

    .line 1488
    .line 1489
    .line 1490
    const v14, -0x41fae148    # -0.13f

    .line 1491
    .line 1492
    .line 1493
    const v15, 0x3d23d70a    # 0.04f

    .line 1494
    .line 1495
    .line 1496
    const v16, -0x416b851f    # -0.29f

    .line 1497
    .line 1498
    .line 1499
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1500
    .line 1501
    .line 1502
    const v0, 0x4156147b    # 13.38f

    .line 1503
    .line 1504
    .line 1505
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1506
    .line 1507
    .line 1508
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1509
    .line 1510
    .line 1511
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1512
    .line 1513
    .line 1514
    move-result-object v2

    .line 1515
    const/16 v16, 0x3800

    .line 1516
    .line 1517
    const/16 v17, 0x0

    .line 1518
    .line 1519
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1520
    .line 1521
    const/4 v7, 0x0

    .line 1522
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1523
    .line 1524
    const/4 v13, 0x0

    .line 1525
    const/4 v14, 0x0

    .line 1526
    const/4 v15, 0x0

    .line 1527
    const-string v4, ""

    .line 1528
    .line 1529
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1530
    .line 1531
    .line 1532
    move-result-object v0

    .line 1533
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1534
    .line 1535
    .line 1536
    move-result-object v0

    .line 1537
    sput-object v0, Landroidx/compose/material/icons/filled/Replay30Kt;->_replay30:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1538
    .line 1539
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1540
    .line 1541
    .line 1542
    return-object v0
.end method
