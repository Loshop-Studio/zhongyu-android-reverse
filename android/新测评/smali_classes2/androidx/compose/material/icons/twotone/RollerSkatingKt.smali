.class public final Landroidx/compose/material/icons/twotone/RollerSkatingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_rollerSkating",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "RollerSkating",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getRollerSkating",
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
        "SMAP\nRollerSkating.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RollerSkating.kt\nandroidx/compose/material/icons/twotone/RollerSkatingKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,141:1\n212#2,12:142\n233#2,18:155\n253#2:192\n233#2,18:193\n253#2:230\n174#3:154\n705#4,2:173\n717#4,2:175\n719#4,11:181\n705#4,2:211\n717#4,2:213\n719#4,11:219\n72#5,4:177\n72#5,4:215\n*S KotlinDebug\n*F\n+ 1 RollerSkating.kt\nandroidx/compose/material/icons/twotone/RollerSkatingKt\n*L\n29#1:142,12\n30#1:155,18\n30#1:192\n69#1:193,18\n69#1:230\n29#1:154\n30#1:173,2\n30#1:175,2\n30#1:181,11\n69#1:211,2\n69#1:213,2\n69#1:219,11\n30#1:177,4\n69#1:215,4\n*E\n"
    }
.end annotation


# static fields
.field private static _rollerSkating:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRollerSkating(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/RollerSkatingKt;->_rollerSkating:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.RollerSkating"

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
    const/high16 v4, 0x41900000    # 18.0f

    .line 71
    .line 72
    const/high16 v6, 0x41600000    # 14.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40c00000    # 6.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x40400000    # 3.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v4, 0x40a00000    # 5.0f

    .line 88
    .line 89
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/high16 v4, 0x3f800000    # 1.0f

    .line 93
    .line 94
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v4, 0x41180000    # 9.5f

    .line 98
    .line 99
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v25, 0x41100000    # 9.0f

    .line 103
    .line 104
    const/high16 v26, 0x40900000    # 4.5f

    .line 105
    .line 106
    const v21, 0x4113851f    # 9.22f

    .line 107
    .line 108
    .line 109
    const/high16 v22, 0x40800000    # 4.0f

    .line 110
    .line 111
    const/high16 v23, 0x41100000    # 9.0f

    .line 112
    .line 113
    const v24, 0x40870a3d    # 4.22f

    .line 114
    .line 115
    .line 116
    move-object/from16 v20, v2

    .line 117
    .line 118
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v25, 0x41180000    # 9.5f

    .line 122
    .line 123
    const/high16 v26, 0x40a00000    # 5.0f

    .line 124
    .line 125
    const/high16 v21, 0x41100000    # 9.0f

    .line 126
    .line 127
    const v22, 0x4098f5c3    # 4.78f

    .line 128
    .line 129
    .line 130
    const v23, 0x4113851f    # 9.22f

    .line 131
    .line 132
    .line 133
    const/high16 v24, 0x40a00000    # 5.0f

    .line 134
    .line 135
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v4, 0x41300000    # 11.0f

    .line 139
    .line 140
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v4, 0x3dcccccd    # 0.1f

    .line 144
    .line 145
    .line 146
    const/high16 v6, 0x3f800000    # 1.0f

    .line 147
    .line 148
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v4, 0x41180000    # 9.5f

    .line 152
    .line 153
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const/high16 v25, 0x41100000    # 9.0f

    .line 157
    .line 158
    const/high16 v26, 0x40d00000    # 6.5f

    .line 159
    .line 160
    const v21, 0x4113851f    # 9.22f

    .line 161
    .line 162
    .line 163
    const/high16 v22, 0x40c00000    # 6.0f

    .line 164
    .line 165
    const/high16 v23, 0x41100000    # 9.0f

    .line 166
    .line 167
    const v24, 0x40c70a3d    # 6.22f

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v25, 0x41180000    # 9.5f

    .line 174
    .line 175
    const/high16 v26, 0x40e00000    # 7.0f

    .line 176
    .line 177
    const/high16 v21, 0x41100000    # 9.0f

    .line 178
    .line 179
    const v22, 0x40d8f5c3    # 6.78f

    .line 180
    .line 181
    .line 182
    const v23, 0x4113851f    # 9.22f

    .line 183
    .line 184
    .line 185
    const/high16 v24, 0x40e00000    # 7.0f

    .line 186
    .line 187
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v4, 0x3fe7ae14    # 1.81f

    .line 191
    .line 192
    .line 193
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v25, 0x40266666    # 2.6f

    .line 197
    .line 198
    .line 199
    const v26, 0x40170a3d    # 2.36f

    .line 200
    .line 201
    .line 202
    const v21, 0x3ee66666    # 0.45f

    .line 203
    .line 204
    .line 205
    const v22, 0x3f8f5c29    # 1.12f

    .line 206
    .line 207
    .line 208
    const v23, 0x3fb33333    # 1.4f

    .line 209
    .line 210
    .line 211
    const v24, 0x4000a3d7    # 2.01f

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v4, 0x3f3ae148    # 0.73f

    .line 218
    .line 219
    .line 220
    const v6, 0x4027ae14    # 2.62f

    .line 221
    .line 222
    .line 223
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v25, 0x41900000    # 18.0f

    .line 227
    .line 228
    const/high16 v26, 0x41400000    # 12.0f

    .line 229
    .line 230
    const v21, 0x418b3333    # 17.4f

    .line 231
    .line 232
    .line 233
    const v22, 0x412547ae    # 10.33f

    .line 234
    .line 235
    .line 236
    const/high16 v23, 0x41900000    # 18.0f

    .line 237
    .line 238
    const v24, 0x4131999a    # 11.1f

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v4, 0x41600000    # 14.0f

    .line 245
    .line 246
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v4, 0x41a80000    # 21.0f

    .line 253
    .line 254
    const/high16 v6, 0x40a00000    # 5.0f

    .line 255
    .line 256
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v25, -0x40800000    # -1.0f

    .line 260
    .line 261
    const/high16 v26, -0x40800000    # -1.0f

    .line 262
    .line 263
    const v21, -0x40f33333    # -0.55f

    .line 264
    .line 265
    .line 266
    const/16 v22, 0x0

    .line 267
    .line 268
    const/high16 v23, -0x40800000    # -1.0f

    .line 269
    .line 270
    const v24, -0x4119999a    # -0.45f

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/high16 v25, 0x3f800000    # 1.0f

    .line 277
    .line 278
    const/16 v21, 0x0

    .line 279
    .line 280
    const v22, -0x40f33333    # -0.55f

    .line 281
    .line 282
    .line 283
    const v23, 0x3ee66666    # 0.45f

    .line 284
    .line 285
    .line 286
    const/high16 v24, -0x40800000    # -1.0f

    .line 287
    .line 288
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v4, 0x3ee66666    # 0.45f

    .line 292
    .line 293
    .line 294
    const/high16 v6, 0x3f800000    # 1.0f

    .line 295
    .line 296
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const/high16 v25, 0x40a00000    # 5.0f

    .line 300
    .line 301
    const/high16 v26, 0x41a80000    # 21.0f

    .line 302
    .line 303
    const/high16 v21, 0x40c00000    # 6.0f

    .line 304
    .line 305
    const v22, 0x41a46666    # 20.55f

    .line 306
    .line 307
    .line 308
    const v23, 0x40b1999a    # 5.55f

    .line 309
    .line 310
    .line 311
    const/high16 v24, 0x41a80000    # 21.0f

    .line 312
    .line 313
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v4, 0x41980000    # 19.0f

    .line 320
    .line 321
    const/high16 v6, 0x41a80000    # 21.0f

    .line 322
    .line 323
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v25, -0x40800000    # -1.0f

    .line 327
    .line 328
    const/high16 v26, -0x40800000    # -1.0f

    .line 329
    .line 330
    const v21, -0x40f33333    # -0.55f

    .line 331
    .line 332
    .line 333
    const/16 v22, 0x0

    .line 334
    .line 335
    const/high16 v23, -0x40800000    # -1.0f

    .line 336
    .line 337
    const v24, -0x4119999a    # -0.45f

    .line 338
    .line 339
    .line 340
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const/high16 v25, 0x3f800000    # 1.0f

    .line 344
    .line 345
    const/16 v21, 0x0

    .line 346
    .line 347
    const v22, -0x40f33333    # -0.55f

    .line 348
    .line 349
    .line 350
    const v23, 0x3ee66666    # 0.45f

    .line 351
    .line 352
    .line 353
    const/high16 v24, -0x40800000    # -1.0f

    .line 354
    .line 355
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v4, 0x3ee66666    # 0.45f

    .line 359
    .line 360
    .line 361
    const/high16 v6, 0x3f800000    # 1.0f

    .line 362
    .line 363
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const/high16 v25, 0x41980000    # 19.0f

    .line 367
    .line 368
    const/high16 v26, 0x41a80000    # 21.0f

    .line 369
    .line 370
    const/high16 v21, 0x41a00000    # 20.0f

    .line 371
    .line 372
    const v22, 0x41a46666    # 20.55f

    .line 373
    .line 374
    .line 375
    const v23, 0x419c6666    # 19.55f

    .line 376
    .line 377
    .line 378
    const/high16 v24, 0x41a80000    # 21.0f

    .line 379
    .line 380
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v4, 0x41400000    # 12.0f

    .line 387
    .line 388
    const/high16 v6, 0x41a80000    # 21.0f

    .line 389
    .line 390
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const/high16 v25, -0x40800000    # -1.0f

    .line 394
    .line 395
    const/high16 v26, -0x40800000    # -1.0f

    .line 396
    .line 397
    const v21, -0x40f33333    # -0.55f

    .line 398
    .line 399
    .line 400
    const/16 v22, 0x0

    .line 401
    .line 402
    const/high16 v23, -0x40800000    # -1.0f

    .line 403
    .line 404
    const v24, -0x4119999a    # -0.45f

    .line 405
    .line 406
    .line 407
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v25, 0x3f800000    # 1.0f

    .line 411
    .line 412
    const/16 v21, 0x0

    .line 413
    .line 414
    const v22, -0x40f33333    # -0.55f

    .line 415
    .line 416
    .line 417
    const v23, 0x3ee66666    # 0.45f

    .line 418
    .line 419
    .line 420
    const/high16 v24, -0x40800000    # -1.0f

    .line 421
    .line 422
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const v4, 0x3ee66666    # 0.45f

    .line 426
    .line 427
    .line 428
    const/high16 v6, 0x3f800000    # 1.0f

    .line 429
    .line 430
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const/high16 v25, 0x41400000    # 12.0f

    .line 434
    .line 435
    const/high16 v26, 0x41a80000    # 21.0f

    .line 436
    .line 437
    const/high16 v21, 0x41500000    # 13.0f

    .line 438
    .line 439
    const v22, 0x41a46666    # 20.55f

    .line 440
    .line 441
    .line 442
    const v23, 0x4148cccd    # 12.55f

    .line 443
    .line 444
    .line 445
    const/high16 v24, 0x41a80000    # 21.0f

    .line 446
    .line 447
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 454
    .line 455
    .line 456
    move-result-object v2

    .line 457
    const/16 v16, 0x3800

    .line 458
    .line 459
    const/16 v17, 0x0

    .line 460
    .line 461
    const v6, 0x3e99999a    # 0.3f

    .line 462
    .line 463
    .line 464
    const v8, 0x3e99999a    # 0.3f

    .line 465
    .line 466
    .line 467
    const/4 v7, 0x0

    .line 468
    const/high16 v9, 0x3f800000    # 1.0f

    .line 469
    .line 470
    const/high16 v12, 0x3f800000    # 1.0f

    .line 471
    .line 472
    const/4 v13, 0x0

    .line 473
    const/4 v14, 0x0

    .line 474
    const/4 v15, 0x0

    .line 475
    const-string v4, ""

    .line 476
    .line 477
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 478
    .line 479
    .line 480
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 481
    .line 482
    .line 483
    move-result v3

    .line 484
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 485
    .line 486
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 487
    .line 488
    .line 489
    move-result-wide v6

    .line 490
    const/4 v0, 0x0

    .line 491
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 492
    .line 493
    .line 494
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 495
    .line 496
    .line 497
    move-result v10

    .line 498
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 499
    .line 500
    .line 501
    move-result v11

    .line 502
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 505
    .line 506
    .line 507
    const/high16 v0, 0x41a00000    # 20.0f

    .line 508
    .line 509
    const/high16 v2, 0x41400000    # 12.0f

    .line 510
    .line 511
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const v17, -0x3fc5c28f    # -2.91f

    .line 515
    .line 516
    .line 517
    const v18, -0x3f8b851f    # -3.82f

    .line 518
    .line 519
    .line 520
    const v14, -0x401ae148    # -1.79f

    .line 521
    .line 522
    .line 523
    const v15, -0x4067ae14    # -1.19f

    .line 524
    .line 525
    .line 526
    const v16, -0x3faa3d71    # -3.34f

    .line 527
    .line 528
    .line 529
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const v0, -0x3fd851ec    # -2.62f

    .line 533
    .line 534
    .line 535
    const v2, -0x40c28f5c    # -0.74f

    .line 536
    .line 537
    .line 538
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const/high16 v17, 0x41500000    # 13.0f

    .line 542
    .line 543
    const/high16 v18, 0x40b00000    # 5.5f

    .line 544
    .line 545
    const v13, 0x4159eb85    # 13.62f

    .line 546
    .line 547
    .line 548
    const v14, 0x40e6147b    # 7.19f

    .line 549
    .line 550
    .line 551
    const/high16 v15, 0x41500000    # 13.0f

    .line 552
    .line 553
    const v16, 0x40cc7ae1    # 6.39f

    .line 554
    .line 555
    .line 556
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const/high16 v0, 0x3f800000    # 1.0f

    .line 560
    .line 561
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const/high16 v0, 0x40800000    # 4.0f

    .line 565
    .line 566
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const/high16 v0, 0x41700000    # 15.0f

    .line 570
    .line 571
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const/high16 v0, 0x41800000    # 16.0f

    .line 575
    .line 576
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const/high16 v0, 0x41400000    # 12.0f

    .line 580
    .line 581
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const/high16 v0, 0x41900000    # 18.0f

    .line 588
    .line 589
    const/high16 v2, 0x41600000    # 14.0f

    .line 590
    .line 591
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const/high16 v0, 0x40c00000    # 6.0f

    .line 595
    .line 596
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const/high16 v0, 0x40400000    # 3.0f

    .line 600
    .line 601
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const/high16 v0, 0x40a00000    # 5.0f

    .line 605
    .line 606
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const/high16 v0, 0x3f800000    # 1.0f

    .line 610
    .line 611
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const/high16 v0, 0x41180000    # 9.5f

    .line 615
    .line 616
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const/high16 v17, 0x41100000    # 9.0f

    .line 620
    .line 621
    const/high16 v18, 0x40900000    # 4.5f

    .line 622
    .line 623
    const v13, 0x4113851f    # 9.22f

    .line 624
    .line 625
    .line 626
    const/high16 v14, 0x40800000    # 4.0f

    .line 627
    .line 628
    const/high16 v15, 0x41100000    # 9.0f

    .line 629
    .line 630
    const v16, 0x40870a3d    # 4.22f

    .line 631
    .line 632
    .line 633
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const/high16 v17, 0x41180000    # 9.5f

    .line 637
    .line 638
    const/high16 v18, 0x40a00000    # 5.0f

    .line 639
    .line 640
    const/high16 v13, 0x41100000    # 9.0f

    .line 641
    .line 642
    const v14, 0x4098f5c3    # 4.78f

    .line 643
    .line 644
    .line 645
    const v15, 0x4113851f    # 9.22f

    .line 646
    .line 647
    .line 648
    const/high16 v16, 0x40a00000    # 5.0f

    .line 649
    .line 650
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const/high16 v0, 0x41300000    # 11.0f

    .line 654
    .line 655
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const v0, 0x3dcccccd    # 0.1f

    .line 659
    .line 660
    .line 661
    const/high16 v2, 0x3f800000    # 1.0f

    .line 662
    .line 663
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 664
    .line 665
    .line 666
    const/high16 v0, 0x41180000    # 9.5f

    .line 667
    .line 668
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const/high16 v17, 0x41100000    # 9.0f

    .line 672
    .line 673
    const/high16 v18, 0x40d00000    # 6.5f

    .line 674
    .line 675
    const v13, 0x4113851f    # 9.22f

    .line 676
    .line 677
    .line 678
    const/high16 v14, 0x40c00000    # 6.0f

    .line 679
    .line 680
    const/high16 v15, 0x41100000    # 9.0f

    .line 681
    .line 682
    const v16, 0x40c70a3d    # 6.22f

    .line 683
    .line 684
    .line 685
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    const/high16 v17, 0x41180000    # 9.5f

    .line 689
    .line 690
    const/high16 v18, 0x40e00000    # 7.0f

    .line 691
    .line 692
    const/high16 v13, 0x41100000    # 9.0f

    .line 693
    .line 694
    const v14, 0x40d8f5c3    # 6.78f

    .line 695
    .line 696
    .line 697
    const v15, 0x4113851f    # 9.22f

    .line 698
    .line 699
    .line 700
    const/high16 v16, 0x40e00000    # 7.0f

    .line 701
    .line 702
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 703
    .line 704
    .line 705
    const v0, 0x3fe7ae14    # 1.81f

    .line 706
    .line 707
    .line 708
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    const v17, 0x40266666    # 2.6f

    .line 712
    .line 713
    .line 714
    const v18, 0x40170a3d    # 2.36f

    .line 715
    .line 716
    .line 717
    const v13, 0x3ee66666    # 0.45f

    .line 718
    .line 719
    .line 720
    const v14, 0x3f8f5c29    # 1.12f

    .line 721
    .line 722
    .line 723
    const v15, 0x3fb33333    # 1.4f

    .line 724
    .line 725
    .line 726
    const v16, 0x4000a3d7    # 2.01f

    .line 727
    .line 728
    .line 729
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    const v0, 0x3f3ae148    # 0.73f

    .line 733
    .line 734
    .line 735
    const v2, 0x4027ae14    # 2.62f

    .line 736
    .line 737
    .line 738
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 739
    .line 740
    .line 741
    const/high16 v17, 0x41900000    # 18.0f

    .line 742
    .line 743
    const/high16 v18, 0x41400000    # 12.0f

    .line 744
    .line 745
    const v13, 0x418b3333    # 17.4f

    .line 746
    .line 747
    .line 748
    const v14, 0x412547ae    # 10.33f

    .line 749
    .line 750
    .line 751
    const/high16 v15, 0x41900000    # 18.0f

    .line 752
    .line 753
    const v16, 0x4131999a    # 11.1f

    .line 754
    .line 755
    .line 756
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 757
    .line 758
    .line 759
    const/high16 v0, 0x41600000    # 14.0f

    .line 760
    .line 761
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 762
    .line 763
    .line 764
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 765
    .line 766
    .line 767
    const/high16 v0, 0x40a00000    # 5.0f

    .line 768
    .line 769
    const/high16 v2, 0x41880000    # 17.0f

    .line 770
    .line 771
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 772
    .line 773
    .line 774
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 775
    .line 776
    const/high16 v18, 0x40400000    # 3.0f

    .line 777
    .line 778
    const v13, -0x402b851f    # -1.66f

    .line 779
    .line 780
    .line 781
    const/4 v14, 0x0

    .line 782
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 783
    .line 784
    const v16, 0x3fab851f    # 1.34f

    .line 785
    .line 786
    .line 787
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 788
    .line 789
    .line 790
    const v0, 0x3fab851f    # 1.34f

    .line 791
    .line 792
    .line 793
    const/high16 v2, 0x40400000    # 3.0f

    .line 794
    .line 795
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 796
    .line 797
    .line 798
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 799
    .line 800
    const v2, -0x40547ae1    # -1.34f

    .line 801
    .line 802
    .line 803
    const/high16 v4, 0x40400000    # 3.0f

    .line 804
    .line 805
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 806
    .line 807
    .line 808
    const v0, 0x40d51eb8    # 6.66f

    .line 809
    .line 810
    .line 811
    const/high16 v2, 0x40a00000    # 5.0f

    .line 812
    .line 813
    const/high16 v4, 0x41880000    # 17.0f

    .line 814
    .line 815
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 816
    .line 817
    .line 818
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 819
    .line 820
    .line 821
    const/high16 v0, 0x41a80000    # 21.0f

    .line 822
    .line 823
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 824
    .line 825
    .line 826
    const/high16 v17, -0x40800000    # -1.0f

    .line 827
    .line 828
    const/high16 v18, -0x40800000    # -1.0f

    .line 829
    .line 830
    const v13, -0x40f33333    # -0.55f

    .line 831
    .line 832
    .line 833
    const/high16 v15, -0x40800000    # -1.0f

    .line 834
    .line 835
    const v16, -0x4119999a    # -0.45f

    .line 836
    .line 837
    .line 838
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 839
    .line 840
    .line 841
    const/high16 v17, 0x3f800000    # 1.0f

    .line 842
    .line 843
    const/4 v13, 0x0

    .line 844
    const v14, -0x40f33333    # -0.55f

    .line 845
    .line 846
    .line 847
    const v15, 0x3ee66666    # 0.45f

    .line 848
    .line 849
    .line 850
    const/high16 v16, -0x40800000    # -1.0f

    .line 851
    .line 852
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 853
    .line 854
    .line 855
    const v0, 0x3ee66666    # 0.45f

    .line 856
    .line 857
    .line 858
    const/high16 v2, 0x3f800000    # 1.0f

    .line 859
    .line 860
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 861
    .line 862
    .line 863
    const/high16 v17, 0x40a00000    # 5.0f

    .line 864
    .line 865
    const/high16 v18, 0x41a80000    # 21.0f

    .line 866
    .line 867
    const/high16 v13, 0x40c00000    # 6.0f

    .line 868
    .line 869
    const v14, 0x41a46666    # 20.55f

    .line 870
    .line 871
    .line 872
    const v15, 0x40b1999a    # 5.55f

    .line 873
    .line 874
    .line 875
    const/high16 v16, 0x41a80000    # 21.0f

    .line 876
    .line 877
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 878
    .line 879
    .line 880
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 881
    .line 882
    .line 883
    const/high16 v0, 0x41980000    # 19.0f

    .line 884
    .line 885
    const/high16 v2, 0x41880000    # 17.0f

    .line 886
    .line 887
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 888
    .line 889
    .line 890
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 891
    .line 892
    const/high16 v18, 0x40400000    # 3.0f

    .line 893
    .line 894
    const v13, -0x402b851f    # -1.66f

    .line 895
    .line 896
    .line 897
    const/4 v14, 0x0

    .line 898
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 899
    .line 900
    const v16, 0x3fab851f    # 1.34f

    .line 901
    .line 902
    .line 903
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 904
    .line 905
    .line 906
    const v0, 0x3fab851f    # 1.34f

    .line 907
    .line 908
    .line 909
    const/high16 v2, 0x40400000    # 3.0f

    .line 910
    .line 911
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 912
    .line 913
    .line 914
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 915
    .line 916
    const v2, -0x40547ae1    # -1.34f

    .line 917
    .line 918
    .line 919
    const/high16 v4, 0x40400000    # 3.0f

    .line 920
    .line 921
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 922
    .line 923
    .line 924
    const v0, 0x41a547ae    # 20.66f

    .line 925
    .line 926
    .line 927
    const/high16 v2, 0x41980000    # 19.0f

    .line 928
    .line 929
    const/high16 v4, 0x41880000    # 17.0f

    .line 930
    .line 931
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 932
    .line 933
    .line 934
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 935
    .line 936
    .line 937
    const/high16 v0, 0x41980000    # 19.0f

    .line 938
    .line 939
    const/high16 v2, 0x41a80000    # 21.0f

    .line 940
    .line 941
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 942
    .line 943
    .line 944
    const/high16 v17, -0x40800000    # -1.0f

    .line 945
    .line 946
    const/high16 v18, -0x40800000    # -1.0f

    .line 947
    .line 948
    const v13, -0x40f33333    # -0.55f

    .line 949
    .line 950
    .line 951
    const/high16 v15, -0x40800000    # -1.0f

    .line 952
    .line 953
    const v16, -0x4119999a    # -0.45f

    .line 954
    .line 955
    .line 956
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 957
    .line 958
    .line 959
    const/high16 v17, 0x3f800000    # 1.0f

    .line 960
    .line 961
    const/4 v13, 0x0

    .line 962
    const v14, -0x40f33333    # -0.55f

    .line 963
    .line 964
    .line 965
    const v15, 0x3ee66666    # 0.45f

    .line 966
    .line 967
    .line 968
    const/high16 v16, -0x40800000    # -1.0f

    .line 969
    .line 970
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 971
    .line 972
    .line 973
    const v0, 0x3ee66666    # 0.45f

    .line 974
    .line 975
    .line 976
    const/high16 v2, 0x3f800000    # 1.0f

    .line 977
    .line 978
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 979
    .line 980
    .line 981
    const/high16 v17, 0x41980000    # 19.0f

    .line 982
    .line 983
    const/high16 v18, 0x41a80000    # 21.0f

    .line 984
    .line 985
    const/high16 v13, 0x41a00000    # 20.0f

    .line 986
    .line 987
    const v14, 0x41a46666    # 20.55f

    .line 988
    .line 989
    .line 990
    const v15, 0x419c6666    # 19.55f

    .line 991
    .line 992
    .line 993
    const/high16 v16, 0x41a80000    # 21.0f

    .line 994
    .line 995
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 996
    .line 997
    .line 998
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 999
    .line 1000
    .line 1001
    const/high16 v0, 0x41400000    # 12.0f

    .line 1002
    .line 1003
    const/high16 v2, 0x41880000    # 17.0f

    .line 1004
    .line 1005
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1006
    .line 1007
    .line 1008
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 1009
    .line 1010
    const/high16 v18, 0x40400000    # 3.0f

    .line 1011
    .line 1012
    const v13, -0x402b851f    # -1.66f

    .line 1013
    .line 1014
    .line 1015
    const/4 v14, 0x0

    .line 1016
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 1017
    .line 1018
    const v16, 0x3fab851f    # 1.34f

    .line 1019
    .line 1020
    .line 1021
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1022
    .line 1023
    .line 1024
    const v0, 0x3fab851f    # 1.34f

    .line 1025
    .line 1026
    .line 1027
    const/high16 v2, 0x40400000    # 3.0f

    .line 1028
    .line 1029
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1030
    .line 1031
    .line 1032
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 1033
    .line 1034
    const v2, -0x40547ae1    # -1.34f

    .line 1035
    .line 1036
    .line 1037
    const/high16 v4, 0x40400000    # 3.0f

    .line 1038
    .line 1039
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1040
    .line 1041
    .line 1042
    const v0, 0x415a8f5c    # 13.66f

    .line 1043
    .line 1044
    .line 1045
    const/high16 v2, 0x41400000    # 12.0f

    .line 1046
    .line 1047
    const/high16 v4, 0x41880000    # 17.0f

    .line 1048
    .line 1049
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1050
    .line 1051
    .line 1052
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1053
    .line 1054
    .line 1055
    const/high16 v0, 0x41400000    # 12.0f

    .line 1056
    .line 1057
    const/high16 v2, 0x41a80000    # 21.0f

    .line 1058
    .line 1059
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1060
    .line 1061
    .line 1062
    const/high16 v17, -0x40800000    # -1.0f

    .line 1063
    .line 1064
    const/high16 v18, -0x40800000    # -1.0f

    .line 1065
    .line 1066
    const v13, -0x40f33333    # -0.55f

    .line 1067
    .line 1068
    .line 1069
    const/high16 v15, -0x40800000    # -1.0f

    .line 1070
    .line 1071
    const v16, -0x4119999a    # -0.45f

    .line 1072
    .line 1073
    .line 1074
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1075
    .line 1076
    .line 1077
    const/high16 v17, 0x3f800000    # 1.0f

    .line 1078
    .line 1079
    const/4 v13, 0x0

    .line 1080
    const v14, -0x40f33333    # -0.55f

    .line 1081
    .line 1082
    .line 1083
    const v15, 0x3ee66666    # 0.45f

    .line 1084
    .line 1085
    .line 1086
    const/high16 v16, -0x40800000    # -1.0f

    .line 1087
    .line 1088
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1089
    .line 1090
    .line 1091
    const v0, 0x3ee66666    # 0.45f

    .line 1092
    .line 1093
    .line 1094
    const/high16 v2, 0x3f800000    # 1.0f

    .line 1095
    .line 1096
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1097
    .line 1098
    .line 1099
    const/high16 v17, 0x41400000    # 12.0f

    .line 1100
    .line 1101
    const/high16 v18, 0x41a80000    # 21.0f

    .line 1102
    .line 1103
    const/high16 v13, 0x41500000    # 13.0f

    .line 1104
    .line 1105
    const v14, 0x41a46666    # 20.55f

    .line 1106
    .line 1107
    .line 1108
    const v15, 0x4148cccd    # 12.55f

    .line 1109
    .line 1110
    .line 1111
    const/high16 v16, 0x41a80000    # 21.0f

    .line 1112
    .line 1113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1114
    .line 1115
    .line 1116
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1117
    .line 1118
    .line 1119
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v2

    .line 1123
    const/16 v16, 0x3800

    .line 1124
    .line 1125
    const/16 v17, 0x0

    .line 1126
    .line 1127
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1128
    .line 1129
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1130
    .line 1131
    const/4 v7, 0x0

    .line 1132
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1133
    .line 1134
    const/4 v13, 0x0

    .line 1135
    const/4 v14, 0x0

    .line 1136
    const/4 v15, 0x0

    .line 1137
    const-string v4, ""

    .line 1138
    .line 1139
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v0

    .line 1143
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v0

    .line 1147
    sput-object v0, Landroidx/compose/material/icons/twotone/RollerSkatingKt;->_rollerSkating:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1148
    .line 1149
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1150
    .line 1151
    .line 1152
    return-object v0
.end method
