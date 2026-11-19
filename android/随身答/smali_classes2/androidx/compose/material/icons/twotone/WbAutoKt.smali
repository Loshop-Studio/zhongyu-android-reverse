.class public final Landroidx/compose/material/icons/twotone/WbAutoKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_wbAuto",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "WbAuto",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getWbAuto",
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
        "SMAP\nWbAuto.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WbAuto.kt\nandroidx/compose/material/icons/twotone/WbAutoKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,105:1\n212#2,12:106\n233#2,18:119\n253#2:156\n233#2,18:157\n253#2:194\n174#3:118\n705#4,2:137\n717#4,2:139\n719#4,11:145\n705#4,2:175\n717#4,2:177\n719#4,11:183\n72#5,4:141\n72#5,4:179\n*S KotlinDebug\n*F\n+ 1 WbAuto.kt\nandroidx/compose/material/icons/twotone/WbAutoKt\n*L\n29#1:106,12\n30#1:119,18\n30#1:156\n54#1:157,18\n54#1:194\n29#1:118\n30#1:137,2\n30#1:139,2\n30#1:145,11\n54#1:175,2\n54#1:177,2\n54#1:183,11\n30#1:141,4\n54#1:179,4\n*E\n"
    }
.end annotation


# static fields
.field private static _wbAuto:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWbAuto(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/WbAutoKt;->_wbAuto:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.WbAuto"

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
    const/high16 v4, 0x41000000    # 8.0f

    .line 71
    .line 72
    const/high16 v6, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3f400000    # -6.0f

    .line 78
    .line 79
    const/high16 v26, 0x40c00000    # 6.0f

    .line 80
    .line 81
    const v21, -0x3fac28f6    # -3.31f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, -0x3f400000    # -6.0f

    .line 87
    .line 88
    const v24, 0x402c28f6    # 2.69f

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
    const v4, 0x402c28f6    # 2.69f

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v25, 0x40ab851f    # 5.36f

    .line 103
    .line 104
    .line 105
    const v26, -0x3fab851f    # -3.32f

    .line 106
    .line 107
    .line 108
    const v21, 0x40166666    # 2.35f

    .line 109
    .line 110
    .line 111
    const v23, 0x408c28f6    # 4.38f

    .line 112
    .line 113
    .line 114
    const v24, -0x4051eb85    # -1.36f

    .line 115
    .line 116
    .line 117
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v4, -0x43dc28f6    # -0.01f

    .line 121
    .line 122
    .line 123
    const v6, 0x3c23d70a    # 0.01f

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v25, 0x3f2147ae    # 0.63f

    .line 130
    .line 131
    .line 132
    const v26, -0x3fd51eb8    # -2.67f

    .line 133
    .line 134
    .line 135
    const v21, 0x3ecccccd    # 0.4f

    .line 136
    .line 137
    .line 138
    const v22, -0x40b0a3d7    # -0.81f

    .line 139
    .line 140
    .line 141
    const v23, 0x3f2147ae    # 0.63f

    .line 142
    .line 143
    .line 144
    const v24, -0x40251eb8    # -1.71f

    .line 145
    .line 146
    .line 147
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v25, -0x3f400000    # -6.0f

    .line 151
    .line 152
    const/high16 v26, -0x3f400000    # -6.0f

    .line 153
    .line 154
    const/16 v21, 0x0

    .line 155
    .line 156
    const v22, -0x3fac28f6    # -3.31f

    .line 157
    .line 158
    .line 159
    const v23, -0x3fd3d70a    # -2.69f

    .line 160
    .line 161
    .line 162
    const/high16 v24, -0x3f400000    # -6.0f

    .line 163
    .line 164
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v4, 0x4124cccd    # 10.3f

    .line 171
    .line 172
    .line 173
    const/high16 v6, 0x41800000    # 16.0f

    .line 174
    .line 175
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const/high16 v4, -0x40000000    # -2.0f

    .line 179
    .line 180
    const v6, -0x40cccccd    # -0.7f

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v4, 0x40cccccd    # 6.4f

    .line 187
    .line 188
    .line 189
    const/high16 v6, 0x41600000    # 14.0f

    .line 190
    .line 191
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v4, -0x40cccccd    # -0.7f

    .line 195
    .line 196
    .line 197
    const/high16 v6, 0x40000000    # 2.0f

    .line 198
    .line 199
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v4, 0x40733333    # 3.8f

    .line 203
    .line 204
    .line 205
    const/high16 v6, 0x41800000    # 16.0f

    .line 206
    .line 207
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v4, 0x40e00000    # 7.0f

    .line 211
    .line 212
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v4, 0x40000000    # 2.0f

    .line 216
    .line 217
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v4, 0x404ccccd    # 3.2f

    .line 221
    .line 222
    .line 223
    const/high16 v6, 0x41100000    # 9.0f

    .line 224
    .line 225
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v4, -0x400ccccd    # -1.9f

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v4, 0x414a6666    # 12.65f

    .line 238
    .line 239
    .line 240
    const v6, 0x40db3333    # 6.85f

    .line 241
    .line 242
    .line 243
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v4, 0x40133333    # 2.3f

    .line 247
    .line 248
    .line 249
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v4, 0x41100000    # 9.0f

    .line 253
    .line 254
    const/high16 v6, 0x41000000    # 8.0f

    .line 255
    .line 256
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    const/16 v16, 0x3800

    .line 267
    .line 268
    const/16 v17, 0x0

    .line 269
    .line 270
    const v6, 0x3e99999a    # 0.3f

    .line 271
    .line 272
    .line 273
    const v8, 0x3e99999a    # 0.3f

    .line 274
    .line 275
    .line 276
    const/4 v7, 0x0

    .line 277
    const/high16 v9, 0x3f800000    # 1.0f

    .line 278
    .line 279
    const/high16 v12, 0x3f800000    # 1.0f

    .line 280
    .line 281
    const/4 v13, 0x0

    .line 282
    const/4 v14, 0x0

    .line 283
    const/4 v15, 0x0

    .line 284
    const-string v4, ""

    .line 285
    .line 286
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 287
    .line 288
    .line 289
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 290
    .line 291
    .line 292
    move-result v3

    .line 293
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 294
    .line 295
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 296
    .line 297
    .line 298
    move-result-wide v6

    .line 299
    const/4 v0, 0x0

    .line 300
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 304
    .line 305
    .line 306
    move-result v10

    .line 307
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 308
    .line 309
    .line 310
    move-result v11

    .line 311
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 314
    .line 315
    .line 316
    const/high16 v0, 0x40e00000    # 7.0f

    .line 317
    .line 318
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v0, -0x3fb33333    # -3.2f

    .line 322
    .line 323
    .line 324
    const/high16 v2, 0x41100000    # 9.0f

    .line 325
    .line 326
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v0, 0x3ff33333    # 1.9f

    .line 330
    .line 331
    .line 332
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v0, 0x3f333333    # 0.7f

    .line 336
    .line 337
    .line 338
    const/high16 v2, -0x40000000    # -2.0f

    .line 339
    .line 340
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v0, 0x404ccccd    # 3.2f

    .line 344
    .line 345
    .line 346
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v0, 0x3f333333    # 0.7f

    .line 350
    .line 351
    .line 352
    const/high16 v2, 0x40000000    # 2.0f

    .line 353
    .line 354
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v0, 0x3ff33333    # 1.9f

    .line 358
    .line 359
    .line 360
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const/high16 v0, 0x41100000    # 9.0f

    .line 364
    .line 365
    const/high16 v2, 0x40e00000    # 7.0f

    .line 366
    .line 367
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v0, 0x40e00000    # 7.0f

    .line 371
    .line 372
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v0, 0x414a6666    # 12.65f

    .line 379
    .line 380
    .line 381
    const v2, 0x40db3333    # 6.85f

    .line 382
    .line 383
    .line 384
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const/high16 v0, 0x41100000    # 9.0f

    .line 388
    .line 389
    const/high16 v2, 0x41000000    # 8.0f

    .line 390
    .line 391
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const v0, 0x3f933333    # 1.15f

    .line 395
    .line 396
    .line 397
    const v2, 0x4069999a    # 3.65f

    .line 398
    .line 399
    .line 400
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const v0, -0x3feccccd    # -2.3f

    .line 404
    .line 405
    .line 406
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v0, 0x41a66666    # 20.8f

    .line 413
    .line 414
    .line 415
    const v2, 0x4154a3d7    # 13.29f

    .line 416
    .line 417
    .line 418
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v0, 0x419a6666    # 19.3f

    .line 422
    .line 423
    .line 424
    const/high16 v2, 0x40e00000    # 7.0f

    .line 425
    .line 426
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v0, -0x40333333    # -1.6f

    .line 430
    .line 431
    .line 432
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v0, -0x404147ae    # -1.49f

    .line 436
    .line 437
    .line 438
    const v2, 0x40c947ae    # 6.29f

    .line 439
    .line 440
    .line 441
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const/high16 v0, 0x41700000    # 15.0f

    .line 445
    .line 446
    const/high16 v2, 0x40e00000    # 7.0f

    .line 447
    .line 448
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v0, -0x40bd70a4    # -0.76f

    .line 452
    .line 453
    .line 454
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const v0, -0x43dc28f6    # -0.01f

    .line 458
    .line 459
    .line 460
    const v2, 0x3c23d70a    # 0.01f

    .line 461
    .line 462
    .line 463
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const/high16 v17, 0x41000000    # 8.0f

    .line 467
    .line 468
    const/high16 v18, 0x40800000    # 4.0f

    .line 469
    .line 470
    const v13, 0x414c28f6    # 12.76f

    .line 471
    .line 472
    .line 473
    const v14, 0x40a5c28f    # 5.18f

    .line 474
    .line 475
    .line 476
    const v15, 0x41287ae1    # 10.53f

    .line 477
    .line 478
    .line 479
    const/high16 v16, 0x40800000    # 4.0f

    .line 480
    .line 481
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const/high16 v17, -0x3f000000    # -8.0f

    .line 485
    .line 486
    const/high16 v18, 0x41000000    # 8.0f

    .line 487
    .line 488
    const v13, -0x3f728f5c    # -4.42f

    .line 489
    .line 490
    .line 491
    const/4 v14, 0x0

    .line 492
    const/high16 v15, -0x3f000000    # -8.0f

    .line 493
    .line 494
    const v16, 0x40651eb8    # 3.58f

    .line 495
    .line 496
    .line 497
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const v0, 0x40651eb8    # 3.58f

    .line 501
    .line 502
    .line 503
    const/high16 v2, 0x41000000    # 8.0f

    .line 504
    .line 505
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const v17, 0x40ddc28f    # 6.93f

    .line 509
    .line 510
    .line 511
    const/high16 v18, -0x3f800000    # -4.0f

    .line 512
    .line 513
    const v13, 0x403d70a4    # 2.96f

    .line 514
    .line 515
    .line 516
    const v15, 0x40b1999a    # 5.55f

    .line 517
    .line 518
    .line 519
    const v16, -0x4031eb85    # -1.61f

    .line 520
    .line 521
    .line 522
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const v17, 0x3da3d70a    # 0.08f

    .line 526
    .line 527
    .line 528
    const v18, -0x41c7ae14    # -0.18f

    .line 529
    .line 530
    .line 531
    const v13, 0x3cf5c28f    # 0.03f

    .line 532
    .line 533
    .line 534
    const v14, -0x428a3d71    # -0.06f

    .line 535
    .line 536
    .line 537
    const v15, 0x3d4ccccd    # 0.05f

    .line 538
    .line 539
    .line 540
    const v16, -0x420a3d71    # -0.12f

    .line 541
    .line 542
    .line 543
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const v17, 0x3e0f5c29    # 0.14f

    .line 547
    .line 548
    .line 549
    const/high16 v18, -0x41800000    # -0.25f

    .line 550
    .line 551
    const v13, 0x3d4ccccd    # 0.05f

    .line 552
    .line 553
    .line 554
    const v14, -0x425c28f6    # -0.08f

    .line 555
    .line 556
    .line 557
    const v15, 0x3db851ec    # 0.09f

    .line 558
    .line 559
    .line 560
    const v16, -0x41d1eb85    # -0.17f

    .line 561
    .line 562
    .line 563
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const v0, 0x3dcccccd    # 0.1f

    .line 567
    .line 568
    .line 569
    const v2, 0x3edc28f6    # 0.43f

    .line 570
    .line 571
    .line 572
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const/high16 v0, 0x41880000    # 17.0f

    .line 576
    .line 577
    const/high16 v2, 0x41800000    # 16.0f

    .line 578
    .line 579
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 583
    .line 584
    const v2, -0x3f3ccccd    # -6.1f

    .line 585
    .line 586
    .line 587
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const/high16 v0, 0x41a00000    # 20.0f

    .line 591
    .line 592
    const/high16 v2, 0x41800000    # 16.0f

    .line 593
    .line 594
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const/high16 v0, 0x3fe00000    # 1.75f

    .line 598
    .line 599
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const v0, 0x40033333    # 2.05f

    .line 603
    .line 604
    .line 605
    const/high16 v2, -0x3ef00000    # -9.0f

    .line 606
    .line 607
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const/high16 v0, 0x41b00000    # 22.0f

    .line 611
    .line 612
    const/high16 v2, 0x40e00000    # 7.0f

    .line 613
    .line 614
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const v0, -0x40666666    # -1.2f

    .line 618
    .line 619
    .line 620
    const v2, 0x40c947ae    # 6.29f

    .line 621
    .line 622
    .line 623
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const v0, 0x4155eb85    # 13.37f

    .line 630
    .line 631
    .line 632
    const v2, 0x416ab852    # 14.67f

    .line 633
    .line 634
    .line 635
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const/high16 v17, 0x41000000    # 8.0f

    .line 639
    .line 640
    const/high16 v18, 0x41900000    # 18.0f

    .line 641
    .line 642
    const v13, 0x4146147b    # 12.38f

    .line 643
    .line 644
    .line 645
    const v14, 0x41851eb8    # 16.64f

    .line 646
    .line 647
    .line 648
    const v15, 0x4125999a    # 10.35f

    .line 649
    .line 650
    .line 651
    const/high16 v16, 0x41900000    # 18.0f

    .line 652
    .line 653
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const/high16 v17, -0x3f400000    # -6.0f

    .line 657
    .line 658
    const/high16 v18, -0x3f400000    # -6.0f

    .line 659
    .line 660
    const v13, -0x3fac28f6    # -3.31f

    .line 661
    .line 662
    .line 663
    const/4 v14, 0x0

    .line 664
    const/high16 v15, -0x3f400000    # -6.0f

    .line 665
    .line 666
    const v16, -0x3fd3d70a    # -2.69f

    .line 667
    .line 668
    .line 669
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    .line 672
    const/high16 v0, -0x3f400000    # -6.0f

    .line 673
    .line 674
    const v2, 0x402c28f6    # 2.69f

    .line 675
    .line 676
    .line 677
    const/high16 v4, 0x40c00000    # 6.0f

    .line 678
    .line 679
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    const v0, 0x402c28f6    # 2.69f

    .line 683
    .line 684
    .line 685
    const/high16 v2, 0x40c00000    # 6.0f

    .line 686
    .line 687
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    const v17, -0x40deb852    # -0.63f

    .line 691
    .line 692
    .line 693
    const v18, 0x402ae148    # 2.67f

    .line 694
    .line 695
    .line 696
    const/4 v13, 0x0

    .line 697
    const v14, 0x3f75c28f    # 0.96f

    .line 698
    .line 699
    .line 700
    const v15, -0x41947ae1    # -0.23f

    .line 701
    .line 702
    .line 703
    const v16, 0x3fee147b    # 1.86f

    .line 704
    .line 705
    .line 706
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 713
    .line 714
    .line 715
    move-result-object v2

    .line 716
    const/16 v16, 0x3800

    .line 717
    .line 718
    const/16 v17, 0x0

    .line 719
    .line 720
    const/high16 v6, 0x3f800000    # 1.0f

    .line 721
    .line 722
    const/high16 v8, 0x3f800000    # 1.0f

    .line 723
    .line 724
    const/4 v7, 0x0

    .line 725
    const/high16 v12, 0x3f800000    # 1.0f

    .line 726
    .line 727
    const/4 v14, 0x0

    .line 728
    const/4 v15, 0x0

    .line 729
    const-string v4, ""

    .line 730
    .line 731
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 732
    .line 733
    .line 734
    move-result-object v0

    .line 735
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 736
    .line 737
    .line 738
    move-result-object v0

    .line 739
    sput-object v0, Landroidx/compose/material/icons/twotone/WbAutoKt;->_wbAuto:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 740
    .line 741
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 742
    .line 743
    .line 744
    return-object v0
.end method
