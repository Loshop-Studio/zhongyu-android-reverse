.class public final Landroidx/compose/material/icons/outlined/EmergencyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_emergency",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Emergency",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getEmergency",
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
        "SMAP\nEmergency.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emergency.kt\nandroidx/compose/material/icons/outlined/EmergencyKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,95:1\n212#2,12:96\n233#2,18:109\n253#2:146\n174#3:108\n705#4,2:127\n717#4,2:129\n719#4,11:135\n72#5,4:131\n*S KotlinDebug\n*F\n+ 1 Emergency.kt\nandroidx/compose/material/icons/outlined/EmergencyKt\n*L\n29#1:96,12\n30#1:109,18\n30#1:146\n29#1:108\n30#1:127,2\n30#1:129,2\n30#1:135,11\n30#1:131,4\n*E\n"
    }
.end annotation


# static fields
.field private static _emergency:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getEmergency(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/EmergencyKt;->_emergency:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Emergency"

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
    const v0, 0x41aa51ec    # 21.29f

    .line 71
    .line 72
    .line 73
    const v2, 0x415e6666    # 13.9f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v0, 0x41900000    # 18.0f

    .line 80
    .line 81
    const/high16 v2, 0x41400000    # 12.0f

    .line 82
    .line 83
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const v0, -0x400ccccd    # -1.9f

    .line 87
    .line 88
    .line 89
    const v2, 0x40528f5c    # 3.29f

    .line 90
    .line 91
    .line 92
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const v17, 0x3ebd70a4    # 0.37f

    .line 96
    .line 97
    .line 98
    const v18, -0x4050a3d7    # -1.37f

    .line 99
    .line 100
    .line 101
    const v13, 0x3ef5c28f    # 0.48f

    .line 102
    .line 103
    .line 104
    const v14, -0x4170a3d7    # -0.28f

    .line 105
    .line 106
    .line 107
    const v15, 0x3f23d70a    # 0.64f

    .line 108
    .line 109
    .line 110
    const v16, -0x409c28f6    # -0.89f

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v0, -0x3fa28f5c    # -3.46f

    .line 117
    .line 118
    .line 119
    const/high16 v2, -0x40000000    # -2.0f

    .line 120
    .line 121
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v17, -0x4050a3d7    # -1.37f

    .line 125
    .line 126
    .line 127
    const v18, -0x41428f5c    # -0.37f

    .line 128
    .line 129
    .line 130
    const v13, -0x4170a3d7    # -0.28f

    .line 131
    .line 132
    .line 133
    const v14, -0x410a3d71    # -0.48f

    .line 134
    .line 135
    .line 136
    const v15, -0x409c28f6    # -0.89f

    .line 137
    .line 138
    .line 139
    const v16, -0x40dc28f6    # -0.64f

    .line 140
    .line 141
    .line 142
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const/high16 v0, 0x41700000    # 15.0f

    .line 146
    .line 147
    const v2, 0x40d9999a    # 6.8f

    .line 148
    .line 149
    .line 150
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/high16 v0, 0x40400000    # 3.0f

    .line 154
    .line 155
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v17, -0x40800000    # -1.0f

    .line 159
    .line 160
    const/high16 v18, -0x40800000    # -1.0f

    .line 161
    .line 162
    const/4 v13, 0x0

    .line 163
    const v14, -0x40f33333    # -0.55f

    .line 164
    .line 165
    .line 166
    const v15, -0x4119999a    # -0.45f

    .line 167
    .line 168
    .line 169
    const/high16 v16, -0x40800000    # -1.0f

    .line 170
    .line 171
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const/high16 v0, -0x3f800000    # -4.0f

    .line 175
    .line 176
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v17, 0x41100000    # 9.0f

    .line 180
    .line 181
    const/high16 v18, 0x40400000    # 3.0f

    .line 182
    .line 183
    const v13, 0x41173333    # 9.45f

    .line 184
    .line 185
    .line 186
    const/high16 v14, 0x40000000    # 2.0f

    .line 187
    .line 188
    const/high16 v15, 0x41100000    # 9.0f

    .line 189
    .line 190
    const v16, 0x401ccccd    # 2.45f

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v0, 0x40733333    # 3.8f

    .line 197
    .line 198
    .line 199
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v0, 0x40b6b852    # 5.71f

    .line 203
    .line 204
    .line 205
    const v2, 0x409ccccd    # 4.9f

    .line 206
    .line 207
    .line 208
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v17, 0x408ae148    # 4.34f

    .line 212
    .line 213
    .line 214
    const v18, 0x40a8a3d7    # 5.27f

    .line 215
    .line 216
    .line 217
    const v13, 0x40a75c29    # 5.23f

    .line 218
    .line 219
    .line 220
    const v14, 0x409428f6    # 4.63f

    .line 221
    .line 222
    .line 223
    const v15, 0x4093d70a    # 4.62f

    .line 224
    .line 225
    .line 226
    const v16, 0x409947ae    # 4.79f

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v0, 0x405d70a4    # 3.46f

    .line 233
    .line 234
    .line 235
    const/high16 v2, -0x40000000    # -2.0f

    .line 236
    .line 237
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v17, 0x402d70a4    # 2.71f

    .line 241
    .line 242
    .line 243
    const v18, 0x4121999a    # 10.1f

    .line 244
    .line 245
    .line 246
    const v13, 0x4003d70a    # 2.06f

    .line 247
    .line 248
    .line 249
    const v14, 0x41135c29    # 9.21f

    .line 250
    .line 251
    .line 252
    const v15, 0x400eb852    # 2.23f

    .line 253
    .line 254
    .line 255
    const v16, 0x411d1eb8    # 9.82f

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v0, 0x40c00000    # 6.0f

    .line 262
    .line 263
    const/high16 v2, 0x41400000    # 12.0f

    .line 264
    .line 265
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v0, -0x3fad70a4    # -3.29f

    .line 269
    .line 270
    .line 271
    const v2, 0x3ff33333    # 1.9f

    .line 272
    .line 273
    .line 274
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v17, -0x41428f5c    # -0.37f

    .line 278
    .line 279
    .line 280
    const v18, 0x3faf5c29    # 1.37f

    .line 281
    .line 282
    .line 283
    const v13, -0x410a3d71    # -0.48f

    .line 284
    .line 285
    .line 286
    const v14, 0x3e8f5c29    # 0.28f

    .line 287
    .line 288
    .line 289
    const v15, -0x40dc28f6    # -0.64f

    .line 290
    .line 291
    .line 292
    const v16, 0x3f63d70a    # 0.89f

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v0, 0x405d70a4    # 3.46f

    .line 299
    .line 300
    .line 301
    const/high16 v2, 0x40000000    # 2.0f

    .line 302
    .line 303
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v17, 0x3faf5c29    # 1.37f

    .line 307
    .line 308
    .line 309
    const v18, 0x3ebd70a4    # 0.37f

    .line 310
    .line 311
    .line 312
    const v13, 0x3e8f5c29    # 0.28f

    .line 313
    .line 314
    .line 315
    const v14, 0x3ef5c28f    # 0.48f

    .line 316
    .line 317
    .line 318
    const v15, 0x3f63d70a    # 0.89f

    .line 319
    .line 320
    .line 321
    const v16, 0x3f23d70a    # 0.64f

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v0, 0x41100000    # 9.0f

    .line 328
    .line 329
    const v2, 0x4189999a    # 17.2f

    .line 330
    .line 331
    .line 332
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v0, 0x41a80000    # 21.0f

    .line 336
    .line 337
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v17, 0x3f800000    # 1.0f

    .line 341
    .line 342
    const/high16 v18, 0x3f800000    # 1.0f

    .line 343
    .line 344
    const/4 v13, 0x0

    .line 345
    const v14, 0x3f0ccccd    # 0.55f

    .line 346
    .line 347
    .line 348
    const v15, 0x3ee66666    # 0.45f

    .line 349
    .line 350
    .line 351
    const/high16 v16, 0x3f800000    # 1.0f

    .line 352
    .line 353
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/high16 v0, 0x40800000    # 4.0f

    .line 357
    .line 358
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const/high16 v18, -0x40800000    # -1.0f

    .line 362
    .line 363
    const v13, 0x3f0ccccd    # 0.55f

    .line 364
    .line 365
    .line 366
    const/4 v14, 0x0

    .line 367
    const/high16 v15, 0x3f800000    # 1.0f

    .line 368
    .line 369
    const v16, -0x4119999a    # -0.45f

    .line 370
    .line 371
    .line 372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v0, -0x3f8ccccd    # -3.8f

    .line 376
    .line 377
    .line 378
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v0, 0x3ff33333    # 1.9f

    .line 382
    .line 383
    .line 384
    const v2, 0x40528f5c    # 3.29f

    .line 385
    .line 386
    .line 387
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v17, 0x3faf5c29    # 1.37f

    .line 391
    .line 392
    .line 393
    const v18, -0x41428f5c    # -0.37f

    .line 394
    .line 395
    .line 396
    const v13, 0x3ef5c28f    # 0.48f

    .line 397
    .line 398
    .line 399
    const v14, 0x3e8f5c29    # 0.28f

    .line 400
    .line 401
    .line 402
    const v15, 0x3f8b851f    # 1.09f

    .line 403
    .line 404
    .line 405
    const v16, 0x3de147ae    # 0.11f

    .line 406
    .line 407
    .line 408
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v0, -0x3fa28f5c    # -3.46f

    .line 412
    .line 413
    .line 414
    const/high16 v2, 0x40000000    # 2.0f

    .line 415
    .line 416
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v17, 0x41aa51ec    # 21.29f

    .line 420
    .line 421
    .line 422
    const v18, 0x415e6666    # 13.9f

    .line 423
    .line 424
    .line 425
    const v13, 0x41af851f    # 21.94f

    .line 426
    .line 427
    .line 428
    const v14, 0x416ca3d7    # 14.79f

    .line 429
    .line 430
    .line 431
    const v15, 0x41ae28f6    # 21.77f

    .line 432
    .line 433
    .line 434
    const v16, 0x4162e148    # 14.18f

    .line 435
    .line 436
    .line 437
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v0, 0x4186f5c3    # 16.87f

    .line 444
    .line 445
    .line 446
    const v2, 0x419370a4    # 18.43f

    .line 447
    .line 448
    .line 449
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v0, -0x3fd33333    # -2.7f

    .line 453
    .line 454
    .line 455
    const v2, -0x3f6a3d71    # -4.68f

    .line 456
    .line 457
    .line 458
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const/high16 v17, 0x41500000    # 13.0f

    .line 462
    .line 463
    const v18, 0x4169999a    # 14.6f

    .line 464
    .line 465
    .line 466
    const v13, 0x4156b852    # 13.42f

    .line 467
    .line 468
    .line 469
    const v14, 0x415f851f    # 13.97f

    .line 470
    .line 471
    .line 472
    const/high16 v15, 0x41500000    # 13.0f

    .line 473
    .line 474
    const v16, 0x41635c29    # 14.21f

    .line 475
    .line 476
    .line 477
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const/high16 v0, 0x41a00000    # 20.0f

    .line 481
    .line 482
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const/high16 v0, -0x40000000    # -2.0f

    .line 486
    .line 487
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const v0, -0x3f533333    # -5.4f

    .line 491
    .line 492
    .line 493
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const/high16 v17, -0x40c00000    # -0.75f

    .line 497
    .line 498
    const v18, -0x4123d70a    # -0.43f

    .line 499
    .line 500
    .line 501
    const/4 v13, 0x0

    .line 502
    const v14, -0x413d70a4    # -0.38f

    .line 503
    .line 504
    .line 505
    const v15, -0x4128f5c3    # -0.42f

    .line 506
    .line 507
    .line 508
    const v16, -0x40deb852    # -0.63f

    .line 509
    .line 510
    .line 511
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const v0, 0x402ccccd    # 2.7f

    .line 515
    .line 516
    .line 517
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const/high16 v0, -0x40800000    # -1.0f

    .line 521
    .line 522
    const v2, -0x40228f5c    # -1.73f

    .line 523
    .line 524
    .line 525
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const v0, 0x4095c28f    # 4.68f

    .line 529
    .line 530
    .line 531
    const v2, -0x3fd33333    # -2.7f

    .line 532
    .line 533
    .line 534
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const/16 v17, 0x0

    .line 538
    .line 539
    const v18, -0x40a147ae    # -0.87f

    .line 540
    .line 541
    .line 542
    const v13, 0x3ea8f5c3    # 0.33f

    .line 543
    .line 544
    .line 545
    const v14, -0x41bd70a4    # -0.19f

    .line 546
    .line 547
    .line 548
    const v15, 0x3ea8f5c3    # 0.33f

    .line 549
    .line 550
    .line 551
    const v16, -0x40d47ae1    # -0.67f

    .line 552
    .line 553
    .line 554
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const v0, -0x3fd33333    # -2.7f

    .line 558
    .line 559
    .line 560
    const v2, -0x3f6a3d71    # -4.68f

    .line 561
    .line 562
    .line 563
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const/high16 v0, 0x3f800000    # 1.0f

    .line 567
    .line 568
    const v2, -0x40228f5c    # -1.73f

    .line 569
    .line 570
    .line 571
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const v0, 0x4095c28f    # 4.68f

    .line 575
    .line 576
    .line 577
    const v2, 0x402ccccd    # 2.7f

    .line 578
    .line 579
    .line 580
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const/high16 v17, 0x41300000    # 11.0f

    .line 584
    .line 585
    const v18, 0x41166666    # 9.4f

    .line 586
    .line 587
    .line 588
    const v13, 0x412947ae    # 10.58f

    .line 589
    .line 590
    .line 591
    const v14, 0x41207ae1    # 10.03f

    .line 592
    .line 593
    .line 594
    const/high16 v15, 0x41300000    # 11.0f

    .line 595
    .line 596
    const v16, 0x411ca3d7    # 9.79f

    .line 597
    .line 598
    .line 599
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const/high16 v0, 0x40800000    # 4.0f

    .line 603
    .line 604
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const/high16 v0, 0x40000000    # 2.0f

    .line 608
    .line 609
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    const v0, 0x40accccd    # 5.4f

    .line 613
    .line 614
    .line 615
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const/high16 v17, 0x3f400000    # 0.75f

    .line 619
    .line 620
    const v18, 0x3edc28f6    # 0.43f

    .line 621
    .line 622
    .line 623
    const/4 v13, 0x0

    .line 624
    const v14, 0x3ec28f5c    # 0.38f

    .line 625
    .line 626
    .line 627
    const v15, 0x3ed70a3d    # 0.42f

    .line 628
    .line 629
    .line 630
    const v16, 0x3f2147ae    # 0.63f

    .line 631
    .line 632
    .line 633
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const v0, 0x4095c28f    # 4.68f

    .line 637
    .line 638
    .line 639
    const v2, -0x3fd33333    # -2.7f

    .line 640
    .line 641
    .line 642
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    const v0, 0x3fdd70a4    # 1.73f

    .line 646
    .line 647
    .line 648
    const/high16 v2, 0x3f800000    # 1.0f

    .line 649
    .line 650
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const v0, 0x402ccccd    # 2.7f

    .line 654
    .line 655
    .line 656
    const v2, -0x3f6a3d71    # -4.68f

    .line 657
    .line 658
    .line 659
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const/16 v17, 0x0

    .line 663
    .line 664
    const v18, 0x3f5eb852    # 0.87f

    .line 665
    .line 666
    .line 667
    const v13, -0x41570a3d    # -0.33f

    .line 668
    .line 669
    .line 670
    const v14, 0x3e428f5c    # 0.19f

    .line 671
    .line 672
    .line 673
    const v15, -0x41570a3d    # -0.33f

    .line 674
    .line 675
    .line 676
    const v16, 0x3f2b851f    # 0.67f

    .line 677
    .line 678
    .line 679
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    const v0, 0x4095c28f    # 4.68f

    .line 683
    .line 684
    .line 685
    const v2, 0x402ccccd    # 2.7f

    .line 686
    .line 687
    .line 688
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    const v0, 0x4186f5c3    # 16.87f

    .line 692
    .line 693
    .line 694
    const v2, 0x419370a4    # 18.43f

    .line 695
    .line 696
    .line 697
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 704
    .line 705
    .line 706
    move-result-object v2

    .line 707
    const/16 v16, 0x3800

    .line 708
    .line 709
    const/16 v17, 0x0

    .line 710
    .line 711
    const/high16 v6, 0x3f800000    # 1.0f

    .line 712
    .line 713
    const/high16 v8, 0x3f800000    # 1.0f

    .line 714
    .line 715
    const/4 v7, 0x0

    .line 716
    const/high16 v9, 0x3f800000    # 1.0f

    .line 717
    .line 718
    const/high16 v12, 0x3f800000    # 1.0f

    .line 719
    .line 720
    const/4 v13, 0x0

    .line 721
    const/4 v14, 0x0

    .line 722
    const/4 v15, 0x0

    .line 723
    const-string v4, ""

    .line 724
    .line 725
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 726
    .line 727
    .line 728
    move-result-object v0

    .line 729
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 730
    .line 731
    .line 732
    move-result-object v0

    .line 733
    sput-object v0, Landroidx/compose/material/icons/outlined/EmergencyKt;->_emergency:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 734
    .line 735
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 736
    .line 737
    .line 738
    return-object v0
.end method
