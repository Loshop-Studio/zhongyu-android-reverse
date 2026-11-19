.class public final Landroidx/compose/material/icons/rounded/DesignServicesKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_designServices",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "DesignServices",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getDesignServices",
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
        "SMAP\nDesignServices.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DesignServices.kt\nandroidx/compose/material/icons/rounded/DesignServicesKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,92:1\n212#2,12:93\n233#2,18:106\n253#2:143\n233#2,18:144\n253#2:181\n174#3:105\n705#4,2:124\n717#4,2:126\n719#4,11:132\n705#4,2:162\n717#4,2:164\n719#4,11:170\n72#5,4:128\n72#5,4:166\n*S KotlinDebug\n*F\n+ 1 DesignServices.kt\nandroidx/compose/material/icons/rounded/DesignServicesKt\n*L\n29#1:93,12\n30#1:106,18\n30#1:143\n77#1:144,18\n77#1:181\n29#1:105\n30#1:124,2\n30#1:126,2\n30#1:132,11\n77#1:162,2\n77#1:164,2\n77#1:170,11\n30#1:128,4\n77#1:166,4\n*E\n"
    }
.end annotation


# static fields
.field private static _designServices:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDesignServices(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/DesignServicesKt;->_designServices:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.DesignServices"

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
    const v4, 0x413828f6    # 11.51f

    .line 71
    .line 72
    .line 73
    const v6, 0x4181eb85    # 16.24f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, -0x40370a3d    # -1.57f

    .line 80
    .line 81
    .line 82
    const v6, 0x3fc8f5c3    # 1.57f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/high16 v4, -0x3f900000    # -3.75f

    .line 89
    .line 90
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v4, -0x40370a3d    # -1.57f

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v4, 0x4105999a    # 8.35f

    .line 100
    .line 101
    .line 102
    const v6, 0x406851ec    # 3.63f

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v25, -0x3fcae148    # -2.83f

    .line 109
    .line 110
    .line 111
    const/16 v26, 0x0

    .line 112
    .line 113
    const v21, -0x40b851ec    # -0.78f

    .line 114
    .line 115
    .line 116
    const v22, -0x40b851ec    # -0.78f

    .line 117
    .line 118
    .line 119
    const v23, -0x3ffccccd    # -2.05f

    .line 120
    .line 121
    .line 122
    const v24, -0x40b851ec    # -0.78f

    .line 123
    .line 124
    .line 125
    move-object/from16 v20, v2

    .line 126
    .line 127
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v4, 0x3ff33333    # 1.9f

    .line 131
    .line 132
    .line 133
    const v6, -0x400ccccd    # -1.9f

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/16 v25, 0x0

    .line 140
    .line 141
    const v26, 0x40351eb8    # 2.83f

    .line 142
    .line 143
    .line 144
    const v22, 0x3f47ae14    # 0.78f

    .line 145
    .line 146
    .line 147
    const v23, -0x40b851ec    # -0.78f

    .line 148
    .line 149
    .line 150
    const v24, 0x40033333    # 2.05f

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v4, 0x408428f6    # 4.13f

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v4, 0x4049999a    # 3.15f

    .line 163
    .line 164
    .line 165
    const v6, 0x4188cccd    # 17.1f

    .line 166
    .line 167
    .line 168
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v25, 0x40400000    # 3.0f

    .line 172
    .line 173
    const v26, 0x418bae14    # 17.46f

    .line 174
    .line 175
    .line 176
    const v21, 0x40433333    # 3.05f

    .line 177
    .line 178
    .line 179
    const v22, 0x4189999a    # 17.2f

    .line 180
    .line 181
    .line 182
    const/high16 v23, 0x40400000    # 3.0f

    .line 183
    .line 184
    const v24, 0x418a8f5c    # 17.32f

    .line 185
    .line 186
    .line 187
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v4, 0x40428f5c    # 3.04f

    .line 191
    .line 192
    .line 193
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const/high16 v25, 0x40600000    # 3.5f

    .line 197
    .line 198
    const/high16 v26, 0x41a80000    # 21.0f

    .line 199
    .line 200
    const/high16 v21, 0x40400000    # 3.0f

    .line 201
    .line 202
    const v22, 0x41a63d71    # 20.78f

    .line 203
    .line 204
    .line 205
    const v23, 0x404e147b    # 3.22f

    .line 206
    .line 207
    .line 208
    const/high16 v24, 0x41a80000    # 21.0f

    .line 209
    .line 210
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v25, 0x3eb33333    # 0.35f

    .line 217
    .line 218
    .line 219
    const v26, -0x41e66666    # -0.15f

    .line 220
    .line 221
    .line 222
    const v21, 0x3e051eb8    # 0.13f

    .line 223
    .line 224
    .line 225
    const/16 v22, 0x0

    .line 226
    .line 227
    const v23, 0x3e851eb8    # 0.26f

    .line 228
    .line 229
    .line 230
    const v24, -0x42b33333    # -0.05f

    .line 231
    .line 232
    .line 233
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v4, 0x4093d70a    # 4.62f

    .line 237
    .line 238
    .line 239
    const v6, -0x3f6c28f6    # -4.62f

    .line 240
    .line 241
    .line 242
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const v4, 0x408428f6    # 4.13f

    .line 246
    .line 247
    .line 248
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v25, 0x40351eb8    # 2.83f

    .line 252
    .line 253
    .line 254
    const/16 v26, 0x0

    .line 255
    .line 256
    const v21, 0x3fa8f5c3    # 1.32f

    .line 257
    .line 258
    .line 259
    const v22, 0x3fa8f5c3    # 1.32f

    .line 260
    .line 261
    .line 262
    const v23, 0x4030a3d7    # 2.76f

    .line 263
    .line 264
    .line 265
    const v24, 0x3d8f5c29    # 0.07f

    .line 266
    .line 267
    .line 268
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v4, 0x3ff33333    # 1.9f

    .line 272
    .line 273
    .line 274
    const v6, -0x400ccccd    # -1.9f

    .line 275
    .line 276
    .line 277
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/16 v25, 0x0

    .line 281
    .line 282
    const v26, -0x3fcae148    # -2.83f

    .line 283
    .line 284
    .line 285
    const v21, 0x3f47ae14    # 0.78f

    .line 286
    .line 287
    .line 288
    const v22, -0x40b851ec    # -0.78f

    .line 289
    .line 290
    .line 291
    const v23, 0x3f47ae14    # 0.78f

    .line 292
    .line 293
    .line 294
    const v24, -0x3ffccccd    # -2.05f

    .line 295
    .line 296
    .line 297
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v4, 0x413828f6    # 11.51f

    .line 301
    .line 302
    .line 303
    const v6, 0x4181eb85    # 16.24f

    .line 304
    .line 305
    .line 306
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v4, 0x41311eb8    # 11.07f

    .line 313
    .line 314
    .line 315
    const v6, 0x4112e148    # 9.18f

    .line 316
    .line 317
    .line 318
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v4, 0x40a147ae    # 5.04f

    .line 322
    .line 323
    .line 324
    const v6, 0x40de147b    # 6.94f

    .line 325
    .line 326
    .line 327
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v4, 0x3ff1eb85    # 1.89f

    .line 331
    .line 332
    .line 333
    const v6, -0x400ccccd    # -1.9f

    .line 334
    .line 335
    .line 336
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const/16 v26, 0x0

    .line 340
    .line 341
    const/16 v21, 0x0

    .line 342
    .line 343
    const/16 v22, 0x0

    .line 344
    .line 345
    const/16 v23, 0x0

    .line 346
    .line 347
    const/16 v24, 0x0

    .line 348
    .line 349
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const v4, 0x3fa28f5c    # 1.27f

    .line 353
    .line 354
    .line 355
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v4, 0x40f75c29    # 7.73f

    .line 359
    .line 360
    .line 361
    const v6, 0x40d9999a    # 6.8f

    .line 362
    .line 363
    .line 364
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v26, 0x3fb47ae1    # 1.41f

    .line 368
    .line 369
    .line 370
    const v21, -0x413851ec    # -0.39f

    .line 371
    .line 372
    .line 373
    const v22, 0x3ec7ae14    # 0.39f

    .line 374
    .line 375
    .line 376
    const v23, -0x413851ec    # -0.39f

    .line 377
    .line 378
    .line 379
    const v24, 0x3f828f5c    # 1.02f

    .line 380
    .line 381
    .line 382
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const v25, 0x3fb47ae1    # 1.41f

    .line 386
    .line 387
    .line 388
    const/16 v26, 0x0

    .line 389
    .line 390
    const v21, 0x3ec7ae14    # 0.39f

    .line 391
    .line 392
    .line 393
    const v23, 0x3f828f5c    # 1.02f

    .line 394
    .line 395
    .line 396
    const v24, 0x3ec7ae14    # 0.39f

    .line 397
    .line 398
    .line 399
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v4, -0x410a3d71    # -0.48f

    .line 403
    .line 404
    .line 405
    const v6, 0x3ef5c28f    # 0.48f

    .line 406
    .line 407
    .line 408
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v4, 0x3fb9999a    # 1.45f

    .line 412
    .line 413
    .line 414
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const v4, 0x41311eb8    # 11.07f

    .line 418
    .line 419
    .line 420
    const v6, 0x4112e148    # 9.18f

    .line 421
    .line 422
    .line 423
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v4, 0x4197ae14    # 18.96f

    .line 430
    .line 431
    .line 432
    const v6, 0x41887ae1    # 17.06f

    .line 433
    .line 434
    .line 435
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v4, -0x3f7bd70a    # -4.13f

    .line 439
    .line 440
    .line 441
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v4, 0x3ff33333    # 1.9f

    .line 445
    .line 446
    .line 447
    const v6, -0x400ccccd    # -1.9f

    .line 448
    .line 449
    .line 450
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v4, 0x3fb9999a    # 1.45f

    .line 454
    .line 455
    .line 456
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v4, -0x410a3d71    # -0.48f

    .line 460
    .line 461
    .line 462
    const v6, 0x3ef5c28f    # 0.48f

    .line 463
    .line 464
    .line 465
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const/16 v25, 0x0

    .line 469
    .line 470
    const v26, 0x3fb47ae1    # 1.41f

    .line 471
    .line 472
    .line 473
    const v21, -0x413851ec    # -0.39f

    .line 474
    .line 475
    .line 476
    const v23, -0x413851ec    # -0.39f

    .line 477
    .line 478
    .line 479
    const v24, 0x3f828f5c    # 1.02f

    .line 480
    .line 481
    .line 482
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v25, 0x3fb47ae1    # 1.41f

    .line 486
    .line 487
    .line 488
    const/16 v26, 0x0

    .line 489
    .line 490
    const v21, 0x3ec7ae14    # 0.39f

    .line 491
    .line 492
    .line 493
    const v23, 0x3f828f5c    # 1.02f

    .line 494
    .line 495
    .line 496
    const v24, 0x3ec7ae14    # 0.39f

    .line 497
    .line 498
    .line 499
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const v4, 0x3fa28f5c    # 1.27f

    .line 506
    .line 507
    .line 508
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const v4, 0x4197ae14    # 18.96f

    .line 512
    .line 513
    .line 514
    const v6, 0x41887ae1    # 17.06f

    .line 515
    .line 516
    .line 517
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 524
    .line 525
    .line 526
    move-result-object v2

    .line 527
    const/16 v16, 0x3800

    .line 528
    .line 529
    const/16 v17, 0x0

    .line 530
    .line 531
    const/high16 v6, 0x3f800000    # 1.0f

    .line 532
    .line 533
    const/high16 v8, 0x3f800000    # 1.0f

    .line 534
    .line 535
    const/4 v7, 0x0

    .line 536
    const/high16 v9, 0x3f800000    # 1.0f

    .line 537
    .line 538
    const/high16 v12, 0x3f800000    # 1.0f

    .line 539
    .line 540
    const/4 v13, 0x0

    .line 541
    const/4 v14, 0x0

    .line 542
    const/4 v15, 0x0

    .line 543
    const-string v4, ""

    .line 544
    .line 545
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 546
    .line 547
    .line 548
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 549
    .line 550
    .line 551
    move-result v3

    .line 552
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 553
    .line 554
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 555
    .line 556
    .line 557
    move-result-wide v6

    .line 558
    const/4 v0, 0x0

    .line 559
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 560
    .line 561
    .line 562
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 563
    .line 564
    .line 565
    move-result v10

    .line 566
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 567
    .line 568
    .line 569
    move-result v11

    .line 570
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 573
    .line 574
    .line 575
    const v0, 0x40e147ae    # 7.04f

    .line 576
    .line 577
    .line 578
    const v2, 0x41a5ae14    # 20.71f

    .line 579
    .line 580
    .line 581
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const/16 v17, 0x0

    .line 585
    .line 586
    const v18, -0x404b851f    # -1.41f

    .line 587
    .line 588
    .line 589
    const v13, 0x3ec7ae14    # 0.39f

    .line 590
    .line 591
    .line 592
    const v14, -0x413851ec    # -0.39f

    .line 593
    .line 594
    .line 595
    const v15, 0x3ec7ae14    # 0.39f

    .line 596
    .line 597
    .line 598
    const v16, -0x407d70a4    # -1.02f

    .line 599
    .line 600
    .line 601
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const v0, -0x3fea3d71    # -2.34f

    .line 605
    .line 606
    .line 607
    const v2, -0x3fea3d71    # -2.34f

    .line 608
    .line 609
    .line 610
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const v17, -0x404b851f    # -1.41f

    .line 614
    .line 615
    .line 616
    const/16 v18, 0x0

    .line 617
    .line 618
    const v13, -0x410f5c29    # -0.47f

    .line 619
    .line 620
    .line 621
    const v14, -0x410f5c29    # -0.47f

    .line 622
    .line 623
    .line 624
    const v15, -0x4070a3d7    # -1.12f

    .line 625
    .line 626
    .line 627
    const v16, -0x416b851f    # -0.29f

    .line 628
    .line 629
    .line 630
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const v0, -0x4015c28f    # -1.83f

    .line 634
    .line 635
    .line 636
    const v2, 0x3fea3d71    # 1.83f

    .line 637
    .line 638
    .line 639
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const/high16 v0, 0x40700000    # 3.75f

    .line 643
    .line 644
    const/high16 v2, 0x40700000    # 3.75f

    .line 645
    .line 646
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const v0, 0x40e147ae    # 7.04f

    .line 650
    .line 651
    .line 652
    const v2, 0x41a5ae14    # 20.71f

    .line 653
    .line 654
    .line 655
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 662
    .line 663
    .line 664
    move-result-object v2

    .line 665
    const/16 v16, 0x3800

    .line 666
    .line 667
    const/16 v17, 0x0

    .line 668
    .line 669
    const/high16 v6, 0x3f800000    # 1.0f

    .line 670
    .line 671
    const/4 v7, 0x0

    .line 672
    const/high16 v12, 0x3f800000    # 1.0f

    .line 673
    .line 674
    const/4 v13, 0x0

    .line 675
    const/4 v14, 0x0

    .line 676
    const/4 v15, 0x0

    .line 677
    const-string v4, ""

    .line 678
    .line 679
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 680
    .line 681
    .line 682
    move-result-object v0

    .line 683
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 684
    .line 685
    .line 686
    move-result-object v0

    .line 687
    sput-object v0, Landroidx/compose/material/icons/rounded/DesignServicesKt;->_designServices:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 688
    .line 689
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 690
    .line 691
    .line 692
    return-object v0
.end method
