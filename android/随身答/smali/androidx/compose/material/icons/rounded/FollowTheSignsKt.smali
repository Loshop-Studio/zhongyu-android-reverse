.class public final Landroidx/compose/material/icons/rounded/FollowTheSignsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00038FX\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "_followTheSigns",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "FollowTheSigns",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getFollowTheSigns$annotations",
        "(Landroidx/compose/material/icons/Icons$Rounded;)V",
        "getFollowTheSigns",
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
        "SMAP\nFollowTheSigns.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FollowTheSigns.kt\nandroidx/compose/material/icons/rounded/FollowTheSignsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,108:1\n212#2,12:109\n233#2,18:122\n253#2:159\n174#3:121\n705#4,2:140\n717#4,2:142\n719#4,11:148\n72#5,4:144\n*S KotlinDebug\n*F\n+ 1 FollowTheSigns.kt\nandroidx/compose/material/icons/rounded/FollowTheSignsKt\n*L\n35#1:109,12\n36#1:122,18\n36#1:159\n35#1:121\n36#1:140,2\n36#1:142,2\n36#1:148,11\n36#1:144,4\n*E\n"
    }
.end annotation


# static fields
.field private static _followTheSigns:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFollowTheSigns(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/FollowTheSignsKt;->_followTheSigns:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.FollowTheSigns"

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
    const/high16 v0, 0x41180000    # 9.5f

    .line 71
    .line 72
    const/high16 v2, 0x40b00000    # 5.5f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x40000000    # 2.0f

    .line 78
    .line 79
    const/high16 v18, -0x40000000    # -2.0f

    .line 80
    .line 81
    const v13, 0x3f8ccccd    # 1.1f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, 0x40000000    # 2.0f

    .line 86
    .line 87
    const v16, -0x4099999a    # -0.9f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, -0x4099999a    # -0.9f

    .line 94
    .line 95
    .line 96
    const/high16 v2, -0x40000000    # -2.0f

    .line 97
    .line 98
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v0, 0x3f666666    # 0.9f

    .line 102
    .line 103
    .line 104
    const/high16 v2, 0x40000000    # 2.0f

    .line 105
    .line 106
    const/high16 v4, -0x40000000    # -2.0f

    .line 107
    .line 108
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v0, 0x41066666    # 8.4f

    .line 112
    .line 113
    .line 114
    const/high16 v2, 0x41180000    # 9.5f

    .line 115
    .line 116
    const/high16 v4, 0x40b00000    # 5.5f

    .line 117
    .line 118
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v0, 0x410e6666    # 8.9f

    .line 125
    .line 126
    .line 127
    const/high16 v2, 0x40b80000    # 5.75f

    .line 128
    .line 129
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v0, 0x404eb852    # 3.23f

    .line 133
    .line 134
    .line 135
    const v2, 0x41ae7ae1    # 21.81f

    .line 136
    .line 137
    .line 138
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v17, 0x4086b852    # 4.21f

    .line 142
    .line 143
    .line 144
    const/high16 v18, 0x41b80000    # 23.0f

    .line 145
    .line 146
    const v13, 0x40470a3d    # 3.11f

    .line 147
    .line 148
    .line 149
    const v14, 0x41b370a4    # 22.43f

    .line 150
    .line 151
    .line 152
    const v15, 0x40651eb8    # 3.58f

    .line 153
    .line 154
    .line 155
    const/high16 v16, 0x41b80000    # 23.0f

    .line 156
    .line 157
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v0, 0x4089999a    # 4.3f

    .line 161
    .line 162
    .line 163
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v17, 0x3f7ae148    # 0.98f

    .line 167
    .line 168
    .line 169
    const v18, -0x40b5c28f    # -0.79f

    .line 170
    .line 171
    .line 172
    const v13, 0x3ef0a3d7    # 0.47f

    .line 173
    .line 174
    .line 175
    const/4 v14, 0x0

    .line 176
    const v15, 0x3f6147ae    # 0.88f

    .line 177
    .line 178
    .line 179
    const v16, -0x41570a3d    # -0.33f

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const v0, 0x40db3333    # 6.85f

    .line 186
    .line 187
    .line 188
    const/high16 v2, 0x41700000    # 15.0f

    .line 189
    .line 190
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v0, 0x41880000    # 17.0f

    .line 194
    .line 195
    const/high16 v2, 0x41100000    # 9.0f

    .line 196
    .line 197
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v0, 0x40a00000    # 5.0f

    .line 201
    .line 202
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v17, 0x3f800000    # 1.0f

    .line 206
    .line 207
    const/high16 v18, 0x3f800000    # 1.0f

    .line 208
    .line 209
    const/4 v13, 0x0

    .line 210
    const v14, 0x3f0ccccd    # 0.55f

    .line 211
    .line 212
    .line 213
    const v15, 0x3ee66666    # 0.45f

    .line 214
    .line 215
    .line 216
    const/high16 v16, 0x3f800000    # 1.0f

    .line 217
    .line 218
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/4 v0, 0x0

    .line 222
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v18, -0x40800000    # -1.0f

    .line 226
    .line 227
    const v13, 0x3f0ccccd    # 0.55f

    .line 228
    .line 229
    .line 230
    const/4 v14, 0x0

    .line 231
    const/high16 v15, 0x3f800000    # 1.0f

    .line 232
    .line 233
    const v16, -0x4119999a    # -0.45f

    .line 234
    .line 235
    .line 236
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v0, -0x3f3b851f    # -6.14f

    .line 240
    .line 241
    .line 242
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const v17, -0x416b851f    # -0.29f

    .line 246
    .line 247
    .line 248
    const v18, -0x40ca3d71    # -0.71f

    .line 249
    .line 250
    .line 251
    const/4 v13, 0x0

    .line 252
    const v14, -0x4175c28f    # -0.27f

    .line 253
    .line 254
    .line 255
    const v15, -0x421eb852    # -0.11f

    .line 256
    .line 257
    .line 258
    const v16, -0x40fae148    # -0.52f

    .line 259
    .line 260
    .line 261
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v0, 0x410f3333    # 8.95f

    .line 265
    .line 266
    .line 267
    const v2, 0x41566666    # 13.4f

    .line 268
    .line 269
    .line 270
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v0, 0x3f19999a    # 0.6f

    .line 274
    .line 275
    .line 276
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 277
    .line 278
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v17, 0x4089eb85    # 4.31f

    .line 282
    .line 283
    .line 284
    const v18, 0x4020a3d7    # 2.51f

    .line 285
    .line 286
    .line 287
    const v13, 0x3f88f5c3    # 1.07f

    .line 288
    .line 289
    .line 290
    const v14, 0x3fa8f5c3    # 1.32f

    .line 291
    .line 292
    .line 293
    const v15, 0x40251eb8    # 2.58f

    .line 294
    .line 295
    .line 296
    const v16, 0x400eb852    # 2.23f

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v17, 0x3f91eb85    # 1.14f

    .line 303
    .line 304
    .line 305
    const/high16 v18, -0x40800000    # -1.0f

    .line 306
    .line 307
    const v13, 0x3f19999a    # 0.6f

    .line 308
    .line 309
    .line 310
    const v14, 0x3dcccccd    # 0.1f

    .line 311
    .line 312
    .line 313
    const v15, 0x3f91eb85    # 1.14f

    .line 314
    .line 315
    .line 316
    const v16, -0x413851ec    # -0.39f

    .line 317
    .line 318
    .line 319
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/4 v0, 0x0

    .line 323
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v17, -0x40a8f5c3    # -0.84f

    .line 327
    .line 328
    .line 329
    const v18, -0x40851eb8    # -0.98f

    .line 330
    .line 331
    .line 332
    const/4 v13, 0x0

    .line 333
    const v14, -0x41051eb8    # -0.49f

    .line 334
    .line 335
    .line 336
    const v15, -0x4147ae14    # -0.36f

    .line 337
    .line 338
    .line 339
    const v16, -0x4099999a    # -0.9f

    .line 340
    .line 341
    .line 342
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const v17, -0x3f9f5c29    # -3.51f

    .line 346
    .line 347
    .line 348
    const v18, -0x3fe7ae14    # -2.38f

    .line 349
    .line 350
    .line 351
    const v13, -0x404147ae    # -1.49f

    .line 352
    .line 353
    .line 354
    const/high16 v14, -0x41800000    # -0.25f

    .line 355
    .line 356
    const/high16 v15, -0x3fd00000    # -2.75f

    .line 357
    .line 358
    const v16, -0x406ccccd    # -1.15f

    .line 359
    .line 360
    .line 361
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const v0, 0x411b3333    # 9.7f

    .line 365
    .line 366
    .line 367
    const v2, 0x40de6666    # 6.95f

    .line 368
    .line 369
    .line 370
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const/high16 v17, 0x41000000    # 8.0f

    .line 374
    .line 375
    const/high16 v18, 0x40c00000    # 6.0f

    .line 376
    .line 377
    const v13, 0x4115999a    # 9.35f

    .line 378
    .line 379
    .line 380
    const v14, 0x40cb3333    # 6.35f

    .line 381
    .line 382
    .line 383
    const v15, 0x410b3333    # 8.7f

    .line 384
    .line 385
    .line 386
    const/high16 v16, 0x40c00000    # 6.0f

    .line 387
    .line 388
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v17, 0x40e80000    # 7.25f

    .line 392
    .line 393
    const v18, 0x40c4cccd    # 6.15f

    .line 394
    .line 395
    .line 396
    const/high16 v13, 0x40f80000    # 7.75f

    .line 397
    .line 398
    const/high16 v14, 0x40c00000    # 6.0f

    .line 399
    .line 400
    const/high16 v15, 0x40f00000    # 7.5f

    .line 401
    .line 402
    const v16, 0x40c1999a    # 6.05f

    .line 403
    .line 404
    .line 405
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v0, -0x3f6bd70a    # -4.63f

    .line 409
    .line 410
    .line 411
    const v2, 0x3ff33333    # 1.9f

    .line 412
    .line 413
    .line 414
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const/high16 v17, 0x40000000    # 2.0f

    .line 418
    .line 419
    const v18, 0x410f851f    # 8.97f

    .line 420
    .line 421
    .line 422
    const/high16 v13, 0x40100000    # 2.25f

    .line 423
    .line 424
    const v14, 0x41033333    # 8.2f

    .line 425
    .line 426
    .line 427
    const/high16 v15, 0x40000000    # 2.0f

    .line 428
    .line 429
    const v16, 0x41091eb8    # 8.57f

    .line 430
    .line 431
    .line 432
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/high16 v0, 0x41400000    # 12.0f

    .line 436
    .line 437
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const/high16 v17, 0x3f800000    # 1.0f

    .line 441
    .line 442
    const/high16 v18, 0x3f800000    # 1.0f

    .line 443
    .line 444
    const/4 v13, 0x0

    .line 445
    const v14, 0x3f0ccccd    # 0.55f

    .line 446
    .line 447
    .line 448
    const v15, 0x3ee66666    # 0.45f

    .line 449
    .line 450
    .line 451
    const/high16 v16, 0x3f800000    # 1.0f

    .line 452
    .line 453
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/4 v0, 0x0

    .line 457
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const/high16 v18, -0x40800000    # -1.0f

    .line 461
    .line 462
    const v13, 0x3f0ccccd    # 0.55f

    .line 463
    .line 464
    .line 465
    const/4 v14, 0x0

    .line 466
    const/high16 v15, 0x3f800000    # 1.0f

    .line 467
    .line 468
    const v16, -0x4119999a    # -0.45f

    .line 469
    .line 470
    .line 471
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v0, 0x411a6666    # 9.65f

    .line 475
    .line 476
    .line 477
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const v0, 0x410e6666    # 8.9f

    .line 481
    .line 482
    .line 483
    const/high16 v2, 0x40b80000    # 5.75f

    .line 484
    .line 485
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const/high16 v0, 0x41a80000    # 21.0f

    .line 489
    .line 490
    const/high16 v2, 0x40000000    # 2.0f

    .line 491
    .line 492
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const/high16 v0, -0x3f200000    # -7.0f

    .line 496
    .line 497
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v17, -0x40800000    # -1.0f

    .line 501
    .line 502
    const/high16 v18, 0x3f800000    # 1.0f

    .line 503
    .line 504
    const v13, -0x40f33333    # -0.55f

    .line 505
    .line 506
    .line 507
    const/high16 v15, -0x40800000    # -1.0f

    .line 508
    .line 509
    const v16, 0x3ee66666    # 0.45f

    .line 510
    .line 511
    .line 512
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v0, 0x40a00000    # 5.0f

    .line 516
    .line 517
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const/high16 v17, 0x3f800000    # 1.0f

    .line 521
    .line 522
    const/4 v13, 0x0

    .line 523
    const v14, 0x3f0ccccd    # 0.55f

    .line 524
    .line 525
    .line 526
    const v15, 0x3ee66666    # 0.45f

    .line 527
    .line 528
    .line 529
    const/high16 v16, 0x3f800000    # 1.0f

    .line 530
    .line 531
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const/high16 v0, 0x40300000    # 2.75f

    .line 535
    .line 536
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const/high16 v0, 0x41540000    # 13.25f

    .line 540
    .line 541
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const/high16 v17, 0x3f400000    # 0.75f

    .line 545
    .line 546
    const/high16 v18, 0x3f400000    # 0.75f

    .line 547
    .line 548
    const v14, 0x3ed1eb85    # 0.41f

    .line 549
    .line 550
    .line 551
    const v15, 0x3eae147b    # 0.34f

    .line 552
    .line 553
    .line 554
    const/high16 v16, 0x3f400000    # 0.75f

    .line 555
    .line 556
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const v0, -0x4151eb85    # -0.34f

    .line 560
    .line 561
    .line 562
    const/high16 v2, -0x40c00000    # -0.75f

    .line 563
    .line 564
    const/high16 v4, 0x3f400000    # 0.75f

    .line 565
    .line 566
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const/high16 v0, 0x41100000    # 9.0f

    .line 570
    .line 571
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const/high16 v0, 0x41a80000    # 21.0f

    .line 575
    .line 576
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const/high16 v17, 0x3f800000    # 1.0f

    .line 580
    .line 581
    const/high16 v18, -0x40800000    # -1.0f

    .line 582
    .line 583
    const v13, 0x3f0ccccd    # 0.55f

    .line 584
    .line 585
    .line 586
    const/4 v14, 0x0

    .line 587
    const/high16 v15, 0x3f800000    # 1.0f

    .line 588
    .line 589
    const v16, -0x4119999a    # -0.45f

    .line 590
    .line 591
    .line 592
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    const/high16 v0, 0x40400000    # 3.0f

    .line 596
    .line 597
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const/high16 v17, 0x41a80000    # 21.0f

    .line 601
    .line 602
    const/high16 v18, 0x40000000    # 2.0f

    .line 603
    .line 604
    const/high16 v13, 0x41b00000    # 22.0f

    .line 605
    .line 606
    const v14, 0x401ccccd    # 2.45f

    .line 607
    .line 608
    .line 609
    const v15, 0x41ac6666    # 21.55f

    .line 610
    .line 611
    .line 612
    const/high16 v16, 0x40000000    # 2.0f

    .line 613
    .line 614
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const v0, 0x41a13333    # 20.15f

    .line 621
    .line 622
    .line 623
    const v2, 0x40bb3333    # 5.85f

    .line 624
    .line 625
    .line 626
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const v0, -0x405c28f6    # -1.28f

    .line 630
    .line 631
    .line 632
    const v2, 0x3fa51eb8    # 1.29f

    .line 633
    .line 634
    .line 635
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const v17, -0x40a66666    # -0.85f

    .line 639
    .line 640
    .line 641
    const v18, -0x414ccccd    # -0.35f

    .line 642
    .line 643
    .line 644
    const v13, -0x416147ae    # -0.31f

    .line 645
    .line 646
    .line 647
    const v14, 0x3ea3d70a    # 0.32f

    .line 648
    .line 649
    .line 650
    const v15, -0x40a66666    # -0.85f

    .line 651
    .line 652
    .line 653
    const v16, 0x3db851ec    # 0.09f

    .line 654
    .line 655
    .line 656
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    const/high16 v0, 0x40c80000    # 6.25f

    .line 660
    .line 661
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const v0, -0x3fcf5c29    # -2.76f

    .line 665
    .line 666
    .line 667
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const/high16 v17, -0x40c00000    # -0.75f

    .line 671
    .line 672
    const/high16 v18, -0x40c00000    # -0.75f

    .line 673
    .line 674
    const v13, -0x412e147b    # -0.41f

    .line 675
    .line 676
    .line 677
    const/4 v14, 0x0

    .line 678
    const/high16 v15, -0x40c00000    # -0.75f

    .line 679
    .line 680
    const v16, -0x4151eb85    # -0.34f

    .line 681
    .line 682
    .line 683
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 684
    .line 685
    .line 686
    const v0, 0x3eae147b    # 0.34f

    .line 687
    .line 688
    .line 689
    const/high16 v2, -0x40c00000    # -0.75f

    .line 690
    .line 691
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 692
    .line 693
    .line 694
    const v0, 0x4030a3d7    # 2.76f

    .line 695
    .line 696
    .line 697
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    const v0, 0x4086b852    # 4.21f

    .line 701
    .line 702
    .line 703
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    const v17, 0x3f59999a    # 0.85f

    .line 707
    .line 708
    .line 709
    const v18, -0x414ccccd    # -0.35f

    .line 710
    .line 711
    .line 712
    const/4 v13, 0x0

    .line 713
    const v14, -0x4119999a    # -0.45f

    .line 714
    .line 715
    .line 716
    const v15, 0x3f0a3d71    # 0.54f

    .line 717
    .line 718
    .line 719
    const v16, -0x40d47ae1    # -0.67f

    .line 720
    .line 721
    .line 722
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 723
    .line 724
    .line 725
    const v0, 0x3fa3d70a    # 1.28f

    .line 726
    .line 727
    .line 728
    const v2, 0x3fa51eb8    # 1.29f

    .line 729
    .line 730
    .line 731
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    const v17, 0x41a13333    # 20.15f

    .line 735
    .line 736
    .line 737
    const v18, 0x40bb3333    # 5.85f

    .line 738
    .line 739
    .line 740
    const v13, 0x41a2b852    # 20.34f

    .line 741
    .line 742
    .line 743
    const v14, 0x40aae148    # 5.34f

    .line 744
    .line 745
    .line 746
    const v15, 0x41a2b852    # 20.34f

    .line 747
    .line 748
    .line 749
    const v16, 0x40b51eb8    # 5.66f

    .line 750
    .line 751
    .line 752
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 753
    .line 754
    .line 755
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 756
    .line 757
    .line 758
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 759
    .line 760
    .line 761
    move-result-object v2

    .line 762
    const/16 v16, 0x3800

    .line 763
    .line 764
    const/16 v17, 0x0

    .line 765
    .line 766
    const/high16 v6, 0x3f800000    # 1.0f

    .line 767
    .line 768
    const/high16 v8, 0x3f800000    # 1.0f

    .line 769
    .line 770
    const/4 v7, 0x0

    .line 771
    const/high16 v9, 0x3f800000    # 1.0f

    .line 772
    .line 773
    const/high16 v12, 0x3f800000    # 1.0f

    .line 774
    .line 775
    const/4 v13, 0x0

    .line 776
    const/4 v14, 0x0

    .line 777
    const/4 v15, 0x0

    .line 778
    const-string v4, ""

    .line 779
    .line 780
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 781
    .line 782
    .line 783
    move-result-object v0

    .line 784
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 785
    .line 786
    .line 787
    move-result-object v0

    .line 788
    sput-object v0, Landroidx/compose/material/icons/rounded/FollowTheSignsKt;->_followTheSigns:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 789
    .line 790
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 791
    .line 792
    .line 793
    return-object v0
.end method

.method public static synthetic getFollowTheSigns$annotations(Landroidx/compose/material/icons/Icons$Rounded;)V
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        message = "Use the AutoMirrored version at Icons.AutoMirrored.Rounded.FollowTheSigns"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "Icons.AutoMirrored.Rounded.FollowTheSigns"
            imports = {
                "androidx.compose.material.icons.automirrored.rounded.FollowTheSigns"
            }
        .end subannotation
    .end annotation

    return-void
.end method
