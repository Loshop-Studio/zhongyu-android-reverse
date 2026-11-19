.class public final Landroidx/compose/material/icons/outlined/WatchKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_watch",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Watch",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getWatch",
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
        "SMAP\nWatch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Watch.kt\nandroidx/compose/material/icons/outlined/WatchKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,67:1\n212#2,12:68\n233#2,18:81\n253#2:118\n174#3:80\n705#4,2:99\n717#4,2:101\n719#4,11:107\n72#5,4:103\n*S KotlinDebug\n*F\n+ 1 Watch.kt\nandroidx/compose/material/icons/outlined/WatchKt\n*L\n29#1:68,12\n30#1:81,18\n30#1:118\n29#1:80\n30#1:99,2\n30#1:101,2\n30#1:107,11\n30#1:103,4\n*E\n"
    }
.end annotation


# static fields
.field private static _watch:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWatch(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/WatchKt;->_watch:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Watch"

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
    const v2, 0x4164f5c3    # 14.31f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v0, 0x401eb852    # 2.48f

    .line 79
    .line 80
    .line 81
    const v2, 0x3ed1eb85    # 0.41f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v17, 0x41400000    # 12.0f

    .line 88
    .line 89
    const/high16 v18, 0x40800000    # 4.0f

    .line 90
    .line 91
    const v13, 0x415deb85    # 13.87f

    .line 92
    .line 93
    .line 94
    const v14, 0x408570a4    # 4.17f

    .line 95
    .line 96
    .line 97
    const v15, 0x414f5c29    # 12.96f

    .line 98
    .line 99
    .line 100
    const/high16 v16, 0x40800000    # 4.0f

    .line 101
    .line 102
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v17, -0x3fd28f5c    # -2.71f

    .line 106
    .line 107
    .line 108
    const v18, 0x3ef0a3d7    # 0.47f

    .line 109
    .line 110
    .line 111
    const v13, -0x408ccccd    # -0.95f

    .line 112
    .line 113
    .line 114
    const/4 v14, 0x0

    .line 115
    const v15, -0x4010a3d7    # -1.87f

    .line 116
    .line 117
    .line 118
    const v16, 0x3e2e147b    # 0.17f

    .line 119
    .line 120
    .line 121
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v0, 0x411b3333    # 9.7f

    .line 125
    .line 126
    .line 127
    const/high16 v2, 0x40000000    # 2.0f

    .line 128
    .line 129
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v0, 0x4093851f    # 4.61f

    .line 133
    .line 134
    .line 135
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v0, 0x418c28f6    # 17.52f

    .line 139
    .line 140
    .line 141
    const v2, 0x3ed1eb85    # 0.41f

    .line 142
    .line 143
    .line 144
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v0, 0x41b00000    # 22.0f

    .line 148
    .line 149
    const v2, 0x4164f5c3    # 14.31f

    .line 150
    .line 151
    .line 152
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v2, 0x411b3333    # 9.7f

    .line 156
    .line 157
    .line 158
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const v0, -0x412e147b    # -0.41f

    .line 162
    .line 163
    .line 164
    const v2, -0x3fe1eb85    # -2.47f

    .line 165
    .line 166
    .line 167
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v17, 0x402d70a4    # 2.71f

    .line 171
    .line 172
    .line 173
    const v13, 0x3f570a3d    # 0.84f

    .line 174
    .line 175
    .line 176
    const v14, 0x3e99999a    # 0.3f

    .line 177
    .line 178
    .line 179
    const v15, 0x3fe147ae    # 1.76f

    .line 180
    .line 181
    .line 182
    const v16, 0x3ef0a3d7    # 0.47f

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v17, 0x402e147b    # 2.72f

    .line 189
    .line 190
    .line 191
    const v18, -0x410a3d71    # -0.48f

    .line 192
    .line 193
    .line 194
    const v13, 0x3f75c28f    # 0.96f

    .line 195
    .line 196
    .line 197
    const/4 v14, 0x0

    .line 198
    const v15, 0x3fef5c29    # 1.87f

    .line 199
    .line 200
    .line 201
    const v16, -0x41d1eb85    # -0.17f

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v0, 0x41800000    # 16.0f

    .line 208
    .line 209
    const/4 v2, 0x0

    .line 210
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v0, 0x41000000    # 8.0f

    .line 214
    .line 215
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v0, -0x408ccccd    # -0.95f

    .line 219
    .line 220
    .line 221
    const v2, 0x40b75c29    # 5.73f

    .line 222
    .line 223
    .line 224
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const/high16 v17, 0x40800000    # 4.0f

    .line 228
    .line 229
    const/high16 v18, 0x41400000    # 12.0f

    .line 230
    .line 231
    const v13, 0x40a6147b    # 5.19f

    .line 232
    .line 233
    .line 234
    const v14, 0x40e6147b    # 7.19f

    .line 235
    .line 236
    .line 237
    const/high16 v15, 0x40800000    # 4.0f

    .line 238
    .line 239
    const v16, 0x41173333    # 9.45f

    .line 240
    .line 241
    .line 242
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const v0, 0x40433333    # 3.05f

    .line 246
    .line 247
    .line 248
    const v2, 0x40c8a3d7    # 6.27f

    .line 249
    .line 250
    .line 251
    const v4, 0x3f9851ec    # 1.19f

    .line 252
    .line 253
    .line 254
    const v6, 0x4099eb85    # 4.81f

    .line 255
    .line 256
    .line 257
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v0, 0x41000000    # 8.0f

    .line 261
    .line 262
    const/high16 v2, 0x41c00000    # 24.0f

    .line 263
    .line 264
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v0, 0x3f75c28f    # 0.96f

    .line 271
    .line 272
    .line 273
    const v2, -0x3f48a3d7    # -5.73f

    .line 274
    .line 275
    .line 276
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const/high16 v17, 0x41a00000    # 20.0f

    .line 280
    .line 281
    const v13, 0x41967ae1    # 18.81f

    .line 282
    .line 283
    .line 284
    const v14, 0x41867ae1    # 16.81f

    .line 285
    .line 286
    .line 287
    const/high16 v15, 0x41a00000    # 20.0f

    .line 288
    .line 289
    const v16, 0x4168a3d7    # 14.54f

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v0, -0x3fbd70a4    # -3.04f

    .line 296
    .line 297
    .line 298
    const v2, -0x3f375c29    # -6.27f

    .line 299
    .line 300
    .line 301
    const v4, -0x4067ae14    # -1.19f

    .line 302
    .line 303
    .line 304
    const v6, -0x3f66147b    # -4.81f

    .line 305
    .line 306
    .line 307
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v0, 0x41800000    # 16.0f

    .line 311
    .line 312
    const/4 v2, 0x0

    .line 313
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v0, 0x41400000    # 12.0f

    .line 320
    .line 321
    const/high16 v2, 0x41900000    # 18.0f

    .line 322
    .line 323
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v17, -0x3f400000    # -6.0f

    .line 327
    .line 328
    const/high16 v18, -0x3f400000    # -6.0f

    .line 329
    .line 330
    const v13, -0x3fac28f6    # -3.31f

    .line 331
    .line 332
    .line 333
    const/4 v14, 0x0

    .line 334
    const/high16 v15, -0x3f400000    # -6.0f

    .line 335
    .line 336
    const v16, -0x3fd3d70a    # -2.69f

    .line 337
    .line 338
    .line 339
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v0, 0x402c28f6    # 2.69f

    .line 343
    .line 344
    .line 345
    const/high16 v2, -0x3f400000    # -6.0f

    .line 346
    .line 347
    const/high16 v4, 0x40c00000    # 6.0f

    .line 348
    .line 349
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v2, 0x40c00000    # 6.0f

    .line 353
    .line 354
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v0, -0x3fd3d70a    # -2.69f

    .line 358
    .line 359
    .line 360
    const/high16 v2, -0x3f400000    # -6.0f

    .line 361
    .line 362
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 369
    .line 370
    .line 371
    move-result-object v2

    .line 372
    const/16 v16, 0x3800

    .line 373
    .line 374
    const/16 v17, 0x0

    .line 375
    .line 376
    const/high16 v6, 0x3f800000    # 1.0f

    .line 377
    .line 378
    const/high16 v8, 0x3f800000    # 1.0f

    .line 379
    .line 380
    const/4 v7, 0x0

    .line 381
    const/high16 v9, 0x3f800000    # 1.0f

    .line 382
    .line 383
    const/high16 v12, 0x3f800000    # 1.0f

    .line 384
    .line 385
    const/4 v13, 0x0

    .line 386
    const/4 v15, 0x0

    .line 387
    const-string v4, ""

    .line 388
    .line 389
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    sput-object v0, Landroidx/compose/material/icons/outlined/WatchKt;->_watch:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 398
    .line 399
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 400
    .line 401
    .line 402
    return-object v0
.end method
