.class public final Landroidx/compose/material/icons/rounded/HelpCenterKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00038FX\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "_helpCenter",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "HelpCenter",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getHelpCenter$annotations",
        "(Landroidx/compose/material/icons/Icons$Rounded;)V",
        "getHelpCenter",
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
        "SMAP\nHelpCenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelpCenter.kt\nandroidx/compose/material/icons/rounded/HelpCenterKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,76:1\n212#2,12:77\n233#2,18:90\n253#2:127\n174#3:89\n705#4,2:108\n717#4,2:110\n719#4,11:116\n72#5,4:112\n*S KotlinDebug\n*F\n+ 1 HelpCenter.kt\nandroidx/compose/material/icons/rounded/HelpCenterKt\n*L\n35#1:77,12\n36#1:90,18\n36#1:127\n35#1:89\n36#1:108,2\n36#1:110,2\n36#1:116,11\n36#1:112,4\n*E\n"
    }
.end annotation


# static fields
.field private static _helpCenter:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHelpCenter(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/HelpCenterKt;->_helpCenter:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.HelpCenter"

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
    const/high16 v0, 0x41980000    # 19.0f

    .line 71
    .line 72
    const/high16 v2, 0x40400000    # 3.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40a00000    # 5.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, 0x40400000    # 3.0f

    .line 83
    .line 84
    const/high16 v18, 0x40a00000    # 5.0f

    .line 85
    .line 86
    const v13, 0x4079999a    # 3.9f

    .line 87
    .line 88
    .line 89
    const/high16 v14, 0x40400000    # 3.0f

    .line 90
    .line 91
    const/high16 v15, 0x40400000    # 3.0f

    .line 92
    .line 93
    const v16, 0x4079999a    # 3.9f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v0, 0x41600000    # 14.0f

    .line 100
    .line 101
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v17, 0x40000000    # 2.0f

    .line 105
    .line 106
    const/high16 v18, 0x40000000    # 2.0f

    .line 107
    .line 108
    const/4 v13, 0x0

    .line 109
    const v14, 0x3f8ccccd    # 1.1f

    .line 110
    .line 111
    .line 112
    const v15, 0x3f666666    # 0.9f

    .line 113
    .line 114
    .line 115
    const/high16 v16, 0x40000000    # 2.0f

    .line 116
    .line 117
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v18, -0x40000000    # -2.0f

    .line 124
    .line 125
    const v13, 0x3f8ccccd    # 1.1f

    .line 126
    .line 127
    .line 128
    const/4 v14, 0x0

    .line 129
    const/high16 v15, 0x40000000    # 2.0f

    .line 130
    .line 131
    const v16, -0x4099999a    # -0.9f

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v0, 0x40a00000    # 5.0f

    .line 138
    .line 139
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v17, 0x41980000    # 19.0f

    .line 143
    .line 144
    const/high16 v18, 0x40400000    # 3.0f

    .line 145
    .line 146
    const/high16 v13, 0x41a80000    # 21.0f

    .line 147
    .line 148
    const v14, 0x4079999a    # 3.9f

    .line 149
    .line 150
    .line 151
    const v15, 0x41a0cccd    # 20.1f

    .line 152
    .line 153
    .line 154
    const/high16 v16, 0x40400000    # 3.0f

    .line 155
    .line 156
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v0, 0x414028f6    # 12.01f

    .line 163
    .line 164
    .line 165
    const/high16 v2, 0x41900000    # 18.0f

    .line 166
    .line 167
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v17, -0x405eb852    # -1.26f

    .line 171
    .line 172
    .line 173
    const v18, -0x405eb852    # -1.26f

    .line 174
    .line 175
    .line 176
    const v13, -0x40cccccd    # -0.7f

    .line 177
    .line 178
    .line 179
    const/4 v14, 0x0

    .line 180
    const v15, -0x405eb852    # -1.26f

    .line 181
    .line 182
    .line 183
    const v16, -0x40f0a3d7    # -0.56f

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v17, 0x3fa147ae    # 1.26f

    .line 190
    .line 191
    .line 192
    const/high16 v18, -0x40600000    # -1.25f

    .line 193
    .line 194
    const/4 v13, 0x0

    .line 195
    const v14, -0x40ca3d71    # -0.71f

    .line 196
    .line 197
    .line 198
    const v15, 0x3f0f5c29    # 0.56f

    .line 199
    .line 200
    .line 201
    const/high16 v16, -0x40600000    # -1.25f

    .line 202
    .line 203
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v17, 0x3fa00000    # 1.25f

    .line 207
    .line 208
    const/high16 v18, 0x3fa00000    # 1.25f

    .line 209
    .line 210
    const v13, 0x3f35c28f    # 0.71f

    .line 211
    .line 212
    .line 213
    const/4 v14, 0x0

    .line 214
    const/high16 v15, 0x3fa00000    # 1.25f

    .line 215
    .line 216
    const v16, 0x3f0a3d71    # 0.54f

    .line 217
    .line 218
    .line 219
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v17, 0x414028f6    # 12.01f

    .line 223
    .line 224
    .line 225
    const/high16 v18, 0x41900000    # 18.0f

    .line 226
    .line 227
    const/high16 v13, 0x41540000    # 13.25f

    .line 228
    .line 229
    const v14, 0x418b70a4    # 17.43f

    .line 230
    .line 231
    .line 232
    const v15, 0x414b851f    # 12.72f

    .line 233
    .line 234
    .line 235
    const/high16 v16, 0x41900000    # 18.0f

    .line 236
    .line 237
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v0, 0x417051ec    # 15.02f

    .line 244
    .line 245
    .line 246
    const v2, 0x4129999a    # 10.6f

    .line 247
    .line 248
    .line 249
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v17, -0x4010a3d7    # -1.87f

    .line 253
    .line 254
    .line 255
    const v18, 0x400ae148    # 2.17f

    .line 256
    .line 257
    .line 258
    const v13, -0x40bd70a4    # -0.76f

    .line 259
    .line 260
    .line 261
    const v14, 0x3f8e147b    # 1.11f

    .line 262
    .line 263
    .line 264
    const v15, -0x40428f5c    # -1.48f

    .line 265
    .line 266
    .line 267
    const v16, 0x3fbae148    # 1.46f

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v17, -0x41bd70a4    # -0.19f

    .line 274
    .line 275
    .line 276
    const v18, 0x3f2147ae    # 0.63f

    .line 277
    .line 278
    .line 279
    const v13, -0x42333333    # -0.1f

    .line 280
    .line 281
    .line 282
    const v14, 0x3e3851ec    # 0.18f

    .line 283
    .line 284
    .line 285
    const v15, -0x41dc28f6    # -0.16f

    .line 286
    .line 287
    .line 288
    const v16, 0x3ea3d70a    # 0.32f

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v17, -0x4099999a    # -0.9f

    .line 295
    .line 296
    .line 297
    const v18, 0x3f47ae14    # 0.78f

    .line 298
    .line 299
    .line 300
    const v13, -0x42b33333    # -0.05f

    .line 301
    .line 302
    .line 303
    const v14, 0x3ee66666    # 0.45f

    .line 304
    .line 305
    .line 306
    const v15, -0x4119999a    # -0.45f

    .line 307
    .line 308
    .line 309
    const v16, 0x3f47ae14    # 0.78f

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v0, 0x41400000    # 12.0f

    .line 316
    .line 317
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v17, -0x409eb852    # -0.88f

    .line 321
    .line 322
    .line 323
    const v18, -0x408a3d71    # -0.96f

    .line 324
    .line 325
    .line 326
    const v13, -0x40fae148    # -0.52f

    .line 327
    .line 328
    .line 329
    const/4 v14, 0x0

    .line 330
    const v15, -0x4091eb85    # -0.93f

    .line 331
    .line 332
    .line 333
    const v16, -0x411eb852    # -0.44f

    .line 334
    .line 335
    .line 336
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v17, 0x3e99999a    # 0.3f

    .line 340
    .line 341
    .line 342
    const v18, -0x407c28f6    # -1.03f

    .line 343
    .line 344
    .line 345
    const v13, 0x3cf5c28f    # 0.03f

    .line 346
    .line 347
    .line 348
    const v14, -0x4151eb85    # -0.34f

    .line 349
    .line 350
    .line 351
    const v15, 0x3de147ae    # 0.11f

    .line 352
    .line 353
    .line 354
    const v16, -0x40cf5c29    # -0.69f

    .line 355
    .line 356
    .line 357
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v17, 0x3ffae148    # 1.96f

    .line 361
    .line 362
    .line 363
    const v18, -0x3ff5c28f    # -2.16f

    .line 364
    .line 365
    .line 366
    const v13, 0x3efae148    # 0.49f

    .line 367
    .line 368
    .line 369
    const v14, -0x40a147ae    # -0.87f

    .line 370
    .line 371
    .line 372
    const v15, 0x3fb5c28f    # 1.42f

    .line 373
    .line 374
    .line 375
    const v16, -0x404e147b    # -1.39f

    .line 376
    .line 377
    .line 378
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v17, -0x4050a3d7    # -1.37f

    .line 382
    .line 383
    .line 384
    const v18, -0x3feae148    # -2.33f

    .line 385
    .line 386
    .line 387
    const v13, 0x3f11eb85    # 0.57f

    .line 388
    .line 389
    .line 390
    const v14, -0x40b0a3d7    # -0.81f

    .line 391
    .line 392
    .line 393
    const/high16 v15, 0x3e800000    # 0.25f

    .line 394
    .line 395
    const v16, -0x3feae148    # -2.33f

    .line 396
    .line 397
    .line 398
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v17, -0x4043d70a    # -1.47f

    .line 402
    .line 403
    .line 404
    const v18, 0x3f4a3d71    # 0.79f

    .line 405
    .line 406
    .line 407
    const v13, -0x40ca3d71    # -0.71f

    .line 408
    .line 409
    .line 410
    const/4 v14, 0x0

    .line 411
    const v15, -0x4068f5c3    # -1.18f

    .line 412
    .line 413
    .line 414
    const v16, 0x3eb851ec    # 0.36f

    .line 415
    .line 416
    .line 417
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v17, -0x40733333    # -1.1f

    .line 421
    .line 422
    .line 423
    const v18, 0x3eb851ec    # 0.36f

    .line 424
    .line 425
    .line 426
    const/high16 v13, -0x41800000    # -0.25f

    .line 427
    .line 428
    const v14, 0x3eb851ec    # 0.36f

    .line 429
    .line 430
    .line 431
    const v15, -0x40cf5c29    # -0.69f

    .line 432
    .line 433
    .line 434
    const v16, 0x3f07ae14    # 0.53f

    .line 435
    .line 436
    .line 437
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const/4 v0, 0x0

    .line 441
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v17, 0x4110a3d7    # 9.04f

    .line 445
    .line 446
    .line 447
    const v18, 0x40f147ae    # 7.54f

    .line 448
    .line 449
    .line 450
    const v13, 0x410e8f5c    # 8.91f

    .line 451
    .line 452
    .line 453
    const v14, 0x410a3d71    # 8.64f

    .line 454
    .line 455
    .line 456
    const v15, 0x410b851f    # 8.72f

    .line 457
    .line 458
    .line 459
    const/high16 v16, 0x41000000    # 8.0f

    .line 460
    .line 461
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const v17, 0x413fd70a    # 11.99f

    .line 465
    .line 466
    .line 467
    const/high16 v18, 0x40c00000    # 6.0f

    .line 468
    .line 469
    const v13, 0x411a6666    # 9.65f

    .line 470
    .line 471
    .line 472
    const v14, 0x40d4cccd    # 6.65f

    .line 473
    .line 474
    .line 475
    const v15, 0x412ab852    # 10.67f

    .line 476
    .line 477
    .line 478
    const/high16 v16, 0x40c00000    # 6.0f

    .line 479
    .line 480
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v17, 0x4040a3d7    # 3.01f

    .line 484
    .line 485
    .line 486
    const v18, 0x3fc28f5c    # 1.52f

    .line 487
    .line 488
    .line 489
    const v13, 0x3fbd70a4    # 1.48f

    .line 490
    .line 491
    .line 492
    const/4 v14, 0x0

    .line 493
    const v15, 0x401f5c29    # 2.49f

    .line 494
    .line 495
    .line 496
    const v16, 0x3f2b851f    # 0.67f

    .line 497
    .line 498
    .line 499
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const v17, 0x417051ec    # 15.02f

    .line 503
    .line 504
    .line 505
    const v18, 0x4129999a    # 10.6f

    .line 506
    .line 507
    .line 508
    const v13, 0x41770a3d    # 15.44f

    .line 509
    .line 510
    .line 511
    const v14, 0x4103d70a    # 8.24f

    .line 512
    .line 513
    .line 514
    const v15, 0x417b3333    # 15.7f

    .line 515
    .line 516
    .line 517
    const v16, 0x411970a4    # 9.59f

    .line 518
    .line 519
    .line 520
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 527
    .line 528
    .line 529
    move-result-object v2

    .line 530
    const/16 v16, 0x3800

    .line 531
    .line 532
    const/16 v17, 0x0

    .line 533
    .line 534
    const/high16 v6, 0x3f800000    # 1.0f

    .line 535
    .line 536
    const/high16 v8, 0x3f800000    # 1.0f

    .line 537
    .line 538
    const/4 v7, 0x0

    .line 539
    const/high16 v9, 0x3f800000    # 1.0f

    .line 540
    .line 541
    const/high16 v12, 0x3f800000    # 1.0f

    .line 542
    .line 543
    const/4 v13, 0x0

    .line 544
    const/4 v14, 0x0

    .line 545
    const/4 v15, 0x0

    .line 546
    const-string v4, ""

    .line 547
    .line 548
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 553
    .line 554
    .line 555
    move-result-object v0

    .line 556
    sput-object v0, Landroidx/compose/material/icons/rounded/HelpCenterKt;->_helpCenter:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 557
    .line 558
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 559
    .line 560
    .line 561
    return-object v0
.end method

.method public static synthetic getHelpCenter$annotations(Landroidx/compose/material/icons/Icons$Rounded;)V
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        message = "Use the AutoMirrored version at Icons.AutoMirrored.Rounded.HelpCenter"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "Icons.AutoMirrored.Rounded.HelpCenter"
            imports = {
                "androidx.compose.material.icons.automirrored.rounded.HelpCenter"
            }
        .end subannotation
    .end annotation

    return-void
.end method
