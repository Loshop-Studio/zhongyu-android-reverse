.class public final Landroidx/compose/material/icons/twotone/KeyboardVoiceKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_keyboardVoice",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "KeyboardVoice",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getKeyboardVoice",
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
        "SMAP\nKeyboardVoice.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeyboardVoice.kt\nandroidx/compose/material/icons/twotone/KeyboardVoiceKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,74:1\n212#2,12:75\n233#2,18:88\n253#2:125\n233#2,18:126\n253#2:163\n174#3:87\n705#4,2:106\n717#4,2:108\n719#4,11:114\n705#4,2:144\n717#4,2:146\n719#4,11:152\n72#5,4:110\n72#5,4:148\n*S KotlinDebug\n*F\n+ 1 KeyboardVoice.kt\nandroidx/compose/material/icons/twotone/KeyboardVoiceKt\n*L\n29#1:75,12\n30#1:88,18\n30#1:125\n40#1:126,18\n40#1:163\n29#1:87\n30#1:106,2\n30#1:108,2\n30#1:114,11\n40#1:144,2\n40#1:146,2\n40#1:152,11\n30#1:110,4\n40#1:148,4\n*E\n"
    }
.end annotation


# static fields
.field private static _keyboardVoice:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getKeyboardVoice(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/KeyboardVoiceKt;->_keyboardVoice:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.KeyboardVoice"

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
    const v4, 0x4154cccd    # 13.3f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x41400000    # 12.0f

    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v25, 0x3f9851ec    # 1.19f

    .line 79
    .line 80
    .line 81
    const v26, -0x40666666    # -1.2f

    .line 82
    .line 83
    .line 84
    const v21, 0x3f28f5c3    # 0.66f

    .line 85
    .line 86
    .line 87
    const/16 v22, 0x0

    .line 88
    .line 89
    const v23, 0x3f9851ec    # 1.19f

    .line 90
    .line 91
    .line 92
    const v24, -0x40f5c28f    # -0.54f

    .line 93
    .line 94
    .line 95
    move-object/from16 v20, v2

    .line 96
    .line 97
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v4, 0x3c23d70a    # 0.01f

    .line 101
    .line 102
    .line 103
    const v6, -0x3f39999a    # -6.2f

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v25, -0x40666666    # -1.2f

    .line 110
    .line 111
    .line 112
    const/16 v21, 0x0

    .line 113
    .line 114
    const v22, -0x40d70a3d    # -0.66f

    .line 115
    .line 116
    .line 117
    const v23, -0x40f5c28f    # -0.54f

    .line 118
    .line 119
    .line 120
    const v24, -0x40666666    # -1.2f

    .line 121
    .line 122
    .line 123
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v4, 0x3f0a3d71    # 0.54f

    .line 127
    .line 128
    .line 129
    const v6, 0x3f99999a    # 1.2f

    .line 130
    .line 131
    .line 132
    const v7, -0x40666666    # -1.2f

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v4, 0x40c66666    # 6.2f

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v25, 0x3f99999a    # 1.2f

    .line 145
    .line 146
    .line 147
    const v26, 0x3f99999a    # 1.2f

    .line 148
    .line 149
    .line 150
    const v22, 0x3f28f5c3    # 0.66f

    .line 151
    .line 152
    .line 153
    const v23, 0x3f0a3d71    # 0.54f

    .line 154
    .line 155
    .line 156
    const v24, 0x3f99999a    # 1.2f

    .line 157
    .line 158
    .line 159
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    const/16 v16, 0x3800

    .line 170
    .line 171
    const/16 v17, 0x0

    .line 172
    .line 173
    const v6, 0x3e99999a    # 0.3f

    .line 174
    .line 175
    .line 176
    const v8, 0x3e99999a    # 0.3f

    .line 177
    .line 178
    .line 179
    const/4 v7, 0x0

    .line 180
    const/high16 v9, 0x3f800000    # 1.0f

    .line 181
    .line 182
    const/high16 v12, 0x3f800000    # 1.0f

    .line 183
    .line 184
    const/4 v13, 0x0

    .line 185
    const/4 v14, 0x0

    .line 186
    const/4 v15, 0x0

    .line 187
    const-string v4, ""

    .line 188
    .line 189
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 190
    .line 191
    .line 192
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 197
    .line 198
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 199
    .line 200
    .line 201
    move-result-wide v6

    .line 202
    const/4 v0, 0x0

    .line 203
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 207
    .line 208
    .line 209
    move-result v10

    .line 210
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 211
    .line 212
    .line 213
    move-result v11

    .line 214
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 217
    .line 218
    .line 219
    const/high16 v0, 0x41700000    # 15.0f

    .line 220
    .line 221
    const/high16 v2, 0x41400000    # 12.0f

    .line 222
    .line 223
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v17, 0x403f5c29    # 2.99f

    .line 227
    .line 228
    .line 229
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 230
    .line 231
    const v13, 0x3fd47ae1    # 1.66f

    .line 232
    .line 233
    .line 234
    const v15, 0x403f5c29    # 2.99f

    .line 235
    .line 236
    .line 237
    const v16, -0x40547ae1    # -1.34f

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v0, 0x40c00000    # 6.0f

    .line 244
    .line 245
    const/high16 v2, 0x41700000    # 15.0f

    .line 246
    .line 247
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 251
    .line 252
    const/4 v13, 0x0

    .line 253
    const v14, -0x402b851f    # -1.66f

    .line 254
    .line 255
    .line 256
    const v15, -0x40547ae1    # -1.34f

    .line 257
    .line 258
    .line 259
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 260
    .line 261
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v0, 0x408ae148    # 4.34f

    .line 265
    .line 266
    .line 267
    const/high16 v2, 0x41100000    # 9.0f

    .line 268
    .line 269
    const/high16 v4, 0x40c00000    # 6.0f

    .line 270
    .line 271
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/high16 v0, 0x40c00000    # 6.0f

    .line 275
    .line 276
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const/high16 v17, 0x40400000    # 3.0f

    .line 280
    .line 281
    const/high16 v18, 0x40400000    # 3.0f

    .line 282
    .line 283
    const v14, 0x3fd47ae1    # 1.66f

    .line 284
    .line 285
    .line 286
    const v15, 0x3fab851f    # 1.34f

    .line 287
    .line 288
    .line 289
    const/high16 v16, 0x40400000    # 3.0f

    .line 290
    .line 291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v0, 0x40bccccd    # 5.9f

    .line 298
    .line 299
    .line 300
    const v2, 0x412ccccd    # 10.8f

    .line 301
    .line 302
    .line 303
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v17, 0x3f99999a    # 1.2f

    .line 307
    .line 308
    .line 309
    const v18, -0x40666666    # -1.2f

    .line 310
    .line 311
    .line 312
    const v14, -0x40d70a3d    # -0.66f

    .line 313
    .line 314
    .line 315
    const v15, 0x3f0a3d71    # 0.54f

    .line 316
    .line 317
    .line 318
    const v16, -0x40666666    # -1.2f

    .line 319
    .line 320
    .line 321
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v0, 0x3f0a3d71    # 0.54f

    .line 325
    .line 326
    .line 327
    const v2, 0x3f99999a    # 1.2f

    .line 328
    .line 329
    .line 330
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v0, -0x43dc28f6    # -0.01f

    .line 334
    .line 335
    .line 336
    const v2, 0x40c66666    # 6.2f

    .line 337
    .line 338
    .line 339
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v17, -0x4067ae14    # -1.19f

    .line 343
    .line 344
    .line 345
    const v18, 0x3f99999a    # 1.2f

    .line 346
    .line 347
    .line 348
    const v14, 0x3f28f5c3    # 0.66f

    .line 349
    .line 350
    .line 351
    const v15, -0x40f851ec    # -0.53f

    .line 352
    .line 353
    .line 354
    const v16, 0x3f99999a    # 1.2f

    .line 355
    .line 356
    .line 357
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v0, -0x40f5c28f    # -0.54f

    .line 361
    .line 362
    .line 363
    const v2, -0x40666666    # -1.2f

    .line 364
    .line 365
    .line 366
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v0, 0x40bccccd    # 5.9f

    .line 370
    .line 371
    .line 372
    const v2, 0x412ccccd    # 10.8f

    .line 373
    .line 374
    .line 375
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v0, 0x418a6666    # 17.3f

    .line 382
    .line 383
    .line 384
    const/high16 v2, 0x41400000    # 12.0f

    .line 385
    .line 386
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v17, -0x3f566666    # -5.3f

    .line 390
    .line 391
    .line 392
    const v18, 0x40a33333    # 5.1f

    .line 393
    .line 394
    .line 395
    const/high16 v14, 0x40400000    # 3.0f

    .line 396
    .line 397
    const v15, -0x3fdd70a4    # -2.54f

    .line 398
    .line 399
    .line 400
    const v16, 0x40a33333    # 5.1f

    .line 401
    .line 402
    .line 403
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v0, 0x40d66666    # 6.7f

    .line 407
    .line 408
    .line 409
    const/high16 v2, 0x41700000    # 15.0f

    .line 410
    .line 411
    const/high16 v4, 0x41400000    # 12.0f

    .line 412
    .line 413
    invoke-virtual {v12, v0, v2, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const/high16 v0, 0x40a00000    # 5.0f

    .line 417
    .line 418
    const/high16 v2, 0x41400000    # 12.0f

    .line 419
    .line 420
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v17, 0x40c00000    # 6.0f

    .line 424
    .line 425
    const v18, 0x40d70a3d    # 6.72f

    .line 426
    .line 427
    .line 428
    const v14, 0x405a3d71    # 3.41f

    .line 429
    .line 430
    .line 431
    const v15, 0x402e147b    # 2.72f

    .line 432
    .line 433
    .line 434
    const v16, 0x40c75c29    # 6.23f

    .line 435
    .line 436
    .line 437
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const/high16 v0, 0x41300000    # 11.0f

    .line 441
    .line 442
    const/high16 v2, 0x41b00000    # 22.0f

    .line 443
    .line 444
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const/high16 v0, 0x40000000    # 2.0f

    .line 448
    .line 449
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v0, -0x3fae147b    # -3.28f

    .line 453
    .line 454
    .line 455
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const v18, -0x3f28f5c3    # -6.72f

    .line 459
    .line 460
    .line 461
    const v13, 0x4051eb85    # 3.28f

    .line 462
    .line 463
    .line 464
    const v14, -0x410a3d71    # -0.48f

    .line 465
    .line 466
    .line 467
    const/high16 v15, 0x40c00000    # 6.0f

    .line 468
    .line 469
    const v16, -0x3faccccd    # -3.3f

    .line 470
    .line 471
    .line 472
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const v0, -0x40266666    # -1.7f

    .line 476
    .line 477
    .line 478
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 485
    .line 486
    .line 487
    move-result-object v2

    .line 488
    const/16 v16, 0x3800

    .line 489
    .line 490
    const/16 v17, 0x0

    .line 491
    .line 492
    const/high16 v6, 0x3f800000    # 1.0f

    .line 493
    .line 494
    const/high16 v8, 0x3f800000    # 1.0f

    .line 495
    .line 496
    const/4 v7, 0x0

    .line 497
    const/high16 v12, 0x3f800000    # 1.0f

    .line 498
    .line 499
    const/4 v13, 0x0

    .line 500
    const/4 v14, 0x0

    .line 501
    const/4 v15, 0x0

    .line 502
    const-string v4, ""

    .line 503
    .line 504
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 509
    .line 510
    .line 511
    move-result-object v0

    .line 512
    sput-object v0, Landroidx/compose/material/icons/twotone/KeyboardVoiceKt;->_keyboardVoice:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 513
    .line 514
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 515
    .line 516
    .line 517
    return-object v0
.end method
