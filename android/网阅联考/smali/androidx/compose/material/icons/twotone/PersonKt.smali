.class public final Landroidx/compose/material/icons/twotone/PersonKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_person",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Person",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getPerson",
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
        "SMAP\nPerson.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Person.kt\nandroidx/compose/material/icons/twotone/PersonKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,74:1\n122#2:75\n116#2,3:76\n119#2,3:80\n132#2,18:83\n152#2:120\n132#2,18:121\n152#2:158\n132#2,18:159\n152#2:196\n175#3:79\n694#4,2:101\n706#4,2:103\n708#4,11:109\n694#4,2:139\n706#4,2:141\n708#4,11:147\n694#4,2:177\n706#4,2:179\n708#4,11:185\n53#5,4:105\n53#5,4:143\n53#5,4:181\n*S KotlinDebug\n*F\n+ 1 Person.kt\nandroidx/compose/material/icons/twotone/PersonKt\n*L\n29#1:75\n29#1:76,3\n29#1:80,3\n30#1:83,18\n30#1:120\n37#1:121,18\n37#1:158\n43#1:159,18\n43#1:196\n29#1:79\n30#1:101,2\n30#1:103,2\n30#1:109,11\n37#1:139,2\n37#1:141,2\n37#1:147,11\n43#1:177,2\n43#1:179,2\n43#1:185,11\n30#1:105,4\n37#1:143,4\n43#1:181,4\n*E\n"
    }
.end annotation


# static fields
.field private static _person:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPerson(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 64

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
    sget-object v0, Landroidx/compose/material/icons/twotone/PersonKt;->_person:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Person"

    .line 17
    .line 18
    new-instance v1, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 19
    .line 20
    move-object/from16 v47, v1

    .line 21
    .line 22
    move-object/from16 v30, v1

    .line 23
    .line 24
    move-object v13, v1

    .line 25
    const/high16 v0, 0x41c00000    # 24.0f

    .line 26
    .line 27
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    const/high16 v5, 0x41c00000    # 24.0f

    .line 36
    .line 37
    const/high16 v6, 0x41c00000    # 24.0f

    .line 38
    .line 39
    const-wide/16 v7, 0x0

    .line 40
    .line 41
    const/4 v9, 0x0

    .line 42
    const/4 v10, 0x0

    .line 43
    const/16 v11, 0xe0

    .line 44
    .line 45
    const/4 v12, 0x0

    .line 46
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 47
    .line 48
    .line 49
    const v18, 0x3e99999a    # 0.3f

    .line 50
    .line 51
    .line 52
    const v20, 0x3e99999a    # 0.3f

    .line 53
    .line 54
    .line 55
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 56
    .line 57
    .line 58
    move-result v15

    .line 59
    new-instance v0, Landroidx/compose/ui/graphics/SolidColor;

    .line 60
    .line 61
    move-object/from16 v17, v0

    .line 62
    .line 63
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 64
    .line 65
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 66
    .line 67
    .line 68
    move-result-wide v2

    .line 69
    const/4 v4, 0x0

    .line 70
    invoke-direct {v0, v2, v3, v4}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 71
    .line 72
    .line 73
    const/16 v19, 0x0

    .line 74
    .line 75
    const/high16 v21, 0x3f800000    # 1.0f

    .line 76
    .line 77
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 78
    .line 79
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 80
    .line 81
    .line 82
    move-result v22

    .line 83
    sget-object v2, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 84
    .line 85
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 86
    .line 87
    .line 88
    move-result v23

    .line 89
    const/high16 v24, 0x3f800000    # 1.0f

    .line 90
    .line 91
    const-string v16, ""

    .line 92
    .line 93
    new-instance v3, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    invoke-direct {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 96
    .line 97
    .line 98
    const/high16 v12, 0x41400000    # 12.0f

    .line 99
    .line 100
    const/high16 v14, 0x41800000    # 16.0f

    .line 101
    .line 102
    invoke-virtual {v3, v12, v14}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v6, -0x3fd3d70a    # -2.69f

    .line 106
    .line 107
    .line 108
    const/4 v7, 0x0

    .line 109
    const v8, -0x3f475c29    # -5.77f

    .line 110
    .line 111
    .line 112
    const v9, 0x3fa3d70a    # 1.28f

    .line 113
    .line 114
    .line 115
    const/high16 v10, -0x3f400000    # -6.0f

    .line 116
    .line 117
    const/high16 v11, 0x40000000    # 2.0f

    .line 118
    .line 119
    move-object v5, v3

    .line 120
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v3, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v6, -0x41b33333    # -0.2f

    .line 127
    .line 128
    .line 129
    const v7, -0x40ca3d71    # -0.71f

    .line 130
    .line 131
    .line 132
    const v8, -0x3faccccd    # -3.3f

    .line 133
    .line 134
    .line 135
    const/high16 v9, -0x40000000    # -2.0f

    .line 136
    .line 137
    const/high16 v11, -0x40000000    # -2.0f

    .line 138
    .line 139
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    move v5, v14

    .line 150
    move-object v14, v3

    .line 151
    const/16 v25, 0x0

    .line 152
    .line 153
    const/16 v26, 0x0

    .line 154
    .line 155
    const/16 v27, 0x0

    .line 156
    .line 157
    const/16 v28, 0x3800

    .line 158
    .line 159
    const/16 v29, 0x0

    .line 160
    .line 161
    invoke-static/range {v13 .. v29}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 162
    .line 163
    .line 164
    const v35, 0x3e99999a    # 0.3f

    .line 165
    .line 166
    .line 167
    const v37, 0x3e99999a    # 0.3f

    .line 168
    .line 169
    .line 170
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 171
    .line 172
    .line 173
    move-result v32

    .line 174
    new-instance v3, Landroidx/compose/ui/graphics/SolidColor;

    .line 175
    .line 176
    move-object/from16 v34, v3

    .line 177
    .line 178
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 179
    .line 180
    .line 181
    move-result-wide v6

    .line 182
    invoke-direct {v3, v6, v7, v4}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 183
    .line 184
    .line 185
    const/16 v36, 0x0

    .line 186
    .line 187
    const/high16 v38, 0x3f800000    # 1.0f

    .line 188
    .line 189
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 190
    .line 191
    .line 192
    move-result v39

    .line 193
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 194
    .line 195
    .line 196
    move-result v40

    .line 197
    const/high16 v41, 0x3f800000    # 1.0f

    .line 198
    .line 199
    const-string v33, ""

    .line 200
    .line 201
    new-instance v3, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    invoke-direct {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 204
    .line 205
    .line 206
    const/high16 v6, 0x41000000    # 8.0f

    .line 207
    .line 208
    invoke-virtual {v3, v12, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/4 v6, 0x0

    .line 212
    const/high16 v7, -0x40000000    # -2.0f

    .line 213
    .line 214
    invoke-virtual {v3, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v14, 0x40000000    # 2.0f

    .line 218
    .line 219
    const/high16 v15, 0x40000000    # 2.0f

    .line 220
    .line 221
    const/16 v16, 0x0

    .line 222
    .line 223
    const/16 v17, 0x1

    .line 224
    .line 225
    const/16 v18, 0x1

    .line 226
    .line 227
    const/high16 v19, 0x40800000    # 4.0f

    .line 228
    .line 229
    const/16 v20, 0x0

    .line 230
    .line 231
    move-object v13, v3

    .line 232
    invoke-virtual/range {v13 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v19, -0x3f800000    # -4.0f

    .line 236
    .line 237
    invoke-virtual/range {v13 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 241
    .line 242
    .line 243
    move-result-object v31

    .line 244
    const/16 v42, 0x0

    .line 245
    .line 246
    const/16 v43, 0x0

    .line 247
    .line 248
    const/16 v44, 0x0

    .line 249
    .line 250
    const/16 v45, 0x3800

    .line 251
    .line 252
    const/16 v46, 0x0

    .line 253
    .line 254
    invoke-static/range {v30 .. v46}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 255
    .line 256
    .line 257
    const/high16 v52, 0x3f800000    # 1.0f

    .line 258
    .line 259
    const/high16 v54, 0x3f800000    # 1.0f

    .line 260
    .line 261
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 262
    .line 263
    .line 264
    move-result v49

    .line 265
    new-instance v3, Landroidx/compose/ui/graphics/SolidColor;

    .line 266
    .line 267
    move-object/from16 v51, v3

    .line 268
    .line 269
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 270
    .line 271
    .line 272
    move-result-wide v8

    .line 273
    invoke-direct {v3, v8, v9, v4}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 274
    .line 275
    .line 276
    const/16 v53, 0x0

    .line 277
    .line 278
    const/high16 v55, 0x3f800000    # 1.0f

    .line 279
    .line 280
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 281
    .line 282
    .line 283
    move-result v56

    .line 284
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 285
    .line 286
    .line 287
    move-result v57

    .line 288
    const/high16 v58, 0x3f800000    # 1.0f

    .line 289
    .line 290
    const-string v50, ""

    .line 291
    .line 292
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 295
    .line 296
    .line 297
    const/high16 v1, 0x41600000    # 14.0f

    .line 298
    .line 299
    invoke-virtual {v0, v12, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v14, -0x3fd51eb8    # -2.67f

    .line 303
    .line 304
    .line 305
    const/4 v15, 0x0

    .line 306
    const/high16 v16, -0x3f000000    # -8.0f

    .line 307
    .line 308
    const v17, 0x3fab851f    # 1.34f

    .line 309
    .line 310
    .line 311
    const/high16 v18, -0x3f000000    # -8.0f

    .line 312
    .line 313
    const/high16 v19, 0x40800000    # 4.0f

    .line 314
    .line 315
    move-object v13, v0

    .line 316
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v1, 0x40000000    # 2.0f

    .line 320
    .line 321
    invoke-virtual {v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v0, v5}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v0, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/4 v14, 0x0

    .line 331
    const v15, -0x3fd5c28f    # -2.66f

    .line 332
    .line 333
    .line 334
    const v16, -0x3f5570a4    # -5.33f

    .line 335
    .line 336
    .line 337
    const/high16 v17, -0x3f800000    # -4.0f

    .line 338
    .line 339
    const/high16 v19, -0x3f800000    # -4.0f

    .line 340
    .line 341
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v2, 0x40c00000    # 6.0f

    .line 348
    .line 349
    const/high16 v3, 0x41900000    # 18.0f

    .line 350
    .line 351
    invoke-virtual {v0, v2, v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v14, 0x3e6147ae    # 0.22f

    .line 355
    .line 356
    .line 357
    const v15, -0x40c7ae14    # -0.72f

    .line 358
    .line 359
    .line 360
    const v16, 0x4053d70a    # 3.31f

    .line 361
    .line 362
    .line 363
    const/high16 v17, -0x40000000    # -2.0f

    .line 364
    .line 365
    const/high16 v18, 0x40c00000    # 6.0f

    .line 366
    .line 367
    const/high16 v19, -0x40000000    # -2.0f

    .line 368
    .line 369
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v14, 0x402ccccd    # 2.7f

    .line 373
    .line 374
    .line 375
    const/4 v15, 0x0

    .line 376
    const v16, 0x40b9999a    # 5.8f

    .line 377
    .line 378
    .line 379
    const v17, 0x3fa51eb8    # 1.29f

    .line 380
    .line 381
    .line 382
    const/high16 v19, 0x40000000    # 2.0f

    .line 383
    .line 384
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    invoke-virtual {v0, v2, v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v0, v12, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v14, 0x400d70a4    # 2.21f

    .line 397
    .line 398
    .line 399
    const/high16 v16, 0x40800000    # 4.0f

    .line 400
    .line 401
    const v17, -0x401ae148    # -1.79f

    .line 402
    .line 403
    .line 404
    const/high16 v18, 0x40800000    # 4.0f

    .line 405
    .line 406
    const/high16 v19, -0x3f800000    # -4.0f

    .line 407
    .line 408
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v3, -0x401ae148    # -1.79f

    .line 412
    .line 413
    .line 414
    const/high16 v4, -0x3f800000    # -4.0f

    .line 415
    .line 416
    invoke-virtual {v0, v3, v4, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v3, 0x3fe51eb8    # 1.79f

    .line 420
    .line 421
    .line 422
    const/high16 v5, 0x40800000    # 4.0f

    .line 423
    .line 424
    invoke-virtual {v0, v4, v3, v4, v5}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v0, v3, v5, v5, v5}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v0, v12, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v14, 0x3f8ccccd    # 1.1f

    .line 437
    .line 438
    .line 439
    const/high16 v16, 0x40000000    # 2.0f

    .line 440
    .line 441
    const v17, 0x3f666666    # 0.9f

    .line 442
    .line 443
    .line 444
    const/high16 v18, 0x40000000    # 2.0f

    .line 445
    .line 446
    const/high16 v19, 0x40000000    # 2.0f

    .line 447
    .line 448
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v2, -0x4099999a    # -0.9f

    .line 452
    .line 453
    .line 454
    invoke-virtual {v0, v2, v1, v7, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    invoke-virtual {v0, v7, v2, v7, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v2, 0x3f666666    # 0.9f

    .line 461
    .line 462
    .line 463
    invoke-virtual {v0, v2, v7, v1, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 470
    .line 471
    .line 472
    move-result-object v48

    .line 473
    const/16 v59, 0x0

    .line 474
    .line 475
    const/16 v60, 0x0

    .line 476
    .line 477
    const/16 v61, 0x0

    .line 478
    .line 479
    const/16 v62, 0x3800

    .line 480
    .line 481
    const/16 v63, 0x0

    .line 482
    .line 483
    invoke-static/range {v47 .. v63}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 488
    .line 489
    .line 490
    move-result-object v0

    .line 491
    sput-object v0, Landroidx/compose/material/icons/twotone/PersonKt;->_person:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 492
    .line 493
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 494
    .line 495
    .line 496
    return-object v0
.end method
