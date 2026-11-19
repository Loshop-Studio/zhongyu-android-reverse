.class public final Landroidx/compose/material/icons/outlined/FormatColorResetKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_formatColorReset",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "FormatColorReset",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getFormatColorReset",
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
        "SMAP\nFormatColorReset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FormatColorReset.kt\nandroidx/compose/material/icons/outlined/FormatColorResetKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,62:1\n212#2,12:63\n233#2,18:76\n253#2:113\n174#3:75\n705#4,2:94\n717#4,2:96\n719#4,11:102\n72#5,4:98\n*S KotlinDebug\n*F\n+ 1 FormatColorReset.kt\nandroidx/compose/material/icons/outlined/FormatColorResetKt\n*L\n29#1:63,12\n30#1:76,18\n30#1:113\n29#1:75\n30#1:94,2\n30#1:96,2\n30#1:102,11\n30#1:98,4\n*E\n"
    }
.end annotation


# static fields
.field private static _formatColorReset:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFormatColorReset(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/FormatColorResetKt;->_formatColorReset:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.FormatColorReset"

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
    const v0, 0x40cb851f    # 6.36f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41400000    # 12.0f

    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v17, 0x406d70a4    # 3.71f

    .line 79
    .line 80
    .line 81
    const v18, 0x40c7ae14    # 6.24f

    .line 82
    .line 83
    .line 84
    const v13, 0x3fc3d70a    # 1.53f

    .line 85
    .line 86
    .line 87
    const/high16 v14, 0x40000000    # 2.0f

    .line 88
    .line 89
    const v15, 0x40451eb8    # 3.08f

    .line 90
    .line 91
    .line 92
    const v16, 0x408dc28f    # 4.43f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v0, 0x400eb852    # 2.23f

    .line 99
    .line 100
    .line 101
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v17, 0x3d75c28f    # 0.06f

    .line 105
    .line 106
    .line 107
    const v18, -0x40ab851f    # -0.83f

    .line 108
    .line 109
    .line 110
    const v13, 0x3cf5c28f    # 0.03f

    .line 111
    .line 112
    .line 113
    const v14, -0x4175c28f    # -0.27f

    .line 114
    .line 115
    .line 116
    const v15, 0x3d75c28f    # 0.06f

    .line 117
    .line 118
    .line 119
    const v16, -0x40f33333    # -0.55f

    .line 120
    .line 121
    .line 122
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v17, -0x3f400000    # -6.0f

    .line 126
    .line 127
    const v18, -0x3ed33333    # -10.8f

    .line 128
    .line 129
    .line 130
    const/4 v13, 0x0

    .line 131
    const v14, -0x3f8147ae    # -3.98f

    .line 132
    .line 133
    .line 134
    const/high16 v15, -0x3f400000    # -6.0f

    .line 135
    .line 136
    const v16, -0x3ed33333    # -10.8f

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v0, -0x3fe00000    # -2.5f

    .line 143
    .line 144
    const v2, 0x404c28f6    # 3.19f

    .line 145
    .line 146
    .line 147
    const v4, -0x4068f5c3    # -1.18f

    .line 148
    .line 149
    .line 150
    const v6, 0x3faccccd    # 1.35f

    .line 151
    .line 152
    .line 153
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v0, 0x3fb851ec    # 1.44f

    .line 157
    .line 158
    .line 159
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v17, 0x3f87ae14    # 1.06f

    .line 163
    .line 164
    .line 165
    const v18, -0x4043d70a    # -1.47f

    .line 166
    .line 167
    .line 168
    const v13, 0x3eae147b    # 0.34f

    .line 169
    .line 170
    .line 171
    const v14, -0x40fd70a4    # -0.51f

    .line 172
    .line 173
    .line 174
    const v15, 0x3f333333    # 0.7f

    .line 175
    .line 176
    .line 177
    const/high16 v16, -0x40800000    # -1.0f

    .line 178
    .line 179
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const v0, 0x40a47ae1    # 5.14f

    .line 186
    .line 187
    .line 188
    const v2, 0x40ad1eb8    # 5.41f

    .line 189
    .line 190
    .line 191
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v0, 0x40800000    # 4.0f

    .line 195
    .line 196
    const v2, 0x40d1999a    # 6.55f

    .line 197
    .line 198
    .line 199
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v0, 0x40547ae1    # 3.32f

    .line 203
    .line 204
    .line 205
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v17, 0x40c00000    # 6.0f

    .line 209
    .line 210
    const/high16 v18, 0x41600000    # 14.0f

    .line 211
    .line 212
    const v13, 0x40d1999a    # 6.55f

    .line 213
    .line 214
    .line 215
    const v14, 0x413547ae    # 11.33f

    .line 216
    .line 217
    .line 218
    const/high16 v15, 0x40c00000    # 6.0f

    .line 219
    .line 220
    const v16, 0x414ca3d7    # 12.79f

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v18, 0x40c00000    # 6.0f

    .line 227
    .line 228
    const/4 v13, 0x0

    .line 229
    const v14, 0x4053d70a    # 3.31f

    .line 230
    .line 231
    .line 232
    const v15, 0x402c28f6    # 2.69f

    .line 233
    .line 234
    .line 235
    const/high16 v16, 0x40c00000    # 6.0f

    .line 236
    .line 237
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v17, 0x407ccccd    # 3.95f

    .line 241
    .line 242
    .line 243
    const/high16 v18, -0x40400000    # -1.5f

    .line 244
    .line 245
    const v13, 0x3fc28f5c    # 1.52f

    .line 246
    .line 247
    .line 248
    const/4 v14, 0x0

    .line 249
    const v15, 0x4039999a    # 2.9f

    .line 250
    .line 251
    .line 252
    const v16, -0x40ee147b    # -0.57f

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const v0, 0x402851ec    # 2.63f

    .line 259
    .line 260
    .line 261
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v0, 0x41a00000    # 20.0f

    .line 265
    .line 266
    const v2, 0x419dc28f    # 19.72f

    .line 267
    .line 268
    .line 269
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v0, 0x40a47ae1    # 5.14f

    .line 273
    .line 274
    .line 275
    const v2, 0x40ad1eb8    # 5.41f

    .line 276
    .line 277
    .line 278
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v0, 0x41900000    # 18.0f

    .line 285
    .line 286
    const/high16 v2, 0x41400000    # 12.0f

    .line 287
    .line 288
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const/high16 v17, -0x3f800000    # -4.0f

    .line 292
    .line 293
    const/high16 v18, -0x3f800000    # -4.0f

    .line 294
    .line 295
    const v13, -0x3ff28f5c    # -2.21f

    .line 296
    .line 297
    .line 298
    const/high16 v15, -0x3f800000    # -4.0f

    .line 299
    .line 300
    const v16, -0x401ae148    # -1.79f

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v17, 0x3f4f5c29    # 0.81f

    .line 307
    .line 308
    .line 309
    const v18, -0x3fd70a3d    # -2.64f

    .line 310
    .line 311
    .line 312
    const/4 v13, 0x0

    .line 313
    const v14, -0x40cf5c29    # -0.69f

    .line 314
    .line 315
    .line 316
    const v15, 0x3ea3d70a    # 0.32f

    .line 317
    .line 318
    .line 319
    const v16, -0x4030a3d7    # -1.62f

    .line 320
    .line 321
    .line 322
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const v0, 0x40b70a3d    # 5.72f

    .line 326
    .line 327
    .line 328
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v17, -0x3fde147b    # -2.53f

    .line 332
    .line 333
    .line 334
    const v18, 0x3f6b851f    # 0.92f

    .line 335
    .line 336
    .line 337
    const v13, -0x40cccccd    # -0.7f

    .line 338
    .line 339
    .line 340
    const v14, 0x3f0f5c29    # 0.56f

    .line 341
    .line 342
    .line 343
    const v15, -0x40370a3d    # -1.57f

    .line 344
    .line 345
    .line 346
    const v16, 0x3f6b851f    # 0.92f

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
    const/4 v13, 0x0

    .line 373
    const/4 v14, 0x0

    .line 374
    const/4 v15, 0x0

    .line 375
    const-string v4, ""

    .line 376
    .line 377
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    sput-object v0, Landroidx/compose/material/icons/outlined/FormatColorResetKt;->_formatColorReset:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 386
    .line 387
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 388
    .line 389
    .line 390
    return-object v0
.end method
