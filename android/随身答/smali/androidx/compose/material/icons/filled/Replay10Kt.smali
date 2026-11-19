.class public final Landroidx/compose/material/icons/filled/Replay10Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_replay10",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Replay10",
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getReplay10",
        "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nReplay10.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Replay10.kt\nandroidx/compose/material/icons/filled/Replay10Kt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,103:1\n212#2,12:104\n233#2,18:117\n253#2:154\n233#2,18:155\n253#2:192\n233#2,18:193\n253#2:230\n174#3:116\n705#4,2:135\n717#4,2:137\n719#4,11:143\n705#4,2:173\n717#4,2:175\n719#4,11:181\n705#4,2:211\n717#4,2:213\n719#4,11:219\n72#5,4:139\n72#5,4:177\n72#5,4:215\n*S KotlinDebug\n*F\n+ 1 Replay10.kt\nandroidx/compose/material/icons/filled/Replay10Kt\n*L\n29#1:104,12\n30#1:117,18\n30#1:154\n45#1:155,18\n45#1:192\n56#1:193,18\n56#1:230\n29#1:116\n30#1:135,2\n30#1:137,2\n30#1:143,11\n45#1:173,2\n45#1:175,2\n45#1:181,11\n56#1:211,2\n56#1:213,2\n56#1:219,11\n30#1:139,4\n45#1:177,4\n56#1:215,4\n*E\n"
    }
.end annotation


# static fields
.field private static _replay10:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getReplay10(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/Replay10Kt;->_replay10:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.Replay10"

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
    const v4, 0x413fd70a    # 11.99f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x40a00000    # 5.0f

    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v4, 0x3f800000    # 1.0f

    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v4, -0x3f600000    # -5.0f

    .line 84
    .line 85
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/high16 v4, 0x40a00000    # 5.0f

    .line 89
    .line 90
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v4, 0x40e00000    # 7.0f

    .line 94
    .line 95
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v25, 0x40c00000    # 6.0f

    .line 99
    .line 100
    const/high16 v26, 0x40c00000    # 6.0f

    .line 101
    .line 102
    const v21, 0x4053d70a    # 3.31f

    .line 103
    .line 104
    .line 105
    const/16 v22, 0x0

    .line 106
    .line 107
    const/high16 v23, 0x40c00000    # 6.0f

    .line 108
    .line 109
    const v24, 0x402c28f6    # 2.69f

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
    const/high16 v4, 0x40c00000    # 6.0f

    .line 118
    .line 119
    const v6, -0x3fd3d70a    # -2.69f

    .line 120
    .line 121
    .line 122
    const/high16 v7, -0x3f400000    # -6.0f

    .line 123
    .line 124
    invoke-virtual {v2, v6, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v4, -0x3fd3d70a    # -2.69f

    .line 128
    .line 129
    .line 130
    const/high16 v6, -0x3f400000    # -6.0f

    .line 131
    .line 132
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v4, -0x40000000    # -2.0f

    .line 136
    .line 137
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v25, 0x41000000    # 8.0f

    .line 141
    .line 142
    const/high16 v26, 0x41000000    # 8.0f

    .line 143
    .line 144
    const/16 v21, 0x0

    .line 145
    .line 146
    const v22, 0x408d70a4    # 4.42f

    .line 147
    .line 148
    .line 149
    const v23, 0x40651eb8    # 3.58f

    .line 150
    .line 151
    .line 152
    const/high16 v24, 0x41000000    # 8.0f

    .line 153
    .line 154
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v4, -0x3f9ae148    # -3.58f

    .line 158
    .line 159
    .line 160
    const/high16 v6, -0x3f000000    # -8.0f

    .line 161
    .line 162
    const/high16 v7, 0x41000000    # 8.0f

    .line 163
    .line 164
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v4, 0x418347ae    # 16.41f

    .line 168
    .line 169
    .line 170
    const v6, 0x413fd70a    # 11.99f

    .line 171
    .line 172
    .line 173
    const/high16 v7, 0x40a00000    # 5.0f

    .line 174
    .line 175
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    const/16 v16, 0x3800

    .line 186
    .line 187
    const/16 v17, 0x0

    .line 188
    .line 189
    const/high16 v6, 0x3f800000    # 1.0f

    .line 190
    .line 191
    const/high16 v8, 0x3f800000    # 1.0f

    .line 192
    .line 193
    const/4 v7, 0x0

    .line 194
    const/high16 v9, 0x3f800000    # 1.0f

    .line 195
    .line 196
    const/high16 v12, 0x3f800000    # 1.0f

    .line 197
    .line 198
    const/4 v13, 0x0

    .line 199
    const/4 v14, 0x0

    .line 200
    const/4 v15, 0x0

    .line 201
    const-string v4, ""

    .line 202
    .line 203
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 204
    .line 205
    .line 206
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 207
    .line 208
    .line 209
    move-result v3

    .line 210
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 211
    .line 212
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 213
    .line 214
    .line 215
    move-result-wide v6

    .line 216
    const/4 v2, 0x0

    .line 217
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 221
    .line 222
    .line 223
    move-result v10

    .line 224
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 225
    .line 226
    .line 227
    move-result v11

    .line 228
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 231
    .line 232
    .line 233
    const v4, 0x412e3d71    # 10.89f

    .line 234
    .line 235
    .line 236
    const/high16 v6, 0x41800000    # 16.0f

    .line 237
    .line 238
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v4, -0x40a66666    # -0.85f

    .line 242
    .line 243
    .line 244
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v4, -0x3faf5c29    # -3.26f

    .line 248
    .line 249
    .line 250
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v4, -0x407eb852    # -1.01f

    .line 254
    .line 255
    .line 256
    const v6, 0x3e9eb852    # 0.31f

    .line 257
    .line 258
    .line 259
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v4, -0x40cf5c29    # -0.69f

    .line 263
    .line 264
    .line 265
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v4, 0x3fe28f5c    # 1.77f

    .line 269
    .line 270
    .line 271
    const v6, -0x40deb852    # -0.63f

    .line 272
    .line 273
    .line 274
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v4, 0x3db851ec    # 0.09f

    .line 278
    .line 279
    .line 280
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const/high16 v4, 0x41800000    # 16.0f

    .line 284
    .line 285
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    const/high16 v6, 0x3f800000    # 1.0f

    .line 296
    .line 297
    const/4 v7, 0x0

    .line 298
    const-string v4, ""

    .line 299
    .line 300
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 301
    .line 302
    .line 303
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 304
    .line 305
    .line 306
    move-result v3

    .line 307
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 308
    .line 309
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 310
    .line 311
    .line 312
    move-result-wide v6

    .line 313
    const/4 v0, 0x0

    .line 314
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 318
    .line 319
    .line 320
    move-result v10

    .line 321
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 322
    .line 323
    .line 324
    move-result v11

    .line 325
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 328
    .line 329
    .line 330
    const v0, 0x4172b852    # 15.17f

    .line 331
    .line 332
    .line 333
    const v2, 0x4163d70a    # 14.24f

    .line 334
    .line 335
    .line 336
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v17, -0x42333333    # -0.1f

    .line 340
    .line 341
    .line 342
    const v18, 0x3f51eb85    # 0.82f

    .line 343
    .line 344
    .line 345
    const v14, 0x3ea3d70a    # 0.32f

    .line 346
    .line 347
    .line 348
    const v15, -0x430a3d71    # -0.03f

    .line 349
    .line 350
    .line 351
    const v16, 0x3f19999a    # 0.6f

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v0, -0x416b851f    # -0.29f

    .line 358
    .line 359
    .line 360
    const v2, 0x3f11eb85    # 0.57f

    .line 361
    .line 362
    .line 363
    const v4, -0x41d1eb85    # -0.17f

    .line 364
    .line 365
    .line 366
    const v6, 0x3ed70a3d    # 0.42f

    .line 367
    .line 368
    .line 369
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v0, -0x4119999a    # -0.45f

    .line 373
    .line 374
    .line 375
    const v2, 0x3ea8f5c3    # 0.33f

    .line 376
    .line 377
    .line 378
    const v4, -0x4170a3d7    # -0.28f

    .line 379
    .line 380
    .line 381
    const v6, 0x3e851eb8    # 0.26f

    .line 382
    .line 383
    .line 384
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v0, -0x41428f5c    # -0.37f

    .line 388
    .line 389
    .line 390
    const v2, -0x40e8f5c3    # -0.59f

    .line 391
    .line 392
    .line 393
    const v4, 0x3dcccccd    # 0.1f

    .line 394
    .line 395
    .line 396
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const v0, -0x430a3d71    # -0.03f

    .line 400
    .line 401
    .line 402
    const v4, -0x42333333    # -0.1f

    .line 403
    .line 404
    .line 405
    const v6, -0x412e147b    # -0.41f

    .line 406
    .line 407
    .line 408
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v0, -0x41c7ae14    # -0.18f

    .line 412
    .line 413
    .line 414
    const v2, -0x41147ae1    # -0.46f

    .line 415
    .line 416
    .line 417
    const v4, -0x41570a3d    # -0.33f

    .line 418
    .line 419
    .line 420
    invoke-virtual {v12, v4, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v0, -0x41666666    # -0.3f

    .line 424
    .line 425
    .line 426
    const v2, -0x40ee147b    # -0.57f

    .line 427
    .line 428
    .line 429
    const v4, -0x41947ae1    # -0.23f

    .line 430
    .line 431
    .line 432
    const v6, -0x4151eb85    # -0.34f

    .line 433
    .line 434
    .line 435
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const/high16 v0, -0x41000000    # -0.5f

    .line 439
    .line 440
    const v2, -0x40ae147b    # -0.82f

    .line 441
    .line 442
    .line 443
    const v4, -0x421eb852    # -0.11f

    .line 444
    .line 445
    .line 446
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const/high16 v0, 0x41580000    # 13.5f

    .line 450
    .line 451
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v17, 0x3dcccccd    # 0.1f

    .line 455
    .line 456
    .line 457
    const v18, -0x40ae147b    # -0.82f

    .line 458
    .line 459
    .line 460
    const v14, -0x415c28f6    # -0.32f

    .line 461
    .line 462
    .line 463
    const v15, 0x3cf5c28f    # 0.03f

    .line 464
    .line 465
    .line 466
    const v16, -0x40e66666    # -0.6f

    .line 467
    .line 468
    .line 469
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v0, 0x3e947ae1    # 0.29f

    .line 473
    .line 474
    .line 475
    const v2, -0x40ee147b    # -0.57f

    .line 476
    .line 477
    .line 478
    const v4, 0x3e2e147b    # 0.17f

    .line 479
    .line 480
    .line 481
    const v6, -0x4128f5c3    # -0.42f

    .line 482
    .line 483
    .line 484
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v0, -0x417ae148    # -0.26f

    .line 488
    .line 489
    .line 490
    const v2, 0x3ee66666    # 0.45f

    .line 491
    .line 492
    .line 493
    const v4, -0x41570a3d    # -0.33f

    .line 494
    .line 495
    .line 496
    const v6, 0x3e8f5c29    # 0.28f

    .line 497
    .line 498
    .line 499
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const v0, 0x3ebd70a4    # 0.37f

    .line 503
    .line 504
    .line 505
    const v2, 0x3f170a3d    # 0.59f

    .line 506
    .line 507
    .line 508
    const v4, -0x42333333    # -0.1f

    .line 509
    .line 510
    .line 511
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const v0, 0x3cf5c28f    # 0.03f

    .line 515
    .line 516
    .line 517
    const v4, 0x3dcccccd    # 0.1f

    .line 518
    .line 519
    .line 520
    const v6, 0x3ed1eb85    # 0.41f

    .line 521
    .line 522
    .line 523
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const v17, 0x3eeb851f    # 0.46f

    .line 527
    .line 528
    .line 529
    const v18, 0x3ea8f5c3    # 0.33f

    .line 530
    .line 531
    .line 532
    const v13, 0x3e3851ec    # 0.18f

    .line 533
    .line 534
    .line 535
    const v14, 0x3d8f5c29    # 0.07f

    .line 536
    .line 537
    .line 538
    const v15, 0x3ea8f5c3    # 0.33f

    .line 539
    .line 540
    .line 541
    const v16, 0x3e3851ec    # 0.18f

    .line 542
    .line 543
    .line 544
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const v0, 0x3e99999a    # 0.3f

    .line 548
    .line 549
    .line 550
    const v2, 0x3f11eb85    # 0.57f

    .line 551
    .line 552
    .line 553
    const v4, 0x3e6b851f    # 0.23f

    .line 554
    .line 555
    .line 556
    const v6, 0x3eae147b    # 0.34f

    .line 557
    .line 558
    .line 559
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const/high16 v0, 0x3f000000    # 0.5f

    .line 563
    .line 564
    const v2, 0x3f51eb85    # 0.82f

    .line 565
    .line 566
    .line 567
    const v4, 0x3de147ae    # 0.11f

    .line 568
    .line 569
    .line 570
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const v0, 0x4163d70a    # 14.24f

    .line 574
    .line 575
    .line 576
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const v0, 0x41651eb8    # 14.32f

    .line 583
    .line 584
    .line 585
    const v2, 0x4156147b    # 13.38f

    .line 586
    .line 587
    .line 588
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const v17, -0x42dc28f6    # -0.04f

    .line 592
    .line 593
    .line 594
    const v18, -0x410a3d71    # -0.48f

    .line 595
    .line 596
    .line 597
    const/4 v13, 0x0

    .line 598
    const v14, -0x41bd70a4    # -0.19f

    .line 599
    .line 600
    .line 601
    const v15, -0x43dc28f6    # -0.01f

    .line 602
    .line 603
    .line 604
    const v16, -0x414ccccd    # -0.35f

    .line 605
    .line 606
    .line 607
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const v0, -0x420a3d71    # -0.12f

    .line 611
    .line 612
    .line 613
    const v2, -0x416147ae    # -0.31f

    .line 614
    .line 615
    .line 616
    const v4, -0x4270a3d7    # -0.07f

    .line 617
    .line 618
    .line 619
    const v6, -0x41947ae1    # -0.23f

    .line 620
    .line 621
    .line 622
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const v0, -0x41f0a3d7    # -0.14f

    .line 626
    .line 627
    .line 628
    const v2, -0x41bd70a4    # -0.19f

    .line 629
    .line 630
    .line 631
    const v4, -0x421eb852    # -0.11f

    .line 632
    .line 633
    .line 634
    const v6, -0x41d1eb85    # -0.17f

    .line 635
    .line 636
    .line 637
    invoke-virtual {v12, v4, v0, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    const v0, -0x41dc28f6    # -0.16f

    .line 641
    .line 642
    .line 643
    const/high16 v2, -0x41800000    # -0.25f

    .line 644
    .line 645
    const v4, -0x42b33333    # -0.05f

    .line 646
    .line 647
    .line 648
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    const v0, 0x3ca3d70a    # 0.02f

    .line 652
    .line 653
    .line 654
    const v4, 0x3d4ccccd    # 0.05f

    .line 655
    .line 656
    .line 657
    const v6, -0x41c7ae14    # -0.18f

    .line 658
    .line 659
    .line 660
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    const v0, -0x41f0a3d7    # -0.14f

    .line 664
    .line 665
    .line 666
    const v2, -0x41bd70a4    # -0.19f

    .line 667
    .line 668
    .line 669
    const v4, 0x3e2e147b    # 0.17f

    .line 670
    .line 671
    .line 672
    const v6, 0x3db851ec    # 0.09f

    .line 673
    .line 674
    .line 675
    invoke-virtual {v12, v0, v6, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const v0, 0x3e3851ec    # 0.18f

    .line 679
    .line 680
    .line 681
    const v2, -0x420a3d71    # -0.12f

    .line 682
    .line 683
    .line 684
    const v4, 0x3e9eb852    # 0.31f

    .line 685
    .line 686
    .line 687
    const v6, -0x4247ae14    # -0.09f

    .line 688
    .line 689
    .line 690
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 691
    .line 692
    .line 693
    const v0, -0x42dc28f6    # -0.04f

    .line 694
    .line 695
    .line 696
    const v2, 0x3ef5c28f    # 0.48f

    .line 697
    .line 698
    .line 699
    const v4, -0x42dc28f6    # -0.04f

    .line 700
    .line 701
    .line 702
    const v6, 0x3e947ae1    # 0.29f

    .line 703
    .line 704
    .line 705
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 706
    .line 707
    .line 708
    const v0, 0x3f7851ec    # 0.97f

    .line 709
    .line 710
    .line 711
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    const v17, 0x3d23d70a    # 0.04f

    .line 715
    .line 716
    .line 717
    const v18, 0x3ef5c28f    # 0.48f

    .line 718
    .line 719
    .line 720
    const v14, 0x3e428f5c    # 0.19f

    .line 721
    .line 722
    .line 723
    const v15, 0x3c23d70a    # 0.01f

    .line 724
    .line 725
    .line 726
    const v16, 0x3eb33333    # 0.35f

    .line 727
    .line 728
    .line 729
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    const v0, 0x3df5c28f    # 0.12f

    .line 733
    .line 734
    .line 735
    const v2, 0x3ea3d70a    # 0.32f

    .line 736
    .line 737
    .line 738
    const v4, 0x3d8f5c29    # 0.07f

    .line 739
    .line 740
    .line 741
    const v6, 0x3e75c28f    # 0.24f

    .line 742
    .line 743
    .line 744
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 745
    .line 746
    .line 747
    const v0, 0x3e0f5c29    # 0.14f

    .line 748
    .line 749
    .line 750
    const v2, 0x3e428f5c    # 0.19f

    .line 751
    .line 752
    .line 753
    const v4, 0x3e2e147b    # 0.17f

    .line 754
    .line 755
    .line 756
    const v6, 0x3de147ae    # 0.11f

    .line 757
    .line 758
    .line 759
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 760
    .line 761
    .line 762
    const v0, 0x3e23d70a    # 0.16f

    .line 763
    .line 764
    .line 765
    const/high16 v2, 0x3e800000    # 0.25f

    .line 766
    .line 767
    const v4, 0x3d4ccccd    # 0.05f

    .line 768
    .line 769
    .line 770
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 771
    .line 772
    .line 773
    const v0, -0x435c28f6    # -0.02f

    .line 774
    .line 775
    .line 776
    const v4, -0x42b33333    # -0.05f

    .line 777
    .line 778
    .line 779
    const v6, 0x3e3851ec    # 0.18f

    .line 780
    .line 781
    .line 782
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 783
    .line 784
    .line 785
    const v0, -0x4247ae14    # -0.09f

    .line 786
    .line 787
    .line 788
    const v2, 0x3e428f5c    # 0.19f

    .line 789
    .line 790
    .line 791
    const v4, -0x41d1eb85    # -0.17f

    .line 792
    .line 793
    .line 794
    const v6, 0x3e0f5c29    # 0.14f

    .line 795
    .line 796
    .line 797
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 798
    .line 799
    .line 800
    const v0, -0x415c28f6    # -0.32f

    .line 801
    .line 802
    .line 803
    const v2, -0x41bd70a4    # -0.19f

    .line 804
    .line 805
    .line 806
    const v4, 0x3db851ec    # 0.09f

    .line 807
    .line 808
    .line 809
    const v6, 0x3de147ae    # 0.11f

    .line 810
    .line 811
    .line 812
    invoke-virtual {v12, v4, v2, v6, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 813
    .line 814
    .line 815
    const v0, 0x3d23d70a    # 0.04f

    .line 816
    .line 817
    .line 818
    const v2, -0x410a3d71    # -0.48f

    .line 819
    .line 820
    .line 821
    const v4, 0x3d23d70a    # 0.04f

    .line 822
    .line 823
    .line 824
    const v6, -0x416b851f    # -0.29f

    .line 825
    .line 826
    .line 827
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 828
    .line 829
    .line 830
    const v0, 0x4156147b    # 13.38f

    .line 831
    .line 832
    .line 833
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 834
    .line 835
    .line 836
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 837
    .line 838
    .line 839
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 840
    .line 841
    .line 842
    move-result-object v2

    .line 843
    const/16 v16, 0x3800

    .line 844
    .line 845
    const/16 v17, 0x0

    .line 846
    .line 847
    const/high16 v6, 0x3f800000    # 1.0f

    .line 848
    .line 849
    const/4 v7, 0x0

    .line 850
    const/high16 v12, 0x3f800000    # 1.0f

    .line 851
    .line 852
    const/4 v14, 0x0

    .line 853
    const/4 v15, 0x0

    .line 854
    const-string v4, ""

    .line 855
    .line 856
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 857
    .line 858
    .line 859
    move-result-object v0

    .line 860
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 861
    .line 862
    .line 863
    move-result-object v0

    .line 864
    sput-object v0, Landroidx/compose/material/icons/filled/Replay10Kt;->_replay10:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 865
    .line 866
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 867
    .line 868
    .line 869
    return-object v0
.end method
