.class public final Landroidx/compose/material/icons/twotone/SmokingRoomsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_smokingRooms",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SmokingRooms",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getSmokingRooms",
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
        "SMAP\nSmokingRooms.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmokingRooms.kt\nandroidx/compose/material/icons/twotone/SmokingRoomsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,129:1\n212#2,12:130\n233#2,18:143\n253#2:180\n233#2,18:181\n253#2:218\n174#3:142\n705#4,2:161\n717#4,2:163\n719#4,11:169\n705#4,2:199\n717#4,2:201\n719#4,11:207\n72#5,4:165\n72#5,4:203\n*S KotlinDebug\n*F\n+ 1 SmokingRooms.kt\nandroidx/compose/material/icons/twotone/SmokingRoomsKt\n*L\n29#1:130,12\n30#1:143,18\n30#1:180\n77#1:181,18\n77#1:218\n29#1:142\n30#1:161,2\n30#1:163,2\n30#1:169,11\n77#1:199,2\n77#1:201,2\n77#1:207,11\n30#1:165,4\n77#1:203,4\n*E\n"
    }
.end annotation


# static fields
.field private static _smokingRooms:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSmokingRooms(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/SmokingRoomsKt;->_smokingRooms:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.SmokingRooms"

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
    const/high16 v4, 0x40000000    # 2.0f

    .line 71
    .line 72
    const/high16 v6, 0x41800000    # 16.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x41700000    # 15.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x40400000    # 3.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v4, 0x41980000    # 19.0f

    .line 88
    .line 89
    const/high16 v6, 0x40000000    # 2.0f

    .line 90
    .line 91
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 95
    .line 96
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v4, 0x41a40000    # 20.5f

    .line 103
    .line 104
    const/high16 v6, 0x41800000    # 16.0f

    .line 105
    .line 106
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const/high16 v4, 0x41b00000    # 22.0f

    .line 110
    .line 111
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/high16 v4, 0x40400000    # 3.0f

    .line 115
    .line 116
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v4, -0x40400000    # -1.5f

    .line 120
    .line 121
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 125
    .line 126
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/high16 v4, 0x41900000    # 18.0f

    .line 133
    .line 134
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 138
    .line 139
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v4, 0x40400000    # 3.0f

    .line 143
    .line 144
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v4, 0x41980000    # 19.0f

    .line 148
    .line 149
    const/high16 v6, 0x41900000    # 18.0f

    .line 150
    .line 151
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 155
    .line 156
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v4, 0x40f75c29    # 7.73f

    .line 163
    .line 164
    .line 165
    const v6, 0x4196cccd    # 18.85f

    .line 166
    .line 167
    .line 168
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v25, 0x3f800000    # 1.0f

    .line 172
    .line 173
    const v26, -0x3fe7ae14    # -2.38f

    .line 174
    .line 175
    .line 176
    const v21, 0x3f1eb852    # 0.62f

    .line 177
    .line 178
    .line 179
    const v22, -0x40e3d70a    # -0.61f

    .line 180
    .line 181
    .line 182
    const/high16 v23, 0x3f800000    # 1.0f

    .line 183
    .line 184
    const v24, -0x40466666    # -1.45f

    .line 185
    .line 186
    .line 187
    move-object/from16 v20, v2

    .line 188
    .line 189
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const/high16 v25, 0x41840000    # 16.5f

    .line 193
    .line 194
    const/high16 v26, 0x40000000    # 2.0f

    .line 195
    .line 196
    const v21, 0x419ecccd    # 19.85f

    .line 197
    .line 198
    .line 199
    const/high16 v22, 0x40600000    # 3.5f

    .line 200
    .line 201
    const v23, 0x4192cccd    # 18.35f

    .line 202
    .line 203
    .line 204
    const/high16 v24, 0x40000000    # 2.0f

    .line 205
    .line 206
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 210
    .line 211
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v25, 0x3feccccd    # 1.85f

    .line 215
    .line 216
    .line 217
    const v26, 0x3feccccd    # 1.85f

    .line 218
    .line 219
    .line 220
    const v21, 0x3f828f5c    # 1.02f

    .line 221
    .line 222
    .line 223
    const/16 v22, 0x0

    .line 224
    .line 225
    const v23, 0x3feccccd    # 1.85f

    .line 226
    .line 227
    .line 228
    const v24, 0x3f547ae1    # 0.83f

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v4, 0x41840000    # 16.5f

    .line 235
    .line 236
    const v6, 0x418c28f6    # 17.52f

    .line 237
    .line 238
    .line 239
    const v7, 0x40e66666    # 7.2f

    .line 240
    .line 241
    .line 242
    invoke-virtual {v2, v6, v7, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 246
    .line 247
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v25, 0x40800000    # 4.0f

    .line 251
    .line 252
    const v26, 0x40823d71    # 4.07f

    .line 253
    .line 254
    .line 255
    const v21, 0x400f5c29    # 2.24f

    .line 256
    .line 257
    .line 258
    const/high16 v23, 0x40800000    # 4.0f

    .line 259
    .line 260
    const v24, 0x3fea3d71    # 1.83f

    .line 261
    .line 262
    .line 263
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v4, 0x41a40000    # 20.5f

    .line 267
    .line 268
    const/high16 v6, 0x41700000    # 15.0f

    .line 269
    .line 270
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v4, 0x41b00000    # 22.0f

    .line 274
    .line 275
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v4, -0x3ff0a3d7    # -2.24f

    .line 279
    .line 280
    .line 281
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v25, -0x3fb66666    # -3.15f

    .line 285
    .line 286
    .line 287
    const v26, -0x3f5f0a3d    # -5.03f

    .line 288
    .line 289
    .line 290
    const/16 v21, 0x0

    .line 291
    .line 292
    const v22, -0x3ff1eb85    # -2.22f

    .line 293
    .line 294
    .line 295
    const v23, -0x405c28f6    # -1.28f

    .line 296
    .line 297
    .line 298
    const v24, -0x3f7b851f    # -4.14f

    .line 299
    .line 300
    .line 301
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v4, 0x41803d71    # 16.03f

    .line 308
    .line 309
    .line 310
    const v6, 0x41233333    # 10.2f

    .line 311
    .line 312
    .line 313
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const/high16 v4, 0x41680000    # 14.5f

    .line 317
    .line 318
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v25, -0x40133333    # -1.85f

    .line 322
    .line 323
    .line 324
    const/high16 v26, -0x40000000    # -2.0f

    .line 325
    .line 326
    const v21, -0x407d70a4    # -1.02f

    .line 327
    .line 328
    .line 329
    const/16 v22, 0x0

    .line 330
    .line 331
    const v23, -0x40133333    # -1.85f

    .line 332
    .line 333
    .line 334
    const v24, -0x40851eb8    # -0.98f

    .line 335
    .line 336
    .line 337
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const v4, 0x3f547ae1    # 0.83f

    .line 341
    .line 342
    .line 343
    const v6, 0x3feccccd    # 1.85f

    .line 344
    .line 345
    .line 346
    const/high16 v7, -0x40200000    # -1.75f

    .line 347
    .line 348
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const/high16 v4, -0x40400000    # -1.5f

    .line 352
    .line 353
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v25, -0x3fa9999a    # -3.35f

    .line 357
    .line 358
    .line 359
    const v26, 0x40566666    # 3.35f

    .line 360
    .line 361
    .line 362
    const v21, -0x40133333    # -1.85f

    .line 363
    .line 364
    .line 365
    const v23, -0x3fa9999a    # -3.35f

    .line 366
    .line 367
    .line 368
    const/high16 v24, 0x3fc00000    # 1.5f

    .line 369
    .line 370
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v4, 0x40566666    # 3.35f

    .line 374
    .line 375
    .line 376
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 377
    .line 378
    invoke-virtual {v2, v6, v4, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v4, 0x3fc3d70a    # 1.53f

    .line 382
    .line 383
    .line 384
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v25, 0x3ffc28f6    # 1.97f

    .line 388
    .line 389
    .line 390
    const v26, 0x40033333    # 2.05f

    .line 391
    .line 392
    .line 393
    const v21, 0x3f866666    # 1.05f

    .line 394
    .line 395
    .line 396
    const v23, 0x3ffc28f6    # 1.97f

    .line 397
    .line 398
    .line 399
    const v24, 0x3f3d70a4    # 0.74f

    .line 400
    .line 401
    .line 402
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v4, 0x41900000    # 18.0f

    .line 406
    .line 407
    const/high16 v6, 0x41700000    # 15.0f

    .line 408
    .line 409
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 413
    .line 414
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const v4, -0x402e147b    # -1.64f

    .line 418
    .line 419
    .line 420
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v25, -0x3fa1eb85    # -3.47f

    .line 424
    .line 425
    .line 426
    const v26, -0x3fb5c28f    # -3.16f

    .line 427
    .line 428
    .line 429
    const/16 v21, 0x0

    .line 430
    .line 431
    const v22, -0x401851ec    # -1.81f

    .line 432
    .line 433
    .line 434
    const v23, -0x40333333    # -1.6f

    .line 435
    .line 436
    .line 437
    const v24, -0x3fb5c28f    # -3.16f

    .line 438
    .line 439
    .line 440
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 447
    .line 448
    .line 449
    move-result-object v2

    .line 450
    const/16 v16, 0x3800

    .line 451
    .line 452
    const/16 v17, 0x0

    .line 453
    .line 454
    const v6, 0x3e99999a    # 0.3f

    .line 455
    .line 456
    .line 457
    const v8, 0x3e99999a    # 0.3f

    .line 458
    .line 459
    .line 460
    const/4 v7, 0x0

    .line 461
    const/high16 v9, 0x3f800000    # 1.0f

    .line 462
    .line 463
    const/high16 v12, 0x3f800000    # 1.0f

    .line 464
    .line 465
    const/4 v13, 0x0

    .line 466
    const/4 v14, 0x0

    .line 467
    const/4 v15, 0x0

    .line 468
    const-string v4, ""

    .line 469
    .line 470
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 471
    .line 472
    .line 473
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 474
    .line 475
    .line 476
    move-result v3

    .line 477
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 478
    .line 479
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 480
    .line 481
    .line 482
    move-result-wide v6

    .line 483
    const/4 v0, 0x0

    .line 484
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 485
    .line 486
    .line 487
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 488
    .line 489
    .line 490
    move-result v10

    .line 491
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 492
    .line 493
    .line 494
    move-result v11

    .line 495
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 498
    .line 499
    .line 500
    const/high16 v0, 0x40000000    # 2.0f

    .line 501
    .line 502
    const/high16 v2, 0x41800000    # 16.0f

    .line 503
    .line 504
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const/high16 v0, 0x41700000    # 15.0f

    .line 508
    .line 509
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const/high16 v0, 0x40400000    # 3.0f

    .line 513
    .line 514
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const/high16 v0, 0x41980000    # 19.0f

    .line 518
    .line 519
    const/high16 v2, 0x40000000    # 2.0f

    .line 520
    .line 521
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 525
    .line 526
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const/high16 v0, 0x41a40000    # 20.5f

    .line 533
    .line 534
    const/high16 v2, 0x41800000    # 16.0f

    .line 535
    .line 536
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const/high16 v0, 0x41b00000    # 22.0f

    .line 540
    .line 541
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const/high16 v0, 0x40400000    # 3.0f

    .line 545
    .line 546
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const/high16 v0, -0x40400000    # -1.5f

    .line 550
    .line 551
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 555
    .line 556
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const/high16 v0, 0x41900000    # 18.0f

    .line 563
    .line 564
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 568
    .line 569
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const/high16 v0, 0x40400000    # 3.0f

    .line 573
    .line 574
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const/high16 v0, 0x41980000    # 19.0f

    .line 578
    .line 579
    const/high16 v2, 0x41900000    # 18.0f

    .line 580
    .line 581
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 585
    .line 586
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const v0, 0x40f75c29    # 7.73f

    .line 593
    .line 594
    .line 595
    const v2, 0x4196cccd    # 18.85f

    .line 596
    .line 597
    .line 598
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    const/high16 v17, 0x3f800000    # 1.0f

    .line 602
    .line 603
    const v18, -0x3fe7ae14    # -2.38f

    .line 604
    .line 605
    .line 606
    const v13, 0x3f1eb852    # 0.62f

    .line 607
    .line 608
    .line 609
    const v14, -0x40e3d70a    # -0.61f

    .line 610
    .line 611
    .line 612
    const/high16 v15, 0x3f800000    # 1.0f

    .line 613
    .line 614
    const v16, -0x40466666    # -1.45f

    .line 615
    .line 616
    .line 617
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const/high16 v17, 0x41840000    # 16.5f

    .line 621
    .line 622
    const/high16 v18, 0x40000000    # 2.0f

    .line 623
    .line 624
    const v13, 0x419ecccd    # 19.85f

    .line 625
    .line 626
    .line 627
    const/high16 v14, 0x40600000    # 3.5f

    .line 628
    .line 629
    const v15, 0x4192cccd    # 18.35f

    .line 630
    .line 631
    .line 632
    const/high16 v16, 0x40000000    # 2.0f

    .line 633
    .line 634
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 638
    .line 639
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const v17, 0x3feccccd    # 1.85f

    .line 643
    .line 644
    .line 645
    const v18, 0x3feccccd    # 1.85f

    .line 646
    .line 647
    .line 648
    const v13, 0x3f828f5c    # 1.02f

    .line 649
    .line 650
    .line 651
    const/4 v14, 0x0

    .line 652
    const v15, 0x3feccccd    # 1.85f

    .line 653
    .line 654
    .line 655
    const v16, 0x3f547ae1    # 0.83f

    .line 656
    .line 657
    .line 658
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    const/high16 v0, 0x41840000    # 16.5f

    .line 662
    .line 663
    const v2, 0x418c28f6    # 17.52f

    .line 664
    .line 665
    .line 666
    const v4, 0x40e66666    # 7.2f

    .line 667
    .line 668
    .line 669
    invoke-virtual {v12, v2, v4, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    .line 672
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 673
    .line 674
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    const/high16 v17, 0x40800000    # 4.0f

    .line 678
    .line 679
    const v18, 0x40823d71    # 4.07f

    .line 680
    .line 681
    .line 682
    const v13, 0x400f5c29    # 2.24f

    .line 683
    .line 684
    .line 685
    const/high16 v15, 0x40800000    # 4.0f

    .line 686
    .line 687
    const v16, 0x3fea3d71    # 1.83f

    .line 688
    .line 689
    .line 690
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 691
    .line 692
    .line 693
    const/high16 v0, 0x41a40000    # 20.5f

    .line 694
    .line 695
    const/high16 v2, 0x41700000    # 15.0f

    .line 696
    .line 697
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    const/high16 v0, 0x41b00000    # 22.0f

    .line 701
    .line 702
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 703
    .line 704
    .line 705
    const v0, -0x3ff0a3d7    # -2.24f

    .line 706
    .line 707
    .line 708
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    const v17, -0x3fb66666    # -3.15f

    .line 712
    .line 713
    .line 714
    const v18, -0x3f5f0a3d    # -5.03f

    .line 715
    .line 716
    .line 717
    const/4 v13, 0x0

    .line 718
    const v14, -0x3ff1eb85    # -2.22f

    .line 719
    .line 720
    .line 721
    const v15, -0x405c28f6    # -1.28f

    .line 722
    .line 723
    .line 724
    const v16, -0x3f7b851f    # -4.14f

    .line 725
    .line 726
    .line 727
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 731
    .line 732
    .line 733
    const v0, 0x41803d71    # 16.03f

    .line 734
    .line 735
    .line 736
    const v2, 0x41233333    # 10.2f

    .line 737
    .line 738
    .line 739
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    const/high16 v0, 0x41680000    # 14.5f

    .line 743
    .line 744
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 745
    .line 746
    .line 747
    const v17, -0x40133333    # -1.85f

    .line 748
    .line 749
    .line 750
    const/high16 v18, -0x40000000    # -2.0f

    .line 751
    .line 752
    const v13, -0x407d70a4    # -1.02f

    .line 753
    .line 754
    .line 755
    const/4 v14, 0x0

    .line 756
    const v15, -0x40133333    # -1.85f

    .line 757
    .line 758
    .line 759
    const v16, -0x40851eb8    # -0.98f

    .line 760
    .line 761
    .line 762
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 763
    .line 764
    .line 765
    const v0, 0x3f547ae1    # 0.83f

    .line 766
    .line 767
    .line 768
    const v2, 0x3feccccd    # 1.85f

    .line 769
    .line 770
    .line 771
    const/high16 v4, -0x40200000    # -1.75f

    .line 772
    .line 773
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 774
    .line 775
    .line 776
    const/high16 v0, -0x40400000    # -1.5f

    .line 777
    .line 778
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 779
    .line 780
    .line 781
    const v17, -0x3fa9999a    # -3.35f

    .line 782
    .line 783
    .line 784
    const v18, 0x40566666    # 3.35f

    .line 785
    .line 786
    .line 787
    const v13, -0x40133333    # -1.85f

    .line 788
    .line 789
    .line 790
    const v15, -0x3fa9999a    # -3.35f

    .line 791
    .line 792
    .line 793
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 794
    .line 795
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 796
    .line 797
    .line 798
    const v0, 0x40566666    # 3.35f

    .line 799
    .line 800
    .line 801
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 802
    .line 803
    invoke-virtual {v12, v2, v0, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 804
    .line 805
    .line 806
    const v0, 0x3fc3d70a    # 1.53f

    .line 807
    .line 808
    .line 809
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 810
    .line 811
    .line 812
    const v17, 0x3ffc28f6    # 1.97f

    .line 813
    .line 814
    .line 815
    const v18, 0x40033333    # 2.05f

    .line 816
    .line 817
    .line 818
    const v13, 0x3f866666    # 1.05f

    .line 819
    .line 820
    .line 821
    const v15, 0x3ffc28f6    # 1.97f

    .line 822
    .line 823
    .line 824
    const v16, 0x3f3d70a4    # 0.74f

    .line 825
    .line 826
    .line 827
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 828
    .line 829
    .line 830
    const/high16 v0, 0x41900000    # 18.0f

    .line 831
    .line 832
    const/high16 v2, 0x41700000    # 15.0f

    .line 833
    .line 834
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 835
    .line 836
    .line 837
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 838
    .line 839
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 840
    .line 841
    .line 842
    const v0, -0x402e147b    # -1.64f

    .line 843
    .line 844
    .line 845
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 846
    .line 847
    .line 848
    const v17, -0x3fa1eb85    # -3.47f

    .line 849
    .line 850
    .line 851
    const v18, -0x3fb5c28f    # -3.16f

    .line 852
    .line 853
    .line 854
    const/4 v13, 0x0

    .line 855
    const v14, -0x401851ec    # -1.81f

    .line 856
    .line 857
    .line 858
    const v15, -0x40333333    # -1.6f

    .line 859
    .line 860
    .line 861
    const v16, -0x3fb5c28f    # -3.16f

    .line 862
    .line 863
    .line 864
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 865
    .line 866
    .line 867
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 868
    .line 869
    .line 870
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 871
    .line 872
    .line 873
    move-result-object v2

    .line 874
    const/16 v16, 0x3800

    .line 875
    .line 876
    const/16 v17, 0x0

    .line 877
    .line 878
    const/high16 v6, 0x3f800000    # 1.0f

    .line 879
    .line 880
    const/high16 v8, 0x3f800000    # 1.0f

    .line 881
    .line 882
    const/4 v7, 0x0

    .line 883
    const/high16 v12, 0x3f800000    # 1.0f

    .line 884
    .line 885
    const/4 v14, 0x0

    .line 886
    const/4 v15, 0x0

    .line 887
    const-string v4, ""

    .line 888
    .line 889
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 890
    .line 891
    .line 892
    move-result-object v0

    .line 893
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 894
    .line 895
    .line 896
    move-result-object v0

    .line 897
    sput-object v0, Landroidx/compose/material/icons/twotone/SmokingRoomsKt;->_smokingRooms:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 898
    .line 899
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 900
    .line 901
    .line 902
    return-object v0
.end method
