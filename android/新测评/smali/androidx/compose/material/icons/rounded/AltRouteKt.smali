.class public final Landroidx/compose/material/icons/rounded/AltRouteKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00038FX\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "_altRoute",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "AltRoute",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getAltRoute$annotations",
        "(Landroidx/compose/material/icons/Icons$Rounded;)V",
        "getAltRoute",
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
        "SMAP\nAltRoute.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AltRoute.kt\nandroidx/compose/material/icons/rounded/AltRouteKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,85:1\n212#2,12:86\n233#2,18:99\n253#2:136\n174#3:98\n705#4,2:117\n717#4,2:119\n719#4,11:125\n72#5,4:121\n*S KotlinDebug\n*F\n+ 1 AltRoute.kt\nandroidx/compose/material/icons/rounded/AltRouteKt\n*L\n35#1:86,12\n36#1:99,18\n36#1:136\n35#1:98\n36#1:117,2\n36#1:119,2\n36#1:125,11\n36#1:121,4\n*E\n"
    }
.end annotation


# static fields
.field private static _altRoute:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAltRoute(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/AltRouteKt;->_altRoute:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.AltRoute"

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
    const v0, 0x411c7ae1    # 9.78f

    .line 71
    .line 72
    .line 73
    const v2, 0x41328f5c    # 11.16f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, -0x404a3d71    # -1.42f

    .line 80
    .line 81
    .line 82
    const v2, 0x3fb5c28f    # 1.42f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v17, -0x401ae148    # -1.79f

    .line 89
    .line 90
    .line 91
    const v18, -0x3fc3d70a    # -2.94f

    .line 92
    .line 93
    .line 94
    const v13, -0x40d1eb85    # -0.68f

    .line 95
    .line 96
    .line 97
    const v14, -0x40cf5c29    # -0.69f

    .line 98
    .line 99
    .line 100
    const v15, -0x40547ae1    # -1.34f

    .line 101
    .line 102
    .line 103
    const v16, -0x4035c28f    # -1.58f

    .line 104
    .line 105
    .line 106
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v0, -0x41051eb8    # -0.49f

    .line 110
    .line 111
    .line 112
    const v2, 0x3ff851ec    # 1.94f

    .line 113
    .line 114
    .line 115
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v17, 0x411c7ae1    # 9.78f

    .line 119
    .line 120
    .line 121
    const v18, 0x41328f5c    # 11.16f

    .line 122
    .line 123
    .line 124
    const v13, 0x410d47ae    # 8.83f

    .line 125
    .line 126
    .line 127
    const v14, 0x4120a3d7    # 10.04f

    .line 128
    .line 129
    .line 130
    const v15, 0x41147ae1    # 9.28f

    .line 131
    .line 132
    .line 133
    const v16, 0x412a6666    # 10.65f

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v0, 0x41226666    # 10.15f

    .line 143
    .line 144
    .line 145
    const v2, 0x40a4cccd    # 5.15f

    .line 146
    .line 147
    .line 148
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v0, 0x40eb3333    # 7.35f

    .line 152
    .line 153
    .line 154
    const v2, 0x40166666    # 2.35f

    .line 155
    .line 156
    .line 157
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v17, -0x40ca3d71    # -0.71f

    .line 161
    .line 162
    .line 163
    const/16 v18, 0x0

    .line 164
    .line 165
    const v13, -0x41b33333    # -0.2f

    .line 166
    .line 167
    .line 168
    const v14, -0x41b33333    # -0.2f

    .line 169
    .line 170
    .line 171
    const v15, -0x40fd70a4    # -0.51f

    .line 172
    .line 173
    .line 174
    const v16, -0x41b33333    # -0.2f

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v0, 0x40766666    # 3.85f

    .line 181
    .line 182
    .line 183
    const v2, 0x40a4cccd    # 5.15f

    .line 184
    .line 185
    .line 186
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v17, 0x4086b852    # 4.21f

    .line 190
    .line 191
    .line 192
    const/high16 v18, 0x40c00000    # 6.0f

    .line 193
    .line 194
    const v13, 0x40628f5c    # 3.54f

    .line 195
    .line 196
    .line 197
    const v14, 0x40aeb852    # 5.46f

    .line 198
    .line 199
    .line 200
    const v15, 0x4070a3d7    # 3.76f

    .line 201
    .line 202
    .line 203
    const/high16 v16, 0x40c00000    # 6.0f

    .line 204
    .line 205
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const v0, 0x3fe7ae14    # 1.81f

    .line 209
    .line 210
    .line 211
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v17, 0x40c6b852    # 6.21f

    .line 215
    .line 216
    .line 217
    const v18, 0x4102b852    # 8.17f

    .line 218
    .line 219
    .line 220
    const v13, 0x40c147ae    # 6.04f

    .line 221
    .line 222
    .line 223
    const v14, 0x40d9eb85    # 6.81f

    .line 224
    .line 225
    .line 226
    const v15, 0x40c33333    # 6.1f

    .line 227
    .line 228
    .line 229
    const v16, 0x40f147ae    # 7.54f

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v0, -0x41051eb8    # -0.49f

    .line 236
    .line 237
    .line 238
    const v2, 0x3ff851ec    # 1.94f

    .line 239
    .line 240
    .line 241
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v17, 0x410051ec    # 8.02f

    .line 245
    .line 246
    .line 247
    const/high16 v18, 0x40c00000    # 6.0f

    .line 248
    .line 249
    const v13, 0x410147ae    # 8.08f

    .line 250
    .line 251
    .line 252
    const v14, 0x40e66666    # 7.2f

    .line 253
    .line 254
    .line 255
    const v15, 0x41007ae1    # 8.03f

    .line 256
    .line 257
    .line 258
    const v16, 0x40d428f6    # 6.63f

    .line 259
    .line 260
    .line 261
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v0, 0x3fe3d70a    # 1.78f

    .line 265
    .line 266
    .line 267
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v17, 0x41226666    # 10.15f

    .line 271
    .line 272
    .line 273
    const v18, 0x40a4cccd    # 5.15f

    .line 274
    .line 275
    .line 276
    const v13, 0x4123d70a    # 10.24f

    .line 277
    .line 278
    .line 279
    const/high16 v14, 0x40c00000    # 6.0f

    .line 280
    .line 281
    const v15, 0x41275c29    # 10.46f

    .line 282
    .line 283
    .line 284
    const v16, 0x40aeb852    # 5.46f

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v0, 0x41a13333    # 20.15f

    .line 294
    .line 295
    .line 296
    const v2, 0x40a4cccd    # 5.15f

    .line 297
    .line 298
    .line 299
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v0, -0x3fcd70a4    # -2.79f

    .line 303
    .line 304
    .line 305
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v17, -0x40ca3d71    # -0.71f

    .line 309
    .line 310
    .line 311
    const/16 v18, 0x0

    .line 312
    .line 313
    const v13, -0x41b33333    # -0.2f

    .line 314
    .line 315
    .line 316
    const v14, -0x41b33333    # -0.2f

    .line 317
    .line 318
    .line 319
    const v15, -0x40fd70a4    # -0.51f

    .line 320
    .line 321
    .line 322
    const v16, -0x41b33333    # -0.2f

    .line 323
    .line 324
    .line 325
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const v0, 0x40328f5c    # 2.79f

    .line 329
    .line 330
    .line 331
    const v2, -0x3fcd70a4    # -2.79f

    .line 332
    .line 333
    .line 334
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v17, 0x41635c29    # 14.21f

    .line 338
    .line 339
    .line 340
    const/high16 v18, 0x40c00000    # 6.0f

    .line 341
    .line 342
    const v13, 0x4158a3d7    # 13.54f

    .line 343
    .line 344
    .line 345
    const v14, 0x40aeb852    # 5.46f

    .line 346
    .line 347
    .line 348
    const v15, 0x415c28f6    # 13.76f

    .line 349
    .line 350
    .line 351
    const/high16 v16, 0x40c00000    # 6.0f

    .line 352
    .line 353
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v0, 0x3fe3d70a    # 1.78f

    .line 357
    .line 358
    .line 359
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v17, -0x3fdd70a4    # -2.54f

    .line 363
    .line 364
    .line 365
    const v18, 0x40bc28f6    # 5.88f

    .line 366
    .line 367
    .line 368
    const v13, -0x42333333    # -0.1f

    .line 369
    .line 370
    .line 371
    const v14, 0x406b851f    # 3.68f

    .line 372
    .line 373
    .line 374
    const v15, -0x405c28f6    # -1.28f

    .line 375
    .line 376
    .line 377
    const/high16 v16, 0x40980000    # 4.75f

    .line 378
    .line 379
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v17, -0x40466666    # -1.45f

    .line 383
    .line 384
    .line 385
    const v18, 0x3fc66666    # 1.55f

    .line 386
    .line 387
    .line 388
    const/high16 v13, -0x41000000    # -0.5f

    .line 389
    .line 390
    const v14, 0x3ee147ae    # 0.44f

    .line 391
    .line 392
    .line 393
    const v15, -0x407eb852    # -1.01f

    .line 394
    .line 395
    .line 396
    const v16, 0x3f6b851f    # 0.92f

    .line 397
    .line 398
    .line 399
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v17, -0x406f5c29    # -1.13f

    .line 403
    .line 404
    .line 405
    const v18, -0x406147ae    # -1.24f

    .line 406
    .line 407
    .line 408
    const v13, -0x4151eb85    # -0.34f

    .line 409
    .line 410
    .line 411
    const v14, -0x41051eb8    # -0.49f

    .line 412
    .line 413
    .line 414
    const v15, -0x40c51eb8    # -0.73f

    .line 415
    .line 416
    .line 417
    const v16, -0x409eb852    # -0.88f

    .line 418
    .line 419
    .line 420
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v0, 0x41175c29    # 9.46f

    .line 424
    .line 425
    .line 426
    const v2, 0x4159999a    # 13.6f

    .line 427
    .line 428
    .line 429
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v17, 0x41300000    # 11.0f

    .line 433
    .line 434
    const/high16 v18, 0x41880000    # 17.0f

    .line 435
    .line 436
    const v13, 0x41263d71    # 10.39f

    .line 437
    .line 438
    .line 439
    const v14, 0x41673333    # 14.45f

    .line 440
    .line 441
    .line 442
    const/high16 v15, 0x41300000    # 11.0f

    .line 443
    .line 444
    const v16, 0x41723d71    # 15.14f

    .line 445
    .line 446
    .line 447
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const/16 v17, 0x0

    .line 451
    .line 452
    const/16 v18, 0x0

    .line 453
    .line 454
    const/4 v13, 0x0

    .line 455
    const/4 v14, 0x0

    .line 456
    const/4 v15, 0x0

    .line 457
    const/16 v16, 0x0

    .line 458
    .line 459
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const/4 v0, 0x0

    .line 463
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const/high16 v0, 0x40800000    # 4.0f

    .line 467
    .line 468
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const/high16 v17, 0x3f800000    # 1.0f

    .line 472
    .line 473
    const/high16 v18, 0x3f800000    # 1.0f

    .line 474
    .line 475
    const v14, 0x3f0ccccd    # 0.55f

    .line 476
    .line 477
    .line 478
    const v15, 0x3ee66666    # 0.45f

    .line 479
    .line 480
    .line 481
    const/high16 v16, 0x3f800000    # 1.0f

    .line 482
    .line 483
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const/4 v0, 0x0

    .line 487
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v18, -0x40800000    # -1.0f

    .line 491
    .line 492
    const v13, 0x3f0ccccd    # 0.55f

    .line 493
    .line 494
    .line 495
    const/4 v14, 0x0

    .line 496
    const/high16 v15, 0x3f800000    # 1.0f

    .line 497
    .line 498
    const v16, -0x4119999a    # -0.45f

    .line 499
    .line 500
    .line 501
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const/high16 v0, -0x3f800000    # -4.0f

    .line 505
    .line 506
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const/16 v17, 0x0

    .line 510
    .line 511
    const/16 v18, 0x0

    .line 512
    .line 513
    const/4 v13, 0x0

    .line 514
    const/4 v15, 0x0

    .line 515
    const/16 v16, 0x0

    .line 516
    .line 517
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const v17, 0x3fe51eb8    # 1.79f

    .line 521
    .line 522
    .line 523
    const v18, -0x3f97ae14    # -3.63f

    .line 524
    .line 525
    .line 526
    const v14, -0x3ffeb852    # -2.02f

    .line 527
    .line 528
    .line 529
    const v15, 0x3f35c28f    # 0.71f

    .line 530
    .line 531
    .line 532
    const v16, -0x3fd5c28f    # -2.66f

    .line 533
    .line 534
    .line 535
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const v17, 0x404ccccd    # 3.2f

    .line 539
    .line 540
    .line 541
    const v18, -0x3f1428f6    # -7.37f

    .line 542
    .line 543
    .line 544
    const v13, 0x3fb0a3d7    # 1.38f

    .line 545
    .line 546
    .line 547
    const v14, -0x406147ae    # -1.24f

    .line 548
    .line 549
    .line 550
    const v15, 0x40451eb8    # 3.08f

    .line 551
    .line 552
    .line 553
    const v16, -0x3fce147b    # -2.78f

    .line 554
    .line 555
    .line 556
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const v0, 0x3fe66666    # 1.8f

    .line 560
    .line 561
    .line 562
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const v17, 0x41a13333    # 20.15f

    .line 566
    .line 567
    .line 568
    const v18, 0x40a4cccd    # 5.15f

    .line 569
    .line 570
    .line 571
    const v13, 0x41a1eb85    # 20.24f

    .line 572
    .line 573
    .line 574
    const/high16 v14, 0x40c00000    # 6.0f

    .line 575
    .line 576
    const v15, 0x41a3ae14    # 20.46f

    .line 577
    .line 578
    .line 579
    const v16, 0x40aeb852    # 5.46f

    .line 580
    .line 581
    .line 582
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 589
    .line 590
    .line 591
    move-result-object v2

    .line 592
    const/16 v16, 0x3800

    .line 593
    .line 594
    const/16 v17, 0x0

    .line 595
    .line 596
    const/high16 v6, 0x3f800000    # 1.0f

    .line 597
    .line 598
    const/high16 v8, 0x3f800000    # 1.0f

    .line 599
    .line 600
    const/4 v7, 0x0

    .line 601
    const/high16 v9, 0x3f800000    # 1.0f

    .line 602
    .line 603
    const/high16 v12, 0x3f800000    # 1.0f

    .line 604
    .line 605
    const/4 v13, 0x0

    .line 606
    const/4 v14, 0x0

    .line 607
    const/4 v15, 0x0

    .line 608
    const-string v4, ""

    .line 609
    .line 610
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 611
    .line 612
    .line 613
    move-result-object v0

    .line 614
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 615
    .line 616
    .line 617
    move-result-object v0

    .line 618
    sput-object v0, Landroidx/compose/material/icons/rounded/AltRouteKt;->_altRoute:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 619
    .line 620
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 621
    .line 622
    .line 623
    return-object v0
.end method

.method public static synthetic getAltRoute$annotations(Landroidx/compose/material/icons/Icons$Rounded;)V
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        message = "Use the AutoMirrored version at Icons.AutoMirrored.Rounded.AltRoute"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "Icons.AutoMirrored.Rounded.AltRoute"
            imports = {
                "androidx.compose.material.icons.automirrored.rounded.AltRoute"
            }
        .end subannotation
    .end annotation

    return-void
.end method
