.class public final Landroidx/compose/material/icons/automirrored/outlined/ContactSupportKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _contactSupport:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getContactSupport(Landroidx/compose/material/icons/Icons$AutoMirrored$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/automirrored/outlined/ContactSupportKt;->_contactSupport:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const/4 v10, 0x1

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
    const-string v2, "AutoMirrored.Outlined.ContactSupport"

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
    const/high16 v0, 0x41300000    # 11.0f

    .line 71
    .line 72
    const v2, 0x41bcb852    # 23.59f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v0, -0x3f99999a    # -3.6f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const/high16 v17, -0x3ef00000    # -9.0f

    .line 85
    .line 86
    const v18, -0x3ee828f6    # -9.49f

    .line 87
    .line 88
    .line 89
    const v13, -0x3f5fae14    # -5.01f

    .line 90
    .line 91
    .line 92
    const v14, -0x417ae148    # -0.26f

    .line 93
    .line 94
    .line 95
    const/high16 v15, -0x3ef00000    # -9.0f

    .line 96
    .line 97
    const v16, -0x3f728f5c    # -4.42f

    .line 98
    .line 99
    .line 100
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v17, 0x41380000    # 11.5f

    .line 104
    .line 105
    const/high16 v18, 0x3f800000    # 1.0f

    .line 106
    .line 107
    const/high16 v13, 0x40000000    # 2.0f

    .line 108
    .line 109
    const v14, 0x40a851ec    # 5.26f

    .line 110
    .line 111
    .line 112
    const v15, 0x40c851ec    # 6.26f

    .line 113
    .line 114
    .line 115
    const/high16 v16, 0x3f800000    # 1.0f

    .line 116
    .line 117
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v0, 0x40a851ec    # 5.26f

    .line 121
    .line 122
    .line 123
    const/high16 v2, 0x41280000    # 10.5f

    .line 124
    .line 125
    const/high16 v4, 0x41a80000    # 21.0f

    .line 126
    .line 127
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v17, -0x3ef6e148    # -8.57f

    .line 131
    .line 132
    .line 133
    const v18, 0x41466666    # 12.4f

    .line 134
    .line 135
    .line 136
    const/4 v13, 0x0

    .line 137
    const v14, 0x409e6666    # 4.95f

    .line 138
    .line 139
    .line 140
    const v15, -0x3fa3d70a    # -3.44f

    .line 141
    .line 142
    .line 143
    const v16, 0x411ee148    # 9.93f

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v0, -0x4048f5c3    # -1.43f

    .line 150
    .line 151
    .line 152
    const v2, 0x3f30a3d7    # 0.69f

    .line 153
    .line 154
    .line 155
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/high16 v0, 0x40400000    # 3.0f

    .line 162
    .line 163
    const/high16 v2, 0x41380000    # 11.5f

    .line 164
    .line 165
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v17, 0x40800000    # 4.0f

    .line 169
    .line 170
    const/high16 v18, 0x41280000    # 10.5f

    .line 171
    .line 172
    const v13, 0x40eb851f    # 7.36f

    .line 173
    .line 174
    .line 175
    const/high16 v14, 0x40400000    # 3.0f

    .line 176
    .line 177
    const/high16 v15, 0x40800000    # 4.0f

    .line 178
    .line 179
    const v16, 0x40cb851f    # 6.36f

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const v0, 0x40eb851f    # 7.36f

    .line 186
    .line 187
    .line 188
    const/high16 v4, 0x41900000    # 18.0f

    .line 189
    .line 190
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v0, 0x41500000    # 13.0f

    .line 194
    .line 195
    const/high16 v2, 0x41900000    # 18.0f

    .line 196
    .line 197
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v0, 0x40133333    # 2.3f

    .line 201
    .line 202
    .line 203
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v17, 0x40c00000    # 6.0f

    .line 207
    .line 208
    const v18, -0x3ee33333    # -9.8f

    .line 209
    .line 210
    .line 211
    const v13, 0x4068f5c3    # 3.64f

    .line 212
    .line 213
    .line 214
    const v14, -0x3feccccd    # -2.3f

    .line 215
    .line 216
    .line 217
    const/high16 v15, 0x40c00000    # 6.0f

    .line 218
    .line 219
    const v16, -0x3f3d70a4    # -6.08f

    .line 220
    .line 221
    .line 222
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v17, 0x41380000    # 11.5f

    .line 226
    .line 227
    const/high16 v18, 0x40400000    # 3.0f

    .line 228
    .line 229
    const/high16 v13, 0x41980000    # 19.0f

    .line 230
    .line 231
    const v14, 0x40cb851f    # 6.36f

    .line 232
    .line 233
    .line 234
    const v15, 0x417a3d71    # 15.64f

    .line 235
    .line 236
    .line 237
    const/high16 v16, 0x40400000    # 3.0f

    .line 238
    .line 239
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const/high16 v0, 0x41680000    # 14.5f

    .line 246
    .line 247
    const/high16 v2, 0x41280000    # 10.5f

    .line 248
    .line 249
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v0, 0x40000000    # 2.0f

    .line 253
    .line 254
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v0, -0x40000000    # -2.0f

    .line 261
    .line 262
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v0, 0x41480000    # 12.5f

    .line 269
    .line 270
    const/high16 v2, 0x41500000    # 13.0f

    .line 271
    .line 272
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v0, -0x40000000    # -2.0f

    .line 276
    .line 277
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v17, 0x40400000    # 3.0f

    .line 281
    .line 282
    const/high16 v18, -0x3f600000    # -5.0f

    .line 283
    .line 284
    const/4 v13, 0x0

    .line 285
    const/high16 v14, -0x3fb00000    # -3.25f

    .line 286
    .line 287
    const/high16 v15, 0x40400000    # 3.0f

    .line 288
    .line 289
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 290
    .line 291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v17, -0x40000000    # -2.0f

    .line 295
    .line 296
    const/high16 v18, -0x40000000    # -2.0f

    .line 297
    .line 298
    const v14, -0x40733333    # -1.1f

    .line 299
    .line 300
    .line 301
    const v15, -0x4099999a    # -0.9f

    .line 302
    .line 303
    .line 304
    const/high16 v16, -0x40000000    # -2.0f

    .line 305
    .line 306
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v0, 0x3f666666    # 0.9f

    .line 310
    .line 311
    .line 312
    const/high16 v2, 0x40000000    # 2.0f

    .line 313
    .line 314
    const/high16 v4, -0x40000000    # -2.0f

    .line 315
    .line 316
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v0, -0x40000000    # -2.0f

    .line 320
    .line 321
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const/high16 v17, 0x40800000    # 4.0f

    .line 325
    .line 326
    const/high16 v18, -0x3f800000    # -4.0f

    .line 327
    .line 328
    const v14, -0x3ff28f5c    # -2.21f

    .line 329
    .line 330
    .line 331
    const v15, 0x3fe51eb8    # 1.79f

    .line 332
    .line 333
    .line 334
    const/high16 v16, -0x3f800000    # -4.0f

    .line 335
    .line 336
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v0, 0x3fe51eb8    # 1.79f

    .line 340
    .line 341
    .line 342
    const/high16 v2, 0x40800000    # 4.0f

    .line 343
    .line 344
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 348
    .line 349
    const/high16 v18, 0x40a00000    # 5.0f

    .line 350
    .line 351
    const/high16 v14, 0x40200000    # 2.5f

    .line 352
    .line 353
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 354
    .line 355
    const/high16 v16, 0x40300000    # 2.75f

    .line 356
    .line 357
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 364
    .line 365
    .line 366
    move-result-object v2

    .line 367
    const/16 v16, 0x3800

    .line 368
    .line 369
    const/16 v17, 0x0

    .line 370
    .line 371
    const/high16 v6, 0x3f800000    # 1.0f

    .line 372
    .line 373
    const/high16 v8, 0x3f800000    # 1.0f

    .line 374
    .line 375
    const/4 v7, 0x0

    .line 376
    const/high16 v9, 0x3f800000    # 1.0f

    .line 377
    .line 378
    const/high16 v12, 0x3f800000    # 1.0f

    .line 379
    .line 380
    const/4 v14, 0x0

    .line 381
    const/4 v15, 0x0

    .line 382
    const-string v4, ""

    .line 383
    .line 384
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    sput-object v0, Landroidx/compose/material/icons/automirrored/outlined/ContactSupportKt;->_contactSupport:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 393
    .line 394
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 395
    .line 396
    .line 397
    return-object v0
.end method
