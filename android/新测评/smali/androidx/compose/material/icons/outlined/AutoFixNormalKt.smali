.class public final Landroidx/compose/material/icons/outlined/AutoFixNormalKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_autoFixNormal",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "AutoFixNormal",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getAutoFixNormal",
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
        "SMAP\nAutoFixNormal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoFixNormal.kt\nandroidx/compose/material/icons/outlined/AutoFixNormalKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,72:1\n212#2,12:73\n233#2,18:86\n253#2:123\n233#2,18:124\n253#2:161\n174#3:85\n705#4,2:104\n717#4,2:106\n719#4,11:112\n705#4,2:142\n717#4,2:144\n719#4,11:150\n72#5,4:108\n72#5,4:146\n*S KotlinDebug\n*F\n+ 1 AutoFixNormal.kt\nandroidx/compose/material/icons/outlined/AutoFixNormalKt\n*L\n29#1:73,12\n30#1:86,18\n30#1:123\n41#1:124,18\n41#1:161\n29#1:85\n30#1:104,2\n30#1:106,2\n30#1:112,11\n41#1:142,2\n41#1:144,2\n41#1:150,11\n30#1:108,4\n41#1:146,4\n*E\n"
    }
.end annotation


# static fields
.field private static _autoFixNormal:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAutoFixNormal(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 20

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/AutoFixNormalKt;->_autoFixNormal:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.AutoFixNormal"

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
    const/high16 v4, 0x41a00000    # 20.0f

    .line 71
    .line 72
    const/high16 v6, 0x40e00000    # 7.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v4, 0x3f70a3d7    # 0.94f

    .line 78
    .line 79
    .line 80
    const v6, -0x3ffc28f6    # -2.06f

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const v4, 0x4003d70a    # 2.06f

    .line 87
    .line 88
    .line 89
    const v6, -0x408f5c29    # -0.94f

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const v4, -0x408f5c29    # -0.94f

    .line 96
    .line 97
    .line 98
    const v6, -0x3ffc28f6    # -2.06f

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const v4, 0x4003d70a    # 2.06f

    .line 108
    .line 109
    .line 110
    const v6, -0x408f5c29    # -0.94f

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v4, 0x3f70a3d7    # 0.94f

    .line 117
    .line 118
    .line 119
    const v6, -0x3ffc28f6    # -2.06f

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const v4, 0x4003d70a    # 2.06f

    .line 126
    .line 127
    .line 128
    const v6, 0x3f70a3d7    # 0.94f

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    const/16 v16, 0x3800

    .line 142
    .line 143
    const/16 v17, 0x0

    .line 144
    .line 145
    const/high16 v6, 0x3f800000    # 1.0f

    .line 146
    .line 147
    const/high16 v8, 0x3f800000    # 1.0f

    .line 148
    .line 149
    const/4 v7, 0x0

    .line 150
    const/high16 v9, 0x3f800000    # 1.0f

    .line 151
    .line 152
    const/high16 v12, 0x3f800000    # 1.0f

    .line 153
    .line 154
    const/4 v13, 0x0

    .line 155
    const/4 v14, 0x0

    .line 156
    const/4 v15, 0x0

    .line 157
    const-string v4, ""

    .line 158
    .line 159
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 160
    .line 161
    .line 162
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 167
    .line 168
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 169
    .line 170
    .line 171
    move-result-wide v6

    .line 172
    const/4 v0, 0x0

    .line 173
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 177
    .line 178
    .line 179
    move-result v10

    .line 180
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 181
    .line 182
    .line 183
    move-result v11

    .line 184
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 187
    .line 188
    .line 189
    const v0, 0x418dae14    # 17.71f

    .line 190
    .line 191
    .line 192
    const v2, 0x4111eb85    # 9.12f

    .line 193
    .line 194
    .line 195
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v0, -0x3fcae148    # -2.83f

    .line 199
    .line 200
    .line 201
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v17, 0x4162b852    # 14.17f

    .line 205
    .line 206
    .line 207
    const/high16 v18, 0x40c00000    # 6.0f

    .line 208
    .line 209
    const v13, 0x416ae148    # 14.68f

    .line 210
    .line 211
    .line 212
    const v14, 0x40c33333    # 6.1f

    .line 213
    .line 214
    .line 215
    const v15, 0x4166e148    # 14.43f

    .line 216
    .line 217
    .line 218
    const/high16 v16, 0x40c00000    # 6.0f

    .line 219
    .line 220
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const v17, -0x40ca3d71    # -0.71f

    .line 224
    .line 225
    .line 226
    const v18, 0x3e947ae1    # 0.29f

    .line 227
    .line 228
    .line 229
    const v13, -0x417ae148    # -0.26f

    .line 230
    .line 231
    .line 232
    const/4 v14, 0x0

    .line 233
    const v15, -0x40fd70a4    # -0.51f

    .line 234
    .line 235
    .line 236
    const v16, 0x3dcccccd    # 0.1f

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const v0, 0x40128f5c    # 2.29f

    .line 243
    .line 244
    .line 245
    const v2, 0x418bae14    # 17.46f

    .line 246
    .line 247
    .line 248
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/16 v17, 0x0

    .line 252
    .line 253
    const v18, 0x3fb47ae1    # 1.41f

    .line 254
    .line 255
    .line 256
    const v13, -0x413851ec    # -0.39f

    .line 257
    .line 258
    .line 259
    const v14, 0x3ec7ae14    # 0.39f

    .line 260
    .line 261
    .line 262
    const v15, -0x413851ec    # -0.39f

    .line 263
    .line 264
    .line 265
    const v16, 0x3f828f5c    # 1.02f

    .line 266
    .line 267
    .line 268
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v0, 0x40351eb8    # 2.83f

    .line 272
    .line 273
    .line 274
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v17, 0x40ba8f5c    # 5.83f

    .line 278
    .line 279
    .line 280
    const/high16 v18, 0x41b00000    # 22.0f

    .line 281
    .line 282
    const v13, 0x40aa3d71    # 5.32f

    .line 283
    .line 284
    .line 285
    const v14, 0x41af3333    # 21.9f

    .line 286
    .line 287
    .line 288
    const v15, 0x40b23d71    # 5.57f

    .line 289
    .line 290
    .line 291
    const/high16 v16, 0x41b00000    # 22.0f

    .line 292
    .line 293
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v0, 0x3f35c28f    # 0.71f

    .line 297
    .line 298
    .line 299
    const v2, -0x416b851f    # -0.29f

    .line 300
    .line 301
    .line 302
    const v4, 0x3f028f5c    # 0.51f

    .line 303
    .line 304
    .line 305
    const v6, -0x42333333    # -0.1f

    .line 306
    .line 307
    .line 308
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v0, 0x4132b852    # 11.17f

    .line 312
    .line 313
    .line 314
    const v2, -0x3ecd47ae    # -11.17f

    .line 315
    .line 316
    .line 317
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v17, 0x418dae14    # 17.71f

    .line 321
    .line 322
    .line 323
    const v18, 0x4111eb85    # 9.12f

    .line 324
    .line 325
    .line 326
    const v13, 0x4190cccd    # 18.1f

    .line 327
    .line 328
    .line 329
    const v14, 0x41226666    # 10.15f

    .line 330
    .line 331
    .line 332
    const v15, 0x4190cccd    # 18.1f

    .line 333
    .line 334
    .line 335
    const v16, 0x411828f6    # 9.51f

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v0, 0x4106b852    # 8.42f

    .line 345
    .line 346
    .line 347
    const v2, 0x4162b852    # 14.17f

    .line 348
    .line 349
    .line 350
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v0, 0x3fb47ae1    # 1.41f

    .line 354
    .line 355
    .line 356
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v0, 0x41668f5c    # 14.41f

    .line 360
    .line 361
    .line 362
    const/high16 v2, 0x41300000    # 11.0f

    .line 363
    .line 364
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v0, 0x411970a4    # 9.59f

    .line 368
    .line 369
    .line 370
    const/high16 v2, 0x41500000    # 13.0f

    .line 371
    .line 372
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v0, 0x4106b852    # 8.42f

    .line 376
    .line 377
    .line 378
    const v2, 0x4162b852    # 14.17f

    .line 379
    .line 380
    .line 381
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v0, 0x419cb852    # 19.59f

    .line 388
    .line 389
    .line 390
    const v2, 0x40ba8f5c    # 5.83f

    .line 391
    .line 392
    .line 393
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v0, -0x404b851f    # -1.41f

    .line 397
    .line 398
    .line 399
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v0, 0x413970a4    # 11.59f

    .line 403
    .line 404
    .line 405
    const/high16 v2, 0x41300000    # 11.0f

    .line 406
    .line 407
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v0, 0x41468f5c    # 12.41f

    .line 411
    .line 412
    .line 413
    const/high16 v2, 0x41500000    # 13.0f

    .line 414
    .line 415
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v0, 0x419cb852    # 19.59f

    .line 419
    .line 420
    .line 421
    const v2, 0x40ba8f5c    # 5.83f

    .line 422
    .line 423
    .line 424
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 431
    .line 432
    .line 433
    move-result-object v2

    .line 434
    const/16 v16, 0x3800

    .line 435
    .line 436
    const/16 v17, 0x0

    .line 437
    .line 438
    const/high16 v6, 0x3f800000    # 1.0f

    .line 439
    .line 440
    const/4 v7, 0x0

    .line 441
    const/high16 v12, 0x3f800000    # 1.0f

    .line 442
    .line 443
    const/4 v13, 0x0

    .line 444
    const/4 v14, 0x0

    .line 445
    const/4 v15, 0x0

    .line 446
    const-string v4, ""

    .line 447
    .line 448
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    sput-object v0, Landroidx/compose/material/icons/outlined/AutoFixNormalKt;->_autoFixNormal:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 457
    .line 458
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 459
    .line 460
    .line 461
    return-object v0
.end method
