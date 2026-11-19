.class public final Landroidx/compose/material/icons/filled/SignLanguageKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_signLanguage",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SignLanguage",
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getSignLanguage",
        "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nSignLanguage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignLanguage.kt\nandroidx/compose/material/icons/filled/SignLanguageKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,101:1\n212#2,12:102\n233#2,18:115\n253#2:152\n174#3:114\n705#4,2:133\n717#4,2:135\n719#4,11:141\n72#5,4:137\n*S KotlinDebug\n*F\n+ 1 SignLanguage.kt\nandroidx/compose/material/icons/filled/SignLanguageKt\n*L\n29#1:102,12\n30#1:115,18\n30#1:152\n29#1:114\n30#1:133,2\n30#1:135,2\n30#1:141,11\n30#1:137,4\n*E\n"
    }
.end annotation


# static fields
.field private static _signLanguage:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSignLanguage(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/SignLanguageKt;->_signLanguage:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.SignLanguage"

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
    const/high16 v0, 0x41500000    # 13.0f

    .line 71
    .line 72
    const v2, 0x4147d70a    # 12.49f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v0, -0x4091eb85    # -0.93f

    .line 79
    .line 80
    .line 81
    const v2, -0x4011eb85    # -1.86f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v17, 0x3f2b851f    # 0.67f

    .line 88
    .line 89
    .line 90
    const v18, -0x3fff5c29    # -2.01f

    .line 91
    .line 92
    .line 93
    const v13, -0x41428f5c    # -0.37f

    .line 94
    .line 95
    .line 96
    const v14, -0x40c28f5c    # -0.74f

    .line 97
    .line 98
    .line 99
    const v15, -0x4270a3d7    # -0.07f

    .line 100
    .line 101
    .line 102
    const v16, -0x402e147b    # -1.64f

    .line 103
    .line 104
    .line 105
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const/high16 v0, 0x41100000    # 9.0f

    .line 109
    .line 110
    const v2, 0x4147d70a    # 12.49f

    .line 111
    .line 112
    .line 113
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v0, 0x40b75c29    # 5.73f

    .line 117
    .line 118
    .line 119
    const v2, 0x40aeb852    # 5.46f

    .line 120
    .line 121
    .line 122
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const v17, 0x3f47ae14    # 0.78f

    .line 126
    .line 127
    .line 128
    const v18, 0x3fe7ae14    # 1.81f

    .line 129
    .line 130
    .line 131
    const/high16 v13, 0x3f000000    # 0.5f

    .line 132
    .line 133
    const v14, 0x3ef0a3d7    # 0.47f

    .line 134
    .line 135
    .line 136
    const v15, 0x3f47ae14    # 0.78f

    .line 137
    .line 138
    .line 139
    const v16, 0x3f90a3d7    # 1.13f

    .line 140
    .line 141
    .line 142
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v0, 0x40a75c29    # 5.23f

    .line 146
    .line 147
    .line 148
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 152
    .line 153
    const/high16 v18, 0x40200000    # 2.5f

    .line 154
    .line 155
    const/4 v13, 0x0

    .line 156
    const v14, 0x3fb0a3d7    # 1.38f

    .line 157
    .line 158
    .line 159
    const v15, -0x4070a3d7    # -1.12f

    .line 160
    .line 161
    .line 162
    const/high16 v16, 0x40200000    # 2.5f

    .line 163
    .line 164
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v0, -0x3ed00000    # -11.0f

    .line 168
    .line 169
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v17, -0x40800000    # -1.0f

    .line 173
    .line 174
    const/high16 v18, -0x40800000    # -1.0f

    .line 175
    .line 176
    const v13, -0x40f33333    # -0.55f

    .line 177
    .line 178
    .line 179
    const/4 v14, 0x0

    .line 180
    const/high16 v15, -0x40800000    # -1.0f

    .line 181
    .line 182
    const v16, -0x4119999a    # -0.45f

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v17, 0x3f800000    # 1.0f

    .line 189
    .line 190
    const/4 v13, 0x0

    .line 191
    const v14, -0x40f33333    # -0.55f

    .line 192
    .line 193
    .line 194
    const v15, 0x3ee66666    # 0.45f

    .line 195
    .line 196
    .line 197
    const/high16 v16, -0x40800000    # -1.0f

    .line 198
    .line 199
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v0, 0x41200000    # 10.0f

    .line 203
    .line 204
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v0, -0x40800000    # -1.0f

    .line 208
    .line 209
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v0, 0x40800000    # 4.0f

    .line 213
    .line 214
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v17, -0x40800000    # -1.0f

    .line 218
    .line 219
    const v13, -0x40f33333    # -0.55f

    .line 220
    .line 221
    .line 222
    const/4 v14, 0x0

    .line 223
    const/high16 v15, -0x40800000    # -1.0f

    .line 224
    .line 225
    const v16, -0x4119999a    # -0.45f

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const/high16 v17, 0x3f800000    # 1.0f

    .line 232
    .line 233
    const/4 v13, 0x0

    .line 234
    const v14, -0x40f33333    # -0.55f

    .line 235
    .line 236
    .line 237
    const v15, 0x3ee66666    # 0.45f

    .line 238
    .line 239
    .line 240
    const/high16 v16, -0x40800000    # -1.0f

    .line 241
    .line 242
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const/high16 v0, 0x40c00000    # 6.0f

    .line 246
    .line 247
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v0, -0x40800000    # -1.0f

    .line 251
    .line 252
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v0, 0x40400000    # 3.0f

    .line 256
    .line 257
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v17, -0x40800000    # -1.0f

    .line 261
    .line 262
    const v13, -0x40f33333    # -0.55f

    .line 263
    .line 264
    .line 265
    const/4 v14, 0x0

    .line 266
    const/high16 v15, -0x40800000    # -1.0f

    .line 267
    .line 268
    const v16, -0x4119999a    # -0.45f

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/high16 v17, 0x3f800000    # 1.0f

    .line 275
    .line 276
    const/4 v13, 0x0

    .line 277
    const v14, -0x40f33333    # -0.55f

    .line 278
    .line 279
    .line 280
    const v15, 0x3ee66666    # 0.45f

    .line 281
    .line 282
    .line 283
    const/high16 v16, -0x40800000    # -1.0f

    .line 284
    .line 285
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/high16 v0, 0x40e00000    # 7.0f

    .line 289
    .line 290
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v0, -0x40800000    # -1.0f

    .line 294
    .line 295
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v0, 0x40900000    # 4.5f

    .line 299
    .line 300
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v17, -0x40800000    # -1.0f

    .line 304
    .line 305
    const v13, -0x40f33333    # -0.55f

    .line 306
    .line 307
    .line 308
    const/4 v14, 0x0

    .line 309
    const/high16 v15, -0x40800000    # -1.0f

    .line 310
    .line 311
    const v16, -0x4119999a    # -0.45f

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const/high16 v17, 0x3f800000    # 1.0f

    .line 318
    .line 319
    const/4 v13, 0x0

    .line 320
    const v14, -0x40f33333    # -0.55f

    .line 321
    .line 322
    .line 323
    const v15, 0x3ee66666    # 0.45f

    .line 324
    .line 325
    .line 326
    const/high16 v16, -0x40800000    # -1.0f

    .line 327
    .line 328
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v0, 0x4147d70a    # 12.49f

    .line 332
    .line 333
    .line 334
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const v0, 0x40e3d70a    # 7.12f

    .line 341
    .line 342
    .line 343
    const v2, 0x413c7ae1    # 11.78f

    .line 344
    .line 345
    .line 346
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v17, -0x402f5c29    # -1.63f

    .line 350
    .line 351
    .line 352
    const v18, 0x3f9851ec    # 1.19f

    .line 353
    .line 354
    .line 355
    const v13, -0x40a8f5c3    # -0.84f

    .line 356
    .line 357
    .line 358
    const v14, 0x3ecccccd    # 0.4f

    .line 359
    .line 360
    .line 361
    const v15, -0x406a3d71    # -1.17f

    .line 362
    .line 363
    .line 364
    const v16, 0x3f1eb852    # 0.62f

    .line 365
    .line 366
    .line 367
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v0, -0x3fd33333    # -2.7f

    .line 371
    .line 372
    .line 373
    const v2, -0x3fc9999a    # -2.85f

    .line 374
    .line 375
    .line 376
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v17, 0x3d23d70a    # 0.04f

    .line 380
    .line 381
    .line 382
    const v18, -0x404b851f    # -1.41f

    .line 383
    .line 384
    .line 385
    const v13, -0x413d70a4    # -0.38f

    .line 386
    .line 387
    .line 388
    const v14, -0x41333333    # -0.4f

    .line 389
    .line 390
    .line 391
    const v15, -0x4147ae14    # -0.36f

    .line 392
    .line 393
    .line 394
    const v16, -0x407c28f6    # -1.03f

    .line 395
    .line 396
    .line 397
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v17, 0x3fb47ae1    # 1.41f

    .line 401
    .line 402
    .line 403
    const v18, 0x3d23d70a    # 0.04f

    .line 404
    .line 405
    .line 406
    const v13, 0x3ecccccd    # 0.4f

    .line 407
    .line 408
    .line 409
    const v14, -0x413d70a4    # -0.38f

    .line 410
    .line 411
    .line 412
    const v15, 0x3f83d70a    # 1.03f

    .line 413
    .line 414
    .line 415
    const v16, -0x4147ae14    # -0.36f

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v0, 0x40e3d70a    # 7.12f

    .line 422
    .line 423
    .line 424
    const v2, 0x413c7ae1    # 11.78f

    .line 425
    .line 426
    .line 427
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v0, 0x41135c29    # 9.21f

    .line 434
    .line 435
    .line 436
    const v2, 0x411a3d71    # 9.64f

    .line 437
    .line 438
    .line 439
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v17, 0x41170a3d    # 9.44f

    .line 443
    .line 444
    .line 445
    const/high16 v18, 0x41300000    # 11.0f

    .line 446
    .line 447
    const v13, 0x41168f5c    # 9.41f

    .line 448
    .line 449
    .line 450
    const v14, 0x411c28f6    # 9.76f

    .line 451
    .line 452
    .line 453
    const v15, 0x4115999a    # 9.35f

    .line 454
    .line 455
    .line 456
    const v16, 0x41273333    # 10.45f

    .line 457
    .line 458
    .line 459
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const v0, 0x410947ae    # 8.58f

    .line 463
    .line 464
    .line 465
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const v0, 0x40c9eb85    # 6.31f

    .line 469
    .line 470
    .line 471
    const v2, 0x4109c28f    # 8.61f

    .line 472
    .line 473
    .line 474
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const v17, 0x40cb3333    # 6.35f

    .line 478
    .line 479
    .line 480
    const v18, 0x40e66666    # 7.2f

    .line 481
    .line 482
    .line 483
    const v13, 0x40bdc28f    # 5.93f

    .line 484
    .line 485
    .line 486
    const v14, 0x41035c29    # 8.21f

    .line 487
    .line 488
    .line 489
    const v15, 0x40be147b    # 5.94f

    .line 490
    .line 491
    .line 492
    const v16, 0x40f28f5c    # 7.58f

    .line 493
    .line 494
    .line 495
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const v17, 0x3fb47ae1    # 1.41f

    .line 499
    .line 500
    .line 501
    const v18, 0x3d23d70a    # 0.04f

    .line 502
    .line 503
    .line 504
    const v13, 0x3ecccccd    # 0.4f

    .line 505
    .line 506
    .line 507
    const v14, -0x413d70a4    # -0.38f

    .line 508
    .line 509
    .line 510
    const v15, 0x3f83d70a    # 1.03f

    .line 511
    .line 512
    .line 513
    const v16, -0x4147ae14    # -0.36f

    .line 514
    .line 515
    .line 516
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const v0, 0x41135c29    # 9.21f

    .line 520
    .line 521
    .line 522
    const v2, 0x411a3d71    # 9.64f

    .line 523
    .line 524
    .line 525
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const v0, 0x41a2a3d7    # 20.33f

    .line 532
    .line 533
    .line 534
    const v2, 0x415e8f5c    # 13.91f

    .line 535
    .line 536
    .line 537
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const v0, 0x3f6147ae    # 0.88f

    .line 541
    .line 542
    .line 543
    const v2, -0x40ab851f    # -0.83f

    .line 544
    .line 545
    .line 546
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const v17, 0x3f4a3d71    # 0.79f

    .line 550
    .line 551
    .line 552
    const v18, -0x40170a3d    # -1.82f

    .line 553
    .line 554
    .line 555
    const/high16 v13, 0x3f000000    # 0.5f

    .line 556
    .line 557
    const v14, -0x410f5c29    # -0.47f

    .line 558
    .line 559
    .line 560
    const v15, 0x3f4a3d71    # 0.79f

    .line 561
    .line 562
    .line 563
    const v16, -0x406f5c29    # -1.13f

    .line 564
    .line 565
    .line 566
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const v0, 0x40566666    # 3.35f

    .line 570
    .line 571
    .line 572
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const v0, -0x4175c28f    # -0.27f

    .line 576
    .line 577
    .line 578
    const v2, -0x42333333    # -0.1f

    .line 579
    .line 580
    .line 581
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const v17, -0x400a3d71    # -1.92f

    .line 585
    .line 586
    .line 587
    const v18, 0x3f666666    # 0.9f

    .line 588
    .line 589
    .line 590
    const v13, -0x40b851ec    # -0.78f

    .line 591
    .line 592
    .line 593
    const v14, -0x4170a3d7    # -0.28f

    .line 594
    .line 595
    .line 596
    const v15, -0x402e147b    # -1.64f

    .line 597
    .line 598
    .line 599
    const v16, 0x3df5c28f    # 0.12f

    .line 600
    .line 601
    .line 602
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const v0, 0x4198cccd    # 19.1f

    .line 606
    .line 607
    .line 608
    const v2, 0x40c3851f    # 6.11f

    .line 609
    .line 610
    .line 611
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const/high16 v0, -0x3f500000    # -5.5f

    .line 615
    .line 616
    const v2, -0x3f466666    # -5.8f

    .line 617
    .line 618
    .line 619
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const v17, -0x404b851f    # -1.41f

    .line 623
    .line 624
    .line 625
    const v18, -0x42dc28f6    # -0.04f

    .line 626
    .line 627
    .line 628
    const v13, -0x413d70a4    # -0.38f

    .line 629
    .line 630
    .line 631
    const v14, -0x41333333    # -0.4f

    .line 632
    .line 633
    .line 634
    const v15, -0x407eb852    # -1.01f

    .line 635
    .line 636
    .line 637
    const v16, -0x4128f5c3    # -0.42f

    .line 638
    .line 639
    .line 640
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const v17, -0x42dc28f6    # -0.04f

    .line 644
    .line 645
    .line 646
    const v18, 0x3fb47ae1    # 1.41f

    .line 647
    .line 648
    .line 649
    const v13, -0x41333333    # -0.4f

    .line 650
    .line 651
    .line 652
    const v14, 0x3ec28f5c    # 0.38f

    .line 653
    .line 654
    .line 655
    const v15, -0x4128f5c3    # -0.42f

    .line 656
    .line 657
    .line 658
    const v16, 0x3f8147ae    # 1.01f

    .line 659
    .line 660
    .line 661
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const v0, 0x40728f5c    # 3.79f

    .line 665
    .line 666
    .line 667
    const v2, 0x407f5c29    # 3.99f

    .line 668
    .line 669
    .line 670
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 671
    .line 672
    .line 673
    const v0, -0x40c51eb8    # -0.73f

    .line 674
    .line 675
    .line 676
    const v2, 0x3f30a3d7    # 0.69f

    .line 677
    .line 678
    .line 679
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    const v0, -0x3f65c28f    # -4.82f

    .line 683
    .line 684
    .line 685
    const v2, -0x3f5d70a4    # -5.08f

    .line 686
    .line 687
    .line 688
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    const v17, -0x404b851f    # -1.41f

    .line 692
    .line 693
    .line 694
    const v18, -0x42dc28f6    # -0.04f

    .line 695
    .line 696
    .line 697
    const v13, -0x413d70a4    # -0.38f

    .line 698
    .line 699
    .line 700
    const v14, -0x41333333    # -0.4f

    .line 701
    .line 702
    .line 703
    const v15, -0x407eb852    # -1.01f

    .line 704
    .line 705
    .line 706
    const v16, -0x4128f5c3    # -0.42f

    .line 707
    .line 708
    .line 709
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    const v17, -0x42dc28f6    # -0.04f

    .line 713
    .line 714
    .line 715
    const v18, 0x3fb47ae1    # 1.41f

    .line 716
    .line 717
    .line 718
    const v13, -0x41333333    # -0.4f

    .line 719
    .line 720
    .line 721
    const v14, 0x3ec28f5c    # 0.38f

    .line 722
    .line 723
    .line 724
    const v15, -0x4128f5c3    # -0.42f

    .line 725
    .line 726
    .line 727
    const v16, 0x3f8147ae    # 1.01f

    .line 728
    .line 729
    .line 730
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 731
    .line 732
    .line 733
    const v0, 0x4071eb85    # 3.78f

    .line 734
    .line 735
    .line 736
    const v2, 0x407eb852    # 3.98f

    .line 737
    .line 738
    .line 739
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    const v0, 0x4176147b    # 15.38f

    .line 743
    .line 744
    .line 745
    const/high16 v2, 0x41100000    # 9.0f

    .line 746
    .line 747
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 748
    .line 749
    .line 750
    const v0, 0x40670a3d    # 3.61f

    .line 751
    .line 752
    .line 753
    const v2, 0x405b851f    # 3.43f

    .line 754
    .line 755
    .line 756
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 757
    .line 758
    .line 759
    const v0, 0x3f1c28f6    # 0.61f

    .line 760
    .line 761
    .line 762
    const v2, 0x3f147ae1    # 0.58f

    .line 763
    .line 764
    .line 765
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 766
    .line 767
    .line 768
    const v17, 0x41a2a3d7    # 20.33f

    .line 769
    .line 770
    .line 771
    const v18, 0x415e8f5c    # 13.91f

    .line 772
    .line 773
    .line 774
    const v13, 0x419f1eb8    # 19.89f

    .line 775
    .line 776
    .line 777
    const v14, 0x41547ae1    # 13.28f

    .line 778
    .line 779
    .line 780
    const v15, 0x41a10a3d    # 20.13f

    .line 781
    .line 782
    .line 783
    const v16, 0x415947ae    # 13.58f

    .line 784
    .line 785
    .line 786
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 787
    .line 788
    .line 789
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 790
    .line 791
    .line 792
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 793
    .line 794
    .line 795
    move-result-object v2

    .line 796
    const/16 v16, 0x3800

    .line 797
    .line 798
    const/16 v17, 0x0

    .line 799
    .line 800
    const/high16 v6, 0x3f800000    # 1.0f

    .line 801
    .line 802
    const/high16 v8, 0x3f800000    # 1.0f

    .line 803
    .line 804
    const/4 v7, 0x0

    .line 805
    const/high16 v9, 0x3f800000    # 1.0f

    .line 806
    .line 807
    const/high16 v12, 0x3f800000    # 1.0f

    .line 808
    .line 809
    const/4 v13, 0x0

    .line 810
    const/4 v14, 0x0

    .line 811
    const/4 v15, 0x0

    .line 812
    const-string v4, ""

    .line 813
    .line 814
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 815
    .line 816
    .line 817
    move-result-object v0

    .line 818
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 819
    .line 820
    .line 821
    move-result-object v0

    .line 822
    sput-object v0, Landroidx/compose/material/icons/filled/SignLanguageKt;->_signLanguage:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 823
    .line 824
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 825
    .line 826
    .line 827
    return-object v0
.end method
