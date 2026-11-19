.class public final Landroidx/compose/material/icons/rounded/CastForEducationKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_castForEducation",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "CastForEducation",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getCastForEducation",
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
        "SMAP\nCastForEducation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CastForEducation.kt\nandroidx/compose/material/icons/rounded/CastForEducationKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,100:1\n212#2,12:101\n233#2,18:114\n253#2:151\n174#3:113\n705#4,2:132\n717#4,2:134\n719#4,11:140\n72#5,4:136\n*S KotlinDebug\n*F\n+ 1 CastForEducation.kt\nandroidx/compose/material/icons/rounded/CastForEducationKt\n*L\n29#1:101,12\n30#1:114,18\n30#1:151\n29#1:113\n30#1:132,2\n30#1:134,2\n30#1:140,11\n30#1:136,4\n*E\n"
    }
.end annotation


# static fields
.field private static _castForEducation:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCastForEducation(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/CastForEducationKt;->_castForEducation:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.CastForEducation"

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
    const v0, 0x4199999a    # 19.2f

    .line 71
    .line 72
    .line 73
    const v2, 0x4108f5c3    # 8.56f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, -0x3f78f5c3    # -4.22f

    .line 80
    .line 81
    .line 82
    const v2, -0x3feccccd    # -2.3f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v17, -0x408a3d71    # -0.96f

    .line 89
    .line 90
    .line 91
    const/16 v18, 0x0

    .line 92
    .line 93
    const v13, -0x41666666    # -0.3f

    .line 94
    .line 95
    .line 96
    const v14, -0x41dc28f6    # -0.16f

    .line 97
    .line 98
    .line 99
    const v15, -0x40d70a3d    # -0.66f

    .line 100
    .line 101
    .line 102
    const v16, -0x41dc28f6    # -0.16f

    .line 103
    .line 104
    .line 105
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v0, 0x411ccccd    # 9.8f

    .line 109
    .line 110
    .line 111
    const v2, 0x4108f5c3    # 8.56f

    .line 112
    .line 113
    .line 114
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/16 v17, 0x0

    .line 118
    .line 119
    const v18, 0x3f6147ae    # 0.88f

    .line 120
    .line 121
    .line 122
    const v13, -0x414ccccd    # -0.35f

    .line 123
    .line 124
    .line 125
    const v14, 0x3e428f5c    # 0.19f

    .line 126
    .line 127
    .line 128
    const v15, -0x414ccccd    # -0.35f

    .line 129
    .line 130
    .line 131
    const v16, 0x3f30a3d7    # 0.69f

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v0, 0x40133333    # 2.3f

    .line 138
    .line 139
    .line 140
    const v2, 0x40870a3d    # 4.22f

    .line 141
    .line 142
    .line 143
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const v17, 0x3f75c28f    # 0.96f

    .line 147
    .line 148
    .line 149
    const/16 v18, 0x0

    .line 150
    .line 151
    const v13, 0x3e99999a    # 0.3f

    .line 152
    .line 153
    .line 154
    const v14, 0x3e23d70a    # 0.16f

    .line 155
    .line 156
    .line 157
    const v15, 0x3f28f5c3    # 0.66f

    .line 158
    .line 159
    .line 160
    const v16, 0x3e23d70a    # 0.16f

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v0, 0x40870a3d    # 4.22f

    .line 167
    .line 168
    .line 169
    const v2, -0x3feccccd    # -2.3f

    .line 170
    .line 171
    .line 172
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const/16 v17, 0x0

    .line 176
    .line 177
    const v18, -0x409eb852    # -0.88f

    .line 178
    .line 179
    .line 180
    const v13, 0x3eae147b    # 0.34f

    .line 181
    .line 182
    .line 183
    const v14, -0x41bd70a4    # -0.19f

    .line 184
    .line 185
    .line 186
    const v15, 0x3eae147b    # 0.34f

    .line 187
    .line 188
    .line 189
    const v16, -0x40cf5c29    # -0.69f

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v0, 0x41a80000    # 21.0f

    .line 199
    .line 200
    const/high16 v2, 0x40400000    # 3.0f

    .line 201
    .line 202
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v0, 0x40400000    # 3.0f

    .line 206
    .line 207
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v17, -0x40000000    # -2.0f

    .line 211
    .line 212
    const/high16 v18, 0x40000000    # 2.0f

    .line 213
    .line 214
    const v13, -0x40733333    # -1.1f

    .line 215
    .line 216
    .line 217
    const/4 v14, 0x0

    .line 218
    const/high16 v15, -0x40000000    # -2.0f

    .line 219
    .line 220
    const v16, 0x3f666666    # 0.9f

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v0, 0x40000000    # 2.0f

    .line 227
    .line 228
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const/high16 v17, 0x3f800000    # 1.0f

    .line 232
    .line 233
    const/high16 v18, 0x3f800000    # 1.0f

    .line 234
    .line 235
    const/4 v13, 0x0

    .line 236
    const v14, 0x3f0ccccd    # 0.55f

    .line 237
    .line 238
    .line 239
    const v15, 0x3ee66666    # 0.45f

    .line 240
    .line 241
    .line 242
    const/high16 v16, 0x3f800000    # 1.0f

    .line 243
    .line 244
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v0, -0x4119999a    # -0.45f

    .line 248
    .line 249
    .line 250
    const/high16 v2, -0x40800000    # -1.0f

    .line 251
    .line 252
    const/high16 v4, 0x3f800000    # 1.0f

    .line 253
    .line 254
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const/high16 v0, 0x40c00000    # 6.0f

    .line 258
    .line 259
    const/high16 v2, 0x40400000    # 3.0f

    .line 260
    .line 261
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v18, -0x40800000    # -1.0f

    .line 265
    .line 266
    const v14, -0x40f33333    # -0.55f

    .line 267
    .line 268
    .line 269
    const/high16 v16, -0x40800000    # -1.0f

    .line 270
    .line 271
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/high16 v0, 0x41800000    # 16.0f

    .line 275
    .line 276
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const/high16 v18, 0x3f800000    # 1.0f

    .line 280
    .line 281
    const v13, 0x3f0ccccd    # 0.55f

    .line 282
    .line 283
    .line 284
    const/4 v14, 0x0

    .line 285
    const/high16 v15, 0x3f800000    # 1.0f

    .line 286
    .line 287
    const v16, 0x3ee66666    # 0.45f

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v0, 0x41400000    # 12.0f

    .line 294
    .line 295
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v17, -0x40800000    # -1.0f

    .line 299
    .line 300
    const/4 v13, 0x0

    .line 301
    const v14, 0x3f0ccccd    # 0.55f

    .line 302
    .line 303
    .line 304
    const v15, -0x4119999a    # -0.45f

    .line 305
    .line 306
    .line 307
    const/high16 v16, 0x3f800000    # 1.0f

    .line 308
    .line 309
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v0, -0x3f600000    # -5.0f

    .line 313
    .line 314
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v13, -0x40f33333    # -0.55f

    .line 318
    .line 319
    .line 320
    const/4 v14, 0x0

    .line 321
    const/high16 v15, -0x40800000    # -1.0f

    .line 322
    .line 323
    const v16, 0x3ee66666    # 0.45f

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v0, 0x3ee66666    # 0.45f

    .line 330
    .line 331
    .line 332
    const/high16 v2, 0x3f800000    # 1.0f

    .line 333
    .line 334
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/high16 v0, 0x40c00000    # 6.0f

    .line 338
    .line 339
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v17, 0x40000000    # 2.0f

    .line 343
    .line 344
    const/high16 v18, -0x40000000    # -2.0f

    .line 345
    .line 346
    const v13, 0x3f8ccccd    # 1.1f

    .line 347
    .line 348
    .line 349
    const/high16 v15, 0x40000000    # 2.0f

    .line 350
    .line 351
    const v16, -0x4099999a    # -0.9f

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v0, 0x41b80000    # 23.0f

    .line 358
    .line 359
    const/high16 v2, 0x40a00000    # 5.0f

    .line 360
    .line 361
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/high16 v17, -0x40000000    # -2.0f

    .line 365
    .line 366
    const/4 v13, 0x0

    .line 367
    const v14, -0x40733333    # -1.1f

    .line 368
    .line 369
    .line 370
    const v15, -0x4099999a    # -0.9f

    .line 371
    .line 372
    .line 373
    const/high16 v16, -0x40000000    # -2.0f

    .line 374
    .line 375
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v0, 0x416051ec    # 14.02f

    .line 382
    .line 383
    .line 384
    const v2, 0x414bd70a    # 12.74f

    .line 385
    .line 386
    .line 387
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v0, 0x41300000    # 11.0f

    .line 391
    .line 392
    const v2, 0x413170a4    # 11.09f

    .line 393
    .line 394
    .line 395
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v0, 0x3fb47ae1    # 1.41f

    .line 399
    .line 400
    .line 401
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v17, 0x3f051eb8    # 0.52f

    .line 405
    .line 406
    .line 407
    const v18, 0x3f6147ae    # 0.88f

    .line 408
    .line 409
    .line 410
    const v14, 0x3ebd70a4    # 0.37f

    .line 411
    .line 412
    .line 413
    const v15, 0x3e4ccccd    # 0.2f

    .line 414
    .line 415
    .line 416
    const v16, 0x3f333333    # 0.7f

    .line 417
    .line 418
    .line 419
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v0, 0x3fae147b    # 1.36f

    .line 423
    .line 424
    .line 425
    const/high16 v2, 0x40200000    # 2.5f

    .line 426
    .line 427
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v17, 0x3f75c28f    # 0.96f

    .line 431
    .line 432
    .line 433
    const/16 v18, 0x0

    .line 434
    .line 435
    const v13, 0x3e99999a    # 0.3f

    .line 436
    .line 437
    .line 438
    const v14, 0x3e23d70a    # 0.16f

    .line 439
    .line 440
    .line 441
    const v15, 0x3f28f5c3    # 0.66f

    .line 442
    .line 443
    .line 444
    const v16, 0x3e23d70a    # 0.16f

    .line 445
    .line 446
    .line 447
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v0, -0x4051eb85    # -1.36f

    .line 451
    .line 452
    .line 453
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const v17, 0x3f051eb8    # 0.52f

    .line 457
    .line 458
    .line 459
    const v18, -0x409eb852    # -0.88f

    .line 460
    .line 461
    .line 462
    const v13, 0x3ea3d70a    # 0.32f

    .line 463
    .line 464
    .line 465
    const v14, -0x41c7ae14    # -0.18f

    .line 466
    .line 467
    .line 468
    const v15, 0x3f051eb8    # 0.52f

    .line 469
    .line 470
    .line 471
    const v16, -0x40fae148    # -0.52f

    .line 472
    .line 473
    .line 474
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const v0, -0x404b851f    # -1.41f

    .line 478
    .line 479
    .line 480
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v0, -0x3fbeb852    # -3.02f

    .line 484
    .line 485
    .line 486
    const v2, 0x3fd33333    # 1.65f

    .line 487
    .line 488
    .line 489
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const v17, -0x408a3d71    # -0.96f

    .line 493
    .line 494
    .line 495
    const/16 v18, 0x0

    .line 496
    .line 497
    const v13, -0x41666666    # -0.3f

    .line 498
    .line 499
    .line 500
    const v14, 0x3e23d70a    # 0.16f

    .line 501
    .line 502
    .line 503
    const v15, -0x40d70a3d    # -0.66f

    .line 504
    .line 505
    .line 506
    const v16, 0x3e23d70a    # 0.16f

    .line 507
    .line 508
    .line 509
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v0, 0x41900000    # 18.0f

    .line 516
    .line 517
    const/high16 v2, 0x3f800000    # 1.0f

    .line 518
    .line 519
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const/high16 v0, 0x40400000    # 3.0f

    .line 523
    .line 524
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 531
    .line 532
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 533
    .line 534
    const/4 v13, 0x0

    .line 535
    const v14, -0x402b851f    # -1.66f

    .line 536
    .line 537
    .line 538
    const v15, -0x40547ae1    # -1.34f

    .line 539
    .line 540
    .line 541
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 542
    .line 543
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const v0, 0x4008f5c3    # 2.14f

    .line 550
    .line 551
    .line 552
    const v2, 0x416170a4    # 14.09f

    .line 553
    .line 554
    .line 555
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const v17, -0x406e147b    # -1.14f

    .line 559
    .line 560
    .line 561
    const/high16 v18, 0x3f800000    # 1.0f

    .line 562
    .line 563
    const v13, -0x40e66666    # -0.6f

    .line 564
    .line 565
    .line 566
    const v14, -0x42333333    # -0.1f

    .line 567
    .line 568
    .line 569
    const v15, -0x406e147b    # -1.14f

    .line 570
    .line 571
    .line 572
    const v16, 0x3ec7ae14    # 0.39f

    .line 573
    .line 574
    .line 575
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const v17, 0x3f59999a    # 0.85f

    .line 579
    .line 580
    .line 581
    const v18, 0x3f7ae148    # 0.98f

    .line 582
    .line 583
    .line 584
    const/4 v13, 0x0

    .line 585
    const v14, 0x3efae148    # 0.49f

    .line 586
    .line 587
    .line 588
    const v15, 0x3eb851ec    # 0.36f

    .line 589
    .line 590
    .line 591
    const v16, 0x3f666666    # 0.9f

    .line 592
    .line 593
    .line 594
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const v17, 0x40828f5c    # 4.08f

    .line 598
    .line 599
    .line 600
    const v18, 0x40828f5c    # 4.08f

    .line 601
    .line 602
    .line 603
    const v13, 0x40051eb8    # 2.08f

    .line 604
    .line 605
    .line 606
    const v14, 0x3eb851ec    # 0.36f

    .line 607
    .line 608
    .line 609
    const v15, 0x406e147b    # 3.72f

    .line 610
    .line 611
    .line 612
    const/high16 v16, 0x40000000    # 2.0f

    .line 613
    .line 614
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const v17, 0x3f7ae148    # 0.98f

    .line 618
    .line 619
    .line 620
    const v18, 0x3f59999a    # 0.85f

    .line 621
    .line 622
    .line 623
    const v13, 0x3da3d70a    # 0.08f

    .line 624
    .line 625
    .line 626
    const v14, 0x3efae148    # 0.49f

    .line 627
    .line 628
    .line 629
    const v15, 0x3efae148    # 0.49f

    .line 630
    .line 631
    .line 632
    const v16, 0x3f59999a    # 0.85f

    .line 633
    .line 634
    .line 635
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const/high16 v17, 0x3f800000    # 1.0f

    .line 639
    .line 640
    const v18, -0x406e147b    # -1.14f

    .line 641
    .line 642
    .line 643
    const v13, 0x3f1c28f6    # 0.61f

    .line 644
    .line 645
    .line 646
    const/4 v14, 0x0

    .line 647
    const v15, 0x3f8b851f    # 1.09f

    .line 648
    .line 649
    .line 650
    const v16, -0x40f5c28f    # -0.54f

    .line 651
    .line 652
    .line 653
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const v17, -0x3f475c29    # -5.77f

    .line 657
    .line 658
    .line 659
    const v18, -0x3f475c29    # -5.77f

    .line 660
    .line 661
    .line 662
    const v13, -0x410a3d71    # -0.48f

    .line 663
    .line 664
    .line 665
    const v14, -0x3fc28f5c    # -2.96f

    .line 666
    .line 667
    .line 668
    const v15, -0x3fcb851f    # -2.82f

    .line 669
    .line 670
    .line 671
    const v16, -0x3f56b852    # -5.29f

    .line 672
    .line 673
    .line 674
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    const v0, 0x40066666    # 2.1f

    .line 681
    .line 682
    .line 683
    const v2, 0x4120cccd    # 10.05f

    .line 684
    .line 685
    .line 686
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const v17, -0x40733333    # -1.1f

    .line 690
    .line 691
    .line 692
    const/high16 v18, 0x3f800000    # 1.0f

    .line 693
    .line 694
    const v13, -0x40e8f5c3    # -0.59f

    .line 695
    .line 696
    .line 697
    const v14, -0x42b33333    # -0.05f

    .line 698
    .line 699
    .line 700
    const v15, -0x40733333    # -1.1f

    .line 701
    .line 702
    .line 703
    const v16, 0x3ed1eb85    # 0.41f

    .line 704
    .line 705
    .line 706
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    const v17, 0x3f6147ae    # 0.88f

    .line 710
    .line 711
    .line 712
    const v18, 0x3f7d70a4    # 0.99f

    .line 713
    .line 714
    .line 715
    const/4 v13, 0x0

    .line 716
    const v14, 0x3f028f5c    # 0.51f

    .line 717
    .line 718
    .line 719
    const v15, 0x3ec28f5c    # 0.38f

    .line 720
    .line 721
    .line 722
    const v16, 0x3f70a3d7    # 0.94f

    .line 723
    .line 724
    .line 725
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 726
    .line 727
    .line 728
    const v17, 0x410147ae    # 8.08f

    .line 729
    .line 730
    .line 731
    const v18, 0x410147ae    # 8.08f

    .line 732
    .line 733
    .line 734
    const v13, 0x4088a3d7    # 4.27f

    .line 735
    .line 736
    .line 737
    const v14, 0x3ed1eb85    # 0.41f

    .line 738
    .line 739
    .line 740
    const v15, 0x40f570a4    # 7.67f

    .line 741
    .line 742
    .line 743
    const v16, 0x4073d70a    # 3.81f

    .line 744
    .line 745
    .line 746
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 747
    .line 748
    .line 749
    const v17, 0x3f7d70a4    # 0.99f

    .line 750
    .line 751
    .line 752
    const v18, 0x3f5eb852    # 0.87f

    .line 753
    .line 754
    .line 755
    const v13, 0x3d4ccccd    # 0.05f

    .line 756
    .line 757
    .line 758
    const/high16 v14, 0x3f000000    # 0.5f

    .line 759
    .line 760
    const v15, 0x3ef5c28f    # 0.48f

    .line 761
    .line 762
    .line 763
    const v16, 0x3f5eb852    # 0.87f

    .line 764
    .line 765
    .line 766
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 767
    .line 768
    .line 769
    const/high16 v17, 0x3f800000    # 1.0f

    .line 770
    .line 771
    const v18, -0x4071eb85    # -1.11f

    .line 772
    .line 773
    .line 774
    const v13, 0x3f19999a    # 0.6f

    .line 775
    .line 776
    .line 777
    const/4 v14, 0x0

    .line 778
    const v15, 0x3f87ae14    # 1.06f

    .line 779
    .line 780
    .line 781
    const v16, -0x40fae148    # -0.52f

    .line 782
    .line 783
    .line 784
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 785
    .line 786
    .line 787
    const v17, -0x3ee26666    # -9.85f

    .line 788
    .line 789
    .line 790
    const v18, -0x3ee2b852    # -9.83f

    .line 791
    .line 792
    .line 793
    const v13, -0x40f851ec    # -0.53f

    .line 794
    .line 795
    .line 796
    const v14, -0x3f59eb85    # -5.19f

    .line 797
    .line 798
    .line 799
    const v15, -0x3f6ae148    # -4.66f

    .line 800
    .line 801
    .line 802
    const v16, -0x3eeb0a3d    # -9.31f

    .line 803
    .line 804
    .line 805
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 806
    .line 807
    .line 808
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 809
    .line 810
    .line 811
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 812
    .line 813
    .line 814
    move-result-object v2

    .line 815
    const/16 v16, 0x3800

    .line 816
    .line 817
    const/16 v17, 0x0

    .line 818
    .line 819
    const/high16 v6, 0x3f800000    # 1.0f

    .line 820
    .line 821
    const/high16 v8, 0x3f800000    # 1.0f

    .line 822
    .line 823
    const/4 v7, 0x0

    .line 824
    const/high16 v9, 0x3f800000    # 1.0f

    .line 825
    .line 826
    const/high16 v12, 0x3f800000    # 1.0f

    .line 827
    .line 828
    const/4 v13, 0x0

    .line 829
    const/4 v14, 0x0

    .line 830
    const/4 v15, 0x0

    .line 831
    const-string v4, ""

    .line 832
    .line 833
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 834
    .line 835
    .line 836
    move-result-object v0

    .line 837
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 838
    .line 839
    .line 840
    move-result-object v0

    .line 841
    sput-object v0, Landroidx/compose/material/icons/rounded/CastForEducationKt;->_castForEducation:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 842
    .line 843
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 844
    .line 845
    .line 846
    return-object v0
.end method
