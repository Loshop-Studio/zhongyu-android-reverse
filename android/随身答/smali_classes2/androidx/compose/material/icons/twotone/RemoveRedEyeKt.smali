.class public final Landroidx/compose/material/icons/twotone/RemoveRedEyeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_removeRedEye",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "RemoveRedEye",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getRemoveRedEye",
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
        "SMAP\nRemoveRedEye.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoveRedEye.kt\nandroidx/compose/material/icons/twotone/RemoveRedEyeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,75:1\n212#2,12:76\n233#2,18:89\n253#2:126\n233#2,18:127\n253#2:164\n174#3:88\n705#4,2:107\n717#4,2:109\n719#4,11:115\n705#4,2:145\n717#4,2:147\n719#4,11:153\n72#5,4:111\n72#5,4:149\n*S KotlinDebug\n*F\n+ 1 RemoveRedEye.kt\nandroidx/compose/material/icons/twotone/RemoveRedEyeKt\n*L\n29#1:76,12\n30#1:89,18\n30#1:126\n44#1:127,18\n44#1:164\n29#1:88\n30#1:107,2\n30#1:109,2\n30#1:115,11\n44#1:145,2\n44#1:147,2\n44#1:153,11\n30#1:111,4\n44#1:149,4\n*E\n"
    }
.end annotation


# static fields
.field private static _removeRedEye:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRemoveRedEye(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/RemoveRedEyeKt;->_removeRedEye:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.RemoveRedEye"

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
    const/high16 v4, 0x40d00000    # 6.5f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v25, -0x3ef2e148    # -8.82f

    .line 78
    .line 79
    .line 80
    const/high16 v26, 0x40b00000    # 5.5f

    .line 81
    .line 82
    const v21, -0x3f8d70a4    # -3.79f

    .line 83
    .line 84
    .line 85
    const/16 v22, 0x0

    .line 86
    .line 87
    const v23, -0x3f1a8f5c    # -7.17f

    .line 88
    .line 89
    .line 90
    const v24, 0x400851ec    # 2.13f

    .line 91
    .line 92
    .line 93
    move-object/from16 v20, v2

    .line 94
    .line 95
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v25, 0x410d1eb8    # 8.82f

    .line 99
    .line 100
    .line 101
    const v21, 0x3fd33333    # 1.65f

    .line 102
    .line 103
    .line 104
    const v22, 0x4057ae14    # 3.37f

    .line 105
    .line 106
    .line 107
    const v23, 0x40a0a3d7    # 5.02f

    .line 108
    .line 109
    .line 110
    const/high16 v24, 0x40b00000    # 5.5f

    .line 111
    .line 112
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v4, -0x3ff7ae14    # -2.13f

    .line 116
    .line 117
    .line 118
    const/high16 v6, -0x3f500000    # -5.5f

    .line 119
    .line 120
    const v7, 0x410d1eb8    # 8.82f

    .line 121
    .line 122
    .line 123
    const v8, 0x40e570a4    # 7.17f

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, v8, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v25, 0x41400000    # 12.0f

    .line 130
    .line 131
    const/high16 v26, 0x40d00000    # 6.5f

    .line 132
    .line 133
    const v21, 0x41995c29    # 19.17f

    .line 134
    .line 135
    .line 136
    const v22, 0x410a147b    # 8.63f

    .line 137
    .line 138
    .line 139
    const v23, 0x417ca3d7    # 15.79f

    .line 140
    .line 141
    .line 142
    const/high16 v24, 0x40d00000    # 6.5f

    .line 143
    .line 144
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v4, 0x41840000    # 16.5f

    .line 151
    .line 152
    const/high16 v6, 0x41400000    # 12.0f

    .line 153
    .line 154
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const/high16 v25, -0x3f700000    # -4.5f

    .line 158
    .line 159
    const/high16 v26, -0x3f700000    # -4.5f

    .line 160
    .line 161
    const v21, -0x3fe147ae    # -2.48f

    .line 162
    .line 163
    .line 164
    const/16 v22, 0x0

    .line 165
    .line 166
    const/high16 v23, -0x3f700000    # -4.5f

    .line 167
    .line 168
    const v24, -0x3ffeb852    # -2.02f

    .line 169
    .line 170
    .line 171
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v4, 0x411851ec    # 9.52f

    .line 175
    .line 176
    .line 177
    const/high16 v6, 0x40f00000    # 7.5f

    .line 178
    .line 179
    const/high16 v7, 0x41400000    # 12.0f

    .line 180
    .line 181
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v4, 0x400147ae    # 2.02f

    .line 185
    .line 186
    .line 187
    const/high16 v6, 0x40900000    # 4.5f

    .line 188
    .line 189
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v4, -0x3ffeb852    # -2.02f

    .line 193
    .line 194
    .line 195
    const/high16 v6, -0x3f700000    # -4.5f

    .line 196
    .line 197
    const/high16 v7, 0x40900000    # 4.5f

    .line 198
    .line 199
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    const/16 v16, 0x3800

    .line 210
    .line 211
    const/16 v17, 0x0

    .line 212
    .line 213
    const v6, 0x3e99999a    # 0.3f

    .line 214
    .line 215
    .line 216
    const v8, 0x3e99999a    # 0.3f

    .line 217
    .line 218
    .line 219
    const/4 v7, 0x0

    .line 220
    const/high16 v9, 0x3f800000    # 1.0f

    .line 221
    .line 222
    const/high16 v12, 0x3f800000    # 1.0f

    .line 223
    .line 224
    const/4 v13, 0x0

    .line 225
    const/4 v14, 0x0

    .line 226
    const/4 v15, 0x0

    .line 227
    const-string v4, ""

    .line 228
    .line 229
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 230
    .line 231
    .line 232
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 233
    .line 234
    .line 235
    move-result v3

    .line 236
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 237
    .line 238
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 239
    .line 240
    .line 241
    move-result-wide v6

    .line 242
    const/4 v0, 0x0

    .line 243
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 247
    .line 248
    .line 249
    move-result v10

    .line 250
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 251
    .line 252
    .line 253
    move-result v11

    .line 254
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 257
    .line 258
    .line 259
    const/high16 v0, 0x41400000    # 12.0f

    .line 260
    .line 261
    const/high16 v2, 0x40900000    # 4.5f

    .line 262
    .line 263
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v17, 0x3f800000    # 1.0f

    .line 267
    .line 268
    const/high16 v18, 0x41400000    # 12.0f

    .line 269
    .line 270
    const/high16 v13, 0x40e00000    # 7.0f

    .line 271
    .line 272
    const/high16 v14, 0x40900000    # 4.5f

    .line 273
    .line 274
    const v15, 0x402eb852    # 2.73f

    .line 275
    .line 276
    .line 277
    const v16, 0x40f3851f    # 7.61f

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const/high16 v17, 0x41300000    # 11.0f

    .line 284
    .line 285
    const/high16 v18, 0x40f00000    # 7.5f

    .line 286
    .line 287
    const v13, 0x3fdd70a4    # 1.73f

    .line 288
    .line 289
    .line 290
    const v14, 0x408c7ae1    # 4.39f

    .line 291
    .line 292
    .line 293
    const/high16 v15, 0x40c00000    # 6.0f

    .line 294
    .line 295
    const/high16 v16, 0x40f00000    # 7.5f

    .line 296
    .line 297
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v0, 0x41300000    # 11.0f

    .line 301
    .line 302
    const/high16 v2, -0x3f100000    # -7.5f

    .line 303
    .line 304
    const v4, 0x411451ec    # 9.27f

    .line 305
    .line 306
    .line 307
    const v6, -0x3fb8f5c3    # -3.11f

    .line 308
    .line 309
    .line 310
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/high16 v17, -0x3ed00000    # -11.0f

    .line 314
    .line 315
    const/high16 v18, -0x3f100000    # -7.5f

    .line 316
    .line 317
    const v13, -0x40228f5c    # -1.73f

    .line 318
    .line 319
    .line 320
    const v14, -0x3f73851f    # -4.39f

    .line 321
    .line 322
    .line 323
    const/high16 v15, -0x3f400000    # -6.0f

    .line 324
    .line 325
    const/high16 v16, -0x3f100000    # -7.5f

    .line 326
    .line 327
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const/high16 v0, 0x418c0000    # 17.5f

    .line 334
    .line 335
    const/high16 v2, 0x41400000    # 12.0f

    .line 336
    .line 337
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const v17, -0x3ef2e148    # -8.82f

    .line 341
    .line 342
    .line 343
    const/high16 v18, -0x3f500000    # -5.5f

    .line 344
    .line 345
    const v13, -0x3f8d70a4    # -3.79f

    .line 346
    .line 347
    .line 348
    const/4 v14, 0x0

    .line 349
    const v15, -0x3f1a8f5c    # -7.17f

    .line 350
    .line 351
    .line 352
    const v16, -0x3ff7ae14    # -2.13f

    .line 353
    .line 354
    .line 355
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v17, 0x41400000    # 12.0f

    .line 359
    .line 360
    const/high16 v18, 0x40d00000    # 6.5f

    .line 361
    .line 362
    const v13, 0x409a8f5c    # 4.83f

    .line 363
    .line 364
    .line 365
    const v14, 0x410a147b    # 8.63f

    .line 366
    .line 367
    .line 368
    const v15, 0x41035c29    # 8.21f

    .line 369
    .line 370
    .line 371
    const/high16 v16, 0x40d00000    # 6.5f

    .line 372
    .line 373
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const v0, 0x400851ec    # 2.13f

    .line 377
    .line 378
    .line 379
    const/high16 v2, 0x40b00000    # 5.5f

    .line 380
    .line 381
    const v4, 0x410d1eb8    # 8.82f

    .line 382
    .line 383
    .line 384
    const v6, 0x40e570a4    # 7.17f

    .line 385
    .line 386
    .line 387
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v17, -0x3ef2e148    # -8.82f

    .line 391
    .line 392
    .line 393
    const/high16 v18, 0x40b00000    # 5.5f

    .line 394
    .line 395
    const v13, -0x402ccccd    # -1.65f

    .line 396
    .line 397
    .line 398
    const v14, 0x4057ae14    # 3.37f

    .line 399
    .line 400
    .line 401
    const v15, -0x3f5f0a3d    # -5.03f

    .line 402
    .line 403
    .line 404
    const/high16 v16, 0x40b00000    # 5.5f

    .line 405
    .line 406
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const/high16 v0, 0x40f00000    # 7.5f

    .line 413
    .line 414
    const/high16 v2, 0x41400000    # 12.0f

    .line 415
    .line 416
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const/high16 v17, -0x3f700000    # -4.5f

    .line 420
    .line 421
    const/high16 v18, 0x40900000    # 4.5f

    .line 422
    .line 423
    const v13, -0x3fe147ae    # -2.48f

    .line 424
    .line 425
    .line 426
    const/4 v14, 0x0

    .line 427
    const/high16 v15, -0x3f700000    # -4.5f

    .line 428
    .line 429
    const v16, 0x400147ae    # 2.02f

    .line 430
    .line 431
    .line 432
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v0, 0x400147ae    # 2.02f

    .line 436
    .line 437
    .line 438
    const/high16 v2, 0x40900000    # 4.5f

    .line 439
    .line 440
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v0, -0x3ffeb852    # -2.02f

    .line 444
    .line 445
    .line 446
    const/high16 v2, -0x3f700000    # -4.5f

    .line 447
    .line 448
    const/high16 v4, 0x40900000    # 4.5f

    .line 449
    .line 450
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/high16 v0, 0x41680000    # 14.5f

    .line 460
    .line 461
    const/high16 v2, 0x41400000    # 12.0f

    .line 462
    .line 463
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 467
    .line 468
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 469
    .line 470
    const v13, -0x404f5c29    # -1.38f

    .line 471
    .line 472
    .line 473
    const/high16 v15, -0x3fe00000    # -2.5f

    .line 474
    .line 475
    const v16, -0x4070a3d7    # -1.12f

    .line 476
    .line 477
    .line 478
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const v0, 0x3f8f5c29    # 1.12f

    .line 482
    .line 483
    .line 484
    const/high16 v2, -0x3fe00000    # -2.5f

    .line 485
    .line 486
    const/high16 v4, 0x40200000    # 2.5f

    .line 487
    .line 488
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const/high16 v2, 0x40200000    # 2.5f

    .line 492
    .line 493
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const v0, -0x4070a3d7    # -1.12f

    .line 497
    .line 498
    .line 499
    const/high16 v2, -0x3fe00000    # -2.5f

    .line 500
    .line 501
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 508
    .line 509
    .line 510
    move-result-object v2

    .line 511
    const/16 v16, 0x3800

    .line 512
    .line 513
    const/16 v17, 0x0

    .line 514
    .line 515
    const/high16 v6, 0x3f800000    # 1.0f

    .line 516
    .line 517
    const/high16 v8, 0x3f800000    # 1.0f

    .line 518
    .line 519
    const/4 v7, 0x0

    .line 520
    const/high16 v12, 0x3f800000    # 1.0f

    .line 521
    .line 522
    const/4 v13, 0x0

    .line 523
    const/4 v15, 0x0

    .line 524
    const-string v4, ""

    .line 525
    .line 526
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 527
    .line 528
    .line 529
    move-result-object v0

    .line 530
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 531
    .line 532
    .line 533
    move-result-object v0

    .line 534
    sput-object v0, Landroidx/compose/material/icons/twotone/RemoveRedEyeKt;->_removeRedEye:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 535
    .line 536
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 537
    .line 538
    .line 539
    return-object v0
.end method
