.class public final Landroidx/compose/material/icons/outlined/CancelScheduleSendKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_cancelScheduleSend",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "CancelScheduleSend",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getCancelScheduleSend",
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
        "SMAP\nCancelScheduleSend.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancelScheduleSend.kt\nandroidx/compose/material/icons/outlined/CancelScheduleSendKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,82:1\n212#2,12:83\n233#2,18:96\n253#2:133\n233#2,18:134\n253#2:171\n174#3:95\n705#4,2:114\n717#4,2:116\n719#4,11:122\n705#4,2:152\n717#4,2:154\n719#4,11:160\n72#5,4:118\n72#5,4:156\n*S KotlinDebug\n*F\n+ 1 CancelScheduleSend.kt\nandroidx/compose/material/icons/outlined/CancelScheduleSendKt\n*L\n29#1:83,12\n30#1:96,18\n30#1:133\n62#1:134,18\n62#1:171\n29#1:95\n30#1:114,2\n30#1:116,2\n30#1:122,11\n62#1:152,2\n62#1:154,2\n62#1:160,11\n30#1:118,4\n62#1:156,4\n*E\n"
    }
.end annotation


# static fields
.field private static _cancelScheduleSend:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCancelScheduleSend(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/CancelScheduleSendKt;->_cancelScheduleSend:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.CancelScheduleSend"

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
    const/high16 v4, 0x41100000    # 9.0f

    .line 71
    .line 72
    const/high16 v6, 0x41840000    # 16.5f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v25, -0x406147ae    # -1.24f

    .line 78
    .line 79
    .line 80
    const v26, 0x3de147ae    # 0.11f

    .line 81
    .line 82
    .line 83
    const v21, -0x4128f5c3    # -0.42f

    .line 84
    .line 85
    .line 86
    const/16 v22, 0x0

    .line 87
    .line 88
    const v23, -0x40ab851f    # -0.83f

    .line 89
    .line 90
    .line 91
    const v24, 0x3d23d70a    # 0.04f

    .line 92
    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v4, 0x3f8147ae    # 1.01f

    .line 100
    .line 101
    .line 102
    const/high16 v6, 0x40400000    # 3.0f

    .line 103
    .line 104
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v4, 0x41200000    # 10.0f

    .line 108
    .line 109
    const/high16 v6, 0x3f800000    # 1.0f

    .line 110
    .line 111
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v4, 0x4120f5c3    # 10.06f

    .line 115
    .line 116
    .line 117
    const v6, 0x3fab851f    # 1.34f

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v25, -0x40747ae1    # -1.09f

    .line 124
    .line 125
    .line 126
    const v26, 0x3fbae148    # 1.46f

    .line 127
    .line 128
    .line 129
    const v22, 0x3ee147ae    # 0.44f

    .line 130
    .line 131
    .line 132
    const v23, -0x40b851ec    # -0.78f

    .line 133
    .line 134
    .line 135
    const v24, 0x3f6e147b    # 0.93f

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v4, 0x41600000    # 14.0f

    .line 142
    .line 143
    const/high16 v6, 0x3f800000    # 1.0f

    .line 144
    .line 145
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v4, 0x40e00000    # 7.0f

    .line 149
    .line 150
    const v6, 0x3c23d70a    # 0.01f

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v4, 0x41011eb8    # 8.07f

    .line 157
    .line 158
    .line 159
    const v6, -0x3fa28f5c    # -3.46f

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v25, 0x41840000    # 16.5f

    .line 166
    .line 167
    const/high16 v26, 0x41c00000    # 24.0f

    .line 168
    .line 169
    const v21, 0x411970a4    # 9.59f

    .line 170
    .line 171
    .line 172
    const v22, 0x41a9851f    # 21.19f

    .line 173
    .line 174
    .line 175
    const v23, 0x414b5c29    # 12.71f

    .line 176
    .line 177
    .line 178
    const/high16 v24, 0x41c00000    # 24.0f

    .line 179
    .line 180
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const/high16 v25, 0x40f00000    # 7.5f

    .line 184
    .line 185
    const/high16 v26, -0x3f100000    # -7.5f

    .line 186
    .line 187
    const v21, 0x40847ae1    # 4.14f

    .line 188
    .line 189
    .line 190
    const/16 v22, 0x0

    .line 191
    .line 192
    const/high16 v23, 0x40f00000    # 7.5f

    .line 193
    .line 194
    const v24, -0x3fa8f5c3    # -3.36f

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v4, 0x41a51eb8    # 20.64f

    .line 201
    .line 202
    .line 203
    const/high16 v6, 0x41100000    # 9.0f

    .line 204
    .line 205
    const/high16 v7, 0x41840000    # 16.5f

    .line 206
    .line 207
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v4, 0x41040000    # 8.25f

    .line 214
    .line 215
    const/high16 v6, 0x40400000    # 3.0f

    .line 216
    .line 217
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v4, -0x3ff1eb85    # -2.22f

    .line 221
    .line 222
    .line 223
    const v6, 0x3c23d70a    # 0.01f

    .line 224
    .line 225
    .line 226
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v4, 0x40f051ec    # 7.51f

    .line 230
    .line 231
    .line 232
    const v6, 0x404e147b    # 3.22f

    .line 233
    .line 234
    .line 235
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v4, 0x41040000    # 8.25f

    .line 239
    .line 240
    const/high16 v6, 0x40400000    # 3.0f

    .line 241
    .line 242
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v4, 0x4111999a    # 9.1f

    .line 249
    .line 250
    .line 251
    const v6, 0x4175c28f    # 15.36f

    .line 252
    .line 253
    .line 254
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v4, 0x418fc28f    # 17.97f

    .line 258
    .line 259
    .line 260
    const/high16 v6, 0x40400000    # 3.0f

    .line 261
    .line 262
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v4, -0x3ff1eb85    # -2.22f

    .line 266
    .line 267
    .line 268
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v4, 0x40c570a4    # 6.17f

    .line 272
    .line 273
    .line 274
    const v6, -0x40ae147b    # -0.82f

    .line 275
    .line 276
    .line 277
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v25, 0x4111999a    # 9.1f

    .line 281
    .line 282
    .line 283
    const v26, 0x4175c28f    # 15.36f

    .line 284
    .line 285
    .line 286
    const v21, 0x41123d71    # 9.14f

    .line 287
    .line 288
    .line 289
    const v22, 0x41711eb8    # 15.07f

    .line 290
    .line 291
    .line 292
    const v23, 0x4111eb85    # 9.12f

    .line 293
    .line 294
    .line 295
    const v24, 0x41735c29    # 15.21f

    .line 296
    .line 297
    .line 298
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const/high16 v4, 0x41b00000    # 22.0f

    .line 305
    .line 306
    const/high16 v6, 0x41840000    # 16.5f

    .line 307
    .line 308
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const/high16 v25, -0x3f500000    # -5.5f

    .line 312
    .line 313
    const/high16 v26, -0x3f500000    # -5.5f

    .line 314
    .line 315
    const v21, -0x3fbe147b    # -3.03f

    .line 316
    .line 317
    .line 318
    const/16 v22, 0x0

    .line 319
    .line 320
    const/high16 v23, -0x3f500000    # -5.5f

    .line 321
    .line 322
    const v24, -0x3fe1eb85    # -2.47f

    .line 323
    .line 324
    .line 325
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const/high16 v4, -0x3f500000    # -5.5f

    .line 329
    .line 330
    const v6, 0x401e147b    # 2.47f

    .line 331
    .line 332
    .line 333
    const/high16 v7, 0x40b00000    # 5.5f

    .line 334
    .line 335
    invoke-virtual {v2, v6, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v4, 0x401e147b    # 2.47f

    .line 339
    .line 340
    .line 341
    const/high16 v6, 0x40b00000    # 5.5f

    .line 342
    .line 343
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v4, 0x419c3d71    # 19.53f

    .line 347
    .line 348
    .line 349
    const/high16 v6, 0x41b00000    # 22.0f

    .line 350
    .line 351
    const/high16 v7, 0x41840000    # 16.5f

    .line 352
    .line 353
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    const/16 v16, 0x3800

    .line 364
    .line 365
    const/16 v17, 0x0

    .line 366
    .line 367
    const/high16 v6, 0x3f800000    # 1.0f

    .line 368
    .line 369
    const/high16 v8, 0x3f800000    # 1.0f

    .line 370
    .line 371
    const/4 v7, 0x0

    .line 372
    const/high16 v9, 0x3f800000    # 1.0f

    .line 373
    .line 374
    const/high16 v12, 0x3f800000    # 1.0f

    .line 375
    .line 376
    const/4 v13, 0x0

    .line 377
    const/4 v14, 0x0

    .line 378
    const/4 v15, 0x0

    .line 379
    const-string v4, ""

    .line 380
    .line 381
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 382
    .line 383
    .line 384
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 385
    .line 386
    .line 387
    move-result v3

    .line 388
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 389
    .line 390
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 391
    .line 392
    .line 393
    move-result-wide v6

    .line 394
    const/4 v0, 0x0

    .line 395
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 396
    .line 397
    .line 398
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 399
    .line 400
    .line 401
    move-result v10

    .line 402
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 403
    .line 404
    .line 405
    move-result v11

    .line 406
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 409
    .line 410
    .line 411
    const v2, 0x419228f6    # 18.27f

    .line 412
    .line 413
    .line 414
    const v4, 0x41607ae1    # 14.03f

    .line 415
    .line 416
    .line 417
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v2, 0x3fe147ae    # 1.76f

    .line 421
    .line 422
    .line 423
    const v4, -0x401d70a4    # -1.77f

    .line 424
    .line 425
    .line 426
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v2, -0x401eb852    # -1.76f

    .line 430
    .line 431
    .line 432
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v2, -0x40cccccd    # -0.7f

    .line 436
    .line 437
    .line 438
    const v4, 0x3f333333    # 0.7f

    .line 439
    .line 440
    .line 441
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v2, 0x3fe28f5c    # 1.77f

    .line 445
    .line 446
    .line 447
    const v4, 0x3fe147ae    # 1.76f

    .line 448
    .line 449
    .line 450
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v4, -0x401eb852    # -1.76f

    .line 454
    .line 455
    .line 456
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v2, 0x3f333333    # 0.7f

    .line 460
    .line 461
    .line 462
    invoke-virtual {v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const v2, 0x3fe28f5c    # 1.77f

    .line 466
    .line 467
    .line 468
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v4, 0x3fe147ae    # 1.76f

    .line 472
    .line 473
    .line 474
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const v2, -0x40cccccd    # -0.7f

    .line 478
    .line 479
    .line 480
    const v4, 0x3f333333    # 0.7f

    .line 481
    .line 482
    .line 483
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const v2, -0x401eb852    # -1.76f

    .line 487
    .line 488
    .line 489
    const v4, -0x401d70a4    # -1.77f

    .line 490
    .line 491
    .line 492
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const v2, 0x3fe147ae    # 1.76f

    .line 496
    .line 497
    .line 498
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 505
    .line 506
    .line 507
    move-result-object v2

    .line 508
    const/high16 v6, 0x3f800000    # 1.0f

    .line 509
    .line 510
    const/4 v7, 0x0

    .line 511
    const-string v4, ""

    .line 512
    .line 513
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 518
    .line 519
    .line 520
    move-result-object v0

    .line 521
    sput-object v0, Landroidx/compose/material/icons/outlined/CancelScheduleSendKt;->_cancelScheduleSend:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 522
    .line 523
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 524
    .line 525
    .line 526
    return-object v0
.end method
