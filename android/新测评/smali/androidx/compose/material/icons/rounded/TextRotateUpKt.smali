.class public final Landroidx/compose/material/icons/rounded/TextRotateUpKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_textRotateUp",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "TextRotateUp",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getTextRotateUp",
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
        "SMAP\nTextRotateUp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextRotateUp.kt\nandroidx/compose/material/icons/rounded/TextRotateUpKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,68:1\n212#2,12:69\n233#2,18:82\n253#2:119\n174#3:81\n705#4,2:100\n717#4,2:102\n719#4,11:108\n72#5,4:104\n*S KotlinDebug\n*F\n+ 1 TextRotateUp.kt\nandroidx/compose/material/icons/rounded/TextRotateUpKt\n*L\n29#1:69,12\n30#1:82,18\n30#1:119\n29#1:81\n30#1:100,2\n30#1:102,2\n30#1:108,11\n30#1:104,4\n*E\n"
    }
.end annotation


# static fields
.field private static _textRotateUp:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTextRotateUp(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/TextRotateUpKt;->_textRotateUp:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.TextRotateUp"

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
    const v0, 0x4192cccd    # 18.35f

    .line 71
    .line 72
    .line 73
    const v2, 0x408b3333    # 4.35f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x40ca3d71    # -0.71f

    .line 80
    .line 81
    .line 82
    const/16 v18, 0x0

    .line 83
    .line 84
    const v13, -0x41b33333    # -0.2f

    .line 85
    .line 86
    .line 87
    const v14, -0x41b33333    # -0.2f

    .line 88
    .line 89
    .line 90
    const v15, -0x40fd70a4    # -0.51f

    .line 91
    .line 92
    .line 93
    const v16, -0x41b33333    # -0.2f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v0, 0x3fe51eb8    # 1.79f

    .line 100
    .line 101
    .line 102
    const v2, -0x401ae148    # -1.79f

    .line 103
    .line 104
    .line 105
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v17, 0x3eb851ec    # 0.36f

    .line 109
    .line 110
    .line 111
    const v18, 0x3f5c28f6    # 0.86f

    .line 112
    .line 113
    .line 114
    const v13, -0x416147ae    # -0.31f

    .line 115
    .line 116
    .line 117
    const v14, 0x3ea3d70a    # 0.32f

    .line 118
    .line 119
    .line 120
    const v15, -0x4247ae14    # -0.09f

    .line 121
    .line 122
    .line 123
    const v16, 0x3f5c28f6    # 0.86f

    .line 124
    .line 125
    .line 126
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v0, 0x41880000    # 17.0f

    .line 130
    .line 131
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v0, 0x41400000    # 12.0f

    .line 135
    .line 136
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v17, 0x3f800000    # 1.0f

    .line 140
    .line 141
    const/high16 v18, 0x3f800000    # 1.0f

    .line 142
    .line 143
    const/4 v13, 0x0

    .line 144
    const v14, 0x3f0ccccd    # 0.55f

    .line 145
    .line 146
    .line 147
    const v15, 0x3ee66666    # 0.45f

    .line 148
    .line 149
    .line 150
    const/high16 v16, 0x3f800000    # 1.0f

    .line 151
    .line 152
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v0, -0x4119999a    # -0.45f

    .line 156
    .line 157
    .line 158
    const/high16 v2, -0x40800000    # -1.0f

    .line 159
    .line 160
    const/high16 v4, 0x3f800000    # 1.0f

    .line 161
    .line 162
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v0, 0x40e00000    # 7.0f

    .line 166
    .line 167
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v0, 0x3f4a3d71    # 0.79f

    .line 171
    .line 172
    .line 173
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v17, 0x3eb33333    # 0.35f

    .line 177
    .line 178
    .line 179
    const v18, -0x40a66666    # -0.85f

    .line 180
    .line 181
    .line 182
    const v13, 0x3ee66666    # 0.45f

    .line 183
    .line 184
    .line 185
    const/4 v14, 0x0

    .line 186
    const v15, 0x3f2b851f    # 0.67f

    .line 187
    .line 188
    .line 189
    const v16, -0x40f5c28f    # -0.54f

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v0, -0x4019999a    # -1.8f

    .line 196
    .line 197
    .line 198
    const v2, -0x401ae148    # -1.79f

    .line 199
    .line 200
    .line 201
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v0, 0x413ccccd    # 11.8f

    .line 208
    .line 209
    .line 210
    const/high16 v2, 0x41780000    # 15.5f

    .line 211
    .line 212
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v0, -0x3f600000    # -5.0f

    .line 216
    .line 217
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v0, 0x3fcccccd    # 1.6f

    .line 221
    .line 222
    .line 223
    const v2, -0x40d70a3d    # -0.66f

    .line 224
    .line 225
    .line 226
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v17, 0x3f19999a    # 0.6f

    .line 230
    .line 231
    .line 232
    const v18, -0x409eb852    # -0.88f

    .line 233
    .line 234
    .line 235
    const v13, 0x3eb851ec    # 0.36f

    .line 236
    .line 237
    .line 238
    const v14, -0x41f0a3d7    # -0.14f

    .line 239
    .line 240
    .line 241
    const v15, 0x3f19999a    # 0.6f

    .line 242
    .line 243
    .line 244
    const v16, -0x41051eb8    # -0.49f

    .line 245
    .line 246
    .line 247
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v17, -0x40547ae1    # -1.34f

    .line 251
    .line 252
    .line 253
    const/4 v13, 0x0

    .line 254
    const v14, -0x40cf5c29    # -0.69f

    .line 255
    .line 256
    .line 257
    const v15, -0x40ca3d71    # -0.71f

    .line 258
    .line 259
    .line 260
    const v16, -0x406ccccd    # -1.15f

    .line 261
    .line 262
    .line 263
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v0, -0x3ef07ae1    # -8.97f

    .line 267
    .line 268
    .line 269
    const v2, 0x407851ec    # 3.88f

    .line 270
    .line 271
    .line 272
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v17, -0x40cf5c29    # -0.69f

    .line 276
    .line 277
    .line 278
    const v18, 0x3f851eb8    # 1.04f

    .line 279
    .line 280
    .line 281
    const v13, -0x4128f5c3    # -0.42f

    .line 282
    .line 283
    .line 284
    const v14, 0x3e2e147b    # 0.17f

    .line 285
    .line 286
    .line 287
    const v15, -0x40cf5c29    # -0.69f

    .line 288
    .line 289
    .line 290
    const v16, 0x3f147ae1    # 0.58f

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v17, 0x3f30a3d7    # 0.69f

    .line 297
    .line 298
    .line 299
    const v18, 0x3f866666    # 1.05f

    .line 300
    .line 301
    .line 302
    const/4 v13, 0x0

    .line 303
    const v14, 0x3eeb851f    # 0.46f

    .line 304
    .line 305
    .line 306
    const v15, 0x3e8a3d71    # 0.27f

    .line 307
    .line 308
    .line 309
    const v16, 0x3f5eb852    # 0.87f

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v0, 0x410f851f    # 8.97f

    .line 316
    .line 317
    .line 318
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v17, 0x3fab851f    # 1.34f

    .line 322
    .line 323
    .line 324
    const v18, -0x409c28f6    # -0.89f

    .line 325
    .line 326
    .line 327
    const v13, 0x3f2147ae    # 0.63f

    .line 328
    .line 329
    .line 330
    const v14, 0x3e8a3d71    # 0.27f

    .line 331
    .line 332
    .line 333
    const v15, 0x3fab851f    # 1.34f

    .line 334
    .line 335
    .line 336
    const v16, -0x41b33333    # -0.2f

    .line 337
    .line 338
    .line 339
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v17, -0x40e66666    # -0.6f

    .line 343
    .line 344
    .line 345
    const/4 v13, 0x0

    .line 346
    const v14, -0x413851ec    # -0.39f

    .line 347
    .line 348
    .line 349
    const v15, -0x418a3d71    # -0.24f

    .line 350
    .line 351
    .line 352
    const v16, -0x40c28f5c    # -0.74f

    .line 353
    .line 354
    .line 355
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v0, -0x40333333    # -1.6f

    .line 359
    .line 360
    .line 361
    const v2, -0x40d9999a    # -0.65f

    .line 362
    .line 363
    .line 364
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v0, 0x41500000    # 13.0f

    .line 371
    .line 372
    const v2, 0x409f5c29    # 4.98f

    .line 373
    .line 374
    .line 375
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v0, 0x41200000    # 10.0f

    .line 379
    .line 380
    const v2, 0x4132147b    # 11.13f

    .line 381
    .line 382
    .line 383
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v0, 0x406f5c29    # 3.74f

    .line 387
    .line 388
    .line 389
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const/high16 v0, 0x41500000    # 13.0f

    .line 393
    .line 394
    const v2, 0x409f5c29    # 4.98f

    .line 395
    .line 396
    .line 397
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 404
    .line 405
    .line 406
    move-result-object v2

    .line 407
    const/16 v16, 0x3800

    .line 408
    .line 409
    const/16 v17, 0x0

    .line 410
    .line 411
    const/high16 v6, 0x3f800000    # 1.0f

    .line 412
    .line 413
    const/high16 v8, 0x3f800000    # 1.0f

    .line 414
    .line 415
    const/4 v7, 0x0

    .line 416
    const/high16 v9, 0x3f800000    # 1.0f

    .line 417
    .line 418
    const/high16 v12, 0x3f800000    # 1.0f

    .line 419
    .line 420
    const/4 v14, 0x0

    .line 421
    const/4 v15, 0x0

    .line 422
    const-string v4, ""

    .line 423
    .line 424
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    sput-object v0, Landroidx/compose/material/icons/rounded/TextRotateUpKt;->_textRotateUp:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 433
    .line 434
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 435
    .line 436
    .line 437
    return-object v0
.end method
