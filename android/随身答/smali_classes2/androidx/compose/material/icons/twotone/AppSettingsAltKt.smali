.class public final Landroidx/compose/material/icons/twotone/AppSettingsAltKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_appSettingsAlt",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "AppSettingsAlt",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getAppSettingsAlt",
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
        "SMAP\nAppSettingsAlt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppSettingsAlt.kt\nandroidx/compose/material/icons/twotone/AppSettingsAltKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,131:1\n212#2,12:132\n233#2,18:145\n253#2:182\n233#2,18:183\n253#2:220\n233#2,18:221\n253#2:258\n174#3:144\n705#4,2:163\n717#4,2:165\n719#4,11:171\n705#4,2:201\n717#4,2:203\n719#4,11:209\n705#4,2:239\n717#4,2:241\n719#4,11:247\n72#5,4:167\n72#5,4:205\n72#5,4:243\n*S KotlinDebug\n*F\n+ 1 AppSettingsAlt.kt\nandroidx/compose/material/icons/twotone/AppSettingsAltKt\n*L\n29#1:132,12\n30#1:145,18\n30#1:182\n112#1:183,18\n112#1:220\n119#1:221,18\n119#1:258\n29#1:144\n30#1:163,2\n30#1:165,2\n30#1:171,11\n112#1:201,2\n112#1:203,2\n112#1:209,11\n119#1:239,2\n119#1:241,2\n119#1:247,11\n30#1:167,4\n112#1:205,4\n119#1:243,4\n*E\n"
    }
.end annotation


# static fields
.field private static _appSettingsAlt:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAppSettingsAlt(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/AppSettingsAltKt;->_appSettingsAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.AppSettingsAlt"

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
    const v4, 0x41ae7ae1    # 21.81f

    .line 71
    .line 72
    .line 73
    const v6, 0x414bd70a    # 12.74f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, -0x40ae147b    # -0.82f

    .line 80
    .line 81
    .line 82
    const v6, -0x40deb852    # -0.63f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/16 v25, 0x0

    .line 89
    .line 90
    const v26, -0x419eb852    # -0.22f

    .line 91
    .line 92
    .line 93
    const/16 v21, 0x0

    .line 94
    .line 95
    const v22, -0x4247ae14    # -0.09f

    .line 96
    .line 97
    .line 98
    const/16 v23, 0x0

    .line 99
    .line 100
    const v24, -0x41fae148    # -0.13f

    .line 101
    .line 102
    .line 103
    move-object/from16 v20, v2

    .line 104
    .line 105
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v4, 0x3f4ccccd    # 0.8f

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v25, 0x3dcccccd    # 0.1f

    .line 115
    .line 116
    .line 117
    const v26, -0x40fd70a4    # -0.51f

    .line 118
    .line 119
    .line 120
    const v21, 0x3e23d70a    # 0.16f

    .line 121
    .line 122
    .line 123
    const v22, -0x420a3d71    # -0.12f

    .line 124
    .line 125
    .line 126
    const v23, 0x3e4ccccd    # 0.2f

    .line 127
    .line 128
    .line 129
    const v24, -0x4151eb85    # -0.34f

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v4, -0x40428f5c    # -1.48f

    .line 136
    .line 137
    .line 138
    const v6, -0x40a66666    # -0.85f

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v25, -0x414ccccd    # -0.35f

    .line 145
    .line 146
    .line 147
    const v26, -0x41b33333    # -0.2f

    .line 148
    .line 149
    .line 150
    const v21, -0x4270a3d7    # -0.07f

    .line 151
    .line 152
    .line 153
    const v22, -0x41fae148    # -0.13f

    .line 154
    .line 155
    .line 156
    const v23, -0x41a8f5c3    # -0.21f

    .line 157
    .line 158
    .line 159
    const v24, -0x41b33333    # -0.2f

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v25, -0x41e66666    # -0.15f

    .line 166
    .line 167
    .line 168
    const v26, 0x3cf5c28f    # 0.03f

    .line 169
    .line 170
    .line 171
    const v21, -0x42b33333    # -0.05f

    .line 172
    .line 173
    .line 174
    const/16 v22, 0x0

    .line 175
    .line 176
    const v23, -0x42333333    # -0.1f

    .line 177
    .line 178
    .line 179
    const v24, 0x3c23d70a    # 0.01f

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const v4, 0x3ec28f5c    # 0.38f

    .line 186
    .line 187
    .line 188
    const v6, -0x408ccccd    # -0.95f

    .line 189
    .line 190
    .line 191
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v25, -0x41bd70a4    # -0.19f

    .line 195
    .line 196
    .line 197
    const v26, -0x421eb852    # -0.11f

    .line 198
    .line 199
    .line 200
    const v21, -0x425c28f6    # -0.08f

    .line 201
    .line 202
    .line 203
    const v22, -0x42b33333    # -0.05f

    .line 204
    .line 205
    .line 206
    const v23, -0x421eb852    # -0.11f

    .line 207
    .line 208
    .line 209
    const v24, -0x4270a3d7    # -0.07f

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v4, -0x41e66666    # -0.15f

    .line 216
    .line 217
    .line 218
    const v6, -0x407eb852    # -1.01f

    .line 219
    .line 220
    .line 221
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v25, 0x4196cccd    # 18.85f

    .line 225
    .line 226
    .line 227
    const/high16 v26, 0x41000000    # 8.0f

    .line 228
    .line 229
    const v21, 0x4199c28f    # 19.22f

    .line 230
    .line 231
    .line 232
    const v22, 0x41026666    # 8.15f

    .line 233
    .line 234
    .line 235
    const v23, 0x41986666    # 19.05f

    .line 236
    .line 237
    .line 238
    const/high16 v24, 0x41000000    # 8.0f

    .line 239
    .line 240
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v4, -0x40251eb8    # -1.71f

    .line 244
    .line 245
    .line 246
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v25, -0x41333333    # -0.4f

    .line 250
    .line 251
    .line 252
    const v26, 0x3eae147b    # 0.34f

    .line 253
    .line 254
    .line 255
    const v21, -0x41b33333    # -0.2f

    .line 256
    .line 257
    .line 258
    const/16 v22, 0x0

    .line 259
    .line 260
    const v23, -0x41428f5c    # -0.37f

    .line 261
    .line 262
    .line 263
    const v24, 0x3e19999a    # 0.15f

    .line 264
    .line 265
    .line 266
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v4, 0x4184cccd    # 16.6f

    .line 270
    .line 271
    .line 272
    const v6, 0x4115999a    # 9.35f

    .line 273
    .line 274
    .line 275
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v25, -0x42333333    # -0.1f

    .line 279
    .line 280
    .line 281
    const v26, 0x3d4ccccd    # 0.05f

    .line 282
    .line 283
    .line 284
    const v21, -0x430a3d71    # -0.03f

    .line 285
    .line 286
    .line 287
    const v22, 0x3ca3d70a    # 0.02f

    .line 288
    .line 289
    .line 290
    const v23, -0x4270a3d7    # -0.07f

    .line 291
    .line 292
    .line 293
    const v24, 0x3cf5c28f    # 0.03f

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v25, -0x4247ae14    # -0.09f

    .line 300
    .line 301
    .line 302
    const v26, 0x3d75c28f    # 0.06f

    .line 303
    .line 304
    .line 305
    const v23, -0x428a3d71    # -0.06f

    .line 306
    .line 307
    .line 308
    const v24, 0x3d23d70a    # 0.04f

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v4, -0x413d70a4    # -0.38f

    .line 315
    .line 316
    .line 317
    const v6, -0x408ccccd    # -0.95f

    .line 318
    .line 319
    .line 320
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v25, -0x41e66666    # -0.15f

    .line 324
    .line 325
    .line 326
    const v26, -0x430a3d71    # -0.03f

    .line 327
    .line 328
    .line 329
    const v21, -0x42b33333    # -0.05f

    .line 330
    .line 331
    .line 332
    const v22, -0x435c28f6    # -0.02f

    .line 333
    .line 334
    .line 335
    const v23, -0x42333333    # -0.1f

    .line 336
    .line 337
    .line 338
    const v24, -0x430a3d71    # -0.03f

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v25, -0x414ccccd    # -0.35f

    .line 345
    .line 346
    .line 347
    const v26, 0x3e4ccccd    # 0.2f

    .line 348
    .line 349
    .line 350
    const v21, -0x41f0a3d7    # -0.14f

    .line 351
    .line 352
    .line 353
    const/16 v22, 0x0

    .line 354
    .line 355
    const v23, -0x4175c28f    # -0.27f

    .line 356
    .line 357
    .line 358
    const v24, 0x3d8f5c29    # 0.07f

    .line 359
    .line 360
    .line 361
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const v4, 0x3fbd70a4    # 1.48f

    .line 365
    .line 366
    .line 367
    const v6, -0x40a66666    # -0.85f

    .line 368
    .line 369
    .line 370
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v25, 0x3dcccccd    # 0.1f

    .line 374
    .line 375
    .line 376
    const v26, 0x3f028f5c    # 0.51f

    .line 377
    .line 378
    .line 379
    const v21, -0x42333333    # -0.1f

    .line 380
    .line 381
    .line 382
    const v22, 0x3e2e147b    # 0.17f

    .line 383
    .line 384
    .line 385
    const v23, -0x428a3d71    # -0.06f

    .line 386
    .line 387
    .line 388
    const v24, 0x3ec7ae14    # 0.39f

    .line 389
    .line 390
    .line 391
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const v4, 0x3f2147ae    # 0.63f

    .line 395
    .line 396
    .line 397
    const v6, 0x3f4ccccd    # 0.8f

    .line 398
    .line 399
    .line 400
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const/16 v25, 0x0

    .line 404
    .line 405
    const v26, 0x3e6b851f    # 0.23f

    .line 406
    .line 407
    .line 408
    const/16 v21, 0x0

    .line 409
    .line 410
    const v22, 0x3db851ec    # 0.09f

    .line 411
    .line 412
    .line 413
    const/16 v23, 0x0

    .line 414
    .line 415
    const v24, 0x3e051eb8    # 0.13f

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v4, -0x40b33333    # -0.8f

    .line 422
    .line 423
    .line 424
    const v6, 0x3f2147ae    # 0.63f

    .line 425
    .line 426
    .line 427
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v25, -0x42333333    # -0.1f

    .line 431
    .line 432
    .line 433
    const v26, 0x3f028f5c    # 0.51f

    .line 434
    .line 435
    .line 436
    const v21, -0x41dc28f6    # -0.16f

    .line 437
    .line 438
    .line 439
    const v22, 0x3df5c28f    # 0.12f

    .line 440
    .line 441
    .line 442
    const v23, -0x41b33333    # -0.2f

    .line 443
    .line 444
    .line 445
    const v24, 0x3eae147b    # 0.34f

    .line 446
    .line 447
    .line 448
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v4, 0x3f59999a    # 0.85f

    .line 452
    .line 453
    .line 454
    const v6, 0x3fbd70a4    # 1.48f

    .line 455
    .line 456
    .line 457
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v25, 0x3eb33333    # 0.35f

    .line 461
    .line 462
    .line 463
    const v26, 0x3e4ccccd    # 0.2f

    .line 464
    .line 465
    .line 466
    const v21, 0x3d8f5c29    # 0.07f

    .line 467
    .line 468
    .line 469
    const v22, 0x3e051eb8    # 0.13f

    .line 470
    .line 471
    .line 472
    const v23, 0x3e570a3d    # 0.21f

    .line 473
    .line 474
    .line 475
    const v24, 0x3e4ccccd    # 0.2f

    .line 476
    .line 477
    .line 478
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const v25, 0x3e19999a    # 0.15f

    .line 482
    .line 483
    .line 484
    const v26, -0x430a3d71    # -0.03f

    .line 485
    .line 486
    .line 487
    const v21, 0x3d4ccccd    # 0.05f

    .line 488
    .line 489
    .line 490
    const/16 v22, 0x0

    .line 491
    .line 492
    const v23, 0x3dcccccd    # 0.1f

    .line 493
    .line 494
    .line 495
    const v24, -0x43dc28f6    # -0.01f

    .line 496
    .line 497
    .line 498
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const v4, -0x41428f5c    # -0.37f

    .line 502
    .line 503
    .line 504
    const v6, 0x3f733333    # 0.95f

    .line 505
    .line 506
    .line 507
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const v25, 0x3e4ccccd    # 0.2f

    .line 511
    .line 512
    .line 513
    const v26, 0x3de147ae    # 0.11f

    .line 514
    .line 515
    .line 516
    const v21, 0x3da3d70a    # 0.08f

    .line 517
    .line 518
    .line 519
    const v22, 0x3d4ccccd    # 0.05f

    .line 520
    .line 521
    .line 522
    const v23, 0x3df5c28f    # 0.12f

    .line 523
    .line 524
    .line 525
    const v24, 0x3d8f5c29    # 0.07f

    .line 526
    .line 527
    .line 528
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const v4, 0x3f8147ae    # 1.01f

    .line 532
    .line 533
    .line 534
    const v6, 0x3e19999a    # 0.15f

    .line 535
    .line 536
    .line 537
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const v25, 0x3ecccccd    # 0.4f

    .line 541
    .line 542
    .line 543
    const v26, 0x3eae147b    # 0.34f

    .line 544
    .line 545
    .line 546
    const v21, 0x3cf5c28f    # 0.03f

    .line 547
    .line 548
    .line 549
    const v22, 0x3e4ccccd    # 0.2f

    .line 550
    .line 551
    .line 552
    const v23, 0x3e4ccccd    # 0.2f

    .line 553
    .line 554
    .line 555
    const v24, 0x3eae147b    # 0.34f

    .line 556
    .line 557
    .line 558
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const v4, 0x3fdae148    # 1.71f

    .line 562
    .line 563
    .line 564
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const v26, -0x4151eb85    # -0.34f

    .line 568
    .line 569
    .line 570
    const v21, 0x3e4ccccd    # 0.2f

    .line 571
    .line 572
    .line 573
    const/16 v22, 0x0

    .line 574
    .line 575
    const v23, 0x3ebd70a4    # 0.37f

    .line 576
    .line 577
    .line 578
    const v24, -0x41e66666    # -0.15f

    .line 579
    .line 580
    .line 581
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const v4, 0x3e19999a    # 0.15f

    .line 585
    .line 586
    .line 587
    const v6, -0x407eb852    # -1.01f

    .line 588
    .line 589
    .line 590
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const v25, 0x3dcccccd    # 0.1f

    .line 594
    .line 595
    .line 596
    const v26, -0x42b33333    # -0.05f

    .line 597
    .line 598
    .line 599
    const v21, 0x3cf5c28f    # 0.03f

    .line 600
    .line 601
    .line 602
    const v22, -0x435c28f6    # -0.02f

    .line 603
    .line 604
    .line 605
    const v23, 0x3d8f5c29    # 0.07f

    .line 606
    .line 607
    .line 608
    const v24, -0x430a3d71    # -0.03f

    .line 609
    .line 610
    .line 611
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const v25, 0x3db851ec    # 0.09f

    .line 615
    .line 616
    .line 617
    const v26, -0x428a3d71    # -0.06f

    .line 618
    .line 619
    .line 620
    const v23, 0x3d75c28f    # 0.06f

    .line 621
    .line 622
    .line 623
    const v24, -0x42dc28f6    # -0.04f

    .line 624
    .line 625
    .line 626
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const v4, 0x3f733333    # 0.95f

    .line 630
    .line 631
    .line 632
    const v6, 0x3ec28f5c    # 0.38f

    .line 633
    .line 634
    .line 635
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const v25, 0x3e19999a    # 0.15f

    .line 639
    .line 640
    .line 641
    const v26, 0x3cf5c28f    # 0.03f

    .line 642
    .line 643
    .line 644
    const v21, 0x3d4ccccd    # 0.05f

    .line 645
    .line 646
    .line 647
    const v22, 0x3ca3d70a    # 0.02f

    .line 648
    .line 649
    .line 650
    const v23, 0x3dcccccd    # 0.1f

    .line 651
    .line 652
    .line 653
    const v24, 0x3cf5c28f    # 0.03f

    .line 654
    .line 655
    .line 656
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    const v25, 0x3eb33333    # 0.35f

    .line 660
    .line 661
    .line 662
    const v26, -0x41b33333    # -0.2f

    .line 663
    .line 664
    .line 665
    const v21, 0x3e0f5c29    # 0.14f

    .line 666
    .line 667
    .line 668
    const/16 v22, 0x0

    .line 669
    .line 670
    const v23, 0x3e8a3d71    # 0.27f

    .line 671
    .line 672
    .line 673
    const v24, -0x4270a3d7    # -0.07f

    .line 674
    .line 675
    .line 676
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 677
    .line 678
    .line 679
    const v4, 0x3f59999a    # 0.85f

    .line 680
    .line 681
    .line 682
    const v6, -0x40428f5c    # -1.48f

    .line 683
    .line 684
    .line 685
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    const v25, 0x41ae7ae1    # 21.81f

    .line 689
    .line 690
    .line 691
    const v26, 0x414bd70a    # 12.74f

    .line 692
    .line 693
    .line 694
    const v21, 0x41b0147b    # 22.01f

    .line 695
    .line 696
    .line 697
    const v22, 0x415147ae    # 13.08f

    .line 698
    .line 699
    .line 700
    const v23, 0x41afc28f    # 21.97f

    .line 701
    .line 702
    .line 703
    const v24, 0x414dc28f    # 12.86f

    .line 704
    .line 705
    .line 706
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    const/high16 v4, 0x41580000    # 13.5f

    .line 713
    .line 714
    const/high16 v6, 0x41900000    # 18.0f

    .line 715
    .line 716
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 717
    .line 718
    .line 719
    const/high16 v25, -0x40400000    # -1.5f

    .line 720
    .line 721
    const/high16 v26, -0x40400000    # -1.5f

    .line 722
    .line 723
    const v21, -0x40ab851f    # -0.83f

    .line 724
    .line 725
    .line 726
    const/16 v22, 0x0

    .line 727
    .line 728
    const/high16 v23, -0x40400000    # -1.5f

    .line 729
    .line 730
    const v24, -0x40d47ae1    # -0.67f

    .line 731
    .line 732
    .line 733
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 734
    .line 735
    .line 736
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 737
    .line 738
    const/16 v21, 0x0

    .line 739
    .line 740
    const v22, -0x40ab851f    # -0.83f

    .line 741
    .line 742
    .line 743
    const v23, 0x3f2b851f    # 0.67f

    .line 744
    .line 745
    .line 746
    const/high16 v24, -0x40400000    # -1.5f

    .line 747
    .line 748
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 749
    .line 750
    .line 751
    const v4, 0x3f2b851f    # 0.67f

    .line 752
    .line 753
    .line 754
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 755
    .line 756
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 757
    .line 758
    .line 759
    const/high16 v25, 0x41900000    # 18.0f

    .line 760
    .line 761
    const/high16 v26, 0x41580000    # 13.5f

    .line 762
    .line 763
    const/high16 v21, 0x419c0000    # 19.5f

    .line 764
    .line 765
    const v22, 0x414d47ae    # 12.83f

    .line 766
    .line 767
    .line 768
    const v23, 0x4196a3d7    # 18.83f

    .line 769
    .line 770
    .line 771
    const/high16 v24, 0x41580000    # 13.5f

    .line 772
    .line 773
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 774
    .line 775
    .line 776
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 777
    .line 778
    .line 779
    const/high16 v4, 0x41880000    # 17.0f

    .line 780
    .line 781
    const/high16 v6, 0x41900000    # 18.0f

    .line 782
    .line 783
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 784
    .line 785
    .line 786
    const/high16 v4, 0x40e00000    # 7.0f

    .line 787
    .line 788
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 789
    .line 790
    .line 791
    const/high16 v4, 0x40c00000    # 6.0f

    .line 792
    .line 793
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 794
    .line 795
    .line 796
    const/high16 v4, 0x41200000    # 10.0f

    .line 797
    .line 798
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 799
    .line 800
    .line 801
    const/high16 v4, 0x3f800000    # 1.0f

    .line 802
    .line 803
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 804
    .line 805
    .line 806
    const/high16 v4, 0x40000000    # 2.0f

    .line 807
    .line 808
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 809
    .line 810
    .line 811
    const/high16 v4, 0x40400000    # 3.0f

    .line 812
    .line 813
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 814
    .line 815
    .line 816
    const/high16 v25, -0x40000000    # -2.0f

    .line 817
    .line 818
    const/high16 v26, -0x40000000    # -2.0f

    .line 819
    .line 820
    const/16 v21, 0x0

    .line 821
    .line 822
    const v22, -0x40733333    # -1.1f

    .line 823
    .line 824
    .line 825
    const v23, -0x4099999a    # -0.9f

    .line 826
    .line 827
    .line 828
    const/high16 v24, -0x40000000    # -2.0f

    .line 829
    .line 830
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 831
    .line 832
    .line 833
    const/high16 v4, 0x40e00000    # 7.0f

    .line 834
    .line 835
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 836
    .line 837
    .line 838
    const/high16 v25, 0x40a00000    # 5.0f

    .line 839
    .line 840
    const/high16 v26, 0x40400000    # 3.0f

    .line 841
    .line 842
    const v21, 0x40bccccd    # 5.9f

    .line 843
    .line 844
    .line 845
    const/high16 v22, 0x3f800000    # 1.0f

    .line 846
    .line 847
    const/high16 v23, 0x40a00000    # 5.0f

    .line 848
    .line 849
    const v24, 0x3ff33333    # 1.9f

    .line 850
    .line 851
    .line 852
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 853
    .line 854
    .line 855
    const/high16 v4, 0x41900000    # 18.0f

    .line 856
    .line 857
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 858
    .line 859
    .line 860
    const/high16 v25, 0x40000000    # 2.0f

    .line 861
    .line 862
    const/high16 v26, 0x40000000    # 2.0f

    .line 863
    .line 864
    const/16 v21, 0x0

    .line 865
    .line 866
    const v22, 0x3f8ccccd    # 1.1f

    .line 867
    .line 868
    .line 869
    const v23, 0x3f666666    # 0.9f

    .line 870
    .line 871
    .line 872
    const/high16 v24, 0x40000000    # 2.0f

    .line 873
    .line 874
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 875
    .line 876
    .line 877
    const/high16 v4, 0x41200000    # 10.0f

    .line 878
    .line 879
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 880
    .line 881
    .line 882
    const/high16 v26, -0x40000000    # -2.0f

    .line 883
    .line 884
    const v21, 0x3f8ccccd    # 1.1f

    .line 885
    .line 886
    .line 887
    const/16 v22, 0x0

    .line 888
    .line 889
    const/high16 v23, 0x40000000    # 2.0f

    .line 890
    .line 891
    const v24, -0x4099999a    # -0.9f

    .line 892
    .line 893
    .line 894
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 895
    .line 896
    .line 897
    const/high16 v4, -0x3f800000    # -4.0f

    .line 898
    .line 899
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 900
    .line 901
    .line 902
    const/high16 v4, -0x40000000    # -2.0f

    .line 903
    .line 904
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 905
    .line 906
    .line 907
    const/high16 v4, 0x41900000    # 18.0f

    .line 908
    .line 909
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 910
    .line 911
    .line 912
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 913
    .line 914
    .line 915
    const/high16 v4, 0x40400000    # 3.0f

    .line 916
    .line 917
    const/high16 v6, 0x40e00000    # 7.0f

    .line 918
    .line 919
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 920
    .line 921
    .line 922
    const/high16 v4, 0x41200000    # 10.0f

    .line 923
    .line 924
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 925
    .line 926
    .line 927
    const/high16 v4, 0x3f800000    # 1.0f

    .line 928
    .line 929
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 930
    .line 931
    .line 932
    const/high16 v4, 0x40e00000    # 7.0f

    .line 933
    .line 934
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 935
    .line 936
    .line 937
    const/high16 v4, 0x40400000    # 3.0f

    .line 938
    .line 939
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 940
    .line 941
    .line 942
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 943
    .line 944
    .line 945
    const/high16 v4, 0x41a80000    # 21.0f

    .line 946
    .line 947
    const/high16 v6, 0x41880000    # 17.0f

    .line 948
    .line 949
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 950
    .line 951
    .line 952
    const/high16 v4, 0x40e00000    # 7.0f

    .line 953
    .line 954
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 955
    .line 956
    .line 957
    const/high16 v4, -0x40800000    # -1.0f

    .line 958
    .line 959
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 960
    .line 961
    .line 962
    const/high16 v4, 0x41200000    # 10.0f

    .line 963
    .line 964
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 965
    .line 966
    .line 967
    const/high16 v4, 0x41a80000    # 21.0f

    .line 968
    .line 969
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 970
    .line 971
    .line 972
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 973
    .line 974
    .line 975
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 976
    .line 977
    .line 978
    move-result-object v2

    .line 979
    const/16 v16, 0x3800

    .line 980
    .line 981
    const/16 v17, 0x0

    .line 982
    .line 983
    const/high16 v6, 0x3f800000    # 1.0f

    .line 984
    .line 985
    const/high16 v8, 0x3f800000    # 1.0f

    .line 986
    .line 987
    const/4 v7, 0x0

    .line 988
    const/high16 v9, 0x3f800000    # 1.0f

    .line 989
    .line 990
    const/high16 v12, 0x3f800000    # 1.0f

    .line 991
    .line 992
    const/4 v13, 0x0

    .line 993
    const/4 v14, 0x0

    .line 994
    const/4 v15, 0x0

    .line 995
    const-string v4, ""

    .line 996
    .line 997
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 998
    .line 999
    .line 1000
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1001
    .line 1002
    .line 1003
    move-result v3

    .line 1004
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1005
    .line 1006
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1007
    .line 1008
    .line 1009
    move-result-wide v6

    .line 1010
    const/4 v2, 0x0

    .line 1011
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1012
    .line 1013
    .line 1014
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1015
    .line 1016
    .line 1017
    move-result v10

    .line 1018
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1019
    .line 1020
    .line 1021
    move-result v11

    .line 1022
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1023
    .line 1024
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1025
    .line 1026
    .line 1027
    const/high16 v4, 0x40400000    # 3.0f

    .line 1028
    .line 1029
    const/high16 v6, 0x40e00000    # 7.0f

    .line 1030
    .line 1031
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1032
    .line 1033
    .line 1034
    const/high16 v4, 0x41200000    # 10.0f

    .line 1035
    .line 1036
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1037
    .line 1038
    .line 1039
    const/high16 v4, 0x3f800000    # 1.0f

    .line 1040
    .line 1041
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1042
    .line 1043
    .line 1044
    const/high16 v4, -0x3ee00000    # -10.0f

    .line 1045
    .line 1046
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1047
    .line 1048
    .line 1049
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1050
    .line 1051
    .line 1052
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v2

    .line 1056
    const v6, 0x3e99999a    # 0.3f

    .line 1057
    .line 1058
    .line 1059
    const v8, 0x3e99999a    # 0.3f

    .line 1060
    .line 1061
    .line 1062
    const/4 v7, 0x0

    .line 1063
    const-string v4, ""

    .line 1064
    .line 1065
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1066
    .line 1067
    .line 1068
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1069
    .line 1070
    .line 1071
    move-result v3

    .line 1072
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1073
    .line 1074
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1075
    .line 1076
    .line 1077
    move-result-wide v6

    .line 1078
    const/4 v0, 0x0

    .line 1079
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1080
    .line 1081
    .line 1082
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1083
    .line 1084
    .line 1085
    move-result v10

    .line 1086
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1087
    .line 1088
    .line 1089
    move-result v11

    .line 1090
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1091
    .line 1092
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1093
    .line 1094
    .line 1095
    const/high16 v2, 0x41a00000    # 20.0f

    .line 1096
    .line 1097
    const/high16 v4, 0x40e00000    # 7.0f

    .line 1098
    .line 1099
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1100
    .line 1101
    .line 1102
    const/high16 v2, 0x41200000    # 10.0f

    .line 1103
    .line 1104
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1105
    .line 1106
    .line 1107
    const/high16 v2, 0x3f800000    # 1.0f

    .line 1108
    .line 1109
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1110
    .line 1111
    .line 1112
    const/high16 v2, -0x3ee00000    # -10.0f

    .line 1113
    .line 1114
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1115
    .line 1116
    .line 1117
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1118
    .line 1119
    .line 1120
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v2

    .line 1124
    const v6, 0x3e99999a    # 0.3f

    .line 1125
    .line 1126
    .line 1127
    const/4 v7, 0x0

    .line 1128
    const-string v4, ""

    .line 1129
    .line 1130
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v0

    .line 1134
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v0

    .line 1138
    sput-object v0, Landroidx/compose/material/icons/twotone/AppSettingsAltKt;->_appSettingsAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1139
    .line 1140
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1141
    .line 1142
    .line 1143
    return-object v0
.end method
