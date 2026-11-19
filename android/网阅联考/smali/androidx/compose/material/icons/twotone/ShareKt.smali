.class public final Landroidx/compose/material/icons/twotone/ShareKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_share",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Share",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getShare",
        "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;",
        "material-icons-core_release"
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
        "SMAP\nShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Share.kt\nandroidx/compose/material/icons/twotone/ShareKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,95:1\n122#2:96\n116#2,3:97\n119#2,3:101\n132#2,18:104\n152#2:141\n132#2,18:142\n152#2:179\n132#2,18:180\n152#2:217\n132#2,18:218\n152#2:255\n175#3:100\n694#4,2:122\n706#4,2:124\n708#4,11:130\n694#4,2:160\n706#4,2:162\n708#4,11:168\n694#4,2:198\n706#4,2:200\n708#4,11:206\n694#4,2:236\n706#4,2:238\n708#4,11:244\n53#5,4:126\n53#5,4:164\n53#5,4:202\n53#5,4:240\n*S KotlinDebug\n*F\n+ 1 Share.kt\nandroidx/compose/material/icons/twotone/ShareKt\n*L\n29#1:96\n29#1:97,3\n29#1:101,3\n30#1:104,18\n30#1:141\n36#1:142,18\n36#1:179\n42#1:180,18\n42#1:217\n48#1:218,18\n48#1:255\n29#1:100\n30#1:122,2\n30#1:124,2\n30#1:130,11\n36#1:160,2\n36#1:162,2\n36#1:168,11\n42#1:198,2\n42#1:200,2\n42#1:206,11\n48#1:236,2\n48#1:238,2\n48#1:244,11\n30#1:126,4\n36#1:164,4\n42#1:202,4\n48#1:240,4\n*E\n"
    }
.end annotation


# static fields
.field private static _share:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getShare(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 81

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Landroidx/compose/material/icons/twotone/ShareKt;->_share:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    const-string v2, "TwoTone.Share"

    .line 17
    .line 18
    new-instance v1, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 19
    .line 20
    move-object/from16 v64, v1

    .line 21
    .line 22
    move-object/from16 v47, v1

    .line 23
    .line 24
    move-object/from16 v30, v1

    .line 25
    .line 26
    move-object v13, v1

    .line 27
    const/high16 v0, 0x41c00000    # 24.0f

    .line 28
    .line 29
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    const/high16 v5, 0x41c00000    # 24.0f

    .line 38
    .line 39
    const/high16 v6, 0x41c00000    # 24.0f

    .line 40
    .line 41
    const-wide/16 v7, 0x0

    .line 42
    .line 43
    const/4 v9, 0x0

    .line 44
    const/4 v10, 0x0

    .line 45
    const/16 v11, 0xe0

    .line 46
    .line 47
    const/4 v12, 0x0

    .line 48
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 49
    .line 50
    .line 51
    const v18, 0x3e99999a    # 0.3f

    .line 52
    .line 53
    .line 54
    const v20, 0x3e99999a    # 0.3f

    .line 55
    .line 56
    .line 57
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 58
    .line 59
    .line 60
    move-result v15

    .line 61
    new-instance v0, Landroidx/compose/ui/graphics/SolidColor;

    .line 62
    .line 63
    move-object/from16 v17, v0

    .line 64
    .line 65
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 66
    .line 67
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 68
    .line 69
    .line 70
    move-result-wide v2

    .line 71
    const/4 v4, 0x0

    .line 72
    invoke-direct {v0, v2, v3, v4}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 73
    .line 74
    .line 75
    const/16 v19, 0x0

    .line 76
    .line 77
    const/high16 v21, 0x3f800000    # 1.0f

    .line 78
    .line 79
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 80
    .line 81
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 82
    .line 83
    .line 84
    move-result v22

    .line 85
    sget-object v2, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 86
    .line 87
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 88
    .line 89
    .line 90
    move-result v23

    .line 91
    const/high16 v24, 0x3f800000    # 1.0f

    .line 92
    .line 93
    const-string v16, ""

    .line 94
    .line 95
    new-instance v3, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    invoke-direct {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 98
    .line 99
    .line 100
    const/high16 v5, 0x40a00000    # 5.0f

    .line 101
    .line 102
    const/high16 v14, 0x41900000    # 18.0f

    .line 103
    .line 104
    invoke-virtual {v3, v14, v5}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v12, -0x40800000    # -1.0f

    .line 108
    .line 109
    const/4 v11, 0x0

    .line 110
    invoke-virtual {v3, v12, v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const/high16 v6, 0x3f800000    # 1.0f

    .line 114
    .line 115
    const/high16 v7, 0x3f800000    # 1.0f

    .line 116
    .line 117
    const/4 v8, 0x0

    .line 118
    const/4 v9, 0x1

    .line 119
    const/4 v10, 0x1

    .line 120
    const/high16 v25, 0x40000000    # 2.0f

    .line 121
    .line 122
    const/16 v26, 0x0

    .line 123
    .line 124
    move-object v5, v3

    .line 125
    move/from16 v11, v25

    .line 126
    .line 127
    move/from16 v12, v26

    .line 128
    .line 129
    invoke-virtual/range {v5 .. v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/high16 v11, -0x40000000    # -2.0f

    .line 133
    .line 134
    const/4 v12, 0x0

    .line 135
    invoke-virtual/range {v5 .. v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    move v5, v14

    .line 143
    move-object v14, v3

    .line 144
    const/16 v25, 0x0

    .line 145
    .line 146
    const/16 v27, 0x0

    .line 147
    .line 148
    const/16 v28, 0x3800

    .line 149
    .line 150
    const/16 v29, 0x0

    .line 151
    .line 152
    invoke-static/range {v13 .. v29}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 153
    .line 154
    .line 155
    const v35, 0x3e99999a    # 0.3f

    .line 156
    .line 157
    .line 158
    const v37, 0x3e99999a    # 0.3f

    .line 159
    .line 160
    .line 161
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 162
    .line 163
    .line 164
    move-result v32

    .line 165
    new-instance v3, Landroidx/compose/ui/graphics/SolidColor;

    .line 166
    .line 167
    move-object/from16 v34, v3

    .line 168
    .line 169
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 170
    .line 171
    .line 172
    move-result-wide v6

    .line 173
    invoke-direct {v3, v6, v7, v4}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 174
    .line 175
    .line 176
    const/16 v36, 0x0

    .line 177
    .line 178
    const/high16 v38, 0x3f800000    # 1.0f

    .line 179
    .line 180
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 181
    .line 182
    .line 183
    move-result v39

    .line 184
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 185
    .line 186
    .line 187
    move-result v40

    .line 188
    const/high16 v41, 0x3f800000    # 1.0f

    .line 189
    .line 190
    const-string v33, ""

    .line 191
    .line 192
    new-instance v3, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    invoke-direct {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 195
    .line 196
    .line 197
    const/high16 v6, 0x41400000    # 12.0f

    .line 198
    .line 199
    const/high16 v14, 0x40c00000    # 6.0f

    .line 200
    .line 201
    invoke-virtual {v3, v14, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v13, -0x40800000    # -1.0f

    .line 205
    .line 206
    const/4 v15, 0x0

    .line 207
    invoke-virtual {v3, v13, v15}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v7, 0x3f800000    # 1.0f

    .line 211
    .line 212
    const/high16 v8, 0x3f800000    # 1.0f

    .line 213
    .line 214
    const/4 v9, 0x0

    .line 215
    const/4 v11, 0x1

    .line 216
    const/high16 v12, 0x40000000    # 2.0f

    .line 217
    .line 218
    const/16 v16, 0x0

    .line 219
    .line 220
    move-object v6, v3

    .line 221
    move v14, v13

    .line 222
    move/from16 v13, v16

    .line 223
    .line 224
    invoke-virtual/range {v6 .. v13}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const/high16 v12, -0x40000000    # -2.0f

    .line 228
    .line 229
    const/4 v13, 0x0

    .line 230
    invoke-virtual/range {v6 .. v13}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 234
    .line 235
    .line 236
    move-result-object v31

    .line 237
    const/16 v42, 0x0

    .line 238
    .line 239
    const/16 v43, 0x0

    .line 240
    .line 241
    const/16 v44, 0x0

    .line 242
    .line 243
    const/16 v45, 0x3800

    .line 244
    .line 245
    const/16 v46, 0x0

    .line 246
    .line 247
    invoke-static/range {v30 .. v46}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 248
    .line 249
    .line 250
    const v52, 0x3e99999a    # 0.3f

    .line 251
    .line 252
    .line 253
    const v54, 0x3e99999a    # 0.3f

    .line 254
    .line 255
    .line 256
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 257
    .line 258
    .line 259
    move-result v49

    .line 260
    new-instance v3, Landroidx/compose/ui/graphics/SolidColor;

    .line 261
    .line 262
    move-object/from16 v51, v3

    .line 263
    .line 264
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 265
    .line 266
    .line 267
    move-result-wide v6

    .line 268
    invoke-direct {v3, v6, v7, v4}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 269
    .line 270
    .line 271
    const/16 v53, 0x0

    .line 272
    .line 273
    const/high16 v55, 0x3f800000    # 1.0f

    .line 274
    .line 275
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 276
    .line 277
    .line 278
    move-result v56

    .line 279
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 280
    .line 281
    .line 282
    move-result v57

    .line 283
    const/high16 v58, 0x3f800000    # 1.0f

    .line 284
    .line 285
    const-string v50, ""

    .line 286
    .line 287
    new-instance v3, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    invoke-direct {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 290
    .line 291
    .line 292
    const v6, 0x419828f6    # 19.02f

    .line 293
    .line 294
    .line 295
    invoke-virtual {v3, v5, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v3, v14, v15}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const/high16 v7, 0x3f800000    # 1.0f

    .line 302
    .line 303
    const/high16 v12, 0x40000000    # 2.0f

    .line 304
    .line 305
    move-object v6, v3

    .line 306
    invoke-virtual/range {v6 .. v13}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const/high16 v12, -0x40000000    # -2.0f

    .line 310
    .line 311
    invoke-virtual/range {v6 .. v13}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 315
    .line 316
    .line 317
    move-result-object v48

    .line 318
    const/16 v59, 0x0

    .line 319
    .line 320
    const/16 v60, 0x0

    .line 321
    .line 322
    const/16 v61, 0x0

    .line 323
    .line 324
    const/16 v62, 0x3800

    .line 325
    .line 326
    const/16 v63, 0x0

    .line 327
    .line 328
    invoke-static/range {v47 .. v63}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 329
    .line 330
    .line 331
    const/high16 v69, 0x3f800000    # 1.0f

    .line 332
    .line 333
    const/high16 v71, 0x3f800000    # 1.0f

    .line 334
    .line 335
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 336
    .line 337
    .line 338
    move-result v66

    .line 339
    new-instance v3, Landroidx/compose/ui/graphics/SolidColor;

    .line 340
    .line 341
    move-object/from16 v68, v3

    .line 342
    .line 343
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 344
    .line 345
    .line 346
    move-result-wide v6

    .line 347
    invoke-direct {v3, v6, v7, v4}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 348
    .line 349
    .line 350
    const/16 v70, 0x0

    .line 351
    .line 352
    const/high16 v72, 0x3f800000    # 1.0f

    .line 353
    .line 354
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 355
    .line 356
    .line 357
    move-result v73

    .line 358
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 359
    .line 360
    .line 361
    move-result v74

    .line 362
    const/high16 v75, 0x3f800000    # 1.0f

    .line 363
    .line 364
    const-string v67, ""

    .line 365
    .line 366
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 369
    .line 370
    .line 371
    const v1, 0x4180a3d7    # 16.08f

    .line 372
    .line 373
    .line 374
    invoke-virtual {v0, v5, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const v7, -0x40bd70a4    # -0.76f

    .line 378
    .line 379
    .line 380
    const/4 v8, 0x0

    .line 381
    const v9, -0x4047ae14    # -1.44f

    .line 382
    .line 383
    .line 384
    const v10, 0x3e99999a    # 0.3f

    .line 385
    .line 386
    .line 387
    const v11, -0x40051eb8    # -1.96f

    .line 388
    .line 389
    .line 390
    const v12, 0x3f451eb8    # 0.77f

    .line 391
    .line 392
    .line 393
    move-object v6, v0

    .line 394
    invoke-virtual/range {v6 .. v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v1, 0x410e8f5c    # 8.91f

    .line 398
    .line 399
    .line 400
    const v2, 0x414b3333    # 12.7f

    .line 401
    .line 402
    .line 403
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v7, 0x3d4ccccd    # 0.05f

    .line 407
    .line 408
    .line 409
    const v8, -0x41947ae1    # -0.23f

    .line 410
    .line 411
    .line 412
    const v9, 0x3db851ec    # 0.09f

    .line 413
    .line 414
    .line 415
    const v10, -0x41147ae1    # -0.46f

    .line 416
    .line 417
    .line 418
    const v11, 0x3db851ec    # 0.09f

    .line 419
    .line 420
    .line 421
    const v12, -0x40cccccd    # -0.7f

    .line 422
    .line 423
    .line 424
    invoke-virtual/range {v6 .. v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v1, -0x4247ae14    # -0.09f

    .line 428
    .line 429
    .line 430
    const v2, -0x40cccccd    # -0.7f

    .line 431
    .line 432
    .line 433
    const v3, -0x42dc28f6    # -0.04f

    .line 434
    .line 435
    .line 436
    const v4, -0x410f5c29    # -0.47f

    .line 437
    .line 438
    .line 439
    invoke-virtual {v0, v3, v4, v1, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v1, 0x40e1999a    # 7.05f

    .line 443
    .line 444
    .line 445
    const v2, -0x3f7c7ae1    # -4.11f

    .line 446
    .line 447
    .line 448
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v7, 0x3f0a3d71    # 0.54f

    .line 452
    .line 453
    .line 454
    const/high16 v8, 0x3f000000    # 0.5f

    .line 455
    .line 456
    const/high16 v9, 0x3fa00000    # 1.25f

    .line 457
    .line 458
    const v10, 0x3f4f5c29    # 0.81f

    .line 459
    .line 460
    .line 461
    const v11, 0x40028f5c    # 2.04f

    .line 462
    .line 463
    .line 464
    const v12, 0x3f4f5c29    # 0.81f

    .line 465
    .line 466
    .line 467
    invoke-virtual/range {v6 .. v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v7, 0x3fd47ae1    # 1.66f

    .line 471
    .line 472
    .line 473
    const/4 v8, 0x0

    .line 474
    const/high16 v9, 0x40400000    # 3.0f

    .line 475
    .line 476
    const v10, -0x40547ae1    # -1.34f

    .line 477
    .line 478
    .line 479
    const/high16 v11, 0x40400000    # 3.0f

    .line 480
    .line 481
    const/high16 v12, -0x3fc00000    # -3.0f

    .line 482
    .line 483
    invoke-virtual/range {v6 .. v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const v1, -0x40547ae1    # -1.34f

    .line 487
    .line 488
    .line 489
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 490
    .line 491
    invoke-virtual {v0, v1, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const v1, 0x3fab851f    # 1.34f

    .line 495
    .line 496
    .line 497
    const/high16 v3, 0x40400000    # 3.0f

    .line 498
    .line 499
    invoke-virtual {v0, v2, v1, v2, v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const/4 v7, 0x0

    .line 503
    const v8, 0x3e75c28f    # 0.24f

    .line 504
    .line 505
    .line 506
    const v9, 0x3d23d70a    # 0.04f

    .line 507
    .line 508
    .line 509
    const v10, 0x3ef0a3d7    # 0.47f

    .line 510
    .line 511
    .line 512
    const v11, 0x3db851ec    # 0.09f

    .line 513
    .line 514
    .line 515
    const v12, 0x3f333333    # 0.7f

    .line 516
    .line 517
    .line 518
    invoke-virtual/range {v6 .. v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v2, 0x4100a3d7    # 8.04f

    .line 522
    .line 523
    .line 524
    const v4, 0x411cf5c3    # 9.81f

    .line 525
    .line 526
    .line 527
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const/high16 v7, 0x40f00000    # 7.5f

    .line 531
    .line 532
    const v8, 0x4114f5c3    # 9.31f

    .line 533
    .line 534
    .line 535
    const v9, 0x40d947ae    # 6.79f

    .line 536
    .line 537
    .line 538
    const/high16 v10, 0x41100000    # 9.0f

    .line 539
    .line 540
    const/high16 v11, 0x40c00000    # 6.0f

    .line 541
    .line 542
    const/high16 v12, 0x41100000    # 9.0f

    .line 543
    .line 544
    invoke-virtual/range {v6 .. v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const v7, -0x402b851f    # -1.66f

    .line 548
    .line 549
    .line 550
    const/4 v8, 0x0

    .line 551
    const/high16 v9, -0x3fc00000    # -3.0f

    .line 552
    .line 553
    const v10, 0x3fab851f    # 1.34f

    .line 554
    .line 555
    .line 556
    const/high16 v11, -0x3fc00000    # -3.0f

    .line 557
    .line 558
    const/high16 v12, 0x40400000    # 3.0f

    .line 559
    .line 560
    invoke-virtual/range {v6 .. v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    invoke-virtual {v0, v1, v3, v3, v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const v7, 0x3f4a3d71    # 0.79f

    .line 567
    .line 568
    .line 569
    const/high16 v9, 0x3fc00000    # 1.5f

    .line 570
    .line 571
    const v10, -0x416147ae    # -0.31f

    .line 572
    .line 573
    .line 574
    const v11, 0x40028f5c    # 2.04f

    .line 575
    .line 576
    .line 577
    const v12, -0x40b0a3d7    # -0.81f

    .line 578
    .line 579
    .line 580
    invoke-virtual/range {v6 .. v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const v1, 0x40e3d70a    # 7.12f

    .line 584
    .line 585
    .line 586
    const v2, 0x40851eb8    # 4.16f

    .line 587
    .line 588
    .line 589
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const v7, -0x42b33333    # -0.05f

    .line 593
    .line 594
    .line 595
    const v8, 0x3e570a3d    # 0.21f

    .line 596
    .line 597
    .line 598
    const v9, -0x425c28f6    # -0.08f

    .line 599
    .line 600
    .line 601
    const v10, 0x3edc28f6    # 0.43f

    .line 602
    .line 603
    .line 604
    const v11, -0x425c28f6    # -0.08f

    .line 605
    .line 606
    .line 607
    const v12, 0x3f266666    # 0.65f

    .line 608
    .line 609
    .line 610
    invoke-virtual/range {v6 .. v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const/4 v7, 0x0

    .line 614
    const v8, 0x3fce147b    # 1.61f

    .line 615
    .line 616
    .line 617
    const v9, 0x3fa7ae14    # 1.31f

    .line 618
    .line 619
    .line 620
    const v10, 0x403ae148    # 2.92f

    .line 621
    .line 622
    .line 623
    const v11, 0x403ae148    # 2.92f

    .line 624
    .line 625
    .line 626
    const v12, 0x403ae148    # 2.92f

    .line 627
    .line 628
    .line 629
    invoke-virtual/range {v6 .. v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const v1, -0x405851ec    # -1.31f

    .line 633
    .line 634
    .line 635
    const v2, -0x3fc51eb8    # -2.92f

    .line 636
    .line 637
    .line 638
    const v3, 0x403ae148    # 2.92f

    .line 639
    .line 640
    .line 641
    invoke-virtual {v0, v3, v1, v3, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const v8, -0x4031eb85    # -1.61f

    .line 645
    .line 646
    .line 647
    const v9, -0x405851ec    # -1.31f

    .line 648
    .line 649
    .line 650
    const v10, -0x3fc51eb8    # -2.92f

    .line 651
    .line 652
    .line 653
    const v11, -0x3fc51eb8    # -2.92f

    .line 654
    .line 655
    .line 656
    const v12, -0x3fc51eb8    # -2.92f

    .line 657
    .line 658
    .line 659
    invoke-virtual/range {v6 .. v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    const/high16 v1, 0x40800000    # 4.0f

    .line 666
    .line 667
    invoke-virtual {v0, v5, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const v7, 0x3f0ccccd    # 0.55f

    .line 671
    .line 672
    .line 673
    const/4 v8, 0x0

    .line 674
    const/high16 v9, 0x3f800000    # 1.0f

    .line 675
    .line 676
    const v10, 0x3ee66666    # 0.45f

    .line 677
    .line 678
    .line 679
    const/high16 v11, 0x3f800000    # 1.0f

    .line 680
    .line 681
    const/high16 v12, 0x3f800000    # 1.0f

    .line 682
    .line 683
    invoke-virtual/range {v6 .. v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 684
    .line 685
    .line 686
    const v1, -0x4119999a    # -0.45f

    .line 687
    .line 688
    .line 689
    const/high16 v2, 0x3f800000    # 1.0f

    .line 690
    .line 691
    invoke-virtual {v0, v1, v2, v14, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 692
    .line 693
    .line 694
    invoke-virtual {v0, v14, v1, v14, v14}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    const v3, 0x3ee66666    # 0.45f

    .line 698
    .line 699
    .line 700
    invoke-virtual {v0, v3, v14, v2, v14}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    const/high16 v4, 0x41500000    # 13.0f

    .line 707
    .line 708
    const/high16 v6, 0x40c00000    # 6.0f

    .line 709
    .line 710
    invoke-virtual {v0, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 711
    .line 712
    .line 713
    const v7, -0x40f33333    # -0.55f

    .line 714
    .line 715
    .line 716
    const/high16 v9, -0x40800000    # -1.0f

    .line 717
    .line 718
    const v10, -0x4119999a    # -0.45f

    .line 719
    .line 720
    .line 721
    const/high16 v11, -0x40800000    # -1.0f

    .line 722
    .line 723
    const/high16 v12, -0x40800000    # -1.0f

    .line 724
    .line 725
    move-object v6, v0

    .line 726
    invoke-virtual/range {v6 .. v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 727
    .line 728
    .line 729
    invoke-virtual {v0, v3, v14, v2, v14}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    invoke-virtual {v0, v2, v3, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 733
    .line 734
    .line 735
    invoke-virtual {v0, v1, v2, v14, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 736
    .line 737
    .line 738
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 739
    .line 740
    .line 741
    const v4, 0x41a028f6    # 20.02f

    .line 742
    .line 743
    .line 744
    invoke-virtual {v0, v5, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 745
    .line 746
    .line 747
    invoke-virtual/range {v6 .. v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 748
    .line 749
    .line 750
    invoke-virtual {v0, v3, v14, v2, v14}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 751
    .line 752
    .line 753
    invoke-virtual {v0, v2, v3, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 754
    .line 755
    .line 756
    invoke-virtual {v0, v1, v2, v14, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 757
    .line 758
    .line 759
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 760
    .line 761
    .line 762
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 763
    .line 764
    .line 765
    move-result-object v65

    .line 766
    const/16 v76, 0x0

    .line 767
    .line 768
    const/16 v77, 0x0

    .line 769
    .line 770
    const/16 v78, 0x0

    .line 771
    .line 772
    const/16 v79, 0x3800

    .line 773
    .line 774
    const/16 v80, 0x0

    .line 775
    .line 776
    invoke-static/range {v64 .. v80}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 777
    .line 778
    .line 779
    move-result-object v0

    .line 780
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 781
    .line 782
    .line 783
    move-result-object v0

    .line 784
    sput-object v0, Landroidx/compose/material/icons/twotone/ShareKt;->_share:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 785
    .line 786
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 787
    .line 788
    .line 789
    return-object v0
.end method
