.class public final Landroidx/compose/material/icons/sharp/AndroidKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_android",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Android",
        "Landroidx/compose/material/icons/Icons$Sharp;",
        "getAndroid",
        "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nAndroid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Android.kt\nandroidx/compose/material/icons/sharp/AndroidKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,63:1\n212#2,12:64\n233#2,18:77\n253#2:114\n174#3:76\n705#4,2:95\n717#4,2:97\n719#4,11:103\n72#5,4:99\n*S KotlinDebug\n*F\n+ 1 Android.kt\nandroidx/compose/material/icons/sharp/AndroidKt\n*L\n29#1:64,12\n30#1:77,18\n30#1:114\n29#1:76\n30#1:95,2\n30#1:97,2\n30#1:103,11\n30#1:99,4\n*E\n"
    }
.end annotation


# static fields
.field private static _android:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAndroid(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/AndroidKt;->_android:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.Android"

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
    const/4 v0, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const v0, 0x418ccccd    # 17.6f

    .line 71
    .line 72
    .line 73
    const v2, 0x4117ae14    # 9.48f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x3feb851f    # 1.84f

    .line 80
    .line 81
    .line 82
    const v2, -0x3fb47ae1    # -3.18f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v17, -0x417ae148    # -0.26f

    .line 89
    .line 90
    .line 91
    const v18, -0x40a66666    # -0.85f

    .line 92
    .line 93
    .line 94
    const v13, 0x3e23d70a    # 0.16f

    .line 95
    .line 96
    .line 97
    const v14, -0x416147ae    # -0.31f

    .line 98
    .line 99
    .line 100
    const v15, 0x3d23d70a    # 0.04f

    .line 101
    .line 102
    .line 103
    const v16, -0x40cf5c29    # -0.69f

    .line 104
    .line 105
    .line 106
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v17, -0x40ab851f    # -0.83f

    .line 110
    .line 111
    .line 112
    const v18, 0x3e6147ae    # 0.22f

    .line 113
    .line 114
    .line 115
    const v13, -0x416b851f    # -0.29f

    .line 116
    .line 117
    .line 118
    const v14, -0x41e66666    # -0.15f

    .line 119
    .line 120
    .line 121
    const v15, -0x40d9999a    # -0.65f

    .line 122
    .line 123
    .line 124
    const v16, -0x428a3d71    # -0.06f

    .line 125
    .line 126
    .line 127
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v0, -0x400f5c29    # -1.88f

    .line 131
    .line 132
    .line 133
    const v2, 0x404f5c29    # 3.24f

    .line 134
    .line 135
    .line 136
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v17, -0x3ef0f5c3    # -8.94f

    .line 140
    .line 141
    .line 142
    const/16 v18, 0x0

    .line 143
    .line 144
    const v13, -0x3fc8f5c3    # -2.86f

    .line 145
    .line 146
    .line 147
    const v14, -0x40651eb8    # -1.21f

    .line 148
    .line 149
    .line 150
    const v15, -0x3f3d70a4    # -6.08f

    .line 151
    .line 152
    .line 153
    const v16, -0x40651eb8    # -1.21f

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v0, 0x40b4cccd    # 5.65f

    .line 160
    .line 161
    .line 162
    const v2, 0x40b570a4    # 5.67f

    .line 163
    .line 164
    .line 165
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v17, -0x40a147ae    # -0.87f

    .line 169
    .line 170
    .line 171
    const v18, -0x41b33333    # -0.2f

    .line 172
    .line 173
    .line 174
    const v13, -0x41bd70a4    # -0.19f

    .line 175
    .line 176
    .line 177
    const v14, -0x416b851f    # -0.29f

    .line 178
    .line 179
    .line 180
    const v15, -0x40eb851f    # -0.58f

    .line 181
    .line 182
    .line 183
    const v16, -0x413d70a4    # -0.38f

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v17, 0x4091eb85    # 4.56f

    .line 190
    .line 191
    .line 192
    const v18, 0x40c9999a    # 6.3f

    .line 193
    .line 194
    .line 195
    const/high16 v13, 0x40900000    # 4.5f

    .line 196
    .line 197
    const v14, 0x40b4cccd    # 5.65f

    .line 198
    .line 199
    .line 200
    const v15, 0x408d1eb8    # 4.41f

    .line 201
    .line 202
    .line 203
    const v16, 0x40c051ec    # 6.01f

    .line 204
    .line 205
    .line 206
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v0, 0x40cccccd    # 6.4f

    .line 210
    .line 211
    .line 212
    const v2, 0x4117ae14    # 9.48f

    .line 213
    .line 214
    .line 215
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const/high16 v17, 0x3f800000    # 1.0f

    .line 219
    .line 220
    const/high16 v18, 0x41900000    # 18.0f

    .line 221
    .line 222
    const v13, 0x40533333    # 3.3f

    .line 223
    .line 224
    .line 225
    const/high16 v14, 0x41340000    # 11.25f

    .line 226
    .line 227
    const v15, 0x3fa3d70a    # 1.28f

    .line 228
    .line 229
    .line 230
    const v16, 0x41670a3d    # 14.44f

    .line 231
    .line 232
    .line 233
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v0, 0x41b00000    # 22.0f

    .line 237
    .line 238
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v17, 0x418ccccd    # 17.6f

    .line 242
    .line 243
    .line 244
    const v18, 0x4117ae14    # 9.48f

    .line 245
    .line 246
    .line 247
    const v13, 0x41b5c28f    # 22.72f

    .line 248
    .line 249
    .line 250
    const v14, 0x41670a3d    # 14.44f

    .line 251
    .line 252
    .line 253
    const v15, 0x41a5999a    # 20.7f

    .line 254
    .line 255
    .line 256
    const/high16 v16, 0x41340000    # 11.25f

    .line 257
    .line 258
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v0, 0x40e00000    # 7.0f

    .line 265
    .line 266
    const/high16 v2, 0x41740000    # 15.25f

    .line 267
    .line 268
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/high16 v17, -0x40600000    # -1.25f

    .line 272
    .line 273
    const/high16 v18, -0x40600000    # -1.25f

    .line 274
    .line 275
    const v13, -0x40cf5c29    # -0.69f

    .line 276
    .line 277
    .line 278
    const/4 v14, 0x0

    .line 279
    const/high16 v15, -0x40600000    # -1.25f

    .line 280
    .line 281
    const v16, -0x40f0a3d7    # -0.56f

    .line 282
    .line 283
    .line 284
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/high16 v17, 0x3fa00000    # 1.25f

    .line 288
    .line 289
    const/4 v13, 0x0

    .line 290
    const v14, -0x40cf5c29    # -0.69f

    .line 291
    .line 292
    .line 293
    const v15, 0x3f0f5c29    # 0.56f

    .line 294
    .line 295
    .line 296
    const/high16 v16, -0x40600000    # -1.25f

    .line 297
    .line 298
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const v0, 0x4154f5c3    # 13.31f

    .line 302
    .line 303
    .line 304
    const/high16 v2, 0x41600000    # 14.0f

    .line 305
    .line 306
    const/high16 v4, 0x41040000    # 8.25f

    .line 307
    .line 308
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const/high16 v17, 0x40e00000    # 7.0f

    .line 312
    .line 313
    const/high16 v18, 0x41740000    # 15.25f

    .line 314
    .line 315
    const/high16 v13, 0x41040000    # 8.25f

    .line 316
    .line 317
    const v14, 0x416b0a3d    # 14.69f

    .line 318
    .line 319
    .line 320
    const v15, 0x40f6147b    # 7.69f

    .line 321
    .line 322
    .line 323
    const/high16 v16, 0x41740000    # 15.25f

    .line 324
    .line 325
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v0, 0x41880000    # 17.0f

    .line 332
    .line 333
    const/high16 v2, 0x41740000    # 15.25f

    .line 334
    .line 335
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const/high16 v17, -0x40600000    # -1.25f

    .line 339
    .line 340
    const/high16 v18, -0x40600000    # -1.25f

    .line 341
    .line 342
    const v13, -0x40cf5c29    # -0.69f

    .line 343
    .line 344
    .line 345
    const/4 v14, 0x0

    .line 346
    const/high16 v15, -0x40600000    # -1.25f

    .line 347
    .line 348
    const v16, -0x40f0a3d7    # -0.56f

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v17, 0x3fa00000    # 1.25f

    .line 355
    .line 356
    const/4 v13, 0x0

    .line 357
    const v14, -0x40cf5c29    # -0.69f

    .line 358
    .line 359
    .line 360
    const v15, 0x3f0f5c29    # 0.56f

    .line 361
    .line 362
    .line 363
    const/high16 v16, -0x40600000    # -1.25f

    .line 364
    .line 365
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v0, 0x3f0f5c29    # 0.56f

    .line 369
    .line 370
    .line 371
    const/high16 v2, 0x3fa00000    # 1.25f

    .line 372
    .line 373
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v17, 0x41880000    # 17.0f

    .line 377
    .line 378
    const/high16 v18, 0x41740000    # 15.25f

    .line 379
    .line 380
    const/high16 v13, 0x41920000    # 18.25f

    .line 381
    .line 382
    const v14, 0x416b0a3d    # 14.69f

    .line 383
    .line 384
    .line 385
    const v15, 0x418d851f    # 17.69f

    .line 386
    .line 387
    .line 388
    const/high16 v16, 0x41740000    # 15.25f

    .line 389
    .line 390
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 397
    .line 398
    .line 399
    move-result-object v2

    .line 400
    const/16 v16, 0x3800

    .line 401
    .line 402
    const/16 v17, 0x0

    .line 403
    .line 404
    const/high16 v6, 0x3f800000    # 1.0f

    .line 405
    .line 406
    const/high16 v8, 0x3f800000    # 1.0f

    .line 407
    .line 408
    const/4 v7, 0x0

    .line 409
    const/high16 v9, 0x3f800000    # 1.0f

    .line 410
    .line 411
    const/high16 v12, 0x3f800000    # 1.0f

    .line 412
    .line 413
    const/4 v13, 0x0

    .line 414
    const/4 v14, 0x0

    .line 415
    const/4 v15, 0x0

    .line 416
    const-string v4, ""

    .line 417
    .line 418
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    sput-object v0, Landroidx/compose/material/icons/sharp/AndroidKt;->_android:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 427
    .line 428
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 429
    .line 430
    .line 431
    return-object v0
.end method
