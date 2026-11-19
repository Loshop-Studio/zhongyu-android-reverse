.class public final Landroidx/compose/material/icons/rounded/TableRestaurantKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _tableRestaurant:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTableRestaurant(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/TableRestaurantKt;->_tableRestaurant:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.TableRestaurant"

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
    const v0, 0x41afae14    # 21.96f

    .line 71
    .line 72
    .line 73
    const v2, 0x411bae14    # 9.73f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v0, -0x3f600000    # -5.0f

    .line 80
    .line 81
    const v2, -0x4048f5c3    # -1.43f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v17, 0x419c8f5c    # 19.57f

    .line 88
    .line 89
    .line 90
    const/high16 v18, 0x40800000    # 4.0f

    .line 91
    .line 92
    const v13, 0x41a347ae    # 20.41f

    .line 93
    .line 94
    .line 95
    const v14, 0x4089999a    # 4.3f

    .line 96
    .line 97
    .line 98
    const v15, 0x41a028f6    # 20.02f

    .line 99
    .line 100
    .line 101
    const/high16 v16, 0x40800000    # 4.0f

    .line 102
    .line 103
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v0, 0x408dc28f    # 4.43f

    .line 107
    .line 108
    .line 109
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v17, 0x405e147b    # 3.47f

    .line 113
    .line 114
    .line 115
    const v18, 0x40975c29    # 4.73f

    .line 116
    .line 117
    .line 118
    const v13, 0x407eb852    # 3.98f

    .line 119
    .line 120
    .line 121
    const/high16 v14, 0x40800000    # 4.0f

    .line 122
    .line 123
    const v15, 0x4065c28f    # 3.59f

    .line 124
    .line 125
    .line 126
    const v16, 0x4089999a    # 4.3f

    .line 127
    .line 128
    .line 129
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/high16 v0, 0x40a00000    # 5.0f

    .line 133
    .line 134
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v17, 0x40400000    # 3.0f

    .line 138
    .line 139
    const/high16 v18, 0x41300000    # 11.0f

    .line 140
    .line 141
    const v13, 0x3fee147b    # 1.86f

    .line 142
    .line 143
    .line 144
    const v14, 0x4125c28f    # 10.36f

    .line 145
    .line 146
    .line 147
    const v15, 0x4015c28f    # 2.34f

    .line 148
    .line 149
    .line 150
    const/high16 v16, 0x41300000    # 11.0f

    .line 151
    .line 152
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v0, 0x400ccccd    # 2.2f

    .line 156
    .line 157
    .line 158
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const v0, -0x4079999a    # -1.05f

    .line 162
    .line 163
    .line 164
    const v2, 0x40fc28f6    # 7.88f

    .line 165
    .line 166
    .line 167
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v17, 0x40a428f6    # 5.13f

    .line 171
    .line 172
    .line 173
    const/high16 v18, 0x41a00000    # 20.0f

    .line 174
    .line 175
    const v13, 0x40823d71    # 4.07f

    .line 176
    .line 177
    .line 178
    const v14, 0x419bc28f    # 19.47f

    .line 179
    .line 180
    .line 181
    const v15, 0x4090f5c3    # 4.53f

    .line 182
    .line 183
    .line 184
    const/high16 v16, 0x41a00000    # 20.0f

    .line 185
    .line 186
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/4 v0, 0x0

    .line 190
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v17, 0x3f7ae148    # 0.98f

    .line 194
    .line 195
    .line 196
    const v18, -0x40a3d70a    # -0.86f

    .line 197
    .line 198
    .line 199
    const/high16 v13, 0x3f000000    # 0.5f

    .line 200
    .line 201
    const/4 v14, 0x0

    .line 202
    const v15, 0x3f6b851f    # 0.92f

    .line 203
    .line 204
    .line 205
    const v16, -0x41428f5c    # -0.37f

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v0, 0x40d570a4    # 6.67f

    .line 212
    .line 213
    .line 214
    const/high16 v2, 0x41700000    # 15.0f

    .line 215
    .line 216
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v0, 0x412ab852    # 10.67f

    .line 220
    .line 221
    .line 222
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v0, 0x3f0ccccd    # 0.55f

    .line 226
    .line 227
    .line 228
    const v2, 0x40847ae1    # 4.14f

    .line 229
    .line 230
    .line 231
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v18, 0x3f5c28f6    # 0.86f

    .line 235
    .line 236
    .line 237
    const v13, 0x3d8f5c29    # 0.07f

    .line 238
    .line 239
    .line 240
    const v14, 0x3efae148    # 0.49f

    .line 241
    .line 242
    .line 243
    const v15, 0x3efae148    # 0.49f

    .line 244
    .line 245
    .line 246
    const v16, 0x3f5c28f6    # 0.86f

    .line 247
    .line 248
    .line 249
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/4 v0, 0x0

    .line 253
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v18, -0x4070a3d7    # -1.12f

    .line 257
    .line 258
    .line 259
    const v13, 0x3f19999a    # 0.6f

    .line 260
    .line 261
    .line 262
    const/4 v14, 0x0

    .line 263
    const v15, 0x3f87ae14    # 1.06f

    .line 264
    .line 265
    .line 266
    const v16, -0x40f851ec    # -0.53f

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v0, 0x41966666    # 18.8f

    .line 273
    .line 274
    .line 275
    const/high16 v2, 0x41300000    # 11.0f

    .line 276
    .line 277
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v0, 0x41a80000    # 21.0f

    .line 281
    .line 282
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v17, 0x41afae14    # 21.96f

    .line 286
    .line 287
    .line 288
    const v18, 0x411bae14    # 9.73f

    .line 289
    .line 290
    .line 291
    const v13, 0x41ad47ae    # 21.66f

    .line 292
    .line 293
    .line 294
    const/high16 v14, 0x41300000    # 11.0f

    .line 295
    .line 296
    const v15, 0x41b11eb8    # 22.14f

    .line 297
    .line 298
    .line 299
    const v16, 0x4125c28f    # 10.36f

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v0, 0x41500000    # 13.0f

    .line 309
    .line 310
    const v2, 0x40ddc28f    # 6.93f

    .line 311
    .line 312
    .line 313
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const/high16 v0, -0x40000000    # -2.0f

    .line 317
    .line 318
    const v2, 0x3e8a3d71    # 0.27f

    .line 319
    .line 320
    .line 321
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v0, 0x4119999a    # 9.6f

    .line 325
    .line 326
    .line 327
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/high16 v0, 0x40000000    # 2.0f

    .line 331
    .line 332
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v0, 0x40ddc28f    # 6.93f

    .line 336
    .line 337
    .line 338
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 345
    .line 346
    .line 347
    move-result-object v2

    .line 348
    const/16 v16, 0x3800

    .line 349
    .line 350
    const/16 v17, 0x0

    .line 351
    .line 352
    const/high16 v6, 0x3f800000    # 1.0f

    .line 353
    .line 354
    const/high16 v8, 0x3f800000    # 1.0f

    .line 355
    .line 356
    const/4 v7, 0x0

    .line 357
    const/high16 v9, 0x3f800000    # 1.0f

    .line 358
    .line 359
    const/high16 v12, 0x3f800000    # 1.0f

    .line 360
    .line 361
    const/4 v13, 0x0

    .line 362
    const/4 v14, 0x0

    .line 363
    const/4 v15, 0x0

    .line 364
    const-string v4, ""

    .line 365
    .line 366
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    sput-object v0, Landroidx/compose/material/icons/rounded/TableRestaurantKt;->_tableRestaurant:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 375
    .line 376
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 377
    .line 378
    .line 379
    return-object v0
.end method
