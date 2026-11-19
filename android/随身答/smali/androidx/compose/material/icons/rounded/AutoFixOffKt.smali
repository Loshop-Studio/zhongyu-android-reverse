.class public final Landroidx/compose/material/icons/rounded/AutoFixOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_autoFixOff",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "AutoFixOff",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getAutoFixOff",
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
        "SMAP\nAutoFixOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoFixOff.kt\nandroidx/compose/material/icons/rounded/AutoFixOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,83:1\n212#2,12:84\n233#2,18:97\n253#2:134\n233#2,18:135\n253#2:172\n233#2,18:173\n253#2:210\n174#3:96\n705#4,2:115\n717#4,2:117\n719#4,11:123\n705#4,2:153\n717#4,2:155\n719#4,11:161\n705#4,2:191\n717#4,2:193\n719#4,11:199\n72#5,4:119\n72#5,4:157\n72#5,4:195\n*S KotlinDebug\n*F\n+ 1 AutoFixOff.kt\nandroidx/compose/material/icons/rounded/AutoFixOffKt\n*L\n29#1:84,12\n30#1:97,18\n30#1:134\n46#1:135,18\n46#1:172\n60#1:173,18\n60#1:210\n29#1:96\n30#1:115,2\n30#1:117,2\n30#1:123,11\n46#1:153,2\n46#1:155,2\n46#1:161,11\n60#1:191,2\n60#1:193,2\n60#1:199,11\n30#1:119,4\n46#1:157,4\n60#1:195,4\n*E\n"
    }
.end annotation


# static fields
.field private static _autoFixOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAutoFixOff(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/AutoFixOffKt;->_autoFixOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.AutoFixOff"

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
    const v4, 0x40633333    # 3.55f

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
    const v4, -0x41051eb8    # -0.49f

    .line 79
    .line 80
    .line 81
    const v6, -0x407851ec    # -1.06f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v4, 0x41a3999a    # 20.45f

    .line 88
    .line 89
    .line 90
    const/high16 v6, 0x40000000    # 2.0f

    .line 91
    .line 92
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const v25, -0x40970a3d    # -0.91f

    .line 96
    .line 97
    .line 98
    const/16 v26, 0x0

    .line 99
    .line 100
    const v21, -0x41c7ae14    # -0.18f

    .line 101
    .line 102
    .line 103
    const v22, -0x413851ec    # -0.39f

    .line 104
    .line 105
    .line 106
    const v23, -0x40c51eb8    # -0.73f

    .line 107
    .line 108
    .line 109
    const v24, -0x413851ec    # -0.39f

    .line 110
    .line 111
    .line 112
    move-object/from16 v20, v2

    .line 113
    .line 114
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v4, 0x3f87ae14    # 1.06f

    .line 118
    .line 119
    .line 120
    const v6, -0x41051eb8    # -0.49f

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v4, 0x41900000    # 18.0f

    .line 127
    .line 128
    const v6, 0x40633333    # 3.55f

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/16 v25, 0x0

    .line 135
    .line 136
    const v26, 0x3f68f5c3    # 0.91f

    .line 137
    .line 138
    .line 139
    const v21, -0x413851ec    # -0.39f

    .line 140
    .line 141
    .line 142
    const v22, 0x3e3851ec    # 0.18f

    .line 143
    .line 144
    .line 145
    const v23, -0x413851ec    # -0.39f

    .line 146
    .line 147
    .line 148
    const v24, 0x3f3ae148    # 0.73f

    .line 149
    .line 150
    .line 151
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v4, 0x3efae148    # 0.49f

    .line 155
    .line 156
    .line 157
    const v6, 0x3f87ae14    # 1.06f

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v4, 0x419c6666    # 19.55f

    .line 164
    .line 165
    .line 166
    const/high16 v6, 0x40c00000    # 6.0f

    .line 167
    .line 168
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v25, 0x3f68f5c3    # 0.91f

    .line 172
    .line 173
    .line 174
    const/16 v26, 0x0

    .line 175
    .line 176
    const v21, 0x3e3851ec    # 0.18f

    .line 177
    .line 178
    .line 179
    const v22, 0x3ec7ae14    # 0.39f

    .line 180
    .line 181
    .line 182
    const v23, 0x3f3ae148    # 0.73f

    .line 183
    .line 184
    .line 185
    const v24, 0x3ec7ae14    # 0.39f

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v4, 0x3efae148    # 0.49f

    .line 192
    .line 193
    .line 194
    const v6, -0x407851ec    # -1.06f

    .line 195
    .line 196
    .line 197
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v4, 0x408e6666    # 4.45f

    .line 201
    .line 202
    .line 203
    const/high16 v6, 0x41b00000    # 22.0f

    .line 204
    .line 205
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v25, 0x41b00000    # 22.0f

    .line 209
    .line 210
    const v26, 0x40633333    # 3.55f

    .line 211
    .line 212
    .line 213
    const v21, 0x41b31eb8    # 22.39f

    .line 214
    .line 215
    .line 216
    const v22, 0x4088f5c3    # 4.28f

    .line 217
    .line 218
    .line 219
    const v23, 0x41b31eb8    # 22.39f

    .line 220
    .line 221
    .line 222
    const v24, 0x406e147b    # 3.72f

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    const/16 v16, 0x3800

    .line 236
    .line 237
    const/16 v17, 0x0

    .line 238
    .line 239
    const/high16 v6, 0x3f800000    # 1.0f

    .line 240
    .line 241
    const/high16 v8, 0x3f800000    # 1.0f

    .line 242
    .line 243
    const/4 v7, 0x0

    .line 244
    const/high16 v9, 0x3f800000    # 1.0f

    .line 245
    .line 246
    const/high16 v12, 0x3f800000    # 1.0f

    .line 247
    .line 248
    const/4 v13, 0x0

    .line 249
    const/4 v14, 0x0

    .line 250
    const/4 v15, 0x0

    .line 251
    const-string v4, ""

    .line 252
    .line 253
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 254
    .line 255
    .line 256
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 257
    .line 258
    .line 259
    move-result v3

    .line 260
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 261
    .line 262
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 263
    .line 264
    .line 265
    move-result-wide v6

    .line 266
    const/4 v2, 0x0

    .line 267
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 271
    .line 272
    .line 273
    move-result v10

    .line 274
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 275
    .line 276
    .line 277
    move-result v11

    .line 278
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 281
    .line 282
    .line 283
    const v4, 0x4106b852    # 8.42f

    .line 284
    .line 285
    .line 286
    const v6, 0x4162b852    # 14.17f

    .line 287
    .line 288
    .line 289
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v4, 0x3fb47ae1    # 1.41f

    .line 293
    .line 294
    .line 295
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v4, -0x40451eb8    # -1.46f

    .line 299
    .line 300
    .line 301
    const v6, 0x3fbae148    # 1.46f

    .line 302
    .line 303
    .line 304
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v4, 0x3fb47ae1    # 1.41f

    .line 308
    .line 309
    .line 310
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v4, -0x3ff51eb8    # -2.17f

    .line 314
    .line 315
    .line 316
    const v6, 0x400ae148    # 2.17f

    .line 317
    .line 318
    .line 319
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/16 v25, 0x0

    .line 323
    .line 324
    const v26, -0x404b851f    # -1.41f

    .line 325
    .line 326
    .line 327
    const v21, 0x3ec7ae14    # 0.39f

    .line 328
    .line 329
    .line 330
    const v22, -0x413851ec    # -0.39f

    .line 331
    .line 332
    .line 333
    const v23, 0x3ec7ae14    # 0.39f

    .line 334
    .line 335
    .line 336
    const v24, -0x407d70a4    # -1.02f

    .line 337
    .line 338
    .line 339
    move-object/from16 v20, v2

    .line 340
    .line 341
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v4, -0x3fcae148    # -2.83f

    .line 345
    .line 346
    .line 347
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v25, -0x404b851f    # -1.41f

    .line 351
    .line 352
    .line 353
    const/16 v26, 0x0

    .line 354
    .line 355
    const v21, -0x413851ec    # -0.39f

    .line 356
    .line 357
    .line 358
    const v23, -0x407d70a4    # -1.02f

    .line 359
    .line 360
    .line 361
    const v24, -0x413851ec    # -0.39f

    .line 362
    .line 363
    .line 364
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v4, -0x3ff51eb8    # -2.17f

    .line 368
    .line 369
    .line 370
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v4, 0x3fb47ae1    # 1.41f

    .line 374
    .line 375
    .line 376
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v4, 0x4106b852    # 8.42f

    .line 380
    .line 381
    .line 382
    const v6, 0x4162b852    # 14.17f

    .line 383
    .line 384
    .line 385
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 392
    .line 393
    .line 394
    move-result-object v2

    .line 395
    const/high16 v6, 0x3f800000    # 1.0f

    .line 396
    .line 397
    const/4 v7, 0x0

    .line 398
    const-string v4, ""

    .line 399
    .line 400
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 401
    .line 402
    .line 403
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 404
    .line 405
    .line 406
    move-result v3

    .line 407
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 408
    .line 409
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 410
    .line 411
    .line 412
    move-result-wide v6

    .line 413
    const/4 v0, 0x0

    .line 414
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 415
    .line 416
    .line 417
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 418
    .line 419
    .line 420
    move-result v10

    .line 421
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 422
    .line 423
    .line 424
    move-result v11

    .line 425
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 428
    .line 429
    .line 430
    const v0, 0x40066666    # 2.1f

    .line 431
    .line 432
    .line 433
    const v2, 0x409dc28f    # 4.93f

    .line 434
    .line 435
    .line 436
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v0, 0x40cb851f    # 6.36f

    .line 440
    .line 441
    .line 442
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const v0, 0x40c570a4    # 6.17f

    .line 446
    .line 447
    .line 448
    const v2, -0x3f3a8f5c    # -6.17f

    .line 449
    .line 450
    .line 451
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const/16 v17, 0x0

    .line 455
    .line 456
    const v18, 0x3fb47ae1    # 1.41f

    .line 457
    .line 458
    .line 459
    const v13, -0x413851ec    # -0.39f

    .line 460
    .line 461
    .line 462
    const v14, 0x3ec7ae14    # 0.39f

    .line 463
    .line 464
    .line 465
    const v15, -0x413851ec    # -0.39f

    .line 466
    .line 467
    .line 468
    const v16, 0x3f828f5c    # 1.02f

    .line 469
    .line 470
    .line 471
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v0, 0x40351eb8    # 2.83f

    .line 475
    .line 476
    .line 477
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const v17, 0x3fb47ae1    # 1.41f

    .line 481
    .line 482
    .line 483
    const/16 v18, 0x0

    .line 484
    .line 485
    const v13, 0x3ec7ae14    # 0.39f

    .line 486
    .line 487
    .line 488
    const v15, 0x3f828f5c    # 1.02f

    .line 489
    .line 490
    .line 491
    const v16, 0x3ec7ae14    # 0.39f

    .line 492
    .line 493
    .line 494
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const v0, 0x40c570a4    # 6.17f

    .line 498
    .line 499
    .line 500
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const v0, 0x40cb851f    # 6.36f

    .line 504
    .line 505
    .line 506
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const/4 v0, 0x0

    .line 513
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const/16 v17, 0x0

    .line 517
    .line 518
    const v18, -0x404b851f    # -1.41f

    .line 519
    .line 520
    .line 521
    const v14, -0x413851ec    # -0.39f

    .line 522
    .line 523
    .line 524
    const v15, 0x3ec7ae14    # 0.39f

    .line 525
    .line 526
    .line 527
    const v16, -0x407d70a4    # -1.02f

    .line 528
    .line 529
    .line 530
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const v0, 0x4060a3d7    # 3.51f

    .line 534
    .line 535
    .line 536
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const v17, -0x404b851f    # -1.41f

    .line 540
    .line 541
    .line 542
    const/16 v18, 0x0

    .line 543
    .line 544
    const v13, -0x413851ec    # -0.39f

    .line 545
    .line 546
    .line 547
    const v15, -0x407d70a4    # -1.02f

    .line 548
    .line 549
    .line 550
    const v16, -0x413851ec    # -0.39f

    .line 551
    .line 552
    .line 553
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const/4 v0, 0x0

    .line 557
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const v17, 0x40066666    # 2.1f

    .line 561
    .line 562
    .line 563
    const v18, 0x409dc28f    # 4.93f

    .line 564
    .line 565
    .line 566
    const v13, 0x3fdae148    # 1.71f

    .line 567
    .line 568
    .line 569
    const v14, 0x407a3d71    # 3.91f

    .line 570
    .line 571
    .line 572
    const v15, 0x3fdae148    # 1.71f

    .line 573
    .line 574
    .line 575
    const v16, 0x409147ae    # 4.54f

    .line 576
    .line 577
    .line 578
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 585
    .line 586
    .line 587
    move-result-object v2

    .line 588
    const/16 v16, 0x3800

    .line 589
    .line 590
    const/16 v17, 0x0

    .line 591
    .line 592
    const/high16 v6, 0x3f800000    # 1.0f

    .line 593
    .line 594
    const/4 v7, 0x0

    .line 595
    const/high16 v12, 0x3f800000    # 1.0f

    .line 596
    .line 597
    const/4 v13, 0x0

    .line 598
    const/4 v14, 0x0

    .line 599
    const/4 v15, 0x0

    .line 600
    const-string v4, ""

    .line 601
    .line 602
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 603
    .line 604
    .line 605
    move-result-object v0

    .line 606
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 607
    .line 608
    .line 609
    move-result-object v0

    .line 610
    sput-object v0, Landroidx/compose/material/icons/rounded/AutoFixOffKt;->_autoFixOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 611
    .line 612
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 613
    .line 614
    .line 615
    return-object v0
.end method
