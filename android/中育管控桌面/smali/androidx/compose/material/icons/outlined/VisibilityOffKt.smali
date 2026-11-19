.class public final Landroidx/compose/material/icons/outlined/VisibilityOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_visibilityOff",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "VisibilityOff",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getVisibilityOff",
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
        "SMAP\nVisibilityOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VisibilityOff.kt\nandroidx/compose/material/icons/outlined/VisibilityOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,81:1\n212#2,12:82\n233#2,18:95\n253#2:132\n174#3:94\n705#4,2:113\n717#4,2:115\n719#4,11:121\n72#5,4:117\n*S KotlinDebug\n*F\n+ 1 VisibilityOff.kt\nandroidx/compose/material/icons/outlined/VisibilityOffKt\n*L\n29#1:82,12\n30#1:95,18\n30#1:132\n29#1:94\n30#1:113,2\n30#1:115,2\n30#1:121,11\n30#1:117,4\n*E\n"
    }
.end annotation


# static fields
.field private static _visibilityOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getVisibilityOff(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/VisibilityOffKt;->_visibilityOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.VisibilityOff"

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
    const/high16 v2, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, 0x410d1eb8    # 8.82f

    .line 78
    .line 79
    .line 80
    const/high16 v18, 0x40b00000    # 5.5f

    .line 81
    .line 82
    const v13, 0x40728f5c    # 3.79f

    .line 83
    .line 84
    .line 85
    const/4 v14, 0x0

    .line 86
    const v15, 0x40e570a4    # 7.17f

    .line 87
    .line 88
    .line 89
    const v16, 0x400851ec    # 2.13f

    .line 90
    .line 91
    .line 92
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const v17, -0x3fe5c28f    # -2.41f

    .line 96
    .line 97
    .line 98
    const v18, 0x4047ae14    # 3.12f

    .line 99
    .line 100
    .line 101
    const v13, -0x40e8f5c3    # -0.59f

    .line 102
    .line 103
    .line 104
    const v14, 0x3f9c28f6    # 1.22f

    .line 105
    .line 106
    .line 107
    const v15, -0x404a3d71    # -1.42f

    .line 108
    .line 109
    .line 110
    const v16, 0x401147ae    # 2.27f

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v0, 0x3fb47ae1    # 1.41f

    .line 117
    .line 118
    .line 119
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const v17, 0x404b851f    # 3.18f

    .line 123
    .line 124
    .line 125
    const v18, -0x3f6f0a3d    # -4.53f

    .line 126
    .line 127
    .line 128
    const v13, 0x3fb1eb85    # 1.39f

    .line 129
    .line 130
    .line 131
    const v14, -0x40628f5c    # -1.23f

    .line 132
    .line 133
    .line 134
    const v15, 0x401f5c29    # 2.49f

    .line 135
    .line 136
    .line 137
    const v16, -0x3fceb852    # -2.77f

    .line 138
    .line 139
    .line 140
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v17, 0x41400000    # 12.0f

    .line 144
    .line 145
    const/high16 v18, 0x40800000    # 4.0f

    .line 146
    .line 147
    const v13, 0x41aa28f6    # 21.27f

    .line 148
    .line 149
    .line 150
    const v14, 0x40e3851f    # 7.11f

    .line 151
    .line 152
    .line 153
    const/high16 v15, 0x41880000    # 17.0f

    .line 154
    .line 155
    const/high16 v16, 0x40800000    # 4.0f

    .line 156
    .line 157
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v17, -0x3f970a3d    # -3.64f

    .line 161
    .line 162
    .line 163
    const v18, 0x3f11eb85    # 0.57f

    .line 164
    .line 165
    .line 166
    const v13, -0x405d70a4    # -1.27f

    .line 167
    .line 168
    .line 169
    const/4 v14, 0x0

    .line 170
    const v15, -0x3fe0a3d7    # -2.49f

    .line 171
    .line 172
    .line 173
    const v16, 0x3e4ccccd    # 0.2f

    .line 174
    .line 175
    .line 176
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v0, 0x3fd33333    # 1.65f

    .line 180
    .line 181
    .line 182
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const/high16 v17, 0x41400000    # 12.0f

    .line 186
    .line 187
    const/high16 v18, 0x40c00000    # 6.0f

    .line 188
    .line 189
    const v13, 0x412a8f5c    # 10.66f

    .line 190
    .line 191
    .line 192
    const v14, 0x40c2e148    # 6.09f

    .line 193
    .line 194
    .line 195
    const v15, 0x41351eb8    # 11.32f

    .line 196
    .line 197
    .line 198
    const/high16 v16, 0x40c00000    # 6.0f

    .line 199
    .line 200
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const v0, 0x412ee148    # 10.93f

    .line 207
    .line 208
    .line 209
    const v2, 0x40e47ae1    # 7.14f

    .line 210
    .line 211
    .line 212
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v0, 0x41500000    # 13.0f

    .line 216
    .line 217
    const v2, 0x41135c29    # 9.21f

    .line 218
    .line 219
    .line 220
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const v17, 0x3fa3d70a    # 1.28f

    .line 224
    .line 225
    .line 226
    const v18, 0x3fa3d70a    # 1.28f

    .line 227
    .line 228
    .line 229
    const v13, 0x3f11eb85    # 0.57f

    .line 230
    .line 231
    .line 232
    const/high16 v14, 0x3e800000    # 0.25f

    .line 233
    .line 234
    const v15, 0x3f83d70a    # 1.03f

    .line 235
    .line 236
    .line 237
    const v16, 0x3f35c28f    # 0.71f

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v0, 0x40047ae1    # 2.07f

    .line 244
    .line 245
    .line 246
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v17, 0x3e0f5c29    # 0.14f

    .line 250
    .line 251
    .line 252
    const v18, -0x40770a3d    # -1.07f

    .line 253
    .line 254
    .line 255
    const v13, 0x3da3d70a    # 0.08f

    .line 256
    .line 257
    .line 258
    const v14, -0x4151eb85    # -0.34f

    .line 259
    .line 260
    .line 261
    const v15, 0x3e0f5c29    # 0.14f

    .line 262
    .line 263
    .line 264
    const v16, -0x40cccccd    # -0.7f

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v17, 0x41400000    # 12.0f

    .line 271
    .line 272
    const/high16 v18, 0x40e00000    # 7.0f

    .line 273
    .line 274
    const/high16 v13, 0x41840000    # 16.5f

    .line 275
    .line 276
    const v14, 0x411028f6    # 9.01f

    .line 277
    .line 278
    .line 279
    const v15, 0x4167ae14    # 14.48f

    .line 280
    .line 281
    .line 282
    const/high16 v16, 0x40e00000    # 7.0f

    .line 283
    .line 284
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const v17, -0x40770a3d    # -1.07f

    .line 288
    .line 289
    .line 290
    const v18, 0x3e0f5c29    # 0.14f

    .line 291
    .line 292
    .line 293
    const v13, -0x41428f5c    # -0.37f

    .line 294
    .line 295
    .line 296
    const/4 v14, 0x0

    .line 297
    const v15, -0x40c7ae14    # -0.72f

    .line 298
    .line 299
    .line 300
    const v16, 0x3d4ccccd    # 0.05f

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v0, 0x4077ae14    # 3.87f

    .line 310
    .line 311
    .line 312
    const v2, 0x4000a3d7    # 2.01f

    .line 313
    .line 314
    .line 315
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v0, 0x402b851f    # 2.68f

    .line 319
    .line 320
    .line 321
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const/high16 v17, 0x3f800000    # 1.0f

    .line 325
    .line 326
    const/high16 v18, 0x41380000    # 11.5f

    .line 327
    .line 328
    const v13, 0x4043d70a    # 3.06f

    .line 329
    .line 330
    .line 331
    const v14, 0x40fa8f5c    # 7.83f

    .line 332
    .line 333
    .line 334
    const v15, 0x3fe28f5c    # 1.77f

    .line 335
    .line 336
    .line 337
    const v16, 0x41187ae1    # 9.53f

    .line 338
    .line 339
    .line 340
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const/high16 v17, 0x41400000    # 12.0f

    .line 344
    .line 345
    const/high16 v18, 0x41980000    # 19.0f

    .line 346
    .line 347
    const v13, 0x402eb852    # 2.73f

    .line 348
    .line 349
    .line 350
    const v14, 0x417e3d71    # 15.89f

    .line 351
    .line 352
    .line 353
    const/high16 v15, 0x40e00000    # 7.0f

    .line 354
    .line 355
    const/high16 v16, 0x41980000    # 19.0f

    .line 356
    .line 357
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v17, 0x408a3d71    # 4.32f

    .line 361
    .line 362
    .line 363
    const v18, -0x40ae147b    # -0.82f

    .line 364
    .line 365
    .line 366
    const v13, 0x3fc28f5c    # 1.52f

    .line 367
    .line 368
    .line 369
    const/4 v14, 0x0

    .line 370
    const v15, 0x403eb852    # 2.98f

    .line 371
    .line 372
    .line 373
    const v16, -0x416b851f    # -0.29f

    .line 374
    .line 375
    .line 376
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v0, 0x405ae148    # 3.42f

    .line 380
    .line 381
    .line 382
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const v0, -0x404b851f    # -1.41f

    .line 386
    .line 387
    .line 388
    const v2, 0x3fb47ae1    # 1.41f

    .line 389
    .line 390
    .line 391
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const v0, 0x401ccccd    # 2.45f

    .line 395
    .line 396
    .line 397
    const v2, 0x405ae148    # 3.42f

    .line 398
    .line 399
    .line 400
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const v0, 0x4077ae14    # 3.87f

    .line 404
    .line 405
    .line 406
    const v2, 0x4000a3d7    # 2.01f

    .line 407
    .line 408
    .line 409
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v0, 0x411828f6    # 9.51f

    .line 416
    .line 417
    .line 418
    const v2, 0x4135eb85    # 11.37f

    .line 419
    .line 420
    .line 421
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v0, 0x40270a3d    # 2.61f

    .line 425
    .line 426
    .line 427
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v17, -0x420a3d71    # -0.12f

    .line 431
    .line 432
    .line 433
    const v18, 0x3ca3d70a    # 0.02f

    .line 434
    .line 435
    .line 436
    const v13, -0x42dc28f6    # -0.04f

    .line 437
    .line 438
    .line 439
    const v14, 0x3c23d70a    # 0.01f

    .line 440
    .line 441
    .line 442
    const v15, -0x425c28f6    # -0.08f

    .line 443
    .line 444
    .line 445
    const v16, 0x3ca3d70a    # 0.02f

    .line 446
    .line 447
    .line 448
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 452
    .line 453
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 454
    .line 455
    const v13, -0x404f5c29    # -1.38f

    .line 456
    .line 457
    .line 458
    const/4 v14, 0x0

    .line 459
    const/high16 v15, -0x3fe00000    # -2.5f

    .line 460
    .line 461
    const v16, -0x4070a3d7    # -1.12f

    .line 462
    .line 463
    .line 464
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const v17, 0x3c23d70a    # 0.01f

    .line 468
    .line 469
    .line 470
    const v18, -0x41fae148    # -0.13f

    .line 471
    .line 472
    .line 473
    const/4 v13, 0x0

    .line 474
    const v14, -0x42b33333    # -0.05f

    .line 475
    .line 476
    .line 477
    const v15, 0x3c23d70a    # 0.01f

    .line 478
    .line 479
    .line 480
    const v16, -0x425c28f6    # -0.08f

    .line 481
    .line 482
    .line 483
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const v0, 0x40c3851f    # 6.11f

    .line 490
    .line 491
    .line 492
    const v2, 0x40ff0a3d    # 7.97f

    .line 493
    .line 494
    .line 495
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const/high16 v0, 0x3fe00000    # 1.75f

    .line 499
    .line 500
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const v17, -0x4147ae14    # -0.36f

    .line 504
    .line 505
    .line 506
    const v18, 0x3fe3d70a    # 1.78f

    .line 507
    .line 508
    .line 509
    const v13, -0x41947ae1    # -0.23f

    .line 510
    .line 511
    .line 512
    const v14, 0x3f0ccccd    # 0.55f

    .line 513
    .line 514
    .line 515
    const v15, -0x4147ae14    # -0.36f

    .line 516
    .line 517
    .line 518
    const v16, 0x3f933333    # 1.15f

    .line 519
    .line 520
    .line 521
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const/high16 v17, 0x40900000    # 4.5f

    .line 525
    .line 526
    const/high16 v18, 0x40900000    # 4.5f

    .line 527
    .line 528
    const/4 v13, 0x0

    .line 529
    const v14, 0x401eb852    # 2.48f

    .line 530
    .line 531
    .line 532
    const v15, 0x400147ae    # 2.02f

    .line 533
    .line 534
    .line 535
    const/high16 v16, 0x40900000    # 4.5f

    .line 536
    .line 537
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const v17, 0x3fe28f5c    # 1.77f

    .line 541
    .line 542
    .line 543
    const v18, -0x4147ae14    # -0.36f

    .line 544
    .line 545
    .line 546
    const v13, 0x3f2147ae    # 0.63f

    .line 547
    .line 548
    .line 549
    const/4 v14, 0x0

    .line 550
    const v15, 0x3f9d70a4    # 1.23f

    .line 551
    .line 552
    .line 553
    const v16, -0x41fae148    # -0.13f

    .line 554
    .line 555
    .line 556
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const v0, 0x3f7ae148    # 0.98f

    .line 560
    .line 561
    .line 562
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const/high16 v17, -0x3fd00000    # -2.75f

    .line 566
    .line 567
    const v18, 0x3ec28f5c    # 0.38f

    .line 568
    .line 569
    .line 570
    const v13, -0x409eb852    # -0.88f

    .line 571
    .line 572
    .line 573
    const v14, 0x3e75c28f    # 0.24f

    .line 574
    .line 575
    .line 576
    const v15, -0x4019999a    # -1.8f

    .line 577
    .line 578
    .line 579
    const v16, 0x3ec28f5c    # 0.38f

    .line 580
    .line 581
    .line 582
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const v17, -0x3ef2e148    # -8.82f

    .line 586
    .line 587
    .line 588
    const/high16 v18, -0x3f500000    # -5.5f

    .line 589
    .line 590
    const v13, -0x3f8d70a4    # -3.79f

    .line 591
    .line 592
    .line 593
    const/4 v14, 0x0

    .line 594
    const v15, -0x3f1a8f5c    # -7.17f

    .line 595
    .line 596
    .line 597
    const v16, -0x3ff7ae14    # -2.13f

    .line 598
    .line 599
    .line 600
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const v17, 0x403b851f    # 2.93f

    .line 604
    .line 605
    .line 606
    const v18, -0x3f9e147b    # -3.53f

    .line 607
    .line 608
    .line 609
    const v13, 0x3f333333    # 0.7f

    .line 610
    .line 611
    .line 612
    const v14, -0x4048f5c3    # -1.43f

    .line 613
    .line 614
    .line 615
    const v15, 0x3fdc28f6    # 1.72f

    .line 616
    .line 617
    .line 618
    const v16, -0x3fd8f5c3    # -2.61f

    .line 619
    .line 620
    .line 621
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 628
    .line 629
    .line 630
    move-result-object v2

    .line 631
    const/16 v16, 0x3800

    .line 632
    .line 633
    const/16 v17, 0x0

    .line 634
    .line 635
    const/high16 v6, 0x3f800000    # 1.0f

    .line 636
    .line 637
    const/high16 v8, 0x3f800000    # 1.0f

    .line 638
    .line 639
    const/4 v7, 0x0

    .line 640
    const/high16 v9, 0x3f800000    # 1.0f

    .line 641
    .line 642
    const/high16 v12, 0x3f800000    # 1.0f

    .line 643
    .line 644
    const/4 v13, 0x0

    .line 645
    const/4 v14, 0x0

    .line 646
    const/4 v15, 0x0

    .line 647
    const-string v4, ""

    .line 648
    .line 649
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 650
    .line 651
    .line 652
    move-result-object v0

    .line 653
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 654
    .line 655
    .line 656
    move-result-object v0

    .line 657
    sput-object v0, Landroidx/compose/material/icons/outlined/VisibilityOffKt;->_visibilityOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 658
    .line 659
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 660
    .line 661
    .line 662
    return-object v0
.end method
