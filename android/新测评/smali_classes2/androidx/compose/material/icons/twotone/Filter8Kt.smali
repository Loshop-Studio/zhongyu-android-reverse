.class public final Landroidx/compose/material/icons/twotone/Filter8Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_filter8",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Filter8",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getFilter8",
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
        "SMAP\nFilter8.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Filter8.kt\nandroidx/compose/material/icons/twotone/Filter8Kt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,124:1\n212#2,12:125\n233#2,18:138\n253#2:175\n233#2,18:176\n253#2:213\n174#3:137\n705#4,2:156\n717#4,2:158\n719#4,11:164\n705#4,2:194\n717#4,2:196\n719#4,11:202\n72#5,4:160\n72#5,4:198\n*S KotlinDebug\n*F\n+ 1 Filter8.kt\nandroidx/compose/material/icons/twotone/Filter8Kt\n*L\n29#1:125,12\n30#1:138,18\n30#1:175\n64#1:176,18\n64#1:213\n29#1:137\n30#1:156,2\n30#1:158,2\n30#1:164,11\n64#1:194,2\n64#1:196,2\n64#1:202,11\n30#1:160,4\n64#1:198,4\n*E\n"
    }
.end annotation


# static fields
.field private static _filter8:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFilter8(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/Filter8Kt;->_filter8:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Filter8"

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
    const/high16 v4, 0x41880000    # 17.0f

    .line 71
    .line 72
    const/high16 v6, 0x40e00000    # 7.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x41600000    # 14.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x41a80000    # 21.0f

    .line 83
    .line 84
    const/high16 v6, 0x40400000    # 3.0f

    .line 85
    .line 86
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 87
    .line 88
    .line 89
    const/high16 v4, 0x40400000    # 3.0f

    .line 90
    .line 91
    const/high16 v6, 0x40e00000    # 7.0f

    .line 92
    .line 93
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v4, 0x41600000    # 14.0f

    .line 97
    .line 98
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v4, 0x41380000    # 11.5f

    .line 105
    .line 106
    const/high16 v6, 0x41300000    # 11.0f

    .line 107
    .line 108
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 112
    .line 113
    const/high16 v26, -0x40400000    # -1.5f

    .line 114
    .line 115
    const/16 v21, 0x0

    .line 116
    .line 117
    const v22, -0x40ab851f    # -0.83f

    .line 118
    .line 119
    .line 120
    const v23, 0x3f2b851f    # 0.67f

    .line 121
    .line 122
    .line 123
    const/high16 v24, -0x40400000    # -1.5f

    .line 124
    .line 125
    move-object/from16 v20, v2

    .line 126
    .line 127
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const/high16 v25, -0x40400000    # -1.5f

    .line 131
    .line 132
    const v21, -0x40ab851f    # -0.83f

    .line 133
    .line 134
    .line 135
    const/16 v22, 0x0

    .line 136
    .line 137
    const/high16 v23, -0x40400000    # -1.5f

    .line 138
    .line 139
    const v24, -0x40d47ae1    # -0.67f

    .line 140
    .line 141
    .line 142
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const/high16 v4, 0x41300000    # 11.0f

    .line 146
    .line 147
    const/high16 v6, 0x40e00000    # 7.0f

    .line 148
    .line 149
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v25, 0x40000000    # 2.0f

    .line 153
    .line 154
    const/high16 v26, -0x40000000    # -2.0f

    .line 155
    .line 156
    const/16 v21, 0x0

    .line 157
    .line 158
    const v22, -0x4071eb85    # -1.11f

    .line 159
    .line 160
    .line 161
    const v23, 0x3f666666    # 0.9f

    .line 162
    .line 163
    .line 164
    const/high16 v24, -0x40000000    # -2.0f

    .line 165
    .line 166
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const/high16 v4, 0x40000000    # 2.0f

    .line 170
    .line 171
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const/high16 v26, 0x40000000    # 2.0f

    .line 175
    .line 176
    const v21, 0x3f8ccccd    # 1.1f

    .line 177
    .line 178
    .line 179
    const/16 v22, 0x0

    .line 180
    .line 181
    const/high16 v23, 0x40000000    # 2.0f

    .line 182
    .line 183
    const v24, 0x3f63d70a    # 0.89f

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 190
    .line 191
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v25, -0x40400000    # -1.5f

    .line 195
    .line 196
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 197
    .line 198
    const/16 v21, 0x0

    .line 199
    .line 200
    const v22, 0x3f547ae1    # 0.83f

    .line 201
    .line 202
    .line 203
    const v23, -0x40d47ae1    # -0.67f

    .line 204
    .line 205
    .line 206
    const/high16 v24, 0x3fc00000    # 1.5f

    .line 207
    .line 208
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 212
    .line 213
    const v21, 0x3f547ae1    # 0.83f

    .line 214
    .line 215
    .line 216
    const/16 v22, 0x0

    .line 217
    .line 218
    const/high16 v23, 0x3fc00000    # 1.5f

    .line 219
    .line 220
    const v24, 0x3f2b851f    # 0.67f

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v4, 0x41880000    # 17.0f

    .line 227
    .line 228
    const/high16 v6, 0x41500000    # 13.0f

    .line 229
    .line 230
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v25, -0x40000000    # -2.0f

    .line 234
    .line 235
    const/high16 v26, 0x40000000    # 2.0f

    .line 236
    .line 237
    const/16 v21, 0x0

    .line 238
    .line 239
    const v22, 0x3f8e147b    # 1.11f

    .line 240
    .line 241
    .line 242
    const v23, -0x4099999a    # -0.9f

    .line 243
    .line 244
    .line 245
    const/high16 v24, 0x40000000    # 2.0f

    .line 246
    .line 247
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v4, -0x40000000    # -2.0f

    .line 251
    .line 252
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v26, -0x40000000    # -2.0f

    .line 256
    .line 257
    const v21, -0x40733333    # -1.1f

    .line 258
    .line 259
    .line 260
    const/16 v22, 0x0

    .line 261
    .line 262
    const/high16 v23, -0x40000000    # -2.0f

    .line 263
    .line 264
    const v24, -0x409c28f6    # -0.89f

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v4, -0x40400000    # -1.5f

    .line 271
    .line 272
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const/high16 v4, 0x41500000    # 13.0f

    .line 279
    .line 280
    const/high16 v6, 0x40e00000    # 7.0f

    .line 281
    .line 282
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v4, 0x40000000    # 2.0f

    .line 286
    .line 287
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v4, -0x40000000    # -2.0f

    .line 294
    .line 295
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const/high16 v4, 0x41300000    # 11.0f

    .line 302
    .line 303
    const/high16 v6, 0x41500000    # 13.0f

    .line 304
    .line 305
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v4, 0x40000000    # 2.0f

    .line 309
    .line 310
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const/high16 v4, -0x40000000    # -2.0f

    .line 317
    .line 318
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 325
    .line 326
    .line 327
    move-result-object v2

    .line 328
    const/16 v16, 0x3800

    .line 329
    .line 330
    const/16 v17, 0x0

    .line 331
    .line 332
    const v6, 0x3e99999a    # 0.3f

    .line 333
    .line 334
    .line 335
    const v8, 0x3e99999a    # 0.3f

    .line 336
    .line 337
    .line 338
    const/4 v7, 0x0

    .line 339
    const/high16 v9, 0x3f800000    # 1.0f

    .line 340
    .line 341
    const/high16 v12, 0x3f800000    # 1.0f

    .line 342
    .line 343
    const/4 v13, 0x0

    .line 344
    const/4 v14, 0x0

    .line 345
    const/4 v15, 0x0

    .line 346
    const-string v4, ""

    .line 347
    .line 348
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 349
    .line 350
    .line 351
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 352
    .line 353
    .line 354
    move-result v3

    .line 355
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 356
    .line 357
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 358
    .line 359
    .line 360
    move-result-wide v6

    .line 361
    const/4 v0, 0x0

    .line 362
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 363
    .line 364
    .line 365
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 366
    .line 367
    .line 368
    move-result v10

    .line 369
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 370
    .line 371
    .line 372
    move-result v11

    .line 373
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 376
    .line 377
    .line 378
    const/high16 v0, 0x3f800000    # 1.0f

    .line 379
    .line 380
    const/high16 v2, 0x41a80000    # 21.0f

    .line 381
    .line 382
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v2, 0x40e00000    # 7.0f

    .line 386
    .line 387
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v17, -0x40000000    # -2.0f

    .line 391
    .line 392
    const/high16 v18, 0x40000000    # 2.0f

    .line 393
    .line 394
    const v13, -0x40733333    # -1.1f

    .line 395
    .line 396
    .line 397
    const/high16 v15, -0x40000000    # -2.0f

    .line 398
    .line 399
    const v16, 0x3f666666    # 0.9f

    .line 400
    .line 401
    .line 402
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v0, 0x41600000    # 14.0f

    .line 406
    .line 407
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v17, 0x40000000    # 2.0f

    .line 411
    .line 412
    const/4 v13, 0x0

    .line 413
    const v14, 0x3f8ccccd    # 1.1f

    .line 414
    .line 415
    .line 416
    const v15, 0x3f666666    # 0.9f

    .line 417
    .line 418
    .line 419
    const/high16 v16, 0x40000000    # 2.0f

    .line 420
    .line 421
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const/high16 v18, -0x40000000    # -2.0f

    .line 428
    .line 429
    const v13, 0x3f8ccccd    # 1.1f

    .line 430
    .line 431
    .line 432
    const/4 v14, 0x0

    .line 433
    const/high16 v15, 0x40000000    # 2.0f

    .line 434
    .line 435
    const v16, -0x4099999a    # -0.9f

    .line 436
    .line 437
    .line 438
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v0, 0x41b80000    # 23.0f

    .line 442
    .line 443
    const/high16 v2, 0x40400000    # 3.0f

    .line 444
    .line 445
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/high16 v17, -0x40000000    # -2.0f

    .line 449
    .line 450
    const/4 v13, 0x0

    .line 451
    const v14, -0x40733333    # -1.1f

    .line 452
    .line 453
    .line 454
    const v15, -0x4099999a    # -0.9f

    .line 455
    .line 456
    .line 457
    const/high16 v16, -0x40000000    # -2.0f

    .line 458
    .line 459
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const/high16 v0, 0x41a80000    # 21.0f

    .line 466
    .line 467
    const/high16 v2, 0x41880000    # 17.0f

    .line 468
    .line 469
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const/high16 v0, 0x41880000    # 17.0f

    .line 473
    .line 474
    const/high16 v2, 0x40e00000    # 7.0f

    .line 475
    .line 476
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const/high16 v0, 0x40400000    # 3.0f

    .line 480
    .line 481
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const/high16 v0, 0x41600000    # 14.0f

    .line 485
    .line 486
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const/high16 v0, 0x41b80000    # 23.0f

    .line 496
    .line 497
    const/high16 v2, 0x40400000    # 3.0f

    .line 498
    .line 499
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const/high16 v0, 0x41800000    # 16.0f

    .line 503
    .line 504
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const/high16 v0, -0x40000000    # -2.0f

    .line 508
    .line 509
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const/high16 v0, 0x41a80000    # 21.0f

    .line 513
    .line 514
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const/high16 v0, 0x40a00000    # 5.0f

    .line 518
    .line 519
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const/high16 v2, 0x3f800000    # 1.0f

    .line 523
    .line 524
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const/high16 v0, 0x41800000    # 16.0f

    .line 528
    .line 529
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const/high16 v17, 0x40000000    # 2.0f

    .line 533
    .line 534
    const/high16 v18, 0x40000000    # 2.0f

    .line 535
    .line 536
    const v14, 0x3f8ccccd    # 1.1f

    .line 537
    .line 538
    .line 539
    const v15, 0x3f666666    # 0.9f

    .line 540
    .line 541
    .line 542
    const/high16 v16, 0x40000000    # 2.0f

    .line 543
    .line 544
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const/high16 v0, 0x41700000    # 15.0f

    .line 551
    .line 552
    const/high16 v2, 0x41500000    # 13.0f

    .line 553
    .line 554
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const/high16 v0, 0x40000000    # 2.0f

    .line 558
    .line 559
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const/high16 v18, -0x40000000    # -2.0f

    .line 563
    .line 564
    const v13, 0x3f8ccccd    # 1.1f

    .line 565
    .line 566
    .line 567
    const/4 v14, 0x0

    .line 568
    const/high16 v15, 0x40000000    # 2.0f

    .line 569
    .line 570
    const v16, -0x409c28f6    # -0.89f

    .line 571
    .line 572
    .line 573
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const/high16 v0, -0x40400000    # -1.5f

    .line 577
    .line 578
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const/high16 v17, -0x40400000    # -1.5f

    .line 582
    .line 583
    const/high16 v18, -0x40400000    # -1.5f

    .line 584
    .line 585
    const/4 v13, 0x0

    .line 586
    const v14, -0x40ab851f    # -0.83f

    .line 587
    .line 588
    .line 589
    const v15, -0x40d47ae1    # -0.67f

    .line 590
    .line 591
    .line 592
    const/high16 v16, -0x40400000    # -1.5f

    .line 593
    .line 594
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 598
    .line 599
    const v13, 0x3f547ae1    # 0.83f

    .line 600
    .line 601
    .line 602
    const/4 v14, 0x0

    .line 603
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 604
    .line 605
    const v16, -0x40d47ae1    # -0.67f

    .line 606
    .line 607
    .line 608
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const/high16 v0, 0x41880000    # 17.0f

    .line 612
    .line 613
    const/high16 v2, 0x40e00000    # 7.0f

    .line 614
    .line 615
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const/high16 v17, -0x40000000    # -2.0f

    .line 619
    .line 620
    const/high16 v18, -0x40000000    # -2.0f

    .line 621
    .line 622
    const/4 v13, 0x0

    .line 623
    const v14, -0x4071eb85    # -1.11f

    .line 624
    .line 625
    .line 626
    const v15, -0x4099999a    # -0.9f

    .line 627
    .line 628
    .line 629
    const/high16 v16, -0x40000000    # -2.0f

    .line 630
    .line 631
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const/high16 v0, -0x40000000    # -2.0f

    .line 635
    .line 636
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const/high16 v18, 0x40000000    # 2.0f

    .line 640
    .line 641
    const v13, -0x40733333    # -1.1f

    .line 642
    .line 643
    .line 644
    const/4 v14, 0x0

    .line 645
    const/high16 v15, -0x40000000    # -2.0f

    .line 646
    .line 647
    const v16, 0x3f63d70a    # 0.89f

    .line 648
    .line 649
    .line 650
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 654
    .line 655
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 659
    .line 660
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 661
    .line 662
    const/4 v13, 0x0

    .line 663
    const v14, 0x3f547ae1    # 0.83f

    .line 664
    .line 665
    .line 666
    const v15, 0x3f2b851f    # 0.67f

    .line 667
    .line 668
    .line 669
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 670
    .line 671
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    const/high16 v17, -0x40400000    # -1.5f

    .line 675
    .line 676
    const v13, -0x40ab851f    # -0.83f

    .line 677
    .line 678
    .line 679
    const/4 v14, 0x0

    .line 680
    const/high16 v15, -0x40400000    # -1.5f

    .line 681
    .line 682
    const v16, 0x3f2b851f    # 0.67f

    .line 683
    .line 684
    .line 685
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    const/high16 v0, 0x41300000    # 11.0f

    .line 689
    .line 690
    const/high16 v2, 0x41500000    # 13.0f

    .line 691
    .line 692
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const/high16 v17, 0x40000000    # 2.0f

    .line 696
    .line 697
    const/high16 v18, 0x40000000    # 2.0f

    .line 698
    .line 699
    const/4 v13, 0x0

    .line 700
    const v14, 0x3f8e147b    # 1.11f

    .line 701
    .line 702
    .line 703
    const v15, 0x3f666666    # 0.9f

    .line 704
    .line 705
    .line 706
    const/high16 v16, 0x40000000    # 2.0f

    .line 707
    .line 708
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    const/high16 v0, 0x41500000    # 13.0f

    .line 715
    .line 716
    const/high16 v2, 0x40e00000    # 7.0f

    .line 717
    .line 718
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    const/high16 v0, 0x40000000    # 2.0f

    .line 722
    .line 723
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 724
    .line 725
    .line 726
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 727
    .line 728
    .line 729
    const/high16 v0, -0x40000000    # -2.0f

    .line 730
    .line 731
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    const/high16 v0, 0x41500000    # 13.0f

    .line 735
    .line 736
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 737
    .line 738
    .line 739
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    const/high16 v0, 0x41300000    # 11.0f

    .line 743
    .line 744
    const/high16 v2, 0x41500000    # 13.0f

    .line 745
    .line 746
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 747
    .line 748
    .line 749
    const/high16 v0, 0x40000000    # 2.0f

    .line 750
    .line 751
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 752
    .line 753
    .line 754
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 755
    .line 756
    .line 757
    const/high16 v0, -0x40000000    # -2.0f

    .line 758
    .line 759
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 760
    .line 761
    .line 762
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 763
    .line 764
    .line 765
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 766
    .line 767
    .line 768
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 769
    .line 770
    .line 771
    move-result-object v2

    .line 772
    const/16 v16, 0x3800

    .line 773
    .line 774
    const/16 v17, 0x0

    .line 775
    .line 776
    const/high16 v6, 0x3f800000    # 1.0f

    .line 777
    .line 778
    const/high16 v8, 0x3f800000    # 1.0f

    .line 779
    .line 780
    const/4 v7, 0x0

    .line 781
    const/high16 v12, 0x3f800000    # 1.0f

    .line 782
    .line 783
    const/4 v14, 0x0

    .line 784
    const/4 v15, 0x0

    .line 785
    const-string v4, ""

    .line 786
    .line 787
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 788
    .line 789
    .line 790
    move-result-object v0

    .line 791
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 792
    .line 793
    .line 794
    move-result-object v0

    .line 795
    sput-object v0, Landroidx/compose/material/icons/twotone/Filter8Kt;->_filter8:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 796
    .line 797
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 798
    .line 799
    .line 800
    return-object v0
.end method
