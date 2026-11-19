.class public final Landroidx/compose/material/icons/outlined/PhoneBluetoothSpeakerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_phoneBluetoothSpeaker",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "PhoneBluetoothSpeaker",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getPhoneBluetoothSpeaker",
        "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nPhoneBluetoothSpeaker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneBluetoothSpeaker.kt\nandroidx/compose/material/icons/outlined/PhoneBluetoothSpeakerKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,92:1\n212#2,12:93\n233#2,18:106\n253#2:143\n174#3:105\n705#4,2:124\n717#4,2:126\n719#4,11:132\n72#5,4:128\n*S KotlinDebug\n*F\n+ 1 PhoneBluetoothSpeaker.kt\nandroidx/compose/material/icons/outlined/PhoneBluetoothSpeakerKt\n*L\n29#1:93,12\n30#1:106,18\n30#1:143\n29#1:105\n30#1:124,2\n30#1:126,2\n30#1:132,11\n30#1:128,4\n*E\n"
    }
.end annotation


# static fields
.field private static _phoneBluetoothSpeaker:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPhoneBluetoothSpeaker(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/PhoneBluetoothSpeakerKt;->_phoneBluetoothSpeaker:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.PhoneBluetoothSpeaker"

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
    const/high16 v0, 0x41a00000    # 20.0f

    .line 71
    .line 72
    const/high16 v2, 0x41780000    # 15.5f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, -0x3f9b851f    # -3.57f

    .line 78
    .line 79
    .line 80
    const v18, -0x40ee147b    # -0.57f

    .line 81
    .line 82
    .line 83
    const/high16 v13, -0x40600000    # -1.25f

    .line 84
    .line 85
    const/4 v14, 0x0

    .line 86
    const v15, -0x3fe33333    # -2.45f

    .line 87
    .line 88
    .line 89
    const v16, -0x41b33333    # -0.2f

    .line 90
    .line 91
    .line 92
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const v17, -0x416147ae    # -0.31f

    .line 96
    .line 97
    .line 98
    const v18, -0x42b33333    # -0.05f

    .line 99
    .line 100
    .line 101
    const v13, -0x42333333    # -0.1f

    .line 102
    .line 103
    .line 104
    const v14, -0x430a3d71    # -0.03f

    .line 105
    .line 106
    .line 107
    const v15, -0x41a8f5c3    # -0.21f

    .line 108
    .line 109
    .line 110
    const v16, -0x42b33333    # -0.05f

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v17, -0x40ca3d71    # -0.71f

    .line 117
    .line 118
    .line 119
    const v18, 0x3e947ae1    # 0.29f

    .line 120
    .line 121
    .line 122
    const v13, -0x417ae148    # -0.26f

    .line 123
    .line 124
    .line 125
    const/4 v14, 0x0

    .line 126
    const v15, -0x40fd70a4    # -0.51f

    .line 127
    .line 128
    .line 129
    const v16, 0x3dcccccd    # 0.1f

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v0, -0x3ff33333    # -2.2f

    .line 136
    .line 137
    .line 138
    const v2, 0x400ccccd    # 2.2f

    .line 139
    .line 140
    .line 141
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v17, -0x3f2d1eb8    # -6.59f

    .line 145
    .line 146
    .line 147
    const v18, -0x3f2d1eb8    # -6.59f

    .line 148
    .line 149
    .line 150
    const v13, -0x3fcae148    # -2.83f

    .line 151
    .line 152
    .line 153
    const v14, -0x4047ae14    # -1.44f

    .line 154
    .line 155
    .line 156
    const v15, -0x3f5b3333    # -5.15f

    .line 157
    .line 158
    .line 159
    const/high16 v16, -0x3f900000    # -3.75f

    .line 160
    .line 161
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v0, -0x3ff28f5c    # -2.21f

    .line 165
    .line 166
    .line 167
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v17, 0x3e800000    # 0.25f

    .line 171
    .line 172
    const/high16 v18, -0x40800000    # -1.0f

    .line 173
    .line 174
    const v13, 0x3e8f5c29    # 0.28f

    .line 175
    .line 176
    .line 177
    const v14, -0x417ae148    # -0.26f

    .line 178
    .line 179
    .line 180
    const v15, 0x3eb851ec    # 0.36f

    .line 181
    .line 182
    .line 183
    const v16, -0x40d9999a    # -0.65f

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/high16 v17, 0x41080000    # 8.5f

    .line 190
    .line 191
    const/high16 v18, 0x40800000    # 4.0f

    .line 192
    .line 193
    const v13, 0x410b3333    # 8.7f

    .line 194
    .line 195
    .line 196
    const v14, 0x40ce6666    # 6.45f

    .line 197
    .line 198
    .line 199
    const/high16 v15, 0x41080000    # 8.5f

    .line 200
    .line 201
    const/high16 v16, 0x40a80000    # 5.25f

    .line 202
    .line 203
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v17, -0x40800000    # -1.0f

    .line 207
    .line 208
    const/high16 v18, -0x40800000    # -1.0f

    .line 209
    .line 210
    const/4 v13, 0x0

    .line 211
    const v14, -0x40f33333    # -0.55f

    .line 212
    .line 213
    .line 214
    const v15, -0x4119999a    # -0.45f

    .line 215
    .line 216
    .line 217
    const/high16 v16, -0x40800000    # -1.0f

    .line 218
    .line 219
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const/high16 v0, 0x40800000    # 4.0f

    .line 223
    .line 224
    const/high16 v2, 0x40400000    # 3.0f

    .line 225
    .line 226
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/high16 v18, 0x3f800000    # 1.0f

    .line 230
    .line 231
    const v13, -0x40f33333    # -0.55f

    .line 232
    .line 233
    .line 234
    const/4 v14, 0x0

    .line 235
    const/high16 v15, -0x40800000    # -1.0f

    .line 236
    .line 237
    const v16, 0x3ee66666    # 0.45f

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v17, 0x41880000    # 17.0f

    .line 244
    .line 245
    const/high16 v18, 0x41880000    # 17.0f

    .line 246
    .line 247
    const/4 v13, 0x0

    .line 248
    const v14, 0x41163d71    # 9.39f

    .line 249
    .line 250
    .line 251
    const v15, 0x40f3851f    # 7.61f

    .line 252
    .line 253
    .line 254
    const/high16 v16, 0x41880000    # 17.0f

    .line 255
    .line 256
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v17, 0x3f800000    # 1.0f

    .line 260
    .line 261
    const/high16 v18, -0x40800000    # -1.0f

    .line 262
    .line 263
    const v13, 0x3f0ccccd    # 0.55f

    .line 264
    .line 265
    .line 266
    const/4 v14, 0x0

    .line 267
    const/high16 v15, 0x3f800000    # 1.0f

    .line 268
    .line 269
    const v16, -0x4119999a    # -0.45f

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v0, -0x3fa00000    # -3.5f

    .line 276
    .line 277
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v17, -0x40800000    # -1.0f

    .line 281
    .line 282
    const/4 v13, 0x0

    .line 283
    const v14, -0x40f33333    # -0.55f

    .line 284
    .line 285
    .line 286
    const v15, -0x4119999a    # -0.45f

    .line 287
    .line 288
    .line 289
    const/high16 v16, -0x40800000    # -1.0f

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
    const v0, 0x40a0f5c3    # 5.03f

    .line 298
    .line 299
    .line 300
    const/high16 v2, 0x40a00000    # 5.0f

    .line 301
    .line 302
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 306
    .line 307
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v17, 0x3ee66666    # 0.45f

    .line 311
    .line 312
    .line 313
    const v18, 0x40251eb8    # 2.58f

    .line 314
    .line 315
    .line 316
    const v13, 0x3d8f5c29    # 0.07f

    .line 317
    .line 318
    .line 319
    const v14, 0x3f6147ae    # 0.88f

    .line 320
    .line 321
    .line 322
    const v15, 0x3e6147ae    # 0.22f

    .line 323
    .line 324
    .line 325
    const/high16 v16, 0x3fe00000    # 1.75f

    .line 326
    .line 327
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v0, 0x3f9ae148    # 1.21f

    .line 331
    .line 332
    .line 333
    const v2, -0x40666666    # -1.2f

    .line 334
    .line 335
    .line 336
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const/high16 v17, -0x40c00000    # -0.75f

    .line 340
    .line 341
    const v18, -0x3f8d70a4    # -3.79f

    .line 342
    .line 343
    .line 344
    const v13, -0x41333333    # -0.4f

    .line 345
    .line 346
    .line 347
    const v14, -0x40651eb8    # -1.21f

    .line 348
    .line 349
    .line 350
    const v15, -0x40d70a3d    # -0.66f

    .line 351
    .line 352
    .line 353
    const v16, -0x3fe1eb85    # -2.47f

    .line 354
    .line 355
    .line 356
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v0, 0x41980000    # 19.0f

    .line 363
    .line 364
    const v2, 0x4197c28f    # 18.97f

    .line 365
    .line 366
    .line 367
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v17, -0x3f8ccccd    # -3.8f

    .line 371
    .line 372
    .line 373
    const v18, -0x40bd70a4    # -0.76f

    .line 374
    .line 375
    .line 376
    const v13, -0x40570a3d    # -1.32f

    .line 377
    .line 378
    .line 379
    const v14, -0x4247ae14    # -0.09f

    .line 380
    .line 381
    .line 382
    const v15, -0x3fd9999a    # -2.6f

    .line 383
    .line 384
    .line 385
    const v16, -0x414ccccd    # -0.35f

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v0, 0x3f99999a    # 1.2f

    .line 392
    .line 393
    .line 394
    const v2, -0x40666666    # -1.2f

    .line 395
    .line 396
    .line 397
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v17, 0x40266666    # 2.6f

    .line 401
    .line 402
    .line 403
    const v18, 0x3ee66666    # 0.45f

    .line 404
    .line 405
    .line 406
    const v13, 0x3f59999a    # 0.85f

    .line 407
    .line 408
    .line 409
    const v14, 0x3e75c28f    # 0.24f

    .line 410
    .line 411
    .line 412
    const v15, 0x3fdc28f6    # 1.72f

    .line 413
    .line 414
    .line 415
    const v16, 0x3ec7ae14    # 0.39f

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v0, 0x3fc147ae    # 1.51f

    .line 422
    .line 423
    .line 424
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v0, 0x41180000    # 9.5f

    .line 431
    .line 432
    const v2, 0x416b5c29    # 14.71f

    .line 433
    .line 434
    .line 435
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v0, 0x40e6b852    # 7.21f

    .line 439
    .line 440
    .line 441
    const/high16 v2, 0x41880000    # 17.0f

    .line 442
    .line 443
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const/high16 v0, 0x41300000    # 11.0f

    .line 447
    .line 448
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const/high16 v0, 0x3f000000    # 0.5f

    .line 452
    .line 453
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const v0, 0x40366666    # 2.85f

    .line 457
    .line 458
    .line 459
    const v2, -0x3fc9999a    # -2.85f

    .line 460
    .line 461
    .line 462
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const v0, 0x4191ae14    # 18.21f

    .line 466
    .line 467
    .line 468
    const/high16 v2, 0x40c00000    # 6.0f

    .line 469
    .line 470
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const v0, 0x4009999a    # 2.15f

    .line 474
    .line 475
    .line 476
    const v2, -0x3ff66666    # -2.15f

    .line 477
    .line 478
    .line 479
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const/high16 v0, 0x418c0000    # 17.5f

    .line 483
    .line 484
    const/high16 v2, 0x3f800000    # 1.0f

    .line 485
    .line 486
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const/high16 v0, 0x3f800000    # 1.0f

    .line 490
    .line 491
    const/high16 v2, 0x41880000    # 17.0f

    .line 492
    .line 493
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const v0, 0x40728f5c    # 3.79f

    .line 497
    .line 498
    .line 499
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const/high16 v0, 0x40200000    # 2.5f

    .line 503
    .line 504
    const v2, 0x416b5c29    # 14.71f

    .line 505
    .line 506
    .line 507
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const v0, -0x40ca3d71    # -0.71f

    .line 511
    .line 512
    .line 513
    const v2, 0x3f35c28f    # 0.71f

    .line 514
    .line 515
    .line 516
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const v0, 0x418651ec    # 16.79f

    .line 520
    .line 521
    .line 522
    const/high16 v2, 0x40c00000    # 6.0f

    .line 523
    .line 524
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const/high16 v0, 0x41600000    # 14.0f

    .line 528
    .line 529
    const v2, 0x410ca3d7    # 8.79f

    .line 530
    .line 531
    .line 532
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const v0, 0x3f35c28f    # 0.71f

    .line 536
    .line 537
    .line 538
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const v0, 0x403a3d71    # 2.91f

    .line 545
    .line 546
    .line 547
    const/high16 v2, 0x41900000    # 18.0f

    .line 548
    .line 549
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const v0, 0x3f70a3d7    # 0.94f

    .line 553
    .line 554
    .line 555
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const v0, -0x408f5c29    # -0.94f

    .line 559
    .line 560
    .line 561
    const v2, 0x3f70a3d7    # 0.94f

    .line 562
    .line 563
    .line 564
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const v0, 0x403a3d71    # 2.91f

    .line 568
    .line 569
    .line 570
    const/high16 v2, 0x41900000    # 18.0f

    .line 571
    .line 572
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const v0, 0x40e6b852    # 7.21f

    .line 579
    .line 580
    .line 581
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const v0, 0x3f70a3d7    # 0.94f

    .line 585
    .line 586
    .line 587
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const v0, -0x408f5c29    # -0.94f

    .line 591
    .line 592
    .line 593
    const v2, 0x3f70a3d7    # 0.94f

    .line 594
    .line 595
    .line 596
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const v0, 0x40e6b852    # 7.21f

    .line 600
    .line 601
    .line 602
    const/high16 v2, 0x41900000    # 18.0f

    .line 603
    .line 604
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 611
    .line 612
    .line 613
    move-result-object v2

    .line 614
    const/16 v16, 0x3800

    .line 615
    .line 616
    const/16 v17, 0x0

    .line 617
    .line 618
    const/high16 v6, 0x3f800000    # 1.0f

    .line 619
    .line 620
    const/high16 v8, 0x3f800000    # 1.0f

    .line 621
    .line 622
    const/4 v7, 0x0

    .line 623
    const/high16 v9, 0x3f800000    # 1.0f

    .line 624
    .line 625
    const/high16 v12, 0x3f800000    # 1.0f

    .line 626
    .line 627
    const/4 v13, 0x0

    .line 628
    const/4 v14, 0x0

    .line 629
    const/4 v15, 0x0

    .line 630
    const-string v4, ""

    .line 631
    .line 632
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 633
    .line 634
    .line 635
    move-result-object v0

    .line 636
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 637
    .line 638
    .line 639
    move-result-object v0

    .line 640
    sput-object v0, Landroidx/compose/material/icons/outlined/PhoneBluetoothSpeakerKt;->_phoneBluetoothSpeaker:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 641
    .line 642
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 643
    .line 644
    .line 645
    return-object v0
.end method
