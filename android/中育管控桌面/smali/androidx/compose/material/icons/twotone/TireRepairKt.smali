.class public final Landroidx/compose/material/icons/twotone/TireRepairKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_tireRepair",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "TireRepair",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getTireRepair",
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
        "SMAP\nTireRepair.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TireRepair.kt\nandroidx/compose/material/icons/twotone/TireRepairKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,152:1\n212#2,12:153\n233#2,18:166\n253#2:203\n233#2,18:204\n253#2:241\n174#3:165\n705#4,2:184\n717#4,2:186\n719#4,11:192\n705#4,2:222\n717#4,2:224\n719#4,11:230\n72#5,4:188\n72#5,4:226\n*S KotlinDebug\n*F\n+ 1 TireRepair.kt\nandroidx/compose/material/icons/twotone/TireRepairKt\n*L\n29#1:153,12\n30#1:166,18\n30#1:203\n104#1:204,18\n104#1:241\n29#1:165\n30#1:184,2\n30#1:186,2\n30#1:192,11\n104#1:222,2\n104#1:224,2\n104#1:230,11\n30#1:188,4\n104#1:226,4\n*E\n"
    }
.end annotation


# static fields
.field private static _tireRepair:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTireRepair(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/TireRepairKt;->_tireRepair:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.TireRepair"

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
    const/high16 v4, 0x41000000    # 8.0f

    .line 71
    .line 72
    const/high16 v6, 0x41980000    # 19.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x40800000    # -1.0f

    .line 78
    .line 79
    const/high16 v26, -0x40800000    # -1.0f

    .line 80
    .line 81
    const v21, -0x40f33333    # -0.55f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, -0x40800000    # -1.0f

    .line 87
    .line 88
    const v24, -0x4119999a    # -0.45f

    .line 89
    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v25, 0x3e947ae1    # 0.29f

    .line 97
    .line 98
    .line 99
    const v26, -0x40ca3d71    # -0.71f

    .line 100
    .line 101
    .line 102
    const/16 v21, 0x0

    .line 103
    .line 104
    const v22, -0x4170a3d7    # -0.28f

    .line 105
    .line 106
    .line 107
    const v23, 0x3de147ae    # 0.11f

    .line 108
    .line 109
    .line 110
    const v24, -0x40f851ec    # -0.53f

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v25, 0x401d70a4    # 2.46f

    .line 117
    .line 118
    .line 119
    const v26, -0x407ae148    # -1.04f

    .line 120
    .line 121
    .line 122
    const v21, 0x3ecccccd    # 0.4f

    .line 123
    .line 124
    .line 125
    const v22, -0x41333333    # -0.4f

    .line 126
    .line 127
    .line 128
    const v23, 0x401d70a4    # 2.46f

    .line 129
    .line 130
    .line 131
    const v24, -0x407ae148    # -1.04f

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v4, -0x407ae148    # -1.04f

    .line 138
    .line 139
    .line 140
    const v6, 0x401d70a4    # 2.46f

    .line 141
    .line 142
    .line 143
    const v7, -0x40dc28f6    # -0.64f

    .line 144
    .line 145
    .line 146
    const v8, 0x4003d70a    # 2.06f

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v25, 0x41980000    # 19.0f

    .line 153
    .line 154
    const/high16 v26, 0x41000000    # 8.0f

    .line 155
    .line 156
    const v21, 0x419c3d71    # 19.53f

    .line 157
    .line 158
    .line 159
    const v22, 0x40fc7ae1    # 7.89f

    .line 160
    .line 161
    .line 162
    const v23, 0x419a3d71    # 19.28f

    .line 163
    .line 164
    .line 165
    const/high16 v24, 0x41000000    # 8.0f

    .line 166
    .line 167
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v4, 0x41500000    # 13.0f

    .line 174
    .line 175
    const/high16 v6, 0x41a00000    # 20.0f

    .line 176
    .line 177
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const/high16 v4, 0x40a00000    # 5.0f

    .line 181
    .line 182
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 186
    .line 187
    const/high16 v26, 0x40400000    # 3.0f

    .line 188
    .line 189
    const/16 v21, 0x0

    .line 190
    .line 191
    const v22, 0x3fd33333    # 1.65f

    .line 192
    .line 193
    .line 194
    const v23, -0x40533333    # -1.35f

    .line 195
    .line 196
    .line 197
    const/high16 v24, 0x40400000    # 3.0f

    .line 198
    .line 199
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v4, -0x40533333    # -1.35f

    .line 203
    .line 204
    .line 205
    const/high16 v6, -0x3fc00000    # -3.0f

    .line 206
    .line 207
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v4, -0x40000000    # -2.0f

    .line 211
    .line 212
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v25, -0x40800000    # -1.0f

    .line 216
    .line 217
    const/high16 v26, -0x40800000    # -1.0f

    .line 218
    .line 219
    const v22, -0x40f33333    # -0.55f

    .line 220
    .line 221
    .line 222
    const v23, -0x4119999a    # -0.45f

    .line 223
    .line 224
    .line 225
    const/high16 v24, -0x40800000    # -1.0f

    .line 226
    .line 227
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v4, 0x3ee66666    # 0.45f

    .line 231
    .line 232
    .line 233
    const/high16 v6, 0x3f800000    # 1.0f

    .line 234
    .line 235
    const/high16 v7, -0x40800000    # -1.0f

    .line 236
    .line 237
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const/high16 v4, 0x40400000    # 3.0f

    .line 241
    .line 242
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const/high16 v25, -0x40000000    # -2.0f

    .line 246
    .line 247
    const/high16 v26, 0x40000000    # 2.0f

    .line 248
    .line 249
    const v22, 0x3f8ccccd    # 1.1f

    .line 250
    .line 251
    .line 252
    const v23, -0x4099999a    # -0.9f

    .line 253
    .line 254
    .line 255
    const/high16 v24, 0x40000000    # 2.0f

    .line 256
    .line 257
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v4, 0x40800000    # 4.0f

    .line 261
    .line 262
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v26, -0x40000000    # -2.0f

    .line 266
    .line 267
    const v21, -0x40733333    # -1.1f

    .line 268
    .line 269
    .line 270
    const/16 v22, 0x0

    .line 271
    .line 272
    const/high16 v23, -0x40000000    # -2.0f

    .line 273
    .line 274
    const v24, -0x4099999a    # -0.9f

    .line 275
    .line 276
    .line 277
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v4, 0x40a00000    # 5.0f

    .line 281
    .line 282
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v25, 0x40000000    # 2.0f

    .line 286
    .line 287
    const/16 v21, 0x0

    .line 288
    .line 289
    const v22, -0x40733333    # -1.1f

    .line 290
    .line 291
    .line 292
    const v23, 0x3f666666    # 0.9f

    .line 293
    .line 294
    .line 295
    const/high16 v24, -0x40000000    # -2.0f

    .line 296
    .line 297
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v4, 0x40c00000    # 6.0f

    .line 301
    .line 302
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v26, 0x40000000    # 2.0f

    .line 306
    .line 307
    const v21, 0x3f8ccccd    # 1.1f

    .line 308
    .line 309
    .line 310
    const/16 v22, 0x0

    .line 311
    .line 312
    const/high16 v23, 0x40000000    # 2.0f

    .line 313
    .line 314
    const v24, 0x3f666666    # 0.9f

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v4, 0x4102b852    # 8.17f

    .line 321
    .line 322
    .line 323
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v25, 0x3f800000    # 1.0f

    .line 327
    .line 328
    const v26, -0x41d1eb85    # -0.17f

    .line 329
    .line 330
    .line 331
    const v21, 0x3e9eb852    # 0.31f

    .line 332
    .line 333
    .line 334
    const v22, -0x421eb852    # -0.11f

    .line 335
    .line 336
    .line 337
    const v23, 0x3f266666    # 0.65f

    .line 338
    .line 339
    .line 340
    const v24, -0x41d1eb85    # -0.17f

    .line 341
    .line 342
    .line 343
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const/high16 v25, 0x40400000    # 3.0f

    .line 347
    .line 348
    const/high16 v26, 0x40400000    # 3.0f

    .line 349
    .line 350
    const v21, 0x3fd33333    # 1.65f

    .line 351
    .line 352
    .line 353
    const/16 v22, 0x0

    .line 354
    .line 355
    const/high16 v23, 0x40400000    # 3.0f

    .line 356
    .line 357
    const v24, 0x3faccccd    # 1.35f

    .line 358
    .line 359
    .line 360
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const/high16 v4, 0x40000000    # 2.0f

    .line 364
    .line 365
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const/high16 v25, 0x3f800000    # 1.0f

    .line 369
    .line 370
    const/high16 v26, 0x3f800000    # 1.0f

    .line 371
    .line 372
    const/16 v21, 0x0

    .line 373
    .line 374
    const v22, 0x3f0ccccd    # 0.55f

    .line 375
    .line 376
    .line 377
    const v23, 0x3ee66666    # 0.45f

    .line 378
    .line 379
    .line 380
    const/high16 v24, 0x3f800000    # 1.0f

    .line 381
    .line 382
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const v4, -0x4119999a    # -0.45f

    .line 386
    .line 387
    .line 388
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v4, -0x3f600000    # -5.0f

    .line 392
    .line 393
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v4, -0x40800000    # -1.0f

    .line 397
    .line 398
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/4 v4, 0x0

    .line 402
    const v6, -0x404a3d71    # -1.42f

    .line 403
    .line 404
    .line 405
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 409
    .line 410
    const v26, -0x3f6d70a4    # -4.58f

    .line 411
    .line 412
    .line 413
    const v21, -0x401d70a4    # -1.77f

    .line 414
    .line 415
    .line 416
    const v22, -0x40bae148    # -0.77f

    .line 417
    .line 418
    .line 419
    const/high16 v23, -0x3fc00000    # -3.0f

    .line 420
    .line 421
    const v24, -0x3fde147b    # -2.53f

    .line 422
    .line 423
    .line 424
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const/high16 v25, 0x40a00000    # 5.0f

    .line 428
    .line 429
    const/high16 v26, -0x3f600000    # -5.0f

    .line 430
    .line 431
    const/16 v21, 0x0

    .line 432
    .line 433
    const v22, -0x3fcf5c29    # -2.76f

    .line 434
    .line 435
    .line 436
    const v23, 0x400f5c29    # 2.24f

    .line 437
    .line 438
    .line 439
    const/high16 v24, -0x3f600000    # -5.0f

    .line 440
    .line 441
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v4, 0x400f5c29    # 2.24f

    .line 445
    .line 446
    .line 447
    const/high16 v6, 0x40a00000    # 5.0f

    .line 448
    .line 449
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 453
    .line 454
    const v26, 0x40928f5c    # 4.58f

    .line 455
    .line 456
    .line 457
    const v22, 0x40033333    # 2.05f

    .line 458
    .line 459
    .line 460
    const v23, -0x40628f5c    # -1.23f

    .line 461
    .line 462
    .line 463
    const v24, 0x4073d70a    # 3.81f

    .line 464
    .line 465
    .line 466
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const/high16 v4, 0x41a80000    # 21.0f

    .line 470
    .line 471
    const/high16 v6, 0x41500000    # 13.0f

    .line 472
    .line 473
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v4, 0x41a00000    # 20.0f

    .line 477
    .line 478
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const/high16 v4, 0x41b00000    # 22.0f

    .line 485
    .line 486
    const/high16 v6, 0x40e00000    # 7.0f

    .line 487
    .line 488
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 492
    .line 493
    const v22, -0x402b851f    # -1.66f

    .line 494
    .line 495
    .line 496
    const v23, -0x40547ae1    # -1.34f

    .line 497
    .line 498
    .line 499
    const/high16 v24, -0x3fc00000    # -3.0f

    .line 500
    .line 501
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const v4, 0x3fab851f    # 1.34f

    .line 505
    .line 506
    .line 507
    const/high16 v6, -0x3fc00000    # -3.0f

    .line 508
    .line 509
    const/high16 v7, 0x40400000    # 3.0f

    .line 510
    .line 511
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const/high16 v6, 0x40400000    # 3.0f

    .line 515
    .line 516
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const v4, 0x410a8f5c    # 8.66f

    .line 520
    .line 521
    .line 522
    const/high16 v6, 0x41b00000    # 22.0f

    .line 523
    .line 524
    const/high16 v7, 0x40e00000    # 7.0f

    .line 525
    .line 526
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const/high16 v4, 0x41200000    # 10.0f

    .line 533
    .line 534
    const/high16 v6, 0x40e00000    # 7.0f

    .line 535
    .line 536
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const/high16 v4, 0x41000000    # 8.0f

    .line 540
    .line 541
    const/high16 v6, 0x41100000    # 9.0f

    .line 542
    .line 543
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const v4, 0x40c570a4    # 6.17f

    .line 547
    .line 548
    .line 549
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const v4, 0x4112b852    # 9.17f

    .line 553
    .line 554
    .line 555
    const/high16 v6, 0x40a00000    # 5.0f

    .line 556
    .line 557
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const v4, 0x409a8f5c    # 4.83f

    .line 561
    .line 562
    .line 563
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const v4, 0x40c570a4    # 6.17f

    .line 567
    .line 568
    .line 569
    const/high16 v6, 0x40c00000    # 6.0f

    .line 570
    .line 571
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const/high16 v4, 0x41100000    # 9.0f

    .line 575
    .line 576
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const/high16 v4, 0x40800000    # 4.0f

    .line 580
    .line 581
    const/high16 v6, 0x40e00000    # 7.0f

    .line 582
    .line 583
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const v4, 0x400ae148    # 2.17f

    .line 587
    .line 588
    .line 589
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const/high16 v4, 0x40000000    # 2.0f

    .line 593
    .line 594
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const/high16 v4, 0x41600000    # 14.0f

    .line 598
    .line 599
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const/high16 v4, -0x40000000    # -2.0f

    .line 603
    .line 604
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const v4, 0x400ae148    # 2.17f

    .line 608
    .line 609
    .line 610
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const/high16 v4, 0x40000000    # 2.0f

    .line 614
    .line 615
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const/high16 v4, 0x41980000    # 19.0f

    .line 619
    .line 620
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const/high16 v4, -0x40000000    # -2.0f

    .line 624
    .line 625
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const/high16 v4, 0x40000000    # 2.0f

    .line 629
    .line 630
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const/high16 v4, 0x40c00000    # 6.0f

    .line 634
    .line 635
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const/high16 v4, -0x40000000    # -2.0f

    .line 639
    .line 640
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const/high16 v4, 0x40000000    # 2.0f

    .line 644
    .line 645
    const/high16 v6, -0x40000000    # -2.0f

    .line 646
    .line 647
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const v4, -0x3fcae148    # -2.83f

    .line 651
    .line 652
    .line 653
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const/high16 v4, 0x40000000    # 2.0f

    .line 657
    .line 658
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    const/high16 v4, 0x41400000    # 12.0f

    .line 662
    .line 663
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 664
    .line 665
    .line 666
    const/high16 v4, 0x40000000    # 2.0f

    .line 667
    .line 668
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const v4, -0x3fcae148    # -2.83f

    .line 672
    .line 673
    .line 674
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    const/high16 v4, 0x40000000    # 2.0f

    .line 678
    .line 679
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    const/high16 v4, 0x40e00000    # 7.0f

    .line 683
    .line 684
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

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
    const/high16 v9, 0x3f800000    # 1.0f

    .line 704
    .line 705
    const/high16 v12, 0x3f800000    # 1.0f

    .line 706
    .line 707
    const/4 v13, 0x0

    .line 708
    const/4 v14, 0x0

    .line 709
    const/4 v15, 0x0

    .line 710
    const-string v4, ""

    .line 711
    .line 712
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 713
    .line 714
    .line 715
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 716
    .line 717
    .line 718
    move-result v3

    .line 719
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 720
    .line 721
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 722
    .line 723
    .line 724
    move-result-wide v6

    .line 725
    const/4 v0, 0x0

    .line 726
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 727
    .line 728
    .line 729
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 730
    .line 731
    .line 732
    move-result v10

    .line 733
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 734
    .line 735
    .line 736
    move-result v11

    .line 737
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 740
    .line 741
    .line 742
    const/high16 v0, 0x41200000    # 10.0f

    .line 743
    .line 744
    const/high16 v2, 0x40e00000    # 7.0f

    .line 745
    .line 746
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 747
    .line 748
    .line 749
    const/high16 v0, 0x41000000    # 8.0f

    .line 750
    .line 751
    const/high16 v2, 0x41100000    # 9.0f

    .line 752
    .line 753
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 754
    .line 755
    .line 756
    const v0, 0x40c570a4    # 6.17f

    .line 757
    .line 758
    .line 759
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 760
    .line 761
    .line 762
    const v0, 0x4112b852    # 9.17f

    .line 763
    .line 764
    .line 765
    const/high16 v2, 0x40a00000    # 5.0f

    .line 766
    .line 767
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 768
    .line 769
    .line 770
    const v0, 0x409a8f5c    # 4.83f

    .line 771
    .line 772
    .line 773
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 774
    .line 775
    .line 776
    const v0, 0x40c570a4    # 6.17f

    .line 777
    .line 778
    .line 779
    const/high16 v2, 0x40c00000    # 6.0f

    .line 780
    .line 781
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 782
    .line 783
    .line 784
    const/high16 v0, 0x41100000    # 9.0f

    .line 785
    .line 786
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 787
    .line 788
    .line 789
    const/high16 v0, 0x40800000    # 4.0f

    .line 790
    .line 791
    const/high16 v2, 0x40e00000    # 7.0f

    .line 792
    .line 793
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 794
    .line 795
    .line 796
    const v0, 0x400ae148    # 2.17f

    .line 797
    .line 798
    .line 799
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 800
    .line 801
    .line 802
    const/high16 v0, 0x40000000    # 2.0f

    .line 803
    .line 804
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 805
    .line 806
    .line 807
    const/high16 v0, 0x41600000    # 14.0f

    .line 808
    .line 809
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 810
    .line 811
    .line 812
    const/high16 v0, -0x40000000    # -2.0f

    .line 813
    .line 814
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 815
    .line 816
    .line 817
    const v0, 0x400ae148    # 2.17f

    .line 818
    .line 819
    .line 820
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 821
    .line 822
    .line 823
    const/high16 v0, 0x40000000    # 2.0f

    .line 824
    .line 825
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 826
    .line 827
    .line 828
    const/high16 v0, 0x41980000    # 19.0f

    .line 829
    .line 830
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 831
    .line 832
    .line 833
    const/high16 v0, -0x40000000    # -2.0f

    .line 834
    .line 835
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 836
    .line 837
    .line 838
    const/high16 v0, 0x40000000    # 2.0f

    .line 839
    .line 840
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 841
    .line 842
    .line 843
    const/high16 v0, 0x40c00000    # 6.0f

    .line 844
    .line 845
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 846
    .line 847
    .line 848
    const/high16 v0, -0x40000000    # -2.0f

    .line 849
    .line 850
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 851
    .line 852
    .line 853
    const/high16 v0, 0x40000000    # 2.0f

    .line 854
    .line 855
    const/high16 v2, -0x40000000    # -2.0f

    .line 856
    .line 857
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 858
    .line 859
    .line 860
    const v0, -0x3fcae148    # -2.83f

    .line 861
    .line 862
    .line 863
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 864
    .line 865
    .line 866
    const/high16 v0, 0x40000000    # 2.0f

    .line 867
    .line 868
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 869
    .line 870
    .line 871
    const/high16 v0, 0x41400000    # 12.0f

    .line 872
    .line 873
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 874
    .line 875
    .line 876
    const/high16 v0, 0x40000000    # 2.0f

    .line 877
    .line 878
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 879
    .line 880
    .line 881
    const v0, -0x3fcae148    # -2.83f

    .line 882
    .line 883
    .line 884
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 885
    .line 886
    .line 887
    const/high16 v0, 0x40000000    # 2.0f

    .line 888
    .line 889
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 890
    .line 891
    .line 892
    const/high16 v0, 0x40e00000    # 7.0f

    .line 893
    .line 894
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 895
    .line 896
    .line 897
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 898
    .line 899
    .line 900
    const/high16 v0, 0x41980000    # 19.0f

    .line 901
    .line 902
    const/high16 v2, 0x40800000    # 4.0f

    .line 903
    .line 904
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 905
    .line 906
    .line 907
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 908
    .line 909
    const/high16 v18, 0x40400000    # 3.0f

    .line 910
    .line 911
    const v13, -0x402b851f    # -1.66f

    .line 912
    .line 913
    .line 914
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 915
    .line 916
    const v16, 0x3fab851f    # 1.34f

    .line 917
    .line 918
    .line 919
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 920
    .line 921
    .line 922
    const v0, 0x3fab851f    # 1.34f

    .line 923
    .line 924
    .line 925
    const/high16 v2, 0x40400000    # 3.0f

    .line 926
    .line 927
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 928
    .line 929
    .line 930
    const v0, -0x40547ae1    # -1.34f

    .line 931
    .line 932
    .line 933
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 934
    .line 935
    const/high16 v4, 0x40400000    # 3.0f

    .line 936
    .line 937
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 938
    .line 939
    .line 940
    const v0, 0x41a547ae    # 20.66f

    .line 941
    .line 942
    .line 943
    const/high16 v2, 0x41980000    # 19.0f

    .line 944
    .line 945
    const/high16 v4, 0x40800000    # 4.0f

    .line 946
    .line 947
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 948
    .line 949
    .line 950
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 951
    .line 952
    .line 953
    const v0, 0x419dae14    # 19.71f

    .line 954
    .line 955
    .line 956
    const v2, 0x40f6b852    # 7.71f

    .line 957
    .line 958
    .line 959
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 960
    .line 961
    .line 962
    const/high16 v17, 0x41980000    # 19.0f

    .line 963
    .line 964
    const/high16 v18, 0x41000000    # 8.0f

    .line 965
    .line 966
    const v13, 0x419c3d71    # 19.53f

    .line 967
    .line 968
    .line 969
    const v14, 0x40fc7ae1    # 7.89f

    .line 970
    .line 971
    .line 972
    const v15, 0x419a3d71    # 19.28f

    .line 973
    .line 974
    .line 975
    const/high16 v16, 0x41000000    # 8.0f

    .line 976
    .line 977
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 978
    .line 979
    .line 980
    const/high16 v17, -0x40800000    # -1.0f

    .line 981
    .line 982
    const/high16 v18, -0x40800000    # -1.0f

    .line 983
    .line 984
    const v13, -0x40f33333    # -0.55f

    .line 985
    .line 986
    .line 987
    const/4 v14, 0x0

    .line 988
    const/high16 v15, -0x40800000    # -1.0f

    .line 989
    .line 990
    const v16, -0x4119999a    # -0.45f

    .line 991
    .line 992
    .line 993
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 994
    .line 995
    .line 996
    const v17, 0x3e947ae1    # 0.29f

    .line 997
    .line 998
    .line 999
    const v18, -0x40ca3d71    # -0.71f

    .line 1000
    .line 1001
    .line 1002
    const/4 v13, 0x0

    .line 1003
    const v14, -0x4170a3d7    # -0.28f

    .line 1004
    .line 1005
    .line 1006
    const v15, 0x3de147ae    # 0.11f

    .line 1007
    .line 1008
    .line 1009
    const v16, -0x40f851ec    # -0.53f

    .line 1010
    .line 1011
    .line 1012
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1013
    .line 1014
    .line 1015
    const v17, 0x401d70a4    # 2.46f

    .line 1016
    .line 1017
    .line 1018
    const v18, -0x407ae148    # -1.04f

    .line 1019
    .line 1020
    .line 1021
    const v13, 0x3ecccccd    # 0.4f

    .line 1022
    .line 1023
    .line 1024
    const v14, -0x41333333    # -0.4f

    .line 1025
    .line 1026
    .line 1027
    const v15, 0x401d70a4    # 2.46f

    .line 1028
    .line 1029
    .line 1030
    const v16, -0x407ae148    # -1.04f

    .line 1031
    .line 1032
    .line 1033
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1034
    .line 1035
    .line 1036
    const v4, 0x41a0e148    # 20.11f

    .line 1037
    .line 1038
    .line 1039
    const v6, 0x40e9eb85    # 7.31f

    .line 1040
    .line 1041
    .line 1042
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1043
    .line 1044
    .line 1045
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1046
    .line 1047
    .line 1048
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v2

    .line 1052
    const/16 v16, 0x3800

    .line 1053
    .line 1054
    const/16 v17, 0x0

    .line 1055
    .line 1056
    const v6, 0x3e99999a    # 0.3f

    .line 1057
    .line 1058
    .line 1059
    const v8, 0x3e99999a    # 0.3f

    .line 1060
    .line 1061
    .line 1062
    const/4 v7, 0x0

    .line 1063
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1064
    .line 1065
    const/4 v13, 0x0

    .line 1066
    const/4 v14, 0x0

    .line 1067
    const/4 v15, 0x0

    .line 1068
    const-string v4, ""

    .line 1069
    .line 1070
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v0

    .line 1074
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v0

    .line 1078
    sput-object v0, Landroidx/compose/material/icons/twotone/TireRepairKt;->_tireRepair:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1079
    .line 1080
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1081
    .line 1082
    .line 1083
    return-object v0
.end method
