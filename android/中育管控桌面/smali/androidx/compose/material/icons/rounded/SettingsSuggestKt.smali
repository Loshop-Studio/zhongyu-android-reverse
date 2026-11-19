.class public final Landroidx/compose/material/icons/rounded/SettingsSuggestKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_settingsSuggest",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SettingsSuggest",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getSettingsSuggest",
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
        "SMAP\nSettingsSuggest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsSuggest.kt\nandroidx/compose/material/icons/rounded/SettingsSuggestKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,111:1\n212#2,12:112\n233#2,18:125\n253#2:162\n174#3:124\n705#4,2:143\n717#4,2:145\n719#4,11:151\n72#5,4:147\n*S KotlinDebug\n*F\n+ 1 SettingsSuggest.kt\nandroidx/compose/material/icons/rounded/SettingsSuggestKt\n*L\n29#1:112,12\n30#1:125,18\n30#1:162\n29#1:124\n30#1:143,2\n30#1:145,2\n30#1:151,11\n30#1:147,4\n*E\n"
    }
.end annotation


# static fields
.field private static _settingsSuggest:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSettingsSuggest(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SettingsSuggestKt;->_settingsSuggest:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SettingsSuggest"

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
    const v0, 0x419051ec    # 18.04f

    .line 71
    .line 72
    .line 73
    const v2, 0x40ffae14    # 7.99f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, -0x404ccccd    # -1.4f

    .line 80
    .line 81
    .line 82
    const v2, -0x40deb852    # -0.63f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 89
    .line 90
    .line 91
    const/16 v17, 0x0

    .line 92
    .line 93
    const v18, -0x40970a3d    # -0.91f

    .line 94
    .line 95
    .line 96
    const v13, -0x413851ec    # -0.39f

    .line 97
    .line 98
    .line 99
    const v14, -0x41c7ae14    # -0.18f

    .line 100
    .line 101
    .line 102
    const v15, -0x413851ec    # -0.39f

    .line 103
    .line 104
    .line 105
    const v16, -0x40c51eb8    # -0.73f

    .line 106
    .line 107
    .line 108
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v0, 0x3fb33333    # 1.4f

    .line 112
    .line 113
    .line 114
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v0, 0x3f2147ae    # 0.63f

    .line 118
    .line 119
    .line 120
    const v2, -0x404ccccd    # -1.4f

    .line 121
    .line 122
    .line 123
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v17, 0x3f68f5c3    # 0.91f

    .line 127
    .line 128
    .line 129
    const/16 v18, 0x0

    .line 130
    .line 131
    const v13, 0x3e3851ec    # 0.18f

    .line 132
    .line 133
    .line 134
    const v14, -0x413851ec    # -0.39f

    .line 135
    .line 136
    .line 137
    const v15, 0x3f3ae148    # 0.73f

    .line 138
    .line 139
    .line 140
    const v16, -0x413851ec    # -0.39f

    .line 141
    .line 142
    .line 143
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const v2, 0x3fb33333    # 1.4f

    .line 147
    .line 148
    .line 149
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const/16 v17, 0x0

    .line 156
    .line 157
    const v18, 0x3f68f5c3    # 0.91f

    .line 158
    .line 159
    .line 160
    const v13, 0x3ec7ae14    # 0.39f

    .line 161
    .line 162
    .line 163
    const v14, 0x3e3851ec    # 0.18f

    .line 164
    .line 165
    .line 166
    const v15, 0x3ec7ae14    # 0.39f

    .line 167
    .line 168
    .line 169
    const v16, 0x3f3ae148    # 0.73f

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v2, -0x404ccccd    # -1.4f

    .line 176
    .line 177
    .line 178
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v0, 0x3fb33333    # 1.4f

    .line 182
    .line 183
    .line 184
    const v2, -0x40deb852    # -0.63f

    .line 185
    .line 186
    .line 187
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v17, 0x419051ec    # 18.04f

    .line 191
    .line 192
    .line 193
    const v18, 0x40ffae14    # 7.99f

    .line 194
    .line 195
    .line 196
    const v13, 0x41963d71    # 18.78f

    .line 197
    .line 198
    .line 199
    const v14, 0x4106147b    # 8.38f

    .line 200
    .line 201
    .line 202
    const v15, 0x4191c28f    # 18.22f

    .line 203
    .line 204
    .line 205
    const v16, 0x4106147b    # 8.38f

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v0, 0x414b851f    # 12.72f

    .line 215
    .line 216
    .line 217
    const v2, 0x41aa3d71    # 21.28f

    .line 218
    .line 219
    .line 220
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const v0, 0x41a7ae14    # 20.96f

    .line 224
    .line 225
    .line 226
    const/high16 v2, 0x41400000    # 12.0f

    .line 227
    .line 228
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v17, -0x40970a3d    # -0.91f

    .line 232
    .line 233
    .line 234
    const/16 v18, 0x0

    .line 235
    .line 236
    const v13, -0x41c7ae14    # -0.18f

    .line 237
    .line 238
    .line 239
    const v14, -0x413851ec    # -0.39f

    .line 240
    .line 241
    .line 242
    const v15, -0x40c51eb8    # -0.73f

    .line 243
    .line 244
    .line 245
    const v16, -0x413851ec    # -0.39f

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v0, -0x415c28f6    # -0.32f

    .line 252
    .line 253
    .line 254
    const v2, 0x3f3851ec    # 0.72f

    .line 255
    .line 256
    .line 257
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v0, 0x41980000    # 19.0f

    .line 261
    .line 262
    const v2, 0x4150a3d7    # 13.04f

    .line 263
    .line 264
    .line 265
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/16 v17, 0x0

    .line 269
    .line 270
    const v18, 0x3f68f5c3    # 0.91f

    .line 271
    .line 272
    .line 273
    const v13, -0x413851ec    # -0.39f

    .line 274
    .line 275
    .line 276
    const v14, 0x3e3851ec    # 0.18f

    .line 277
    .line 278
    .line 279
    const v15, -0x413851ec    # -0.39f

    .line 280
    .line 281
    .line 282
    const v16, 0x3f3ae148    # 0.73f

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v0, 0x3ea3d70a    # 0.32f

    .line 289
    .line 290
    .line 291
    const v2, 0x3f3851ec    # 0.72f

    .line 292
    .line 293
    .line 294
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v0, 0x41a051ec    # 20.04f

    .line 298
    .line 299
    .line 300
    const/high16 v2, 0x41700000    # 15.0f

    .line 301
    .line 302
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v17, 0x3f68f5c3    # 0.91f

    .line 306
    .line 307
    .line 308
    const/16 v18, 0x0

    .line 309
    .line 310
    const v13, 0x3e3851ec    # 0.18f

    .line 311
    .line 312
    .line 313
    const v14, 0x3ec7ae14    # 0.39f

    .line 314
    .line 315
    .line 316
    const v15, 0x3f3ae148    # 0.73f

    .line 317
    .line 318
    .line 319
    const v16, 0x3ec7ae14    # 0.39f

    .line 320
    .line 321
    .line 322
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const v0, -0x40c7ae14    # -0.72f

    .line 326
    .line 327
    .line 328
    const v2, 0x3ea3d70a    # 0.32f

    .line 329
    .line 330
    .line 331
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const/high16 v0, 0x41b00000    # 22.0f

    .line 335
    .line 336
    const v2, 0x415f5c29    # 13.96f

    .line 337
    .line 338
    .line 339
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/16 v17, 0x0

    .line 343
    .line 344
    const v18, -0x40970a3d    # -0.91f

    .line 345
    .line 346
    .line 347
    const v13, 0x3ec7ae14    # 0.39f

    .line 348
    .line 349
    .line 350
    const v14, -0x41c7ae14    # -0.18f

    .line 351
    .line 352
    .line 353
    const v15, 0x3ec7ae14    # 0.39f

    .line 354
    .line 355
    .line 356
    const v16, -0x40c51eb8    # -0.73f

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v0, 0x414b851f    # 12.72f

    .line 363
    .line 364
    .line 365
    const v2, 0x41aa3d71    # 21.28f

    .line 366
    .line 367
    .line 368
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v0, 0x4165eb85    # 14.37f

    .line 375
    .line 376
    .line 377
    const v2, 0x4181eb85    # 16.24f

    .line 378
    .line 379
    .line 380
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v0, 0x3f6e147b    # 0.93f

    .line 384
    .line 385
    .line 386
    const v2, 0x3f9d70a4    # 1.23f

    .line 387
    .line 388
    .line 389
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v17, 0x3e851eb8    # 0.26f

    .line 393
    .line 394
    .line 395
    const v18, 0x3fa66666    # 1.3f

    .line 396
    .line 397
    .line 398
    const v13, 0x3ecccccd    # 0.4f

    .line 399
    .line 400
    .line 401
    const v14, 0x3e99999a    # 0.3f

    .line 402
    .line 403
    .line 404
    const v15, 0x3f028f5c    # 0.51f

    .line 405
    .line 406
    .line 407
    const v16, 0x3f5c28f6    # 0.86f

    .line 408
    .line 409
    .line 410
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v0, 0x40333333    # 2.8f

    .line 414
    .line 415
    .line 416
    const v2, -0x4030a3d7    # -1.62f

    .line 417
    .line 418
    .line 419
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const/high16 v17, -0x40600000    # -1.25f

    .line 423
    .line 424
    const v18, 0x3ed70a3d    # 0.42f

    .line 425
    .line 426
    .line 427
    const/high16 v13, -0x41800000    # -0.25f

    .line 428
    .line 429
    const v14, 0x3ee147ae    # 0.44f

    .line 430
    .line 431
    .line 432
    const v15, -0x40b5c28f    # -0.79f

    .line 433
    .line 434
    .line 435
    const v16, 0x3f1eb852    # 0.62f

    .line 436
    .line 437
    .line 438
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v0, -0x40e66666    # -0.6f

    .line 442
    .line 443
    .line 444
    const v2, -0x4048f5c3    # -1.43f

    .line 445
    .line 446
    .line 447
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v17, -0x40dc28f6    # -0.64f

    .line 451
    .line 452
    .line 453
    const v18, 0x3ebd70a4    # 0.37f

    .line 454
    .line 455
    .line 456
    const v13, -0x41b33333    # -0.2f

    .line 457
    .line 458
    .line 459
    const v14, 0x3e051eb8    # 0.13f

    .line 460
    .line 461
    .line 462
    const v15, -0x4128f5c3    # -0.42f

    .line 463
    .line 464
    .line 465
    const v16, 0x3e851eb8    # 0.26f

    .line 466
    .line 467
    .line 468
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v0, -0x41bd70a4    # -0.19f

    .line 472
    .line 473
    .line 474
    const v2, 0x3fc51eb8    # 1.54f

    .line 475
    .line 476
    .line 477
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const v17, -0x40828f5c    # -0.99f

    .line 481
    .line 482
    .line 483
    const v18, 0x3f6147ae    # 0.88f

    .line 484
    .line 485
    .line 486
    const v13, -0x428a3d71    # -0.06f

    .line 487
    .line 488
    .line 489
    const/high16 v14, 0x3f000000    # 0.5f

    .line 490
    .line 491
    const v15, -0x41051eb8    # -0.49f

    .line 492
    .line 493
    .line 494
    const v16, 0x3f6147ae    # 0.88f

    .line 495
    .line 496
    .line 497
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const v0, 0x4106147b    # 8.38f

    .line 501
    .line 502
    .line 503
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v18, -0x409eb852    # -0.88f

    .line 507
    .line 508
    .line 509
    const/high16 v13, -0x41000000    # -0.5f

    .line 510
    .line 511
    const/4 v14, 0x0

    .line 512
    const v15, -0x4091eb85    # -0.93f

    .line 513
    .line 514
    .line 515
    const v16, -0x413d70a4    # -0.38f

    .line 516
    .line 517
    .line 518
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v0, 0x40e66666    # 7.2f

    .line 522
    .line 523
    .line 524
    const v2, 0x419cb852    # 19.59f

    .line 525
    .line 526
    .line 527
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const v17, -0x40dc28f6    # -0.64f

    .line 531
    .line 532
    .line 533
    const v18, -0x41428f5c    # -0.37f

    .line 534
    .line 535
    .line 536
    const v13, -0x419eb852    # -0.22f

    .line 537
    .line 538
    .line 539
    const v14, -0x421eb852    # -0.11f

    .line 540
    .line 541
    .line 542
    const v15, -0x4123d70a    # -0.43f

    .line 543
    .line 544
    .line 545
    const v16, -0x41947ae1    # -0.23f

    .line 546
    .line 547
    .line 548
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v0, 0x3f19999a    # 0.6f

    .line 552
    .line 553
    .line 554
    const v2, -0x4048f5c3    # -1.43f

    .line 555
    .line 556
    .line 557
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const/high16 v17, -0x40600000    # -1.25f

    .line 561
    .line 562
    const v18, -0x4128f5c3    # -0.42f

    .line 563
    .line 564
    .line 565
    const v13, -0x41147ae1    # -0.46f

    .line 566
    .line 567
    .line 568
    const v14, 0x3e4ccccd    # 0.2f

    .line 569
    .line 570
    .line 571
    const/high16 v15, -0x40800000    # -1.0f

    .line 572
    .line 573
    const v16, 0x3ca3d70a    # 0.02f

    .line 574
    .line 575
    .line 576
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const v0, -0x3fcccccd    # -2.8f

    .line 580
    .line 581
    .line 582
    const v2, -0x4030a3d7    # -1.62f

    .line 583
    .line 584
    .line 585
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const v17, 0x3e851eb8    # 0.26f

    .line 589
    .line 590
    .line 591
    const v18, -0x4059999a    # -1.3f

    .line 592
    .line 593
    .line 594
    const/high16 v13, -0x41800000    # -0.25f

    .line 595
    .line 596
    const v14, -0x411eb852    # -0.44f

    .line 597
    .line 598
    .line 599
    const v15, -0x41f0a3d7    # -0.14f

    .line 600
    .line 601
    .line 602
    const v16, -0x40828f5c    # -0.99f

    .line 603
    .line 604
    .line 605
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const v0, -0x4091eb85    # -0.93f

    .line 609
    .line 610
    .line 611
    const v2, 0x3f9d70a4    # 1.23f

    .line 612
    .line 613
    .line 614
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const/high16 v17, 0x40700000    # 3.75f

    .line 618
    .line 619
    const/high16 v18, 0x41600000    # 14.0f

    .line 620
    .line 621
    const/high16 v13, 0x40700000    # 3.75f

    .line 622
    .line 623
    const/high16 v14, 0x41640000    # 14.25f

    .line 624
    .line 625
    const/high16 v15, 0x40700000    # 3.75f

    .line 626
    .line 627
    const v16, 0x4161eb85    # 14.12f

    .line 628
    .line 629
    .line 630
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const v0, 0x3c23d70a    # 0.01f

    .line 634
    .line 635
    .line 636
    const v2, -0x41428f5c    # -0.37f

    .line 637
    .line 638
    .line 639
    const/4 v4, 0x0

    .line 640
    const/high16 v6, -0x41800000    # -0.25f

    .line 641
    .line 642
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    const v0, 0x4021eb85    # 2.53f

    .line 646
    .line 647
    .line 648
    const v2, 0x414b3333    # 12.7f

    .line 649
    .line 650
    .line 651
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    const v17, -0x417ae148    # -0.26f

    .line 655
    .line 656
    .line 657
    const v18, -0x4059999a    # -1.3f

    .line 658
    .line 659
    .line 660
    const v13, -0x41333333    # -0.4f

    .line 661
    .line 662
    .line 663
    const v14, -0x41666666    # -0.3f

    .line 664
    .line 665
    .line 666
    const v15, -0x40fd70a4    # -0.51f

    .line 667
    .line 668
    .line 669
    const v16, -0x40a3d70a    # -0.86f

    .line 670
    .line 671
    .line 672
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    const v0, 0x3fcf5c29    # 1.62f

    .line 676
    .line 677
    .line 678
    const v2, -0x3fcccccd    # -2.8f

    .line 679
    .line 680
    .line 681
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const/high16 v17, 0x3fa00000    # 1.25f

    .line 685
    .line 686
    const v18, -0x4128f5c3    # -0.42f

    .line 687
    .line 688
    .line 689
    const/high16 v13, 0x3e800000    # 0.25f

    .line 690
    .line 691
    const v14, -0x411eb852    # -0.44f

    .line 692
    .line 693
    .line 694
    const v15, 0x3f4a3d71    # 0.79f

    .line 695
    .line 696
    .line 697
    const v16, -0x40e147ae    # -0.62f

    .line 698
    .line 699
    .line 700
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    const v0, 0x3fb70a3d    # 1.43f

    .line 704
    .line 705
    .line 706
    const v2, 0x3f19999a    # 0.6f

    .line 707
    .line 708
    .line 709
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    const v17, 0x3f23d70a    # 0.64f

    .line 713
    .line 714
    .line 715
    const v18, -0x41428f5c    # -0.37f

    .line 716
    .line 717
    .line 718
    const v13, 0x3e4ccccd    # 0.2f

    .line 719
    .line 720
    .line 721
    const v14, -0x41fae148    # -0.13f

    .line 722
    .line 723
    .line 724
    const v15, 0x3ed70a3d    # 0.42f

    .line 725
    .line 726
    .line 727
    const v16, -0x417ae148    # -0.26f

    .line 728
    .line 729
    .line 730
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 731
    .line 732
    .line 733
    const v0, 0x3e428f5c    # 0.19f

    .line 734
    .line 735
    .line 736
    const v2, -0x403ae148    # -1.54f

    .line 737
    .line 738
    .line 739
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    const v17, 0x4106147b    # 8.38f

    .line 743
    .line 744
    .line 745
    const/high16 v18, 0x40c00000    # 6.0f

    .line 746
    .line 747
    const v13, 0x40ee6666    # 7.45f

    .line 748
    .line 749
    .line 750
    const v14, 0x40cc28f6    # 6.38f

    .line 751
    .line 752
    .line 753
    const v15, 0x40fc28f6    # 7.88f

    .line 754
    .line 755
    .line 756
    const/high16 v16, 0x40c00000    # 6.0f

    .line 757
    .line 758
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 759
    .line 760
    .line 761
    const v0, 0x404eb852    # 3.23f

    .line 762
    .line 763
    .line 764
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 765
    .line 766
    .line 767
    const v17, 0x3f7d70a4    # 0.99f

    .line 768
    .line 769
    .line 770
    const v18, 0x3f6147ae    # 0.88f

    .line 771
    .line 772
    .line 773
    const/high16 v13, 0x3f000000    # 0.5f

    .line 774
    .line 775
    const/4 v14, 0x0

    .line 776
    const v15, 0x3f6e147b    # 0.93f

    .line 777
    .line 778
    .line 779
    const v16, 0x3ec28f5c    # 0.38f

    .line 780
    .line 781
    .line 782
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 783
    .line 784
    .line 785
    const v0, 0x3e428f5c    # 0.19f

    .line 786
    .line 787
    .line 788
    const v2, 0x3fc51eb8    # 1.54f

    .line 789
    .line 790
    .line 791
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 792
    .line 793
    .line 794
    const v17, 0x3f23d70a    # 0.64f

    .line 795
    .line 796
    .line 797
    const v18, 0x3ebd70a4    # 0.37f

    .line 798
    .line 799
    .line 800
    const v13, 0x3e6147ae    # 0.22f

    .line 801
    .line 802
    .line 803
    const v14, 0x3de147ae    # 0.11f

    .line 804
    .line 805
    .line 806
    const v15, 0x3edc28f6    # 0.43f

    .line 807
    .line 808
    .line 809
    const v16, 0x3e6b851f    # 0.23f

    .line 810
    .line 811
    .line 812
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 813
    .line 814
    .line 815
    const v0, 0x3fb70a3d    # 1.43f

    .line 816
    .line 817
    .line 818
    const v2, -0x40e66666    # -0.6f

    .line 819
    .line 820
    .line 821
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 822
    .line 823
    .line 824
    const/high16 v17, 0x3fa00000    # 1.25f

    .line 825
    .line 826
    const v18, 0x3ed70a3d    # 0.42f

    .line 827
    .line 828
    .line 829
    const v13, 0x3eeb851f    # 0.46f

    .line 830
    .line 831
    .line 832
    const v14, -0x41b33333    # -0.2f

    .line 833
    .line 834
    .line 835
    const/high16 v15, 0x3f800000    # 1.0f

    .line 836
    .line 837
    const v16, -0x435c28f6    # -0.02f

    .line 838
    .line 839
    .line 840
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 841
    .line 842
    .line 843
    const v0, 0x3fcf5c29    # 1.62f

    .line 844
    .line 845
    .line 846
    const v2, 0x40333333    # 2.8f

    .line 847
    .line 848
    .line 849
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 850
    .line 851
    .line 852
    const v17, -0x417ae148    # -0.26f

    .line 853
    .line 854
    .line 855
    const v18, 0x3fa66666    # 1.3f

    .line 856
    .line 857
    .line 858
    const/high16 v13, 0x3e800000    # 0.25f

    .line 859
    .line 860
    const v14, 0x3ee147ae    # 0.44f

    .line 861
    .line 862
    .line 863
    const v15, 0x3e0f5c29    # 0.14f

    .line 864
    .line 865
    .line 866
    const v16, 0x3f7d70a4    # 0.99f

    .line 867
    .line 868
    .line 869
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 870
    .line 871
    .line 872
    const v0, -0x40628f5c    # -1.23f

    .line 873
    .line 874
    .line 875
    const v2, 0x3f6e147b    # 0.93f

    .line 876
    .line 877
    .line 878
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 879
    .line 880
    .line 881
    const v17, 0x3c23d70a    # 0.01f

    .line 882
    .line 883
    .line 884
    const v18, 0x3ebd70a4    # 0.37f

    .line 885
    .line 886
    .line 887
    const v13, 0x3c23d70a    # 0.01f

    .line 888
    .line 889
    .line 890
    const v14, 0x3df5c28f    # 0.12f

    .line 891
    .line 892
    .line 893
    const v15, 0x3c23d70a    # 0.01f

    .line 894
    .line 895
    .line 896
    const v16, 0x3e75c28f    # 0.24f

    .line 897
    .line 898
    .line 899
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 900
    .line 901
    .line 902
    const/high16 v0, 0x41820000    # 16.25f

    .line 903
    .line 904
    const/high16 v2, 0x41640000    # 14.25f

    .line 905
    .line 906
    const v4, 0x4165eb85    # 14.37f

    .line 907
    .line 908
    .line 909
    const v6, 0x4181eb85    # 16.24f

    .line 910
    .line 911
    .line 912
    invoke-virtual {v12, v0, v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 913
    .line 914
    .line 915
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 916
    .line 917
    .line 918
    const/high16 v0, 0x41600000    # 14.0f

    .line 919
    .line 920
    const/high16 v2, 0x41500000    # 13.0f

    .line 921
    .line 922
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 923
    .line 924
    .line 925
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 926
    .line 927
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 928
    .line 929
    const/4 v13, 0x0

    .line 930
    const v14, -0x402b851f    # -1.66f

    .line 931
    .line 932
    .line 933
    const v15, -0x40547ae1    # -1.34f

    .line 934
    .line 935
    .line 936
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 937
    .line 938
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 939
    .line 940
    .line 941
    const v0, 0x3fab851f    # 1.34f

    .line 942
    .line 943
    .line 944
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 945
    .line 946
    const/high16 v4, 0x40400000    # 3.0f

    .line 947
    .line 948
    const/high16 v6, -0x3fc00000    # -3.0f

    .line 949
    .line 950
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 951
    .line 952
    .line 953
    const/high16 v2, 0x40400000    # 3.0f

    .line 954
    .line 955
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 956
    .line 957
    .line 958
    const v0, 0x417a8f5c    # 15.66f

    .line 959
    .line 960
    .line 961
    const/high16 v2, 0x41600000    # 14.0f

    .line 962
    .line 963
    const/high16 v4, 0x41500000    # 13.0f

    .line 964
    .line 965
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 966
    .line 967
    .line 968
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 969
    .line 970
    .line 971
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 972
    .line 973
    .line 974
    move-result-object v2

    .line 975
    const/16 v16, 0x3800

    .line 976
    .line 977
    const/16 v17, 0x0

    .line 978
    .line 979
    const/high16 v6, 0x3f800000    # 1.0f

    .line 980
    .line 981
    const/high16 v8, 0x3f800000    # 1.0f

    .line 982
    .line 983
    const/4 v7, 0x0

    .line 984
    const/high16 v9, 0x3f800000    # 1.0f

    .line 985
    .line 986
    const/high16 v12, 0x3f800000    # 1.0f

    .line 987
    .line 988
    const/4 v14, 0x0

    .line 989
    const/4 v15, 0x0

    .line 990
    const-string v4, ""

    .line 991
    .line 992
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 993
    .line 994
    .line 995
    move-result-object v0

    .line 996
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 997
    .line 998
    .line 999
    move-result-object v0

    .line 1000
    sput-object v0, Landroidx/compose/material/icons/rounded/SettingsSuggestKt;->_settingsSuggest:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1001
    .line 1002
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1003
    .line 1004
    .line 1005
    return-object v0
.end method
