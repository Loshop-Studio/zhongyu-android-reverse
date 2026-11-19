.class public final Landroidx/compose/material/icons/twotone/VoiceOverOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_voiceOverOff",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "VoiceOverOff",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getVoiceOverOff",
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
        "SMAP\nVoiceOverOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VoiceOverOff.kt\nandroidx/compose/material/icons/twotone/VoiceOverOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,94:1\n212#2,12:95\n233#2,18:108\n253#2:145\n233#2,18:146\n253#2:183\n174#3:107\n705#4,2:126\n717#4,2:128\n719#4,11:134\n705#4,2:164\n717#4,2:166\n719#4,11:172\n72#5,4:130\n72#5,4:168\n*S KotlinDebug\n*F\n+ 1 VoiceOverOff.kt\nandroidx/compose/material/icons/twotone/VoiceOverOffKt\n*L\n29#1:95,12\n30#1:108,18\n30#1:145\n43#1:146,18\n43#1:183\n29#1:107\n30#1:126,2\n30#1:128,2\n30#1:134,11\n43#1:164,2\n43#1:166,2\n43#1:172,11\n30#1:130,4\n43#1:168,4\n*E\n"
    }
.end annotation


# static fields
.field private static _voiceOverOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getVoiceOverOff(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/VoiceOverOffKt;->_voiceOverOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.VoiceOverOff"

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
    const/high16 v4, 0x41880000    # 17.0f

    .line 71
    .line 72
    const/high16 v6, 0x41100000    # 9.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3f400000    # -6.0f

    .line 78
    .line 79
    const/high16 v26, 0x40000000    # 2.0f

    .line 80
    .line 81
    const v21, -0x3fd3d70a    # -2.69f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const v23, -0x3f475c29    # -5.77f

    .line 87
    .line 88
    .line 89
    const v24, 0x3fa3d70a    # 1.28f

    .line 90
    .line 91
    .line 92
    move-object/from16 v20, v2

    .line 93
    .line 94
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v4, 0x41400000    # 12.0f

    .line 98
    .line 99
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v26, -0x40000000    # -2.0f

    .line 103
    .line 104
    const v21, -0x41b33333    # -0.2f

    .line 105
    .line 106
    .line 107
    const v22, -0x40ca3d71    # -0.71f

    .line 108
    .line 109
    .line 110
    const v23, -0x3faccccd    # -3.3f

    .line 111
    .line 112
    .line 113
    const/high16 v24, -0x40000000    # -2.0f

    .line 114
    .line 115
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v4, 0x40e00000    # 7.0f

    .line 122
    .line 123
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v25, 0x40000000    # 2.0f

    .line 127
    .line 128
    const/high16 v26, 0x40000000    # 2.0f

    .line 129
    .line 130
    const/16 v21, 0x0

    .line 131
    .line 132
    const v22, 0x3f8ccccd    # 1.1f

    .line 133
    .line 134
    .line 135
    const v23, 0x3f666666    # 0.9f

    .line 136
    .line 137
    .line 138
    const/high16 v24, 0x40000000    # 2.0f

    .line 139
    .line 140
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v25, 0x3f1eb852    # 0.62f

    .line 144
    .line 145
    .line 146
    const v26, -0x421eb852    # -0.11f

    .line 147
    .line 148
    .line 149
    const v21, 0x3e6147ae    # 0.22f

    .line 150
    .line 151
    .line 152
    const/16 v22, 0x0

    .line 153
    .line 154
    const v23, 0x3ed70a3d    # 0.42f

    .line 155
    .line 156
    .line 157
    const v24, -0x42dc28f6    # -0.04f

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v4, 0x40e3851f    # 7.11f

    .line 164
    .line 165
    .line 166
    const v6, 0x4106147b    # 8.38f

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v25, -0x421eb852    # -0.11f

    .line 173
    .line 174
    .line 175
    const v26, 0x3f1eb852    # 0.62f

    .line 176
    .line 177
    .line 178
    const v21, -0x4270a3d7    # -0.07f

    .line 179
    .line 180
    .line 181
    const v22, 0x3e4ccccd    # 0.2f

    .line 182
    .line 183
    .line 184
    const v23, -0x421eb852    # -0.11f

    .line 185
    .line 186
    .line 187
    const v24, 0x3ecccccd    # 0.4f

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    const/16 v16, 0x3800

    .line 201
    .line 202
    const/16 v17, 0x0

    .line 203
    .line 204
    const v6, 0x3e99999a    # 0.3f

    .line 205
    .line 206
    .line 207
    const v8, 0x3e99999a    # 0.3f

    .line 208
    .line 209
    .line 210
    const/4 v7, 0x0

    .line 211
    const/high16 v9, 0x3f800000    # 1.0f

    .line 212
    .line 213
    const/high16 v12, 0x3f800000    # 1.0f

    .line 214
    .line 215
    const/4 v13, 0x0

    .line 216
    const/4 v14, 0x0

    .line 217
    const/4 v15, 0x0

    .line 218
    const-string v4, ""

    .line 219
    .line 220
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 221
    .line 222
    .line 223
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 224
    .line 225
    .line 226
    move-result v3

    .line 227
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 228
    .line 229
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 230
    .line 231
    .line 232
    move-result-wide v6

    .line 233
    const/4 v0, 0x0

    .line 234
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 238
    .line 239
    .line 240
    move-result v10

    .line 241
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 242
    .line 243
    .line 244
    move-result v11

    .line 245
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 248
    .line 249
    .line 250
    const v0, 0x4186147b    # 16.76f

    .line 251
    .line 252
    .line 253
    const v2, 0x40ab851f    # 5.36f

    .line 254
    .line 255
    .line 256
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v0, -0x4028f5c3    # -1.68f

    .line 260
    .line 261
    .line 262
    const v2, 0x3fd851ec    # 1.69f

    .line 263
    .line 264
    .line 265
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v17, 0x3db851ec    # 0.09f

    .line 269
    .line 270
    .line 271
    const v18, 0x406f5c29    # 3.74f

    .line 272
    .line 273
    .line 274
    const v13, 0x3f4ccccd    # 0.8f

    .line 275
    .line 276
    .line 277
    const v14, 0x3f90a3d7    # 1.13f

    .line 278
    .line 279
    .line 280
    const v15, 0x3f547ae1    # 0.83f

    .line 281
    .line 282
    .line 283
    const v16, 0x40251eb8    # 2.58f

    .line 284
    .line 285
    .line 286
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v0, 0x3fd9999a    # 1.7f

    .line 290
    .line 291
    .line 292
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v17, -0x421eb852    # -0.11f

    .line 296
    .line 297
    .line 298
    const v18, -0x3f1bd70a    # -7.13f

    .line 299
    .line 300
    .line 301
    const v13, 0x3ff33333    # 1.9f

    .line 302
    .line 303
    .line 304
    const v14, -0x3ffeb852    # -2.02f

    .line 305
    .line 306
    .line 307
    const v15, 0x3fef5c29    # 1.87f

    .line 308
    .line 309
    .line 310
    const v16, -0x3f60a3d7    # -4.98f

    .line 311
    .line 312
    .line 313
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v0, 0x41a08f5c    # 20.07f

    .line 320
    .line 321
    .line 322
    const/high16 v2, 0x40000000    # 2.0f

    .line 323
    .line 324
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v0, -0x402f5c29    # -1.63f

    .line 328
    .line 329
    .line 330
    const v2, 0x3fd0a3d7    # 1.63f

    .line 331
    .line 332
    .line 333
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v17, 0x3e0f5c29    # 0.14f

    .line 337
    .line 338
    .line 339
    const v18, 0x4128f5c3    # 10.56f

    .line 340
    .line 341
    .line 342
    const v13, 0x402e147b    # 2.72f

    .line 343
    .line 344
    .line 345
    const v14, 0x403e147b    # 2.97f

    .line 346
    .line 347
    .line 348
    const v15, 0x4030a3d7    # 2.76f

    .line 349
    .line 350
    .line 351
    const v16, 0x40ec7ae1    # 7.39f

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v0, 0x3fd1eb85    # 1.64f

    .line 358
    .line 359
    .line 360
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const v17, -0x41e66666    # -0.15f

    .line 364
    .line 365
    .line 366
    const v18, -0x3ea2b852    # -13.83f

    .line 367
    .line 368
    .line 369
    const v13, 0x406f5c29    # 3.74f

    .line 370
    .line 371
    .line 372
    const v14, -0x3f870a3d    # -3.89f

    .line 373
    .line 374
    .line 375
    const v15, 0x406d70a4    # 3.71f

    .line 376
    .line 377
    .line 378
    const v16, -0x3ee28f5c    # -9.84f

    .line 379
    .line 380
    .line 381
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v0, 0x4116e148    # 9.43f

    .line 388
    .line 389
    .line 390
    const v2, 0x40a147ae    # 5.04f

    .line 391
    .line 392
    .line 393
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v0, 0x4061eb85    # 3.53f

    .line 397
    .line 398
    .line 399
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v17, -0x3f9e147b    # -3.53f

    .line 403
    .line 404
    .line 405
    const v18, -0x3f9e147b    # -3.53f

    .line 406
    .line 407
    .line 408
    const v13, -0x41b33333    # -0.2f

    .line 409
    .line 410
    .line 411
    const v14, -0x4011eb85    # -1.86f

    .line 412
    .line 413
    .line 414
    const v15, -0x402a3d71    # -1.67f

    .line 415
    .line 416
    .line 417
    const v16, -0x3faae148    # -3.33f

    .line 418
    .line 419
    .line 420
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const v0, 0x40370a3d    # 2.86f

    .line 427
    .line 428
    .line 429
    const v2, 0x408d1eb8    # 4.41f

    .line 430
    .line 431
    .line 432
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v0, 0x4088a3d7    # 4.27f

    .line 436
    .line 437
    .line 438
    const/high16 v2, 0x40400000    # 3.0f

    .line 439
    .line 440
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v0, 0x4027ae14    # 2.62f

    .line 444
    .line 445
    .line 446
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const/high16 v17, 0x40a00000    # 5.0f

    .line 450
    .line 451
    const/high16 v18, 0x41100000    # 9.0f

    .line 452
    .line 453
    const v13, 0x40a75c29    # 5.23f

    .line 454
    .line 455
    .line 456
    const/high16 v14, 0x40f00000    # 7.5f

    .line 457
    .line 458
    const/high16 v15, 0x40a00000    # 5.0f

    .line 459
    .line 460
    const v16, 0x4103851f    # 8.22f

    .line 461
    .line 462
    .line 463
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const/high16 v17, 0x40800000    # 4.0f

    .line 467
    .line 468
    const/high16 v18, 0x40800000    # 4.0f

    .line 469
    .line 470
    const/4 v13, 0x0

    .line 471
    const v14, 0x400d70a4    # 2.21f

    .line 472
    .line 473
    .line 474
    const v15, 0x3fe51eb8    # 1.79f

    .line 475
    .line 476
    .line 477
    const/high16 v16, 0x40800000    # 4.0f

    .line 478
    .line 479
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v17, 0x40070a3d    # 2.11f

    .line 483
    .line 484
    .line 485
    const v18, -0x40e147ae    # -0.62f

    .line 486
    .line 487
    .line 488
    const v13, 0x3f47ae14    # 0.78f

    .line 489
    .line 490
    .line 491
    const/4 v14, 0x0

    .line 492
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 493
    .line 494
    const v16, -0x41947ae1    # -0.23f

    .line 495
    .line 496
    .line 497
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const v0, 0x408ccccd    # 4.4f

    .line 501
    .line 502
    .line 503
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const/high16 v17, 0x41100000    # 9.0f

    .line 507
    .line 508
    const/high16 v18, 0x41700000    # 15.0f

    .line 509
    .line 510
    const v13, 0x415bd70a    # 13.74f

    .line 511
    .line 512
    .line 513
    const v14, 0x4179999a    # 15.6f

    .line 514
    .line 515
    .line 516
    const v15, 0x412c7ae1    # 10.78f

    .line 517
    .line 518
    .line 519
    const/high16 v16, 0x41700000    # 15.0f

    .line 520
    .line 521
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const/high16 v17, -0x3f000000    # -8.0f

    .line 525
    .line 526
    const/high16 v18, 0x40800000    # 4.0f

    .line 527
    .line 528
    const v13, -0x3fd51eb8    # -2.67f

    .line 529
    .line 530
    .line 531
    const/4 v14, 0x0

    .line 532
    const/high16 v15, -0x3f000000    # -8.0f

    .line 533
    .line 534
    const v16, 0x3fab851f    # 1.34f

    .line 535
    .line 536
    .line 537
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const/high16 v0, 0x40000000    # 2.0f

    .line 541
    .line 542
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const/high16 v0, 0x41800000    # 16.0f

    .line 546
    .line 547
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const/high16 v0, -0x40000000    # -2.0f

    .line 551
    .line 552
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const v17, -0x416b851f    # -0.29f

    .line 556
    .line 557
    .line 558
    const v18, -0x407d70a4    # -1.02f

    .line 559
    .line 560
    .line 561
    const/4 v13, 0x0

    .line 562
    const v14, -0x41428f5c    # -0.37f

    .line 563
    .line 564
    .line 565
    const v15, -0x421eb852    # -0.11f

    .line 566
    .line 567
    .line 568
    const v16, -0x40cccccd    # -0.7f

    .line 569
    .line 570
    .line 571
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const v0, 0x419dd70a    # 19.73f

    .line 575
    .line 576
    .line 577
    const/high16 v2, 0x41a80000    # 21.0f

    .line 578
    .line 579
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const v0, 0x3fb47ae1    # 1.41f

    .line 583
    .line 584
    .line 585
    const v2, -0x404b851f    # -1.41f

    .line 586
    .line 587
    .line 588
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const v0, 0x40370a3d    # 2.86f

    .line 592
    .line 593
    .line 594
    const v2, 0x408d1eb8    # 4.41f

    .line 595
    .line 596
    .line 597
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const/high16 v0, 0x41980000    # 19.0f

    .line 604
    .line 605
    const/high16 v2, 0x40400000    # 3.0f

    .line 606
    .line 607
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const/high16 v17, 0x40c00000    # 6.0f

    .line 611
    .line 612
    const/high16 v18, -0x40000000    # -2.0f

    .line 613
    .line 614
    const v13, 0x3e6147ae    # 0.22f

    .line 615
    .line 616
    .line 617
    const v14, -0x40c7ae14    # -0.72f

    .line 618
    .line 619
    .line 620
    const v15, 0x4053d70a    # 3.31f

    .line 621
    .line 622
    .line 623
    const/high16 v16, -0x40000000    # -2.0f

    .line 624
    .line 625
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const/high16 v18, 0x40000000    # 2.0f

    .line 629
    .line 630
    const v13, 0x402ccccd    # 2.7f

    .line 631
    .line 632
    .line 633
    const/4 v14, 0x0

    .line 634
    const v15, 0x40b9999a    # 5.8f

    .line 635
    .line 636
    .line 637
    const v16, 0x3fa51eb8    # 1.29f

    .line 638
    .line 639
    .line 640
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const/high16 v0, 0x41300000    # 11.0f

    .line 650
    .line 651
    const/high16 v2, 0x41100000    # 9.0f

    .line 652
    .line 653
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const/high16 v17, -0x40000000    # -2.0f

    .line 657
    .line 658
    const/high16 v18, -0x40000000    # -2.0f

    .line 659
    .line 660
    const v13, -0x40733333    # -1.1f

    .line 661
    .line 662
    .line 663
    const/high16 v15, -0x40000000    # -2.0f

    .line 664
    .line 665
    const v16, -0x4099999a    # -0.9f

    .line 666
    .line 667
    .line 668
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const v17, 0x3de147ae    # 0.11f

    .line 672
    .line 673
    .line 674
    const v18, -0x40e147ae    # -0.62f

    .line 675
    .line 676
    .line 677
    const/4 v13, 0x0

    .line 678
    const v14, -0x419eb852    # -0.22f

    .line 679
    .line 680
    .line 681
    const v15, 0x3d23d70a    # 0.04f

    .line 682
    .line 683
    .line 684
    const v16, -0x4128f5c3    # -0.42f

    .line 685
    .line 686
    .line 687
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    const v0, 0x4020a3d7    # 2.51f

    .line 691
    .line 692
    .line 693
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 694
    .line 695
    .line 696
    const v17, -0x40e147ae    # -0.62f

    .line 697
    .line 698
    .line 699
    const v18, 0x3de147ae    # 0.11f

    .line 700
    .line 701
    .line 702
    const v13, -0x41b33333    # -0.2f

    .line 703
    .line 704
    .line 705
    const v14, 0x3d8f5c29    # 0.07f

    .line 706
    .line 707
    .line 708
    const v15, -0x41333333    # -0.4f

    .line 709
    .line 710
    .line 711
    const v16, 0x3de147ae    # 0.11f

    .line 712
    .line 713
    .line 714
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 715
    .line 716
    .line 717
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 718
    .line 719
    .line 720
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 721
    .line 722
    .line 723
    move-result-object v2

    .line 724
    const/16 v16, 0x3800

    .line 725
    .line 726
    const/16 v17, 0x0

    .line 727
    .line 728
    const/high16 v6, 0x3f800000    # 1.0f

    .line 729
    .line 730
    const/high16 v8, 0x3f800000    # 1.0f

    .line 731
    .line 732
    const/4 v7, 0x0

    .line 733
    const/high16 v12, 0x3f800000    # 1.0f

    .line 734
    .line 735
    const/4 v13, 0x0

    .line 736
    const/4 v14, 0x0

    .line 737
    const/4 v15, 0x0

    .line 738
    const-string v4, ""

    .line 739
    .line 740
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 741
    .line 742
    .line 743
    move-result-object v0

    .line 744
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 745
    .line 746
    .line 747
    move-result-object v0

    .line 748
    sput-object v0, Landroidx/compose/material/icons/twotone/VoiceOverOffKt;->_voiceOverOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 749
    .line 750
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 751
    .line 752
    .line 753
    return-object v0
.end method
