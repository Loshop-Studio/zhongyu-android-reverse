.class public final Landroidx/compose/material/icons/twotone/SupervisedUserCircleKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_supervisedUserCircle",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SupervisedUserCircle",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getSupervisedUserCircle",
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
        "SMAP\nSupervisedUserCircle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupervisedUserCircle.kt\nandroidx/compose/material/icons/twotone/SupervisedUserCircleKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,111:1\n212#2,12:112\n233#2,18:125\n253#2:162\n233#2,18:163\n253#2:200\n233#2,18:201\n253#2:238\n174#3:124\n705#4,2:143\n717#4,2:145\n719#4,11:151\n705#4,2:181\n717#4,2:183\n719#4,11:189\n705#4,2:219\n717#4,2:221\n719#4,11:227\n72#5,4:147\n72#5,4:185\n72#5,4:223\n*S KotlinDebug\n*F\n+ 1 SupervisedUserCircle.kt\nandroidx/compose/material/icons/twotone/SupervisedUserCircleKt\n*L\n29#1:112,12\n30#1:125,18\n30#1:162\n36#1:163,18\n36#1:200\n65#1:201,18\n65#1:238\n29#1:124\n30#1:143,2\n30#1:145,2\n30#1:151,11\n36#1:181,2\n36#1:183,2\n36#1:189,11\n65#1:219,2\n65#1:221,2\n65#1:227,11\n30#1:147,4\n36#1:185,4\n65#1:223,4\n*E\n"
    }
.end annotation


# static fields
.field private static _supervisedUserCircle:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSupervisedUserCircle(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/SupervisedUserCircleKt;->_supervisedUserCircle:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.SupervisedUserCircle"

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
    const/high16 v4, 0x41180000    # 9.5f

    .line 71
    .line 72
    const/high16 v6, 0x41200000    # 10.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/4 v4, 0x0

    .line 78
    const/high16 v6, -0x40800000    # -1.0f

    .line 79
    .line 80
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v26, 0x40000000    # 2.0f

    .line 84
    .line 85
    const/16 v27, 0x0

    .line 86
    .line 87
    const/high16 v21, 0x3f800000    # 1.0f

    .line 88
    .line 89
    const/high16 v22, 0x3f800000    # 1.0f

    .line 90
    .line 91
    const/16 v23, 0x0

    .line 92
    .line 93
    const/16 v24, 0x1

    .line 94
    .line 95
    const/16 v25, 0x1

    .line 96
    .line 97
    move-object/from16 v20, v2

    .line 98
    .line 99
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v26, -0x40000000    # -2.0f

    .line 103
    .line 104
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    const/16 v16, 0x3800

    .line 112
    .line 113
    const/16 v17, 0x0

    .line 114
    .line 115
    const v6, 0x3e99999a    # 0.3f

    .line 116
    .line 117
    .line 118
    const v8, 0x3e99999a    # 0.3f

    .line 119
    .line 120
    .line 121
    const/4 v7, 0x0

    .line 122
    const/high16 v9, 0x3f800000    # 1.0f

    .line 123
    .line 124
    const/high16 v12, 0x3f800000    # 1.0f

    .line 125
    .line 126
    const/4 v13, 0x0

    .line 127
    const/4 v14, 0x0

    .line 128
    const/4 v15, 0x0

    .line 129
    const-string v4, ""

    .line 130
    .line 131
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 132
    .line 133
    .line 134
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 139
    .line 140
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 141
    .line 142
    .line 143
    move-result-wide v6

    .line 144
    const/4 v2, 0x0

    .line 145
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 149
    .line 150
    .line 151
    move-result v10

    .line 152
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 153
    .line 154
    .line 155
    move-result v11

    .line 156
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 159
    .line 160
    .line 161
    const/high16 v4, 0x41380000    # 11.5f

    .line 162
    .line 163
    const v6, 0x4189ae14    # 17.21f

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const/high16 v25, 0x40900000    # 4.5f

    .line 170
    .line 171
    const v26, -0x3fd33333    # -2.7f

    .line 172
    .line 173
    .line 174
    const/16 v21, 0x0

    .line 175
    .line 176
    const v22, -0x400f5c29    # -1.88f

    .line 177
    .line 178
    .line 179
    const v23, 0x403eb852    # 2.98f

    .line 180
    .line 181
    .line 182
    const v24, -0x3fd33333    # -2.7f

    .line 183
    .line 184
    .line 185
    move-object/from16 v20, v2

    .line 186
    .line 187
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v25, 0x404f5c29    # 3.24f

    .line 191
    .line 192
    .line 193
    const v26, 0x3f5eb852    # 0.87f

    .line 194
    .line 195
    .line 196
    const v21, 0x3f6147ae    # 0.88f

    .line 197
    .line 198
    .line 199
    const/16 v22, 0x0

    .line 200
    .line 201
    const v23, 0x400f5c29    # 2.24f

    .line 202
    .line 203
    .line 204
    const v24, 0x3e8a3d71    # 0.27f

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v25, 0x3f400000    # 0.75f

    .line 211
    .line 212
    const v26, -0x3fa851ec    # -3.37f

    .line 213
    .line 214
    .line 215
    const v21, 0x3ef5c28f    # 0.48f

    .line 216
    .line 217
    .line 218
    const v22, -0x407d70a4    # -1.02f

    .line 219
    .line 220
    .line 221
    const/high16 v23, 0x3f400000    # 0.75f

    .line 222
    .line 223
    const v24, -0x3ff5c28f    # -2.16f

    .line 224
    .line 225
    .line 226
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/high16 v25, -0x3f000000    # -8.0f

    .line 230
    .line 231
    const/high16 v26, -0x3f000000    # -8.0f

    .line 232
    .line 233
    const/16 v21, 0x0

    .line 234
    .line 235
    const v22, -0x3f72e148    # -4.41f

    .line 236
    .line 237
    .line 238
    const v23, -0x3f9a3d71    # -3.59f

    .line 239
    .line 240
    .line 241
    const/high16 v24, -0x3f000000    # -8.0f

    .line 242
    .line 243
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v4, 0x4065c28f    # 3.59f

    .line 247
    .line 248
    .line 249
    const/high16 v6, -0x3f000000    # -8.0f

    .line 250
    .line 251
    const/high16 v7, 0x41000000    # 8.0f

    .line 252
    .line 253
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v25, 0x3f47ae14    # 0.78f

    .line 257
    .line 258
    .line 259
    const v26, 0x405b851f    # 3.43f

    .line 260
    .line 261
    .line 262
    const v22, 0x3f9d70a4    # 1.23f

    .line 263
    .line 264
    .line 265
    const v23, 0x3e947ae1    # 0.29f

    .line 266
    .line 267
    .line 268
    const v24, 0x4018f5c3    # 2.39f

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v25, 0x40975c29    # 4.73f

    .line 275
    .line 276
    .line 277
    const v26, -0x4048f5c3    # -1.43f

    .line 278
    .line 279
    .line 280
    const v21, 0x3fab851f    # 1.34f

    .line 281
    .line 282
    .line 283
    const v22, -0x40851eb8    # -0.98f

    .line 284
    .line 285
    .line 286
    const v23, 0x405b851f    # 3.43f

    .line 287
    .line 288
    .line 289
    const v24, -0x4048f5c3    # -1.43f

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v25, 0x3fc3d70a    # 1.53f

    .line 296
    .line 297
    .line 298
    const v26, 0x3e23d70a    # 0.16f

    .line 299
    .line 300
    .line 301
    const v21, 0x3ee147ae    # 0.44f

    .line 302
    .line 303
    .line 304
    const/16 v22, 0x0

    .line 305
    .line 306
    const v23, 0x3f7851ec    # 0.97f

    .line 307
    .line 308
    .line 309
    const v24, 0x3d4ccccd    # 0.05f

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v25, -0x4059999a    # -1.3f

    .line 316
    .line 317
    .line 318
    const v26, 0x3fee147b    # 1.86f

    .line 319
    .line 320
    .line 321
    const v21, -0x40deb852    # -0.63f

    .line 322
    .line 323
    .line 324
    const v22, 0x3f11eb85    # 0.57f

    .line 325
    .line 326
    .line 327
    const v23, -0x407851ec    # -1.06f

    .line 328
    .line 329
    .line 330
    const v24, 0x3f9c28f6    # 1.22f

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v25, -0x41947ae1    # -0.23f

    .line 337
    .line 338
    .line 339
    const v26, -0x43dc28f6    # -0.01f

    .line 340
    .line 341
    .line 342
    const v21, -0x425c28f6    # -0.08f

    .line 343
    .line 344
    .line 345
    const/16 v22, 0x0

    .line 346
    .line 347
    const v23, -0x41e66666    # -0.15f

    .line 348
    .line 349
    .line 350
    const v24, -0x43dc28f6    # -0.01f

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v25, -0x3f95c28f    # -3.66f

    .line 357
    .line 358
    .line 359
    const v26, 0x3f8e147b    # 1.11f

    .line 360
    .line 361
    .line 362
    const v21, -0x404f5c29    # -1.38f

    .line 363
    .line 364
    .line 365
    const v23, -0x3fc147ae    # -2.98f

    .line 366
    .line 367
    .line 368
    const v24, 0x3f11eb85    # 0.57f

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v25, 0x40b51eb8    # 5.66f

    .line 375
    .line 376
    .line 377
    const v26, 0x40370a3d    # 2.86f

    .line 378
    .line 379
    .line 380
    const v21, 0x3faf5c29    # 1.37f

    .line 381
    .line 382
    .line 383
    const v22, 0x3fd33333    # 1.65f

    .line 384
    .line 385
    .line 386
    const v23, 0x4058f5c3    # 3.39f

    .line 387
    .line 388
    .line 389
    const v24, 0x402eb852    # 2.73f

    .line 390
    .line 391
    .line 392
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const v4, -0x3fce147b    # -2.78f

    .line 396
    .line 397
    .line 398
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const/high16 v4, 0x41100000    # 9.0f

    .line 405
    .line 406
    const/high16 v6, 0x41800000    # 16.0f

    .line 407
    .line 408
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const/high16 v25, 0x40000000    # 2.0f

    .line 412
    .line 413
    const/high16 v26, 0x40000000    # 2.0f

    .line 414
    .line 415
    const v21, 0x3f8e147b    # 1.11f

    .line 416
    .line 417
    .line 418
    const/16 v22, 0x0

    .line 419
    .line 420
    const/high16 v23, 0x40000000    # 2.0f

    .line 421
    .line 422
    const v24, 0x3f63d70a    # 0.89f

    .line 423
    .line 424
    .line 425
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v25, -0x40000000    # -2.0f

    .line 429
    .line 430
    const/16 v21, 0x0

    .line 431
    .line 432
    const v22, 0x3f8e147b    # 1.11f

    .line 433
    .line 434
    .line 435
    const v23, -0x409c28f6    # -0.89f

    .line 436
    .line 437
    .line 438
    const/high16 v24, 0x40000000    # 2.0f

    .line 439
    .line 440
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const/high16 v26, -0x40000000    # -2.0f

    .line 444
    .line 445
    const v21, -0x4071eb85    # -1.11f

    .line 446
    .line 447
    .line 448
    const/16 v22, 0x0

    .line 449
    .line 450
    const/high16 v23, -0x40000000    # -2.0f

    .line 451
    .line 452
    const v24, -0x409c28f6    # -0.89f

    .line 453
    .line 454
    .line 455
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const/high16 v25, 0x40000000    # 2.0f

    .line 459
    .line 460
    const v21, -0x43dc28f6    # -0.01f

    .line 461
    .line 462
    .line 463
    const v22, -0x4071eb85    # -1.11f

    .line 464
    .line 465
    .line 466
    const v23, 0x3f63d70a    # 0.89f

    .line 467
    .line 468
    .line 469
    const/high16 v24, -0x40000000    # -2.0f

    .line 470
    .line 471
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const/high16 v4, 0x41500000    # 13.0f

    .line 478
    .line 479
    const/high16 v6, 0x41180000    # 9.5f

    .line 480
    .line 481
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 485
    .line 486
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 487
    .line 488
    const v21, -0x402ccccd    # -1.65f

    .line 489
    .line 490
    .line 491
    const/16 v22, 0x0

    .line 492
    .line 493
    const/high16 v23, -0x3fc00000    # -3.0f

    .line 494
    .line 495
    const v24, -0x40533333    # -1.35f

    .line 496
    .line 497
    .line 498
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const v4, 0x3faccccd    # 1.35f

    .line 502
    .line 503
    .line 504
    const/high16 v6, -0x3fc00000    # -3.0f

    .line 505
    .line 506
    const/high16 v7, 0x40400000    # 3.0f

    .line 507
    .line 508
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const/high16 v6, 0x40400000    # 3.0f

    .line 512
    .line 513
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const v4, -0x40533333    # -1.35f

    .line 517
    .line 518
    .line 519
    const/high16 v6, -0x3fc00000    # -3.0f

    .line 520
    .line 521
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 528
    .line 529
    .line 530
    move-result-object v2

    .line 531
    const v6, 0x3e99999a    # 0.3f

    .line 532
    .line 533
    .line 534
    const/4 v7, 0x0

    .line 535
    const-string v4, ""

    .line 536
    .line 537
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 538
    .line 539
    .line 540
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 541
    .line 542
    .line 543
    move-result v3

    .line 544
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 545
    .line 546
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 547
    .line 548
    .line 549
    move-result-wide v6

    .line 550
    const/4 v0, 0x0

    .line 551
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 552
    .line 553
    .line 554
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 555
    .line 556
    .line 557
    move-result v10

    .line 558
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 559
    .line 560
    .line 561
    move-result v11

    .line 562
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 565
    .line 566
    .line 567
    const/high16 v0, 0x41480000    # 12.5f

    .line 568
    .line 569
    const/high16 v2, 0x41200000    # 10.0f

    .line 570
    .line 571
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 575
    .line 576
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 577
    .line 578
    const v14, -0x402ccccd    # -1.65f

    .line 579
    .line 580
    .line 581
    const v15, -0x40533333    # -1.35f

    .line 582
    .line 583
    .line 584
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 585
    .line 586
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const v0, 0x3faccccd    # 1.35f

    .line 590
    .line 591
    .line 592
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 593
    .line 594
    const/high16 v4, 0x40400000    # 3.0f

    .line 595
    .line 596
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const/high16 v2, 0x40400000    # 3.0f

    .line 600
    .line 601
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const v0, -0x40533333    # -1.35f

    .line 605
    .line 606
    .line 607
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 608
    .line 609
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const/high16 v0, 0x41300000    # 11.0f

    .line 616
    .line 617
    const/high16 v2, 0x41180000    # 9.5f

    .line 618
    .line 619
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const/high16 v17, -0x40800000    # -1.0f

    .line 623
    .line 624
    const/high16 v18, -0x40800000    # -1.0f

    .line 625
    .line 626
    const v13, -0x40f33333    # -0.55f

    .line 627
    .line 628
    .line 629
    const/4 v14, 0x0

    .line 630
    const/high16 v15, -0x40800000    # -1.0f

    .line 631
    .line 632
    const v16, -0x4119999a    # -0.45f

    .line 633
    .line 634
    .line 635
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const v0, 0x3ee66666    # 0.45f

    .line 639
    .line 640
    .line 641
    const/high16 v2, -0x40800000    # -1.0f

    .line 642
    .line 643
    const/high16 v4, 0x3f800000    # 1.0f

    .line 644
    .line 645
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    const/high16 v2, 0x3f800000    # 1.0f

    .line 649
    .line 650
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const v0, -0x4119999a    # -0.45f

    .line 654
    .line 655
    .line 656
    const/high16 v2, -0x40800000    # -1.0f

    .line 657
    .line 658
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const/high16 v0, 0x41500000    # 13.0f

    .line 665
    .line 666
    const/high16 v2, 0x41800000    # 16.0f

    .line 667
    .line 668
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const/high16 v17, 0x40000000    # 2.0f

    .line 672
    .line 673
    const/high16 v18, -0x40000000    # -2.0f

    .line 674
    .line 675
    const v13, 0x3f8e147b    # 1.11f

    .line 676
    .line 677
    .line 678
    const/high16 v15, 0x40000000    # 2.0f

    .line 679
    .line 680
    const v16, -0x409c28f6    # -0.89f

    .line 681
    .line 682
    .line 683
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 684
    .line 685
    .line 686
    const/high16 v17, -0x40000000    # -2.0f

    .line 687
    .line 688
    const/4 v13, 0x0

    .line 689
    const v14, -0x4071eb85    # -1.11f

    .line 690
    .line 691
    .line 692
    const v15, -0x409c28f6    # -0.89f

    .line 693
    .line 694
    .line 695
    const/high16 v16, -0x40000000    # -2.0f

    .line 696
    .line 697
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    const/high16 v18, 0x40000000    # 2.0f

    .line 701
    .line 702
    const v13, -0x4071eb85    # -1.11f

    .line 703
    .line 704
    .line 705
    const/4 v14, 0x0

    .line 706
    const v15, -0x3fff5c29    # -2.01f

    .line 707
    .line 708
    .line 709
    const v16, 0x3f63d70a    # 0.89f

    .line 710
    .line 711
    .line 712
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 713
    .line 714
    .line 715
    const/high16 v17, 0x40000000    # 2.0f

    .line 716
    .line 717
    const/4 v13, 0x0

    .line 718
    const v14, 0x3f8e147b    # 1.11f

    .line 719
    .line 720
    .line 721
    const v15, 0x3f63d70a    # 0.89f

    .line 722
    .line 723
    .line 724
    const/high16 v16, 0x40000000    # 2.0f

    .line 725
    .line 726
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 727
    .line 728
    .line 729
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    const v0, 0x413fd70a    # 11.99f

    .line 733
    .line 734
    .line 735
    const v2, 0x4000a3d7    # 2.01f

    .line 736
    .line 737
    .line 738
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 739
    .line 740
    .line 741
    const/high16 v17, -0x3ee00000    # -10.0f

    .line 742
    .line 743
    const/high16 v18, 0x41200000    # 10.0f

    .line 744
    .line 745
    const v13, -0x3f4f5c29    # -5.52f

    .line 746
    .line 747
    .line 748
    const/4 v14, 0x0

    .line 749
    const/high16 v15, -0x3ee00000    # -10.0f

    .line 750
    .line 751
    const v16, 0x408f5c29    # 4.48f

    .line 752
    .line 753
    .line 754
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 755
    .line 756
    .line 757
    const v0, 0x408f5c29    # 4.48f

    .line 758
    .line 759
    .line 760
    const/high16 v2, 0x41200000    # 10.0f

    .line 761
    .line 762
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 763
    .line 764
    .line 765
    const v0, -0x3f70a3d7    # -4.48f

    .line 766
    .line 767
    .line 768
    const/high16 v2, -0x3ee00000    # -10.0f

    .line 769
    .line 770
    const/high16 v4, 0x41200000    # 10.0f

    .line 771
    .line 772
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 773
    .line 774
    .line 775
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 776
    .line 777
    .line 778
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 779
    .line 780
    .line 781
    const v0, 0x40bae148    # 5.84f

    .line 782
    .line 783
    .line 784
    const v2, 0x4188f5c3    # 17.12f

    .line 785
    .line 786
    .line 787
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 788
    .line 789
    .line 790
    const v17, 0x406a3d71    # 3.66f

    .line 791
    .line 792
    .line 793
    const v18, -0x4071eb85    # -1.11f

    .line 794
    .line 795
    .line 796
    const v13, 0x3f2e147b    # 0.68f

    .line 797
    .line 798
    .line 799
    const v14, -0x40f5c28f    # -0.54f

    .line 800
    .line 801
    .line 802
    const v15, 0x401147ae    # 2.27f

    .line 803
    .line 804
    .line 805
    const v16, -0x4071eb85    # -1.11f

    .line 806
    .line 807
    .line 808
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 809
    .line 810
    .line 811
    const v17, 0x3e6b851f    # 0.23f

    .line 812
    .line 813
    .line 814
    const v18, 0x3c23d70a    # 0.01f

    .line 815
    .line 816
    .line 817
    const v13, 0x3d8f5c29    # 0.07f

    .line 818
    .line 819
    .line 820
    const/4 v14, 0x0

    .line 821
    const v15, 0x3e19999a    # 0.15f

    .line 822
    .line 823
    .line 824
    const v16, 0x3c23d70a    # 0.01f

    .line 825
    .line 826
    .line 827
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 828
    .line 829
    .line 830
    const v17, 0x3fa66666    # 1.3f

    .line 831
    .line 832
    .line 833
    const v18, -0x4011eb85    # -1.86f

    .line 834
    .line 835
    .line 836
    const v13, 0x3e75c28f    # 0.24f

    .line 837
    .line 838
    .line 839
    const v14, -0x40dc28f6    # -0.64f

    .line 840
    .line 841
    .line 842
    const v15, 0x3f2b851f    # 0.67f

    .line 843
    .line 844
    .line 845
    const v16, -0x405ae148    # -1.29f

    .line 846
    .line 847
    .line 848
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 849
    .line 850
    .line 851
    const v17, -0x403c28f6    # -1.53f

    .line 852
    .line 853
    .line 854
    const v18, -0x41dc28f6    # -0.16f

    .line 855
    .line 856
    .line 857
    const v13, -0x40f0a3d7    # -0.56f

    .line 858
    .line 859
    .line 860
    const v14, -0x42333333    # -0.1f

    .line 861
    .line 862
    .line 863
    const v15, -0x40747ae1    # -1.09f

    .line 864
    .line 865
    .line 866
    const v16, -0x41dc28f6    # -0.16f

    .line 867
    .line 868
    .line 869
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 870
    .line 871
    .line 872
    const v17, -0x3f68a3d7    # -4.73f

    .line 873
    .line 874
    .line 875
    const v18, 0x3fb70a3d    # 1.43f

    .line 876
    .line 877
    .line 878
    const v13, -0x4059999a    # -1.3f

    .line 879
    .line 880
    .line 881
    const/4 v14, 0x0

    .line 882
    const v15, -0x3fa70a3d    # -3.39f

    .line 883
    .line 884
    .line 885
    const v16, 0x3ee66666    # 0.45f

    .line 886
    .line 887
    .line 888
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 889
    .line 890
    .line 891
    const v17, -0x40b851ec    # -0.78f

    .line 892
    .line 893
    .line 894
    const v18, -0x3fa47ae1    # -3.43f

    .line 895
    .line 896
    .line 897
    const/high16 v13, -0x41000000    # -0.5f

    .line 898
    .line 899
    const v14, -0x407ae148    # -1.04f

    .line 900
    .line 901
    .line 902
    const v15, -0x40b851ec    # -0.78f

    .line 903
    .line 904
    .line 905
    const v16, -0x3ff33333    # -2.2f

    .line 906
    .line 907
    .line 908
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 909
    .line 910
    .line 911
    const/high16 v17, 0x41000000    # 8.0f

    .line 912
    .line 913
    const/high16 v18, -0x3f000000    # -8.0f

    .line 914
    .line 915
    const/4 v13, 0x0

    .line 916
    const v14, -0x3f72e148    # -4.41f

    .line 917
    .line 918
    .line 919
    const v15, 0x4065c28f    # 3.59f

    .line 920
    .line 921
    .line 922
    const/high16 v16, -0x3f000000    # -8.0f

    .line 923
    .line 924
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 925
    .line 926
    .line 927
    const v0, 0x4065c28f    # 3.59f

    .line 928
    .line 929
    .line 930
    const/high16 v2, 0x41000000    # 8.0f

    .line 931
    .line 932
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 933
    .line 934
    .line 935
    const/high16 v17, -0x40c00000    # -0.75f

    .line 936
    .line 937
    const v18, 0x4057ae14    # 3.37f

    .line 938
    .line 939
    .line 940
    const v14, 0x3f99999a    # 1.2f

    .line 941
    .line 942
    .line 943
    const v15, -0x4175c28f    # -0.27f

    .line 944
    .line 945
    .line 946
    const v16, 0x4015c28f    # 2.34f

    .line 947
    .line 948
    .line 949
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 950
    .line 951
    .line 952
    const v17, -0x3fb0a3d7    # -3.24f

    .line 953
    .line 954
    .line 955
    const v18, -0x40a147ae    # -0.87f

    .line 956
    .line 957
    .line 958
    const/high16 v13, -0x40800000    # -1.0f

    .line 959
    .line 960
    const v14, -0x40e8f5c3    # -0.59f

    .line 961
    .line 962
    .line 963
    const v15, -0x3fe8f5c3    # -2.36f

    .line 964
    .line 965
    .line 966
    const v16, -0x40a147ae    # -0.87f

    .line 967
    .line 968
    .line 969
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 970
    .line 971
    .line 972
    const/high16 v17, -0x3f700000    # -4.5f

    .line 973
    .line 974
    const v18, 0x402ccccd    # 2.7f

    .line 975
    .line 976
    .line 977
    const v13, -0x403d70a4    # -1.52f

    .line 978
    .line 979
    .line 980
    const/4 v14, 0x0

    .line 981
    const/high16 v15, -0x3f700000    # -4.5f

    .line 982
    .line 983
    const v16, 0x3f4f5c29    # 0.81f

    .line 984
    .line 985
    .line 986
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 987
    .line 988
    .line 989
    const v0, 0x4031eb85    # 2.78f

    .line 990
    .line 991
    .line 992
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 993
    .line 994
    .line 995
    const v17, -0x3f4ae148    # -5.66f

    .line 996
    .line 997
    .line 998
    const v18, -0x3fc8f5c3    # -2.86f

    .line 999
    .line 1000
    .line 1001
    const v13, -0x3feeb852    # -2.27f

    .line 1002
    .line 1003
    .line 1004
    const v14, -0x41fae148    # -0.13f

    .line 1005
    .line 1006
    .line 1007
    const v15, -0x3f76b852    # -4.29f

    .line 1008
    .line 1009
    .line 1010
    const v16, -0x40651eb8    # -1.21f

    .line 1011
    .line 1012
    .line 1013
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1014
    .line 1015
    .line 1016
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1017
    .line 1018
    .line 1019
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v2

    .line 1023
    const/16 v16, 0x3800

    .line 1024
    .line 1025
    const/16 v17, 0x0

    .line 1026
    .line 1027
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1028
    .line 1029
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1030
    .line 1031
    const/4 v7, 0x0

    .line 1032
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1033
    .line 1034
    const/4 v13, 0x0

    .line 1035
    const/4 v14, 0x0

    .line 1036
    const/4 v15, 0x0

    .line 1037
    const-string v4, ""

    .line 1038
    .line 1039
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v0

    .line 1043
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v0

    .line 1047
    sput-object v0, Landroidx/compose/material/icons/twotone/SupervisedUserCircleKt;->_supervisedUserCircle:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1048
    .line 1049
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1050
    .line 1051
    .line 1052
    return-object v0
.end method
