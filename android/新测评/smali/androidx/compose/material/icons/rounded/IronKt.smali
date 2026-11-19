.class public final Landroidx/compose/material/icons/rounded/IronKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_iron",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Iron",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getIron",
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
        "SMAP\nIron.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iron.kt\nandroidx/compose/material/icons/rounded/IronKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,67:1\n212#2,12:68\n233#2,18:81\n253#2:118\n174#3:80\n705#4,2:99\n717#4,2:101\n719#4,11:107\n72#5,4:103\n*S KotlinDebug\n*F\n+ 1 Iron.kt\nandroidx/compose/material/icons/rounded/IronKt\n*L\n29#1:68,12\n30#1:81,18\n30#1:118\n29#1:80\n30#1:99,2\n30#1:101,2\n30#1:107,11\n30#1:103,4\n*E\n"
    }
.end annotation


# static fields
.field private static _iron:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getIron(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/IronKt;->_iron:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Iron"

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
    const v0, 0x410451ec    # 8.27f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41200000    # 10.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v17, 0x3f570a3d    # 0.84f

    .line 79
    .line 80
    .line 81
    const v18, -0x410f5c29    # -0.47f

    .line 82
    .line 83
    .line 84
    const v13, 0x3eae147b    # 0.34f

    .line 85
    .line 86
    .line 87
    const/4 v14, 0x0

    .line 88
    const v15, 0x3f2e147b    # 0.68f

    .line 89
    .line 90
    .line 91
    const v16, -0x41dc28f6    # -0.16f

    .line 92
    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v17, 0x41200000    # 10.0f

    .line 98
    .line 99
    const/high16 v18, 0x41100000    # 9.0f

    .line 100
    .line 101
    const v13, 0x41147ae1    # 9.28f

    .line 102
    .line 103
    .line 104
    const v14, 0x4113851f    # 9.22f

    .line 105
    .line 106
    .line 107
    const v15, 0x4119eb85    # 9.62f

    .line 108
    .line 109
    .line 110
    const/high16 v16, 0x41100000    # 9.0f

    .line 111
    .line 112
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v0, 0x40800000    # 4.0f

    .line 116
    .line 117
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v17, 0x3f800000    # 1.0f

    .line 121
    .line 122
    const/high16 v18, 0x3f800000    # 1.0f

    .line 123
    .line 124
    const v13, 0x3f0ccccd    # 0.55f

    .line 125
    .line 126
    .line 127
    const/4 v14, 0x0

    .line 128
    const/high16 v15, 0x3f800000    # 1.0f

    .line 129
    .line 130
    const v16, 0x3ee66666    # 0.45f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v0, 0x3f800000    # 1.0f

    .line 137
    .line 138
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v0, 0x40c00000    # 6.0f

    .line 142
    .line 143
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v17, -0x3f800000    # -4.0f

    .line 147
    .line 148
    const/high16 v18, 0x40800000    # 4.0f

    .line 149
    .line 150
    const v13, -0x3ff28f5c    # -2.21f

    .line 151
    .line 152
    .line 153
    const/high16 v15, -0x3f800000    # -4.0f

    .line 154
    .line 155
    const v16, 0x3fe51eb8    # 1.79f

    .line 156
    .line 157
    .line 158
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/high16 v0, 0x40000000    # 2.0f

    .line 162
    .line 163
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v17, 0x3f800000    # 1.0f

    .line 167
    .line 168
    const/high16 v18, 0x3f800000    # 1.0f

    .line 169
    .line 170
    const/4 v13, 0x0

    .line 171
    const v14, 0x3f0ccccd    # 0.55f

    .line 172
    .line 173
    .line 174
    const v15, 0x3ee66666    # 0.45f

    .line 175
    .line 176
    .line 177
    const/high16 v16, 0x3f800000    # 1.0f

    .line 178
    .line 179
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/high16 v0, 0x41500000    # 13.0f

    .line 183
    .line 184
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v18, -0x40800000    # -1.0f

    .line 188
    .line 189
    const v13, 0x3f0ccccd    # 0.55f

    .line 190
    .line 191
    .line 192
    const/4 v14, 0x0

    .line 193
    const/high16 v15, 0x3f800000    # 1.0f

    .line 194
    .line 195
    const v16, -0x4119999a    # -0.45f

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v0, -0x40800000    # -1.0f

    .line 202
    .line 203
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v17, 0x40400000    # 3.0f

    .line 207
    .line 208
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 209
    .line 210
    const v13, 0x3fd47ae1    # 1.66f

    .line 211
    .line 212
    .line 213
    const/high16 v15, 0x40400000    # 3.0f

    .line 214
    .line 215
    const v16, -0x40547ae1    # -1.34f

    .line 216
    .line 217
    .line 218
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v0, 0x41100000    # 9.0f

    .line 222
    .line 223
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v17, 0x3f800000    # 1.0f

    .line 227
    .line 228
    const/high16 v18, -0x40800000    # -1.0f

    .line 229
    .line 230
    const/4 v13, 0x0

    .line 231
    const v14, -0x40f33333    # -0.55f

    .line 232
    .line 233
    .line 234
    const v15, 0x3ee66666    # 0.45f

    .line 235
    .line 236
    .line 237
    const/high16 v16, -0x40800000    # -1.0f

    .line 238
    .line 239
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/4 v0, 0x0

    .line 243
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v13, 0x3f0ccccd    # 0.55f

    .line 247
    .line 248
    .line 249
    const/4 v14, 0x0

    .line 250
    const/high16 v15, 0x3f800000    # 1.0f

    .line 251
    .line 252
    const v16, -0x4119999a    # -0.45f

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v17, -0x40800000    # -1.0f

    .line 262
    .line 263
    const/4 v13, 0x0

    .line 264
    const v14, -0x40f33333    # -0.55f

    .line 265
    .line 266
    .line 267
    const v15, -0x4119999a    # -0.45f

    .line 268
    .line 269
    .line 270
    const/high16 v16, -0x40800000    # -1.0f

    .line 271
    .line 272
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 279
    .line 280
    const/high16 v18, 0x40400000    # 3.0f

    .line 281
    .line 282
    const v13, -0x402b851f    # -1.66f

    .line 283
    .line 284
    .line 285
    const/4 v14, 0x0

    .line 286
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 287
    .line 288
    const v16, 0x3fab851f    # 1.34f

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v0, 0x40800000    # 4.0f

    .line 295
    .line 296
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const/high16 v17, -0x40800000    # -1.0f

    .line 300
    .line 301
    const/high16 v18, 0x3f800000    # 1.0f

    .line 302
    .line 303
    const/4 v13, 0x0

    .line 304
    const v14, 0x3f0ccccd    # 0.55f

    .line 305
    .line 306
    .line 307
    const v15, -0x4119999a    # -0.45f

    .line 308
    .line 309
    .line 310
    const/high16 v16, 0x3f800000    # 1.0f

    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v0, -0x3f800000    # -4.0f

    .line 316
    .line 317
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 321
    .line 322
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 323
    .line 324
    const v14, -0x402b851f    # -1.66f

    .line 325
    .line 326
    .line 327
    const v15, -0x40547ae1    # -1.34f

    .line 328
    .line 329
    .line 330
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 331
    .line 332
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v17, 0x40ebd70a    # 7.37f

    .line 339
    .line 340
    .line 341
    const v18, 0x4108cccd    # 8.55f

    .line 342
    .line 343
    .line 344
    const v13, 0x410deb85    # 8.87f

    .line 345
    .line 346
    .line 347
    const/high16 v14, 0x40e00000    # 7.0f

    .line 348
    .line 349
    const v15, 0x40fc7ae1    # 7.89f

    .line 350
    .line 351
    .line 352
    const v16, 0x40f3d70a    # 7.62f

    .line 353
    .line 354
    .line 355
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v17, 0x410451ec    # 8.27f

    .line 359
    .line 360
    .line 361
    const/high16 v18, 0x41200000    # 10.0f

    .line 362
    .line 363
    const v13, 0x40e051ec    # 7.01f

    .line 364
    .line 365
    .line 366
    const v14, 0x41133333    # 9.2f

    .line 367
    .line 368
    .line 369
    const v15, 0x40f0f5c3    # 7.53f

    .line 370
    .line 371
    .line 372
    const/high16 v16, 0x41200000    # 10.0f

    .line 373
    .line 374
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    const/16 v16, 0x3800

    .line 385
    .line 386
    const/16 v17, 0x0

    .line 387
    .line 388
    const/high16 v6, 0x3f800000    # 1.0f

    .line 389
    .line 390
    const/high16 v8, 0x3f800000    # 1.0f

    .line 391
    .line 392
    const/4 v7, 0x0

    .line 393
    const/high16 v9, 0x3f800000    # 1.0f

    .line 394
    .line 395
    const/high16 v12, 0x3f800000    # 1.0f

    .line 396
    .line 397
    const/4 v13, 0x0

    .line 398
    const/4 v14, 0x0

    .line 399
    const/4 v15, 0x0

    .line 400
    const-string v4, ""

    .line 401
    .line 402
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    sput-object v0, Landroidx/compose/material/icons/rounded/IronKt;->_iron:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 411
    .line 412
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 413
    .line 414
    .line 415
    return-object v0
.end method
