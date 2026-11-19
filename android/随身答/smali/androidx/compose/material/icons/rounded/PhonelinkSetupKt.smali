.class public final Landroidx/compose/material/icons/rounded/PhonelinkSetupKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_phonelinkSetup",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "PhonelinkSetup",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getPhonelinkSetup",
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
        "SMAP\nPhonelinkSetup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhonelinkSetup.kt\nandroidx/compose/material/icons/rounded/PhonelinkSetupKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,111:1\n212#2,12:112\n233#2,18:125\n253#2:162\n174#3:124\n705#4,2:143\n717#4,2:145\n719#4,11:151\n72#5,4:147\n*S KotlinDebug\n*F\n+ 1 PhonelinkSetup.kt\nandroidx/compose/material/icons/rounded/PhonelinkSetupKt\n*L\n29#1:112,12\n30#1:125,18\n30#1:162\n29#1:124\n30#1:143,2\n30#1:145,2\n30#1:151,11\n30#1:147,4\n*E\n"
    }
.end annotation


# static fields
.field private static _phonelinkSetup:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPhonelinkSetup(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/PhonelinkSetupKt;->_phonelinkSetup:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.PhonelinkSetup"

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
    const/high16 v0, 0x40400000    # 3.0f

    .line 71
    .line 72
    const/high16 v2, 0x40e00000    # 7.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40000000    # 2.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, 0x3f800000    # 1.0f

    .line 83
    .line 84
    const/high16 v18, 0x3f800000    # 1.0f

    .line 85
    .line 86
    const/4 v13, 0x0

    .line 87
    const v14, 0x3f0ccccd    # 0.55f

    .line 88
    .line 89
    .line 90
    const v15, 0x3ee66666    # 0.45f

    .line 91
    .line 92
    .line 93
    const/high16 v16, 0x3f800000    # 1.0f

    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v0, -0x4119999a    # -0.45f

    .line 99
    .line 100
    .line 101
    const/high16 v2, -0x40800000    # -1.0f

    .line 102
    .line 103
    const/high16 v4, 0x3f800000    # 1.0f

    .line 104
    .line 105
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const/high16 v0, 0x40800000    # 4.0f

    .line 109
    .line 110
    const/high16 v2, 0x41100000    # 9.0f

    .line 111
    .line 112
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v0, 0x41200000    # 10.0f

    .line 116
    .line 117
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v0, 0x41800000    # 16.0f

    .line 121
    .line 122
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v0, 0x41a00000    # 20.0f

    .line 126
    .line 127
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const/high16 v0, -0x40800000    # -1.0f

    .line 131
    .line 132
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v17, -0x40800000    # -1.0f

    .line 136
    .line 137
    const/high16 v18, -0x40800000    # -1.0f

    .line 138
    .line 139
    const v14, -0x40f33333    # -0.55f

    .line 140
    .line 141
    .line 142
    const v15, -0x4119999a    # -0.45f

    .line 143
    .line 144
    .line 145
    const/high16 v16, -0x40800000    # -1.0f

    .line 146
    .line 147
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v0, 0x3ee66666    # 0.45f

    .line 151
    .line 152
    .line 153
    const/high16 v2, -0x40800000    # -1.0f

    .line 154
    .line 155
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v0, 0x40000000    # 2.0f

    .line 159
    .line 160
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/high16 v17, 0x40000000    # 2.0f

    .line 164
    .line 165
    const/high16 v18, 0x40000000    # 2.0f

    .line 166
    .line 167
    const v14, 0x3f8ccccd    # 1.1f

    .line 168
    .line 169
    .line 170
    const v15, 0x3f666666    # 0.9f

    .line 171
    .line 172
    .line 173
    const/high16 v16, 0x40000000    # 2.0f

    .line 174
    .line 175
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const/high16 v0, 0x41200000    # 10.0f

    .line 179
    .line 180
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const/high16 v18, -0x40000000    # -2.0f

    .line 184
    .line 185
    const v13, 0x3f8ccccd    # 1.1f

    .line 186
    .line 187
    .line 188
    const/4 v14, 0x0

    .line 189
    const/high16 v15, 0x40000000    # 2.0f

    .line 190
    .line 191
    const v16, -0x4099999a    # -0.9f

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v0, 0x41a80000    # 21.0f

    .line 198
    .line 199
    const/high16 v2, 0x40400000    # 3.0f

    .line 200
    .line 201
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v17, -0x40000000    # -2.0f

    .line 205
    .line 206
    const/4 v13, 0x0

    .line 207
    const v14, -0x40733333    # -1.1f

    .line 208
    .line 209
    .line 210
    const v15, -0x4099999a    # -0.9f

    .line 211
    .line 212
    .line 213
    const/high16 v16, -0x40000000    # -2.0f

    .line 214
    .line 215
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const/high16 v0, 0x41100000    # 9.0f

    .line 219
    .line 220
    const/high16 v2, 0x3f800000    # 1.0f

    .line 221
    .line 222
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v18, 0x40000000    # 2.0f

    .line 226
    .line 227
    const v13, -0x40733333    # -1.1f

    .line 228
    .line 229
    .line 230
    const/4 v14, 0x0

    .line 231
    const/high16 v15, -0x40000000    # -2.0f

    .line 232
    .line 233
    const v16, 0x3f666666    # 0.9f

    .line 234
    .line 235
    .line 236
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v0, 0x41180000    # 9.5f

    .line 243
    .line 244
    const/high16 v2, 0x41780000    # 15.5f

    .line 245
    .line 246
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v17, 0x3f4ccccd    # 0.8f

    .line 250
    .line 251
    .line 252
    const v18, -0x410a3d71    # -0.48f

    .line 253
    .line 254
    .line 255
    const v13, 0x3e947ae1    # 0.29f

    .line 256
    .line 257
    .line 258
    const v14, -0x420a3d71    # -0.12f

    .line 259
    .line 260
    .line 261
    const v15, 0x3f0ccccd    # 0.55f

    .line 262
    .line 263
    .line 264
    const v16, -0x416b851f    # -0.29f

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v0, -0x435c28f6    # -0.02f

    .line 271
    .line 272
    .line 273
    const v2, 0x3cf5c28f    # 0.03f

    .line 274
    .line 275
    .line 276
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v0, 0x3ec7ae14    # 0.39f

    .line 280
    .line 281
    .line 282
    const v2, 0x3f8147ae    # 1.01f

    .line 283
    .line 284
    .line 285
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v17, 0x3f1c28f6    # 0.61f

    .line 289
    .line 290
    .line 291
    const v18, -0x419eb852    # -0.22f

    .line 292
    .line 293
    .line 294
    const v13, 0x3e6b851f    # 0.23f

    .line 295
    .line 296
    .line 297
    const v14, 0x3db851ec    # 0.09f

    .line 298
    .line 299
    .line 300
    const v15, 0x3efae148    # 0.49f

    .line 301
    .line 302
    .line 303
    const/16 v16, 0x0

    .line 304
    .line 305
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v0, -0x40451eb8    # -1.46f

    .line 309
    .line 310
    .line 311
    const v2, 0x3f570a3d    # 0.84f

    .line 312
    .line 313
    .line 314
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v17, -0x420a3d71    # -0.12f

    .line 318
    .line 319
    .line 320
    const v18, -0x40dc28f6    # -0.64f

    .line 321
    .line 322
    .line 323
    const v13, 0x3df5c28f    # 0.12f

    .line 324
    .line 325
    .line 326
    const v14, -0x41a8f5c3    # -0.21f

    .line 327
    .line 328
    .line 329
    const v15, 0x3d8f5c29    # 0.07f

    .line 330
    .line 331
    .line 332
    const v16, -0x41051eb8    # -0.49f

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v0, -0x40d1eb85    # -0.68f

    .line 339
    .line 340
    .line 341
    const v2, -0x40a66666    # -0.85f

    .line 342
    .line 343
    .line 344
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v0, -0x435c28f6    # -0.02f

    .line 348
    .line 349
    .line 350
    const v2, 0x3cf5c28f    # 0.03f

    .line 351
    .line 352
    .line 353
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v17, 0x3d4ccccd    # 0.05f

    .line 357
    .line 358
    .line 359
    const v18, -0x410a3d71    # -0.48f

    .line 360
    .line 361
    .line 362
    const v13, 0x3ca3d70a    # 0.02f

    .line 363
    .line 364
    .line 365
    const v14, -0x41dc28f6    # -0.16f

    .line 366
    .line 367
    .line 368
    const v15, 0x3d4ccccd    # 0.05f

    .line 369
    .line 370
    .line 371
    const v16, -0x415c28f6    # -0.32f

    .line 372
    .line 373
    .line 374
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const v0, -0x42b33333    # -0.05f

    .line 378
    .line 379
    .line 380
    const v2, -0x410a3d71    # -0.48f

    .line 381
    .line 382
    .line 383
    const v4, -0x430a3d71    # -0.03f

    .line 384
    .line 385
    .line 386
    const v6, -0x415c28f6    # -0.32f

    .line 387
    .line 388
    .line 389
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v0, 0x3ca3d70a    # 0.02f

    .line 393
    .line 394
    .line 395
    const v2, 0x3cf5c28f    # 0.03f

    .line 396
    .line 397
    .line 398
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v0, 0x3f59999a    # 0.85f

    .line 402
    .line 403
    .line 404
    const v2, -0x40d1eb85    # -0.68f

    .line 405
    .line 406
    .line 407
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v17, 0x3df5c28f    # 0.12f

    .line 411
    .line 412
    .line 413
    const v18, -0x40dc28f6    # -0.64f

    .line 414
    .line 415
    .line 416
    const v13, 0x3e428f5c    # 0.19f

    .line 417
    .line 418
    .line 419
    const v14, -0x41e66666    # -0.15f

    .line 420
    .line 421
    .line 422
    const v15, 0x3e75c28f    # 0.24f

    .line 423
    .line 424
    .line 425
    const v16, -0x4123d70a    # -0.43f

    .line 426
    .line 427
    .line 428
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const v0, -0x40a8f5c3    # -0.84f

    .line 432
    .line 433
    .line 434
    const v2, -0x40451eb8    # -1.46f

    .line 435
    .line 436
    .line 437
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v17, -0x40e3d70a    # -0.61f

    .line 441
    .line 442
    .line 443
    const v18, -0x419eb852    # -0.22f

    .line 444
    .line 445
    .line 446
    const v13, -0x420a3d71    # -0.12f

    .line 447
    .line 448
    .line 449
    const v14, -0x41a8f5c3    # -0.21f

    .line 450
    .line 451
    .line 452
    const v15, -0x413d70a4    # -0.38f

    .line 453
    .line 454
    .line 455
    const v16, -0x416147ae    # -0.31f

    .line 456
    .line 457
    .line 458
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const v0, -0x407eb852    # -1.01f

    .line 462
    .line 463
    .line 464
    const v2, 0x3ec7ae14    # 0.39f

    .line 465
    .line 466
    .line 467
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v0, 0x3ca3d70a    # 0.02f

    .line 471
    .line 472
    .line 473
    const v2, 0x3cf5c28f    # 0.03f

    .line 474
    .line 475
    .line 476
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const v17, -0x40b33333    # -0.8f

    .line 480
    .line 481
    .line 482
    const v18, -0x41147ae1    # -0.46f

    .line 483
    .line 484
    .line 485
    const/high16 v13, -0x41800000    # -0.25f

    .line 486
    .line 487
    const v14, -0x41d1eb85    # -0.17f

    .line 488
    .line 489
    .line 490
    const v15, -0x40fd70a4    # -0.51f

    .line 491
    .line 492
    .line 493
    const v16, -0x4151eb85    # -0.34f

    .line 494
    .line 495
    .line 496
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const v0, -0x41d1eb85    # -0.17f

    .line 500
    .line 501
    .line 502
    const v2, -0x4075c28f    # -1.08f

    .line 503
    .line 504
    .line 505
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const v17, 0x410d70a4    # 8.84f

    .line 509
    .line 510
    .line 511
    const/high16 v18, 0x40e00000    # 7.0f

    .line 512
    .line 513
    const v13, 0x4114cccd    # 9.3f

    .line 514
    .line 515
    .line 516
    const v14, 0x40e5c28f    # 7.18f

    .line 517
    .line 518
    .line 519
    const v15, 0x411170a4    # 9.09f

    .line 520
    .line 521
    .line 522
    const/high16 v16, 0x40e00000    # 7.0f

    .line 523
    .line 524
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const v0, 0x40e51eb8    # 7.16f

    .line 528
    .line 529
    .line 530
    const/high16 v2, 0x40e00000    # 7.0f

    .line 531
    .line 532
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const v17, -0x41051eb8    # -0.49f

    .line 536
    .line 537
    .line 538
    const v18, 0x3ed70a3d    # 0.42f

    .line 539
    .line 540
    .line 541
    const/high16 v13, -0x41800000    # -0.25f

    .line 542
    .line 543
    const/4 v14, 0x0

    .line 544
    const v15, -0x41147ae1    # -0.46f

    .line 545
    .line 546
    .line 547
    const v16, 0x3e3851ec    # 0.18f

    .line 548
    .line 549
    .line 550
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const/high16 v0, 0x40d00000    # 6.5f

    .line 554
    .line 555
    const/high16 v2, 0x41080000    # 8.5f

    .line 556
    .line 557
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const v17, -0x40b33333    # -0.8f

    .line 561
    .line 562
    .line 563
    const v18, 0x3ef5c28f    # 0.48f

    .line 564
    .line 565
    .line 566
    const v13, -0x416b851f    # -0.29f

    .line 567
    .line 568
    .line 569
    const v14, 0x3df5c28f    # 0.12f

    .line 570
    .line 571
    .line 572
    const v15, -0x40f33333    # -0.55f

    .line 573
    .line 574
    .line 575
    const v16, 0x3e947ae1    # 0.29f

    .line 576
    .line 577
    .line 578
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const v0, 0x3ca3d70a    # 0.02f

    .line 582
    .line 583
    .line 584
    const v2, -0x430a3d71    # -0.03f

    .line 585
    .line 586
    .line 587
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const v0, -0x407d70a4    # -1.02f

    .line 591
    .line 592
    .line 593
    const v2, -0x413851ec    # -0.39f

    .line 594
    .line 595
    .line 596
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const v17, -0x40e3d70a    # -0.61f

    .line 600
    .line 601
    .line 602
    const v18, 0x3e6147ae    # 0.22f

    .line 603
    .line 604
    .line 605
    const v13, -0x41947ae1    # -0.23f

    .line 606
    .line 607
    .line 608
    const v14, -0x4247ae14    # -0.09f

    .line 609
    .line 610
    .line 611
    const v15, -0x41051eb8    # -0.49f

    .line 612
    .line 613
    .line 614
    const/16 v16, 0x0

    .line 615
    .line 616
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const v0, 0x3fbae148    # 1.46f

    .line 620
    .line 621
    .line 622
    const v2, -0x40a8f5c3    # -0.84f

    .line 623
    .line 624
    .line 625
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const v17, 0x3df5c28f    # 0.12f

    .line 629
    .line 630
    .line 631
    const v18, 0x3f23d70a    # 0.64f

    .line 632
    .line 633
    .line 634
    const v13, -0x420a3d71    # -0.12f

    .line 635
    .line 636
    .line 637
    const v14, 0x3e570a3d    # 0.21f

    .line 638
    .line 639
    .line 640
    const v15, -0x4270a3d7    # -0.07f

    .line 641
    .line 642
    .line 643
    const v16, 0x3efae148    # 0.49f

    .line 644
    .line 645
    .line 646
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const v0, 0x3f2e147b    # 0.68f

    .line 650
    .line 651
    .line 652
    const v2, 0x3f59999a    # 0.85f

    .line 653
    .line 654
    .line 655
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const v0, 0x3ca3d70a    # 0.02f

    .line 659
    .line 660
    .line 661
    const v2, -0x430a3d71    # -0.03f

    .line 662
    .line 663
    .line 664
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    const v17, -0x42b33333    # -0.05f

    .line 668
    .line 669
    .line 670
    const v18, 0x3ef0a3d7    # 0.47f

    .line 671
    .line 672
    .line 673
    const v13, -0x435c28f6    # -0.02f

    .line 674
    .line 675
    .line 676
    const v14, 0x3e19999a    # 0.15f

    .line 677
    .line 678
    .line 679
    const v15, -0x42b33333    # -0.05f

    .line 680
    .line 681
    .line 682
    const v16, 0x3e9eb852    # 0.31f

    .line 683
    .line 684
    .line 685
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    const v0, 0x3d4ccccd    # 0.05f

    .line 689
    .line 690
    .line 691
    const v2, 0x3ef5c28f    # 0.48f

    .line 692
    .line 693
    .line 694
    const v4, 0x3cf5c28f    # 0.03f

    .line 695
    .line 696
    .line 697
    const v6, 0x3ea3d70a    # 0.32f

    .line 698
    .line 699
    .line 700
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    const v0, -0x435c28f6    # -0.02f

    .line 704
    .line 705
    .line 706
    const v2, -0x430a3d71    # -0.03f

    .line 707
    .line 708
    .line 709
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    const v0, 0x3f2e147b    # 0.68f

    .line 713
    .line 714
    .line 715
    const v2, -0x40a66666    # -0.85f

    .line 716
    .line 717
    .line 718
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    const v17, -0x420a3d71    # -0.12f

    .line 722
    .line 723
    .line 724
    const v18, 0x3f23d70a    # 0.64f

    .line 725
    .line 726
    .line 727
    const v13, -0x41bd70a4    # -0.19f

    .line 728
    .line 729
    .line 730
    const v15, -0x418a3d71    # -0.24f

    .line 731
    .line 732
    .line 733
    const v16, 0x3edc28f6    # 0.43f

    .line 734
    .line 735
    .line 736
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 737
    .line 738
    .line 739
    const v0, 0x3fbae148    # 1.46f

    .line 740
    .line 741
    .line 742
    const v2, 0x3f570a3d    # 0.84f

    .line 743
    .line 744
    .line 745
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 746
    .line 747
    .line 748
    const v17, 0x3f1c28f6    # 0.61f

    .line 749
    .line 750
    .line 751
    const v18, 0x3e6147ae    # 0.22f

    .line 752
    .line 753
    .line 754
    const v13, 0x3df5c28f    # 0.12f

    .line 755
    .line 756
    .line 757
    const v14, 0x3e570a3d    # 0.21f

    .line 758
    .line 759
    .line 760
    const v15, 0x3ec28f5c    # 0.38f

    .line 761
    .line 762
    .line 763
    const v16, 0x3e9eb852    # 0.31f

    .line 764
    .line 765
    .line 766
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 767
    .line 768
    .line 769
    const v0, -0x413851ec    # -0.39f

    .line 770
    .line 771
    .line 772
    const v2, 0x3f8147ae    # 1.01f

    .line 773
    .line 774
    .line 775
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 776
    .line 777
    .line 778
    const v0, -0x43dc28f6    # -0.01f

    .line 779
    .line 780
    .line 781
    const v2, -0x42dc28f6    # -0.04f

    .line 782
    .line 783
    .line 784
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 785
    .line 786
    .line 787
    const v17, 0x3f4ccccd    # 0.8f

    .line 788
    .line 789
    .line 790
    const v18, 0x3ef5c28f    # 0.48f

    .line 791
    .line 792
    .line 793
    const/high16 v13, 0x3e800000    # 0.25f

    .line 794
    .line 795
    const v14, 0x3e428f5c    # 0.19f

    .line 796
    .line 797
    .line 798
    const v15, 0x3f028f5c    # 0.51f

    .line 799
    .line 800
    .line 801
    const v16, 0x3eb851ec    # 0.36f

    .line 802
    .line 803
    .line 804
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 805
    .line 806
    .line 807
    const v0, 0x3e2e147b    # 0.17f

    .line 808
    .line 809
    .line 810
    const v2, 0x3f88f5c3    # 1.07f

    .line 811
    .line 812
    .line 813
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 814
    .line 815
    .line 816
    const v17, 0x3efae148    # 0.49f

    .line 817
    .line 818
    .line 819
    const v18, 0x3edc28f6    # 0.43f

    .line 820
    .line 821
    .line 822
    const v13, 0x3cf5c28f    # 0.03f

    .line 823
    .line 824
    .line 825
    const/high16 v14, 0x3e800000    # 0.25f

    .line 826
    .line 827
    const v15, 0x3e75c28f    # 0.24f

    .line 828
    .line 829
    .line 830
    const v16, 0x3edc28f6    # 0.43f

    .line 831
    .line 832
    .line 833
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 834
    .line 835
    .line 836
    const v0, 0x3fd70a3d    # 1.68f

    .line 837
    .line 838
    .line 839
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 840
    .line 841
    .line 842
    const v18, -0x4128f5c3    # -0.42f

    .line 843
    .line 844
    .line 845
    const/high16 v13, 0x3e800000    # 0.25f

    .line 846
    .line 847
    const/4 v14, 0x0

    .line 848
    const v15, 0x3eeb851f    # 0.46f

    .line 849
    .line 850
    .line 851
    const v16, -0x41c7ae14    # -0.18f

    .line 852
    .line 853
    .line 854
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 855
    .line 856
    .line 857
    const v0, 0x3e2e147b    # 0.17f

    .line 858
    .line 859
    .line 860
    const v2, -0x4075c28f    # -1.08f

    .line 861
    .line 862
    .line 863
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 864
    .line 865
    .line 866
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 867
    .line 868
    .line 869
    const/high16 v0, 0x40c00000    # 6.0f

    .line 870
    .line 871
    const/high16 v2, 0x41400000    # 12.0f

    .line 872
    .line 873
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 874
    .line 875
    .line 876
    const/high16 v17, 0x40000000    # 2.0f

    .line 877
    .line 878
    const/high16 v18, -0x40000000    # -2.0f

    .line 879
    .line 880
    const/4 v13, 0x0

    .line 881
    const v14, -0x40733333    # -1.1f

    .line 882
    .line 883
    .line 884
    const v15, 0x3f666666    # 0.9f

    .line 885
    .line 886
    .line 887
    const/high16 v16, -0x40000000    # -2.0f

    .line 888
    .line 889
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 890
    .line 891
    .line 892
    const v0, 0x3f666666    # 0.9f

    .line 893
    .line 894
    .line 895
    const/high16 v2, 0x40000000    # 2.0f

    .line 896
    .line 897
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 898
    .line 899
    .line 900
    const v0, -0x4099999a    # -0.9f

    .line 901
    .line 902
    .line 903
    const/high16 v2, -0x40000000    # -2.0f

    .line 904
    .line 905
    const/high16 v4, 0x40000000    # 2.0f

    .line 906
    .line 907
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 908
    .line 909
    .line 910
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 911
    .line 912
    .line 913
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 914
    .line 915
    .line 916
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 917
    .line 918
    .line 919
    move-result-object v2

    .line 920
    const/16 v16, 0x3800

    .line 921
    .line 922
    const/16 v17, 0x0

    .line 923
    .line 924
    const/high16 v6, 0x3f800000    # 1.0f

    .line 925
    .line 926
    const/high16 v8, 0x3f800000    # 1.0f

    .line 927
    .line 928
    const/4 v7, 0x0

    .line 929
    const/high16 v9, 0x3f800000    # 1.0f

    .line 930
    .line 931
    const/high16 v12, 0x3f800000    # 1.0f

    .line 932
    .line 933
    const/4 v14, 0x0

    .line 934
    const/4 v15, 0x0

    .line 935
    const-string v4, ""

    .line 936
    .line 937
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 938
    .line 939
    .line 940
    move-result-object v0

    .line 941
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 942
    .line 943
    .line 944
    move-result-object v0

    .line 945
    sput-object v0, Landroidx/compose/material/icons/rounded/PhonelinkSetupKt;->_phonelinkSetup:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 946
    .line 947
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 948
    .line 949
    .line 950
    return-object v0
.end method
