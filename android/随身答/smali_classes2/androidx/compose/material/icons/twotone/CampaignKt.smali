.class public final Landroidx/compose/material/icons/twotone/CampaignKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_campaign",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Campaign",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getCampaign",
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
        "SMAP\nCampaign.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Campaign.kt\nandroidx/compose/material/icons/twotone/CampaignKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,108:1\n212#2,12:109\n233#2,18:122\n253#2:159\n233#2,18:160\n253#2:197\n233#2,18:198\n253#2:235\n233#2,18:236\n253#2:273\n233#2,18:274\n253#2:311\n233#2,18:312\n253#2:349\n174#3:121\n705#4,2:140\n717#4,2:142\n719#4,11:148\n705#4,2:178\n717#4,2:180\n719#4,11:186\n705#4,2:216\n717#4,2:218\n719#4,11:224\n705#4,2:254\n717#4,2:256\n719#4,11:262\n705#4,2:292\n717#4,2:294\n719#4,11:300\n705#4,2:330\n717#4,2:332\n719#4,11:338\n72#5,4:144\n72#5,4:182\n72#5,4:220\n72#5,4:258\n72#5,4:296\n72#5,4:334\n*S KotlinDebug\n*F\n+ 1 Campaign.kt\nandroidx/compose/material/icons/twotone/CampaignKt\n*L\n29#1:109,12\n30#1:122,18\n30#1:159\n38#1:160,18\n38#1:197\n46#1:198,18\n46#1:235\n54#1:236,18\n54#1:273\n82#1:274,18\n82#1:311\n89#1:312,18\n89#1:349\n29#1:121\n30#1:140,2\n30#1:142,2\n30#1:148,11\n38#1:178,2\n38#1:180,2\n38#1:186,11\n46#1:216,2\n46#1:218,2\n46#1:224,11\n54#1:254,2\n54#1:256,2\n54#1:262,11\n82#1:292,2\n82#1:294,2\n82#1:300,11\n89#1:330,2\n89#1:332,2\n89#1:338,11\n30#1:144,4\n38#1:182,4\n46#1:220,4\n54#1:258,4\n82#1:296,4\n89#1:334,4\n*E\n"
    }
.end annotation


# static fields
.field private static _campaign:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCampaign(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/CampaignKt;->_campaign:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Campaign"

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
    const/high16 v4, 0x41900000    # 18.0f

    .line 71
    .line 72
    const/high16 v6, 0x41300000    # 11.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/16 v25, 0x0

    .line 78
    .line 79
    const/high16 v26, 0x40000000    # 2.0f

    .line 80
    .line 81
    const/16 v21, 0x0

    .line 82
    .line 83
    const v22, 0x3f2b851f    # 0.67f

    .line 84
    .line 85
    .line 86
    const/16 v23, 0x0

    .line 87
    .line 88
    const v24, 0x3faa3d71    # 1.33f

    .line 89
    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v25, 0x40800000    # 4.0f

    .line 97
    .line 98
    const/16 v26, 0x0

    .line 99
    .line 100
    const v21, 0x3f99999a    # 1.2f

    .line 101
    .line 102
    .line 103
    const/16 v22, 0x0

    .line 104
    .line 105
    const v23, 0x4030a3d7    # 2.76f

    .line 106
    .line 107
    .line 108
    const/16 v24, 0x0

    .line 109
    .line 110
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const/16 v25, 0x0

    .line 114
    .line 115
    const/high16 v26, -0x40000000    # -2.0f

    .line 116
    .line 117
    const/16 v21, 0x0

    .line 118
    .line 119
    const v22, -0x40d47ae1    # -0.67f

    .line 120
    .line 121
    .line 122
    const/16 v23, 0x0

    .line 123
    .line 124
    const v24, -0x4055c28f    # -1.33f

    .line 125
    .line 126
    .line 127
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const/high16 v25, 0x41900000    # 18.0f

    .line 131
    .line 132
    const/high16 v26, 0x41300000    # 11.0f

    .line 133
    .line 134
    const v21, 0x41a6147b    # 20.76f

    .line 135
    .line 136
    .line 137
    const/high16 v22, 0x41300000    # 11.0f

    .line 138
    .line 139
    const v23, 0x4199999a    # 19.2f

    .line 140
    .line 141
    .line 142
    const/high16 v24, 0x41300000    # 11.0f

    .line 143
    .line 144
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    const/16 v16, 0x3800

    .line 155
    .line 156
    const/16 v17, 0x0

    .line 157
    .line 158
    const/high16 v6, 0x3f800000    # 1.0f

    .line 159
    .line 160
    const/high16 v8, 0x3f800000    # 1.0f

    .line 161
    .line 162
    const/4 v7, 0x0

    .line 163
    const/high16 v9, 0x3f800000    # 1.0f

    .line 164
    .line 165
    const/high16 v12, 0x3f800000    # 1.0f

    .line 166
    .line 167
    const/4 v13, 0x0

    .line 168
    const/4 v14, 0x0

    .line 169
    const/4 v15, 0x0

    .line 170
    const-string v4, ""

    .line 171
    .line 172
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 173
    .line 174
    .line 175
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 180
    .line 181
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 182
    .line 183
    .line 184
    move-result-wide v6

    .line 185
    const/4 v2, 0x0

    .line 186
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 190
    .line 191
    .line 192
    move-result v10

    .line 193
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 194
    .line 195
    .line 196
    move-result v11

    .line 197
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 200
    .line 201
    .line 202
    const/high16 v4, 0x41800000    # 16.0f

    .line 203
    .line 204
    const v6, 0x418ce148    # 17.61f

    .line 205
    .line 206
    .line 207
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v25, 0x404ccccd    # 3.2f

    .line 211
    .line 212
    .line 213
    const v26, 0x4018f5c3    # 2.39f

    .line 214
    .line 215
    .line 216
    const v21, 0x3f75c28f    # 0.96f

    .line 217
    .line 218
    .line 219
    const v22, 0x3f35c28f    # 0.71f

    .line 220
    .line 221
    .line 222
    const v23, 0x400d70a4    # 2.21f

    .line 223
    .line 224
    .line 225
    const v24, 0x3fd33333    # 1.65f

    .line 226
    .line 227
    .line 228
    move-object/from16 v20, v2

    .line 229
    .line 230
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v25, 0x3f99999a    # 1.2f

    .line 234
    .line 235
    .line 236
    const v26, -0x40333333    # -1.6f

    .line 237
    .line 238
    .line 239
    const v21, 0x3ecccccd    # 0.4f

    .line 240
    .line 241
    .line 242
    const v22, -0x40f851ec    # -0.53f

    .line 243
    .line 244
    .line 245
    const v23, 0x3f4ccccd    # 0.8f

    .line 246
    .line 247
    .line 248
    const v24, -0x40770a3d    # -1.07f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v25, -0x3fb33333    # -3.2f

    .line 255
    .line 256
    .line 257
    const v26, -0x3fe66666    # -2.4f

    .line 258
    .line 259
    .line 260
    const v21, -0x40828f5c    # -0.99f

    .line 261
    .line 262
    .line 263
    const v22, -0x40c28f5c    # -0.74f

    .line 264
    .line 265
    .line 266
    const v23, -0x3ff0a3d7    # -2.24f

    .line 267
    .line 268
    .line 269
    const v24, -0x4028f5c3    # -1.68f

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v25, 0x41800000    # 16.0f

    .line 276
    .line 277
    const v26, 0x418ce148    # 17.61f

    .line 278
    .line 279
    .line 280
    const v21, 0x41866666    # 16.8f

    .line 281
    .line 282
    .line 283
    const v22, 0x418451ec    # 16.54f

    .line 284
    .line 285
    .line 286
    const v23, 0x41833333    # 16.4f

    .line 287
    .line 288
    .line 289
    const v24, 0x4188a3d7    # 17.08f

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    const/high16 v6, 0x3f800000    # 1.0f

    .line 303
    .line 304
    const/4 v7, 0x0

    .line 305
    const-string v4, ""

    .line 306
    .line 307
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 308
    .line 309
    .line 310
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 311
    .line 312
    .line 313
    move-result v3

    .line 314
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 315
    .line 316
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 317
    .line 318
    .line 319
    move-result-wide v6

    .line 320
    const/4 v2, 0x0

    .line 321
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 325
    .line 326
    .line 327
    move-result v10

    .line 328
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 329
    .line 330
    .line 331
    move-result v11

    .line 332
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 335
    .line 336
    .line 337
    const v4, 0x41a33333    # 20.4f

    .line 338
    .line 339
    .line 340
    const v6, 0x40b33333    # 5.6f

    .line 341
    .line 342
    .line 343
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v25, 0x4199999a    # 19.2f

    .line 347
    .line 348
    .line 349
    const/high16 v26, 0x40800000    # 4.0f

    .line 350
    .line 351
    const/high16 v21, 0x41a00000    # 20.0f

    .line 352
    .line 353
    const v22, 0x40a23d71    # 5.07f

    .line 354
    .line 355
    .line 356
    const v23, 0x419ccccd    # 19.6f

    .line 357
    .line 358
    .line 359
    const v24, 0x4090f5c3    # 4.53f

    .line 360
    .line 361
    .line 362
    move-object/from16 v20, v2

    .line 363
    .line 364
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v25, -0x3fb33333    # -3.2f

    .line 368
    .line 369
    .line 370
    const v26, 0x4019999a    # 2.4f

    .line 371
    .line 372
    .line 373
    const v21, -0x40828f5c    # -0.99f

    .line 374
    .line 375
    .line 376
    const v22, 0x3f3d70a4    # 0.74f

    .line 377
    .line 378
    .line 379
    const v23, -0x3ff0a3d7    # -2.24f

    .line 380
    .line 381
    .line 382
    const v24, 0x3fd70a3d    # 1.68f

    .line 383
    .line 384
    .line 385
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v25, 0x3f99999a    # 1.2f

    .line 389
    .line 390
    .line 391
    const v26, 0x3fcccccd    # 1.6f

    .line 392
    .line 393
    .line 394
    const v21, 0x3ecccccd    # 0.4f

    .line 395
    .line 396
    .line 397
    const v22, 0x3f07ae14    # 0.53f

    .line 398
    .line 399
    .line 400
    const v23, 0x3f4ccccd    # 0.8f

    .line 401
    .line 402
    .line 403
    const v24, 0x3f88f5c3    # 1.07f

    .line 404
    .line 405
    .line 406
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v25, 0x41a33333    # 20.4f

    .line 410
    .line 411
    .line 412
    const v26, 0x40b33333    # 5.6f

    .line 413
    .line 414
    .line 415
    const v21, 0x419147ae    # 18.16f

    .line 416
    .line 417
    .line 418
    const v22, 0x40e8f5c3    # 7.28f

    .line 419
    .line 420
    .line 421
    const v23, 0x419b47ae    # 19.41f

    .line 422
    .line 423
    .line 424
    const v24, 0x40cb3333    # 6.35f

    .line 425
    .line 426
    .line 427
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 434
    .line 435
    .line 436
    move-result-object v2

    .line 437
    const/high16 v6, 0x3f800000    # 1.0f

    .line 438
    .line 439
    const/4 v7, 0x0

    .line 440
    const-string v4, ""

    .line 441
    .line 442
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 443
    .line 444
    .line 445
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 446
    .line 447
    .line 448
    move-result v3

    .line 449
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 450
    .line 451
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 452
    .line 453
    .line 454
    move-result-wide v6

    .line 455
    const/4 v2, 0x0

    .line 456
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 457
    .line 458
    .line 459
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 460
    .line 461
    .line 462
    move-result v10

    .line 463
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 464
    .line 465
    .line 466
    move-result v11

    .line 467
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 470
    .line 471
    .line 472
    const/high16 v4, 0x41100000    # 9.0f

    .line 473
    .line 474
    const/high16 v6, 0x40800000    # 4.0f

    .line 475
    .line 476
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const/high16 v25, -0x40000000    # -2.0f

    .line 480
    .line 481
    const/high16 v26, 0x40000000    # 2.0f

    .line 482
    .line 483
    const v21, -0x40733333    # -1.1f

    .line 484
    .line 485
    .line 486
    const/16 v22, 0x0

    .line 487
    .line 488
    const/high16 v23, -0x40000000    # -2.0f

    .line 489
    .line 490
    const v24, 0x3f666666    # 0.9f

    .line 491
    .line 492
    .line 493
    move-object/from16 v20, v2

    .line 494
    .line 495
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const/high16 v4, 0x40000000    # 2.0f

    .line 499
    .line 500
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const/high16 v25, 0x40000000    # 2.0f

    .line 504
    .line 505
    const/16 v21, 0x0

    .line 506
    .line 507
    const v22, 0x3f8ccccd    # 1.1f

    .line 508
    .line 509
    .line 510
    const v23, 0x3f666666    # 0.9f

    .line 511
    .line 512
    .line 513
    const/high16 v24, 0x40000000    # 2.0f

    .line 514
    .line 515
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const/high16 v4, 0x3f800000    # 1.0f

    .line 519
    .line 520
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const/high16 v4, 0x40800000    # 4.0f

    .line 524
    .line 525
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const/high16 v4, 0x40000000    # 2.0f

    .line 529
    .line 530
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const/high16 v4, -0x3f800000    # -4.0f

    .line 534
    .line 535
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const/high16 v4, 0x3f800000    # 1.0f

    .line 539
    .line 540
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const/high16 v4, 0x40a00000    # 5.0f

    .line 544
    .line 545
    const/high16 v6, 0x40400000    # 3.0f

    .line 546
    .line 547
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const/high16 v4, 0x40c00000    # 6.0f

    .line 551
    .line 552
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const/high16 v4, 0x41100000    # 9.0f

    .line 556
    .line 557
    const/high16 v6, 0x41000000    # 8.0f

    .line 558
    .line 559
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const/high16 v4, 0x40800000    # 4.0f

    .line 563
    .line 564
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const v4, 0x412b5c29    # 10.71f

    .line 571
    .line 572
    .line 573
    const v6, 0x41107ae1    # 9.03f

    .line 574
    .line 575
    .line 576
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const v4, 0x41187ae1    # 9.53f

    .line 580
    .line 581
    .line 582
    const/high16 v6, 0x41300000    # 11.0f

    .line 583
    .line 584
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const v4, 0x409e147b    # 4.94f

    .line 588
    .line 589
    .line 590
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const v4, -0x4068f5c3    # -1.18f

    .line 594
    .line 595
    .line 596
    const v6, -0x4003d70a    # -1.97f

    .line 597
    .line 598
    .line 599
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const/high16 v4, 0x41500000    # 13.0f

    .line 603
    .line 604
    const v6, 0x4108cccd    # 8.55f

    .line 605
    .line 606
    .line 607
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const/high16 v4, 0x41000000    # 8.0f

    .line 611
    .line 612
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const/high16 v4, 0x40800000    # 4.0f

    .line 616
    .line 617
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const/high16 v4, -0x40000000    # -2.0f

    .line 621
    .line 622
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const/high16 v4, 0x40800000    # 4.0f

    .line 626
    .line 627
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    const v4, 0x3f0ccccd    # 0.55f

    .line 631
    .line 632
    .line 633
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const v4, 0x412b5c29    # 10.71f

    .line 637
    .line 638
    .line 639
    const v6, 0x41107ae1    # 9.03f

    .line 640
    .line 641
    .line 642
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 649
    .line 650
    .line 651
    move-result-object v2

    .line 652
    const/high16 v6, 0x3f800000    # 1.0f

    .line 653
    .line 654
    const/4 v7, 0x0

    .line 655
    const-string v4, ""

    .line 656
    .line 657
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 658
    .line 659
    .line 660
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 661
    .line 662
    .line 663
    move-result v3

    .line 664
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 665
    .line 666
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 667
    .line 668
    .line 669
    move-result-wide v6

    .line 670
    const/4 v2, 0x0

    .line 671
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 672
    .line 673
    .line 674
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 675
    .line 676
    .line 677
    move-result v10

    .line 678
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 679
    .line 680
    .line 681
    move-result v11

    .line 682
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 683
    .line 684
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 685
    .line 686
    .line 687
    const/high16 v4, 0x41780000    # 15.5f

    .line 688
    .line 689
    const/high16 v6, 0x41400000    # 12.0f

    .line 690
    .line 691
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 692
    .line 693
    .line 694
    const/high16 v25, -0x40400000    # -1.5f

    .line 695
    .line 696
    const v26, -0x3fa9999a    # -3.35f

    .line 697
    .line 698
    .line 699
    const v22, -0x4055c28f    # -1.33f

    .line 700
    .line 701
    .line 702
    const v23, -0x40eb851f    # -0.58f

    .line 703
    .line 704
    .line 705
    const v24, -0x3fde147b    # -2.53f

    .line 706
    .line 707
    .line 708
    move-object/from16 v20, v2

    .line 709
    .line 710
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 711
    .line 712
    .line 713
    const v4, 0x40d6147b    # 6.69f

    .line 714
    .line 715
    .line 716
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 717
    .line 718
    .line 719
    const/high16 v25, 0x41780000    # 15.5f

    .line 720
    .line 721
    const/high16 v26, 0x41400000    # 12.0f

    .line 722
    .line 723
    const v21, 0x416eb852    # 14.92f

    .line 724
    .line 725
    .line 726
    const v22, 0x41687ae1    # 14.53f

    .line 727
    .line 728
    .line 729
    const/high16 v23, 0x41780000    # 15.5f

    .line 730
    .line 731
    const v24, 0x415547ae    # 13.33f

    .line 732
    .line 733
    .line 734
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 735
    .line 736
    .line 737
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 741
    .line 742
    .line 743
    move-result-object v2

    .line 744
    const/high16 v6, 0x3f800000    # 1.0f

    .line 745
    .line 746
    const/4 v7, 0x0

    .line 747
    const-string v4, ""

    .line 748
    .line 749
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 750
    .line 751
    .line 752
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 753
    .line 754
    .line 755
    move-result v3

    .line 756
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 757
    .line 758
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 759
    .line 760
    .line 761
    move-result-wide v6

    .line 762
    const/4 v0, 0x0

    .line 763
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 764
    .line 765
    .line 766
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 767
    .line 768
    .line 769
    move-result v10

    .line 770
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 771
    .line 772
    .line 773
    move-result v11

    .line 774
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 775
    .line 776
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 777
    .line 778
    .line 779
    const v2, 0x412b5c29    # 10.71f

    .line 780
    .line 781
    .line 782
    const v4, 0x41107ae1    # 9.03f

    .line 783
    .line 784
    .line 785
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 786
    .line 787
    .line 788
    const v2, 0x41187ae1    # 9.53f

    .line 789
    .line 790
    .line 791
    const/high16 v4, 0x41300000    # 11.0f

    .line 792
    .line 793
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 794
    .line 795
    .line 796
    const v2, 0x409e147b    # 4.94f

    .line 797
    .line 798
    .line 799
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 800
    .line 801
    .line 802
    const v2, -0x4068f5c3    # -1.18f

    .line 803
    .line 804
    .line 805
    const v4, -0x4003d70a    # -1.97f

    .line 806
    .line 807
    .line 808
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 809
    .line 810
    .line 811
    const/high16 v2, 0x41500000    # 13.0f

    .line 812
    .line 813
    const v4, 0x4108cccd    # 8.55f

    .line 814
    .line 815
    .line 816
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 817
    .line 818
    .line 819
    const/high16 v2, 0x41000000    # 8.0f

    .line 820
    .line 821
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 822
    .line 823
    .line 824
    const/high16 v2, 0x40800000    # 4.0f

    .line 825
    .line 826
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 827
    .line 828
    .line 829
    const/high16 v2, -0x40000000    # -2.0f

    .line 830
    .line 831
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 832
    .line 833
    .line 834
    const/high16 v2, 0x40800000    # 4.0f

    .line 835
    .line 836
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 837
    .line 838
    .line 839
    const v2, 0x3f0ccccd    # 0.55f

    .line 840
    .line 841
    .line 842
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 843
    .line 844
    .line 845
    const v2, 0x412b5c29    # 10.71f

    .line 846
    .line 847
    .line 848
    const v4, 0x41107ae1    # 9.03f

    .line 849
    .line 850
    .line 851
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 852
    .line 853
    .line 854
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 855
    .line 856
    .line 857
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 858
    .line 859
    .line 860
    move-result-object v2

    .line 861
    const v6, 0x3e99999a    # 0.3f

    .line 862
    .line 863
    .line 864
    const v8, 0x3e99999a    # 0.3f

    .line 865
    .line 866
    .line 867
    const/4 v7, 0x0

    .line 868
    const-string v4, ""

    .line 869
    .line 870
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 871
    .line 872
    .line 873
    move-result-object v0

    .line 874
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 875
    .line 876
    .line 877
    move-result-object v0

    .line 878
    sput-object v0, Landroidx/compose/material/icons/twotone/CampaignKt;->_campaign:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 879
    .line 880
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 881
    .line 882
    .line 883
    return-object v0
.end method
