.class public final Landroidx/compose/material/icons/twotone/AttachMoneyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_attachMoney",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "AttachMoney",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getAttachMoney",
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
        "SMAP\nAttachMoney.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttachMoney.kt\nandroidx/compose/material/icons/twotone/AttachMoneyKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,59:1\n212#2,12:60\n233#2,18:73\n253#2:110\n174#3:72\n705#4,2:91\n717#4,2:93\n719#4,11:99\n72#5,4:95\n*S KotlinDebug\n*F\n+ 1 AttachMoney.kt\nandroidx/compose/material/icons/twotone/AttachMoneyKt\n*L\n29#1:60,12\n30#1:73,18\n30#1:110\n29#1:72\n30#1:91,2\n30#1:93,2\n30#1:99,11\n30#1:95,4\n*E\n"
    }
.end annotation


# static fields
.field private static _attachMoney:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAttachMoney(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/AttachMoneyKt;->_attachMoney:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.AttachMoney"

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
    const/high16 v0, 0x41380000    # 11.5f

    .line 71
    .line 72
    const v2, 0x4188cccd    # 17.1f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v17, -0x3fc147ae    # -2.98f

    .line 79
    .line 80
    .line 81
    const v18, -0x3ff9999a    # -2.1f

    .line 82
    .line 83
    .line 84
    const v13, -0x3ffc28f6    # -2.06f

    .line 85
    .line 86
    .line 87
    const/4 v14, 0x0

    .line 88
    const v15, -0x3fc851ec    # -2.87f

    .line 89
    .line 90
    .line 91
    const v16, -0x40947ae1    # -0.92f

    .line 92
    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v0, -0x3ff33333    # -2.2f

    .line 98
    .line 99
    .line 100
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const v17, 0x406b851f    # 3.68f

    .line 104
    .line 105
    .line 106
    const v18, 0x40751eb8    # 3.83f

    .line 107
    .line 108
    .line 109
    const v13, 0x3df5c28f    # 0.12f

    .line 110
    .line 111
    .line 112
    const v14, 0x400c28f6    # 2.19f

    .line 113
    .line 114
    .line 115
    const v15, 0x3fe147ae    # 1.76f

    .line 116
    .line 117
    .line 118
    const v16, 0x405ae148    # 3.42f

    .line 119
    .line 120
    .line 121
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v0, 0x41a80000    # 21.0f

    .line 125
    .line 126
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v0, 0x40400000    # 3.0f

    .line 130
    .line 131
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v0, -0x3ff66666    # -2.15f

    .line 135
    .line 136
    .line 137
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v17, 0x40600000    # 3.5f

    .line 141
    .line 142
    const v18, -0x3f9ccccd    # -3.55f

    .line 143
    .line 144
    .line 145
    const v13, 0x3ff9999a    # 1.95f

    .line 146
    .line 147
    .line 148
    const v14, -0x41428f5c    # -0.37f

    .line 149
    .line 150
    .line 151
    const/high16 v15, 0x40600000    # 3.5f

    .line 152
    .line 153
    const/high16 v16, -0x40400000    # -1.5f

    .line 154
    .line 155
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v17, -0x3f69999a    # -4.7f

    .line 159
    .line 160
    .line 161
    const v18, -0x3f733333    # -4.4f

    .line 162
    .line 163
    .line 164
    const/4 v13, 0x0

    .line 165
    const v14, -0x3fca3d71    # -2.84f

    .line 166
    .line 167
    .line 168
    const v15, -0x3fe47ae1    # -2.43f

    .line 169
    .line 170
    .line 171
    const v16, -0x3f8c28f6    # -3.81f

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 178
    .line 179
    const v18, -0x3ff66666    # -2.15f

    .line 180
    .line 181
    .line 182
    const v13, -0x3feeb852    # -2.27f

    .line 183
    .line 184
    .line 185
    const v14, -0x40e8f5c3    # -0.59f

    .line 186
    .line 187
    .line 188
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 189
    .line 190
    const v16, -0x40666666    # -1.2f

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v17, 0x402ccccd    # 2.7f

    .line 197
    .line 198
    .line 199
    const v18, -0x40133333    # -1.85f

    .line 200
    .line 201
    .line 202
    const/4 v13, 0x0

    .line 203
    const v14, -0x40747ae1    # -1.09f

    .line 204
    .line 205
    .line 206
    const v15, 0x3f8147ae    # 1.01f

    .line 207
    .line 208
    .line 209
    const v16, -0x40133333    # -1.85f

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v17, 0x40200000    # 2.5f

    .line 216
    .line 217
    const v18, 0x40066666    # 2.1f

    .line 218
    .line 219
    .line 220
    const v13, 0x3fe3d70a    # 1.78f

    .line 221
    .line 222
    .line 223
    const/4 v14, 0x0

    .line 224
    const v15, 0x401c28f6    # 2.44f

    .line 225
    .line 226
    .line 227
    const v16, 0x3f59999a    # 0.85f

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v0, 0x400d70a4    # 2.21f

    .line 234
    .line 235
    .line 236
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v17, -0x3fb28f5c    # -3.21f

    .line 240
    .line 241
    .line 242
    const v18, -0x3f8c28f6    # -3.81f

    .line 243
    .line 244
    .line 245
    const v13, -0x4270a3d7    # -0.07f

    .line 246
    .line 247
    .line 248
    const v14, -0x4023d70a    # -1.72f

    .line 249
    .line 250
    .line 251
    const v15, -0x4070a3d7    # -1.12f

    .line 252
    .line 253
    .line 254
    const v16, -0x3faccccd    # -3.3f

    .line 255
    .line 256
    .line 257
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v0, 0x40400000    # 3.0f

    .line 261
    .line 262
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 266
    .line 267
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v0, 0x400a3d71    # 2.16f

    .line 271
    .line 272
    .line 273
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/high16 v17, -0x3fa00000    # -3.5f

    .line 277
    .line 278
    const v18, 0x40670a3d    # 3.61f

    .line 279
    .line 280
    .line 281
    const v13, -0x4007ae14    # -1.94f

    .line 282
    .line 283
    .line 284
    const v14, 0x3ed70a3d    # 0.42f

    .line 285
    .line 286
    .line 287
    const/high16 v15, -0x3fa00000    # -3.5f

    .line 288
    .line 289
    const v16, 0x3fd70a3d    # 1.68f

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v17, 0x40966666    # 4.7f

    .line 296
    .line 297
    .line 298
    const v18, 0x408428f6    # 4.13f

    .line 299
    .line 300
    .line 301
    const/4 v13, 0x0

    .line 302
    const v14, 0x4013d70a    # 2.31f

    .line 303
    .line 304
    .line 305
    const v15, 0x3ff47ae1    # 1.91f

    .line 306
    .line 307
    .line 308
    const v16, 0x405d70a4    # 3.46f

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const/high16 v17, 0x40400000    # 3.0f

    .line 315
    .line 316
    const v18, 0x401a3d71    # 2.41f

    .line 317
    .line 318
    .line 319
    const/high16 v13, 0x40200000    # 2.5f

    .line 320
    .line 321
    const v14, 0x3f19999a    # 0.6f

    .line 322
    .line 323
    .line 324
    const/high16 v15, 0x40400000    # 3.0f

    .line 325
    .line 326
    const v16, 0x3fbd70a4    # 1.48f

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v17, -0x3fd33333    # -2.7f

    .line 333
    .line 334
    .line 335
    const v18, 0x3fe51eb8    # 1.79f

    .line 336
    .line 337
    .line 338
    const/4 v13, 0x0

    .line 339
    const v14, 0x3f30a3d7    # 0.69f

    .line 340
    .line 341
    .line 342
    const v15, -0x41051eb8    # -0.49f

    .line 343
    .line 344
    .line 345
    const v16, 0x3fe51eb8    # 1.79f

    .line 346
    .line 347
    .line 348
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 355
    .line 356
    .line 357
    move-result-object v2

    .line 358
    const/16 v16, 0x3800

    .line 359
    .line 360
    const/16 v17, 0x0

    .line 361
    .line 362
    const/high16 v6, 0x3f800000    # 1.0f

    .line 363
    .line 364
    const/high16 v8, 0x3f800000    # 1.0f

    .line 365
    .line 366
    const/4 v7, 0x0

    .line 367
    const/high16 v9, 0x3f800000    # 1.0f

    .line 368
    .line 369
    const/high16 v12, 0x3f800000    # 1.0f

    .line 370
    .line 371
    const/4 v14, 0x0

    .line 372
    const/4 v15, 0x0

    .line 373
    const-string v4, ""

    .line 374
    .line 375
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    sput-object v0, Landroidx/compose/material/icons/twotone/AttachMoneyKt;->_attachMoney:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 384
    .line 385
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    return-object v0
.end method
