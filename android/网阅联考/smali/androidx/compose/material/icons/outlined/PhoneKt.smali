.class public final Landroidx/compose/material/icons/outlined/PhoneKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_phone",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Phone",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getPhone",
        "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;",
        "material-icons-core_release"
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
        "SMAP\nPhone.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Phone.kt\nandroidx/compose/material/icons/outlined/PhoneKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,64:1\n122#2:65\n116#2,3:66\n119#2,3:70\n132#2,18:73\n152#2:110\n175#3:69\n694#4,2:91\n706#4,2:93\n708#4,11:99\n53#5,4:95\n*S KotlinDebug\n*F\n+ 1 Phone.kt\nandroidx/compose/material/icons/outlined/PhoneKt\n*L\n29#1:65\n29#1:66,3\n29#1:70,3\n30#1:73,18\n30#1:110\n29#1:69\n30#1:91,2\n30#1:93,2\n30#1:99,11\n30#1:95,4\n*E\n"
    }
.end annotation


# static fields
.field private static _phone:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPhone(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 30

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Landroidx/compose/material/icons/outlined/PhoneKt;->_phone:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    const-string v2, "Outlined.Phone"

    .line 17
    .line 18
    new-instance v1, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 19
    .line 20
    move-object v13, v1

    .line 21
    const/high16 v0, 0x41c00000    # 24.0f

    .line 22
    .line 23
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    const/high16 v5, 0x41c00000    # 24.0f

    .line 32
    .line 33
    const/high16 v6, 0x41c00000    # 24.0f

    .line 34
    .line 35
    const-wide/16 v7, 0x0

    .line 36
    .line 37
    const/4 v9, 0x0

    .line 38
    const/4 v10, 0x0

    .line 39
    const/16 v11, 0xe0

    .line 40
    .line 41
    const/4 v12, 0x0

    .line 42
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 43
    .line 44
    .line 45
    const/high16 v18, 0x3f800000    # 1.0f

    .line 46
    .line 47
    const/high16 v20, 0x3f800000    # 1.0f

    .line 48
    .line 49
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 50
    .line 51
    .line 52
    move-result v15

    .line 53
    new-instance v0, Landroidx/compose/ui/graphics/SolidColor;

    .line 54
    .line 55
    move-object/from16 v17, v0

    .line 56
    .line 57
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 58
    .line 59
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 60
    .line 61
    .line 62
    move-result-wide v1

    .line 63
    const/4 v3, 0x0

    .line 64
    invoke-direct {v0, v1, v2, v3}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 65
    .line 66
    .line 67
    const/16 v19, 0x0

    .line 68
    .line 69
    const/high16 v21, 0x3f800000    # 1.0f

    .line 70
    .line 71
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 72
    .line 73
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 74
    .line 75
    .line 76
    move-result v22

    .line 77
    sget-object v0, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 78
    .line 79
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 80
    .line 81
    .line 82
    move-result v23

    .line 83
    const/high16 v24, 0x3f800000    # 1.0f

    .line 84
    .line 85
    const-string v16, ""

    .line 86
    .line 87
    new-instance v7, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    invoke-direct {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    const v0, 0x40d147ae    # 6.54f

    .line 93
    .line 94
    .line 95
    const/high16 v1, 0x40a00000    # 5.0f

    .line 96
    .line 97
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v1, 0x3d75c28f    # 0.06f

    .line 101
    .line 102
    .line 103
    const v2, 0x3f63d70a    # 0.89f

    .line 104
    .line 105
    .line 106
    const v3, 0x3e570a3d    # 0.21f

    .line 107
    .line 108
    .line 109
    const v4, 0x3fe147ae    # 1.76f

    .line 110
    .line 111
    .line 112
    const v5, 0x3ee66666    # 0.45f

    .line 113
    .line 114
    .line 115
    const v6, 0x4025c28f    # 2.59f

    .line 116
    .line 117
    .line 118
    move-object v0, v7

    .line 119
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const v0, -0x40666666    # -1.2f

    .line 123
    .line 124
    .line 125
    const v8, 0x3f99999a    # 1.2f

    .line 126
    .line 127
    .line 128
    invoke-virtual {v7, v0, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v1, -0x412e147b    # -0.41f

    .line 132
    .line 133
    .line 134
    const v2, -0x40666666    # -1.2f

    .line 135
    .line 136
    .line 137
    const v3, -0x40d47ae1    # -0.67f

    .line 138
    .line 139
    .line 140
    const v4, -0x3fe1eb85    # -2.47f

    .line 141
    .line 142
    .line 143
    const v5, -0x40bd70a4    # -0.76f

    .line 144
    .line 145
    .line 146
    const v6, -0x3f8d70a4    # -3.79f

    .line 147
    .line 148
    .line 149
    move-object v0, v7

    .line 150
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v0, 0x3fc147ae    # 1.51f

    .line 154
    .line 155
    .line 156
    invoke-virtual {v7, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v0, 0x411dc28f    # 9.86f

    .line 160
    .line 161
    .line 162
    const v1, 0x414051ec    # 12.02f

    .line 163
    .line 164
    .line 165
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v1, 0x3f59999a    # 0.85f

    .line 169
    .line 170
    .line 171
    const v2, 0x3e75c28f    # 0.24f

    .line 172
    .line 173
    .line 174
    const v3, 0x3fdc28f6    # 1.72f

    .line 175
    .line 176
    .line 177
    const v4, 0x3ec7ae14    # 0.39f

    .line 178
    .line 179
    .line 180
    const v5, 0x40266666    # 2.6f

    .line 181
    .line 182
    .line 183
    const v6, 0x3ee66666    # 0.45f

    .line 184
    .line 185
    .line 186
    move-object v0, v7

    .line 187
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v0, 0x3fbeb852    # 1.49f

    .line 191
    .line 192
    .line 193
    invoke-virtual {v7, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v1, -0x40570a3d    # -1.32f

    .line 197
    .line 198
    .line 199
    const v2, -0x4247ae14    # -0.09f

    .line 200
    .line 201
    .line 202
    const v3, -0x3fda3d71    # -2.59f

    .line 203
    .line 204
    .line 205
    const v4, -0x414ccccd    # -0.35f

    .line 206
    .line 207
    .line 208
    const v5, -0x3f8ccccd    # -3.8f

    .line 209
    .line 210
    .line 211
    const/high16 v6, -0x40c00000    # -0.75f

    .line 212
    .line 213
    move-object v0, v7

    .line 214
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v0, -0x4067ae14    # -1.19f

    .line 218
    .line 219
    .line 220
    invoke-virtual {v7, v8, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v0, 0x40f00000    # 7.5f

    .line 224
    .line 225
    const/high16 v1, 0x40400000    # 3.0f

    .line 226
    .line 227
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v0, 0x40800000    # 4.0f

    .line 231
    .line 232
    invoke-virtual {v7, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v1, -0x40f33333    # -0.55f

    .line 236
    .line 237
    .line 238
    const/4 v2, 0x0

    .line 239
    const/high16 v3, -0x40800000    # -1.0f

    .line 240
    .line 241
    const v4, 0x3ee66666    # 0.45f

    .line 242
    .line 243
    .line 244
    const/high16 v5, -0x40800000    # -1.0f

    .line 245
    .line 246
    const/high16 v6, 0x3f800000    # 1.0f

    .line 247
    .line 248
    move-object v0, v7

    .line 249
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/4 v1, 0x0

    .line 253
    const v2, 0x41163d71    # 9.39f

    .line 254
    .line 255
    .line 256
    const v3, 0x40f3851f    # 7.61f

    .line 257
    .line 258
    .line 259
    const/high16 v4, 0x41880000    # 17.0f

    .line 260
    .line 261
    const/high16 v5, 0x41880000    # 17.0f

    .line 262
    .line 263
    const/high16 v6, 0x41880000    # 17.0f

    .line 264
    .line 265
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v1, 0x3f0ccccd    # 0.55f

    .line 269
    .line 270
    .line 271
    const/4 v2, 0x0

    .line 272
    const/high16 v3, 0x3f800000    # 1.0f

    .line 273
    .line 274
    const v4, -0x4119999a    # -0.45f

    .line 275
    .line 276
    .line 277
    const/high16 v5, 0x3f800000    # 1.0f

    .line 278
    .line 279
    const/high16 v6, -0x40800000    # -1.0f

    .line 280
    .line 281
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v0, -0x3fa0a3d7    # -3.49f

    .line 285
    .line 286
    .line 287
    invoke-virtual {v7, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/4 v1, 0x0

    .line 291
    const v2, -0x40f33333    # -0.55f

    .line 292
    .line 293
    .line 294
    const v3, -0x4119999a    # -0.45f

    .line 295
    .line 296
    .line 297
    const/high16 v4, -0x40800000    # -1.0f

    .line 298
    .line 299
    const/high16 v5, -0x40800000    # -1.0f

    .line 300
    .line 301
    move-object v0, v7

    .line 302
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v1, -0x406147ae    # -1.24f

    .line 306
    .line 307
    .line 308
    const/4 v2, 0x0

    .line 309
    const v3, -0x3fe33333    # -2.45f

    .line 310
    .line 311
    .line 312
    const v4, -0x41b33333    # -0.2f

    .line 313
    .line 314
    .line 315
    const v5, -0x3f9b851f    # -3.57f

    .line 316
    .line 317
    .line 318
    const v6, -0x40ee147b    # -0.57f

    .line 319
    .line 320
    .line 321
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v1, -0x42333333    # -0.1f

    .line 325
    .line 326
    .line 327
    const v2, -0x42dc28f6    # -0.04f

    .line 328
    .line 329
    .line 330
    const v3, -0x41a8f5c3    # -0.21f

    .line 331
    .line 332
    .line 333
    const v4, -0x42b33333    # -0.05f

    .line 334
    .line 335
    .line 336
    const v5, -0x416147ae    # -0.31f

    .line 337
    .line 338
    .line 339
    const v6, -0x42b33333    # -0.05f

    .line 340
    .line 341
    .line 342
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const v1, -0x417ae148    # -0.26f

    .line 346
    .line 347
    .line 348
    const/4 v2, 0x0

    .line 349
    const v3, -0x40fd70a4    # -0.51f

    .line 350
    .line 351
    .line 352
    const v4, 0x3dcccccd    # 0.1f

    .line 353
    .line 354
    .line 355
    const v5, -0x40ca3d71    # -0.71f

    .line 356
    .line 357
    .line 358
    const v6, 0x3e947ae1    # 0.29f

    .line 359
    .line 360
    .line 361
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const v8, -0x3ff33333    # -2.2f

    .line 365
    .line 366
    .line 367
    const v9, 0x400ccccd    # 2.2f

    .line 368
    .line 369
    .line 370
    invoke-virtual {v7, v8, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v1, -0x3fcae148    # -2.83f

    .line 374
    .line 375
    .line 376
    const v2, -0x40466666    # -1.45f

    .line 377
    .line 378
    .line 379
    const v3, -0x3f5b3333    # -5.15f

    .line 380
    .line 381
    .line 382
    const v4, -0x3f8f5c29    # -3.76f

    .line 383
    .line 384
    .line 385
    const v5, -0x3f2d1eb8    # -6.59f

    .line 386
    .line 387
    .line 388
    const v6, -0x3f2d1eb8    # -6.59f

    .line 389
    .line 390
    .line 391
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v7, v9, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v1, 0x3e8f5c29    # 0.28f

    .line 398
    .line 399
    .line 400
    const v2, -0x4170a3d7    # -0.28f

    .line 401
    .line 402
    .line 403
    const v3, 0x3eb851ec    # 0.36f

    .line 404
    .line 405
    .line 406
    const v4, -0x40d47ae1    # -0.67f

    .line 407
    .line 408
    .line 409
    const/high16 v5, 0x3e800000    # 0.25f

    .line 410
    .line 411
    const v6, -0x407d70a4    # -1.02f

    .line 412
    .line 413
    .line 414
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const v1, 0x410b3333    # 8.7f

    .line 418
    .line 419
    .line 420
    const v2, 0x40ce6666    # 6.45f

    .line 421
    .line 422
    .line 423
    const/high16 v3, 0x41080000    # 8.5f

    .line 424
    .line 425
    const/high16 v4, 0x40a80000    # 5.25f

    .line 426
    .line 427
    const/high16 v5, 0x41080000    # 8.5f

    .line 428
    .line 429
    const/high16 v6, 0x40800000    # 4.0f

    .line 430
    .line 431
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/4 v1, 0x0

    .line 435
    const v2, -0x40f33333    # -0.55f

    .line 436
    .line 437
    .line 438
    const v3, -0x4119999a    # -0.45f

    .line 439
    .line 440
    .line 441
    const/high16 v4, -0x40800000    # -1.0f

    .line 442
    .line 443
    const/high16 v5, -0x40800000    # -1.0f

    .line 444
    .line 445
    const/high16 v6, -0x40800000    # -1.0f

    .line 446
    .line 447
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 454
    .line 455
    .line 456
    move-result-object v14

    .line 457
    const/16 v25, 0x0

    .line 458
    .line 459
    const/16 v26, 0x0

    .line 460
    .line 461
    const/16 v27, 0x0

    .line 462
    .line 463
    const/16 v28, 0x3800

    .line 464
    .line 465
    const/16 v29, 0x0

    .line 466
    .line 467
    invoke-static/range {v13 .. v29}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    sput-object v0, Landroidx/compose/material/icons/outlined/PhoneKt;->_phone:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 476
    .line 477
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 478
    .line 479
    .line 480
    return-object v0
.end method
