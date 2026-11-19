.class public final Landroidx/compose/material/icons/twotone/_3pKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "__3p",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "_3p",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "get_3p",
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
        "SMAP\n_3p.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _3p.kt\nandroidx/compose/material/icons/twotone/_3pKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,93:1\n212#2,12:94\n233#2,18:107\n253#2:144\n233#2,18:145\n253#2:182\n174#3:106\n705#4,2:125\n717#4,2:127\n719#4,11:133\n705#4,2:163\n717#4,2:165\n719#4,11:171\n72#5,4:129\n72#5,4:167\n*S KotlinDebug\n*F\n+ 1 _3p.kt\nandroidx/compose/material/icons/twotone/_3pKt\n*L\n29#1:94,12\n30#1:107,18\n30#1:144\n54#1:145,18\n54#1:182\n29#1:106\n30#1:125,2\n30#1:127,2\n30#1:133,11\n54#1:163,2\n54#1:165,2\n54#1:171,11\n30#1:129,4\n54#1:167,4\n*E\n"
    }
.end annotation


# static fields
.field private static __3p:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final get_3p(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/_3pKt;->__3p:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone._3p"

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
    const/high16 v4, 0x40800000    # 4.0f

    .line 71
    .line 72
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 73
    .line 74
    .line 75
    const v4, 0x4152b852    # 13.17f

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 79
    .line 80
    .line 81
    const v4, 0x40a570a4    # 5.17f

    .line 82
    .line 83
    .line 84
    const/high16 v6, 0x41800000    # 16.0f

    .line 85
    .line 86
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 87
    .line 88
    .line 89
    const/high16 v4, 0x41a00000    # 20.0f

    .line 90
    .line 91
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const/high16 v4, 0x40800000    # 4.0f

    .line 95
    .line 96
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v4, 0x40c00000    # 6.0f

    .line 106
    .line 107
    const/high16 v6, 0x41400000    # 12.0f

    .line 108
    .line 109
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const/high16 v25, 0x40000000    # 2.0f

    .line 113
    .line 114
    const/high16 v26, 0x40000000    # 2.0f

    .line 115
    .line 116
    const v21, 0x3f8ccccd    # 1.1f

    .line 117
    .line 118
    .line 119
    const/16 v22, 0x0

    .line 120
    .line 121
    const/high16 v23, 0x40000000    # 2.0f

    .line 122
    .line 123
    const v24, 0x3f666666    # 0.9f

    .line 124
    .line 125
    .line 126
    move-object/from16 v20, v2

    .line 127
    .line 128
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v4, -0x4099999a    # -0.9f

    .line 132
    .line 133
    .line 134
    const/high16 v6, 0x40000000    # 2.0f

    .line 135
    .line 136
    const/high16 v7, -0x40000000    # -2.0f

    .line 137
    .line 138
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v6, -0x40000000    # -2.0f

    .line 142
    .line 143
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const v4, 0x412e6666    # 10.9f

    .line 147
    .line 148
    .line 149
    const/high16 v6, 0x40c00000    # 6.0f

    .line 150
    .line 151
    const/high16 v7, 0x41400000    # 12.0f

    .line 152
    .line 153
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v4, 0x41600000    # 14.0f

    .line 160
    .line 161
    const/high16 v6, 0x41800000    # 16.0f

    .line 162
    .line 163
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v4, 0x41000000    # 8.0f

    .line 167
    .line 168
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v4, -0x40ee147b    # -0.57f

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v25, 0x3f9c28f6    # 1.22f

    .line 178
    .line 179
    .line 180
    const v26, -0x40133333    # -1.85f

    .line 181
    .line 182
    .line 183
    const/16 v21, 0x0

    .line 184
    .line 185
    const v22, -0x40b0a3d7    # -0.81f

    .line 186
    .line 187
    .line 188
    const v23, 0x3ef5c28f    # 0.48f

    .line 189
    .line 190
    .line 191
    const v24, -0x403c28f6    # -1.53f

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v25, 0x41400000    # 12.0f

    .line 198
    .line 199
    const/high16 v26, 0x41300000    # 11.0f

    .line 200
    .line 201
    const v21, 0x41211eb8    # 10.07f

    .line 202
    .line 203
    .line 204
    const v22, 0x41335c29    # 11.21f

    .line 205
    .line 206
    .line 207
    const v23, 0x413028f6    # 11.01f

    .line 208
    .line 209
    .line 210
    const/high16 v24, 0x41300000    # 11.0f

    .line 211
    .line 212
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v25, 0x4031eb85    # 2.78f

    .line 216
    .line 217
    .line 218
    const v26, 0x3f147ae1    # 0.58f

    .line 219
    .line 220
    .line 221
    const v21, 0x3f7d70a4    # 0.99f

    .line 222
    .line 223
    .line 224
    const/16 v22, 0x0

    .line 225
    .line 226
    const v23, 0x3ff70a3d    # 1.93f

    .line 227
    .line 228
    .line 229
    const v24, 0x3e570a3d    # 0.21f

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v25, 0x41800000    # 16.0f

    .line 236
    .line 237
    const v26, 0x4156e148    # 13.43f

    .line 238
    .line 239
    .line 240
    const v21, 0x417851ec    # 15.52f

    .line 241
    .line 242
    .line 243
    const v22, 0x413e6666    # 11.9f

    .line 244
    .line 245
    .line 246
    const/high16 v23, 0x41800000    # 16.0f

    .line 247
    .line 248
    const v24, 0x4149eb85    # 12.62f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v4, 0x41600000    # 14.0f

    .line 255
    .line 256
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    const/16 v16, 0x3800

    .line 267
    .line 268
    const/16 v17, 0x0

    .line 269
    .line 270
    const v6, 0x3e99999a    # 0.3f

    .line 271
    .line 272
    .line 273
    const v8, 0x3e99999a    # 0.3f

    .line 274
    .line 275
    .line 276
    const/4 v7, 0x0

    .line 277
    const/high16 v9, 0x3f800000    # 1.0f

    .line 278
    .line 279
    const/high16 v12, 0x3f800000    # 1.0f

    .line 280
    .line 281
    const/4 v13, 0x0

    .line 282
    const/4 v14, 0x0

    .line 283
    const/4 v15, 0x0

    .line 284
    const-string v4, ""

    .line 285
    .line 286
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 287
    .line 288
    .line 289
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 290
    .line 291
    .line 292
    move-result v3

    .line 293
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 294
    .line 295
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 296
    .line 297
    .line 298
    move-result-wide v6

    .line 299
    const/4 v0, 0x0

    .line 300
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 304
    .line 305
    .line 306
    move-result v10

    .line 307
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 308
    .line 309
    .line 310
    move-result v11

    .line 311
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 314
    .line 315
    .line 316
    const/high16 v0, 0x41a00000    # 20.0f

    .line 317
    .line 318
    const/high16 v2, 0x40000000    # 2.0f

    .line 319
    .line 320
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v0, 0x408051ec    # 4.01f

    .line 324
    .line 325
    .line 326
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const/high16 v17, -0x40000000    # -2.0f

    .line 330
    .line 331
    const/high16 v18, 0x40000000    # 2.0f

    .line 332
    .line 333
    const v13, -0x40733333    # -1.1f

    .line 334
    .line 335
    .line 336
    const/high16 v15, -0x40000000    # -2.0f

    .line 337
    .line 338
    const v16, 0x3f666666    # 0.9f

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/high16 v0, 0x41b00000    # 22.0f

    .line 345
    .line 346
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v0, -0x3f800000    # -4.0f

    .line 350
    .line 351
    const/high16 v2, 0x40800000    # 4.0f

    .line 352
    .line 353
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/high16 v0, 0x41600000    # 14.0f

    .line 357
    .line 358
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const/high16 v17, 0x40000000    # 2.0f

    .line 362
    .line 363
    const/high16 v18, -0x40000000    # -2.0f

    .line 364
    .line 365
    const v13, 0x3f8ccccd    # 1.1f

    .line 366
    .line 367
    .line 368
    const/high16 v15, 0x40000000    # 2.0f

    .line 369
    .line 370
    const v16, -0x4099999a    # -0.9f

    .line 371
    .line 372
    .line 373
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v0, 0x40800000    # 4.0f

    .line 377
    .line 378
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v17, 0x41a00000    # 20.0f

    .line 382
    .line 383
    const/high16 v18, 0x40000000    # 2.0f

    .line 384
    .line 385
    const/high16 v13, 0x41b00000    # 22.0f

    .line 386
    .line 387
    const v14, 0x4039999a    # 2.9f

    .line 388
    .line 389
    .line 390
    const v15, 0x41a8cccd    # 21.1f

    .line 391
    .line 392
    .line 393
    const/high16 v16, 0x40000000    # 2.0f

    .line 394
    .line 395
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/high16 v0, 0x41a00000    # 20.0f

    .line 402
    .line 403
    const/high16 v2, 0x41800000    # 16.0f

    .line 404
    .line 405
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v0, 0x40a570a4    # 5.17f

    .line 409
    .line 410
    .line 411
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v0, 0x41895c29    # 17.17f

    .line 415
    .line 416
    .line 417
    const/high16 v2, 0x40800000    # 4.0f

    .line 418
    .line 419
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const/high16 v0, 0x40800000    # 4.0f

    .line 423
    .line 424
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const/high16 v0, 0x41800000    # 16.0f

    .line 428
    .line 429
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const/high16 v0, 0x41200000    # 10.0f

    .line 439
    .line 440
    const/high16 v2, 0x41400000    # 12.0f

    .line 441
    .line 442
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const/high16 v17, 0x40000000    # 2.0f

    .line 446
    .line 447
    const/high16 v18, -0x40000000    # -2.0f

    .line 448
    .line 449
    const v13, 0x3f8ccccd    # 1.1f

    .line 450
    .line 451
    .line 452
    const/4 v14, 0x0

    .line 453
    const/high16 v15, 0x40000000    # 2.0f

    .line 454
    .line 455
    const v16, -0x4099999a    # -0.9f

    .line 456
    .line 457
    .line 458
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const v0, -0x4099999a    # -0.9f

    .line 462
    .line 463
    .line 464
    const/high16 v2, -0x40000000    # -2.0f

    .line 465
    .line 466
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const v0, 0x3f666666    # 0.9f

    .line 470
    .line 471
    .line 472
    const/high16 v2, 0x40000000    # 2.0f

    .line 473
    .line 474
    const/high16 v4, -0x40000000    # -2.0f

    .line 475
    .line 476
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const v0, 0x412e6666    # 10.9f

    .line 480
    .line 481
    .line 482
    const/high16 v2, 0x41200000    # 10.0f

    .line 483
    .line 484
    const/high16 v4, 0x41400000    # 12.0f

    .line 485
    .line 486
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const v0, 0x4156e148    # 13.43f

    .line 493
    .line 494
    .line 495
    const/high16 v2, 0x41800000    # 16.0f

    .line 496
    .line 497
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const v17, -0x4063d70a    # -1.22f

    .line 501
    .line 502
    .line 503
    const v18, -0x40133333    # -1.85f

    .line 504
    .line 505
    .line 506
    const/4 v13, 0x0

    .line 507
    const v14, -0x40b0a3d7    # -0.81f

    .line 508
    .line 509
    .line 510
    const v15, -0x410a3d71    # -0.48f

    .line 511
    .line 512
    .line 513
    const v16, -0x403c28f6    # -1.53f

    .line 514
    .line 515
    .line 516
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/high16 v17, 0x41400000    # 12.0f

    .line 520
    .line 521
    const/high16 v18, 0x41300000    # 11.0f

    .line 522
    .line 523
    const v13, 0x415ee148    # 13.93f

    .line 524
    .line 525
    .line 526
    const v14, 0x41335c29    # 11.21f

    .line 527
    .line 528
    .line 529
    const v15, 0x414fd70a    # 12.99f

    .line 530
    .line 531
    .line 532
    const/high16 v16, 0x41300000    # 11.0f

    .line 533
    .line 534
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const v17, -0x3fce147b    # -2.78f

    .line 538
    .line 539
    .line 540
    const v18, 0x3f147ae1    # 0.58f

    .line 541
    .line 542
    .line 543
    const v13, -0x40828f5c    # -0.99f

    .line 544
    .line 545
    .line 546
    const/4 v14, 0x0

    .line 547
    const v15, -0x4008f5c3    # -1.93f

    .line 548
    .line 549
    .line 550
    const v16, 0x3e570a3d    # 0.21f

    .line 551
    .line 552
    .line 553
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const/high16 v17, 0x41000000    # 8.0f

    .line 557
    .line 558
    const v18, 0x4156e148    # 13.43f

    .line 559
    .line 560
    .line 561
    const v13, 0x4107ae14    # 8.48f

    .line 562
    .line 563
    .line 564
    const v14, 0x413e6666    # 11.9f

    .line 565
    .line 566
    .line 567
    const/high16 v15, 0x41000000    # 8.0f

    .line 568
    .line 569
    const v16, 0x4149eb85    # 12.62f

    .line 570
    .line 571
    .line 572
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const/high16 v0, 0x41600000    # 14.0f

    .line 576
    .line 577
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const/high16 v0, 0x41000000    # 8.0f

    .line 581
    .line 582
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const v0, 0x4156e148    # 13.43f

    .line 586
    .line 587
    .line 588
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 595
    .line 596
    .line 597
    move-result-object v2

    .line 598
    const/16 v16, 0x3800

    .line 599
    .line 600
    const/16 v17, 0x0

    .line 601
    .line 602
    const/high16 v6, 0x3f800000    # 1.0f

    .line 603
    .line 604
    const/high16 v8, 0x3f800000    # 1.0f

    .line 605
    .line 606
    const/4 v7, 0x0

    .line 607
    const/high16 v12, 0x3f800000    # 1.0f

    .line 608
    .line 609
    const/4 v13, 0x0

    .line 610
    const/4 v14, 0x0

    .line 611
    const/4 v15, 0x0

    .line 612
    const-string v4, ""

    .line 613
    .line 614
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 615
    .line 616
    .line 617
    move-result-object v0

    .line 618
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 619
    .line 620
    .line 621
    move-result-object v0

    .line 622
    sput-object v0, Landroidx/compose/material/icons/twotone/_3pKt;->__3p:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 623
    .line 624
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 625
    .line 626
    .line 627
    return-object v0
.end method
