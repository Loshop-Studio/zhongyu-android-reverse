.class public final Landroidx/compose/material/icons/twotone/WifiPasswordKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_wifiPassword",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "WifiPassword",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getWifiPassword",
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
        "SMAP\nWifiPassword.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WifiPassword.kt\nandroidx/compose/material/icons/twotone/WifiPasswordKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,79:1\n212#2,12:80\n233#2,18:93\n253#2:130\n174#3:92\n705#4,2:111\n717#4,2:113\n719#4,11:119\n72#5,4:115\n*S KotlinDebug\n*F\n+ 1 WifiPassword.kt\nandroidx/compose/material/icons/twotone/WifiPasswordKt\n*L\n29#1:80,12\n30#1:93,18\n30#1:130\n29#1:92\n30#1:111,2\n30#1:113,2\n30#1:119,11\n30#1:115,4\n*E\n"
    }
.end annotation


# static fields
.field private static _wifiPassword:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWifiPassword(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/WifiPasswordKt;->_wifiPassword:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.WifiPassword"

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
    const v0, 0x410fae14    # 8.98f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41c00000    # 24.0f

    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v0, 0x400851ec    # 2.13f

    .line 79
    .line 80
    .line 81
    const v2, -0x3ff851ec    # -2.12f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v17, 0x41400000    # 12.0f

    .line 88
    .line 89
    const/high16 v18, 0x40e00000    # 7.0f

    .line 90
    .line 91
    const v13, 0x419acccd    # 19.35f

    .line 92
    .line 93
    .line 94
    const v14, 0x41091eb8    # 8.57f

    .line 95
    .line 96
    .line 97
    const v15, 0x417d999a    # 15.85f

    .line 98
    .line 99
    .line 100
    const/high16 v16, 0x40e00000    # 7.0f

    .line 101
    .line 102
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v0, -0x3ee1eb85    # -9.88f

    .line 106
    .line 107
    .line 108
    const v2, 0x4083851f    # 4.11f

    .line 109
    .line 110
    .line 111
    const v4, -0x3f14cccd    # -7.35f

    .line 112
    .line 113
    .line 114
    const v6, 0x3fc8f5c3    # 1.57f

    .line 115
    .line 116
    .line 117
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/4 v0, 0x0

    .line 121
    const v2, 0x410fae14    # 8.98f

    .line 122
    .line 123
    .line 124
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v18, 0x40800000    # 4.0f

    .line 128
    .line 129
    const v13, 0x40447ae1    # 3.07f

    .line 130
    .line 131
    .line 132
    const v14, 0x40bccccd    # 5.9f

    .line 133
    .line 134
    .line 135
    const v15, 0x40e9eb85    # 7.31f

    .line 136
    .line 137
    .line 138
    const/high16 v16, 0x40800000    # 4.0f

    .line 139
    .line 140
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v0, 0x41a770a4    # 20.93f

    .line 144
    .line 145
    .line 146
    const v2, 0x40bccccd    # 5.9f

    .line 147
    .line 148
    .line 149
    const v4, 0x410fae14    # 8.98f

    .line 150
    .line 151
    .line 152
    const/high16 v6, 0x41c00000    # 24.0f

    .line 153
    .line 154
    invoke-virtual {v12, v0, v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const/high16 v0, 0x41a00000    # 20.0f

    .line 161
    .line 162
    const/high16 v2, 0x41c00000    # 24.0f

    .line 163
    .line 164
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v0, 0x40400000    # 3.0f

    .line 168
    .line 169
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v17, -0x40800000    # -1.0f

    .line 173
    .line 174
    const/high16 v18, 0x3f800000    # 1.0f

    .line 175
    .line 176
    const/4 v13, 0x0

    .line 177
    const v14, 0x3f0ccccd    # 0.55f

    .line 178
    .line 179
    .line 180
    const v15, -0x4119999a    # -0.45f

    .line 181
    .line 182
    .line 183
    const/high16 v16, 0x3f800000    # 1.0f

    .line 184
    .line 185
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v0, -0x3f800000    # -4.0f

    .line 189
    .line 190
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v18, -0x40800000    # -1.0f

    .line 194
    .line 195
    const v13, -0x40f33333    # -0.55f

    .line 196
    .line 197
    .line 198
    const/4 v14, 0x0

    .line 199
    const/high16 v15, -0x40800000    # -1.0f

    .line 200
    .line 201
    const v16, -0x4119999a    # -0.45f

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 208
    .line 209
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v17, 0x3f800000    # 1.0f

    .line 213
    .line 214
    const/4 v13, 0x0

    .line 215
    const v14, -0x40f33333    # -0.55f

    .line 216
    .line 217
    .line 218
    const v15, 0x3ee66666    # 0.45f

    .line 219
    .line 220
    .line 221
    const/high16 v16, -0x40800000    # -1.0f

    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v0, -0x40800000    # -1.0f

    .line 227
    .line 228
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const/high16 v17, 0x40000000    # 2.0f

    .line 232
    .line 233
    const/high16 v18, -0x40000000    # -2.0f

    .line 234
    .line 235
    const v14, -0x40733333    # -1.1f

    .line 236
    .line 237
    .line 238
    const v15, 0x3f666666    # 0.9f

    .line 239
    .line 240
    .line 241
    const/high16 v16, -0x40000000    # -2.0f

    .line 242
    .line 243
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v0, 0x3f666666    # 0.9f

    .line 247
    .line 248
    .line 249
    const/high16 v2, 0x40000000    # 2.0f

    .line 250
    .line 251
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v0, 0x3f800000    # 1.0f

    .line 255
    .line 256
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v17, 0x41c00000    # 24.0f

    .line 260
    .line 261
    const/high16 v18, 0x41a00000    # 20.0f

    .line 262
    .line 263
    const v13, 0x41bc6666    # 23.55f

    .line 264
    .line 265
    .line 266
    const/high16 v14, 0x41980000    # 19.0f

    .line 267
    .line 268
    const/high16 v15, 0x41c00000    # 24.0f

    .line 269
    .line 270
    const v16, 0x419b999a    # 19.45f

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const/high16 v0, 0x41b00000    # 22.0f

    .line 280
    .line 281
    const/high16 v2, 0x41900000    # 18.0f

    .line 282
    .line 283
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const/high16 v17, -0x40800000    # -1.0f

    .line 287
    .line 288
    const/high16 v18, -0x40800000    # -1.0f

    .line 289
    .line 290
    const/4 v13, 0x0

    .line 291
    const v14, -0x40f33333    # -0.55f

    .line 292
    .line 293
    .line 294
    const v15, -0x4119999a    # -0.45f

    .line 295
    .line 296
    .line 297
    const/high16 v16, -0x40800000    # -1.0f

    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v0, 0x3ee66666    # 0.45f

    .line 303
    .line 304
    .line 305
    const/high16 v2, 0x3f800000    # 1.0f

    .line 306
    .line 307
    const/high16 v4, -0x40800000    # -1.0f

    .line 308
    .line 309
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v0, 0x3f800000    # 1.0f

    .line 313
    .line 314
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const/high16 v0, 0x40000000    # 2.0f

    .line 318
    .line 319
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/high16 v0, 0x41900000    # 18.0f

    .line 323
    .line 324
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v0, 0x4087ae14    # 4.24f

    .line 331
    .line 332
    .line 333
    const v2, 0x4153851f    # 13.22f

    .line 334
    .line 335
    .line 336
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v0, 0x4007ae14    # 2.12f

    .line 340
    .line 341
    .line 342
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v17, 0x41400000    # 12.0f

    .line 346
    .line 347
    const/high16 v18, 0x41500000    # 13.0f

    .line 348
    .line 349
    const v13, 0x40f9999a    # 7.8f

    .line 350
    .line 351
    .line 352
    const v14, 0x415e6666    # 13.9f

    .line 353
    .line 354
    .line 355
    const v15, 0x411ccccd    # 9.8f

    .line 356
    .line 357
    .line 358
    const/high16 v16, 0x41500000    # 13.0f

    .line 359
    .line 360
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const v17, 0x40b47ae1    # 5.64f

    .line 364
    .line 365
    .line 366
    const v18, 0x40166666    # 2.35f

    .line 367
    .line 368
    .line 369
    const v13, 0x400ccccd    # 2.2f

    .line 370
    .line 371
    .line 372
    const/4 v14, 0x0

    .line 373
    const v15, 0x40866666    # 4.2f

    .line 374
    .line 375
    .line 376
    const v16, 0x3f666666    # 0.9f

    .line 377
    .line 378
    .line 379
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v0, -0x3ff851ec    # -2.12f

    .line 383
    .line 384
    .line 385
    const v2, 0x4007ae14    # 2.12f

    .line 386
    .line 387
    .line 388
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v17, 0x41400000    # 12.0f

    .line 392
    .line 393
    const/high16 v18, 0x41200000    # 10.0f

    .line 394
    .line 395
    const v13, 0x418e3d71    # 17.78f

    .line 396
    .line 397
    .line 398
    const v14, 0x4133ae14    # 11.23f

    .line 399
    .line 400
    .line 401
    const v15, 0x41707ae1    # 15.03f

    .line 402
    .line 403
    .line 404
    const/high16 v16, 0x41200000    # 10.0f

    .line 405
    .line 406
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v17, 0x4087ae14    # 4.24f

    .line 410
    .line 411
    .line 412
    const v18, 0x4153851f    # 13.22f

    .line 413
    .line 414
    .line 415
    const v13, 0x410f851f    # 8.97f

    .line 416
    .line 417
    .line 418
    const/high16 v14, 0x41200000    # 10.0f

    .line 419
    .line 420
    const v15, 0x40c70a3d    # 6.22f

    .line 421
    .line 422
    .line 423
    const v16, 0x4133ae14    # 11.23f

    .line 424
    .line 425
    .line 426
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v0, 0x41800000    # 16.0f

    .line 433
    .line 434
    const/high16 v2, 0x41400000    # 12.0f

    .line 435
    .line 436
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v17, -0x3f9e147b    # -3.53f

    .line 440
    .line 441
    .line 442
    const v18, 0x3fbae148    # 1.46f

    .line 443
    .line 444
    .line 445
    const v13, -0x404f5c29    # -1.38f

    .line 446
    .line 447
    .line 448
    const/4 v14, 0x0

    .line 449
    const v15, -0x3fd7ae14    # -2.63f

    .line 450
    .line 451
    .line 452
    const v16, 0x3f0f5c29    # 0.56f

    .line 453
    .line 454
    .line 455
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const/high16 v0, 0x41a80000    # 21.0f

    .line 459
    .line 460
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const v0, 0x4061eb85    # 3.53f

    .line 464
    .line 465
    .line 466
    const v2, -0x3f9d70a4    # -3.54f

    .line 467
    .line 468
    .line 469
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const/high16 v17, 0x41400000    # 12.0f

    .line 473
    .line 474
    const/high16 v18, 0x41800000    # 16.0f

    .line 475
    .line 476
    const v13, 0x416a147b    # 14.63f

    .line 477
    .line 478
    .line 479
    const v14, 0x41847ae1    # 16.56f

    .line 480
    .line 481
    .line 482
    const v15, 0x4156147b    # 13.38f

    .line 483
    .line 484
    .line 485
    const/high16 v16, 0x41800000    # 16.0f

    .line 486
    .line 487
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 494
    .line 495
    .line 496
    move-result-object v2

    .line 497
    const/16 v16, 0x3800

    .line 498
    .line 499
    const/16 v17, 0x0

    .line 500
    .line 501
    const/high16 v6, 0x3f800000    # 1.0f

    .line 502
    .line 503
    const/high16 v8, 0x3f800000    # 1.0f

    .line 504
    .line 505
    const/4 v7, 0x0

    .line 506
    const/high16 v9, 0x3f800000    # 1.0f

    .line 507
    .line 508
    const/high16 v12, 0x3f800000    # 1.0f

    .line 509
    .line 510
    const/4 v13, 0x0

    .line 511
    const/4 v14, 0x0

    .line 512
    const/4 v15, 0x0

    .line 513
    const-string v4, ""

    .line 514
    .line 515
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 520
    .line 521
    .line 522
    move-result-object v0

    .line 523
    sput-object v0, Landroidx/compose/material/icons/twotone/WifiPasswordKt;->_wifiPassword:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 524
    .line 525
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 526
    .line 527
    .line 528
    return-object v0
.end method
