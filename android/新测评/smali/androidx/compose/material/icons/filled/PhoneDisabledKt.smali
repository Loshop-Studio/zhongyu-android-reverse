.class public final Landroidx/compose/material/icons/filled/PhoneDisabledKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_phoneDisabled",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "PhoneDisabled",
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getPhoneDisabled",
        "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nPhoneDisabled.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneDisabled.kt\nandroidx/compose/material/icons/filled/PhoneDisabledKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,63:1\n212#2,12:64\n233#2,18:77\n253#2:114\n174#3:76\n705#4,2:95\n717#4,2:97\n719#4,11:103\n72#5,4:99\n*S KotlinDebug\n*F\n+ 1 PhoneDisabled.kt\nandroidx/compose/material/icons/filled/PhoneDisabledKt\n*L\n29#1:64,12\n30#1:77,18\n30#1:114\n29#1:76\n30#1:95,2\n30#1:97,2\n30#1:103,11\n30#1:99,4\n*E\n"
    }
.end annotation


# static fields
.field private static _phoneDisabled:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPhoneDisabled(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/PhoneDisabledKt;->_phoneDisabled:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.PhoneDisabled"

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
    const v0, 0x418ab852    # 17.34f

    .line 71
    .line 72
    .line 73
    const v2, 0x4168a3d7    # 14.54f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, -0x4048f5c3    # -1.43f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const v17, 0x3fbc28f6    # 1.47f

    .line 86
    .line 87
    .line 88
    const v18, -0x3feb851f    # -2.32f

    .line 89
    .line 90
    .line 91
    const v13, 0x3f0f5c29    # 0.56f

    .line 92
    .line 93
    .line 94
    const v14, -0x40c51eb8    # -0.73f

    .line 95
    .line 96
    .line 97
    const v15, 0x3f866666    # 1.05f

    .line 98
    .line 99
    .line 100
    const/high16 v16, -0x40400000    # -1.5f

    .line 101
    .line 102
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v0, -0x3ff33333    # -2.2f

    .line 106
    .line 107
    .line 108
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v17, -0x41800000    # -0.25f

    .line 112
    .line 113
    const v18, -0x407d70a4    # -1.02f

    .line 114
    .line 115
    .line 116
    const v13, -0x4170a3d7    # -0.28f

    .line 117
    .line 118
    .line 119
    const v14, -0x4170a3d7    # -0.28f

    .line 120
    .line 121
    .line 122
    const v15, -0x4147ae14    # -0.36f

    .line 123
    .line 124
    .line 125
    const v16, -0x40d47ae1    # -0.67f

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v17, 0x3f11eb85    # 0.57f

    .line 132
    .line 133
    .line 134
    const v18, -0x3f9b851f    # -3.57f

    .line 135
    .line 136
    .line 137
    const v13, 0x3ebd70a4    # 0.37f

    .line 138
    .line 139
    .line 140
    const v14, -0x4070a3d7    # -1.12f

    .line 141
    .line 142
    .line 143
    const v15, 0x3f11eb85    # 0.57f

    .line 144
    .line 145
    .line 146
    const v16, -0x3feb851f    # -2.32f

    .line 147
    .line 148
    .line 149
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v17, 0x3f800000    # 1.0f

    .line 153
    .line 154
    const/high16 v18, -0x40800000    # -1.0f

    .line 155
    .line 156
    const/4 v13, 0x0

    .line 157
    const v14, -0x40f33333    # -0.55f

    .line 158
    .line 159
    .line 160
    const v15, 0x3ee66666    # 0.45f

    .line 161
    .line 162
    .line 163
    const/high16 v16, -0x40800000    # -1.0f

    .line 164
    .line 165
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v0, 0x41a00000    # 20.0f

    .line 169
    .line 170
    const/high16 v2, 0x40400000    # 3.0f

    .line 171
    .line 172
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const/high16 v18, 0x3f800000    # 1.0f

    .line 176
    .line 177
    const v13, 0x3f0ccccd    # 0.55f

    .line 178
    .line 179
    .line 180
    const/4 v14, 0x0

    .line 181
    const/high16 v15, 0x3f800000    # 1.0f

    .line 182
    .line 183
    const v16, 0x3ee66666    # 0.45f

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v17, -0x3f95c28f    # -3.66f

    .line 190
    .line 191
    .line 192
    const v18, 0x4128a3d7    # 10.54f

    .line 193
    .line 194
    .line 195
    const/4 v13, 0x0

    .line 196
    const v14, 0x407eb852    # 3.98f

    .line 197
    .line 198
    .line 199
    const v15, -0x4050a3d7    # -1.37f

    .line 200
    .line 201
    .line 202
    const v16, 0x40f47ae1    # 7.64f

    .line 203
    .line 204
    .line 205
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v0, 0x416851ec    # 14.52f

    .line 212
    .line 213
    .line 214
    const v2, 0x418acccd    # 17.35f

    .line 215
    .line 216
    .line 217
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v17, 0x40800000    # 4.0f

    .line 221
    .line 222
    const/high16 v18, 0x41a80000    # 21.0f

    .line 223
    .line 224
    const v13, 0x413a147b    # 11.63f

    .line 225
    .line 226
    .line 227
    const v14, 0x419d1eb8    # 19.64f

    .line 228
    .line 229
    .line 230
    const v15, 0x40ff0a3d    # 7.97f

    .line 231
    .line 232
    .line 233
    const/high16 v16, 0x41a80000    # 21.0f

    .line 234
    .line 235
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v17, -0x40800000    # -1.0f

    .line 239
    .line 240
    const/high16 v18, -0x40800000    # -1.0f

    .line 241
    .line 242
    const v13, -0x40f33333    # -0.55f

    .line 243
    .line 244
    .line 245
    const/4 v14, 0x0

    .line 246
    const/high16 v15, -0x40800000    # -1.0f

    .line 247
    .line 248
    const v16, -0x4119999a    # -0.45f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v0, -0x3fa0a3d7    # -3.49f

    .line 255
    .line 256
    .line 257
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v17, 0x3f800000    # 1.0f

    .line 261
    .line 262
    const/4 v13, 0x0

    .line 263
    const v14, -0x40f33333    # -0.55f

    .line 264
    .line 265
    .line 266
    const v15, 0x3ee66666    # 0.45f

    .line 267
    .line 268
    .line 269
    const/high16 v16, -0x40800000    # -1.0f

    .line 270
    .line 271
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v17, 0x40647ae1    # 3.57f

    .line 275
    .line 276
    .line 277
    const v18, -0x40ee147b    # -0.57f

    .line 278
    .line 279
    .line 280
    const v13, 0x3f9eb852    # 1.24f

    .line 281
    .line 282
    .line 283
    const/4 v14, 0x0

    .line 284
    const v15, 0x401ccccd    # 2.45f

    .line 285
    .line 286
    .line 287
    const v16, -0x41b33333    # -0.2f

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v17, 0x3f828f5c    # 1.02f

    .line 294
    .line 295
    .line 296
    const v18, 0x3e75c28f    # 0.24f

    .line 297
    .line 298
    .line 299
    const v13, 0x3eb33333    # 0.35f

    .line 300
    .line 301
    .line 302
    const v14, -0x420a3d71    # -0.12f

    .line 303
    .line 304
    .line 305
    const/high16 v15, 0x3f400000    # 0.75f

    .line 306
    .line 307
    const v16, -0x430a3d71    # -0.03f

    .line 308
    .line 309
    .line 310
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v0, 0x400ccccd    # 2.2f

    .line 314
    .line 315
    .line 316
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v17, 0x40133333    # 2.3f

    .line 320
    .line 321
    .line 322
    const v18, -0x40451eb8    # -1.46f

    .line 323
    .line 324
    .line 325
    const v13, 0x3f4f5c29    # 0.81f

    .line 326
    .line 327
    .line 328
    const v14, -0x4128f5c3    # -0.42f

    .line 329
    .line 330
    .line 331
    const v15, 0x3fca3d71    # 1.58f

    .line 332
    .line 333
    .line 334
    const v16, -0x4099999a    # -0.9f

    .line 335
    .line 336
    .line 337
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const v0, 0x3fb1eb85    # 1.39f

    .line 341
    .line 342
    .line 343
    const v2, 0x40870a3d    # 4.22f

    .line 344
    .line 345
    .line 346
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v0, 0x3fb5c28f    # 1.42f

    .line 350
    .line 351
    .line 352
    const v2, -0x404b851f    # -1.41f

    .line 353
    .line 354
    .line 355
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v0, 0x41a9851f    # 21.19f

    .line 359
    .line 360
    .line 361
    const v2, 0x41a9999a    # 21.2f

    .line 362
    .line 363
    .line 364
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v0, 0x3fb47ae1    # 1.41f

    .line 368
    .line 369
    .line 370
    const v2, -0x404b851f    # -1.41f

    .line 371
    .line 372
    .line 373
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const v0, -0x3f57ae14    # -5.26f

    .line 377
    .line 378
    .line 379
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 386
    .line 387
    .line 388
    move-result-object v2

    .line 389
    const/16 v16, 0x3800

    .line 390
    .line 391
    const/16 v17, 0x0

    .line 392
    .line 393
    const/high16 v6, 0x3f800000    # 1.0f

    .line 394
    .line 395
    const/high16 v8, 0x3f800000    # 1.0f

    .line 396
    .line 397
    const/4 v7, 0x0

    .line 398
    const/high16 v9, 0x3f800000    # 1.0f

    .line 399
    .line 400
    const/high16 v12, 0x3f800000    # 1.0f

    .line 401
    .line 402
    const/4 v13, 0x0

    .line 403
    const/4 v14, 0x0

    .line 404
    const/4 v15, 0x0

    .line 405
    const-string v4, ""

    .line 406
    .line 407
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    sput-object v0, Landroidx/compose/material/icons/filled/PhoneDisabledKt;->_phoneDisabled:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 416
    .line 417
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 418
    .line 419
    .line 420
    return-object v0
.end method
