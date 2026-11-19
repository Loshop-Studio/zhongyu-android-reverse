.class public final Landroidx/compose/material/icons/rounded/RestaurantKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _restaurant:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRestaurant(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/RestaurantKt;->_restaurant:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

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
    const-string v2, "Rounded.Restaurant"

    .line 33
    .line 34
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/n;)V

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
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

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
    const/high16 v0, 0x41800000    # 16.0f

    .line 71
    .line 72
    const/high16 v2, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40c00000    # 6.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, 0x40000000    # 2.0f

    .line 83
    .line 84
    const/high16 v18, 0x40000000    # 2.0f

    .line 85
    .line 86
    const/4 v13, 0x0

    .line 87
    const v14, 0x3f8ccccd    # 1.1f

    .line 88
    .line 89
    .line 90
    const v15, 0x3f666666    # 0.9f

    .line 91
    .line 92
    .line 93
    const/high16 v16, 0x40000000    # 2.0f

    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v0, 0x3f800000    # 1.0f

    .line 99
    .line 100
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v0, 0x40e00000    # 7.0f

    .line 104
    .line 105
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const/high16 v17, 0x3f800000    # 1.0f

    .line 109
    .line 110
    const/high16 v18, 0x3f800000    # 1.0f

    .line 111
    .line 112
    const v14, 0x3f0ccccd    # 0.55f

    .line 113
    .line 114
    .line 115
    const v15, 0x3ee66666    # 0.45f

    .line 116
    .line 117
    .line 118
    const/high16 v16, 0x3f800000    # 1.0f

    .line 119
    .line 120
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v0, -0x4119999a    # -0.45f

    .line 124
    .line 125
    .line 126
    const/high16 v2, -0x40800000    # -1.0f

    .line 127
    .line 128
    const/high16 v4, 0x3f800000    # 1.0f

    .line 129
    .line 130
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v0, 0x41a80000    # 21.0f

    .line 134
    .line 135
    const v2, 0x404851ec    # 3.13f

    .line 136
    .line 137
    .line 138
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v17, -0x406147ae    # -1.24f

    .line 142
    .line 143
    .line 144
    const v18, -0x40851eb8    # -0.98f

    .line 145
    .line 146
    .line 147
    const v14, -0x40d9999a    # -0.65f

    .line 148
    .line 149
    .line 150
    const v15, -0x40e3d70a    # -0.61f

    .line 151
    .line 152
    .line 153
    const v16, -0x406f5c29    # -1.13f

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v17, 0x41800000    # 16.0f

    .line 160
    .line 161
    const/high16 v18, 0x40c00000    # 6.0f

    .line 162
    .line 163
    const v13, 0x418ccccd    # 17.6f

    .line 164
    .line 165
    .line 166
    const v14, 0x402b851f    # 2.68f

    .line 167
    .line 168
    .line 169
    const/high16 v15, 0x41800000    # 16.0f

    .line 170
    .line 171
    const v16, 0x409051ec    # 4.51f

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const/high16 v0, 0x41300000    # 11.0f

    .line 181
    .line 182
    const/high16 v2, 0x41100000    # 9.0f

    .line 183
    .line 184
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v0, 0x41100000    # 9.0f

    .line 188
    .line 189
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const/high16 v0, 0x40400000    # 3.0f

    .line 193
    .line 194
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v17, -0x40800000    # -1.0f

    .line 198
    .line 199
    const/high16 v18, -0x40800000    # -1.0f

    .line 200
    .line 201
    const/4 v13, 0x0

    .line 202
    const v14, -0x40f33333    # -0.55f

    .line 203
    .line 204
    .line 205
    const v15, -0x4119999a    # -0.45f

    .line 206
    .line 207
    .line 208
    const/high16 v16, -0x40800000    # -1.0f

    .line 209
    .line 210
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v0, 0x3ee66666    # 0.45f

    .line 214
    .line 215
    .line 216
    const/high16 v2, -0x40800000    # -1.0f

    .line 217
    .line 218
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v0, 0x40c00000    # 6.0f

    .line 222
    .line 223
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v0, 0x40a00000    # 5.0f

    .line 227
    .line 228
    const/high16 v2, 0x41100000    # 9.0f

    .line 229
    .line 230
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v2, 0x40400000    # 3.0f

    .line 234
    .line 235
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v0, 0x3ee66666    # 0.45f

    .line 242
    .line 243
    .line 244
    const/high16 v2, -0x40800000    # -1.0f

    .line 245
    .line 246
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v0, 0x40c00000    # 6.0f

    .line 250
    .line 251
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v17, 0x40800000    # 4.0f

    .line 255
    .line 256
    const/high16 v18, 0x40800000    # 4.0f

    .line 257
    .line 258
    const v14, 0x400d70a4    # 2.21f

    .line 259
    .line 260
    .line 261
    const v15, 0x3fe51eb8    # 1.79f

    .line 262
    .line 263
    .line 264
    const/high16 v16, 0x40800000    # 4.0f

    .line 265
    .line 266
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/high16 v0, 0x41000000    # 8.0f

    .line 270
    .line 271
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/high16 v17, 0x3f800000    # 1.0f

    .line 275
    .line 276
    const/high16 v18, 0x3f800000    # 1.0f

    .line 277
    .line 278
    const v14, 0x3f0ccccd    # 0.55f

    .line 279
    .line 280
    .line 281
    const v15, 0x3ee66666    # 0.45f

    .line 282
    .line 283
    .line 284
    const/high16 v16, 0x3f800000    # 1.0f

    .line 285
    .line 286
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v0, -0x4119999a    # -0.45f

    .line 290
    .line 291
    .line 292
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v0, -0x3f000000    # -8.0f

    .line 296
    .line 297
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v17, 0x40800000    # 4.0f

    .line 301
    .line 302
    const/high16 v18, -0x3f800000    # -4.0f

    .line 303
    .line 304
    const v13, 0x400d70a4    # 2.21f

    .line 305
    .line 306
    .line 307
    const/4 v14, 0x0

    .line 308
    const/high16 v15, 0x40800000    # 4.0f

    .line 309
    .line 310
    const v16, -0x401ae148    # -1.79f

    .line 311
    .line 312
    .line 313
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const/high16 v0, 0x41500000    # 13.0f

    .line 317
    .line 318
    const/high16 v2, 0x40400000    # 3.0f

    .line 319
    .line 320
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const/high16 v17, -0x40800000    # -1.0f

    .line 324
    .line 325
    const/high16 v18, -0x40800000    # -1.0f

    .line 326
    .line 327
    const/4 v13, 0x0

    .line 328
    const v14, -0x40f33333    # -0.55f

    .line 329
    .line 330
    .line 331
    const v15, -0x4119999a    # -0.45f

    .line 332
    .line 333
    .line 334
    const/high16 v16, -0x40800000    # -1.0f

    .line 335
    .line 336
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v0, 0x3ee66666    # 0.45f

    .line 340
    .line 341
    .line 342
    const/high16 v2, -0x40800000    # -1.0f

    .line 343
    .line 344
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v0, 0x40c00000    # 6.0f

    .line 348
    .line 349
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    const/16 v16, 0x3800

    .line 360
    .line 361
    const/16 v17, 0x0

    .line 362
    .line 363
    const/high16 v6, 0x3f800000    # 1.0f

    .line 364
    .line 365
    const/high16 v8, 0x3f800000    # 1.0f

    .line 366
    .line 367
    const/4 v7, 0x0

    .line 368
    const/high16 v9, 0x3f800000    # 1.0f

    .line 369
    .line 370
    const/high16 v12, 0x3f800000    # 1.0f

    .line 371
    .line 372
    const/4 v14, 0x0

    .line 373
    const/4 v15, 0x0

    .line 374
    const-string v4, ""

    .line 375
    .line 376
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    sput-object v0, Landroidx/compose/material/icons/rounded/RestaurantKt;->_restaurant:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 385
    .line 386
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 387
    .line 388
    .line 389
    return-object v0
.end method
