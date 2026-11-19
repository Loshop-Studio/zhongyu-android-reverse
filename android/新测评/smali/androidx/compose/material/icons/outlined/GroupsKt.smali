.class public final Landroidx/compose/material/icons/outlined/GroupsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_groups",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Groups",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getGroups",
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
        "SMAP\nGroups.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Groups.kt\nandroidx/compose/material/icons/outlined/GroupsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,95:1\n212#2,12:96\n233#2,18:109\n253#2:146\n174#3:108\n705#4,2:127\n717#4,2:129\n719#4,11:135\n72#5,4:131\n*S KotlinDebug\n*F\n+ 1 Groups.kt\nandroidx/compose/material/icons/outlined/GroupsKt\n*L\n29#1:96,12\n30#1:109,18\n30#1:146\n29#1:108\n30#1:127,2\n30#1:129,2\n30#1:135,11\n30#1:131,4\n*E\n"
    }
.end annotation


# static fields
.field private static _groups:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getGroups(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/GroupsKt;->_groups:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Groups"

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
    const/high16 v2, 0x41500000    # 13.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x40000000    # 2.0f

    .line 78
    .line 79
    const/high16 v18, -0x40000000    # -2.0f

    .line 80
    .line 81
    const v13, 0x3f8ccccd    # 1.1f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, 0x40000000    # 2.0f

    .line 86
    .line 87
    const v16, -0x4099999a    # -0.9f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v17, -0x40000000    # -2.0f

    .line 94
    .line 95
    const/4 v13, 0x0

    .line 96
    const v14, -0x40733333    # -1.1f

    .line 97
    .line 98
    .line 99
    const v15, -0x4099999a    # -0.9f

    .line 100
    .line 101
    .line 102
    const/high16 v16, -0x40000000    # -2.0f

    .line 103
    .line 104
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v0, 0x40000000    # 2.0f

    .line 108
    .line 109
    const v2, 0x3f666666    # 0.9f

    .line 110
    .line 111
    .line 112
    const/high16 v4, -0x40000000    # -2.0f

    .line 113
    .line 114
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v17, 0x40800000    # 4.0f

    .line 118
    .line 119
    const/high16 v18, 0x41500000    # 13.0f

    .line 120
    .line 121
    const/high16 v13, 0x40000000    # 2.0f

    .line 122
    .line 123
    const v14, 0x4141999a    # 12.1f

    .line 124
    .line 125
    .line 126
    const v15, 0x4039999a    # 2.9f

    .line 127
    .line 128
    .line 129
    const/high16 v16, 0x41500000    # 13.0f

    .line 130
    .line 131
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v0, 0x40a428f6    # 5.13f

    .line 138
    .line 139
    .line 140
    const v2, 0x4161999a    # 14.1f

    .line 141
    .line 142
    .line 143
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v18, 0x41600000    # 14.0f

    .line 147
    .line 148
    const v13, 0x409851ec    # 4.76f

    .line 149
    .line 150
    .line 151
    const v14, 0x4160a3d7    # 14.04f

    .line 152
    .line 153
    .line 154
    const v15, 0x408c7ae1    # 4.39f

    .line 155
    .line 156
    .line 157
    const/high16 v16, 0x41600000    # 14.0f

    .line 158
    .line 159
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v17, -0x3fce147b    # -2.78f

    .line 163
    .line 164
    .line 165
    const v18, 0x3f147ae1    # 0.58f

    .line 166
    .line 167
    .line 168
    const v13, -0x40828f5c    # -0.99f

    .line 169
    .line 170
    .line 171
    const/4 v14, 0x0

    .line 172
    const v15, -0x4008f5c3    # -1.93f

    .line 173
    .line 174
    .line 175
    const v16, 0x3e570a3d    # 0.21f

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/16 v17, 0x0

    .line 182
    .line 183
    const v18, 0x418370a4    # 16.43f

    .line 184
    .line 185
    .line 186
    const v13, 0x3ef5c28f    # 0.48f

    .line 187
    .line 188
    .line 189
    const v14, 0x416e6666    # 14.9f

    .line 190
    .line 191
    .line 192
    const/4 v15, 0x0

    .line 193
    const v16, 0x4179eb85    # 15.62f

    .line 194
    .line 195
    .line 196
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/high16 v0, 0x41900000    # 18.0f

    .line 200
    .line 201
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/4 v0, 0x0

    .line 205
    const/high16 v2, 0x40900000    # 4.5f

    .line 206
    .line 207
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v0, -0x4031eb85    # -1.61f

    .line 211
    .line 212
    .line 213
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v17, 0x40a428f6    # 5.13f

    .line 217
    .line 218
    .line 219
    const v18, 0x4161999a    # 14.1f

    .line 220
    .line 221
    .line 222
    const/high16 v13, 0x40900000    # 4.5f

    .line 223
    .line 224
    const v14, 0x4178f5c3    # 15.56f

    .line 225
    .line 226
    .line 227
    const v15, 0x40975c29    # 4.73f

    .line 228
    .line 229
    .line 230
    const v16, 0x416c7ae1    # 14.78f

    .line 231
    .line 232
    .line 233
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/high16 v0, 0x41a00000    # 20.0f

    .line 240
    .line 241
    const/high16 v2, 0x41500000    # 13.0f

    .line 242
    .line 243
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/high16 v17, 0x40000000    # 2.0f

    .line 247
    .line 248
    const/high16 v18, -0x40000000    # -2.0f

    .line 249
    .line 250
    const v13, 0x3f8ccccd    # 1.1f

    .line 251
    .line 252
    .line 253
    const/4 v14, 0x0

    .line 254
    const/high16 v15, 0x40000000    # 2.0f

    .line 255
    .line 256
    const v16, -0x4099999a    # -0.9f

    .line 257
    .line 258
    .line 259
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v17, -0x40000000    # -2.0f

    .line 263
    .line 264
    const/4 v13, 0x0

    .line 265
    const v14, -0x40733333    # -1.1f

    .line 266
    .line 267
    .line 268
    const v15, -0x4099999a    # -0.9f

    .line 269
    .line 270
    .line 271
    const/high16 v16, -0x40000000    # -2.0f

    .line 272
    .line 273
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/high16 v0, 0x40000000    # 2.0f

    .line 277
    .line 278
    const v2, 0x3f666666    # 0.9f

    .line 279
    .line 280
    .line 281
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v17, 0x41a00000    # 20.0f

    .line 285
    .line 286
    const/high16 v18, 0x41500000    # 13.0f

    .line 287
    .line 288
    const/high16 v13, 0x41900000    # 18.0f

    .line 289
    .line 290
    const v14, 0x4141999a    # 12.1f

    .line 291
    .line 292
    .line 293
    const v15, 0x41973333    # 18.9f

    .line 294
    .line 295
    .line 296
    const/high16 v16, 0x41500000    # 13.0f

    .line 297
    .line 298
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v0, 0x418370a4    # 16.43f

    .line 305
    .line 306
    .line 307
    const/high16 v2, 0x41c00000    # 24.0f

    .line 308
    .line 309
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v17, -0x4063d70a    # -1.22f

    .line 313
    .line 314
    .line 315
    const v18, -0x40133333    # -1.85f

    .line 316
    .line 317
    .line 318
    const/4 v13, 0x0

    .line 319
    const v14, -0x40b0a3d7    # -0.81f

    .line 320
    .line 321
    .line 322
    const v15, -0x410a3d71    # -0.48f

    .line 323
    .line 324
    .line 325
    const v16, -0x403c28f6    # -1.53f

    .line 326
    .line 327
    .line 328
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v17, 0x41a00000    # 20.0f

    .line 332
    .line 333
    const/high16 v18, 0x41600000    # 14.0f

    .line 334
    .line 335
    const v13, 0x41af70a4    # 21.93f

    .line 336
    .line 337
    .line 338
    const v14, 0x41635c29    # 14.21f

    .line 339
    .line 340
    .line 341
    const v15, 0x41a7eb85    # 20.99f

    .line 342
    .line 343
    .line 344
    const/high16 v16, 0x41600000    # 14.0f

    .line 345
    .line 346
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v17, -0x406f5c29    # -1.13f

    .line 350
    .line 351
    .line 352
    const v18, 0x3dcccccd    # 0.1f

    .line 353
    .line 354
    .line 355
    const v13, -0x413851ec    # -0.39f

    .line 356
    .line 357
    .line 358
    const/4 v14, 0x0

    .line 359
    const v15, -0x40bd70a4    # -0.76f

    .line 360
    .line 361
    .line 362
    const v16, 0x3d23d70a    # 0.04f

    .line 363
    .line 364
    .line 365
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v17, 0x3f2147ae    # 0.63f

    .line 369
    .line 370
    .line 371
    const v18, 0x40128f5c    # 2.29f

    .line 372
    .line 373
    .line 374
    const v13, 0x3ecccccd    # 0.4f

    .line 375
    .line 376
    .line 377
    const v14, 0x3f2e147b    # 0.68f

    .line 378
    .line 379
    .line 380
    const v15, 0x3f2147ae    # 0.63f

    .line 381
    .line 382
    .line 383
    const v16, 0x3fbae148    # 1.46f

    .line 384
    .line 385
    .line 386
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const/high16 v0, 0x41900000    # 18.0f

    .line 390
    .line 391
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/4 v0, 0x0

    .line 395
    const/high16 v2, 0x40900000    # 4.5f

    .line 396
    .line 397
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v0, 0x418370a4    # 16.43f

    .line 401
    .line 402
    .line 403
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v0, 0x4181eb85    # 16.24f

    .line 410
    .line 411
    .line 412
    const v2, 0x415a6666    # 13.65f

    .line 413
    .line 414
    .line 415
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v17, -0x3f7851ec    # -4.24f

    .line 419
    .line 420
    .line 421
    const v18, -0x4099999a    # -0.9f

    .line 422
    .line 423
    .line 424
    const v13, -0x406a3d71    # -1.17f

    .line 425
    .line 426
    .line 427
    const v14, -0x40fae148    # -0.52f

    .line 428
    .line 429
    .line 430
    const v15, -0x3fd8f5c3    # -2.61f

    .line 431
    .line 432
    .line 433
    const v16, -0x4099999a    # -0.9f

    .line 434
    .line 435
    .line 436
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v18, 0x3f666666    # 0.9f

    .line 440
    .line 441
    .line 442
    const v13, -0x402f5c29    # -1.63f

    .line 443
    .line 444
    .line 445
    const/4 v14, 0x0

    .line 446
    const v15, -0x3fbb851f    # -3.07f

    .line 447
    .line 448
    .line 449
    const v16, 0x3ec7ae14    # 0.39f

    .line 450
    .line 451
    .line 452
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const/high16 v17, 0x40c00000    # 6.0f

    .line 456
    .line 457
    const v18, 0x41831eb8    # 16.39f

    .line 458
    .line 459
    .line 460
    const v13, 0x40d5c28f    # 6.68f

    .line 461
    .line 462
    .line 463
    const v14, 0x4162147b    # 14.13f

    .line 464
    .line 465
    .line 466
    const/high16 v15, 0x40c00000    # 6.0f

    .line 467
    .line 468
    const v16, 0x41735c29    # 15.21f

    .line 469
    .line 470
    .line 471
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const/high16 v0, 0x41900000    # 18.0f

    .line 475
    .line 476
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const/high16 v0, 0x41400000    # 12.0f

    .line 480
    .line 481
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const v0, -0x4031eb85    # -1.61f

    .line 485
    .line 486
    .line 487
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const v17, 0x4181eb85    # 16.24f

    .line 491
    .line 492
    .line 493
    const v18, 0x415a6666    # 13.65f

    .line 494
    .line 495
    .line 496
    const/high16 v13, 0x41900000    # 18.0f

    .line 497
    .line 498
    const v14, 0x41735c29    # 15.21f

    .line 499
    .line 500
    .line 501
    const v15, 0x418a8f5c    # 17.32f

    .line 502
    .line 503
    .line 504
    const v16, 0x4162147b    # 14.13f

    .line 505
    .line 506
    .line 507
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const/high16 v0, 0x41800000    # 16.0f

    .line 514
    .line 515
    const v2, 0x41011eb8    # 8.07f

    .line 516
    .line 517
    .line 518
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v17, 0x3f68f5c3    # 0.91f

    .line 522
    .line 523
    .line 524
    const v18, -0x40cf5c29    # -0.69f

    .line 525
    .line 526
    .line 527
    const v13, 0x3db851ec    # 0.09f

    .line 528
    .line 529
    .line 530
    const v14, -0x41947ae1    # -0.23f

    .line 531
    .line 532
    .line 533
    const v15, 0x3e051eb8    # 0.13f

    .line 534
    .line 535
    .line 536
    const v16, -0x413851ec    # -0.39f

    .line 537
    .line 538
    .line 539
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const v17, 0x404147ae    # 3.02f

    .line 543
    .line 544
    .line 545
    const v18, -0x40f0a3d7    # -0.56f

    .line 546
    .line 547
    .line 548
    const v13, 0x3f7851ec    # 0.97f

    .line 549
    .line 550
    .line 551
    const v14, -0x413d70a4    # -0.38f

    .line 552
    .line 553
    .line 554
    const v15, 0x3ffeb852    # 1.99f

    .line 555
    .line 556
    .line 557
    const v16, -0x40f0a3d7    # -0.56f

    .line 558
    .line 559
    .line 560
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const v0, 0x404147ae    # 3.02f

    .line 564
    .line 565
    .line 566
    const v2, 0x3f0f5c29    # 0.56f

    .line 567
    .line 568
    .line 569
    const v4, 0x40033333    # 2.05f

    .line 570
    .line 571
    .line 572
    const v6, 0x3e3851ec    # 0.18f

    .line 573
    .line 574
    .line 575
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const v17, 0x3f68f5c3    # 0.91f

    .line 579
    .line 580
    .line 581
    const v18, 0x3f30a3d7    # 0.69f

    .line 582
    .line 583
    .line 584
    const v13, 0x3f451eb8    # 0.77f

    .line 585
    .line 586
    .line 587
    const v14, 0x3e99999a    # 0.3f

    .line 588
    .line 589
    .line 590
    const v15, 0x3f4f5c29    # 0.81f

    .line 591
    .line 592
    .line 593
    const v16, 0x3eeb851f    # 0.46f

    .line 594
    .line 595
    .line 596
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const v0, 0x41011eb8    # 8.07f

    .line 600
    .line 601
    .line 602
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const/high16 v0, 0x41000000    # 8.0f

    .line 609
    .line 610
    const/high16 v2, 0x41400000    # 12.0f

    .line 611
    .line 612
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const/high16 v17, 0x3f800000    # 1.0f

    .line 616
    .line 617
    const/high16 v18, 0x3f800000    # 1.0f

    .line 618
    .line 619
    const v13, 0x3f0ccccd    # 0.55f

    .line 620
    .line 621
    .line 622
    const/4 v14, 0x0

    .line 623
    const/high16 v15, 0x3f800000    # 1.0f

    .line 624
    .line 625
    const v16, 0x3ee66666    # 0.45f

    .line 626
    .line 627
    .line 628
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    const/high16 v0, 0x3f800000    # 1.0f

    .line 632
    .line 633
    const v2, -0x4119999a    # -0.45f

    .line 634
    .line 635
    .line 636
    const/high16 v4, -0x40800000    # -1.0f

    .line 637
    .line 638
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const v0, -0x4119999a    # -0.45f

    .line 642
    .line 643
    .line 644
    const/high16 v2, -0x40800000    # -1.0f

    .line 645
    .line 646
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const v0, 0x41373333    # 11.45f

    .line 650
    .line 651
    .line 652
    const/high16 v2, 0x41000000    # 8.0f

    .line 653
    .line 654
    const/high16 v4, 0x41400000    # 12.0f

    .line 655
    .line 656
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    const/high16 v0, 0x40c00000    # 6.0f

    .line 660
    .line 661
    const/high16 v2, 0x41400000    # 12.0f

    .line 662
    .line 663
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 664
    .line 665
    .line 666
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 667
    .line 668
    const/high16 v18, 0x40400000    # 3.0f

    .line 669
    .line 670
    const v13, -0x402b851f    # -1.66f

    .line 671
    .line 672
    .line 673
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 674
    .line 675
    const v16, 0x3fab851f    # 1.34f

    .line 676
    .line 677
    .line 678
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    const/high16 v17, 0x40400000    # 3.0f

    .line 682
    .line 683
    const/4 v13, 0x0

    .line 684
    const v14, 0x3fd47ae1    # 1.66f

    .line 685
    .line 686
    .line 687
    const v15, 0x3fab851f    # 1.34f

    .line 688
    .line 689
    .line 690
    const/high16 v16, 0x40400000    # 3.0f

    .line 691
    .line 692
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const v0, -0x40547ae1    # -1.34f

    .line 696
    .line 697
    .line 698
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 699
    .line 700
    const/high16 v4, 0x40400000    # 3.0f

    .line 701
    .line 702
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 703
    .line 704
    .line 705
    const/high16 v17, 0x41400000    # 12.0f

    .line 706
    .line 707
    const/high16 v18, 0x40c00000    # 6.0f

    .line 708
    .line 709
    const/high16 v13, 0x41700000    # 15.0f

    .line 710
    .line 711
    const v14, 0x40eae148    # 7.34f

    .line 712
    .line 713
    .line 714
    const v15, 0x415a8f5c    # 13.66f

    .line 715
    .line 716
    .line 717
    const/high16 v16, 0x40c00000    # 6.0f

    .line 718
    .line 719
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    const/high16 v0, 0x40c00000    # 6.0f

    .line 723
    .line 724
    const/high16 v2, 0x41400000    # 12.0f

    .line 725
    .line 726
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 727
    .line 728
    .line 729
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 733
    .line 734
    .line 735
    move-result-object v2

    .line 736
    const/16 v16, 0x3800

    .line 737
    .line 738
    const/16 v17, 0x0

    .line 739
    .line 740
    const/high16 v6, 0x3f800000    # 1.0f

    .line 741
    .line 742
    const/high16 v8, 0x3f800000    # 1.0f

    .line 743
    .line 744
    const/4 v7, 0x0

    .line 745
    const/high16 v9, 0x3f800000    # 1.0f

    .line 746
    .line 747
    const/high16 v12, 0x3f800000    # 1.0f

    .line 748
    .line 749
    const/4 v13, 0x0

    .line 750
    const/4 v14, 0x0

    .line 751
    const/4 v15, 0x0

    .line 752
    const-string v4, ""

    .line 753
    .line 754
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 755
    .line 756
    .line 757
    move-result-object v0

    .line 758
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 759
    .line 760
    .line 761
    move-result-object v0

    .line 762
    sput-object v0, Landroidx/compose/material/icons/outlined/GroupsKt;->_groups:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 763
    .line 764
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 765
    .line 766
    .line 767
    return-object v0
.end method
