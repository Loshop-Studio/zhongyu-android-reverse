.class public final Landroidx/compose/material/icons/rounded/ContactEmergencyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_contactEmergency",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "ContactEmergency",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getContactEmergency",
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
        "SMAP\nContactEmergency.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContactEmergency.kt\nandroidx/compose/material/icons/rounded/ContactEmergencyKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,90:1\n212#2,12:91\n233#2,18:104\n253#2:141\n174#3:103\n705#4,2:122\n717#4,2:124\n719#4,11:130\n72#5,4:126\n*S KotlinDebug\n*F\n+ 1 ContactEmergency.kt\nandroidx/compose/material/icons/rounded/ContactEmergencyKt\n*L\n29#1:91,12\n30#1:104,18\n30#1:141\n29#1:103\n30#1:122,2\n30#1:124,2\n30#1:130,11\n30#1:126,4\n*E\n"
    }
.end annotation


# static fields
.field private static _contactEmergency:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getContactEmergency(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ContactEmergencyKt;->_contactEmergency:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.ContactEmergency"

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
    const/high16 v0, 0x41b00000    # 22.0f

    .line 71
    .line 72
    const/high16 v2, 0x40400000    # 3.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40000000    # 2.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/16 v17, 0x0

    .line 83
    .line 84
    const/high16 v18, 0x40a00000    # 5.0f

    .line 85
    .line 86
    const v13, 0x3f666666    # 0.9f

    .line 87
    .line 88
    .line 89
    const/high16 v14, 0x40400000    # 3.0f

    .line 90
    .line 91
    const/4 v15, 0x0

    .line 92
    const v16, 0x4079999a    # 3.9f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v0, 0x41600000    # 14.0f

    .line 99
    .line 100
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v17, 0x40000000    # 2.0f

    .line 104
    .line 105
    const/high16 v18, 0x40000000    # 2.0f

    .line 106
    .line 107
    const/4 v13, 0x0

    .line 108
    const v14, 0x3f8ccccd    # 1.1f

    .line 109
    .line 110
    .line 111
    const v15, 0x3f666666    # 0.9f

    .line 112
    .line 113
    .line 114
    const/high16 v16, 0x40000000    # 2.0f

    .line 115
    .line 116
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v0, 0x41a00000    # 20.0f

    .line 120
    .line 121
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v17, 0x3ffeb852    # 1.99f

    .line 125
    .line 126
    .line 127
    const/high16 v18, -0x40000000    # -2.0f

    .line 128
    .line 129
    const v13, 0x3f8ccccd    # 1.1f

    .line 130
    .line 131
    .line 132
    const/4 v14, 0x0

    .line 133
    const v15, 0x3ffeb852    # 1.99f

    .line 134
    .line 135
    .line 136
    const v16, -0x4099999a    # -0.9f

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v0, 0x40a00000    # 5.0f

    .line 143
    .line 144
    const/high16 v2, 0x41c00000    # 24.0f

    .line 145
    .line 146
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v17, 0x41b00000    # 22.0f

    .line 150
    .line 151
    const/high16 v18, 0x40400000    # 3.0f

    .line 152
    .line 153
    const/high16 v13, 0x41c00000    # 24.0f

    .line 154
    .line 155
    const v14, 0x4079999a    # 3.9f

    .line 156
    .line 157
    .line 158
    const v15, 0x41b8cccd    # 23.1f

    .line 159
    .line 160
    .line 161
    const/high16 v16, 0x40400000    # 3.0f

    .line 162
    .line 163
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const/high16 v0, 0x41000000    # 8.0f

    .line 170
    .line 171
    const/high16 v2, 0x41100000    # 9.0f

    .line 172
    .line 173
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/high16 v17, 0x40400000    # 3.0f

    .line 177
    .line 178
    const v13, 0x3fd33333    # 1.65f

    .line 179
    .line 180
    .line 181
    const/4 v14, 0x0

    .line 182
    const/high16 v15, 0x40400000    # 3.0f

    .line 183
    .line 184
    const v16, 0x3faccccd    # 1.35f

    .line 185
    .line 186
    .line 187
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v0, -0x40533333    # -1.35f

    .line 191
    .line 192
    .line 193
    const/high16 v2, 0x40400000    # 3.0f

    .line 194
    .line 195
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 196
    .line 197
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 201
    .line 202
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v0, 0x40eb3333    # 7.35f

    .line 206
    .line 207
    .line 208
    const/high16 v2, 0x41000000    # 8.0f

    .line 209
    .line 210
    const/high16 v4, 0x41100000    # 9.0f

    .line 211
    .line 212
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const/high16 v0, 0x41980000    # 19.0f

    .line 219
    .line 220
    const v2, 0x40051eb8    # 2.08f

    .line 221
    .line 222
    .line 223
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v17, 0x40dd70a4    # 6.92f

    .line 227
    .line 228
    .line 229
    const/high16 v18, -0x3f800000    # -4.0f

    .line 230
    .line 231
    const v13, 0x3fb0a3d7    # 1.38f

    .line 232
    .line 233
    .line 234
    const v14, -0x3fe70a3d    # -2.39f

    .line 235
    .line 236
    .line 237
    const v15, 0x407d70a4    # 3.96f

    .line 238
    .line 239
    .line 240
    const/high16 v16, -0x3f800000    # -4.0f

    .line 241
    .line 242
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const v0, 0x40dd70a4    # 6.92f

    .line 246
    .line 247
    .line 248
    const/high16 v2, 0x40800000    # 4.0f

    .line 249
    .line 250
    const v4, 0x40b147ae    # 5.54f

    .line 251
    .line 252
    .line 253
    const v6, 0x3fce147b    # 1.61f

    .line 254
    .line 255
    .line 256
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v0, 0x40051eb8    # 2.08f

    .line 260
    .line 261
    .line 262
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v0, 0x41280000    # 10.5f

    .line 269
    .line 270
    const v2, 0x41a4cccd    # 20.6f

    .line 271
    .line 272
    .line 273
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v17, -0x407d70a4    # -1.02f

    .line 280
    .line 281
    .line 282
    const v18, 0x3e8a3d71    # 0.27f

    .line 283
    .line 284
    .line 285
    const v13, -0x41a8f5c3    # -0.21f

    .line 286
    .line 287
    .line 288
    const v14, 0x3eb851ec    # 0.36f

    .line 289
    .line 290
    .line 291
    const v15, -0x40d47ae1    # -0.67f

    .line 292
    .line 293
    .line 294
    const v16, 0x3ef5c28f    # 0.48f

    .line 295
    .line 296
    .line 297
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v0, -0x410a3d71    # -0.48f

    .line 301
    .line 302
    .line 303
    const v2, -0x40ae147b    # -0.82f

    .line 304
    .line 305
    .line 306
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v0, 0x3f733333    # 0.95f

    .line 310
    .line 311
    .line 312
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v17, -0x40c00000    # -0.75f

    .line 316
    .line 317
    const/high16 v18, 0x3f400000    # 0.75f

    .line 318
    .line 319
    const/4 v13, 0x0

    .line 320
    const v14, 0x3ed1eb85    # 0.41f

    .line 321
    .line 322
    .line 323
    const v15, -0x4151eb85    # -0.34f

    .line 324
    .line 325
    .line 326
    const/high16 v16, 0x3f400000    # 0.75f

    .line 327
    .line 328
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/4 v0, 0x0

    .line 332
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v18, -0x40c00000    # -0.75f

    .line 336
    .line 337
    const v13, -0x412e147b    # -0.41f

    .line 338
    .line 339
    .line 340
    const/4 v14, 0x0

    .line 341
    const/high16 v15, -0x40c00000    # -0.75f

    .line 342
    .line 343
    const v16, -0x4151eb85    # -0.34f

    .line 344
    .line 345
    .line 346
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v0, 0x4124cccd    # 10.3f

    .line 350
    .line 351
    .line 352
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v0, 0x3ef5c28f    # 0.48f

    .line 356
    .line 357
    .line 358
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v17, -0x407d70a4    # -1.02f

    .line 362
    .line 363
    .line 364
    const v18, -0x4175c28f    # -0.27f

    .line 365
    .line 366
    .line 367
    const v13, -0x4147ae14    # -0.36f

    .line 368
    .line 369
    .line 370
    const v14, 0x3e570a3d    # 0.21f

    .line 371
    .line 372
    .line 373
    const v15, -0x40ae147b    # -0.82f

    .line 374
    .line 375
    .line 376
    const v16, 0x3da3d70a    # 0.08f

    .line 377
    .line 378
    .line 379
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const/4 v0, 0x0

    .line 383
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v17, 0x3e8a3d71    # 0.27f

    .line 387
    .line 388
    .line 389
    const v18, -0x407d70a4    # -1.02f

    .line 390
    .line 391
    .line 392
    const v13, -0x41a8f5c3    # -0.21f

    .line 393
    .line 394
    .line 395
    const v14, -0x4147ae14    # -0.36f

    .line 396
    .line 397
    .line 398
    const v15, -0x425c28f6    # -0.08f

    .line 399
    .line 400
    .line 401
    const v16, -0x40ae147b    # -0.82f

    .line 402
    .line 403
    .line 404
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/high16 v0, 0x41840000    # 16.5f

    .line 408
    .line 409
    const/high16 v2, 0x41100000    # 9.0f

    .line 410
    .line 411
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v0, -0x410a3d71    # -0.48f

    .line 415
    .line 416
    .line 417
    const v2, -0x40ae147b    # -0.82f

    .line 418
    .line 419
    .line 420
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v17, -0x4175c28f    # -0.27f

    .line 424
    .line 425
    .line 426
    const v13, -0x4147ae14    # -0.36f

    .line 427
    .line 428
    .line 429
    const v14, -0x41a8f5c3    # -0.21f

    .line 430
    .line 431
    .line 432
    const v15, -0x410a3d71    # -0.48f

    .line 433
    .line 434
    .line 435
    const v16, -0x40d47ae1    # -0.67f

    .line 436
    .line 437
    .line 438
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/4 v0, 0x0

    .line 442
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const v17, 0x3f828f5c    # 1.02f

    .line 446
    .line 447
    .line 448
    const v18, -0x4175c28f    # -0.27f

    .line 449
    .line 450
    .line 451
    const v13, 0x3e570a3d    # 0.21f

    .line 452
    .line 453
    .line 454
    const v14, -0x4147ae14    # -0.36f

    .line 455
    .line 456
    .line 457
    const v15, 0x3f2b851f    # 0.67f

    .line 458
    .line 459
    .line 460
    const v16, -0x410a3d71    # -0.48f

    .line 461
    .line 462
    .line 463
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const v0, 0x3f51eb85    # 0.82f

    .line 467
    .line 468
    .line 469
    const v2, 0x3ef5c28f    # 0.48f

    .line 470
    .line 471
    .line 472
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const/high16 v0, 0x40d80000    # 6.75f

    .line 476
    .line 477
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const/high16 v17, 0x41900000    # 18.0f

    .line 481
    .line 482
    const/high16 v18, 0x40c00000    # 6.0f

    .line 483
    .line 484
    const/high16 v13, 0x418a0000    # 17.25f

    .line 485
    .line 486
    const v14, 0x40cae148    # 6.34f

    .line 487
    .line 488
    .line 489
    const v15, 0x418cb852    # 17.59f

    .line 490
    .line 491
    .line 492
    const/high16 v16, 0x40c00000    # 6.0f

    .line 493
    .line 494
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const/4 v0, 0x0

    .line 498
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const/high16 v17, 0x3f400000    # 0.75f

    .line 502
    .line 503
    const/high16 v18, 0x3f400000    # 0.75f

    .line 504
    .line 505
    const v13, 0x3ed1eb85    # 0.41f

    .line 506
    .line 507
    .line 508
    const/4 v14, 0x0

    .line 509
    const/high16 v15, 0x3f400000    # 0.75f

    .line 510
    .line 511
    const v16, 0x3eae147b    # 0.34f

    .line 512
    .line 513
    .line 514
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v0, 0x40f66666    # 7.7f

    .line 518
    .line 519
    .line 520
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const v0, 0x3f51eb85    # 0.82f

    .line 524
    .line 525
    .line 526
    const v2, -0x410a3d71    # -0.48f

    .line 527
    .line 528
    .line 529
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const v17, 0x3f828f5c    # 1.02f

    .line 533
    .line 534
    .line 535
    const v18, 0x3e8a3d71    # 0.27f

    .line 536
    .line 537
    .line 538
    const v13, 0x3eb851ec    # 0.36f

    .line 539
    .line 540
    .line 541
    const v14, -0x41a8f5c3    # -0.21f

    .line 542
    .line 543
    .line 544
    const v15, 0x3f51eb85    # 0.82f

    .line 545
    .line 546
    .line 547
    const v16, -0x425c28f6    # -0.08f

    .line 548
    .line 549
    .line 550
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const/4 v0, 0x0

    .line 554
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const v17, -0x4175c28f    # -0.27f

    .line 558
    .line 559
    .line 560
    const v18, 0x3f828f5c    # 1.02f

    .line 561
    .line 562
    .line 563
    const v13, 0x3e570a3d    # 0.21f

    .line 564
    .line 565
    .line 566
    const v14, 0x3eb851ec    # 0.36f

    .line 567
    .line 568
    .line 569
    const v15, 0x3da3d70a    # 0.08f

    .line 570
    .line 571
    .line 572
    const v16, 0x3f51eb85    # 0.82f

    .line 573
    .line 574
    .line 575
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const/high16 v0, 0x419c0000    # 19.5f

    .line 579
    .line 580
    const/high16 v2, 0x41100000    # 9.0f

    .line 581
    .line 582
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const v0, 0x3f51eb85    # 0.82f

    .line 586
    .line 587
    .line 588
    const v2, 0x3ef5c28f    # 0.48f

    .line 589
    .line 590
    .line 591
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const v17, 0x41a4cccd    # 20.6f

    .line 595
    .line 596
    .line 597
    const/high16 v18, 0x41280000    # 10.5f

    .line 598
    .line 599
    const v13, 0x41a570a4    # 20.68f

    .line 600
    .line 601
    .line 602
    const v14, 0x411ae148    # 9.68f

    .line 603
    .line 604
    .line 605
    const v15, 0x41a67ae1    # 20.81f

    .line 606
    .line 607
    .line 608
    const v16, 0x41223d71    # 10.14f

    .line 609
    .line 610
    .line 611
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 618
    .line 619
    .line 620
    move-result-object v2

    .line 621
    const/16 v16, 0x3800

    .line 622
    .line 623
    const/16 v17, 0x0

    .line 624
    .line 625
    const/high16 v6, 0x3f800000    # 1.0f

    .line 626
    .line 627
    const/high16 v8, 0x3f800000    # 1.0f

    .line 628
    .line 629
    const/4 v7, 0x0

    .line 630
    const/high16 v9, 0x3f800000    # 1.0f

    .line 631
    .line 632
    const/high16 v12, 0x3f800000    # 1.0f

    .line 633
    .line 634
    const/4 v13, 0x0

    .line 635
    const/4 v14, 0x0

    .line 636
    const/4 v15, 0x0

    .line 637
    const-string v4, ""

    .line 638
    .line 639
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 640
    .line 641
    .line 642
    move-result-object v0

    .line 643
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 644
    .line 645
    .line 646
    move-result-object v0

    .line 647
    sput-object v0, Landroidx/compose/material/icons/rounded/ContactEmergencyKt;->_contactEmergency:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 648
    .line 649
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 650
    .line 651
    .line 652
    return-object v0
.end method
