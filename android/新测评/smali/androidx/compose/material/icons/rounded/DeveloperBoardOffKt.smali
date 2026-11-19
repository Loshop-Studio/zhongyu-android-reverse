.class public final Landroidx/compose/material/icons/rounded/DeveloperBoardOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_developerBoardOff",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "DeveloperBoardOff",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getDeveloperBoardOff",
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
        "SMAP\nDeveloperBoardOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperBoardOff.kt\nandroidx/compose/material/icons/rounded/DeveloperBoardOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,128:1\n212#2,12:129\n233#2,18:142\n253#2:179\n174#3:141\n705#4,2:160\n717#4,2:162\n719#4,11:168\n72#5,4:164\n*S KotlinDebug\n*F\n+ 1 DeveloperBoardOff.kt\nandroidx/compose/material/icons/rounded/DeveloperBoardOffKt\n*L\n29#1:129,12\n30#1:142,18\n30#1:179\n29#1:141\n30#1:160,2\n30#1:162,2\n30#1:168,11\n30#1:164,4\n*E\n"
    }
.end annotation


# static fields
.field private static _developerBoardOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDeveloperBoardOff(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/DeveloperBoardOffKt;->_developerBoardOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.DeveloperBoardOff"

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
    const v0, 0x40fa8f5c    # 7.83f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x40a00000    # 5.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v0, 0x41900000    # 18.0f

    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v0, 0x4122b852    # 10.17f

    .line 84
    .line 85
    .line 86
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 87
    .line 88
    .line 89
    const v0, 0x419ea3d7    # 19.83f

    .line 90
    .line 91
    .line 92
    const/high16 v2, 0x41880000    # 17.0f

    .line 93
    .line 94
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v0, 0x41a80000    # 21.0f

    .line 98
    .line 99
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v17, 0x3f800000    # 1.0f

    .line 103
    .line 104
    const/high16 v18, -0x40800000    # -1.0f

    .line 105
    .line 106
    const v13, 0x3f0ccccd    # 0.55f

    .line 107
    .line 108
    .line 109
    const/4 v14, 0x0

    .line 110
    const/high16 v15, 0x3f800000    # 1.0f

    .line 111
    .line 112
    const v16, -0x4119999a    # -0.45f

    .line 113
    .line 114
    .line 115
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const/4 v0, 0x0

    .line 119
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v17, -0x40800000    # -1.0f

    .line 123
    .line 124
    const/4 v13, 0x0

    .line 125
    const v14, -0x40f33333    # -0.55f

    .line 126
    .line 127
    .line 128
    const v15, -0x4119999a    # -0.45f

    .line 129
    .line 130
    .line 131
    const/high16 v16, -0x40800000    # -1.0f

    .line 132
    .line 133
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v0, -0x40800000    # -1.0f

    .line 137
    .line 138
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v0, -0x40000000    # -2.0f

    .line 142
    .line 143
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v0, 0x3f800000    # 1.0f

    .line 147
    .line 148
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v17, 0x3f800000    # 1.0f

    .line 152
    .line 153
    const v13, 0x3f0ccccd    # 0.55f

    .line 154
    .line 155
    .line 156
    const/4 v14, 0x0

    .line 157
    const/high16 v15, 0x3f800000    # 1.0f

    .line 158
    .line 159
    const v16, -0x4119999a    # -0.45f

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/4 v0, 0x0

    .line 166
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const/high16 v17, -0x40800000    # -1.0f

    .line 170
    .line 171
    const/4 v13, 0x0

    .line 172
    const v14, -0x40f33333    # -0.55f

    .line 173
    .line 174
    .line 175
    const v15, -0x4119999a    # -0.45f

    .line 176
    .line 177
    .line 178
    const/high16 v16, -0x40800000    # -1.0f

    .line 179
    .line 180
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const/high16 v0, -0x40800000    # -1.0f

    .line 184
    .line 185
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v0, 0x41100000    # 9.0f

    .line 189
    .line 190
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v0, 0x3f800000    # 1.0f

    .line 194
    .line 195
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v17, 0x3f800000    # 1.0f

    .line 199
    .line 200
    const v13, 0x3f0ccccd    # 0.55f

    .line 201
    .line 202
    .line 203
    const/4 v14, 0x0

    .line 204
    const/high16 v15, 0x3f800000    # 1.0f

    .line 205
    .line 206
    const v16, -0x4119999a    # -0.45f

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/4 v0, 0x0

    .line 213
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v17, -0x40800000    # -1.0f

    .line 217
    .line 218
    const/4 v13, 0x0

    .line 219
    const v14, -0x40f33333    # -0.55f

    .line 220
    .line 221
    .line 222
    const v15, -0x4119999a    # -0.45f

    .line 223
    .line 224
    .line 225
    const/high16 v16, -0x40800000    # -1.0f

    .line 226
    .line 227
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v0, -0x40800000    # -1.0f

    .line 231
    .line 232
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v0, 0x40a00000    # 5.0f

    .line 236
    .line 237
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const/high16 v17, -0x40000000    # -2.0f

    .line 241
    .line 242
    const/high16 v18, -0x40000000    # -2.0f

    .line 243
    .line 244
    const v14, -0x40733333    # -1.1f

    .line 245
    .line 246
    .line 247
    const v15, -0x4099999a    # -0.9f

    .line 248
    .line 249
    .line 250
    const/high16 v16, -0x40000000    # -2.0f

    .line 251
    .line 252
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v0, 0x40ba8f5c    # 5.83f

    .line 256
    .line 257
    .line 258
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v0, 0x40fa8f5c    # 7.83f

    .line 262
    .line 263
    .line 264
    const/high16 v2, 0x40a00000    # 5.0f

    .line 265
    .line 266
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v0, 0x41200000    # 10.0f

    .line 273
    .line 274
    const/high16 v2, 0x41700000    # 15.0f

    .line 275
    .line 276
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const/high16 v0, -0x40000000    # -2.0f

    .line 280
    .line 281
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v17, -0x41bd70a4    # -0.19f

    .line 285
    .line 286
    .line 287
    const v18, -0x435c28f6    # -0.02f

    .line 288
    .line 289
    .line 290
    const v13, -0x428a3d71    # -0.06f

    .line 291
    .line 292
    .line 293
    const/4 v14, 0x0

    .line 294
    const v15, -0x41fae148    # -0.13f

    .line 295
    .line 296
    .line 297
    const v16, -0x43dc28f6    # -0.01f

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const v0, -0x40b5c28f    # -0.79f

    .line 304
    .line 305
    .line 306
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const/high16 v17, 0x41400000    # 12.0f

    .line 310
    .line 311
    const/high16 v18, 0x41100000    # 9.0f

    .line 312
    .line 313
    const v13, 0x414028f6    # 12.01f

    .line 314
    .line 315
    .line 316
    const v14, 0x4112147b    # 9.13f

    .line 317
    .line 318
    .line 319
    const/high16 v15, 0x41400000    # 12.0f

    .line 320
    .line 321
    const v16, 0x4110f5c3    # 9.06f

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v0, 0x41000000    # 8.0f

    .line 328
    .line 329
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v17, 0x3f800000    # 1.0f

    .line 333
    .line 334
    const/high16 v18, -0x40800000    # -1.0f

    .line 335
    .line 336
    const/4 v13, 0x0

    .line 337
    const v14, -0x40f33333    # -0.55f

    .line 338
    .line 339
    .line 340
    const v15, 0x3ee66666    # 0.45f

    .line 341
    .line 342
    .line 343
    const/high16 v16, -0x40800000    # -1.0f

    .line 344
    .line 345
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const/high16 v0, 0x40000000    # 2.0f

    .line 349
    .line 350
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/high16 v18, 0x3f800000    # 1.0f

    .line 354
    .line 355
    const v13, 0x3f0ccccd    # 0.55f

    .line 356
    .line 357
    .line 358
    const/4 v14, 0x0

    .line 359
    const/high16 v15, 0x3f800000    # 1.0f

    .line 360
    .line 361
    const v16, 0x3ee66666    # 0.45f

    .line 362
    .line 363
    .line 364
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const/high16 v0, 0x3f800000    # 1.0f

    .line 368
    .line 369
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const/high16 v17, 0x41700000    # 15.0f

    .line 373
    .line 374
    const/high16 v18, 0x41200000    # 10.0f

    .line 375
    .line 376
    const/high16 v13, 0x41800000    # 16.0f

    .line 377
    .line 378
    const v14, 0x4118cccd    # 9.55f

    .line 379
    .line 380
    .line 381
    const v15, 0x4178cccd    # 15.55f

    .line 382
    .line 383
    .line 384
    const/high16 v16, 0x41200000    # 10.0f

    .line 385
    .line 386
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const/high16 v0, 0x41000000    # 8.0f

    .line 393
    .line 394
    const/high16 v2, 0x41300000    # 11.0f

    .line 395
    .line 396
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const v0, 0x3e2e147b    # 0.17f

    .line 400
    .line 401
    .line 402
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v0, 0x411d47ae    # 9.83f

    .line 406
    .line 407
    .line 408
    const/high16 v2, 0x40e00000    # 7.0f

    .line 409
    .line 410
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v0, 0x41200000    # 10.0f

    .line 414
    .line 415
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const/high16 v17, 0x41300000    # 11.0f

    .line 419
    .line 420
    const/high16 v18, 0x41000000    # 8.0f

    .line 421
    .line 422
    const v13, 0x4128cccd    # 10.55f

    .line 423
    .line 424
    .line 425
    const/high16 v14, 0x40e00000    # 7.0f

    .line 426
    .line 427
    const/high16 v15, 0x41300000    # 11.0f

    .line 428
    .line 429
    const v16, 0x40ee6666    # 7.45f

    .line 430
    .line 431
    .line 432
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const/high16 v0, 0x41400000    # 12.0f

    .line 439
    .line 440
    const/high16 v2, 0x41800000    # 16.0f

    .line 441
    .line 442
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const v0, 0x3f95c28f    # 1.17f

    .line 446
    .line 447
    .line 448
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v0, 0x415d47ae    # 13.83f

    .line 452
    .line 453
    .line 454
    const/high16 v2, 0x41300000    # 11.0f

    .line 455
    .line 456
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/high16 v0, 0x41700000    # 15.0f

    .line 460
    .line 461
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const/high16 v17, 0x41800000    # 16.0f

    .line 465
    .line 466
    const/high16 v18, 0x41400000    # 12.0f

    .line 467
    .line 468
    const v13, 0x4178cccd    # 15.55f

    .line 469
    .line 470
    .line 471
    const/high16 v14, 0x41300000    # 11.0f

    .line 472
    .line 473
    const/high16 v15, 0x41800000    # 16.0f

    .line 474
    .line 475
    const v16, 0x41373333    # 11.45f

    .line 476
    .line 477
    .line 478
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const v0, 0x3fb1eb85    # 1.39f

    .line 485
    .line 486
    .line 487
    const v2, 0x4033d70a    # 2.81f

    .line 488
    .line 489
    .line 490
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const v17, 0x3fb1eb85    # 1.39f

    .line 497
    .line 498
    .line 499
    const v18, 0x40870a3d    # 4.22f

    .line 500
    .line 501
    .line 502
    const/high16 v13, 0x3f800000    # 1.0f

    .line 503
    .line 504
    const v14, 0x404ccccd    # 3.2f

    .line 505
    .line 506
    .line 507
    const/high16 v15, 0x3f800000    # 1.0f

    .line 508
    .line 509
    const v16, 0x40751eb8    # 3.83f

    .line 510
    .line 511
    .line 512
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const v0, 0x3f1c28f6    # 0.61f

    .line 516
    .line 517
    .line 518
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const/high16 v17, 0x40000000    # 2.0f

    .line 522
    .line 523
    const/high16 v18, 0x40a00000    # 5.0f

    .line 524
    .line 525
    const/high16 v13, 0x40000000    # 2.0f

    .line 526
    .line 527
    const v14, 0x409c7ae1    # 4.89f

    .line 528
    .line 529
    .line 530
    const/high16 v15, 0x40000000    # 2.0f

    .line 531
    .line 532
    const v16, 0x409e147b    # 4.94f

    .line 533
    .line 534
    .line 535
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const/high16 v0, 0x41600000    # 14.0f

    .line 539
    .line 540
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const/high16 v18, 0x40000000    # 2.0f

    .line 544
    .line 545
    const/4 v13, 0x0

    .line 546
    const v14, 0x3f8ccccd    # 1.1f

    .line 547
    .line 548
    .line 549
    const v15, 0x3f666666    # 0.9f

    .line 550
    .line 551
    .line 552
    const/high16 v16, 0x40000000    # 2.0f

    .line 553
    .line 554
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const v17, 0x3e23d70a    # 0.16f

    .line 561
    .line 562
    .line 563
    const v18, -0x43dc28f6    # -0.01f

    .line 564
    .line 565
    .line 566
    const v13, 0x3d75c28f    # 0.06f

    .line 567
    .line 568
    .line 569
    const/4 v14, 0x0

    .line 570
    const v15, 0x3de147ae    # 0.11f

    .line 571
    .line 572
    .line 573
    const/16 v16, 0x0

    .line 574
    .line 575
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const v0, 0x3fce147b    # 1.61f

    .line 579
    .line 580
    .line 581
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const v17, 0x3fb47ae1    # 1.41f

    .line 585
    .line 586
    .line 587
    const/16 v18, 0x0

    .line 588
    .line 589
    const v13, 0x3ec7ae14    # 0.39f

    .line 590
    .line 591
    .line 592
    const v14, 0x3ec7ae14    # 0.39f

    .line 593
    .line 594
    .line 595
    const v15, 0x3f828f5c    # 1.02f

    .line 596
    .line 597
    .line 598
    const v16, 0x3ec7ae14    # 0.39f

    .line 599
    .line 600
    .line 601
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const/4 v0, 0x0

    .line 605
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const/16 v17, 0x0

    .line 609
    .line 610
    const v18, -0x404b851f    # -1.41f

    .line 611
    .line 612
    .line 613
    const v14, -0x413851ec    # -0.39f

    .line 614
    .line 615
    .line 616
    const v15, 0x3ec7ae14    # 0.39f

    .line 617
    .line 618
    .line 619
    const v16, -0x407d70a4    # -1.02f

    .line 620
    .line 621
    .line 622
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const v0, 0x4033d70a    # 2.81f

    .line 626
    .line 627
    .line 628
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    const v17, 0x3fb1eb85    # 1.39f

    .line 632
    .line 633
    .line 634
    const v18, 0x4033d70a    # 2.81f

    .line 635
    .line 636
    .line 637
    const v13, 0x401ae148    # 2.42f

    .line 638
    .line 639
    .line 640
    const v14, 0x401ae148    # 2.42f

    .line 641
    .line 642
    .line 643
    const v15, 0x3fe3d70a    # 1.78f

    .line 644
    .line 645
    .line 646
    const v16, 0x401ae148    # 2.42f

    .line 647
    .line 648
    .line 649
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const/high16 v0, 0x41980000    # 19.0f

    .line 656
    .line 657
    const/high16 v2, 0x40800000    # 4.0f

    .line 658
    .line 659
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const v0, 0x40da8f5c    # 6.83f

    .line 663
    .line 664
    .line 665
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    const/high16 v0, 0x40000000    # 2.0f

    .line 669
    .line 670
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 671
    .line 672
    .line 673
    const/high16 v0, 0x41300000    # 11.0f

    .line 674
    .line 675
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const/high16 v17, 0x3f800000    # 1.0f

    .line 679
    .line 680
    const/high16 v18, 0x3f800000    # 1.0f

    .line 681
    .line 682
    const/4 v13, 0x0

    .line 683
    const v14, 0x3f0ccccd    # 0.55f

    .line 684
    .line 685
    .line 686
    const v15, 0x3ee66666    # 0.45f

    .line 687
    .line 688
    .line 689
    const/high16 v16, 0x3f800000    # 1.0f

    .line 690
    .line 691
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 692
    .line 693
    .line 694
    const v0, 0x400ae148    # 2.17f

    .line 695
    .line 696
    .line 697
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    const v0, 0x3f828f5c    # 1.02f

    .line 701
    .line 702
    .line 703
    const v2, 0x3f828f5c    # 1.02f

    .line 704
    .line 705
    .line 706
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    const/high16 v17, 0x41200000    # 10.0f

    .line 710
    .line 711
    const/high16 v18, 0x41500000    # 13.0f

    .line 712
    .line 713
    const v13, 0x4122147b    # 10.13f

    .line 714
    .line 715
    .line 716
    const v14, 0x415028f6    # 13.01f

    .line 717
    .line 718
    .line 719
    const v15, 0x4120f5c3    # 10.06f

    .line 720
    .line 721
    .line 722
    const/high16 v16, 0x41500000    # 13.0f

    .line 723
    .line 724
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    const/high16 v0, 0x40e00000    # 7.0f

    .line 728
    .line 729
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    const/high16 v17, -0x40800000    # -1.0f

    .line 733
    .line 734
    const/high16 v18, 0x3f800000    # 1.0f

    .line 735
    .line 736
    const v13, -0x40f33333    # -0.55f

    .line 737
    .line 738
    .line 739
    const/4 v14, 0x0

    .line 740
    const/high16 v15, -0x40800000    # -1.0f

    .line 741
    .line 742
    const v16, 0x3ee66666    # 0.45f

    .line 743
    .line 744
    .line 745
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 746
    .line 747
    .line 748
    const/high16 v0, 0x40000000    # 2.0f

    .line 749
    .line 750
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 751
    .line 752
    .line 753
    const/high16 v17, 0x3f800000    # 1.0f

    .line 754
    .line 755
    const/4 v13, 0x0

    .line 756
    const v14, 0x3f0ccccd    # 0.55f

    .line 757
    .line 758
    .line 759
    const v15, 0x3ee66666    # 0.45f

    .line 760
    .line 761
    .line 762
    const/high16 v16, 0x3f800000    # 1.0f

    .line 763
    .line 764
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 765
    .line 766
    .line 767
    const/high16 v0, 0x40400000    # 3.0f

    .line 768
    .line 769
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 770
    .line 771
    .line 772
    const/high16 v18, -0x40800000    # -1.0f

    .line 773
    .line 774
    const v13, 0x3f0ccccd    # 0.55f

    .line 775
    .line 776
    .line 777
    const/4 v14, 0x0

    .line 778
    const/high16 v15, 0x3f800000    # 1.0f

    .line 779
    .line 780
    const v16, -0x4119999a    # -0.45f

    .line 781
    .line 782
    .line 783
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 784
    .line 785
    .line 786
    const/high16 v0, -0x40000000    # -2.0f

    .line 787
    .line 788
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 789
    .line 790
    .line 791
    const v17, -0x435c28f6    # -0.02f

    .line 792
    .line 793
    .line 794
    const v18, -0x41bd70a4    # -0.19f

    .line 795
    .line 796
    .line 797
    const/4 v13, 0x0

    .line 798
    const v14, -0x428a3d71    # -0.06f

    .line 799
    .line 800
    .line 801
    const v15, -0x43dc28f6    # -0.01f

    .line 802
    .line 803
    .line 804
    const v16, -0x41fae148    # -0.13f

    .line 805
    .line 806
    .line 807
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 808
    .line 809
    .line 810
    const v0, 0x416d47ae    # 14.83f

    .line 811
    .line 812
    .line 813
    const/high16 v2, 0x41400000    # 12.0f

    .line 814
    .line 815
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 816
    .line 817
    .line 818
    const v0, 0x3eeb851f    # 0.46f

    .line 819
    .line 820
    .line 821
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 822
    .line 823
    .line 824
    const/high16 v0, 0x41800000    # 16.0f

    .line 825
    .line 826
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 827
    .line 828
    .line 829
    const/high16 v17, 0x3f800000    # 1.0f

    .line 830
    .line 831
    const/high16 v18, 0x3f800000    # 1.0f

    .line 832
    .line 833
    const v14, 0x3f0ccccd    # 0.55f

    .line 834
    .line 835
    .line 836
    const v15, 0x3ee66666    # 0.45f

    .line 837
    .line 838
    .line 839
    const/high16 v16, 0x3f800000    # 1.0f

    .line 840
    .line 841
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 842
    .line 843
    .line 844
    const v0, 0x3ec28f5c    # 0.38f

    .line 845
    .line 846
    .line 847
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 848
    .line 849
    .line 850
    const v0, 0x3f4ccccd    # 0.8f

    .line 851
    .line 852
    .line 853
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 854
    .line 855
    .line 856
    const/high16 v0, 0x40000000    # 2.0f

    .line 857
    .line 858
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 859
    .line 860
    .line 861
    const/high16 v0, 0x40800000    # 4.0f

    .line 862
    .line 863
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 864
    .line 865
    .line 866
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 867
    .line 868
    .line 869
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 870
    .line 871
    .line 872
    move-result-object v2

    .line 873
    const/16 v16, 0x3800

    .line 874
    .line 875
    const/16 v17, 0x0

    .line 876
    .line 877
    const/high16 v6, 0x3f800000    # 1.0f

    .line 878
    .line 879
    const/high16 v8, 0x3f800000    # 1.0f

    .line 880
    .line 881
    const/4 v7, 0x0

    .line 882
    const/high16 v9, 0x3f800000    # 1.0f

    .line 883
    .line 884
    const/high16 v12, 0x3f800000    # 1.0f

    .line 885
    .line 886
    const/4 v14, 0x0

    .line 887
    const/4 v15, 0x0

    .line 888
    const-string v4, ""

    .line 889
    .line 890
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 891
    .line 892
    .line 893
    move-result-object v0

    .line 894
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 895
    .line 896
    .line 897
    move-result-object v0

    .line 898
    sput-object v0, Landroidx/compose/material/icons/rounded/DeveloperBoardOffKt;->_developerBoardOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 899
    .line 900
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 901
    .line 902
    .line 903
    return-object v0
.end method
