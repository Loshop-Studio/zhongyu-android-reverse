.class public final Landroidx/compose/material/icons/rounded/ViewWeekKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _viewWeek:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getViewWeek(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ViewWeekKt;->_viewWeek:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.ViewWeek"

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
    const v0, 0x40aa8f5c    # 5.33f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41a00000    # 20.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v0, 0x40800000    # 4.0f

    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v17, -0x40000000    # -2.0f

    .line 84
    .line 85
    const/high16 v18, -0x40000000    # -2.0f

    .line 86
    .line 87
    const v13, -0x40733333    # -1.1f

    .line 88
    .line 89
    .line 90
    const/4 v14, 0x0

    .line 91
    const/high16 v15, -0x40000000    # -2.0f

    .line 92
    .line 93
    const v16, -0x4099999a    # -0.9f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v0, 0x40c00000    # 6.0f

    .line 100
    .line 101
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v17, 0x40000000    # 2.0f

    .line 105
    .line 106
    const/4 v13, 0x0

    .line 107
    const v14, -0x40733333    # -1.1f

    .line 108
    .line 109
    .line 110
    const v15, 0x3f666666    # 0.9f

    .line 111
    .line 112
    .line 113
    const/high16 v16, -0x40000000    # -2.0f

    .line 114
    .line 115
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v0, 0x3faa3d71    # 1.33f

    .line 119
    .line 120
    .line 121
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v18, 0x40000000    # 2.0f

    .line 125
    .line 126
    const v13, 0x3f8ccccd    # 1.1f

    .line 127
    .line 128
    .line 129
    const/4 v14, 0x0

    .line 130
    const/high16 v15, 0x40000000    # 2.0f

    .line 131
    .line 132
    const v16, 0x3f666666    # 0.9f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v0, 0x41400000    # 12.0f

    .line 139
    .line 140
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v17, 0x40aa8f5c    # 5.33f

    .line 144
    .line 145
    .line 146
    const/high16 v18, 0x41a00000    # 20.0f

    .line 147
    .line 148
    const v13, 0x40ea8f5c    # 7.33f

    .line 149
    .line 150
    .line 151
    const v14, 0x4198cccd    # 19.1f

    .line 152
    .line 153
    .line 154
    const v15, 0x40ce147b    # 6.44f

    .line 155
    .line 156
    .line 157
    const/high16 v16, 0x41a00000    # 20.0f

    .line 158
    .line 159
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v0, 0x41b00000    # 22.0f

    .line 166
    .line 167
    const/high16 v2, 0x41900000    # 18.0f

    .line 168
    .line 169
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v0, 0x40c00000    # 6.0f

    .line 173
    .line 174
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v17, -0x40000000    # -2.0f

    .line 178
    .line 179
    const/high16 v18, -0x40000000    # -2.0f

    .line 180
    .line 181
    const/4 v13, 0x0

    .line 182
    const v14, -0x40733333    # -1.1f

    .line 183
    .line 184
    .line 185
    const v15, -0x4099999a    # -0.9f

    .line 186
    .line 187
    .line 188
    const/high16 v16, -0x40000000    # -2.0f

    .line 189
    .line 190
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v0, -0x4055c28f    # -1.33f

    .line 194
    .line 195
    .line 196
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/high16 v18, 0x40000000    # 2.0f

    .line 200
    .line 201
    const v13, -0x40733333    # -1.1f

    .line 202
    .line 203
    .line 204
    const/4 v14, 0x0

    .line 205
    const/high16 v15, -0x40000000    # -2.0f

    .line 206
    .line 207
    const v16, 0x3f666666    # 0.9f

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v0, 0x41400000    # 12.0f

    .line 214
    .line 215
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const/high16 v17, 0x40000000    # 2.0f

    .line 219
    .line 220
    const/4 v13, 0x0

    .line 221
    const v14, 0x3f8ccccd    # 1.1f

    .line 222
    .line 223
    .line 224
    const v15, 0x3f666666    # 0.9f

    .line 225
    .line 226
    .line 227
    const/high16 v16, 0x40000000    # 2.0f

    .line 228
    .line 229
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v0, 0x41a00000    # 20.0f

    .line 233
    .line 234
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/high16 v17, 0x41b00000    # 22.0f

    .line 238
    .line 239
    const/high16 v18, 0x41900000    # 18.0f

    .line 240
    .line 241
    const v13, 0x41a8e148    # 21.11f

    .line 242
    .line 243
    .line 244
    const/high16 v14, 0x41a00000    # 20.0f

    .line 245
    .line 246
    const/high16 v15, 0x41b00000    # 22.0f

    .line 247
    .line 248
    const v16, 0x4198cccd    # 19.1f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v0, 0x416ab852    # 14.67f

    .line 258
    .line 259
    .line 260
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v0, 0x40c00000    # 6.0f

    .line 264
    .line 265
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v17, -0x40000000    # -2.0f

    .line 269
    .line 270
    const/high16 v18, -0x40000000    # -2.0f

    .line 271
    .line 272
    const/4 v13, 0x0

    .line 273
    const v14, -0x40733333    # -1.1f

    .line 274
    .line 275
    .line 276
    const v15, -0x4099999a    # -0.9f

    .line 277
    .line 278
    .line 279
    const/high16 v16, -0x40000000    # -2.0f

    .line 280
    .line 281
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v0, -0x4055c28f    # -1.33f

    .line 285
    .line 286
    .line 287
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v18, 0x40000000    # 2.0f

    .line 291
    .line 292
    const v13, -0x40733333    # -1.1f

    .line 293
    .line 294
    .line 295
    const/4 v14, 0x0

    .line 296
    const/high16 v15, -0x40000000    # -2.0f

    .line 297
    .line 298
    const v16, 0x3f666666    # 0.9f

    .line 299
    .line 300
    .line 301
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const/high16 v0, 0x41400000    # 12.0f

    .line 305
    .line 306
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const/high16 v17, 0x40000000    # 2.0f

    .line 310
    .line 311
    const/4 v13, 0x0

    .line 312
    const v14, 0x3f8ccccd    # 1.1f

    .line 313
    .line 314
    .line 315
    const v15, 0x3f666666    # 0.9f

    .line 316
    .line 317
    .line 318
    const/high16 v16, 0x40000000    # 2.0f

    .line 319
    .line 320
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v0, 0x3faa3d71    # 1.33f

    .line 324
    .line 325
    .line 326
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v17, 0x416ab852    # 14.67f

    .line 330
    .line 331
    .line 332
    const/high16 v18, 0x41900000    # 18.0f

    .line 333
    .line 334
    const v13, 0x415c51ec    # 13.77f

    .line 335
    .line 336
    .line 337
    const/high16 v14, 0x41a00000    # 20.0f

    .line 338
    .line 339
    const v15, 0x416ab852    # 14.67f

    .line 340
    .line 341
    .line 342
    const v16, 0x4198cccd    # 19.1f

    .line 343
    .line 344
    .line 345
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    const/16 v16, 0x3800

    .line 356
    .line 357
    const/16 v17, 0x0

    .line 358
    .line 359
    const/high16 v6, 0x3f800000    # 1.0f

    .line 360
    .line 361
    const/high16 v8, 0x3f800000    # 1.0f

    .line 362
    .line 363
    const/4 v7, 0x0

    .line 364
    const/high16 v9, 0x3f800000    # 1.0f

    .line 365
    .line 366
    const/high16 v12, 0x3f800000    # 1.0f

    .line 367
    .line 368
    const/4 v13, 0x0

    .line 369
    const/4 v14, 0x0

    .line 370
    const/4 v15, 0x0

    .line 371
    const-string v4, ""

    .line 372
    .line 373
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    sput-object v0, Landroidx/compose/material/icons/rounded/ViewWeekKt;->_viewWeek:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 382
    .line 383
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 384
    .line 385
    .line 386
    return-object v0
.end method
