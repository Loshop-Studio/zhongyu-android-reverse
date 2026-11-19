.class public final Landroidx/compose/material/icons/outlined/PestControlRodentKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_pestControlRodent",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "PestControlRodent",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getPestControlRodent",
        "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nPestControlRodent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PestControlRodent.kt\nandroidx/compose/material/icons/outlined/PestControlRodentKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,83:1\n212#2,12:84\n233#2,18:97\n253#2:134\n233#2,18:135\n253#2:172\n174#3:96\n705#4,2:115\n717#4,2:117\n719#4,11:123\n705#4,2:153\n717#4,2:155\n719#4,11:161\n72#5,4:119\n72#5,4:157\n*S KotlinDebug\n*F\n+ 1 PestControlRodent.kt\nandroidx/compose/material/icons/outlined/PestControlRodentKt\n*L\n29#1:84,12\n30#1:97,18\n30#1:134\n36#1:135,18\n36#1:172\n29#1:96\n30#1:115,2\n30#1:117,2\n30#1:123,11\n36#1:153,2\n36#1:155,2\n36#1:161,11\n30#1:119,4\n36#1:157,4\n*E\n"
    }
.end annotation


# static fields
.field private static _pestControlRodent:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPestControlRodent(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/PestControlRodentKt;->_pestControlRodent:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.PestControlRodent"

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
    const/high16 v4, 0x41880000    # 17.0f

    .line 71
    .line 72
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 73
    .line 74
    .line 75
    const/high16 v4, -0x40800000    # -1.0f

    .line 76
    .line 77
    const/4 v6, 0x0

    .line 78
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 79
    .line 80
    .line 81
    const/high16 v26, 0x40000000    # 2.0f

    .line 82
    .line 83
    const/16 v27, 0x0

    .line 84
    .line 85
    const/high16 v21, 0x3f800000    # 1.0f

    .line 86
    .line 87
    const/high16 v22, 0x3f800000    # 1.0f

    .line 88
    .line 89
    const/16 v23, 0x0

    .line 90
    .line 91
    const/16 v24, 0x1

    .line 92
    .line 93
    const/16 v25, 0x1

    .line 94
    .line 95
    move-object/from16 v20, v2

    .line 96
    .line 97
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v26, -0x40000000    # -2.0f

    .line 101
    .line 102
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    const/16 v16, 0x3800

    .line 110
    .line 111
    const/16 v17, 0x0

    .line 112
    .line 113
    const/high16 v6, 0x3f800000    # 1.0f

    .line 114
    .line 115
    const/high16 v8, 0x3f800000    # 1.0f

    .line 116
    .line 117
    const/4 v7, 0x0

    .line 118
    const/high16 v9, 0x3f800000    # 1.0f

    .line 119
    .line 120
    const/high16 v12, 0x3f800000    # 1.0f

    .line 121
    .line 122
    const/4 v13, 0x0

    .line 123
    const/4 v14, 0x0

    .line 124
    const/4 v15, 0x0

    .line 125
    const-string v4, ""

    .line 126
    .line 127
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 128
    .line 129
    .line 130
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 135
    .line 136
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 137
    .line 138
    .line 139
    move-result-wide v6

    .line 140
    const/4 v0, 0x0

    .line 141
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 145
    .line 146
    .line 147
    move-result v10

    .line 148
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 149
    .line 150
    .line 151
    move-result v11

    .line 152
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 155
    .line 156
    .line 157
    const v0, 0x41a6e148    # 20.86f

    .line 158
    .line 159
    .line 160
    const v2, 0x416f851f    # 14.97f

    .line 161
    .line 162
    .line 163
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v0, -0x4091eb85    # -0.93f

    .line 167
    .line 168
    .line 169
    const v2, -0x40a8f5c3    # -0.84f

    .line 170
    .line 171
    .line 172
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v17, -0x3f3e6666    # -6.05f

    .line 176
    .line 177
    .line 178
    const v18, -0x3f65c28f    # -4.82f

    .line 179
    .line 180
    .line 181
    const v13, 0x3ef5c28f    # 0.48f

    .line 182
    .line 183
    .line 184
    const v14, -0x3fa33333    # -3.45f

    .line 185
    .line 186
    .line 187
    const v15, -0x3fc851ec    # -2.87f

    .line 188
    .line 189
    .line 190
    const v16, -0x3f3eb852    # -6.04f

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const/high16 v17, 0x41400000    # 12.0f

    .line 197
    .line 198
    const/high16 v18, 0x41100000    # 9.0f

    .line 199
    .line 200
    const v13, 0x4154cccd    # 13.3f

    .line 201
    .line 202
    .line 203
    const v14, 0x4111c28f    # 9.11f

    .line 204
    .line 205
    .line 206
    const v15, 0x414a8f5c    # 12.66f

    .line 207
    .line 208
    .line 209
    const/high16 v16, 0x41100000    # 9.0f

    .line 210
    .line 211
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v17, -0x3f43851f    # -5.89f

    .line 215
    .line 216
    .line 217
    const v18, 0x409b3333    # 4.85f

    .line 218
    .line 219
    .line 220
    const v13, -0x3f77ae14    # -4.26f

    .line 221
    .line 222
    .line 223
    const/4 v14, 0x0

    .line 224
    const v15, -0x3f4b3333    # -5.65f

    .line 225
    .line 226
    .line 227
    const v16, 0x40651eb8    # 3.58f

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v17, 0x40800000    # 4.0f

    .line 234
    .line 235
    const/high16 v18, 0x41300000    # 11.0f

    .line 236
    .line 237
    const v13, 0x409c7ae1    # 4.89f

    .line 238
    .line 239
    .line 240
    const v14, 0x4157851f    # 13.47f

    .line 241
    .line 242
    .line 243
    const/high16 v15, 0x40800000    # 4.0f

    .line 244
    .line 245
    const v16, 0x4145999a    # 12.35f

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v17, 0x40400000    # 3.0f

    .line 252
    .line 253
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 254
    .line 255
    const/4 v13, 0x0

    .line 256
    const v14, -0x402b851f    # -1.66f

    .line 257
    .line 258
    .line 259
    const v15, 0x3fab851f    # 1.34f

    .line 260
    .line 261
    .line 262
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 263
    .line 264
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/high16 v0, 0x40200000    # 2.5f

    .line 268
    .line 269
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v17, 0x41400000    # 12.0f

    .line 273
    .line 274
    const/high16 v18, 0x40b00000    # 5.5f

    .line 275
    .line 276
    const v13, 0x412e147b    # 10.88f

    .line 277
    .line 278
    .line 279
    const/high16 v14, 0x41000000    # 8.0f

    .line 280
    .line 281
    const/high16 v15, 0x41400000    # 12.0f

    .line 282
    .line 283
    const v16, 0x40dc28f6    # 6.88f

    .line 284
    .line 285
    .line 286
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v17, 0x41180000    # 9.5f

    .line 290
    .line 291
    const/high16 v18, 0x40400000    # 3.0f

    .line 292
    .line 293
    const/high16 v13, 0x41400000    # 12.0f

    .line 294
    .line 295
    const v14, 0x4083d70a    # 4.12f

    .line 296
    .line 297
    .line 298
    const v15, 0x412e147b    # 10.88f

    .line 299
    .line 300
    .line 301
    const/high16 v16, 0x40400000    # 3.0f

    .line 302
    .line 303
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const/high16 v0, 0x41000000    # 8.0f

    .line 307
    .line 308
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const/high16 v17, 0x40e00000    # 7.0f

    .line 312
    .line 313
    const/high16 v18, 0x40800000    # 4.0f

    .line 314
    .line 315
    const v13, 0x40ee6666    # 7.45f

    .line 316
    .line 317
    .line 318
    const/high16 v14, 0x40400000    # 3.0f

    .line 319
    .line 320
    const/high16 v15, 0x40e00000    # 7.0f

    .line 321
    .line 322
    const v16, 0x405ccccd    # 3.45f

    .line 323
    .line 324
    .line 325
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const/high16 v17, 0x3f800000    # 1.0f

    .line 329
    .line 330
    const/high16 v18, 0x3f800000    # 1.0f

    .line 331
    .line 332
    const/4 v13, 0x0

    .line 333
    const v14, 0x3f0ccccd    # 0.55f

    .line 334
    .line 335
    .line 336
    const v15, 0x3ee66666    # 0.45f

    .line 337
    .line 338
    .line 339
    const/high16 v16, 0x3f800000    # 1.0f

    .line 340
    .line 341
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 345
    .line 346
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v17, 0x41200000    # 10.0f

    .line 350
    .line 351
    const/high16 v18, 0x40b00000    # 5.5f

    .line 352
    .line 353
    const v13, 0x411c7ae1    # 9.78f

    .line 354
    .line 355
    .line 356
    const/high16 v14, 0x40a00000    # 5.0f

    .line 357
    .line 358
    const/high16 v15, 0x41200000    # 10.0f

    .line 359
    .line 360
    const v16, 0x40a70a3d    # 5.22f

    .line 361
    .line 362
    .line 363
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const/high16 v17, 0x41180000    # 9.5f

    .line 367
    .line 368
    const/high16 v18, 0x40c00000    # 6.0f

    .line 369
    .line 370
    const/high16 v13, 0x41200000    # 10.0f

    .line 371
    .line 372
    const v14, 0x40b8f5c3    # 5.78f

    .line 373
    .line 374
    .line 375
    const v15, 0x411c7ae1    # 9.78f

    .line 376
    .line 377
    .line 378
    const/high16 v16, 0x40c00000    # 6.0f

    .line 379
    .line 380
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const/high16 v0, 0x40e00000    # 7.0f

    .line 384
    .line 385
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const/high16 v17, -0x3f600000    # -5.0f

    .line 389
    .line 390
    const/high16 v18, 0x40a00000    # 5.0f

    .line 391
    .line 392
    const v13, -0x3fcf5c29    # -2.76f

    .line 393
    .line 394
    .line 395
    const/4 v14, 0x0

    .line 396
    const/high16 v15, -0x3f600000    # -5.0f

    .line 397
    .line 398
    const v16, 0x400f5c29    # 2.24f

    .line 399
    .line 400
    .line 401
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v17, 0x40823d71    # 4.07f

    .line 405
    .line 406
    .line 407
    const v18, 0x409d1eb8    # 4.91f

    .line 408
    .line 409
    .line 410
    const/4 v13, 0x0

    .line 411
    const v14, 0x401c28f6    # 2.44f

    .line 412
    .line 413
    .line 414
    const v15, 0x3fe147ae    # 1.76f

    .line 415
    .line 416
    .line 417
    const v16, 0x408f0a3d    # 4.47f

    .line 418
    .line 419
    .line 420
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v17, 0x41400000    # 12.0f

    .line 424
    .line 425
    const/high16 v18, 0x41a80000    # 21.0f

    .line 426
    .line 427
    const v13, 0x40d051ec    # 6.51f

    .line 428
    .line 429
    .line 430
    const v14, 0x419651ec    # 18.79f

    .line 431
    .line 432
    .line 433
    const v15, 0x410fd70a    # 8.99f

    .line 434
    .line 435
    .line 436
    const/high16 v16, 0x41a80000    # 21.0f

    .line 437
    .line 438
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v0, 0x40d0f5c3    # 6.53f

    .line 442
    .line 443
    .line 444
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v17, 0x41a6e148    # 20.86f

    .line 448
    .line 449
    .line 450
    const v18, 0x416f851f    # 14.97f

    .line 451
    .line 452
    .line 453
    const v13, 0x41ad1eb8    # 21.64f

    .line 454
    .line 455
    .line 456
    const/high16 v14, 0x41a80000    # 21.0f

    .line 457
    .line 458
    const v15, 0x41b9d70a    # 23.23f

    .line 459
    .line 460
    .line 461
    const v16, 0x4188e148    # 17.11f

    .line 462
    .line 463
    .line 464
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v0, 0x41943d71    # 18.53f

    .line 471
    .line 472
    .line 473
    const/high16 v2, 0x41980000    # 19.0f

    .line 474
    .line 475
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const/high16 v0, 0x41400000    # 12.0f

    .line 479
    .line 480
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v17, -0x3fb8f5c3    # -3.11f

    .line 484
    .line 485
    .line 486
    const v18, -0x40428f5c    # -1.48f

    .line 487
    .line 488
    .line 489
    const v13, -0x40651eb8    # -1.21f

    .line 490
    .line 491
    .line 492
    const/4 v14, 0x0

    .line 493
    const v15, -0x3fea3d71    # -2.34f

    .line 494
    .line 495
    .line 496
    const v16, -0x40f5c28f    # -0.54f

    .line 497
    .line 498
    .line 499
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const v17, -0x40b33333    # -0.8f

    .line 503
    .line 504
    .line 505
    const v18, -0x3fa5c28f    # -3.41f

    .line 506
    .line 507
    .line 508
    const v13, -0x40b851ec    # -0.78f

    .line 509
    .line 510
    .line 511
    const v14, -0x408ccccd    # -0.95f

    .line 512
    .line 513
    .line 514
    const v15, -0x407851ec    # -1.06f

    .line 515
    .line 516
    .line 517
    const v16, -0x3ff5c28f    # -2.16f

    .line 518
    .line 519
    .line 520
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const v17, 0x403f5c29    # 2.99f

    .line 524
    .line 525
    .line 526
    const v18, -0x3fbf5c29    # -3.01f

    .line 527
    .line 528
    .line 529
    const v13, 0x3e9eb852    # 0.31f

    .line 530
    .line 531
    .line 532
    const v14, -0x40428f5c    # -1.48f

    .line 533
    .line 534
    .line 535
    const v15, 0x3fc147ae    # 1.51f

    .line 536
    .line 537
    .line 538
    const v16, -0x3fd3d70a    # -2.69f

    .line 539
    .line 540
    .line 541
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const v17, 0x3f2b851f    # 0.67f

    .line 545
    .line 546
    .line 547
    const v18, -0x4270a3d7    # -0.07f

    .line 548
    .line 549
    .line 550
    const v13, 0x3e6147ae    # 0.22f

    .line 551
    .line 552
    .line 553
    const v14, -0x42b33333    # -0.05f

    .line 554
    .line 555
    .line 556
    const v15, 0x3ee66666    # 0.45f

    .line 557
    .line 558
    .line 559
    const v16, -0x428a3d71    # -0.06f

    .line 560
    .line 561
    .line 562
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const/high16 v17, 0x41300000    # 11.0f

    .line 566
    .line 567
    const/high16 v18, 0x41580000    # 13.5f

    .line 568
    .line 569
    const v13, 0x41347ae1    # 11.28f

    .line 570
    .line 571
    .line 572
    const v14, 0x413bd70a    # 11.74f

    .line 573
    .line 574
    .line 575
    const/high16 v15, 0x41300000    # 11.0f

    .line 576
    .line 577
    const v16, 0x414947ae    # 12.58f

    .line 578
    .line 579
    .line 580
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const v17, 0x3fa8f5c3    # 1.32f

    .line 584
    .line 585
    .line 586
    const v18, 0x404b851f    # 3.18f

    .line 587
    .line 588
    .line 589
    const/4 v13, 0x0

    .line 590
    const v14, 0x3f9eb852    # 1.24f

    .line 591
    .line 592
    .line 593
    const/high16 v15, 0x3f000000    # 0.5f

    .line 594
    .line 595
    const v16, 0x4017ae14    # 2.37f

    .line 596
    .line 597
    .line 598
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    const v0, 0x3fb47ae1    # 1.41f

    .line 602
    .line 603
    .line 604
    const v2, -0x404b851f    # -1.41f

    .line 605
    .line 606
    .line 607
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const/high16 v17, 0x41500000    # 13.0f

    .line 611
    .line 612
    const/high16 v18, 0x41580000    # 13.5f

    .line 613
    .line 614
    const v13, 0x41547ae1    # 13.28f

    .line 615
    .line 616
    .line 617
    const v14, 0x416d1eb8    # 14.82f

    .line 618
    .line 619
    .line 620
    const/high16 v15, 0x41500000    # 13.0f

    .line 621
    .line 622
    const v16, 0x41630a3d    # 14.19f

    .line 623
    .line 624
    .line 625
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const/high16 v17, 0x40200000    # 2.5f

    .line 629
    .line 630
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 631
    .line 632
    const/4 v13, 0x0

    .line 633
    const v14, -0x404a3d71    # -1.42f

    .line 634
    .line 635
    .line 636
    const v15, 0x3f99999a    # 1.2f

    .line 637
    .line 638
    .line 639
    const/high16 v16, -0x3fe00000    # -2.5f

    .line 640
    .line 641
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const/high16 v18, 0x40200000    # 2.5f

    .line 645
    .line 646
    const v13, 0x3fb0a3d7    # 1.38f

    .line 647
    .line 648
    .line 649
    const/4 v14, 0x0

    .line 650
    const/high16 v15, 0x40200000    # 2.5f

    .line 651
    .line 652
    const v16, 0x3f8f5c29    # 1.12f

    .line 653
    .line 654
    .line 655
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const v17, -0x414ccccd    # -0.35f

    .line 659
    .line 660
    .line 661
    const/high16 v18, 0x3fa00000    # 1.25f

    .line 662
    .line 663
    const/4 v13, 0x0

    .line 664
    const v14, 0x3eeb851f    # 0.46f

    .line 665
    .line 666
    .line 667
    const v15, -0x41fae148    # -0.13f

    .line 668
    .line 669
    .line 670
    const v16, 0x3f6147ae    # 0.88f

    .line 671
    .line 672
    .line 673
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const v0, 0x3fef5c29    # 1.87f

    .line 677
    .line 678
    .line 679
    const v2, 0x3fd9999a    # 1.7f

    .line 680
    .line 681
    .line 682
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 683
    .line 684
    .line 685
    const v17, 0x3ef5c28f    # 0.48f

    .line 686
    .line 687
    .line 688
    const v18, 0x3f8b851f    # 1.09f

    .line 689
    .line 690
    .line 691
    const v13, 0x3e9eb852    # 0.31f

    .line 692
    .line 693
    .line 694
    const v14, 0x3e8f5c29    # 0.28f

    .line 695
    .line 696
    .line 697
    const v15, 0x3ef5c28f    # 0.48f

    .line 698
    .line 699
    .line 700
    const v16, 0x3f2b851f    # 0.67f

    .line 701
    .line 702
    .line 703
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    const v17, 0x41943d71    # 18.53f

    .line 707
    .line 708
    .line 709
    const/high16 v18, 0x41980000    # 19.0f

    .line 710
    .line 711
    const/high16 v13, 0x41a00000    # 20.0f

    .line 712
    .line 713
    const v14, 0x4192b852    # 18.34f

    .line 714
    .line 715
    .line 716
    const v15, 0x419ab852    # 19.34f

    .line 717
    .line 718
    .line 719
    const/high16 v16, 0x41980000    # 19.0f

    .line 720
    .line 721
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 722
    .line 723
    .line 724
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 728
    .line 729
    .line 730
    move-result-object v2

    .line 731
    const/16 v16, 0x3800

    .line 732
    .line 733
    const/16 v17, 0x0

    .line 734
    .line 735
    const/high16 v6, 0x3f800000    # 1.0f

    .line 736
    .line 737
    const/4 v7, 0x0

    .line 738
    const/high16 v12, 0x3f800000    # 1.0f

    .line 739
    .line 740
    const/4 v13, 0x0

    .line 741
    const/4 v14, 0x0

    .line 742
    const/4 v15, 0x0

    .line 743
    const-string v4, ""

    .line 744
    .line 745
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 746
    .line 747
    .line 748
    move-result-object v0

    .line 749
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 750
    .line 751
    .line 752
    move-result-object v0

    .line 753
    sput-object v0, Landroidx/compose/material/icons/outlined/PestControlRodentKt;->_pestControlRodent:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 754
    .line 755
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 756
    .line 757
    .line 758
    return-object v0
.end method
