.class public final Landroidx/compose/material/icons/sharp/SettingsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_settings",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Settings",
        "Landroidx/compose/material/icons/Icons$Sharp;",
        "getSettings",
        "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;",
        "material-icons-core_release"
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
        "SMAP\nSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Settings.kt\nandroidx/compose/material/icons/sharp/SettingsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,86:1\n122#2:87\n116#2,3:88\n119#2,3:92\n132#2,18:95\n152#2:132\n175#3:91\n694#4,2:113\n706#4,2:115\n708#4,11:121\n53#5,4:117\n*S KotlinDebug\n*F\n+ 1 Settings.kt\nandroidx/compose/material/icons/sharp/SettingsKt\n*L\n29#1:87\n29#1:88,3\n29#1:92,3\n30#1:95,18\n30#1:132\n29#1:91\n30#1:113,2\n30#1:115,2\n30#1:121,11\n30#1:117,4\n*E\n"
    }
.end annotation


# static fields
.field private static _settings:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSettings(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 30

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Landroidx/compose/material/icons/sharp/SettingsKt;->_settings:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    const-string v2, "Sharp.Settings"

    .line 17
    .line 18
    new-instance v1, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 19
    .line 20
    move-object v13, v1

    .line 21
    const/high16 v0, 0x41c00000    # 24.0f

    .line 22
    .line 23
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    const/high16 v5, 0x41c00000    # 24.0f

    .line 32
    .line 33
    const/high16 v6, 0x41c00000    # 24.0f

    .line 34
    .line 35
    const-wide/16 v7, 0x0

    .line 36
    .line 37
    const/4 v9, 0x0

    .line 38
    const/4 v10, 0x0

    .line 39
    const/16 v11, 0xe0

    .line 40
    .line 41
    const/4 v12, 0x0

    .line 42
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 43
    .line 44
    .line 45
    const/high16 v18, 0x3f800000    # 1.0f

    .line 46
    .line 47
    const/high16 v20, 0x3f800000    # 1.0f

    .line 48
    .line 49
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 50
    .line 51
    .line 52
    move-result v15

    .line 53
    new-instance v0, Landroidx/compose/ui/graphics/SolidColor;

    .line 54
    .line 55
    move-object/from16 v17, v0

    .line 56
    .line 57
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 58
    .line 59
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 60
    .line 61
    .line 62
    move-result-wide v1

    .line 63
    const/4 v3, 0x0

    .line 64
    invoke-direct {v0, v1, v2, v3}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 65
    .line 66
    .line 67
    const/16 v19, 0x0

    .line 68
    .line 69
    const/high16 v21, 0x3f800000    # 1.0f

    .line 70
    .line 71
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 72
    .line 73
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 74
    .line 75
    .line 76
    move-result v22

    .line 77
    sget-object v0, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 78
    .line 79
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 80
    .line 81
    .line 82
    move-result v23

    .line 83
    const/high16 v24, 0x3f800000    # 1.0f

    .line 84
    .line 85
    const-string v16, ""

    .line 86
    .line 87
    new-instance v7, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    invoke-direct {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    const v0, 0x419b851f    # 19.44f

    .line 93
    .line 94
    .line 95
    const v1, 0x414fd70a    # 12.99f

    .line 96
    .line 97
    .line 98
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v8, -0x43dc28f6    # -0.01f

    .line 102
    .line 103
    .line 104
    const v9, 0x3ca3d70a    # 0.02f

    .line 105
    .line 106
    .line 107
    invoke-virtual {v7, v8, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const v1, 0x3d23d70a    # 0.04f

    .line 111
    .line 112
    .line 113
    const v2, -0x41570a3d    # -0.33f

    .line 114
    .line 115
    .line 116
    const v3, 0x3da3d70a    # 0.08f

    .line 117
    .line 118
    .line 119
    const v4, -0x40d47ae1    # -0.67f

    .line 120
    .line 121
    .line 122
    const v5, 0x3da3d70a    # 0.08f

    .line 123
    .line 124
    .line 125
    const v6, -0x407eb852    # -1.01f

    .line 126
    .line 127
    .line 128
    move-object v0, v7

    .line 129
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/4 v1, 0x0

    .line 133
    const v2, -0x4151eb85    # -0.34f

    .line 134
    .line 135
    .line 136
    const v3, -0x430a3d71    # -0.03f

    .line 137
    .line 138
    .line 139
    const v4, -0x40d70a3d    # -0.66f

    .line 140
    .line 141
    .line 142
    const v5, -0x4270a3d7    # -0.07f

    .line 143
    .line 144
    .line 145
    const v6, -0x40828f5c    # -0.99f

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v10, 0x3c23d70a    # 0.01f

    .line 152
    .line 153
    .line 154
    invoke-virtual {v7, v10, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v0, -0x400a3d71    # -1.92f

    .line 158
    .line 159
    .line 160
    const v9, 0x401c28f6    # 2.44f

    .line 161
    .line 162
    .line 163
    invoke-virtual {v7, v9, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v0, -0x3fe47ae1    # -2.43f

    .line 167
    .line 168
    .line 169
    const v1, -0x3f78f5c3    # -4.22f

    .line 170
    .line 171
    .line 172
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v0, -0x3fc851ec    # -2.87f

    .line 176
    .line 177
    .line 178
    const v1, 0x3f947ae1    # 1.16f

    .line 179
    .line 180
    .line 181
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v7, v10, v10}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v1, -0x40fae148    # -0.52f

    .line 188
    .line 189
    .line 190
    const v2, -0x41333333    # -0.4f

    .line 191
    .line 192
    .line 193
    const v3, -0x40747ae1    # -1.09f

    .line 194
    .line 195
    .line 196
    const v4, -0x40c28f5c    # -0.74f

    .line 197
    .line 198
    .line 199
    const v5, -0x40251eb8    # -1.71f

    .line 200
    .line 201
    .line 202
    const/high16 v6, -0x40800000    # -1.0f

    .line 203
    .line 204
    move-object v0, v7

    .line 205
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v7, v10}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v0, 0x41670a3d    # 14.44f

    .line 212
    .line 213
    .line 214
    const/high16 v1, 0x40000000    # 2.0f

    .line 215
    .line 216
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v0, 0x41191eb8    # 9.57f

    .line 220
    .line 221
    .line 222
    invoke-virtual {v7, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v0, -0x411eb852    # -0.44f

    .line 226
    .line 227
    .line 228
    const v1, 0x40447ae1    # 3.07f

    .line 229
    .line 230
    .line 231
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v7, v10}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v1, -0x40e147ae    # -0.62f

    .line 238
    .line 239
    .line 240
    const v2, 0x3e851eb8    # 0.26f

    .line 241
    .line 242
    .line 243
    const v3, -0x4067ae14    # -1.19f

    .line 244
    .line 245
    .line 246
    const v4, 0x3f19999a    # 0.6f

    .line 247
    .line 248
    .line 249
    const/high16 v6, 0x3f800000    # 1.0f

    .line 250
    .line 251
    move-object v0, v7

    .line 252
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v7, v10, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const v0, -0x3fc7ae14    # -2.88f

    .line 259
    .line 260
    .line 261
    const v1, -0x406a3d71    # -1.17f

    .line 262
    .line 263
    .line 264
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v0, -0x3fe3d70a    # -2.44f

    .line 268
    .line 269
    .line 270
    const v1, 0x40870a3d    # 4.22f

    .line 271
    .line 272
    .line 273
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v0, 0x3ff5c28f    # 1.92f

    .line 277
    .line 278
    .line 279
    invoke-virtual {v7, v9, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v9, -0x435c28f6    # -0.02f

    .line 283
    .line 284
    .line 285
    invoke-virtual {v7, v10, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v1, -0x42dc28f6    # -0.04f

    .line 289
    .line 290
    .line 291
    const v2, 0x3ea8f5c3    # 0.33f

    .line 292
    .line 293
    .line 294
    const v3, -0x4270a3d7    # -0.07f

    .line 295
    .line 296
    .line 297
    const v4, 0x3f266666    # 0.65f

    .line 298
    .line 299
    .line 300
    const v5, -0x4270a3d7    # -0.07f

    .line 301
    .line 302
    .line 303
    const v6, 0x3f7d70a4    # 0.99f

    .line 304
    .line 305
    .line 306
    move-object v0, v7

    .line 307
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/4 v1, 0x0

    .line 311
    const v2, 0x3eae147b    # 0.34f

    .line 312
    .line 313
    .line 314
    const v3, 0x3cf5c28f    # 0.03f

    .line 315
    .line 316
    .line 317
    const v4, 0x3f2e147b    # 0.68f

    .line 318
    .line 319
    .line 320
    const v5, 0x3da3d70a    # 0.08f

    .line 321
    .line 322
    .line 323
    const v6, 0x3f8147ae    # 1.01f

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v7, v8, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v0, -0x3ff9999a    # -2.1f

    .line 333
    .line 334
    .line 335
    const v1, 0x3fd33333    # 1.65f

    .line 336
    .line 337
    .line 338
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v0, 0x3e851eb8    # 0.26f

    .line 342
    .line 343
    .line 344
    const v10, -0x41570a3d    # -0.33f

    .line 345
    .line 346
    .line 347
    invoke-virtual {v7, v10, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v0, 0x40866666    # 4.2f

    .line 351
    .line 352
    .line 353
    const v11, 0x401b851f    # 2.43f

    .line 354
    .line 355
    .line 356
    invoke-virtual {v7, v11, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v0, -0x406ccccd    # -1.15f

    .line 360
    .line 361
    .line 362
    const v12, 0x403851ec    # 2.88f

    .line 363
    .line 364
    .line 365
    invoke-virtual {v7, v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v0, -0x42dc28f6    # -0.04f

    .line 369
    .line 370
    .line 371
    invoke-virtual {v7, v9, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v1, 0x3f07ae14    # 0.53f

    .line 375
    .line 376
    .line 377
    const v2, 0x3ed1eb85    # 0.41f

    .line 378
    .line 379
    .line 380
    const v3, 0x3f8ccccd    # 1.1f

    .line 381
    .line 382
    .line 383
    const/high16 v4, 0x3f400000    # 0.75f

    .line 384
    .line 385
    const v5, 0x3fdd70a4    # 1.73f

    .line 386
    .line 387
    .line 388
    move-object v0, v7

    .line 389
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v0, -0x430a3d71    # -0.03f

    .line 393
    .line 394
    .line 395
    invoke-virtual {v7, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v0, 0x411947ae    # 9.58f

    .line 399
    .line 400
    .line 401
    const/high16 v1, 0x41b00000    # 22.0f

    .line 402
    .line 403
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v0, 0x409b3333    # 4.85f

    .line 407
    .line 408
    .line 409
    invoke-virtual {v7, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v0, 0x3d75c28f    # 0.06f

    .line 413
    .line 414
    .line 415
    const v1, -0x4128f5c3    # -0.42f

    .line 416
    .line 417
    .line 418
    const v2, 0x3cf5c28f    # 0.03f

    .line 419
    .line 420
    .line 421
    const v3, -0x41c7ae14    # -0.18f

    .line 422
    .line 423
    .line 424
    invoke-virtual {v7, v2, v3, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v0, 0x3ec28f5c    # 0.38f

    .line 428
    .line 429
    .line 430
    const v1, -0x3fd66666    # -2.65f

    .line 431
    .line 432
    .line 433
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    invoke-virtual {v7, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v1, 0x3f1eb852    # 0.62f

    .line 440
    .line 441
    .line 442
    const v2, -0x417ae148    # -0.26f

    .line 443
    .line 444
    .line 445
    const v3, 0x3f99999a    # 1.2f

    .line 446
    .line 447
    .line 448
    const v4, -0x40e66666    # -0.6f

    .line 449
    .line 450
    .line 451
    const v6, -0x407eb852    # -1.01f

    .line 452
    .line 453
    .line 454
    move-object v0, v7

    .line 455
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const v0, 0x3d23d70a    # 0.04f

    .line 459
    .line 460
    .line 461
    invoke-virtual {v7, v9, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const v0, 0x3f933333    # 1.15f

    .line 465
    .line 466
    .line 467
    invoke-virtual {v7, v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v0, -0x3f79999a    # -4.2f

    .line 471
    .line 472
    .line 473
    invoke-virtual {v7, v11, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const v0, -0x420a3d71    # -0.12f

    .line 477
    .line 478
    .line 479
    const v1, -0x417ae148    # -0.26f

    .line 480
    .line 481
    .line 482
    const v2, -0x41f0a3d7    # -0.14f

    .line 483
    .line 484
    .line 485
    invoke-virtual {v7, v2, v0, v10, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const v0, -0x3ff8f5c3    # -2.11f

    .line 489
    .line 490
    .line 491
    const v1, -0x402b851f    # -1.66f

    .line 492
    .line 493
    .line 494
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v0, 0x41400000    # 12.0f

    .line 501
    .line 502
    const/high16 v1, 0x41780000    # 15.5f

    .line 503
    .line 504
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const v1, -0x4008f5c3    # -1.93f

    .line 508
    .line 509
    .line 510
    const/4 v2, 0x0

    .line 511
    const/high16 v3, -0x3fa00000    # -3.5f

    .line 512
    .line 513
    const v4, -0x40370a3d    # -1.57f

    .line 514
    .line 515
    .line 516
    const/high16 v5, -0x3fa00000    # -3.5f

    .line 517
    .line 518
    const/high16 v6, -0x3fa00000    # -3.5f

    .line 519
    .line 520
    move-object v0, v7

    .line 521
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const v0, 0x3fc8f5c3    # 1.57f

    .line 525
    .line 526
    .line 527
    const/high16 v1, -0x3fa00000    # -3.5f

    .line 528
    .line 529
    const/high16 v2, 0x40600000    # 3.5f

    .line 530
    .line 531
    invoke-virtual {v7, v0, v1, v2, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    invoke-virtual {v7, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const v0, -0x40370a3d    # -1.57f

    .line 538
    .line 539
    .line 540
    invoke-virtual {v7, v0, v2, v1, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 547
    .line 548
    .line 549
    move-result-object v14

    .line 550
    const/16 v25, 0x0

    .line 551
    .line 552
    const/16 v26, 0x0

    .line 553
    .line 554
    const/16 v27, 0x0

    .line 555
    .line 556
    const/16 v28, 0x3800

    .line 557
    .line 558
    const/16 v29, 0x0

    .line 559
    .line 560
    invoke-static/range {v13 .. v29}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 565
    .line 566
    .line 567
    move-result-object v0

    .line 568
    sput-object v0, Landroidx/compose/material/icons/sharp/SettingsKt;->_settings:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 569
    .line 570
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 571
    .line 572
    .line 573
    return-object v0
.end method
