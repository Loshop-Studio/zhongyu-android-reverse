.class public final Landroidx/compose/material/icons/sharp/ChildCareKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_childCare",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "ChildCare",
        "Landroidx/compose/material/icons/Icons$Sharp;",
        "getChildCare",
        "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nChildCare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChildCare.kt\nandroidx/compose/material/icons/sharp/ChildCareKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,90:1\n212#2,12:91\n233#2,18:104\n253#2:141\n233#2,18:142\n253#2:179\n233#2,18:180\n253#2:217\n174#3:103\n705#4,2:122\n717#4,2:124\n719#4,11:130\n705#4,2:160\n717#4,2:162\n719#4,11:168\n705#4,2:198\n717#4,2:200\n719#4,11:206\n72#5,4:126\n72#5,4:164\n72#5,4:202\n*S KotlinDebug\n*F\n+ 1 ChildCare.kt\nandroidx/compose/material/icons/sharp/ChildCareKt\n*L\n29#1:91,12\n30#1:104,18\n30#1:141\n36#1:142,18\n36#1:179\n42#1:180,18\n42#1:217\n29#1:103\n30#1:122,2\n30#1:124,2\n30#1:130,11\n36#1:160,2\n36#1:162,2\n36#1:168,11\n42#1:198,2\n42#1:200,2\n42#1:206,11\n30#1:126,4\n36#1:164,4\n42#1:202,4\n*E\n"
    }
.end annotation


# static fields
.field private static _childCare:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getChildCare(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/ChildCareKt;->_childCare:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.ChildCare"

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
    const/high16 v4, 0x41680000    # 14.5f

    .line 71
    .line 72
    const/high16 v6, 0x41280000    # 10.5f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/4 v4, 0x0

    .line 78
    const/high16 v6, -0x40600000    # -1.25f

    .line 79
    .line 80
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v26, 0x40200000    # 2.5f

    .line 84
    .line 85
    const/16 v27, 0x0

    .line 86
    .line 87
    const/high16 v21, 0x3fa00000    # 1.25f

    .line 88
    .line 89
    const/high16 v22, 0x3fa00000    # 1.25f

    .line 90
    .line 91
    const/16 v23, 0x0

    .line 92
    .line 93
    const/16 v24, 0x1

    .line 94
    .line 95
    const/16 v25, 0x1

    .line 96
    .line 97
    move-object/from16 v20, v2

    .line 98
    .line 99
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 103
    .line 104
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    const/16 v16, 0x3800

    .line 112
    .line 113
    const/16 v17, 0x0

    .line 114
    .line 115
    const/high16 v6, 0x3f800000    # 1.0f

    .line 116
    .line 117
    const/high16 v8, 0x3f800000    # 1.0f

    .line 118
    .line 119
    const/4 v7, 0x0

    .line 120
    const/high16 v9, 0x3f800000    # 1.0f

    .line 121
    .line 122
    const/high16 v12, 0x3f800000    # 1.0f

    .line 123
    .line 124
    const/4 v13, 0x0

    .line 125
    const/4 v14, 0x0

    .line 126
    const/4 v15, 0x0

    .line 127
    const-string v4, ""

    .line 128
    .line 129
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 130
    .line 131
    .line 132
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 137
    .line 138
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 139
    .line 140
    .line 141
    move-result-wide v6

    .line 142
    const/4 v2, 0x0

    .line 143
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 147
    .line 148
    .line 149
    move-result v10

    .line 150
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 151
    .line 152
    .line 153
    move-result v11

    .line 154
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 157
    .line 158
    .line 159
    const/high16 v4, 0x41180000    # 9.5f

    .line 160
    .line 161
    const/high16 v6, 0x41280000    # 10.5f

    .line 162
    .line 163
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/4 v4, 0x0

    .line 167
    const/high16 v6, -0x40600000    # -1.25f

    .line 168
    .line 169
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v26, 0x40200000    # 2.5f

    .line 173
    .line 174
    move-object/from16 v20, v2

    .line 175
    .line 176
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 180
    .line 181
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    const/high16 v6, 0x3f800000    # 1.0f

    .line 189
    .line 190
    const/4 v7, 0x0

    .line 191
    const-string v4, ""

    .line 192
    .line 193
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 194
    .line 195
    .line 196
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 197
    .line 198
    .line 199
    move-result v3

    .line 200
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 201
    .line 202
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 203
    .line 204
    .line 205
    move-result-wide v6

    .line 206
    const/4 v0, 0x0

    .line 207
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 211
    .line 212
    .line 213
    move-result v10

    .line 214
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 215
    .line 216
    .line 217
    move-result v11

    .line 218
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 221
    .line 222
    .line 223
    const/high16 v0, 0x41400000    # 12.0f

    .line 224
    .line 225
    const/high16 v2, 0x41880000    # 17.0f

    .line 226
    .line 227
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v17, 0x40900000    # 4.5f

    .line 231
    .line 232
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 233
    .line 234
    const v13, 0x4000a3d7    # 2.01f

    .line 235
    .line 236
    .line 237
    const v15, 0x406f5c29    # 3.74f

    .line 238
    .line 239
    .line 240
    const v16, -0x40628f5c    # -1.23f

    .line 241
    .line 242
    .line 243
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/high16 v0, -0x3ef00000    # -9.0f

    .line 247
    .line 248
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v18, 0x40400000    # 3.0f

    .line 252
    .line 253
    const v13, 0x3f428f5c    # 0.76f

    .line 254
    .line 255
    .line 256
    const v14, 0x3fe28f5c    # 1.77f

    .line 257
    .line 258
    .line 259
    const v15, 0x401f5c29    # 2.49f

    .line 260
    .line 261
    .line 262
    const/high16 v16, 0x40400000    # 3.0f

    .line 263
    .line 264
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v0, 0x41b7851f    # 22.94f

    .line 271
    .line 272
    .line 273
    const v2, 0x413570a4    # 11.34f

    .line 274
    .line 275
    .line 276
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v17, -0x3fcc28f6    # -2.81f

    .line 280
    .line 281
    .line 282
    const v18, -0x3fb51eb8    # -3.17f

    .line 283
    .line 284
    .line 285
    const/high16 v13, -0x41800000    # -0.25f

    .line 286
    .line 287
    const v14, -0x403eb852    # -1.51f

    .line 288
    .line 289
    .line 290
    const v15, -0x4051eb85    # -1.36f

    .line 291
    .line 292
    .line 293
    const v16, -0x3fd0a3d7    # -2.74f

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v17, -0x3ff3d70a    # -2.19f

    .line 300
    .line 301
    .line 302
    const v18, -0x3fc5c28f    # -2.91f

    .line 303
    .line 304
    .line 305
    const v13, -0x40f851ec    # -0.53f

    .line 306
    .line 307
    .line 308
    const v14, -0x4070a3d7    # -1.12f

    .line 309
    .line 310
    .line 311
    const v15, -0x405c28f6    # -1.28f

    .line 312
    .line 313
    .line 314
    const v16, -0x3ff9999a    # -2.1f

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/high16 v17, 0x41400000    # 12.0f

    .line 321
    .line 322
    const/high16 v18, 0x40400000    # 3.0f

    .line 323
    .line 324
    const v13, 0x4182e148    # 16.36f

    .line 325
    .line 326
    .line 327
    const v14, 0x40766666    # 3.85f

    .line 328
    .line 329
    .line 330
    const v15, 0x41647ae1    # 14.28f

    .line 331
    .line 332
    .line 333
    const/high16 v16, 0x40400000    # 3.0f

    .line 334
    .line 335
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v0, -0x3f41eb85    # -5.94f

    .line 339
    .line 340
    .line 341
    const v2, 0x4010a3d7    # 2.26f

    .line 342
    .line 343
    .line 344
    const v4, -0x3f747ae1    # -4.36f

    .line 345
    .line 346
    .line 347
    const v6, 0x3f59999a    # 0.85f

    .line 348
    .line 349
    .line 350
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v17, -0x3ff3d70a    # -2.19f

    .line 354
    .line 355
    .line 356
    const v18, 0x403a3d71    # 2.91f

    .line 357
    .line 358
    .line 359
    const v13, -0x40947ae1    # -0.92f

    .line 360
    .line 361
    .line 362
    const v14, 0x3f4f5c29    # 0.81f

    .line 363
    .line 364
    .line 365
    const v15, -0x402a3d71    # -1.67f

    .line 366
    .line 367
    .line 368
    const v16, 0x3fe66666    # 1.8f

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v17, -0x3fcc28f6    # -2.81f

    .line 375
    .line 376
    .line 377
    const v18, 0x404ae148    # 3.17f

    .line 378
    .line 379
    .line 380
    const v13, -0x40466666    # -1.45f

    .line 381
    .line 382
    .line 383
    const v14, 0x3edc28f6    # 0.43f

    .line 384
    .line 385
    .line 386
    const v15, -0x3fdc28f6    # -2.56f

    .line 387
    .line 388
    .line 389
    const v16, 0x3fd33333    # 1.65f

    .line 390
    .line 391
    .line 392
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const v17, -0x428a3d71    # -0.06f

    .line 396
    .line 397
    .line 398
    const v18, 0x3f28f5c3    # 0.66f

    .line 399
    .line 400
    .line 401
    const v13, -0x42dc28f6    # -0.04f

    .line 402
    .line 403
    .line 404
    const v14, 0x3e570a3d    # 0.21f

    .line 405
    .line 406
    .line 407
    const v15, -0x428a3d71    # -0.06f

    .line 408
    .line 409
    .line 410
    const v16, 0x3edc28f6    # 0.43f

    .line 411
    .line 412
    .line 413
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const v17, 0x3d75c28f    # 0.06f

    .line 417
    .line 418
    .line 419
    const/4 v13, 0x0

    .line 420
    const v14, 0x3e6b851f    # 0.23f

    .line 421
    .line 422
    .line 423
    const v15, 0x3ca3d70a    # 0.02f

    .line 424
    .line 425
    .line 426
    const v16, 0x3ee66666    # 0.45f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v17, 0x4033d70a    # 2.81f

    .line 433
    .line 434
    .line 435
    const v18, 0x404ae148    # 3.17f

    .line 436
    .line 437
    .line 438
    const/high16 v13, 0x3e800000    # 0.25f

    .line 439
    .line 440
    const v14, 0x3fc147ae    # 1.51f

    .line 441
    .line 442
    .line 443
    const v15, 0x3fae147b    # 1.36f

    .line 444
    .line 445
    .line 446
    const v16, 0x402f5c29    # 2.74f

    .line 447
    .line 448
    .line 449
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v17, 0x400ae148    # 2.17f

    .line 453
    .line 454
    .line 455
    const v18, 0x4038f5c3    # 2.89f

    .line 456
    .line 457
    .line 458
    const v13, 0x3f051eb8    # 0.52f

    .line 459
    .line 460
    .line 461
    const v14, 0x3f8e147b    # 1.11f

    .line 462
    .line 463
    .line 464
    const v15, 0x3fa28f5c    # 1.27f

    .line 465
    .line 466
    .line 467
    const v16, 0x4005c28f    # 2.09f

    .line 468
    .line 469
    .line 470
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v17, 0x41400000    # 12.0f

    .line 474
    .line 475
    const/high16 v18, 0x41a80000    # 21.0f

    .line 476
    .line 477
    const v13, 0x40f3d70a    # 7.62f

    .line 478
    .line 479
    .line 480
    const v14, 0x41a11eb8    # 20.14f

    .line 481
    .line 482
    .line 483
    const v15, 0x411b5c29    # 9.71f

    .line 484
    .line 485
    .line 486
    const/high16 v16, 0x41a80000    # 21.0f

    .line 487
    .line 488
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const v0, 0x40bf0a3d    # 5.97f

    .line 492
    .line 493
    .line 494
    const v2, -0x3fee147b    # -2.28f

    .line 495
    .line 496
    .line 497
    const v4, 0x408c28f6    # 4.38f

    .line 498
    .line 499
    .line 500
    const v6, -0x40a3d70a    # -0.86f

    .line 501
    .line 502
    .line 503
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v17, 0x400ae148    # 2.17f

    .line 507
    .line 508
    .line 509
    const v18, -0x3fc70a3d    # -2.89f

    .line 510
    .line 511
    .line 512
    const v13, 0x3f666666    # 0.9f

    .line 513
    .line 514
    .line 515
    const v14, -0x40b33333    # -0.8f

    .line 516
    .line 517
    .line 518
    const v15, 0x3fd33333    # 1.65f

    .line 519
    .line 520
    .line 521
    const v16, -0x401ae148    # -1.79f

    .line 522
    .line 523
    .line 524
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const v17, 0x40333333    # 2.8f

    .line 528
    .line 529
    .line 530
    const v18, -0x3fb51eb8    # -3.17f

    .line 531
    .line 532
    .line 533
    const v13, 0x3fb851ec    # 1.44f

    .line 534
    .line 535
    .line 536
    const v14, -0x4123d70a    # -0.43f

    .line 537
    .line 538
    .line 539
    const v15, 0x40233333    # 2.55f

    .line 540
    .line 541
    .line 542
    const v16, -0x402ccccd    # -1.65f

    .line 543
    .line 544
    .line 545
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const v17, 0x3d75c28f    # 0.06f

    .line 549
    .line 550
    .line 551
    const v18, -0x40d70a3d    # -0.66f

    .line 552
    .line 553
    .line 554
    const v13, 0x3d23d70a    # 0.04f

    .line 555
    .line 556
    .line 557
    const v14, -0x41a8f5c3    # -0.21f

    .line 558
    .line 559
    .line 560
    const v15, 0x3d75c28f    # 0.06f

    .line 561
    .line 562
    .line 563
    const v16, -0x4123d70a    # -0.43f

    .line 564
    .line 565
    .line 566
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const v17, -0x428a3d71    # -0.06f

    .line 570
    .line 571
    .line 572
    const/4 v13, 0x0

    .line 573
    const v14, -0x41947ae1    # -0.23f

    .line 574
    .line 575
    .line 576
    const v15, -0x435c28f6    # -0.02f

    .line 577
    .line 578
    .line 579
    const v16, -0x4119999a    # -0.45f

    .line 580
    .line 581
    .line 582
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const/high16 v0, 0x41980000    # 19.0f

    .line 589
    .line 590
    const/high16 v2, 0x41600000    # 14.0f

    .line 591
    .line 592
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    const v17, -0x416b851f    # -0.29f

    .line 596
    .line 597
    .line 598
    const v18, -0x430a3d71    # -0.03f

    .line 599
    .line 600
    .line 601
    const v13, -0x42333333    # -0.1f

    .line 602
    .line 603
    .line 604
    const/4 v14, 0x0

    .line 605
    const v15, -0x41bd70a4    # -0.19f

    .line 606
    .line 607
    .line 608
    const v16, -0x435c28f6    # -0.02f

    .line 609
    .line 610
    .line 611
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const v17, -0x40a3d70a    # -0.86f

    .line 615
    .line 616
    .line 617
    const v18, 0x3fee147b    # 1.86f

    .line 618
    .line 619
    .line 620
    const v13, -0x41b33333    # -0.2f

    .line 621
    .line 622
    .line 623
    const v14, 0x3f2b851f    # 0.67f

    .line 624
    .line 625
    .line 626
    const v15, -0x41051eb8    # -0.49f

    .line 627
    .line 628
    .line 629
    const v16, 0x3fa51eb8    # 1.29f

    .line 630
    .line 631
    .line 632
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const/high16 v17, 0x41400000    # 12.0f

    .line 636
    .line 637
    const/high16 v18, 0x41980000    # 19.0f

    .line 638
    .line 639
    const v13, 0x4184cccd    # 16.6f

    .line 640
    .line 641
    .line 642
    const v14, 0x418deb85    # 17.74f

    .line 643
    .line 644
    .line 645
    const v15, 0x41673333    # 14.45f

    .line 646
    .line 647
    .line 648
    const/high16 v16, 0x41980000    # 19.0f

    .line 649
    .line 650
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const v0, -0x3f44cccd    # -5.85f

    .line 654
    .line 655
    .line 656
    const v2, -0x3fb51eb8    # -3.17f

    .line 657
    .line 658
    .line 659
    const v4, -0x3f6ccccd    # -4.6f

    .line 660
    .line 661
    .line 662
    const v6, -0x405eb852    # -1.26f

    .line 663
    .line 664
    .line 665
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    const v17, -0x40a3d70a    # -0.86f

    .line 669
    .line 670
    .line 671
    const v18, -0x4011eb85    # -1.86f

    .line 672
    .line 673
    .line 674
    const v13, -0x41428f5c    # -0.37f

    .line 675
    .line 676
    .line 677
    const v14, -0x40ee147b    # -0.57f

    .line 678
    .line 679
    .line 680
    const v15, -0x40d70a3d    # -0.66f

    .line 681
    .line 682
    .line 683
    const v16, -0x4067ae14    # -1.19f

    .line 684
    .line 685
    .line 686
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const v17, -0x416b851f    # -0.29f

    .line 690
    .line 691
    .line 692
    const v18, 0x3cf5c28f    # 0.03f

    .line 693
    .line 694
    .line 695
    const v13, -0x42333333    # -0.1f

    .line 696
    .line 697
    .line 698
    const v14, 0x3c23d70a    # 0.01f

    .line 699
    .line 700
    .line 701
    const v15, -0x41bd70a4    # -0.19f

    .line 702
    .line 703
    .line 704
    const v16, 0x3cf5c28f    # 0.03f

    .line 705
    .line 706
    .line 707
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    const/high16 v17, -0x40000000    # -2.0f

    .line 711
    .line 712
    const/high16 v18, -0x40000000    # -2.0f

    .line 713
    .line 714
    const v13, -0x40733333    # -1.1f

    .line 715
    .line 716
    .line 717
    const/4 v14, 0x0

    .line 718
    const/high16 v15, -0x40000000    # -2.0f

    .line 719
    .line 720
    const v16, -0x4099999a    # -0.9f

    .line 721
    .line 722
    .line 723
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 724
    .line 725
    .line 726
    const v0, 0x3f666666    # 0.9f

    .line 727
    .line 728
    .line 729
    const/high16 v2, 0x40000000    # 2.0f

    .line 730
    .line 731
    const/high16 v4, -0x40000000    # -2.0f

    .line 732
    .line 733
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 734
    .line 735
    .line 736
    const v17, 0x3e947ae1    # 0.29f

    .line 737
    .line 738
    .line 739
    const v18, 0x3cf5c28f    # 0.03f

    .line 740
    .line 741
    .line 742
    const v13, 0x3dcccccd    # 0.1f

    .line 743
    .line 744
    .line 745
    const v15, 0x3e428f5c    # 0.19f

    .line 746
    .line 747
    .line 748
    const v16, 0x3ca3d70a    # 0.02f

    .line 749
    .line 750
    .line 751
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 752
    .line 753
    .line 754
    const v17, 0x3f5c28f6    # 0.86f

    .line 755
    .line 756
    .line 757
    const v18, -0x4011eb85    # -1.86f

    .line 758
    .line 759
    .line 760
    const v13, 0x3e4ccccd    # 0.2f

    .line 761
    .line 762
    .line 763
    const v14, -0x40d47ae1    # -0.67f

    .line 764
    .line 765
    .line 766
    const v15, 0x3efae148    # 0.49f

    .line 767
    .line 768
    .line 769
    const v16, -0x405ae148    # -1.29f

    .line 770
    .line 771
    .line 772
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 773
    .line 774
    .line 775
    const/high16 v17, 0x41400000    # 12.0f

    .line 776
    .line 777
    const/high16 v18, 0x40a00000    # 5.0f

    .line 778
    .line 779
    const v13, 0x40eccccd    # 7.4f

    .line 780
    .line 781
    .line 782
    const v14, 0x40c851ec    # 6.26f

    .line 783
    .line 784
    .line 785
    const v15, 0x4118cccd    # 9.55f

    .line 786
    .line 787
    .line 788
    const/high16 v16, 0x40a00000    # 5.0f

    .line 789
    .line 790
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 791
    .line 792
    .line 793
    const v0, 0x40bb3333    # 5.85f

    .line 794
    .line 795
    .line 796
    const v2, 0x404ae148    # 3.17f

    .line 797
    .line 798
    .line 799
    const v4, 0x40933333    # 4.6f

    .line 800
    .line 801
    .line 802
    const v6, 0x3fa147ae    # 1.26f

    .line 803
    .line 804
    .line 805
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 806
    .line 807
    .line 808
    const v17, 0x3f5c28f6    # 0.86f

    .line 809
    .line 810
    .line 811
    const v18, 0x3fee147b    # 1.86f

    .line 812
    .line 813
    .line 814
    const v13, 0x3ebd70a4    # 0.37f

    .line 815
    .line 816
    .line 817
    const v14, 0x3f11eb85    # 0.57f

    .line 818
    .line 819
    .line 820
    const v15, 0x3f28f5c3    # 0.66f

    .line 821
    .line 822
    .line 823
    const v16, 0x3f9851ec    # 1.19f

    .line 824
    .line 825
    .line 826
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 827
    .line 828
    .line 829
    const v17, 0x3e947ae1    # 0.29f

    .line 830
    .line 831
    .line 832
    const v18, -0x430a3d71    # -0.03f

    .line 833
    .line 834
    .line 835
    const v13, 0x3dcccccd    # 0.1f

    .line 836
    .line 837
    .line 838
    const v14, -0x43dc28f6    # -0.01f

    .line 839
    .line 840
    .line 841
    const v15, 0x3e428f5c    # 0.19f

    .line 842
    .line 843
    .line 844
    const v16, -0x430a3d71    # -0.03f

    .line 845
    .line 846
    .line 847
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 848
    .line 849
    .line 850
    const/high16 v17, 0x40000000    # 2.0f

    .line 851
    .line 852
    const/high16 v18, 0x40000000    # 2.0f

    .line 853
    .line 854
    const v13, 0x3f8ccccd    # 1.1f

    .line 855
    .line 856
    .line 857
    const/4 v14, 0x0

    .line 858
    const/high16 v15, 0x40000000    # 2.0f

    .line 859
    .line 860
    const v16, 0x3f666666    # 0.9f

    .line 861
    .line 862
    .line 863
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 864
    .line 865
    .line 866
    const v0, -0x4099999a    # -0.9f

    .line 867
    .line 868
    .line 869
    const/high16 v2, 0x40000000    # 2.0f

    .line 870
    .line 871
    const/high16 v4, -0x40000000    # -2.0f

    .line 872
    .line 873
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 874
    .line 875
    .line 876
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 877
    .line 878
    .line 879
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 880
    .line 881
    .line 882
    move-result-object v2

    .line 883
    const/16 v16, 0x3800

    .line 884
    .line 885
    const/16 v17, 0x0

    .line 886
    .line 887
    const/high16 v6, 0x3f800000    # 1.0f

    .line 888
    .line 889
    const/4 v7, 0x0

    .line 890
    const/high16 v12, 0x3f800000    # 1.0f

    .line 891
    .line 892
    const/4 v13, 0x0

    .line 893
    const/4 v15, 0x0

    .line 894
    const-string v4, ""

    .line 895
    .line 896
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 897
    .line 898
    .line 899
    move-result-object v0

    .line 900
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 901
    .line 902
    .line 903
    move-result-object v0

    .line 904
    sput-object v0, Landroidx/compose/material/icons/sharp/ChildCareKt;->_childCare:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 905
    .line 906
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 907
    .line 908
    .line 909
    return-object v0
.end method
