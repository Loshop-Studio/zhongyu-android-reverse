.class public final Landroidx/compose/material/icons/outlined/EarbudsBatteryKt;
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
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getEarbudsBattery",
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
        "SMAP\nEarbudsBattery.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EarbudsBattery.kt\nandroidx/compose/material/icons/outlined/EarbudsBatteryKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,81:1\n212#2,12:82\n233#2,18:95\n253#2:132\n174#3:94\n705#4,2:113\n717#4,2:115\n719#4,11:121\n72#5,4:117\n*S KotlinDebug\n*F\n+ 1 EarbudsBattery.kt\nandroidx/compose/material/icons/outlined/EarbudsBatteryKt\n*L\n29#1:82,12\n30#1:95,18\n30#1:132\n29#1:94\n30#1:113,2\n30#1:115,2\n30#1:121,11\n30#1:117,4\n*E\n"
    }
.end annotation


# static fields
.field private static _earbudsBattery:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getEarbudsBattery(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/EarbudsBatteryKt;->_earbudsBattery:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.EarbudsBattery"

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
    const/high16 v0, 0x40c00000    # 6.0f

    .line 83
    .line 84
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v0, -0x40000000    # -2.0f

    .line 88
    .line 89
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/high16 v0, 0x3f800000    # 1.0f

    .line 93
    .line 94
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v0, -0x40800000    # -1.0f

    .line 98
    .line 99
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v17, -0x40800000    # -1.0f

    .line 103
    .line 104
    const/high16 v18, 0x3f800000    # 1.0f

    .line 105
    .line 106
    const v13, -0x40f33333    # -0.55f

    .line 107
    .line 108
    .line 109
    const/4 v14, 0x0

    .line 110
    const/high16 v15, -0x40800000    # -1.0f

    .line 111
    .line 112
    const v16, 0x3ee66666    # 0.45f

    .line 113
    .line 114
    .line 115
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const/high16 v0, 0x41100000    # 9.0f

    .line 119
    .line 120
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v17, 0x3f800000    # 1.0f

    .line 124
    .line 125
    const/4 v13, 0x0

    .line 126
    const v14, 0x3f0ccccd    # 0.55f

    .line 127
    .line 128
    .line 129
    const v15, 0x3ee66666    # 0.45f

    .line 130
    .line 131
    .line 132
    const/high16 v16, 0x3f800000    # 1.0f

    .line 133
    .line 134
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v0, 0x40800000    # 4.0f

    .line 138
    .line 139
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v18, -0x40800000    # -1.0f

    .line 143
    .line 144
    const v13, 0x3f0ccccd    # 0.55f

    .line 145
    .line 146
    .line 147
    const/4 v14, 0x0

    .line 148
    const/high16 v15, 0x3f800000    # 1.0f

    .line 149
    .line 150
    const v16, -0x4119999a    # -0.45f

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const/high16 v0, 0x41000000    # 8.0f

    .line 157
    .line 158
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/high16 v17, 0x41a80000    # 21.0f

    .line 162
    .line 163
    const/high16 v18, 0x40e00000    # 7.0f

    .line 164
    .line 165
    const/high16 v13, 0x41b00000    # 22.0f

    .line 166
    .line 167
    const v14, 0x40ee6666    # 7.45f

    .line 168
    .line 169
    .line 170
    const v15, 0x41ac6666    # 21.55f

    .line 171
    .line 172
    .line 173
    const/high16 v16, 0x40e00000    # 7.0f

    .line 174
    .line 175
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v0, 0x41a00000    # 20.0f

    .line 182
    .line 183
    const/high16 v2, 0x41800000    # 16.0f

    .line 184
    .line 185
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v0, -0x40000000    # -2.0f

    .line 189
    .line 190
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v0, 0x41100000    # 9.0f

    .line 194
    .line 195
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v0, 0x40000000    # 2.0f

    .line 199
    .line 200
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const/high16 v0, 0x41800000    # 16.0f

    .line 204
    .line 205
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v0, 0x41600000    # 14.0f

    .line 212
    .line 213
    const v2, 0x4116147b    # 9.38f

    .line 214
    .line 215
    .line 216
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v17, 0x4129eb85    # 10.62f

    .line 220
    .line 221
    .line 222
    const/high16 v18, 0x40c00000    # 6.0f

    .line 223
    .line 224
    const/high16 v13, 0x41600000    # 14.0f

    .line 225
    .line 226
    const v14, 0x40f051ec    # 7.51f

    .line 227
    .line 228
    .line 229
    const v15, 0x4147d70a    # 12.49f

    .line 230
    .line 231
    .line 232
    const/high16 v16, 0x40c00000    # 6.0f

    .line 233
    .line 234
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v0, 0x40f051ec    # 7.51f

    .line 238
    .line 239
    .line 240
    const/high16 v2, 0x40e80000    # 7.25f

    .line 241
    .line 242
    const v4, 0x4116147b    # 9.38f

    .line 243
    .line 244
    .line 245
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const/high16 v0, 0x40a80000    # 5.25f

    .line 249
    .line 250
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v17, -0x400f5c29    # -1.88f

    .line 254
    .line 255
    .line 256
    const v18, 0x3ff0a3d7    # 1.88f

    .line 257
    .line 258
    .line 259
    const/4 v13, 0x0

    .line 260
    const v14, 0x3f851eb8    # 1.04f

    .line 261
    .line 262
    .line 263
    const v15, -0x40a8f5c3    # -0.84f

    .line 264
    .line 265
    .line 266
    const v16, 0x3ff0a3d7    # 1.88f

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v0, 0x417a8f5c    # 15.66f

    .line 273
    .line 274
    .line 275
    const v2, 0x4169eb85    # 14.62f

    .line 276
    .line 277
    .line 278
    const/high16 v4, 0x40600000    # 3.5f

    .line 279
    .line 280
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v0, -0x3f69999a    # -4.7f

    .line 284
    .line 285
    .line 286
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v17, 0x40800000    # 4.0f

    .line 290
    .line 291
    const/high16 v18, 0x41200000    # 10.0f

    .line 292
    .line 293
    const v13, 0x406a3d71    # 3.66f

    .line 294
    .line 295
    .line 296
    const v14, 0x411f851f    # 9.97f

    .line 297
    .line 298
    .line 299
    const v15, 0x40751eb8    # 3.83f

    .line 300
    .line 301
    .line 302
    const/high16 v16, 0x41200000    # 10.0f

    .line 303
    .line 304
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/high16 v17, 0x40000000    # 2.0f

    .line 308
    .line 309
    const/high16 v18, -0x40000000    # -2.0f

    .line 310
    .line 311
    const v13, 0x3f8ccccd    # 1.1f

    .line 312
    .line 313
    .line 314
    const/4 v14, 0x0

    .line 315
    const/high16 v15, 0x40000000    # 2.0f

    .line 316
    .line 317
    const v16, -0x4099999a    # -0.9f

    .line 318
    .line 319
    .line 320
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v0, 0x40a33333    # 5.1f

    .line 324
    .line 325
    .line 326
    const/high16 v2, 0x40800000    # 4.0f

    .line 327
    .line 328
    const/high16 v4, 0x40c00000    # 6.0f

    .line 329
    .line 330
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v0, 0x40dccccd    # 6.9f

    .line 334
    .line 335
    .line 336
    const/high16 v2, 0x41000000    # 8.0f

    .line 337
    .line 338
    const/high16 v4, 0x40000000    # 2.0f

    .line 339
    .line 340
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const/16 v17, 0x0

    .line 344
    .line 345
    const v18, 0x40d3d70a    # 6.62f

    .line 346
    .line 347
    .line 348
    const/4 v13, 0x0

    .line 349
    const v14, 0x3d23d70a    # 0.04f

    .line 350
    .line 351
    .line 352
    const/4 v15, 0x0

    .line 353
    const v16, 0x40d3d70a    # 6.62f

    .line 354
    .line 355
    .line 356
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v17, 0x40ac28f6    # 5.38f

    .line 360
    .line 361
    .line 362
    const/high16 v18, 0x41900000    # 18.0f

    .line 363
    .line 364
    const/high16 v13, 0x40000000    # 2.0f

    .line 365
    .line 366
    const v14, 0x4183eb85    # 16.49f

    .line 367
    .line 368
    .line 369
    const v15, 0x4060a3d7    # 3.51f

    .line 370
    .line 371
    .line 372
    const/high16 v16, 0x41900000    # 18.0f

    .line 373
    .line 374
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const v0, -0x403eb852    # -1.51f

    .line 378
    .line 379
    .line 380
    const v2, -0x3fa7ae14    # -3.38f

    .line 381
    .line 382
    .line 383
    const v4, 0x405851ec    # 3.38f

    .line 384
    .line 385
    .line 386
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v0, 0x4116147b    # 9.38f

    .line 390
    .line 391
    .line 392
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const v17, 0x3ff0a3d7    # 1.88f

    .line 396
    .line 397
    .line 398
    const v18, -0x400f5c29    # -1.88f

    .line 399
    .line 400
    .line 401
    const/4 v13, 0x0

    .line 402
    const v14, -0x407ae148    # -1.04f

    .line 403
    .line 404
    .line 405
    const v15, 0x3f570a3d    # 0.84f

    .line 406
    .line 407
    .line 408
    const v16, -0x400f5c29    # -1.88f

    .line 409
    .line 410
    .line 411
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v0, 0x3f570a3d    # 0.84f

    .line 415
    .line 416
    .line 417
    const v2, 0x3ff0a3d7    # 1.88f

    .line 418
    .line 419
    .line 420
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v0, 0x40966666    # 4.7f

    .line 424
    .line 425
    .line 426
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const/high16 v17, 0x41400000    # 12.0f

    .line 430
    .line 431
    const/high16 v18, 0x41600000    # 14.0f

    .line 432
    .line 433
    const v13, 0x414570a4    # 12.34f

    .line 434
    .line 435
    .line 436
    const v14, 0x41607ae1    # 14.03f

    .line 437
    .line 438
    .line 439
    const v15, 0x4142b852    # 12.17f

    .line 440
    .line 441
    .line 442
    const/high16 v16, 0x41600000    # 14.0f

    .line 443
    .line 444
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const/high16 v17, -0x40000000    # -2.0f

    .line 448
    .line 449
    const/high16 v18, 0x40000000    # 2.0f

    .line 450
    .line 451
    const v13, -0x40733333    # -1.1f

    .line 452
    .line 453
    .line 454
    const/4 v14, 0x0

    .line 455
    const/high16 v15, -0x40000000    # -2.0f

    .line 456
    .line 457
    const v16, 0x3f666666    # 0.9f

    .line 458
    .line 459
    .line 460
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const v0, 0x3f666666    # 0.9f

    .line 464
    .line 465
    .line 466
    const/high16 v2, 0x40000000    # 2.0f

    .line 467
    .line 468
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v0, -0x4099999a    # -0.9f

    .line 472
    .line 473
    .line 474
    const/high16 v2, -0x40000000    # -2.0f

    .line 475
    .line 476
    const/high16 v4, 0x40000000    # 2.0f

    .line 477
    .line 478
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const/high16 v17, 0x41600000    # 14.0f

    .line 482
    .line 483
    const v18, 0x4116147b    # 9.38f

    .line 484
    .line 485
    .line 486
    const/high16 v13, 0x41600000    # 14.0f

    .line 487
    .line 488
    const v14, 0x417f5c29    # 15.96f

    .line 489
    .line 490
    .line 491
    const/high16 v15, 0x41600000    # 14.0f

    .line 492
    .line 493
    const v16, 0x4116147b    # 9.38f

    .line 494
    .line 495
    .line 496
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 503
    .line 504
    .line 505
    move-result-object v2

    .line 506
    const/16 v16, 0x3800

    .line 507
    .line 508
    const/16 v17, 0x0

    .line 509
    .line 510
    const/high16 v6, 0x3f800000    # 1.0f

    .line 511
    .line 512
    const/high16 v8, 0x3f800000    # 1.0f

    .line 513
    .line 514
    const/4 v7, 0x0

    .line 515
    const/high16 v9, 0x3f800000    # 1.0f

    .line 516
    .line 517
    const/high16 v12, 0x3f800000    # 1.0f

    .line 518
    .line 519
    const/4 v13, 0x0

    .line 520
    const/4 v14, 0x0

    .line 521
    const/4 v15, 0x0

    .line 522
    const-string v4, ""

    .line 523
    .line 524
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    sput-object v0, Landroidx/compose/material/icons/outlined/EarbudsBatteryKt;->_earbudsBattery:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 533
    .line 534
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 535
    .line 536
    .line 537
    return-object v0
.end method
