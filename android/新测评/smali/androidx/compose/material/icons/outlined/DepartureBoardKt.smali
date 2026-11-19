.class public final Landroidx/compose/material/icons/outlined/DepartureBoardKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_departureBoard",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "DepartureBoard",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getDepartureBoard",
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
        "SMAP\nDepartureBoard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DepartureBoard.kt\nandroidx/compose/material/icons/outlined/DepartureBoardKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,107:1\n212#2,12:108\n233#2,18:121\n253#2:158\n233#2,18:159\n253#2:196\n233#2,18:197\n253#2:234\n174#3:120\n705#4,2:139\n717#4,2:141\n719#4,11:147\n705#4,2:177\n717#4,2:179\n719#4,11:185\n705#4,2:215\n717#4,2:217\n719#4,11:223\n72#5,4:143\n72#5,4:181\n72#5,4:219\n*S KotlinDebug\n*F\n+ 1 DepartureBoard.kt\nandroidx/compose/material/icons/outlined/DepartureBoardKt\n*L\n29#1:108,12\n30#1:121,18\n30#1:158\n36#1:159,18\n36#1:196\n42#1:197,18\n42#1:234\n29#1:120\n30#1:139,2\n30#1:141,2\n30#1:147,11\n36#1:177,2\n36#1:179,2\n36#1:185,11\n42#1:215,2\n42#1:217,2\n42#1:223,11\n30#1:143,4\n36#1:181,4\n42#1:219,4\n*E\n"
    }
.end annotation


# static fields
.field private static _departureBoard:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDepartureBoard(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/DepartureBoardKt;->_departureBoard:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.DepartureBoard"

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
    const/high16 v4, 0x40b00000    # 5.5f

    .line 71
    .line 72
    const/high16 v6, 0x41840000    # 16.5f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/4 v4, 0x0

    .line 78
    const/high16 v6, -0x40400000    # -1.5f

    .line 79
    .line 80
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v26, 0x40400000    # 3.0f

    .line 84
    .line 85
    const/16 v27, 0x0

    .line 86
    .line 87
    const/high16 v21, 0x3fc00000    # 1.5f

    .line 88
    .line 89
    const/high16 v22, 0x3fc00000    # 1.5f

    .line 90
    .line 91
    const/16 v23, 0x0

    .line 92
    .line 93
    const/16 v24, 0x1

    .line 94
    .line 95
    const/16 v25, 0x1

    .line 96
    .line 97
    move-object/from16 v20, v2

    .line 98
    .line 99
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 103
    .line 104
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    const/16 v16, 0x3800

    .line 112
    .line 113
    const/16 v17, 0x0

    .line 114
    .line 115
    const/high16 v6, 0x3f800000    # 1.0f

    .line 116
    .line 117
    const/high16 v8, 0x3f800000    # 1.0f

    .line 118
    .line 119
    const/4 v7, 0x0

    .line 120
    const/high16 v9, 0x3f800000    # 1.0f

    .line 121
    .line 122
    const/high16 v12, 0x3f800000    # 1.0f

    .line 123
    .line 124
    const/4 v13, 0x0

    .line 125
    const/4 v14, 0x0

    .line 126
    const/4 v15, 0x0

    .line 127
    const-string v4, ""

    .line 128
    .line 129
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 130
    .line 131
    .line 132
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 137
    .line 138
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 139
    .line 140
    .line 141
    move-result-wide v6

    .line 142
    const/4 v2, 0x0

    .line 143
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 147
    .line 148
    .line 149
    move-result v10

    .line 150
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 151
    .line 152
    .line 153
    move-result v11

    .line 154
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 157
    .line 158
    .line 159
    const/high16 v4, 0x41480000    # 12.5f

    .line 160
    .line 161
    const/high16 v6, 0x41840000    # 16.5f

    .line 162
    .line 163
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/4 v4, 0x0

    .line 167
    const/high16 v6, -0x40400000    # -1.5f

    .line 168
    .line 169
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v26, 0x40400000    # 3.0f

    .line 173
    .line 174
    move-object/from16 v20, v2

    .line 175
    .line 176
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 180
    .line 181
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    const/high16 v6, 0x3f800000    # 1.0f

    .line 189
    .line 190
    const/4 v7, 0x0

    .line 191
    const-string v4, ""

    .line 192
    .line 193
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 194
    .line 195
    .line 196
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 197
    .line 198
    .line 199
    move-result v3

    .line 200
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 201
    .line 202
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 203
    .line 204
    .line 205
    move-result-wide v6

    .line 206
    const/4 v0, 0x0

    .line 207
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 211
    .line 212
    .line 213
    move-result v10

    .line 214
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 215
    .line 216
    .line 217
    move-result v11

    .line 218
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 221
    .line 222
    .line 223
    const/high16 v0, 0x41800000    # 16.0f

    .line 224
    .line 225
    const/high16 v2, 0x3f800000    # 1.0f

    .line 226
    .line 227
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v17, -0x3f480000    # -5.75f

    .line 231
    .line 232
    const v18, 0x404147ae    # 3.02f

    .line 233
    .line 234
    .line 235
    const v13, -0x3fe70a3d    # -2.39f

    .line 236
    .line 237
    .line 238
    const v15, -0x3f7051ec    # -4.49f

    .line 239
    .line 240
    .line 241
    const v16, 0x3f99999a    # 1.2f

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v17, 0x41100000    # 9.0f

    .line 248
    .line 249
    const/high16 v18, 0x40800000    # 4.0f

    .line 250
    .line 251
    const v13, 0x411d70a4    # 9.84f

    .line 252
    .line 253
    .line 254
    const v14, 0x408051ec    # 4.01f

    .line 255
    .line 256
    .line 257
    const v15, 0x4116e148    # 9.43f

    .line 258
    .line 259
    .line 260
    const/high16 v16, 0x40800000    # 4.0f

    .line 261
    .line 262
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v17, -0x3f000000    # -8.0f

    .line 266
    .line 267
    const v13, -0x3f728f5c    # -4.42f

    .line 268
    .line 269
    .line 270
    const/4 v14, 0x0

    .line 271
    const/high16 v15, -0x3f000000    # -8.0f

    .line 272
    .line 273
    const/high16 v16, 0x3f000000    # 0.5f

    .line 274
    .line 275
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const/high16 v0, 0x41200000    # 10.0f

    .line 279
    .line 280
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const/high16 v17, 0x3f800000    # 1.0f

    .line 284
    .line 285
    const v18, 0x400e147b    # 2.22f

    .line 286
    .line 287
    .line 288
    const/4 v13, 0x0

    .line 289
    const v14, 0x3f6147ae    # 0.88f

    .line 290
    .line 291
    .line 292
    const v15, 0x3ec7ae14    # 0.39f

    .line 293
    .line 294
    .line 295
    const v16, 0x3fd5c28f    # 1.67f

    .line 296
    .line 297
    .line 298
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const/high16 v0, 0x40000000    # 2.0f

    .line 302
    .line 303
    const/high16 v2, 0x41b00000    # 22.0f

    .line 304
    .line 305
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v18, 0x3f800000    # 1.0f

    .line 309
    .line 310
    const v14, 0x3f0ccccd    # 0.55f

    .line 311
    .line 312
    .line 313
    const v15, 0x3ee66666    # 0.45f

    .line 314
    .line 315
    .line 316
    const/high16 v16, 0x3f800000    # 1.0f

    .line 317
    .line 318
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v0, 0x3f800000    # 1.0f

    .line 322
    .line 323
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v18, -0x40800000    # -1.0f

    .line 327
    .line 328
    const v13, 0x3f0ccccd    # 0.55f

    .line 329
    .line 330
    .line 331
    const/4 v14, 0x0

    .line 332
    const/high16 v15, 0x3f800000    # 1.0f

    .line 333
    .line 334
    const v16, -0x4119999a    # -0.45f

    .line 335
    .line 336
    .line 337
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v0, -0x40800000    # -1.0f

    .line 341
    .line 342
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v0, 0x41000000    # 8.0f

    .line 346
    .line 347
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const/high16 v0, 0x3f800000    # 1.0f

    .line 351
    .line 352
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/high16 v18, 0x3f800000    # 1.0f

    .line 356
    .line 357
    const/4 v13, 0x0

    .line 358
    const v14, 0x3f0ccccd    # 0.55f

    .line 359
    .line 360
    .line 361
    const v15, 0x3ee66666    # 0.45f

    .line 362
    .line 363
    .line 364
    const/high16 v16, 0x3f800000    # 1.0f

    .line 365
    .line 366
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const/high16 v18, -0x40800000    # -1.0f

    .line 373
    .line 374
    const v13, 0x3f0ccccd    # 0.55f

    .line 375
    .line 376
    .line 377
    const/4 v14, 0x0

    .line 378
    const/high16 v15, 0x3f800000    # 1.0f

    .line 379
    .line 380
    const v16, -0x4119999a    # -0.45f

    .line 381
    .line 382
    .line 383
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v0, -0x401c28f6    # -1.78f

    .line 387
    .line 388
    .line 389
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v18, -0x3ff1eb85    # -2.22f

    .line 393
    .line 394
    .line 395
    const v13, 0x3f1c28f6    # 0.61f

    .line 396
    .line 397
    .line 398
    const v14, -0x40f33333    # -0.55f

    .line 399
    .line 400
    .line 401
    const v16, -0x40547ae1    # -1.34f

    .line 402
    .line 403
    .line 404
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v0, -0x3fbae148    # -3.08f

    .line 408
    .line 409
    .line 410
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v17, 0x40c00000    # 6.0f

    .line 414
    .line 415
    const v18, -0x3f228f5c    # -6.92f

    .line 416
    .line 417
    .line 418
    const v13, 0x4058f5c3    # 3.39f

    .line 419
    .line 420
    .line 421
    const v14, -0x41051eb8    # -0.49f

    .line 422
    .line 423
    .line 424
    const/high16 v15, 0x40c00000    # 6.0f

    .line 425
    .line 426
    const v16, -0x3fa70a3d    # -3.39f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v17, -0x3f200000    # -7.0f

    .line 433
    .line 434
    const/high16 v18, -0x3f200000    # -7.0f

    .line 435
    .line 436
    const/4 v13, 0x0

    .line 437
    const v14, -0x3f8851ec    # -3.87f

    .line 438
    .line 439
    .line 440
    const v15, -0x3fb7ae14    # -3.13f

    .line 441
    .line 442
    .line 443
    const/high16 v16, -0x3f200000    # -7.0f

    .line 444
    .line 445
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const/high16 v0, 0x41100000    # 9.0f

    .line 452
    .line 453
    const/high16 v2, 0x40c00000    # 6.0f

    .line 454
    .line 455
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const v0, 0x3e947ae1    # 0.29f

    .line 459
    .line 460
    .line 461
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const v17, -0x41a8f5c3    # -0.21f

    .line 465
    .line 466
    .line 467
    const v18, 0x3f7d70a4    # 0.99f

    .line 468
    .line 469
    .line 470
    const v13, -0x4247ae14    # -0.09f

    .line 471
    .line 472
    .line 473
    const v14, 0x3ea3d70a    # 0.32f

    .line 474
    .line 475
    .line 476
    const v15, -0x41dc28f6    # -0.16f

    .line 477
    .line 478
    .line 479
    const v16, 0x3f28f5c3    # 0.66f

    .line 480
    .line 481
    .line 482
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v0, 0x4055c28f    # 3.34f

    .line 486
    .line 487
    .line 488
    const v2, 0x40dfae14    # 6.99f

    .line 489
    .line 490
    .line 491
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const/high16 v17, 0x41100000    # 9.0f

    .line 495
    .line 496
    const/high16 v18, 0x40c00000    # 6.0f

    .line 497
    .line 498
    const v13, 0x4078f5c3    # 3.89f

    .line 499
    .line 500
    .line 501
    const v14, 0x40ceb852    # 6.46f

    .line 502
    .line 503
    .line 504
    const v15, 0x40a9eb85    # 5.31f

    .line 505
    .line 506
    .line 507
    const/high16 v16, 0x40c00000    # 6.0f

    .line 508
    .line 509
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const v0, 0x410fd70a    # 8.99f

    .line 516
    .line 517
    .line 518
    const/high16 v2, 0x40400000    # 3.0f

    .line 519
    .line 520
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const v0, 0x40c28f5c    # 6.08f

    .line 524
    .line 525
    .line 526
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const v17, 0x3f970a3d    # 1.18f

    .line 530
    .line 531
    .line 532
    const v18, 0x4040a3d7    # 3.01f

    .line 533
    .line 534
    .line 535
    const v13, 0x3e23d70a    # 0.16f

    .line 536
    .line 537
    .line 538
    const v14, 0x3f8e147b    # 1.11f

    .line 539
    .line 540
    .line 541
    const v15, 0x3f11eb85    # 0.57f

    .line 542
    .line 543
    .line 544
    const v16, 0x400851ec    # 2.13f

    .line 545
    .line 546
    .line 547
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const/high16 v0, 0x41400000    # 12.0f

    .line 551
    .line 552
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const v0, 0x410fd70a    # 8.99f

    .line 556
    .line 557
    .line 558
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const/high16 v0, 0x41900000    # 18.0f

    .line 565
    .line 566
    const/high16 v2, 0x41700000    # 15.0f

    .line 567
    .line 568
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const v17, -0x4151eb85    # -0.34f

    .line 572
    .line 573
    .line 574
    const v18, 0x3f3ae148    # 0.73f

    .line 575
    .line 576
    .line 577
    const/4 v13, 0x0

    .line 578
    const v14, 0x3ebd70a4    # 0.37f

    .line 579
    .line 580
    .line 581
    const v15, -0x41a8f5c3    # -0.21f

    .line 582
    .line 583
    .line 584
    const v16, 0x3f1eb852    # 0.62f

    .line 585
    .line 586
    .line 587
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const v0, 0x3e8a3d71    # 0.27f

    .line 591
    .line 592
    .line 593
    const v2, -0x416b851f    # -0.29f

    .line 594
    .line 595
    .line 596
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const v0, 0x406851ec    # 3.63f

    .line 600
    .line 601
    .line 602
    const/high16 v2, 0x41980000    # 19.0f

    .line 603
    .line 604
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const v0, -0x4175c28f    # -0.27f

    .line 608
    .line 609
    .line 610
    const v2, -0x416b851f    # -0.29f

    .line 611
    .line 612
    .line 613
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const/high16 v17, 0x40400000    # 3.0f

    .line 617
    .line 618
    const/high16 v18, 0x41900000    # 18.0f

    .line 619
    .line 620
    const v13, 0x404d70a4    # 3.21f

    .line 621
    .line 622
    .line 623
    const v14, 0x4194f5c3    # 18.62f

    .line 624
    .line 625
    .line 626
    const/high16 v15, 0x40400000    # 3.0f

    .line 627
    .line 628
    const v16, 0x4192f5c3    # 18.37f

    .line 629
    .line 630
    .line 631
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const/high16 v0, -0x3f800000    # -4.0f

    .line 635
    .line 636
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const v0, 0x41168f5c    # 9.41f

    .line 640
    .line 641
    .line 642
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    const v17, 0x4025c28f    # 2.59f

    .line 646
    .line 647
    .line 648
    const v18, 0x3f6b851f    # 0.92f

    .line 649
    .line 650
    .line 651
    const v13, 0x3f47ae14    # 0.78f

    .line 652
    .line 653
    .line 654
    const v14, 0x3ef0a3d7    # 0.47f

    .line 655
    .line 656
    .line 657
    const v15, 0x3fd33333    # 1.65f

    .line 658
    .line 659
    .line 660
    const v16, 0x3f4a3d71    # 0.79f

    .line 661
    .line 662
    .line 663
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 664
    .line 665
    .line 666
    const/high16 v0, 0x41900000    # 18.0f

    .line 667
    .line 668
    const/high16 v2, 0x41700000    # 15.0f

    .line 669
    .line 670
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 671
    .line 672
    .line 673
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const/high16 v0, 0x41500000    # 13.0f

    .line 677
    .line 678
    const/high16 v2, 0x41800000    # 16.0f

    .line 679
    .line 680
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 681
    .line 682
    .line 683
    const/high16 v17, -0x3f600000    # -5.0f

    .line 684
    .line 685
    const/high16 v18, -0x3f600000    # -5.0f

    .line 686
    .line 687
    const v13, -0x3fcf5c29    # -2.76f

    .line 688
    .line 689
    .line 690
    const/4 v14, 0x0

    .line 691
    const/high16 v15, -0x3f600000    # -5.0f

    .line 692
    .line 693
    const v16, -0x3ff0a3d7    # -2.24f

    .line 694
    .line 695
    .line 696
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    .line 699
    const v0, 0x400f5c29    # 2.24f

    .line 700
    .line 701
    .line 702
    const/high16 v2, -0x3f600000    # -5.0f

    .line 703
    .line 704
    const/high16 v4, 0x40a00000    # 5.0f

    .line 705
    .line 706
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    const/high16 v2, 0x40a00000    # 5.0f

    .line 710
    .line 711
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    const v0, -0x3ff0a3d7    # -2.24f

    .line 715
    .line 716
    .line 717
    const/high16 v2, -0x3f600000    # -5.0f

    .line 718
    .line 719
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 723
    .line 724
    .line 725
    const/high16 v0, 0x40800000    # 4.0f

    .line 726
    .line 727
    const/high16 v2, 0x41840000    # 16.5f

    .line 728
    .line 729
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    const/high16 v2, 0x41700000    # 15.0f

    .line 733
    .line 734
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 735
    .line 736
    .line 737
    const/high16 v0, 0x40a00000    # 5.0f

    .line 738
    .line 739
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    const v0, 0x4067ae14    # 3.62f

    .line 743
    .line 744
    .line 745
    const v2, 0x400a3d71    # 2.16f

    .line 746
    .line 747
    .line 748
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 749
    .line 750
    .line 751
    const/high16 v0, 0x3f400000    # 0.75f

    .line 752
    .line 753
    const v2, -0x40628f5c    # -1.23f

    .line 754
    .line 755
    .line 756
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 757
    .line 758
    .line 759
    const v0, -0x3fc851ec    # -2.87f

    .line 760
    .line 761
    .line 762
    const v2, -0x4028f5c3    # -1.68f

    .line 763
    .line 764
    .line 765
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 766
    .line 767
    .line 768
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 769
    .line 770
    .line 771
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 772
    .line 773
    .line 774
    move-result-object v2

    .line 775
    const/16 v16, 0x3800

    .line 776
    .line 777
    const/16 v17, 0x0

    .line 778
    .line 779
    const/high16 v6, 0x3f800000    # 1.0f

    .line 780
    .line 781
    const/4 v7, 0x0

    .line 782
    const/high16 v12, 0x3f800000    # 1.0f

    .line 783
    .line 784
    const/4 v13, 0x0

    .line 785
    const/4 v15, 0x0

    .line 786
    const-string v4, ""

    .line 787
    .line 788
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 789
    .line 790
    .line 791
    move-result-object v0

    .line 792
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 793
    .line 794
    .line 795
    move-result-object v0

    .line 796
    sput-object v0, Landroidx/compose/material/icons/outlined/DepartureBoardKt;->_departureBoard:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 797
    .line 798
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 799
    .line 800
    .line 801
    return-object v0
.end method
