.class public final Landroidx/compose/material/icons/twotone/TableRestaurantKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_tableRestaurant",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "TableRestaurant",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getTableRestaurant",
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
        "SMAP\nTableRestaurant.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TableRestaurant.kt\nandroidx/compose/material/icons/twotone/TableRestaurantKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,74:1\n212#2,12:75\n233#2,18:88\n253#2:125\n233#2,18:126\n253#2:163\n174#3:87\n705#4,2:106\n717#4,2:108\n719#4,11:114\n705#4,2:144\n717#4,2:146\n719#4,11:152\n72#5,4:110\n72#5,4:148\n*S KotlinDebug\n*F\n+ 1 TableRestaurant.kt\nandroidx/compose/material/icons/twotone/TableRestaurantKt\n*L\n29#1:75,12\n30#1:88,18\n30#1:125\n37#1:126,18\n37#1:163\n29#1:87\n30#1:106,2\n30#1:108,2\n30#1:114,11\n37#1:144,2\n37#1:146,2\n37#1:152,11\n30#1:110,4\n37#1:148,4\n*E\n"
    }
.end annotation


# static fields
.field private static _tableRestaurant:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTableRestaurant(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 20

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/TableRestaurantKt;->_tableRestaurant:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.TableRestaurant"

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
    const v4, 0x40a5c28f    # 5.18f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x40c00000    # 6.0f

    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v4, 0x40400000    # 3.0f

    .line 79
    .line 80
    const v6, -0x40a66666    # -0.85f

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const v4, 0x417570a4    # 15.34f

    .line 87
    .line 88
    .line 89
    const/4 v6, 0x0

    .line 90
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 94
    .line 95
    const v6, -0x40a66666    # -0.85f

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    const/16 v16, 0x3800

    .line 109
    .line 110
    const/16 v17, 0x0

    .line 111
    .line 112
    const v6, 0x3e99999a    # 0.3f

    .line 113
    .line 114
    .line 115
    const v8, 0x3e99999a    # 0.3f

    .line 116
    .line 117
    .line 118
    const/4 v7, 0x0

    .line 119
    const/high16 v9, 0x3f800000    # 1.0f

    .line 120
    .line 121
    const/high16 v12, 0x3f800000    # 1.0f

    .line 122
    .line 123
    const/4 v13, 0x0

    .line 124
    const/4 v14, 0x0

    .line 125
    const/4 v15, 0x0

    .line 126
    const-string v4, ""

    .line 127
    .line 128
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 129
    .line 130
    .line 131
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 136
    .line 137
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 138
    .line 139
    .line 140
    move-result-wide v6

    .line 141
    const/4 v0, 0x0

    .line 142
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 146
    .line 147
    .line 148
    move-result v10

    .line 149
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 150
    .line 151
    .line 152
    move-result v11

    .line 153
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 156
    .line 157
    .line 158
    const v0, 0x41afae14    # 21.96f

    .line 159
    .line 160
    .line 161
    const v2, 0x411bae14    # 9.73f

    .line 162
    .line 163
    .line 164
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v0, -0x3f600000    # -5.0f

    .line 168
    .line 169
    const v2, -0x4048f5c3    # -1.43f

    .line 170
    .line 171
    .line 172
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v17, 0x419c8f5c    # 19.57f

    .line 176
    .line 177
    .line 178
    const/high16 v18, 0x40800000    # 4.0f

    .line 179
    .line 180
    const v13, 0x41a347ae    # 20.41f

    .line 181
    .line 182
    .line 183
    const v14, 0x4089999a    # 4.3f

    .line 184
    .line 185
    .line 186
    const v15, 0x41a028f6    # 20.02f

    .line 187
    .line 188
    .line 189
    const/high16 v16, 0x40800000    # 4.0f

    .line 190
    .line 191
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v0, 0x408dc28f    # 4.43f

    .line 195
    .line 196
    .line 197
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v17, 0x405e147b    # 3.47f

    .line 201
    .line 202
    .line 203
    const v18, 0x40975c29    # 4.73f

    .line 204
    .line 205
    .line 206
    const v13, 0x407eb852    # 3.98f

    .line 207
    .line 208
    .line 209
    const/high16 v14, 0x40800000    # 4.0f

    .line 210
    .line 211
    const v15, 0x4065c28f    # 3.59f

    .line 212
    .line 213
    .line 214
    const v16, 0x4089999a    # 4.3f

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v0, 0x40a00000    # 5.0f

    .line 221
    .line 222
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v17, 0x40400000    # 3.0f

    .line 226
    .line 227
    const/high16 v18, 0x41300000    # 11.0f

    .line 228
    .line 229
    const v13, 0x3fee147b    # 1.86f

    .line 230
    .line 231
    .line 232
    const v14, 0x4125c28f    # 10.36f

    .line 233
    .line 234
    .line 235
    const v15, 0x4015c28f    # 2.34f

    .line 236
    .line 237
    .line 238
    const/high16 v16, 0x41300000    # 11.0f

    .line 239
    .line 240
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v0, 0x400ccccd    # 2.2f

    .line 244
    .line 245
    .line 246
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v0, 0x40800000    # 4.0f

    .line 250
    .line 251
    const/high16 v2, 0x41a00000    # 20.0f

    .line 252
    .line 253
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const/high16 v0, 0x40000000    # 2.0f

    .line 257
    .line 258
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v0, 0x3f2b851f    # 0.67f

    .line 262
    .line 263
    .line 264
    const/high16 v2, -0x3f600000    # -5.0f

    .line 265
    .line 266
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v0, 0x412ab852    # 10.67f

    .line 270
    .line 271
    .line 272
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v0, 0x41900000    # 18.0f

    .line 276
    .line 277
    const/high16 v2, 0x41a00000    # 20.0f

    .line 278
    .line 279
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v0, 0x40000000    # 2.0f

    .line 283
    .line 284
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const v0, -0x40666666    # -1.2f

    .line 288
    .line 289
    .line 290
    const/high16 v2, -0x3ef00000    # -9.0f

    .line 291
    .line 292
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v0, 0x41a80000    # 21.0f

    .line 296
    .line 297
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v17, 0x41afae14    # 21.96f

    .line 301
    .line 302
    .line 303
    const v18, 0x411bae14    # 9.73f

    .line 304
    .line 305
    .line 306
    const v13, 0x41ad47ae    # 21.66f

    .line 307
    .line 308
    .line 309
    const/high16 v14, 0x41300000    # 11.0f

    .line 310
    .line 311
    const v15, 0x41b11eb8    # 22.14f

    .line 312
    .line 313
    .line 314
    const v16, 0x4125c28f    # 10.36f

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const/high16 v0, 0x41500000    # 13.0f

    .line 324
    .line 325
    const v2, 0x40ddc28f    # 6.93f

    .line 326
    .line 327
    .line 328
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v0, -0x40000000    # -2.0f

    .line 332
    .line 333
    const v2, 0x3e8a3d71    # 0.27f

    .line 334
    .line 335
    .line 336
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v0, 0x4119999a    # 9.6f

    .line 340
    .line 341
    .line 342
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const v0, 0x3e8a3d71    # 0.27f

    .line 346
    .line 347
    .line 348
    const/high16 v2, 0x40000000    # 2.0f

    .line 349
    .line 350
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v0, 0x40ddc28f    # 6.93f

    .line 354
    .line 355
    .line 356
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v0, 0x41100000    # 9.0f

    .line 363
    .line 364
    const v2, 0x408a8f5c    # 4.33f

    .line 365
    .line 366
    .line 367
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v0, 0x3f5c28f6    # 0.86f

    .line 371
    .line 372
    .line 373
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 374
    .line 375
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v0, 0x415a147b    # 13.63f

    .line 379
    .line 380
    .line 381
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const v0, 0x3f5c28f6    # 0.86f

    .line 385
    .line 386
    .line 387
    const/high16 v2, 0x40400000    # 3.0f

    .line 388
    .line 389
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v0, 0x408a8f5c    # 4.33f

    .line 393
    .line 394
    .line 395
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 402
    .line 403
    .line 404
    move-result-object v2

    .line 405
    const/16 v16, 0x3800

    .line 406
    .line 407
    const/16 v17, 0x0

    .line 408
    .line 409
    const/high16 v6, 0x3f800000    # 1.0f

    .line 410
    .line 411
    const/high16 v8, 0x3f800000    # 1.0f

    .line 412
    .line 413
    const/4 v7, 0x0

    .line 414
    const/high16 v12, 0x3f800000    # 1.0f

    .line 415
    .line 416
    const/4 v13, 0x0

    .line 417
    const/4 v14, 0x0

    .line 418
    const/4 v15, 0x0

    .line 419
    const-string v4, ""

    .line 420
    .line 421
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    sput-object v0, Landroidx/compose/material/icons/twotone/TableRestaurantKt;->_tableRestaurant:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 430
    .line 431
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 432
    .line 433
    .line 434
    return-object v0
.end method
