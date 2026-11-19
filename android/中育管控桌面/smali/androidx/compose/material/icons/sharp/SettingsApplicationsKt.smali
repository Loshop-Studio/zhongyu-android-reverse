.class public final Landroidx/compose/material/icons/sharp/SettingsApplicationsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_settingsApplications",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SettingsApplications",
        "Landroidx/compose/material/icons/Icons$Sharp;",
        "getSettingsApplications",
        "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nSettingsApplications.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsApplications.kt\nandroidx/compose/material/icons/sharp/SettingsApplicationsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,96:1\n212#2,12:97\n233#2,18:110\n253#2:147\n233#2,18:148\n253#2:185\n174#3:109\n705#4,2:128\n717#4,2:130\n719#4,11:136\n705#4,2:166\n717#4,2:168\n719#4,11:174\n72#5,4:132\n72#5,4:170\n*S KotlinDebug\n*F\n+ 1 SettingsApplications.kt\nandroidx/compose/material/icons/sharp/SettingsApplicationsKt\n*L\n29#1:97,12\n30#1:110,18\n30#1:147\n85#1:148,18\n85#1:185\n29#1:109\n30#1:128,2\n30#1:130,2\n30#1:136,11\n85#1:166,2\n85#1:168,2\n85#1:174,11\n30#1:132,4\n85#1:170,4\n*E\n"
    }
.end annotation


# static fields
.field private static _settingsApplications:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSettingsApplications(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/SettingsApplicationsKt;->_settingsApplications:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.SettingsApplications"

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
    const/4 v2, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    const/high16 v4, 0x41980000    # 19.0f

    .line 71
    .line 72
    const/high16 v6, 0x40400000    # 3.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40400000    # 3.0f

    .line 78
    .line 79
    const/high16 v6, 0x40a00000    # 5.0f

    .line 80
    .line 81
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const/high16 v25, -0x40000000    # -2.0f

    .line 85
    .line 86
    const/high16 v26, 0x40000000    # 2.0f

    .line 87
    .line 88
    const v21, -0x4071eb85    # -1.11f

    .line 89
    .line 90
    .line 91
    const/16 v22, 0x0

    .line 92
    .line 93
    const/high16 v23, -0x40000000    # -2.0f

    .line 94
    .line 95
    const v24, 0x3f666666    # 0.9f

    .line 96
    .line 97
    .line 98
    move-object/from16 v20, v2

    .line 99
    .line 100
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v4, 0x41600000    # 14.0f

    .line 104
    .line 105
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const/high16 v25, 0x40000000    # 2.0f

    .line 109
    .line 110
    const/16 v21, 0x0

    .line 111
    .line 112
    const v22, 0x3f8ccccd    # 1.1f

    .line 113
    .line 114
    .line 115
    const v23, 0x3f63d70a    # 0.89f

    .line 116
    .line 117
    .line 118
    const/high16 v24, 0x40000000    # 2.0f

    .line 119
    .line 120
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v26, -0x40000000    # -2.0f

    .line 127
    .line 128
    const v21, 0x3f8e147b    # 1.11f

    .line 129
    .line 130
    .line 131
    const/16 v22, 0x0

    .line 132
    .line 133
    const/high16 v23, 0x40000000    # 2.0f

    .line 134
    .line 135
    const v24, -0x4099999a    # -0.9f

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v4, 0x41a80000    # 21.0f

    .line 142
    .line 143
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v25, -0x40000000    # -2.0f

    .line 147
    .line 148
    const/16 v21, 0x0

    .line 149
    .line 150
    const v22, -0x40733333    # -1.1f

    .line 151
    .line 152
    .line 153
    const v23, -0x409c28f6    # -0.89f

    .line 154
    .line 155
    .line 156
    const/high16 v24, -0x40000000    # -2.0f

    .line 157
    .line 158
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v4, 0x418a0000    # 17.25f

    .line 165
    .line 166
    const/high16 v6, 0x41400000    # 12.0f

    .line 167
    .line 168
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v25, -0x42b33333    # -0.05f

    .line 172
    .line 173
    .line 174
    const v26, 0x3f35c28f    # 0.71f

    .line 175
    .line 176
    .line 177
    const v22, 0x3e75c28f    # 0.24f

    .line 178
    .line 179
    .line 180
    const v23, -0x435c28f6    # -0.02f

    .line 181
    .line 182
    .line 183
    const v24, 0x3ef0a3d7    # 0.47f

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v4, -0x435c28f6    # -0.02f

    .line 190
    .line 191
    .line 192
    const v6, 0x3c23d70a    # 0.01f

    .line 193
    .line 194
    .line 195
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v4, 0x3f947ae1    # 1.16f

    .line 199
    .line 200
    .line 201
    const v6, 0x3fbc28f6    # 1.47f

    .line 202
    .line 203
    .line 204
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v25, 0x3e6b851f    # 0.23f

    .line 208
    .line 209
    .line 210
    const v26, 0x3e3851ec    # 0.18f

    .line 211
    .line 212
    .line 213
    const v21, 0x3e0f5c29    # 0.14f

    .line 214
    .line 215
    .line 216
    const v22, 0x3dcccccd    # 0.1f

    .line 217
    .line 218
    .line 219
    const v23, 0x3e6b851f    # 0.23f

    .line 220
    .line 221
    .line 222
    const v24, 0x3e3851ec    # 0.18f

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v4, 0x403c28f6    # 2.94f

    .line 229
    .line 230
    .line 231
    const v6, -0x40266666    # -1.7f

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v4, -0x40b33333    # -0.8f

    .line 238
    .line 239
    .line 240
    const v6, -0x3ffeb852    # -2.02f

    .line 241
    .line 242
    .line 243
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v4, -0x430a3d71    # -0.03f

    .line 247
    .line 248
    .line 249
    const v6, 0x3ca3d70a    # 0.02f

    .line 250
    .line 251
    .line 252
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v25, -0x40651eb8    # -1.21f

    .line 256
    .line 257
    .line 258
    const v26, 0x3f35c28f    # 0.71f

    .line 259
    .line 260
    .line 261
    const v21, -0x41428f5c    # -0.37f

    .line 262
    .line 263
    .line 264
    const v22, 0x3e947ae1    # 0.29f

    .line 265
    .line 266
    .line 267
    const v23, -0x40bae148    # -0.77f

    .line 268
    .line 269
    .line 270
    const v24, 0x3f07ae14    # 0.53f

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v4, 0x3c23d70a    # 0.01f

    .line 277
    .line 278
    .line 279
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v4, -0x4175c28f    # -0.27f

    .line 283
    .line 284
    .line 285
    const v6, 0x3feccccd    # 1.85f

    .line 286
    .line 287
    .line 288
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v25, -0x42dc28f6    # -0.04f

    .line 292
    .line 293
    .line 294
    const v26, 0x3e99999a    # 0.3f

    .line 295
    .line 296
    .line 297
    const v21, -0x435c28f6    # -0.02f

    .line 298
    .line 299
    .line 300
    const v22, 0x3e2e147b    # 0.17f

    .line 301
    .line 302
    .line 303
    const v23, -0x42dc28f6    # -0.04f

    .line 304
    .line 305
    .line 306
    const v24, 0x3e99999a    # 0.3f

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v4, -0x3fa66666    # -3.4f

    .line 313
    .line 314
    .line 315
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v4, -0x416147ae    # -0.31f

    .line 319
    .line 320
    .line 321
    const v6, -0x3ff66666    # -2.15f

    .line 322
    .line 323
    .line 324
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v4, 0x41200000    # 10.0f

    .line 328
    .line 329
    const v6, 0x4186cccd    # 16.85f

    .line 330
    .line 331
    .line 332
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v25, -0x40651eb8    # -1.21f

    .line 336
    .line 337
    .line 338
    const v26, -0x40ca3d71    # -0.71f

    .line 339
    .line 340
    .line 341
    const v21, -0x411eb852    # -0.44f

    .line 342
    .line 343
    .line 344
    const v22, -0x41c7ae14    # -0.18f

    .line 345
    .line 346
    .line 347
    const v23, -0x40a8f5c3    # -0.84f

    .line 348
    .line 349
    .line 350
    const v24, -0x4128f5c3    # -0.42f

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v4, 0x3cf5c28f    # 0.03f

    .line 357
    .line 358
    .line 359
    const v6, 0x3ca3d70a    # 0.02f

    .line 360
    .line 361
    .line 362
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v4, 0x3f4ccccd    # 0.8f

    .line 366
    .line 367
    .line 368
    const v6, -0x3ffeb852    # -2.02f

    .line 369
    .line 370
    .line 371
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v4, -0x3fc3d70a    # -2.94f

    .line 375
    .line 376
    .line 377
    const v6, -0x40266666    # -1.7f

    .line 378
    .line 379
    .line 380
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v4, 0x3e6b851f    # 0.23f

    .line 384
    .line 385
    .line 386
    const v6, -0x41c7ae14    # -0.18f

    .line 387
    .line 388
    .line 389
    const v7, 0x3dcccccd    # 0.1f

    .line 390
    .line 391
    .line 392
    const v8, -0x425c28f6    # -0.08f

    .line 393
    .line 394
    .line 395
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v4, -0x406b851f    # -1.16f

    .line 399
    .line 400
    .line 401
    const v6, 0x3fbc28f6    # 1.47f

    .line 402
    .line 403
    .line 404
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v4, 0x3ca3d70a    # 0.02f

    .line 408
    .line 409
    .line 410
    const v6, 0x3c23d70a    # 0.01f

    .line 411
    .line 412
    .line 413
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const v25, -0x42b33333    # -0.05f

    .line 417
    .line 418
    .line 419
    const v21, -0x430a3d71    # -0.03f

    .line 420
    .line 421
    .line 422
    const v22, -0x418a3d71    # -0.24f

    .line 423
    .line 424
    .line 425
    const v23, -0x42b33333    # -0.05f

    .line 426
    .line 427
    .line 428
    const v24, -0x410f5c29    # -0.47f

    .line 429
    .line 430
    .line 431
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const v4, 0x3d4ccccd    # 0.05f

    .line 435
    .line 436
    .line 437
    const v6, -0x40cf5c29    # -0.69f

    .line 438
    .line 439
    .line 440
    const v7, 0x3ca3d70a    # 0.02f

    .line 441
    .line 442
    .line 443
    const v8, -0x410f5c29    # -0.47f

    .line 444
    .line 445
    .line 446
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v4, -0x43dc28f6    # -0.01f

    .line 450
    .line 451
    .line 452
    const v6, 0x3c23d70a    # 0.01f

    .line 453
    .line 454
    .line 455
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const v4, -0x40547ae1    # -1.34f

    .line 459
    .line 460
    .line 461
    const v6, -0x40266666    # -1.7f

    .line 462
    .line 463
    .line 464
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const v4, -0x3fc33333    # -2.95f

    .line 468
    .line 469
    .line 470
    const v6, 0x3fd9999a    # 1.7f

    .line 471
    .line 472
    .line 473
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const v4, 0x3f4f5c29    # 0.81f

    .line 477
    .line 478
    .line 479
    const v6, 0x4000a3d7    # 2.01f

    .line 480
    .line 481
    .line 482
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v4, 0x3c23d70a    # 0.01f

    .line 486
    .line 487
    .line 488
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const v25, 0x3f99999a    # 1.2f

    .line 492
    .line 493
    .line 494
    const v26, -0x40cccccd    # -0.7f

    .line 495
    .line 496
    .line 497
    const v21, 0x3ebd70a4    # 0.37f

    .line 498
    .line 499
    .line 500
    const v22, -0x4170a3d7    # -0.28f

    .line 501
    .line 502
    .line 503
    const v23, 0x3f451eb8    # 0.77f

    .line 504
    .line 505
    .line 506
    const v24, -0x40fae148    # -0.52f

    .line 507
    .line 508
    .line 509
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const v4, -0x43dc28f6    # -0.01f

    .line 513
    .line 514
    .line 515
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const v4, 0x4124cccd    # 10.3f

    .line 519
    .line 520
    .line 521
    const/high16 v6, 0x40a00000    # 5.0f

    .line 522
    .line 523
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const v4, 0x405a3d71    # 3.41f

    .line 527
    .line 528
    .line 529
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const v4, 0x3e99999a    # 0.3f

    .line 533
    .line 534
    .line 535
    const v6, 0x4009999a    # 2.15f

    .line 536
    .line 537
    .line 538
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const v4, 0x40e4cccd    # 7.15f

    .line 542
    .line 543
    .line 544
    const/high16 v6, 0x41600000    # 14.0f

    .line 545
    .line 546
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const v26, 0x3f333333    # 0.7f

    .line 550
    .line 551
    .line 552
    const v21, 0x3edc28f6    # 0.43f

    .line 553
    .line 554
    .line 555
    const v22, 0x3e3851ec    # 0.18f

    .line 556
    .line 557
    .line 558
    const v23, 0x3f547ae1    # 0.83f

    .line 559
    .line 560
    .line 561
    const v24, 0x3ed70a3d    # 0.42f

    .line 562
    .line 563
    .line 564
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const v4, -0x43dc28f6    # -0.01f

    .line 568
    .line 569
    .line 570
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const v4, -0x40b0a3d7    # -0.81f

    .line 574
    .line 575
    .line 576
    const v6, 0x4000a3d7    # 2.01f

    .line 577
    .line 578
    .line 579
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const v4, 0x403ccccd    # 2.95f

    .line 583
    .line 584
    .line 585
    const v6, 0x3fd9999a    # 1.7f

    .line 586
    .line 587
    .line 588
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const v4, -0x40251eb8    # -1.71f

    .line 592
    .line 593
    .line 594
    const v6, 0x3fab851f    # 1.34f

    .line 595
    .line 596
    .line 597
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const v4, -0x43dc28f6    # -0.01f

    .line 601
    .line 602
    .line 603
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const v25, 0x3d75c28f    # 0.06f

    .line 607
    .line 608
    .line 609
    const v26, 0x3f30a3d7    # 0.69f

    .line 610
    .line 611
    .line 612
    const v21, 0x3d23d70a    # 0.04f

    .line 613
    .line 614
    .line 615
    const v22, 0x3e6147ae    # 0.22f

    .line 616
    .line 617
    .line 618
    const v23, 0x3d75c28f    # 0.06f

    .line 619
    .line 620
    .line 621
    const v24, 0x3ee66666    # 0.45f

    .line 622
    .line 623
    .line 624
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 631
    .line 632
    .line 633
    move-result-object v2

    .line 634
    const/16 v16, 0x3800

    .line 635
    .line 636
    const/16 v17, 0x0

    .line 637
    .line 638
    const/high16 v6, 0x3f800000    # 1.0f

    .line 639
    .line 640
    const/high16 v8, 0x3f800000    # 1.0f

    .line 641
    .line 642
    const/4 v7, 0x0

    .line 643
    const/high16 v9, 0x3f800000    # 1.0f

    .line 644
    .line 645
    const/high16 v12, 0x3f800000    # 1.0f

    .line 646
    .line 647
    const/4 v13, 0x0

    .line 648
    const/4 v14, 0x0

    .line 649
    const/4 v15, 0x0

    .line 650
    const-string v4, ""

    .line 651
    .line 652
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 653
    .line 654
    .line 655
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 656
    .line 657
    .line 658
    move-result v3

    .line 659
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 660
    .line 661
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 662
    .line 663
    .line 664
    move-result-wide v6

    .line 665
    const/4 v0, 0x0

    .line 666
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 667
    .line 668
    .line 669
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 670
    .line 671
    .line 672
    move-result v10

    .line 673
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 674
    .line 675
    .line 676
    move-result v11

    .line 677
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 680
    .line 681
    .line 682
    const/high16 v0, 0x41400000    # 12.0f

    .line 683
    .line 684
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    const v0, -0x3fe33333    # -2.45f

    .line 688
    .line 689
    .line 690
    const/4 v2, 0x0

    .line 691
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 692
    .line 693
    .line 694
    const v18, 0x409ccccd    # 4.9f

    .line 695
    .line 696
    .line 697
    const/16 v19, 0x0

    .line 698
    .line 699
    const v13, 0x401ccccd    # 2.45f

    .line 700
    .line 701
    .line 702
    const v14, 0x401ccccd    # 2.45f

    .line 703
    .line 704
    .line 705
    const/16 v16, 0x1

    .line 706
    .line 707
    const/16 v17, 0x1

    .line 708
    .line 709
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    const v18, -0x3f633333    # -4.9f

    .line 713
    .line 714
    .line 715
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 716
    .line 717
    .line 718
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 719
    .line 720
    .line 721
    move-result-object v2

    .line 722
    const/16 v16, 0x3800

    .line 723
    .line 724
    const/16 v17, 0x0

    .line 725
    .line 726
    const/high16 v6, 0x3f800000    # 1.0f

    .line 727
    .line 728
    const/4 v7, 0x0

    .line 729
    const/high16 v12, 0x3f800000    # 1.0f

    .line 730
    .line 731
    const/4 v13, 0x0

    .line 732
    const/4 v14, 0x0

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
    sput-object v0, Landroidx/compose/material/icons/sharp/SettingsApplicationsKt;->_settingsApplications:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 744
    .line 745
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 746
    .line 747
    .line 748
    return-object v0
.end method
