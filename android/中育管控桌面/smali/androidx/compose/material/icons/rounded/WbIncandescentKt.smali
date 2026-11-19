.class public final Landroidx/compose/material/icons/rounded/WbIncandescentKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_wbIncandescent",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "WbIncandescent",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getWbIncandescent",
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
        "SMAP\nWbIncandescent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WbIncandescent.kt\nandroidx/compose/material/icons/rounded/WbIncandescentKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,95:1\n212#2,12:96\n233#2,18:109\n253#2:146\n174#3:108\n705#4,2:127\n717#4,2:129\n719#4,11:135\n72#5,4:131\n*S KotlinDebug\n*F\n+ 1 WbIncandescent.kt\nandroidx/compose/material/icons/rounded/WbIncandescentKt\n*L\n29#1:96,12\n30#1:109,18\n30#1:146\n29#1:108\n30#1:127,2\n30#1:129,2\n30#1:135,11\n30#1:131,4\n*E\n"
    }
.end annotation


# static fields
.field private static _wbIncandescent:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWbIncandescent(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/WbIncandescentKt;->_wbIncandescent:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.WbIncandescent"

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
    const/high16 v0, 0x40880000    # 4.25f

    .line 71
    .line 72
    const v2, 0x419e51ec    # 19.79f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v17, 0x3fb47ae1    # 1.41f

    .line 79
    .line 80
    .line 81
    const/16 v18, 0x0

    .line 82
    .line 83
    const v13, 0x3ec7ae14    # 0.39f

    .line 84
    .line 85
    .line 86
    const v14, 0x3ec7ae14    # 0.39f

    .line 87
    .line 88
    .line 89
    const v15, 0x3f828f5c    # 1.02f

    .line 90
    .line 91
    .line 92
    const v16, 0x3ec7ae14    # 0.39f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v0, -0x413851ec    # -0.39f

    .line 99
    .line 100
    .line 101
    const v2, 0x3ec7ae14    # 0.39f

    .line 102
    .line 103
    .line 104
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/16 v17, 0x0

    .line 108
    .line 109
    const v18, -0x404ccccd    # -1.4f

    .line 110
    .line 111
    .line 112
    const v14, -0x413851ec    # -0.39f

    .line 113
    .line 114
    .line 115
    const v15, 0x3ec28f5c    # 0.38f

    .line 116
    .line 117
    .line 118
    const v16, -0x407d70a4    # -1.02f

    .line 119
    .line 120
    .line 121
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v0, -0x43dc28f6    # -0.01f

    .line 125
    .line 126
    .line 127
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v17, -0x404b851f    # -1.41f

    .line 131
    .line 132
    .line 133
    const/16 v18, 0x0

    .line 134
    .line 135
    const v13, -0x413851ec    # -0.39f

    .line 136
    .line 137
    .line 138
    const v15, -0x407d70a4    # -1.02f

    .line 139
    .line 140
    .line 141
    const v16, -0x413851ec    # -0.39f

    .line 142
    .line 143
    .line 144
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v0, -0x413851ec    # -0.39f

    .line 148
    .line 149
    .line 150
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v17, 0x3c23d70a    # 0.01f

    .line 154
    .line 155
    .line 156
    const v18, 0x3fb47ae1    # 1.41f

    .line 157
    .line 158
    .line 159
    const v13, -0x413d70a4    # -0.38f

    .line 160
    .line 161
    .line 162
    const v14, 0x3ecccccd    # 0.4f

    .line 163
    .line 164
    .line 165
    const v15, -0x413d70a4    # -0.38f

    .line 166
    .line 167
    .line 168
    const v16, 0x3f828f5c    # 1.02f

    .line 169
    .line 170
    .line 171
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v0, 0x413fd70a    # 11.99f

    .line 178
    .line 179
    .line 180
    const/high16 v2, 0x41b80000    # 23.0f

    .line 181
    .line 182
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const/high16 v0, 0x41400000    # 12.0f

    .line 186
    .line 187
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v17, 0x3f7d70a4    # 0.99f

    .line 191
    .line 192
    .line 193
    const v18, -0x40828f5c    # -0.99f

    .line 194
    .line 195
    .line 196
    const v13, 0x3f0ccccd    # 0.55f

    .line 197
    .line 198
    .line 199
    const/4 v14, 0x0

    .line 200
    const v15, 0x3f7d70a4    # 0.99f

    .line 201
    .line 202
    .line 203
    const v16, -0x411eb852    # -0.44f

    .line 204
    .line 205
    .line 206
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v0, -0x408a3d71    # -0.96f

    .line 210
    .line 211
    .line 212
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v17, -0x40828f5c    # -0.99f

    .line 216
    .line 217
    .line 218
    const/4 v13, 0x0

    .line 219
    const v14, -0x40f33333    # -0.55f

    .line 220
    .line 221
    .line 222
    const v15, -0x411eb852    # -0.44f

    .line 223
    .line 224
    .line 225
    const v16, -0x40828f5c    # -0.99f

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v0, -0x43dc28f6    # -0.01f

    .line 232
    .line 233
    .line 234
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v18, 0x3f7d70a4    # 0.99f

    .line 238
    .line 239
    .line 240
    const v13, -0x40f33333    # -0.55f

    .line 241
    .line 242
    .line 243
    const/4 v14, 0x0

    .line 244
    const v15, -0x40828f5c    # -0.99f

    .line 245
    .line 246
    .line 247
    const v16, 0x3ee147ae    # 0.44f

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v0, 0x3f75c28f    # 0.96f

    .line 254
    .line 255
    .line 256
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v17, 0x3f7d70a4    # 0.99f

    .line 260
    .line 261
    .line 262
    const/4 v13, 0x0

    .line 263
    const v14, 0x3f0ccccd    # 0.55f

    .line 264
    .line 265
    .line 266
    const v15, 0x3ee147ae    # 0.44f

    .line 267
    .line 268
    .line 269
    const v16, 0x3f7d70a4    # 0.99f

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v0, 0x4040a3d7    # 3.01f

    .line 279
    .line 280
    .line 281
    const v2, 0x4130cccd    # 11.05f

    .line 282
    .line 283
    .line 284
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const v0, 0x3ffeb852    # 1.99f

    .line 288
    .line 289
    .line 290
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v17, -0x40828f5c    # -0.99f

    .line 294
    .line 295
    .line 296
    const v13, -0x40f33333    # -0.55f

    .line 297
    .line 298
    .line 299
    const/4 v14, 0x0

    .line 300
    const v15, -0x40828f5c    # -0.99f

    .line 301
    .line 302
    .line 303
    const v16, 0x3ee147ae    # 0.44f

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v0, 0x3c23d70a    # 0.01f

    .line 310
    .line 311
    .line 312
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v17, 0x3f7d70a4    # 0.99f

    .line 316
    .line 317
    .line 318
    const/4 v13, 0x0

    .line 319
    const v14, 0x3f0ccccd    # 0.55f

    .line 320
    .line 321
    .line 322
    const v15, 0x3ee147ae    # 0.44f

    .line 323
    .line 324
    .line 325
    const v16, 0x3f7d70a4    # 0.99f

    .line 326
    .line 327
    .line 328
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v0, 0x40400000    # 3.0f

    .line 332
    .line 333
    const v2, 0x4150a3d7    # 13.04f

    .line 334
    .line 335
    .line 336
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v18, -0x40828f5c    # -0.99f

    .line 340
    .line 341
    .line 342
    const v13, 0x3f0ccccd    # 0.55f

    .line 343
    .line 344
    .line 345
    const/4 v14, 0x0

    .line 346
    const v15, 0x3f7d70a4    # 0.99f

    .line 347
    .line 348
    .line 349
    const v16, -0x411eb852    # -0.44f

    .line 350
    .line 351
    .line 352
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v0, -0x43dc28f6    # -0.01f

    .line 356
    .line 357
    .line 358
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v17, -0x40851eb8    # -0.98f

    .line 362
    .line 363
    .line 364
    const v13, 0x3c23d70a    # 0.01f

    .line 365
    .line 366
    .line 367
    const v14, -0x40f33333    # -0.55f

    .line 368
    .line 369
    .line 370
    const v15, -0x4123d70a    # -0.43f

    .line 371
    .line 372
    .line 373
    const v16, -0x40828f5c    # -0.99f

    .line 374
    .line 375
    .line 376
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v0, 0x40db851f    # 6.86f

    .line 383
    .line 384
    .line 385
    const/high16 v2, 0x41700000    # 15.0f

    .line 386
    .line 387
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v0, 0x40433333    # 3.05f

    .line 391
    .line 392
    .line 393
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v17, -0x40800000    # -1.0f

    .line 397
    .line 398
    const/high16 v18, -0x40800000    # -1.0f

    .line 399
    .line 400
    const/4 v13, 0x0

    .line 401
    const v15, -0x4119999a    # -0.45f

    .line 402
    .line 403
    .line 404
    const/high16 v16, -0x40800000    # -1.0f

    .line 405
    .line 406
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const/high16 v0, -0x3f800000    # -4.0f

    .line 410
    .line 411
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const/high16 v18, 0x3f800000    # 1.0f

    .line 415
    .line 416
    const v13, -0x40f33333    # -0.55f

    .line 417
    .line 418
    .line 419
    const/4 v14, 0x0

    .line 420
    const/high16 v15, -0x40800000    # -1.0f

    .line 421
    .line 422
    const v16, 0x3ee66666    # 0.45f

    .line 423
    .line 424
    .line 425
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const v0, 0x4073d70a    # 3.81f

    .line 429
    .line 430
    .line 431
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const v17, -0x3fc47ae1    # -2.93f

    .line 435
    .line 436
    .line 437
    const v18, 0x40c428f6    # 6.13f

    .line 438
    .line 439
    .line 440
    const v13, -0x3ffd70a4    # -2.04f

    .line 441
    .line 442
    .line 443
    const v14, 0x3f970a3d    # 1.18f

    .line 444
    .line 445
    .line 446
    const v15, -0x3fab851f    # -3.32f

    .line 447
    .line 448
    .line 449
    const v16, 0x406147ae    # 3.52f

    .line 450
    .line 451
    .line 452
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const v17, 0x40a5c28f    # 5.18f

    .line 456
    .line 457
    .line 458
    const v18, 0x40a0a3d7    # 5.02f

    .line 459
    .line 460
    .line 461
    const v13, 0x3ecccccd    # 0.4f

    .line 462
    .line 463
    .line 464
    const v14, 0x40270a3d    # 2.61f

    .line 465
    .line 466
    .line 467
    const v15, 0x4023d70a    # 2.56f

    .line 468
    .line 469
    .line 470
    const v16, 0x40966666    # 4.7f

    .line 471
    .line 472
    .line 473
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v17, 0x40d80000    # 6.75f

    .line 477
    .line 478
    const v18, -0x3f41999a    # -5.95f

    .line 479
    .line 480
    .line 481
    const v13, 0x4068f5c3    # 3.64f

    .line 482
    .line 483
    .line 484
    const v14, 0x3ee147ae    # 0.44f

    .line 485
    .line 486
    .line 487
    const/high16 v15, 0x40d80000    # 6.75f

    .line 488
    .line 489
    const v16, -0x3fe66666    # -2.4f

    .line 490
    .line 491
    .line 492
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 496
    .line 497
    const v18, -0x3f59999a    # -5.2f

    .line 498
    .line 499
    .line 500
    const/4 v13, 0x0

    .line 501
    const v14, -0x3ff147ae    # -2.23f

    .line 502
    .line 503
    .line 504
    const v15, -0x40651eb8    # -1.21f

    .line 505
    .line 506
    .line 507
    const v16, -0x3f7ae148    # -4.16f

    .line 508
    .line 509
    .line 510
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const/high16 v0, 0x41a00000    # 20.0f

    .line 517
    .line 518
    const v2, 0x4140a3d7    # 12.04f

    .line 519
    .line 520
    .line 521
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const v0, 0x3c23d70a    # 0.01f

    .line 525
    .line 526
    .line 527
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const v17, 0x3f7d70a4    # 0.99f

    .line 531
    .line 532
    .line 533
    const v18, 0x3f7d70a4    # 0.99f

    .line 534
    .line 535
    .line 536
    const v14, 0x3f0ccccd    # 0.55f

    .line 537
    .line 538
    .line 539
    const v15, 0x3ee147ae    # 0.44f

    .line 540
    .line 541
    .line 542
    const v16, 0x3f7d70a4    # 0.99f

    .line 543
    .line 544
    .line 545
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const/high16 v0, 0x41b00000    # 22.0f

    .line 549
    .line 550
    const v2, 0x4150a3d7    # 13.04f

    .line 551
    .line 552
    .line 553
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const v18, -0x40828f5c    # -0.99f

    .line 557
    .line 558
    .line 559
    const v13, 0x3f0ccccd    # 0.55f

    .line 560
    .line 561
    .line 562
    const/4 v14, 0x0

    .line 563
    const v15, 0x3f7d70a4    # 0.99f

    .line 564
    .line 565
    .line 566
    const v16, -0x411eb852    # -0.44f

    .line 567
    .line 568
    .line 569
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const v0, -0x43dc28f6    # -0.01f

    .line 573
    .line 574
    .line 575
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const v17, -0x40828f5c    # -0.99f

    .line 579
    .line 580
    .line 581
    const/4 v13, 0x0

    .line 582
    const v14, -0x40f33333    # -0.55f

    .line 583
    .line 584
    .line 585
    const v15, -0x411eb852    # -0.44f

    .line 586
    .line 587
    .line 588
    const v16, -0x40828f5c    # -0.99f

    .line 589
    .line 590
    .line 591
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const v0, -0x407eb852    # -1.01f

    .line 595
    .line 596
    .line 597
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const v18, 0x3f7d70a4    # 0.99f

    .line 601
    .line 602
    .line 603
    const v13, -0x40f33333    # -0.55f

    .line 604
    .line 605
    .line 606
    const/4 v14, 0x0

    .line 607
    const v15, -0x40828f5c    # -0.99f

    .line 608
    .line 609
    .line 610
    const v16, 0x3ee147ae    # 0.44f

    .line 611
    .line 612
    .line 613
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const v0, 0x418f851f    # 17.94f

    .line 620
    .line 621
    .line 622
    const v2, 0x419b47ae    # 19.41f

    .line 623
    .line 624
    .line 625
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const v0, 0x3ec7ae14    # 0.39f

    .line 629
    .line 630
    .line 631
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const v17, 0x3fb47ae1    # 1.41f

    .line 635
    .line 636
    .line 637
    const/16 v18, 0x0

    .line 638
    .line 639
    const v13, 0x3ec7ae14    # 0.39f

    .line 640
    .line 641
    .line 642
    const v14, 0x3ec7ae14    # 0.39f

    .line 643
    .line 644
    .line 645
    const v15, 0x3f828f5c    # 1.02f

    .line 646
    .line 647
    .line 648
    const v16, 0x3ec7ae14    # 0.39f

    .line 649
    .line 650
    .line 651
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    const/16 v17, 0x0

    .line 655
    .line 656
    const v18, -0x404b851f    # -1.41f

    .line 657
    .line 658
    .line 659
    const v14, -0x413851ec    # -0.39f

    .line 660
    .line 661
    .line 662
    const v15, 0x3ec7ae14    # 0.39f

    .line 663
    .line 664
    .line 665
    const v16, -0x407d70a4    # -1.02f

    .line 666
    .line 667
    .line 668
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const v0, -0x413851ec    # -0.39f

    .line 672
    .line 673
    .line 674
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    const v17, -0x404ccccd    # -1.4f

    .line 678
    .line 679
    .line 680
    const/16 v18, 0x0

    .line 681
    .line 682
    const v13, -0x413851ec    # -0.39f

    .line 683
    .line 684
    .line 685
    const v15, -0x407d70a4    # -1.02f

    .line 686
    .line 687
    .line 688
    const v16, -0x413d70a4    # -0.38f

    .line 689
    .line 690
    .line 691
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 692
    .line 693
    .line 694
    const v17, -0x43dc28f6    # -0.01f

    .line 695
    .line 696
    .line 697
    const v18, 0x3fb47ae1    # 1.41f

    .line 698
    .line 699
    .line 700
    const v13, -0x41333333    # -0.4f

    .line 701
    .line 702
    .line 703
    const v14, 0x3ecccccd    # 0.4f

    .line 704
    .line 705
    .line 706
    const v15, -0x41333333    # -0.4f

    .line 707
    .line 708
    .line 709
    const v16, 0x3f828f5c    # 1.02f

    .line 710
    .line 711
    .line 712
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 713
    .line 714
    .line 715
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 716
    .line 717
    .line 718
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 719
    .line 720
    .line 721
    move-result-object v2

    .line 722
    const/16 v16, 0x3800

    .line 723
    .line 724
    const/16 v17, 0x0

    .line 725
    .line 726
    const/high16 v6, 0x3f800000    # 1.0f

    .line 727
    .line 728
    const/high16 v8, 0x3f800000    # 1.0f

    .line 729
    .line 730
    const/4 v7, 0x0

    .line 731
    const/high16 v9, 0x3f800000    # 1.0f

    .line 732
    .line 733
    const/high16 v12, 0x3f800000    # 1.0f

    .line 734
    .line 735
    const/4 v13, 0x0

    .line 736
    const/4 v14, 0x0

    .line 737
    const/4 v15, 0x0

    .line 738
    const-string v4, ""

    .line 739
    .line 740
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 741
    .line 742
    .line 743
    move-result-object v0

    .line 744
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 745
    .line 746
    .line 747
    move-result-object v0

    .line 748
    sput-object v0, Landroidx/compose/material/icons/rounded/WbIncandescentKt;->_wbIncandescent:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 749
    .line 750
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 751
    .line 752
    .line 753
    return-object v0
.end method
