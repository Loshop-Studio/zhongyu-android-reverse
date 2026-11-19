.class public final Landroidx/compose/material/icons/rounded/AppSettingsAltKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_appSettingsAlt",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "AppSettingsAlt",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getAppSettingsAlt",
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
        "SMAP\nAppSettingsAlt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppSettingsAlt.kt\nandroidx/compose/material/icons/rounded/AppSettingsAltKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,101:1\n212#2,12:102\n233#2,18:115\n253#2:152\n174#3:114\n705#4,2:133\n717#4,2:135\n719#4,11:141\n72#5,4:137\n*S KotlinDebug\n*F\n+ 1 AppSettingsAlt.kt\nandroidx/compose/material/icons/rounded/AppSettingsAltKt\n*L\n29#1:102,12\n30#1:115,18\n30#1:152\n29#1:114\n30#1:133,2\n30#1:135,2\n30#1:141,11\n30#1:137,4\n*E\n"
    }
.end annotation


# static fields
.field private static _appSettingsAlt:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAppSettingsAlt(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/AppSettingsAltKt;->_appSettingsAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.AppSettingsAlt"

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
    const/high16 v0, 0x41880000    # 17.0f

    .line 71
    .line 72
    const/high16 v2, 0x41900000    # 18.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40e00000    # 7.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v0, 0x40c00000    # 6.0f

    .line 83
    .line 84
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v0, 0x41200000    # 10.0f

    .line 88
    .line 89
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/high16 v0, 0x3f800000    # 1.0f

    .line 93
    .line 94
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v0, 0x40000000    # 2.0f

    .line 98
    .line 99
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v0, 0x40400000    # 3.0f

    .line 103
    .line 104
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v17, -0x40000000    # -2.0f

    .line 108
    .line 109
    const/high16 v18, -0x40000000    # -2.0f

    .line 110
    .line 111
    const/4 v13, 0x0

    .line 112
    const v14, -0x40733333    # -1.1f

    .line 113
    .line 114
    .line 115
    const v15, -0x4099999a    # -0.9f

    .line 116
    .line 117
    .line 118
    const/high16 v16, -0x40000000    # -2.0f

    .line 119
    .line 120
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v0, 0x3f8147ae    # 1.01f

    .line 124
    .line 125
    .line 126
    const/high16 v2, 0x40e00000    # 7.0f

    .line 127
    .line 128
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v17, 0x40a00000    # 5.0f

    .line 132
    .line 133
    const/high16 v18, 0x40400000    # 3.0f

    .line 134
    .line 135
    const v13, 0x40bccccd    # 5.9f

    .line 136
    .line 137
    .line 138
    const v14, 0x3f8147ae    # 1.01f

    .line 139
    .line 140
    .line 141
    const/high16 v15, 0x40a00000    # 5.0f

    .line 142
    .line 143
    const v16, 0x3ff33333    # 1.9f

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v0, 0x41900000    # 18.0f

    .line 150
    .line 151
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v17, 0x40000000    # 2.0f

    .line 155
    .line 156
    const/high16 v18, 0x40000000    # 2.0f

    .line 157
    .line 158
    const/4 v13, 0x0

    .line 159
    const v14, 0x3f8ccccd    # 1.1f

    .line 160
    .line 161
    .line 162
    const v15, 0x3f666666    # 0.9f

    .line 163
    .line 164
    .line 165
    const/high16 v16, 0x40000000    # 2.0f

    .line 166
    .line 167
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v0, 0x41200000    # 10.0f

    .line 171
    .line 172
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const/high16 v18, -0x40000000    # -2.0f

    .line 176
    .line 177
    const v13, 0x3f8ccccd    # 1.1f

    .line 178
    .line 179
    .line 180
    const/4 v14, 0x0

    .line 181
    const/high16 v15, 0x40000000    # 2.0f

    .line 182
    .line 183
    const v16, -0x4099999a    # -0.9f

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/high16 v0, -0x3f800000    # -4.0f

    .line 190
    .line 191
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v0, -0x40000000    # -2.0f

    .line 195
    .line 196
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/high16 v0, 0x41900000    # 18.0f

    .line 200
    .line 201
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v0, 0x41a80000    # 21.0f

    .line 208
    .line 209
    const/high16 v2, 0x41400000    # 12.0f

    .line 210
    .line 211
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v17, -0x42dc28f6    # -0.04f

    .line 215
    .line 216
    .line 217
    const v18, -0x413851ec    # -0.39f

    .line 218
    .line 219
    .line 220
    const/4 v13, 0x0

    .line 221
    const v14, -0x41fae148    # -0.13f

    .line 222
    .line 223
    .line 224
    const v15, -0x435c28f6    # -0.02f

    .line 225
    .line 226
    .line 227
    const v16, -0x417ae148    # -0.26f

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v0, -0x410a3d71    # -0.48f

    .line 234
    .line 235
    .line 236
    const v2, 0x3f23d70a    # 0.64f

    .line 237
    .line 238
    .line 239
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const v17, 0x3e051eb8    # 0.13f

    .line 243
    .line 244
    .line 245
    const v18, -0x40d70a3d    # -0.66f

    .line 246
    .line 247
    .line 248
    const v13, 0x3e4ccccd    # 0.2f

    .line 249
    .line 250
    .line 251
    const v14, -0x41e66666    # -0.15f

    .line 252
    .line 253
    .line 254
    const v15, 0x3e851eb8    # 0.26f

    .line 255
    .line 256
    .line 257
    const v16, -0x411eb852    # -0.44f

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v0, -0x408a3d71    # -0.96f

    .line 264
    .line 265
    .line 266
    const v2, -0x40ee147b    # -0.57f

    .line 267
    .line 268
    .line 269
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v17, -0x40e147ae    # -0.62f

    .line 273
    .line 274
    .line 275
    const v18, -0x41b33333    # -0.2f

    .line 276
    .line 277
    .line 278
    const v13, -0x41fae148    # -0.13f

    .line 279
    .line 280
    .line 281
    const v14, -0x41a8f5c3    # -0.21f

    .line 282
    .line 283
    .line 284
    const v15, -0x413851ec    # -0.39f

    .line 285
    .line 286
    .line 287
    const v16, -0x41666666    # -0.3f

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v0, 0x3e99999a    # 0.3f

    .line 294
    .line 295
    .line 296
    const v2, -0x40c7ae14    # -0.72f

    .line 297
    .line 298
    .line 299
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v17, -0x40d9999a    # -0.65f

    .line 303
    .line 304
    .line 305
    const v18, -0x413851ec    # -0.39f

    .line 306
    .line 307
    .line 308
    const v13, -0x41b33333    # -0.2f

    .line 309
    .line 310
    .line 311
    const v14, -0x41e66666    # -0.15f

    .line 312
    .line 313
    .line 314
    const v15, -0x4128f5c3    # -0.42f

    .line 315
    .line 316
    .line 317
    const v16, -0x416b851f    # -0.29f

    .line 318
    .line 319
    .line 320
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v0, -0x40bae148    # -0.77f

    .line 324
    .line 325
    .line 326
    const v2, -0x42333333    # -0.1f

    .line 327
    .line 328
    .line 329
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v17, -0x41051eb8    # -0.49f

    .line 333
    .line 334
    .line 335
    const v18, -0x411eb852    # -0.44f

    .line 336
    .line 337
    .line 338
    const v13, -0x430a3d71    # -0.03f

    .line 339
    .line 340
    .line 341
    const/high16 v14, -0x41800000    # -0.25f

    .line 342
    .line 343
    const v15, -0x418a3d71    # -0.24f

    .line 344
    .line 345
    .line 346
    const v16, -0x4123d70a    # -0.43f

    .line 347
    .line 348
    .line 349
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const v0, -0x4070a3d7    # -1.12f

    .line 353
    .line 354
    .line 355
    const v2, -0x435c28f6    # -0.02f

    .line 356
    .line 357
    .line 358
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const/high16 v17, -0x41000000    # -0.5f

    .line 362
    .line 363
    const v18, 0x3ee147ae    # 0.44f

    .line 364
    .line 365
    .line 366
    const v13, -0x417ae148    # -0.26f

    .line 367
    .line 368
    .line 369
    const/4 v14, 0x0

    .line 370
    const v15, -0x410f5c29    # -0.47f

    .line 371
    .line 372
    .line 373
    const v16, 0x3e3851ec    # 0.18f

    .line 374
    .line 375
    .line 376
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v0, 0x3f4a3d71    # 0.79f

    .line 380
    .line 381
    .line 382
    const v2, -0x42333333    # -0.1f

    .line 383
    .line 384
    .line 385
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v17, -0x40d9999a    # -0.65f

    .line 389
    .line 390
    .line 391
    const v18, 0x3ec7ae14    # 0.39f

    .line 392
    .line 393
    .line 394
    const v13, -0x418a3d71    # -0.24f

    .line 395
    .line 396
    .line 397
    const v14, 0x3dcccccd    # 0.1f

    .line 398
    .line 399
    .line 400
    const v15, -0x4119999a    # -0.45f

    .line 401
    .line 402
    .line 403
    const v16, 0x3e6b851f    # 0.23f

    .line 404
    .line 405
    .line 406
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v0, -0x41666666    # -0.3f

    .line 410
    .line 411
    .line 412
    const v2, -0x40c7ae14    # -0.72f

    .line 413
    .line 414
    .line 415
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v17, -0x40e147ae    # -0.62f

    .line 419
    .line 420
    .line 421
    const v18, 0x3e4ccccd    # 0.2f

    .line 422
    .line 423
    .line 424
    const v13, -0x41947ae1    # -0.23f

    .line 425
    .line 426
    .line 427
    const v14, -0x42333333    # -0.1f

    .line 428
    .line 429
    .line 430
    const/high16 v15, -0x41000000    # -0.5f

    .line 431
    .line 432
    const v16, -0x43dc28f6    # -0.01f

    .line 433
    .line 434
    .line 435
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v0, 0x3f75c28f    # 0.96f

    .line 439
    .line 440
    .line 441
    const v2, -0x40ee147b    # -0.57f

    .line 442
    .line 443
    .line 444
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v17, 0x3e051eb8    # 0.13f

    .line 448
    .line 449
    .line 450
    const v18, 0x3f28f5c3    # 0.66f

    .line 451
    .line 452
    .line 453
    const v13, -0x41fae148    # -0.13f

    .line 454
    .line 455
    .line 456
    const v14, 0x3e6147ae    # 0.22f

    .line 457
    .line 458
    .line 459
    const v15, -0x425c28f6    # -0.08f

    .line 460
    .line 461
    .line 462
    const/high16 v16, 0x3f000000    # 0.5f

    .line 463
    .line 464
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const v0, 0x3ef5c28f    # 0.48f

    .line 468
    .line 469
    .line 470
    const v2, 0x3f23d70a    # 0.64f

    .line 471
    .line 472
    .line 473
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v17, 0x41700000    # 15.0f

    .line 477
    .line 478
    const/high16 v18, 0x41400000    # 12.0f

    .line 479
    .line 480
    const v13, 0x417051ec    # 15.02f

    .line 481
    .line 482
    .line 483
    const v14, 0x413bd70a    # 11.74f

    .line 484
    .line 485
    .line 486
    const/high16 v15, 0x41700000    # 15.0f

    .line 487
    .line 488
    const v16, 0x413deb85    # 11.87f

    .line 489
    .line 490
    .line 491
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const v17, 0x3d23d70a    # 0.04f

    .line 495
    .line 496
    .line 497
    const v18, 0x3ebd70a4    # 0.37f

    .line 498
    .line 499
    .line 500
    const/4 v13, 0x0

    .line 501
    const v14, 0x3e051eb8    # 0.13f

    .line 502
    .line 503
    .line 504
    const v15, 0x3ca3d70a    # 0.02f

    .line 505
    .line 506
    .line 507
    const/high16 v16, 0x3e800000    # 0.25f

    .line 508
    .line 509
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const v0, 0x3efae148    # 0.49f

    .line 513
    .line 514
    .line 515
    const v2, -0x40dc28f6    # -0.64f

    .line 516
    .line 517
    .line 518
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v17, -0x41fae148    # -0.13f

    .line 522
    .line 523
    .line 524
    const v18, 0x3f266666    # 0.65f

    .line 525
    .line 526
    .line 527
    const v13, -0x41b33333    # -0.2f

    .line 528
    .line 529
    .line 530
    const v14, 0x3e19999a    # 0.15f

    .line 531
    .line 532
    .line 533
    const v15, -0x417ae148    # -0.26f

    .line 534
    .line 535
    .line 536
    const v16, 0x3edc28f6    # 0.43f

    .line 537
    .line 538
    .line 539
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const v0, 0x3f7851ec    # 0.97f

    .line 543
    .line 544
    .line 545
    const v2, 0x3f0f5c29    # 0.56f

    .line 546
    .line 547
    .line 548
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v17, 0x3f2147ae    # 0.63f

    .line 552
    .line 553
    .line 554
    const v18, 0x3e570a3d    # 0.21f

    .line 555
    .line 556
    .line 557
    const v13, 0x3e051eb8    # 0.13f

    .line 558
    .line 559
    .line 560
    const v14, 0x3e6147ae    # 0.22f

    .line 561
    .line 562
    .line 563
    const v15, 0x3ec7ae14    # 0.39f

    .line 564
    .line 565
    .line 566
    const v16, 0x3e9eb852    # 0.31f

    .line 567
    .line 568
    .line 569
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const v0, -0x416147ae    # -0.31f

    .line 573
    .line 574
    .line 575
    const v2, 0x3f3ae148    # 0.73f

    .line 576
    .line 577
    .line 578
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const v17, 0x3f2b851f    # 0.67f

    .line 582
    .line 583
    .line 584
    const v18, 0x3ecccccd    # 0.4f

    .line 585
    .line 586
    .line 587
    const v13, 0x3e4ccccd    # 0.2f

    .line 588
    .line 589
    .line 590
    const v14, 0x3e23d70a    # 0.16f

    .line 591
    .line 592
    .line 593
    const v15, 0x3ed70a3d    # 0.42f

    .line 594
    .line 595
    .line 596
    const v16, 0x3e99999a    # 0.3f

    .line 597
    .line 598
    .line 599
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const v0, 0x3f451eb8    # 0.77f

    .line 603
    .line 604
    .line 605
    const v2, 0x3dcccccd    # 0.1f

    .line 606
    .line 607
    .line 608
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const/high16 v17, 0x3f000000    # 0.5f

    .line 612
    .line 613
    const v18, 0x3ee147ae    # 0.44f

    .line 614
    .line 615
    .line 616
    const v13, 0x3cf5c28f    # 0.03f

    .line 617
    .line 618
    .line 619
    const/high16 v14, 0x3e800000    # 0.25f

    .line 620
    .line 621
    const v15, 0x3e75c28f    # 0.24f

    .line 622
    .line 623
    .line 624
    const v16, 0x3ee147ae    # 0.44f

    .line 625
    .line 626
    .line 627
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    const v0, 0x3f8f5c29    # 1.12f

    .line 631
    .line 632
    .line 633
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const v18, -0x411eb852    # -0.44f

    .line 637
    .line 638
    .line 639
    const/high16 v13, 0x3e800000    # 0.25f

    .line 640
    .line 641
    const/4 v14, 0x0

    .line 642
    const v15, 0x3eeb851f    # 0.46f

    .line 643
    .line 644
    .line 645
    const v16, -0x41bd70a4    # -0.19f

    .line 646
    .line 647
    .line 648
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    const v0, 0x3dcccccd    # 0.1f

    .line 652
    .line 653
    .line 654
    const v2, -0x40bae148    # -0.77f

    .line 655
    .line 656
    .line 657
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const v17, 0x3f2b851f    # 0.67f

    .line 661
    .line 662
    .line 663
    const v18, -0x41333333    # -0.4f

    .line 664
    .line 665
    .line 666
    const v13, 0x3e75c28f    # 0.24f

    .line 667
    .line 668
    .line 669
    const v14, -0x42333333    # -0.1f

    .line 670
    .line 671
    .line 672
    const v16, -0x418a3d71    # -0.24f

    .line 673
    .line 674
    .line 675
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const v0, 0x3e9eb852    # 0.31f

    .line 679
    .line 680
    .line 681
    const v2, 0x3f3ae148    # 0.73f

    .line 682
    .line 683
    .line 684
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    const v17, 0x3f2147ae    # 0.63f

    .line 688
    .line 689
    .line 690
    const v18, -0x41a8f5c3    # -0.21f

    .line 691
    .line 692
    .line 693
    const v13, 0x3e6b851f    # 0.23f

    .line 694
    .line 695
    .line 696
    const v14, 0x3dcccccd    # 0.1f

    .line 697
    .line 698
    .line 699
    const/high16 v15, 0x3f000000    # 0.5f

    .line 700
    .line 701
    const v16, 0x3c23d70a    # 0.01f

    .line 702
    .line 703
    .line 704
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 705
    .line 706
    .line 707
    const v0, -0x4087ae14    # -0.97f

    .line 708
    .line 709
    .line 710
    const v2, 0x3f0f5c29    # 0.56f

    .line 711
    .line 712
    .line 713
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 714
    .line 715
    .line 716
    const v17, -0x41fae148    # -0.13f

    .line 717
    .line 718
    .line 719
    const v18, -0x40d9999a    # -0.65f

    .line 720
    .line 721
    .line 722
    const v13, 0x3e051eb8    # 0.13f

    .line 723
    .line 724
    .line 725
    const v14, -0x419eb852    # -0.22f

    .line 726
    .line 727
    .line 728
    const v15, 0x3d8f5c29    # 0.07f

    .line 729
    .line 730
    .line 731
    const/high16 v16, -0x41000000    # -0.5f

    .line 732
    .line 733
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 734
    .line 735
    .line 736
    const v0, -0x41051eb8    # -0.49f

    .line 737
    .line 738
    .line 739
    const v2, -0x40dc28f6    # -0.64f

    .line 740
    .line 741
    .line 742
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    const/high16 v17, 0x41a80000    # 21.0f

    .line 746
    .line 747
    const/high16 v18, 0x41400000    # 12.0f

    .line 748
    .line 749
    const v13, 0x41a7d70a    # 20.98f

    .line 750
    .line 751
    .line 752
    const/high16 v14, 0x41440000    # 12.25f

    .line 753
    .line 754
    const/high16 v15, 0x41a80000    # 21.0f

    .line 755
    .line 756
    const v16, 0x4142147b    # 12.13f

    .line 757
    .line 758
    .line 759
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 760
    .line 761
    .line 762
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 763
    .line 764
    .line 765
    const/high16 v0, 0x41580000    # 13.5f

    .line 766
    .line 767
    const/high16 v2, 0x41900000    # 18.0f

    .line 768
    .line 769
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 770
    .line 771
    .line 772
    const/high16 v17, -0x40400000    # -1.5f

    .line 773
    .line 774
    const/high16 v18, -0x40400000    # -1.5f

    .line 775
    .line 776
    const v13, -0x40ab851f    # -0.83f

    .line 777
    .line 778
    .line 779
    const/4 v14, 0x0

    .line 780
    const/high16 v15, -0x40400000    # -1.5f

    .line 781
    .line 782
    const v16, -0x40d47ae1    # -0.67f

    .line 783
    .line 784
    .line 785
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 786
    .line 787
    .line 788
    const/high16 v0, -0x40400000    # -1.5f

    .line 789
    .line 790
    const v2, 0x3f2b851f    # 0.67f

    .line 791
    .line 792
    .line 793
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 794
    .line 795
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 796
    .line 797
    .line 798
    const v0, 0x3f2b851f    # 0.67f

    .line 799
    .line 800
    .line 801
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 802
    .line 803
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 804
    .line 805
    .line 806
    const v0, 0x4196a3d7    # 18.83f

    .line 807
    .line 808
    .line 809
    const/high16 v2, 0x41580000    # 13.5f

    .line 810
    .line 811
    const/high16 v4, 0x41900000    # 18.0f

    .line 812
    .line 813
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 814
    .line 815
    .line 816
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 817
    .line 818
    .line 819
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 820
    .line 821
    .line 822
    move-result-object v2

    .line 823
    const/16 v16, 0x3800

    .line 824
    .line 825
    const/16 v17, 0x0

    .line 826
    .line 827
    const/high16 v6, 0x3f800000    # 1.0f

    .line 828
    .line 829
    const/high16 v8, 0x3f800000    # 1.0f

    .line 830
    .line 831
    const/4 v7, 0x0

    .line 832
    const/high16 v9, 0x3f800000    # 1.0f

    .line 833
    .line 834
    const/high16 v12, 0x3f800000    # 1.0f

    .line 835
    .line 836
    const/4 v13, 0x0

    .line 837
    const/4 v15, 0x0

    .line 838
    const-string v4, ""

    .line 839
    .line 840
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 841
    .line 842
    .line 843
    move-result-object v0

    .line 844
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 845
    .line 846
    .line 847
    move-result-object v0

    .line 848
    sput-object v0, Landroidx/compose/material/icons/rounded/AppSettingsAltKt;->_appSettingsAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 849
    .line 850
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 851
    .line 852
    .line 853
    return-object v0
.end method
