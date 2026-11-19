.class public final Landroidx/compose/material/icons/rounded/LayersKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _layers:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLayers(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/LayersKt;->_layers:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Layers"

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
    const v0, 0x4149999a    # 12.6f

    .line 71
    .line 72
    .line 73
    const v2, 0x41907ae1    # 18.06f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x40628f5c    # -1.23f

    .line 80
    .line 81
    .line 82
    const/16 v18, 0x0

    .line 83
    .line 84
    const v13, -0x4147ae14    # -0.36f

    .line 85
    .line 86
    .line 87
    const v14, 0x3e8f5c29    # 0.28f

    .line 88
    .line 89
    .line 90
    const v15, -0x40a147ae    # -0.87f

    .line 91
    .line 92
    .line 93
    const v16, 0x3e8f5c29    # 0.28f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v0, -0x3f670a3d    # -4.78f

    .line 100
    .line 101
    .line 102
    const v2, -0x3f3b3333    # -6.15f

    .line 103
    .line 104
    .line 105
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v17, -0x4063d70a    # -1.22f

    .line 109
    .line 110
    .line 111
    const v14, -0x4170a3d7    # -0.28f

    .line 112
    .line 113
    .line 114
    const v15, -0x40a3d70a    # -0.86f

    .line 115
    .line 116
    .line 117
    const v16, -0x4170a3d7    # -0.28f

    .line 118
    .line 119
    .line 120
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/16 v17, 0x0

    .line 124
    .line 125
    const v18, 0x3fc8f5c3    # 1.57f

    .line 126
    .line 127
    .line 128
    const v13, -0x40fd70a4    # -0.51f

    .line 129
    .line 130
    .line 131
    const v14, 0x3ecccccd    # 0.4f

    .line 132
    .line 133
    .line 134
    const v15, -0x40fd70a4    # -0.51f

    .line 135
    .line 136
    .line 137
    const v16, 0x3f95c28f    # 1.17f

    .line 138
    .line 139
    .line 140
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v0, 0x40a851ec    # 5.26f

    .line 144
    .line 145
    .line 146
    const v2, 0x40d851ec    # 6.76f

    .line 147
    .line 148
    .line 149
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v17, 0x401d70a4    # 2.46f

    .line 153
    .line 154
    .line 155
    const/16 v18, 0x0

    .line 156
    .line 157
    const v13, 0x3f3851ec    # 0.72f

    .line 158
    .line 159
    .line 160
    const v14, 0x3f0f5c29    # 0.56f

    .line 161
    .line 162
    .line 163
    const v15, 0x3fdd70a4    # 1.73f

    .line 164
    .line 165
    .line 166
    const v16, 0x3f0f5c29    # 0.56f

    .line 167
    .line 168
    .line 169
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v0, -0x3f57ae14    # -5.26f

    .line 173
    .line 174
    .line 175
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const/16 v17, 0x0

    .line 179
    .line 180
    const v18, -0x40370a3d    # -1.57f

    .line 181
    .line 182
    .line 183
    const v13, 0x3f028f5c    # 0.51f

    .line 184
    .line 185
    .line 186
    const v14, -0x41333333    # -0.4f

    .line 187
    .line 188
    .line 189
    const v15, 0x3f028f5c    # 0.51f

    .line 190
    .line 191
    .line 192
    const v16, -0x406a3d71    # -1.17f

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v0, -0x43dc28f6    # -0.01f

    .line 199
    .line 200
    .line 201
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v17, -0x4063d70a    # -1.22f

    .line 205
    .line 206
    .line 207
    const/16 v18, 0x0

    .line 208
    .line 209
    const v13, -0x4147ae14    # -0.36f

    .line 210
    .line 211
    .line 212
    const v14, -0x4170a3d7    # -0.28f

    .line 213
    .line 214
    .line 215
    const v15, -0x40a3d70a    # -0.86f

    .line 216
    .line 217
    .line 218
    const v16, -0x4170a3d7    # -0.28f

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v0, 0x409947ae    # 4.79f

    .line 225
    .line 226
    .line 227
    const v2, -0x3f3b3333    # -6.15f

    .line 228
    .line 229
    .line 230
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v0, 0x4153ae14    # 13.23f

    .line 237
    .line 238
    .line 239
    const v2, 0x4170a3d7    # 15.04f

    .line 240
    .line 241
    .line 242
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const v0, -0x3f57ae14    # -5.26f

    .line 246
    .line 247
    .line 248
    const v2, 0x40d851ec    # 6.76f

    .line 249
    .line 250
    .line 251
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/16 v17, 0x0

    .line 255
    .line 256
    const v18, -0x4035c28f    # -1.58f

    .line 257
    .line 258
    .line 259
    const v13, 0x3f028f5c    # 0.51f

    .line 260
    .line 261
    .line 262
    const v14, -0x41333333    # -0.4f

    .line 263
    .line 264
    .line 265
    const v15, 0x3f028f5c    # 0.51f

    .line 266
    .line 267
    .line 268
    const v16, -0x4068f5c3    # -1.18f

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v0, -0x3f27ae14    # -6.76f

    .line 275
    .line 276
    .line 277
    const v2, -0x3f57ae14    # -5.26f

    .line 278
    .line 279
    .line 280
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v17, -0x3fe28f5c    # -2.46f

    .line 284
    .line 285
    .line 286
    const/16 v18, 0x0

    .line 287
    .line 288
    const v13, -0x40c7ae14    # -0.72f

    .line 289
    .line 290
    .line 291
    const v14, -0x40f0a3d7    # -0.56f

    .line 292
    .line 293
    .line 294
    const v15, -0x40228f5c    # -1.73f

    .line 295
    .line 296
    .line 297
    const v16, -0x40f0a3d7    # -0.56f

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const v0, 0x408051ec    # 4.01f

    .line 304
    .line 305
    .line 306
    const v2, 0x41035c29    # 8.21f

    .line 307
    .line 308
    .line 309
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/16 v17, 0x0

    .line 313
    .line 314
    const v18, 0x3fca3d71    # 1.58f

    .line 315
    .line 316
    .line 317
    const v13, -0x40fd70a4    # -0.51f

    .line 318
    .line 319
    .line 320
    const v14, 0x3ecccccd    # 0.4f

    .line 321
    .line 322
    .line 323
    const v15, -0x40fd70a4    # -0.51f

    .line 324
    .line 325
    .line 326
    const v16, 0x3f970a3d    # 1.18f

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v0, 0x40a851ec    # 5.26f

    .line 333
    .line 334
    .line 335
    const v2, 0x40d851ec    # 6.76f

    .line 336
    .line 337
    .line 338
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v17, 0x401d70a4    # 2.46f

    .line 342
    .line 343
    .line 344
    const v18, -0x43dc28f6    # -0.01f

    .line 345
    .line 346
    .line 347
    const v13, 0x3f3851ec    # 0.72f

    .line 348
    .line 349
    .line 350
    const v14, 0x3f0f5c29    # 0.56f

    .line 351
    .line 352
    .line 353
    const v15, 0x3fdeb852    # 1.74f

    .line 354
    .line 355
    .line 356
    const v16, 0x3f0f5c29    # 0.56f

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 366
    .line 367
    .line 368
    move-result-object v2

    .line 369
    const/16 v16, 0x3800

    .line 370
    .line 371
    const/16 v17, 0x0

    .line 372
    .line 373
    const/high16 v6, 0x3f800000    # 1.0f

    .line 374
    .line 375
    const/high16 v8, 0x3f800000    # 1.0f

    .line 376
    .line 377
    const/4 v7, 0x0

    .line 378
    const/high16 v9, 0x3f800000    # 1.0f

    .line 379
    .line 380
    const/high16 v12, 0x3f800000    # 1.0f

    .line 381
    .line 382
    const/4 v13, 0x0

    .line 383
    const/4 v14, 0x0

    .line 384
    const/4 v15, 0x0

    .line 385
    const-string v4, ""

    .line 386
    .line 387
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    sput-object v0, Landroidx/compose/material/icons/rounded/LayersKt;->_layers:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 396
    .line 397
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 398
    .line 399
    .line 400
    return-object v0
.end method
