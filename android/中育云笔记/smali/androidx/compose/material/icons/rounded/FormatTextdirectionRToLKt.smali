.class public final Landroidx/compose/material/icons/rounded/FormatTextdirectionRToLKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _formatTextdirectionRToL:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFormatTextdirectionRToL(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/FormatTextdirectionRToLKt;->_formatTextdirectionRToL:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.FormatTextdirectionRToL"

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
    const/high16 v0, 0x41200000    # 10.0f

    .line 71
    .line 72
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 73
    .line 74
    .line 75
    const/high16 v0, 0x40800000    # 4.0f

    .line 76
    .line 77
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 78
    .line 79
    .line 80
    const/high16 v17, 0x3f800000    # 1.0f

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
    const v15, 0x3ee66666    # 0.45f

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
    const v0, -0x4119999a    # -0.45f

    .line 97
    .line 98
    .line 99
    const/high16 v2, 0x3f800000    # 1.0f

    .line 100
    .line 101
    const/high16 v4, -0x40800000    # -1.0f

    .line 102
    .line 103
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v0, 0x41400000    # 12.0f

    .line 107
    .line 108
    const/high16 v2, 0x40800000    # 4.0f

    .line 109
    .line 110
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const/high16 v0, 0x40000000    # 2.0f

    .line 114
    .line 115
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const/high16 v0, 0x41200000    # 10.0f

    .line 119
    .line 120
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v0, -0x4119999a    # -0.45f

    .line 127
    .line 128
    .line 129
    const/high16 v2, 0x3f800000    # 1.0f

    .line 130
    .line 131
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v0, 0x41800000    # 16.0f

    .line 135
    .line 136
    const/high16 v2, 0x40800000    # 4.0f

    .line 137
    .line 138
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v0, 0x3f800000    # 1.0f

    .line 142
    .line 143
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v18, -0x40800000    # -1.0f

    .line 147
    .line 148
    const v13, 0x3f0ccccd    # 0.55f

    .line 149
    .line 150
    .line 151
    const/4 v14, 0x0

    .line 152
    const/high16 v15, 0x3f800000    # 1.0f

    .line 153
    .line 154
    const v16, -0x4119999a    # -0.45f

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v0, -0x4119999a    # -0.45f

    .line 161
    .line 162
    .line 163
    const/high16 v2, -0x40800000    # -1.0f

    .line 164
    .line 165
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v0, -0x3f2570a4    # -6.83f

    .line 169
    .line 170
    .line 171
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v17, 0x40c0a3d7    # 6.02f

    .line 175
    .line 176
    .line 177
    const v18, 0x40b3851f    # 5.61f

    .line 178
    .line 179
    .line 180
    const v13, 0x410147ae    # 8.08f

    .line 181
    .line 182
    .line 183
    const/high16 v14, 0x40000000    # 2.0f

    .line 184
    .line 185
    const v15, 0x40c70a3d    # 6.22f

    .line 186
    .line 187
    .line 188
    const v16, 0x4061eb85    # 3.53f

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v17, 0x41200000    # 10.0f

    .line 195
    .line 196
    const/high16 v18, 0x41200000    # 10.0f

    .line 197
    .line 198
    const v13, 0x40b947ae    # 5.79f

    .line 199
    .line 200
    .line 201
    const v14, 0x40ffae14    # 7.99f

    .line 202
    .line 203
    .line 204
    const v15, 0x40f51eb8    # 7.66f

    .line 205
    .line 206
    .line 207
    const/high16 v16, 0x41200000    # 10.0f

    .line 208
    .line 209
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v0, 0x41880000    # 17.0f

    .line 216
    .line 217
    const/high16 v2, 0x41000000    # 8.0f

    .line 218
    .line 219
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v0, -0x401ae148    # -1.79f

    .line 223
    .line 224
    .line 225
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v17, -0x40a66666    # -0.85f

    .line 229
    .line 230
    .line 231
    const v18, -0x414ccccd    # -0.35f

    .line 232
    .line 233
    .line 234
    const/4 v13, 0x0

    .line 235
    const v14, -0x4119999a    # -0.45f

    .line 236
    .line 237
    .line 238
    const v15, -0x40f5c28f    # -0.54f

    .line 239
    .line 240
    .line 241
    const v16, -0x40d47ae1    # -0.67f

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v0, -0x3fcd70a4    # -2.79f

    .line 248
    .line 249
    .line 250
    const v2, 0x40328f5c    # 2.79f

    .line 251
    .line 252
    .line 253
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const/16 v17, 0x0

    .line 257
    .line 258
    const v18, 0x3f35c28f    # 0.71f

    .line 259
    .line 260
    .line 261
    const v13, -0x41b33333    # -0.2f

    .line 262
    .line 263
    .line 264
    const v14, 0x3e4ccccd    # 0.2f

    .line 265
    .line 266
    .line 267
    const v15, -0x41b33333    # -0.2f

    .line 268
    .line 269
    .line 270
    const v16, 0x3f028f5c    # 0.51f

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v0, 0x40328f5c    # 2.79f

    .line 277
    .line 278
    .line 279
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v17, 0x3f59999a    # 0.85f

    .line 283
    .line 284
    .line 285
    const v18, -0x4147ae14    # -0.36f

    .line 286
    .line 287
    .line 288
    const v13, 0x3e9eb852    # 0.31f

    .line 289
    .line 290
    .line 291
    const v14, 0x3e9eb852    # 0.31f

    .line 292
    .line 293
    .line 294
    const v15, 0x3f59999a    # 0.85f

    .line 295
    .line 296
    .line 297
    const v16, 0x3db851ec    # 0.09f

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v0, 0x41980000    # 19.0f

    .line 304
    .line 305
    const/high16 v2, 0x41000000    # 8.0f

    .line 306
    .line 307
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v0, 0x41300000    # 11.0f

    .line 311
    .line 312
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v17, 0x3f800000    # 1.0f

    .line 316
    .line 317
    const/high16 v18, -0x40800000    # -1.0f

    .line 318
    .line 319
    const v13, 0x3f0ccccd    # 0.55f

    .line 320
    .line 321
    .line 322
    const/4 v14, 0x0

    .line 323
    const/high16 v15, 0x3f800000    # 1.0f

    .line 324
    .line 325
    const v16, -0x4119999a    # -0.45f

    .line 326
    .line 327
    .line 328
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v0, -0x4119999a    # -0.45f

    .line 332
    .line 333
    .line 334
    const/high16 v2, -0x40800000    # -1.0f

    .line 335
    .line 336
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const/high16 v0, 0x41880000    # 17.0f

    .line 340
    .line 341
    const/high16 v2, 0x41000000    # 8.0f

    .line 342
    .line 343
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    const/16 v16, 0x3800

    .line 354
    .line 355
    const/16 v17, 0x0

    .line 356
    .line 357
    const/high16 v6, 0x3f800000    # 1.0f

    .line 358
    .line 359
    const/high16 v8, 0x3f800000    # 1.0f

    .line 360
    .line 361
    const/4 v7, 0x0

    .line 362
    const/high16 v9, 0x3f800000    # 1.0f

    .line 363
    .line 364
    const/high16 v12, 0x3f800000    # 1.0f

    .line 365
    .line 366
    const/4 v13, 0x0

    .line 367
    const/4 v15, 0x0

    .line 368
    const-string v4, ""

    .line 369
    .line 370
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    sput-object v0, Landroidx/compose/material/icons/rounded/FormatTextdirectionRToLKt;->_formatTextdirectionRToL:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 379
    .line 380
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 381
    .line 382
    .line 383
    return-object v0
.end method

.method public static synthetic getFormatTextdirectionRToL$annotations(Landroidx/compose/material/icons/Icons$Rounded;)V
    .locals 0
    .annotation runtime Lqc/a;
    .end annotation

    return-void
.end method
