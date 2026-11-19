.class public final Landroidx/compose/material/icons/twotone/SoapKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_soap",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Soap",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getSoap",
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
        "SMAP\nSoap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Soap.kt\nandroidx/compose/material/icons/twotone/SoapKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,128:1\n212#2,12:129\n233#2,18:142\n253#2:179\n233#2,18:180\n253#2:217\n174#3:141\n705#4,2:160\n717#4,2:162\n719#4,11:168\n705#4,2:198\n717#4,2:200\n719#4,11:206\n72#5,4:164\n72#5,4:202\n*S KotlinDebug\n*F\n+ 1 Soap.kt\nandroidx/compose/material/icons/twotone/SoapKt\n*L\n29#1:129,12\n30#1:142,18\n30#1:179\n52#1:180,18\n52#1:217\n29#1:141\n30#1:160,2\n30#1:162,2\n30#1:168,11\n52#1:198,2\n52#1:200,2\n52#1:206,11\n30#1:164,4\n52#1:202,4\n*E\n"
    }
.end annotation


# static fields
.field private static _soap:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSoap(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/SoapKt;->_soap:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Soap"

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
    const/high16 v6, 0x41640000    # 14.25f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x41700000    # 15.0f

    .line 78
    .line 79
    const/high16 v26, 0x40d80000    # 6.75f

    .line 80
    .line 81
    const v21, 0x416a8f5c    # 14.66f

    .line 82
    .line 83
    .line 84
    const/high16 v22, 0x40c00000    # 6.0f

    .line 85
    .line 86
    const/high16 v23, 0x41700000    # 15.0f

    .line 87
    .line 88
    const v24, 0x40cae148    # 6.34f

    .line 89
    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v4, 0x416a8f5c    # 14.66f

    .line 97
    .line 98
    .line 99
    const/high16 v6, 0x40f00000    # 7.5f

    .line 100
    .line 101
    const/high16 v7, 0x41640000    # 14.25f

    .line 102
    .line 103
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v4, 0x40e51eb8    # 7.16f

    .line 107
    .line 108
    .line 109
    const/high16 v6, 0x40d80000    # 6.75f

    .line 110
    .line 111
    const/high16 v7, 0x41580000    # 13.5f

    .line 112
    .line 113
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v4, 0x415d70a4    # 13.84f

    .line 117
    .line 118
    .line 119
    const/high16 v6, 0x40c00000    # 6.0f

    .line 120
    .line 121
    const/high16 v7, 0x41640000    # 14.25f

    .line 122
    .line 123
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v4, 0x40b00000    # 5.5f

    .line 127
    .line 128
    const/high16 v6, 0x41a00000    # 20.0f

    .line 129
    .line 130
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v25, 0x3f000000    # 0.5f

    .line 134
    .line 135
    const/high16 v26, 0x3f000000    # 0.5f

    .line 136
    .line 137
    const v21, 0x3e8f5c29    # 0.28f

    .line 138
    .line 139
    .line 140
    const/16 v22, 0x0

    .line 141
    .line 142
    const/high16 v23, 0x3f000000    # 0.5f

    .line 143
    .line 144
    const v24, 0x3e6147ae    # 0.22f

    .line 145
    .line 146
    .line 147
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v4, 0x41a23d71    # 20.28f

    .line 151
    .line 152
    .line 153
    const/high16 v6, 0x40d00000    # 6.5f

    .line 154
    .line 155
    const/high16 v7, 0x41a00000    # 20.0f

    .line 156
    .line 157
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v4, 0x40c8f5c3    # 6.28f

    .line 161
    .line 162
    .line 163
    const/high16 v6, 0x419c0000    # 19.5f

    .line 164
    .line 165
    const/high16 v7, 0x40c00000    # 6.0f

    .line 166
    .line 167
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v4, 0x419dc28f    # 19.72f

    .line 171
    .line 172
    .line 173
    const/high16 v6, 0x40b00000    # 5.5f

    .line 174
    .line 175
    const/high16 v7, 0x41a00000    # 20.0f

    .line 176
    .line 177
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const/high16 v4, 0x41200000    # 10.0f

    .line 181
    .line 182
    const/high16 v6, 0x41a80000    # 21.0f

    .line 183
    .line 184
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v4, 0x40800000    # 4.0f

    .line 188
    .line 189
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const/high16 v25, -0x40800000    # -1.0f

    .line 193
    .line 194
    const/high16 v26, -0x40800000    # -1.0f

    .line 195
    .line 196
    const v21, -0x40f33333    # -0.55f

    .line 197
    .line 198
    .line 199
    const/high16 v23, -0x40800000    # -1.0f

    .line 200
    .line 201
    const v24, -0x4119999a    # -0.45f

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v4, -0x3f400000    # -6.0f

    .line 208
    .line 209
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v25, 0x3eb851ec    # 0.36f

    .line 213
    .line 214
    .line 215
    const/high16 v26, -0x40c00000    # -0.75f

    .line 216
    .line 217
    const/16 v21, 0x0

    .line 218
    .line 219
    const v22, -0x413851ec    # -0.39f

    .line 220
    .line 221
    .line 222
    const v23, 0x3e6b851f    # 0.23f

    .line 223
    .line 224
    .line 225
    const v24, -0x40dc28f6    # -0.64f

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const/high16 v4, 0x40e00000    # 7.0f

    .line 232
    .line 233
    const v6, 0x411deb85    # 9.87f

    .line 234
    .line 235
    .line 236
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/high16 v4, 0x41400000    # 12.0f

    .line 240
    .line 241
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v4, 0x40400000    # 3.0f

    .line 245
    .line 246
    const/4 v6, 0x0

    .line 247
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v4, 0x41a80000    # 21.0f

    .line 251
    .line 252
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    const/16 v16, 0x3800

    .line 263
    .line 264
    const/16 v17, 0x0

    .line 265
    .line 266
    const v6, 0x3e99999a    # 0.3f

    .line 267
    .line 268
    .line 269
    const v8, 0x3e99999a    # 0.3f

    .line 270
    .line 271
    .line 272
    const/4 v7, 0x0

    .line 273
    const/high16 v9, 0x3f800000    # 1.0f

    .line 274
    .line 275
    const/high16 v12, 0x3f800000    # 1.0f

    .line 276
    .line 277
    const/4 v13, 0x0

    .line 278
    const/4 v14, 0x0

    .line 279
    const/4 v15, 0x0

    .line 280
    const-string v4, ""

    .line 281
    .line 282
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 283
    .line 284
    .line 285
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 286
    .line 287
    .line 288
    move-result v3

    .line 289
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 290
    .line 291
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 292
    .line 293
    .line 294
    move-result-wide v6

    .line 295
    const/4 v0, 0x0

    .line 296
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 300
    .line 301
    .line 302
    move-result v10

    .line 303
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 304
    .line 305
    .line 306
    move-result v11

    .line 307
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 310
    .line 311
    .line 312
    const/high16 v0, 0x40c00000    # 6.0f

    .line 313
    .line 314
    const/high16 v2, 0x41640000    # 14.25f

    .line 315
    .line 316
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v17, 0x41700000    # 15.0f

    .line 320
    .line 321
    const/high16 v18, 0x40d80000    # 6.75f

    .line 322
    .line 323
    const v13, 0x416a8f5c    # 14.66f

    .line 324
    .line 325
    .line 326
    const/high16 v14, 0x40c00000    # 6.0f

    .line 327
    .line 328
    const/high16 v15, 0x41700000    # 15.0f

    .line 329
    .line 330
    const v16, 0x40cae148    # 6.34f

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v0, 0x416a8f5c    # 14.66f

    .line 337
    .line 338
    .line 339
    const/high16 v2, 0x40f00000    # 7.5f

    .line 340
    .line 341
    const/high16 v4, 0x41640000    # 14.25f

    .line 342
    .line 343
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v0, 0x40e51eb8    # 7.16f

    .line 347
    .line 348
    .line 349
    const/high16 v2, 0x40d80000    # 6.75f

    .line 350
    .line 351
    const/high16 v4, 0x41580000    # 13.5f

    .line 352
    .line 353
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v0, 0x415d70a4    # 13.84f

    .line 357
    .line 358
    .line 359
    const/high16 v2, 0x40c00000    # 6.0f

    .line 360
    .line 361
    const/high16 v4, 0x41640000    # 14.25f

    .line 362
    .line 363
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const/high16 v0, 0x40900000    # 4.5f

    .line 367
    .line 368
    const/high16 v2, 0x41640000    # 14.25f

    .line 369
    .line 370
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const/high16 v17, 0x41400000    # 12.0f

    .line 374
    .line 375
    const v13, 0x415028f6    # 13.01f

    .line 376
    .line 377
    .line 378
    const/high16 v14, 0x40900000    # 4.5f

    .line 379
    .line 380
    const/high16 v15, 0x41400000    # 12.0f

    .line 381
    .line 382
    const v16, 0x40b051ec    # 5.51f

    .line 383
    .line 384
    .line 385
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const/high16 v0, 0x41100000    # 9.0f

    .line 389
    .line 390
    const/high16 v2, 0x41100000    # 9.0f

    .line 391
    .line 392
    const v6, 0x415028f6    # 13.01f

    .line 393
    .line 394
    .line 395
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const/high16 v0, 0x40100000    # 2.25f

    .line 399
    .line 400
    const/high16 v2, -0x3ff00000    # -2.25f

    .line 401
    .line 402
    const/high16 v4, 0x40100000    # 2.25f

    .line 403
    .line 404
    const v6, -0x407eb852    # -1.01f

    .line 405
    .line 406
    .line 407
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v0, 0x4177d70a    # 15.49f

    .line 411
    .line 412
    .line 413
    const/high16 v2, 0x40900000    # 4.5f

    .line 414
    .line 415
    const/high16 v4, 0x41640000    # 14.25f

    .line 416
    .line 417
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v0, 0x40900000    # 4.5f

    .line 421
    .line 422
    const/high16 v2, 0x41640000    # 14.25f

    .line 423
    .line 424
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v0, 0x40b00000    # 5.5f

    .line 431
    .line 432
    const/high16 v2, 0x41a00000    # 20.0f

    .line 433
    .line 434
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/high16 v17, 0x3f000000    # 0.5f

    .line 438
    .line 439
    const/high16 v18, 0x3f000000    # 0.5f

    .line 440
    .line 441
    const v13, 0x3e8f5c29    # 0.28f

    .line 442
    .line 443
    .line 444
    const/4 v14, 0x0

    .line 445
    const/high16 v15, 0x3f000000    # 0.5f

    .line 446
    .line 447
    const v16, 0x3e6147ae    # 0.22f

    .line 448
    .line 449
    .line 450
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v0, 0x41a23d71    # 20.28f

    .line 454
    .line 455
    .line 456
    const/high16 v2, 0x40d00000    # 6.5f

    .line 457
    .line 458
    const/high16 v4, 0x41a00000    # 20.0f

    .line 459
    .line 460
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const v0, 0x40c8f5c3    # 6.28f

    .line 464
    .line 465
    .line 466
    const/high16 v2, 0x419c0000    # 19.5f

    .line 467
    .line 468
    const/high16 v4, 0x40c00000    # 6.0f

    .line 469
    .line 470
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const v0, 0x419dc28f    # 19.72f

    .line 474
    .line 475
    .line 476
    const/high16 v2, 0x40b00000    # 5.5f

    .line 477
    .line 478
    const/high16 v4, 0x41a00000    # 20.0f

    .line 479
    .line 480
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v0, 0x40800000    # 4.0f

    .line 484
    .line 485
    const/high16 v2, 0x41a00000    # 20.0f

    .line 486
    .line 487
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v17, -0x40000000    # -2.0f

    .line 491
    .line 492
    const/high16 v18, 0x40000000    # 2.0f

    .line 493
    .line 494
    const v13, -0x40733333    # -1.1f

    .line 495
    .line 496
    .line 497
    const/high16 v15, -0x40000000    # -2.0f

    .line 498
    .line 499
    const v16, 0x3f666666    # 0.9f

    .line 500
    .line 501
    .line 502
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const v0, 0x3f666666    # 0.9f

    .line 506
    .line 507
    .line 508
    const/high16 v2, 0x40000000    # 2.0f

    .line 509
    .line 510
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v0, -0x4099999a    # -0.9f

    .line 514
    .line 515
    .line 516
    const/high16 v2, -0x40000000    # -2.0f

    .line 517
    .line 518
    const/high16 v4, 0x40000000    # 2.0f

    .line 519
    .line 520
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const v0, 0x41a8cccd    # 21.1f

    .line 524
    .line 525
    .line 526
    const/high16 v2, 0x40800000    # 4.0f

    .line 527
    .line 528
    const/high16 v4, 0x41a00000    # 20.0f

    .line 529
    .line 530
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const/high16 v0, 0x40800000    # 4.0f

    .line 534
    .line 535
    const/high16 v2, 0x41a00000    # 20.0f

    .line 536
    .line 537
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const/high16 v0, 0x3f800000    # 1.0f

    .line 544
    .line 545
    const/high16 v2, 0x41840000    # 16.5f

    .line 546
    .line 547
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const/high16 v17, 0x41700000    # 15.0f

    .line 551
    .line 552
    const/high16 v18, 0x40200000    # 2.5f

    .line 553
    .line 554
    const v13, 0x417ab852    # 15.67f

    .line 555
    .line 556
    .line 557
    const/high16 v14, 0x3f800000    # 1.0f

    .line 558
    .line 559
    const/high16 v15, 0x41700000    # 15.0f

    .line 560
    .line 561
    const v16, 0x3fd5c28f    # 1.67f

    .line 562
    .line 563
    .line 564
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const v0, 0x417ab852    # 15.67f

    .line 568
    .line 569
    .line 570
    const/high16 v4, 0x40800000    # 4.0f

    .line 571
    .line 572
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const/high16 v17, 0x41900000    # 18.0f

    .line 576
    .line 577
    const v13, 0x418aa3d7    # 17.33f

    .line 578
    .line 579
    .line 580
    const/high16 v14, 0x40800000    # 4.0f

    .line 581
    .line 582
    const/high16 v15, 0x41900000    # 18.0f

    .line 583
    .line 584
    const v16, 0x40551eb8    # 3.33f

    .line 585
    .line 586
    .line 587
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const v0, 0x418aa3d7    # 17.33f

    .line 591
    .line 592
    .line 593
    const/high16 v2, 0x3f800000    # 1.0f

    .line 594
    .line 595
    const/high16 v4, 0x41840000    # 16.5f

    .line 596
    .line 597
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const/high16 v0, 0x41a60000    # 20.75f

    .line 604
    .line 605
    const/high16 v2, 0x41800000    # 16.0f

    .line 606
    .line 607
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const/high16 v17, 0x3fa00000    # 1.25f

    .line 611
    .line 612
    const/high16 v18, -0x40600000    # -1.25f

    .line 613
    .line 614
    const v13, 0x3f30a3d7    # 0.69f

    .line 615
    .line 616
    .line 617
    const/4 v14, 0x0

    .line 618
    const/high16 v15, 0x3fa00000    # 1.25f

    .line 619
    .line 620
    const v16, -0x40f0a3d7    # -0.56f

    .line 621
    .line 622
    .line 623
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const v0, -0x40f0a3d7    # -0.56f

    .line 627
    .line 628
    .line 629
    const/high16 v2, -0x40600000    # -1.25f

    .line 630
    .line 631
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const/high16 v0, 0x41400000    # 12.0f

    .line 635
    .line 636
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const/high16 v0, -0x40800000    # -1.0f

    .line 640
    .line 641
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const/high16 v0, 0x40d80000    # 6.75f

    .line 645
    .line 646
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    const v17, -0x4068f5c3    # -1.18f

    .line 653
    .line 654
    .line 655
    const v18, -0x406147ae    # -1.24f

    .line 656
    .line 657
    .line 658
    const/4 v13, 0x0

    .line 659
    const v14, -0x40d47ae1    # -0.67f

    .line 660
    .line 661
    .line 662
    const v15, -0x40f851ec    # -0.53f

    .line 663
    .line 664
    .line 665
    const v16, -0x40666666    # -1.2f

    .line 666
    .line 667
    .line 668
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const v0, 0x410deb85    # 8.87f

    .line 672
    .line 673
    .line 674
    const/high16 v2, 0x41200000    # 10.0f

    .line 675
    .line 676
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 677
    .line 678
    .line 679
    const v0, 0x3fbd70a4    # 1.48f

    .line 680
    .line 681
    .line 682
    const v2, -0x3fd9999a    # -2.6f

    .line 683
    .line 684
    .line 685
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    const v17, 0x3e0f5c29    # 0.14f

    .line 689
    .line 690
    .line 691
    const v18, -0x40f5c28f    # -0.54f

    .line 692
    .line 693
    .line 694
    const v13, 0x3db851ec    # 0.09f

    .line 695
    .line 696
    .line 697
    const v14, -0x41d1eb85    # -0.17f

    .line 698
    .line 699
    .line 700
    const v15, 0x3e0f5c29    # 0.14f

    .line 701
    .line 702
    .line 703
    const v16, -0x4151eb85    # -0.34f

    .line 704
    .line 705
    .line 706
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    const v17, -0x417ae148    # -0.26f

    .line 710
    .line 711
    .line 712
    const v18, -0x40cccccd    # -0.7f

    .line 713
    .line 714
    .line 715
    const/4 v13, 0x0

    .line 716
    const v14, -0x417ae148    # -0.26f

    .line 717
    .line 718
    .line 719
    const v15, -0x4247ae14    # -0.09f

    .line 720
    .line 721
    .line 722
    const/high16 v16, -0x41000000    # -0.5f

    .line 723
    .line 724
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    const v0, 0x4111eb85    # 9.12f

    .line 728
    .line 729
    .line 730
    const/high16 v2, 0x40a00000    # 5.0f

    .line 731
    .line 732
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 733
    .line 734
    .line 735
    const v0, -0x3f1a3d71    # -7.18f

    .line 736
    .line 737
    .line 738
    const v2, 0x40d9999a    # 6.8f

    .line 739
    .line 740
    .line 741
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 742
    .line 743
    .line 744
    const/high16 v17, 0x3f800000    # 1.0f

    .line 745
    .line 746
    const v18, 0x415f851f    # 13.97f

    .line 747
    .line 748
    .line 749
    const v13, 0x3fab851f    # 1.34f

    .line 750
    .line 751
    .line 752
    const v14, 0x4145c28f    # 12.36f

    .line 753
    .line 754
    .line 755
    const/high16 v15, 0x3f800000    # 1.0f

    .line 756
    .line 757
    const v16, 0x41526666    # 13.15f

    .line 758
    .line 759
    .line 760
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 761
    .line 762
    .line 763
    const/high16 v0, 0x41a00000    # 20.0f

    .line 764
    .line 765
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 766
    .line 767
    .line 768
    const/high16 v17, 0x40400000    # 3.0f

    .line 769
    .line 770
    const/high16 v18, 0x40400000    # 3.0f

    .line 771
    .line 772
    const/4 v13, 0x0

    .line 773
    const v14, 0x3fd47ae1    # 1.66f

    .line 774
    .line 775
    .line 776
    const v15, 0x3fab851f    # 1.34f

    .line 777
    .line 778
    .line 779
    const/high16 v16, 0x40400000    # 3.0f

    .line 780
    .line 781
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 782
    .line 783
    .line 784
    const/high16 v0, 0x415c0000    # 13.75f

    .line 785
    .line 786
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 787
    .line 788
    .line 789
    const/high16 v17, 0x3fa00000    # 1.25f

    .line 790
    .line 791
    const/high16 v18, -0x40600000    # -1.25f

    .line 792
    .line 793
    const v13, 0x3f30a3d7    # 0.69f

    .line 794
    .line 795
    .line 796
    const/4 v14, 0x0

    .line 797
    const/high16 v15, 0x3fa00000    # 1.25f

    .line 798
    .line 799
    const v16, -0x40f0a3d7    # -0.56f

    .line 800
    .line 801
    .line 802
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 803
    .line 804
    .line 805
    const v0, -0x40f0a3d7    # -0.56f

    .line 806
    .line 807
    .line 808
    const/high16 v2, -0x40600000    # -1.25f

    .line 809
    .line 810
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 811
    .line 812
    .line 813
    const/high16 v0, 0x41400000    # 12.0f

    .line 814
    .line 815
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 816
    .line 817
    .line 818
    const/high16 v0, -0x40800000    # -1.0f

    .line 819
    .line 820
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 821
    .line 822
    .line 823
    const/high16 v0, 0x40f80000    # 7.75f

    .line 824
    .line 825
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 826
    .line 827
    .line 828
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 829
    .line 830
    .line 831
    const/high16 v0, 0x419e0000    # 19.75f

    .line 832
    .line 833
    const/high16 v2, 0x41880000    # 17.0f

    .line 834
    .line 835
    const v4, 0x41a3851f    # 20.44f

    .line 836
    .line 837
    .line 838
    const/high16 v6, 0x41880000    # 17.0f

    .line 839
    .line 840
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 841
    .line 842
    .line 843
    const/high16 v0, 0x41400000    # 12.0f

    .line 844
    .line 845
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 846
    .line 847
    .line 848
    const/high16 v0, -0x40800000    # -1.0f

    .line 849
    .line 850
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 851
    .line 852
    .line 853
    const/high16 v0, 0x41a60000    # 20.75f

    .line 854
    .line 855
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 856
    .line 857
    .line 858
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 859
    .line 860
    .line 861
    const/high16 v0, 0x41200000    # 10.0f

    .line 862
    .line 863
    const/high16 v2, 0x41a80000    # 21.0f

    .line 864
    .line 865
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 866
    .line 867
    .line 868
    const/high16 v0, 0x40800000    # 4.0f

    .line 869
    .line 870
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 871
    .line 872
    .line 873
    const/high16 v17, -0x40800000    # -1.0f

    .line 874
    .line 875
    const/high16 v18, -0x40800000    # -1.0f

    .line 876
    .line 877
    const v13, -0x40f33333    # -0.55f

    .line 878
    .line 879
    .line 880
    const/high16 v15, -0x40800000    # -1.0f

    .line 881
    .line 882
    const v16, -0x4119999a    # -0.45f

    .line 883
    .line 884
    .line 885
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 886
    .line 887
    .line 888
    const/high16 v0, -0x3f400000    # -6.0f

    .line 889
    .line 890
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 891
    .line 892
    .line 893
    const v17, 0x3eb851ec    # 0.36f

    .line 894
    .line 895
    .line 896
    const/high16 v18, -0x40c00000    # -0.75f

    .line 897
    .line 898
    const/4 v13, 0x0

    .line 899
    const v14, -0x413851ec    # -0.39f

    .line 900
    .line 901
    .line 902
    const v15, 0x3e6b851f    # 0.23f

    .line 903
    .line 904
    .line 905
    const v16, -0x40dc28f6    # -0.64f

    .line 906
    .line 907
    .line 908
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 909
    .line 910
    .line 911
    const/high16 v0, 0x40e00000    # 7.0f

    .line 912
    .line 913
    const v2, 0x411deb85    # 9.87f

    .line 914
    .line 915
    .line 916
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 917
    .line 918
    .line 919
    const/high16 v0, 0x41400000    # 12.0f

    .line 920
    .line 921
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 922
    .line 923
    .line 924
    const/high16 v0, 0x40400000    # 3.0f

    .line 925
    .line 926
    const/4 v2, 0x0

    .line 927
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 928
    .line 929
    .line 930
    const/high16 v0, 0x41a80000    # 21.0f

    .line 931
    .line 932
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 933
    .line 934
    .line 935
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 936
    .line 937
    .line 938
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 939
    .line 940
    .line 941
    move-result-object v2

    .line 942
    const/16 v16, 0x3800

    .line 943
    .line 944
    const/16 v17, 0x0

    .line 945
    .line 946
    const/high16 v6, 0x3f800000    # 1.0f

    .line 947
    .line 948
    const/high16 v8, 0x3f800000    # 1.0f

    .line 949
    .line 950
    const/4 v7, 0x0

    .line 951
    const/high16 v12, 0x3f800000    # 1.0f

    .line 952
    .line 953
    const/4 v14, 0x0

    .line 954
    const/4 v15, 0x0

    .line 955
    const-string v4, ""

    .line 956
    .line 957
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 958
    .line 959
    .line 960
    move-result-object v0

    .line 961
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 962
    .line 963
    .line 964
    move-result-object v0

    .line 965
    sput-object v0, Landroidx/compose/material/icons/twotone/SoapKt;->_soap:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 966
    .line 967
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 968
    .line 969
    .line 970
    return-object v0
.end method
