.class public final Landroidx/compose/material/icons/sharp/SwipeVerticalKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _swipeVertical:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSwipeVertical(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/SwipeVerticalKt;->_swipeVertical:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.SwipeVertical"

    .line 25
    .line 26
    const/high16 v5, 0x41c00000    # 24.0f

    .line 27
    .line 28
    const/high16 v6, 0x41c00000    # 24.0f

    .line 29
    .line 30
    const-wide/16 v7, 0x0

    .line 31
    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v10, 0x0

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
    const/high16 v0, 0x3f800000    # 1.0f

    .line 71
    .line 72
    const/high16 v2, 0x40600000    # 3.5f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v4, 0x400147ae    # 2.02f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/16 v17, 0x0

    .line 84
    .line 85
    const/high16 v18, 0x41400000    # 12.0f

    .line 86
    .line 87
    const v13, 0x3f90a3d7    # 1.13f

    .line 88
    .line 89
    .line 90
    const v14, 0x40ba3d71    # 5.82f

    .line 91
    .line 92
    .line 93
    const/4 v15, 0x0

    .line 94
    const v16, 0x410c7ae1    # 8.78f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v4, 0x404147ae    # 3.02f

    .line 101
    .line 102
    .line 103
    const/high16 v6, 0x41080000    # 8.5f

    .line 104
    .line 105
    const v7, 0x3f90a3d7    # 1.13f

    .line 106
    .line 107
    .line 108
    const v8, 0x40c5c28f    # 6.18f

    .line 109
    .line 110
    .line 111
    invoke-virtual {v12, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v4, 0x41b00000    # 22.0f

    .line 118
    .line 119
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v4, 0x40a00000    # 5.0f

    .line 123
    .line 124
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v4, -0x3f600000    # -5.0f

    .line 128
    .line 129
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/high16 v4, 0x40900000    # 4.5f

    .line 133
    .line 134
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v4, 0x403a3d71    # 2.91f

    .line 138
    .line 139
    .line 140
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 144
    .line 145
    const v18, -0x3f02e148    # -7.91f

    .line 146
    .line 147
    .line 148
    const v13, -0x4011eb85    # -1.86f

    .line 149
    .line 150
    .line 151
    const v14, -0x3ff8f5c3    # -2.11f

    .line 152
    .line 153
    .line 154
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 155
    .line 156
    const v16, -0x3f63d70a    # -4.88f

    .line 157
    .line 158
    .line 159
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v4, 0x40400000    # 3.0f

    .line 163
    .line 164
    const v6, -0x3f02e148    # -7.91f

    .line 165
    .line 166
    .line 167
    const v7, 0x3f91eb85    # 1.14f

    .line 168
    .line 169
    .line 170
    const v8, -0x3f46b852    # -5.79f

    .line 171
    .line 172
    .line 173
    invoke-virtual {v12, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/high16 v4, 0x40e00000    # 7.0f

    .line 177
    .line 178
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v4, 0x40c00000    # 6.0f

    .line 182
    .line 183
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const/high16 v4, 0x40000000    # 2.0f

    .line 187
    .line 188
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v12, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v0, 0x41adae14    # 21.71f

    .line 201
    .line 202
    .line 203
    const v2, 0x4132e148    # 11.18f

    .line 204
    .line 205
    .line 206
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v4, 0x4005c28f    # 2.09f

    .line 210
    .line 211
    .line 212
    const v6, 0x40ec7ae1    # 7.39f

    .line 213
    .line 214
    .line 215
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v4, -0x3efc51ec    # -8.23f

    .line 219
    .line 220
    .line 221
    const v6, 0x4069999a    # 3.65f

    .line 222
    .line 223
    .line 224
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v4, -0x3f251eb8    # -6.84f

    .line 228
    .line 229
    .line 230
    const v6, -0x3fc9999a    # -2.85f

    .line 231
    .line 232
    .line 233
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v4, 0x3f1c28f6    # 0.61f

    .line 237
    .line 238
    .line 239
    const v6, -0x4030a3d7    # -1.62f

    .line 240
    .line 241
    .line 242
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const v4, 0x40733333    # 3.8f

    .line 246
    .line 247
    .line 248
    const/high16 v6, -0x40c00000    # -0.75f

    .line 249
    .line 250
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v4, 0x410ca3d7    # 8.79f

    .line 254
    .line 255
    .line 256
    const v6, 0x40e570a4    # 7.17f

    .line 257
    .line 258
    .line 259
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v17, 0x3f428f5c    # 0.76f

    .line 263
    .line 264
    .line 265
    const v18, -0x40028f5c    # -1.98f

    .line 266
    .line 267
    .line 268
    const v13, -0x4151eb85    # -0.34f

    .line 269
    .line 270
    .line 271
    const v14, -0x40bd70a4    # -0.76f

    .line 272
    .line 273
    .line 274
    const/4 v15, 0x0

    .line 275
    const v16, -0x402e147b    # -1.64f

    .line 276
    .line 277
    .line 278
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v17, 0x3ffd70a4    # 1.98f

    .line 282
    .line 283
    .line 284
    const v18, 0x3f428f5c    # 0.76f

    .line 285
    .line 286
    .line 287
    const v13, 0x3f428f5c    # 0.76f

    .line 288
    .line 289
    .line 290
    const v14, -0x4151eb85    # -0.34f

    .line 291
    .line 292
    .line 293
    const v15, 0x3fd1eb85    # 1.64f

    .line 294
    .line 295
    .line 296
    const/16 v16, 0x0

    .line 297
    .line 298
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const v4, 0x401b851f    # 2.43f

    .line 302
    .line 303
    .line 304
    const v6, 0x40afae14    # 5.49f

    .line 305
    .line 306
    .line 307
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v4, 0x3fa147ae    # 1.26f

    .line 311
    .line 312
    .line 313
    const v6, -0x40f0a3d7    # -0.56f

    .line 314
    .line 315
    .line 316
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 326
    .line 327
    .line 328
    move-result-object v2

    .line 329
    const/16 v16, 0x3800

    .line 330
    .line 331
    const/16 v17, 0x0

    .line 332
    .line 333
    const-string v4, ""

    .line 334
    .line 335
    const/high16 v6, 0x3f800000    # 1.0f

    .line 336
    .line 337
    const/4 v7, 0x0

    .line 338
    const/high16 v8, 0x3f800000    # 1.0f

    .line 339
    .line 340
    const/high16 v9, 0x3f800000    # 1.0f

    .line 341
    .line 342
    const/high16 v12, 0x3f800000    # 1.0f

    .line 343
    .line 344
    const/4 v13, 0x0

    .line 345
    const/4 v14, 0x0

    .line 346
    const/4 v15, 0x0

    .line 347
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    sput-object v0, Landroidx/compose/material/icons/sharp/SwipeVerticalKt;->_swipeVertical:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 356
    .line 357
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    return-object v0
.end method
