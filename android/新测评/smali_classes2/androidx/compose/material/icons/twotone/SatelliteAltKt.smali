.class public final Landroidx/compose/material/icons/twotone/SatelliteAltKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_satelliteAlt",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SatelliteAlt",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getSatelliteAlt",
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
        "SMAP\nSatelliteAlt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SatelliteAlt.kt\nandroidx/compose/material/icons/twotone/SatelliteAltKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,145:1\n212#2,12:146\n233#2,18:159\n253#2:196\n233#2,18:197\n253#2:234\n174#3:158\n705#4,2:177\n717#4,2:179\n719#4,11:185\n705#4,2:215\n717#4,2:217\n719#4,11:223\n72#5,4:181\n72#5,4:219\n*S KotlinDebug\n*F\n+ 1 SatelliteAlt.kt\nandroidx/compose/material/icons/twotone/SatelliteAltKt\n*L\n29#1:146,12\n30#1:159,18\n30#1:196\n62#1:197,18\n62#1:234\n29#1:158\n30#1:177,2\n30#1:179,2\n30#1:185,11\n62#1:215,2\n62#1:217,2\n62#1:223,11\n30#1:181,4\n62#1:219,4\n*E\n"
    }
.end annotation


# static fields
.field private static _satelliteAlt:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSatelliteAlt(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 20

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/SatelliteAltKt;->_satelliteAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.SatelliteAlt"

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
    const v4, 0x419a8f5c    # 19.32f

    .line 71
    .line 72
    .line 73
    const v6, 0x40d33333    # 6.6f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, 0x3f87ae14    # 1.06f

    .line 80
    .line 81
    .line 82
    const v6, -0x407851ec    # -1.06f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v4, 0x4186cccd    # 16.85f

    .line 89
    .line 90
    .line 91
    const/high16 v6, 0x40000000    # 2.0f

    .line 92
    .line 93
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v4, 0x3f87ae14    # 1.06f

    .line 97
    .line 98
    .line 99
    const v6, -0x407851ec    # -1.06f

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v4, 0x419a8f5c    # 19.32f

    .line 106
    .line 107
    .line 108
    const v6, 0x40d33333    # 6.6f

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v4, 0x4189999a    # 17.2f

    .line 118
    .line 119
    .line 120
    const v6, 0x410b851f    # 8.72f

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v4, 0x3f87ae14    # 1.06f

    .line 127
    .line 128
    .line 129
    const v6, -0x407851ec    # -1.06f

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v4, -0x3f9d70a4    # -3.54f

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v4, 0x3f87ae14    # 1.06f

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v4, 0x4189999a    # 17.2f

    .line 148
    .line 149
    .line 150
    const v6, 0x410b851f    # 8.72f

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v4, 0x415ab852    # 13.67f

    .line 160
    .line 161
    .line 162
    const/high16 v6, 0x41440000    # 12.25f

    .line 163
    .line 164
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v4, 0x3fb47ae1    # 1.41f

    .line 168
    .line 169
    .line 170
    const v6, -0x404b851f    # -1.41f

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v4, -0x3f9d70a4    # -3.54f

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v4, 0x3fb47ae1    # 1.41f

    .line 183
    .line 184
    .line 185
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v4, 0x415ab852    # 13.67f

    .line 189
    .line 190
    .line 191
    const/high16 v6, 0x41440000    # 12.25f

    .line 192
    .line 193
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v4, 0x40f51eb8    # 7.66f

    .line 200
    .line 201
    .line 202
    const v6, 0x4192147b    # 18.26f

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const v4, 0x4189999a    # 17.2f

    .line 209
    .line 210
    .line 211
    const v6, 0x410b851f    # 8.72f

    .line 212
    .line 213
    .line 214
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v4, -0x3f9d70a4    # -3.54f

    .line 218
    .line 219
    .line 220
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const v4, 0x3f87ae14    # 1.06f

    .line 224
    .line 225
    .line 226
    const v6, -0x407851ec    # -1.06f

    .line 227
    .line 228
    .line 229
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v4, 0x40f51eb8    # 7.66f

    .line 233
    .line 234
    .line 235
    const v6, 0x4192147b    # 18.26f

    .line 236
    .line 237
    .line 238
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v4, 0x40b147ae    # 5.54f

    .line 245
    .line 246
    .line 247
    const v6, 0x41a30a3d    # 20.38f

    .line 248
    .line 249
    .line 250
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v4, 0x419a8f5c    # 19.32f

    .line 254
    .line 255
    .line 256
    const v6, 0x40d33333    # 6.6f

    .line 257
    .line 258
    .line 259
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v4, -0x3f9d70a4    # -3.54f

    .line 263
    .line 264
    .line 265
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v4, 0x4186cccd    # 16.85f

    .line 269
    .line 270
    .line 271
    const/high16 v6, 0x40000000    # 2.0f

    .line 272
    .line 273
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v4, 0x40b147ae    # 5.54f

    .line 277
    .line 278
    .line 279
    const v6, 0x41a30a3d    # 20.38f

    .line 280
    .line 281
    .line 282
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 289
    .line 290
    .line 291
    move-result-object v2

    .line 292
    const/16 v16, 0x3800

    .line 293
    .line 294
    const/16 v17, 0x0

    .line 295
    .line 296
    const v6, 0x3e99999a    # 0.3f

    .line 297
    .line 298
    .line 299
    const v8, 0x3e99999a    # 0.3f

    .line 300
    .line 301
    .line 302
    const/4 v7, 0x0

    .line 303
    const/high16 v9, 0x3f800000    # 1.0f

    .line 304
    .line 305
    const/high16 v12, 0x3f800000    # 1.0f

    .line 306
    .line 307
    const/4 v13, 0x0

    .line 308
    const/4 v14, 0x0

    .line 309
    const/4 v15, 0x0

    .line 310
    const-string v4, ""

    .line 311
    .line 312
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 313
    .line 314
    .line 315
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 316
    .line 317
    .line 318
    move-result v3

    .line 319
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 320
    .line 321
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 322
    .line 323
    .line 324
    move-result-wide v6

    .line 325
    const/4 v0, 0x0

    .line 326
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 330
    .line 331
    .line 332
    move-result v10

    .line 333
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 334
    .line 335
    .line 336
    move-result v11

    .line 337
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 340
    .line 341
    .line 342
    const v0, 0x41770a3d    # 15.44f

    .line 343
    .line 344
    .line 345
    const v2, 0x3f170a3d    # 0.59f

    .line 346
    .line 347
    .line 348
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v0, 0x404b851f    # 3.18f

    .line 352
    .line 353
    .line 354
    const v2, -0x3fb47ae1    # -3.18f

    .line 355
    .line 356
    .line 357
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/16 v17, 0x0

    .line 361
    .line 362
    const v18, 0x40351eb8    # 2.83f

    .line 363
    .line 364
    .line 365
    const v13, -0x40b851ec    # -0.78f

    .line 366
    .line 367
    .line 368
    const v14, 0x3f47ae14    # 0.78f

    .line 369
    .line 370
    .line 371
    const v15, -0x40b851ec    # -0.78f

    .line 372
    .line 373
    .line 374
    const v16, 0x40033333    # 2.05f

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v0, 0x3f9eb852    # 1.24f

    .line 381
    .line 382
    .line 383
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v0, 0x3f35c28f    # 0.71f

    .line 387
    .line 388
    .line 389
    const v2, -0x40ca3d71    # -0.71f

    .line 390
    .line 391
    .line 392
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const v0, 0x4138cccd    # 11.55f

    .line 396
    .line 397
    .line 398
    const v2, 0x40e9999a    # 7.3f

    .line 399
    .line 400
    .line 401
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v17, -0x3fcae148    # -2.83f

    .line 405
    .line 406
    .line 407
    const/16 v18, 0x0

    .line 408
    .line 409
    const v14, -0x40b851ec    # -0.78f

    .line 410
    .line 411
    .line 412
    const v15, -0x3ffccccd    # -2.05f

    .line 413
    .line 414
    .line 415
    const v16, -0x40b851ec    # -0.78f

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v0, 0x40e9999a    # 7.3f

    .line 422
    .line 423
    .line 424
    const v2, 0x410b851f    # 8.72f

    .line 425
    .line 426
    .line 427
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/16 v17, 0x0

    .line 431
    .line 432
    const v18, 0x40351eb8    # 2.83f

    .line 433
    .line 434
    .line 435
    const v14, 0x3f47ae14    # 0.78f

    .line 436
    .line 437
    .line 438
    const v15, -0x40b851ec    # -0.78f

    .line 439
    .line 440
    .line 441
    const v16, 0x40033333    # 2.05f

    .line 442
    .line 443
    .line 444
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v0, 0x3f9eb852    # 1.24f

    .line 448
    .line 449
    .line 450
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v0, 0x3f35c28f    # 0.71f

    .line 454
    .line 455
    .line 456
    const v2, -0x40ca3d71    # -0.71f

    .line 457
    .line 458
    .line 459
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const/high16 v0, 0x41440000    # 12.25f

    .line 463
    .line 464
    const v2, 0x40d33333    # 6.6f

    .line 465
    .line 466
    .line 467
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v17, -0x3fcae148    # -2.83f

    .line 471
    .line 472
    .line 473
    const/16 v18, 0x0

    .line 474
    .line 475
    const v14, -0x40b851ec    # -0.78f

    .line 476
    .line 477
    .line 478
    const v15, -0x3ffccccd    # -2.05f

    .line 479
    .line 480
    .line 481
    const v16, -0x40b851ec    # -0.78f

    .line 482
    .line 483
    .line 484
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v0, 0x404b851f    # 3.18f

    .line 488
    .line 489
    .line 490
    const v2, -0x3fb47ae1    # -3.18f

    .line 491
    .line 492
    .line 493
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const/16 v17, 0x0

    .line 497
    .line 498
    const v18, 0x40351eb8    # 2.83f

    .line 499
    .line 500
    .line 501
    const v14, 0x3f47ae14    # 0.78f

    .line 502
    .line 503
    .line 504
    const v15, -0x40b851ec    # -0.78f

    .line 505
    .line 506
    .line 507
    const v16, 0x40033333    # 2.05f

    .line 508
    .line 509
    .line 510
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v0, 0x40628f5c    # 3.54f

    .line 514
    .line 515
    .line 516
    const v2, 0x40628f5c    # 3.54f

    .line 517
    .line 518
    .line 519
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const v17, 0x40351eb8    # 2.83f

    .line 523
    .line 524
    .line 525
    const/16 v18, 0x0

    .line 526
    .line 527
    const v13, 0x3f47ae14    # 0.78f

    .line 528
    .line 529
    .line 530
    const v15, 0x40033333    # 2.05f

    .line 531
    .line 532
    .line 533
    const v16, 0x3f47ae14    # 0.78f

    .line 534
    .line 535
    .line 536
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const v0, 0x404b851f    # 3.18f

    .line 540
    .line 541
    .line 542
    const v2, -0x3fb47ae1    # -3.18f

    .line 543
    .line 544
    .line 545
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const/16 v17, 0x0

    .line 549
    .line 550
    const v18, -0x3fcae148    # -2.83f

    .line 551
    .line 552
    .line 553
    const v14, -0x40b851ec    # -0.78f

    .line 554
    .line 555
    .line 556
    const v15, 0x3f47ae14    # 0.78f

    .line 557
    .line 558
    .line 559
    const v16, -0x3ffccccd    # -2.05f

    .line 560
    .line 561
    .line 562
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const v0, -0x406147ae    # -1.24f

    .line 566
    .line 567
    .line 568
    const v2, -0x406147ae    # -1.24f

    .line 569
    .line 570
    .line 571
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const v0, 0x3f35c28f    # 0.71f

    .line 575
    .line 576
    .line 577
    const v2, -0x40ca3d71    # -0.71f

    .line 578
    .line 579
    .line 580
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const v0, 0x3f9eb852    # 1.24f

    .line 584
    .line 585
    .line 586
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const v17, 0x40351eb8    # 2.83f

    .line 590
    .line 591
    .line 592
    const/16 v18, 0x0

    .line 593
    .line 594
    const v14, 0x3f47ae14    # 0.78f

    .line 595
    .line 596
    .line 597
    const v15, 0x40033333    # 2.05f

    .line 598
    .line 599
    .line 600
    const v16, 0x3f47ae14    # 0.78f

    .line 601
    .line 602
    .line 603
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const v0, 0x3fb47ae1    # 1.41f

    .line 607
    .line 608
    .line 609
    const v2, -0x404b851f    # -1.41f

    .line 610
    .line 611
    .line 612
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const/16 v17, 0x0

    .line 616
    .line 617
    const v18, -0x3fcae148    # -2.83f

    .line 618
    .line 619
    .line 620
    const v14, -0x40b851ec    # -0.78f

    .line 621
    .line 622
    .line 623
    const v15, 0x3f47ae14    # 0.78f

    .line 624
    .line 625
    .line 626
    const v16, -0x3ffccccd    # -2.05f

    .line 627
    .line 628
    .line 629
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const v0, 0x415d70a4    # 13.84f

    .line 633
    .line 634
    .line 635
    const v2, 0x4119999a    # 9.6f

    .line 636
    .line 637
    .line 638
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const v0, 0x3f35c28f    # 0.71f

    .line 642
    .line 643
    .line 644
    const v2, -0x40ca3d71    # -0.71f

    .line 645
    .line 646
    .line 647
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const v0, 0x3f9eb852    # 1.24f

    .line 651
    .line 652
    .line 653
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const v17, 0x40351eb8    # 2.83f

    .line 657
    .line 658
    .line 659
    const/16 v18, 0x0

    .line 660
    .line 661
    const v14, 0x3f47ae14    # 0.78f

    .line 662
    .line 663
    .line 664
    const v15, 0x40033333    # 2.05f

    .line 665
    .line 666
    .line 667
    const v16, 0x3f47ae14    # 0.78f

    .line 668
    .line 669
    .line 670
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 671
    .line 672
    .line 673
    const v0, 0x404b851f    # 3.18f

    .line 674
    .line 675
    .line 676
    const v2, -0x3fb47ae1    # -3.18f

    .line 677
    .line 678
    .line 679
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    const/16 v17, 0x0

    .line 683
    .line 684
    const v18, -0x3fcae148    # -2.83f

    .line 685
    .line 686
    .line 687
    const v14, -0x40b851ec    # -0.78f

    .line 688
    .line 689
    .line 690
    const v15, 0x3f47ae14    # 0.78f

    .line 691
    .line 692
    .line 693
    const v16, -0x3ffccccd    # -2.05f

    .line 694
    .line 695
    .line 696
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    .line 699
    const v0, -0x3f9d70a4    # -3.54f

    .line 700
    .line 701
    .line 702
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 703
    .line 704
    .line 705
    const v17, 0x41770a3d    # 15.44f

    .line 706
    .line 707
    .line 708
    const v18, 0x3f170a3d    # 0.59f

    .line 709
    .line 710
    .line 711
    const v13, 0x418bd70a    # 17.48f

    .line 712
    .line 713
    .line 714
    const v14, -0x41b33333    # -0.2f

    .line 715
    .line 716
    .line 717
    const v15, 0x4181c28f    # 16.22f

    .line 718
    .line 719
    .line 720
    const v16, -0x41b33333    # -0.2f

    .line 721
    .line 722
    .line 723
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 724
    .line 725
    .line 726
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 727
    .line 728
    .line 729
    const v0, 0x419a8f5c    # 19.32f

    .line 730
    .line 731
    .line 732
    const v2, 0x40d33333    # 6.6f

    .line 733
    .line 734
    .line 735
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 736
    .line 737
    .line 738
    const v0, 0x3f87ae14    # 1.06f

    .line 739
    .line 740
    .line 741
    const v2, -0x407851ec    # -1.06f

    .line 742
    .line 743
    .line 744
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 745
    .line 746
    .line 747
    const v0, 0x4186cccd    # 16.85f

    .line 748
    .line 749
    .line 750
    const/high16 v2, 0x40000000    # 2.0f

    .line 751
    .line 752
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 753
    .line 754
    .line 755
    const v0, 0x3f87ae14    # 1.06f

    .line 756
    .line 757
    .line 758
    const v2, -0x407851ec    # -1.06f

    .line 759
    .line 760
    .line 761
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 762
    .line 763
    .line 764
    const v0, 0x419a8f5c    # 19.32f

    .line 765
    .line 766
    .line 767
    const v2, 0x40d33333    # 6.6f

    .line 768
    .line 769
    .line 770
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 771
    .line 772
    .line 773
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 774
    .line 775
    .line 776
    const v0, 0x4189999a    # 17.2f

    .line 777
    .line 778
    .line 779
    const v2, 0x410b851f    # 8.72f

    .line 780
    .line 781
    .line 782
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 783
    .line 784
    .line 785
    const v0, 0x3f87ae14    # 1.06f

    .line 786
    .line 787
    .line 788
    const v2, -0x407851ec    # -1.06f

    .line 789
    .line 790
    .line 791
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 792
    .line 793
    .line 794
    const v0, -0x3f9d70a4    # -3.54f

    .line 795
    .line 796
    .line 797
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 798
    .line 799
    .line 800
    const v0, 0x3f87ae14    # 1.06f

    .line 801
    .line 802
    .line 803
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 804
    .line 805
    .line 806
    const v0, 0x4189999a    # 17.2f

    .line 807
    .line 808
    .line 809
    const v2, 0x410b851f    # 8.72f

    .line 810
    .line 811
    .line 812
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 813
    .line 814
    .line 815
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 816
    .line 817
    .line 818
    const v0, 0x415ab852    # 13.67f

    .line 819
    .line 820
    .line 821
    const/high16 v2, 0x41440000    # 12.25f

    .line 822
    .line 823
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 824
    .line 825
    .line 826
    const v0, 0x3fb47ae1    # 1.41f

    .line 827
    .line 828
    .line 829
    const v2, -0x404b851f    # -1.41f

    .line 830
    .line 831
    .line 832
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 833
    .line 834
    .line 835
    const v0, -0x3f9d70a4    # -3.54f

    .line 836
    .line 837
    .line 838
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 839
    .line 840
    .line 841
    const v0, 0x3fb47ae1    # 1.41f

    .line 842
    .line 843
    .line 844
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 845
    .line 846
    .line 847
    const v0, 0x415ab852    # 13.67f

    .line 848
    .line 849
    .line 850
    const/high16 v2, 0x41440000    # 12.25f

    .line 851
    .line 852
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 853
    .line 854
    .line 855
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 856
    .line 857
    .line 858
    const v0, 0x40f51eb8    # 7.66f

    .line 859
    .line 860
    .line 861
    const v2, 0x4192147b    # 18.26f

    .line 862
    .line 863
    .line 864
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 865
    .line 866
    .line 867
    const v0, 0x4189999a    # 17.2f

    .line 868
    .line 869
    .line 870
    const v2, 0x410b851f    # 8.72f

    .line 871
    .line 872
    .line 873
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 874
    .line 875
    .line 876
    const v0, -0x3f9d70a4    # -3.54f

    .line 877
    .line 878
    .line 879
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 880
    .line 881
    .line 882
    const v0, 0x3f87ae14    # 1.06f

    .line 883
    .line 884
    .line 885
    const v2, -0x407851ec    # -1.06f

    .line 886
    .line 887
    .line 888
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 889
    .line 890
    .line 891
    const v0, 0x40f51eb8    # 7.66f

    .line 892
    .line 893
    .line 894
    const v2, 0x4192147b    # 18.26f

    .line 895
    .line 896
    .line 897
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 898
    .line 899
    .line 900
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 901
    .line 902
    .line 903
    const v0, 0x40b147ae    # 5.54f

    .line 904
    .line 905
    .line 906
    const v2, 0x41a30a3d    # 20.38f

    .line 907
    .line 908
    .line 909
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 910
    .line 911
    .line 912
    const v0, 0x419a8f5c    # 19.32f

    .line 913
    .line 914
    .line 915
    const v2, 0x40d33333    # 6.6f

    .line 916
    .line 917
    .line 918
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 919
    .line 920
    .line 921
    const v0, -0x3f9d70a4    # -3.54f

    .line 922
    .line 923
    .line 924
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 925
    .line 926
    .line 927
    const v0, 0x4186cccd    # 16.85f

    .line 928
    .line 929
    .line 930
    const/high16 v2, 0x40000000    # 2.0f

    .line 931
    .line 932
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 933
    .line 934
    .line 935
    const v0, 0x40b147ae    # 5.54f

    .line 936
    .line 937
    .line 938
    const v2, 0x41a30a3d    # 20.38f

    .line 939
    .line 940
    .line 941
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 942
    .line 943
    .line 944
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 945
    .line 946
    .line 947
    const/high16 v0, 0x41a80000    # 21.0f

    .line 948
    .line 949
    const/high16 v2, 0x41600000    # 14.0f

    .line 950
    .line 951
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 952
    .line 953
    .line 954
    const/4 v0, 0x0

    .line 955
    const/high16 v2, 0x40000000    # 2.0f

    .line 956
    .line 957
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 958
    .line 959
    .line 960
    const/high16 v17, -0x3ef00000    # -9.0f

    .line 961
    .line 962
    const/high16 v18, 0x41100000    # 9.0f

    .line 963
    .line 964
    const/4 v13, 0x0

    .line 965
    const v14, 0x409f0a3d    # 4.97f

    .line 966
    .line 967
    .line 968
    const v15, -0x3f7f0a3d    # -4.03f

    .line 969
    .line 970
    .line 971
    const/high16 v16, 0x41100000    # 9.0f

    .line 972
    .line 973
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 974
    .line 975
    .line 976
    const/high16 v2, -0x40000000    # -2.0f

    .line 977
    .line 978
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 979
    .line 980
    .line 981
    const/high16 v17, 0x41a80000    # 21.0f

    .line 982
    .line 983
    const/high16 v18, 0x41600000    # 14.0f

    .line 984
    .line 985
    const v13, 0x418ef5c3    # 17.87f

    .line 986
    .line 987
    .line 988
    const/high16 v14, 0x41a80000    # 21.0f

    .line 989
    .line 990
    const/high16 v15, 0x41a80000    # 21.0f

    .line 991
    .line 992
    const v16, 0x418ef5c3    # 17.87f

    .line 993
    .line 994
    .line 995
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 996
    .line 997
    .line 998
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 999
    .line 1000
    .line 1001
    const/high16 v0, 0x41880000    # 17.0f

    .line 1002
    .line 1003
    const/high16 v2, 0x41600000    # 14.0f

    .line 1004
    .line 1005
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1006
    .line 1007
    .line 1008
    const/4 v0, 0x0

    .line 1009
    const/high16 v2, 0x40000000    # 2.0f

    .line 1010
    .line 1011
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1012
    .line 1013
    .line 1014
    const/high16 v17, -0x3f600000    # -5.0f

    .line 1015
    .line 1016
    const/high16 v18, 0x40a00000    # 5.0f

    .line 1017
    .line 1018
    const/4 v13, 0x0

    .line 1019
    const v14, 0x4030a3d7    # 2.76f

    .line 1020
    .line 1021
    .line 1022
    const v15, -0x3ff0a3d7    # -2.24f

    .line 1023
    .line 1024
    .line 1025
    const/high16 v16, 0x40a00000    # 5.0f

    .line 1026
    .line 1027
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1028
    .line 1029
    .line 1030
    const/high16 v2, -0x40000000    # -2.0f

    .line 1031
    .line 1032
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1033
    .line 1034
    .line 1035
    const/high16 v17, 0x41880000    # 17.0f

    .line 1036
    .line 1037
    const/high16 v18, 0x41600000    # 14.0f

    .line 1038
    .line 1039
    const v13, 0x417a8f5c    # 15.66f

    .line 1040
    .line 1041
    .line 1042
    const/high16 v14, 0x41880000    # 17.0f

    .line 1043
    .line 1044
    const/high16 v15, 0x41880000    # 17.0f

    .line 1045
    .line 1046
    const v16, 0x417a8f5c    # 15.66f

    .line 1047
    .line 1048
    .line 1049
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1050
    .line 1051
    .line 1052
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1053
    .line 1054
    .line 1055
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v2

    .line 1059
    const/16 v16, 0x3800

    .line 1060
    .line 1061
    const/16 v17, 0x0

    .line 1062
    .line 1063
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1064
    .line 1065
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1066
    .line 1067
    const/4 v7, 0x0

    .line 1068
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1069
    .line 1070
    const/4 v13, 0x0

    .line 1071
    const/4 v14, 0x0

    .line 1072
    const/4 v15, 0x0

    .line 1073
    const-string v4, ""

    .line 1074
    .line 1075
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v0

    .line 1079
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v0

    .line 1083
    sput-object v0, Landroidx/compose/material/icons/twotone/SatelliteAltKt;->_satelliteAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1084
    .line 1085
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1086
    .line 1087
    .line 1088
    return-object v0
.end method
