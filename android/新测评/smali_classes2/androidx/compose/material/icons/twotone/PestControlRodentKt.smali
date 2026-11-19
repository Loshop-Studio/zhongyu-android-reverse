.class public final Landroidx/compose/material/icons/twotone/PestControlRodentKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_pestControlRodent",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "PestControlRodent",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getPestControlRodent",
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
        "SMAP\nPestControlRodent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PestControlRodent.kt\nandroidx/compose/material/icons/twotone/PestControlRodentKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,108:1\n212#2,12:109\n233#2,18:122\n253#2:159\n233#2,18:160\n253#2:197\n233#2,18:198\n253#2:235\n174#3:121\n705#4,2:140\n717#4,2:142\n719#4,11:148\n705#4,2:178\n717#4,2:180\n719#4,11:186\n705#4,2:216\n717#4,2:218\n719#4,11:224\n72#5,4:144\n72#5,4:182\n72#5,4:220\n*S KotlinDebug\n*F\n+ 1 PestControlRodent.kt\nandroidx/compose/material/icons/twotone/PestControlRodentKt\n*L\n29#1:109,12\n30#1:122,18\n30#1:159\n55#1:160,18\n55#1:197\n61#1:198,18\n61#1:235\n29#1:121\n30#1:140,2\n30#1:142,2\n30#1:148,11\n55#1:178,2\n55#1:180,2\n55#1:186,11\n61#1:216,2\n61#1:218,2\n61#1:224,11\n30#1:144,4\n55#1:182,4\n61#1:220,4\n*E\n"
    }
.end annotation


# static fields
.field private static _pestControlRodent:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPestControlRodent(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PestControlRodentKt;->_pestControlRodent:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.PestControlRodent"

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
    const/high16 v4, 0x416c0000    # 14.75f

    .line 71
    .line 72
    const v6, 0x418d3333    # 17.65f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v25, 0x41900000    # 18.0f

    .line 79
    .line 80
    const/high16 v26, 0x41580000    # 13.5f

    .line 81
    .line 82
    const v21, 0x418ef5c3    # 17.87f

    .line 83
    .line 84
    .line 85
    const v22, 0x4166147b    # 14.38f

    .line 86
    .line 87
    .line 88
    const/high16 v23, 0x41900000    # 18.0f

    .line 89
    .line 90
    const v24, 0x415f5c29    # 13.96f

    .line 91
    .line 92
    .line 93
    move-object/from16 v20, v2

    .line 94
    .line 95
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v25, -0x3fe00000    # -2.5f

    .line 99
    .line 100
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 101
    .line 102
    const/16 v21, 0x0

    .line 103
    .line 104
    const v22, -0x404f5c29    # -1.38f

    .line 105
    .line 106
    .line 107
    const v23, -0x4070a3d7    # -1.12f

    .line 108
    .line 109
    .line 110
    const/high16 v24, -0x3fe00000    # -2.5f

    .line 111
    .line 112
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v26, 0x40200000    # 2.5f

    .line 116
    .line 117
    const v21, -0x4059999a    # -1.3f

    .line 118
    .line 119
    .line 120
    const/16 v22, 0x0

    .line 121
    .line 122
    const/high16 v23, -0x3fe00000    # -2.5f

    .line 123
    .line 124
    const v24, 0x3f8a3d71    # 1.08f

    .line 125
    .line 126
    .line 127
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v25, 0x3f3ae148    # 0.73f

    .line 131
    .line 132
    .line 133
    const v26, 0x3fe28f5c    # 1.77f

    .line 134
    .line 135
    .line 136
    const/16 v21, 0x0

    .line 137
    .line 138
    const v22, 0x3f30a3d7    # 0.69f

    .line 139
    .line 140
    .line 141
    const v23, 0x3e8f5c29    # 0.28f

    .line 142
    .line 143
    .line 144
    const v24, 0x3fa8f5c3    # 1.32f

    .line 145
    .line 146
    .line 147
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v4, 0x3fb47ae1    # 1.41f

    .line 151
    .line 152
    .line 153
    const v6, -0x404b851f    # -1.41f

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v25, 0x41300000    # 11.0f

    .line 160
    .line 161
    const/high16 v26, 0x41580000    # 13.5f

    .line 162
    .line 163
    const/high16 v21, 0x41380000    # 11.5f

    .line 164
    .line 165
    const v22, 0x417deb85    # 15.87f

    .line 166
    .line 167
    .line 168
    const/high16 v23, 0x41300000    # 11.0f

    .line 169
    .line 170
    const v24, 0x416bd70a    # 14.74f

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/high16 v25, 0x3f400000    # 0.75f

    .line 177
    .line 178
    const v26, -0x3fe1eb85    # -2.47f

    .line 179
    .line 180
    .line 181
    const/16 v21, 0x0

    .line 182
    .line 183
    const v22, -0x40947ae1    # -0.92f

    .line 184
    .line 185
    .line 186
    const v23, 0x3e8f5c29    # 0.28f

    .line 187
    .line 188
    .line 189
    const v24, -0x401eb852    # -1.76f

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v25, -0x40d47ae1    # -0.67f

    .line 196
    .line 197
    .line 198
    const v26, 0x3d8f5c29    # 0.07f

    .line 199
    .line 200
    .line 201
    const v21, -0x419eb852    # -0.22f

    .line 202
    .line 203
    .line 204
    const v22, 0x3c23d70a    # 0.01f

    .line 205
    .line 206
    .line 207
    const v23, -0x411eb852    # -0.44f

    .line 208
    .line 209
    .line 210
    const v24, 0x3ca3d70a    # 0.02f

    .line 211
    .line 212
    .line 213
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v25, -0x3fc0a3d7    # -2.99f

    .line 217
    .line 218
    .line 219
    const v26, 0x4040a3d7    # 3.01f

    .line 220
    .line 221
    .line 222
    const v21, -0x40428f5c    # -1.48f

    .line 223
    .line 224
    .line 225
    const v22, 0x3ea3d70a    # 0.32f

    .line 226
    .line 227
    .line 228
    const v23, -0x3fd47ae1    # -2.68f

    .line 229
    .line 230
    .line 231
    const v24, 0x3fc3d70a    # 1.53f

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v25, 0x3f4ccccd    # 0.8f

    .line 238
    .line 239
    .line 240
    const v26, 0x405a3d71    # 3.41f

    .line 241
    .line 242
    .line 243
    const v21, -0x417ae148    # -0.26f

    .line 244
    .line 245
    .line 246
    const v22, 0x3f9eb852    # 1.24f

    .line 247
    .line 248
    .line 249
    const v23, 0x3ca3d70a    # 0.02f

    .line 250
    .line 251
    .line 252
    const v24, 0x401ccccd    # 2.45f

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v25, 0x41400000    # 12.0f

    .line 259
    .line 260
    const/high16 v26, 0x41980000    # 19.0f

    .line 261
    .line 262
    const v21, 0x411a8f5c    # 9.66f

    .line 263
    .line 264
    .line 265
    const v22, 0x4193ae14    # 18.46f

    .line 266
    .line 267
    .line 268
    const v23, 0x412ca3d7    # 10.79f

    .line 269
    .line 270
    .line 271
    const/high16 v24, 0x41980000    # 19.0f

    .line 272
    .line 273
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v4, 0x40d0f5c3    # 6.53f

    .line 277
    .line 278
    .line 279
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v25, 0x3fbc28f6    # 1.47f

    .line 283
    .line 284
    .line 285
    const v26, -0x4043d70a    # -1.47f

    .line 286
    .line 287
    .line 288
    const v21, 0x3f4f5c29    # 0.81f

    .line 289
    .line 290
    .line 291
    const/16 v22, 0x0

    .line 292
    .line 293
    const v23, 0x3fbc28f6    # 1.47f

    .line 294
    .line 295
    .line 296
    const v24, -0x40d70a3d    # -0.66f

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v25, -0x410a3d71    # -0.48f

    .line 303
    .line 304
    .line 305
    const v26, -0x40747ae1    # -1.09f

    .line 306
    .line 307
    .line 308
    const/16 v21, 0x0

    .line 309
    .line 310
    const v22, -0x412e147b    # -0.41f

    .line 311
    .line 312
    .line 313
    const v23, -0x41d1eb85    # -0.17f

    .line 314
    .line 315
    .line 316
    const v24, -0x40b0a3d7    # -0.81f

    .line 317
    .line 318
    .line 319
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/high16 v4, 0x416c0000    # 14.75f

    .line 323
    .line 324
    const v6, 0x418d3333    # 17.65f

    .line 325
    .line 326
    .line 327
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const/high16 v4, 0x41900000    # 18.0f

    .line 334
    .line 335
    const/high16 v6, 0x41880000    # 17.0f

    .line 336
    .line 337
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v25, -0x40800000    # -1.0f

    .line 341
    .line 342
    const/high16 v26, -0x40800000    # -1.0f

    .line 343
    .line 344
    const v21, -0x40f33333    # -0.55f

    .line 345
    .line 346
    .line 347
    const/16 v22, 0x0

    .line 348
    .line 349
    const/high16 v23, -0x40800000    # -1.0f

    .line 350
    .line 351
    const v24, -0x4119999a    # -0.45f

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v25, 0x3f800000    # 1.0f

    .line 358
    .line 359
    const/16 v21, 0x0

    .line 360
    .line 361
    const v22, -0x40f33333    # -0.55f

    .line 362
    .line 363
    .line 364
    const v23, 0x3ee66666    # 0.45f

    .line 365
    .line 366
    .line 367
    const/high16 v24, -0x40800000    # -1.0f

    .line 368
    .line 369
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v4, 0x3ee66666    # 0.45f

    .line 373
    .line 374
    .line 375
    const/high16 v6, 0x3f800000    # 1.0f

    .line 376
    .line 377
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v25, 0x41880000    # 17.0f

    .line 381
    .line 382
    const/high16 v26, 0x41900000    # 18.0f

    .line 383
    .line 384
    const/high16 v21, 0x41900000    # 18.0f

    .line 385
    .line 386
    const v22, 0x418c6666    # 17.55f

    .line 387
    .line 388
    .line 389
    const v23, 0x418c6666    # 17.55f

    .line 390
    .line 391
    .line 392
    const/high16 v24, 0x41900000    # 18.0f

    .line 393
    .line 394
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 401
    .line 402
    .line 403
    move-result-object v2

    .line 404
    const/16 v16, 0x3800

    .line 405
    .line 406
    const/16 v17, 0x0

    .line 407
    .line 408
    const v6, 0x3e99999a    # 0.3f

    .line 409
    .line 410
    .line 411
    const v8, 0x3e99999a    # 0.3f

    .line 412
    .line 413
    .line 414
    const/4 v7, 0x0

    .line 415
    const/high16 v9, 0x3f800000    # 1.0f

    .line 416
    .line 417
    const/high16 v12, 0x3f800000    # 1.0f

    .line 418
    .line 419
    const/4 v13, 0x0

    .line 420
    const/4 v14, 0x0

    .line 421
    const/4 v15, 0x0

    .line 422
    const-string v4, ""

    .line 423
    .line 424
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 425
    .line 426
    .line 427
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 428
    .line 429
    .line 430
    move-result v3

    .line 431
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 432
    .line 433
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 434
    .line 435
    .line 436
    move-result-wide v6

    .line 437
    const/4 v2, 0x0

    .line 438
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 439
    .line 440
    .line 441
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 442
    .line 443
    .line 444
    move-result v10

    .line 445
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 446
    .line 447
    .line 448
    move-result v11

    .line 449
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 452
    .line 453
    .line 454
    const/high16 v4, 0x41880000    # 17.0f

    .line 455
    .line 456
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/high16 v4, -0x40800000    # -1.0f

    .line 460
    .line 461
    const/4 v6, 0x0

    .line 462
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const/high16 v26, 0x40000000    # 2.0f

    .line 466
    .line 467
    const/16 v27, 0x0

    .line 468
    .line 469
    const/high16 v21, 0x3f800000    # 1.0f

    .line 470
    .line 471
    const/high16 v22, 0x3f800000    # 1.0f

    .line 472
    .line 473
    const/16 v23, 0x0

    .line 474
    .line 475
    const/16 v24, 0x1

    .line 476
    .line 477
    const/16 v25, 0x1

    .line 478
    .line 479
    move-object/from16 v20, v2

    .line 480
    .line 481
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const/high16 v26, -0x40000000    # -2.0f

    .line 485
    .line 486
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 490
    .line 491
    .line 492
    move-result-object v2

    .line 493
    const/high16 v6, 0x3f800000    # 1.0f

    .line 494
    .line 495
    const/high16 v8, 0x3f800000    # 1.0f

    .line 496
    .line 497
    const/4 v7, 0x0

    .line 498
    const-string v4, ""

    .line 499
    .line 500
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 501
    .line 502
    .line 503
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 504
    .line 505
    .line 506
    move-result v3

    .line 507
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 508
    .line 509
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 510
    .line 511
    .line 512
    move-result-wide v6

    .line 513
    const/4 v0, 0x0

    .line 514
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 515
    .line 516
    .line 517
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 518
    .line 519
    .line 520
    move-result v10

    .line 521
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 522
    .line 523
    .line 524
    move-result v11

    .line 525
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 528
    .line 529
    .line 530
    const v0, 0x41a6e148    # 20.86f

    .line 531
    .line 532
    .line 533
    const v2, 0x416f851f    # 14.97f

    .line 534
    .line 535
    .line 536
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const v0, -0x4091eb85    # -0.93f

    .line 540
    .line 541
    .line 542
    const v2, -0x40a8f5c3    # -0.84f

    .line 543
    .line 544
    .line 545
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const v17, -0x3f3e6666    # -6.05f

    .line 549
    .line 550
    .line 551
    const v18, -0x3f65c28f    # -4.82f

    .line 552
    .line 553
    .line 554
    const v13, 0x3ef5c28f    # 0.48f

    .line 555
    .line 556
    .line 557
    const v14, -0x3fa33333    # -3.45f

    .line 558
    .line 559
    .line 560
    const v15, -0x3fc851ec    # -2.87f

    .line 561
    .line 562
    .line 563
    const v16, -0x3f3eb852    # -6.04f

    .line 564
    .line 565
    .line 566
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const/high16 v17, 0x41400000    # 12.0f

    .line 570
    .line 571
    const/high16 v18, 0x41100000    # 9.0f

    .line 572
    .line 573
    const v13, 0x4154cccd    # 13.3f

    .line 574
    .line 575
    .line 576
    const v14, 0x4111c28f    # 9.11f

    .line 577
    .line 578
    .line 579
    const v15, 0x414a8f5c    # 12.66f

    .line 580
    .line 581
    .line 582
    const/high16 v16, 0x41100000    # 9.0f

    .line 583
    .line 584
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const v17, -0x3f43851f    # -5.89f

    .line 588
    .line 589
    .line 590
    const v18, 0x409b3333    # 4.85f

    .line 591
    .line 592
    .line 593
    const v13, -0x3f77ae14    # -4.26f

    .line 594
    .line 595
    .line 596
    const/4 v14, 0x0

    .line 597
    const v15, -0x3f4b3333    # -5.65f

    .line 598
    .line 599
    .line 600
    const v16, 0x40651eb8    # 3.58f

    .line 601
    .line 602
    .line 603
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const/high16 v17, 0x40800000    # 4.0f

    .line 607
    .line 608
    const/high16 v18, 0x41300000    # 11.0f

    .line 609
    .line 610
    const v13, 0x409c7ae1    # 4.89f

    .line 611
    .line 612
    .line 613
    const v14, 0x4157851f    # 13.47f

    .line 614
    .line 615
    .line 616
    const/high16 v15, 0x40800000    # 4.0f

    .line 617
    .line 618
    const v16, 0x4145999a    # 12.35f

    .line 619
    .line 620
    .line 621
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const/high16 v17, 0x40400000    # 3.0f

    .line 625
    .line 626
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 627
    .line 628
    const/4 v13, 0x0

    .line 629
    const v14, -0x402b851f    # -1.66f

    .line 630
    .line 631
    .line 632
    const v15, 0x3fab851f    # 1.34f

    .line 633
    .line 634
    .line 635
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 636
    .line 637
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    const/high16 v0, 0x40200000    # 2.5f

    .line 641
    .line 642
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    const/high16 v17, 0x41400000    # 12.0f

    .line 646
    .line 647
    const/high16 v18, 0x40b00000    # 5.5f

    .line 648
    .line 649
    const v13, 0x412e147b    # 10.88f

    .line 650
    .line 651
    .line 652
    const/high16 v14, 0x41000000    # 8.0f

    .line 653
    .line 654
    const/high16 v15, 0x41400000    # 12.0f

    .line 655
    .line 656
    const v16, 0x40dc28f6    # 6.88f

    .line 657
    .line 658
    .line 659
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const/high16 v17, 0x41180000    # 9.5f

    .line 663
    .line 664
    const/high16 v18, 0x40400000    # 3.0f

    .line 665
    .line 666
    const/high16 v13, 0x41400000    # 12.0f

    .line 667
    .line 668
    const v14, 0x4083d70a    # 4.12f

    .line 669
    .line 670
    .line 671
    const v15, 0x412e147b    # 10.88f

    .line 672
    .line 673
    .line 674
    const/high16 v16, 0x40400000    # 3.0f

    .line 675
    .line 676
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 677
    .line 678
    .line 679
    const/high16 v0, 0x41000000    # 8.0f

    .line 680
    .line 681
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const/high16 v17, 0x40e00000    # 7.0f

    .line 685
    .line 686
    const/high16 v18, 0x40800000    # 4.0f

    .line 687
    .line 688
    const v13, 0x40ee6666    # 7.45f

    .line 689
    .line 690
    .line 691
    const/high16 v14, 0x40400000    # 3.0f

    .line 692
    .line 693
    const/high16 v15, 0x40e00000    # 7.0f

    .line 694
    .line 695
    const v16, 0x405ccccd    # 3.45f

    .line 696
    .line 697
    .line 698
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    const/high16 v17, 0x3f800000    # 1.0f

    .line 702
    .line 703
    const/high16 v18, 0x3f800000    # 1.0f

    .line 704
    .line 705
    const/4 v13, 0x0

    .line 706
    const v14, 0x3f0ccccd    # 0.55f

    .line 707
    .line 708
    .line 709
    const v15, 0x3ee66666    # 0.45f

    .line 710
    .line 711
    .line 712
    const/high16 v16, 0x3f800000    # 1.0f

    .line 713
    .line 714
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 715
    .line 716
    .line 717
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 718
    .line 719
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    const/high16 v17, 0x41200000    # 10.0f

    .line 723
    .line 724
    const/high16 v18, 0x40b00000    # 5.5f

    .line 725
    .line 726
    const v13, 0x411c7ae1    # 9.78f

    .line 727
    .line 728
    .line 729
    const/high16 v14, 0x40a00000    # 5.0f

    .line 730
    .line 731
    const/high16 v15, 0x41200000    # 10.0f

    .line 732
    .line 733
    const v16, 0x40a70a3d    # 5.22f

    .line 734
    .line 735
    .line 736
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 737
    .line 738
    .line 739
    const/high16 v17, 0x41180000    # 9.5f

    .line 740
    .line 741
    const/high16 v18, 0x40c00000    # 6.0f

    .line 742
    .line 743
    const/high16 v13, 0x41200000    # 10.0f

    .line 744
    .line 745
    const v14, 0x40b8f5c3    # 5.78f

    .line 746
    .line 747
    .line 748
    const v15, 0x411c7ae1    # 9.78f

    .line 749
    .line 750
    .line 751
    const/high16 v16, 0x40c00000    # 6.0f

    .line 752
    .line 753
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 754
    .line 755
    .line 756
    const/high16 v0, 0x40e00000    # 7.0f

    .line 757
    .line 758
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 759
    .line 760
    .line 761
    const/high16 v17, -0x3f600000    # -5.0f

    .line 762
    .line 763
    const/high16 v18, 0x40a00000    # 5.0f

    .line 764
    .line 765
    const v13, -0x3fcf5c29    # -2.76f

    .line 766
    .line 767
    .line 768
    const/4 v14, 0x0

    .line 769
    const/high16 v15, -0x3f600000    # -5.0f

    .line 770
    .line 771
    const v16, 0x400f5c29    # 2.24f

    .line 772
    .line 773
    .line 774
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 775
    .line 776
    .line 777
    const v17, 0x40823d71    # 4.07f

    .line 778
    .line 779
    .line 780
    const v18, 0x409d1eb8    # 4.91f

    .line 781
    .line 782
    .line 783
    const/4 v13, 0x0

    .line 784
    const v14, 0x401c28f6    # 2.44f

    .line 785
    .line 786
    .line 787
    const v15, 0x3fe147ae    # 1.76f

    .line 788
    .line 789
    .line 790
    const v16, 0x408f0a3d    # 4.47f

    .line 791
    .line 792
    .line 793
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 794
    .line 795
    .line 796
    const/high16 v17, 0x41400000    # 12.0f

    .line 797
    .line 798
    const/high16 v18, 0x41a80000    # 21.0f

    .line 799
    .line 800
    const v13, 0x40d051ec    # 6.51f

    .line 801
    .line 802
    .line 803
    const v14, 0x419651ec    # 18.79f

    .line 804
    .line 805
    .line 806
    const v15, 0x410fd70a    # 8.99f

    .line 807
    .line 808
    .line 809
    const/high16 v16, 0x41a80000    # 21.0f

    .line 810
    .line 811
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 812
    .line 813
    .line 814
    const v0, 0x40d0f5c3    # 6.53f

    .line 815
    .line 816
    .line 817
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 818
    .line 819
    .line 820
    const v17, 0x41a6e148    # 20.86f

    .line 821
    .line 822
    .line 823
    const v18, 0x416f851f    # 14.97f

    .line 824
    .line 825
    .line 826
    const v13, 0x41ad1eb8    # 21.64f

    .line 827
    .line 828
    .line 829
    const/high16 v14, 0x41a80000    # 21.0f

    .line 830
    .line 831
    const v15, 0x41b9d70a    # 23.23f

    .line 832
    .line 833
    .line 834
    const v16, 0x4188e148    # 17.11f

    .line 835
    .line 836
    .line 837
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 838
    .line 839
    .line 840
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 841
    .line 842
    .line 843
    const v0, 0x41943d71    # 18.53f

    .line 844
    .line 845
    .line 846
    const/high16 v2, 0x41980000    # 19.0f

    .line 847
    .line 848
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 849
    .line 850
    .line 851
    const/high16 v0, 0x41400000    # 12.0f

    .line 852
    .line 853
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 854
    .line 855
    .line 856
    const v17, -0x3fb8f5c3    # -3.11f

    .line 857
    .line 858
    .line 859
    const v18, -0x40428f5c    # -1.48f

    .line 860
    .line 861
    .line 862
    const v13, -0x40651eb8    # -1.21f

    .line 863
    .line 864
    .line 865
    const/4 v14, 0x0

    .line 866
    const v15, -0x3fea3d71    # -2.34f

    .line 867
    .line 868
    .line 869
    const v16, -0x40f5c28f    # -0.54f

    .line 870
    .line 871
    .line 872
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 873
    .line 874
    .line 875
    const v17, -0x40b33333    # -0.8f

    .line 876
    .line 877
    .line 878
    const v18, -0x3fa5c28f    # -3.41f

    .line 879
    .line 880
    .line 881
    const v13, -0x40b851ec    # -0.78f

    .line 882
    .line 883
    .line 884
    const v14, -0x408ccccd    # -0.95f

    .line 885
    .line 886
    .line 887
    const v15, -0x407851ec    # -1.06f

    .line 888
    .line 889
    .line 890
    const v16, -0x3ff5c28f    # -2.16f

    .line 891
    .line 892
    .line 893
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 894
    .line 895
    .line 896
    const v17, 0x403f5c29    # 2.99f

    .line 897
    .line 898
    .line 899
    const v18, -0x3fbf5c29    # -3.01f

    .line 900
    .line 901
    .line 902
    const v13, 0x3e9eb852    # 0.31f

    .line 903
    .line 904
    .line 905
    const v14, -0x40428f5c    # -1.48f

    .line 906
    .line 907
    .line 908
    const v15, 0x3fc147ae    # 1.51f

    .line 909
    .line 910
    .line 911
    const v16, -0x3fd3d70a    # -2.69f

    .line 912
    .line 913
    .line 914
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 915
    .line 916
    .line 917
    const v17, 0x3f2b851f    # 0.67f

    .line 918
    .line 919
    .line 920
    const v18, -0x4270a3d7    # -0.07f

    .line 921
    .line 922
    .line 923
    const v13, 0x3e6147ae    # 0.22f

    .line 924
    .line 925
    .line 926
    const v14, -0x42b33333    # -0.05f

    .line 927
    .line 928
    .line 929
    const v15, 0x3ee66666    # 0.45f

    .line 930
    .line 931
    .line 932
    const v16, -0x428a3d71    # -0.06f

    .line 933
    .line 934
    .line 935
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 936
    .line 937
    .line 938
    const/high16 v17, 0x41300000    # 11.0f

    .line 939
    .line 940
    const/high16 v18, 0x41580000    # 13.5f

    .line 941
    .line 942
    const v13, 0x41347ae1    # 11.28f

    .line 943
    .line 944
    .line 945
    const v14, 0x413bd70a    # 11.74f

    .line 946
    .line 947
    .line 948
    const/high16 v15, 0x41300000    # 11.0f

    .line 949
    .line 950
    const v16, 0x414947ae    # 12.58f

    .line 951
    .line 952
    .line 953
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 954
    .line 955
    .line 956
    const v17, 0x3fa8f5c3    # 1.32f

    .line 957
    .line 958
    .line 959
    const v18, 0x404b851f    # 3.18f

    .line 960
    .line 961
    .line 962
    const/4 v13, 0x0

    .line 963
    const v14, 0x3f9eb852    # 1.24f

    .line 964
    .line 965
    .line 966
    const/high16 v15, 0x3f000000    # 0.5f

    .line 967
    .line 968
    const v16, 0x4017ae14    # 2.37f

    .line 969
    .line 970
    .line 971
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 972
    .line 973
    .line 974
    const v0, 0x3fb47ae1    # 1.41f

    .line 975
    .line 976
    .line 977
    const v2, -0x404b851f    # -1.41f

    .line 978
    .line 979
    .line 980
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 981
    .line 982
    .line 983
    const/high16 v17, 0x41500000    # 13.0f

    .line 984
    .line 985
    const/high16 v18, 0x41580000    # 13.5f

    .line 986
    .line 987
    const v13, 0x41547ae1    # 13.28f

    .line 988
    .line 989
    .line 990
    const v14, 0x416d1eb8    # 14.82f

    .line 991
    .line 992
    .line 993
    const/high16 v15, 0x41500000    # 13.0f

    .line 994
    .line 995
    const v16, 0x41630a3d    # 14.19f

    .line 996
    .line 997
    .line 998
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 999
    .line 1000
    .line 1001
    const/high16 v17, 0x40200000    # 2.5f

    .line 1002
    .line 1003
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 1004
    .line 1005
    const/4 v13, 0x0

    .line 1006
    const v14, -0x404a3d71    # -1.42f

    .line 1007
    .line 1008
    .line 1009
    const v15, 0x3f99999a    # 1.2f

    .line 1010
    .line 1011
    .line 1012
    const/high16 v16, -0x3fe00000    # -2.5f

    .line 1013
    .line 1014
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1015
    .line 1016
    .line 1017
    const/high16 v18, 0x40200000    # 2.5f

    .line 1018
    .line 1019
    const v13, 0x3fb0a3d7    # 1.38f

    .line 1020
    .line 1021
    .line 1022
    const/4 v14, 0x0

    .line 1023
    const/high16 v15, 0x40200000    # 2.5f

    .line 1024
    .line 1025
    const v16, 0x3f8f5c29    # 1.12f

    .line 1026
    .line 1027
    .line 1028
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1029
    .line 1030
    .line 1031
    const v17, -0x414ccccd    # -0.35f

    .line 1032
    .line 1033
    .line 1034
    const/high16 v18, 0x3fa00000    # 1.25f

    .line 1035
    .line 1036
    const/4 v13, 0x0

    .line 1037
    const v14, 0x3eeb851f    # 0.46f

    .line 1038
    .line 1039
    .line 1040
    const v15, -0x41fae148    # -0.13f

    .line 1041
    .line 1042
    .line 1043
    const v16, 0x3f6147ae    # 0.88f

    .line 1044
    .line 1045
    .line 1046
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1047
    .line 1048
    .line 1049
    const v0, 0x3fef5c29    # 1.87f

    .line 1050
    .line 1051
    .line 1052
    const v2, 0x3fd9999a    # 1.7f

    .line 1053
    .line 1054
    .line 1055
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1056
    .line 1057
    .line 1058
    const v17, 0x3ef5c28f    # 0.48f

    .line 1059
    .line 1060
    .line 1061
    const v18, 0x3f8b851f    # 1.09f

    .line 1062
    .line 1063
    .line 1064
    const v13, 0x3e9eb852    # 0.31f

    .line 1065
    .line 1066
    .line 1067
    const v14, 0x3e8f5c29    # 0.28f

    .line 1068
    .line 1069
    .line 1070
    const v15, 0x3ef5c28f    # 0.48f

    .line 1071
    .line 1072
    .line 1073
    const v16, 0x3f2b851f    # 0.67f

    .line 1074
    .line 1075
    .line 1076
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1077
    .line 1078
    .line 1079
    const v17, 0x41943d71    # 18.53f

    .line 1080
    .line 1081
    .line 1082
    const/high16 v18, 0x41980000    # 19.0f

    .line 1083
    .line 1084
    const/high16 v13, 0x41a00000    # 20.0f

    .line 1085
    .line 1086
    const v14, 0x4192b852    # 18.34f

    .line 1087
    .line 1088
    .line 1089
    const v15, 0x419ab852    # 19.34f

    .line 1090
    .line 1091
    .line 1092
    const/high16 v16, 0x41980000    # 19.0f

    .line 1093
    .line 1094
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1095
    .line 1096
    .line 1097
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1098
    .line 1099
    .line 1100
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v2

    .line 1104
    const/16 v16, 0x3800

    .line 1105
    .line 1106
    const/16 v17, 0x0

    .line 1107
    .line 1108
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1109
    .line 1110
    const/4 v7, 0x0

    .line 1111
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1112
    .line 1113
    const/4 v13, 0x0

    .line 1114
    const/4 v14, 0x0

    .line 1115
    const/4 v15, 0x0

    .line 1116
    const-string v4, ""

    .line 1117
    .line 1118
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v0

    .line 1122
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v0

    .line 1126
    sput-object v0, Landroidx/compose/material/icons/twotone/PestControlRodentKt;->_pestControlRodent:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1127
    .line 1128
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1129
    .line 1130
    .line 1131
    return-object v0
.end method
