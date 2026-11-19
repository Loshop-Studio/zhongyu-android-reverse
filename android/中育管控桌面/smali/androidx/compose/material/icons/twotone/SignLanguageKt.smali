.class public final Landroidx/compose/material/icons/twotone/SignLanguageKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_signLanguage",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SignLanguage",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getSignLanguage",
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
        "SMAP\nSignLanguage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignLanguage.kt\nandroidx/compose/material/icons/twotone/SignLanguageKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,137:1\n212#2,12:138\n233#2,18:151\n253#2:188\n233#2,18:189\n253#2:226\n174#3:150\n705#4,2:169\n717#4,2:171\n719#4,11:177\n705#4,2:207\n717#4,2:209\n719#4,11:215\n72#5,4:173\n72#5,4:211\n*S KotlinDebug\n*F\n+ 1 SignLanguage.kt\nandroidx/compose/material/icons/twotone/SignLanguageKt\n*L\n29#1:138,12\n30#1:151,18\n30#1:188\n51#1:189,18\n51#1:226\n29#1:150\n30#1:169,2\n30#1:171,2\n30#1:177,11\n51#1:207,2\n51#1:209,2\n51#1:215,11\n30#1:173,4\n51#1:211,4\n*E\n"
    }
.end annotation


# static fields
.field private static _signLanguage:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSignLanguage(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/SignLanguageKt;->_signLanguage:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.SignLanguage"

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
    const v4, 0x41533333    # 13.2f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x41600000    # 14.0f

    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v4, 0x41700000    # 15.0f

    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v4, -0x40000000    # -2.0f

    .line 84
    .line 85
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/high16 v4, 0x40e00000    # 7.0f

    .line 89
    .line 90
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v4, 0x40800000    # 4.0f

    .line 94
    .line 95
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v25, 0x3f800000    # 1.0f

    .line 99
    .line 100
    const/high16 v26, -0x40800000    # -1.0f

    .line 101
    .line 102
    const v21, 0x3f0ccccd    # 0.55f

    .line 103
    .line 104
    .line 105
    const/16 v22, 0x0

    .line 106
    .line 107
    const/high16 v23, 0x3f800000    # 1.0f

    .line 108
    .line 109
    const v24, -0x4119999a    # -0.45f

    .line 110
    .line 111
    .line 112
    move-object/from16 v20, v2

    .line 113
    .line 114
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v4, -0x3f6f0a3d    # -4.53f

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v25, -0x416147ae    # -0.31f

    .line 124
    .line 125
    .line 126
    const v26, -0x40c51eb8    # -0.73f

    .line 127
    .line 128
    .line 129
    const/16 v21, 0x0

    .line 130
    .line 131
    const v22, -0x4175c28f    # -0.27f

    .line 132
    .line 133
    .line 134
    const v23, -0x421eb852    # -0.11f

    .line 135
    .line 136
    .line 137
    const v24, -0x40f5c28f    # -0.54f

    .line 138
    .line 139
    .line 140
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v4, 0x41533333    # 13.2f

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v4, 0x4176147b    # 15.38f

    .line 153
    .line 154
    .line 155
    const/high16 v6, 0x41100000    # 9.0f

    .line 156
    .line 157
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v4, -0x4010a3d7    # -1.87f

    .line 161
    .line 162
    .line 163
    const v6, 0x3ff70a3d    # 1.93f

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v4, 0x3fb9999a    # 1.45f

    .line 170
    .line 171
    .line 172
    const v6, 0x3fb0a3d7    # 1.38f

    .line 173
    .line 174
    .line 175
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v4, 0x40eae148    # 7.34f

    .line 179
    .line 180
    .line 181
    const/high16 v6, 0x41a00000    # 20.0f

    .line 182
    .line 183
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v4, 0x406ccccd    # 3.7f

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v26, 0x3f3ae148    # 0.73f

    .line 193
    .line 194
    .line 195
    const v22, 0x3e8f5c29    # 0.28f

    .line 196
    .line 197
    .line 198
    const v24, 0x3f0a3d71    # 0.54f

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v4, 0x3f28f5c3    # 0.66f

    .line 205
    .line 206
    .line 207
    const v6, -0x40cccccd    # -0.7f

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v4, 0x4176147b    # 15.38f

    .line 214
    .line 215
    .line 216
    const/high16 v6, 0x41100000    # 9.0f

    .line 217
    .line 218
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    const/16 v16, 0x3800

    .line 229
    .line 230
    const/16 v17, 0x0

    .line 231
    .line 232
    const v6, 0x3e99999a    # 0.3f

    .line 233
    .line 234
    .line 235
    const v8, 0x3e99999a    # 0.3f

    .line 236
    .line 237
    .line 238
    const/4 v7, 0x0

    .line 239
    const/high16 v9, 0x3f800000    # 1.0f

    .line 240
    .line 241
    const/high16 v12, 0x3f800000    # 1.0f

    .line 242
    .line 243
    const/4 v13, 0x0

    .line 244
    const/4 v14, 0x0

    .line 245
    const/4 v15, 0x0

    .line 246
    const-string v4, ""

    .line 247
    .line 248
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 249
    .line 250
    .line 251
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 252
    .line 253
    .line 254
    move-result v3

    .line 255
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 256
    .line 257
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 258
    .line 259
    .line 260
    move-result-wide v6

    .line 261
    const/4 v0, 0x0

    .line 262
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 266
    .line 267
    .line 268
    move-result v10

    .line 269
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 270
    .line 271
    .line 272
    move-result v11

    .line 273
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 276
    .line 277
    .line 278
    const/high16 v0, 0x41500000    # 13.0f

    .line 279
    .line 280
    const v2, 0x4147d70a    # 12.49f

    .line 281
    .line 282
    .line 283
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v0, -0x4091eb85    # -0.93f

    .line 287
    .line 288
    .line 289
    const v2, -0x4011eb85    # -1.86f

    .line 290
    .line 291
    .line 292
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v17, 0x3f2b851f    # 0.67f

    .line 296
    .line 297
    .line 298
    const v18, -0x3fff5c29    # -2.01f

    .line 299
    .line 300
    .line 301
    const v13, -0x41428f5c    # -0.37f

    .line 302
    .line 303
    .line 304
    const v14, -0x40c28f5c    # -0.74f

    .line 305
    .line 306
    .line 307
    const v15, -0x4270a3d7    # -0.07f

    .line 308
    .line 309
    .line 310
    const v16, -0x402e147b    # -1.64f

    .line 311
    .line 312
    .line 313
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const v0, 0x4147d70a    # 12.49f

    .line 317
    .line 318
    .line 319
    const/high16 v2, 0x41100000    # 9.0f

    .line 320
    .line 321
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v0, 0x40b75c29    # 5.73f

    .line 325
    .line 326
    .line 327
    const v2, 0x40aeb852    # 5.46f

    .line 328
    .line 329
    .line 330
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v17, 0x3f47ae14    # 0.78f

    .line 334
    .line 335
    .line 336
    const v18, 0x3fe7ae14    # 1.81f

    .line 337
    .line 338
    .line 339
    const/high16 v13, 0x3f000000    # 0.5f

    .line 340
    .line 341
    const v14, 0x3ef0a3d7    # 0.47f

    .line 342
    .line 343
    .line 344
    const v15, 0x3f47ae14    # 0.78f

    .line 345
    .line 346
    .line 347
    const v16, 0x3f90a3d7    # 1.13f

    .line 348
    .line 349
    .line 350
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v0, 0x40a75c29    # 5.23f

    .line 354
    .line 355
    .line 356
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 360
    .line 361
    const/high16 v18, 0x40200000    # 2.5f

    .line 362
    .line 363
    const/4 v13, 0x0

    .line 364
    const v14, 0x3fb0a3d7    # 1.38f

    .line 365
    .line 366
    .line 367
    const v15, -0x4070a3d7    # -1.12f

    .line 368
    .line 369
    .line 370
    const/high16 v16, 0x40200000    # 2.5f

    .line 371
    .line 372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v0, -0x3ed00000    # -11.0f

    .line 376
    .line 377
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v17, -0x40800000    # -1.0f

    .line 381
    .line 382
    const/high16 v18, -0x40800000    # -1.0f

    .line 383
    .line 384
    const v13, -0x40f33333    # -0.55f

    .line 385
    .line 386
    .line 387
    const/4 v14, 0x0

    .line 388
    const/high16 v15, -0x40800000    # -1.0f

    .line 389
    .line 390
    const v16, -0x4119999a    # -0.45f

    .line 391
    .line 392
    .line 393
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v17, 0x3f800000    # 1.0f

    .line 397
    .line 398
    const/4 v13, 0x0

    .line 399
    const v14, -0x40f33333    # -0.55f

    .line 400
    .line 401
    .line 402
    const v15, 0x3ee66666    # 0.45f

    .line 403
    .line 404
    .line 405
    const/high16 v16, -0x40800000    # -1.0f

    .line 406
    .line 407
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v0, 0x41200000    # 10.0f

    .line 411
    .line 412
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v0, -0x40800000    # -1.0f

    .line 416
    .line 417
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v0, 0x40800000    # 4.0f

    .line 421
    .line 422
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const/high16 v17, -0x40800000    # -1.0f

    .line 426
    .line 427
    const v13, -0x40f33333    # -0.55f

    .line 428
    .line 429
    .line 430
    const/4 v14, 0x0

    .line 431
    const/high16 v15, -0x40800000    # -1.0f

    .line 432
    .line 433
    const v16, -0x4119999a    # -0.45f

    .line 434
    .line 435
    .line 436
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const/high16 v17, 0x3f800000    # 1.0f

    .line 440
    .line 441
    const/4 v13, 0x0

    .line 442
    const v14, -0x40f33333    # -0.55f

    .line 443
    .line 444
    .line 445
    const v15, 0x3ee66666    # 0.45f

    .line 446
    .line 447
    .line 448
    const/high16 v16, -0x40800000    # -1.0f

    .line 449
    .line 450
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v0, 0x40c00000    # 6.0f

    .line 454
    .line 455
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const/high16 v0, -0x40800000    # -1.0f

    .line 459
    .line 460
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const/high16 v0, 0x40400000    # 3.0f

    .line 464
    .line 465
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const/high16 v17, -0x40800000    # -1.0f

    .line 469
    .line 470
    const v13, -0x40f33333    # -0.55f

    .line 471
    .line 472
    .line 473
    const/4 v14, 0x0

    .line 474
    const/high16 v15, -0x40800000    # -1.0f

    .line 475
    .line 476
    const v16, -0x4119999a    # -0.45f

    .line 477
    .line 478
    .line 479
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const/high16 v17, 0x3f800000    # 1.0f

    .line 483
    .line 484
    const/4 v13, 0x0

    .line 485
    const v14, -0x40f33333    # -0.55f

    .line 486
    .line 487
    .line 488
    const v15, 0x3ee66666    # 0.45f

    .line 489
    .line 490
    .line 491
    const/high16 v16, -0x40800000    # -1.0f

    .line 492
    .line 493
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const/high16 v0, 0x40e00000    # 7.0f

    .line 497
    .line 498
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const/high16 v0, -0x40800000    # -1.0f

    .line 502
    .line 503
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const/high16 v0, 0x40900000    # 4.5f

    .line 507
    .line 508
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const/high16 v17, -0x40800000    # -1.0f

    .line 512
    .line 513
    const v13, -0x40f33333    # -0.55f

    .line 514
    .line 515
    .line 516
    const/4 v14, 0x0

    .line 517
    const/high16 v15, -0x40800000    # -1.0f

    .line 518
    .line 519
    const v16, -0x4119999a    # -0.45f

    .line 520
    .line 521
    .line 522
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const/high16 v17, 0x3f800000    # 1.0f

    .line 526
    .line 527
    const/4 v13, 0x0

    .line 528
    const v14, -0x40f33333    # -0.55f

    .line 529
    .line 530
    .line 531
    const v15, 0x3ee66666    # 0.45f

    .line 532
    .line 533
    .line 534
    const/high16 v16, -0x40800000    # -1.0f

    .line 535
    .line 536
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const v0, 0x4147d70a    # 12.49f

    .line 540
    .line 541
    .line 542
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const v0, 0x41533333    # 13.2f

    .line 549
    .line 550
    .line 551
    const/high16 v2, 0x41600000    # 14.0f

    .line 552
    .line 553
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const/high16 v0, 0x41700000    # 15.0f

    .line 557
    .line 558
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const/high16 v0, -0x40000000    # -2.0f

    .line 562
    .line 563
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const/high16 v0, 0x40e00000    # 7.0f

    .line 567
    .line 568
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const/high16 v0, 0x40800000    # 4.0f

    .line 572
    .line 573
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const v13, 0x3f0ccccd    # 0.55f

    .line 577
    .line 578
    .line 579
    const/4 v14, 0x0

    .line 580
    const/high16 v15, 0x3f800000    # 1.0f

    .line 581
    .line 582
    const v16, -0x4119999a    # -0.45f

    .line 583
    .line 584
    .line 585
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const v0, -0x3f6f0a3d    # -4.53f

    .line 589
    .line 590
    .line 591
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const v17, -0x416147ae    # -0.31f

    .line 595
    .line 596
    .line 597
    const v18, -0x40c51eb8    # -0.73f

    .line 598
    .line 599
    .line 600
    const/4 v13, 0x0

    .line 601
    const v14, -0x4175c28f    # -0.27f

    .line 602
    .line 603
    .line 604
    const v15, -0x421eb852    # -0.11f

    .line 605
    .line 606
    .line 607
    const v16, -0x40f5c28f    # -0.54f

    .line 608
    .line 609
    .line 610
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const v0, 0x41533333    # 13.2f

    .line 614
    .line 615
    .line 616
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const v0, 0x413c7ae1    # 11.78f

    .line 623
    .line 624
    .line 625
    const v2, 0x40e3d70a    # 7.12f

    .line 626
    .line 627
    .line 628
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    const v17, -0x402f5c29    # -1.63f

    .line 632
    .line 633
    .line 634
    const v18, 0x3f9851ec    # 1.19f

    .line 635
    .line 636
    .line 637
    const v13, -0x40a8f5c3    # -0.84f

    .line 638
    .line 639
    .line 640
    const v14, 0x3ecccccd    # 0.4f

    .line 641
    .line 642
    .line 643
    const v15, -0x406a3d71    # -1.17f

    .line 644
    .line 645
    .line 646
    const v16, 0x3f1eb852    # 0.62f

    .line 647
    .line 648
    .line 649
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    const v0, -0x3fd33333    # -2.7f

    .line 653
    .line 654
    .line 655
    const v2, -0x3fc9999a    # -2.85f

    .line 656
    .line 657
    .line 658
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    const v17, 0x3d23d70a    # 0.04f

    .line 662
    .line 663
    .line 664
    const v18, -0x404b851f    # -1.41f

    .line 665
    .line 666
    .line 667
    const v13, -0x413d70a4    # -0.38f

    .line 668
    .line 669
    .line 670
    const v14, -0x41333333    # -0.4f

    .line 671
    .line 672
    .line 673
    const v15, -0x4147ae14    # -0.36f

    .line 674
    .line 675
    .line 676
    const v16, -0x407c28f6    # -1.03f

    .line 677
    .line 678
    .line 679
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    const v17, 0x3fb47ae1    # 1.41f

    .line 683
    .line 684
    .line 685
    const v18, 0x3d23d70a    # 0.04f

    .line 686
    .line 687
    .line 688
    const v13, 0x3ecccccd    # 0.4f

    .line 689
    .line 690
    .line 691
    const v14, -0x413d70a4    # -0.38f

    .line 692
    .line 693
    .line 694
    const v15, 0x3f83d70a    # 1.03f

    .line 695
    .line 696
    .line 697
    const v16, -0x4147ae14    # -0.36f

    .line 698
    .line 699
    .line 700
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    const v0, 0x413c7ae1    # 11.78f

    .line 704
    .line 705
    .line 706
    const v2, 0x40e3d70a    # 7.12f

    .line 707
    .line 708
    .line 709
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 713
    .line 714
    .line 715
    const v0, 0x411a3d71    # 9.64f

    .line 716
    .line 717
    .line 718
    const v2, 0x41135c29    # 9.21f

    .line 719
    .line 720
    .line 721
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 722
    .line 723
    .line 724
    const v17, 0x41170a3d    # 9.44f

    .line 725
    .line 726
    .line 727
    const/high16 v18, 0x41300000    # 11.0f

    .line 728
    .line 729
    const v13, 0x41168f5c    # 9.41f

    .line 730
    .line 731
    .line 732
    const v14, 0x411c28f6    # 9.76f

    .line 733
    .line 734
    .line 735
    const v15, 0x4115999a    # 9.35f

    .line 736
    .line 737
    .line 738
    const v16, 0x41273333    # 10.45f

    .line 739
    .line 740
    .line 741
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 742
    .line 743
    .line 744
    const v0, 0x410947ae    # 8.58f

    .line 745
    .line 746
    .line 747
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 748
    .line 749
    .line 750
    const v0, 0x40c9eb85    # 6.31f

    .line 751
    .line 752
    .line 753
    const v2, 0x4109c28f    # 8.61f

    .line 754
    .line 755
    .line 756
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 757
    .line 758
    .line 759
    const v17, 0x40cb3333    # 6.35f

    .line 760
    .line 761
    .line 762
    const v18, 0x40e66666    # 7.2f

    .line 763
    .line 764
    .line 765
    const v13, 0x40bdc28f    # 5.93f

    .line 766
    .line 767
    .line 768
    const v14, 0x41035c29    # 8.21f

    .line 769
    .line 770
    .line 771
    const v15, 0x40be147b    # 5.94f

    .line 772
    .line 773
    .line 774
    const v16, 0x40f28f5c    # 7.58f

    .line 775
    .line 776
    .line 777
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 778
    .line 779
    .line 780
    const v17, 0x3fb47ae1    # 1.41f

    .line 781
    .line 782
    .line 783
    const v18, 0x3d23d70a    # 0.04f

    .line 784
    .line 785
    .line 786
    const v13, 0x3ecccccd    # 0.4f

    .line 787
    .line 788
    .line 789
    const v14, -0x413d70a4    # -0.38f

    .line 790
    .line 791
    .line 792
    const v15, 0x3f83d70a    # 1.03f

    .line 793
    .line 794
    .line 795
    const v16, -0x4147ae14    # -0.36f

    .line 796
    .line 797
    .line 798
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 799
    .line 800
    .line 801
    const v0, 0x411a3d71    # 9.64f

    .line 802
    .line 803
    .line 804
    const v2, 0x41135c29    # 9.21f

    .line 805
    .line 806
    .line 807
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 808
    .line 809
    .line 810
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 811
    .line 812
    .line 813
    const v0, 0x41a2a3d7    # 20.33f

    .line 814
    .line 815
    .line 816
    const v2, 0x415e8f5c    # 13.91f

    .line 817
    .line 818
    .line 819
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 820
    .line 821
    .line 822
    const v0, 0x3f6147ae    # 0.88f

    .line 823
    .line 824
    .line 825
    const v2, -0x40ab851f    # -0.83f

    .line 826
    .line 827
    .line 828
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 829
    .line 830
    .line 831
    const v17, 0x3f4a3d71    # 0.79f

    .line 832
    .line 833
    .line 834
    const v18, -0x40170a3d    # -1.82f

    .line 835
    .line 836
    .line 837
    const/high16 v13, 0x3f000000    # 0.5f

    .line 838
    .line 839
    const v14, -0x410f5c29    # -0.47f

    .line 840
    .line 841
    .line 842
    const v15, 0x3f4a3d71    # 0.79f

    .line 843
    .line 844
    .line 845
    const v16, -0x406f5c29    # -1.13f

    .line 846
    .line 847
    .line 848
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 849
    .line 850
    .line 851
    const v0, 0x40566666    # 3.35f

    .line 852
    .line 853
    .line 854
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 855
    .line 856
    .line 857
    const v0, -0x4175c28f    # -0.27f

    .line 858
    .line 859
    .line 860
    const v2, -0x42333333    # -0.1f

    .line 861
    .line 862
    .line 863
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 864
    .line 865
    .line 866
    const v17, -0x400a3d71    # -1.92f

    .line 867
    .line 868
    .line 869
    const v18, 0x3f666666    # 0.9f

    .line 870
    .line 871
    .line 872
    const v13, -0x40b851ec    # -0.78f

    .line 873
    .line 874
    .line 875
    const v14, -0x4170a3d7    # -0.28f

    .line 876
    .line 877
    .line 878
    const v15, -0x402e147b    # -1.64f

    .line 879
    .line 880
    .line 881
    const v16, 0x3df5c28f    # 0.12f

    .line 882
    .line 883
    .line 884
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 885
    .line 886
    .line 887
    const v0, 0x4198cccd    # 19.1f

    .line 888
    .line 889
    .line 890
    const v2, 0x40c3851f    # 6.11f

    .line 891
    .line 892
    .line 893
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 894
    .line 895
    .line 896
    const/high16 v0, -0x3f500000    # -5.5f

    .line 897
    .line 898
    const v2, -0x3f466666    # -5.8f

    .line 899
    .line 900
    .line 901
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 902
    .line 903
    .line 904
    const v17, -0x404b851f    # -1.41f

    .line 905
    .line 906
    .line 907
    const v18, -0x42dc28f6    # -0.04f

    .line 908
    .line 909
    .line 910
    const v13, -0x413d70a4    # -0.38f

    .line 911
    .line 912
    .line 913
    const v14, -0x41333333    # -0.4f

    .line 914
    .line 915
    .line 916
    const v15, -0x407eb852    # -1.01f

    .line 917
    .line 918
    .line 919
    const v16, -0x4128f5c3    # -0.42f

    .line 920
    .line 921
    .line 922
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 923
    .line 924
    .line 925
    const v17, -0x42dc28f6    # -0.04f

    .line 926
    .line 927
    .line 928
    const v18, 0x3fb47ae1    # 1.41f

    .line 929
    .line 930
    .line 931
    const v13, -0x41333333    # -0.4f

    .line 932
    .line 933
    .line 934
    const v14, 0x3ec28f5c    # 0.38f

    .line 935
    .line 936
    .line 937
    const v15, -0x4128f5c3    # -0.42f

    .line 938
    .line 939
    .line 940
    const v16, 0x3f8147ae    # 1.01f

    .line 941
    .line 942
    .line 943
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 944
    .line 945
    .line 946
    const v0, 0x40728f5c    # 3.79f

    .line 947
    .line 948
    .line 949
    const v2, 0x407f5c29    # 3.99f

    .line 950
    .line 951
    .line 952
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 953
    .line 954
    .line 955
    const v0, -0x40c51eb8    # -0.73f

    .line 956
    .line 957
    .line 958
    const v2, 0x3f30a3d7    # 0.69f

    .line 959
    .line 960
    .line 961
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 962
    .line 963
    .line 964
    const v0, -0x3f65c28f    # -4.82f

    .line 965
    .line 966
    .line 967
    const v2, -0x3f5d70a4    # -5.08f

    .line 968
    .line 969
    .line 970
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 971
    .line 972
    .line 973
    const v17, -0x404b851f    # -1.41f

    .line 974
    .line 975
    .line 976
    const v18, -0x42dc28f6    # -0.04f

    .line 977
    .line 978
    .line 979
    const v13, -0x413d70a4    # -0.38f

    .line 980
    .line 981
    .line 982
    const v14, -0x41333333    # -0.4f

    .line 983
    .line 984
    .line 985
    const v15, -0x407eb852    # -1.01f

    .line 986
    .line 987
    .line 988
    const v16, -0x4128f5c3    # -0.42f

    .line 989
    .line 990
    .line 991
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 992
    .line 993
    .line 994
    const v17, -0x42dc28f6    # -0.04f

    .line 995
    .line 996
    .line 997
    const v18, 0x3fb47ae1    # 1.41f

    .line 998
    .line 999
    .line 1000
    const v13, -0x41333333    # -0.4f

    .line 1001
    .line 1002
    .line 1003
    const v14, 0x3ec28f5c    # 0.38f

    .line 1004
    .line 1005
    .line 1006
    const v15, -0x4128f5c3    # -0.42f

    .line 1007
    .line 1008
    .line 1009
    const v16, 0x3f8147ae    # 1.01f

    .line 1010
    .line 1011
    .line 1012
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1013
    .line 1014
    .line 1015
    const v0, 0x4071eb85    # 3.78f

    .line 1016
    .line 1017
    .line 1018
    const v2, 0x407eb852    # 3.98f

    .line 1019
    .line 1020
    .line 1021
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1022
    .line 1023
    .line 1024
    const v0, 0x4176147b    # 15.38f

    .line 1025
    .line 1026
    .line 1027
    const/high16 v2, 0x41100000    # 9.0f

    .line 1028
    .line 1029
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1030
    .line 1031
    .line 1032
    const v0, -0x4010a3d7    # -1.87f

    .line 1033
    .line 1034
    .line 1035
    const v2, 0x3ff70a3d    # 1.93f

    .line 1036
    .line 1037
    .line 1038
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1039
    .line 1040
    .line 1041
    const v0, 0x3fb9999a    # 1.45f

    .line 1042
    .line 1043
    .line 1044
    const v2, 0x3fb0a3d7    # 1.38f

    .line 1045
    .line 1046
    .line 1047
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1048
    .line 1049
    .line 1050
    const v0, 0x40eae148    # 7.34f

    .line 1051
    .line 1052
    .line 1053
    const/high16 v2, 0x41a00000    # 20.0f

    .line 1054
    .line 1055
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1056
    .line 1057
    .line 1058
    const v0, 0x406ccccd    # 3.7f

    .line 1059
    .line 1060
    .line 1061
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1062
    .line 1063
    .line 1064
    const v17, -0x416147ae    # -0.31f

    .line 1065
    .line 1066
    .line 1067
    const v18, 0x3f3ae148    # 0.73f

    .line 1068
    .line 1069
    .line 1070
    const/4 v13, 0x0

    .line 1071
    const v14, 0x3e8f5c29    # 0.28f

    .line 1072
    .line 1073
    .line 1074
    const v15, -0x421eb852    # -0.11f

    .line 1075
    .line 1076
    .line 1077
    const v16, 0x3f0a3d71    # 0.54f

    .line 1078
    .line 1079
    .line 1080
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1081
    .line 1082
    .line 1083
    const v0, 0x3f28f5c3    # 0.66f

    .line 1084
    .line 1085
    .line 1086
    const v2, -0x40cccccd    # -0.7f

    .line 1087
    .line 1088
    .line 1089
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1090
    .line 1091
    .line 1092
    const v0, 0x3f1c28f6    # 0.61f

    .line 1093
    .line 1094
    .line 1095
    const v2, 0x3f147ae1    # 0.58f

    .line 1096
    .line 1097
    .line 1098
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1099
    .line 1100
    .line 1101
    const v17, 0x41a2a3d7    # 20.33f

    .line 1102
    .line 1103
    .line 1104
    const v18, 0x415e8f5c    # 13.91f

    .line 1105
    .line 1106
    .line 1107
    const v13, 0x419f1eb8    # 19.89f

    .line 1108
    .line 1109
    .line 1110
    const v14, 0x41547ae1    # 13.28f

    .line 1111
    .line 1112
    .line 1113
    const v15, 0x41a10a3d    # 20.13f

    .line 1114
    .line 1115
    .line 1116
    const v16, 0x415947ae    # 13.58f

    .line 1117
    .line 1118
    .line 1119
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1120
    .line 1121
    .line 1122
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1123
    .line 1124
    .line 1125
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v2

    .line 1129
    const/16 v16, 0x3800

    .line 1130
    .line 1131
    const/16 v17, 0x0

    .line 1132
    .line 1133
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1134
    .line 1135
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1136
    .line 1137
    const/4 v7, 0x0

    .line 1138
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1139
    .line 1140
    const/4 v13, 0x0

    .line 1141
    const/4 v14, 0x0

    .line 1142
    const/4 v15, 0x0

    .line 1143
    const-string v4, ""

    .line 1144
    .line 1145
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v0

    .line 1149
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v0

    .line 1153
    sput-object v0, Landroidx/compose/material/icons/twotone/SignLanguageKt;->_signLanguage:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1154
    .line 1155
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1156
    .line 1157
    .line 1158
    return-object v0
.end method
