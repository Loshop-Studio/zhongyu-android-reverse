.class public final Landroidx/compose/material/icons/twotone/LinkedCameraKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_linkedCamera",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "LinkedCamera",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getLinkedCamera",
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
        "SMAP\nLinkedCamera.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkedCamera.kt\nandroidx/compose/material/icons/twotone/LinkedCameraKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,107:1\n212#2,12:108\n233#2,18:121\n253#2:158\n233#2,18:159\n253#2:196\n233#2,18:197\n253#2:234\n174#3:120\n705#4,2:139\n717#4,2:141\n719#4,11:147\n705#4,2:177\n717#4,2:179\n719#4,11:185\n705#4,2:215\n717#4,2:217\n719#4,11:223\n72#5,4:143\n72#5,4:181\n72#5,4:219\n*S KotlinDebug\n*F\n+ 1 LinkedCamera.kt\nandroidx/compose/material/icons/twotone/LinkedCameraKt\n*L\n29#1:108,12\n30#1:121,18\n30#1:158\n63#1:159,18\n63#1:196\n88#1:197,18\n88#1:234\n29#1:120\n30#1:139,2\n30#1:141,2\n30#1:147,11\n63#1:177,2\n63#1:179,2\n63#1:185,11\n88#1:215,2\n88#1:217,2\n88#1:223,11\n30#1:143,4\n63#1:181,4\n88#1:219,4\n*E\n"
    }
.end annotation


# static fields
.field private static _linkedCamera:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLinkedCamera(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/LinkedCameraKt;->_linkedCamera:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.LinkedCamera"

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
    const/high16 v4, 0x41a00000    # 20.0f

    .line 71
    .line 72
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 73
    .line 74
    .line 75
    const/high16 v6, 0x40800000    # 4.0f

    .line 76
    .line 77
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 78
    .line 79
    .line 80
    const/high16 v4, 0x41000000    # 8.0f

    .line 81
    .line 82
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const v4, 0x4081999a    # 4.05f

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 89
    .line 90
    .line 91
    const v4, 0x3fea3d71    # 1.83f

    .line 92
    .line 93
    .line 94
    const/high16 v6, -0x40000000    # -2.0f

    .line 95
    .line 96
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v4, 0x41700000    # 15.0f

    .line 100
    .line 101
    const/high16 v6, 0x40c00000    # 6.0f

    .line 102
    .line 103
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v6, 0x40800000    # 4.0f

    .line 107
    .line 108
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v4, 0x41100000    # 9.0f

    .line 112
    .line 113
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v4, 0x40e570a4    # 7.17f

    .line 117
    .line 118
    .line 119
    const/high16 v6, 0x40c00000    # 6.0f

    .line 120
    .line 121
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v4, 0x40c00000    # 6.0f

    .line 125
    .line 126
    const/high16 v6, 0x40800000    # 4.0f

    .line 127
    .line 128
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v25, -0x40000000    # -2.0f

    .line 132
    .line 133
    const/high16 v26, 0x40000000    # 2.0f

    .line 134
    .line 135
    const v21, -0x40733333    # -1.1f

    .line 136
    .line 137
    .line 138
    const/16 v22, 0x0

    .line 139
    .line 140
    const/high16 v23, -0x40000000    # -2.0f

    .line 141
    .line 142
    const v24, 0x3f666666    # 0.9f

    .line 143
    .line 144
    .line 145
    move-object/from16 v20, v2

    .line 146
    .line 147
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v4, 0x41400000    # 12.0f

    .line 151
    .line 152
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const/high16 v25, 0x40000000    # 2.0f

    .line 156
    .line 157
    const/16 v21, 0x0

    .line 158
    .line 159
    const v22, 0x3f8ccccd    # 1.1f

    .line 160
    .line 161
    .line 162
    const v23, 0x3f666666    # 0.9f

    .line 163
    .line 164
    .line 165
    const/high16 v24, 0x40000000    # 2.0f

    .line 166
    .line 167
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v4, 0x41800000    # 16.0f

    .line 171
    .line 172
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const/high16 v26, -0x40000000    # -2.0f

    .line 176
    .line 177
    const v21, 0x3f8ccccd    # 1.1f

    .line 178
    .line 179
    .line 180
    const/16 v22, 0x0

    .line 181
    .line 182
    const/high16 v23, 0x40000000    # 2.0f

    .line 183
    .line 184
    const v24, -0x4099999a    # -0.9f

    .line 185
    .line 186
    .line 187
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v4, 0x41b00000    # 22.0f

    .line 191
    .line 192
    const/high16 v6, 0x41100000    # 9.0f

    .line 193
    .line 194
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v4, -0x40000000    # -2.0f

    .line 198
    .line 199
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v4, 0x41300000    # 11.0f

    .line 203
    .line 204
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v4, 0x40000000    # 2.0f

    .line 211
    .line 212
    const/high16 v6, 0x41800000    # 16.0f

    .line 213
    .line 214
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v4, 0x3faa3d71    # 1.33f

    .line 218
    .line 219
    .line 220
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const v25, 0x409570a4    # 4.67f

    .line 224
    .line 225
    .line 226
    const v26, 0x40951eb8    # 4.66f

    .line 227
    .line 228
    .line 229
    const v21, 0x40251eb8    # 2.58f

    .line 230
    .line 231
    .line 232
    const v23, 0x40951eb8    # 4.66f

    .line 233
    .line 234
    .line 235
    const v24, 0x4005c28f    # 2.09f

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v4, 0x40ffae14    # 7.99f

    .line 242
    .line 243
    .line 244
    const/high16 v6, 0x41b00000    # 22.0f

    .line 245
    .line 246
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v25, 0x41800000    # 16.0f

    .line 250
    .line 251
    const/high16 v26, 0x40000000    # 2.0f

    .line 252
    .line 253
    const v21, 0x41afeb85    # 21.99f

    .line 254
    .line 255
    .line 256
    const v22, 0x4095c28f    # 4.68f

    .line 257
    .line 258
    .line 259
    const v23, 0x419a7ae1    # 19.31f

    .line 260
    .line 261
    .line 262
    const/high16 v24, 0x40000000    # 2.0f

    .line 263
    .line 264
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v4, 0x409570a4    # 4.67f

    .line 271
    .line 272
    .line 273
    const/high16 v6, 0x41800000    # 16.0f

    .line 274
    .line 275
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const/high16 v4, 0x41800000    # 16.0f

    .line 279
    .line 280
    const/high16 v6, 0x40c00000    # 6.0f

    .line 281
    .line 282
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v25, 0x40000000    # 2.0f

    .line 286
    .line 287
    const v26, 0x3ffeb852    # 1.99f

    .line 288
    .line 289
    .line 290
    const v21, 0x3f8e147b    # 1.11f

    .line 291
    .line 292
    .line 293
    const/16 v22, 0x0

    .line 294
    .line 295
    const v23, 0x3ffeb852    # 1.99f

    .line 296
    .line 297
    .line 298
    const v24, 0x3f63d70a    # 0.89f

    .line 299
    .line 300
    .line 301
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v4, 0x3faa3d71    # 1.33f

    .line 305
    .line 306
    .line 307
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v25, -0x3faae148    # -3.33f

    .line 311
    .line 312
    .line 313
    const v26, -0x3fab851f    # -3.32f

    .line 314
    .line 315
    .line 316
    const v21, -0x43dc28f6    # -0.01f

    .line 317
    .line 318
    .line 319
    const v22, -0x40147ae1    # -1.84f

    .line 320
    .line 321
    .line 322
    const v23, -0x404147ae    # -1.49f

    .line 323
    .line 324
    .line 325
    const v24, -0x3fab851f    # -3.32f

    .line 326
    .line 327
    .line 328
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 335
    .line 336
    .line 337
    move-result-object v2

    .line 338
    const/16 v16, 0x3800

    .line 339
    .line 340
    const/16 v17, 0x0

    .line 341
    .line 342
    const/high16 v6, 0x3f800000    # 1.0f

    .line 343
    .line 344
    const/high16 v8, 0x3f800000    # 1.0f

    .line 345
    .line 346
    const/4 v7, 0x0

    .line 347
    const/high16 v9, 0x3f800000    # 1.0f

    .line 348
    .line 349
    const/high16 v12, 0x3f800000    # 1.0f

    .line 350
    .line 351
    const/4 v13, 0x0

    .line 352
    const/4 v14, 0x0

    .line 353
    const/4 v15, 0x0

    .line 354
    const-string v4, ""

    .line 355
    .line 356
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 357
    .line 358
    .line 359
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 360
    .line 361
    .line 362
    move-result v3

    .line 363
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 364
    .line 365
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 366
    .line 367
    .line 368
    move-result-wide v6

    .line 369
    const/4 v2, 0x0

    .line 370
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 371
    .line 372
    .line 373
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 374
    .line 375
    .line 376
    move-result v10

    .line 377
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 378
    .line 379
    .line 380
    move-result v11

    .line 381
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 384
    .line 385
    .line 386
    const v4, 0x416fae14    # 14.98f

    .line 387
    .line 388
    .line 389
    const v6, 0x412028f6    # 10.01f

    .line 390
    .line 391
    .line 392
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const v25, -0x413851ec    # -0.39f

    .line 396
    .line 397
    .line 398
    const v26, -0x417ae148    # -0.26f

    .line 399
    .line 400
    .line 401
    const v21, -0x41fae148    # -0.13f

    .line 402
    .line 403
    .line 404
    const v22, -0x4247ae14    # -0.09f

    .line 405
    .line 406
    .line 407
    const v23, -0x417ae148    # -0.26f

    .line 408
    .line 409
    .line 410
    const v24, -0x41c7ae14    # -0.18f

    .line 411
    .line 412
    .line 413
    move-object/from16 v20, v2

    .line 414
    .line 415
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v25, 0x3ec7ae14    # 0.39f

    .line 419
    .line 420
    .line 421
    const v26, 0x3e851eb8    # 0.26f

    .line 422
    .line 423
    .line 424
    const v21, 0x3e0f5c29    # 0.14f

    .line 425
    .line 426
    .line 427
    const v22, 0x3da3d70a    # 0.08f

    .line 428
    .line 429
    .line 430
    const v23, 0x3e8a3d71    # 0.27f

    .line 431
    .line 432
    .line 433
    const v24, 0x3e2e147b    # 0.17f

    .line 434
    .line 435
    .line 436
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const/high16 v4, 0x41880000    # 17.0f

    .line 443
    .line 444
    const/high16 v6, 0x41100000    # 9.0f

    .line 445
    .line 446
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v25, -0x4170a3d7    # -0.28f

    .line 450
    .line 451
    .line 452
    const v26, -0x407eb852    # -1.01f

    .line 453
    .line 454
    .line 455
    const/16 v21, 0x0

    .line 456
    .line 457
    const v22, -0x41428f5c    # -0.37f

    .line 458
    .line 459
    .line 460
    const v23, -0x421eb852    # -0.11f

    .line 461
    .line 462
    .line 463
    const v24, -0x40ca3d71    # -0.71f

    .line 464
    .line 465
    .line 466
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const v25, -0x40c51eb8    # -0.73f

    .line 470
    .line 471
    .line 472
    const v26, -0x40c7ae14    # -0.72f

    .line 473
    .line 474
    .line 475
    const v21, -0x41c7ae14    # -0.18f

    .line 476
    .line 477
    .line 478
    const v22, -0x41666666    # -0.3f

    .line 479
    .line 480
    .line 481
    const v23, -0x4123d70a    # -0.43f

    .line 482
    .line 483
    .line 484
    const v24, -0x40f33333    # -0.55f

    .line 485
    .line 486
    .line 487
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v25, 0x41700000    # 15.0f

    .line 491
    .line 492
    const/high16 v26, 0x40e00000    # 7.0f

    .line 493
    .line 494
    const v21, 0x417b3333    # 15.7f

    .line 495
    .line 496
    .line 497
    const v22, 0x40e33333    # 7.1f

    .line 498
    .line 499
    .line 500
    const v23, 0x4175c28f    # 15.36f

    .line 501
    .line 502
    .line 503
    const/high16 v24, 0x40e00000    # 7.0f

    .line 504
    .line 505
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const/high16 v4, 0x41700000    # 15.0f

    .line 509
    .line 510
    const/high16 v6, 0x40c00000    # 6.0f

    .line 511
    .line 512
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const v4, 0x411e147b    # 9.88f

    .line 516
    .line 517
    .line 518
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v4, 0x4100cccd    # 8.05f

    .line 522
    .line 523
    .line 524
    const/high16 v6, 0x41000000    # 8.0f

    .line 525
    .line 526
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const/high16 v4, 0x41000000    # 8.0f

    .line 530
    .line 531
    const/high16 v6, 0x40800000    # 4.0f

    .line 532
    .line 533
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const/high16 v4, 0x41400000    # 12.0f

    .line 537
    .line 538
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const/high16 v4, 0x41800000    # 16.0f

    .line 542
    .line 543
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const/high16 v4, 0x41a00000    # 20.0f

    .line 547
    .line 548
    const/high16 v6, 0x41100000    # 9.0f

    .line 549
    .line 550
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 554
    .line 555
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const/high16 v4, 0x41980000    # 19.0f

    .line 562
    .line 563
    const/high16 v6, 0x41400000    # 12.0f

    .line 564
    .line 565
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const/high16 v25, -0x3f600000    # -5.0f

    .line 569
    .line 570
    const/high16 v26, -0x3f600000    # -5.0f

    .line 571
    .line 572
    const v21, -0x3fcf5c29    # -2.76f

    .line 573
    .line 574
    .line 575
    const/16 v22, 0x0

    .line 576
    .line 577
    const/high16 v23, -0x3f600000    # -5.0f

    .line 578
    .line 579
    const v24, -0x3ff0a3d7    # -2.24f

    .line 580
    .line 581
    .line 582
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const v4, 0x400f5c29    # 2.24f

    .line 586
    .line 587
    .line 588
    const/high16 v6, -0x3f600000    # -5.0f

    .line 589
    .line 590
    const/high16 v7, 0x40a00000    # 5.0f

    .line 591
    .line 592
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    const/high16 v6, 0x40a00000    # 5.0f

    .line 596
    .line 597
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const v4, -0x3ff0a3d7    # -2.24f

    .line 601
    .line 602
    .line 603
    const/high16 v6, -0x3f600000    # -5.0f

    .line 604
    .line 605
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 612
    .line 613
    .line 614
    move-result-object v2

    .line 615
    const v6, 0x3e99999a    # 0.3f

    .line 616
    .line 617
    .line 618
    const v8, 0x3e99999a    # 0.3f

    .line 619
    .line 620
    .line 621
    const/4 v7, 0x0

    .line 622
    const-string v4, ""

    .line 623
    .line 624
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 625
    .line 626
    .line 627
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 628
    .line 629
    .line 630
    move-result v3

    .line 631
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 632
    .line 633
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 634
    .line 635
    .line 636
    move-result-wide v6

    .line 637
    const/4 v0, 0x0

    .line 638
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 639
    .line 640
    .line 641
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 642
    .line 643
    .line 644
    move-result v10

    .line 645
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 646
    .line 647
    .line 648
    move-result v11

    .line 649
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 652
    .line 653
    .line 654
    const/high16 v0, 0x41400000    # 12.0f

    .line 655
    .line 656
    const/high16 v2, 0x41100000    # 9.0f

    .line 657
    .line 658
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    const/high16 v17, -0x3f600000    # -5.0f

    .line 662
    .line 663
    const/high16 v18, 0x40a00000    # 5.0f

    .line 664
    .line 665
    const v13, -0x3fcf5c29    # -2.76f

    .line 666
    .line 667
    .line 668
    const/high16 v15, -0x3f600000    # -5.0f

    .line 669
    .line 670
    const v16, 0x400f5c29    # 2.24f

    .line 671
    .line 672
    .line 673
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const v0, 0x400f5c29    # 2.24f

    .line 677
    .line 678
    .line 679
    const/high16 v2, 0x40a00000    # 5.0f

    .line 680
    .line 681
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const v0, -0x3ff0a3d7    # -2.24f

    .line 685
    .line 686
    .line 687
    const/high16 v2, -0x3f600000    # -5.0f

    .line 688
    .line 689
    const/high16 v4, 0x40a00000    # 5.0f

    .line 690
    .line 691
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 692
    .line 693
    .line 694
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    const/high16 v0, 0x41880000    # 17.0f

    .line 701
    .line 702
    const/high16 v2, 0x41400000    # 12.0f

    .line 703
    .line 704
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 705
    .line 706
    .line 707
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 708
    .line 709
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 710
    .line 711
    const v13, -0x402ccccd    # -1.65f

    .line 712
    .line 713
    .line 714
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 715
    .line 716
    const v16, -0x40533333    # -1.35f

    .line 717
    .line 718
    .line 719
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    const v0, 0x3faccccd    # 1.35f

    .line 723
    .line 724
    .line 725
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 726
    .line 727
    const/high16 v4, 0x40400000    # 3.0f

    .line 728
    .line 729
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    const/high16 v2, 0x40400000    # 3.0f

    .line 733
    .line 734
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 735
    .line 736
    .line 737
    const v0, -0x40533333    # -1.35f

    .line 738
    .line 739
    .line 740
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 741
    .line 742
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 746
    .line 747
    .line 748
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 749
    .line 750
    .line 751
    move-result-object v2

    .line 752
    const/16 v16, 0x3800

    .line 753
    .line 754
    const/16 v17, 0x0

    .line 755
    .line 756
    const/high16 v6, 0x3f800000    # 1.0f

    .line 757
    .line 758
    const/high16 v8, 0x3f800000    # 1.0f

    .line 759
    .line 760
    const/4 v7, 0x0

    .line 761
    const/high16 v12, 0x3f800000    # 1.0f

    .line 762
    .line 763
    const/4 v13, 0x0

    .line 764
    const/4 v15, 0x0

    .line 765
    const-string v4, ""

    .line 766
    .line 767
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 768
    .line 769
    .line 770
    move-result-object v0

    .line 771
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 772
    .line 773
    .line 774
    move-result-object v0

    .line 775
    sput-object v0, Landroidx/compose/material/icons/twotone/LinkedCameraKt;->_linkedCamera:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 776
    .line 777
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 778
    .line 779
    .line 780
    return-object v0
.end method
