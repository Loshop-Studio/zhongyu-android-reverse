.class public final Landroidx/compose/material/icons/rounded/SaveAsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_saveAs",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SaveAs",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getSaveAs",
        "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;",
        "material-icons-extended_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSaveAs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveAs.kt\nandroidx/compose/material/icons/rounded/SaveAsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,83:1\n212#2,12:84\n233#2,18:97\n253#2:134\n174#3:96\n705#4,2:115\n717#4,2:117\n719#4,11:123\n72#5,4:119\n*S KotlinDebug\n*F\n+ 1 SaveAs.kt\nandroidx/compose/material/icons/rounded/SaveAsKt\n*L\n29#1:84,12\n30#1:97,18\n30#1:134\n29#1:96\n30#1:115,2\n30#1:117,2\n30#1:123,11\n30#1:119,4\n*E\n"
    }
.end annotation


# static fields
.field private static _saveAs:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSaveAs(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SaveAsKt;->_saveAs:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

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
    const-string v2, "Rounded.SaveAs"

    .line 33
    .line 34
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    const v0, 0x41a347ae    # 20.41f

    .line 71
    .line 72
    .line 73
    const v2, 0x40cd1eb8    # 6.41f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, -0x3fcae148    # -2.83f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const v17, 0x41815c29    # 16.17f

    .line 86
    .line 87
    .line 88
    const/high16 v18, 0x40400000    # 3.0f

    .line 89
    .line 90
    const v13, 0x4189ae14    # 17.21f

    .line 91
    .line 92
    .line 93
    const v14, 0x404d70a4    # 3.21f

    .line 94
    .line 95
    .line 96
    const v15, 0x4185999a    # 16.7f

    .line 97
    .line 98
    .line 99
    const/high16 v16, 0x40400000    # 3.0f

    .line 100
    .line 101
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v0, 0x40a00000    # 5.0f

    .line 105
    .line 106
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const/high16 v17, 0x40400000    # 3.0f

    .line 110
    .line 111
    const/high16 v18, 0x40a00000    # 5.0f

    .line 112
    .line 113
    const v13, 0x4079999a    # 3.9f

    .line 114
    .line 115
    .line 116
    const/high16 v14, 0x40400000    # 3.0f

    .line 117
    .line 118
    const/high16 v15, 0x40400000    # 3.0f

    .line 119
    .line 120
    const v16, 0x4079999a    # 3.9f

    .line 121
    .line 122
    .line 123
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v0, 0x41600000    # 14.0f

    .line 127
    .line 128
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v17, 0x40000000    # 2.0f

    .line 132
    .line 133
    const/high16 v18, 0x40000000    # 2.0f

    .line 134
    .line 135
    const/4 v13, 0x0

    .line 136
    const v14, 0x3f8ccccd    # 1.1f

    .line 137
    .line 138
    .line 139
    const v15, 0x3f666666    # 0.9f

    .line 140
    .line 141
    .line 142
    const/high16 v16, 0x40000000    # 2.0f

    .line 143
    .line 144
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v0, 0x40eccccd    # 7.4f

    .line 148
    .line 149
    .line 150
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v0, 0x4109999a    # 8.6f

    .line 154
    .line 155
    .line 156
    const v2, -0x3ef66666    # -8.6f

    .line 157
    .line 158
    .line 159
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v0, 0x40fa8f5c    # 7.83f

    .line 163
    .line 164
    .line 165
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v17, 0x41a347ae    # 20.41f

    .line 169
    .line 170
    .line 171
    const v18, 0x40cd1eb8    # 6.41f

    .line 172
    .line 173
    .line 174
    const/high16 v13, 0x41a80000    # 21.0f

    .line 175
    .line 176
    const v14, 0x40e9999a    # 7.3f

    .line 177
    .line 178
    .line 179
    const v15, 0x41a651ec    # 20.79f

    .line 180
    .line 181
    .line 182
    const v16, 0x40d947ae    # 6.79f

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const/high16 v0, 0x41400000    # 12.0f

    .line 192
    .line 193
    const/high16 v2, 0x41900000    # 18.0f

    .line 194
    .line 195
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 199
    .line 200
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 201
    .line 202
    const v13, -0x402b851f    # -1.66f

    .line 203
    .line 204
    .line 205
    const/4 v14, 0x0

    .line 206
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 207
    .line 208
    const v16, -0x40547ae1    # -1.34f

    .line 209
    .line 210
    .line 211
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 215
    .line 216
    const v2, 0x3fab851f    # 1.34f

    .line 217
    .line 218
    .line 219
    const/high16 v4, 0x40400000    # 3.0f

    .line 220
    .line 221
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v0, 0x3fab851f    # 1.34f

    .line 225
    .line 226
    .line 227
    const/high16 v2, 0x40400000    # 3.0f

    .line 228
    .line 229
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v0, 0x415a8f5c    # 13.66f

    .line 233
    .line 234
    .line 235
    const/high16 v2, 0x41400000    # 12.0f

    .line 236
    .line 237
    const/high16 v4, 0x41900000    # 18.0f

    .line 238
    .line 239
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const/high16 v0, 0x41700000    # 15.0f

    .line 246
    .line 247
    const/high16 v2, 0x41100000    # 9.0f

    .line 248
    .line 249
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v17, -0x40800000    # -1.0f

    .line 253
    .line 254
    const/high16 v18, 0x3f800000    # 1.0f

    .line 255
    .line 256
    const/4 v13, 0x0

    .line 257
    const v14, 0x3f0ccccd    # 0.55f

    .line 258
    .line 259
    .line 260
    const v15, -0x4119999a    # -0.45f

    .line 261
    .line 262
    .line 263
    const/high16 v16, 0x3f800000    # 1.0f

    .line 264
    .line 265
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v0, 0x40e00000    # 7.0f

    .line 269
    .line 270
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v18, -0x40800000    # -1.0f

    .line 274
    .line 275
    const v13, -0x40f33333    # -0.55f

    .line 276
    .line 277
    .line 278
    const/4 v14, 0x0

    .line 279
    const/high16 v15, -0x40800000    # -1.0f

    .line 280
    .line 281
    const v16, -0x4119999a    # -0.45f

    .line 282
    .line 283
    .line 284
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v17, 0x3f800000    # 1.0f

    .line 291
    .line 292
    const/4 v13, 0x0

    .line 293
    const v14, -0x40f33333    # -0.55f

    .line 294
    .line 295
    .line 296
    const v15, 0x3ee66666    # 0.45f

    .line 297
    .line 298
    .line 299
    const/high16 v16, -0x40800000    # -1.0f

    .line 300
    .line 301
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/high16 v18, 0x3f800000    # 1.0f

    .line 308
    .line 309
    const v13, 0x3f0ccccd    # 0.55f

    .line 310
    .line 311
    .line 312
    const/4 v14, 0x0

    .line 313
    const/high16 v15, 0x3f800000    # 1.0f

    .line 314
    .line 315
    const v16, 0x3ee66666    # 0.45f

    .line 316
    .line 317
    .line 318
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v0, 0x41100000    # 9.0f

    .line 322
    .line 323
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const/high16 v0, 0x41820000    # 16.25f

    .line 330
    .line 331
    const v2, 0x419feb85    # 19.99f

    .line 332
    .line 333
    .line 334
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v0, 0x3fe28f5c    # 1.77f

    .line 338
    .line 339
    .line 340
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v0, -0x3f651eb8    # -4.84f

    .line 344
    .line 345
    .line 346
    const v2, 0x409ae148    # 4.84f

    .line 347
    .line 348
    .line 349
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const v17, 0x41847ae1    # 16.56f

    .line 353
    .line 354
    .line 355
    const/high16 v18, 0x41b80000    # 23.0f

    .line 356
    .line 357
    const v13, 0x41868f5c    # 16.82f

    .line 358
    .line 359
    .line 360
    const v14, 0x41b7999a    # 22.95f

    .line 361
    .line 362
    .line 363
    const v15, 0x4185851f    # 16.69f

    .line 364
    .line 365
    .line 366
    const/high16 v16, 0x41b80000    # 23.0f

    .line 367
    .line 368
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/high16 v0, 0x41780000    # 15.5f

    .line 372
    .line 373
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v17, -0x41000000    # -0.5f

    .line 377
    .line 378
    const/high16 v18, -0x41000000    # -0.5f

    .line 379
    .line 380
    const v13, -0x4170a3d7    # -0.28f

    .line 381
    .line 382
    .line 383
    const/4 v14, 0x0

    .line 384
    const/high16 v15, -0x41000000    # -0.5f

    .line 385
    .line 386
    const v16, -0x419eb852    # -0.22f

    .line 387
    .line 388
    .line 389
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v0, -0x407851ec    # -1.06f

    .line 393
    .line 394
    .line 395
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v17, 0x3e19999a    # 0.15f

    .line 399
    .line 400
    .line 401
    const v18, -0x414ccccd    # -0.35f

    .line 402
    .line 403
    .line 404
    const/4 v13, 0x0

    .line 405
    const v14, -0x41fae148    # -0.13f

    .line 406
    .line 407
    .line 408
    const v15, 0x3d4ccccd    # 0.05f

    .line 409
    .line 410
    .line 411
    const v16, -0x417ae148    # -0.26f

    .line 412
    .line 413
    .line 414
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const/high16 v0, 0x41820000    # 16.25f

    .line 418
    .line 419
    const v2, 0x419feb85    # 19.99f

    .line 420
    .line 421
    .line 422
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v0, 0x41ba0000    # 23.25f

    .line 429
    .line 430
    const v2, 0x4184147b    # 16.51f

    .line 431
    .line 432
    .line 433
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v0, 0x3f59999a    # 0.85f

    .line 437
    .line 438
    .line 439
    const v2, -0x40a66666    # -0.85f

    .line 440
    .line 441
    .line 442
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const v0, -0x401d70a4    # -1.77f

    .line 446
    .line 447
    .line 448
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v0, 0x3f59999a    # 0.85f

    .line 452
    .line 453
    .line 454
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const v17, 0x3f35c28f    # 0.71f

    .line 458
    .line 459
    .line 460
    const/16 v18, 0x0

    .line 461
    .line 462
    const v13, 0x3e4ccccd    # 0.2f

    .line 463
    .line 464
    .line 465
    const v14, -0x41b33333    # -0.2f

    .line 466
    .line 467
    .line 468
    const v15, 0x3f028f5c    # 0.51f

    .line 469
    .line 470
    .line 471
    const v16, -0x41b33333    # -0.2f

    .line 472
    .line 473
    .line 474
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const v0, 0x3f87ae14    # 1.06f

    .line 478
    .line 479
    .line 480
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v17, 0x41ba0000    # 23.25f

    .line 484
    .line 485
    const v18, 0x4184147b    # 16.51f

    .line 486
    .line 487
    .line 488
    const v13, 0x41bb999a    # 23.45f

    .line 489
    .line 490
    .line 491
    const/high16 v14, 0x41800000    # 16.0f

    .line 492
    .line 493
    const v15, 0x41bb999a    # 23.45f

    .line 494
    .line 495
    .line 496
    const v16, 0x41828f5c    # 16.32f

    .line 497
    .line 498
    .line 499
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 506
    .line 507
    .line 508
    move-result-object v2

    .line 509
    const/16 v16, 0x3800

    .line 510
    .line 511
    const/16 v17, 0x0

    .line 512
    .line 513
    const/high16 v6, 0x3f800000    # 1.0f

    .line 514
    .line 515
    const/high16 v8, 0x3f800000    # 1.0f

    .line 516
    .line 517
    const/4 v7, 0x0

    .line 518
    const/high16 v9, 0x3f800000    # 1.0f

    .line 519
    .line 520
    const/high16 v12, 0x3f800000    # 1.0f

    .line 521
    .line 522
    const/4 v13, 0x0

    .line 523
    const/4 v14, 0x0

    .line 524
    const/4 v15, 0x0

    .line 525
    const-string v4, ""

    .line 526
    .line 527
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    sput-object v0, Landroidx/compose/material/icons/rounded/SaveAsKt;->_saveAs:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 536
    .line 537
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 538
    .line 539
    .line 540
    return-object v0
.end method
