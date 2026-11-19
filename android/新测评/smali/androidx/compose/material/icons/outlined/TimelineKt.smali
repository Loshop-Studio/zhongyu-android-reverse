.class public final Landroidx/compose/material/icons/outlined/TimelineKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_timeline",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Timeline",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getTimeline",
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
        "SMAP\nTimeline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timeline.kt\nandroidx/compose/material/icons/outlined/TimelineKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,67:1\n212#2,12:68\n233#2,18:81\n253#2:118\n174#3:80\n705#4,2:99\n717#4,2:101\n719#4,11:107\n72#5,4:103\n*S KotlinDebug\n*F\n+ 1 Timeline.kt\nandroidx/compose/material/icons/outlined/TimelineKt\n*L\n29#1:68,12\n30#1:81,18\n30#1:118\n29#1:80\n30#1:99,2\n30#1:101,2\n30#1:107,11\n30#1:103,4\n*E\n"
    }
.end annotation


# static fields
.field private static _timeline:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTimeline(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/TimelineKt;->_timeline:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Timeline"

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
    const/high16 v0, 0x41000000    # 8.0f

    .line 71
    .line 72
    const/high16 v2, 0x41b80000    # 23.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x40000000    # -2.0f

    .line 78
    .line 79
    const/high16 v18, 0x40000000    # 2.0f

    .line 80
    .line 81
    const/4 v13, 0x0

    .line 82
    const v14, 0x3f8ccccd    # 1.1f

    .line 83
    .line 84
    .line 85
    const v15, -0x4099999a    # -0.9f

    .line 86
    .line 87
    .line 88
    const/high16 v16, 0x40000000    # 2.0f

    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v17, -0x40fd70a4    # -0.51f

    .line 94
    .line 95
    .line 96
    const v18, -0x4270a3d7    # -0.07f

    .line 97
    .line 98
    .line 99
    const v13, -0x41c7ae14    # -0.18f

    .line 100
    .line 101
    .line 102
    const/4 v14, 0x0

    .line 103
    const v15, -0x414ccccd    # -0.35f

    .line 104
    .line 105
    .line 106
    const v16, -0x435c28f6    # -0.02f

    .line 107
    .line 108
    .line 109
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v0, 0x40633333    # 3.55f

    .line 113
    .line 114
    .line 115
    const v2, -0x3f9c28f6    # -3.56f

    .line 116
    .line 117
    .line 118
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v17, 0x41880000    # 17.0f

    .line 122
    .line 123
    const/high16 v18, 0x41600000    # 14.0f

    .line 124
    .line 125
    const v13, 0x4187d70a    # 16.98f

    .line 126
    .line 127
    .line 128
    const v14, 0x415a3d71    # 13.64f

    .line 129
    .line 130
    .line 131
    const/high16 v15, 0x41880000    # 17.0f

    .line 132
    .line 133
    const v16, 0x415d1eb8    # 13.82f

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v17, -0x40000000    # -2.0f

    .line 140
    .line 141
    const/high16 v18, 0x40000000    # 2.0f

    .line 142
    .line 143
    const/4 v13, 0x0

    .line 144
    const v14, 0x3f8ccccd    # 1.1f

    .line 145
    .line 146
    .line 147
    const v15, -0x4099999a    # -0.9f

    .line 148
    .line 149
    .line 150
    const/high16 v16, 0x40000000    # 2.0f

    .line 151
    .line 152
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v0, -0x4099999a    # -0.9f

    .line 156
    .line 157
    .line 158
    const/high16 v2, -0x40000000    # -2.0f

    .line 159
    .line 160
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v17, 0x3d8f5c29    # 0.07f

    .line 164
    .line 165
    .line 166
    const v18, -0x40fae148    # -0.52f

    .line 167
    .line 168
    .line 169
    const v14, -0x41c7ae14    # -0.18f

    .line 170
    .line 171
    .line 172
    const v15, 0x3ca3d70a    # 0.02f

    .line 173
    .line 174
    .line 175
    const v16, -0x4147ae14    # -0.36f

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v0, -0x3fdccccd    # -2.55f

    .line 182
    .line 183
    .line 184
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v17, 0x41200000    # 10.0f

    .line 188
    .line 189
    const/high16 v18, 0x41300000    # 11.0f

    .line 190
    .line 191
    const v13, 0x4125c28f    # 10.36f

    .line 192
    .line 193
    .line 194
    const v14, 0x412fae14    # 10.98f

    .line 195
    .line 196
    .line 197
    const v15, 0x4122e148    # 10.18f

    .line 198
    .line 199
    .line 200
    const/high16 v16, 0x41300000    # 11.0f

    .line 201
    .line 202
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v17, -0x40fae148    # -0.52f

    .line 206
    .line 207
    .line 208
    const v18, -0x4270a3d7    # -0.07f

    .line 209
    .line 210
    .line 211
    const v13, -0x41c7ae14    # -0.18f

    .line 212
    .line 213
    .line 214
    const/4 v14, 0x0

    .line 215
    const v15, -0x4147ae14    # -0.36f

    .line 216
    .line 217
    .line 218
    const v16, -0x435c28f6    # -0.02f

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v0, 0x4091eb85    # 4.56f

    .line 225
    .line 226
    .line 227
    const v2, -0x3f6e6666    # -4.55f

    .line 228
    .line 229
    .line 230
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v17, 0x40a00000    # 5.0f

    .line 234
    .line 235
    const/high16 v18, 0x41800000    # 16.0f

    .line 236
    .line 237
    const v13, 0x409f5c29    # 4.98f

    .line 238
    .line 239
    .line 240
    const v14, 0x417a6666    # 15.65f

    .line 241
    .line 242
    .line 243
    const/high16 v15, 0x40a00000    # 5.0f

    .line 244
    .line 245
    const v16, 0x417d1eb8    # 15.82f

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v17, -0x40000000    # -2.0f

    .line 252
    .line 253
    const/high16 v18, 0x40000000    # 2.0f

    .line 254
    .line 255
    const/4 v13, 0x0

    .line 256
    const v14, 0x3f8ccccd    # 1.1f

    .line 257
    .line 258
    .line 259
    const v15, -0x4099999a    # -0.9f

    .line 260
    .line 261
    .line 262
    const/high16 v16, 0x40000000    # 2.0f

    .line 263
    .line 264
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v0, -0x4099999a    # -0.9f

    .line 268
    .line 269
    .line 270
    const/high16 v2, -0x40000000    # -2.0f

    .line 271
    .line 272
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v0, 0x3f666666    # 0.9f

    .line 276
    .line 277
    .line 278
    const/high16 v2, 0x40000000    # 2.0f

    .line 279
    .line 280
    const/high16 v4, -0x40000000    # -2.0f

    .line 281
    .line 282
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v17, 0x3f028f5c    # 0.51f

    .line 286
    .line 287
    .line 288
    const v18, 0x3d8f5c29    # 0.07f

    .line 289
    .line 290
    .line 291
    const v13, 0x3e3851ec    # 0.18f

    .line 292
    .line 293
    .line 294
    const/4 v14, 0x0

    .line 295
    const v15, 0x3eb33333    # 0.35f

    .line 296
    .line 297
    .line 298
    const v16, 0x3ca3d70a    # 0.02f

    .line 299
    .line 300
    .line 301
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v0, 0x4091eb85    # 4.56f

    .line 305
    .line 306
    .line 307
    const v2, -0x3f6e6666    # -4.55f

    .line 308
    .line 309
    .line 310
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/high16 v17, 0x41000000    # 8.0f

    .line 314
    .line 315
    const/high16 v18, 0x41100000    # 9.0f

    .line 316
    .line 317
    const v13, 0x410051ec    # 8.02f

    .line 318
    .line 319
    .line 320
    const v14, 0x4115c28f    # 9.36f

    .line 321
    .line 322
    .line 323
    const/high16 v15, 0x41000000    # 8.0f

    .line 324
    .line 325
    const v16, 0x4112e148    # 9.18f

    .line 326
    .line 327
    .line 328
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v17, 0x40000000    # 2.0f

    .line 332
    .line 333
    const/high16 v18, -0x40000000    # -2.0f

    .line 334
    .line 335
    const/4 v13, 0x0

    .line 336
    const v14, -0x40733333    # -1.1f

    .line 337
    .line 338
    .line 339
    const v15, 0x3f666666    # 0.9f

    .line 340
    .line 341
    .line 342
    const/high16 v16, -0x40000000    # -2.0f

    .line 343
    .line 344
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v0, 0x3f666666    # 0.9f

    .line 348
    .line 349
    .line 350
    const/high16 v2, 0x40000000    # 2.0f

    .line 351
    .line 352
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v17, -0x4270a3d7    # -0.07f

    .line 356
    .line 357
    .line 358
    const v18, 0x3f051eb8    # 0.52f

    .line 359
    .line 360
    .line 361
    const v14, 0x3e3851ec    # 0.18f

    .line 362
    .line 363
    .line 364
    const v15, -0x435c28f6    # -0.02f

    .line 365
    .line 366
    .line 367
    const v16, 0x3eb851ec    # 0.36f

    .line 368
    .line 369
    .line 370
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v0, 0x40233333    # 2.55f

    .line 374
    .line 375
    .line 376
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const/high16 v17, 0x41700000    # 15.0f

    .line 380
    .line 381
    const/high16 v18, 0x41400000    # 12.0f

    .line 382
    .line 383
    const v13, 0x416a3d71    # 14.64f

    .line 384
    .line 385
    .line 386
    const v14, 0x414051ec    # 12.02f

    .line 387
    .line 388
    .line 389
    const v15, 0x416d1eb8    # 14.82f

    .line 390
    .line 391
    .line 392
    const/high16 v16, 0x41400000    # 12.0f

    .line 393
    .line 394
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v17, 0x3f051eb8    # 0.52f

    .line 398
    .line 399
    .line 400
    const v18, 0x3d8f5c29    # 0.07f

    .line 401
    .line 402
    .line 403
    const v13, 0x3e3851ec    # 0.18f

    .line 404
    .line 405
    .line 406
    const/4 v14, 0x0

    .line 407
    const v15, 0x3eb851ec    # 0.36f

    .line 408
    .line 409
    .line 410
    const v16, 0x3ca3d70a    # 0.02f

    .line 411
    .line 412
    .line 413
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const v0, 0x40633333    # 3.55f

    .line 417
    .line 418
    .line 419
    const v2, -0x3f9c28f6    # -3.56f

    .line 420
    .line 421
    .line 422
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const/high16 v17, 0x41980000    # 19.0f

    .line 426
    .line 427
    const/high16 v18, 0x41000000    # 8.0f

    .line 428
    .line 429
    const v13, 0x419828f6    # 19.02f

    .line 430
    .line 431
    .line 432
    const v14, 0x4105999a    # 8.35f

    .line 433
    .line 434
    .line 435
    const/high16 v15, 0x41980000    # 19.0f

    .line 436
    .line 437
    const v16, 0x4102e148    # 8.18f

    .line 438
    .line 439
    .line 440
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const/high16 v17, 0x40000000    # 2.0f

    .line 444
    .line 445
    const/high16 v18, -0x40000000    # -2.0f

    .line 446
    .line 447
    const/4 v13, 0x0

    .line 448
    const v14, -0x40733333    # -1.1f

    .line 449
    .line 450
    .line 451
    const v15, 0x3f666666    # 0.9f

    .line 452
    .line 453
    .line 454
    const/high16 v16, -0x40000000    # -2.0f

    .line 455
    .line 456
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v0, 0x40dccccd    # 6.9f

    .line 460
    .line 461
    .line 462
    const/high16 v2, 0x41000000    # 8.0f

    .line 463
    .line 464
    const/high16 v4, 0x41b80000    # 23.0f

    .line 465
    .line 466
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 473
    .line 474
    .line 475
    move-result-object v2

    .line 476
    const/16 v16, 0x3800

    .line 477
    .line 478
    const/16 v17, 0x0

    .line 479
    .line 480
    const/high16 v6, 0x3f800000    # 1.0f

    .line 481
    .line 482
    const/high16 v8, 0x3f800000    # 1.0f

    .line 483
    .line 484
    const/4 v7, 0x0

    .line 485
    const/high16 v9, 0x3f800000    # 1.0f

    .line 486
    .line 487
    const/high16 v12, 0x3f800000    # 1.0f

    .line 488
    .line 489
    const/4 v14, 0x0

    .line 490
    const/4 v15, 0x0

    .line 491
    const-string v4, ""

    .line 492
    .line 493
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    sput-object v0, Landroidx/compose/material/icons/outlined/TimelineKt;->_timeline:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 502
    .line 503
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 504
    .line 505
    .line 506
    return-object v0
.end method
