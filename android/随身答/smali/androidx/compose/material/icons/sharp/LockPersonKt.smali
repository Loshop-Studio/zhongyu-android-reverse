.class public final Landroidx/compose/material/icons/sharp/LockPersonKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_lockPerson",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "LockPerson",
        "Landroidx/compose/material/icons/Icons$Sharp;",
        "getLockPerson",
        "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nLockPerson.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockPerson.kt\nandroidx/compose/material/icons/sharp/LockPersonKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,78:1\n212#2,12:79\n233#2,18:92\n253#2:129\n233#2,18:130\n253#2:167\n174#3:91\n705#4,2:110\n717#4,2:112\n719#4,11:118\n705#4,2:148\n717#4,2:150\n719#4,11:156\n72#5,4:114\n72#5,4:152\n*S KotlinDebug\n*F\n+ 1 LockPerson.kt\nandroidx/compose/material/icons/sharp/LockPersonKt\n*L\n29#1:79,12\n30#1:92,18\n30#1:129\n53#1:130,18\n53#1:167\n29#1:91\n30#1:110,2\n30#1:112,2\n30#1:118,11\n53#1:148,2\n53#1:150,2\n53#1:156,11\n30#1:114,4\n53#1:152,4\n*E\n"
    }
.end annotation


# static fields
.field private static _lockPerson:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLockPerson(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/LockPersonKt;->_lockPerson:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.LockPerson"

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
    const v4, 0x418370a4    # 16.43f

    .line 71
    .line 72
    .line 73
    const v6, 0x4132e148    # 11.18f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, 0x40647ae1    # 3.57f

    .line 80
    .line 81
    .line 82
    const v26, 0x3df5c28f    # 0.12f

    .line 83
    .line 84
    .line 85
    const v21, 0x3fa147ae    # 1.26f

    .line 86
    .line 87
    .line 88
    const v22, -0x416b851f    # -0.29f

    .line 89
    .line 90
    .line 91
    const v23, 0x401e147b    # 2.47f

    .line 92
    .line 93
    .line 94
    const v24, -0x41a8f5c3    # -0.21f

    .line 95
    .line 96
    .line 97
    move-object/from16 v20, v2

    .line 98
    .line 99
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v4, 0x41000000    # 8.0f

    .line 103
    .line 104
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 108
    .line 109
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v4, 0x40c70a3d    # 6.22f

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v25, -0x3f6fae14    # -4.51f

    .line 119
    .line 120
    .line 121
    const v26, -0x3f59eb85    # -5.19f

    .line 122
    .line 123
    .line 124
    const/16 v21, 0x0

    .line 125
    .line 126
    const v22, -0x3fd8f5c3    # -2.61f

    .line 127
    .line 128
    .line 129
    const v23, -0x400b851f    # -1.91f

    .line 130
    .line 131
    .line 132
    const v24, -0x3f61eb85    # -4.94f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v25, 0x40e00000    # 7.0f

    .line 139
    .line 140
    const/high16 v26, 0x40c00000    # 6.0f

    .line 141
    .line 142
    const v21, 0x411828f6    # 9.51f

    .line 143
    .line 144
    .line 145
    const v22, 0x3f3d70a4    # 0.74f

    .line 146
    .line 147
    .line 148
    const/high16 v23, 0x40e00000    # 7.0f

    .line 149
    .line 150
    const v24, 0x40451eb8    # 3.08f

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const/high16 v4, 0x40000000    # 2.0f

    .line 157
    .line 158
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/high16 v4, 0x40800000    # 4.0f

    .line 162
    .line 163
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v4, 0x41600000    # 14.0f

    .line 167
    .line 168
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v4, 0x410428f6    # 8.26f

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v25, -0x406ccccd    # -1.15f

    .line 178
    .line 179
    .line 180
    const v26, -0x3f575c29    # -5.27f

    .line 181
    .line 182
    .line 183
    const v21, -0x407eb852    # -1.01f

    .line 184
    .line 185
    .line 186
    const v22, -0x40466666    # -1.45f

    .line 187
    .line 188
    .line 189
    const/high16 v23, -0x40400000    # -1.5f

    .line 190
    .line 191
    const v24, -0x3faccccd    # -3.3f

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v25, 0x418370a4    # 16.43f

    .line 198
    .line 199
    .line 200
    const v26, 0x4132e148    # 11.18f

    .line 201
    .line 202
    .line 203
    const v21, 0x4139999a    # 11.6f

    .line 204
    .line 205
    .line 206
    const/high16 v22, 0x41600000    # 14.0f

    .line 207
    .line 208
    const v23, 0x415bd70a    # 13.74f

    .line 209
    .line 210
    .line 211
    const v24, 0x413ca3d7    # 11.79f

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v4, 0x40c00000    # 6.0f

    .line 221
    .line 222
    const v6, 0x410e6666    # 8.9f

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v25, 0x40466666    # 3.1f

    .line 229
    .line 230
    .line 231
    const v26, -0x3fb9999a    # -3.1f

    .line 232
    .line 233
    .line 234
    const/16 v21, 0x0

    .line 235
    .line 236
    const v22, -0x40251eb8    # -1.71f

    .line 237
    .line 238
    .line 239
    const v23, 0x3fb1eb85    # 1.39f

    .line 240
    .line 241
    .line 242
    const v24, -0x3fb9999a    # -3.1f

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v4, 0x3fb1eb85    # 1.39f

    .line 249
    .line 250
    .line 251
    const v6, 0x40466666    # 3.1f

    .line 252
    .line 253
    .line 254
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const/high16 v4, 0x40000000    # 2.0f

    .line 258
    .line 259
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v4, 0x410e6666    # 8.9f

    .line 263
    .line 264
    .line 265
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v4, 0x40c00000    # 6.0f

    .line 269
    .line 270
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 277
    .line 278
    .line 279
    move-result-object v2

    .line 280
    const/16 v16, 0x3800

    .line 281
    .line 282
    const/16 v17, 0x0

    .line 283
    .line 284
    const/high16 v6, 0x3f800000    # 1.0f

    .line 285
    .line 286
    const/high16 v8, 0x3f800000    # 1.0f

    .line 287
    .line 288
    const/4 v7, 0x0

    .line 289
    const/high16 v9, 0x3f800000    # 1.0f

    .line 290
    .line 291
    const/high16 v12, 0x3f800000    # 1.0f

    .line 292
    .line 293
    const/4 v13, 0x0

    .line 294
    const/4 v14, 0x0

    .line 295
    const/4 v15, 0x0

    .line 296
    const-string v4, ""

    .line 297
    .line 298
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 299
    .line 300
    .line 301
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 302
    .line 303
    .line 304
    move-result v3

    .line 305
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 306
    .line 307
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 308
    .line 309
    .line 310
    move-result-wide v6

    .line 311
    const/4 v0, 0x0

    .line 312
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 316
    .line 317
    .line 318
    move-result v10

    .line 319
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 320
    .line 321
    .line 322
    move-result v11

    .line 323
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 326
    .line 327
    .line 328
    const/high16 v0, 0x41500000    # 13.0f

    .line 329
    .line 330
    const/high16 v2, 0x41900000    # 18.0f

    .line 331
    .line 332
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v17, -0x3f600000    # -5.0f

    .line 336
    .line 337
    const/high16 v18, 0x40a00000    # 5.0f

    .line 338
    .line 339
    const v13, -0x3fcf5c29    # -2.76f

    .line 340
    .line 341
    .line 342
    const/high16 v15, -0x3f600000    # -5.0f

    .line 343
    .line 344
    const v16, 0x400f5c29    # 2.24f

    .line 345
    .line 346
    .line 347
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v0, 0x400f5c29    # 2.24f

    .line 351
    .line 352
    .line 353
    const/high16 v2, 0x40a00000    # 5.0f

    .line 354
    .line 355
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v0, -0x3ff0a3d7    # -2.24f

    .line 359
    .line 360
    .line 361
    const/high16 v2, -0x3f600000    # -5.0f

    .line 362
    .line 363
    const/high16 v4, 0x40a00000    # 5.0f

    .line 364
    .line 365
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v0, 0x41a6147b    # 20.76f

    .line 369
    .line 370
    .line 371
    const/high16 v2, 0x41500000    # 13.0f

    .line 372
    .line 373
    const/high16 v4, 0x41900000    # 18.0f

    .line 374
    .line 375
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v0, 0x41700000    # 15.0f

    .line 382
    .line 383
    const/high16 v2, 0x41900000    # 18.0f

    .line 384
    .line 385
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 389
    .line 390
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 391
    .line 392
    const v13, 0x3f547ae1    # 0.83f

    .line 393
    .line 394
    .line 395
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 396
    .line 397
    const v16, 0x3f2b851f    # 0.67f

    .line 398
    .line 399
    .line 400
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const v0, 0x4196a3d7    # 18.83f

    .line 404
    .line 405
    .line 406
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v0, -0x40d47ae1    # -0.67f

    .line 410
    .line 411
    .line 412
    const/high16 v2, -0x40400000    # -1.5f

    .line 413
    .line 414
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const v0, 0x41895c29    # 17.17f

    .line 418
    .line 419
    .line 420
    const/high16 v2, 0x41700000    # 15.0f

    .line 421
    .line 422
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v0, 0x41a80000    # 21.0f

    .line 429
    .line 430
    const/high16 v2, 0x41900000    # 18.0f

    .line 431
    .line 432
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v17, -0x3fe147ae    # -2.48f

    .line 436
    .line 437
    .line 438
    const v18, -0x40570a3d    # -1.32f

    .line 439
    .line 440
    .line 441
    const v13, -0x407c28f6    # -1.03f

    .line 442
    .line 443
    .line 444
    const v15, -0x4007ae14    # -1.94f

    .line 445
    .line 446
    .line 447
    const v16, -0x40fae148    # -0.52f

    .line 448
    .line 449
    .line 450
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v17, 0x41900000    # 18.0f

    .line 454
    .line 455
    const/high16 v18, 0x41980000    # 19.0f

    .line 456
    .line 457
    const/high16 v13, 0x41820000    # 16.25f

    .line 458
    .line 459
    const v14, 0x419a147b    # 19.26f

    .line 460
    .line 461
    .line 462
    const v15, 0x4188b852    # 17.09f

    .line 463
    .line 464
    .line 465
    const/high16 v16, 0x41980000    # 19.0f

    .line 466
    .line 467
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v0, 0x401eb852    # 2.48f

    .line 471
    .line 472
    .line 473
    const v2, 0x3f2e147b    # 0.68f

    .line 474
    .line 475
    .line 476
    const/high16 v4, 0x3fe00000    # 1.75f

    .line 477
    .line 478
    const v6, 0x3e851eb8    # 0.26f

    .line 479
    .line 480
    .line 481
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const/high16 v18, 0x41a80000    # 21.0f

    .line 485
    .line 486
    const v13, 0x419f851f    # 19.94f

    .line 487
    .line 488
    .line 489
    const v14, 0x41a3d70a    # 20.48f

    .line 490
    .line 491
    .line 492
    const v15, 0x41983d71    # 19.03f

    .line 493
    .line 494
    .line 495
    const/high16 v16, 0x41a80000    # 21.0f

    .line 496
    .line 497
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 504
    .line 505
    .line 506
    move-result-object v2

    .line 507
    const/16 v16, 0x3800

    .line 508
    .line 509
    const/16 v17, 0x0

    .line 510
    .line 511
    const/high16 v6, 0x3f800000    # 1.0f

    .line 512
    .line 513
    const/4 v7, 0x0

    .line 514
    const/high16 v12, 0x3f800000    # 1.0f

    .line 515
    .line 516
    const/4 v13, 0x0

    .line 517
    const/4 v14, 0x0

    .line 518
    const/4 v15, 0x0

    .line 519
    const-string v4, ""

    .line 520
    .line 521
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 526
    .line 527
    .line 528
    move-result-object v0

    .line 529
    sput-object v0, Landroidx/compose/material/icons/sharp/LockPersonKt;->_lockPerson:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 530
    .line 531
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 532
    .line 533
    .line 534
    return-object v0
.end method
