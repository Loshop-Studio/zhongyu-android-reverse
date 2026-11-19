.class public final Landroidx/compose/material/icons/filled/AttachMoneyKt;
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
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getAttachMoney",
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
        "SMAP\nAttachMoney.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttachMoney.kt\nandroidx/compose/material/icons/filled/AttachMoneyKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,59:1\n212#2,12:60\n233#2,18:73\n253#2:110\n174#3:72\n705#4,2:91\n717#4,2:93\n719#4,11:99\n72#5,4:95\n*S KotlinDebug\n*F\n+ 1 AttachMoney.kt\nandroidx/compose/material/icons/filled/AttachMoneyKt\n*L\n29#1:60,12\n30#1:73,18\n30#1:110\n29#1:72\n30#1:91,2\n30#1:93,2\n30#1:99,11\n30#1:95,4\n*E\n"
    }
.end annotation


# static fields
.field private static _attachMoney:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAttachMoney(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/AttachMoneyKt;->_attachMoney:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.AttachMoney"

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
    const v0, 0x413ccccd    # 11.8f

    .line 71
    .line 72
    .line 73
    const v2, 0x412e6666    # 10.9f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 80
    .line 81
    const v18, -0x3ff66666    # -2.15f

    .line 82
    .line 83
    .line 84
    const v13, -0x3feeb852    # -2.27f

    .line 85
    .line 86
    .line 87
    const v14, -0x40e8f5c3    # -0.59f

    .line 88
    .line 89
    .line 90
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 91
    .line 92
    const v16, -0x40666666    # -1.2f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v17, 0x402ccccd    # 2.7f

    .line 99
    .line 100
    .line 101
    const v18, -0x40133333    # -1.85f

    .line 102
    .line 103
    .line 104
    const/4 v13, 0x0

    .line 105
    const v14, -0x40747ae1    # -1.09f

    .line 106
    .line 107
    .line 108
    const v15, 0x3f8147ae    # 1.01f

    .line 109
    .line 110
    .line 111
    const v16, -0x40133333    # -1.85f

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v17, 0x40200000    # 2.5f

    .line 118
    .line 119
    const v18, 0x40066666    # 2.1f

    .line 120
    .line 121
    .line 122
    const v13, 0x3fe3d70a    # 1.78f

    .line 123
    .line 124
    .line 125
    const/4 v14, 0x0

    .line 126
    const v15, 0x401c28f6    # 2.44f

    .line 127
    .line 128
    .line 129
    const v16, 0x3f59999a    # 0.85f

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v0, 0x400d70a4    # 2.21f

    .line 136
    .line 137
    .line 138
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v17, -0x3fb28f5c    # -3.21f

    .line 142
    .line 143
    .line 144
    const v18, -0x3f8c28f6    # -3.81f

    .line 145
    .line 146
    .line 147
    const v13, -0x4270a3d7    # -0.07f

    .line 148
    .line 149
    .line 150
    const v14, -0x4023d70a    # -1.72f

    .line 151
    .line 152
    .line 153
    const v15, -0x4070a3d7    # -1.12f

    .line 154
    .line 155
    .line 156
    const v16, -0x3faccccd    # -3.3f

    .line 157
    .line 158
    .line 159
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v0, 0x40400000    # 3.0f

    .line 163
    .line 164
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 168
    .line 169
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v0, 0x400a3d71    # 2.16f

    .line 173
    .line 174
    .line 175
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const/high16 v17, -0x3fa00000    # -3.5f

    .line 179
    .line 180
    const v18, 0x40670a3d    # 3.61f

    .line 181
    .line 182
    .line 183
    const v13, -0x4007ae14    # -1.94f

    .line 184
    .line 185
    .line 186
    const v14, 0x3ed70a3d    # 0.42f

    .line 187
    .line 188
    .line 189
    const/high16 v15, -0x3fa00000    # -3.5f

    .line 190
    .line 191
    const v16, 0x3fd70a3d    # 1.68f

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v17, 0x40966666    # 4.7f

    .line 198
    .line 199
    .line 200
    const v18, 0x408428f6    # 4.13f

    .line 201
    .line 202
    .line 203
    const/4 v13, 0x0

    .line 204
    const v14, 0x4013d70a    # 2.31f

    .line 205
    .line 206
    .line 207
    const v15, 0x3ff47ae1    # 1.91f

    .line 208
    .line 209
    .line 210
    const v16, 0x405d70a4    # 3.46f

    .line 211
    .line 212
    .line 213
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v17, 0x40400000    # 3.0f

    .line 217
    .line 218
    const v18, 0x401a3d71    # 2.41f

    .line 219
    .line 220
    .line 221
    const/high16 v13, 0x40200000    # 2.5f

    .line 222
    .line 223
    const v14, 0x3f19999a    # 0.6f

    .line 224
    .line 225
    .line 226
    const/high16 v15, 0x40400000    # 3.0f

    .line 227
    .line 228
    const v16, 0x3fbd70a4    # 1.48f

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v17, -0x3fd33333    # -2.7f

    .line 235
    .line 236
    .line 237
    const v18, 0x3fe51eb8    # 1.79f

    .line 238
    .line 239
    .line 240
    const/4 v13, 0x0

    .line 241
    const v14, 0x3f30a3d7    # 0.69f

    .line 242
    .line 243
    .line 244
    const v15, -0x41051eb8    # -0.49f

    .line 245
    .line 246
    .line 247
    const v16, 0x3fe51eb8    # 1.79f

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v17, -0x3fc147ae    # -2.98f

    .line 254
    .line 255
    .line 256
    const v18, -0x3ff9999a    # -2.1f

    .line 257
    .line 258
    .line 259
    const v13, -0x3ffc28f6    # -2.06f

    .line 260
    .line 261
    .line 262
    const/4 v14, 0x0

    .line 263
    const v15, -0x3fc851ec    # -2.87f

    .line 264
    .line 265
    .line 266
    const v16, -0x40947ae1    # -0.92f

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v0, -0x3ff33333    # -2.2f

    .line 273
    .line 274
    .line 275
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v17, 0x406b851f    # 3.68f

    .line 279
    .line 280
    .line 281
    const v18, 0x40751eb8    # 3.83f

    .line 282
    .line 283
    .line 284
    const v13, 0x3df5c28f    # 0.12f

    .line 285
    .line 286
    .line 287
    const v14, 0x400c28f6    # 2.19f

    .line 288
    .line 289
    .line 290
    const v15, 0x3fe147ae    # 1.76f

    .line 291
    .line 292
    .line 293
    const v16, 0x405ae148    # 3.42f

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const/high16 v0, 0x41a80000    # 21.0f

    .line 300
    .line 301
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const/high16 v0, 0x40400000    # 3.0f

    .line 305
    .line 306
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v0, -0x3ff66666    # -2.15f

    .line 310
    .line 311
    .line 312
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v17, 0x40600000    # 3.5f

    .line 316
    .line 317
    const v18, -0x3f9ccccd    # -3.55f

    .line 318
    .line 319
    .line 320
    const v13, 0x3ff9999a    # 1.95f

    .line 321
    .line 322
    .line 323
    const v14, -0x41428f5c    # -0.37f

    .line 324
    .line 325
    .line 326
    const/high16 v15, 0x40600000    # 3.5f

    .line 327
    .line 328
    const/high16 v16, -0x40400000    # -1.5f

    .line 329
    .line 330
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v17, -0x3f69999a    # -4.7f

    .line 334
    .line 335
    .line 336
    const v18, -0x3f733333    # -4.4f

    .line 337
    .line 338
    .line 339
    const/4 v13, 0x0

    .line 340
    const v14, -0x3fca3d71    # -2.84f

    .line 341
    .line 342
    .line 343
    const v15, -0x3fe47ae1    # -2.43f

    .line 344
    .line 345
    .line 346
    const v16, -0x3f8c28f6    # -3.81f

    .line 347
    .line 348
    .line 349
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    const/16 v16, 0x3800

    .line 360
    .line 361
    const/16 v17, 0x0

    .line 362
    .line 363
    const/high16 v6, 0x3f800000    # 1.0f

    .line 364
    .line 365
    const/high16 v8, 0x3f800000    # 1.0f

    .line 366
    .line 367
    const/4 v7, 0x0

    .line 368
    const/high16 v9, 0x3f800000    # 1.0f

    .line 369
    .line 370
    const/high16 v12, 0x3f800000    # 1.0f

    .line 371
    .line 372
    const/4 v14, 0x0

    .line 373
    const/4 v15, 0x0

    .line 374
    const-string v4, ""

    .line 375
    .line 376
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    sput-object v0, Landroidx/compose/material/icons/filled/AttachMoneyKt;->_attachMoney:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 385
    .line 386
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 387
    .line 388
    .line 389
    return-object v0
.end method
