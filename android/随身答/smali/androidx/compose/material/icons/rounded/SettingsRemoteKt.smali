.class public final Landroidx/compose/material/icons/rounded/SettingsRemoteKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_settingsRemote",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SettingsRemote",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getSettingsRemote",
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
        "SMAP\nSettingsRemote.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsRemote.kt\nandroidx/compose/material/icons/rounded/SettingsRemoteKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,81:1\n212#2,12:82\n233#2,18:95\n253#2:132\n233#2,18:133\n253#2:170\n233#2,18:171\n253#2:208\n174#3:94\n705#4,2:113\n717#4,2:115\n719#4,11:121\n705#4,2:151\n717#4,2:153\n719#4,11:159\n705#4,2:189\n717#4,2:191\n719#4,11:197\n72#5,4:117\n72#5,4:155\n72#5,4:193\n*S KotlinDebug\n*F\n+ 1 SettingsRemote.kt\nandroidx/compose/material/icons/rounded/SettingsRemoteKt\n*L\n29#1:82,12\n30#1:95,18\n30#1:132\n48#1:133,18\n48#1:170\n62#1:171,18\n62#1:208\n29#1:94\n30#1:113,2\n30#1:115,2\n30#1:121,11\n48#1:151,2\n48#1:153,2\n48#1:159,11\n62#1:189,2\n62#1:191,2\n62#1:197,11\n30#1:117,4\n48#1:155,4\n62#1:193,4\n*E\n"
    }
.end annotation


# static fields
.field private static _settingsRemote:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSettingsRemote(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SettingsRemoteKt;->_settingsRemote:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SettingsRemote"

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
    const/high16 v4, 0x41700000    # 15.0f

    .line 71
    .line 72
    const/high16 v6, 0x41100000    # 9.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x41100000    # 9.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v25, -0x40800000    # -1.0f

    .line 83
    .line 84
    const/high16 v26, 0x3f800000    # 1.0f

    .line 85
    .line 86
    const v21, -0x40f33333    # -0.55f

    .line 87
    .line 88
    .line 89
    const/16 v22, 0x0

    .line 90
    .line 91
    const/high16 v23, -0x40800000    # -1.0f

    .line 92
    .line 93
    const v24, 0x3ee66666    # 0.45f

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
    const/high16 v4, 0x41400000    # 12.0f

    .line 102
    .line 103
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v25, 0x3f800000    # 1.0f

    .line 107
    .line 108
    const/16 v21, 0x0

    .line 109
    .line 110
    const v22, 0x3f0ccccd    # 0.55f

    .line 111
    .line 112
    .line 113
    const v23, 0x3ee66666    # 0.45f

    .line 114
    .line 115
    .line 116
    const/high16 v24, 0x3f800000    # 1.0f

    .line 117
    .line 118
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v4, 0x40c00000    # 6.0f

    .line 122
    .line 123
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v26, -0x40800000    # -1.0f

    .line 127
    .line 128
    const v21, 0x3f0ccccd    # 0.55f

    .line 129
    .line 130
    .line 131
    const/16 v22, 0x0

    .line 132
    .line 133
    const/high16 v23, 0x3f800000    # 1.0f

    .line 134
    .line 135
    const v24, -0x4119999a    # -0.45f

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v4, 0x41200000    # 10.0f

    .line 142
    .line 143
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v25, 0x41700000    # 15.0f

    .line 147
    .line 148
    const/high16 v26, 0x41100000    # 9.0f

    .line 149
    .line 150
    const/high16 v21, 0x41800000    # 16.0f

    .line 151
    .line 152
    const v22, 0x41173333    # 9.45f

    .line 153
    .line 154
    .line 155
    const v23, 0x4178cccd    # 15.55f

    .line 156
    .line 157
    .line 158
    const/high16 v24, 0x41100000    # 9.0f

    .line 159
    .line 160
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v4, 0x41640000    # 14.25f

    .line 167
    .line 168
    const/high16 v6, 0x41400000    # 12.0f

    .line 169
    .line 170
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v25, -0x40600000    # -1.25f

    .line 174
    .line 175
    const/high16 v26, -0x40600000    # -1.25f

    .line 176
    .line 177
    const v21, -0x40cf5c29    # -0.69f

    .line 178
    .line 179
    .line 180
    const/16 v22, 0x0

    .line 181
    .line 182
    const/high16 v23, -0x40600000    # -1.25f

    .line 183
    .line 184
    const v24, -0x40f0a3d7    # -0.56f

    .line 185
    .line 186
    .line 187
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v4, -0x40600000    # -1.25f

    .line 191
    .line 192
    const v6, 0x3f0f5c29    # 0.56f

    .line 193
    .line 194
    .line 195
    const/high16 v7, 0x3fa00000    # 1.25f

    .line 196
    .line 197
    invoke-virtual {v2, v6, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v4, 0x3f0f5c29    # 0.56f

    .line 201
    .line 202
    .line 203
    const/high16 v6, 0x3fa00000    # 1.25f

    .line 204
    .line 205
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const v4, 0x414b0a3d    # 12.69f

    .line 209
    .line 210
    .line 211
    const/high16 v6, 0x41640000    # 14.25f

    .line 212
    .line 213
    const/high16 v7, 0x41400000    # 12.0f

    .line 214
    .line 215
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    const/16 v16, 0x3800

    .line 226
    .line 227
    const/16 v17, 0x0

    .line 228
    .line 229
    const/high16 v6, 0x3f800000    # 1.0f

    .line 230
    .line 231
    const/high16 v8, 0x3f800000    # 1.0f

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
    const/4 v2, 0x0

    .line 257
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 271
    .line 272
    .line 273
    const v4, 0x40da3d71    # 6.82f

    .line 274
    .line 275
    .line 276
    const v6, 0x40fa3d71    # 7.82f

    .line 277
    .line 278
    .line 279
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v25, 0x3fa66666    # 1.3f

    .line 286
    .line 287
    .line 288
    const v26, 0x3dcccccd    # 0.1f

    .line 289
    .line 290
    .line 291
    const v21, 0x3eb33333    # 0.35f

    .line 292
    .line 293
    .line 294
    const v22, 0x3eb33333    # 0.35f

    .line 295
    .line 296
    .line 297
    const v23, 0x3f666666    # 0.9f

    .line 298
    .line 299
    .line 300
    const v24, 0x3ec28f5c    # 0.38f

    .line 301
    .line 302
    .line 303
    move-object/from16 v20, v2

    .line 304
    .line 305
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v25, 0x41400000    # 12.0f

    .line 309
    .line 310
    const/high16 v26, 0x40c00000    # 6.0f

    .line 311
    .line 312
    const v21, 0x411ee148    # 9.93f

    .line 313
    .line 314
    .line 315
    const v22, 0x40cae148    # 6.34f

    .line 316
    .line 317
    .line 318
    const v23, 0x412ee148    # 10.93f

    .line 319
    .line 320
    .line 321
    const/high16 v24, 0x40c00000    # 6.0f

    .line 322
    .line 323
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v25, 0x403851ec    # 2.88f

    .line 327
    .line 328
    .line 329
    const v26, 0x3f68f5c3    # 0.91f

    .line 330
    .line 331
    .line 332
    const v21, 0x3f88f5c3    # 1.07f

    .line 333
    .line 334
    .line 335
    const/16 v22, 0x0

    .line 336
    .line 337
    const v23, 0x40047ae1    # 2.07f

    .line 338
    .line 339
    .line 340
    const v24, 0x3eae147b    # 0.34f

    .line 341
    .line 342
    .line 343
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v25, 0x3fa66666    # 1.3f

    .line 347
    .line 348
    .line 349
    const v26, -0x4247ae14    # -0.09f

    .line 350
    .line 351
    .line 352
    const v21, 0x3ecccccd    # 0.4f

    .line 353
    .line 354
    .line 355
    const v22, 0x3e8f5c29    # 0.28f

    .line 356
    .line 357
    .line 358
    const v23, 0x3f733333    # 0.95f

    .line 359
    .line 360
    .line 361
    const v24, 0x3e851eb8    # 0.26f

    .line 362
    .line 363
    .line 364
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const/4 v4, 0x0

    .line 368
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v25, -0x4247ae14    # -0.09f

    .line 372
    .line 373
    .line 374
    const/high16 v26, -0x40400000    # -1.5f

    .line 375
    .line 376
    const v21, 0x3edc28f6    # 0.43f

    .line 377
    .line 378
    .line 379
    const v22, -0x4123d70a    # -0.43f

    .line 380
    .line 381
    .line 382
    const v23, 0x3ec7ae14    # 0.39f

    .line 383
    .line 384
    .line 385
    const v24, -0x406ccccd    # -1.15f

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v25, 0x41400000    # 12.0f

    .line 392
    .line 393
    const/high16 v26, 0x40800000    # 4.0f

    .line 394
    .line 395
    const v21, 0x416f0a3d    # 14.94f

    .line 396
    .line 397
    .line 398
    const v22, 0x408fae14    # 4.49f

    .line 399
    .line 400
    .line 401
    const v23, 0x41587ae1    # 13.53f

    .line 402
    .line 403
    .line 404
    const/high16 v24, 0x40800000    # 4.0f

    .line 405
    .line 406
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v25, -0x3f7d1eb8    # -4.09f

    .line 410
    .line 411
    .line 412
    const v26, 0x3fa8f5c3    # 1.32f

    .line 413
    .line 414
    .line 415
    const v21, -0x403c28f6    # -1.53f

    .line 416
    .line 417
    .line 418
    const/16 v22, 0x0

    .line 419
    .line 420
    const v23, -0x3fc3d70a    # -2.94f

    .line 421
    .line 422
    .line 423
    const v24, 0x3efae148    # 0.49f

    .line 424
    .line 425
    .line 426
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v25, 0x40fa3d71    # 7.82f

    .line 430
    .line 431
    .line 432
    const v26, 0x40da3d71    # 6.82f

    .line 433
    .line 434
    .line 435
    const v21, 0x40ed70a4    # 7.42f

    .line 436
    .line 437
    .line 438
    const v22, 0x40b570a4    # 5.67f

    .line 439
    .line 440
    .line 441
    const v23, 0x40ec7ae1    # 7.39f

    .line 442
    .line 443
    .line 444
    const v24, 0x40cc7ae1    # 6.39f

    .line 445
    .line 446
    .line 447
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 454
    .line 455
    .line 456
    move-result-object v2

    .line 457
    const/high16 v6, 0x3f800000    # 1.0f

    .line 458
    .line 459
    const/4 v7, 0x0

    .line 460
    const-string v4, ""

    .line 461
    .line 462
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 463
    .line 464
    .line 465
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 466
    .line 467
    .line 468
    move-result v3

    .line 469
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 470
    .line 471
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 472
    .line 473
    .line 474
    move-result-wide v6

    .line 475
    const/4 v0, 0x0

    .line 476
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 477
    .line 478
    .line 479
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 480
    .line 481
    .line 482
    move-result v10

    .line 483
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 484
    .line 485
    .line 486
    move-result v11

    .line 487
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 490
    .line 491
    .line 492
    const/high16 v0, 0x41400000    # 12.0f

    .line 493
    .line 494
    const/4 v2, 0x0

    .line 495
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const v17, 0x40a1999a    # 5.05f

    .line 499
    .line 500
    .line 501
    const v18, 0x401e147b    # 2.47f

    .line 502
    .line 503
    .line 504
    const v13, 0x4115c28f    # 9.36f

    .line 505
    .line 506
    .line 507
    const v15, 0x40de147b    # 6.94f

    .line 508
    .line 509
    .line 510
    const v16, 0x3f6e147b    # 0.93f

    .line 511
    .line 512
    .line 513
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const v17, -0x425c28f6    # -0.08f

    .line 517
    .line 518
    .line 519
    const v18, 0x3fbeb852    # 1.49f

    .line 520
    .line 521
    .line 522
    const v13, -0x41147ae1    # -0.46f

    .line 523
    .line 524
    .line 525
    const v14, 0x3ec28f5c    # 0.38f

    .line 526
    .line 527
    .line 528
    const/high16 v15, -0x41000000    # -0.5f

    .line 529
    .line 530
    const v16, 0x3f88f5c3    # 1.07f

    .line 531
    .line 532
    .line 533
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const/4 v0, 0x0

    .line 537
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const v17, 0x3fa8f5c3    # 1.32f

    .line 541
    .line 542
    .line 543
    const v18, 0x3d8f5c29    # 0.07f

    .line 544
    .line 545
    .line 546
    const v13, 0x3eb851ec    # 0.36f

    .line 547
    .line 548
    .line 549
    const v14, 0x3eb851ec    # 0.36f

    .line 550
    .line 551
    .line 552
    const v15, 0x3f6e147b    # 0.93f

    .line 553
    .line 554
    .line 555
    const v16, 0x3ec7ae14    # 0.39f

    .line 556
    .line 557
    .line 558
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const/high16 v17, 0x41400000    # 12.0f

    .line 562
    .line 563
    const/high16 v18, 0x40000000    # 2.0f

    .line 564
    .line 565
    const v13, 0x40fae148    # 7.84f

    .line 566
    .line 567
    .line 568
    const v14, 0x403147ae    # 2.77f

    .line 569
    .line 570
    .line 571
    const v15, 0x411d47ae    # 9.83f

    .line 572
    .line 573
    .line 574
    const/high16 v16, 0x40000000    # 2.0f

    .line 575
    .line 576
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const v17, 0x40b66666    # 5.7f

    .line 580
    .line 581
    .line 582
    const v18, 0x40028f5c    # 2.04f

    .line 583
    .line 584
    .line 585
    const v13, 0x400ae148    # 2.17f

    .line 586
    .line 587
    .line 588
    const/4 v14, 0x0

    .line 589
    const v15, 0x40851eb8    # 4.16f

    .line 590
    .line 591
    .line 592
    const v16, 0x3f451eb8    # 0.77f

    .line 593
    .line 594
    .line 595
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const v17, 0x3fa8f5c3    # 1.32f

    .line 599
    .line 600
    .line 601
    const v18, -0x4270a3d7    # -0.07f

    .line 602
    .line 603
    .line 604
    const v13, 0x3ec7ae14    # 0.39f

    .line 605
    .line 606
    .line 607
    const v14, 0x3ea3d70a    # 0.32f

    .line 608
    .line 609
    .line 610
    const v15, 0x3f75c28f    # 0.96f

    .line 611
    .line 612
    .line 613
    const v16, 0x3e947ae1    # 0.29f

    .line 614
    .line 615
    .line 616
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const v17, -0x425c28f6    # -0.08f

    .line 623
    .line 624
    .line 625
    const v18, -0x404147ae    # -1.49f

    .line 626
    .line 627
    .line 628
    const v13, 0x3ed70a3d    # 0.42f

    .line 629
    .line 630
    .line 631
    const v14, -0x4128f5c3    # -0.42f

    .line 632
    .line 633
    .line 634
    const v15, 0x3ec28f5c    # 0.38f

    .line 635
    .line 636
    .line 637
    const v16, -0x4071eb85    # -1.11f

    .line 638
    .line 639
    .line 640
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const/high16 v17, 0x41400000    # 12.0f

    .line 644
    .line 645
    const/16 v18, 0x0

    .line 646
    .line 647
    const v13, 0x41887ae1    # 17.06f

    .line 648
    .line 649
    .line 650
    const v14, 0x3f6e147b    # 0.93f

    .line 651
    .line 652
    .line 653
    const v15, 0x416a3d71    # 14.64f

    .line 654
    .line 655
    .line 656
    const/16 v16, 0x0

    .line 657
    .line 658
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 665
    .line 666
    .line 667
    move-result-object v2

    .line 668
    const/16 v16, 0x3800

    .line 669
    .line 670
    const/16 v17, 0x0

    .line 671
    .line 672
    const/high16 v6, 0x3f800000    # 1.0f

    .line 673
    .line 674
    const/4 v7, 0x0

    .line 675
    const/high16 v12, 0x3f800000    # 1.0f

    .line 676
    .line 677
    const/4 v13, 0x0

    .line 678
    const/4 v14, 0x0

    .line 679
    const/4 v15, 0x0

    .line 680
    const-string v4, ""

    .line 681
    .line 682
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 683
    .line 684
    .line 685
    move-result-object v0

    .line 686
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 687
    .line 688
    .line 689
    move-result-object v0

    .line 690
    sput-object v0, Landroidx/compose/material/icons/rounded/SettingsRemoteKt;->_settingsRemote:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 691
    .line 692
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 693
    .line 694
    .line 695
    return-object v0
.end method
