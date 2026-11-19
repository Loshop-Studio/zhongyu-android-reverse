.class public final Landroidx/compose/material/icons/twotone/GroupOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_groupOff",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "GroupOff",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getGroupOff",
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
        "SMAP\nGroupOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GroupOff.kt\nandroidx/compose/material/icons/twotone/GroupOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,103:1\n212#2,12:104\n233#2,18:117\n253#2:154\n233#2,18:155\n253#2:192\n174#3:116\n705#4,2:135\n717#4,2:137\n719#4,11:143\n705#4,2:173\n717#4,2:175\n719#4,11:181\n72#5,4:139\n72#5,4:177\n*S KotlinDebug\n*F\n+ 1 GroupOff.kt\nandroidx/compose/material/icons/twotone/GroupOffKt\n*L\n29#1:104,12\n30#1:117,18\n30#1:154\n46#1:155,18\n46#1:192\n29#1:116\n30#1:135,2\n30#1:137,2\n30#1:143,11\n46#1:173,2\n46#1:175,2\n46#1:181,11\n30#1:139,4\n46#1:177,4\n*E\n"
    }
.end annotation


# static fields
.field private static _groupOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getGroupOff(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/GroupOffKt;->_groupOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.GroupOff"

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
    const v4, 0x41028f5c    # 8.16f

    .line 71
    .line 72
    .line 73
    const v6, 0x412fd70a    # 10.99f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v25, 0x41300000    # 11.0f

    .line 80
    .line 81
    const/high16 v26, 0x41000000    # 8.0f

    .line 82
    .line 83
    const/high16 v21, 0x41300000    # 11.0f

    .line 84
    .line 85
    const v22, 0x4101c28f    # 8.11f

    .line 86
    .line 87
    .line 88
    const/high16 v23, 0x41300000    # 11.0f

    .line 89
    .line 90
    const v24, 0x4100f5c3    # 8.06f

    .line 91
    .line 92
    .line 93
    move-object/from16 v20, v2

    .line 94
    .line 95
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v25, -0x40000000    # -2.0f

    .line 99
    .line 100
    const/high16 v26, -0x40000000    # -2.0f

    .line 101
    .line 102
    const/16 v21, 0x0

    .line 103
    .line 104
    const v22, -0x40733333    # -1.1f

    .line 105
    .line 106
    .line 107
    const v23, -0x4099999a    # -0.9f

    .line 108
    .line 109
    .line 110
    const/high16 v24, -0x40000000    # -2.0f

    .line 111
    .line 112
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v25, 0x410d70a4    # 8.84f

    .line 116
    .line 117
    .line 118
    const v26, 0x40c051ec    # 6.01f

    .line 119
    .line 120
    .line 121
    const v21, 0x410f0a3d    # 8.94f

    .line 122
    .line 123
    .line 124
    const/high16 v22, 0x40c00000    # 6.0f

    .line 125
    .line 126
    const v23, 0x410e3d71    # 8.89f

    .line 127
    .line 128
    .line 129
    const/high16 v24, 0x40c00000    # 6.0f

    .line 130
    .line 131
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v4, 0x41700000    # 15.0f

    .line 141
    .line 142
    const/high16 v6, 0x41100000    # 9.0f

    .line 143
    .line 144
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v25, -0x3f400000    # -6.0f

    .line 148
    .line 149
    const v26, 0x4000a3d7    # 2.01f

    .line 150
    .line 151
    .line 152
    const v21, -0x3fd33333    # -2.7f

    .line 153
    .line 154
    .line 155
    const/16 v22, 0x0

    .line 156
    .line 157
    const v23, -0x3f466666    # -5.8f

    .line 158
    .line 159
    .line 160
    const v24, 0x3fa51eb8    # 1.29f

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v4, 0x41900000    # 18.0f

    .line 167
    .line 168
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v4, 0x41400000    # 12.0f

    .line 172
    .line 173
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v4, -0x41d1eb85    # -0.17f

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v4, -0x3ff8f5c3    # -2.11f

    .line 183
    .line 184
    .line 185
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v25, 0x41100000    # 9.0f

    .line 189
    .line 190
    const/high16 v26, 0x41700000    # 15.0f

    .line 191
    .line 192
    const v21, 0x413c28f6    # 11.76f

    .line 193
    .line 194
    .line 195
    const v22, 0x4174f5c3    # 15.31f

    .line 196
    .line 197
    .line 198
    const v23, 0x412547ae    # 10.33f

    .line 199
    .line 200
    .line 201
    const/high16 v24, 0x41700000    # 15.0f

    .line 202
    .line 203
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    const/16 v16, 0x3800

    .line 214
    .line 215
    const/16 v17, 0x0

    .line 216
    .line 217
    const v6, 0x3e99999a    # 0.3f

    .line 218
    .line 219
    .line 220
    const v8, 0x3e99999a    # 0.3f

    .line 221
    .line 222
    .line 223
    const/4 v7, 0x0

    .line 224
    const/high16 v9, 0x3f800000    # 1.0f

    .line 225
    .line 226
    const/high16 v12, 0x3f800000    # 1.0f

    .line 227
    .line 228
    const/4 v13, 0x0

    .line 229
    const/4 v14, 0x0

    .line 230
    const/4 v15, 0x0

    .line 231
    const-string v4, ""

    .line 232
    .line 233
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 234
    .line 235
    .line 236
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 237
    .line 238
    .line 239
    move-result v3

    .line 240
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 241
    .line 242
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 243
    .line 244
    .line 245
    move-result-wide v6

    .line 246
    const/4 v0, 0x0

    .line 247
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 251
    .line 252
    .line 253
    move-result v10

    .line 254
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 255
    .line 256
    .line 257
    move-result v11

    .line 258
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 261
    .line 262
    .line 263
    const/high16 v0, 0x41000000    # 8.0f

    .line 264
    .line 265
    const/high16 v2, 0x41700000    # 15.0f

    .line 266
    .line 267
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v17, -0x4055c28f    # -1.33f

    .line 271
    .line 272
    .line 273
    const v18, -0x3f8f5c29    # -3.76f

    .line 274
    .line 275
    .line 276
    const v14, -0x404a3d71    # -1.42f

    .line 277
    .line 278
    .line 279
    const/high16 v15, -0x41000000    # -0.5f

    .line 280
    .line 281
    const v16, -0x3fd147ae    # -2.73f

    .line 282
    .line 283
    .line 284
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/high16 v17, 0x41700000    # 15.0f

    .line 288
    .line 289
    const/high16 v18, 0x40800000    # 4.0f

    .line 290
    .line 291
    const v13, 0x416170a4    # 14.09f

    .line 292
    .line 293
    .line 294
    const v14, 0x40833333    # 4.1f

    .line 295
    .line 296
    .line 297
    const v15, 0x41687ae1    # 14.53f

    .line 298
    .line 299
    .line 300
    const/high16 v16, 0x40800000    # 4.0f

    .line 301
    .line 302
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v17, 0x40800000    # 4.0f

    .line 306
    .line 307
    const v13, 0x400d70a4    # 2.21f

    .line 308
    .line 309
    .line 310
    const/4 v14, 0x0

    .line 311
    const/high16 v15, 0x40800000    # 4.0f

    .line 312
    .line 313
    const v16, 0x3fe51eb8    # 1.79f

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v0, -0x401ae148    # -1.79f

    .line 320
    .line 321
    .line 322
    const/high16 v2, -0x3f800000    # -4.0f

    .line 323
    .line 324
    const/high16 v4, 0x40800000    # 4.0f

    .line 325
    .line 326
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v17, -0x41c7ae14    # -0.18f

    .line 330
    .line 331
    .line 332
    const/16 v18, 0x0

    .line 333
    .line 334
    const v13, -0x428a3d71    # -0.06f

    .line 335
    .line 336
    .line 337
    const v15, -0x420a3d71    # -0.12f

    .line 338
    .line 339
    .line 340
    const/16 v16, 0x0

    .line 341
    .line 342
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const v0, -0x40bae148    # -0.77f

    .line 346
    .line 347
    .line 348
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const/high16 v17, 0x41700000    # 15.0f

    .line 352
    .line 353
    const/high16 v18, 0x41000000    # 8.0f

    .line 354
    .line 355
    const v13, 0x416a6666    # 14.65f

    .line 356
    .line 357
    .line 358
    const v14, 0x4124a3d7    # 10.29f

    .line 359
    .line 360
    .line 361
    const/high16 v15, 0x41700000    # 15.0f

    .line 362
    .line 363
    const v16, 0x4112e148    # 9.18f

    .line 364
    .line 365
    .line 366
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v0, 0x41b6a3d7    # 22.83f

    .line 373
    .line 374
    .line 375
    const/high16 v2, 0x41a00000    # 20.0f

    .line 376
    .line 377
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v0, 0x41b80000    # 23.0f

    .line 381
    .line 382
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 386
    .line 387
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v17, -0x3f351eb8    # -6.34f

    .line 391
    .line 392
    .line 393
    const v18, -0x3f8851ec    # -3.87f

    .line 394
    .line 395
    .line 396
    const/4 v13, 0x0

    .line 397
    const v14, -0x3ff47ae1    # -2.18f

    .line 398
    .line 399
    .line 400
    const v15, -0x3f9ae148    # -3.58f

    .line 401
    .line 402
    .line 403
    const v16, -0x3fa1eb85    # -3.47f

    .line 404
    .line 405
    .line 406
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v17, 0x400eb852    # 2.23f

    .line 410
    .line 411
    .line 412
    const v18, 0x403c28f6    # 2.94f

    .line 413
    .line 414
    .line 415
    const v13, 0x3f8ccccd    # 1.1f

    .line 416
    .line 417
    .line 418
    const/high16 v14, 0x3f400000    # 0.75f

    .line 419
    .line 420
    const v15, 0x3ff9999a    # 1.95f

    .line 421
    .line 422
    .line 423
    const v16, 0x3fdae148    # 1.71f

    .line 424
    .line 425
    .line 426
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v0, 0x41b6a3d7    # 22.83f

    .line 430
    .line 431
    .line 432
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const/high16 v0, 0x40c00000    # 6.0f

    .line 439
    .line 440
    const/high16 v2, 0x41100000    # 9.0f

    .line 441
    .line 442
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const v17, 0x410d70a4    # 8.84f

    .line 446
    .line 447
    .line 448
    const v18, 0x40c051ec    # 6.01f

    .line 449
    .line 450
    .line 451
    const v13, 0x410f0a3d    # 8.94f

    .line 452
    .line 453
    .line 454
    const/high16 v14, 0x40c00000    # 6.0f

    .line 455
    .line 456
    const v15, 0x410e3d71    # 8.89f

    .line 457
    .line 458
    .line 459
    const/high16 v16, 0x40c00000    # 6.0f

    .line 460
    .line 461
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const v0, -0x40333333    # -1.6f

    .line 465
    .line 466
    .line 467
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const/high16 v17, 0x41100000    # 9.0f

    .line 471
    .line 472
    const/high16 v18, 0x40800000    # 4.0f

    .line 473
    .line 474
    const v13, 0x40f8a3d7    # 7.77f

    .line 475
    .line 476
    .line 477
    const v14, 0x4084cccd    # 4.15f

    .line 478
    .line 479
    .line 480
    const v15, 0x4105eb85    # 8.37f

    .line 481
    .line 482
    .line 483
    const/high16 v16, 0x40800000    # 4.0f

    .line 484
    .line 485
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const/high16 v17, 0x40800000    # 4.0f

    .line 489
    .line 490
    const v13, 0x400d70a4    # 2.21f

    .line 491
    .line 492
    .line 493
    const/4 v14, 0x0

    .line 494
    const/high16 v15, 0x40800000    # 4.0f

    .line 495
    .line 496
    const v16, 0x3fe51eb8    # 1.79f

    .line 497
    .line 498
    .line 499
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const v17, -0x412e147b    # -0.41f

    .line 503
    .line 504
    .line 505
    const v18, 0x3fe147ae    # 1.76f

    .line 506
    .line 507
    .line 508
    const/4 v13, 0x0

    .line 509
    const v14, 0x3f2147ae    # 0.63f

    .line 510
    .line 511
    .line 512
    const v15, -0x41e66666    # -0.15f

    .line 513
    .line 514
    .line 515
    const v16, 0x3f9d70a4    # 1.23f

    .line 516
    .line 517
    .line 518
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const/high16 v17, 0x41300000    # 11.0f

    .line 525
    .line 526
    const/high16 v18, 0x41000000    # 8.0f

    .line 527
    .line 528
    const/high16 v13, 0x41300000    # 11.0f

    .line 529
    .line 530
    const v14, 0x4101c28f    # 8.11f

    .line 531
    .line 532
    .line 533
    const/high16 v15, 0x41300000    # 11.0f

    .line 534
    .line 535
    const v16, 0x4100f5c3    # 8.06f

    .line 536
    .line 537
    .line 538
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const/high16 v17, 0x41100000    # 9.0f

    .line 542
    .line 543
    const/high16 v18, 0x40c00000    # 6.0f

    .line 544
    .line 545
    const v14, 0x40dccccd    # 6.9f

    .line 546
    .line 547
    .line 548
    const v15, 0x4121999a    # 10.1f

    .line 549
    .line 550
    .line 551
    const/high16 v16, 0x40c00000    # 6.0f

    .line 552
    .line 553
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const v0, 0x4112b852    # 9.17f

    .line 560
    .line 561
    .line 562
    const/high16 v2, 0x41400000    # 12.0f

    .line 563
    .line 564
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const/high16 v18, 0x41400000    # 12.0f

    .line 568
    .line 569
    const v13, 0x4111c28f    # 9.11f

    .line 570
    .line 571
    .line 572
    const/high16 v14, 0x41400000    # 12.0f

    .line 573
    .line 574
    const v15, 0x4110f5c3    # 9.06f

    .line 575
    .line 576
    .line 577
    const/high16 v16, 0x41400000    # 12.0f

    .line 578
    .line 579
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const/high16 v17, -0x3f800000    # -4.0f

    .line 583
    .line 584
    const/high16 v18, -0x3f800000    # -4.0f

    .line 585
    .line 586
    const v13, -0x3ff28f5c    # -2.21f

    .line 587
    .line 588
    .line 589
    const/4 v14, 0x0

    .line 590
    const/high16 v15, -0x3f800000    # -4.0f

    .line 591
    .line 592
    const v16, -0x401ae148    # -1.79f

    .line 593
    .line 594
    .line 595
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const/16 v17, 0x0

    .line 599
    .line 600
    const v18, -0x41d1eb85    # -0.17f

    .line 601
    .line 602
    .line 603
    const/4 v13, 0x0

    .line 604
    const v14, -0x428a3d71    # -0.06f

    .line 605
    .line 606
    .line 607
    const/4 v15, 0x0

    .line 608
    const v16, -0x421eb852    # -0.11f

    .line 609
    .line 610
    .line 611
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const v0, 0x3f30a3d7    # 0.69f

    .line 615
    .line 616
    .line 617
    const v2, 0x4060a3d7    # 3.51f

    .line 618
    .line 619
    .line 620
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const v0, 0x40066666    # 2.1f

    .line 624
    .line 625
    .line 626
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const v0, 0x419e6666    # 19.8f

    .line 630
    .line 631
    .line 632
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const v0, -0x404b851f    # -1.41f

    .line 636
    .line 637
    .line 638
    const v2, 0x3fb47ae1    # 1.41f

    .line 639
    .line 640
    .line 641
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const/high16 v0, 0x41880000    # 17.0f

    .line 645
    .line 646
    const v2, 0x419ea3d7    # 19.83f

    .line 647
    .line 648
    .line 649
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    const/high16 v0, 0x41a00000    # 20.0f

    .line 653
    .line 654
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const/high16 v0, 0x3f800000    # 1.0f

    .line 658
    .line 659
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 663
    .line 664
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    const/high16 v17, 0x41000000    # 8.0f

    .line 668
    .line 669
    const/high16 v18, -0x3f800000    # -4.0f

    .line 670
    .line 671
    const v14, -0x3fd5c28f    # -2.66f

    .line 672
    .line 673
    .line 674
    const v15, 0x40aa8f5c    # 5.33f

    .line 675
    .line 676
    .line 677
    const/high16 v16, -0x3f800000    # -4.0f

    .line 678
    .line 679
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    const/high16 v17, 0x3fa00000    # 1.25f

    .line 683
    .line 684
    const v18, 0x3da3d70a    # 0.08f

    .line 685
    .line 686
    .line 687
    const v13, 0x3ebd70a4    # 0.37f

    .line 688
    .line 689
    .line 690
    const/4 v14, 0x0

    .line 691
    const v15, 0x3f4ccccd    # 0.8f

    .line 692
    .line 693
    .line 694
    const v16, 0x3cf5c28f    # 0.03f

    .line 695
    .line 696
    .line 697
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    const v0, 0x4112b852    # 9.17f

    .line 701
    .line 702
    .line 703
    const/high16 v2, 0x41400000    # 12.0f

    .line 704
    .line 705
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 706
    .line 707
    .line 708
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    const/high16 v0, 0x41700000    # 15.0f

    .line 712
    .line 713
    const/high16 v2, 0x41100000    # 9.0f

    .line 714
    .line 715
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 716
    .line 717
    .line 718
    const/high16 v17, -0x3f400000    # -6.0f

    .line 719
    .line 720
    const v18, 0x4000a3d7    # 2.01f

    .line 721
    .line 722
    .line 723
    const v13, -0x3fd33333    # -2.7f

    .line 724
    .line 725
    .line 726
    const v15, -0x3f466666    # -5.8f

    .line 727
    .line 728
    .line 729
    const v16, 0x3fa51eb8    # 1.29f

    .line 730
    .line 731
    .line 732
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 733
    .line 734
    .line 735
    const/high16 v0, 0x41900000    # 18.0f

    .line 736
    .line 737
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    const/high16 v0, 0x41400000    # 12.0f

    .line 741
    .line 742
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    const v0, -0x41d1eb85    # -0.17f

    .line 746
    .line 747
    .line 748
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 749
    .line 750
    .line 751
    const v0, -0x3ff8f5c3    # -2.11f

    .line 752
    .line 753
    .line 754
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 755
    .line 756
    .line 757
    const/high16 v17, 0x41100000    # 9.0f

    .line 758
    .line 759
    const/high16 v18, 0x41700000    # 15.0f

    .line 760
    .line 761
    const v13, 0x413c28f6    # 11.76f

    .line 762
    .line 763
    .line 764
    const v14, 0x4174f5c3    # 15.31f

    .line 765
    .line 766
    .line 767
    const v15, 0x412547ae    # 10.33f

    .line 768
    .line 769
    .line 770
    const/high16 v16, 0x41700000    # 15.0f

    .line 771
    .line 772
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 773
    .line 774
    .line 775
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 776
    .line 777
    .line 778
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 779
    .line 780
    .line 781
    move-result-object v2

    .line 782
    const/16 v16, 0x3800

    .line 783
    .line 784
    const/16 v17, 0x0

    .line 785
    .line 786
    const/high16 v6, 0x3f800000    # 1.0f

    .line 787
    .line 788
    const/high16 v8, 0x3f800000    # 1.0f

    .line 789
    .line 790
    const/4 v7, 0x0

    .line 791
    const/high16 v12, 0x3f800000    # 1.0f

    .line 792
    .line 793
    const/4 v13, 0x0

    .line 794
    const/4 v14, 0x0

    .line 795
    const/4 v15, 0x0

    .line 796
    const-string v4, ""

    .line 797
    .line 798
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 799
    .line 800
    .line 801
    move-result-object v0

    .line 802
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 803
    .line 804
    .line 805
    move-result-object v0

    .line 806
    sput-object v0, Landroidx/compose/material/icons/twotone/GroupOffKt;->_groupOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 807
    .line 808
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 809
    .line 810
    .line 811
    return-object v0
.end method
