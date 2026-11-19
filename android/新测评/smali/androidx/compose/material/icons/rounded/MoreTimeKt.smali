.class public final Landroidx/compose/material/icons/rounded/MoreTimeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_moreTime",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "MoreTime",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getMoreTime",
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
        "SMAP\nMoreTime.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MoreTime.kt\nandroidx/compose/material/icons/rounded/MoreTimeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,84:1\n212#2,12:85\n233#2,18:98\n253#2:135\n233#2,18:136\n253#2:173\n233#2,18:174\n253#2:211\n174#3:97\n705#4,2:116\n717#4,2:118\n719#4,11:124\n705#4,2:154\n717#4,2:156\n719#4,11:162\n705#4,2:192\n717#4,2:194\n719#4,11:200\n72#5,4:120\n72#5,4:158\n72#5,4:196\n*S KotlinDebug\n*F\n+ 1 MoreTime.kt\nandroidx/compose/material/icons/rounded/MoreTimeKt\n*L\n29#1:85,12\n30#1:98,18\n30#1:135\n43#1:136,18\n43#1:173\n59#1:174,18\n59#1:211\n29#1:97\n30#1:116,2\n30#1:118,2\n30#1:124,11\n43#1:154,2\n43#1:156,2\n43#1:162,11\n59#1:192,2\n59#1:194,2\n59#1:200,11\n30#1:120,4\n43#1:158,4\n59#1:196,4\n*E\n"
    }
.end annotation


# static fields
.field private static _moreTime:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMoreTime(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/MoreTimeKt;->_moreTime:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.MoreTime"

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
    const/high16 v4, 0x412c0000    # 10.75f

    .line 71
    .line 72
    const/high16 v6, 0x41000000    # 8.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x41200000    # 10.0f

    .line 78
    .line 79
    const/high16 v26, 0x410c0000    # 8.75f

    .line 80
    .line 81
    const v21, 0x412570a4    # 10.34f

    .line 82
    .line 83
    .line 84
    const/high16 v22, 0x41000000    # 8.0f

    .line 85
    .line 86
    const/high16 v23, 0x41200000    # 10.0f

    .line 87
    .line 88
    const v24, 0x410570a4    # 8.34f

    .line 89
    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v4, 0x4096147b    # 4.69f

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v25, 0x3ef0a3d7    # 0.47f

    .line 103
    .line 104
    .line 105
    const v26, 0x3f59999a    # 0.85f

    .line 106
    .line 107
    .line 108
    const/16 v21, 0x0

    .line 109
    .line 110
    const v22, 0x3eb33333    # 0.35f

    .line 111
    .line 112
    .line 113
    const v23, 0x3e3851ec    # 0.18f

    .line 114
    .line 115
    .line 116
    const v24, 0x3f2b851f    # 0.67f

    .line 117
    .line 118
    .line 119
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const v4, 0x4068f5c3    # 3.64f

    .line 123
    .line 124
    .line 125
    const v6, 0x400f5c29    # 2.24f

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v25, 0x3f7851ec    # 0.97f

    .line 132
    .line 133
    .line 134
    const v26, -0x41a8f5c3    # -0.21f

    .line 135
    .line 136
    .line 137
    const v21, 0x3ea8f5c3    # 0.33f

    .line 138
    .line 139
    .line 140
    const v22, 0x3e4ccccd    # 0.2f

    .line 141
    .line 142
    .line 143
    const v23, 0x3f428f5c    # 0.76f

    .line 144
    .line 145
    .line 146
    const v24, 0x3de147ae    # 0.11f

    .line 147
    .line 148
    .line 149
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v25, -0x41947ae1    # -0.23f

    .line 153
    .line 154
    .line 155
    const v26, -0x407eb852    # -1.01f

    .line 156
    .line 157
    .line 158
    const v21, 0x3e6b851f    # 0.23f

    .line 159
    .line 160
    .line 161
    const v22, -0x4151eb85    # -0.34f

    .line 162
    .line 163
    .line 164
    const v23, 0x3df5c28f    # 0.12f

    .line 165
    .line 166
    .line 167
    const v24, -0x40b33333    # -0.8f

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v4, 0x41380000    # 11.5f

    .line 174
    .line 175
    const v6, 0x4154cccd    # 13.3f

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v4, 0x410c0000    # 8.75f

    .line 182
    .line 183
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const/high16 v25, 0x412c0000    # 10.75f

    .line 187
    .line 188
    const/high16 v26, 0x41000000    # 8.0f

    .line 189
    .line 190
    const/high16 v21, 0x41380000    # 11.5f

    .line 191
    .line 192
    const v22, 0x410570a4    # 8.34f

    .line 193
    .line 194
    .line 195
    const v23, 0x41328f5c    # 11.16f

    .line 196
    .line 197
    .line 198
    const/high16 v24, 0x41000000    # 8.0f

    .line 199
    .line 200
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    const/16 v16, 0x3800

    .line 211
    .line 212
    const/16 v17, 0x0

    .line 213
    .line 214
    const/high16 v6, 0x3f800000    # 1.0f

    .line 215
    .line 216
    const/high16 v8, 0x3f800000    # 1.0f

    .line 217
    .line 218
    const/4 v7, 0x0

    .line 219
    const/high16 v9, 0x3f800000    # 1.0f

    .line 220
    .line 221
    const/high16 v12, 0x3f800000    # 1.0f

    .line 222
    .line 223
    const/4 v13, 0x0

    .line 224
    const/4 v14, 0x0

    .line 225
    const/4 v15, 0x0

    .line 226
    const-string v4, ""

    .line 227
    .line 228
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 229
    .line 230
    .line 231
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 232
    .line 233
    .line 234
    move-result v3

    .line 235
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 236
    .line 237
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 238
    .line 239
    .line 240
    move-result-wide v6

    .line 241
    const/4 v2, 0x0

    .line 242
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 246
    .line 247
    .line 248
    move-result v10

    .line 249
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 250
    .line 251
    .line 252
    move-result v11

    .line 253
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 256
    .line 257
    .line 258
    const/high16 v4, 0x41400000    # 12.0f

    .line 259
    .line 260
    const v6, 0x418f5c29    # 17.92f

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v25, 0x3da3d70a    # 0.08f

    .line 267
    .line 268
    .line 269
    const/high16 v26, 0x3f800000    # 1.0f

    .line 270
    .line 271
    const v21, 0x3d4ccccd    # 0.05f

    .line 272
    .line 273
    .line 274
    const v22, 0x3ea8f5c3    # 0.33f

    .line 275
    .line 276
    .line 277
    const v23, 0x3da3d70a    # 0.08f

    .line 278
    .line 279
    .line 280
    const v24, 0x3f28f5c3    # 0.66f

    .line 281
    .line 282
    .line 283
    move-object/from16 v20, v2

    .line 284
    .line 285
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/high16 v25, -0x3f200000    # -7.0f

    .line 289
    .line 290
    const/high16 v26, 0x40e00000    # 7.0f

    .line 291
    .line 292
    const/16 v21, 0x0

    .line 293
    .line 294
    const v22, 0x4079999a    # 3.9f

    .line 295
    .line 296
    .line 297
    const v23, -0x3fb9999a    # -3.1f

    .line 298
    .line 299
    .line 300
    const/high16 v24, 0x40e00000    # 7.0f

    .line 301
    .line 302
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v4, -0x3fb9999a    # -3.1f

    .line 306
    .line 307
    .line 308
    const/high16 v6, -0x3f200000    # -7.0f

    .line 309
    .line 310
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/high16 v25, 0x40e00000    # 7.0f

    .line 314
    .line 315
    const/high16 v26, -0x3f200000    # -7.0f

    .line 316
    .line 317
    const v22, -0x3f866666    # -3.9f

    .line 318
    .line 319
    .line 320
    const v23, 0x40466666    # 3.1f

    .line 321
    .line 322
    .line 323
    const/high16 v24, -0x3f200000    # -7.0f

    .line 324
    .line 325
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const/high16 v25, 0x40000000    # 2.0f

    .line 329
    .line 330
    const v26, 0x3e947ae1    # 0.29f

    .line 331
    .line 332
    .line 333
    const v21, 0x3f333333    # 0.7f

    .line 334
    .line 335
    .line 336
    const/16 v22, 0x0

    .line 337
    .line 338
    const v23, 0x3faf5c29    # 1.37f

    .line 339
    .line 340
    .line 341
    const v24, 0x3dcccccd    # 0.1f

    .line 342
    .line 343
    .line 344
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v4, 0x40875c29    # 4.23f

    .line 348
    .line 349
    .line 350
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/high16 v25, 0x41300000    # 11.0f

    .line 354
    .line 355
    const/high16 v26, 0x40800000    # 4.0f

    .line 356
    .line 357
    const v21, 0x4145c28f    # 12.36f

    .line 358
    .line 359
    .line 360
    const v22, 0x40828f5c    # 4.08f

    .line 361
    .line 362
    .line 363
    const v23, 0x413b0a3d    # 11.69f

    .line 364
    .line 365
    .line 366
    const/high16 v24, 0x40800000    # 4.0f

    .line 367
    .line 368
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/high16 v25, -0x3ef00000    # -9.0f

    .line 372
    .line 373
    const/high16 v26, 0x41100000    # 9.0f

    .line 374
    .line 375
    const/high16 v21, -0x3f600000    # -5.0f

    .line 376
    .line 377
    const/16 v22, 0x0

    .line 378
    .line 379
    const/high16 v23, -0x3ef00000    # -9.0f

    .line 380
    .line 381
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/high16 v4, 0x40800000    # 4.0f

    .line 385
    .line 386
    const/high16 v6, 0x41100000    # 9.0f

    .line 387
    .line 388
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v4, -0x3f800000    # -4.0f

    .line 392
    .line 393
    const/high16 v6, -0x3ef00000    # -9.0f

    .line 394
    .line 395
    const/high16 v7, 0x41100000    # 9.0f

    .line 396
    .line 397
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v25, -0x428a3d71    # -0.06f

    .line 401
    .line 402
    .line 403
    const/high16 v26, -0x40800000    # -1.0f

    .line 404
    .line 405
    const/16 v21, 0x0

    .line 406
    .line 407
    const v22, -0x4151eb85    # -0.34f

    .line 408
    .line 409
    .line 410
    const v23, -0x435c28f6    # -0.02f

    .line 411
    .line 412
    .line 413
    const v24, -0x40d47ae1    # -0.67f

    .line 414
    .line 415
    .line 416
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v4, 0x418f5c29    # 17.92f

    .line 420
    .line 421
    .line 422
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 429
    .line 430
    .line 431
    move-result-object v2

    .line 432
    const/high16 v6, 0x3f800000    # 1.0f

    .line 433
    .line 434
    const/4 v7, 0x0

    .line 435
    const-string v4, ""

    .line 436
    .line 437
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 438
    .line 439
    .line 440
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 441
    .line 442
    .line 443
    move-result v3

    .line 444
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 445
    .line 446
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 447
    .line 448
    .line 449
    move-result-wide v6

    .line 450
    const/4 v0, 0x0

    .line 451
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 452
    .line 453
    .line 454
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 455
    .line 456
    .line 457
    move-result v10

    .line 458
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 459
    .line 460
    .line 461
    move-result v11

    .line 462
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 465
    .line 466
    .line 467
    const/high16 v0, 0x41b00000    # 22.0f

    .line 468
    .line 469
    const/high16 v2, 0x40a00000    # 5.0f

    .line 470
    .line 471
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const/high16 v0, -0x40000000    # -2.0f

    .line 475
    .line 476
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const/high16 v0, 0x40400000    # 3.0f

    .line 480
    .line 481
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const/high16 v17, -0x40800000    # -1.0f

    .line 485
    .line 486
    const/high16 v18, -0x40800000    # -1.0f

    .line 487
    .line 488
    const v14, -0x40f33333    # -0.55f

    .line 489
    .line 490
    .line 491
    const v15, -0x4119999a    # -0.45f

    .line 492
    .line 493
    .line 494
    const/high16 v16, -0x40800000    # -1.0f

    .line 495
    .line 496
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const v0, 0x3ee66666    # 0.45f

    .line 500
    .line 501
    .line 502
    const/high16 v2, 0x3f800000    # 1.0f

    .line 503
    .line 504
    const/high16 v4, -0x40800000    # -1.0f

    .line 505
    .line 506
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const/high16 v0, 0x40000000    # 2.0f

    .line 510
    .line 511
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const/high16 v0, -0x40000000    # -2.0f

    .line 515
    .line 516
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/high16 v18, 0x3f800000    # 1.0f

    .line 520
    .line 521
    const v13, -0x40f33333    # -0.55f

    .line 522
    .line 523
    .line 524
    const/4 v14, 0x0

    .line 525
    const/high16 v15, -0x40800000    # -1.0f

    .line 526
    .line 527
    const v16, 0x3ee66666    # 0.45f

    .line 528
    .line 529
    .line 530
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const/high16 v17, 0x3f800000    # 1.0f

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
    const/high16 v0, 0x40000000    # 2.0f

    .line 548
    .line 549
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const v0, -0x4119999a    # -0.45f

    .line 559
    .line 560
    .line 561
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const/high16 v0, 0x40e00000    # 7.0f

    .line 565
    .line 566
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const/high16 v0, 0x40000000    # 2.0f

    .line 570
    .line 571
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const/high16 v18, -0x40800000    # -1.0f

    .line 575
    .line 576
    const v13, 0x3f0ccccd    # 0.55f

    .line 577
    .line 578
    .line 579
    const/4 v14, 0x0

    .line 580
    const/high16 v15, 0x3f800000    # 1.0f

    .line 581
    .line 582
    const v16, -0x4119999a    # -0.45f

    .line 583
    .line 584
    .line 585
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const/high16 v17, 0x41b00000    # 22.0f

    .line 589
    .line 590
    const/high16 v18, 0x40a00000    # 5.0f

    .line 591
    .line 592
    const/high16 v13, 0x41b80000    # 23.0f

    .line 593
    .line 594
    const v14, 0x40ae6666    # 5.45f

    .line 595
    .line 596
    .line 597
    const v15, 0x41b46666    # 22.55f

    .line 598
    .line 599
    .line 600
    const/high16 v16, 0x40a00000    # 5.0f

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
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 609
    .line 610
    .line 611
    move-result-object v2

    .line 612
    const/16 v16, 0x3800

    .line 613
    .line 614
    const/16 v17, 0x0

    .line 615
    .line 616
    const/high16 v6, 0x3f800000    # 1.0f

    .line 617
    .line 618
    const/4 v7, 0x0

    .line 619
    const/high16 v12, 0x3f800000    # 1.0f

    .line 620
    .line 621
    const/4 v13, 0x0

    .line 622
    const/4 v14, 0x0

    .line 623
    const/4 v15, 0x0

    .line 624
    const-string v4, ""

    .line 625
    .line 626
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 627
    .line 628
    .line 629
    move-result-object v0

    .line 630
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    sput-object v0, Landroidx/compose/material/icons/rounded/MoreTimeKt;->_moreTime:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 635
    .line 636
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 637
    .line 638
    .line 639
    return-object v0
.end method
