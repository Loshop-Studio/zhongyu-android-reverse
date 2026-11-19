.class public final Landroidx/compose/material/icons/filled/CopyrightKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_copyright",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Copyright",
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getCopyright",
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
        "SMAP\nCopyright.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Copyright.kt\nandroidx/compose/material/icons/filled/CopyrightKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,61:1\n212#2,12:62\n233#2,18:75\n253#2:112\n174#3:74\n705#4,2:93\n717#4,2:95\n719#4,11:101\n72#5,4:97\n*S KotlinDebug\n*F\n+ 1 Copyright.kt\nandroidx/compose/material/icons/filled/CopyrightKt\n*L\n29#1:62,12\n30#1:75,18\n30#1:112\n29#1:74\n30#1:93,2\n30#1:95,2\n30#1:101,11\n30#1:97,4\n*E\n"
    }
.end annotation


# static fields
.field private static _copyright:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCopyright(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/CopyrightKt;->_copyright:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.Copyright"

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
    const/4 v0, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v0, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const v0, 0x413e147b    # 11.88f

    .line 71
    .line 72
    .line 73
    const v2, 0x41123d71    # 9.14f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, 0x3fd0a3d7    # 1.63f

    .line 80
    .line 81
    .line 82
    const v18, 0x3fd47ae1    # 1.66f

    .line 83
    .line 84
    .line 85
    const v13, 0x3fa3d70a    # 1.28f

    .line 86
    .line 87
    .line 88
    const v14, 0x3d75c28f    # 0.06f

    .line 89
    .line 90
    .line 91
    const v15, 0x3fce147b    # 1.61f

    .line 92
    .line 93
    .line 94
    const v16, 0x3f933333    # 1.15f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v0, 0x3fe51eb8    # 1.79f

    .line 101
    .line 102
    .line 103
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v17, -0x3fa33333    # -3.45f

    .line 107
    .line 108
    .line 109
    const v18, -0x3fb3d70a    # -3.19f

    .line 110
    .line 111
    .line 112
    const v13, -0x425c28f6    # -0.08f

    .line 113
    .line 114
    .line 115
    const v14, -0x40028f5c    # -1.98f

    .line 116
    .line 117
    .line 118
    const v15, -0x404147ae    # -1.49f

    .line 119
    .line 120
    .line 121
    const v16, -0x3fb3d70a    # -3.19f

    .line 122
    .line 123
    .line 124
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v17, 0x41000000    # 8.0f

    .line 128
    .line 129
    const v18, 0x41423d71    # 12.14f

    .line 130
    .line 131
    .line 132
    const v13, 0x411a3d71    # 9.64f

    .line 133
    .line 134
    .line 135
    const v14, 0x40f3851f    # 7.61f

    .line 136
    .line 137
    .line 138
    const/high16 v15, 0x41000000    # 8.0f

    .line 139
    .line 140
    const/high16 v16, 0x41100000    # 9.0f

    .line 141
    .line 142
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v17, 0x4075c28f    # 3.84f

    .line 146
    .line 147
    .line 148
    const v18, 0x4087ae14    # 4.24f

    .line 149
    .line 150
    .line 151
    const/4 v13, 0x0

    .line 152
    const v14, 0x3ff851ec    # 1.94f

    .line 153
    .line 154
    .line 155
    const v15, 0x3f6e147b    # 0.93f

    .line 156
    .line 157
    .line 158
    const v16, 0x4087ae14    # 4.24f

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v17, 0x405c28f6    # 3.44f

    .line 165
    .line 166
    .line 167
    const v18, -0x3fc33333    # -2.95f

    .line 168
    .line 169
    .line 170
    const v13, 0x400e147b    # 2.22f

    .line 171
    .line 172
    .line 173
    const/4 v14, 0x0

    .line 174
    const v15, 0x405a3d71    # 3.41f

    .line 175
    .line 176
    .line 177
    const v16, -0x402ccccd    # -1.65f

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v0, -0x401ae148    # -1.79f

    .line 184
    .line 185
    .line 186
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v17, -0x402f5c29    # -1.63f

    .line 190
    .line 191
    .line 192
    const v18, 0x3fb851ec    # 1.44f

    .line 193
    .line 194
    .line 195
    const v13, -0x430a3d71    # -0.03f

    .line 196
    .line 197
    .line 198
    const v14, 0x3f170a3d    # 0.59f

    .line 199
    .line 200
    .line 201
    const v15, -0x4119999a    # -0.45f

    .line 202
    .line 203
    .line 204
    const v16, 0x3fb0a3d7    # 1.38f

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v17, 0x41200000    # 10.0f

    .line 211
    .line 212
    const v18, 0x41423d71    # 12.14f

    .line 213
    .line 214
    .line 215
    const v13, 0x4128cccd    # 10.55f

    .line 216
    .line 217
    .line 218
    const v14, 0x416d47ae    # 14.83f

    .line 219
    .line 220
    .line 221
    const/high16 v15, 0x41200000    # 10.0f

    .line 222
    .line 223
    const v16, 0x415cf5c3    # 13.81f

    .line 224
    .line 225
    .line 226
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v17, 0x413e147b    # 11.88f

    .line 230
    .line 231
    .line 232
    const v18, 0x41123d71    # 9.14f

    .line 233
    .line 234
    .line 235
    const/high16 v13, 0x41200000    # 10.0f

    .line 236
    .line 237
    const/high16 v14, 0x41140000    # 9.25f

    .line 238
    .line 239
    const v15, 0x41347ae1    # 11.28f

    .line 240
    .line 241
    .line 242
    const v16, 0x41128f5c    # 9.16f

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v0, 0x40000000    # 2.0f

    .line 252
    .line 253
    const/high16 v2, 0x41400000    # 12.0f

    .line 254
    .line 255
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v17, 0x40000000    # 2.0f

    .line 259
    .line 260
    const/high16 v18, 0x41400000    # 12.0f

    .line 261
    .line 262
    const v13, 0x40cf5c29    # 6.48f

    .line 263
    .line 264
    .line 265
    const/high16 v14, 0x40000000    # 2.0f

    .line 266
    .line 267
    const/high16 v15, 0x40000000    # 2.0f

    .line 268
    .line 269
    const v16, 0x40cf5c29    # 6.48f

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v0, 0x408f5c29    # 4.48f

    .line 276
    .line 277
    .line 278
    const/high16 v2, 0x41200000    # 10.0f

    .line 279
    .line 280
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v0, -0x3f70a3d7    # -4.48f

    .line 284
    .line 285
    .line 286
    const/high16 v2, -0x3ee00000    # -10.0f

    .line 287
    .line 288
    const/high16 v4, 0x41200000    # 10.0f

    .line 289
    .line 290
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v0, 0x418c28f6    # 17.52f

    .line 294
    .line 295
    .line 296
    const/high16 v2, 0x40000000    # 2.0f

    .line 297
    .line 298
    const/high16 v4, 0x41400000    # 12.0f

    .line 299
    .line 300
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const/high16 v0, 0x41a00000    # 20.0f

    .line 307
    .line 308
    const/high16 v2, 0x41400000    # 12.0f

    .line 309
    .line 310
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/high16 v17, -0x3f000000    # -8.0f

    .line 314
    .line 315
    const/high16 v18, -0x3f000000    # -8.0f

    .line 316
    .line 317
    const v13, -0x3f72e148    # -4.41f

    .line 318
    .line 319
    .line 320
    const/4 v14, 0x0

    .line 321
    const/high16 v15, -0x3f000000    # -8.0f

    .line 322
    .line 323
    const v16, -0x3f9a3d71    # -3.59f

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const/high16 v0, -0x3f000000    # -8.0f

    .line 330
    .line 331
    const v2, 0x4065c28f    # 3.59f

    .line 332
    .line 333
    .line 334
    const/high16 v4, 0x41000000    # 8.0f

    .line 335
    .line 336
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v0, 0x4065c28f    # 3.59f

    .line 340
    .line 341
    .line 342
    const/high16 v2, 0x41000000    # 8.0f

    .line 343
    .line 344
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v0, 0x418347ae    # 16.41f

    .line 348
    .line 349
    .line 350
    const/high16 v2, 0x41a00000    # 20.0f

    .line 351
    .line 352
    const/high16 v4, 0x41400000    # 12.0f

    .line 353
    .line 354
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 361
    .line 362
    .line 363
    move-result-object v2

    .line 364
    const/16 v16, 0x3800

    .line 365
    .line 366
    const/16 v17, 0x0

    .line 367
    .line 368
    const/high16 v6, 0x3f800000    # 1.0f

    .line 369
    .line 370
    const/high16 v8, 0x3f800000    # 1.0f

    .line 371
    .line 372
    const/4 v7, 0x0

    .line 373
    const/high16 v9, 0x3f800000    # 1.0f

    .line 374
    .line 375
    const/high16 v12, 0x3f800000    # 1.0f

    .line 376
    .line 377
    const/4 v13, 0x0

    .line 378
    const/4 v15, 0x0

    .line 379
    const-string v4, ""

    .line 380
    .line 381
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    sput-object v0, Landroidx/compose/material/icons/filled/CopyrightKt;->_copyright:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 390
    .line 391
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 392
    .line 393
    .line 394
    return-object v0
.end method
