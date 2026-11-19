.class public final Landroidx/compose/material/icons/rounded/SpeakerPhoneKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_speakerPhone",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SpeakerPhone",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getSpeakerPhone",
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
        "SMAP\nSpeakerPhone.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpeakerPhone.kt\nandroidx/compose/material/icons/rounded/SpeakerPhoneKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,81:1\n212#2,12:82\n233#2,18:95\n253#2:132\n233#2,18:133\n253#2:170\n233#2,18:171\n253#2:208\n174#3:94\n705#4,2:113\n717#4,2:115\n719#4,11:121\n705#4,2:151\n717#4,2:153\n719#4,11:159\n705#4,2:189\n717#4,2:191\n719#4,11:197\n72#5,4:117\n72#5,4:155\n72#5,4:193\n*S KotlinDebug\n*F\n+ 1 SpeakerPhone.kt\nandroidx/compose/material/icons/rounded/SpeakerPhoneKt\n*L\n29#1:82,12\n30#1:95,18\n30#1:132\n44#1:133,18\n44#1:170\n58#1:171,18\n58#1:208\n29#1:94\n30#1:113,2\n30#1:115,2\n30#1:121,11\n44#1:151,2\n44#1:153,2\n44#1:159,11\n58#1:189,2\n58#1:191,2\n58#1:197,11\n30#1:117,4\n44#1:155,4\n58#1:193,4\n*E\n"
    }
.end annotation


# static fields
.field private static _speakerPhone:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSpeakerPhone(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SpeakerPhoneKt;->_speakerPhone:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SpeakerPhone"

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
    const v4, 0x40f851ec    # 7.76f

    .line 71
    .line 72
    .line 73
    const v6, 0x40fa8f5c    # 7.83f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, 0x3ca3d70a    # 0.02f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const v25, 0x3fa66666    # 1.3f

    .line 86
    .line 87
    .line 88
    const v26, 0x3db851ec    # 0.09f

    .line 89
    .line 90
    .line 91
    const v21, 0x3eb33333    # 0.35f

    .line 92
    .line 93
    .line 94
    const v22, 0x3eb33333    # 0.35f

    .line 95
    .line 96
    .line 97
    const v23, 0x3f63d70a    # 0.89f

    .line 98
    .line 99
    .line 100
    const v24, 0x3ec28f5c    # 0.38f

    .line 101
    .line 102
    .line 103
    move-object/from16 v20, v2

    .line 104
    .line 105
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const/high16 v25, 0x41400000    # 12.0f

    .line 109
    .line 110
    const v26, 0x40e0a3d7    # 7.02f

    .line 111
    .line 112
    .line 113
    const v21, 0x411e8f5c    # 9.91f

    .line 114
    .line 115
    .line 116
    const v22, 0x40ebd70a    # 7.37f

    .line 117
    .line 118
    .line 119
    const v23, 0x412eb852    # 10.92f

    .line 120
    .line 121
    .line 122
    const v24, 0x40e0a3d7    # 7.02f

    .line 123
    .line 124
    .line 125
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v4, 0x403ae148    # 2.92f

    .line 129
    .line 130
    .line 131
    const v6, 0x3f6e147b    # 0.93f

    .line 132
    .line 133
    .line 134
    const v7, 0x4005c28f    # 2.09f

    .line 135
    .line 136
    .line 137
    const v8, 0x3eb33333    # 0.35f

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v25, 0x3fa66666    # 1.3f

    .line 144
    .line 145
    .line 146
    const v26, -0x4247ae14    # -0.09f

    .line 147
    .line 148
    .line 149
    const v21, 0x3ecccccd    # 0.4f

    .line 150
    .line 151
    .line 152
    const v22, 0x3e947ae1    # 0.29f

    .line 153
    .line 154
    .line 155
    const v23, 0x3f733333    # 0.95f

    .line 156
    .line 157
    .line 158
    const v24, 0x3e851eb8    # 0.26f

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v4, -0x435c28f6    # -0.02f

    .line 165
    .line 166
    .line 167
    const v6, 0x3ca3d70a    # 0.02f

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v25, -0x4247ae14    # -0.09f

    .line 174
    .line 175
    .line 176
    const v26, -0x404147ae    # -1.49f

    .line 177
    .line 178
    .line 179
    const v21, 0x3ed70a3d    # 0.42f

    .line 180
    .line 181
    .line 182
    const v22, -0x4128f5c3    # -0.42f

    .line 183
    .line 184
    .line 185
    const v23, 0x3ec7ae14    # 0.39f

    .line 186
    .line 187
    .line 188
    const v24, -0x406e147b    # -1.14f

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v25, 0x41400000    # 12.0f

    .line 195
    .line 196
    const/high16 v26, 0x40a00000    # 5.0f

    .line 197
    .line 198
    const v21, 0x416fae14    # 14.98f

    .line 199
    .line 200
    .line 201
    const/high16 v22, 0x40b00000    # 5.5f

    .line 202
    .line 203
    const v23, 0x4158cccd    # 13.55f

    .line 204
    .line 205
    .line 206
    const/high16 v24, 0x40a00000    # 5.0f

    .line 207
    .line 208
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v4, 0x40fb851f    # 7.86f

    .line 212
    .line 213
    .line 214
    const v6, 0x40cae148    # 6.34f

    .line 215
    .line 216
    .line 217
    const v7, 0x411051ec    # 9.02f

    .line 218
    .line 219
    .line 220
    const/high16 v8, 0x40b00000    # 5.5f

    .line 221
    .line 222
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v25, 0x40f851ec    # 7.76f

    .line 226
    .line 227
    .line 228
    const v26, 0x40fa8f5c    # 7.83f

    .line 229
    .line 230
    .line 231
    const v21, 0x40ebd70a    # 7.37f

    .line 232
    .line 233
    .line 234
    const v22, 0x40d6147b    # 6.69f

    .line 235
    .line 236
    .line 237
    const v23, 0x40eae148    # 7.34f

    .line 238
    .line 239
    .line 240
    const v24, 0x40ed1eb8    # 7.41f

    .line 241
    .line 242
    .line 243
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    const/16 v16, 0x3800

    .line 254
    .line 255
    const/16 v17, 0x0

    .line 256
    .line 257
    const/high16 v6, 0x3f800000    # 1.0f

    .line 258
    .line 259
    const/high16 v8, 0x3f800000    # 1.0f

    .line 260
    .line 261
    const/4 v7, 0x0

    .line 262
    const/high16 v9, 0x3f800000    # 1.0f

    .line 263
    .line 264
    const/high16 v12, 0x3f800000    # 1.0f

    .line 265
    .line 266
    const/4 v13, 0x0

    .line 267
    const/4 v14, 0x0

    .line 268
    const/4 v15, 0x0

    .line 269
    const-string v4, ""

    .line 270
    .line 271
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 272
    .line 273
    .line 274
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 275
    .line 276
    .line 277
    move-result v3

    .line 278
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 279
    .line 280
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 281
    .line 282
    .line 283
    move-result-wide v6

    .line 284
    const/4 v2, 0x0

    .line 285
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 289
    .line 290
    .line 291
    move-result v10

    .line 292
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 293
    .line 294
    .line 295
    move-result v11

    .line 296
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 299
    .line 300
    .line 301
    const/high16 v4, 0x41400000    # 12.0f

    .line 302
    .line 303
    const/high16 v6, 0x3f800000    # 1.0f

    .line 304
    .line 305
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v25, 0x40a28f5c    # 5.08f

    .line 309
    .line 310
    .line 311
    const v26, 0x405e147b    # 3.47f

    .line 312
    .line 313
    .line 314
    const v21, 0x4116147b    # 9.38f

    .line 315
    .line 316
    .line 317
    const/high16 v22, 0x3f800000    # 1.0f

    .line 318
    .line 319
    const v23, 0x40df0a3d    # 6.97f

    .line 320
    .line 321
    .line 322
    const v24, 0x3ff70a3d    # 1.93f

    .line 323
    .line 324
    .line 325
    move-object/from16 v20, v2

    .line 326
    .line 327
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/high16 v25, 0x40a00000    # 5.0f

    .line 331
    .line 332
    const v26, 0x409eb852    # 4.96f

    .line 333
    .line 334
    .line 335
    const v21, 0x4093d70a    # 4.62f

    .line 336
    .line 337
    .line 338
    const v22, 0x4075c28f    # 3.84f

    .line 339
    .line 340
    .line 341
    const v23, 0x40923d71    # 4.57f

    .line 342
    .line 343
    .line 344
    const v24, 0x4090f5c3    # 4.53f

    .line 345
    .line 346
    .line 347
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const/4 v4, 0x0

    .line 351
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v25, 0x3fa8f5c3    # 1.32f

    .line 355
    .line 356
    .line 357
    const v26, 0x3d8f5c29    # 0.07f

    .line 358
    .line 359
    .line 360
    const v21, 0x3eb851ec    # 0.36f

    .line 361
    .line 362
    .line 363
    const v22, 0x3eb851ec    # 0.36f

    .line 364
    .line 365
    .line 366
    const v23, 0x3f6e147b    # 0.93f

    .line 367
    .line 368
    .line 369
    const v24, 0x3ec7ae14    # 0.39f

    .line 370
    .line 371
    .line 372
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v25, 0x41400000    # 12.0f

    .line 376
    .line 377
    const/high16 v26, 0x40400000    # 3.0f

    .line 378
    .line 379
    const v21, 0x40fb851f    # 7.86f

    .line 380
    .line 381
    .line 382
    const v22, 0x4070a3d7    # 3.76f

    .line 383
    .line 384
    .line 385
    const v23, 0x411d999a    # 9.85f

    .line 386
    .line 387
    .line 388
    const/high16 v24, 0x40400000    # 3.0f

    .line 389
    .line 390
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v4, 0x40b6147b    # 5.69f

    .line 394
    .line 395
    .line 396
    const v6, 0x4001eb85    # 2.03f

    .line 397
    .line 398
    .line 399
    const v7, 0x40847ae1    # 4.14f

    .line 400
    .line 401
    .line 402
    const v8, 0x3f428f5c    # 0.76f

    .line 403
    .line 404
    .line 405
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v25, 0x3fa8f5c3    # 1.32f

    .line 409
    .line 410
    .line 411
    const v26, -0x4270a3d7    # -0.07f

    .line 412
    .line 413
    .line 414
    const v21, 0x3ec7ae14    # 0.39f

    .line 415
    .line 416
    .line 417
    const v22, 0x3ea3d70a    # 0.32f

    .line 418
    .line 419
    .line 420
    const v23, 0x3f75c28f    # 0.96f

    .line 421
    .line 422
    .line 423
    const v24, 0x3e947ae1    # 0.29f

    .line 424
    .line 425
    .line 426
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const/4 v4, 0x0

    .line 430
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v25, -0x425c28f6    # -0.08f

    .line 434
    .line 435
    .line 436
    const v26, -0x404147ae    # -1.49f

    .line 437
    .line 438
    .line 439
    const v21, 0x3ed70a3d    # 0.42f

    .line 440
    .line 441
    .line 442
    const v22, -0x4128f5c3    # -0.42f

    .line 443
    .line 444
    .line 445
    const v23, 0x3ec28f5c    # 0.38f

    .line 446
    .line 447
    .line 448
    const v24, -0x4071eb85    # -1.11f

    .line 449
    .line 450
    .line 451
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const/high16 v25, 0x41400000    # 12.0f

    .line 455
    .line 456
    const/high16 v26, 0x3f800000    # 1.0f

    .line 457
    .line 458
    const v21, 0x41883d71    # 17.03f

    .line 459
    .line 460
    .line 461
    const v22, 0x3ff70a3d    # 1.93f

    .line 462
    .line 463
    .line 464
    const v23, 0x4169eb85    # 14.62f

    .line 465
    .line 466
    .line 467
    const/high16 v24, 0x3f800000    # 1.0f

    .line 468
    .line 469
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 476
    .line 477
    .line 478
    move-result-object v2

    .line 479
    const/high16 v6, 0x3f800000    # 1.0f

    .line 480
    .line 481
    const/high16 v8, 0x3f800000    # 1.0f

    .line 482
    .line 483
    const/4 v7, 0x0

    .line 484
    const-string v4, ""

    .line 485
    .line 486
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 487
    .line 488
    .line 489
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 490
    .line 491
    .line 492
    move-result v3

    .line 493
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 494
    .line 495
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 496
    .line 497
    .line 498
    move-result-wide v6

    .line 499
    const/4 v0, 0x0

    .line 500
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 501
    .line 502
    .line 503
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 504
    .line 505
    .line 506
    move-result v10

    .line 507
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 508
    .line 509
    .line 510
    move-result v11

    .line 511
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 514
    .line 515
    .line 516
    const/high16 v0, 0x41200000    # 10.0f

    .line 517
    .line 518
    const/high16 v2, 0x41700000    # 15.0f

    .line 519
    .line 520
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const/high16 v0, -0x3f400000    # -6.0f

    .line 524
    .line 525
    const/4 v2, 0x0

    .line 526
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const/high16 v17, -0x40800000    # -1.0f

    .line 530
    .line 531
    const/high16 v18, 0x3f800000    # 1.0f

    .line 532
    .line 533
    const v13, -0x40f33333    # -0.55f

    .line 534
    .line 535
    .line 536
    const/high16 v15, -0x40800000    # -1.0f

    .line 537
    .line 538
    const v16, 0x3ee66666    # 0.45f

    .line 539
    .line 540
    .line 541
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const/high16 v0, 0x41200000    # 10.0f

    .line 545
    .line 546
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const/high16 v17, 0x3f800000    # 1.0f

    .line 550
    .line 551
    const/4 v13, 0x0

    .line 552
    const v14, 0x3f0ccccd    # 0.55f

    .line 553
    .line 554
    .line 555
    const v15, 0x3ee66666    # 0.45f

    .line 556
    .line 557
    .line 558
    const/high16 v16, 0x3f800000    # 1.0f

    .line 559
    .line 560
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const v0, 0x40bfae14    # 5.99f

    .line 564
    .line 565
    .line 566
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const/high16 v18, -0x40800000    # -1.0f

    .line 570
    .line 571
    const v13, 0x3f0ccccd    # 0.55f

    .line 572
    .line 573
    .line 574
    const/4 v14, 0x0

    .line 575
    const/high16 v15, 0x3f800000    # 1.0f

    .line 576
    .line 577
    const v16, -0x4119999a    # -0.45f

    .line 578
    .line 579
    .line 580
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const/high16 v0, 0x41800000    # 16.0f

    .line 584
    .line 585
    const/high16 v2, 0x41300000    # 11.0f

    .line 586
    .line 587
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const/high16 v17, 0x41700000    # 15.0f

    .line 591
    .line 592
    const/high16 v18, 0x41200000    # 10.0f

    .line 593
    .line 594
    const/high16 v13, 0x41800000    # 16.0f

    .line 595
    .line 596
    const v14, 0x41273333    # 10.45f

    .line 597
    .line 598
    .line 599
    const v15, 0x4178cccd    # 15.55f

    .line 600
    .line 601
    .line 602
    const/high16 v16, 0x41200000    # 10.0f

    .line 603
    .line 604
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const/high16 v0, 0x41a00000    # 20.0f

    .line 611
    .line 612
    const/high16 v2, 0x41700000    # 15.0f

    .line 613
    .line 614
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const/high16 v0, 0x41100000    # 9.0f

    .line 618
    .line 619
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const/high16 v0, -0x3f000000    # -8.0f

    .line 623
    .line 624
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    const/high16 v0, 0x40c00000    # 6.0f

    .line 628
    .line 629
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const/high16 v0, 0x41a00000    # 20.0f

    .line 633
    .line 634
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 641
    .line 642
    .line 643
    move-result-object v2

    .line 644
    const/16 v16, 0x3800

    .line 645
    .line 646
    const/16 v17, 0x0

    .line 647
    .line 648
    const/high16 v6, 0x3f800000    # 1.0f

    .line 649
    .line 650
    const/4 v7, 0x0

    .line 651
    const/high16 v12, 0x3f800000    # 1.0f

    .line 652
    .line 653
    const/4 v13, 0x0

    .line 654
    const/4 v14, 0x0

    .line 655
    const/4 v15, 0x0

    .line 656
    const-string v4, ""

    .line 657
    .line 658
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 659
    .line 660
    .line 661
    move-result-object v0

    .line 662
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 663
    .line 664
    .line 665
    move-result-object v0

    .line 666
    sput-object v0, Landroidx/compose/material/icons/rounded/SpeakerPhoneKt;->_speakerPhone:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 667
    .line 668
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 669
    .line 670
    .line 671
    return-object v0
.end method
