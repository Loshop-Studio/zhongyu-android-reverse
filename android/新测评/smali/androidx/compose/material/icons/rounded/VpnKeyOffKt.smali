.class public final Landroidx/compose/material/icons/rounded/VpnKeyOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_vpnKeyOff",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "VpnKeyOff",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getVpnKeyOff",
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
        "SMAP\nVpnKeyOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VpnKeyOff.kt\nandroidx/compose/material/icons/rounded/VpnKeyOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,64:1\n212#2,12:65\n233#2,18:78\n253#2:115\n174#3:77\n705#4,2:96\n717#4,2:98\n719#4,11:104\n72#5,4:100\n*S KotlinDebug\n*F\n+ 1 VpnKeyOff.kt\nandroidx/compose/material/icons/rounded/VpnKeyOffKt\n*L\n29#1:65,12\n30#1:78,18\n30#1:115\n29#1:77\n30#1:96,2\n30#1:98,2\n30#1:104,11\n30#1:100,4\n*E\n"
    }
.end annotation


# static fields
.field private static _vpnKeyOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getVpnKeyOff(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/VpnKeyOffKt;->_vpnKeyOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.VpnKeyOff"

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
    const v0, 0x40d9eb85    # 6.81f

    .line 71
    .line 72
    .line 73
    const v2, 0x407eb852    # 3.98f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v17, 0x3f800000    # 1.0f

    .line 80
    .line 81
    const/high16 v18, 0x41400000    # 12.0f

    .line 82
    .line 83
    const v13, 0x400ccccd    # 2.2f

    .line 84
    .line 85
    .line 86
    const v14, 0x40fb3333    # 7.85f

    .line 87
    .line 88
    .line 89
    const/high16 v15, 0x3f800000    # 1.0f

    .line 90
    .line 91
    const v16, 0x411ca3d7    # 9.79f

    .line 92
    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v17, 0x40c00000    # 6.0f

    .line 98
    .line 99
    const/high16 v18, 0x40c00000    # 6.0f

    .line 100
    .line 101
    const/4 v13, 0x0

    .line 102
    const v14, 0x4053d70a    # 3.31f

    .line 103
    .line 104
    .line 105
    const v15, 0x402c28f6    # 2.69f

    .line 106
    .line 107
    .line 108
    const/high16 v16, 0x40c00000    # 6.0f

    .line 109
    .line 110
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const v17, 0x40a5c28f    # 5.18f

    .line 114
    .line 115
    .line 116
    const v18, -0x3fc0a3d7    # -2.99f

    .line 117
    .line 118
    .line 119
    const v13, 0x400d70a4    # 2.21f

    .line 120
    .line 121
    .line 122
    const/4 v14, 0x0

    .line 123
    const v15, 0x4084cccd    # 4.15f

    .line 124
    .line 125
    .line 126
    const v16, -0x40666666    # -1.2f

    .line 127
    .line 128
    .line 129
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v0, 0x40dc7ae1    # 6.89f

    .line 133
    .line 134
    .line 135
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v17, 0x3fb47ae1    # 1.41f

    .line 139
    .line 140
    .line 141
    const/16 v18, 0x0

    .line 142
    .line 143
    const v13, 0x3ec7ae14    # 0.39f

    .line 144
    .line 145
    .line 146
    const v14, 0x3ec7ae14    # 0.39f

    .line 147
    .line 148
    .line 149
    const v15, 0x3f828f5c    # 1.02f

    .line 150
    .line 151
    .line 152
    const v16, 0x3ec7ae14    # 0.39f

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/16 v17, 0x0

    .line 159
    .line 160
    const v18, -0x404b851f    # -1.41f

    .line 161
    .line 162
    .line 163
    const v14, -0x413851ec    # -0.39f

    .line 164
    .line 165
    .line 166
    const v15, 0x3ec7ae14    # 0.39f

    .line 167
    .line 168
    .line 169
    const v16, -0x407d70a4    # -1.02f

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v0, 0x4060a3d7    # 3.51f

    .line 176
    .line 177
    .line 178
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v17, -0x404b851f    # -1.41f

    .line 182
    .line 183
    .line 184
    const/16 v18, 0x0

    .line 185
    .line 186
    const v13, -0x413851ec    # -0.39f

    .line 187
    .line 188
    .line 189
    const v15, -0x407d70a4    # -1.02f

    .line 190
    .line 191
    .line 192
    const v16, -0x413851ec    # -0.39f

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/16 v17, 0x0

    .line 199
    .line 200
    const v18, 0x3fb47ae1    # 1.41f

    .line 201
    .line 202
    .line 203
    const v14, 0x3ec7ae14    # 0.39f

    .line 204
    .line 205
    .line 206
    const v15, -0x413851ec    # -0.39f

    .line 207
    .line 208
    .line 209
    const v16, 0x3f828f5c    # 1.02f

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v0, 0x40d9eb85    # 6.81f

    .line 216
    .line 217
    .line 218
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v0, 0x413d1eb8    # 11.82f

    .line 225
    .line 226
    .line 227
    const v2, 0x410fd70a    # 8.99f

    .line 228
    .line 229
    .line 230
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v17, 0x41100000    # 9.0f

    .line 234
    .line 235
    const/high16 v18, 0x41400000    # 12.0f

    .line 236
    .line 237
    const/high16 v13, 0x41100000    # 9.0f

    .line 238
    .line 239
    const v14, 0x413e147b    # 11.88f

    .line 240
    .line 241
    .line 242
    const/high16 v15, 0x41100000    # 9.0f

    .line 243
    .line 244
    const v16, 0x413f0a3d    # 11.94f

    .line 245
    .line 246
    .line 247
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v17, -0x40000000    # -2.0f

    .line 251
    .line 252
    const/high16 v18, 0x40000000    # 2.0f

    .line 253
    .line 254
    const/4 v13, 0x0

    .line 255
    const v14, 0x3f8ccccd    # 1.1f

    .line 256
    .line 257
    .line 258
    const v15, -0x4099999a    # -0.9f

    .line 259
    .line 260
    .line 261
    const/high16 v16, 0x40000000    # 2.0f

    .line 262
    .line 263
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v0, -0x4099999a    # -0.9f

    .line 267
    .line 268
    .line 269
    const/high16 v2, -0x40000000    # -2.0f

    .line 270
    .line 271
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v0, 0x3f666666    # 0.9f

    .line 275
    .line 276
    .line 277
    const/high16 v2, 0x40000000    # 2.0f

    .line 278
    .line 279
    const/high16 v4, -0x40000000    # -2.0f

    .line 280
    .line 281
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v17, 0x3e3851ec    # 0.18f

    .line 285
    .line 286
    .line 287
    const v18, 0x3c23d70a    # 0.01f

    .line 288
    .line 289
    .line 290
    const v13, 0x3d75c28f    # 0.06f

    .line 291
    .line 292
    .line 293
    const/4 v14, 0x0

    .line 294
    const v15, 0x3df5c28f    # 0.12f

    .line 295
    .line 296
    .line 297
    const/16 v16, 0x0

    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v0, 0x413d1eb8    # 11.82f

    .line 303
    .line 304
    .line 305
    const v2, 0x410fd70a    # 8.99f

    .line 306
    .line 307
    .line 308
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const/high16 v0, 0x418c0000    # 17.5f

    .line 315
    .line 316
    const v2, 0x41a28f5c    # 20.32f

    .line 317
    .line 318
    .line 319
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/high16 v17, 0x41a80000    # 21.0f

    .line 323
    .line 324
    const/high16 v18, 0x41800000    # 16.0f

    .line 325
    .line 326
    const v13, 0x41a5eb85    # 20.74f

    .line 327
    .line 328
    .line 329
    const v14, 0x41890a3d    # 17.13f

    .line 330
    .line 331
    .line 332
    const/high16 v15, 0x41a80000    # 21.0f

    .line 333
    .line 334
    const v16, 0x4184b852    # 16.59f

    .line 335
    .line 336
    .line 337
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v0, -0x40000000    # -2.0f

    .line 341
    .line 342
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v17, 0x40000000    # 2.0f

    .line 346
    .line 347
    const/high16 v18, -0x40000000    # -2.0f

    .line 348
    .line 349
    const v13, 0x3f8ccccd    # 1.1f

    .line 350
    .line 351
    .line 352
    const/4 v14, 0x0

    .line 353
    const/high16 v15, 0x40000000    # 2.0f

    .line 354
    .line 355
    const v16, -0x4099999a    # -0.9f

    .line 356
    .line 357
    .line 358
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v0, -0x4099999a    # -0.9f

    .line 362
    .line 363
    .line 364
    const/high16 v2, -0x40000000    # -2.0f

    .line 365
    .line 366
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v0, -0x3efd47ae    # -8.17f

    .line 370
    .line 371
    .line 372
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v0, 0x418c0000    # 17.5f

    .line 376
    .line 377
    const v2, 0x41a28f5c    # 20.32f

    .line 378
    .line 379
    .line 380
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 384
    .line 385
    .line 386
    move-result-object v2

    .line 387
    const/16 v16, 0x3800

    .line 388
    .line 389
    const/16 v17, 0x0

    .line 390
    .line 391
    const/high16 v6, 0x3f800000    # 1.0f

    .line 392
    .line 393
    const/high16 v8, 0x3f800000    # 1.0f

    .line 394
    .line 395
    const/4 v7, 0x0

    .line 396
    const/high16 v9, 0x3f800000    # 1.0f

    .line 397
    .line 398
    const/high16 v12, 0x3f800000    # 1.0f

    .line 399
    .line 400
    const/4 v13, 0x0

    .line 401
    const/4 v15, 0x0

    .line 402
    const-string v4, ""

    .line 403
    .line 404
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    sput-object v0, Landroidx/compose/material/icons/rounded/VpnKeyOffKt;->_vpnKeyOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 413
    .line 414
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 415
    .line 416
    .line 417
    return-object v0
.end method
