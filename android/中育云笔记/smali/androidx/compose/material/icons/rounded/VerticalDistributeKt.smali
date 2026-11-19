.class public final Landroidx/compose/material/icons/rounded/VerticalDistributeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _verticalDistribute:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getVerticalDistribute(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/VerticalDistributeKt;->_verticalDistribute:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.VerticalDistribute"

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
    const/high16 v0, 0x41b00000    # 22.0f

    .line 71
    .line 72
    const/high16 v2, 0x40400000    # 3.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 78
    .line 79
    .line 80
    const/high16 v17, -0x40800000    # -1.0f

    .line 81
    .line 82
    const/high16 v18, 0x3f800000    # 1.0f

    .line 83
    .line 84
    const/4 v13, 0x0

    .line 85
    const v14, 0x3f0ccccd    # 0.55f

    .line 86
    .line 87
    .line 88
    const v15, -0x4119999a    # -0.45f

    .line 89
    .line 90
    .line 91
    const/high16 v16, 0x3f800000    # 1.0f

    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v0, 0x40400000    # 3.0f

    .line 97
    .line 98
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v17, 0x40000000    # 2.0f

    .line 102
    .line 103
    const/high16 v18, 0x40400000    # 3.0f

    .line 104
    .line 105
    const v13, 0x401ccccd    # 2.45f

    .line 106
    .line 107
    .line 108
    const/high16 v14, 0x40800000    # 4.0f

    .line 109
    .line 110
    const/high16 v15, 0x40000000    # 2.0f

    .line 111
    .line 112
    const v16, 0x40633333    # 3.55f

    .line 113
    .line 114
    .line 115
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const/4 v0, 0x0

    .line 119
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v17, 0x3f800000    # 1.0f

    .line 123
    .line 124
    const/high16 v18, -0x40800000    # -1.0f

    .line 125
    .line 126
    const/4 v13, 0x0

    .line 127
    const v14, -0x40f33333    # -0.55f

    .line 128
    .line 129
    .line 130
    const v15, 0x3ee66666    # 0.45f

    .line 131
    .line 132
    .line 133
    const/high16 v16, -0x40800000    # -1.0f

    .line 134
    .line 135
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v0, 0x41900000    # 18.0f

    .line 139
    .line 140
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v17, 0x41b00000    # 22.0f

    .line 144
    .line 145
    const/high16 v18, 0x40400000    # 3.0f

    .line 146
    .line 147
    const v13, 0x41ac6666    # 21.55f

    .line 148
    .line 149
    .line 150
    const/high16 v14, 0x40000000    # 2.0f

    .line 151
    .line 152
    const/high16 v15, 0x41b00000    # 22.0f

    .line 153
    .line 154
    const v16, 0x401ccccd    # 2.45f

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/high16 v0, 0x41400000    # 12.0f

    .line 164
    .line 165
    const/high16 v2, 0x40e00000    # 7.0f

    .line 166
    .line 167
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 174
    .line 175
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 176
    .line 177
    const/4 v13, 0x0

    .line 178
    const v14, 0x3f547ae1    # 0.83f

    .line 179
    .line 180
    .line 181
    const v15, 0x3f2b851f    # 0.67f

    .line 182
    .line 183
    .line 184
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 185
    .line 186
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/high16 v0, 0x40e00000    # 7.0f

    .line 190
    .line 191
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v18, -0x40400000    # -1.5f

    .line 195
    .line 196
    const v13, 0x3f547ae1    # 0.83f

    .line 197
    .line 198
    .line 199
    const/4 v14, 0x0

    .line 200
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 201
    .line 202
    const v16, -0x40d47ae1    # -0.67f

    .line 203
    .line 204
    .line 205
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/4 v0, 0x0

    .line 209
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v17, -0x40400000    # -1.5f

    .line 213
    .line 214
    const/4 v13, 0x0

    .line 215
    const v14, -0x40ab851f    # -0.83f

    .line 216
    .line 217
    .line 218
    const v15, -0x40d47ae1    # -0.67f

    .line 219
    .line 220
    .line 221
    const/high16 v16, -0x40400000    # -1.5f

    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v0, -0x3f200000    # -7.0f

    .line 227
    .line 228
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const/high16 v17, 0x40e00000    # 7.0f

    .line 232
    .line 233
    const/high16 v18, 0x41400000    # 12.0f

    .line 234
    .line 235
    const v13, 0x40f570a4    # 7.67f

    .line 236
    .line 237
    .line 238
    const/high16 v14, 0x41280000    # 10.5f

    .line 239
    .line 240
    const/high16 v15, 0x40e00000    # 7.0f

    .line 241
    .line 242
    const v16, 0x4132b852    # 11.17f

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v0, 0x41a80000    # 21.0f

    .line 252
    .line 253
    const/high16 v2, 0x40000000    # 2.0f

    .line 254
    .line 255
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v17, 0x3f800000    # 1.0f

    .line 262
    .line 263
    const/high16 v18, 0x3f800000    # 1.0f

    .line 264
    .line 265
    const/4 v13, 0x0

    .line 266
    const v14, 0x3f0ccccd    # 0.55f

    .line 267
    .line 268
    .line 269
    const v15, 0x3ee66666    # 0.45f

    .line 270
    .line 271
    .line 272
    const/high16 v16, 0x3f800000    # 1.0f

    .line 273
    .line 274
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v0, 0x41900000    # 18.0f

    .line 278
    .line 279
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v18, -0x40800000    # -1.0f

    .line 283
    .line 284
    const v13, 0x3f0ccccd    # 0.55f

    .line 285
    .line 286
    .line 287
    const/4 v14, 0x0

    .line 288
    const/high16 v15, 0x3f800000    # 1.0f

    .line 289
    .line 290
    const v16, -0x4119999a    # -0.45f

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const/4 v0, 0x0

    .line 297
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v17, -0x40800000    # -1.0f

    .line 301
    .line 302
    const/4 v13, 0x0

    .line 303
    const v14, -0x40f33333    # -0.55f

    .line 304
    .line 305
    .line 306
    const v15, -0x4119999a    # -0.45f

    .line 307
    .line 308
    .line 309
    const/high16 v16, -0x40800000    # -1.0f

    .line 310
    .line 311
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const/high16 v0, 0x40400000    # 3.0f

    .line 315
    .line 316
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v17, 0x40000000    # 2.0f

    .line 320
    .line 321
    const/high16 v18, 0x41a80000    # 21.0f

    .line 322
    .line 323
    const v13, 0x401ccccd    # 2.45f

    .line 324
    .line 325
    .line 326
    const/high16 v14, 0x41a00000    # 20.0f

    .line 327
    .line 328
    const/high16 v15, 0x40000000    # 2.0f

    .line 329
    .line 330
    const v16, 0x41a3999a    # 20.45f

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    const/16 v16, 0x3800

    .line 344
    .line 345
    const/16 v17, 0x0

    .line 346
    .line 347
    const/high16 v6, 0x3f800000    # 1.0f

    .line 348
    .line 349
    const/high16 v8, 0x3f800000    # 1.0f

    .line 350
    .line 351
    const/4 v7, 0x0

    .line 352
    const/high16 v9, 0x3f800000    # 1.0f

    .line 353
    .line 354
    const/high16 v12, 0x3f800000    # 1.0f

    .line 355
    .line 356
    const/4 v13, 0x0

    .line 357
    const/4 v14, 0x0

    .line 358
    const/4 v15, 0x0

    .line 359
    const-string v4, ""

    .line 360
    .line 361
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    sput-object v0, Landroidx/compose/material/icons/rounded/VerticalDistributeKt;->_verticalDistribute:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 370
    .line 371
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 372
    .line 373
    .line 374
    return-object v0
.end method
