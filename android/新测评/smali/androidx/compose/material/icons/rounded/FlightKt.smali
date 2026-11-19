.class public final Landroidx/compose/material/icons/rounded/FlightKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_flight",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Flight",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getFlight",
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
        "SMAP\nFlight.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Flight.kt\nandroidx/compose/material/icons/rounded/FlightKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,63:1\n212#2,12:64\n233#2,18:77\n253#2:114\n174#3:76\n705#4,2:95\n717#4,2:97\n719#4,11:103\n72#5,4:99\n*S KotlinDebug\n*F\n+ 1 Flight.kt\nandroidx/compose/material/icons/rounded/FlightKt\n*L\n29#1:64,12\n30#1:77,18\n30#1:114\n29#1:76\n30#1:95,2\n30#1:97,2\n30#1:103,11\n30#1:99,4\n*E\n"
    }
.end annotation


# static fields
.field private static _flight:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFlight(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/FlightKt;->_flight:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Flight"

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
    const v0, 0x416947ae    # 14.58f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41a80000    # 21.0f

    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v17, -0x41051eb8    # -0.49f

    .line 79
    .line 80
    .line 81
    const v18, -0x409c28f6    # -0.89f

    .line 82
    .line 83
    .line 84
    const/4 v13, 0x0

    .line 85
    const v14, -0x4147ae14    # -0.36f

    .line 86
    .line 87
    .line 88
    const v15, -0x41bd70a4    # -0.19f

    .line 89
    .line 90
    .line 91
    const v16, -0x40cf5c29    # -0.69f

    .line 92
    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v0, 0x41100000    # 9.0f

    .line 98
    .line 99
    const/high16 v2, 0x41500000    # 13.0f

    .line 100
    .line 101
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v0, 0x40600000    # 3.5f

    .line 105
    .line 106
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const/high16 v17, -0x40400000    # -1.5f

    .line 110
    .line 111
    const/high16 v18, -0x40400000    # -1.5f

    .line 112
    .line 113
    const v14, -0x40ab851f    # -0.83f

    .line 114
    .line 115
    .line 116
    const v15, -0x40d47ae1    # -0.67f

    .line 117
    .line 118
    .line 119
    const/high16 v16, -0x40400000    # -1.5f

    .line 120
    .line 121
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v0, 0x402ae148    # 2.67f

    .line 125
    .line 126
    .line 127
    const/high16 v2, 0x40600000    # 3.5f

    .line 128
    .line 129
    const/high16 v4, 0x41200000    # 10.0f

    .line 130
    .line 131
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v0, 0x41100000    # 9.0f

    .line 135
    .line 136
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v0, -0x3f0fae14    # -7.51f

    .line 140
    .line 141
    .line 142
    const v2, 0x4096147b    # 4.69f

    .line 143
    .line 144
    .line 145
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v17, -0x41051eb8    # -0.49f

    .line 149
    .line 150
    .line 151
    const v18, 0x3f63d70a    # 0.89f

    .line 152
    .line 153
    .line 154
    const v13, -0x41666666    # -0.3f

    .line 155
    .line 156
    .line 157
    const v14, 0x3e428f5c    # 0.19f

    .line 158
    .line 159
    .line 160
    const v15, -0x41051eb8    # -0.49f

    .line 161
    .line 162
    .line 163
    const v16, 0x3f07ae14    # 0.53f

    .line 164
    .line 165
    .line 166
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v17, 0x3fae147b    # 1.36f

    .line 170
    .line 171
    .line 172
    const/high16 v18, 0x3f800000    # 1.0f

    .line 173
    .line 174
    const/4 v13, 0x0

    .line 175
    const v14, 0x3f333333    # 0.7f

    .line 176
    .line 177
    .line 178
    const v15, 0x3f2e147b    # 0.68f

    .line 179
    .line 180
    .line 181
    const v16, 0x3f9ae148    # 1.21f

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v0, 0x41580000    # 13.5f

    .line 188
    .line 189
    const/high16 v2, 0x41200000    # 10.0f

    .line 190
    .line 191
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v0, 0x41980000    # 19.0f

    .line 195
    .line 196
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v0, -0x4019999a    # -1.8f

    .line 200
    .line 201
    .line 202
    const v2, 0x3faccccd    # 1.35f

    .line 203
    .line 204
    .line 205
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const v17, -0x41b33333    # -0.2f

    .line 209
    .line 210
    .line 211
    const v18, 0x3ecccccd    # 0.4f

    .line 212
    .line 213
    .line 214
    const v13, -0x41fae148    # -0.13f

    .line 215
    .line 216
    .line 217
    const v14, 0x3db851ec    # 0.09f

    .line 218
    .line 219
    .line 220
    const v15, -0x41b33333    # -0.2f

    .line 221
    .line 222
    .line 223
    const v16, 0x3e75c28f    # 0.24f

    .line 224
    .line 225
    .line 226
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v0, 0x3f170a3d    # 0.59f

    .line 230
    .line 231
    .line 232
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v17, 0x3f23d70a    # 0.64f

    .line 236
    .line 237
    .line 238
    const v18, 0x3ef5c28f    # 0.48f

    .line 239
    .line 240
    .line 241
    const/4 v13, 0x0

    .line 242
    const v14, 0x3ea8f5c3    # 0.33f

    .line 243
    .line 244
    .line 245
    const v15, 0x3ea3d70a    # 0.32f

    .line 246
    .line 247
    .line 248
    const v16, 0x3f11eb85    # 0.57f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v0, 0x41380000    # 11.5f

    .line 255
    .line 256
    const/high16 v2, 0x41a80000    # 21.0f

    .line 257
    .line 258
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v0, 0x40370a3d    # 2.86f

    .line 262
    .line 263
    .line 264
    const v2, 0x3f51eb85    # 0.82f

    .line 265
    .line 266
    .line 267
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v18, -0x410a3d71    # -0.48f

    .line 271
    .line 272
    .line 273
    const v13, 0x3ea3d70a    # 0.32f

    .line 274
    .line 275
    .line 276
    const v14, 0x3db851ec    # 0.09f

    .line 277
    .line 278
    .line 279
    const v15, 0x3f23d70a    # 0.64f

    .line 280
    .line 281
    .line 282
    const v16, -0x41e66666    # -0.15f

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v0, -0x40e8f5c3    # -0.59f

    .line 289
    .line 290
    .line 291
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v17, -0x41b33333    # -0.2f

    .line 295
    .line 296
    .line 297
    const v18, -0x41333333    # -0.4f

    .line 298
    .line 299
    .line 300
    const/4 v13, 0x0

    .line 301
    const v14, -0x41dc28f6    # -0.16f

    .line 302
    .line 303
    .line 304
    const v15, -0x4270a3d7    # -0.07f

    .line 305
    .line 306
    .line 307
    const v16, -0x416147ae    # -0.31f

    .line 308
    .line 309
    .line 310
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/high16 v0, 0x41980000    # 19.0f

    .line 314
    .line 315
    const/high16 v2, 0x41500000    # 13.0f

    .line 316
    .line 317
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/high16 v0, -0x3f500000    # -5.5f

    .line 321
    .line 322
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const v0, 0x40d47ae1    # 6.64f

    .line 326
    .line 327
    .line 328
    const v2, 0x40051eb8    # 2.08f

    .line 329
    .line 330
    .line 331
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v17, 0x3fae147b    # 1.36f

    .line 335
    .line 336
    .line 337
    const/high16 v18, -0x40800000    # -1.0f

    .line 338
    .line 339
    const v13, 0x3f2e147b    # 0.68f

    .line 340
    .line 341
    .line 342
    const v14, 0x3e570a3d    # 0.21f

    .line 343
    .line 344
    .line 345
    const v15, 0x3fae147b    # 1.36f

    .line 346
    .line 347
    .line 348
    const v16, -0x41666666    # -0.3f

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 358
    .line 359
    .line 360
    move-result-object v2

    .line 361
    const/16 v16, 0x3800

    .line 362
    .line 363
    const/16 v17, 0x0

    .line 364
    .line 365
    const/high16 v6, 0x3f800000    # 1.0f

    .line 366
    .line 367
    const/high16 v8, 0x3f800000    # 1.0f

    .line 368
    .line 369
    const/4 v7, 0x0

    .line 370
    const/high16 v9, 0x3f800000    # 1.0f

    .line 371
    .line 372
    const/high16 v12, 0x3f800000    # 1.0f

    .line 373
    .line 374
    const/4 v13, 0x0

    .line 375
    const/4 v14, 0x0

    .line 376
    const/4 v15, 0x0

    .line 377
    const-string v4, ""

    .line 378
    .line 379
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    sput-object v0, Landroidx/compose/material/icons/rounded/FlightKt;->_flight:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 388
    .line 389
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 390
    .line 391
    .line 392
    return-object v0
.end method
