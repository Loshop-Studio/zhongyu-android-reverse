.class public final Landroidx/compose/material/icons/twotone/PermContactCalendarKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_permContactCalendar",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "PermContactCalendar",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getPermContactCalendar",
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
        "SMAP\nPermContactCalendar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermContactCalendar.kt\nandroidx/compose/material/icons/twotone/PermContactCalendarKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,117:1\n212#2,12:118\n233#2,18:131\n253#2:168\n233#2,18:169\n253#2:206\n174#3:130\n705#4,2:149\n717#4,2:151\n719#4,11:157\n705#4,2:187\n717#4,2:189\n719#4,11:195\n72#5,4:153\n72#5,4:191\n*S KotlinDebug\n*F\n+ 1 PermContactCalendar.kt\nandroidx/compose/material/icons/twotone/PermContactCalendarKt\n*L\n29#1:118,12\n30#1:131,18\n30#1:168\n52#1:169,18\n52#1:206\n29#1:130\n30#1:149,2\n30#1:151,2\n30#1:157,11\n52#1:187,2\n52#1:189,2\n52#1:195,11\n30#1:153,4\n52#1:191,4\n*E\n"
    }
.end annotation


# static fields
.field private static _permContactCalendar:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPermContactCalendar(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PermContactCalendarKt;->_permContactCalendar:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.PermContactCalendar"

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
    const/high16 v4, 0x41800000    # 16.0f

    .line 71
    .line 72
    const/high16 v6, 0x40a00000    # 5.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40a00000    # 5.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x41600000    # 14.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    .line 90
    const/high16 v4, 0x41980000    # 19.0f

    .line 91
    .line 92
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 96
    .line 97
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v4, 0x40c00000    # 6.0f

    .line 104
    .line 105
    const/high16 v6, 0x41400000    # 12.0f

    .line 106
    .line 107
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const/high16 v25, 0x40400000    # 3.0f

    .line 111
    .line 112
    const/high16 v26, 0x40400000    # 3.0f

    .line 113
    .line 114
    const v21, 0x3fd33333    # 1.65f

    .line 115
    .line 116
    .line 117
    const/16 v22, 0x0

    .line 118
    .line 119
    const/high16 v23, 0x40400000    # 3.0f

    .line 120
    .line 121
    const v24, 0x3faccccd    # 1.35f

    .line 122
    .line 123
    .line 124
    move-object/from16 v20, v2

    .line 125
    .line 126
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v4, -0x40533333    # -1.35f

    .line 130
    .line 131
    .line 132
    const/high16 v6, 0x40400000    # 3.0f

    .line 133
    .line 134
    const/high16 v7, -0x3fc00000    # -3.0f

    .line 135
    .line 136
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v6, -0x3fc00000    # -3.0f

    .line 140
    .line 141
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v4, 0x3faccccd    # 1.35f

    .line 145
    .line 146
    .line 147
    const/high16 v6, 0x40400000    # 3.0f

    .line 148
    .line 149
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const/high16 v4, 0x41900000    # 18.0f

    .line 156
    .line 157
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const/high16 v4, 0x40c00000    # 6.0f

    .line 161
    .line 162
    const/high16 v6, 0x41900000    # 18.0f

    .line 163
    .line 164
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v4, -0x403c28f6    # -1.53f

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v25, 0x40c00000    # 6.0f

    .line 174
    .line 175
    const v26, -0x3f9ae148    # -3.58f

    .line 176
    .line 177
    .line 178
    const/16 v21, 0x0

    .line 179
    .line 180
    const/high16 v22, -0x3fe00000    # -2.5f

    .line 181
    .line 182
    const v23, 0x407e147b    # 3.97f

    .line 183
    .line 184
    .line 185
    const v24, -0x3f9ae148    # -3.58f

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v4, 0x3f8a3d71    # 1.08f

    .line 192
    .line 193
    .line 194
    const v6, 0x40651eb8    # 3.58f

    .line 195
    .line 196
    .line 197
    const/high16 v7, 0x40c00000    # 6.0f

    .line 198
    .line 199
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v4, 0x41900000    # 18.0f

    .line 203
    .line 204
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    const/16 v16, 0x3800

    .line 215
    .line 216
    const/16 v17, 0x0

    .line 217
    .line 218
    const v6, 0x3e99999a    # 0.3f

    .line 219
    .line 220
    .line 221
    const v8, 0x3e99999a    # 0.3f

    .line 222
    .line 223
    .line 224
    const/4 v7, 0x0

    .line 225
    const/high16 v9, 0x3f800000    # 1.0f

    .line 226
    .line 227
    const/high16 v12, 0x3f800000    # 1.0f

    .line 228
    .line 229
    const/4 v13, 0x0

    .line 230
    const/4 v14, 0x0

    .line 231
    const/4 v15, 0x0

    .line 232
    const-string v4, ""

    .line 233
    .line 234
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 235
    .line 236
    .line 237
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 242
    .line 243
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 244
    .line 245
    .line 246
    move-result-wide v6

    .line 247
    const/4 v0, 0x0

    .line 248
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 252
    .line 253
    .line 254
    move-result v10

    .line 255
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 256
    .line 257
    .line 258
    move-result v11

    .line 259
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 262
    .line 263
    .line 264
    const v0, 0x41a6b852    # 20.84f

    .line 265
    .line 266
    .line 267
    const v2, 0x40870a3d    # 4.22f

    .line 268
    .line 269
    .line 270
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v17, -0x41c7ae14    # -0.18f

    .line 274
    .line 275
    .line 276
    const v18, -0x4151eb85    # -0.34f

    .line 277
    .line 278
    .line 279
    const v13, -0x42b33333    # -0.05f

    .line 280
    .line 281
    .line 282
    const v14, -0x420a3d71    # -0.12f

    .line 283
    .line 284
    .line 285
    const v15, -0x421eb852    # -0.11f

    .line 286
    .line 287
    .line 288
    const v16, -0x41947ae1    # -0.23f

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v17, -0x40f5c28f    # -0.54f

    .line 295
    .line 296
    .line 297
    const v18, -0x40f5c28f    # -0.54f

    .line 298
    .line 299
    .line 300
    const v13, -0x41f0a3d7    # -0.14f

    .line 301
    .line 302
    .line 303
    const v14, -0x41a8f5c3    # -0.21f

    .line 304
    .line 305
    .line 306
    const v15, -0x41570a3d    # -0.33f

    .line 307
    .line 308
    .line 309
    const v16, -0x41333333    # -0.4f

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v17, -0x4151eb85    # -0.34f

    .line 316
    .line 317
    .line 318
    const v18, -0x41c7ae14    # -0.18f

    .line 319
    .line 320
    .line 321
    const v13, -0x421eb852    # -0.11f

    .line 322
    .line 323
    .line 324
    const v14, -0x4270a3d7    # -0.07f

    .line 325
    .line 326
    .line 327
    const v15, -0x419eb852    # -0.22f

    .line 328
    .line 329
    .line 330
    const v16, -0x41fae148    # -0.13f

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v17, -0x40b851ec    # -0.78f

    .line 337
    .line 338
    .line 339
    const v18, -0x41dc28f6    # -0.16f

    .line 340
    .line 341
    .line 342
    const v13, -0x418a3d71    # -0.24f

    .line 343
    .line 344
    .line 345
    const v14, -0x42333333    # -0.1f

    .line 346
    .line 347
    .line 348
    const/high16 v15, -0x41000000    # -0.5f

    .line 349
    .line 350
    const v16, -0x41dc28f6    # -0.16f

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/high16 v0, -0x40800000    # -1.0f

    .line 357
    .line 358
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const/high16 v0, 0x3f800000    # 1.0f

    .line 362
    .line 363
    const/high16 v2, 0x41900000    # 18.0f

    .line 364
    .line 365
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const/high16 v0, -0x40000000    # -2.0f

    .line 369
    .line 370
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const/high16 v0, 0x40000000    # 2.0f

    .line 374
    .line 375
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v0, 0x41000000    # 8.0f

    .line 379
    .line 380
    const/high16 v2, 0x40400000    # 3.0f

    .line 381
    .line 382
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v2, 0x3f800000    # 1.0f

    .line 386
    .line 387
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v0, 0x3f800000    # 1.0f

    .line 391
    .line 392
    const/high16 v2, 0x40c00000    # 6.0f

    .line 393
    .line 394
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const/high16 v0, 0x40000000    # 2.0f

    .line 398
    .line 399
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const/high16 v0, 0x40400000    # 3.0f

    .line 403
    .line 404
    const/high16 v2, 0x40a00000    # 5.0f

    .line 405
    .line 406
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v17, -0x4070a3d7    # -1.12f

    .line 410
    .line 411
    .line 412
    const v18, 0x3eae147b    # 0.34f

    .line 413
    .line 414
    .line 415
    const v13, -0x4128f5c3    # -0.42f

    .line 416
    .line 417
    .line 418
    const/4 v14, 0x0

    .line 419
    const v15, -0x40b33333    # -0.8f

    .line 420
    .line 421
    .line 422
    const v16, 0x3e051eb8    # 0.13f

    .line 423
    .line 424
    .line 425
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const v17, -0x40f5c28f    # -0.54f

    .line 429
    .line 430
    .line 431
    const v18, 0x3f0a3d71    # 0.54f

    .line 432
    .line 433
    .line 434
    const v13, -0x41a8f5c3    # -0.21f

    .line 435
    .line 436
    .line 437
    const v14, 0x3e0f5c29    # 0.14f

    .line 438
    .line 439
    .line 440
    const v15, -0x41333333    # -0.4f

    .line 441
    .line 442
    .line 443
    const v16, 0x3ea8f5c3    # 0.33f

    .line 444
    .line 445
    .line 446
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v17, -0x41c7ae14    # -0.18f

    .line 450
    .line 451
    .line 452
    const v18, 0x3eae147b    # 0.34f

    .line 453
    .line 454
    .line 455
    const v13, -0x4270a3d7    # -0.07f

    .line 456
    .line 457
    .line 458
    const v14, 0x3de147ae    # 0.11f

    .line 459
    .line 460
    .line 461
    const v15, -0x41fae148    # -0.13f

    .line 462
    .line 463
    .line 464
    const v16, 0x3e6147ae    # 0.22f

    .line 465
    .line 466
    .line 467
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v17, -0x41dc28f6    # -0.16f

    .line 471
    .line 472
    .line 473
    const v18, 0x3f47ae14    # 0.78f

    .line 474
    .line 475
    .line 476
    const v13, -0x42333333    # -0.1f

    .line 477
    .line 478
    .line 479
    const v14, 0x3e75c28f    # 0.24f

    .line 480
    .line 481
    .line 482
    const v15, -0x41dc28f6    # -0.16f

    .line 483
    .line 484
    .line 485
    const/high16 v16, 0x3f000000    # 0.5f

    .line 486
    .line 487
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v0, 0x41600000    # 14.0f

    .line 491
    .line 492
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const/high16 v17, 0x40000000    # 2.0f

    .line 496
    .line 497
    const/high16 v18, 0x40000000    # 2.0f

    .line 498
    .line 499
    const/4 v13, 0x0

    .line 500
    const v14, 0x3f8ccccd    # 1.1f

    .line 501
    .line 502
    .line 503
    const v15, 0x3f63d70a    # 0.89f

    .line 504
    .line 505
    .line 506
    const/high16 v16, 0x40000000    # 2.0f

    .line 507
    .line 508
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const v17, 0x3f47ae14    # 0.78f

    .line 515
    .line 516
    .line 517
    const v18, -0x41dc28f6    # -0.16f

    .line 518
    .line 519
    .line 520
    const v13, 0x3e8f5c29    # 0.28f

    .line 521
    .line 522
    .line 523
    const/4 v14, 0x0

    .line 524
    const v15, 0x3f0a3d71    # 0.54f

    .line 525
    .line 526
    .line 527
    const v16, -0x428a3d71    # -0.06f

    .line 528
    .line 529
    .line 530
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const v17, 0x3eae147b    # 0.34f

    .line 534
    .line 535
    .line 536
    const v18, -0x41c7ae14    # -0.18f

    .line 537
    .line 538
    .line 539
    const v13, 0x3df5c28f    # 0.12f

    .line 540
    .line 541
    .line 542
    const v14, -0x42b33333    # -0.05f

    .line 543
    .line 544
    .line 545
    const v15, 0x3e6b851f    # 0.23f

    .line 546
    .line 547
    .line 548
    const v16, -0x421eb852    # -0.11f

    .line 549
    .line 550
    .line 551
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const v17, 0x3f0a3d71    # 0.54f

    .line 555
    .line 556
    .line 557
    const v18, -0x40f5c28f    # -0.54f

    .line 558
    .line 559
    .line 560
    const v13, 0x3e570a3d    # 0.21f

    .line 561
    .line 562
    .line 563
    const v14, -0x41f0a3d7    # -0.14f

    .line 564
    .line 565
    .line 566
    const v15, 0x3ecccccd    # 0.4f

    .line 567
    .line 568
    .line 569
    const v16, -0x41570a3d    # -0.33f

    .line 570
    .line 571
    .line 572
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const v17, 0x3eae147b    # 0.34f

    .line 576
    .line 577
    .line 578
    const v18, -0x4070a3d7    # -1.12f

    .line 579
    .line 580
    .line 581
    const v14, -0x415c28f6    # -0.32f

    .line 582
    .line 583
    .line 584
    const v15, 0x3eae147b    # 0.34f

    .line 585
    .line 586
    .line 587
    const v16, -0x40ca3d71    # -0.71f

    .line 588
    .line 589
    .line 590
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const/high16 v0, 0x41a80000    # 21.0f

    .line 594
    .line 595
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const v17, -0x41dc28f6    # -0.16f

    .line 599
    .line 600
    .line 601
    const v18, -0x40b851ec    # -0.78f

    .line 602
    .line 603
    .line 604
    const/4 v13, 0x0

    .line 605
    const v14, -0x4170a3d7    # -0.28f

    .line 606
    .line 607
    .line 608
    const v15, -0x428a3d71    # -0.06f

    .line 609
    .line 610
    .line 611
    const v16, -0x40f5c28f    # -0.54f

    .line 612
    .line 613
    .line 614
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const/high16 v0, 0x41980000    # 19.0f

    .line 621
    .line 622
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const/high16 v0, 0x40a00000    # 5.0f

    .line 629
    .line 630
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const/high16 v0, 0x41600000    # 14.0f

    .line 634
    .line 635
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const v0, 0x414e147b    # 12.88f

    .line 645
    .line 646
    .line 647
    const/high16 v2, 0x41400000    # 12.0f

    .line 648
    .line 649
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    const/high16 v17, -0x3f400000    # -6.0f

    .line 653
    .line 654
    const v18, 0x40651eb8    # 3.58f

    .line 655
    .line 656
    .line 657
    const v13, -0x3ffe147b    # -2.03f

    .line 658
    .line 659
    .line 660
    const/4 v14, 0x0

    .line 661
    const/high16 v15, -0x3f400000    # -6.0f

    .line 662
    .line 663
    const v16, 0x3f8a3d71    # 1.08f

    .line 664
    .line 665
    .line 666
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    const/high16 v0, 0x40c00000    # 6.0f

    .line 670
    .line 671
    const/high16 v2, 0x41900000    # 18.0f

    .line 672
    .line 673
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const/high16 v0, 0x41400000    # 12.0f

    .line 677
    .line 678
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    const v0, -0x403c28f6    # -1.53f

    .line 682
    .line 683
    .line 684
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    const v18, -0x3f9a3d71    # -3.59f

    .line 688
    .line 689
    .line 690
    const/4 v13, 0x0

    .line 691
    const v14, -0x3fdf5c29    # -2.51f

    .line 692
    .line 693
    .line 694
    const v15, -0x3f81eb85    # -3.97f

    .line 695
    .line 696
    .line 697
    const v16, -0x3f9a3d71    # -3.59f

    .line 698
    .line 699
    .line 700
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    const v0, 0x4104f5c3    # 8.31f

    .line 707
    .line 708
    .line 709
    const/high16 v2, 0x41800000    # 16.0f

    .line 710
    .line 711
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    const v17, 0x406c28f6    # 3.69f

    .line 715
    .line 716
    .line 717
    const v18, -0x4070a3d7    # -1.12f

    .line 718
    .line 719
    .line 720
    const v13, 0x3f30a3d7    # 0.69f

    .line 721
    .line 722
    .line 723
    const v14, -0x40f0a3d7    # -0.56f

    .line 724
    .line 725
    .line 726
    const v15, 0x401851ec    # 2.38f

    .line 727
    .line 728
    .line 729
    const v16, -0x4070a3d7    # -1.12f

    .line 730
    .line 731
    .line 732
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 733
    .line 734
    .line 735
    const v0, 0x406c28f6    # 3.69f

    .line 736
    .line 737
    .line 738
    const v2, 0x3f8f5c29    # 1.12f

    .line 739
    .line 740
    .line 741
    const v4, 0x4040a3d7    # 3.01f

    .line 742
    .line 743
    .line 744
    const v6, 0x3f0f5c29    # 0.56f

    .line 745
    .line 746
    .line 747
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 748
    .line 749
    .line 750
    const v0, 0x4104f5c3    # 8.31f

    .line 751
    .line 752
    .line 753
    const/high16 v2, 0x41800000    # 16.0f

    .line 754
    .line 755
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 756
    .line 757
    .line 758
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 759
    .line 760
    .line 761
    const/high16 v0, 0x41400000    # 12.0f

    .line 762
    .line 763
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 764
    .line 765
    .line 766
    const/high16 v17, 0x40400000    # 3.0f

    .line 767
    .line 768
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 769
    .line 770
    const v13, 0x3fd33333    # 1.65f

    .line 771
    .line 772
    .line 773
    const/4 v14, 0x0

    .line 774
    const/high16 v15, 0x40400000    # 3.0f

    .line 775
    .line 776
    const v16, -0x40533333    # -1.35f

    .line 777
    .line 778
    .line 779
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 780
    .line 781
    .line 782
    const v0, -0x40533333    # -1.35f

    .line 783
    .line 784
    .line 785
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 786
    .line 787
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 788
    .line 789
    .line 790
    const v0, 0x3faccccd    # 1.35f

    .line 791
    .line 792
    .line 793
    const/high16 v2, 0x40400000    # 3.0f

    .line 794
    .line 795
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 796
    .line 797
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 798
    .line 799
    .line 800
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 801
    .line 802
    .line 803
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 804
    .line 805
    .line 806
    const/high16 v0, 0x41000000    # 8.0f

    .line 807
    .line 808
    const/high16 v2, 0x41400000    # 12.0f

    .line 809
    .line 810
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 811
    .line 812
    .line 813
    const/high16 v17, 0x3f800000    # 1.0f

    .line 814
    .line 815
    const/high16 v18, 0x3f800000    # 1.0f

    .line 816
    .line 817
    const v13, 0x3f0ccccd    # 0.55f

    .line 818
    .line 819
    .line 820
    const/high16 v15, 0x3f800000    # 1.0f

    .line 821
    .line 822
    const v16, 0x3ee66666    # 0.45f

    .line 823
    .line 824
    .line 825
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 826
    .line 827
    .line 828
    const v0, -0x4119999a    # -0.45f

    .line 829
    .line 830
    .line 831
    const/high16 v2, 0x3f800000    # 1.0f

    .line 832
    .line 833
    const/high16 v4, -0x40800000    # -1.0f

    .line 834
    .line 835
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 836
    .line 837
    .line 838
    const/high16 v2, -0x40800000    # -1.0f

    .line 839
    .line 840
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 841
    .line 842
    .line 843
    const v0, 0x3ee66666    # 0.45f

    .line 844
    .line 845
    .line 846
    const/high16 v2, 0x3f800000    # 1.0f

    .line 847
    .line 848
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 849
    .line 850
    .line 851
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 852
    .line 853
    .line 854
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 855
    .line 856
    .line 857
    move-result-object v2

    .line 858
    const/16 v16, 0x3800

    .line 859
    .line 860
    const/16 v17, 0x0

    .line 861
    .line 862
    const/high16 v6, 0x3f800000    # 1.0f

    .line 863
    .line 864
    const/high16 v8, 0x3f800000    # 1.0f

    .line 865
    .line 866
    const/4 v7, 0x0

    .line 867
    const/high16 v12, 0x3f800000    # 1.0f

    .line 868
    .line 869
    const/4 v13, 0x0

    .line 870
    const/4 v15, 0x0

    .line 871
    const-string v4, ""

    .line 872
    .line 873
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 874
    .line 875
    .line 876
    move-result-object v0

    .line 877
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 878
    .line 879
    .line 880
    move-result-object v0

    .line 881
    sput-object v0, Landroidx/compose/material/icons/twotone/PermContactCalendarKt;->_permContactCalendar:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 882
    .line 883
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 884
    .line 885
    .line 886
    return-object v0
.end method
