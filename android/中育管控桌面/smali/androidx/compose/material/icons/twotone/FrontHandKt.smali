.class public final Landroidx/compose/material/icons/twotone/FrontHandKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_frontHand",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "FrontHand",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getFrontHand",
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
        "SMAP\nFrontHand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrontHand.kt\nandroidx/compose/material/icons/twotone/FrontHandKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,117:1\n212#2,12:118\n233#2,18:131\n253#2:168\n233#2,18:169\n253#2:206\n174#3:130\n705#4,2:149\n717#4,2:151\n719#4,11:157\n705#4,2:187\n717#4,2:189\n719#4,11:195\n72#5,4:153\n72#5,4:191\n*S KotlinDebug\n*F\n+ 1 FrontHand.kt\nandroidx/compose/material/icons/twotone/FrontHandKt\n*L\n29#1:118,12\n30#1:131,18\n30#1:168\n62#1:169,18\n62#1:206\n29#1:130\n30#1:149,2\n30#1:151,2\n30#1:157,11\n62#1:187,2\n62#1:189,2\n62#1:195,11\n30#1:153,4\n62#1:191,4\n*E\n"
    }
.end annotation


# static fields
.field private static _frontHand:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFrontHand(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/FrontHandKt;->_frontHand:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.FrontHand"

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
    const/high16 v4, 0x41980000    # 19.0f

    .line 71
    .line 72
    const/high16 v6, 0x41780000    # 15.5f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3f300000    # -6.5f

    .line 78
    .line 79
    const/high16 v26, 0x40d00000    # 6.5f

    .line 80
    .line 81
    const/16 v21, 0x0

    .line 82
    .line 83
    const v22, 0x4065c28f    # 3.59f

    .line 84
    .line 85
    .line 86
    const v23, -0x3fc5c28f    # -2.91f

    .line 87
    .line 88
    .line 89
    const/high16 v24, 0x40d00000    # 6.5f

    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v4, 0x4198b852    # 19.09f

    .line 97
    .line 98
    .line 99
    const/high16 v6, 0x40c00000    # 6.0f

    .line 100
    .line 101
    const/high16 v7, 0x41780000    # 15.5f

    .line 102
    .line 103
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v4, 0x40e00000    # 7.0f

    .line 107
    .line 108
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v25, 0x3f000000    # 0.5f

    .line 112
    .line 113
    const/high16 v26, -0x41000000    # -0.5f

    .line 114
    .line 115
    const v22, -0x4170a3d7    # -0.28f

    .line 116
    .line 117
    .line 118
    const v23, 0x3e6147ae    # 0.22f

    .line 119
    .line 120
    .line 121
    const/high16 v24, -0x41000000    # -0.5f

    .line 122
    .line 123
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v4, 0x40d70a3d    # 6.72f

    .line 127
    .line 128
    .line 129
    const/high16 v6, 0x40e00000    # 7.0f

    .line 130
    .line 131
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v4, 0x40a00000    # 5.0f

    .line 135
    .line 136
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v4, 0x40000000    # 2.0f

    .line 140
    .line 141
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v4, 0x40800000    # 4.0f

    .line 145
    .line 146
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v4, 0x406e147b    # 3.72f

    .line 153
    .line 154
    .line 155
    const/high16 v6, 0x41200000    # 10.0f

    .line 156
    .line 157
    const/high16 v7, 0x40800000    # 4.0f

    .line 158
    .line 159
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v4, 0x40e00000    # 7.0f

    .line 163
    .line 164
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v4, 0x40000000    # 2.0f

    .line 168
    .line 169
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v4, 0x40200000    # 2.5f

    .line 173
    .line 174
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v25, 0x41480000    # 12.5f

    .line 178
    .line 179
    const/high16 v26, 0x40000000    # 2.0f

    .line 180
    .line 181
    const/high16 v21, 0x41400000    # 12.0f

    .line 182
    .line 183
    const v22, 0x400e147b    # 2.22f

    .line 184
    .line 185
    .line 186
    const v23, 0x4143851f    # 12.22f

    .line 187
    .line 188
    .line 189
    const/high16 v24, 0x40000000    # 2.0f

    .line 190
    .line 191
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v4, 0x400e147b    # 2.22f

    .line 195
    .line 196
    .line 197
    const/high16 v6, 0x41500000    # 13.0f

    .line 198
    .line 199
    const/high16 v7, 0x40200000    # 2.5f

    .line 200
    .line 201
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v4, 0x41300000    # 11.0f

    .line 205
    .line 206
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v4, 0x40000000    # 2.0f

    .line 210
    .line 211
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const/high16 v4, 0x40900000    # 4.5f

    .line 215
    .line 216
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const/high16 v25, 0x41780000    # 15.5f

    .line 220
    .line 221
    const/high16 v26, 0x40800000    # 4.0f

    .line 222
    .line 223
    const/high16 v21, 0x41700000    # 15.0f

    .line 224
    .line 225
    const v22, 0x40870a3d    # 4.22f

    .line 226
    .line 227
    .line 228
    const v23, 0x4173851f    # 15.22f

    .line 229
    .line 230
    .line 231
    const/high16 v24, 0x40800000    # 4.0f

    .line 232
    .line 233
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v4, 0x40870a3d    # 4.22f

    .line 237
    .line 238
    .line 239
    const/high16 v6, 0x41800000    # 16.0f

    .line 240
    .line 241
    const/high16 v7, 0x40900000    # 4.5f

    .line 242
    .line 243
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v4, 0x410eb852    # 8.92f

    .line 247
    .line 248
    .line 249
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 253
    .line 254
    const v26, 0x40928f5c    # 4.58f

    .line 255
    .line 256
    .line 257
    const v21, -0x401d70a4    # -1.77f

    .line 258
    .line 259
    .line 260
    const v22, 0x3f451eb8    # 0.77f

    .line 261
    .line 262
    .line 263
    const/high16 v23, -0x3fc00000    # -3.0f

    .line 264
    .line 265
    const v24, 0x4021eb85    # 2.53f

    .line 266
    .line 267
    .line 268
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/high16 v4, 0x40000000    # 2.0f

    .line 272
    .line 273
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/high16 v25, 0x40400000    # 3.0f

    .line 277
    .line 278
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 279
    .line 280
    const/16 v21, 0x0

    .line 281
    .line 282
    const v22, -0x402b851f    # -1.66f

    .line 283
    .line 284
    .line 285
    const v23, 0x3fab851f    # 1.34f

    .line 286
    .line 287
    .line 288
    const/high16 v24, -0x3fc00000    # -3.0f

    .line 289
    .line 290
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v4, -0x3f700000    # -4.5f

    .line 294
    .line 295
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v25, 0x3f000000    # 0.5f

    .line 299
    .line 300
    const/high16 v26, -0x41000000    # -0.5f

    .line 301
    .line 302
    const v22, -0x4170a3d7    # -0.28f

    .line 303
    .line 304
    .line 305
    const v23, 0x3e6147ae    # 0.22f

    .line 306
    .line 307
    .line 308
    const/high16 v24, -0x41000000    # -0.5f

    .line 309
    .line 310
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v4, 0x3e6147ae    # 0.22f

    .line 314
    .line 315
    .line 316
    const/high16 v6, 0x3f000000    # 0.5f

    .line 317
    .line 318
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v4, 0x41780000    # 15.5f

    .line 322
    .line 323
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 330
    .line 331
    .line 332
    move-result-object v2

    .line 333
    const/16 v16, 0x3800

    .line 334
    .line 335
    const/16 v17, 0x0

    .line 336
    .line 337
    const v6, 0x3e99999a    # 0.3f

    .line 338
    .line 339
    .line 340
    const v8, 0x3e99999a    # 0.3f

    .line 341
    .line 342
    .line 343
    const/4 v7, 0x0

    .line 344
    const/high16 v9, 0x3f800000    # 1.0f

    .line 345
    .line 346
    const/high16 v12, 0x3f800000    # 1.0f

    .line 347
    .line 348
    const/4 v13, 0x0

    .line 349
    const/4 v14, 0x0

    .line 350
    const/4 v15, 0x0

    .line 351
    const-string v4, ""

    .line 352
    .line 353
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 354
    .line 355
    .line 356
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 357
    .line 358
    .line 359
    move-result v3

    .line 360
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 361
    .line 362
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 363
    .line 364
    .line 365
    move-result-wide v6

    .line 366
    const/4 v0, 0x0

    .line 367
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 368
    .line 369
    .line 370
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 371
    .line 372
    .line 373
    move-result v10

    .line 374
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 375
    .line 376
    .line 377
    move-result v11

    .line 378
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 381
    .line 382
    .line 383
    const/high16 v0, 0x41940000    # 18.5f

    .line 384
    .line 385
    const/high16 v2, 0x41000000    # 8.0f

    .line 386
    .line 387
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v17, -0x41000000    # -0.5f

    .line 391
    .line 392
    const v18, 0x3d4ccccd    # 0.05f

    .line 393
    .line 394
    .line 395
    const v13, -0x41d1eb85    # -0.17f

    .line 396
    .line 397
    .line 398
    const v15, -0x4151eb85    # -0.34f

    .line 399
    .line 400
    .line 401
    const v16, 0x3ca3d70a    # 0.02f

    .line 402
    .line 403
    .line 404
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/high16 v0, 0x40900000    # 4.5f

    .line 408
    .line 409
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const/high16 v17, 0x41780000    # 15.5f

    .line 413
    .line 414
    const/high16 v18, 0x40000000    # 2.0f

    .line 415
    .line 416
    const/high16 v13, 0x41900000    # 18.0f

    .line 417
    .line 418
    const v14, 0x4047ae14    # 3.12f

    .line 419
    .line 420
    .line 421
    const v15, 0x41870a3d    # 16.88f

    .line 422
    .line 423
    .line 424
    const/high16 v16, 0x40000000    # 2.0f

    .line 425
    .line 426
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v17, -0x40f5c28f    # -0.54f

    .line 430
    .line 431
    .line 432
    const v18, 0x3d75c28f    # 0.06f

    .line 433
    .line 434
    .line 435
    const v13, -0x41bd70a4    # -0.19f

    .line 436
    .line 437
    .line 438
    const/4 v14, 0x0

    .line 439
    const v15, -0x41428f5c    # -0.37f

    .line 440
    .line 441
    .line 442
    const v16, 0x3ca3d70a    # 0.02f

    .line 443
    .line 444
    .line 445
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/high16 v17, 0x41480000    # 12.5f

    .line 449
    .line 450
    const/16 v18, 0x0

    .line 451
    .line 452
    const/high16 v13, 0x416c0000    # 14.75f

    .line 453
    .line 454
    const v14, 0x3f63d70a    # 0.89f

    .line 455
    .line 456
    .line 457
    const v15, 0x415bae14    # 13.73f

    .line 458
    .line 459
    .line 460
    const/16 v16, 0x0

    .line 461
    .line 462
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const v17, -0x3feae148    # -2.33f

    .line 466
    .line 467
    .line 468
    const v18, 0x3fcb851f    # 1.59f

    .line 469
    .line 470
    .line 471
    const v13, -0x407851ec    # -1.06f

    .line 472
    .line 473
    .line 474
    const/4 v14, 0x0

    .line 475
    const v15, -0x40051eb8    # -1.96f

    .line 476
    .line 477
    .line 478
    const v16, 0x3f28f5c3    # 0.66f

    .line 479
    .line 480
    .line 481
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const/high16 v17, 0x41180000    # 9.5f

    .line 485
    .line 486
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 487
    .line 488
    const v13, 0x411f5c29    # 9.96f

    .line 489
    .line 490
    .line 491
    const v14, 0x3fc3d70a    # 1.53f

    .line 492
    .line 493
    .line 494
    const v15, 0x411bae14    # 9.73f

    .line 495
    .line 496
    .line 497
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 498
    .line 499
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const/high16 v17, 0x40e00000    # 7.0f

    .line 503
    .line 504
    const/high16 v18, 0x40800000    # 4.0f

    .line 505
    .line 506
    const v13, 0x4101eb85    # 8.12f

    .line 507
    .line 508
    .line 509
    const/high16 v14, 0x3fc00000    # 1.5f

    .line 510
    .line 511
    const/high16 v15, 0x40e00000    # 7.0f

    .line 512
    .line 513
    const v16, 0x4027ae14    # 2.62f

    .line 514
    .line 515
    .line 516
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const v0, 0x3f0ccccd    # 0.55f

    .line 520
    .line 521
    .line 522
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const/high16 v17, 0x40d00000    # 6.5f

    .line 526
    .line 527
    const/high16 v18, 0x40900000    # 4.5f

    .line 528
    .line 529
    const v13, 0x40dae148    # 6.84f

    .line 530
    .line 531
    .line 532
    const v14, 0x4090a3d7    # 4.52f

    .line 533
    .line 534
    .line 535
    const v15, 0x40d570a4    # 6.67f

    .line 536
    .line 537
    .line 538
    const/high16 v16, 0x40900000    # 4.5f

    .line 539
    .line 540
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const/high16 v17, 0x40800000    # 4.0f

    .line 544
    .line 545
    const/high16 v18, 0x40e00000    # 7.0f

    .line 546
    .line 547
    const v13, 0x40a3d70a    # 5.12f

    .line 548
    .line 549
    .line 550
    const/high16 v14, 0x40900000    # 4.5f

    .line 551
    .line 552
    const/high16 v15, 0x40800000    # 4.0f

    .line 553
    .line 554
    const v16, 0x40b3d70a    # 5.62f

    .line 555
    .line 556
    .line 557
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const/high16 v0, 0x41080000    # 8.5f

    .line 561
    .line 562
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const/high16 v17, 0x41080000    # 8.5f

    .line 566
    .line 567
    const/high16 v18, 0x41080000    # 8.5f

    .line 568
    .line 569
    const/4 v13, 0x0

    .line 570
    const v14, 0x4096147b    # 4.69f

    .line 571
    .line 572
    .line 573
    const v15, 0x4073d70a    # 3.81f

    .line 574
    .line 575
    .line 576
    const/high16 v16, 0x41080000    # 8.5f

    .line 577
    .line 578
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const v0, -0x3f8c28f6    # -3.81f

    .line 582
    .line 583
    .line 584
    const/high16 v2, -0x3ef80000    # -8.5f

    .line 585
    .line 586
    const/high16 v4, 0x41080000    # 8.5f

    .line 587
    .line 588
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const/high16 v0, -0x3f600000    # -5.0f

    .line 592
    .line 593
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const/high16 v17, 0x41940000    # 18.5f

    .line 597
    .line 598
    const/high16 v18, 0x41000000    # 8.0f

    .line 599
    .line 600
    const/high16 v13, 0x41a80000    # 21.0f

    .line 601
    .line 602
    const v14, 0x4111eb85    # 9.12f

    .line 603
    .line 604
    .line 605
    const v15, 0x419f0a3d    # 19.88f

    .line 606
    .line 607
    .line 608
    const/high16 v16, 0x41000000    # 8.0f

    .line 609
    .line 610
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const/high16 v0, 0x41980000    # 19.0f

    .line 617
    .line 618
    const/high16 v2, 0x41780000    # 15.5f

    .line 619
    .line 620
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const/high16 v17, -0x3f300000    # -6.5f

    .line 624
    .line 625
    const/high16 v18, 0x40d00000    # 6.5f

    .line 626
    .line 627
    const/4 v13, 0x0

    .line 628
    const v14, 0x4065c28f    # 3.59f

    .line 629
    .line 630
    .line 631
    const v15, -0x3fc5c28f    # -2.91f

    .line 632
    .line 633
    .line 634
    const/high16 v16, 0x40d00000    # 6.5f

    .line 635
    .line 636
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const v0, 0x4198b852    # 19.09f

    .line 640
    .line 641
    .line 642
    const/high16 v2, 0x40c00000    # 6.0f

    .line 643
    .line 644
    const/high16 v4, 0x41780000    # 15.5f

    .line 645
    .line 646
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const/high16 v0, 0x40e00000    # 7.0f

    .line 650
    .line 651
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    const/high16 v17, 0x3f000000    # 0.5f

    .line 655
    .line 656
    const/high16 v18, -0x41000000    # -0.5f

    .line 657
    .line 658
    const v14, -0x4170a3d7    # -0.28f

    .line 659
    .line 660
    .line 661
    const v15, 0x3e6147ae    # 0.22f

    .line 662
    .line 663
    .line 664
    const/high16 v16, -0x41000000    # -0.5f

    .line 665
    .line 666
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    const v0, 0x40d70a3d    # 6.72f

    .line 670
    .line 671
    .line 672
    const/high16 v2, 0x40e00000    # 7.0f

    .line 673
    .line 674
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    const/high16 v0, 0x40a00000    # 5.0f

    .line 678
    .line 679
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    const/high16 v0, 0x40000000    # 2.0f

    .line 683
    .line 684
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    const/high16 v0, 0x40800000    # 4.0f

    .line 688
    .line 689
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const v0, 0x406e147b    # 3.72f

    .line 696
    .line 697
    .line 698
    const/high16 v2, 0x41200000    # 10.0f

    .line 699
    .line 700
    const/high16 v4, 0x40800000    # 4.0f

    .line 701
    .line 702
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 703
    .line 704
    .line 705
    const/high16 v0, 0x40e00000    # 7.0f

    .line 706
    .line 707
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    const/high16 v0, 0x40000000    # 2.0f

    .line 711
    .line 712
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 713
    .line 714
    .line 715
    const/high16 v0, 0x40200000    # 2.5f

    .line 716
    .line 717
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 718
    .line 719
    .line 720
    const/high16 v17, 0x41480000    # 12.5f

    .line 721
    .line 722
    const/high16 v18, 0x40000000    # 2.0f

    .line 723
    .line 724
    const/high16 v13, 0x41400000    # 12.0f

    .line 725
    .line 726
    const v14, 0x400e147b    # 2.22f

    .line 727
    .line 728
    .line 729
    const v15, 0x4143851f    # 12.22f

    .line 730
    .line 731
    .line 732
    const/high16 v16, 0x40000000    # 2.0f

    .line 733
    .line 734
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 735
    .line 736
    .line 737
    const v0, 0x400e147b    # 2.22f

    .line 738
    .line 739
    .line 740
    const/high16 v2, 0x41500000    # 13.0f

    .line 741
    .line 742
    const/high16 v4, 0x40200000    # 2.5f

    .line 743
    .line 744
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 745
    .line 746
    .line 747
    const/high16 v0, 0x41300000    # 11.0f

    .line 748
    .line 749
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    .line 752
    const/high16 v0, 0x40000000    # 2.0f

    .line 753
    .line 754
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 755
    .line 756
    .line 757
    const/high16 v0, 0x40900000    # 4.5f

    .line 758
    .line 759
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 760
    .line 761
    .line 762
    const/high16 v17, 0x41780000    # 15.5f

    .line 763
    .line 764
    const/high16 v18, 0x40800000    # 4.0f

    .line 765
    .line 766
    const/high16 v13, 0x41700000    # 15.0f

    .line 767
    .line 768
    const v14, 0x40870a3d    # 4.22f

    .line 769
    .line 770
    .line 771
    const v15, 0x4173851f    # 15.22f

    .line 772
    .line 773
    .line 774
    const/high16 v16, 0x40800000    # 4.0f

    .line 775
    .line 776
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 777
    .line 778
    .line 779
    const v0, 0x40870a3d    # 4.22f

    .line 780
    .line 781
    .line 782
    const/high16 v2, 0x41800000    # 16.0f

    .line 783
    .line 784
    const/high16 v4, 0x40900000    # 4.5f

    .line 785
    .line 786
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 787
    .line 788
    .line 789
    const v0, 0x410eb852    # 8.92f

    .line 790
    .line 791
    .line 792
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 793
    .line 794
    .line 795
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 796
    .line 797
    const v18, 0x40928f5c    # 4.58f

    .line 798
    .line 799
    .line 800
    const v13, -0x401d70a4    # -1.77f

    .line 801
    .line 802
    .line 803
    const v14, 0x3f451eb8    # 0.77f

    .line 804
    .line 805
    .line 806
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 807
    .line 808
    const v16, 0x4021eb85    # 2.53f

    .line 809
    .line 810
    .line 811
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 812
    .line 813
    .line 814
    const/high16 v0, 0x40000000    # 2.0f

    .line 815
    .line 816
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 817
    .line 818
    .line 819
    const/high16 v17, 0x40400000    # 3.0f

    .line 820
    .line 821
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 822
    .line 823
    const/4 v13, 0x0

    .line 824
    const v14, -0x402b851f    # -1.66f

    .line 825
    .line 826
    .line 827
    const v15, 0x3fab851f    # 1.34f

    .line 828
    .line 829
    .line 830
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 831
    .line 832
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 833
    .line 834
    .line 835
    const/high16 v0, -0x3f700000    # -4.5f

    .line 836
    .line 837
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 838
    .line 839
    .line 840
    const/high16 v17, 0x3f000000    # 0.5f

    .line 841
    .line 842
    const/high16 v18, -0x41000000    # -0.5f

    .line 843
    .line 844
    const v14, -0x4170a3d7    # -0.28f

    .line 845
    .line 846
    .line 847
    const v15, 0x3e6147ae    # 0.22f

    .line 848
    .line 849
    .line 850
    const/high16 v16, -0x41000000    # -0.5f

    .line 851
    .line 852
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 853
    .line 854
    .line 855
    const v0, 0x3e6147ae    # 0.22f

    .line 856
    .line 857
    .line 858
    const/high16 v2, 0x3f000000    # 0.5f

    .line 859
    .line 860
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 861
    .line 862
    .line 863
    const/high16 v0, 0x41780000    # 15.5f

    .line 864
    .line 865
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 866
    .line 867
    .line 868
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 869
    .line 870
    .line 871
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 872
    .line 873
    .line 874
    move-result-object v2

    .line 875
    const/16 v16, 0x3800

    .line 876
    .line 877
    const/16 v17, 0x0

    .line 878
    .line 879
    const/high16 v6, 0x3f800000    # 1.0f

    .line 880
    .line 881
    const/high16 v8, 0x3f800000    # 1.0f

    .line 882
    .line 883
    const/4 v7, 0x0

    .line 884
    const/high16 v12, 0x3f800000    # 1.0f

    .line 885
    .line 886
    const/4 v14, 0x0

    .line 887
    const/4 v15, 0x0

    .line 888
    const-string v4, ""

    .line 889
    .line 890
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 891
    .line 892
    .line 893
    move-result-object v0

    .line 894
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 895
    .line 896
    .line 897
    move-result-object v0

    .line 898
    sput-object v0, Landroidx/compose/material/icons/twotone/FrontHandKt;->_frontHand:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 899
    .line 900
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 901
    .line 902
    .line 903
    return-object v0
.end method
