.class public final Landroidx/compose/material/icons/outlined/Face2Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_face2",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Face2",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getFace2",
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
        "SMAP\nFace2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Face2.kt\nandroidx/compose/material/icons/outlined/Face2Kt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,114:1\n212#2,12:115\n233#2,18:128\n253#2:165\n233#2,18:166\n253#2:203\n233#2,18:204\n253#2:241\n174#3:127\n705#4,2:146\n717#4,2:148\n719#4,11:154\n705#4,2:184\n717#4,2:186\n719#4,11:192\n705#4,2:222\n717#4,2:224\n719#4,11:230\n72#5,4:150\n72#5,4:188\n72#5,4:226\n*S KotlinDebug\n*F\n+ 1 Face2.kt\nandroidx/compose/material/icons/outlined/Face2Kt\n*L\n29#1:115,12\n30#1:128,18\n30#1:165\n97#1:166,18\n97#1:203\n103#1:204,18\n103#1:241\n29#1:127\n30#1:146,2\n30#1:148,2\n30#1:154,11\n97#1:184,2\n97#1:186,2\n97#1:192,11\n103#1:222,2\n103#1:224,2\n103#1:230,11\n30#1:150,4\n97#1:188,4\n103#1:226,4\n*E\n"
    }
.end annotation


# static fields
.field private static _face2:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFace2(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/Face2Kt;->_face2:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Face2"

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
    const v4, 0x41afc28f    # 21.97f

    .line 71
    .line 72
    .line 73
    const v6, 0x415851ec    # 13.52f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/16 v25, 0x0

    .line 80
    .line 81
    const v26, -0x42dc28f6    # -0.04f

    .line 82
    .line 83
    .line 84
    const/16 v21, 0x0

    .line 85
    .line 86
    const v22, -0x43dc28f6    # -0.01f

    .line 87
    .line 88
    .line 89
    const/16 v23, 0x0

    .line 90
    .line 91
    const v24, -0x435c28f6    # -0.02f

    .line 92
    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v25, 0x41c00000    # 24.0f

    .line 100
    .line 101
    const/high16 v26, 0x41100000    # 9.0f

    .line 102
    .line 103
    const v21, 0x41b9ae14    # 23.21f

    .line 104
    .line 105
    .line 106
    const v22, 0x4146147b    # 12.38f

    .line 107
    .line 108
    .line 109
    const/high16 v23, 0x41c00000    # 24.0f

    .line 110
    .line 111
    const v24, 0x412c7ae1    # 10.78f

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v25, -0x3f400000    # -6.0f

    .line 118
    .line 119
    const/high16 v26, -0x3f400000    # -6.0f

    .line 120
    .line 121
    const/16 v21, 0x0

    .line 122
    .line 123
    const v22, -0x3fac28f6    # -3.31f

    .line 124
    .line 125
    .line 126
    const v23, -0x3fd3d70a    # -2.69f

    .line 127
    .line 128
    .line 129
    const/high16 v24, -0x3f400000    # -6.0f

    .line 130
    .line 131
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v25, -0x40b851ec    # -0.78f

    .line 135
    .line 136
    .line 137
    const v26, 0x3d75c28f    # 0.06f

    .line 138
    .line 139
    .line 140
    const v21, -0x417ae148    # -0.26f

    .line 141
    .line 142
    .line 143
    const/16 v22, 0x0

    .line 144
    .line 145
    const v23, -0x40fae148    # -0.52f

    .line 146
    .line 147
    .line 148
    const v24, 0x3ca3d70a    # 0.02f

    .line 149
    .line 150
    .line 151
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v25, 0x41400000    # 12.0f

    .line 155
    .line 156
    const/16 v26, 0x0

    .line 157
    .line 158
    const v21, 0x4181851f    # 16.19f

    .line 159
    .line 160
    .line 161
    const v22, 0x3f9d70a4    # 1.23f

    .line 162
    .line 163
    .line 164
    const v23, 0x4163d70a    # 14.24f

    .line 165
    .line 166
    .line 167
    const/16 v24, 0x0

    .line 168
    .line 169
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v4, 0x40d8f5c3    # 6.78f

    .line 173
    .line 174
    .line 175
    const v6, 0x4043d70a    # 3.06f

    .line 176
    .line 177
    .line 178
    const v7, 0x40f9eb85    # 7.81f

    .line 179
    .line 180
    .line 181
    const v8, 0x3f9d70a4    # 1.23f

    .line 182
    .line 183
    .line 184
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v25, 0x40c00000    # 6.0f

    .line 188
    .line 189
    const/high16 v26, 0x40400000    # 3.0f

    .line 190
    .line 191
    const v21, 0x40d0a3d7    # 6.52f

    .line 192
    .line 193
    .line 194
    const v22, 0x404147ae    # 3.02f

    .line 195
    .line 196
    .line 197
    const v23, 0x40c851ec    # 6.26f

    .line 198
    .line 199
    .line 200
    const/high16 v24, 0x40400000    # 3.0f

    .line 201
    .line 202
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/16 v25, 0x0

    .line 206
    .line 207
    const/high16 v26, 0x41100000    # 9.0f

    .line 208
    .line 209
    const v21, 0x402c28f6    # 2.69f

    .line 210
    .line 211
    .line 212
    const/high16 v22, 0x40400000    # 3.0f

    .line 213
    .line 214
    const/16 v23, 0x0

    .line 215
    .line 216
    const v24, 0x40b6147b    # 5.69f

    .line 217
    .line 218
    .line 219
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v25, 0x400147ae    # 2.02f

    .line 223
    .line 224
    .line 225
    const v26, 0x408f5c29    # 4.48f

    .line 226
    .line 227
    .line 228
    const/16 v21, 0x0

    .line 229
    .line 230
    const v22, 0x3fe3d70a    # 1.78f

    .line 231
    .line 232
    .line 233
    const v23, 0x3f4a3d71    # 0.79f

    .line 234
    .line 235
    .line 236
    const v24, 0x405851ec    # 3.38f

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/16 v25, 0x0

    .line 243
    .line 244
    const v26, 0x3d23d70a    # 0.04f

    .line 245
    .line 246
    .line 247
    const v22, 0x3c23d70a    # 0.01f

    .line 248
    .line 249
    .line 250
    const/16 v23, 0x0

    .line 251
    .line 252
    const v24, 0x3ca3d70a    # 0.02f

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v26, 0x41900000    # 18.0f

    .line 259
    .line 260
    const v21, 0x3f4a3d71    # 0.79f

    .line 261
    .line 262
    .line 263
    const v22, 0x4169eb85    # 14.62f

    .line 264
    .line 265
    .line 266
    const v24, 0x4181c28f    # 16.22f

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v25, 0x40c00000    # 6.0f

    .line 273
    .line 274
    const/high16 v26, 0x40c00000    # 6.0f

    .line 275
    .line 276
    const/16 v21, 0x0

    .line 277
    .line 278
    const v22, 0x4053d70a    # 3.31f

    .line 279
    .line 280
    .line 281
    const v23, 0x402c28f6    # 2.69f

    .line 282
    .line 283
    .line 284
    const/high16 v24, 0x40c00000    # 6.0f

    .line 285
    .line 286
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v25, 0x406c28f6    # 3.69f

    .line 290
    .line 291
    .line 292
    const v26, -0x405c28f6    # -1.28f

    .line 293
    .line 294
    .line 295
    const v21, 0x3fb1eb85    # 1.39f

    .line 296
    .line 297
    .line 298
    const/16 v22, 0x0

    .line 299
    .line 300
    const v23, 0x402ae148    # 2.67f

    .line 301
    .line 302
    .line 303
    const v24, -0x410a3d71    # -0.48f

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const/high16 v25, 0x41400000    # 12.0f

    .line 310
    .line 311
    const/high16 v26, 0x41b80000    # 23.0f

    .line 312
    .line 313
    const v21, 0x4126e148    # 10.43f

    .line 314
    .line 315
    .line 316
    const v22, 0x41b73333    # 22.9f

    .line 317
    .line 318
    .line 319
    const v23, 0x41333333    # 11.2f

    .line 320
    .line 321
    .line 322
    const/high16 v24, 0x41b80000    # 23.0f

    .line 323
    .line 324
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v4, 0x4013d70a    # 2.31f

    .line 328
    .line 329
    .line 330
    const v6, -0x4170a3d7    # -0.28f

    .line 331
    .line 332
    .line 333
    const v7, 0x3fc8f5c3    # 1.57f

    .line 334
    .line 335
    .line 336
    const v8, -0x42333333    # -0.1f

    .line 337
    .line 338
    .line 339
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v25, 0x41900000    # 18.0f

    .line 343
    .line 344
    const/high16 v26, 0x41c00000    # 24.0f

    .line 345
    .line 346
    const v21, 0x417547ae    # 15.33f

    .line 347
    .line 348
    .line 349
    const v22, 0x41bc28f6    # 23.52f

    .line 350
    .line 351
    .line 352
    const v23, 0x4184e148    # 16.61f

    .line 353
    .line 354
    .line 355
    const/high16 v24, 0x41c00000    # 24.0f

    .line 356
    .line 357
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/high16 v25, 0x40c00000    # 6.0f

    .line 361
    .line 362
    const/high16 v26, -0x3f400000    # -6.0f

    .line 363
    .line 364
    const v21, 0x4053d70a    # 3.31f

    .line 365
    .line 366
    .line 367
    const/16 v22, 0x0

    .line 368
    .line 369
    const/high16 v23, 0x40c00000    # 6.0f

    .line 370
    .line 371
    const v24, -0x3fd3d70a    # -2.69f

    .line 372
    .line 373
    .line 374
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const v25, 0x41afc28f    # 21.97f

    .line 378
    .line 379
    .line 380
    const v26, 0x415851ec    # 13.52f

    .line 381
    .line 382
    .line 383
    const/high16 v21, 0x41c00000    # 24.0f

    .line 384
    .line 385
    const v22, 0x4181c28f    # 16.22f

    .line 386
    .line 387
    .line 388
    const v23, 0x41b9ae14    # 23.21f

    .line 389
    .line 390
    .line 391
    const v24, 0x4169eb85    # 14.62f

    .line 392
    .line 393
    .line 394
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v4, 0x41100000    # 9.0f

    .line 401
    .line 402
    const/high16 v6, 0x41b00000    # 22.0f

    .line 403
    .line 404
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v25, -0x415c28f6    # -0.32f

    .line 408
    .line 409
    .line 410
    const v26, 0x3fc51eb8    # 1.54f

    .line 411
    .line 412
    .line 413
    const/16 v21, 0x0

    .line 414
    .line 415
    const v22, 0x3f0ccccd    # 0.55f

    .line 416
    .line 417
    .line 418
    const v23, -0x420a3d71    # -0.12f

    .line 419
    .line 420
    .line 421
    const v24, 0x3f88f5c3    # 1.07f

    .line 422
    .line 423
    .line 424
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v25, -0x3f933333    # -3.7f

    .line 428
    .line 429
    .line 430
    const v26, -0x3f4eb852    # -5.54f

    .line 431
    .line 432
    .line 433
    const v21, -0x40ee147b    # -0.57f

    .line 434
    .line 435
    .line 436
    const/high16 v22, -0x3ff00000    # -2.25f

    .line 437
    .line 438
    const v23, -0x400ccccd    # -1.9f

    .line 439
    .line 440
    .line 441
    const v24, -0x3f79eb85    # -4.19f

    .line 442
    .line 443
    .line 444
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v25, 0x3ca3d70a    # 0.02f

    .line 448
    .line 449
    .line 450
    const/16 v26, 0x0

    .line 451
    .line 452
    const v21, 0x3c23d70a    # 0.01f

    .line 453
    .line 454
    .line 455
    const/16 v22, 0x0

    .line 456
    .line 457
    const v23, 0x3c23d70a    # 0.01f

    .line 458
    .line 459
    .line 460
    const/16 v24, 0x0

    .line 461
    .line 462
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const/high16 v25, 0x41b00000    # 22.0f

    .line 466
    .line 467
    const/high16 v26, 0x41100000    # 9.0f

    .line 468
    .line 469
    const v21, 0x41a1ae14    # 20.21f

    .line 470
    .line 471
    .line 472
    const/high16 v22, 0x40a00000    # 5.0f

    .line 473
    .line 474
    const/high16 v23, 0x41b00000    # 22.0f

    .line 475
    .line 476
    const v24, 0x40d947ae    # 6.79f

    .line 477
    .line 478
    .line 479
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v4, 0x41407ae1    # 12.03f

    .line 486
    .line 487
    .line 488
    const/high16 v6, 0x40a00000    # 5.0f

    .line 489
    .line 490
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const v25, 0x40d23d71    # 6.57f

    .line 494
    .line 495
    .line 496
    const v26, 0x405eb852    # 3.48f

    .line 497
    .line 498
    .line 499
    const v21, 0x402eb852    # 2.73f

    .line 500
    .line 501
    .line 502
    const v22, 0x3c23d70a    # 0.01f

    .line 503
    .line 504
    .line 505
    const v23, 0x40a428f6    # 5.13f

    .line 506
    .line 507
    .line 508
    const v24, 0x3fb1eb85    # 1.39f

    .line 509
    .line 510
    .line 511
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const v25, -0x3fde147b    # -2.53f

    .line 515
    .line 516
    .line 517
    const v26, 0x3f63d70a    # 0.89f

    .line 518
    .line 519
    .line 520
    const v21, -0x40ca3d71    # -0.71f

    .line 521
    .line 522
    .line 523
    const v22, 0x3f11eb85    # 0.57f

    .line 524
    .line 525
    .line 526
    const v23, -0x40333333    # -1.6f

    .line 527
    .line 528
    .line 529
    const v24, 0x3f63d70a    # 0.89f

    .line 530
    .line 531
    .line 532
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const/high16 v25, 0x41400000    # 12.0f

    .line 536
    .line 537
    const v26, 0x40a9eb85    # 5.31f

    .line 538
    .line 539
    .line 540
    const v21, 0x415d1eb8    # 13.82f

    .line 541
    .line 542
    .line 543
    const v22, 0x4116147b    # 9.38f

    .line 544
    .line 545
    .line 546
    const/high16 v23, 0x41400000    # 12.0f

    .line 547
    .line 548
    const v24, 0x40f1999a    # 7.55f

    .line 549
    .line 550
    .line 551
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const v25, 0x41407ae1    # 12.03f

    .line 555
    .line 556
    .line 557
    const/high16 v26, 0x40a00000    # 5.0f

    .line 558
    .line 559
    const/high16 v21, 0x41400000    # 12.0f

    .line 560
    .line 561
    const v22, 0x40a6b852    # 5.21f

    .line 562
    .line 563
    .line 564
    const v23, 0x414051ec    # 12.02f

    .line 565
    .line 566
    .line 567
    const v24, 0x40a3851f    # 5.11f

    .line 568
    .line 569
    .line 570
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const/high16 v4, 0x41400000    # 12.0f

    .line 577
    .line 578
    const/high16 v6, 0x40000000    # 2.0f

    .line 579
    .line 580
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const v25, 0x40466666    # 3.1f

    .line 584
    .line 585
    .line 586
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 587
    .line 588
    const/high16 v21, 0x3fa00000    # 1.25f

    .line 589
    .line 590
    const/16 v22, 0x0

    .line 591
    .line 592
    const v23, 0x40170a3d    # 2.36f

    .line 593
    .line 594
    .line 595
    const v24, 0x3f170a3d    # 0.59f

    .line 596
    .line 597
    .line 598
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    const/high16 v25, 0x41400000    # 12.0f

    .line 602
    .line 603
    const/high16 v26, 0x40400000    # 3.0f

    .line 604
    .line 605
    const v21, 0x4161eb85    # 14.12f

    .line 606
    .line 607
    .line 608
    const v22, 0x404b851f    # 3.18f

    .line 609
    .line 610
    .line 611
    const v23, 0x415147ae    # 13.08f

    .line 612
    .line 613
    .line 614
    const/high16 v24, 0x40400000    # 3.0f

    .line 615
    .line 616
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const v4, 0x410e6666    # 8.9f

    .line 620
    .line 621
    .line 622
    const/high16 v6, 0x40600000    # 3.5f

    .line 623
    .line 624
    const v7, 0x411e147b    # 9.88f

    .line 625
    .line 626
    .line 627
    const v8, 0x404b851f    # 3.18f

    .line 628
    .line 629
    .line 630
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const/high16 v26, 0x40000000    # 2.0f

    .line 634
    .line 635
    const v21, 0x411a3d71    # 9.64f

    .line 636
    .line 637
    .line 638
    const v22, 0x4025c28f    # 2.59f

    .line 639
    .line 640
    .line 641
    const/high16 v23, 0x412c0000    # 10.75f

    .line 642
    .line 643
    const/high16 v24, 0x40000000    # 2.0f

    .line 644
    .line 645
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    const/high16 v4, 0x40c00000    # 6.0f

    .line 652
    .line 653
    const/high16 v6, 0x40a00000    # 5.0f

    .line 654
    .line 655
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const v25, 0x3ca3d70a    # 0.02f

    .line 659
    .line 660
    .line 661
    const/16 v26, 0x0

    .line 662
    .line 663
    const v21, 0x3c23d70a    # 0.01f

    .line 664
    .line 665
    .line 666
    const/16 v22, 0x0

    .line 667
    .line 668
    const v23, 0x3c23d70a    # 0.01f

    .line 669
    .line 670
    .line 671
    const/16 v24, 0x0

    .line 672
    .line 673
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const v25, -0x3f933333    # -3.7f

    .line 677
    .line 678
    .line 679
    const v26, 0x40b147ae    # 5.54f

    .line 680
    .line 681
    .line 682
    const v21, -0x4019999a    # -1.8f

    .line 683
    .line 684
    .line 685
    const v22, 0x3faccccd    # 1.35f

    .line 686
    .line 687
    .line 688
    const v23, -0x3fb7ae14    # -3.13f

    .line 689
    .line 690
    .line 691
    const v24, 0x40528f5c    # 3.29f

    .line 692
    .line 693
    .line 694
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    const/high16 v25, 0x40000000    # 2.0f

    .line 698
    .line 699
    const/high16 v26, 0x41100000    # 9.0f

    .line 700
    .line 701
    const v21, 0x4007ae14    # 2.12f

    .line 702
    .line 703
    .line 704
    const v22, 0x41211eb8    # 10.07f

    .line 705
    .line 706
    .line 707
    const/high16 v23, 0x40000000    # 2.0f

    .line 708
    .line 709
    const v24, 0x4118cccd    # 9.55f

    .line 710
    .line 711
    .line 712
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 713
    .line 714
    .line 715
    const/high16 v25, 0x40c00000    # 6.0f

    .line 716
    .line 717
    const/high16 v26, 0x40a00000    # 5.0f

    .line 718
    .line 719
    const/high16 v21, 0x40000000    # 2.0f

    .line 720
    .line 721
    const v22, 0x40d947ae    # 6.79f

    .line 722
    .line 723
    .line 724
    const v23, 0x40728f5c    # 3.79f

    .line 725
    .line 726
    .line 727
    const/high16 v24, 0x40a00000    # 5.0f

    .line 728
    .line 729
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 733
    .line 734
    .line 735
    const/high16 v6, 0x41b00000    # 22.0f

    .line 736
    .line 737
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    const/high16 v25, -0x3f800000    # -4.0f

    .line 741
    .line 742
    const/high16 v26, -0x3f800000    # -4.0f

    .line 743
    .line 744
    const v21, -0x3ff28f5c    # -2.21f

    .line 745
    .line 746
    .line 747
    const/16 v22, 0x0

    .line 748
    .line 749
    const/high16 v23, -0x3f800000    # -4.0f

    .line 750
    .line 751
    const v24, -0x401ae148    # -1.79f

    .line 752
    .line 753
    .line 754
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 755
    .line 756
    .line 757
    const/high16 v25, 0x3f000000    # 0.5f

    .line 758
    .line 759
    const v26, -0x400f5c29    # -1.88f

    .line 760
    .line 761
    .line 762
    const/16 v21, 0x0

    .line 763
    .line 764
    const v22, -0x40cf5c29    # -0.69f

    .line 765
    .line 766
    .line 767
    const v23, 0x3e428f5c    # 0.19f

    .line 768
    .line 769
    .line 770
    const v24, -0x40570a3d    # -1.32f

    .line 771
    .line 772
    .line 773
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 774
    .line 775
    .line 776
    const v25, 0x4097ae14    # 4.74f

    .line 777
    .line 778
    .line 779
    const v26, 0x40b5c28f    # 5.68f

    .line 780
    .line 781
    .line 782
    const v21, 0x3f4ccccd    # 0.8f

    .line 783
    .line 784
    .line 785
    const v22, 0x401c28f6    # 2.44f

    .line 786
    .line 787
    .line 788
    const v23, 0x402147ae    # 2.52f

    .line 789
    .line 790
    .line 791
    const v24, 0x408f0a3d    # 4.47f

    .line 792
    .line 793
    .line 794
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 795
    .line 796
    .line 797
    const/high16 v25, 0x40c00000    # 6.0f

    .line 798
    .line 799
    const/high16 v26, 0x41b00000    # 22.0f

    .line 800
    .line 801
    const v21, 0x40db3333    # 6.85f

    .line 802
    .line 803
    .line 804
    const v22, 0x41af70a4    # 21.93f

    .line 805
    .line 806
    .line 807
    const v23, 0x40ce147b    # 6.44f

    .line 808
    .line 809
    .line 810
    const/high16 v24, 0x41b00000    # 22.0f

    .line 811
    .line 812
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 813
    .line 814
    .line 815
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 816
    .line 817
    .line 818
    const/high16 v4, 0x41500000    # 13.0f

    .line 819
    .line 820
    const/high16 v6, 0x40800000    # 4.0f

    .line 821
    .line 822
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 823
    .line 824
    .line 825
    const v26, -0x3f0851ec    # -7.74f

    .line 826
    .line 827
    .line 828
    const/16 v21, 0x0

    .line 829
    .line 830
    const v22, -0x3f91eb85    # -3.72f

    .line 831
    .line 832
    .line 833
    const v23, 0x4023d70a    # 2.56f

    .line 834
    .line 835
    .line 836
    const v24, -0x3f24cccd    # -6.85f

    .line 837
    .line 838
    .line 839
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 840
    .line 841
    .line 842
    const/16 v25, 0x0

    .line 843
    .line 844
    const v26, 0x3d4ccccd    # 0.05f

    .line 845
    .line 846
    .line 847
    const v22, 0x3ca3d70a    # 0.02f

    .line 848
    .line 849
    .line 850
    const/16 v23, 0x0

    .line 851
    .line 852
    const v24, 0x3cf5c28f    # 0.03f

    .line 853
    .line 854
    .line 855
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 856
    .line 857
    .line 858
    const v25, 0x40c1eb85    # 6.06f

    .line 859
    .line 860
    .line 861
    const v26, 0x40c1eb85    # 6.06f

    .line 862
    .line 863
    .line 864
    const v22, 0x4055c28f    # 3.34f

    .line 865
    .line 866
    .line 867
    const v23, 0x402e147b    # 2.72f

    .line 868
    .line 869
    .line 870
    const v24, 0x40c1eb85    # 6.06f

    .line 871
    .line 872
    .line 873
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 874
    .line 875
    .line 876
    const v25, 0x405ccccd    # 3.45f

    .line 877
    .line 878
    .line 879
    const v26, -0x40747ae1    # -1.09f

    .line 880
    .line 881
    .line 882
    const v21, 0x3fa147ae    # 1.26f

    .line 883
    .line 884
    .line 885
    const/16 v22, 0x0

    .line 886
    .line 887
    const v23, 0x401ccccd    # 2.45f

    .line 888
    .line 889
    .line 890
    const v24, -0x413851ec    # -0.39f

    .line 891
    .line 892
    .line 893
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 894
    .line 895
    .line 896
    const/high16 v25, 0x41a00000    # 20.0f

    .line 897
    .line 898
    const/high16 v26, 0x41500000    # 13.0f

    .line 899
    .line 900
    const v21, 0x419e8f5c    # 19.82f

    .line 901
    .line 902
    .line 903
    const v22, 0x41323d71    # 11.14f

    .line 904
    .line 905
    .line 906
    const/high16 v23, 0x41a00000    # 20.0f

    .line 907
    .line 908
    const v24, 0x4140cccd    # 12.05f

    .line 909
    .line 910
    .line 911
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 912
    .line 913
    .line 914
    const/high16 v25, -0x3f000000    # -8.0f

    .line 915
    .line 916
    const/high16 v26, 0x41000000    # 8.0f

    .line 917
    .line 918
    const/16 v21, 0x0

    .line 919
    .line 920
    const v22, 0x408d1eb8    # 4.41f

    .line 921
    .line 922
    .line 923
    const v23, -0x3f9a3d71    # -3.59f

    .line 924
    .line 925
    .line 926
    const/high16 v24, 0x41000000    # 8.0f

    .line 927
    .line 928
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 929
    .line 930
    .line 931
    const v4, 0x418b47ae    # 17.41f

    .line 932
    .line 933
    .line 934
    const/high16 v6, 0x41500000    # 13.0f

    .line 935
    .line 936
    const/high16 v7, 0x40800000    # 4.0f

    .line 937
    .line 938
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 939
    .line 940
    .line 941
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 942
    .line 943
    .line 944
    const/high16 v4, 0x41900000    # 18.0f

    .line 945
    .line 946
    const/high16 v6, 0x41b00000    # 22.0f

    .line 947
    .line 948
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 949
    .line 950
    .line 951
    const/high16 v25, -0x40600000    # -1.25f

    .line 952
    .line 953
    const v26, -0x41b33333    # -0.2f

    .line 954
    .line 955
    .line 956
    const v21, -0x411eb852    # -0.44f

    .line 957
    .line 958
    .line 959
    const/16 v22, 0x0

    .line 960
    .line 961
    const v23, -0x40a66666    # -0.85f

    .line 962
    .line 963
    .line 964
    const v24, -0x4270a3d7    # -0.07f

    .line 965
    .line 966
    .line 967
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 968
    .line 969
    .line 970
    const v25, 0x4097ae14    # 4.74f

    .line 971
    .line 972
    .line 973
    const v26, -0x3f4a3d71    # -5.68f

    .line 974
    .line 975
    .line 976
    const v21, 0x400eb852    # 2.23f

    .line 977
    .line 978
    .line 979
    const v22, -0x40651eb8    # -1.21f

    .line 980
    .line 981
    .line 982
    const v23, 0x407c28f6    # 3.94f

    .line 983
    .line 984
    .line 985
    const v24, -0x3fb0a3d7    # -3.24f

    .line 986
    .line 987
    .line 988
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 989
    .line 990
    .line 991
    const/high16 v25, 0x3f000000    # 0.5f

    .line 992
    .line 993
    const v26, 0x3ff0a3d7    # 1.88f

    .line 994
    .line 995
    .line 996
    const v21, 0x3e9eb852    # 0.31f

    .line 997
    .line 998
    .line 999
    const v22, 0x3f0f5c29    # 0.56f

    .line 1000
    .line 1001
    .line 1002
    const/high16 v23, 0x3f000000    # 0.5f

    .line 1003
    .line 1004
    const v24, 0x3f99999a    # 1.2f

    .line 1005
    .line 1006
    .line 1007
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1008
    .line 1009
    .line 1010
    const/high16 v25, 0x41900000    # 18.0f

    .line 1011
    .line 1012
    const/high16 v26, 0x41b00000    # 22.0f

    .line 1013
    .line 1014
    const/high16 v21, 0x41b00000    # 22.0f

    .line 1015
    .line 1016
    const v22, 0x41a1ae14    # 20.21f

    .line 1017
    .line 1018
    .line 1019
    const v23, 0x41a1ae14    # 20.21f

    .line 1020
    .line 1021
    .line 1022
    const/high16 v24, 0x41b00000    # 22.0f

    .line 1023
    .line 1024
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1025
    .line 1026
    .line 1027
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1028
    .line 1029
    .line 1030
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v2

    .line 1034
    const/16 v16, 0x3800

    .line 1035
    .line 1036
    const/16 v17, 0x0

    .line 1037
    .line 1038
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1039
    .line 1040
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1041
    .line 1042
    const/4 v7, 0x0

    .line 1043
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1044
    .line 1045
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1046
    .line 1047
    const/4 v13, 0x0

    .line 1048
    const/4 v14, 0x0

    .line 1049
    const/4 v15, 0x0

    .line 1050
    const-string v4, ""

    .line 1051
    .line 1052
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1053
    .line 1054
    .line 1055
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1056
    .line 1057
    .line 1058
    move-result v3

    .line 1059
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1060
    .line 1061
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1062
    .line 1063
    .line 1064
    move-result-wide v6

    .line 1065
    const/4 v2, 0x0

    .line 1066
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1067
    .line 1068
    .line 1069
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1070
    .line 1071
    .line 1072
    move-result v10

    .line 1073
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1074
    .line 1075
    .line 1076
    move-result v11

    .line 1077
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1078
    .line 1079
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1080
    .line 1081
    .line 1082
    const/high16 v4, 0x41600000    # 14.0f

    .line 1083
    .line 1084
    const/high16 v6, 0x41100000    # 9.0f

    .line 1085
    .line 1086
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1087
    .line 1088
    .line 1089
    const/4 v4, 0x0

    .line 1090
    const/high16 v6, -0x40600000    # -1.25f

    .line 1091
    .line 1092
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1093
    .line 1094
    .line 1095
    const/high16 v26, 0x40200000    # 2.5f

    .line 1096
    .line 1097
    const/16 v27, 0x0

    .line 1098
    .line 1099
    const/high16 v21, 0x3fa00000    # 1.25f

    .line 1100
    .line 1101
    const/high16 v22, 0x3fa00000    # 1.25f

    .line 1102
    .line 1103
    const/16 v23, 0x0

    .line 1104
    .line 1105
    const/16 v24, 0x1

    .line 1106
    .line 1107
    const/16 v25, 0x1

    .line 1108
    .line 1109
    move-object/from16 v20, v2

    .line 1110
    .line 1111
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1112
    .line 1113
    .line 1114
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 1115
    .line 1116
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1117
    .line 1118
    .line 1119
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v2

    .line 1123
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1124
    .line 1125
    const/4 v7, 0x0

    .line 1126
    const-string v4, ""

    .line 1127
    .line 1128
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1129
    .line 1130
    .line 1131
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1132
    .line 1133
    .line 1134
    move-result v3

    .line 1135
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1136
    .line 1137
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1138
    .line 1139
    .line 1140
    move-result-wide v6

    .line 1141
    const/4 v0, 0x0

    .line 1142
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1143
    .line 1144
    .line 1145
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1146
    .line 1147
    .line 1148
    move-result v10

    .line 1149
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1150
    .line 1151
    .line 1152
    move-result v11

    .line 1153
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1154
    .line 1155
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1156
    .line 1157
    .line 1158
    const/high16 v0, 0x41700000    # 15.0f

    .line 1159
    .line 1160
    const/high16 v2, 0x41600000    # 14.0f

    .line 1161
    .line 1162
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1163
    .line 1164
    .line 1165
    const/4 v0, 0x0

    .line 1166
    const/high16 v2, -0x40600000    # -1.25f

    .line 1167
    .line 1168
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1169
    .line 1170
    .line 1171
    const/high16 v18, 0x40200000    # 2.5f

    .line 1172
    .line 1173
    const/16 v19, 0x0

    .line 1174
    .line 1175
    const/high16 v13, 0x3fa00000    # 1.25f

    .line 1176
    .line 1177
    const/high16 v14, 0x3fa00000    # 1.25f

    .line 1178
    .line 1179
    const/16 v16, 0x1

    .line 1180
    .line 1181
    const/16 v17, 0x1

    .line 1182
    .line 1183
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1184
    .line 1185
    .line 1186
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 1187
    .line 1188
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1189
    .line 1190
    .line 1191
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v2

    .line 1195
    const/16 v16, 0x3800

    .line 1196
    .line 1197
    const/16 v17, 0x0

    .line 1198
    .line 1199
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1200
    .line 1201
    const/4 v7, 0x0

    .line 1202
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1203
    .line 1204
    const/4 v13, 0x0

    .line 1205
    const/4 v14, 0x0

    .line 1206
    const-string v4, ""

    .line 1207
    .line 1208
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1209
    .line 1210
    .line 1211
    move-result-object v0

    .line 1212
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v0

    .line 1216
    sput-object v0, Landroidx/compose/material/icons/outlined/Face2Kt;->_face2:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1217
    .line 1218
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1219
    .line 1220
    .line 1221
    return-object v0
.end method
