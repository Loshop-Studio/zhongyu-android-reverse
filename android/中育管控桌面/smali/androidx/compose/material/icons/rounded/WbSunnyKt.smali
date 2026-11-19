.class public final Landroidx/compose/material/icons/rounded/WbSunnyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_wbSunny",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "WbSunny",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getWbSunny",
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
        "SMAP\nWbSunny.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WbSunny.kt\nandroidx/compose/material/icons/rounded/WbSunnyKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,119:1\n212#2,12:120\n233#2,18:133\n253#2:170\n174#3:132\n705#4,2:151\n717#4,2:153\n719#4,11:159\n72#5,4:155\n*S KotlinDebug\n*F\n+ 1 WbSunny.kt\nandroidx/compose/material/icons/rounded/WbSunnyKt\n*L\n29#1:120,12\n30#1:133,18\n30#1:170\n29#1:132\n30#1:151,2\n30#1:153,2\n30#1:159,11\n30#1:155,4\n*E\n"
    }
.end annotation


# static fields
.field private static _wbSunny:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWbSunny(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/WbSunnyKt;->_wbSunny:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.WbSunny"

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
    const v0, 0x40c1999a    # 6.05f

    .line 71
    .line 72
    .line 73
    const v2, 0x40847ae1    # 4.14f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, -0x413851ec    # -0.39f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const v17, -0x404ccccd    # -1.4f

    .line 86
    .line 87
    .line 88
    const/16 v18, 0x0

    .line 89
    .line 90
    const v13, -0x413851ec    # -0.39f

    .line 91
    .line 92
    .line 93
    const v14, -0x413851ec    # -0.39f

    .line 94
    .line 95
    .line 96
    const v15, -0x407d70a4    # -1.02f

    .line 97
    .line 98
    .line 99
    const v16, -0x413d70a4    # -0.38f

    .line 100
    .line 101
    .line 102
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v0, 0x3c23d70a    # 0.01f

    .line 106
    .line 107
    .line 108
    const v2, -0x43dc28f6    # -0.01f

    .line 109
    .line 110
    .line 111
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/16 v17, 0x0

    .line 115
    .line 116
    const v18, 0x3fb33333    # 1.4f

    .line 117
    .line 118
    .line 119
    const v14, 0x3ec7ae14    # 0.39f

    .line 120
    .line 121
    .line 122
    const v15, -0x413851ec    # -0.39f

    .line 123
    .line 124
    .line 125
    const v16, 0x3f828f5c    # 1.02f

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v0, 0x3ec7ae14    # 0.39f

    .line 132
    .line 133
    .line 134
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v17, 0x3fb33333    # 1.4f

    .line 138
    .line 139
    .line 140
    const/16 v18, 0x0

    .line 141
    .line 142
    const v13, 0x3ec7ae14    # 0.39f

    .line 143
    .line 144
    .line 145
    const v15, 0x3f8147ae    # 1.01f

    .line 146
    .line 147
    .line 148
    const v16, 0x3ec7ae14    # 0.39f

    .line 149
    .line 150
    .line 151
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v0, 0x3c23d70a    # 0.01f

    .line 155
    .line 156
    .line 157
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const/16 v17, 0x0

    .line 161
    .line 162
    const v18, -0x404ccccd    # -1.4f

    .line 163
    .line 164
    .line 165
    const v14, -0x413d70a4    # -0.38f

    .line 166
    .line 167
    .line 168
    const v15, 0x3ec7ae14    # 0.39f

    .line 169
    .line 170
    .line 171
    const v16, -0x407d70a4    # -1.02f

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v0, 0x4040a3d7    # 3.01f

    .line 181
    .line 182
    .line 183
    const/high16 v2, 0x41280000    # 10.5f

    .line 184
    .line 185
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v0, 0x3ffeb852    # 1.99f

    .line 189
    .line 190
    .line 191
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v17, -0x40828f5c    # -0.99f

    .line 195
    .line 196
    .line 197
    const v18, 0x3f7d70a4    # 0.99f

    .line 198
    .line 199
    .line 200
    const v13, -0x40f33333    # -0.55f

    .line 201
    .line 202
    .line 203
    const/4 v14, 0x0

    .line 204
    const v15, -0x40828f5c    # -0.99f

    .line 205
    .line 206
    .line 207
    const v16, 0x3ee147ae    # 0.44f

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v0, 0x3c23d70a    # 0.01f

    .line 214
    .line 215
    .line 216
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v17, 0x3f7d70a4    # 0.99f

    .line 220
    .line 221
    .line 222
    const/4 v13, 0x0

    .line 223
    const v14, 0x3f0ccccd    # 0.55f

    .line 224
    .line 225
    .line 226
    const v15, 0x3ee147ae    # 0.44f

    .line 227
    .line 228
    .line 229
    const v16, 0x3f7d70a4    # 0.99f

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v0, 0x40400000    # 3.0f

    .line 236
    .line 237
    const v2, 0x4147d70a    # 12.49f

    .line 238
    .line 239
    .line 240
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v17, 0x3f800000    # 1.0f

    .line 244
    .line 245
    const v18, -0x40851eb8    # -0.98f

    .line 246
    .line 247
    .line 248
    const v13, 0x3f0f5c29    # 0.56f

    .line 249
    .line 250
    .line 251
    const v14, 0x3c23d70a    # 0.01f

    .line 252
    .line 253
    .line 254
    const/high16 v15, 0x3f800000    # 1.0f

    .line 255
    .line 256
    const v16, -0x4123d70a    # -0.43f

    .line 257
    .line 258
    .line 259
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v0, -0x43dc28f6    # -0.01f

    .line 263
    .line 264
    .line 265
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v17, -0x40828f5c    # -0.99f

    .line 269
    .line 270
    .line 271
    const/high16 v18, -0x40800000    # -1.0f

    .line 272
    .line 273
    const/4 v13, 0x0

    .line 274
    const v14, -0x40f0a3d7    # -0.56f

    .line 275
    .line 276
    .line 277
    const v15, -0x411eb852    # -0.44f

    .line 278
    .line 279
    .line 280
    const/high16 v16, -0x40800000    # -1.0f

    .line 281
    .line 282
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v0, 0x414028f6    # 12.01f

    .line 289
    .line 290
    .line 291
    const v2, 0x3f0ccccd    # 0.55f

    .line 292
    .line 293
    .line 294
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v0, 0x3f0ccccd    # 0.55f

    .line 298
    .line 299
    .line 300
    const/high16 v2, 0x41400000    # 12.0f

    .line 301
    .line 302
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v17, -0x40800000    # -1.0f

    .line 306
    .line 307
    const v18, 0x3f7d70a4    # 0.99f

    .line 308
    .line 309
    .line 310
    const v13, -0x40f0a3d7    # -0.56f

    .line 311
    .line 312
    .line 313
    const/4 v14, 0x0

    .line 314
    const/high16 v15, -0x40800000    # -1.0f

    .line 315
    .line 316
    const v16, 0x3ee147ae    # 0.44f

    .line 317
    .line 318
    .line 319
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v0, 0x3f75c28f    # 0.96f

    .line 323
    .line 324
    .line 325
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const v17, 0x3f7d70a4    # 0.99f

    .line 329
    .line 330
    .line 331
    const/4 v13, 0x0

    .line 332
    const v14, 0x3f0ccccd    # 0.55f

    .line 333
    .line 334
    .line 335
    const v15, 0x3ee147ae    # 0.44f

    .line 336
    .line 337
    .line 338
    const v16, 0x3f7d70a4    # 0.99f

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v0, 0x405f5c29    # 3.49f

    .line 345
    .line 346
    .line 347
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const/high16 v17, 0x3f800000    # 1.0f

    .line 351
    .line 352
    const v18, -0x40851eb8    # -0.98f

    .line 353
    .line 354
    .line 355
    const v13, 0x3f0f5c29    # 0.56f

    .line 356
    .line 357
    .line 358
    const v14, 0x3c23d70a    # 0.01f

    .line 359
    .line 360
    .line 361
    const/high16 v15, 0x3f800000    # 1.0f

    .line 362
    .line 363
    const v16, -0x4123d70a    # -0.43f

    .line 364
    .line 365
    .line 366
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v0, -0x4087ae14    # -0.97f

    .line 370
    .line 371
    .line 372
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v17, -0x40828f5c    # -0.99f

    .line 376
    .line 377
    .line 378
    const v18, -0x40828f5c    # -0.99f

    .line 379
    .line 380
    .line 381
    const/4 v13, 0x0

    .line 382
    const v14, -0x40f33333    # -0.55f

    .line 383
    .line 384
    .line 385
    const v15, -0x411eb852    # -0.44f

    .line 386
    .line 387
    .line 388
    const v16, -0x40828f5c    # -0.99f

    .line 389
    .line 390
    .line 391
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const/high16 v0, 0x419e0000    # 19.75f

    .line 398
    .line 399
    const v2, 0x4070a3d7    # 3.76f

    .line 400
    .line 401
    .line 402
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v17, -0x404b851f    # -1.41f

    .line 406
    .line 407
    .line 408
    const v18, -0x43dc28f6    # -0.01f

    .line 409
    .line 410
    .line 411
    const v13, -0x413851ec    # -0.39f

    .line 412
    .line 413
    .line 414
    const v14, -0x413851ec    # -0.39f

    .line 415
    .line 416
    .line 417
    const v15, -0x407d70a4    # -1.02f

    .line 418
    .line 419
    .line 420
    const v16, -0x413851ec    # -0.39f

    .line 421
    .line 422
    .line 423
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const v0, 0x3ec7ae14    # 0.39f

    .line 427
    .line 428
    .line 429
    const v2, -0x413851ec    # -0.39f

    .line 430
    .line 431
    .line 432
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/16 v17, 0x0

    .line 436
    .line 437
    const v18, 0x3fb33333    # 1.4f

    .line 438
    .line 439
    .line 440
    const v14, 0x3ec7ae14    # 0.39f

    .line 441
    .line 442
    .line 443
    const v15, -0x413851ec    # -0.39f

    .line 444
    .line 445
    .line 446
    const v16, 0x3f828f5c    # 1.02f

    .line 447
    .line 448
    .line 449
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v0, 0x3c23d70a    # 0.01f

    .line 453
    .line 454
    .line 455
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const v17, 0x3fb33333    # 1.4f

    .line 459
    .line 460
    .line 461
    const/16 v18, 0x0

    .line 462
    .line 463
    const v13, 0x3ec7ae14    # 0.39f

    .line 464
    .line 465
    .line 466
    const v15, 0x3f828f5c    # 1.02f

    .line 467
    .line 468
    .line 469
    const v16, 0x3ec7ae14    # 0.39f

    .line 470
    .line 471
    .line 472
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const v0, 0x3ec7ae14    # 0.39f

    .line 476
    .line 477
    .line 478
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const/16 v17, 0x0

    .line 482
    .line 483
    const v18, -0x404ccccd    # -1.4f

    .line 484
    .line 485
    .line 486
    const v14, -0x413851ec    # -0.39f

    .line 487
    .line 488
    .line 489
    const v15, 0x3ec7ae14    # 0.39f

    .line 490
    .line 491
    .line 492
    const v16, -0x407eb852    # -1.01f

    .line 493
    .line 494
    .line 495
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const v0, 0x418f851f    # 17.94f

    .line 502
    .line 503
    .line 504
    const v2, 0x4196e148    # 18.86f

    .line 505
    .line 506
    .line 507
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const v0, 0x3ec7ae14    # 0.39f

    .line 511
    .line 512
    .line 513
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const v17, 0x3fb47ae1    # 1.41f

    .line 517
    .line 518
    .line 519
    const/16 v18, 0x0

    .line 520
    .line 521
    const v14, 0x3ec7ae14    # 0.39f

    .line 522
    .line 523
    .line 524
    const v15, 0x3f828f5c    # 1.02f

    .line 525
    .line 526
    .line 527
    const v16, 0x3ec7ae14    # 0.39f

    .line 528
    .line 529
    .line 530
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const/16 v17, 0x0

    .line 534
    .line 535
    const v18, -0x404b851f    # -1.41f

    .line 536
    .line 537
    .line 538
    const v14, -0x413851ec    # -0.39f

    .line 539
    .line 540
    .line 541
    const v15, 0x3ec7ae14    # 0.39f

    .line 542
    .line 543
    .line 544
    const v16, -0x407d70a4    # -1.02f

    .line 545
    .line 546
    .line 547
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const v0, -0x413851ec    # -0.39f

    .line 551
    .line 552
    .line 553
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const v17, -0x404ccccd    # -1.4f

    .line 557
    .line 558
    .line 559
    const/16 v18, 0x0

    .line 560
    .line 561
    const v13, -0x413851ec    # -0.39f

    .line 562
    .line 563
    .line 564
    const v15, -0x407d70a4    # -1.02f

    .line 565
    .line 566
    .line 567
    const v16, -0x413d70a4    # -0.38f

    .line 568
    .line 569
    .line 570
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const v17, -0x43dc28f6    # -0.01f

    .line 574
    .line 575
    .line 576
    const v18, 0x3fb47ae1    # 1.41f

    .line 577
    .line 578
    .line 579
    const v13, -0x41333333    # -0.4f

    .line 580
    .line 581
    .line 582
    const v14, 0x3ecccccd    # 0.4f

    .line 583
    .line 584
    .line 585
    const v15, -0x41333333    # -0.4f

    .line 586
    .line 587
    .line 588
    const v16, 0x3f828f5c    # 1.02f

    .line 589
    .line 590
    .line 591
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const/high16 v0, 0x41a00000    # 20.0f

    .line 598
    .line 599
    const v2, 0x4137d70a    # 11.49f

    .line 600
    .line 601
    .line 602
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const v0, 0x3c23d70a    # 0.01f

    .line 606
    .line 607
    .line 608
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const v17, 0x3f7d70a4    # 0.99f

    .line 612
    .line 613
    .line 614
    const v18, 0x3f7d70a4    # 0.99f

    .line 615
    .line 616
    .line 617
    const/4 v13, 0x0

    .line 618
    const v14, 0x3f0ccccd    # 0.55f

    .line 619
    .line 620
    .line 621
    const v15, 0x3ee147ae    # 0.44f

    .line 622
    .line 623
    .line 624
    const v16, 0x3f7d70a4    # 0.99f

    .line 625
    .line 626
    .line 627
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    const/high16 v0, 0x41b00000    # 22.0f

    .line 631
    .line 632
    const v2, 0x4147d70a    # 12.49f

    .line 633
    .line 634
    .line 635
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const v18, -0x40828f5c    # -0.99f

    .line 639
    .line 640
    .line 641
    const v13, 0x3f0ccccd    # 0.55f

    .line 642
    .line 643
    .line 644
    const/4 v14, 0x0

    .line 645
    const v15, 0x3f7d70a4    # 0.99f

    .line 646
    .line 647
    .line 648
    const v16, -0x411eb852    # -0.44f

    .line 649
    .line 650
    .line 651
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    const v0, -0x43dc28f6    # -0.01f

    .line 655
    .line 656
    .line 657
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const v17, -0x40828f5c    # -0.99f

    .line 661
    .line 662
    .line 663
    const/4 v13, 0x0

    .line 664
    const v14, -0x40f33333    # -0.55f

    .line 665
    .line 666
    .line 667
    const v15, -0x411eb852    # -0.44f

    .line 668
    .line 669
    .line 670
    const v16, -0x40828f5c    # -0.99f

    .line 671
    .line 672
    .line 673
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const v0, -0x407eb852    # -1.01f

    .line 677
    .line 678
    .line 679
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    const v18, 0x3f7d70a4    # 0.99f

    .line 683
    .line 684
    .line 685
    const v13, -0x40f33333    # -0.55f

    .line 686
    .line 687
    .line 688
    const/4 v14, 0x0

    .line 689
    const v15, -0x40828f5c    # -0.99f

    .line 690
    .line 691
    .line 692
    const v16, 0x3ee147ae    # 0.44f

    .line 693
    .line 694
    .line 695
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 696
    .line 697
    .line 698
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    const/high16 v0, 0x40b00000    # 5.5f

    .line 702
    .line 703
    const/high16 v2, 0x41400000    # 12.0f

    .line 704
    .line 705
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 706
    .line 707
    .line 708
    const/high16 v17, -0x3f400000    # -6.0f

    .line 709
    .line 710
    const/high16 v18, 0x40c00000    # 6.0f

    .line 711
    .line 712
    const v13, -0x3fac28f6    # -3.31f

    .line 713
    .line 714
    .line 715
    const/high16 v15, -0x3f400000    # -6.0f

    .line 716
    .line 717
    const v16, 0x402c28f6    # 2.69f

    .line 718
    .line 719
    .line 720
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 721
    .line 722
    .line 723
    const v0, 0x402c28f6    # 2.69f

    .line 724
    .line 725
    .line 726
    const/high16 v2, 0x40c00000    # 6.0f

    .line 727
    .line 728
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    const v0, -0x3fd3d70a    # -2.69f

    .line 732
    .line 733
    .line 734
    const/high16 v2, -0x3f400000    # -6.0f

    .line 735
    .line 736
    const/high16 v4, 0x40c00000    # 6.0f

    .line 737
    .line 738
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 739
    .line 740
    .line 741
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 742
    .line 743
    .line 744
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 745
    .line 746
    .line 747
    const v0, 0x413fd70a    # 11.99f

    .line 748
    .line 749
    .line 750
    const v2, 0x41b3999a    # 22.45f

    .line 751
    .line 752
    .line 753
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 754
    .line 755
    .line 756
    const v0, 0x41b3999a    # 22.45f

    .line 757
    .line 758
    .line 759
    const/high16 v2, 0x41400000    # 12.0f

    .line 760
    .line 761
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 762
    .line 763
    .line 764
    const v17, 0x3f7d70a4    # 0.99f

    .line 765
    .line 766
    .line 767
    const v18, -0x40828f5c    # -0.99f

    .line 768
    .line 769
    .line 770
    const v13, 0x3f0ccccd    # 0.55f

    .line 771
    .line 772
    .line 773
    const v15, 0x3f7d70a4    # 0.99f

    .line 774
    .line 775
    .line 776
    const v16, -0x411eb852    # -0.44f

    .line 777
    .line 778
    .line 779
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 780
    .line 781
    .line 782
    const v0, -0x408a3d71    # -0.96f

    .line 783
    .line 784
    .line 785
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 786
    .line 787
    .line 788
    const v17, -0x40828f5c    # -0.99f

    .line 789
    .line 790
    .line 791
    const/4 v13, 0x0

    .line 792
    const v14, -0x40f33333    # -0.55f

    .line 793
    .line 794
    .line 795
    const v15, -0x411eb852    # -0.44f

    .line 796
    .line 797
    .line 798
    const v16, -0x40828f5c    # -0.99f

    .line 799
    .line 800
    .line 801
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 802
    .line 803
    .line 804
    const v0, -0x43dc28f6    # -0.01f

    .line 805
    .line 806
    .line 807
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 808
    .line 809
    .line 810
    const v18, 0x3f7d70a4    # 0.99f

    .line 811
    .line 812
    .line 813
    const v13, -0x40f33333    # -0.55f

    .line 814
    .line 815
    .line 816
    const/4 v14, 0x0

    .line 817
    const v15, -0x40828f5c    # -0.99f

    .line 818
    .line 819
    .line 820
    const v16, 0x3ee147ae    # 0.44f

    .line 821
    .line 822
    .line 823
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 824
    .line 825
    .line 826
    const v0, 0x3f75c28f    # 0.96f

    .line 827
    .line 828
    .line 829
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 830
    .line 831
    .line 832
    const v17, 0x3f7d70a4    # 0.99f

    .line 833
    .line 834
    .line 835
    const/4 v13, 0x0

    .line 836
    const v14, 0x3f0ccccd    # 0.55f

    .line 837
    .line 838
    .line 839
    const v15, 0x3ee147ae    # 0.44f

    .line 840
    .line 841
    .line 842
    const v16, 0x3f7d70a4    # 0.99f

    .line 843
    .line 844
    .line 845
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 846
    .line 847
    .line 848
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 849
    .line 850
    .line 851
    const/high16 v0, 0x40880000    # 4.25f

    .line 852
    .line 853
    const v2, 0x4199eb85    # 19.24f

    .line 854
    .line 855
    .line 856
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 857
    .line 858
    .line 859
    const v17, 0x3fb47ae1    # 1.41f

    .line 860
    .line 861
    .line 862
    const/16 v18, 0x0

    .line 863
    .line 864
    const v13, 0x3ec7ae14    # 0.39f

    .line 865
    .line 866
    .line 867
    const v14, 0x3ec7ae14    # 0.39f

    .line 868
    .line 869
    .line 870
    const v15, 0x3f828f5c    # 1.02f

    .line 871
    .line 872
    .line 873
    const v16, 0x3ec7ae14    # 0.39f

    .line 874
    .line 875
    .line 876
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 877
    .line 878
    .line 879
    const v0, 0x3ec7ae14    # 0.39f

    .line 880
    .line 881
    .line 882
    const v2, -0x413851ec    # -0.39f

    .line 883
    .line 884
    .line 885
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 886
    .line 887
    .line 888
    const/16 v17, 0x0

    .line 889
    .line 890
    const v18, -0x404ccccd    # -1.4f

    .line 891
    .line 892
    .line 893
    const v14, -0x413851ec    # -0.39f

    .line 894
    .line 895
    .line 896
    const v15, 0x3ec28f5c    # 0.38f

    .line 897
    .line 898
    .line 899
    const v16, -0x407d70a4    # -1.02f

    .line 900
    .line 901
    .line 902
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 903
    .line 904
    .line 905
    const v0, -0x43dc28f6    # -0.01f

    .line 906
    .line 907
    .line 908
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 909
    .line 910
    .line 911
    const v17, -0x404b851f    # -1.41f

    .line 912
    .line 913
    .line 914
    const/16 v18, 0x0

    .line 915
    .line 916
    const v13, -0x413851ec    # -0.39f

    .line 917
    .line 918
    .line 919
    const v15, -0x407d70a4    # -1.02f

    .line 920
    .line 921
    .line 922
    const v16, -0x413851ec    # -0.39f

    .line 923
    .line 924
    .line 925
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 926
    .line 927
    .line 928
    const v0, 0x3ec7ae14    # 0.39f

    .line 929
    .line 930
    .line 931
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 932
    .line 933
    .line 934
    const v17, 0x3c23d70a    # 0.01f

    .line 935
    .line 936
    .line 937
    const v18, 0x3fb47ae1    # 1.41f

    .line 938
    .line 939
    .line 940
    const v13, -0x413d70a4    # -0.38f

    .line 941
    .line 942
    .line 943
    const v14, 0x3ecccccd    # 0.4f

    .line 944
    .line 945
    .line 946
    const v15, -0x413d70a4    # -0.38f

    .line 947
    .line 948
    .line 949
    const v16, 0x3f828f5c    # 1.02f

    .line 950
    .line 951
    .line 952
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 953
    .line 954
    .line 955
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 956
    .line 957
    .line 958
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 959
    .line 960
    .line 961
    move-result-object v2

    .line 962
    const/16 v16, 0x3800

    .line 963
    .line 964
    const/16 v17, 0x0

    .line 965
    .line 966
    const/high16 v6, 0x3f800000    # 1.0f

    .line 967
    .line 968
    const/high16 v8, 0x3f800000    # 1.0f

    .line 969
    .line 970
    const/4 v7, 0x0

    .line 971
    const/high16 v9, 0x3f800000    # 1.0f

    .line 972
    .line 973
    const/high16 v12, 0x3f800000    # 1.0f

    .line 974
    .line 975
    const/4 v13, 0x0

    .line 976
    const/4 v14, 0x0

    .line 977
    const/4 v15, 0x0

    .line 978
    const-string v4, ""

    .line 979
    .line 980
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 981
    .line 982
    .line 983
    move-result-object v0

    .line 984
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 985
    .line 986
    .line 987
    move-result-object v0

    .line 988
    sput-object v0, Landroidx/compose/material/icons/rounded/WbSunnyKt;->_wbSunny:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 989
    .line 990
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 991
    .line 992
    .line 993
    return-object v0
.end method
