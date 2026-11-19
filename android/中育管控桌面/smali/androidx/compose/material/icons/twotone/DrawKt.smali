.class public final Landroidx/compose/material/icons/twotone/DrawKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_draw",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Draw",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getDraw",
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
        "SMAP\nDraw.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draw.kt\nandroidx/compose/material/icons/twotone/DrawKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,92:1\n212#2,12:93\n233#2,18:106\n253#2:143\n233#2,18:144\n253#2:181\n174#3:105\n705#4,2:124\n717#4,2:126\n719#4,11:132\n705#4,2:162\n717#4,2:164\n719#4,11:170\n72#5,4:128\n72#5,4:166\n*S KotlinDebug\n*F\n+ 1 Draw.kt\nandroidx/compose/material/icons/twotone/DrawKt\n*L\n29#1:93,12\n30#1:106,18\n30#1:143\n38#1:144,18\n38#1:181\n29#1:105\n30#1:124,2\n30#1:126,2\n30#1:132,11\n38#1:162,2\n38#1:164,2\n38#1:170,11\n30#1:128,4\n38#1:166,4\n*E\n"
    }
.end annotation


# static fields
.field private static _draw:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDraw(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 20

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/DrawKt;->_draw:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Draw"

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
    const v4, 0x413cf5c3    # 11.81f

    .line 71
    .line 72
    .line 73
    const v6, 0x4169c28f    # 14.61f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, -0x3f19999a    # -7.2f

    .line 80
    .line 81
    .line 82
    const v6, 0x40e6147b    # 7.19f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/4 v4, 0x0

    .line 89
    const v6, -0x404b851f    # -1.41f

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v4, -0x3f19999a    # -7.2f

    .line 99
    .line 100
    .line 101
    const v6, 0x40e6147b    # 7.19f

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    const/16 v16, 0x3800

    .line 115
    .line 116
    const/16 v17, 0x0

    .line 117
    .line 118
    const v6, 0x3e99999a    # 0.3f

    .line 119
    .line 120
    .line 121
    const v8, 0x3e99999a    # 0.3f

    .line 122
    .line 123
    .line 124
    const/4 v7, 0x0

    .line 125
    const/high16 v9, 0x3f800000    # 1.0f

    .line 126
    .line 127
    const/high16 v12, 0x3f800000    # 1.0f

    .line 128
    .line 129
    const/4 v13, 0x0

    .line 130
    const/4 v14, 0x0

    .line 131
    const/4 v15, 0x0

    .line 132
    const-string v4, ""

    .line 133
    .line 134
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 135
    .line 136
    .line 137
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 142
    .line 143
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 144
    .line 145
    .line 146
    move-result-wide v6

    .line 147
    const/4 v0, 0x0

    .line 148
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 152
    .line 153
    .line 154
    move-result v10

    .line 155
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 156
    .line 157
    .line 158
    move-result v11

    .line 159
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 162
    .line 163
    .line 164
    const v0, 0x41263d71    # 10.39f

    .line 165
    .line 166
    .line 167
    const v2, 0x4196cccd    # 18.85f

    .line 168
    .line 169
    .line 170
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v0, -0x407851ec    # -1.06f

    .line 174
    .line 175
    .line 176
    const v2, 0x3f87ae14    # 1.06f

    .line 177
    .line 178
    .line 179
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/16 v17, 0x0

    .line 183
    .line 184
    const v18, -0x3fcae148    # -2.83f

    .line 185
    .line 186
    .line 187
    const v13, 0x3f47ae14    # 0.78f

    .line 188
    .line 189
    .line 190
    const v14, -0x40b851ec    # -0.78f

    .line 191
    .line 192
    .line 193
    const v15, 0x3f47ae14    # 0.78f

    .line 194
    .line 195
    .line 196
    const v16, -0x3ffccccd    # -2.05f

    .line 197
    .line 198
    .line 199
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v0, 0x41940000    # 18.5f

    .line 203
    .line 204
    const v2, 0x40a2e148    # 5.09f

    .line 205
    .line 206
    .line 207
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v17, -0x3fcae148    # -2.83f

    .line 211
    .line 212
    .line 213
    const/16 v18, 0x0

    .line 214
    .line 215
    const v13, -0x40b851ec    # -0.78f

    .line 216
    .line 217
    .line 218
    const v15, -0x3ffccccd    # -2.05f

    .line 219
    .line 220
    .line 221
    const v16, -0x40b851ec    # -0.78f

    .line 222
    .line 223
    .line 224
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v0, -0x407851ec    # -1.06f

    .line 228
    .line 229
    .line 230
    const v2, 0x3f87ae14    # 1.06f

    .line 231
    .line 232
    .line 233
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v0, 0x41263d71    # 10.39f

    .line 237
    .line 238
    .line 239
    const v2, 0x4196cccd    # 18.85f

    .line 240
    .line 241
    .line 242
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v0, 0x413cf5c3    # 11.81f

    .line 249
    .line 250
    .line 251
    const v2, 0x4169c28f    # 14.61f

    .line 252
    .line 253
    .line 254
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v0, 0x40ed1eb8    # 7.41f

    .line 258
    .line 259
    .line 260
    const/high16 v2, 0x41980000    # 19.0f

    .line 261
    .line 262
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v0, 0x40c00000    # 6.0f

    .line 266
    .line 267
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v0, -0x404b851f    # -1.41f

    .line 271
    .line 272
    .line 273
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v0, -0x3f19eb85    # -7.19f

    .line 277
    .line 278
    .line 279
    const v2, 0x40e6147b    # 7.19f

    .line 280
    .line 281
    .line 282
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v0, 0x413cf5c3    # 11.81f

    .line 286
    .line 287
    .line 288
    const v2, 0x4169c28f    # 14.61f

    .line 289
    .line 290
    .line 291
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v0, 0x40f1eb85    # 7.56f

    .line 298
    .line 299
    .line 300
    const v2, 0x41530a3d    # 13.19f

    .line 301
    .line 302
    .line 303
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const/high16 v0, 0x40800000    # 4.0f

    .line 307
    .line 308
    const v2, 0x4186147b    # 16.76f

    .line 309
    .line 310
    .line 311
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const/high16 v0, 0x41a80000    # 21.0f

    .line 315
    .line 316
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v0, 0x4087ae14    # 4.24f

    .line 320
    .line 321
    .line 322
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const v0, 0x41130a3d    # 9.19f

    .line 326
    .line 327
    .line 328
    const v2, -0x3eecf5c3    # -9.19f

    .line 329
    .line 330
    .line 331
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v0, 0x40f1eb85    # 7.56f

    .line 335
    .line 336
    .line 337
    const v2, 0x41530a3d    # 13.19f

    .line 338
    .line 339
    .line 340
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v0, 0x418c0000    # 17.5f

    .line 350
    .line 351
    const/high16 v2, 0x41980000    # 19.0f

    .line 352
    .line 353
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/high16 v17, -0x3f600000    # -5.0f

    .line 357
    .line 358
    const/high16 v18, 0x40600000    # 3.5f

    .line 359
    .line 360
    const/4 v13, 0x0

    .line 361
    const v14, 0x400c28f6    # 2.19f

    .line 362
    .line 363
    .line 364
    const v15, -0x3fdd70a4    # -2.54f

    .line 365
    .line 366
    .line 367
    const/high16 v16, 0x40600000    # 3.5f

    .line 368
    .line 369
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const/high16 v17, -0x40800000    # -1.0f

    .line 373
    .line 374
    const/high16 v18, -0x40800000    # -1.0f

    .line 375
    .line 376
    const v13, -0x40f33333    # -0.55f

    .line 377
    .line 378
    .line 379
    const/4 v14, 0x0

    .line 380
    const/high16 v15, -0x40800000    # -1.0f

    .line 381
    .line 382
    const v16, -0x4119999a    # -0.45f

    .line 383
    .line 384
    .line 385
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v0, 0x3ee66666    # 0.45f

    .line 389
    .line 390
    .line 391
    const/high16 v2, 0x3f800000    # 1.0f

    .line 392
    .line 393
    const/high16 v4, -0x40800000    # -1.0f

    .line 394
    .line 395
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const/high16 v17, 0x40400000    # 3.0f

    .line 399
    .line 400
    const/high16 v18, -0x40400000    # -1.5f

    .line 401
    .line 402
    const v13, 0x3fc51eb8    # 1.54f

    .line 403
    .line 404
    .line 405
    const/high16 v15, 0x40400000    # 3.0f

    .line 406
    .line 407
    const v16, -0x40c51eb8    # -0.73f

    .line 408
    .line 409
    .line 410
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v17, -0x40628f5c    # -1.23f

    .line 414
    .line 415
    .line 416
    const v18, -0x40666666    # -1.2f

    .line 417
    .line 418
    .line 419
    const/4 v13, 0x0

    .line 420
    const v14, -0x410f5c29    # -0.47f

    .line 421
    .line 422
    .line 423
    const v15, -0x410a3d71    # -0.48f

    .line 424
    .line 425
    .line 426
    const v16, -0x40a147ae    # -0.87f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v0, 0x3fbd70a4    # 1.48f

    .line 433
    .line 434
    .line 435
    const v2, -0x40428f5c    # -1.48f

    .line 436
    .line 437
    .line 438
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v17, 0x41980000    # 19.0f

    .line 442
    .line 443
    const/high16 v18, 0x418c0000    # 17.5f

    .line 444
    .line 445
    const v13, 0x41928f5c    # 18.32f

    .line 446
    .line 447
    .line 448
    const v14, 0x41773333    # 15.45f

    .line 449
    .line 450
    .line 451
    const/high16 v15, 0x41980000    # 19.0f

    .line 452
    .line 453
    const v16, 0x418251ec    # 16.29f

    .line 454
    .line 455
    .line 456
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const v0, 0x4155999a    # 13.35f

    .line 463
    .line 464
    .line 465
    const v2, 0x40928f5c    # 4.58f

    .line 466
    .line 467
    .line 468
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const/high16 v17, 0x40400000    # 3.0f

    .line 472
    .line 473
    const/high16 v18, 0x41300000    # 11.0f

    .line 474
    .line 475
    const v13, 0x40670a3d    # 3.61f

    .line 476
    .line 477
    .line 478
    const v14, 0x414ca3d7    # 12.79f

    .line 479
    .line 480
    .line 481
    const/high16 v15, 0x40400000    # 3.0f

    .line 482
    .line 483
    const v16, 0x4140f5c3    # 12.06f

    .line 484
    .line 485
    .line 486
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const v17, 0x4063d70a    # 3.56f

    .line 490
    .line 491
    .line 492
    const v18, -0x3fa8f5c3    # -3.36f

    .line 493
    .line 494
    .line 495
    const/4 v13, 0x0

    .line 496
    const v14, -0x4019999a    # -1.8f

    .line 497
    .line 498
    .line 499
    const v15, 0x3ff1eb85    # 1.89f

    .line 500
    .line 501
    .line 502
    const v16, -0x3fd7ae14    # -2.63f

    .line 503
    .line 504
    .line 505
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const/high16 v17, 0x41100000    # 9.0f

    .line 509
    .line 510
    const/high16 v18, 0x40c00000    # 6.0f

    .line 511
    .line 512
    const v13, 0x40f2e148    # 7.59f

    .line 513
    .line 514
    .line 515
    const v14, 0x40e5c28f    # 7.18f

    .line 516
    .line 517
    .line 518
    const/high16 v15, 0x41100000    # 9.0f

    .line 519
    .line 520
    const v16, 0x40d1eb85    # 6.56f

    .line 521
    .line 522
    .line 523
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const/high16 v17, -0x40000000    # -2.0f

    .line 527
    .line 528
    const/high16 v18, -0x40800000    # -1.0f

    .line 529
    .line 530
    const/4 v13, 0x0

    .line 531
    const v14, -0x412e147b    # -0.41f

    .line 532
    .line 533
    .line 534
    const v15, -0x40b851ec    # -0.78f

    .line 535
    .line 536
    .line 537
    const/high16 v16, -0x40800000    # -1.0f

    .line 538
    .line 539
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const v17, 0x40a570a4    # 5.17f

    .line 543
    .line 544
    .line 545
    const v18, 0x40b47ae1    # 5.64f

    .line 546
    .line 547
    .line 548
    const v13, 0x40b7ae14    # 5.74f

    .line 549
    .line 550
    .line 551
    const/high16 v14, 0x40a00000    # 5.0f

    .line 552
    .line 553
    const v15, 0x40a66666    # 5.2f

    .line 554
    .line 555
    .line 556
    const v16, 0x40b3851f    # 5.61f

    .line 557
    .line 558
    .line 559
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const v17, 0x407147ae    # 3.77f

    .line 563
    .line 564
    .line 565
    const v18, 0x40b851ec    # 5.76f

    .line 566
    .line 567
    .line 568
    const v13, 0x409a3d71    # 4.82f

    .line 569
    .line 570
    .line 571
    const v14, 0x40c1999a    # 6.05f

    .line 572
    .line 573
    .line 574
    const v15, 0x4086147b    # 4.19f

    .line 575
    .line 576
    .line 577
    const v16, 0x40c33333    # 6.1f

    .line 578
    .line 579
    .line 580
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const v17, 0x4067ae14    # 3.62f

    .line 584
    .line 585
    .line 586
    const v18, 0x408c28f6    # 4.38f

    .line 587
    .line 588
    .line 589
    const v13, 0x40570a3d    # 3.36f

    .line 590
    .line 591
    .line 592
    const v14, 0x40ad70a4    # 5.42f

    .line 593
    .line 594
    .line 595
    const v15, 0x4051eb85    # 3.28f

    .line 596
    .line 597
    .line 598
    const v16, 0x4099eb85    # 4.81f

    .line 599
    .line 600
    .line 601
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const/high16 v17, 0x40e00000    # 7.0f

    .line 605
    .line 606
    const/high16 v18, 0x40400000    # 3.0f

    .line 607
    .line 608
    const v13, 0x406eb852    # 3.73f

    .line 609
    .line 610
    .line 611
    const v14, 0x4087ae14    # 4.24f

    .line 612
    .line 613
    .line 614
    const v15, 0x409851ec    # 4.76f

    .line 615
    .line 616
    .line 617
    const/high16 v16, 0x40400000    # 3.0f

    .line 618
    .line 619
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const/high16 v17, 0x40800000    # 4.0f

    .line 623
    .line 624
    const v13, 0x400f5c29    # 2.24f

    .line 625
    .line 626
    .line 627
    const/4 v14, 0x0

    .line 628
    const/high16 v15, 0x40800000    # 4.0f

    .line 629
    .line 630
    const v16, 0x3fa8f5c3    # 1.32f

    .line 631
    .line 632
    .line 633
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const v17, -0x3f970a3d    # -3.64f

    .line 637
    .line 638
    .line 639
    const v18, 0x405e147b    # 3.47f

    .line 640
    .line 641
    .line 642
    const/4 v13, 0x0

    .line 643
    const v14, 0x3fef5c29    # 1.87f

    .line 644
    .line 645
    .line 646
    const v15, -0x4008f5c3    # -1.93f

    .line 647
    .line 648
    .line 649
    const v16, 0x402e147b    # 2.72f

    .line 650
    .line 651
    .line 652
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const/high16 v17, 0x40a00000    # 5.0f

    .line 656
    .line 657
    const/high16 v18, 0x41300000    # 11.0f

    .line 658
    .line 659
    const v13, 0x40cd70a4    # 6.42f

    .line 660
    .line 661
    .line 662
    const v14, 0x411e147b    # 9.88f

    .line 663
    .line 664
    .line 665
    const/high16 v15, 0x40a00000    # 5.0f

    .line 666
    .line 667
    const/high16 v16, 0x41280000    # 10.5f

    .line 668
    .line 669
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    .line 672
    const v17, 0x3f88f5c3    # 1.07f

    .line 673
    .line 674
    .line 675
    const v18, 0x3f5c28f6    # 0.86f

    .line 676
    .line 677
    .line 678
    const/4 v13, 0x0

    .line 679
    const v14, 0x3e9eb852    # 0.31f

    .line 680
    .line 681
    .line 682
    const v15, 0x3edc28f6    # 0.43f

    .line 683
    .line 684
    .line 685
    const v16, 0x3f19999a    # 0.6f

    .line 686
    .line 687
    .line 688
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 692
    .line 693
    .line 694
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 698
    .line 699
    .line 700
    move-result-object v2

    .line 701
    const/16 v16, 0x3800

    .line 702
    .line 703
    const/16 v17, 0x0

    .line 704
    .line 705
    const/high16 v6, 0x3f800000    # 1.0f

    .line 706
    .line 707
    const/high16 v8, 0x3f800000    # 1.0f

    .line 708
    .line 709
    const/4 v7, 0x0

    .line 710
    const/high16 v12, 0x3f800000    # 1.0f

    .line 711
    .line 712
    const/4 v14, 0x0

    .line 713
    const/4 v15, 0x0

    .line 714
    const-string v4, ""

    .line 715
    .line 716
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 717
    .line 718
    .line 719
    move-result-object v0

    .line 720
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 721
    .line 722
    .line 723
    move-result-object v0

    .line 724
    sput-object v0, Landroidx/compose/material/icons/twotone/DrawKt;->_draw:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 725
    .line 726
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 727
    .line 728
    .line 729
    return-object v0
.end method
