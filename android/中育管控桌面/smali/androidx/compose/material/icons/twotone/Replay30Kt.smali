.class public final Landroidx/compose/material/icons/twotone/Replay30Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_replay30",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Replay30",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getReplay30",
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
        "SMAP\nReplay30.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Replay30.kt\nandroidx/compose/material/icons/twotone/Replay30Kt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,141:1\n212#2,12:142\n233#2,18:155\n253#2:192\n174#3:154\n705#4,2:173\n717#4,2:175\n719#4,11:181\n72#5,4:177\n*S KotlinDebug\n*F\n+ 1 Replay30.kt\nandroidx/compose/material/icons/twotone/Replay30Kt\n*L\n29#1:142,12\n30#1:155,18\n30#1:192\n29#1:154\n30#1:173,2\n30#1:175,2\n30#1:181,11\n30#1:177,4\n*E\n"
    }
.end annotation


# static fields
.field private static _replay30:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getReplay30(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/Replay30Kt;->_replay30:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Replay30"

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
    const/high16 v0, 0x41400000    # 12.0f

    .line 71
    .line 72
    const/high16 v2, 0x40a00000    # 5.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v2, 0x3f800000    # 1.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v0, 0x40e00000    # 7.0f

    .line 83
    .line 84
    const/high16 v2, 0x40c00000    # 6.0f

    .line 85
    .line 86
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 87
    .line 88
    .line 89
    const/high16 v0, 0x40a00000    # 5.0f

    .line 90
    .line 91
    const/high16 v2, 0x40a00000    # 5.0f

    .line 92
    .line 93
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v0, 0x41400000    # 12.0f

    .line 97
    .line 98
    const/high16 v2, 0x40e00000    # 7.0f

    .line 99
    .line 100
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v17, 0x40c00000    # 6.0f

    .line 104
    .line 105
    const/high16 v18, 0x40c00000    # 6.0f

    .line 106
    .line 107
    const v13, 0x4053d70a    # 3.31f

    .line 108
    .line 109
    .line 110
    const/4 v14, 0x0

    .line 111
    const/high16 v15, 0x40c00000    # 6.0f

    .line 112
    .line 113
    const v16, 0x402c28f6    # 2.69f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v0, 0x40c00000    # 6.0f

    .line 120
    .line 121
    const/high16 v2, 0x40c00000    # 6.0f

    .line 122
    .line 123
    const/high16 v4, -0x3f400000    # -6.0f

    .line 124
    .line 125
    const v6, -0x3fd3d70a    # -2.69f

    .line 126
    .line 127
    .line 128
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v0, -0x3fd3d70a    # -2.69f

    .line 132
    .line 133
    .line 134
    const/high16 v2, -0x3f400000    # -6.0f

    .line 135
    .line 136
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v0, 0x40800000    # 4.0f

    .line 140
    .line 141
    const/high16 v2, 0x41500000    # 13.0f

    .line 142
    .line 143
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v17, 0x41000000    # 8.0f

    .line 147
    .line 148
    const/high16 v18, 0x41000000    # 8.0f

    .line 149
    .line 150
    const/4 v13, 0x0

    .line 151
    const v14, 0x408d70a4    # 4.42f

    .line 152
    .line 153
    .line 154
    const v15, 0x40651eb8    # 3.58f

    .line 155
    .line 156
    .line 157
    const/high16 v16, 0x41000000    # 8.0f

    .line 158
    .line 159
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v0, -0x3f9ae148    # -3.58f

    .line 163
    .line 164
    .line 165
    const/high16 v2, 0x41000000    # 8.0f

    .line 166
    .line 167
    const/high16 v4, -0x3f000000    # -8.0f

    .line 168
    .line 169
    const/high16 v6, 0x41000000    # 8.0f

    .line 170
    .line 171
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const/high16 v2, -0x3f000000    # -8.0f

    .line 175
    .line 176
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v0, 0x4118f5c3    # 9.56f

    .line 183
    .line 184
    .line 185
    const v2, 0x4157d70a    # 13.49f

    .line 186
    .line 187
    .line 188
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v0, 0x3ee66666    # 0.45f

    .line 192
    .line 193
    .line 194
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v17, 0x3ef5c28f    # 0.48f

    .line 198
    .line 199
    .line 200
    const v18, -0x41dc28f6    # -0.16f

    .line 201
    .line 202
    .line 203
    const v13, 0x3e570a3d    # 0.21f

    .line 204
    .line 205
    .line 206
    const/4 v14, 0x0

    .line 207
    const v15, 0x3ebd70a4    # 0.37f

    .line 208
    .line 209
    .line 210
    const v16, -0x42b33333    # -0.05f

    .line 211
    .line 212
    .line 213
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v0, -0x4123d70a    # -0.43f

    .line 217
    .line 218
    .line 219
    const v2, 0x3e23d70a    # 0.16f

    .line 220
    .line 221
    .line 222
    const/high16 v4, -0x41800000    # -0.25f

    .line 223
    .line 224
    invoke-virtual {v12, v2, v4, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v17, -0x42dc28f6    # -0.04f

    .line 228
    .line 229
    .line 230
    const v18, -0x419eb852    # -0.22f

    .line 231
    .line 232
    .line 233
    const/4 v13, 0x0

    .line 234
    const v14, -0x425c28f6    # -0.08f

    .line 235
    .line 236
    .line 237
    const v15, -0x43dc28f6    # -0.01f

    .line 238
    .line 239
    .line 240
    const v16, -0x41e66666    # -0.15f

    .line 241
    .line 242
    .line 243
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v0, -0x428a3d71    # -0.06f

    .line 247
    .line 248
    .line 249
    const v2, -0x41d1eb85    # -0.17f

    .line 250
    .line 251
    .line 252
    const v4, -0x421eb852    # -0.11f

    .line 253
    .line 254
    .line 255
    const v6, -0x420a3d71    # -0.12f

    .line 256
    .line 257
    .line 258
    invoke-virtual {v12, v0, v6, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v0, -0x4247ae14    # -0.09f

    .line 262
    .line 263
    .line 264
    const v2, -0x41c7ae14    # -0.18f

    .line 265
    .line 266
    .line 267
    invoke-virtual {v12, v4, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v0, -0x41dc28f6    # -0.16f

    .line 271
    .line 272
    .line 273
    const/high16 v2, -0x41800000    # -0.25f

    .line 274
    .line 275
    const v4, -0x42dc28f6    # -0.04f

    .line 276
    .line 277
    .line 278
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v17, -0x419eb852    # -0.22f

    .line 282
    .line 283
    .line 284
    const v18, 0x3cf5c28f    # 0.03f

    .line 285
    .line 286
    .line 287
    const v13, -0x425c28f6    # -0.08f

    .line 288
    .line 289
    .line 290
    const/4 v14, 0x0

    .line 291
    const v15, -0x41e66666    # -0.15f

    .line 292
    .line 293
    .line 294
    const v16, 0x3c23d70a    # 0.01f

    .line 295
    .line 296
    .line 297
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v0, -0x41fae148    # -0.13f

    .line 301
    .line 302
    .line 303
    const v2, 0x3d4ccccd    # 0.05f

    .line 304
    .line 305
    .line 306
    const v4, 0x3dcccccd    # 0.1f

    .line 307
    .line 308
    .line 309
    const v6, -0x41c7ae14    # -0.18f

    .line 310
    .line 311
    .line 312
    invoke-virtual {v12, v0, v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v0, 0x3e19999a    # 0.15f

    .line 316
    .line 317
    .line 318
    const v2, 0x3db851ec    # 0.09f

    .line 319
    .line 320
    .line 321
    const v4, -0x4247ae14    # -0.09f

    .line 322
    .line 323
    .line 324
    const v6, -0x420a3d71    # -0.12f

    .line 325
    .line 326
    .line 327
    invoke-virtual {v12, v4, v2, v6, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v0, 0x3e4ccccd    # 0.2f

    .line 331
    .line 332
    .line 333
    const v2, 0x3e051eb8    # 0.13f

    .line 334
    .line 335
    .line 336
    const v4, -0x42b33333    # -0.05f

    .line 337
    .line 338
    .line 339
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v0, -0x40a66666    # -0.85f

    .line 343
    .line 344
    .line 345
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v17, 0x3de147ae    # 0.11f

    .line 349
    .line 350
    .line 351
    const v18, -0x410a3d71    # -0.48f

    .line 352
    .line 353
    .line 354
    const/4 v13, 0x0

    .line 355
    const v14, -0x41c7ae14    # -0.18f

    .line 356
    .line 357
    .line 358
    const v15, 0x3d23d70a    # 0.04f

    .line 359
    .line 360
    .line 361
    const v16, -0x4151eb85    # -0.34f

    .line 362
    .line 363
    .line 364
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v0, 0x3e99999a    # 0.3f

    .line 368
    .line 369
    .line 370
    const v2, -0x41428f5c    # -0.37f

    .line 371
    .line 372
    .line 373
    const v4, 0x3e2e147b    # 0.17f

    .line 374
    .line 375
    .line 376
    const v6, -0x4175c28f    # -0.27f

    .line 377
    .line 378
    .line 379
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v0, 0x3e8a3d71    # 0.27f

    .line 383
    .line 384
    .line 385
    const v2, 0x3ee147ae    # 0.44f

    .line 386
    .line 387
    .line 388
    const v4, -0x41947ae1    # -0.23f

    .line 389
    .line 390
    .line 391
    const v6, -0x41c7ae14    # -0.18f

    .line 392
    .line 393
    .line 394
    invoke-virtual {v12, v0, v6, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v0, 0x3f0a3d71    # 0.54f

    .line 398
    .line 399
    .line 400
    const v2, -0x425c28f6    # -0.08f

    .line 401
    .line 402
    .line 403
    const v4, 0x3eb33333    # 0.35f

    .line 404
    .line 405
    .line 406
    const v6, -0x425c28f6    # -0.08f

    .line 407
    .line 408
    .line 409
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v17, 0x3f170a3d    # 0.59f

    .line 413
    .line 414
    .line 415
    const v18, 0x3da3d70a    # 0.08f

    .line 416
    .line 417
    .line 418
    const v13, 0x3e570a3d    # 0.21f

    .line 419
    .line 420
    .line 421
    const/4 v14, 0x0

    .line 422
    const v15, 0x3ed1eb85    # 0.41f

    .line 423
    .line 424
    .line 425
    const v16, 0x3cf5c28f    # 0.03f

    .line 426
    .line 427
    .line 428
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const v0, 0x3eeb851f    # 0.46f

    .line 432
    .line 433
    .line 434
    const v2, 0x3e6b851f    # 0.23f

    .line 435
    .line 436
    .line 437
    const v4, 0x3e051eb8    # 0.13f

    .line 438
    .line 439
    .line 440
    const v6, 0x3ea8f5c3    # 0.33f

    .line 441
    .line 442
    .line 443
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const v0, 0x3e99999a    # 0.3f

    .line 447
    .line 448
    .line 449
    const v2, 0x3ec28f5c    # 0.38f

    .line 450
    .line 451
    .line 452
    const v4, 0x3e6b851f    # 0.23f

    .line 453
    .line 454
    .line 455
    invoke-virtual {v12, v4, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const v0, 0x3f07ae14    # 0.53f

    .line 459
    .line 460
    .line 461
    const v2, 0x3ea8f5c3    # 0.33f

    .line 462
    .line 463
    .line 464
    const v4, 0x3de147ae    # 0.11f

    .line 465
    .line 466
    .line 467
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v17, -0x42dc28f6    # -0.04f

    .line 471
    .line 472
    .line 473
    const v18, 0x3e8a3d71    # 0.27f

    .line 474
    .line 475
    .line 476
    const/4 v13, 0x0

    .line 477
    const v14, 0x3db851ec    # 0.09f

    .line 478
    .line 479
    .line 480
    const v15, -0x43dc28f6    # -0.01f

    .line 481
    .line 482
    .line 483
    const v16, 0x3e3851ec    # 0.18f

    .line 484
    .line 485
    .line 486
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const v0, -0x41fae148    # -0.13f

    .line 490
    .line 491
    .line 492
    const/high16 v2, 0x3e800000    # 0.25f

    .line 493
    .line 494
    const v4, 0x3e2e147b    # 0.17f

    .line 495
    .line 496
    .line 497
    const v6, -0x4270a3d7    # -0.07f

    .line 498
    .line 499
    .line 500
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const v0, -0x41b33333    # -0.2f

    .line 504
    .line 505
    .line 506
    const v2, 0x3e6147ae    # 0.22f

    .line 507
    .line 508
    .line 509
    const v4, -0x420a3d71    # -0.12f

    .line 510
    .line 511
    .line 512
    const v6, 0x3e19999a    # 0.15f

    .line 513
    .line 514
    .line 515
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const v0, 0x3df5c28f    # 0.12f

    .line 519
    .line 520
    .line 521
    const v2, -0x4170a3d7    # -0.28f

    .line 522
    .line 523
    .line 524
    const v4, -0x41d1eb85    # -0.17f

    .line 525
    .line 526
    .line 527
    const v6, 0x3e2e147b    # 0.17f

    .line 528
    .line 529
    .line 530
    invoke-virtual {v12, v4, v0, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const v17, 0x3f0a3d71    # 0.54f

    .line 534
    .line 535
    .line 536
    const v18, 0x3ec7ae14    # 0.39f

    .line 537
    .line 538
    .line 539
    const v13, 0x3e75c28f    # 0.24f

    .line 540
    .line 541
    .line 542
    const v15, 0x3ed70a3d    # 0.42f

    .line 543
    .line 544
    .line 545
    const v16, 0x3e570a3d    # 0.21f

    .line 546
    .line 547
    .line 548
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v0, 0x3ec28f5c    # 0.38f

    .line 552
    .line 553
    .line 554
    const v2, 0x3f1c28f6    # 0.61f

    .line 555
    .line 556
    .line 557
    const v4, 0x3e3851ec    # 0.18f

    .line 558
    .line 559
    .line 560
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const v17, -0x420a3d71    # -0.12f

    .line 564
    .line 565
    .line 566
    const v18, 0x3f07ae14    # 0.53f

    .line 567
    .line 568
    .line 569
    const/4 v13, 0x0

    .line 570
    const v14, 0x3e4ccccd    # 0.2f

    .line 571
    .line 572
    .line 573
    const v15, -0x42dc28f6    # -0.04f

    .line 574
    .line 575
    .line 576
    const v16, 0x3ec28f5c    # 0.38f

    .line 577
    .line 578
    .line 579
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const v0, -0x415c28f6    # -0.32f

    .line 583
    .line 584
    .line 585
    const v2, 0x3ec7ae14    # 0.39f

    .line 586
    .line 587
    .line 588
    const v4, -0x41c7ae14    # -0.18f

    .line 589
    .line 590
    .line 591
    const v6, 0x3e947ae1    # 0.29f

    .line 592
    .line 593
    .line 594
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const v0, -0x410a3d71    # -0.48f

    .line 598
    .line 599
    .line 600
    const v2, 0x3e75c28f    # 0.24f

    .line 601
    .line 602
    .line 603
    const v4, -0x416b851f    # -0.29f

    .line 604
    .line 605
    .line 606
    const v6, 0x3e428f5c    # 0.19f

    .line 607
    .line 608
    .line 609
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    const v0, -0x40e66666    # -0.6f

    .line 613
    .line 614
    .line 615
    const v2, 0x3da3d70a    # 0.08f

    .line 616
    .line 617
    .line 618
    const v4, -0x413d70a4    # -0.38f

    .line 619
    .line 620
    .line 621
    const v6, 0x3da3d70a    # 0.08f

    .line 622
    .line 623
    .line 624
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    const v17, -0x40f851ec    # -0.53f

    .line 628
    .line 629
    .line 630
    const v18, -0x4270a3d7    # -0.07f

    .line 631
    .line 632
    .line 633
    const v13, -0x41c7ae14    # -0.18f

    .line 634
    .line 635
    .line 636
    const/4 v14, 0x0

    .line 637
    const v15, -0x4147ae14    # -0.36f

    .line 638
    .line 639
    .line 640
    const v16, -0x435c28f6    # -0.02f

    .line 641
    .line 642
    .line 643
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    const v0, -0x41147ae1    # -0.46f

    .line 647
    .line 648
    .line 649
    const v2, -0x41570a3d    # -0.33f

    .line 650
    .line 651
    .line 652
    const v4, -0x41947ae1    # -0.23f

    .line 653
    .line 654
    .line 655
    const v6, -0x420a3d71    # -0.12f

    .line 656
    .line 657
    .line 658
    invoke-virtual {v12, v2, v6, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    const v0, -0x413d70a4    # -0.38f

    .line 662
    .line 663
    .line 664
    const/high16 v6, -0x41800000    # -0.25f

    .line 665
    .line 666
    invoke-virtual {v12, v6, v4, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    const v0, -0x4151eb85    # -0.34f

    .line 670
    .line 671
    .line 672
    const v2, -0x40f33333    # -0.55f

    .line 673
    .line 674
    .line 675
    const v4, -0x420a3d71    # -0.12f

    .line 676
    .line 677
    .line 678
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    const v0, 0x3f59999a    # 0.85f

    .line 682
    .line 683
    .line 684
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    const v17, 0x3d4ccccd    # 0.05f

    .line 688
    .line 689
    .line 690
    const v18, 0x3e6147ae    # 0.22f

    .line 691
    .line 692
    .line 693
    const/4 v13, 0x0

    .line 694
    const v14, 0x3da3d70a    # 0.08f

    .line 695
    .line 696
    .line 697
    const v15, 0x3ca3d70a    # 0.02f

    .line 698
    .line 699
    .line 700
    const v16, 0x3e19999a    # 0.15f

    .line 701
    .line 702
    .line 703
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    const v0, 0x3d8f5c29    # 0.07f

    .line 707
    .line 708
    .line 709
    const v2, 0x3df5c28f    # 0.12f

    .line 710
    .line 711
    .line 712
    const v4, 0x3e051eb8    # 0.13f

    .line 713
    .line 714
    .line 715
    const v6, 0x3e2e147b    # 0.17f

    .line 716
    .line 717
    .line 718
    invoke-virtual {v12, v0, v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    const v0, 0x3df5c28f    # 0.12f

    .line 722
    .line 723
    .line 724
    const v2, 0x3e4ccccd    # 0.2f

    .line 725
    .line 726
    .line 727
    const v4, 0x3db851ec    # 0.09f

    .line 728
    .line 729
    .line 730
    const v6, 0x3de147ae    # 0.11f

    .line 731
    .line 732
    .line 733
    invoke-virtual {v12, v0, v4, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 734
    .line 735
    .line 736
    const/high16 v0, 0x3e800000    # 0.25f

    .line 737
    .line 738
    const v2, 0x3d23d70a    # 0.04f

    .line 739
    .line 740
    .line 741
    const v4, 0x3e23d70a    # 0.16f

    .line 742
    .line 743
    .line 744
    const v6, 0x3d23d70a    # 0.04f

    .line 745
    .line 746
    .line 747
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 748
    .line 749
    .line 750
    const v17, 0x3e8a3d71    # 0.27f

    .line 751
    .line 752
    .line 753
    const v18, -0x42dc28f6    # -0.04f

    .line 754
    .line 755
    .line 756
    const v13, 0x3dcccccd    # 0.1f

    .line 757
    .line 758
    .line 759
    const/4 v14, 0x0

    .line 760
    const v15, 0x3e428f5c    # 0.19f

    .line 761
    .line 762
    .line 763
    const v16, -0x43dc28f6    # -0.01f

    .line 764
    .line 765
    .line 766
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 767
    .line 768
    .line 769
    const v0, -0x4270a3d7    # -0.07f

    .line 770
    .line 771
    .line 772
    const v2, 0x3e4ccccd    # 0.2f

    .line 773
    .line 774
    .line 775
    const v4, -0x420a3d71    # -0.12f

    .line 776
    .line 777
    .line 778
    const v6, 0x3e19999a    # 0.15f

    .line 779
    .line 780
    .line 781
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 782
    .line 783
    .line 784
    const v0, 0x3e051eb8    # 0.13f

    .line 785
    .line 786
    .line 787
    const v2, 0x3dcccccd    # 0.1f

    .line 788
    .line 789
    .line 790
    const v4, -0x41c7ae14    # -0.18f

    .line 791
    .line 792
    .line 793
    const v6, -0x421eb852    # -0.11f

    .line 794
    .line 795
    .line 796
    invoke-virtual {v12, v2, v6, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 797
    .line 798
    .line 799
    const v0, 0x3d23d70a    # 0.04f

    .line 800
    .line 801
    .line 802
    const v2, -0x418a3d71    # -0.24f

    .line 803
    .line 804
    .line 805
    const v4, 0x3d23d70a    # 0.04f

    .line 806
    .line 807
    .line 808
    const v6, -0x41e66666    # -0.15f

    .line 809
    .line 810
    .line 811
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 812
    .line 813
    .line 814
    const v17, -0x42b33333    # -0.05f

    .line 815
    .line 816
    .line 817
    const v18, -0x416b851f    # -0.29f

    .line 818
    .line 819
    .line 820
    const/4 v13, 0x0

    .line 821
    const v14, -0x421eb852    # -0.11f

    .line 822
    .line 823
    .line 824
    const v15, -0x435c28f6    # -0.02f

    .line 825
    .line 826
    .line 827
    const v16, -0x41a8f5c3    # -0.21f

    .line 828
    .line 829
    .line 830
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 831
    .line 832
    .line 833
    const v0, -0x41f0a3d7    # -0.14f

    .line 834
    .line 835
    .line 836
    const v2, -0x41b33333    # -0.2f

    .line 837
    .line 838
    .line 839
    const v4, -0x425c28f6    # -0.08f

    .line 840
    .line 841
    .line 842
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 843
    .line 844
    .line 845
    const v0, -0x41fae148    # -0.13f

    .line 846
    .line 847
    .line 848
    const v2, -0x419eb852    # -0.22f

    .line 849
    .line 850
    .line 851
    const v4, -0x4247ae14    # -0.09f

    .line 852
    .line 853
    .line 854
    const v6, -0x421eb852    # -0.11f

    .line 855
    .line 856
    .line 857
    invoke-virtual {v12, v0, v4, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 858
    .line 859
    .line 860
    const v0, -0x416b851f    # -0.29f

    .line 861
    .line 862
    .line 863
    const v2, -0x42dc28f6    # -0.04f

    .line 864
    .line 865
    .line 866
    const v4, -0x41c7ae14    # -0.18f

    .line 867
    .line 868
    .line 869
    invoke-virtual {v12, v4, v2, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 870
    .line 871
    .line 872
    const v0, -0x410f5c29    # -0.47f

    .line 873
    .line 874
    .line 875
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 876
    .line 877
    .line 878
    const v0, -0x40d9999a    # -0.65f

    .line 879
    .line 880
    .line 881
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 882
    .line 883
    .line 884
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 885
    .line 886
    .line 887
    const v0, 0x4174cccd    # 15.3f

    .line 888
    .line 889
    .line 890
    const v2, 0x4163d70a    # 14.24f

    .line 891
    .line 892
    .line 893
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 894
    .line 895
    .line 896
    const v17, -0x42333333    # -0.1f

    .line 897
    .line 898
    .line 899
    const v18, 0x3f51eb85    # 0.82f

    .line 900
    .line 901
    .line 902
    const v14, 0x3ea3d70a    # 0.32f

    .line 903
    .line 904
    .line 905
    const v15, -0x430a3d71    # -0.03f

    .line 906
    .line 907
    .line 908
    const v16, 0x3f19999a    # 0.6f

    .line 909
    .line 910
    .line 911
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 912
    .line 913
    .line 914
    const v0, -0x416b851f    # -0.29f

    .line 915
    .line 916
    .line 917
    const v2, 0x3f11eb85    # 0.57f

    .line 918
    .line 919
    .line 920
    const v4, -0x41d1eb85    # -0.17f

    .line 921
    .line 922
    .line 923
    const v6, 0x3ed70a3d    # 0.42f

    .line 924
    .line 925
    .line 926
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 927
    .line 928
    .line 929
    const v0, 0x3e851eb8    # 0.26f

    .line 930
    .line 931
    .line 932
    const v2, -0x4119999a    # -0.45f

    .line 933
    .line 934
    .line 935
    const v4, 0x3ea8f5c3    # 0.33f

    .line 936
    .line 937
    .line 938
    const v6, -0x4170a3d7    # -0.28f

    .line 939
    .line 940
    .line 941
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 942
    .line 943
    .line 944
    const v0, -0x41428f5c    # -0.37f

    .line 945
    .line 946
    .line 947
    const v2, -0x40e8f5c3    # -0.59f

    .line 948
    .line 949
    .line 950
    const v4, 0x3dcccccd    # 0.1f

    .line 951
    .line 952
    .line 953
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 954
    .line 955
    .line 956
    const v0, -0x40e8f5c3    # -0.59f

    .line 957
    .line 958
    .line 959
    const v2, -0x42333333    # -0.1f

    .line 960
    .line 961
    .line 962
    const v4, -0x412e147b    # -0.41f

    .line 963
    .line 964
    .line 965
    const v6, -0x430a3d71    # -0.03f

    .line 966
    .line 967
    .line 968
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 969
    .line 970
    .line 971
    const v0, -0x41147ae1    # -0.46f

    .line 972
    .line 973
    .line 974
    const v2, -0x41570a3d    # -0.33f

    .line 975
    .line 976
    .line 977
    const v4, -0x41c7ae14    # -0.18f

    .line 978
    .line 979
    .line 980
    invoke-virtual {v12, v2, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 981
    .line 982
    .line 983
    const v0, -0x41666666    # -0.3f

    .line 984
    .line 985
    .line 986
    const v2, -0x40ee147b    # -0.57f

    .line 987
    .line 988
    .line 989
    const v4, -0x41947ae1    # -0.23f

    .line 990
    .line 991
    .line 992
    const v6, -0x4151eb85    # -0.34f

    .line 993
    .line 994
    .line 995
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 996
    .line 997
    .line 998
    const/high16 v0, -0x41000000    # -0.5f

    .line 999
    .line 1000
    const v2, -0x40ae147b    # -0.82f

    .line 1001
    .line 1002
    .line 1003
    const v4, -0x421eb852    # -0.11f

    .line 1004
    .line 1005
    .line 1006
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1007
    .line 1008
    .line 1009
    const v0, -0x40c28f5c    # -0.74f

    .line 1010
    .line 1011
    .line 1012
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1013
    .line 1014
    .line 1015
    const v17, 0x3dcccccd    # 0.1f

    .line 1016
    .line 1017
    .line 1018
    const v18, -0x40ae147b    # -0.82f

    .line 1019
    .line 1020
    .line 1021
    const v14, -0x415c28f6    # -0.32f

    .line 1022
    .line 1023
    .line 1024
    const v15, 0x3cf5c28f    # 0.03f

    .line 1025
    .line 1026
    .line 1027
    const v16, -0x40e66666    # -0.6f

    .line 1028
    .line 1029
    .line 1030
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1031
    .line 1032
    .line 1033
    const v0, 0x3e947ae1    # 0.29f

    .line 1034
    .line 1035
    .line 1036
    const v2, -0x40ee147b    # -0.57f

    .line 1037
    .line 1038
    .line 1039
    const v4, 0x3e2e147b    # 0.17f

    .line 1040
    .line 1041
    .line 1042
    const v6, -0x4128f5c3    # -0.42f

    .line 1043
    .line 1044
    .line 1045
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1046
    .line 1047
    .line 1048
    const v0, -0x417ae148    # -0.26f

    .line 1049
    .line 1050
    .line 1051
    const v2, 0x3ee66666    # 0.45f

    .line 1052
    .line 1053
    .line 1054
    const v4, -0x41570a3d    # -0.33f

    .line 1055
    .line 1056
    .line 1057
    const v6, 0x3e8f5c29    # 0.28f

    .line 1058
    .line 1059
    .line 1060
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1061
    .line 1062
    .line 1063
    const v0, 0x3f170a3d    # 0.59f

    .line 1064
    .line 1065
    .line 1066
    const v2, -0x42333333    # -0.1f

    .line 1067
    .line 1068
    .line 1069
    const v4, 0x3ebd70a4    # 0.37f

    .line 1070
    .line 1071
    .line 1072
    const v6, -0x42333333    # -0.1f

    .line 1073
    .line 1074
    .line 1075
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1076
    .line 1077
    .line 1078
    const v0, 0x3cf5c28f    # 0.03f

    .line 1079
    .line 1080
    .line 1081
    const v2, 0x3f170a3d    # 0.59f

    .line 1082
    .line 1083
    .line 1084
    const v4, 0x3dcccccd    # 0.1f

    .line 1085
    .line 1086
    .line 1087
    const v6, 0x3ed1eb85    # 0.41f

    .line 1088
    .line 1089
    .line 1090
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1091
    .line 1092
    .line 1093
    const v0, 0x3eeb851f    # 0.46f

    .line 1094
    .line 1095
    .line 1096
    const v2, 0x3e3851ec    # 0.18f

    .line 1097
    .line 1098
    .line 1099
    const v4, 0x3ea8f5c3    # 0.33f

    .line 1100
    .line 1101
    .line 1102
    invoke-virtual {v12, v4, v2, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1103
    .line 1104
    .line 1105
    const v0, 0x3e99999a    # 0.3f

    .line 1106
    .line 1107
    .line 1108
    const v2, 0x3f11eb85    # 0.57f

    .line 1109
    .line 1110
    .line 1111
    const v4, 0x3e6b851f    # 0.23f

    .line 1112
    .line 1113
    .line 1114
    const v6, 0x3eae147b    # 0.34f

    .line 1115
    .line 1116
    .line 1117
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1118
    .line 1119
    .line 1120
    const/high16 v0, 0x3f000000    # 0.5f

    .line 1121
    .line 1122
    const v2, 0x3f51eb85    # 0.82f

    .line 1123
    .line 1124
    .line 1125
    const v4, 0x3de147ae    # 0.11f

    .line 1126
    .line 1127
    .line 1128
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1129
    .line 1130
    .line 1131
    const v0, 0x3f3d70a4    # 0.74f

    .line 1132
    .line 1133
    .line 1134
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1135
    .line 1136
    .line 1137
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1138
    .line 1139
    .line 1140
    const v0, 0x41673333    # 14.45f

    .line 1141
    .line 1142
    .line 1143
    const v2, 0x4156147b    # 13.38f

    .line 1144
    .line 1145
    .line 1146
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1147
    .line 1148
    .line 1149
    const v17, -0x42dc28f6    # -0.04f

    .line 1150
    .line 1151
    .line 1152
    const v18, -0x410a3d71    # -0.48f

    .line 1153
    .line 1154
    .line 1155
    const v14, -0x41bd70a4    # -0.19f

    .line 1156
    .line 1157
    .line 1158
    const v15, -0x43dc28f6    # -0.01f

    .line 1159
    .line 1160
    .line 1161
    const v16, -0x414ccccd    # -0.35f

    .line 1162
    .line 1163
    .line 1164
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1165
    .line 1166
    .line 1167
    const v0, -0x4270a3d7    # -0.07f

    .line 1168
    .line 1169
    .line 1170
    const v2, -0x416147ae    # -0.31f

    .line 1171
    .line 1172
    .line 1173
    const v4, -0x41947ae1    # -0.23f

    .line 1174
    .line 1175
    .line 1176
    const v6, -0x420a3d71    # -0.12f

    .line 1177
    .line 1178
    .line 1179
    invoke-virtual {v12, v0, v4, v6, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1180
    .line 1181
    .line 1182
    const v0, -0x41f0a3d7    # -0.14f

    .line 1183
    .line 1184
    .line 1185
    const v2, -0x41bd70a4    # -0.19f

    .line 1186
    .line 1187
    .line 1188
    const v4, -0x41d1eb85    # -0.17f

    .line 1189
    .line 1190
    .line 1191
    const v6, -0x421eb852    # -0.11f

    .line 1192
    .line 1193
    .line 1194
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1195
    .line 1196
    .line 1197
    const v0, -0x41dc28f6    # -0.16f

    .line 1198
    .line 1199
    .line 1200
    const v2, -0x42b33333    # -0.05f

    .line 1201
    .line 1202
    .line 1203
    const/high16 v4, -0x41800000    # -0.25f

    .line 1204
    .line 1205
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1206
    .line 1207
    .line 1208
    const v0, 0x3ca3d70a    # 0.02f

    .line 1209
    .line 1210
    .line 1211
    const v2, 0x3d4ccccd    # 0.05f

    .line 1212
    .line 1213
    .line 1214
    const v6, -0x41c7ae14    # -0.18f

    .line 1215
    .line 1216
    .line 1217
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1218
    .line 1219
    .line 1220
    const v0, -0x41f0a3d7    # -0.14f

    .line 1221
    .line 1222
    .line 1223
    const v2, -0x41bd70a4    # -0.19f

    .line 1224
    .line 1225
    .line 1226
    const v4, 0x3db851ec    # 0.09f

    .line 1227
    .line 1228
    .line 1229
    const v6, 0x3e2e147b    # 0.17f

    .line 1230
    .line 1231
    .line 1232
    invoke-virtual {v12, v0, v4, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1233
    .line 1234
    .line 1235
    const v0, 0x3e9eb852    # 0.31f

    .line 1236
    .line 1237
    .line 1238
    const v2, 0x3e3851ec    # 0.18f

    .line 1239
    .line 1240
    .line 1241
    const v4, -0x4247ae14    # -0.09f

    .line 1242
    .line 1243
    .line 1244
    const v6, -0x420a3d71    # -0.12f

    .line 1245
    .line 1246
    .line 1247
    invoke-virtual {v12, v4, v2, v6, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1248
    .line 1249
    .line 1250
    const v0, 0x3e947ae1    # 0.29f

    .line 1251
    .line 1252
    .line 1253
    const v2, 0x3ef5c28f    # 0.48f

    .line 1254
    .line 1255
    .line 1256
    const v4, -0x42dc28f6    # -0.04f

    .line 1257
    .line 1258
    .line 1259
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1260
    .line 1261
    .line 1262
    const v0, 0x3f7851ec    # 0.97f

    .line 1263
    .line 1264
    .line 1265
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1266
    .line 1267
    .line 1268
    const v17, 0x3d23d70a    # 0.04f

    .line 1269
    .line 1270
    .line 1271
    const v18, 0x3ef5c28f    # 0.48f

    .line 1272
    .line 1273
    .line 1274
    const v14, 0x3e428f5c    # 0.19f

    .line 1275
    .line 1276
    .line 1277
    const v15, 0x3c23d70a    # 0.01f

    .line 1278
    .line 1279
    .line 1280
    const v16, 0x3eb33333    # 0.35f

    .line 1281
    .line 1282
    .line 1283
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1284
    .line 1285
    .line 1286
    const v0, 0x3df5c28f    # 0.12f

    .line 1287
    .line 1288
    .line 1289
    const v2, 0x3ea3d70a    # 0.32f

    .line 1290
    .line 1291
    .line 1292
    const v4, 0x3d8f5c29    # 0.07f

    .line 1293
    .line 1294
    .line 1295
    const v6, 0x3e75c28f    # 0.24f

    .line 1296
    .line 1297
    .line 1298
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1299
    .line 1300
    .line 1301
    const v0, 0x3e0f5c29    # 0.14f

    .line 1302
    .line 1303
    .line 1304
    const v2, 0x3e428f5c    # 0.19f

    .line 1305
    .line 1306
    .line 1307
    const v4, 0x3de147ae    # 0.11f

    .line 1308
    .line 1309
    .line 1310
    const v6, 0x3e2e147b    # 0.17f

    .line 1311
    .line 1312
    .line 1313
    invoke-virtual {v12, v4, v0, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1314
    .line 1315
    .line 1316
    const/high16 v0, 0x3e800000    # 0.25f

    .line 1317
    .line 1318
    const v2, 0x3d4ccccd    # 0.05f

    .line 1319
    .line 1320
    .line 1321
    const v4, 0x3e23d70a    # 0.16f

    .line 1322
    .line 1323
    .line 1324
    invoke-virtual {v12, v4, v2, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1325
    .line 1326
    .line 1327
    const v0, -0x435c28f6    # -0.02f

    .line 1328
    .line 1329
    .line 1330
    const/high16 v2, 0x3e800000    # 0.25f

    .line 1331
    .line 1332
    const v4, 0x3e3851ec    # 0.18f

    .line 1333
    .line 1334
    .line 1335
    const v6, -0x42b33333    # -0.05f

    .line 1336
    .line 1337
    .line 1338
    invoke-virtual {v12, v4, v0, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1339
    .line 1340
    .line 1341
    const v0, 0x3e0f5c29    # 0.14f

    .line 1342
    .line 1343
    .line 1344
    const v2, 0x3e428f5c    # 0.19f

    .line 1345
    .line 1346
    .line 1347
    const v4, -0x4247ae14    # -0.09f

    .line 1348
    .line 1349
    .line 1350
    const v6, -0x41d1eb85    # -0.17f

    .line 1351
    .line 1352
    .line 1353
    invoke-virtual {v12, v0, v4, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1354
    .line 1355
    .line 1356
    const v0, -0x41bd70a4    # -0.19f

    .line 1357
    .line 1358
    .line 1359
    const v2, -0x415c28f6    # -0.32f

    .line 1360
    .line 1361
    .line 1362
    const v4, 0x3db851ec    # 0.09f

    .line 1363
    .line 1364
    .line 1365
    const v6, 0x3de147ae    # 0.11f

    .line 1366
    .line 1367
    .line 1368
    invoke-virtual {v12, v4, v0, v6, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1369
    .line 1370
    .line 1371
    const v18, -0x410a3d71    # -0.48f

    .line 1372
    .line 1373
    .line 1374
    const v13, 0x3cf5c28f    # 0.03f

    .line 1375
    .line 1376
    .line 1377
    const v14, -0x41fae148    # -0.13f

    .line 1378
    .line 1379
    .line 1380
    const v15, 0x3d23d70a    # 0.04f

    .line 1381
    .line 1382
    .line 1383
    const v16, -0x416b851f    # -0.29f

    .line 1384
    .line 1385
    .line 1386
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1387
    .line 1388
    .line 1389
    const v0, -0x4087ae14    # -0.97f

    .line 1390
    .line 1391
    .line 1392
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1393
    .line 1394
    .line 1395
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1396
    .line 1397
    .line 1398
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1399
    .line 1400
    .line 1401
    move-result-object v2

    .line 1402
    const/16 v16, 0x3800

    .line 1403
    .line 1404
    const/16 v17, 0x0

    .line 1405
    .line 1406
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1407
    .line 1408
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1409
    .line 1410
    const/4 v7, 0x0

    .line 1411
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1412
    .line 1413
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1414
    .line 1415
    const/4 v13, 0x0

    .line 1416
    const/4 v14, 0x0

    .line 1417
    const/4 v15, 0x0

    .line 1418
    const-string v4, ""

    .line 1419
    .line 1420
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1421
    .line 1422
    .line 1423
    move-result-object v0

    .line 1424
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1425
    .line 1426
    .line 1427
    move-result-object v0

    .line 1428
    sput-object v0, Landroidx/compose/material/icons/twotone/Replay30Kt;->_replay30:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1429
    .line 1430
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1431
    .line 1432
    .line 1433
    return-object v0
.end method
