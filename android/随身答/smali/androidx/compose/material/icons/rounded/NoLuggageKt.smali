.class public final Landroidx/compose/material/icons/rounded/NoLuggageKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_noLuggage",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "NoLuggage",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getNoLuggage",
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
        "SMAP\nNoLuggage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NoLuggage.kt\nandroidx/compose/material/icons/rounded/NoLuggageKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,96:1\n212#2,12:97\n233#2,18:110\n253#2:147\n174#3:109\n705#4,2:128\n717#4,2:130\n719#4,11:136\n72#5,4:132\n*S KotlinDebug\n*F\n+ 1 NoLuggage.kt\nandroidx/compose/material/icons/rounded/NoLuggageKt\n*L\n29#1:97,12\n30#1:110,18\n30#1:147\n29#1:109\n30#1:128,2\n30#1:130,2\n30#1:136,11\n30#1:132,4\n*E\n"
    }
.end annotation


# static fields
.field private static _noLuggage:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNoLuggage(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/NoLuggageKt;->_noLuggage:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.NoLuggage"

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
    const v0, 0x41a3eb85    # 20.49f

    .line 71
    .line 72
    .line 73
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 74
    .line 75
    .line 76
    const v0, 0x4060a3d7    # 3.51f

    .line 77
    .line 78
    .line 79
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const v17, -0x404b851f    # -1.41f

    .line 83
    .line 84
    .line 85
    const/16 v18, 0x0

    .line 86
    .line 87
    const v13, -0x413851ec    # -0.39f

    .line 88
    .line 89
    .line 90
    const v14, -0x413851ec    # -0.39f

    .line 91
    .line 92
    .line 93
    const v15, -0x407d70a4    # -1.02f

    .line 94
    .line 95
    .line 96
    const v16, -0x413851ec    # -0.39f

    .line 97
    .line 98
    .line 99
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/16 v17, 0x0

    .line 103
    .line 104
    const v18, 0x3fb47ae1    # 1.41f

    .line 105
    .line 106
    .line 107
    const v14, 0x3ec7ae14    # 0.39f

    .line 108
    .line 109
    .line 110
    const v15, -0x413851ec    # -0.39f

    .line 111
    .line 112
    .line 113
    const v16, 0x3f828f5c    # 1.02f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v0, 0x403ae148    # 2.92f

    .line 120
    .line 121
    .line 122
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v17, 0x40a00000    # 5.0f

    .line 126
    .line 127
    const/high16 v18, 0x41000000    # 8.0f

    .line 128
    .line 129
    const v13, 0x40a0a3d7    # 5.02f

    .line 130
    .line 131
    .line 132
    const v14, 0x40fccccd    # 7.9f

    .line 133
    .line 134
    .line 135
    const/high16 v15, 0x40a00000    # 5.0f

    .line 136
    .line 137
    const v16, 0x40fe6666    # 7.95f

    .line 138
    .line 139
    .line 140
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v0, 0x41300000    # 11.0f

    .line 144
    .line 145
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v17, 0x40000000    # 2.0f

    .line 149
    .line 150
    const/high16 v18, 0x40000000    # 2.0f

    .line 151
    .line 152
    const/4 v13, 0x0

    .line 153
    const v14, 0x3f8ccccd    # 1.1f

    .line 154
    .line 155
    .line 156
    const v15, 0x3f666666    # 0.9f

    .line 157
    .line 158
    .line 159
    const/high16 v16, 0x40000000    # 2.0f

    .line 160
    .line 161
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v17, 0x3f800000    # 1.0f

    .line 165
    .line 166
    const/high16 v18, 0x3f800000    # 1.0f

    .line 167
    .line 168
    const v14, 0x3f0ccccd    # 0.55f

    .line 169
    .line 170
    .line 171
    const v15, 0x3ee66666    # 0.45f

    .line 172
    .line 173
    .line 174
    const/high16 v16, 0x3f800000    # 1.0f

    .line 175
    .line 176
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v18, -0x40800000    # -1.0f

    .line 180
    .line 181
    const v13, 0x3f0ccccd    # 0.55f

    .line 182
    .line 183
    .line 184
    const/4 v14, 0x0

    .line 185
    const/high16 v15, 0x3f800000    # 1.0f

    .line 186
    .line 187
    const v16, -0x4119999a    # -0.45f

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v0, 0x40c00000    # 6.0f

    .line 194
    .line 195
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v18, 0x3f800000    # 1.0f

    .line 199
    .line 200
    const/4 v13, 0x0

    .line 201
    const v14, 0x3f0ccccd    # 0.55f

    .line 202
    .line 203
    .line 204
    const v15, 0x3ee66666    # 0.45f

    .line 205
    .line 206
    .line 207
    const/high16 v16, 0x3f800000    # 1.0f

    .line 208
    .line 209
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v18, -0x40800000    # -1.0f

    .line 213
    .line 214
    const v13, 0x3f0ccccd    # 0.55f

    .line 215
    .line 216
    .line 217
    const/4 v14, 0x0

    .line 218
    const/high16 v15, 0x3f800000    # 1.0f

    .line 219
    .line 220
    const v16, -0x4119999a    # -0.45f

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v17, 0x3f6e147b    # 0.93f

    .line 227
    .line 228
    .line 229
    const v18, -0x418a3d71    # -0.24f

    .line 230
    .line 231
    .line 232
    const v13, 0x3eae147b    # 0.34f

    .line 233
    .line 234
    .line 235
    const v15, 0x3f266666    # 0.65f

    .line 236
    .line 237
    .line 238
    const v16, -0x4247ae14    # -0.09f

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v0, 0x3f91eb85    # 1.14f

    .line 245
    .line 246
    .line 247
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v17, 0x3fb47ae1    # 1.41f

    .line 251
    .line 252
    .line 253
    const/16 v18, 0x0

    .line 254
    .line 255
    const v13, 0x3ec7ae14    # 0.39f

    .line 256
    .line 257
    .line 258
    const v14, 0x3ec7ae14    # 0.39f

    .line 259
    .line 260
    .line 261
    const v15, 0x3f828f5c    # 1.02f

    .line 262
    .line 263
    .line 264
    const v16, 0x3ec7ae14    # 0.39f

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v17, 0x41a3eb85    # 20.49f

    .line 271
    .line 272
    .line 273
    const v18, 0x41a3eb85    # 20.49f

    .line 274
    .line 275
    .line 276
    const v13, 0x41a70a3d    # 20.88f

    .line 277
    .line 278
    .line 279
    const v14, 0x41ac147b    # 21.51f

    .line 280
    .line 281
    .line 282
    const v15, 0x41a70a3d    # 20.88f

    .line 283
    .line 284
    .line 285
    const v16, 0x41a70a3d    # 20.88f

    .line 286
    .line 287
    .line 288
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v0, 0x410c0000    # 8.75f

    .line 295
    .line 296
    const/high16 v2, 0x41900000    # 18.0f

    .line 297
    .line 298
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const/high16 v17, 0x41000000    # 8.0f

    .line 302
    .line 303
    const/high16 v18, 0x418a0000    # 17.25f

    .line 304
    .line 305
    const v13, 0x410570a4    # 8.34f

    .line 306
    .line 307
    .line 308
    const/high16 v14, 0x41900000    # 18.0f

    .line 309
    .line 310
    const/high16 v15, 0x41000000    # 8.0f

    .line 311
    .line 312
    const v16, 0x418d47ae    # 17.66f

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v0, -0x3f328f5c    # -6.42f

    .line 319
    .line 320
    .line 321
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 325
    .line 326
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v0, 0x409d70a4    # 4.92f

    .line 330
    .line 331
    .line 332
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v17, 0x410c0000    # 8.75f

    .line 336
    .line 337
    const/high16 v18, 0x41900000    # 18.0f

    .line 338
    .line 339
    const/high16 v13, 0x41180000    # 9.5f

    .line 340
    .line 341
    const v14, 0x418d47ae    # 17.66f

    .line 342
    .line 343
    .line 344
    const v15, 0x41128f5c    # 9.16f

    .line 345
    .line 346
    .line 347
    const/high16 v16, 0x41900000    # 18.0f

    .line 348
    .line 349
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/high16 v0, 0x41400000    # 12.0f

    .line 356
    .line 357
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/high16 v17, -0x40c00000    # -0.75f

    .line 361
    .line 362
    const/high16 v18, -0x40c00000    # -0.75f

    .line 363
    .line 364
    const v13, -0x412e147b    # -0.41f

    .line 365
    .line 366
    .line 367
    const/4 v14, 0x0

    .line 368
    const/high16 v15, -0x40c00000    # -0.75f

    .line 369
    .line 370
    const v16, -0x4151eb85    # -0.34f

    .line 371
    .line 372
    .line 373
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const v0, -0x3fb51eb8    # -3.17f

    .line 377
    .line 378
    .line 379
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 383
    .line 384
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v0, 0x3fd5c28f    # 1.67f

    .line 388
    .line 389
    .line 390
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const/high16 v17, 0x41400000    # 12.0f

    .line 394
    .line 395
    const/high16 v18, 0x41900000    # 18.0f

    .line 396
    .line 397
    const/high16 v13, 0x414c0000    # 12.75f

    .line 398
    .line 399
    const v14, 0x418d47ae    # 17.66f

    .line 400
    .line 401
    .line 402
    const v15, 0x41468f5c    # 12.41f

    .line 403
    .line 404
    .line 405
    const/high16 v16, 0x41900000    # 18.0f

    .line 406
    .line 407
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v0, 0x41100000    # 9.0f

    .line 414
    .line 415
    const/high16 v2, 0x41400000    # 12.0f

    .line 416
    .line 417
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v17, 0x3f400000    # 0.75f

    .line 421
    .line 422
    const/high16 v18, 0x3f400000    # 0.75f

    .line 423
    .line 424
    const v13, 0x3ed1eb85    # 0.41f

    .line 425
    .line 426
    .line 427
    const/4 v14, 0x0

    .line 428
    const/high16 v15, 0x3f400000    # 0.75f

    .line 429
    .line 430
    const v16, 0x3eae147b    # 0.34f

    .line 431
    .line 432
    .line 433
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v0, 0x3e2e147b    # 0.17f

    .line 437
    .line 438
    .line 439
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const/high16 v0, 0x3fe00000    # 1.75f

    .line 443
    .line 444
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const/high16 v0, 0x411c0000    # 9.75f

    .line 448
    .line 449
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const/high16 v17, 0x41740000    # 15.25f

    .line 453
    .line 454
    const/high16 v18, 0x41100000    # 9.0f

    .line 455
    .line 456
    const/high16 v13, 0x41680000    # 14.5f

    .line 457
    .line 458
    const v14, 0x411570a4    # 9.34f

    .line 459
    .line 460
    .line 461
    const v15, 0x416d70a4    # 14.84f

    .line 462
    .line 463
    .line 464
    const/high16 v16, 0x41100000    # 9.0f

    .line 465
    .line 466
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const v0, 0x411570a4    # 9.34f

    .line 470
    .line 471
    .line 472
    const/high16 v2, 0x41800000    # 16.0f

    .line 473
    .line 474
    const/high16 v4, 0x411c0000    # 9.75f

    .line 475
    .line 476
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const v0, 0x405ae148    # 3.42f

    .line 480
    .line 481
    .line 482
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const/high16 v0, 0x40400000    # 3.0f

    .line 486
    .line 487
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v0, 0x41000000    # 8.0f

    .line 491
    .line 492
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const/high16 v17, -0x40000000    # -2.0f

    .line 496
    .line 497
    const/high16 v18, -0x40000000    # -2.0f

    .line 498
    .line 499
    const/4 v13, 0x0

    .line 500
    const v14, -0x40733333    # -1.1f

    .line 501
    .line 502
    .line 503
    const v15, -0x4099999a    # -0.9f

    .line 504
    .line 505
    .line 506
    const/high16 v16, -0x40000000    # -2.0f

    .line 507
    .line 508
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const/high16 v0, -0x40000000    # -2.0f

    .line 512
    .line 513
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const/high16 v0, 0x40400000    # 3.0f

    .line 517
    .line 518
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const/high16 v17, -0x40800000    # -1.0f

    .line 522
    .line 523
    const/high16 v18, -0x40800000    # -1.0f

    .line 524
    .line 525
    const v14, -0x40f33333    # -0.55f

    .line 526
    .line 527
    .line 528
    const v15, -0x4119999a    # -0.45f

    .line 529
    .line 530
    .line 531
    const/high16 v16, -0x40800000    # -1.0f

    .line 532
    .line 533
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const/high16 v0, -0x3f800000    # -4.0f

    .line 537
    .line 538
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const/high16 v17, 0x41100000    # 9.0f

    .line 542
    .line 543
    const/high16 v18, 0x40400000    # 3.0f

    .line 544
    .line 545
    const v13, 0x41173333    # 9.45f

    .line 546
    .line 547
    .line 548
    const/high16 v14, 0x40000000    # 2.0f

    .line 549
    .line 550
    const/high16 v15, 0x41100000    # 9.0f

    .line 551
    .line 552
    const v16, 0x401ccccd    # 2.45f

    .line 553
    .line 554
    .line 555
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const/high16 v0, 0x40400000    # 3.0f

    .line 559
    .line 560
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const v0, 0x410d47ae    # 8.83f

    .line 564
    .line 565
    .line 566
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const v0, 0x4041eb85    # 3.03f

    .line 570
    .line 571
    .line 572
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const/high16 v17, 0x41400000    # 12.0f

    .line 576
    .line 577
    const/high16 v18, 0x41100000    # 9.0f

    .line 578
    .line 579
    const v13, 0x413e8f5c    # 11.91f

    .line 580
    .line 581
    .line 582
    const v14, 0x411051ec    # 9.02f

    .line 583
    .line 584
    .line 585
    const v15, 0x413f3333    # 11.95f

    .line 586
    .line 587
    .line 588
    const/high16 v16, 0x41100000    # 9.0f

    .line 589
    .line 590
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const/high16 v0, 0x41280000    # 10.5f

    .line 597
    .line 598
    const/high16 v2, 0x40600000    # 3.5f

    .line 599
    .line 600
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const/high16 v0, 0x40400000    # 3.0f

    .line 604
    .line 605
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const/high16 v0, 0x40c00000    # 6.0f

    .line 609
    .line 610
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 614
    .line 615
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const/high16 v0, 0x40600000    # 3.5f

    .line 619
    .line 620
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 627
    .line 628
    .line 629
    move-result-object v2

    .line 630
    const/16 v16, 0x3800

    .line 631
    .line 632
    const/16 v17, 0x0

    .line 633
    .line 634
    const/high16 v6, 0x3f800000    # 1.0f

    .line 635
    .line 636
    const/high16 v8, 0x3f800000    # 1.0f

    .line 637
    .line 638
    const/4 v7, 0x0

    .line 639
    const/high16 v9, 0x3f800000    # 1.0f

    .line 640
    .line 641
    const/high16 v12, 0x3f800000    # 1.0f

    .line 642
    .line 643
    const/4 v13, 0x0

    .line 644
    const/4 v14, 0x0

    .line 645
    const/4 v15, 0x0

    .line 646
    const-string v4, ""

    .line 647
    .line 648
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 649
    .line 650
    .line 651
    move-result-object v0

    .line 652
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 653
    .line 654
    .line 655
    move-result-object v0

    .line 656
    sput-object v0, Landroidx/compose/material/icons/rounded/NoLuggageKt;->_noLuggage:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 657
    .line 658
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 659
    .line 660
    .line 661
    return-object v0
.end method
