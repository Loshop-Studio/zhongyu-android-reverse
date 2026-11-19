.class public final Landroidx/compose/material/icons/rounded/_3kKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "__3k",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "_3k",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "get_3k",
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
        "SMAP\n_3k.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _3k.kt\nandroidx/compose/material/icons/rounded/_3kKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,90:1\n212#2,12:91\n233#2,18:104\n253#2:141\n174#3:103\n705#4,2:122\n717#4,2:124\n719#4,11:130\n72#5,4:126\n*S KotlinDebug\n*F\n+ 1 _3k.kt\nandroidx/compose/material/icons/rounded/_3kKt\n*L\n29#1:91,12\n30#1:104,18\n30#1:141\n29#1:103\n30#1:122,2\n30#1:124,2\n30#1:130,11\n30#1:126,4\n*E\n"
    }
.end annotation


# static fields
.field private static __3k:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final get_3k(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/_3kKt;->__3k:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded._3k"

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
    const/high16 v0, 0x41980000    # 19.0f

    .line 71
    .line 72
    const/high16 v2, 0x40400000    # 3.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40a00000    # 5.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, 0x40400000    # 3.0f

    .line 83
    .line 84
    const/high16 v18, 0x40a00000    # 5.0f

    .line 85
    .line 86
    const v13, 0x4079999a    # 3.9f

    .line 87
    .line 88
    .line 89
    const/high16 v14, 0x40400000    # 3.0f

    .line 90
    .line 91
    const/high16 v15, 0x40400000    # 3.0f

    .line 92
    .line 93
    const v16, 0x4079999a    # 3.9f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v0, 0x41600000    # 14.0f

    .line 100
    .line 101
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v17, 0x40000000    # 2.0f

    .line 105
    .line 106
    const/high16 v18, 0x40000000    # 2.0f

    .line 107
    .line 108
    const/4 v13, 0x0

    .line 109
    const v14, 0x3f8ccccd    # 1.1f

    .line 110
    .line 111
    .line 112
    const v15, 0x3f666666    # 0.9f

    .line 113
    .line 114
    .line 115
    const/high16 v16, 0x40000000    # 2.0f

    .line 116
    .line 117
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v18, -0x40000000    # -2.0f

    .line 124
    .line 125
    const v13, 0x3f8ccccd    # 1.1f

    .line 126
    .line 127
    .line 128
    const/4 v14, 0x0

    .line 129
    const/high16 v15, 0x40000000    # 2.0f

    .line 130
    .line 131
    const v16, -0x4099999a    # -0.9f

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v0, 0x40a00000    # 5.0f

    .line 138
    .line 139
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v17, 0x41980000    # 19.0f

    .line 143
    .line 144
    const/high16 v18, 0x40400000    # 3.0f

    .line 145
    .line 146
    const/high16 v13, 0x41a80000    # 21.0f

    .line 147
    .line 148
    const v14, 0x4079999a    # 3.9f

    .line 149
    .line 150
    .line 151
    const v15, 0x41a0cccd    # 20.1f

    .line 152
    .line 153
    .line 154
    const/high16 v16, 0x40400000    # 3.0f

    .line 155
    .line 156
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v0, 0x41300000    # 11.0f

    .line 163
    .line 164
    const/high16 v2, 0x41600000    # 14.0f

    .line 165
    .line 166
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const/high16 v17, -0x40800000    # -1.0f

    .line 170
    .line 171
    const/high16 v18, 0x3f800000    # 1.0f

    .line 172
    .line 173
    const/4 v13, 0x0

    .line 174
    const v14, 0x3f0ccccd    # 0.55f

    .line 175
    .line 176
    .line 177
    const v15, -0x4119999a    # -0.45f

    .line 178
    .line 179
    .line 180
    const/high16 v16, 0x3f800000    # 1.0f

    .line 181
    .line 182
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const/high16 v0, 0x40e80000    # 7.25f

    .line 186
    .line 187
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v17, -0x40c00000    # -0.75f

    .line 191
    .line 192
    const/high16 v18, -0x40c00000    # -0.75f

    .line 193
    .line 194
    const v13, -0x412e147b    # -0.41f

    .line 195
    .line 196
    .line 197
    const/4 v14, 0x0

    .line 198
    const/high16 v15, -0x40c00000    # -0.75f

    .line 199
    .line 200
    const v16, -0x4151eb85    # -0.34f

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/4 v0, 0x0

    .line 207
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v17, 0x3f400000    # 0.75f

    .line 211
    .line 212
    const/4 v13, 0x0

    .line 213
    const v14, -0x412e147b    # -0.41f

    .line 214
    .line 215
    .line 216
    const v15, 0x3eae147b    # 0.34f

    .line 217
    .line 218
    .line 219
    const/high16 v16, -0x40c00000    # -0.75f

    .line 220
    .line 221
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/high16 v0, 0x41180000    # 9.5f

    .line 225
    .line 226
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/high16 v0, -0x40800000    # -1.0f

    .line 230
    .line 231
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v0, 0x41000000    # 8.0f

    .line 235
    .line 236
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/high16 v17, -0x41000000    # -0.5f

    .line 240
    .line 241
    const/high16 v18, -0x41000000    # -0.5f

    .line 242
    .line 243
    const v13, -0x4170a3d7    # -0.28f

    .line 244
    .line 245
    .line 246
    const/4 v14, 0x0

    .line 247
    const/high16 v15, -0x41000000    # -0.5f

    .line 248
    .line 249
    const v16, -0x419eb852    # -0.22f

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/4 v0, 0x0

    .line 256
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v17, 0x3f000000    # 0.5f

    .line 260
    .line 261
    const/4 v13, 0x0

    .line 262
    const v14, -0x4170a3d7    # -0.28f

    .line 263
    .line 264
    .line 265
    const v15, 0x3e6147ae    # 0.22f

    .line 266
    .line 267
    .line 268
    const/high16 v16, -0x41000000    # -0.5f

    .line 269
    .line 270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 274
    .line 275
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const/high16 v0, -0x40800000    # -1.0f

    .line 279
    .line 280
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const/high16 v0, 0x40e80000    # 7.25f

    .line 284
    .line 285
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/high16 v17, -0x40c00000    # -0.75f

    .line 289
    .line 290
    const/high16 v18, -0x40c00000    # -0.75f

    .line 291
    .line 292
    const v13, -0x412e147b    # -0.41f

    .line 293
    .line 294
    .line 295
    const/4 v14, 0x0

    .line 296
    const/high16 v15, -0x40c00000    # -0.75f

    .line 297
    .line 298
    const v16, -0x4151eb85    # -0.34f

    .line 299
    .line 300
    .line 301
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const/4 v0, 0x0

    .line 305
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v17, 0x40e80000    # 7.25f

    .line 309
    .line 310
    const/high16 v18, 0x41100000    # 9.0f

    .line 311
    .line 312
    const/high16 v13, 0x40d00000    # 6.5f

    .line 313
    .line 314
    const v14, 0x411570a4    # 9.34f

    .line 315
    .line 316
    .line 317
    const v15, 0x40dae148    # 6.84f

    .line 318
    .line 319
    .line 320
    const/high16 v16, 0x41100000    # 9.0f

    .line 321
    .line 322
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const/high16 v0, 0x41200000    # 10.0f

    .line 326
    .line 327
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/high16 v17, 0x3f800000    # 1.0f

    .line 331
    .line 332
    const/high16 v18, 0x3f800000    # 1.0f

    .line 333
    .line 334
    const v13, 0x3f0ccccd    # 0.55f

    .line 335
    .line 336
    .line 337
    const/4 v14, 0x0

    .line 338
    const/high16 v15, 0x3f800000    # 1.0f

    .line 339
    .line 340
    const v16, 0x3ee66666    # 0.45f

    .line 341
    .line 342
    .line 343
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const/high16 v0, 0x41600000    # 14.0f

    .line 347
    .line 348
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v0, 0x41700000    # 15.0f

    .line 355
    .line 356
    const v2, 0x4184b852    # 16.59f

    .line 357
    .line 358
    .line 359
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v17, -0x40f33333    # -0.55f

    .line 366
    .line 367
    .line 368
    const v18, -0x4175c28f    # -0.27f

    .line 369
    .line 370
    .line 371
    const v13, -0x419eb852    # -0.22f

    .line 372
    .line 373
    .line 374
    const v15, -0x4128f5c3    # -0.42f

    .line 375
    .line 376
    .line 377
    const v16, -0x42333333    # -0.1f

    .line 378
    .line 379
    .line 380
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v0, -0x403ae148    # -1.54f

    .line 384
    .line 385
    .line 386
    const v2, -0x40028f5c    # -1.98f

    .line 387
    .line 388
    .line 389
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 393
    .line 394
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const/high16 v17, -0x40c00000    # -0.75f

    .line 398
    .line 399
    const/high16 v18, 0x3f400000    # 0.75f

    .line 400
    .line 401
    const/4 v13, 0x0

    .line 402
    const v14, 0x3ed1eb85    # 0.41f

    .line 403
    .line 404
    .line 405
    const v15, -0x4151eb85    # -0.34f

    .line 406
    .line 407
    .line 408
    const/high16 v16, 0x3f400000    # 0.75f

    .line 409
    .line 410
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/4 v0, 0x0

    .line 414
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const/high16 v17, 0x41500000    # 13.0f

    .line 418
    .line 419
    const/high16 v18, 0x41640000    # 14.25f

    .line 420
    .line 421
    const v13, 0x415570a4    # 13.34f

    .line 422
    .line 423
    .line 424
    const/high16 v14, 0x41700000    # 15.0f

    .line 425
    .line 426
    const/high16 v15, 0x41500000    # 13.0f

    .line 427
    .line 428
    const v16, 0x416a8f5c    # 14.66f

    .line 429
    .line 430
    .line 431
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/high16 v0, -0x3f700000    # -4.5f

    .line 435
    .line 436
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const/high16 v17, 0x415c0000    # 13.75f

    .line 440
    .line 441
    const/high16 v18, 0x41100000    # 9.0f

    .line 442
    .line 443
    const/high16 v13, 0x41500000    # 13.0f

    .line 444
    .line 445
    const v14, 0x411570a4    # 9.34f

    .line 446
    .line 447
    .line 448
    const v15, 0x415570a4    # 13.34f

    .line 449
    .line 450
    .line 451
    const/high16 v16, 0x41100000    # 9.0f

    .line 452
    .line 453
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/4 v0, 0x0

    .line 457
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const/high16 v17, 0x3f400000    # 0.75f

    .line 461
    .line 462
    const/high16 v18, 0x3f400000    # 0.75f

    .line 463
    .line 464
    const v13, 0x3ed1eb85    # 0.41f

    .line 465
    .line 466
    .line 467
    const/4 v14, 0x0

    .line 468
    const/high16 v15, 0x3f400000    # 0.75f

    .line 469
    .line 470
    const v16, 0x3eae147b    # 0.34f

    .line 471
    .line 472
    .line 473
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 477
    .line 478
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const v0, 0x3fc51eb8    # 1.54f

    .line 482
    .line 483
    .line 484
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v17, 0x4184b852    # 16.59f

    .line 488
    .line 489
    .line 490
    const/high16 v18, 0x41100000    # 9.0f

    .line 491
    .line 492
    const v13, 0x41815c29    # 16.17f

    .line 493
    .line 494
    .line 495
    const v14, 0x4111999a    # 9.1f

    .line 496
    .line 497
    .line 498
    const v15, 0x41830a3d    # 16.38f

    .line 499
    .line 500
    .line 501
    const/high16 v16, 0x41100000    # 9.0f

    .line 502
    .line 503
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const/4 v0, 0x0

    .line 507
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const v17, 0x3f0f5c29    # 0.56f

    .line 511
    .line 512
    .line 513
    const v18, 0x3f8f5c29    # 1.12f

    .line 514
    .line 515
    .line 516
    const v13, 0x3f147ae1    # 0.58f

    .line 517
    .line 518
    .line 519
    const/4 v14, 0x0

    .line 520
    const v15, 0x3f68f5c3    # 0.91f

    .line 521
    .line 522
    .line 523
    const v16, 0x3f28f5c3    # 0.66f

    .line 524
    .line 525
    .line 526
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const/high16 v0, 0x417c0000    # 15.75f

    .line 530
    .line 531
    const/high16 v2, 0x41400000    # 12.0f

    .line 532
    .line 533
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const v0, 0x3fb47ae1    # 1.41f

    .line 537
    .line 538
    .line 539
    const v2, 0x3ff0a3d7    # 1.88f

    .line 540
    .line 541
    .line 542
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const v17, 0x4184b852    # 16.59f

    .line 546
    .line 547
    .line 548
    const/high16 v18, 0x41700000    # 15.0f

    .line 549
    .line 550
    const/high16 v13, 0x418c0000    # 17.5f

    .line 551
    .line 552
    const v14, 0x416570a4    # 14.34f

    .line 553
    .line 554
    .line 555
    const v15, 0x41895c29    # 17.17f

    .line 556
    .line 557
    .line 558
    const/high16 v16, 0x41700000    # 15.0f

    .line 559
    .line 560
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 567
    .line 568
    .line 569
    move-result-object v2

    .line 570
    const/16 v16, 0x3800

    .line 571
    .line 572
    const/16 v17, 0x0

    .line 573
    .line 574
    const/high16 v6, 0x3f800000    # 1.0f

    .line 575
    .line 576
    const/high16 v8, 0x3f800000    # 1.0f

    .line 577
    .line 578
    const/4 v7, 0x0

    .line 579
    const/high16 v9, 0x3f800000    # 1.0f

    .line 580
    .line 581
    const/high16 v12, 0x3f800000    # 1.0f

    .line 582
    .line 583
    const/4 v13, 0x0

    .line 584
    const/4 v14, 0x0

    .line 585
    const/4 v15, 0x0

    .line 586
    const-string v4, ""

    .line 587
    .line 588
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 589
    .line 590
    .line 591
    move-result-object v0

    .line 592
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 593
    .line 594
    .line 595
    move-result-object v0

    .line 596
    sput-object v0, Landroidx/compose/material/icons/rounded/_3kKt;->__3k:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 597
    .line 598
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 599
    .line 600
    .line 601
    return-object v0
.end method
