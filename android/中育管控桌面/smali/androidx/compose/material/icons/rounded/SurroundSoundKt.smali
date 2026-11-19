.class public final Landroidx/compose/material/icons/rounded/SurroundSoundKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_surroundSound",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SurroundSound",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getSurroundSound",
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
        "SMAP\nSurroundSound.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SurroundSound.kt\nandroidx/compose/material/icons/rounded/SurroundSoundKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,79:1\n212#2,12:80\n233#2,18:93\n253#2:130\n174#3:92\n705#4,2:111\n717#4,2:113\n719#4,11:119\n72#5,4:115\n*S KotlinDebug\n*F\n+ 1 SurroundSound.kt\nandroidx/compose/material/icons/rounded/SurroundSoundKt\n*L\n29#1:80,12\n30#1:93,18\n30#1:130\n29#1:92\n30#1:111,2\n30#1:113,2\n30#1:119,11\n30#1:115,4\n*E\n"
    }
.end annotation


# static fields
.field private static _surroundSound:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSurroundSound(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SurroundSoundKt;->_surroundSound:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SurroundSound"

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
    const/high16 v0, 0x41a00000    # 20.0f

    .line 71
    .line 72
    const/high16 v2, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40800000    # 4.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, -0x40000000    # -2.0f

    .line 83
    .line 84
    const/high16 v18, 0x40000000    # 2.0f

    .line 85
    .line 86
    const v13, -0x40733333    # -1.1f

    .line 87
    .line 88
    .line 89
    const/4 v14, 0x0

    .line 90
    const/high16 v15, -0x40000000    # -2.0f

    .line 91
    .line 92
    const v16, 0x3f666666    # 0.9f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v0, 0x41400000    # 12.0f

    .line 99
    .line 100
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v17, 0x40000000    # 2.0f

    .line 104
    .line 105
    const/4 v13, 0x0

    .line 106
    const v14, 0x3f8ccccd    # 1.1f

    .line 107
    .line 108
    .line 109
    const v15, 0x3f666666    # 0.9f

    .line 110
    .line 111
    .line 112
    const/high16 v16, 0x40000000    # 2.0f

    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v0, 0x41800000    # 16.0f

    .line 118
    .line 119
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v18, -0x40000000    # -2.0f

    .line 123
    .line 124
    const v13, 0x3f8ccccd    # 1.1f

    .line 125
    .line 126
    .line 127
    const/4 v14, 0x0

    .line 128
    const/high16 v15, 0x40000000    # 2.0f

    .line 129
    .line 130
    const v16, -0x4099999a    # -0.9f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v0, 0x41b00000    # 22.0f

    .line 137
    .line 138
    const/high16 v2, 0x40c00000    # 6.0f

    .line 139
    .line 140
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v17, -0x40000000    # -2.0f

    .line 144
    .line 145
    const/4 v13, 0x0

    .line 146
    const v14, -0x40733333    # -1.1f

    .line 147
    .line 148
    .line 149
    const v15, -0x4099999a    # -0.9f

    .line 150
    .line 151
    .line 152
    const/high16 v16, -0x40000000    # -2.0f

    .line 153
    .line 154
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v0, 0x40e3851f    # 7.11f

    .line 161
    .line 162
    .line 163
    const v2, 0x41871eb8    # 16.89f

    .line 164
    .line 165
    .line 166
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v17, -0x403eb852    # -1.51f

    .line 170
    .line 171
    .line 172
    const v18, -0x4247ae14    # -0.09f

    .line 173
    .line 174
    .line 175
    const v13, -0x4123d70a    # -0.43f

    .line 176
    .line 177
    .line 178
    const v14, 0x3edc28f6    # 0.43f

    .line 179
    .line 180
    .line 181
    const v15, -0x406e147b    # -1.14f

    .line 182
    .line 183
    .line 184
    const v16, 0x3ec7ae14    # 0.39f

    .line 185
    .line 186
    .line 187
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v17, 0x40800000    # 4.0f

    .line 191
    .line 192
    const/high16 v18, 0x41400000    # 12.0f

    .line 193
    .line 194
    const v13, 0x4090f5c3    # 4.53f

    .line 195
    .line 196
    .line 197
    const v14, 0x41763d71    # 15.39f

    .line 198
    .line 199
    .line 200
    const/high16 v15, 0x40800000    # 4.0f

    .line 201
    .line 202
    const v16, 0x415b0a3d    # 13.69f

    .line 203
    .line 204
    .line 205
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const v0, 0x3fcb851f    # 1.59f

    .line 209
    .line 210
    .line 211
    const v2, -0x3f666666    # -4.8f

    .line 212
    .line 213
    .line 214
    const v4, 0x3f07ae14    # 0.53f

    .line 215
    .line 216
    .line 217
    const v6, -0x3fa7ae14    # -3.38f

    .line 218
    .line 219
    .line 220
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const v17, 0x3fc147ae    # 1.51f

    .line 224
    .line 225
    .line 226
    const v18, -0x42333333    # -0.1f

    .line 227
    .line 228
    .line 229
    const v13, 0x3ebd70a4    # 0.37f

    .line 230
    .line 231
    .line 232
    const v14, -0x410a3d71    # -0.48f

    .line 233
    .line 234
    .line 235
    const v15, 0x3f8a3d71    # 1.08f

    .line 236
    .line 237
    .line 238
    const v16, -0x40f851ec    # -0.53f

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v17, 0x3dcccccd    # 0.1f

    .line 245
    .line 246
    .line 247
    const v18, 0x3fa51eb8    # 1.29f

    .line 248
    .line 249
    .line 250
    const v13, 0x3eb33333    # 0.35f

    .line 251
    .line 252
    .line 253
    const v14, 0x3eb33333    # 0.35f

    .line 254
    .line 255
    .line 256
    const v15, 0x3ec7ae14    # 0.39f

    .line 257
    .line 258
    .line 259
    const v16, 0x3f666666    # 0.9f

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v17, 0x40c00000    # 6.0f

    .line 266
    .line 267
    const/high16 v18, 0x41400000    # 12.0f

    .line 268
    .line 269
    const v13, 0x40cccccd    # 6.4f

    .line 270
    .line 271
    .line 272
    const v14, 0x41175c29    # 9.46f

    .line 273
    .line 274
    .line 275
    const/high16 v15, 0x40c00000    # 6.0f

    .line 276
    .line 277
    const v16, 0x412bae14    # 10.73f

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v0, 0x3f99999a    # 1.2f

    .line 284
    .line 285
    .line 286
    const v2, 0x40666666    # 3.6f

    .line 287
    .line 288
    .line 289
    const v4, 0x3ecccccd    # 0.4f

    .line 290
    .line 291
    .line 292
    const v6, 0x4021eb85    # 2.53f

    .line 293
    .line 294
    .line 295
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v17, -0x4247ae14    # -0.09f

    .line 299
    .line 300
    .line 301
    const v18, 0x3fa51eb8    # 1.29f

    .line 302
    .line 303
    .line 304
    const v13, 0x3e99999a    # 0.3f

    .line 305
    .line 306
    .line 307
    const v14, 0x3ec7ae14    # 0.39f

    .line 308
    .line 309
    .line 310
    const v15, 0x3e851eb8    # 0.26f

    .line 311
    .line 312
    .line 313
    const v16, 0x3f70a3d7    # 0.94f

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/high16 v0, 0x41800000    # 16.0f

    .line 323
    .line 324
    const/high16 v2, 0x41400000    # 12.0f

    .line 325
    .line 326
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const/high16 v17, -0x3f800000    # -4.0f

    .line 330
    .line 331
    const/high16 v18, -0x3f800000    # -4.0f

    .line 332
    .line 333
    const v13, -0x3ff28f5c    # -2.21f

    .line 334
    .line 335
    .line 336
    const/4 v14, 0x0

    .line 337
    const/high16 v15, -0x3f800000    # -4.0f

    .line 338
    .line 339
    const v16, -0x401ae148    # -1.79f

    .line 340
    .line 341
    .line 342
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const v0, 0x3fe51eb8    # 1.79f

    .line 346
    .line 347
    .line 348
    const/high16 v2, -0x3f800000    # -4.0f

    .line 349
    .line 350
    const/high16 v4, 0x40800000    # 4.0f

    .line 351
    .line 352
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/high16 v2, 0x40800000    # 4.0f

    .line 356
    .line 357
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v0, -0x401ae148    # -1.79f

    .line 361
    .line 362
    .line 363
    const/high16 v2, -0x3f800000    # -4.0f

    .line 364
    .line 365
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v0, 0x41873333    # 16.9f

    .line 372
    .line 373
    .line 374
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const v17, -0x4247ae14    # -0.09f

    .line 378
    .line 379
    .line 380
    const v18, -0x405ae148    # -1.29f

    .line 381
    .line 382
    .line 383
    const v13, -0x414ccccd    # -0.35f

    .line 384
    .line 385
    .line 386
    const v14, -0x414ccccd    # -0.35f

    .line 387
    .line 388
    .line 389
    const v15, -0x413851ec    # -0.39f

    .line 390
    .line 391
    .line 392
    const v16, -0x4099999a    # -0.9f

    .line 393
    .line 394
    .line 395
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const/high16 v17, 0x41900000    # 18.0f

    .line 399
    .line 400
    const/high16 v18, 0x41400000    # 12.0f

    .line 401
    .line 402
    const v13, 0x418ccccd    # 17.6f

    .line 403
    .line 404
    .line 405
    const v14, 0x4168a3d7    # 14.54f

    .line 406
    .line 407
    .line 408
    const/high16 v15, 0x41900000    # 18.0f

    .line 409
    .line 410
    const v16, 0x415451ec    # 13.27f

    .line 411
    .line 412
    .line 413
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const v0, -0x40666666    # -1.2f

    .line 417
    .line 418
    .line 419
    const v2, -0x3f99999a    # -3.6f

    .line 420
    .line 421
    .line 422
    const v4, -0x41333333    # -0.4f

    .line 423
    .line 424
    .line 425
    const v6, -0x3fde147b    # -2.53f

    .line 426
    .line 427
    .line 428
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const v17, 0x3db851ec    # 0.09f

    .line 432
    .line 433
    .line 434
    const v18, -0x4059999a    # -1.3f

    .line 435
    .line 436
    .line 437
    const v13, -0x41666666    # -0.3f

    .line 438
    .line 439
    .line 440
    const v14, -0x413851ec    # -0.39f

    .line 441
    .line 442
    .line 443
    const v15, -0x417ae148    # -0.26f

    .line 444
    .line 445
    .line 446
    const v16, -0x408ccccd    # -0.95f

    .line 447
    .line 448
    .line 449
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v17, 0x3fc147ae    # 1.51f

    .line 453
    .line 454
    .line 455
    const v18, 0x3db851ec    # 0.09f

    .line 456
    .line 457
    .line 458
    const v13, 0x3edc28f6    # 0.43f

    .line 459
    .line 460
    .line 461
    const v14, -0x4123d70a    # -0.43f

    .line 462
    .line 463
    .line 464
    const v15, 0x3f91eb85    # 1.14f

    .line 465
    .line 466
    .line 467
    const v16, -0x413851ec    # -0.39f

    .line 468
    .line 469
    .line 470
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const v17, 0x3fcccccd    # 1.6f

    .line 474
    .line 475
    .line 476
    const v18, 0x4099999a    # 4.8f

    .line 477
    .line 478
    .line 479
    const v13, 0x3f88f5c3    # 1.07f

    .line 480
    .line 481
    .line 482
    const v14, 0x3fb47ae1    # 1.41f

    .line 483
    .line 484
    .line 485
    const v15, 0x3fcccccd    # 1.6f

    .line 486
    .line 487
    .line 488
    const v16, 0x40466666    # 3.1f

    .line 489
    .line 490
    .line 491
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const v17, -0x40347ae1    # -1.59f

    .line 495
    .line 496
    .line 497
    const/4 v13, 0x0

    .line 498
    const v14, 0x3fd851ec    # 1.69f

    .line 499
    .line 500
    .line 501
    const v15, -0x40f851ec    # -0.53f

    .line 502
    .line 503
    .line 504
    const v16, 0x405851ec    # 3.38f

    .line 505
    .line 506
    .line 507
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const v17, -0x403eb852    # -1.51f

    .line 511
    .line 512
    .line 513
    const v18, 0x3de147ae    # 0.11f

    .line 514
    .line 515
    .line 516
    const v13, -0x41428f5c    # -0.37f

    .line 517
    .line 518
    .line 519
    const v14, 0x3efae148    # 0.49f

    .line 520
    .line 521
    .line 522
    const v15, -0x4075c28f    # -1.08f

    .line 523
    .line 524
    .line 525
    const v16, 0x3f0a3d71    # 0.54f

    .line 526
    .line 527
    .line 528
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const/high16 v0, 0x41200000    # 10.0f

    .line 535
    .line 536
    const/high16 v2, 0x41400000    # 12.0f

    .line 537
    .line 538
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const/high16 v17, -0x40000000    # -2.0f

    .line 542
    .line 543
    const/high16 v18, 0x40000000    # 2.0f

    .line 544
    .line 545
    const v13, -0x40733333    # -1.1f

    .line 546
    .line 547
    .line 548
    const/4 v14, 0x0

    .line 549
    const/high16 v15, -0x40000000    # -2.0f

    .line 550
    .line 551
    const v16, 0x3f666666    # 0.9f

    .line 552
    .line 553
    .line 554
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const v0, 0x3f666666    # 0.9f

    .line 558
    .line 559
    .line 560
    const/high16 v2, 0x40000000    # 2.0f

    .line 561
    .line 562
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const v0, -0x4099999a    # -0.9f

    .line 566
    .line 567
    .line 568
    const/high16 v2, -0x40000000    # -2.0f

    .line 569
    .line 570
    const/high16 v4, 0x40000000    # 2.0f

    .line 571
    .line 572
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 582
    .line 583
    .line 584
    move-result-object v2

    .line 585
    const/16 v16, 0x3800

    .line 586
    .line 587
    const/16 v17, 0x0

    .line 588
    .line 589
    const/high16 v6, 0x3f800000    # 1.0f

    .line 590
    .line 591
    const/high16 v8, 0x3f800000    # 1.0f

    .line 592
    .line 593
    const/4 v7, 0x0

    .line 594
    const/high16 v9, 0x3f800000    # 1.0f

    .line 595
    .line 596
    const/high16 v12, 0x3f800000    # 1.0f

    .line 597
    .line 598
    const/4 v13, 0x0

    .line 599
    const/4 v15, 0x0

    .line 600
    const-string v4, ""

    .line 601
    .line 602
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 603
    .line 604
    .line 605
    move-result-object v0

    .line 606
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 607
    .line 608
    .line 609
    move-result-object v0

    .line 610
    sput-object v0, Landroidx/compose/material/icons/rounded/SurroundSoundKt;->_surroundSound:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 611
    .line 612
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 613
    .line 614
    .line 615
    return-object v0
.end method
