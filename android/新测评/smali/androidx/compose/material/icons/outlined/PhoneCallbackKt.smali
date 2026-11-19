.class public final Landroidx/compose/material/icons/outlined/PhoneCallbackKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00038FX\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "_phoneCallback",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "PhoneCallback",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getPhoneCallback$annotations",
        "(Landroidx/compose/material/icons/Icons$Outlined;)V",
        "getPhoneCallback",
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
        "SMAP\nPhoneCallback.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneCallback.kt\nandroidx/compose/material/icons/outlined/PhoneCallbackKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,82:1\n212#2,12:83\n233#2,18:96\n253#2:133\n174#3:95\n705#4,2:114\n717#4,2:116\n719#4,11:122\n72#5,4:118\n*S KotlinDebug\n*F\n+ 1 PhoneCallback.kt\nandroidx/compose/material/icons/outlined/PhoneCallbackKt\n*L\n35#1:83,12\n36#1:96,18\n36#1:133\n35#1:95\n36#1:114,2\n36#1:116,2\n36#1:122,11\n36#1:118,4\n*E\n"
    }
.end annotation


# static fields
.field private static _phoneCallback:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPhoneCallback(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/PhoneCallbackKt;->_phoneCallback:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.PhoneCallback"

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
    const v2, 0x417828f6    # 15.51f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v17, -0x3f9b851f    # -3.57f

    .line 79
    .line 80
    .line 81
    const v18, -0x40ee147b    # -0.57f

    .line 82
    .line 83
    .line 84
    const v13, -0x406147ae    # -1.24f

    .line 85
    .line 86
    .line 87
    const/4 v14, 0x0

    .line 88
    const v15, -0x3fe33333    # -2.45f

    .line 89
    .line 90
    .line 91
    const v16, -0x41b33333    # -0.2f

    .line 92
    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v17, -0x416147ae    # -0.31f

    .line 98
    .line 99
    .line 100
    const v18, -0x42b33333    # -0.05f

    .line 101
    .line 102
    .line 103
    const v13, -0x42333333    # -0.1f

    .line 104
    .line 105
    .line 106
    const v14, -0x42dc28f6    # -0.04f

    .line 107
    .line 108
    .line 109
    const v15, -0x41a8f5c3    # -0.21f

    .line 110
    .line 111
    .line 112
    const v16, -0x42b33333    # -0.05f

    .line 113
    .line 114
    .line 115
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v17, -0x40ca3d71    # -0.71f

    .line 119
    .line 120
    .line 121
    const v18, 0x3e947ae1    # 0.29f

    .line 122
    .line 123
    .line 124
    const v13, -0x417ae148    # -0.26f

    .line 125
    .line 126
    .line 127
    const/4 v14, 0x0

    .line 128
    const v15, -0x40fd70a4    # -0.51f

    .line 129
    .line 130
    .line 131
    const v16, 0x3dcccccd    # 0.1f

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v0, 0x400ccccd    # 2.2f

    .line 138
    .line 139
    .line 140
    const v2, -0x3ff33333    # -2.2f

    .line 141
    .line 142
    .line 143
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const v17, -0x3f2d1eb8    # -6.59f

    .line 147
    .line 148
    .line 149
    const v18, -0x3f2d1eb8    # -6.59f

    .line 150
    .line 151
    .line 152
    const v13, -0x3fcae148    # -2.83f

    .line 153
    .line 154
    .line 155
    const v14, -0x40466666    # -1.45f

    .line 156
    .line 157
    .line 158
    const v15, -0x3f5b3333    # -5.15f

    .line 159
    .line 160
    .line 161
    const v16, -0x3f8f5c29    # -3.76f

    .line 162
    .line 163
    .line 164
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v17, 0x3e800000    # 0.25f

    .line 171
    .line 172
    const v18, -0x407d70a4    # -1.02f

    .line 173
    .line 174
    .line 175
    const v13, 0x3e8f5c29    # 0.28f

    .line 176
    .line 177
    .line 178
    const v14, -0x4170a3d7    # -0.28f

    .line 179
    .line 180
    .line 181
    const v15, 0x3eb851ec    # 0.36f

    .line 182
    .line 183
    .line 184
    const v16, -0x40d47ae1    # -0.67f

    .line 185
    .line 186
    .line 187
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v17, 0x41080000    # 8.5f

    .line 191
    .line 192
    const/high16 v18, 0x40800000    # 4.0f

    .line 193
    .line 194
    const v13, 0x410b3333    # 8.7f

    .line 195
    .line 196
    .line 197
    const v14, 0x40ce6666    # 6.45f

    .line 198
    .line 199
    .line 200
    const/high16 v15, 0x41080000    # 8.5f

    .line 201
    .line 202
    const/high16 v16, 0x40a80000    # 5.25f

    .line 203
    .line 204
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v17, -0x40800000    # -1.0f

    .line 208
    .line 209
    const/high16 v18, -0x40800000    # -1.0f

    .line 210
    .line 211
    const/4 v13, 0x0

    .line 212
    const v14, -0x40f33333    # -0.55f

    .line 213
    .line 214
    .line 215
    const v15, -0x4119999a    # -0.45f

    .line 216
    .line 217
    .line 218
    const/high16 v16, -0x40800000    # -1.0f

    .line 219
    .line 220
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v0, 0x40800000    # 4.0f

    .line 224
    .line 225
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v18, 0x3f800000    # 1.0f

    .line 229
    .line 230
    const v13, -0x40f33333    # -0.55f

    .line 231
    .line 232
    .line 233
    const/4 v14, 0x0

    .line 234
    const/high16 v15, -0x40800000    # -1.0f

    .line 235
    .line 236
    const v16, 0x3ee66666    # 0.45f

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v17, 0x41880000    # 17.0f

    .line 243
    .line 244
    const/high16 v18, 0x41880000    # 17.0f

    .line 245
    .line 246
    const/4 v13, 0x0

    .line 247
    const v14, 0x41163d71    # 9.39f

    .line 248
    .line 249
    .line 250
    const v15, 0x40f3851f    # 7.61f

    .line 251
    .line 252
    .line 253
    const/high16 v16, 0x41880000    # 17.0f

    .line 254
    .line 255
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v17, 0x3f800000    # 1.0f

    .line 259
    .line 260
    const/high16 v18, -0x40800000    # -1.0f

    .line 261
    .line 262
    const v13, 0x3f0ccccd    # 0.55f

    .line 263
    .line 264
    .line 265
    const/4 v14, 0x0

    .line 266
    const/high16 v15, 0x3f800000    # 1.0f

    .line 267
    .line 268
    const v16, -0x4119999a    # -0.45f

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v0, -0x3fa0a3d7    # -3.49f

    .line 275
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
    const v17, 0x3eeb851f    # 0.46f

    .line 311
    .line 312
    .line 313
    const v18, 0x4025c28f    # 2.59f

    .line 314
    .line 315
    .line 316
    const v13, 0x3d8f5c29    # 0.07f

    .line 317
    .line 318
    .line 319
    const v14, 0x3f63d70a    # 0.89f

    .line 320
    .line 321
    .line 322
    const v15, 0x3e6147ae    # 0.22f

    .line 323
    .line 324
    .line 325
    const v16, 0x3fe147ae    # 1.76f

    .line 326
    .line 327
    .line 328
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v0, -0x40666666    # -1.2f

    .line 332
    .line 333
    .line 334
    const v2, 0x3f99999a    # 1.2f

    .line 335
    .line 336
    .line 337
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const v17, -0x40bd70a4    # -0.76f

    .line 341
    .line 342
    .line 343
    const v18, -0x3f8d70a4    # -3.79f

    .line 344
    .line 345
    .line 346
    const v13, -0x412e147b    # -0.41f

    .line 347
    .line 348
    .line 349
    const v14, -0x40666666    # -1.2f

    .line 350
    .line 351
    .line 352
    const v15, -0x40d47ae1    # -0.67f

    .line 353
    .line 354
    .line 355
    const v16, -0x3fe1eb85    # -2.47f

    .line 356
    .line 357
    .line 358
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/high16 v0, 0x41980000    # 19.0f

    .line 365
    .line 366
    const v2, 0x4197c28f    # 18.97f

    .line 367
    .line 368
    .line 369
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v17, -0x3f8ccccd    # -3.8f

    .line 373
    .line 374
    .line 375
    const/high16 v18, -0x40c00000    # -0.75f

    .line 376
    .line 377
    const v13, -0x40570a3d    # -1.32f

    .line 378
    .line 379
    .line 380
    const v14, -0x4247ae14    # -0.09f

    .line 381
    .line 382
    .line 383
    const v15, -0x3fda3d71    # -2.59f

    .line 384
    .line 385
    .line 386
    const v16, -0x414ccccd    # -0.35f

    .line 387
    .line 388
    .line 389
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v0, 0x3f9851ec    # 1.19f

    .line 393
    .line 394
    .line 395
    const v2, -0x4067ae14    # -1.19f

    .line 396
    .line 397
    .line 398
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v17, 0x40266666    # 2.6f

    .line 402
    .line 403
    .line 404
    const v18, 0x3ee66666    # 0.45f

    .line 405
    .line 406
    .line 407
    const v13, 0x3f59999a    # 0.85f

    .line 408
    .line 409
    .line 410
    const v14, 0x3e75c28f    # 0.24f

    .line 411
    .line 412
    .line 413
    const v15, 0x3fdc28f6    # 1.72f

    .line 414
    .line 415
    .line 416
    const v16, 0x3ec7ae14    # 0.39f

    .line 417
    .line 418
    .line 419
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v0, 0x3fbeb852    # 1.49f

    .line 423
    .line 424
    .line 425
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v0, 0x41900000    # 18.0f

    .line 432
    .line 433
    const/high16 v2, 0x41100000    # 9.0f

    .line 434
    .line 435
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v0, -0x3fda3d71    # -2.59f

    .line 439
    .line 440
    .line 441
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v0, 0x40a0a3d7    # 5.02f

    .line 445
    .line 446
    .line 447
    const v2, -0x3f5f5c29    # -5.02f

    .line 448
    .line 449
    .line 450
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v0, -0x404b851f    # -1.41f

    .line 454
    .line 455
    .line 456
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/high16 v0, 0x41600000    # 14.0f

    .line 460
    .line 461
    const v2, 0x40f2e148    # 7.59f

    .line 462
    .line 463
    .line 464
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const/high16 v0, 0x40a00000    # 5.0f

    .line 468
    .line 469
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const/high16 v0, -0x40000000    # -2.0f

    .line 473
    .line 474
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const/high16 v0, 0x40c00000    # 6.0f

    .line 478
    .line 479
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 489
    .line 490
    .line 491
    move-result-object v2

    .line 492
    const/16 v16, 0x3800

    .line 493
    .line 494
    const/16 v17, 0x0

    .line 495
    .line 496
    const/high16 v6, 0x3f800000    # 1.0f

    .line 497
    .line 498
    const/high16 v8, 0x3f800000    # 1.0f

    .line 499
    .line 500
    const/4 v7, 0x0

    .line 501
    const/high16 v9, 0x3f800000    # 1.0f

    .line 502
    .line 503
    const/high16 v12, 0x3f800000    # 1.0f

    .line 504
    .line 505
    const/4 v13, 0x0

    .line 506
    const/4 v14, 0x0

    .line 507
    const/4 v15, 0x0

    .line 508
    const-string v4, ""

    .line 509
    .line 510
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 511
    .line 512
    .line 513
    move-result-object v0

    .line 514
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    sput-object v0, Landroidx/compose/material/icons/outlined/PhoneCallbackKt;->_phoneCallback:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 519
    .line 520
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 521
    .line 522
    .line 523
    return-object v0
.end method

.method public static synthetic getPhoneCallback$annotations(Landroidx/compose/material/icons/Icons$Outlined;)V
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        message = "Use the AutoMirrored version at Icons.AutoMirrored.Outlined.PhoneCallback"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "Icons.AutoMirrored.Outlined.PhoneCallback"
            imports = {
                "androidx.compose.material.icons.automirrored.outlined.PhoneCallback"
            }
        .end subannotation
    .end annotation

    return-void
.end method
