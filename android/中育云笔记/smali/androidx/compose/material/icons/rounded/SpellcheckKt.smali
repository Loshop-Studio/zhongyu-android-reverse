.class public final Landroidx/compose/material/icons/rounded/SpellcheckKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _spellcheck:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSpellcheck(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SpellcheckKt;->_spellcheck:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Spellcheck"

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
    const v0, 0x4151eb85    # 13.12f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41800000    # 16.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v17, 0x3f666666    # 0.9f

    .line 79
    .line 80
    .line 81
    const v18, -0x40570a3d    # -1.32f

    .line 82
    .line 83
    .line 84
    const v13, 0x3f30a3d7    # 0.69f

    .line 85
    .line 86
    .line 87
    const/4 v14, 0x0

    .line 88
    const v15, 0x3f933333    # 1.15f

    .line 89
    .line 90
    .line 91
    const v16, -0x40cf5c29    # -0.69f

    .line 92
    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v0, 0x411c51ec    # 9.77f

    .line 98
    .line 99
    .line 100
    const v2, 0x4077ae14    # 3.87f

    .line 101
    .line 102
    .line 103
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v17, 0x41080000    # 8.5f

    .line 107
    .line 108
    const/high16 v18, 0x40400000    # 3.0f

    .line 109
    .line 110
    const v13, 0x4118f5c3    # 9.56f

    .line 111
    .line 112
    .line 113
    const v14, 0x4055c28f    # 3.34f

    .line 114
    .line 115
    .line 116
    const v15, 0x4110f5c3    # 9.06f

    .line 117
    .line 118
    .line 119
    const/high16 v16, 0x40400000    # 3.0f

    .line 120
    .line 121
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v0, -0x405d70a4    # -1.27f

    .line 125
    .line 126
    .line 127
    const v2, 0x3f5eb852    # 0.87f

    .line 128
    .line 129
    .line 130
    const v4, -0x407851ec    # -1.06f

    .line 131
    .line 132
    .line 133
    const v6, 0x3eae147b    # 0.34f

    .line 134
    .line 135
    .line 136
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v0, 0x403eb852    # 2.98f

    .line 140
    .line 141
    .line 142
    const v2, 0x416ae148    # 14.68f

    .line 143
    .line 144
    .line 145
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v17, 0x3f666666    # 0.9f

    .line 149
    .line 150
    .line 151
    const v18, 0x3fa8f5c3    # 1.32f

    .line 152
    .line 153
    .line 154
    const/high16 v13, -0x41800000    # -0.25f

    .line 155
    .line 156
    const v14, 0x3f2147ae    # 0.63f

    .line 157
    .line 158
    .line 159
    const v15, 0x3e6147ae    # 0.22f

    .line 160
    .line 161
    .line 162
    const v16, 0x3fa8f5c3    # 1.32f

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v17, 0x3f68f5c3    # 0.91f

    .line 169
    .line 170
    .line 171
    const v18, -0x40deb852    # -0.63f

    .line 172
    .line 173
    .line 174
    const v13, 0x3ecccccd    # 0.4f

    .line 175
    .line 176
    .line 177
    const/4 v14, 0x0

    .line 178
    const v15, 0x3f428f5c    # 0.76f

    .line 179
    .line 180
    .line 181
    const/high16 v16, -0x41800000    # -0.25f

    .line 182
    .line 183
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v0, 0x40b570a4    # 5.67f

    .line 187
    .line 188
    .line 189
    const/high16 v2, 0x41500000    # 13.0f

    .line 190
    .line 191
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v0, 0x40b47ae1    # 5.64f

    .line 195
    .line 196
    .line 197
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v0, 0x3f666666    # 0.9f

    .line 201
    .line 202
    .line 203
    const v2, 0x401851ec    # 2.38f

    .line 204
    .line 205
    .line 206
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v18, 0x3f1eb852    # 0.62f

    .line 210
    .line 211
    .line 212
    const v13, 0x3e19999a    # 0.15f

    .line 213
    .line 214
    .line 215
    const v14, 0x3ebd70a4    # 0.37f

    .line 216
    .line 217
    .line 218
    const v15, 0x3f028f5c    # 0.51f

    .line 219
    .line 220
    .line 221
    const v16, 0x3f1eb852    # 0.62f

    .line 222
    .line 223
    .line 224
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v0, 0x40cdc28f    # 6.43f

    .line 231
    .line 232
    .line 233
    const/high16 v2, 0x41300000    # 11.0f

    .line 234
    .line 235
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v0, 0x41080000    # 8.5f

    .line 239
    .line 240
    const v2, 0x40af5c29    # 5.48f

    .line 241
    .line 242
    .line 243
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v0, 0x41291eb8    # 10.57f

    .line 247
    .line 248
    .line 249
    const/high16 v2, 0x41300000    # 11.0f

    .line 250
    .line 251
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v0, 0x40cdc28f    # 6.43f

    .line 255
    .line 256
    .line 257
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v0, 0x41a71eb8    # 20.89f

    .line 264
    .line 265
    .line 266
    const v2, 0x4144a3d7    # 12.29f

    .line 267
    .line 268
    .line 269
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v0, -0x3f13851f    # -7.39f

    .line 273
    .line 274
    .line 275
    const v2, 0x40ec7ae1    # 7.39f

    .line 276
    .line 277
    .line 278
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v0, -0x3fc1eb85    # -2.97f

    .line 282
    .line 283
    .line 284
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const v17, -0x404b851f    # -1.41f

    .line 288
    .line 289
    .line 290
    const/16 v18, 0x0

    .line 291
    .line 292
    const v13, -0x413851ec    # -0.39f

    .line 293
    .line 294
    .line 295
    const v14, -0x413851ec    # -0.39f

    .line 296
    .line 297
    .line 298
    const v15, -0x407d70a4    # -1.02f

    .line 299
    .line 300
    .line 301
    const v16, -0x413851ec    # -0.39f

    .line 302
    .line 303
    .line 304
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/16 v17, 0x0

    .line 308
    .line 309
    const v18, 0x3fb47ae1    # 1.41f

    .line 310
    .line 311
    .line 312
    const v14, 0x3ec7ae14    # 0.39f

    .line 313
    .line 314
    .line 315
    const v15, -0x413851ec    # -0.39f

    .line 316
    .line 317
    .line 318
    const v16, 0x3f828f5c    # 1.02f

    .line 319
    .line 320
    .line 321
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v0, 0x406b851f    # 3.68f

    .line 325
    .line 326
    .line 327
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v17, 0x3fb47ae1    # 1.41f

    .line 331
    .line 332
    .line 333
    const/16 v18, 0x0

    .line 334
    .line 335
    const v13, 0x3ec7ae14    # 0.39f

    .line 336
    .line 337
    .line 338
    const v15, 0x3f828f5c    # 1.02f

    .line 339
    .line 340
    .line 341
    const v16, 0x3ec7ae14    # 0.39f

    .line 342
    .line 343
    .line 344
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v0, 0x410147ae    # 8.08f

    .line 348
    .line 349
    .line 350
    const v2, -0x3efe8f5c    # -8.09f

    .line 351
    .line 352
    .line 353
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/16 v17, 0x0

    .line 357
    .line 358
    const v18, -0x404b851f    # -1.41f

    .line 359
    .line 360
    .line 361
    const v14, -0x413851ec    # -0.39f

    .line 362
    .line 363
    .line 364
    const v15, 0x3ec7ae14    # 0.39f

    .line 365
    .line 366
    .line 367
    const v16, -0x407d70a4    # -1.02f

    .line 368
    .line 369
    .line 370
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v17, -0x404ccccd    # -1.4f

    .line 374
    .line 375
    .line 376
    const v18, -0x43dc28f6    # -0.01f

    .line 377
    .line 378
    .line 379
    const v13, -0x413d70a4    # -0.38f

    .line 380
    .line 381
    .line 382
    const v15, -0x407d70a4    # -1.02f

    .line 383
    .line 384
    .line 385
    const v16, -0x413851ec    # -0.39f

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 395
    .line 396
    .line 397
    move-result-object v2

    .line 398
    const/16 v16, 0x3800

    .line 399
    .line 400
    const/16 v17, 0x0

    .line 401
    .line 402
    const/high16 v6, 0x3f800000    # 1.0f

    .line 403
    .line 404
    const/high16 v8, 0x3f800000    # 1.0f

    .line 405
    .line 406
    const/4 v7, 0x0

    .line 407
    const/high16 v9, 0x3f800000    # 1.0f

    .line 408
    .line 409
    const/high16 v12, 0x3f800000    # 1.0f

    .line 410
    .line 411
    const/4 v13, 0x0

    .line 412
    const/4 v14, 0x0

    .line 413
    const/4 v15, 0x0

    .line 414
    const-string v4, ""

    .line 415
    .line 416
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    sput-object v0, Landroidx/compose/material/icons/rounded/SpellcheckKt;->_spellcheck:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 425
    .line 426
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 427
    .line 428
    .line 429
    return-object v0
.end method
