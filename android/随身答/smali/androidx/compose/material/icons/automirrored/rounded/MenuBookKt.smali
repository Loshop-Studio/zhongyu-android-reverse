.class public final Landroidx/compose/material/icons/automirrored/rounded/MenuBookKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_menuBook",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "MenuBook",
        "Landroidx/compose/material/icons/Icons$AutoMirrored$Rounded;",
        "getMenuBook",
        "(Landroidx/compose/material/icons/Icons$AutoMirrored$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nMenuBook.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuBook.kt\nandroidx/compose/material/icons/automirrored/rounded/MenuBookKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,97:1\n223#2:98\n216#2,3:99\n219#2,4:103\n233#2,18:107\n253#2:144\n233#2,18:145\n253#2:182\n233#2,18:183\n253#2:220\n233#2,18:221\n253#2:258\n174#3:102\n705#4,2:125\n717#4,2:127\n719#4,11:133\n705#4,2:163\n717#4,2:165\n719#4,11:171\n705#4,2:201\n717#4,2:203\n719#4,11:209\n705#4,2:239\n717#4,2:241\n719#4,11:247\n72#5,4:129\n72#5,4:167\n72#5,4:205\n72#5,4:243\n*S KotlinDebug\n*F\n+ 1 MenuBook.kt\nandroidx/compose/material/icons/automirrored/rounded/MenuBookKt\n*L\n29#1:98\n29#1:99,3\n29#1:103,4\n30#1:107,18\n30#1:144\n59#1:145,18\n59#1:182\n70#1:183,18\n70#1:220\n81#1:221,18\n81#1:258\n29#1:102\n30#1:125,2\n30#1:127,2\n30#1:133,11\n59#1:163,2\n59#1:165,2\n59#1:171,11\n70#1:201,2\n70#1:203,2\n70#1:209,11\n81#1:239,2\n81#1:241,2\n81#1:247,11\n30#1:129,4\n59#1:167,4\n70#1:205,4\n81#1:243,4\n*E\n"
    }
.end annotation


# static fields
.field private static _menuBook:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMenuBook(Landroidx/compose/material/icons/Icons$AutoMirrored$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/automirrored/rounded/MenuBookKt;->_menuBook:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const/4 v10, 0x1

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
    const-string v2, "AutoMirrored.Rounded.MenuBook"

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
    const/high16 v4, 0x418c0000    # 17.5f

    .line 71
    .line 72
    const/high16 v6, 0x40900000    # 4.5f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3f500000    # -5.5f

    .line 78
    .line 79
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 80
    .line 81
    const v21, -0x40066666    # -1.95f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const v23, -0x3f7e6666    # -4.05f

    .line 87
    .line 88
    .line 89
    const v24, 0x3ecccccd    # 0.4f

    .line 90
    .line 91
    .line 92
    move-object/from16 v20, v2

    .line 93
    .line 94
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v26, -0x40400000    # -1.5f

    .line 98
    .line 99
    const v21, -0x40466666    # -1.45f

    .line 100
    .line 101
    .line 102
    const v22, -0x40733333    # -1.1f

    .line 103
    .line 104
    .line 105
    const v23, -0x3f9ccccd    # -3.55f

    .line 106
    .line 107
    .line 108
    const/high16 v24, -0x40400000    # -1.5f

    .line 109
    .line 110
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const v25, -0x3f770a3d    # -4.28f

    .line 114
    .line 115
    .line 116
    const v26, 0x3f4a3d71    # 0.79f

    .line 117
    .line 118
    .line 119
    const/16 v22, 0x0

    .line 120
    .line 121
    const v23, -0x3fc0a3d7    # -2.99f

    .line 122
    .line 123
    .line 124
    const v24, 0x3e6147ae    # 0.22f

    .line 125
    .line 126
    .line 127
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const/high16 v25, 0x3f800000    # 1.0f

    .line 131
    .line 132
    const v26, 0x40e47ae1    # 7.14f

    .line 133
    .line 134
    .line 135
    const v21, 0x3fbeb852    # 1.49f

    .line 136
    .line 137
    .line 138
    const v22, 0x40b3d70a    # 5.62f

    .line 139
    .line 140
    .line 141
    const/high16 v23, 0x3f800000    # 1.0f

    .line 142
    .line 143
    const v24, 0x40ca8f5c    # 6.33f

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v4, 0x41347ae1    # 11.28f

    .line 150
    .line 151
    .line 152
    const/4 v6, 0x0

    .line 153
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v25, 0x401eb852    # 2.48f

    .line 157
    .line 158
    .line 159
    const v26, 0x3ff851ec    # 1.94f

    .line 160
    .line 161
    .line 162
    const/16 v21, 0x0

    .line 163
    .line 164
    const v22, 0x3fa66666    # 1.3f

    .line 165
    .line 166
    .line 167
    const v23, 0x3f9c28f6    # 1.22f

    .line 168
    .line 169
    .line 170
    const v24, 0x4010a3d7    # 2.26f

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/high16 v25, 0x40d00000    # 6.5f

    .line 177
    .line 178
    const/high16 v26, 0x41a00000    # 20.0f

    .line 179
    .line 180
    const v21, 0x408eb852    # 4.46f

    .line 181
    .line 182
    .line 183
    const v22, 0x41a0e148    # 20.11f

    .line 184
    .line 185
    .line 186
    const/high16 v23, 0x40b00000    # 5.5f

    .line 187
    .line 188
    const/high16 v24, 0x41a00000    # 20.0f

    .line 189
    .line 190
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v25, 0x4091eb85    # 4.56f

    .line 194
    .line 195
    .line 196
    const v26, 0x3f6b851f    # 0.92f

    .line 197
    .line 198
    .line 199
    const v21, 0x3fc7ae14    # 1.56f

    .line 200
    .line 201
    .line 202
    const/16 v22, 0x0

    .line 203
    .line 204
    const v23, 0x404e147b    # 3.22f

    .line 205
    .line 206
    .line 207
    const v24, 0x3e851eb8    # 0.26f

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v25, 0x3fef5c29    # 1.87f

    .line 214
    .line 215
    .line 216
    const/16 v26, 0x0

    .line 217
    .line 218
    const v21, 0x3f19999a    # 0.6f

    .line 219
    .line 220
    .line 221
    const v22, 0x3e99999a    # 0.3f

    .line 222
    .line 223
    .line 224
    const v23, 0x3fa3d70a    # 1.28f

    .line 225
    .line 226
    .line 227
    const v24, 0x3e99999a    # 0.3f

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v25, 0x4091eb85    # 4.56f

    .line 234
    .line 235
    .line 236
    const v26, -0x40947ae1    # -0.92f

    .line 237
    .line 238
    .line 239
    const v21, 0x3fab851f    # 1.34f

    .line 240
    .line 241
    .line 242
    const v22, -0x40d47ae1    # -0.67f

    .line 243
    .line 244
    .line 245
    const/high16 v23, 0x40400000    # 3.0f

    .line 246
    .line 247
    const v24, -0x40947ae1    # -0.92f

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v25, 0x404147ae    # 3.02f

    .line 254
    .line 255
    .line 256
    const v26, 0x3eb851ec    # 0.36f

    .line 257
    .line 258
    .line 259
    const/high16 v21, 0x3f800000    # 1.0f

    .line 260
    .line 261
    const/16 v22, 0x0

    .line 262
    .line 263
    const v23, 0x40028f5c    # 2.04f

    .line 264
    .line 265
    .line 266
    const v24, 0x3de147ae    # 0.11f

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v25, 0x401eb852    # 2.48f

    .line 273
    .line 274
    .line 275
    const v26, -0x4007ae14    # -1.94f

    .line 276
    .line 277
    .line 278
    const v21, 0x3fa147ae    # 1.26f

    .line 279
    .line 280
    .line 281
    const v22, 0x3ea8f5c3    # 0.33f

    .line 282
    .line 283
    .line 284
    const v23, 0x401eb852    # 2.48f

    .line 285
    .line 286
    .line 287
    const v24, -0x40deb852    # -0.63f

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v4, -0x3ecb851f    # -11.28f

    .line 294
    .line 295
    .line 296
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v25, -0x4063d70a    # -1.22f

    .line 300
    .line 301
    .line 302
    const v26, -0x40133333    # -1.85f

    .line 303
    .line 304
    .line 305
    const/16 v21, 0x0

    .line 306
    .line 307
    const v22, -0x40b0a3d7    # -0.81f

    .line 308
    .line 309
    .line 310
    const v23, -0x41051eb8    # -0.49f

    .line 311
    .line 312
    .line 313
    const v24, -0x403d70a4    # -1.52f

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v25, 0x418c0000    # 17.5f

    .line 320
    .line 321
    const/high16 v26, 0x40900000    # 4.5f

    .line 322
    .line 323
    const v21, 0x41a3eb85    # 20.49f

    .line 324
    .line 325
    .line 326
    const v22, 0x40970a3d    # 4.72f

    .line 327
    .line 328
    .line 329
    const v23, 0x4197999a    # 18.95f

    .line 330
    .line 331
    .line 332
    const/high16 v24, 0x40900000    # 4.5f

    .line 333
    .line 334
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v4, 0x41a80000    # 21.0f

    .line 341
    .line 342
    const v6, 0x4189d70a    # 17.23f

    .line 343
    .line 344
    .line 345
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v25, -0x40666666    # -1.2f

    .line 349
    .line 350
    .line 351
    const v26, 0x3f7ae148    # 0.98f

    .line 352
    .line 353
    .line 354
    const/16 v21, 0x0

    .line 355
    .line 356
    const v22, 0x3f2147ae    # 0.63f

    .line 357
    .line 358
    .line 359
    const v23, -0x40eb851f    # -0.58f

    .line 360
    .line 361
    .line 362
    const v24, 0x3f8b851f    # 1.09f

    .line 363
    .line 364
    .line 365
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v25, -0x3feccccd    # -2.3f

    .line 369
    .line 370
    .line 371
    const v26, -0x41b33333    # -0.2f

    .line 372
    .line 373
    .line 374
    const/high16 v21, -0x40c00000    # -0.75f

    .line 375
    .line 376
    const v22, -0x41f0a3d7    # -0.14f

    .line 377
    .line 378
    .line 379
    const v23, -0x403c28f6    # -1.53f

    .line 380
    .line 381
    .line 382
    const v24, -0x41b33333    # -0.2f

    .line 383
    .line 384
    .line 385
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const/high16 v25, -0x3f500000    # -5.5f

    .line 389
    .line 390
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 391
    .line 392
    const v21, -0x40266666    # -1.7f

    .line 393
    .line 394
    .line 395
    const/16 v22, 0x0

    .line 396
    .line 397
    const v23, -0x3f7b3333    # -4.15f

    .line 398
    .line 399
    .line 400
    const v24, 0x3f266666    # 0.65f

    .line 401
    .line 402
    .line 403
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const/high16 v4, 0x41000000    # 8.0f

    .line 407
    .line 408
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const/high16 v25, 0x40b00000    # 5.5f

    .line 412
    .line 413
    const/high16 v26, -0x40400000    # -1.5f

    .line 414
    .line 415
    const v21, 0x3faccccd    # 1.35f

    .line 416
    .line 417
    .line 418
    const v22, -0x40a66666    # -0.85f

    .line 419
    .line 420
    .line 421
    const v23, 0x40733333    # 3.8f

    .line 422
    .line 423
    .line 424
    const/high16 v24, -0x40400000    # -1.5f

    .line 425
    .line 426
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v25, 0x402ccccd    # 2.7f

    .line 430
    .line 431
    .line 432
    const v26, 0x3e8f5c29    # 0.28f

    .line 433
    .line 434
    .line 435
    const v21, 0x3f6b851f    # 0.92f

    .line 436
    .line 437
    .line 438
    const/16 v22, 0x0

    .line 439
    .line 440
    const v23, 0x3fea3d71    # 1.83f

    .line 441
    .line 442
    .line 443
    const v24, 0x3db851ec    # 0.09f

    .line 444
    .line 445
    .line 446
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v25, 0x3f4ccccd    # 0.8f

    .line 450
    .line 451
    .line 452
    const v26, 0x3f7ae148    # 0.98f

    .line 453
    .line 454
    .line 455
    const v21, 0x3eeb851f    # 0.46f

    .line 456
    .line 457
    .line 458
    const v22, 0x3dcccccd    # 0.1f

    .line 459
    .line 460
    .line 461
    const v23, 0x3f4ccccd    # 0.8f

    .line 462
    .line 463
    .line 464
    const v24, 0x3f028f5c    # 0.51f

    .line 465
    .line 466
    .line 467
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v4, 0x4189d70a    # 17.23f

    .line 471
    .line 472
    .line 473
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 480
    .line 481
    .line 482
    move-result-object v2

    .line 483
    const/16 v16, 0x3800

    .line 484
    .line 485
    const/16 v17, 0x0

    .line 486
    .line 487
    const/high16 v6, 0x3f800000    # 1.0f

    .line 488
    .line 489
    const/high16 v8, 0x3f800000    # 1.0f

    .line 490
    .line 491
    const/4 v7, 0x0

    .line 492
    const/high16 v9, 0x3f800000    # 1.0f

    .line 493
    .line 494
    const/high16 v12, 0x3f800000    # 1.0f

    .line 495
    .line 496
    const/4 v13, 0x0

    .line 497
    const/4 v14, 0x0

    .line 498
    const/4 v15, 0x0

    .line 499
    const-string v4, ""

    .line 500
    .line 501
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 502
    .line 503
    .line 504
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 505
    .line 506
    .line 507
    move-result v3

    .line 508
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 509
    .line 510
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 511
    .line 512
    .line 513
    move-result-wide v6

    .line 514
    const/4 v2, 0x0

    .line 515
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 516
    .line 517
    .line 518
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 519
    .line 520
    .line 521
    move-result v10

    .line 522
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 523
    .line 524
    .line 525
    move-result v11

    .line 526
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 529
    .line 530
    .line 531
    const v4, 0x413028f6    # 11.01f

    .line 532
    .line 533
    .line 534
    const v6, 0x415fae14    # 13.98f

    .line 535
    .line 536
    .line 537
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const v25, -0x40ca3d71    # -0.71f

    .line 541
    .line 542
    .line 543
    const v26, -0x40fae148    # -0.52f

    .line 544
    .line 545
    .line 546
    const v21, -0x415c28f6    # -0.32f

    .line 547
    .line 548
    .line 549
    const/16 v22, 0x0

    .line 550
    .line 551
    const v23, -0x40e3d70a    # -0.61f

    .line 552
    .line 553
    .line 554
    const v24, -0x41b33333    # -0.2f

    .line 555
    .line 556
    .line 557
    move-object/from16 v20, v2

    .line 558
    .line 559
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const v25, 0x3ef5c28f    # 0.48f

    .line 563
    .line 564
    .line 565
    const v26, -0x408f5c29    # -0.94f

    .line 566
    .line 567
    .line 568
    const v21, -0x41fae148    # -0.13f

    .line 569
    .line 570
    .line 571
    const v22, -0x413851ec    # -0.39f

    .line 572
    .line 573
    .line 574
    const v23, 0x3db851ec    # 0.09f

    .line 575
    .line 576
    .line 577
    const v24, -0x40ae147b    # -0.82f

    .line 578
    .line 579
    .line 580
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const v25, 0x40ab851f    # 5.36f

    .line 584
    .line 585
    .line 586
    const v26, -0x4119999a    # -0.45f

    .line 587
    .line 588
    .line 589
    const v21, 0x3fc51eb8    # 1.54f

    .line 590
    .line 591
    .line 592
    const/high16 v22, -0x41000000    # -0.5f

    .line 593
    .line 594
    const v23, 0x4061eb85    # 3.53f

    .line 595
    .line 596
    .line 597
    const v24, -0x40d70a3d    # -0.66f

    .line 598
    .line 599
    .line 600
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const v25, 0x3f28f5c3    # 0.66f

    .line 604
    .line 605
    .line 606
    const v26, 0x3f547ae1    # 0.83f

    .line 607
    .line 608
    .line 609
    const v21, 0x3ed1eb85    # 0.41f

    .line 610
    .line 611
    .line 612
    const v22, 0x3d4ccccd    # 0.05f

    .line 613
    .line 614
    .line 615
    const v23, 0x3f35c28f    # 0.71f

    .line 616
    .line 617
    .line 618
    const v24, 0x3ed70a3d    # 0.42f

    .line 619
    .line 620
    .line 621
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const v25, -0x40ab851f    # -0.83f

    .line 625
    .line 626
    .line 627
    const v26, 0x3f28f5c3    # 0.66f

    .line 628
    .line 629
    .line 630
    const v21, -0x42b33333    # -0.05f

    .line 631
    .line 632
    .line 633
    const v22, 0x3ed1eb85    # 0.41f

    .line 634
    .line 635
    .line 636
    const v23, -0x4128f5c3    # -0.42f

    .line 637
    .line 638
    .line 639
    const v24, 0x3f35c28f    # 0.71f

    .line 640
    .line 641
    .line 642
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    const v25, -0x3f68a3d7    # -4.73f

    .line 646
    .line 647
    .line 648
    const v26, 0x3ec7ae14    # 0.39f

    .line 649
    .line 650
    .line 651
    const v21, -0x4030a3d7    # -1.62f

    .line 652
    .line 653
    .line 654
    const v22, -0x41bd70a4    # -0.19f

    .line 655
    .line 656
    .line 657
    const v23, -0x3fa70a3d    # -3.39f

    .line 658
    .line 659
    .line 660
    const v24, -0x42dc28f6    # -0.04f

    .line 661
    .line 662
    .line 663
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 664
    .line 665
    .line 666
    const v25, 0x415fae14    # 13.98f

    .line 667
    .line 668
    .line 669
    const v26, 0x413028f6    # 11.01f

    .line 670
    .line 671
    .line 672
    const v21, 0x4162147b    # 14.13f

    .line 673
    .line 674
    .line 675
    const v22, 0x412fd70a    # 10.99f

    .line 676
    .line 677
    .line 678
    const v23, 0x4160cccd    # 14.05f

    .line 679
    .line 680
    .line 681
    const v24, 0x413028f6    # 11.01f

    .line 682
    .line 683
    .line 684
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 691
    .line 692
    .line 693
    move-result-object v2

    .line 694
    const/high16 v6, 0x3f800000    # 1.0f

    .line 695
    .line 696
    const/4 v7, 0x0

    .line 697
    const-string v4, ""

    .line 698
    .line 699
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 700
    .line 701
    .line 702
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 703
    .line 704
    .line 705
    move-result v3

    .line 706
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 707
    .line 708
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 709
    .line 710
    .line 711
    move-result-wide v6

    .line 712
    const/4 v2, 0x0

    .line 713
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 714
    .line 715
    .line 716
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 717
    .line 718
    .line 719
    move-result v10

    .line 720
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 721
    .line 722
    .line 723
    move-result v11

    .line 724
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 727
    .line 728
    .line 729
    const v4, 0x415ab852    # 13.67f

    .line 730
    .line 731
    .line 732
    const v6, 0x415fae14    # 13.98f

    .line 733
    .line 734
    .line 735
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 736
    .line 737
    .line 738
    const v25, -0x40ca3d71    # -0.71f

    .line 739
    .line 740
    .line 741
    const v26, -0x40fae148    # -0.52f

    .line 742
    .line 743
    .line 744
    const v21, -0x415c28f6    # -0.32f

    .line 745
    .line 746
    .line 747
    const/16 v22, 0x0

    .line 748
    .line 749
    const v23, -0x40e3d70a    # -0.61f

    .line 750
    .line 751
    .line 752
    const v24, -0x41b33333    # -0.2f

    .line 753
    .line 754
    .line 755
    move-object/from16 v20, v2

    .line 756
    .line 757
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 758
    .line 759
    .line 760
    const v25, 0x3ef5c28f    # 0.48f

    .line 761
    .line 762
    .line 763
    const v26, -0x408f5c29    # -0.94f

    .line 764
    .line 765
    .line 766
    const v21, -0x41fae148    # -0.13f

    .line 767
    .line 768
    .line 769
    const v22, -0x413851ec    # -0.39f

    .line 770
    .line 771
    .line 772
    const v23, 0x3db851ec    # 0.09f

    .line 773
    .line 774
    .line 775
    const v24, -0x40ae147b    # -0.82f

    .line 776
    .line 777
    .line 778
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 779
    .line 780
    .line 781
    const v25, 0x40ab851f    # 5.36f

    .line 782
    .line 783
    .line 784
    const v26, -0x4119999a    # -0.45f

    .line 785
    .line 786
    .line 787
    const v21, 0x3fc3d70a    # 1.53f

    .line 788
    .line 789
    .line 790
    const/high16 v22, -0x41000000    # -0.5f

    .line 791
    .line 792
    const v23, 0x4061eb85    # 3.53f

    .line 793
    .line 794
    .line 795
    const v24, -0x40d70a3d    # -0.66f

    .line 796
    .line 797
    .line 798
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 799
    .line 800
    .line 801
    const v25, 0x3f28f5c3    # 0.66f

    .line 802
    .line 803
    .line 804
    const v26, 0x3f547ae1    # 0.83f

    .line 805
    .line 806
    .line 807
    const v21, 0x3ed1eb85    # 0.41f

    .line 808
    .line 809
    .line 810
    const v22, 0x3d4ccccd    # 0.05f

    .line 811
    .line 812
    .line 813
    const v23, 0x3f35c28f    # 0.71f

    .line 814
    .line 815
    .line 816
    const v24, 0x3ed70a3d    # 0.42f

    .line 817
    .line 818
    .line 819
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 820
    .line 821
    .line 822
    const v25, -0x40ab851f    # -0.83f

    .line 823
    .line 824
    .line 825
    const v26, 0x3f28f5c3    # 0.66f

    .line 826
    .line 827
    .line 828
    const v21, -0x42b33333    # -0.05f

    .line 829
    .line 830
    .line 831
    const v22, 0x3ed1eb85    # 0.41f

    .line 832
    .line 833
    .line 834
    const v23, -0x4128f5c3    # -0.42f

    .line 835
    .line 836
    .line 837
    const v24, 0x3f35c28f    # 0.71f

    .line 838
    .line 839
    .line 840
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 841
    .line 842
    .line 843
    const v25, -0x3f68a3d7    # -4.73f

    .line 844
    .line 845
    .line 846
    const v26, 0x3ec7ae14    # 0.39f

    .line 847
    .line 848
    .line 849
    const v21, -0x4030a3d7    # -1.62f

    .line 850
    .line 851
    .line 852
    const v22, -0x41bd70a4    # -0.19f

    .line 853
    .line 854
    .line 855
    const v23, -0x3fa70a3d    # -3.39f

    .line 856
    .line 857
    .line 858
    const v24, -0x42dc28f6    # -0.04f

    .line 859
    .line 860
    .line 861
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 862
    .line 863
    .line 864
    const v25, 0x415fae14    # 13.98f

    .line 865
    .line 866
    .line 867
    const v26, 0x415ab852    # 13.67f

    .line 868
    .line 869
    .line 870
    const v21, 0x4162147b    # 14.13f

    .line 871
    .line 872
    .line 873
    const v22, 0x415a8f5c    # 13.66f

    .line 874
    .line 875
    .line 876
    const v23, 0x4160cccd    # 14.05f

    .line 877
    .line 878
    .line 879
    const v24, 0x415ab852    # 13.67f

    .line 880
    .line 881
    .line 882
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 883
    .line 884
    .line 885
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 886
    .line 887
    .line 888
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 889
    .line 890
    .line 891
    move-result-object v2

    .line 892
    const/high16 v6, 0x3f800000    # 1.0f

    .line 893
    .line 894
    const/4 v7, 0x0

    .line 895
    const-string v4, ""

    .line 896
    .line 897
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 898
    .line 899
    .line 900
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 901
    .line 902
    .line 903
    move-result v3

    .line 904
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 905
    .line 906
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 907
    .line 908
    .line 909
    move-result-wide v6

    .line 910
    const/4 v0, 0x0

    .line 911
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 912
    .line 913
    .line 914
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 915
    .line 916
    .line 917
    move-result v10

    .line 918
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 919
    .line 920
    .line 921
    move-result v11

    .line 922
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 923
    .line 924
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 925
    .line 926
    .line 927
    const v0, 0x4182a3d7    # 16.33f

    .line 928
    .line 929
    .line 930
    const v2, 0x415fae14    # 13.98f

    .line 931
    .line 932
    .line 933
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 934
    .line 935
    .line 936
    const v17, -0x40ca3d71    # -0.71f

    .line 937
    .line 938
    .line 939
    const v18, -0x40fae148    # -0.52f

    .line 940
    .line 941
    .line 942
    const v13, -0x415c28f6    # -0.32f

    .line 943
    .line 944
    .line 945
    const v15, -0x40e3d70a    # -0.61f

    .line 946
    .line 947
    .line 948
    const v16, -0x41b33333    # -0.2f

    .line 949
    .line 950
    .line 951
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 952
    .line 953
    .line 954
    const v17, 0x3ef5c28f    # 0.48f

    .line 955
    .line 956
    .line 957
    const v18, -0x408f5c29    # -0.94f

    .line 958
    .line 959
    .line 960
    const v13, -0x41fae148    # -0.13f

    .line 961
    .line 962
    .line 963
    const v14, -0x413851ec    # -0.39f

    .line 964
    .line 965
    .line 966
    const v15, 0x3db851ec    # 0.09f

    .line 967
    .line 968
    .line 969
    const v16, -0x40ae147b    # -0.82f

    .line 970
    .line 971
    .line 972
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 973
    .line 974
    .line 975
    const v17, 0x40ab851f    # 5.36f

    .line 976
    .line 977
    .line 978
    const v18, -0x4119999a    # -0.45f

    .line 979
    .line 980
    .line 981
    const v13, 0x3fc3d70a    # 1.53f

    .line 982
    .line 983
    .line 984
    const/high16 v14, -0x41000000    # -0.5f

    .line 985
    .line 986
    const v15, 0x4061eb85    # 3.53f

    .line 987
    .line 988
    .line 989
    const v16, -0x40d70a3d    # -0.66f

    .line 990
    .line 991
    .line 992
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 993
    .line 994
    .line 995
    const v17, 0x3f28f5c3    # 0.66f

    .line 996
    .line 997
    .line 998
    const v18, 0x3f547ae1    # 0.83f

    .line 999
    .line 1000
    .line 1001
    const v13, 0x3ed1eb85    # 0.41f

    .line 1002
    .line 1003
    .line 1004
    const v14, 0x3d4ccccd    # 0.05f

    .line 1005
    .line 1006
    .line 1007
    const v15, 0x3f35c28f    # 0.71f

    .line 1008
    .line 1009
    .line 1010
    const v16, 0x3ed70a3d    # 0.42f

    .line 1011
    .line 1012
    .line 1013
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1014
    .line 1015
    .line 1016
    const v17, -0x40ab851f    # -0.83f

    .line 1017
    .line 1018
    .line 1019
    const v18, 0x3f28f5c3    # 0.66f

    .line 1020
    .line 1021
    .line 1022
    const v13, -0x42b33333    # -0.05f

    .line 1023
    .line 1024
    .line 1025
    const v14, 0x3ed1eb85    # 0.41f

    .line 1026
    .line 1027
    .line 1028
    const v15, -0x4128f5c3    # -0.42f

    .line 1029
    .line 1030
    .line 1031
    const v16, 0x3f333333    # 0.7f

    .line 1032
    .line 1033
    .line 1034
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1035
    .line 1036
    .line 1037
    const v17, -0x3f68a3d7    # -4.73f

    .line 1038
    .line 1039
    .line 1040
    const v18, 0x3ec7ae14    # 0.39f

    .line 1041
    .line 1042
    .line 1043
    const v13, -0x4030a3d7    # -1.62f

    .line 1044
    .line 1045
    .line 1046
    const v14, -0x41bd70a4    # -0.19f

    .line 1047
    .line 1048
    .line 1049
    const v15, -0x3fa70a3d    # -3.39f

    .line 1050
    .line 1051
    .line 1052
    const v16, -0x42dc28f6    # -0.04f

    .line 1053
    .line 1054
    .line 1055
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1056
    .line 1057
    .line 1058
    const v17, 0x415fae14    # 13.98f

    .line 1059
    .line 1060
    .line 1061
    const v18, 0x4182a3d7    # 16.33f

    .line 1062
    .line 1063
    .line 1064
    const v13, 0x4162147b    # 14.13f

    .line 1065
    .line 1066
    .line 1067
    const v14, 0x41828f5c    # 16.32f

    .line 1068
    .line 1069
    .line 1070
    const v15, 0x4160cccd    # 14.05f

    .line 1071
    .line 1072
    .line 1073
    const v16, 0x4182a3d7    # 16.33f

    .line 1074
    .line 1075
    .line 1076
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1077
    .line 1078
    .line 1079
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1080
    .line 1081
    .line 1082
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v2

    .line 1086
    const/16 v16, 0x3800

    .line 1087
    .line 1088
    const/16 v17, 0x0

    .line 1089
    .line 1090
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1091
    .line 1092
    const/4 v7, 0x0

    .line 1093
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1094
    .line 1095
    const/4 v13, 0x0

    .line 1096
    const/4 v14, 0x0

    .line 1097
    const/4 v15, 0x0

    .line 1098
    const-string v4, ""

    .line 1099
    .line 1100
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v0

    .line 1104
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v0

    .line 1108
    sput-object v0, Landroidx/compose/material/icons/automirrored/rounded/MenuBookKt;->_menuBook:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1109
    .line 1110
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1111
    .line 1112
    .line 1113
    return-object v0
.end method
