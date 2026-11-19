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
        "SMAP\nCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Call.kt\nandroidx/compose/material/icons/twotone/CallKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,80:1\n212#2,12:81\n233#2,18:94\n253#2:131\n233#2,18:132\n253#2:169\n174#3:93\n705#4,2:112\n717#4,2:114\n719#4,11:120\n705#4,2:150\n717#4,2:152\n719#4,11:158\n72#5,4:116\n72#5,4:154\n*S KotlinDebug\n*F\n+ 1 Call.kt\nandroidx/compose/material/icons/twotone/CallKt\n*L\n29#1:81,12\n30#1:94,18\n30#1:131\n44#1:132,18\n44#1:169\n29#1:93\n30#1:112,2\n30#1:114,2\n30#1:120,11\n44#1:150,2\n44#1:152,2\n44#1:158,11\n30#1:116,4\n44#1:154,4\n*E\n"
    }
.end annotation


# static fields
.field private static _call:Landroidx/compose/ui/graphics/vector/ImageVector;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public static final getCall(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27
    .param p0    # Landroidx/compose/material/icons/Icons$TwoTone;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/CallKt;->_call:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

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
    const-string v2, "TwoTone.Call"

    .line 33
    .line 34
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/e;)V

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
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/e;)V

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
    const/high16 v2, 0x41980000    # 19.0f

    .line 66
    .line 67
    const v4, 0x418bc28f    # 17.47f

    .line 68
    .line 69
    .line 70
    invoke-static {v2, v4}, Lg/a;->a(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 71
    .line 72
    .line 73
    move-result-object v20

    .line 74
    const v25, -0x3fd9999a    # -2.6f

    .line 75
    .line 76
    .line 77
    const v26, -0x4119999a    # -0.45f

    .line 78
    .line 79
    .line 80
    const v21, -0x409eb852    # -0.88f

    .line 81
    .line 82
    .line 83
    const v22, -0x4270a3d7    # -0.07f

    .line 84
    .line 85
    .line 86
    const/high16 v23, -0x40200000    # -1.75f

    .line 87
    .line 88
    const v24, -0x419eb852    # -0.22f

    .line 89
    .line 90
    .line 91
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    move-object/from16 v2, v20

    .line 95
    .line 96
    const v4, 0x3f9851ec    # 1.19f

    .line 97
    .line 98
    .line 99
    const v6, -0x4067ae14    # -1.19f

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v25, 0x40733333    # 3.8f

    .line 106
    .line 107
    .line 108
    const/high16 v26, 0x3f400000    # 0.75f

    .line 109
    .line 110
    const v21, 0x3f99999a    # 1.2f

    .line 111
    .line 112
    .line 113
    const v22, 0x3ed1eb85    # 0.41f

    .line 114
    .line 115
    .line 116
    const v23, 0x401eb852    # 2.48f

    .line 117
    .line 118
    .line 119
    const v24, 0x3f2b851f    # 0.67f

    .line 120
    .line 121
    .line 122
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const v4, -0x404147ae    # -1.49f

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v4, 0x40d147ae    # 6.54f

    .line 135
    .line 136
    .line 137
    const/high16 v6, 0x40a00000    # 5.0f

    .line 138
    .line 139
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v4, -0x40400000    # -1.5f

    .line 143
    .line 144
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v25, 0x3f400000    # 0.75f

    .line 148
    .line 149
    const v26, 0x40733333    # 3.8f

    .line 150
    .line 151
    .line 152
    const v21, 0x3db851ec    # 0.09f

    .line 153
    .line 154
    .line 155
    const v22, 0x3fa8f5c3    # 1.32f

    .line 156
    .line 157
    .line 158
    const v23, 0x3eb33333    # 0.35f

    .line 159
    .line 160
    .line 161
    const v24, 0x4025c28f    # 2.59f

    .line 162
    .line 163
    .line 164
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v4, -0x40666666    # -1.2f

    .line 168
    .line 169
    .line 170
    const v6, 0x3f99999a    # 1.2f

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v25, -0x4119999a    # -0.45f

    .line 177
    .line 178
    .line 179
    const v26, -0x3fd9999a    # -2.6f

    .line 180
    .line 181
    .line 182
    const v21, -0x418a3d71    # -0.24f

    .line 183
    .line 184
    .line 185
    const v22, -0x40a8f5c3    # -0.84f

    .line 186
    .line 187
    .line 188
    const v23, -0x413851ec    # -0.39f

    .line 189
    .line 190
    .line 191
    const v24, -0x40251eb8    # -1.71f

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    const/16 v16, 0x3800

    .line 205
    .line 206
    const/16 v17, 0x0

    .line 207
    .line 208
    const v6, 0x3e99999a    # 0.3f

    .line 209
    .line 210
    .line 211
    const v8, 0x3e99999a    # 0.3f

    .line 212
    .line 213
    .line 214
    const/4 v7, 0x0

    .line 215
    const/high16 v9, 0x3f800000    # 1.0f

    .line 216
    .line 217
    const/high16 v12, 0x3f800000    # 1.0f

    .line 218
    .line 219
    const/4 v13, 0x0

    .line 220
    const/4 v14, 0x0

    .line 221
    const/4 v15, 0x0

    .line 222
    const-string v4, ""

    .line 223
    .line 224
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 225
    .line 226
    .line 227
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 228
    .line 229
    .line 230
    move-result v3

    .line 231
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 232
    .line 233
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 234
    .line 235
    .line 236
    move-result-wide v6

    .line 237
    const/4 v0, 0x0

    .line 238
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/e;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 242
    .line 243
    .line 244
    move-result v10

    .line 245
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 246
    .line 247
    .line 248
    move-result v11

    .line 249
    const/high16 v0, 0x41a00000    # 20.0f

    .line 250
    .line 251
    const/high16 v2, 0x41a80000    # 21.0f

    .line 252
    .line 253
    invoke-static {v0, v2}, Lg/a;->a(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    move-result-object v12

    .line 257
    const/high16 v17, 0x3f800000    # 1.0f

    .line 258
    .line 259
    const/high16 v18, -0x40800000    # -1.0f

    .line 260
    .line 261
    const v13, 0x3f0ccccd    # 0.55f

    .line 262
    .line 263
    .line 264
    const/high16 v15, 0x3f800000    # 1.0f

    .line 265
    .line 266
    const v16, -0x4119999a    # -0.45f

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v0, -0x3fa0a3d7    # -3.49f

    .line 273
    .line 274
    .line 275
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const/high16 v17, -0x40800000    # -1.0f

    .line 279
    .line 280
    const/4 v13, 0x0

    .line 281
    const v14, -0x40f33333    # -0.55f

    .line 282
    .line 283
    .line 284
    const v15, -0x4119999a    # -0.45f

    .line 285
    .line 286
    .line 287
    const/high16 v16, -0x40800000    # -1.0f

    .line 288
    .line 289
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v17, -0x3f9b851f    # -3.57f

    .line 293
    .line 294
    .line 295
    const v18, -0x40ee147b    # -0.57f

    .line 296
    .line 297
    .line 298
    const v13, -0x406147ae    # -1.24f

    .line 299
    .line 300
    .line 301
    const/4 v14, 0x0

    .line 302
    const v15, -0x3fe33333    # -2.45f

    .line 303
    .line 304
    .line 305
    const v16, -0x41b33333    # -0.2f

    .line 306
    .line 307
    .line 308
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v17, -0x416147ae    # -0.31f

    .line 312
    .line 313
    .line 314
    const v18, -0x42b33333    # -0.05f

    .line 315
    .line 316
    .line 317
    const v13, -0x42333333    # -0.1f

    .line 318
    .line 319
    .line 320
    const v14, -0x42dc28f6    # -0.04f

    .line 321
    .line 322
    .line 323
    const v15, -0x41a8f5c3    # -0.21f

    .line 324
    .line 325
    .line 326
    const v16, -0x42b33333    # -0.05f

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v17, -0x40ca3d71    # -0.71f

    .line 333
    .line 334
    .line 335
    const v18, 0x3e947ae1    # 0.29f

    .line 336
    .line 337
    .line 338
    const v13, -0x417ae148    # -0.26f

    .line 339
    .line 340
    .line 341
    const/4 v14, 0x0

    .line 342
    const v15, -0x40fd70a4    # -0.51f

    .line 343
    .line 344
    .line 345
    const v16, 0x3dcccccd    # 0.1f

    .line 346
    .line 347
    .line 348
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v0, 0x400ccccd    # 2.2f

    .line 352
    .line 353
    .line 354
    const v2, -0x3ff33333    # -2.2f

    .line 355
    .line 356
    .line 357
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v17, -0x3f2d1eb8    # -6.59f

    .line 361
    .line 362
    .line 363
    const v18, -0x3f2d1eb8    # -6.59f

    .line 364
    .line 365
    .line 366
    const v13, -0x3fcae148    # -2.83f

    .line 367
    .line 368
    .line 369
    const v14, -0x40466666    # -1.45f

    .line 370
    .line 371
    .line 372
    const v15, -0x3f5b3333    # -5.15f

    .line 373
    .line 374
    .line 375
    const v16, -0x3f8f5c29    # -3.76f

    .line 376
    .line 377
    .line 378
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/high16 v17, 0x3e800000    # 0.25f

    .line 385
    .line 386
    const v18, -0x407d70a4    # -1.02f

    .line 387
    .line 388
    .line 389
    const v13, 0x3e8f5c29    # 0.28f

    .line 390
    .line 391
    .line 392
    const v14, -0x4170a3d7    # -0.28f

    .line 393
    .line 394
    .line 395
    const v15, 0x3eb851ec    # 0.36f

    .line 396
    .line 397
    .line 398
    const v16, -0x40d47ae1    # -0.67f

    .line 399
    .line 400
    .line 401
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const/high16 v17, 0x41080000    # 8.5f

    .line 405
    .line 406
    const/high16 v18, 0x40800000    # 4.0f

    .line 407
    .line 408
    const v13, 0x410b3333    # 8.7f

    .line 409
    .line 410
    .line 411
    const v14, 0x40ce6666    # 6.45f

    .line 412
    .line 413
    .line 414
    const/high16 v15, 0x41080000    # 8.5f

    .line 415
    .line 416
    const/high16 v16, 0x40a80000    # 5.25f

    .line 417
    .line 418
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v17, -0x40800000    # -1.0f

    .line 422
    .line 423
    const/high16 v18, -0x40800000    # -1.0f

    .line 424
    .line 425
    const/4 v13, 0x0

    .line 426
    const v14, -0x40f33333    # -0.55f

    .line 427
    .line 428
    .line 429
    const v15, -0x4119999a    # -0.45f

    .line 430
    .line 431
    .line 432
    const/high16 v16, -0x40800000    # -1.0f

    .line 433
    .line 434
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/high16 v0, 0x40800000    # 4.0f

    .line 438
    .line 439
    const/high16 v2, 0x40400000    # 3.0f

    .line 440
    .line 441
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const/high16 v18, 0x3f800000    # 1.0f

    .line 445
    .line 446
    const v13, -0x40f33333    # -0.55f

    .line 447
    .line 448
    .line 449
    const/4 v14, 0x0

    .line 450
    const/high16 v15, -0x40800000    # -1.0f

    .line 451
    .line 452
    const v16, 0x3ee66666    # 0.45f

    .line 453
    .line 454
    .line 455
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const/high16 v17, 0x41880000    # 17.0f

    .line 459
    .line 460
    const/high16 v18, 0x41880000    # 17.0f

    .line 461
    .line 462
    const/4 v13, 0x0

    .line 463
    const v14, 0x41163d71    # 9.39f

    .line 464
    .line 465
    .line 466
    const v15, 0x40f3851f    # 7.61f

    .line 467
    .line 468
    .line 469
    const/high16 v16, 0x41880000    # 17.0f

    .line 470
    .line 471
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const v0, 0x41833333    # 16.4f

    .line 478
    .line 479
    .line 480
    const v2, 0x418828f6    # 17.02f

    .line 481
    .line 482
    .line 483
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const v17, 0x40266666    # 2.6f

    .line 487
    .line 488
    .line 489
    const v18, 0x3ee66666    # 0.45f

    .line 490
    .line 491
    .line 492
    const v13, 0x3f59999a    # 0.85f

    .line 493
    .line 494
    .line 495
    const v14, 0x3e75c28f    # 0.24f

    .line 496
    .line 497
    .line 498
    const v15, 0x3fdc28f6    # 1.72f

    .line 499
    .line 500
    .line 501
    const v16, 0x3ec7ae14    # 0.39f

    .line 502
    .line 503
    .line 504
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const v0, 0x3fbeb852    # 1.49f

    .line 508
    .line 509
    .line 510
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v17, -0x3f8ccccd    # -3.8f

    .line 514
    .line 515
    .line 516
    const/high16 v18, -0x40c00000    # -0.75f

    .line 517
    .line 518
    const v13, -0x40570a3d    # -1.32f

    .line 519
    .line 520
    .line 521
    const v14, -0x4247ae14    # -0.09f

    .line 522
    .line 523
    .line 524
    const v15, -0x3fda3d71    # -2.59f

    .line 525
    .line 526
    .line 527
    const v16, -0x414ccccd    # -0.35f

    .line 528
    .line 529
    .line 530
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const v0, -0x4067ae14    # -1.19f

    .line 534
    .line 535
    .line 536
    const v2, 0x3f99999a    # 1.2f

    .line 537
    .line 538
    .line 539
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const v0, 0x40a0f5c3    # 5.03f

    .line 546
    .line 547
    .line 548
    const/high16 v2, 0x40a00000    # 5.0f

    .line 549
    .line 550
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 554
    .line 555
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const v17, 0x3eeb851f    # 0.46f

    .line 559
    .line 560
    .line 561
    const v18, 0x4025c28f    # 2.59f

    .line 562
    .line 563
    .line 564
    const v13, 0x3d8f5c29    # 0.07f

    .line 565
    .line 566
    .line 567
    const v14, 0x3f63d70a    # 0.89f

    .line 568
    .line 569
    .line 570
    const v15, 0x3e6147ae    # 0.22f

    .line 571
    .line 572
    .line 573
    const v16, 0x3fe147ae    # 1.76f

    .line 574
    .line 575
    .line 576
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const v0, -0x40666666    # -1.2f

    .line 580
    .line 581
    .line 582
    const v2, 0x3f99999a    # 1.2f

    .line 583
    .line 584
    .line 585
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const v17, -0x40bd70a4    # -0.76f

    .line 589
    .line 590
    .line 591
    const v18, -0x3f8d70a4    # -3.79f

    .line 592
    .line 593
    .line 594
    const v13, -0x412e147b    # -0.41f

    .line 595
    .line 596
    .line 597
    const v14, -0x40666666    # -1.2f

    .line 598
    .line 599
    .line 600
    const v15, -0x40d47ae1    # -0.67f

    .line 601
    .line 602
    .line 603
    const v16, -0x3fe1eb85    # -2.47f

    .line 604
    .line 605
    .line 606
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 613
    .line 614
    .line 615
    move-result-object v2

    .line 616
    const/16 v16, 0x3800

    .line 617
    .line 618
    const/16 v17, 0x0

    .line 619
    .line 620
    const/high16 v6, 0x3f800000    # 1.0f

    .line 621
    .line 622
    const/high16 v8, 0x3f800000    # 1.0f

    .line 623
    .line 624
    const/4 v7, 0x0

    .line 625
    const/high16 v12, 0x3f800000    # 1.0f

    .line 626
    .line 627
    const/4 v13, 0x0

    .line 628
    const/4 v14, 0x0

    .line 629
    const/4 v15, 0x0

    .line 630
    const-string v4, ""

    .line 631
    .line 632
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 633
    .line 634
    .line 635
    move-result-object v0

    .line 636
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 637
    .line 638
    .line 639
    move-result-object v0

    .line 640
    sput-object v0, Landroidx/compose/material/icons/twotone/CallKt;->_call:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 641
    .line 642
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 643
    .line 644
    .line 645
    return-object v0
.end method
