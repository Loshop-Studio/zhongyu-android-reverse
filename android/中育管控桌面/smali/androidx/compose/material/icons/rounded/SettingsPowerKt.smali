.class public final Landroidx/compose/material/icons/rounded/SettingsPowerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_settingsPower",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SettingsPower",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getSettingsPower",
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
        "SMAP\nSettingsPower.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsPower.kt\nandroidx/compose/material/icons/rounded/SettingsPowerKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,91:1\n212#2,12:92\n233#2,18:105\n253#2:142\n174#3:104\n705#4,2:123\n717#4,2:125\n719#4,11:131\n72#5,4:127\n*S KotlinDebug\n*F\n+ 1 SettingsPower.kt\nandroidx/compose/material/icons/rounded/SettingsPowerKt\n*L\n29#1:92,12\n30#1:105,18\n30#1:142\n29#1:104\n30#1:123,2\n30#1:125,2\n30#1:131,11\n30#1:127,4\n*E\n"
    }
.end annotation


# static fields
.field private static _settingsPower:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSettingsPower(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SettingsPowerKt;->_settingsPower:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SettingsPower"

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
    const/high16 v2, 0x41c00000    # 24.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 78
    .line 79
    .line 80
    const/high16 v17, 0x3f800000    # 1.0f

    .line 81
    .line 82
    const/high16 v18, -0x40800000    # -1.0f

    .line 83
    .line 84
    const v13, 0x3f0ccccd    # 0.55f

    .line 85
    .line 86
    .line 87
    const/4 v14, 0x0

    .line 88
    const/high16 v15, 0x3f800000    # 1.0f

    .line 89
    .line 90
    const v16, -0x4119999a    # -0.45f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/4 v0, 0x0

    .line 97
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v17, -0x40800000    # -1.0f

    .line 101
    .line 102
    const/4 v13, 0x0

    .line 103
    const v14, -0x40f33333    # -0.55f

    .line 104
    .line 105
    .line 106
    const v15, -0x4119999a    # -0.45f

    .line 107
    .line 108
    .line 109
    const/high16 v16, -0x40800000    # -1.0f

    .line 110
    .line 111
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v18, 0x3f800000    # 1.0f

    .line 118
    .line 119
    const v13, -0x40f33333    # -0.55f

    .line 120
    .line 121
    .line 122
    const/4 v14, 0x0

    .line 123
    const/high16 v15, -0x40800000    # -1.0f

    .line 124
    .line 125
    const v16, 0x3ee66666    # 0.45f

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v17, 0x41000000    # 8.0f

    .line 135
    .line 136
    const/high16 v18, 0x41c00000    # 24.0f

    .line 137
    .line 138
    const/high16 v13, 0x40e00000    # 7.0f

    .line 139
    .line 140
    const v14, 0x41bc6666    # 23.55f

    .line 141
    .line 142
    .line 143
    const v15, 0x40ee6666    # 7.45f

    .line 144
    .line 145
    .line 146
    const/high16 v16, 0x41c00000    # 24.0f

    .line 147
    .line 148
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v0, 0x41400000    # 12.0f

    .line 155
    .line 156
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v17, 0x3f800000    # 1.0f

    .line 163
    .line 164
    const/high16 v18, -0x40800000    # -1.0f

    .line 165
    .line 166
    const v13, 0x3f0ccccd    # 0.55f

    .line 167
    .line 168
    .line 169
    const/4 v14, 0x0

    .line 170
    const/high16 v15, 0x3f800000    # 1.0f

    .line 171
    .line 172
    const v16, -0x4119999a    # -0.45f

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const/4 v0, 0x0

    .line 179
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/high16 v17, -0x40800000    # -1.0f

    .line 183
    .line 184
    const/4 v13, 0x0

    .line 185
    const v14, -0x40f33333    # -0.55f

    .line 186
    .line 187
    .line 188
    const v15, -0x4119999a    # -0.45f

    .line 189
    .line 190
    .line 191
    const/high16 v16, -0x40800000    # -1.0f

    .line 192
    .line 193
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/high16 v18, 0x3f800000    # 1.0f

    .line 200
    .line 201
    const v13, -0x40f33333    # -0.55f

    .line 202
    .line 203
    .line 204
    const/4 v14, 0x0

    .line 205
    const/high16 v15, -0x40800000    # -1.0f

    .line 206
    .line 207
    const v16, 0x3ee66666    # 0.45f

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v17, 0x41400000    # 12.0f

    .line 217
    .line 218
    const/high16 v18, 0x41c00000    # 24.0f

    .line 219
    .line 220
    const/high16 v13, 0x41300000    # 11.0f

    .line 221
    .line 222
    const v14, 0x41bc6666    # 23.55f

    .line 223
    .line 224
    .line 225
    const v15, 0x41373333    # 11.45f

    .line 226
    .line 227
    .line 228
    const/high16 v16, 0x41c00000    # 24.0f

    .line 229
    .line 230
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v0, 0x40000000    # 2.0f

    .line 237
    .line 238
    const/high16 v2, 0x41400000    # 12.0f

    .line 239
    .line 240
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v17, -0x40800000    # -1.0f

    .line 244
    .line 245
    const/high16 v18, 0x3f800000    # 1.0f

    .line 246
    .line 247
    const v13, -0x40f33333    # -0.55f

    .line 248
    .line 249
    .line 250
    const/4 v14, 0x0

    .line 251
    const/high16 v15, -0x40800000    # -1.0f

    .line 252
    .line 253
    const v16, 0x3ee66666    # 0.45f

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v0, 0x41000000    # 8.0f

    .line 260
    .line 261
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v17, 0x3f800000    # 1.0f

    .line 265
    .line 266
    const/4 v13, 0x0

    .line 267
    const v14, 0x3f0ccccd    # 0.55f

    .line 268
    .line 269
    .line 270
    const v15, 0x3ee66666    # 0.45f

    .line 271
    .line 272
    .line 273
    const/high16 v16, 0x3f800000    # 1.0f

    .line 274
    .line 275
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v0, -0x4119999a    # -0.45f

    .line 279
    .line 280
    .line 281
    const/high16 v2, -0x40800000    # -1.0f

    .line 282
    .line 283
    const/high16 v4, 0x3f800000    # 1.0f

    .line 284
    .line 285
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/high16 v0, 0x40400000    # 3.0f

    .line 289
    .line 290
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v17, 0x41400000    # 12.0f

    .line 294
    .line 295
    const/high16 v18, 0x40000000    # 2.0f

    .line 296
    .line 297
    const/high16 v13, 0x41500000    # 13.0f

    .line 298
    .line 299
    const v14, 0x401ccccd    # 2.45f

    .line 300
    .line 301
    .line 302
    const v15, 0x4148cccd    # 12.55f

    .line 303
    .line 304
    .line 305
    const/high16 v16, 0x40000000    # 2.0f

    .line 306
    .line 307
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v0, 0x417f0a3d    # 15.94f

    .line 314
    .line 315
    .line 316
    const v2, 0x40a1eb85    # 5.06f

    .line 317
    .line 318
    .line 319
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v0, -0x435c28f6    # -0.02f

    .line 323
    .line 324
    .line 325
    const v2, 0x3ca3d70a    # 0.02f

    .line 326
    .line 327
    .line 328
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v17, 0x41800000    # 16.0f

    .line 332
    .line 333
    const v18, 0x40d147ae    # 6.54f

    .line 334
    .line 335
    .line 336
    const v13, 0x417828f6    # 15.51f

    .line 337
    .line 338
    .line 339
    const v14, 0x40afae14    # 5.49f

    .line 340
    .line 341
    .line 342
    const v15, 0x4178f5c3    # 15.56f

    .line 343
    .line 344
    .line 345
    const v16, 0x40c51eb8    # 6.16f

    .line 346
    .line 347
    .line 348
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v17, 0x3ff0a3d7    # 1.88f

    .line 352
    .line 353
    .line 354
    const v18, 0x40b66666    # 5.7f

    .line 355
    .line 356
    .line 357
    const v13, 0x3fc147ae    # 1.51f

    .line 358
    .line 359
    .line 360
    const v14, 0x3fab851f    # 1.34f

    .line 361
    .line 362
    .line 363
    const v15, 0x40151eb8    # 2.33f

    .line 364
    .line 365
    .line 366
    const v16, 0x405b851f    # 3.43f

    .line 367
    .line 368
    .line 369
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v17, -0x3f6e147b    # -4.56f

    .line 373
    .line 374
    .line 375
    const v18, 0x4093d70a    # 4.62f

    .line 376
    .line 377
    .line 378
    const v13, -0x41147ae1    # -0.46f

    .line 379
    .line 380
    .line 381
    const v14, 0x4011eb85    # 2.28f

    .line 382
    .line 383
    .line 384
    const v15, -0x3fed70a4    # -2.29f

    .line 385
    .line 386
    .line 387
    const v16, 0x40847ae1    # 4.14f

    .line 388
    .line 389
    .line 390
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const/high16 v17, 0x40c00000    # 6.0f

    .line 394
    .line 395
    const/high16 v18, 0x41300000    # 11.0f

    .line 396
    .line 397
    const v13, 0x4116e148    # 9.43f

    .line 398
    .line 399
    .line 400
    const v14, 0x418d851f    # 17.69f

    .line 401
    .line 402
    .line 403
    const/high16 v15, 0x40c00000    # 6.0f

    .line 404
    .line 405
    const v16, 0x416bd70a    # 14.74f

    .line 406
    .line 407
    .line 408
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v17, 0x4000a3d7    # 2.01f

    .line 412
    .line 413
    .line 414
    const v18, -0x3f70f5c3    # -4.47f

    .line 415
    .line 416
    .line 417
    const/4 v13, 0x0

    .line 418
    const v14, -0x401c28f6    # -1.78f

    .line 419
    .line 420
    .line 421
    const v15, 0x3f47ae14    # 0.78f

    .line 422
    .line 423
    .line 424
    const v16, -0x3fa851ec    # -3.37f

    .line 425
    .line 426
    .line 427
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v17, 0x3d8f5c29    # 0.07f

    .line 431
    .line 432
    .line 433
    const v18, -0x40466666    # -1.45f

    .line 434
    .line 435
    .line 436
    const v13, 0x3edc28f6    # 0.43f

    .line 437
    .line 438
    .line 439
    const v14, -0x413851ec    # -0.39f

    .line 440
    .line 441
    .line 442
    const v15, 0x3ef0a3d7    # 0.47f

    .line 443
    .line 444
    .line 445
    const v16, -0x407ae148    # -1.04f

    .line 446
    .line 447
    .line 448
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v0, 0x4100f5c3    # 8.06f

    .line 452
    .line 453
    .line 454
    const v2, 0x40a1eb85    # 5.06f

    .line 455
    .line 456
    .line 457
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v17, 0x40d66666    # 6.7f

    .line 461
    .line 462
    .line 463
    const v18, 0x40a0a3d7    # 5.02f

    .line 464
    .line 465
    .line 466
    const v13, 0x40f6147b    # 7.69f

    .line 467
    .line 468
    .line 469
    const v14, 0x4096147b    # 4.69f

    .line 470
    .line 471
    .line 472
    const v15, 0x40e33333    # 7.1f

    .line 473
    .line 474
    .line 475
    const v16, 0x409570a4    # 4.67f

    .line 476
    .line 477
    .line 478
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const v17, -0x3fdc28f6    # -2.56f

    .line 482
    .line 483
    .line 484
    const v18, 0x40f0a3d7    # 7.52f

    .line 485
    .line 486
    .line 487
    const v13, -0x3fff5c29    # -2.01f

    .line 488
    .line 489
    .line 490
    const v14, 0x3fe28f5c    # 1.77f

    .line 491
    .line 492
    .line 493
    const v15, -0x3fb851ec    # -3.12f

    .line 494
    .line 495
    .line 496
    const v16, 0x4090f5c3    # 4.53f

    .line 497
    .line 498
    .line 499
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const v17, 0x40c851ec    # 6.26f

    .line 503
    .line 504
    .line 505
    const v18, 0x40c9eb85    # 6.31f

    .line 506
    .line 507
    .line 508
    const v13, 0x3f170a3d    # 0.59f

    .line 509
    .line 510
    .line 511
    const v14, 0x4049999a    # 3.15f

    .line 512
    .line 513
    .line 514
    const v15, 0x40470a3d    # 3.11f

    .line 515
    .line 516
    .line 517
    const v16, 0x40b66666    # 5.7f

    .line 518
    .line 519
    .line 520
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const v17, 0x4119999a    # 9.6f

    .line 524
    .line 525
    .line 526
    const v18, -0x3f04cccd    # -7.85f

    .line 527
    .line 528
    .line 529
    const v13, 0x40a3d70a    # 5.12f

    .line 530
    .line 531
    .line 532
    const v14, 0x3f7d70a4    # 0.99f

    .line 533
    .line 534
    .line 535
    const v15, 0x4119999a    # 9.6f

    .line 536
    .line 537
    .line 538
    const v16, -0x3fc66666    # -2.9f

    .line 539
    .line 540
    .line 541
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const v17, -0x3fd28f5c    # -2.71f

    .line 545
    .line 546
    .line 547
    const v18, -0x3f4051ec    # -5.99f

    .line 548
    .line 549
    .line 550
    const/4 v13, 0x0

    .line 551
    const v14, -0x3fe7ae14    # -2.38f

    .line 552
    .line 553
    .line 554
    const v15, -0x4079999a    # -1.05f

    .line 555
    .line 556
    .line 557
    const v16, -0x3f6f5c29    # -4.52f

    .line 558
    .line 559
    .line 560
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const v17, 0x417f0a3d    # 15.94f

    .line 564
    .line 565
    .line 566
    const v18, 0x40a1eb85    # 5.06f

    .line 567
    .line 568
    .line 569
    const v13, 0x41873333    # 16.9f

    .line 570
    .line 571
    .line 572
    const v14, 0x409570a4    # 4.67f

    .line 573
    .line 574
    .line 575
    const v15, 0x41827ae1    # 16.31f

    .line 576
    .line 577
    .line 578
    const v16, 0x4096147b    # 4.69f

    .line 579
    .line 580
    .line 581
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const/high16 v0, 0x41800000    # 16.0f

    .line 588
    .line 589
    const/high16 v2, 0x41c00000    # 24.0f

    .line 590
    .line 591
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const/high16 v17, 0x3f800000    # 1.0f

    .line 598
    .line 599
    const/high16 v18, -0x40800000    # -1.0f

    .line 600
    .line 601
    const v13, 0x3f0ccccd    # 0.55f

    .line 602
    .line 603
    .line 604
    const/4 v14, 0x0

    .line 605
    const/high16 v15, 0x3f800000    # 1.0f

    .line 606
    .line 607
    const v16, -0x4119999a    # -0.45f

    .line 608
    .line 609
    .line 610
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const/4 v0, 0x0

    .line 614
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const/high16 v17, -0x40800000    # -1.0f

    .line 618
    .line 619
    const/4 v13, 0x0

    .line 620
    const v14, -0x40f33333    # -0.55f

    .line 621
    .line 622
    .line 623
    const v15, -0x4119999a    # -0.45f

    .line 624
    .line 625
    .line 626
    const/high16 v16, -0x40800000    # -1.0f

    .line 627
    .line 628
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const/high16 v18, 0x3f800000    # 1.0f

    .line 635
    .line 636
    const v13, -0x40f33333    # -0.55f

    .line 637
    .line 638
    .line 639
    const/4 v14, 0x0

    .line 640
    const/high16 v15, -0x40800000    # -1.0f

    .line 641
    .line 642
    const v16, 0x3ee66666    # 0.45f

    .line 643
    .line 644
    .line 645
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    const/high16 v17, 0x41800000    # 16.0f

    .line 652
    .line 653
    const/high16 v18, 0x41c00000    # 24.0f

    .line 654
    .line 655
    const/high16 v13, 0x41700000    # 15.0f

    .line 656
    .line 657
    const v14, 0x41bc6666    # 23.55f

    .line 658
    .line 659
    .line 660
    const v15, 0x41773333    # 15.45f

    .line 661
    .line 662
    .line 663
    const/high16 v16, 0x41c00000    # 24.0f

    .line 664
    .line 665
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 672
    .line 673
    .line 674
    move-result-object v2

    .line 675
    const/16 v16, 0x3800

    .line 676
    .line 677
    const/16 v17, 0x0

    .line 678
    .line 679
    const/high16 v6, 0x3f800000    # 1.0f

    .line 680
    .line 681
    const/high16 v8, 0x3f800000    # 1.0f

    .line 682
    .line 683
    const/4 v7, 0x0

    .line 684
    const/high16 v9, 0x3f800000    # 1.0f

    .line 685
    .line 686
    const/high16 v12, 0x3f800000    # 1.0f

    .line 687
    .line 688
    const/4 v13, 0x0

    .line 689
    const/4 v14, 0x0

    .line 690
    const/4 v15, 0x0

    .line 691
    const-string v4, ""

    .line 692
    .line 693
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 694
    .line 695
    .line 696
    move-result-object v0

    .line 697
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 698
    .line 699
    .line 700
    move-result-object v0

    .line 701
    sput-object v0, Landroidx/compose/material/icons/rounded/SettingsPowerKt;->_settingsPower:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 702
    .line 703
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 704
    .line 705
    .line 706
    return-object v0
.end method
