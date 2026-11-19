.class public final Landroidx/compose/material/icons/outlined/TroubleshootKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_troubleshoot",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Troubleshoot",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getTroubleshoot",
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
        "SMAP\nTroubleshoot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Troubleshoot.kt\nandroidx/compose/material/icons/outlined/TroubleshootKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,73:1\n212#2,12:74\n233#2,18:87\n253#2:124\n233#2,18:125\n253#2:162\n174#3:86\n705#4,2:105\n717#4,2:107\n719#4,11:113\n705#4,2:143\n717#4,2:145\n719#4,11:151\n72#5,4:109\n72#5,4:147\n*S KotlinDebug\n*F\n+ 1 Troubleshoot.kt\nandroidx/compose/material/icons/outlined/TroubleshootKt\n*L\n29#1:74,12\n30#1:87,18\n30#1:124\n48#1:125,18\n48#1:162\n29#1:86\n30#1:105,2\n30#1:107,2\n30#1:113,11\n48#1:143,2\n48#1:145,2\n48#1:151,11\n30#1:109,4\n48#1:147,4\n*E\n"
    }
.end annotation


# static fields
.field private static _troubleshoot:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTroubleshoot(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/TroubleshootKt;->_troubleshoot:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Troubleshoot"

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
    const v4, 0x41a4b852    # 20.59f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x41b00000    # 22.0f

    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v4, -0x3f69eb85    # -4.69f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const/high16 v25, 0x41980000    # 19.0f

    .line 85
    .line 86
    const/high16 v26, 0x41300000    # 11.0f

    .line 87
    .line 88
    const v21, 0x4192f5c3    # 18.37f

    .line 89
    .line 90
    .line 91
    const v22, 0x4168cccd    # 14.55f

    .line 92
    .line 93
    .line 94
    const/high16 v23, 0x41980000    # 19.0f

    .line 95
    .line 96
    const v24, 0x414d999a    # 12.85f

    .line 97
    .line 98
    .line 99
    move-object/from16 v20, v2

    .line 100
    .line 101
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v25, -0x3f000000    # -8.0f

    .line 105
    .line 106
    const/high16 v26, -0x3f000000    # -8.0f

    .line 107
    .line 108
    const/16 v21, 0x0

    .line 109
    .line 110
    const v22, -0x3f728f5c    # -4.42f

    .line 111
    .line 112
    .line 113
    const v23, -0x3f9ae148    # -3.58f

    .line 114
    .line 115
    .line 116
    const/high16 v24, -0x3f000000    # -8.0f

    .line 117
    .line 118
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v25, -0x3f023d71    # -7.93f

    .line 122
    .line 123
    .line 124
    const/high16 v26, 0x40e00000    # 7.0f

    .line 125
    .line 126
    const v21, -0x3f7d70a4    # -4.08f

    .line 127
    .line 128
    .line 129
    const/16 v22, 0x0

    .line 130
    .line 131
    const v23, -0x3f11eb85    # -7.44f

    .line 132
    .line 133
    .line 134
    const v24, 0x40433333    # 3.05f

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v4, 0x400147ae    # 2.02f

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v25, 0x41300000    # 11.0f

    .line 147
    .line 148
    const/high16 v26, 0x40a00000    # 5.0f

    .line 149
    .line 150
    const v21, 0x40b23d71    # 5.57f

    .line 151
    .line 152
    .line 153
    const v22, 0x40e570a4    # 7.17f

    .line 154
    .line 155
    .line 156
    const v23, 0x41007ae1    # 8.03f

    .line 157
    .line 158
    .line 159
    const/high16 v24, 0x40a00000    # 5.0f

    .line 160
    .line 161
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v25, 0x40c00000    # 6.0f

    .line 165
    .line 166
    const/high16 v26, 0x40c00000    # 6.0f

    .line 167
    .line 168
    const v21, 0x4053d70a    # 3.31f

    .line 169
    .line 170
    .line 171
    const/16 v22, 0x0

    .line 172
    .line 173
    const/high16 v23, 0x40c00000    # 6.0f

    .line 174
    .line 175
    const v24, 0x402c28f6    # 2.69f

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v4, -0x3fd3d70a    # -2.69f

    .line 182
    .line 183
    .line 184
    const/high16 v6, -0x3f400000    # -6.0f

    .line 185
    .line 186
    const/high16 v7, 0x40c00000    # 6.0f

    .line 187
    .line 188
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v25, -0x3f51999a    # -5.45f

    .line 192
    .line 193
    .line 194
    const/high16 v26, -0x3fa00000    # -3.5f

    .line 195
    .line 196
    const v21, -0x3fe51eb8    # -2.42f

    .line 197
    .line 198
    .line 199
    const/high16 v23, -0x3f700000    # -4.5f

    .line 200
    .line 201
    const v24, -0x4047ae14    # -1.44f

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v4, 0x4059999a    # 3.4f

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v25, 0x41300000    # 11.0f

    .line 214
    .line 215
    const/high16 v26, 0x41980000    # 19.0f

    .line 216
    .line 217
    const v21, 0x408e6666    # 4.45f

    .line 218
    .line 219
    .line 220
    const v22, 0x4185851f    # 16.69f

    .line 221
    .line 222
    .line 223
    const v23, 0x40eeb852    # 7.46f

    .line 224
    .line 225
    .line 226
    const/high16 v24, 0x41980000    # 19.0f

    .line 227
    .line 228
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v25, 0x409ccccd    # 4.9f

    .line 232
    .line 233
    .line 234
    const v26, -0x4027ae14    # -1.69f

    .line 235
    .line 236
    .line 237
    const v21, 0x3feccccd    # 1.85f

    .line 238
    .line 239
    .line 240
    const/16 v22, 0x0

    .line 241
    .line 242
    const v23, 0x40633333    # 3.55f

    .line 243
    .line 244
    .line 245
    const v24, -0x40deb852    # -0.63f

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v4, 0x41a4b852    # 20.59f

    .line 252
    .line 253
    .line 254
    const/high16 v6, 0x41b00000    # 22.0f

    .line 255
    .line 256
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    const/16 v16, 0x3800

    .line 270
    .line 271
    const/16 v17, 0x0

    .line 272
    .line 273
    const/high16 v6, 0x3f800000    # 1.0f

    .line 274
    .line 275
    const/high16 v8, 0x3f800000    # 1.0f

    .line 276
    .line 277
    const/4 v7, 0x0

    .line 278
    const/high16 v9, 0x3f800000    # 1.0f

    .line 279
    .line 280
    const/high16 v12, 0x3f800000    # 1.0f

    .line 281
    .line 282
    const/4 v13, 0x0

    .line 283
    const/4 v14, 0x0

    .line 284
    const/4 v15, 0x0

    .line 285
    const-string v4, ""

    .line 286
    .line 287
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 288
    .line 289
    .line 290
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 291
    .line 292
    .line 293
    move-result v3

    .line 294
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 295
    .line 296
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 297
    .line 298
    .line 299
    move-result-wide v6

    .line 300
    const/4 v0, 0x0

    .line 301
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 302
    .line 303
    .line 304
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 305
    .line 306
    .line 307
    move-result v10

    .line 308
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 309
    .line 310
    .line 311
    move-result v11

    .line 312
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 315
    .line 316
    .line 317
    const v2, 0x4106e148    # 8.43f

    .line 318
    .line 319
    .line 320
    const v4, 0x411b0a3d    # 9.69f

    .line 321
    .line 322
    .line 323
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v2, 0x3f9c28f6    # 1.22f

    .line 327
    .line 328
    .line 329
    const v4, 0x40a9eb85    # 5.31f

    .line 330
    .line 331
    .line 332
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v2, 0x3fd1eb85    # 1.64f

    .line 336
    .line 337
    .line 338
    const/4 v4, 0x0

    .line 339
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v2, 0x3fa147ae    # 1.26f

    .line 343
    .line 344
    .line 345
    const v4, -0x3f8e147b    # -3.78f

    .line 346
    .line 347
    .line 348
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v2, 0x3f733333    # 0.95f

    .line 352
    .line 353
    .line 354
    const v4, 0x4011eb85    # 2.28f

    .line 355
    .line 356
    .line 357
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/high16 v2, 0x40000000    # 2.0f

    .line 361
    .line 362
    const/4 v4, 0x0

    .line 363
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const/high16 v2, -0x40400000    # -1.5f

    .line 367
    .line 368
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/high16 v2, -0x40800000    # -1.0f

    .line 372
    .line 373
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 377
    .line 378
    const/high16 v4, -0x40600000    # -1.25f

    .line 379
    .line 380
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v2, -0x403ae148    # -1.54f

    .line 384
    .line 385
    .line 386
    const/4 v4, 0x0

    .line 387
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v2, -0x4070a3d7    # -1.12f

    .line 391
    .line 392
    .line 393
    const v4, 0x4057ae14    # 3.37f

    .line 394
    .line 395
    .line 396
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const v2, -0x406147ae    # -1.24f

    .line 400
    .line 401
    .line 402
    const v4, -0x3f5428f6    # -5.37f

    .line 403
    .line 404
    .line 405
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v2, -0x402ccccd    # -1.65f

    .line 409
    .line 410
    .line 411
    const/4 v4, 0x0

    .line 412
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v2, 0x40800000    # 4.0f

    .line 416
    .line 417
    const/high16 v4, -0x40600000    # -1.25f

    .line 418
    .line 419
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v2, -0x3f51999a    # -5.45f

    .line 423
    .line 424
    .line 425
    const/4 v4, 0x0

    .line 426
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 430
    .line 431
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const v2, 0x40d1999a    # 6.55f

    .line 435
    .line 436
    .line 437
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 444
    .line 445
    .line 446
    move-result-object v2

    .line 447
    const/high16 v6, 0x3f800000    # 1.0f

    .line 448
    .line 449
    const/4 v7, 0x0

    .line 450
    const-string v4, ""

    .line 451
    .line 452
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    sput-object v0, Landroidx/compose/material/icons/outlined/TroubleshootKt;->_troubleshoot:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 461
    .line 462
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 463
    .line 464
    .line 465
    return-object v0
.end method
