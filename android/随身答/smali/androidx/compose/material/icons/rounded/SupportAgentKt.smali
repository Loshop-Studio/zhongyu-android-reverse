.class public final Landroidx/compose/material/icons/rounded/SupportAgentKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_supportAgent",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SupportAgent",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getSupportAgent",
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
        "SMAP\nSupportAgent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportAgent.kt\nandroidx/compose/material/icons/rounded/SupportAgentKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,80:1\n212#2,12:81\n233#2,18:94\n253#2:131\n233#2,18:132\n253#2:169\n233#2,18:170\n253#2:207\n233#2,18:208\n253#2:245\n174#3:93\n705#4,2:112\n717#4,2:114\n719#4,11:120\n705#4,2:150\n717#4,2:152\n719#4,11:158\n705#4,2:188\n717#4,2:190\n719#4,11:196\n705#4,2:226\n717#4,2:228\n719#4,11:234\n72#5,4:116\n72#5,4:154\n72#5,4:192\n72#5,4:230\n*S KotlinDebug\n*F\n+ 1 SupportAgent.kt\nandroidx/compose/material/icons/rounded/SupportAgentKt\n*L\n29#1:81,12\n30#1:94,18\n30#1:131\n55#1:132,18\n55#1:169\n61#1:170,18\n61#1:207\n67#1:208,18\n67#1:245\n29#1:93\n30#1:112,2\n30#1:114,2\n30#1:120,11\n55#1:150,2\n55#1:152,2\n55#1:158,11\n61#1:188,2\n61#1:190,2\n61#1:196,11\n67#1:226,2\n67#1:228,2\n67#1:234,11\n30#1:116,4\n55#1:154,4\n61#1:192,4\n67#1:230,4\n*E\n"
    }
.end annotation


# static fields
.field private static _supportAgent:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSupportAgent(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SupportAgentKt;->_supportAgent:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SupportAgent"

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
    const/high16 v4, 0x41a80000    # 21.0f

    .line 71
    .line 72
    const v6, 0x4143851f    # 12.22f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v25, 0x41400000    # 12.0f

    .line 79
    .line 80
    const/high16 v26, 0x40400000    # 3.0f

    .line 81
    .line 82
    const/high16 v21, 0x41a80000    # 21.0f

    .line 83
    .line 84
    const v22, 0x40d75c29    # 6.73f

    .line 85
    .line 86
    .line 87
    const v23, 0x4185eb85    # 16.74f

    .line 88
    .line 89
    .line 90
    const/high16 v24, 0x40400000    # 3.0f

    .line 91
    .line 92
    move-object/from16 v20, v2

    .line 93
    .line 94
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v25, -0x3ef00000    # -9.0f

    .line 98
    .line 99
    const v26, 0x41147ae1    # 9.28f

    .line 100
    .line 101
    .line 102
    const v21, -0x3f69eb85    # -4.69f

    .line 103
    .line 104
    .line 105
    const/16 v22, 0x0

    .line 106
    .line 107
    const/high16 v23, -0x3ef00000    # -9.0f

    .line 108
    .line 109
    const v24, 0x4069999a    # 3.65f

    .line 110
    .line 111
    .line 112
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v25, 0x40000000    # 2.0f

    .line 116
    .line 117
    const/high16 v26, 0x41600000    # 14.0f

    .line 118
    .line 119
    const v21, 0x4019999a    # 2.4f

    .line 120
    .line 121
    .line 122
    const v22, 0x4149eb85    # 12.62f

    .line 123
    .line 124
    .line 125
    const/high16 v23, 0x40000000    # 2.0f

    .line 126
    .line 127
    const v24, 0x415428f6    # 13.26f

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v4, 0x40000000    # 2.0f

    .line 134
    .line 135
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v26, 0x40000000    # 2.0f

    .line 139
    .line 140
    const/16 v21, 0x0

    .line 141
    .line 142
    const v22, 0x3f8ccccd    # 1.1f

    .line 143
    .line 144
    .line 145
    const v23, 0x3f666666    # 0.9f

    .line 146
    .line 147
    .line 148
    const/high16 v24, 0x40000000    # 2.0f

    .line 149
    .line 150
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/4 v4, 0x0

    .line 154
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const/high16 v25, 0x3f800000    # 1.0f

    .line 158
    .line 159
    const/high16 v26, -0x40800000    # -1.0f

    .line 160
    .line 161
    const v21, 0x3f0ccccd    # 0.55f

    .line 162
    .line 163
    .line 164
    const/16 v22, 0x0

    .line 165
    .line 166
    const/high16 v23, 0x3f800000    # 1.0f

    .line 167
    .line 168
    const v24, -0x4119999a    # -0.45f

    .line 169
    .line 170
    .line 171
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v4, -0x3f66147b    # -4.81f

    .line 175
    .line 176
    .line 177
    const/4 v6, 0x0

    .line 178
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v25, 0x40d8f5c3    # 6.78f

    .line 182
    .line 183
    .line 184
    const v26, -0x3f16b852    # -7.29f

    .line 185
    .line 186
    .line 187
    const/16 v21, 0x0

    .line 188
    .line 189
    const v22, -0x3f8ae148    # -3.83f

    .line 190
    .line 191
    .line 192
    const v23, 0x403ccccd    # 2.95f

    .line 193
    .line 194
    .line 195
    const v24, -0x3f1a3d71    # -7.18f

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v25, 0x40e70a3d    # 7.22f

    .line 202
    .line 203
    .line 204
    const/high16 v26, 0x40e00000    # 7.0f

    .line 205
    .line 206
    const v21, 0x407d70a4    # 3.96f

    .line 207
    .line 208
    .line 209
    const v22, -0x420a3d71    # -0.12f

    .line 210
    .line 211
    .line 212
    const v23, 0x40e70a3d    # 7.22f

    .line 213
    .line 214
    .line 215
    const v24, 0x4043d70a    # 3.06f

    .line 216
    .line 217
    .line 218
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v4, 0x41980000    # 19.0f

    .line 222
    .line 223
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v4, -0x3f200000    # -7.0f

    .line 227
    .line 228
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const/high16 v25, -0x40800000    # -1.0f

    .line 232
    .line 233
    const/high16 v26, 0x3f800000    # 1.0f

    .line 234
    .line 235
    const v21, -0x40f33333    # -0.55f

    .line 236
    .line 237
    .line 238
    const/16 v22, 0x0

    .line 239
    .line 240
    const/high16 v23, -0x40800000    # -1.0f

    .line 241
    .line 242
    const v24, 0x3ee66666    # 0.45f

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const/4 v4, 0x0

    .line 249
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v25, 0x3f800000    # 1.0f

    .line 253
    .line 254
    const/16 v21, 0x0

    .line 255
    .line 256
    const v22, 0x3f0ccccd    # 0.55f

    .line 257
    .line 258
    .line 259
    const v23, 0x3ee66666    # 0.45f

    .line 260
    .line 261
    .line 262
    const/high16 v24, 0x3f800000    # 1.0f

    .line 263
    .line 264
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/high16 v4, 0x40e00000    # 7.0f

    .line 268
    .line 269
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v25, 0x40000000    # 2.0f

    .line 273
    .line 274
    const/high16 v26, -0x40000000    # -2.0f

    .line 275
    .line 276
    const v21, 0x3f8ccccd    # 1.1f

    .line 277
    .line 278
    .line 279
    const/16 v22, 0x0

    .line 280
    .line 281
    const/high16 v23, 0x40000000    # 2.0f

    .line 282
    .line 283
    const v24, -0x4099999a    # -0.9f

    .line 284
    .line 285
    .line 286
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v4, -0x4063d70a    # -1.22f

    .line 290
    .line 291
    .line 292
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v25, 0x3f800000    # 1.0f

    .line 296
    .line 297
    const v26, -0x402e147b    # -1.64f

    .line 298
    .line 299
    .line 300
    const v21, 0x3f170a3d    # 0.59f

    .line 301
    .line 302
    .line 303
    const v22, -0x416147ae    # -0.31f

    .line 304
    .line 305
    .line 306
    const/high16 v23, 0x3f800000    # 1.0f

    .line 307
    .line 308
    const v24, -0x40947ae1    # -0.92f

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v4, -0x3feccccd    # -2.3f

    .line 315
    .line 316
    .line 317
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/high16 v25, 0x41a80000    # 21.0f

    .line 321
    .line 322
    const v26, 0x4143851f    # 12.22f

    .line 323
    .line 324
    .line 325
    const/high16 v21, 0x41b00000    # 22.0f

    .line 326
    .line 327
    const v22, 0x41523d71    # 13.14f

    .line 328
    .line 329
    .line 330
    const v23, 0x41acb852    # 21.59f

    .line 331
    .line 332
    .line 333
    const v24, 0x41487ae1    # 12.53f

    .line 334
    .line 335
    .line 336
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 343
    .line 344
    .line 345
    move-result-object v2

    .line 346
    const/16 v16, 0x3800

    .line 347
    .line 348
    const/16 v17, 0x0

    .line 349
    .line 350
    const/high16 v6, 0x3f800000    # 1.0f

    .line 351
    .line 352
    const/high16 v8, 0x3f800000    # 1.0f

    .line 353
    .line 354
    const/4 v7, 0x0

    .line 355
    const/high16 v9, 0x3f800000    # 1.0f

    .line 356
    .line 357
    const/high16 v12, 0x3f800000    # 1.0f

    .line 358
    .line 359
    const/4 v13, 0x0

    .line 360
    const/4 v14, 0x0

    .line 361
    const/4 v15, 0x0

    .line 362
    const-string v4, ""

    .line 363
    .line 364
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 365
    .line 366
    .line 367
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 368
    .line 369
    .line 370
    move-result v3

    .line 371
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 372
    .line 373
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 374
    .line 375
    .line 376
    move-result-wide v6

    .line 377
    const/4 v2, 0x0

    .line 378
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 379
    .line 380
    .line 381
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 382
    .line 383
    .line 384
    move-result v10

    .line 385
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 386
    .line 387
    .line 388
    move-result v11

    .line 389
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 392
    .line 393
    .line 394
    const/high16 v4, 0x41100000    # 9.0f

    .line 395
    .line 396
    const/high16 v6, 0x41500000    # 13.0f

    .line 397
    .line 398
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/high16 v4, -0x40800000    # -1.0f

    .line 402
    .line 403
    const/4 v6, 0x0

    .line 404
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/high16 v26, 0x40000000    # 2.0f

    .line 408
    .line 409
    const/16 v27, 0x0

    .line 410
    .line 411
    const/high16 v21, 0x3f800000    # 1.0f

    .line 412
    .line 413
    const/high16 v22, 0x3f800000    # 1.0f

    .line 414
    .line 415
    const/16 v23, 0x0

    .line 416
    .line 417
    const/16 v24, 0x1

    .line 418
    .line 419
    const/16 v25, 0x1

    .line 420
    .line 421
    move-object/from16 v20, v2

    .line 422
    .line 423
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const/high16 v26, -0x40000000    # -2.0f

    .line 427
    .line 428
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 432
    .line 433
    .line 434
    move-result-object v2

    .line 435
    const/high16 v6, 0x3f800000    # 1.0f

    .line 436
    .line 437
    const/4 v7, 0x0

    .line 438
    const-string v4, ""

    .line 439
    .line 440
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 441
    .line 442
    .line 443
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 444
    .line 445
    .line 446
    move-result v3

    .line 447
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 448
    .line 449
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 450
    .line 451
    .line 452
    move-result-wide v6

    .line 453
    const/4 v2, 0x0

    .line 454
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 455
    .line 456
    .line 457
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 458
    .line 459
    .line 460
    move-result v10

    .line 461
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 462
    .line 463
    .line 464
    move-result v11

    .line 465
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 468
    .line 469
    .line 470
    const/high16 v4, 0x41700000    # 15.0f

    .line 471
    .line 472
    const/high16 v6, 0x41500000    # 13.0f

    .line 473
    .line 474
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const/high16 v4, -0x40800000    # -1.0f

    .line 478
    .line 479
    const/4 v6, 0x0

    .line 480
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v26, 0x40000000    # 2.0f

    .line 484
    .line 485
    move-object/from16 v20, v2

    .line 486
    .line 487
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v26, -0x40000000    # -2.0f

    .line 491
    .line 492
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 496
    .line 497
    .line 498
    move-result-object v2

    .line 499
    const/high16 v6, 0x3f800000    # 1.0f

    .line 500
    .line 501
    const/4 v7, 0x0

    .line 502
    const-string v4, ""

    .line 503
    .line 504
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 505
    .line 506
    .line 507
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 508
    .line 509
    .line 510
    move-result v3

    .line 511
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 512
    .line 513
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 514
    .line 515
    .line 516
    move-result-wide v6

    .line 517
    const/4 v0, 0x0

    .line 518
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 519
    .line 520
    .line 521
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 522
    .line 523
    .line 524
    move-result v10

    .line 525
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 526
    .line 527
    .line 528
    move-result v11

    .line 529
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 532
    .line 533
    .line 534
    const/high16 v0, 0x41900000    # 18.0f

    .line 535
    .line 536
    const v2, 0x41307ae1    # 11.03f

    .line 537
    .line 538
    .line 539
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const v17, 0x4140cccd    # 12.05f

    .line 543
    .line 544
    .line 545
    const/high16 v18, 0x40c00000    # 6.0f

    .line 546
    .line 547
    const v13, 0x418c28f6    # 17.52f

    .line 548
    .line 549
    .line 550
    const v14, 0x4102e148    # 8.18f

    .line 551
    .line 552
    .line 553
    const v15, 0x4170a3d7    # 15.04f

    .line 554
    .line 555
    .line 556
    const/high16 v16, 0x40c00000    # 6.0f

    .line 557
    .line 558
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const v17, -0x3f3f0a3d    # -6.03f

    .line 562
    .line 563
    .line 564
    const v18, 0x40ce6666    # 6.45f

    .line 565
    .line 566
    .line 567
    const v13, -0x3fbe147b    # -3.03f

    .line 568
    .line 569
    .line 570
    const/4 v14, 0x0

    .line 571
    const v15, -0x3f36b852    # -6.29f

    .line 572
    .line 573
    .line 574
    const v16, 0x4020a3d7    # 2.51f

    .line 575
    .line 576
    .line 577
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const v17, 0x409b851f    # 4.86f

    .line 581
    .line 582
    .line 583
    const v18, -0x3f43851f    # -5.89f

    .line 584
    .line 585
    .line 586
    const v13, 0x401e147b    # 2.47f

    .line 587
    .line 588
    .line 589
    const v14, -0x407eb852    # -1.01f

    .line 590
    .line 591
    .line 592
    const v15, 0x408a8f5c    # 4.33f

    .line 593
    .line 594
    .line 595
    const v16, -0x3fb28f5c    # -3.21f

    .line 596
    .line 597
    .line 598
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    const/high16 v17, 0x41900000    # 18.0f

    .line 602
    .line 603
    const v18, 0x41307ae1    # 11.03f

    .line 604
    .line 605
    .line 606
    const v13, 0x41430a3d    # 12.19f

    .line 607
    .line 608
    .line 609
    const v14, 0x41130a3d    # 9.19f

    .line 610
    .line 611
    .line 612
    const v15, 0x416e147b    # 14.88f

    .line 613
    .line 614
    .line 615
    const/high16 v16, 0x41300000    # 11.0f

    .line 616
    .line 617
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 624
    .line 625
    .line 626
    move-result-object v2

    .line 627
    const/16 v16, 0x3800

    .line 628
    .line 629
    const/16 v17, 0x0

    .line 630
    .line 631
    const/high16 v6, 0x3f800000    # 1.0f

    .line 632
    .line 633
    const/4 v7, 0x0

    .line 634
    const/high16 v12, 0x3f800000    # 1.0f

    .line 635
    .line 636
    const/4 v13, 0x0

    .line 637
    const/4 v14, 0x0

    .line 638
    const/4 v15, 0x0

    .line 639
    const-string v4, ""

    .line 640
    .line 641
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 642
    .line 643
    .line 644
    move-result-object v0

    .line 645
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 646
    .line 647
    .line 648
    move-result-object v0

    .line 649
    sput-object v0, Landroidx/compose/material/icons/rounded/SupportAgentKt;->_supportAgent:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 650
    .line 651
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 652
    .line 653
    .line 654
    return-object v0
.end method
