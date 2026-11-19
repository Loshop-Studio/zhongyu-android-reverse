.class public final Landroidx/compose/material/icons/twotone/AddReactionKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_addReaction",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "AddReaction",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getAddReaction",
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
        "SMAP\nAddReaction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddReaction.kt\nandroidx/compose/material/icons/twotone/AddReactionKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,112:1\n212#2,12:113\n233#2,18:126\n253#2:163\n233#2,18:164\n253#2:201\n174#3:125\n705#4,2:144\n717#4,2:146\n719#4,11:152\n705#4,2:182\n717#4,2:184\n719#4,11:190\n72#5,4:148\n72#5,4:186\n*S KotlinDebug\n*F\n+ 1 AddReaction.kt\nandroidx/compose/material/icons/twotone/AddReactionKt\n*L\n29#1:113,12\n30#1:126,18\n30#1:163\n60#1:164,18\n60#1:201\n29#1:125\n30#1:144,2\n30#1:146,2\n30#1:152,11\n60#1:182,2\n60#1:184,2\n60#1:190,11\n30#1:148,4\n60#1:186,4\n*E\n"
    }
.end annotation


# static fields
.field private static _addReaction:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAddReaction(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/AddReactionKt;->_addReaction:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.AddReaction"

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
    const v4, 0x419b47ae    # 19.41f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x41100000    # 9.0f

    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v4, 0x41900000    # 18.0f

    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v4, 0x40e00000    # 7.0f

    .line 84
    .line 85
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/high16 v4, -0x40000000    # -2.0f

    .line 89
    .line 90
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v4, 0x40a28f5c    # 5.08f

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v25, 0x41400000    # 12.0f

    .line 100
    .line 101
    const/high16 v26, 0x40800000    # 4.0f

    .line 102
    .line 103
    const v21, 0x416d1eb8    # 14.82f

    .line 104
    .line 105
    .line 106
    const v22, 0x408ccccd    # 4.4f

    .line 107
    .line 108
    .line 109
    const v23, 0x41575c29    # 13.46f

    .line 110
    .line 111
    .line 112
    const/high16 v24, 0x40800000    # 4.0f

    .line 113
    .line 114
    move-object/from16 v20, v2

    .line 115
    .line 116
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v25, -0x3f000000    # -8.0f

    .line 120
    .line 121
    const/high16 v26, 0x41000000    # 8.0f

    .line 122
    .line 123
    const v21, -0x3f728f5c    # -4.42f

    .line 124
    .line 125
    .line 126
    const/16 v22, 0x0

    .line 127
    .line 128
    const/high16 v23, -0x3f000000    # -8.0f

    .line 129
    .line 130
    const v24, 0x40651eb8    # 3.58f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v4, 0x40651eb8    # 3.58f

    .line 137
    .line 138
    .line 139
    const/high16 v6, 0x41000000    # 8.0f

    .line 140
    .line 141
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v4, -0x3f9ae148    # -3.58f

    .line 145
    .line 146
    .line 147
    const/high16 v6, -0x3f000000    # -8.0f

    .line 148
    .line 149
    const/high16 v7, 0x41000000    # 8.0f

    .line 150
    .line 151
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v25, 0x419b47ae    # 19.41f

    .line 155
    .line 156
    .line 157
    const/high16 v26, 0x41100000    # 9.0f

    .line 158
    .line 159
    const/high16 v21, 0x41a00000    # 20.0f

    .line 160
    .line 161
    const v22, 0x412f0a3d    # 10.94f

    .line 162
    .line 163
    .line 164
    const v23, 0x419e51ec    # 19.79f

    .line 165
    .line 166
    .line 167
    const v24, 0x411ee148    # 9.93f

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/high16 v4, 0x41780000    # 15.5f

    .line 177
    .line 178
    const/high16 v6, 0x41000000    # 8.0f

    .line 179
    .line 180
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const/high16 v25, 0x41880000    # 17.0f

    .line 184
    .line 185
    const/high16 v26, 0x41180000    # 9.5f

    .line 186
    .line 187
    const v21, 0x4182a3d7    # 16.33f

    .line 188
    .line 189
    .line 190
    const/high16 v22, 0x41000000    # 8.0f

    .line 191
    .line 192
    const/high16 v23, 0x41880000    # 17.0f

    .line 193
    .line 194
    const v24, 0x410ab852    # 8.67f

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v25, -0x40400000    # -1.5f

    .line 201
    .line 202
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 203
    .line 204
    const/16 v21, 0x0

    .line 205
    .line 206
    const v22, 0x3f547ae1    # 0.83f

    .line 207
    .line 208
    .line 209
    const v23, -0x40d47ae1    # -0.67f

    .line 210
    .line 211
    .line 212
    const/high16 v24, 0x3fc00000    # 1.5f

    .line 213
    .line 214
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v4, 0x412547ae    # 10.33f

    .line 218
    .line 219
    .line 220
    const/high16 v6, 0x41600000    # 14.0f

    .line 221
    .line 222
    const/high16 v7, 0x41180000    # 9.5f

    .line 223
    .line 224
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const/high16 v25, 0x41780000    # 15.5f

    .line 228
    .line 229
    const/high16 v26, 0x41000000    # 8.0f

    .line 230
    .line 231
    const/high16 v21, 0x41600000    # 14.0f

    .line 232
    .line 233
    const v22, 0x410ab852    # 8.67f

    .line 234
    .line 235
    .line 236
    const v23, 0x416ab852    # 14.67f

    .line 237
    .line 238
    .line 239
    const/high16 v24, 0x41000000    # 8.0f

    .line 240
    .line 241
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v4, 0x41080000    # 8.5f

    .line 248
    .line 249
    const/high16 v6, 0x41000000    # 8.0f

    .line 250
    .line 251
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v25, 0x41200000    # 10.0f

    .line 255
    .line 256
    const/high16 v26, 0x41180000    # 9.5f

    .line 257
    .line 258
    const v21, 0x411547ae    # 9.33f

    .line 259
    .line 260
    .line 261
    const/high16 v22, 0x41000000    # 8.0f

    .line 262
    .line 263
    const/high16 v23, 0x41200000    # 10.0f

    .line 264
    .line 265
    const v24, 0x410ab852    # 8.67f

    .line 266
    .line 267
    .line 268
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/high16 v25, -0x40400000    # -1.5f

    .line 272
    .line 273
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 274
    .line 275
    const/16 v21, 0x0

    .line 276
    .line 277
    const v22, 0x3f547ae1    # 0.83f

    .line 278
    .line 279
    .line 280
    const v23, -0x40d47ae1    # -0.67f

    .line 281
    .line 282
    .line 283
    const/high16 v24, 0x3fc00000    # 1.5f

    .line 284
    .line 285
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v4, 0x412547ae    # 10.33f

    .line 289
    .line 290
    .line 291
    const/high16 v6, 0x41180000    # 9.5f

    .line 292
    .line 293
    const/high16 v7, 0x40e00000    # 7.0f

    .line 294
    .line 295
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v25, 0x41080000    # 8.5f

    .line 299
    .line 300
    const/high16 v26, 0x41000000    # 8.0f

    .line 301
    .line 302
    const/high16 v21, 0x40e00000    # 7.0f

    .line 303
    .line 304
    const v22, 0x410ab852    # 8.67f

    .line 305
    .line 306
    .line 307
    const v23, 0x40f570a4    # 7.67f

    .line 308
    .line 309
    .line 310
    const/high16 v24, 0x41000000    # 8.0f

    .line 311
    .line 312
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const/high16 v4, 0x418c0000    # 17.5f

    .line 319
    .line 320
    const/high16 v6, 0x41400000    # 12.0f

    .line 321
    .line 322
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const v25, -0x3f5c7ae1    # -5.11f

    .line 326
    .line 327
    .line 328
    const/high16 v26, -0x3fa00000    # -3.5f

    .line 329
    .line 330
    const v21, -0x3feae148    # -2.33f

    .line 331
    .line 332
    .line 333
    const/16 v22, 0x0

    .line 334
    .line 335
    const v23, -0x3f76147b    # -4.31f

    .line 336
    .line 337
    .line 338
    const v24, -0x40451eb8    # -1.46f

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v4, 0x4123851f    # 10.22f

    .line 345
    .line 346
    .line 347
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const/high16 v25, 0x41400000    # 12.0f

    .line 351
    .line 352
    const/high16 v26, 0x418c0000    # 17.5f

    .line 353
    .line 354
    const v21, 0x41827ae1    # 16.31f

    .line 355
    .line 356
    .line 357
    const v22, 0x418051ec    # 16.04f

    .line 358
    .line 359
    .line 360
    const v23, 0x416547ae    # 14.33f

    .line 361
    .line 362
    .line 363
    const/high16 v24, 0x418c0000    # 17.5f

    .line 364
    .line 365
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 372
    .line 373
    .line 374
    move-result-object v2

    .line 375
    const/16 v16, 0x3800

    .line 376
    .line 377
    const/16 v17, 0x0

    .line 378
    .line 379
    const v6, 0x3e99999a    # 0.3f

    .line 380
    .line 381
    .line 382
    const v8, 0x3e99999a    # 0.3f

    .line 383
    .line 384
    .line 385
    const/4 v7, 0x0

    .line 386
    const/high16 v9, 0x3f800000    # 1.0f

    .line 387
    .line 388
    const/high16 v12, 0x3f800000    # 1.0f

    .line 389
    .line 390
    const/4 v13, 0x0

    .line 391
    const/4 v14, 0x0

    .line 392
    const/4 v15, 0x0

    .line 393
    const-string v4, ""

    .line 394
    .line 395
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 396
    .line 397
    .line 398
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 399
    .line 400
    .line 401
    move-result v3

    .line 402
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 403
    .line 404
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 405
    .line 406
    .line 407
    move-result-wide v6

    .line 408
    const/4 v0, 0x0

    .line 409
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 410
    .line 411
    .line 412
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 413
    .line 414
    .line 415
    move-result v10

    .line 416
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 417
    .line 418
    .line 419
    move-result v11

    .line 420
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 423
    .line 424
    .line 425
    const/high16 v0, 0x41180000    # 9.5f

    .line 426
    .line 427
    const/high16 v2, 0x40e00000    # 7.0f

    .line 428
    .line 429
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v17, 0x41080000    # 8.5f

    .line 433
    .line 434
    const/high16 v18, 0x41000000    # 8.0f

    .line 435
    .line 436
    const/high16 v13, 0x40e00000    # 7.0f

    .line 437
    .line 438
    const v14, 0x410ab852    # 8.67f

    .line 439
    .line 440
    .line 441
    const v15, 0x40f570a4    # 7.67f

    .line 442
    .line 443
    .line 444
    const/high16 v16, 0x41000000    # 8.0f

    .line 445
    .line 446
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v0, 0x410ab852    # 8.67f

    .line 450
    .line 451
    .line 452
    const/high16 v2, 0x41200000    # 10.0f

    .line 453
    .line 454
    const/high16 v4, 0x41180000    # 9.5f

    .line 455
    .line 456
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/high16 v17, -0x40400000    # -1.5f

    .line 460
    .line 461
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 462
    .line 463
    const/4 v13, 0x0

    .line 464
    const v14, 0x3f547ae1    # 0.83f

    .line 465
    .line 466
    .line 467
    const v15, -0x40d47ae1    # -0.67f

    .line 468
    .line 469
    .line 470
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 471
    .line 472
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const v0, 0x412547ae    # 10.33f

    .line 476
    .line 477
    .line 478
    const/high16 v2, 0x41180000    # 9.5f

    .line 479
    .line 480
    const/high16 v4, 0x40e00000    # 7.0f

    .line 481
    .line 482
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const/high16 v0, 0x418c0000    # 17.5f

    .line 489
    .line 490
    const/high16 v2, 0x41400000    # 12.0f

    .line 491
    .line 492
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const v17, 0x40a3851f    # 5.11f

    .line 496
    .line 497
    .line 498
    const/high16 v18, -0x3fa00000    # -3.5f

    .line 499
    .line 500
    const v13, 0x40151eb8    # 2.33f

    .line 501
    .line 502
    .line 503
    const/4 v14, 0x0

    .line 504
    const v15, 0x4089eb85    # 4.31f

    .line 505
    .line 506
    .line 507
    const v16, -0x40451eb8    # -1.46f

    .line 508
    .line 509
    .line 510
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v0, 0x40dc7ae1    # 6.89f

    .line 514
    .line 515
    .line 516
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/high16 v17, 0x41400000    # 12.0f

    .line 520
    .line 521
    const/high16 v18, 0x418c0000    # 17.5f

    .line 522
    .line 523
    const v13, 0x40f6147b    # 7.69f

    .line 524
    .line 525
    .line 526
    const v14, 0x418051ec    # 16.04f

    .line 527
    .line 528
    .line 529
    const v15, 0x411ab852    # 9.67f

    .line 530
    .line 531
    .line 532
    const/high16 v16, 0x418c0000    # 17.5f

    .line 533
    .line 534
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const/high16 v0, 0x41300000    # 11.0f

    .line 541
    .line 542
    const/high16 v2, 0x41780000    # 15.5f

    .line 543
    .line 544
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 548
    .line 549
    const/high16 v18, -0x40400000    # -1.5f

    .line 550
    .line 551
    const v13, 0x3f547ae1    # 0.83f

    .line 552
    .line 553
    .line 554
    const/4 v14, 0x0

    .line 555
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 556
    .line 557
    const v16, -0x40d47ae1    # -0.67f

    .line 558
    .line 559
    .line 560
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const/high16 v17, 0x41780000    # 15.5f

    .line 564
    .line 565
    const/high16 v18, 0x41000000    # 8.0f

    .line 566
    .line 567
    const/high16 v13, 0x41880000    # 17.0f

    .line 568
    .line 569
    const v14, 0x410ab852    # 8.67f

    .line 570
    .line 571
    .line 572
    const v15, 0x4182a3d7    # 16.33f

    .line 573
    .line 574
    .line 575
    const/high16 v16, 0x41000000    # 8.0f

    .line 576
    .line 577
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const v0, 0x410ab852    # 8.67f

    .line 581
    .line 582
    .line 583
    const/high16 v2, 0x41600000    # 14.0f

    .line 584
    .line 585
    const/high16 v4, 0x41180000    # 9.5f

    .line 586
    .line 587
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const/high16 v18, 0x41300000    # 11.0f

    .line 591
    .line 592
    const/high16 v13, 0x41600000    # 14.0f

    .line 593
    .line 594
    const v14, 0x412547ae    # 10.33f

    .line 595
    .line 596
    .line 597
    const v15, 0x416ab852    # 14.67f

    .line 598
    .line 599
    .line 600
    const/high16 v16, 0x41300000    # 11.0f

    .line 601
    .line 602
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const/high16 v0, 0x41b00000    # 22.0f

    .line 609
    .line 610
    const/high16 v2, 0x3f800000    # 1.0f

    .line 611
    .line 612
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const/high16 v0, -0x40000000    # -2.0f

    .line 616
    .line 617
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const/high16 v0, 0x40000000    # 2.0f

    .line 621
    .line 622
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const/high16 v0, -0x40000000    # -2.0f

    .line 626
    .line 627
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    const/high16 v0, 0x40000000    # 2.0f

    .line 631
    .line 632
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const/high16 v0, 0x40a00000    # 5.0f

    .line 645
    .line 646
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const/high16 v0, 0x40000000    # 2.0f

    .line 650
    .line 651
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    const/high16 v0, 0x40400000    # 3.0f

    .line 655
    .line 656
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    const/high16 v0, -0x40000000    # -2.0f

    .line 660
    .line 661
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const/high16 v0, 0x3f800000    # 1.0f

    .line 665
    .line 666
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    .line 672
    const/high16 v0, 0x41a00000    # 20.0f

    .line 673
    .line 674
    const/high16 v2, 0x41400000    # 12.0f

    .line 675
    .line 676
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 677
    .line 678
    .line 679
    const/high16 v17, -0x3f000000    # -8.0f

    .line 680
    .line 681
    const/high16 v18, 0x41000000    # 8.0f

    .line 682
    .line 683
    const/4 v13, 0x0

    .line 684
    const v14, 0x408d70a4    # 4.42f

    .line 685
    .line 686
    .line 687
    const v15, -0x3f9ae148    # -3.58f

    .line 688
    .line 689
    .line 690
    const/high16 v16, 0x41000000    # 8.0f

    .line 691
    .line 692
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const v0, -0x3f9ae148    # -3.58f

    .line 696
    .line 697
    .line 698
    const/high16 v2, -0x3f000000    # -8.0f

    .line 699
    .line 700
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    const/high16 v17, 0x41000000    # 8.0f

    .line 704
    .line 705
    const/high16 v18, -0x3f000000    # -8.0f

    .line 706
    .line 707
    const v14, -0x3f728f5c    # -4.42f

    .line 708
    .line 709
    .line 710
    const v15, 0x40651eb8    # 3.58f

    .line 711
    .line 712
    .line 713
    const/high16 v16, -0x3f000000    # -8.0f

    .line 714
    .line 715
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 716
    .line 717
    .line 718
    const/high16 v17, 0x40800000    # 4.0f

    .line 719
    .line 720
    const v18, 0x3f8a3d71    # 1.08f

    .line 721
    .line 722
    .line 723
    const v13, 0x3fbae148    # 1.46f

    .line 724
    .line 725
    .line 726
    const/4 v14, 0x0

    .line 727
    const v15, 0x40347ae1    # 2.82f

    .line 728
    .line 729
    .line 730
    const v16, 0x3ecccccd    # 0.4f

    .line 731
    .line 732
    .line 733
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 734
    .line 735
    .line 736
    const v0, 0x4035c28f    # 2.84f

    .line 737
    .line 738
    .line 739
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    const v17, 0x413fd70a    # 11.99f

    .line 743
    .line 744
    .line 745
    const/high16 v18, 0x40000000    # 2.0f

    .line 746
    .line 747
    const v13, 0x416c51ec    # 14.77f

    .line 748
    .line 749
    .line 750
    const v14, 0x40133333    # 2.3f

    .line 751
    .line 752
    .line 753
    const v15, 0x4156b852    # 13.42f

    .line 754
    .line 755
    .line 756
    const/high16 v16, 0x40000000    # 2.0f

    .line 757
    .line 758
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 759
    .line 760
    .line 761
    const/high16 v17, 0x40000000    # 2.0f

    .line 762
    .line 763
    const/high16 v18, 0x41400000    # 12.0f

    .line 764
    .line 765
    const v13, 0x40cf0a3d    # 6.47f

    .line 766
    .line 767
    .line 768
    const/high16 v14, 0x40000000    # 2.0f

    .line 769
    .line 770
    const/high16 v15, 0x40000000    # 2.0f

    .line 771
    .line 772
    const v16, 0x40cf5c29    # 6.48f

    .line 773
    .line 774
    .line 775
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 776
    .line 777
    .line 778
    const v17, 0x411fd70a    # 9.99f

    .line 779
    .line 780
    .line 781
    const/high16 v18, 0x41200000    # 10.0f

    .line 782
    .line 783
    const/4 v13, 0x0

    .line 784
    const v14, 0x40b0a3d7    # 5.52f

    .line 785
    .line 786
    .line 787
    const v15, 0x408f0a3d    # 4.47f

    .line 788
    .line 789
    .line 790
    const/high16 v16, 0x41200000    # 10.0f

    .line 791
    .line 792
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 793
    .line 794
    .line 795
    const/high16 v17, 0x41b00000    # 22.0f

    .line 796
    .line 797
    const/high16 v18, 0x41400000    # 12.0f

    .line 798
    .line 799
    const v13, 0x418c28f6    # 17.52f

    .line 800
    .line 801
    .line 802
    const/high16 v14, 0x41b00000    # 22.0f

    .line 803
    .line 804
    const/high16 v15, 0x41b00000    # 22.0f

    .line 805
    .line 806
    const v16, 0x418c28f6    # 17.52f

    .line 807
    .line 808
    .line 809
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 810
    .line 811
    .line 812
    const v17, -0x410f5c29    # -0.47f

    .line 813
    .line 814
    .line 815
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 816
    .line 817
    const/4 v13, 0x0

    .line 818
    const v14, -0x4079999a    # -1.05f

    .line 819
    .line 820
    .line 821
    const v15, -0x41d1eb85    # -0.17f

    .line 822
    .line 823
    .line 824
    const v16, -0x3ffccccd    # -2.05f

    .line 825
    .line 826
    .line 827
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 828
    .line 829
    .line 830
    const v0, -0x3ff7ae14    # -2.13f

    .line 831
    .line 832
    .line 833
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 834
    .line 835
    .line 836
    const/high16 v17, 0x41a00000    # 20.0f

    .line 837
    .line 838
    const/high16 v18, 0x41400000    # 12.0f

    .line 839
    .line 840
    const v13, 0x419e3d71    # 19.78f

    .line 841
    .line 842
    .line 843
    const v14, 0x411ee148    # 9.93f

    .line 844
    .line 845
    .line 846
    const/high16 v15, 0x41a00000    # 20.0f

    .line 847
    .line 848
    const v16, 0x412f0a3d    # 10.94f

    .line 849
    .line 850
    .line 851
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 852
    .line 853
    .line 854
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 855
    .line 856
    .line 857
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 858
    .line 859
    .line 860
    move-result-object v2

    .line 861
    const/16 v16, 0x3800

    .line 862
    .line 863
    const/16 v17, 0x0

    .line 864
    .line 865
    const/high16 v6, 0x3f800000    # 1.0f

    .line 866
    .line 867
    const/high16 v8, 0x3f800000    # 1.0f

    .line 868
    .line 869
    const/4 v7, 0x0

    .line 870
    const/high16 v12, 0x3f800000    # 1.0f

    .line 871
    .line 872
    const/4 v13, 0x0

    .line 873
    const/4 v14, 0x0

    .line 874
    const/4 v15, 0x0

    .line 875
    const-string v4, ""

    .line 876
    .line 877
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 878
    .line 879
    .line 880
    move-result-object v0

    .line 881
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 882
    .line 883
    .line 884
    move-result-object v0

    .line 885
    sput-object v0, Landroidx/compose/material/icons/twotone/AddReactionKt;->_addReaction:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 886
    .line 887
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 888
    .line 889
    .line 890
    return-object v0
.end method
