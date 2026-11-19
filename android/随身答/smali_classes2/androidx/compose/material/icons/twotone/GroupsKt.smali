.class public final Landroidx/compose/material/icons/twotone/GroupsKt;
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
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getGroups",
        "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nGroups.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Groups.kt\nandroidx/compose/material/icons/twotone/GroupsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,109:1\n212#2,12:110\n233#2,18:123\n253#2:160\n233#2,18:161\n253#2:198\n174#3:122\n705#4,2:141\n717#4,2:143\n719#4,11:149\n705#4,2:179\n717#4,2:181\n719#4,11:187\n72#5,4:145\n72#5,4:183\n*S KotlinDebug\n*F\n+ 1 Groups.kt\nandroidx/compose/material/icons/twotone/GroupsKt\n*L\n29#1:110,12\n30#1:123,18\n30#1:160\n44#1:161,18\n44#1:198\n29#1:122\n30#1:141,2\n30#1:143,2\n30#1:149,11\n44#1:179,2\n44#1:181,2\n44#1:187,11\n30#1:145,4\n44#1:183,4\n*E\n"
    }
.end annotation


# static fields
.field private static _groups:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getGroups(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/GroupsKt;->_groups:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Groups"

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
    const/high16 v4, 0x41800000    # 16.0f

    .line 71
    .line 72
    const v6, 0x41011eb8    # 8.07f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v25, 0x3f68f5c3    # 0.91f

    .line 79
    .line 80
    .line 81
    const v26, -0x40cf5c29    # -0.69f

    .line 82
    .line 83
    .line 84
    const v21, 0x3db851ec    # 0.09f

    .line 85
    .line 86
    .line 87
    const v22, -0x41947ae1    # -0.23f

    .line 88
    .line 89
    .line 90
    const v23, 0x3e051eb8    # 0.13f

    .line 91
    .line 92
    .line 93
    const v24, -0x413851ec    # -0.39f

    .line 94
    .line 95
    .line 96
    move-object/from16 v20, v2

    .line 97
    .line 98
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v25, 0x404147ae    # 3.02f

    .line 102
    .line 103
    .line 104
    const v26, -0x40f0a3d7    # -0.56f

    .line 105
    .line 106
    .line 107
    const v21, 0x3f7851ec    # 0.97f

    .line 108
    .line 109
    .line 110
    const v22, -0x413d70a4    # -0.38f

    .line 111
    .line 112
    .line 113
    const v23, 0x3ffeb852    # 1.99f

    .line 114
    .line 115
    .line 116
    const v24, -0x40f0a3d7    # -0.56f

    .line 117
    .line 118
    .line 119
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const v4, 0x3f0f5c29    # 0.56f

    .line 123
    .line 124
    .line 125
    const v6, 0x404147ae    # 3.02f

    .line 126
    .line 127
    .line 128
    const v7, 0x3e3851ec    # 0.18f

    .line 129
    .line 130
    .line 131
    const v8, 0x40033333    # 2.05f

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2, v8, v7, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v25, 0x3f68f5c3    # 0.91f

    .line 138
    .line 139
    .line 140
    const v26, 0x3f30a3d7    # 0.69f

    .line 141
    .line 142
    .line 143
    const v21, 0x3f451eb8    # 0.77f

    .line 144
    .line 145
    .line 146
    const v22, 0x3e99999a    # 0.3f

    .line 147
    .line 148
    .line 149
    const v23, 0x3f4f5c29    # 0.81f

    .line 150
    .line 151
    .line 152
    const v24, 0x3eeb851f    # 0.46f

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v4, 0x41011eb8    # 8.07f

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v4, 0x41000000    # 8.0f

    .line 168
    .line 169
    const/high16 v6, 0x41400000    # 12.0f

    .line 170
    .line 171
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const/high16 v25, 0x3f800000    # 1.0f

    .line 175
    .line 176
    const/high16 v26, 0x3f800000    # 1.0f

    .line 177
    .line 178
    const v21, 0x3f0ccccd    # 0.55f

    .line 179
    .line 180
    .line 181
    const/16 v22, 0x0

    .line 182
    .line 183
    const/high16 v23, 0x3f800000    # 1.0f

    .line 184
    .line 185
    const v24, 0x3ee66666    # 0.45f

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const/high16 v4, 0x3f800000    # 1.0f

    .line 192
    .line 193
    const v6, -0x4119999a    # -0.45f

    .line 194
    .line 195
    .line 196
    const/high16 v7, -0x40800000    # -1.0f

    .line 197
    .line 198
    invoke-virtual {v2, v6, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v4, -0x4119999a    # -0.45f

    .line 202
    .line 203
    .line 204
    const/high16 v6, -0x40800000    # -1.0f

    .line 205
    .line 206
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v4, 0x41373333    # 11.45f

    .line 210
    .line 211
    .line 212
    const/high16 v6, 0x41000000    # 8.0f

    .line 213
    .line 214
    const/high16 v7, 0x41400000    # 12.0f

    .line 215
    .line 216
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    const/16 v16, 0x3800

    .line 224
    .line 225
    const/16 v17, 0x0

    .line 226
    .line 227
    const v6, 0x3e99999a    # 0.3f

    .line 228
    .line 229
    .line 230
    const v8, 0x3e99999a    # 0.3f

    .line 231
    .line 232
    .line 233
    const/4 v7, 0x0

    .line 234
    const/high16 v9, 0x3f800000    # 1.0f

    .line 235
    .line 236
    const/high16 v12, 0x3f800000    # 1.0f

    .line 237
    .line 238
    const/4 v13, 0x0

    .line 239
    const/4 v14, 0x0

    .line 240
    const/4 v15, 0x0

    .line 241
    const-string v4, ""

    .line 242
    .line 243
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 244
    .line 245
    .line 246
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 247
    .line 248
    .line 249
    move-result v3

    .line 250
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 251
    .line 252
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 253
    .line 254
    .line 255
    move-result-wide v6

    .line 256
    const/4 v0, 0x0

    .line 257
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 261
    .line 262
    .line 263
    move-result v10

    .line 264
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 265
    .line 266
    .line 267
    move-result v11

    .line 268
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 271
    .line 272
    .line 273
    const/high16 v0, 0x40800000    # 4.0f

    .line 274
    .line 275
    const/high16 v2, 0x41500000    # 13.0f

    .line 276
    .line 277
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v17, 0x40000000    # 2.0f

    .line 281
    .line 282
    const/high16 v18, -0x40000000    # -2.0f

    .line 283
    .line 284
    const v13, 0x3f8ccccd    # 1.1f

    .line 285
    .line 286
    .line 287
    const/high16 v15, 0x40000000    # 2.0f

    .line 288
    .line 289
    const v16, -0x4099999a    # -0.9f

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v17, -0x40000000    # -2.0f

    .line 296
    .line 297
    const/4 v13, 0x0

    .line 298
    const v14, -0x40733333    # -1.1f

    .line 299
    .line 300
    .line 301
    const v15, -0x4099999a    # -0.9f

    .line 302
    .line 303
    .line 304
    const/high16 v16, -0x40000000    # -2.0f

    .line 305
    .line 306
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const/high16 v0, 0x40000000    # 2.0f

    .line 310
    .line 311
    const v2, 0x3f666666    # 0.9f

    .line 312
    .line 313
    .line 314
    const/high16 v4, -0x40000000    # -2.0f

    .line 315
    .line 316
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v17, 0x40800000    # 4.0f

    .line 320
    .line 321
    const/high16 v18, 0x41500000    # 13.0f

    .line 322
    .line 323
    const/high16 v13, 0x40000000    # 2.0f

    .line 324
    .line 325
    const v14, 0x4141999a    # 12.1f

    .line 326
    .line 327
    .line 328
    const v15, 0x4039999a    # 2.9f

    .line 329
    .line 330
    .line 331
    const/high16 v16, 0x41500000    # 13.0f

    .line 332
    .line 333
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v0, 0x40a428f6    # 5.13f

    .line 340
    .line 341
    .line 342
    const v2, 0x4161999a    # 14.1f

    .line 343
    .line 344
    .line 345
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const/high16 v18, 0x41600000    # 14.0f

    .line 349
    .line 350
    const v13, 0x409851ec    # 4.76f

    .line 351
    .line 352
    .line 353
    const v14, 0x4160a3d7    # 14.04f

    .line 354
    .line 355
    .line 356
    const v15, 0x408c7ae1    # 4.39f

    .line 357
    .line 358
    .line 359
    const/high16 v16, 0x41600000    # 14.0f

    .line 360
    .line 361
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const v17, -0x3fce147b    # -2.78f

    .line 365
    .line 366
    .line 367
    const v18, 0x3f147ae1    # 0.58f

    .line 368
    .line 369
    .line 370
    const v13, -0x40828f5c    # -0.99f

    .line 371
    .line 372
    .line 373
    const/4 v14, 0x0

    .line 374
    const v15, -0x4008f5c3    # -1.93f

    .line 375
    .line 376
    .line 377
    const v16, 0x3e570a3d    # 0.21f

    .line 378
    .line 379
    .line 380
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const/16 v17, 0x0

    .line 384
    .line 385
    const v18, 0x418370a4    # 16.43f

    .line 386
    .line 387
    .line 388
    const v13, 0x3ef5c28f    # 0.48f

    .line 389
    .line 390
    .line 391
    const v14, 0x416e6666    # 14.9f

    .line 392
    .line 393
    .line 394
    const/4 v15, 0x0

    .line 395
    const v16, 0x4179eb85    # 15.62f

    .line 396
    .line 397
    .line 398
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/high16 v0, 0x41900000    # 18.0f

    .line 402
    .line 403
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const/4 v0, 0x0

    .line 407
    const/high16 v2, 0x40900000    # 4.5f

    .line 408
    .line 409
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v0, -0x4031eb85    # -1.61f

    .line 413
    .line 414
    .line 415
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v17, 0x40a428f6    # 5.13f

    .line 419
    .line 420
    .line 421
    const v18, 0x4161999a    # 14.1f

    .line 422
    .line 423
    .line 424
    const/high16 v13, 0x40900000    # 4.5f

    .line 425
    .line 426
    const v14, 0x4178f5c3    # 15.56f

    .line 427
    .line 428
    .line 429
    const v15, 0x40975c29    # 4.73f

    .line 430
    .line 431
    .line 432
    const v16, 0x416c7ae1    # 14.78f

    .line 433
    .line 434
    .line 435
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v0, 0x41a00000    # 20.0f

    .line 442
    .line 443
    const/high16 v2, 0x41500000    # 13.0f

    .line 444
    .line 445
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/high16 v17, 0x40000000    # 2.0f

    .line 449
    .line 450
    const/high16 v18, -0x40000000    # -2.0f

    .line 451
    .line 452
    const v13, 0x3f8ccccd    # 1.1f

    .line 453
    .line 454
    .line 455
    const/4 v14, 0x0

    .line 456
    const/high16 v15, 0x40000000    # 2.0f

    .line 457
    .line 458
    const v16, -0x4099999a    # -0.9f

    .line 459
    .line 460
    .line 461
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const/high16 v17, -0x40000000    # -2.0f

    .line 465
    .line 466
    const/4 v13, 0x0

    .line 467
    const v14, -0x40733333    # -1.1f

    .line 468
    .line 469
    .line 470
    const v15, -0x4099999a    # -0.9f

    .line 471
    .line 472
    .line 473
    const/high16 v16, -0x40000000    # -2.0f

    .line 474
    .line 475
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const/high16 v0, 0x40000000    # 2.0f

    .line 479
    .line 480
    const v2, 0x3f666666    # 0.9f

    .line 481
    .line 482
    .line 483
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const/high16 v17, 0x41a00000    # 20.0f

    .line 487
    .line 488
    const/high16 v18, 0x41500000    # 13.0f

    .line 489
    .line 490
    const/high16 v13, 0x41900000    # 18.0f

    .line 491
    .line 492
    const v14, 0x4141999a    # 12.1f

    .line 493
    .line 494
    .line 495
    const v15, 0x41973333    # 18.9f

    .line 496
    .line 497
    .line 498
    const/high16 v16, 0x41500000    # 13.0f

    .line 499
    .line 500
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v0, 0x418370a4    # 16.43f

    .line 507
    .line 508
    .line 509
    const/high16 v2, 0x41c00000    # 24.0f

    .line 510
    .line 511
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const v17, -0x4063d70a    # -1.22f

    .line 515
    .line 516
    .line 517
    const v18, -0x40133333    # -1.85f

    .line 518
    .line 519
    .line 520
    const/4 v13, 0x0

    .line 521
    const v14, -0x40b0a3d7    # -0.81f

    .line 522
    .line 523
    .line 524
    const v15, -0x410a3d71    # -0.48f

    .line 525
    .line 526
    .line 527
    const v16, -0x403c28f6    # -1.53f

    .line 528
    .line 529
    .line 530
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const/high16 v17, 0x41a00000    # 20.0f

    .line 534
    .line 535
    const/high16 v18, 0x41600000    # 14.0f

    .line 536
    .line 537
    const v13, 0x41af70a4    # 21.93f

    .line 538
    .line 539
    .line 540
    const v14, 0x41635c29    # 14.21f

    .line 541
    .line 542
    .line 543
    const v15, 0x41a7eb85    # 20.99f

    .line 544
    .line 545
    .line 546
    const/high16 v16, 0x41600000    # 14.0f

    .line 547
    .line 548
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v17, -0x406f5c29    # -1.13f

    .line 552
    .line 553
    .line 554
    const v18, 0x3dcccccd    # 0.1f

    .line 555
    .line 556
    .line 557
    const v13, -0x413851ec    # -0.39f

    .line 558
    .line 559
    .line 560
    const/4 v14, 0x0

    .line 561
    const v15, -0x40bd70a4    # -0.76f

    .line 562
    .line 563
    .line 564
    const v16, 0x3d23d70a    # 0.04f

    .line 565
    .line 566
    .line 567
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const v17, 0x3f2147ae    # 0.63f

    .line 571
    .line 572
    .line 573
    const v18, 0x40128f5c    # 2.29f

    .line 574
    .line 575
    .line 576
    const v13, 0x3ecccccd    # 0.4f

    .line 577
    .line 578
    .line 579
    const v14, 0x3f2e147b    # 0.68f

    .line 580
    .line 581
    .line 582
    const v15, 0x3f2147ae    # 0.63f

    .line 583
    .line 584
    .line 585
    const v16, 0x3fbae148    # 1.46f

    .line 586
    .line 587
    .line 588
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const/high16 v0, 0x41900000    # 18.0f

    .line 592
    .line 593
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const/4 v0, 0x0

    .line 597
    const/high16 v2, 0x40900000    # 4.5f

    .line 598
    .line 599
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const v0, 0x418370a4    # 16.43f

    .line 603
    .line 604
    .line 605
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const v0, 0x4181eb85    # 16.24f

    .line 612
    .line 613
    .line 614
    const v2, 0x415a6666    # 13.65f

    .line 615
    .line 616
    .line 617
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const v17, -0x3f7851ec    # -4.24f

    .line 621
    .line 622
    .line 623
    const v18, -0x4099999a    # -0.9f

    .line 624
    .line 625
    .line 626
    const v13, -0x406a3d71    # -1.17f

    .line 627
    .line 628
    .line 629
    const v14, -0x40fae148    # -0.52f

    .line 630
    .line 631
    .line 632
    const v15, -0x3fd8f5c3    # -2.61f

    .line 633
    .line 634
    .line 635
    const v16, -0x4099999a    # -0.9f

    .line 636
    .line 637
    .line 638
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const v18, 0x3f666666    # 0.9f

    .line 642
    .line 643
    .line 644
    const v13, -0x402f5c29    # -1.63f

    .line 645
    .line 646
    .line 647
    const/4 v14, 0x0

    .line 648
    const v15, -0x3fbb851f    # -3.07f

    .line 649
    .line 650
    .line 651
    const v16, 0x3ec7ae14    # 0.39f

    .line 652
    .line 653
    .line 654
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const/high16 v17, 0x40c00000    # 6.0f

    .line 658
    .line 659
    const v18, 0x41831eb8    # 16.39f

    .line 660
    .line 661
    .line 662
    const v13, 0x40d5c28f    # 6.68f

    .line 663
    .line 664
    .line 665
    const v14, 0x4162147b    # 14.13f

    .line 666
    .line 667
    .line 668
    const/high16 v15, 0x40c00000    # 6.0f

    .line 669
    .line 670
    const v16, 0x41735c29    # 15.21f

    .line 671
    .line 672
    .line 673
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const/high16 v0, 0x41900000    # 18.0f

    .line 677
    .line 678
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    const/high16 v0, 0x41400000    # 12.0f

    .line 682
    .line 683
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 684
    .line 685
    .line 686
    const v0, -0x4031eb85    # -1.61f

    .line 687
    .line 688
    .line 689
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    const v17, 0x4181eb85    # 16.24f

    .line 693
    .line 694
    .line 695
    const v18, 0x415a6666    # 13.65f

    .line 696
    .line 697
    .line 698
    const/high16 v13, 0x41900000    # 18.0f

    .line 699
    .line 700
    const v14, 0x41735c29    # 15.21f

    .line 701
    .line 702
    .line 703
    const v15, 0x418a8f5c    # 17.32f

    .line 704
    .line 705
    .line 706
    const v16, 0x4162147b    # 14.13f

    .line 707
    .line 708
    .line 709
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 713
    .line 714
    .line 715
    const/high16 v0, 0x41800000    # 16.0f

    .line 716
    .line 717
    const v2, 0x41011eb8    # 8.07f

    .line 718
    .line 719
    .line 720
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 721
    .line 722
    .line 723
    const v17, 0x3f68f5c3    # 0.91f

    .line 724
    .line 725
    .line 726
    const v18, -0x40cf5c29    # -0.69f

    .line 727
    .line 728
    .line 729
    const v13, 0x3db851ec    # 0.09f

    .line 730
    .line 731
    .line 732
    const v14, -0x41947ae1    # -0.23f

    .line 733
    .line 734
    .line 735
    const v15, 0x3e051eb8    # 0.13f

    .line 736
    .line 737
    .line 738
    const v16, -0x413851ec    # -0.39f

    .line 739
    .line 740
    .line 741
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 742
    .line 743
    .line 744
    const v17, 0x404147ae    # 3.02f

    .line 745
    .line 746
    .line 747
    const v18, -0x40f0a3d7    # -0.56f

    .line 748
    .line 749
    .line 750
    const v13, 0x3f7851ec    # 0.97f

    .line 751
    .line 752
    .line 753
    const v14, -0x413d70a4    # -0.38f

    .line 754
    .line 755
    .line 756
    const v15, 0x3ffeb852    # 1.99f

    .line 757
    .line 758
    .line 759
    const v16, -0x40f0a3d7    # -0.56f

    .line 760
    .line 761
    .line 762
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 763
    .line 764
    .line 765
    const v0, 0x3f0f5c29    # 0.56f

    .line 766
    .line 767
    .line 768
    const v2, 0x404147ae    # 3.02f

    .line 769
    .line 770
    .line 771
    const v4, 0x3e3851ec    # 0.18f

    .line 772
    .line 773
    .line 774
    const v6, 0x40033333    # 2.05f

    .line 775
    .line 776
    .line 777
    invoke-virtual {v12, v6, v4, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 778
    .line 779
    .line 780
    const v17, 0x3f68f5c3    # 0.91f

    .line 781
    .line 782
    .line 783
    const v18, 0x3f30a3d7    # 0.69f

    .line 784
    .line 785
    .line 786
    const v13, 0x3f451eb8    # 0.77f

    .line 787
    .line 788
    .line 789
    const v14, 0x3e99999a    # 0.3f

    .line 790
    .line 791
    .line 792
    const v15, 0x3f4f5c29    # 0.81f

    .line 793
    .line 794
    .line 795
    const v16, 0x3eeb851f    # 0.46f

    .line 796
    .line 797
    .line 798
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 799
    .line 800
    .line 801
    const v0, 0x41011eb8    # 8.07f

    .line 802
    .line 803
    .line 804
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 805
    .line 806
    .line 807
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 808
    .line 809
    .line 810
    const/high16 v0, 0x41000000    # 8.0f

    .line 811
    .line 812
    const/high16 v2, 0x41400000    # 12.0f

    .line 813
    .line 814
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 815
    .line 816
    .line 817
    const/high16 v17, 0x3f800000    # 1.0f

    .line 818
    .line 819
    const/high16 v18, 0x3f800000    # 1.0f

    .line 820
    .line 821
    const v13, 0x3f0ccccd    # 0.55f

    .line 822
    .line 823
    .line 824
    const/4 v14, 0x0

    .line 825
    const/high16 v15, 0x3f800000    # 1.0f

    .line 826
    .line 827
    const v16, 0x3ee66666    # 0.45f

    .line 828
    .line 829
    .line 830
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 831
    .line 832
    .line 833
    const/high16 v0, 0x3f800000    # 1.0f

    .line 834
    .line 835
    const v2, -0x4119999a    # -0.45f

    .line 836
    .line 837
    .line 838
    const/high16 v4, -0x40800000    # -1.0f

    .line 839
    .line 840
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 841
    .line 842
    .line 843
    const v0, -0x4119999a    # -0.45f

    .line 844
    .line 845
    .line 846
    const/high16 v2, -0x40800000    # -1.0f

    .line 847
    .line 848
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 849
    .line 850
    .line 851
    const v0, 0x41373333    # 11.45f

    .line 852
    .line 853
    .line 854
    const/high16 v2, 0x41000000    # 8.0f

    .line 855
    .line 856
    const/high16 v4, 0x41400000    # 12.0f

    .line 857
    .line 858
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 859
    .line 860
    .line 861
    const/high16 v0, 0x40c00000    # 6.0f

    .line 862
    .line 863
    const/high16 v2, 0x41400000    # 12.0f

    .line 864
    .line 865
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 866
    .line 867
    .line 868
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 869
    .line 870
    const/high16 v18, 0x40400000    # 3.0f

    .line 871
    .line 872
    const v13, -0x402b851f    # -1.66f

    .line 873
    .line 874
    .line 875
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 876
    .line 877
    const v16, 0x3fab851f    # 1.34f

    .line 878
    .line 879
    .line 880
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 881
    .line 882
    .line 883
    const/high16 v17, 0x40400000    # 3.0f

    .line 884
    .line 885
    const/4 v13, 0x0

    .line 886
    const v14, 0x3fd47ae1    # 1.66f

    .line 887
    .line 888
    .line 889
    const v15, 0x3fab851f    # 1.34f

    .line 890
    .line 891
    .line 892
    const/high16 v16, 0x40400000    # 3.0f

    .line 893
    .line 894
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 895
    .line 896
    .line 897
    const/high16 v0, 0x40400000    # 3.0f

    .line 898
    .line 899
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 900
    .line 901
    const/high16 v4, 0x40400000    # 3.0f

    .line 902
    .line 903
    const v6, -0x40547ae1    # -1.34f

    .line 904
    .line 905
    .line 906
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 907
    .line 908
    .line 909
    const/high16 v17, 0x41400000    # 12.0f

    .line 910
    .line 911
    const/high16 v18, 0x40c00000    # 6.0f

    .line 912
    .line 913
    const/high16 v13, 0x41700000    # 15.0f

    .line 914
    .line 915
    const v14, 0x40eae148    # 7.34f

    .line 916
    .line 917
    .line 918
    const v15, 0x415a8f5c    # 13.66f

    .line 919
    .line 920
    .line 921
    const/high16 v16, 0x40c00000    # 6.0f

    .line 922
    .line 923
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 924
    .line 925
    .line 926
    const/high16 v0, 0x40c00000    # 6.0f

    .line 927
    .line 928
    const/high16 v2, 0x41400000    # 12.0f

    .line 929
    .line 930
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 931
    .line 932
    .line 933
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 934
    .line 935
    .line 936
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 937
    .line 938
    .line 939
    move-result-object v2

    .line 940
    const/16 v16, 0x3800

    .line 941
    .line 942
    const/16 v17, 0x0

    .line 943
    .line 944
    const/high16 v6, 0x3f800000    # 1.0f

    .line 945
    .line 946
    const/high16 v8, 0x3f800000    # 1.0f

    .line 947
    .line 948
    const/4 v7, 0x0

    .line 949
    const/high16 v12, 0x3f800000    # 1.0f

    .line 950
    .line 951
    const/4 v13, 0x0

    .line 952
    const/4 v14, 0x0

    .line 953
    const/4 v15, 0x0

    .line 954
    const-string v4, ""

    .line 955
    .line 956
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 957
    .line 958
    .line 959
    move-result-object v0

    .line 960
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 961
    .line 962
    .line 963
    move-result-object v0

    .line 964
    sput-object v0, Landroidx/compose/material/icons/twotone/GroupsKt;->_groups:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 965
    .line 966
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 967
    .line 968
    .line 969
    return-object v0
.end method
