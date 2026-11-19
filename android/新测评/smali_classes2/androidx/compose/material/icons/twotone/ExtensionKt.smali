.class public final Landroidx/compose/material/icons/twotone/ExtensionKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_extension",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Extension",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getExtension",
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
        "SMAP\nExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extension.kt\nandroidx/compose/material/icons/twotone/ExtensionKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,109:1\n212#2,12:110\n233#2,18:123\n253#2:160\n233#2,18:161\n253#2:198\n174#3:122\n705#4,2:141\n717#4,2:143\n719#4,11:149\n705#4,2:179\n717#4,2:181\n719#4,11:187\n72#5,4:145\n72#5,4:183\n*S KotlinDebug\n*F\n+ 1 Extension.kt\nandroidx/compose/material/icons/twotone/ExtensionKt\n*L\n29#1:110,12\n30#1:123,18\n30#1:160\n54#1:161,18\n54#1:198\n29#1:122\n30#1:141,2\n30#1:143,2\n30#1:149,11\n54#1:179,2\n54#1:181,2\n54#1:187,11\n30#1:145,4\n54#1:183,4\n*E\n"
    }
.end annotation


# static fields
.field private static _extension:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getExtension(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/ExtensionKt;->_extension:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Extension"

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
    const/high16 v6, 0x41980000    # 19.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, -0x40000000    # -2.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x40e00000    # 7.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v4, -0x3f400000    # -6.0f

    .line 88
    .line 89
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/high16 v4, 0x40a00000    # 5.0f

    .line 93
    .line 94
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v25, -0x41000000    # -0.5f

    .line 98
    .line 99
    const/high16 v26, -0x41000000    # -0.5f

    .line 100
    .line 101
    const/16 v21, 0x0

    .line 102
    .line 103
    const v22, -0x4170a3d7    # -0.28f

    .line 104
    .line 105
    .line 106
    const v23, -0x419eb852    # -0.22f

    .line 107
    .line 108
    .line 109
    const/high16 v24, -0x41000000    # -0.5f

    .line 110
    .line 111
    move-object/from16 v20, v2

    .line 112
    .line 113
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v4, 0x3e6147ae    # 0.22f

    .line 117
    .line 118
    .line 119
    const/high16 v6, 0x3f000000    # 0.5f

    .line 120
    .line 121
    const/high16 v7, -0x41000000    # -0.5f

    .line 122
    .line 123
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v4, 0x40000000    # 2.0f

    .line 127
    .line 128
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v4, 0x40800000    # 4.0f

    .line 132
    .line 133
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v4, 0x3c23d70a    # 0.01f

    .line 137
    .line 138
    .line 139
    const v6, 0x4007ae14    # 2.12f

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const/high16 v25, 0x40e00000    # 7.0f

    .line 146
    .line 147
    const/high16 v26, 0x41580000    # 13.5f

    .line 148
    .line 149
    const v21, 0x40b851ec    # 5.76f

    .line 150
    .line 151
    .line 152
    const v22, 0x411ccccd    # 9.8f

    .line 153
    .line 154
    .line 155
    const/high16 v23, 0x40e00000    # 7.0f

    .line 156
    .line 157
    const v24, 0x413828f6    # 11.51f

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 164
    .line 165
    const v26, 0x408c28f6    # 4.38f

    .line 166
    .line 167
    .line 168
    const/16 v21, 0x0

    .line 169
    .line 170
    const v22, 0x3ffeb852    # 1.99f

    .line 171
    .line 172
    .line 173
    const/high16 v23, -0x40600000    # -1.25f

    .line 174
    .line 175
    const v24, 0x406ccccd    # 3.7f

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v4, 0x41a00000    # 20.0f

    .line 182
    .line 183
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v4, 0x4007ae14    # 2.12f

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v25, 0x408c28f6    # 4.38f

    .line 193
    .line 194
    .line 195
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 196
    .line 197
    const v21, 0x3f2e147b    # 0.68f

    .line 198
    .line 199
    .line 200
    const/high16 v22, -0x40200000    # -1.75f

    .line 201
    .line 202
    const v23, 0x4018f5c3    # 2.39f

    .line 203
    .line 204
    .line 205
    const/high16 v24, -0x3fc00000    # -3.0f

    .line 206
    .line 207
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v26, 0x40400000    # 3.0f

    .line 211
    .line 212
    const v21, 0x3ffeb852    # 1.99f

    .line 213
    .line 214
    .line 215
    const/16 v22, 0x0

    .line 216
    .line 217
    const v23, 0x406ccccd    # 3.7f

    .line 218
    .line 219
    .line 220
    const/high16 v24, 0x3fa00000    # 1.25f

    .line 221
    .line 222
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v4, 0x41880000    # 17.0f

    .line 226
    .line 227
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v4, -0x3f400000    # -6.0f

    .line 231
    .line 232
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v4, 0x40000000    # 2.0f

    .line 236
    .line 237
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const/high16 v25, 0x3f000000    # 0.5f

    .line 241
    .line 242
    const/high16 v26, -0x41000000    # -0.5f

    .line 243
    .line 244
    const v21, 0x3e8f5c29    # 0.28f

    .line 245
    .line 246
    .line 247
    const/high16 v23, 0x3f000000    # 0.5f

    .line 248
    .line 249
    const v24, -0x419eb852    # -0.22f

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v4, -0x419eb852    # -0.22f

    .line 256
    .line 257
    .line 258
    const/high16 v6, -0x41000000    # -0.5f

    .line 259
    .line 260
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    const/16 v16, 0x3800

    .line 271
    .line 272
    const/16 v17, 0x0

    .line 273
    .line 274
    const v6, 0x3e99999a    # 0.3f

    .line 275
    .line 276
    .line 277
    const v8, 0x3e99999a    # 0.3f

    .line 278
    .line 279
    .line 280
    const/4 v7, 0x0

    .line 281
    const/high16 v9, 0x3f800000    # 1.0f

    .line 282
    .line 283
    const/high16 v12, 0x3f800000    # 1.0f

    .line 284
    .line 285
    const/4 v13, 0x0

    .line 286
    const/4 v14, 0x0

    .line 287
    const/4 v15, 0x0

    .line 288
    const-string v4, ""

    .line 289
    .line 290
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 291
    .line 292
    .line 293
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 294
    .line 295
    .line 296
    move-result v3

    .line 297
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 298
    .line 299
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 300
    .line 301
    .line 302
    move-result-wide v6

    .line 303
    const/4 v0, 0x0

    .line 304
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 308
    .line 309
    .line 310
    move-result v10

    .line 311
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 312
    .line 313
    .line 314
    move-result v11

    .line 315
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 318
    .line 319
    .line 320
    const/high16 v0, 0x41300000    # 11.0f

    .line 321
    .line 322
    const/high16 v2, 0x41980000    # 19.0f

    .line 323
    .line 324
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v0, 0x40e00000    # 7.0f

    .line 328
    .line 329
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v17, -0x40000000    # -2.0f

    .line 333
    .line 334
    const/high16 v18, -0x40000000    # -2.0f

    .line 335
    .line 336
    const v14, -0x40733333    # -1.1f

    .line 337
    .line 338
    .line 339
    const v15, -0x4099999a    # -0.9f

    .line 340
    .line 341
    .line 342
    const/high16 v16, -0x40000000    # -2.0f

    .line 343
    .line 344
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v0, -0x3f800000    # -4.0f

    .line 348
    .line 349
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 353
    .line 354
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 355
    .line 356
    const v14, -0x404f5c29    # -1.38f

    .line 357
    .line 358
    .line 359
    const v15, -0x4070a3d7    # -1.12f

    .line 360
    .line 361
    .line 362
    const/high16 v16, -0x3fe00000    # -2.5f

    .line 363
    .line 364
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v0, 0x4067ae14    # 3.62f

    .line 368
    .line 369
    .line 370
    const/high16 v2, 0x41000000    # 8.0f

    .line 371
    .line 372
    const/high16 v4, 0x40a00000    # 5.0f

    .line 373
    .line 374
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const/high16 v0, 0x40800000    # 4.0f

    .line 378
    .line 379
    const/high16 v2, 0x40a00000    # 5.0f

    .line 380
    .line 381
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const v17, -0x400147ae    # -1.99f

    .line 385
    .line 386
    .line 387
    const/high16 v18, 0x40000000    # 2.0f

    .line 388
    .line 389
    const v13, -0x40733333    # -1.1f

    .line 390
    .line 391
    .line 392
    const/4 v14, 0x0

    .line 393
    const v15, -0x400147ae    # -1.99f

    .line 394
    .line 395
    .line 396
    const v16, 0x3f666666    # 0.9f

    .line 397
    .line 398
    .line 399
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v0, 0x40733333    # 3.8f

    .line 403
    .line 404
    .line 405
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v0, 0x3e947ae1    # 0.29f

    .line 409
    .line 410
    .line 411
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v17, 0x402ccccd    # 2.7f

    .line 415
    .line 416
    .line 417
    const v18, 0x402ccccd    # 2.7f

    .line 418
    .line 419
    .line 420
    const v13, 0x3fbeb852    # 1.49f

    .line 421
    .line 422
    .line 423
    const v15, 0x402ccccd    # 2.7f

    .line 424
    .line 425
    .line 426
    const v16, 0x3f9ae148    # 1.21f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v0, -0x40651eb8    # -1.21f

    .line 433
    .line 434
    .line 435
    const v2, -0x3fd33333    # -2.7f

    .line 436
    .line 437
    .line 438
    const v4, 0x402ccccd    # 2.7f

    .line 439
    .line 440
    .line 441
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v0, 0x4181999a    # 16.2f

    .line 445
    .line 446
    .line 447
    const/high16 v2, 0x40000000    # 2.0f

    .line 448
    .line 449
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const/high16 v0, 0x41a00000    # 20.0f

    .line 453
    .line 454
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v17, 0x40000000    # 2.0f

    .line 458
    .line 459
    const/high16 v18, 0x40000000    # 2.0f

    .line 460
    .line 461
    const/4 v13, 0x0

    .line 462
    const v14, 0x3f8ccccd    # 1.1f

    .line 463
    .line 464
    .line 465
    const v15, 0x3f666666    # 0.9f

    .line 466
    .line 467
    .line 468
    const/high16 v16, 0x40000000    # 2.0f

    .line 469
    .line 470
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const v0, 0x40733333    # 3.8f

    .line 474
    .line 475
    .line 476
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const v0, -0x41666666    # -0.3f

    .line 480
    .line 481
    .line 482
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v17, 0x402ccccd    # 2.7f

    .line 486
    .line 487
    .line 488
    const v18, -0x3fd33333    # -2.7f

    .line 489
    .line 490
    .line 491
    const v14, -0x404147ae    # -1.49f

    .line 492
    .line 493
    .line 494
    const v15, 0x3f9ae148    # 1.21f

    .line 495
    .line 496
    .line 497
    const v16, -0x3fd33333    # -2.7f

    .line 498
    .line 499
    .line 500
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const v0, 0x3f9ae148    # 1.21f

    .line 504
    .line 505
    .line 506
    const v2, 0x402ccccd    # 2.7f

    .line 507
    .line 508
    .line 509
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const v0, 0x3e99999a    # 0.3f

    .line 513
    .line 514
    .line 515
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const/high16 v0, 0x41b00000    # 22.0f

    .line 519
    .line 520
    const/high16 v2, 0x41880000    # 17.0f

    .line 521
    .line 522
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const/high16 v17, 0x40000000    # 2.0f

    .line 526
    .line 527
    const/high16 v18, -0x40000000    # -2.0f

    .line 528
    .line 529
    const v13, 0x3f8ccccd    # 1.1f

    .line 530
    .line 531
    .line 532
    const/4 v14, 0x0

    .line 533
    const/high16 v15, 0x40000000    # 2.0f

    .line 534
    .line 535
    const v16, -0x4099999a    # -0.9f

    .line 536
    .line 537
    .line 538
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const/high16 v0, -0x3f800000    # -4.0f

    .line 542
    .line 543
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const/high16 v17, 0x40200000    # 2.5f

    .line 547
    .line 548
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 549
    .line 550
    const v13, 0x3fb0a3d7    # 1.38f

    .line 551
    .line 552
    .line 553
    const/high16 v15, 0x40200000    # 2.5f

    .line 554
    .line 555
    const v16, -0x4070a3d7    # -1.12f

    .line 556
    .line 557
    .line 558
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const v0, 0x41a30a3d    # 20.38f

    .line 562
    .line 563
    .line 564
    const/high16 v2, 0x41300000    # 11.0f

    .line 565
    .line 566
    const/high16 v4, 0x41980000    # 19.0f

    .line 567
    .line 568
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const/high16 v0, 0x41600000    # 14.0f

    .line 575
    .line 576
    const/high16 v2, 0x41980000    # 19.0f

    .line 577
    .line 578
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const/high16 v0, -0x40000000    # -2.0f

    .line 582
    .line 583
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const/high16 v0, 0x40c00000    # 6.0f

    .line 587
    .line 588
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const v0, -0x3ff851ec    # -2.12f

    .line 592
    .line 593
    .line 594
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const v17, -0x3f73d70a    # -4.38f

    .line 598
    .line 599
    .line 600
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 601
    .line 602
    const v13, -0x40d1eb85    # -0.68f

    .line 603
    .line 604
    .line 605
    const/high16 v14, -0x40200000    # -1.75f

    .line 606
    .line 607
    const v15, -0x3fe70a3d    # -2.39f

    .line 608
    .line 609
    .line 610
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 611
    .line 612
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const/high16 v18, 0x40400000    # 3.0f

    .line 616
    .line 617
    const v13, -0x400147ae    # -1.99f

    .line 618
    .line 619
    .line 620
    const/4 v14, 0x0

    .line 621
    const v15, -0x3f933333    # -3.7f

    .line 622
    .line 623
    .line 624
    const/high16 v16, 0x3fa00000    # 1.25f

    .line 625
    .line 626
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const/high16 v0, 0x41a00000    # 20.0f

    .line 630
    .line 631
    const/high16 v2, 0x40800000    # 4.0f

    .line 632
    .line 633
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const v0, -0x3ff851ec    # -2.12f

    .line 637
    .line 638
    .line 639
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const/high16 v17, 0x40400000    # 3.0f

    .line 643
    .line 644
    const v18, -0x3f73d70a    # -4.38f

    .line 645
    .line 646
    .line 647
    const/high16 v13, 0x3fe00000    # 1.75f

    .line 648
    .line 649
    const v14, -0x40d1eb85    # -0.68f

    .line 650
    .line 651
    .line 652
    const/high16 v15, 0x40400000    # 3.0f

    .line 653
    .line 654
    const v16, -0x3fe70a3d    # -2.39f

    .line 655
    .line 656
    .line 657
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const v17, -0x3fc0a3d7    # -2.99f

    .line 661
    .line 662
    .line 663
    const/4 v13, 0x0

    .line 664
    const v14, -0x400147ae    # -1.99f

    .line 665
    .line 666
    .line 667
    const v15, -0x406147ae    # -1.24f

    .line 668
    .line 669
    .line 670
    const v16, -0x3f933333    # -3.7f

    .line 671
    .line 672
    .line 673
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const/high16 v0, 0x40e00000    # 7.0f

    .line 677
    .line 678
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    const/high16 v0, 0x40c00000    # 6.0f

    .line 682
    .line 683
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 684
    .line 685
    .line 686
    const/high16 v0, 0x41200000    # 10.0f

    .line 687
    .line 688
    const/high16 v2, 0x40a00000    # 5.0f

    .line 689
    .line 690
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 691
    .line 692
    .line 693
    const/high16 v17, 0x3f000000    # 0.5f

    .line 694
    .line 695
    const/high16 v18, -0x41000000    # -0.5f

    .line 696
    .line 697
    const v14, -0x4170a3d7    # -0.28f

    .line 698
    .line 699
    .line 700
    const v15, 0x3e6147ae    # 0.22f

    .line 701
    .line 702
    .line 703
    const/high16 v16, -0x41000000    # -0.5f

    .line 704
    .line 705
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 706
    .line 707
    .line 708
    const v0, 0x3e6147ae    # 0.22f

    .line 709
    .line 710
    .line 711
    const/high16 v2, 0x3f000000    # 0.5f

    .line 712
    .line 713
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 714
    .line 715
    .line 716
    const/high16 v0, 0x40000000    # 2.0f

    .line 717
    .line 718
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    const/high16 v0, 0x40c00000    # 6.0f

    .line 722
    .line 723
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 724
    .line 725
    .line 726
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 727
    .line 728
    .line 729
    const/high16 v0, 0x40000000    # 2.0f

    .line 730
    .line 731
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    const/high16 v18, 0x3f000000    # 0.5f

    .line 735
    .line 736
    const v13, 0x3e8f5c29    # 0.28f

    .line 737
    .line 738
    .line 739
    const/4 v14, 0x0

    .line 740
    const/high16 v15, 0x3f000000    # 0.5f

    .line 741
    .line 742
    const v16, 0x3e6147ae    # 0.22f

    .line 743
    .line 744
    .line 745
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 746
    .line 747
    .line 748
    const v0, -0x419eb852    # -0.22f

    .line 749
    .line 750
    .line 751
    const/high16 v4, -0x41000000    # -0.5f

    .line 752
    .line 753
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 754
    .line 755
    .line 756
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 757
    .line 758
    .line 759
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 760
    .line 761
    .line 762
    move-result-object v2

    .line 763
    const/16 v16, 0x3800

    .line 764
    .line 765
    const/16 v17, 0x0

    .line 766
    .line 767
    const/high16 v6, 0x3f800000    # 1.0f

    .line 768
    .line 769
    const/high16 v8, 0x3f800000    # 1.0f

    .line 770
    .line 771
    const/4 v7, 0x0

    .line 772
    const/high16 v12, 0x3f800000    # 1.0f

    .line 773
    .line 774
    const/4 v13, 0x0

    .line 775
    const/4 v15, 0x0

    .line 776
    const-string v4, ""

    .line 777
    .line 778
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 779
    .line 780
    .line 781
    move-result-object v0

    .line 782
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 783
    .line 784
    .line 785
    move-result-object v0

    .line 786
    sput-object v0, Landroidx/compose/material/icons/twotone/ExtensionKt;->_extension:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 787
    .line 788
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 789
    .line 790
    .line 791
    return-object v0
.end method
