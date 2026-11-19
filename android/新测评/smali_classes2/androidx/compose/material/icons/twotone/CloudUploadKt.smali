.class public final Landroidx/compose/material/icons/twotone/CloudUploadKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_cloudUpload",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "CloudUpload",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getCloudUpload",
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
        "SMAP\nCloudUpload.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloudUpload.kt\nandroidx/compose/material/icons/twotone/CloudUploadKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,91:1\n212#2,12:92\n233#2,18:105\n253#2:142\n233#2,18:143\n253#2:180\n174#3:104\n705#4,2:123\n717#4,2:125\n719#4,11:131\n705#4,2:161\n717#4,2:163\n719#4,11:169\n72#5,4:127\n72#5,4:165\n*S KotlinDebug\n*F\n+ 1 CloudUpload.kt\nandroidx/compose/material/icons/twotone/CloudUploadKt\n*L\n29#1:92,12\n30#1:105,18\n30#1:142\n54#1:143,18\n54#1:180\n29#1:104\n30#1:123,2\n30#1:125,2\n30#1:131,11\n54#1:161,2\n54#1:163,2\n54#1:169,11\n30#1:127,4\n54#1:165,4\n*E\n"
    }
.end annotation


# static fields
.field private static _cloudUpload:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCloudUpload(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/CloudUploadKt;->_cloudUpload:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.CloudUpload"

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
    const v4, 0x4199ae14    # 19.21f

    .line 71
    .line 72
    .line 73
    const v6, 0x4140a3d7    # 12.04f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, -0x403c28f6    # -1.53f

    .line 80
    .line 81
    .line 82
    const v6, -0x421eb852    # -0.11f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v4, -0x41666666    # -0.3f

    .line 89
    .line 90
    .line 91
    const/high16 v6, -0x40400000    # -1.5f

    .line 92
    .line 93
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v25, 0x41400000    # 12.0f

    .line 97
    .line 98
    const/high16 v26, 0x40c00000    # 6.0f

    .line 99
    .line 100
    const v21, 0x41870a3d    # 16.88f

    .line 101
    .line 102
    .line 103
    const v22, 0x40fb851f    # 7.86f

    .line 104
    .line 105
    .line 106
    const v23, 0x4169eb85    # 14.62f

    .line 107
    .line 108
    .line 109
    const/high16 v24, 0x40c00000    # 6.0f

    .line 110
    .line 111
    move-object/from16 v20, v2

    .line 112
    .line 113
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v25, 0x40e3d70a    # 7.12f

    .line 117
    .line 118
    .line 119
    const v26, 0x410f5c29    # 8.96f

    .line 120
    .line 121
    .line 122
    const v21, 0x411f0a3d    # 9.94f

    .line 123
    .line 124
    .line 125
    const/high16 v22, 0x40c00000    # 6.0f

    .line 126
    .line 127
    const v23, 0x410147ae    # 8.08f

    .line 128
    .line 129
    .line 130
    const v24, 0x40e47ae1    # 7.14f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v4, -0x41000000    # -0.5f

    .line 137
    .line 138
    const v6, 0x3f733333    # 0.95f

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v4, -0x40770a3d    # -1.07f

    .line 145
    .line 146
    .line 147
    const v6, 0x3de147ae    # 0.11f

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/high16 v25, 0x40000000    # 2.0f

    .line 154
    .line 155
    const/high16 v26, 0x41600000    # 14.0f

    .line 156
    .line 157
    const v21, 0x4061eb85    # 3.53f

    .line 158
    .line 159
    .line 160
    const v22, 0x4123d70a    # 10.24f

    .line 161
    .line 162
    .line 163
    const/high16 v23, 0x40000000    # 2.0f

    .line 164
    .line 165
    const v24, 0x413f3333    # 11.95f

    .line 166
    .line 167
    .line 168
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v25, 0x40800000    # 4.0f

    .line 172
    .line 173
    const/high16 v26, 0x40800000    # 4.0f

    .line 174
    .line 175
    const/16 v21, 0x0

    .line 176
    .line 177
    const v22, 0x400d70a4    # 2.21f

    .line 178
    .line 179
    .line 180
    const v23, 0x3fe51eb8    # 1.79f

    .line 181
    .line 182
    .line 183
    const/high16 v24, 0x40800000    # 4.0f

    .line 184
    .line 185
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v4, 0x41500000    # 13.0f

    .line 189
    .line 190
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v25, 0x40400000    # 3.0f

    .line 194
    .line 195
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 196
    .line 197
    const v21, 0x3fd33333    # 1.65f

    .line 198
    .line 199
    .line 200
    const/16 v22, 0x0

    .line 201
    .line 202
    const/high16 v23, 0x40400000    # 3.0f

    .line 203
    .line 204
    const v24, -0x40533333    # -1.35f

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v25, -0x3fcd70a4    # -2.79f

    .line 211
    .line 212
    .line 213
    const v26, -0x3fc28f5c    # -2.96f

    .line 214
    .line 215
    .line 216
    const/16 v21, 0x0

    .line 217
    .line 218
    const v22, -0x4039999a    # -1.55f

    .line 219
    .line 220
    .line 221
    const v23, -0x4063d70a    # -1.22f

    .line 222
    .line 223
    .line 224
    const v24, -0x3fc8f5c3    # -2.86f

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v4, 0x41573333    # 13.45f

    .line 234
    .line 235
    .line 236
    const/high16 v6, 0x41500000    # 13.0f

    .line 237
    .line 238
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const/high16 v4, 0x40400000    # 3.0f

    .line 242
    .line 243
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v4, -0x3fc5c28f    # -2.91f

    .line 247
    .line 248
    .line 249
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 253
    .line 254
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const/high16 v4, 0x41000000    # 8.0f

    .line 258
    .line 259
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v4, -0x3f800000    # -4.0f

    .line 263
    .line 264
    const/high16 v6, 0x40800000    # 4.0f

    .line 265
    .line 266
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/high16 v4, 0x40800000    # 4.0f

    .line 270
    .line 271
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v4, -0x3fdccccd    # -2.55f

    .line 275
    .line 276
    .line 277
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 284
    .line 285
    .line 286
    move-result-object v2

    .line 287
    const/16 v16, 0x3800

    .line 288
    .line 289
    const/16 v17, 0x0

    .line 290
    .line 291
    const v6, 0x3e99999a    # 0.3f

    .line 292
    .line 293
    .line 294
    const v8, 0x3e99999a    # 0.3f

    .line 295
    .line 296
    .line 297
    const/4 v7, 0x0

    .line 298
    const/high16 v9, 0x3f800000    # 1.0f

    .line 299
    .line 300
    const/high16 v12, 0x3f800000    # 1.0f

    .line 301
    .line 302
    const/4 v13, 0x0

    .line 303
    const/4 v14, 0x0

    .line 304
    const/4 v15, 0x0

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
    const/4 v0, 0x0

    .line 321
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 335
    .line 336
    .line 337
    const v0, 0x419acccd    # 19.35f

    .line 338
    .line 339
    .line 340
    const v2, 0x4120a3d7    # 10.04f

    .line 341
    .line 342
    .line 343
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const/high16 v17, 0x41400000    # 12.0f

    .line 347
    .line 348
    const/high16 v18, 0x40800000    # 4.0f

    .line 349
    .line 350
    const v13, 0x41955c29    # 18.67f

    .line 351
    .line 352
    .line 353
    const v14, 0x40d2e148    # 6.59f

    .line 354
    .line 355
    .line 356
    const v15, 0x417a3d71    # 15.64f

    .line 357
    .line 358
    .line 359
    const/high16 v16, 0x40800000    # 4.0f

    .line 360
    .line 361
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const v17, 0x40ab3333    # 5.35f

    .line 365
    .line 366
    .line 367
    const v18, 0x4100a3d7    # 8.04f

    .line 368
    .line 369
    .line 370
    const v13, 0x4111c28f    # 9.11f

    .line 371
    .line 372
    .line 373
    const/high16 v14, 0x40800000    # 4.0f

    .line 374
    .line 375
    const v15, 0x40d33333    # 6.6f

    .line 376
    .line 377
    .line 378
    const v16, 0x40b47ae1    # 5.64f

    .line 379
    .line 380
    .line 381
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/16 v17, 0x0

    .line 385
    .line 386
    const/high16 v18, 0x41600000    # 14.0f

    .line 387
    .line 388
    const v13, 0x4015c28f    # 2.34f

    .line 389
    .line 390
    .line 391
    const v14, 0x4105c28f    # 8.36f

    .line 392
    .line 393
    .line 394
    const/4 v15, 0x0

    .line 395
    const v16, 0x412e8f5c    # 10.91f

    .line 396
    .line 397
    .line 398
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/high16 v17, 0x40c00000    # 6.0f

    .line 402
    .line 403
    const/high16 v18, 0x40c00000    # 6.0f

    .line 404
    .line 405
    const/4 v13, 0x0

    .line 406
    const v14, 0x4053d70a    # 3.31f

    .line 407
    .line 408
    .line 409
    const v15, 0x402c28f6    # 2.69f

    .line 410
    .line 411
    .line 412
    const/high16 v16, 0x40c00000    # 6.0f

    .line 413
    .line 414
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const/high16 v0, 0x41500000    # 13.0f

    .line 418
    .line 419
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const/high16 v17, 0x40a00000    # 5.0f

    .line 423
    .line 424
    const/high16 v18, -0x3f600000    # -5.0f

    .line 425
    .line 426
    const v13, 0x4030a3d7    # 2.76f

    .line 427
    .line 428
    .line 429
    const/4 v14, 0x0

    .line 430
    const/high16 v15, 0x40a00000    # 5.0f

    .line 431
    .line 432
    const v16, -0x3ff0a3d7    # -2.24f

    .line 433
    .line 434
    .line 435
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v17, -0x3f6b3333    # -4.65f

    .line 439
    .line 440
    .line 441
    const v18, -0x3f6147ae    # -4.96f

    .line 442
    .line 443
    .line 444
    const/4 v13, 0x0

    .line 445
    const v14, -0x3fd70a3d    # -2.64f

    .line 446
    .line 447
    .line 448
    const v15, -0x3ffccccd    # -2.05f

    .line 449
    .line 450
    .line 451
    const v16, -0x3f670a3d    # -4.78f

    .line 452
    .line 453
    .line 454
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const/high16 v0, 0x41980000    # 19.0f

    .line 461
    .line 462
    const/high16 v2, 0x41900000    # 18.0f

    .line 463
    .line 464
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const/high16 v0, 0x40c00000    # 6.0f

    .line 468
    .line 469
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const/high16 v17, -0x3f800000    # -4.0f

    .line 473
    .line 474
    const/high16 v18, -0x3f800000    # -4.0f

    .line 475
    .line 476
    const v13, -0x3ff28f5c    # -2.21f

    .line 477
    .line 478
    .line 479
    const/4 v14, 0x0

    .line 480
    const/high16 v15, -0x3f800000    # -4.0f

    .line 481
    .line 482
    const v16, -0x401ae148    # -1.79f

    .line 483
    .line 484
    .line 485
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const v17, 0x4063d70a    # 3.56f

    .line 489
    .line 490
    .line 491
    const v18, -0x3f81eb85    # -3.97f

    .line 492
    .line 493
    .line 494
    const/4 v13, 0x0

    .line 495
    const v14, -0x3ffccccd    # -2.05f

    .line 496
    .line 497
    .line 498
    const v15, 0x3fc3d70a    # 1.53f

    .line 499
    .line 500
    .line 501
    const v16, -0x3f8f5c29    # -3.76f

    .line 502
    .line 503
    .line 504
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const v0, 0x3f88f5c3    # 1.07f

    .line 508
    .line 509
    .line 510
    const v2, -0x421eb852    # -0.11f

    .line 511
    .line 512
    .line 513
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const/high16 v0, 0x3f000000    # 0.5f

    .line 517
    .line 518
    const v2, -0x408ccccd    # -0.95f

    .line 519
    .line 520
    .line 521
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const/high16 v17, 0x41400000    # 12.0f

    .line 525
    .line 526
    const/high16 v18, 0x40c00000    # 6.0f

    .line 527
    .line 528
    const v13, 0x410147ae    # 8.08f

    .line 529
    .line 530
    .line 531
    const v14, 0x40e47ae1    # 7.14f

    .line 532
    .line 533
    .line 534
    const v15, 0x411f0a3d    # 9.94f

    .line 535
    .line 536
    .line 537
    const/high16 v16, 0x40c00000    # 6.0f

    .line 538
    .line 539
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const v17, 0x40ac7ae1    # 5.39f

    .line 543
    .line 544
    .line 545
    const v18, 0x408dc28f    # 4.43f

    .line 546
    .line 547
    .line 548
    const v13, 0x4027ae14    # 2.62f

    .line 549
    .line 550
    .line 551
    const/4 v14, 0x0

    .line 552
    const v15, 0x409c28f6    # 4.88f

    .line 553
    .line 554
    .line 555
    const v16, 0x3fee147b    # 1.86f

    .line 556
    .line 557
    .line 558
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const v0, 0x3e99999a    # 0.3f

    .line 562
    .line 563
    .line 564
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 565
    .line 566
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const v0, 0x3fc3d70a    # 1.53f

    .line 570
    .line 571
    .line 572
    const v2, 0x3de147ae    # 0.11f

    .line 573
    .line 574
    .line 575
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const v17, 0x4031eb85    # 2.78f

    .line 579
    .line 580
    .line 581
    const v18, 0x403d70a4    # 2.96f

    .line 582
    .line 583
    .line 584
    const v13, 0x3fc7ae14    # 1.56f

    .line 585
    .line 586
    .line 587
    const v14, 0x3dcccccd    # 0.1f

    .line 588
    .line 589
    .line 590
    const v15, 0x4031eb85    # 2.78f

    .line 591
    .line 592
    .line 593
    const v16, 0x3fb47ae1    # 1.41f

    .line 594
    .line 595
    .line 596
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 600
    .line 601
    const/high16 v18, 0x40400000    # 3.0f

    .line 602
    .line 603
    const/4 v13, 0x0

    .line 604
    const v14, 0x3fd33333    # 1.65f

    .line 605
    .line 606
    .line 607
    const v15, -0x40533333    # -1.35f

    .line 608
    .line 609
    .line 610
    const/high16 v16, 0x40400000    # 3.0f

    .line 611
    .line 612
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const/high16 v0, 0x41000000    # 8.0f

    .line 619
    .line 620
    const/high16 v2, 0x41500000    # 13.0f

    .line 621
    .line 622
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const v0, 0x40233333    # 2.55f

    .line 626
    .line 627
    .line 628
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    const/high16 v0, 0x40400000    # 3.0f

    .line 632
    .line 633
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const v0, 0x4039999a    # 2.9f

    .line 637
    .line 638
    .line 639
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 643
    .line 644
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    const/high16 v0, 0x41800000    # 16.0f

    .line 648
    .line 649
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    const/high16 v0, -0x3f800000    # -4.0f

    .line 653
    .line 654
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 661
    .line 662
    .line 663
    move-result-object v2

    .line 664
    const/16 v16, 0x3800

    .line 665
    .line 666
    const/16 v17, 0x0

    .line 667
    .line 668
    const/high16 v6, 0x3f800000    # 1.0f

    .line 669
    .line 670
    const/high16 v8, 0x3f800000    # 1.0f

    .line 671
    .line 672
    const/4 v7, 0x0

    .line 673
    const/high16 v12, 0x3f800000    # 1.0f

    .line 674
    .line 675
    const/4 v14, 0x0

    .line 676
    const/4 v15, 0x0

    .line 677
    const-string v4, ""

    .line 678
    .line 679
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 680
    .line 681
    .line 682
    move-result-object v0

    .line 683
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 684
    .line 685
    .line 686
    move-result-object v0

    .line 687
    sput-object v0, Landroidx/compose/material/icons/twotone/CloudUploadKt;->_cloudUpload:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 688
    .line 689
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 690
    .line 691
    .line 692
    return-object v0
.end method
