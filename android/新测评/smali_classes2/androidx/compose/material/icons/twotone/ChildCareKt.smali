.class public final Landroidx/compose/material/icons/twotone/ChildCareKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_childCare",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "ChildCare",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getChildCare",
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
        "SMAP\nChildCare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChildCare.kt\nandroidx/compose/material/icons/twotone/ChildCareKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,127:1\n212#2,12:128\n233#2,18:141\n253#2:178\n233#2,18:179\n253#2:216\n233#2,18:217\n253#2:254\n233#2,18:255\n253#2:292\n174#3:140\n705#4,2:159\n717#4,2:161\n719#4,11:167\n705#4,2:197\n717#4,2:199\n719#4,11:205\n705#4,2:235\n717#4,2:237\n719#4,11:243\n705#4,2:273\n717#4,2:275\n719#4,11:281\n72#5,4:163\n72#5,4:201\n72#5,4:239\n72#5,4:277\n*S KotlinDebug\n*F\n+ 1 ChildCare.kt\nandroidx/compose/material/icons/twotone/ChildCareKt\n*L\n29#1:128,12\n30#1:141,18\n30#1:178\n67#1:179,18\n67#1:216\n73#1:217,18\n73#1:254\n79#1:255,18\n79#1:292\n29#1:140\n30#1:159,2\n30#1:161,2\n30#1:167,11\n67#1:197,2\n67#1:199,2\n67#1:205,11\n73#1:235,2\n73#1:237,2\n73#1:243,11\n79#1:273,2\n79#1:275,2\n79#1:281,11\n30#1:163,4\n67#1:201,4\n73#1:239,4\n79#1:277,4\n*E\n"
    }
.end annotation


# static fields
.field private static _childCare:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getChildCare(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/ChildCareKt;->_childCare:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.ChildCare"

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
    const/high16 v4, 0x41200000    # 10.0f

    .line 71
    .line 72
    const/high16 v6, 0x41980000    # 19.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v25, -0x416b851f    # -0.29f

    .line 78
    .line 79
    .line 80
    const v26, 0x3cf5c28f    # 0.03f

    .line 81
    .line 82
    .line 83
    const v21, -0x42333333    # -0.1f

    .line 84
    .line 85
    .line 86
    const/16 v22, 0x0

    .line 87
    .line 88
    const v23, -0x41bd70a4    # -0.19f

    .line 89
    .line 90
    .line 91
    const v24, 0x3ca3d70a    # 0.02f

    .line 92
    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v25, -0x40a3d70a    # -0.86f

    .line 100
    .line 101
    .line 102
    const v26, -0x4011eb85    # -1.86f

    .line 103
    .line 104
    .line 105
    const v21, -0x41b33333    # -0.2f

    .line 106
    .line 107
    .line 108
    const v22, -0x40d47ae1    # -0.67f

    .line 109
    .line 110
    .line 111
    const v23, -0x41051eb8    # -0.49f

    .line 112
    .line 113
    .line 114
    const v24, -0x405ae148    # -1.29f

    .line 115
    .line 116
    .line 117
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v25, 0x41400000    # 12.0f

    .line 121
    .line 122
    const/high16 v26, 0x40a00000    # 5.0f

    .line 123
    .line 124
    const v21, 0x4184cccd    # 16.6f

    .line 125
    .line 126
    .line 127
    const v22, 0x40c851ec    # 6.26f

    .line 128
    .line 129
    .line 130
    const v23, 0x41673333    # 14.45f

    .line 131
    .line 132
    .line 133
    const/high16 v24, 0x40a00000    # 5.0f

    .line 134
    .line 135
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v4, 0x40c4cccd    # 6.15f

    .line 139
    .line 140
    .line 141
    const v6, 0x4102b852    # 8.17f

    .line 142
    .line 143
    .line 144
    const v7, 0x40eccccd    # 7.4f

    .line 145
    .line 146
    .line 147
    const v8, 0x40c851ec    # 6.26f

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v25, -0x40a3d70a    # -0.86f

    .line 154
    .line 155
    .line 156
    const v26, 0x3fee147b    # 1.86f

    .line 157
    .line 158
    .line 159
    const v21, -0x41428f5c    # -0.37f

    .line 160
    .line 161
    .line 162
    const v22, 0x3f11eb85    # 0.57f

    .line 163
    .line 164
    .line 165
    const v23, -0x40d70a3d    # -0.66f

    .line 166
    .line 167
    .line 168
    const v24, 0x3f9851ec    # 1.19f

    .line 169
    .line 170
    .line 171
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v25, -0x416b851f    # -0.29f

    .line 175
    .line 176
    .line 177
    const v26, -0x430a3d71    # -0.03f

    .line 178
    .line 179
    .line 180
    const v21, -0x42333333    # -0.1f

    .line 181
    .line 182
    .line 183
    const v22, -0x43dc28f6    # -0.01f

    .line 184
    .line 185
    .line 186
    const v23, -0x41bd70a4    # -0.19f

    .line 187
    .line 188
    .line 189
    const v24, -0x430a3d71    # -0.03f

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v25, -0x40000000    # -2.0f

    .line 196
    .line 197
    const/high16 v26, 0x40000000    # 2.0f

    .line 198
    .line 199
    const v21, -0x40733333    # -1.1f

    .line 200
    .line 201
    .line 202
    const/16 v22, 0x0

    .line 203
    .line 204
    const/high16 v23, -0x40000000    # -2.0f

    .line 205
    .line 206
    const v24, 0x3f666666    # 0.9f

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v4, 0x3f666666    # 0.9f

    .line 213
    .line 214
    .line 215
    const/high16 v6, 0x40000000    # 2.0f

    .line 216
    .line 217
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v25, 0x3e947ae1    # 0.29f

    .line 221
    .line 222
    .line 223
    const v26, -0x430a3d71    # -0.03f

    .line 224
    .line 225
    .line 226
    const v21, 0x3dcccccd    # 0.1f

    .line 227
    .line 228
    .line 229
    const v23, 0x3e428f5c    # 0.19f

    .line 230
    .line 231
    .line 232
    const v24, -0x435c28f6    # -0.02f

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v25, 0x3f5c28f6    # 0.86f

    .line 239
    .line 240
    .line 241
    const v26, 0x3fee147b    # 1.86f

    .line 242
    .line 243
    .line 244
    const v21, 0x3e4ccccd    # 0.2f

    .line 245
    .line 246
    .line 247
    const v22, 0x3f2b851f    # 0.67f

    .line 248
    .line 249
    .line 250
    const v23, 0x3efae148    # 0.49f

    .line 251
    .line 252
    .line 253
    const v24, 0x3fa51eb8    # 1.29f

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v25, 0x41400000    # 12.0f

    .line 260
    .line 261
    const/high16 v26, 0x41980000    # 19.0f

    .line 262
    .line 263
    const v21, 0x40eccccd    # 7.4f

    .line 264
    .line 265
    .line 266
    const v22, 0x418deb85    # 17.74f

    .line 267
    .line 268
    .line 269
    const v23, 0x4118cccd    # 9.55f

    .line 270
    .line 271
    .line 272
    const/high16 v24, 0x41980000    # 19.0f

    .line 273
    .line 274
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v4, -0x3fb51eb8    # -3.17f

    .line 278
    .line 279
    .line 280
    const v6, 0x40bb3333    # 5.85f

    .line 281
    .line 282
    .line 283
    const v7, -0x405eb852    # -1.26f

    .line 284
    .line 285
    .line 286
    const v8, 0x40933333    # 4.6f

    .line 287
    .line 288
    .line 289
    invoke-virtual {v2, v8, v7, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v25, 0x3f5c28f6    # 0.86f

    .line 293
    .line 294
    .line 295
    const v26, -0x4011eb85    # -1.86f

    .line 296
    .line 297
    .line 298
    const v21, 0x3ebd70a4    # 0.37f

    .line 299
    .line 300
    .line 301
    const v22, -0x40ee147b    # -0.57f

    .line 302
    .line 303
    .line 304
    const v23, 0x3f28f5c3    # 0.66f

    .line 305
    .line 306
    .line 307
    const v24, -0x4067ae14    # -1.19f

    .line 308
    .line 309
    .line 310
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v25, 0x3e947ae1    # 0.29f

    .line 314
    .line 315
    .line 316
    const v26, 0x3cf5c28f    # 0.03f

    .line 317
    .line 318
    .line 319
    const v21, 0x3dcccccd    # 0.1f

    .line 320
    .line 321
    .line 322
    const v22, 0x3c23d70a    # 0.01f

    .line 323
    .line 324
    .line 325
    const v23, 0x3e428f5c    # 0.19f

    .line 326
    .line 327
    .line 328
    const v24, 0x3cf5c28f    # 0.03f

    .line 329
    .line 330
    .line 331
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const/high16 v25, 0x40000000    # 2.0f

    .line 335
    .line 336
    const/high16 v26, -0x40000000    # -2.0f

    .line 337
    .line 338
    const v21, 0x3f8ccccd    # 1.1f

    .line 339
    .line 340
    .line 341
    const/16 v22, 0x0

    .line 342
    .line 343
    const/high16 v23, 0x40000000    # 2.0f

    .line 344
    .line 345
    const v24, -0x4099999a    # -0.9f

    .line 346
    .line 347
    .line 348
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v4, -0x4099999a    # -0.9f

    .line 352
    .line 353
    .line 354
    const/high16 v6, -0x40000000    # -2.0f

    .line 355
    .line 356
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v4, 0x41140000    # 9.25f

    .line 363
    .line 364
    const/high16 v6, 0x41680000    # 14.5f

    .line 365
    .line 366
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const/high16 v25, 0x3fa00000    # 1.25f

    .line 370
    .line 371
    const/high16 v26, 0x3fa00000    # 1.25f

    .line 372
    .line 373
    const v21, 0x3f30a3d7    # 0.69f

    .line 374
    .line 375
    .line 376
    const/high16 v23, 0x3fa00000    # 1.25f

    .line 377
    .line 378
    const v24, 0x3f0f5c29    # 0.56f

    .line 379
    .line 380
    .line 381
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const v4, -0x40f0a3d7    # -0.56f

    .line 385
    .line 386
    .line 387
    const/high16 v6, 0x3fa00000    # 1.25f

    .line 388
    .line 389
    const/high16 v7, -0x40600000    # -1.25f

    .line 390
    .line 391
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/high16 v6, -0x40600000    # -1.25f

    .line 395
    .line 396
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const v4, 0x3f0f5c29    # 0.56f

    .line 400
    .line 401
    .line 402
    const/high16 v6, 0x3fa00000    # 1.25f

    .line 403
    .line 404
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v4, 0x41180000    # 9.5f

    .line 411
    .line 412
    const/high16 v6, 0x41140000    # 9.25f

    .line 413
    .line 414
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v4, -0x40f0a3d7    # -0.56f

    .line 421
    .line 422
    .line 423
    const/high16 v6, 0x3fa00000    # 1.25f

    .line 424
    .line 425
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v6, -0x40600000    # -1.25f

    .line 429
    .line 430
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v4, 0x3f0f5c29    # 0.56f

    .line 434
    .line 435
    .line 436
    const/high16 v6, 0x3fa00000    # 1.25f

    .line 437
    .line 438
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const/high16 v4, 0x41880000    # 17.0f

    .line 445
    .line 446
    const/high16 v6, 0x41400000    # 12.0f

    .line 447
    .line 448
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const/high16 v25, -0x3f700000    # -4.5f

    .line 452
    .line 453
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 454
    .line 455
    const v21, -0x3fff5c29    # -2.01f

    .line 456
    .line 457
    .line 458
    const v23, -0x3f90a3d7    # -3.74f

    .line 459
    .line 460
    .line 461
    const v24, -0x40628f5c    # -1.23f

    .line 462
    .line 463
    .line 464
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const/high16 v4, 0x41100000    # 9.0f

    .line 468
    .line 469
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const/high16 v26, 0x40400000    # 3.0f

    .line 473
    .line 474
    const v21, -0x40bd70a4    # -0.76f

    .line 475
    .line 476
    .line 477
    const v22, 0x3fe28f5c    # 1.77f

    .line 478
    .line 479
    .line 480
    const v23, -0x3fe0a3d7    # -2.49f

    .line 481
    .line 482
    .line 483
    const/high16 v24, 0x40400000    # 3.0f

    .line 484
    .line 485
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 492
    .line 493
    .line 494
    move-result-object v2

    .line 495
    const/16 v16, 0x3800

    .line 496
    .line 497
    const/16 v17, 0x0

    .line 498
    .line 499
    const v6, 0x3e99999a    # 0.3f

    .line 500
    .line 501
    .line 502
    const v8, 0x3e99999a    # 0.3f

    .line 503
    .line 504
    .line 505
    const/4 v7, 0x0

    .line 506
    const/high16 v9, 0x3f800000    # 1.0f

    .line 507
    .line 508
    const/high16 v12, 0x3f800000    # 1.0f

    .line 509
    .line 510
    const/4 v13, 0x0

    .line 511
    const/4 v14, 0x0

    .line 512
    const/4 v15, 0x0

    .line 513
    const-string v4, ""

    .line 514
    .line 515
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 516
    .line 517
    .line 518
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 519
    .line 520
    .line 521
    move-result v3

    .line 522
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 523
    .line 524
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 525
    .line 526
    .line 527
    move-result-wide v6

    .line 528
    const/4 v2, 0x0

    .line 529
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 530
    .line 531
    .line 532
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 533
    .line 534
    .line 535
    move-result v10

    .line 536
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 537
    .line 538
    .line 539
    move-result v11

    .line 540
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 543
    .line 544
    .line 545
    const/high16 v4, 0x41280000    # 10.5f

    .line 546
    .line 547
    const/high16 v6, 0x41680000    # 14.5f

    .line 548
    .line 549
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const/4 v4, 0x0

    .line 553
    const/high16 v6, -0x40600000    # -1.25f

    .line 554
    .line 555
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const/high16 v26, 0x40200000    # 2.5f

    .line 559
    .line 560
    const/16 v27, 0x0

    .line 561
    .line 562
    const/high16 v21, 0x3fa00000    # 1.25f

    .line 563
    .line 564
    const/high16 v22, 0x3fa00000    # 1.25f

    .line 565
    .line 566
    const/16 v23, 0x0

    .line 567
    .line 568
    const/16 v24, 0x1

    .line 569
    .line 570
    const/16 v25, 0x1

    .line 571
    .line 572
    move-object/from16 v20, v2

    .line 573
    .line 574
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 578
    .line 579
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 583
    .line 584
    .line 585
    move-result-object v2

    .line 586
    const/high16 v6, 0x3f800000    # 1.0f

    .line 587
    .line 588
    const/high16 v8, 0x3f800000    # 1.0f

    .line 589
    .line 590
    const/4 v7, 0x0

    .line 591
    const-string v4, ""

    .line 592
    .line 593
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 594
    .line 595
    .line 596
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 597
    .line 598
    .line 599
    move-result v3

    .line 600
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 601
    .line 602
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 603
    .line 604
    .line 605
    move-result-wide v6

    .line 606
    const/4 v2, 0x0

    .line 607
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 608
    .line 609
    .line 610
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 611
    .line 612
    .line 613
    move-result v10

    .line 614
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 615
    .line 616
    .line 617
    move-result v11

    .line 618
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 621
    .line 622
    .line 623
    const/high16 v4, 0x41280000    # 10.5f

    .line 624
    .line 625
    const/high16 v6, 0x41180000    # 9.5f

    .line 626
    .line 627
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    const/4 v4, 0x0

    .line 631
    const/high16 v6, -0x40600000    # -1.25f

    .line 632
    .line 633
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const/high16 v26, 0x40200000    # 2.5f

    .line 637
    .line 638
    move-object/from16 v20, v2

    .line 639
    .line 640
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 644
    .line 645
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 649
    .line 650
    .line 651
    move-result-object v2

    .line 652
    const/high16 v6, 0x3f800000    # 1.0f

    .line 653
    .line 654
    const/4 v7, 0x0

    .line 655
    const-string v4, ""

    .line 656
    .line 657
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 658
    .line 659
    .line 660
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 661
    .line 662
    .line 663
    move-result v3

    .line 664
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 665
    .line 666
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 667
    .line 668
    .line 669
    move-result-wide v6

    .line 670
    const/4 v0, 0x0

    .line 671
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 672
    .line 673
    .line 674
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 675
    .line 676
    .line 677
    move-result v10

    .line 678
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 679
    .line 680
    .line 681
    move-result v11

    .line 682
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 683
    .line 684
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 685
    .line 686
    .line 687
    const/high16 v0, 0x41880000    # 17.0f

    .line 688
    .line 689
    const/high16 v2, 0x41400000    # 12.0f

    .line 690
    .line 691
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 692
    .line 693
    .line 694
    const/high16 v17, 0x40900000    # 4.5f

    .line 695
    .line 696
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 697
    .line 698
    const v13, 0x4000a3d7    # 2.01f

    .line 699
    .line 700
    .line 701
    const v15, 0x406f5c29    # 3.74f

    .line 702
    .line 703
    .line 704
    const v16, -0x40628f5c    # -1.23f

    .line 705
    .line 706
    .line 707
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    const/high16 v0, -0x3ef00000    # -9.0f

    .line 711
    .line 712
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 713
    .line 714
    .line 715
    const/high16 v18, 0x40400000    # 3.0f

    .line 716
    .line 717
    const v13, 0x3f428f5c    # 0.76f

    .line 718
    .line 719
    .line 720
    const v14, 0x3fe28f5c    # 1.77f

    .line 721
    .line 722
    .line 723
    const v15, 0x401f5c29    # 2.49f

    .line 724
    .line 725
    .line 726
    const/high16 v16, 0x40400000    # 3.0f

    .line 727
    .line 728
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    const v0, 0x41b7851f    # 22.94f

    .line 735
    .line 736
    .line 737
    const v2, 0x413570a4    # 11.34f

    .line 738
    .line 739
    .line 740
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 741
    .line 742
    .line 743
    const v17, -0x3fcc28f6    # -2.81f

    .line 744
    .line 745
    .line 746
    const v18, -0x3fb51eb8    # -3.17f

    .line 747
    .line 748
    .line 749
    const/high16 v13, -0x41800000    # -0.25f

    .line 750
    .line 751
    const v14, -0x403eb852    # -1.51f

    .line 752
    .line 753
    .line 754
    const v15, -0x4051eb85    # -1.36f

    .line 755
    .line 756
    .line 757
    const v16, -0x3fd0a3d7    # -2.74f

    .line 758
    .line 759
    .line 760
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 761
    .line 762
    .line 763
    const v17, -0x3ff3d70a    # -2.19f

    .line 764
    .line 765
    .line 766
    const v18, -0x3fc5c28f    # -2.91f

    .line 767
    .line 768
    .line 769
    const v13, -0x40f851ec    # -0.53f

    .line 770
    .line 771
    .line 772
    const v14, -0x4070a3d7    # -1.12f

    .line 773
    .line 774
    .line 775
    const v15, -0x405c28f6    # -1.28f

    .line 776
    .line 777
    .line 778
    const v16, -0x3ff9999a    # -2.1f

    .line 779
    .line 780
    .line 781
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 782
    .line 783
    .line 784
    const/high16 v17, 0x41400000    # 12.0f

    .line 785
    .line 786
    const/high16 v18, 0x40400000    # 3.0f

    .line 787
    .line 788
    const v13, 0x4182e148    # 16.36f

    .line 789
    .line 790
    .line 791
    const v14, 0x40766666    # 3.85f

    .line 792
    .line 793
    .line 794
    const v15, 0x41647ae1    # 14.28f

    .line 795
    .line 796
    .line 797
    const/high16 v16, 0x40400000    # 3.0f

    .line 798
    .line 799
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 800
    .line 801
    .line 802
    const v0, -0x3f41eb85    # -5.94f

    .line 803
    .line 804
    .line 805
    const v2, 0x4010a3d7    # 2.26f

    .line 806
    .line 807
    .line 808
    const v4, -0x3f747ae1    # -4.36f

    .line 809
    .line 810
    .line 811
    const v6, 0x3f59999a    # 0.85f

    .line 812
    .line 813
    .line 814
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 815
    .line 816
    .line 817
    const v17, -0x3ff3d70a    # -2.19f

    .line 818
    .line 819
    .line 820
    const v18, 0x403a3d71    # 2.91f

    .line 821
    .line 822
    .line 823
    const v13, -0x40947ae1    # -0.92f

    .line 824
    .line 825
    .line 826
    const v14, 0x3f4f5c29    # 0.81f

    .line 827
    .line 828
    .line 829
    const v15, -0x402a3d71    # -1.67f

    .line 830
    .line 831
    .line 832
    const v16, 0x3fe66666    # 1.8f

    .line 833
    .line 834
    .line 835
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 836
    .line 837
    .line 838
    const v17, -0x3fcc28f6    # -2.81f

    .line 839
    .line 840
    .line 841
    const v18, 0x404ae148    # 3.17f

    .line 842
    .line 843
    .line 844
    const v13, -0x40466666    # -1.45f

    .line 845
    .line 846
    .line 847
    const v14, 0x3edc28f6    # 0.43f

    .line 848
    .line 849
    .line 850
    const v15, -0x3fdc28f6    # -2.56f

    .line 851
    .line 852
    .line 853
    const v16, 0x3fd33333    # 1.65f

    .line 854
    .line 855
    .line 856
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 857
    .line 858
    .line 859
    const v17, -0x428a3d71    # -0.06f

    .line 860
    .line 861
    .line 862
    const v18, 0x3f28f5c3    # 0.66f

    .line 863
    .line 864
    .line 865
    const v13, -0x42dc28f6    # -0.04f

    .line 866
    .line 867
    .line 868
    const v14, 0x3e570a3d    # 0.21f

    .line 869
    .line 870
    .line 871
    const v15, -0x428a3d71    # -0.06f

    .line 872
    .line 873
    .line 874
    const v16, 0x3edc28f6    # 0.43f

    .line 875
    .line 876
    .line 877
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 878
    .line 879
    .line 880
    const v17, 0x3d75c28f    # 0.06f

    .line 881
    .line 882
    .line 883
    const/4 v13, 0x0

    .line 884
    const v14, 0x3e6b851f    # 0.23f

    .line 885
    .line 886
    .line 887
    const v15, 0x3ca3d70a    # 0.02f

    .line 888
    .line 889
    .line 890
    const v16, 0x3ee66666    # 0.45f

    .line 891
    .line 892
    .line 893
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 894
    .line 895
    .line 896
    const v17, 0x4033d70a    # 2.81f

    .line 897
    .line 898
    .line 899
    const v18, 0x404ae148    # 3.17f

    .line 900
    .line 901
    .line 902
    const/high16 v13, 0x3e800000    # 0.25f

    .line 903
    .line 904
    const v14, 0x3fc147ae    # 1.51f

    .line 905
    .line 906
    .line 907
    const v15, 0x3fae147b    # 1.36f

    .line 908
    .line 909
    .line 910
    const v16, 0x402f5c29    # 2.74f

    .line 911
    .line 912
    .line 913
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 914
    .line 915
    .line 916
    const v17, 0x400ae148    # 2.17f

    .line 917
    .line 918
    .line 919
    const v18, 0x4038f5c3    # 2.89f

    .line 920
    .line 921
    .line 922
    const v13, 0x3f051eb8    # 0.52f

    .line 923
    .line 924
    .line 925
    const v14, 0x3f8e147b    # 1.11f

    .line 926
    .line 927
    .line 928
    const v15, 0x3fa28f5c    # 1.27f

    .line 929
    .line 930
    .line 931
    const v16, 0x4005c28f    # 2.09f

    .line 932
    .line 933
    .line 934
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 935
    .line 936
    .line 937
    const/high16 v17, 0x41400000    # 12.0f

    .line 938
    .line 939
    const/high16 v18, 0x41a80000    # 21.0f

    .line 940
    .line 941
    const v13, 0x40f3d70a    # 7.62f

    .line 942
    .line 943
    .line 944
    const v14, 0x41a11eb8    # 20.14f

    .line 945
    .line 946
    .line 947
    const v15, 0x411b5c29    # 9.71f

    .line 948
    .line 949
    .line 950
    const/high16 v16, 0x41a80000    # 21.0f

    .line 951
    .line 952
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 953
    .line 954
    .line 955
    const v0, 0x40bf0a3d    # 5.97f

    .line 956
    .line 957
    .line 958
    const v2, -0x3fee147b    # -2.28f

    .line 959
    .line 960
    .line 961
    const v4, 0x408c28f6    # 4.38f

    .line 962
    .line 963
    .line 964
    const v6, -0x40a3d70a    # -0.86f

    .line 965
    .line 966
    .line 967
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 968
    .line 969
    .line 970
    const v17, 0x400ae148    # 2.17f

    .line 971
    .line 972
    .line 973
    const v18, -0x3fc70a3d    # -2.89f

    .line 974
    .line 975
    .line 976
    const v13, 0x3f666666    # 0.9f

    .line 977
    .line 978
    .line 979
    const v14, -0x40b33333    # -0.8f

    .line 980
    .line 981
    .line 982
    const v15, 0x3fd33333    # 1.65f

    .line 983
    .line 984
    .line 985
    const v16, -0x401ae148    # -1.79f

    .line 986
    .line 987
    .line 988
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 989
    .line 990
    .line 991
    const v17, 0x40333333    # 2.8f

    .line 992
    .line 993
    .line 994
    const v18, -0x3fb51eb8    # -3.17f

    .line 995
    .line 996
    .line 997
    const v13, 0x3fb851ec    # 1.44f

    .line 998
    .line 999
    .line 1000
    const v14, -0x4123d70a    # -0.43f

    .line 1001
    .line 1002
    .line 1003
    const v15, 0x40233333    # 2.55f

    .line 1004
    .line 1005
    .line 1006
    const v16, -0x402ccccd    # -1.65f

    .line 1007
    .line 1008
    .line 1009
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1010
    .line 1011
    .line 1012
    const v17, 0x3d75c28f    # 0.06f

    .line 1013
    .line 1014
    .line 1015
    const v18, -0x40d70a3d    # -0.66f

    .line 1016
    .line 1017
    .line 1018
    const v13, 0x3d23d70a    # 0.04f

    .line 1019
    .line 1020
    .line 1021
    const v14, -0x41a8f5c3    # -0.21f

    .line 1022
    .line 1023
    .line 1024
    const v15, 0x3d75c28f    # 0.06f

    .line 1025
    .line 1026
    .line 1027
    const v16, -0x4123d70a    # -0.43f

    .line 1028
    .line 1029
    .line 1030
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1031
    .line 1032
    .line 1033
    const v17, -0x428a3d71    # -0.06f

    .line 1034
    .line 1035
    .line 1036
    const/4 v13, 0x0

    .line 1037
    const v14, -0x41947ae1    # -0.23f

    .line 1038
    .line 1039
    .line 1040
    const v15, -0x435c28f6    # -0.02f

    .line 1041
    .line 1042
    .line 1043
    const v16, -0x4119999a    # -0.45f

    .line 1044
    .line 1045
    .line 1046
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1047
    .line 1048
    .line 1049
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1050
    .line 1051
    .line 1052
    const/high16 v0, 0x41600000    # 14.0f

    .line 1053
    .line 1054
    const/high16 v2, 0x41980000    # 19.0f

    .line 1055
    .line 1056
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1057
    .line 1058
    .line 1059
    const v17, -0x416b851f    # -0.29f

    .line 1060
    .line 1061
    .line 1062
    const v18, -0x430a3d71    # -0.03f

    .line 1063
    .line 1064
    .line 1065
    const v13, -0x42333333    # -0.1f

    .line 1066
    .line 1067
    .line 1068
    const/4 v14, 0x0

    .line 1069
    const v15, -0x41bd70a4    # -0.19f

    .line 1070
    .line 1071
    .line 1072
    const v16, -0x435c28f6    # -0.02f

    .line 1073
    .line 1074
    .line 1075
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1076
    .line 1077
    .line 1078
    const v17, -0x40a3d70a    # -0.86f

    .line 1079
    .line 1080
    .line 1081
    const v18, 0x3fee147b    # 1.86f

    .line 1082
    .line 1083
    .line 1084
    const v13, -0x41b33333    # -0.2f

    .line 1085
    .line 1086
    .line 1087
    const v14, 0x3f2b851f    # 0.67f

    .line 1088
    .line 1089
    .line 1090
    const v15, -0x41051eb8    # -0.49f

    .line 1091
    .line 1092
    .line 1093
    const v16, 0x3fa51eb8    # 1.29f

    .line 1094
    .line 1095
    .line 1096
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1097
    .line 1098
    .line 1099
    const/high16 v17, 0x41400000    # 12.0f

    .line 1100
    .line 1101
    const/high16 v18, 0x41980000    # 19.0f

    .line 1102
    .line 1103
    const v13, 0x4184cccd    # 16.6f

    .line 1104
    .line 1105
    .line 1106
    const v14, 0x418deb85    # 17.74f

    .line 1107
    .line 1108
    .line 1109
    const v15, 0x41673333    # 14.45f

    .line 1110
    .line 1111
    .line 1112
    const/high16 v16, 0x41980000    # 19.0f

    .line 1113
    .line 1114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1115
    .line 1116
    .line 1117
    const v0, -0x3f6ccccd    # -4.6f

    .line 1118
    .line 1119
    .line 1120
    const v2, -0x3f44cccd    # -5.85f

    .line 1121
    .line 1122
    .line 1123
    const v4, -0x3fb51eb8    # -3.17f

    .line 1124
    .line 1125
    .line 1126
    const v6, -0x405eb852    # -1.26f

    .line 1127
    .line 1128
    .line 1129
    invoke-virtual {v12, v0, v6, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1130
    .line 1131
    .line 1132
    const v17, -0x40a3d70a    # -0.86f

    .line 1133
    .line 1134
    .line 1135
    const v18, -0x4011eb85    # -1.86f

    .line 1136
    .line 1137
    .line 1138
    const v13, -0x41428f5c    # -0.37f

    .line 1139
    .line 1140
    .line 1141
    const v14, -0x40ee147b    # -0.57f

    .line 1142
    .line 1143
    .line 1144
    const v15, -0x40d70a3d    # -0.66f

    .line 1145
    .line 1146
    .line 1147
    const v16, -0x4067ae14    # -1.19f

    .line 1148
    .line 1149
    .line 1150
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1151
    .line 1152
    .line 1153
    const v17, -0x416b851f    # -0.29f

    .line 1154
    .line 1155
    .line 1156
    const v18, 0x3cf5c28f    # 0.03f

    .line 1157
    .line 1158
    .line 1159
    const v13, -0x42333333    # -0.1f

    .line 1160
    .line 1161
    .line 1162
    const v14, 0x3c23d70a    # 0.01f

    .line 1163
    .line 1164
    .line 1165
    const v15, -0x41bd70a4    # -0.19f

    .line 1166
    .line 1167
    .line 1168
    const v16, 0x3cf5c28f    # 0.03f

    .line 1169
    .line 1170
    .line 1171
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1172
    .line 1173
    .line 1174
    const/high16 v17, -0x40000000    # -2.0f

    .line 1175
    .line 1176
    const/high16 v18, -0x40000000    # -2.0f

    .line 1177
    .line 1178
    const v13, -0x40733333    # -1.1f

    .line 1179
    .line 1180
    .line 1181
    const/4 v14, 0x0

    .line 1182
    const/high16 v15, -0x40000000    # -2.0f

    .line 1183
    .line 1184
    const v16, -0x4099999a    # -0.9f

    .line 1185
    .line 1186
    .line 1187
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1188
    .line 1189
    .line 1190
    const v0, 0x3f666666    # 0.9f

    .line 1191
    .line 1192
    .line 1193
    const/high16 v2, -0x40000000    # -2.0f

    .line 1194
    .line 1195
    const/high16 v4, 0x40000000    # 2.0f

    .line 1196
    .line 1197
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1198
    .line 1199
    .line 1200
    const v17, 0x3e947ae1    # 0.29f

    .line 1201
    .line 1202
    .line 1203
    const v18, 0x3cf5c28f    # 0.03f

    .line 1204
    .line 1205
    .line 1206
    const v13, 0x3dcccccd    # 0.1f

    .line 1207
    .line 1208
    .line 1209
    const v15, 0x3e428f5c    # 0.19f

    .line 1210
    .line 1211
    .line 1212
    const v16, 0x3ca3d70a    # 0.02f

    .line 1213
    .line 1214
    .line 1215
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1216
    .line 1217
    .line 1218
    const v17, 0x3f5c28f6    # 0.86f

    .line 1219
    .line 1220
    .line 1221
    const v18, -0x4011eb85    # -1.86f

    .line 1222
    .line 1223
    .line 1224
    const v13, 0x3e4ccccd    # 0.2f

    .line 1225
    .line 1226
    .line 1227
    const v14, -0x40d47ae1    # -0.67f

    .line 1228
    .line 1229
    .line 1230
    const v15, 0x3efae148    # 0.49f

    .line 1231
    .line 1232
    .line 1233
    const v16, -0x405ae148    # -1.29f

    .line 1234
    .line 1235
    .line 1236
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1237
    .line 1238
    .line 1239
    const/high16 v17, 0x41400000    # 12.0f

    .line 1240
    .line 1241
    const/high16 v18, 0x40a00000    # 5.0f

    .line 1242
    .line 1243
    const v13, 0x40eccccd    # 7.4f

    .line 1244
    .line 1245
    .line 1246
    const v14, 0x40c851ec    # 6.26f

    .line 1247
    .line 1248
    .line 1249
    const v15, 0x4118cccd    # 9.55f

    .line 1250
    .line 1251
    .line 1252
    const/high16 v16, 0x40a00000    # 5.0f

    .line 1253
    .line 1254
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1255
    .line 1256
    .line 1257
    const v0, 0x3fa147ae    # 1.26f

    .line 1258
    .line 1259
    .line 1260
    const v2, 0x404ae148    # 3.17f

    .line 1261
    .line 1262
    .line 1263
    const v4, 0x40bb3333    # 5.85f

    .line 1264
    .line 1265
    .line 1266
    const v6, 0x40933333    # 4.6f

    .line 1267
    .line 1268
    .line 1269
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1270
    .line 1271
    .line 1272
    const v17, 0x3f5c28f6    # 0.86f

    .line 1273
    .line 1274
    .line 1275
    const v18, 0x3fee147b    # 1.86f

    .line 1276
    .line 1277
    .line 1278
    const v13, 0x3ebd70a4    # 0.37f

    .line 1279
    .line 1280
    .line 1281
    const v14, 0x3f11eb85    # 0.57f

    .line 1282
    .line 1283
    .line 1284
    const v15, 0x3f28f5c3    # 0.66f

    .line 1285
    .line 1286
    .line 1287
    const v16, 0x3f9851ec    # 1.19f

    .line 1288
    .line 1289
    .line 1290
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1291
    .line 1292
    .line 1293
    const v17, 0x3e947ae1    # 0.29f

    .line 1294
    .line 1295
    .line 1296
    const v18, -0x430a3d71    # -0.03f

    .line 1297
    .line 1298
    .line 1299
    const v13, 0x3dcccccd    # 0.1f

    .line 1300
    .line 1301
    .line 1302
    const v14, -0x43dc28f6    # -0.01f

    .line 1303
    .line 1304
    .line 1305
    const v15, 0x3e428f5c    # 0.19f

    .line 1306
    .line 1307
    .line 1308
    const v16, -0x430a3d71    # -0.03f

    .line 1309
    .line 1310
    .line 1311
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1312
    .line 1313
    .line 1314
    const/high16 v17, 0x40000000    # 2.0f

    .line 1315
    .line 1316
    const/high16 v18, 0x40000000    # 2.0f

    .line 1317
    .line 1318
    const v13, 0x3f8ccccd    # 1.1f

    .line 1319
    .line 1320
    .line 1321
    const/4 v14, 0x0

    .line 1322
    const/high16 v15, 0x40000000    # 2.0f

    .line 1323
    .line 1324
    const v16, 0x3f666666    # 0.9f

    .line 1325
    .line 1326
    .line 1327
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1328
    .line 1329
    .line 1330
    const v0, -0x4099999a    # -0.9f

    .line 1331
    .line 1332
    .line 1333
    const/high16 v2, -0x40000000    # -2.0f

    .line 1334
    .line 1335
    const/high16 v4, 0x40000000    # 2.0f

    .line 1336
    .line 1337
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1338
    .line 1339
    .line 1340
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1341
    .line 1342
    .line 1343
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v2

    .line 1347
    const/16 v16, 0x3800

    .line 1348
    .line 1349
    const/16 v17, 0x0

    .line 1350
    .line 1351
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1352
    .line 1353
    const/4 v7, 0x0

    .line 1354
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1355
    .line 1356
    const/4 v13, 0x0

    .line 1357
    const/4 v15, 0x0

    .line 1358
    const-string v4, ""

    .line 1359
    .line 1360
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1361
    .line 1362
    .line 1363
    move-result-object v0

    .line 1364
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1365
    .line 1366
    .line 1367
    move-result-object v0

    .line 1368
    sput-object v0, Landroidx/compose/material/icons/twotone/ChildCareKt;->_childCare:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1369
    .line 1370
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1371
    .line 1372
    .line 1373
    return-object v0
.end method
