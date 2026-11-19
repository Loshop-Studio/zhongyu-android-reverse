.class public final Landroidx/compose/material/icons/rounded/ProductionQuantityLimitsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_productionQuantityLimits",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "ProductionQuantityLimits",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getProductionQuantityLimits",
        "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nProductionQuantityLimits.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductionQuantityLimits.kt\nandroidx/compose/material/icons/rounded/ProductionQuantityLimitsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,94:1\n212#2,12:95\n233#2,18:108\n253#2:145\n174#3:107\n705#4,2:126\n717#4,2:128\n719#4,11:134\n72#5,4:130\n*S KotlinDebug\n*F\n+ 1 ProductionQuantityLimits.kt\nandroidx/compose/material/icons/rounded/ProductionQuantityLimitsKt\n*L\n29#1:95,12\n30#1:108,18\n30#1:145\n29#1:107\n30#1:126,2\n30#1:128,2\n30#1:134,11\n30#1:130,4\n*E\n"
    }
.end annotation


# static fields
.field private static _productionQuantityLimits:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getProductionQuantityLimits(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ProductionQuantityLimitsKt;->_productionQuantityLimits:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.ProductionQuantityLimits"

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
    const/4 v0, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v0, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const/high16 v0, 0x41200000    # 10.0f

    .line 71
    .line 72
    const/high16 v2, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 78
    .line 79
    .line 80
    const/high16 v17, -0x40800000    # -1.0f

    .line 81
    .line 82
    const/high16 v18, -0x40800000    # -1.0f

    .line 83
    .line 84
    const v13, -0x40f33333    # -0.55f

    .line 85
    .line 86
    .line 87
    const/4 v14, 0x0

    .line 88
    const/high16 v15, -0x40800000    # -1.0f

    .line 89
    .line 90
    const v16, -0x4119999a    # -0.45f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/4 v0, 0x0

    .line 97
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v17, 0x3f800000    # 1.0f

    .line 101
    .line 102
    const/4 v13, 0x0

    .line 103
    const v14, -0x40f33333    # -0.55f

    .line 104
    .line 105
    .line 106
    const v15, 0x3ee66666    # 0.45f

    .line 107
    .line 108
    .line 109
    const/high16 v16, -0x40800000    # -1.0f

    .line 110
    .line 111
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v18, 0x3f800000    # 1.0f

    .line 118
    .line 119
    const v13, 0x3f0ccccd    # 0.55f

    .line 120
    .line 121
    .line 122
    const/4 v14, 0x0

    .line 123
    const/high16 v15, 0x3f800000    # 1.0f

    .line 124
    .line 125
    const v16, 0x3ee66666    # 0.45f

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v17, 0x41400000    # 12.0f

    .line 135
    .line 136
    const/high16 v18, 0x41200000    # 10.0f

    .line 137
    .line 138
    const/high16 v13, 0x41500000    # 13.0f

    .line 139
    .line 140
    const v14, 0x4118cccd    # 9.55f

    .line 141
    .line 142
    .line 143
    const v15, 0x4148cccd    # 12.55f

    .line 144
    .line 145
    .line 146
    const/high16 v16, 0x41200000    # 10.0f

    .line 147
    .line 148
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v0, 0x40c00000    # 6.0f

    .line 155
    .line 156
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v17, -0x40800000    # -1.0f

    .line 163
    .line 164
    const/high16 v18, -0x40800000    # -1.0f

    .line 165
    .line 166
    const v13, -0x40f33333    # -0.55f

    .line 167
    .line 168
    .line 169
    const/4 v14, 0x0

    .line 170
    const/high16 v15, -0x40800000    # -1.0f

    .line 171
    .line 172
    const v16, -0x4119999a    # -0.45f

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const/high16 v0, 0x40000000    # 2.0f

    .line 179
    .line 180
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const/high16 v17, 0x3f800000    # 1.0f

    .line 184
    .line 185
    const/4 v13, 0x0

    .line 186
    const v14, -0x40f33333    # -0.55f

    .line 187
    .line 188
    .line 189
    const v15, 0x3ee66666    # 0.45f

    .line 190
    .line 191
    .line 192
    const/high16 v16, -0x40800000    # -1.0f

    .line 193
    .line 194
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/4 v0, 0x0

    .line 198
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v18, 0x3f800000    # 1.0f

    .line 202
    .line 203
    const v13, 0x3f0ccccd    # 0.55f

    .line 204
    .line 205
    .line 206
    const/4 v14, 0x0

    .line 207
    const/high16 v15, 0x3f800000    # 1.0f

    .line 208
    .line 209
    const v16, 0x3ee66666    # 0.45f

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v0, 0x40400000    # 3.0f

    .line 216
    .line 217
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v17, 0x41400000    # 12.0f

    .line 221
    .line 222
    const/high16 v18, 0x40c00000    # 6.0f

    .line 223
    .line 224
    const/high16 v13, 0x41500000    # 13.0f

    .line 225
    .line 226
    const v14, 0x40b1999a    # 5.55f

    .line 227
    .line 228
    .line 229
    const v15, 0x4148cccd    # 12.55f

    .line 230
    .line 231
    .line 232
    const/high16 v16, 0x40c00000    # 6.0f

    .line 233
    .line 234
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const/high16 v0, 0x40e00000    # 7.0f

    .line 241
    .line 242
    const/high16 v2, 0x41900000    # 18.0f

    .line 243
    .line 244
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v17, -0x400147ae    # -1.99f

    .line 248
    .line 249
    .line 250
    const/high16 v18, 0x40000000    # 2.0f

    .line 251
    .line 252
    const v13, -0x40733333    # -1.1f

    .line 253
    .line 254
    .line 255
    const/4 v14, 0x0

    .line 256
    const v15, -0x400147ae    # -1.99f

    .line 257
    .line 258
    .line 259
    const v16, 0x3f666666    # 0.9f

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v0, 0x40bccccd    # 5.9f

    .line 266
    .line 267
    .line 268
    const/high16 v2, 0x41b00000    # 22.0f

    .line 269
    .line 270
    const/high16 v4, 0x40e00000    # 7.0f

    .line 271
    .line 272
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v0, -0x40000000    # -2.0f

    .line 276
    .line 277
    const v2, -0x4099999a    # -0.9f

    .line 278
    .line 279
    .line 280
    const/high16 v4, 0x40000000    # 2.0f

    .line 281
    .line 282
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v0, 0x4101999a    # 8.1f

    .line 286
    .line 287
    .line 288
    const/high16 v2, 0x40e00000    # 7.0f

    .line 289
    .line 290
    const/high16 v4, 0x41900000    # 18.0f

    .line 291
    .line 292
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v0, 0x41880000    # 17.0f

    .line 299
    .line 300
    const/high16 v2, 0x41900000    # 18.0f

    .line 301
    .line 302
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v0, 0x3f63d70a    # 0.89f

    .line 309
    .line 310
    .line 311
    const v2, 0x3ffeb852    # 1.99f

    .line 312
    .line 313
    .line 314
    const/high16 v4, 0x40000000    # 2.0f

    .line 315
    .line 316
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v0, -0x40000000    # -2.0f

    .line 320
    .line 321
    const v2, -0x4099999a    # -0.9f

    .line 322
    .line 323
    .line 324
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v0, 0x4190cccd    # 18.1f

    .line 328
    .line 329
    .line 330
    const/high16 v2, 0x41880000    # 17.0f

    .line 331
    .line 332
    const/high16 v4, 0x41900000    # 18.0f

    .line 333
    .line 334
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v0, 0x41500000    # 13.0f

    .line 341
    .line 342
    const v2, 0x4101999a    # 8.1f

    .line 343
    .line 344
    .line 345
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v0, 0x40ee6666    # 7.45f

    .line 349
    .line 350
    .line 351
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v17, 0x3fe00000    # 1.75f

    .line 355
    .line 356
    const v18, -0x407c28f6    # -1.03f

    .line 357
    .line 358
    .line 359
    const/high16 v13, 0x3f400000    # 0.75f

    .line 360
    .line 361
    const v15, 0x3fb47ae1    # 1.41f

    .line 362
    .line 363
    .line 364
    const v16, -0x412e147b    # -0.41f

    .line 365
    .line 366
    .line 367
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v0, 0x404f5c29    # 3.24f

    .line 371
    .line 372
    .line 373
    const v2, -0x3f3b851f    # -6.14f

    .line 374
    .line 375
    .line 376
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v17, -0x41333333    # -0.4f

    .line 380
    .line 381
    .line 382
    const v18, -0x40547ae1    # -1.34f

    .line 383
    .line 384
    .line 385
    const/high16 v13, 0x3e800000    # 0.25f

    .line 386
    .line 387
    const v14, -0x410a3d71    # -0.48f

    .line 388
    .line 389
    .line 390
    const v15, 0x3da3d70a    # 0.08f

    .line 391
    .line 392
    .line 393
    const v16, -0x4075c28f    # -1.08f

    .line 394
    .line 395
    .line 396
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const/4 v0, 0x0

    .line 400
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const v17, -0x4051eb85    # -1.36f

    .line 404
    .line 405
    .line 406
    const v18, 0x3ed1eb85    # 0.41f

    .line 407
    .line 408
    .line 409
    const v13, -0x41051eb8    # -0.49f

    .line 410
    .line 411
    .line 412
    const v14, -0x4175c28f    # -0.27f

    .line 413
    .line 414
    .line 415
    const v15, -0x40733333    # -1.1f

    .line 416
    .line 417
    .line 418
    const v16, -0x425c28f6    # -0.08f

    .line 419
    .line 420
    .line 421
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v0, 0x4178cccd    # 15.55f

    .line 425
    .line 426
    .line 427
    const/high16 v2, 0x41300000    # 11.0f

    .line 428
    .line 429
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v0, 0x41087ae1    # 8.53f

    .line 433
    .line 434
    .line 435
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v0, 0x4088a3d7    # 4.27f

    .line 439
    .line 440
    .line 441
    const/high16 v2, 0x40000000    # 2.0f

    .line 442
    .line 443
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const/high16 v0, 0x40000000    # 2.0f

    .line 447
    .line 448
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const/high16 v17, 0x3f800000    # 1.0f

    .line 452
    .line 453
    const/high16 v18, 0x40400000    # 3.0f

    .line 454
    .line 455
    const v13, 0x3fb9999a    # 1.45f

    .line 456
    .line 457
    .line 458
    const/high16 v14, 0x40000000    # 2.0f

    .line 459
    .line 460
    const/high16 v15, 0x3f800000    # 1.0f

    .line 461
    .line 462
    const v16, 0x401ccccd    # 2.45f

    .line 463
    .line 464
    .line 465
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const/4 v0, 0x0

    .line 469
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const/high16 v18, 0x3f800000    # 1.0f

    .line 473
    .line 474
    const/4 v13, 0x0

    .line 475
    const v14, 0x3f0ccccd    # 0.55f

    .line 476
    .line 477
    .line 478
    const v15, 0x3ee66666    # 0.45f

    .line 479
    .line 480
    .line 481
    const/high16 v16, 0x3f800000    # 1.0f

    .line 482
    .line 483
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const/high16 v0, 0x3f800000    # 1.0f

    .line 487
    .line 488
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const v0, 0x40666666    # 3.6f

    .line 492
    .line 493
    .line 494
    const v2, 0x40f2e148    # 7.59f

    .line 495
    .line 496
    .line 497
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const v0, -0x40533333    # -1.35f

    .line 501
    .line 502
    .line 503
    const v2, 0x401c28f6    # 2.44f

    .line 504
    .line 505
    .line 506
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const/high16 v17, 0x40e00000    # 7.0f

    .line 510
    .line 511
    const/high16 v18, 0x41880000    # 17.0f

    .line 512
    .line 513
    const v13, 0x4090a3d7    # 4.52f

    .line 514
    .line 515
    .line 516
    const v14, 0x4175eb85    # 15.37f

    .line 517
    .line 518
    .line 519
    const v15, 0x40af5c29    # 5.48f

    .line 520
    .line 521
    .line 522
    const/high16 v16, 0x41880000    # 17.0f

    .line 523
    .line 524
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const/high16 v0, 0x41300000    # 11.0f

    .line 528
    .line 529
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const/high16 v17, 0x3f800000    # 1.0f

    .line 533
    .line 534
    const/high16 v18, -0x40800000    # -1.0f

    .line 535
    .line 536
    const v13, 0x3f0ccccd    # 0.55f

    .line 537
    .line 538
    .line 539
    const/4 v14, 0x0

    .line 540
    const/high16 v15, 0x3f800000    # 1.0f

    .line 541
    .line 542
    const v16, -0x4119999a    # -0.45f

    .line 543
    .line 544
    .line 545
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const/4 v0, 0x0

    .line 549
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const/high16 v17, -0x40800000    # -1.0f

    .line 553
    .line 554
    const/4 v13, 0x0

    .line 555
    const v14, -0x40f33333    # -0.55f

    .line 556
    .line 557
    .line 558
    const v15, -0x4119999a    # -0.45f

    .line 559
    .line 560
    .line 561
    const/high16 v16, -0x40800000    # -1.0f

    .line 562
    .line 563
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const/high16 v0, 0x40e00000    # 7.0f

    .line 567
    .line 568
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const/high16 v0, 0x41500000    # 13.0f

    .line 572
    .line 573
    const v2, 0x4101999a    # 8.1f

    .line 574
    .line 575
    .line 576
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 583
    .line 584
    .line 585
    move-result-object v2

    .line 586
    const/16 v16, 0x3800

    .line 587
    .line 588
    const/16 v17, 0x0

    .line 589
    .line 590
    const/high16 v6, 0x3f800000    # 1.0f

    .line 591
    .line 592
    const/high16 v8, 0x3f800000    # 1.0f

    .line 593
    .line 594
    const/4 v7, 0x0

    .line 595
    const/high16 v9, 0x3f800000    # 1.0f

    .line 596
    .line 597
    const/high16 v12, 0x3f800000    # 1.0f

    .line 598
    .line 599
    const/4 v14, 0x0

    .line 600
    const/4 v15, 0x0

    .line 601
    const-string v4, ""

    .line 602
    .line 603
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 608
    .line 609
    .line 610
    move-result-object v0

    .line 611
    sput-object v0, Landroidx/compose/material/icons/rounded/ProductionQuantityLimitsKt;->_productionQuantityLimits:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 612
    .line 613
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 614
    .line 615
    .line 616
    return-object v0
.end method
