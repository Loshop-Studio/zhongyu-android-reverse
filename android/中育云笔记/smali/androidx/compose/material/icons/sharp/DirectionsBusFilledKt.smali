.class public final Landroidx/compose/material/icons/sharp/DirectionsBusFilledKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _directionsBusFilled:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDirectionsBusFilled(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/DirectionsBusFilledKt;->_directionsBusFilled:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.DirectionsBusFilled"

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
    const/high16 v0, 0x40000000    # 2.0f

    .line 71
    .line 72
    const/high16 v2, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x40800000    # 4.0f

    .line 78
    .line 79
    const/high16 v18, 0x40c00000    # 6.0f

    .line 80
    .line 81
    const/high16 v13, 0x41000000    # 8.0f

    .line 82
    .line 83
    const/high16 v14, 0x40000000    # 2.0f

    .line 84
    .line 85
    const/high16 v15, 0x40800000    # 4.0f

    .line 86
    .line 87
    const/high16 v16, 0x40200000    # 2.5f

    .line 88
    .line 89
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/high16 v0, 0x41180000    # 9.5f

    .line 93
    .line 94
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v17, 0x3f800000    # 1.0f

    .line 98
    .line 99
    const v18, 0x401c28f6    # 2.44f

    .line 100
    .line 101
    .line 102
    const/4 v13, 0x0

    .line 103
    const v14, 0x3f733333    # 0.95f

    .line 104
    .line 105
    .line 106
    const v15, 0x3ec28f5c    # 0.38f

    .line 107
    .line 108
    .line 109
    const v16, 0x3fe7ae14    # 1.81f

    .line 110
    .line 111
    .line 112
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v0, 0x41a80000    # 21.0f

    .line 116
    .line 117
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v0, 0x40400000    # 3.0f

    .line 121
    .line 122
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v0, -0x40000000    # -2.0f

    .line 126
    .line 127
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const/high16 v0, 0x41000000    # 8.0f

    .line 131
    .line 132
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v0, 0x40000000    # 2.0f

    .line 136
    .line 137
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v0, 0x40400000    # 3.0f

    .line 141
    .line 142
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v0, -0x3fbc28f6    # -3.06f

    .line 146
    .line 147
    .line 148
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v18, -0x3fe3d70a    # -2.44f

    .line 152
    .line 153
    .line 154
    const v13, 0x3f1eb852    # 0.62f

    .line 155
    .line 156
    .line 157
    const v14, -0x40deb852    # -0.63f

    .line 158
    .line 159
    .line 160
    const/high16 v15, 0x3f800000    # 1.0f

    .line 161
    .line 162
    const v16, -0x404147ae    # -1.49f

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v0, 0x40c00000    # 6.0f

    .line 169
    .line 170
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v17, 0x41400000    # 12.0f

    .line 174
    .line 175
    const/high16 v18, 0x40000000    # 2.0f

    .line 176
    .line 177
    const/high16 v13, 0x41a00000    # 20.0f

    .line 178
    .line 179
    const/high16 v14, 0x40200000    # 2.5f

    .line 180
    .line 181
    const v15, 0x41835c29    # 16.42f

    .line 182
    .line 183
    .line 184
    const/high16 v16, 0x40000000    # 2.0f

    .line 185
    .line 186
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const/high16 v0, 0x41080000    # 8.5f

    .line 193
    .line 194
    const/high16 v2, 0x41800000    # 16.0f

    .line 195
    .line 196
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/high16 v17, 0x40e00000    # 7.0f

    .line 200
    .line 201
    const/high16 v18, 0x41680000    # 14.5f

    .line 202
    .line 203
    const v13, 0x40f570a4    # 7.67f

    .line 204
    .line 205
    .line 206
    const/high16 v14, 0x41800000    # 16.0f

    .line 207
    .line 208
    const/high16 v15, 0x40e00000    # 7.0f

    .line 209
    .line 210
    const v16, 0x417547ae    # 15.33f

    .line 211
    .line 212
    .line 213
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v0, 0x40f570a4    # 7.67f

    .line 217
    .line 218
    .line 219
    const/high16 v2, 0x41500000    # 13.0f

    .line 220
    .line 221
    const/high16 v4, 0x41080000    # 8.5f

    .line 222
    .line 223
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v0, 0x3f2b851f    # 0.67f

    .line 227
    .line 228
    .line 229
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 230
    .line 231
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v0, 0x411547ae    # 9.33f

    .line 235
    .line 236
    .line 237
    const/high16 v2, 0x41080000    # 8.5f

    .line 238
    .line 239
    const/high16 v4, 0x41800000    # 16.0f

    .line 240
    .line 241
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v0, 0x41780000    # 15.5f

    .line 248
    .line 249
    const/high16 v2, 0x41800000    # 16.0f

    .line 250
    .line 251
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v17, -0x40400000    # -1.5f

    .line 255
    .line 256
    const/high16 v18, -0x40400000    # -1.5f

    .line 257
    .line 258
    const v13, -0x40ab851f    # -0.83f

    .line 259
    .line 260
    .line 261
    const/4 v14, 0x0

    .line 262
    const/high16 v15, -0x40400000    # -1.5f

    .line 263
    .line 264
    const v16, -0x40d47ae1    # -0.67f

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v0, -0x40400000    # -1.5f

    .line 271
    .line 272
    const v2, 0x3f2b851f    # 0.67f

    .line 273
    .line 274
    .line 275
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 276
    .line 277
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v0, 0x3f2b851f    # 0.67f

    .line 281
    .line 282
    .line 283
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 284
    .line 285
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v0, 0x4182a3d7    # 16.33f

    .line 289
    .line 290
    .line 291
    const/high16 v2, 0x41780000    # 15.5f

    .line 292
    .line 293
    const/high16 v4, 0x41800000    # 16.0f

    .line 294
    .line 295
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const/high16 v0, 0x41900000    # 18.0f

    .line 302
    .line 303
    const/high16 v2, 0x41200000    # 10.0f

    .line 304
    .line 305
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v0, 0x40c00000    # 6.0f

    .line 309
    .line 310
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/high16 v0, 0x40e00000    # 7.0f

    .line 314
    .line 315
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const/high16 v0, 0x41400000    # 12.0f

    .line 319
    .line 320
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const/high16 v0, 0x41200000    # 10.0f

    .line 324
    .line 325
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    const/16 v16, 0x3800

    .line 336
    .line 337
    const/16 v17, 0x0

    .line 338
    .line 339
    const/high16 v6, 0x3f800000    # 1.0f

    .line 340
    .line 341
    const/high16 v8, 0x3f800000    # 1.0f

    .line 342
    .line 343
    const/4 v7, 0x0

    .line 344
    const/high16 v9, 0x3f800000    # 1.0f

    .line 345
    .line 346
    const/high16 v12, 0x3f800000    # 1.0f

    .line 347
    .line 348
    const/4 v13, 0x0

    .line 349
    const/4 v15, 0x0

    .line 350
    const-string v4, ""

    .line 351
    .line 352
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    sput-object v0, Landroidx/compose/material/icons/sharp/DirectionsBusFilledKt;->_directionsBusFilled:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 361
    .line 362
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 363
    .line 364
    .line 365
    return-object v0
.end method
