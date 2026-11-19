.class public final Landroidx/compose/material/icons/twotone/HistoryEduKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_historyEdu",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "HistoryEdu",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getHistoryEdu",
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
        "SMAP\nHistoryEdu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HistoryEdu.kt\nandroidx/compose/material/icons/twotone/HistoryEduKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,112:1\n212#2,12:113\n233#2,18:126\n253#2:163\n233#2,18:164\n253#2:201\n233#2,18:202\n253#2:239\n174#3:125\n705#4,2:144\n717#4,2:146\n719#4,11:152\n705#4,2:182\n717#4,2:184\n719#4,11:190\n705#4,2:220\n717#4,2:222\n719#4,11:228\n72#5,4:148\n72#5,4:186\n72#5,4:224\n*S KotlinDebug\n*F\n+ 1 HistoryEdu.kt\nandroidx/compose/material/icons/twotone/HistoryEduKt\n*L\n29#1:113,12\n30#1:126,18\n30#1:163\n43#1:164,18\n43#1:201\n61#1:202,18\n61#1:239\n29#1:125\n30#1:144,2\n30#1:146,2\n30#1:152,11\n43#1:182,2\n43#1:184,2\n43#1:190,11\n61#1:220,2\n61#1:222,2\n61#1:228,11\n30#1:148,4\n43#1:186,4\n61#1:224,4\n*E\n"
    }
.end annotation


# static fields
.field private static _historyEdu:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHistoryEdu(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/HistoryEduKt;->_historyEdu:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.HistoryEdu"

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
    const v4, 0x411c28f6    # 9.76f

    .line 71
    .line 72
    .line 73
    const v6, 0x413570a4    # 11.34f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, 0x411ee148    # 9.93f

    .line 80
    .line 81
    .line 82
    const v6, 0x410570a4    # 8.34f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v25, 0x40cc7ae1    # 6.39f

    .line 89
    .line 90
    .line 91
    const v26, 0x40dc28f6    # 6.88f

    .line 92
    .line 93
    .line 94
    const v21, 0x410fae14    # 8.98f

    .line 95
    .line 96
    .line 97
    const v22, 0x40eccccd    # 7.4f

    .line 98
    .line 99
    .line 100
    const v23, 0x40f75c29    # 7.73f

    .line 101
    .line 102
    .line 103
    const v24, 0x40dc28f6    # 6.88f

    .line 104
    .line 105
    .line 106
    move-object/from16 v20, v2

    .line 107
    .line 108
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v25, 0x40923d71    # 4.57f

    .line 112
    .line 113
    .line 114
    const v26, 0x40e70a3d    # 7.22f

    .line 115
    .line 116
    .line 117
    const v21, 0x40b851ec    # 5.76f

    .line 118
    .line 119
    .line 120
    const v22, 0x40dc28f6    # 6.88f

    .line 121
    .line 122
    .line 123
    const v23, 0x40a47ae1    # 5.14f

    .line 124
    .line 125
    .line 126
    const/high16 v24, 0x40e00000    # 7.0f

    .line 127
    .line 128
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v4, 0x3f851eb8    # 1.04f

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v4, 0x4011eb85    # 2.28f

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v4, 0x4008f5c3    # 2.14f

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v25, 0x3faa3d71    # 1.33f

    .line 150
    .line 151
    .line 152
    const v26, 0x3eb33333    # 0.35f

    .line 153
    .line 154
    .line 155
    const v21, 0x3ecccccd    # 0.4f

    .line 156
    .line 157
    .line 158
    const v22, 0x3e6b851f    # 0.23f

    .line 159
    .line 160
    .line 161
    const v23, 0x3f5c28f6    # 0.86f

    .line 162
    .line 163
    .line 164
    const v24, 0x3eb33333    # 0.35f

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v25, 0x3ff5c28f    # 1.92f

    .line 171
    .line 172
    .line 173
    const v26, -0x40b33333    # -0.8f

    .line 174
    .line 175
    .line 176
    const v21, 0x3f3ae148    # 0.73f

    .line 177
    .line 178
    .line 179
    const/16 v22, 0x0

    .line 180
    .line 181
    const v23, 0x3fb47ae1    # 1.41f

    .line 182
    .line 183
    .line 184
    const v24, -0x4170a3d7    # -0.28f

    .line 185
    .line 186
    .line 187
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v4, 0x411c28f6    # 9.76f

    .line 191
    .line 192
    .line 193
    const v6, 0x413570a4    # 11.34f

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    const/16 v16, 0x3800

    .line 207
    .line 208
    const/16 v17, 0x0

    .line 209
    .line 210
    const v6, 0x3e99999a    # 0.3f

    .line 211
    .line 212
    .line 213
    const v8, 0x3e99999a    # 0.3f

    .line 214
    .line 215
    .line 216
    const/4 v7, 0x0

    .line 217
    const/high16 v9, 0x3f800000    # 1.0f

    .line 218
    .line 219
    const/high16 v12, 0x3f800000    # 1.0f

    .line 220
    .line 221
    const/4 v13, 0x0

    .line 222
    const/4 v14, 0x0

    .line 223
    const/4 v15, 0x0

    .line 224
    const-string v4, ""

    .line 225
    .line 226
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 227
    .line 228
    .line 229
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 230
    .line 231
    .line 232
    move-result v3

    .line 233
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 234
    .line 235
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 236
    .line 237
    .line 238
    move-result-wide v6

    .line 239
    const/4 v2, 0x0

    .line 240
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 244
    .line 245
    .line 246
    move-result v10

    .line 247
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 248
    .line 249
    .line 250
    move-result v11

    .line 251
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 254
    .line 255
    .line 256
    const/high16 v4, 0x41300000    # 11.0f

    .line 257
    .line 258
    const v6, 0x40d3d70a    # 6.62f

    .line 259
    .line 260
    .line 261
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v4, 0x40bf0a3d    # 5.97f

    .line 265
    .line 266
    .line 267
    const/high16 v6, 0x40c00000    # 6.0f

    .line 268
    .line 269
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v4, 0x41600000    # 14.0f

    .line 273
    .line 274
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v4, -0x404b851f    # -1.41f

    .line 278
    .line 279
    .line 280
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v4, -0x3fcae148    # -2.83f

    .line 284
    .line 285
    .line 286
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v4, 0x3e4ccccd    # 0.2f

    .line 290
    .line 291
    .line 292
    const v6, -0x41b33333    # -0.2f

    .line 293
    .line 294
    .line 295
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v25, -0x403851ec    # -1.56f

    .line 299
    .line 300
    .line 301
    const v26, 0x3f83d70a    # 1.03f

    .line 302
    .line 303
    .line 304
    const v21, -0x41147ae1    # -0.46f

    .line 305
    .line 306
    .line 307
    const v22, 0x3eeb851f    # 0.46f

    .line 308
    .line 309
    .line 310
    const v23, -0x40828f5c    # -0.99f

    .line 311
    .line 312
    .line 313
    const v24, 0x3f4ccccd    # 0.8f

    .line 314
    .line 315
    .line 316
    move-object/from16 v20, v2

    .line 317
    .line 318
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v4, 0x41700000    # 15.0f

    .line 322
    .line 323
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v4, 0x40c00000    # 6.0f

    .line 327
    .line 328
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v4, 0x40000000    # 2.0f

    .line 332
    .line 333
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/high16 v25, 0x3f800000    # 1.0f

    .line 337
    .line 338
    const/high16 v26, 0x3f800000    # 1.0f

    .line 339
    .line 340
    const/16 v21, 0x0

    .line 341
    .line 342
    const v22, 0x3f0ccccd    # 0.55f

    .line 343
    .line 344
    .line 345
    const v23, 0x3ee66666    # 0.45f

    .line 346
    .line 347
    .line 348
    const/high16 v24, 0x3f800000    # 1.0f

    .line 349
    .line 350
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v4, -0x4119999a    # -0.45f

    .line 354
    .line 355
    .line 356
    const/high16 v6, 0x3f800000    # 1.0f

    .line 357
    .line 358
    const/high16 v7, -0x40800000    # -1.0f

    .line 359
    .line 360
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const/high16 v4, 0x40c00000    # 6.0f

    .line 364
    .line 365
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const/high16 v4, -0x3f000000    # -8.0f

    .line 369
    .line 370
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v4, 0x40d3d70a    # 6.62f

    .line 374
    .line 375
    .line 376
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 383
    .line 384
    .line 385
    move-result-object v2

    .line 386
    const v6, 0x3e99999a    # 0.3f

    .line 387
    .line 388
    .line 389
    const/4 v7, 0x0

    .line 390
    const-string v4, ""

    .line 391
    .line 392
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 393
    .line 394
    .line 395
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 396
    .line 397
    .line 398
    move-result v3

    .line 399
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 400
    .line 401
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 402
    .line 403
    .line 404
    move-result-wide v6

    .line 405
    const/4 v0, 0x0

    .line 406
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 407
    .line 408
    .line 409
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 410
    .line 411
    .line 412
    move-result v10

    .line 413
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 414
    .line 415
    .line 416
    move-result v11

    .line 417
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 420
    .line 421
    .line 422
    const/high16 v0, 0x40800000    # 4.0f

    .line 423
    .line 424
    const/high16 v2, 0x41100000    # 9.0f

    .line 425
    .line 426
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v0, 0x3fb0a3d7    # 1.38f

    .line 430
    .line 431
    .line 432
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v17, -0x3fd8f5c3    # -2.61f

    .line 436
    .line 437
    .line 438
    const/high16 v18, -0x41000000    # -0.5f

    .line 439
    .line 440
    const v13, -0x40ab851f    # -0.83f

    .line 441
    .line 442
    .line 443
    const v14, -0x41570a3d    # -0.33f

    .line 444
    .line 445
    .line 446
    const v15, -0x4023d70a    # -1.72f

    .line 447
    .line 448
    .line 449
    const/high16 v16, -0x41000000    # -0.5f

    .line 450
    .line 451
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v17, -0x3f61999a    # -4.95f

    .line 455
    .line 456
    .line 457
    const v18, 0x40033333    # 2.05f

    .line 458
    .line 459
    .line 460
    const v13, -0x401ae148    # -1.79f

    .line 461
    .line 462
    .line 463
    const/4 v14, 0x0

    .line 464
    const v15, -0x3f9ae148    # -3.58f

    .line 465
    .line 466
    .line 467
    const v16, 0x3f2e147b    # 0.68f

    .line 468
    .line 469
    .line 470
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const v0, 0x40551eb8    # 3.33f

    .line 474
    .line 475
    .line 476
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const v0, 0x3f8e147b    # 1.11f

    .line 480
    .line 481
    .line 482
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const v17, 0x40470a3d    # 3.11f

    .line 489
    .line 490
    .line 491
    const v18, 0x3fae147b    # 1.36f

    .line 492
    .line 493
    .line 494
    const v13, 0x3f5c28f6    # 0.86f

    .line 495
    .line 496
    .line 497
    const v14, 0x3f5c28f6    # 0.86f

    .line 498
    .line 499
    .line 500
    const v15, 0x3ffd70a4    # 1.98f

    .line 501
    .line 502
    .line 503
    const v16, 0x3fa7ae14    # 1.31f

    .line 504
    .line 505
    .line 506
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const/high16 v0, 0x41700000    # 15.0f

    .line 510
    .line 511
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const/high16 v0, 0x40c00000    # 6.0f

    .line 515
    .line 516
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/high16 v0, 0x40400000    # 3.0f

    .line 520
    .line 521
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const/high16 v17, 0x40000000    # 2.0f

    .line 525
    .line 526
    const/high16 v18, 0x40000000    # 2.0f

    .line 527
    .line 528
    const/4 v13, 0x0

    .line 529
    const v14, 0x3f8ccccd    # 1.1f

    .line 530
    .line 531
    .line 532
    const v15, 0x3f666666    # 0.9f

    .line 533
    .line 534
    .line 535
    const/high16 v16, 0x40000000    # 2.0f

    .line 536
    .line 537
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const/high16 v0, 0x41200000    # 10.0f

    .line 541
    .line 542
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const/high16 v17, 0x40400000    # 3.0f

    .line 546
    .line 547
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 548
    .line 549
    const v13, 0x3fd47ae1    # 1.66f

    .line 550
    .line 551
    .line 552
    const/4 v14, 0x0

    .line 553
    const/high16 v15, 0x40400000    # 3.0f

    .line 554
    .line 555
    const v16, -0x40547ae1    # -1.34f

    .line 556
    .line 557
    .line 558
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const/high16 v0, 0x40800000    # 4.0f

    .line 562
    .line 563
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const/high16 v0, 0x41100000    # 9.0f

    .line 567
    .line 568
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const v0, 0x40fc7ae1    # 7.89f

    .line 575
    .line 576
    .line 577
    const v2, 0x41268f5c    # 10.41f

    .line 578
    .line 579
    .line 580
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const v0, 0x410428f6    # 8.26f

    .line 584
    .line 585
    .line 586
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const v0, 0x40b3851f    # 5.61f

    .line 590
    .line 591
    .line 592
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    const v0, 0x40923d71    # 4.57f

    .line 596
    .line 597
    .line 598
    const v2, 0x40e70a3d    # 7.22f

    .line 599
    .line 600
    .line 601
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const v17, 0x40cc7ae1    # 6.39f

    .line 605
    .line 606
    .line 607
    const v18, 0x40dc28f6    # 6.88f

    .line 608
    .line 609
    .line 610
    const v13, 0x40a47ae1    # 5.14f

    .line 611
    .line 612
    .line 613
    const/high16 v14, 0x40e00000    # 7.0f

    .line 614
    .line 615
    const v15, 0x40b851ec    # 5.76f

    .line 616
    .line 617
    .line 618
    const v16, 0x40dc28f6    # 6.88f

    .line 619
    .line 620
    .line 621
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const v17, 0x40628f5c    # 3.54f

    .line 625
    .line 626
    .line 627
    const v18, 0x3fbae148    # 1.46f

    .line 628
    .line 629
    .line 630
    const v13, 0x3fab851f    # 1.34f

    .line 631
    .line 632
    .line 633
    const/4 v14, 0x0

    .line 634
    const v15, 0x4025c28f    # 2.59f

    .line 635
    .line 636
    .line 637
    const v16, 0x3f051eb8    # 0.52f

    .line 638
    .line 639
    .line 640
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const v0, 0x3fb47ae1    # 1.41f

    .line 644
    .line 645
    .line 646
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const v0, 0x3e4ccccd    # 0.2f

    .line 650
    .line 651
    .line 652
    const v2, -0x41b33333    # -0.2f

    .line 653
    .line 654
    .line 655
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const v17, -0x400a3d71    # -1.92f

    .line 659
    .line 660
    .line 661
    const v18, 0x3f4ccccd    # 0.8f

    .line 662
    .line 663
    .line 664
    const v13, -0x40fd70a4    # -0.51f

    .line 665
    .line 666
    .line 667
    const v14, 0x3f028f5c    # 0.51f

    .line 668
    .line 669
    .line 670
    const v15, -0x4067ae14    # -1.19f

    .line 671
    .line 672
    .line 673
    const v16, 0x3f4ccccd    # 0.8f

    .line 674
    .line 675
    .line 676
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 677
    .line 678
    .line 679
    const v17, 0x40fc7ae1    # 7.89f

    .line 680
    .line 681
    .line 682
    const v18, 0x41268f5c    # 10.41f

    .line 683
    .line 684
    .line 685
    const/high16 v13, 0x410c0000    # 8.75f

    .line 686
    .line 687
    const/high16 v14, 0x412c0000    # 10.75f

    .line 688
    .line 689
    const v15, 0x4104a3d7    # 8.29f

    .line 690
    .line 691
    .line 692
    const v16, 0x412a147b    # 10.63f

    .line 693
    .line 694
    .line 695
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 696
    .line 697
    .line 698
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    const/high16 v0, 0x41980000    # 19.0f

    .line 702
    .line 703
    const/high16 v2, 0x41880000    # 17.0f

    .line 704
    .line 705
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 706
    .line 707
    .line 708
    const/high16 v17, -0x40800000    # -1.0f

    .line 709
    .line 710
    const/high16 v18, 0x3f800000    # 1.0f

    .line 711
    .line 712
    const/4 v13, 0x0

    .line 713
    const v14, 0x3f0ccccd    # 0.55f

    .line 714
    .line 715
    .line 716
    const v15, -0x4119999a    # -0.45f

    .line 717
    .line 718
    .line 719
    const/high16 v16, 0x3f800000    # 1.0f

    .line 720
    .line 721
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 722
    .line 723
    .line 724
    const v0, -0x4119999a    # -0.45f

    .line 725
    .line 726
    .line 727
    const/high16 v2, -0x40800000    # -1.0f

    .line 728
    .line 729
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    const/high16 v0, -0x40000000    # -2.0f

    .line 733
    .line 734
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 735
    .line 736
    .line 737
    const/high16 v0, -0x3f400000    # -6.0f

    .line 738
    .line 739
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    const v0, -0x3fda3d71    # -2.59f

    .line 743
    .line 744
    .line 745
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 746
    .line 747
    .line 748
    const v17, 0x3fc7ae14    # 1.56f

    .line 749
    .line 750
    .line 751
    const v18, -0x407c28f6    # -1.03f

    .line 752
    .line 753
    .line 754
    const v13, 0x3f11eb85    # 0.57f

    .line 755
    .line 756
    .line 757
    const v14, -0x41947ae1    # -0.23f

    .line 758
    .line 759
    .line 760
    const v15, 0x3f8ccccd    # 1.1f

    .line 761
    .line 762
    .line 763
    const v16, -0x40ee147b    # -0.57f

    .line 764
    .line 765
    .line 766
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 767
    .line 768
    .line 769
    const v0, 0x3e4ccccd    # 0.2f

    .line 770
    .line 771
    .line 772
    const v2, -0x41b33333    # -0.2f

    .line 773
    .line 774
    .line 775
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 776
    .line 777
    .line 778
    const v0, 0x417970a4    # 15.59f

    .line 779
    .line 780
    .line 781
    const/high16 v2, 0x41600000    # 14.0f

    .line 782
    .line 783
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 784
    .line 785
    .line 786
    const/high16 v0, 0x41880000    # 17.0f

    .line 787
    .line 788
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 789
    .line 790
    .line 791
    const v0, -0x404b851f    # -1.41f

    .line 792
    .line 793
    .line 794
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 795
    .line 796
    .line 797
    const/high16 v0, -0x3f400000    # -6.0f

    .line 798
    .line 799
    const v2, -0x3f40f5c3    # -5.97f

    .line 800
    .line 801
    .line 802
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 803
    .line 804
    .line 805
    const/high16 v0, 0x40c00000    # 6.0f

    .line 806
    .line 807
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 808
    .line 809
    .line 810
    const/high16 v0, 0x41000000    # 8.0f

    .line 811
    .line 812
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 813
    .line 814
    .line 815
    const/high16 v0, 0x41880000    # 17.0f

    .line 816
    .line 817
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 818
    .line 819
    .line 820
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 821
    .line 822
    .line 823
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 824
    .line 825
    .line 826
    move-result-object v2

    .line 827
    const/16 v16, 0x3800

    .line 828
    .line 829
    const/16 v17, 0x0

    .line 830
    .line 831
    const/high16 v6, 0x3f800000    # 1.0f

    .line 832
    .line 833
    const/high16 v8, 0x3f800000    # 1.0f

    .line 834
    .line 835
    const/4 v7, 0x0

    .line 836
    const/high16 v12, 0x3f800000    # 1.0f

    .line 837
    .line 838
    const/4 v13, 0x0

    .line 839
    const/4 v14, 0x0

    .line 840
    const/4 v15, 0x0

    .line 841
    const-string v4, ""

    .line 842
    .line 843
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 844
    .line 845
    .line 846
    move-result-object v0

    .line 847
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 848
    .line 849
    .line 850
    move-result-object v0

    .line 851
    sput-object v0, Landroidx/compose/material/icons/twotone/HistoryEduKt;->_historyEdu:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 852
    .line 853
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 854
    .line 855
    .line 856
    return-object v0
.end method
