.class public final Landroidx/compose/material/icons/rounded/ClosedCaptionDisabledKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_closedCaptionDisabled",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "ClosedCaptionDisabled",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getClosedCaptionDisabled",
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
        "SMAP\nClosedCaptionDisabled.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClosedCaptionDisabled.kt\nandroidx/compose/material/icons/rounded/ClosedCaptionDisabledKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,90:1\n212#2,12:91\n233#2,18:104\n253#2:141\n174#3:103\n705#4,2:122\n717#4,2:124\n719#4,11:130\n72#5,4:126\n*S KotlinDebug\n*F\n+ 1 ClosedCaptionDisabled.kt\nandroidx/compose/material/icons/rounded/ClosedCaptionDisabledKt\n*L\n29#1:91,12\n30#1:104,18\n30#1:141\n29#1:103\n30#1:122,2\n30#1:124,2\n30#1:130,11\n30#1:126,4\n*E\n"
    }
.end annotation


# static fields
.field private static _closedCaptionDisabled:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getClosedCaptionDisabled(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ClosedCaptionDisabledKt;->_closedCaptionDisabled:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.ClosedCaptionDisabled"

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
    const v0, 0x40da8f5c    # 6.83f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x40800000    # 4.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v0, 0x41980000    # 19.0f

    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v17, 0x40000000    # 2.0f

    .line 84
    .line 85
    const/high16 v18, 0x40000000    # 2.0f

    .line 86
    .line 87
    const v13, 0x3f8ccccd    # 1.1f

    .line 88
    .line 89
    .line 90
    const/4 v14, 0x0

    .line 91
    const/high16 v15, 0x40000000    # 2.0f

    .line 92
    .line 93
    const v16, 0x3f666666    # 0.9f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v0, 0x41400000    # 12.0f

    .line 100
    .line 101
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v17, -0x435c28f6    # -0.02f

    .line 105
    .line 106
    .line 107
    const v18, 0x3e23d70a    # 0.16f

    .line 108
    .line 109
    .line 110
    const/4 v13, 0x0

    .line 111
    const v14, 0x3d4ccccd    # 0.05f

    .line 112
    .line 113
    .line 114
    const v15, -0x43dc28f6    # -0.01f

    .line 115
    .line 116
    .line 117
    const v16, 0x3dcccccd    # 0.1f

    .line 118
    .line 119
    .line 120
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v0, -0x3fa7ae14    # -3.38f

    .line 124
    .line 125
    .line 126
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v17, 0x41900000    # 18.0f

    .line 130
    .line 131
    const/high16 v18, 0x41600000    # 14.0f

    .line 132
    .line 133
    const v13, 0x418eb852    # 17.84f

    .line 134
    .line 135
    .line 136
    const v14, 0x416970a4    # 14.59f

    .line 137
    .line 138
    .line 139
    const/high16 v15, 0x41900000    # 18.0f

    .line 140
    .line 141
    const v16, 0x41651eb8    # 14.32f

    .line 142
    .line 143
    .line 144
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v0, -0x41000000    # -0.5f

    .line 148
    .line 149
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v17, -0x41000000    # -0.5f

    .line 153
    .line 154
    const/high16 v18, -0x41000000    # -0.5f

    .line 155
    .line 156
    const/4 v13, 0x0

    .line 157
    const v14, -0x4170a3d7    # -0.28f

    .line 158
    .line 159
    .line 160
    const v15, -0x419eb852    # -0.22f

    .line 161
    .line 162
    .line 163
    const/high16 v16, -0x41000000    # -0.5f

    .line 164
    .line 165
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v0, 0x41880000    # 17.0f

    .line 169
    .line 170
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v18, 0x3f000000    # 0.5f

    .line 174
    .line 175
    const v13, -0x4170a3d7    # -0.28f

    .line 176
    .line 177
    .line 178
    const/4 v14, 0x0

    .line 179
    const/high16 v15, -0x41000000    # -0.5f

    .line 180
    .line 181
    const v16, 0x3e6147ae    # 0.22f

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v0, -0x41d1eb85    # -0.17f

    .line 188
    .line 189
    .line 190
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v0, -0x4015c28f    # -1.83f

    .line 194
    .line 195
    .line 196
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/high16 v0, 0x41280000    # 10.5f

    .line 200
    .line 201
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v0, 0x40000000    # 2.0f

    .line 205
    .line 206
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v17, 0x3f000000    # 0.5f

    .line 210
    .line 211
    const/4 v13, 0x0

    .line 212
    const v14, 0x3e8f5c29    # 0.28f

    .line 213
    .line 214
    .line 215
    const v15, 0x3e6147ae    # 0.22f

    .line 216
    .line 217
    .line 218
    const/high16 v16, 0x3f000000    # 0.5f

    .line 219
    .line 220
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v0, 0x3f000000    # 0.5f

    .line 224
    .line 225
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v18, -0x41000000    # -0.5f

    .line 229
    .line 230
    const v13, 0x3e8f5c29    # 0.28f

    .line 231
    .line 232
    .line 233
    const/4 v14, 0x0

    .line 234
    const/high16 v15, 0x3f000000    # 0.5f

    .line 235
    .line 236
    const v16, -0x419eb852    # -0.22f

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v0, 0x41200000    # 10.0f

    .line 243
    .line 244
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v17, -0x40800000    # -1.0f

    .line 248
    .line 249
    const/high16 v18, -0x40800000    # -1.0f

    .line 250
    .line 251
    const/4 v13, 0x0

    .line 252
    const v14, -0x40f33333    # -0.55f

    .line 253
    .line 254
    .line 255
    const v15, -0x4119999a    # -0.45f

    .line 256
    .line 257
    .line 258
    const/high16 v16, -0x40800000    # -1.0f

    .line 259
    .line 260
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 264
    .line 265
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v18, 0x3f800000    # 1.0f

    .line 269
    .line 270
    const v13, -0x40f33333    # -0.55f

    .line 271
    .line 272
    .line 273
    const/4 v14, 0x0

    .line 274
    const/high16 v15, -0x40800000    # -1.0f

    .line 275
    .line 276
    const v16, 0x3ee66666    # 0.45f

    .line 277
    .line 278
    .line 279
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v0, 0x3e2e147b    # 0.17f

    .line 283
    .line 284
    .line 285
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v0, 0x40da8f5c    # 6.83f

    .line 289
    .line 290
    .line 291
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v0, 0x41a3eb85    # 20.49f

    .line 298
    .line 299
    .line 300
    const v2, 0x41af3333    # 21.9f

    .line 301
    .line 302
    .line 303
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v17, -0x404b851f    # -1.41f

    .line 307
    .line 308
    .line 309
    const/16 v18, 0x0

    .line 310
    .line 311
    const v13, -0x413851ec    # -0.39f

    .line 312
    .line 313
    .line 314
    const v14, 0x3ec7ae14    # 0.39f

    .line 315
    .line 316
    .line 317
    const v15, -0x407d70a4    # -1.02f

    .line 318
    .line 319
    .line 320
    const v16, 0x3ec7ae14    # 0.39f

    .line 321
    .line 322
    .line 323
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v0, -0x400ccccd    # -1.9f

    .line 327
    .line 328
    .line 329
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v0, 0x40a00000    # 5.0f

    .line 333
    .line 334
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/high16 v17, -0x40000000    # -2.0f

    .line 338
    .line 339
    const/high16 v18, -0x40000000    # -2.0f

    .line 340
    .line 341
    const v13, -0x4071eb85    # -1.11f

    .line 342
    .line 343
    .line 344
    const/4 v14, 0x0

    .line 345
    const/high16 v15, -0x40000000    # -2.0f

    .line 346
    .line 347
    const v16, -0x4099999a    # -0.9f

    .line 348
    .line 349
    .line 350
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/high16 v0, 0x40c00000    # 6.0f

    .line 354
    .line 355
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v17, 0x3ca3d70a    # 0.02f

    .line 359
    .line 360
    .line 361
    const v18, -0x41e66666    # -0.15f

    .line 362
    .line 363
    .line 364
    const/4 v13, 0x0

    .line 365
    const v14, -0x42b33333    # -0.05f

    .line 366
    .line 367
    .line 368
    const v15, 0x3ca3d70a    # 0.02f

    .line 369
    .line 370
    .line 371
    const v16, -0x42333333    # -0.1f

    .line 372
    .line 373
    .line 374
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const v0, 0x40066666    # 2.1f

    .line 378
    .line 379
    .line 380
    const v2, 0x409dc28f    # 4.93f

    .line 381
    .line 382
    .line 383
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/16 v17, 0x0

    .line 387
    .line 388
    const v18, -0x404b851f    # -1.41f

    .line 389
    .line 390
    .line 391
    const v13, -0x413851ec    # -0.39f

    .line 392
    .line 393
    .line 394
    const v14, -0x413851ec    # -0.39f

    .line 395
    .line 396
    .line 397
    const v15, -0x413851ec    # -0.39f

    .line 398
    .line 399
    .line 400
    const v16, -0x407d70a4    # -1.02f

    .line 401
    .line 402
    .line 403
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v17, 0x3fb47ae1    # 1.41f

    .line 407
    .line 408
    .line 409
    const/16 v18, 0x0

    .line 410
    .line 411
    const v13, 0x3ec7ae14    # 0.39f

    .line 412
    .line 413
    .line 414
    const v15, 0x3f828f5c    # 1.02f

    .line 415
    .line 416
    .line 417
    const v16, -0x413851ec    # -0.39f

    .line 418
    .line 419
    .line 420
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v0, 0x4187c28f    # 16.97f

    .line 424
    .line 425
    .line 426
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v17, 0x41a3eb85    # 20.49f

    .line 430
    .line 431
    .line 432
    const v18, 0x41af3333    # 21.9f

    .line 433
    .line 434
    .line 435
    const v13, 0x41a70a3d    # 20.88f

    .line 436
    .line 437
    .line 438
    const v14, 0x41a70a3d    # 20.88f

    .line 439
    .line 440
    .line 441
    const v15, 0x41a70a3d    # 20.88f

    .line 442
    .line 443
    .line 444
    const v16, 0x41ac147b    # 21.51f

    .line 445
    .line 446
    .line 447
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v0, 0x41300000    # 11.0f

    .line 454
    .line 455
    const v2, 0x415d47ae    # 13.83f

    .line 456
    .line 457
    .line 458
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const v0, 0x4122b852    # 10.17f

    .line 462
    .line 463
    .line 464
    const/high16 v2, 0x41500000    # 13.0f

    .line 465
    .line 466
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const/high16 v0, 0x41200000    # 10.0f

    .line 470
    .line 471
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const/high16 v17, -0x41000000    # -0.5f

    .line 475
    .line 476
    const/high16 v18, 0x3f000000    # 0.5f

    .line 477
    .line 478
    const v13, -0x4170a3d7    # -0.28f

    .line 479
    .line 480
    .line 481
    const/4 v14, 0x0

    .line 482
    const/high16 v15, -0x41000000    # -0.5f

    .line 483
    .line 484
    const v16, 0x3e6147ae    # 0.22f

    .line 485
    .line 486
    .line 487
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v0, -0x40000000    # -2.0f

    .line 491
    .line 492
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 496
    .line 497
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const v0, 0x3e2e147b    # 0.17f

    .line 501
    .line 502
    .line 503
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v0, 0x40cccccd    # 6.4f

    .line 507
    .line 508
    .line 509
    const v2, 0x4113851f    # 9.22f

    .line 510
    .line 511
    .line 512
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v17, 0x40c00000    # 6.0f

    .line 516
    .line 517
    const/high16 v18, 0x41200000    # 10.0f

    .line 518
    .line 519
    const v13, 0x40c51eb8    # 6.16f

    .line 520
    .line 521
    .line 522
    const v14, 0x41168f5c    # 9.41f

    .line 523
    .line 524
    .line 525
    const/high16 v15, 0x40c00000    # 6.0f

    .line 526
    .line 527
    const v16, 0x411ae148    # 9.68f

    .line 528
    .line 529
    .line 530
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const/high16 v0, 0x40800000    # 4.0f

    .line 534
    .line 535
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const/high16 v17, 0x3f800000    # 1.0f

    .line 539
    .line 540
    const/high16 v18, 0x3f800000    # 1.0f

    .line 541
    .line 542
    const/4 v13, 0x0

    .line 543
    const v14, 0x3f0ccccd    # 0.55f

    .line 544
    .line 545
    .line 546
    const v15, 0x3ee66666    # 0.45f

    .line 547
    .line 548
    .line 549
    const/high16 v16, 0x3f800000    # 1.0f

    .line 550
    .line 551
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const/high16 v0, 0x40400000    # 3.0f

    .line 555
    .line 556
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const/high16 v18, -0x40800000    # -1.0f

    .line 560
    .line 561
    const v13, 0x3f0ccccd    # 0.55f

    .line 562
    .line 563
    .line 564
    const/4 v14, 0x0

    .line 565
    const/high16 v15, 0x3f800000    # 1.0f

    .line 566
    .line 567
    const v16, -0x4119999a    # -0.45f

    .line 568
    .line 569
    .line 570
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const v0, 0x415d47ae    # 13.83f

    .line 574
    .line 575
    .line 576
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 583
    .line 584
    .line 585
    move-result-object v2

    .line 586
    const/16 v16, 0x3800

    .line 587
    .line 588
    const/16 v17, 0x0

    .line 589
    .line 590
    const/high16 v6, 0x3f800000    # 1.0f

    .line 591
    .line 592
    const/high16 v8, 0x3f800000    # 1.0f

    .line 593
    .line 594
    const/4 v7, 0x0

    .line 595
    const/high16 v9, 0x3f800000    # 1.0f

    .line 596
    .line 597
    const/high16 v12, 0x3f800000    # 1.0f

    .line 598
    .line 599
    const/4 v13, 0x0

    .line 600
    const/4 v15, 0x0

    .line 601
    const-string v4, ""

    .line 602
    .line 603
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 608
    .line 609
    .line 610
    move-result-object v0

    .line 611
    sput-object v0, Landroidx/compose/material/icons/rounded/ClosedCaptionDisabledKt;->_closedCaptionDisabled:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 612
    .line 613
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 614
    .line 615
    .line 616
    return-object v0
.end method
