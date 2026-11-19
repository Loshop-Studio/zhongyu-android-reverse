.class public final Landroidx/compose/material/icons/filled/SpeakerPhoneKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_speakerPhone",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SpeakerPhone",
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getSpeakerPhone",
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
        "SMAP\nSpeakerPhone.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpeakerPhone.kt\nandroidx/compose/material/icons/filled/SpeakerPhoneKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,69:1\n212#2,12:70\n233#2,18:83\n253#2:120\n174#3:82\n705#4,2:101\n717#4,2:103\n719#4,11:109\n72#5,4:105\n*S KotlinDebug\n*F\n+ 1 SpeakerPhone.kt\nandroidx/compose/material/icons/filled/SpeakerPhoneKt\n*L\n29#1:70,12\n30#1:83,18\n30#1:120\n29#1:82\n30#1:101,2\n30#1:103,2\n30#1:109,11\n30#1:105,4\n*E\n"
    }
.end annotation


# static fields
.field private static _speakerPhone:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSpeakerPhone(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/SpeakerPhoneKt;->_speakerPhone:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.SpeakerPhone"

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
    const/high16 v0, 0x40e00000    # 7.0f

    .line 71
    .line 72
    const v2, 0x40e23d71    # 7.07f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v0, 0x4106e148    # 8.43f

    .line 79
    .line 80
    .line 81
    const/high16 v2, 0x41080000    # 8.5f

    .line 82
    .line 83
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const v17, 0x40647ae1    # 3.57f

    .line 87
    .line 88
    .line 89
    const v18, -0x40428f5c    # -1.48f

    .line 90
    .line 91
    .line 92
    const v13, 0x3f68f5c3    # 0.91f

    .line 93
    .line 94
    .line 95
    const v14, -0x40970a3d    # -0.91f

    .line 96
    .line 97
    .line 98
    const v15, 0x400b851f    # 2.18f

    .line 99
    .line 100
    .line 101
    const v16, -0x40428f5c    # -1.48f

    .line 102
    .line 103
    .line 104
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const v0, 0x40647ae1    # 3.57f

    .line 108
    .line 109
    .line 110
    const v2, 0x3fbd70a4    # 1.48f

    .line 111
    .line 112
    .line 113
    const v4, 0x402a3d71    # 2.66f

    .line 114
    .line 115
    .line 116
    const v6, 0x3f11eb85    # 0.57f

    .line 117
    .line 118
    .line 119
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v0, 0x41880000    # 17.0f

    .line 123
    .line 124
    const v2, 0x40e23d71    # 7.07f

    .line 125
    .line 126
    .line 127
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const/high16 v17, 0x41400000    # 12.0f

    .line 131
    .line 132
    const/high16 v18, 0x40a00000    # 5.0f

    .line 133
    .line 134
    const v13, 0x417b851f    # 15.72f

    .line 135
    .line 136
    .line 137
    const v14, 0x40b947ae    # 5.79f

    .line 138
    .line 139
    .line 140
    const v15, 0x415f3333    # 13.95f

    .line 141
    .line 142
    .line 143
    const/high16 v16, 0x40a00000    # 5.0f

    .line 144
    .line 145
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v0, -0x3f600000    # -5.0f

    .line 149
    .line 150
    const v2, 0x40047ae1    # 2.07f

    .line 151
    .line 152
    .line 153
    const v4, -0x3f91eb85    # -3.72f

    .line 154
    .line 155
    .line 156
    const v6, 0x3f4a3d71    # 0.79f

    .line 157
    .line 158
    .line 159
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v0, 0x41400000    # 12.0f

    .line 166
    .line 167
    const/high16 v2, 0x3f800000    # 1.0f

    .line 168
    .line 169
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v17, 0x40880000    # 4.25f

    .line 173
    .line 174
    const v18, 0x4086b852    # 4.21f

    .line 175
    .line 176
    .line 177
    const v13, 0x410fae14    # 8.98f

    .line 178
    .line 179
    .line 180
    const/high16 v14, 0x3f800000    # 1.0f

    .line 181
    .line 182
    const v15, 0x40c7ae14    # 6.24f

    .line 183
    .line 184
    .line 185
    const v16, 0x400eb852    # 2.23f

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v0, 0x3fb47ae1    # 1.41f

    .line 192
    .line 193
    .line 194
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v17, 0x41400000    # 12.0f

    .line 198
    .line 199
    const/high16 v18, 0x40400000    # 3.0f

    .line 200
    .line 201
    const v13, 0x40e8f5c3    # 7.28f

    .line 202
    .line 203
    .line 204
    const/high16 v14, 0x40800000    # 4.0f

    .line 205
    .line 206
    const v15, 0x41187ae1    # 9.53f

    .line 207
    .line 208
    .line 209
    const/high16 v16, 0x40400000    # 3.0f

    .line 210
    .line 211
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v0, 0x40cae148    # 6.34f

    .line 215
    .line 216
    .line 217
    const v2, 0x4027ae14    # 2.62f

    .line 218
    .line 219
    .line 220
    const/high16 v4, 0x3f800000    # 1.0f

    .line 221
    .line 222
    const v6, 0x40970a3d    # 4.72f

    .line 223
    .line 224
    .line 225
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v0, -0x404b851f    # -1.41f

    .line 229
    .line 230
    .line 231
    const v2, 0x3fb47ae1    # 1.41f

    .line 232
    .line 233
    .line 234
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/high16 v18, 0x3f800000    # 1.0f

    .line 238
    .line 239
    const v13, 0x418e147b    # 17.76f

    .line 240
    .line 241
    .line 242
    const v14, 0x400eb852    # 2.23f

    .line 243
    .line 244
    .line 245
    const v15, 0x417051ec    # 15.02f

    .line 246
    .line 247
    .line 248
    const/high16 v16, 0x3f800000    # 1.0f

    .line 249
    .line 250
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v0, 0x416dc28f    # 14.86f

    .line 257
    .line 258
    .line 259
    const v2, 0x412028f6    # 10.01f

    .line 260
    .line 261
    .line 262
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v0, 0x41123d71    # 9.14f

    .line 266
    .line 267
    .line 268
    const/high16 v2, 0x41200000    # 10.0f

    .line 269
    .line 270
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v17, 0x41000000    # 8.0f

    .line 274
    .line 275
    const v18, 0x41323d71    # 11.14f

    .line 276
    .line 277
    .line 278
    const v13, 0x410828f6    # 8.51f

    .line 279
    .line 280
    .line 281
    const/high16 v14, 0x41200000    # 10.0f

    .line 282
    .line 283
    const/high16 v15, 0x41000000    # 8.0f

    .line 284
    .line 285
    const v16, 0x412828f6    # 10.51f

    .line 286
    .line 287
    .line 288
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v0, 0x411b5c29    # 9.71f

    .line 292
    .line 293
    .line 294
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v17, 0x3f91eb85    # 1.14f

    .line 298
    .line 299
    .line 300
    const v18, 0x3f91eb85    # 1.14f

    .line 301
    .line 302
    .line 303
    const/4 v13, 0x0

    .line 304
    const v14, 0x3f2147ae    # 0.63f

    .line 305
    .line 306
    .line 307
    const v15, 0x3f028f5c    # 0.51f

    .line 308
    .line 309
    .line 310
    const v16, 0x3f91eb85    # 1.14f

    .line 311
    .line 312
    .line 313
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const v0, 0x40b6b852    # 5.71f

    .line 317
    .line 318
    .line 319
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v18, -0x406e147b    # -1.14f

    .line 323
    .line 324
    .line 325
    const v13, 0x3f2147ae    # 0.63f

    .line 326
    .line 327
    .line 328
    const/4 v14, 0x0

    .line 329
    const v15, 0x3f91eb85    # 1.14f

    .line 330
    .line 331
    .line 332
    const v16, -0x40fd70a4    # -0.51f

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v0, -0x3ee4a3d7    # -9.71f

    .line 339
    .line 340
    .line 341
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v17, -0x406f5c29    # -1.13f

    .line 345
    .line 346
    .line 347
    const v18, -0x406f5c29    # -1.13f

    .line 348
    .line 349
    .line 350
    const v13, 0x3c23d70a    # 0.01f

    .line 351
    .line 352
    .line 353
    const v14, -0x40deb852    # -0.63f

    .line 354
    .line 355
    .line 356
    const/high16 v15, -0x41000000    # -0.5f

    .line 357
    .line 358
    const v16, -0x406f5c29    # -1.13f

    .line 359
    .line 360
    .line 361
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const/high16 v0, 0x41700000    # 15.0f

    .line 368
    .line 369
    const/high16 v2, 0x41a00000    # 20.0f

    .line 370
    .line 371
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const/high16 v0, 0x41100000    # 9.0f

    .line 375
    .line 376
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const/high16 v0, -0x3f000000    # -8.0f

    .line 380
    .line 381
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/high16 v0, 0x40c00000    # 6.0f

    .line 385
    .line 386
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const/high16 v0, 0x41000000    # 8.0f

    .line 390
    .line 391
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 398
    .line 399
    .line 400
    move-result-object v2

    .line 401
    const/16 v16, 0x3800

    .line 402
    .line 403
    const/16 v17, 0x0

    .line 404
    .line 405
    const/high16 v6, 0x3f800000    # 1.0f

    .line 406
    .line 407
    const/high16 v8, 0x3f800000    # 1.0f

    .line 408
    .line 409
    const/4 v7, 0x0

    .line 410
    const/high16 v9, 0x3f800000    # 1.0f

    .line 411
    .line 412
    const/high16 v12, 0x3f800000    # 1.0f

    .line 413
    .line 414
    const/4 v13, 0x0

    .line 415
    const/4 v14, 0x0

    .line 416
    const/4 v15, 0x0

    .line 417
    const-string v4, ""

    .line 418
    .line 419
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    sput-object v0, Landroidx/compose/material/icons/filled/SpeakerPhoneKt;->_speakerPhone:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 428
    .line 429
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 430
    .line 431
    .line 432
    return-object v0
.end method
