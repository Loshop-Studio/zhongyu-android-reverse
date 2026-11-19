.class public final Landroidx/compose/material/icons/sharp/HearingDisabledKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_hearingDisabled",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "HearingDisabled",
        "Landroidx/compose/material/icons/Icons$Sharp;",
        "getHearingDisabled",
        "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nHearingDisabled.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HearingDisabled.kt\nandroidx/compose/material/icons/sharp/HearingDisabledKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,83:1\n212#2,12:84\n233#2,18:97\n253#2:134\n174#3:96\n705#4,2:115\n717#4,2:117\n719#4,11:123\n72#5,4:119\n*S KotlinDebug\n*F\n+ 1 HearingDisabled.kt\nandroidx/compose/material/icons/sharp/HearingDisabledKt\n*L\n29#1:84,12\n30#1:97,18\n30#1:134\n29#1:96\n30#1:115,2\n30#1:117,2\n30#1:123,11\n30#1:119,4\n*E\n"
    }
.end annotation


# static fields
.field private static _hearingDisabled:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHearingDisabled(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/HearingDisabledKt;->_hearingDisabled:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.HearingDisabled"

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
    const v0, 0x404ccccd    # 3.2f

    .line 71
    .line 72
    .line 73
    const v2, 0x40c0f5c3    # 6.03f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v17, 0x41200000    # 10.0f

    .line 80
    .line 81
    const/high16 v18, 0x40000000    # 2.0f

    .line 82
    .line 83
    const v13, 0x40e4cccd    # 7.15f

    .line 84
    .line 85
    .line 86
    const v14, 0x401c28f6    # 2.44f

    .line 87
    .line 88
    .line 89
    const v15, 0x410828f6    # 8.51f

    .line 90
    .line 91
    .line 92
    const/high16 v16, 0x40000000    # 2.0f

    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v17, 0x40e00000    # 7.0f

    .line 98
    .line 99
    const/high16 v18, 0x40e00000    # 7.0f

    .line 100
    .line 101
    const v13, 0x407b851f    # 3.93f

    .line 102
    .line 103
    .line 104
    const/4 v14, 0x0

    .line 105
    const/high16 v15, 0x40e00000    # 7.0f

    .line 106
    .line 107
    const v16, 0x40447ae1    # 3.07f

    .line 108
    .line 109
    .line 110
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const v17, -0x40770a3d    # -1.07f

    .line 114
    .line 115
    .line 116
    const v18, 0x4079999a    # 3.9f

    .line 117
    .line 118
    .line 119
    const/4 v13, 0x0

    .line 120
    const v14, 0x3fa147ae    # 1.26f

    .line 121
    .line 122
    .line 123
    const v15, -0x413d70a4    # -0.38f

    .line 124
    .line 125
    .line 126
    const v16, 0x4029999a    # 2.65f

    .line 127
    .line 128
    .line 129
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v17, -0x425c28f6    # -0.08f

    .line 133
    .line 134
    .line 135
    const v18, 0x3e051eb8    # 0.13f

    .line 136
    .line 137
    .line 138
    const v13, -0x435c28f6    # -0.02f

    .line 139
    .line 140
    .line 141
    const v14, 0x3d23d70a    # 0.04f

    .line 142
    .line 143
    .line 144
    const v15, -0x42b33333    # -0.05f

    .line 145
    .line 146
    .line 147
    const v16, 0x3da3d70a    # 0.08f

    .line 148
    .line 149
    .line 150
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v0, -0x40428f5c    # -1.48f

    .line 154
    .line 155
    .line 156
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v17, 0x41700000    # 15.0f

    .line 160
    .line 161
    const/high16 v18, 0x41100000    # 9.0f

    .line 162
    .line 163
    const v13, 0x416c51ec    # 14.77f

    .line 164
    .line 165
    .line 166
    const v14, 0x412b0a3d    # 10.69f

    .line 167
    .line 168
    .line 169
    const/high16 v15, 0x41700000    # 15.0f

    .line 170
    .line 171
    const v16, 0x411ccccd    # 9.8f

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v17, -0x3f600000    # -5.0f

    .line 178
    .line 179
    const/high16 v18, -0x3f600000    # -5.0f

    .line 180
    .line 181
    const/4 v13, 0x0

    .line 182
    const v14, -0x3fcccccd    # -2.8f

    .line 183
    .line 184
    .line 185
    const v15, -0x3ff33333    # -2.2f

    .line 186
    .line 187
    .line 188
    const/high16 v16, -0x3f600000    # -5.0f

    .line 189
    .line 190
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v17, 0x40f00000    # 7.5f

    .line 194
    .line 195
    const v18, 0x409570a4    # 4.67f

    .line 196
    .line 197
    .line 198
    const v13, 0x411147ae    # 9.08f

    .line 199
    .line 200
    .line 201
    const/high16 v14, 0x40800000    # 4.0f

    .line 202
    .line 203
    const v15, 0x4103d70a    # 8.24f

    .line 204
    .line 205
    .line 206
    const v16, 0x408851ec    # 4.26f

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v0, 0x404ccccd    # 3.2f

    .line 213
    .line 214
    .line 215
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v0, 0x4189ae14    # 17.21f

    .line 222
    .line 223
    .line 224
    const v2, 0x4166147b    # 14.38f

    .line 225
    .line 226
    .line 227
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v0, 0x3fb70a3d    # 1.43f

    .line 231
    .line 232
    .line 233
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v17, 0x41a80000    # 21.0f

    .line 237
    .line 238
    const/high16 v18, 0x41100000    # 9.0f

    .line 239
    .line 240
    const v13, 0x41a0e148    # 20.11f

    .line 241
    .line 242
    .line 243
    const v14, 0x415ee148    # 13.93f

    .line 244
    .line 245
    .line 246
    const/high16 v15, 0x41a80000    # 21.0f

    .line 247
    .line 248
    const v16, 0x41391eb8    # 11.57f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v17, -0x3fb1eb85    # -3.22f

    .line 255
    .line 256
    .line 257
    const v18, -0x3f070a3d    # -7.78f

    .line 258
    .line 259
    .line 260
    const/4 v13, 0x0

    .line 261
    const v14, -0x3fbd70a4    # -3.04f

    .line 262
    .line 263
    .line 264
    const v15, -0x40628f5c    # -1.23f

    .line 265
    .line 266
    .line 267
    const v16, -0x3f46b852    # -5.79f

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v0, -0x404a3d71    # -1.42f

    .line 274
    .line 275
    .line 276
    const v2, 0x3fb5c28f    # 1.42f

    .line 277
    .line 278
    .line 279
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v17, 0x41980000    # 19.0f

    .line 283
    .line 284
    const/high16 v18, 0x41100000    # 9.0f

    .line 285
    .line 286
    const v13, 0x418feb85    # 17.99f

    .line 287
    .line 288
    .line 289
    const v14, 0x408851ec    # 4.26f

    .line 290
    .line 291
    .line 292
    const/high16 v15, 0x41980000    # 19.0f

    .line 293
    .line 294
    const v16, 0x40d051ec    # 6.51f

    .line 295
    .line 296
    .line 297
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v17, 0x4189ae14    # 17.21f

    .line 301
    .line 302
    .line 303
    const v18, 0x4166147b    # 14.38f

    .line 304
    .line 305
    .line 306
    const/high16 v13, 0x41980000    # 19.0f

    .line 307
    .line 308
    const v14, 0x413051ec    # 11.02f

    .line 309
    .line 310
    .line 311
    const v15, 0x4192a3d7    # 18.33f

    .line 312
    .line 313
    .line 314
    const v16, 0x414e147b    # 12.88f

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const/high16 v0, 0x41200000    # 10.0f

    .line 324
    .line 325
    const/high16 v2, 0x40d00000    # 6.5f

    .line 326
    .line 327
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v17, -0x40e8f5c3    # -0.59f

    .line 331
    .line 332
    .line 333
    const v18, 0x3da3d70a    # 0.08f

    .line 334
    .line 335
    .line 336
    const v13, -0x41a8f5c3    # -0.21f

    .line 337
    .line 338
    .line 339
    const/4 v14, 0x0

    .line 340
    const v15, -0x41333333    # -0.4f

    .line 341
    .line 342
    .line 343
    const v16, 0x3cf5c28f    # 0.03f

    .line 344
    .line 345
    .line 346
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v0, 0x4040a3d7    # 3.01f

    .line 350
    .line 351
    .line 352
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/high16 v17, 0x41480000    # 12.5f

    .line 356
    .line 357
    const/high16 v18, 0x41100000    # 9.0f

    .line 358
    .line 359
    const v13, 0x4147851f    # 12.47f

    .line 360
    .line 361
    .line 362
    const v14, 0x41166666    # 9.4f

    .line 363
    .line 364
    .line 365
    const/high16 v15, 0x41480000    # 12.5f

    .line 366
    .line 367
    const v16, 0x41135c29    # 9.21f

    .line 368
    .line 369
    .line 370
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const/high16 v17, 0x41200000    # 10.0f

    .line 374
    .line 375
    const/high16 v18, 0x40d00000    # 6.5f

    .line 376
    .line 377
    const/high16 v13, 0x41480000    # 12.5f

    .line 378
    .line 379
    const v14, 0x40f3d70a    # 7.62f

    .line 380
    .line 381
    .line 382
    const v15, 0x4136147b    # 11.38f

    .line 383
    .line 384
    .line 385
    const/high16 v16, 0x40d00000    # 6.5f

    .line 386
    .line 387
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v0, 0x41a9851f    # 21.19f

    .line 394
    .line 395
    .line 396
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const v0, 0x4033d70a    # 2.81f

    .line 400
    .line 401
    .line 402
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v0, 0x3fb1eb85    # 1.39f

    .line 406
    .line 407
    .line 408
    const v2, 0x40870a3d    # 4.22f

    .line 409
    .line 410
    .line 411
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v0, 0x400851ec    # 2.13f

    .line 415
    .line 416
    .line 417
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v17, 0x40400000    # 3.0f

    .line 421
    .line 422
    const/high16 v18, 0x41100000    # 9.0f

    .line 423
    .line 424
    const v13, 0x404c28f6    # 3.19f

    .line 425
    .line 426
    .line 427
    const v14, 0x40e51eb8    # 7.16f

    .line 428
    .line 429
    .line 430
    const/high16 v15, 0x40400000    # 3.0f

    .line 431
    .line 432
    const v16, 0x4100cccd    # 8.05f

    .line 433
    .line 434
    .line 435
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const/high16 v0, 0x40000000    # 2.0f

    .line 439
    .line 440
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v17, 0x3df5c28f    # 0.12f

    .line 444
    .line 445
    .line 446
    const v18, -0x4079999a    # -1.05f

    .line 447
    .line 448
    .line 449
    const/4 v13, 0x0

    .line 450
    const v14, -0x4147ae14    # -0.36f

    .line 451
    .line 452
    .line 453
    const v15, 0x3d4ccccd    # 0.05f

    .line 454
    .line 455
    .line 456
    const v16, -0x40ca3d71    # -0.71f

    .line 457
    .line 458
    .line 459
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const v0, 0x40d3851f    # 6.61f

    .line 463
    .line 464
    .line 465
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const v17, -0x3feeb852    # -2.27f

    .line 469
    .line 470
    .line 471
    const v18, 0x4039999a    # 2.9f

    .line 472
    .line 473
    .line 474
    const v13, -0x409eb852    # -0.88f

    .line 475
    .line 476
    .line 477
    const v14, 0x3f2e147b    # 0.68f

    .line 478
    .line 479
    .line 480
    const v15, -0x401c28f6    # -1.78f

    .line 481
    .line 482
    .line 483
    const v16, 0x3fb47ae1    # 1.41f

    .line 484
    .line 485
    .line 486
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const v17, -0x40251eb8    # -1.71f

    .line 490
    .line 491
    .line 492
    const v18, 0x401851ec    # 2.38f

    .line 493
    .line 494
    .line 495
    const/high16 v13, -0x41000000    # -0.5f

    .line 496
    .line 497
    const/high16 v14, 0x3fc00000    # 1.5f

    .line 498
    .line 499
    const/high16 v15, -0x40800000    # -1.0f

    .line 500
    .line 501
    const v16, 0x4000a3d7    # 2.01f

    .line 502
    .line 503
    .line 504
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const/high16 v17, 0x40e00000    # 7.0f

    .line 508
    .line 509
    const/high16 v18, 0x41a00000    # 20.0f

    .line 510
    .line 511
    const v13, 0x40f1eb85    # 7.56f

    .line 512
    .line 513
    .line 514
    const v14, 0x419f851f    # 19.94f

    .line 515
    .line 516
    .line 517
    const v15, 0x40e947ae    # 7.29f

    .line 518
    .line 519
    .line 520
    const/high16 v16, 0x41a00000    # 20.0f

    .line 521
    .line 522
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const/high16 v17, -0x40000000    # -2.0f

    .line 526
    .line 527
    const/high16 v18, -0x40000000    # -2.0f

    .line 528
    .line 529
    const v13, -0x40733333    # -1.1f

    .line 530
    .line 531
    .line 532
    const/4 v14, 0x0

    .line 533
    const/high16 v15, -0x40000000    # -2.0f

    .line 534
    .line 535
    const v16, -0x4099999a    # -0.9f

    .line 536
    .line 537
    .line 538
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const/high16 v0, 0x40400000    # 3.0f

    .line 542
    .line 543
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const/high16 v17, 0x40800000    # 4.0f

    .line 547
    .line 548
    const/high16 v18, 0x40800000    # 4.0f

    .line 549
    .line 550
    const/4 v13, 0x0

    .line 551
    const v14, 0x400d70a4    # 2.21f

    .line 552
    .line 553
    .line 554
    const v15, 0x3fe51eb8    # 1.79f

    .line 555
    .line 556
    .line 557
    const/high16 v16, 0x40800000    # 4.0f

    .line 558
    .line 559
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const v17, 0x3fd1eb85    # 1.64f

    .line 563
    .line 564
    .line 565
    const v18, -0x414ccccd    # -0.35f

    .line 566
    .line 567
    .line 568
    const v13, 0x3f11eb85    # 0.57f

    .line 569
    .line 570
    .line 571
    const/4 v14, 0x0

    .line 572
    const v15, 0x3f90a3d7    # 1.13f

    .line 573
    .line 574
    .line 575
    const v16, -0x420a3d71    # -0.12f

    .line 576
    .line 577
    .line 578
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const v17, 0x402eb852    # 2.73f

    .line 582
    .line 583
    .line 584
    const v18, -0x3f9ccccd    # -3.55f

    .line 585
    .line 586
    .line 587
    const v13, 0x3fae147b    # 1.36f

    .line 588
    .line 589
    .line 590
    const v14, -0x40ca3d71    # -0.71f

    .line 591
    .line 592
    .line 593
    const v15, 0x400851ec    # 2.13f

    .line 594
    .line 595
    .line 596
    const v16, -0x40228f5c    # -1.73f

    .line 597
    .line 598
    .line 599
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const v17, 0x3fdae148    # 1.71f

    .line 603
    .line 604
    .line 605
    const v18, -0x3ffccccd    # -2.05f

    .line 606
    .line 607
    .line 608
    const v13, 0x3ea3d70a    # 0.32f

    .line 609
    .line 610
    .line 611
    const v14, -0x40851eb8    # -0.98f

    .line 612
    .line 613
    .line 614
    const v15, 0x3f666666    # 0.9f

    .line 615
    .line 616
    .line 617
    const v16, -0x4048f5c3    # -1.43f

    .line 618
    .line 619
    .line 620
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const v17, 0x3da3d70a    # 0.08f

    .line 624
    .line 625
    .line 626
    const v18, -0x428a3d71    # -0.06f

    .line 627
    .line 628
    .line 629
    const v13, 0x3cf5c28f    # 0.03f

    .line 630
    .line 631
    .line 632
    const v14, -0x435c28f6    # -0.02f

    .line 633
    .line 634
    .line 635
    const v15, 0x3d4ccccd    # 0.05f

    .line 636
    .line 637
    .line 638
    const v16, -0x42dc28f6    # -0.04f

    .line 639
    .line 640
    .line 641
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const v0, 0x40d3d70a    # 6.62f

    .line 645
    .line 646
    .line 647
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const v0, 0x41a9851f    # 21.19f

    .line 651
    .line 652
    .line 653
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 660
    .line 661
    .line 662
    move-result-object v2

    .line 663
    const/16 v16, 0x3800

    .line 664
    .line 665
    const/16 v17, 0x0

    .line 666
    .line 667
    const/high16 v6, 0x3f800000    # 1.0f

    .line 668
    .line 669
    const/high16 v8, 0x3f800000    # 1.0f

    .line 670
    .line 671
    const/4 v7, 0x0

    .line 672
    const/high16 v9, 0x3f800000    # 1.0f

    .line 673
    .line 674
    const/high16 v12, 0x3f800000    # 1.0f

    .line 675
    .line 676
    const/4 v13, 0x0

    .line 677
    const/4 v14, 0x0

    .line 678
    const/4 v15, 0x0

    .line 679
    const-string v4, ""

    .line 680
    .line 681
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 682
    .line 683
    .line 684
    move-result-object v0

    .line 685
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 686
    .line 687
    .line 688
    move-result-object v0

    .line 689
    sput-object v0, Landroidx/compose/material/icons/sharp/HearingDisabledKt;->_hearingDisabled:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 690
    .line 691
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 692
    .line 693
    .line 694
    return-object v0
.end method
