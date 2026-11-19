.class public final Landroidx/compose/material/icons/sharp/SportsKabaddiKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_sportsKabaddi",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SportsKabaddi",
        "Landroidx/compose/material/icons/Icons$Sharp;",
        "getSportsKabaddi",
        "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nSportsKabaddi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportsKabaddi.kt\nandroidx/compose/material/icons/sharp/SportsKabaddiKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,117:1\n212#2,12:118\n233#2,18:131\n253#2:168\n233#2,18:169\n253#2:206\n233#2,18:207\n253#2:244\n233#2,18:245\n253#2:282\n174#3:130\n705#4,2:149\n717#4,2:151\n719#4,11:157\n705#4,2:187\n717#4,2:189\n719#4,11:195\n705#4,2:225\n717#4,2:227\n719#4,11:233\n705#4,2:263\n717#4,2:265\n719#4,11:271\n72#5,4:153\n72#5,4:191\n72#5,4:229\n72#5,4:267\n*S KotlinDebug\n*F\n+ 1 SportsKabaddi.kt\nandroidx/compose/material/icons/sharp/SportsKabaddiKt\n*L\n29#1:118,12\n30#1:131,18\n30#1:168\n36#1:169,18\n36#1:206\n64#1:207,18\n64#1:244\n84#1:245,18\n84#1:282\n29#1:130\n30#1:149,2\n30#1:151,2\n30#1:157,11\n36#1:187,2\n36#1:189,2\n36#1:195,11\n64#1:225,2\n64#1:227,2\n64#1:233,11\n84#1:263,2\n84#1:265,2\n84#1:271,11\n30#1:153,4\n36#1:191,4\n64#1:229,4\n84#1:267,4\n*E\n"
    }
.end annotation


# static fields
.field private static _sportsKabaddi:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSportsKabaddi(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/SportsKabaddiKt;->_sportsKabaddi:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.SportsKabaddi"

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
    const/high16 v4, 0x41840000    # 16.5f

    .line 71
    .line 72
    const v6, 0x401851ec    # 2.38f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v4, -0x40000000    # -2.0f

    .line 79
    .line 80
    const/4 v6, 0x0

    .line 81
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const/high16 v26, 0x40800000    # 4.0f

    .line 85
    .line 86
    const/16 v27, 0x0

    .line 87
    .line 88
    const/high16 v21, 0x40000000    # 2.0f

    .line 89
    .line 90
    const/high16 v22, 0x40000000    # 2.0f

    .line 91
    .line 92
    const/16 v23, 0x0

    .line 93
    .line 94
    const/16 v24, 0x1

    .line 95
    .line 96
    const/16 v25, 0x1

    .line 97
    .line 98
    move-object/from16 v20, v2

    .line 99
    .line 100
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v26, -0x3f800000    # -4.0f

    .line 104
    .line 105
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    const/16 v16, 0x3800

    .line 113
    .line 114
    const/16 v17, 0x0

    .line 115
    .line 116
    const/high16 v6, 0x3f800000    # 1.0f

    .line 117
    .line 118
    const/high16 v8, 0x3f800000    # 1.0f

    .line 119
    .line 120
    const/4 v7, 0x0

    .line 121
    const/high16 v9, 0x3f800000    # 1.0f

    .line 122
    .line 123
    const/high16 v12, 0x3f800000    # 1.0f

    .line 124
    .line 125
    const/4 v13, 0x0

    .line 126
    const/4 v14, 0x0

    .line 127
    const/4 v15, 0x0

    .line 128
    const-string v4, ""

    .line 129
    .line 130
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 131
    .line 132
    .line 133
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 138
    .line 139
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 140
    .line 141
    .line 142
    move-result-wide v6

    .line 143
    const/4 v2, 0x0

    .line 144
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 148
    .line 149
    .line 150
    move-result v10

    .line 151
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 152
    .line 153
    .line 154
    move-result v11

    .line 155
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 158
    .line 159
    .line 160
    const v4, 0x413e147b    # 11.88f

    .line 161
    .line 162
    .line 163
    const/high16 v6, 0x41c00000    # 24.0f

    .line 164
    .line 165
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v4, -0x3f69999a    # -4.7f

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v4, -0x3f5e6666    # -5.05f

    .line 175
    .line 176
    .line 177
    const v6, -0x3ff70a3d    # -2.14f

    .line 178
    .line 179
    .line 180
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v25, -0x3fd66666    # -2.65f

    .line 184
    .line 185
    .line 186
    const v26, 0x3f570a3d    # 0.84f

    .line 187
    .line 188
    .line 189
    const v21, -0x4087ae14    # -0.97f

    .line 190
    .line 191
    .line 192
    const v22, -0x412e147b    # -0.41f

    .line 193
    .line 194
    .line 195
    const v23, -0x3ffa3d71    # -2.09f

    .line 196
    .line 197
    .line 198
    const v24, -0x428a3d71    # -0.06f

    .line 199
    .line 200
    .line 201
    move-object/from16 v20, v2

    .line 202
    .line 203
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/4 v4, 0x0

    .line 207
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v4, -0x40800000    # -1.0f

    .line 211
    .line 212
    const v6, 0x3fcccccd    # 1.6f

    .line 213
    .line 214
    .line 215
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v25, -0x3fa5c28f    # -3.41f

    .line 219
    .line 220
    .line 221
    const v26, 0x40147ae1    # 2.32f

    .line 222
    .line 223
    .line 224
    const v21, -0x40d47ae1    # -0.67f

    .line 225
    .line 226
    .line 227
    const v22, 0x3f970a3d    # 1.18f

    .line 228
    .line 229
    .line 230
    const v23, -0x400b851f    # -1.91f

    .line 231
    .line 232
    .line 233
    const v24, 0x4003d70a    # 2.06f

    .line 234
    .line 235
    .line 236
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v4, 0x3d75c28f    # 0.06f

    .line 240
    .line 241
    .line 242
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const v25, 0x401d70a4    # 2.46f

    .line 246
    .line 247
    .line 248
    const v26, 0x3f95c28f    # 1.17f

    .line 249
    .line 250
    .line 251
    const v21, 0x3f30a3d7    # 0.69f

    .line 252
    .line 253
    .line 254
    const v22, 0x3f30a3d7    # 0.69f

    .line 255
    .line 256
    .line 257
    const v23, 0x3fc28f5c    # 1.52f

    .line 258
    .line 259
    .line 260
    const v24, 0x3f88f5c3    # 1.07f

    .line 261
    .line 262
    .line 263
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v25, 0x4005c28f    # 2.09f

    .line 267
    .line 268
    .line 269
    const v26, -0x402e147b    # -1.64f

    .line 270
    .line 271
    .line 272
    const v21, 0x3f4ccccd    # 0.8f

    .line 273
    .line 274
    .line 275
    const v22, -0x4128f5c3    # -0.42f

    .line 276
    .line 277
    .line 278
    const v24, -0x40851eb8    # -0.98f

    .line 279
    .line 280
    .line 281
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v4, 0x3f19999a    # 0.6f

    .line 285
    .line 286
    .line 287
    const/high16 v6, 0x40400000    # 3.0f

    .line 288
    .line 289
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v4, -0x406b851f    # -1.16f

    .line 293
    .line 294
    .line 295
    const v6, 0x3f8ccccd    # 1.1f

    .line 296
    .line 297
    .line 298
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const/high16 v4, 0x41700000    # 15.0f

    .line 302
    .line 303
    const v6, 0x4166147b    # 14.38f

    .line 304
    .line 305
    .line 306
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v4, 0x3f428f5c    # 0.76f

    .line 310
    .line 311
    .line 312
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v4, 0x40d7ae14    # 6.74f

    .line 316
    .line 317
    .line 318
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v4, 0x40000000    # 2.0f

    .line 322
    .line 323
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v4, -0x3f400000    # -6.0f

    .line 327
    .line 328
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v4, 0x40066666    # 2.1f

    .line 332
    .line 333
    .line 334
    const/high16 v6, -0x40000000    # -2.0f

    .line 335
    .line 336
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const/high16 v4, 0x41000000    # 8.0f

    .line 340
    .line 341
    const v6, 0x3fe66666    # 1.8f

    .line 342
    .line 343
    .line 344
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v4, 0x41b80000    # 23.0f

    .line 348
    .line 349
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const v4, -0x3ff47ae1    # -2.18f

    .line 353
    .line 354
    .line 355
    const/high16 v6, -0x3ed00000    # -11.0f

    .line 356
    .line 357
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v4, -0x40e147ae    # -0.62f

    .line 361
    .line 362
    .line 363
    const v6, -0x3fb9999a    # -3.1f

    .line 364
    .line 365
    .line 366
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v4, 0x3f333333    # 0.7f

    .line 370
    .line 371
    .line 372
    const v6, 0x3fe66666    # 1.8f

    .line 373
    .line 374
    .line 375
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v4, 0x4059999a    # 3.4f

    .line 379
    .line 380
    .line 381
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/high16 v4, 0x41c00000    # 24.0f

    .line 385
    .line 386
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 393
    .line 394
    .line 395
    move-result-object v2

    .line 396
    const/high16 v6, 0x3f800000    # 1.0f

    .line 397
    .line 398
    const/4 v7, 0x0

    .line 399
    const-string v4, ""

    .line 400
    .line 401
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 402
    .line 403
    .line 404
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 405
    .line 406
    .line 407
    move-result v3

    .line 408
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 409
    .line 410
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 411
    .line 412
    .line 413
    move-result-wide v6

    .line 414
    const/4 v2, 0x0

    .line 415
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 419
    .line 420
    .line 421
    move-result v10

    .line 422
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 423
    .line 424
    .line 425
    move-result v11

    .line 426
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 429
    .line 430
    .line 431
    const v4, 0x4124a3d7    # 10.29f

    .line 432
    .line 433
    .line 434
    const v6, 0x410170a4    # 8.09f

    .line 435
    .line 436
    .line 437
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v25, 0x3f3851ec    # 0.72f

    .line 441
    .line 442
    .line 443
    const v26, 0x3e947ae1    # 0.29f

    .line 444
    .line 445
    .line 446
    const v21, 0x3e6147ae    # 0.22f

    .line 447
    .line 448
    .line 449
    const v22, 0x3e19999a    # 0.15f

    .line 450
    .line 451
    .line 452
    const v23, 0x3ef0a3d7    # 0.47f

    .line 453
    .line 454
    .line 455
    const v24, 0x3e75c28f    # 0.24f

    .line 456
    .line 457
    .line 458
    move-object/from16 v20, v2

    .line 459
    .line 460
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const v25, 0x3ec28f5c    # 0.38f

    .line 464
    .line 465
    .line 466
    const v26, 0x3d23d70a    # 0.04f

    .line 467
    .line 468
    .line 469
    const v21, 0x3e051eb8    # 0.13f

    .line 470
    .line 471
    .line 472
    const v22, 0x3ca3d70a    # 0.02f

    .line 473
    .line 474
    .line 475
    const/high16 v23, 0x3e800000    # 0.25f

    .line 476
    .line 477
    const v24, 0x3d23d70a    # 0.04f

    .line 478
    .line 479
    .line 480
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v4, -0x43dc28f6    # -0.01f

    .line 484
    .line 485
    .line 486
    const v6, 0x3ec28f5c    # 0.38f

    .line 487
    .line 488
    .line 489
    const v7, -0x42dc28f6    # -0.04f

    .line 490
    .line 491
    .line 492
    const v8, 0x3e851eb8    # 0.26f

    .line 493
    .line 494
    .line 495
    invoke-virtual {v2, v8, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const v25, 0x3ebd70a4    # 0.37f

    .line 499
    .line 500
    .line 501
    const v26, -0x421eb852    # -0.11f

    .line 502
    .line 503
    .line 504
    const v22, -0x435c28f6    # -0.02f

    .line 505
    .line 506
    .line 507
    const v24, -0x428a3d71    # -0.06f

    .line 508
    .line 509
    .line 510
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v25, 0x3f28f5c3    # 0.66f

    .line 514
    .line 515
    .line 516
    const v26, -0x411eb852    # -0.44f

    .line 517
    .line 518
    .line 519
    const v21, 0x3e75c28f    # 0.24f

    .line 520
    .line 521
    .line 522
    const v22, -0x42333333    # -0.1f

    .line 523
    .line 524
    .line 525
    const v23, 0x3ef0a3d7    # 0.47f

    .line 526
    .line 527
    .line 528
    const v24, -0x418a3d71    # -0.24f

    .line 529
    .line 530
    .line 531
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const v25, 0x3f0ccccd    # 0.55f

    .line 535
    .line 536
    .line 537
    const v26, -0x4019999a    # -1.8f

    .line 538
    .line 539
    .line 540
    const v21, 0x3efae148    # 0.49f

    .line 541
    .line 542
    .line 543
    const v22, -0x41051eb8    # -0.49f

    .line 544
    .line 545
    .line 546
    const v23, 0x3f2b851f    # 0.67f

    .line 547
    .line 548
    .line 549
    const v24, -0x406a3d71    # -1.17f

    .line 550
    .line 551
    .line 552
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const v25, 0x414ccccd    # 12.8f

    .line 556
    .line 557
    .line 558
    const/high16 v26, 0x40a00000    # 5.0f

    .line 559
    .line 560
    const v21, 0x41547ae1    # 13.28f

    .line 561
    .line 562
    .line 563
    const v22, 0x40b51eb8    # 5.66f

    .line 564
    .line 565
    .line 566
    const v23, 0x4151999a    # 13.1f

    .line 567
    .line 568
    .line 569
    const v24, 0x40a947ae    # 5.29f

    .line 570
    .line 571
    .line 572
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const v25, -0x40d70a3d    # -0.66f

    .line 576
    .line 577
    .line 578
    const v26, -0x411eb852    # -0.44f

    .line 579
    .line 580
    .line 581
    const v21, -0x41bd70a4    # -0.19f

    .line 582
    .line 583
    .line 584
    const v22, -0x41bd70a4    # -0.19f

    .line 585
    .line 586
    .line 587
    const v23, -0x4128f5c3    # -0.42f

    .line 588
    .line 589
    .line 590
    const v24, -0x4151eb85    # -0.34f

    .line 591
    .line 592
    .line 593
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const v25, -0x41428f5c    # -0.37f

    .line 597
    .line 598
    .line 599
    const v26, -0x421eb852    # -0.11f

    .line 600
    .line 601
    .line 602
    const v21, -0x420a3d71    # -0.12f

    .line 603
    .line 604
    .line 605
    const v22, -0x42b33333    # -0.05f

    .line 606
    .line 607
    .line 608
    const v23, -0x418a3d71    # -0.24f

    .line 609
    .line 610
    .line 611
    const v24, -0x4247ae14    # -0.09f

    .line 612
    .line 613
    .line 614
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const/high16 v4, -0x41800000    # -0.25f

    .line 618
    .line 619
    const v6, -0x413d70a4    # -0.38f

    .line 620
    .line 621
    .line 622
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const v25, -0x414ccccd    # -0.35f

    .line 626
    .line 627
    .line 628
    const v26, 0x3cf5c28f    # 0.03f

    .line 629
    .line 630
    .line 631
    const/16 v22, 0x0

    .line 632
    .line 633
    const v23, -0x41947ae1    # -0.23f

    .line 634
    .line 635
    .line 636
    const v24, 0x3c23d70a    # 0.01f

    .line 637
    .line 638
    .line 639
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const v25, -0x412e147b    # -0.41f

    .line 643
    .line 644
    .line 645
    const v26, 0x3de147ae    # 0.11f

    .line 646
    .line 647
    .line 648
    const v21, -0x41f0a3d7    # -0.14f

    .line 649
    .line 650
    .line 651
    const v22, 0x3ca3d70a    # 0.02f

    .line 652
    .line 653
    .line 654
    const v23, -0x4170a3d7    # -0.28f

    .line 655
    .line 656
    .line 657
    const v24, 0x3d75c28f    # 0.06f

    .line 658
    .line 659
    .line 660
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    const v25, 0x411fae14    # 9.98f

    .line 664
    .line 665
    .line 666
    const/high16 v26, 0x40a00000    # 5.0f

    .line 667
    .line 668
    const v21, 0x41266666    # 10.4f

    .line 669
    .line 670
    .line 671
    const v22, 0x40951eb8    # 4.66f

    .line 672
    .line 673
    .line 674
    const v23, 0x4122b852    # 10.17f

    .line 675
    .line 676
    .line 677
    const v24, 0x4099eb85    # 4.81f

    .line 678
    .line 679
    .line 680
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 681
    .line 682
    .line 683
    const v25, 0x4116e148    # 9.43f

    .line 684
    .line 685
    .line 686
    const v26, 0x40c0f5c3    # 6.03f

    .line 687
    .line 688
    .line 689
    const v21, 0x411ae148    # 9.68f

    .line 690
    .line 691
    .line 692
    const v22, 0x40a947ae    # 5.29f

    .line 693
    .line 694
    .line 695
    const/high16 v23, 0x41180000    # 9.5f

    .line 696
    .line 697
    const v24, 0x40b51eb8    # 5.66f

    .line 698
    .line 699
    .line 700
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    const v25, 0x3f0ccccd    # 0.55f

    .line 704
    .line 705
    .line 706
    const v26, 0x3fe66666    # 1.8f

    .line 707
    .line 708
    .line 709
    const v21, -0x420a3d71    # -0.12f

    .line 710
    .line 711
    .line 712
    const v22, 0x3f2147ae    # 0.63f

    .line 713
    .line 714
    .line 715
    const v23, 0x3d75c28f    # 0.06f

    .line 716
    .line 717
    .line 718
    const v24, 0x3fa7ae14    # 1.31f

    .line 719
    .line 720
    .line 721
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 722
    .line 723
    .line 724
    const v25, 0x4124a3d7    # 10.29f

    .line 725
    .line 726
    .line 727
    const v26, 0x410170a4    # 8.09f

    .line 728
    .line 729
    .line 730
    const v21, 0x41211eb8    # 10.07f

    .line 731
    .line 732
    .line 733
    const v22, 0x40fdc28f    # 7.93f

    .line 734
    .line 735
    .line 736
    const v23, 0x4122e148    # 10.18f

    .line 737
    .line 738
    .line 739
    const v24, 0x410028f6    # 8.01f

    .line 740
    .line 741
    .line 742
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 746
    .line 747
    .line 748
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 749
    .line 750
    .line 751
    move-result-object v2

    .line 752
    const/high16 v6, 0x3f800000    # 1.0f

    .line 753
    .line 754
    const/high16 v8, 0x3f800000    # 1.0f

    .line 755
    .line 756
    const/4 v7, 0x0

    .line 757
    const-string v4, ""

    .line 758
    .line 759
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 760
    .line 761
    .line 762
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 763
    .line 764
    .line 765
    move-result v3

    .line 766
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 767
    .line 768
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 769
    .line 770
    .line 771
    move-result-wide v6

    .line 772
    const/4 v0, 0x0

    .line 773
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 774
    .line 775
    .line 776
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 777
    .line 778
    .line 779
    move-result v10

    .line 780
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 781
    .line 782
    .line 783
    move-result v11

    .line 784
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 785
    .line 786
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 787
    .line 788
    .line 789
    const v0, 0x4133d70a    # 11.24f

    .line 790
    .line 791
    .line 792
    const v2, 0x4128f5c3    # 10.56f

    .line 793
    .line 794
    .line 795
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 796
    .line 797
    .line 798
    const/high16 v0, -0x40000000    # -2.0f

    .line 799
    .line 800
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 801
    .line 802
    .line 803
    const v17, -0x416147ae    # -0.31f

    .line 804
    .line 805
    .line 806
    const v18, -0x417ae148    # -0.26f

    .line 807
    .line 808
    .line 809
    const v13, -0x42333333    # -0.1f

    .line 810
    .line 811
    .line 812
    const v14, -0x42333333    # -0.1f

    .line 813
    .line 814
    .line 815
    const v15, -0x41b33333    # -0.2f

    .line 816
    .line 817
    .line 818
    const v16, -0x41c7ae14    # -0.18f

    .line 819
    .line 820
    .line 821
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 822
    .line 823
    .line 824
    const v17, 0x41035c29    # 8.21f

    .line 825
    .line 826
    .line 827
    const v18, 0x410051ec    # 8.02f

    .line 828
    .line 829
    .line 830
    const v13, 0x410b5c29    # 8.71f

    .line 831
    .line 832
    .line 833
    const v14, 0x41028f5c    # 8.16f

    .line 834
    .line 835
    .line 836
    const v15, 0x41075c29    # 8.46f

    .line 837
    .line 838
    .line 839
    const v16, 0x4100f5c3    # 8.06f

    .line 840
    .line 841
    .line 842
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 843
    .line 844
    .line 845
    const v17, 0x40fa8f5c    # 7.83f

    .line 846
    .line 847
    .line 848
    const v18, 0x40ff5c29    # 7.98f

    .line 849
    .line 850
    .line 851
    const v13, 0x410147ae    # 8.08f

    .line 852
    .line 853
    .line 854
    const v14, 0x40ffae14    # 7.99f

    .line 855
    .line 856
    .line 857
    const v15, 0x40feb852    # 7.96f

    .line 858
    .line 859
    .line 860
    const v16, 0x40ff5c29    # 7.98f

    .line 861
    .line 862
    .line 863
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 864
    .line 865
    .line 866
    const v17, -0x404b851f    # -1.41f

    .line 867
    .line 868
    .line 869
    const v18, 0x3f170a3d    # 0.59f

    .line 870
    .line 871
    .line 872
    const v13, -0x40fd70a4    # -0.51f

    .line 873
    .line 874
    .line 875
    const/4 v14, 0x0

    .line 876
    const v15, -0x407d70a4    # -1.02f

    .line 877
    .line 878
    .line 879
    const v16, 0x3e4ccccd    # 0.2f

    .line 880
    .line 881
    .line 882
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 883
    .line 884
    .line 885
    const v0, -0x3faa3d71    # -3.34f

    .line 886
    .line 887
    .line 888
    const v2, 0x4055c28f    # 3.34f

    .line 889
    .line 890
    .line 891
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 892
    .line 893
    .line 894
    const v17, -0x40eb851f    # -0.58f

    .line 895
    .line 896
    .line 897
    const v18, 0x3fc51eb8    # 1.54f

    .line 898
    .line 899
    .line 900
    const v13, -0x412e147b    # -0.41f

    .line 901
    .line 902
    .line 903
    const v14, 0x3ed1eb85    # 0.41f

    .line 904
    .line 905
    .line 906
    const v15, -0x40e147ae    # -0.62f

    .line 907
    .line 908
    .line 909
    const v16, 0x3f7ae148    # 0.98f

    .line 910
    .line 911
    .line 912
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 913
    .line 914
    .line 915
    const v17, 0x40270a3d    # 2.61f

    .line 916
    .line 917
    .line 918
    const/high16 v18, 0x41600000    # 14.0f

    .line 919
    .line 920
    const/high16 v13, 0x40200000    # 2.5f

    .line 921
    .line 922
    const v14, 0x415a147b    # 13.63f

    .line 923
    .line 924
    .line 925
    const v15, 0x40228f5c    # 2.54f

    .line 926
    .line 927
    .line 928
    const v16, 0x415d1eb8    # 13.82f

    .line 929
    .line 930
    .line 931
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 932
    .line 933
    .line 934
    const v0, 0x3f88f5c3    # 1.07f

    .line 935
    .line 936
    .line 937
    const v2, 0x403ccccd    # 2.95f

    .line 938
    .line 939
    .line 940
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 941
    .line 942
    .line 943
    const v0, -0x3f97ae14    # -3.63f

    .line 944
    .line 945
    .line 946
    const v2, 0x406851ec    # 3.63f

    .line 947
    .line 948
    .line 949
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 950
    .line 951
    .line 952
    const v0, 0x3fbae148    # 1.46f

    .line 953
    .line 954
    .line 955
    const/high16 v2, 0x41b00000    # 22.0f

    .line 956
    .line 957
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 958
    .line 959
    .line 960
    const v0, 0x4087ae14    # 4.24f

    .line 961
    .line 962
    .line 963
    const v2, -0x3f7851ec    # -4.24f

    .line 964
    .line 965
    .line 966
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 967
    .line 968
    .line 969
    const v0, -0x3ff1eb85    # -2.22f

    .line 970
    .line 971
    .line 972
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 973
    .line 974
    .line 975
    const/high16 v0, 0x40e00000    # 7.0f

    .line 976
    .line 977
    const/high16 v2, 0x41860000    # 16.75f

    .line 978
    .line 979
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 980
    .line 981
    .line 982
    const v0, 0x40a428f6    # 5.13f

    .line 983
    .line 984
    .line 985
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 986
    .line 987
    .line 988
    const/high16 v0, 0x40000000    # 2.0f

    .line 989
    .line 990
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 991
    .line 992
    .line 993
    const/high16 v0, -0x3f400000    # -6.0f

    .line 994
    .line 995
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 996
    .line 997
    .line 998
    const v0, -0x3ff851ec    # -2.12f

    .line 999
    .line 1000
    .line 1001
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1002
    .line 1003
    .line 1004
    const v0, 0x40170a3d    # 2.36f

    .line 1005
    .line 1006
    .line 1007
    const v2, -0x3fe8f5c3    # -2.36f

    .line 1008
    .line 1009
    .line 1010
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1011
    .line 1012
    .line 1013
    const v0, 0x3f35c28f    # 0.71f

    .line 1014
    .line 1015
    .line 1016
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1017
    .line 1018
    .line 1019
    const/4 v0, 0x0

    .line 1020
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1021
    .line 1022
    .line 1023
    const v17, 0x40a0f5c3    # 5.03f

    .line 1024
    .line 1025
    .line 1026
    const v18, 0x40028f5c    # 2.04f

    .line 1027
    .line 1028
    .line 1029
    const v13, 0x3fa51eb8    # 1.29f

    .line 1030
    .line 1031
    .line 1032
    const v14, 0x3fa147ae    # 1.26f

    .line 1033
    .line 1034
    .line 1035
    const v15, 0x403e147b    # 2.97f

    .line 1036
    .line 1037
    .line 1038
    const v16, 0x40028f5c    # 2.04f

    .line 1039
    .line 1040
    .line 1041
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1042
    .line 1043
    .line 1044
    const v0, -0x41f0a3d7    # -0.14f

    .line 1045
    .line 1046
    .line 1047
    const v2, -0x3ffb851f    # -2.07f

    .line 1048
    .line 1049
    .line 1050
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1051
    .line 1052
    .line 1053
    const v17, 0x4133d70a    # 11.24f

    .line 1054
    .line 1055
    .line 1056
    const v18, 0x4128f5c3    # 10.56f

    .line 1057
    .line 1058
    .line 1059
    const v13, 0x415570a4    # 13.34f

    .line 1060
    .line 1061
    .line 1062
    const v14, 0x4140f5c3    # 12.06f

    .line 1063
    .line 1064
    .line 1065
    const v15, 0x41423d71    # 12.14f

    .line 1066
    .line 1067
    .line 1068
    const v16, 0x41375c29    # 11.46f

    .line 1069
    .line 1070
    .line 1071
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1072
    .line 1073
    .line 1074
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1075
    .line 1076
    .line 1077
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v2

    .line 1081
    const/16 v16, 0x3800

    .line 1082
    .line 1083
    const/16 v17, 0x0

    .line 1084
    .line 1085
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1086
    .line 1087
    const/4 v7, 0x0

    .line 1088
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1089
    .line 1090
    const/4 v13, 0x0

    .line 1091
    const/4 v14, 0x0

    .line 1092
    const/4 v15, 0x0

    .line 1093
    const-string v4, ""

    .line 1094
    .line 1095
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v0

    .line 1099
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v0

    .line 1103
    sput-object v0, Landroidx/compose/material/icons/sharp/SportsKabaddiKt;->_sportsKabaddi:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1104
    .line 1105
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1106
    .line 1107
    .line 1108
    return-object v0
.end method
