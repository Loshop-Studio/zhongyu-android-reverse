.class public final Landroidx/compose/material/icons/automirrored/outlined/MenuBookKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_menuBook",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "MenuBook",
        "Landroidx/compose/material/icons/Icons$AutoMirrored$Outlined;",
        "getMenuBook",
        "(Landroidx/compose/material/icons/Icons$AutoMirrored$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nMenuBook.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuBook.kt\nandroidx/compose/material/icons/automirrored/outlined/MenuBookKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,92:1\n223#2:93\n216#2,3:94\n219#2,4:98\n233#2,18:102\n253#2:139\n233#2,18:140\n253#2:177\n233#2,18:178\n253#2:215\n233#2,18:216\n253#2:253\n174#3:97\n705#4,2:120\n717#4,2:122\n719#4,11:128\n705#4,2:158\n717#4,2:160\n719#4,11:166\n705#4,2:196\n717#4,2:198\n719#4,11:204\n705#4,2:234\n717#4,2:236\n719#4,11:242\n72#5,4:124\n72#5,4:162\n72#5,4:200\n72#5,4:238\n*S KotlinDebug\n*F\n+ 1 MenuBook.kt\nandroidx/compose/material/icons/automirrored/outlined/MenuBookKt\n*L\n29#1:93\n29#1:94,3\n29#1:98,4\n30#1:102,18\n30#1:139\n57#1:140,18\n57#1:177\n67#1:178,18\n67#1:215\n77#1:216,18\n77#1:253\n29#1:97\n30#1:120,2\n30#1:122,2\n30#1:128,11\n57#1:158,2\n57#1:160,2\n57#1:166,11\n67#1:196,2\n67#1:198,2\n67#1:204,11\n77#1:234,2\n77#1:236,2\n77#1:242,11\n30#1:124,4\n57#1:162,4\n67#1:200,4\n77#1:238,4\n*E\n"
    }
.end annotation


# static fields
.field private static _menuBook:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMenuBook(Landroidx/compose/material/icons/Icons$AutoMirrored$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/automirrored/outlined/MenuBookKt;->_menuBook:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const/4 v10, 0x1

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
    const-string v2, "AutoMirrored.Outlined.MenuBook"

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
    const/high16 v4, 0x40a00000    # 5.0f

    .line 71
    .line 72
    const/high16 v6, 0x41a80000    # 21.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3fa00000    # -3.5f

    .line 78
    .line 79
    const/high16 v26, -0x41000000    # -0.5f

    .line 80
    .line 81
    const v21, -0x4071eb85    # -1.11f

    .line 82
    .line 83
    .line 84
    const v22, -0x414ccccd    # -0.35f

    .line 85
    .line 86
    .line 87
    const v23, -0x3feae148    # -2.33f

    .line 88
    .line 89
    .line 90
    const/high16 v24, -0x41000000    # -0.5f

    .line 91
    .line 92
    move-object/from16 v20, v2

    .line 93
    .line 94
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v25, -0x3f500000    # -5.5f

    .line 98
    .line 99
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 100
    .line 101
    const v21, -0x40066666    # -1.95f

    .line 102
    .line 103
    .line 104
    const/16 v22, 0x0

    .line 105
    .line 106
    const v23, -0x3f7e6666    # -4.05f

    .line 107
    .line 108
    .line 109
    const v24, 0x3ecccccd    # 0.4f

    .line 110
    .line 111
    .line 112
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v26, -0x40400000    # -1.5f

    .line 116
    .line 117
    const v21, -0x40466666    # -1.45f

    .line 118
    .line 119
    .line 120
    const v22, -0x40733333    # -1.1f

    .line 121
    .line 122
    .line 123
    const v23, -0x3f9ccccd    # -3.55f

    .line 124
    .line 125
    .line 126
    const/high16 v24, -0x40400000    # -1.5f

    .line 127
    .line 128
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v4, 0x409ccccd    # 4.9f

    .line 132
    .line 133
    .line 134
    const/high16 v6, 0x3f800000    # 1.0f

    .line 135
    .line 136
    const/high16 v7, 0x40c00000    # 6.0f

    .line 137
    .line 138
    const v8, 0x401ccccd    # 2.45f

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2, v8, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v4, 0x416a6666    # 14.65f

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v25, 0x3f000000    # 0.5f

    .line 151
    .line 152
    const/high16 v26, 0x3f000000    # 0.5f

    .line 153
    .line 154
    const/16 v21, 0x0

    .line 155
    .line 156
    const/high16 v22, 0x3e800000    # 0.25f

    .line 157
    .line 158
    const/high16 v23, 0x3e800000    # 0.25f

    .line 159
    .line 160
    const/high16 v24, 0x3f000000    # 0.5f

    .line 161
    .line 162
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v25, 0x3e800000    # 0.25f

    .line 166
    .line 167
    const v26, -0x42b33333    # -0.05f

    .line 168
    .line 169
    .line 170
    const v21, 0x3dcccccd    # 0.1f

    .line 171
    .line 172
    .line 173
    const/16 v22, 0x0

    .line 174
    .line 175
    const v23, 0x3e19999a    # 0.15f

    .line 176
    .line 177
    .line 178
    const v24, -0x42b33333    # -0.05f

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const/high16 v25, 0x40d00000    # 6.5f

    .line 185
    .line 186
    const/high16 v26, 0x41a00000    # 20.0f

    .line 187
    .line 188
    const v21, 0x40466666    # 3.1f

    .line 189
    .line 190
    .line 191
    const v22, 0x41a3999a    # 20.45f

    .line 192
    .line 193
    .line 194
    const v23, 0x40a1999a    # 5.05f

    .line 195
    .line 196
    .line 197
    const/high16 v24, 0x41a00000    # 20.0f

    .line 198
    .line 199
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v25, 0x40b00000    # 5.5f

    .line 203
    .line 204
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 205
    .line 206
    const v21, 0x3ff9999a    # 1.95f

    .line 207
    .line 208
    .line 209
    const/16 v22, 0x0

    .line 210
    .line 211
    const v23, 0x4081999a    # 4.05f

    .line 212
    .line 213
    .line 214
    const v24, 0x3ecccccd    # 0.4f

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v26, -0x40400000    # -1.5f

    .line 221
    .line 222
    const v21, 0x3faccccd    # 1.35f

    .line 223
    .line 224
    .line 225
    const v22, -0x40a66666    # -0.85f

    .line 226
    .line 227
    .line 228
    const v23, 0x40733333    # 3.8f

    .line 229
    .line 230
    .line 231
    const/high16 v24, -0x40400000    # -1.5f

    .line 232
    .line 233
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v25, 0x40980000    # 4.75f

    .line 237
    .line 238
    const v26, 0x3f866666    # 1.05f

    .line 239
    .line 240
    .line 241
    const v21, 0x3fd33333    # 1.65f

    .line 242
    .line 243
    .line 244
    const/16 v22, 0x0

    .line 245
    .line 246
    const v23, 0x40566666    # 3.35f

    .line 247
    .line 248
    .line 249
    const v24, 0x3e99999a    # 0.3f

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v25, 0x3e800000    # 0.25f

    .line 256
    .line 257
    const v26, 0x3d4ccccd    # 0.05f

    .line 258
    .line 259
    .line 260
    const v21, 0x3dcccccd    # 0.1f

    .line 261
    .line 262
    .line 263
    const v22, 0x3d4ccccd    # 0.05f

    .line 264
    .line 265
    .line 266
    const v23, 0x3e19999a    # 0.15f

    .line 267
    .line 268
    .line 269
    const v24, 0x3d4ccccd    # 0.05f

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v25, 0x3f000000    # 0.5f

    .line 276
    .line 277
    const/high16 v26, -0x41000000    # -0.5f

    .line 278
    .line 279
    const/high16 v21, 0x3e800000    # 0.25f

    .line 280
    .line 281
    const/16 v22, 0x0

    .line 282
    .line 283
    const/high16 v23, 0x3f000000    # 0.5f

    .line 284
    .line 285
    const/high16 v24, -0x41800000    # -0.25f

    .line 286
    .line 287
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v4, 0x40c00000    # 6.0f

    .line 291
    .line 292
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v25, 0x41a80000    # 21.0f

    .line 296
    .line 297
    const/high16 v26, 0x40a00000    # 5.0f

    .line 298
    .line 299
    const v21, 0x41b33333    # 22.4f

    .line 300
    .line 301
    .line 302
    const v22, 0x40b1999a    # 5.55f

    .line 303
    .line 304
    .line 305
    const/high16 v23, 0x41ae0000    # 21.75f

    .line 306
    .line 307
    const/high16 v24, 0x40a80000    # 5.25f

    .line 308
    .line 309
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v4, 0x41940000    # 18.5f

    .line 316
    .line 317
    const/high16 v6, 0x41a80000    # 21.0f

    .line 318
    .line 319
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/high16 v25, -0x3fa00000    # -3.5f

    .line 323
    .line 324
    const/high16 v26, -0x41000000    # -0.5f

    .line 325
    .line 326
    const v21, -0x40733333    # -1.1f

    .line 327
    .line 328
    .line 329
    const v22, -0x414ccccd    # -0.35f

    .line 330
    .line 331
    .line 332
    const v23, -0x3feccccd    # -2.3f

    .line 333
    .line 334
    .line 335
    const/high16 v24, -0x41000000    # -0.5f

    .line 336
    .line 337
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v25, -0x3f500000    # -5.5f

    .line 341
    .line 342
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 343
    .line 344
    const v21, -0x40266666    # -1.7f

    .line 345
    .line 346
    .line 347
    const/16 v22, 0x0

    .line 348
    .line 349
    const v23, -0x3f7b3333    # -4.15f

    .line 350
    .line 351
    .line 352
    const v24, 0x3f266666    # 0.65f

    .line 353
    .line 354
    .line 355
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v4, 0x41000000    # 8.0f

    .line 359
    .line 360
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const/high16 v25, 0x40b00000    # 5.5f

    .line 364
    .line 365
    const/high16 v26, -0x40400000    # -1.5f

    .line 366
    .line 367
    const v21, 0x3faccccd    # 1.35f

    .line 368
    .line 369
    .line 370
    const v22, -0x40a66666    # -0.85f

    .line 371
    .line 372
    .line 373
    const v23, 0x40733333    # 3.8f

    .line 374
    .line 375
    .line 376
    const/high16 v24, -0x40400000    # -1.5f

    .line 377
    .line 378
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v25, 0x40600000    # 3.5f

    .line 382
    .line 383
    const/high16 v26, 0x3f000000    # 0.5f

    .line 384
    .line 385
    const v21, 0x3f99999a    # 1.2f

    .line 386
    .line 387
    .line 388
    const/16 v22, 0x0

    .line 389
    .line 390
    const v23, 0x4019999a    # 2.4f

    .line 391
    .line 392
    .line 393
    const v24, 0x3e19999a    # 0.15f

    .line 394
    .line 395
    .line 396
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const/high16 v4, 0x41940000    # 18.5f

    .line 400
    .line 401
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 408
    .line 409
    .line 410
    move-result-object v2

    .line 411
    const/16 v16, 0x3800

    .line 412
    .line 413
    const/16 v17, 0x0

    .line 414
    .line 415
    const/high16 v6, 0x3f800000    # 1.0f

    .line 416
    .line 417
    const/high16 v8, 0x3f800000    # 1.0f

    .line 418
    .line 419
    const/4 v7, 0x0

    .line 420
    const/high16 v9, 0x3f800000    # 1.0f

    .line 421
    .line 422
    const/high16 v12, 0x3f800000    # 1.0f

    .line 423
    .line 424
    const/4 v13, 0x0

    .line 425
    const/4 v14, 0x0

    .line 426
    const/4 v15, 0x0

    .line 427
    const-string v4, ""

    .line 428
    .line 429
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 430
    .line 431
    .line 432
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 433
    .line 434
    .line 435
    move-result v3

    .line 436
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 437
    .line 438
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 439
    .line 440
    .line 441
    move-result-wide v6

    .line 442
    const/4 v2, 0x0

    .line 443
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 444
    .line 445
    .line 446
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 447
    .line 448
    .line 449
    move-result v10

    .line 450
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 451
    .line 452
    .line 453
    move-result v11

    .line 454
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 457
    .line 458
    .line 459
    const/high16 v4, 0x41280000    # 10.5f

    .line 460
    .line 461
    const/high16 v6, 0x418c0000    # 17.5f

    .line 462
    .line 463
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const/high16 v25, 0x40200000    # 2.5f

    .line 467
    .line 468
    const v26, 0x3e851eb8    # 0.26f

    .line 469
    .line 470
    .line 471
    const v21, 0x3f6147ae    # 0.88f

    .line 472
    .line 473
    .line 474
    const v23, 0x3fdd70a4    # 1.73f

    .line 475
    .line 476
    .line 477
    const v24, 0x3db851ec    # 0.09f

    .line 478
    .line 479
    .line 480
    move-object/from16 v20, v2

    .line 481
    .line 482
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v4, 0x4113d70a    # 9.24f

    .line 486
    .line 487
    .line 488
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const/high16 v25, 0x418c0000    # 17.5f

    .line 492
    .line 493
    const/high16 v26, 0x41100000    # 9.0f

    .line 494
    .line 495
    const v21, 0x4199ae14    # 19.21f

    .line 496
    .line 497
    .line 498
    const v22, 0x411170a4    # 9.09f

    .line 499
    .line 500
    .line 501
    const v23, 0x4192e148    # 18.36f

    .line 502
    .line 503
    .line 504
    const/high16 v24, 0x41100000    # 9.0f

    .line 505
    .line 506
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const/high16 v25, -0x3f700000    # -4.5f

    .line 510
    .line 511
    const v26, 0x3f547ae1    # 0.83f

    .line 512
    .line 513
    .line 514
    const v21, -0x40266666    # -1.7f

    .line 515
    .line 516
    .line 517
    const/16 v22, 0x0

    .line 518
    .line 519
    const v23, -0x3fb0a3d7    # -3.24f

    .line 520
    .line 521
    .line 522
    const v24, 0x3e947ae1    # 0.29f

    .line 523
    .line 524
    .line 525
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const v4, 0x3fd47ae1    # 1.66f

    .line 529
    .line 530
    .line 531
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const/high16 v25, 0x418c0000    # 17.5f

    .line 535
    .line 536
    const/high16 v26, 0x41280000    # 10.5f

    .line 537
    .line 538
    const v21, 0x4162147b    # 14.13f

    .line 539
    .line 540
    .line 541
    const v22, 0x412d999a    # 10.85f

    .line 542
    .line 543
    .line 544
    const v23, 0x417b3333    # 15.7f

    .line 545
    .line 546
    .line 547
    const/high16 v24, 0x41280000    # 10.5f

    .line 548
    .line 549
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 556
    .line 557
    .line 558
    move-result-object v2

    .line 559
    const/high16 v6, 0x3f800000    # 1.0f

    .line 560
    .line 561
    const/4 v7, 0x0

    .line 562
    const-string v4, ""

    .line 563
    .line 564
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 565
    .line 566
    .line 567
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 568
    .line 569
    .line 570
    move-result v3

    .line 571
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 572
    .line 573
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 574
    .line 575
    .line 576
    move-result-wide v6

    .line 577
    const/4 v2, 0x0

    .line 578
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 579
    .line 580
    .line 581
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 582
    .line 583
    .line 584
    move-result v10

    .line 585
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 586
    .line 587
    .line 588
    move-result v11

    .line 589
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 592
    .line 593
    .line 594
    const/high16 v4, 0x41500000    # 13.0f

    .line 595
    .line 596
    const v6, 0x4147d70a    # 12.49f

    .line 597
    .line 598
    .line 599
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const v4, 0x3fd47ae1    # 1.66f

    .line 603
    .line 604
    .line 605
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const/high16 v25, 0x40900000    # 4.5f

    .line 609
    .line 610
    const v26, -0x40828f5c    # -0.99f

    .line 611
    .line 612
    .line 613
    const v21, 0x3f90a3d7    # 1.13f

    .line 614
    .line 615
    .line 616
    const v22, -0x40dc28f6    # -0.64f

    .line 617
    .line 618
    .line 619
    const v23, 0x402ccccd    # 2.7f

    .line 620
    .line 621
    .line 622
    const v24, -0x40828f5c    # -0.99f

    .line 623
    .line 624
    .line 625
    move-object/from16 v20, v2

    .line 626
    .line 627
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    const/high16 v25, 0x40200000    # 2.5f

    .line 631
    .line 632
    const v26, 0x3e851eb8    # 0.26f

    .line 633
    .line 634
    .line 635
    const v21, 0x3f6147ae    # 0.88f

    .line 636
    .line 637
    .line 638
    const/16 v22, 0x0

    .line 639
    .line 640
    const v23, 0x3fdd70a4    # 1.73f

    .line 641
    .line 642
    .line 643
    const v24, 0x3db851ec    # 0.09f

    .line 644
    .line 645
    .line 646
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const v4, 0x413e6666    # 11.9f

    .line 650
    .line 651
    .line 652
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const/high16 v25, -0x3fe00000    # -2.5f

    .line 656
    .line 657
    const v26, -0x418a3d71    # -0.24f

    .line 658
    .line 659
    .line 660
    const v21, -0x40b5c28f    # -0.79f

    .line 661
    .line 662
    .line 663
    const v22, -0x41e66666    # -0.15f

    .line 664
    .line 665
    .line 666
    const v23, -0x402e147b    # -1.64f

    .line 667
    .line 668
    .line 669
    const v24, -0x418a3d71    # -0.24f

    .line 670
    .line 671
    .line 672
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    const/high16 v25, 0x41500000    # 13.0f

    .line 676
    .line 677
    const v26, 0x4147d70a    # 12.49f

    .line 678
    .line 679
    .line 680
    const v21, 0x417ccccd    # 15.8f

    .line 681
    .line 682
    .line 683
    const v22, 0x413a8f5c    # 11.66f

    .line 684
    .line 685
    .line 686
    const v23, 0x416428f6    # 14.26f

    .line 687
    .line 688
    .line 689
    const v24, 0x413f5c29    # 11.96f

    .line 690
    .line 691
    .line 692
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 696
    .line 697
    .line 698
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 699
    .line 700
    .line 701
    move-result-object v2

    .line 702
    const/high16 v6, 0x3f800000    # 1.0f

    .line 703
    .line 704
    const/4 v7, 0x0

    .line 705
    const-string v4, ""

    .line 706
    .line 707
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 708
    .line 709
    .line 710
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 711
    .line 712
    .line 713
    move-result v3

    .line 714
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 715
    .line 716
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 717
    .line 718
    .line 719
    move-result-wide v6

    .line 720
    const/4 v0, 0x0

    .line 721
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 722
    .line 723
    .line 724
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 725
    .line 726
    .line 727
    move-result v10

    .line 728
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 729
    .line 730
    .line 731
    move-result v11

    .line 732
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 733
    .line 734
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 735
    .line 736
    .line 737
    const v0, 0x416547ae    # 14.33f

    .line 738
    .line 739
    .line 740
    const/high16 v2, 0x418c0000    # 17.5f

    .line 741
    .line 742
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    const/high16 v17, -0x3f700000    # -4.5f

    .line 746
    .line 747
    const v18, 0x3f547ae1    # 0.83f

    .line 748
    .line 749
    .line 750
    const v13, -0x40266666    # -1.7f

    .line 751
    .line 752
    .line 753
    const v15, -0x3fb0a3d7    # -3.24f

    .line 754
    .line 755
    .line 756
    const v16, 0x3e947ae1    # 0.29f

    .line 757
    .line 758
    .line 759
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 760
    .line 761
    .line 762
    const v0, 0x3fd47ae1    # 1.66f

    .line 763
    .line 764
    .line 765
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 766
    .line 767
    .line 768
    const/high16 v17, 0x40900000    # 4.5f

    .line 769
    .line 770
    const v18, -0x40828f5c    # -0.99f

    .line 771
    .line 772
    .line 773
    const v13, 0x3f90a3d7    # 1.13f

    .line 774
    .line 775
    .line 776
    const v14, -0x40dc28f6    # -0.64f

    .line 777
    .line 778
    .line 779
    const v15, 0x402ccccd    # 2.7f

    .line 780
    .line 781
    .line 782
    const v16, -0x40828f5c    # -0.99f

    .line 783
    .line 784
    .line 785
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 786
    .line 787
    .line 788
    const/high16 v17, 0x40200000    # 2.5f

    .line 789
    .line 790
    const v18, 0x3e851eb8    # 0.26f

    .line 791
    .line 792
    .line 793
    const v13, 0x3f6147ae    # 0.88f

    .line 794
    .line 795
    .line 796
    const/4 v14, 0x0

    .line 797
    const v15, 0x3fdd70a4    # 1.73f

    .line 798
    .line 799
    .line 800
    const v16, 0x3db851ec    # 0.09f

    .line 801
    .line 802
    .line 803
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 804
    .line 805
    .line 806
    const v0, -0x403d70a4    # -1.52f

    .line 807
    .line 808
    .line 809
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 810
    .line 811
    .line 812
    const/high16 v17, 0x418c0000    # 17.5f

    .line 813
    .line 814
    const v18, 0x416547ae    # 14.33f

    .line 815
    .line 816
    .line 817
    const v13, 0x4199ae14    # 19.21f

    .line 818
    .line 819
    .line 820
    const v14, 0x41668f5c    # 14.41f

    .line 821
    .line 822
    .line 823
    const v15, 0x4192e148    # 18.36f

    .line 824
    .line 825
    .line 826
    const v16, 0x416547ae    # 14.33f

    .line 827
    .line 828
    .line 829
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 830
    .line 831
    .line 832
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 833
    .line 834
    .line 835
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 836
    .line 837
    .line 838
    move-result-object v2

    .line 839
    const/16 v16, 0x3800

    .line 840
    .line 841
    const/16 v17, 0x0

    .line 842
    .line 843
    const/high16 v6, 0x3f800000    # 1.0f

    .line 844
    .line 845
    const/4 v7, 0x0

    .line 846
    const/high16 v12, 0x3f800000    # 1.0f

    .line 847
    .line 848
    const/4 v13, 0x0

    .line 849
    const/4 v14, 0x0

    .line 850
    const/4 v15, 0x0

    .line 851
    const-string v4, ""

    .line 852
    .line 853
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 854
    .line 855
    .line 856
    move-result-object v0

    .line 857
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 858
    .line 859
    .line 860
    move-result-object v0

    .line 861
    sput-object v0, Landroidx/compose/material/icons/automirrored/outlined/MenuBookKt;->_menuBook:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 862
    .line 863
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 864
    .line 865
    .line 866
    return-object v0
.end method
