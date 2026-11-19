.class public final Landroidx/compose/material/icons/twotone/SocialDistanceKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_socialDistance",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SocialDistance",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getSocialDistance",
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
        "SMAP\nSocialDistance.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocialDistance.kt\nandroidx/compose/material/icons/twotone/SocialDistanceKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,79:1\n212#2,12:80\n233#2,18:93\n253#2:130\n174#3:92\n705#4,2:111\n717#4,2:113\n719#4,11:119\n72#5,4:115\n*S KotlinDebug\n*F\n+ 1 SocialDistance.kt\nandroidx/compose/material/icons/twotone/SocialDistanceKt\n*L\n29#1:80,12\n30#1:93,18\n30#1:130\n29#1:92\n30#1:111,2\n30#1:113,2\n30#1:119,11\n30#1:115,4\n*E\n"
    }
.end annotation


# static fields
.field private static _socialDistance:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSocialDistance(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/SocialDistanceKt;->_socialDistance:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.SocialDistance"

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
    const/high16 v2, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x40000000    # 2.0f

    .line 78
    .line 79
    const/high16 v18, -0x40000000    # -2.0f

    .line 80
    .line 81
    const/4 v13, 0x0

    .line 82
    const v14, -0x40733333    # -1.1f

    .line 83
    .line 84
    .line 85
    const v15, 0x3f666666    # 0.9f

    .line 86
    .line 87
    .line 88
    const/high16 v16, -0x40000000    # -2.0f

    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, 0x3f666666    # 0.9f

    .line 94
    .line 95
    .line 96
    const/high16 v2, 0x40000000    # 2.0f

    .line 97
    .line 98
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v17, -0x40000000    # -2.0f

    .line 102
    .line 103
    const/high16 v18, 0x40000000    # 2.0f

    .line 104
    .line 105
    const v14, 0x3f8ccccd    # 1.1f

    .line 106
    .line 107
    .line 108
    const v15, -0x4099999a    # -0.9f

    .line 109
    .line 110
    .line 111
    const/high16 v16, 0x40000000    # 2.0f

    .line 112
    .line 113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v0, 0x40c33333    # 6.1f

    .line 117
    .line 118
    .line 119
    const/high16 v2, 0x40a00000    # 5.0f

    .line 120
    .line 121
    const/high16 v4, 0x40800000    # 4.0f

    .line 122
    .line 123
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v0, 0x410c7ae1    # 8.78f

    .line 130
    .line 131
    .line 132
    const v2, 0x410947ae    # 8.58f

    .line 133
    .line 134
    .line 135
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v17, 0x40c00000    # 6.0f

    .line 139
    .line 140
    const/high16 v18, 0x41000000    # 8.0f

    .line 141
    .line 142
    const v13, 0x40fdc28f    # 7.93f

    .line 143
    .line 144
    .line 145
    const v14, 0x41035c29    # 8.21f

    .line 146
    .line 147
    .line 148
    const v15, 0x40dfae14    # 6.99f

    .line 149
    .line 150
    .line 151
    const/high16 v16, 0x41000000    # 8.0f

    .line 152
    .line 153
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v0, 0x41035c29    # 8.21f

    .line 157
    .line 158
    .line 159
    const v2, 0x404e147b    # 3.22f

    .line 160
    .line 161
    .line 162
    const v4, 0x410947ae    # 8.58f

    .line 163
    .line 164
    .line 165
    const v6, 0x40823d71    # 4.07f

    .line 166
    .line 167
    .line 168
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v17, 0x40000000    # 2.0f

    .line 172
    .line 173
    const v18, 0x4126e148    # 10.43f

    .line 174
    .line 175
    .line 176
    const v13, 0x401eb852    # 2.48f

    .line 177
    .line 178
    .line 179
    const v14, 0x410e6666    # 8.9f

    .line 180
    .line 181
    .line 182
    const/high16 v15, 0x40000000    # 2.0f

    .line 183
    .line 184
    const v16, 0x4119eb85    # 9.62f

    .line 185
    .line 186
    .line 187
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v0, 0x41300000    # 11.0f

    .line 191
    .line 192
    const/high16 v2, 0x40000000    # 2.0f

    .line 193
    .line 194
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v0, 0x41000000    # 8.0f

    .line 198
    .line 199
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v0, -0x40ee147b    # -0.57f

    .line 203
    .line 204
    .line 205
    const/4 v2, 0x0

    .line 206
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v17, 0x410c7ae1    # 8.78f

    .line 210
    .line 211
    .line 212
    const v18, 0x410947ae    # 8.58f

    .line 213
    .line 214
    .line 215
    const/high16 v13, 0x41200000    # 10.0f

    .line 216
    .line 217
    const v14, 0x4119eb85    # 9.62f

    .line 218
    .line 219
    .line 220
    const v15, 0x411851ec    # 9.52f

    .line 221
    .line 222
    .line 223
    const v16, 0x410e6666    # 8.9f

    .line 224
    .line 225
    .line 226
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v0, 0x41900000    # 18.0f

    .line 233
    .line 234
    const/high16 v2, 0x40e00000    # 7.0f

    .line 235
    .line 236
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/high16 v17, 0x40000000    # 2.0f

    .line 240
    .line 241
    const/high16 v18, -0x40000000    # -2.0f

    .line 242
    .line 243
    const v13, 0x3f8ccccd    # 1.1f

    .line 244
    .line 245
    .line 246
    const/4 v14, 0x0

    .line 247
    const/high16 v15, 0x40000000    # 2.0f

    .line 248
    .line 249
    const v16, -0x4099999a    # -0.9f

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v17, -0x40000000    # -2.0f

    .line 256
    .line 257
    const/4 v13, 0x0

    .line 258
    const v14, -0x40733333    # -1.1f

    .line 259
    .line 260
    .line 261
    const v15, -0x4099999a    # -0.9f

    .line 262
    .line 263
    .line 264
    const/high16 v16, -0x40000000    # -2.0f

    .line 265
    .line 266
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/high16 v0, -0x40000000    # -2.0f

    .line 270
    .line 271
    const v2, 0x3f666666    # 0.9f

    .line 272
    .line 273
    .line 274
    const/high16 v4, 0x40000000    # 2.0f

    .line 275
    .line 276
    invoke-virtual {v12, v0, v2, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const/high16 v17, 0x41900000    # 18.0f

    .line 280
    .line 281
    const/high16 v18, 0x40e00000    # 7.0f

    .line 282
    .line 283
    const/high16 v13, 0x41800000    # 16.0f

    .line 284
    .line 285
    const v14, 0x40c33333    # 6.1f

    .line 286
    .line 287
    .line 288
    const v15, 0x41873333    # 16.9f

    .line 289
    .line 290
    .line 291
    const/high16 v16, 0x40e00000    # 7.0f

    .line 292
    .line 293
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v0, 0x41a63d71    # 20.78f

    .line 300
    .line 301
    .line 302
    const v2, 0x410947ae    # 8.58f

    .line 303
    .line 304
    .line 305
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v18, 0x41000000    # 8.0f

    .line 309
    .line 310
    const v13, 0x419f70a4    # 19.93f

    .line 311
    .line 312
    .line 313
    const v14, 0x41035c29    # 8.21f

    .line 314
    .line 315
    .line 316
    const v15, 0x4197eb85    # 18.99f

    .line 317
    .line 318
    .line 319
    const/high16 v16, 0x41000000    # 8.0f

    .line 320
    .line 321
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v17, -0x3fce147b    # -2.78f

    .line 325
    .line 326
    .line 327
    const v18, 0x3f147ae1    # 0.58f

    .line 328
    .line 329
    .line 330
    const v13, -0x40828f5c    # -0.99f

    .line 331
    .line 332
    .line 333
    const/4 v14, 0x0

    .line 334
    const v15, -0x4008f5c3    # -1.93f

    .line 335
    .line 336
    .line 337
    const v16, 0x3e570a3d    # 0.21f

    .line 338
    .line 339
    .line 340
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const/high16 v17, 0x41600000    # 14.0f

    .line 344
    .line 345
    const v18, 0x4126e148    # 10.43f

    .line 346
    .line 347
    .line 348
    const v13, 0x4167ae14    # 14.48f

    .line 349
    .line 350
    .line 351
    const v14, 0x410e6666    # 8.9f

    .line 352
    .line 353
    .line 354
    const/high16 v15, 0x41600000    # 14.0f

    .line 355
    .line 356
    const v16, 0x4119eb85    # 9.62f

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v0, 0x41600000    # 14.0f

    .line 363
    .line 364
    const/high16 v2, 0x41300000    # 11.0f

    .line 365
    .line 366
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const/high16 v0, 0x41000000    # 8.0f

    .line 370
    .line 371
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v0, -0x40ee147b    # -0.57f

    .line 375
    .line 376
    .line 377
    const/4 v2, 0x0

    .line 378
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v17, 0x41a63d71    # 20.78f

    .line 382
    .line 383
    .line 384
    const v18, 0x410947ae    # 8.58f

    .line 385
    .line 386
    .line 387
    const/high16 v13, 0x41b00000    # 22.0f

    .line 388
    .line 389
    const v14, 0x4119eb85    # 9.62f

    .line 390
    .line 391
    .line 392
    const v15, 0x41ac28f6    # 21.52f

    .line 393
    .line 394
    .line 395
    const v16, 0x410e6666    # 8.9f

    .line 396
    .line 397
    .line 398
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const/high16 v0, 0x41880000    # 17.0f

    .line 405
    .line 406
    const/high16 v2, 0x41b00000    # 22.0f

    .line 407
    .line 408
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const/high16 v0, -0x3f800000    # -4.0f

    .line 412
    .line 413
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const/high16 v0, 0x40400000    # 3.0f

    .line 417
    .line 418
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v0, 0x40c00000    # 6.0f

    .line 422
    .line 423
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 427
    .line 428
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v0, -0x3f800000    # -4.0f

    .line 432
    .line 433
    const/high16 v2, 0x40800000    # 4.0f

    .line 434
    .line 435
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const/high16 v0, 0x40800000    # 4.0f

    .line 439
    .line 440
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 444
    .line 445
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/high16 v0, 0x41400000    # 12.0f

    .line 449
    .line 450
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v0, 0x40400000    # 3.0f

    .line 454
    .line 455
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const/high16 v0, 0x41880000    # 17.0f

    .line 459
    .line 460
    const/high16 v2, 0x41b00000    # 22.0f

    .line 461
    .line 462
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 469
    .line 470
    .line 471
    move-result-object v2

    .line 472
    const/16 v16, 0x3800

    .line 473
    .line 474
    const/16 v17, 0x0

    .line 475
    .line 476
    const/high16 v6, 0x3f800000    # 1.0f

    .line 477
    .line 478
    const/high16 v8, 0x3f800000    # 1.0f

    .line 479
    .line 480
    const/4 v7, 0x0

    .line 481
    const/high16 v9, 0x3f800000    # 1.0f

    .line 482
    .line 483
    const/high16 v12, 0x3f800000    # 1.0f

    .line 484
    .line 485
    const/4 v13, 0x0

    .line 486
    const/4 v14, 0x0

    .line 487
    const/4 v15, 0x0

    .line 488
    const-string v4, ""

    .line 489
    .line 490
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    sput-object v0, Landroidx/compose/material/icons/twotone/SocialDistanceKt;->_socialDistance:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 499
    .line 500
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 501
    .line 502
    .line 503
    return-object v0
.end method
