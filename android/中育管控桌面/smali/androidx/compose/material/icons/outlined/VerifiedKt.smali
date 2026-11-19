.class public final Landroidx/compose/material/icons/outlined/VerifiedKt;
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
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getVerified",
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
        "SMAP\nVerified.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Verified.kt\nandroidx/compose/material/icons/outlined/VerifiedKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,110:1\n212#2,12:111\n233#2,18:124\n253#2:161\n233#2,18:162\n253#2:199\n174#3:123\n705#4,2:142\n717#4,2:144\n719#4,11:150\n705#4,2:180\n717#4,2:182\n719#4,11:188\n72#5,4:146\n72#5,4:184\n*S KotlinDebug\n*F\n+ 1 Verified.kt\nandroidx/compose/material/icons/outlined/VerifiedKt\n*L\n29#1:111,12\n30#1:124,18\n30#1:161\n96#1:162,18\n96#1:199\n29#1:123\n30#1:142,2\n30#1:144,2\n30#1:150,11\n96#1:180,2\n96#1:182,2\n96#1:188,11\n30#1:146,4\n96#1:184,4\n*E\n"
    }
.end annotation


# static fields
.field private static _verified:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getVerified(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 22

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/VerifiedKt;->_verified:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Verified"

    .line 25
    .line 26
    const/high16 v5, 0x41c00000    # 24.0f

    .line 27
    .line 28
    const/high16 v6, 0x41c00000    # 24.0f

    .line 29
    .line 30
    const-wide/16 v7, 0x0

    .line 31
    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v10, 0x0

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
    new-instance v4, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const/high16 v6, 0x41b80000    # 23.0f

    .line 71
    .line 72
    const v7, 0x413fd70a    # 11.99f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v8, -0x3fe3d70a    # -2.44f

    .line 79
    .line 80
    .line 81
    const v9, -0x3fcd70a4    # -2.79f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4, v8, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v8, 0x3eae147b    # 0.34f

    .line 88
    .line 89
    .line 90
    const v9, -0x3f93d70a    # -3.69f

    .line 91
    .line 92
    .line 93
    invoke-virtual {v4, v8, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v12, -0x3f98f5c3    # -3.61f

    .line 97
    .line 98
    .line 99
    const v13, -0x40ae147b    # -0.82f

    .line 100
    .line 101
    .line 102
    invoke-virtual {v4, v12, v13}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v12, 0x41766666    # 15.4f

    .line 106
    .line 107
    .line 108
    const/high16 v14, 0x3fc00000    # 1.5f

    .line 109
    .line 110
    invoke-virtual {v4, v12, v14}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const v12, 0x403d70a4    # 2.96f

    .line 114
    .line 115
    .line 116
    const/high16 v15, 0x41400000    # 12.0f

    .line 117
    .line 118
    invoke-virtual {v4, v15, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v12, 0x4109999a    # 8.6f

    .line 122
    .line 123
    .line 124
    invoke-virtual {v4, v12, v14}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v14, 0x40d6b852    # 6.71f

    .line 128
    .line 129
    .line 130
    const v2, 0x4096147b    # 4.69f

    .line 131
    .line 132
    .line 133
    invoke-virtual {v4, v14, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v2, 0x40466666    # 3.1f

    .line 137
    .line 138
    .line 139
    const/high16 v14, 0x40b00000    # 5.5f

    .line 140
    .line 141
    invoke-virtual {v4, v2, v14}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v2, 0x405c28f6    # 3.44f

    .line 145
    .line 146
    .line 147
    const v14, 0x41133333    # 9.2f

    .line 148
    .line 149
    .line 150
    invoke-virtual {v4, v2, v14}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/high16 v2, 0x3f800000    # 1.0f

    .line 154
    .line 155
    invoke-virtual {v4, v2, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v2, 0x401c28f6    # 2.44f

    .line 159
    .line 160
    .line 161
    const v14, 0x40328f5c    # 2.79f

    .line 162
    .line 163
    .line 164
    invoke-virtual {v4, v2, v14}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v2, 0x406ccccd    # 3.7f

    .line 168
    .line 169
    .line 170
    const v14, -0x4151eb85    # -0.34f

    .line 171
    .line 172
    .line 173
    invoke-virtual {v4, v14, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v2, 0x3f51eb85    # 0.82f

    .line 177
    .line 178
    .line 179
    const v8, 0x40670a3d    # 3.61f

    .line 180
    .line 181
    .line 182
    invoke-virtual {v4, v8, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const/high16 v2, 0x41b40000    # 22.5f

    .line 186
    .line 187
    invoke-virtual {v4, v12, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v2, 0x4059999a    # 3.4f

    .line 191
    .line 192
    .line 193
    const v12, -0x4043d70a    # -1.47f

    .line 194
    .line 195
    .line 196
    invoke-virtual {v4, v2, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v12, 0x3fbae148    # 1.46f

    .line 200
    .line 201
    .line 202
    invoke-virtual {v4, v2, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v2, 0x3ff1eb85    # 1.89f

    .line 206
    .line 207
    .line 208
    const v12, -0x3fb3d70a    # -3.19f

    .line 209
    .line 210
    .line 211
    invoke-virtual {v4, v2, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v4, v8, v13}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v4, v14, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v2, 0x41986666    # 19.05f

    .line 227
    .line 228
    .line 229
    const v6, 0x4157851f    # 13.47f

    .line 230
    .line 231
    .line 232
    invoke-virtual {v4, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v7, -0x40f0a3d7    # -0.56f

    .line 236
    .line 237
    .line 238
    const v8, 0x3f266666    # 0.65f

    .line 239
    .line 240
    .line 241
    invoke-virtual {v4, v7, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v9, 0x3da3d70a    # 0.08f

    .line 245
    .line 246
    .line 247
    const v12, 0x3f59999a    # 0.85f

    .line 248
    .line 249
    .line 250
    invoke-virtual {v4, v9, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v13, 0x3ff9999a    # 1.95f

    .line 254
    .line 255
    .line 256
    const v2, 0x3e3851ec    # 0.18f

    .line 257
    .line 258
    .line 259
    invoke-virtual {v4, v2, v13}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v13, -0x400ccccd    # -1.9f

    .line 263
    .line 264
    .line 265
    const v6, 0x3edc28f6    # 0.43f

    .line 266
    .line 267
    .line 268
    invoke-virtual {v4, v13, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v6, -0x40a8f5c3    # -0.84f

    .line 272
    .line 273
    .line 274
    const v13, 0x3e428f5c    # 0.19f

    .line 275
    .line 276
    .line 277
    invoke-virtual {v4, v6, v13}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v6, -0x411eb852    # -0.44f

    .line 281
    .line 282
    .line 283
    const v13, 0x3f3d70a4    # 0.74f

    .line 284
    .line 285
    .line 286
    invoke-virtual {v4, v6, v13}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v6, -0x40828f5c    # -0.99f

    .line 290
    .line 291
    .line 292
    const v13, 0x3fd70a3d    # 1.68f

    .line 293
    .line 294
    .line 295
    invoke-virtual {v4, v6, v13}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v6, -0x401c28f6    # -1.78f

    .line 299
    .line 300
    .line 301
    const v13, -0x40bae148    # -0.77f

    .line 302
    .line 303
    .line 304
    invoke-virtual {v4, v6, v13}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v6, 0x4196cccd    # 18.85f

    .line 308
    .line 309
    .line 310
    invoke-virtual {v4, v15, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v6, -0x40b5c28f    # -0.79f

    .line 314
    .line 315
    .line 316
    const v13, 0x3eae147b    # 0.34f

    .line 317
    .line 318
    .line 319
    invoke-virtual {v4, v6, v13}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v6, -0x401c28f6    # -1.78f

    .line 323
    .line 324
    .line 325
    const v13, 0x3f451eb8    # 0.77f

    .line 326
    .line 327
    .line 328
    invoke-virtual {v4, v6, v13}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v6, -0x40828f5c    # -0.99f

    .line 332
    .line 333
    .line 334
    const v13, -0x402a3d71    # -1.67f

    .line 335
    .line 336
    .line 337
    invoke-virtual {v4, v6, v13}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const v6, -0x411eb852    # -0.44f

    .line 341
    .line 342
    .line 343
    const v13, -0x40c28f5c    # -0.74f

    .line 344
    .line 345
    .line 346
    invoke-virtual {v4, v6, v13}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v6, -0x40a8f5c3    # -0.84f

    .line 350
    .line 351
    .line 352
    const v13, -0x41bd70a4    # -0.19f

    .line 353
    .line 354
    .line 355
    invoke-virtual {v4, v6, v13}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v6, -0x400ccccd    # -1.9f

    .line 359
    .line 360
    .line 361
    const v13, -0x4123d70a    # -0.43f

    .line 362
    .line 363
    .line 364
    invoke-virtual {v4, v6, v13}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v6, -0x40051eb8    # -1.96f

    .line 368
    .line 369
    .line 370
    invoke-virtual {v4, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v2, -0x40a66666    # -0.85f

    .line 374
    .line 375
    .line 376
    invoke-virtual {v4, v9, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v2, -0x40d9999a    # -0.65f

    .line 380
    .line 381
    .line 382
    invoke-virtual {v4, v7, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const v2, -0x405ae148    # -1.29f

    .line 386
    .line 387
    .line 388
    const v6, -0x4043d70a    # -1.47f

    .line 389
    .line 390
    .line 391
    invoke-virtual {v4, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const v2, 0x3fa51eb8    # 1.29f

    .line 395
    .line 396
    .line 397
    const v6, -0x40428f5c    # -1.48f

    .line 398
    .line 399
    .line 400
    invoke-virtual {v4, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const v2, 0x3f0f5c29    # 0.56f

    .line 404
    .line 405
    .line 406
    const v7, -0x40d9999a    # -0.65f

    .line 407
    .line 408
    .line 409
    invoke-virtual {v4, v2, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v2, 0x40adc28f    # 5.43f

    .line 413
    .line 414
    .line 415
    const v7, 0x411028f6    # 9.01f

    .line 416
    .line 417
    .line 418
    invoke-virtual {v4, v2, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v2, 0x40a80000    # 5.25f

    .line 422
    .line 423
    const v7, 0x40e23d71    # 7.07f

    .line 424
    .line 425
    .line 426
    invoke-virtual {v4, v2, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v2, 0x3ff33333    # 1.9f

    .line 430
    .line 431
    .line 432
    const v7, -0x4123d70a    # -0.43f

    .line 433
    .line 434
    .line 435
    invoke-virtual {v4, v2, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v2, 0x3f570a3d    # 0.84f

    .line 439
    .line 440
    .line 441
    const v7, -0x41bd70a4    # -0.19f

    .line 442
    .line 443
    .line 444
    invoke-virtual {v4, v2, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v2, 0x3ee147ae    # 0.44f

    .line 448
    .line 449
    .line 450
    const v7, -0x40c28f5c    # -0.74f

    .line 451
    .line 452
    .line 453
    invoke-virtual {v4, v2, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const v2, 0x3f7d70a4    # 0.99f

    .line 457
    .line 458
    .line 459
    const v7, -0x4028f5c3    # -1.68f

    .line 460
    .line 461
    .line 462
    invoke-virtual {v4, v2, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const v2, 0x3fe3d70a    # 1.78f

    .line 466
    .line 467
    .line 468
    const v7, 0x3f451eb8    # 0.77f

    .line 469
    .line 470
    .line 471
    invoke-virtual {v4, v2, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v2, 0x40a47ae1    # 5.14f

    .line 475
    .line 476
    .line 477
    invoke-virtual {v4, v15, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const v2, 0x3f4a3d71    # 0.79f

    .line 481
    .line 482
    .line 483
    invoke-virtual {v4, v2, v14}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const v2, 0x3fe3d70a    # 1.78f

    .line 487
    .line 488
    .line 489
    const v7, -0x40bae148    # -0.77f

    .line 490
    .line 491
    .line 492
    invoke-virtual {v4, v2, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const v2, 0x3f7d70a4    # 0.99f

    .line 496
    .line 497
    .line 498
    const v7, 0x3fd70a3d    # 1.68f

    .line 499
    .line 500
    .line 501
    invoke-virtual {v4, v2, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const v2, 0x3ee147ae    # 0.44f

    .line 505
    .line 506
    .line 507
    const v7, 0x3f3d70a4    # 0.74f

    .line 508
    .line 509
    .line 510
    invoke-virtual {v4, v2, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v2, 0x3f570a3d    # 0.84f

    .line 514
    .line 515
    .line 516
    const v7, 0x3e428f5c    # 0.19f

    .line 517
    .line 518
    .line 519
    invoke-virtual {v4, v2, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const v2, 0x3ff33333    # 1.9f

    .line 523
    .line 524
    .line 525
    const v7, 0x3edc28f6    # 0.43f

    .line 526
    .line 527
    .line 528
    invoke-virtual {v4, v2, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const v2, -0x41c7ae14    # -0.18f

    .line 532
    .line 533
    .line 534
    const v7, 0x3ff9999a    # 1.95f

    .line 535
    .line 536
    .line 537
    invoke-virtual {v4, v2, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const v2, -0x425c28f6    # -0.08f

    .line 541
    .line 542
    .line 543
    invoke-virtual {v4, v2, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const v2, 0x3f0f5c29    # 0.56f

    .line 547
    .line 548
    .line 549
    invoke-virtual {v4, v2, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const v2, 0x3fa51eb8    # 1.29f

    .line 553
    .line 554
    .line 555
    const v7, 0x3fbc28f6    # 1.47f

    .line 556
    .line 557
    .line 558
    invoke-virtual {v4, v2, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const v2, 0x4157851f    # 13.47f

    .line 562
    .line 563
    .line 564
    const v7, 0x41986666    # 19.05f

    .line 565
    .line 566
    .line 567
    invoke-virtual {v4, v7, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 574
    .line 575
    .line 576
    move-result-object v2

    .line 577
    const/16 v16, 0x3800

    .line 578
    .line 579
    const/16 v17, 0x0

    .line 580
    .line 581
    const-string v4, ""

    .line 582
    .line 583
    move v7, v6

    .line 584
    const/high16 v6, 0x3f800000    # 1.0f

    .line 585
    .line 586
    move v8, v7

    .line 587
    const/4 v7, 0x0

    .line 588
    move v9, v8

    .line 589
    const/high16 v8, 0x3f800000    # 1.0f

    .line 590
    .line 591
    move v12, v9

    .line 592
    const/high16 v9, 0x3f800000    # 1.0f

    .line 593
    .line 594
    move v13, v12

    .line 595
    const/high16 v12, 0x3f800000    # 1.0f

    .line 596
    .line 597
    move v14, v13

    .line 598
    const/4 v13, 0x0

    .line 599
    move v15, v14

    .line 600
    const/4 v14, 0x0

    .line 601
    move/from16 v20, v15

    .line 602
    .line 603
    const/4 v15, 0x0

    .line 604
    move-object/from16 v21, v0

    .line 605
    .line 606
    const/4 v0, 0x0

    .line 607
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 608
    .line 609
    .line 610
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 611
    .line 612
    .line 613
    move-result v3

    .line 614
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 615
    .line 616
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 617
    .line 618
    .line 619
    move-result-wide v6

    .line 620
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 621
    .line 622
    .line 623
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 624
    .line 625
    .line 626
    move-result v10

    .line 627
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 628
    .line 629
    .line 630
    move-result v11

    .line 631
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 634
    .line 635
    .line 636
    const v2, 0x412170a4    # 10.09f

    .line 637
    .line 638
    .line 639
    const/high16 v4, 0x415c0000    # 13.75f

    .line 640
    .line 641
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const v2, -0x3feb851f    # -2.32f

    .line 645
    .line 646
    .line 647
    const v4, -0x3feae148    # -2.33f

    .line 648
    .line 649
    .line 650
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const v2, 0x3fbeb852    # 1.49f

    .line 654
    .line 655
    .line 656
    const v15, -0x40428f5c    # -1.48f

    .line 657
    .line 658
    .line 659
    invoke-virtual {v0, v15, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const v2, 0x40733333    # 3.8f

    .line 663
    .line 664
    .line 665
    const v4, 0x4073d70a    # 3.81f

    .line 666
    .line 667
    .line 668
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const v2, 0x40eae148    # 7.34f

    .line 672
    .line 673
    .line 674
    const v4, -0x3f147ae1    # -7.36f

    .line 675
    .line 676
    .line 677
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    const v2, -0x404147ae    # -1.49f

    .line 681
    .line 682
    .line 683
    invoke-virtual {v0, v15, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 684
    .line 685
    .line 686
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 690
    .line 691
    .line 692
    move-result-object v2

    .line 693
    const-string v4, ""

    .line 694
    .line 695
    const/high16 v6, 0x3f800000    # 1.0f

    .line 696
    .line 697
    const/4 v7, 0x0

    .line 698
    const/4 v15, 0x0

    .line 699
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 700
    .line 701
    .line 702
    move-result-object v0

    .line 703
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 704
    .line 705
    .line 706
    move-result-object v0

    .line 707
    sput-object v0, Landroidx/compose/material/icons/outlined/VerifiedKt;->_verified:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 708
    .line 709
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 710
    .line 711
    .line 712
    return-object v0
.end method
