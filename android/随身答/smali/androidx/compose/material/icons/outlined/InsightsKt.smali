.class public final Landroidx/compose/material/icons/outlined/InsightsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_insights",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Insights",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getInsights",
        "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nInsights.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Insights.kt\nandroidx/compose/material/icons/outlined/InsightsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,79:1\n212#2,12:80\n233#2,18:93\n253#2:130\n233#2,18:131\n253#2:168\n233#2,18:169\n253#2:206\n174#3:92\n705#4,2:111\n717#4,2:113\n719#4,11:119\n705#4,2:149\n717#4,2:151\n719#4,11:157\n705#4,2:187\n717#4,2:189\n719#4,11:195\n72#5,4:115\n72#5,4:153\n72#5,4:191\n*S KotlinDebug\n*F\n+ 1 Insights.kt\nandroidx/compose/material/icons/outlined/InsightsKt\n*L\n29#1:80,12\n30#1:93,18\n30#1:130\n52#1:131,18\n52#1:168\n63#1:169,18\n63#1:206\n29#1:92\n30#1:111,2\n30#1:113,2\n30#1:119,11\n52#1:149,2\n52#1:151,2\n52#1:157,11\n63#1:187,2\n63#1:189,2\n63#1:195,11\n30#1:115,4\n52#1:153,4\n63#1:191,4\n*E\n"
    }
.end annotation


# static fields
.field private static _insights:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getInsights(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/InsightsKt;->_insights:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Insights"

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
    const/high16 v4, 0x41a80000    # 21.0f

    .line 71
    .line 72
    const/high16 v6, 0x41000000    # 8.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v25, -0x4008f5c3    # -1.93f

    .line 78
    .line 79
    .line 80
    const v26, 0x4020a3d7    # 2.51f

    .line 81
    .line 82
    .line 83
    const v21, -0x40466666    # -1.45f

    .line 84
    .line 85
    .line 86
    const/16 v22, 0x0

    .line 87
    .line 88
    const v23, -0x3fef5c29    # -2.26f

    .line 89
    .line 90
    .line 91
    const v24, 0x3fb851ec    # 1.44f

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
    const v4, 0x4063d70a    # 3.56f

    .line 100
    .line 101
    .line 102
    const v6, -0x3f9ccccd    # -3.55f

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v25, -0x407ae148    # -1.04f

    .line 109
    .line 110
    .line 111
    const/16 v26, 0x0

    .line 112
    .line 113
    const v21, -0x41666666    # -0.3f

    .line 114
    .line 115
    .line 116
    const v22, -0x4247ae14    # -0.09f

    .line 117
    .line 118
    .line 119
    const v23, -0x40c28f5c    # -0.74f

    .line 120
    .line 121
    .line 122
    const v24, -0x4247ae14    # -0.09f

    .line 123
    .line 124
    .line 125
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v4, -0x3fdccccd    # -2.55f

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v25, 0x41200000    # 10.0f

    .line 135
    .line 136
    const/high16 v26, 0x41100000    # 9.0f

    .line 137
    .line 138
    const v21, 0x414451ec    # 12.27f

    .line 139
    .line 140
    .line 141
    const v22, 0x41273333    # 10.45f

    .line 142
    .line 143
    .line 144
    const v23, 0x41375c29    # 11.46f

    .line 145
    .line 146
    .line 147
    const/high16 v24, 0x41100000    # 9.0f

    .line 148
    .line 149
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v25, -0x4008f5c3    # -1.93f

    .line 153
    .line 154
    .line 155
    const v26, 0x402147ae    # 2.52f

    .line 156
    .line 157
    .line 158
    const v21, -0x40466666    # -1.45f

    .line 159
    .line 160
    .line 161
    const/16 v22, 0x0

    .line 162
    .line 163
    const v23, -0x3feeb852    # -2.27f

    .line 164
    .line 165
    .line 166
    const v24, 0x3fb851ec    # 1.44f

    .line 167
    .line 168
    .line 169
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v4, 0x4091999a    # 4.55f

    .line 173
    .line 174
    .line 175
    const v6, -0x3f6e147b    # -4.56f

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v25, 0x3f800000    # 1.0f

    .line 182
    .line 183
    const/high16 v26, 0x41900000    # 18.0f

    .line 184
    .line 185
    const v21, 0x401c28f6    # 2.44f

    .line 186
    .line 187
    .line 188
    const v22, 0x417bd70a    # 15.74f

    .line 189
    .line 190
    .line 191
    const/high16 v23, 0x3f800000    # 1.0f

    .line 192
    .line 193
    const v24, 0x41846666    # 16.55f

    .line 194
    .line 195
    .line 196
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/high16 v25, 0x40000000    # 2.0f

    .line 200
    .line 201
    const/high16 v26, 0x40000000    # 2.0f

    .line 202
    .line 203
    const/16 v21, 0x0

    .line 204
    .line 205
    const v22, 0x3f8ccccd    # 1.1f

    .line 206
    .line 207
    .line 208
    const v23, 0x3f666666    # 0.9f

    .line 209
    .line 210
    .line 211
    const/high16 v24, 0x40000000    # 2.0f

    .line 212
    .line 213
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v25, 0x3ff70a3d    # 1.93f

    .line 217
    .line 218
    .line 219
    const v26, -0x3fdf5c29    # -2.51f

    .line 220
    .line 221
    .line 222
    const v21, 0x3fb9999a    # 1.45f

    .line 223
    .line 224
    .line 225
    const/16 v22, 0x0

    .line 226
    .line 227
    const v23, 0x4010a3d7    # 2.26f

    .line 228
    .line 229
    .line 230
    const v24, -0x4047ae14    # -1.44f

    .line 231
    .line 232
    .line 233
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v25, 0x3f851eb8    # 1.04f

    .line 240
    .line 241
    .line 242
    const/16 v26, 0x0

    .line 243
    .line 244
    const v21, 0x3e99999a    # 0.3f

    .line 245
    .line 246
    .line 247
    const v22, 0x3db851ec    # 0.09f

    .line 248
    .line 249
    .line 250
    const v23, 0x3f3d70a4    # 0.74f

    .line 251
    .line 252
    .line 253
    const v24, 0x3db851ec    # 0.09f

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v4, 0x40233333    # 2.55f

    .line 260
    .line 261
    .line 262
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v25, 0x41700000    # 15.0f

    .line 266
    .line 267
    const/high16 v26, 0x41900000    # 18.0f

    .line 268
    .line 269
    const v21, 0x414bae14    # 12.73f

    .line 270
    .line 271
    .line 272
    const v22, 0x41846666    # 16.55f

    .line 273
    .line 274
    .line 275
    const v23, 0x4158a3d7    # 13.54f

    .line 276
    .line 277
    .line 278
    const/high16 v24, 0x41900000    # 18.0f

    .line 279
    .line 280
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v25, 0x3ff70a3d    # 1.93f

    .line 284
    .line 285
    .line 286
    const v26, -0x3fdeb852    # -2.52f

    .line 287
    .line 288
    .line 289
    const v21, 0x3fb9999a    # 1.45f

    .line 290
    .line 291
    .line 292
    const/16 v22, 0x0

    .line 293
    .line 294
    const v23, 0x401147ae    # 2.27f

    .line 295
    .line 296
    .line 297
    const v24, -0x4047ae14    # -1.44f

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const v4, 0x4063d70a    # 3.56f

    .line 304
    .line 305
    .line 306
    const v6, -0x3f9ccccd    # -3.55f

    .line 307
    .line 308
    .line 309
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v25, 0x41b80000    # 23.0f

    .line 313
    .line 314
    const/high16 v26, 0x41200000    # 10.0f

    .line 315
    .line 316
    const v21, 0x41ac7ae1    # 21.56f

    .line 317
    .line 318
    .line 319
    const v22, 0x414428f6    # 12.26f

    .line 320
    .line 321
    .line 322
    const/high16 v23, 0x41b80000    # 23.0f

    .line 323
    .line 324
    const v24, 0x41373333    # 11.45f

    .line 325
    .line 326
    .line 327
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/high16 v25, 0x41a80000    # 21.0f

    .line 331
    .line 332
    const/high16 v26, 0x41000000    # 8.0f

    .line 333
    .line 334
    const/high16 v21, 0x41b80000    # 23.0f

    .line 335
    .line 336
    const v22, 0x410e6666    # 8.9f

    .line 337
    .line 338
    .line 339
    const v23, 0x41b0cccd    # 22.1f

    .line 340
    .line 341
    .line 342
    const/high16 v24, 0x41000000    # 8.0f

    .line 343
    .line 344
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 351
    .line 352
    .line 353
    move-result-object v2

    .line 354
    const/16 v16, 0x3800

    .line 355
    .line 356
    const/16 v17, 0x0

    .line 357
    .line 358
    const/high16 v6, 0x3f800000    # 1.0f

    .line 359
    .line 360
    const/high16 v8, 0x3f800000    # 1.0f

    .line 361
    .line 362
    const/4 v7, 0x0

    .line 363
    const/high16 v9, 0x3f800000    # 1.0f

    .line 364
    .line 365
    const/high16 v12, 0x3f800000    # 1.0f

    .line 366
    .line 367
    const/4 v13, 0x0

    .line 368
    const/4 v14, 0x0

    .line 369
    const/4 v15, 0x0

    .line 370
    const-string v4, ""

    .line 371
    .line 372
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 373
    .line 374
    .line 375
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 376
    .line 377
    .line 378
    move-result v3

    .line 379
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 380
    .line 381
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 382
    .line 383
    .line 384
    move-result-wide v6

    .line 385
    const/4 v2, 0x0

    .line 386
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 387
    .line 388
    .line 389
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 390
    .line 391
    .line 392
    move-result v10

    .line 393
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 394
    .line 395
    .line 396
    move-result v11

    .line 397
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 400
    .line 401
    .line 402
    const/high16 v4, 0x41700000    # 15.0f

    .line 403
    .line 404
    const/high16 v6, 0x41100000    # 9.0f

    .line 405
    .line 406
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v4, 0x3f70a3d7    # 0.94f

    .line 410
    .line 411
    .line 412
    const v6, -0x3ffb851f    # -2.07f

    .line 413
    .line 414
    .line 415
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v4, 0x4003d70a    # 2.06f

    .line 419
    .line 420
    .line 421
    const v6, -0x4091eb85    # -0.93f

    .line 422
    .line 423
    .line 424
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v4, -0x3ffc28f6    # -2.06f

    .line 428
    .line 429
    .line 430
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v4, -0x408f5c29    # -0.94f

    .line 434
    .line 435
    .line 436
    const v6, -0x3ffb851f    # -2.07f

    .line 437
    .line 438
    .line 439
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v4, -0x40947ae1    # -0.92f

    .line 443
    .line 444
    .line 445
    const v6, 0x40047ae1    # 2.07f

    .line 446
    .line 447
    .line 448
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v4, -0x3ffae148    # -2.08f

    .line 452
    .line 453
    .line 454
    const v6, 0x3f6e147b    # 0.93f

    .line 455
    .line 456
    .line 457
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v4, 0x40051eb8    # 2.08f

    .line 461
    .line 462
    .line 463
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 470
    .line 471
    .line 472
    move-result-object v2

    .line 473
    const/high16 v6, 0x3f800000    # 1.0f

    .line 474
    .line 475
    const/4 v7, 0x0

    .line 476
    const-string v4, ""

    .line 477
    .line 478
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 479
    .line 480
    .line 481
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 482
    .line 483
    .line 484
    move-result v3

    .line 485
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 486
    .line 487
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 488
    .line 489
    .line 490
    move-result-wide v6

    .line 491
    const/4 v0, 0x0

    .line 492
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 493
    .line 494
    .line 495
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 496
    .line 497
    .line 498
    move-result v10

    .line 499
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 500
    .line 501
    .line 502
    move-result v11

    .line 503
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 506
    .line 507
    .line 508
    const/high16 v2, 0x40600000    # 3.5f

    .line 509
    .line 510
    const/high16 v4, 0x41300000    # 11.0f

    .line 511
    .line 512
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v2, 0x3f000000    # 0.5f

    .line 516
    .line 517
    const/high16 v4, -0x40000000    # -2.0f

    .line 518
    .line 519
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const/high16 v2, 0x40000000    # 2.0f

    .line 523
    .line 524
    const/high16 v4, -0x41000000    # -0.5f

    .line 525
    .line 526
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const/high16 v2, -0x41000000    # -0.5f

    .line 530
    .line 531
    const/high16 v4, -0x40000000    # -2.0f

    .line 532
    .line 533
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const/high16 v2, 0x40000000    # 2.0f

    .line 540
    .line 541
    const/high16 v4, -0x41000000    # -0.5f

    .line 542
    .line 543
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const/high16 v2, 0x3f000000    # 0.5f

    .line 547
    .line 548
    const/high16 v4, -0x40000000    # -2.0f

    .line 549
    .line 550
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const/high16 v2, 0x40000000    # 2.0f

    .line 554
    .line 555
    const/high16 v4, 0x3f000000    # 0.5f

    .line 556
    .line 557
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 564
    .line 565
    .line 566
    move-result-object v2

    .line 567
    const/high16 v6, 0x3f800000    # 1.0f

    .line 568
    .line 569
    const/4 v7, 0x0

    .line 570
    const-string v4, ""

    .line 571
    .line 572
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    sput-object v0, Landroidx/compose/material/icons/outlined/InsightsKt;->_insights:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 581
    .line 582
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 583
    .line 584
    .line 585
    return-object v0
.end method
