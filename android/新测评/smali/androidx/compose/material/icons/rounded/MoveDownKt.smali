.class public final Landroidx/compose/material/icons/rounded/MoveDownKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_moveDown",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "MoveDown",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getMoveDown",
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
        "SMAP\nMoveDown.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MoveDown.kt\nandroidx/compose/material/icons/rounded/MoveDownKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,90:1\n212#2,12:91\n233#2,18:104\n253#2:141\n233#2,18:142\n253#2:179\n233#2,18:180\n253#2:217\n174#3:103\n705#4,2:122\n717#4,2:124\n719#4,11:130\n705#4,2:160\n717#4,2:162\n719#4,11:168\n705#4,2:198\n717#4,2:200\n719#4,11:206\n72#5,4:126\n72#5,4:164\n72#5,4:202\n*S KotlinDebug\n*F\n+ 1 MoveDown.kt\nandroidx/compose/material/icons/rounded/MoveDownKt\n*L\n29#1:91,12\n30#1:104,18\n30#1:141\n55#1:142,18\n55#1:179\n73#1:180,18\n73#1:217\n29#1:103\n30#1:122,2\n30#1:124,2\n30#1:130,11\n55#1:160,2\n55#1:162,2\n55#1:168,11\n73#1:198,2\n73#1:200,2\n73#1:206,11\n30#1:126,4\n55#1:164,4\n73#1:202,4\n*E\n"
    }
.end annotation


# static fields
.field private static _moveDown:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMoveDown(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/MoveDownKt;->_moveDown:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.MoveDown"

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
    const v4, 0x4040a3d7    # 3.01f

    .line 71
    .line 72
    .line 73
    const v6, 0x412b851f    # 10.72f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, 0x40823d71    # 4.07f

    .line 80
    .line 81
    .line 82
    const v26, 0x40a5c28f    # 5.18f

    .line 83
    .line 84
    .line 85
    const v21, -0x41f0a3d7    # -0.14f

    .line 86
    .line 87
    .line 88
    const v22, 0x40247ae1    # 2.57f

    .line 89
    .line 90
    .line 91
    const v23, 0x3fd47ae1    # 1.66f

    .line 92
    .line 93
    .line 94
    const v24, 0x40975c29    # 4.73f

    .line 95
    .line 96
    .line 97
    move-object/from16 v20, v2

    .line 98
    .line 99
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v4, -0x40b5c28f    # -0.79f

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const/16 v25, 0x0

    .line 109
    .line 110
    const v26, -0x404b851f    # -1.41f

    .line 111
    .line 112
    .line 113
    const v21, -0x413851ec    # -0.39f

    .line 114
    .line 115
    .line 116
    const v22, -0x413851ec    # -0.39f

    .line 117
    .line 118
    .line 119
    const v23, -0x413851ec    # -0.39f

    .line 120
    .line 121
    .line 122
    const v24, -0x407d70a4    # -1.02f

    .line 123
    .line 124
    .line 125
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/4 v4, 0x0

    .line 129
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v25, 0x3fb47ae1    # 1.41f

    .line 133
    .line 134
    .line 135
    const/16 v26, 0x0

    .line 136
    .line 137
    const v21, 0x3ec7ae14    # 0.39f

    .line 138
    .line 139
    .line 140
    const v23, 0x3f828f5c    # 1.02f

    .line 141
    .line 142
    .line 143
    const v24, -0x413851ec    # -0.39f

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v4, 0x4025c28f    # 2.59f

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const/16 v25, 0x0

    .line 156
    .line 157
    const v26, 0x3fb47ae1    # 1.41f

    .line 158
    .line 159
    .line 160
    const v22, 0x3ec7ae14    # 0.39f

    .line 161
    .line 162
    .line 163
    const v23, 0x3ec7ae14    # 0.39f

    .line 164
    .line 165
    .line 166
    const v24, 0x3f828f5c    # 1.02f

    .line 167
    .line 168
    .line 169
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v4, 0x40f6b852    # 7.71f

    .line 173
    .line 174
    .line 175
    const v6, 0x41a26666    # 20.3f

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v25, -0x404b851f    # -1.41f

    .line 182
    .line 183
    .line 184
    const/16 v26, 0x0

    .line 185
    .line 186
    const v21, -0x413851ec    # -0.39f

    .line 187
    .line 188
    .line 189
    const v23, -0x407d70a4    # -1.02f

    .line 190
    .line 191
    .line 192
    const v24, 0x3ec7ae14    # 0.39f

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/4 v4, 0x0

    .line 199
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/16 v25, 0x0

    .line 203
    .line 204
    const v26, -0x404b851f    # -1.41f

    .line 205
    .line 206
    .line 207
    const v22, -0x413851ec    # -0.39f

    .line 208
    .line 209
    .line 210
    const v23, -0x413851ec    # -0.39f

    .line 211
    .line 212
    .line 213
    const v24, -0x407d70a4    # -1.02f

    .line 214
    .line 215
    .line 216
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v4, 0x3f6147ae    # 0.88f

    .line 220
    .line 221
    .line 222
    const v6, -0x409eb852    # -0.88f

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v4, -0x428a3d71    # -0.06f

    .line 229
    .line 230
    .line 231
    const/4 v6, 0x0

    .line 232
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v25, -0x3f3b3333    # -6.15f

    .line 236
    .line 237
    .line 238
    const v26, -0x3f10f5c3    # -7.47f

    .line 239
    .line 240
    .line 241
    const v21, -0x3f970a3d    # -3.64f

    .line 242
    .line 243
    .line 244
    const v22, -0x4123d70a    # -0.43f

    .line 245
    .line 246
    .line 247
    const v23, -0x3f323d71    # -6.43f

    .line 248
    .line 249
    .line 250
    const v24, -0x3f966666    # -3.65f

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v25, 0x410428f6    # 8.26f

    .line 257
    .line 258
    .line 259
    const/high16 v26, 0x40800000    # 4.0f

    .line 260
    .line 261
    const v21, 0x3fa51eb8    # 1.29f

    .line 262
    .line 263
    .line 264
    const v22, 0x40d8f5c3    # 6.78f

    .line 265
    .line 266
    .line 267
    const v23, 0x4091999a    # 4.55f

    .line 268
    .line 269
    .line 270
    const/high16 v24, 0x40800000    # 4.0f

    .line 271
    .line 272
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v4, 0x41200000    # 10.0f

    .line 276
    .line 277
    const/high16 v6, 0x40800000    # 4.0f

    .line 278
    .line 279
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v25, 0x3f800000    # 1.0f

    .line 283
    .line 284
    const/high16 v26, 0x3f800000    # 1.0f

    .line 285
    .line 286
    const v21, 0x3f0ccccd    # 0.55f

    .line 287
    .line 288
    .line 289
    const/16 v22, 0x0

    .line 290
    .line 291
    const/high16 v23, 0x3f800000    # 1.0f

    .line 292
    .line 293
    const v24, 0x3ee66666    # 0.45f

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const/4 v4, 0x0

    .line 300
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v25, -0x40800000    # -1.0f

    .line 304
    .line 305
    const/16 v21, 0x0

    .line 306
    .line 307
    const v22, 0x3f0ccccd    # 0.55f

    .line 308
    .line 309
    .line 310
    const v23, -0x4119999a    # -0.45f

    .line 311
    .line 312
    .line 313
    const/high16 v24, 0x3f800000    # 1.0f

    .line 314
    .line 315
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v4, 0x4103851f    # 8.22f

    .line 319
    .line 320
    .line 321
    const/high16 v6, 0x40c00000    # 6.0f

    .line 322
    .line 323
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v25, 0x4040a3d7    # 3.01f

    .line 327
    .line 328
    .line 329
    const v26, 0x412b851f    # 10.72f

    .line 330
    .line 331
    .line 332
    const v21, 0x40b0a3d7    # 5.52f

    .line 333
    .line 334
    .line 335
    const/high16 v22, 0x40c00000    # 6.0f

    .line 336
    .line 337
    const v23, 0x4049999a    # 3.15f

    .line 338
    .line 339
    .line 340
    const v24, 0x4100a3d7    # 8.04f

    .line 341
    .line 342
    .line 343
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    const/16 v16, 0x3800

    .line 354
    .line 355
    const/16 v17, 0x0

    .line 356
    .line 357
    const/high16 v6, 0x3f800000    # 1.0f

    .line 358
    .line 359
    const/high16 v8, 0x3f800000    # 1.0f

    .line 360
    .line 361
    const/4 v7, 0x0

    .line 362
    const/high16 v9, 0x3f800000    # 1.0f

    .line 363
    .line 364
    const/high16 v12, 0x3f800000    # 1.0f

    .line 365
    .line 366
    const/4 v13, 0x0

    .line 367
    const/4 v14, 0x0

    .line 368
    const/4 v15, 0x0

    .line 369
    const-string v4, ""

    .line 370
    .line 371
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 372
    .line 373
    .line 374
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 375
    .line 376
    .line 377
    move-result v3

    .line 378
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 379
    .line 380
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 381
    .line 382
    .line 383
    move-result-wide v6

    .line 384
    const/4 v2, 0x0

    .line 385
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 389
    .line 390
    .line 391
    move-result v10

    .line 392
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 393
    .line 394
    .line 395
    move-result v11

    .line 396
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 399
    .line 400
    .line 401
    const/high16 v4, 0x41700000    # 15.0f

    .line 402
    .line 403
    const/high16 v6, 0x41300000    # 11.0f

    .line 404
    .line 405
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v4, 0x40a00000    # 5.0f

    .line 409
    .line 410
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v25, 0x40000000    # 2.0f

    .line 414
    .line 415
    const/high16 v26, -0x40000000    # -2.0f

    .line 416
    .line 417
    const v21, 0x3f8ccccd    # 1.1f

    .line 418
    .line 419
    .line 420
    const/16 v22, 0x0

    .line 421
    .line 422
    const/high16 v23, 0x40000000    # 2.0f

    .line 423
    .line 424
    const v24, -0x4099999a    # -0.9f

    .line 425
    .line 426
    .line 427
    move-object/from16 v20, v2

    .line 428
    .line 429
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v4, 0x40c00000    # 6.0f

    .line 433
    .line 434
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/high16 v25, -0x40000000    # -2.0f

    .line 438
    .line 439
    const/16 v21, 0x0

    .line 440
    .line 441
    const v22, -0x40733333    # -1.1f

    .line 442
    .line 443
    .line 444
    const v23, -0x4099999a    # -0.9f

    .line 445
    .line 446
    .line 447
    const/high16 v24, -0x40000000    # -2.0f

    .line 448
    .line 449
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const/high16 v4, -0x3f600000    # -5.0f

    .line 453
    .line 454
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v26, 0x40000000    # 2.0f

    .line 458
    .line 459
    const v21, -0x40733333    # -1.1f

    .line 460
    .line 461
    .line 462
    const/16 v22, 0x0

    .line 463
    .line 464
    const/high16 v23, -0x40000000    # -2.0f

    .line 465
    .line 466
    const v24, 0x3f666666    # 0.9f

    .line 467
    .line 468
    .line 469
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const/high16 v4, 0x40400000    # 3.0f

    .line 473
    .line 474
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const/high16 v25, 0x41700000    # 15.0f

    .line 478
    .line 479
    const/high16 v26, 0x41300000    # 11.0f

    .line 480
    .line 481
    const/high16 v21, 0x41500000    # 13.0f

    .line 482
    .line 483
    const v22, 0x4121999a    # 10.1f

    .line 484
    .line 485
    .line 486
    const v23, 0x415e6666    # 13.9f

    .line 487
    .line 488
    .line 489
    const/high16 v24, 0x41300000    # 11.0f

    .line 490
    .line 491
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const/high16 v4, 0x41100000    # 9.0f

    .line 498
    .line 499
    const/high16 v6, 0x41a00000    # 20.0f

    .line 500
    .line 501
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const/high16 v4, -0x3f600000    # -5.0f

    .line 505
    .line 506
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const/high16 v4, 0x40c00000    # 6.0f

    .line 510
    .line 511
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const/high16 v4, 0x40a00000    # 5.0f

    .line 515
    .line 516
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/high16 v4, 0x41100000    # 9.0f

    .line 520
    .line 521
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 528
    .line 529
    .line 530
    move-result-object v2

    .line 531
    const/high16 v6, 0x3f800000    # 1.0f

    .line 532
    .line 533
    const/4 v7, 0x0

    .line 534
    const-string v4, ""

    .line 535
    .line 536
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 537
    .line 538
    .line 539
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 540
    .line 541
    .line 542
    move-result v3

    .line 543
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 544
    .line 545
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 546
    .line 547
    .line 548
    move-result-wide v6

    .line 549
    const/4 v0, 0x0

    .line 550
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 551
    .line 552
    .line 553
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 554
    .line 555
    .line 556
    move-result v10

    .line 557
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 558
    .line 559
    .line 560
    move-result v11

    .line 561
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 564
    .line 565
    .line 566
    const/high16 v0, 0x41a00000    # 20.0f

    .line 567
    .line 568
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const/high16 v0, -0x3f600000    # -5.0f

    .line 572
    .line 573
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const/high16 v17, -0x40000000    # -2.0f

    .line 577
    .line 578
    const/high16 v18, -0x40000000    # -2.0f

    .line 579
    .line 580
    const v13, -0x40733333    # -1.1f

    .line 581
    .line 582
    .line 583
    const/high16 v15, -0x40000000    # -2.0f

    .line 584
    .line 585
    const v16, -0x4099999a    # -0.9f

    .line 586
    .line 587
    .line 588
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 592
    .line 593
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const/high16 v17, 0x40000000    # 2.0f

    .line 597
    .line 598
    const/4 v13, 0x0

    .line 599
    const v14, -0x40733333    # -1.1f

    .line 600
    .line 601
    .line 602
    const v15, 0x3f666666    # 0.9f

    .line 603
    .line 604
    .line 605
    const/high16 v16, -0x40000000    # -2.0f

    .line 606
    .line 607
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const/high16 v0, 0x40a00000    # 5.0f

    .line 611
    .line 612
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const/high16 v18, 0x40000000    # 2.0f

    .line 616
    .line 617
    const v13, 0x3f8ccccd    # 1.1f

    .line 618
    .line 619
    .line 620
    const/4 v14, 0x0

    .line 621
    const/high16 v15, 0x40000000    # 2.0f

    .line 622
    .line 623
    const v16, 0x3f666666    # 0.9f

    .line 624
    .line 625
    .line 626
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const/high16 v0, 0x40400000    # 3.0f

    .line 630
    .line 631
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const/high16 v17, 0x41a00000    # 20.0f

    .line 635
    .line 636
    const/high16 v18, 0x41a00000    # 20.0f

    .line 637
    .line 638
    const/high16 v13, 0x41b00000    # 22.0f

    .line 639
    .line 640
    const v14, 0x4198cccd    # 19.1f

    .line 641
    .line 642
    .line 643
    const v15, 0x41a8cccd    # 21.1f

    .line 644
    .line 645
    .line 646
    const/high16 v16, 0x41a00000    # 20.0f

    .line 647
    .line 648
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 655
    .line 656
    .line 657
    move-result-object v2

    .line 658
    const/16 v16, 0x3800

    .line 659
    .line 660
    const/16 v17, 0x0

    .line 661
    .line 662
    const/high16 v6, 0x3f800000    # 1.0f

    .line 663
    .line 664
    const/4 v7, 0x0

    .line 665
    const/high16 v12, 0x3f800000    # 1.0f

    .line 666
    .line 667
    const/4 v13, 0x0

    .line 668
    const/4 v14, 0x0

    .line 669
    const/4 v15, 0x0

    .line 670
    const-string v4, ""

    .line 671
    .line 672
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 673
    .line 674
    .line 675
    move-result-object v0

    .line 676
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 677
    .line 678
    .line 679
    move-result-object v0

    .line 680
    sput-object v0, Landroidx/compose/material/icons/rounded/MoveDownKt;->_moveDown:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 681
    .line 682
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 683
    .line 684
    .line 685
    return-object v0
.end method
