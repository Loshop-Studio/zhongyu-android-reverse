.class public final Landroidx/compose/material/icons/twotone/PsychologyAltKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_psychologyAlt",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "PsychologyAlt",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getPsychologyAlt",
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
        "SMAP\nPsychologyAlt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PsychologyAlt.kt\nandroidx/compose/material/icons/twotone/PsychologyAltKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,121:1\n212#2,12:122\n233#2,18:135\n253#2:172\n233#2,18:173\n253#2:210\n233#2,18:211\n253#2:248\n233#2,18:249\n253#2:286\n174#3:134\n705#4,2:153\n717#4,2:155\n719#4,11:161\n705#4,2:191\n717#4,2:193\n719#4,11:199\n705#4,2:229\n717#4,2:231\n719#4,11:237\n705#4,2:267\n717#4,2:269\n719#4,11:275\n72#5,4:157\n72#5,4:195\n72#5,4:233\n72#5,4:271\n*S KotlinDebug\n*F\n+ 1 PsychologyAlt.kt\nandroidx/compose/material/icons/twotone/PsychologyAltKt\n*L\n29#1:122,12\n30#1:135,18\n30#1:172\n64#1:173,18\n64#1:210\n93#1:211,18\n93#1:248\n101#1:249,18\n101#1:286\n29#1:134\n30#1:153,2\n30#1:155,2\n30#1:161,11\n64#1:191,2\n64#1:193,2\n64#1:199,11\n93#1:229,2\n93#1:231,2\n93#1:237,11\n101#1:267,2\n101#1:269,2\n101#1:275,11\n30#1:157,4\n64#1:195,4\n93#1:233,4\n101#1:271,4\n*E\n"
    }
.end annotation


# static fields
.field private static _psychologyAlt:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPsychologyAlt(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PsychologyAltKt;->_psychologyAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.PsychologyAlt"

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
    const/high16 v4, 0x41500000    # 13.0f

    .line 71
    .line 72
    const/high16 v6, 0x40a00000    # 5.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v25, -0x3f60f5c3    # -4.97f

    .line 78
    .line 79
    .line 80
    const v26, 0x409570a4    # 4.67f

    .line 81
    .line 82
    .line 83
    const v21, -0x3fd66666    # -2.65f

    .line 84
    .line 85
    .line 86
    const/16 v22, 0x0

    .line 87
    .line 88
    const v23, -0x3f66b852    # -4.79f

    .line 89
    .line 90
    .line 91
    const v24, 0x4003d70a    # 2.06f

    .line 92
    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v4, 0x41400000    # 12.0f

    .line 100
    .line 101
    const v6, 0x40d66666    # 6.7f

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v4, 0x41000000    # 8.0f

    .line 108
    .line 109
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const/high16 v4, 0x40800000    # 4.0f

    .line 113
    .line 114
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v4, 0x40400000    # 3.0f

    .line 118
    .line 119
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v4, -0x3f833333    # -3.95f

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v4, 0x3f63d70a    # 0.89f

    .line 135
    .line 136
    .line 137
    const v6, -0x4128f5c3    # -0.42f

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v25, 0x41900000    # 18.0f

    .line 144
    .line 145
    const/high16 v26, 0x41200000    # 10.0f

    .line 146
    .line 147
    const v21, 0x4185ae14    # 16.71f

    .line 148
    .line 149
    .line 150
    const v22, 0x415e147b    # 13.88f

    .line 151
    .line 152
    .line 153
    const/high16 v23, 0x41900000    # 18.0f

    .line 154
    .line 155
    const v24, 0x414170a4    # 12.09f

    .line 156
    .line 157
    .line 158
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/high16 v25, 0x41500000    # 13.0f

    .line 162
    .line 163
    const/high16 v26, 0x40a00000    # 5.0f

    .line 164
    .line 165
    const/high16 v21, 0x41900000    # 18.0f

    .line 166
    .line 167
    const v22, 0x40e7ae14    # 7.24f

    .line 168
    .line 169
    .line 170
    const v23, 0x417c28f6    # 15.76f

    .line 171
    .line 172
    .line 173
    const/high16 v24, 0x40a00000    # 5.0f

    .line 174
    .line 175
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v4, 0x41600000    # 14.0f

    .line 182
    .line 183
    const/high16 v6, 0x41480000    # 12.5f

    .line 184
    .line 185
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v25, -0x40c28f5c    # -0.74f

    .line 189
    .line 190
    .line 191
    const v26, -0x40c28f5c    # -0.74f

    .line 192
    .line 193
    .line 194
    const v21, -0x412e147b    # -0.41f

    .line 195
    .line 196
    .line 197
    const/16 v22, 0x0

    .line 198
    .line 199
    const v23, -0x40c28f5c    # -0.74f

    .line 200
    .line 201
    .line 202
    const v24, -0x41570a3d    # -0.33f

    .line 203
    .line 204
    .line 205
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const v25, 0x3f3d70a4    # 0.74f

    .line 209
    .line 210
    .line 211
    const v26, -0x40c51eb8    # -0.73f

    .line 212
    .line 213
    .line 214
    const/16 v21, 0x0

    .line 215
    .line 216
    const v22, -0x412e147b    # -0.41f

    .line 217
    .line 218
    .line 219
    const v23, 0x3ea8f5c3    # 0.33f

    .line 220
    .line 221
    .line 222
    const v24, -0x40c51eb8    # -0.73f

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v25, 0x3f3ae148    # 0.73f

    .line 229
    .line 230
    .line 231
    const v26, 0x3f3ae148    # 0.73f

    .line 232
    .line 233
    .line 234
    const v21, 0x3ed1eb85    # 0.41f

    .line 235
    .line 236
    .line 237
    const/16 v22, 0x0

    .line 238
    .line 239
    const v23, 0x3f3ae148    # 0.73f

    .line 240
    .line 241
    .line 242
    const v24, 0x3ea3d70a    # 0.32f

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const/high16 v25, 0x41480000    # 12.5f

    .line 249
    .line 250
    const/high16 v26, 0x41600000    # 14.0f

    .line 251
    .line 252
    const v21, 0x4153ae14    # 13.23f

    .line 253
    .line 254
    .line 255
    const v22, 0x415ab852    # 13.67f

    .line 256
    .line 257
    .line 258
    const v23, 0x414eb852    # 12.92f

    .line 259
    .line 260
    .line 261
    const/high16 v24, 0x41600000    # 14.0f

    .line 262
    .line 263
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v4, 0x416428f6    # 14.26f

    .line 270
    .line 271
    .line 272
    const v6, 0x411ae148    # 9.68f

    .line 273
    .line 274
    .line 275
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v25, -0x40747ae1    # -1.09f

    .line 279
    .line 280
    .line 281
    const v26, 0x3fa28f5c    # 1.27f

    .line 282
    .line 283
    .line 284
    const v21, -0x411eb852    # -0.44f

    .line 285
    .line 286
    .line 287
    const v22, 0x3f266666    # 0.65f

    .line 288
    .line 289
    .line 290
    const v23, -0x40a3d70a    # -0.86f

    .line 291
    .line 292
    .line 293
    const v24, 0x3f59999a    # 0.85f

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v25, -0x41fae148    # -0.13f

    .line 300
    .line 301
    .line 302
    const v26, 0x3f51eb85    # 0.82f

    .line 303
    .line 304
    .line 305
    const v21, -0x4247ae14    # -0.09f

    .line 306
    .line 307
    .line 308
    const v22, 0x3e2e147b    # 0.17f

    .line 309
    .line 310
    .line 311
    const v23, -0x41fae148    # -0.13f

    .line 312
    .line 313
    .line 314
    const v24, 0x3e8f5c29    # 0.28f

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v4, -0x407851ec    # -1.06f

    .line 321
    .line 322
    .line 323
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v25, 0x3e3851ec    # 0.18f

    .line 327
    .line 328
    .line 329
    const v26, -0x406b851f    # -1.16f

    .line 330
    .line 331
    .line 332
    const/16 v21, 0x0

    .line 333
    .line 334
    const v22, -0x416b851f    # -0.29f

    .line 335
    .line 336
    .line 337
    const v23, -0x42dc28f6    # -0.04f

    .line 338
    .line 339
    .line 340
    const/high16 v24, -0x40c00000    # -0.75f

    .line 341
    .line 342
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const v25, 0x3f91eb85    # 1.14f

    .line 346
    .line 347
    .line 348
    const v26, -0x405eb852    # -1.26f

    .line 349
    .line 350
    .line 351
    const v21, 0x3e8f5c29    # 0.28f

    .line 352
    .line 353
    .line 354
    const v22, -0x40fd70a4    # -0.51f

    .line 355
    .line 356
    .line 357
    const v23, 0x3f547ae1    # 0.83f

    .line 358
    .line 359
    .line 360
    const v24, -0x40b0a3d7    # -0.81f

    .line 361
    .line 362
    .line 363
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const v25, -0x40b33333    # -0.8f

    .line 367
    .line 368
    .line 369
    const v26, -0x4051eb85    # -1.36f

    .line 370
    .line 371
    .line 372
    const v21, 0x3ea8f5c3    # 0.33f

    .line 373
    .line 374
    .line 375
    const v22, -0x410f5c29    # -0.47f

    .line 376
    .line 377
    .line 378
    const v23, 0x3e19999a    # 0.15f

    .line 379
    .line 380
    .line 381
    const v24, -0x4051eb85    # -1.36f

    .line 382
    .line 383
    .line 384
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v25, -0x4079999a    # -1.05f

    .line 388
    .line 389
    .line 390
    const v26, 0x3f5c28f6    # 0.86f

    .line 391
    .line 392
    .line 393
    const v21, -0x40e147ae    # -0.62f

    .line 394
    .line 395
    .line 396
    const/16 v22, 0x0

    .line 397
    .line 398
    const v23, -0x40947ae1    # -0.92f

    .line 399
    .line 400
    .line 401
    const v24, 0x3ef0a3d7    # 0.47f

    .line 402
    .line 403
    .line 404
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v4, -0x408a3d71    # -0.96f

    .line 408
    .line 409
    .line 410
    const v6, -0x41333333    # -0.4f

    .line 411
    .line 412
    .line 413
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const/high16 v25, 0x41480000    # 12.5f

    .line 417
    .line 418
    const/high16 v26, 0x40e00000    # 7.0f

    .line 419
    .line 420
    const v21, 0x412c28f6    # 10.76f

    .line 421
    .line 422
    .line 423
    const v22, 0x40f570a4    # 7.67f

    .line 424
    .line 425
    .line 426
    const v23, 0x41375c29    # 11.46f

    .line 427
    .line 428
    .line 429
    const/high16 v24, 0x40e00000    # 7.0f

    .line 430
    .line 431
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/high16 v25, 0x3fe00000    # 1.75f

    .line 435
    .line 436
    const v26, 0x3f6147ae    # 0.88f

    .line 437
    .line 438
    .line 439
    const v21, 0x3f5c28f6    # 0.86f

    .line 440
    .line 441
    .line 442
    const/16 v22, 0x0

    .line 443
    .line 444
    const v23, 0x3fb9999a    # 1.45f

    .line 445
    .line 446
    .line 447
    const v24, 0x3ec7ae14    # 0.39f

    .line 448
    .line 449
    .line 450
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v25, 0x416428f6    # 14.26f

    .line 454
    .line 455
    .line 456
    const v26, 0x411ae148    # 9.68f

    .line 457
    .line 458
    .line 459
    const v21, 0x416828f6    # 14.51f

    .line 460
    .line 461
    .line 462
    const v22, 0x4104f5c3    # 8.31f

    .line 463
    .line 464
    .line 465
    const v23, 0x416a8f5c    # 14.66f

    .line 466
    .line 467
    .line 468
    const v24, 0x4111999a    # 9.1f

    .line 469
    .line 470
    .line 471
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 478
    .line 479
    .line 480
    move-result-object v2

    .line 481
    const/16 v16, 0x3800

    .line 482
    .line 483
    const/16 v17, 0x0

    .line 484
    .line 485
    const v6, 0x3e99999a    # 0.3f

    .line 486
    .line 487
    .line 488
    const v8, 0x3e99999a    # 0.3f

    .line 489
    .line 490
    .line 491
    const/4 v7, 0x0

    .line 492
    const/high16 v9, 0x3f800000    # 1.0f

    .line 493
    .line 494
    const/high16 v12, 0x3f800000    # 1.0f

    .line 495
    .line 496
    const/4 v13, 0x0

    .line 497
    const/4 v14, 0x0

    .line 498
    const/4 v15, 0x0

    .line 499
    const-string v4, ""

    .line 500
    .line 501
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 502
    .line 503
    .line 504
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 505
    .line 506
    .line 507
    move-result v3

    .line 508
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 509
    .line 510
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 511
    .line 512
    .line 513
    move-result-wide v6

    .line 514
    const/4 v2, 0x0

    .line 515
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 516
    .line 517
    .line 518
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 519
    .line 520
    .line 521
    move-result v10

    .line 522
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 523
    .line 524
    .line 525
    move-result v11

    .line 526
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 529
    .line 530
    .line 531
    const v4, 0x419f851f    # 19.94f

    .line 532
    .line 533
    .line 534
    const v6, 0x4110f5c3    # 9.06f

    .line 535
    .line 536
    .line 537
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const/high16 v25, 0x41500000    # 13.0f

    .line 541
    .line 542
    const/high16 v26, 0x40400000    # 3.0f

    .line 543
    .line 544
    const/high16 v21, 0x419c0000    # 19.5f

    .line 545
    .line 546
    const v22, 0x40b75c29    # 5.73f

    .line 547
    .line 548
    .line 549
    const v23, 0x41848f5c    # 16.57f

    .line 550
    .line 551
    .line 552
    const/high16 v24, 0x40400000    # 3.0f

    .line 553
    .line 554
    move-object/from16 v20, v2

    .line 555
    .line 556
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const v25, 0x40c28f5c    # 6.08f

    .line 560
    .line 561
    .line 562
    const/high16 v26, 0x41100000    # 9.0f

    .line 563
    .line 564
    const v21, 0x4117851f    # 9.47f

    .line 565
    .line 566
    .line 567
    const/high16 v22, 0x40400000    # 3.0f

    .line 568
    .line 569
    const v23, 0x40d23d71    # 6.57f

    .line 570
    .line 571
    .line 572
    const v24, 0x40b3851f    # 5.61f

    .line 573
    .line 574
    .line 575
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const v4, -0x4008f5c3    # -1.93f

    .line 579
    .line 580
    .line 581
    const v6, 0x405eb852    # 3.48f

    .line 582
    .line 583
    .line 584
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const/high16 v25, 0x40a00000    # 5.0f

    .line 588
    .line 589
    const/high16 v26, 0x41600000    # 14.0f

    .line 590
    .line 591
    const v21, 0x406f5c29    # 3.74f

    .line 592
    .line 593
    .line 594
    const v22, 0x41523d71    # 13.14f

    .line 595
    .line 596
    .line 597
    const v23, 0x40870a3d    # 4.22f

    .line 598
    .line 599
    .line 600
    const/high16 v24, 0x41600000    # 14.0f

    .line 601
    .line 602
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const/high16 v4, 0x3f800000    # 1.0f

    .line 606
    .line 607
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const/high16 v4, 0x40000000    # 2.0f

    .line 611
    .line 612
    const/4 v6, 0x0

    .line 613
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const/high16 v25, 0x40000000    # 2.0f

    .line 617
    .line 618
    const/high16 v26, 0x40000000    # 2.0f

    .line 619
    .line 620
    const/16 v21, 0x0

    .line 621
    .line 622
    const v22, 0x3f8ccccd    # 1.1f

    .line 623
    .line 624
    .line 625
    const v23, 0x3f666666    # 0.9f

    .line 626
    .line 627
    .line 628
    const/high16 v24, 0x40000000    # 2.0f

    .line 629
    .line 630
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const/high16 v4, 0x3f800000    # 1.0f

    .line 634
    .line 635
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const/high16 v4, 0x40400000    # 3.0f

    .line 639
    .line 640
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const/high16 v4, 0x40e00000    # 7.0f

    .line 644
    .line 645
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    const v4, -0x3f6a3d71    # -4.68f

    .line 649
    .line 650
    .line 651
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    const v25, 0x419f851f    # 19.94f

    .line 655
    .line 656
    .line 657
    const v26, 0x4110f5c3    # 9.06f

    .line 658
    .line 659
    .line 660
    const v21, 0x4194f5c3    # 18.62f

    .line 661
    .line 662
    .line 663
    const v22, 0x41711eb8    # 15.07f

    .line 664
    .line 665
    .line 666
    const v23, 0x41a2cccd    # 20.35f

    .line 667
    .line 668
    .line 669
    const v24, 0x4143d70a    # 12.24f

    .line 670
    .line 671
    .line 672
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const v4, 0x416e3d71    # 14.89f

    .line 679
    .line 680
    .line 681
    const v6, 0x416a147b    # 14.63f

    .line 682
    .line 683
    .line 684
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    const v4, 0x4170cccd    # 15.05f

    .line 688
    .line 689
    .line 690
    const/high16 v6, 0x41600000    # 14.0f

    .line 691
    .line 692
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const/high16 v4, 0x41980000    # 19.0f

    .line 696
    .line 697
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 701
    .line 702
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 703
    .line 704
    .line 705
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 706
    .line 707
    .line 708
    const/high16 v4, 0x41000000    # 8.0f

    .line 709
    .line 710
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 711
    .line 712
    .line 713
    const/high16 v4, -0x3f800000    # -4.0f

    .line 714
    .line 715
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 716
    .line 717
    .line 718
    const v4, 0x40d66666    # 6.7f

    .line 719
    .line 720
    .line 721
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 722
    .line 723
    .line 724
    const v4, 0x3faa3d71    # 1.33f

    .line 725
    .line 726
    .line 727
    const v6, -0x3feae148    # -2.33f

    .line 728
    .line 729
    .line 730
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 731
    .line 732
    .line 733
    const/high16 v25, 0x41500000    # 13.0f

    .line 734
    .line 735
    const/high16 v26, 0x40a00000    # 5.0f

    .line 736
    .line 737
    const v21, 0x41035c29    # 8.21f

    .line 738
    .line 739
    .line 740
    const v22, 0x40e1eb85    # 7.06f

    .line 741
    .line 742
    .line 743
    const v23, 0x4125999a    # 10.35f

    .line 744
    .line 745
    .line 746
    const/high16 v24, 0x40a00000    # 5.0f

    .line 747
    .line 748
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 749
    .line 750
    .line 751
    const/high16 v25, 0x40a00000    # 5.0f

    .line 752
    .line 753
    const v21, 0x4030a3d7    # 2.76f

    .line 754
    .line 755
    .line 756
    const/16 v22, 0x0

    .line 757
    .line 758
    const/high16 v23, 0x40a00000    # 5.0f

    .line 759
    .line 760
    const v24, 0x400f5c29    # 2.24f

    .line 761
    .line 762
    .line 763
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 764
    .line 765
    .line 766
    const v25, 0x416e3d71    # 14.89f

    .line 767
    .line 768
    .line 769
    const v26, 0x416a147b    # 14.63f

    .line 770
    .line 771
    .line 772
    const/high16 v21, 0x41900000    # 18.0f

    .line 773
    .line 774
    const v22, 0x414170a4    # 12.09f

    .line 775
    .line 776
    .line 777
    const v23, 0x4185ae14    # 16.71f

    .line 778
    .line 779
    .line 780
    const v24, 0x415e147b    # 13.88f

    .line 781
    .line 782
    .line 783
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 784
    .line 785
    .line 786
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 787
    .line 788
    .line 789
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 790
    .line 791
    .line 792
    move-result-object v2

    .line 793
    const/high16 v6, 0x3f800000    # 1.0f

    .line 794
    .line 795
    const/high16 v8, 0x3f800000    # 1.0f

    .line 796
    .line 797
    const/4 v7, 0x0

    .line 798
    const-string v4, ""

    .line 799
    .line 800
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 801
    .line 802
    .line 803
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 804
    .line 805
    .line 806
    move-result v3

    .line 807
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 808
    .line 809
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 810
    .line 811
    .line 812
    move-result-wide v6

    .line 813
    const/4 v2, 0x0

    .line 814
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 815
    .line 816
    .line 817
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 818
    .line 819
    .line 820
    move-result v10

    .line 821
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 822
    .line 823
    .line 824
    move-result v11

    .line 825
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 826
    .line 827
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 828
    .line 829
    .line 830
    const v4, 0x4148a3d7    # 12.54f

    .line 831
    .line 832
    .line 833
    const/high16 v6, 0x41480000    # 12.5f

    .line 834
    .line 835
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 836
    .line 837
    .line 838
    const v25, -0x40c28f5c    # -0.74f

    .line 839
    .line 840
    .line 841
    const v26, 0x3f3ae148    # 0.73f

    .line 842
    .line 843
    .line 844
    const v21, -0x412e147b    # -0.41f

    .line 845
    .line 846
    .line 847
    const/16 v22, 0x0

    .line 848
    .line 849
    const v23, -0x40c28f5c    # -0.74f

    .line 850
    .line 851
    .line 852
    const v24, 0x3e9eb852    # 0.31f

    .line 853
    .line 854
    .line 855
    move-object/from16 v20, v2

    .line 856
    .line 857
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 858
    .line 859
    .line 860
    const v25, 0x3f3d70a4    # 0.74f

    .line 861
    .line 862
    .line 863
    const v26, 0x3f3d70a4    # 0.74f

    .line 864
    .line 865
    .line 866
    const/16 v21, 0x0

    .line 867
    .line 868
    const v22, 0x3ed1eb85    # 0.41f

    .line 869
    .line 870
    .line 871
    const v23, 0x3ea8f5c3    # 0.33f

    .line 872
    .line 873
    .line 874
    const v24, 0x3f3d70a4    # 0.74f

    .line 875
    .line 876
    .line 877
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 878
    .line 879
    .line 880
    const v25, 0x3f3ae148    # 0.73f

    .line 881
    .line 882
    .line 883
    const v26, -0x40c28f5c    # -0.74f

    .line 884
    .line 885
    .line 886
    const v21, 0x3ed70a3d    # 0.42f

    .line 887
    .line 888
    .line 889
    const/16 v22, 0x0

    .line 890
    .line 891
    const v23, 0x3f3ae148    # 0.73f

    .line 892
    .line 893
    .line 894
    const v24, -0x41570a3d    # -0.33f

    .line 895
    .line 896
    .line 897
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 898
    .line 899
    .line 900
    const/high16 v25, 0x41480000    # 12.5f

    .line 901
    .line 902
    const v26, 0x4148a3d7    # 12.54f

    .line 903
    .line 904
    .line 905
    const v21, 0x4153ae14    # 13.23f

    .line 906
    .line 907
    .line 908
    const v22, 0x414d999a    # 12.85f

    .line 909
    .line 910
    .line 911
    const v23, 0x414eb852    # 12.92f

    .line 912
    .line 913
    .line 914
    const v24, 0x4148a3d7    # 12.54f

    .line 915
    .line 916
    .line 917
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 918
    .line 919
    .line 920
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 921
    .line 922
    .line 923
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 924
    .line 925
    .line 926
    move-result-object v2

    .line 927
    const/high16 v6, 0x3f800000    # 1.0f

    .line 928
    .line 929
    const/4 v7, 0x0

    .line 930
    const-string v4, ""

    .line 931
    .line 932
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 933
    .line 934
    .line 935
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 936
    .line 937
    .line 938
    move-result v3

    .line 939
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 940
    .line 941
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 942
    .line 943
    .line 944
    move-result-wide v6

    .line 945
    const/4 v0, 0x0

    .line 946
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 947
    .line 948
    .line 949
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 950
    .line 951
    .line 952
    move-result v10

    .line 953
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 954
    .line 955
    .line 956
    move-result v11

    .line 957
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 958
    .line 959
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 960
    .line 961
    .line 962
    const/high16 v0, 0x40e00000    # 7.0f

    .line 963
    .line 964
    const/high16 v2, 0x41480000    # 12.5f

    .line 965
    .line 966
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 967
    .line 968
    .line 969
    const/high16 v17, -0x40000000    # -2.0f

    .line 970
    .line 971
    const v18, 0x3fb9999a    # 1.45f

    .line 972
    .line 973
    .line 974
    const v13, -0x407c28f6    # -1.03f

    .line 975
    .line 976
    .line 977
    const v15, -0x402147ae    # -1.74f

    .line 978
    .line 979
    .line 980
    const v16, 0x3f2b851f    # 0.67f

    .line 981
    .line 982
    .line 983
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 984
    .line 985
    .line 986
    const v0, 0x3f75c28f    # 0.96f

    .line 987
    .line 988
    .line 989
    const v2, 0x3ecccccd    # 0.4f

    .line 990
    .line 991
    .line 992
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 993
    .line 994
    .line 995
    const v17, 0x3f866666    # 1.05f

    .line 996
    .line 997
    .line 998
    const v18, -0x40a3d70a    # -0.86f

    .line 999
    .line 1000
    .line 1001
    const v13, 0x3e051eb8    # 0.13f

    .line 1002
    .line 1003
    .line 1004
    const v14, -0x413851ec    # -0.39f

    .line 1005
    .line 1006
    .line 1007
    const v15, 0x3edc28f6    # 0.43f

    .line 1008
    .line 1009
    .line 1010
    const v16, -0x40a3d70a    # -0.86f

    .line 1011
    .line 1012
    .line 1013
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1014
    .line 1015
    .line 1016
    const v17, 0x3f4ccccd    # 0.8f

    .line 1017
    .line 1018
    .line 1019
    const v18, 0x3fae147b    # 1.36f

    .line 1020
    .line 1021
    .line 1022
    const v13, 0x3f733333    # 0.95f

    .line 1023
    .line 1024
    .line 1025
    const/4 v14, 0x0

    .line 1026
    const v15, 0x3f90a3d7    # 1.13f

    .line 1027
    .line 1028
    .line 1029
    const v16, 0x3f63d70a    # 0.89f

    .line 1030
    .line 1031
    .line 1032
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1033
    .line 1034
    .line 1035
    const v17, -0x406e147b    # -1.14f

    .line 1036
    .line 1037
    .line 1038
    const v18, 0x3fa147ae    # 1.26f

    .line 1039
    .line 1040
    .line 1041
    const v13, -0x415c28f6    # -0.32f

    .line 1042
    .line 1043
    .line 1044
    const v14, 0x3ee66666    # 0.45f

    .line 1045
    .line 1046
    .line 1047
    const v15, -0x40a3d70a    # -0.86f

    .line 1048
    .line 1049
    .line 1050
    const/high16 v16, 0x3f400000    # 0.75f

    .line 1051
    .line 1052
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1053
    .line 1054
    .line 1055
    const v17, -0x41c7ae14    # -0.18f

    .line 1056
    .line 1057
    .line 1058
    const v18, 0x3f947ae1    # 1.16f

    .line 1059
    .line 1060
    .line 1061
    const v13, -0x41947ae1    # -0.23f

    .line 1062
    .line 1063
    .line 1064
    const v14, 0x3ecccccd    # 0.4f

    .line 1065
    .line 1066
    .line 1067
    const v15, -0x41c7ae14    # -0.18f

    .line 1068
    .line 1069
    .line 1070
    const v16, 0x3f5eb852    # 0.87f

    .line 1071
    .line 1072
    .line 1073
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1074
    .line 1075
    .line 1076
    const v0, 0x3f87ae14    # 1.06f

    .line 1077
    .line 1078
    .line 1079
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1080
    .line 1081
    .line 1082
    const v17, 0x3e051eb8    # 0.13f

    .line 1083
    .line 1084
    .line 1085
    const v18, -0x40ae147b    # -0.82f

    .line 1086
    .line 1087
    .line 1088
    const/4 v13, 0x0

    .line 1089
    const v14, -0x40f33333    # -0.55f

    .line 1090
    .line 1091
    .line 1092
    const v15, 0x3d23d70a    # 0.04f

    .line 1093
    .line 1094
    .line 1095
    const v16, -0x40d9999a    # -0.65f

    .line 1096
    .line 1097
    .line 1098
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1099
    .line 1100
    .line 1101
    const v17, 0x3f8b851f    # 1.09f

    .line 1102
    .line 1103
    .line 1104
    const v18, -0x405d70a4    # -1.27f

    .line 1105
    .line 1106
    .line 1107
    const v13, 0x3e6b851f    # 0.23f

    .line 1108
    .line 1109
    .line 1110
    const v14, -0x4128f5c3    # -0.42f

    .line 1111
    .line 1112
    .line 1113
    const v15, 0x3f266666    # 0.65f

    .line 1114
    .line 1115
    .line 1116
    const v16, -0x40e147ae    # -0.62f

    .line 1117
    .line 1118
    .line 1119
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1120
    .line 1121
    .line 1122
    const v17, -0x43dc28f6    # -0.01f

    .line 1123
    .line 1124
    .line 1125
    const v18, -0x4019999a    # -1.8f

    .line 1126
    .line 1127
    .line 1128
    const v13, 0x3ecccccd    # 0.4f

    .line 1129
    .line 1130
    .line 1131
    const v14, -0x40e8f5c3    # -0.59f

    .line 1132
    .line 1133
    .line 1134
    const/high16 v15, 0x3e800000    # 0.25f

    .line 1135
    .line 1136
    const v16, -0x404f5c29    # -1.38f

    .line 1137
    .line 1138
    .line 1139
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1140
    .line 1141
    .line 1142
    const/high16 v17, 0x41480000    # 12.5f

    .line 1143
    .line 1144
    const/high16 v18, 0x40e00000    # 7.0f

    .line 1145
    .line 1146
    const v13, 0x415f3333    # 13.95f

    .line 1147
    .line 1148
    .line 1149
    const v14, 0x40ec7ae1    # 7.39f

    .line 1150
    .line 1151
    .line 1152
    const v15, 0x4155c28f    # 13.36f

    .line 1153
    .line 1154
    .line 1155
    const/high16 v16, 0x40e00000    # 7.0f

    .line 1156
    .line 1157
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1158
    .line 1159
    .line 1160
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1161
    .line 1162
    .line 1163
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v2

    .line 1167
    const/16 v16, 0x3800

    .line 1168
    .line 1169
    const/16 v17, 0x0

    .line 1170
    .line 1171
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1172
    .line 1173
    const/4 v7, 0x0

    .line 1174
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1175
    .line 1176
    const/4 v13, 0x0

    .line 1177
    const/4 v14, 0x0

    .line 1178
    const/4 v15, 0x0

    .line 1179
    const-string v4, ""

    .line 1180
    .line 1181
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v0

    .line 1185
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1186
    .line 1187
    .line 1188
    move-result-object v0

    .line 1189
    sput-object v0, Landroidx/compose/material/icons/twotone/PsychologyAltKt;->_psychologyAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1190
    .line 1191
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1192
    .line 1193
    .line 1194
    return-object v0
.end method
