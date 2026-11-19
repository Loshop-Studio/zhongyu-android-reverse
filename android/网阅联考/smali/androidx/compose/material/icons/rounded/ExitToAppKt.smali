.class public final Landroidx/compose/material/icons/rounded/ExitToAppKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_exitToApp",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "ExitToApp",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getExitToApp",
        "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;",
        "material-icons-core_release"
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
        "SMAP\nExitToApp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExitToApp.kt\nandroidx/compose/material/icons/rounded/ExitToAppKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,76:1\n122#2:77\n116#2,3:78\n119#2,3:82\n132#2,18:85\n152#2:122\n175#3:81\n694#4,2:103\n706#4,2:105\n708#4,11:111\n53#5,4:107\n*S KotlinDebug\n*F\n+ 1 ExitToApp.kt\nandroidx/compose/material/icons/rounded/ExitToAppKt\n*L\n29#1:77\n29#1:78,3\n29#1:82,3\n30#1:85,18\n30#1:122\n29#1:81\n30#1:103,2\n30#1:105,2\n30#1:111,11\n30#1:107,4\n*E\n"
    }
.end annotation


# static fields
.field private static _exitToApp:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getExitToApp(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 30

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Landroidx/compose/material/icons/rounded/ExitToAppKt;->_exitToApp:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    const-string v2, "Rounded.ExitToApp"

    .line 17
    .line 18
    new-instance v1, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 19
    .line 20
    move-object v13, v1

    .line 21
    const/high16 v0, 0x41c00000    # 24.0f

    .line 22
    .line 23
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    const/high16 v5, 0x41c00000    # 24.0f

    .line 32
    .line 33
    const/high16 v6, 0x41c00000    # 24.0f

    .line 34
    .line 35
    const-wide/16 v7, 0x0

    .line 36
    .line 37
    const/4 v9, 0x0

    .line 38
    const/4 v10, 0x0

    .line 39
    const/16 v11, 0xe0

    .line 40
    .line 41
    const/4 v12, 0x0

    .line 42
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 43
    .line 44
    .line 45
    const/high16 v18, 0x3f800000    # 1.0f

    .line 46
    .line 47
    const/high16 v20, 0x3f800000    # 1.0f

    .line 48
    .line 49
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 50
    .line 51
    .line 52
    move-result v15

    .line 53
    new-instance v0, Landroidx/compose/ui/graphics/SolidColor;

    .line 54
    .line 55
    move-object/from16 v17, v0

    .line 56
    .line 57
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 58
    .line 59
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 60
    .line 61
    .line 62
    move-result-wide v1

    .line 63
    const/4 v3, 0x0

    .line 64
    invoke-direct {v0, v1, v2, v3}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 65
    .line 66
    .line 67
    const/16 v19, 0x0

    .line 68
    .line 69
    const/high16 v21, 0x3f800000    # 1.0f

    .line 70
    .line 71
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 72
    .line 73
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 74
    .line 75
    .line 76
    move-result v22

    .line 77
    sget-object v0, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 78
    .line 79
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 80
    .line 81
    .line 82
    move-result v23

    .line 83
    const/high16 v24, 0x3f800000    # 1.0f

    .line 84
    .line 85
    const-string v16, ""

    .line 86
    .line 87
    new-instance v7, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    invoke-direct {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    const v0, 0x412ca3d7    # 10.79f

    .line 93
    .line 94
    .line 95
    const v1, 0x418251ec    # 16.29f

    .line 96
    .line 97
    .line 98
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v1, 0x3ec7ae14    # 0.39f

    .line 102
    .line 103
    .line 104
    const v2, 0x3ec7ae14    # 0.39f

    .line 105
    .line 106
    .line 107
    const v3, 0x3f828f5c    # 1.02f

    .line 108
    .line 109
    .line 110
    const v4, 0x3ec7ae14    # 0.39f

    .line 111
    .line 112
    .line 113
    const v5, 0x3fb47ae1    # 1.41f

    .line 114
    .line 115
    .line 116
    const/4 v6, 0x0

    .line 117
    move-object v0, v7

    .line 118
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v0, 0x4065c28f    # 3.59f

    .line 122
    .line 123
    .line 124
    const v1, -0x3f9a3d71    # -3.59f

    .line 125
    .line 126
    .line 127
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v1, 0x3ec7ae14    # 0.39f

    .line 131
    .line 132
    .line 133
    const v2, -0x413851ec    # -0.39f

    .line 134
    .line 135
    .line 136
    const v3, 0x3ec7ae14    # 0.39f

    .line 137
    .line 138
    .line 139
    const v4, -0x407d70a4    # -1.02f

    .line 140
    .line 141
    .line 142
    const/4 v5, 0x0

    .line 143
    const v6, -0x404b851f    # -1.41f

    .line 144
    .line 145
    .line 146
    move-object v0, v7

    .line 147
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v0, 0x41433333    # 12.2f

    .line 151
    .line 152
    .line 153
    const v1, 0x40f66666    # 7.7f

    .line 154
    .line 155
    .line 156
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v1, -0x413851ec    # -0.39f

    .line 160
    .line 161
    .line 162
    const v3, -0x407d70a4    # -1.02f

    .line 163
    .line 164
    .line 165
    const v4, -0x413851ec    # -0.39f

    .line 166
    .line 167
    .line 168
    const v5, -0x404b851f    # -1.41f

    .line 169
    .line 170
    .line 171
    const/4 v6, 0x0

    .line 172
    move-object v0, v7

    .line 173
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v2, 0x3ec7ae14    # 0.39f

    .line 177
    .line 178
    .line 179
    const v3, -0x413851ec    # -0.39f

    .line 180
    .line 181
    .line 182
    const v4, 0x3f828f5c    # 1.02f

    .line 183
    .line 184
    .line 185
    const/4 v5, 0x0

    .line 186
    const v6, 0x3fb47ae1    # 1.41f

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v0, 0x414ab852    # 12.67f

    .line 193
    .line 194
    .line 195
    const/high16 v1, 0x41300000    # 11.0f

    .line 196
    .line 197
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v0, 0x40800000    # 4.0f

    .line 201
    .line 202
    invoke-virtual {v7, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v1, -0x40f33333    # -0.55f

    .line 206
    .line 207
    .line 208
    const/4 v2, 0x0

    .line 209
    const/high16 v3, -0x40800000    # -1.0f

    .line 210
    .line 211
    const v4, 0x3ee66666    # 0.45f

    .line 212
    .line 213
    .line 214
    const/high16 v5, -0x40800000    # -1.0f

    .line 215
    .line 216
    const/high16 v6, 0x3f800000    # 1.0f

    .line 217
    .line 218
    move-object v0, v7

    .line 219
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v8, 0x3ee66666    # 0.45f

    .line 223
    .line 224
    .line 225
    const/high16 v9, 0x3f800000    # 1.0f

    .line 226
    .line 227
    invoke-virtual {v7, v8, v9, v9, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v0, 0x410ab852    # 8.67f

    .line 231
    .line 232
    .line 233
    invoke-virtual {v7, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v0, -0x400f5c29    # -1.88f

    .line 237
    .line 238
    .line 239
    const v1, 0x3ff0a3d7    # 1.88f

    .line 240
    .line 241
    .line 242
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const v1, -0x413851ec    # -0.39f

    .line 246
    .line 247
    .line 248
    const v2, 0x3ec7ae14    # 0.39f

    .line 249
    .line 250
    .line 251
    const v3, -0x413d70a4    # -0.38f

    .line 252
    .line 253
    .line 254
    const v4, 0x3f83d70a    # 1.03f

    .line 255
    .line 256
    .line 257
    const/4 v5, 0x0

    .line 258
    const v6, 0x3fb47ae1    # 1.41f

    .line 259
    .line 260
    .line 261
    move-object v0, v7

    .line 262
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v0, 0x41980000    # 19.0f

    .line 269
    .line 270
    const/high16 v10, 0x40400000    # 3.0f

    .line 271
    .line 272
    invoke-virtual {v7, v0, v10}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v11, 0x40a00000    # 5.0f

    .line 276
    .line 277
    invoke-virtual {v7, v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v1, -0x4071eb85    # -1.11f

    .line 281
    .line 282
    .line 283
    const/4 v2, 0x0

    .line 284
    const/high16 v3, -0x40000000    # -2.0f

    .line 285
    .line 286
    const v4, 0x3f666666    # 0.9f

    .line 287
    .line 288
    .line 289
    const/high16 v5, -0x40000000    # -2.0f

    .line 290
    .line 291
    const/high16 v6, 0x40000000    # 2.0f

    .line 292
    .line 293
    move-object v0, v7

    .line 294
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v7, v10}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/4 v1, 0x0

    .line 301
    const v2, 0x3f0ccccd    # 0.55f

    .line 302
    .line 303
    .line 304
    const v3, 0x3ee66666    # 0.45f

    .line 305
    .line 306
    .line 307
    const/high16 v4, 0x3f800000    # 1.0f

    .line 308
    .line 309
    const/high16 v5, 0x3f800000    # 1.0f

    .line 310
    .line 311
    const/high16 v6, 0x3f800000    # 1.0f

    .line 312
    .line 313
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const v0, -0x4119999a    # -0.45f

    .line 317
    .line 318
    .line 319
    const/high16 v12, -0x40800000    # -1.0f

    .line 320
    .line 321
    invoke-virtual {v7, v9, v0, v9, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const/high16 v14, 0x40c00000    # 6.0f

    .line 325
    .line 326
    invoke-virtual {v7, v14}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v2, -0x40f33333    # -0.55f

    .line 330
    .line 331
    .line 332
    const/high16 v4, -0x40800000    # -1.0f

    .line 333
    .line 334
    const/high16 v6, -0x40800000    # -1.0f

    .line 335
    .line 336
    move-object v0, v7

    .line 337
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v6, 0x41400000    # 12.0f

    .line 341
    .line 342
    invoke-virtual {v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const v1, 0x3f0ccccd    # 0.55f

    .line 346
    .line 347
    .line 348
    const/4 v2, 0x0

    .line 349
    const/high16 v3, 0x3f800000    # 1.0f

    .line 350
    .line 351
    const v4, 0x3ee66666    # 0.45f

    .line 352
    .line 353
    .line 354
    const/high16 v25, 0x3f800000    # 1.0f

    .line 355
    .line 356
    move v11, v6

    .line 357
    move/from16 v6, v25

    .line 358
    .line 359
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v7, v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/4 v1, 0x0

    .line 366
    const v2, 0x3f0ccccd    # 0.55f

    .line 367
    .line 368
    .line 369
    const v3, -0x4119999a    # -0.45f

    .line 370
    .line 371
    .line 372
    const/high16 v4, 0x3f800000    # 1.0f

    .line 373
    .line 374
    const/high16 v5, -0x40800000    # -1.0f

    .line 375
    .line 376
    const/high16 v6, 0x3f800000    # 1.0f

    .line 377
    .line 378
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    invoke-virtual {v7, v14}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const v1, -0x40f33333    # -0.55f

    .line 385
    .line 386
    .line 387
    const/4 v2, 0x0

    .line 388
    const/high16 v3, -0x40800000    # -1.0f

    .line 389
    .line 390
    const v4, -0x4119999a    # -0.45f

    .line 391
    .line 392
    .line 393
    const/high16 v6, -0x40800000    # -1.0f

    .line 394
    .line 395
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const/high16 v0, -0x40000000    # -2.0f

    .line 399
    .line 400
    invoke-virtual {v7, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const/4 v1, 0x0

    .line 404
    const v2, -0x40f33333    # -0.55f

    .line 405
    .line 406
    .line 407
    const v3, -0x4119999a    # -0.45f

    .line 408
    .line 409
    .line 410
    const/high16 v4, -0x40800000    # -1.0f

    .line 411
    .line 412
    move-object v0, v7

    .line 413
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    invoke-virtual {v7, v12, v8, v12, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v7, v10}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v2, 0x3f8ccccd    # 1.1f

    .line 423
    .line 424
    .line 425
    const v3, 0x3f666666    # 0.9f

    .line 426
    .line 427
    .line 428
    const/high16 v4, 0x40000000    # 2.0f

    .line 429
    .line 430
    const/high16 v5, 0x40000000    # 2.0f

    .line 431
    .line 432
    const/high16 v6, 0x40000000    # 2.0f

    .line 433
    .line 434
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/high16 v0, 0x41600000    # 14.0f

    .line 438
    .line 439
    invoke-virtual {v7, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v1, 0x3f8ccccd    # 1.1f

    .line 443
    .line 444
    .line 445
    const/4 v2, 0x0

    .line 446
    const/high16 v3, 0x40000000    # 2.0f

    .line 447
    .line 448
    const v4, -0x4099999a    # -0.9f

    .line 449
    .line 450
    .line 451
    const/high16 v6, -0x40000000    # -2.0f

    .line 452
    .line 453
    move-object v0, v7

    .line 454
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v0, 0x40a00000    # 5.0f

    .line 458
    .line 459
    invoke-virtual {v7, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const/4 v1, 0x0

    .line 463
    const v2, -0x40733333    # -1.1f

    .line 464
    .line 465
    .line 466
    const v3, -0x4099999a    # -0.9f

    .line 467
    .line 468
    .line 469
    const/high16 v4, -0x40000000    # -2.0f

    .line 470
    .line 471
    const/high16 v5, -0x40000000    # -2.0f

    .line 472
    .line 473
    move-object v0, v7

    .line 474
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 481
    .line 482
    .line 483
    move-result-object v14

    .line 484
    const/16 v25, 0x0

    .line 485
    .line 486
    const/16 v26, 0x0

    .line 487
    .line 488
    const/16 v27, 0x0

    .line 489
    .line 490
    const/16 v28, 0x3800

    .line 491
    .line 492
    const/16 v29, 0x0

    .line 493
    .line 494
    invoke-static/range {v13 .. v29}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    sput-object v0, Landroidx/compose/material/icons/rounded/ExitToAppKt;->_exitToApp:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 503
    .line 504
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 505
    .line 506
    .line 507
    return-object v0
.end method
