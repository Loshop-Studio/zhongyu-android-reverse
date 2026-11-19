.class public final Landroidx/compose/material/icons/twotone/PinKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_pin",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Pin",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getPin",
        "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nPin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pin.kt\nandroidx/compose/material/icons/twotone/PinKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,162:1\n212#2,12:163\n233#2,18:176\n253#2:213\n233#2,18:214\n253#2:251\n233#2,18:252\n253#2:289\n233#2,18:290\n253#2:327\n233#2,18:328\n253#2:365\n174#3:175\n705#4,2:194\n717#4,2:196\n719#4,11:202\n705#4,2:232\n717#4,2:234\n719#4,11:240\n705#4,2:270\n717#4,2:272\n719#4,11:278\n705#4,2:308\n717#4,2:310\n719#4,11:316\n705#4,2:346\n717#4,2:348\n719#4,11:354\n72#5,4:198\n72#5,4:236\n72#5,4:274\n72#5,4:312\n72#5,4:350\n*S KotlinDebug\n*F\n+ 1 Pin.kt\nandroidx/compose/material/icons/twotone/PinKt\n*L\n29#1:163,12\n30#1:176,18\n30#1:213\n86#1:214,18\n86#1:251\n104#1:252,18\n104#1:289\n114#1:290,18\n114#1:327\n133#1:328,18\n133#1:365\n29#1:175\n30#1:194,2\n30#1:196,2\n30#1:202,11\n86#1:232,2\n86#1:234,2\n86#1:240,11\n104#1:270,2\n104#1:272,2\n104#1:278,11\n114#1:308,2\n114#1:310,2\n114#1:316,11\n133#1:346,2\n133#1:348,2\n133#1:354,11\n30#1:198,4\n86#1:236,4\n104#1:274,4\n114#1:312,4\n133#1:350,4\n*E\n"
    }
.end annotation


# static fields
.field private static _pin:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPin(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PinKt;->_pin:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Pin"

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
    const/high16 v4, 0x41900000    # 18.0f

    .line 71
    .line 72
    const/high16 v6, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x41800000    # 16.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x40c00000    # 6.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v4, 0x40800000    # 4.0f

    .line 88
    .line 89
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/high16 v4, 0x41900000    # 18.0f

    .line 93
    .line 94
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v4, 0x4186b852    # 16.84f

    .line 101
    .line 102
    .line 103
    const v6, 0x4146147b    # 12.38f

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const/high16 v4, -0x41000000    # -0.5f

    .line 110
    .line 111
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/high16 v4, -0x40800000    # -1.0f

    .line 115
    .line 116
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v4, 0x3eeb851f    # 0.46f

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const v25, 0x3f6147ae    # 0.88f

    .line 126
    .line 127
    .line 128
    const v26, -0x40c7ae14    # -0.72f

    .line 129
    .line 130
    .line 131
    const v21, 0x3ea8f5c3    # 0.33f

    .line 132
    .line 133
    .line 134
    const/16 v22, 0x0

    .line 135
    .line 136
    const v23, 0x3f6147ae    # 0.88f

    .line 137
    .line 138
    .line 139
    const v24, -0x41f0a3d7    # -0.14f

    .line 140
    .line 141
    .line 142
    move-object/from16 v20, v2

    .line 143
    .line 144
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v25, -0x40c00000    # -0.75f

    .line 148
    .line 149
    const v26, -0x40d9999a    # -0.65f

    .line 150
    .line 151
    .line 152
    const/16 v21, 0x0

    .line 153
    .line 154
    const v22, -0x413851ec    # -0.39f

    .line 155
    .line 156
    .line 157
    const v23, -0x416147ae    # -0.31f

    .line 158
    .line 159
    .line 160
    const v24, -0x40d9999a    # -0.65f

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v25, -0x40a66666    # -0.85f

    .line 167
    .line 168
    .line 169
    const v26, 0x3f23d70a    # 0.64f

    .line 170
    .line 171
    .line 172
    const/high16 v21, -0x41000000    # -0.5f

    .line 173
    .line 174
    const/16 v22, 0x0

    .line 175
    .line 176
    const v23, -0x40c28f5c    # -0.74f

    .line 177
    .line 178
    .line 179
    const v24, 0x3ea3d70a    # 0.32f

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const v4, -0x412e147b    # -0.41f

    .line 186
    .line 187
    .line 188
    const v6, -0x40828f5c    # -0.99f

    .line 189
    .line 190
    .line 191
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v25, 0x4187851f    # 16.94f

    .line 195
    .line 196
    .line 197
    const/high16 v26, 0x41100000    # 9.0f

    .line 198
    .line 199
    const v21, 0x41733333    # 15.2f

    .line 200
    .line 201
    .line 202
    const v22, 0x411e6666    # 9.9f

    .line 203
    .line 204
    .line 205
    const v23, 0x417ae148    # 15.68f

    .line 206
    .line 207
    .line 208
    const/high16 v24, 0x41100000    # 9.0f

    .line 209
    .line 210
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v25, 0x3fcf5c29    # 1.62f

    .line 214
    .line 215
    .line 216
    const/high16 v26, 0x3f400000    # 0.75f

    .line 217
    .line 218
    const v21, 0x3f8b851f    # 1.09f

    .line 219
    .line 220
    .line 221
    const/16 v22, 0x0

    .line 222
    .line 223
    const v23, 0x3fc51eb8    # 1.54f

    .line 224
    .line 225
    .line 226
    const v24, 0x3f23d70a    # 0.64f

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v25, 0x3ca3d70a    # 0.02f

    .line 233
    .line 234
    .line 235
    const v26, 0x3fc8f5c3    # 1.57f

    .line 236
    .line 237
    .line 238
    const v21, 0x3ea8f5c3    # 0.33f

    .line 239
    .line 240
    .line 241
    const/high16 v22, 0x3f000000    # 0.5f

    .line 242
    .line 243
    const v23, 0x3e8f5c29    # 0.28f

    .line 244
    .line 245
    .line 246
    const v24, 0x3f947ae1    # 1.16f

    .line 247
    .line 248
    .line 249
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v25, -0x40fae148    # -0.52f

    .line 253
    .line 254
    .line 255
    const v26, 0x3ef5c28f    # 0.48f

    .line 256
    .line 257
    .line 258
    const v21, -0x41e66666    # -0.15f

    .line 259
    .line 260
    .line 261
    const v22, 0x3e6147ae    # 0.22f

    .line 262
    .line 263
    .line 264
    const v23, -0x415c28f6    # -0.32f

    .line 265
    .line 266
    .line 267
    const v24, 0x3ec28f5c    # 0.38f

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v4, 0x3d8f5c29    # 0.07f

    .line 274
    .line 275
    .line 276
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v25, 0x3f2e147b    # 0.68f

    .line 280
    .line 281
    .line 282
    const v26, 0x3f051eb8    # 0.52f

    .line 283
    .line 284
    .line 285
    const v21, 0x3e8f5c29    # 0.28f

    .line 286
    .line 287
    .line 288
    const v22, 0x3de147ae    # 0.11f

    .line 289
    .line 290
    .line 291
    const v23, 0x3f028f5c    # 0.51f

    .line 292
    .line 293
    .line 294
    const v24, 0x3e8f5c29    # 0.28f

    .line 295
    .line 296
    .line 297
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v25, 0x3c23d70a    # 0.01f

    .line 301
    .line 302
    .line 303
    const v26, 0x3fe147ae    # 1.76f

    .line 304
    .line 305
    .line 306
    const v21, 0x3ebd70a4    # 0.37f

    .line 307
    .line 308
    .line 309
    const v22, 0x3f051eb8    # 0.52f

    .line 310
    .line 311
    .line 312
    const v23, 0x3ea8f5c3    # 0.33f

    .line 313
    .line 314
    .line 315
    const v24, 0x3fa28f5c    # 1.27f

    .line 316
    .line 317
    .line 318
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v25, 0x4187eb85    # 16.99f

    .line 322
    .line 323
    .line 324
    const/high16 v26, 0x41700000    # 15.0f

    .line 325
    .line 326
    const v21, 0x41955c29    # 18.67f

    .line 327
    .line 328
    .line 329
    const v22, 0x41647ae1    # 14.28f

    .line 330
    .line 331
    .line 332
    const v23, 0x4191851f    # 18.19f

    .line 333
    .line 334
    .line 335
    const/high16 v24, 0x41700000    # 15.0f

    .line 336
    .line 337
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const v25, -0x3ffccccd    # -2.05f

    .line 341
    .line 342
    .line 343
    const v26, -0x403eb852    # -1.51f

    .line 344
    .line 345
    .line 346
    const v21, -0x42dc28f6    # -0.04f

    .line 347
    .line 348
    .line 349
    const/16 v22, 0x0

    .line 350
    .line 351
    const v23, -0x40333333    # -1.6f

    .line 352
    .line 353
    .line 354
    const v24, 0x3da3d70a    # 0.08f

    .line 355
    .line 356
    .line 357
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v4, 0x3f83d70a    # 1.03f

    .line 361
    .line 362
    .line 363
    const v6, -0x412e147b    # -0.41f

    .line 364
    .line 365
    .line 366
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v25, 0x3f828f5c    # 1.02f

    .line 370
    .line 371
    .line 372
    const v26, 0x3f5c28f6    # 0.86f

    .line 373
    .line 374
    .line 375
    const v21, 0x3ca3d70a    # 0.02f

    .line 376
    .line 377
    .line 378
    const v22, 0x3dcccccd    # 0.1f

    .line 379
    .line 380
    .line 381
    const v23, 0x3e428f5c    # 0.19f

    .line 382
    .line 383
    .line 384
    const v24, 0x3f5c28f6    # 0.86f

    .line 385
    .line 386
    .line 387
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v25, 0x3f63d70a    # 0.89f

    .line 391
    .line 392
    .line 393
    const v26, -0x40bae148    # -0.77f

    .line 394
    .line 395
    .line 396
    const v21, 0x3ed1eb85    # 0.41f

    .line 397
    .line 398
    .line 399
    const/16 v22, 0x0

    .line 400
    .line 401
    const v23, 0x3f63d70a    # 0.89f

    .line 402
    .line 403
    .line 404
    const v24, -0x4170a3d7    # -0.28f

    .line 405
    .line 406
    .line 407
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v25, 0x4186b852    # 16.84f

    .line 411
    .line 412
    .line 413
    const v26, 0x4146147b    # 12.38f

    .line 414
    .line 415
    .line 416
    const v21, 0x418f0a3d    # 17.88f

    .line 417
    .line 418
    .line 419
    const v22, 0x4149eb85    # 12.62f

    .line 420
    .line 421
    .line 422
    const v23, 0x418b3333    # 17.4f

    .line 423
    .line 424
    .line 425
    const v24, 0x4146147b    # 12.38f

    .line 426
    .line 427
    .line 428
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const v4, 0x4128f5c3    # 10.56f

    .line 435
    .line 436
    .line 437
    const v6, 0x41133333    # 9.2f

    .line 438
    .line 439
    .line 440
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v25, 0x3ff9999a    # 1.95f

    .line 444
    .line 445
    .line 446
    const v26, 0x3cf5c28f    # 0.03f

    .line 447
    .line 448
    .line 449
    const v21, 0x3f30a3d7    # 0.69f

    .line 450
    .line 451
    .line 452
    const v22, -0x41570a3d    # -0.33f

    .line 453
    .line 454
    .line 455
    const v23, 0x3fbd70a4    # 1.48f

    .line 456
    .line 457
    .line 458
    const v24, -0x41b33333    # -0.2f

    .line 459
    .line 460
    .line 461
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const v25, 0x3f68f5c3    # 0.91f

    .line 465
    .line 466
    .line 467
    const v26, 0x3fbd70a4    # 1.48f

    .line 468
    .line 469
    .line 470
    const v21, 0x3f5c28f6    # 0.86f

    .line 471
    .line 472
    .line 473
    const v22, 0x3ee147ae    # 0.44f

    .line 474
    .line 475
    .line 476
    const v23, 0x3f68f5c3    # 0.91f

    .line 477
    .line 478
    .line 479
    const v24, 0x3f9eb852    # 1.24f

    .line 480
    .line 481
    .line 482
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v25, -0x40947ae1    # -0.92f

    .line 486
    .line 487
    .line 488
    const v26, 0x3fee147b    # 1.86f

    .line 489
    .line 490
    .line 491
    const/16 v21, 0x0

    .line 492
    .line 493
    const v22, 0x3f23d70a    # 0.64f

    .line 494
    .line 495
    .line 496
    const v23, -0x416147ae    # -0.31f

    .line 497
    .line 498
    .line 499
    const v24, 0x3fa147ae    # 1.26f

    .line 500
    .line 501
    .line 502
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const v25, -0x404ccccd    # -1.4f

    .line 506
    .line 507
    .line 508
    const v26, 0x3fb1eb85    # 1.39f

    .line 509
    .line 510
    .line 511
    const/high16 v21, -0x41800000    # -0.25f

    .line 512
    .line 513
    const/high16 v22, 0x3e800000    # 0.25f

    .line 514
    .line 515
    const v23, -0x40c7ae14    # -0.72f

    .line 516
    .line 517
    .line 518
    const v24, 0x3f35c28f    # 0.71f

    .line 519
    .line 520
    .line 521
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const v4, 0x3cf5c28f    # 0.03f

    .line 525
    .line 526
    .line 527
    const v6, 0x3d4ccccd    # 0.05f

    .line 528
    .line 529
    .line 530
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const v4, 0x4017ae14    # 2.37f

    .line 534
    .line 535
    .line 536
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const/high16 v4, 0x41700000    # 15.0f

    .line 540
    .line 541
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const v4, 0x4119c28f    # 9.61f

    .line 545
    .line 546
    .line 547
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const v4, -0x407d70a4    # -1.02f

    .line 551
    .line 552
    .line 553
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const v25, 0x400851ec    # 2.13f

    .line 557
    .line 558
    .line 559
    const v26, -0x3ff66666    # -2.15f

    .line 560
    .line 561
    .line 562
    const v21, 0x3f88f5c3    # 1.07f

    .line 563
    .line 564
    .line 565
    const v22, -0x40770a3d    # -1.07f

    .line 566
    .line 567
    .line 568
    const v23, 0x3fe28f5c    # 1.77f

    .line 569
    .line 570
    .line 571
    const v24, -0x401d70a4    # -1.77f

    .line 572
    .line 573
    .line 574
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const v25, 0x3f0a3d71    # 0.54f

    .line 578
    .line 579
    .line 580
    const v26, -0x407851ec    # -1.06f

    .line 581
    .line 582
    .line 583
    const v21, 0x3ecccccd    # 0.4f

    .line 584
    .line 585
    .line 586
    const v22, -0x4128f5c3    # -0.42f

    .line 587
    .line 588
    .line 589
    const v23, 0x3f0a3d71    # 0.54f

    .line 590
    .line 591
    .line 592
    const v24, -0x40cf5c29    # -0.69f

    .line 593
    .line 594
    .line 595
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const v25, -0x40b0a3d7    # -0.81f

    .line 599
    .line 600
    .line 601
    const v26, -0x40c7ae14    # -0.72f

    .line 602
    .line 603
    .line 604
    const/16 v21, 0x0

    .line 605
    .line 606
    const v22, -0x41333333    # -0.4f

    .line 607
    .line 608
    .line 609
    const v23, -0x416147ae    # -0.31f

    .line 610
    .line 611
    .line 612
    const v24, -0x40c7ae14    # -0.72f

    .line 613
    .line 614
    .line 615
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const v25, -0x4099999a    # -0.9f

    .line 619
    .line 620
    .line 621
    const v26, 0x3f3851ec    # 0.72f

    .line 622
    .line 623
    .line 624
    const v21, -0x40fae148    # -0.52f

    .line 625
    .line 626
    .line 627
    const/16 v22, 0x0

    .line 628
    .line 629
    const v23, -0x40b33333    # -0.8f

    .line 630
    .line 631
    .line 632
    const v24, 0x3ec7ae14    # 0.39f

    .line 633
    .line 634
    .line 635
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const v4, -0x407eb852    # -1.01f

    .line 639
    .line 640
    .line 641
    const v6, -0x4128f5c3    # -0.42f

    .line 642
    .line 643
    .line 644
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    const v25, 0x4128f5c3    # 10.56f

    .line 648
    .line 649
    .line 650
    const v26, 0x41133333    # 9.2f

    .line 651
    .line 652
    .line 653
    const v21, 0x41191eb8    # 9.57f

    .line 654
    .line 655
    .line 656
    const v22, 0x412547ae    # 10.33f

    .line 657
    .line 658
    .line 659
    const v23, 0x411bd70a    # 9.74f

    .line 660
    .line 661
    .line 662
    const v24, 0x411970a4    # 9.59f

    .line 663
    .line 664
    .line 665
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const/high16 v4, 0x41100000    # 9.0f

    .line 672
    .line 673
    const v6, 0x40d8a3d7    # 6.77f

    .line 674
    .line 675
    .line 676
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 677
    .line 678
    .line 679
    const v4, 0x3f5eb852    # 0.87f

    .line 680
    .line 681
    .line 682
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 683
    .line 684
    .line 685
    const/high16 v4, 0x40c00000    # 6.0f

    .line 686
    .line 687
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    const v4, 0x40cfae14    # 6.49f

    .line 691
    .line 692
    .line 693
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 694
    .line 695
    .line 696
    const/high16 v4, -0x3f700000    # -4.5f

    .line 697
    .line 698
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    const v4, -0x4099999a    # -0.9f

    .line 702
    .line 703
    .line 704
    const v6, 0x3f28f5c3    # 0.66f

    .line 705
    .line 706
    .line 707
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    const v4, -0x40eb851f    # -0.58f

    .line 711
    .line 712
    .line 713
    const v6, -0x409c28f6    # -0.89f

    .line 714
    .line 715
    .line 716
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 717
    .line 718
    .line 719
    const/high16 v4, 0x41100000    # 9.0f

    .line 720
    .line 721
    const v6, 0x40d8a3d7    # 6.77f

    .line 722
    .line 723
    .line 724
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 731
    .line 732
    .line 733
    move-result-object v2

    .line 734
    const/16 v16, 0x3800

    .line 735
    .line 736
    const/16 v17, 0x0

    .line 737
    .line 738
    const v6, 0x3e99999a    # 0.3f

    .line 739
    .line 740
    .line 741
    const v8, 0x3e99999a    # 0.3f

    .line 742
    .line 743
    .line 744
    const/4 v7, 0x0

    .line 745
    const/high16 v9, 0x3f800000    # 1.0f

    .line 746
    .line 747
    const/high16 v12, 0x3f800000    # 1.0f

    .line 748
    .line 749
    const/4 v13, 0x0

    .line 750
    const/4 v14, 0x0

    .line 751
    const/4 v15, 0x0

    .line 752
    const-string v4, ""

    .line 753
    .line 754
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 755
    .line 756
    .line 757
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 758
    .line 759
    .line 760
    move-result v3

    .line 761
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 762
    .line 763
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 764
    .line 765
    .line 766
    move-result-wide v6

    .line 767
    const/4 v2, 0x0

    .line 768
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 769
    .line 770
    .line 771
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 772
    .line 773
    .line 774
    move-result v10

    .line 775
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 776
    .line 777
    .line 778
    move-result v11

    .line 779
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 780
    .line 781
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 782
    .line 783
    .line 784
    const/high16 v4, 0x41a00000    # 20.0f

    .line 785
    .line 786
    const/high16 v6, 0x40800000    # 4.0f

    .line 787
    .line 788
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 789
    .line 790
    .line 791
    const/high16 v4, 0x40800000    # 4.0f

    .line 792
    .line 793
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 794
    .line 795
    .line 796
    const/high16 v25, 0x40000000    # 2.0f

    .line 797
    .line 798
    const/high16 v26, 0x40c00000    # 6.0f

    .line 799
    .line 800
    const v21, 0x4039999a    # 2.9f

    .line 801
    .line 802
    .line 803
    const/high16 v22, 0x40800000    # 4.0f

    .line 804
    .line 805
    const/high16 v23, 0x40000000    # 2.0f

    .line 806
    .line 807
    const v24, 0x409ccccd    # 4.9f

    .line 808
    .line 809
    .line 810
    move-object/from16 v20, v2

    .line 811
    .line 812
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 813
    .line 814
    .line 815
    const/high16 v4, 0x41400000    # 12.0f

    .line 816
    .line 817
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 818
    .line 819
    .line 820
    const/high16 v26, 0x40000000    # 2.0f

    .line 821
    .line 822
    const/16 v21, 0x0

    .line 823
    .line 824
    const v22, 0x3f8ccccd    # 1.1f

    .line 825
    .line 826
    .line 827
    const v23, 0x3f666666    # 0.9f

    .line 828
    .line 829
    .line 830
    const/high16 v24, 0x40000000    # 2.0f

    .line 831
    .line 832
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 833
    .line 834
    .line 835
    const/high16 v4, 0x41800000    # 16.0f

    .line 836
    .line 837
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 838
    .line 839
    .line 840
    const/high16 v26, -0x40000000    # -2.0f

    .line 841
    .line 842
    const v21, 0x3f8ccccd    # 1.1f

    .line 843
    .line 844
    .line 845
    const/16 v22, 0x0

    .line 846
    .line 847
    const/high16 v23, 0x40000000    # 2.0f

    .line 848
    .line 849
    const v24, -0x4099999a    # -0.9f

    .line 850
    .line 851
    .line 852
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 853
    .line 854
    .line 855
    const/high16 v4, 0x40c00000    # 6.0f

    .line 856
    .line 857
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 858
    .line 859
    .line 860
    const/high16 v25, 0x41a00000    # 20.0f

    .line 861
    .line 862
    const/high16 v26, 0x40800000    # 4.0f

    .line 863
    .line 864
    const/high16 v21, 0x41b00000    # 22.0f

    .line 865
    .line 866
    const v22, 0x409ccccd    # 4.9f

    .line 867
    .line 868
    .line 869
    const v23, 0x41a8cccd    # 21.1f

    .line 870
    .line 871
    .line 872
    const/high16 v24, 0x40800000    # 4.0f

    .line 873
    .line 874
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 875
    .line 876
    .line 877
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 878
    .line 879
    .line 880
    const/high16 v4, 0x41a00000    # 20.0f

    .line 881
    .line 882
    const/high16 v6, 0x41900000    # 18.0f

    .line 883
    .line 884
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 885
    .line 886
    .line 887
    const/high16 v4, 0x40800000    # 4.0f

    .line 888
    .line 889
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 890
    .line 891
    .line 892
    const/high16 v4, 0x40c00000    # 6.0f

    .line 893
    .line 894
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 895
    .line 896
    .line 897
    const/high16 v4, 0x41800000    # 16.0f

    .line 898
    .line 899
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 900
    .line 901
    .line 902
    const/high16 v4, 0x41900000    # 18.0f

    .line 903
    .line 904
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 905
    .line 906
    .line 907
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 908
    .line 909
    .line 910
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 911
    .line 912
    .line 913
    move-result-object v2

    .line 914
    const/high16 v6, 0x3f800000    # 1.0f

    .line 915
    .line 916
    const/high16 v8, 0x3f800000    # 1.0f

    .line 917
    .line 918
    const/4 v7, 0x0

    .line 919
    const-string v4, ""

    .line 920
    .line 921
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 922
    .line 923
    .line 924
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 925
    .line 926
    .line 927
    move-result v3

    .line 928
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 929
    .line 930
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 931
    .line 932
    .line 933
    move-result-wide v6

    .line 934
    const/4 v2, 0x0

    .line 935
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 936
    .line 937
    .line 938
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 939
    .line 940
    .line 941
    move-result v10

    .line 942
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 943
    .line 944
    .line 945
    move-result v11

    .line 946
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 947
    .line 948
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 949
    .line 950
    .line 951
    const/high16 v4, 0x41280000    # 10.5f

    .line 952
    .line 953
    const v6, 0x40cfae14    # 6.49f

    .line 954
    .line 955
    .line 956
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 957
    .line 958
    .line 959
    const/high16 v4, 0x40900000    # 4.5f

    .line 960
    .line 961
    const/4 v6, 0x0

    .line 962
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 963
    .line 964
    .line 965
    const v4, 0x3f933333    # 1.15f

    .line 966
    .line 967
    .line 968
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 969
    .line 970
    .line 971
    const/high16 v4, -0x3f400000    # -6.0f

    .line 972
    .line 973
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 974
    .line 975
    .line 976
    const v4, -0x40a147ae    # -0.87f

    .line 977
    .line 978
    .line 979
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 980
    .line 981
    .line 982
    const v4, -0x401eb852    # -1.76f

    .line 983
    .line 984
    .line 985
    const v6, 0x3fa28f5c    # 1.27f

    .line 986
    .line 987
    .line 988
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 989
    .line 990
    .line 991
    const v4, 0x3f147ae1    # 0.58f

    .line 992
    .line 993
    .line 994
    const v6, 0x3f63d70a    # 0.89f

    .line 995
    .line 996
    .line 997
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 998
    .line 999
    .line 1000
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1001
    .line 1002
    .line 1003
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v2

    .line 1007
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1008
    .line 1009
    const/4 v7, 0x0

    .line 1010
    const-string v4, ""

    .line 1011
    .line 1012
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1013
    .line 1014
    .line 1015
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1016
    .line 1017
    .line 1018
    move-result v3

    .line 1019
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1020
    .line 1021
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1022
    .line 1023
    .line 1024
    move-result-wide v6

    .line 1025
    const/4 v2, 0x0

    .line 1026
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1027
    .line 1028
    .line 1029
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1030
    .line 1031
    .line 1032
    move-result v10

    .line 1033
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1034
    .line 1035
    .line 1036
    move-result v11

    .line 1037
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1038
    .line 1039
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1040
    .line 1041
    .line 1042
    const v4, 0x4137851f    # 11.47f

    .line 1043
    .line 1044
    .line 1045
    const v6, 0x4120cccd    # 10.05f

    .line 1046
    .line 1047
    .line 1048
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1049
    .line 1050
    .line 1051
    const v25, 0x3f4f5c29    # 0.81f

    .line 1052
    .line 1053
    .line 1054
    const v26, 0x3f3851ec    # 0.72f

    .line 1055
    .line 1056
    .line 1057
    const/high16 v21, 0x3f000000    # 0.5f

    .line 1058
    .line 1059
    const/16 v22, 0x0

    .line 1060
    .line 1061
    const v23, 0x3f4f5c29    # 0.81f

    .line 1062
    .line 1063
    .line 1064
    const v24, 0x3ea3d70a    # 0.32f

    .line 1065
    .line 1066
    .line 1067
    move-object/from16 v20, v2

    .line 1068
    .line 1069
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1070
    .line 1071
    .line 1072
    const v25, -0x40f5c28f    # -0.54f

    .line 1073
    .line 1074
    .line 1075
    const v26, 0x3f87ae14    # 1.06f

    .line 1076
    .line 1077
    .line 1078
    const/16 v21, 0x0

    .line 1079
    .line 1080
    const v22, 0x3ebd70a4    # 0.37f

    .line 1081
    .line 1082
    .line 1083
    const v23, -0x41f0a3d7    # -0.14f

    .line 1084
    .line 1085
    .line 1086
    const v24, 0x3f23d70a    # 0.64f

    .line 1087
    .line 1088
    .line 1089
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1090
    .line 1091
    .line 1092
    const v25, -0x3ff7ae14    # -2.13f

    .line 1093
    .line 1094
    .line 1095
    const v26, 0x4009999a    # 2.15f

    .line 1096
    .line 1097
    .line 1098
    const v21, -0x4147ae14    # -0.36f

    .line 1099
    .line 1100
    .line 1101
    const v22, 0x3ec28f5c    # 0.38f

    .line 1102
    .line 1103
    .line 1104
    const v23, -0x407851ec    # -1.06f

    .line 1105
    .line 1106
    .line 1107
    const v24, 0x3f8a3d71    # 1.08f

    .line 1108
    .line 1109
    .line 1110
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1111
    .line 1112
    .line 1113
    const/high16 v4, 0x41700000    # 15.0f

    .line 1114
    .line 1115
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1116
    .line 1117
    .line 1118
    const v4, 0x4078f5c3    # 3.89f

    .line 1119
    .line 1120
    .line 1121
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1122
    .line 1123
    .line 1124
    const v4, -0x40828f5c    # -0.99f

    .line 1125
    .line 1126
    .line 1127
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1128
    .line 1129
    .line 1130
    const v4, -0x3fe851ec    # -2.37f

    .line 1131
    .line 1132
    .line 1133
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1134
    .line 1135
    .line 1136
    const v4, -0x430a3d71    # -0.03f

    .line 1137
    .line 1138
    .line 1139
    const v6, -0x42b33333    # -0.05f

    .line 1140
    .line 1141
    .line 1142
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1143
    .line 1144
    .line 1145
    const v25, 0x3fb33333    # 1.4f

    .line 1146
    .line 1147
    .line 1148
    const v26, -0x404e147b    # -1.39f

    .line 1149
    .line 1150
    .line 1151
    const v21, 0x3f2e147b    # 0.68f

    .line 1152
    .line 1153
    .line 1154
    const v22, -0x40d1eb85    # -0.68f

    .line 1155
    .line 1156
    .line 1157
    const v23, 0x3f933333    # 1.15f

    .line 1158
    .line 1159
    .line 1160
    const v24, -0x406e147b    # -1.14f

    .line 1161
    .line 1162
    .line 1163
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1164
    .line 1165
    .line 1166
    const v25, 0x3f6b851f    # 0.92f

    .line 1167
    .line 1168
    .line 1169
    const v26, -0x4011eb85    # -1.86f

    .line 1170
    .line 1171
    .line 1172
    const v21, 0x3f1c28f6    # 0.61f

    .line 1173
    .line 1174
    .line 1175
    const v22, -0x40e66666    # -0.6f

    .line 1176
    .line 1177
    .line 1178
    const v23, 0x3f6b851f    # 0.92f

    .line 1179
    .line 1180
    .line 1181
    const v24, -0x4063d70a    # -1.22f

    .line 1182
    .line 1183
    .line 1184
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1185
    .line 1186
    .line 1187
    const v25, -0x40970a3d    # -0.91f

    .line 1188
    .line 1189
    .line 1190
    const v26, -0x40428f5c    # -1.48f

    .line 1191
    .line 1192
    .line 1193
    const/16 v21, 0x0

    .line 1194
    .line 1195
    const v22, -0x418a3d71    # -0.24f

    .line 1196
    .line 1197
    .line 1198
    const v23, -0x42b33333    # -0.05f

    .line 1199
    .line 1200
    .line 1201
    const v24, -0x407ae148    # -1.04f

    .line 1202
    .line 1203
    .line 1204
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1205
    .line 1206
    .line 1207
    const v25, 0x4128f5c3    # 10.56f

    .line 1208
    .line 1209
    .line 1210
    const v26, 0x41133333    # 9.2f

    .line 1211
    .line 1212
    .line 1213
    const v21, 0x4140a3d7    # 12.04f

    .line 1214
    .line 1215
    .line 1216
    const/high16 v22, 0x41100000    # 9.0f

    .line 1217
    .line 1218
    const/high16 v23, 0x41340000    # 11.25f

    .line 1219
    .line 1220
    const v24, 0x410deb85    # 8.87f

    .line 1221
    .line 1222
    .line 1223
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1224
    .line 1225
    .line 1226
    const/high16 v25, -0x40800000    # -1.0f

    .line 1227
    .line 1228
    const v26, 0x3f933333    # 1.15f

    .line 1229
    .line 1230
    .line 1231
    const v21, -0x40ae147b    # -0.82f

    .line 1232
    .line 1233
    .line 1234
    const v22, 0x3ec7ae14    # 0.39f

    .line 1235
    .line 1236
    .line 1237
    const v23, -0x40828f5c    # -0.99f

    .line 1238
    .line 1239
    .line 1240
    const v24, 0x3f90a3d7    # 1.13f

    .line 1241
    .line 1242
    .line 1243
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1244
    .line 1245
    .line 1246
    const v4, 0x3f8147ae    # 1.01f

    .line 1247
    .line 1248
    .line 1249
    const v6, 0x3ed70a3d    # 0.42f

    .line 1250
    .line 1251
    .line 1252
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1253
    .line 1254
    .line 1255
    const v25, 0x4137851f    # 11.47f

    .line 1256
    .line 1257
    .line 1258
    const v26, 0x4120cccd    # 10.05f

    .line 1259
    .line 1260
    .line 1261
    const v21, 0x412ab852    # 10.67f

    .line 1262
    .line 1263
    .line 1264
    const v22, 0x41270a3d    # 10.44f

    .line 1265
    .line 1266
    .line 1267
    const v23, 0x412f3333    # 10.95f

    .line 1268
    .line 1269
    .line 1270
    const v24, 0x4120cccd    # 10.05f

    .line 1271
    .line 1272
    .line 1273
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1274
    .line 1275
    .line 1276
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1277
    .line 1278
    .line 1279
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1280
    .line 1281
    .line 1282
    move-result-object v2

    .line 1283
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1284
    .line 1285
    const/4 v7, 0x0

    .line 1286
    const-string v4, ""

    .line 1287
    .line 1288
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1289
    .line 1290
    .line 1291
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1292
    .line 1293
    .line 1294
    move-result v3

    .line 1295
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1296
    .line 1297
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1298
    .line 1299
    .line 1300
    move-result-wide v6

    .line 1301
    const/4 v0, 0x0

    .line 1302
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1303
    .line 1304
    .line 1305
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1306
    .line 1307
    .line 1308
    move-result v10

    .line 1309
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1310
    .line 1311
    .line 1312
    move-result v11

    .line 1313
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1314
    .line 1315
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1316
    .line 1317
    .line 1318
    const v0, 0x4187eb85    # 16.99f

    .line 1319
    .line 1320
    .line 1321
    const v2, 0x415f0a3d    # 13.94f

    .line 1322
    .line 1323
    .line 1324
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1325
    .line 1326
    .line 1327
    const v17, -0x407d70a4    # -1.02f

    .line 1328
    .line 1329
    .line 1330
    const v18, -0x40a3d70a    # -0.86f

    .line 1331
    .line 1332
    .line 1333
    const v13, -0x40ab851f    # -0.83f

    .line 1334
    .line 1335
    .line 1336
    const v15, -0x40828f5c    # -0.99f

    .line 1337
    .line 1338
    .line 1339
    const v16, -0x40bd70a4    # -0.76f

    .line 1340
    .line 1341
    .line 1342
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1343
    .line 1344
    .line 1345
    const v0, -0x407c28f6    # -1.03f

    .line 1346
    .line 1347
    .line 1348
    const v2, 0x3ed1eb85    # 0.41f

    .line 1349
    .line 1350
    .line 1351
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1352
    .line 1353
    .line 1354
    const v17, 0x40033333    # 2.05f

    .line 1355
    .line 1356
    .line 1357
    const v18, 0x3fc147ae    # 1.51f

    .line 1358
    .line 1359
    .line 1360
    const v13, 0x3ee66666    # 0.45f

    .line 1361
    .line 1362
    .line 1363
    const v14, 0x3fcb851f    # 1.59f

    .line 1364
    .line 1365
    .line 1366
    const v15, 0x4000a3d7    # 2.01f

    .line 1367
    .line 1368
    .line 1369
    const v16, 0x3fc147ae    # 1.51f

    .line 1370
    .line 1371
    .line 1372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1373
    .line 1374
    .line 1375
    const v17, 0x3fe147ae    # 1.76f

    .line 1376
    .line 1377
    .line 1378
    const v18, -0x40a66666    # -0.85f

    .line 1379
    .line 1380
    .line 1381
    const v13, 0x3f99999a    # 1.2f

    .line 1382
    .line 1383
    .line 1384
    const/4 v14, 0x0

    .line 1385
    const v15, 0x3fd70a3d    # 1.68f

    .line 1386
    .line 1387
    .line 1388
    const v16, -0x40c7ae14    # -0.72f

    .line 1389
    .line 1390
    .line 1391
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1392
    .line 1393
    .line 1394
    const v17, -0x43dc28f6    # -0.01f

    .line 1395
    .line 1396
    .line 1397
    const v18, -0x401eb852    # -1.76f

    .line 1398
    .line 1399
    .line 1400
    const v13, 0x3ea3d70a    # 0.32f

    .line 1401
    .line 1402
    .line 1403
    const v14, -0x41051eb8    # -0.49f

    .line 1404
    .line 1405
    .line 1406
    const v15, 0x3eb851ec    # 0.36f

    .line 1407
    .line 1408
    .line 1409
    const v16, -0x406147ae    # -1.24f

    .line 1410
    .line 1411
    .line 1412
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1413
    .line 1414
    .line 1415
    const v17, -0x40d1eb85    # -0.68f

    .line 1416
    .line 1417
    .line 1418
    const v18, -0x40fae148    # -0.52f

    .line 1419
    .line 1420
    .line 1421
    const v13, -0x41d1eb85    # -0.17f

    .line 1422
    .line 1423
    .line 1424
    const v14, -0x418a3d71    # -0.24f

    .line 1425
    .line 1426
    .line 1427
    const v15, -0x41333333    # -0.4f

    .line 1428
    .line 1429
    .line 1430
    const v16, -0x412e147b    # -0.41f

    .line 1431
    .line 1432
    .line 1433
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1434
    .line 1435
    .line 1436
    const v0, 0x413ccccd    # 11.8f

    .line 1437
    .line 1438
    .line 1439
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1440
    .line 1441
    .line 1442
    const v17, 0x3f051eb8    # 0.52f

    .line 1443
    .line 1444
    .line 1445
    const v18, -0x410a3d71    # -0.48f

    .line 1446
    .line 1447
    .line 1448
    const v13, 0x3e4ccccd    # 0.2f

    .line 1449
    .line 1450
    .line 1451
    const v14, -0x42333333    # -0.1f

    .line 1452
    .line 1453
    .line 1454
    const v15, 0x3ebd70a4    # 0.37f

    .line 1455
    .line 1456
    .line 1457
    const v16, -0x417ae148    # -0.26f

    .line 1458
    .line 1459
    .line 1460
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1461
    .line 1462
    .line 1463
    const v17, -0x435c28f6    # -0.02f

    .line 1464
    .line 1465
    .line 1466
    const v18, -0x40370a3d    # -1.57f

    .line 1467
    .line 1468
    .line 1469
    const v13, 0x3e851eb8    # 0.26f

    .line 1470
    .line 1471
    .line 1472
    const v14, -0x412e147b    # -0.41f

    .line 1473
    .line 1474
    .line 1475
    const v15, 0x3e9eb852    # 0.31f

    .line 1476
    .line 1477
    .line 1478
    const v16, -0x40770a3d    # -1.07f

    .line 1479
    .line 1480
    .line 1481
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1482
    .line 1483
    .line 1484
    const v17, 0x4187851f    # 16.94f

    .line 1485
    .line 1486
    .line 1487
    const/high16 v18, 0x41100000    # 9.0f

    .line 1488
    .line 1489
    const v13, 0x4193d70a    # 18.48f

    .line 1490
    .line 1491
    .line 1492
    const v14, 0x411a3d71    # 9.64f

    .line 1493
    .line 1494
    .line 1495
    const v15, 0x41903d71    # 18.03f

    .line 1496
    .line 1497
    .line 1498
    const/high16 v16, 0x41100000    # 9.0f

    .line 1499
    .line 1500
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1501
    .line 1502
    .line 1503
    const v17, -0x40133333    # -1.85f

    .line 1504
    .line 1505
    .line 1506
    const v18, 0x3f9eb852    # 1.24f

    .line 1507
    .line 1508
    .line 1509
    const v13, -0x405eb852    # -1.26f

    .line 1510
    .line 1511
    .line 1512
    const/4 v14, 0x0

    .line 1513
    const v15, -0x402147ae    # -1.74f

    .line 1514
    .line 1515
    .line 1516
    const v16, 0x3f666666    # 0.9f

    .line 1517
    .line 1518
    .line 1519
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1520
    .line 1521
    .line 1522
    const v0, 0x3f7d70a4    # 0.99f

    .line 1523
    .line 1524
    .line 1525
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1526
    .line 1527
    .line 1528
    const v17, 0x3f59999a    # 0.85f

    .line 1529
    .line 1530
    .line 1531
    const v18, -0x40dc28f6    # -0.64f

    .line 1532
    .line 1533
    .line 1534
    const v13, 0x3de147ae    # 0.11f

    .line 1535
    .line 1536
    .line 1537
    const v14, -0x415c28f6    # -0.32f

    .line 1538
    .line 1539
    .line 1540
    const v15, 0x3eb33333    # 0.35f

    .line 1541
    .line 1542
    .line 1543
    const v16, -0x40dc28f6    # -0.64f

    .line 1544
    .line 1545
    .line 1546
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1547
    .line 1548
    .line 1549
    const/high16 v17, 0x3f400000    # 0.75f

    .line 1550
    .line 1551
    const v18, 0x3f266666    # 0.65f

    .line 1552
    .line 1553
    .line 1554
    const v13, 0x3ee147ae    # 0.44f

    .line 1555
    .line 1556
    .line 1557
    const/4 v14, 0x0

    .line 1558
    const/high16 v15, 0x3f400000    # 0.75f

    .line 1559
    .line 1560
    const v16, 0x3e851eb8    # 0.26f

    .line 1561
    .line 1562
    .line 1563
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1564
    .line 1565
    .line 1566
    const v17, -0x409eb852    # -0.88f

    .line 1567
    .line 1568
    .line 1569
    const v18, 0x3f3851ec    # 0.72f

    .line 1570
    .line 1571
    .line 1572
    const/4 v13, 0x0

    .line 1573
    const v14, 0x3f147ae1    # 0.58f

    .line 1574
    .line 1575
    .line 1576
    const v15, -0x40f33333    # -0.55f

    .line 1577
    .line 1578
    .line 1579
    const v16, 0x3f3851ec    # 0.72f

    .line 1580
    .line 1581
    .line 1582
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1583
    .line 1584
    .line 1585
    const v0, -0x41147ae1    # -0.46f

    .line 1586
    .line 1587
    .line 1588
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1589
    .line 1590
    .line 1591
    const/high16 v0, 0x3f800000    # 1.0f

    .line 1592
    .line 1593
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1594
    .line 1595
    .line 1596
    const/high16 v0, 0x3f000000    # 0.5f

    .line 1597
    .line 1598
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1599
    .line 1600
    .line 1601
    const v17, 0x3f851eb8    # 1.04f

    .line 1602
    .line 1603
    .line 1604
    const v18, 0x3f4a3d71    # 0.79f

    .line 1605
    .line 1606
    .line 1607
    const v13, 0x3f0f5c29    # 0.56f

    .line 1608
    .line 1609
    .line 1610
    const/4 v14, 0x0

    .line 1611
    const v15, 0x3f851eb8    # 1.04f

    .line 1612
    .line 1613
    .line 1614
    const v16, 0x3e75c28f    # 0.24f

    .line 1615
    .line 1616
    .line 1617
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1618
    .line 1619
    .line 1620
    const v17, 0x4187eb85    # 16.99f

    .line 1621
    .line 1622
    .line 1623
    const v18, 0x415f0a3d    # 13.94f

    .line 1624
    .line 1625
    .line 1626
    const v13, 0x418f0a3d    # 17.88f

    .line 1627
    .line 1628
    .line 1629
    const v14, 0x415a8f5c    # 13.66f

    .line 1630
    .line 1631
    .line 1632
    const v15, 0x418b3333    # 17.4f

    .line 1633
    .line 1634
    .line 1635
    const v16, 0x415f0a3d    # 13.94f

    .line 1636
    .line 1637
    .line 1638
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1639
    .line 1640
    .line 1641
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1642
    .line 1643
    .line 1644
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1645
    .line 1646
    .line 1647
    move-result-object v2

    .line 1648
    const/16 v16, 0x3800

    .line 1649
    .line 1650
    const/16 v17, 0x0

    .line 1651
    .line 1652
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1653
    .line 1654
    const/4 v7, 0x0

    .line 1655
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1656
    .line 1657
    const/4 v13, 0x0

    .line 1658
    const/4 v14, 0x0

    .line 1659
    const/4 v15, 0x0

    .line 1660
    const-string v4, ""

    .line 1661
    .line 1662
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1663
    .line 1664
    .line 1665
    move-result-object v0

    .line 1666
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1667
    .line 1668
    .line 1669
    move-result-object v0

    .line 1670
    sput-object v0, Landroidx/compose/material/icons/twotone/PinKt;->_pin:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1671
    .line 1672
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1673
    .line 1674
    .line 1675
    return-object v0
.end method
