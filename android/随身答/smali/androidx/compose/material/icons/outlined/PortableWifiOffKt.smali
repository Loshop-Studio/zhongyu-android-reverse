.class public final Landroidx/compose/material/icons/outlined/PortableWifiOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_portableWifiOff",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "PortableWifiOff",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getPortableWifiOff",
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
        "SMAP\nPortableWifiOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PortableWifiOff.kt\nandroidx/compose/material/icons/outlined/PortableWifiOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,79:1\n212#2,12:80\n233#2,18:93\n253#2:130\n174#3:92\n705#4,2:111\n717#4,2:113\n719#4,11:119\n72#5,4:115\n*S KotlinDebug\n*F\n+ 1 PortableWifiOff.kt\nandroidx/compose/material/icons/outlined/PortableWifiOffKt\n*L\n29#1:80,12\n30#1:93,18\n30#1:130\n29#1:92\n30#1:111,2\n30#1:113,2\n30#1:119,11\n30#1:115,4\n*E\n"
    }
.end annotation


# static fields
.field private static _portableWifiOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPortableWifiOff(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/PortableWifiOffKt;->_portableWifiOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.PortableWifiOff"

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
    const v0, 0x40170a3d    # 2.36f

    .line 71
    .line 72
    .line 73
    const v2, 0x405ae148    # 3.42f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x4000a3d7    # 2.01f

    .line 80
    .line 81
    .line 82
    const v2, 0x4071eb85    # 3.78f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v0, 0x40833333    # 4.1f

    .line 89
    .line 90
    .line 91
    const v2, 0x40bbd70a    # 5.87f

    .line 92
    .line 93
    .line 94
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v17, 0x40000000    # 2.0f

    .line 98
    .line 99
    const/high16 v18, 0x41400000    # 12.0f

    .line 100
    .line 101
    const v13, 0x40328f5c    # 2.79f

    .line 102
    .line 103
    .line 104
    const v14, 0x40f23d71    # 7.57f

    .line 105
    .line 106
    .line 107
    const/high16 v15, 0x40000000    # 2.0f

    .line 108
    .line 109
    const v16, 0x411b0a3d    # 9.69f

    .line 110
    .line 111
    .line 112
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v17, 0x409fae14    # 4.99f

    .line 116
    .line 117
    .line 118
    const v18, 0x410a6666    # 8.65f

    .line 119
    .line 120
    .line 121
    const/4 v13, 0x0

    .line 122
    const v14, 0x406ccccd    # 3.7f

    .line 123
    .line 124
    .line 125
    const v15, 0x4000a3d7    # 2.01f

    .line 126
    .line 127
    .line 128
    const v16, 0x40dd70a4    # 6.92f

    .line 129
    .line 130
    .line 131
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v0, -0x40228f5c    # -1.73f

    .line 135
    .line 136
    .line 137
    const/high16 v2, 0x3f800000    # 1.0f

    .line 138
    .line 139
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v17, 0x40800000    # 4.0f

    .line 143
    .line 144
    const/high16 v18, 0x41400000    # 12.0f

    .line 145
    .line 146
    const v13, 0x40b3851f    # 5.61f

    .line 147
    .line 148
    .line 149
    const v14, 0x418c3d71    # 17.53f

    .line 150
    .line 151
    .line 152
    const/high16 v15, 0x40800000    # 4.0f

    .line 153
    .line 154
    const v16, 0x416f5c29    # 14.96f

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v17, 0x3fc3d70a    # 1.53f

    .line 161
    .line 162
    .line 163
    const v18, -0x3f69eb85    # -4.69f

    .line 164
    .line 165
    .line 166
    const/4 v13, 0x0

    .line 167
    const v14, -0x401eb852    # -1.76f

    .line 168
    .line 169
    .line 170
    const v15, 0x3f11eb85    # 0.57f

    .line 171
    .line 172
    .line 173
    const v16, -0x3fa7ae14    # -3.38f

    .line 174
    .line 175
    .line 176
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v0, 0x3fb70a3d    # 1.43f

    .line 180
    .line 181
    .line 182
    const v2, 0x3fb851ec    # 1.44f

    .line 183
    .line 184
    .line 185
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v17, 0x40c00000    # 6.0f

    .line 189
    .line 190
    const/high16 v18, 0x41400000    # 12.0f

    .line 191
    .line 192
    const v13, 0x40cb851f    # 6.36f

    .line 193
    .line 194
    .line 195
    const v14, 0x411ae148    # 9.68f

    .line 196
    .line 197
    .line 198
    const/high16 v15, 0x40c00000    # 6.0f

    .line 199
    .line 200
    const v16, 0x412ccccd    # 10.8f

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v17, 0x40400000    # 3.0f

    .line 207
    .line 208
    const v18, 0x40a6147b    # 5.19f

    .line 209
    .line 210
    .line 211
    const/4 v13, 0x0

    .line 212
    const v14, 0x400e147b    # 2.22f

    .line 213
    .line 214
    .line 215
    const v15, 0x3f9ae148    # 1.21f

    .line 216
    .line 217
    .line 218
    const v16, 0x4084cccd    # 4.15f

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v0, -0x402147ae    # -1.74f

    .line 225
    .line 226
    .line 227
    const/high16 v2, 0x3f800000    # 1.0f

    .line 228
    .line 229
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v17, -0x40000000    # -2.0f

    .line 233
    .line 234
    const v18, -0x3fa33333    # -3.45f

    .line 235
    .line 236
    .line 237
    const v13, -0x4067ae14    # -1.19f

    .line 238
    .line 239
    .line 240
    const v14, -0x40cccccd    # -0.7f

    .line 241
    .line 242
    .line 243
    const/high16 v15, -0x40000000    # -2.0f

    .line 244
    .line 245
    const v16, -0x4003d70a    # -1.97f

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v17, 0x3ee147ae    # 0.44f

    .line 252
    .line 253
    .line 254
    const v18, -0x401ae148    # -1.79f

    .line 255
    .line 256
    .line 257
    const/4 v13, 0x0

    .line 258
    const v14, -0x40d9999a    # -0.65f

    .line 259
    .line 260
    .line 261
    const v15, 0x3e2e147b    # 0.17f

    .line 262
    .line 263
    .line 264
    const/high16 v16, -0x40600000    # -1.25f

    .line 265
    .line 266
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v0, 0x3fca3d71    # 1.58f

    .line 270
    .line 271
    .line 272
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v0, 0x41200000    # 10.0f

    .line 276
    .line 277
    const/high16 v2, 0x41400000    # 12.0f

    .line 278
    .line 279
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v17, 0x40000000    # 2.0f

    .line 283
    .line 284
    const/high16 v18, 0x40000000    # 2.0f

    .line 285
    .line 286
    const v14, 0x3f8ccccd    # 1.1f

    .line 287
    .line 288
    .line 289
    const v15, 0x3f666666    # 0.9f

    .line 290
    .line 291
    .line 292
    const/high16 v16, 0x40000000    # 2.0f

    .line 293
    .line 294
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v0, 0x3e570a3d    # 0.21f

    .line 298
    .line 299
    .line 300
    const v2, -0x435c28f6    # -0.02f

    .line 301
    .line 302
    .line 303
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v0, 0x40f0a3d7    # 7.52f

    .line 307
    .line 308
    .line 309
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v0, 0x3fb47ae1    # 1.41f

    .line 313
    .line 314
    .line 315
    const v2, -0x404b851f    # -1.41f

    .line 316
    .line 317
    .line 318
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v0, 0x40170a3d    # 2.36f

    .line 322
    .line 323
    .line 324
    const v2, 0x405ae148    # 3.42f

    .line 325
    .line 326
    .line 327
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v0, 0x418dae14    # 17.71f

    .line 334
    .line 335
    .line 336
    const v2, 0x415d1eb8    # 13.82f

    .line 337
    .line 338
    .line 339
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v17, 0x3e947ae1    # 0.29f

    .line 343
    .line 344
    .line 345
    const v18, -0x40170a3d    # -1.82f

    .line 346
    .line 347
    .line 348
    const v13, 0x3e3851ec    # 0.18f

    .line 349
    .line 350
    .line 351
    const v14, -0x40ee147b    # -0.57f

    .line 352
    .line 353
    .line 354
    const v15, 0x3e947ae1    # 0.29f

    .line 355
    .line 356
    .line 357
    const v16, -0x4067ae14    # -1.19f

    .line 358
    .line 359
    .line 360
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const/high16 v17, -0x3f400000    # -6.0f

    .line 364
    .line 365
    const/high16 v18, -0x3f400000    # -6.0f

    .line 366
    .line 367
    const/4 v13, 0x0

    .line 368
    const v14, -0x3fac28f6    # -3.31f

    .line 369
    .line 370
    .line 371
    const v15, -0x3fd3d70a    # -2.69f

    .line 372
    .line 373
    .line 374
    const/high16 v16, -0x3f400000    # -6.0f

    .line 375
    .line 376
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v17, -0x40170a3d    # -1.82f

    .line 380
    .line 381
    .line 382
    const v18, 0x3e947ae1    # 0.29f

    .line 383
    .line 384
    .line 385
    const v13, -0x40deb852    # -0.63f

    .line 386
    .line 387
    .line 388
    const/4 v14, 0x0

    .line 389
    const/high16 v15, -0x40600000    # -1.25f

    .line 390
    .line 391
    const v16, 0x3de147ae    # 0.11f

    .line 392
    .line 393
    .line 394
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v0, 0x3fdc28f6    # 1.72f

    .line 398
    .line 399
    .line 400
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const v17, 0x3dcccccd    # 0.1f

    .line 404
    .line 405
    .line 406
    const v18, -0x43dc28f6    # -0.01f

    .line 407
    .line 408
    .line 409
    const v13, 0x3cf5c28f    # 0.03f

    .line 410
    .line 411
    .line 412
    const v15, 0x3d75c28f    # 0.06f

    .line 413
    .line 414
    .line 415
    const v16, -0x43dc28f6    # -0.01f

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v17, 0x40800000    # 4.0f

    .line 422
    .line 423
    const/high16 v18, 0x40800000    # 4.0f

    .line 424
    .line 425
    const v13, 0x400d70a4    # 2.21f

    .line 426
    .line 427
    .line 428
    const/high16 v15, 0x40800000    # 4.0f

    .line 429
    .line 430
    const v16, 0x3fe51eb8    # 1.79f

    .line 431
    .line 432
    .line 433
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v17, -0x43dc28f6    # -0.01f

    .line 437
    .line 438
    .line 439
    const v18, 0x3de147ae    # 0.11f

    .line 440
    .line 441
    .line 442
    const/4 v13, 0x0

    .line 443
    const v14, 0x3d23d70a    # 0.04f

    .line 444
    .line 445
    .line 446
    const v15, -0x43dc28f6    # -0.01f

    .line 447
    .line 448
    .line 449
    const v16, 0x3d8f5c29    # 0.07f

    .line 450
    .line 451
    .line 452
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const v0, 0x3fdae148    # 1.71f

    .line 456
    .line 457
    .line 458
    const v2, 0x3fdc28f6    # 1.72f

    .line 459
    .line 460
    .line 461
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const/high16 v0, 0x40800000    # 4.0f

    .line 468
    .line 469
    const/high16 v2, 0x41400000    # 12.0f

    .line 470
    .line 471
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const/high16 v17, 0x41000000    # 8.0f

    .line 475
    .line 476
    const/high16 v18, 0x41000000    # 8.0f

    .line 477
    .line 478
    const v13, 0x408d70a4    # 4.42f

    .line 479
    .line 480
    .line 481
    const/4 v14, 0x0

    .line 482
    const/high16 v15, 0x41000000    # 8.0f

    .line 483
    .line 484
    const v16, 0x40651eb8    # 3.58f

    .line 485
    .line 486
    .line 487
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const v17, -0x40bae148    # -0.77f

    .line 491
    .line 492
    .line 493
    const v18, 0x40566666    # 3.35f

    .line 494
    .line 495
    .line 496
    const/4 v13, 0x0

    .line 497
    const v14, 0x3f99999a    # 1.2f

    .line 498
    .line 499
    .line 500
    const v15, -0x416b851f    # -0.29f

    .line 501
    .line 502
    .line 503
    const v16, 0x40147ae1    # 2.32f

    .line 504
    .line 505
    .line 506
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const v0, 0x3fbeb852    # 1.49f

    .line 510
    .line 511
    .line 512
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v17, 0x41b00000    # 22.0f

    .line 516
    .line 517
    const/high16 v18, 0x41400000    # 12.0f

    .line 518
    .line 519
    const v13, 0x41ac3d71    # 21.53f

    .line 520
    .line 521
    .line 522
    const v14, 0x41766666    # 15.4f

    .line 523
    .line 524
    .line 525
    const/high16 v15, 0x41b00000    # 22.0f

    .line 526
    .line 527
    const v16, 0x415c28f6    # 13.76f

    .line 528
    .line 529
    .line 530
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const/high16 v17, -0x3ee00000    # -10.0f

    .line 534
    .line 535
    const/high16 v18, -0x3ee00000    # -10.0f

    .line 536
    .line 537
    const/4 v13, 0x0

    .line 538
    const v14, -0x3f4f5c29    # -5.52f

    .line 539
    .line 540
    .line 541
    const v15, -0x3f70a3d7    # -4.48f

    .line 542
    .line 543
    .line 544
    const/high16 v16, -0x3ee00000    # -10.0f

    .line 545
    .line 546
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const v17, -0x3f651eb8    # -4.84f

    .line 550
    .line 551
    .line 552
    const v18, 0x3fa3d70a    # 1.28f

    .line 553
    .line 554
    .line 555
    const v13, -0x401eb852    # -1.76f

    .line 556
    .line 557
    .line 558
    const/4 v14, 0x0

    .line 559
    const v15, -0x3fa66666    # -3.4f

    .line 560
    .line 561
    .line 562
    const v16, 0x3ef5c28f    # 0.48f

    .line 563
    .line 564
    .line 565
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const v0, 0x3fbd70a4    # 1.48f

    .line 569
    .line 570
    .line 571
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const/high16 v17, 0x41400000    # 12.0f

    .line 575
    .line 576
    const/high16 v18, 0x40800000    # 4.0f

    .line 577
    .line 578
    const v13, 0x411a8f5c    # 9.66f

    .line 579
    .line 580
    .line 581
    const v14, 0x4088f5c3    # 4.28f

    .line 582
    .line 583
    .line 584
    const v15, 0x412ccccd    # 10.8f

    .line 585
    .line 586
    .line 587
    const/high16 v16, 0x40800000    # 4.0f

    .line 588
    .line 589
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 596
    .line 597
    .line 598
    move-result-object v2

    .line 599
    const/16 v16, 0x3800

    .line 600
    .line 601
    const/16 v17, 0x0

    .line 602
    .line 603
    const/high16 v6, 0x3f800000    # 1.0f

    .line 604
    .line 605
    const/high16 v8, 0x3f800000    # 1.0f

    .line 606
    .line 607
    const/4 v7, 0x0

    .line 608
    const/high16 v9, 0x3f800000    # 1.0f

    .line 609
    .line 610
    const/high16 v12, 0x3f800000    # 1.0f

    .line 611
    .line 612
    const/4 v13, 0x0

    .line 613
    const/4 v14, 0x0

    .line 614
    const/4 v15, 0x0

    .line 615
    const-string v4, ""

    .line 616
    .line 617
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 618
    .line 619
    .line 620
    move-result-object v0

    .line 621
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 622
    .line 623
    .line 624
    move-result-object v0

    .line 625
    sput-object v0, Landroidx/compose/material/icons/outlined/PortableWifiOffKt;->_portableWifiOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 626
    .line 627
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 628
    .line 629
    .line 630
    return-object v0
.end method
