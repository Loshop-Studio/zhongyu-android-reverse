.class public final Landroidx/compose/material/icons/twotone/SurroundSoundKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_surroundSound",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SurroundSound",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getSurroundSound",
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
        "SMAP\nSurroundSound.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SurroundSound.kt\nandroidx/compose/material/icons/twotone/SurroundSoundKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,117:1\n212#2,12:118\n233#2,18:131\n253#2:168\n233#2,18:169\n253#2:206\n233#2,18:207\n253#2:244\n233#2,18:245\n253#2:282\n233#2,18:283\n253#2:320\n174#3:130\n705#4,2:149\n717#4,2:151\n719#4,11:157\n705#4,2:187\n717#4,2:189\n719#4,11:195\n705#4,2:225\n717#4,2:227\n719#4,11:233\n705#4,2:263\n717#4,2:265\n719#4,11:271\n705#4,2:301\n717#4,2:303\n719#4,11:309\n72#5,4:153\n72#5,4:191\n72#5,4:229\n72#5,4:267\n72#5,4:305\n*S KotlinDebug\n*F\n+ 1 SurroundSound.kt\nandroidx/compose/material/icons/twotone/SurroundSoundKt\n*L\n29#1:118,12\n30#1:131,18\n30#1:168\n60#1:169,18\n60#1:206\n78#1:207,18\n78#1:244\n88#1:245,18\n88#1:282\n102#1:283,18\n102#1:320\n29#1:130\n30#1:149,2\n30#1:151,2\n30#1:157,11\n60#1:187,2\n60#1:189,2\n60#1:195,11\n78#1:225,2\n78#1:227,2\n78#1:233,11\n88#1:263,2\n88#1:265,2\n88#1:271,11\n102#1:301,2\n102#1:303,2\n102#1:309,11\n30#1:153,4\n60#1:191,4\n78#1:229,4\n88#1:267,4\n102#1:305,4\n*E\n"
    }
.end annotation


# static fields
.field private static _surroundSound:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSurroundSound(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/SurroundSoundKt;->_surroundSound:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.SurroundSound"

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
    const/high16 v4, 0x41900000    # 18.0f

    .line 71
    .line 72
    const/high16 v6, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x41800000    # 16.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x40c00000    # 6.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v4, 0x40800000    # 4.0f

    .line 88
    .line 89
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/high16 v4, 0x41900000    # 18.0f

    .line 93
    .line 94
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v4, 0x40e1eb85    # 7.06f

    .line 101
    .line 102
    .line 103
    const v6, 0x4187851f    # 16.94f

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const/high16 v25, 0x41980000    # 19.0f

    .line 110
    .line 111
    const/high16 v26, 0x41400000    # 12.0f

    .line 112
    .line 113
    const v21, 0x41928f5c    # 18.32f

    .line 114
    .line 115
    .line 116
    const v22, 0x41068f5c    # 8.41f

    .line 117
    .line 118
    .line 119
    const/high16 v23, 0x41980000    # 19.0f

    .line 120
    .line 121
    const v24, 0x41235c29    # 10.21f

    .line 122
    .line 123
    .line 124
    move-object/from16 v20, v2

    .line 125
    .line 126
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v4, -0x3ffccccd    # -2.05f

    .line 130
    .line 131
    .line 132
    const v6, 0x409e6666    # 4.95f

    .line 133
    .line 134
    .line 135
    const v7, 0x4065c28f    # 3.59f

    .line 136
    .line 137
    .line 138
    const v8, -0x40d1eb85    # -0.68f

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2, v8, v7, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v4, -0x40628f5c    # -1.23f

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v25, 0x3fc3d70a    # 1.53f

    .line 151
    .line 152
    .line 153
    const v26, -0x3f91eb85    # -3.72f

    .line 154
    .line 155
    .line 156
    const v21, 0x3f828f5c    # 1.02f

    .line 157
    .line 158
    .line 159
    const v22, -0x407c28f6    # -1.03f

    .line 160
    .line 161
    .line 162
    const v23, 0x3fc3d70a    # 1.53f

    .line 163
    .line 164
    .line 165
    const v24, -0x3fe851ec    # -2.37f

    .line 166
    .line 167
    .line 168
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v25, -0x403ae148    # -1.54f

    .line 172
    .line 173
    .line 174
    const v26, -0x3f928f5c    # -3.71f

    .line 175
    .line 176
    .line 177
    const/16 v21, 0x0

    .line 178
    .line 179
    const v22, -0x40533333    # -1.35f

    .line 180
    .line 181
    .line 182
    const v23, -0x40fae148    # -0.52f

    .line 183
    .line 184
    .line 185
    const v24, -0x3fd3d70a    # -2.69f

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v4, 0x40e1eb85    # 7.06f

    .line 192
    .line 193
    .line 194
    const v6, 0x4187851f    # 16.94f

    .line 195
    .line 196
    .line 197
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const/high16 v4, 0x41080000    # 8.5f

    .line 204
    .line 205
    const/high16 v6, 0x41400000    # 12.0f

    .line 206
    .line 207
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v25, 0x40600000    # 3.5f

    .line 211
    .line 212
    const/high16 v26, 0x40600000    # 3.5f

    .line 213
    .line 214
    const v21, 0x3ff70a3d    # 1.93f

    .line 215
    .line 216
    .line 217
    const/16 v22, 0x0

    .line 218
    .line 219
    const/high16 v23, 0x40600000    # 3.5f

    .line 220
    .line 221
    const v24, 0x3fc8f5c3    # 1.57f

    .line 222
    .line 223
    .line 224
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const/high16 v25, -0x3fa00000    # -3.5f

    .line 228
    .line 229
    const/16 v21, 0x0

    .line 230
    .line 231
    const v22, 0x3ff70a3d    # 1.93f

    .line 232
    .line 233
    .line 234
    const v23, -0x40370a3d    # -1.57f

    .line 235
    .line 236
    .line 237
    const/high16 v24, 0x40600000    # 3.5f

    .line 238
    .line 239
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v26, -0x3fa00000    # -3.5f

    .line 243
    .line 244
    const v21, -0x4008f5c3    # -1.93f

    .line 245
    .line 246
    .line 247
    const/16 v22, 0x0

    .line 248
    .line 249
    const/high16 v23, -0x3fa00000    # -3.5f

    .line 250
    .line 251
    const v24, -0x40370a3d    # -1.57f

    .line 252
    .line 253
    .line 254
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const/high16 v25, 0x41400000    # 12.0f

    .line 258
    .line 259
    const/high16 v26, 0x41080000    # 8.5f

    .line 260
    .line 261
    const/high16 v21, 0x41080000    # 8.5f

    .line 262
    .line 263
    const v22, 0x41211eb8    # 10.07f

    .line 264
    .line 265
    .line 266
    const v23, 0x41211eb8    # 10.07f

    .line 267
    .line 268
    .line 269
    const/high16 v24, 0x41080000    # 8.5f

    .line 270
    .line 271
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v4, 0x40e1999a    # 7.05f

    .line 278
    .line 279
    .line 280
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v4, 0x3f9d70a4    # 1.23f

    .line 284
    .line 285
    .line 286
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v25, 0x40d80000    # 6.75f

    .line 290
    .line 291
    const/high16 v26, 0x41400000    # 12.0f

    .line 292
    .line 293
    const v21, 0x40e8a3d7    # 7.27f

    .line 294
    .line 295
    .line 296
    const v22, 0x4114f5c3    # 9.31f

    .line 297
    .line 298
    .line 299
    const/high16 v23, 0x40d80000    # 6.75f

    .line 300
    .line 301
    const v24, 0x412a6666    # 10.65f

    .line 302
    .line 303
    .line 304
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v25, 0x3fc51eb8    # 1.54f

    .line 308
    .line 309
    .line 310
    const v26, 0x406d70a4    # 3.71f

    .line 311
    .line 312
    .line 313
    const/16 v21, 0x0

    .line 314
    .line 315
    const v22, 0x3faccccd    # 1.35f

    .line 316
    .line 317
    .line 318
    const v23, 0x3f051eb8    # 0.52f

    .line 319
    .line 320
    .line 321
    const v24, 0x402c28f6    # 2.69f

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v4, -0x40628f5c    # -1.23f

    .line 328
    .line 329
    .line 330
    const v6, 0x3f9d70a4    # 1.23f

    .line 331
    .line 332
    .line 333
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/high16 v25, 0x40a00000    # 5.0f

    .line 337
    .line 338
    const/high16 v26, 0x41400000    # 12.0f

    .line 339
    .line 340
    const v21, 0x40b5c28f    # 5.68f

    .line 341
    .line 342
    .line 343
    const v22, 0x417970a4    # 15.59f

    .line 344
    .line 345
    .line 346
    const/high16 v23, 0x40a00000    # 5.0f

    .line 347
    .line 348
    const v24, 0x415ca3d7    # 13.79f

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v4, 0x40b5c28f    # 5.68f

    .line 355
    .line 356
    .line 357
    const v6, 0x41068f5c    # 8.41f

    .line 358
    .line 359
    .line 360
    const v7, 0x40e1999a    # 7.05f

    .line 361
    .line 362
    .line 363
    invoke-virtual {v2, v4, v6, v7, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 370
    .line 371
    .line 372
    move-result-object v2

    .line 373
    const/16 v16, 0x3800

    .line 374
    .line 375
    const/16 v17, 0x0

    .line 376
    .line 377
    const v6, 0x3e99999a    # 0.3f

    .line 378
    .line 379
    .line 380
    const v8, 0x3e99999a    # 0.3f

    .line 381
    .line 382
    .line 383
    const/4 v7, 0x0

    .line 384
    const/high16 v9, 0x3f800000    # 1.0f

    .line 385
    .line 386
    const/high16 v12, 0x3f800000    # 1.0f

    .line 387
    .line 388
    const/4 v13, 0x0

    .line 389
    const/4 v14, 0x0

    .line 390
    const/4 v15, 0x0

    .line 391
    const-string v4, ""

    .line 392
    .line 393
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 394
    .line 395
    .line 396
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 397
    .line 398
    .line 399
    move-result v3

    .line 400
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 401
    .line 402
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 403
    .line 404
    .line 405
    move-result-wide v6

    .line 406
    const/4 v2, 0x0

    .line 407
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 408
    .line 409
    .line 410
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 411
    .line 412
    .line 413
    move-result v10

    .line 414
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 415
    .line 416
    .line 417
    move-result v11

    .line 418
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 421
    .line 422
    .line 423
    const/high16 v4, 0x41a00000    # 20.0f

    .line 424
    .line 425
    const/high16 v6, 0x40800000    # 4.0f

    .line 426
    .line 427
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v4, 0x40800000    # 4.0f

    .line 431
    .line 432
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/high16 v25, 0x40000000    # 2.0f

    .line 436
    .line 437
    const/high16 v26, 0x40c00000    # 6.0f

    .line 438
    .line 439
    const v21, 0x4039999a    # 2.9f

    .line 440
    .line 441
    .line 442
    const/high16 v22, 0x40800000    # 4.0f

    .line 443
    .line 444
    const/high16 v23, 0x40000000    # 2.0f

    .line 445
    .line 446
    const v24, 0x409ccccd    # 4.9f

    .line 447
    .line 448
    .line 449
    move-object/from16 v20, v2

    .line 450
    .line 451
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const/high16 v4, 0x41400000    # 12.0f

    .line 455
    .line 456
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/high16 v26, 0x40000000    # 2.0f

    .line 460
    .line 461
    const/16 v21, 0x0

    .line 462
    .line 463
    const v22, 0x3f8ccccd    # 1.1f

    .line 464
    .line 465
    .line 466
    const v23, 0x3f666666    # 0.9f

    .line 467
    .line 468
    .line 469
    const/high16 v24, 0x40000000    # 2.0f

    .line 470
    .line 471
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const/high16 v4, 0x41800000    # 16.0f

    .line 475
    .line 476
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const/high16 v26, -0x40000000    # -2.0f

    .line 480
    .line 481
    const v21, 0x3f8ccccd    # 1.1f

    .line 482
    .line 483
    .line 484
    const/16 v22, 0x0

    .line 485
    .line 486
    const/high16 v23, 0x40000000    # 2.0f

    .line 487
    .line 488
    const v24, -0x4099999a    # -0.9f

    .line 489
    .line 490
    .line 491
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const/high16 v4, 0x40c00000    # 6.0f

    .line 495
    .line 496
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const/high16 v25, 0x41a00000    # 20.0f

    .line 500
    .line 501
    const/high16 v26, 0x40800000    # 4.0f

    .line 502
    .line 503
    const/high16 v21, 0x41b00000    # 22.0f

    .line 504
    .line 505
    const v22, 0x409ccccd    # 4.9f

    .line 506
    .line 507
    .line 508
    const v23, 0x41a8cccd    # 21.1f

    .line 509
    .line 510
    .line 511
    const/high16 v24, 0x40800000    # 4.0f

    .line 512
    .line 513
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/high16 v4, 0x41a00000    # 20.0f

    .line 520
    .line 521
    const/high16 v6, 0x41900000    # 18.0f

    .line 522
    .line 523
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const/high16 v4, 0x40800000    # 4.0f

    .line 527
    .line 528
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const/high16 v4, 0x40c00000    # 6.0f

    .line 532
    .line 533
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const/high16 v4, 0x41800000    # 16.0f

    .line 537
    .line 538
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const/high16 v4, 0x41900000    # 18.0f

    .line 542
    .line 543
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 550
    .line 551
    .line 552
    move-result-object v2

    .line 553
    const/high16 v6, 0x3f800000    # 1.0f

    .line 554
    .line 555
    const/high16 v8, 0x3f800000    # 1.0f

    .line 556
    .line 557
    const/4 v7, 0x0

    .line 558
    const-string v4, ""

    .line 559
    .line 560
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 561
    .line 562
    .line 563
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 564
    .line 565
    .line 566
    move-result v3

    .line 567
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 568
    .line 569
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 570
    .line 571
    .line 572
    move-result-wide v6

    .line 573
    const/4 v2, 0x0

    .line 574
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 575
    .line 576
    .line 577
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 578
    .line 579
    .line 580
    move-result v10

    .line 581
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 582
    .line 583
    .line 584
    move-result v11

    .line 585
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 588
    .line 589
    .line 590
    const v4, 0x417b5c29    # 15.71f

    .line 591
    .line 592
    .line 593
    const v6, 0x4104a3d7    # 8.29f

    .line 594
    .line 595
    .line 596
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const/high16 v25, 0x40d80000    # 6.75f

    .line 600
    .line 601
    const/high16 v26, 0x41400000    # 12.0f

    .line 602
    .line 603
    const v21, 0x40e8a3d7    # 7.27f

    .line 604
    .line 605
    .line 606
    const v22, 0x416b0a3d    # 14.69f

    .line 607
    .line 608
    .line 609
    const/high16 v23, 0x40d80000    # 6.75f

    .line 610
    .line 611
    const v24, 0x4155999a    # 13.35f

    .line 612
    .line 613
    .line 614
    move-object/from16 v20, v2

    .line 615
    .line 616
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const v25, 0x3fc3d70a    # 1.53f

    .line 620
    .line 621
    .line 622
    const v26, -0x3f91eb85    # -3.72f

    .line 623
    .line 624
    .line 625
    const/16 v21, 0x0

    .line 626
    .line 627
    const v22, -0x40533333    # -1.35f

    .line 628
    .line 629
    .line 630
    const v23, 0x3f051eb8    # 0.52f

    .line 631
    .line 632
    .line 633
    const v24, -0x3fd3d70a    # -2.69f

    .line 634
    .line 635
    .line 636
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const v4, 0x40e1999a    # 7.05f

    .line 640
    .line 641
    .line 642
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    const/high16 v25, 0x40a00000    # 5.0f

    .line 646
    .line 647
    const/high16 v26, 0x41400000    # 12.0f

    .line 648
    .line 649
    const v21, 0x40b5c28f    # 5.68f

    .line 650
    .line 651
    .line 652
    const v22, 0x41068f5c    # 8.41f

    .line 653
    .line 654
    .line 655
    const/high16 v23, 0x40a00000    # 5.0f

    .line 656
    .line 657
    const v24, 0x41235c29    # 10.21f

    .line 658
    .line 659
    .line 660
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    const v4, 0x4003d70a    # 2.06f

    .line 664
    .line 665
    .line 666
    const v6, 0x409e147b    # 4.94f

    .line 667
    .line 668
    .line 669
    const v7, 0x4065c28f    # 3.59f

    .line 670
    .line 671
    .line 672
    const v8, 0x3f2e147b    # 0.68f

    .line 673
    .line 674
    .line 675
    invoke-virtual {v2, v8, v7, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const v4, 0x417b5c29    # 15.71f

    .line 679
    .line 680
    .line 681
    const v6, 0x4104a3d7    # 8.29f

    .line 682
    .line 683
    .line 684
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 691
    .line 692
    .line 693
    move-result-object v2

    .line 694
    const/high16 v6, 0x3f800000    # 1.0f

    .line 695
    .line 696
    const/high16 v8, 0x3f800000    # 1.0f

    .line 697
    .line 698
    const/4 v7, 0x0

    .line 699
    const-string v4, ""

    .line 700
    .line 701
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 702
    .line 703
    .line 704
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 705
    .line 706
    .line 707
    move-result v3

    .line 708
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 709
    .line 710
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 711
    .line 712
    .line 713
    move-result-wide v6

    .line 714
    const/4 v2, 0x0

    .line 715
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 716
    .line 717
    .line 718
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 719
    .line 720
    .line 721
    move-result v10

    .line 722
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 723
    .line 724
    .line 725
    move-result v11

    .line 726
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 727
    .line 728
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 729
    .line 730
    .line 731
    const/high16 v4, 0x41780000    # 15.5f

    .line 732
    .line 733
    const/high16 v6, 0x41400000    # 12.0f

    .line 734
    .line 735
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 736
    .line 737
    .line 738
    const/high16 v25, 0x40600000    # 3.5f

    .line 739
    .line 740
    const/high16 v26, -0x3fa00000    # -3.5f

    .line 741
    .line 742
    const v21, 0x3ff70a3d    # 1.93f

    .line 743
    .line 744
    .line 745
    const/16 v22, 0x0

    .line 746
    .line 747
    const/high16 v23, 0x40600000    # 3.5f

    .line 748
    .line 749
    const v24, -0x40370a3d    # -1.57f

    .line 750
    .line 751
    .line 752
    move-object/from16 v20, v2

    .line 753
    .line 754
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 755
    .line 756
    .line 757
    const/high16 v25, -0x3fa00000    # -3.5f

    .line 758
    .line 759
    const/16 v21, 0x0

    .line 760
    .line 761
    const v22, -0x4008f5c3    # -1.93f

    .line 762
    .line 763
    .line 764
    const v23, -0x40370a3d    # -1.57f

    .line 765
    .line 766
    .line 767
    const/high16 v24, -0x3fa00000    # -3.5f

    .line 768
    .line 769
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 770
    .line 771
    .line 772
    const/high16 v26, 0x40600000    # 3.5f

    .line 773
    .line 774
    const v21, -0x4008f5c3    # -1.93f

    .line 775
    .line 776
    .line 777
    const/16 v22, 0x0

    .line 778
    .line 779
    const/high16 v23, -0x3fa00000    # -3.5f

    .line 780
    .line 781
    const v24, 0x3fc8f5c3    # 1.57f

    .line 782
    .line 783
    .line 784
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 785
    .line 786
    .line 787
    const/high16 v25, 0x41400000    # 12.0f

    .line 788
    .line 789
    const/high16 v26, 0x41780000    # 15.5f

    .line 790
    .line 791
    const/high16 v21, 0x41080000    # 8.5f

    .line 792
    .line 793
    const v22, 0x415ee148    # 13.93f

    .line 794
    .line 795
    .line 796
    const v23, 0x41211eb8    # 10.07f

    .line 797
    .line 798
    .line 799
    const/high16 v24, 0x41780000    # 15.5f

    .line 800
    .line 801
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 802
    .line 803
    .line 804
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 805
    .line 806
    .line 807
    const/high16 v4, 0x41280000    # 10.5f

    .line 808
    .line 809
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 810
    .line 811
    .line 812
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 813
    .line 814
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 815
    .line 816
    const v21, 0x3f547ae1    # 0.83f

    .line 817
    .line 818
    .line 819
    const/16 v22, 0x0

    .line 820
    .line 821
    const/high16 v23, 0x3fc00000    # 1.5f

    .line 822
    .line 823
    const v24, 0x3f2b851f    # 0.67f

    .line 824
    .line 825
    .line 826
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 827
    .line 828
    .line 829
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 830
    .line 831
    const v6, -0x40d47ae1    # -0.67f

    .line 832
    .line 833
    .line 834
    const/high16 v7, -0x40400000    # -1.5f

    .line 835
    .line 836
    invoke-virtual {v2, v6, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 837
    .line 838
    .line 839
    const v4, -0x40d47ae1    # -0.67f

    .line 840
    .line 841
    .line 842
    const/high16 v6, -0x40400000    # -1.5f

    .line 843
    .line 844
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 845
    .line 846
    .line 847
    const v4, 0x4132b852    # 11.17f

    .line 848
    .line 849
    .line 850
    const/high16 v6, 0x41280000    # 10.5f

    .line 851
    .line 852
    const/high16 v7, 0x41400000    # 12.0f

    .line 853
    .line 854
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 855
    .line 856
    .line 857
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 858
    .line 859
    .line 860
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 861
    .line 862
    .line 863
    move-result-object v2

    .line 864
    const/high16 v6, 0x3f800000    # 1.0f

    .line 865
    .line 866
    const/4 v7, 0x0

    .line 867
    const-string v4, ""

    .line 868
    .line 869
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 870
    .line 871
    .line 872
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 873
    .line 874
    .line 875
    move-result v3

    .line 876
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 877
    .line 878
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 879
    .line 880
    .line 881
    move-result-wide v6

    .line 882
    const/4 v0, 0x0

    .line 883
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 884
    .line 885
    .line 886
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 887
    .line 888
    .line 889
    move-result v10

    .line 890
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 891
    .line 892
    .line 893
    move-result v11

    .line 894
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 895
    .line 896
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 897
    .line 898
    .line 899
    const v0, 0x417b851f    # 15.72f

    .line 900
    .line 901
    .line 902
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 903
    .line 904
    .line 905
    const v0, 0x3f9d70a4    # 1.23f

    .line 906
    .line 907
    .line 908
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 909
    .line 910
    .line 911
    const/high16 v17, 0x41980000    # 19.0f

    .line 912
    .line 913
    const/high16 v18, 0x41400000    # 12.0f

    .line 914
    .line 915
    const v13, 0x41928f5c    # 18.32f

    .line 916
    .line 917
    .line 918
    const v14, 0x417970a4    # 15.59f

    .line 919
    .line 920
    .line 921
    const/high16 v15, 0x41980000    # 19.0f

    .line 922
    .line 923
    const v16, 0x415ca3d7    # 13.79f

    .line 924
    .line 925
    .line 926
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 927
    .line 928
    .line 929
    const v0, -0x3ffc28f6    # -2.06f

    .line 930
    .line 931
    .line 932
    const v2, -0x3f61eb85    # -4.94f

    .line 933
    .line 934
    .line 935
    const v4, -0x40d1eb85    # -0.68f

    .line 936
    .line 937
    .line 938
    const v6, -0x3f9a3d71    # -3.59f

    .line 939
    .line 940
    .line 941
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 942
    .line 943
    .line 944
    const v0, -0x40628f5c    # -1.23f

    .line 945
    .line 946
    .line 947
    const v2, 0x3f9d70a4    # 1.23f

    .line 948
    .line 949
    .line 950
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 951
    .line 952
    .line 953
    const v17, 0x3fc51eb8    # 1.54f

    .line 954
    .line 955
    .line 956
    const v18, 0x406d70a4    # 3.71f

    .line 957
    .line 958
    .line 959
    const v13, 0x3f828f5c    # 1.02f

    .line 960
    .line 961
    .line 962
    const v14, 0x3f828f5c    # 1.02f

    .line 963
    .line 964
    .line 965
    const v15, 0x3fc51eb8    # 1.54f

    .line 966
    .line 967
    .line 968
    const v16, 0x40170a3d    # 2.36f

    .line 969
    .line 970
    .line 971
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 972
    .line 973
    .line 974
    const v17, 0x417b851f    # 15.72f

    .line 975
    .line 976
    .line 977
    const v18, 0x417b851f    # 15.72f

    .line 978
    .line 979
    .line 980
    const/high16 v13, 0x418a0000    # 17.25f

    .line 981
    .line 982
    const v14, 0x4155999a    # 13.35f

    .line 983
    .line 984
    .line 985
    const v15, 0x4185d70a    # 16.73f

    .line 986
    .line 987
    .line 988
    const v16, 0x416b0a3d    # 14.69f

    .line 989
    .line 990
    .line 991
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 992
    .line 993
    .line 994
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 995
    .line 996
    .line 997
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 998
    .line 999
    .line 1000
    move-result-object v2

    .line 1001
    const/16 v16, 0x3800

    .line 1002
    .line 1003
    const/16 v17, 0x0

    .line 1004
    .line 1005
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1006
    .line 1007
    const/4 v7, 0x0

    .line 1008
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1009
    .line 1010
    const/4 v13, 0x0

    .line 1011
    const/4 v14, 0x0

    .line 1012
    const/4 v15, 0x0

    .line 1013
    const-string v4, ""

    .line 1014
    .line 1015
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v0

    .line 1019
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v0

    .line 1023
    sput-object v0, Landroidx/compose/material/icons/twotone/SurroundSoundKt;->_surroundSound:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1024
    .line 1025
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1026
    .line 1027
    .line 1028
    return-object v0
.end method
