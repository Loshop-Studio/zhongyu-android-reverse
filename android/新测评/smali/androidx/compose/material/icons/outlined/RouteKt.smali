.class public final Landroidx/compose/material/icons/outlined/RouteKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_route",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Route",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getRoute",
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
        "SMAP\nRoute.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Route.kt\nandroidx/compose/material/icons/outlined/RouteKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,73:1\n212#2,12:74\n233#2,18:87\n253#2:124\n174#3:86\n705#4,2:105\n717#4,2:107\n719#4,11:113\n72#5,4:109\n*S KotlinDebug\n*F\n+ 1 Route.kt\nandroidx/compose/material/icons/outlined/RouteKt\n*L\n29#1:74,12\n30#1:87,18\n30#1:124\n29#1:86\n30#1:105,2\n30#1:107,2\n30#1:113,11\n30#1:109,4\n*E\n"
    }
.end annotation


# static fields
.field private static _route:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRoute(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/RouteKt;->_route:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Route"

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
    const v0, 0x4172e148    # 15.18f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41980000    # 19.0f

    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v0, 0x40e00000    # 7.0f

    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v17, -0x3f800000    # -4.0f

    .line 84
    .line 85
    const/high16 v18, -0x3f800000    # -4.0f

    .line 86
    .line 87
    const/4 v13, 0x0

    .line 88
    const v14, -0x3ff28f5c    # -2.21f

    .line 89
    .line 90
    .line 91
    const v15, -0x401ae148    # -1.79f

    .line 92
    .line 93
    .line 94
    const/high16 v16, -0x3f800000    # -4.0f

    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v0, 0x3fe51eb8    # 1.79f

    .line 100
    .line 101
    .line 102
    const/high16 v2, 0x40800000    # 4.0f

    .line 103
    .line 104
    const/high16 v4, -0x3f800000    # -4.0f

    .line 105
    .line 106
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const/high16 v0, 0x41200000    # 10.0f

    .line 110
    .line 111
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/high16 v17, -0x40000000    # -2.0f

    .line 115
    .line 116
    const/high16 v18, 0x40000000    # 2.0f

    .line 117
    .line 118
    const v14, 0x3f8ccccd    # 1.1f

    .line 119
    .line 120
    .line 121
    const v15, -0x4099999a    # -0.9f

    .line 122
    .line 123
    .line 124
    const/high16 v16, 0x40000000    # 2.0f

    .line 125
    .line 126
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v0, -0x4099999a    # -0.9f

    .line 130
    .line 131
    .line 132
    const/high16 v2, -0x40000000    # -2.0f

    .line 133
    .line 134
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v0, 0x410d1eb8    # 8.82f

    .line 138
    .line 139
    .line 140
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v17, 0x41100000    # 9.0f

    .line 144
    .line 145
    const/high16 v18, 0x40c00000    # 6.0f

    .line 146
    .line 147
    const v13, 0x41028f5c    # 8.16f

    .line 148
    .line 149
    .line 150
    const v14, 0x41066666    # 8.4f

    .line 151
    .line 152
    .line 153
    const/high16 v15, 0x41100000    # 9.0f

    .line 154
    .line 155
    const v16, 0x40e9999a    # 7.3f

    .line 156
    .line 157
    .line 158
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 162
    .line 163
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 164
    .line 165
    const/4 v13, 0x0

    .line 166
    const v14, -0x402b851f    # -1.66f

    .line 167
    .line 168
    .line 169
    const v15, -0x40547ae1    # -1.34f

    .line 170
    .line 171
    .line 172
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 173
    .line 174
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v0, 0x408ae148    # 4.34f

    .line 178
    .line 179
    .line 180
    const/high16 v2, 0x40c00000    # 6.0f

    .line 181
    .line 182
    const/high16 v4, 0x40400000    # 3.0f

    .line 183
    .line 184
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v17, 0x40000000    # 2.0f

    .line 188
    .line 189
    const v18, 0x40347ae1    # 2.82f

    .line 190
    .line 191
    .line 192
    const v14, 0x3fa66666    # 1.3f

    .line 193
    .line 194
    .line 195
    const v15, 0x3f570a3d    # 0.84f

    .line 196
    .line 197
    .line 198
    const v16, 0x4019999a    # 2.4f

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v0, 0x41880000    # 17.0f

    .line 205
    .line 206
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v17, 0x40800000    # 4.0f

    .line 210
    .line 211
    const/high16 v18, 0x40800000    # 4.0f

    .line 212
    .line 213
    const v14, 0x400d70a4    # 2.21f

    .line 214
    .line 215
    .line 216
    const v15, 0x3fe51eb8    # 1.79f

    .line 217
    .line 218
    .line 219
    const/high16 v16, 0x40800000    # 4.0f

    .line 220
    .line 221
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v0, -0x401ae148    # -1.79f

    .line 225
    .line 226
    .line 227
    const/high16 v2, 0x40800000    # 4.0f

    .line 228
    .line 229
    const/high16 v4, -0x3f800000    # -4.0f

    .line 230
    .line 231
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v0, 0x40e00000    # 7.0f

    .line 235
    .line 236
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/high16 v17, 0x40000000    # 2.0f

    .line 240
    .line 241
    const/high16 v18, -0x40000000    # -2.0f

    .line 242
    .line 243
    const v14, -0x40733333    # -1.1f

    .line 244
    .line 245
    .line 246
    const v15, 0x3f666666    # 0.9f

    .line 247
    .line 248
    .line 249
    const/high16 v16, -0x40000000    # -2.0f

    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v0, 0x3f666666    # 0.9f

    .line 255
    .line 256
    .line 257
    const/high16 v2, 0x40000000    # 2.0f

    .line 258
    .line 259
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v0, 0x4102e148    # 8.18f

    .line 263
    .line 264
    .line 265
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v17, -0x40000000    # -2.0f

    .line 269
    .line 270
    const v18, 0x40347ae1    # 2.82f

    .line 271
    .line 272
    .line 273
    const v13, -0x406b851f    # -1.16f

    .line 274
    .line 275
    .line 276
    const v14, 0x3ed1eb85    # 0.41f

    .line 277
    .line 278
    .line 279
    const/high16 v15, -0x40000000    # -2.0f

    .line 280
    .line 281
    const v16, 0x3fc147ae    # 1.51f

    .line 282
    .line 283
    .line 284
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/high16 v17, 0x40400000    # 3.0f

    .line 288
    .line 289
    const/high16 v18, 0x40400000    # 3.0f

    .line 290
    .line 291
    const/4 v13, 0x0

    .line 292
    const v14, 0x3fd47ae1    # 1.66f

    .line 293
    .line 294
    .line 295
    const v15, 0x3fab851f    # 1.34f

    .line 296
    .line 297
    .line 298
    const/high16 v16, 0x40400000    # 3.0f

    .line 299
    .line 300
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const v0, -0x40547ae1    # -1.34f

    .line 304
    .line 305
    .line 306
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 307
    .line 308
    const/high16 v4, 0x40400000    # 3.0f

    .line 309
    .line 310
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/high16 v17, 0x41980000    # 19.0f

    .line 314
    .line 315
    const v18, 0x4172e148    # 15.18f

    .line 316
    .line 317
    .line 318
    const/high16 v13, 0x41a80000    # 21.0f

    .line 319
    .line 320
    const v14, 0x4185999a    # 16.7f

    .line 321
    .line 322
    .line 323
    const v15, 0x41a147ae    # 20.16f

    .line 324
    .line 325
    .line 326
    const v16, 0x4179999a    # 15.6f

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v0, 0x40c00000    # 6.0f

    .line 336
    .line 337
    const/high16 v2, 0x40e00000    # 7.0f

    .line 338
    .line 339
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v17, 0x40a00000    # 5.0f

    .line 343
    .line 344
    const/high16 v18, 0x40c00000    # 6.0f

    .line 345
    .line 346
    const v13, 0x40ae6666    # 5.45f

    .line 347
    .line 348
    .line 349
    const/high16 v14, 0x40e00000    # 7.0f

    .line 350
    .line 351
    const/high16 v15, 0x40a00000    # 5.0f

    .line 352
    .line 353
    const v16, 0x40d1999a    # 6.55f

    .line 354
    .line 355
    .line 356
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const/high16 v0, -0x40800000    # -1.0f

    .line 360
    .line 361
    const v2, 0x3ee66666    # 0.45f

    .line 362
    .line 363
    .line 364
    const/high16 v4, 0x3f800000    # 1.0f

    .line 365
    .line 366
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v0, 0x3ee66666    # 0.45f

    .line 370
    .line 371
    .line 372
    const/high16 v2, 0x3f800000    # 1.0f

    .line 373
    .line 374
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const v0, 0x40d1999a    # 6.55f

    .line 378
    .line 379
    .line 380
    const/high16 v2, 0x40c00000    # 6.0f

    .line 381
    .line 382
    const/high16 v4, 0x40e00000    # 7.0f

    .line 383
    .line 384
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v0, 0x41900000    # 18.0f

    .line 391
    .line 392
    const/high16 v2, 0x41980000    # 19.0f

    .line 393
    .line 394
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const/high16 v17, -0x40800000    # -1.0f

    .line 398
    .line 399
    const/high16 v18, -0x40800000    # -1.0f

    .line 400
    .line 401
    const v13, -0x40f33333    # -0.55f

    .line 402
    .line 403
    .line 404
    const/4 v14, 0x0

    .line 405
    const/high16 v15, -0x40800000    # -1.0f

    .line 406
    .line 407
    const v16, -0x4119999a    # -0.45f

    .line 408
    .line 409
    .line 410
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v0, -0x40800000    # -1.0f

    .line 414
    .line 415
    const v2, 0x3ee66666    # 0.45f

    .line 416
    .line 417
    .line 418
    const/high16 v4, 0x3f800000    # 1.0f

    .line 419
    .line 420
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v0, 0x3ee66666    # 0.45f

    .line 424
    .line 425
    .line 426
    const/high16 v2, 0x3f800000    # 1.0f

    .line 427
    .line 428
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const v0, 0x41946666    # 18.55f

    .line 432
    .line 433
    .line 434
    const/high16 v2, 0x41900000    # 18.0f

    .line 435
    .line 436
    const/high16 v4, 0x41980000    # 19.0f

    .line 437
    .line 438
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 445
    .line 446
    .line 447
    move-result-object v2

    .line 448
    const/16 v16, 0x3800

    .line 449
    .line 450
    const/16 v17, 0x0

    .line 451
    .line 452
    const/high16 v6, 0x3f800000    # 1.0f

    .line 453
    .line 454
    const/high16 v8, 0x3f800000    # 1.0f

    .line 455
    .line 456
    const/4 v7, 0x0

    .line 457
    const/high16 v9, 0x3f800000    # 1.0f

    .line 458
    .line 459
    const/high16 v12, 0x3f800000    # 1.0f

    .line 460
    .line 461
    const/4 v13, 0x0

    .line 462
    const/4 v15, 0x0

    .line 463
    const-string v4, ""

    .line 464
    .line 465
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    sput-object v0, Landroidx/compose/material/icons/outlined/RouteKt;->_route:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 474
    .line 475
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 476
    .line 477
    .line 478
    return-object v0
.end method
