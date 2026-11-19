.class public final Landroidx/compose/material/icons/outlined/PhoneEnabledKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_phoneEnabled",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "PhoneEnabled",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getPhoneEnabled",
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
        "SMAP\nPhoneEnabled.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneEnabled.kt\nandroidx/compose/material/icons/outlined/PhoneEnabledKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,66:1\n212#2,12:67\n233#2,18:80\n253#2:117\n174#3:79\n705#4,2:98\n717#4,2:100\n719#4,11:106\n72#5,4:102\n*S KotlinDebug\n*F\n+ 1 PhoneEnabled.kt\nandroidx/compose/material/icons/outlined/PhoneEnabledKt\n*L\n29#1:67,12\n30#1:80,18\n30#1:117\n29#1:79\n30#1:98,2\n30#1:100,2\n30#1:106,11\n30#1:102,4\n*E\n"
    }
.end annotation


# static fields
.field private static _phoneEnabled:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPhoneEnabled(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/PhoneEnabledKt;->_phoneEnabled:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.PhoneEnabled"

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
    const/high16 v0, 0x40a00000    # 5.0f

    .line 71
    .line 72
    const v2, 0x418bae14    # 17.46f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v17, -0x4119999a    # -0.45f

    .line 79
    .line 80
    .line 81
    const v18, 0x4025c28f    # 2.59f

    .line 82
    .line 83
    .line 84
    const v13, -0x428a3d71    # -0.06f

    .line 85
    .line 86
    .line 87
    const v14, 0x3f63d70a    # 0.89f

    .line 88
    .line 89
    .line 90
    const v15, -0x41a8f5c3    # -0.21f

    .line 91
    .line 92
    .line 93
    const v16, 0x3fe147ae    # 1.76f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v0, 0x3f99999a    # 1.2f

    .line 100
    .line 101
    .line 102
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v17, 0x3f428f5c    # 0.76f

    .line 106
    .line 107
    .line 108
    const v18, -0x3f8d70a4    # -3.79f

    .line 109
    .line 110
    .line 111
    const v13, 0x3ed1eb85    # 0.41f

    .line 112
    .line 113
    .line 114
    const v14, -0x40666666    # -1.2f

    .line 115
    .line 116
    .line 117
    const v15, 0x3f2b851f    # 0.67f

    .line 118
    .line 119
    .line 120
    const v16, -0x3fe1eb85    # -2.47f

    .line 121
    .line 122
    .line 123
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v0, 0x418bae14    # 17.46f

    .line 127
    .line 128
    .line 129
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v0, 0x418828f6    # 17.02f

    .line 136
    .line 137
    .line 138
    const v2, 0x40f33333    # 7.6f

    .line 139
    .line 140
    .line 141
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v17, -0x3fd9999a    # -2.6f

    .line 145
    .line 146
    .line 147
    const v18, 0x3ee66666    # 0.45f

    .line 148
    .line 149
    .line 150
    const v13, -0x40a66666    # -0.85f

    .line 151
    .line 152
    .line 153
    const v14, 0x3e75c28f    # 0.24f

    .line 154
    .line 155
    .line 156
    const v15, -0x4023d70a    # -1.72f

    .line 157
    .line 158
    .line 159
    const v16, 0x3ec7ae14    # 0.39f

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v0, 0x3fbeb852    # 1.49f

    .line 166
    .line 167
    .line 168
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v17, 0x40733333    # 3.8f

    .line 172
    .line 173
    .line 174
    const/high16 v18, -0x40c00000    # -0.75f

    .line 175
    .line 176
    const v13, 0x3fa8f5c3    # 1.32f

    .line 177
    .line 178
    .line 179
    const v14, -0x4247ae14    # -0.09f

    .line 180
    .line 181
    .line 182
    const v15, 0x4025c28f    # 2.59f

    .line 183
    .line 184
    .line 185
    const v16, -0x414ccccd    # -0.35f

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v0, 0x418828f6    # 17.02f

    .line 192
    .line 193
    .line 194
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v0, 0x41840000    # 16.5f

    .line 201
    .line 202
    const/high16 v2, 0x40400000    # 3.0f

    .line 203
    .line 204
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v0, 0x41a00000    # 20.0f

    .line 208
    .line 209
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v17, 0x3f800000    # 1.0f

    .line 213
    .line 214
    const/high16 v18, 0x3f800000    # 1.0f

    .line 215
    .line 216
    const v13, 0x3f0ccccd    # 0.55f

    .line 217
    .line 218
    .line 219
    const/4 v14, 0x0

    .line 220
    const/high16 v15, 0x3f800000    # 1.0f

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
    const/high16 v17, -0x3e780000    # -17.0f

    .line 229
    .line 230
    const/high16 v18, 0x41880000    # 17.0f

    .line 231
    .line 232
    const/4 v13, 0x0

    .line 233
    const v14, 0x41163d71    # 9.39f

    .line 234
    .line 235
    .line 236
    const v15, -0x3f0c7ae1    # -7.61f

    .line 237
    .line 238
    .line 239
    const/high16 v16, 0x41880000    # 17.0f

    .line 240
    .line 241
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v17, -0x40800000    # -1.0f

    .line 245
    .line 246
    const/high16 v18, -0x40800000    # -1.0f

    .line 247
    .line 248
    const v13, -0x40f33333    # -0.55f

    .line 249
    .line 250
    .line 251
    const/4 v14, 0x0

    .line 252
    const/high16 v15, -0x40800000    # -1.0f

    .line 253
    .line 254
    const v16, -0x4119999a    # -0.45f

    .line 255
    .line 256
    .line 257
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v0, -0x3fa0a3d7    # -3.49f

    .line 261
    .line 262
    .line 263
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v17, 0x3f800000    # 1.0f

    .line 267
    .line 268
    const/4 v13, 0x0

    .line 269
    const v14, -0x40f33333    # -0.55f

    .line 270
    .line 271
    .line 272
    const v15, 0x3ee66666    # 0.45f

    .line 273
    .line 274
    .line 275
    const/high16 v16, -0x40800000    # -1.0f

    .line 276
    .line 277
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v17, 0x40647ae1    # 3.57f

    .line 281
    .line 282
    .line 283
    const v18, -0x40ee147b    # -0.57f

    .line 284
    .line 285
    .line 286
    const v13, 0x3f9eb852    # 1.24f

    .line 287
    .line 288
    .line 289
    const/4 v14, 0x0

    .line 290
    const v15, 0x401ccccd    # 2.45f

    .line 291
    .line 292
    .line 293
    const v16, -0x41b33333    # -0.2f

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v17, 0x3e9eb852    # 0.31f

    .line 300
    .line 301
    .line 302
    const v18, -0x42b33333    # -0.05f

    .line 303
    .line 304
    .line 305
    const v13, 0x3dcccccd    # 0.1f

    .line 306
    .line 307
    .line 308
    const v14, -0x42dc28f6    # -0.04f

    .line 309
    .line 310
    .line 311
    const v15, 0x3e570a3d    # 0.21f

    .line 312
    .line 313
    .line 314
    const v16, -0x42b33333    # -0.05f

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v17, 0x3f35c28f    # 0.71f

    .line 321
    .line 322
    .line 323
    const v18, 0x3e947ae1    # 0.29f

    .line 324
    .line 325
    .line 326
    const v13, 0x3e851eb8    # 0.26f

    .line 327
    .line 328
    .line 329
    const/4 v14, 0x0

    .line 330
    const v15, 0x3f028f5c    # 0.51f

    .line 331
    .line 332
    .line 333
    const v16, 0x3dcccccd    # 0.1f

    .line 334
    .line 335
    .line 336
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v0, 0x400ccccd    # 2.2f

    .line 340
    .line 341
    .line 342
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const v17, 0x40d2e148    # 6.59f

    .line 346
    .line 347
    .line 348
    const v18, -0x3f2d1eb8    # -6.59f

    .line 349
    .line 350
    .line 351
    const v13, 0x40351eb8    # 2.83f

    .line 352
    .line 353
    .line 354
    const v14, -0x40466666    # -1.45f

    .line 355
    .line 356
    .line 357
    const v15, 0x40a4cccd    # 5.15f

    .line 358
    .line 359
    .line 360
    const v16, -0x3f8f5c29    # -3.76f

    .line 361
    .line 362
    .line 363
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const v0, -0x3ff33333    # -2.2f

    .line 367
    .line 368
    .line 369
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const/high16 v17, -0x41800000    # -0.25f

    .line 373
    .line 374
    const v18, -0x407d70a4    # -1.02f

    .line 375
    .line 376
    .line 377
    const v13, -0x4170a3d7    # -0.28f

    .line 378
    .line 379
    .line 380
    const v14, -0x4170a3d7    # -0.28f

    .line 381
    .line 382
    .line 383
    const v15, -0x4147ae14    # -0.36f

    .line 384
    .line 385
    .line 386
    const v16, -0x40d47ae1    # -0.67f

    .line 387
    .line 388
    .line 389
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const/high16 v17, 0x41780000    # 15.5f

    .line 393
    .line 394
    const/high16 v18, 0x40800000    # 4.0f

    .line 395
    .line 396
    const v13, 0x4174cccd    # 15.3f

    .line 397
    .line 398
    .line 399
    const v14, 0x40ce6666    # 6.45f

    .line 400
    .line 401
    .line 402
    const/high16 v15, 0x41780000    # 15.5f

    .line 403
    .line 404
    const/high16 v16, 0x40a80000    # 5.25f

    .line 405
    .line 406
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const/high16 v17, 0x41840000    # 16.5f

    .line 410
    .line 411
    const/high16 v18, 0x40400000    # 3.0f

    .line 412
    .line 413
    const/high16 v13, 0x41780000    # 15.5f

    .line 414
    .line 415
    const v14, 0x405ccccd    # 3.45f

    .line 416
    .line 417
    .line 418
    const v15, 0x417f3333    # 15.95f

    .line 419
    .line 420
    .line 421
    const/high16 v16, 0x40400000    # 3.0f

    .line 422
    .line 423
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 430
    .line 431
    .line 432
    move-result-object v2

    .line 433
    const/16 v16, 0x3800

    .line 434
    .line 435
    const/16 v17, 0x0

    .line 436
    .line 437
    const/high16 v6, 0x3f800000    # 1.0f

    .line 438
    .line 439
    const/high16 v8, 0x3f800000    # 1.0f

    .line 440
    .line 441
    const/4 v7, 0x0

    .line 442
    const/high16 v9, 0x3f800000    # 1.0f

    .line 443
    .line 444
    const/high16 v12, 0x3f800000    # 1.0f

    .line 445
    .line 446
    const/4 v13, 0x0

    .line 447
    const/4 v14, 0x0

    .line 448
    const/4 v15, 0x0

    .line 449
    const-string v4, ""

    .line 450
    .line 451
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    sput-object v0, Landroidx/compose/material/icons/outlined/PhoneEnabledKt;->_phoneEnabled:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 460
    .line 461
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 462
    .line 463
    .line 464
    return-object v0
.end method
