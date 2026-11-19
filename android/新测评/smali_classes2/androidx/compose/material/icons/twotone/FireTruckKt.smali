.class public final Landroidx/compose/material/icons/twotone/FireTruckKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_fireTruck",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "FireTruck",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getFireTruck",
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
        "SMAP\nFireTruck.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FireTruck.kt\nandroidx/compose/material/icons/twotone/FireTruckKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,148:1\n212#2,12:149\n233#2,18:162\n253#2:199\n233#2,18:200\n253#2:237\n233#2,18:238\n253#2:275\n233#2,18:276\n253#2:313\n174#3:161\n705#4,2:180\n717#4,2:182\n719#4,11:188\n705#4,2:218\n717#4,2:220\n719#4,11:226\n705#4,2:256\n717#4,2:258\n719#4,11:264\n705#4,2:294\n717#4,2:296\n719#4,11:302\n72#5,4:184\n72#5,4:222\n72#5,4:260\n72#5,4:298\n*S KotlinDebug\n*F\n+ 1 FireTruck.kt\nandroidx/compose/material/icons/twotone/FireTruckKt\n*L\n29#1:149,12\n30#1:162,18\n30#1:199\n41#1:200,18\n41#1:237\n52#1:238,18\n52#1:275\n115#1:276,18\n115#1:313\n29#1:161\n30#1:180,2\n30#1:182,2\n30#1:188,11\n41#1:218,2\n41#1:220,2\n41#1:226,11\n52#1:256,2\n52#1:258,2\n52#1:264,11\n115#1:294,2\n115#1:296,2\n115#1:302,11\n30#1:184,4\n41#1:222,4\n52#1:260,4\n115#1:298,4\n*E\n"
    }
.end annotation


# static fields
.field private static _fireTruck:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFireTruck(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/FireTruckKt;->_fireTruck:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.FireTruck"

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
    const/high16 v4, 0x41800000    # 16.0f

    .line 71
    .line 72
    const/high16 v6, 0x40400000    # 3.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v4, 0x3fe3d70a    # 1.78f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v25, 0x400e147b    # 2.22f

    .line 84
    .line 85
    .line 86
    const/high16 v26, -0x40800000    # -1.0f

    .line 87
    .line 88
    const v21, 0x3f0ccccd    # 0.55f

    .line 89
    .line 90
    .line 91
    const v22, -0x40e3d70a    # -0.61f

    .line 92
    .line 93
    .line 94
    const v23, 0x3fab851f    # 1.34f

    .line 95
    .line 96
    .line 97
    const/high16 v24, -0x40800000    # -1.0f

    .line 98
    .line 99
    move-object/from16 v20, v2

    .line 100
    .line 101
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v4, 0x400e147b    # 2.22f

    .line 105
    .line 106
    .line 107
    const v6, 0x3fd5c28f    # 1.67f

    .line 108
    .line 109
    .line 110
    const v7, 0x3ec7ae14    # 0.39f

    .line 111
    .line 112
    .line 113
    const/high16 v8, 0x3f800000    # 1.0f

    .line 114
    .line 115
    invoke-virtual {v2, v6, v7, v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const/high16 v4, 0x41400000    # 12.0f

    .line 119
    .line 120
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 124
    .line 125
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v4, 0x40400000    # 3.0f

    .line 129
    .line 130
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v4, 0x41800000    # 16.0f

    .line 134
    .line 135
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    const/16 v16, 0x3800

    .line 146
    .line 147
    const/16 v17, 0x0

    .line 148
    .line 149
    const v6, 0x3e99999a    # 0.3f

    .line 150
    .line 151
    .line 152
    const v8, 0x3e99999a    # 0.3f

    .line 153
    .line 154
    .line 155
    const/4 v7, 0x0

    .line 156
    const/high16 v9, 0x3f800000    # 1.0f

    .line 157
    .line 158
    const/high16 v12, 0x3f800000    # 1.0f

    .line 159
    .line 160
    const/4 v13, 0x0

    .line 161
    const/4 v14, 0x0

    .line 162
    const/4 v15, 0x0

    .line 163
    const-string v4, ""

    .line 164
    .line 165
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 166
    .line 167
    .line 168
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 173
    .line 174
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 175
    .line 176
    .line 177
    move-result-wide v6

    .line 178
    const/4 v2, 0x0

    .line 179
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 183
    .line 184
    .line 185
    move-result v10

    .line 186
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 187
    .line 188
    .line 189
    move-result v11

    .line 190
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 193
    .line 194
    .line 195
    const/high16 v4, 0x41600000    # 14.0f

    .line 196
    .line 197
    const/high16 v6, 0x41800000    # 16.0f

    .line 198
    .line 199
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v4, 0x3f47ae14    # 0.78f

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    move-object/from16 v20, v2

    .line 209
    .line 210
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v4, 0x400e147b    # 2.22f

    .line 214
    .line 215
    .line 216
    const v6, 0x3fd5c28f    # 1.67f

    .line 217
    .line 218
    .line 219
    const v7, 0x3ec7ae14    # 0.39f

    .line 220
    .line 221
    .line 222
    const/high16 v8, 0x3f800000    # 1.0f

    .line 223
    .line 224
    invoke-virtual {v2, v6, v7, v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const/high16 v4, 0x41a80000    # 21.0f

    .line 228
    .line 229
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 233
    .line 234
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/high16 v4, -0x3f200000    # -7.0f

    .line 238
    .line 239
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v4, 0x41800000    # 16.0f

    .line 243
    .line 244
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    const v6, 0x3e99999a    # 0.3f

    .line 255
    .line 256
    .line 257
    const v8, 0x3e99999a    # 0.3f

    .line 258
    .line 259
    .line 260
    const/4 v7, 0x0

    .line 261
    const-string v4, ""

    .line 262
    .line 263
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 264
    .line 265
    .line 266
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 267
    .line 268
    .line 269
    move-result v3

    .line 270
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 271
    .line 272
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 273
    .line 274
    .line 275
    move-result-wide v6

    .line 276
    const/4 v2, 0x0

    .line 277
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 281
    .line 282
    .line 283
    move-result v10

    .line 284
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 285
    .line 286
    .line 287
    move-result v11

    .line 288
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 291
    .line 292
    .line 293
    const v4, 0x41b73333    # 22.9f

    .line 294
    .line 295
    .line 296
    const v6, 0x412b0a3d    # 10.69f

    .line 297
    .line 298
    .line 299
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v4, -0x4047ae14    # -1.44f

    .line 303
    .line 304
    .line 305
    const v6, -0x3f75c28f    # -4.32f

    .line 306
    .line 307
    .line 308
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v25, 0x419c7ae1    # 19.56f

    .line 312
    .line 313
    .line 314
    const/high16 v26, 0x40a00000    # 5.0f

    .line 315
    .line 316
    const v21, 0x41a970a4    # 21.18f

    .line 317
    .line 318
    .line 319
    const v22, 0x40b1999a    # 5.55f

    .line 320
    .line 321
    .line 322
    const v23, 0x41a35c29    # 20.42f

    .line 323
    .line 324
    .line 325
    const/high16 v24, 0x40a00000    # 5.0f

    .line 326
    .line 327
    move-object/from16 v20, v2

    .line 328
    .line 329
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v4, 0x41980000    # 19.0f

    .line 333
    .line 334
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/high16 v4, 0x40800000    # 4.0f

    .line 338
    .line 339
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v25, -0x40800000    # -1.0f

    .line 343
    .line 344
    const/high16 v26, -0x40800000    # -1.0f

    .line 345
    .line 346
    const/16 v21, 0x0

    .line 347
    .line 348
    const v22, -0x40f33333    # -0.55f

    .line 349
    .line 350
    .line 351
    const v23, -0x4119999a    # -0.45f

    .line 352
    .line 353
    .line 354
    const/high16 v24, -0x40800000    # -1.0f

    .line 355
    .line 356
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const/high16 v4, -0x40800000    # -1.0f

    .line 360
    .line 361
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/high16 v26, 0x3f800000    # 1.0f

    .line 365
    .line 366
    const v21, -0x40f33333    # -0.55f

    .line 367
    .line 368
    .line 369
    const/16 v22, 0x0

    .line 370
    .line 371
    const/high16 v23, -0x40800000    # -1.0f

    .line 372
    .line 373
    const v24, 0x3ee66666    # 0.45f

    .line 374
    .line 375
    .line 376
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const/high16 v4, 0x3f800000    # 1.0f

    .line 380
    .line 381
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/high16 v4, -0x40000000    # -2.0f

    .line 385
    .line 386
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const/high16 v25, -0x40000000    # -2.0f

    .line 390
    .line 391
    const/high16 v26, 0x40000000    # 2.0f

    .line 392
    .line 393
    const v21, -0x40733333    # -1.1f

    .line 394
    .line 395
    .line 396
    const/high16 v23, -0x40000000    # -2.0f

    .line 397
    .line 398
    const v24, 0x3f666666    # 0.9f

    .line 399
    .line 400
    .line 401
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const/high16 v4, 0x40800000    # 4.0f

    .line 405
    .line 406
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const/high16 v4, 0x3f800000    # 1.0f

    .line 410
    .line 411
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const/high16 v4, 0x40a00000    # 5.0f

    .line 415
    .line 416
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const/high16 v25, 0x40000000    # 2.0f

    .line 420
    .line 421
    const/16 v21, 0x0

    .line 422
    .line 423
    const v22, 0x3f8ccccd    # 1.1f

    .line 424
    .line 425
    .line 426
    const v23, 0x3f666666    # 0.9f

    .line 427
    .line 428
    .line 429
    const/high16 v24, 0x40000000    # 2.0f

    .line 430
    .line 431
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/high16 v4, 0x3f800000    # 1.0f

    .line 435
    .line 436
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const/high16 v25, 0x40400000    # 3.0f

    .line 440
    .line 441
    const/high16 v26, 0x40400000    # 3.0f

    .line 442
    .line 443
    const v22, 0x3fd47ae1    # 1.66f

    .line 444
    .line 445
    .line 446
    const v23, 0x3fab851f    # 1.34f

    .line 447
    .line 448
    .line 449
    const/high16 v24, 0x40400000    # 3.0f

    .line 450
    .line 451
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v4, -0x40547ae1    # -1.34f

    .line 455
    .line 456
    .line 457
    const/high16 v6, -0x3fc00000    # -3.0f

    .line 458
    .line 459
    const/high16 v7, 0x40400000    # 3.0f

    .line 460
    .line 461
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const/high16 v4, 0x40800000    # 4.0f

    .line 465
    .line 466
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v4, -0x40547ae1    # -1.34f

    .line 473
    .line 474
    .line 475
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const/high16 v4, 0x40400000    # 3.0f

    .line 479
    .line 480
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v4, -0x3f2a3d71    # -6.68f

    .line 484
    .line 485
    .line 486
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const v25, 0x41b73333    # 22.9f

    .line 490
    .line 491
    .line 492
    const v26, 0x412b0a3d    # 10.69f

    .line 493
    .line 494
    .line 495
    const/high16 v21, 0x41b80000    # 23.0f

    .line 496
    .line 497
    const v22, 0x4131c28f    # 11.11f

    .line 498
    .line 499
    .line 500
    const v23, 0x41b7c28f    # 22.97f

    .line 501
    .line 502
    .line 503
    const v24, 0x412e6666    # 10.9f

    .line 504
    .line 505
    .line 506
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const/high16 v4, 0x40e00000    # 7.0f

    .line 513
    .line 514
    const/high16 v6, 0x41980000    # 19.0f

    .line 515
    .line 516
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/high16 v25, -0x40800000    # -1.0f

    .line 520
    .line 521
    const/high16 v26, -0x40800000    # -1.0f

    .line 522
    .line 523
    const v21, -0x40f33333    # -0.55f

    .line 524
    .line 525
    .line 526
    const/16 v22, 0x0

    .line 527
    .line 528
    const/high16 v23, -0x40800000    # -1.0f

    .line 529
    .line 530
    const v24, -0x4119999a    # -0.45f

    .line 531
    .line 532
    .line 533
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const v4, 0x3ee66666    # 0.45f

    .line 537
    .line 538
    .line 539
    const/high16 v6, -0x40800000    # -1.0f

    .line 540
    .line 541
    const/high16 v7, 0x3f800000    # 1.0f

    .line 542
    .line 543
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const/high16 v6, 0x3f800000    # 1.0f

    .line 547
    .line 548
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v4, 0x40f1999a    # 7.55f

    .line 552
    .line 553
    .line 554
    const/high16 v6, 0x40e00000    # 7.0f

    .line 555
    .line 556
    const/high16 v7, 0x41980000    # 19.0f

    .line 557
    .line 558
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const/high16 v4, 0x41400000    # 12.0f

    .line 565
    .line 566
    const/high16 v6, 0x41800000    # 16.0f

    .line 567
    .line 568
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const v4, 0x4113851f    # 9.22f

    .line 572
    .line 573
    .line 574
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const/high16 v25, 0x40e00000    # 7.0f

    .line 578
    .line 579
    const/high16 v26, 0x41700000    # 15.0f

    .line 580
    .line 581
    const v21, 0x410ab852    # 8.67f

    .line 582
    .line 583
    .line 584
    const v22, 0x41763d71    # 15.39f

    .line 585
    .line 586
    .line 587
    const v23, 0x40fc7ae1    # 7.89f

    .line 588
    .line 589
    .line 590
    const/high16 v24, 0x41700000    # 15.0f

    .line 591
    .line 592
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    const v4, -0x3ff1eb85    # -2.22f

    .line 596
    .line 597
    .line 598
    const v6, -0x402a3d71    # -1.67f

    .line 599
    .line 600
    .line 601
    const v7, 0x3ec7ae14    # 0.39f

    .line 602
    .line 603
    .line 604
    const/high16 v8, 0x3f800000    # 1.0f

    .line 605
    .line 606
    invoke-virtual {v2, v6, v7, v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const/high16 v4, 0x40400000    # 3.0f

    .line 610
    .line 611
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 615
    .line 616
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const/high16 v4, 0x41100000    # 9.0f

    .line 620
    .line 621
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const/high16 v4, 0x41800000    # 16.0f

    .line 625
    .line 626
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const/high16 v4, 0x41600000    # 14.0f

    .line 633
    .line 634
    const/high16 v6, 0x40e00000    # 7.0f

    .line 635
    .line 636
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const v4, 0x40b1eb85    # 5.56f

    .line 640
    .line 641
    .line 642
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    const v4, 0x3faa3d71    # 1.33f

    .line 646
    .line 647
    .line 648
    const/high16 v6, 0x40800000    # 4.0f

    .line 649
    .line 650
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const/high16 v4, 0x41600000    # 14.0f

    .line 654
    .line 655
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const/high16 v4, 0x40e00000    # 7.0f

    .line 659
    .line 660
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 664
    .line 665
    .line 666
    const/high16 v4, 0x41880000    # 17.0f

    .line 667
    .line 668
    const/high16 v6, 0x41980000    # 19.0f

    .line 669
    .line 670
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 671
    .line 672
    .line 673
    const/high16 v25, -0x40800000    # -1.0f

    .line 674
    .line 675
    const/high16 v26, -0x40800000    # -1.0f

    .line 676
    .line 677
    const v21, -0x40f33333    # -0.55f

    .line 678
    .line 679
    .line 680
    const/16 v22, 0x0

    .line 681
    .line 682
    const/high16 v23, -0x40800000    # -1.0f

    .line 683
    .line 684
    const v24, -0x4119999a    # -0.45f

    .line 685
    .line 686
    .line 687
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    const v4, 0x3ee66666    # 0.45f

    .line 691
    .line 692
    .line 693
    const/high16 v6, -0x40800000    # -1.0f

    .line 694
    .line 695
    const/high16 v7, 0x3f800000    # 1.0f

    .line 696
    .line 697
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    const/high16 v6, 0x3f800000    # 1.0f

    .line 701
    .line 702
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 703
    .line 704
    .line 705
    const v4, 0x418c6666    # 17.55f

    .line 706
    .line 707
    .line 708
    const/high16 v6, 0x41880000    # 17.0f

    .line 709
    .line 710
    const/high16 v7, 0x41980000    # 19.0f

    .line 711
    .line 712
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 713
    .line 714
    .line 715
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 716
    .line 717
    .line 718
    const/high16 v4, 0x41a80000    # 21.0f

    .line 719
    .line 720
    const/high16 v6, 0x41800000    # 16.0f

    .line 721
    .line 722
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 723
    .line 724
    .line 725
    const v4, -0x401c28f6    # -1.78f

    .line 726
    .line 727
    .line 728
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    const v25, -0x3ff1eb85    # -2.22f

    .line 732
    .line 733
    .line 734
    const v22, -0x40e3d70a    # -0.61f

    .line 735
    .line 736
    .line 737
    const v23, -0x40547ae1    # -1.34f

    .line 738
    .line 739
    .line 740
    const/high16 v24, -0x40800000    # -1.0f

    .line 741
    .line 742
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    const v4, -0x3ff1eb85    # -2.22f

    .line 746
    .line 747
    .line 748
    const v6, -0x402a3d71    # -1.67f

    .line 749
    .line 750
    .line 751
    const v7, 0x3ec7ae14    # 0.39f

    .line 752
    .line 753
    .line 754
    invoke-virtual {v2, v6, v7, v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 755
    .line 756
    .line 757
    const/high16 v4, 0x41600000    # 14.0f

    .line 758
    .line 759
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 760
    .line 761
    .line 762
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 763
    .line 764
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 765
    .line 766
    .line 767
    const/high16 v4, 0x40e00000    # 7.0f

    .line 768
    .line 769
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 770
    .line 771
    .line 772
    const/high16 v4, 0x41800000    # 16.0f

    .line 773
    .line 774
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 775
    .line 776
    .line 777
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 778
    .line 779
    .line 780
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 781
    .line 782
    .line 783
    move-result-object v2

    .line 784
    const/high16 v6, 0x3f800000    # 1.0f

    .line 785
    .line 786
    const/4 v7, 0x0

    .line 787
    const-string v4, ""

    .line 788
    .line 789
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 790
    .line 791
    .line 792
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 793
    .line 794
    .line 795
    move-result v3

    .line 796
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 797
    .line 798
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 799
    .line 800
    .line 801
    move-result-wide v6

    .line 802
    const/4 v0, 0x0

    .line 803
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 804
    .line 805
    .line 806
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 807
    .line 808
    .line 809
    move-result v10

    .line 810
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 811
    .line 812
    .line 813
    move-result v11

    .line 814
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 815
    .line 816
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 817
    .line 818
    .line 819
    const/high16 v2, 0x41300000    # 11.0f

    .line 820
    .line 821
    const/high16 v4, 0x41080000    # 8.5f

    .line 822
    .line 823
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 824
    .line 825
    .line 826
    const/high16 v2, -0x40800000    # -1.0f

    .line 827
    .line 828
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 829
    .line 830
    .line 831
    const/high16 v2, -0x40000000    # -2.0f

    .line 832
    .line 833
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 834
    .line 835
    .line 836
    const/high16 v2, 0x3f800000    # 1.0f

    .line 837
    .line 838
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 839
    .line 840
    .line 841
    const/high16 v2, 0x40a00000    # 5.0f

    .line 842
    .line 843
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 844
    .line 845
    .line 846
    const/high16 v2, 0x3f800000    # 1.0f

    .line 847
    .line 848
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 849
    .line 850
    .line 851
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 852
    .line 853
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 854
    .line 855
    .line 856
    const/high16 v2, 0x3f800000    # 1.0f

    .line 857
    .line 858
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 859
    .line 860
    .line 861
    const/high16 v2, 0x40000000    # 2.0f

    .line 862
    .line 863
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 864
    .line 865
    .line 866
    const/high16 v2, 0x3f800000    # 1.0f

    .line 867
    .line 868
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 869
    .line 870
    .line 871
    const/high16 v2, 0x41200000    # 10.0f

    .line 872
    .line 873
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 874
    .line 875
    .line 876
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 877
    .line 878
    .line 879
    const/high16 v2, 0x41080000    # 8.5f

    .line 880
    .line 881
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 882
    .line 883
    .line 884
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 885
    .line 886
    .line 887
    const/high16 v2, 0x40a80000    # 5.25f

    .line 888
    .line 889
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 890
    .line 891
    .line 892
    const/high16 v2, 0x40600000    # 3.5f

    .line 893
    .line 894
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 895
    .line 896
    .line 897
    const/high16 v2, -0x40000000    # -2.0f

    .line 898
    .line 899
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 900
    .line 901
    .line 902
    const/high16 v2, 0x3fe00000    # 1.75f

    .line 903
    .line 904
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 905
    .line 906
    .line 907
    const/high16 v2, 0x41080000    # 8.5f

    .line 908
    .line 909
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 910
    .line 911
    .line 912
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 913
    .line 914
    .line 915
    invoke-virtual {v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 916
    .line 917
    .line 918
    const/high16 v2, 0x40d80000    # 6.75f

    .line 919
    .line 920
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 921
    .line 922
    .line 923
    const/high16 v2, -0x40000000    # -2.0f

    .line 924
    .line 925
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 926
    .line 927
    .line 928
    const/high16 v2, 0x41080000    # 8.5f

    .line 929
    .line 930
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 931
    .line 932
    .line 933
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 934
    .line 935
    .line 936
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 937
    .line 938
    .line 939
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 940
    .line 941
    .line 942
    move-result-object v2

    .line 943
    const/high16 v6, 0x3f800000    # 1.0f

    .line 944
    .line 945
    const/4 v7, 0x0

    .line 946
    const-string v4, ""

    .line 947
    .line 948
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 949
    .line 950
    .line 951
    move-result-object v0

    .line 952
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 953
    .line 954
    .line 955
    move-result-object v0

    .line 956
    sput-object v0, Landroidx/compose/material/icons/twotone/FireTruckKt;->_fireTruck:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 957
    .line 958
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 959
    .line 960
    .line 961
    return-object v0
.end method
