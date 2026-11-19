.class public final Landroidx/compose/material/icons/rounded/HlsOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_hlsOff",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "HlsOff",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getHlsOff",
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
        "SMAP\nHlsOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HlsOff.kt\nandroidx/compose/material/icons/rounded/HlsOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,89:1\n212#2,12:90\n233#2,18:103\n253#2:140\n174#3:102\n705#4,2:121\n717#4,2:123\n719#4,11:129\n72#5,4:125\n*S KotlinDebug\n*F\n+ 1 HlsOff.kt\nandroidx/compose/material/icons/rounded/HlsOffKt\n*L\n29#1:90,12\n30#1:103,18\n30#1:140\n29#1:102\n30#1:121,2\n30#1:123,2\n30#1:129,11\n30#1:125,4\n*E\n"
    }
.end annotation


# static fields
.field private static _hlsOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHlsOff(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/HlsOffKt;->_hlsOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.HlsOff"

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
    const/high16 v0, 0x41700000    # 15.0f

    .line 71
    .line 72
    const v2, 0x418ea3d7    # 17.83f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v0, 0x3fd5c28f    # 1.67f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const/high16 v17, 0x3f800000    # 1.0f

    .line 85
    .line 86
    const/high16 v18, -0x40800000    # -1.0f

    .line 87
    .line 88
    const v13, 0x3f0ccccd    # 0.55f

    .line 89
    .line 90
    .line 91
    const/4 v14, 0x0

    .line 92
    const/high16 v15, 0x3f800000    # 1.0f

    .line 93
    .line 94
    const v16, -0x4119999a    # -0.45f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v0, -0x40400000    # -1.5f

    .line 101
    .line 102
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v17, -0x40800000    # -1.0f

    .line 106
    .line 107
    const/4 v13, 0x0

    .line 108
    const v14, -0x40f33333    # -0.55f

    .line 109
    .line 110
    .line 111
    const v15, -0x4119999a    # -0.45f

    .line 112
    .line 113
    .line 114
    const/high16 v16, -0x40800000    # -1.0f

    .line 115
    .line 116
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v0, 0x41880000    # 17.0f

    .line 120
    .line 121
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v0, -0x40800000    # -1.0f

    .line 125
    .line 126
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v0, 0x40028f5c    # 2.04f

    .line 130
    .line 131
    .line 132
    const/4 v2, 0x0

    .line 133
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v17, 0x3f35c28f    # 0.71f

    .line 137
    .line 138
    .line 139
    const/high16 v18, 0x3f000000    # 0.5f

    .line 140
    .line 141
    const v13, 0x3dcccccd    # 0.1f

    .line 142
    .line 143
    .line 144
    const v14, 0x3e947ae1    # 0.29f

    .line 145
    .line 146
    .line 147
    const v15, 0x3ec28f5c    # 0.38f

    .line 148
    .line 149
    .line 150
    const/high16 v16, 0x3f000000    # 0.5f

    .line 151
    .line 152
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const/high16 v17, 0x3f400000    # 0.75f

    .line 156
    .line 157
    const/high16 v18, -0x40c00000    # -0.75f

    .line 158
    .line 159
    const v13, 0x3ed1eb85    # 0.41f

    .line 160
    .line 161
    .line 162
    const/4 v14, 0x0

    .line 163
    const/high16 v15, 0x3f400000    # 0.75f

    .line 164
    .line 165
    const v16, -0x4151eb85    # -0.34f

    .line 166
    .line 167
    .line 168
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v0, 0x41200000    # 10.0f

    .line 172
    .line 173
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/high16 v17, -0x40800000    # -1.0f

    .line 177
    .line 178
    const/high16 v18, -0x40800000    # -1.0f

    .line 179
    .line 180
    const/4 v13, 0x0

    .line 181
    const v14, -0x40f33333    # -0.55f

    .line 182
    .line 183
    .line 184
    const v15, -0x4119999a    # -0.45f

    .line 185
    .line 186
    .line 187
    const/high16 v16, -0x40800000    # -1.0f

    .line 188
    .line 189
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 193
    .line 194
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v18, 0x3f800000    # 1.0f

    .line 198
    .line 199
    const v13, -0x40f33333    # -0.55f

    .line 200
    .line 201
    .line 202
    const/4 v14, 0x0

    .line 203
    const/high16 v15, -0x40800000    # -1.0f

    .line 204
    .line 205
    const v16, 0x3ee66666    # 0.45f

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 212
    .line 213
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v17, 0x3f800000    # 1.0f

    .line 217
    .line 218
    const/4 v13, 0x0

    .line 219
    const v14, 0x3f0ccccd    # 0.55f

    .line 220
    .line 221
    .line 222
    const v15, 0x3ee66666    # 0.45f

    .line 223
    .line 224
    .line 225
    const/high16 v16, 0x3f800000    # 1.0f

    .line 226
    .line 227
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v0, 0x41980000    # 19.0f

    .line 231
    .line 232
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v0, 0x3f800000    # 1.0f

    .line 236
    .line 237
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v0, -0x3ffd70a4    # -2.04f

    .line 241
    .line 242
    .line 243
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/4 v0, 0x0

    .line 247
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v17, -0x40ca3d71    # -0.71f

    .line 251
    .line 252
    .line 253
    const/high16 v18, -0x41000000    # -0.5f

    .line 254
    .line 255
    const v13, -0x42333333    # -0.1f

    .line 256
    .line 257
    .line 258
    const v14, -0x416b851f    # -0.29f

    .line 259
    .line 260
    .line 261
    const v15, -0x413d70a4    # -0.38f

    .line 262
    .line 263
    .line 264
    const/high16 v16, -0x41000000    # -0.5f

    .line 265
    .line 266
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v17, -0x4151eb85    # -0.34f

    .line 270
    .line 271
    .line 272
    const v18, 0x3da3d70a    # 0.08f

    .line 273
    .line 274
    .line 275
    const v13, -0x420a3d71    # -0.12f

    .line 276
    .line 277
    .line 278
    const/4 v14, 0x0

    .line 279
    const v15, -0x418a3d71    # -0.24f

    .line 280
    .line 281
    .line 282
    const v16, 0x3cf5c28f    # 0.03f

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/high16 v0, 0x41700000    # 15.0f

    .line 289
    .line 290
    const v2, 0x418ea3d7    # 17.83f

    .line 291
    .line 292
    .line 293
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v0, 0x41af3333    # 21.9f

    .line 300
    .line 301
    .line 302
    const v2, 0x41988f5c    # 19.07f

    .line 303
    .line 304
    .line 305
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v17, 0x3fb47ae1    # 1.41f

    .line 309
    .line 310
    .line 311
    const/16 v18, 0x0

    .line 312
    .line 313
    const v13, 0x3ec7ae14    # 0.39f

    .line 314
    .line 315
    .line 316
    const v14, 0x3ec7ae14    # 0.39f

    .line 317
    .line 318
    .line 319
    const v15, 0x3f828f5c    # 1.02f

    .line 320
    .line 321
    .line 322
    const v16, 0x3ec7ae14    # 0.39f

    .line 323
    .line 324
    .line 325
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const v0, -0x407d70a4    # -1.02f

    .line 329
    .line 330
    .line 331
    const v2, -0x404b851f    # -1.41f

    .line 332
    .line 333
    .line 334
    const/4 v4, 0x0

    .line 335
    const v6, 0x3ec7ae14    # 0.39f

    .line 336
    .line 337
    .line 338
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v0, 0x4060a3d7    # 3.51f

    .line 342
    .line 343
    .line 344
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v17, -0x404b851f    # -1.41f

    .line 348
    .line 349
    .line 350
    const v13, -0x413851ec    # -0.39f

    .line 351
    .line 352
    .line 353
    const v14, -0x413851ec    # -0.39f

    .line 354
    .line 355
    .line 356
    const v15, -0x407d70a4    # -1.02f

    .line 357
    .line 358
    .line 359
    const v16, -0x413851ec    # -0.39f

    .line 360
    .line 361
    .line 362
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v0, 0x3f828f5c    # 1.02f

    .line 366
    .line 367
    .line 368
    const v2, 0x3fb47ae1    # 1.41f

    .line 369
    .line 370
    .line 371
    const v6, -0x413851ec    # -0.39f

    .line 372
    .line 373
    .line 374
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const v0, 0x408f5c29    # 4.48f

    .line 378
    .line 379
    .line 380
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const/high16 v17, 0x40d00000    # 6.5f

    .line 384
    .line 385
    const/high16 v18, 0x411c0000    # 9.75f

    .line 386
    .line 387
    const v13, 0x40d0f5c3    # 6.53f

    .line 388
    .line 389
    .line 390
    const v14, 0x411828f6    # 9.51f

    .line 391
    .line 392
    .line 393
    const/high16 v15, 0x40d00000    # 6.5f

    .line 394
    .line 395
    const v16, 0x411a147b    # 9.63f

    .line 396
    .line 397
    .line 398
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/high16 v0, 0x41300000    # 11.0f

    .line 402
    .line 403
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const/high16 v0, -0x40000000    # -2.0f

    .line 407
    .line 408
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const/high16 v0, 0x411c0000    # 9.75f

    .line 412
    .line 413
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const/high16 v17, 0x40700000    # 3.75f

    .line 417
    .line 418
    const/high16 v18, 0x41100000    # 9.0f

    .line 419
    .line 420
    const/high16 v13, 0x40900000    # 4.5f

    .line 421
    .line 422
    const v14, 0x411570a4    # 9.34f

    .line 423
    .line 424
    .line 425
    const v15, 0x40851eb8    # 4.16f

    .line 426
    .line 427
    .line 428
    const/high16 v16, 0x41100000    # 9.0f

    .line 429
    .line 430
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v0, 0x411570a4    # 9.34f

    .line 434
    .line 435
    .line 436
    const/high16 v2, 0x40400000    # 3.0f

    .line 437
    .line 438
    const/high16 v4, 0x411c0000    # 9.75f

    .line 439
    .line 440
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const/high16 v0, 0x40900000    # 4.5f

    .line 444
    .line 445
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/high16 v18, 0x41700000    # 15.0f

    .line 449
    .line 450
    const/high16 v13, 0x40400000    # 3.0f

    .line 451
    .line 452
    const v14, 0x416a8f5c    # 14.66f

    .line 453
    .line 454
    .line 455
    const v15, 0x4055c28f    # 3.34f

    .line 456
    .line 457
    .line 458
    const/high16 v16, 0x41700000    # 15.0f

    .line 459
    .line 460
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const v0, -0x4151eb85    # -0.34f

    .line 464
    .line 465
    .line 466
    const/high16 v2, -0x40c00000    # -0.75f

    .line 467
    .line 468
    const/high16 v4, 0x3f400000    # 0.75f

    .line 469
    .line 470
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v0, 0x41480000    # 12.5f

    .line 474
    .line 475
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const/high16 v0, 0x40000000    # 2.0f

    .line 479
    .line 480
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v0, 0x3fe00000    # 1.75f

    .line 484
    .line 485
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const/high16 v17, 0x40e80000    # 7.25f

    .line 489
    .line 490
    const/high16 v13, 0x40d00000    # 6.5f

    .line 491
    .line 492
    const v15, 0x40dae148    # 6.84f

    .line 493
    .line 494
    .line 495
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const v0, 0x416a8f5c    # 14.66f

    .line 499
    .line 500
    .line 501
    const/high16 v2, 0x41640000    # 14.25f

    .line 502
    .line 503
    const/high16 v4, 0x41000000    # 8.0f

    .line 504
    .line 505
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const v0, -0x3fa51eb8    # -3.42f

    .line 509
    .line 510
    .line 511
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const/high16 v0, 0x40000000    # 2.0f

    .line 515
    .line 516
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/high16 v0, 0x41600000    # 14.0f

    .line 520
    .line 521
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const/high16 v17, 0x3f800000    # 1.0f

    .line 525
    .line 526
    const/high16 v18, 0x3f800000    # 1.0f

    .line 527
    .line 528
    const/4 v13, 0x0

    .line 529
    const v14, 0x3f0ccccd    # 0.55f

    .line 530
    .line 531
    .line 532
    const v15, 0x3ee66666    # 0.45f

    .line 533
    .line 534
    .line 535
    const/high16 v16, 0x3f800000    # 1.0f

    .line 536
    .line 537
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const v0, 0x3f95c28f    # 1.17f

    .line 541
    .line 542
    .line 543
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const v0, 0x41af3333    # 21.9f

    .line 547
    .line 548
    .line 549
    const v2, 0x41988f5c    # 19.07f

    .line 550
    .line 551
    .line 552
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 559
    .line 560
    .line 561
    move-result-object v2

    .line 562
    const/16 v16, 0x3800

    .line 563
    .line 564
    const/16 v17, 0x0

    .line 565
    .line 566
    const/high16 v6, 0x3f800000    # 1.0f

    .line 567
    .line 568
    const/high16 v8, 0x3f800000    # 1.0f

    .line 569
    .line 570
    const/4 v7, 0x0

    .line 571
    const/high16 v9, 0x3f800000    # 1.0f

    .line 572
    .line 573
    const/high16 v12, 0x3f800000    # 1.0f

    .line 574
    .line 575
    const/4 v14, 0x0

    .line 576
    const/4 v15, 0x0

    .line 577
    const-string v4, ""

    .line 578
    .line 579
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    sput-object v0, Landroidx/compose/material/icons/rounded/HlsOffKt;->_hlsOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 588
    .line 589
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 590
    .line 591
    .line 592
    return-object v0
.end method
