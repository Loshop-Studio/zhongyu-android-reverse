.class public final Landroidx/compose/material/icons/rounded/UpcomingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_upcoming",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Upcoming",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getUpcoming",
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
        "SMAP\nUpcoming.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Upcoming.kt\nandroidx/compose/material/icons/rounded/UpcomingKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,87:1\n212#2,12:88\n233#2,18:101\n253#2:138\n233#2,18:139\n253#2:176\n233#2,18:177\n253#2:214\n233#2,18:215\n253#2:252\n174#3:100\n705#4,2:119\n717#4,2:121\n719#4,11:127\n705#4,2:157\n717#4,2:159\n719#4,11:165\n705#4,2:195\n717#4,2:197\n719#4,11:203\n705#4,2:233\n717#4,2:235\n719#4,11:241\n72#5,4:123\n72#5,4:161\n72#5,4:199\n72#5,4:237\n*S KotlinDebug\n*F\n+ 1 Upcoming.kt\nandroidx/compose/material/icons/rounded/UpcomingKt\n*L\n29#1:88,12\n30#1:101,18\n30#1:138\n42#1:139,18\n42#1:176\n54#1:177,18\n54#1:214\n66#1:215,18\n66#1:252\n29#1:100\n30#1:119,2\n30#1:121,2\n30#1:127,11\n42#1:157,2\n42#1:159,2\n42#1:165,11\n54#1:195,2\n54#1:197,2\n54#1:203,11\n66#1:233,2\n66#1:235,2\n66#1:241,11\n30#1:123,4\n42#1:161,4\n54#1:199,4\n66#1:237,4\n*E\n"
    }
.end annotation


# static fields
.field private static _upcoming:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getUpcoming(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/UpcomingKt;->_upcoming:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Upcoming"

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
    const v4, 0x41a3999a    # 20.45f

    .line 71
    .line 72
    .line 73
    const v6, 0x40d1999a    # 6.55f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const v25, -0x404e147b    # -1.39f

    .line 83
    .line 84
    .line 85
    const/16 v26, 0x0

    .line 86
    .line 87
    const v21, -0x413d70a4    # -0.38f

    .line 88
    .line 89
    .line 90
    const v22, -0x413d70a4    # -0.38f

    .line 91
    .line 92
    .line 93
    const v23, -0x407eb852    # -1.01f

    .line 94
    .line 95
    .line 96
    const v24, -0x413d70a4    # -0.38f

    .line 97
    .line 98
    .line 99
    move-object/from16 v20, v2

    .line 100
    .line 101
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v4, 0x41871eb8    # 16.89f

    .line 105
    .line 106
    .line 107
    const v6, 0x410b3333    # 8.7f

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const/16 v25, 0x0

    .line 114
    .line 115
    const v26, 0x3fb1eb85    # 1.39f

    .line 116
    .line 117
    .line 118
    const v21, -0x413851ec    # -0.39f

    .line 119
    .line 120
    .line 121
    const v22, 0x3ec28f5c    # 0.38f

    .line 122
    .line 123
    .line 124
    const v23, -0x413851ec    # -0.39f

    .line 125
    .line 126
    .line 127
    const v24, 0x3f8147ae    # 1.01f

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v4, 0x3c23d70a    # 0.01f

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v25, 0x3fb33333    # 1.4f

    .line 140
    .line 141
    .line 142
    const/16 v26, 0x0

    .line 143
    .line 144
    const v21, 0x3ec7ae14    # 0.39f

    .line 145
    .line 146
    .line 147
    const v22, 0x3ec7ae14    # 0.39f

    .line 148
    .line 149
    .line 150
    const v23, 0x3f8147ae    # 1.01f

    .line 151
    .line 152
    .line 153
    const v24, 0x3ec7ae14    # 0.39f

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v25, 0x4009999a    # 2.15f

    .line 160
    .line 161
    .line 162
    const v26, -0x3ff51eb8    # -2.17f

    .line 163
    .line 164
    .line 165
    const v21, 0x3f1eb852    # 0.62f

    .line 166
    .line 167
    .line 168
    const v22, -0x40deb852    # -0.63f

    .line 169
    .line 170
    .line 171
    const v23, 0x3fc28f5c    # 1.52f

    .line 172
    .line 173
    .line 174
    const v24, -0x403ae148    # -1.54f

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v25, 0x41a3999a    # 20.45f

    .line 181
    .line 182
    .line 183
    const v26, 0x40d1999a    # 6.55f

    .line 184
    .line 185
    .line 186
    const v21, 0x41a6a3d7    # 20.83f

    .line 187
    .line 188
    .line 189
    const v22, 0x40f1999a    # 7.55f

    .line 190
    .line 191
    .line 192
    const v23, 0x41a6a3d7    # 20.83f

    .line 193
    .line 194
    .line 195
    const v24, 0x40ddc28f    # 6.93f

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    const/16 v16, 0x3800

    .line 209
    .line 210
    const/16 v17, 0x0

    .line 211
    .line 212
    const/high16 v6, 0x3f800000    # 1.0f

    .line 213
    .line 214
    const/high16 v8, 0x3f800000    # 1.0f

    .line 215
    .line 216
    const/4 v7, 0x0

    .line 217
    const/high16 v9, 0x3f800000    # 1.0f

    .line 218
    .line 219
    const/high16 v12, 0x3f800000    # 1.0f

    .line 220
    .line 221
    const/4 v13, 0x0

    .line 222
    const/4 v14, 0x0

    .line 223
    const/4 v15, 0x0

    .line 224
    const-string v4, ""

    .line 225
    .line 226
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 227
    .line 228
    .line 229
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 230
    .line 231
    .line 232
    move-result v3

    .line 233
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 234
    .line 235
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 236
    .line 237
    .line 238
    move-result-wide v6

    .line 239
    const/4 v2, 0x0

    .line 240
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 244
    .line 245
    .line 246
    move-result v10

    .line 247
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 248
    .line 249
    .line 250
    move-result v11

    .line 251
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 254
    .line 255
    .line 256
    const v4, 0x414051ec    # 12.02f

    .line 257
    .line 258
    .line 259
    const/high16 v6, 0x40400000    # 3.0f

    .line 260
    .line 261
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v4, -0x430a3d71    # -0.03f

    .line 265
    .line 266
    .line 267
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v25, 0x41300000    # 11.0f

    .line 271
    .line 272
    const v26, 0x407eb852    # 3.98f

    .line 273
    .line 274
    .line 275
    const v21, 0x41370a3d    # 11.44f

    .line 276
    .line 277
    .line 278
    const/high16 v22, 0x40400000    # 3.0f

    .line 279
    .line 280
    const/high16 v23, 0x41300000    # 11.0f

    .line 281
    .line 282
    const v24, 0x405c28f6    # 3.44f

    .line 283
    .line 284
    .line 285
    move-object/from16 v20, v2

    .line 286
    .line 287
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v4, 0x4041eb85    # 3.03f

    .line 291
    .line 292
    .line 293
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v25, 0x413fae14    # 11.98f

    .line 297
    .line 298
    .line 299
    const/high16 v26, 0x41000000    # 8.0f

    .line 300
    .line 301
    const/high16 v21, 0x41300000    # 11.0f

    .line 302
    .line 303
    const v22, 0x40f1eb85    # 7.56f

    .line 304
    .line 305
    .line 306
    const v23, 0x41370a3d    # 11.44f

    .line 307
    .line 308
    .line 309
    const/high16 v24, 0x41000000    # 8.0f

    .line 310
    .line 311
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v4, 0x3cf5c28f    # 0.03f

    .line 315
    .line 316
    .line 317
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/high16 v25, 0x41500000    # 13.0f

    .line 321
    .line 322
    const v26, 0x40e0a3d7    # 7.02f

    .line 323
    .line 324
    .line 325
    const v21, 0x4148f5c3    # 12.56f

    .line 326
    .line 327
    .line 328
    const/high16 v22, 0x41000000    # 8.0f

    .line 329
    .line 330
    const/high16 v23, 0x41500000    # 13.0f

    .line 331
    .line 332
    const v24, 0x40f1eb85    # 7.56f

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v4, 0x407eb852    # 3.98f

    .line 339
    .line 340
    .line 341
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v25, 0x414051ec    # 12.02f

    .line 345
    .line 346
    .line 347
    const/high16 v26, 0x40400000    # 3.0f

    .line 348
    .line 349
    const/high16 v21, 0x41500000    # 13.0f

    .line 350
    .line 351
    const v22, 0x405c28f6    # 3.44f

    .line 352
    .line 353
    .line 354
    const v23, 0x4148f5c3    # 12.56f

    .line 355
    .line 356
    .line 357
    const/high16 v24, 0x40400000    # 3.0f

    .line 358
    .line 359
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 366
    .line 367
    .line 368
    move-result-object v2

    .line 369
    const/high16 v6, 0x3f800000    # 1.0f

    .line 370
    .line 371
    const/4 v7, 0x0

    .line 372
    const-string v4, ""

    .line 373
    .line 374
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 375
    .line 376
    .line 377
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 378
    .line 379
    .line 380
    move-result v3

    .line 381
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 382
    .line 383
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 384
    .line 385
    .line 386
    move-result-wide v6

    .line 387
    const/4 v2, 0x0

    .line 388
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 389
    .line 390
    .line 391
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 392
    .line 393
    .line 394
    move-result v10

    .line 395
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 396
    .line 397
    .line 398
    move-result v11

    .line 399
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 402
    .line 403
    .line 404
    const v4, 0x40e33333    # 7.1f

    .line 405
    .line 406
    .line 407
    const v6, 0x4121c28f    # 10.11f

    .line 408
    .line 409
    .line 410
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v4, -0x43dc28f6    # -0.01f

    .line 414
    .line 415
    .line 416
    const v6, 0x3c23d70a    # 0.01f

    .line 417
    .line 418
    .line 419
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const/16 v25, 0x0

    .line 423
    .line 424
    const v26, -0x404e147b    # -1.39f

    .line 425
    .line 426
    .line 427
    const v21, 0x3ec28f5c    # 0.38f

    .line 428
    .line 429
    .line 430
    const v22, -0x413d70a4    # -0.38f

    .line 431
    .line 432
    .line 433
    const v23, 0x3ec28f5c    # 0.38f

    .line 434
    .line 435
    .line 436
    const v24, -0x407eb852    # -1.01f

    .line 437
    .line 438
    .line 439
    move-object/from16 v20, v2

    .line 440
    .line 441
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v4, 0x409eb852    # 4.96f

    .line 445
    .line 446
    .line 447
    const v6, 0x40d147ae    # 6.54f

    .line 448
    .line 449
    .line 450
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v25, -0x404e147b    # -1.39f

    .line 454
    .line 455
    .line 456
    const/16 v26, 0x0

    .line 457
    .line 458
    const v21, -0x413d70a4    # -0.38f

    .line 459
    .line 460
    .line 461
    const v22, -0x413851ec    # -0.39f

    .line 462
    .line 463
    .line 464
    const v23, -0x407eb852    # -1.01f

    .line 465
    .line 466
    .line 467
    const v24, -0x413851ec    # -0.39f

    .line 468
    .line 469
    .line 470
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const v4, 0x40633333    # 3.55f

    .line 474
    .line 475
    .line 476
    const v6, 0x40d1999a    # 6.55f

    .line 477
    .line 478
    .line 479
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const/16 v25, 0x0

    .line 483
    .line 484
    const v26, 0x3fb1eb85    # 1.39f

    .line 485
    .line 486
    .line 487
    const v21, -0x413851ec    # -0.39f

    .line 488
    .line 489
    .line 490
    const v22, 0x3ec7ae14    # 0.39f

    .line 491
    .line 492
    .line 493
    const v23, -0x413851ec    # -0.39f

    .line 494
    .line 495
    .line 496
    const v24, 0x3f8147ae    # 1.01f

    .line 497
    .line 498
    .line 499
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const v25, 0x4009999a    # 2.15f

    .line 503
    .line 504
    .line 505
    const v26, 0x400ae148    # 2.17f

    .line 506
    .line 507
    .line 508
    const v21, 0x3f2147ae    # 0.63f

    .line 509
    .line 510
    .line 511
    const v22, 0x3f1eb852    # 0.62f

    .line 512
    .line 513
    .line 514
    const v23, 0x3fc3d70a    # 1.53f

    .line 515
    .line 516
    .line 517
    const v24, 0x3fc51eb8    # 1.54f

    .line 518
    .line 519
    .line 520
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const v25, 0x40e33333    # 7.1f

    .line 524
    .line 525
    .line 526
    const v26, 0x4121c28f    # 10.11f

    .line 527
    .line 528
    .line 529
    const v21, 0x40c2e148    # 6.09f

    .line 530
    .line 531
    .line 532
    const v22, 0x4127d70a    # 10.49f

    .line 533
    .line 534
    .line 535
    const v23, 0x40d70a3d    # 6.72f

    .line 536
    .line 537
    .line 538
    const v24, 0x4127d70a    # 10.49f

    .line 539
    .line 540
    .line 541
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 548
    .line 549
    .line 550
    move-result-object v2

    .line 551
    const/high16 v6, 0x3f800000    # 1.0f

    .line 552
    .line 553
    const/4 v7, 0x0

    .line 554
    const-string v4, ""

    .line 555
    .line 556
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 557
    .line 558
    .line 559
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 560
    .line 561
    .line 562
    move-result v3

    .line 563
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 564
    .line 565
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 566
    .line 567
    .line 568
    move-result-wide v6

    .line 569
    const/4 v0, 0x0

    .line 570
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 571
    .line 572
    .line 573
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 574
    .line 575
    .line 576
    move-result v10

    .line 577
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 578
    .line 579
    .line 580
    move-result v11

    .line 581
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 584
    .line 585
    .line 586
    const/high16 v0, 0x41700000    # 15.0f

    .line 587
    .line 588
    const/high16 v2, 0x41400000    # 12.0f

    .line 589
    .line 590
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const v17, -0x3fcf5c29    # -2.76f

    .line 594
    .line 595
    .line 596
    const v18, -0x4015c28f    # -1.83f

    .line 597
    .line 598
    .line 599
    const v13, -0x406147ae    # -1.24f

    .line 600
    .line 601
    .line 602
    const v15, -0x3fec28f6    # -2.31f

    .line 603
    .line 604
    .line 605
    const/high16 v16, -0x40c00000    # -0.75f

    .line 606
    .line 607
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const v17, 0x40eae148    # 7.34f

    .line 611
    .line 612
    .line 613
    const/high16 v18, 0x41400000    # 12.0f

    .line 614
    .line 615
    const v13, 0x410eb852    # 8.92f

    .line 616
    .line 617
    .line 618
    const v14, 0x4146e148    # 12.43f

    .line 619
    .line 620
    .line 621
    const v15, 0x41023d71    # 8.14f

    .line 622
    .line 623
    .line 624
    const/high16 v16, 0x41400000    # 12.0f

    .line 625
    .line 626
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const/high16 v0, 0x40800000    # 4.0f

    .line 630
    .line 631
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const/high16 v17, -0x40000000    # -2.0f

    .line 635
    .line 636
    const/high16 v18, 0x40000000    # 2.0f

    .line 637
    .line 638
    const v13, -0x40733333    # -1.1f

    .line 639
    .line 640
    .line 641
    const/4 v14, 0x0

    .line 642
    const/high16 v15, -0x40000000    # -2.0f

    .line 643
    .line 644
    const v16, 0x3f666666    # 0.9f

    .line 645
    .line 646
    .line 647
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const/high16 v0, 0x40a00000    # 5.0f

    .line 651
    .line 652
    const/4 v2, 0x0

    .line 653
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const/high16 v17, 0x40000000    # 2.0f

    .line 657
    .line 658
    const/4 v13, 0x0

    .line 659
    const v14, 0x3f8ccccd    # 1.1f

    .line 660
    .line 661
    .line 662
    const v15, 0x3f666666    # 0.9f

    .line 663
    .line 664
    .line 665
    const/high16 v16, 0x40000000    # 2.0f

    .line 666
    .line 667
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const/high16 v0, 0x41800000    # 16.0f

    .line 671
    .line 672
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    const/high16 v18, -0x40000000    # -2.0f

    .line 676
    .line 677
    const v13, 0x3f8ccccd    # 1.1f

    .line 678
    .line 679
    .line 680
    const/4 v14, 0x0

    .line 681
    const/high16 v15, 0x40000000    # 2.0f

    .line 682
    .line 683
    const v16, -0x4099999a    # -0.9f

    .line 684
    .line 685
    .line 686
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const/high16 v0, -0x3f600000    # -5.0f

    .line 690
    .line 691
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 692
    .line 693
    .line 694
    const/high16 v17, -0x40000000    # -2.0f

    .line 695
    .line 696
    const/4 v13, 0x0

    .line 697
    const v14, -0x40733333    # -1.1f

    .line 698
    .line 699
    .line 700
    const v15, -0x4099999a    # -0.9f

    .line 701
    .line 702
    .line 703
    const/high16 v16, -0x40000000    # -2.0f

    .line 704
    .line 705
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 706
    .line 707
    .line 708
    const v0, -0x3faa3d71    # -3.34f

    .line 709
    .line 710
    .line 711
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    const v17, -0x400ccccd    # -1.9f

    .line 715
    .line 716
    .line 717
    const v18, 0x3f95c28f    # 1.17f

    .line 718
    .line 719
    .line 720
    const v13, -0x40b33333    # -0.8f

    .line 721
    .line 722
    .line 723
    const/4 v14, 0x0

    .line 724
    const v15, -0x4035c28f    # -1.58f

    .line 725
    .line 726
    .line 727
    const v16, 0x3edc28f6    # 0.43f

    .line 728
    .line 729
    .line 730
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 731
    .line 732
    .line 733
    const/high16 v17, 0x41400000    # 12.0f

    .line 734
    .line 735
    const/high16 v18, 0x41700000    # 15.0f

    .line 736
    .line 737
    const v13, 0x4164f5c3    # 14.31f

    .line 738
    .line 739
    .line 740
    const/high16 v14, 0x41640000    # 14.25f

    .line 741
    .line 742
    const v15, 0x4153d70a    # 13.24f

    .line 743
    .line 744
    .line 745
    const/high16 v16, 0x41700000    # 15.0f

    .line 746
    .line 747
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 748
    .line 749
    .line 750
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 751
    .line 752
    .line 753
    move-result-object v2

    .line 754
    const/16 v16, 0x3800

    .line 755
    .line 756
    const/16 v17, 0x0

    .line 757
    .line 758
    const/high16 v6, 0x3f800000    # 1.0f

    .line 759
    .line 760
    const/4 v7, 0x0

    .line 761
    const/high16 v12, 0x3f800000    # 1.0f

    .line 762
    .line 763
    const/4 v13, 0x0

    .line 764
    const/4 v14, 0x0

    .line 765
    const/4 v15, 0x0

    .line 766
    const-string v4, ""

    .line 767
    .line 768
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 769
    .line 770
    .line 771
    move-result-object v0

    .line 772
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 773
    .line 774
    .line 775
    move-result-object v0

    .line 776
    sput-object v0, Landroidx/compose/material/icons/rounded/UpcomingKt;->_upcoming:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 777
    .line 778
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 779
    .line 780
    .line 781
    return-object v0
.end method
