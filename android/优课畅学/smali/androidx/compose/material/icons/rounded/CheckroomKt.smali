.class public final Landroidx/compose/material/icons/rounded/CheckroomKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _checkroom:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCheckroom(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/CheckroomKt;->_checkroom:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Checkroom"

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
    const v0, 0x41accccd    # 21.6f

    .line 71
    .line 72
    .line 73
    const v2, 0x4191999a    # 18.2f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v0, 0x41500000    # 13.0f

    .line 80
    .line 81
    const/high16 v2, 0x413c0000    # 11.75f

    .line 82
    .line 83
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const v0, -0x40970a3d    # -0.91f

    .line 87
    .line 88
    .line 89
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const v17, 0x401b851f    # 2.43f

    .line 93
    .line 94
    .line 95
    const v18, -0x3f7e6666    # -4.05f

    .line 96
    .line 97
    .line 98
    const v13, 0x3fd33333    # 1.65f

    .line 99
    .line 100
    .line 101
    const v14, -0x41051eb8    # -0.49f

    .line 102
    .line 103
    .line 104
    const v15, 0x40333333    # 2.8f

    .line 105
    .line 106
    .line 107
    const v16, -0x3ff51eb8    # -2.17f

    .line 108
    .line 109
    .line 110
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const v17, -0x3fd8f5c3    # -2.61f

    .line 114
    .line 115
    .line 116
    const v18, -0x3fd33333    # -2.7f

    .line 117
    .line 118
    .line 119
    const v13, -0x417ae148    # -0.26f

    .line 120
    .line 121
    .line 122
    const v14, -0x405851ec    # -1.31f

    .line 123
    .line 124
    .line 125
    const v15, -0x4059999a    # -1.3f

    .line 126
    .line 127
    .line 128
    const v16, -0x3fe66666    # -2.4f

    .line 129
    .line 130
    .line 131
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v17, -0x3f7f5c29    # -4.02f

    .line 135
    .line 136
    .line 137
    const v18, 0x3ffd70a4    # 1.98f

    .line 138
    .line 139
    .line 140
    const v13, -0x401eb852    # -1.76f

    .line 141
    .line 142
    .line 143
    const v14, -0x41333333    # -0.4f

    .line 144
    .line 145
    .line 146
    const v15, -0x3fa851ec    # -3.37f

    .line 147
    .line 148
    .line 149
    const v16, 0x3f07ae14    # 0.53f

    .line 150
    .line 151
    .line 152
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v17, 0x411b5c29    # 9.71f

    .line 156
    .line 157
    .line 158
    const/high16 v18, 0x40f00000    # 7.5f

    .line 159
    .line 160
    const/high16 v13, 0x41080000    # 8.5f

    .line 161
    .line 162
    const v14, 0x40d7ae14    # 6.74f

    .line 163
    .line 164
    .line 165
    const v15, 0x410fae14    # 8.98f

    .line 166
    .line 167
    .line 168
    const/high16 v16, 0x40f00000    # 7.5f

    .line 169
    .line 170
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/4 v0, 0x0

    .line 174
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v17, 0x3f666666    # 0.9f

    .line 178
    .line 179
    .line 180
    const v18, -0x40ee147b    # -0.57f

    .line 181
    .line 182
    .line 183
    const v13, 0x3ec7ae14    # 0.39f

    .line 184
    .line 185
    .line 186
    const/4 v14, 0x0

    .line 187
    const/high16 v15, 0x3f400000    # 0.75f

    .line 188
    .line 189
    const v16, -0x419eb852    # -0.22f

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v17, 0x41400000    # 12.0f

    .line 196
    .line 197
    const/high16 v18, 0x40c00000    # 6.0f

    .line 198
    .line 199
    const v13, 0x412d70a4    # 10.84f

    .line 200
    .line 201
    .line 202
    const v14, 0x40cc28f6    # 6.38f

    .line 203
    .line 204
    .line 205
    const v15, 0x4135eb85    # 11.37f

    .line 206
    .line 207
    .line 208
    const/high16 v16, 0x40c00000    # 6.0f

    .line 209
    .line 210
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 214
    .line 215
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 216
    .line 217
    const v13, 0x3f547ae1    # 0.83f

    .line 218
    .line 219
    .line 220
    const/4 v14, 0x0

    .line 221
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 222
    .line 223
    const v16, 0x3f2b851f    # 0.67f

    .line 224
    .line 225
    .line 226
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v17, -0x403c28f6    # -1.53f

    .line 230
    .line 231
    .line 232
    const/4 v13, 0x0

    .line 233
    const v14, 0x3f570a3d    # 0.84f

    .line 234
    .line 235
    .line 236
    const v15, -0x40cf5c29    # -0.69f

    .line 237
    .line 238
    .line 239
    const v16, 0x3fc28f5c    # 1.52f

    .line 240
    .line 241
    .line 242
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const/high16 v17, 0x41300000    # 11.0f

    .line 246
    .line 247
    const v18, 0x411fd70a    # 9.99f

    .line 248
    .line 249
    .line 250
    const v13, 0x4136e148    # 11.43f

    .line 251
    .line 252
    .line 253
    const v14, 0x410fd70a    # 8.99f

    .line 254
    .line 255
    .line 256
    const/high16 v15, 0x41300000    # 11.0f

    .line 257
    .line 258
    const v16, 0x41173333    # 9.45f

    .line 259
    .line 260
    .line 261
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v0, 0x3fe147ae    # 1.76f

    .line 265
    .line 266
    .line 267
    const/4 v2, 0x0

    .line 268
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v0, 0x4019999a    # 2.4f

    .line 272
    .line 273
    .line 274
    const v2, 0x4191999a    # 18.2f

    .line 275
    .line 276
    .line 277
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v17, 0x40400000    # 3.0f

    .line 281
    .line 282
    const/high16 v18, 0x41a00000    # 20.0f

    .line 283
    .line 284
    const v13, 0x3fd0a3d7    # 1.63f

    .line 285
    .line 286
    .line 287
    const v14, 0x41963d71    # 18.78f

    .line 288
    .line 289
    .line 290
    const v15, 0x40028f5c    # 2.04f

    .line 291
    .line 292
    .line 293
    const/high16 v16, 0x41a00000    # 20.0f

    .line 294
    .line 295
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v0, 0x41100000    # 9.0f

    .line 299
    .line 300
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v17, 0x41accccd    # 21.6f

    .line 307
    .line 308
    .line 309
    const v18, 0x4191999a    # 18.2f

    .line 310
    .line 311
    .line 312
    const v13, 0x41afae14    # 21.96f

    .line 313
    .line 314
    .line 315
    const/high16 v14, 0x41a00000    # 20.0f

    .line 316
    .line 317
    const v15, 0x41b2f5c3    # 22.37f

    .line 318
    .line 319
    .line 320
    const v16, 0x41963d71    # 18.78f

    .line 321
    .line 322
    .line 323
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const/high16 v0, 0x41900000    # 18.0f

    .line 330
    .line 331
    const/high16 v2, 0x40c00000    # 6.0f

    .line 332
    .line 333
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/high16 v0, -0x3f700000    # -4.5f

    .line 337
    .line 338
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const/high16 v0, 0x40900000    # 4.5f

    .line 342
    .line 343
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const/high16 v0, 0x40c00000    # 6.0f

    .line 347
    .line 348
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 355
    .line 356
    .line 357
    move-result-object v2

    .line 358
    const/16 v16, 0x3800

    .line 359
    .line 360
    const/16 v17, 0x0

    .line 361
    .line 362
    const/high16 v6, 0x3f800000    # 1.0f

    .line 363
    .line 364
    const/high16 v8, 0x3f800000    # 1.0f

    .line 365
    .line 366
    const/4 v7, 0x0

    .line 367
    const/high16 v9, 0x3f800000    # 1.0f

    .line 368
    .line 369
    const/high16 v12, 0x3f800000    # 1.0f

    .line 370
    .line 371
    const/4 v13, 0x0

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
    sput-object v0, Landroidx/compose/material/icons/rounded/CheckroomKt;->_checkroom:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 385
    .line 386
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 387
    .line 388
    .line 389
    return-object v0
.end method
