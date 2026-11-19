.class public final Landroidx/compose/material/icons/twotone/CallKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_call",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Call",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getCall",
        "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Call.kt\nandroidx/compose/material/icons/twotone/CallKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,80:1\n122#2:81\n116#2,3:82\n119#2,3:86\n132#2,18:89\n152#2:126\n132#2,18:127\n152#2:164\n175#3:85\n694#4,2:107\n706#4,2:109\n708#4,11:115\n694#4,2:145\n706#4,2:147\n708#4,11:153\n53#5,4:111\n53#5,4:149\n*S KotlinDebug\n*F\n+ 1 Call.kt\nandroidx/compose/material/icons/twotone/CallKt\n*L\n29#1:81\n29#1:82,3\n29#1:86,3\n30#1:89,18\n30#1:126\n44#1:127,18\n44#1:164\n29#1:85\n30#1:107,2\n30#1:109,2\n30#1:115,11\n44#1:145,2\n44#1:147,2\n44#1:153,11\n30#1:111,4\n44#1:149,4\n*E\n"
    }
.end annotation


# static fields
.field private static _call:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCall(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 47

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
    sget-object v0, Landroidx/compose/material/icons/twotone/CallKt;->_call:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Call"

    .line 17
    .line 18
    new-instance v1, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 19
    .line 20
    move-object/from16 v30, v1

    .line 21
    .line 22
    move-object v13, v1

    .line 23
    const/high16 v0, 0x41c00000    # 24.0f

    .line 24
    .line 25
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    const/high16 v5, 0x41c00000    # 24.0f

    .line 34
    .line 35
    const/high16 v6, 0x41c00000    # 24.0f

    .line 36
    .line 37
    const-wide/16 v7, 0x0

    .line 38
    .line 39
    const/4 v9, 0x0

    .line 40
    const/4 v10, 0x0

    .line 41
    const/16 v11, 0xe0

    .line 42
    .line 43
    const/4 v12, 0x0

    .line 44
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 45
    .line 46
    .line 47
    const v18, 0x3e99999a    # 0.3f

    .line 48
    .line 49
    .line 50
    const v20, 0x3e99999a    # 0.3f

    .line 51
    .line 52
    .line 53
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 54
    .line 55
    .line 56
    move-result v15

    .line 57
    new-instance v0, Landroidx/compose/ui/graphics/SolidColor;

    .line 58
    .line 59
    move-object/from16 v17, v0

    .line 60
    .line 61
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 62
    .line 63
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 64
    .line 65
    .line 66
    move-result-wide v2

    .line 67
    const/4 v4, 0x0

    .line 68
    invoke-direct {v0, v2, v3, v4}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 69
    .line 70
    .line 71
    const/16 v19, 0x0

    .line 72
    .line 73
    const/high16 v21, 0x3f800000    # 1.0f

    .line 74
    .line 75
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 76
    .line 77
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 78
    .line 79
    .line 80
    move-result v22

    .line 81
    sget-object v2, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 82
    .line 83
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 84
    .line 85
    .line 86
    move-result v23

    .line 87
    const/high16 v24, 0x3f800000    # 1.0f

    .line 88
    .line 89
    const-string v16, ""

    .line 90
    .line 91
    new-instance v3, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    invoke-direct {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 94
    .line 95
    .line 96
    const/high16 v5, 0x41980000    # 19.0f

    .line 97
    .line 98
    const v6, 0x418bc28f    # 17.47f

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3, v5, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v6, -0x409eb852    # -0.88f

    .line 105
    .line 106
    .line 107
    const v7, -0x4270a3d7    # -0.07f

    .line 108
    .line 109
    .line 110
    const/high16 v8, -0x40200000    # -1.75f

    .line 111
    .line 112
    const v9, -0x419eb852    # -0.22f

    .line 113
    .line 114
    .line 115
    const v10, -0x3fd9999a    # -2.6f

    .line 116
    .line 117
    .line 118
    const v11, -0x4119999a    # -0.45f

    .line 119
    .line 120
    .line 121
    move-object v5, v3

    .line 122
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const v5, 0x3f9851ec    # 1.19f

    .line 126
    .line 127
    .line 128
    const v12, -0x4067ae14    # -1.19f

    .line 129
    .line 130
    .line 131
    invoke-virtual {v3, v12, v5}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v6, 0x3f99999a    # 1.2f

    .line 135
    .line 136
    .line 137
    const v7, 0x3ed1eb85    # 0.41f

    .line 138
    .line 139
    .line 140
    const v8, 0x401eb852    # 2.48f

    .line 141
    .line 142
    .line 143
    const v9, 0x3f2b851f    # 0.67f

    .line 144
    .line 145
    .line 146
    const v10, 0x40733333    # 3.8f

    .line 147
    .line 148
    .line 149
    const/high16 v11, 0x3f400000    # 0.75f

    .line 150
    .line 151
    move-object v5, v3

    .line 152
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v5, -0x404147ae    # -1.49f

    .line 156
    .line 157
    .line 158
    invoke-virtual {v3, v5}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v5, 0x40d147ae    # 6.54f

    .line 165
    .line 166
    .line 167
    const/high16 v14, 0x40a00000    # 5.0f

    .line 168
    .line 169
    invoke-virtual {v3, v5, v14}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v5, -0x40400000    # -1.5f

    .line 173
    .line 174
    invoke-virtual {v3, v5}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v6, 0x3db851ec    # 0.09f

    .line 178
    .line 179
    .line 180
    const v7, 0x3fa8f5c3    # 1.32f

    .line 181
    .line 182
    .line 183
    const v8, 0x3eb33333    # 0.35f

    .line 184
    .line 185
    .line 186
    const v9, 0x4025c28f    # 2.59f

    .line 187
    .line 188
    .line 189
    const/high16 v10, 0x3f400000    # 0.75f

    .line 190
    .line 191
    const v11, 0x40733333    # 3.8f

    .line 192
    .line 193
    .line 194
    move-object v5, v3

    .line 195
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v11, 0x3f99999a    # 1.2f

    .line 199
    .line 200
    .line 201
    const v10, -0x40666666    # -1.2f

    .line 202
    .line 203
    .line 204
    invoke-virtual {v3, v11, v10}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v6, -0x418a3d71    # -0.24f

    .line 208
    .line 209
    .line 210
    const v7, -0x40a8f5c3    # -0.84f

    .line 211
    .line 212
    .line 213
    const v8, -0x413851ec    # -0.39f

    .line 214
    .line 215
    .line 216
    const v9, -0x40251eb8    # -1.71f

    .line 217
    .line 218
    .line 219
    const v25, -0x4119999a    # -0.45f

    .line 220
    .line 221
    .line 222
    const v26, -0x3fd9999a    # -2.6f

    .line 223
    .line 224
    .line 225
    move/from16 v10, v25

    .line 226
    .line 227
    move/from16 v11, v26

    .line 228
    .line 229
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    move v5, v14

    .line 240
    move-object v14, v3

    .line 241
    const/16 v25, 0x0

    .line 242
    .line 243
    const/16 v26, 0x0

    .line 244
    .line 245
    const/16 v27, 0x0

    .line 246
    .line 247
    const/16 v28, 0x3800

    .line 248
    .line 249
    const/16 v29, 0x0

    .line 250
    .line 251
    invoke-static/range {v13 .. v29}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 252
    .line 253
    .line 254
    const/high16 v35, 0x3f800000    # 1.0f

    .line 255
    .line 256
    const/high16 v37, 0x3f800000    # 1.0f

    .line 257
    .line 258
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 259
    .line 260
    .line 261
    move-result v32

    .line 262
    new-instance v3, Landroidx/compose/ui/graphics/SolidColor;

    .line 263
    .line 264
    move-object/from16 v34, v3

    .line 265
    .line 266
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 267
    .line 268
    .line 269
    move-result-wide v6

    .line 270
    invoke-direct {v3, v6, v7, v4}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 271
    .line 272
    .line 273
    const/16 v36, 0x0

    .line 274
    .line 275
    const/high16 v38, 0x3f800000    # 1.0f

    .line 276
    .line 277
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 278
    .line 279
    .line 280
    move-result v39

    .line 281
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 282
    .line 283
    .line 284
    move-result v40

    .line 285
    const/high16 v41, 0x3f800000    # 1.0f

    .line 286
    .line 287
    const-string v33, ""

    .line 288
    .line 289
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 292
    .line 293
    .line 294
    const/high16 v1, 0x41a00000    # 20.0f

    .line 295
    .line 296
    const/high16 v2, 0x41a80000    # 21.0f

    .line 297
    .line 298
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const v14, 0x3f0ccccd    # 0.55f

    .line 302
    .line 303
    .line 304
    const/4 v15, 0x0

    .line 305
    const/high16 v16, 0x3f800000    # 1.0f

    .line 306
    .line 307
    const v17, -0x4119999a    # -0.45f

    .line 308
    .line 309
    .line 310
    const/high16 v18, 0x3f800000    # 1.0f

    .line 311
    .line 312
    const/high16 v19, -0x40800000    # -1.0f

    .line 313
    .line 314
    move-object v13, v0

    .line 315
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v1, -0x3fa0a3d7    # -3.49f

    .line 319
    .line 320
    .line 321
    invoke-virtual {v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const/4 v14, 0x0

    .line 325
    const v15, -0x40f33333    # -0.55f

    .line 326
    .line 327
    .line 328
    const v16, -0x4119999a    # -0.45f

    .line 329
    .line 330
    .line 331
    const/high16 v17, -0x40800000    # -1.0f

    .line 332
    .line 333
    const/high16 v18, -0x40800000    # -1.0f

    .line 334
    .line 335
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v14, -0x406147ae    # -1.24f

    .line 339
    .line 340
    .line 341
    const/4 v15, 0x0

    .line 342
    const v16, -0x3fe33333    # -2.45f

    .line 343
    .line 344
    .line 345
    const v17, -0x41b33333    # -0.2f

    .line 346
    .line 347
    .line 348
    const v18, -0x3f9b851f    # -3.57f

    .line 349
    .line 350
    .line 351
    const v19, -0x40ee147b    # -0.57f

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v14, -0x42333333    # -0.1f

    .line 358
    .line 359
    .line 360
    const v15, -0x42dc28f6    # -0.04f

    .line 361
    .line 362
    .line 363
    const v16, -0x41a8f5c3    # -0.21f

    .line 364
    .line 365
    .line 366
    const v17, -0x42b33333    # -0.05f

    .line 367
    .line 368
    .line 369
    const v18, -0x416147ae    # -0.31f

    .line 370
    .line 371
    .line 372
    const v19, -0x42b33333    # -0.05f

    .line 373
    .line 374
    .line 375
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v14, -0x417ae148    # -0.26f

    .line 379
    .line 380
    .line 381
    const/4 v15, 0x0

    .line 382
    const v16, -0x40fd70a4    # -0.51f

    .line 383
    .line 384
    .line 385
    const v17, 0x3dcccccd    # 0.1f

    .line 386
    .line 387
    .line 388
    const v18, -0x40ca3d71    # -0.71f

    .line 389
    .line 390
    .line 391
    const v19, 0x3e947ae1    # 0.29f

    .line 392
    .line 393
    .line 394
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v1, -0x3ff33333    # -2.2f

    .line 398
    .line 399
    .line 400
    const v2, 0x400ccccd    # 2.2f

    .line 401
    .line 402
    .line 403
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v14, -0x3fcae148    # -2.83f

    .line 407
    .line 408
    .line 409
    const v15, -0x40466666    # -1.45f

    .line 410
    .line 411
    .line 412
    const v16, -0x3f5b3333    # -5.15f

    .line 413
    .line 414
    .line 415
    const v17, -0x3f8f5c29    # -3.76f

    .line 416
    .line 417
    .line 418
    const v18, -0x3f2d1eb8    # -6.59f

    .line 419
    .line 420
    .line 421
    const v19, -0x3f2d1eb8    # -6.59f

    .line 422
    .line 423
    .line 424
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v0, v2, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v14, 0x3e8f5c29    # 0.28f

    .line 431
    .line 432
    .line 433
    const v15, -0x4170a3d7    # -0.28f

    .line 434
    .line 435
    .line 436
    const v16, 0x3eb851ec    # 0.36f

    .line 437
    .line 438
    .line 439
    const v17, -0x40d47ae1    # -0.67f

    .line 440
    .line 441
    .line 442
    const/high16 v18, 0x3e800000    # 0.25f

    .line 443
    .line 444
    const v19, -0x407d70a4    # -1.02f

    .line 445
    .line 446
    .line 447
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v14, 0x410b3333    # 8.7f

    .line 451
    .line 452
    .line 453
    const v15, 0x40ce6666    # 6.45f

    .line 454
    .line 455
    .line 456
    const/high16 v16, 0x41080000    # 8.5f

    .line 457
    .line 458
    const/high16 v17, 0x40a80000    # 5.25f

    .line 459
    .line 460
    const/high16 v18, 0x41080000    # 8.5f

    .line 461
    .line 462
    const/high16 v19, 0x40800000    # 4.0f

    .line 463
    .line 464
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const/4 v14, 0x0

    .line 468
    const v15, -0x40f33333    # -0.55f

    .line 469
    .line 470
    .line 471
    const v16, -0x4119999a    # -0.45f

    .line 472
    .line 473
    .line 474
    const/high16 v17, -0x40800000    # -1.0f

    .line 475
    .line 476
    const/high16 v18, -0x40800000    # -1.0f

    .line 477
    .line 478
    const/high16 v19, -0x40800000    # -1.0f

    .line 479
    .line 480
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v1, 0x40800000    # 4.0f

    .line 484
    .line 485
    const/high16 v2, 0x40400000    # 3.0f

    .line 486
    .line 487
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const v14, -0x40f33333    # -0.55f

    .line 491
    .line 492
    .line 493
    const/4 v15, 0x0

    .line 494
    const/high16 v16, -0x40800000    # -1.0f

    .line 495
    .line 496
    const v17, 0x3ee66666    # 0.45f

    .line 497
    .line 498
    .line 499
    const/high16 v19, 0x3f800000    # 1.0f

    .line 500
    .line 501
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const/4 v14, 0x0

    .line 505
    const v15, 0x41163d71    # 9.39f

    .line 506
    .line 507
    .line 508
    const v16, 0x40f3851f    # 7.61f

    .line 509
    .line 510
    .line 511
    const/high16 v17, 0x41880000    # 17.0f

    .line 512
    .line 513
    const/high16 v18, 0x41880000    # 17.0f

    .line 514
    .line 515
    const/high16 v19, 0x41880000    # 17.0f

    .line 516
    .line 517
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const v1, 0x41833333    # 16.4f

    .line 524
    .line 525
    .line 526
    const v2, 0x418828f6    # 17.02f

    .line 527
    .line 528
    .line 529
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const v14, 0x3f59999a    # 0.85f

    .line 533
    .line 534
    .line 535
    const v15, 0x3e75c28f    # 0.24f

    .line 536
    .line 537
    .line 538
    const v16, 0x3fdc28f6    # 1.72f

    .line 539
    .line 540
    .line 541
    const v17, 0x3ec7ae14    # 0.39f

    .line 542
    .line 543
    .line 544
    const v18, 0x40266666    # 2.6f

    .line 545
    .line 546
    .line 547
    const v19, 0x3ee66666    # 0.45f

    .line 548
    .line 549
    .line 550
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const v1, 0x3fbeb852    # 1.49f

    .line 554
    .line 555
    .line 556
    invoke-virtual {v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const v14, -0x40570a3d    # -1.32f

    .line 560
    .line 561
    .line 562
    const v15, -0x4247ae14    # -0.09f

    .line 563
    .line 564
    .line 565
    const v16, -0x3fda3d71    # -2.59f

    .line 566
    .line 567
    .line 568
    const v17, -0x414ccccd    # -0.35f

    .line 569
    .line 570
    .line 571
    const v18, -0x3f8ccccd    # -3.8f

    .line 572
    .line 573
    .line 574
    const/high16 v19, -0x40c00000    # -0.75f

    .line 575
    .line 576
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const v1, 0x3f99999a    # 1.2f

    .line 580
    .line 581
    .line 582
    invoke-virtual {v0, v1, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const v2, 0x40a0f5c3    # 5.03f

    .line 589
    .line 590
    .line 591
    invoke-virtual {v0, v2, v5}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 595
    .line 596
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const v14, 0x3d8f5c29    # 0.07f

    .line 600
    .line 601
    .line 602
    const v15, 0x3f63d70a    # 0.89f

    .line 603
    .line 604
    .line 605
    const v16, 0x3e6147ae    # 0.22f

    .line 606
    .line 607
    .line 608
    const v17, 0x3fe147ae    # 1.76f

    .line 609
    .line 610
    .line 611
    const v18, 0x3eeb851f    # 0.46f

    .line 612
    .line 613
    .line 614
    const v19, 0x4025c28f    # 2.59f

    .line 615
    .line 616
    .line 617
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const v2, -0x40666666    # -1.2f

    .line 621
    .line 622
    .line 623
    invoke-virtual {v0, v2, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const v14, -0x412e147b    # -0.41f

    .line 627
    .line 628
    .line 629
    const v15, -0x40666666    # -1.2f

    .line 630
    .line 631
    .line 632
    const v16, -0x40d47ae1    # -0.67f

    .line 633
    .line 634
    .line 635
    const v17, -0x3fe1eb85    # -2.47f

    .line 636
    .line 637
    .line 638
    const v18, -0x40bd70a4    # -0.76f

    .line 639
    .line 640
    .line 641
    const v19, -0x3f8d70a4    # -3.79f

    .line 642
    .line 643
    .line 644
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 651
    .line 652
    .line 653
    move-result-object v31

    .line 654
    const/16 v42, 0x0

    .line 655
    .line 656
    const/16 v43, 0x0

    .line 657
    .line 658
    const/16 v44, 0x0

    .line 659
    .line 660
    const/16 v45, 0x3800

    .line 661
    .line 662
    const/16 v46, 0x0

    .line 663
    .line 664
    invoke-static/range {v30 .. v46}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 665
    .line 666
    .line 667
    move-result-object v0

    .line 668
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 669
    .line 670
    .line 671
    move-result-object v0

    .line 672
    sput-object v0, Landroidx/compose/material/icons/twotone/CallKt;->_call:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 673
    .line 674
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 675
    .line 676
    .line 677
    return-object v0
.end method
