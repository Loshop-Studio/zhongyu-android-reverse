.class public final Landroidx/compose/material/icons/rounded/ArrowCircleDownKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _arrowCircleDown:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getArrowCircleDown(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ArrowCircleDownKt;->_arrowCircleDown:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.ArrowCircleDown"

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
    const/high16 v0, 0x40800000    # 4.0f

    .line 71
    .line 72
    const/high16 v2, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x41000000    # 8.0f

    .line 78
    .line 79
    const/high16 v18, 0x41000000    # 8.0f

    .line 80
    .line 81
    const v13, 0x408d1eb8    # 4.41f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, 0x41000000    # 8.0f

    .line 86
    .line 87
    const v16, 0x4065c28f    # 3.59f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v0, 0x41000000    # 8.0f

    .line 94
    .line 95
    const v2, -0x3f9a3d71    # -3.59f

    .line 96
    .line 97
    .line 98
    const/high16 v4, -0x3f000000    # -8.0f

    .line 99
    .line 100
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const v0, -0x3f9a3d71    # -3.59f

    .line 104
    .line 105
    .line 106
    const/high16 v2, -0x3f000000    # -8.0f

    .line 107
    .line 108
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v0, 0x40f2e148    # 7.59f

    .line 112
    .line 113
    .line 114
    const/high16 v2, 0x40800000    # 4.0f

    .line 115
    .line 116
    const/high16 v4, 0x41400000    # 12.0f

    .line 117
    .line 118
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v0, 0x40000000    # 2.0f

    .line 122
    .line 123
    const/high16 v2, 0x41400000    # 12.0f

    .line 124
    .line 125
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v17, 0x40000000    # 2.0f

    .line 129
    .line 130
    const/high16 v18, 0x41400000    # 12.0f

    .line 131
    .line 132
    const v13, 0x40cf5c29    # 6.48f

    .line 133
    .line 134
    .line 135
    const/high16 v14, 0x40000000    # 2.0f

    .line 136
    .line 137
    const/high16 v15, 0x40000000    # 2.0f

    .line 138
    .line 139
    const v16, 0x40cf5c29    # 6.48f

    .line 140
    .line 141
    .line 142
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const/high16 v17, 0x41200000    # 10.0f

    .line 146
    .line 147
    const/high16 v18, 0x41200000    # 10.0f

    .line 148
    .line 149
    const/4 v13, 0x0

    .line 150
    const v14, 0x40b0a3d7    # 5.52f

    .line 151
    .line 152
    .line 153
    const v15, 0x408f5c29    # 4.48f

    .line 154
    .line 155
    .line 156
    const/high16 v16, 0x41200000    # 10.0f

    .line 157
    .line 158
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/high16 v18, -0x3ee00000    # -10.0f

    .line 162
    .line 163
    const v13, 0x40b0a3d7    # 5.52f

    .line 164
    .line 165
    .line 166
    const/4 v14, 0x0

    .line 167
    const/high16 v15, 0x41200000    # 10.0f

    .line 168
    .line 169
    const v16, -0x3f70a3d7    # -4.48f

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const/high16 v17, 0x41400000    # 12.0f

    .line 176
    .line 177
    const/high16 v18, 0x40000000    # 2.0f

    .line 178
    .line 179
    const/high16 v13, 0x41b00000    # 22.0f

    .line 180
    .line 181
    const v14, 0x40cf5c29    # 6.48f

    .line 182
    .line 183
    .line 184
    const v15, 0x418c28f6    # 17.52f

    .line 185
    .line 186
    .line 187
    const/high16 v16, 0x40000000    # 2.0f

    .line 188
    .line 189
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v0, 0x41500000    # 13.0f

    .line 199
    .line 200
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 204
    .line 205
    const/4 v2, 0x0

    .line 206
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v17, -0x40800000    # -1.0f

    .line 210
    .line 211
    const/high16 v18, -0x40800000    # -1.0f

    .line 212
    .line 213
    const/4 v13, 0x0

    .line 214
    const v14, -0x40f33333    # -0.55f

    .line 215
    .line 216
    .line 217
    const v15, -0x4119999a    # -0.45f

    .line 218
    .line 219
    .line 220
    const/high16 v16, -0x40800000    # -1.0f

    .line 221
    .line 222
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/4 v0, 0x0

    .line 226
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/high16 v18, 0x3f800000    # 1.0f

    .line 230
    .line 231
    const v13, -0x40f33333    # -0.55f

    .line 232
    .line 233
    .line 234
    const/4 v14, 0x0

    .line 235
    const/high16 v15, -0x40800000    # -1.0f

    .line 236
    .line 237
    const v16, 0x3ee66666    # 0.45f

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v0, 0x40400000    # 3.0f

    .line 244
    .line 245
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v0, 0x41135c29    # 9.21f

    .line 249
    .line 250
    .line 251
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v17, -0x414ccccd    # -0.35f

    .line 255
    .line 256
    .line 257
    const v18, 0x3f59999a    # 0.85f

    .line 258
    .line 259
    .line 260
    const v13, -0x4119999a    # -0.45f

    .line 261
    .line 262
    .line 263
    const v15, -0x40d47ae1    # -0.67f

    .line 264
    .line 265
    .line 266
    const v16, 0x3f0a3d71    # 0.54f

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v0, 0x40328f5c    # 2.79f

    .line 273
    .line 274
    .line 275
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v17, 0x3f35c28f    # 0.71f

    .line 279
    .line 280
    .line 281
    const/16 v18, 0x0

    .line 282
    .line 283
    const v13, 0x3e4ccccd    # 0.2f

    .line 284
    .line 285
    .line 286
    const v14, 0x3e4ccccd    # 0.2f

    .line 287
    .line 288
    .line 289
    const v15, 0x3f028f5c    # 0.51f

    .line 290
    .line 291
    .line 292
    const v16, 0x3e4ccccd    # 0.2f

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v0, -0x3fcd70a4    # -2.79f

    .line 299
    .line 300
    .line 301
    const v2, 0x40328f5c    # 2.79f

    .line 302
    .line 303
    .line 304
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v17, -0x414ccccd    # -0.35f

    .line 308
    .line 309
    .line 310
    const v18, -0x40a66666    # -0.85f

    .line 311
    .line 312
    .line 313
    const v13, 0x3e9eb852    # 0.31f

    .line 314
    .line 315
    .line 316
    const v14, -0x416147ae    # -0.31f

    .line 317
    .line 318
    .line 319
    const v15, 0x3db851ec    # 0.09f

    .line 320
    .line 321
    .line 322
    const v16, -0x40a66666    # -0.85f

    .line 323
    .line 324
    .line 325
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const/high16 v0, 0x41500000    # 13.0f

    .line 329
    .line 330
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 337
    .line 338
    .line 339
    move-result-object v2

    .line 340
    const/16 v16, 0x3800

    .line 341
    .line 342
    const/16 v17, 0x0

    .line 343
    .line 344
    const/high16 v6, 0x3f800000    # 1.0f

    .line 345
    .line 346
    const/high16 v8, 0x3f800000    # 1.0f

    .line 347
    .line 348
    const/4 v7, 0x0

    .line 349
    const/high16 v9, 0x3f800000    # 1.0f

    .line 350
    .line 351
    const/high16 v12, 0x3f800000    # 1.0f

    .line 352
    .line 353
    const/4 v13, 0x0

    .line 354
    const/4 v14, 0x0

    .line 355
    const/4 v15, 0x0

    .line 356
    const-string v4, ""

    .line 357
    .line 358
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    sput-object v0, Landroidx/compose/material/icons/rounded/ArrowCircleDownKt;->_arrowCircleDown:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 367
    .line 368
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    return-object v0
.end method
