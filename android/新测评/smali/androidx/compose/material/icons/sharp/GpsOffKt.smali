.class public final Landroidx/compose/material/icons/sharp/GpsOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_gpsOff",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "GpsOff",
        "Landroidx/compose/material/icons/Icons$Sharp;",
        "getGpsOff",
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
        "SMAP\nGpsOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GpsOff.kt\nandroidx/compose/material/icons/sharp/GpsOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,75:1\n212#2,12:76\n233#2,18:89\n253#2:126\n174#3:88\n705#4,2:107\n717#4,2:109\n719#4,11:115\n72#5,4:111\n*S KotlinDebug\n*F\n+ 1 GpsOff.kt\nandroidx/compose/material/icons/sharp/GpsOffKt\n*L\n29#1:76,12\n30#1:89,18\n30#1:126\n29#1:88\n30#1:107,2\n30#1:109,2\n30#1:115,11\n30#1:111,4\n*E\n"
    }
.end annotation


# static fields
.field private static _gpsOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getGpsOff(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/GpsOffKt;->_gpsOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.GpsOff"

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
    const v0, 0x41a7851f    # 20.94f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41300000    # 11.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v17, -0x3f01eb85    # -7.94f

    .line 79
    .line 80
    .line 81
    const v18, -0x3f01eb85    # -7.94f

    .line 82
    .line 83
    .line 84
    const v13, -0x41147ae1    # -0.46f

    .line 85
    .line 86
    .line 87
    const v14, -0x3f7a8f5c    # -4.17f

    .line 88
    .line 89
    .line 90
    const v15, -0x3f8eb852    # -3.77f

    .line 91
    .line 92
    .line 93
    const v16, -0x3f10a3d7    # -7.48f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v0, 0x3f800000    # 1.0f

    .line 100
    .line 101
    const/high16 v2, 0x41500000    # 13.0f

    .line 102
    .line 103
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v0, -0x40000000    # -2.0f

    .line 107
    .line 108
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v0, 0x4003d70a    # 2.06f

    .line 112
    .line 113
    .line 114
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v17, -0x3fceb852    # -2.77f

    .line 118
    .line 119
    .line 120
    const v18, 0x3f47ae14    # 0.78f

    .line 121
    .line 122
    .line 123
    const v13, -0x40851eb8    # -0.98f

    .line 124
    .line 125
    .line 126
    const v14, 0x3de147ae    # 0.11f

    .line 127
    .line 128
    .line 129
    const v15, -0x400b851f    # -1.91f

    .line 130
    .line 131
    .line 132
    const v16, 0x3ec28f5c    # 0.38f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v0, 0x3fc3d70a    # 1.53f

    .line 139
    .line 140
    .line 141
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v17, 0x41400000    # 12.0f

    .line 145
    .line 146
    const/high16 v18, 0x40a00000    # 5.0f

    .line 147
    .line 148
    const v13, 0x41275c29    # 10.46f

    .line 149
    .line 150
    .line 151
    const v14, 0x40a428f6    # 5.13f

    .line 152
    .line 153
    .line 154
    const v15, 0x4133851f    # 11.22f

    .line 155
    .line 156
    .line 157
    const/high16 v16, 0x40a00000    # 5.0f

    .line 158
    .line 159
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v17, 0x40e00000    # 7.0f

    .line 163
    .line 164
    const/high16 v18, 0x40e00000    # 7.0f

    .line 165
    .line 166
    const v13, 0x4077ae14    # 3.87f

    .line 167
    .line 168
    .line 169
    const/4 v14, 0x0

    .line 170
    const/high16 v15, 0x40e00000    # 7.0f

    .line 171
    .line 172
    const v16, 0x404851ec    # 3.13f

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v17, -0x41428f5c    # -0.37f

    .line 179
    .line 180
    .line 181
    const v18, 0x400f5c29    # 2.24f

    .line 182
    .line 183
    .line 184
    const/4 v13, 0x0

    .line 185
    const v14, 0x3f4a3d71    # 0.79f

    .line 186
    .line 187
    .line 188
    const v15, -0x41fae148    # -0.13f

    .line 189
    .line 190
    .line 191
    const v16, 0x3fc51eb8    # 1.54f

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v17, 0x3f47ae14    # 0.78f

    .line 201
    .line 202
    .line 203
    const v18, -0x3fceb852    # -2.77f

    .line 204
    .line 205
    .line 206
    const v13, 0x3ecccccd    # 0.4f

    .line 207
    .line 208
    .line 209
    const v14, -0x40a3d70a    # -0.86f

    .line 210
    .line 211
    .line 212
    const v15, 0x3f2b851f    # 0.67f

    .line 213
    .line 214
    .line 215
    const v16, -0x401ae148    # -1.79f

    .line 216
    .line 217
    .line 218
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v0, 0x41b80000    # 23.0f

    .line 222
    .line 223
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v0, -0x40000000    # -2.0f

    .line 227
    .line 228
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v0, -0x3ffc28f6    # -2.06f

    .line 232
    .line 233
    .line 234
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v0, 0x4088a3d7    # 4.27f

    .line 241
    .line 242
    .line 243
    const/high16 v2, 0x40400000    # 3.0f

    .line 244
    .line 245
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v0, 0x40028f5c    # 2.04f

    .line 249
    .line 250
    .line 251
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v17, 0x4043d70a    # 3.06f

    .line 255
    .line 256
    .line 257
    const/high16 v18, 0x41300000    # 11.0f

    .line 258
    .line 259
    const v13, 0x407e147b    # 3.97f

    .line 260
    .line 261
    .line 262
    const v14, 0x40f3d70a    # 7.62f

    .line 263
    .line 264
    .line 265
    const v15, 0x4050a3d7    # 3.26f

    .line 266
    .line 267
    .line 268
    const v16, 0x4113ae14    # 9.23f

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/high16 v0, 0x3f800000    # 1.0f

    .line 275
    .line 276
    const/high16 v2, 0x41300000    # 11.0f

    .line 277
    .line 278
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v0, 0x40000000    # 2.0f

    .line 282
    .line 283
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v0, 0x4003d70a    # 2.06f

    .line 287
    .line 288
    .line 289
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v17, 0x40fe147b    # 7.94f

    .line 293
    .line 294
    .line 295
    const v18, 0x40fe147b    # 7.94f

    .line 296
    .line 297
    .line 298
    const v13, 0x3eeb851f    # 0.46f

    .line 299
    .line 300
    .line 301
    const v14, 0x408570a4    # 4.17f

    .line 302
    .line 303
    .line 304
    const v15, 0x407147ae    # 3.77f

    .line 305
    .line 306
    .line 307
    const v16, 0x40ef5c29    # 7.48f

    .line 308
    .line 309
    .line 310
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/high16 v0, 0x41b80000    # 23.0f

    .line 314
    .line 315
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const/high16 v0, 0x40000000    # 2.0f

    .line 319
    .line 320
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v0, -0x3ffc28f6    # -2.06f

    .line 324
    .line 325
    .line 326
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v17, 0x4096147b    # 4.69f

    .line 330
    .line 331
    .line 332
    const v18, -0x40028f5c    # -1.98f

    .line 333
    .line 334
    .line 335
    const v13, 0x3fe28f5c    # 1.77f

    .line 336
    .line 337
    .line 338
    const v14, -0x41b33333    # -0.2f

    .line 339
    .line 340
    .line 341
    const v15, 0x405851ec    # 3.38f

    .line 342
    .line 343
    .line 344
    const v16, -0x40970a3d    # -0.91f

    .line 345
    .line 346
    .line 347
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v0, 0x419dd70a    # 19.73f

    .line 351
    .line 352
    .line 353
    const/high16 v2, 0x41a80000    # 21.0f

    .line 354
    .line 355
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v0, 0x3fb47ae1    # 1.41f

    .line 359
    .line 360
    .line 361
    const v2, -0x404b851f    # -1.41f

    .line 362
    .line 363
    .line 364
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v0, 0x408d1eb8    # 4.41f

    .line 368
    .line 369
    .line 370
    const v2, 0x40370a3d    # 2.86f

    .line 371
    .line 372
    .line 373
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const v0, 0x4088a3d7    # 4.27f

    .line 377
    .line 378
    .line 379
    const/high16 v2, 0x40400000    # 3.0f

    .line 380
    .line 381
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v0, 0x418228f6    # 16.27f

    .line 388
    .line 389
    .line 390
    const v2, 0x418c51ec    # 17.54f

    .line 391
    .line 392
    .line 393
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v17, 0x41400000    # 12.0f

    .line 397
    .line 398
    const/high16 v18, 0x41980000    # 19.0f

    .line 399
    .line 400
    const v13, 0x417170a4    # 15.09f

    .line 401
    .line 402
    .line 403
    const v14, 0x4193999a    # 18.45f

    .line 404
    .line 405
    .line 406
    const v15, 0x4159c28f    # 13.61f

    .line 407
    .line 408
    .line 409
    const/high16 v16, 0x41980000    # 19.0f

    .line 410
    .line 411
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const/high16 v17, -0x3f200000    # -7.0f

    .line 415
    .line 416
    const/high16 v18, -0x3f200000    # -7.0f

    .line 417
    .line 418
    const v13, -0x3f8851ec    # -3.87f

    .line 419
    .line 420
    .line 421
    const/4 v14, 0x0

    .line 422
    const/high16 v15, -0x3f200000    # -7.0f

    .line 423
    .line 424
    const v16, -0x3fb7ae14    # -3.13f

    .line 425
    .line 426
    .line 427
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v17, 0x3fbae148    # 1.46f

    .line 431
    .line 432
    .line 433
    const v18, -0x3f775c29    # -4.27f

    .line 434
    .line 435
    .line 436
    const/4 v13, 0x0

    .line 437
    const v14, -0x4031eb85    # -1.61f

    .line 438
    .line 439
    .line 440
    const v15, 0x3f0ccccd    # 0.55f

    .line 441
    .line 442
    .line 443
    const v16, -0x3fba3d71    # -3.09f

    .line 444
    .line 445
    .line 446
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v0, 0x411cf5c3    # 9.81f

    .line 450
    .line 451
    .line 452
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 459
    .line 460
    .line 461
    move-result-object v2

    .line 462
    const/16 v16, 0x3800

    .line 463
    .line 464
    const/16 v17, 0x0

    .line 465
    .line 466
    const/high16 v6, 0x3f800000    # 1.0f

    .line 467
    .line 468
    const/high16 v8, 0x3f800000    # 1.0f

    .line 469
    .line 470
    const/4 v7, 0x0

    .line 471
    const/high16 v9, 0x3f800000    # 1.0f

    .line 472
    .line 473
    const/high16 v12, 0x3f800000    # 1.0f

    .line 474
    .line 475
    const/4 v14, 0x0

    .line 476
    const/4 v15, 0x0

    .line 477
    const-string v4, ""

    .line 478
    .line 479
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    sput-object v0, Landroidx/compose/material/icons/sharp/GpsOffKt;->_gpsOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 488
    .line 489
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 490
    .line 491
    .line 492
    return-object v0
.end method
