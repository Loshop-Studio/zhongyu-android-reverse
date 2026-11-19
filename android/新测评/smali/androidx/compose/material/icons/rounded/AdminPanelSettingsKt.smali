.class public final Landroidx/compose/material/icons/rounded/AdminPanelSettingsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_adminPanelSettings",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "AdminPanelSettings",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getAdminPanelSettings",
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
        "SMAP\nAdminPanelSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdminPanelSettings.kt\nandroidx/compose/material/icons/rounded/AdminPanelSettingsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,71:1\n212#2,12:72\n233#2,18:85\n253#2:122\n233#2,18:123\n253#2:160\n174#3:84\n705#4,2:103\n717#4,2:105\n719#4,11:111\n705#4,2:141\n717#4,2:143\n719#4,11:149\n72#5,4:107\n72#5,4:145\n*S KotlinDebug\n*F\n+ 1 AdminPanelSettings.kt\nandroidx/compose/material/icons/rounded/AdminPanelSettingsKt\n*L\n29#1:72,12\n30#1:85,18\n30#1:122\n46#1:123,18\n46#1:160\n29#1:84\n30#1:103,2\n30#1:105,2\n30#1:111,11\n46#1:141,2\n46#1:143,2\n46#1:149,11\n30#1:107,4\n46#1:145,4\n*E\n"
    }
.end annotation


# static fields
.field private static _adminPanelSettings:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAdminPanelSettings(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/AdminPanelSettingsKt;->_adminPanelSettings:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.AdminPanelSettings"

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
    const/high16 v4, 0x41300000    # 11.0f

    .line 71
    .line 72
    const/high16 v6, 0x41880000    # 17.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x3f800000    # 1.0f

    .line 78
    .line 79
    const v26, 0x3db851ec    # 0.09f

    .line 80
    .line 81
    .line 82
    const v21, 0x3eae147b    # 0.34f

    .line 83
    .line 84
    .line 85
    const/16 v22, 0x0

    .line 86
    .line 87
    const v23, 0x3f2b851f    # 0.67f

    .line 88
    .line 89
    .line 90
    const v24, 0x3d23d70a    # 0.04f

    .line 91
    .line 92
    .line 93
    move-object/from16 v20, v2

    .line 94
    .line 95
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v4, 0x40f28f5c    # 7.58f

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v25, -0x40666666    # -1.2f

    .line 105
    .line 106
    .line 107
    const v26, -0x4015c28f    # -1.83f

    .line 108
    .line 109
    .line 110
    const/16 v21, 0x0

    .line 111
    .line 112
    const v22, -0x40b33333    # -0.8f

    .line 113
    .line 114
    .line 115
    const v23, -0x410f5c29    # -0.47f

    .line 116
    .line 117
    .line 118
    const v24, -0x403d70a4    # -1.52f

    .line 119
    .line 120
    .line 121
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v4, -0x3fe66666    # -2.4f

    .line 125
    .line 126
    .line 127
    const/high16 v6, -0x3f500000    # -5.5f

    .line 128
    .line 129
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v25, -0x40333333    # -1.6f

    .line 133
    .line 134
    .line 135
    const/16 v26, 0x0

    .line 136
    .line 137
    const v21, -0x40fd70a4    # -0.51f

    .line 138
    .line 139
    .line 140
    const v22, -0x419eb852    # -0.22f

    .line 141
    .line 142
    .line 143
    const v23, -0x40747ae1    # -1.09f

    .line 144
    .line 145
    .line 146
    const v24, -0x419eb852    # -0.22f

    .line 147
    .line 148
    .line 149
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v4, 0x4019999a    # 2.4f

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v25, 0x40400000    # 3.0f

    .line 159
    .line 160
    const v26, 0x40f28f5c    # 7.58f

    .line 161
    .line 162
    .line 163
    const v21, 0x405e147b    # 3.47f

    .line 164
    .line 165
    .line 166
    const v22, 0x40c23d71    # 6.07f

    .line 167
    .line 168
    .line 169
    const/high16 v23, 0x40400000    # 3.0f

    .line 170
    .line 171
    const v24, 0x40d947ae    # 6.79f

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v4, 0x40666666    # 3.6f

    .line 178
    .line 179
    .line 180
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const/high16 v25, 0x40f00000    # 7.5f

    .line 184
    .line 185
    const v26, 0x411d1eb8    # 9.82f

    .line 186
    .line 187
    .line 188
    const/16 v21, 0x0

    .line 189
    .line 190
    const v22, 0x409147ae    # 4.54f

    .line 191
    .line 192
    .line 193
    const v23, 0x404ccccd    # 3.2f

    .line 194
    .line 195
    .line 196
    const v24, 0x410ca3d7    # 8.79f

    .line 197
    .line 198
    .line 199
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v25, 0x3fcccccd    # 1.6f

    .line 203
    .line 204
    .line 205
    const v26, -0x40f33333    # -0.55f

    .line 206
    .line 207
    .line 208
    const v21, 0x3f0ccccd    # 0.55f

    .line 209
    .line 210
    .line 211
    const v22, -0x41fae148    # -0.13f

    .line 212
    .line 213
    .line 214
    const v23, 0x3f8a3d71    # 1.08f

    .line 215
    .line 216
    .line 217
    const v24, -0x415c28f6    # -0.32f

    .line 218
    .line 219
    .line 220
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v25, 0x41300000    # 11.0f

    .line 224
    .line 225
    const/high16 v26, 0x41880000    # 17.0f

    .line 226
    .line 227
    const v21, 0x41368f5c    # 11.41f

    .line 228
    .line 229
    .line 230
    const v22, 0x419bc28f    # 19.47f

    .line 231
    .line 232
    .line 233
    const/high16 v23, 0x41300000    # 11.0f

    .line 234
    .line 235
    const v24, 0x41923d71    # 18.28f

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const/high16 v25, 0x41880000    # 17.0f

    .line 242
    .line 243
    const/high16 v26, 0x41300000    # 11.0f

    .line 244
    .line 245
    const/high16 v21, 0x41300000    # 11.0f

    .line 246
    .line 247
    const v22, 0x415b0a3d    # 13.69f

    .line 248
    .line 249
    .line 250
    const v23, 0x415b0a3d    # 13.69f

    .line 251
    .line 252
    .line 253
    const/high16 v24, 0x41300000    # 11.0f

    .line 254
    .line 255
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    const/16 v16, 0x3800

    .line 266
    .line 267
    const/16 v17, 0x0

    .line 268
    .line 269
    const/high16 v6, 0x3f800000    # 1.0f

    .line 270
    .line 271
    const/high16 v8, 0x3f800000    # 1.0f

    .line 272
    .line 273
    const/4 v7, 0x0

    .line 274
    const/high16 v9, 0x3f800000    # 1.0f

    .line 275
    .line 276
    const/high16 v12, 0x3f800000    # 1.0f

    .line 277
    .line 278
    const/4 v13, 0x0

    .line 279
    const/4 v14, 0x0

    .line 280
    const/4 v15, 0x0

    .line 281
    const-string v4, ""

    .line 282
    .line 283
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 284
    .line 285
    .line 286
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 287
    .line 288
    .line 289
    move-result v3

    .line 290
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 291
    .line 292
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 293
    .line 294
    .line 295
    move-result-wide v6

    .line 296
    const/4 v0, 0x0

    .line 297
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 301
    .line 302
    .line 303
    move-result v10

    .line 304
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 305
    .line 306
    .line 307
    move-result v11

    .line 308
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 311
    .line 312
    .line 313
    const/high16 v0, 0x41500000    # 13.0f

    .line 314
    .line 315
    const/high16 v2, 0x41880000    # 17.0f

    .line 316
    .line 317
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/high16 v17, -0x3f800000    # -4.0f

    .line 321
    .line 322
    const/high16 v18, 0x40800000    # 4.0f

    .line 323
    .line 324
    const v13, -0x3ff28f5c    # -2.21f

    .line 325
    .line 326
    .line 327
    const/high16 v15, -0x3f800000    # -4.0f

    .line 328
    .line 329
    const v16, 0x3fe51eb8    # 1.79f

    .line 330
    .line 331
    .line 332
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v17, 0x40800000    # 4.0f

    .line 336
    .line 337
    const/4 v13, 0x0

    .line 338
    const v14, 0x400d70a4    # 2.21f

    .line 339
    .line 340
    .line 341
    const v15, 0x3fe51eb8    # 1.79f

    .line 342
    .line 343
    .line 344
    const/high16 v16, 0x40800000    # 4.0f

    .line 345
    .line 346
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v0, -0x401ae148    # -1.79f

    .line 350
    .line 351
    .line 352
    const/high16 v2, -0x3f800000    # -4.0f

    .line 353
    .line 354
    const/high16 v4, 0x40800000    # 4.0f

    .line 355
    .line 356
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const/high16 v17, 0x41880000    # 17.0f

    .line 360
    .line 361
    const/high16 v18, 0x41500000    # 13.0f

    .line 362
    .line 363
    const/high16 v13, 0x41a80000    # 21.0f

    .line 364
    .line 365
    const v14, 0x416ca3d7    # 14.79f

    .line 366
    .line 367
    .line 368
    const v15, 0x4199ae14    # 19.21f

    .line 369
    .line 370
    .line 371
    const/high16 v16, 0x41500000    # 13.0f

    .line 372
    .line 373
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v0, 0x4166147b    # 14.38f

    .line 380
    .line 381
    .line 382
    const/high16 v2, 0x41880000    # 17.0f

    .line 383
    .line 384
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v17, 0x3f8f5c29    # 1.12f

    .line 388
    .line 389
    .line 390
    const v18, 0x3f8f5c29    # 1.12f

    .line 391
    .line 392
    .line 393
    const v13, 0x3f1eb852    # 0.62f

    .line 394
    .line 395
    .line 396
    const/4 v14, 0x0

    .line 397
    const v15, 0x3f8f5c29    # 1.12f

    .line 398
    .line 399
    .line 400
    const v16, 0x3f028f5c    # 0.51f

    .line 401
    .line 402
    .line 403
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v0, 0x3f8f5c29    # 1.12f

    .line 407
    .line 408
    .line 409
    const v2, -0x40fd70a4    # -0.51f

    .line 410
    .line 411
    .line 412
    const v4, -0x4070a3d7    # -1.12f

    .line 413
    .line 414
    .line 415
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v0, -0x40fd70a4    # -0.51f

    .line 419
    .line 420
    .line 421
    const v2, -0x4070a3d7    # -1.12f

    .line 422
    .line 423
    .line 424
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v0, 0x41830a3d    # 16.38f

    .line 428
    .line 429
    .line 430
    const v2, 0x4166147b    # 14.38f

    .line 431
    .line 432
    .line 433
    const/high16 v4, 0x41880000    # 17.0f

    .line 434
    .line 435
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v0, 0x419e0000    # 19.75f

    .line 442
    .line 443
    const/high16 v2, 0x41880000    # 17.0f

    .line 444
    .line 445
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const v17, -0x3ff0a3d7    # -2.24f

    .line 449
    .line 450
    .line 451
    const v18, -0x406a3d71    # -1.17f

    .line 452
    .line 453
    .line 454
    const v13, -0x4091eb85    # -0.93f

    .line 455
    .line 456
    .line 457
    const v15, -0x402147ae    # -1.74f

    .line 458
    .line 459
    .line 460
    const v16, -0x41147ae1    # -0.46f

    .line 461
    .line 462
    .line 463
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const v17, 0x400f5c29    # 2.24f

    .line 467
    .line 468
    .line 469
    const v18, -0x4075c28f    # -1.08f

    .line 470
    .line 471
    .line 472
    const v13, 0x3d4ccccd    # 0.05f

    .line 473
    .line 474
    .line 475
    const v14, -0x40c7ae14    # -0.72f

    .line 476
    .line 477
    .line 478
    const v15, 0x3fc147ae    # 1.51f

    .line 479
    .line 480
    .line 481
    const v16, -0x4075c28f    # -1.08f

    .line 482
    .line 483
    .line 484
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v0, 0x400f5c29    # 2.24f

    .line 488
    .line 489
    .line 490
    const v2, 0x3f8a3d71    # 1.08f

    .line 491
    .line 492
    .line 493
    const v4, 0x400c28f6    # 2.19f

    .line 494
    .line 495
    .line 496
    const v6, 0x3eb851ec    # 0.36f

    .line 497
    .line 498
    .line 499
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const/high16 v17, 0x41880000    # 17.0f

    .line 503
    .line 504
    const/high16 v18, 0x419e0000    # 19.75f

    .line 505
    .line 506
    const v13, 0x4195eb85    # 18.74f

    .line 507
    .line 508
    .line 509
    const v14, 0x419a51ec    # 19.29f

    .line 510
    .line 511
    .line 512
    const v15, 0x418f70a4    # 17.93f

    .line 513
    .line 514
    .line 515
    const/high16 v16, 0x419e0000    # 19.75f

    .line 516
    .line 517
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 524
    .line 525
    .line 526
    move-result-object v2

    .line 527
    const/16 v16, 0x3800

    .line 528
    .line 529
    const/16 v17, 0x0

    .line 530
    .line 531
    const/high16 v6, 0x3f800000    # 1.0f

    .line 532
    .line 533
    const/4 v7, 0x0

    .line 534
    const/high16 v12, 0x3f800000    # 1.0f

    .line 535
    .line 536
    const/4 v13, 0x0

    .line 537
    const/4 v14, 0x0

    .line 538
    const/4 v15, 0x0

    .line 539
    const-string v4, ""

    .line 540
    .line 541
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 542
    .line 543
    .line 544
    move-result-object v0

    .line 545
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 546
    .line 547
    .line 548
    move-result-object v0

    .line 549
    sput-object v0, Landroidx/compose/material/icons/rounded/AdminPanelSettingsKt;->_adminPanelSettings:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 550
    .line 551
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 552
    .line 553
    .line 554
    return-object v0
.end method
