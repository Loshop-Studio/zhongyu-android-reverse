.class public final Landroidx/compose/material/icons/sharp/EmergencyShareKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_emergencyShare",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "EmergencyShare",
        "Landroidx/compose/material/icons/Icons$Sharp;",
        "getEmergencyShare",
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
        "SMAP\nEmergencyShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmergencyShare.kt\nandroidx/compose/material/icons/sharp/EmergencyShareKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,65:1\n212#2,12:66\n233#2,18:79\n253#2:116\n174#3:78\n705#4,2:97\n717#4,2:99\n719#4,11:105\n72#5,4:101\n*S KotlinDebug\n*F\n+ 1 EmergencyShare.kt\nandroidx/compose/material/icons/sharp/EmergencyShareKt\n*L\n29#1:66,12\n30#1:79,18\n30#1:116\n29#1:78\n30#1:97,2\n30#1:99,2\n30#1:105,11\n30#1:101,4\n*E\n"
    }
.end annotation


# static fields
.field private static _emergencyShare:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getEmergencyShare(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/EmergencyShareKt;->_emergencyShare:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.EmergencyShare"

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
    const/high16 v0, 0x41100000    # 9.0f

    .line 71
    .line 72
    const/high16 v2, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x3f400000    # -6.0f

    .line 78
    .line 79
    const v18, 0x40c4cccd    # 6.15f

    .line 80
    .line 81
    .line 82
    const v13, -0x3fb66666    # -3.15f

    .line 83
    .line 84
    .line 85
    const/4 v14, 0x0

    .line 86
    const/high16 v15, -0x3f400000    # -6.0f

    .line 87
    .line 88
    const v16, 0x401a3d71    # 2.41f

    .line 89
    .line 90
    .line 91
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const/high16 v17, 0x40c00000    # 6.0f

    .line 95
    .line 96
    const v18, 0x410d999a    # 8.85f

    .line 97
    .line 98
    .line 99
    const/4 v13, 0x0

    .line 100
    const v14, 0x401f5c29    # 2.49f

    .line 101
    .line 102
    .line 103
    const/high16 v15, 0x40000000    # 2.0f

    .line 104
    .line 105
    const v16, 0x40ae147b    # 5.44f

    .line 106
    .line 107
    .line 108
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v18, -0x3ef26666    # -8.85f

    .line 112
    .line 113
    .line 114
    const/high16 v13, 0x40800000    # 4.0f

    .line 115
    .line 116
    const v14, -0x3fa5c28f    # -3.41f

    .line 117
    .line 118
    .line 119
    const/high16 v15, 0x40c00000    # 6.0f

    .line 120
    .line 121
    const v16, -0x3f347ae1    # -6.36f

    .line 122
    .line 123
    .line 124
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v17, 0x41400000    # 12.0f

    .line 128
    .line 129
    const/high16 v18, 0x41100000    # 9.0f

    .line 130
    .line 131
    const/high16 v13, 0x41900000    # 18.0f

    .line 132
    .line 133
    const v14, 0x41368f5c    # 11.41f

    .line 134
    .line 135
    .line 136
    const v15, 0x41726666    # 15.15f

    .line 137
    .line 138
    .line 139
    const/high16 v16, 0x41100000    # 9.0f

    .line 140
    .line 141
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v0, 0x41840000    # 16.5f

    .line 148
    .line 149
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v17, -0x40400000    # -1.5f

    .line 153
    .line 154
    const/high16 v18, -0x40400000    # -1.5f

    .line 155
    .line 156
    const v13, -0x40ab851f    # -0.83f

    .line 157
    .line 158
    .line 159
    const/4 v14, 0x0

    .line 160
    const/high16 v15, -0x40400000    # -1.5f

    .line 161
    .line 162
    const v16, -0x40d47ae1    # -0.67f

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v0, -0x40400000    # -1.5f

    .line 169
    .line 170
    const v2, 0x3f2b851f    # 0.67f

    .line 171
    .line 172
    .line 173
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 174
    .line 175
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v0, 0x3f2b851f    # 0.67f

    .line 179
    .line 180
    .line 181
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 182
    .line 183
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v0, 0x414d47ae    # 12.83f

    .line 187
    .line 188
    .line 189
    const/high16 v2, 0x41840000    # 16.5f

    .line 190
    .line 191
    const/high16 v4, 0x41400000    # 12.0f

    .line 192
    .line 193
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/high16 v0, 0x40800000    # 4.0f

    .line 200
    .line 201
    const/high16 v2, 0x41400000    # 12.0f

    .line 202
    .line 203
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const v17, 0x409e6666    # 4.95f

    .line 207
    .line 208
    .line 209
    const v18, 0x40033333    # 2.05f

    .line 210
    .line 211
    .line 212
    const v13, 0x3ff70a3d    # 1.93f

    .line 213
    .line 214
    .line 215
    const v15, 0x406b851f    # 3.68f

    .line 216
    .line 217
    .line 218
    const v16, 0x3f47ae14    # 0.78f

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v0, 0x3fb47ae1    # 1.41f

    .line 225
    .line 226
    .line 227
    const v2, -0x404b851f    # -1.41f

    .line 228
    .line 229
    .line 230
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v17, 0x41400000    # 12.0f

    .line 234
    .line 235
    const/high16 v18, 0x40c00000    # 6.0f

    .line 236
    .line 237
    const v13, 0x416a147b    # 14.63f

    .line 238
    .line 239
    .line 240
    const v14, 0x40d1eb85    # 6.56f

    .line 241
    .line 242
    .line 243
    const v15, 0x4156147b    # 13.38f

    .line 244
    .line 245
    .line 246
    const/high16 v16, 0x40c00000    # 6.0f

    .line 247
    .line 248
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v0, 0x41075c29    # 8.46f

    .line 252
    .line 253
    .line 254
    const v2, 0x40eeb852    # 7.46f

    .line 255
    .line 256
    .line 257
    const v4, 0x4115eb85    # 9.37f

    .line 258
    .line 259
    .line 260
    const v6, 0x40d1eb85    # 6.56f

    .line 261
    .line 262
    .line 263
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v0, 0x40e1999a    # 7.05f

    .line 267
    .line 268
    .line 269
    const v2, 0x40c1999a    # 6.05f

    .line 270
    .line 271
    .line 272
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v18, 0x40800000    # 4.0f

    .line 276
    .line 277
    const v13, 0x41051eb8    # 8.32f

    .line 278
    .line 279
    .line 280
    const v14, 0x4098f5c3    # 4.78f

    .line 281
    .line 282
    .line 283
    const v15, 0x41211eb8    # 10.07f

    .line 284
    .line 285
    .line 286
    const/high16 v16, 0x40800000    # 4.0f

    .line 287
    .line 288
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v0, 0x404eb852    # 3.23f

    .line 295
    .line 296
    .line 297
    const v2, 0x419e3d71    # 19.78f

    .line 298
    .line 299
    .line 300
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const v0, 0x3fb47ae1    # 1.41f

    .line 304
    .line 305
    .line 306
    const v2, -0x404b851f    # -1.41f

    .line 307
    .line 308
    .line 309
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v17, 0x414028f6    # 12.01f

    .line 313
    .line 314
    .line 315
    const/high16 v18, 0x40000000    # 2.0f

    .line 316
    .line 317
    const v13, 0x4185eb85    # 16.74f

    .line 318
    .line 319
    .line 320
    const v14, 0x4040a3d7    # 3.01f

    .line 321
    .line 322
    .line 323
    const v15, 0x4167d70a    # 14.49f

    .line 324
    .line 325
    .line 326
    const/high16 v16, 0x40000000    # 2.0f

    .line 327
    .line 328
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v0, 0x40b47ae1    # 5.64f

    .line 332
    .line 333
    .line 334
    const v2, 0x409428f6    # 4.63f

    .line 335
    .line 336
    .line 337
    const v4, 0x40e8a3d7    # 7.27f

    .line 338
    .line 339
    .line 340
    const v6, 0x4040a3d7    # 3.01f

    .line 341
    .line 342
    .line 343
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v0, 0x40870a3d    # 4.22f

    .line 347
    .line 348
    .line 349
    const v2, 0x404e147b    # 3.22f

    .line 350
    .line 351
    .line 352
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/16 v18, 0x0

    .line 356
    .line 357
    const v13, 0x40c70a3d    # 6.22f

    .line 358
    .line 359
    .line 360
    const v14, 0x3f9d70a4    # 1.23f

    .line 361
    .line 362
    .line 363
    const v15, 0x410f851f    # 8.97f

    .line 364
    .line 365
    .line 366
    const/16 v16, 0x0

    .line 367
    .line 368
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v0, 0x418e51ec    # 17.79f

    .line 372
    .line 373
    .line 374
    const v2, 0x3f9d70a4    # 1.23f

    .line 375
    .line 376
    .line 377
    const v4, 0x404eb852    # 3.23f

    .line 378
    .line 379
    .line 380
    const v6, 0x419e3d71    # 19.78f

    .line 381
    .line 382
    .line 383
    invoke-virtual {v12, v0, v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 390
    .line 391
    .line 392
    move-result-object v2

    .line 393
    const/16 v16, 0x3800

    .line 394
    .line 395
    const/16 v17, 0x0

    .line 396
    .line 397
    const/high16 v6, 0x3f800000    # 1.0f

    .line 398
    .line 399
    const/high16 v8, 0x3f800000    # 1.0f

    .line 400
    .line 401
    const/4 v7, 0x0

    .line 402
    const/high16 v9, 0x3f800000    # 1.0f

    .line 403
    .line 404
    const/high16 v12, 0x3f800000    # 1.0f

    .line 405
    .line 406
    const/4 v13, 0x0

    .line 407
    const/4 v14, 0x0

    .line 408
    const/4 v15, 0x0

    .line 409
    const-string v4, ""

    .line 410
    .line 411
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    sput-object v0, Landroidx/compose/material/icons/sharp/EmergencyShareKt;->_emergencyShare:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 420
    .line 421
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 422
    .line 423
    .line 424
    return-object v0
.end method
