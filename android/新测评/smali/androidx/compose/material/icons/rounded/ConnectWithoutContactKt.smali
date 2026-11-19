.class public final Landroidx/compose/material/icons/rounded/ConnectWithoutContactKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_connectWithoutContact",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "ConnectWithoutContact",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getConnectWithoutContact",
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
        "SMAP\nConnectWithoutContact.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectWithoutContact.kt\nandroidx/compose/material/icons/rounded/ConnectWithoutContactKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,98:1\n212#2,12:99\n233#2,18:112\n253#2:149\n174#3:111\n705#4,2:130\n717#4,2:132\n719#4,11:138\n72#5,4:134\n*S KotlinDebug\n*F\n+ 1 ConnectWithoutContact.kt\nandroidx/compose/material/icons/rounded/ConnectWithoutContactKt\n*L\n29#1:99,12\n30#1:112,18\n30#1:149\n29#1:111\n30#1:130,2\n30#1:132,2\n30#1:138,11\n30#1:134,4\n*E\n"
    }
.end annotation


# static fields
.field private static _connectWithoutContact:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getConnectWithoutContact(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ConnectWithoutContactKt;->_connectWithoutContact:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.ConnectWithoutContact"

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
    const/high16 v0, 0x40800000    # 4.0f

    .line 71
    .line 72
    const/high16 v2, 0x40e00000    # 7.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x40000000    # -2.0f

    .line 78
    .line 79
    const/high16 v18, -0x40000000    # -2.0f

    .line 80
    .line 81
    const/4 v13, 0x0

    .line 82
    const v14, -0x4071eb85    # -1.11f

    .line 83
    .line 84
    .line 85
    const v15, -0x409c28f6    # -0.89f

    .line 86
    .line 87
    .line 88
    const/high16 v16, -0x40000000    # -2.0f

    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, 0x4038f5c3    # 2.89f

    .line 94
    .line 95
    .line 96
    const/high16 v2, 0x40400000    # 3.0f

    .line 97
    .line 98
    const/high16 v4, 0x40800000    # 4.0f

    .line 99
    .line 100
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const v0, 0x3f63d70a    # 0.89f

    .line 104
    .line 105
    .line 106
    const/high16 v2, 0x40000000    # 2.0f

    .line 107
    .line 108
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v0, 0x40a3851f    # 5.11f

    .line 112
    .line 113
    .line 114
    const/high16 v2, 0x40800000    # 4.0f

    .line 115
    .line 116
    const/high16 v4, 0x40e00000    # 7.0f

    .line 117
    .line 118
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v0, 0x40900000    # 4.5f

    .line 125
    .line 126
    const v2, 0x41230a3d    # 10.19f

    .line 127
    .line 128
    .line 129
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v17, -0x40947ae1    # -0.92f

    .line 136
    .line 137
    .line 138
    const v18, 0x3f2147ae    # 0.63f

    .line 139
    .line 140
    .line 141
    const v13, -0x412e147b    # -0.41f

    .line 142
    .line 143
    .line 144
    const/4 v14, 0x0

    .line 145
    const v15, -0x40bd70a4    # -0.76f

    .line 146
    .line 147
    .line 148
    const/high16 v16, 0x3e800000    # 0.25f

    .line 149
    .line 150
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/high16 v17, 0x40d00000    # 6.5f

    .line 154
    .line 155
    const/high16 v18, 0x40e00000    # 7.0f

    .line 156
    .line 157
    const v13, 0x410d47ae    # 8.83f

    .line 158
    .line 159
    .line 160
    const v14, 0x40c75c29    # 6.23f

    .line 161
    .line 162
    .line 163
    const v15, 0x40f851ec    # 7.76f

    .line 164
    .line 165
    .line 166
    const/high16 v16, 0x40e00000    # 7.0f

    .line 167
    .line 168
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 172
    .line 173
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/high16 v17, 0x40000000    # 2.0f

    .line 177
    .line 178
    const/high16 v18, 0x41080000    # 8.5f

    .line 179
    .line 180
    const v13, 0x402ae148    # 2.67f

    .line 181
    .line 182
    .line 183
    const/high16 v14, 0x40e00000    # 7.0f

    .line 184
    .line 185
    const/high16 v15, 0x40000000    # 2.0f

    .line 186
    .line 187
    const v16, 0x40f570a4    # 7.67f

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v0, 0x41300000    # 11.0f

    .line 194
    .line 195
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v0, 0x40c00000    # 6.0f

    .line 199
    .line 200
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const v0, 0x410bd70a    # 8.74f

    .line 204
    .line 205
    .line 206
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v17, 0x4047ae14    # 3.12f

    .line 210
    .line 211
    .line 212
    const v18, -0x3fc5c28f    # -2.91f

    .line 213
    .line 214
    .line 215
    const v13, 0x3fb70a3d    # 1.43f

    .line 216
    .line 217
    .line 218
    const v14, -0x4119999a    # -0.45f

    .line 219
    .line 220
    .line 221
    const v15, 0x40251eb8    # 2.58f

    .line 222
    .line 223
    .line 224
    const v16, -0x403c28f6    # -1.53f

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v17, 0x41230a3d    # 10.19f

    .line 231
    .line 232
    .line 233
    const/high16 v18, 0x40900000    # 4.5f

    .line 234
    .line 235
    const v13, 0x4136147b    # 11.38f

    .line 236
    .line 237
    .line 238
    const v14, 0x40a6147b    # 5.19f

    .line 239
    .line 240
    .line 241
    const v15, 0x412e147b    # 10.88f

    .line 242
    .line 243
    .line 244
    const/high16 v16, 0x40900000    # 4.5f

    .line 245
    .line 246
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v0, 0x41980000    # 19.0f

    .line 253
    .line 254
    const/high16 v2, 0x41880000    # 17.0f

    .line 255
    .line 256
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v17, 0x40000000    # 2.0f

    .line 260
    .line 261
    const/high16 v18, -0x40000000    # -2.0f

    .line 262
    .line 263
    const v13, 0x3f8e147b    # 1.11f

    .line 264
    .line 265
    .line 266
    const/4 v14, 0x0

    .line 267
    const/high16 v15, 0x40000000    # 2.0f

    .line 268
    .line 269
    const v16, -0x409c28f6    # -0.89f

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v0, -0x409c28f6    # -0.89f

    .line 276
    .line 277
    .line 278
    const/high16 v2, -0x40000000    # -2.0f

    .line 279
    .line 280
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v0, 0x3f63d70a    # 0.89f

    .line 284
    .line 285
    .line 286
    const/high16 v2, 0x40000000    # 2.0f

    .line 287
    .line 288
    const/high16 v4, -0x40000000    # -2.0f

    .line 289
    .line 290
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v0, 0x418f1eb8    # 17.89f

    .line 294
    .line 295
    .line 296
    const/high16 v2, 0x41980000    # 19.0f

    .line 297
    .line 298
    const/high16 v4, 0x41880000    # 17.0f

    .line 299
    .line 300
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const/high16 v0, 0x41a40000    # 20.5f

    .line 307
    .line 308
    const/high16 v2, 0x41900000    # 18.0f

    .line 309
    .line 310
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 314
    .line 315
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v17, -0x3fceb852    # -2.77f

    .line 319
    .line 320
    .line 321
    const v18, -0x4010a3d7    # -1.87f

    .line 322
    .line 323
    .line 324
    const v13, -0x405eb852    # -1.26f

    .line 325
    .line 326
    .line 327
    const v15, -0x3feae148    # -2.33f

    .line 328
    .line 329
    .line 330
    const v16, -0x40bae148    # -0.77f

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v17, -0x40947ae1    # -0.92f

    .line 337
    .line 338
    .line 339
    const v18, -0x40deb852    # -0.63f

    .line 340
    .line 341
    .line 342
    const v13, -0x41e66666    # -0.15f

    .line 343
    .line 344
    .line 345
    const v14, -0x413d70a4    # -0.38f

    .line 346
    .line 347
    .line 348
    const v15, -0x40fd70a4    # -0.51f

    .line 349
    .line 350
    .line 351
    const v16, -0x40deb852    # -0.63f

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/4 v0, 0x0

    .line 358
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v17, -0x408f5c29    # -0.94f

    .line 362
    .line 363
    .line 364
    const v18, 0x3faa3d71    # 1.33f

    .line 365
    .line 366
    .line 367
    const v13, -0x40cf5c29    # -0.69f

    .line 368
    .line 369
    .line 370
    const/4 v14, 0x0

    .line 371
    const v15, -0x4067ae14    # -1.19f

    .line 372
    .line 373
    .line 374
    const v16, 0x3f30a3d7    # 0.69f

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v17, 0x4047ae14    # 3.12f

    .line 381
    .line 382
    .line 383
    const v18, 0x403a3d71    # 2.91f

    .line 384
    .line 385
    .line 386
    const v13, 0x3f0ccccd    # 0.55f

    .line 387
    .line 388
    .line 389
    const v14, 0x3fb0a3d7    # 1.38f

    .line 390
    .line 391
    .line 392
    const v15, 0x3fd851ec    # 1.69f

    .line 393
    .line 394
    .line 395
    const v16, 0x401d70a4    # 2.46f

    .line 396
    .line 397
    .line 398
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/high16 v0, 0x41b00000    # 22.0f

    .line 402
    .line 403
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const/high16 v0, 0x40c00000    # 6.0f

    .line 407
    .line 408
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const/high16 v0, -0x3fe00000    # -2.5f

    .line 412
    .line 413
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const/high16 v17, 0x41a40000    # 20.5f

    .line 417
    .line 418
    const/high16 v18, 0x41900000    # 18.0f

    .line 419
    .line 420
    const/high16 v13, 0x41b00000    # 22.0f

    .line 421
    .line 422
    const v14, 0x41955c29    # 18.67f

    .line 423
    .line 424
    .line 425
    const v15, 0x41aaa3d7    # 21.33f

    .line 426
    .line 427
    .line 428
    const/high16 v16, 0x41900000    # 18.0f

    .line 429
    .line 430
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const/high16 v0, 0x418a0000    # 17.25f

    .line 437
    .line 438
    const v2, 0x413170a4    # 11.09f

    .line 439
    .line 440
    .line 441
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v17, 0x3c23d70a    # 0.01f

    .line 445
    .line 446
    .line 447
    const/16 v18, 0x0

    .line 448
    .line 449
    const/4 v13, 0x0

    .line 450
    const/4 v14, 0x0

    .line 451
    const/4 v15, 0x0

    .line 452
    const v16, -0x43dc28f6    # -0.01f

    .line 453
    .line 454
    .line 455
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const v17, -0x3ff51eb8    # -2.17f

    .line 459
    .line 460
    .line 461
    const v18, 0x400ae148    # 2.17f

    .line 462
    .line 463
    .line 464
    const v13, -0x407851ec    # -1.06f

    .line 465
    .line 466
    .line 467
    const v14, 0x3e8a3d71    # 0.27f

    .line 468
    .line 469
    .line 470
    const v15, -0x400ccccd    # -1.9f

    .line 471
    .line 472
    .line 473
    const v16, 0x3f8e147b    # 1.11f

    .line 474
    .line 475
    .line 476
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const/16 v17, 0x0

    .line 480
    .line 481
    const v18, -0x43dc28f6    # -0.01f

    .line 482
    .line 483
    .line 484
    const/4 v13, 0x0

    .line 485
    const/4 v14, 0x0

    .line 486
    const/4 v15, 0x0

    .line 487
    const v16, -0x43dc28f6    # -0.01f

    .line 488
    .line 489
    .line 490
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const v17, 0x4161c28f    # 14.11f

    .line 494
    .line 495
    .line 496
    const/high16 v18, 0x41600000    # 14.0f

    .line 497
    .line 498
    const v13, 0x416fae14    # 14.98f

    .line 499
    .line 500
    .line 501
    const v14, 0x415ae148    # 13.68f

    .line 502
    .line 503
    .line 504
    const v15, 0x416947ae    # 14.58f

    .line 505
    .line 506
    .line 507
    const/high16 v16, 0x41600000    # 14.0f

    .line 508
    .line 509
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const/high16 v17, -0x40800000    # -1.0f

    .line 513
    .line 514
    const/high16 v18, -0x40800000    # -1.0f

    .line 515
    .line 516
    const v13, -0x40f33333    # -0.55f

    .line 517
    .line 518
    .line 519
    const/4 v14, 0x0

    .line 520
    const/high16 v15, -0x40800000    # -1.0f

    .line 521
    .line 522
    const v16, -0x4119999a    # -0.45f

    .line 523
    .line 524
    .line 525
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const v17, 0x3ca3d70a    # 0.02f

    .line 529
    .line 530
    .line 531
    const v18, -0x41f0a3d7    # -0.14f

    .line 532
    .line 533
    .line 534
    const/4 v13, 0x0

    .line 535
    const v14, -0x42b33333    # -0.05f

    .line 536
    .line 537
    .line 538
    const v15, 0x3ca3d70a    # 0.02f

    .line 539
    .line 540
    .line 541
    const v16, -0x41f0a3d7    # -0.14f

    .line 542
    .line 543
    .line 544
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const/high16 v17, 0x40700000    # 3.75f

    .line 548
    .line 549
    const v18, -0x3f9147ae    # -3.73f

    .line 550
    .line 551
    .line 552
    const v13, 0x3edc28f6    # 0.43f

    .line 553
    .line 554
    .line 555
    const v14, -0x40133333    # -1.85f

    .line 556
    .line 557
    .line 558
    const v15, 0x3ff1eb85    # 1.89f

    .line 559
    .line 560
    .line 561
    const v16, -0x3fac28f6    # -3.31f

    .line 562
    .line 563
    .line 564
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const v17, 0x3df5c28f    # 0.12f

    .line 568
    .line 569
    .line 570
    const v18, -0x43dc28f6    # -0.01f

    .line 571
    .line 572
    .line 573
    const v13, 0x3d23d70a    # 0.04f

    .line 574
    .line 575
    .line 576
    const/4 v14, 0x0

    .line 577
    const v15, 0x3da3d70a    # 0.08f

    .line 578
    .line 579
    .line 580
    const v16, -0x43dc28f6    # -0.01f

    .line 581
    .line 582
    .line 583
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const/high16 v17, 0x3f800000    # 1.0f

    .line 587
    .line 588
    const/high16 v18, 0x3f800000    # 1.0f

    .line 589
    .line 590
    const v13, 0x3f0ccccd    # 0.55f

    .line 591
    .line 592
    .line 593
    const/high16 v15, 0x3f800000    # 1.0f

    .line 594
    .line 595
    const v16, 0x3ee66666    # 0.45f

    .line 596
    .line 597
    .line 598
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    const/high16 v17, 0x418a0000    # 17.25f

    .line 602
    .line 603
    const v18, 0x413170a4    # 11.09f

    .line 604
    .line 605
    .line 606
    const/high16 v13, 0x41900000    # 18.0f

    .line 607
    .line 608
    const v14, 0x412947ae    # 10.58f

    .line 609
    .line 610
    .line 611
    const v15, 0x418d70a4    # 17.68f

    .line 612
    .line 613
    .line 614
    const v16, 0x412fae14    # 10.98f

    .line 615
    .line 616
    .line 617
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const v0, 0x40c1eb85    # 6.06f

    .line 624
    .line 625
    .line 626
    const/high16 v2, 0x41900000    # 18.0f

    .line 627
    .line 628
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    const v17, -0x40a3d70a    # -0.86f

    .line 632
    .line 633
    .line 634
    const v18, 0x3f7d70a4    # 0.99f

    .line 635
    .line 636
    .line 637
    const/4 v13, 0x0

    .line 638
    const v14, 0x3f028f5c    # 0.51f

    .line 639
    .line 640
    .line 641
    const v15, -0x41428f5c    # -0.37f

    .line 642
    .line 643
    .line 644
    const v16, 0x3f6b851f    # 0.92f

    .line 645
    .line 646
    .line 647
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const/16 v17, 0x0

    .line 651
    .line 652
    const/16 v18, 0x0

    .line 653
    .line 654
    const/4 v14, 0x0

    .line 655
    const/4 v15, 0x0

    .line 656
    const/16 v16, 0x0

    .line 657
    .line 658
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    const v17, -0x3f3d1eb8    # -6.09f

    .line 662
    .line 663
    .line 664
    const v18, 0x40c33333    # 6.1f

    .line 665
    .line 666
    .line 667
    const v13, -0x3fb3d70a    # -3.19f

    .line 668
    .line 669
    .line 670
    const v14, 0x3ec7ae14    # 0.39f

    .line 671
    .line 672
    .line 673
    const v15, -0x3f49999a    # -5.7f

    .line 674
    .line 675
    .line 676
    const v16, 0x403a3d71    # 2.91f

    .line 677
    .line 678
    .line 679
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    const/16 v17, 0x0

    .line 683
    .line 684
    const/16 v18, 0x0

    .line 685
    .line 686
    const/4 v13, 0x0

    .line 687
    const/4 v14, 0x0

    .line 688
    const/4 v15, 0x0

    .line 689
    const/16 v16, 0x0

    .line 690
    .line 691
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 692
    .line 693
    .line 694
    const v17, 0x4120f5c3    # 10.06f

    .line 695
    .line 696
    .line 697
    const/high16 v18, 0x41600000    # 14.0f

    .line 698
    .line 699
    const v13, 0x412fae14    # 10.98f

    .line 700
    .line 701
    .line 702
    const v14, 0x415a147b    # 13.63f

    .line 703
    .line 704
    .line 705
    const v15, 0x4128f5c3    # 10.56f

    .line 706
    .line 707
    .line 708
    const/high16 v16, 0x41600000    # 14.0f

    .line 709
    .line 710
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 711
    .line 712
    .line 713
    const/high16 v17, -0x40800000    # -1.0f

    .line 714
    .line 715
    const/high16 v18, -0x40800000    # -1.0f

    .line 716
    .line 717
    const v13, -0x40f33333    # -0.55f

    .line 718
    .line 719
    .line 720
    const/4 v14, 0x0

    .line 721
    const/high16 v15, -0x40800000    # -1.0f

    .line 722
    .line 723
    const v16, -0x4119999a    # -0.45f

    .line 724
    .line 725
    .line 726
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 727
    .line 728
    .line 729
    const/16 v17, 0x0

    .line 730
    .line 731
    const v18, -0x428a3d71    # -0.06f

    .line 732
    .line 733
    .line 734
    const/4 v13, 0x0

    .line 735
    const v14, -0x435c28f6    # -0.02f

    .line 736
    .line 737
    .line 738
    const/4 v15, 0x0

    .line 739
    const v16, -0x42dc28f6    # -0.04f

    .line 740
    .line 741
    .line 742
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    const v18, -0x430a3d71    # -0.03f

    .line 746
    .line 747
    .line 748
    const v14, -0x43dc28f6    # -0.01f

    .line 749
    .line 750
    .line 751
    const v16, -0x435c28f6    # -0.02f

    .line 752
    .line 753
    .line 754
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 755
    .line 756
    .line 757
    const v17, 0x40fd70a4    # 7.92f

    .line 758
    .line 759
    .line 760
    const v18, -0x3f04cccd    # -7.85f

    .line 761
    .line 762
    .line 763
    const/high16 v13, 0x3f000000    # 0.5f

    .line 764
    .line 765
    const v14, -0x3f7c28f6    # -4.12f

    .line 766
    .line 767
    .line 768
    const v15, 0x40728f5c    # 3.79f

    .line 769
    .line 770
    .line 771
    const v16, -0x3f13d70a    # -7.38f

    .line 772
    .line 773
    .line 774
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 775
    .line 776
    .line 777
    const v17, 0x3c23d70a    # 0.01f

    .line 778
    .line 779
    .line 780
    const/16 v18, 0x0

    .line 781
    .line 782
    const/4 v13, 0x0

    .line 783
    const/4 v14, 0x0

    .line 784
    const v15, 0x3c23d70a    # 0.01f

    .line 785
    .line 786
    .line 787
    const/16 v16, 0x0

    .line 788
    .line 789
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 790
    .line 791
    .line 792
    const/high16 v17, 0x41900000    # 18.0f

    .line 793
    .line 794
    const v18, 0x40c1eb85    # 6.06f

    .line 795
    .line 796
    .line 797
    const v13, 0x418c6666    # 17.55f

    .line 798
    .line 799
    .line 800
    const v14, 0x40a1eb85    # 5.06f

    .line 801
    .line 802
    .line 803
    const/high16 v15, 0x41900000    # 18.0f

    .line 804
    .line 805
    const v16, 0x40b051ec    # 5.51f

    .line 806
    .line 807
    .line 808
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 809
    .line 810
    .line 811
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 812
    .line 813
    .line 814
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 815
    .line 816
    .line 817
    move-result-object v2

    .line 818
    const/16 v16, 0x3800

    .line 819
    .line 820
    const/16 v17, 0x0

    .line 821
    .line 822
    const/high16 v6, 0x3f800000    # 1.0f

    .line 823
    .line 824
    const/high16 v8, 0x3f800000    # 1.0f

    .line 825
    .line 826
    const/4 v7, 0x0

    .line 827
    const/high16 v9, 0x3f800000    # 1.0f

    .line 828
    .line 829
    const/high16 v12, 0x3f800000    # 1.0f

    .line 830
    .line 831
    const/4 v13, 0x0

    .line 832
    const/4 v14, 0x0

    .line 833
    const/4 v15, 0x0

    .line 834
    const-string v4, ""

    .line 835
    .line 836
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 837
    .line 838
    .line 839
    move-result-object v0

    .line 840
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 841
    .line 842
    .line 843
    move-result-object v0

    .line 844
    sput-object v0, Landroidx/compose/material/icons/rounded/ConnectWithoutContactKt;->_connectWithoutContact:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 845
    .line 846
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 847
    .line 848
    .line 849
    return-object v0
.end method
