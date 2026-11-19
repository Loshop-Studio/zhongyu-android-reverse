.class public final Landroidx/compose/material/icons/twotone/KebabDiningKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_kebabDining",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "KebabDining",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getKebabDining",
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
        "SMAP\nKebabDining.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KebabDining.kt\nandroidx/compose/material/icons/twotone/KebabDiningKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,195:1\n212#2,12:196\n233#2,18:209\n253#2:246\n233#2,18:247\n253#2:284\n174#3:208\n705#4,2:227\n717#4,2:229\n719#4,11:235\n705#4,2:265\n717#4,2:267\n719#4,11:273\n72#5,4:231\n72#5,4:269\n*S KotlinDebug\n*F\n+ 1 KebabDining.kt\nandroidx/compose/material/icons/twotone/KebabDiningKt\n*L\n29#1:196,12\n30#1:209,18\n30#1:246\n76#1:247,18\n76#1:284\n29#1:208\n30#1:227,2\n30#1:229,2\n30#1:235,11\n76#1:265,2\n76#1:267,2\n76#1:273,11\n30#1:231,4\n76#1:269,4\n*E\n"
    }
.end annotation


# static fields
.field private static _kebabDining:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getKebabDining(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/KebabDiningKt;->_kebabDining:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.KebabDining"

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
    const/high16 v4, 0x41780000    # 15.5f

    .line 71
    .line 72
    const/high16 v6, 0x40a00000    # 5.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x41700000    # 15.0f

    .line 78
    .line 79
    const/high16 v26, 0x40900000    # 4.5f

    .line 80
    .line 81
    const v21, 0x4173851f    # 15.22f

    .line 82
    .line 83
    .line 84
    const/high16 v22, 0x40a00000    # 5.0f

    .line 85
    .line 86
    const/high16 v23, 0x41700000    # 15.0f

    .line 87
    .line 88
    const v24, 0x4098f5c3    # 4.78f

    .line 89
    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v4, 0x4173851f    # 15.22f

    .line 97
    .line 98
    .line 99
    const/high16 v6, 0x41780000    # 15.5f

    .line 100
    .line 101
    const/high16 v7, 0x40800000    # 4.0f

    .line 102
    .line 103
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v4, 0x40400000    # 3.0f

    .line 107
    .line 108
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v25, 0x41980000    # 19.0f

    .line 112
    .line 113
    const v21, 0x41963d71    # 18.78f

    .line 114
    .line 115
    .line 116
    const/high16 v22, 0x40800000    # 4.0f

    .line 117
    .line 118
    const/high16 v23, 0x41980000    # 19.0f

    .line 119
    .line 120
    const v24, 0x40870a3d    # 4.22f

    .line 121
    .line 122
    .line 123
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v4, 0x41963d71    # 18.78f

    .line 127
    .line 128
    .line 129
    const/high16 v6, 0x41940000    # 18.5f

    .line 130
    .line 131
    const/high16 v7, 0x40a00000    # 5.0f

    .line 132
    .line 133
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v4, 0x41780000    # 15.5f

    .line 137
    .line 138
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v4, 0x41800000    # 16.0f

    .line 145
    .line 146
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v25, 0x3f000000    # 0.5f

    .line 150
    .line 151
    const/high16 v26, 0x3f000000    # 0.5f

    .line 152
    .line 153
    const v21, 0x3e8f5c29    # 0.28f

    .line 154
    .line 155
    .line 156
    const/16 v22, 0x0

    .line 157
    .line 158
    const/high16 v23, 0x3f000000    # 0.5f

    .line 159
    .line 160
    const v24, 0x3e6147ae    # 0.22f

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v4, 0x41963d71    # 18.78f

    .line 167
    .line 168
    .line 169
    const/high16 v6, 0x41880000    # 17.0f

    .line 170
    .line 171
    const/high16 v7, 0x41940000    # 18.5f

    .line 172
    .line 173
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 177
    .line 178
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v25, -0x41000000    # -0.5f

    .line 182
    .line 183
    const/high16 v26, -0x41000000    # -0.5f

    .line 184
    .line 185
    const v21, -0x4170a3d7    # -0.28f

    .line 186
    .line 187
    .line 188
    const/high16 v23, -0x41000000    # -0.5f

    .line 189
    .line 190
    const v24, -0x419eb852    # -0.22f

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v4, 0x3e6147ae    # 0.22f

    .line 197
    .line 198
    .line 199
    const/high16 v6, 0x3f000000    # 0.5f

    .line 200
    .line 201
    const/high16 v7, -0x41000000    # -0.5f

    .line 202
    .line 203
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v4, 0x41940000    # 18.5f

    .line 207
    .line 208
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const/high16 v4, 0x41200000    # 10.0f

    .line 215
    .line 216
    const/high16 v6, 0x41980000    # 19.0f

    .line 217
    .line 218
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v4, 0x3f800000    # 1.0f

    .line 222
    .line 223
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v4, -0x3f800000    # -4.0f

    .line 227
    .line 228
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const/high16 v4, -0x40800000    # -1.0f

    .line 232
    .line 233
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v4, 0x41980000    # 19.0f

    .line 237
    .line 238
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v4, 0x40b00000    # 5.5f

    .line 245
    .line 246
    const/high16 v6, 0x40a00000    # 5.0f

    .line 247
    .line 248
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v25, 0x40a00000    # 5.0f

    .line 252
    .line 253
    const/high16 v26, 0x40900000    # 4.5f

    .line 254
    .line 255
    const v21, 0x40a70a3d    # 5.22f

    .line 256
    .line 257
    .line 258
    const/high16 v22, 0x40a00000    # 5.0f

    .line 259
    .line 260
    const/high16 v23, 0x40a00000    # 5.0f

    .line 261
    .line 262
    const v24, 0x4098f5c3    # 4.78f

    .line 263
    .line 264
    .line 265
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v4, 0x40a70a3d    # 5.22f

    .line 269
    .line 270
    .line 271
    const/high16 v6, 0x40b00000    # 5.5f

    .line 272
    .line 273
    const/high16 v7, 0x40800000    # 4.0f

    .line 274
    .line 275
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const/high16 v4, 0x40400000    # 3.0f

    .line 279
    .line 280
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const/high16 v25, 0x41100000    # 9.0f

    .line 284
    .line 285
    const v21, 0x410c7ae1    # 8.78f

    .line 286
    .line 287
    .line 288
    const/high16 v22, 0x40800000    # 4.0f

    .line 289
    .line 290
    const/high16 v23, 0x41100000    # 9.0f

    .line 291
    .line 292
    const v24, 0x40870a3d    # 4.22f

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v4, 0x410c7ae1    # 8.78f

    .line 299
    .line 300
    .line 301
    const/high16 v6, 0x41080000    # 8.5f

    .line 302
    .line 303
    const/high16 v7, 0x40a00000    # 5.0f

    .line 304
    .line 305
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v4, 0x40b00000    # 5.5f

    .line 309
    .line 310
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const/high16 v4, 0x41800000    # 16.0f

    .line 317
    .line 318
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v26, 0x41840000    # 16.5f

    .line 322
    .line 323
    const/high16 v22, 0x41800000    # 16.0f

    .line 324
    .line 325
    const v24, 0x4181c28f    # 16.22f

    .line 326
    .line 327
    .line 328
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v4, 0x410c7ae1    # 8.78f

    .line 332
    .line 333
    .line 334
    const/high16 v6, 0x41880000    # 17.0f

    .line 335
    .line 336
    const/high16 v7, 0x41080000    # 8.5f

    .line 337
    .line 338
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 342
    .line 343
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const/high16 v25, 0x40a00000    # 5.0f

    .line 347
    .line 348
    const v21, 0x40a70a3d    # 5.22f

    .line 349
    .line 350
    .line 351
    const/high16 v22, 0x41880000    # 17.0f

    .line 352
    .line 353
    const/high16 v23, 0x40a00000    # 5.0f

    .line 354
    .line 355
    const v24, 0x41863d71    # 16.78f

    .line 356
    .line 357
    .line 358
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v4, 0x40a70a3d    # 5.22f

    .line 362
    .line 363
    .line 364
    const/high16 v6, 0x41800000    # 16.0f

    .line 365
    .line 366
    const/high16 v7, 0x40b00000    # 5.5f

    .line 367
    .line 368
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/high16 v4, 0x41080000    # 8.5f

    .line 372
    .line 373
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const/high16 v4, 0x41100000    # 9.0f

    .line 380
    .line 381
    const/high16 v6, 0x41200000    # 10.0f

    .line 382
    .line 383
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v4, 0x3f800000    # 1.0f

    .line 387
    .line 388
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v4, 0x40a00000    # 5.0f

    .line 392
    .line 393
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v4, -0x40800000    # -1.0f

    .line 397
    .line 398
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/high16 v4, 0x41100000    # 9.0f

    .line 402
    .line 403
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 410
    .line 411
    .line 412
    move-result-object v2

    .line 413
    const/16 v16, 0x3800

    .line 414
    .line 415
    const/16 v17, 0x0

    .line 416
    .line 417
    const v6, 0x3e99999a    # 0.3f

    .line 418
    .line 419
    .line 420
    const v8, 0x3e99999a    # 0.3f

    .line 421
    .line 422
    .line 423
    const/4 v7, 0x0

    .line 424
    const/high16 v9, 0x3f800000    # 1.0f

    .line 425
    .line 426
    const/high16 v12, 0x3f800000    # 1.0f

    .line 427
    .line 428
    const/4 v13, 0x0

    .line 429
    const/4 v14, 0x0

    .line 430
    const/4 v15, 0x0

    .line 431
    const-string v4, ""

    .line 432
    .line 433
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 434
    .line 435
    .line 436
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 437
    .line 438
    .line 439
    move-result v3

    .line 440
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 441
    .line 442
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 443
    .line 444
    .line 445
    move-result-wide v6

    .line 446
    const/4 v0, 0x0

    .line 447
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 448
    .line 449
    .line 450
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 451
    .line 452
    .line 453
    move-result v10

    .line 454
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 455
    .line 456
    .line 457
    move-result v11

    .line 458
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 461
    .line 462
    .line 463
    const/high16 v0, 0x418e0000    # 17.75f

    .line 464
    .line 465
    const/high16 v2, 0x40e00000    # 7.0f

    .line 466
    .line 467
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const/high16 v0, 0x3f400000    # 0.75f

    .line 471
    .line 472
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const/high16 v17, 0x41a80000    # 21.0f

    .line 476
    .line 477
    const/high16 v18, 0x40900000    # 4.5f

    .line 478
    .line 479
    const v13, 0x419f0a3d    # 19.88f

    .line 480
    .line 481
    .line 482
    const/high16 v14, 0x40e00000    # 7.0f

    .line 483
    .line 484
    const/high16 v15, 0x41a80000    # 21.0f

    .line 485
    .line 486
    const v16, 0x40bc28f6    # 5.88f

    .line 487
    .line 488
    .line 489
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const/high16 v17, 0x41940000    # 18.5f

    .line 493
    .line 494
    const/high16 v18, 0x40000000    # 2.0f

    .line 495
    .line 496
    const/high16 v13, 0x41a80000    # 21.0f

    .line 497
    .line 498
    const v14, 0x4047ae14    # 3.12f

    .line 499
    .line 500
    .line 501
    const v15, 0x419f0a3d    # 19.88f

    .line 502
    .line 503
    .line 504
    const/high16 v16, 0x40000000    # 2.0f

    .line 505
    .line 506
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const/high16 v0, -0x40c00000    # -0.75f

    .line 510
    .line 511
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const/high16 v0, 0x3f800000    # 1.0f

    .line 515
    .line 516
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/high16 v0, -0x40400000    # -1.5f

    .line 520
    .line 521
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const/high16 v0, 0x3f800000    # 1.0f

    .line 525
    .line 526
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const/high16 v0, 0x41780000    # 15.5f

    .line 530
    .line 531
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const/high16 v17, 0x41500000    # 13.0f

    .line 535
    .line 536
    const/high16 v18, 0x40900000    # 4.5f

    .line 537
    .line 538
    const v13, 0x4161eb85    # 14.12f

    .line 539
    .line 540
    .line 541
    const/high16 v14, 0x40000000    # 2.0f

    .line 542
    .line 543
    const/high16 v15, 0x41500000    # 13.0f

    .line 544
    .line 545
    const v16, 0x4047ae14    # 3.12f

    .line 546
    .line 547
    .line 548
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const/high16 v17, 0x41780000    # 15.5f

    .line 552
    .line 553
    const/high16 v18, 0x40e00000    # 7.0f

    .line 554
    .line 555
    const/high16 v13, 0x41500000    # 13.0f

    .line 556
    .line 557
    const v14, 0x40bc28f6    # 5.88f

    .line 558
    .line 559
    .line 560
    const v15, 0x4161eb85    # 14.12f

    .line 561
    .line 562
    .line 563
    const/high16 v16, 0x40e00000    # 7.0f

    .line 564
    .line 565
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const/high16 v0, 0x3f400000    # 0.75f

    .line 569
    .line 570
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const/high16 v0, 0x3f800000    # 1.0f

    .line 574
    .line 575
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const/high16 v0, 0x41500000    # 13.0f

    .line 579
    .line 580
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const/high16 v0, 0x40a00000    # 5.0f

    .line 584
    .line 585
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const/high16 v0, 0x40500000    # 3.25f

    .line 589
    .line 590
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const/high16 v0, 0x3f800000    # 1.0f

    .line 594
    .line 595
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const/high16 v0, 0x41780000    # 15.5f

    .line 599
    .line 600
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 604
    .line 605
    const/high16 v18, 0x40200000    # 2.5f

    .line 606
    .line 607
    const v13, -0x404f5c29    # -1.38f

    .line 608
    .line 609
    .line 610
    const/4 v14, 0x0

    .line 611
    const/high16 v15, -0x3fe00000    # -2.5f

    .line 612
    .line 613
    const v16, 0x3f8f5c29    # 1.12f

    .line 614
    .line 615
    .line 616
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const/high16 v17, 0x40200000    # 2.5f

    .line 620
    .line 621
    const/4 v13, 0x0

    .line 622
    const v14, 0x3fb0a3d7    # 1.38f

    .line 623
    .line 624
    .line 625
    const v15, 0x3f8f5c29    # 1.12f

    .line 626
    .line 627
    .line 628
    const/high16 v16, 0x40200000    # 2.5f

    .line 629
    .line 630
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const/high16 v0, 0x3f400000    # 0.75f

    .line 634
    .line 635
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const/high16 v0, 0x40800000    # 4.0f

    .line 639
    .line 640
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 644
    .line 645
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    const/high16 v0, -0x3f800000    # -4.0f

    .line 649
    .line 650
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const/high16 v0, 0x3f400000    # 0.75f

    .line 654
    .line 655
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 659
    .line 660
    const v13, 0x3fb0a3d7    # 1.38f

    .line 661
    .line 662
    .line 663
    const/4 v14, 0x0

    .line 664
    const/high16 v15, 0x40200000    # 2.5f

    .line 665
    .line 666
    const v16, -0x4070a3d7    # -1.12f

    .line 667
    .line 668
    .line 669
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    .line 672
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 673
    .line 674
    const/4 v13, 0x0

    .line 675
    const v14, -0x404f5c29    # -1.38f

    .line 676
    .line 677
    .line 678
    const v15, -0x4070a3d7    # -1.12f

    .line 679
    .line 680
    .line 681
    const/high16 v16, -0x3fe00000    # -2.5f

    .line 682
    .line 683
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 684
    .line 685
    .line 686
    const/high16 v0, -0x40c00000    # -0.75f

    .line 687
    .line 688
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    const/high16 v0, -0x40800000    # -1.0f

    .line 692
    .line 693
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 694
    .line 695
    .line 696
    const/high16 v0, 0x41a80000    # 21.0f

    .line 697
    .line 698
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    const/high16 v0, 0x41000000    # 8.0f

    .line 702
    .line 703
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    const/high16 v0, -0x3fb00000    # -3.25f

    .line 707
    .line 708
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    const/high16 v0, 0x40e00000    # 7.0f

    .line 712
    .line 713
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 714
    .line 715
    .line 716
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 717
    .line 718
    .line 719
    const/high16 v0, 0x41780000    # 15.5f

    .line 720
    .line 721
    const/high16 v2, 0x40a00000    # 5.0f

    .line 722
    .line 723
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 724
    .line 725
    .line 726
    const/high16 v17, 0x41700000    # 15.0f

    .line 727
    .line 728
    const/high16 v18, 0x40900000    # 4.5f

    .line 729
    .line 730
    const v13, 0x4173851f    # 15.22f

    .line 731
    .line 732
    .line 733
    const/high16 v14, 0x40a00000    # 5.0f

    .line 734
    .line 735
    const/high16 v15, 0x41700000    # 15.0f

    .line 736
    .line 737
    const v16, 0x4098f5c3    # 4.78f

    .line 738
    .line 739
    .line 740
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 741
    .line 742
    .line 743
    const v0, 0x4173851f    # 15.22f

    .line 744
    .line 745
    .line 746
    const/high16 v2, 0x41780000    # 15.5f

    .line 747
    .line 748
    const/high16 v4, 0x40800000    # 4.0f

    .line 749
    .line 750
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 751
    .line 752
    .line 753
    const/high16 v0, 0x40400000    # 3.0f

    .line 754
    .line 755
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 756
    .line 757
    .line 758
    const/high16 v17, 0x41980000    # 19.0f

    .line 759
    .line 760
    const v13, 0x41963d71    # 18.78f

    .line 761
    .line 762
    .line 763
    const/high16 v14, 0x40800000    # 4.0f

    .line 764
    .line 765
    const/high16 v15, 0x41980000    # 19.0f

    .line 766
    .line 767
    const v16, 0x40870a3d    # 4.22f

    .line 768
    .line 769
    .line 770
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 771
    .line 772
    .line 773
    const v0, 0x41963d71    # 18.78f

    .line 774
    .line 775
    .line 776
    const/high16 v2, 0x41940000    # 18.5f

    .line 777
    .line 778
    const/high16 v4, 0x40a00000    # 5.0f

    .line 779
    .line 780
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 781
    .line 782
    .line 783
    const/high16 v0, 0x41780000    # 15.5f

    .line 784
    .line 785
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 786
    .line 787
    .line 788
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 789
    .line 790
    .line 791
    const/high16 v0, 0x41800000    # 16.0f

    .line 792
    .line 793
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 794
    .line 795
    .line 796
    const/high16 v17, 0x3f000000    # 0.5f

    .line 797
    .line 798
    const/high16 v18, 0x3f000000    # 0.5f

    .line 799
    .line 800
    const v13, 0x3e8f5c29    # 0.28f

    .line 801
    .line 802
    .line 803
    const/4 v14, 0x0

    .line 804
    const/high16 v15, 0x3f000000    # 0.5f

    .line 805
    .line 806
    const v16, 0x3e6147ae    # 0.22f

    .line 807
    .line 808
    .line 809
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 810
    .line 811
    .line 812
    const v0, 0x41963d71    # 18.78f

    .line 813
    .line 814
    .line 815
    const/high16 v2, 0x41880000    # 17.0f

    .line 816
    .line 817
    const/high16 v4, 0x41940000    # 18.5f

    .line 818
    .line 819
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 820
    .line 821
    .line 822
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 823
    .line 824
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 825
    .line 826
    .line 827
    const/high16 v17, -0x41000000    # -0.5f

    .line 828
    .line 829
    const/high16 v18, -0x41000000    # -0.5f

    .line 830
    .line 831
    const v13, -0x4170a3d7    # -0.28f

    .line 832
    .line 833
    .line 834
    const/high16 v15, -0x41000000    # -0.5f

    .line 835
    .line 836
    const v16, -0x419eb852    # -0.22f

    .line 837
    .line 838
    .line 839
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 840
    .line 841
    .line 842
    const v0, 0x3e6147ae    # 0.22f

    .line 843
    .line 844
    .line 845
    const/high16 v2, 0x3f000000    # 0.5f

    .line 846
    .line 847
    const/high16 v4, -0x41000000    # -0.5f

    .line 848
    .line 849
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 850
    .line 851
    .line 852
    const/high16 v0, 0x41940000    # 18.5f

    .line 853
    .line 854
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 855
    .line 856
    .line 857
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 858
    .line 859
    .line 860
    const/high16 v0, 0x41200000    # 10.0f

    .line 861
    .line 862
    const/high16 v2, 0x41980000    # 19.0f

    .line 863
    .line 864
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 865
    .line 866
    .line 867
    const/high16 v0, 0x3f800000    # 1.0f

    .line 868
    .line 869
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 870
    .line 871
    .line 872
    const/high16 v0, -0x3f800000    # -4.0f

    .line 873
    .line 874
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 875
    .line 876
    .line 877
    const/high16 v0, -0x40800000    # -1.0f

    .line 878
    .line 879
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 880
    .line 881
    .line 882
    const/high16 v0, 0x41980000    # 19.0f

    .line 883
    .line 884
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 885
    .line 886
    .line 887
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 888
    .line 889
    .line 890
    const/high16 v0, 0x40f80000    # 7.75f

    .line 891
    .line 892
    const/high16 v2, 0x40e00000    # 7.0f

    .line 893
    .line 894
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 895
    .line 896
    .line 897
    const/high16 v0, 0x41080000    # 8.5f

    .line 898
    .line 899
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 900
    .line 901
    .line 902
    const/high16 v17, 0x41300000    # 11.0f

    .line 903
    .line 904
    const/high16 v18, 0x40900000    # 4.5f

    .line 905
    .line 906
    const v13, 0x411e147b    # 9.88f

    .line 907
    .line 908
    .line 909
    const/high16 v14, 0x40e00000    # 7.0f

    .line 910
    .line 911
    const/high16 v15, 0x41300000    # 11.0f

    .line 912
    .line 913
    const v16, 0x40bc28f6    # 5.88f

    .line 914
    .line 915
    .line 916
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 917
    .line 918
    .line 919
    const/high16 v17, 0x41080000    # 8.5f

    .line 920
    .line 921
    const/high16 v18, 0x40000000    # 2.0f

    .line 922
    .line 923
    const/high16 v13, 0x41300000    # 11.0f

    .line 924
    .line 925
    const v14, 0x4047ae14    # 3.12f

    .line 926
    .line 927
    .line 928
    const v15, 0x411e147b    # 9.88f

    .line 929
    .line 930
    .line 931
    const/high16 v16, 0x40000000    # 2.0f

    .line 932
    .line 933
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 934
    .line 935
    .line 936
    const/high16 v0, 0x40f80000    # 7.75f

    .line 937
    .line 938
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 939
    .line 940
    .line 941
    const/high16 v0, 0x3f800000    # 1.0f

    .line 942
    .line 943
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 944
    .line 945
    .line 946
    const/high16 v0, -0x40400000    # -1.5f

    .line 947
    .line 948
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 949
    .line 950
    .line 951
    const/high16 v0, 0x3f800000    # 1.0f

    .line 952
    .line 953
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 954
    .line 955
    .line 956
    const/high16 v0, 0x40b00000    # 5.5f

    .line 957
    .line 958
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 959
    .line 960
    .line 961
    const/high16 v17, 0x40400000    # 3.0f

    .line 962
    .line 963
    const/high16 v18, 0x40900000    # 4.5f

    .line 964
    .line 965
    const v13, 0x4083d70a    # 4.12f

    .line 966
    .line 967
    .line 968
    const/high16 v14, 0x40000000    # 2.0f

    .line 969
    .line 970
    const/high16 v15, 0x40400000    # 3.0f

    .line 971
    .line 972
    const v16, 0x4047ae14    # 3.12f

    .line 973
    .line 974
    .line 975
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 976
    .line 977
    .line 978
    const/high16 v17, 0x40b00000    # 5.5f

    .line 979
    .line 980
    const/high16 v18, 0x40e00000    # 7.0f

    .line 981
    .line 982
    const/high16 v13, 0x40400000    # 3.0f

    .line 983
    .line 984
    const v14, 0x40bc28f6    # 5.88f

    .line 985
    .line 986
    .line 987
    const v15, 0x4083d70a    # 4.12f

    .line 988
    .line 989
    .line 990
    const/high16 v16, 0x40e00000    # 7.0f

    .line 991
    .line 992
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 993
    .line 994
    .line 995
    const/high16 v0, 0x3f400000    # 0.75f

    .line 996
    .line 997
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 998
    .line 999
    .line 1000
    const/high16 v0, 0x3f800000    # 1.0f

    .line 1001
    .line 1002
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1003
    .line 1004
    .line 1005
    const/high16 v0, 0x40400000    # 3.0f

    .line 1006
    .line 1007
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1008
    .line 1009
    .line 1010
    const/high16 v0, 0x40a00000    # 5.0f

    .line 1011
    .line 1012
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1013
    .line 1014
    .line 1015
    const/high16 v0, 0x40500000    # 3.25f

    .line 1016
    .line 1017
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1018
    .line 1019
    .line 1020
    const/high16 v0, 0x3f800000    # 1.0f

    .line 1021
    .line 1022
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1023
    .line 1024
    .line 1025
    const/high16 v0, 0x40b00000    # 5.5f

    .line 1026
    .line 1027
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1028
    .line 1029
    .line 1030
    const/high16 v17, 0x40400000    # 3.0f

    .line 1031
    .line 1032
    const/high16 v18, 0x41840000    # 16.5f

    .line 1033
    .line 1034
    const v13, 0x4083d70a    # 4.12f

    .line 1035
    .line 1036
    .line 1037
    const/high16 v14, 0x41600000    # 14.0f

    .line 1038
    .line 1039
    const/high16 v15, 0x40400000    # 3.0f

    .line 1040
    .line 1041
    const v16, 0x4171eb85    # 15.12f

    .line 1042
    .line 1043
    .line 1044
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1045
    .line 1046
    .line 1047
    const/high16 v17, 0x40b00000    # 5.5f

    .line 1048
    .line 1049
    const/high16 v18, 0x41980000    # 19.0f

    .line 1050
    .line 1051
    const/high16 v13, 0x40400000    # 3.0f

    .line 1052
    .line 1053
    const v14, 0x418f0a3d    # 17.88f

    .line 1054
    .line 1055
    .line 1056
    const v15, 0x4083d70a    # 4.12f

    .line 1057
    .line 1058
    .line 1059
    const/high16 v16, 0x41980000    # 19.0f

    .line 1060
    .line 1061
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1062
    .line 1063
    .line 1064
    const/high16 v0, 0x3f400000    # 0.75f

    .line 1065
    .line 1066
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1067
    .line 1068
    .line 1069
    const/high16 v0, 0x40800000    # 4.0f

    .line 1070
    .line 1071
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1072
    .line 1073
    .line 1074
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 1075
    .line 1076
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1077
    .line 1078
    .line 1079
    const/high16 v0, -0x3f800000    # -4.0f

    .line 1080
    .line 1081
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1082
    .line 1083
    .line 1084
    const/high16 v0, 0x41080000    # 8.5f

    .line 1085
    .line 1086
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1087
    .line 1088
    .line 1089
    const/high16 v17, 0x40200000    # 2.5f

    .line 1090
    .line 1091
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 1092
    .line 1093
    const v13, 0x3fb0a3d7    # 1.38f

    .line 1094
    .line 1095
    .line 1096
    const/4 v14, 0x0

    .line 1097
    const/high16 v15, 0x40200000    # 2.5f

    .line 1098
    .line 1099
    const v16, -0x4070a3d7    # -1.12f

    .line 1100
    .line 1101
    .line 1102
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1103
    .line 1104
    .line 1105
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 1106
    .line 1107
    const/4 v13, 0x0

    .line 1108
    const v14, -0x404f5c29    # -1.38f

    .line 1109
    .line 1110
    .line 1111
    const v15, -0x4070a3d7    # -1.12f

    .line 1112
    .line 1113
    .line 1114
    const/high16 v16, -0x3fe00000    # -2.5f

    .line 1115
    .line 1116
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1117
    .line 1118
    .line 1119
    const/high16 v0, 0x40f80000    # 7.75f

    .line 1120
    .line 1121
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1122
    .line 1123
    .line 1124
    const/high16 v0, -0x40800000    # -1.0f

    .line 1125
    .line 1126
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1127
    .line 1128
    .line 1129
    const/high16 v0, 0x41300000    # 11.0f

    .line 1130
    .line 1131
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1132
    .line 1133
    .line 1134
    const/high16 v0, 0x41000000    # 8.0f

    .line 1135
    .line 1136
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1137
    .line 1138
    .line 1139
    const/high16 v0, 0x40f80000    # 7.75f

    .line 1140
    .line 1141
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1142
    .line 1143
    .line 1144
    const/high16 v0, 0x40e00000    # 7.0f

    .line 1145
    .line 1146
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1147
    .line 1148
    .line 1149
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1150
    .line 1151
    .line 1152
    const/high16 v0, 0x40b00000    # 5.5f

    .line 1153
    .line 1154
    const/high16 v2, 0x40a00000    # 5.0f

    .line 1155
    .line 1156
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1157
    .line 1158
    .line 1159
    const/high16 v17, 0x40a00000    # 5.0f

    .line 1160
    .line 1161
    const/high16 v18, 0x40900000    # 4.5f

    .line 1162
    .line 1163
    const v13, 0x40a70a3d    # 5.22f

    .line 1164
    .line 1165
    .line 1166
    const/high16 v14, 0x40a00000    # 5.0f

    .line 1167
    .line 1168
    const/high16 v15, 0x40a00000    # 5.0f

    .line 1169
    .line 1170
    const v16, 0x4098f5c3    # 4.78f

    .line 1171
    .line 1172
    .line 1173
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1174
    .line 1175
    .line 1176
    const v0, 0x40a70a3d    # 5.22f

    .line 1177
    .line 1178
    .line 1179
    const/high16 v2, 0x40b00000    # 5.5f

    .line 1180
    .line 1181
    const/high16 v4, 0x40800000    # 4.0f

    .line 1182
    .line 1183
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1184
    .line 1185
    .line 1186
    const/high16 v0, 0x40400000    # 3.0f

    .line 1187
    .line 1188
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1189
    .line 1190
    .line 1191
    const/high16 v17, 0x41100000    # 9.0f

    .line 1192
    .line 1193
    const v13, 0x410c7ae1    # 8.78f

    .line 1194
    .line 1195
    .line 1196
    const/high16 v14, 0x40800000    # 4.0f

    .line 1197
    .line 1198
    const/high16 v15, 0x41100000    # 9.0f

    .line 1199
    .line 1200
    const v16, 0x40870a3d    # 4.22f

    .line 1201
    .line 1202
    .line 1203
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1204
    .line 1205
    .line 1206
    const v0, 0x410c7ae1    # 8.78f

    .line 1207
    .line 1208
    .line 1209
    const/high16 v2, 0x41080000    # 8.5f

    .line 1210
    .line 1211
    const/high16 v4, 0x40a00000    # 5.0f

    .line 1212
    .line 1213
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1214
    .line 1215
    .line 1216
    const/high16 v0, 0x40b00000    # 5.5f

    .line 1217
    .line 1218
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1219
    .line 1220
    .line 1221
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1222
    .line 1223
    .line 1224
    const/high16 v0, 0x41800000    # 16.0f

    .line 1225
    .line 1226
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1227
    .line 1228
    .line 1229
    const/high16 v18, 0x41840000    # 16.5f

    .line 1230
    .line 1231
    const/high16 v14, 0x41800000    # 16.0f

    .line 1232
    .line 1233
    const v16, 0x4181c28f    # 16.22f

    .line 1234
    .line 1235
    .line 1236
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1237
    .line 1238
    .line 1239
    const v0, 0x410c7ae1    # 8.78f

    .line 1240
    .line 1241
    .line 1242
    const/high16 v2, 0x41880000    # 17.0f

    .line 1243
    .line 1244
    const/high16 v4, 0x41080000    # 8.5f

    .line 1245
    .line 1246
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1247
    .line 1248
    .line 1249
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 1250
    .line 1251
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1252
    .line 1253
    .line 1254
    const/high16 v17, 0x40a00000    # 5.0f

    .line 1255
    .line 1256
    const v13, 0x40a70a3d    # 5.22f

    .line 1257
    .line 1258
    .line 1259
    const/high16 v14, 0x41880000    # 17.0f

    .line 1260
    .line 1261
    const/high16 v15, 0x40a00000    # 5.0f

    .line 1262
    .line 1263
    const v16, 0x41863d71    # 16.78f

    .line 1264
    .line 1265
    .line 1266
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1267
    .line 1268
    .line 1269
    const v0, 0x40a70a3d    # 5.22f

    .line 1270
    .line 1271
    .line 1272
    const/high16 v2, 0x41800000    # 16.0f

    .line 1273
    .line 1274
    const/high16 v4, 0x40b00000    # 5.5f

    .line 1275
    .line 1276
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1277
    .line 1278
    .line 1279
    const/high16 v0, 0x41080000    # 8.5f

    .line 1280
    .line 1281
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1282
    .line 1283
    .line 1284
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1285
    .line 1286
    .line 1287
    const/high16 v0, 0x41100000    # 9.0f

    .line 1288
    .line 1289
    const/high16 v2, 0x41200000    # 10.0f

    .line 1290
    .line 1291
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1292
    .line 1293
    .line 1294
    const/high16 v0, 0x3f800000    # 1.0f

    .line 1295
    .line 1296
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1297
    .line 1298
    .line 1299
    const/high16 v0, 0x40a00000    # 5.0f

    .line 1300
    .line 1301
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1302
    .line 1303
    .line 1304
    const/high16 v0, -0x40800000    # -1.0f

    .line 1305
    .line 1306
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1307
    .line 1308
    .line 1309
    const/high16 v0, 0x41100000    # 9.0f

    .line 1310
    .line 1311
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1312
    .line 1313
    .line 1314
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1315
    .line 1316
    .line 1317
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v2

    .line 1321
    const/16 v16, 0x3800

    .line 1322
    .line 1323
    const/16 v17, 0x0

    .line 1324
    .line 1325
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1326
    .line 1327
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1328
    .line 1329
    const/4 v7, 0x0

    .line 1330
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1331
    .line 1332
    const/4 v13, 0x0

    .line 1333
    const/4 v14, 0x0

    .line 1334
    const/4 v15, 0x0

    .line 1335
    const-string v4, ""

    .line 1336
    .line 1337
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v0

    .line 1341
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1342
    .line 1343
    .line 1344
    move-result-object v0

    .line 1345
    sput-object v0, Landroidx/compose/material/icons/twotone/KebabDiningKt;->_kebabDining:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1346
    .line 1347
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1348
    .line 1349
    .line 1350
    return-object v0
.end method
