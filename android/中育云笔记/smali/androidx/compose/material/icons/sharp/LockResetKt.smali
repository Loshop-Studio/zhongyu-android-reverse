.class public final Landroidx/compose/material/icons/sharp/LockResetKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _lockReset:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLockReset(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/LockResetKt;->_lockReset:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.LockReset"

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
    const/high16 v0, 0x41500000    # 13.0f

    .line 71
    .line 72
    const/high16 v2, 0x40400000    # 3.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x3ef00000    # -9.0f

    .line 78
    .line 79
    const/high16 v18, 0x41100000    # 9.0f

    .line 80
    .line 81
    const v13, -0x3f60f5c3    # -4.97f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, -0x3ef00000    # -9.0f

    .line 86
    .line 87
    const v16, 0x4080f5c3    # 4.03f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v0, 0x3f800000    # 1.0f

    .line 94
    .line 95
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v0, 0x40800000    # 4.0f

    .line 99
    .line 100
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v0, -0x3f800000    # -4.0f

    .line 104
    .line 105
    const/high16 v2, 0x40800000    # 4.0f

    .line 106
    .line 107
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const/high16 v0, 0x40c00000    # 6.0f

    .line 111
    .line 112
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v17, 0x40e00000    # 7.0f

    .line 116
    .line 117
    const/high16 v18, -0x3f200000    # -7.0f

    .line 118
    .line 119
    const/4 v13, 0x0

    .line 120
    const v14, -0x3f88f5c3    # -3.86f

    .line 121
    .line 122
    .line 123
    const v15, 0x4048f5c3    # 3.14f

    .line 124
    .line 125
    .line 126
    const/high16 v16, -0x3f200000    # -7.0f

    .line 127
    .line 128
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v0, 0x4048f5c3    # 3.14f

    .line 132
    .line 133
    .line 134
    const/high16 v2, 0x40e00000    # 7.0f

    .line 135
    .line 136
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v0, -0x3fb70a3d    # -3.14f

    .line 140
    .line 141
    .line 142
    const/high16 v2, -0x3f200000    # -7.0f

    .line 143
    .line 144
    const/high16 v4, 0x40e00000    # 7.0f

    .line 145
    .line 146
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v17, -0x3f63d70a    # -4.88f

    .line 150
    .line 151
    .line 152
    const v18, -0x400147ae    # -1.99f

    .line 153
    .line 154
    .line 155
    const v13, -0x400ccccd    # -1.9f

    .line 156
    .line 157
    .line 158
    const/4 v14, 0x0

    .line 159
    const v15, -0x3f9851ec    # -3.62f

    .line 160
    .line 161
    .line 162
    const v16, -0x40bd70a4    # -0.76f

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v0, 0x40d66666    # 6.7f

    .line 169
    .line 170
    .line 171
    const v2, 0x41935c29    # 18.42f

    .line 172
    .line 173
    .line 174
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v17, 0x41500000    # 13.0f

    .line 178
    .line 179
    const/high16 v18, 0x41a80000    # 21.0f

    .line 180
    .line 181
    const v13, 0x41051eb8    # 8.32f

    .line 182
    .line 183
    .line 184
    const v14, 0x41a0147b    # 20.01f

    .line 185
    .line 186
    .line 187
    const v15, 0x4128cccd    # 10.55f

    .line 188
    .line 189
    .line 190
    const/high16 v16, 0x41a80000    # 21.0f

    .line 191
    .line 192
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v17, 0x41100000    # 9.0f

    .line 196
    .line 197
    const/high16 v18, -0x3ef00000    # -9.0f

    .line 198
    .line 199
    const v13, 0x409f0a3d    # 4.97f

    .line 200
    .line 201
    .line 202
    const/4 v14, 0x0

    .line 203
    const/high16 v15, 0x41100000    # 9.0f

    .line 204
    .line 205
    const v16, -0x3f7f0a3d    # -4.03f

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v0, 0x418fc28f    # 17.97f

    .line 212
    .line 213
    .line 214
    const/high16 v2, 0x41500000    # 13.0f

    .line 215
    .line 216
    const/high16 v4, 0x40400000    # 3.0f

    .line 217
    .line 218
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/high16 v0, 0x41700000    # 15.0f

    .line 225
    .line 226
    const/high16 v2, 0x41300000    # 11.0f

    .line 227
    .line 228
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const/high16 v0, -0x40800000    # -1.0f

    .line 232
    .line 233
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v17, -0x40000000    # -2.0f

    .line 237
    .line 238
    const/high16 v18, -0x40000000    # -2.0f

    .line 239
    .line 240
    const/4 v13, 0x0

    .line 241
    const v14, -0x40733333    # -1.1f

    .line 242
    .line 243
    .line 244
    const v15, -0x4099999a    # -0.9f

    .line 245
    .line 246
    .line 247
    const/high16 v16, -0x40000000    # -2.0f

    .line 248
    .line 249
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v0, 0x3f666666    # 0.9f

    .line 253
    .line 254
    .line 255
    const/high16 v2, 0x40000000    # 2.0f

    .line 256
    .line 257
    const/high16 v4, -0x40000000    # -2.0f

    .line 258
    .line 259
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v0, 0x3f800000    # 1.0f

    .line 263
    .line 264
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/high16 v0, -0x40800000    # -1.0f

    .line 268
    .line 269
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v0, 0x40a00000    # 5.0f

    .line 273
    .line 274
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v0, 0x40c00000    # 6.0f

    .line 278
    .line 279
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v0, -0x3f600000    # -5.0f

    .line 283
    .line 284
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/high16 v0, 0x41700000    # 15.0f

    .line 288
    .line 289
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v0, 0x41600000    # 14.0f

    .line 296
    .line 297
    const/high16 v2, 0x41300000    # 11.0f

    .line 298
    .line 299
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const/high16 v0, -0x40000000    # -2.0f

    .line 303
    .line 304
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/high16 v0, -0x40800000    # -1.0f

    .line 308
    .line 309
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v17, 0x3f800000    # 1.0f

    .line 313
    .line 314
    const/high16 v18, -0x40800000    # -1.0f

    .line 315
    .line 316
    const v14, -0x40f33333    # -0.55f

    .line 317
    .line 318
    .line 319
    const v15, 0x3ee66666    # 0.45f

    .line 320
    .line 321
    .line 322
    const/high16 v16, -0x40800000    # -1.0f

    .line 323
    .line 324
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v0, 0x3ee66666    # 0.45f

    .line 328
    .line 329
    .line 330
    const/high16 v2, 0x3f800000    # 1.0f

    .line 331
    .line 332
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v0, 0x41300000    # 11.0f

    .line 336
    .line 337
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 344
    .line 345
    .line 346
    move-result-object v2

    .line 347
    const/16 v16, 0x3800

    .line 348
    .line 349
    const/16 v17, 0x0

    .line 350
    .line 351
    const/high16 v6, 0x3f800000    # 1.0f

    .line 352
    .line 353
    const/high16 v8, 0x3f800000    # 1.0f

    .line 354
    .line 355
    const/4 v7, 0x0

    .line 356
    const/high16 v9, 0x3f800000    # 1.0f

    .line 357
    .line 358
    const/high16 v12, 0x3f800000    # 1.0f

    .line 359
    .line 360
    const/4 v14, 0x0

    .line 361
    const/4 v15, 0x0

    .line 362
    const-string v4, ""

    .line 363
    .line 364
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    sput-object v0, Landroidx/compose/material/icons/sharp/LockResetKt;->_lockReset:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 373
    .line 374
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 375
    .line 376
    .line 377
    return-object v0
.end method
