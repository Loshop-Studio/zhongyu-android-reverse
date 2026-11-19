.class public final Landroidx/compose/material/icons/rounded/PhishingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_phishing",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Phishing",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getPhishing",
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
        "SMAP\nPhishing.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Phishing.kt\nandroidx/compose/material/icons/rounded/PhishingKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,66:1\n212#2,12:67\n233#2,18:80\n253#2:117\n174#3:79\n705#4,2:98\n717#4,2:100\n719#4,11:106\n72#5,4:102\n*S KotlinDebug\n*F\n+ 1 Phishing.kt\nandroidx/compose/material/icons/rounded/PhishingKt\n*L\n29#1:67,12\n30#1:80,18\n30#1:117\n29#1:79\n30#1:98,2\n30#1:100,2\n30#1:106,11\n30#1:102,4\n*E\n"
    }
.end annotation


# static fields
.field private static _phishing:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPhishing(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/PhishingKt;->_phishing:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Phishing"

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
    const/high16 v0, 0x41980000    # 19.0f

    .line 71
    .line 72
    const/high16 v2, 0x41100000    # 9.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x40000000    # -2.0f

    .line 78
    .line 79
    const v18, -0x3fcb851f    # -2.82f

    .line 80
    .line 81
    .line 82
    const/4 v13, 0x0

    .line 83
    const v14, -0x4059999a    # -1.3f

    .line 84
    .line 85
    .line 86
    const v15, -0x40a8f5c3    # -0.84f

    .line 87
    .line 88
    .line 89
    const v16, -0x3fe66666    # -2.4f

    .line 90
    .line 91
    .line 92
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const/high16 v0, 0x40400000    # 3.0f

    .line 96
    .line 97
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v17, -0x40800000    # -1.0f

    .line 101
    .line 102
    const/high16 v18, -0x40800000    # -1.0f

    .line 103
    .line 104
    const v14, -0x40f33333    # -0.55f

    .line 105
    .line 106
    .line 107
    const v15, -0x4119999a    # -0.45f

    .line 108
    .line 109
    .line 110
    const/high16 v16, -0x40800000    # -1.0f

    .line 111
    .line 112
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/4 v0, 0x0

    .line 116
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v18, 0x3f800000    # 1.0f

    .line 120
    .line 121
    const v13, -0x40f33333    # -0.55f

    .line 122
    .line 123
    .line 124
    const/4 v14, 0x0

    .line 125
    const/high16 v15, -0x40800000    # -1.0f

    .line 126
    .line 127
    const v16, 0x3ee66666    # 0.45f

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v0, 0x404b851f    # 3.18f

    .line 134
    .line 135
    .line 136
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v17, 0x41500000    # 13.0f

    .line 140
    .line 141
    const/high16 v18, 0x41100000    # 9.0f

    .line 142
    .line 143
    const v13, 0x415d70a4    # 13.84f

    .line 144
    .line 145
    .line 146
    const v14, 0x40d33333    # 6.6f

    .line 147
    .line 148
    .line 149
    const/high16 v15, 0x41500000    # 13.0f

    .line 150
    .line 151
    const v16, 0x40f66666    # 7.7f

    .line 152
    .line 153
    .line 154
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const/high16 v0, 0x40000000    # 2.0f

    .line 158
    .line 159
    const v2, 0x40347ae1    # 2.82f

    .line 160
    .line 161
    .line 162
    const v4, 0x3f570a3d    # 0.84f

    .line 163
    .line 164
    .line 165
    const v6, 0x4019999a    # 2.4f

    .line 166
    .line 167
    .line 168
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v0, 0x4040a3d7    # 3.01f

    .line 172
    .line 173
    .line 174
    const/4 v2, 0x0

    .line 175
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v17, -0x3f99999a    # -3.6f

    .line 179
    .line 180
    .line 181
    const v18, 0x40851eb8    # 4.16f

    .line 182
    .line 183
    .line 184
    const/4 v13, 0x0

    .line 185
    const v14, 0x4005c28f    # 2.09f

    .line 186
    .line 187
    .line 188
    const v15, -0x403d70a4    # -1.52f

    .line 189
    .line 190
    .line 191
    const v16, 0x407d70a4    # 3.96f

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v17, 0x40e00000    # 7.0f

    .line 198
    .line 199
    const/high16 v18, 0x41700000    # 15.0f

    .line 200
    .line 201
    const v13, 0x411051ec    # 9.02f

    .line 202
    .line 203
    .line 204
    const v14, 0x4199ae14    # 19.21f

    .line 205
    .line 206
    .line 207
    const/high16 v15, 0x40e00000    # 7.0f

    .line 208
    .line 209
    const v16, 0x418ab852    # 17.34f

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v0, -0x40800000    # -1.0f

    .line 216
    .line 217
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v0, 0x3fe51eb8    # 1.79f

    .line 221
    .line 222
    .line 223
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v17, 0x3eb33333    # 0.35f

    .line 227
    .line 228
    .line 229
    const v18, -0x40a66666    # -0.85f

    .line 230
    .line 231
    .line 232
    const v13, 0x3ee66666    # 0.45f

    .line 233
    .line 234
    .line 235
    const/4 v14, 0x0

    .line 236
    const v15, 0x3f2b851f    # 0.67f

    .line 237
    .line 238
    .line 239
    const v16, -0x40f5c28f    # -0.54f

    .line 240
    .line 241
    .line 242
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const v0, 0x40bb3333    # 5.85f

    .line 246
    .line 247
    .line 248
    const v2, 0x411d999a    # 9.85f

    .line 249
    .line 250
    .line 251
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v17, 0x40a00000    # 5.0f

    .line 255
    .line 256
    const v18, 0x41235c29    # 10.21f

    .line 257
    .line 258
    .line 259
    const v13, 0x40b147ae    # 5.54f

    .line 260
    .line 261
    .line 262
    const v14, 0x4118a3d7    # 9.54f

    .line 263
    .line 264
    .line 265
    const/high16 v15, 0x40a00000    # 5.0f

    .line 266
    .line 267
    const v16, 0x411c28f6    # 9.76f

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v0, 0x40928f5c    # 4.58f

    .line 274
    .line 275
    .line 276
    const/4 v2, 0x0

    .line 277
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v17, 0x40a6b852    # 5.21f

    .line 281
    .line 282
    .line 283
    const v18, 0x40c51eb8    # 6.16f

    .line 284
    .line 285
    .line 286
    const/4 v13, 0x0

    .line 287
    const v14, 0x40433333    # 3.05f

    .line 288
    .line 289
    .line 290
    const v15, 0x400c28f6    # 2.19f

    .line 291
    .line 292
    .line 293
    const v16, 0x40b8a3d7    # 5.77f

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const/high16 v17, 0x41880000    # 17.0f

    .line 300
    .line 301
    const/high16 v18, 0x41700000    # 15.0f

    .line 302
    .line 303
    const v13, 0x415deb85    # 13.87f

    .line 304
    .line 305
    .line 306
    const v14, 0x41ab5c29    # 21.42f

    .line 307
    .line 308
    .line 309
    const/high16 v15, 0x41880000    # 17.0f

    .line 310
    .line 311
    const v16, 0x41948f5c    # 18.57f

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v0, -0x3fb47ae1    # -3.18f

    .line 318
    .line 319
    .line 320
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const/high16 v17, 0x41980000    # 19.0f

    .line 324
    .line 325
    const/high16 v18, 0x41100000    # 9.0f

    .line 326
    .line 327
    const v13, 0x419147ae    # 18.16f

    .line 328
    .line 329
    .line 330
    const v14, 0x41366666    # 11.4f

    .line 331
    .line 332
    .line 333
    const/high16 v15, 0x41980000    # 19.0f

    .line 334
    .line 335
    const v16, 0x4124cccd    # 10.3f

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/high16 v0, 0x41800000    # 16.0f

    .line 345
    .line 346
    const/high16 v2, 0x41200000    # 10.0f

    .line 347
    .line 348
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const/high16 v17, -0x40800000    # -1.0f

    .line 352
    .line 353
    const/high16 v18, -0x40800000    # -1.0f

    .line 354
    .line 355
    const v13, -0x40f33333    # -0.55f

    .line 356
    .line 357
    .line 358
    const/4 v14, 0x0

    .line 359
    const/high16 v15, -0x40800000    # -1.0f

    .line 360
    .line 361
    const v16, -0x4119999a    # -0.45f

    .line 362
    .line 363
    .line 364
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v0, 0x3ee66666    # 0.45f

    .line 368
    .line 369
    .line 370
    const/high16 v2, -0x40800000    # -1.0f

    .line 371
    .line 372
    const/high16 v4, 0x3f800000    # 1.0f

    .line 373
    .line 374
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const/high16 v2, 0x3f800000    # 1.0f

    .line 378
    .line 379
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v0, 0x41846666    # 16.55f

    .line 383
    .line 384
    .line 385
    const/high16 v2, 0x41800000    # 16.0f

    .line 386
    .line 387
    const/high16 v4, 0x41200000    # 10.0f

    .line 388
    .line 389
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 396
    .line 397
    .line 398
    move-result-object v2

    .line 399
    const/16 v16, 0x3800

    .line 400
    .line 401
    const/16 v17, 0x0

    .line 402
    .line 403
    const/high16 v6, 0x3f800000    # 1.0f

    .line 404
    .line 405
    const/high16 v8, 0x3f800000    # 1.0f

    .line 406
    .line 407
    const/4 v7, 0x0

    .line 408
    const/high16 v9, 0x3f800000    # 1.0f

    .line 409
    .line 410
    const/high16 v12, 0x3f800000    # 1.0f

    .line 411
    .line 412
    const/4 v13, 0x0

    .line 413
    const/4 v15, 0x0

    .line 414
    const-string v4, ""

    .line 415
    .line 416
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    sput-object v0, Landroidx/compose/material/icons/rounded/PhishingKt;->_phishing:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 425
    .line 426
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 427
    .line 428
    .line 429
    return-object v0
.end method
