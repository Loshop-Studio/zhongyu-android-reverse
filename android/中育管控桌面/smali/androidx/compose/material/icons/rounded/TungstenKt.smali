.class public final Landroidx/compose/material/icons/rounded/TungstenKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_tungsten",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Tungsten",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getTungsten",
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
        "SMAP\nTungsten.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tungsten.kt\nandroidx/compose/material/icons/rounded/TungstenKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,111:1\n212#2,12:112\n233#2,18:125\n253#2:162\n233#2,18:163\n253#2:200\n233#2,18:201\n253#2:238\n233#2,18:239\n253#2:276\n233#2,18:277\n253#2:314\n233#2,18:315\n253#2:352\n174#3:124\n705#4,2:143\n717#4,2:145\n719#4,11:151\n705#4,2:181\n717#4,2:183\n719#4,11:189\n705#4,2:219\n717#4,2:221\n719#4,11:227\n705#4,2:257\n717#4,2:259\n719#4,11:265\n705#4,2:295\n717#4,2:297\n719#4,11:303\n705#4,2:333\n717#4,2:335\n719#4,11:341\n72#5,4:147\n72#5,4:185\n72#5,4:223\n72#5,4:261\n72#5,4:299\n72#5,4:337\n*S KotlinDebug\n*F\n+ 1 Tungsten.kt\nandroidx/compose/material/icons/rounded/TungstenKt\n*L\n29#1:112,12\n30#1:125,18\n30#1:162\n42#1:163,18\n42#1:200\n52#1:201,18\n52#1:238\n64#1:239,18\n64#1:276\n76#1:277,18\n76#1:314\n86#1:315,18\n86#1:352\n29#1:124\n30#1:143,2\n30#1:145,2\n30#1:151,11\n42#1:181,2\n42#1:183,2\n42#1:189,11\n52#1:219,2\n52#1:221,2\n52#1:227,11\n64#1:257,2\n64#1:259,2\n64#1:265,11\n76#1:295,2\n76#1:297,2\n76#1:303,11\n86#1:333,2\n86#1:335,2\n86#1:341,11\n30#1:147,4\n42#1:185,4\n52#1:223,4\n64#1:261,4\n76#1:299,4\n86#1:337,4\n*E\n"
    }
.end annotation


# static fields
.field private static _tungsten:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTungsten(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/TungstenKt;->_tungsten:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Tungsten"

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
    const/high16 v4, 0x41980000    # 19.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 78
    .line 79
    .line 80
    const/high16 v25, -0x40800000    # -1.0f

    .line 81
    .line 82
    const/high16 v26, 0x3f800000    # 1.0f

    .line 83
    .line 84
    const v21, -0x40f0a3d7    # -0.56f

    .line 85
    .line 86
    .line 87
    const/16 v22, 0x0

    .line 88
    .line 89
    const/high16 v23, -0x40800000    # -1.0f

    .line 90
    .line 91
    const v24, 0x3ee66666    # 0.45f

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
    const/high16 v4, 0x41a80000    # 21.0f

    .line 100
    .line 101
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v25, 0x3f800000    # 1.0f

    .line 105
    .line 106
    const/16 v21, 0x0

    .line 107
    .line 108
    const v22, 0x3f0ccccd    # 0.55f

    .line 109
    .line 110
    .line 111
    const v23, 0x3ee66666    # 0.45f

    .line 112
    .line 113
    .line 114
    const/high16 v24, 0x3f800000    # 1.0f

    .line 115
    .line 116
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v4, 0x41400000    # 12.0f

    .line 120
    .line 121
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v26, -0x40800000    # -1.0f

    .line 125
    .line 126
    const v21, 0x3f0ccccd    # 0.55f

    .line 127
    .line 128
    .line 129
    const/16 v22, 0x0

    .line 130
    .line 131
    const/high16 v23, 0x3f800000    # 1.0f

    .line 132
    .line 133
    const v24, -0x4119999a    # -0.45f

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v4, 0x41a00000    # 20.0f

    .line 140
    .line 141
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v25, 0x41400000    # 12.0f

    .line 145
    .line 146
    const/high16 v26, 0x41980000    # 19.0f

    .line 147
    .line 148
    const/high16 v21, 0x41500000    # 13.0f

    .line 149
    .line 150
    const v22, 0x419b999a    # 19.45f

    .line 151
    .line 152
    .line 153
    const v23, 0x4148cccd    # 12.55f

    .line 154
    .line 155
    .line 156
    const/high16 v24, 0x41980000    # 19.0f

    .line 157
    .line 158
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    const/16 v16, 0x3800

    .line 169
    .line 170
    const/16 v17, 0x0

    .line 171
    .line 172
    const/high16 v6, 0x3f800000    # 1.0f

    .line 173
    .line 174
    const/high16 v8, 0x3f800000    # 1.0f

    .line 175
    .line 176
    const/4 v7, 0x0

    .line 177
    const/high16 v9, 0x3f800000    # 1.0f

    .line 178
    .line 179
    const/high16 v12, 0x3f800000    # 1.0f

    .line 180
    .line 181
    const/4 v13, 0x0

    .line 182
    const/4 v14, 0x0

    .line 183
    const/4 v15, 0x0

    .line 184
    const-string v4, ""

    .line 185
    .line 186
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 187
    .line 188
    .line 189
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 194
    .line 195
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 196
    .line 197
    .line 198
    move-result-wide v6

    .line 199
    const/4 v2, 0x0

    .line 200
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 204
    .line 205
    .line 206
    move-result v10

    .line 207
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 208
    .line 209
    .line 210
    move-result v11

    .line 211
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 214
    .line 215
    .line 216
    const v4, 0x40bfae14    # 5.99f

    .line 217
    .line 218
    .line 219
    const v6, 0x4188b852    # 17.09f

    .line 220
    .line 221
    .line 222
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v4, 0x40a8f5c3    # 5.28f

    .line 226
    .line 227
    .line 228
    const v6, 0x418e6666    # 17.8f

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/16 v25, 0x0

    .line 235
    .line 236
    const v26, 0x3fb47ae1    # 1.41f

    .line 237
    .line 238
    .line 239
    const v21, -0x413851ec    # -0.39f

    .line 240
    .line 241
    .line 242
    const v22, 0x3ec7ae14    # 0.39f

    .line 243
    .line 244
    .line 245
    const v23, -0x413851ec    # -0.39f

    .line 246
    .line 247
    .line 248
    const v24, 0x3f828f5c    # 1.02f

    .line 249
    .line 250
    .line 251
    move-object/from16 v20, v2

    .line 252
    .line 253
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v25, 0x3fb47ae1    # 1.41f

    .line 257
    .line 258
    .line 259
    const/16 v26, 0x0

    .line 260
    .line 261
    const v21, 0x3ec7ae14    # 0.39f

    .line 262
    .line 263
    .line 264
    const v23, 0x3f828f5c    # 1.02f

    .line 265
    .line 266
    .line 267
    const v24, 0x3ec7ae14    # 0.39f

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v4, -0x40ca3d71    # -0.71f

    .line 274
    .line 275
    .line 276
    const v6, 0x3f35c28f    # 0.71f

    .line 277
    .line 278
    .line 279
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/16 v25, 0x0

    .line 283
    .line 284
    const v26, -0x404b851f    # -1.41f

    .line 285
    .line 286
    .line 287
    const v22, -0x413851ec    # -0.39f

    .line 288
    .line 289
    .line 290
    const v23, 0x3ec7ae14    # 0.39f

    .line 291
    .line 292
    .line 293
    const v24, -0x407d70a4    # -1.02f

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v25, 0x40bfae14    # 5.99f

    .line 300
    .line 301
    .line 302
    const v26, 0x4188b852    # 17.09f

    .line 303
    .line 304
    .line 305
    const v21, 0x40e0a3d7    # 7.02f

    .line 306
    .line 307
    .line 308
    const v22, 0x4185ae14    # 16.71f

    .line 309
    .line 310
    .line 311
    const v23, 0x40cc28f6    # 6.38f

    .line 312
    .line 313
    .line 314
    const v24, 0x4185ae14    # 16.71f

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 324
    .line 325
    .line 326
    move-result-object v2

    .line 327
    const/high16 v6, 0x3f800000    # 1.0f

    .line 328
    .line 329
    const/4 v7, 0x0

    .line 330
    const-string v4, ""

    .line 331
    .line 332
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 333
    .line 334
    .line 335
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 336
    .line 337
    .line 338
    move-result v3

    .line 339
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 340
    .line 341
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 342
    .line 343
    .line 344
    move-result-wide v6

    .line 345
    const/4 v2, 0x0

    .line 346
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 347
    .line 348
    .line 349
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 350
    .line 351
    .line 352
    move-result v10

    .line 353
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 354
    .line 355
    .line 356
    move-result v11

    .line 357
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 360
    .line 361
    .line 362
    const/high16 v4, 0x40a00000    # 5.0f

    .line 363
    .line 364
    const/high16 v6, 0x41400000    # 12.0f

    .line 365
    .line 366
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const/high16 v25, -0x40800000    # -1.0f

    .line 370
    .line 371
    const/high16 v26, -0x40800000    # -1.0f

    .line 372
    .line 373
    const/16 v21, 0x0

    .line 374
    .line 375
    const v22, -0x40f33333    # -0.55f

    .line 376
    .line 377
    .line 378
    const v23, -0x4119999a    # -0.45f

    .line 379
    .line 380
    .line 381
    const/high16 v24, -0x40800000    # -1.0f

    .line 382
    .line 383
    move-object/from16 v20, v2

    .line 384
    .line 385
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const/high16 v4, 0x40400000    # 3.0f

    .line 389
    .line 390
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const/high16 v26, 0x3f800000    # 1.0f

    .line 394
    .line 395
    const v21, -0x40f33333    # -0.55f

    .line 396
    .line 397
    .line 398
    const/16 v22, 0x0

    .line 399
    .line 400
    const/high16 v23, -0x40800000    # -1.0f

    .line 401
    .line 402
    const v24, 0x3ee66666    # 0.45f

    .line 403
    .line 404
    .line 405
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v4, 0x41400000    # 12.0f

    .line 409
    .line 410
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v25, 0x3f800000    # 1.0f

    .line 414
    .line 415
    const/16 v21, 0x0

    .line 416
    .line 417
    const v22, 0x3f0ccccd    # 0.55f

    .line 418
    .line 419
    .line 420
    const v23, 0x3ee66666    # 0.45f

    .line 421
    .line 422
    .line 423
    const/high16 v24, 0x3f800000    # 1.0f

    .line 424
    .line 425
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v4, 0x40800000    # 4.0f

    .line 429
    .line 430
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const/high16 v25, 0x40a00000    # 5.0f

    .line 434
    .line 435
    const/high16 v26, 0x41400000    # 12.0f

    .line 436
    .line 437
    const v21, 0x4091999a    # 4.55f

    .line 438
    .line 439
    .line 440
    const/high16 v22, 0x41500000    # 13.0f

    .line 441
    .line 442
    const/high16 v23, 0x40a00000    # 5.0f

    .line 443
    .line 444
    const v24, 0x4148cccd    # 12.55f

    .line 445
    .line 446
    .line 447
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const/high16 v4, 0x40a00000    # 5.0f

    .line 451
    .line 452
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 459
    .line 460
    .line 461
    move-result-object v2

    .line 462
    const/high16 v6, 0x3f800000    # 1.0f

    .line 463
    .line 464
    const/4 v7, 0x0

    .line 465
    const-string v4, ""

    .line 466
    .line 467
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 468
    .line 469
    .line 470
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 471
    .line 472
    .line 473
    move-result v3

    .line 474
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 475
    .line 476
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 477
    .line 478
    .line 479
    move-result-wide v6

    .line 480
    const/4 v2, 0x0

    .line 481
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 482
    .line 483
    .line 484
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 485
    .line 486
    .line 487
    move-result v10

    .line 488
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 489
    .line 490
    .line 491
    move-result v11

    .line 492
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 495
    .line 496
    .line 497
    const/high16 v4, 0x41300000    # 11.0f

    .line 498
    .line 499
    const/high16 v6, 0x41a80000    # 21.0f

    .line 500
    .line 501
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const/high16 v4, 0x41a00000    # 20.0f

    .line 505
    .line 506
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const/high16 v25, -0x40800000    # -1.0f

    .line 510
    .line 511
    const/high16 v26, 0x3f800000    # 1.0f

    .line 512
    .line 513
    const v21, -0x40f33333    # -0.55f

    .line 514
    .line 515
    .line 516
    const/16 v22, 0x0

    .line 517
    .line 518
    const/high16 v23, -0x40800000    # -1.0f

    .line 519
    .line 520
    const v24, 0x3ee66666    # 0.45f

    .line 521
    .line 522
    .line 523
    move-object/from16 v20, v2

    .line 524
    .line 525
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const/high16 v4, 0x41400000    # 12.0f

    .line 529
    .line 530
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const/high16 v25, 0x3f800000    # 1.0f

    .line 534
    .line 535
    const/16 v21, 0x0

    .line 536
    .line 537
    const v22, 0x3f0ccccd    # 0.55f

    .line 538
    .line 539
    .line 540
    const v23, 0x3ee66666    # 0.45f

    .line 541
    .line 542
    .line 543
    const/high16 v24, 0x3f800000    # 1.0f

    .line 544
    .line 545
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const/high16 v4, 0x41a80000    # 21.0f

    .line 549
    .line 550
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const/high16 v26, -0x40800000    # -1.0f

    .line 554
    .line 555
    const v21, 0x3f0ccccd    # 0.55f

    .line 556
    .line 557
    .line 558
    const/16 v22, 0x0

    .line 559
    .line 560
    const/high16 v23, 0x3f800000    # 1.0f

    .line 561
    .line 562
    const v24, -0x4119999a    # -0.45f

    .line 563
    .line 564
    .line 565
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const/high16 v4, 0x41400000    # 12.0f

    .line 569
    .line 570
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const/high16 v25, 0x41a80000    # 21.0f

    .line 574
    .line 575
    const/high16 v26, 0x41300000    # 11.0f

    .line 576
    .line 577
    const/high16 v21, 0x41b00000    # 22.0f

    .line 578
    .line 579
    const v22, 0x41373333    # 11.45f

    .line 580
    .line 581
    .line 582
    const v23, 0x41ac6666    # 21.55f

    .line 583
    .line 584
    .line 585
    const/high16 v24, 0x41300000    # 11.0f

    .line 586
    .line 587
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 594
    .line 595
    .line 596
    move-result-object v2

    .line 597
    const/high16 v6, 0x3f800000    # 1.0f

    .line 598
    .line 599
    const/4 v7, 0x0

    .line 600
    const-string v4, ""

    .line 601
    .line 602
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 603
    .line 604
    .line 605
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 606
    .line 607
    .line 608
    move-result v3

    .line 609
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 610
    .line 611
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 612
    .line 613
    .line 614
    move-result-wide v6

    .line 615
    const/4 v2, 0x0

    .line 616
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 617
    .line 618
    .line 619
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 620
    .line 621
    .line 622
    move-result v10

    .line 623
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 624
    .line 625
    .line 626
    move-result v11

    .line 627
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 630
    .line 631
    .line 632
    const v4, 0x4190147b    # 18.01f

    .line 633
    .line 634
    .line 635
    const v6, 0x4188b852    # 17.09f

    .line 636
    .line 637
    .line 638
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const v25, -0x404b851f    # -1.41f

    .line 642
    .line 643
    .line 644
    const/16 v26, 0x0

    .line 645
    .line 646
    const v21, -0x413851ec    # -0.39f

    .line 647
    .line 648
    .line 649
    const v22, -0x413851ec    # -0.39f

    .line 650
    .line 651
    .line 652
    const v23, -0x407d70a4    # -1.02f

    .line 653
    .line 654
    .line 655
    const v24, -0x413851ec    # -0.39f

    .line 656
    .line 657
    .line 658
    move-object/from16 v20, v2

    .line 659
    .line 660
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    const/16 v25, 0x0

    .line 664
    .line 665
    const v26, 0x3fb47ae1    # 1.41f

    .line 666
    .line 667
    .line 668
    const v22, 0x3ec7ae14    # 0.39f

    .line 669
    .line 670
    .line 671
    const v23, -0x413851ec    # -0.39f

    .line 672
    .line 673
    .line 674
    const v24, 0x3f828f5c    # 1.02f

    .line 675
    .line 676
    .line 677
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    const v4, 0x3f35c28f    # 0.71f

    .line 681
    .line 682
    .line 683
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 684
    .line 685
    .line 686
    const v25, 0x3fb47ae1    # 1.41f

    .line 687
    .line 688
    .line 689
    const/16 v26, 0x0

    .line 690
    .line 691
    const v21, 0x3ec7ae14    # 0.39f

    .line 692
    .line 693
    .line 694
    const v23, 0x3f828f5c    # 1.02f

    .line 695
    .line 696
    .line 697
    const v24, 0x3ec7ae14    # 0.39f

    .line 698
    .line 699
    .line 700
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    const/16 v25, 0x0

    .line 704
    .line 705
    const v26, -0x404b851f    # -1.41f

    .line 706
    .line 707
    .line 708
    const v22, -0x413851ec    # -0.39f

    .line 709
    .line 710
    .line 711
    const v23, 0x3ec7ae14    # 0.39f

    .line 712
    .line 713
    .line 714
    const v24, -0x407d70a4    # -1.02f

    .line 715
    .line 716
    .line 717
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 718
    .line 719
    .line 720
    const v4, 0x4190147b    # 18.01f

    .line 721
    .line 722
    .line 723
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 724
    .line 725
    .line 726
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 727
    .line 728
    .line 729
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 730
    .line 731
    .line 732
    move-result-object v2

    .line 733
    const/high16 v6, 0x3f800000    # 1.0f

    .line 734
    .line 735
    const/4 v7, 0x0

    .line 736
    const-string v4, ""

    .line 737
    .line 738
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 739
    .line 740
    .line 741
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 742
    .line 743
    .line 744
    move-result v3

    .line 745
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 746
    .line 747
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 748
    .line 749
    .line 750
    move-result-wide v6

    .line 751
    const/4 v0, 0x0

    .line 752
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 753
    .line 754
    .line 755
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 756
    .line 757
    .line 758
    move-result v10

    .line 759
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 760
    .line 761
    .line 762
    move-result v11

    .line 763
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 764
    .line 765
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 766
    .line 767
    .line 768
    const/high16 v0, 0x41700000    # 15.0f

    .line 769
    .line 770
    const v2, 0x410051ec    # 8.02f

    .line 771
    .line 772
    .line 773
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 774
    .line 775
    .line 776
    const/high16 v0, 0x40a00000    # 5.0f

    .line 777
    .line 778
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 779
    .line 780
    .line 781
    const/high16 v17, -0x40000000    # -2.0f

    .line 782
    .line 783
    const/high16 v18, -0x40000000    # -2.0f

    .line 784
    .line 785
    const v14, -0x40733333    # -1.1f

    .line 786
    .line 787
    .line 788
    const v15, -0x4099999a    # -0.9f

    .line 789
    .line 790
    .line 791
    const/high16 v16, -0x40000000    # -2.0f

    .line 792
    .line 793
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 794
    .line 795
    .line 796
    const/high16 v0, -0x40000000    # -2.0f

    .line 797
    .line 798
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 799
    .line 800
    .line 801
    const/high16 v17, 0x41100000    # 9.0f

    .line 802
    .line 803
    const/high16 v18, 0x40a00000    # 5.0f

    .line 804
    .line 805
    const v13, 0x411e6666    # 9.9f

    .line 806
    .line 807
    .line 808
    const/high16 v14, 0x40400000    # 3.0f

    .line 809
    .line 810
    const/high16 v15, 0x41100000    # 9.0f

    .line 811
    .line 812
    const v16, 0x4079999a    # 3.9f

    .line 813
    .line 814
    .line 815
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 816
    .line 817
    .line 818
    const v0, 0x404147ae    # 3.02f

    .line 819
    .line 820
    .line 821
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 822
    .line 823
    .line 824
    const v17, -0x400b851f    # -1.91f

    .line 825
    .line 826
    .line 827
    const v18, 0x409d1eb8    # 4.91f

    .line 828
    .line 829
    .line 830
    const v13, -0x4048f5c3    # -1.43f

    .line 831
    .line 832
    .line 833
    const v14, 0x3f8a3d71    # 1.08f

    .line 834
    .line 835
    .line 836
    const v15, -0x3fee147b    # -2.28f

    .line 837
    .line 838
    .line 839
    const v16, 0x4039999a    # 2.9f

    .line 840
    .line 841
    .line 842
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 843
    .line 844
    .line 845
    const v17, 0x4075c28f    # 3.84f

    .line 846
    .line 847
    .line 848
    const v18, 0x407ccccd    # 3.95f

    .line 849
    .line 850
    .line 851
    const v13, 0x3eb851ec    # 0.36f

    .line 852
    .line 853
    .line 854
    const v14, 0x3ff9999a    # 1.95f

    .line 855
    .line 856
    .line 857
    const v15, 0x3ff33333    # 1.9f

    .line 858
    .line 859
    .line 860
    const v16, 0x40633333    # 3.55f

    .line 861
    .line 862
    .line 863
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 864
    .line 865
    .line 866
    const/high16 v17, 0x41880000    # 17.0f

    .line 867
    .line 868
    const/high16 v18, 0x41400000    # 12.0f

    .line 869
    .line 870
    const v13, 0x41628f5c    # 14.16f

    .line 871
    .line 872
    .line 873
    const v14, 0x418c7ae1    # 17.56f

    .line 874
    .line 875
    .line 876
    const/high16 v15, 0x41880000    # 17.0f

    .line 877
    .line 878
    const v16, 0x4171c28f    # 15.11f

    .line 879
    .line 880
    .line 881
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 882
    .line 883
    .line 884
    const/high16 v17, 0x41700000    # 15.0f

    .line 885
    .line 886
    const v18, 0x410051ec    # 8.02f

    .line 887
    .line 888
    .line 889
    const/high16 v13, 0x41880000    # 17.0f

    .line 890
    .line 891
    const v14, 0x4125eb85    # 10.37f

    .line 892
    .line 893
    .line 894
    const v15, 0x4181ae14    # 16.21f

    .line 895
    .line 896
    .line 897
    const v16, 0x410f0a3d    # 8.94f

    .line 898
    .line 899
    .line 900
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 901
    .line 902
    .line 903
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 904
    .line 905
    .line 906
    const/high16 v0, 0x41500000    # 13.0f

    .line 907
    .line 908
    const v2, 0x40e33333    # 7.1f

    .line 909
    .line 910
    .line 911
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 912
    .line 913
    .line 914
    const/high16 v17, 0x41400000    # 12.0f

    .line 915
    .line 916
    const/high16 v18, 0x40e00000    # 7.0f

    .line 917
    .line 918
    const v13, 0x414ae148    # 12.68f

    .line 919
    .line 920
    .line 921
    const v14, 0x40e147ae    # 7.04f

    .line 922
    .line 923
    .line 924
    const v15, 0x414570a4    # 12.34f

    .line 925
    .line 926
    .line 927
    const/high16 v16, 0x40e00000    # 7.0f

    .line 928
    .line 929
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 930
    .line 931
    .line 932
    const/high16 v0, -0x40800000    # -1.0f

    .line 933
    .line 934
    const v2, 0x3dcccccd    # 0.1f

    .line 935
    .line 936
    .line 937
    const v4, -0x40d1eb85    # -0.68f

    .line 938
    .line 939
    .line 940
    const v6, 0x3d23d70a    # 0.04f

    .line 941
    .line 942
    .line 943
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 944
    .line 945
    .line 946
    const/high16 v0, 0x40a00000    # 5.0f

    .line 947
    .line 948
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 949
    .line 950
    .line 951
    const/high16 v0, 0x40000000    # 2.0f

    .line 952
    .line 953
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 954
    .line 955
    .line 956
    const v0, 0x40e33333    # 7.1f

    .line 957
    .line 958
    .line 959
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 960
    .line 961
    .line 962
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 963
    .line 964
    .line 965
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 966
    .line 967
    .line 968
    move-result-object v2

    .line 969
    const/16 v16, 0x3800

    .line 970
    .line 971
    const/16 v17, 0x0

    .line 972
    .line 973
    const/high16 v6, 0x3f800000    # 1.0f

    .line 974
    .line 975
    const/4 v7, 0x0

    .line 976
    const/high16 v12, 0x3f800000    # 1.0f

    .line 977
    .line 978
    const/4 v13, 0x0

    .line 979
    const/4 v14, 0x0

    .line 980
    const/4 v15, 0x0

    .line 981
    const-string v4, ""

    .line 982
    .line 983
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 984
    .line 985
    .line 986
    move-result-object v0

    .line 987
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 988
    .line 989
    .line 990
    move-result-object v0

    .line 991
    sput-object v0, Landroidx/compose/material/icons/rounded/TungstenKt;->_tungsten:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 992
    .line 993
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 994
    .line 995
    .line 996
    return-object v0
.end method
