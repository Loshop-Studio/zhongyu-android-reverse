.class public final Landroidx/compose/material/icons/rounded/EarbudsBatteryKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_earbudsBattery",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "EarbudsBattery",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getEarbudsBattery",
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
        "SMAP\nEarbudsBattery.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EarbudsBattery.kt\nandroidx/compose/material/icons/rounded/EarbudsBatteryKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,79:1\n212#2,12:80\n233#2,18:93\n253#2:130\n174#3:92\n705#4,2:111\n717#4,2:113\n719#4,11:119\n72#5,4:115\n*S KotlinDebug\n*F\n+ 1 EarbudsBattery.kt\nandroidx/compose/material/icons/rounded/EarbudsBatteryKt\n*L\n29#1:80,12\n30#1:93,18\n30#1:130\n29#1:92\n30#1:111,2\n30#1:113,2\n30#1:119,11\n30#1:115,4\n*E\n"
    }
.end annotation


# static fields
.field private static _earbudsBattery:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getEarbudsBattery(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/EarbudsBatteryKt;->_earbudsBattery:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.EarbudsBattery"

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
    const/high16 v0, 0x41a80000    # 21.0f

    .line 71
    .line 72
    const/high16 v2, 0x40e00000    # 7.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, -0x40800000    # -1.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/4 v0, 0x0

    .line 83
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const/high16 v0, 0x40d00000    # 6.5f

    .line 87
    .line 88
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 89
    .line 90
    .line 91
    const/high16 v17, 0x419c0000    # 19.5f

    .line 92
    .line 93
    const/high16 v18, 0x40c00000    # 6.0f

    .line 94
    .line 95
    const/high16 v13, 0x41a00000    # 20.0f

    .line 96
    .line 97
    const v14, 0x40c70a3d    # 6.22f

    .line 98
    .line 99
    .line 100
    const v15, 0x419e3d71    # 19.78f

    .line 101
    .line 102
    .line 103
    const/high16 v16, 0x40c00000    # 6.0f

    .line 104
    .line 105
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const/high16 v0, -0x40800000    # -1.0f

    .line 109
    .line 110
    const/4 v2, 0x0

    .line 111
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/high16 v17, 0x41900000    # 18.0f

    .line 115
    .line 116
    const/high16 v18, 0x40d00000    # 6.5f

    .line 117
    .line 118
    const v13, 0x4191c28f    # 18.22f

    .line 119
    .line 120
    .line 121
    const/high16 v14, 0x40c00000    # 6.0f

    .line 122
    .line 123
    const/high16 v15, 0x41900000    # 18.0f

    .line 124
    .line 125
    const v16, 0x40c70a3d    # 6.22f

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v0, 0x40e00000    # 7.0f

    .line 132
    .line 133
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/4 v0, 0x0

    .line 137
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v0, -0x40800000    # -1.0f

    .line 141
    .line 142
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const/high16 v17, -0x40800000    # -1.0f

    .line 146
    .line 147
    const/high16 v18, 0x3f800000    # 1.0f

    .line 148
    .line 149
    const v13, -0x40f33333    # -0.55f

    .line 150
    .line 151
    .line 152
    const/4 v14, 0x0

    .line 153
    const/high16 v15, -0x40800000    # -1.0f

    .line 154
    .line 155
    const v16, 0x3ee66666    # 0.45f

    .line 156
    .line 157
    .line 158
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/high16 v0, 0x41100000    # 9.0f

    .line 162
    .line 163
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v17, 0x3f800000    # 1.0f

    .line 167
    .line 168
    const/4 v13, 0x0

    .line 169
    const v14, 0x3f0ccccd    # 0.55f

    .line 170
    .line 171
    .line 172
    const v15, 0x3ee66666    # 0.45f

    .line 173
    .line 174
    .line 175
    const/high16 v16, 0x3f800000    # 1.0f

    .line 176
    .line 177
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const/high16 v0, 0x40800000    # 4.0f

    .line 181
    .line 182
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const/high16 v18, -0x40800000    # -1.0f

    .line 186
    .line 187
    const v13, 0x3f0ccccd    # 0.55f

    .line 188
    .line 189
    .line 190
    const/4 v14, 0x0

    .line 191
    const/high16 v15, 0x3f800000    # 1.0f

    .line 192
    .line 193
    const v16, -0x4119999a    # -0.45f

    .line 194
    .line 195
    .line 196
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/high16 v0, 0x41000000    # 8.0f

    .line 200
    .line 201
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v17, 0x41a80000    # 21.0f

    .line 205
    .line 206
    const/high16 v18, 0x40e00000    # 7.0f

    .line 207
    .line 208
    const/high16 v13, 0x41b00000    # 22.0f

    .line 209
    .line 210
    const v14, 0x40ee6666    # 7.45f

    .line 211
    .line 212
    .line 213
    const v15, 0x41ac6666    # 21.55f

    .line 214
    .line 215
    .line 216
    const/high16 v16, 0x40e00000    # 7.0f

    .line 217
    .line 218
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/high16 v0, 0x41600000    # 14.0f

    .line 225
    .line 226
    const v2, 0x4116147b    # 9.38f

    .line 227
    .line 228
    .line 229
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v17, 0x4129eb85    # 10.62f

    .line 233
    .line 234
    .line 235
    const/high16 v18, 0x40c00000    # 6.0f

    .line 236
    .line 237
    const/high16 v13, 0x41600000    # 14.0f

    .line 238
    .line 239
    const v14, 0x40f051ec    # 7.51f

    .line 240
    .line 241
    .line 242
    const v15, 0x4147d70a    # 12.49f

    .line 243
    .line 244
    .line 245
    const/high16 v16, 0x40c00000    # 6.0f

    .line 246
    .line 247
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v0, 0x40f051ec    # 7.51f

    .line 251
    .line 252
    .line 253
    const/high16 v2, 0x40e80000    # 7.25f

    .line 254
    .line 255
    const v4, 0x4116147b    # 9.38f

    .line 256
    .line 257
    .line 258
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v0, 0x40a80000    # 5.25f

    .line 262
    .line 263
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v17, -0x400f5c29    # -1.88f

    .line 267
    .line 268
    .line 269
    const v18, 0x3ff0a3d7    # 1.88f

    .line 270
    .line 271
    .line 272
    const/4 v13, 0x0

    .line 273
    const v14, 0x3f851eb8    # 1.04f

    .line 274
    .line 275
    .line 276
    const v15, -0x40a8f5c3    # -0.84f

    .line 277
    .line 278
    .line 279
    const v16, 0x3ff0a3d7    # 1.88f

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v0, 0x417a8f5c    # 15.66f

    .line 286
    .line 287
    .line 288
    const v2, 0x4169eb85    # 14.62f

    .line 289
    .line 290
    .line 291
    const/high16 v4, 0x40600000    # 3.5f

    .line 292
    .line 293
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v0, -0x3f69999a    # -4.7f

    .line 297
    .line 298
    .line 299
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const/high16 v17, 0x40800000    # 4.0f

    .line 303
    .line 304
    const/high16 v18, 0x41200000    # 10.0f

    .line 305
    .line 306
    const v13, 0x406a3d71    # 3.66f

    .line 307
    .line 308
    .line 309
    const v14, 0x411f851f    # 9.97f

    .line 310
    .line 311
    .line 312
    const v15, 0x40751eb8    # 3.83f

    .line 313
    .line 314
    .line 315
    const/high16 v16, 0x41200000    # 10.0f

    .line 316
    .line 317
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/high16 v17, 0x40000000    # 2.0f

    .line 321
    .line 322
    const/high16 v18, -0x40000000    # -2.0f

    .line 323
    .line 324
    const v13, 0x3f8ccccd    # 1.1f

    .line 325
    .line 326
    .line 327
    const/4 v14, 0x0

    .line 328
    const/high16 v15, 0x40000000    # 2.0f

    .line 329
    .line 330
    const v16, -0x4099999a    # -0.9f

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v0, 0x40a33333    # 5.1f

    .line 337
    .line 338
    .line 339
    const/high16 v2, 0x40c00000    # 6.0f

    .line 340
    .line 341
    const/high16 v4, 0x40800000    # 4.0f

    .line 342
    .line 343
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v0, 0x40dccccd    # 6.9f

    .line 347
    .line 348
    .line 349
    const/high16 v2, 0x41000000    # 8.0f

    .line 350
    .line 351
    const/high16 v4, 0x40000000    # 2.0f

    .line 352
    .line 353
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/16 v17, 0x0

    .line 357
    .line 358
    const v18, 0x40d3d70a    # 6.62f

    .line 359
    .line 360
    .line 361
    const/4 v13, 0x0

    .line 362
    const v14, 0x3d23d70a    # 0.04f

    .line 363
    .line 364
    .line 365
    const/4 v15, 0x0

    .line 366
    const v16, 0x40d3d70a    # 6.62f

    .line 367
    .line 368
    .line 369
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v17, 0x40ac28f6    # 5.38f

    .line 373
    .line 374
    .line 375
    const/high16 v18, 0x41900000    # 18.0f

    .line 376
    .line 377
    const/high16 v13, 0x40000000    # 2.0f

    .line 378
    .line 379
    const v14, 0x4183eb85    # 16.49f

    .line 380
    .line 381
    .line 382
    const v15, 0x4060a3d7    # 3.51f

    .line 383
    .line 384
    .line 385
    const/high16 v16, 0x41900000    # 18.0f

    .line 386
    .line 387
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v0, -0x403eb852    # -1.51f

    .line 391
    .line 392
    .line 393
    const v2, -0x3fa7ae14    # -3.38f

    .line 394
    .line 395
    .line 396
    const v4, 0x405851ec    # 3.38f

    .line 397
    .line 398
    .line 399
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v0, 0x4116147b    # 9.38f

    .line 403
    .line 404
    .line 405
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v17, 0x3ff0a3d7    # 1.88f

    .line 409
    .line 410
    .line 411
    const v18, -0x400f5c29    # -1.88f

    .line 412
    .line 413
    .line 414
    const/4 v13, 0x0

    .line 415
    const v14, -0x407ae148    # -1.04f

    .line 416
    .line 417
    .line 418
    const v15, 0x3f570a3d    # 0.84f

    .line 419
    .line 420
    .line 421
    const v16, -0x400f5c29    # -1.88f

    .line 422
    .line 423
    .line 424
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v0, 0x3f570a3d    # 0.84f

    .line 428
    .line 429
    .line 430
    const v2, 0x3ff0a3d7    # 1.88f

    .line 431
    .line 432
    .line 433
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v0, 0x40966666    # 4.7f

    .line 437
    .line 438
    .line 439
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const/high16 v17, 0x41400000    # 12.0f

    .line 443
    .line 444
    const/high16 v18, 0x41600000    # 14.0f

    .line 445
    .line 446
    const v13, 0x414570a4    # 12.34f

    .line 447
    .line 448
    .line 449
    const v14, 0x41607ae1    # 14.03f

    .line 450
    .line 451
    .line 452
    const v15, 0x4142b852    # 12.17f

    .line 453
    .line 454
    .line 455
    const/high16 v16, 0x41600000    # 14.0f

    .line 456
    .line 457
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const/high16 v17, -0x40000000    # -2.0f

    .line 461
    .line 462
    const/high16 v18, 0x40000000    # 2.0f

    .line 463
    .line 464
    const v13, -0x40733333    # -1.1f

    .line 465
    .line 466
    .line 467
    const/4 v14, 0x0

    .line 468
    const/high16 v15, -0x40000000    # -2.0f

    .line 469
    .line 470
    const v16, 0x3f666666    # 0.9f

    .line 471
    .line 472
    .line 473
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const v0, 0x3f666666    # 0.9f

    .line 477
    .line 478
    .line 479
    const/high16 v2, 0x40000000    # 2.0f

    .line 480
    .line 481
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const v0, -0x4099999a    # -0.9f

    .line 485
    .line 486
    .line 487
    const/high16 v2, -0x40000000    # -2.0f

    .line 488
    .line 489
    const/high16 v4, 0x40000000    # 2.0f

    .line 490
    .line 491
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const/high16 v17, 0x41600000    # 14.0f

    .line 495
    .line 496
    const v18, 0x4116147b    # 9.38f

    .line 497
    .line 498
    .line 499
    const/high16 v13, 0x41600000    # 14.0f

    .line 500
    .line 501
    const v14, 0x417f5c29    # 15.96f

    .line 502
    .line 503
    .line 504
    const/high16 v15, 0x41600000    # 14.0f

    .line 505
    .line 506
    const v16, 0x4116147b    # 9.38f

    .line 507
    .line 508
    .line 509
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 516
    .line 517
    .line 518
    move-result-object v2

    .line 519
    const/16 v16, 0x3800

    .line 520
    .line 521
    const/16 v17, 0x0

    .line 522
    .line 523
    const/high16 v6, 0x3f800000    # 1.0f

    .line 524
    .line 525
    const/high16 v8, 0x3f800000    # 1.0f

    .line 526
    .line 527
    const/4 v7, 0x0

    .line 528
    const/high16 v9, 0x3f800000    # 1.0f

    .line 529
    .line 530
    const/high16 v12, 0x3f800000    # 1.0f

    .line 531
    .line 532
    const/4 v13, 0x0

    .line 533
    const/4 v14, 0x0

    .line 534
    const/4 v15, 0x0

    .line 535
    const-string v4, ""

    .line 536
    .line 537
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 542
    .line 543
    .line 544
    move-result-object v0

    .line 545
    sput-object v0, Landroidx/compose/material/icons/rounded/EarbudsBatteryKt;->_earbudsBattery:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 546
    .line 547
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 548
    .line 549
    .line 550
    return-object v0
.end method
