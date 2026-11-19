.class public final Landroidx/compose/material/icons/twotone/InterestsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_interests",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Interests",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getInterests",
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
        "SMAP\nInterests.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Interests.kt\nandroidx/compose/material/icons/twotone/InterestsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,118:1\n212#2,12:119\n233#2,18:132\n253#2:169\n233#2,18:170\n253#2:207\n174#3:131\n705#4,2:150\n717#4,2:152\n719#4,11:158\n705#4,2:188\n717#4,2:190\n719#4,11:196\n72#5,4:154\n72#5,4:192\n*S KotlinDebug\n*F\n+ 1 Interests.kt\nandroidx/compose/material/icons/twotone/InterestsKt\n*L\n29#1:119,12\n30#1:132,18\n30#1:169\n59#1:170,18\n59#1:207\n29#1:131\n30#1:150,2\n30#1:152,2\n30#1:158,11\n59#1:188,2\n59#1:190,2\n59#1:196,11\n30#1:154,4\n59#1:192,4\n*E\n"
    }
.end annotation


# static fields
.field private static _interests:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getInterests(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/InterestsKt;->_interests:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Interests"

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
    const v4, 0x40e0a3d7    # 7.02f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x41980000    # 19.0f

    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v25, -0x40000000    # -2.0f

    .line 79
    .line 80
    const/high16 v26, -0x40000000    # -2.0f

    .line 81
    .line 82
    const v21, -0x40733333    # -1.1f

    .line 83
    .line 84
    .line 85
    const/16 v22, 0x0

    .line 86
    .line 87
    const/high16 v23, -0x40000000    # -2.0f

    .line 88
    .line 89
    const v24, -0x4099999a    # -0.9f

    .line 90
    .line 91
    .line 92
    move-object/from16 v20, v2

    .line 93
    .line 94
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v4, -0x40000000    # -2.0f

    .line 98
    .line 99
    const v6, 0x3f666666    # 0.9f

    .line 100
    .line 101
    .line 102
    const/high16 v7, 0x40000000    # 2.0f

    .line 103
    .line 104
    invoke-virtual {v2, v6, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const v4, 0x3f666666    # 0.9f

    .line 108
    .line 109
    .line 110
    const/high16 v6, 0x40000000    # 2.0f

    .line 111
    .line 112
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v4, 0x4101eb85    # 8.12f

    .line 116
    .line 117
    .line 118
    const v6, 0x40e0a3d7    # 7.02f

    .line 119
    .line 120
    .line 121
    const/high16 v7, 0x41980000    # 19.0f

    .line 122
    .line 123
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v4, 0x41980000    # 19.0f

    .line 130
    .line 131
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v4, -0x3f800000    # -4.0f

    .line 135
    .line 136
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v4, 0x40800000    # 4.0f

    .line 143
    .line 144
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v4, 0x41980000    # 19.0f

    .line 148
    .line 149
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v4, 0x40c3d70a    # 6.12f

    .line 156
    .line 157
    .line 158
    const/high16 v6, 0x40e00000    # 7.0f

    .line 159
    .line 160
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v4, 0x4109999a    # 8.6f

    .line 164
    .line 165
    .line 166
    const/high16 v6, 0x41100000    # 9.0f

    .line 167
    .line 168
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v4, 0x40accccd    # 5.4f

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v4, 0x40c3d70a    # 6.12f

    .line 178
    .line 179
    .line 180
    const/high16 v6, 0x40e00000    # 7.0f

    .line 181
    .line 182
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v4, 0x4105999a    # 8.35f

    .line 189
    .line 190
    .line 191
    const/high16 v6, 0x41880000    # 17.0f

    .line 192
    .line 193
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 197
    .line 198
    const v26, -0x3fb9999a    # -3.1f

    .line 199
    .line 200
    .line 201
    const v21, -0x40466666    # -1.45f

    .line 202
    .line 203
    .line 204
    const v22, -0x4063d70a    # -1.22f

    .line 205
    .line 206
    .line 207
    const/high16 v23, -0x3fc00000    # -3.0f

    .line 208
    .line 209
    const v24, -0x3fe66666    # -2.4f

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v25, 0x3f400000    # 0.75f

    .line 216
    .line 217
    const/high16 v26, -0x40c00000    # -0.75f

    .line 218
    .line 219
    const/16 v21, 0x0

    .line 220
    .line 221
    const v22, -0x4123d70a    # -0.43f

    .line 222
    .line 223
    .line 224
    const v23, 0x3eb33333    # 0.35f

    .line 225
    .line 226
    .line 227
    const/high16 v24, -0x40c00000    # -0.75f

    .line 228
    .line 229
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v25, 0x3f3ae148    # 0.73f

    .line 233
    .line 234
    .line 235
    const v26, 0x3ebd70a4    # 0.37f

    .line 236
    .line 237
    .line 238
    const v21, 0x3e9eb852    # 0.31f

    .line 239
    .line 240
    .line 241
    const/16 v22, 0x0

    .line 242
    .line 243
    const v23, 0x3f051eb8    # 0.52f

    .line 244
    .line 245
    .line 246
    const v24, 0x3e2e147b    # 0.17f

    .line 247
    .line 248
    .line 249
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v4, 0x40c9999a    # 6.3f

    .line 253
    .line 254
    .line 255
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const v4, -0x4048f5c3    # -1.43f

    .line 259
    .line 260
    .line 261
    const v6, 0x3fc28f5c    # 1.52f

    .line 262
    .line 263
    .line 264
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v26, -0x41428f5c    # -0.37f

    .line 268
    .line 269
    .line 270
    const v21, 0x3e570a3d    # 0.21f

    .line 271
    .line 272
    .line 273
    const v22, -0x41b33333    # -0.2f

    .line 274
    .line 275
    .line 276
    const v23, 0x3ed70a3d    # 0.42f

    .line 277
    .line 278
    .line 279
    const v24, -0x41428f5c    # -0.37f

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v25, 0x3f400000    # 0.75f

    .line 286
    .line 287
    const/high16 v26, 0x3f400000    # 0.75f

    .line 288
    .line 289
    const v21, 0x3ecccccd    # 0.4f

    .line 290
    .line 291
    .line 292
    const/16 v22, 0x0

    .line 293
    .line 294
    const/high16 v23, 0x3f400000    # 0.75f

    .line 295
    .line 296
    const v24, 0x3ea3d70a    # 0.32f

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const/high16 v25, 0x41880000    # 17.0f

    .line 303
    .line 304
    const v26, 0x4105999a    # 8.35f

    .line 305
    .line 306
    .line 307
    const/high16 v21, 0x41a00000    # 20.0f

    .line 308
    .line 309
    const v22, 0x40be6666    # 5.95f

    .line 310
    .line 311
    .line 312
    const v23, 0x4193999a    # 18.45f

    .line 313
    .line 314
    .line 315
    const v24, 0x40e428f6    # 7.13f

    .line 316
    .line 317
    .line 318
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 325
    .line 326
    .line 327
    move-result-object v2

    .line 328
    const/16 v16, 0x3800

    .line 329
    .line 330
    const/16 v17, 0x0

    .line 331
    .line 332
    const v6, 0x3e99999a    # 0.3f

    .line 333
    .line 334
    .line 335
    const v8, 0x3e99999a    # 0.3f

    .line 336
    .line 337
    .line 338
    const/4 v7, 0x0

    .line 339
    const/high16 v9, 0x3f800000    # 1.0f

    .line 340
    .line 341
    const/high16 v12, 0x3f800000    # 1.0f

    .line 342
    .line 343
    const/4 v13, 0x0

    .line 344
    const/4 v14, 0x0

    .line 345
    const/4 v15, 0x0

    .line 346
    const-string v4, ""

    .line 347
    .line 348
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 349
    .line 350
    .line 351
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 352
    .line 353
    .line 354
    move-result v3

    .line 355
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 356
    .line 357
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 358
    .line 359
    .line 360
    move-result-wide v6

    .line 361
    const/4 v0, 0x0

    .line 362
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 363
    .line 364
    .line 365
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 366
    .line 367
    .line 368
    move-result v10

    .line 369
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 370
    .line 371
    .line 372
    move-result v11

    .line 373
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 376
    .line 377
    .line 378
    const/high16 v0, 0x41500000    # 13.0f

    .line 379
    .line 380
    const v2, 0x40e0a3d7    # 7.02f

    .line 381
    .line 382
    .line 383
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v17, -0x3f800000    # -4.0f

    .line 387
    .line 388
    const/high16 v18, 0x40800000    # 4.0f

    .line 389
    .line 390
    const v13, -0x3ff28f5c    # -2.21f

    .line 391
    .line 392
    .line 393
    const/high16 v15, -0x3f800000    # -4.0f

    .line 394
    .line 395
    const v16, 0x3fe51eb8    # 1.79f

    .line 396
    .line 397
    .line 398
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v0, 0x3fe51eb8    # 1.79f

    .line 402
    .line 403
    .line 404
    const/high16 v2, 0x40800000    # 4.0f

    .line 405
    .line 406
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v0, -0x401ae148    # -1.79f

    .line 410
    .line 411
    .line 412
    const/high16 v2, -0x3f800000    # -4.0f

    .line 413
    .line 414
    const/high16 v4, 0x40800000    # 4.0f

    .line 415
    .line 416
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v0, 0x4113ae14    # 9.23f

    .line 420
    .line 421
    .line 422
    const/high16 v2, 0x41500000    # 13.0f

    .line 423
    .line 424
    const v4, 0x40e0a3d7    # 7.02f

    .line 425
    .line 426
    .line 427
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v0, 0x40e0a3d7    # 7.02f

    .line 434
    .line 435
    .line 436
    const/high16 v2, 0x41980000    # 19.0f

    .line 437
    .line 438
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v17, -0x40000000    # -2.0f

    .line 442
    .line 443
    const/high16 v18, -0x40000000    # -2.0f

    .line 444
    .line 445
    const v13, -0x40733333    # -1.1f

    .line 446
    .line 447
    .line 448
    const/high16 v15, -0x40000000    # -2.0f

    .line 449
    .line 450
    const v16, -0x4099999a    # -0.9f

    .line 451
    .line 452
    .line 453
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/high16 v0, -0x40000000    # -2.0f

    .line 457
    .line 458
    const v2, 0x3f666666    # 0.9f

    .line 459
    .line 460
    .line 461
    const/high16 v4, 0x40000000    # 2.0f

    .line 462
    .line 463
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const v0, 0x3f666666    # 0.9f

    .line 467
    .line 468
    .line 469
    const/high16 v2, 0x40000000    # 2.0f

    .line 470
    .line 471
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v0, 0x4101eb85    # 8.12f

    .line 475
    .line 476
    .line 477
    const v2, 0x40e0a3d7    # 7.02f

    .line 478
    .line 479
    .line 480
    const/high16 v4, 0x41980000    # 19.0f

    .line 481
    .line 482
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const/high16 v0, 0x41500000    # 13.0f

    .line 489
    .line 490
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v0, 0x41000000    # 8.0f

    .line 494
    .line 495
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const/high16 v0, -0x3f000000    # -8.0f

    .line 502
    .line 503
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const/high16 v0, 0x41500000    # 13.0f

    .line 507
    .line 508
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const/high16 v0, 0x41980000    # 19.0f

    .line 515
    .line 516
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/high16 v0, -0x3f800000    # -4.0f

    .line 520
    .line 521
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const/high16 v0, 0x40800000    # 4.0f

    .line 528
    .line 529
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const/high16 v0, 0x41980000    # 19.0f

    .line 533
    .line 534
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const/high16 v0, 0x40e00000    # 7.0f

    .line 541
    .line 542
    const/high16 v2, 0x40000000    # 2.0f

    .line 543
    .line 544
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const/high16 v0, -0x3f600000    # -5.0f

    .line 548
    .line 549
    const/high16 v2, 0x41100000    # 9.0f

    .line 550
    .line 551
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const/high16 v0, 0x41200000    # 10.0f

    .line 555
    .line 556
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const/high16 v0, 0x40e00000    # 7.0f

    .line 560
    .line 561
    const/high16 v2, 0x40000000    # 2.0f

    .line 562
    .line 563
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const v0, 0x40c3d70a    # 6.12f

    .line 570
    .line 571
    .line 572
    const/high16 v2, 0x40e00000    # 7.0f

    .line 573
    .line 574
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const v0, 0x4109999a    # 8.6f

    .line 578
    .line 579
    .line 580
    const/high16 v2, 0x41100000    # 9.0f

    .line 581
    .line 582
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const v0, 0x40accccd    # 5.4f

    .line 586
    .line 587
    .line 588
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const v0, 0x40c3d70a    # 6.12f

    .line 592
    .line 593
    .line 594
    const/high16 v2, 0x40e00000    # 7.0f

    .line 595
    .line 596
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const/high16 v0, 0x419a0000    # 19.25f

    .line 603
    .line 604
    const/high16 v2, 0x40200000    # 2.5f

    .line 605
    .line 606
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const/high16 v17, -0x3ff00000    # -2.25f

    .line 610
    .line 611
    const v18, 0x3f95c28f    # 1.17f

    .line 612
    .line 613
    .line 614
    const v13, -0x407851ec    # -1.06f

    .line 615
    .line 616
    .line 617
    const v15, -0x401851ec    # -1.81f

    .line 618
    .line 619
    .line 620
    const v16, 0x3f0f5c29    # 0.56f

    .line 621
    .line 622
    .line 623
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const v18, -0x406a3d71    # -1.17f

    .line 627
    .line 628
    .line 629
    const v13, -0x411eb852    # -0.44f

    .line 630
    .line 631
    .line 632
    const v14, -0x40e3d70a    # -0.61f

    .line 633
    .line 634
    .line 635
    const v15, -0x4067ae14    # -1.19f

    .line 636
    .line 637
    .line 638
    const v16, -0x406a3d71    # -1.17f

    .line 639
    .line 640
    .line 641
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const/high16 v17, 0x41400000    # 12.0f

    .line 645
    .line 646
    const/high16 v18, 0x40a80000    # 5.25f

    .line 647
    .line 648
    const v13, 0x41530a3d    # 13.19f

    .line 649
    .line 650
    .line 651
    const/high16 v14, 0x40200000    # 2.5f

    .line 652
    .line 653
    const/high16 v15, 0x41400000    # 12.0f

    .line 654
    .line 655
    const v16, 0x4071eb85    # 3.78f

    .line 656
    .line 657
    .line 658
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    const/high16 v17, 0x40a00000    # 5.0f

    .line 662
    .line 663
    const/high16 v18, 0x40b80000    # 5.75f

    .line 664
    .line 665
    const/4 v13, 0x0

    .line 666
    const/high16 v14, 0x40000000    # 2.0f

    .line 667
    .line 668
    const v15, 0x401ae148    # 2.42f

    .line 669
    .line 670
    .line 671
    const v16, 0x405ae148    # 3.42f

    .line 672
    .line 673
    .line 674
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    const/high16 v18, -0x3f480000    # -5.75f

    .line 678
    .line 679
    const v13, 0x40251eb8    # 2.58f

    .line 680
    .line 681
    .line 682
    const v14, -0x3feae148    # -2.33f

    .line 683
    .line 684
    .line 685
    const/high16 v15, 0x40a00000    # 5.0f

    .line 686
    .line 687
    const/high16 v16, -0x3f900000    # -3.75f

    .line 688
    .line 689
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    const/high16 v17, 0x419a0000    # 19.25f

    .line 693
    .line 694
    const/high16 v18, 0x40200000    # 2.5f

    .line 695
    .line 696
    const/high16 v13, 0x41b00000    # 22.0f

    .line 697
    .line 698
    const v14, 0x4071eb85    # 3.78f

    .line 699
    .line 700
    .line 701
    const v15, 0x41a67ae1    # 20.81f

    .line 702
    .line 703
    .line 704
    const/high16 v16, 0x40200000    # 2.5f

    .line 705
    .line 706
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    const v0, 0x4105999a    # 8.35f

    .line 713
    .line 714
    .line 715
    const/high16 v2, 0x41880000    # 17.0f

    .line 716
    .line 717
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 718
    .line 719
    .line 720
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 721
    .line 722
    const v18, -0x3fb9999a    # -3.1f

    .line 723
    .line 724
    .line 725
    const v13, -0x40466666    # -1.45f

    .line 726
    .line 727
    .line 728
    const v14, -0x4063d70a    # -1.22f

    .line 729
    .line 730
    .line 731
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 732
    .line 733
    const v16, -0x3fe66666    # -2.4f

    .line 734
    .line 735
    .line 736
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 737
    .line 738
    .line 739
    const/high16 v17, 0x3f400000    # 0.75f

    .line 740
    .line 741
    const/high16 v18, -0x40c00000    # -0.75f

    .line 742
    .line 743
    const/4 v13, 0x0

    .line 744
    const v14, -0x4123d70a    # -0.43f

    .line 745
    .line 746
    .line 747
    const v15, 0x3eb33333    # 0.35f

    .line 748
    .line 749
    .line 750
    const/high16 v16, -0x40c00000    # -0.75f

    .line 751
    .line 752
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 753
    .line 754
    .line 755
    const v17, 0x3f3ae148    # 0.73f

    .line 756
    .line 757
    .line 758
    const v18, 0x3ebd70a4    # 0.37f

    .line 759
    .line 760
    .line 761
    const v13, 0x3e9eb852    # 0.31f

    .line 762
    .line 763
    .line 764
    const/4 v14, 0x0

    .line 765
    const v15, 0x3f051eb8    # 0.52f

    .line 766
    .line 767
    .line 768
    const v16, 0x3e2e147b    # 0.17f

    .line 769
    .line 770
    .line 771
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 772
    .line 773
    .line 774
    const v0, 0x40c9999a    # 6.3f

    .line 775
    .line 776
    .line 777
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 778
    .line 779
    .line 780
    const v0, -0x4048f5c3    # -1.43f

    .line 781
    .line 782
    .line 783
    const v2, 0x3fc28f5c    # 1.52f

    .line 784
    .line 785
    .line 786
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 787
    .line 788
    .line 789
    const v18, -0x41428f5c    # -0.37f

    .line 790
    .line 791
    .line 792
    const v13, 0x3e570a3d    # 0.21f

    .line 793
    .line 794
    .line 795
    const v14, -0x41b33333    # -0.2f

    .line 796
    .line 797
    .line 798
    const v15, 0x3ed70a3d    # 0.42f

    .line 799
    .line 800
    .line 801
    const v16, -0x41428f5c    # -0.37f

    .line 802
    .line 803
    .line 804
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 805
    .line 806
    .line 807
    const/high16 v17, 0x3f400000    # 0.75f

    .line 808
    .line 809
    const/high16 v18, 0x3f400000    # 0.75f

    .line 810
    .line 811
    const v13, 0x3ecccccd    # 0.4f

    .line 812
    .line 813
    .line 814
    const/4 v14, 0x0

    .line 815
    const/high16 v15, 0x3f400000    # 0.75f

    .line 816
    .line 817
    const v16, 0x3ea3d70a    # 0.32f

    .line 818
    .line 819
    .line 820
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 821
    .line 822
    .line 823
    const/high16 v17, 0x41880000    # 17.0f

    .line 824
    .line 825
    const v18, 0x4105999a    # 8.35f

    .line 826
    .line 827
    .line 828
    const/high16 v13, 0x41a00000    # 20.0f

    .line 829
    .line 830
    const v14, 0x40be6666    # 5.95f

    .line 831
    .line 832
    .line 833
    const v15, 0x4193999a    # 18.45f

    .line 834
    .line 835
    .line 836
    const v16, 0x40e428f6    # 7.13f

    .line 837
    .line 838
    .line 839
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 840
    .line 841
    .line 842
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 843
    .line 844
    .line 845
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 846
    .line 847
    .line 848
    move-result-object v2

    .line 849
    const/16 v16, 0x3800

    .line 850
    .line 851
    const/16 v17, 0x0

    .line 852
    .line 853
    const/high16 v6, 0x3f800000    # 1.0f

    .line 854
    .line 855
    const/high16 v8, 0x3f800000    # 1.0f

    .line 856
    .line 857
    const/4 v7, 0x0

    .line 858
    const/high16 v12, 0x3f800000    # 1.0f

    .line 859
    .line 860
    const/4 v13, 0x0

    .line 861
    const/4 v14, 0x0

    .line 862
    const/4 v15, 0x0

    .line 863
    const-string v4, ""

    .line 864
    .line 865
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 866
    .line 867
    .line 868
    move-result-object v0

    .line 869
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 870
    .line 871
    .line 872
    move-result-object v0

    .line 873
    sput-object v0, Landroidx/compose/material/icons/twotone/InterestsKt;->_interests:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 874
    .line 875
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 876
    .line 877
    .line 878
    return-object v0
.end method
