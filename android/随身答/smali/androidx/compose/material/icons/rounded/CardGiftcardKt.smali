.class public final Landroidx/compose/material/icons/rounded/CardGiftcardKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_cardGiftcard",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "CardGiftcard",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getCardGiftcard",
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
        "SMAP\nCardGiftcard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardGiftcard.kt\nandroidx/compose/material/icons/rounded/CardGiftcardKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,91:1\n212#2,12:92\n233#2,18:105\n253#2:142\n174#3:104\n705#4,2:123\n717#4,2:125\n719#4,11:131\n72#5,4:127\n*S KotlinDebug\n*F\n+ 1 CardGiftcard.kt\nandroidx/compose/material/icons/rounded/CardGiftcardKt\n*L\n29#1:92,12\n30#1:105,18\n30#1:142\n29#1:104\n30#1:123,2\n30#1:125,2\n30#1:131,11\n30#1:127,4\n*E\n"
    }
.end annotation


# static fields
.field private static _cardGiftcard:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCardGiftcard(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/CardGiftcardKt;->_cardGiftcard:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.CardGiftcard"

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
    const/high16 v0, 0x40c00000    # 6.0f

    .line 71
    .line 72
    const/high16 v2, 0x41a00000    # 20.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v0, -0x3ff47ae1    # -2.18f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v17, 0x3e3851ec    # 0.18f

    .line 84
    .line 85
    .line 86
    const/high16 v18, -0x40800000    # -1.0f

    .line 87
    .line 88
    const v13, 0x3de147ae    # 0.11f

    .line 89
    .line 90
    .line 91
    const v14, -0x416147ae    # -0.31f

    .line 92
    .line 93
    .line 94
    const v15, 0x3e3851ec    # 0.18f

    .line 95
    .line 96
    .line 97
    const v16, -0x40d9999a    # -0.65f

    .line 98
    .line 99
    .line 100
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 104
    .line 105
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 106
    .line 107
    const/4 v13, 0x0

    .line 108
    const v14, -0x402b851f    # -1.66f

    .line 109
    .line 110
    .line 111
    const v15, -0x40547ae1    # -1.34f

    .line 112
    .line 113
    .line 114
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 115
    .line 116
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 120
    .line 121
    const v18, 0x3faccccd    # 1.35f

    .line 122
    .line 123
    .line 124
    const v13, -0x4079999a    # -1.05f

    .line 125
    .line 126
    .line 127
    const/4 v14, 0x0

    .line 128
    const v15, -0x40051eb8    # -1.96f

    .line 129
    .line 130
    .line 131
    const v16, 0x3f0a3d71    # 0.54f

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v0, 0x3f2b851f    # 0.67f

    .line 138
    .line 139
    .line 140
    const/high16 v2, -0x41000000    # -0.5f

    .line 141
    .line 142
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v0, -0x40d1eb85    # -0.68f

    .line 146
    .line 147
    .line 148
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v17, 0x41100000    # 9.0f

    .line 152
    .line 153
    const/high16 v18, 0x40000000    # 2.0f

    .line 154
    .line 155
    const v13, 0x412f5c29    # 10.96f

    .line 156
    .line 157
    .line 158
    const v14, 0x40228f5c    # 2.54f

    .line 159
    .line 160
    .line 161
    const v15, 0x4120cccd    # 10.05f

    .line 162
    .line 163
    .line 164
    const/high16 v16, 0x40000000    # 2.0f

    .line 165
    .line 166
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const/high16 v17, 0x40c00000    # 6.0f

    .line 170
    .line 171
    const/high16 v18, 0x40a00000    # 5.0f

    .line 172
    .line 173
    const v13, 0x40eae148    # 7.34f

    .line 174
    .line 175
    .line 176
    const/high16 v14, 0x40000000    # 2.0f

    .line 177
    .line 178
    const/high16 v15, 0x40c00000    # 6.0f

    .line 179
    .line 180
    const v16, 0x4055c28f    # 3.34f

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v17, 0x3e3851ec    # 0.18f

    .line 187
    .line 188
    .line 189
    const/high16 v18, 0x3f800000    # 1.0f

    .line 190
    .line 191
    const/4 v13, 0x0

    .line 192
    const v14, 0x3eb33333    # 0.35f

    .line 193
    .line 194
    .line 195
    const v15, 0x3d8f5c29    # 0.07f

    .line 196
    .line 197
    .line 198
    const v16, 0x3f30a3d7    # 0.69f

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v0, 0x40c00000    # 6.0f

    .line 205
    .line 206
    const/high16 v2, 0x40800000    # 4.0f

    .line 207
    .line 208
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v17, -0x400147ae    # -1.99f

    .line 212
    .line 213
    .line 214
    const/high16 v18, 0x40000000    # 2.0f

    .line 215
    .line 216
    const v13, -0x4071eb85    # -1.11f

    .line 217
    .line 218
    .line 219
    const/4 v14, 0x0

    .line 220
    const v15, -0x400147ae    # -1.99f

    .line 221
    .line 222
    .line 223
    const v16, 0x3f63d70a    # 0.89f

    .line 224
    .line 225
    .line 226
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/high16 v0, 0x40000000    # 2.0f

    .line 230
    .line 231
    const/high16 v2, 0x41980000    # 19.0f

    .line 232
    .line 233
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v17, 0x40000000    # 2.0f

    .line 237
    .line 238
    const/4 v13, 0x0

    .line 239
    const v14, 0x3f8e147b    # 1.11f

    .line 240
    .line 241
    .line 242
    const v15, 0x3f63d70a    # 0.89f

    .line 243
    .line 244
    .line 245
    const/high16 v16, 0x40000000    # 2.0f

    .line 246
    .line 247
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v0, 0x41800000    # 16.0f

    .line 251
    .line 252
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v18, -0x40000000    # -2.0f

    .line 256
    .line 257
    const v13, 0x3f8e147b    # 1.11f

    .line 258
    .line 259
    .line 260
    const/4 v14, 0x0

    .line 261
    const/high16 v15, 0x40000000    # 2.0f

    .line 262
    .line 263
    const v16, -0x409c28f6    # -0.89f

    .line 264
    .line 265
    .line 266
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/high16 v0, 0x41b00000    # 22.0f

    .line 270
    .line 271
    const/high16 v2, 0x41000000    # 8.0f

    .line 272
    .line 273
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/high16 v17, -0x40000000    # -2.0f

    .line 277
    .line 278
    const/4 v13, 0x0

    .line 279
    const v14, -0x4071eb85    # -1.11f

    .line 280
    .line 281
    .line 282
    const v15, -0x409c28f6    # -0.89f

    .line 283
    .line 284
    .line 285
    const/high16 v16, -0x40000000    # -2.0f

    .line 286
    .line 287
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v0, 0x41700000    # 15.0f

    .line 294
    .line 295
    const/high16 v2, 0x40800000    # 4.0f

    .line 296
    .line 297
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v17, 0x3f800000    # 1.0f

    .line 301
    .line 302
    const/high16 v18, 0x3f800000    # 1.0f

    .line 303
    .line 304
    const v13, 0x3f0ccccd    # 0.55f

    .line 305
    .line 306
    .line 307
    const/4 v14, 0x0

    .line 308
    const/high16 v15, 0x3f800000    # 1.0f

    .line 309
    .line 310
    const v16, 0x3ee66666    # 0.45f

    .line 311
    .line 312
    .line 313
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const v0, -0x4119999a    # -0.45f

    .line 317
    .line 318
    .line 319
    const/high16 v2, 0x3f800000    # 1.0f

    .line 320
    .line 321
    const/high16 v4, -0x40800000    # -1.0f

    .line 322
    .line 323
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v2, -0x40800000    # -1.0f

    .line 327
    .line 328
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v0, 0x3ee66666    # 0.45f

    .line 332
    .line 333
    .line 334
    const/high16 v2, 0x3f800000    # 1.0f

    .line 335
    .line 336
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v0, 0x41100000    # 9.0f

    .line 343
    .line 344
    const/high16 v2, 0x40800000    # 4.0f

    .line 345
    .line 346
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const v0, -0x4119999a    # -0.45f

    .line 353
    .line 354
    .line 355
    const/high16 v2, 0x3f800000    # 1.0f

    .line 356
    .line 357
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/high16 v2, -0x40800000    # -1.0f

    .line 361
    .line 362
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v0, 0x3ee66666    # 0.45f

    .line 366
    .line 367
    .line 368
    const/high16 v2, 0x3f800000    # 1.0f

    .line 369
    .line 370
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v0, 0x41a00000    # 20.0f

    .line 377
    .line 378
    const/high16 v2, 0x41980000    # 19.0f

    .line 379
    .line 380
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const/high16 v0, 0x41980000    # 19.0f

    .line 384
    .line 385
    const/high16 v2, 0x40800000    # 4.0f

    .line 386
    .line 387
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v0, -0x40000000    # -2.0f

    .line 391
    .line 392
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/high16 v0, 0x41800000    # 16.0f

    .line 396
    .line 397
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v0, 0x40000000    # 2.0f

    .line 401
    .line 402
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v0, 0x41600000    # 14.0f

    .line 409
    .line 410
    const/high16 v2, 0x41a00000    # 20.0f

    .line 411
    .line 412
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v2, 0x40800000    # 4.0f

    .line 416
    .line 417
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v0, 0x41100000    # 9.0f

    .line 421
    .line 422
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const/high16 v18, -0x40800000    # -1.0f

    .line 426
    .line 427
    const/4 v13, 0x0

    .line 428
    const v14, -0x40f33333    # -0.55f

    .line 429
    .line 430
    .line 431
    const v15, 0x3ee66666    # 0.45f

    .line 432
    .line 433
    .line 434
    const/high16 v16, -0x40800000    # -1.0f

    .line 435
    .line 436
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v0, 0x40828f5c    # 4.08f

    .line 440
    .line 441
    .line 442
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const v0, 0x40f33333    # 7.6f

    .line 446
    .line 447
    .line 448
    const v2, 0x412051ec    # 10.02f

    .line 449
    .line 450
    .line 451
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v17, 0x3e6147ae    # 0.22f

    .line 455
    .line 456
    .line 457
    const v18, 0x3fb33333    # 1.4f

    .line 458
    .line 459
    .line 460
    const v13, -0x41570a3d    # -0.33f

    .line 461
    .line 462
    .line 463
    const v14, 0x3ee66666    # 0.45f

    .line 464
    .line 465
    .line 466
    const v15, -0x41947ae1    # -0.23f

    .line 467
    .line 468
    .line 469
    const v16, 0x3f8a3d71    # 1.08f

    .line 470
    .line 471
    .line 472
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const v17, 0x3fb1eb85    # 1.39f

    .line 476
    .line 477
    .line 478
    const v18, -0x419eb852    # -0.22f

    .line 479
    .line 480
    .line 481
    const v13, 0x3ee147ae    # 0.44f

    .line 482
    .line 483
    .line 484
    const v14, 0x3ea3d70a    # 0.32f

    .line 485
    .line 486
    .line 487
    const v15, 0x3f88f5c3    # 1.07f

    .line 488
    .line 489
    .line 490
    const v16, 0x3e6147ae    # 0.22f

    .line 491
    .line 492
    .line 493
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const/high16 v0, 0x41400000    # 12.0f

    .line 497
    .line 498
    const v2, 0x40eccccd    # 7.4f

    .line 499
    .line 500
    .line 501
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const v0, 0x40328f5c    # 2.79f

    .line 505
    .line 506
    .line 507
    const v2, 0x40733333    # 3.8f

    .line 508
    .line 509
    .line 510
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v18, 0x3e6147ae    # 0.22f

    .line 514
    .line 515
    .line 516
    const v13, 0x3ea3d70a    # 0.32f

    .line 517
    .line 518
    .line 519
    const v14, 0x3ee147ae    # 0.44f

    .line 520
    .line 521
    .line 522
    const v15, 0x3f733333    # 0.95f

    .line 523
    .line 524
    .line 525
    const v16, 0x3f0a3d71    # 0.54f

    .line 526
    .line 527
    .line 528
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const v17, 0x3e6147ae    # 0.22f

    .line 532
    .line 533
    .line 534
    const v18, -0x404ccccd    # -1.4f

    .line 535
    .line 536
    .line 537
    const v13, 0x3ee66666    # 0.45f

    .line 538
    .line 539
    .line 540
    const v14, -0x415c28f6    # -0.32f

    .line 541
    .line 542
    .line 543
    const v15, 0x3f0ccccd    # 0.55f

    .line 544
    .line 545
    .line 546
    const v16, -0x408ccccd    # -0.95f

    .line 547
    .line 548
    .line 549
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const v0, 0x416eb852    # 14.92f

    .line 553
    .line 554
    .line 555
    const/high16 v2, 0x41000000    # 8.0f

    .line 556
    .line 557
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const/high16 v0, 0x41000000    # 8.0f

    .line 561
    .line 562
    const/high16 v2, 0x41980000    # 19.0f

    .line 563
    .line 564
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const/high16 v17, 0x3f800000    # 1.0f

    .line 568
    .line 569
    const/high16 v18, 0x3f800000    # 1.0f

    .line 570
    .line 571
    const v13, 0x3f0ccccd    # 0.55f

    .line 572
    .line 573
    .line 574
    const/4 v14, 0x0

    .line 575
    const/high16 v15, 0x3f800000    # 1.0f

    .line 576
    .line 577
    const v16, 0x3ee66666    # 0.45f

    .line 578
    .line 579
    .line 580
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const/high16 v0, 0x40a00000    # 5.0f

    .line 584
    .line 585
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 592
    .line 593
    .line 594
    move-result-object v2

    .line 595
    const/16 v16, 0x3800

    .line 596
    .line 597
    const/16 v17, 0x0

    .line 598
    .line 599
    const/high16 v6, 0x3f800000    # 1.0f

    .line 600
    .line 601
    const/high16 v8, 0x3f800000    # 1.0f

    .line 602
    .line 603
    const/4 v7, 0x0

    .line 604
    const/high16 v9, 0x3f800000    # 1.0f

    .line 605
    .line 606
    const/high16 v12, 0x3f800000    # 1.0f

    .line 607
    .line 608
    const/4 v13, 0x0

    .line 609
    const/4 v15, 0x0

    .line 610
    const-string v4, ""

    .line 611
    .line 612
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 613
    .line 614
    .line 615
    move-result-object v0

    .line 616
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 617
    .line 618
    .line 619
    move-result-object v0

    .line 620
    sput-object v0, Landroidx/compose/material/icons/rounded/CardGiftcardKt;->_cardGiftcard:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 621
    .line 622
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 623
    .line 624
    .line 625
    return-object v0
.end method
