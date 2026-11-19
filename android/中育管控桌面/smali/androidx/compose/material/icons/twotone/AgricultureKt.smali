.class public final Landroidx/compose/material/icons/twotone/AgricultureKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_agriculture",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Agriculture",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getAgriculture",
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
        "SMAP\nAgriculture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Agriculture.kt\nandroidx/compose/material/icons/twotone/AgricultureKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,137:1\n212#2,12:138\n233#2,18:151\n253#2:188\n233#2,18:189\n253#2:226\n233#2,18:227\n253#2:264\n174#3:150\n705#4,2:169\n717#4,2:171\n719#4,11:177\n705#4,2:207\n717#4,2:209\n719#4,11:215\n705#4,2:245\n717#4,2:247\n719#4,11:253\n72#5,4:173\n72#5,4:211\n72#5,4:249\n*S KotlinDebug\n*F\n+ 1 Agriculture.kt\nandroidx/compose/material/icons/twotone/AgricultureKt\n*L\n29#1:138,12\n30#1:151,18\n30#1:188\n39#1:189,18\n39#1:226\n119#1:227,18\n119#1:264\n29#1:150\n30#1:169,2\n30#1:171,2\n30#1:177,11\n39#1:207,2\n39#1:209,2\n39#1:215,11\n119#1:245,2\n119#1:247,2\n119#1:253,11\n30#1:173,4\n39#1:211,4\n119#1:249,4\n*E\n"
    }
.end annotation


# static fields
.field private static _agriculture:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAgriculture(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/AgricultureKt;->_agriculture:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Agriculture"

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
    const/high16 v4, 0x41100000    # 9.0f

    .line 71
    .line 72
    const/high16 v6, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40a00000    # 5.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v25, -0x40000000    # -2.0f

    .line 83
    .line 84
    const/high16 v26, -0x40000000    # -2.0f

    .line 85
    .line 86
    const/16 v21, 0x0

    .line 87
    .line 88
    const v22, -0x40733333    # -1.1f

    .line 89
    .line 90
    .line 91
    const v23, -0x4099999a    # -0.9f

    .line 92
    .line 93
    .line 94
    const/high16 v24, -0x40000000    # -2.0f

    .line 95
    .line 96
    move-object/from16 v20, v2

    .line 97
    .line 98
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v4, 0x40800000    # 4.0f

    .line 102
    .line 103
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v25, 0x40400000    # 3.0f

    .line 107
    .line 108
    const/high16 v26, 0x41000000    # 8.0f

    .line 109
    .line 110
    const v21, 0x405ccccd    # 3.45f

    .line 111
    .line 112
    .line 113
    const/high16 v22, 0x40e00000    # 7.0f

    .line 114
    .line 115
    const/high16 v23, 0x40400000    # 3.0f

    .line 116
    .line 117
    const v24, 0x40ee6666    # 7.45f

    .line 118
    .line 119
    .line 120
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v25, 0x40800000    # 4.0f

    .line 124
    .line 125
    const/high16 v26, 0x41100000    # 9.0f

    .line 126
    .line 127
    const/high16 v21, 0x40400000    # 3.0f

    .line 128
    .line 129
    const v22, 0x4108cccd    # 8.55f

    .line 130
    .line 131
    .line 132
    const v23, 0x405ccccd    # 3.45f

    .line 133
    .line 134
    .line 135
    const/high16 v24, 0x41100000    # 9.0f

    .line 136
    .line 137
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    const/16 v16, 0x3800

    .line 148
    .line 149
    const/16 v17, 0x0

    .line 150
    .line 151
    const/high16 v6, 0x3f800000    # 1.0f

    .line 152
    .line 153
    const/high16 v8, 0x3f800000    # 1.0f

    .line 154
    .line 155
    const/4 v7, 0x0

    .line 156
    const/high16 v9, 0x3f800000    # 1.0f

    .line 157
    .line 158
    const/high16 v12, 0x3f800000    # 1.0f

    .line 159
    .line 160
    const/4 v13, 0x0

    .line 161
    const/4 v14, 0x0

    .line 162
    const/4 v15, 0x0

    .line 163
    const-string v4, ""

    .line 164
    .line 165
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 166
    .line 167
    .line 168
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 173
    .line 174
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 175
    .line 176
    .line 177
    move-result-wide v6

    .line 178
    const/4 v2, 0x0

    .line 179
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 183
    .line 184
    .line 185
    move-result v10

    .line 186
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 187
    .line 188
    .line 189
    move-result v11

    .line 190
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 193
    .line 194
    .line 195
    const/high16 v4, 0x41b00000    # 22.0f

    .line 196
    .line 197
    const v6, 0x4160f5c3    # 14.06f

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const/high16 v4, 0x41000000    # 8.0f

    .line 204
    .line 205
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v25, -0x40000000    # -2.0f

    .line 209
    .line 210
    const/high16 v26, -0x40000000    # -2.0f

    .line 211
    .line 212
    const/16 v21, 0x0

    .line 213
    .line 214
    const v22, -0x40733333    # -1.1f

    .line 215
    .line 216
    .line 217
    const v23, -0x4099999a    # -0.9f

    .line 218
    .line 219
    .line 220
    const/high16 v24, -0x40000000    # -2.0f

    .line 221
    .line 222
    move-object/from16 v20, v2

    .line 223
    .line 224
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v4, -0x3f36b852    # -6.29f

    .line 228
    .line 229
    .line 230
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v4, -0x407851ec    # -1.06f

    .line 234
    .line 235
    .line 236
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v4, -0x404b851f    # -1.41f

    .line 240
    .line 241
    .line 242
    const v6, 0x3fb47ae1    # 1.41f

    .line 243
    .line 244
    .line 245
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v4, -0x40ca3d71    # -0.71f

    .line 249
    .line 250
    .line 251
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v4, 0x411d1eb8    # 9.82f

    .line 255
    .line 256
    .line 257
    const v6, 0x40cb3333    # 6.35f

    .line 258
    .line 259
    .line 260
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v4, 0x3f35c28f    # 0.71f

    .line 264
    .line 265
    .line 266
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v4, -0x404b851f    # -1.41f

    .line 270
    .line 271
    .line 272
    const v6, 0x3fb47ae1    # 1.41f

    .line 273
    .line 274
    .line 275
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v4, 0x40d6b852    # 6.71f

    .line 279
    .line 280
    .line 281
    const/high16 v6, 0x41500000    # 13.0f

    .line 282
    .line 283
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const/high16 v4, 0x41100000    # 9.0f

    .line 287
    .line 288
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const/high16 v26, 0x40000000    # 2.0f

    .line 292
    .line 293
    const v22, 0x3f8ccccd    # 1.1f

    .line 294
    .line 295
    .line 296
    const/high16 v24, 0x40000000    # 2.0f

    .line 297
    .line 298
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const v4, 0x410f5c29    # 8.96f

    .line 302
    .line 303
    .line 304
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v25, -0x40cf5c29    # -0.69f

    .line 308
    .line 309
    .line 310
    const v26, -0x4123d70a    # -0.43f

    .line 311
    .line 312
    .line 313
    const v21, -0x419eb852    # -0.22f

    .line 314
    .line 315
    .line 316
    const v22, -0x41dc28f6    # -0.16f

    .line 317
    .line 318
    .line 319
    const v23, -0x4119999a    # -0.45f

    .line 320
    .line 321
    .line 322
    const v24, -0x41666666    # -0.3f

    .line 323
    .line 324
    .line 325
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const v4, 0x3f63d70a    # 0.89f

    .line 329
    .line 330
    .line 331
    const v6, -0x41333333    # -0.4f

    .line 332
    .line 333
    .line 334
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v4, -0x41a8f5c3    # -0.21f

    .line 338
    .line 339
    .line 340
    const v6, -0x41147ae1    # -0.46f

    .line 341
    .line 342
    .line 343
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v4, -0x4099999a    # -0.9f

    .line 347
    .line 348
    .line 349
    const v6, 0x3ecccccd    # 0.4f

    .line 350
    .line 351
    .line 352
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/high16 v25, 0x40c00000    # 6.0f

    .line 356
    .line 357
    const/high16 v26, 0x41200000    # 10.0f

    .line 358
    .line 359
    const v21, 0x40e851ec    # 7.26f

    .line 360
    .line 361
    .line 362
    const v22, 0x4122147b    # 10.13f

    .line 363
    .line 364
    .line 365
    const v23, 0x40d47ae1    # 6.64f

    .line 366
    .line 367
    .line 368
    const/high16 v24, 0x41200000    # 10.0f

    .line 369
    .line 370
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v25, -0x403d70a4    # -1.52f

    .line 374
    .line 375
    .line 376
    const v26, 0x3e851eb8    # 0.26f

    .line 377
    .line 378
    .line 379
    const v21, -0x40f851ec    # -0.53f

    .line 380
    .line 381
    .line 382
    const/16 v22, 0x0

    .line 383
    .line 384
    const v23, -0x407ae148    # -1.04f

    .line 385
    .line 386
    .line 387
    const v24, 0x3de147ae    # 0.11f

    .line 388
    .line 389
    .line 390
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v4, 0x3f68f5c3    # 0.91f

    .line 394
    .line 395
    .line 396
    const v6, 0x3eae147b    # 0.34f

    .line 397
    .line 398
    .line 399
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v4, -0x410f5c29    # -0.47f

    .line 403
    .line 404
    .line 405
    const v6, 0x3e3851ec    # 0.18f

    .line 406
    .line 407
    .line 408
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v4, 0x4126b852    # 10.42f

    .line 412
    .line 413
    .line 414
    const/high16 v6, 0x40800000    # 4.0f

    .line 415
    .line 416
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v25, -0x3fe47ae1    # -2.43f

    .line 420
    .line 421
    .line 422
    const v26, 0x4013d70a    # 2.31f

    .line 423
    .line 424
    .line 425
    const v21, -0x407851ec    # -1.06f

    .line 426
    .line 427
    .line 428
    const v22, 0x3eeb851f    # 0.46f

    .line 429
    .line 430
    .line 431
    const v23, -0x400b851f    # -1.91f

    .line 432
    .line 433
    .line 434
    const v24, 0x3fa3d70a    # 1.28f

    .line 435
    .line 436
    .line 437
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v4, 0x3f63d70a    # 0.89f

    .line 441
    .line 442
    .line 443
    const v6, 0x3ecccccd    # 0.4f

    .line 444
    .line 445
    .line 446
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v4, 0x3eeb851f    # 0.46f

    .line 450
    .line 451
    .line 452
    const v6, -0x41a8f5c3    # -0.21f

    .line 453
    .line 454
    .line 455
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const v4, -0x4099999a    # -0.9f

    .line 459
    .line 460
    .line 461
    const v6, -0x41333333    # -0.4f

    .line 462
    .line 463
    .line 464
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const/high16 v25, 0x3f800000    # 1.0f

    .line 468
    .line 469
    const/high16 v26, 0x41700000    # 15.0f

    .line 470
    .line 471
    const v21, 0x3f90a3d7    # 1.13f

    .line 472
    .line 473
    .line 474
    const v22, 0x415bd70a    # 13.74f

    .line 475
    .line 476
    .line 477
    const/high16 v23, 0x3f800000    # 1.0f

    .line 478
    .line 479
    const v24, 0x4165c28f    # 14.36f

    .line 480
    .line 481
    .line 482
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v25, 0x3e851eb8    # 0.26f

    .line 486
    .line 487
    .line 488
    const v26, 0x3fc28f5c    # 1.52f

    .line 489
    .line 490
    .line 491
    const/16 v21, 0x0

    .line 492
    .line 493
    const v22, 0x3f07ae14    # 0.53f

    .line 494
    .line 495
    .line 496
    const v23, 0x3de147ae    # 0.11f

    .line 497
    .line 498
    .line 499
    const v24, 0x3f851eb8    # 1.04f

    .line 500
    .line 501
    .line 502
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const v4, 0x3f68f5c3    # 0.91f

    .line 506
    .line 507
    .line 508
    const v6, -0x4151eb85    # -0.34f

    .line 509
    .line 510
    .line 511
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const v4, 0x3e3851ec    # 0.18f

    .line 515
    .line 516
    .line 517
    const v6, 0x3ef0a3d7    # 0.47f

    .line 518
    .line 519
    .line 520
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const v4, 0x3fb5c28f    # 1.42f

    .line 524
    .line 525
    .line 526
    const/high16 v6, 0x41880000    # 17.0f

    .line 527
    .line 528
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const v25, 0x4013d70a    # 2.31f

    .line 532
    .line 533
    .line 534
    const v26, 0x401b851f    # 2.43f

    .line 535
    .line 536
    .line 537
    const v21, 0x3eeb851f    # 0.46f

    .line 538
    .line 539
    .line 540
    const v22, 0x3f87ae14    # 1.06f

    .line 541
    .line 542
    .line 543
    const v23, 0x3fa3d70a    # 1.28f

    .line 544
    .line 545
    .line 546
    const v24, 0x3ff47ae1    # 1.91f

    .line 547
    .line 548
    .line 549
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const v4, -0x409c28f6    # -0.89f

    .line 553
    .line 554
    .line 555
    const v6, 0x3ecccccd    # 0.4f

    .line 556
    .line 557
    .line 558
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const v4, 0x3eeb851f    # 0.46f

    .line 562
    .line 563
    .line 564
    const v6, 0x3e570a3d    # 0.21f

    .line 565
    .line 566
    .line 567
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const v4, 0x3f666666    # 0.9f

    .line 571
    .line 572
    .line 573
    const v6, -0x41333333    # -0.4f

    .line 574
    .line 575
    .line 576
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const/high16 v25, 0x40c00000    # 6.0f

    .line 580
    .line 581
    const/high16 v26, 0x41a00000    # 20.0f

    .line 582
    .line 583
    const v21, 0x4097ae14    # 4.74f

    .line 584
    .line 585
    .line 586
    const v22, 0x419ef5c3    # 19.87f

    .line 587
    .line 588
    .line 589
    const v23, 0x40ab851f    # 5.36f

    .line 590
    .line 591
    .line 592
    const/high16 v24, 0x41a00000    # 20.0f

    .line 593
    .line 594
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const v25, 0x3fc28f5c    # 1.52f

    .line 598
    .line 599
    .line 600
    const v26, -0x417ae148    # -0.26f

    .line 601
    .line 602
    .line 603
    const v21, 0x3f07ae14    # 0.53f

    .line 604
    .line 605
    .line 606
    const/16 v22, 0x0

    .line 607
    .line 608
    const v23, 0x3f851eb8    # 1.04f

    .line 609
    .line 610
    .line 611
    const v24, -0x421eb852    # -0.11f

    .line 612
    .line 613
    .line 614
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const v4, -0x4151eb85    # -0.34f

    .line 618
    .line 619
    .line 620
    const v6, -0x40970a3d    # -0.91f

    .line 621
    .line 622
    .line 623
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const v4, 0x3ef0a3d7    # 0.47f

    .line 627
    .line 628
    .line 629
    const v6, -0x41c7ae14    # -0.18f

    .line 630
    .line 631
    .line 632
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const v4, 0x419ca3d7    # 19.58f

    .line 636
    .line 637
    .line 638
    const/high16 v6, 0x41000000    # 8.0f

    .line 639
    .line 640
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const v25, 0x401b851f    # 2.43f

    .line 644
    .line 645
    .line 646
    const v26, -0x3fec28f6    # -2.31f

    .line 647
    .line 648
    .line 649
    const v21, 0x3f87ae14    # 1.06f

    .line 650
    .line 651
    .line 652
    const v22, -0x41147ae1    # -0.46f

    .line 653
    .line 654
    .line 655
    const v23, 0x3ff47ae1    # 1.91f

    .line 656
    .line 657
    .line 658
    const v24, -0x405c28f6    # -1.28f

    .line 659
    .line 660
    .line 661
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const v4, -0x409c28f6    # -0.89f

    .line 665
    .line 666
    .line 667
    const v6, -0x41333333    # -0.4f

    .line 668
    .line 669
    .line 670
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 671
    .line 672
    .line 673
    const v4, 0x3e570a3d    # 0.21f

    .line 674
    .line 675
    .line 676
    const v6, -0x41147ae1    # -0.46f

    .line 677
    .line 678
    .line 679
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    const v4, 0x3f666666    # 0.9f

    .line 683
    .line 684
    .line 685
    const v6, 0x3ecccccd    # 0.4f

    .line 686
    .line 687
    .line 688
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    const v25, 0x3e75c28f    # 0.24f

    .line 692
    .line 693
    .line 694
    const v26, -0x40ae147b    # -0.82f

    .line 695
    .line 696
    .line 697
    const v21, 0x3dcccccd    # 0.1f

    .line 698
    .line 699
    .line 700
    const v22, -0x417ae148    # -0.26f

    .line 701
    .line 702
    .line 703
    const v23, 0x3e3851ec    # 0.18f

    .line 704
    .line 705
    .line 706
    const v24, -0x40f5c28f    # -0.54f

    .line 707
    .line 708
    .line 709
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    const v4, 0x40a51eb8    # 5.16f

    .line 713
    .line 714
    .line 715
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 716
    .line 717
    .line 718
    const/high16 v25, 0x41800000    # 16.0f

    .line 719
    .line 720
    const/high16 v26, 0x41840000    # 16.5f

    .line 721
    .line 722
    const v21, 0x41803d71    # 16.03f

    .line 723
    .line 724
    .line 725
    const v22, 0x418147ae    # 16.16f

    .line 726
    .line 727
    .line 728
    const/high16 v23, 0x41800000    # 16.0f

    .line 729
    .line 730
    const v24, 0x4182a3d7    # 16.33f

    .line 731
    .line 732
    .line 733
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 734
    .line 735
    .line 736
    const/high16 v25, 0x40600000    # 3.5f

    .line 737
    .line 738
    const/high16 v26, 0x40600000    # 3.5f

    .line 739
    .line 740
    const/16 v21, 0x0

    .line 741
    .line 742
    const v22, 0x3ff70a3d    # 1.93f

    .line 743
    .line 744
    .line 745
    const v23, 0x3fc8f5c3    # 1.57f

    .line 746
    .line 747
    .line 748
    const/high16 v24, 0x40600000    # 3.5f

    .line 749
    .line 750
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 751
    .line 752
    .line 753
    const/high16 v4, 0x40600000    # 3.5f

    .line 754
    .line 755
    const/high16 v6, -0x3fa00000    # -3.5f

    .line 756
    .line 757
    const/high16 v7, 0x40600000    # 3.5f

    .line 758
    .line 759
    const v8, -0x40370a3d    # -1.57f

    .line 760
    .line 761
    .line 762
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 763
    .line 764
    .line 765
    const/high16 v25, 0x41b00000    # 22.0f

    .line 766
    .line 767
    const v26, 0x4160f5c3    # 14.06f

    .line 768
    .line 769
    .line 770
    const/high16 v21, 0x41b80000    # 23.0f

    .line 771
    .line 772
    const v22, 0x4178cccd    # 15.55f

    .line 773
    .line 774
    .line 775
    const v23, 0x41b4f5c3    # 22.62f

    .line 776
    .line 777
    .line 778
    const v24, 0x416b0a3d    # 14.69f

    .line 779
    .line 780
    .line 781
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 782
    .line 783
    .line 784
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 785
    .line 786
    .line 787
    const/high16 v4, 0x40c00000    # 6.0f

    .line 788
    .line 789
    const/high16 v6, 0x41900000    # 18.0f

    .line 790
    .line 791
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 792
    .line 793
    .line 794
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 795
    .line 796
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 797
    .line 798
    const v21, -0x402b851f    # -1.66f

    .line 799
    .line 800
    .line 801
    const/16 v22, 0x0

    .line 802
    .line 803
    const/high16 v23, -0x3fc00000    # -3.0f

    .line 804
    .line 805
    const v24, -0x40547ae1    # -1.34f

    .line 806
    .line 807
    .line 808
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 809
    .line 810
    .line 811
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 812
    .line 813
    const/high16 v6, -0x3fc00000    # -3.0f

    .line 814
    .line 815
    const/high16 v7, 0x40400000    # 3.0f

    .line 816
    .line 817
    const v8, 0x3fab851f    # 1.34f

    .line 818
    .line 819
    .line 820
    invoke-virtual {v2, v8, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 821
    .line 822
    .line 823
    const v4, 0x3fab851f    # 1.34f

    .line 824
    .line 825
    .line 826
    const/high16 v6, 0x40400000    # 3.0f

    .line 827
    .line 828
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 829
    .line 830
    .line 831
    const v4, 0x40f51eb8    # 7.66f

    .line 832
    .line 833
    .line 834
    const/high16 v6, 0x40c00000    # 6.0f

    .line 835
    .line 836
    const/high16 v7, 0x41900000    # 18.0f

    .line 837
    .line 838
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 839
    .line 840
    .line 841
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 842
    .line 843
    .line 844
    const v4, 0x412deb85    # 10.87f

    .line 845
    .line 846
    .line 847
    const/high16 v6, 0x41600000    # 14.0f

    .line 848
    .line 849
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 850
    .line 851
    .line 852
    const v25, -0x41fae148    # -0.13f

    .line 853
    .line 854
    .line 855
    const v26, -0x40fae148    # -0.52f

    .line 856
    .line 857
    .line 858
    const v21, -0x42dc28f6    # -0.04f

    .line 859
    .line 860
    .line 861
    const v22, -0x41c7ae14    # -0.18f

    .line 862
    .line 863
    .line 864
    const v23, -0x425c28f6    # -0.08f

    .line 865
    .line 866
    .line 867
    const v24, -0x414ccccd    # -0.35f

    .line 868
    .line 869
    .line 870
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 871
    .line 872
    .line 873
    const v4, -0x40970a3d    # -0.91f

    .line 874
    .line 875
    .line 876
    const v6, 0x3eae147b    # 0.34f

    .line 877
    .line 878
    .line 879
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 880
    .line 881
    .line 882
    const v4, -0x41c7ae14    # -0.18f

    .line 883
    .line 884
    .line 885
    const v6, -0x410f5c29    # -0.47f

    .line 886
    .line 887
    .line 888
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 889
    .line 890
    .line 891
    const v4, 0x412947ae    # 10.58f

    .line 892
    .line 893
    .line 894
    const/high16 v6, 0x41500000    # 13.0f

    .line 895
    .line 896
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 897
    .line 898
    .line 899
    const v25, 0x3ed70a3d    # 0.42f

    .line 900
    .line 901
    .line 902
    const/16 v26, 0x0

    .line 903
    .line 904
    const/16 v21, 0x0

    .line 905
    .line 906
    const/16 v22, 0x0

    .line 907
    .line 908
    const v23, 0x3ed70a3d    # 0.42f

    .line 909
    .line 910
    .line 911
    const/16 v24, 0x0

    .line 912
    .line 913
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 914
    .line 915
    .line 916
    const/high16 v25, 0x40800000    # 4.0f

    .line 917
    .line 918
    const/high16 v26, -0x3f800000    # -4.0f

    .line 919
    .line 920
    const v21, 0x400d70a4    # 2.21f

    .line 921
    .line 922
    .line 923
    const/high16 v23, 0x40800000    # 4.0f

    .line 924
    .line 925
    const v24, -0x401ae148    # -1.79f

    .line 926
    .line 927
    .line 928
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 929
    .line 930
    .line 931
    const/high16 v4, 0x41000000    # 8.0f

    .line 932
    .line 933
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 934
    .line 935
    .line 936
    const/high16 v4, 0x40a00000    # 5.0f

    .line 937
    .line 938
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 939
    .line 940
    .line 941
    const v4, 0x40a1999a    # 5.05f

    .line 942
    .line 943
    .line 944
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 945
    .line 946
    .line 947
    const/high16 v25, 0x419c0000    # 19.5f

    .line 948
    .line 949
    const/high16 v26, 0x41500000    # 13.0f

    .line 950
    .line 951
    const v21, 0x419eb852    # 19.84f

    .line 952
    .line 953
    .line 954
    const v22, 0x41507ae1    # 13.03f

    .line 955
    .line 956
    .line 957
    const v23, 0x419d5c29    # 19.67f

    .line 958
    .line 959
    .line 960
    const/high16 v24, 0x41500000    # 13.0f

    .line 961
    .line 962
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 963
    .line 964
    .line 965
    const v25, -0x3fe3d70a    # -2.44f

    .line 966
    .line 967
    .line 968
    const/high16 v26, 0x3f800000    # 1.0f

    .line 969
    .line 970
    const v21, -0x408ccccd    # -0.95f

    .line 971
    .line 972
    .line 973
    const/16 v22, 0x0

    .line 974
    .line 975
    const v23, -0x401851ec    # -1.81f

    .line 976
    .line 977
    .line 978
    const v24, 0x3ec28f5c    # 0.38f

    .line 979
    .line 980
    .line 981
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 982
    .line 983
    .line 984
    const v4, 0x412deb85    # 10.87f

    .line 985
    .line 986
    .line 987
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 988
    .line 989
    .line 990
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 991
    .line 992
    .line 993
    const/high16 v4, 0x419c0000    # 19.5f

    .line 994
    .line 995
    const/high16 v6, 0x41900000    # 18.0f

    .line 996
    .line 997
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 998
    .line 999
    .line 1000
    const/high16 v25, -0x40400000    # -1.5f

    .line 1001
    .line 1002
    const/high16 v26, -0x40400000    # -1.5f

    .line 1003
    .line 1004
    const v21, -0x40ab851f    # -0.83f

    .line 1005
    .line 1006
    .line 1007
    const/high16 v23, -0x40400000    # -1.5f

    .line 1008
    .line 1009
    const v24, -0x40d47ae1    # -0.67f

    .line 1010
    .line 1011
    .line 1012
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1013
    .line 1014
    .line 1015
    const/high16 v4, -0x40400000    # -1.5f

    .line 1016
    .line 1017
    const/high16 v6, -0x40400000    # -1.5f

    .line 1018
    .line 1019
    const/high16 v7, 0x3fc00000    # 1.5f

    .line 1020
    .line 1021
    const v8, 0x3f2b851f    # 0.67f

    .line 1022
    .line 1023
    .line 1024
    invoke-virtual {v2, v8, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1025
    .line 1026
    .line 1027
    const v4, 0x3f2b851f    # 0.67f

    .line 1028
    .line 1029
    .line 1030
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 1031
    .line 1032
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1033
    .line 1034
    .line 1035
    const v4, 0x41a2a3d7    # 20.33f

    .line 1036
    .line 1037
    .line 1038
    const/high16 v6, 0x419c0000    # 19.5f

    .line 1039
    .line 1040
    const/high16 v7, 0x41900000    # 18.0f

    .line 1041
    .line 1042
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1043
    .line 1044
    .line 1045
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1046
    .line 1047
    .line 1048
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v2

    .line 1052
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1053
    .line 1054
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1055
    .line 1056
    const/4 v7, 0x0

    .line 1057
    const-string v4, ""

    .line 1058
    .line 1059
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1060
    .line 1061
    .line 1062
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1063
    .line 1064
    .line 1065
    move-result v3

    .line 1066
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1067
    .line 1068
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1069
    .line 1070
    .line 1071
    move-result-wide v6

    .line 1072
    const/4 v0, 0x0

    .line 1073
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1074
    .line 1075
    .line 1076
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1077
    .line 1078
    .line 1079
    move-result v10

    .line 1080
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1081
    .line 1082
    .line 1083
    move-result v11

    .line 1084
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1085
    .line 1086
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1087
    .line 1088
    .line 1089
    const/high16 v0, 0x41a00000    # 20.0f

    .line 1090
    .line 1091
    const v2, 0x4150cccd    # 13.05f

    .line 1092
    .line 1093
    .line 1094
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1095
    .line 1096
    .line 1097
    const/high16 v0, 0x41000000    # 8.0f

    .line 1098
    .line 1099
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1100
    .line 1101
    .line 1102
    const/high16 v0, -0x3f600000    # -5.0f

    .line 1103
    .line 1104
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1105
    .line 1106
    .line 1107
    const/high16 v0, 0x3f800000    # 1.0f

    .line 1108
    .line 1109
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1110
    .line 1111
    .line 1112
    const/high16 v17, -0x3f800000    # -4.0f

    .line 1113
    .line 1114
    const/high16 v18, 0x40800000    # 4.0f

    .line 1115
    .line 1116
    const v14, 0x400d70a4    # 2.21f

    .line 1117
    .line 1118
    .line 1119
    const v15, -0x401ae148    # -1.79f

    .line 1120
    .line 1121
    .line 1122
    const/high16 v16, 0x40800000    # 4.0f

    .line 1123
    .line 1124
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1125
    .line 1126
    .line 1127
    const v17, -0x4128f5c3    # -0.42f

    .line 1128
    .line 1129
    .line 1130
    const/16 v18, 0x0

    .line 1131
    .line 1132
    const/4 v14, 0x0

    .line 1133
    const v15, -0x4128f5c3    # -0.42f

    .line 1134
    .line 1135
    .line 1136
    const/16 v16, 0x0

    .line 1137
    .line 1138
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1139
    .line 1140
    .line 1141
    const v17, 0x3ea3d70a    # 0.32f

    .line 1142
    .line 1143
    .line 1144
    const/high16 v18, 0x3f800000    # 1.0f

    .line 1145
    .line 1146
    const v13, 0x3e0f5c29    # 0.14f

    .line 1147
    .line 1148
    .line 1149
    const v14, 0x3ea3d70a    # 0.32f

    .line 1150
    .line 1151
    .line 1152
    const/high16 v15, 0x3e800000    # 0.25f

    .line 1153
    .line 1154
    const v16, 0x3f266666    # 0.65f

    .line 1155
    .line 1156
    .line 1157
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1158
    .line 1159
    .line 1160
    const v0, 0x40c51eb8    # 6.16f

    .line 1161
    .line 1162
    .line 1163
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1164
    .line 1165
    .line 1166
    const v17, 0x401c28f6    # 2.44f

    .line 1167
    .line 1168
    .line 1169
    const/high16 v18, -0x40800000    # -1.0f

    .line 1170
    .line 1171
    const v13, 0x3f2147ae    # 0.63f

    .line 1172
    .line 1173
    .line 1174
    const v14, -0x40e147ae    # -0.62f

    .line 1175
    .line 1176
    .line 1177
    const v15, 0x3fbeb852    # 1.49f

    .line 1178
    .line 1179
    .line 1180
    const/high16 v16, -0x40800000    # -1.0f

    .line 1181
    .line 1182
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1183
    .line 1184
    .line 1185
    const/high16 v17, 0x41a00000    # 20.0f

    .line 1186
    .line 1187
    const v18, 0x4150cccd    # 13.05f

    .line 1188
    .line 1189
    .line 1190
    const v13, 0x419d5c29    # 19.67f

    .line 1191
    .line 1192
    .line 1193
    const/high16 v14, 0x41500000    # 13.0f

    .line 1194
    .line 1195
    const v15, 0x419eb852    # 19.84f

    .line 1196
    .line 1197
    .line 1198
    const v16, 0x41507ae1    # 13.03f

    .line 1199
    .line 1200
    .line 1201
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1202
    .line 1203
    .line 1204
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1205
    .line 1206
    .line 1207
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v2

    .line 1211
    const/16 v16, 0x3800

    .line 1212
    .line 1213
    const/16 v17, 0x0

    .line 1214
    .line 1215
    const v6, 0x3e99999a    # 0.3f

    .line 1216
    .line 1217
    .line 1218
    const v8, 0x3e99999a    # 0.3f

    .line 1219
    .line 1220
    .line 1221
    const/4 v7, 0x0

    .line 1222
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1223
    .line 1224
    const/4 v13, 0x0

    .line 1225
    const/4 v14, 0x0

    .line 1226
    const/4 v15, 0x0

    .line 1227
    const-string v4, ""

    .line 1228
    .line 1229
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1230
    .line 1231
    .line 1232
    move-result-object v0

    .line 1233
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1234
    .line 1235
    .line 1236
    move-result-object v0

    .line 1237
    sput-object v0, Landroidx/compose/material/icons/twotone/AgricultureKt;->_agriculture:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1238
    .line 1239
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1240
    .line 1241
    .line 1242
    return-object v0
.end method
