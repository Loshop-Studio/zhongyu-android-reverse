.class public final Landroidx/compose/material/icons/rounded/PasswordKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_password",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Password",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getPassword",
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
        "SMAP\nPassword.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Password.kt\nandroidx/compose/material/icons/rounded/PasswordKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,143:1\n212#2,12:144\n233#2,18:157\n253#2:194\n174#3:156\n705#4,2:175\n717#4,2:177\n719#4,11:183\n72#5,4:179\n*S KotlinDebug\n*F\n+ 1 Password.kt\nandroidx/compose/material/icons/rounded/PasswordKt\n*L\n29#1:144,12\n30#1:157,18\n30#1:194\n29#1:156\n30#1:175,2\n30#1:177,2\n30#1:183,11\n30#1:179,4\n*E\n"
    }
.end annotation


# static fields
.field private static _password:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPassword(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/PasswordKt;->_password:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Password"

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
    const/high16 v0, 0x41880000    # 17.0f

    .line 71
    .line 72
    const/high16 v2, 0x40400000    # 3.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x41900000    # 18.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, 0x3f800000    # 1.0f

    .line 83
    .line 84
    const/high16 v18, 0x3f800000    # 1.0f

    .line 85
    .line 86
    const v13, 0x3f0ccccd    # 0.55f

    .line 87
    .line 88
    .line 89
    const/4 v14, 0x0

    .line 90
    const/high16 v15, 0x3f800000    # 1.0f

    .line 91
    .line 92
    const v16, 0x3ee66666    # 0.45f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/4 v0, 0x0

    .line 99
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v17, -0x40800000    # -1.0f

    .line 103
    .line 104
    const/4 v13, 0x0

    .line 105
    const v14, 0x3f0ccccd    # 0.55f

    .line 106
    .line 107
    .line 108
    const v15, -0x4119999a    # -0.45f

    .line 109
    .line 110
    .line 111
    const/high16 v16, 0x3f800000    # 1.0f

    .line 112
    .line 113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v0, 0x40400000    # 3.0f

    .line 117
    .line 118
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v18, -0x40800000    # -1.0f

    .line 122
    .line 123
    const v13, -0x40f33333    # -0.55f

    .line 124
    .line 125
    .line 126
    const/4 v14, 0x0

    .line 127
    const/high16 v15, -0x40800000    # -1.0f

    .line 128
    .line 129
    const v16, -0x4119999a    # -0.45f

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/4 v0, 0x0

    .line 136
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v17, 0x40400000    # 3.0f

    .line 140
    .line 141
    const/high16 v18, 0x41880000    # 17.0f

    .line 142
    .line 143
    const/high16 v13, 0x40000000    # 2.0f

    .line 144
    .line 145
    const v14, 0x418b999a    # 17.45f

    .line 146
    .line 147
    .line 148
    const v15, 0x401ccccd    # 2.45f

    .line 149
    .line 150
    .line 151
    const/high16 v16, 0x41880000    # 17.0f

    .line 152
    .line 153
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v0, 0x40200000    # 2.5f

    .line 160
    .line 161
    const v2, 0x41491eb8    # 12.57f

    .line 162
    .line 163
    .line 164
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v17, 0x3f83d70a    # 1.03f

    .line 168
    .line 169
    .line 170
    const v18, -0x4170a3d7    # -0.28f

    .line 171
    .line 172
    .line 173
    const v13, 0x3eb851ec    # 0.36f

    .line 174
    .line 175
    .line 176
    const v14, 0x3e570a3d    # 0.21f

    .line 177
    .line 178
    .line 179
    const v15, 0x3f51eb85    # 0.82f

    .line 180
    .line 181
    .line 182
    const v16, 0x3da3d70a    # 0.08f

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v0, 0x40800000    # 4.0f

    .line 189
    .line 190
    const v2, 0x4137851f    # 11.47f

    .line 191
    .line 192
    .line 193
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v0, 0x3ef5c28f    # 0.48f

    .line 197
    .line 198
    .line 199
    const v2, 0x3f547ae1    # 0.83f

    .line 200
    .line 201
    .line 202
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v18, 0x3e8f5c29    # 0.28f

    .line 206
    .line 207
    .line 208
    const v13, 0x3e570a3d    # 0.21f

    .line 209
    .line 210
    .line 211
    const v14, 0x3eb851ec    # 0.36f

    .line 212
    .line 213
    .line 214
    const v15, 0x3f2b851f    # 0.67f

    .line 215
    .line 216
    .line 217
    const v16, 0x3ef5c28f    # 0.48f

    .line 218
    .line 219
    .line 220
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/4 v0, 0x0

    .line 224
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v17, 0x3e8f5c29    # 0.28f

    .line 228
    .line 229
    .line 230
    const v18, -0x407d70a4    # -1.02f

    .line 231
    .line 232
    .line 233
    const v13, 0x3eb851ec    # 0.36f

    .line 234
    .line 235
    .line 236
    const v14, -0x41a8f5c3    # -0.21f

    .line 237
    .line 238
    .line 239
    const v15, 0x3ef5c28f    # 0.48f

    .line 240
    .line 241
    .line 242
    const v16, -0x40d70a3d    # -0.66f

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v0, 0x412b851f    # 10.72f

    .line 249
    .line 250
    .line 251
    const v2, 0x40a9999a    # 5.3f

    .line 252
    .line 253
    .line 254
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v0, 0x3f733333    # 0.95f

    .line 258
    .line 259
    .line 260
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v17, 0x40e00000    # 7.0f

    .line 264
    .line 265
    const v18, 0x411f851f    # 9.97f

    .line 266
    .line 267
    .line 268
    const v13, 0x40d51eb8    # 6.66f

    .line 269
    .line 270
    .line 271
    const v14, 0x412b851f    # 10.72f

    .line 272
    .line 273
    .line 274
    const/high16 v15, 0x40e00000    # 7.0f

    .line 275
    .line 276
    const v16, 0x4126147b    # 10.38f

    .line 277
    .line 278
    .line 279
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/4 v0, 0x0

    .line 283
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const/high16 v17, -0x40c00000    # -0.75f

    .line 287
    .line 288
    const/high16 v18, -0x40c00000    # -0.75f

    .line 289
    .line 290
    const/4 v13, 0x0

    .line 291
    const v14, -0x412e147b    # -0.41f

    .line 292
    .line 293
    .line 294
    const v15, -0x4151eb85    # -0.34f

    .line 295
    .line 296
    .line 297
    const/high16 v16, -0x40c00000    # -0.75f

    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v0, 0x40a9999a    # 5.3f

    .line 303
    .line 304
    .line 305
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v0, 0x40b8a3d7    # 5.77f

    .line 309
    .line 310
    .line 311
    const v2, 0x41066666    # 8.4f

    .line 312
    .line 313
    .line 314
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const/high16 v17, 0x40b00000    # 5.5f

    .line 318
    .line 319
    const v18, 0x40ebd70a    # 7.37f

    .line 320
    .line 321
    .line 322
    const v13, 0x40bf5c29    # 5.98f

    .line 323
    .line 324
    .line 325
    const v14, 0x4100a3d7    # 8.04f

    .line 326
    .line 327
    .line 328
    const v15, 0x40bb851f    # 5.86f

    .line 329
    .line 330
    .line 331
    const v16, 0x40f28f5c    # 7.58f

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/4 v0, 0x0

    .line 338
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v17, 0x408f0a3d    # 4.47f

    .line 342
    .line 343
    .line 344
    const v18, 0x40f4cccd    # 7.65f

    .line 345
    .line 346
    .line 347
    const v13, 0x40a47ae1    # 5.14f

    .line 348
    .line 349
    .line 350
    const v14, 0x40e570a4    # 7.17f

    .line 351
    .line 352
    .line 353
    const v15, 0x4095c28f    # 4.68f

    .line 354
    .line 355
    .line 356
    const v16, 0x40e947ae    # 7.29f

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v0, 0x40800000    # 4.0f

    .line 363
    .line 364
    const v2, 0x4107851f    # 8.47f

    .line 365
    .line 366
    .line 367
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v0, 0x4061eb85    # 3.53f

    .line 371
    .line 372
    .line 373
    const v2, 0x40f4cccd    # 7.65f

    .line 374
    .line 375
    .line 376
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const/high16 v17, 0x40200000    # 2.5f

    .line 380
    .line 381
    const v18, 0x40ebd70a    # 7.37f

    .line 382
    .line 383
    .line 384
    const v13, 0x40547ae1    # 3.32f

    .line 385
    .line 386
    .line 387
    const v14, 0x40e947ae    # 7.29f

    .line 388
    .line 389
    .line 390
    const v15, 0x40370a3d    # 2.86f

    .line 391
    .line 392
    .line 393
    const v16, 0x40e570a4    # 7.17f

    .line 394
    .line 395
    .line 396
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const/4 v0, 0x0

    .line 400
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const v17, 0x400eb852    # 2.23f

    .line 404
    .line 405
    .line 406
    const v18, 0x41066666    # 8.4f

    .line 407
    .line 408
    .line 409
    const v13, 0x4008f5c3    # 2.14f

    .line 410
    .line 411
    .line 412
    const v14, 0x40f28f5c    # 7.58f

    .line 413
    .line 414
    .line 415
    const v15, 0x400147ae    # 2.02f

    .line 416
    .line 417
    .line 418
    const v16, 0x4100a3d7    # 8.04f

    .line 419
    .line 420
    .line 421
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v0, 0x4113851f    # 9.22f

    .line 425
    .line 426
    .line 427
    const v2, 0x402ccccd    # 2.7f

    .line 428
    .line 429
    .line 430
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const/high16 v0, 0x3fe00000    # 1.75f

    .line 434
    .line 435
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const/high16 v17, 0x3f800000    # 1.0f

    .line 439
    .line 440
    const v18, 0x411f851f    # 9.97f

    .line 441
    .line 442
    .line 443
    const v13, 0x3fab851f    # 1.34f

    .line 444
    .line 445
    .line 446
    const v14, 0x4113851f    # 9.22f

    .line 447
    .line 448
    .line 449
    const/high16 v15, 0x3f800000    # 1.0f

    .line 450
    .line 451
    const v16, 0x4118f5c3    # 9.56f

    .line 452
    .line 453
    .line 454
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/4 v0, 0x0

    .line 458
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const/high16 v17, 0x3f400000    # 0.75f

    .line 462
    .line 463
    const/high16 v18, 0x3f400000    # 0.75f

    .line 464
    .line 465
    const/4 v13, 0x0

    .line 466
    const v14, 0x3ed1eb85    # 0.41f

    .line 467
    .line 468
    .line 469
    const v15, 0x3eae147b    # 0.34f

    .line 470
    .line 471
    .line 472
    const/high16 v16, 0x3f400000    # 0.75f

    .line 473
    .line 474
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const v0, 0x402ccccd    # 2.7f

    .line 478
    .line 479
    .line 480
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v0, -0x410a3d71    # -0.48f

    .line 484
    .line 485
    .line 486
    const v2, 0x3f547ae1    # 0.83f

    .line 487
    .line 488
    .line 489
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const/high16 v17, 0x40200000    # 2.5f

    .line 493
    .line 494
    const v18, 0x41491eb8    # 12.57f

    .line 495
    .line 496
    .line 497
    const v13, 0x400147ae    # 2.02f

    .line 498
    .line 499
    .line 500
    const v14, 0x413e8f5c    # 11.91f

    .line 501
    .line 502
    .line 503
    const v15, 0x4008f5c3    # 2.14f

    .line 504
    .line 505
    .line 506
    const v16, 0x4145eb85    # 12.37f

    .line 507
    .line 508
    .line 509
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const/high16 v0, 0x40200000    # 2.5f

    .line 513
    .line 514
    const v2, 0x41491eb8    # 12.57f

    .line 515
    .line 516
    .line 517
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const/high16 v0, 0x41280000    # 10.5f

    .line 524
    .line 525
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const v17, 0x3f83d70a    # 1.03f

    .line 532
    .line 533
    .line 534
    const v18, -0x4170a3d7    # -0.28f

    .line 535
    .line 536
    .line 537
    const v13, 0x3eb851ec    # 0.36f

    .line 538
    .line 539
    .line 540
    const v14, 0x3e570a3d    # 0.21f

    .line 541
    .line 542
    .line 543
    const v15, 0x3f51eb85    # 0.82f

    .line 544
    .line 545
    .line 546
    const v16, 0x3da3d70a    # 0.08f

    .line 547
    .line 548
    .line 549
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const/high16 v0, 0x41400000    # 12.0f

    .line 553
    .line 554
    const v2, 0x4137851f    # 11.47f

    .line 555
    .line 556
    .line 557
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const v0, 0x3ef5c28f    # 0.48f

    .line 561
    .line 562
    .line 563
    const v2, 0x3f547ae1    # 0.83f

    .line 564
    .line 565
    .line 566
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const v18, 0x3e8f5c29    # 0.28f

    .line 570
    .line 571
    .line 572
    const v13, 0x3e570a3d    # 0.21f

    .line 573
    .line 574
    .line 575
    const v14, 0x3eb851ec    # 0.36f

    .line 576
    .line 577
    .line 578
    const v15, 0x3f2b851f    # 0.67f

    .line 579
    .line 580
    .line 581
    const v16, 0x3ef5c28f    # 0.48f

    .line 582
    .line 583
    .line 584
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const/4 v0, 0x0

    .line 588
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const v17, 0x3e8f5c29    # 0.28f

    .line 592
    .line 593
    .line 594
    const v18, -0x407d70a4    # -1.02f

    .line 595
    .line 596
    .line 597
    const v13, 0x3eb851ec    # 0.36f

    .line 598
    .line 599
    .line 600
    const v14, -0x41a8f5c3    # -0.21f

    .line 601
    .line 602
    .line 603
    const v15, 0x3ef5c28f    # 0.48f

    .line 604
    .line 605
    .line 606
    const v16, -0x40d70a3d    # -0.66f

    .line 607
    .line 608
    .line 609
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    const v0, -0x40ab851f    # -0.83f

    .line 613
    .line 614
    .line 615
    const v2, -0x410a3d71    # -0.48f

    .line 616
    .line 617
    .line 618
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    const v0, 0x3f733333    # 0.95f

    .line 622
    .line 623
    .line 624
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    const/high16 v17, 0x3f400000    # 0.75f

    .line 628
    .line 629
    const/high16 v18, -0x40c00000    # -0.75f

    .line 630
    .line 631
    const v13, 0x3ed1eb85    # 0.41f

    .line 632
    .line 633
    .line 634
    const/4 v14, 0x0

    .line 635
    const/high16 v15, 0x3f400000    # 0.75f

    .line 636
    .line 637
    const v16, -0x4151eb85    # -0.34f

    .line 638
    .line 639
    .line 640
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const/4 v0, 0x0

    .line 644
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    const/high16 v17, -0x40c00000    # -0.75f

    .line 648
    .line 649
    const/4 v13, 0x0

    .line 650
    const v14, -0x412e147b    # -0.41f

    .line 651
    .line 652
    .line 653
    const v15, -0x4151eb85    # -0.34f

    .line 654
    .line 655
    .line 656
    const/high16 v16, -0x40c00000    # -0.75f

    .line 657
    .line 658
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    const v0, 0x4154cccd    # 13.3f

    .line 662
    .line 663
    .line 664
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    const v0, -0x40ae147b    # -0.82f

    .line 668
    .line 669
    .line 670
    const v2, 0x3ef0a3d7    # 0.47f

    .line 671
    .line 672
    .line 673
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const v17, -0x4175c28f    # -0.27f

    .line 677
    .line 678
    .line 679
    const v18, -0x407c28f6    # -1.03f

    .line 680
    .line 681
    .line 682
    const v13, 0x3e570a3d    # 0.21f

    .line 683
    .line 684
    .line 685
    const v14, -0x4147ae14    # -0.36f

    .line 686
    .line 687
    .line 688
    const v15, 0x3da3d70a    # 0.08f

    .line 689
    .line 690
    .line 691
    const v16, -0x40ae147b    # -0.82f

    .line 692
    .line 693
    .line 694
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    const/4 v0, 0x0

    .line 698
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    const v17, -0x407d70a4    # -1.02f

    .line 702
    .line 703
    .line 704
    const v18, 0x3e8a3d71    # 0.27f

    .line 705
    .line 706
    .line 707
    const v13, -0x4147ae14    # -0.36f

    .line 708
    .line 709
    .line 710
    const v14, -0x41a8f5c3    # -0.21f

    .line 711
    .line 712
    .line 713
    const v15, -0x40ae147b    # -0.82f

    .line 714
    .line 715
    .line 716
    const v16, -0x425c28f6    # -0.08f

    .line 717
    .line 718
    .line 719
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    const/high16 v0, 0x41400000    # 12.0f

    .line 723
    .line 724
    const v2, 0x4107851f    # 8.47f

    .line 725
    .line 726
    .line 727
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    const v0, -0x410f5c29    # -0.47f

    .line 731
    .line 732
    .line 733
    const v2, -0x40ae147b    # -0.82f

    .line 734
    .line 735
    .line 736
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 737
    .line 738
    .line 739
    const v18, -0x4175c28f    # -0.27f

    .line 740
    .line 741
    .line 742
    const v13, -0x41a8f5c3    # -0.21f

    .line 743
    .line 744
    .line 745
    const v14, -0x4147ae14    # -0.36f

    .line 746
    .line 747
    .line 748
    const v15, -0x40d47ae1    # -0.67f

    .line 749
    .line 750
    .line 751
    const v16, -0x410a3d71    # -0.48f

    .line 752
    .line 753
    .line 754
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 755
    .line 756
    .line 757
    const/4 v0, 0x0

    .line 758
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 759
    .line 760
    .line 761
    const v17, -0x4175c28f    # -0.27f

    .line 762
    .line 763
    .line 764
    const v18, 0x3f83d70a    # 1.03f

    .line 765
    .line 766
    .line 767
    const v13, -0x4147ae14    # -0.36f

    .line 768
    .line 769
    .line 770
    const v14, 0x3e570a3d    # 0.21f

    .line 771
    .line 772
    .line 773
    const v15, -0x410a3d71    # -0.48f

    .line 774
    .line 775
    .line 776
    const v16, 0x3f2b851f    # 0.67f

    .line 777
    .line 778
    .line 779
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 780
    .line 781
    .line 782
    const v0, 0x3f51eb85    # 0.82f

    .line 783
    .line 784
    .line 785
    const v2, 0x3ef0a3d7    # 0.47f

    .line 786
    .line 787
    .line 788
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 789
    .line 790
    .line 791
    const/high16 v0, 0x411c0000    # 9.75f

    .line 792
    .line 793
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 794
    .line 795
    .line 796
    const/high16 v17, 0x41100000    # 9.0f

    .line 797
    .line 798
    const v18, 0x411f851f    # 9.97f

    .line 799
    .line 800
    .line 801
    const v13, 0x411570a4    # 9.34f

    .line 802
    .line 803
    .line 804
    const v14, 0x4113851f    # 9.22f

    .line 805
    .line 806
    .line 807
    const/high16 v15, 0x41100000    # 9.0f

    .line 808
    .line 809
    const v16, 0x4118f5c3    # 9.56f

    .line 810
    .line 811
    .line 812
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 813
    .line 814
    .line 815
    const/4 v0, 0x0

    .line 816
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 817
    .line 818
    .line 819
    const/high16 v17, 0x3f400000    # 0.75f

    .line 820
    .line 821
    const/high16 v18, 0x3f400000    # 0.75f

    .line 822
    .line 823
    const/4 v13, 0x0

    .line 824
    const v14, 0x3ed1eb85    # 0.41f

    .line 825
    .line 826
    .line 827
    const v15, 0x3eae147b    # 0.34f

    .line 828
    .line 829
    .line 830
    const/high16 v16, 0x3f400000    # 0.75f

    .line 831
    .line 832
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 833
    .line 834
    .line 835
    const v0, 0x3f733333    # 0.95f

    .line 836
    .line 837
    .line 838
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 839
    .line 840
    .line 841
    const v0, -0x410a3d71    # -0.48f

    .line 842
    .line 843
    .line 844
    const v2, 0x3f547ae1    # 0.83f

    .line 845
    .line 846
    .line 847
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 848
    .line 849
    .line 850
    const/high16 v17, 0x41280000    # 10.5f

    .line 851
    .line 852
    const v18, 0x41491eb8    # 12.57f

    .line 853
    .line 854
    .line 855
    const v13, 0x412051ec    # 10.02f

    .line 856
    .line 857
    .line 858
    const v14, 0x413e8f5c    # 11.91f

    .line 859
    .line 860
    .line 861
    const v15, 0x41223d71    # 10.14f

    .line 862
    .line 863
    .line 864
    const v16, 0x4145eb85    # 12.37f

    .line 865
    .line 866
    .line 867
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 868
    .line 869
    .line 870
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 871
    .line 872
    .line 873
    const v0, 0x411f851f    # 9.97f

    .line 874
    .line 875
    .line 876
    const/high16 v2, 0x41b80000    # 23.0f

    .line 877
    .line 878
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 879
    .line 880
    .line 881
    const/high16 v17, -0x40c00000    # -0.75f

    .line 882
    .line 883
    const/high16 v18, -0x40c00000    # -0.75f

    .line 884
    .line 885
    const/4 v13, 0x0

    .line 886
    const v14, -0x412e147b    # -0.41f

    .line 887
    .line 888
    .line 889
    const v15, -0x4151eb85    # -0.34f

    .line 890
    .line 891
    .line 892
    const/high16 v16, -0x40c00000    # -0.75f

    .line 893
    .line 894
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 895
    .line 896
    .line 897
    const v0, 0x41aa6666    # 21.3f

    .line 898
    .line 899
    .line 900
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 901
    .line 902
    .line 903
    const v0, -0x40ae147b    # -0.82f

    .line 904
    .line 905
    .line 906
    const v2, 0x3ef0a3d7    # 0.47f

    .line 907
    .line 908
    .line 909
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 910
    .line 911
    .line 912
    const v17, -0x4175c28f    # -0.27f

    .line 913
    .line 914
    .line 915
    const v18, -0x407c28f6    # -1.03f

    .line 916
    .line 917
    .line 918
    const v13, 0x3e570a3d    # 0.21f

    .line 919
    .line 920
    .line 921
    const v14, -0x4147ae14    # -0.36f

    .line 922
    .line 923
    .line 924
    const v15, 0x3da3d70a    # 0.08f

    .line 925
    .line 926
    .line 927
    const v16, -0x40ae147b    # -0.82f

    .line 928
    .line 929
    .line 930
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 931
    .line 932
    .line 933
    const/4 v0, 0x0

    .line 934
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 935
    .line 936
    .line 937
    const v17, -0x407d70a4    # -1.02f

    .line 938
    .line 939
    .line 940
    const v18, 0x3e8a3d71    # 0.27f

    .line 941
    .line 942
    .line 943
    const v13, -0x4147ae14    # -0.36f

    .line 944
    .line 945
    .line 946
    const v14, -0x41a8f5c3    # -0.21f

    .line 947
    .line 948
    .line 949
    const v15, -0x40ae147b    # -0.82f

    .line 950
    .line 951
    .line 952
    const v16, -0x425c28f6    # -0.08f

    .line 953
    .line 954
    .line 955
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 956
    .line 957
    .line 958
    const/high16 v0, 0x41a00000    # 20.0f

    .line 959
    .line 960
    const v2, 0x4107851f    # 8.47f

    .line 961
    .line 962
    .line 963
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 964
    .line 965
    .line 966
    const v0, -0x410f5c29    # -0.47f

    .line 967
    .line 968
    .line 969
    const v2, -0x40ae147b    # -0.82f

    .line 970
    .line 971
    .line 972
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 973
    .line 974
    .line 975
    const v18, -0x4175c28f    # -0.27f

    .line 976
    .line 977
    .line 978
    const v13, -0x41a8f5c3    # -0.21f

    .line 979
    .line 980
    .line 981
    const v14, -0x4147ae14    # -0.36f

    .line 982
    .line 983
    .line 984
    const v15, -0x40d47ae1    # -0.67f

    .line 985
    .line 986
    .line 987
    const v16, -0x410a3d71    # -0.48f

    .line 988
    .line 989
    .line 990
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 991
    .line 992
    .line 993
    const/4 v0, 0x0

    .line 994
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 995
    .line 996
    .line 997
    const v17, -0x4175c28f    # -0.27f

    .line 998
    .line 999
    .line 1000
    const v18, 0x3f83d70a    # 1.03f

    .line 1001
    .line 1002
    .line 1003
    const v13, -0x4147ae14    # -0.36f

    .line 1004
    .line 1005
    .line 1006
    const v14, 0x3e570a3d    # 0.21f

    .line 1007
    .line 1008
    .line 1009
    const v15, -0x410a3d71    # -0.48f

    .line 1010
    .line 1011
    .line 1012
    const v16, 0x3f2b851f    # 0.67f

    .line 1013
    .line 1014
    .line 1015
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1016
    .line 1017
    .line 1018
    const v0, 0x3f51eb85    # 0.82f

    .line 1019
    .line 1020
    .line 1021
    const v2, 0x3ef0a3d7    # 0.47f

    .line 1022
    .line 1023
    .line 1024
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1025
    .line 1026
    .line 1027
    const v0, -0x408ccccd    # -0.95f

    .line 1028
    .line 1029
    .line 1030
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1031
    .line 1032
    .line 1033
    const/high16 v17, 0x41880000    # 17.0f

    .line 1034
    .line 1035
    const v18, 0x411f851f    # 9.97f

    .line 1036
    .line 1037
    .line 1038
    const v13, 0x418ab852    # 17.34f

    .line 1039
    .line 1040
    .line 1041
    const v14, 0x4113851f    # 9.22f

    .line 1042
    .line 1043
    .line 1044
    const/high16 v15, 0x41880000    # 17.0f

    .line 1045
    .line 1046
    const v16, 0x4118f5c3    # 9.56f

    .line 1047
    .line 1048
    .line 1049
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1050
    .line 1051
    .line 1052
    const/4 v0, 0x0

    .line 1053
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1054
    .line 1055
    .line 1056
    const/high16 v17, 0x3f400000    # 0.75f

    .line 1057
    .line 1058
    const/high16 v18, 0x3f400000    # 0.75f

    .line 1059
    .line 1060
    const/4 v13, 0x0

    .line 1061
    const v14, 0x3ed1eb85    # 0.41f

    .line 1062
    .line 1063
    .line 1064
    const v15, 0x3eae147b    # 0.34f

    .line 1065
    .line 1066
    .line 1067
    const/high16 v16, 0x3f400000    # 0.75f

    .line 1068
    .line 1069
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1070
    .line 1071
    .line 1072
    const v0, 0x3f733333    # 0.95f

    .line 1073
    .line 1074
    .line 1075
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1076
    .line 1077
    .line 1078
    const v0, -0x410a3d71    # -0.48f

    .line 1079
    .line 1080
    .line 1081
    const v2, 0x3f547ae1    # 0.83f

    .line 1082
    .line 1083
    .line 1084
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1085
    .line 1086
    .line 1087
    const v17, 0x3e8f5c29    # 0.28f

    .line 1088
    .line 1089
    .line 1090
    const v18, 0x3f828f5c    # 1.02f

    .line 1091
    .line 1092
    .line 1093
    const v13, -0x41a8f5c3    # -0.21f

    .line 1094
    .line 1095
    .line 1096
    const v14, 0x3eb851ec    # 0.36f

    .line 1097
    .line 1098
    .line 1099
    const v15, -0x425c28f6    # -0.08f

    .line 1100
    .line 1101
    .line 1102
    const v16, 0x3f51eb85    # 0.82f

    .line 1103
    .line 1104
    .line 1105
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1106
    .line 1107
    .line 1108
    const/4 v0, 0x0

    .line 1109
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1110
    .line 1111
    .line 1112
    const v17, 0x3f83d70a    # 1.03f

    .line 1113
    .line 1114
    .line 1115
    const v18, -0x4170a3d7    # -0.28f

    .line 1116
    .line 1117
    .line 1118
    const v13, 0x3eb851ec    # 0.36f

    .line 1119
    .line 1120
    .line 1121
    const v14, 0x3e570a3d    # 0.21f

    .line 1122
    .line 1123
    .line 1124
    const v15, 0x3f51eb85    # 0.82f

    .line 1125
    .line 1126
    .line 1127
    const v16, 0x3da3d70a    # 0.08f

    .line 1128
    .line 1129
    .line 1130
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1131
    .line 1132
    .line 1133
    const/high16 v0, 0x41a00000    # 20.0f

    .line 1134
    .line 1135
    const v2, 0x4137851f    # 11.47f

    .line 1136
    .line 1137
    .line 1138
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1139
    .line 1140
    .line 1141
    const v0, 0x3ef5c28f    # 0.48f

    .line 1142
    .line 1143
    .line 1144
    const v2, 0x3f547ae1    # 0.83f

    .line 1145
    .line 1146
    .line 1147
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1148
    .line 1149
    .line 1150
    const v18, 0x3e8f5c29    # 0.28f

    .line 1151
    .line 1152
    .line 1153
    const v13, 0x3e570a3d    # 0.21f

    .line 1154
    .line 1155
    .line 1156
    const v14, 0x3eb851ec    # 0.36f

    .line 1157
    .line 1158
    .line 1159
    const v15, 0x3f2b851f    # 0.67f

    .line 1160
    .line 1161
    .line 1162
    const v16, 0x3ef5c28f    # 0.48f

    .line 1163
    .line 1164
    .line 1165
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1166
    .line 1167
    .line 1168
    const/4 v0, 0x0

    .line 1169
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1170
    .line 1171
    .line 1172
    const v17, 0x3e8f5c29    # 0.28f

    .line 1173
    .line 1174
    .line 1175
    const v18, -0x407d70a4    # -1.02f

    .line 1176
    .line 1177
    .line 1178
    const v13, 0x3eb851ec    # 0.36f

    .line 1179
    .line 1180
    .line 1181
    const v14, -0x41a8f5c3    # -0.21f

    .line 1182
    .line 1183
    .line 1184
    const v15, 0x3ef5c28f    # 0.48f

    .line 1185
    .line 1186
    .line 1187
    const v16, -0x40d70a3d    # -0.66f

    .line 1188
    .line 1189
    .line 1190
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1191
    .line 1192
    .line 1193
    const v0, -0x40ab851f    # -0.83f

    .line 1194
    .line 1195
    .line 1196
    const v2, -0x410a3d71    # -0.48f

    .line 1197
    .line 1198
    .line 1199
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1200
    .line 1201
    .line 1202
    const v0, 0x3f733333    # 0.95f

    .line 1203
    .line 1204
    .line 1205
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1206
    .line 1207
    .line 1208
    const/high16 v17, 0x41b80000    # 23.0f

    .line 1209
    .line 1210
    const v18, 0x411f851f    # 9.97f

    .line 1211
    .line 1212
    .line 1213
    const v13, 0x41b547ae    # 22.66f

    .line 1214
    .line 1215
    .line 1216
    const v14, 0x412b851f    # 10.72f

    .line 1217
    .line 1218
    .line 1219
    const/high16 v15, 0x41b80000    # 23.0f

    .line 1220
    .line 1221
    const v16, 0x4126147b    # 10.38f

    .line 1222
    .line 1223
    .line 1224
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1225
    .line 1226
    .line 1227
    const v0, 0x411f851f    # 9.97f

    .line 1228
    .line 1229
    .line 1230
    const/high16 v2, 0x41b80000    # 23.0f

    .line 1231
    .line 1232
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1233
    .line 1234
    .line 1235
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1236
    .line 1237
    .line 1238
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v2

    .line 1242
    const/16 v16, 0x3800

    .line 1243
    .line 1244
    const/16 v17, 0x0

    .line 1245
    .line 1246
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1247
    .line 1248
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1249
    .line 1250
    const/4 v7, 0x0

    .line 1251
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1252
    .line 1253
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1254
    .line 1255
    const/4 v13, 0x0

    .line 1256
    const/4 v14, 0x0

    .line 1257
    const/4 v15, 0x0

    .line 1258
    const-string v4, ""

    .line 1259
    .line 1260
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v0

    .line 1264
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v0

    .line 1268
    sput-object v0, Landroidx/compose/material/icons/rounded/PasswordKt;->_password:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1269
    .line 1270
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1271
    .line 1272
    .line 1273
    return-object v0
.end method
