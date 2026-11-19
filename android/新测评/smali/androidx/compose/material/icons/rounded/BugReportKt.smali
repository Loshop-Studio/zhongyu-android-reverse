.class public final Landroidx/compose/material/icons/rounded/BugReportKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_bugReport",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "BugReport",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getBugReport",
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
        "SMAP\nBugReport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BugReport.kt\nandroidx/compose/material/icons/rounded/BugReportKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,101:1\n212#2,12:102\n233#2,18:115\n253#2:152\n174#3:114\n705#4,2:133\n717#4,2:135\n719#4,11:141\n72#5,4:137\n*S KotlinDebug\n*F\n+ 1 BugReport.kt\nandroidx/compose/material/icons/rounded/BugReportKt\n*L\n29#1:102,12\n30#1:115,18\n30#1:152\n29#1:114\n30#1:133,2\n30#1:135,2\n30#1:141,11\n30#1:137,4\n*E\n"
    }
.end annotation


# static fields
.field private static _bugReport:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBugReport(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/BugReportKt;->_bugReport:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.BugReport"

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
    const/high16 v0, 0x41000000    # 8.0f

    .line 71
    .line 72
    const/high16 v2, 0x41980000    # 19.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v0, -0x401851ec    # -1.81f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v17, -0x40170a3d    # -1.82f

    .line 84
    .line 85
    .line 86
    const v18, -0x40051eb8    # -1.96f

    .line 87
    .line 88
    .line 89
    const v13, -0x4119999a    # -0.45f

    .line 90
    .line 91
    .line 92
    const v14, -0x40b851ec    # -0.78f

    .line 93
    .line 94
    .line 95
    const v15, -0x40770a3d    # -1.07f

    .line 96
    .line 97
    .line 98
    const v16, -0x40466666    # -1.45f

    .line 99
    .line 100
    .line 101
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v0, -0x4091eb85    # -0.93f

    .line 105
    .line 106
    .line 107
    const v2, 0x3f6e147b    # 0.93f

    .line 108
    .line 109
    .line 110
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const/16 v17, 0x0

    .line 114
    .line 115
    const v18, -0x404b851f    # -1.41f

    .line 116
    .line 117
    .line 118
    const v13, 0x3ec7ae14    # 0.39f

    .line 119
    .line 120
    .line 121
    const v14, -0x413851ec    # -0.39f

    .line 122
    .line 123
    .line 124
    const v15, 0x3ec7ae14    # 0.39f

    .line 125
    .line 126
    .line 127
    const v16, -0x407d70a4    # -1.02f

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v17, -0x404b851f    # -1.41f

    .line 134
    .line 135
    .line 136
    const/16 v18, 0x0

    .line 137
    .line 138
    const v13, -0x413851ec    # -0.39f

    .line 139
    .line 140
    .line 141
    const v15, -0x407d70a4    # -1.02f

    .line 142
    .line 143
    .line 144
    const v16, -0x413851ec    # -0.39f

    .line 145
    .line 146
    .line 147
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v0, -0x4043d70a    # -1.47f

    .line 151
    .line 152
    .line 153
    const v2, 0x3fbc28f6    # 1.47f

    .line 154
    .line 155
    .line 156
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v17, 0x41400000    # 12.0f

    .line 160
    .line 161
    const/high16 v18, 0x40a00000    # 5.0f

    .line 162
    .line 163
    const v13, 0x414f5c29    # 12.96f

    .line 164
    .line 165
    .line 166
    const v14, 0x40a1eb85    # 5.06f

    .line 167
    .line 168
    .line 169
    const v15, 0x4147d70a    # 12.49f

    .line 170
    .line 171
    .line 172
    const/high16 v16, 0x40a00000    # 5.0f

    .line 173
    .line 174
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v0, -0x404b851f    # -1.41f

    .line 178
    .line 179
    .line 180
    const v2, 0x3e2e147b    # 0.17f

    .line 181
    .line 182
    .line 183
    const v4, -0x408a3d71    # -0.96f

    .line 184
    .line 185
    .line 186
    const v6, 0x3d75c28f    # 0.06f

    .line 187
    .line 188
    .line 189
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v0, 0x4111c28f    # 9.11f

    .line 193
    .line 194
    .line 195
    const v2, 0x406ccccd    # 3.7f

    .line 196
    .line 197
    .line 198
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v17, -0x404b851f    # -1.41f

    .line 202
    .line 203
    .line 204
    const/16 v18, 0x0

    .line 205
    .line 206
    const v13, -0x413851ec    # -0.39f

    .line 207
    .line 208
    .line 209
    const v14, -0x413851ec    # -0.39f

    .line 210
    .line 211
    .line 212
    const v15, -0x407d70a4    # -1.02f

    .line 213
    .line 214
    .line 215
    const v16, -0x413851ec    # -0.39f

    .line 216
    .line 217
    .line 218
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/16 v17, 0x0

    .line 222
    .line 223
    const v18, 0x3fb47ae1    # 1.41f

    .line 224
    .line 225
    .line 226
    const v14, 0x3ec7ae14    # 0.39f

    .line 227
    .line 228
    .line 229
    const v15, -0x413851ec    # -0.39f

    .line 230
    .line 231
    .line 232
    const v16, 0x3f828f5c    # 1.02f

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v0, 0x3f6b851f    # 0.92f

    .line 239
    .line 240
    .line 241
    const v2, 0x3f6e147b    # 0.93f

    .line 242
    .line 243
    .line 244
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v17, 0x40d9eb85    # 6.81f

    .line 248
    .line 249
    .line 250
    const/high16 v18, 0x41000000    # 8.0f

    .line 251
    .line 252
    const v13, 0x40fc28f6    # 7.88f

    .line 253
    .line 254
    .line 255
    const v14, 0x40d1999a    # 6.55f

    .line 256
    .line 257
    .line 258
    const v15, 0x40e851ec    # 7.26f

    .line 259
    .line 260
    .line 261
    const v16, 0x40e70a3d    # 7.22f

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/high16 v0, 0x41000000    # 8.0f

    .line 268
    .line 269
    const/high16 v2, 0x40a00000    # 5.0f

    .line 270
    .line 271
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/high16 v17, -0x40800000    # -1.0f

    .line 275
    .line 276
    const/high16 v18, 0x3f800000    # 1.0f

    .line 277
    .line 278
    const v13, -0x40f33333    # -0.55f

    .line 279
    .line 280
    .line 281
    const/4 v14, 0x0

    .line 282
    const/high16 v15, -0x40800000    # -1.0f

    .line 283
    .line 284
    const v16, 0x3ee66666    # 0.45f

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v0, 0x3ee66666    # 0.45f

    .line 291
    .line 292
    .line 293
    const/high16 v2, 0x3f800000    # 1.0f

    .line 294
    .line 295
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v0, 0x3f8b851f    # 1.09f

    .line 299
    .line 300
    .line 301
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v17, -0x4247ae14    # -0.09f

    .line 305
    .line 306
    .line 307
    const v13, -0x42b33333    # -0.05f

    .line 308
    .line 309
    .line 310
    const v14, 0x3ea8f5c3    # 0.33f

    .line 311
    .line 312
    .line 313
    const v15, -0x4247ae14    # -0.09f

    .line 314
    .line 315
    .line 316
    const v16, 0x3f28f5c3    # 0.66f

    .line 317
    .line 318
    .line 319
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/high16 v0, 0x3f800000    # 1.0f

    .line 323
    .line 324
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v0, 0x41400000    # 12.0f

    .line 328
    .line 329
    const/high16 v2, 0x40a00000    # 5.0f

    .line 330
    .line 331
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const/high16 v17, -0x40800000    # -1.0f

    .line 335
    .line 336
    const v13, -0x40f33333    # -0.55f

    .line 337
    .line 338
    .line 339
    const/4 v14, 0x0

    .line 340
    const/high16 v15, -0x40800000    # -1.0f

    .line 341
    .line 342
    const v16, 0x3ee66666    # 0.45f

    .line 343
    .line 344
    .line 345
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v0, 0x3ee66666    # 0.45f

    .line 349
    .line 350
    .line 351
    const/high16 v2, 0x3f800000    # 1.0f

    .line 352
    .line 353
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/high16 v0, 0x3f800000    # 1.0f

    .line 357
    .line 358
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const v17, 0x3db851ec    # 0.09f

    .line 365
    .line 366
    .line 367
    const/4 v13, 0x0

    .line 368
    const v14, 0x3eae147b    # 0.34f

    .line 369
    .line 370
    .line 371
    const v15, 0x3d23d70a    # 0.04f

    .line 372
    .line 373
    .line 374
    const v16, 0x3f2b851f    # 0.67f

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v0, 0x41800000    # 16.0f

    .line 381
    .line 382
    const/high16 v2, 0x40a00000    # 5.0f

    .line 383
    .line 384
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const/high16 v17, -0x40800000    # -1.0f

    .line 388
    .line 389
    const v13, -0x40f33333    # -0.55f

    .line 390
    .line 391
    .line 392
    const/4 v14, 0x0

    .line 393
    const/high16 v15, -0x40800000    # -1.0f

    .line 394
    .line 395
    const v16, 0x3ee66666    # 0.45f

    .line 396
    .line 397
    .line 398
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v0, 0x3ee66666    # 0.45f

    .line 402
    .line 403
    .line 404
    const/high16 v2, 0x3f800000    # 1.0f

    .line 405
    .line 406
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v0, 0x3fe7ae14    # 1.81f

    .line 410
    .line 411
    .line 412
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v17, 0x40a6147b    # 5.19f

    .line 416
    .line 417
    .line 418
    const/high16 v18, 0x40400000    # 3.0f

    .line 419
    .line 420
    const v13, 0x3f851eb8    # 1.04f

    .line 421
    .line 422
    .line 423
    const v14, 0x3fe51eb8    # 1.79f

    .line 424
    .line 425
    .line 426
    const v15, 0x403e147b    # 2.97f

    .line 427
    .line 428
    .line 429
    const/high16 v16, 0x40400000    # 3.0f

    .line 430
    .line 431
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const v0, 0x40a6147b    # 5.19f

    .line 435
    .line 436
    .line 437
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 438
    .line 439
    const v4, 0x4084cccd    # 4.15f

    .line 440
    .line 441
    .line 442
    const v6, -0x40651eb8    # -1.21f

    .line 443
    .line 444
    .line 445
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/high16 v0, 0x41900000    # 18.0f

    .line 449
    .line 450
    const/high16 v2, 0x41980000    # 19.0f

    .line 451
    .line 452
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const/high16 v17, 0x3f800000    # 1.0f

    .line 456
    .line 457
    const/high16 v18, -0x40800000    # -1.0f

    .line 458
    .line 459
    const v13, 0x3f0ccccd    # 0.55f

    .line 460
    .line 461
    .line 462
    const/4 v14, 0x0

    .line 463
    const/high16 v15, 0x3f800000    # 1.0f

    .line 464
    .line 465
    const v16, -0x4119999a    # -0.45f

    .line 466
    .line 467
    .line 468
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v0, -0x4119999a    # -0.45f

    .line 472
    .line 473
    .line 474
    const/high16 v2, -0x40800000    # -1.0f

    .line 475
    .line 476
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const v0, -0x40747ae1    # -1.09f

    .line 480
    .line 481
    .line 482
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v17, 0x3db851ec    # 0.09f

    .line 486
    .line 487
    .line 488
    const v13, 0x3d4ccccd    # 0.05f

    .line 489
    .line 490
    .line 491
    const v14, -0x41570a3d    # -0.33f

    .line 492
    .line 493
    .line 494
    const v15, 0x3db851ec    # 0.09f

    .line 495
    .line 496
    .line 497
    const v16, -0x40d70a3d    # -0.66f

    .line 498
    .line 499
    .line 500
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const/high16 v0, -0x40800000    # -1.0f

    .line 504
    .line 505
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const/high16 v0, 0x3f800000    # 1.0f

    .line 509
    .line 510
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const/high16 v17, 0x3f800000    # 1.0f

    .line 514
    .line 515
    const v13, 0x3f0ccccd    # 0.55f

    .line 516
    .line 517
    .line 518
    const/4 v14, 0x0

    .line 519
    const/high16 v15, 0x3f800000    # 1.0f

    .line 520
    .line 521
    const v16, -0x4119999a    # -0.45f

    .line 522
    .line 523
    .line 524
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const v0, -0x4119999a    # -0.45f

    .line 528
    .line 529
    .line 530
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const/high16 v0, -0x40800000    # -1.0f

    .line 534
    .line 535
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const v17, -0x4247ae14    # -0.09f

    .line 542
    .line 543
    .line 544
    const/4 v13, 0x0

    .line 545
    const v14, -0x4151eb85    # -0.34f

    .line 546
    .line 547
    .line 548
    const v15, -0x42dc28f6    # -0.04f

    .line 549
    .line 550
    .line 551
    const v16, -0x40d47ae1    # -0.67f

    .line 552
    .line 553
    .line 554
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const/high16 v0, 0x41200000    # 10.0f

    .line 558
    .line 559
    const/high16 v2, 0x41980000    # 19.0f

    .line 560
    .line 561
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const/high16 v17, 0x3f800000    # 1.0f

    .line 565
    .line 566
    const v13, 0x3f0ccccd    # 0.55f

    .line 567
    .line 568
    .line 569
    const/4 v14, 0x0

    .line 570
    const/high16 v15, 0x3f800000    # 1.0f

    .line 571
    .line 572
    const v16, -0x4119999a    # -0.45f

    .line 573
    .line 574
    .line 575
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const v0, -0x4119999a    # -0.45f

    .line 579
    .line 580
    .line 581
    const/high16 v2, -0x40800000    # -1.0f

    .line 582
    .line 583
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const/high16 v0, 0x41500000    # 13.0f

    .line 590
    .line 591
    const/high16 v2, 0x41800000    # 16.0f

    .line 592
    .line 593
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const/high16 v0, -0x40000000    # -2.0f

    .line 597
    .line 598
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    const/high16 v17, -0x40800000    # -1.0f

    .line 602
    .line 603
    const v13, -0x40f33333    # -0.55f

    .line 604
    .line 605
    .line 606
    const/high16 v15, -0x40800000    # -1.0f

    .line 607
    .line 608
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const v0, 0x3ee66666    # 0.45f

    .line 612
    .line 613
    .line 614
    const/high16 v2, -0x40800000    # -1.0f

    .line 615
    .line 616
    const/high16 v4, 0x3f800000    # 1.0f

    .line 617
    .line 618
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    const/high16 v0, 0x40000000    # 2.0f

    .line 622
    .line 623
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const/high16 v17, 0x3f800000    # 1.0f

    .line 627
    .line 628
    const/high16 v18, 0x3f800000    # 1.0f

    .line 629
    .line 630
    const v13, 0x3f0ccccd    # 0.55f

    .line 631
    .line 632
    .line 633
    const/high16 v15, 0x3f800000    # 1.0f

    .line 634
    .line 635
    const v16, 0x3ee66666    # 0.45f

    .line 636
    .line 637
    .line 638
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const v0, -0x4119999a    # -0.45f

    .line 642
    .line 643
    .line 644
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const/high16 v0, 0x41500000    # 13.0f

    .line 651
    .line 652
    const/high16 v2, 0x41400000    # 12.0f

    .line 653
    .line 654
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const/high16 v0, -0x40000000    # -2.0f

    .line 658
    .line 659
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const/high16 v17, -0x40800000    # -1.0f

    .line 663
    .line 664
    const/high16 v18, -0x40800000    # -1.0f

    .line 665
    .line 666
    const v13, -0x40f33333    # -0.55f

    .line 667
    .line 668
    .line 669
    const/high16 v15, -0x40800000    # -1.0f

    .line 670
    .line 671
    const v16, -0x4119999a    # -0.45f

    .line 672
    .line 673
    .line 674
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    const v0, 0x3ee66666    # 0.45f

    .line 678
    .line 679
    .line 680
    const/high16 v2, -0x40800000    # -1.0f

    .line 681
    .line 682
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 683
    .line 684
    .line 685
    const/high16 v0, 0x40000000    # 2.0f

    .line 686
    .line 687
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    const/high16 v17, 0x3f800000    # 1.0f

    .line 691
    .line 692
    const/high16 v18, 0x3f800000    # 1.0f

    .line 693
    .line 694
    const v13, 0x3f0ccccd    # 0.55f

    .line 695
    .line 696
    .line 697
    const/high16 v15, 0x3f800000    # 1.0f

    .line 698
    .line 699
    const v16, 0x3ee66666    # 0.45f

    .line 700
    .line 701
    .line 702
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 703
    .line 704
    .line 705
    const v0, -0x4119999a    # -0.45f

    .line 706
    .line 707
    .line 708
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 715
    .line 716
    .line 717
    move-result-object v2

    .line 718
    const/16 v16, 0x3800

    .line 719
    .line 720
    const/16 v17, 0x0

    .line 721
    .line 722
    const/high16 v6, 0x3f800000    # 1.0f

    .line 723
    .line 724
    const/high16 v8, 0x3f800000    # 1.0f

    .line 725
    .line 726
    const/4 v7, 0x0

    .line 727
    const/high16 v9, 0x3f800000    # 1.0f

    .line 728
    .line 729
    const/high16 v12, 0x3f800000    # 1.0f

    .line 730
    .line 731
    const/4 v13, 0x0

    .line 732
    const/4 v15, 0x0

    .line 733
    const-string v4, ""

    .line 734
    .line 735
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 736
    .line 737
    .line 738
    move-result-object v0

    .line 739
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 740
    .line 741
    .line 742
    move-result-object v0

    .line 743
    sput-object v0, Landroidx/compose/material/icons/rounded/BugReportKt;->_bugReport:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 744
    .line 745
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 746
    .line 747
    .line 748
    return-object v0
.end method
