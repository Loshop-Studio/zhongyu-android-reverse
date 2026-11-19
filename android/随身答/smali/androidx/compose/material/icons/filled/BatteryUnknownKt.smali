.class public final Landroidx/compose/material/icons/filled/BatteryUnknownKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00038FX\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "_batteryUnknown",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "BatteryUnknown",
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getBatteryUnknown$annotations",
        "(Landroidx/compose/material/icons/Icons$Filled;)V",
        "getBatteryUnknown",
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
        "SMAP\nBatteryUnknown.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BatteryUnknown.kt\nandroidx/compose/material/icons/filled/BatteryUnknownKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,77:1\n212#2,12:78\n233#2,18:91\n253#2:128\n174#3:90\n705#4,2:109\n717#4,2:111\n719#4,11:117\n72#5,4:113\n*S KotlinDebug\n*F\n+ 1 BatteryUnknown.kt\nandroidx/compose/material/icons/filled/BatteryUnknownKt\n*L\n35#1:78,12\n36#1:91,18\n36#1:128\n35#1:90\n36#1:109,2\n36#1:111,2\n36#1:117,11\n36#1:113,4\n*E\n"
    }
.end annotation


# static fields
.field private static _batteryUnknown:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBatteryUnknown(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/BatteryUnknownKt;->_batteryUnknown:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.BatteryUnknown"

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
    const v0, 0x417ab852    # 15.67f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x40800000    # 4.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v0, 0x41600000    # 14.0f

    .line 79
    .line 80
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v0, 0x40000000    # 2.0f

    .line 84
    .line 85
    const/high16 v2, 0x41600000    # 14.0f

    .line 86
    .line 87
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    .line 90
    const/high16 v0, -0x3f800000    # -4.0f

    .line 91
    .line 92
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const/high16 v0, 0x40000000    # 2.0f

    .line 96
    .line 97
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v0, 0x410547ae    # 8.33f

    .line 101
    .line 102
    .line 103
    const/high16 v2, 0x40800000    # 4.0f

    .line 104
    .line 105
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const/high16 v17, 0x40e00000    # 7.0f

    .line 109
    .line 110
    const v18, 0x40aa8f5c    # 5.33f

    .line 111
    .line 112
    .line 113
    const v13, 0x40f33333    # 7.6f

    .line 114
    .line 115
    .line 116
    const/high16 v14, 0x40800000    # 4.0f

    .line 117
    .line 118
    const/high16 v15, 0x40e00000    # 7.0f

    .line 119
    .line 120
    const v16, 0x40933333    # 4.6f

    .line 121
    .line 122
    .line 123
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v0, 0x417547ae    # 15.33f

    .line 127
    .line 128
    .line 129
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v17, 0x410547ae    # 8.33f

    .line 133
    .line 134
    .line 135
    const/high16 v18, 0x41b00000    # 22.0f

    .line 136
    .line 137
    const/high16 v13, 0x40e00000    # 7.0f

    .line 138
    .line 139
    const v14, 0x41ab3333    # 21.4f

    .line 140
    .line 141
    .line 142
    const v15, 0x40f33333    # 7.6f

    .line 143
    .line 144
    .line 145
    const/high16 v16, 0x41b00000    # 22.0f

    .line 146
    .line 147
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v0, 0x40ea8f5c    # 7.33f

    .line 151
    .line 152
    .line 153
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v17, 0x3fab851f    # 1.34f

    .line 157
    .line 158
    .line 159
    const v18, -0x4055c28f    # -1.33f

    .line 160
    .line 161
    .line 162
    const v13, 0x3f3d70a4    # 0.74f

    .line 163
    .line 164
    .line 165
    const/4 v14, 0x0

    .line 166
    const v15, 0x3fab851f    # 1.34f

    .line 167
    .line 168
    .line 169
    const v16, -0x40e66666    # -0.6f

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const/high16 v0, 0x41880000    # 17.0f

    .line 176
    .line 177
    const v2, 0x40aa8f5c    # 5.33f

    .line 178
    .line 179
    .line 180
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v17, 0x417ab852    # 15.67f

    .line 184
    .line 185
    .line 186
    const/high16 v18, 0x40800000    # 4.0f

    .line 187
    .line 188
    const/high16 v13, 0x41880000    # 17.0f

    .line 189
    .line 190
    const v14, 0x40933333    # 4.6f

    .line 191
    .line 192
    .line 193
    const v15, 0x41833333    # 16.4f

    .line 194
    .line 195
    .line 196
    const/high16 v16, 0x40800000    # 4.0f

    .line 197
    .line 198
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v0, 0x414f3333    # 12.95f

    .line 205
    .line 206
    .line 207
    const v2, 0x418f999a    # 17.95f

    .line 208
    .line 209
    .line 210
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v0, -0x400ccccd    # -1.9f

    .line 214
    .line 215
    .line 216
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v0, 0x3ff33333    # 1.9f

    .line 223
    .line 224
    .line 225
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v0, 0x4164cccd    # 14.3f

    .line 235
    .line 236
    .line 237
    const v2, 0x414b0a3d    # 12.69f

    .line 238
    .line 239
    .line 240
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v0, -0x40d47ae1    # -0.67f

    .line 244
    .line 245
    .line 246
    const v2, 0x3f35c28f    # 0.71f

    .line 247
    .line 248
    .line 249
    const v4, -0x413d70a4    # -0.38f

    .line 250
    .line 251
    .line 252
    const v6, 0x3ed70a3d    # 0.42f

    .line 253
    .line 254
    .line 255
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const v17, -0x40ab851f    # -0.83f

    .line 259
    .line 260
    .line 261
    const v18, 0x3fcccccd    # 1.6f

    .line 262
    .line 263
    .line 264
    const v13, -0x410a3d71    # -0.48f

    .line 265
    .line 266
    .line 267
    const v14, 0x3ef5c28f    # 0.48f

    .line 268
    .line 269
    .line 270
    const v15, -0x40ab851f    # -0.83f

    .line 271
    .line 272
    .line 273
    const v16, 0x3f933333    # 1.15f

    .line 274
    .line 275
    .line 276
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v0, -0x40333333    # -1.6f

    .line 280
    .line 281
    .line 282
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v17, 0x3f6e147b    # 0.93f

    .line 286
    .line 287
    .line 288
    const/high16 v18, -0x40000000    # -2.0f

    .line 289
    .line 290
    const/4 v13, 0x0

    .line 291
    const v14, -0x40ab851f    # -0.83f

    .line 292
    .line 293
    .line 294
    const v15, 0x3eeb851f    # 0.46f

    .line 295
    .line 296
    .line 297
    const v16, -0x403d70a4    # -1.52f

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const v0, 0x3f6e147b    # 0.93f

    .line 304
    .line 305
    .line 306
    const v2, -0x408f5c29    # -0.94f

    .line 307
    .line 308
    .line 309
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v17, 0x3ee147ae    # 0.44f

    .line 313
    .line 314
    .line 315
    const v18, -0x407851ec    # -1.06f

    .line 316
    .line 317
    .line 318
    const v13, 0x3e8a3d71    # 0.27f

    .line 319
    .line 320
    .line 321
    const v14, -0x4175c28f    # -0.27f

    .line 322
    .line 323
    .line 324
    const v15, 0x3ee147ae    # 0.44f

    .line 325
    .line 326
    .line 327
    const v16, -0x40d9999a    # -0.65f

    .line 328
    .line 329
    .line 330
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const/high16 v17, -0x40400000    # -1.5f

    .line 334
    .line 335
    const/high16 v18, -0x40400000    # -1.5f

    .line 336
    .line 337
    const/4 v13, 0x0

    .line 338
    const v14, -0x40ab851f    # -0.83f

    .line 339
    .line 340
    .line 341
    const v15, -0x40d47ae1    # -0.67f

    .line 342
    .line 343
    .line 344
    const/high16 v16, -0x40400000    # -1.5f

    .line 345
    .line 346
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v0, 0x3f2b851f    # 0.67f

    .line 350
    .line 351
    .line 352
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 353
    .line 354
    const/high16 v4, -0x40400000    # -1.5f

    .line 355
    .line 356
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const/high16 v0, 0x41100000    # 9.0f

    .line 360
    .line 361
    const/high16 v2, 0x41300000    # 11.0f

    .line 362
    .line 363
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const/high16 v17, 0x40400000    # 3.0f

    .line 367
    .line 368
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 369
    .line 370
    const v14, -0x402b851f    # -1.66f

    .line 371
    .line 372
    .line 373
    const v15, 0x3fab851f    # 1.34f

    .line 374
    .line 375
    .line 376
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 377
    .line 378
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v0, 0x3fab851f    # 1.34f

    .line 382
    .line 383
    .line 384
    const/high16 v2, 0x40400000    # 3.0f

    .line 385
    .line 386
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v17, -0x40cccccd    # -0.7f

    .line 390
    .line 391
    .line 392
    const v18, 0x3fd851ec    # 1.69f

    .line 393
    .line 394
    .line 395
    const v14, 0x3f28f5c3    # 0.66f

    .line 396
    .line 397
    .line 398
    const v15, -0x4175c28f    # -0.27f

    .line 399
    .line 400
    .line 401
    const v16, 0x3fa147ae    # 1.26f

    .line 402
    .line 403
    .line 404
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 411
    .line 412
    .line 413
    move-result-object v2

    .line 414
    const/16 v16, 0x3800

    .line 415
    .line 416
    const/16 v17, 0x0

    .line 417
    .line 418
    const/high16 v6, 0x3f800000    # 1.0f

    .line 419
    .line 420
    const/high16 v8, 0x3f800000    # 1.0f

    .line 421
    .line 422
    const/4 v7, 0x0

    .line 423
    const/high16 v9, 0x3f800000    # 1.0f

    .line 424
    .line 425
    const/high16 v12, 0x3f800000    # 1.0f

    .line 426
    .line 427
    const/4 v14, 0x0

    .line 428
    const/4 v15, 0x0

    .line 429
    const-string v4, ""

    .line 430
    .line 431
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    sput-object v0, Landroidx/compose/material/icons/filled/BatteryUnknownKt;->_batteryUnknown:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 440
    .line 441
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 442
    .line 443
    .line 444
    return-object v0
.end method

.method public static synthetic getBatteryUnknown$annotations(Landroidx/compose/material/icons/Icons$Filled;)V
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        message = "Use the AutoMirrored version at Icons.AutoMirrored.Filled.BatteryUnknown"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "Icons.AutoMirrored.Filled.BatteryUnknown"
            imports = {
                "androidx.compose.material.icons.automirrored.filled.BatteryUnknown"
            }
        .end subannotation
    .end annotation

    return-void
.end method
