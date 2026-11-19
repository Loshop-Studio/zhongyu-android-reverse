.class public final Landroidx/compose/material/icons/outlined/ScheduleSendKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _scheduleSend:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getScheduleSend(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/ScheduleSendKt;->_scheduleSend:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.ScheduleSend"

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
    const/4 v2, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 51
    .line 52
    .line 53
    sget-object v18, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v19, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const/high16 v4, 0x41880000    # 17.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3f600000    # -5.0f

    .line 78
    .line 79
    const/high16 v26, 0x40a00000    # 5.0f

    .line 80
    .line 81
    const v21, -0x3fcf5c29    # -2.76f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, -0x3f600000    # -5.0f

    .line 87
    .line 88
    const v24, 0x400f5c29    # 2.24f

    .line 89
    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v4, 0x400f5c29    # 2.24f

    .line 97
    .line 98
    .line 99
    const/high16 v6, 0x40a00000    # 5.0f

    .line 100
    .line 101
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v25, 0x40a00000    # 5.0f

    .line 105
    .line 106
    const/high16 v26, -0x3f600000    # -5.0f

    .line 107
    .line 108
    const v21, 0x4030a3d7    # 2.76f

    .line 109
    .line 110
    .line 111
    const/high16 v23, 0x40a00000    # 5.0f

    .line 112
    .line 113
    const v24, -0x3ff0a3d7    # -2.24f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v4, 0x419e147b    # 19.76f

    .line 120
    .line 121
    .line 122
    const/high16 v6, 0x41880000    # 17.0f

    .line 123
    .line 124
    const/high16 v7, 0x41400000    # 12.0f

    .line 125
    .line 126
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v4, 0x419acccd    # 19.35f

    .line 133
    .line 134
    .line 135
    const v6, 0x41953333    # 18.65f

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v4, -0x3ff66666    # -2.15f

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v4, 0x41600000    # 14.0f

    .line 148
    .line 149
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v4, 0x3f800000    # 1.0f

    .line 153
    .line 154
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v4, 0x40328f5c    # 2.79f

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v4, 0x3feccccd    # 1.85f

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v4, 0x419acccd    # 19.35f

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    const/16 v16, 0x3800

    .line 183
    .line 184
    const/16 v17, 0x0

    .line 185
    .line 186
    const/high16 v6, 0x3f800000    # 1.0f

    .line 187
    .line 188
    const/high16 v8, 0x3f800000    # 1.0f

    .line 189
    .line 190
    const/4 v7, 0x0

    .line 191
    const/high16 v9, 0x3f800000    # 1.0f

    .line 192
    .line 193
    const/high16 v12, 0x3f800000    # 1.0f

    .line 194
    .line 195
    const/4 v13, 0x0

    .line 196
    const/4 v14, 0x0

    .line 197
    const/4 v15, 0x0

    .line 198
    const-string v4, ""

    .line 199
    .line 200
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 201
    .line 202
    .line 203
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 208
    .line 209
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 210
    .line 211
    .line 212
    move-result-wide v6

    .line 213
    const/4 v0, 0x0

    .line 214
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 218
    .line 219
    .line 220
    move-result v10

    .line 221
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 222
    .line 223
    .line 224
    move-result v11

    .line 225
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 228
    .line 229
    .line 230
    const/high16 v0, 0x41300000    # 11.0f

    .line 231
    .line 232
    const/high16 v2, 0x41400000    # 12.0f

    .line 233
    .line 234
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/high16 v0, -0x3f400000    # -6.0f

    .line 238
    .line 239
    const/high16 v2, -0x40400000    # -1.5f

    .line 240
    .line 241
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v0, 0x40e051ec    # 7.01f

    .line 245
    .line 246
    .line 247
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v0, 0x410deb85    # 8.87f

    .line 251
    .line 252
    .line 253
    const v2, 0x406f5c29    # 3.74f

    .line 254
    .line 255
    .line 256
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v17, 0x404851ec    # 3.13f

    .line 260
    .line 261
    .line 262
    const/high16 v18, -0x40c00000    # -0.75f

    .line 263
    .line 264
    const v13, 0x3f70a3d7    # 0.94f

    .line 265
    .line 266
    .line 267
    const v14, -0x410f5c29    # -0.47f

    .line 268
    .line 269
    .line 270
    const/high16 v15, 0x40000000    # 2.0f

    .line 271
    .line 272
    const/high16 v16, -0x40c00000    # -0.75f

    .line 273
    .line 274
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v17, 0x3e8f5c29    # 0.28f

    .line 278
    .line 279
    .line 280
    const v18, 0x3c23d70a    # 0.01f

    .line 281
    .line 282
    .line 283
    const v13, 0x3dcccccd    # 0.1f

    .line 284
    .line 285
    .line 286
    const/4 v14, 0x0

    .line 287
    const v15, 0x3e428f5c    # 0.19f

    .line 288
    .line 289
    .line 290
    const v16, 0x3c23d70a    # 0.01f

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const/high16 v0, 0x40400000    # 3.0f

    .line 297
    .line 298
    const/high16 v2, 0x40800000    # 4.0f

    .line 299
    .line 300
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v0, 0x41800000    # 16.0f

    .line 304
    .line 305
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v0, 0x40e00000    # 7.0f

    .line 309
    .line 310
    const v2, -0x3fc33333    # -2.95f

    .line 311
    .line 312
    .line 313
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const/16 v17, 0x0

    .line 317
    .line 318
    const v18, -0x42b33333    # -0.05f

    .line 319
    .line 320
    .line 321
    const/4 v13, 0x0

    .line 322
    const v14, -0x435c28f6    # -0.02f

    .line 323
    .line 324
    .line 325
    const/4 v15, 0x0

    .line 326
    const v16, -0x430a3d71    # -0.03f

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v17, 0x3ec7ae14    # 0.39f

    .line 333
    .line 334
    .line 335
    const v18, -0x3fee147b    # -2.28f

    .line 336
    .line 337
    .line 338
    const v14, -0x40b33333    # -0.8f

    .line 339
    .line 340
    .line 341
    const v15, 0x3e0f5c29    # 0.14f

    .line 342
    .line 343
    .line 344
    const v16, -0x403851ec    # -1.56f

    .line 345
    .line 346
    .line 347
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v0, 0x4187eb85    # 16.99f

    .line 351
    .line 352
    .line 353
    const/high16 v2, 0x40a00000    # 5.0f

    .line 354
    .line 355
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v0, 0x41580000    # 13.5f

    .line 359
    .line 360
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const/high16 v0, 0x41300000    # 11.0f

    .line 364
    .line 365
    const/high16 v2, 0x41400000    # 12.0f

    .line 366
    .line 367
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    const/16 v16, 0x3800

    .line 378
    .line 379
    const/16 v17, 0x0

    .line 380
    .line 381
    const/high16 v6, 0x3f800000    # 1.0f

    .line 382
    .line 383
    const/4 v7, 0x0

    .line 384
    const/high16 v12, 0x3f800000    # 1.0f

    .line 385
    .line 386
    const/4 v14, 0x0

    .line 387
    const/4 v15, 0x0

    .line 388
    const-string v4, ""

    .line 389
    .line 390
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    sput-object v0, Landroidx/compose/material/icons/outlined/ScheduleSendKt;->_scheduleSend:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 399
    .line 400
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    return-object v0
.end method

.method public static synthetic getScheduleSend$annotations(Landroidx/compose/material/icons/Icons$Outlined;)V
    .locals 0
    .annotation runtime Lqc/a;
    .end annotation

    return-void
.end method
