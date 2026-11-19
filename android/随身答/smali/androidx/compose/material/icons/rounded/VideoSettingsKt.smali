.class public final Landroidx/compose/material/icons/rounded/VideoSettingsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_videoSettings",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "VideoSettings",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getVideoSettings",
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
        "SMAP\nVideoSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoSettings.kt\nandroidx/compose/material/icons/rounded/VideoSettingsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,107:1\n212#2,12:108\n233#2,18:121\n253#2:158\n233#2,18:159\n253#2:196\n233#2,18:197\n253#2:234\n174#3:120\n705#4,2:139\n717#4,2:141\n719#4,11:147\n705#4,2:177\n717#4,2:179\n719#4,11:185\n705#4,2:215\n717#4,2:217\n719#4,11:223\n72#5,4:143\n72#5,4:181\n72#5,4:219\n*S KotlinDebug\n*F\n+ 1 VideoSettings.kt\nandroidx/compose/material/icons/rounded/VideoSettingsKt\n*L\n29#1:108,12\n30#1:121,18\n30#1:158\n50#1:159,18\n50#1:196\n56#1:197,18\n56#1:234\n29#1:120\n30#1:139,2\n30#1:141,2\n30#1:147,11\n50#1:177,2\n50#1:179,2\n50#1:185,11\n56#1:215,2\n56#1:217,2\n56#1:223,11\n30#1:143,4\n50#1:181,4\n56#1:219,4\n*E\n"
    }
.end annotation


# static fields
.field private static _videoSettings:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getVideoSettings(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/VideoSettingsKt;->_videoSettings:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.VideoSettings"

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
    const/high16 v6, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x41800000    # 16.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v25, 0x3f800000    # 1.0f

    .line 83
    .line 84
    const/high16 v26, 0x3f800000    # 1.0f

    .line 85
    .line 86
    const v21, 0x3f0ccccd    # 0.55f

    .line 87
    .line 88
    .line 89
    const/16 v22, 0x0

    .line 90
    .line 91
    const/high16 v23, 0x3f800000    # 1.0f

    .line 92
    .line 93
    const v24, 0x3ee66666    # 0.45f

    .line 94
    .line 95
    .line 96
    move-object/from16 v20, v2

    .line 97
    .line 98
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v4, 0x40800000    # 4.0f

    .line 102
    .line 103
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v4, 0x40000000    # 2.0f

    .line 107
    .line 108
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v4, 0x40c00000    # 6.0f

    .line 112
    .line 113
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v25, -0x40000000    # -2.0f

    .line 117
    .line 118
    const/high16 v26, -0x40000000    # -2.0f

    .line 119
    .line 120
    const/16 v21, 0x0

    .line 121
    .line 122
    const v22, -0x40733333    # -1.1f

    .line 123
    .line 124
    .line 125
    const v23, -0x4099999a    # -0.9f

    .line 126
    .line 127
    .line 128
    const/high16 v24, -0x40000000    # -2.0f

    .line 129
    .line 130
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v4, 0x40400000    # 3.0f

    .line 134
    .line 135
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v25, 0x3f800000    # 1.0f

    .line 139
    .line 140
    const/high16 v26, 0x40c00000    # 6.0f

    .line 141
    .line 142
    const v21, 0x3ff33333    # 1.9f

    .line 143
    .line 144
    .line 145
    const/high16 v22, 0x40800000    # 4.0f

    .line 146
    .line 147
    const/high16 v23, 0x3f800000    # 1.0f

    .line 148
    .line 149
    const v24, 0x409ccccd    # 4.9f

    .line 150
    .line 151
    .line 152
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const/high16 v4, 0x41400000    # 12.0f

    .line 156
    .line 157
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const/high16 v25, 0x40000000    # 2.0f

    .line 161
    .line 162
    const/high16 v26, 0x40000000    # 2.0f

    .line 163
    .line 164
    const/16 v21, 0x0

    .line 165
    .line 166
    const v22, 0x3f8ccccd    # 1.1f

    .line 167
    .line 168
    .line 169
    const v23, 0x3f666666    # 0.9f

    .line 170
    .line 171
    .line 172
    const/high16 v24, 0x40000000    # 2.0f

    .line 173
    .line 174
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v4, 0x41100000    # 9.0f

    .line 178
    .line 179
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/high16 v4, -0x40000000    # -2.0f

    .line 183
    .line 184
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/16 v22, 0x0

    .line 200
    .line 201
    const/high16 v23, -0x40800000    # -1.0f

    .line 202
    .line 203
    const v24, -0x4119999a    # -0.45f

    .line 204
    .line 205
    .line 206
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v4, 0x40e00000    # 7.0f

    .line 210
    .line 211
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const/high16 v25, 0x40800000    # 4.0f

    .line 215
    .line 216
    const/high16 v26, 0x40c00000    # 6.0f

    .line 217
    .line 218
    const/high16 v21, 0x40400000    # 3.0f

    .line 219
    .line 220
    const v22, 0x40ce6666    # 6.45f

    .line 221
    .line 222
    .line 223
    const v23, 0x405ccccd    # 3.45f

    .line 224
    .line 225
    .line 226
    const/high16 v24, 0x40c00000    # 6.0f

    .line 227
    .line 228
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    const/16 v16, 0x3800

    .line 239
    .line 240
    const/16 v17, 0x0

    .line 241
    .line 242
    const/high16 v6, 0x3f800000    # 1.0f

    .line 243
    .line 244
    const/high16 v8, 0x3f800000    # 1.0f

    .line 245
    .line 246
    const/4 v7, 0x0

    .line 247
    const/high16 v9, 0x3f800000    # 1.0f

    .line 248
    .line 249
    const/high16 v12, 0x3f800000    # 1.0f

    .line 250
    .line 251
    const/4 v13, 0x0

    .line 252
    const/4 v14, 0x0

    .line 253
    const/4 v15, 0x0

    .line 254
    const-string v4, ""

    .line 255
    .line 256
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 257
    .line 258
    .line 259
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 260
    .line 261
    .line 262
    move-result v3

    .line 263
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 264
    .line 265
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 266
    .line 267
    .line 268
    move-result-wide v6

    .line 269
    const/4 v2, 0x0

    .line 270
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 274
    .line 275
    .line 276
    move-result v10

    .line 277
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 278
    .line 279
    .line 280
    move-result v11

    .line 281
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 284
    .line 285
    .line 286
    const/high16 v4, 0x41700000    # 15.0f

    .line 287
    .line 288
    const/high16 v6, 0x41400000    # 12.0f

    .line 289
    .line 290
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v4, -0x3f400000    # -6.0f

    .line 294
    .line 295
    const/high16 v6, -0x3f800000    # -4.0f

    .line 296
    .line 297
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/4 v4, 0x0

    .line 301
    const/high16 v6, 0x41000000    # 8.0f

    .line 302
    .line 303
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    const/high16 v6, 0x3f800000    # 1.0f

    .line 314
    .line 315
    const/4 v7, 0x0

    .line 316
    const-string v4, ""

    .line 317
    .line 318
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 319
    .line 320
    .line 321
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 322
    .line 323
    .line 324
    move-result v3

    .line 325
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 326
    .line 327
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 328
    .line 329
    .line 330
    move-result-wide v6

    .line 331
    const/4 v0, 0x0

    .line 332
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 336
    .line 337
    .line 338
    move-result v10

    .line 339
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 340
    .line 341
    .line 342
    move-result v11

    .line 343
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 346
    .line 347
    .line 348
    const v0, 0x419370a4    # 18.43f

    .line 349
    .line 350
    .line 351
    const v2, 0x41b5ae14    # 22.71f

    .line 352
    .line 353
    .line 354
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v17, 0x3c23d70a    # 0.01f

    .line 358
    .line 359
    .line 360
    const v18, -0x40a3d70a    # -0.86f

    .line 361
    .line 362
    .line 363
    const v13, 0x3cf5c28f    # 0.03f

    .line 364
    .line 365
    .line 366
    const v14, -0x416b851f    # -0.29f

    .line 367
    .line 368
    .line 369
    const v15, 0x3d23d70a    # 0.04f

    .line 370
    .line 371
    .line 372
    const v16, -0x40eb851f    # -0.58f

    .line 373
    .line 374
    .line 375
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v0, -0x40a66666    # -0.85f

    .line 379
    .line 380
    .line 381
    const v2, 0x3f88f5c3    # 1.07f

    .line 382
    .line 383
    .line 384
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v17, 0x3d75c28f    # 0.06f

    .line 388
    .line 389
    .line 390
    const v18, -0x415c28f6    # -0.32f

    .line 391
    .line 392
    .line 393
    const v13, 0x3dcccccd    # 0.1f

    .line 394
    .line 395
    .line 396
    const v14, -0x425c28f6    # -0.08f

    .line 397
    .line 398
    .line 399
    const v15, 0x3df5c28f    # 0.12f

    .line 400
    .line 401
    .line 402
    const v16, -0x41a8f5c3    # -0.21f

    .line 403
    .line 404
    .line 405
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v0, -0x401ae148    # -1.79f

    .line 409
    .line 410
    .line 411
    const v2, -0x407c28f6    # -1.03f

    .line 412
    .line 413
    .line 414
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const v17, -0x416147ae    # -0.31f

    .line 418
    .line 419
    .line 420
    const v18, -0x421eb852    # -0.11f

    .line 421
    .line 422
    .line 423
    const v13, -0x428a3d71    # -0.06f

    .line 424
    .line 425
    .line 426
    const v14, -0x421eb852    # -0.11f

    .line 427
    .line 428
    .line 429
    const v15, -0x41bd70a4    # -0.19f

    .line 430
    .line 431
    .line 432
    const v16, -0x41e66666    # -0.15f

    .line 433
    .line 434
    .line 435
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v0, 0x41a9d70a    # 21.23f

    .line 439
    .line 440
    .line 441
    const/high16 v2, 0x41700000    # 15.0f

    .line 442
    .line 443
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const/high16 v17, -0x40c00000    # -0.75f

    .line 447
    .line 448
    const v18, -0x4128f5c3    # -0.42f

    .line 449
    .line 450
    .line 451
    const v13, -0x41947ae1    # -0.23f

    .line 452
    .line 453
    .line 454
    const v14, -0x41d1eb85    # -0.17f

    .line 455
    .line 456
    .line 457
    const v15, -0x410a3d71    # -0.48f

    .line 458
    .line 459
    .line 460
    const v16, -0x416147ae    # -0.31f

    .line 461
    .line 462
    .line 463
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const v0, -0x4051eb85    # -1.36f

    .line 467
    .line 468
    .line 469
    const v2, -0x41b33333    # -0.2f

    .line 470
    .line 471
    .line 472
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const v17, 0x41a03d71    # 20.03f

    .line 476
    .line 477
    .line 478
    const/high16 v18, 0x41500000    # 13.0f

    .line 479
    .line 480
    const v13, 0x41a2147b    # 20.26f

    .line 481
    .line 482
    .line 483
    const v14, 0x415170a4    # 13.09f

    .line 484
    .line 485
    .line 486
    const v15, 0x41a147ae    # 20.16f

    .line 487
    .line 488
    .line 489
    const/high16 v16, 0x41500000    # 13.0f

    .line 490
    .line 491
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const v0, -0x3ffb851f    # -2.07f

    .line 495
    .line 496
    .line 497
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v17, -0x41800000    # -0.25f

    .line 501
    .line 502
    const v18, 0x3e570a3d    # 0.21f

    .line 503
    .line 504
    .line 505
    const v13, -0x420a3d71    # -0.12f

    .line 506
    .line 507
    .line 508
    const/4 v14, 0x0

    .line 509
    const v15, -0x41947ae1    # -0.23f

    .line 510
    .line 511
    .line 512
    const v16, 0x3db851ec    # 0.09f

    .line 513
    .line 514
    .line 515
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const v0, 0x3fae147b    # 1.36f

    .line 519
    .line 520
    .line 521
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const v17, -0x40c28f5c    # -0.74f

    .line 525
    .line 526
    .line 527
    const v18, 0x3ed70a3d    # 0.42f

    .line 528
    .line 529
    .line 530
    const v13, -0x417ae148    # -0.26f

    .line 531
    .line 532
    .line 533
    const v14, 0x3de147ae    # 0.11f

    .line 534
    .line 535
    .line 536
    const v15, -0x40fd70a4    # -0.51f

    .line 537
    .line 538
    .line 539
    const v16, 0x3e851eb8    # 0.26f

    .line 540
    .line 541
    .line 542
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const v0, -0x405c28f6    # -1.28f

    .line 546
    .line 547
    .line 548
    const/high16 v2, -0x41000000    # -0.5f

    .line 549
    .line 550
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const v17, -0x416147ae    # -0.31f

    .line 554
    .line 555
    .line 556
    const v18, 0x3de147ae    # 0.11f

    .line 557
    .line 558
    .line 559
    const v13, -0x420a3d71    # -0.12f

    .line 560
    .line 561
    .line 562
    const v14, -0x42b33333    # -0.05f

    .line 563
    .line 564
    .line 565
    const/high16 v15, -0x41800000    # -0.25f

    .line 566
    .line 567
    const/16 v16, 0x0

    .line 568
    .line 569
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const v0, 0x3fe51eb8    # 1.79f

    .line 573
    .line 574
    .line 575
    const v2, -0x407c28f6    # -1.03f

    .line 576
    .line 577
    .line 578
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const v17, 0x3d75c28f    # 0.06f

    .line 582
    .line 583
    .line 584
    const v18, 0x3ea3d70a    # 0.32f

    .line 585
    .line 586
    .line 587
    const v13, -0x428a3d71    # -0.06f

    .line 588
    .line 589
    .line 590
    const v14, 0x3de147ae    # 0.11f

    .line 591
    .line 592
    .line 593
    const v15, -0x42dc28f6    # -0.04f

    .line 594
    .line 595
    .line 596
    const v16, 0x3e75c28f    # 0.24f

    .line 597
    .line 598
    .line 599
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const v0, 0x3f5c28f6    # 0.86f

    .line 603
    .line 604
    .line 605
    const v2, 0x3f88f5c3    # 1.07f

    .line 606
    .line 607
    .line 608
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const v17, -0x43dc28f6    # -0.01f

    .line 612
    .line 613
    .line 614
    const v18, 0x3f5c28f6    # 0.86f

    .line 615
    .line 616
    .line 617
    const v13, -0x430a3d71    # -0.03f

    .line 618
    .line 619
    .line 620
    const v14, 0x3e947ae1    # 0.29f

    .line 621
    .line 622
    .line 623
    const v16, 0x3f147ae1    # 0.58f

    .line 624
    .line 625
    .line 626
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const v0, -0x40770a3d    # -1.07f

    .line 630
    .line 631
    .line 632
    const v2, 0x3f59999a    # 0.85f

    .line 633
    .line 634
    .line 635
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const v17, -0x428a3d71    # -0.06f

    .line 639
    .line 640
    .line 641
    const v18, 0x3ea3d70a    # 0.32f

    .line 642
    .line 643
    .line 644
    const v13, -0x42333333    # -0.1f

    .line 645
    .line 646
    .line 647
    const v14, 0x3da3d70a    # 0.08f

    .line 648
    .line 649
    .line 650
    const v15, -0x420a3d71    # -0.12f

    .line 651
    .line 652
    .line 653
    const v16, 0x3e570a3d    # 0.21f

    .line 654
    .line 655
    .line 656
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    const v0, 0x3f83d70a    # 1.03f

    .line 660
    .line 661
    .line 662
    const v2, 0x3fe51eb8    # 1.79f

    .line 663
    .line 664
    .line 665
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    const v17, 0x3e9eb852    # 0.31f

    .line 669
    .line 670
    .line 671
    const v18, 0x3de147ae    # 0.11f

    .line 672
    .line 673
    .line 674
    const v13, 0x3d75c28f    # 0.06f

    .line 675
    .line 676
    .line 677
    const v14, 0x3de147ae    # 0.11f

    .line 678
    .line 679
    .line 680
    const v15, 0x3e428f5c    # 0.19f

    .line 681
    .line 682
    .line 683
    const v16, 0x3e19999a    # 0.15f

    .line 684
    .line 685
    .line 686
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const v0, 0x3fa28f5c    # 1.27f

    .line 690
    .line 691
    .line 692
    const/high16 v2, -0x41000000    # -0.5f

    .line 693
    .line 694
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    const/high16 v17, 0x3f400000    # 0.75f

    .line 698
    .line 699
    const v18, 0x3ed70a3d    # 0.42f

    .line 700
    .line 701
    .line 702
    const v13, 0x3e6b851f    # 0.23f

    .line 703
    .line 704
    .line 705
    const v14, 0x3e2e147b    # 0.17f

    .line 706
    .line 707
    .line 708
    const v15, 0x3ef5c28f    # 0.48f

    .line 709
    .line 710
    .line 711
    const v16, 0x3e9eb852    # 0.31f

    .line 712
    .line 713
    .line 714
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 715
    .line 716
    .line 717
    const v0, 0x3e4ccccd    # 0.2f

    .line 718
    .line 719
    .line 720
    const v2, 0x3fae147b    # 1.36f

    .line 721
    .line 722
    .line 723
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 724
    .line 725
    .line 726
    const/high16 v17, 0x3e800000    # 0.25f

    .line 727
    .line 728
    const v18, 0x3e570a3d    # 0.21f

    .line 729
    .line 730
    .line 731
    const v13, 0x3ca3d70a    # 0.02f

    .line 732
    .line 733
    .line 734
    const v14, 0x3df5c28f    # 0.12f

    .line 735
    .line 736
    .line 737
    const v15, 0x3df5c28f    # 0.12f

    .line 738
    .line 739
    .line 740
    const v16, 0x3e570a3d    # 0.21f

    .line 741
    .line 742
    .line 743
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 744
    .line 745
    .line 746
    const v0, 0x40047ae1    # 2.07f

    .line 747
    .line 748
    .line 749
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    .line 752
    const v18, -0x41a8f5c3    # -0.21f

    .line 753
    .line 754
    .line 755
    const v13, 0x3df5c28f    # 0.12f

    .line 756
    .line 757
    .line 758
    const/4 v14, 0x0

    .line 759
    const v15, 0x3e6b851f    # 0.23f

    .line 760
    .line 761
    .line 762
    const v16, -0x4247ae14    # -0.09f

    .line 763
    .line 764
    .line 765
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 766
    .line 767
    .line 768
    const v0, 0x3e4ccccd    # 0.2f

    .line 769
    .line 770
    .line 771
    const v2, -0x4051eb85    # -1.36f

    .line 772
    .line 773
    .line 774
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 775
    .line 776
    .line 777
    const v17, 0x3f3d70a4    # 0.74f

    .line 778
    .line 779
    .line 780
    const v18, -0x4128f5c3    # -0.42f

    .line 781
    .line 782
    .line 783
    const v13, 0x3e851eb8    # 0.26f

    .line 784
    .line 785
    .line 786
    const v14, -0x421eb852    # -0.11f

    .line 787
    .line 788
    .line 789
    const v15, 0x3f028f5c    # 0.51f

    .line 790
    .line 791
    .line 792
    const v16, -0x417ae148    # -0.26f

    .line 793
    .line 794
    .line 795
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 796
    .line 797
    .line 798
    const v0, 0x3fa3d70a    # 1.28f

    .line 799
    .line 800
    .line 801
    const/high16 v2, 0x3f000000    # 0.5f

    .line 802
    .line 803
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 804
    .line 805
    .line 806
    const v17, 0x3e9eb852    # 0.31f

    .line 807
    .line 808
    .line 809
    const v18, -0x421eb852    # -0.11f

    .line 810
    .line 811
    .line 812
    const v13, 0x3df5c28f    # 0.12f

    .line 813
    .line 814
    .line 815
    const v14, 0x3d4ccccd    # 0.05f

    .line 816
    .line 817
    .line 818
    const/high16 v15, 0x3e800000    # 0.25f

    .line 819
    .line 820
    const/16 v16, 0x0

    .line 821
    .line 822
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 823
    .line 824
    .line 825
    const v0, 0x3f83d70a    # 1.03f

    .line 826
    .line 827
    .line 828
    const v2, -0x401ae148    # -1.79f

    .line 829
    .line 830
    .line 831
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 832
    .line 833
    .line 834
    const v17, -0x428a3d71    # -0.06f

    .line 835
    .line 836
    .line 837
    const v18, -0x415c28f6    # -0.32f

    .line 838
    .line 839
    .line 840
    const v13, 0x3d75c28f    # 0.06f

    .line 841
    .line 842
    .line 843
    const v14, -0x421eb852    # -0.11f

    .line 844
    .line 845
    .line 846
    const v15, 0x3d23d70a    # 0.04f

    .line 847
    .line 848
    .line 849
    const v16, -0x418a3d71    # -0.24f

    .line 850
    .line 851
    .line 852
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 853
    .line 854
    .line 855
    const v0, 0x419370a4    # 18.43f

    .line 856
    .line 857
    .line 858
    const v2, 0x41b5ae14    # 22.71f

    .line 859
    .line 860
    .line 861
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 862
    .line 863
    .line 864
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 865
    .line 866
    .line 867
    const/high16 v0, 0x41980000    # 19.0f

    .line 868
    .line 869
    const/high16 v2, 0x419c0000    # 19.5f

    .line 870
    .line 871
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 872
    .line 873
    .line 874
    const/high16 v17, -0x40400000    # -1.5f

    .line 875
    .line 876
    const/high16 v18, -0x40400000    # -1.5f

    .line 877
    .line 878
    const v13, -0x40ab851f    # -0.83f

    .line 879
    .line 880
    .line 881
    const/4 v14, 0x0

    .line 882
    const/high16 v15, -0x40400000    # -1.5f

    .line 883
    .line 884
    const v16, -0x40d47ae1    # -0.67f

    .line 885
    .line 886
    .line 887
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 888
    .line 889
    .line 890
    const/high16 v0, -0x40400000    # -1.5f

    .line 891
    .line 892
    const/high16 v2, -0x40400000    # -1.5f

    .line 893
    .line 894
    const v4, 0x3f2b851f    # 0.67f

    .line 895
    .line 896
    .line 897
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 898
    .line 899
    invoke-virtual {v12, v4, v0, v6, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 900
    .line 901
    .line 902
    const v0, 0x3f2b851f    # 0.67f

    .line 903
    .line 904
    .line 905
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 906
    .line 907
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 908
    .line 909
    .line 910
    const v0, 0x419ea3d7    # 19.83f

    .line 911
    .line 912
    .line 913
    const/high16 v2, 0x41980000    # 19.0f

    .line 914
    .line 915
    const/high16 v4, 0x419c0000    # 19.5f

    .line 916
    .line 917
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 918
    .line 919
    .line 920
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 921
    .line 922
    .line 923
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 924
    .line 925
    .line 926
    move-result-object v2

    .line 927
    const/16 v16, 0x3800

    .line 928
    .line 929
    const/16 v17, 0x0

    .line 930
    .line 931
    const/high16 v6, 0x3f800000    # 1.0f

    .line 932
    .line 933
    const/4 v7, 0x0

    .line 934
    const/high16 v12, 0x3f800000    # 1.0f

    .line 935
    .line 936
    const/4 v13, 0x0

    .line 937
    const/4 v15, 0x0

    .line 938
    const-string v4, ""

    .line 939
    .line 940
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 941
    .line 942
    .line 943
    move-result-object v0

    .line 944
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 945
    .line 946
    .line 947
    move-result-object v0

    .line 948
    sput-object v0, Landroidx/compose/material/icons/rounded/VideoSettingsKt;->_videoSettings:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 949
    .line 950
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 951
    .line 952
    .line 953
    return-object v0
.end method
