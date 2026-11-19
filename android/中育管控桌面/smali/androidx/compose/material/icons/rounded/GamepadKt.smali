.class public final Landroidx/compose/material/icons/rounded/GamepadKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_gamepad",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Gamepad",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getGamepad",
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
        "SMAP\nGamepad.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Gamepad.kt\nandroidx/compose/material/icons/rounded/GamepadKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,85:1\n212#2,12:86\n233#2,18:99\n253#2:136\n174#3:98\n705#4,2:117\n717#4,2:119\n719#4,11:125\n72#5,4:121\n*S KotlinDebug\n*F\n+ 1 Gamepad.kt\nandroidx/compose/material/icons/rounded/GamepadKt\n*L\n29#1:86,12\n30#1:99,18\n30#1:136\n29#1:98\n30#1:117,2\n30#1:119,2\n30#1:125,11\n30#1:121,4\n*E\n"
    }
.end annotation


# static fields
.field private static _gamepad:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getGamepad(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/GamepadKt;->_gamepad:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Gamepad"

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
    const v0, 0x40e947ae    # 7.29f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41700000    # 15.0f

    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v0, 0x40400000    # 3.0f

    .line 79
    .line 80
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v17, -0x40800000    # -1.0f

    .line 84
    .line 85
    const/high16 v18, -0x40800000    # -1.0f

    .line 86
    .line 87
    const/4 v13, 0x0

    .line 88
    const v14, -0x40f33333    # -0.55f

    .line 89
    .line 90
    .line 91
    const v15, -0x4119999a    # -0.45f

    .line 92
    .line 93
    .line 94
    const/high16 v16, -0x40800000    # -1.0f

    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v0, -0x3f800000    # -4.0f

    .line 100
    .line 101
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v18, 0x3f800000    # 1.0f

    .line 105
    .line 106
    const v13, -0x40f33333    # -0.55f

    .line 107
    .line 108
    .line 109
    const/4 v14, 0x0

    .line 110
    const/high16 v15, -0x40800000    # -1.0f

    .line 111
    .line 112
    const v16, 0x3ee66666    # 0.45f

    .line 113
    .line 114
    .line 115
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v0, 0x408947ae    # 4.29f

    .line 119
    .line 120
    .line 121
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v17, 0x3e19999a    # 0.15f

    .line 125
    .line 126
    .line 127
    const v18, 0x3eb33333    # 0.35f

    .line 128
    .line 129
    .line 130
    const/4 v13, 0x0

    .line 131
    const v14, 0x3e051eb8    # 0.13f

    .line 132
    .line 133
    .line 134
    const v15, 0x3d4ccccd    # 0.05f

    .line 135
    .line 136
    .line 137
    const v16, 0x3e851eb8    # 0.26f

    .line 138
    .line 139
    .line 140
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v0, 0x40200000    # 2.5f

    .line 144
    .line 145
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v17, 0x3f35c28f    # 0.71f

    .line 149
    .line 150
    .line 151
    const/16 v18, 0x0

    .line 152
    .line 153
    const v13, 0x3e4ccccd    # 0.2f

    .line 154
    .line 155
    .line 156
    const v14, 0x3e4ccccd    # 0.2f

    .line 157
    .line 158
    .line 159
    const v15, 0x3f028f5c    # 0.51f

    .line 160
    .line 161
    .line 162
    const v16, 0x3e4ccccd    # 0.2f

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v0, -0x3fe00000    # -2.5f

    .line 169
    .line 170
    const/high16 v2, 0x40200000    # 2.5f

    .line 171
    .line 172
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v17, 0x3e0f5c29    # 0.14f

    .line 176
    .line 177
    .line 178
    const v18, -0x414ccccd    # -0.35f

    .line 179
    .line 180
    .line 181
    const v13, 0x3db851ec    # 0.09f

    .line 182
    .line 183
    .line 184
    const v14, -0x4247ae14    # -0.09f

    .line 185
    .line 186
    .line 187
    const v15, 0x3e0f5c29    # 0.14f

    .line 188
    .line 189
    .line 190
    const v16, -0x41a8f5c3    # -0.21f

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v0, 0x40e947ae    # 7.29f

    .line 200
    .line 201
    .line 202
    const/high16 v2, 0x41100000    # 9.0f

    .line 203
    .line 204
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v0, 0x40400000    # 3.0f

    .line 208
    .line 209
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v17, -0x40800000    # -1.0f

    .line 213
    .line 214
    const/high16 v18, 0x3f800000    # 1.0f

    .line 215
    .line 216
    const v13, -0x40f33333    # -0.55f

    .line 217
    .line 218
    .line 219
    const/4 v14, 0x0

    .line 220
    const/high16 v15, -0x40800000    # -1.0f

    .line 221
    .line 222
    const v16, 0x3ee66666    # 0.45f

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v0, 0x40800000    # 4.0f

    .line 229
    .line 230
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v17, 0x3f800000    # 1.0f

    .line 234
    .line 235
    const/4 v13, 0x0

    .line 236
    const v14, 0x3f0ccccd    # 0.55f

    .line 237
    .line 238
    .line 239
    const v15, 0x3ee66666    # 0.45f

    .line 240
    .line 241
    .line 242
    const/high16 v16, 0x3f800000    # 1.0f

    .line 243
    .line 244
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v0, 0x408947ae    # 4.29f

    .line 248
    .line 249
    .line 250
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v17, 0x3eb33333    # 0.35f

    .line 254
    .line 255
    .line 256
    const v18, -0x41e66666    # -0.15f

    .line 257
    .line 258
    .line 259
    const v13, 0x3e051eb8    # 0.13f

    .line 260
    .line 261
    .line 262
    const/4 v14, 0x0

    .line 263
    const v15, 0x3e851eb8    # 0.26f

    .line 264
    .line 265
    .line 266
    const v16, -0x42b33333    # -0.05f

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v0, -0x3fe00000    # -2.5f

    .line 273
    .line 274
    const/high16 v2, 0x40200000    # 2.5f

    .line 275
    .line 276
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const/16 v17, 0x0

    .line 280
    .line 281
    const v18, -0x40ca3d71    # -0.71f

    .line 282
    .line 283
    .line 284
    const v13, 0x3e4ccccd    # 0.2f

    .line 285
    .line 286
    .line 287
    const v14, -0x41b33333    # -0.2f

    .line 288
    .line 289
    .line 290
    const v15, 0x3e4ccccd    # 0.2f

    .line 291
    .line 292
    .line 293
    const v16, -0x40fd70a4    # -0.51f

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v17, 0x40e947ae    # 7.29f

    .line 303
    .line 304
    .line 305
    const/high16 v18, 0x41100000    # 9.0f

    .line 306
    .line 307
    const v13, 0x40f1999a    # 7.55f

    .line 308
    .line 309
    .line 310
    const v14, 0x4110cccd    # 9.05f

    .line 311
    .line 312
    .line 313
    const v15, 0x40edc28f    # 7.43f

    .line 314
    .line 315
    .line 316
    const/high16 v16, 0x41100000    # 9.0f

    .line 317
    .line 318
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v0, 0x4185ae14    # 16.71f

    .line 325
    .line 326
    .line 327
    const/high16 v2, 0x41100000    # 9.0f

    .line 328
    .line 329
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v0, 0x41a80000    # 21.0f

    .line 333
    .line 334
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/high16 v17, 0x3f800000    # 1.0f

    .line 338
    .line 339
    const/high16 v18, 0x3f800000    # 1.0f

    .line 340
    .line 341
    const/4 v13, 0x0

    .line 342
    const v14, 0x3f0ccccd    # 0.55f

    .line 343
    .line 344
    .line 345
    const v15, 0x3ee66666    # 0.45f

    .line 346
    .line 347
    .line 348
    const/high16 v16, 0x3f800000    # 1.0f

    .line 349
    .line 350
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/high16 v0, 0x40800000    # 4.0f

    .line 354
    .line 355
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v18, -0x40800000    # -1.0f

    .line 359
    .line 360
    const v13, 0x3f0ccccd    # 0.55f

    .line 361
    .line 362
    .line 363
    const/4 v14, 0x0

    .line 364
    const/high16 v15, 0x3f800000    # 1.0f

    .line 365
    .line 366
    const v16, -0x4119999a    # -0.45f

    .line 367
    .line 368
    .line 369
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v0, -0x3f76b852    # -4.29f

    .line 373
    .line 374
    .line 375
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v17, -0x41e66666    # -0.15f

    .line 379
    .line 380
    .line 381
    const v18, -0x414ccccd    # -0.35f

    .line 382
    .line 383
    .line 384
    const/4 v13, 0x0

    .line 385
    const v14, -0x41fae148    # -0.13f

    .line 386
    .line 387
    .line 388
    const v15, -0x42b33333    # -0.05f

    .line 389
    .line 390
    .line 391
    const v16, -0x417ae148    # -0.26f

    .line 392
    .line 393
    .line 394
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const/high16 v0, -0x3fe00000    # -2.5f

    .line 398
    .line 399
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v17, -0x40ca3d71    # -0.71f

    .line 403
    .line 404
    .line 405
    const/16 v18, 0x0

    .line 406
    .line 407
    const v13, -0x41b33333    # -0.2f

    .line 408
    .line 409
    .line 410
    const v14, -0x41b33333    # -0.2f

    .line 411
    .line 412
    .line 413
    const v15, -0x40fd70a4    # -0.51f

    .line 414
    .line 415
    .line 416
    const v16, -0x41b33333    # -0.2f

    .line 417
    .line 418
    .line 419
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const/high16 v2, 0x40200000    # 2.5f

    .line 423
    .line 424
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v17, -0x41f0a3d7    # -0.14f

    .line 428
    .line 429
    .line 430
    const v18, 0x3eb33333    # 0.35f

    .line 431
    .line 432
    .line 433
    const v13, -0x4247ae14    # -0.09f

    .line 434
    .line 435
    .line 436
    const v14, 0x3db851ec    # 0.09f

    .line 437
    .line 438
    .line 439
    const v15, -0x41f0a3d7    # -0.14f

    .line 440
    .line 441
    .line 442
    const v16, 0x3e570a3d    # 0.21f

    .line 443
    .line 444
    .line 445
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v0, 0x4182cccd    # 16.35f

    .line 452
    .line 453
    .line 454
    const v2, 0x41126666    # 9.15f

    .line 455
    .line 456
    .line 457
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const/high16 v0, -0x3fe00000    # -2.5f

    .line 461
    .line 462
    const/high16 v2, 0x40200000    # 2.5f

    .line 463
    .line 464
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const/16 v17, 0x0

    .line 468
    .line 469
    const v18, 0x3f35c28f    # 0.71f

    .line 470
    .line 471
    .line 472
    const v13, -0x41b33333    # -0.2f

    .line 473
    .line 474
    .line 475
    const v14, 0x3e4ccccd    # 0.2f

    .line 476
    .line 477
    .line 478
    const v15, -0x41b33333    # -0.2f

    .line 479
    .line 480
    .line 481
    const v16, 0x3f028f5c    # 0.51f

    .line 482
    .line 483
    .line 484
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const/high16 v0, 0x40200000    # 2.5f

    .line 488
    .line 489
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const v17, 0x3eb33333    # 0.35f

    .line 493
    .line 494
    .line 495
    const v18, 0x3e19999a    # 0.15f

    .line 496
    .line 497
    .line 498
    const v13, 0x3db851ec    # 0.09f

    .line 499
    .line 500
    .line 501
    const v14, 0x3db851ec    # 0.09f

    .line 502
    .line 503
    .line 504
    const v15, 0x3e6147ae    # 0.22f

    .line 505
    .line 506
    .line 507
    const v16, 0x3e19999a    # 0.15f

    .line 508
    .line 509
    .line 510
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v0, 0x417028f6    # 15.01f

    .line 514
    .line 515
    .line 516
    const/high16 v2, 0x41a80000    # 21.0f

    .line 517
    .line 518
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const/high16 v17, 0x3f800000    # 1.0f

    .line 522
    .line 523
    const/high16 v18, -0x40800000    # -1.0f

    .line 524
    .line 525
    const v13, 0x3f0ccccd    # 0.55f

    .line 526
    .line 527
    .line 528
    const/4 v14, 0x0

    .line 529
    const/high16 v15, 0x3f800000    # 1.0f

    .line 530
    .line 531
    const v16, -0x4119999a    # -0.45f

    .line 532
    .line 533
    .line 534
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const/high16 v0, -0x3f800000    # -4.0f

    .line 538
    .line 539
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const/high16 v17, -0x40800000    # -1.0f

    .line 543
    .line 544
    const/4 v13, 0x0

    .line 545
    const v14, -0x40f33333    # -0.55f

    .line 546
    .line 547
    .line 548
    const v15, -0x4119999a    # -0.45f

    .line 549
    .line 550
    .line 551
    const/high16 v16, -0x40800000    # -1.0f

    .line 552
    .line 553
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const v0, -0x3f76b852    # -4.29f

    .line 557
    .line 558
    .line 559
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const v17, -0x4147ae14    # -0.36f

    .line 563
    .line 564
    .line 565
    const v18, 0x3e0f5c29    # 0.14f

    .line 566
    .line 567
    .line 568
    const v13, -0x41f0a3d7    # -0.14f

    .line 569
    .line 570
    .line 571
    const v14, -0x43dc28f6    # -0.01f

    .line 572
    .line 573
    .line 574
    const v15, -0x417ae148    # -0.26f

    .line 575
    .line 576
    .line 577
    const v16, 0x3d23d70a    # 0.04f

    .line 578
    .line 579
    .line 580
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 587
    .line 588
    .line 589
    move-result-object v2

    .line 590
    const/16 v16, 0x3800

    .line 591
    .line 592
    const/16 v17, 0x0

    .line 593
    .line 594
    const/high16 v6, 0x3f800000    # 1.0f

    .line 595
    .line 596
    const/high16 v8, 0x3f800000    # 1.0f

    .line 597
    .line 598
    const/4 v7, 0x0

    .line 599
    const/high16 v9, 0x3f800000    # 1.0f

    .line 600
    .line 601
    const/high16 v12, 0x3f800000    # 1.0f

    .line 602
    .line 603
    const/4 v13, 0x0

    .line 604
    const/4 v14, 0x0

    .line 605
    const/4 v15, 0x0

    .line 606
    const-string v4, ""

    .line 607
    .line 608
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 609
    .line 610
    .line 611
    move-result-object v0

    .line 612
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 613
    .line 614
    .line 615
    move-result-object v0

    .line 616
    sput-object v0, Landroidx/compose/material/icons/rounded/GamepadKt;->_gamepad:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 617
    .line 618
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 619
    .line 620
    .line 621
    return-object v0
.end method
