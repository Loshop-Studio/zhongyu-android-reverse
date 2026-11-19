.class public final Landroidx/compose/material/icons/outlined/VpnLockKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_vpnLock",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "VpnLock",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getVpnLock",
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
        "SMAP\nVpnLock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VpnLock.kt\nandroidx/compose/material/icons/outlined/VpnLockKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,87:1\n212#2,12:88\n233#2,18:101\n253#2:138\n174#3:100\n705#4,2:119\n717#4,2:121\n719#4,11:127\n72#5,4:123\n*S KotlinDebug\n*F\n+ 1 VpnLock.kt\nandroidx/compose/material/icons/outlined/VpnLockKt\n*L\n29#1:88,12\n30#1:101,18\n30#1:138\n29#1:100\n30#1:119,2\n30#1:121,2\n30#1:127,11\n30#1:123,4\n*E\n"
    }
.end annotation


# static fields
.field private static _vpnLock:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getVpnLock(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/VpnLockKt;->_vpnLock:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.VpnLock"

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
    const v0, 0x41975c29    # 18.92f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41400000    # 12.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v17, 0x3da3d70a    # 0.08f

    .line 79
    .line 80
    .line 81
    const/high16 v18, 0x3f800000    # 1.0f

    .line 82
    .line 83
    const v13, 0x3d23d70a    # 0.04f

    .line 84
    .line 85
    .line 86
    const v14, 0x3ea8f5c3    # 0.33f

    .line 87
    .line 88
    .line 89
    const v15, 0x3da3d70a    # 0.08f

    .line 90
    .line 91
    .line 92
    const v16, 0x3f28f5c3    # 0.66f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v17, -0x3ff9999a    # -2.1f

    .line 99
    .line 100
    .line 101
    const v18, 0x40ac7ae1    # 5.39f

    .line 102
    .line 103
    .line 104
    const/4 v13, 0x0

    .line 105
    const v14, 0x40051eb8    # 2.08f

    .line 106
    .line 107
    .line 108
    const v15, -0x40b33333    # -0.8f

    .line 109
    .line 110
    .line 111
    const v16, 0x407e147b    # 3.97f

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v17, -0x400ccccd    # -1.9f

    .line 118
    .line 119
    .line 120
    const v18, -0x404e147b    # -1.39f

    .line 121
    .line 122
    .line 123
    const v13, -0x417ae148    # -0.26f

    .line 124
    .line 125
    .line 126
    const v14, -0x40b0a3d7    # -0.81f

    .line 127
    .line 128
    .line 129
    const/high16 v15, -0x40800000    # -1.0f

    .line 130
    .line 131
    const v16, -0x404e147b    # -1.39f

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v0, -0x40800000    # -1.0f

    .line 138
    .line 139
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 143
    .line 144
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v17, -0x40800000    # -1.0f

    .line 148
    .line 149
    const/high16 v18, -0x40800000    # -1.0f

    .line 150
    .line 151
    const/4 v13, 0x0

    .line 152
    const v14, -0x40f33333    # -0.55f

    .line 153
    .line 154
    .line 155
    const v15, -0x4119999a    # -0.45f

    .line 156
    .line 157
    .line 158
    const/high16 v16, -0x40800000    # -1.0f

    .line 159
    .line 160
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/high16 v0, 0x40e00000    # 7.0f

    .line 164
    .line 165
    const/high16 v2, 0x41500000    # 13.0f

    .line 166
    .line 167
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v0, -0x40000000    # -2.0f

    .line 171
    .line 172
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const/high16 v0, 0x40000000    # 2.0f

    .line 176
    .line 177
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const/high16 v17, 0x3f800000    # 1.0f

    .line 181
    .line 182
    const v13, 0x3f0ccccd    # 0.55f

    .line 183
    .line 184
    .line 185
    const/4 v14, 0x0

    .line 186
    const/high16 v15, 0x3f800000    # 1.0f

    .line 187
    .line 188
    const v16, -0x4119999a    # -0.45f

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v0, 0x41000000    # 8.0f

    .line 195
    .line 196
    const/high16 v2, 0x41200000    # 10.0f

    .line 197
    .line 198
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v0, 0x40000000    # 2.0f

    .line 202
    .line 203
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v17, 0x40000000    # 2.0f

    .line 207
    .line 208
    const/high16 v18, -0x40000000    # -2.0f

    .line 209
    .line 210
    const v13, 0x3f8ccccd    # 1.1f

    .line 211
    .line 212
    .line 213
    const/high16 v15, 0x40000000    # 2.0f

    .line 214
    .line 215
    const v16, -0x4099999a    # -0.9f

    .line 216
    .line 217
    .line 218
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v0, 0x41600000    # 14.0f

    .line 222
    .line 223
    const v2, 0x405d70a4    # 3.46f

    .line 224
    .line 225
    .line 226
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 230
    .line 231
    const v18, -0x41147ae1    # -0.46f

    .line 232
    .line 233
    .line 234
    const v13, -0x408ccccd    # -0.95f

    .line 235
    .line 236
    .line 237
    const v14, -0x41666666    # -0.3f

    .line 238
    .line 239
    .line 240
    const v15, -0x40066666    # -1.95f

    .line 241
    .line 242
    .line 243
    const v16, -0x41147ae1    # -0.46f

    .line 244
    .line 245
    .line 246
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v17, 0x3f800000    # 1.0f

    .line 250
    .line 251
    const/high16 v18, 0x41500000    # 13.0f

    .line 252
    .line 253
    const v13, 0x40af5c29    # 5.48f

    .line 254
    .line 255
    .line 256
    const/high16 v14, 0x40400000    # 3.0f

    .line 257
    .line 258
    const/high16 v15, 0x3f800000    # 1.0f

    .line 259
    .line 260
    const v16, 0x40ef5c29    # 7.48f

    .line 261
    .line 262
    .line 263
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v0, 0x408f5c29    # 4.48f

    .line 267
    .line 268
    .line 269
    const/high16 v2, 0x41200000    # 10.0f

    .line 270
    .line 271
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v0, -0x3f70a3d7    # -4.48f

    .line 275
    .line 276
    .line 277
    const/high16 v2, -0x3ee00000    # -10.0f

    .line 278
    .line 279
    const/high16 v4, 0x41200000    # 10.0f

    .line 280
    .line 281
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v17, -0x42b33333    # -0.05f

    .line 285
    .line 286
    .line 287
    const/high16 v18, -0x40800000    # -1.0f

    .line 288
    .line 289
    const/4 v13, 0x0

    .line 290
    const v14, -0x4151eb85    # -0.34f

    .line 291
    .line 292
    .line 293
    const v15, -0x435c28f6    # -0.02f

    .line 294
    .line 295
    .line 296
    const v16, -0x40d47ae1    # -0.67f

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v0, -0x3ffe147b    # -2.03f

    .line 303
    .line 304
    .line 305
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v0, 0x41a770a4    # 20.93f

    .line 312
    .line 313
    .line 314
    const/high16 v2, 0x41200000    # 10.0f

    .line 315
    .line 316
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v17, -0x3f200000    # -7.0f

    .line 320
    .line 321
    const v18, -0x3f023d71    # -7.93f

    .line 322
    .line 323
    .line 324
    const v13, -0x3f833333    # -3.95f

    .line 325
    .line 326
    .line 327
    const v14, -0x41051eb8    # -0.49f

    .line 328
    .line 329
    .line 330
    const/high16 v15, -0x3f200000    # -7.0f

    .line 331
    .line 332
    const v16, -0x3f89999a    # -3.85f

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v17, 0x3e570a3d    # 0.21f

    .line 339
    .line 340
    .line 341
    const v18, -0x401ae148    # -1.79f

    .line 342
    .line 343
    .line 344
    const/4 v13, 0x0

    .line 345
    const v14, -0x40e147ae    # -0.62f

    .line 346
    .line 347
    .line 348
    const v15, 0x3da3d70a    # 0.08f

    .line 349
    .line 350
    .line 351
    const v16, -0x40651eb8    # -1.21f

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v0, 0x41800000    # 16.0f

    .line 358
    .line 359
    const/high16 v2, 0x41000000    # 8.0f

    .line 360
    .line 361
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/high16 v0, 0x3f800000    # 1.0f

    .line 365
    .line 366
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const/high16 v17, 0x40000000    # 2.0f

    .line 370
    .line 371
    const/high16 v18, 0x40000000    # 2.0f

    .line 372
    .line 373
    const v14, 0x3f8ccccd    # 1.1f

    .line 374
    .line 375
    .line 376
    const v15, 0x3f666666    # 0.9f

    .line 377
    .line 378
    .line 379
    const/high16 v16, 0x40000000    # 2.0f

    .line 380
    .line 381
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const v0, 0x3ff70a3d    # 1.93f

    .line 385
    .line 386
    .line 387
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const/high16 v0, 0x41b00000    # 22.0f

    .line 394
    .line 395
    const/high16 v2, 0x40800000    # 4.0f

    .line 396
    .line 397
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v0, -0x41000000    # -0.5f

    .line 401
    .line 402
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v17, 0x419c0000    # 19.5f

    .line 406
    .line 407
    const/high16 v18, 0x3f800000    # 1.0f

    .line 408
    .line 409
    const/high16 v13, 0x41b00000    # 22.0f

    .line 410
    .line 411
    const v14, 0x4007ae14    # 2.12f

    .line 412
    .line 413
    .line 414
    const v15, 0x41a70a3d    # 20.88f

    .line 415
    .line 416
    .line 417
    const/high16 v16, 0x3f800000    # 1.0f

    .line 418
    .line 419
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v0, 0x4007ae14    # 2.12f

    .line 423
    .line 424
    .line 425
    const/high16 v2, 0x40600000    # 3.5f

    .line 426
    .line 427
    const/high16 v4, 0x41880000    # 17.0f

    .line 428
    .line 429
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v0, 0x41880000    # 17.0f

    .line 433
    .line 434
    const/high16 v2, 0x40800000    # 4.0f

    .line 435
    .line 436
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const/high16 v17, -0x40800000    # -1.0f

    .line 440
    .line 441
    const v13, -0x40f33333    # -0.55f

    .line 442
    .line 443
    .line 444
    const/4 v14, 0x0

    .line 445
    const/high16 v15, -0x40800000    # -1.0f

    .line 446
    .line 447
    const v16, 0x3ee66666    # 0.45f

    .line 448
    .line 449
    .line 450
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v0, 0x40800000    # 4.0f

    .line 454
    .line 455
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const/high16 v17, 0x3f800000    # 1.0f

    .line 459
    .line 460
    const/4 v13, 0x0

    .line 461
    const v14, 0x3f0ccccd    # 0.55f

    .line 462
    .line 463
    .line 464
    const v15, 0x3ee66666    # 0.45f

    .line 465
    .line 466
    .line 467
    const/high16 v16, 0x3f800000    # 1.0f

    .line 468
    .line 469
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const/high16 v0, 0x40a00000    # 5.0f

    .line 473
    .line 474
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const/high16 v18, -0x40800000    # -1.0f

    .line 478
    .line 479
    const v13, 0x3f0ccccd    # 0.55f

    .line 480
    .line 481
    .line 482
    const/4 v14, 0x0

    .line 483
    const/high16 v15, 0x3f800000    # 1.0f

    .line 484
    .line 485
    const v16, -0x4119999a    # -0.45f

    .line 486
    .line 487
    .line 488
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const/high16 v0, 0x41b80000    # 23.0f

    .line 492
    .line 493
    const/high16 v2, 0x40a00000    # 5.0f

    .line 494
    .line 495
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const/high16 v17, -0x40800000    # -1.0f

    .line 499
    .line 500
    const/4 v13, 0x0

    .line 501
    const v14, -0x40f33333    # -0.55f

    .line 502
    .line 503
    .line 504
    const v15, -0x4119999a    # -0.45f

    .line 505
    .line 506
    .line 507
    const/high16 v16, -0x40800000    # -1.0f

    .line 508
    .line 509
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v0, 0x41a80000    # 21.0f

    .line 516
    .line 517
    const/high16 v2, 0x40800000    # 4.0f

    .line 518
    .line 519
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 523
    .line 524
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const/high16 v0, -0x41000000    # -0.5f

    .line 528
    .line 529
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 533
    .line 534
    const/high16 v18, -0x40400000    # -1.5f

    .line 535
    .line 536
    const v14, -0x40ab851f    # -0.83f

    .line 537
    .line 538
    .line 539
    const v15, 0x3f2b851f    # 0.67f

    .line 540
    .line 541
    .line 542
    const/high16 v16, -0x40400000    # -1.5f

    .line 543
    .line 544
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const v0, 0x3f2b851f    # 0.67f

    .line 548
    .line 549
    .line 550
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 551
    .line 552
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const/high16 v0, 0x41a80000    # 21.0f

    .line 556
    .line 557
    const/high16 v2, 0x40800000    # 4.0f

    .line 558
    .line 559
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 566
    .line 567
    .line 568
    move-result-object v2

    .line 569
    const/16 v16, 0x3800

    .line 570
    .line 571
    const/16 v17, 0x0

    .line 572
    .line 573
    const/high16 v6, 0x3f800000    # 1.0f

    .line 574
    .line 575
    const/high16 v8, 0x3f800000    # 1.0f

    .line 576
    .line 577
    const/4 v7, 0x0

    .line 578
    const/high16 v9, 0x3f800000    # 1.0f

    .line 579
    .line 580
    const/high16 v12, 0x3f800000    # 1.0f

    .line 581
    .line 582
    const/4 v14, 0x0

    .line 583
    const/4 v15, 0x0

    .line 584
    const-string v4, ""

    .line 585
    .line 586
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 587
    .line 588
    .line 589
    move-result-object v0

    .line 590
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 591
    .line 592
    .line 593
    move-result-object v0

    .line 594
    sput-object v0, Landroidx/compose/material/icons/outlined/VpnLockKt;->_vpnLock:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 595
    .line 596
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 597
    .line 598
    .line 599
    return-object v0
.end method
