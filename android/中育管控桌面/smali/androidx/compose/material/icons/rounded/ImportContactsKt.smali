.class public final Landroidx/compose/material/icons/rounded/ImportContactsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_importContacts",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "ImportContacts",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getImportContacts",
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
        "SMAP\nImportContacts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImportContacts.kt\nandroidx/compose/material/icons/rounded/ImportContactsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,64:1\n212#2,12:65\n233#2,18:78\n253#2:115\n174#3:77\n705#4,2:96\n717#4,2:98\n719#4,11:104\n72#5,4:100\n*S KotlinDebug\n*F\n+ 1 ImportContacts.kt\nandroidx/compose/material/icons/rounded/ImportContactsKt\n*L\n29#1:65,12\n30#1:78,18\n30#1:115\n29#1:77\n30#1:96,2\n30#1:98,2\n30#1:104,11\n30#1:100,4\n*E\n"
    }
.end annotation


# static fields
.field private static _importContacts:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getImportContacts(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ImportContactsKt;->_importContacts:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.ImportContacts"

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
    const/high16 v0, 0x418c0000    # 17.5f

    .line 71
    .line 72
    const/high16 v2, 0x40900000    # 4.5f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x3f500000    # -5.5f

    .line 78
    .line 79
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 80
    .line 81
    const v13, -0x40066666    # -1.95f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const v15, -0x3f7e6666    # -4.05f

    .line 86
    .line 87
    .line 88
    const v16, 0x3ecccccd    # 0.4f

    .line 89
    .line 90
    .line 91
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const/high16 v18, -0x40400000    # -1.5f

    .line 95
    .line 96
    const v13, -0x40466666    # -1.45f

    .line 97
    .line 98
    .line 99
    const v14, -0x40733333    # -1.1f

    .line 100
    .line 101
    .line 102
    const v15, -0x3f9ccccd    # -3.55f

    .line 103
    .line 104
    .line 105
    const/high16 v16, -0x40400000    # -1.5f

    .line 106
    .line 107
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const v17, -0x3f770a3d    # -4.28f

    .line 111
    .line 112
    .line 113
    const v18, 0x3f4a3d71    # 0.79f

    .line 114
    .line 115
    .line 116
    const/4 v14, 0x0

    .line 117
    const v15, -0x3fc0a3d7    # -2.99f

    .line 118
    .line 119
    .line 120
    const v16, 0x3e6147ae    # 0.22f

    .line 121
    .line 122
    .line 123
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v17, 0x3f800000    # 1.0f

    .line 127
    .line 128
    const v18, 0x40e47ae1    # 7.14f

    .line 129
    .line 130
    .line 131
    const v13, 0x3fbeb852    # 1.49f

    .line 132
    .line 133
    .line 134
    const v14, 0x40b3d70a    # 5.62f

    .line 135
    .line 136
    .line 137
    const/high16 v15, 0x3f800000    # 1.0f

    .line 138
    .line 139
    const v16, 0x40ca8f5c    # 6.33f

    .line 140
    .line 141
    .line 142
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v0, 0x41347ae1    # 11.28f

    .line 146
    .line 147
    .line 148
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v17, 0x401eb852    # 2.48f

    .line 152
    .line 153
    .line 154
    const v18, 0x3ff851ec    # 1.94f

    .line 155
    .line 156
    .line 157
    const/4 v13, 0x0

    .line 158
    const v14, 0x3fa66666    # 1.3f

    .line 159
    .line 160
    .line 161
    const v15, 0x3f9c28f6    # 1.22f

    .line 162
    .line 163
    .line 164
    const v16, 0x4010a3d7    # 2.26f

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v17, 0x404147ae    # 3.02f

    .line 171
    .line 172
    .line 173
    const v18, -0x4147ae14    # -0.36f

    .line 174
    .line 175
    .line 176
    const v13, 0x3f7ae148    # 0.98f

    .line 177
    .line 178
    .line 179
    const/high16 v14, -0x41800000    # -0.25f

    .line 180
    .line 181
    const v15, 0x400147ae    # 2.02f

    .line 182
    .line 183
    .line 184
    const v16, -0x4147ae14    # -0.36f

    .line 185
    .line 186
    .line 187
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v17, 0x4091eb85    # 4.56f

    .line 191
    .line 192
    .line 193
    const v18, 0x3f6b851f    # 0.92f

    .line 194
    .line 195
    .line 196
    const v13, 0x3fc7ae14    # 1.56f

    .line 197
    .line 198
    .line 199
    const/4 v14, 0x0

    .line 200
    const v15, 0x404e147b    # 3.22f

    .line 201
    .line 202
    .line 203
    const v16, 0x3e851eb8    # 0.26f

    .line 204
    .line 205
    .line 206
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v17, 0x3fef5c29    # 1.87f

    .line 210
    .line 211
    .line 212
    const/16 v18, 0x0

    .line 213
    .line 214
    const v13, 0x3f19999a    # 0.6f

    .line 215
    .line 216
    .line 217
    const v14, 0x3e99999a    # 0.3f

    .line 218
    .line 219
    .line 220
    const v15, 0x3fa3d70a    # 1.28f

    .line 221
    .line 222
    .line 223
    const v16, 0x3e99999a    # 0.3f

    .line 224
    .line 225
    .line 226
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v17, 0x4091eb85    # 4.56f

    .line 230
    .line 231
    .line 232
    const v18, -0x40947ae1    # -0.92f

    .line 233
    .line 234
    .line 235
    const v13, 0x3fab851f    # 1.34f

    .line 236
    .line 237
    .line 238
    const v14, -0x40d47ae1    # -0.67f

    .line 239
    .line 240
    .line 241
    const/high16 v15, 0x40400000    # 3.0f

    .line 242
    .line 243
    const v16, -0x40947ae1    # -0.92f

    .line 244
    .line 245
    .line 246
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v17, 0x404147ae    # 3.02f

    .line 250
    .line 251
    .line 252
    const v18, 0x3eb851ec    # 0.36f

    .line 253
    .line 254
    .line 255
    const/high16 v13, 0x3f800000    # 1.0f

    .line 256
    .line 257
    const/4 v14, 0x0

    .line 258
    const v15, 0x40028f5c    # 2.04f

    .line 259
    .line 260
    .line 261
    const v16, 0x3de147ae    # 0.11f

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v17, 0x401eb852    # 2.48f

    .line 268
    .line 269
    .line 270
    const v18, -0x4007ae14    # -1.94f

    .line 271
    .line 272
    .line 273
    const v13, 0x3fa147ae    # 1.26f

    .line 274
    .line 275
    .line 276
    const v14, 0x3ea8f5c3    # 0.33f

    .line 277
    .line 278
    .line 279
    const v15, 0x401eb852    # 2.48f

    .line 280
    .line 281
    .line 282
    const v16, -0x40deb852    # -0.63f

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v0, 0x40e47ae1    # 7.14f

    .line 289
    .line 290
    .line 291
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v17, -0x4063d70a    # -1.22f

    .line 295
    .line 296
    .line 297
    const v18, -0x40133333    # -1.85f

    .line 298
    .line 299
    .line 300
    const/4 v13, 0x0

    .line 301
    const v14, -0x40b0a3d7    # -0.81f

    .line 302
    .line 303
    .line 304
    const v15, -0x41051eb8    # -0.49f

    .line 305
    .line 306
    .line 307
    const v16, -0x403d70a4    # -1.52f

    .line 308
    .line 309
    .line 310
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v17, -0x3f775c29    # -4.27f

    .line 314
    .line 315
    .line 316
    const v18, -0x40b5c28f    # -0.79f

    .line 317
    .line 318
    .line 319
    const v13, -0x405c28f6    # -1.28f

    .line 320
    .line 321
    .line 322
    const v14, -0x40ee147b    # -0.57f

    .line 323
    .line 324
    .line 325
    const v15, -0x3fcb851f    # -2.82f

    .line 326
    .line 327
    .line 328
    const v16, -0x40b5c28f    # -0.79f

    .line 329
    .line 330
    .line 331
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/high16 v0, 0x41a80000    # 21.0f

    .line 338
    .line 339
    const v2, 0x4189d70a    # 17.23f

    .line 340
    .line 341
    .line 342
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const v17, -0x40666666    # -1.2f

    .line 346
    .line 347
    .line 348
    const v18, 0x3f7ae148    # 0.98f

    .line 349
    .line 350
    .line 351
    const/4 v13, 0x0

    .line 352
    const v14, 0x3f2147ae    # 0.63f

    .line 353
    .line 354
    .line 355
    const v15, -0x40eb851f    # -0.58f

    .line 356
    .line 357
    .line 358
    const v16, 0x3f8b851f    # 1.09f

    .line 359
    .line 360
    .line 361
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const v17, -0x3feccccd    # -2.3f

    .line 365
    .line 366
    .line 367
    const v18, -0x41b33333    # -0.2f

    .line 368
    .line 369
    .line 370
    const/high16 v13, -0x40c00000    # -0.75f

    .line 371
    .line 372
    const v14, -0x41f0a3d7    # -0.14f

    .line 373
    .line 374
    .line 375
    const v15, -0x403c28f6    # -1.53f

    .line 376
    .line 377
    .line 378
    const v16, -0x41b33333    # -0.2f

    .line 379
    .line 380
    .line 381
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/high16 v17, -0x3f500000    # -5.5f

    .line 385
    .line 386
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 387
    .line 388
    const v13, -0x40266666    # -1.7f

    .line 389
    .line 390
    .line 391
    const/4 v14, 0x0

    .line 392
    const v15, -0x3f7b3333    # -4.15f

    .line 393
    .line 394
    .line 395
    const v16, 0x3f266666    # 0.65f

    .line 396
    .line 397
    .line 398
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/high16 v0, 0x41000000    # 8.0f

    .line 402
    .line 403
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const/high16 v17, 0x40b00000    # 5.5f

    .line 407
    .line 408
    const/high16 v18, -0x40400000    # -1.5f

    .line 409
    .line 410
    const v13, 0x3faccccd    # 1.35f

    .line 411
    .line 412
    .line 413
    const v14, -0x40a66666    # -0.85f

    .line 414
    .line 415
    .line 416
    const v15, 0x40733333    # 3.8f

    .line 417
    .line 418
    .line 419
    const/high16 v16, -0x40400000    # -1.5f

    .line 420
    .line 421
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v17, 0x402ccccd    # 2.7f

    .line 425
    .line 426
    .line 427
    const v18, 0x3e8f5c29    # 0.28f

    .line 428
    .line 429
    .line 430
    const v13, 0x3f6b851f    # 0.92f

    .line 431
    .line 432
    .line 433
    const/4 v14, 0x0

    .line 434
    const v15, 0x3fea3d71    # 1.83f

    .line 435
    .line 436
    .line 437
    const v16, 0x3db851ec    # 0.09f

    .line 438
    .line 439
    .line 440
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v17, 0x3f4ccccd    # 0.8f

    .line 444
    .line 445
    .line 446
    const v18, 0x3f7ae148    # 0.98f

    .line 447
    .line 448
    .line 449
    const v13, 0x3eeb851f    # 0.46f

    .line 450
    .line 451
    .line 452
    const v14, 0x3dcccccd    # 0.1f

    .line 453
    .line 454
    .line 455
    const v15, 0x3f4ccccd    # 0.8f

    .line 456
    .line 457
    .line 458
    const v16, 0x3f028f5c    # 0.51f

    .line 459
    .line 460
    .line 461
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const v0, 0x4117851f    # 9.47f

    .line 465
    .line 466
    .line 467
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 474
    .line 475
    .line 476
    move-result-object v2

    .line 477
    const/16 v16, 0x3800

    .line 478
    .line 479
    const/16 v17, 0x0

    .line 480
    .line 481
    const/high16 v6, 0x3f800000    # 1.0f

    .line 482
    .line 483
    const/high16 v8, 0x3f800000    # 1.0f

    .line 484
    .line 485
    const/4 v7, 0x0

    .line 486
    const/high16 v9, 0x3f800000    # 1.0f

    .line 487
    .line 488
    const/high16 v12, 0x3f800000    # 1.0f

    .line 489
    .line 490
    const/4 v13, 0x0

    .line 491
    const/4 v14, 0x0

    .line 492
    const/4 v15, 0x0

    .line 493
    const-string v4, ""

    .line 494
    .line 495
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    sput-object v0, Landroidx/compose/material/icons/rounded/ImportContactsKt;->_importContacts:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 504
    .line 505
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 506
    .line 507
    .line 508
    return-object v0
.end method
