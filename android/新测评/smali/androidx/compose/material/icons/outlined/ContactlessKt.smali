.class public final Landroidx/compose/material/icons/outlined/ContactlessKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_contactless",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Contactless",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getContactless",
        "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nContactless.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Contactless.kt\nandroidx/compose/material/icons/outlined/ContactlessKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,79:1\n212#2,12:80\n233#2,18:93\n253#2:130\n233#2,18:131\n253#2:168\n233#2,18:169\n253#2:206\n233#2,18:207\n253#2:244\n174#3:92\n705#4,2:111\n717#4,2:113\n719#4,11:119\n705#4,2:149\n717#4,2:151\n719#4,11:157\n705#4,2:187\n717#4,2:189\n719#4,11:195\n705#4,2:225\n717#4,2:227\n719#4,11:233\n72#5,4:115\n72#5,4:153\n72#5,4:191\n72#5,4:229\n*S KotlinDebug\n*F\n+ 1 Contactless.kt\nandroidx/compose/material/icons/outlined/ContactlessKt\n*L\n29#1:80,12\n30#1:93,18\n30#1:130\n44#1:131,18\n44#1:168\n54#1:169,18\n54#1:206\n64#1:207,18\n64#1:244\n29#1:92\n30#1:111,2\n30#1:113,2\n30#1:119,11\n44#1:149,2\n44#1:151,2\n44#1:157,11\n54#1:187,2\n54#1:189,2\n54#1:195,11\n64#1:225,2\n64#1:227,2\n64#1:233,11\n30#1:115,4\n44#1:153,4\n54#1:191,4\n64#1:229,4\n*E\n"
    }
.end annotation


# static fields
.field private static _contactless:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getContactless(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/ContactlessKt;->_contactless:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Contactless"

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
    const/high16 v4, 0x40000000    # 2.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x40000000    # 2.0f

    .line 78
    .line 79
    const/high16 v26, 0x41400000    # 12.0f

    .line 80
    .line 81
    const v21, 0x40cf5c29    # 6.48f

    .line 82
    .line 83
    .line 84
    const/high16 v22, 0x40000000    # 2.0f

    .line 85
    .line 86
    const/high16 v23, 0x40000000    # 2.0f

    .line 87
    .line 88
    const v24, 0x40cf5c29    # 6.48f

    .line 89
    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v25, 0x41200000    # 10.0f

    .line 97
    .line 98
    const/high16 v26, 0x41200000    # 10.0f

    .line 99
    .line 100
    const/16 v21, 0x0

    .line 101
    .line 102
    const v22, 0x40b0a3d7    # 5.52f

    .line 103
    .line 104
    .line 105
    const v23, 0x408f5c29    # 4.48f

    .line 106
    .line 107
    .line 108
    const/high16 v24, 0x41200000    # 10.0f

    .line 109
    .line 110
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const v4, -0x3f70a3d7    # -4.48f

    .line 114
    .line 115
    .line 116
    const/high16 v6, -0x3ee00000    # -10.0f

    .line 117
    .line 118
    const/high16 v7, 0x41200000    # 10.0f

    .line 119
    .line 120
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v25, 0x41400000    # 12.0f

    .line 124
    .line 125
    const/high16 v26, 0x40000000    # 2.0f

    .line 126
    .line 127
    const/high16 v21, 0x41b00000    # 22.0f

    .line 128
    .line 129
    const v22, 0x40cf5c29    # 6.48f

    .line 130
    .line 131
    .line 132
    const v23, 0x418c28f6    # 17.52f

    .line 133
    .line 134
    .line 135
    const/high16 v24, 0x40000000    # 2.0f

    .line 136
    .line 137
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v4, 0x41a00000    # 20.0f

    .line 144
    .line 145
    const/high16 v6, 0x41400000    # 12.0f

    .line 146
    .line 147
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v25, -0x3f000000    # -8.0f

    .line 151
    .line 152
    const/high16 v26, -0x3f000000    # -8.0f

    .line 153
    .line 154
    const v21, -0x3f728f5c    # -4.42f

    .line 155
    .line 156
    .line 157
    const/16 v22, 0x0

    .line 158
    .line 159
    const/high16 v23, -0x3f000000    # -8.0f

    .line 160
    .line 161
    const v24, -0x3f9ae148    # -3.58f

    .line 162
    .line 163
    .line 164
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v4, -0x3f000000    # -8.0f

    .line 168
    .line 169
    const v6, 0x40651eb8    # 3.58f

    .line 170
    .line 171
    .line 172
    const/high16 v7, 0x41000000    # 8.0f

    .line 173
    .line 174
    invoke-virtual {v2, v6, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v4, 0x40651eb8    # 3.58f

    .line 178
    .line 179
    .line 180
    const/high16 v6, 0x41000000    # 8.0f

    .line 181
    .line 182
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const v4, 0x41835c29    # 16.42f

    .line 186
    .line 187
    .line 188
    const/high16 v6, 0x41a00000    # 20.0f

    .line 189
    .line 190
    const/high16 v7, 0x41400000    # 12.0f

    .line 191
    .line 192
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    const/16 v16, 0x3800

    .line 203
    .line 204
    const/16 v17, 0x0

    .line 205
    .line 206
    const/high16 v6, 0x3f800000    # 1.0f

    .line 207
    .line 208
    const/high16 v8, 0x3f800000    # 1.0f

    .line 209
    .line 210
    const/4 v7, 0x0

    .line 211
    const/high16 v9, 0x3f800000    # 1.0f

    .line 212
    .line 213
    const/high16 v12, 0x3f800000    # 1.0f

    .line 214
    .line 215
    const/4 v13, 0x0

    .line 216
    const/4 v14, 0x0

    .line 217
    const/4 v15, 0x0

    .line 218
    const-string v4, ""

    .line 219
    .line 220
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 221
    .line 222
    .line 223
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 224
    .line 225
    .line 226
    move-result v3

    .line 227
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 228
    .line 229
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 230
    .line 231
    .line 232
    move-result-wide v6

    .line 233
    const/4 v2, 0x0

    .line 234
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 238
    .line 239
    .line 240
    move-result v10

    .line 241
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 242
    .line 243
    .line 244
    move-result v11

    .line 245
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 248
    .line 249
    .line 250
    const v4, 0x4122e148    # 10.18f

    .line 251
    .line 252
    .line 253
    const v6, 0x40e33333    # 7.1f

    .line 254
    .line 255
    .line 256
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v25, 0x3ecccccd    # 0.4f

    .line 260
    .line 261
    .line 262
    const v26, 0x3fe66666    # 1.8f

    .line 263
    .line 264
    .line 265
    const v21, 0x3e851eb8    # 0.26f

    .line 266
    .line 267
    .line 268
    const v22, 0x3f0f5c29    # 0.56f

    .line 269
    .line 270
    .line 271
    const v23, 0x3ec7ae14    # 0.39f

    .line 272
    .line 273
    .line 274
    const v24, 0x3f947ae1    # 1.16f

    .line 275
    .line 276
    .line 277
    move-object/from16 v20, v2

    .line 278
    .line 279
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v25, -0x41333333    # -0.4f

    .line 283
    .line 284
    .line 285
    const v26, 0x3fee147b    # 1.86f

    .line 286
    .line 287
    .line 288
    const v21, 0x3c23d70a    # 0.01f

    .line 289
    .line 290
    .line 291
    const v22, 0x3f2147ae    # 0.63f

    .line 292
    .line 293
    .line 294
    const v23, -0x41fae148    # -0.13f

    .line 295
    .line 296
    .line 297
    const/high16 v24, 0x3fa00000    # 1.25f

    .line 298
    .line 299
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v4, 0x3faf5c29    # 1.37f

    .line 303
    .line 304
    .line 305
    const v6, 0x3f1eb852    # 0.62f

    .line 306
    .line 307
    .line 308
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v25, 0x3f0a3d71    # 0.54f

    .line 312
    .line 313
    .line 314
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 315
    .line 316
    const v21, 0x3ebd70a4    # 0.37f

    .line 317
    .line 318
    .line 319
    const v22, -0x40b0a3d7    # -0.81f

    .line 320
    .line 321
    .line 322
    const v23, 0x3f0ccccd    # 0.55f

    .line 323
    .line 324
    .line 325
    const v24, -0x402ccccd    # -1.65f

    .line 326
    .line 327
    .line 328
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v25, -0x40f5c28f    # -0.54f

    .line 332
    .line 333
    .line 334
    const v26, -0x3fe66666    # -2.4f

    .line 335
    .line 336
    .line 337
    const v21, -0x43dc28f6    # -0.01f

    .line 338
    .line 339
    .line 340
    const v22, -0x40a8f5c3    # -0.84f

    .line 341
    .line 342
    .line 343
    const v23, -0x41bd70a4    # -0.19f

    .line 344
    .line 345
    .line 346
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v4, 0x4122e148    # 10.18f

    .line 350
    .line 351
    .line 352
    const v6, 0x40e33333    # 7.1f

    .line 353
    .line 354
    .line 355
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 362
    .line 363
    .line 364
    move-result-object v2

    .line 365
    const/high16 v6, 0x3f800000    # 1.0f

    .line 366
    .line 367
    const/4 v7, 0x0

    .line 368
    const-string v4, ""

    .line 369
    .line 370
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 371
    .line 372
    .line 373
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 374
    .line 375
    .line 376
    move-result v3

    .line 377
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 378
    .line 379
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 380
    .line 381
    .line 382
    move-result-wide v6

    .line 383
    const/4 v2, 0x0

    .line 384
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 385
    .line 386
    .line 387
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 388
    .line 389
    .line 390
    move-result v10

    .line 391
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 392
    .line 393
    .line 394
    move-result v11

    .line 395
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 398
    .line 399
    .line 400
    const v4, 0x40ea8f5c    # 7.33f

    .line 401
    .line 402
    .line 403
    const v6, 0x415547ae    # 13.33f

    .line 404
    .line 405
    .line 406
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v25, 0x3f970a3d    # 1.18f

    .line 410
    .line 411
    .line 412
    const v26, 0x40947ae1    # 4.64f

    .line 413
    .line 414
    .line 415
    const v21, 0x3f47ae14    # 0.78f

    .line 416
    .line 417
    .line 418
    const v22, 0x3fc8f5c3    # 1.57f

    .line 419
    .line 420
    .line 421
    const v23, 0x3f970a3d    # 1.18f

    .line 422
    .line 423
    .line 424
    const v24, 0x4048f5c3    # 3.14f

    .line 425
    .line 426
    .line 427
    move-object/from16 v20, v2

    .line 428
    .line 429
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v25, -0x4068f5c3    # -1.18f

    .line 433
    .line 434
    .line 435
    const v26, 0x4096147b    # 4.69f

    .line 436
    .line 437
    .line 438
    const/16 v21, 0x0

    .line 439
    .line 440
    const v22, 0x3fc147ae    # 1.51f

    .line 441
    .line 442
    .line 443
    const v23, -0x41333333    # -0.4f

    .line 444
    .line 445
    .line 446
    const v24, 0x4045c28f    # 3.09f

    .line 447
    .line 448
    .line 449
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v4, 0x3faccccd    # 1.35f

    .line 453
    .line 454
    .line 455
    const v6, 0x3f28f5c3    # 0.66f

    .line 456
    .line 457
    .line 458
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const v25, 0x3faa3d71    # 1.33f

    .line 462
    .line 463
    .line 464
    const v26, -0x3f54cccd    # -5.35f

    .line 465
    .line 466
    .line 467
    const v21, 0x3f6147ae    # 0.88f

    .line 468
    .line 469
    .line 470
    const v22, -0x401851ec    # -1.81f

    .line 471
    .line 472
    .line 473
    const v23, 0x3faa3d71    # 1.33f

    .line 474
    .line 475
    .line 476
    const v24, -0x3f98f5c3    # -3.61f

    .line 477
    .line 478
    .line 479
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v25, -0x4055c28f    # -1.33f

    .line 483
    .line 484
    .line 485
    const v26, -0x3f56147b    # -5.31f

    .line 486
    .line 487
    .line 488
    const/16 v21, 0x0

    .line 489
    .line 490
    const v22, -0x402147ae    # -1.74f

    .line 491
    .line 492
    .line 493
    const v23, -0x4119999a    # -0.45f

    .line 494
    .line 495
    .line 496
    const v24, -0x3f9e147b    # -3.53f

    .line 497
    .line 498
    .line 499
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const v4, 0x40ea8f5c    # 7.33f

    .line 503
    .line 504
    .line 505
    const v6, 0x415547ae    # 13.33f

    .line 506
    .line 507
    .line 508
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 515
    .line 516
    .line 517
    move-result-object v2

    .line 518
    const/high16 v6, 0x3f800000    # 1.0f

    .line 519
    .line 520
    const/4 v7, 0x0

    .line 521
    const-string v4, ""

    .line 522
    .line 523
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 524
    .line 525
    .line 526
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 527
    .line 528
    .line 529
    move-result v3

    .line 530
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 531
    .line 532
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 533
    .line 534
    .line 535
    move-result-wide v6

    .line 536
    const/4 v0, 0x0

    .line 537
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 538
    .line 539
    .line 540
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 541
    .line 542
    .line 543
    move-result v10

    .line 544
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 545
    .line 546
    .line 547
    move-result v11

    .line 548
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 551
    .line 552
    .line 553
    const v0, 0x410b851f    # 8.72f

    .line 554
    .line 555
    .line 556
    const v2, 0x41233333    # 10.2f

    .line 557
    .line 558
    .line 559
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const v17, 0x3f4ccccd    # 0.8f

    .line 563
    .line 564
    .line 565
    const v18, 0x4059999a    # 3.4f

    .line 566
    .line 567
    .line 568
    const v13, 0x3f07ae14    # 0.53f

    .line 569
    .line 570
    .line 571
    const v14, 0x3f88f5c3    # 1.07f

    .line 572
    .line 573
    .line 574
    const v15, 0x3f4ccccd    # 0.8f

    .line 575
    .line 576
    .line 577
    const v16, 0x400d70a4    # 2.21f

    .line 578
    .line 579
    .line 580
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const v17, -0x40b851ec    # -0.78f

    .line 584
    .line 585
    .line 586
    const v18, 0x4049999a    # 3.15f

    .line 587
    .line 588
    .line 589
    const/4 v13, 0x0

    .line 590
    const v14, 0x3f95c28f    # 1.17f

    .line 591
    .line 592
    .line 593
    const v15, -0x417ae148    # -0.26f

    .line 594
    .line 595
    .line 596
    const v16, 0x400eb852    # 2.23f

    .line 597
    .line 598
    .line 599
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const v0, 0x3fa66666    # 1.3f

    .line 603
    .line 604
    .line 605
    const v2, 0x3f3d70a4    # 0.74f

    .line 606
    .line 607
    .line 608
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const v17, 0x3f7ae148    # 0.98f

    .line 612
    .line 613
    .line 614
    const v18, -0x3f870a3d    # -3.89f

    .line 615
    .line 616
    .line 617
    const v13, 0x3f266666    # 0.65f

    .line 618
    .line 619
    .line 620
    const v14, -0x406ccccd    # -1.15f

    .line 621
    .line 622
    .line 623
    const v15, 0x3f7ae148    # 0.98f

    .line 624
    .line 625
    .line 626
    const v16, -0x3fe33333    # -2.45f

    .line 627
    .line 628
    .line 629
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const v17, -0x408a3d71    # -0.96f

    .line 633
    .line 634
    .line 635
    const v18, -0x3f7dc28f    # -4.07f

    .line 636
    .line 637
    .line 638
    const/4 v13, 0x0

    .line 639
    const v14, -0x404a3d71    # -1.42f

    .line 640
    .line 641
    .line 642
    const v15, -0x415c28f6    # -0.32f

    .line 643
    .line 644
    .line 645
    const v16, -0x3fcd70a4    # -2.79f

    .line 646
    .line 647
    .line 648
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    const v0, 0x410b851f    # 8.72f

    .line 652
    .line 653
    .line 654
    const v2, 0x41233333    # 10.2f

    .line 655
    .line 656
    .line 657
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 664
    .line 665
    .line 666
    move-result-object v2

    .line 667
    const/16 v16, 0x3800

    .line 668
    .line 669
    const/16 v17, 0x0

    .line 670
    .line 671
    const/high16 v6, 0x3f800000    # 1.0f

    .line 672
    .line 673
    const/4 v7, 0x0

    .line 674
    const/high16 v12, 0x3f800000    # 1.0f

    .line 675
    .line 676
    const/4 v14, 0x0

    .line 677
    const/4 v15, 0x0

    .line 678
    const-string v4, ""

    .line 679
    .line 680
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 681
    .line 682
    .line 683
    move-result-object v0

    .line 684
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 685
    .line 686
    .line 687
    move-result-object v0

    .line 688
    sput-object v0, Landroidx/compose/material/icons/outlined/ContactlessKt;->_contactless:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 689
    .line 690
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 691
    .line 692
    .line 693
    return-object v0
.end method
