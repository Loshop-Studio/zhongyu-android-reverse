.class public final Landroidx/compose/material/icons/rounded/CameraIndoorKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_cameraIndoor",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "CameraIndoor",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getCameraIndoor",
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
        "SMAP\nCameraIndoor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraIndoor.kt\nandroidx/compose/material/icons/rounded/CameraIndoorKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,65:1\n212#2,12:66\n233#2,18:79\n253#2:116\n174#3:78\n705#4,2:97\n717#4,2:99\n719#4,11:105\n72#5,4:101\n*S KotlinDebug\n*F\n+ 1 CameraIndoor.kt\nandroidx/compose/material/icons/rounded/CameraIndoorKt\n*L\n29#1:66,12\n30#1:79,18\n30#1:116\n29#1:78\n30#1:97,2\n30#1:99,2\n30#1:105,11\n30#1:101,4\n*E\n"
    }
.end annotation


# static fields
.field private static _cameraIndoor:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCameraIndoor(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/CameraIndoorKt;->_cameraIndoor:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.CameraIndoor"

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
    const v0, 0x412ccccd    # 10.8f

    .line 71
    .line 72
    .line 73
    const v2, 0x4069999a    # 3.65f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v0, 0x40900000    # 4.5f

    .line 80
    .line 81
    const/high16 v2, -0x3f400000    # -6.0f

    .line 82
    .line 83
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const/high16 v17, 0x40800000    # 4.0f

    .line 87
    .line 88
    const/high16 v18, 0x411c0000    # 9.75f

    .line 89
    .line 90
    const v13, 0x4089999a    # 4.3f

    .line 91
    .line 92
    .line 93
    const v14, 0x41087ae1    # 8.53f

    .line 94
    .line 95
    .line 96
    const/high16 v15, 0x40800000    # 4.0f

    .line 97
    .line 98
    const v16, 0x4111eb85    # 9.12f

    .line 99
    .line 100
    .line 101
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v0, 0x41100000    # 9.0f

    .line 105
    .line 106
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const/high16 v17, 0x40000000    # 2.0f

    .line 110
    .line 111
    const/high16 v18, 0x40000000    # 2.0f

    .line 112
    .line 113
    const/4 v13, 0x0

    .line 114
    const v14, 0x3f8ccccd    # 1.1f

    .line 115
    .line 116
    .line 117
    const v15, 0x3f666666    # 0.9f

    .line 118
    .line 119
    .line 120
    const/high16 v16, 0x40000000    # 2.0f

    .line 121
    .line 122
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v0, 0x41400000    # 12.0f

    .line 126
    .line 127
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const/high16 v18, -0x40000000    # -2.0f

    .line 131
    .line 132
    const v13, 0x3f8ccccd    # 1.1f

    .line 133
    .line 134
    .line 135
    const/4 v14, 0x0

    .line 136
    const/high16 v15, 0x40000000    # 2.0f

    .line 137
    .line 138
    const v16, -0x4099999a    # -0.9f

    .line 139
    .line 140
    .line 141
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v0, -0x3ef00000    # -9.0f

    .line 145
    .line 146
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v17, -0x40b33333    # -0.8f

    .line 150
    .line 151
    .line 152
    const v18, -0x40333333    # -1.6f

    .line 153
    .line 154
    .line 155
    const/4 v13, 0x0

    .line 156
    const v14, -0x40deb852    # -0.63f

    .line 157
    .line 158
    .line 159
    const v15, -0x41666666    # -0.3f

    .line 160
    .line 161
    .line 162
    const v16, -0x4063d70a    # -1.22f

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v0, -0x3f700000    # -4.5f

    .line 169
    .line 170
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v17, 0x412ccccd    # 10.8f

    .line 174
    .line 175
    .line 176
    const v18, 0x4069999a    # 3.65f

    .line 177
    .line 178
    .line 179
    const v13, 0x4147d70a    # 12.49f

    .line 180
    .line 181
    .line 182
    const v14, 0x4047ae14    # 3.12f

    .line 183
    .line 184
    .line 185
    const v15, 0x413828f6    # 11.51f

    .line 186
    .line 187
    .line 188
    const v16, 0x4047ae14    # 3.12f

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v0, 0x417451ec    # 15.27f

    .line 198
    .line 199
    .line 200
    const v2, 0x417ab852    # 15.67f

    .line 201
    .line 202
    .line 203
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v0, 0x41600000    # 14.0f

    .line 207
    .line 208
    const/high16 v2, 0x41700000    # 15.0f

    .line 209
    .line 210
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v0, 0x3f800000    # 1.0f

    .line 214
    .line 215
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const/high16 v17, -0x40800000    # -1.0f

    .line 219
    .line 220
    const/high16 v18, 0x3f800000    # 1.0f

    .line 221
    .line 222
    const/4 v13, 0x0

    .line 223
    const v14, 0x3f0ccccd    # 0.55f

    .line 224
    .line 225
    .line 226
    const v15, -0x4119999a    # -0.45f

    .line 227
    .line 228
    .line 229
    const/high16 v16, 0x3f800000    # 1.0f

    .line 230
    .line 231
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v0, 0x41100000    # 9.0f

    .line 235
    .line 236
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/high16 v18, -0x40800000    # -1.0f

    .line 240
    .line 241
    const v13, -0x40f33333    # -0.55f

    .line 242
    .line 243
    .line 244
    const/4 v14, 0x0

    .line 245
    const/high16 v15, -0x40800000    # -1.0f

    .line 246
    .line 247
    const v16, -0x4119999a    # -0.45f

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const/high16 v0, -0x3f800000    # -4.0f

    .line 254
    .line 255
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v17, 0x3f800000    # 1.0f

    .line 259
    .line 260
    const/4 v13, 0x0

    .line 261
    const v14, -0x40f33333    # -0.55f

    .line 262
    .line 263
    .line 264
    const v15, 0x3ee66666    # 0.45f

    .line 265
    .line 266
    .line 267
    const/high16 v16, -0x40800000    # -1.0f

    .line 268
    .line 269
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v0, 0x40800000    # 4.0f

    .line 273
    .line 274
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v18, 0x3f800000    # 1.0f

    .line 278
    .line 279
    const v13, 0x3f0ccccd    # 0.55f

    .line 280
    .line 281
    .line 282
    const/4 v14, 0x0

    .line 283
    const/high16 v15, 0x3f800000    # 1.0f

    .line 284
    .line 285
    const v16, 0x3ee66666    # 0.45f

    .line 286
    .line 287
    .line 288
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const/high16 v0, 0x3f800000    # 1.0f

    .line 292
    .line 293
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v0, 0x3fa28f5c    # 1.27f

    .line 297
    .line 298
    .line 299
    const v2, -0x40d47ae1    # -0.67f

    .line 300
    .line 301
    .line 302
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v17, 0x41800000    # 16.0f

    .line 306
    .line 307
    const v18, 0x414c51ec    # 12.77f

    .line 308
    .line 309
    .line 310
    const v13, 0x4179999a    # 15.6f

    .line 311
    .line 312
    .line 313
    const v14, 0x41426666    # 12.15f

    .line 314
    .line 315
    .line 316
    const/high16 v15, 0x41800000    # 16.0f

    .line 317
    .line 318
    const v16, 0x41463d71    # 12.39f

    .line 319
    .line 320
    .line 321
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v0, 0x401d70a4    # 2.46f

    .line 325
    .line 326
    .line 327
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v17, 0x417451ec    # 15.27f

    .line 331
    .line 332
    .line 333
    const v18, 0x417ab852    # 15.67f

    .line 334
    .line 335
    .line 336
    const/high16 v13, 0x41800000    # 16.0f

    .line 337
    .line 338
    const v14, 0x4179c28f    # 15.61f

    .line 339
    .line 340
    .line 341
    const v15, 0x4179999a    # 15.6f

    .line 342
    .line 343
    .line 344
    const v16, 0x417d999a    # 15.85f

    .line 345
    .line 346
    .line 347
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/4 v14, 0x0

    .line 372
    const/4 v15, 0x0

    .line 373
    const-string v4, ""

    .line 374
    .line 375
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    sput-object v0, Landroidx/compose/material/icons/rounded/CameraIndoorKt;->_cameraIndoor:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 384
    .line 385
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    return-object v0
.end method
