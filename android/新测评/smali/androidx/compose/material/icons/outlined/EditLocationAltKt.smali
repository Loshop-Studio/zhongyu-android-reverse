.class public final Landroidx/compose/material/icons/outlined/EditLocationAltKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_editLocationAlt",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "EditLocationAlt",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getEditLocationAlt",
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
        "SMAP\nEditLocationAlt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditLocationAlt.kt\nandroidx/compose/material/icons/outlined/EditLocationAltKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,66:1\n212#2,12:67\n233#2,18:80\n253#2:117\n174#3:79\n705#4,2:98\n717#4,2:100\n719#4,11:106\n72#5,4:102\n*S KotlinDebug\n*F\n+ 1 EditLocationAlt.kt\nandroidx/compose/material/icons/outlined/EditLocationAltKt\n*L\n29#1:67,12\n30#1:80,18\n30#1:117\n29#1:79\n30#1:98,2\n30#1:100,2\n30#1:106,11\n30#1:102,4\n*E\n"
    }
.end annotation


# static fields
.field private static _editLocationAlt:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getEditLocationAlt(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/EditLocationAltKt;->_editLocationAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.EditLocationAlt"

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
    const/high16 v0, 0x41300000    # 11.0f

    .line 71
    .line 72
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 73
    .line 74
    .line 75
    const v0, 0x4007ae14    # 2.12f

    .line 76
    .line 77
    .line 78
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 79
    .line 80
    .line 81
    const v0, 0x40c51eb8    # 6.16f

    .line 82
    .line 83
    .line 84
    const v2, -0x3f3ae148    # -6.16f

    .line 85
    .line 86
    .line 87
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    .line 90
    const v0, -0x3ff851ec    # -2.12f

    .line 91
    .line 92
    .line 93
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v0, 0x410e147b    # 8.88f

    .line 97
    .line 98
    .line 99
    const/high16 v2, 0x41300000    # 11.0f

    .line 100
    .line 101
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v0, 0x41300000    # 11.0f

    .line 105
    .line 106
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v0, 0x41a5ae14    # 20.71f

    .line 113
    .line 114
    .line 115
    const/high16 v2, 0x40000000    # 2.0f

    .line 116
    .line 117
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v0, 0x41a00000    # 20.0f

    .line 121
    .line 122
    const v2, 0x3fa51eb8    # 1.29f

    .line 123
    .line 124
    .line 125
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v17, -0x404b851f    # -1.41f

    .line 129
    .line 130
    .line 131
    const/16 v18, 0x0

    .line 132
    .line 133
    const v13, -0x413851ec    # -0.39f

    .line 134
    .line 135
    .line 136
    const v14, -0x413851ec    # -0.39f

    .line 137
    .line 138
    .line 139
    const v15, -0x407d70a4    # -1.02f

    .line 140
    .line 141
    .line 142
    const v16, -0x413851ec    # -0.39f

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v0, 0x3f3851ec    # 0.72f

    .line 149
    .line 150
    .line 151
    const v2, -0x40c7ae14    # -0.72f

    .line 152
    .line 153
    .line 154
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v0, 0x4007ae14    # 2.12f

    .line 158
    .line 159
    .line 160
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v0, 0x3f3851ec    # 0.72f

    .line 164
    .line 165
    .line 166
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v17, 0x41a5ae14    # 20.71f

    .line 170
    .line 171
    .line 172
    const/high16 v18, 0x40000000    # 2.0f

    .line 173
    .line 174
    const v13, 0x41a8cccd    # 21.1f

    .line 175
    .line 176
    .line 177
    const v14, 0x404147ae    # 3.02f

    .line 178
    .line 179
    .line 180
    const v15, 0x41a8cccd    # 21.1f

    .line 181
    .line 182
    .line 183
    const v16, 0x4018f5c3    # 2.39f

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v0, 0x4110cccd    # 9.05f

    .line 193
    .line 194
    .line 195
    const v2, 0x418f3333    # 17.9f

    .line 196
    .line 197
    .line 198
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v17, 0x41900000    # 18.0f

    .line 202
    .line 203
    const v18, 0x41233333    # 10.2f

    .line 204
    .line 205
    .line 206
    const v13, 0x418fae14    # 17.96f

    .line 207
    .line 208
    .line 209
    const v14, 0x41168f5c    # 9.41f

    .line 210
    .line 211
    .line 212
    const/high16 v15, 0x41900000    # 18.0f

    .line 213
    .line 214
    const v16, 0x411ca3d7    # 9.79f

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v17, -0x3f400000    # -6.0f

    .line 221
    .line 222
    const v18, 0x41123d71    # 9.14f

    .line 223
    .line 224
    .line 225
    const/4 v13, 0x0

    .line 226
    const v14, 0x3fdae148    # 1.71f

    .line 227
    .line 228
    .line 229
    const v15, -0x4075c28f    # -1.08f

    .line 230
    .line 231
    .line 232
    const v16, 0x40947ae1    # 4.64f

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v18, -0x3eedc28f    # -9.14f

    .line 239
    .line 240
    .line 241
    const v13, -0x3f628f5c    # -4.92f

    .line 242
    .line 243
    .line 244
    const v14, -0x3f7051ec    # -4.49f

    .line 245
    .line 246
    .line 247
    const/high16 v15, -0x3f400000    # -6.0f

    .line 248
    .line 249
    const v16, -0x3f123d71    # -7.43f

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v17, 0x41400000    # 12.0f

    .line 256
    .line 257
    const/high16 v18, 0x40800000    # 4.0f

    .line 258
    .line 259
    const/high16 v13, 0x40c00000    # 6.0f

    .line 260
    .line 261
    const v14, 0x40c570a4    # 6.17f

    .line 262
    .line 263
    .line 264
    const v15, 0x411170a4    # 9.09f

    .line 265
    .line 266
    .line 267
    const/high16 v16, 0x40800000    # 4.0f

    .line 268
    .line 269
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v17, 0x3f7851ec    # 0.97f

    .line 273
    .line 274
    .line 275
    const v18, 0x3da3d70a    # 0.08f

    .line 276
    .line 277
    .line 278
    const v13, 0x3ea3d70a    # 0.32f

    .line 279
    .line 280
    .line 281
    const/4 v14, 0x0

    .line 282
    const v15, 0x3f266666    # 0.65f

    .line 283
    .line 284
    .line 285
    const v16, 0x3cf5c28f    # 0.03f

    .line 286
    .line 287
    .line 288
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v0, 0x3fd33333    # 1.65f

    .line 292
    .line 293
    .line 294
    const v2, -0x402ccccd    # -1.65f

    .line 295
    .line 296
    .line 297
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v17, 0x41400000    # 12.0f

    .line 301
    .line 302
    const/high16 v18, 0x40000000    # 2.0f

    .line 303
    .line 304
    const v13, 0x415c7ae1    # 13.78f

    .line 305
    .line 306
    .line 307
    const v14, 0x400a3d71    # 2.16f

    .line 308
    .line 309
    .line 310
    const v15, 0x414e6666    # 12.9f

    .line 311
    .line 312
    .line 313
    const/high16 v16, 0x40000000    # 2.0f

    .line 314
    .line 315
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const/high16 v17, -0x3f000000    # -8.0f

    .line 319
    .line 320
    const v18, 0x41033333    # 8.2f

    .line 321
    .line 322
    .line 323
    const v13, -0x3f79999a    # -4.2f

    .line 324
    .line 325
    .line 326
    const/4 v14, 0x0

    .line 327
    const/high16 v15, -0x3f000000    # -8.0f

    .line 328
    .line 329
    const v16, 0x404e147b    # 3.22f

    .line 330
    .line 331
    .line 332
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v17, 0x41000000    # 8.0f

    .line 336
    .line 337
    const v18, 0x413ccccd    # 11.8f

    .line 338
    .line 339
    .line 340
    const/4 v13, 0x0

    .line 341
    const v14, 0x40547ae1    # 3.32f

    .line 342
    .line 343
    .line 344
    const v15, 0x402ae148    # 2.67f

    .line 345
    .line 346
    .line 347
    const/high16 v16, 0x40e80000    # 7.25f

    .line 348
    .line 349
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const v18, -0x3ec33333    # -11.8f

    .line 353
    .line 354
    .line 355
    const v13, 0x40aa8f5c    # 5.33f

    .line 356
    .line 357
    .line 358
    const v14, -0x3f6e6666    # -4.55f

    .line 359
    .line 360
    .line 361
    const/high16 v15, 0x41000000    # 8.0f

    .line 362
    .line 363
    const v16, -0x3ef851ec    # -8.48f

    .line 364
    .line 365
    .line 366
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v17, -0x4119999a    # -0.45f

    .line 370
    .line 371
    .line 372
    const v18, -0x3fcccccd    # -2.8f

    .line 373
    .line 374
    .line 375
    const/4 v13, 0x0

    .line 376
    const v14, -0x407eb852    # -1.01f

    .line 377
    .line 378
    .line 379
    const v15, -0x41dc28f6    # -0.16f

    .line 380
    .line 381
    .line 382
    const v16, -0x4007ae14    # -1.94f

    .line 383
    .line 384
    .line 385
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v0, 0x4110cccd    # 9.05f

    .line 389
    .line 390
    .line 391
    const v2, 0x418f3333    # 17.9f

    .line 392
    .line 393
    .line 394
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 401
    .line 402
    .line 403
    move-result-object v2

    .line 404
    const/16 v16, 0x3800

    .line 405
    .line 406
    const/16 v17, 0x0

    .line 407
    .line 408
    const/high16 v6, 0x3f800000    # 1.0f

    .line 409
    .line 410
    const/high16 v8, 0x3f800000    # 1.0f

    .line 411
    .line 412
    const/4 v7, 0x0

    .line 413
    const/high16 v9, 0x3f800000    # 1.0f

    .line 414
    .line 415
    const/high16 v12, 0x3f800000    # 1.0f

    .line 416
    .line 417
    const/4 v14, 0x0

    .line 418
    const/4 v15, 0x0

    .line 419
    const-string v4, ""

    .line 420
    .line 421
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    sput-object v0, Landroidx/compose/material/icons/outlined/EditLocationAltKt;->_editLocationAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 430
    .line 431
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 432
    .line 433
    .line 434
    return-object v0
.end method
