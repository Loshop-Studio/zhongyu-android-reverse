.class public final Landroidx/compose/material/icons/rounded/SignLanguageKt;
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
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getSignLanguage",
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
        "SMAP\nSignLanguage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignLanguage.kt\nandroidx/compose/material/icons/rounded/SignLanguageKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,103:1\n212#2,12:104\n233#2,18:117\n253#2:154\n174#3:116\n705#4,2:135\n717#4,2:137\n719#4,11:143\n72#5,4:139\n*S KotlinDebug\n*F\n+ 1 SignLanguage.kt\nandroidx/compose/material/icons/rounded/SignLanguageKt\n*L\n29#1:104,12\n30#1:117,18\n30#1:154\n29#1:116\n30#1:135,2\n30#1:137,2\n30#1:143,11\n30#1:139,4\n*E\n"
    }
.end annotation


# static fields
.field private static _signLanguage:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSignLanguage(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SignLanguageKt;->_signLanguage:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SignLanguage"

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
    const/4 v0, 0x0

    .line 109
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v17, 0x3ef0a3d7    # 0.47f

    .line 113
    .line 114
    .line 115
    const v18, 0x3d8f5c29    # 0.07f

    .line 116
    .line 117
    .line 118
    const v13, 0x3e23d70a    # 0.16f

    .line 119
    .line 120
    .line 121
    const v14, -0x425c28f6    # -0.08f

    .line 122
    .line 123
    .line 124
    const v15, 0x3eae147b    # 0.34f

    .line 125
    .line 126
    .line 127
    const v16, -0x42b33333    # -0.05f

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v0, 0x40b0f5c3    # 5.53f

    .line 134
    .line 135
    .line 136
    const v2, 0x40a851ec    # 5.26f

    .line 137
    .line 138
    .line 139
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v17, 0x3f47ae14    # 0.78f

    .line 143
    .line 144
    .line 145
    const v18, 0x3fe7ae14    # 1.81f

    .line 146
    .line 147
    .line 148
    const/high16 v13, 0x3f000000    # 0.5f

    .line 149
    .line 150
    const v14, 0x3ef0a3d7    # 0.47f

    .line 151
    .line 152
    .line 153
    const v15, 0x3f47ae14    # 0.78f

    .line 154
    .line 155
    .line 156
    const v16, 0x3f90a3d7    # 1.13f

    .line 157
    .line 158
    .line 159
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v0, 0x40a75c29    # 5.23f

    .line 163
    .line 164
    .line 165
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 169
    .line 170
    const/high16 v18, 0x40200000    # 2.5f

    .line 171
    .line 172
    const/4 v13, 0x0

    .line 173
    const v14, 0x3fb0a3d7    # 1.38f

    .line 174
    .line 175
    .line 176
    const v15, -0x4070a3d7    # -1.12f

    .line 177
    .line 178
    .line 179
    const/high16 v16, 0x40200000    # 2.5f

    .line 180
    .line 181
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const/high16 v0, -0x3ed00000    # -11.0f

    .line 185
    .line 186
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/high16 v17, -0x40800000    # -1.0f

    .line 190
    .line 191
    const/high16 v18, -0x40800000    # -1.0f

    .line 192
    .line 193
    const v13, -0x40f33333    # -0.55f

    .line 194
    .line 195
    .line 196
    const/4 v14, 0x0

    .line 197
    const/high16 v15, -0x40800000    # -1.0f

    .line 198
    .line 199
    const v16, -0x4119999a    # -0.45f

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v17, 0x3f800000    # 1.0f

    .line 206
    .line 207
    const/4 v13, 0x0

    .line 208
    const v14, -0x40f33333    # -0.55f

    .line 209
    .line 210
    .line 211
    const v15, 0x3ee66666    # 0.45f

    .line 212
    .line 213
    .line 214
    const/high16 v16, -0x40800000    # -1.0f

    .line 215
    .line 216
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const/high16 v0, 0x41200000    # 10.0f

    .line 220
    .line 221
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/high16 v0, -0x40800000    # -1.0f

    .line 225
    .line 226
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/high16 v0, 0x40800000    # 4.0f

    .line 230
    .line 231
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v17, -0x40800000    # -1.0f

    .line 235
    .line 236
    const v13, -0x40f33333    # -0.55f

    .line 237
    .line 238
    .line 239
    const/4 v14, 0x0

    .line 240
    const/high16 v15, -0x40800000    # -1.0f

    .line 241
    .line 242
    const v16, -0x4119999a    # -0.45f

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const/high16 v17, 0x3f800000    # 1.0f

    .line 249
    .line 250
    const/4 v13, 0x0

    .line 251
    const v14, -0x40f33333    # -0.55f

    .line 252
    .line 253
    .line 254
    const v15, 0x3ee66666    # 0.45f

    .line 255
    .line 256
    .line 257
    const/high16 v16, -0x40800000    # -1.0f

    .line 258
    .line 259
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v0, 0x40c00000    # 6.0f

    .line 263
    .line 264
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/high16 v0, -0x40800000    # -1.0f

    .line 268
    .line 269
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v0, 0x40400000    # 3.0f

    .line 273
    .line 274
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v17, -0x40800000    # -1.0f

    .line 278
    .line 279
    const v13, -0x40f33333    # -0.55f

    .line 280
    .line 281
    .line 282
    const/4 v14, 0x0

    .line 283
    const/high16 v15, -0x40800000    # -1.0f

    .line 284
    .line 285
    const v16, -0x4119999a    # -0.45f

    .line 286
    .line 287
    .line 288
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const/high16 v17, 0x3f800000    # 1.0f

    .line 292
    .line 293
    const/4 v13, 0x0

    .line 294
    const v14, -0x40f33333    # -0.55f

    .line 295
    .line 296
    .line 297
    const v15, 0x3ee66666    # 0.45f

    .line 298
    .line 299
    .line 300
    const/high16 v16, -0x40800000    # -1.0f

    .line 301
    .line 302
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v0, 0x40e00000    # 7.0f

    .line 306
    .line 307
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v0, -0x40800000    # -1.0f

    .line 311
    .line 312
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v0, 0x40900000    # 4.5f

    .line 316
    .line 317
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/high16 v17, -0x40800000    # -1.0f

    .line 321
    .line 322
    const v13, -0x40f33333    # -0.55f

    .line 323
    .line 324
    .line 325
    const/4 v14, 0x0

    .line 326
    const/high16 v15, -0x40800000    # -1.0f

    .line 327
    .line 328
    const v16, -0x4119999a    # -0.45f

    .line 329
    .line 330
    .line 331
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const/high16 v17, 0x3f800000    # 1.0f

    .line 335
    .line 336
    const/4 v13, 0x0

    .line 337
    const v14, -0x40f33333    # -0.55f

    .line 338
    .line 339
    .line 340
    const v15, 0x3ee66666    # 0.45f

    .line 341
    .line 342
    .line 343
    const/high16 v16, -0x40800000    # -1.0f

    .line 344
    .line 345
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v0, 0x4147d70a    # 12.49f

    .line 349
    .line 350
    .line 351
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v0, 0x40e3d70a    # 7.12f

    .line 358
    .line 359
    .line 360
    const v2, 0x413c7ae1    # 11.78f

    .line 361
    .line 362
    .line 363
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const v17, -0x402f5c29    # -1.63f

    .line 367
    .line 368
    .line 369
    const v18, 0x3f9851ec    # 1.19f

    .line 370
    .line 371
    .line 372
    const v13, -0x40a8f5c3    # -0.84f

    .line 373
    .line 374
    .line 375
    const v14, 0x3ecccccd    # 0.4f

    .line 376
    .line 377
    .line 378
    const v15, -0x406a3d71    # -1.17f

    .line 379
    .line 380
    .line 381
    const v16, 0x3f1eb852    # 0.62f

    .line 382
    .line 383
    .line 384
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v0, -0x3fd33333    # -2.7f

    .line 388
    .line 389
    .line 390
    const v2, -0x3fc9999a    # -2.85f

    .line 391
    .line 392
    .line 393
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v17, 0x3d23d70a    # 0.04f

    .line 397
    .line 398
    .line 399
    const v18, -0x404b851f    # -1.41f

    .line 400
    .line 401
    .line 402
    const v13, -0x413d70a4    # -0.38f

    .line 403
    .line 404
    .line 405
    const v14, -0x41333333    # -0.4f

    .line 406
    .line 407
    .line 408
    const v15, -0x4147ae14    # -0.36f

    .line 409
    .line 410
    .line 411
    const v16, -0x407c28f6    # -1.03f

    .line 412
    .line 413
    .line 414
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const v17, 0x3fb47ae1    # 1.41f

    .line 418
    .line 419
    .line 420
    const v18, 0x3d23d70a    # 0.04f

    .line 421
    .line 422
    .line 423
    const v13, 0x3ecccccd    # 0.4f

    .line 424
    .line 425
    .line 426
    const v14, -0x413d70a4    # -0.38f

    .line 427
    .line 428
    .line 429
    const v15, 0x3f83d70a    # 1.03f

    .line 430
    .line 431
    .line 432
    const v16, -0x4147ae14    # -0.36f

    .line 433
    .line 434
    .line 435
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v0, 0x40e3d70a    # 7.12f

    .line 439
    .line 440
    .line 441
    const v2, 0x413c7ae1    # 11.78f

    .line 442
    .line 443
    .line 444
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v0, 0x41135c29    # 9.21f

    .line 451
    .line 452
    .line 453
    const v2, 0x411a3d71    # 9.64f

    .line 454
    .line 455
    .line 456
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v17, 0x41170a3d    # 9.44f

    .line 460
    .line 461
    .line 462
    const/high16 v18, 0x41300000    # 11.0f

    .line 463
    .line 464
    const v13, 0x41168f5c    # 9.41f

    .line 465
    .line 466
    .line 467
    const v14, 0x411c28f6    # 9.76f

    .line 468
    .line 469
    .line 470
    const v15, 0x4115999a    # 9.35f

    .line 471
    .line 472
    .line 473
    const v16, 0x41273333    # 10.45f

    .line 474
    .line 475
    .line 476
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const v0, 0x410947ae    # 8.58f

    .line 480
    .line 481
    .line 482
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v0, 0x40c9eb85    # 6.31f

    .line 486
    .line 487
    .line 488
    const v2, 0x4109c28f    # 8.61f

    .line 489
    .line 490
    .line 491
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const v17, 0x40cb3333    # 6.35f

    .line 495
    .line 496
    .line 497
    const v18, 0x40e66666    # 7.2f

    .line 498
    .line 499
    .line 500
    const v13, 0x40bdc28f    # 5.93f

    .line 501
    .line 502
    .line 503
    const v14, 0x41035c29    # 8.21f

    .line 504
    .line 505
    .line 506
    const v15, 0x40be147b    # 5.94f

    .line 507
    .line 508
    .line 509
    const v16, 0x40f28f5c    # 7.58f

    .line 510
    .line 511
    .line 512
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const v17, 0x3fb47ae1    # 1.41f

    .line 516
    .line 517
    .line 518
    const v18, 0x3d23d70a    # 0.04f

    .line 519
    .line 520
    .line 521
    const v13, 0x3ecccccd    # 0.4f

    .line 522
    .line 523
    .line 524
    const v14, -0x413d70a4    # -0.38f

    .line 525
    .line 526
    .line 527
    const v15, 0x3f83d70a    # 1.03f

    .line 528
    .line 529
    .line 530
    const v16, -0x4147ae14    # -0.36f

    .line 531
    .line 532
    .line 533
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const v0, 0x41135c29    # 9.21f

    .line 537
    .line 538
    .line 539
    const v2, 0x411a3d71    # 9.64f

    .line 540
    .line 541
    .line 542
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const v0, 0x41a2a3d7    # 20.33f

    .line 549
    .line 550
    .line 551
    const v2, 0x415e8f5c    # 13.91f

    .line 552
    .line 553
    .line 554
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const v0, 0x3f6147ae    # 0.88f

    .line 558
    .line 559
    .line 560
    const v2, -0x40ab851f    # -0.83f

    .line 561
    .line 562
    .line 563
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const v17, 0x3f4a3d71    # 0.79f

    .line 567
    .line 568
    .line 569
    const v18, -0x40170a3d    # -1.82f

    .line 570
    .line 571
    .line 572
    const/high16 v13, 0x3f000000    # 0.5f

    .line 573
    .line 574
    const v14, -0x410f5c29    # -0.47f

    .line 575
    .line 576
    .line 577
    const v15, 0x3f4a3d71    # 0.79f

    .line 578
    .line 579
    .line 580
    const v16, -0x406f5c29    # -1.13f

    .line 581
    .line 582
    .line 583
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const v0, 0x4068f5c3    # 3.64f

    .line 587
    .line 588
    .line 589
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const v17, -0x4175c28f    # -0.27f

    .line 593
    .line 594
    .line 595
    const v18, -0x413851ec    # -0.39f

    .line 596
    .line 597
    .line 598
    const/4 v13, 0x0

    .line 599
    const v14, -0x41d1eb85    # -0.17f

    .line 600
    .line 601
    .line 602
    const v15, -0x421eb852    # -0.11f

    .line 603
    .line 604
    .line 605
    const v16, -0x41570a3d    # -0.33f

    .line 606
    .line 607
    .line 608
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const/4 v0, 0x0

    .line 612
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const v17, -0x400a3d71    # -1.92f

    .line 616
    .line 617
    .line 618
    const v18, 0x3f666666    # 0.9f

    .line 619
    .line 620
    .line 621
    const v13, -0x40b851ec    # -0.78f

    .line 622
    .line 623
    .line 624
    const v14, -0x4170a3d7    # -0.28f

    .line 625
    .line 626
    .line 627
    const v15, -0x402e147b    # -1.64f

    .line 628
    .line 629
    .line 630
    const v16, 0x3df5c28f    # 0.12f

    .line 631
    .line 632
    .line 633
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const v0, 0x4198cccd    # 19.1f

    .line 637
    .line 638
    .line 639
    const v2, 0x40c3851f    # 6.11f

    .line 640
    .line 641
    .line 642
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    const/high16 v0, -0x3f500000    # -5.5f

    .line 646
    .line 647
    const v2, -0x3f466666    # -5.8f

    .line 648
    .line 649
    .line 650
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const v17, -0x404b851f    # -1.41f

    .line 654
    .line 655
    .line 656
    const v18, -0x42dc28f6    # -0.04f

    .line 657
    .line 658
    .line 659
    const v13, -0x413d70a4    # -0.38f

    .line 660
    .line 661
    .line 662
    const v14, -0x41333333    # -0.4f

    .line 663
    .line 664
    .line 665
    const v15, -0x407eb852    # -1.01f

    .line 666
    .line 667
    .line 668
    const v16, -0x4128f5c3    # -0.42f

    .line 669
    .line 670
    .line 671
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    const v17, -0x42dc28f6    # -0.04f

    .line 675
    .line 676
    .line 677
    const v18, 0x3fb47ae1    # 1.41f

    .line 678
    .line 679
    .line 680
    const v13, -0x41333333    # -0.4f

    .line 681
    .line 682
    .line 683
    const v14, 0x3ec28f5c    # 0.38f

    .line 684
    .line 685
    .line 686
    const v15, -0x4128f5c3    # -0.42f

    .line 687
    .line 688
    .line 689
    const v16, 0x3f8147ae    # 1.01f

    .line 690
    .line 691
    .line 692
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const v0, 0x40728f5c    # 3.79f

    .line 696
    .line 697
    .line 698
    const v2, 0x407f5c29    # 3.99f

    .line 699
    .line 700
    .line 701
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 702
    .line 703
    .line 704
    const v0, -0x40c51eb8    # -0.73f

    .line 705
    .line 706
    .line 707
    const v2, 0x3f30a3d7    # 0.69f

    .line 708
    .line 709
    .line 710
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 711
    .line 712
    .line 713
    const v0, -0x3f65c28f    # -4.82f

    .line 714
    .line 715
    .line 716
    const v2, -0x3f5d70a4    # -5.08f

    .line 717
    .line 718
    .line 719
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    const v17, -0x404b851f    # -1.41f

    .line 723
    .line 724
    .line 725
    const v18, -0x42dc28f6    # -0.04f

    .line 726
    .line 727
    .line 728
    const v13, -0x413d70a4    # -0.38f

    .line 729
    .line 730
    .line 731
    const v14, -0x41333333    # -0.4f

    .line 732
    .line 733
    .line 734
    const v15, -0x407eb852    # -1.01f

    .line 735
    .line 736
    .line 737
    const v16, -0x4128f5c3    # -0.42f

    .line 738
    .line 739
    .line 740
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 741
    .line 742
    .line 743
    const v17, -0x42dc28f6    # -0.04f

    .line 744
    .line 745
    .line 746
    const v18, 0x3fb47ae1    # 1.41f

    .line 747
    .line 748
    .line 749
    const v13, -0x41333333    # -0.4f

    .line 750
    .line 751
    .line 752
    const v14, 0x3ec28f5c    # 0.38f

    .line 753
    .line 754
    .line 755
    const v15, -0x4128f5c3    # -0.42f

    .line 756
    .line 757
    .line 758
    const v16, 0x3f8147ae    # 1.01f

    .line 759
    .line 760
    .line 761
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 762
    .line 763
    .line 764
    const v0, 0x4071eb85    # 3.78f

    .line 765
    .line 766
    .line 767
    const v2, 0x407eb852    # 3.98f

    .line 768
    .line 769
    .line 770
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 771
    .line 772
    .line 773
    const v0, 0x4176147b    # 15.38f

    .line 774
    .line 775
    .line 776
    const/high16 v2, 0x41100000    # 9.0f

    .line 777
    .line 778
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 779
    .line 780
    .line 781
    const v0, 0x40670a3d    # 3.61f

    .line 782
    .line 783
    .line 784
    const v2, 0x405b851f    # 3.43f

    .line 785
    .line 786
    .line 787
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 788
    .line 789
    .line 790
    const v0, 0x3f1c28f6    # 0.61f

    .line 791
    .line 792
    .line 793
    const v2, 0x3f147ae1    # 0.58f

    .line 794
    .line 795
    .line 796
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 797
    .line 798
    .line 799
    const v17, 0x41a2a3d7    # 20.33f

    .line 800
    .line 801
    .line 802
    const v18, 0x415e8f5c    # 13.91f

    .line 803
    .line 804
    .line 805
    const v13, 0x419f1eb8    # 19.89f

    .line 806
    .line 807
    .line 808
    const v14, 0x41547ae1    # 13.28f

    .line 809
    .line 810
    .line 811
    const v15, 0x41a10a3d    # 20.13f

    .line 812
    .line 813
    .line 814
    const v16, 0x415947ae    # 13.58f

    .line 815
    .line 816
    .line 817
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 818
    .line 819
    .line 820
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 821
    .line 822
    .line 823
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 824
    .line 825
    .line 826
    move-result-object v2

    .line 827
    const/16 v16, 0x3800

    .line 828
    .line 829
    const/16 v17, 0x0

    .line 830
    .line 831
    const/high16 v6, 0x3f800000    # 1.0f

    .line 832
    .line 833
    const/high16 v8, 0x3f800000    # 1.0f

    .line 834
    .line 835
    const/4 v7, 0x0

    .line 836
    const/high16 v9, 0x3f800000    # 1.0f

    .line 837
    .line 838
    const/high16 v12, 0x3f800000    # 1.0f

    .line 839
    .line 840
    const/4 v13, 0x0

    .line 841
    const/4 v14, 0x0

    .line 842
    const/4 v15, 0x0

    .line 843
    const-string v4, ""

    .line 844
    .line 845
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 846
    .line 847
    .line 848
    move-result-object v0

    .line 849
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 850
    .line 851
    .line 852
    move-result-object v0

    .line 853
    sput-object v0, Landroidx/compose/material/icons/rounded/SignLanguageKt;->_signLanguage:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 854
    .line 855
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 856
    .line 857
    .line 858
    return-object v0
.end method
