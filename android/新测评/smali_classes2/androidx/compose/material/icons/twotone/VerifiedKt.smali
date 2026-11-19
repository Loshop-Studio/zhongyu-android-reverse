.class public final Landroidx/compose/material/icons/twotone/VerifiedKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_verified",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Verified",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getVerified",
        "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nVerified.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Verified.kt\nandroidx/compose/material/icons/twotone/VerifiedKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,162:1\n212#2,12:163\n233#2,18:176\n253#2:213\n233#2,18:214\n253#2:251\n233#2,18:252\n253#2:289\n174#3:175\n705#4,2:194\n717#4,2:196\n719#4,11:202\n705#4,2:232\n717#4,2:234\n719#4,11:240\n705#4,2:270\n717#4,2:272\n719#4,11:278\n72#5,4:198\n72#5,4:236\n72#5,4:274\n*S KotlinDebug\n*F\n+ 1 Verified.kt\nandroidx/compose/material/icons/twotone/VerifiedKt\n*L\n29#1:163,12\n30#1:176,18\n30#1:213\n82#1:214,18\n82#1:251\n148#1:252,18\n148#1:289\n29#1:175\n30#1:194,2\n30#1:196,2\n30#1:202,11\n82#1:232,2\n82#1:234,2\n82#1:240,11\n148#1:270,2\n148#1:272,2\n148#1:278,11\n30#1:198,4\n82#1:236,4\n148#1:274,4\n*E\n"
    }
.end annotation


# static fields
.field private static _verified:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getVerified(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 20

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/VerifiedKt;->_verified:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Verified"

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
    const v4, 0x4193eb85    # 18.49f

    .line 71
    .line 72
    .line 73
    const v6, 0x411e147b    # 9.88f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, -0x40a66666    # -0.85f

    .line 80
    .line 81
    .line 82
    const v6, 0x3da3d70a    # 0.08f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v4, -0x40066666    # -1.95f

    .line 89
    .line 90
    .line 91
    const v6, 0x3e3851ec    # 0.18f

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v4, -0x4123d70a    # -0.43f

    .line 98
    .line 99
    .line 100
    const v6, -0x400ccccd    # -1.9f

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v4, -0x40a8f5c3    # -0.84f

    .line 107
    .line 108
    .line 109
    const v6, -0x41bd70a4    # -0.19f

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v4, -0x411eb852    # -0.44f

    .line 116
    .line 117
    .line 118
    const v6, -0x40c28f5c    # -0.74f

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v4, -0x40828f5c    # -0.99f

    .line 125
    .line 126
    .line 127
    const v6, -0x4028f5c3    # -1.68f

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v4, 0x414ca3d7    # 12.79f

    .line 134
    .line 135
    .line 136
    const v6, 0x4099999a    # 4.8f

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v4, 0x40a47ae1    # 5.14f

    .line 143
    .line 144
    .line 145
    const/high16 v6, 0x41400000    # 12.0f

    .line 146
    .line 147
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v4, 0x41335c29    # 11.21f

    .line 151
    .line 152
    .line 153
    const v6, 0x4099999a    # 4.8f

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v4, 0x4116b852    # 9.42f

    .line 160
    .line 161
    .line 162
    const v6, 0x4080f5c3    # 4.03f

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v4, 0x4106e148    # 8.43f

    .line 169
    .line 170
    .line 171
    const v6, 0x40b6b852    # 5.71f

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v4, 0x40ffae14    # 7.99f

    .line 178
    .line 179
    .line 180
    const v6, 0x40ce6666    # 6.45f

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v4, 0x40e4cccd    # 7.15f

    .line 187
    .line 188
    .line 189
    const v6, 0x40d47ae1    # 6.64f

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v4, 0x3edc28f6    # 0.43f

    .line 196
    .line 197
    .line 198
    const v6, -0x400ccccd    # -1.9f

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v4, 0x3ff851ec    # 1.94f

    .line 205
    .line 206
    .line 207
    const v6, 0x3e3851ec    # 0.18f

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v4, 0x3f59999a    # 0.85f

    .line 214
    .line 215
    .line 216
    const v6, 0x3da3d70a    # 0.08f

    .line 217
    .line 218
    .line 219
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v4, -0x40f0a3d7    # -0.56f

    .line 223
    .line 224
    .line 225
    const v6, 0x3f266666    # 0.65f

    .line 226
    .line 227
    .line 228
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v4, -0x405ae148    # -1.29f

    .line 232
    .line 233
    .line 234
    const v6, 0x3fbd70a4    # 1.48f

    .line 235
    .line 236
    .line 237
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v4, 0x3fbc28f6    # 1.47f

    .line 241
    .line 242
    .line 243
    const v6, 0x3fa51eb8    # 1.29f

    .line 244
    .line 245
    .line 246
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v4, 0x3f0f5c29    # 0.56f

    .line 250
    .line 251
    .line 252
    const v6, 0x3f266666    # 0.65f

    .line 253
    .line 254
    .line 255
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const v4, -0x425c28f6    # -0.08f

    .line 259
    .line 260
    .line 261
    const v6, 0x3f59999a    # 0.85f

    .line 262
    .line 263
    .line 264
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v4, -0x41c7ae14    # -0.18f

    .line 268
    .line 269
    .line 270
    const v6, 0x3ffae148    # 1.96f

    .line 271
    .line 272
    .line 273
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v4, 0x3ff33333    # 1.9f

    .line 277
    .line 278
    .line 279
    const v6, 0x3edc28f6    # 0.43f

    .line 280
    .line 281
    .line 282
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v4, 0x3e428f5c    # 0.19f

    .line 286
    .line 287
    .line 288
    const v6, 0x3f570a3d    # 0.84f

    .line 289
    .line 290
    .line 291
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v4, 0x3f3d70a4    # 0.74f

    .line 295
    .line 296
    .line 297
    const v6, 0x3ee147ae    # 0.44f

    .line 298
    .line 299
    .line 300
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const v4, 0x3fd5c28f    # 1.67f

    .line 304
    .line 305
    .line 306
    const v6, 0x3f7d70a4    # 0.99f

    .line 307
    .line 308
    .line 309
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v4, -0x40bae148    # -0.77f

    .line 313
    .line 314
    .line 315
    const v6, 0x3fe3d70a    # 1.78f

    .line 316
    .line 317
    .line 318
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v4, 0x4196cccd    # 18.85f

    .line 322
    .line 323
    .line 324
    const/high16 v6, 0x41400000    # 12.0f

    .line 325
    .line 326
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v4, 0x3f4a3d71    # 0.79f

    .line 330
    .line 331
    .line 332
    const v6, 0x3eae147b    # 0.34f

    .line 333
    .line 334
    .line 335
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v4, 0x3f451eb8    # 0.77f

    .line 339
    .line 340
    .line 341
    const v6, 0x3fe3d70a    # 1.78f

    .line 342
    .line 343
    .line 344
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v4, -0x4028f5c3    # -1.68f

    .line 348
    .line 349
    .line 350
    const v6, 0x3f7d70a4    # 0.99f

    .line 351
    .line 352
    .line 353
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v4, 0x3ee147ae    # 0.44f

    .line 357
    .line 358
    .line 359
    const v6, -0x40c28f5c    # -0.74f

    .line 360
    .line 361
    .line 362
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v4, 0x3f570a3d    # 0.84f

    .line 366
    .line 367
    .line 368
    const v6, -0x41bd70a4    # -0.19f

    .line 369
    .line 370
    .line 371
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v4, 0x3ff33333    # 1.9f

    .line 375
    .line 376
    .line 377
    const v6, -0x4123d70a    # -0.43f

    .line 378
    .line 379
    .line 380
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v4, -0x41c7ae14    # -0.18f

    .line 384
    .line 385
    .line 386
    const v6, -0x40066666    # -1.95f

    .line 387
    .line 388
    .line 389
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v4, -0x425c28f6    # -0.08f

    .line 393
    .line 394
    .line 395
    const v6, -0x40a66666    # -0.85f

    .line 396
    .line 397
    .line 398
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v4, -0x40d9999a    # -0.65f

    .line 402
    .line 403
    .line 404
    const v6, 0x3f0f5c29    # 0.56f

    .line 405
    .line 406
    .line 407
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v4, -0x4043d70a    # -1.47f

    .line 411
    .line 412
    .line 413
    const v6, 0x3fa51eb8    # 1.29f

    .line 414
    .line 415
    .line 416
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v4, -0x405ae148    # -1.29f

    .line 420
    .line 421
    .line 422
    const v6, -0x4043d70a    # -1.47f

    .line 423
    .line 424
    .line 425
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const v4, 0x4193eb85    # 18.49f

    .line 429
    .line 430
    .line 431
    const v6, 0x411e147b    # 9.88f

    .line 432
    .line 433
    .line 434
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v4, 0x412170a4    # 10.09f

    .line 441
    .line 442
    .line 443
    const v6, 0x4185c28f    # 16.72f

    .line 444
    .line 445
    .line 446
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v4, -0x3f8ccccd    # -3.8f

    .line 450
    .line 451
    .line 452
    const v6, -0x3f8c28f6    # -3.81f

    .line 453
    .line 454
    .line 455
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const v4, -0x40428f5c    # -1.48f

    .line 459
    .line 460
    .line 461
    const v6, 0x3fbd70a4    # 1.48f

    .line 462
    .line 463
    .line 464
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const v4, 0x40147ae1    # 2.32f

    .line 468
    .line 469
    .line 470
    const v6, 0x40151eb8    # 2.33f

    .line 471
    .line 472
    .line 473
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const v4, 0x40bb3333    # 5.85f

    .line 477
    .line 478
    .line 479
    const v6, -0x3f4428f6    # -5.87f

    .line 480
    .line 481
    .line 482
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v4, 0x3fbd70a4    # 1.48f

    .line 486
    .line 487
    .line 488
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const v4, 0x412170a4    # 10.09f

    .line 492
    .line 493
    .line 494
    const v6, 0x4185c28f    # 16.72f

    .line 495
    .line 496
    .line 497
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 504
    .line 505
    .line 506
    move-result-object v2

    .line 507
    const/16 v16, 0x3800

    .line 508
    .line 509
    const/16 v17, 0x0

    .line 510
    .line 511
    const v6, 0x3e99999a    # 0.3f

    .line 512
    .line 513
    .line 514
    const v8, 0x3e99999a    # 0.3f

    .line 515
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
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 531
    .line 532
    .line 533
    move-result v3

    .line 534
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 535
    .line 536
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 537
    .line 538
    .line 539
    move-result-wide v6

    .line 540
    const/4 v2, 0x0

    .line 541
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 542
    .line 543
    .line 544
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 545
    .line 546
    .line 547
    move-result v10

    .line 548
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 549
    .line 550
    .line 551
    move-result v11

    .line 552
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 555
    .line 556
    .line 557
    const/high16 v4, 0x41b80000    # 23.0f

    .line 558
    .line 559
    const v6, 0x413fd70a    # 11.99f

    .line 560
    .line 561
    .line 562
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const v4, -0x3fe3d70a    # -2.44f

    .line 566
    .line 567
    .line 568
    const v6, -0x3fcd70a4    # -2.79f

    .line 569
    .line 570
    .line 571
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const v4, 0x3eae147b    # 0.34f

    .line 575
    .line 576
    .line 577
    const v6, -0x3f93d70a    # -3.69f

    .line 578
    .line 579
    .line 580
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const v4, -0x3f98f5c3    # -3.61f

    .line 584
    .line 585
    .line 586
    const v6, -0x40ae147b    # -0.82f

    .line 587
    .line 588
    .line 589
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const v4, 0x41766666    # 15.4f

    .line 593
    .line 594
    .line 595
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 596
    .line 597
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const v4, 0x403d70a4    # 2.96f

    .line 601
    .line 602
    .line 603
    const/high16 v6, 0x41400000    # 12.0f

    .line 604
    .line 605
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const v4, 0x4109999a    # 8.6f

    .line 609
    .line 610
    .line 611
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 612
    .line 613
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const v4, 0x40d6b852    # 6.71f

    .line 617
    .line 618
    .line 619
    const v6, 0x4096147b    # 4.69f

    .line 620
    .line 621
    .line 622
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const v4, 0x40466666    # 3.1f

    .line 626
    .line 627
    .line 628
    const/high16 v6, 0x40b00000    # 5.5f

    .line 629
    .line 630
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const v4, 0x405c28f6    # 3.44f

    .line 634
    .line 635
    .line 636
    const v6, 0x41133333    # 9.2f

    .line 637
    .line 638
    .line 639
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const/high16 v4, 0x3f800000    # 1.0f

    .line 643
    .line 644
    const v6, 0x413fd70a    # 11.99f

    .line 645
    .line 646
    .line 647
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const v4, 0x401c28f6    # 2.44f

    .line 651
    .line 652
    .line 653
    const v6, 0x40328f5c    # 2.79f

    .line 654
    .line 655
    .line 656
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    const v4, -0x4151eb85    # -0.34f

    .line 660
    .line 661
    .line 662
    const v6, 0x406ccccd    # 3.7f

    .line 663
    .line 664
    .line 665
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    const v4, 0x40670a3d    # 3.61f

    .line 669
    .line 670
    .line 671
    const v6, 0x3f51eb85    # 0.82f

    .line 672
    .line 673
    .line 674
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    const v4, 0x4109999a    # 8.6f

    .line 678
    .line 679
    .line 680
    const/high16 v6, 0x41b40000    # 22.5f

    .line 681
    .line 682
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 683
    .line 684
    .line 685
    const v4, 0x4059999a    # 3.4f

    .line 686
    .line 687
    .line 688
    const v6, -0x4043d70a    # -1.47f

    .line 689
    .line 690
    .line 691
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 692
    .line 693
    .line 694
    const v6, 0x3fbae148    # 1.46f

    .line 695
    .line 696
    .line 697
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    const v4, 0x3ff1eb85    # 1.89f

    .line 701
    .line 702
    .line 703
    const v6, -0x3fb3d70a    # -3.19f

    .line 704
    .line 705
    .line 706
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    const v4, 0x40670a3d    # 3.61f

    .line 710
    .line 711
    .line 712
    const v6, -0x40ae147b    # -0.82f

    .line 713
    .line 714
    .line 715
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 716
    .line 717
    .line 718
    const v4, -0x4151eb85    # -0.34f

    .line 719
    .line 720
    .line 721
    const v6, -0x3f93d70a    # -3.69f

    .line 722
    .line 723
    .line 724
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    const/high16 v4, 0x41b80000    # 23.0f

    .line 728
    .line 729
    const v6, 0x413fd70a    # 11.99f

    .line 730
    .line 731
    .line 732
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 733
    .line 734
    .line 735
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 736
    .line 737
    .line 738
    const v4, 0x41986666    # 19.05f

    .line 739
    .line 740
    .line 741
    const v6, 0x4157851f    # 13.47f

    .line 742
    .line 743
    .line 744
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 745
    .line 746
    .line 747
    const v4, -0x40f0a3d7    # -0.56f

    .line 748
    .line 749
    .line 750
    const v6, 0x3f266666    # 0.65f

    .line 751
    .line 752
    .line 753
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 754
    .line 755
    .line 756
    const v4, 0x3f59999a    # 0.85f

    .line 757
    .line 758
    .line 759
    const v6, 0x3da3d70a    # 0.08f

    .line 760
    .line 761
    .line 762
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 763
    .line 764
    .line 765
    const v4, 0x3ff9999a    # 1.95f

    .line 766
    .line 767
    .line 768
    const v6, 0x3e3851ec    # 0.18f

    .line 769
    .line 770
    .line 771
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 772
    .line 773
    .line 774
    const v4, 0x3edc28f6    # 0.43f

    .line 775
    .line 776
    .line 777
    const v6, -0x400ccccd    # -1.9f

    .line 778
    .line 779
    .line 780
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 781
    .line 782
    .line 783
    const v4, -0x40a8f5c3    # -0.84f

    .line 784
    .line 785
    .line 786
    const v6, 0x3e428f5c    # 0.19f

    .line 787
    .line 788
    .line 789
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 790
    .line 791
    .line 792
    const v4, -0x411eb852    # -0.44f

    .line 793
    .line 794
    .line 795
    const v6, 0x3f3d70a4    # 0.74f

    .line 796
    .line 797
    .line 798
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 799
    .line 800
    .line 801
    const v4, -0x40828f5c    # -0.99f

    .line 802
    .line 803
    .line 804
    const v6, 0x3fd70a3d    # 1.68f

    .line 805
    .line 806
    .line 807
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 808
    .line 809
    .line 810
    const v4, -0x401c28f6    # -1.78f

    .line 811
    .line 812
    .line 813
    const v6, -0x40bae148    # -0.77f

    .line 814
    .line 815
    .line 816
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 817
    .line 818
    .line 819
    const v4, 0x4196cccd    # 18.85f

    .line 820
    .line 821
    .line 822
    const/high16 v6, 0x41400000    # 12.0f

    .line 823
    .line 824
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 825
    .line 826
    .line 827
    const v4, -0x40b5c28f    # -0.79f

    .line 828
    .line 829
    .line 830
    const v6, 0x3eae147b    # 0.34f

    .line 831
    .line 832
    .line 833
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 834
    .line 835
    .line 836
    const v4, -0x401c28f6    # -1.78f

    .line 837
    .line 838
    .line 839
    const v6, 0x3f451eb8    # 0.77f

    .line 840
    .line 841
    .line 842
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 843
    .line 844
    .line 845
    const v4, -0x40828f5c    # -0.99f

    .line 846
    .line 847
    .line 848
    const v6, -0x402a3d71    # -1.67f

    .line 849
    .line 850
    .line 851
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 852
    .line 853
    .line 854
    const v4, -0x411eb852    # -0.44f

    .line 855
    .line 856
    .line 857
    const v6, -0x40c28f5c    # -0.74f

    .line 858
    .line 859
    .line 860
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 861
    .line 862
    .line 863
    const v4, -0x40a8f5c3    # -0.84f

    .line 864
    .line 865
    .line 866
    const v6, -0x41bd70a4    # -0.19f

    .line 867
    .line 868
    .line 869
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 870
    .line 871
    .line 872
    const v4, -0x4123d70a    # -0.43f

    .line 873
    .line 874
    .line 875
    const v6, -0x400ccccd    # -1.9f

    .line 876
    .line 877
    .line 878
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 879
    .line 880
    .line 881
    const v4, -0x40051eb8    # -1.96f

    .line 882
    .line 883
    .line 884
    const v6, 0x3e3851ec    # 0.18f

    .line 885
    .line 886
    .line 887
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 888
    .line 889
    .line 890
    const v4, -0x40a66666    # -0.85f

    .line 891
    .line 892
    .line 893
    const v6, 0x3da3d70a    # 0.08f

    .line 894
    .line 895
    .line 896
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 897
    .line 898
    .line 899
    const v4, -0x40f0a3d7    # -0.56f

    .line 900
    .line 901
    .line 902
    const v6, -0x40d9999a    # -0.65f

    .line 903
    .line 904
    .line 905
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 906
    .line 907
    .line 908
    const v4, -0x405ae148    # -1.29f

    .line 909
    .line 910
    .line 911
    const v6, -0x4043d70a    # -1.47f

    .line 912
    .line 913
    .line 914
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 915
    .line 916
    .line 917
    const v4, -0x40428f5c    # -1.48f

    .line 918
    .line 919
    .line 920
    const v6, 0x3fa51eb8    # 1.29f

    .line 921
    .line 922
    .line 923
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 924
    .line 925
    .line 926
    const v4, -0x40d9999a    # -0.65f

    .line 927
    .line 928
    .line 929
    const v6, 0x3f0f5c29    # 0.56f

    .line 930
    .line 931
    .line 932
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 933
    .line 934
    .line 935
    const v4, 0x40adc28f    # 5.43f

    .line 936
    .line 937
    .line 938
    const v6, 0x411028f6    # 9.01f

    .line 939
    .line 940
    .line 941
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 942
    .line 943
    .line 944
    const/high16 v4, 0x40a80000    # 5.25f

    .line 945
    .line 946
    const v6, 0x40e23d71    # 7.07f

    .line 947
    .line 948
    .line 949
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 950
    .line 951
    .line 952
    const v4, 0x3ff33333    # 1.9f

    .line 953
    .line 954
    .line 955
    const v6, -0x4123d70a    # -0.43f

    .line 956
    .line 957
    .line 958
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 959
    .line 960
    .line 961
    const v4, 0x3f570a3d    # 0.84f

    .line 962
    .line 963
    .line 964
    const v6, -0x41bd70a4    # -0.19f

    .line 965
    .line 966
    .line 967
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 968
    .line 969
    .line 970
    const v4, 0x3ee147ae    # 0.44f

    .line 971
    .line 972
    .line 973
    const v6, -0x40c28f5c    # -0.74f

    .line 974
    .line 975
    .line 976
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 977
    .line 978
    .line 979
    const v4, -0x4028f5c3    # -1.68f

    .line 980
    .line 981
    .line 982
    const v6, 0x3f7d70a4    # 0.99f

    .line 983
    .line 984
    .line 985
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 986
    .line 987
    .line 988
    const v4, 0x3f451eb8    # 0.77f

    .line 989
    .line 990
    .line 991
    const v6, 0x3fe3d70a    # 1.78f

    .line 992
    .line 993
    .line 994
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 995
    .line 996
    .line 997
    const v4, 0x40a47ae1    # 5.14f

    .line 998
    .line 999
    .line 1000
    const/high16 v6, 0x41400000    # 12.0f

    .line 1001
    .line 1002
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1003
    .line 1004
    .line 1005
    const v4, 0x3f4a3d71    # 0.79f

    .line 1006
    .line 1007
    .line 1008
    const v6, -0x4151eb85    # -0.34f

    .line 1009
    .line 1010
    .line 1011
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1012
    .line 1013
    .line 1014
    const v4, -0x40bae148    # -0.77f

    .line 1015
    .line 1016
    .line 1017
    const v6, 0x3fe3d70a    # 1.78f

    .line 1018
    .line 1019
    .line 1020
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1021
    .line 1022
    .line 1023
    const v4, 0x3fd70a3d    # 1.68f

    .line 1024
    .line 1025
    .line 1026
    const v6, 0x3f7d70a4    # 0.99f

    .line 1027
    .line 1028
    .line 1029
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1030
    .line 1031
    .line 1032
    const v4, 0x3f3d70a4    # 0.74f

    .line 1033
    .line 1034
    .line 1035
    const v6, 0x3ee147ae    # 0.44f

    .line 1036
    .line 1037
    .line 1038
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1039
    .line 1040
    .line 1041
    const v4, 0x3e428f5c    # 0.19f

    .line 1042
    .line 1043
    .line 1044
    const v6, 0x3f570a3d    # 0.84f

    .line 1045
    .line 1046
    .line 1047
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1048
    .line 1049
    .line 1050
    const v4, 0x3ff33333    # 1.9f

    .line 1051
    .line 1052
    .line 1053
    const v6, 0x3edc28f6    # 0.43f

    .line 1054
    .line 1055
    .line 1056
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1057
    .line 1058
    .line 1059
    const v4, -0x41c7ae14    # -0.18f

    .line 1060
    .line 1061
    .line 1062
    const v6, 0x3ff9999a    # 1.95f

    .line 1063
    .line 1064
    .line 1065
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1066
    .line 1067
    .line 1068
    const v4, -0x425c28f6    # -0.08f

    .line 1069
    .line 1070
    .line 1071
    const v6, 0x3f59999a    # 0.85f

    .line 1072
    .line 1073
    .line 1074
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1075
    .line 1076
    .line 1077
    const v4, 0x3f0f5c29    # 0.56f

    .line 1078
    .line 1079
    .line 1080
    const v6, 0x3f266666    # 0.65f

    .line 1081
    .line 1082
    .line 1083
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1084
    .line 1085
    .line 1086
    const v4, 0x3fbc28f6    # 1.47f

    .line 1087
    .line 1088
    .line 1089
    const v6, 0x3fa51eb8    # 1.29f

    .line 1090
    .line 1091
    .line 1092
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1093
    .line 1094
    .line 1095
    const v4, 0x41986666    # 19.05f

    .line 1096
    .line 1097
    .line 1098
    const v6, 0x4157851f    # 13.47f

    .line 1099
    .line 1100
    .line 1101
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1102
    .line 1103
    .line 1104
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1105
    .line 1106
    .line 1107
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1108
    .line 1109
    .line 1110
    move-result-object v2

    .line 1111
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1112
    .line 1113
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1114
    .line 1115
    const/4 v7, 0x0

    .line 1116
    const-string v4, ""

    .line 1117
    .line 1118
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1119
    .line 1120
    .line 1121
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1122
    .line 1123
    .line 1124
    move-result v3

    .line 1125
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1126
    .line 1127
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1128
    .line 1129
    .line 1130
    move-result-wide v6

    .line 1131
    const/4 v0, 0x0

    .line 1132
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1133
    .line 1134
    .line 1135
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1136
    .line 1137
    .line 1138
    move-result v10

    .line 1139
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1140
    .line 1141
    .line 1142
    move-result v11

    .line 1143
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1144
    .line 1145
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1146
    .line 1147
    .line 1148
    const v2, 0x412170a4    # 10.09f

    .line 1149
    .line 1150
    .line 1151
    const/high16 v4, 0x415c0000    # 13.75f

    .line 1152
    .line 1153
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1154
    .line 1155
    .line 1156
    const v2, -0x3feb851f    # -2.32f

    .line 1157
    .line 1158
    .line 1159
    const v4, -0x3feae148    # -2.33f

    .line 1160
    .line 1161
    .line 1162
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1163
    .line 1164
    .line 1165
    const v2, 0x3fbeb852    # 1.49f

    .line 1166
    .line 1167
    .line 1168
    const v4, -0x40428f5c    # -1.48f

    .line 1169
    .line 1170
    .line 1171
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1172
    .line 1173
    .line 1174
    const v2, 0x40733333    # 3.8f

    .line 1175
    .line 1176
    .line 1177
    const v4, 0x4073d70a    # 3.81f

    .line 1178
    .line 1179
    .line 1180
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1181
    .line 1182
    .line 1183
    const v2, 0x40eae148    # 7.34f

    .line 1184
    .line 1185
    .line 1186
    const v4, -0x3f147ae1    # -7.36f

    .line 1187
    .line 1188
    .line 1189
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1190
    .line 1191
    .line 1192
    const v2, -0x404147ae    # -1.49f

    .line 1193
    .line 1194
    .line 1195
    const v4, -0x40428f5c    # -1.48f

    .line 1196
    .line 1197
    .line 1198
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1199
    .line 1200
    .line 1201
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1202
    .line 1203
    .line 1204
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v2

    .line 1208
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1209
    .line 1210
    const/4 v7, 0x0

    .line 1211
    const-string v4, ""

    .line 1212
    .line 1213
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v0

    .line 1217
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v0

    .line 1221
    sput-object v0, Landroidx/compose/material/icons/twotone/VerifiedKt;->_verified:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1222
    .line 1223
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1224
    .line 1225
    .line 1226
    return-object v0
.end method
