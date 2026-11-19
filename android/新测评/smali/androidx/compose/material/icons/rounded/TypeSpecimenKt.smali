.class public final Landroidx/compose/material/icons/rounded/TypeSpecimenKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_typeSpecimen",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "TypeSpecimen",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getTypeSpecimen",
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
        "SMAP\nTypeSpecimen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeSpecimen.kt\nandroidx/compose/material/icons/rounded/TypeSpecimenKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,85:1\n212#2,12:86\n233#2,18:99\n253#2:136\n233#2,18:137\n253#2:174\n233#2,18:175\n253#2:212\n174#3:98\n705#4,2:117\n717#4,2:119\n719#4,11:125\n705#4,2:155\n717#4,2:157\n719#4,11:163\n705#4,2:193\n717#4,2:195\n719#4,11:201\n72#5,4:121\n72#5,4:159\n72#5,4:197\n*S KotlinDebug\n*F\n+ 1 TypeSpecimen.kt\nandroidx/compose/material/icons/rounded/TypeSpecimenKt\n*L\n29#1:86,12\n30#1:99,18\n30#1:136\n45#1:137,18\n45#1:174\n73#1:175,18\n73#1:212\n29#1:98\n30#1:117,2\n30#1:119,2\n30#1:125,11\n45#1:155,2\n45#1:157,2\n45#1:163,11\n73#1:193,2\n73#1:195,2\n73#1:201,11\n30#1:121,4\n45#1:159,4\n73#1:197,4\n*E\n"
    }
.end annotation


# static fields
.field private static _typeSpecimen:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTypeSpecimen(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/TypeSpecimenKt;->_typeSpecimen:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.TypeSpecimen"

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
    const/high16 v4, 0x40c00000    # 6.0f

    .line 71
    .line 72
    const/high16 v6, 0x40400000    # 3.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 78
    .line 79
    .line 80
    const/high16 v25, 0x40000000    # 2.0f

    .line 81
    .line 82
    const/high16 v26, 0x40e00000    # 7.0f

    .line 83
    .line 84
    const v21, 0x401ccccd    # 2.45f

    .line 85
    .line 86
    .line 87
    const/high16 v22, 0x40c00000    # 6.0f

    .line 88
    .line 89
    const/high16 v23, 0x40000000    # 2.0f

    .line 90
    .line 91
    const v24, 0x40ce6666    # 6.45f

    .line 92
    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v4, 0x41500000    # 13.0f

    .line 100
    .line 101
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v26, 0x40000000    # 2.0f

    .line 105
    .line 106
    const/16 v21, 0x0

    .line 107
    .line 108
    const v22, 0x3f8ccccd    # 1.1f

    .line 109
    .line 110
    .line 111
    const v23, 0x3f666666    # 0.9f

    .line 112
    .line 113
    .line 114
    const/high16 v24, 0x40000000    # 2.0f

    .line 115
    .line 116
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v25, 0x3f800000    # 1.0f

    .line 123
    .line 124
    const/high16 v26, -0x40800000    # -1.0f

    .line 125
    .line 126
    const v21, 0x3f0ccccd    # 0.55f

    .line 127
    .line 128
    .line 129
    const/16 v22, 0x0

    .line 130
    .line 131
    const/high16 v23, 0x3f800000    # 1.0f

    .line 132
    .line 133
    const v24, -0x4119999a    # -0.45f

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/4 v4, 0x0

    .line 140
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v25, -0x40800000    # -1.0f

    .line 144
    .line 145
    const/16 v21, 0x0

    .line 146
    .line 147
    const v22, -0x40f33333    # -0.55f

    .line 148
    .line 149
    .line 150
    const v23, -0x4119999a    # -0.45f

    .line 151
    .line 152
    .line 153
    const/high16 v24, -0x40800000    # -1.0f

    .line 154
    .line 155
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v4, 0x40800000    # 4.0f

    .line 159
    .line 160
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/high16 v4, 0x40e00000    # 7.0f

    .line 164
    .line 165
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v25, 0x40400000    # 3.0f

    .line 169
    .line 170
    const/high16 v26, 0x40c00000    # 6.0f

    .line 171
    .line 172
    const/high16 v21, 0x40800000    # 4.0f

    .line 173
    .line 174
    const v22, 0x40ce6666    # 6.45f

    .line 175
    .line 176
    .line 177
    const v23, 0x40633333    # 3.55f

    .line 178
    .line 179
    .line 180
    const/high16 v24, 0x40c00000    # 6.0f

    .line 181
    .line 182
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    const/16 v16, 0x3800

    .line 193
    .line 194
    const/16 v17, 0x0

    .line 195
    .line 196
    const/high16 v6, 0x3f800000    # 1.0f

    .line 197
    .line 198
    const/high16 v8, 0x3f800000    # 1.0f

    .line 199
    .line 200
    const/4 v7, 0x0

    .line 201
    const/high16 v9, 0x3f800000    # 1.0f

    .line 202
    .line 203
    const/high16 v12, 0x3f800000    # 1.0f

    .line 204
    .line 205
    const/4 v13, 0x0

    .line 206
    const/4 v14, 0x0

    .line 207
    const/4 v15, 0x0

    .line 208
    const-string v4, ""

    .line 209
    .line 210
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 211
    .line 212
    .line 213
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 218
    .line 219
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 220
    .line 221
    .line 222
    move-result-wide v6

    .line 223
    const/4 v2, 0x0

    .line 224
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 228
    .line 229
    .line 230
    move-result v10

    .line 231
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 232
    .line 233
    .line 234
    move-result v11

    .line 235
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 238
    .line 239
    .line 240
    const/high16 v4, 0x41a00000    # 20.0f

    .line 241
    .line 242
    const/high16 v6, 0x40000000    # 2.0f

    .line 243
    .line 244
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v4, 0x41000000    # 8.0f

    .line 248
    .line 249
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v25, 0x40c00000    # 6.0f

    .line 253
    .line 254
    const/high16 v26, 0x40800000    # 4.0f

    .line 255
    .line 256
    const v21, 0x40dccccd    # 6.9f

    .line 257
    .line 258
    .line 259
    const/high16 v22, 0x40000000    # 2.0f

    .line 260
    .line 261
    const/high16 v23, 0x40c00000    # 6.0f

    .line 262
    .line 263
    const v24, 0x4039999a    # 2.9f

    .line 264
    .line 265
    .line 266
    move-object/from16 v20, v2

    .line 267
    .line 268
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/high16 v4, 0x41400000    # 12.0f

    .line 272
    .line 273
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/high16 v25, 0x40000000    # 2.0f

    .line 277
    .line 278
    const/high16 v26, 0x40000000    # 2.0f

    .line 279
    .line 280
    const/16 v21, 0x0

    .line 281
    .line 282
    const v22, 0x3f8ccccd    # 1.1f

    .line 283
    .line 284
    .line 285
    const v23, 0x3f666666    # 0.9f

    .line 286
    .line 287
    .line 288
    const/high16 v24, 0x40000000    # 2.0f

    .line 289
    .line 290
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const/high16 v26, -0x40000000    # -2.0f

    .line 297
    .line 298
    const v21, 0x3f8ccccd    # 1.1f

    .line 299
    .line 300
    .line 301
    const/16 v22, 0x0

    .line 302
    .line 303
    const/high16 v23, 0x40000000    # 2.0f

    .line 304
    .line 305
    const v24, -0x4099999a    # -0.9f

    .line 306
    .line 307
    .line 308
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const/high16 v4, 0x40800000    # 4.0f

    .line 312
    .line 313
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const/high16 v25, 0x41a00000    # 20.0f

    .line 317
    .line 318
    const/high16 v26, 0x40000000    # 2.0f

    .line 319
    .line 320
    const/high16 v21, 0x41b00000    # 22.0f

    .line 321
    .line 322
    const v22, 0x4039999a    # 2.9f

    .line 323
    .line 324
    .line 325
    const v23, 0x41a8cccd    # 21.1f

    .line 326
    .line 327
    .line 328
    const/high16 v24, 0x40000000    # 2.0f

    .line 329
    .line 330
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v4, 0x4183ae14    # 16.46f

    .line 337
    .line 338
    .line 339
    const v6, 0x416028f6    # 14.01f

    .line 340
    .line 341
    .line 342
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const v4, -0x40deb852    # -0.63f

    .line 346
    .line 347
    .line 348
    const v6, -0x40170a3d    # -1.82f

    .line 349
    .line 350
    .line 351
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v4, -0x3f97ae14    # -3.63f

    .line 355
    .line 356
    .line 357
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v4, -0x40d9999a    # -0.65f

    .line 361
    .line 362
    .line 363
    const v6, 0x3fe8f5c3    # 1.82f

    .line 364
    .line 365
    .line 366
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v25, -0x40d1eb85    # -0.68f

    .line 370
    .line 371
    .line 372
    const v26, 0x3ef5c28f    # 0.48f

    .line 373
    .line 374
    .line 375
    const v21, -0x42333333    # -0.1f

    .line 376
    .line 377
    .line 378
    const v22, 0x3e947ae1    # 0.29f

    .line 379
    .line 380
    .line 381
    const v23, -0x413d70a4    # -0.38f

    .line 382
    .line 383
    .line 384
    const v24, 0x3ef5c28f    # 0.48f

    .line 385
    .line 386
    .line 387
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/4 v4, 0x0

    .line 391
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const v26, -0x40851eb8    # -0.98f

    .line 395
    .line 396
    .line 397
    const v21, -0x40fd70a4    # -0.51f

    .line 398
    .line 399
    .line 400
    const/16 v22, 0x0

    .line 401
    .line 402
    const v23, -0x40a3d70a    # -0.86f

    .line 403
    .line 404
    .line 405
    const v24, -0x40fd70a4    # -0.51f

    .line 406
    .line 407
    .line 408
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v4, -0x3f175c29    # -7.27f

    .line 412
    .line 413
    .line 414
    const v6, 0x402eb852    # 2.73f

    .line 415
    .line 416
    .line 417
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v25, 0x41600000    # 14.0f

    .line 421
    .line 422
    const/high16 v26, 0x40b00000    # 5.5f

    .line 423
    .line 424
    const v21, 0x415147ae    # 13.08f

    .line 425
    .line 426
    .line 427
    const v22, 0x40b9999a    # 5.8f

    .line 428
    .line 429
    .line 430
    const v23, 0x415851ec    # 13.52f

    .line 431
    .line 432
    .line 433
    const/high16 v24, 0x40b00000    # 5.5f

    .line 434
    .line 435
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const/4 v4, 0x0

    .line 439
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v25, 0x3f8b851f    # 1.09f

    .line 443
    .line 444
    .line 445
    const/high16 v26, 0x3f400000    # 0.75f

    .line 446
    .line 447
    const v21, 0x3ef5c28f    # 0.48f

    .line 448
    .line 449
    .line 450
    const/16 v22, 0x0

    .line 451
    .line 452
    const v23, 0x3f6b851f    # 0.92f

    .line 453
    .line 454
    .line 455
    const v24, 0x3e99999a    # 0.3f

    .line 456
    .line 457
    .line 458
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const v4, 0x40e8a3d7    # 7.27f

    .line 462
    .line 463
    .line 464
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const v25, -0x40d1eb85    # -0.68f

    .line 468
    .line 469
    .line 470
    const v26, 0x3f7ae148    # 0.98f

    .line 471
    .line 472
    .line 473
    const v21, 0x3e3851ec    # 0.18f

    .line 474
    .line 475
    .line 476
    const v22, 0x3ef0a3d7    # 0.47f

    .line 477
    .line 478
    .line 479
    const v23, -0x41d1eb85    # -0.17f

    .line 480
    .line 481
    .line 482
    const v24, 0x3f7ae148    # 0.98f

    .line 483
    .line 484
    .line 485
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const/4 v4, 0x0

    .line 489
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const v25, 0x4183ae14    # 16.46f

    .line 493
    .line 494
    .line 495
    const v26, 0x416028f6    # 14.01f

    .line 496
    .line 497
    .line 498
    const v21, 0x4186a3d7    # 16.83f

    .line 499
    .line 500
    .line 501
    const/high16 v22, 0x41680000    # 14.5f

    .line 502
    .line 503
    const v23, 0x41847ae1    # 16.56f

    .line 504
    .line 505
    .line 506
    const v24, 0x4164f5c3    # 14.31f

    .line 507
    .line 508
    .line 509
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 516
    .line 517
    .line 518
    move-result-object v2

    .line 519
    const/high16 v6, 0x3f800000    # 1.0f

    .line 520
    .line 521
    const/4 v7, 0x0

    .line 522
    const-string v4, ""

    .line 523
    .line 524
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 525
    .line 526
    .line 527
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 528
    .line 529
    .line 530
    move-result v3

    .line 531
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 532
    .line 533
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 534
    .line 535
    .line 536
    move-result-wide v6

    .line 537
    const/4 v0, 0x0

    .line 538
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 539
    .line 540
    .line 541
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 542
    .line 543
    .line 544
    move-result v10

    .line 545
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 546
    .line 547
    .line 548
    move-result v11

    .line 549
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 552
    .line 553
    .line 554
    const v2, 0x415f5c29    # 13.96f

    .line 555
    .line 556
    .line 557
    const v4, 0x40e570a4    # 7.17f

    .line 558
    .line 559
    .line 560
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const v2, -0x405851ec    # -1.31f

    .line 564
    .line 565
    .line 566
    const v4, 0x406e147b    # 3.72f

    .line 567
    .line 568
    .line 569
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const v2, 0x402c28f6    # 2.69f

    .line 573
    .line 574
    .line 575
    const/4 v4, 0x0

    .line 576
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const v2, -0x4059999a    # -1.3f

    .line 580
    .line 581
    .line 582
    const v4, -0x3f91eb85    # -3.72f

    .line 583
    .line 584
    .line 585
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 592
    .line 593
    .line 594
    move-result-object v2

    .line 595
    const/high16 v6, 0x3f800000    # 1.0f

    .line 596
    .line 597
    const/4 v7, 0x0

    .line 598
    const-string v4, ""

    .line 599
    .line 600
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 601
    .line 602
    .line 603
    move-result-object v0

    .line 604
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 605
    .line 606
    .line 607
    move-result-object v0

    .line 608
    sput-object v0, Landroidx/compose/material/icons/rounded/TypeSpecimenKt;->_typeSpecimen:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 609
    .line 610
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 611
    .line 612
    .line 613
    return-object v0
.end method
