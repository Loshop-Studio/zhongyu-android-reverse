.class public final Landroidx/compose/material/icons/rounded/VrpanoKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_vrpano",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Vrpano",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getVrpano",
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
        "SMAP\nVrpano.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vrpano.kt\nandroidx/compose/material/icons/rounded/VrpanoKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,61:1\n212#2,12:62\n233#2,18:75\n253#2:112\n174#3:74\n705#4,2:93\n717#4,2:95\n719#4,11:101\n72#5,4:97\n*S KotlinDebug\n*F\n+ 1 Vrpano.kt\nandroidx/compose/material/icons/rounded/VrpanoKt\n*L\n29#1:62,12\n30#1:75,18\n30#1:112\n29#1:74\n30#1:93,2\n30#1:95,2\n30#1:101,11\n30#1:97,4\n*E\n"
    }
.end annotation


# static fields
.field private static _vrpano:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getVrpano(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/VrpanoKt;->_vrpano:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Vrpano"

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
    const v0, 0x41a5851f    # 20.69f

    .line 71
    .line 72
    .line 73
    const v2, 0x4081999a    # 4.05f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v17, 0x41400000    # 12.0f

    .line 80
    .line 81
    const/high16 v18, 0x40b00000    # 5.5f

    .line 82
    .line 83
    const v13, 0x419547ae    # 18.66f

    .line 84
    .line 85
    .line 86
    const v14, 0x40975c29    # 4.73f

    .line 87
    .line 88
    .line 89
    const v15, 0x417dc28f    # 15.86f

    .line 90
    .line 91
    .line 92
    const/high16 v16, 0x40b00000    # 5.5f

    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v17, -0x3ef4f5c3    # -8.69f

    .line 98
    .line 99
    .line 100
    const v18, -0x4048f5c3    # -1.43f

    .line 101
    .line 102
    .line 103
    const v13, -0x3f870a3d    # -3.89f

    .line 104
    .line 105
    .line 106
    const/4 v14, 0x0

    .line 107
    const v15, -0x3f21999a    # -6.95f

    .line 108
    .line 109
    .line 110
    const v16, -0x40a8f5c3    # -0.84f

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v17, 0x40000000    # 2.0f

    .line 117
    .line 118
    const v18, 0x40a0a3d7    # 5.02f

    .line 119
    .line 120
    .line 121
    const v13, 0x402ae148    # 2.67f

    .line 122
    .line 123
    .line 124
    const v14, 0x40766666    # 3.85f

    .line 125
    .line 126
    .line 127
    const/high16 v15, 0x40000000    # 2.0f

    .line 128
    .line 129
    const v16, 0x408a8f5c    # 4.33f

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v0, 0x41980000    # 19.0f

    .line 136
    .line 137
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v17, 0x3fa7ae14    # 1.31f

    .line 141
    .line 142
    .line 143
    const v18, 0x3f733333    # 0.95f

    .line 144
    .line 145
    .line 146
    const/4 v13, 0x0

    .line 147
    const v14, 0x3f2e147b    # 0.68f

    .line 148
    .line 149
    .line 150
    const v15, 0x3f28f5c3    # 0.66f

    .line 151
    .line 152
    .line 153
    const v16, 0x3f95c28f    # 1.17f

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v17, 0x41400000    # 12.0f

    .line 160
    .line 161
    const/high16 v18, 0x41940000    # 18.5f

    .line 162
    .line 163
    const v13, 0x40ab851f    # 5.36f

    .line 164
    .line 165
    .line 166
    const v14, 0x419a147b    # 19.26f

    .line 167
    .line 168
    .line 169
    const v15, 0x4101999a    # 8.1f

    .line 170
    .line 171
    .line 172
    const/high16 v16, 0x41940000    # 18.5f

    .line 173
    .line 174
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v17, 0x410b0a3d    # 8.69f

    .line 178
    .line 179
    .line 180
    const v18, 0x3fb9999a    # 1.45f

    .line 181
    .line 182
    .line 183
    const v13, 0x4077ae14    # 3.87f

    .line 184
    .line 185
    .line 186
    const/4 v14, 0x0

    .line 187
    const v15, 0x40d51eb8    # 6.66f

    .line 188
    .line 189
    .line 190
    const v16, 0x3f428f5c    # 0.76f

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const/high16 v17, 0x41b00000    # 22.0f

    .line 197
    .line 198
    const/high16 v18, 0x41980000    # 19.0f

    .line 199
    .line 200
    const v13, 0x41aab852    # 21.34f

    .line 201
    .line 202
    .line 203
    const v14, 0x41a147ae    # 20.16f

    .line 204
    .line 205
    .line 206
    const/high16 v15, 0x41b00000    # 22.0f

    .line 207
    .line 208
    const v16, 0x419d70a4    # 19.68f

    .line 209
    .line 210
    .line 211
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const/high16 v0, 0x40a00000    # 5.0f

    .line 215
    .line 216
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v17, 0x41a5851f    # 20.69f

    .line 220
    .line 221
    .line 222
    const v18, 0x4081999a    # 4.05f

    .line 223
    .line 224
    .line 225
    const/high16 v13, 0x41b00000    # 22.0f

    .line 226
    .line 227
    const v14, 0x408a3d71    # 4.32f

    .line 228
    .line 229
    .line 230
    const v15, 0x41aab852    # 21.34f

    .line 231
    .line 232
    .line 233
    const v16, 0x4075c28f    # 3.84f

    .line 234
    .line 235
    .line 236
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const v0, 0x418a3d71    # 17.28f

    .line 243
    .line 244
    .line 245
    const v2, 0x417428f6    # 15.26f

    .line 246
    .line 247
    .line 248
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v17, 0x41400000    # 12.0f

    .line 252
    .line 253
    const/high16 v18, 0x41700000    # 15.0f

    .line 254
    .line 255
    const v13, 0x4179eb85    # 15.62f

    .line 256
    .line 257
    .line 258
    const v14, 0x4171999a    # 15.1f

    .line 259
    .line 260
    .line 261
    const v15, 0x415d70a4    # 13.84f

    .line 262
    .line 263
    .line 264
    const/high16 v16, 0x41700000    # 15.0f

    .line 265
    .line 266
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v17, -0x3f570a3d    # -5.28f

    .line 270
    .line 271
    .line 272
    const v18, 0x3e8a3d71    # 0.27f

    .line 273
    .line 274
    .line 275
    const v13, -0x4010a3d7    # -1.87f

    .line 276
    .line 277
    .line 278
    const/4 v14, 0x0

    .line 279
    const v15, -0x3f97ae14    # -3.63f

    .line 280
    .line 281
    .line 282
    const v16, 0x3dcccccd    # 0.1f

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v17, 0x40c947ae    # 6.29f

    .line 289
    .line 290
    .line 291
    const v18, 0x41673333    # 14.45f

    .line 292
    .line 293
    .line 294
    const v13, 0x40c8a3d7    # 6.27f

    .line 295
    .line 296
    .line 297
    const v14, 0x4174f5c3    # 15.31f

    .line 298
    .line 299
    .line 300
    const/high16 v15, 0x40c00000    # 6.0f

    .line 301
    .line 302
    const v16, 0x416ca3d7    # 14.79f

    .line 303
    .line 304
    .line 305
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v0, 0x40200000    # 2.5f

    .line 309
    .line 310
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 311
    .line 312
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v17, 0x3f451eb8    # 0.77f

    .line 316
    .line 317
    .line 318
    const/16 v18, 0x0

    .line 319
    .line 320
    const v13, 0x3e4ccccd    # 0.2f

    .line 321
    .line 322
    .line 323
    const v14, -0x418a3d71    # -0.24f

    .line 324
    .line 325
    .line 326
    const v15, 0x3f11eb85    # 0.57f

    .line 327
    .line 328
    .line 329
    const v16, -0x418a3d71    # -0.24f

    .line 330
    .line 331
    .line 332
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v0, 0x3fcf5c29    # 1.62f

    .line 336
    .line 337
    .line 338
    const v2, 0x3ff851ec    # 1.94f

    .line 339
    .line 340
    .line 341
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v0, 0x401c28f6    # 2.44f

    .line 345
    .line 346
    .line 347
    const v2, -0x3fc47ae1    # -2.93f

    .line 348
    .line 349
    .line 350
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v0, 0x40547ae1    # 3.32f

    .line 357
    .line 358
    .line 359
    const v2, 0x407f5c29    # 3.99f

    .line 360
    .line 361
    .line 362
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v17, 0x418a3d71    # 17.28f

    .line 366
    .line 367
    .line 368
    const v18, 0x417428f6    # 15.26f

    .line 369
    .line 370
    .line 371
    const v13, 0x418feb85    # 17.99f

    .line 372
    .line 373
    .line 374
    const v14, 0x416ca3d7    # 14.79f

    .line 375
    .line 376
    .line 377
    const v15, 0x418dc28f    # 17.72f

    .line 378
    .line 379
    .line 380
    const v16, 0x4174f5c3    # 15.31f

    .line 381
    .line 382
    .line 383
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 390
    .line 391
    .line 392
    move-result-object v2

    .line 393
    const/16 v16, 0x3800

    .line 394
    .line 395
    const/16 v17, 0x0

    .line 396
    .line 397
    const/high16 v6, 0x3f800000    # 1.0f

    .line 398
    .line 399
    const/high16 v8, 0x3f800000    # 1.0f

    .line 400
    .line 401
    const/4 v7, 0x0

    .line 402
    const/high16 v9, 0x3f800000    # 1.0f

    .line 403
    .line 404
    const/high16 v12, 0x3f800000    # 1.0f

    .line 405
    .line 406
    const/4 v13, 0x0

    .line 407
    const/4 v14, 0x0

    .line 408
    const/4 v15, 0x0

    .line 409
    const-string v4, ""

    .line 410
    .line 411
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    sput-object v0, Landroidx/compose/material/icons/rounded/VrpanoKt;->_vrpano:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 420
    .line 421
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 422
    .line 423
    .line 424
    return-object v0
.end method
