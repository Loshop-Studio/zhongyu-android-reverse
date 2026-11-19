.class public final Landroidx/compose/material/icons/filled/SettingsApplicationsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_settingsApplications",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SettingsApplications",
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getSettingsApplications",
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
        "SMAP\nSettingsApplications.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsApplications.kt\nandroidx/compose/material/icons/filled/SettingsApplicationsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,93:1\n212#2,12:94\n233#2,18:107\n253#2:144\n174#3:106\n705#4,2:125\n717#4,2:127\n719#4,11:133\n72#5,4:129\n*S KotlinDebug\n*F\n+ 1 SettingsApplications.kt\nandroidx/compose/material/icons/filled/SettingsApplicationsKt\n*L\n29#1:94,12\n30#1:107,18\n30#1:144\n29#1:106\n30#1:125,2\n30#1:127,2\n30#1:133,11\n30#1:129,4\n*E\n"
    }
.end annotation


# static fields
.field private static _settingsApplications:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSettingsApplications(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/SettingsApplicationsKt;->_settingsApplications:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.SettingsApplications"

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
    const/high16 v0, 0x41200000    # 10.0f

    .line 71
    .line 72
    const/high16 v2, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x40000000    # -2.0f

    .line 78
    .line 79
    const/high16 v18, 0x40000000    # 2.0f

    .line 80
    .line 81
    const v13, -0x40733333    # -1.1f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, -0x40000000    # -2.0f

    .line 86
    .line 87
    const v16, 0x3f666666    # 0.9f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, 0x3f666666    # 0.9f

    .line 94
    .line 95
    .line 96
    const/high16 v2, 0x40000000    # 2.0f

    .line 97
    .line 98
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v0, -0x4099999a    # -0.9f

    .line 102
    .line 103
    .line 104
    const/high16 v2, -0x40000000    # -2.0f

    .line 105
    .line 106
    const/high16 v4, 0x40000000    # 2.0f

    .line 107
    .line 108
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v0, 0x41980000    # 19.0f

    .line 118
    .line 119
    const/high16 v2, 0x40400000    # 3.0f

    .line 120
    .line 121
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v0, 0x40a00000    # 5.0f

    .line 125
    .line 126
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v13, -0x4071eb85    # -1.11f

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v0, 0x41600000    # 14.0f

    .line 136
    .line 137
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v17, 0x40000000    # 2.0f

    .line 141
    .line 142
    const/4 v13, 0x0

    .line 143
    const v14, 0x3f8ccccd    # 1.1f

    .line 144
    .line 145
    .line 146
    const v15, 0x3f63d70a    # 0.89f

    .line 147
    .line 148
    .line 149
    const/high16 v16, 0x40000000    # 2.0f

    .line 150
    .line 151
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const/high16 v18, -0x40000000    # -2.0f

    .line 158
    .line 159
    const v13, 0x3f8e147b    # 1.11f

    .line 160
    .line 161
    .line 162
    const/4 v14, 0x0

    .line 163
    const/high16 v15, 0x40000000    # 2.0f

    .line 164
    .line 165
    const v16, -0x4099999a    # -0.9f

    .line 166
    .line 167
    .line 168
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v0, 0x41a80000    # 21.0f

    .line 172
    .line 173
    const/high16 v2, 0x40a00000    # 5.0f

    .line 174
    .line 175
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const/high16 v17, -0x40000000    # -2.0f

    .line 179
    .line 180
    const/4 v13, 0x0

    .line 181
    const v14, -0x40733333    # -1.1f

    .line 182
    .line 183
    .line 184
    const v15, -0x409c28f6    # -0.89f

    .line 185
    .line 186
    .line 187
    const/high16 v16, -0x40000000    # -2.0f

    .line 188
    .line 189
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v0, 0x418a0000    # 17.25f

    .line 196
    .line 197
    const/high16 v2, 0x41400000    # 12.0f

    .line 198
    .line 199
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v17, -0x42b33333    # -0.05f

    .line 203
    .line 204
    .line 205
    const v18, 0x3f2e147b    # 0.68f

    .line 206
    .line 207
    .line 208
    const v14, 0x3e6b851f    # 0.23f

    .line 209
    .line 210
    .line 211
    const v15, -0x435c28f6    # -0.02f

    .line 212
    .line 213
    .line 214
    const v16, 0x3eeb851f    # 0.46f

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v0, 0x3f947ae1    # 1.16f

    .line 221
    .line 222
    .line 223
    const v2, 0x3fbd70a4    # 1.48f

    .line 224
    .line 225
    .line 226
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v17, 0x3da3d70a    # 0.08f

    .line 230
    .line 231
    .line 232
    const v18, 0x3ee66666    # 0.45f

    .line 233
    .line 234
    .line 235
    const v13, 0x3e051eb8    # 0.13f

    .line 236
    .line 237
    .line 238
    const v14, 0x3de147ae    # 0.11f

    .line 239
    .line 240
    .line 241
    const v15, 0x3e2e147b    # 0.17f

    .line 242
    .line 243
    .line 244
    const v16, 0x3e99999a    # 0.3f

    .line 245
    .line 246
    .line 247
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v0, 0x401ae148    # 2.42f

    .line 251
    .line 252
    .line 253
    const v2, -0x404ccccd    # -1.4f

    .line 254
    .line 255
    .line 256
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v17, -0x4123d70a    # -0.43f

    .line 260
    .line 261
    .line 262
    const v18, 0x3e19999a    # 0.15f

    .line 263
    .line 264
    .line 265
    const v13, -0x4247ae14    # -0.09f

    .line 266
    .line 267
    .line 268
    const v14, 0x3e19999a    # 0.15f

    .line 269
    .line 270
    .line 271
    const v15, -0x4175c28f    # -0.27f

    .line 272
    .line 273
    .line 274
    const v16, 0x3e570a3d    # 0.21f

    .line 275
    .line 276
    .line 277
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v0, -0x40cccccd    # -0.7f

    .line 281
    .line 282
    .line 283
    const v2, -0x402147ae    # -1.74f

    .line 284
    .line 285
    .line 286
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v17, -0x4068f5c3    # -1.18f

    .line 290
    .line 291
    .line 292
    const v18, 0x3f30a3d7    # 0.69f

    .line 293
    .line 294
    .line 295
    const v13, -0x4147ae14    # -0.36f

    .line 296
    .line 297
    .line 298
    const v14, 0x3e8f5c29    # 0.28f

    .line 299
    .line 300
    .line 301
    const v15, -0x40bd70a4    # -0.76f

    .line 302
    .line 303
    .line 304
    const v16, 0x3f028f5c    # 0.51f

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v0, 0x3feccccd    # 1.85f

    .line 311
    .line 312
    .line 313
    const v2, -0x417ae148    # -0.26f

    .line 314
    .line 315
    .line 316
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v17, -0x414ccccd    # -0.35f

    .line 320
    .line 321
    .line 322
    const v18, 0x3e99999a    # 0.3f

    .line 323
    .line 324
    .line 325
    const v13, -0x430a3d71    # -0.03f

    .line 326
    .line 327
    .line 328
    const v14, 0x3e2e147b    # 0.17f

    .line 329
    .line 330
    .line 331
    const v15, -0x41c7ae14    # -0.18f

    .line 332
    .line 333
    .line 334
    const v16, 0x3e99999a    # 0.3f

    .line 335
    .line 336
    .line 337
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const v0, -0x3fcccccd    # -2.8f

    .line 341
    .line 342
    .line 343
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v18, -0x416b851f    # -0.29f

    .line 347
    .line 348
    .line 349
    const v13, -0x41d1eb85    # -0.17f

    .line 350
    .line 351
    .line 352
    const/4 v14, 0x0

    .line 353
    const v15, -0x415c28f6    # -0.32f

    .line 354
    .line 355
    .line 356
    const v16, -0x41fae148    # -0.13f

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v0, -0x40133333    # -1.85f

    .line 363
    .line 364
    .line 365
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v17, -0x4068f5c3    # -1.18f

    .line 369
    .line 370
    .line 371
    const v18, -0x40cf5c29    # -0.69f

    .line 372
    .line 373
    .line 374
    const v13, -0x4123d70a    # -0.43f

    .line 375
    .line 376
    .line 377
    const v14, -0x41c7ae14    # -0.18f

    .line 378
    .line 379
    .line 380
    const v15, -0x40ae147b    # -0.82f

    .line 381
    .line 382
    .line 383
    const v16, -0x412e147b    # -0.41f

    .line 384
    .line 385
    .line 386
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v0, 0x3f333333    # 0.7f

    .line 390
    .line 391
    .line 392
    const v2, -0x402147ae    # -1.74f

    .line 393
    .line 394
    .line 395
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v17, -0x4123d70a    # -0.43f

    .line 399
    .line 400
    .line 401
    const v18, -0x41e66666    # -0.15f

    .line 402
    .line 403
    .line 404
    const v13, -0x41dc28f6    # -0.16f

    .line 405
    .line 406
    .line 407
    const v14, 0x3d75c28f    # 0.06f

    .line 408
    .line 409
    .line 410
    const v15, -0x4151eb85    # -0.34f

    .line 411
    .line 412
    .line 413
    const/16 v16, 0x0

    .line 414
    .line 415
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v0, -0x3fe51eb8    # -2.42f

    .line 419
    .line 420
    .line 421
    const v2, -0x404ccccd    # -1.4f

    .line 422
    .line 423
    .line 424
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v17, 0x3da3d70a    # 0.08f

    .line 428
    .line 429
    .line 430
    const v18, -0x4119999a    # -0.45f

    .line 431
    .line 432
    .line 433
    const v13, -0x4247ae14    # -0.09f

    .line 434
    .line 435
    .line 436
    const v14, -0x41e66666    # -0.15f

    .line 437
    .line 438
    .line 439
    const v15, -0x42b33333    # -0.05f

    .line 440
    .line 441
    .line 442
    const v16, -0x4151eb85    # -0.34f

    .line 443
    .line 444
    .line 445
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const v0, -0x406b851f    # -1.16f

    .line 449
    .line 450
    .line 451
    const v2, 0x3fbd70a4    # 1.48f

    .line 452
    .line 453
    .line 454
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const v17, -0x42b33333    # -0.05f

    .line 458
    .line 459
    .line 460
    const v18, -0x40cf5c29    # -0.69f

    .line 461
    .line 462
    .line 463
    const v13, -0x430a3d71    # -0.03f

    .line 464
    .line 465
    .line 466
    const v14, -0x41947ae1    # -0.23f

    .line 467
    .line 468
    .line 469
    const v16, -0x41147ae1    # -0.46f

    .line 470
    .line 471
    .line 472
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const v17, 0x3d4ccccd    # 0.05f

    .line 476
    .line 477
    .line 478
    const v18, -0x40d1eb85    # -0.68f

    .line 479
    .line 480
    .line 481
    const/4 v13, 0x0

    .line 482
    const v15, 0x3ca3d70a    # 0.02f

    .line 483
    .line 484
    .line 485
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const v0, -0x40428f5c    # -1.48f

    .line 489
    .line 490
    .line 491
    const v2, -0x406b851f    # -1.16f

    .line 492
    .line 493
    .line 494
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const v17, -0x425c28f6    # -0.08f

    .line 498
    .line 499
    .line 500
    const v18, -0x4119999a    # -0.45f

    .line 501
    .line 502
    .line 503
    const v13, -0x41fae148    # -0.13f

    .line 504
    .line 505
    .line 506
    const v14, -0x421eb852    # -0.11f

    .line 507
    .line 508
    .line 509
    const v15, -0x41d1eb85    # -0.17f

    .line 510
    .line 511
    .line 512
    const v16, -0x41666666    # -0.3f

    .line 513
    .line 514
    .line 515
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const v0, 0x3fb33333    # 1.4f

    .line 519
    .line 520
    .line 521
    const v2, -0x3fe51eb8    # -2.42f

    .line 522
    .line 523
    .line 524
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const v17, 0x3edc28f6    # 0.43f

    .line 528
    .line 529
    .line 530
    const v18, -0x41e66666    # -0.15f

    .line 531
    .line 532
    .line 533
    const v13, 0x3db851ec    # 0.09f

    .line 534
    .line 535
    .line 536
    const v14, -0x41e66666    # -0.15f

    .line 537
    .line 538
    .line 539
    const v15, 0x3e8a3d71    # 0.27f

    .line 540
    .line 541
    .line 542
    const v16, -0x41a8f5c3    # -0.21f

    .line 543
    .line 544
    .line 545
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const v0, 0x3fdeb852    # 1.74f

    .line 549
    .line 550
    .line 551
    const v2, 0x3f333333    # 0.7f

    .line 552
    .line 553
    .line 554
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const v17, 0x3f970a3d    # 1.18f

    .line 558
    .line 559
    .line 560
    const v18, -0x40cf5c29    # -0.69f

    .line 561
    .line 562
    .line 563
    const v13, 0x3eb851ec    # 0.36f

    .line 564
    .line 565
    .line 566
    const v14, -0x4170a3d7    # -0.28f

    .line 567
    .line 568
    .line 569
    const v15, 0x3f428f5c    # 0.76f

    .line 570
    .line 571
    .line 572
    const v16, -0x40fd70a4    # -0.51f

    .line 573
    .line 574
    .line 575
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const v0, 0x3e851eb8    # 0.26f

    .line 579
    .line 580
    .line 581
    const v2, -0x40133333    # -1.85f

    .line 582
    .line 583
    .line 584
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const v17, 0x3eb33333    # 0.35f

    .line 588
    .line 589
    .line 590
    const v18, -0x41666666    # -0.3f

    .line 591
    .line 592
    .line 593
    const v13, 0x3cf5c28f    # 0.03f

    .line 594
    .line 595
    .line 596
    const v14, -0x41d1eb85    # -0.17f

    .line 597
    .line 598
    .line 599
    const v15, 0x3e3851ec    # 0.18f

    .line 600
    .line 601
    .line 602
    const v16, -0x41666666    # -0.3f

    .line 603
    .line 604
    .line 605
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const v0, 0x40333333    # 2.8f

    .line 609
    .line 610
    .line 611
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const v18, 0x3e947ae1    # 0.29f

    .line 615
    .line 616
    .line 617
    const v13, 0x3e2e147b    # 0.17f

    .line 618
    .line 619
    .line 620
    const/4 v14, 0x0

    .line 621
    const v15, 0x3ea3d70a    # 0.32f

    .line 622
    .line 623
    .line 624
    const v16, 0x3e051eb8    # 0.13f

    .line 625
    .line 626
    .line 627
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    const v0, 0x3e851eb8    # 0.26f

    .line 631
    .line 632
    .line 633
    const v2, 0x3feccccd    # 1.85f

    .line 634
    .line 635
    .line 636
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const v17, 0x3f970a3d    # 1.18f

    .line 640
    .line 641
    .line 642
    const v18, 0x3f30a3d7    # 0.69f

    .line 643
    .line 644
    .line 645
    const v13, 0x3edc28f6    # 0.43f

    .line 646
    .line 647
    .line 648
    const v14, 0x3e3851ec    # 0.18f

    .line 649
    .line 650
    .line 651
    const v15, 0x3f51eb85    # 0.82f

    .line 652
    .line 653
    .line 654
    const v16, 0x3ed1eb85    # 0.41f

    .line 655
    .line 656
    .line 657
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const v0, 0x3fdeb852    # 1.74f

    .line 661
    .line 662
    .line 663
    const v2, -0x40cccccd    # -0.7f

    .line 664
    .line 665
    .line 666
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    const v17, 0x3edc28f6    # 0.43f

    .line 670
    .line 671
    .line 672
    const v18, 0x3e19999a    # 0.15f

    .line 673
    .line 674
    .line 675
    const v13, 0x3e23d70a    # 0.16f

    .line 676
    .line 677
    .line 678
    const v14, -0x428a3d71    # -0.06f

    .line 679
    .line 680
    .line 681
    const v15, 0x3eae147b    # 0.34f

    .line 682
    .line 683
    .line 684
    const/16 v16, 0x0

    .line 685
    .line 686
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const v0, 0x3fb33333    # 1.4f

    .line 690
    .line 691
    .line 692
    const v2, 0x401ae148    # 2.42f

    .line 693
    .line 694
    .line 695
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 696
    .line 697
    .line 698
    const v17, -0x425c28f6    # -0.08f

    .line 699
    .line 700
    .line 701
    const v18, 0x3ee66666    # 0.45f

    .line 702
    .line 703
    .line 704
    const v13, 0x3db851ec    # 0.09f

    .line 705
    .line 706
    .line 707
    const v14, 0x3e19999a    # 0.15f

    .line 708
    .line 709
    .line 710
    const v15, 0x3d4ccccd    # 0.05f

    .line 711
    .line 712
    .line 713
    const v16, 0x3eae147b    # 0.34f

    .line 714
    .line 715
    .line 716
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 717
    .line 718
    .line 719
    const v0, -0x40428f5c    # -1.48f

    .line 720
    .line 721
    .line 722
    const v2, 0x3f947ae1    # 1.16f

    .line 723
    .line 724
    .line 725
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 726
    .line 727
    .line 728
    const v17, 0x3d4ccccd    # 0.05f

    .line 729
    .line 730
    .line 731
    const v18, 0x3f30a3d7    # 0.69f

    .line 732
    .line 733
    .line 734
    const v13, 0x3cf5c28f    # 0.03f

    .line 735
    .line 736
    .line 737
    const v14, 0x3e6b851f    # 0.23f

    .line 738
    .line 739
    .line 740
    const v16, 0x3eeb851f    # 0.46f

    .line 741
    .line 742
    .line 743
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 744
    .line 745
    .line 746
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 747
    .line 748
    .line 749
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 750
    .line 751
    .line 752
    move-result-object v2

    .line 753
    const/16 v16, 0x3800

    .line 754
    .line 755
    const/16 v17, 0x0

    .line 756
    .line 757
    const/high16 v6, 0x3f800000    # 1.0f

    .line 758
    .line 759
    const/high16 v8, 0x3f800000    # 1.0f

    .line 760
    .line 761
    const/4 v7, 0x0

    .line 762
    const/high16 v9, 0x3f800000    # 1.0f

    .line 763
    .line 764
    const/high16 v12, 0x3f800000    # 1.0f

    .line 765
    .line 766
    const/4 v13, 0x0

    .line 767
    const/4 v14, 0x0

    .line 768
    const/4 v15, 0x0

    .line 769
    const-string v4, ""

    .line 770
    .line 771
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 772
    .line 773
    .line 774
    move-result-object v0

    .line 775
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 776
    .line 777
    .line 778
    move-result-object v0

    .line 779
    sput-object v0, Landroidx/compose/material/icons/filled/SettingsApplicationsKt;->_settingsApplications:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 780
    .line 781
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 782
    .line 783
    .line 784
    return-object v0
.end method
