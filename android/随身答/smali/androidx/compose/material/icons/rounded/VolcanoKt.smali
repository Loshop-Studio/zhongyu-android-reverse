.class public final Landroidx/compose/material/icons/rounded/VolcanoKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_volcano",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Volcano",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getVolcano",
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
        "SMAP\nVolcano.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Volcano.kt\nandroidx/compose/material/icons/rounded/VolcanoKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,86:1\n212#2,12:87\n233#2,18:100\n253#2:137\n233#2,18:138\n253#2:175\n233#2,18:176\n253#2:213\n233#2,18:214\n253#2:251\n174#3:99\n705#4,2:118\n717#4,2:120\n719#4,11:126\n705#4,2:156\n717#4,2:158\n719#4,11:164\n705#4,2:194\n717#4,2:196\n719#4,11:202\n705#4,2:232\n717#4,2:234\n719#4,11:240\n72#5,4:122\n72#5,4:160\n72#5,4:198\n72#5,4:236\n*S KotlinDebug\n*F\n+ 1 Volcano.kt\nandroidx/compose/material/icons/rounded/VolcanoKt\n*L\n29#1:87,12\n30#1:100,18\n30#1:137\n45#1:138,18\n45#1:175\n57#1:176,18\n57#1:213\n69#1:214,18\n69#1:251\n29#1:99\n30#1:118,2\n30#1:120,2\n30#1:126,11\n45#1:156,2\n45#1:158,2\n45#1:164,11\n57#1:194,2\n57#1:196,2\n57#1:202,11\n69#1:232,2\n69#1:234,2\n69#1:240,11\n30#1:122,4\n45#1:160,4\n57#1:198,4\n69#1:236,4\n*E\n"
    }
.end annotation


# static fields
.field private static _volcano:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getVolcano(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/VolcanoKt;->_volcano:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Volcano"

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
    const v4, 0x4183eb85    # 16.49f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x41000000    # 8.0f

    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v4, -0x3f7b851f    # -4.14f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const v25, -0x4011eb85    # -1.86f

    .line 85
    .line 86
    .line 87
    const v26, 0x3fa147ae    # 1.26f

    .line 88
    .line 89
    .line 90
    const v21, -0x40ae147b    # -0.82f

    .line 91
    .line 92
    .line 93
    const/16 v22, 0x0

    .line 94
    .line 95
    const v23, -0x4039999a    # -1.55f

    .line 96
    .line 97
    .line 98
    const/high16 v24, 0x3f000000    # 0.5f

    .line 99
    .line 100
    move-object/from16 v20, v2

    .line 101
    .line 102
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v4, 0x41100000    # 9.0f

    .line 106
    .line 107
    const/high16 v6, 0x41500000    # 13.0f

    .line 108
    .line 109
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v4, 0x40e9999a    # 7.3f

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v25, -0x4015c28f    # -1.83f

    .line 119
    .line 120
    .line 121
    const v26, 0x3f9851ec    # 1.19f

    .line 122
    .line 123
    .line 124
    const v21, -0x40b5c28f    # -0.79f

    .line 125
    .line 126
    .line 127
    const v23, -0x403eb852    # -1.51f

    .line 128
    .line 129
    .line 130
    const v24, 0x3ef0a3d7    # 0.47f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v4, -0x3ff1eb85    # -2.22f

    .line 137
    .line 138
    .line 139
    const/high16 v6, 0x40a00000    # 5.0f

    .line 140
    .line 141
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v25, 0x40a28f5c    # 5.08f

    .line 145
    .line 146
    .line 147
    const/high16 v26, 0x41b00000    # 22.0f

    .line 148
    .line 149
    const v21, 0x402a3d71    # 2.66f

    .line 150
    .line 151
    .line 152
    const v22, 0x41a4147b    # 20.51f

    .line 153
    .line 154
    .line 155
    const v23, 0x406851ec    # 3.63f

    .line 156
    .line 157
    .line 158
    const/high16 v24, 0x41b00000    # 22.0f

    .line 159
    .line 160
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v4, 0x416451ec    # 14.27f

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v25, 0x3ff5c28f    # 1.92f

    .line 170
    .line 171
    .line 172
    const v26, -0x3fdccccd    # -2.55f

    .line 173
    .line 174
    .line 175
    const v21, 0x3faa3d71    # 1.33f

    .line 176
    .line 177
    .line 178
    const/16 v22, 0x0

    .line 179
    .line 180
    const v23, 0x40128f5c    # 2.29f

    .line 181
    .line 182
    .line 183
    const v24, -0x405d70a4    # -1.27f

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v4, -0x3fc8f5c3    # -2.86f

    .line 190
    .line 191
    .line 192
    const/high16 v6, -0x3ee00000    # -10.0f

    .line 193
    .line 194
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v25, 0x4183eb85    # 16.49f

    .line 198
    .line 199
    .line 200
    const/high16 v26, 0x41000000    # 8.0f

    .line 201
    .line 202
    const v21, 0x41915c29    # 18.17f

    .line 203
    .line 204
    .line 205
    const v22, 0x410970a4    # 8.59f

    .line 206
    .line 207
    .line 208
    const v23, 0x418b0a3d    # 17.38f

    .line 209
    .line 210
    .line 211
    const/high16 v24, 0x41000000    # 8.0f

    .line 212
    .line 213
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    const/16 v16, 0x3800

    .line 224
    .line 225
    const/16 v17, 0x0

    .line 226
    .line 227
    const/high16 v6, 0x3f800000    # 1.0f

    .line 228
    .line 229
    const/high16 v8, 0x3f800000    # 1.0f

    .line 230
    .line 231
    const/4 v7, 0x0

    .line 232
    const/high16 v9, 0x3f800000    # 1.0f

    .line 233
    .line 234
    const/high16 v12, 0x3f800000    # 1.0f

    .line 235
    .line 236
    const/4 v13, 0x0

    .line 237
    const/4 v14, 0x0

    .line 238
    const/4 v15, 0x0

    .line 239
    const-string v4, ""

    .line 240
    .line 241
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 242
    .line 243
    .line 244
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 245
    .line 246
    .line 247
    move-result v3

    .line 248
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 249
    .line 250
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 251
    .line 252
    .line 253
    move-result-wide v6

    .line 254
    const/4 v2, 0x0

    .line 255
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 259
    .line 260
    .line 261
    move-result v10

    .line 262
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 263
    .line 264
    .line 265
    move-result v11

    .line 266
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 269
    .line 270
    .line 271
    const/high16 v4, 0x3f800000    # 1.0f

    .line 272
    .line 273
    const/high16 v6, 0x41600000    # 14.0f

    .line 274
    .line 275
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v25, -0x40800000    # -1.0f

    .line 282
    .line 283
    const/high16 v26, 0x3f800000    # 1.0f

    .line 284
    .line 285
    const v21, -0x40f33333    # -0.55f

    .line 286
    .line 287
    .line 288
    const/16 v22, 0x0

    .line 289
    .line 290
    const/high16 v23, -0x40800000    # -1.0f

    .line 291
    .line 292
    const v24, 0x3ee66666    # 0.45f

    .line 293
    .line 294
    .line 295
    move-object/from16 v20, v2

    .line 296
    .line 297
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v4, 0x40000000    # 2.0f

    .line 301
    .line 302
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v25, 0x3f800000    # 1.0f

    .line 306
    .line 307
    const/16 v21, 0x0

    .line 308
    .line 309
    const v22, 0x3f0ccccd    # 0.55f

    .line 310
    .line 311
    .line 312
    const v23, 0x3ee66666    # 0.45f

    .line 313
    .line 314
    .line 315
    const/high16 v24, 0x3f800000    # 1.0f

    .line 316
    .line 317
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/4 v4, 0x0

    .line 321
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const/high16 v26, -0x40800000    # -1.0f

    .line 325
    .line 326
    const v21, 0x3f0ccccd    # 0.55f

    .line 327
    .line 328
    .line 329
    const/16 v22, 0x0

    .line 330
    .line 331
    const/high16 v23, 0x3f800000    # 1.0f

    .line 332
    .line 333
    const v24, -0x4119999a    # -0.45f

    .line 334
    .line 335
    .line 336
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const/high16 v4, 0x40000000    # 2.0f

    .line 340
    .line 341
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/high16 v25, 0x41600000    # 14.0f

    .line 345
    .line 346
    const/high16 v26, 0x3f800000    # 1.0f

    .line 347
    .line 348
    const/high16 v21, 0x41700000    # 15.0f

    .line 349
    .line 350
    const v22, 0x3fb9999a    # 1.45f

    .line 351
    .line 352
    .line 353
    const v23, 0x4168cccd    # 14.55f

    .line 354
    .line 355
    .line 356
    const/high16 v24, 0x3f800000    # 1.0f

    .line 357
    .line 358
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 365
    .line 366
    .line 367
    move-result-object v2

    .line 368
    const/high16 v6, 0x3f800000    # 1.0f

    .line 369
    .line 370
    const/4 v7, 0x0

    .line 371
    const-string v4, ""

    .line 372
    .line 373
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 374
    .line 375
    .line 376
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 377
    .line 378
    .line 379
    move-result v3

    .line 380
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 381
    .line 382
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 383
    .line 384
    .line 385
    move-result-wide v6

    .line 386
    const/4 v2, 0x0

    .line 387
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 388
    .line 389
    .line 390
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 391
    .line 392
    .line 393
    move-result v10

    .line 394
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 395
    .line 396
    .line 397
    move-result v11

    .line 398
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 401
    .line 402
    .line 403
    const v4, 0x419d47ae    # 19.66f

    .line 404
    .line 405
    .line 406
    const v6, 0x4055c28f    # 3.34f

    .line 407
    .line 408
    .line 409
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v25, -0x404b851f    # -1.41f

    .line 416
    .line 417
    .line 418
    const/16 v26, 0x0

    .line 419
    .line 420
    const v21, -0x413851ec    # -0.39f

    .line 421
    .line 422
    .line 423
    const v22, -0x413851ec    # -0.39f

    .line 424
    .line 425
    .line 426
    const v23, -0x407d70a4    # -1.02f

    .line 427
    .line 428
    .line 429
    const v24, -0x413851ec    # -0.39f

    .line 430
    .line 431
    .line 432
    move-object/from16 v20, v2

    .line 433
    .line 434
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const v4, -0x404b851f    # -1.41f

    .line 438
    .line 439
    .line 440
    const v6, 0x3fb47ae1    # 1.41f

    .line 441
    .line 442
    .line 443
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const/16 v25, 0x0

    .line 447
    .line 448
    const v26, 0x3fb47ae1    # 1.41f

    .line 449
    .line 450
    .line 451
    const v22, 0x3ec7ae14    # 0.39f

    .line 452
    .line 453
    .line 454
    const v23, -0x413851ec    # -0.39f

    .line 455
    .line 456
    .line 457
    const v24, 0x3f828f5c    # 1.02f

    .line 458
    .line 459
    .line 460
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const/4 v4, 0x0

    .line 464
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const v25, 0x3fb47ae1    # 1.41f

    .line 468
    .line 469
    .line 470
    const/16 v26, 0x0

    .line 471
    .line 472
    const v21, 0x3ec7ae14    # 0.39f

    .line 473
    .line 474
    .line 475
    const v23, 0x3f828f5c    # 1.02f

    .line 476
    .line 477
    .line 478
    const v24, 0x3ec7ae14    # 0.39f

    .line 479
    .line 480
    .line 481
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const v4, -0x404b851f    # -1.41f

    .line 485
    .line 486
    .line 487
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const v25, 0x419d47ae    # 19.66f

    .line 491
    .line 492
    .line 493
    const v26, 0x4055c28f    # 3.34f

    .line 494
    .line 495
    .line 496
    const v21, 0x41a06666    # 20.05f

    .line 497
    .line 498
    .line 499
    const v22, 0x408bd70a    # 4.37f

    .line 500
    .line 501
    .line 502
    const v23, 0x41a06666    # 20.05f

    .line 503
    .line 504
    .line 505
    const v24, 0x406eb852    # 3.73f

    .line 506
    .line 507
    .line 508
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 515
    .line 516
    .line 517
    move-result-object v2

    .line 518
    const/high16 v6, 0x3f800000    # 1.0f

    .line 519
    .line 520
    const/4 v7, 0x0

    .line 521
    const-string v4, ""

    .line 522
    .line 523
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 524
    .line 525
    .line 526
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 527
    .line 528
    .line 529
    move-result v3

    .line 530
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 531
    .line 532
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 533
    .line 534
    .line 535
    move-result-wide v6

    .line 536
    const/4 v0, 0x0

    .line 537
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 538
    .line 539
    .line 540
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 541
    .line 542
    .line 543
    move-result v10

    .line 544
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 545
    .line 546
    .line 547
    move-result v11

    .line 548
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 551
    .line 552
    .line 553
    const v0, 0x4132b852    # 11.17f

    .line 554
    .line 555
    .line 556
    const v2, 0x409851ec    # 4.76f

    .line 557
    .line 558
    .line 559
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const v0, 0x411c28f6    # 9.76f

    .line 563
    .line 564
    .line 565
    const v2, 0x4055c28f    # 3.34f

    .line 566
    .line 567
    .line 568
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const v17, -0x404b851f    # -1.41f

    .line 572
    .line 573
    .line 574
    const/16 v18, 0x0

    .line 575
    .line 576
    const v13, -0x413851ec    # -0.39f

    .line 577
    .line 578
    .line 579
    const v14, -0x413851ec    # -0.39f

    .line 580
    .line 581
    .line 582
    const v15, -0x407d70a4    # -1.02f

    .line 583
    .line 584
    .line 585
    const v16, -0x413851ec    # -0.39f

    .line 586
    .line 587
    .line 588
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const/4 v0, 0x0

    .line 592
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    const/16 v17, 0x0

    .line 596
    .line 597
    const v18, 0x3fb47ae1    # 1.41f

    .line 598
    .line 599
    .line 600
    const v14, 0x3ec7ae14    # 0.39f

    .line 601
    .line 602
    .line 603
    const v15, -0x413851ec    # -0.39f

    .line 604
    .line 605
    .line 606
    const v16, 0x3f828f5c    # 1.02f

    .line 607
    .line 608
    .line 609
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    const v0, 0x3fb47ae1    # 1.41f

    .line 613
    .line 614
    .line 615
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const v17, 0x3fb47ae1    # 1.41f

    .line 619
    .line 620
    .line 621
    const/16 v18, 0x0

    .line 622
    .line 623
    const v13, 0x3ec7ae14    # 0.39f

    .line 624
    .line 625
    .line 626
    const v15, 0x3f828f5c    # 1.02f

    .line 627
    .line 628
    .line 629
    const v16, 0x3ec7ae14    # 0.39f

    .line 630
    .line 631
    .line 632
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const/4 v0, 0x0

    .line 636
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const v17, 0x4132b852    # 11.17f

    .line 640
    .line 641
    .line 642
    const v18, 0x409851ec    # 4.76f

    .line 643
    .line 644
    .line 645
    const v13, 0x4138f5c3    # 11.56f

    .line 646
    .line 647
    .line 648
    const v14, 0x40b8f5c3    # 5.78f

    .line 649
    .line 650
    .line 651
    const v15, 0x4138f5c3    # 11.56f

    .line 652
    .line 653
    .line 654
    const v16, 0x40a4cccd    # 5.15f

    .line 655
    .line 656
    .line 657
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 664
    .line 665
    .line 666
    move-result-object v2

    .line 667
    const/16 v16, 0x3800

    .line 668
    .line 669
    const/16 v17, 0x0

    .line 670
    .line 671
    const/high16 v6, 0x3f800000    # 1.0f

    .line 672
    .line 673
    const/4 v7, 0x0

    .line 674
    const/high16 v12, 0x3f800000    # 1.0f

    .line 675
    .line 676
    const/4 v13, 0x0

    .line 677
    const/4 v14, 0x0

    .line 678
    const/4 v15, 0x0

    .line 679
    const-string v4, ""

    .line 680
    .line 681
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 682
    .line 683
    .line 684
    move-result-object v0

    .line 685
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 686
    .line 687
    .line 688
    move-result-object v0

    .line 689
    sput-object v0, Landroidx/compose/material/icons/rounded/VolcanoKt;->_volcano:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 690
    .line 691
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 692
    .line 693
    .line 694
    return-object v0
.end method
