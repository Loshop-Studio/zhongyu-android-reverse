.class public final Landroidx/compose/material/icons/twotone/CakeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_cake",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Cake",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getCake",
        "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nCake.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cake.kt\nandroidx/compose/material/icons/twotone/CakeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,113:1\n212#2,12:114\n233#2,18:127\n253#2:164\n233#2,18:165\n253#2:202\n174#3:126\n705#4,2:145\n717#4,2:147\n719#4,11:153\n705#4,2:183\n717#4,2:185\n719#4,11:191\n72#5,4:149\n72#5,4:187\n*S KotlinDebug\n*F\n+ 1 Cake.kt\nandroidx/compose/material/icons/twotone/CakeKt\n*L\n29#1:114,12\n30#1:127,18\n30#1:164\n58#1:165,18\n58#1:202\n29#1:126\n30#1:145,2\n30#1:147,2\n30#1:153,11\n58#1:183,2\n58#1:185,2\n58#1:191,11\n30#1:149,4\n58#1:187,4\n*E\n"
    }
.end annotation


# static fields
.field private static _cake:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCake(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/CakeKt;->_cake:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Cake"

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
    const v4, 0x41787ae1    # 15.53f

    .line 71
    .line 72
    .line 73
    const v6, 0x416eb852    # 14.92f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, -0x4075c28f    # -1.08f

    .line 80
    .line 81
    .line 82
    const v6, 0x3f88f5c3    # 1.07f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v25, -0x3f63851f    # -4.89f

    .line 89
    .line 90
    .line 91
    const/16 v26, 0x0

    .line 92
    .line 93
    const v21, -0x4059999a    # -1.3f

    .line 94
    .line 95
    .line 96
    const v22, 0x3fa66666    # 1.3f

    .line 97
    .line 98
    .line 99
    const v23, -0x3f9ae148    # -3.58f

    .line 100
    .line 101
    .line 102
    const v24, 0x3fa7ae14    # 1.31f

    .line 103
    .line 104
    .line 105
    move-object/from16 v20, v2

    .line 106
    .line 107
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const v4, -0x40770a3d    # -1.07f

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v4, -0x40747ae1    # -1.09f

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const v25, -0x3fe66666    # -2.4f

    .line 123
    .line 124
    .line 125
    const v26, 0x3f8147ae    # 1.01f

    .line 126
    .line 127
    .line 128
    const v21, -0x40dc28f6    # -0.64f

    .line 129
    .line 130
    .line 131
    const v22, 0x3f23d70a    # 0.64f

    .line 132
    .line 133
    .line 134
    const/high16 v23, -0x40400000    # -1.5f

    .line 135
    .line 136
    const/high16 v24, 0x3f800000    # 1.0f

    .line 137
    .line 138
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v4, 0x40400000    # 3.0f

    .line 142
    .line 143
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v4, 0x41600000    # 14.0f

    .line 147
    .line 148
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 152
    .line 153
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v26, -0x407eb852    # -1.01f

    .line 157
    .line 158
    .line 159
    const v21, -0x4099999a    # -0.9f

    .line 160
    .line 161
    .line 162
    const v22, -0x43dc28f6    # -0.01f

    .line 163
    .line 164
    .line 165
    const v23, -0x401eb852    # -1.76f

    .line 166
    .line 167
    .line 168
    const v24, -0x41428f5c    # -0.37f

    .line 169
    .line 170
    .line 171
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v4, -0x40770a3d    # -1.07f

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const/high16 v4, 0x41300000    # 11.0f

    .line 184
    .line 185
    const/high16 v6, 0x41900000    # 18.0f

    .line 186
    .line 187
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v4, 0x40c00000    # 6.0f

    .line 191
    .line 192
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v25, -0x40800000    # -1.0f

    .line 196
    .line 197
    const/high16 v26, 0x3f800000    # 1.0f

    .line 198
    .line 199
    const v21, -0x40f33333    # -0.55f

    .line 200
    .line 201
    .line 202
    const/16 v22, 0x0

    .line 203
    .line 204
    const/high16 v23, -0x40800000    # -1.0f

    .line 205
    .line 206
    const v24, 0x3ee66666    # 0.45f

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v4, 0x40600000    # 3.5f

    .line 213
    .line 214
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v25, 0x3fab851f    # 1.34f

    .line 218
    .line 219
    .line 220
    const v26, -0x40ee147b    # -0.57f

    .line 221
    .line 222
    .line 223
    const v21, 0x3f028f5c    # 0.51f

    .line 224
    .line 225
    .line 226
    const v22, -0x43dc28f6    # -0.01f

    .line 227
    .line 228
    .line 229
    const v23, 0x3f7d70a4    # 0.99f

    .line 230
    .line 231
    .line 232
    const v24, -0x41a8f5c3    # -0.21f

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v4, 0x4008f5c3    # 2.14f

    .line 239
    .line 240
    .line 241
    const v6, -0x3ff7ae14    # -2.13f

    .line 242
    .line 243
    .line 244
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v4, 0x400851ec    # 2.13f

    .line 248
    .line 249
    .line 250
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v25, 0x403147ae    # 2.77f

    .line 254
    .line 255
    .line 256
    const/16 v26, 0x0

    .line 257
    .line 258
    const v21, 0x3f3d70a4    # 0.74f

    .line 259
    .line 260
    .line 261
    const v22, 0x3f3d70a4    # 0.74f

    .line 262
    .line 263
    .line 264
    const v23, 0x4001eb85    # 2.03f

    .line 265
    .line 266
    .line 267
    const v24, 0x3f3d70a4    # 0.74f

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v4, 0x4008f5c3    # 2.14f

    .line 274
    .line 275
    .line 276
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v4, 0x400851ec    # 2.13f

    .line 280
    .line 281
    .line 282
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v25, 0x3faccccd    # 1.35f

    .line 286
    .line 287
    .line 288
    const v26, 0x3f11eb85    # 0.57f

    .line 289
    .line 290
    .line 291
    const v21, 0x3eb851ec    # 0.36f

    .line 292
    .line 293
    .line 294
    const v22, 0x3eb851ec    # 0.36f

    .line 295
    .line 296
    .line 297
    const v23, 0x3f570a3d    # 0.84f

    .line 298
    .line 299
    .line 300
    const v24, 0x3f0f5c29    # 0.56f

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const/high16 v4, 0x41400000    # 12.0f

    .line 307
    .line 308
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const/high16 v25, -0x40800000    # -1.0f

    .line 312
    .line 313
    const/high16 v26, -0x40800000    # -1.0f

    .line 314
    .line 315
    const/16 v21, 0x0

    .line 316
    .line 317
    const v22, -0x40f33333    # -0.55f

    .line 318
    .line 319
    .line 320
    const v23, -0x4119999a    # -0.45f

    .line 321
    .line 322
    .line 323
    const/high16 v24, -0x40800000    # -1.0f

    .line 324
    .line 325
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    const/16 v16, 0x3800

    .line 336
    .line 337
    const/16 v17, 0x0

    .line 338
    .line 339
    const v6, 0x3e99999a    # 0.3f

    .line 340
    .line 341
    .line 342
    const v8, 0x3e99999a    # 0.3f

    .line 343
    .line 344
    .line 345
    const/4 v7, 0x0

    .line 346
    const/high16 v9, 0x3f800000    # 1.0f

    .line 347
    .line 348
    const/high16 v12, 0x3f800000    # 1.0f

    .line 349
    .line 350
    const/4 v13, 0x0

    .line 351
    const/4 v14, 0x0

    .line 352
    const/4 v15, 0x0

    .line 353
    const-string v4, ""

    .line 354
    .line 355
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 356
    .line 357
    .line 358
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 359
    .line 360
    .line 361
    move-result v3

    .line 362
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 363
    .line 364
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 365
    .line 366
    .line 367
    move-result-wide v6

    .line 368
    const/4 v0, 0x0

    .line 369
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 370
    .line 371
    .line 372
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 373
    .line 374
    .line 375
    move-result v10

    .line 376
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 377
    .line 378
    .line 379
    move-result v11

    .line 380
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 383
    .line 384
    .line 385
    const/high16 v0, 0x40c00000    # 6.0f

    .line 386
    .line 387
    const/high16 v2, 0x41400000    # 12.0f

    .line 388
    .line 389
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const/high16 v17, 0x40000000    # 2.0f

    .line 393
    .line 394
    const/high16 v18, -0x40000000    # -2.0f

    .line 395
    .line 396
    const v13, 0x3f8e147b    # 1.11f

    .line 397
    .line 398
    .line 399
    const/high16 v15, 0x40000000    # 2.0f

    .line 400
    .line 401
    const v16, -0x4099999a    # -0.9f

    .line 402
    .line 403
    .line 404
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v17, -0x416b851f    # -0.29f

    .line 408
    .line 409
    .line 410
    const v18, -0x407c28f6    # -1.03f

    .line 411
    .line 412
    .line 413
    const/4 v13, 0x0

    .line 414
    const v14, -0x413d70a4    # -0.38f

    .line 415
    .line 416
    .line 417
    const v15, -0x42333333    # -0.1f

    .line 418
    .line 419
    .line 420
    const v16, -0x40c51eb8    # -0.73f

    .line 421
    .line 422
    .line 423
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const/4 v0, 0x0

    .line 427
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v0, -0x40251eb8    # -1.71f

    .line 431
    .line 432
    .line 433
    const v2, 0x403e147b    # 2.97f

    .line 434
    .line 435
    .line 436
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v18, 0x3f83d70a    # 1.03f

    .line 440
    .line 441
    .line 442
    const v13, -0x41bd70a4    # -0.19f

    .line 443
    .line 444
    .line 445
    const v14, 0x3e99999a    # 0.3f

    .line 446
    .line 447
    .line 448
    const v15, -0x416b851f    # -0.29f

    .line 449
    .line 450
    .line 451
    const v16, 0x3f266666    # 0.65f

    .line 452
    .line 453
    .line 454
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v17, 0x40000000    # 2.0f

    .line 458
    .line 459
    const/high16 v18, 0x40000000    # 2.0f

    .line 460
    .line 461
    const/4 v13, 0x0

    .line 462
    const v14, 0x3f8ccccd    # 1.1f

    .line 463
    .line 464
    .line 465
    const v15, 0x3f666666    # 0.9f

    .line 466
    .line 467
    .line 468
    const/high16 v16, 0x40000000    # 2.0f

    .line 469
    .line 470
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v0, 0x41900000    # 18.0f

    .line 477
    .line 478
    const/high16 v2, 0x41100000    # 9.0f

    .line 479
    .line 480
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v0, -0x3f600000    # -5.0f

    .line 484
    .line 485
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const/high16 v0, 0x41500000    # 13.0f

    .line 489
    .line 490
    const/high16 v2, 0x40e00000    # 7.0f

    .line 491
    .line 492
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const/high16 v0, -0x40000000    # -2.0f

    .line 496
    .line 497
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v0, 0x40000000    # 2.0f

    .line 501
    .line 502
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const/high16 v0, 0x41100000    # 9.0f

    .line 506
    .line 507
    const/high16 v2, 0x40c00000    # 6.0f

    .line 508
    .line 509
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 513
    .line 514
    const/high16 v18, 0x40400000    # 3.0f

    .line 515
    .line 516
    const v13, -0x402b851f    # -1.66f

    .line 517
    .line 518
    .line 519
    const/4 v14, 0x0

    .line 520
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 521
    .line 522
    const v16, 0x3fab851f    # 1.34f

    .line 523
    .line 524
    .line 525
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const/high16 v17, 0x3f800000    # 1.0f

    .line 532
    .line 533
    const/high16 v18, 0x3f800000    # 1.0f

    .line 534
    .line 535
    const/4 v13, 0x0

    .line 536
    const v14, 0x3f0ccccd    # 0.55f

    .line 537
    .line 538
    .line 539
    const v15, 0x3ee66666    # 0.45f

    .line 540
    .line 541
    .line 542
    const/high16 v16, 0x3f800000    # 1.0f

    .line 543
    .line 544
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const/high16 v0, 0x41800000    # 16.0f

    .line 548
    .line 549
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const/high16 v18, -0x40800000    # -1.0f

    .line 553
    .line 554
    const v13, 0x3f0ccccd    # 0.55f

    .line 555
    .line 556
    .line 557
    const/4 v14, 0x0

    .line 558
    const/high16 v15, 0x3f800000    # 1.0f

    .line 559
    .line 560
    const v16, -0x4119999a    # -0.45f

    .line 561
    .line 562
    .line 563
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const/high16 v0, -0x3ef00000    # -9.0f

    .line 567
    .line 568
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 572
    .line 573
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 574
    .line 575
    const/4 v13, 0x0

    .line 576
    const v14, -0x402b851f    # -1.66f

    .line 577
    .line 578
    .line 579
    const v15, -0x40547ae1    # -1.34f

    .line 580
    .line 581
    .line 582
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 583
    .line 584
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const/high16 v0, 0x41a00000    # 20.0f

    .line 591
    .line 592
    const/high16 v2, 0x41980000    # 19.0f

    .line 593
    .line 594
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const/high16 v0, 0x40a00000    # 5.0f

    .line 598
    .line 599
    const/high16 v2, 0x41a00000    # 20.0f

    .line 600
    .line 601
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 605
    .line 606
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const v17, 0x4019999a    # 2.4f

    .line 610
    .line 611
    .line 612
    const v18, -0x407eb852    # -1.01f

    .line 613
    .line 614
    .line 615
    const v13, 0x3f666666    # 0.9f

    .line 616
    .line 617
    .line 618
    const v14, -0x43dc28f6    # -0.01f

    .line 619
    .line 620
    .line 621
    const v15, 0x3fe147ae    # 1.76f

    .line 622
    .line 623
    .line 624
    const v16, -0x41428f5c    # -0.37f

    .line 625
    .line 626
    .line 627
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    const v0, 0x3f8b851f    # 1.09f

    .line 631
    .line 632
    .line 633
    const v2, -0x40770a3d    # -1.07f

    .line 634
    .line 635
    .line 636
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const v0, 0x3f88f5c3    # 1.07f

    .line 640
    .line 641
    .line 642
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    const v17, 0x409c7ae1    # 4.89f

    .line 646
    .line 647
    .line 648
    const/16 v18, 0x0

    .line 649
    .line 650
    const v13, 0x3fa7ae14    # 1.31f

    .line 651
    .line 652
    .line 653
    const v14, 0x3fa7ae14    # 1.31f

    .line 654
    .line 655
    .line 656
    const v15, 0x4065c28f    # 3.59f

    .line 657
    .line 658
    .line 659
    const v16, 0x3fa66666    # 1.3f

    .line 660
    .line 661
    .line 662
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    const v0, 0x3f8a3d71    # 1.08f

    .line 666
    .line 667
    .line 668
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const v0, 0x3f88f5c3    # 1.07f

    .line 672
    .line 673
    .line 674
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    const v17, 0x4019999a    # 2.4f

    .line 678
    .line 679
    .line 680
    const v18, 0x3f8147ae    # 1.01f

    .line 681
    .line 682
    .line 683
    const v13, 0x3f23d70a    # 0.64f

    .line 684
    .line 685
    .line 686
    const v14, 0x3f23d70a    # 0.64f

    .line 687
    .line 688
    .line 689
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 690
    .line 691
    const/high16 v16, 0x3f800000    # 1.0f

    .line 692
    .line 693
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 694
    .line 695
    .line 696
    const/high16 v0, 0x40400000    # 3.0f

    .line 697
    .line 698
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 702
    .line 703
    .line 704
    const/high16 v0, 0x41780000    # 15.5f

    .line 705
    .line 706
    const/high16 v2, 0x41980000    # 19.0f

    .line 707
    .line 708
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    const v17, -0x40533333    # -1.35f

    .line 712
    .line 713
    .line 714
    const v18, -0x40ee147b    # -0.57f

    .line 715
    .line 716
    .line 717
    const v13, -0x40fd70a4    # -0.51f

    .line 718
    .line 719
    .line 720
    const v14, -0x43dc28f6    # -0.01f

    .line 721
    .line 722
    .line 723
    const v15, -0x40828f5c    # -0.99f

    .line 724
    .line 725
    .line 726
    const v16, -0x41b33333    # -0.2f

    .line 727
    .line 728
    .line 729
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    const v0, -0x3ff7ae14    # -2.13f

    .line 733
    .line 734
    .line 735
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 736
    .line 737
    .line 738
    const v0, -0x3ff70a3d    # -2.14f

    .line 739
    .line 740
    .line 741
    const v2, 0x400851ec    # 2.13f

    .line 742
    .line 743
    .line 744
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 745
    .line 746
    .line 747
    const v17, -0x3fceb852    # -2.77f

    .line 748
    .line 749
    .line 750
    const/16 v18, 0x0

    .line 751
    .line 752
    const v13, -0x40c28f5c    # -0.74f

    .line 753
    .line 754
    .line 755
    const v14, 0x3f3d70a4    # 0.74f

    .line 756
    .line 757
    .line 758
    const v15, -0x3ffe147b    # -2.03f

    .line 759
    .line 760
    .line 761
    const v16, 0x3f3d70a4    # 0.74f

    .line 762
    .line 763
    .line 764
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 765
    .line 766
    .line 767
    const v0, 0x4107ae14    # 8.48f

    .line 768
    .line 769
    .line 770
    const v2, 0x414ccccd    # 12.8f

    .line 771
    .line 772
    .line 773
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 774
    .line 775
    .line 776
    const v0, -0x3ff70a3d    # -2.14f

    .line 777
    .line 778
    .line 779
    const v2, 0x400851ec    # 2.13f

    .line 780
    .line 781
    .line 782
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 783
    .line 784
    .line 785
    const v17, -0x40547ae1    # -1.34f

    .line 786
    .line 787
    .line 788
    const v18, 0x3f11eb85    # 0.57f

    .line 789
    .line 790
    .line 791
    const v13, -0x414ccccd    # -0.35f

    .line 792
    .line 793
    .line 794
    const v14, 0x3eb851ec    # 0.36f

    .line 795
    .line 796
    .line 797
    const v15, -0x40ab851f    # -0.83f

    .line 798
    .line 799
    .line 800
    const v16, 0x3f0f5c29    # 0.56f

    .line 801
    .line 802
    .line 803
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 804
    .line 805
    .line 806
    const/high16 v0, 0x40a00000    # 5.0f

    .line 807
    .line 808
    const/high16 v2, 0x41400000    # 12.0f

    .line 809
    .line 810
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 811
    .line 812
    .line 813
    const/high16 v17, 0x3f800000    # 1.0f

    .line 814
    .line 815
    const/high16 v18, -0x40800000    # -1.0f

    .line 816
    .line 817
    const/4 v13, 0x0

    .line 818
    const v14, -0x40f33333    # -0.55f

    .line 819
    .line 820
    .line 821
    const v15, 0x3ee66666    # 0.45f

    .line 822
    .line 823
    .line 824
    const/high16 v16, -0x40800000    # -1.0f

    .line 825
    .line 826
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 827
    .line 828
    .line 829
    const/high16 v0, 0x41400000    # 12.0f

    .line 830
    .line 831
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 832
    .line 833
    .line 834
    const/high16 v18, 0x3f800000    # 1.0f

    .line 835
    .line 836
    const v13, 0x3f0ccccd    # 0.55f

    .line 837
    .line 838
    .line 839
    const/4 v14, 0x0

    .line 840
    const/high16 v15, 0x3f800000    # 1.0f

    .line 841
    .line 842
    const v16, 0x3ee66666    # 0.45f

    .line 843
    .line 844
    .line 845
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 846
    .line 847
    .line 848
    const/high16 v0, 0x40600000    # 3.5f

    .line 849
    .line 850
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 851
    .line 852
    .line 853
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 854
    .line 855
    .line 856
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 857
    .line 858
    .line 859
    move-result-object v2

    .line 860
    const/16 v16, 0x3800

    .line 861
    .line 862
    const/16 v17, 0x0

    .line 863
    .line 864
    const/high16 v6, 0x3f800000    # 1.0f

    .line 865
    .line 866
    const/high16 v8, 0x3f800000    # 1.0f

    .line 867
    .line 868
    const/4 v7, 0x0

    .line 869
    const/high16 v12, 0x3f800000    # 1.0f

    .line 870
    .line 871
    const/4 v13, 0x0

    .line 872
    const/4 v15, 0x0

    .line 873
    const-string v4, ""

    .line 874
    .line 875
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 876
    .line 877
    .line 878
    move-result-object v0

    .line 879
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 880
    .line 881
    .line 882
    move-result-object v0

    .line 883
    sput-object v0, Landroidx/compose/material/icons/twotone/CakeKt;->_cake:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 884
    .line 885
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 886
    .line 887
    .line 888
    return-object v0
.end method
