.class public final Landroidx/compose/material/icons/rounded/PictureInPictureKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _pictureInPicture:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPictureInPicture(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/PictureInPictureKt;->_pictureInPicture:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.PictureInPicture"

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
    const/high16 v0, 0x40e00000    # 7.0f

    .line 71
    .line 72
    const/high16 v2, 0x41900000    # 18.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, -0x3f400000    # -6.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, -0x40800000    # -1.0f

    .line 83
    .line 84
    const/high16 v18, 0x3f800000    # 1.0f

    .line 85
    .line 86
    const v13, -0x40f33333    # -0.55f

    .line 87
    .line 88
    .line 89
    const/4 v14, 0x0

    .line 90
    const/high16 v15, -0x40800000    # -1.0f

    .line 91
    .line 92
    const v16, 0x3ee66666    # 0.45f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v0, 0x40800000    # 4.0f

    .line 99
    .line 100
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v17, 0x3f800000    # 1.0f

    .line 104
    .line 105
    const/4 v13, 0x0

    .line 106
    const v14, 0x3f0ccccd    # 0.55f

    .line 107
    .line 108
    .line 109
    const v15, 0x3ee66666    # 0.45f

    .line 110
    .line 111
    .line 112
    const/high16 v16, 0x3f800000    # 1.0f

    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v0, 0x40c00000    # 6.0f

    .line 118
    .line 119
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v18, -0x40800000    # -1.0f

    .line 123
    .line 124
    const v13, 0x3f0ccccd    # 0.55f

    .line 125
    .line 126
    .line 127
    const/4 v14, 0x0

    .line 128
    const/high16 v15, 0x3f800000    # 1.0f

    .line 129
    .line 130
    const v16, -0x4119999a    # -0.45f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v0, 0x41980000    # 19.0f

    .line 137
    .line 138
    const/high16 v2, 0x41000000    # 8.0f

    .line 139
    .line 140
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v17, -0x40800000    # -1.0f

    .line 144
    .line 145
    const/4 v13, 0x0

    .line 146
    const v14, -0x40f33333    # -0.55f

    .line 147
    .line 148
    .line 149
    const v15, -0x4119999a    # -0.45f

    .line 150
    .line 151
    .line 152
    const/high16 v16, -0x40800000    # -1.0f

    .line 153
    .line 154
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const/high16 v0, 0x41a80000    # 21.0f

    .line 161
    .line 162
    const/high16 v2, 0x40400000    # 3.0f

    .line 163
    .line 164
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v0, 0x40400000    # 3.0f

    .line 168
    .line 169
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v17, -0x40000000    # -2.0f

    .line 173
    .line 174
    const/high16 v18, 0x40000000    # 2.0f

    .line 175
    .line 176
    const v13, -0x40733333    # -1.1f

    .line 177
    .line 178
    .line 179
    const/4 v14, 0x0

    .line 180
    const/high16 v15, -0x40000000    # -2.0f

    .line 181
    .line 182
    const v16, 0x3f666666    # 0.9f

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v0, 0x41600000    # 14.0f

    .line 189
    .line 190
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v17, 0x40000000    # 2.0f

    .line 194
    .line 195
    const v18, 0x3ffd70a4    # 1.98f

    .line 196
    .line 197
    .line 198
    const/4 v13, 0x0

    .line 199
    const v14, 0x3f8ccccd    # 1.1f

    .line 200
    .line 201
    .line 202
    const v15, 0x3f666666    # 0.9f

    .line 203
    .line 204
    .line 205
    const v16, 0x3ffd70a4    # 1.98f

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v0, 0x41900000    # 18.0f

    .line 212
    .line 213
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v18, -0x40028f5c    # -1.98f

    .line 217
    .line 218
    .line 219
    const v13, 0x3f8ccccd    # 1.1f

    .line 220
    .line 221
    .line 222
    const/4 v14, 0x0

    .line 223
    const/high16 v15, 0x40000000    # 2.0f

    .line 224
    .line 225
    const v16, -0x409eb852    # -0.88f

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const/high16 v0, 0x41b80000    # 23.0f

    .line 232
    .line 233
    const/high16 v2, 0x40a00000    # 5.0f

    .line 234
    .line 235
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v17, -0x40000000    # -2.0f

    .line 239
    .line 240
    const/high16 v18, -0x40000000    # -2.0f

    .line 241
    .line 242
    const/4 v13, 0x0

    .line 243
    const v14, -0x40733333    # -1.1f

    .line 244
    .line 245
    .line 246
    const v15, -0x4099999a    # -0.9f

    .line 247
    .line 248
    .line 249
    const/high16 v16, -0x40000000    # -2.0f

    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const/high16 v0, 0x41a00000    # 20.0f

    .line 258
    .line 259
    const v2, 0x4198147b    # 19.01f

    .line 260
    .line 261
    .line 262
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v0, 0x4198147b    # 19.01f

    .line 266
    .line 267
    .line 268
    const/high16 v2, 0x40800000    # 4.0f

    .line 269
    .line 270
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v17, -0x40800000    # -1.0f

    .line 274
    .line 275
    const/high16 v18, -0x40800000    # -1.0f

    .line 276
    .line 277
    const v13, -0x40f33333    # -0.55f

    .line 278
    .line 279
    .line 280
    const/4 v14, 0x0

    .line 281
    const/high16 v15, -0x40800000    # -1.0f

    .line 282
    .line 283
    const v16, -0x4119999a    # -0.45f

    .line 284
    .line 285
    .line 286
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v0, 0x40bf5c29    # 5.98f

    .line 290
    .line 291
    .line 292
    const/high16 v2, 0x40400000    # 3.0f

    .line 293
    .line 294
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const/high16 v17, 0x3f800000    # 1.0f

    .line 298
    .line 299
    const/4 v13, 0x0

    .line 300
    const v14, -0x40f33333    # -0.55f

    .line 301
    .line 302
    .line 303
    const v15, 0x3ee66666    # 0.45f

    .line 304
    .line 305
    .line 306
    const/high16 v16, -0x40800000    # -1.0f

    .line 307
    .line 308
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const/high16 v0, 0x41800000    # 16.0f

    .line 312
    .line 313
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const/high16 v18, 0x3f800000    # 1.0f

    .line 317
    .line 318
    const v13, 0x3f0ccccd    # 0.55f

    .line 319
    .line 320
    .line 321
    const/4 v14, 0x0

    .line 322
    const/high16 v15, 0x3f800000    # 1.0f

    .line 323
    .line 324
    const v16, 0x3ee66666    # 0.45f

    .line 325
    .line 326
    .line 327
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v0, 0x41407ae1    # 12.03f

    .line 331
    .line 332
    .line 333
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/high16 v17, -0x40800000    # -1.0f

    .line 337
    .line 338
    const/4 v13, 0x0

    .line 339
    const v14, 0x3f0ccccd    # 0.55f

    .line 340
    .line 341
    .line 342
    const v15, -0x4119999a    # -0.45f

    .line 343
    .line 344
    .line 345
    const/high16 v16, 0x3f800000    # 1.0f

    .line 346
    .line 347
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 354
    .line 355
    .line 356
    move-result-object v2

    .line 357
    const/16 v16, 0x3800

    .line 358
    .line 359
    const/16 v17, 0x0

    .line 360
    .line 361
    const/high16 v6, 0x3f800000    # 1.0f

    .line 362
    .line 363
    const/high16 v8, 0x3f800000    # 1.0f

    .line 364
    .line 365
    const/4 v7, 0x0

    .line 366
    const/high16 v9, 0x3f800000    # 1.0f

    .line 367
    .line 368
    const/high16 v12, 0x3f800000    # 1.0f

    .line 369
    .line 370
    const/4 v14, 0x0

    .line 371
    const/4 v15, 0x0

    .line 372
    const-string v4, ""

    .line 373
    .line 374
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    sput-object v0, Landroidx/compose/material/icons/rounded/PictureInPictureKt;->_pictureInPicture:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 383
    .line 384
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 385
    .line 386
    .line 387
    return-object v0
.end method
