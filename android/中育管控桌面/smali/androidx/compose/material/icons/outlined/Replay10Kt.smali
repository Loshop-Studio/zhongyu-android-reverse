.class public final Landroidx/compose/material/icons/outlined/Replay10Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_replay10",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Replay10",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getReplay10",
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
        "SMAP\nReplay10.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Replay10.kt\nandroidx/compose/material/icons/outlined/Replay10Kt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,99:1\n212#2,12:100\n233#2,18:113\n253#2:150\n174#3:112\n705#4,2:131\n717#4,2:133\n719#4,11:139\n72#5,4:135\n*S KotlinDebug\n*F\n+ 1 Replay10.kt\nandroidx/compose/material/icons/outlined/Replay10Kt\n*L\n29#1:100,12\n30#1:113,18\n30#1:150\n29#1:112\n30#1:131,2\n30#1:133,2\n30#1:139,11\n30#1:135,4\n*E\n"
    }
.end annotation


# static fields
.field private static _replay10:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getReplay10(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/Replay10Kt;->_replay10:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Replay10"

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
    const v0, 0x413fd70a    # 11.99f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x40a00000    # 5.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v0, 0x3f800000    # 1.0f

    .line 79
    .line 80
    const v2, 0x413fd70a    # 11.99f

    .line 81
    .line 82
    .line 83
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const/high16 v0, -0x3f600000    # -5.0f

    .line 87
    .line 88
    const/high16 v2, 0x40a00000    # 5.0f

    .line 89
    .line 90
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v0, 0x40a00000    # 5.0f

    .line 94
    .line 95
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v0, 0x40e00000    # 7.0f

    .line 99
    .line 100
    const v2, 0x413fd70a    # 11.99f

    .line 101
    .line 102
    .line 103
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v17, 0x40c00000    # 6.0f

    .line 107
    .line 108
    const/high16 v18, 0x40c00000    # 6.0f

    .line 109
    .line 110
    const v13, 0x4053d70a    # 3.31f

    .line 111
    .line 112
    .line 113
    const/4 v14, 0x0

    .line 114
    const/high16 v15, 0x40c00000    # 6.0f

    .line 115
    .line 116
    const v16, 0x402c28f6    # 2.69f

    .line 117
    .line 118
    .line 119
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v0, 0x40c00000    # 6.0f

    .line 123
    .line 124
    const v2, -0x3fd3d70a    # -2.69f

    .line 125
    .line 126
    .line 127
    const/high16 v4, -0x3f400000    # -6.0f

    .line 128
    .line 129
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v0, -0x3fd3d70a    # -2.69f

    .line 133
    .line 134
    .line 135
    const/high16 v2, -0x3f400000    # -6.0f

    .line 136
    .line 137
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v0, -0x40000000    # -2.0f

    .line 141
    .line 142
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const/high16 v17, 0x41000000    # 8.0f

    .line 146
    .line 147
    const/high16 v18, 0x41000000    # 8.0f

    .line 148
    .line 149
    const/4 v13, 0x0

    .line 150
    const v14, 0x408d70a4    # 4.42f

    .line 151
    .line 152
    .line 153
    const v15, 0x40651eb8    # 3.58f

    .line 154
    .line 155
    .line 156
    const/high16 v16, 0x41000000    # 8.0f

    .line 157
    .line 158
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const v0, -0x3f9ae148    # -3.58f

    .line 162
    .line 163
    .line 164
    const/high16 v2, 0x41000000    # 8.0f

    .line 165
    .line 166
    const/high16 v4, -0x3f000000    # -8.0f

    .line 167
    .line 168
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v2, -0x3f000000    # -8.0f

    .line 172
    .line 173
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v0, 0x412e3d71    # 10.89f

    .line 180
    .line 181
    .line 182
    const/high16 v2, 0x41800000    # 16.0f

    .line 183
    .line 184
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v0, -0x40a66666    # -0.85f

    .line 188
    .line 189
    .line 190
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v0, -0x3faf5c29    # -3.26f

    .line 194
    .line 195
    .line 196
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v0, -0x407eb852    # -1.01f

    .line 200
    .line 201
    .line 202
    const v2, 0x3e9eb852    # 0.31f

    .line 203
    .line 204
    .line 205
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const v0, -0x40cf5c29    # -0.69f

    .line 209
    .line 210
    .line 211
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v0, 0x3fe28f5c    # 1.77f

    .line 215
    .line 216
    .line 217
    const v2, -0x40deb852    # -0.63f

    .line 218
    .line 219
    .line 220
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const v0, 0x3db851ec    # 0.09f

    .line 224
    .line 225
    .line 226
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v0, 0x412e3d71    # 10.89f

    .line 230
    .line 231
    .line 232
    const/high16 v2, 0x41800000    # 16.0f

    .line 233
    .line 234
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v0, 0x4172b852    # 15.17f

    .line 241
    .line 242
    .line 243
    const v2, 0x4163d70a    # 14.24f

    .line 244
    .line 245
    .line 246
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v17, -0x42333333    # -0.1f

    .line 250
    .line 251
    .line 252
    const v18, 0x3f51eb85    # 0.82f

    .line 253
    .line 254
    .line 255
    const v14, 0x3ea3d70a    # 0.32f

    .line 256
    .line 257
    .line 258
    const v15, -0x430a3d71    # -0.03f

    .line 259
    .line 260
    .line 261
    const v16, 0x3f19999a    # 0.6f

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v0, -0x416b851f    # -0.29f

    .line 268
    .line 269
    .line 270
    const v2, 0x3f11eb85    # 0.57f

    .line 271
    .line 272
    .line 273
    const v4, -0x41d1eb85    # -0.17f

    .line 274
    .line 275
    .line 276
    const v6, 0x3ed70a3d    # 0.42f

    .line 277
    .line 278
    .line 279
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v0, 0x3e851eb8    # 0.26f

    .line 283
    .line 284
    .line 285
    const v2, -0x4119999a    # -0.45f

    .line 286
    .line 287
    .line 288
    const v4, 0x3ea8f5c3    # 0.33f

    .line 289
    .line 290
    .line 291
    const v6, -0x4170a3d7    # -0.28f

    .line 292
    .line 293
    .line 294
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v0, -0x41428f5c    # -0.37f

    .line 298
    .line 299
    .line 300
    const v2, -0x40e8f5c3    # -0.59f

    .line 301
    .line 302
    .line 303
    const v4, 0x3dcccccd    # 0.1f

    .line 304
    .line 305
    .line 306
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v0, -0x430a3d71    # -0.03f

    .line 310
    .line 311
    .line 312
    const v4, -0x42333333    # -0.1f

    .line 313
    .line 314
    .line 315
    const v6, -0x412e147b    # -0.41f

    .line 316
    .line 317
    .line 318
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v0, -0x41c7ae14    # -0.18f

    .line 322
    .line 323
    .line 324
    const v2, -0x41147ae1    # -0.46f

    .line 325
    .line 326
    .line 327
    const v4, -0x41570a3d    # -0.33f

    .line 328
    .line 329
    .line 330
    invoke-virtual {v12, v4, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v0, -0x41666666    # -0.3f

    .line 334
    .line 335
    .line 336
    const v2, -0x40ee147b    # -0.57f

    .line 337
    .line 338
    .line 339
    const v4, -0x41947ae1    # -0.23f

    .line 340
    .line 341
    .line 342
    const v6, -0x4151eb85    # -0.34f

    .line 343
    .line 344
    .line 345
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const/high16 v0, -0x41000000    # -0.5f

    .line 349
    .line 350
    const v2, -0x40ae147b    # -0.82f

    .line 351
    .line 352
    .line 353
    const v4, -0x421eb852    # -0.11f

    .line 354
    .line 355
    .line 356
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v0, -0x40c28f5c    # -0.74f

    .line 360
    .line 361
    .line 362
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v17, 0x3dcccccd    # 0.1f

    .line 366
    .line 367
    .line 368
    const v18, -0x40ae147b    # -0.82f

    .line 369
    .line 370
    .line 371
    const v14, -0x415c28f6    # -0.32f

    .line 372
    .line 373
    .line 374
    const v15, 0x3cf5c28f    # 0.03f

    .line 375
    .line 376
    .line 377
    const v16, -0x40e66666    # -0.6f

    .line 378
    .line 379
    .line 380
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v0, 0x3e947ae1    # 0.29f

    .line 384
    .line 385
    .line 386
    const v2, -0x40ee147b    # -0.57f

    .line 387
    .line 388
    .line 389
    const v4, 0x3e2e147b    # 0.17f

    .line 390
    .line 391
    .line 392
    const v6, -0x4128f5c3    # -0.42f

    .line 393
    .line 394
    .line 395
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v0, -0x417ae148    # -0.26f

    .line 399
    .line 400
    .line 401
    const v2, 0x3ee66666    # 0.45f

    .line 402
    .line 403
    .line 404
    const v4, -0x41570a3d    # -0.33f

    .line 405
    .line 406
    .line 407
    const v6, 0x3e8f5c29    # 0.28f

    .line 408
    .line 409
    .line 410
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v0, 0x3ebd70a4    # 0.37f

    .line 414
    .line 415
    .line 416
    const v2, 0x3f170a3d    # 0.59f

    .line 417
    .line 418
    .line 419
    const v4, -0x42333333    # -0.1f

    .line 420
    .line 421
    .line 422
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const v0, 0x3cf5c28f    # 0.03f

    .line 426
    .line 427
    .line 428
    const v4, 0x3dcccccd    # 0.1f

    .line 429
    .line 430
    .line 431
    const v6, 0x3ed1eb85    # 0.41f

    .line 432
    .line 433
    .line 434
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const v0, 0x3eeb851f    # 0.46f

    .line 438
    .line 439
    .line 440
    const v2, 0x3e3851ec    # 0.18f

    .line 441
    .line 442
    .line 443
    const v4, 0x3ea8f5c3    # 0.33f

    .line 444
    .line 445
    .line 446
    invoke-virtual {v12, v4, v2, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v0, 0x3e99999a    # 0.3f

    .line 450
    .line 451
    .line 452
    const v2, 0x3f11eb85    # 0.57f

    .line 453
    .line 454
    .line 455
    const v4, 0x3e6b851f    # 0.23f

    .line 456
    .line 457
    .line 458
    const v6, 0x3eae147b    # 0.34f

    .line 459
    .line 460
    .line 461
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const/high16 v0, 0x3f000000    # 0.5f

    .line 465
    .line 466
    const v2, 0x3f51eb85    # 0.82f

    .line 467
    .line 468
    .line 469
    const v4, 0x3de147ae    # 0.11f

    .line 470
    .line 471
    .line 472
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const v0, 0x3f3d70a4    # 0.74f

    .line 476
    .line 477
    .line 478
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const v0, 0x41651eb8    # 14.32f

    .line 485
    .line 486
    .line 487
    const v2, 0x4156147b    # 13.38f

    .line 488
    .line 489
    .line 490
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const v17, -0x42dc28f6    # -0.04f

    .line 494
    .line 495
    .line 496
    const v18, -0x410a3d71    # -0.48f

    .line 497
    .line 498
    .line 499
    const v14, -0x41bd70a4    # -0.19f

    .line 500
    .line 501
    .line 502
    const v15, -0x43dc28f6    # -0.01f

    .line 503
    .line 504
    .line 505
    const v16, -0x414ccccd    # -0.35f

    .line 506
    .line 507
    .line 508
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const v0, -0x420a3d71    # -0.12f

    .line 512
    .line 513
    .line 514
    const v2, -0x416147ae    # -0.31f

    .line 515
    .line 516
    .line 517
    const v4, -0x4270a3d7    # -0.07f

    .line 518
    .line 519
    .line 520
    const v6, -0x41947ae1    # -0.23f

    .line 521
    .line 522
    .line 523
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const v0, -0x41f0a3d7    # -0.14f

    .line 527
    .line 528
    .line 529
    const v2, -0x41bd70a4    # -0.19f

    .line 530
    .line 531
    .line 532
    const v4, -0x421eb852    # -0.11f

    .line 533
    .line 534
    .line 535
    const v6, -0x41d1eb85    # -0.17f

    .line 536
    .line 537
    .line 538
    invoke-virtual {v12, v4, v0, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const v0, -0x41dc28f6    # -0.16f

    .line 542
    .line 543
    .line 544
    const/high16 v2, -0x41800000    # -0.25f

    .line 545
    .line 546
    const v4, -0x42b33333    # -0.05f

    .line 547
    .line 548
    .line 549
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const v0, 0x3ca3d70a    # 0.02f

    .line 553
    .line 554
    .line 555
    const v4, 0x3d4ccccd    # 0.05f

    .line 556
    .line 557
    .line 558
    const v6, -0x41c7ae14    # -0.18f

    .line 559
    .line 560
    .line 561
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const v0, -0x41f0a3d7    # -0.14f

    .line 565
    .line 566
    .line 567
    const v2, -0x41bd70a4    # -0.19f

    .line 568
    .line 569
    .line 570
    const v4, 0x3e2e147b    # 0.17f

    .line 571
    .line 572
    .line 573
    const v6, 0x3db851ec    # 0.09f

    .line 574
    .line 575
    .line 576
    invoke-virtual {v12, v0, v6, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const v0, -0x420a3d71    # -0.12f

    .line 580
    .line 581
    .line 582
    const v2, 0x3e9eb852    # 0.31f

    .line 583
    .line 584
    .line 585
    const v4, 0x3e3851ec    # 0.18f

    .line 586
    .line 587
    .line 588
    const v6, -0x4247ae14    # -0.09f

    .line 589
    .line 590
    .line 591
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const v0, -0x42dc28f6    # -0.04f

    .line 595
    .line 596
    .line 597
    const v2, 0x3ef5c28f    # 0.48f

    .line 598
    .line 599
    .line 600
    const v4, -0x42dc28f6    # -0.04f

    .line 601
    .line 602
    .line 603
    const v6, 0x3e947ae1    # 0.29f

    .line 604
    .line 605
    .line 606
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const v0, 0x3f7851ec    # 0.97f

    .line 610
    .line 611
    .line 612
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const v17, 0x3d23d70a    # 0.04f

    .line 616
    .line 617
    .line 618
    const v18, 0x3ef5c28f    # 0.48f

    .line 619
    .line 620
    .line 621
    const v14, 0x3e428f5c    # 0.19f

    .line 622
    .line 623
    .line 624
    const v15, 0x3c23d70a    # 0.01f

    .line 625
    .line 626
    .line 627
    const v16, 0x3eb33333    # 0.35f

    .line 628
    .line 629
    .line 630
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const v0, 0x3df5c28f    # 0.12f

    .line 634
    .line 635
    .line 636
    const v2, 0x3ea3d70a    # 0.32f

    .line 637
    .line 638
    .line 639
    const v4, 0x3d8f5c29    # 0.07f

    .line 640
    .line 641
    .line 642
    const v6, 0x3e75c28f    # 0.24f

    .line 643
    .line 644
    .line 645
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    const v0, 0x3e0f5c29    # 0.14f

    .line 649
    .line 650
    .line 651
    const v2, 0x3e428f5c    # 0.19f

    .line 652
    .line 653
    .line 654
    const v4, 0x3e2e147b    # 0.17f

    .line 655
    .line 656
    .line 657
    const v6, 0x3de147ae    # 0.11f

    .line 658
    .line 659
    .line 660
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    const v0, 0x3e23d70a    # 0.16f

    .line 664
    .line 665
    .line 666
    const/high16 v2, 0x3e800000    # 0.25f

    .line 667
    .line 668
    const v4, 0x3d4ccccd    # 0.05f

    .line 669
    .line 670
    .line 671
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    const v0, -0x435c28f6    # -0.02f

    .line 675
    .line 676
    .line 677
    const v4, -0x42b33333    # -0.05f

    .line 678
    .line 679
    .line 680
    const v6, 0x3e3851ec    # 0.18f

    .line 681
    .line 682
    .line 683
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 684
    .line 685
    .line 686
    const v0, -0x4247ae14    # -0.09f

    .line 687
    .line 688
    .line 689
    const v2, 0x3e428f5c    # 0.19f

    .line 690
    .line 691
    .line 692
    const v4, -0x41d1eb85    # -0.17f

    .line 693
    .line 694
    .line 695
    const v6, 0x3e0f5c29    # 0.14f

    .line 696
    .line 697
    .line 698
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    const v0, -0x415c28f6    # -0.32f

    .line 702
    .line 703
    .line 704
    const v2, -0x41bd70a4    # -0.19f

    .line 705
    .line 706
    .line 707
    const v4, 0x3db851ec    # 0.09f

    .line 708
    .line 709
    .line 710
    const v6, 0x3de147ae    # 0.11f

    .line 711
    .line 712
    .line 713
    invoke-virtual {v12, v4, v2, v6, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 714
    .line 715
    .line 716
    const v0, 0x3d23d70a    # 0.04f

    .line 717
    .line 718
    .line 719
    const v2, -0x410a3d71    # -0.48f

    .line 720
    .line 721
    .line 722
    const v4, 0x3d23d70a    # 0.04f

    .line 723
    .line 724
    .line 725
    const v6, -0x416b851f    # -0.29f

    .line 726
    .line 727
    .line 728
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    const v0, -0x4087ae14    # -0.97f

    .line 732
    .line 733
    .line 734
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 735
    .line 736
    .line 737
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 741
    .line 742
    .line 743
    move-result-object v2

    .line 744
    const/16 v16, 0x3800

    .line 745
    .line 746
    const/16 v17, 0x0

    .line 747
    .line 748
    const/high16 v6, 0x3f800000    # 1.0f

    .line 749
    .line 750
    const/high16 v8, 0x3f800000    # 1.0f

    .line 751
    .line 752
    const/4 v7, 0x0

    .line 753
    const/high16 v9, 0x3f800000    # 1.0f

    .line 754
    .line 755
    const/high16 v12, 0x3f800000    # 1.0f

    .line 756
    .line 757
    const/4 v14, 0x0

    .line 758
    const/4 v15, 0x0

    .line 759
    const-string v4, ""

    .line 760
    .line 761
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 762
    .line 763
    .line 764
    move-result-object v0

    .line 765
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 766
    .line 767
    .line 768
    move-result-object v0

    .line 769
    sput-object v0, Landroidx/compose/material/icons/outlined/Replay10Kt;->_replay10:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 770
    .line 771
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 772
    .line 773
    .line 774
    return-object v0
.end method
