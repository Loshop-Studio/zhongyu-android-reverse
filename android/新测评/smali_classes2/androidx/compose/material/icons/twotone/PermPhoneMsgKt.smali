.class public final Landroidx/compose/material/icons/twotone/PermPhoneMsgKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_permPhoneMsg",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "PermPhoneMsg",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getPermPhoneMsg",
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
        "SMAP\nPermPhoneMsg.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermPhoneMsg.kt\nandroidx/compose/material/icons/twotone/PermPhoneMsgKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,98:1\n212#2,12:99\n233#2,18:112\n253#2:149\n233#2,18:150\n253#2:187\n174#3:111\n705#4,2:130\n717#4,2:132\n719#4,11:138\n705#4,2:168\n717#4,2:170\n719#4,11:176\n72#5,4:134\n72#5,4:172\n*S KotlinDebug\n*F\n+ 1 PermPhoneMsg.kt\nandroidx/compose/material/icons/twotone/PermPhoneMsgKt\n*L\n29#1:99,12\n30#1:112,18\n30#1:149\n49#1:150,18\n49#1:187\n29#1:111\n30#1:130,2\n30#1:132,2\n30#1:138,11\n49#1:168,2\n49#1:170,2\n49#1:176,11\n30#1:134,4\n49#1:172,4\n*E\n"
    }
.end annotation


# static fields
.field private static _permPhoneMsg:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPermPhoneMsg(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PermPhoneMsgKt;->_permPhoneMsg:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.PermPhoneMsg"

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
    const v4, 0x41733333    # 15.2f

    .line 71
    .line 72
    .line 73
    const v6, 0x4191ae14    # 18.21f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, 0x40733333    # 3.8f

    .line 80
    .line 81
    .line 82
    const v26, 0x3f428f5c    # 0.76f

    .line 83
    .line 84
    .line 85
    const v21, 0x3f9ae148    # 1.21f

    .line 86
    .line 87
    .line 88
    const v22, 0x3ed1eb85    # 0.41f

    .line 89
    .line 90
    .line 91
    const v23, 0x401eb852    # 2.48f

    .line 92
    .line 93
    .line 94
    const v24, 0x3f2b851f    # 0.67f

    .line 95
    .line 96
    .line 97
    move-object/from16 v20, v2

    .line 98
    .line 99
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v4, -0x40400000    # -1.5f

    .line 103
    .line 104
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const v25, -0x3fd9999a    # -2.6f

    .line 108
    .line 109
    .line 110
    const v26, -0x4119999a    # -0.45f

    .line 111
    .line 112
    .line 113
    const v21, -0x409eb852    # -0.88f

    .line 114
    .line 115
    .line 116
    const v22, -0x4270a3d7    # -0.07f

    .line 117
    .line 118
    .line 119
    const/high16 v23, -0x40200000    # -1.75f

    .line 120
    .line 121
    const v24, -0x419eb852    # -0.22f

    .line 122
    .line 123
    .line 124
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v4, 0x3f9851ec    # 1.19f

    .line 128
    .line 129
    .line 130
    const v6, -0x40666666    # -1.2f

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v4, 0x40d147ae    # 6.54f

    .line 140
    .line 141
    .line 142
    const/high16 v6, 0x40a00000    # 5.0f

    .line 143
    .line 144
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v4, -0x40400000    # -1.5f

    .line 148
    .line 149
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v25, 0x3f400000    # 0.75f

    .line 153
    .line 154
    const v26, 0x40728f5c    # 3.79f

    .line 155
    .line 156
    .line 157
    const v21, 0x3db851ec    # 0.09f

    .line 158
    .line 159
    .line 160
    const v22, 0x3fa8f5c3    # 1.32f

    .line 161
    .line 162
    .line 163
    const v23, 0x3eb33333    # 0.35f

    .line 164
    .line 165
    .line 166
    const v24, 0x4025c28f    # 2.59f

    .line 167
    .line 168
    .line 169
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v4, -0x40651eb8    # -1.21f

    .line 173
    .line 174
    .line 175
    const v6, 0x3f99999a    # 1.2f

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v25, -0x4119999a    # -0.45f

    .line 182
    .line 183
    .line 184
    const v26, -0x3fdae148    # -2.58f

    .line 185
    .line 186
    .line 187
    const v21, -0x418a3d71    # -0.24f

    .line 188
    .line 189
    .line 190
    const v22, -0x40ab851f    # -0.83f

    .line 191
    .line 192
    .line 193
    const v23, -0x413851ec    # -0.39f

    .line 194
    .line 195
    .line 196
    const v24, -0x40266666    # -1.7f

    .line 197
    .line 198
    .line 199
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v4, 0x41000000    # 8.0f

    .line 206
    .line 207
    const/high16 v6, 0x41600000    # 14.0f

    .line 208
    .line 209
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v4, 0x40a00000    # 5.0f

    .line 213
    .line 214
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v4, -0x3f600000    # -5.0f

    .line 221
    .line 222
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    const/16 v16, 0x3800

    .line 233
    .line 234
    const/16 v17, 0x0

    .line 235
    .line 236
    const v6, 0x3e99999a    # 0.3f

    .line 237
    .line 238
    .line 239
    const v8, 0x3e99999a    # 0.3f

    .line 240
    .line 241
    .line 242
    const/4 v7, 0x0

    .line 243
    const/high16 v9, 0x3f800000    # 1.0f

    .line 244
    .line 245
    const/high16 v12, 0x3f800000    # 1.0f

    .line 246
    .line 247
    const/4 v13, 0x0

    .line 248
    const/4 v14, 0x0

    .line 249
    const/4 v15, 0x0

    .line 250
    const-string v4, ""

    .line 251
    .line 252
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 253
    .line 254
    .line 255
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 256
    .line 257
    .line 258
    move-result v3

    .line 259
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 260
    .line 261
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 262
    .line 263
    .line 264
    move-result-wide v6

    .line 265
    const/4 v0, 0x0

    .line 266
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 270
    .line 271
    .line 272
    move-result v10

    .line 273
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 274
    .line 275
    .line 276
    move-result v11

    .line 277
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 280
    .line 281
    .line 282
    const/high16 v0, 0x41a00000    # 20.0f

    .line 283
    .line 284
    const/high16 v2, 0x41780000    # 15.5f

    .line 285
    .line 286
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v17, -0x3f9b851f    # -3.57f

    .line 290
    .line 291
    .line 292
    const v18, -0x40ee147b    # -0.57f

    .line 293
    .line 294
    .line 295
    const/high16 v13, -0x40600000    # -1.25f

    .line 296
    .line 297
    const v15, -0x3fe33333    # -2.45f

    .line 298
    .line 299
    .line 300
    const v16, -0x41b33333    # -0.2f

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v17, -0x416147ae    # -0.31f

    .line 307
    .line 308
    .line 309
    const v18, -0x42b33333    # -0.05f

    .line 310
    .line 311
    .line 312
    const v13, -0x42333333    # -0.1f

    .line 313
    .line 314
    .line 315
    const v14, -0x430a3d71    # -0.03f

    .line 316
    .line 317
    .line 318
    const v15, -0x41a8f5c3    # -0.21f

    .line 319
    .line 320
    .line 321
    const v16, -0x42b33333    # -0.05f

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v17, -0x40ca3d71    # -0.71f

    .line 328
    .line 329
    .line 330
    const v18, 0x3e947ae1    # 0.29f

    .line 331
    .line 332
    .line 333
    const v13, -0x417ae148    # -0.26f

    .line 334
    .line 335
    .line 336
    const/4 v14, 0x0

    .line 337
    const v15, -0x40fd70a4    # -0.51f

    .line 338
    .line 339
    .line 340
    const v16, 0x3dcccccd    # 0.1f

    .line 341
    .line 342
    .line 343
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v0, -0x3ff33333    # -2.2f

    .line 347
    .line 348
    .line 349
    const v2, 0x400ccccd    # 2.2f

    .line 350
    .line 351
    .line 352
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v17, -0x3f2d1eb8    # -6.59f

    .line 356
    .line 357
    .line 358
    const v18, -0x3f2d70a4    # -6.58f

    .line 359
    .line 360
    .line 361
    const v13, -0x3fcae148    # -2.83f

    .line 362
    .line 363
    .line 364
    const v14, -0x4047ae14    # -1.44f

    .line 365
    .line 366
    .line 367
    const v15, -0x3f5b3333    # -5.15f

    .line 368
    .line 369
    .line 370
    const/high16 v16, -0x3f900000    # -3.75f

    .line 371
    .line 372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v0, -0x3ff28f5c    # -2.21f

    .line 376
    .line 377
    .line 378
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v17, 0x3e800000    # 0.25f

    .line 382
    .line 383
    const v18, -0x407eb852    # -1.01f

    .line 384
    .line 385
    .line 386
    const v13, 0x3e8f5c29    # 0.28f

    .line 387
    .line 388
    .line 389
    const v14, -0x4175c28f    # -0.27f

    .line 390
    .line 391
    .line 392
    const v15, 0x3eb851ec    # 0.36f

    .line 393
    .line 394
    .line 395
    const v16, -0x40d70a3d    # -0.66f

    .line 396
    .line 397
    .line 398
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/high16 v17, 0x41080000    # 8.5f

    .line 402
    .line 403
    const/high16 v18, 0x40800000    # 4.0f

    .line 404
    .line 405
    const v13, 0x410b3333    # 8.7f

    .line 406
    .line 407
    .line 408
    const v14, 0x40ce6666    # 6.45f

    .line 409
    .line 410
    .line 411
    const/high16 v15, 0x41080000    # 8.5f

    .line 412
    .line 413
    const/high16 v16, 0x40a80000    # 5.25f

    .line 414
    .line 415
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const/high16 v17, -0x40800000    # -1.0f

    .line 419
    .line 420
    const/high16 v18, -0x40800000    # -1.0f

    .line 421
    .line 422
    const/4 v13, 0x0

    .line 423
    const v14, -0x40f33333    # -0.55f

    .line 424
    .line 425
    .line 426
    const v15, -0x4119999a    # -0.45f

    .line 427
    .line 428
    .line 429
    const/high16 v16, -0x40800000    # -1.0f

    .line 430
    .line 431
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/high16 v0, 0x40800000    # 4.0f

    .line 435
    .line 436
    const/high16 v2, 0x40400000    # 3.0f

    .line 437
    .line 438
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v18, 0x3f800000    # 1.0f

    .line 442
    .line 443
    const v13, -0x40f33333    # -0.55f

    .line 444
    .line 445
    .line 446
    const/4 v14, 0x0

    .line 447
    const/high16 v15, -0x40800000    # -1.0f

    .line 448
    .line 449
    const v16, 0x3ee66666    # 0.45f

    .line 450
    .line 451
    .line 452
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const/high16 v17, 0x41880000    # 17.0f

    .line 456
    .line 457
    const/high16 v18, 0x41880000    # 17.0f

    .line 458
    .line 459
    const/4 v13, 0x0

    .line 460
    const v14, 0x41163d71    # 9.39f

    .line 461
    .line 462
    .line 463
    const v15, 0x40f3851f    # 7.61f

    .line 464
    .line 465
    .line 466
    const/high16 v16, 0x41880000    # 17.0f

    .line 467
    .line 468
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const/high16 v17, 0x3f800000    # 1.0f

    .line 472
    .line 473
    const/high16 v18, -0x40800000    # -1.0f

    .line 474
    .line 475
    const v13, 0x3f0ccccd    # 0.55f

    .line 476
    .line 477
    .line 478
    const/4 v14, 0x0

    .line 479
    const/high16 v15, 0x3f800000    # 1.0f

    .line 480
    .line 481
    const v16, -0x4119999a    # -0.45f

    .line 482
    .line 483
    .line 484
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const/high16 v0, -0x3fa00000    # -3.5f

    .line 488
    .line 489
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const/high16 v17, -0x40800000    # -1.0f

    .line 493
    .line 494
    const/4 v13, 0x0

    .line 495
    const v14, -0x40f33333    # -0.55f

    .line 496
    .line 497
    .line 498
    const v15, -0x4119999a    # -0.45f

    .line 499
    .line 500
    .line 501
    const/high16 v16, -0x40800000    # -1.0f

    .line 502
    .line 503
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const v0, 0x40a0f5c3    # 5.03f

    .line 510
    .line 511
    .line 512
    const/high16 v2, 0x40a00000    # 5.0f

    .line 513
    .line 514
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 518
    .line 519
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const v17, 0x3eeb851f    # 0.46f

    .line 523
    .line 524
    .line 525
    const v18, 0x4025c28f    # 2.59f

    .line 526
    .line 527
    .line 528
    const v13, 0x3d8f5c29    # 0.07f

    .line 529
    .line 530
    .line 531
    const v14, 0x3f6147ae    # 0.88f

    .line 532
    .line 533
    .line 534
    const v15, 0x3e6147ae    # 0.22f

    .line 535
    .line 536
    .line 537
    const/high16 v16, 0x3fe00000    # 1.75f

    .line 538
    .line 539
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const v0, 0x40b947ae    # 5.79f

    .line 543
    .line 544
    .line 545
    const v2, 0x410ccccd    # 8.8f

    .line 546
    .line 547
    .line 548
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v17, -0x40bd70a4    # -0.76f

    .line 552
    .line 553
    .line 554
    const v18, -0x3f8ccccd    # -3.8f

    .line 555
    .line 556
    .line 557
    const v13, -0x412e147b    # -0.41f

    .line 558
    .line 559
    .line 560
    const v14, -0x40651eb8    # -1.21f

    .line 561
    .line 562
    .line 563
    const v15, -0x40d47ae1    # -0.67f

    .line 564
    .line 565
    .line 566
    const v16, -0x3fe147ae    # -2.48f

    .line 567
    .line 568
    .line 569
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const v0, 0x4197c28f    # 18.97f

    .line 576
    .line 577
    .line 578
    const/high16 v2, 0x41980000    # 19.0f

    .line 579
    .line 580
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const v17, -0x3f8ccccd    # -3.8f

    .line 584
    .line 585
    .line 586
    const v18, -0x40bd70a4    # -0.76f

    .line 587
    .line 588
    .line 589
    const v13, -0x40570a3d    # -1.32f

    .line 590
    .line 591
    .line 592
    const v14, -0x4247ae14    # -0.09f

    .line 593
    .line 594
    .line 595
    const v15, -0x3fd9999a    # -2.6f

    .line 596
    .line 597
    .line 598
    const v16, -0x414ccccd    # -0.35f

    .line 599
    .line 600
    .line 601
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const v0, 0x3f99999a    # 1.2f

    .line 605
    .line 606
    .line 607
    const v2, -0x40666666    # -1.2f

    .line 608
    .line 609
    .line 610
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const v17, 0x40266666    # 2.6f

    .line 614
    .line 615
    .line 616
    const v18, 0x3ee66666    # 0.45f

    .line 617
    .line 618
    .line 619
    const v13, 0x3f59999a    # 0.85f

    .line 620
    .line 621
    .line 622
    const v14, 0x3e75c28f    # 0.24f

    .line 623
    .line 624
    .line 625
    const v15, 0x3fdc28f6    # 1.72f

    .line 626
    .line 627
    .line 628
    const v16, 0x3ec7ae14    # 0.39f

    .line 629
    .line 630
    .line 631
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const v0, 0x3fc147ae    # 1.51f

    .line 635
    .line 636
    .line 637
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const/high16 v0, 0x41400000    # 12.0f

    .line 644
    .line 645
    const/high16 v2, 0x40400000    # 3.0f

    .line 646
    .line 647
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const/high16 v0, 0x41200000    # 10.0f

    .line 651
    .line 652
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 656
    .line 657
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const/high16 v0, 0x40c00000    # 6.0f

    .line 661
    .line 662
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    const/high16 v0, 0x41a80000    # 21.0f

    .line 666
    .line 667
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const/high16 v0, -0x3ef00000    # -9.0f

    .line 671
    .line 672
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const/high16 v0, 0x41980000    # 19.0f

    .line 679
    .line 680
    const/high16 v2, 0x41000000    # 8.0f

    .line 681
    .line 682
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 683
    .line 684
    .line 685
    const/high16 v0, -0x3f600000    # -5.0f

    .line 686
    .line 687
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    const/high16 v0, 0x41600000    # 14.0f

    .line 691
    .line 692
    const/high16 v2, 0x40a00000    # 5.0f

    .line 693
    .line 694
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    const/high16 v0, 0x40a00000    # 5.0f

    .line 698
    .line 699
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    .line 702
    const/high16 v0, 0x40400000    # 3.0f

    .line 703
    .line 704
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 705
    .line 706
    .line 707
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 711
    .line 712
    .line 713
    move-result-object v2

    .line 714
    const/16 v16, 0x3800

    .line 715
    .line 716
    const/16 v17, 0x0

    .line 717
    .line 718
    const/high16 v6, 0x3f800000    # 1.0f

    .line 719
    .line 720
    const/high16 v8, 0x3f800000    # 1.0f

    .line 721
    .line 722
    const/4 v7, 0x0

    .line 723
    const/high16 v12, 0x3f800000    # 1.0f

    .line 724
    .line 725
    const/4 v13, 0x0

    .line 726
    const/4 v14, 0x0

    .line 727
    const/4 v15, 0x0

    .line 728
    const-string v4, ""

    .line 729
    .line 730
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 731
    .line 732
    .line 733
    move-result-object v0

    .line 734
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 735
    .line 736
    .line 737
    move-result-object v0

    .line 738
    sput-object v0, Landroidx/compose/material/icons/twotone/PermPhoneMsgKt;->_permPhoneMsg:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 739
    .line 740
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 741
    .line 742
    .line 743
    return-object v0
.end method
