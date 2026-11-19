.class public final Landroidx/compose/material/icons/rounded/ScreenSearchDesktopKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_screenSearchDesktop",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "ScreenSearchDesktop",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getScreenSearchDesktop",
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
        "SMAP\nScreenSearchDesktop.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenSearchDesktop.kt\nandroidx/compose/material/icons/rounded/ScreenSearchDesktopKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,73:1\n212#2,12:74\n233#2,18:87\n253#2:124\n233#2,18:125\n253#2:162\n233#2,18:163\n253#2:200\n174#3:86\n705#4,2:105\n717#4,2:107\n719#4,11:113\n705#4,2:143\n717#4,2:145\n719#4,11:151\n705#4,2:181\n717#4,2:183\n719#4,11:189\n72#5,4:109\n72#5,4:147\n72#5,4:185\n*S KotlinDebug\n*F\n+ 1 ScreenSearchDesktop.kt\nandroidx/compose/material/icons/rounded/ScreenSearchDesktopKt\n*L\n29#1:74,12\n30#1:87,18\n30#1:124\n40#1:125,18\n40#1:162\n62#1:163,18\n62#1:200\n29#1:86\n30#1:105,2\n30#1:107,2\n30#1:113,11\n40#1:143,2\n40#1:145,2\n40#1:151,11\n62#1:181,2\n62#1:183,2\n62#1:189,11\n30#1:109,4\n40#1:147,4\n62#1:185,4\n*E\n"
    }
.end annotation


# static fields
.field private static _screenSearchDesktop:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getScreenSearchDesktop(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ScreenSearchDesktopKt;->_screenSearchDesktop:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.ScreenSearchDesktop"

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
    const/high16 v4, 0x41980000    # 19.0f

    .line 71
    .line 72
    const/high16 v6, 0x41b00000    # 22.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40000000    # 2.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v25, -0x40800000    # -1.0f

    .line 83
    .line 84
    const/high16 v26, 0x3f800000    # 1.0f

    .line 85
    .line 86
    const v21, -0x40f33333    # -0.55f

    .line 87
    .line 88
    .line 89
    const/16 v22, 0x0

    .line 90
    .line 91
    const/high16 v23, -0x40800000    # -1.0f

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
    const/high16 v25, 0x3f800000    # 1.0f

    .line 102
    .line 103
    const/16 v21, 0x0

    .line 104
    .line 105
    const v22, 0x3f0ccccd    # 0.55f

    .line 106
    .line 107
    .line 108
    const v23, 0x3ee66666    # 0.45f

    .line 109
    .line 110
    .line 111
    const/high16 v24, 0x3f800000    # 1.0f

    .line 112
    .line 113
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v4, 0x41a00000    # 20.0f

    .line 117
    .line 118
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v26, -0x40800000    # -1.0f

    .line 122
    .line 123
    const v21, 0x3f0ccccd    # 0.55f

    .line 124
    .line 125
    .line 126
    const/16 v22, 0x0

    .line 127
    .line 128
    const/high16 v23, 0x3f800000    # 1.0f

    .line 129
    .line 130
    const v24, -0x4119999a    # -0.45f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v25, 0x41b00000    # 22.0f

    .line 137
    .line 138
    const/high16 v26, 0x41980000    # 19.0f

    .line 139
    .line 140
    const/high16 v21, 0x41b80000    # 23.0f

    .line 141
    .line 142
    const v22, 0x419b999a    # 19.45f

    .line 143
    .line 144
    .line 145
    const v23, 0x41b46666    # 22.55f

    .line 146
    .line 147
    .line 148
    const/high16 v24, 0x41980000    # 19.0f

    .line 149
    .line 150
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    const/16 v16, 0x3800

    .line 161
    .line 162
    const/16 v17, 0x0

    .line 163
    .line 164
    const/high16 v6, 0x3f800000    # 1.0f

    .line 165
    .line 166
    const/high16 v8, 0x3f800000    # 1.0f

    .line 167
    .line 168
    const/4 v7, 0x0

    .line 169
    const/high16 v9, 0x3f800000    # 1.0f

    .line 170
    .line 171
    const/high16 v12, 0x3f800000    # 1.0f

    .line 172
    .line 173
    const/4 v13, 0x0

    .line 174
    const/4 v14, 0x0

    .line 175
    const/4 v15, 0x0

    .line 176
    const-string v4, ""

    .line 177
    .line 178
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 179
    .line 180
    .line 181
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 186
    .line 187
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 188
    .line 189
    .line 190
    move-result-wide v6

    .line 191
    const/4 v2, 0x0

    .line 192
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 196
    .line 197
    .line 198
    move-result v10

    .line 199
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 200
    .line 201
    .line 202
    move-result v11

    .line 203
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 206
    .line 207
    .line 208
    const/high16 v4, 0x41900000    # 18.0f

    .line 209
    .line 210
    const/high16 v6, 0x40800000    # 4.0f

    .line 211
    .line 212
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v4, 0x41800000    # 16.0f

    .line 216
    .line 217
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v25, 0x3ffeb852    # 1.99f

    .line 221
    .line 222
    .line 223
    const/high16 v26, -0x40000000    # -2.0f

    .line 224
    .line 225
    const v21, 0x3f8ccccd    # 1.1f

    .line 226
    .line 227
    .line 228
    const/16 v22, 0x0

    .line 229
    .line 230
    const v23, 0x3ffeb852    # 1.99f

    .line 231
    .line 232
    .line 233
    const v24, -0x4099999a    # -0.9f

    .line 234
    .line 235
    .line 236
    move-object/from16 v20, v2

    .line 237
    .line 238
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const/high16 v4, 0x40a00000    # 5.0f

    .line 242
    .line 243
    const/high16 v6, 0x41b00000    # 22.0f

    .line 244
    .line 245
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const/high16 v25, -0x40000000    # -2.0f

    .line 249
    .line 250
    const/16 v21, 0x0

    .line 251
    .line 252
    const v22, -0x40733333    # -1.1f

    .line 253
    .line 254
    .line 255
    const v23, -0x4099999a    # -0.9f

    .line 256
    .line 257
    .line 258
    const/high16 v24, -0x40000000    # -2.0f

    .line 259
    .line 260
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v4, 0x40800000    # 4.0f

    .line 264
    .line 265
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v25, 0x40000000    # 2.0f

    .line 269
    .line 270
    const/high16 v26, 0x40a00000    # 5.0f

    .line 271
    .line 272
    const v21, 0x4039999a    # 2.9f

    .line 273
    .line 274
    .line 275
    const/high16 v22, 0x40400000    # 3.0f

    .line 276
    .line 277
    const/high16 v23, 0x40000000    # 2.0f

    .line 278
    .line 279
    const v24, 0x4079999a    # 3.9f

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v4, 0x41300000    # 11.0f

    .line 286
    .line 287
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v25, 0x40800000    # 4.0f

    .line 291
    .line 292
    const/high16 v26, 0x41900000    # 18.0f

    .line 293
    .line 294
    const/high16 v21, 0x40000000    # 2.0f

    .line 295
    .line 296
    const v22, 0x4188cccd    # 17.1f

    .line 297
    .line 298
    .line 299
    const v23, 0x4039999a    # 2.9f

    .line 300
    .line 301
    .line 302
    const/high16 v24, 0x41900000    # 18.0f

    .line 303
    .line 304
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v4, 0x410970a4    # 8.59f

    .line 311
    .line 312
    .line 313
    const v6, 0x4100cccd    # 8.05f

    .line 314
    .line 315
    .line 316
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v25, 0x415f851f    # 13.97f

    .line 320
    .line 321
    .line 322
    const v26, 0x40f0f5c3    # 7.53f

    .line 323
    .line 324
    .line 325
    const v21, 0x411deb85    # 9.87f

    .line 326
    .line 327
    .line 328
    const v22, 0x40c5c28f    # 6.18f

    .line 329
    .line 330
    .line 331
    const v23, 0x41473333    # 12.45f

    .line 332
    .line 333
    .line 334
    const/high16 v24, 0x40c00000    # 6.0f

    .line 335
    .line 336
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v25, 0x3ef0a3d7    # 0.47f

    .line 340
    .line 341
    .line 342
    const v26, 0x408b851f    # 4.36f

    .line 343
    .line 344
    .line 345
    const v21, 0x3f970a3d    # 1.18f

    .line 346
    .line 347
    .line 348
    const v22, 0x3f970a3d    # 1.18f

    .line 349
    .line 350
    .line 351
    const v23, 0x3fab851f    # 1.34f

    .line 352
    .line 353
    .line 354
    const/high16 v24, 0x40400000    # 3.0f

    .line 355
    .line 356
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v4, 0x41570a3d    # 13.44f

    .line 360
    .line 361
    .line 362
    const/high16 v6, 0x41800000    # 16.0f

    .line 363
    .line 364
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const/16 v25, 0x0

    .line 368
    .line 369
    const v26, 0x3f87ae14    # 1.06f

    .line 370
    .line 371
    .line 372
    const v21, 0x3e947ae1    # 0.29f

    .line 373
    .line 374
    .line 375
    const v22, 0x3e947ae1    # 0.29f

    .line 376
    .line 377
    .line 378
    const v23, 0x3e947ae1    # 0.29f

    .line 379
    .line 380
    .line 381
    const v24, 0x3f451eb8    # 0.77f

    .line 382
    .line 383
    .line 384
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v25, -0x407851ec    # -1.06f

    .line 388
    .line 389
    .line 390
    const/16 v26, 0x0

    .line 391
    .line 392
    const v21, -0x416b851f    # -0.29f

    .line 393
    .line 394
    .line 395
    const v23, -0x40bae148    # -0.77f

    .line 396
    .line 397
    .line 398
    const v24, 0x3e947ae1    # 0.29f

    .line 399
    .line 400
    .line 401
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v4, -0x4039999a    # -1.55f

    .line 405
    .line 406
    .line 407
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v25, -0x3f6428f6    # -4.87f

    .line 411
    .line 412
    .line 413
    const v26, -0x4071eb85    # -1.11f

    .line 414
    .line 415
    .line 416
    const v21, -0x40370a3d    # -1.57f

    .line 417
    .line 418
    .line 419
    const/high16 v22, 0x3f800000    # 1.0f

    .line 420
    .line 421
    const v23, -0x3f8f5c29    # -3.76f

    .line 422
    .line 423
    .line 424
    const v24, 0x3f23d70a    # 0.64f

    .line 425
    .line 426
    .line 427
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v25, 0x410970a4    # 8.59f

    .line 431
    .line 432
    .line 433
    const v26, 0x4100cccd    # 8.05f

    .line 434
    .line 435
    .line 436
    const v21, 0x40f947ae    # 7.79f

    .line 437
    .line 438
    .line 439
    const v22, 0x412b3333    # 10.7f

    .line 440
    .line 441
    .line 442
    const v23, 0x40fa8f5c    # 7.83f

    .line 443
    .line 444
    .line 445
    const v24, 0x4112b852    # 9.17f

    .line 446
    .line 447
    .line 448
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 455
    .line 456
    .line 457
    move-result-object v2

    .line 458
    const/high16 v6, 0x3f800000    # 1.0f

    .line 459
    .line 460
    const/4 v7, 0x0

    .line 461
    const-string v4, ""

    .line 462
    .line 463
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 464
    .line 465
    .line 466
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 467
    .line 468
    .line 469
    move-result v3

    .line 470
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 471
    .line 472
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 473
    .line 474
    .line 475
    move-result-wide v6

    .line 476
    const/4 v0, 0x0

    .line 477
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 478
    .line 479
    .line 480
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 481
    .line 482
    .line 483
    move-result v10

    .line 484
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 485
    .line 486
    .line 487
    move-result v11

    .line 488
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 491
    .line 492
    .line 493
    const/high16 v0, 0x41380000    # 11.5f

    .line 494
    .line 495
    const/high16 v2, 0x41200000    # 10.0f

    .line 496
    .line 497
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v0, -0x40000000    # -2.0f

    .line 501
    .line 502
    const/4 v2, 0x0

    .line 503
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const/high16 v18, 0x40800000    # 4.0f

    .line 507
    .line 508
    const/16 v19, 0x0

    .line 509
    .line 510
    const/high16 v13, 0x40000000    # 2.0f

    .line 511
    .line 512
    const/high16 v14, 0x40000000    # 2.0f

    .line 513
    .line 514
    const/16 v16, 0x1

    .line 515
    .line 516
    const/16 v17, 0x1

    .line 517
    .line 518
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const/high16 v18, -0x3f800000    # -4.0f

    .line 522
    .line 523
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 527
    .line 528
    .line 529
    move-result-object v2

    .line 530
    const/16 v16, 0x3800

    .line 531
    .line 532
    const/16 v17, 0x0

    .line 533
    .line 534
    const/high16 v6, 0x3f800000    # 1.0f

    .line 535
    .line 536
    const/4 v7, 0x0

    .line 537
    const/high16 v12, 0x3f800000    # 1.0f

    .line 538
    .line 539
    const/4 v13, 0x0

    .line 540
    const/4 v14, 0x0

    .line 541
    const-string v4, ""

    .line 542
    .line 543
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 544
    .line 545
    .line 546
    move-result-object v0

    .line 547
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 548
    .line 549
    .line 550
    move-result-object v0

    .line 551
    sput-object v0, Landroidx/compose/material/icons/rounded/ScreenSearchDesktopKt;->_screenSearchDesktop:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 552
    .line 553
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 554
    .line 555
    .line 556
    return-object v0
.end method
