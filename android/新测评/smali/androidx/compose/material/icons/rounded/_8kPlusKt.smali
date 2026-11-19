.class public final Landroidx/compose/material/icons/rounded/_8kPlusKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "__8kPlus",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "_8kPlus",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "get_8kPlus",
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
        "SMAP\n_8kPlus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _8kPlus.kt\nandroidx/compose/material/icons/rounded/_8kPlusKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,104:1\n212#2,12:105\n233#2,18:118\n253#2:155\n233#2,18:156\n253#2:193\n233#2,18:194\n253#2:231\n174#3:117\n705#4,2:136\n717#4,2:138\n719#4,11:144\n705#4,2:174\n717#4,2:176\n719#4,11:182\n705#4,2:212\n717#4,2:214\n719#4,11:220\n72#5,4:140\n72#5,4:178\n72#5,4:216\n*S KotlinDebug\n*F\n+ 1 _8kPlus.kt\nandroidx/compose/material/icons/rounded/_8kPlusKt\n*L\n29#1:105,12\n30#1:118,18\n30#1:155\n85#1:156,18\n85#1:193\n92#1:194,18\n92#1:231\n29#1:117\n30#1:136,2\n30#1:138,2\n30#1:144,11\n85#1:174,2\n85#1:176,2\n85#1:182,11\n92#1:212,2\n92#1:214,2\n92#1:220,11\n30#1:140,4\n85#1:178,4\n92#1:216,4\n*E\n"
    }
.end annotation


# static fields
.field private static __8kPlus:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final get_8kPlus(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/_8kPlusKt;->__8kPlus:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded._8kPlus"

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
    const/high16 v4, 0x40400000    # 3.0f

    .line 71
    .line 72
    const/high16 v6, 0x41980000    # 19.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40a00000    # 5.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v25, 0x40400000    # 3.0f

    .line 83
    .line 84
    const/high16 v26, 0x40a00000    # 5.0f

    .line 85
    .line 86
    const v21, 0x4079999a    # 3.9f

    .line 87
    .line 88
    .line 89
    const/high16 v22, 0x40400000    # 3.0f

    .line 90
    .line 91
    const/high16 v23, 0x40400000    # 3.0f

    .line 92
    .line 93
    const v24, 0x4079999a    # 3.9f

    .line 94
    .line 95
    .line 96
    move-object/from16 v20, v2

    .line 97
    .line 98
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v4, 0x41600000    # 14.0f

    .line 102
    .line 103
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v25, 0x40000000    # 2.0f

    .line 107
    .line 108
    const/high16 v26, 0x40000000    # 2.0f

    .line 109
    .line 110
    const/16 v21, 0x0

    .line 111
    .line 112
    const v22, 0x3f8ccccd    # 1.1f

    .line 113
    .line 114
    .line 115
    const v23, 0x3f666666    # 0.9f

    .line 116
    .line 117
    .line 118
    const/high16 v24, 0x40000000    # 2.0f

    .line 119
    .line 120
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v26, -0x40000000    # -2.0f

    .line 127
    .line 128
    const v21, 0x3f8ccccd    # 1.1f

    .line 129
    .line 130
    .line 131
    const/16 v22, 0x0

    .line 132
    .line 133
    const/high16 v23, 0x40000000    # 2.0f

    .line 134
    .line 135
    const v24, -0x4099999a    # -0.9f

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v4, 0x40a00000    # 5.0f

    .line 142
    .line 143
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v25, 0x41980000    # 19.0f

    .line 147
    .line 148
    const/high16 v26, 0x40400000    # 3.0f

    .line 149
    .line 150
    const/high16 v21, 0x41a80000    # 21.0f

    .line 151
    .line 152
    const v22, 0x4079999a    # 3.9f

    .line 153
    .line 154
    .line 155
    const v23, 0x41a0cccd    # 20.1f

    .line 156
    .line 157
    .line 158
    const/high16 v24, 0x40400000    # 3.0f

    .line 159
    .line 160
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v4, 0x41200000    # 10.0f

    .line 167
    .line 168
    const/high16 v6, 0x41600000    # 14.0f

    .line 169
    .line 170
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v25, -0x40800000    # -1.0f

    .line 174
    .line 175
    const/high16 v26, 0x3f800000    # 1.0f

    .line 176
    .line 177
    const/16 v21, 0x0

    .line 178
    .line 179
    const v22, 0x3f0ccccd    # 0.55f

    .line 180
    .line 181
    .line 182
    const v23, -0x4119999a    # -0.45f

    .line 183
    .line 184
    .line 185
    const/high16 v24, 0x3f800000    # 1.0f

    .line 186
    .line 187
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v4, 0x40e00000    # 7.0f

    .line 191
    .line 192
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v26, -0x40800000    # -1.0f

    .line 196
    .line 197
    const v21, -0x40f33333    # -0.55f

    .line 198
    .line 199
    .line 200
    const/16 v22, 0x0

    .line 201
    .line 202
    const/high16 v23, -0x40800000    # -1.0f

    .line 203
    .line 204
    const v24, -0x4119999a    # -0.45f

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v4, -0x3f800000    # -4.0f

    .line 211
    .line 212
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v25, 0x3f800000    # 1.0f

    .line 216
    .line 217
    const/16 v21, 0x0

    .line 218
    .line 219
    const v22, -0x40f33333    # -0.55f

    .line 220
    .line 221
    .line 222
    const v23, 0x3ee66666    # 0.45f

    .line 223
    .line 224
    .line 225
    const/high16 v24, -0x40800000    # -1.0f

    .line 226
    .line 227
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v4, 0x40000000    # 2.0f

    .line 231
    .line 232
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v26, 0x3f800000    # 1.0f

    .line 236
    .line 237
    const v21, 0x3f0ccccd    # 0.55f

    .line 238
    .line 239
    .line 240
    const/16 v22, 0x0

    .line 241
    .line 242
    const/high16 v23, 0x3f800000    # 1.0f

    .line 243
    .line 244
    const v24, 0x3ee66666    # 0.45f

    .line 245
    .line 246
    .line 247
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v4, 0x41600000    # 14.0f

    .line 251
    .line 252
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const v4, 0x416970a4    # 14.59f

    .line 259
    .line 260
    .line 261
    const/high16 v6, 0x41700000    # 15.0f

    .line 262
    .line 263
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v25, -0x40f33333    # -0.55f

    .line 267
    .line 268
    .line 269
    const v26, -0x4175c28f    # -0.27f

    .line 270
    .line 271
    .line 272
    const v21, -0x419eb852    # -0.22f

    .line 273
    .line 274
    .line 275
    const v23, -0x4128f5c3    # -0.42f

    .line 276
    .line 277
    .line 278
    const v24, -0x42333333    # -0.1f

    .line 279
    .line 280
    .line 281
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v4, -0x403ae148    # -1.54f

    .line 285
    .line 286
    .line 287
    const v6, -0x40028f5c    # -1.98f

    .line 288
    .line 289
    .line 290
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v4, 0x3fc66666    # 1.55f

    .line 294
    .line 295
    .line 296
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v25, -0x40cccccd    # -0.7f

    .line 300
    .line 301
    .line 302
    const v26, 0x3f333333    # 0.7f

    .line 303
    .line 304
    .line 305
    const/16 v21, 0x0

    .line 306
    .line 307
    const v22, 0x3ec7ae14    # 0.39f

    .line 308
    .line 309
    .line 310
    const v23, -0x416147ae    # -0.31f

    .line 311
    .line 312
    .line 313
    const v24, 0x3f333333    # 0.7f

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v4, 0x413b3333    # 11.7f

    .line 320
    .line 321
    .line 322
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const v26, -0x40cccccd    # -0.7f

    .line 326
    .line 327
    .line 328
    const v21, -0x413851ec    # -0.39f

    .line 329
    .line 330
    .line 331
    const/16 v22, 0x0

    .line 332
    .line 333
    const v23, -0x40cccccd    # -0.7f

    .line 334
    .line 335
    .line 336
    const v24, -0x416147ae    # -0.31f

    .line 337
    .line 338
    .line 339
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v4, 0x411b3333    # 9.7f

    .line 343
    .line 344
    .line 345
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v25, 0x413b3333    # 11.7f

    .line 349
    .line 350
    .line 351
    const/high16 v26, 0x41100000    # 9.0f

    .line 352
    .line 353
    const/high16 v21, 0x41300000    # 11.0f

    .line 354
    .line 355
    const v22, 0x4114f5c3    # 9.31f

    .line 356
    .line 357
    .line 358
    const v23, 0x4134f5c3    # 11.31f

    .line 359
    .line 360
    .line 361
    const/high16 v24, 0x41100000    # 9.0f

    .line 362
    .line 363
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const v4, 0x3db851ec    # 0.09f

    .line 367
    .line 368
    .line 369
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v25, 0x3f333333    # 0.7f

    .line 373
    .line 374
    .line 375
    const v26, 0x3f333333    # 0.7f

    .line 376
    .line 377
    .line 378
    const v21, 0x3ec7ae14    # 0.39f

    .line 379
    .line 380
    .line 381
    const/16 v22, 0x0

    .line 382
    .line 383
    const v23, 0x3f333333    # 0.7f

    .line 384
    .line 385
    .line 386
    const v24, 0x3e9eb852    # 0.31f

    .line 387
    .line 388
    .line 389
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v4, 0x3fc66666    # 1.55f

    .line 393
    .line 394
    .line 395
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v4, 0x3fc51eb8    # 1.54f

    .line 399
    .line 400
    .line 401
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v25, 0x416970a4    # 14.59f

    .line 405
    .line 406
    .line 407
    const/high16 v26, 0x41100000    # 9.0f

    .line 408
    .line 409
    const v21, 0x4162b852    # 14.17f

    .line 410
    .line 411
    .line 412
    const v22, 0x4111999a    # 9.1f

    .line 413
    .line 414
    .line 415
    const v23, 0x4166147b    # 14.38f

    .line 416
    .line 417
    .line 418
    const/high16 v24, 0x41100000    # 9.0f

    .line 419
    .line 420
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v25, 0x3f0f5c29    # 0.56f

    .line 424
    .line 425
    .line 426
    const v26, 0x3f8f5c29    # 1.12f

    .line 427
    .line 428
    .line 429
    const v21, 0x3f147ae1    # 0.58f

    .line 430
    .line 431
    .line 432
    const/16 v22, 0x0

    .line 433
    .line 434
    const v23, 0x3f68f5c3    # 0.91f

    .line 435
    .line 436
    .line 437
    const v24, 0x3f28f5c3    # 0.66f

    .line 438
    .line 439
    .line 440
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const/high16 v4, 0x415c0000    # 13.75f

    .line 444
    .line 445
    const/high16 v6, 0x41400000    # 12.0f

    .line 446
    .line 447
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v4, 0x3fb47ae1    # 1.41f

    .line 451
    .line 452
    .line 453
    const v6, 0x3ff0a3d7    # 1.88f

    .line 454
    .line 455
    .line 456
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v25, 0x416970a4    # 14.59f

    .line 460
    .line 461
    .line 462
    const/high16 v26, 0x41700000    # 15.0f

    .line 463
    .line 464
    const/high16 v21, 0x41780000    # 15.5f

    .line 465
    .line 466
    const v22, 0x416570a4    # 14.34f

    .line 467
    .line 468
    .line 469
    const v23, 0x4172b852    # 15.17f

    .line 470
    .line 471
    .line 472
    const/high16 v24, 0x41700000    # 15.0f

    .line 473
    .line 474
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const/high16 v4, 0x41480000    # 12.5f

    .line 481
    .line 482
    const/high16 v6, 0x41980000    # 19.0f

    .line 483
    .line 484
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const/high16 v4, -0x40400000    # -1.5f

    .line 488
    .line 489
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const/high16 v4, 0x41600000    # 14.0f

    .line 493
    .line 494
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const/high16 v4, -0x40800000    # -1.0f

    .line 498
    .line 499
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const/high16 v4, -0x40400000    # -1.5f

    .line 503
    .line 504
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const/high16 v4, 0x41700000    # 15.0f

    .line 508
    .line 509
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const/high16 v4, -0x40800000    # -1.0f

    .line 513
    .line 514
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 518
    .line 519
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const/high16 v4, 0x41200000    # 10.0f

    .line 523
    .line 524
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const/high16 v4, 0x3f800000    # 1.0f

    .line 528
    .line 529
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 533
    .line 534
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const/high16 v4, 0x41980000    # 19.0f

    .line 538
    .line 539
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const/high16 v4, 0x41480000    # 12.5f

    .line 543
    .line 544
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 551
    .line 552
    .line 553
    move-result-object v2

    .line 554
    const/16 v16, 0x3800

    .line 555
    .line 556
    const/16 v17, 0x0

    .line 557
    .line 558
    const/high16 v6, 0x3f800000    # 1.0f

    .line 559
    .line 560
    const/high16 v8, 0x3f800000    # 1.0f

    .line 561
    .line 562
    const/4 v7, 0x0

    .line 563
    const/high16 v9, 0x3f800000    # 1.0f

    .line 564
    .line 565
    const/high16 v12, 0x3f800000    # 1.0f

    .line 566
    .line 567
    const/4 v13, 0x0

    .line 568
    const/4 v14, 0x0

    .line 569
    const/4 v15, 0x0

    .line 570
    const-string v4, ""

    .line 571
    .line 572
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 573
    .line 574
    .line 575
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 576
    .line 577
    .line 578
    move-result v3

    .line 579
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 580
    .line 581
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 582
    .line 583
    .line 584
    move-result-wide v6

    .line 585
    const/4 v2, 0x0

    .line 586
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 587
    .line 588
    .line 589
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 590
    .line 591
    .line 592
    move-result v10

    .line 593
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 594
    .line 595
    .line 596
    move-result v11

    .line 597
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 600
    .line 601
    .line 602
    const/high16 v4, 0x40f00000    # 7.5f

    .line 603
    .line 604
    const/high16 v6, 0x41480000    # 12.5f

    .line 605
    .line 606
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const/high16 v4, 0x3f800000    # 1.0f

    .line 610
    .line 611
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 615
    .line 616
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const/high16 v4, -0x40800000    # -1.0f

    .line 620
    .line 621
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 628
    .line 629
    .line 630
    move-result-object v2

    .line 631
    const/high16 v6, 0x3f800000    # 1.0f

    .line 632
    .line 633
    const/4 v7, 0x0

    .line 634
    const-string v4, ""

    .line 635
    .line 636
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 637
    .line 638
    .line 639
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 640
    .line 641
    .line 642
    move-result v3

    .line 643
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 644
    .line 645
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 646
    .line 647
    .line 648
    move-result-wide v6

    .line 649
    const/4 v0, 0x0

    .line 650
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 651
    .line 652
    .line 653
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 654
    .line 655
    .line 656
    move-result v10

    .line 657
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 658
    .line 659
    .line 660
    move-result v11

    .line 661
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 664
    .line 665
    .line 666
    const/high16 v2, 0x40f00000    # 7.5f

    .line 667
    .line 668
    const/high16 v4, 0x41200000    # 10.0f

    .line 669
    .line 670
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 671
    .line 672
    .line 673
    const/high16 v2, 0x3f800000    # 1.0f

    .line 674
    .line 675
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 679
    .line 680
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 681
    .line 682
    .line 683
    const/high16 v2, -0x40800000    # -1.0f

    .line 684
    .line 685
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 692
    .line 693
    .line 694
    move-result-object v2

    .line 695
    const/high16 v6, 0x3f800000    # 1.0f

    .line 696
    .line 697
    const/4 v7, 0x0

    .line 698
    const-string v4, ""

    .line 699
    .line 700
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 701
    .line 702
    .line 703
    move-result-object v0

    .line 704
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 705
    .line 706
    .line 707
    move-result-object v0

    .line 708
    sput-object v0, Landroidx/compose/material/icons/rounded/_8kPlusKt;->__8kPlus:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 709
    .line 710
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 711
    .line 712
    .line 713
    return-object v0
.end method
