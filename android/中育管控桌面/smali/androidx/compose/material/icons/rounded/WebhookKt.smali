.class public final Landroidx/compose/material/icons/rounded/WebhookKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_webhook",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Webhook",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getWebhook",
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
        "SMAP\nWebhook.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Webhook.kt\nandroidx/compose/material/icons/rounded/WebhookKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,92:1\n212#2,12:93\n233#2,18:106\n253#2:143\n174#3:105\n705#4,2:124\n717#4,2:126\n719#4,11:132\n72#5,4:128\n*S KotlinDebug\n*F\n+ 1 Webhook.kt\nandroidx/compose/material/icons/rounded/WebhookKt\n*L\n29#1:93,12\n30#1:106,18\n30#1:143\n29#1:105\n30#1:124,2\n30#1:126,2\n30#1:132,11\n30#1:128,4\n*E\n"
    }
.end annotation


# static fields
.field private static _webhook:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWebhook(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/WebhookKt;->_webhook:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Webhook"

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
    const/high16 v0, 0x40000000    # 2.0f

    .line 71
    .line 72
    const/high16 v2, 0x41800000    # 16.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, 0x401eb852    # 2.48f

    .line 78
    .line 79
    .line 80
    const v18, -0x3f75c28f    # -4.32f

    .line 81
    .line 82
    .line 83
    const/4 v13, 0x0

    .line 84
    const v14, -0x40147ae1    # -1.84f

    .line 85
    .line 86
    .line 87
    const/high16 v15, 0x3f800000    # 1.0f

    .line 88
    .line 89
    const v16, -0x3fa33333    # -3.45f

    .line 90
    .line 91
    .line 92
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const/high16 v17, 0x40c00000    # 6.0f

    .line 96
    .line 97
    const v18, 0x4148a3d7    # 12.54f

    .line 98
    .line 99
    .line 100
    const v13, 0x40a4cccd    # 5.15f

    .line 101
    .line 102
    .line 103
    const v14, 0x4134a3d7    # 11.29f

    .line 104
    .line 105
    .line 106
    const/high16 v15, 0x40c00000    # 6.0f

    .line 107
    .line 108
    const v16, 0x413c28f6    # 11.76f

    .line 109
    .line 110
    .line 111
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/high16 v17, -0x41000000    # -0.5f

    .line 115
    .line 116
    const v18, 0x3f5c28f6    # 0.86f

    .line 117
    .line 118
    .line 119
    const/4 v13, 0x0

    .line 120
    const v14, 0x3eb851ec    # 0.36f

    .line 121
    .line 122
    .line 123
    const v15, -0x41bd70a4    # -0.19f

    .line 124
    .line 125
    .line 126
    const v16, 0x3f2e147b    # 0.68f

    .line 127
    .line 128
    .line 129
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/high16 v17, 0x40800000    # 4.0f

    .line 133
    .line 134
    const/high16 v18, 0x41800000    # 16.0f

    .line 135
    .line 136
    const v13, 0x40933333    # 4.6f

    .line 137
    .line 138
    .line 139
    const v14, 0x415eb852    # 13.92f

    .line 140
    .line 141
    .line 142
    const/high16 v15, 0x40800000    # 4.0f

    .line 143
    .line 144
    const v16, 0x416e3d71    # 14.89f

    .line 145
    .line 146
    .line 147
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v17, 0x40666666    # 3.6f

    .line 151
    .line 152
    .line 153
    const v18, 0x403c28f6    # 2.94f

    .line 154
    .line 155
    .line 156
    const/4 v13, 0x0

    .line 157
    const v14, 0x3feccccd    # 1.85f

    .line 158
    .line 159
    .line 160
    const v15, 0x3fd70a3d    # 1.68f

    .line 161
    .line 162
    .line 163
    const v16, 0x4053d70a    # 3.31f

    .line 164
    .line 165
    .line 166
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v17, 0x4019999a    # 2.4f

    .line 170
    .line 171
    .line 172
    const v18, -0x3fbc28f6    # -3.06f

    .line 173
    .line 174
    .line 175
    const v13, 0x3fb5c28f    # 1.42f

    .line 176
    .line 177
    .line 178
    const v14, -0x4170a3d7    # -0.28f

    .line 179
    .line 180
    .line 181
    const v15, 0x4019999a    # 2.4f

    .line 182
    .line 183
    .line 184
    const v16, -0x4031eb85    # -1.61f

    .line 185
    .line 186
    .line 187
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/4 v0, 0x0

    .line 191
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v17, 0x3f6147ae    # 0.88f

    .line 195
    .line 196
    .line 197
    const v18, -0x409eb852    # -0.88f

    .line 198
    .line 199
    .line 200
    const/4 v13, 0x0

    .line 201
    const v14, -0x41051eb8    # -0.49f

    .line 202
    .line 203
    .line 204
    const v15, 0x3ec7ae14    # 0.39f

    .line 205
    .line 206
    .line 207
    const v16, -0x409eb852    # -0.88f

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v0, 0x40a00000    # 5.0f

    .line 214
    .line 215
    const/4 v2, 0x0

    .line 216
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v17, 0x3f8f5c29    # 1.12f

    .line 220
    .line 221
    .line 222
    const/high16 v18, -0x41000000    # -0.5f

    .line 223
    .line 224
    const v13, 0x3e8a3d71    # 0.27f

    .line 225
    .line 226
    .line 227
    const v14, -0x416147ae    # -0.31f

    .line 228
    .line 229
    .line 230
    const v15, 0x3f2b851f    # 0.67f

    .line 231
    .line 232
    .line 233
    const/high16 v16, -0x41000000    # -0.5f

    .line 234
    .line 235
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 239
    .line 240
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 241
    .line 242
    const v13, 0x3f547ae1    # 0.83f

    .line 243
    .line 244
    .line 245
    const/4 v14, 0x0

    .line 246
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 247
    .line 248
    const v16, 0x3f2b851f    # 0.67f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v17, -0x40400000    # -1.5f

    .line 255
    .line 256
    const/4 v13, 0x0

    .line 257
    const v14, 0x3f547ae1    # 0.83f

    .line 258
    .line 259
    .line 260
    const v15, -0x40d47ae1    # -0.67f

    .line 261
    .line 262
    .line 263
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 264
    .line 265
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v17, -0x4070a3d7    # -1.12f

    .line 269
    .line 270
    .line 271
    const/high16 v18, -0x41000000    # -0.5f

    .line 272
    .line 273
    const v13, -0x411eb852    # -0.44f

    .line 274
    .line 275
    .line 276
    const/4 v14, 0x0

    .line 277
    const v15, -0x40a8f5c3    # -0.84f

    .line 278
    .line 279
    .line 280
    const v16, -0x41bd70a4    # -0.19f

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v0, -0x3f8147ae    # -3.98f

    .line 287
    .line 288
    .line 289
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v17, -0x3f633333    # -4.9f

    .line 293
    .line 294
    .line 295
    const/high16 v18, 0x40800000    # 4.0f

    .line 296
    .line 297
    const v13, -0x41147ae1    # -0.46f

    .line 298
    .line 299
    .line 300
    const v14, 0x4011eb85    # 2.28f

    .line 301
    .line 302
    .line 303
    const v15, -0x3fe147ae    # -2.48f

    .line 304
    .line 305
    .line 306
    const/high16 v16, 0x40800000    # 4.0f

    .line 307
    .line 308
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const/high16 v17, 0x40000000    # 2.0f

    .line 312
    .line 313
    const/high16 v18, 0x41800000    # 16.0f

    .line 314
    .line 315
    const v13, 0x4087ae14    # 4.24f

    .line 316
    .line 317
    .line 318
    const/high16 v14, 0x41a80000    # 21.0f

    .line 319
    .line 320
    const/high16 v15, 0x40000000    # 2.0f

    .line 321
    .line 322
    const v16, 0x4196147b    # 18.76f

    .line 323
    .line 324
    .line 325
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v0, 0x4182f5c3    # 16.37f

    .line 332
    .line 333
    .line 334
    const/high16 v2, 0x40e00000    # 7.0f

    .line 335
    .line 336
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v17, 0x3f7851ec    # 0.97f

    .line 340
    .line 341
    .line 342
    const/high16 v18, -0x40600000    # -1.25f

    .line 343
    .line 344
    const v13, 0x3f266666    # 0.65f

    .line 345
    .line 346
    .line 347
    const/4 v14, 0x0

    .line 348
    const v15, 0x3f91eb85    # 1.14f

    .line 349
    .line 350
    .line 351
    const v16, -0x40e147ae    # -0.62f

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v17, 0x41480000    # 12.5f

    .line 358
    .line 359
    const/high16 v18, 0x40000000    # 2.0f

    .line 360
    .line 361
    const v13, 0x418651ec    # 16.79f

    .line 362
    .line 363
    .line 364
    const v14, 0x4065c28f    # 3.59f

    .line 365
    .line 366
    .line 367
    const v15, 0x416d47ae    # 14.83f

    .line 368
    .line 369
    .line 370
    const/high16 v16, 0x40000000    # 2.0f

    .line 371
    .line 372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v17, -0x3f600000    # -5.0f

    .line 376
    .line 377
    const/high16 v18, 0x40a00000    # 5.0f

    .line 378
    .line 379
    const v13, -0x3fcf5c29    # -2.76f

    .line 380
    .line 381
    .line 382
    const/4 v14, 0x0

    .line 383
    const/high16 v15, -0x3f600000    # -5.0f

    .line 384
    .line 385
    const v16, 0x400f5c29    # 2.24f

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v17, 0x3fc66666    # 1.55f

    .line 392
    .line 393
    .line 394
    const v18, 0x4067ae14    # 3.62f

    .line 395
    .line 396
    .line 397
    const/4 v13, 0x0

    .line 398
    const v14, 0x3fb70a3d    # 1.43f

    .line 399
    .line 400
    .line 401
    const v15, 0x3f19999a    # 0.6f

    .line 402
    .line 403
    .line 404
    const v16, 0x402d70a4    # 2.71f

    .line 405
    .line 406
    .line 407
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v0, -0x3fe9999a    # -2.35f

    .line 411
    .line 412
    .line 413
    const v2, 0x4079999a    # 3.9f

    .line 414
    .line 415
    .line 416
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const/high16 v17, 0x40b00000    # 5.5f

    .line 420
    .line 421
    const/high16 v18, 0x41800000    # 16.0f

    .line 422
    .line 423
    const v13, 0x40c0a3d7    # 6.02f

    .line 424
    .line 425
    .line 426
    const v14, 0x416a8f5c    # 14.66f

    .line 427
    .line 428
    .line 429
    const/high16 v15, 0x40b00000    # 5.5f

    .line 430
    .line 431
    const v16, 0x417451ec    # 15.27f

    .line 432
    .line 433
    .line 434
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 438
    .line 439
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 440
    .line 441
    const/4 v13, 0x0

    .line 442
    const v14, 0x3f547ae1    # 0.83f

    .line 443
    .line 444
    .line 445
    const v15, 0x3f2b851f    # 0.67f

    .line 446
    .line 447
    .line 448
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 449
    .line 450
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v0, -0x40d47ae1    # -0.67f

    .line 454
    .line 455
    .line 456
    const/high16 v2, -0x40400000    # -1.5f

    .line 457
    .line 458
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 459
    .line 460
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const v17, -0x4270a3d7    # -0.07f

    .line 464
    .line 465
    .line 466
    const v18, -0x4119999a    # -0.45f

    .line 467
    .line 468
    .line 469
    const v14, -0x41dc28f6    # -0.16f

    .line 470
    .line 471
    .line 472
    const v15, -0x435c28f6    # -0.02f

    .line 473
    .line 474
    .line 475
    const v16, -0x416147ae    # -0.31f

    .line 476
    .line 477
    .line 478
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const v0, 0x40370a3d    # 2.86f

    .line 482
    .line 483
    .line 484
    const/high16 v2, -0x3f680000    # -4.75f

    .line 485
    .line 486
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const v17, -0x4170a3d7    # -0.28f

    .line 490
    .line 491
    .line 492
    const v18, -0x4067ae14    # -1.19f

    .line 493
    .line 494
    .line 495
    const/high16 v13, 0x3e800000    # 0.25f

    .line 496
    .line 497
    const v14, -0x412e147b    # -0.41f

    .line 498
    .line 499
    .line 500
    const v15, 0x3e051eb8    # 0.13f

    .line 501
    .line 502
    .line 503
    const v16, -0x408ccccd    # -0.95f

    .line 504
    .line 505
    .line 506
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const/high16 v17, 0x41180000    # 9.5f

    .line 510
    .line 511
    const/high16 v18, 0x40e00000    # 7.0f

    .line 512
    .line 513
    const v13, 0x4121c28f    # 10.11f

    .line 514
    .line 515
    .line 516
    const v14, 0x411147ae    # 9.08f

    .line 517
    .line 518
    .line 519
    const/high16 v15, 0x41180000    # 9.5f

    .line 520
    .line 521
    const v16, 0x4101c28f    # 8.11f

    .line 522
    .line 523
    .line 524
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const/high16 v17, 0x40400000    # 3.0f

    .line 528
    .line 529
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 530
    .line 531
    const/4 v13, 0x0

    .line 532
    const v14, -0x402ccccd    # -1.65f

    .line 533
    .line 534
    .line 535
    const v15, 0x3faccccd    # 1.35f

    .line 536
    .line 537
    .line 538
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 539
    .line 540
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const v17, 0x4038f5c3    # 2.89f

    .line 544
    .line 545
    .line 546
    const v18, 0x400ccccd    # 2.2f

    .line 547
    .line 548
    .line 549
    const v13, 0x3fb0a3d7    # 1.38f

    .line 550
    .line 551
    .line 552
    const/4 v14, 0x0

    .line 553
    const v15, 0x40228f5c    # 2.54f

    .line 554
    .line 555
    .line 556
    const v16, 0x3f6e147b    # 0.93f

    .line 557
    .line 558
    .line 559
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const v17, 0x4182f5c3    # 16.37f

    .line 563
    .line 564
    .line 565
    const/high16 v18, 0x40e00000    # 7.0f

    .line 566
    .line 567
    const v13, 0x417851ec    # 15.52f

    .line 568
    .line 569
    .line 570
    const v14, 0x40d51eb8    # 6.66f

    .line 571
    .line 572
    .line 573
    const v15, 0x417e6666    # 15.9f

    .line 574
    .line 575
    .line 576
    const/high16 v16, 0x40e00000    # 7.0f

    .line 577
    .line 578
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const/high16 v0, 0x41880000    # 17.0f

    .line 585
    .line 586
    const/high16 v2, 0x41500000    # 13.0f

    .line 587
    .line 588
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const v17, -0x40747ae1    # -1.09f

    .line 592
    .line 593
    .line 594
    const v18, 0x3e4ccccd    # 0.2f

    .line 595
    .line 596
    .line 597
    const v13, -0x413d70a4    # -0.38f

    .line 598
    .line 599
    .line 600
    const/4 v14, 0x0

    .line 601
    const/high16 v15, -0x40c00000    # -0.75f

    .line 602
    .line 603
    const v16, 0x3d8f5c29    # 0.07f

    .line 604
    .line 605
    .line 606
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const v17, -0x4075c28f    # -1.08f

    .line 610
    .line 611
    .line 612
    const v18, -0x412e147b    # -0.41f

    .line 613
    .line 614
    .line 615
    const v13, -0x41333333    # -0.4f

    .line 616
    .line 617
    .line 618
    const v14, 0x3e23d70a    # 0.16f

    .line 619
    .line 620
    .line 621
    const v15, -0x40a3d70a    # -0.86f

    .line 622
    .line 623
    .line 624
    const v16, -0x42dc28f6    # -0.04f

    .line 625
    .line 626
    .line 627
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    const v0, -0x3fd9999a    # -2.6f

    .line 631
    .line 632
    .line 633
    const v2, -0x3f75c28f    # -4.32f

    .line 634
    .line 635
    .line 636
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const/high16 v17, 0x41300000    # 11.0f

    .line 640
    .line 641
    const/high16 v18, 0x40e00000    # 7.0f

    .line 642
    .line 643
    const v13, 0x41387ae1    # 11.53f

    .line 644
    .line 645
    .line 646
    const v14, 0x4105999a    # 8.35f

    .line 647
    .line 648
    .line 649
    const/high16 v15, 0x41300000    # 11.0f

    .line 650
    .line 651
    const v16, 0x40f7ae14    # 7.74f

    .line 652
    .line 653
    .line 654
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 658
    .line 659
    const/high16 v18, -0x40400000    # -1.5f

    .line 660
    .line 661
    const/4 v13, 0x0

    .line 662
    const v14, -0x40ab851f    # -0.83f

    .line 663
    .line 664
    .line 665
    const v15, 0x3f2b851f    # 0.67f

    .line 666
    .line 667
    .line 668
    const/high16 v16, -0x40400000    # -1.5f

    .line 669
    .line 670
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 671
    .line 672
    .line 673
    const v0, 0x40c570a4    # 6.17f

    .line 674
    .line 675
    .line 676
    const/high16 v2, 0x41600000    # 14.0f

    .line 677
    .line 678
    const/high16 v4, 0x40e00000    # 7.0f

    .line 679
    .line 680
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 681
    .line 682
    .line 683
    const v17, -0x428a3d71    # -0.06f

    .line 684
    .line 685
    .line 686
    const v18, 0x3edc28f6    # 0.43f

    .line 687
    .line 688
    .line 689
    const v14, 0x3e19999a    # 0.15f

    .line 690
    .line 691
    .line 692
    const v15, -0x435c28f6    # -0.02f

    .line 693
    .line 694
    .line 695
    const v16, 0x3e947ae1    # 0.29f

    .line 696
    .line 697
    .line 698
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    const v0, 0x400c28f6    # 2.19f

    .line 702
    .line 703
    .line 704
    const v2, 0x4069999a    # 3.65f

    .line 705
    .line 706
    .line 707
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    const/high16 v17, 0x41880000    # 17.0f

    .line 711
    .line 712
    const/high16 v18, 0x41300000    # 11.0f

    .line 713
    .line 714
    const v13, 0x418347ae    # 16.41f

    .line 715
    .line 716
    .line 717
    const v14, 0x41307ae1    # 11.03f

    .line 718
    .line 719
    .line 720
    const v15, 0x4185999a    # 16.7f

    .line 721
    .line 722
    .line 723
    const/high16 v16, 0x41300000    # 11.0f

    .line 724
    .line 725
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 726
    .line 727
    .line 728
    const/4 v0, 0x0

    .line 729
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    const/high16 v17, 0x40a00000    # 5.0f

    .line 733
    .line 734
    const/high16 v18, 0x40a00000    # 5.0f

    .line 735
    .line 736
    const v13, 0x4030a3d7    # 2.76f

    .line 737
    .line 738
    .line 739
    const/4 v14, 0x0

    .line 740
    const/high16 v15, 0x40a00000    # 5.0f

    .line 741
    .line 742
    const v16, 0x400f5c29    # 2.24f

    .line 743
    .line 744
    .line 745
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 746
    .line 747
    .line 748
    const/high16 v17, -0x3f600000    # -5.0f

    .line 749
    .line 750
    const/4 v13, 0x0

    .line 751
    const v14, 0x4030a3d7    # 2.76f

    .line 752
    .line 753
    .line 754
    const v15, -0x3ff0a3d7    # -2.24f

    .line 755
    .line 756
    .line 757
    const/high16 v16, 0x40a00000    # 5.0f

    .line 758
    .line 759
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 760
    .line 761
    .line 762
    const v17, -0x3fe70a3d    # -2.39f

    .line 763
    .line 764
    .line 765
    const v18, -0x40e3d70a    # -0.61f

    .line 766
    .line 767
    .line 768
    const v13, -0x40a3d70a    # -0.86f

    .line 769
    .line 770
    .line 771
    const/4 v14, 0x0

    .line 772
    const v15, -0x4028f5c3    # -1.68f

    .line 773
    .line 774
    .line 775
    const v16, -0x419eb852    # -0.22f

    .line 776
    .line 777
    .line 778
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 779
    .line 780
    .line 781
    const v17, 0x3ef0a3d7    # 0.47f

    .line 782
    .line 783
    .line 784
    const v18, -0x400e147b    # -1.89f

    .line 785
    .line 786
    .line 787
    const v13, -0x40947ae1    # -0.92f

    .line 788
    .line 789
    .line 790
    const/high16 v14, -0x41000000    # -0.5f

    .line 791
    .line 792
    const v15, -0x40eb851f    # -0.58f

    .line 793
    .line 794
    .line 795
    const v16, -0x400e147b    # -1.89f

    .line 796
    .line 797
    .line 798
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 799
    .line 800
    .line 801
    const v17, 0x3efae148    # 0.49f

    .line 802
    .line 803
    .line 804
    const v18, 0x3e0f5c29    # 0.14f

    .line 805
    .line 806
    .line 807
    const v13, 0x3e2e147b    # 0.17f

    .line 808
    .line 809
    .line 810
    const/4 v14, 0x0

    .line 811
    const v15, 0x3eae147b    # 0.34f

    .line 812
    .line 813
    .line 814
    const v16, 0x3d4ccccd    # 0.05f

    .line 815
    .line 816
    .line 817
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 818
    .line 819
    .line 820
    const/high16 v17, 0x41880000    # 17.0f

    .line 821
    .line 822
    const/high16 v18, 0x41980000    # 19.0f

    .line 823
    .line 824
    const v13, 0x417fd70a    # 15.99f

    .line 825
    .line 826
    .line 827
    const v14, 0x4196f5c3    # 18.87f

    .line 828
    .line 829
    .line 830
    const v15, 0x4183d70a    # 16.48f

    .line 831
    .line 832
    .line 833
    const/high16 v16, 0x41980000    # 19.0f

    .line 834
    .line 835
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 836
    .line 837
    .line 838
    const/high16 v17, 0x40400000    # 3.0f

    .line 839
    .line 840
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 841
    .line 842
    const v13, 0x3fd33333    # 1.65f

    .line 843
    .line 844
    .line 845
    const/4 v14, 0x0

    .line 846
    const/high16 v15, 0x40400000    # 3.0f

    .line 847
    .line 848
    const v16, -0x40533333    # -1.35f

    .line 849
    .line 850
    .line 851
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 852
    .line 853
    .line 854
    const v0, 0x41953333    # 18.65f

    .line 855
    .line 856
    .line 857
    const/high16 v2, 0x41880000    # 17.0f

    .line 858
    .line 859
    const/high16 v4, 0x41500000    # 13.0f

    .line 860
    .line 861
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 862
    .line 863
    .line 864
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 865
    .line 866
    .line 867
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 868
    .line 869
    .line 870
    move-result-object v2

    .line 871
    const/16 v16, 0x3800

    .line 872
    .line 873
    const/16 v17, 0x0

    .line 874
    .line 875
    const/high16 v6, 0x3f800000    # 1.0f

    .line 876
    .line 877
    const/high16 v8, 0x3f800000    # 1.0f

    .line 878
    .line 879
    const/4 v7, 0x0

    .line 880
    const/high16 v9, 0x3f800000    # 1.0f

    .line 881
    .line 882
    const/high16 v12, 0x3f800000    # 1.0f

    .line 883
    .line 884
    const/4 v13, 0x0

    .line 885
    const/4 v15, 0x0

    .line 886
    const-string v4, ""

    .line 887
    .line 888
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 889
    .line 890
    .line 891
    move-result-object v0

    .line 892
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 893
    .line 894
    .line 895
    move-result-object v0

    .line 896
    sput-object v0, Landroidx/compose/material/icons/rounded/WebhookKt;->_webhook:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 897
    .line 898
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 899
    .line 900
    .line 901
    return-object v0
.end method
