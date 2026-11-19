.class public final Landroidx/compose/material/icons/outlined/SoupKitchenKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_soupKitchen",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SoupKitchen",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getSoupKitchen",
        "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nSoupKitchen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SoupKitchen.kt\nandroidx/compose/material/icons/outlined/SoupKitchenKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,88:1\n212#2,12:89\n233#2,18:102\n253#2:139\n174#3:101\n705#4,2:120\n717#4,2:122\n719#4,11:128\n72#5,4:124\n*S KotlinDebug\n*F\n+ 1 SoupKitchen.kt\nandroidx/compose/material/icons/outlined/SoupKitchenKt\n*L\n29#1:89,12\n30#1:102,18\n30#1:139\n29#1:101\n30#1:120,2\n30#1:122,2\n30#1:128,11\n30#1:124,4\n*E\n"
    }
.end annotation


# static fields
.field private static _soupKitchen:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSoupKitchen(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/SoupKitchenKt;->_soupKitchen:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.SoupKitchen"

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
    const v0, 0x40cccccd    # 6.4f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x40e00000    # 7.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v17, 0x40c00000    # 6.0f

    .line 79
    .line 80
    const v18, 0x4106147b    # 8.38f

    .line 81
    .line 82
    .line 83
    const v13, 0x40c1eb85    # 6.06f

    .line 84
    .line 85
    .line 86
    const v14, 0x40f1999a    # 7.55f

    .line 87
    .line 88
    .line 89
    const/high16 v15, 0x40c00000    # 6.0f

    .line 90
    .line 91
    const v16, 0x40ff0a3d    # 7.97f

    .line 92
    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v17, 0x40e00000    # 7.0f

    .line 98
    .line 99
    const/high16 v18, 0x41400000    # 12.0f

    .line 100
    .line 101
    const/high16 v13, 0x40c00000    # 6.0f

    .line 102
    .line 103
    const v14, 0x41126666    # 9.15f

    .line 104
    .line 105
    .line 106
    const/high16 v15, 0x40e00000    # 7.0f

    .line 107
    .line 108
    const/high16 v16, 0x41300000    # 11.0f

    .line 109
    .line 110
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const v17, -0x41333333    # -0.4f

    .line 114
    .line 115
    .line 116
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 117
    .line 118
    const/4 v13, 0x0

    .line 119
    const v14, 0x3f733333    # 0.95f

    .line 120
    .line 121
    .line 122
    const v15, -0x41333333    # -0.4f

    .line 123
    .line 124
    .line 125
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 126
    .line 127
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v0, 0x40a33333    # 5.1f

    .line 131
    .line 132
    .line 133
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v17, 0x3ecccccd    # 0.4f

    .line 137
    .line 138
    .line 139
    const/high16 v18, -0x40400000    # -1.5f

    .line 140
    .line 141
    const/4 v14, 0x0

    .line 142
    const v15, 0x3ecccccd    # 0.4f

    .line 143
    .line 144
    .line 145
    const v16, -0x40f33333    # -0.55f

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v17, -0x40800000    # -1.0f

    .line 152
    .line 153
    const v18, -0x3f9851ec    # -3.62f

    .line 154
    .line 155
    .line 156
    const/high16 v14, -0x40800000    # -1.0f

    .line 157
    .line 158
    const/high16 v15, -0x40800000    # -1.0f

    .line 159
    .line 160
    const v16, -0x3fc9999a    # -2.85f

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v17, 0x409ccccd    # 4.9f

    .line 167
    .line 168
    .line 169
    const/high16 v18, 0x40e00000    # 7.0f

    .line 170
    .line 171
    const/high16 v13, 0x40900000    # 4.5f

    .line 172
    .line 173
    const v14, 0x40ff0a3d    # 7.97f

    .line 174
    .line 175
    .line 176
    const v15, 0x4091eb85    # 4.56f

    .line 177
    .line 178
    .line 179
    const v16, 0x40f1999a    # 7.55f

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const v0, 0x40cccccd    # 6.4f

    .line 186
    .line 187
    .line 188
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v0, 0x41366666    # 11.4f

    .line 195
    .line 196
    .line 197
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v17, 0x41300000    # 11.0f

    .line 201
    .line 202
    const v18, 0x4106147b    # 8.38f

    .line 203
    .line 204
    .line 205
    const v13, 0x4130f5c3    # 11.06f

    .line 206
    .line 207
    .line 208
    const v14, 0x40f1999a    # 7.55f

    .line 209
    .line 210
    .line 211
    const/high16 v15, 0x41300000    # 11.0f

    .line 212
    .line 213
    const v16, 0x40ff0a3d    # 7.97f

    .line 214
    .line 215
    .line 216
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const/high16 v17, 0x41400000    # 12.0f

    .line 220
    .line 221
    const/high16 v18, 0x41400000    # 12.0f

    .line 222
    .line 223
    const/high16 v13, 0x41300000    # 11.0f

    .line 224
    .line 225
    const v14, 0x41126666    # 9.15f

    .line 226
    .line 227
    .line 228
    const/high16 v15, 0x41400000    # 12.0f

    .line 229
    .line 230
    const/high16 v16, 0x41300000    # 11.0f

    .line 231
    .line 232
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v17, -0x41333333    # -0.4f

    .line 236
    .line 237
    .line 238
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 239
    .line 240
    const/4 v13, 0x0

    .line 241
    const v14, 0x3f733333    # 0.95f

    .line 242
    .line 243
    .line 244
    const v15, -0x41333333    # -0.4f

    .line 245
    .line 246
    .line 247
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 248
    .line 249
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 253
    .line 254
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v17, 0x3ecccccd    # 0.4f

    .line 258
    .line 259
    .line 260
    const/high16 v18, -0x40400000    # -1.5f

    .line 261
    .line 262
    const/4 v14, 0x0

    .line 263
    const v15, 0x3ecccccd    # 0.4f

    .line 264
    .line 265
    .line 266
    const v16, -0x40f33333    # -0.55f

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v17, -0x40800000    # -1.0f

    .line 273
    .line 274
    const v18, -0x3f9851ec    # -3.62f

    .line 275
    .line 276
    .line 277
    const/high16 v14, -0x40800000    # -1.0f

    .line 278
    .line 279
    const/high16 v15, -0x40800000    # -1.0f

    .line 280
    .line 281
    const v16, -0x3fc9999a    # -2.85f

    .line 282
    .line 283
    .line 284
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const v17, 0x3ecccccd    # 0.4f

    .line 288
    .line 289
    .line 290
    const v18, -0x404f5c29    # -1.38f

    .line 291
    .line 292
    .line 293
    const v14, -0x412e147b    # -0.41f

    .line 294
    .line 295
    .line 296
    const v15, 0x3d75c28f    # 0.06f

    .line 297
    .line 298
    .line 299
    const v16, -0x40ab851f    # -0.83f

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v0, 0x41366666    # 11.4f

    .line 306
    .line 307
    .line 308
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v0, 0x41026666    # 8.15f

    .line 315
    .line 316
    .line 317
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v17, -0x41333333    # -0.4f

    .line 321
    .line 322
    .line 323
    const v18, 0x3fb0a3d7    # 1.38f

    .line 324
    .line 325
    .line 326
    const v13, -0x4151eb85    # -0.34f

    .line 327
    .line 328
    .line 329
    const v14, 0x3f0ccccd    # 0.55f

    .line 330
    .line 331
    .line 332
    const v15, -0x41333333    # -0.4f

    .line 333
    .line 334
    .line 335
    const v16, 0x3f7851ec    # 0.97f

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const/high16 v17, 0x3f800000    # 1.0f

    .line 342
    .line 343
    const v18, 0x4067ae14    # 3.62f

    .line 344
    .line 345
    .line 346
    const/4 v13, 0x0

    .line 347
    const v14, 0x3f451eb8    # 0.77f

    .line 348
    .line 349
    .line 350
    const/high16 v15, 0x3f800000    # 1.0f

    .line 351
    .line 352
    const v16, 0x402851ec    # 2.63f

    .line 353
    .line 354
    .line 355
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v17, -0x41333333    # -0.4f

    .line 359
    .line 360
    .line 361
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 362
    .line 363
    const v14, 0x3f733333    # 0.95f

    .line 364
    .line 365
    .line 366
    const v15, -0x41333333    # -0.4f

    .line 367
    .line 368
    .line 369
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 370
    .line 371
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 375
    .line 376
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v17, 0x3ecccccd    # 0.4f

    .line 380
    .line 381
    .line 382
    const/high16 v18, -0x40400000    # -1.5f

    .line 383
    .line 384
    const/4 v14, 0x0

    .line 385
    const v15, 0x3ecccccd    # 0.4f

    .line 386
    .line 387
    .line 388
    const v16, -0x40f33333    # -0.55f

    .line 389
    .line 390
    .line 391
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/high16 v17, -0x40800000    # -1.0f

    .line 395
    .line 396
    const v18, -0x3f9851ec    # -3.62f

    .line 397
    .line 398
    .line 399
    const/high16 v14, -0x40800000    # -1.0f

    .line 400
    .line 401
    const/high16 v15, -0x40800000    # -1.0f

    .line 402
    .line 403
    const v16, -0x3fc9999a    # -2.85f

    .line 404
    .line 405
    .line 406
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v17, 0x3ecccccd    # 0.4f

    .line 410
    .line 411
    .line 412
    const v18, -0x404f5c29    # -1.38f

    .line 413
    .line 414
    .line 415
    const v14, -0x412e147b    # -0.41f

    .line 416
    .line 417
    .line 418
    const v15, 0x3d75c28f    # 0.06f

    .line 419
    .line 420
    .line 421
    const v16, -0x40ab851f    # -0.83f

    .line 422
    .line 423
    .line 424
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v0, 0x41026666    # 8.15f

    .line 428
    .line 429
    .line 430
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v0, 0x4194cccd    # 18.6f

    .line 437
    .line 438
    .line 439
    const/high16 v2, 0x40000000    # 2.0f

    .line 440
    .line 441
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v17, -0x3fc147ae    # -2.98f

    .line 445
    .line 446
    .line 447
    const v18, 0x4029999a    # 2.65f

    .line 448
    .line 449
    .line 450
    const v13, -0x403ae148    # -1.54f

    .line 451
    .line 452
    .line 453
    const/4 v14, 0x0

    .line 454
    const v15, -0x3fcc28f6    # -2.81f

    .line 455
    .line 456
    .line 457
    const v16, 0x3f947ae1    # 1.16f

    .line 458
    .line 459
    .line 460
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const v0, 0x41687ae1    # 14.53f

    .line 464
    .line 465
    .line 466
    const/high16 v2, 0x41700000    # 15.0f

    .line 467
    .line 468
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v0, 0x408051ec    # 4.01f

    .line 472
    .line 473
    .line 474
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const/high16 v17, -0x40800000    # -1.0f

    .line 478
    .line 479
    const v18, 0x3f90a3d7    # 1.13f

    .line 480
    .line 481
    .line 482
    const v13, -0x40e66666    # -0.6f

    .line 483
    .line 484
    .line 485
    const v15, -0x40747ae1    # -1.09f

    .line 486
    .line 487
    .line 488
    const v16, 0x3f07ae14    # 0.53f

    .line 489
    .line 490
    .line 491
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const/high16 v17, 0x411c0000    # 9.75f

    .line 495
    .line 496
    const/high16 v18, 0x41b00000    # 22.0f

    .line 497
    .line 498
    const v13, 0x4061eb85    # 3.53f

    .line 499
    .line 500
    .line 501
    const v14, 0x419bae14    # 19.46f

    .line 502
    .line 503
    .line 504
    const v15, 0x40cc7ae1    # 6.39f

    .line 505
    .line 506
    .line 507
    const/high16 v16, 0x41b00000    # 22.0f

    .line 508
    .line 509
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const v17, 0x40d6b852    # 6.71f

    .line 513
    .line 514
    .line 515
    const v18, -0x3f38a3d7    # -6.23f

    .line 516
    .line 517
    .line 518
    const v13, 0x405eb852    # 3.48f

    .line 519
    .line 520
    .line 521
    const/4 v14, 0x0

    .line 522
    const v15, 0x40cae148    # 6.34f

    .line 523
    .line 524
    .line 525
    const v16, -0x3fd147ae    # -2.73f

    .line 526
    .line 527
    .line 528
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const v0, 0x3f933333    # 1.15f

    .line 532
    .line 533
    .line 534
    const v2, -0x3ed2147b    # -10.87f

    .line 535
    .line 536
    .line 537
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const v17, 0x4194cccd    # 18.6f

    .line 541
    .line 542
    .line 543
    const/high16 v18, 0x40800000    # 4.0f

    .line 544
    .line 545
    const v13, 0x418d47ae    # 17.66f

    .line 546
    .line 547
    .line 548
    const v14, 0x408c7ae1    # 4.39f

    .line 549
    .line 550
    .line 551
    const v15, 0x4190a3d7    # 18.08f

    .line 552
    .line 553
    .line 554
    const/high16 v16, 0x40800000    # 4.0f

    .line 555
    .line 556
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const/high16 v17, 0x3f800000    # 1.0f

    .line 560
    .line 561
    const/high16 v18, 0x3f800000    # 1.0f

    .line 562
    .line 563
    const v13, 0x3f0ccccd    # 0.55f

    .line 564
    .line 565
    .line 566
    const/4 v14, 0x0

    .line 567
    const/high16 v15, 0x3f800000    # 1.0f

    .line 568
    .line 569
    const v16, 0x3ee66666    # 0.45f

    .line 570
    .line 571
    .line 572
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const v17, -0x42333333    # -0.1f

    .line 576
    .line 577
    .line 578
    const/high16 v18, 0x3fa00000    # 1.25f

    .line 579
    .line 580
    const/4 v13, 0x0

    .line 581
    const v14, 0x3e99999a    # 0.3f

    .line 582
    .line 583
    .line 584
    const v15, -0x42333333    # -0.1f

    .line 585
    .line 586
    .line 587
    const/high16 v16, 0x3fa00000    # 1.25f

    .line 588
    .line 589
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const v0, 0x3ffc28f6    # 1.97f

    .line 593
    .line 594
    .line 595
    const/high16 v2, 0x3e800000    # 0.25f

    .line 596
    .line 597
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const v17, 0x3e051eb8    # 0.13f

    .line 601
    .line 602
    .line 603
    const/high16 v18, -0x40400000    # -1.5f

    .line 604
    .line 605
    const/4 v14, 0x0

    .line 606
    const v15, 0x3e051eb8    # 0.13f

    .line 607
    .line 608
    .line 609
    const v16, -0x407851ec    # -1.06f

    .line 610
    .line 611
    .line 612
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const v17, 0x4194cccd    # 18.6f

    .line 616
    .line 617
    .line 618
    const/high16 v18, 0x40000000    # 2.0f

    .line 619
    .line 620
    const v13, 0x41accccd    # 21.6f

    .line 621
    .line 622
    .line 623
    const v14, 0x40566666    # 3.35f

    .line 624
    .line 625
    .line 626
    const/high16 v15, 0x41a20000    # 20.25f

    .line 627
    .line 628
    const/high16 v16, 0x40000000    # 2.0f

    .line 629
    .line 630
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const/high16 v0, 0x411c0000    # 9.75f

    .line 637
    .line 638
    const/high16 v2, 0x41a00000    # 20.0f

    .line 639
    .line 640
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const v17, -0x3f723d71    # -4.43f

    .line 644
    .line 645
    .line 646
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 647
    .line 648
    const v13, -0x4007ae14    # -1.94f

    .line 649
    .line 650
    .line 651
    const/4 v14, 0x0

    .line 652
    const v15, -0x3f951eb8    # -3.67f

    .line 653
    .line 654
    .line 655
    const v16, -0x40628f5c    # -1.23f

    .line 656
    .line 657
    .line 658
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    const v0, 0x410c7ae1    # 8.78f

    .line 662
    .line 663
    .line 664
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    const v0, 0x3c23d70a    # 0.01f

    .line 668
    .line 669
    .line 670
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 671
    .line 672
    .line 673
    const/high16 v17, 0x411c0000    # 9.75f

    .line 674
    .line 675
    const/high16 v18, 0x41a00000    # 20.0f

    .line 676
    .line 677
    const v13, 0x41563d71    # 13.39f

    .line 678
    .line 679
    .line 680
    const v14, 0x41963d71    # 18.78f

    .line 681
    .line 682
    .line 683
    const v15, 0x413b0a3d    # 11.69f

    .line 684
    .line 685
    .line 686
    const/high16 v16, 0x41a00000    # 20.0f

    .line 687
    .line 688
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 692
    .line 693
    .line 694
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 695
    .line 696
    .line 697
    move-result-object v2

    .line 698
    const/16 v16, 0x3800

    .line 699
    .line 700
    const/16 v17, 0x0

    .line 701
    .line 702
    const/high16 v6, 0x3f800000    # 1.0f

    .line 703
    .line 704
    const/high16 v8, 0x3f800000    # 1.0f

    .line 705
    .line 706
    const/4 v7, 0x0

    .line 707
    const/high16 v9, 0x3f800000    # 1.0f

    .line 708
    .line 709
    const/high16 v12, 0x3f800000    # 1.0f

    .line 710
    .line 711
    const/4 v13, 0x0

    .line 712
    const/4 v14, 0x0

    .line 713
    const/4 v15, 0x0

    .line 714
    const-string v4, ""

    .line 715
    .line 716
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 717
    .line 718
    .line 719
    move-result-object v0

    .line 720
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 721
    .line 722
    .line 723
    move-result-object v0

    .line 724
    sput-object v0, Landroidx/compose/material/icons/outlined/SoupKitchenKt;->_soupKitchen:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 725
    .line 726
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 727
    .line 728
    .line 729
    return-object v0
.end method
