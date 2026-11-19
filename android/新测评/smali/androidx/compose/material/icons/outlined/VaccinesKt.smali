.class public final Landroidx/compose/material/icons/outlined/VaccinesKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_vaccines",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Vaccines",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getVaccines",
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
        "SMAP\nVaccines.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vaccines.kt\nandroidx/compose/material/icons/outlined/VaccinesKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,117:1\n212#2,12:118\n233#2,18:131\n253#2:168\n174#3:130\n705#4,2:149\n717#4,2:151\n719#4,11:157\n72#5,4:153\n*S KotlinDebug\n*F\n+ 1 Vaccines.kt\nandroidx/compose/material/icons/outlined/VaccinesKt\n*L\n29#1:118,12\n30#1:131,18\n30#1:168\n29#1:130\n30#1:149,2\n30#1:151,2\n30#1:157,11\n30#1:153,4\n*E\n"
    }
.end annotation


# static fields
.field private static _vaccines:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getVaccines(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/VaccinesKt;->_vaccines:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Vaccines"

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
    const/4 v0, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v0, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const/high16 v0, 0x41300000    # 11.0f

    .line 71
    .line 72
    const/high16 v2, 0x40b00000    # 5.5f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x41000000    # 8.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v0, 0x40800000    # 4.0f

    .line 83
    .line 84
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v0, 0x3f000000    # 0.5f

    .line 88
    .line 89
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/high16 v17, 0x3f800000    # 1.0f

    .line 93
    .line 94
    const/high16 v18, -0x40800000    # -1.0f

    .line 95
    .line 96
    const v13, 0x3f0ccccd    # 0.55f

    .line 97
    .line 98
    .line 99
    const/4 v14, 0x0

    .line 100
    const/high16 v15, 0x3f800000    # 1.0f

    .line 101
    .line 102
    const v16, -0x4119999a    # -0.45f

    .line 103
    .line 104
    .line 105
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const/high16 v17, -0x40800000    # -1.0f

    .line 109
    .line 110
    const/4 v13, 0x0

    .line 111
    const v14, -0x40f33333    # -0.55f

    .line 112
    .line 113
    .line 114
    const v15, -0x4119999a    # -0.45f

    .line 115
    .line 116
    .line 117
    const/high16 v16, -0x40800000    # -1.0f

    .line 118
    .line 119
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 123
    .line 124
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v18, 0x3f800000    # 1.0f

    .line 128
    .line 129
    const v13, -0x40f33333    # -0.55f

    .line 130
    .line 131
    .line 132
    const/4 v14, 0x0

    .line 133
    const/high16 v15, -0x40800000    # -1.0f

    .line 134
    .line 135
    const v16, 0x3ee66666    # 0.45f

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v17, 0x3f800000    # 1.0f

    .line 142
    .line 143
    const/4 v13, 0x0

    .line 144
    const v14, 0x3f0ccccd    # 0.55f

    .line 145
    .line 146
    .line 147
    const v15, 0x3ee66666    # 0.45f

    .line 148
    .line 149
    .line 150
    const/high16 v16, 0x3f800000    # 1.0f

    .line 151
    .line 152
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const/high16 v0, 0x40c00000    # 6.0f

    .line 156
    .line 157
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 161
    .line 162
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v0, 0x40400000    # 3.0f

    .line 166
    .line 167
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v17, -0x40800000    # -1.0f

    .line 171
    .line 172
    const v13, -0x40f33333    # -0.55f

    .line 173
    .line 174
    .line 175
    const/4 v14, 0x0

    .line 176
    const/high16 v15, -0x40800000    # -1.0f

    .line 177
    .line 178
    const v16, 0x3ee66666    # 0.45f

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const/high16 v17, 0x3f800000    # 1.0f

    .line 185
    .line 186
    const/4 v13, 0x0

    .line 187
    const v14, 0x3f0ccccd    # 0.55f

    .line 188
    .line 189
    .line 190
    const v15, 0x3ee66666    # 0.45f

    .line 191
    .line 192
    .line 193
    const/high16 v16, 0x3f800000    # 1.0f

    .line 194
    .line 195
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v0, 0x41700000    # 15.0f

    .line 199
    .line 200
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const/high16 v17, 0x40000000    # 2.0f

    .line 204
    .line 205
    const/high16 v18, 0x40000000    # 2.0f

    .line 206
    .line 207
    const v14, 0x3f8ccccd    # 1.1f

    .line 208
    .line 209
    .line 210
    const v15, 0x3f666666    # 0.9f

    .line 211
    .line 212
    .line 213
    const/high16 v16, 0x40000000    # 2.0f

    .line 214
    .line 215
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const/high16 v0, 0x3f800000    # 1.0f

    .line 219
    .line 220
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v0, 0x40800000    # 4.0f

    .line 224
    .line 225
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v0, 0x40000000    # 2.0f

    .line 229
    .line 230
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 231
    .line 232
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v0, 0x41880000    # 17.0f

    .line 236
    .line 237
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const/high16 v0, 0x3f800000    # 1.0f

    .line 241
    .line 242
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const/high16 v18, -0x40000000    # -2.0f

    .line 246
    .line 247
    const v13, 0x3f8ccccd    # 1.1f

    .line 248
    .line 249
    .line 250
    const/4 v14, 0x0

    .line 251
    const/high16 v15, 0x40000000    # 2.0f

    .line 252
    .line 253
    const v16, -0x4099999a    # -0.9f

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v0, 0x40f00000    # 7.5f

    .line 260
    .line 261
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v17, 0x3f800000    # 1.0f

    .line 265
    .line 266
    const/high16 v18, -0x40800000    # -1.0f

    .line 267
    .line 268
    const v13, 0x3f0ccccd    # 0.55f

    .line 269
    .line 270
    .line 271
    const/high16 v15, 0x3f800000    # 1.0f

    .line 272
    .line 273
    const v16, -0x4119999a    # -0.45f

    .line 274
    .line 275
    .line 276
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const/high16 v17, 0x41300000    # 11.0f

    .line 280
    .line 281
    const/high16 v18, 0x40b00000    # 5.5f

    .line 282
    .line 283
    const/high16 v13, 0x41400000    # 12.0f

    .line 284
    .line 285
    const v14, 0x40be6666    # 5.95f

    .line 286
    .line 287
    .line 288
    const v15, 0x4138cccd    # 11.55f

    .line 289
    .line 290
    .line 291
    const/high16 v16, 0x40b00000    # 5.5f

    .line 292
    .line 293
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const/high16 v0, 0x41100000    # 9.0f

    .line 300
    .line 301
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const/high16 v0, 0x40e80000    # 7.25f

    .line 305
    .line 306
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const/high16 v17, 0x40d00000    # 6.5f

    .line 310
    .line 311
    const/high16 v18, 0x411c0000    # 9.75f

    .line 312
    .line 313
    const v13, 0x40dae148    # 6.84f

    .line 314
    .line 315
    .line 316
    const/high16 v14, 0x41100000    # 9.0f

    .line 317
    .line 318
    const/high16 v15, 0x40d00000    # 6.5f

    .line 319
    .line 320
    const v16, 0x411570a4    # 9.34f

    .line 321
    .line 322
    .line 323
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v17, 0x3f400000    # 0.75f

    .line 327
    .line 328
    const/high16 v18, 0x3f400000    # 0.75f

    .line 329
    .line 330
    const/4 v13, 0x0

    .line 331
    const v14, 0x3ed1eb85    # 0.41f

    .line 332
    .line 333
    .line 334
    const v15, 0x3eae147b    # 0.34f

    .line 335
    .line 336
    .line 337
    const/high16 v16, 0x3f400000    # 0.75f

    .line 338
    .line 339
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v0, 0x41100000    # 9.0f

    .line 343
    .line 344
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v0, 0x41400000    # 12.0f

    .line 348
    .line 349
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v0, 0x40e80000    # 7.25f

    .line 353
    .line 354
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v17, -0x40c00000    # -0.75f

    .line 358
    .line 359
    const v13, -0x412e147b    # -0.41f

    .line 360
    .line 361
    .line 362
    const/4 v14, 0x0

    .line 363
    const/high16 v15, -0x40c00000    # -0.75f

    .line 364
    .line 365
    const v16, 0x3eae147b    # 0.34f

    .line 366
    .line 367
    .line 368
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/high16 v17, 0x3f400000    # 0.75f

    .line 372
    .line 373
    const/4 v13, 0x0

    .line 374
    const v14, 0x3ed1eb85    # 0.41f

    .line 375
    .line 376
    .line 377
    const v15, 0x3eae147b    # 0.34f

    .line 378
    .line 379
    .line 380
    const/high16 v16, 0x3f400000    # 0.75f

    .line 381
    .line 382
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v0, 0x41100000    # 9.0f

    .line 386
    .line 387
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v0, 0x41700000    # 15.0f

    .line 391
    .line 392
    const/high16 v2, 0x41100000    # 9.0f

    .line 393
    .line 394
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const/high16 v0, 0x40a00000    # 5.0f

    .line 398
    .line 399
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const/high16 v0, 0x40f00000    # 7.5f

    .line 403
    .line 404
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/high16 v0, 0x40800000    # 4.0f

    .line 408
    .line 409
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const/high16 v0, 0x41100000    # 9.0f

    .line 413
    .line 414
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v0, 0x419c0000    # 19.5f

    .line 421
    .line 422
    const/high16 v2, 0x41280000    # 10.5f

    .line 423
    .line 424
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const/high16 v0, 0x41200000    # 10.0f

    .line 428
    .line 429
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v17, 0x3f800000    # 1.0f

    .line 433
    .line 434
    const/high16 v18, -0x40800000    # -1.0f

    .line 435
    .line 436
    const v13, 0x3f0ccccd    # 0.55f

    .line 437
    .line 438
    .line 439
    const/4 v14, 0x0

    .line 440
    const/high16 v15, 0x3f800000    # 1.0f

    .line 441
    .line 442
    const v16, -0x4119999a    # -0.45f

    .line 443
    .line 444
    .line 445
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/high16 v17, -0x40800000    # -1.0f

    .line 449
    .line 450
    const/4 v13, 0x0

    .line 451
    const v14, -0x40f33333    # -0.55f

    .line 452
    .line 453
    .line 454
    const v15, -0x4119999a    # -0.45f

    .line 455
    .line 456
    .line 457
    const/high16 v16, -0x40800000    # -1.0f

    .line 458
    .line 459
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const/high16 v0, -0x3f600000    # -5.0f

    .line 463
    .line 464
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const/high16 v18, 0x3f800000    # 1.0f

    .line 468
    .line 469
    const v13, -0x40f33333    # -0.55f

    .line 470
    .line 471
    .line 472
    const/4 v14, 0x0

    .line 473
    const/high16 v15, -0x40800000    # -1.0f

    .line 474
    .line 475
    const v16, 0x3ee66666    # 0.45f

    .line 476
    .line 477
    .line 478
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const/high16 v17, 0x3f800000    # 1.0f

    .line 482
    .line 483
    const/4 v13, 0x0

    .line 484
    const v14, 0x3f0ccccd    # 0.55f

    .line 485
    .line 486
    .line 487
    const v15, 0x3ee66666    # 0.45f

    .line 488
    .line 489
    .line 490
    const/high16 v16, 0x3f800000    # 1.0f

    .line 491
    .line 492
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const/high16 v0, 0x3f000000    # 0.5f

    .line 496
    .line 497
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v17, -0x40400000    # -1.5f

    .line 501
    .line 502
    const/high16 v18, 0x40400000    # 3.0f

    .line 503
    .line 504
    const/high16 v14, 0x3f000000    # 0.5f

    .line 505
    .line 506
    const/high16 v15, -0x40400000    # -1.5f

    .line 507
    .line 508
    const v16, 0x3f947ae1    # 1.16f

    .line 509
    .line 510
    .line 511
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const/high16 v0, 0x41a00000    # 20.0f

    .line 515
    .line 516
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/high16 v17, 0x40000000    # 2.0f

    .line 520
    .line 521
    const/high16 v18, 0x40000000    # 2.0f

    .line 522
    .line 523
    const v14, 0x3f8ccccd    # 1.1f

    .line 524
    .line 525
    .line 526
    const v15, 0x3f666666    # 0.9f

    .line 527
    .line 528
    .line 529
    const/high16 v16, 0x40000000    # 2.0f

    .line 530
    .line 531
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const/high16 v0, 0x40800000    # 4.0f

    .line 535
    .line 536
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const/high16 v18, -0x40000000    # -2.0f

    .line 540
    .line 541
    const v13, 0x3f8ccccd    # 1.1f

    .line 542
    .line 543
    .line 544
    const/4 v14, 0x0

    .line 545
    const/high16 v15, 0x40000000    # 2.0f

    .line 546
    .line 547
    const v16, -0x4099999a    # -0.9f

    .line 548
    .line 549
    .line 550
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const/high16 v0, -0x3f300000    # -6.5f

    .line 554
    .line 555
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const/high16 v17, 0x419c0000    # 19.5f

    .line 559
    .line 560
    const/high16 v18, 0x41280000    # 10.5f

    .line 561
    .line 562
    const/high16 v13, 0x41a80000    # 21.0f

    .line 563
    .line 564
    const v14, 0x413a8f5c    # 11.66f

    .line 565
    .line 566
    .line 567
    const/high16 v15, 0x419c0000    # 19.5f

    .line 568
    .line 569
    const/high16 v16, 0x41300000    # 11.0f

    .line 570
    .line 571
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const/high16 v0, 0x41840000    # 16.5f

    .line 578
    .line 579
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const/high16 v0, 0x41200000    # 10.0f

    .line 583
    .line 584
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const/high16 v0, 0x3f800000    # 1.0f

    .line 588
    .line 589
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const/high16 v0, 0x3f000000    # 0.5f

    .line 593
    .line 594
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 598
    .line 599
    const/high16 v18, 0x40400000    # 3.0f

    .line 600
    .line 601
    const/4 v13, 0x0

    .line 602
    const v14, 0x3fcccccd    # 1.6f

    .line 603
    .line 604
    .line 605
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 606
    .line 607
    const/high16 v16, 0x40000000    # 2.0f

    .line 608
    .line 609
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    const/high16 v0, 0x41600000    # 14.0f

    .line 613
    .line 614
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const/high16 v0, -0x3f800000    # -4.0f

    .line 618
    .line 619
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const/16 v17, 0x0

    .line 623
    .line 624
    const/high16 v18, -0x41000000    # -0.5f

    .line 625
    .line 626
    const v14, -0x41a8f5c3    # -0.21f

    .line 627
    .line 628
    .line 629
    const/4 v15, 0x0

    .line 630
    const v16, -0x413851ec    # -0.39f

    .line 631
    .line 632
    .line 633
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const/high16 v17, 0x41840000    # 16.5f

    .line 637
    .line 638
    const/high16 v18, 0x41280000    # 10.5f

    .line 639
    .line 640
    const/high16 v13, 0x41700000    # 15.0f

    .line 641
    .line 642
    const/high16 v14, 0x41480000    # 12.5f

    .line 643
    .line 644
    const/high16 v15, 0x41840000    # 16.5f

    .line 645
    .line 646
    const v16, 0x4141999a    # 12.1f

    .line 647
    .line 648
    .line 649
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const/high16 v0, 0x41780000    # 15.5f

    .line 656
    .line 657
    const/high16 v2, 0x41980000    # 19.0f

    .line 658
    .line 659
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const/high16 v0, 0x41880000    # 17.0f

    .line 663
    .line 664
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    const/high16 v0, -0x3f800000    # -4.0f

    .line 668
    .line 669
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    .line 672
    const/16 v17, 0x0

    .line 673
    .line 674
    const/high16 v18, -0x40400000    # -1.5f

    .line 675
    .line 676
    const/4 v13, 0x0

    .line 677
    const v14, -0x40fd70a4    # -0.51f

    .line 678
    .line 679
    .line 680
    const/4 v15, 0x0

    .line 681
    const v16, -0x407d70a4    # -1.02f

    .line 682
    .line 683
    .line 684
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    const/high16 v0, 0x41980000    # 19.0f

    .line 688
    .line 689
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const/high16 v0, 0x41a00000    # 20.0f

    .line 696
    .line 697
    const/high16 v2, 0x41700000    # 15.0f

    .line 698
    .line 699
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    .line 702
    const/4 v14, 0x0

    .line 703
    const v16, -0x40deb852    # -0.63f

    .line 704
    .line 705
    .line 706
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    const/high16 v0, 0x40800000    # 4.0f

    .line 710
    .line 711
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    const/high16 v0, 0x41a00000    # 20.0f

    .line 715
    .line 716
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 717
    .line 718
    .line 719
    const/high16 v0, 0x41700000    # 15.0f

    .line 720
    .line 721
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 722
    .line 723
    .line 724
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 728
    .line 729
    .line 730
    move-result-object v2

    .line 731
    const/16 v16, 0x3800

    .line 732
    .line 733
    const/16 v17, 0x0

    .line 734
    .line 735
    const/high16 v6, 0x3f800000    # 1.0f

    .line 736
    .line 737
    const/high16 v8, 0x3f800000    # 1.0f

    .line 738
    .line 739
    const/4 v7, 0x0

    .line 740
    const/high16 v9, 0x3f800000    # 1.0f

    .line 741
    .line 742
    const/high16 v12, 0x3f800000    # 1.0f

    .line 743
    .line 744
    const-string v4, ""

    .line 745
    .line 746
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 747
    .line 748
    .line 749
    move-result-object v0

    .line 750
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 751
    .line 752
    .line 753
    move-result-object v0

    .line 754
    sput-object v0, Landroidx/compose/material/icons/outlined/VaccinesKt;->_vaccines:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 755
    .line 756
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 757
    .line 758
    .line 759
    return-object v0
.end method
