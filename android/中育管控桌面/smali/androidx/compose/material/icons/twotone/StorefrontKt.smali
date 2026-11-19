.class public final Landroidx/compose/material/icons/twotone/StorefrontKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_storefront",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Storefront",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getStorefront",
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
        "SMAP\nStorefront.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Storefront.kt\nandroidx/compose/material/icons/twotone/StorefrontKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,138:1\n212#2,12:139\n233#2,18:152\n253#2:189\n233#2,18:190\n253#2:227\n233#2,18:228\n253#2:265\n233#2,18:266\n253#2:303\n233#2,18:304\n253#2:341\n174#3:151\n705#4,2:170\n717#4,2:172\n719#4,11:178\n705#4,2:208\n717#4,2:210\n719#4,11:216\n705#4,2:246\n717#4,2:248\n719#4,11:254\n705#4,2:284\n717#4,2:286\n719#4,11:292\n705#4,2:322\n717#4,2:324\n719#4,11:330\n72#5,4:174\n72#5,4:212\n72#5,4:250\n72#5,4:288\n72#5,4:326\n*S KotlinDebug\n*F\n+ 1 Storefront.kt\nandroidx/compose/material/icons/twotone/StorefrontKt\n*L\n29#1:139,12\n30#1:152,18\n30#1:189\n40#1:190,18\n40#1:227\n50#1:228,18\n50#1:265\n60#1:266,18\n60#1:303\n70#1:304,18\n70#1:341\n29#1:151\n30#1:170,2\n30#1:172,2\n30#1:178,11\n40#1:208,2\n40#1:210,2\n40#1:216,11\n50#1:246,2\n50#1:248,2\n50#1:254,11\n60#1:284,2\n60#1:286,2\n60#1:292,11\n70#1:322,2\n70#1:324,2\n70#1:330,11\n30#1:174,4\n40#1:212,4\n50#1:250,4\n60#1:288,4\n70#1:326,4\n*E\n"
    }
.end annotation


# static fields
.field private static _storefront:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getStorefront(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/StorefrontKt;->_storefront:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Storefront"

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
    const v4, 0x411dc28f    # 9.86f

    .line 71
    .line 72
    .line 73
    const v6, 0x40ce147b    # 6.44f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, 0x40e0a3d7    # 7.02f

    .line 80
    .line 81
    .line 82
    const/high16 v6, 0x40a00000    # 5.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v4, 0x40a1999a    # 5.05f

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v4, 0x408147ae    # 4.04f

    .line 94
    .line 95
    .line 96
    const v6, 0x4115c28f    # 9.36f

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v25, 0x3e800000    # 0.25f

    .line 103
    .line 104
    const v26, 0x3f95c28f    # 1.17f

    .line 105
    .line 106
    .line 107
    const v21, -0x42333333    # -0.1f

    .line 108
    .line 109
    .line 110
    const v22, 0x3ed70a3d    # 0.42f

    .line 111
    .line 112
    .line 113
    const v23, -0x43dc28f6    # -0.01f

    .line 114
    .line 115
    .line 116
    const v24, 0x3f570a3d    # 0.84f

    .line 117
    .line 118
    .line 119
    move-object/from16 v20, v2

    .line 120
    .line 121
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v25, 0x40a75c29    # 5.23f

    .line 125
    .line 126
    .line 127
    const/high16 v26, 0x41300000    # 11.0f

    .line 128
    .line 129
    const v21, 0x408dc28f    # 4.43f

    .line 130
    .line 131
    .line 132
    const v22, 0x412b5c29    # 10.71f

    .line 133
    .line 134
    .line 135
    const v23, 0x40975c29    # 4.73f

    .line 136
    .line 137
    .line 138
    const/high16 v24, 0x41300000    # 11.0f

    .line 139
    .line 140
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v25, 0x40ce147b    # 6.44f

    .line 144
    .line 145
    .line 146
    const v26, 0x411dc28f    # 9.86f

    .line 147
    .line 148
    .line 149
    const v21, 0x40bae148    # 5.84f

    .line 150
    .line 151
    .line 152
    const/high16 v22, 0x41300000    # 11.0f

    .line 153
    .line 154
    const v23, 0x40cb851f    # 6.36f

    .line 155
    .line 156
    .line 157
    const v24, 0x412828f6    # 10.51f

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    const/16 v16, 0x3800

    .line 171
    .line 172
    const/16 v17, 0x0

    .line 173
    .line 174
    const v6, 0x3e99999a    # 0.3f

    .line 175
    .line 176
    .line 177
    const v8, 0x3e99999a    # 0.3f

    .line 178
    .line 179
    .line 180
    const/4 v7, 0x0

    .line 181
    const/high16 v9, 0x3f800000    # 1.0f

    .line 182
    .line 183
    const/high16 v12, 0x3f800000    # 1.0f

    .line 184
    .line 185
    const/4 v13, 0x0

    .line 186
    const/4 v14, 0x0

    .line 187
    const/4 v15, 0x0

    .line 188
    const-string v4, ""

    .line 189
    .line 190
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 191
    .line 192
    .line 193
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 198
    .line 199
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 200
    .line 201
    .line 202
    move-result-wide v6

    .line 203
    const/4 v2, 0x0

    .line 204
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 208
    .line 209
    .line 210
    move-result v10

    .line 211
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 212
    .line 213
    .line 214
    move-result v11

    .line 215
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 218
    .line 219
    .line 220
    const v4, 0x411b5c29    # 9.71f

    .line 221
    .line 222
    .line 223
    const/high16 v6, 0x41300000    # 11.0f

    .line 224
    .line 225
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v25, 0x41300000    # 11.0f

    .line 229
    .line 230
    const v26, 0x411b0a3d    # 9.69f

    .line 231
    .line 232
    .line 233
    const v21, 0x41273333    # 10.45f

    .line 234
    .line 235
    .line 236
    const/high16 v23, 0x41300000    # 11.0f

    .line 237
    .line 238
    const v24, 0x41268f5c    # 10.41f

    .line 239
    .line 240
    .line 241
    move-object/from16 v20, v2

    .line 242
    .line 243
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/high16 v4, 0x40a00000    # 5.0f

    .line 247
    .line 248
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v4, 0x4110a3d7    # 9.04f

    .line 252
    .line 253
    .line 254
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v4, 0x411851ec    # 9.52f

    .line 258
    .line 259
    .line 260
    const v6, 0x4107d70a    # 8.49f

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v25, 0x3ea8f5c3    # 0.33f

    .line 267
    .line 268
    .line 269
    const v26, 0x3f88f5c3    # 1.07f

    .line 270
    .line 271
    .line 272
    const v21, -0x42b33333    # -0.05f

    .line 273
    .line 274
    .line 275
    const v22, 0x3ec7ae14    # 0.39f

    .line 276
    .line 277
    .line 278
    const v23, 0x3d8f5c29    # 0.07f

    .line 279
    .line 280
    .line 281
    const v24, 0x3f47ae14    # 0.78f

    .line 282
    .line 283
    .line 284
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const v25, 0x411b5c29    # 9.71f

    .line 288
    .line 289
    .line 290
    const/high16 v26, 0x41300000    # 11.0f

    .line 291
    .line 292
    const v21, 0x4110cccd    # 9.05f

    .line 293
    .line 294
    .line 295
    const v22, 0x412d999a    # 10.85f

    .line 296
    .line 297
    .line 298
    const v23, 0x4115eb85    # 9.37f

    .line 299
    .line 300
    .line 301
    const/high16 v24, 0x41300000    # 11.0f

    .line 302
    .line 303
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    const v6, 0x3e99999a    # 0.3f

    .line 314
    .line 315
    .line 316
    const/4 v7, 0x0

    .line 317
    const-string v4, ""

    .line 318
    .line 319
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 320
    .line 321
    .line 322
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 323
    .line 324
    .line 325
    move-result v3

    .line 326
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 327
    .line 328
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 329
    .line 330
    .line 331
    move-result-wide v6

    .line 332
    const/4 v2, 0x0

    .line 333
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 334
    .line 335
    .line 336
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 337
    .line 338
    .line 339
    move-result v10

    .line 340
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 341
    .line 342
    .line 343
    move-result v11

    .line 344
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 347
    .line 348
    .line 349
    const v4, 0x4163851f    # 14.22f

    .line 350
    .line 351
    .line 352
    const/high16 v6, 0x41300000    # 11.0f

    .line 353
    .line 354
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v25, 0x3f75c28f    # 0.96f

    .line 358
    .line 359
    .line 360
    const v26, -0x412e147b    # -0.41f

    .line 361
    .line 362
    .line 363
    const v21, 0x3ed1eb85    # 0.41f

    .line 364
    .line 365
    .line 366
    const/16 v22, 0x0

    .line 367
    .line 368
    const v23, 0x3f3851ec    # 0.72f

    .line 369
    .line 370
    .line 371
    const v24, -0x41e66666    # -0.15f

    .line 372
    .line 373
    .line 374
    move-object/from16 v20, v2

    .line 375
    .line 376
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v25, 0x3ea8f5c3    # 0.33f

    .line 380
    .line 381
    .line 382
    const v26, -0x40770a3d    # -1.07f

    .line 383
    .line 384
    .line 385
    const/high16 v21, 0x3e800000    # 0.25f

    .line 386
    .line 387
    const v22, -0x416b851f    # -0.29f

    .line 388
    .line 389
    .line 390
    const v23, 0x3ebd70a4    # 0.37f

    .line 391
    .line 392
    .line 393
    const v24, -0x40d1eb85    # -0.68f

    .line 394
    .line 395
    .line 396
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const v4, 0x416f5c29    # 14.96f

    .line 400
    .line 401
    .line 402
    const/high16 v6, 0x40a00000    # 5.0f

    .line 403
    .line 404
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/high16 v4, 0x41500000    # 13.0f

    .line 408
    .line 409
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v4, 0x4096147b    # 4.69f

    .line 413
    .line 414
    .line 415
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v25, 0x4163851f    # 14.22f

    .line 419
    .line 420
    .line 421
    const/high16 v26, 0x41300000    # 11.0f

    .line 422
    .line 423
    const/high16 v21, 0x41500000    # 13.0f

    .line 424
    .line 425
    const v22, 0x41268f5c    # 10.41f

    .line 426
    .line 427
    .line 428
    const v23, 0x4158cccd    # 13.55f

    .line 429
    .line 430
    .line 431
    const/high16 v24, 0x41300000    # 11.0f

    .line 432
    .line 433
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 440
    .line 441
    .line 442
    move-result-object v2

    .line 443
    const v6, 0x3e99999a    # 0.3f

    .line 444
    .line 445
    .line 446
    const/4 v7, 0x0

    .line 447
    const-string v4, ""

    .line 448
    .line 449
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 450
    .line 451
    .line 452
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 453
    .line 454
    .line 455
    move-result v3

    .line 456
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 457
    .line 458
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 459
    .line 460
    .line 461
    move-result-wide v6

    .line 462
    const/4 v2, 0x0

    .line 463
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 464
    .line 465
    .line 466
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 467
    .line 468
    .line 469
    move-result v10

    .line 470
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 471
    .line 472
    .line 473
    move-result v11

    .line 474
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 477
    .line 478
    .line 479
    const v4, 0x409fae14    # 4.99f

    .line 480
    .line 481
    .line 482
    const v6, 0x419747ae    # 18.91f

    .line 483
    .line 484
    .line 485
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const v4, 0x4187d70a    # 16.98f

    .line 489
    .line 490
    .line 491
    const/high16 v6, 0x40a00000    # 5.0f

    .line 492
    .line 493
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const v4, 0x3f147ae1    # 0.58f

    .line 497
    .line 498
    .line 499
    const v6, 0x409b851f    # 4.86f

    .line 500
    .line 501
    .line 502
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const v25, 0x3f9ae148    # 1.21f

    .line 506
    .line 507
    .line 508
    const v26, 0x3f91eb85    # 1.14f

    .line 509
    .line 510
    .line 511
    const v21, 0x3da3d70a    # 0.08f

    .line 512
    .line 513
    .line 514
    const v22, 0x3f266666    # 0.65f

    .line 515
    .line 516
    .line 517
    const v23, 0x3f19999a    # 0.6f

    .line 518
    .line 519
    .line 520
    const v24, 0x3f91eb85    # 1.14f

    .line 521
    .line 522
    .line 523
    move-object/from16 v20, v2

    .line 524
    .line 525
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const v25, 0x3f6e147b    # 0.93f

    .line 529
    .line 530
    .line 531
    const v26, -0x410f5c29    # -0.47f

    .line 532
    .line 533
    .line 534
    const v21, 0x3efae148    # 0.49f

    .line 535
    .line 536
    .line 537
    const/16 v22, 0x0

    .line 538
    .line 539
    const v23, 0x3f4ccccd    # 0.8f

    .line 540
    .line 541
    .line 542
    const v24, -0x416b851f    # -0.29f

    .line 543
    .line 544
    .line 545
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const/high16 v25, 0x3e800000    # 0.25f

    .line 549
    .line 550
    const v26, -0x406a3d71    # -1.17f

    .line 551
    .line 552
    .line 553
    const v21, 0x3e851eb8    # 0.26f

    .line 554
    .line 555
    .line 556
    const v22, -0x41570a3d    # -0.33f

    .line 557
    .line 558
    .line 559
    const v23, 0x3eb33333    # 0.35f

    .line 560
    .line 561
    .line 562
    const v24, -0x40bd70a4    # -0.76f

    .line 563
    .line 564
    .line 565
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const v4, 0x409fae14    # 4.99f

    .line 569
    .line 570
    .line 571
    const v6, 0x419747ae    # 18.91f

    .line 572
    .line 573
    .line 574
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 581
    .line 582
    .line 583
    move-result-object v2

    .line 584
    const v6, 0x3e99999a    # 0.3f

    .line 585
    .line 586
    .line 587
    const/4 v7, 0x0

    .line 588
    const-string v4, ""

    .line 589
    .line 590
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 591
    .line 592
    .line 593
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 594
    .line 595
    .line 596
    move-result v3

    .line 597
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 598
    .line 599
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 600
    .line 601
    .line 602
    move-result-wide v6

    .line 603
    const/4 v0, 0x0

    .line 604
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 605
    .line 606
    .line 607
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 608
    .line 609
    .line 610
    move-result v10

    .line 611
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 612
    .line 613
    .line 614
    move-result v11

    .line 615
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 618
    .line 619
    .line 620
    const v0, 0x41af3333    # 21.9f

    .line 621
    .line 622
    .line 623
    const v2, 0x410e3d71    # 8.89f

    .line 624
    .line 625
    .line 626
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const v0, -0x4079999a    # -1.05f

    .line 630
    .line 631
    .line 632
    const v2, -0x3f7428f6    # -4.37f

    .line 633
    .line 634
    .line 635
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const v17, -0x400b851f    # -1.91f

    .line 639
    .line 640
    .line 641
    const v18, -0x403d70a4    # -1.52f

    .line 642
    .line 643
    .line 644
    const v13, -0x419eb852    # -0.22f

    .line 645
    .line 646
    .line 647
    const v14, -0x4099999a    # -0.9f

    .line 648
    .line 649
    .line 650
    const/high16 v15, -0x40800000    # -1.0f

    .line 651
    .line 652
    const v16, -0x403d70a4    # -1.52f

    .line 653
    .line 654
    .line 655
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const v0, 0x40a1999a    # 5.05f

    .line 659
    .line 660
    .line 661
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const v17, 0x4049999a    # 3.15f

    .line 665
    .line 666
    .line 667
    const v18, 0x4090a3d7    # 4.52f

    .line 668
    .line 669
    .line 670
    const v13, 0x4084cccd    # 4.15f

    .line 671
    .line 672
    .line 673
    const/high16 v14, 0x40400000    # 3.0f

    .line 674
    .line 675
    const v15, 0x40570a3d    # 3.36f

    .line 676
    .line 677
    .line 678
    const v16, 0x406851ec    # 3.63f

    .line 679
    .line 680
    .line 681
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const v0, 0x40066666    # 2.1f

    .line 685
    .line 686
    .line 687
    const v2, 0x410e3d71    # 8.89f

    .line 688
    .line 689
    .line 690
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 691
    .line 692
    .line 693
    const v17, 0x3f1eb852    # 0.62f

    .line 694
    .line 695
    .line 696
    const v18, 0x403851ec    # 2.88f

    .line 697
    .line 698
    .line 699
    const v13, -0x418a3d71    # -0.24f

    .line 700
    .line 701
    .line 702
    const v14, 0x3f828f5c    # 1.02f

    .line 703
    .line 704
    .line 705
    const v15, -0x435c28f6    # -0.02f

    .line 706
    .line 707
    .line 708
    const v16, 0x4003d70a    # 2.06f

    .line 709
    .line 710
    .line 711
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    const/high16 v17, 0x40400000    # 3.0f

    .line 715
    .line 716
    const v18, 0x4140f5c3    # 12.06f

    .line 717
    .line 718
    .line 719
    const v13, 0x40333333    # 2.8f

    .line 720
    .line 721
    .line 722
    const v14, 0x413e147b    # 11.88f

    .line 723
    .line 724
    .line 725
    const v15, 0x403a3d71    # 2.91f

    .line 726
    .line 727
    .line 728
    const v16, 0x413f5c29    # 11.96f

    .line 729
    .line 730
    .line 731
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    const/high16 v0, 0x41980000    # 19.0f

    .line 735
    .line 736
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 737
    .line 738
    .line 739
    const/high16 v17, 0x40000000    # 2.0f

    .line 740
    .line 741
    const/high16 v18, 0x40000000    # 2.0f

    .line 742
    .line 743
    const/4 v13, 0x0

    .line 744
    const v14, 0x3f8ccccd    # 1.1f

    .line 745
    .line 746
    .line 747
    const v15, 0x3f666666    # 0.9f

    .line 748
    .line 749
    .line 750
    const/high16 v16, 0x40000000    # 2.0f

    .line 751
    .line 752
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 753
    .line 754
    .line 755
    const/high16 v0, 0x41600000    # 14.0f

    .line 756
    .line 757
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 758
    .line 759
    .line 760
    const/high16 v18, -0x40000000    # -2.0f

    .line 761
    .line 762
    const v13, 0x3f8ccccd    # 1.1f

    .line 763
    .line 764
    .line 765
    const/4 v14, 0x0

    .line 766
    const/high16 v15, 0x40000000    # 2.0f

    .line 767
    .line 768
    const v16, -0x4099999a    # -0.9f

    .line 769
    .line 770
    .line 771
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 772
    .line 773
    .line 774
    const v0, -0x3f21eb85    # -6.94f

    .line 775
    .line 776
    .line 777
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 778
    .line 779
    .line 780
    const v17, 0x3e8f5c29    # 0.28f

    .line 781
    .line 782
    .line 783
    const v18, -0x4170a3d7    # -0.28f

    .line 784
    .line 785
    .line 786
    const v13, 0x3db851ec    # 0.09f

    .line 787
    .line 788
    .line 789
    const v14, -0x4247ae14    # -0.09f

    .line 790
    .line 791
    .line 792
    const v15, 0x3e4ccccd    # 0.2f

    .line 793
    .line 794
    .line 795
    const v16, -0x41c7ae14    # -0.18f

    .line 796
    .line 797
    .line 798
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 799
    .line 800
    .line 801
    const v17, 0x41af3333    # 21.9f

    .line 802
    .line 803
    .line 804
    const v18, 0x410e3d71    # 8.89f

    .line 805
    .line 806
    .line 807
    const v13, 0x41af5c29    # 21.92f

    .line 808
    .line 809
    .line 810
    const v14, 0x412f5c29    # 10.96f

    .line 811
    .line 812
    .line 813
    const v15, 0x41b13333    # 22.15f

    .line 814
    .line 815
    .line 816
    const v16, 0x411e8f5c    # 9.91f

    .line 817
    .line 818
    .line 819
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 820
    .line 821
    .line 822
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 823
    .line 824
    .line 825
    const/high16 v0, 0x41500000    # 13.0f

    .line 826
    .line 827
    const/high16 v2, 0x40a00000    # 5.0f

    .line 828
    .line 829
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 830
    .line 831
    .line 832
    const v0, 0x3ffae148    # 1.96f

    .line 833
    .line 834
    .line 835
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 836
    .line 837
    .line 838
    const v0, 0x3f0a3d71    # 0.54f

    .line 839
    .line 840
    .line 841
    const v2, 0x4090a3d7    # 4.52f

    .line 842
    .line 843
    .line 844
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 845
    .line 846
    .line 847
    const v17, -0x41570a3d    # -0.33f

    .line 848
    .line 849
    .line 850
    const v18, 0x3f88f5c3    # 1.07f

    .line 851
    .line 852
    .line 853
    const v13, 0x3d4ccccd    # 0.05f

    .line 854
    .line 855
    .line 856
    const v14, 0x3ec7ae14    # 0.39f

    .line 857
    .line 858
    .line 859
    const v15, -0x4270a3d7    # -0.07f

    .line 860
    .line 861
    .line 862
    const v16, 0x3f47ae14    # 0.78f

    .line 863
    .line 864
    .line 865
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 866
    .line 867
    .line 868
    const v17, 0x4163851f    # 14.22f

    .line 869
    .line 870
    .line 871
    const/high16 v18, 0x41300000    # 11.0f

    .line 872
    .line 873
    const v13, 0x416f3333    # 14.95f

    .line 874
    .line 875
    .line 876
    const v14, 0x412d999a    # 10.85f

    .line 877
    .line 878
    .line 879
    const v15, 0x416a147b    # 14.63f

    .line 880
    .line 881
    .line 882
    const/high16 v16, 0x41300000    # 11.0f

    .line 883
    .line 884
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 885
    .line 886
    .line 887
    const/high16 v17, 0x41500000    # 13.0f

    .line 888
    .line 889
    const v18, 0x411b0a3d    # 9.69f

    .line 890
    .line 891
    .line 892
    const v13, 0x4158cccd    # 13.55f

    .line 893
    .line 894
    .line 895
    const/high16 v14, 0x41300000    # 11.0f

    .line 896
    .line 897
    const/high16 v15, 0x41500000    # 13.0f

    .line 898
    .line 899
    const v16, 0x41268f5c    # 10.41f

    .line 900
    .line 901
    .line 902
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 903
    .line 904
    .line 905
    const/high16 v0, 0x40a00000    # 5.0f

    .line 906
    .line 907
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 908
    .line 909
    .line 910
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 911
    .line 912
    .line 913
    const v0, 0x411851ec    # 9.52f

    .line 914
    .line 915
    .line 916
    const v2, 0x4107d70a    # 8.49f

    .line 917
    .line 918
    .line 919
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 920
    .line 921
    .line 922
    const v0, 0x4110a3d7    # 9.04f

    .line 923
    .line 924
    .line 925
    const/high16 v2, 0x40a00000    # 5.0f

    .line 926
    .line 927
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 928
    .line 929
    .line 930
    const/high16 v0, 0x41300000    # 11.0f

    .line 931
    .line 932
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 933
    .line 934
    .line 935
    const v0, 0x4096147b    # 4.69f

    .line 936
    .line 937
    .line 938
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 939
    .line 940
    .line 941
    const v17, 0x411b5c29    # 9.71f

    .line 942
    .line 943
    .line 944
    const/high16 v18, 0x41300000    # 11.0f

    .line 945
    .line 946
    const/high16 v13, 0x41300000    # 11.0f

    .line 947
    .line 948
    const v14, 0x41268f5c    # 10.41f

    .line 949
    .line 950
    .line 951
    const v15, 0x41273333    # 10.45f

    .line 952
    .line 953
    .line 954
    const/high16 v16, 0x41300000    # 11.0f

    .line 955
    .line 956
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 957
    .line 958
    .line 959
    const v17, -0x409c28f6    # -0.89f

    .line 960
    .line 961
    .line 962
    const v18, -0x412e147b    # -0.41f

    .line 963
    .line 964
    .line 965
    const v13, -0x4151eb85    # -0.34f

    .line 966
    .line 967
    .line 968
    const/4 v14, 0x0

    .line 969
    const v15, -0x40d9999a    # -0.65f

    .line 970
    .line 971
    .line 972
    const v16, -0x41e66666    # -0.15f

    .line 973
    .line 974
    .line 975
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 976
    .line 977
    .line 978
    const v17, 0x4107d70a    # 8.49f

    .line 979
    .line 980
    .line 981
    const v18, 0x411851ec    # 9.52f

    .line 982
    .line 983
    .line 984
    const v13, 0x41091eb8    # 8.57f

    .line 985
    .line 986
    .line 987
    const v14, 0x4124cccd    # 10.3f

    .line 988
    .line 989
    .line 990
    const v15, 0x41073333    # 8.45f

    .line 991
    .line 992
    .line 993
    const v16, 0x411e8f5c    # 9.91f

    .line 994
    .line 995
    .line 996
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 997
    .line 998
    .line 999
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1000
    .line 1001
    .line 1002
    const v0, 0x408947ae    # 4.29f

    .line 1003
    .line 1004
    .line 1005
    const v2, 0x41287ae1    # 10.53f

    .line 1006
    .line 1007
    .line 1008
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1009
    .line 1010
    .line 1011
    const/high16 v17, -0x41800000    # -0.25f

    .line 1012
    .line 1013
    const v18, -0x406a3d71    # -1.17f

    .line 1014
    .line 1015
    .line 1016
    const v13, -0x417ae148    # -0.26f

    .line 1017
    .line 1018
    .line 1019
    const v14, -0x41570a3d    # -0.33f

    .line 1020
    .line 1021
    .line 1022
    const v15, -0x414ccccd    # -0.35f

    .line 1023
    .line 1024
    .line 1025
    const v16, -0x40bd70a4    # -0.76f

    .line 1026
    .line 1027
    .line 1028
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1029
    .line 1030
    .line 1031
    const v0, 0x40a1999a    # 5.05f

    .line 1032
    .line 1033
    .line 1034
    const/high16 v2, 0x40a00000    # 5.0f

    .line 1035
    .line 1036
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1037
    .line 1038
    .line 1039
    const v0, 0x3ffc28f6    # 1.97f

    .line 1040
    .line 1041
    .line 1042
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1043
    .line 1044
    .line 1045
    const v0, 0x411dc28f    # 9.86f

    .line 1046
    .line 1047
    .line 1048
    const v2, 0x40ce147b    # 6.44f

    .line 1049
    .line 1050
    .line 1051
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1052
    .line 1053
    .line 1054
    const v17, 0x40a75c29    # 5.23f

    .line 1055
    .line 1056
    .line 1057
    const/high16 v18, 0x41300000    # 11.0f

    .line 1058
    .line 1059
    const v13, 0x40cb851f    # 6.36f

    .line 1060
    .line 1061
    .line 1062
    const v14, 0x412828f6    # 10.51f

    .line 1063
    .line 1064
    .line 1065
    const v15, 0x40bae148    # 5.84f

    .line 1066
    .line 1067
    .line 1068
    const/high16 v16, 0x41300000    # 11.0f

    .line 1069
    .line 1070
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1071
    .line 1072
    .line 1073
    const v17, 0x408947ae    # 4.29f

    .line 1074
    .line 1075
    .line 1076
    const v18, 0x41287ae1    # 10.53f

    .line 1077
    .line 1078
    .line 1079
    const v13, 0x40975c29    # 4.73f

    .line 1080
    .line 1081
    .line 1082
    const/high16 v14, 0x41300000    # 11.0f

    .line 1083
    .line 1084
    const v15, 0x408dc28f    # 4.43f

    .line 1085
    .line 1086
    .line 1087
    const v16, 0x412b5c29    # 10.71f

    .line 1088
    .line 1089
    .line 1090
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1091
    .line 1092
    .line 1093
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1094
    .line 1095
    .line 1096
    const/high16 v0, 0x41980000    # 19.0f

    .line 1097
    .line 1098
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1099
    .line 1100
    .line 1101
    const/high16 v0, 0x40a00000    # 5.0f

    .line 1102
    .line 1103
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1104
    .line 1105
    .line 1106
    const v0, -0x3f3f0a3d    # -6.03f

    .line 1107
    .line 1108
    .line 1109
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1110
    .line 1111
    .line 1112
    const v17, 0x40a75c29    # 5.23f

    .line 1113
    .line 1114
    .line 1115
    const/high16 v18, 0x41500000    # 13.0f

    .line 1116
    .line 1117
    const v13, 0x40a28f5c    # 5.08f

    .line 1118
    .line 1119
    .line 1120
    const v14, 0x414fae14    # 12.98f

    .line 1121
    .line 1122
    .line 1123
    const v15, 0x40a4cccd    # 5.15f

    .line 1124
    .line 1125
    .line 1126
    const/high16 v16, 0x41500000    # 13.0f

    .line 1127
    .line 1128
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1129
    .line 1130
    .line 1131
    const v17, 0x400f5c29    # 2.24f

    .line 1132
    .line 1133
    .line 1134
    const v18, -0x408ccccd    # -0.95f

    .line 1135
    .line 1136
    .line 1137
    const v13, 0x3f5eb852    # 0.87f

    .line 1138
    .line 1139
    .line 1140
    const/4 v14, 0x0

    .line 1141
    const v15, 0x3fd47ae1    # 1.66f

    .line 1142
    .line 1143
    .line 1144
    const v16, -0x4147ae14    # -0.36f

    .line 1145
    .line 1146
    .line 1147
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1148
    .line 1149
    .line 1150
    const v17, 0x4013d70a    # 2.31f

    .line 1151
    .line 1152
    .line 1153
    const v18, 0x3f733333    # 0.95f

    .line 1154
    .line 1155
    .line 1156
    const v13, 0x3f19999a    # 0.6f

    .line 1157
    .line 1158
    .line 1159
    const v14, 0x3f19999a    # 0.6f

    .line 1160
    .line 1161
    .line 1162
    const v15, 0x3fb33333    # 1.4f

    .line 1163
    .line 1164
    .line 1165
    const v16, 0x3f733333    # 0.95f

    .line 1166
    .line 1167
    .line 1168
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1169
    .line 1170
    .line 1171
    const v17, 0x400eb852    # 2.23f

    .line 1172
    .line 1173
    .line 1174
    const v18, -0x4091eb85    # -0.93f

    .line 1175
    .line 1176
    .line 1177
    const v13, 0x3f5eb852    # 0.87f

    .line 1178
    .line 1179
    .line 1180
    const/4 v14, 0x0

    .line 1181
    const v15, 0x3fd33333    # 1.65f

    .line 1182
    .line 1183
    .line 1184
    const v16, -0x4147ae14    # -0.36f

    .line 1185
    .line 1186
    .line 1187
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1188
    .line 1189
    .line 1190
    const v17, 0x40128f5c    # 2.29f

    .line 1191
    .line 1192
    .line 1193
    const v18, 0x3f6e147b    # 0.93f

    .line 1194
    .line 1195
    .line 1196
    const v13, 0x3f170a3d    # 0.59f

    .line 1197
    .line 1198
    .line 1199
    const v14, 0x3f11eb85    # 0.57f

    .line 1200
    .line 1201
    .line 1202
    const v15, 0x3fb1eb85    # 1.39f

    .line 1203
    .line 1204
    .line 1205
    const v16, 0x3f6e147b    # 0.93f

    .line 1206
    .line 1207
    .line 1208
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1209
    .line 1210
    .line 1211
    const v17, 0x400f5c29    # 2.24f

    .line 1212
    .line 1213
    .line 1214
    const v18, -0x408ccccd    # -0.95f

    .line 1215
    .line 1216
    .line 1217
    const v13, 0x3f570a3d    # 0.84f

    .line 1218
    .line 1219
    .line 1220
    const/4 v14, 0x0

    .line 1221
    const v15, 0x3fd1eb85    # 1.64f

    .line 1222
    .line 1223
    .line 1224
    const v16, -0x414ccccd    # -0.35f

    .line 1225
    .line 1226
    .line 1227
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1228
    .line 1229
    .line 1230
    const v18, 0x3f733333    # 0.95f

    .line 1231
    .line 1232
    .line 1233
    const v13, 0x3f147ae1    # 0.58f

    .line 1234
    .line 1235
    .line 1236
    const v14, 0x3f170a3d    # 0.59f

    .line 1237
    .line 1238
    .line 1239
    const v15, 0x3faf5c29    # 1.37f

    .line 1240
    .line 1241
    .line 1242
    const v16, 0x3f733333    # 0.95f

    .line 1243
    .line 1244
    .line 1245
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1246
    .line 1247
    .line 1248
    const v17, 0x3e6b851f    # 0.23f

    .line 1249
    .line 1250
    .line 1251
    const v18, -0x430a3d71    # -0.03f

    .line 1252
    .line 1253
    .line 1254
    const v13, 0x3da3d70a    # 0.08f

    .line 1255
    .line 1256
    .line 1257
    const/4 v14, 0x0

    .line 1258
    const v15, 0x3e19999a    # 0.15f

    .line 1259
    .line 1260
    .line 1261
    const v16, -0x435c28f6    # -0.02f

    .line 1262
    .line 1263
    .line 1264
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1265
    .line 1266
    .line 1267
    const/high16 v0, 0x41980000    # 19.0f

    .line 1268
    .line 1269
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1270
    .line 1271
    .line 1272
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1273
    .line 1274
    .line 1275
    const v0, 0x419dae14    # 19.71f

    .line 1276
    .line 1277
    .line 1278
    const v2, 0x41287ae1    # 10.53f

    .line 1279
    .line 1280
    .line 1281
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1282
    .line 1283
    .line 1284
    const v17, 0x419628f6    # 18.77f

    .line 1285
    .line 1286
    .line 1287
    const/high16 v18, 0x41300000    # 11.0f

    .line 1288
    .line 1289
    const v13, 0x419c8f5c    # 19.57f

    .line 1290
    .line 1291
    .line 1292
    const v14, 0x412b5c29    # 10.71f

    .line 1293
    .line 1294
    .line 1295
    const v15, 0x419a28f6    # 19.27f

    .line 1296
    .line 1297
    .line 1298
    const/high16 v16, 0x41300000    # 11.0f

    .line 1299
    .line 1300
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1301
    .line 1302
    .line 1303
    const v17, -0x40651eb8    # -1.21f

    .line 1304
    .line 1305
    .line 1306
    const v18, -0x406e147b    # -1.14f

    .line 1307
    .line 1308
    .line 1309
    const v13, -0x40e3d70a    # -0.61f

    .line 1310
    .line 1311
    .line 1312
    const/4 v14, 0x0

    .line 1313
    const v15, -0x406e147b    # -1.14f

    .line 1314
    .line 1315
    .line 1316
    const v16, -0x41051eb8    # -0.49f

    .line 1317
    .line 1318
    .line 1319
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1320
    .line 1321
    .line 1322
    const v0, 0x4187d70a    # 16.98f

    .line 1323
    .line 1324
    .line 1325
    const/high16 v2, 0x40a00000    # 5.0f

    .line 1326
    .line 1327
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1328
    .line 1329
    .line 1330
    const v0, 0x3ff70a3d    # 1.93f

    .line 1331
    .line 1332
    .line 1333
    const v2, -0x43dc28f6    # -0.01f

    .line 1334
    .line 1335
    .line 1336
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1337
    .line 1338
    .line 1339
    const v0, 0x3f866666    # 1.05f

    .line 1340
    .line 1341
    .line 1342
    const v2, 0x408bd70a    # 4.37f

    .line 1343
    .line 1344
    .line 1345
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1346
    .line 1347
    .line 1348
    const v17, 0x419dae14    # 19.71f

    .line 1349
    .line 1350
    .line 1351
    const v18, 0x41287ae1    # 10.53f

    .line 1352
    .line 1353
    .line 1354
    const v13, 0x41a07ae1    # 20.06f

    .line 1355
    .line 1356
    .line 1357
    const v14, 0x411c7ae1    # 9.78f

    .line 1358
    .line 1359
    .line 1360
    const v15, 0x419fc28f    # 19.97f

    .line 1361
    .line 1362
    .line 1363
    const v16, 0x41235c29    # 10.21f

    .line 1364
    .line 1365
    .line 1366
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1367
    .line 1368
    .line 1369
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1370
    .line 1371
    .line 1372
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1373
    .line 1374
    .line 1375
    move-result-object v2

    .line 1376
    const/16 v16, 0x3800

    .line 1377
    .line 1378
    const/16 v17, 0x0

    .line 1379
    .line 1380
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1381
    .line 1382
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1383
    .line 1384
    const/4 v7, 0x0

    .line 1385
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1386
    .line 1387
    const/4 v13, 0x0

    .line 1388
    const/4 v14, 0x0

    .line 1389
    const/4 v15, 0x0

    .line 1390
    const-string v4, ""

    .line 1391
    .line 1392
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1393
    .line 1394
    .line 1395
    move-result-object v0

    .line 1396
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1397
    .line 1398
    .line 1399
    move-result-object v0

    .line 1400
    sput-object v0, Landroidx/compose/material/icons/twotone/StorefrontKt;->_storefront:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1401
    .line 1402
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1403
    .line 1404
    .line 1405
    return-object v0
.end method
