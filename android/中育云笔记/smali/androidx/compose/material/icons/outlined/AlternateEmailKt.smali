.class public final Landroidx/compose/material/icons/outlined/AlternateEmailKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _alternateEmail:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAlternateEmail(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/AlternateEmailKt;->_alternateEmail:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.AlternateEmail"

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
    const v0, 0x3ff9999a    # 1.95f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41400000    # 12.0f

    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v17, -0x3ee00000    # -10.0f

    .line 79
    .line 80
    const/high16 v18, 0x41200000    # 10.0f

    .line 81
    .line 82
    const v13, -0x3f4f5c29    # -5.52f

    .line 83
    .line 84
    .line 85
    const/4 v14, 0x0

    .line 86
    const/high16 v15, -0x3ee00000    # -10.0f

    .line 87
    .line 88
    const v16, 0x408f5c29    # 4.48f

    .line 89
    .line 90
    .line 91
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v0, 0x408f5c29    # 4.48f

    .line 95
    .line 96
    .line 97
    const/high16 v2, 0x41200000    # 10.0f

    .line 98
    .line 99
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v0, 0x40a00000    # 5.0f

    .line 103
    .line 104
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v0, -0x40000000    # -2.0f

    .line 108
    .line 109
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const/high16 v0, -0x3f600000    # -5.0f

    .line 113
    .line 114
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v17, -0x3f000000    # -8.0f

    .line 118
    .line 119
    const/high16 v18, -0x3f000000    # -8.0f

    .line 120
    .line 121
    const v13, -0x3f751eb8    # -4.34f

    .line 122
    .line 123
    .line 124
    const/high16 v15, -0x3f000000    # -8.0f

    .line 125
    .line 126
    const v16, -0x3f95c28f    # -3.66f

    .line 127
    .line 128
    .line 129
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/high16 v0, -0x3f000000    # -8.0f

    .line 133
    .line 134
    const v2, 0x406a3d71    # 3.66f

    .line 135
    .line 136
    .line 137
    const/high16 v4, 0x41000000    # 8.0f

    .line 138
    .line 139
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v0, 0x406a3d71    # 3.66f

    .line 143
    .line 144
    .line 145
    const/high16 v2, 0x41000000    # 8.0f

    .line 146
    .line 147
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v0, 0x3fb70a3d    # 1.43f

    .line 151
    .line 152
    .line 153
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const/high16 v17, -0x40400000    # -1.5f

    .line 157
    .line 158
    const v18, 0x3fc8f5c3    # 1.57f

    .line 159
    .line 160
    .line 161
    const/4 v13, 0x0

    .line 162
    const v14, 0x3f4a3d71    # 0.79f

    .line 163
    .line 164
    .line 165
    const v15, -0x40ca3d71    # -0.71f

    .line 166
    .line 167
    .line 168
    const v16, 0x3fc8f5c3    # 1.57f

    .line 169
    .line 170
    .line 171
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v0, -0x40b851ec    # -0.78f

    .line 175
    .line 176
    .line 177
    const v2, -0x40370a3d    # -1.57f

    .line 178
    .line 179
    .line 180
    const/high16 v4, -0x40400000    # -1.5f

    .line 181
    .line 182
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const v0, -0x4048f5c3    # -1.43f

    .line 186
    .line 187
    .line 188
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const/high16 v17, -0x3f600000    # -5.0f

    .line 192
    .line 193
    const/high16 v18, -0x3f600000    # -5.0f

    .line 194
    .line 195
    const v14, -0x3fcf5c29    # -2.76f

    .line 196
    .line 197
    .line 198
    const v15, -0x3ff0a3d7    # -2.24f

    .line 199
    .line 200
    .line 201
    const/high16 v16, -0x3f600000    # -5.0f

    .line 202
    .line 203
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const v0, 0x400f5c29    # 2.24f

    .line 207
    .line 208
    .line 209
    const/high16 v2, -0x3f600000    # -5.0f

    .line 210
    .line 211
    const/high16 v4, 0x40a00000    # 5.0f

    .line 212
    .line 213
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v2, 0x40a00000    # 5.0f

    .line 217
    .line 218
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v17, 0x40628f5c    # 3.54f

    .line 222
    .line 223
    .line 224
    const v18, -0x4043d70a    # -1.47f

    .line 225
    .line 226
    .line 227
    const v13, 0x3fb0a3d7    # 1.38f

    .line 228
    .line 229
    .line 230
    const/4 v14, 0x0

    .line 231
    const v15, 0x4028f5c3    # 2.64f

    .line 232
    .line 233
    .line 234
    const v16, -0x40f0a3d7    # -0.56f

    .line 235
    .line 236
    .line 237
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v17, 0x403d70a4    # 2.96f

    .line 241
    .line 242
    .line 243
    const v18, 0x3fbc28f6    # 1.47f

    .line 244
    .line 245
    .line 246
    const v13, 0x3f266666    # 0.65f

    .line 247
    .line 248
    .line 249
    const v14, 0x3f63d70a    # 0.89f

    .line 250
    .line 251
    .line 252
    const v15, 0x3fe28f5c    # 1.77f

    .line 253
    .line 254
    .line 255
    const v16, 0x3fbc28f6    # 1.47f

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v17, 0x40600000    # 3.5f

    .line 262
    .line 263
    const v18, -0x3f9b851f    # -3.57f

    .line 264
    .line 265
    .line 266
    const v13, 0x3ffc28f6    # 1.97f

    .line 267
    .line 268
    .line 269
    const/4 v14, 0x0

    .line 270
    const/high16 v15, 0x40600000    # 3.5f

    .line 271
    .line 272
    const v16, -0x40333333    # -1.6f

    .line 273
    .line 274
    .line 275
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v0, -0x4048f5c3    # -1.43f

    .line 279
    .line 280
    .line 281
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v17, -0x3ee00000    # -10.0f

    .line 285
    .line 286
    const/high16 v18, -0x3ee00000    # -10.0f

    .line 287
    .line 288
    const/4 v13, 0x0

    .line 289
    const v14, -0x3f4f5c29    # -5.52f

    .line 290
    .line 291
    .line 292
    const v15, -0x3f70a3d7    # -4.48f

    .line 293
    .line 294
    .line 295
    const/high16 v16, -0x3ee00000    # -10.0f

    .line 296
    .line 297
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const v0, 0x416f3333    # 14.95f

    .line 304
    .line 305
    .line 306
    const/high16 v2, 0x41400000    # 12.0f

    .line 307
    .line 308
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 312
    .line 313
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 314
    .line 315
    const v13, -0x402b851f    # -1.66f

    .line 316
    .line 317
    .line 318
    const/4 v14, 0x0

    .line 319
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 320
    .line 321
    const v16, -0x40547ae1    # -1.34f

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v0, 0x3fab851f    # 1.34f

    .line 328
    .line 329
    .line 330
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 331
    .line 332
    const/high16 v4, 0x40400000    # 3.0f

    .line 333
    .line 334
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/high16 v2, 0x40400000    # 3.0f

    .line 338
    .line 339
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v0, -0x40547ae1    # -1.34f

    .line 343
    .line 344
    .line 345
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 346
    .line 347
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/4 v13, 0x0

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
    sput-object v0, Landroidx/compose/material/icons/outlined/AlternateEmailKt;->_alternateEmail:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 383
    .line 384
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 385
    .line 386
    .line 387
    return-object v0
.end method
