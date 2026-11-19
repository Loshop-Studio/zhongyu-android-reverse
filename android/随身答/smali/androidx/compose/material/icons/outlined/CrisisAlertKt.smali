.class public final Landroidx/compose/material/icons/outlined/CrisisAlertKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_crisisAlert",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "CrisisAlert",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getCrisisAlert",
        "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nCrisisAlert.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrisisAlert.kt\nandroidx/compose/material/icons/outlined/CrisisAlertKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,74:1\n212#2,12:75\n233#2,18:88\n253#2:125\n174#3:87\n705#4,2:106\n717#4,2:108\n719#4,11:114\n72#5,4:110\n*S KotlinDebug\n*F\n+ 1 CrisisAlert.kt\nandroidx/compose/material/icons/outlined/CrisisAlertKt\n*L\n29#1:75,12\n30#1:88,18\n30#1:125\n29#1:87\n30#1:106,2\n30#1:108,2\n30#1:114,11\n30#1:110,4\n*E\n"
    }
.end annotation


# static fields
.field private static _crisisAlert:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCrisisAlert(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/CrisisAlertKt;->_crisisAlert:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.CrisisAlert"

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
    const/high16 v0, 0x40200000    # 2.5f

    .line 71
    .line 72
    const/high16 v2, 0x41680000    # 14.5f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x40400000    # -1.5f

    .line 78
    .line 79
    const/high16 v18, 0x40c00000    # 6.0f

    .line 80
    .line 81
    const/4 v13, 0x0

    .line 82
    const/high16 v14, 0x3fc00000    # 1.5f

    .line 83
    .line 84
    const/high16 v15, -0x40400000    # -1.5f

    .line 85
    .line 86
    const/high16 v16, 0x40c00000    # 6.0f

    .line 87
    .line 88
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 89
    .line 90
    .line 91
    const/high16 v0, -0x40000000    # -2.0f

    .line 92
    .line 93
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v18, -0x3f400000    # -6.0f

    .line 97
    .line 98
    const/4 v14, 0x0

    .line 99
    const/high16 v16, -0x3f700000    # -4.5f

    .line 100
    .line 101
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v17, 0x41400000    # 12.0f

    .line 105
    .line 106
    const/16 v18, 0x0

    .line 107
    .line 108
    const/high16 v13, 0x41180000    # 9.5f

    .line 109
    .line 110
    const v14, 0x3f8f5c29    # 1.12f

    .line 111
    .line 112
    .line 113
    const v15, 0x4129eb85    # 10.62f

    .line 114
    .line 115
    .line 116
    const/16 v16, 0x0

    .line 117
    .line 118
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v0, 0x3f8f5c29    # 1.12f

    .line 122
    .line 123
    .line 124
    const/high16 v2, 0x40200000    # 2.5f

    .line 125
    .line 126
    const/high16 v4, 0x41680000    # 14.5f

    .line 127
    .line 128
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v0, 0x41200000    # 10.0f

    .line 135
    .line 136
    const/high16 v2, 0x41400000    # 12.0f

    .line 137
    .line 138
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v17, -0x40000000    # -2.0f

    .line 142
    .line 143
    const/high16 v18, 0x40000000    # 2.0f

    .line 144
    .line 145
    const v13, -0x40733333    # -1.1f

    .line 146
    .line 147
    .line 148
    const/4 v14, 0x0

    .line 149
    const/high16 v15, -0x40000000    # -2.0f

    .line 150
    .line 151
    const v16, 0x3f666666    # 0.9f

    .line 152
    .line 153
    .line 154
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v0, 0x3f666666    # 0.9f

    .line 158
    .line 159
    .line 160
    const/high16 v2, 0x40000000    # 2.0f

    .line 161
    .line 162
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v0, -0x4099999a    # -0.9f

    .line 166
    .line 167
    .line 168
    const/high16 v2, -0x40000000    # -2.0f

    .line 169
    .line 170
    const/high16 v4, 0x40000000    # 2.0f

    .line 171
    .line 172
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v0, 0x4151999a    # 13.1f

    .line 176
    .line 177
    .line 178
    const/high16 v2, 0x41200000    # 10.0f

    .line 179
    .line 180
    const/high16 v4, 0x41400000    # 12.0f

    .line 181
    .line 182
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v0, 0x4180a3d7    # 16.08f

    .line 189
    .line 190
    .line 191
    const v2, 0x40a3851f    # 5.11f

    .line 192
    .line 193
    .line 194
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v17, 0x3ec7ae14    # 0.39f

    .line 198
    .line 199
    .line 200
    const v18, -0x3ffc28f6    # -2.06f

    .line 201
    .line 202
    .line 203
    const v13, 0x3e3851ec    # 0.18f

    .line 204
    .line 205
    .line 206
    const/high16 v14, -0x40c00000    # -0.75f

    .line 207
    .line 208
    const v15, 0x3ea8f5c3    # 0.33f

    .line 209
    .line 210
    .line 211
    const v16, -0x4043d70a    # -1.47f

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v17, 0x41b00000    # 22.0f

    .line 218
    .line 219
    const/high16 v18, 0x41400000    # 12.0f

    .line 220
    .line 221
    const/high16 v13, 0x419e0000    # 19.75f

    .line 222
    .line 223
    const v14, 0x4096147b    # 4.69f

    .line 224
    .line 225
    .line 226
    const/high16 v15, 0x41b00000    # 22.0f

    .line 227
    .line 228
    const v16, 0x410147ae    # 8.08f

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v17, -0x3ee00000    # -10.0f

    .line 235
    .line 236
    const/high16 v18, 0x41200000    # 10.0f

    .line 237
    .line 238
    const/4 v13, 0x0

    .line 239
    const v14, 0x40b0a3d7    # 5.52f

    .line 240
    .line 241
    .line 242
    const v15, -0x3f70a3d7    # -4.48f

    .line 243
    .line 244
    .line 245
    const/high16 v16, 0x41200000    # 10.0f

    .line 246
    .line 247
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v0, 0x418c28f6    # 17.52f

    .line 251
    .line 252
    .line 253
    const/high16 v2, 0x41400000    # 12.0f

    .line 254
    .line 255
    const/high16 v4, 0x40000000    # 2.0f

    .line 256
    .line 257
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v17, 0x40b0f5c3    # 5.53f

    .line 261
    .line 262
    .line 263
    const v18, -0x3ef0cccd    # -8.95f

    .line 264
    .line 265
    .line 266
    const v14, -0x3f851eb8    # -3.92f

    .line 267
    .line 268
    .line 269
    const/high16 v15, 0x40100000    # 2.25f

    .line 270
    .line 271
    const v16, -0x3f16147b    # -7.31f

    .line 272
    .line 273
    .line 274
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v17, 0x40fd70a4    # 7.92f

    .line 278
    .line 279
    .line 280
    const v18, 0x40a3851f    # 5.11f

    .line 281
    .line 282
    .line 283
    const v13, 0x40f33333    # 7.6f

    .line 284
    .line 285
    .line 286
    const v14, 0x4068f5c3    # 3.64f

    .line 287
    .line 288
    .line 289
    const v15, 0x40f7ae14    # 7.74f

    .line 290
    .line 291
    .line 292
    const v16, 0x408bd70a    # 4.37f

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v17, 0x40800000    # 4.0f

    .line 299
    .line 300
    const/high16 v18, 0x41400000    # 12.0f

    .line 301
    .line 302
    const v13, 0x40b28f5c    # 5.58f

    .line 303
    .line 304
    .line 305
    const v14, 0x40d051ec    # 6.51f

    .line 306
    .line 307
    .line 308
    const/high16 v15, 0x40800000    # 4.0f

    .line 309
    .line 310
    const v16, 0x41111eb8    # 9.07f

    .line 311
    .line 312
    .line 313
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const/high16 v17, 0x41000000    # 8.0f

    .line 317
    .line 318
    const/high16 v18, 0x41000000    # 8.0f

    .line 319
    .line 320
    const/4 v13, 0x0

    .line 321
    const v14, 0x408d70a4    # 4.42f

    .line 322
    .line 323
    .line 324
    const v15, 0x40651eb8    # 3.58f

    .line 325
    .line 326
    .line 327
    const/high16 v16, 0x41000000    # 8.0f

    .line 328
    .line 329
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v0, -0x3f9ae148    # -3.58f

    .line 333
    .line 334
    .line 335
    const/high16 v2, -0x3f000000    # -8.0f

    .line 336
    .line 337
    const/high16 v4, 0x41000000    # 8.0f

    .line 338
    .line 339
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v17, 0x4180a3d7    # 16.08f

    .line 343
    .line 344
    .line 345
    const v18, 0x40a3851f    # 5.11f

    .line 346
    .line 347
    .line 348
    const/high16 v13, 0x41a00000    # 20.0f

    .line 349
    .line 350
    const v14, 0x41111eb8    # 9.07f

    .line 351
    .line 352
    .line 353
    const v15, 0x41935c29    # 18.42f

    .line 354
    .line 355
    .line 356
    const v16, 0x40d051ec    # 6.51f

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/high16 v0, 0x41900000    # 18.0f

    .line 366
    .line 367
    const/high16 v2, 0x41400000    # 12.0f

    .line 368
    .line 369
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const/high16 v17, -0x3f400000    # -6.0f

    .line 373
    .line 374
    const/high16 v18, 0x40c00000    # 6.0f

    .line 375
    .line 376
    const/4 v13, 0x0

    .line 377
    const v14, 0x4053d70a    # 3.31f

    .line 378
    .line 379
    .line 380
    const v15, -0x3fd3d70a    # -2.69f

    .line 381
    .line 382
    .line 383
    const/high16 v16, 0x40c00000    # 6.0f

    .line 384
    .line 385
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v0, -0x3fd3d70a    # -2.69f

    .line 389
    .line 390
    .line 391
    const/high16 v2, -0x3f400000    # -6.0f

    .line 392
    .line 393
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v17, 0x401eb852    # 2.48f

    .line 397
    .line 398
    .line 399
    const v18, -0x3f647ae1    # -4.86f

    .line 400
    .line 401
    .line 402
    const/high16 v14, -0x40000000    # -2.0f

    .line 403
    .line 404
    const v15, 0x3f7ae148    # 0.98f

    .line 405
    .line 406
    .line 407
    const v16, -0x3f8eb852    # -3.77f

    .line 408
    .line 409
    .line 410
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v17, 0x3f266666    # 0.65f

    .line 414
    .line 415
    .line 416
    const v18, 0x40047ae1    # 2.07f

    .line 417
    .line 418
    .line 419
    const v13, 0x3e6b851f    # 0.23f

    .line 420
    .line 421
    .line 422
    const v14, 0x3f4f5c29    # 0.81f

    .line 423
    .line 424
    .line 425
    const v15, 0x3f266666    # 0.65f

    .line 426
    .line 427
    .line 428
    const v16, 0x40047ae1    # 2.07f

    .line 429
    .line 430
    .line 431
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/high16 v17, 0x41000000    # 8.0f

    .line 435
    .line 436
    const/high16 v18, 0x41400000    # 12.0f

    .line 437
    .line 438
    const v13, 0x4106e148    # 8.43f

    .line 439
    .line 440
    .line 441
    const v14, 0x411ee148    # 9.93f

    .line 442
    .line 443
    .line 444
    const/high16 v15, 0x41000000    # 8.0f

    .line 445
    .line 446
    const v16, 0x412eb852    # 10.92f

    .line 447
    .line 448
    .line 449
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const/high16 v17, 0x40800000    # 4.0f

    .line 453
    .line 454
    const/high16 v18, 0x40800000    # 4.0f

    .line 455
    .line 456
    const/4 v13, 0x0

    .line 457
    const v14, 0x400d70a4    # 2.21f

    .line 458
    .line 459
    .line 460
    const v15, 0x3fe51eb8    # 1.79f

    .line 461
    .line 462
    .line 463
    const/high16 v16, 0x40800000    # 4.0f

    .line 464
    .line 465
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const v0, -0x401ae148    # -1.79f

    .line 469
    .line 470
    .line 471
    const/high16 v2, -0x3f800000    # -4.0f

    .line 472
    .line 473
    const/high16 v4, 0x40800000    # 4.0f

    .line 474
    .line 475
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const v17, -0x406f5c29    # -1.13f

    .line 479
    .line 480
    .line 481
    const v18, -0x3fcd70a4    # -2.79f

    .line 482
    .line 483
    .line 484
    const v14, -0x4075c28f    # -1.08f

    .line 485
    .line 486
    .line 487
    const v15, -0x4123d70a    # -0.43f

    .line 488
    .line 489
    .line 490
    const v16, -0x3ffb851f    # -2.07f

    .line 491
    .line 492
    .line 493
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const v17, 0x3f266666    # 0.65f

    .line 497
    .line 498
    .line 499
    const v18, -0x3ffb851f    # -2.07f

    .line 500
    .line 501
    .line 502
    const/4 v14, 0x0

    .line 503
    const v15, 0x3ed1eb85    # 0.41f

    .line 504
    .line 505
    .line 506
    const v16, -0x4063d70a    # -1.22f

    .line 507
    .line 508
    .line 509
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const/high16 v17, 0x41900000    # 18.0f

    .line 513
    .line 514
    const/high16 v18, 0x41400000    # 12.0f

    .line 515
    .line 516
    const v13, 0x418828f6    # 17.02f

    .line 517
    .line 518
    .line 519
    const v14, 0x4103ae14    # 8.23f

    .line 520
    .line 521
    .line 522
    const/high16 v15, 0x41900000    # 18.0f

    .line 523
    .line 524
    const/high16 v16, 0x41200000    # 10.0f

    .line 525
    .line 526
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 533
    .line 534
    .line 535
    move-result-object v2

    .line 536
    const/16 v16, 0x3800

    .line 537
    .line 538
    const/16 v17, 0x0

    .line 539
    .line 540
    const/high16 v6, 0x3f800000    # 1.0f

    .line 541
    .line 542
    const/high16 v8, 0x3f800000    # 1.0f

    .line 543
    .line 544
    const/4 v7, 0x0

    .line 545
    const/high16 v9, 0x3f800000    # 1.0f

    .line 546
    .line 547
    const/high16 v12, 0x3f800000    # 1.0f

    .line 548
    .line 549
    const/4 v13, 0x0

    .line 550
    const/4 v14, 0x0

    .line 551
    const/4 v15, 0x0

    .line 552
    const-string v4, ""

    .line 553
    .line 554
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 555
    .line 556
    .line 557
    move-result-object v0

    .line 558
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    sput-object v0, Landroidx/compose/material/icons/outlined/CrisisAlertKt;->_crisisAlert:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 563
    .line 564
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 565
    .line 566
    .line 567
    return-object v0
.end method
