.class public final Landroidx/compose/material/icons/rounded/RefreshKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_refresh",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Refresh",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getRefresh",
        "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;",
        "material-icons-core_release"
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
        "SMAP\nRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Refresh.kt\nandroidx/compose/material/icons/rounded/RefreshKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,56:1\n212#2,12:57\n233#2,18:70\n253#2:107\n174#3:69\n705#4,2:88\n717#4,2:90\n719#4,11:96\n72#5,4:92\n*S KotlinDebug\n*F\n+ 1 Refresh.kt\nandroidx/compose/material/icons/rounded/RefreshKt\n*L\n29#1:57,12\n30#1:70,18\n30#1:107\n29#1:69\n30#1:88,2\n30#1:90,2\n30#1:96,11\n30#1:92,4\n*E\n"
    }
.end annotation


# static fields
.field private static _refresh:Landroidx/compose/ui/graphics/vector/ImageVector;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public static final getRefresh(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19
    .param p0    # Landroidx/compose/material/icons/Icons$Rounded;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/RefreshKt;->_refresh:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

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
    const-string v2, "Rounded.Refresh"

    .line 33
    .line 34
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/e;)V

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
    const/4 v0, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/e;)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v0, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    const v0, 0x418d3333    # 17.65f

    .line 66
    .line 67
    .line 68
    const v2, 0x40cb3333    # 6.35f

    .line 69
    .line 70
    .line 71
    invoke-static {v0, v2}, Lg/a;->a(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 72
    .line 73
    .line 74
    move-result-object v12

    .line 75
    const v17, -0x3f30a3d7    # -6.48f

    .line 76
    .line 77
    .line 78
    const v18, -0x3fec28f6    # -2.31f

    .line 79
    .line 80
    .line 81
    const v13, -0x402f5c29    # -1.63f

    .line 82
    .line 83
    .line 84
    const v14, -0x402f5c29    # -1.63f

    .line 85
    .line 86
    .line 87
    const v15, -0x3f83d70a    # -3.94f

    .line 88
    .line 89
    .line 90
    const v16, -0x3fdb851f    # -2.57f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v17, -0x3f1ccccd    # -7.1f

    .line 97
    .line 98
    .line 99
    const v18, 0x40e0a3d7    # 7.02f

    .line 100
    .line 101
    .line 102
    const v13, -0x3f951eb8    # -3.67f

    .line 103
    .line 104
    .line 105
    const v14, 0x3ebd70a4    # 0.37f

    .line 106
    .line 107
    .line 108
    const v15, -0x3f29eb85    # -6.69f

    .line 109
    .line 110
    .line 111
    const v16, 0x40566666    # 3.35f

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v17, 0x41400000    # 12.0f

    .line 118
    .line 119
    const/high16 v18, 0x41a00000    # 20.0f

    .line 120
    .line 121
    const v13, 0x406147ae    # 3.52f

    .line 122
    .line 123
    .line 124
    const v14, 0x417e8f5c    # 15.91f

    .line 125
    .line 126
    .line 127
    const v15, 0x40e8a3d7    # 7.27f

    .line 128
    .line 129
    .line 130
    const/high16 v16, 0x41a00000    # 20.0f

    .line 131
    .line 132
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v17, 0x40e6b852    # 7.21f

    .line 136
    .line 137
    .line 138
    const v18, -0x3f6e147b    # -4.56f

    .line 139
    .line 140
    .line 141
    const v13, 0x404c28f6    # 3.19f

    .line 142
    .line 143
    .line 144
    const/4 v14, 0x0

    .line 145
    const v15, 0x40bdc28f    # 5.93f

    .line 146
    .line 147
    .line 148
    const v16, -0x4010a3d7    # -1.87f

    .line 149
    .line 150
    .line 151
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v17, -0x4099999a    # -0.9f

    .line 155
    .line 156
    .line 157
    const v18, -0x4047ae14    # -1.44f

    .line 158
    .line 159
    .line 160
    const v13, 0x3ea3d70a    # 0.32f

    .line 161
    .line 162
    .line 163
    const v14, -0x40d47ae1    # -0.67f

    .line 164
    .line 165
    .line 166
    const v15, -0x41dc28f6    # -0.16f

    .line 167
    .line 168
    .line 169
    const v16, -0x4047ae14    # -1.44f

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v17, -0x409eb852    # -0.88f

    .line 176
    .line 177
    .line 178
    const v18, 0x3f07ae14    # 0.53f

    .line 179
    .line 180
    .line 181
    const v13, -0x41428f5c    # -0.37f

    .line 182
    .line 183
    .line 184
    const/4 v14, 0x0

    .line 185
    const v15, -0x40c7ae14    # -0.72f

    .line 186
    .line 187
    .line 188
    const v16, 0x3e4ccccd    # 0.2f

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v17, -0x3f266666    # -6.8f

    .line 195
    .line 196
    .line 197
    const v18, 0x4053d70a    # 3.31f

    .line 198
    .line 199
    .line 200
    const v13, -0x406f5c29    # -1.13f

    .line 201
    .line 202
    .line 203
    const v14, 0x401b851f    # 2.43f

    .line 204
    .line 205
    .line 206
    const v15, -0x3f8a3d71    # -3.84f

    .line 207
    .line 208
    .line 209
    const v16, 0x407e147b    # 3.97f

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v17, -0x3f70a3d7    # -4.48f

    .line 216
    .line 217
    .line 218
    const v18, -0x3f6f5c29    # -4.52f

    .line 219
    .line 220
    .line 221
    const v13, -0x3ff1eb85    # -2.22f

    .line 222
    .line 223
    .line 224
    const v14, -0x41051eb8    # -0.49f

    .line 225
    .line 226
    .line 227
    const v15, -0x3f7fae14    # -4.01f

    .line 228
    .line 229
    .line 230
    const v16, -0x3feccccd    # -2.3f

    .line 231
    .line 232
    .line 233
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v17, 0x41400000    # 12.0f

    .line 237
    .line 238
    const/high16 v18, 0x40c00000    # 6.0f

    .line 239
    .line 240
    const v13, 0x40a9eb85    # 5.31f

    .line 241
    .line 242
    .line 243
    const v14, 0x41170a3d    # 9.44f

    .line 244
    .line 245
    .line 246
    const v15, 0x410428f6    # 8.26f

    .line 247
    .line 248
    .line 249
    const/high16 v16, 0x40c00000    # 6.0f

    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v17, 0x40870a3d    # 4.22f

    .line 255
    .line 256
    .line 257
    const v18, 0x3fe3d70a    # 1.78f

    .line 258
    .line 259
    .line 260
    const v13, 0x3fd47ae1    # 1.66f

    .line 261
    .line 262
    .line 263
    const/4 v14, 0x0

    .line 264
    const v15, 0x4048f5c3    # 3.14f

    .line 265
    .line 266
    .line 267
    const v16, 0x3f30a3d7    # 0.69f

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v0, -0x403eb852    # -1.51f

    .line 274
    .line 275
    .line 276
    const v2, 0x3fc147ae    # 1.51f

    .line 277
    .line 278
    .line 279
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v17, 0x3f333333    # 0.7f

    .line 283
    .line 284
    .line 285
    const v18, 0x3fdae148    # 1.71f

    .line 286
    .line 287
    .line 288
    const v13, -0x40deb852    # -0.63f

    .line 289
    .line 290
    .line 291
    const v14, 0x3f2147ae    # 0.63f

    .line 292
    .line 293
    .line 294
    const v15, -0x41bd70a4    # -0.19f

    .line 295
    .line 296
    .line 297
    const v16, 0x3fdae148    # 1.71f

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v0, 0x41980000    # 19.0f

    .line 304
    .line 305
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v17, 0x3f800000    # 1.0f

    .line 309
    .line 310
    const/high16 v18, -0x40800000    # -1.0f

    .line 311
    .line 312
    const v13, 0x3f0ccccd    # 0.55f

    .line 313
    .line 314
    .line 315
    const/4 v14, 0x0

    .line 316
    const/high16 v15, 0x3f800000    # 1.0f

    .line 317
    .line 318
    const v16, -0x4119999a    # -0.45f

    .line 319
    .line 320
    .line 321
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v0, 0x40cd1eb8    # 6.41f

    .line 325
    .line 326
    .line 327
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v17, -0x40251eb8    # -1.71f

    .line 331
    .line 332
    .line 333
    const v18, -0x40ca3d71    # -0.71f

    .line 334
    .line 335
    .line 336
    const/4 v13, 0x0

    .line 337
    const v14, -0x409c28f6    # -0.89f

    .line 338
    .line 339
    .line 340
    const v15, -0x4075c28f    # -1.08f

    .line 341
    .line 342
    .line 343
    const v16, -0x40547ae1    # -1.34f

    .line 344
    .line 345
    .line 346
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v0, -0x40dc28f6    # -0.64f

    .line 350
    .line 351
    .line 352
    const v2, 0x3f266666    # 0.65f

    .line 353
    .line 354
    .line 355
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 362
    .line 363
    .line 364
    move-result-object v2

    .line 365
    const/16 v16, 0x3800

    .line 366
    .line 367
    const/16 v17, 0x0

    .line 368
    .line 369
    const/high16 v6, 0x3f800000    # 1.0f

    .line 370
    .line 371
    const/high16 v8, 0x3f800000    # 1.0f

    .line 372
    .line 373
    const/4 v7, 0x0

    .line 374
    const/high16 v9, 0x3f800000    # 1.0f

    .line 375
    .line 376
    const/high16 v12, 0x3f800000    # 1.0f

    .line 377
    .line 378
    const/4 v14, 0x0

    .line 379
    const/4 v15, 0x0

    .line 380
    const-string v4, ""

    .line 381
    .line 382
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    sput-object v0, Landroidx/compose/material/icons/rounded/RefreshKt;->_refresh:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 391
    .line 392
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 393
    .line 394
    .line 395
    return-object v0
.end method
