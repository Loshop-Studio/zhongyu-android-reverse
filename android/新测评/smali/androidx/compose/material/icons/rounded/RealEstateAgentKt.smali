.class public final Landroidx/compose/material/icons/rounded/RealEstateAgentKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_realEstateAgent",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "RealEstateAgent",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getRealEstateAgent",
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
        "SMAP\nRealEstateAgent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealEstateAgent.kt\nandroidx/compose/material/icons/rounded/RealEstateAgentKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,105:1\n212#2,12:106\n233#2,18:119\n253#2:156\n174#3:118\n705#4,2:137\n717#4,2:139\n719#4,11:145\n72#5,4:141\n*S KotlinDebug\n*F\n+ 1 RealEstateAgent.kt\nandroidx/compose/material/icons/rounded/RealEstateAgentKt\n*L\n29#1:106,12\n30#1:119,18\n30#1:156\n29#1:118\n30#1:137,2\n30#1:139,2\n30#1:145,11\n30#1:141,4\n*E\n"
    }
.end annotation


# static fields
.field private static _realEstateAgent:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRealEstateAgent(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/RealEstateAgentKt;->_realEstateAgent:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.RealEstateAgent"

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
    const/high16 v0, 0x40400000    # 3.0f

    .line 71
    .line 72
    const/high16 v2, 0x41b00000    # 22.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x40000000    # 2.0f

    .line 78
    .line 79
    const/high16 v18, -0x40000000    # -2.0f

    .line 80
    .line 81
    const v13, 0x3f8ccccd    # 1.1f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, 0x40000000    # 2.0f

    .line 86
    .line 87
    const v16, -0x4099999a    # -0.9f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v0, -0x3f200000    # -7.0f

    .line 94
    .line 95
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v17, -0x40000000    # -2.0f

    .line 99
    .line 100
    const/4 v13, 0x0

    .line 101
    const v14, -0x40733333    # -1.1f

    .line 102
    .line 103
    .line 104
    const v15, -0x4099999a    # -0.9f

    .line 105
    .line 106
    .line 107
    const/high16 v16, -0x40000000    # -2.0f

    .line 108
    .line 109
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v0, 0x3f666666    # 0.9f

    .line 113
    .line 114
    .line 115
    const/high16 v2, 0x40000000    # 2.0f

    .line 116
    .line 117
    const/high16 v4, -0x40000000    # -2.0f

    .line 118
    .line 119
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v0, 0x40e00000    # 7.0f

    .line 123
    .line 124
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v17, 0x40400000    # 3.0f

    .line 128
    .line 129
    const/high16 v18, 0x41b00000    # 22.0f

    .line 130
    .line 131
    const/high16 v13, 0x3f800000    # 1.0f

    .line 132
    .line 133
    const v14, 0x41a8cccd    # 21.1f

    .line 134
    .line 135
    .line 136
    const v15, 0x3ff33333    # 1.9f

    .line 137
    .line 138
    .line 139
    const/high16 v16, 0x41b00000    # 22.0f

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
    const v0, 0x4135eb85    # 11.37f

    .line 148
    .line 149
    .line 150
    const v2, 0x418370a4    # 16.43f

    .line 151
    .line 152
    .line 153
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v0, 0x3fbc28f6    # 1.47f

    .line 157
    .line 158
    .line 159
    const v2, 0x3f028f5c    # 0.51f

    .line 160
    .line 161
    .line 162
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v17, 0x3ea8f5c3    # 0.33f

    .line 166
    .line 167
    .line 168
    const v18, 0x3d75c28f    # 0.06f

    .line 169
    .line 170
    .line 171
    const v13, 0x3de147ae    # 0.11f

    .line 172
    .line 173
    .line 174
    const v14, 0x3d23d70a    # 0.04f

    .line 175
    .line 176
    .line 177
    const v15, 0x3e6147ae    # 0.22f

    .line 178
    .line 179
    .line 180
    const v16, 0x3d75c28f    # 0.06f

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v0, 0x40da8f5c    # 6.83f

    .line 187
    .line 188
    .line 189
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v17, 0x4000a3d7    # 2.01f

    .line 193
    .line 194
    .line 195
    const/high16 v18, 0x40000000    # 2.0f

    .line 196
    .line 197
    const v13, 0x3f8e147b    # 1.11f

    .line 198
    .line 199
    .line 200
    const/4 v14, 0x0

    .line 201
    const/high16 v15, 0x40000000    # 2.0f

    .line 202
    .line 203
    const v16, 0x3f63d70a    # 0.89f

    .line 204
    .line 205
    .line 206
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/4 v0, 0x0

    .line 210
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v0, -0x3f13851f    # -7.39f

    .line 214
    .line 215
    .line 216
    const v2, 0x403147ae    # 2.77f

    .line 217
    .line 218
    .line 219
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const/high16 v17, -0x40600000    # -1.25f

    .line 223
    .line 224
    const v18, 0x3d4ccccd    # 0.05f

    .line 225
    .line 226
    .line 227
    const v13, -0x41333333    # -0.4f

    .line 228
    .line 229
    .line 230
    const v14, 0x3e19999a    # 0.15f

    .line 231
    .line 232
    .line 233
    const v15, -0x40a8f5c3    # -0.84f

    .line 234
    .line 235
    .line 236
    const v16, 0x3e2e147b    # 0.17f

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const v0, 0x41a028f6    # 20.02f

    .line 243
    .line 244
    .line 245
    const/high16 v2, 0x40e00000    # 7.0f

    .line 246
    .line 247
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v0, 0x41300000    # 11.0f

    .line 251
    .line 252
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v0, 0x4109999a    # 8.6f

    .line 256
    .line 257
    .line 258
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v17, 0x3f333333    # 0.7f

    .line 262
    .line 263
    .line 264
    const v18, 0x3e051eb8    # 0.13f

    .line 265
    .line 266
    .line 267
    const v13, 0x3e75c28f    # 0.24f

    .line 268
    .line 269
    .line 270
    const/4 v14, 0x0

    .line 271
    const v15, 0x3ef5c28f    # 0.48f

    .line 272
    .line 273
    .line 274
    const v16, 0x3d23d70a    # 0.04f

    .line 275
    .line 276
    .line 277
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v0, 0x40ddc28f    # 6.93f

    .line 281
    .line 282
    .line 283
    const v2, 0x4025c28f    # 2.59f

    .line 284
    .line 285
    .line 286
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v17, 0x3f451eb8    # 0.77f

    .line 290
    .line 291
    .line 292
    const v18, 0x3f8e147b    # 1.11f

    .line 293
    .line 294
    .line 295
    const v13, 0x3eeb851f    # 0.46f

    .line 296
    .line 297
    .line 298
    const v14, 0x3e2e147b    # 0.17f

    .line 299
    .line 300
    .line 301
    const v15, 0x3f451eb8    # 0.77f

    .line 302
    .line 303
    .line 304
    const v16, 0x3f1c28f6    # 0.61f

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/4 v0, 0x0

    .line 311
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v17, -0x4068f5c3    # -1.18f

    .line 315
    .line 316
    .line 317
    const v18, 0x3f970a3d    # 1.18f

    .line 318
    .line 319
    .line 320
    const/4 v13, 0x0

    .line 321
    const v14, 0x3f266666    # 0.65f

    .line 322
    .line 323
    .line 324
    const v15, -0x40f851ec    # -0.53f

    .line 325
    .line 326
    .line 327
    const v16, 0x3f970a3d    # 1.18f

    .line 328
    .line 329
    .line 330
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v0, -0x3fd7ae14    # -2.63f

    .line 334
    .line 335
    .line 336
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v17, -0x4147ae14    # -0.36f

    .line 340
    .line 341
    .line 342
    const v18, -0x4270a3d7    # -0.07f

    .line 343
    .line 344
    .line 345
    const v13, -0x420a3d71    # -0.12f

    .line 346
    .line 347
    .line 348
    const/4 v14, 0x0

    .line 349
    const v15, -0x418a3d71    # -0.24f

    .line 350
    .line 351
    .line 352
    const v16, -0x435c28f6    # -0.02f

    .line 353
    .line 354
    .line 355
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v0, -0x4070a3d7    # -1.12f

    .line 359
    .line 360
    .line 361
    const v2, -0x4123d70a    # -0.43f

    .line 362
    .line 363
    .line 364
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v17, -0x40dc28f6    # -0.64f

    .line 368
    .line 369
    .line 370
    const v18, 0x3e99999a    # 0.3f

    .line 371
    .line 372
    .line 373
    const v13, -0x417ae148    # -0.26f

    .line 374
    .line 375
    .line 376
    const v14, -0x42333333    # -0.1f

    .line 377
    .line 378
    .line 379
    const v15, -0x40f33333    # -0.55f

    .line 380
    .line 381
    .line 382
    const v16, 0x3d23d70a    # 0.04f

    .line 383
    .line 384
    .line 385
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v17, 0x4135eb85    # 11.37f

    .line 389
    .line 390
    .line 391
    const v18, 0x418370a4    # 16.43f

    .line 392
    .line 393
    .line 394
    const v13, 0x412fae14    # 10.98f

    .line 395
    .line 396
    .line 397
    const v14, 0x41807ae1    # 16.06f

    .line 398
    .line 399
    .line 400
    const v15, 0x4131c28f    # 11.11f

    .line 401
    .line 402
    .line 403
    const v16, 0x4182b852    # 16.34f

    .line 404
    .line 405
    .line 406
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v0, 0x41a147ae    # 20.16f

    .line 413
    .line 414
    .line 415
    const v2, 0x40bccccd    # 5.9f

    .line 416
    .line 417
    .line 418
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v0, -0x3f9b851f    # -3.57f

    .line 422
    .line 423
    .line 424
    const/high16 v2, -0x3f600000    # -5.0f

    .line 425
    .line 426
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v17, -0x3feb851f    # -2.32f

    .line 430
    .line 431
    .line 432
    const/16 v18, 0x0

    .line 433
    .line 434
    const v13, -0x40cccccd    # -0.7f

    .line 435
    .line 436
    .line 437
    const/high16 v14, -0x41000000    # -0.5f

    .line 438
    .line 439
    const v15, -0x402f5c29    # -1.63f

    .line 440
    .line 441
    .line 442
    const/high16 v16, -0x41000000    # -0.5f

    .line 443
    .line 444
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v0, 0x40647ae1    # 3.57f

    .line 448
    .line 449
    .line 450
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v17, 0x40e00000    # 7.0f

    .line 454
    .line 455
    const v18, 0x40f0f5c3    # 7.53f

    .line 456
    .line 457
    .line 458
    const v13, 0x40e9eb85    # 7.31f

    .line 459
    .line 460
    .line 461
    const v14, 0x40c8f5c3    # 6.28f

    .line 462
    .line 463
    .line 464
    const/high16 v15, 0x40e00000    # 7.0f

    .line 465
    .line 466
    const v16, 0x40dc28f6    # 6.88f

    .line 467
    .line 468
    .line 469
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const/high16 v0, 0x41100000    # 9.0f

    .line 473
    .line 474
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const v0, 0x3fce147b    # 1.61f

    .line 478
    .line 479
    .line 480
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v17, 0x3f3d70a4    # 0.74f

    .line 484
    .line 485
    .line 486
    const v18, 0x3e0f5c29    # 0.14f

    .line 487
    .line 488
    .line 489
    const/high16 v13, 0x3e800000    # 0.25f

    .line 490
    .line 491
    const/4 v14, 0x0

    .line 492
    const v15, 0x3f028f5c    # 0.51f

    .line 493
    .line 494
    .line 495
    const v16, 0x3d4ccccd    # 0.05f

    .line 496
    .line 497
    .line 498
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const v0, 0x40f947ae    # 7.79f

    .line 502
    .line 503
    .line 504
    const v2, 0x40470a3d    # 3.11f

    .line 505
    .line 506
    .line 507
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const/high16 v17, 0x41980000    # 19.0f

    .line 511
    .line 512
    const/high16 v18, 0x41700000    # 15.0f

    .line 513
    .line 514
    const v13, 0x4192147b    # 18.26f

    .line 515
    .line 516
    .line 517
    const v14, 0x414b5c29    # 12.71f

    .line 518
    .line 519
    .line 520
    const/high16 v15, 0x41980000    # 19.0f

    .line 521
    .line 522
    const v16, 0x415ca3d7    # 13.79f

    .line 523
    .line 524
    .line 525
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const/high16 v0, 0x40000000    # 2.0f

    .line 529
    .line 530
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const v0, 0x40f0f5c3    # 7.53f

    .line 534
    .line 535
    .line 536
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const v17, 0x41a147ae    # 20.16f

    .line 540
    .line 541
    .line 542
    const v18, 0x40bccccd    # 5.9f

    .line 543
    .line 544
    .line 545
    const/high16 v13, 0x41a80000    # 21.0f

    .line 546
    .line 547
    const v14, 0x40dc28f6    # 6.88f

    .line 548
    .line 549
    .line 550
    const v15, 0x41a5851f    # 20.69f

    .line 551
    .line 552
    .line 553
    const v16, 0x40c8f5c3    # 6.28f

    .line 554
    .line 555
    .line 556
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const/high16 v0, 0x41200000    # 10.0f

    .line 563
    .line 564
    const/high16 v2, 0x41500000    # 13.0f

    .line 565
    .line 566
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const/high16 v17, -0x41000000    # -0.5f

    .line 570
    .line 571
    const/high16 v18, -0x41000000    # -0.5f

    .line 572
    .line 573
    const v13, -0x4170a3d7    # -0.28f

    .line 574
    .line 575
    .line 576
    const/4 v14, 0x0

    .line 577
    const/high16 v15, -0x41000000    # -0.5f

    .line 578
    .line 579
    const v16, -0x419eb852    # -0.22f

    .line 580
    .line 581
    .line 582
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const/high16 v17, 0x41500000    # 13.0f

    .line 586
    .line 587
    const/high16 v18, 0x41100000    # 9.0f

    .line 588
    .line 589
    const/high16 v13, 0x41480000    # 12.5f

    .line 590
    .line 591
    const v14, 0x4113851f    # 9.22f

    .line 592
    .line 593
    .line 594
    const v15, 0x414b851f    # 12.72f

    .line 595
    .line 596
    .line 597
    const/high16 v16, 0x41100000    # 9.0f

    .line 598
    .line 599
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const v0, 0x3e6147ae    # 0.22f

    .line 603
    .line 604
    .line 605
    const/high16 v2, 0x3f000000    # 0.5f

    .line 606
    .line 607
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const/high16 v18, 0x41200000    # 10.0f

    .line 611
    .line 612
    const/high16 v13, 0x41580000    # 13.5f

    .line 613
    .line 614
    const v14, 0x411c7ae1    # 9.78f

    .line 615
    .line 616
    .line 617
    const v15, 0x41547ae1    # 13.28f

    .line 618
    .line 619
    .line 620
    const/high16 v16, 0x41200000    # 10.0f

    .line 621
    .line 622
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const/high16 v0, 0x41000000    # 8.0f

    .line 629
    .line 630
    const/high16 v2, 0x41500000    # 13.0f

    .line 631
    .line 632
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const/high16 v17, -0x41000000    # -0.5f

    .line 636
    .line 637
    const/high16 v18, -0x41000000    # -0.5f

    .line 638
    .line 639
    const v13, -0x4170a3d7    # -0.28f

    .line 640
    .line 641
    .line 642
    const/4 v14, 0x0

    .line 643
    const/high16 v15, -0x41000000    # -0.5f

    .line 644
    .line 645
    const v16, -0x419eb852    # -0.22f

    .line 646
    .line 647
    .line 648
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    const/high16 v17, 0x41500000    # 13.0f

    .line 652
    .line 653
    const/high16 v18, 0x40e00000    # 7.0f

    .line 654
    .line 655
    const/high16 v13, 0x41480000    # 12.5f

    .line 656
    .line 657
    const v14, 0x40e70a3d    # 7.22f

    .line 658
    .line 659
    .line 660
    const v15, 0x414b851f    # 12.72f

    .line 661
    .line 662
    .line 663
    const/high16 v16, 0x40e00000    # 7.0f

    .line 664
    .line 665
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    const v0, 0x3e6147ae    # 0.22f

    .line 669
    .line 670
    .line 671
    const/high16 v2, 0x3f000000    # 0.5f

    .line 672
    .line 673
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const/high16 v18, 0x41000000    # 8.0f

    .line 677
    .line 678
    const/high16 v13, 0x41580000    # 13.5f

    .line 679
    .line 680
    const v14, 0x40f8f5c3    # 7.78f

    .line 681
    .line 682
    .line 683
    const v15, 0x41547ae1    # 13.28f

    .line 684
    .line 685
    .line 686
    const/high16 v16, 0x41000000    # 8.0f

    .line 687
    .line 688
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 692
    .line 693
    .line 694
    const/high16 v0, 0x41700000    # 15.0f

    .line 695
    .line 696
    const/high16 v2, 0x41200000    # 10.0f

    .line 697
    .line 698
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    const/high16 v17, -0x41000000    # -0.5f

    .line 702
    .line 703
    const/high16 v18, -0x41000000    # -0.5f

    .line 704
    .line 705
    const v13, -0x4170a3d7    # -0.28f

    .line 706
    .line 707
    .line 708
    const/4 v14, 0x0

    .line 709
    const/high16 v15, -0x41000000    # -0.5f

    .line 710
    .line 711
    const v16, -0x419eb852    # -0.22f

    .line 712
    .line 713
    .line 714
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 715
    .line 716
    .line 717
    const/high16 v17, 0x41700000    # 15.0f

    .line 718
    .line 719
    const/high16 v18, 0x41100000    # 9.0f

    .line 720
    .line 721
    const/high16 v13, 0x41680000    # 14.5f

    .line 722
    .line 723
    const v14, 0x4113851f    # 9.22f

    .line 724
    .line 725
    .line 726
    const v15, 0x416b851f    # 14.72f

    .line 727
    .line 728
    .line 729
    const/high16 v16, 0x41100000    # 9.0f

    .line 730
    .line 731
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    const v0, 0x3e6147ae    # 0.22f

    .line 735
    .line 736
    .line 737
    const/high16 v2, 0x3f000000    # 0.5f

    .line 738
    .line 739
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    const/high16 v18, 0x41200000    # 10.0f

    .line 743
    .line 744
    const/high16 v13, 0x41780000    # 15.5f

    .line 745
    .line 746
    const v14, 0x411c7ae1    # 9.78f

    .line 747
    .line 748
    .line 749
    const v15, 0x41747ae1    # 15.28f

    .line 750
    .line 751
    .line 752
    const/high16 v16, 0x41200000    # 10.0f

    .line 753
    .line 754
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 755
    .line 756
    .line 757
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 758
    .line 759
    .line 760
    const/high16 v0, 0x41700000    # 15.0f

    .line 761
    .line 762
    const/high16 v2, 0x41000000    # 8.0f

    .line 763
    .line 764
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 765
    .line 766
    .line 767
    const/high16 v17, -0x41000000    # -0.5f

    .line 768
    .line 769
    const/high16 v18, -0x41000000    # -0.5f

    .line 770
    .line 771
    const v13, -0x4170a3d7    # -0.28f

    .line 772
    .line 773
    .line 774
    const/4 v14, 0x0

    .line 775
    const/high16 v15, -0x41000000    # -0.5f

    .line 776
    .line 777
    const v16, -0x419eb852    # -0.22f

    .line 778
    .line 779
    .line 780
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 781
    .line 782
    .line 783
    const/high16 v17, 0x41700000    # 15.0f

    .line 784
    .line 785
    const/high16 v18, 0x40e00000    # 7.0f

    .line 786
    .line 787
    const/high16 v13, 0x41680000    # 14.5f

    .line 788
    .line 789
    const v14, 0x40e70a3d    # 7.22f

    .line 790
    .line 791
    .line 792
    const v15, 0x416b851f    # 14.72f

    .line 793
    .line 794
    .line 795
    const/high16 v16, 0x40e00000    # 7.0f

    .line 796
    .line 797
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 798
    .line 799
    .line 800
    const v0, 0x3e6147ae    # 0.22f

    .line 801
    .line 802
    .line 803
    const/high16 v2, 0x3f000000    # 0.5f

    .line 804
    .line 805
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 806
    .line 807
    .line 808
    const/high16 v18, 0x41000000    # 8.0f

    .line 809
    .line 810
    const/high16 v13, 0x41780000    # 15.5f

    .line 811
    .line 812
    const v14, 0x40f8f5c3    # 7.78f

    .line 813
    .line 814
    .line 815
    const v15, 0x41747ae1    # 15.28f

    .line 816
    .line 817
    .line 818
    const/high16 v16, 0x41000000    # 8.0f

    .line 819
    .line 820
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 821
    .line 822
    .line 823
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 824
    .line 825
    .line 826
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 827
    .line 828
    .line 829
    move-result-object v2

    .line 830
    const/16 v16, 0x3800

    .line 831
    .line 832
    const/16 v17, 0x0

    .line 833
    .line 834
    const/high16 v6, 0x3f800000    # 1.0f

    .line 835
    .line 836
    const/high16 v8, 0x3f800000    # 1.0f

    .line 837
    .line 838
    const/4 v7, 0x0

    .line 839
    const/high16 v9, 0x3f800000    # 1.0f

    .line 840
    .line 841
    const/high16 v12, 0x3f800000    # 1.0f

    .line 842
    .line 843
    const/4 v13, 0x0

    .line 844
    const/4 v14, 0x0

    .line 845
    const/4 v15, 0x0

    .line 846
    const-string v4, ""

    .line 847
    .line 848
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 849
    .line 850
    .line 851
    move-result-object v0

    .line 852
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 853
    .line 854
    .line 855
    move-result-object v0

    .line 856
    sput-object v0, Landroidx/compose/material/icons/rounded/RealEstateAgentKt;->_realEstateAgent:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 857
    .line 858
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 859
    .line 860
    .line 861
    return-object v0
.end method
