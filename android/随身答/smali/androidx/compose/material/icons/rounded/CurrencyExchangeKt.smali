.class public final Landroidx/compose/material/icons/rounded/CurrencyExchangeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_currencyExchange",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "CurrencyExchange",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getCurrencyExchange",
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
        "SMAP\nCurrencyExchange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CurrencyExchange.kt\nandroidx/compose/material/icons/rounded/CurrencyExchangeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,97:1\n212#2,12:98\n233#2,18:111\n253#2:148\n174#3:110\n705#4,2:129\n717#4,2:131\n719#4,11:137\n72#5,4:133\n*S KotlinDebug\n*F\n+ 1 CurrencyExchange.kt\nandroidx/compose/material/icons/rounded/CurrencyExchangeKt\n*L\n29#1:98,12\n30#1:111,18\n30#1:148\n29#1:110\n30#1:129,2\n30#1:131,2\n30#1:137,11\n30#1:133,4\n*E\n"
    }
.end annotation


# static fields
.field private static _currencyExchange:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCurrencyExchange(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/CurrencyExchangeKt;->_currencyExchange:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.CurrencyExchange"

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
    const/high16 v0, 0x41b80000    # 23.0f

    .line 71
    .line 72
    const/high16 v2, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, 0x412f3333    # 10.95f

    .line 78
    .line 79
    .line 80
    const v18, -0x3ee1999a    # -9.9f

    .line 81
    .line 82
    .line 83
    const v13, 0x40b66666    # 5.7f

    .line 84
    .line 85
    .line 86
    const/4 v14, 0x0

    .line 87
    const v15, 0x41263d71    # 10.39f

    .line 88
    .line 89
    .line 90
    const v16, -0x3f751eb8    # -4.34f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v17, -0x40800000    # -1.0f

    .line 97
    .line 98
    const v18, -0x40733333    # -1.1f

    .line 99
    .line 100
    .line 101
    const v13, 0x3d75c28f    # 0.06f

    .line 102
    .line 103
    .line 104
    const v14, -0x40e8f5c3    # -0.59f

    .line 105
    .line 106
    .line 107
    const v15, -0x412e147b    # -0.41f

    .line 108
    .line 109
    .line 110
    const v16, -0x40733333    # -1.1f

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v17, -0x40828f5c    # -0.99f

    .line 117
    .line 118
    .line 119
    const v18, 0x3f6147ae    # 0.88f

    .line 120
    .line 121
    .line 122
    const v13, -0x40fd70a4    # -0.51f

    .line 123
    .line 124
    .line 125
    const/4 v14, 0x0

    .line 126
    const v15, -0x408f5c29    # -0.94f

    .line 127
    .line 128
    .line 129
    const v16, 0x3ec28f5c    # 0.38f

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v17, 0x41400000    # 12.0f

    .line 136
    .line 137
    const/high16 v18, 0x41a80000    # 21.0f

    .line 138
    .line 139
    const v13, 0x41a428f6    # 20.52f

    .line 140
    .line 141
    .line 142
    const v14, 0x418b851f    # 17.44f

    .line 143
    .line 144
    .line 145
    const v15, 0x41855c29    # 16.67f

    .line 146
    .line 147
    .line 148
    const/high16 v16, 0x41a80000    # 21.0f

    .line 149
    .line 150
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v17, -0x3f10a3d7    # -7.48f

    .line 154
    .line 155
    .line 156
    const/high16 v18, -0x3f800000    # -4.0f

    .line 157
    .line 158
    const v13, -0x3fb851ec    # -3.12f

    .line 159
    .line 160
    .line 161
    const/4 v14, 0x0

    .line 162
    const v15, -0x3f4428f6    # -5.87f

    .line 163
    .line 164
    .line 165
    const v16, -0x40347ae1    # -1.59f

    .line 166
    .line 167
    .line 168
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v0, 0x40c00000    # 6.0f

    .line 172
    .line 173
    const/high16 v2, 0x41880000    # 17.0f

    .line 174
    .line 175
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const/high16 v17, 0x3f800000    # 1.0f

    .line 179
    .line 180
    const/high16 v18, -0x40800000    # -1.0f

    .line 181
    .line 182
    const v13, 0x3f0ccccd    # 0.55f

    .line 183
    .line 184
    .line 185
    const/high16 v15, 0x3f800000    # 1.0f

    .line 186
    .line 187
    const v16, -0x4119999a    # -0.45f

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v0, -0x4119999a    # -0.45f

    .line 194
    .line 195
    .line 196
    const/high16 v2, -0x40800000    # -1.0f

    .line 197
    .line 198
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v0, 0x40000000    # 2.0f

    .line 202
    .line 203
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v17, -0x40800000    # -1.0f

    .line 207
    .line 208
    const/high16 v18, 0x3f800000    # 1.0f

    .line 209
    .line 210
    const v13, -0x40f33333    # -0.55f

    .line 211
    .line 212
    .line 213
    const/high16 v15, -0x40800000    # -1.0f

    .line 214
    .line 215
    const v16, 0x3ee66666    # 0.45f

    .line 216
    .line 217
    .line 218
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v0, 0x40800000    # 4.0f

    .line 222
    .line 223
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v17, 0x3f800000    # 1.0f

    .line 227
    .line 228
    const/4 v13, 0x0

    .line 229
    const v14, 0x3f0ccccd    # 0.55f

    .line 230
    .line 231
    .line 232
    const v15, 0x3ee66666    # 0.45f

    .line 233
    .line 234
    .line 235
    const/high16 v16, 0x3f800000    # 1.0f

    .line 236
    .line 237
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const/high16 v18, -0x40800000    # -1.0f

    .line 241
    .line 242
    const v13, 0x3f0ccccd    # 0.55f

    .line 243
    .line 244
    .line 245
    const/4 v14, 0x0

    .line 246
    const/high16 v15, 0x3f800000    # 1.0f

    .line 247
    .line 248
    const v16, -0x4119999a    # -0.45f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v0, -0x402a3d71    # -1.67f

    .line 255
    .line 256
    .line 257
    const/4 v2, 0x0

    .line 258
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v17, 0x41400000    # 12.0f

    .line 262
    .line 263
    const/high16 v18, 0x41b80000    # 23.0f

    .line 264
    .line 265
    const v13, 0x409fae14    # 4.99f

    .line 266
    .line 267
    .line 268
    const v14, 0x41a93333    # 21.15f

    .line 269
    .line 270
    .line 271
    const v15, 0x41047ae1    # 8.28f

    .line 272
    .line 273
    .line 274
    const/high16 v16, 0x41b80000    # 23.0f

    .line 275
    .line 276
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v0, 0x3f800000    # 1.0f

    .line 283
    .line 284
    const/high16 v2, 0x41400000    # 12.0f

    .line 285
    .line 286
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v17, 0x3f866666    # 1.05f

    .line 290
    .line 291
    .line 292
    const v18, 0x412e6666    # 10.9f

    .line 293
    .line 294
    .line 295
    const v13, 0x40c9999a    # 6.3f

    .line 296
    .line 297
    .line 298
    const/high16 v14, 0x3f800000    # 1.0f

    .line 299
    .line 300
    const v15, 0x3fce147b    # 1.61f

    .line 301
    .line 302
    .line 303
    const v16, 0x40aae148    # 5.34f

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v17, 0x40033333    # 2.05f

    .line 310
    .line 311
    .line 312
    const/high16 v18, 0x41400000    # 12.0f

    .line 313
    .line 314
    const/high16 v13, 0x3f800000    # 1.0f

    .line 315
    .line 316
    const v14, 0x4137d70a    # 11.49f

    .line 317
    .line 318
    .line 319
    const v15, 0x3fbae148    # 1.46f

    .line 320
    .line 321
    .line 322
    const/high16 v16, 0x41400000    # 12.0f

    .line 323
    .line 324
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v17, 0x3f7d70a4    # 0.99f

    .line 328
    .line 329
    .line 330
    const v18, -0x409eb852    # -0.88f

    .line 331
    .line 332
    .line 333
    const v13, 0x3f028f5c    # 0.51f

    .line 334
    .line 335
    .line 336
    const/4 v14, 0x0

    .line 337
    const v15, 0x3f70a3d7    # 0.94f

    .line 338
    .line 339
    .line 340
    const v16, -0x413d70a4    # -0.38f

    .line 341
    .line 342
    .line 343
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const/high16 v17, 0x41400000    # 12.0f

    .line 347
    .line 348
    const/high16 v18, 0x40400000    # 3.0f

    .line 349
    .line 350
    const v13, 0x405eb852    # 3.48f

    .line 351
    .line 352
    .line 353
    const v14, 0x40d1eb85    # 6.56f

    .line 354
    .line 355
    .line 356
    const v15, 0x40ea8f5c    # 7.33f

    .line 357
    .line 358
    .line 359
    const/high16 v16, 0x40400000    # 3.0f

    .line 360
    .line 361
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const v17, 0x40ef5c29    # 7.48f

    .line 365
    .line 366
    .line 367
    const/high16 v18, 0x40800000    # 4.0f

    .line 368
    .line 369
    const v13, 0x4047ae14    # 3.12f

    .line 370
    .line 371
    .line 372
    const/4 v14, 0x0

    .line 373
    const v15, 0x40bbd70a    # 5.87f

    .line 374
    .line 375
    .line 376
    const v16, 0x3fcb851f    # 1.59f

    .line 377
    .line 378
    .line 379
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const/high16 v0, 0x41900000    # 18.0f

    .line 383
    .line 384
    const/high16 v2, 0x40e00000    # 7.0f

    .line 385
    .line 386
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const/high16 v17, -0x40800000    # -1.0f

    .line 390
    .line 391
    const/high16 v18, 0x3f800000    # 1.0f

    .line 392
    .line 393
    const v13, -0x40f33333    # -0.55f

    .line 394
    .line 395
    .line 396
    const/high16 v15, -0x40800000    # -1.0f

    .line 397
    .line 398
    const v16, 0x3ee66666    # 0.45f

    .line 399
    .line 400
    .line 401
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const/high16 v17, 0x3f800000    # 1.0f

    .line 405
    .line 406
    const/4 v13, 0x0

    .line 407
    const v14, 0x3f0ccccd    # 0.55f

    .line 408
    .line 409
    .line 410
    const v15, 0x3ee66666    # 0.45f

    .line 411
    .line 412
    .line 413
    const/high16 v16, 0x3f800000    # 1.0f

    .line 414
    .line 415
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const/high16 v0, 0x40800000    # 4.0f

    .line 419
    .line 420
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v18, -0x40800000    # -1.0f

    .line 424
    .line 425
    const v13, 0x3f0ccccd    # 0.55f

    .line 426
    .line 427
    .line 428
    const/4 v14, 0x0

    .line 429
    const/high16 v15, 0x3f800000    # 1.0f

    .line 430
    .line 431
    const v16, -0x4119999a    # -0.45f

    .line 432
    .line 433
    .line 434
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const/high16 v17, -0x40800000    # -1.0f

    .line 441
    .line 442
    const/4 v13, 0x0

    .line 443
    const v14, -0x40f33333    # -0.55f

    .line 444
    .line 445
    .line 446
    const v15, -0x4119999a    # -0.45f

    .line 447
    .line 448
    .line 449
    const/high16 v16, -0x40800000    # -1.0f

    .line 450
    .line 451
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v0, 0x3ee66666    # 0.45f

    .line 455
    .line 456
    .line 457
    const/high16 v2, 0x3f800000    # 1.0f

    .line 458
    .line 459
    const/high16 v4, -0x40800000    # -1.0f

    .line 460
    .line 461
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const v0, 0x3fd5c28f    # 1.67f

    .line 465
    .line 466
    .line 467
    const/4 v2, 0x0

    .line 468
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const/high16 v17, 0x41400000    # 12.0f

    .line 472
    .line 473
    const/high16 v18, 0x3f800000    # 1.0f

    .line 474
    .line 475
    const v13, 0x4198147b    # 19.01f

    .line 476
    .line 477
    .line 478
    const v14, 0x40366666    # 2.85f

    .line 479
    .line 480
    .line 481
    const v15, 0x417b851f    # 15.72f

    .line 482
    .line 483
    .line 484
    const/high16 v16, 0x3f800000    # 1.0f

    .line 485
    .line 486
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const v0, 0x40bc28f6    # 5.88f

    .line 493
    .line 494
    .line 495
    const v2, 0x4131eb85    # 11.12f

    .line 496
    .line 497
    .line 498
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const/high16 v18, 0x40a00000    # 5.0f

    .line 502
    .line 503
    const v13, 0x4131eb85    # 11.12f

    .line 504
    .line 505
    .line 506
    const v14, 0x40ac7ae1    # 5.39f

    .line 507
    .line 508
    .line 509
    const v15, 0x413851ec    # 11.52f

    .line 510
    .line 511
    .line 512
    const/high16 v16, 0x40a00000    # 5.0f

    .line 513
    .line 514
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v0, 0x3ec7ae14    # 0.39f

    .line 518
    .line 519
    .line 520
    const v2, 0x3f6147ae    # 0.88f

    .line 521
    .line 522
    .line 523
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const v0, 0x3ebd70a4    # 0.37f

    .line 527
    .line 528
    .line 529
    const/4 v2, 0x0

    .line 530
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const v17, 0x400a3d71    # 2.16f

    .line 534
    .line 535
    .line 536
    const v18, 0x3fa66666    # 1.3f

    .line 537
    .line 538
    .line 539
    const v13, 0x3f88f5c3    # 1.07f

    .line 540
    .line 541
    .line 542
    const v14, 0x3e428f5c    # 0.19f

    .line 543
    .line 544
    .line 545
    const/high16 v15, 0x3fe00000    # 1.75f

    .line 546
    .line 547
    const v16, 0x3f428f5c    # 0.76f

    .line 548
    .line 549
    .line 550
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const v17, -0x4147ae14    # -0.36f

    .line 554
    .line 555
    .line 556
    const v13, 0x3eae147b    # 0.34f

    .line 557
    .line 558
    .line 559
    const v14, 0x3ee147ae    # 0.44f

    .line 560
    .line 561
    .line 562
    const v15, 0x3e23d70a    # 0.16f

    .line 563
    .line 564
    .line 565
    const v16, 0x3f8a3d71    # 1.08f

    .line 566
    .line 567
    .line 568
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const v17, 0x415a8f5c    # 13.66f

    .line 572
    .line 573
    .line 574
    const v18, 0x41091eb8    # 8.57f

    .line 575
    .line 576
    .line 577
    const v13, 0x41651eb8    # 14.32f

    .line 578
    .line 579
    .line 580
    const/high16 v14, 0x41100000    # 9.0f

    .line 581
    .line 582
    const v15, 0x415e6666    # 13.9f

    .line 583
    .line 584
    .line 585
    const v16, 0x410e147b    # 8.88f

    .line 586
    .line 587
    .line 588
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const v17, -0x40333333    # -1.6f

    .line 592
    .line 593
    .line 594
    const v18, -0x40bae148    # -0.77f

    .line 595
    .line 596
    .line 597
    const v13, -0x4170a3d7    # -0.28f

    .line 598
    .line 599
    .line 600
    const v14, -0x413d70a4    # -0.38f

    .line 601
    .line 602
    .line 603
    const v15, -0x40b851ec    # -0.78f

    .line 604
    .line 605
    .line 606
    const v16, -0x40bae148    # -0.77f

    .line 607
    .line 608
    .line 609
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    const v17, -0x401851ec    # -1.81f

    .line 613
    .line 614
    .line 615
    const v18, 0x3fb1eb85    # 1.39f

    .line 616
    .line 617
    .line 618
    const v13, -0x40cccccd    # -0.7f

    .line 619
    .line 620
    .line 621
    const/4 v14, 0x0

    .line 622
    const v15, -0x401851ec    # -1.81f

    .line 623
    .line 624
    .line 625
    const v16, 0x3ebd70a4    # 0.37f

    .line 626
    .line 627
    .line 628
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    const v17, 0x4028f5c3    # 2.64f

    .line 632
    .line 633
    .line 634
    const v18, 0x3ff33333    # 1.9f

    .line 635
    .line 636
    .line 637
    const/4 v13, 0x0

    .line 638
    const v14, 0x3f733333    # 0.95f

    .line 639
    .line 640
    .line 641
    const v15, 0x3f5c28f6    # 0.86f

    .line 642
    .line 643
    .line 644
    const v16, 0x3fa7ae14    # 1.31f

    .line 645
    .line 646
    .line 647
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const v17, 0x4040a3d7    # 3.01f

    .line 651
    .line 652
    .line 653
    const v18, 0x405ccccd    # 3.45f

    .line 654
    .line 655
    .line 656
    const v13, 0x4019999a    # 2.4f

    .line 657
    .line 658
    .line 659
    const v14, 0x3f547ae1    # 0.83f

    .line 660
    .line 661
    .line 662
    const v15, 0x4040a3d7    # 3.01f

    .line 663
    .line 664
    .line 665
    const v16, 0x40033333    # 2.05f

    .line 666
    .line 667
    .line 668
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const v17, -0x3fbeb852    # -3.02f

    .line 672
    .line 673
    .line 674
    const v18, 0x404e147b    # 3.22f

    .line 675
    .line 676
    .line 677
    const/4 v13, 0x0

    .line 678
    const v14, 0x4027ae14    # 2.62f

    .line 679
    .line 680
    .line 681
    const/high16 v15, -0x3fe00000    # -2.5f

    .line 682
    .line 683
    const v16, 0x404851ec    # 3.13f

    .line 684
    .line 685
    .line 686
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    const v17, -0x409eb852    # -0.88f

    .line 693
    .line 694
    .line 695
    const v18, 0x3f6147ae    # 0.88f

    .line 696
    .line 697
    .line 698
    const v14, 0x3ef5c28f    # 0.48f

    .line 699
    .line 700
    .line 701
    const v15, -0x413851ec    # -0.39f

    .line 702
    .line 703
    .line 704
    const v16, 0x3f6147ae    # 0.88f

    .line 705
    .line 706
    .line 707
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    const v0, -0x413851ec    # -0.39f

    .line 711
    .line 712
    .line 713
    const v2, -0x409eb852    # -0.88f

    .line 714
    .line 715
    .line 716
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 717
    .line 718
    .line 719
    const v0, -0x4128f5c3    # -0.42f

    .line 720
    .line 721
    .line 722
    const/4 v2, 0x0

    .line 723
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 724
    .line 725
    .line 726
    const v17, -0x3fd3d70a    # -2.69f

    .line 727
    .line 728
    .line 729
    const v18, -0x3ff9999a    # -2.1f

    .line 730
    .line 731
    .line 732
    const v13, -0x40deb852    # -0.63f

    .line 733
    .line 734
    .line 735
    const v14, -0x41e66666    # -0.15f

    .line 736
    .line 737
    .line 738
    const v15, -0x4008f5c3    # -1.93f

    .line 739
    .line 740
    .line 741
    const v16, -0x40e3d70a    # -0.61f

    .line 742
    .line 743
    .line 744
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 745
    .line 746
    .line 747
    const v17, 0x3efae148    # 0.49f

    .line 748
    .line 749
    .line 750
    const v18, -0x40666666    # -1.2f

    .line 751
    .line 752
    .line 753
    const v13, -0x41947ae1    # -0.23f

    .line 754
    .line 755
    .line 756
    const v14, -0x411eb852    # -0.44f

    .line 757
    .line 758
    .line 759
    const v15, 0x3cf5c28f    # 0.03f

    .line 760
    .line 761
    .line 762
    const v16, -0x407d70a4    # -1.02f

    .line 763
    .line 764
    .line 765
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 766
    .line 767
    .line 768
    const v17, 0x3f8e147b    # 1.11f

    .line 769
    .line 770
    .line 771
    const v18, 0x3ec28f5c    # 0.38f

    .line 772
    .line 773
    .line 774
    const v13, 0x3ed1eb85    # 0.41f

    .line 775
    .line 776
    .line 777
    const v14, -0x41dc28f6    # -0.16f

    .line 778
    .line 779
    .line 780
    const v15, 0x3f666666    # 0.9f

    .line 781
    .line 782
    .line 783
    const v16, -0x43dc28f6    # -0.01f

    .line 784
    .line 785
    .line 786
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 787
    .line 788
    .line 789
    const v17, 0x4007ae14    # 2.12f

    .line 790
    .line 791
    .line 792
    const v18, 0x3faf5c29    # 1.37f

    .line 793
    .line 794
    .line 795
    const v13, 0x3ea3d70a    # 0.32f

    .line 796
    .line 797
    .line 798
    const v14, 0x3f1c28f6    # 0.61f

    .line 799
    .line 800
    .line 801
    const v15, 0x3f733333    # 0.95f

    .line 802
    .line 803
    .line 804
    const v16, 0x3faf5c29    # 1.37f

    .line 805
    .line 806
    .line 807
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 808
    .line 809
    .line 810
    const v17, 0x3ffd70a4    # 1.98f

    .line 811
    .line 812
    .line 813
    const v18, -0x4031eb85    # -1.61f

    .line 814
    .line 815
    .line 816
    const v13, 0x3f6e147b    # 0.93f

    .line 817
    .line 818
    .line 819
    const/4 v14, 0x0

    .line 820
    const v15, 0x3ffd70a4    # 1.98f

    .line 821
    .line 822
    .line 823
    const v16, -0x410a3d71    # -0.48f

    .line 824
    .line 825
    .line 826
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 827
    .line 828
    .line 829
    const v17, -0x3fee147b    # -2.28f

    .line 830
    .line 831
    .line 832
    const v18, -0x3ffe147b    # -2.03f

    .line 833
    .line 834
    .line 835
    const/4 v13, 0x0

    .line 836
    const v14, -0x408a3d71    # -0.96f

    .line 837
    .line 838
    .line 839
    const v15, -0x40cccccd    # -0.7f

    .line 840
    .line 841
    .line 842
    const v16, -0x40451eb8    # -1.46f

    .line 843
    .line 844
    .line 845
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 846
    .line 847
    .line 848
    const v17, -0x3fa9999a    # -3.35f

    .line 849
    .line 850
    .line 851
    const v18, -0x3fac28f6    # -3.31f

    .line 852
    .line 853
    .line 854
    const v13, -0x40733333    # -1.1f

    .line 855
    .line 856
    .line 857
    const v14, -0x413851ec    # -0.39f

    .line 858
    .line 859
    .line 860
    const v15, -0x3fa9999a    # -3.35f

    .line 861
    .line 862
    .line 863
    const v16, -0x407c28f6    # -1.03f

    .line 864
    .line 865
    .line 866
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 867
    .line 868
    .line 869
    const v17, 0x4027ae14    # 2.62f

    .line 870
    .line 871
    .line 872
    const v18, -0x3fc28f5c    # -2.96f

    .line 873
    .line 874
    .line 875
    const/4 v13, 0x0

    .line 876
    const v14, -0x42333333    # -0.1f

    .line 877
    .line 878
    .line 879
    const v15, 0x3c23d70a    # 0.01f

    .line 880
    .line 881
    .line 882
    const v16, -0x3fe66666    # -2.4f

    .line 883
    .line 884
    .line 885
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 886
    .line 887
    .line 888
    const v0, 0x40bc28f6    # 5.88f

    .line 889
    .line 890
    .line 891
    const v2, 0x4131eb85    # 11.12f

    .line 892
    .line 893
    .line 894
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 895
    .line 896
    .line 897
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 898
    .line 899
    .line 900
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 901
    .line 902
    .line 903
    move-result-object v2

    .line 904
    const/16 v16, 0x3800

    .line 905
    .line 906
    const/16 v17, 0x0

    .line 907
    .line 908
    const/high16 v6, 0x3f800000    # 1.0f

    .line 909
    .line 910
    const/high16 v8, 0x3f800000    # 1.0f

    .line 911
    .line 912
    const/4 v7, 0x0

    .line 913
    const/high16 v9, 0x3f800000    # 1.0f

    .line 914
    .line 915
    const/high16 v12, 0x3f800000    # 1.0f

    .line 916
    .line 917
    const/4 v14, 0x0

    .line 918
    const/4 v15, 0x0

    .line 919
    const-string v4, ""

    .line 920
    .line 921
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 922
    .line 923
    .line 924
    move-result-object v0

    .line 925
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 926
    .line 927
    .line 928
    move-result-object v0

    .line 929
    sput-object v0, Landroidx/compose/material/icons/rounded/CurrencyExchangeKt;->_currencyExchange:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 930
    .line 931
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 932
    .line 933
    .line 934
    return-object v0
.end method
