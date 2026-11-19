.class public final Landroidx/compose/material/icons/twotone/ChairKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_chair",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Chair",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getChair",
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
        "SMAP\nChair.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chair.kt\nandroidx/compose/material/icons/twotone/ChairKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,115:1\n212#2,12:116\n233#2,18:129\n253#2:166\n233#2,18:167\n253#2:204\n233#2,18:205\n253#2:242\n174#3:128\n705#4,2:147\n717#4,2:149\n719#4,11:155\n705#4,2:185\n717#4,2:187\n719#4,11:193\n705#4,2:223\n717#4,2:225\n719#4,11:231\n72#5,4:151\n72#5,4:189\n72#5,4:227\n*S KotlinDebug\n*F\n+ 1 Chair.kt\nandroidx/compose/material/icons/twotone/ChairKt\n*L\n29#1:116,12\n30#1:129,18\n30#1:166\n44#1:167,18\n44#1:204\n60#1:205,18\n60#1:242\n29#1:128\n30#1:147,2\n30#1:149,2\n30#1:155,11\n44#1:185,2\n44#1:187,2\n44#1:193,11\n60#1:223,2\n60#1:225,2\n60#1:231,11\n30#1:151,4\n44#1:189,4\n60#1:227,4\n*E\n"
    }
.end annotation


# static fields
.field private static _chair:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getChair(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/ChairKt;->_chair:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Chair"

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
    const/high16 v4, 0x41500000    # 13.0f

    .line 71
    .line 72
    const/high16 v6, 0x40e00000    # 7.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x41200000    # 10.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, -0x40000000    # -2.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v25, 0x3f800000    # 1.0f

    .line 88
    .line 89
    const v26, -0x3ff1eb85    # -2.22f

    .line 90
    .line 91
    .line 92
    const/16 v21, 0x0

    .line 93
    .line 94
    const v22, -0x409eb852    # -0.88f

    .line 95
    .line 96
    .line 97
    const v23, 0x3ec7ae14    # 0.39f

    .line 98
    .line 99
    .line 100
    const v24, -0x402a3d71    # -1.67f

    .line 101
    .line 102
    .line 103
    move-object/from16 v20, v2

    .line 104
    .line 105
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const/high16 v4, 0x40c00000    # 6.0f

    .line 109
    .line 110
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const/high16 v25, -0x40800000    # -1.0f

    .line 114
    .line 115
    const/high16 v26, -0x40800000    # -1.0f

    .line 116
    .line 117
    const v22, -0x40f33333    # -0.55f

    .line 118
    .line 119
    .line 120
    const v23, -0x4119999a    # -0.45f

    .line 121
    .line 122
    .line 123
    const/high16 v24, -0x40800000    # -1.0f

    .line 124
    .line 125
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v4, 0x40e00000    # 7.0f

    .line 129
    .line 130
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v25, 0x40c00000    # 6.0f

    .line 134
    .line 135
    const/high16 v26, 0x40c00000    # 6.0f

    .line 136
    .line 137
    const v21, 0x40ce6666    # 6.45f

    .line 138
    .line 139
    .line 140
    const/high16 v22, 0x40a00000    # 5.0f

    .line 141
    .line 142
    const/high16 v23, 0x40c00000    # 6.0f

    .line 143
    .line 144
    const v24, 0x40ae6666    # 5.45f

    .line 145
    .line 146
    .line 147
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v4, 0x4031eb85    # 2.78f

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const/high16 v25, 0x40e00000    # 7.0f

    .line 157
    .line 158
    const/high16 v26, 0x41300000    # 11.0f

    .line 159
    .line 160
    const v21, 0x40d3851f    # 6.61f

    .line 161
    .line 162
    .line 163
    const v22, 0x411547ae    # 9.33f

    .line 164
    .line 165
    .line 166
    const/high16 v23, 0x40e00000    # 7.0f

    .line 167
    .line 168
    const v24, 0x4121eb85    # 10.12f

    .line 169
    .line 170
    .line 171
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const/high16 v4, 0x41500000    # 13.0f

    .line 175
    .line 176
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    const/16 v16, 0x3800

    .line 187
    .line 188
    const/16 v17, 0x0

    .line 189
    .line 190
    const v6, 0x3e99999a    # 0.3f

    .line 191
    .line 192
    .line 193
    const v8, 0x3e99999a    # 0.3f

    .line 194
    .line 195
    .line 196
    const/4 v7, 0x0

    .line 197
    const/high16 v9, 0x3f800000    # 1.0f

    .line 198
    .line 199
    const/high16 v12, 0x3f800000    # 1.0f

    .line 200
    .line 201
    const/4 v13, 0x0

    .line 202
    const/4 v14, 0x0

    .line 203
    const/4 v15, 0x0

    .line 204
    const-string v4, ""

    .line 205
    .line 206
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 207
    .line 208
    .line 209
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 214
    .line 215
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 216
    .line 217
    .line 218
    move-result-wide v6

    .line 219
    const/4 v2, 0x0

    .line 220
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 224
    .line 225
    .line 226
    move-result v10

    .line 227
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 228
    .line 229
    .line 230
    move-result v11

    .line 231
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 234
    .line 235
    .line 236
    const/high16 v4, 0x41a00000    # 20.0f

    .line 237
    .line 238
    const/high16 v6, 0x41200000    # 10.0f

    .line 239
    .line 240
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v25, -0x40800000    # -1.0f

    .line 244
    .line 245
    const/high16 v26, 0x3f800000    # 1.0f

    .line 246
    .line 247
    const v21, -0x40f33333    # -0.55f

    .line 248
    .line 249
    .line 250
    const/16 v22, 0x0

    .line 251
    .line 252
    const/high16 v23, -0x40800000    # -1.0f

    .line 253
    .line 254
    const v24, 0x3ee66666    # 0.45f

    .line 255
    .line 256
    .line 257
    move-object/from16 v20, v2

    .line 258
    .line 259
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v4, 0x40800000    # 4.0f

    .line 263
    .line 264
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/high16 v4, 0x40a00000    # 5.0f

    .line 268
    .line 269
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v4, -0x3f800000    # -4.0f

    .line 273
    .line 274
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v26, -0x40800000    # -1.0f

    .line 278
    .line 279
    const/16 v21, 0x0

    .line 280
    .line 281
    const v22, -0x40f33333    # -0.55f

    .line 282
    .line 283
    .line 284
    const v23, -0x4119999a    # -0.45f

    .line 285
    .line 286
    .line 287
    const/high16 v24, -0x40800000    # -1.0f

    .line 288
    .line 289
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v4, 0x3ee66666    # 0.45f

    .line 293
    .line 294
    .line 295
    const/high16 v6, -0x40800000    # -1.0f

    .line 296
    .line 297
    const/high16 v7, 0x3f800000    # 1.0f

    .line 298
    .line 299
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const/high16 v4, 0x40a00000    # 5.0f

    .line 303
    .line 304
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/high16 v25, 0x3f800000    # 1.0f

    .line 308
    .line 309
    const/high16 v26, 0x3f800000    # 1.0f

    .line 310
    .line 311
    const v22, 0x3f0ccccd    # 0.55f

    .line 312
    .line 313
    .line 314
    const v23, 0x3ee66666    # 0.45f

    .line 315
    .line 316
    .line 317
    const/high16 v24, 0x3f800000    # 1.0f

    .line 318
    .line 319
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/high16 v4, 0x41800000    # 16.0f

    .line 323
    .line 324
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v26, -0x40800000    # -1.0f

    .line 328
    .line 329
    const v21, 0x3f0ccccd    # 0.55f

    .line 330
    .line 331
    .line 332
    const/16 v22, 0x0

    .line 333
    .line 334
    const/high16 v23, 0x3f800000    # 1.0f

    .line 335
    .line 336
    const v24, -0x4119999a    # -0.45f

    .line 337
    .line 338
    .line 339
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v4, -0x3f600000    # -5.0f

    .line 343
    .line 344
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v25, 0x41a00000    # 20.0f

    .line 348
    .line 349
    const/high16 v26, 0x41200000    # 10.0f

    .line 350
    .line 351
    const/high16 v21, 0x41a80000    # 21.0f

    .line 352
    .line 353
    const v22, 0x41273333    # 10.45f

    .line 354
    .line 355
    .line 356
    const v23, 0x41a46666    # 20.55f

    .line 357
    .line 358
    .line 359
    const/high16 v24, 0x41200000    # 10.0f

    .line 360
    .line 361
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 368
    .line 369
    .line 370
    move-result-object v2

    .line 371
    const v6, 0x3e99999a    # 0.3f

    .line 372
    .line 373
    .line 374
    const/4 v7, 0x0

    .line 375
    const-string v4, ""

    .line 376
    .line 377
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 378
    .line 379
    .line 380
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 381
    .line 382
    .line 383
    move-result v3

    .line 384
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 385
    .line 386
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 387
    .line 388
    .line 389
    move-result-wide v6

    .line 390
    const/4 v0, 0x0

    .line 391
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 392
    .line 393
    .line 394
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 395
    .line 396
    .line 397
    move-result v10

    .line 398
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 399
    .line 400
    .line 401
    move-result v11

    .line 402
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 405
    .line 406
    .line 407
    const/high16 v0, 0x41000000    # 8.0f

    .line 408
    .line 409
    const/high16 v2, 0x41a00000    # 20.0f

    .line 410
    .line 411
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const/high16 v0, 0x40c00000    # 6.0f

    .line 415
    .line 416
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 420
    .line 421
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 422
    .line 423
    const v14, -0x402ccccd    # -1.65f

    .line 424
    .line 425
    .line 426
    const v15, -0x40533333    # -1.35f

    .line 427
    .line 428
    .line 429
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 430
    .line 431
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/high16 v0, 0x40e00000    # 7.0f

    .line 435
    .line 436
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const/high16 v17, 0x40800000    # 4.0f

    .line 440
    .line 441
    const/high16 v18, 0x40c00000    # 6.0f

    .line 442
    .line 443
    const v13, 0x40ab3333    # 5.35f

    .line 444
    .line 445
    .line 446
    const/high16 v14, 0x40400000    # 3.0f

    .line 447
    .line 448
    const/high16 v15, 0x40800000    # 4.0f

    .line 449
    .line 450
    const v16, 0x408b3333    # 4.35f

    .line 451
    .line 452
    .line 453
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/high16 v0, 0x40000000    # 2.0f

    .line 457
    .line 458
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 462
    .line 463
    const/high16 v18, 0x40400000    # 3.0f

    .line 464
    .line 465
    const v13, -0x402ccccd    # -1.65f

    .line 466
    .line 467
    .line 468
    const/4 v14, 0x0

    .line 469
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 470
    .line 471
    const v16, 0x3faccccd    # 1.35f

    .line 472
    .line 473
    .line 474
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const/high16 v0, 0x40a00000    # 5.0f

    .line 478
    .line 479
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const/high16 v17, 0x40400000    # 3.0f

    .line 483
    .line 484
    const/4 v13, 0x0

    .line 485
    const v14, 0x3fd33333    # 1.65f

    .line 486
    .line 487
    .line 488
    const v15, 0x3faccccd    # 1.35f

    .line 489
    .line 490
    .line 491
    const/high16 v16, 0x40400000    # 3.0f

    .line 492
    .line 493
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const/high16 v0, 0x3f800000    # 1.0f

    .line 497
    .line 498
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const/high16 v17, 0x3f800000    # 1.0f

    .line 502
    .line 503
    const/high16 v18, 0x3f800000    # 1.0f

    .line 504
    .line 505
    const v14, 0x3f0ccccd    # 0.55f

    .line 506
    .line 507
    .line 508
    const v15, 0x3ee66666    # 0.45f

    .line 509
    .line 510
    .line 511
    const/high16 v16, 0x3f800000    # 1.0f

    .line 512
    .line 513
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const/high16 v18, -0x40800000    # -1.0f

    .line 517
    .line 518
    const v13, 0x3f0ccccd    # 0.55f

    .line 519
    .line 520
    .line 521
    const/4 v14, 0x0

    .line 522
    const/high16 v15, 0x3f800000    # 1.0f

    .line 523
    .line 524
    const v16, -0x4119999a    # -0.45f

    .line 525
    .line 526
    .line 527
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const/high16 v0, -0x40800000    # -1.0f

    .line 531
    .line 532
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const/high16 v0, 0x41400000    # 12.0f

    .line 536
    .line 537
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const/high16 v0, 0x3f800000    # 1.0f

    .line 541
    .line 542
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const/high16 v18, 0x3f800000    # 1.0f

    .line 546
    .line 547
    const/4 v13, 0x0

    .line 548
    const v14, 0x3f0ccccd    # 0.55f

    .line 549
    .line 550
    .line 551
    const v15, 0x3ee66666    # 0.45f

    .line 552
    .line 553
    .line 554
    const/high16 v16, 0x3f800000    # 1.0f

    .line 555
    .line 556
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const/high16 v18, -0x40800000    # -1.0f

    .line 560
    .line 561
    const v13, 0x3f0ccccd    # 0.55f

    .line 562
    .line 563
    .line 564
    const/4 v14, 0x0

    .line 565
    const/high16 v15, 0x3f800000    # 1.0f

    .line 566
    .line 567
    const v16, -0x4119999a    # -0.45f

    .line 568
    .line 569
    .line 570
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const/high16 v0, -0x40800000    # -1.0f

    .line 574
    .line 575
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const/high16 v17, 0x40400000    # 3.0f

    .line 579
    .line 580
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 581
    .line 582
    const v13, 0x3fd33333    # 1.65f

    .line 583
    .line 584
    .line 585
    const/high16 v15, 0x40400000    # 3.0f

    .line 586
    .line 587
    const v16, -0x40533333    # -1.35f

    .line 588
    .line 589
    .line 590
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const/high16 v0, -0x3f600000    # -5.0f

    .line 594
    .line 595
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const/high16 v17, 0x41a00000    # 20.0f

    .line 599
    .line 600
    const/high16 v18, 0x41000000    # 8.0f

    .line 601
    .line 602
    const/high16 v13, 0x41b80000    # 23.0f

    .line 603
    .line 604
    const v14, 0x4115999a    # 9.35f

    .line 605
    .line 606
    .line 607
    const v15, 0x41ad3333    # 21.65f

    .line 608
    .line 609
    .line 610
    const/high16 v16, 0x41000000    # 8.0f

    .line 611
    .line 612
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const/high16 v0, 0x40c00000    # 6.0f

    .line 619
    .line 620
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const/high16 v17, 0x3f800000    # 1.0f

    .line 624
    .line 625
    const/high16 v18, -0x40800000    # -1.0f

    .line 626
    .line 627
    const/4 v13, 0x0

    .line 628
    const v14, -0x40f33333    # -0.55f

    .line 629
    .line 630
    .line 631
    const v15, 0x3ee66666    # 0.45f

    .line 632
    .line 633
    .line 634
    const/high16 v16, -0x40800000    # -1.0f

    .line 635
    .line 636
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const/high16 v0, 0x41200000    # 10.0f

    .line 640
    .line 641
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const/high16 v18, 0x3f800000    # 1.0f

    .line 645
    .line 646
    const v13, 0x3f0ccccd    # 0.55f

    .line 647
    .line 648
    .line 649
    const/4 v14, 0x0

    .line 650
    const/high16 v15, 0x3f800000    # 1.0f

    .line 651
    .line 652
    const v16, 0x3ee66666    # 0.45f

    .line 653
    .line 654
    .line 655
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const v0, 0x4031eb85    # 2.78f

    .line 659
    .line 660
    .line 661
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const/high16 v17, -0x40800000    # -1.0f

    .line 665
    .line 666
    const v18, 0x400e147b    # 2.22f

    .line 667
    .line 668
    .line 669
    const v13, -0x40e3d70a    # -0.61f

    .line 670
    .line 671
    .line 672
    const v14, 0x3f0ccccd    # 0.55f

    .line 673
    .line 674
    .line 675
    const/high16 v15, -0x40800000    # -1.0f

    .line 676
    .line 677
    const v16, 0x3fab851f    # 1.34f

    .line 678
    .line 679
    .line 680
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 681
    .line 682
    .line 683
    const/high16 v0, 0x40000000    # 2.0f

    .line 684
    .line 685
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    const/high16 v0, 0x40e00000    # 7.0f

    .line 689
    .line 690
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 691
    .line 692
    .line 693
    const/high16 v0, -0x40000000    # -2.0f

    .line 694
    .line 695
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 696
    .line 697
    .line 698
    const v18, -0x3ff1eb85    # -2.22f

    .line 699
    .line 700
    .line 701
    const/4 v13, 0x0

    .line 702
    const v14, -0x409eb852    # -0.88f

    .line 703
    .line 704
    .line 705
    const v15, -0x413851ec    # -0.39f

    .line 706
    .line 707
    .line 708
    const v16, -0x402a3d71    # -1.67f

    .line 709
    .line 710
    .line 711
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    const/high16 v0, 0x40c00000    # 6.0f

    .line 715
    .line 716
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 717
    .line 718
    .line 719
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    const/high16 v0, 0x41a80000    # 21.0f

    .line 723
    .line 724
    const/high16 v2, 0x41800000    # 16.0f

    .line 725
    .line 726
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 727
    .line 728
    .line 729
    const/high16 v18, 0x3f800000    # 1.0f

    .line 730
    .line 731
    const v14, 0x3f0ccccd    # 0.55f

    .line 732
    .line 733
    .line 734
    const v15, -0x4119999a    # -0.45f

    .line 735
    .line 736
    .line 737
    const/high16 v16, 0x3f800000    # 1.0f

    .line 738
    .line 739
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    const/high16 v0, 0x40800000    # 4.0f

    .line 743
    .line 744
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 745
    .line 746
    .line 747
    const/high16 v18, -0x40800000    # -1.0f

    .line 748
    .line 749
    const v13, -0x40f33333    # -0.55f

    .line 750
    .line 751
    .line 752
    const/4 v14, 0x0

    .line 753
    const/high16 v15, -0x40800000    # -1.0f

    .line 754
    .line 755
    const v16, -0x4119999a    # -0.45f

    .line 756
    .line 757
    .line 758
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 759
    .line 760
    .line 761
    const/high16 v0, -0x3f600000    # -5.0f

    .line 762
    .line 763
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 764
    .line 765
    .line 766
    const/high16 v17, 0x3f800000    # 1.0f

    .line 767
    .line 768
    const/4 v13, 0x0

    .line 769
    const v14, -0x40f33333    # -0.55f

    .line 770
    .line 771
    .line 772
    const v15, 0x3ee66666    # 0.45f

    .line 773
    .line 774
    .line 775
    const/high16 v16, -0x40800000    # -1.0f

    .line 776
    .line 777
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 778
    .line 779
    .line 780
    const v0, 0x3ee66666    # 0.45f

    .line 781
    .line 782
    .line 783
    const/high16 v2, 0x3f800000    # 1.0f

    .line 784
    .line 785
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 786
    .line 787
    .line 788
    const/high16 v0, 0x40800000    # 4.0f

    .line 789
    .line 790
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 791
    .line 792
    .line 793
    const/high16 v0, 0x41600000    # 14.0f

    .line 794
    .line 795
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 796
    .line 797
    .line 798
    const/high16 v0, -0x3f800000    # -4.0f

    .line 799
    .line 800
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 801
    .line 802
    .line 803
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 804
    .line 805
    .line 806
    const v0, 0x3ee66666    # 0.45f

    .line 807
    .line 808
    .line 809
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 810
    .line 811
    .line 812
    const/high16 v0, 0x41800000    # 16.0f

    .line 813
    .line 814
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 815
    .line 816
    .line 817
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 818
    .line 819
    .line 820
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 821
    .line 822
    .line 823
    move-result-object v2

    .line 824
    const/16 v16, 0x3800

    .line 825
    .line 826
    const/16 v17, 0x0

    .line 827
    .line 828
    const/high16 v6, 0x3f800000    # 1.0f

    .line 829
    .line 830
    const/high16 v8, 0x3f800000    # 1.0f

    .line 831
    .line 832
    const/4 v7, 0x0

    .line 833
    const/high16 v12, 0x3f800000    # 1.0f

    .line 834
    .line 835
    const/4 v14, 0x0

    .line 836
    const/4 v15, 0x0

    .line 837
    const-string v4, ""

    .line 838
    .line 839
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 840
    .line 841
    .line 842
    move-result-object v0

    .line 843
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 844
    .line 845
    .line 846
    move-result-object v0

    .line 847
    sput-object v0, Landroidx/compose/material/icons/twotone/ChairKt;->_chair:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 848
    .line 849
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 850
    .line 851
    .line 852
    return-object v0
.end method
