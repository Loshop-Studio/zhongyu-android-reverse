.class public final Landroidx/compose/material/icons/rounded/StarsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _stars:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getStars(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/StarsKt;->_stars:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Stars"

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
    const v0, 0x413fd70a    # 11.99f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x40000000    # 2.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v17, 0x40000000    # 2.0f

    .line 79
    .line 80
    const/high16 v18, 0x41400000    # 12.0f

    .line 81
    .line 82
    const v13, 0x40cf0a3d    # 6.47f

    .line 83
    .line 84
    .line 85
    const/high16 v14, 0x40000000    # 2.0f

    .line 86
    .line 87
    const/high16 v15, 0x40000000    # 2.0f

    .line 88
    .line 89
    const v16, 0x40cf5c29    # 6.48f

    .line 90
    .line 91
    .line 92
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const v0, 0x408f0a3d    # 4.47f

    .line 96
    .line 97
    .line 98
    const v2, 0x411fd70a    # 9.99f

    .line 99
    .line 100
    .line 101
    const/high16 v4, 0x41200000    # 10.0f

    .line 102
    .line 103
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v17, 0x41b00000    # 22.0f

    .line 107
    .line 108
    const v13, 0x418c28f6    # 17.52f

    .line 109
    .line 110
    .line 111
    const/high16 v14, 0x41b00000    # 22.0f

    .line 112
    .line 113
    const/high16 v15, 0x41b00000    # 22.0f

    .line 114
    .line 115
    const v16, 0x418c28f6    # 17.52f

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v0, 0x418c28f6    # 17.52f

    .line 122
    .line 123
    .line 124
    const v2, 0x413fd70a    # 11.99f

    .line 125
    .line 126
    .line 127
    const/high16 v4, 0x40000000    # 2.0f

    .line 128
    .line 129
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v0, 0x4173851f    # 15.22f

    .line 136
    .line 137
    .line 138
    const v2, 0x418b1eb8    # 17.39f

    .line 139
    .line 140
    .line 141
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v0, 0x41400000    # 12.0f

    .line 145
    .line 146
    const v2, 0x41773333    # 15.45f

    .line 147
    .line 148
    .line 149
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v0, -0x3fb1eb85    # -3.22f

    .line 153
    .line 154
    .line 155
    const v2, 0x3ff851ec    # 1.94f

    .line 156
    .line 157
    .line 158
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/high16 v17, -0x40c00000    # -0.75f

    .line 162
    .line 163
    const v18, -0x40f5c28f    # -0.54f

    .line 164
    .line 165
    .line 166
    const v13, -0x413d70a4    # -0.38f

    .line 167
    .line 168
    .line 169
    const v14, 0x3e6b851f    # 0.23f

    .line 170
    .line 171
    .line 172
    const v15, -0x40a66666    # -0.85f

    .line 173
    .line 174
    .line 175
    const v16, -0x421eb852    # -0.11f

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v0, -0x3f95c28f    # -3.66f

    .line 182
    .line 183
    .line 184
    const v2, 0x3f59999a    # 0.85f

    .line 185
    .line 186
    .line 187
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v0, -0x3fe33333    # -2.45f

    .line 191
    .line 192
    .line 193
    const v2, -0x3fcae148    # -2.83f

    .line 194
    .line 195
    .line 196
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v17, 0x3e947ae1    # 0.29f

    .line 200
    .line 201
    .line 202
    const v18, -0x409eb852    # -0.88f

    .line 203
    .line 204
    .line 205
    const v13, -0x41570a3d    # -0.33f

    .line 206
    .line 207
    .line 208
    const v14, -0x416b851f    # -0.29f

    .line 209
    .line 210
    .line 211
    const v15, -0x41e66666    # -0.15f

    .line 212
    .line 213
    .line 214
    const v16, -0x40a8f5c3    # -0.84f

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v0, -0x415c28f6    # -0.32f

    .line 221
    .line 222
    .line 223
    const v2, 0x406f5c29    # 3.74f

    .line 224
    .line 225
    .line 226
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v0, -0x3fa33333    # -3.45f

    .line 230
    .line 231
    .line 232
    const v2, 0x3fbae148    # 1.46f

    .line 233
    .line 234
    .line 235
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v17, 0x3f6b851f    # 0.92f

    .line 239
    .line 240
    .line 241
    const/16 v18, 0x0

    .line 242
    .line 243
    const v13, 0x3e2e147b    # 0.17f

    .line 244
    .line 245
    .line 246
    const v14, -0x412e147b    # -0.41f

    .line 247
    .line 248
    .line 249
    const/high16 v15, 0x3f400000    # 0.75f

    .line 250
    .line 251
    const v16, -0x412e147b    # -0.41f

    .line 252
    .line 253
    .line 254
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v0, 0x405c28f6    # 3.44f

    .line 258
    .line 259
    .line 260
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v0, 0x3ea3d70a    # 0.32f

    .line 264
    .line 265
    .line 266
    const v2, 0x406f5c29    # 3.74f

    .line 267
    .line 268
    .line 269
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v17, 0x3e8f5c29    # 0.28f

    .line 273
    .line 274
    .line 275
    const v18, 0x3f6147ae    # 0.88f

    .line 276
    .line 277
    .line 278
    const v13, 0x3ee147ae    # 0.44f

    .line 279
    .line 280
    .line 281
    const v14, 0x3d23d70a    # 0.04f

    .line 282
    .line 283
    .line 284
    const v15, 0x3f1eb852    # 0.62f

    .line 285
    .line 286
    .line 287
    const v16, 0x3f170a3d    # 0.59f

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v0, 0x401ccccd    # 2.45f

    .line 294
    .line 295
    .line 296
    const v2, -0x3fcae148    # -2.83f

    .line 297
    .line 298
    .line 299
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v0, 0x406ae148    # 3.67f

    .line 303
    .line 304
    .line 305
    const v2, 0x3f59999a    # 0.85f

    .line 306
    .line 307
    .line 308
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v17, -0x40c28f5c    # -0.74f

    .line 312
    .line 313
    .line 314
    const v18, 0x3f0a3d71    # 0.54f

    .line 315
    .line 316
    .line 317
    const v13, 0x3dcccccd    # 0.1f

    .line 318
    .line 319
    .line 320
    const v14, 0x3edc28f6    # 0.43f

    .line 321
    .line 322
    .line 323
    const v15, -0x4147ae14    # -0.36f

    .line 324
    .line 325
    .line 326
    const v16, 0x3f451eb8    # 0.77f

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    const/16 v16, 0x3800

    .line 340
    .line 341
    const/16 v17, 0x0

    .line 342
    .line 343
    const/high16 v6, 0x3f800000    # 1.0f

    .line 344
    .line 345
    const/high16 v8, 0x3f800000    # 1.0f

    .line 346
    .line 347
    const/4 v7, 0x0

    .line 348
    const/high16 v9, 0x3f800000    # 1.0f

    .line 349
    .line 350
    const/high16 v12, 0x3f800000    # 1.0f

    .line 351
    .line 352
    const/4 v13, 0x0

    .line 353
    const/4 v14, 0x0

    .line 354
    const/4 v15, 0x0

    .line 355
    const-string v4, ""

    .line 356
    .line 357
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    sput-object v0, Landroidx/compose/material/icons/rounded/StarsKt;->_stars:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 366
    .line 367
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 368
    .line 369
    .line 370
    return-object v0
.end method
