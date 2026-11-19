.class public final Landroidx/compose/material/icons/twotone/VideoStableKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_videoStable",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "VideoStable",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getVideoStable",
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
        "SMAP\nVideoStable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoStable.kt\nandroidx/compose/material/icons/twotone/VideoStableKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,74:1\n212#2,12:75\n233#2,18:88\n253#2:125\n233#2,18:126\n253#2:163\n174#3:87\n705#4,2:106\n717#4,2:108\n719#4,11:114\n705#4,2:144\n717#4,2:146\n719#4,11:152\n72#5,4:110\n72#5,4:148\n*S KotlinDebug\n*F\n+ 1 VideoStable.kt\nandroidx/compose/material/icons/twotone/VideoStableKt\n*L\n29#1:75,12\n30#1:88,18\n30#1:125\n37#1:126,18\n37#1:163\n29#1:87\n30#1:106,2\n30#1:108,2\n30#1:114,11\n37#1:144,2\n37#1:146,2\n37#1:152,11\n30#1:110,4\n37#1:148,4\n*E\n"
    }
.end annotation


# static fields
.field private static _videoStable:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getVideoStable(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 21

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/VideoStableKt;->_videoStable:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.VideoStable"

    .line 25
    .line 26
    const/high16 v5, 0x41c00000    # 24.0f

    .line 27
    .line 28
    const/high16 v6, 0x41c00000    # 24.0f

    .line 29
    .line 30
    const-wide/16 v7, 0x0

    .line 31
    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v10, 0x0

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
    new-instance v4, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const v6, 0x40e20419    # 7.063f

    .line 71
    .line 72
    .line 73
    const v7, 0x41551aa0    # 13.319f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v6, 0x3fa8f5c3    # 1.32f

    .line 80
    .line 81
    .line 82
    const v7, -0x3f625e35    # -4.926f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v6, 0x4108ed91    # 8.558f

    .line 89
    .line 90
    .line 91
    const v7, 0x4012d0e5    # 2.294f

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v6, -0x40570a3d    # -1.32f

    .line 98
    .line 99
    .line 100
    const v7, 0x409da1cb    # 4.926f

    .line 101
    .line 102
    .line 103
    invoke-virtual {v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    const/16 v16, 0x3800

    .line 114
    .line 115
    const/16 v17, 0x0

    .line 116
    .line 117
    move-object v6, v2

    .line 118
    move-object v2, v4

    .line 119
    const-string v4, ""

    .line 120
    .line 121
    move-object v7, v6

    .line 122
    const v6, 0x3e99999a    # 0.3f

    .line 123
    .line 124
    .line 125
    move-object v8, v7

    .line 126
    const/4 v7, 0x0

    .line 127
    move-object v9, v8

    .line 128
    const v8, 0x3e99999a    # 0.3f

    .line 129
    .line 130
    .line 131
    move-object v12, v9

    .line 132
    const/high16 v9, 0x3f800000    # 1.0f

    .line 133
    .line 134
    move-object v13, v12

    .line 135
    const/high16 v12, 0x3f800000    # 1.0f

    .line 136
    .line 137
    move-object v14, v13

    .line 138
    const/4 v13, 0x0

    .line 139
    move-object v15, v14

    .line 140
    const/4 v14, 0x0

    .line 141
    move-object/from16 v20, v15

    .line 142
    .line 143
    const/4 v15, 0x0

    .line 144
    move-object/from16 p0, v0

    .line 145
    .line 146
    move-object/from16 v0, v20

    .line 147
    .line 148
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 149
    .line 150
    .line 151
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 156
    .line 157
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 158
    .line 159
    .line 160
    move-result-wide v6

    .line 161
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 165
    .line 166
    .line 167
    move-result v10

    .line 168
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 169
    .line 170
    .line 171
    move-result v11

    .line 172
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 175
    .line 176
    .line 177
    const/high16 v0, 0x41a00000    # 20.0f

    .line 178
    .line 179
    const/high16 v2, 0x40800000    # 4.0f

    .line 180
    .line 181
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v12, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v17, 0x40000000    # 2.0f

    .line 188
    .line 189
    const/high16 v18, 0x40c00000    # 6.0f

    .line 190
    .line 191
    const v13, 0x4039999a    # 2.9f

    .line 192
    .line 193
    .line 194
    const/high16 v14, 0x40800000    # 4.0f

    .line 195
    .line 196
    const/high16 v15, 0x40000000    # 2.0f

    .line 197
    .line 198
    const v16, 0x409ccccd    # 4.9f

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v4, 0x41400000    # 12.0f

    .line 205
    .line 206
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v18, 0x40000000    # 2.0f

    .line 210
    .line 211
    const/4 v13, 0x0

    .line 212
    const v14, 0x3f8ccccd    # 1.1f

    .line 213
    .line 214
    .line 215
    const v15, 0x3f666666    # 0.9f

    .line 216
    .line 217
    .line 218
    const/high16 v16, 0x40000000    # 2.0f

    .line 219
    .line 220
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v4, 0x41800000    # 16.0f

    .line 224
    .line 225
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v18, -0x40000000    # -2.0f

    .line 229
    .line 230
    const v13, 0x3f8ccccd    # 1.1f

    .line 231
    .line 232
    .line 233
    const/4 v14, 0x0

    .line 234
    const/high16 v15, 0x40000000    # 2.0f

    .line 235
    .line 236
    const v16, -0x4099999a    # -0.9f

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v4, 0x40c00000    # 6.0f

    .line 243
    .line 244
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v17, 0x41a00000    # 20.0f

    .line 248
    .line 249
    const/high16 v18, 0x40800000    # 4.0f

    .line 250
    .line 251
    const/high16 v13, 0x41b00000    # 22.0f

    .line 252
    .line 253
    const v14, 0x409ccccd    # 4.9f

    .line 254
    .line 255
    .line 256
    const v15, 0x41a8cccd    # 21.1f

    .line 257
    .line 258
    .line 259
    const/high16 v16, 0x40800000    # 4.0f

    .line 260
    .line 261
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/high16 v6, 0x41900000    # 18.0f

    .line 268
    .line 269
    invoke-virtual {v12, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v7, 0x403ccccd    # 2.95f

    .line 276
    .line 277
    .line 278
    invoke-virtual {v12, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v7, -0x3feae148    # -2.33f

    .line 282
    .line 283
    .line 284
    const v8, 0x410bae14    # 8.73f

    .line 285
    .line 286
    .line 287
    invoke-virtual {v12, v7, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v7, 0x41868f5c    # 16.82f

    .line 291
    .line 292
    .line 293
    invoke-virtual {v12, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v12, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v2, 0x4179eb85    # 15.62f

    .line 303
    .line 304
    .line 305
    const v7, 0x4179c28f    # 15.61f

    .line 306
    .line 307
    .line 308
    invoke-virtual {v12, v2, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v8, -0x3ef73333    # -8.55f

    .line 312
    .line 313
    .line 314
    const v9, -0x3fed70a4    # -2.29f

    .line 315
    .line 316
    .line 317
    invoke-virtual {v12, v8, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v8, 0x3fa7ae14    # 1.31f

    .line 321
    .line 322
    .line 323
    const v9, -0x3f628f5c    # -4.92f

    .line 324
    .line 325
    .line 326
    invoke-virtual {v12, v8, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v8, 0x4108f5c3    # 8.56f

    .line 330
    .line 331
    .line 332
    const v9, 0x40128f5c    # 2.29f

    .line 333
    .line 334
    .line 335
    invoke-virtual {v12, v8, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v12, v2, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v12, v0, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v2, -0x3fc33333    # -2.95f

    .line 348
    .line 349
    .line 350
    invoke-virtual {v12, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v2, 0x4015c28f    # 2.34f

    .line 354
    .line 355
    .line 356
    const v7, -0x3ef451ec    # -8.73f

    .line 357
    .line 358
    .line 359
    invoke-virtual {v12, v2, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v2, 0x40e5c28f    # 7.18f

    .line 363
    .line 364
    .line 365
    invoke-virtual {v12, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v12, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 378
    .line 379
    .line 380
    move-result-object v2

    .line 381
    const/16 v16, 0x3800

    .line 382
    .line 383
    const/16 v17, 0x0

    .line 384
    .line 385
    const-string v4, ""

    .line 386
    .line 387
    const/high16 v6, 0x3f800000    # 1.0f

    .line 388
    .line 389
    const/4 v7, 0x0

    .line 390
    const/high16 v8, 0x3f800000    # 1.0f

    .line 391
    .line 392
    const/high16 v9, 0x3f800000    # 1.0f

    .line 393
    .line 394
    const/high16 v12, 0x3f800000    # 1.0f

    .line 395
    .line 396
    const/4 v13, 0x0

    .line 397
    const/4 v14, 0x0

    .line 398
    const/4 v15, 0x0

    .line 399
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    sput-object v0, Landroidx/compose/material/icons/twotone/VideoStableKt;->_videoStable:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 408
    .line 409
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 410
    .line 411
    .line 412
    return-object v0
.end method
