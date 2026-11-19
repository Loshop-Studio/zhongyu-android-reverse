.class public final Landroidx/compose/material/icons/twotone/DisabledVisibleKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_disabledVisible",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "DisabledVisible",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getDisabledVisible",
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
        "SMAP\nDisabledVisible.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DisabledVisible.kt\nandroidx/compose/material/icons/twotone/DisabledVisibleKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,84:1\n212#2,12:85\n233#2,18:98\n253#2:135\n233#2,18:136\n253#2:173\n174#3:97\n705#4,2:116\n717#4,2:118\n719#4,11:124\n705#4,2:154\n717#4,2:156\n719#4,11:162\n72#5,4:120\n72#5,4:158\n*S KotlinDebug\n*F\n+ 1 DisabledVisible.kt\nandroidx/compose/material/icons/twotone/DisabledVisibleKt\n*L\n29#1:85,12\n30#1:98,18\n30#1:135\n44#1:136,18\n44#1:173\n29#1:97\n30#1:116,2\n30#1:118,2\n30#1:124,11\n44#1:154,2\n44#1:156,2\n44#1:162,11\n30#1:120,4\n44#1:158,4\n*E\n"
    }
.end annotation


# static fields
.field private static _disabledVisible:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDisabledVisible(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/DisabledVisibleKt;->_disabledVisible:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.DisabledVisible"

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
    const/high16 v4, 0x41700000    # 15.0f

    .line 71
    .line 72
    const/high16 v6, 0x41880000    # 17.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3f680000    # -4.75f

    .line 78
    .line 79
    const/high16 v26, 0x40200000    # 2.5f

    .line 80
    .line 81
    const v21, -0x40066666    # -1.95f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const v23, -0x3f8f5c29    # -3.76f

    .line 87
    .line 88
    .line 89
    const v24, 0x3f7ae148    # 0.98f

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
    const/high16 v25, 0x41880000    # 17.0f

    .line 98
    .line 99
    const/high16 v26, 0x41a00000    # 20.0f

    .line 100
    .line 101
    const v21, 0x4153d70a    # 13.24f

    .line 102
    .line 103
    .line 104
    const v22, 0x419828f6    # 19.02f

    .line 105
    .line 106
    .line 107
    const v23, 0x4170cccd    # 15.05f

    .line 108
    .line 109
    .line 110
    const/high16 v24, 0x41a00000    # 20.0f

    .line 111
    .line 112
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v4, 0x4070a3d7    # 3.76f

    .line 116
    .line 117
    .line 118
    const/high16 v6, 0x40980000    # 4.75f

    .line 119
    .line 120
    const/high16 v7, -0x3fe00000    # -2.5f

    .line 121
    .line 122
    const v8, -0x40851eb8    # -0.98f

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2, v4, v8, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v26, 0x41700000    # 15.0f

    .line 129
    .line 130
    const v21, 0x41a6147b    # 20.76f

    .line 131
    .line 132
    .line 133
    const v22, 0x417fae14    # 15.98f

    .line 134
    .line 135
    .line 136
    const v23, 0x4197999a    # 18.95f

    .line 137
    .line 138
    .line 139
    const/high16 v24, 0x41700000    # 15.0f

    .line 140
    .line 141
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v4, 0x41980000    # 19.0f

    .line 148
    .line 149
    const/high16 v6, 0x41880000    # 17.0f

    .line 150
    .line 151
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v25, -0x40400000    # -1.5f

    .line 155
    .line 156
    const/high16 v26, -0x40400000    # -1.5f

    .line 157
    .line 158
    const v21, -0x40ab851f    # -0.83f

    .line 159
    .line 160
    .line 161
    const/16 v22, 0x0

    .line 162
    .line 163
    const/high16 v23, -0x40400000    # -1.5f

    .line 164
    .line 165
    const v24, -0x40d47ae1    # -0.67f

    .line 166
    .line 167
    .line 168
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 172
    .line 173
    const/16 v21, 0x0

    .line 174
    .line 175
    const v22, -0x40ab851f    # -0.83f

    .line 176
    .line 177
    .line 178
    const v23, 0x3f2b851f    # 0.67f

    .line 179
    .line 180
    .line 181
    const/high16 v24, -0x40400000    # -1.5f

    .line 182
    .line 183
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v4, 0x3f2b851f    # 0.67f

    .line 187
    .line 188
    .line 189
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 190
    .line 191
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v25, 0x41880000    # 17.0f

    .line 195
    .line 196
    const/high16 v26, 0x41980000    # 19.0f

    .line 197
    .line 198
    const/high16 v21, 0x41940000    # 18.5f

    .line 199
    .line 200
    const v22, 0x4192a3d7    # 18.33f

    .line 201
    .line 202
    .line 203
    const v23, 0x418ea3d7    # 17.83f

    .line 204
    .line 205
    .line 206
    const/high16 v24, 0x41980000    # 19.0f

    .line 207
    .line 208
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    const/16 v16, 0x3800

    .line 219
    .line 220
    const/16 v17, 0x0

    .line 221
    .line 222
    const v6, 0x3e99999a    # 0.3f

    .line 223
    .line 224
    .line 225
    const v8, 0x3e99999a    # 0.3f

    .line 226
    .line 227
    .line 228
    const/4 v7, 0x0

    .line 229
    const/high16 v9, 0x3f800000    # 1.0f

    .line 230
    .line 231
    const/high16 v12, 0x3f800000    # 1.0f

    .line 232
    .line 233
    const/4 v13, 0x0

    .line 234
    const/4 v14, 0x0

    .line 235
    const/4 v15, 0x0

    .line 236
    const-string v4, ""

    .line 237
    .line 238
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 239
    .line 240
    .line 241
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 242
    .line 243
    .line 244
    move-result v3

    .line 245
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 246
    .line 247
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 248
    .line 249
    .line 250
    move-result-wide v6

    .line 251
    const/4 v0, 0x0

    .line 252
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 256
    .line 257
    .line 258
    move-result v10

    .line 259
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 260
    .line 261
    .line 262
    move-result v11

    .line 263
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 266
    .line 267
    .line 268
    const/high16 v0, 0x41700000    # 15.0f

    .line 269
    .line 270
    const/high16 v2, 0x41880000    # 17.0f

    .line 271
    .line 272
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v17, 0x40980000    # 4.75f

    .line 276
    .line 277
    const/high16 v18, 0x40200000    # 2.5f

    .line 278
    .line 279
    const v13, 0x3ff9999a    # 1.95f

    .line 280
    .line 281
    .line 282
    const v15, 0x4070a3d7    # 3.76f

    .line 283
    .line 284
    .line 285
    const v16, 0x3f7ae148    # 0.98f

    .line 286
    .line 287
    .line 288
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const/high16 v17, 0x41880000    # 17.0f

    .line 292
    .line 293
    const/high16 v18, 0x41a00000    # 20.0f

    .line 294
    .line 295
    const v13, 0x41a6147b    # 20.76f

    .line 296
    .line 297
    .line 298
    const v14, 0x419828f6    # 19.02f

    .line 299
    .line 300
    .line 301
    const v15, 0x4197999a    # 18.95f

    .line 302
    .line 303
    .line 304
    const/high16 v16, 0x41a00000    # 20.0f

    .line 305
    .line 306
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v0, -0x3f8f5c29    # -3.76f

    .line 310
    .line 311
    .line 312
    const/high16 v2, -0x3f680000    # -4.75f

    .line 313
    .line 314
    const/high16 v4, -0x3fe00000    # -2.5f

    .line 315
    .line 316
    const v6, -0x40851eb8    # -0.98f

    .line 317
    .line 318
    .line 319
    invoke-virtual {v12, v0, v6, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/high16 v18, 0x41700000    # 15.0f

    .line 323
    .line 324
    const v13, 0x4153d70a    # 13.24f

    .line 325
    .line 326
    .line 327
    const v14, 0x417fae14    # 15.98f

    .line 328
    .line 329
    .line 330
    const v15, 0x4170cccd    # 15.05f

    .line 331
    .line 332
    .line 333
    const/high16 v16, 0x41700000    # 15.0f

    .line 334
    .line 335
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const/high16 v0, 0x41500000    # 13.0f

    .line 342
    .line 343
    const/high16 v2, 0x41880000    # 17.0f

    .line 344
    .line 345
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const/high16 v17, -0x3f200000    # -7.0f

    .line 349
    .line 350
    const/high16 v18, 0x40900000    # 4.5f

    .line 351
    .line 352
    const v13, -0x3fb47ae1    # -3.18f

    .line 353
    .line 354
    .line 355
    const/4 v14, 0x0

    .line 356
    const v15, -0x3f433333    # -5.9f

    .line 357
    .line 358
    .line 359
    const v16, 0x3fef5c29    # 1.87f

    .line 360
    .line 361
    .line 362
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/high16 v17, 0x40e00000    # 7.0f

    .line 366
    .line 367
    const v13, 0x3f8ccccd    # 1.1f

    .line 368
    .line 369
    .line 370
    const v14, 0x402851ec    # 2.63f

    .line 371
    .line 372
    .line 373
    const v15, 0x40747ae1    # 3.82f

    .line 374
    .line 375
    .line 376
    const/high16 v16, 0x40900000    # 4.5f

    .line 377
    .line 378
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v0, 0x40e00000    # 7.0f

    .line 382
    .line 383
    const/high16 v2, -0x3f700000    # -4.5f

    .line 384
    .line 385
    const v4, 0x40bccccd    # 5.9f

    .line 386
    .line 387
    .line 388
    const v6, -0x4010a3d7    # -1.87f

    .line 389
    .line 390
    .line 391
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/high16 v17, 0x41880000    # 17.0f

    .line 395
    .line 396
    const/high16 v18, 0x41500000    # 13.0f

    .line 397
    .line 398
    const v13, 0x41b73333    # 22.9f

    .line 399
    .line 400
    .line 401
    const v14, 0x416deb85    # 14.87f

    .line 402
    .line 403
    .line 404
    const v15, 0x41a170a4    # 20.18f

    .line 405
    .line 406
    .line 407
    const/high16 v16, 0x41500000    # 13.0f

    .line 408
    .line 409
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v0, 0x41980000    # 19.0f

    .line 416
    .line 417
    const/high16 v2, 0x41880000    # 17.0f

    .line 418
    .line 419
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const/high16 v17, -0x40400000    # -1.5f

    .line 423
    .line 424
    const/high16 v18, -0x40400000    # -1.5f

    .line 425
    .line 426
    const v13, -0x40ab851f    # -0.83f

    .line 427
    .line 428
    .line 429
    const/4 v14, 0x0

    .line 430
    const/high16 v15, -0x40400000    # -1.5f

    .line 431
    .line 432
    const v16, -0x40d47ae1    # -0.67f

    .line 433
    .line 434
    .line 435
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v0, 0x41815c29    # 16.17f

    .line 439
    .line 440
    .line 441
    const/high16 v2, 0x41800000    # 16.0f

    .line 442
    .line 443
    const/high16 v4, 0x41880000    # 17.0f

    .line 444
    .line 445
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const v0, 0x3f2b851f    # 0.67f

    .line 449
    .line 450
    .line 451
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 452
    .line 453
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const v0, 0x418ea3d7    # 17.83f

    .line 457
    .line 458
    .line 459
    const/high16 v2, 0x41980000    # 19.0f

    .line 460
    .line 461
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const v0, 0x41afeb85    # 21.99f

    .line 468
    .line 469
    .line 470
    const v2, 0x414570a4    # 12.34f

    .line 471
    .line 472
    .line 473
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v17, 0x41b00000    # 22.0f

    .line 477
    .line 478
    const/high16 v18, 0x41400000    # 12.0f

    .line 479
    .line 480
    const/high16 v13, 0x41b00000    # 22.0f

    .line 481
    .line 482
    const v14, 0x4143ae14    # 12.23f

    .line 483
    .line 484
    .line 485
    const/high16 v15, 0x41b00000    # 22.0f

    .line 486
    .line 487
    const v16, 0x4141c28f    # 12.11f

    .line 488
    .line 489
    .line 490
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v17, -0x3ee00000    # -10.0f

    .line 494
    .line 495
    const/high16 v18, -0x3ee00000    # -10.0f

    .line 496
    .line 497
    const/4 v13, 0x0

    .line 498
    const v14, -0x3f4f5c29    # -5.52f

    .line 499
    .line 500
    .line 501
    const v15, -0x3f70a3d7    # -4.48f

    .line 502
    .line 503
    .line 504
    const/high16 v16, -0x3ee00000    # -10.0f

    .line 505
    .line 506
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const v0, 0x40cf5c29    # 6.48f

    .line 510
    .line 511
    .line 512
    const/high16 v2, 0x41400000    # 12.0f

    .line 513
    .line 514
    const/high16 v4, 0x40000000    # 2.0f

    .line 515
    .line 516
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const v17, 0x410f5c29    # 8.96f

    .line 520
    .line 521
    .line 522
    const v18, 0x411f3333    # 9.95f

    .line 523
    .line 524
    .line 525
    const v14, 0x40a570a4    # 5.17f

    .line 526
    .line 527
    .line 528
    const v15, 0x407b851f    # 3.93f

    .line 529
    .line 530
    .line 531
    const v16, 0x4116e148    # 9.43f

    .line 532
    .line 533
    .line 534
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const v17, -0x3feb851f    # -2.32f

    .line 538
    .line 539
    .line 540
    const v18, -0x3fd47ae1    # -2.68f

    .line 541
    .line 542
    .line 543
    const v13, -0x4091eb85    # -0.93f

    .line 544
    .line 545
    .line 546
    const v14, -0x40c51eb8    # -0.73f

    .line 547
    .line 548
    .line 549
    const v15, -0x4023d70a    # -1.72f

    .line 550
    .line 551
    .line 552
    const v16, -0x402e147b    # -1.64f

    .line 553
    .line 554
    .line 555
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const/high16 v17, 0x40800000    # 4.0f

    .line 559
    .line 560
    const/high16 v18, 0x41400000    # 12.0f

    .line 561
    .line 562
    const v13, 0x40bccccd    # 5.9f

    .line 563
    .line 564
    .line 565
    const/high16 v14, 0x41900000    # 18.0f

    .line 566
    .line 567
    const/high16 v15, 0x40800000    # 4.0f

    .line 568
    .line 569
    const v16, 0x4173851f    # 15.22f

    .line 570
    .line 571
    .line 572
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const v17, 0x3fd851ec    # 1.69f

    .line 576
    .line 577
    .line 578
    const v18, -0x3f633333    # -4.9f

    .line 579
    .line 580
    .line 581
    const/4 v13, 0x0

    .line 582
    const v14, -0x40133333    # -1.85f

    .line 583
    .line 584
    .line 585
    const v15, 0x3f2147ae    # 0.63f

    .line 586
    .line 587
    .line 588
    const v16, -0x3f9ccccd    # -3.55f

    .line 589
    .line 590
    .line 591
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const v0, 0x40b51eb8    # 5.66f

    .line 595
    .line 596
    .line 597
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const v17, 0x3fe8f5c3    # 1.82f

    .line 601
    .line 602
    .line 603
    const/high16 v18, -0x40800000    # -1.0f

    .line 604
    .line 605
    const v13, 0x3f0f5c29    # 0.56f

    .line 606
    .line 607
    .line 608
    const v14, -0x41333333    # -0.4f

    .line 609
    .line 610
    .line 611
    const v15, 0x3f95c28f    # 1.17f

    .line 612
    .line 613
    .line 614
    const v16, -0x40c51eb8    # -0.73f

    .line 615
    .line 616
    .line 617
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const v0, 0x40e33333    # 7.1f

    .line 621
    .line 622
    .line 623
    const v2, 0x40b6147b    # 5.69f

    .line 624
    .line 625
    .line 626
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const/high16 v17, 0x41400000    # 12.0f

    .line 630
    .line 631
    const/high16 v18, 0x40800000    # 4.0f

    .line 632
    .line 633
    const v13, 0x41073333    # 8.45f

    .line 634
    .line 635
    .line 636
    const v14, 0x409428f6    # 4.63f

    .line 637
    .line 638
    .line 639
    const v15, 0x41226666    # 10.15f

    .line 640
    .line 641
    .line 642
    const/high16 v16, 0x40800000    # 4.0f

    .line 643
    .line 644
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    const v17, 0x40ff5c29    # 7.98f

    .line 648
    .line 649
    .line 650
    const v18, 0x40ee6666    # 7.45f

    .line 651
    .line 652
    .line 653
    const v13, 0x4087ae14    # 4.24f

    .line 654
    .line 655
    .line 656
    const/4 v14, 0x0

    .line 657
    const v15, 0x40f66666    # 7.7f

    .line 658
    .line 659
    .line 660
    const v16, 0x40528f5c    # 3.29f

    .line 661
    .line 662
    .line 663
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 664
    .line 665
    .line 666
    const v17, 0x41afeb85    # 21.99f

    .line 667
    .line 668
    .line 669
    const v18, 0x414570a4    # 12.34f

    .line 670
    .line 671
    .line 672
    const v13, 0x41a5851f    # 20.69f

    .line 673
    .line 674
    .line 675
    const v14, 0x413ab852    # 11.67f

    .line 676
    .line 677
    .line 678
    const v15, 0x41aaf5c3    # 21.37f

    .line 679
    .line 680
    .line 681
    const v16, 0x413f851f    # 11.97f

    .line 682
    .line 683
    .line 684
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 691
    .line 692
    .line 693
    move-result-object v2

    .line 694
    const/16 v16, 0x3800

    .line 695
    .line 696
    const/16 v17, 0x0

    .line 697
    .line 698
    const/high16 v6, 0x3f800000    # 1.0f

    .line 699
    .line 700
    const/high16 v8, 0x3f800000    # 1.0f

    .line 701
    .line 702
    const/4 v7, 0x0

    .line 703
    const/high16 v12, 0x3f800000    # 1.0f

    .line 704
    .line 705
    const/4 v13, 0x0

    .line 706
    const/4 v14, 0x0

    .line 707
    const/4 v15, 0x0

    .line 708
    const-string v4, ""

    .line 709
    .line 710
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 711
    .line 712
    .line 713
    move-result-object v0

    .line 714
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 715
    .line 716
    .line 717
    move-result-object v0

    .line 718
    sput-object v0, Landroidx/compose/material/icons/twotone/DisabledVisibleKt;->_disabledVisible:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 719
    .line 720
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 721
    .line 722
    .line 723
    return-object v0
.end method
