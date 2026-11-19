.class public final Landroidx/compose/material/icons/rounded/OpenInNewOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_openInNewOff",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "OpenInNewOff",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getOpenInNewOff",
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
        "SMAP\nOpenInNewOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpenInNewOff.kt\nandroidx/compose/material/icons/rounded/OpenInNewOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,90:1\n212#2,12:91\n233#2,18:104\n253#2:141\n174#3:103\n705#4,2:122\n717#4,2:124\n719#4,11:130\n72#5,4:126\n*S KotlinDebug\n*F\n+ 1 OpenInNewOff.kt\nandroidx/compose/material/icons/rounded/OpenInNewOffKt\n*L\n29#1:91,12\n30#1:104,18\n30#1:141\n29#1:103\n30#1:122,2\n30#1:124,2\n30#1:130,11\n30#1:126,4\n*E\n"
    }
.end annotation


# static fields
.field private static _openInNewOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getOpenInNewOff(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/OpenInNewOffKt;->_openInNewOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.OpenInNewOff"

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
    const v0, 0x40b9999a    # 5.8f

    .line 71
    .line 72
    .line 73
    const v2, 0x418651ec    # 16.79f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, -0x4007ae14    # -1.94f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const v17, 0x41735c29    # 15.21f

    .line 86
    .line 87
    .line 88
    const/high16 v18, 0x40400000    # 3.0f

    .line 89
    .line 90
    const v13, 0x4168a3d7    # 14.54f

    .line 91
    .line 92
    .line 93
    const v14, 0x40628f5c    # 3.54f

    .line 94
    .line 95
    .line 96
    const v15, 0x416c28f6    # 14.76f

    .line 97
    .line 98
    .line 99
    const/high16 v16, 0x40400000    # 3.0f

    .line 100
    .line 101
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v0, 0x40a947ae    # 5.29f

    .line 105
    .line 106
    .line 107
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const/high16 v17, 0x41a80000    # 21.0f

    .line 111
    .line 112
    const/high16 v18, 0x40600000    # 3.5f

    .line 113
    .line 114
    const v13, 0x41a63d71    # 20.78f

    .line 115
    .line 116
    .line 117
    const/high16 v14, 0x40400000    # 3.0f

    .line 118
    .line 119
    const/high16 v15, 0x41a80000    # 21.0f

    .line 120
    .line 121
    const v16, 0x404e147b    # 3.22f

    .line 122
    .line 123
    .line 124
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v17, -0x40a66666    # -0.85f

    .line 131
    .line 132
    .line 133
    const v18, 0x3eb33333    # 0.35f

    .line 134
    .line 135
    .line 136
    const/4 v13, 0x0

    .line 137
    const v14, 0x3ee66666    # 0.45f

    .line 138
    .line 139
    .line 140
    const v15, -0x40f5c28f    # -0.54f

    .line 141
    .line 142
    .line 143
    const v16, 0x3f2b851f    # 0.67f

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v0, 0x4191ae14    # 18.21f

    .line 150
    .line 151
    .line 152
    const v2, 0x40e66666    # 7.2f

    .line 153
    .line 154
    .line 155
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v0, -0x3f7d1eb8    # -4.09f

    .line 159
    .line 160
    .line 161
    const v2, 0x4082e148    # 4.09f

    .line 162
    .line 163
    .line 164
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v0, -0x404b851f    # -1.41f

    .line 168
    .line 169
    .line 170
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v0, 0x40b9999a    # 5.8f

    .line 174
    .line 175
    .line 176
    const v2, 0x418651ec    # 16.79f

    .line 177
    .line 178
    .line 179
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const/high16 v0, 0x41500000    # 13.0f

    .line 186
    .line 187
    const/high16 v2, 0x41980000    # 19.0f

    .line 188
    .line 189
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v0, 0x404ae148    # 3.17f

    .line 193
    .line 194
    .line 195
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v0, 0x40000000    # 2.0f

    .line 199
    .line 200
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const/high16 v0, 0x41500000    # 13.0f

    .line 204
    .line 205
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v17, -0x40800000    # -1.0f

    .line 209
    .line 210
    const/high16 v18, -0x40800000    # -1.0f

    .line 211
    .line 212
    const v14, -0x40f33333    # -0.55f

    .line 213
    .line 214
    .line 215
    const v15, -0x4119999a    # -0.45f

    .line 216
    .line 217
    .line 218
    const/high16 v16, -0x40800000    # -1.0f

    .line 219
    .line 220
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v0, 0x41a00000    # 20.0f

    .line 224
    .line 225
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v17, 0x41980000    # 19.0f

    .line 229
    .line 230
    const/high16 v18, 0x41500000    # 13.0f

    .line 231
    .line 232
    const v13, 0x419b999a    # 19.45f

    .line 233
    .line 234
    .line 235
    const/high16 v14, 0x41400000    # 12.0f

    .line 236
    .line 237
    const/high16 v15, 0x41980000    # 19.0f

    .line 238
    .line 239
    const v16, 0x41473333    # 12.45f

    .line 240
    .line 241
    .line 242
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v0, 0x41988f5c    # 19.07f

    .line 249
    .line 250
    .line 251
    const v2, 0x41af3333    # 21.9f

    .line 252
    .line 253
    .line 254
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v0, -0x4099999a    # -0.9f

    .line 258
    .line 259
    .line 260
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v0, 0x40a00000    # 5.0f

    .line 264
    .line 265
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v17, -0x40000000    # -2.0f

    .line 269
    .line 270
    const/high16 v18, -0x40000000    # -2.0f

    .line 271
    .line 272
    const v13, -0x4071eb85    # -1.11f

    .line 273
    .line 274
    .line 275
    const/4 v14, 0x0

    .line 276
    const/high16 v15, -0x40000000    # -2.0f

    .line 277
    .line 278
    const v16, -0x4099999a    # -0.9f

    .line 279
    .line 280
    .line 281
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v0, 0x40ba8f5c    # 5.83f

    .line 285
    .line 286
    .line 287
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v0, -0x4099999a    # -0.9f

    .line 291
    .line 292
    .line 293
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const/16 v17, 0x0

    .line 297
    .line 298
    const v18, -0x404b851f    # -1.41f

    .line 299
    .line 300
    .line 301
    const v13, -0x413851ec    # -0.39f

    .line 302
    .line 303
    .line 304
    const v14, -0x413851ec    # -0.39f

    .line 305
    .line 306
    .line 307
    const v15, -0x413851ec    # -0.39f

    .line 308
    .line 309
    .line 310
    const v16, -0x407d70a4    # -1.02f

    .line 311
    .line 312
    .line 313
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const/4 v0, 0x0

    .line 317
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v17, 0x3fb47ae1    # 1.41f

    .line 321
    .line 322
    .line 323
    const/16 v18, 0x0

    .line 324
    .line 325
    const v13, 0x3ec7ae14    # 0.39f

    .line 326
    .line 327
    .line 328
    const v15, 0x3f828f5c    # 1.02f

    .line 329
    .line 330
    .line 331
    const v16, -0x413851ec    # -0.39f

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v0, 0x4187c28f    # 16.97f

    .line 338
    .line 339
    .line 340
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const/16 v17, 0x0

    .line 344
    .line 345
    const v18, 0x3fb47ae1    # 1.41f

    .line 346
    .line 347
    .line 348
    const v14, 0x3ec7ae14    # 0.39f

    .line 349
    .line 350
    .line 351
    const v15, 0x3ec7ae14    # 0.39f

    .line 352
    .line 353
    .line 354
    const v16, 0x3f828f5c    # 1.02f

    .line 355
    .line 356
    .line 357
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/4 v0, 0x0

    .line 361
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const v17, 0x41988f5c    # 19.07f

    .line 365
    .line 366
    .line 367
    const v18, 0x41af3333    # 21.9f

    .line 368
    .line 369
    .line 370
    const v13, 0x41a0b852    # 20.09f

    .line 371
    .line 372
    .line 373
    const v14, 0x41b251ec    # 22.29f

    .line 374
    .line 375
    .line 376
    const v15, 0x419bae14    # 19.46f

    .line 377
    .line 378
    .line 379
    const v16, 0x41b251ec    # 22.29f

    .line 380
    .line 381
    .line 382
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v0, 0x41815c29    # 16.17f

    .line 389
    .line 390
    .line 391
    const/high16 v2, 0x41980000    # 19.0f

    .line 392
    .line 393
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v0, -0x3f63d70a    # -4.88f

    .line 397
    .line 398
    .line 399
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v0, 0x41268f5c    # 10.41f

    .line 403
    .line 404
    .line 405
    const/high16 v2, 0x41700000    # 15.0f

    .line 406
    .line 407
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v17, -0x404b851f    # -1.41f

    .line 411
    .line 412
    .line 413
    const/16 v18, 0x0

    .line 414
    .line 415
    const v13, -0x413851ec    # -0.39f

    .line 416
    .line 417
    .line 418
    const v14, 0x3ec7ae14    # 0.39f

    .line 419
    .line 420
    .line 421
    const v15, -0x407d70a4    # -1.02f

    .line 422
    .line 423
    .line 424
    const v16, 0x3ec7ae14    # 0.39f

    .line 425
    .line 426
    .line 427
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/4 v0, 0x0

    .line 431
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/16 v17, 0x0

    .line 435
    .line 436
    const v18, -0x404b851f    # -1.41f

    .line 437
    .line 438
    .line 439
    const v14, -0x413851ec    # -0.39f

    .line 440
    .line 441
    .line 442
    const v15, -0x413851ec    # -0.39f

    .line 443
    .line 444
    .line 445
    const v16, -0x407d70a4    # -1.02f

    .line 446
    .line 447
    .line 448
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v0, 0x3f6147ae    # 0.88f

    .line 452
    .line 453
    .line 454
    const v2, -0x409eb852    # -0.88f

    .line 455
    .line 456
    .line 457
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v0, 0x40fa8f5c    # 7.83f

    .line 461
    .line 462
    .line 463
    const/high16 v2, 0x40a00000    # 5.0f

    .line 464
    .line 465
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const/high16 v0, 0x41980000    # 19.0f

    .line 469
    .line 470
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const v0, 0x41815c29    # 16.17f

    .line 474
    .line 475
    .line 476
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v0, 0x40fa8f5c    # 7.83f

    .line 483
    .line 484
    .line 485
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const/high16 v0, 0x41300000    # 11.0f

    .line 489
    .line 490
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v17, 0x3f800000    # 1.0f

    .line 494
    .line 495
    const/high16 v18, -0x40800000    # -1.0f

    .line 496
    .line 497
    const v13, 0x3f0ccccd    # 0.55f

    .line 498
    .line 499
    .line 500
    const/4 v14, 0x0

    .line 501
    const/high16 v15, 0x3f800000    # 1.0f

    .line 502
    .line 503
    const v16, -0x4119999a    # -0.45f

    .line 504
    .line 505
    .line 506
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const/high16 v0, 0x40800000    # 4.0f

    .line 510
    .line 511
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const/high16 v17, -0x40800000    # -1.0f

    .line 515
    .line 516
    const/4 v13, 0x0

    .line 517
    const v14, -0x40f33333    # -0.55f

    .line 518
    .line 519
    .line 520
    const v15, -0x4119999a    # -0.45f

    .line 521
    .line 522
    .line 523
    const/high16 v16, -0x40800000    # -1.0f

    .line 524
    .line 525
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const v0, 0x40ba8f5c    # 5.83f

    .line 529
    .line 530
    .line 531
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const v0, 0x40fa8f5c    # 7.83f

    .line 535
    .line 536
    .line 537
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 544
    .line 545
    .line 546
    move-result-object v2

    .line 547
    const/16 v16, 0x3800

    .line 548
    .line 549
    const/16 v17, 0x0

    .line 550
    .line 551
    const/high16 v6, 0x3f800000    # 1.0f

    .line 552
    .line 553
    const/high16 v8, 0x3f800000    # 1.0f

    .line 554
    .line 555
    const/4 v7, 0x0

    .line 556
    const/high16 v9, 0x3f800000    # 1.0f

    .line 557
    .line 558
    const/high16 v12, 0x3f800000    # 1.0f

    .line 559
    .line 560
    const/4 v14, 0x0

    .line 561
    const/4 v15, 0x0

    .line 562
    const-string v4, ""

    .line 563
    .line 564
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 565
    .line 566
    .line 567
    move-result-object v0

    .line 568
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 569
    .line 570
    .line 571
    move-result-object v0

    .line 572
    sput-object v0, Landroidx/compose/material/icons/rounded/OpenInNewOffKt;->_openInNewOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 573
    .line 574
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 575
    .line 576
    .line 577
    return-object v0
.end method
