.class public final Landroidx/compose/material/icons/filled/FaxKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_fax",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Fax",
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getFax",
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
        "SMAP\nFax.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Fax.kt\nandroidx/compose/material/icons/filled/FaxKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,93:1\n212#2,12:94\n233#2,18:107\n253#2:144\n233#2,18:145\n253#2:182\n174#3:106\n705#4,2:125\n717#4,2:127\n719#4,11:133\n705#4,2:163\n717#4,2:165\n719#4,11:171\n72#5,4:129\n72#5,4:167\n*S KotlinDebug\n*F\n+ 1 Fax.kt\nandroidx/compose/material/icons/filled/FaxKt\n*L\n29#1:94,12\n30#1:107,18\n30#1:144\n78#1:145,18\n78#1:182\n29#1:106\n30#1:125,2\n30#1:127,2\n30#1:133,11\n78#1:163,2\n78#1:165,2\n78#1:171,11\n30#1:129,4\n78#1:167,4\n*E\n"
    }
.end annotation


# static fields
.field private static _fax:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFax(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/FaxKt;->_fax:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.Fax"

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
    const/high16 v4, 0x41100000    # 9.0f

    .line 71
    .line 72
    const/high16 v6, 0x41980000    # 19.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, -0x40800000    # -1.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x40800000    # 4.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v4, 0x41000000    # 8.0f

    .line 88
    .line 89
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/high16 v4, 0x41680000    # 14.5f

    .line 93
    .line 94
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v4, 0x41a00000    # 20.0f

    .line 98
    .line 99
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v4, 0x41600000    # 14.0f

    .line 103
    .line 104
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v4, -0x3f000000    # -8.0f

    .line 108
    .line 109
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const/high16 v25, 0x41980000    # 19.0f

    .line 113
    .line 114
    const/high16 v26, 0x41100000    # 9.0f

    .line 115
    .line 116
    const/high16 v21, 0x41b00000    # 22.0f

    .line 117
    .line 118
    const v22, 0x412570a4    # 10.34f

    .line 119
    .line 120
    .line 121
    const v23, 0x41a547ae    # 20.66f

    .line 122
    .line 123
    .line 124
    const/high16 v24, 0x41100000    # 9.0f

    .line 125
    .line 126
    move-object/from16 v20, v2

    .line 127
    .line 128
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v4, 0x41200000    # 10.0f

    .line 135
    .line 136
    const/high16 v6, 0x40c00000    # 6.0f

    .line 137
    .line 138
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v4, 0x40c00000    # 6.0f

    .line 142
    .line 143
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v4, 0x40400000    # 3.0f

    .line 147
    .line 148
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v4, -0x3f400000    # -6.0f

    .line 152
    .line 153
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const/high16 v4, 0x40c00000    # 6.0f

    .line 157
    .line 158
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v4, 0x41880000    # 17.0f

    .line 165
    .line 166
    const/high16 v6, 0x41600000    # 14.0f

    .line 167
    .line 168
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v4, -0x3f800000    # -4.0f

    .line 172
    .line 173
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/high16 v4, -0x3f600000    # -5.0f

    .line 177
    .line 178
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v4, 0x40800000    # 4.0f

    .line 182
    .line 183
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const/high16 v4, 0x41880000    # 17.0f

    .line 187
    .line 188
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v4, 0x41800000    # 16.0f

    .line 195
    .line 196
    const/high16 v6, 0x41880000    # 17.0f

    .line 197
    .line 198
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v25, -0x40800000    # -1.0f

    .line 202
    .line 203
    const/high16 v26, -0x40800000    # -1.0f

    .line 204
    .line 205
    const v21, -0x40f33333    # -0.55f

    .line 206
    .line 207
    .line 208
    const/16 v22, 0x0

    .line 209
    .line 210
    const/high16 v23, -0x40800000    # -1.0f

    .line 211
    .line 212
    const v24, -0x4119999a    # -0.45f

    .line 213
    .line 214
    .line 215
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const/high16 v25, 0x3f800000    # 1.0f

    .line 219
    .line 220
    const/16 v21, 0x0

    .line 221
    .line 222
    const v22, -0x40f33333    # -0.55f

    .line 223
    .line 224
    .line 225
    const v23, 0x3ee66666    # 0.45f

    .line 226
    .line 227
    .line 228
    const/high16 v24, -0x40800000    # -1.0f

    .line 229
    .line 230
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v4, 0x3ee66666    # 0.45f

    .line 234
    .line 235
    .line 236
    const/high16 v6, 0x3f800000    # 1.0f

    .line 237
    .line 238
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const/high16 v25, 0x41800000    # 16.0f

    .line 242
    .line 243
    const/high16 v26, 0x41880000    # 17.0f

    .line 244
    .line 245
    const/high16 v21, 0x41880000    # 17.0f

    .line 246
    .line 247
    const v22, 0x41846666    # 16.55f

    .line 248
    .line 249
    .line 250
    const v23, 0x41846666    # 16.55f

    .line 251
    .line 252
    .line 253
    const/high16 v24, 0x41880000    # 17.0f

    .line 254
    .line 255
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v4, 0x41800000    # 16.0f

    .line 262
    .line 263
    const/high16 v6, 0x41600000    # 14.0f

    .line 264
    .line 265
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v25, -0x40800000    # -1.0f

    .line 269
    .line 270
    const/high16 v26, -0x40800000    # -1.0f

    .line 271
    .line 272
    const v21, -0x40f33333    # -0.55f

    .line 273
    .line 274
    .line 275
    const/16 v22, 0x0

    .line 276
    .line 277
    const/high16 v23, -0x40800000    # -1.0f

    .line 278
    .line 279
    const v24, -0x4119999a    # -0.45f

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v25, 0x3f800000    # 1.0f

    .line 286
    .line 287
    const/16 v21, 0x0

    .line 288
    .line 289
    const v22, -0x40f33333    # -0.55f

    .line 290
    .line 291
    .line 292
    const v23, 0x3ee66666    # 0.45f

    .line 293
    .line 294
    .line 295
    const/high16 v24, -0x40800000    # -1.0f

    .line 296
    .line 297
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v4, 0x3ee66666    # 0.45f

    .line 301
    .line 302
    .line 303
    const/high16 v6, 0x3f800000    # 1.0f

    .line 304
    .line 305
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v25, 0x41800000    # 16.0f

    .line 309
    .line 310
    const/high16 v26, 0x41600000    # 14.0f

    .line 311
    .line 312
    const/high16 v21, 0x41880000    # 17.0f

    .line 313
    .line 314
    const v22, 0x4158cccd    # 13.55f

    .line 315
    .line 316
    .line 317
    const v23, 0x41846666    # 16.55f

    .line 318
    .line 319
    .line 320
    const/high16 v24, 0x41600000    # 14.0f

    .line 321
    .line 322
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const/high16 v4, 0x41980000    # 19.0f

    .line 329
    .line 330
    const/high16 v6, 0x41880000    # 17.0f

    .line 331
    .line 332
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v25, -0x40800000    # -1.0f

    .line 336
    .line 337
    const/high16 v26, -0x40800000    # -1.0f

    .line 338
    .line 339
    const v21, -0x40f33333    # -0.55f

    .line 340
    .line 341
    .line 342
    const/16 v22, 0x0

    .line 343
    .line 344
    const/high16 v23, -0x40800000    # -1.0f

    .line 345
    .line 346
    const v24, -0x4119999a    # -0.45f

    .line 347
    .line 348
    .line 349
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v25, 0x3f800000    # 1.0f

    .line 353
    .line 354
    const/16 v21, 0x0

    .line 355
    .line 356
    const v22, -0x40f33333    # -0.55f

    .line 357
    .line 358
    .line 359
    const v23, 0x3ee66666    # 0.45f

    .line 360
    .line 361
    .line 362
    const/high16 v24, -0x40800000    # -1.0f

    .line 363
    .line 364
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v4, 0x3ee66666    # 0.45f

    .line 368
    .line 369
    .line 370
    const/high16 v6, 0x3f800000    # 1.0f

    .line 371
    .line 372
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v25, 0x41980000    # 19.0f

    .line 376
    .line 377
    const/high16 v26, 0x41880000    # 17.0f

    .line 378
    .line 379
    const/high16 v21, 0x41a00000    # 20.0f

    .line 380
    .line 381
    const v22, 0x41846666    # 16.55f

    .line 382
    .line 383
    .line 384
    const v23, 0x419c6666    # 19.55f

    .line 385
    .line 386
    .line 387
    const/high16 v24, 0x41880000    # 17.0f

    .line 388
    .line 389
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/high16 v4, 0x41980000    # 19.0f

    .line 396
    .line 397
    const/high16 v6, 0x41600000    # 14.0f

    .line 398
    .line 399
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const/high16 v25, -0x40800000    # -1.0f

    .line 403
    .line 404
    const/high16 v26, -0x40800000    # -1.0f

    .line 405
    .line 406
    const v21, -0x40f33333    # -0.55f

    .line 407
    .line 408
    .line 409
    const/16 v22, 0x0

    .line 410
    .line 411
    const/high16 v23, -0x40800000    # -1.0f

    .line 412
    .line 413
    const v24, -0x4119999a    # -0.45f

    .line 414
    .line 415
    .line 416
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const/high16 v25, 0x3f800000    # 1.0f

    .line 420
    .line 421
    const/16 v21, 0x0

    .line 422
    .line 423
    const v22, -0x40f33333    # -0.55f

    .line 424
    .line 425
    .line 426
    const v23, 0x3ee66666    # 0.45f

    .line 427
    .line 428
    .line 429
    const/high16 v24, -0x40800000    # -1.0f

    .line 430
    .line 431
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const v4, 0x3ee66666    # 0.45f

    .line 435
    .line 436
    .line 437
    const/high16 v6, 0x3f800000    # 1.0f

    .line 438
    .line 439
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const/high16 v25, 0x41980000    # 19.0f

    .line 443
    .line 444
    const/high16 v26, 0x41600000    # 14.0f

    .line 445
    .line 446
    const/high16 v21, 0x41a00000    # 20.0f

    .line 447
    .line 448
    const v22, 0x4158cccd    # 13.55f

    .line 449
    .line 450
    .line 451
    const v23, 0x419c6666    # 19.55f

    .line 452
    .line 453
    .line 454
    const/high16 v24, 0x41600000    # 14.0f

    .line 455
    .line 456
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 463
    .line 464
    .line 465
    move-result-object v2

    .line 466
    const/16 v16, 0x3800

    .line 467
    .line 468
    const/16 v17, 0x0

    .line 469
    .line 470
    const/high16 v8, 0x3f800000    # 1.0f

    .line 471
    .line 472
    const/4 v7, 0x0

    .line 473
    const/high16 v9, 0x3f800000    # 1.0f

    .line 474
    .line 475
    const/high16 v12, 0x3f800000    # 1.0f

    .line 476
    .line 477
    const/4 v13, 0x0

    .line 478
    const/4 v14, 0x0

    .line 479
    const/4 v15, 0x0

    .line 480
    const-string v4, ""

    .line 481
    .line 482
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 483
    .line 484
    .line 485
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 486
    .line 487
    .line 488
    move-result v3

    .line 489
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 490
    .line 491
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 492
    .line 493
    .line 494
    move-result-wide v6

    .line 495
    const/4 v0, 0x0

    .line 496
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 497
    .line 498
    .line 499
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 500
    .line 501
    .line 502
    move-result v10

    .line 503
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 504
    .line 505
    .line 506
    move-result v11

    .line 507
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 510
    .line 511
    .line 512
    const/high16 v0, 0x40900000    # 4.5f

    .line 513
    .line 514
    const/high16 v2, 0x41000000    # 8.0f

    .line 515
    .line 516
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/high16 v17, 0x40000000    # 2.0f

    .line 520
    .line 521
    const/high16 v18, 0x41280000    # 10.5f

    .line 522
    .line 523
    const v13, 0x4047ae14    # 3.12f

    .line 524
    .line 525
    .line 526
    const/high16 v14, 0x41000000    # 8.0f

    .line 527
    .line 528
    const/high16 v15, 0x40000000    # 2.0f

    .line 529
    .line 530
    const v16, 0x4111eb85    # 9.12f

    .line 531
    .line 532
    .line 533
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const/high16 v0, 0x41000000    # 8.0f

    .line 537
    .line 538
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const/high16 v17, 0x40900000    # 4.5f

    .line 542
    .line 543
    const/high16 v18, 0x41a80000    # 21.0f

    .line 544
    .line 545
    const/high16 v13, 0x40000000    # 2.0f

    .line 546
    .line 547
    const v14, 0x419f0a3d    # 19.88f

    .line 548
    .line 549
    .line 550
    const v15, 0x4047ae14    # 3.12f

    .line 551
    .line 552
    .line 553
    const/high16 v16, 0x41a80000    # 21.0f

    .line 554
    .line 555
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const v0, 0x419f0a3d    # 19.88f

    .line 559
    .line 560
    .line 561
    const/high16 v2, 0x41940000    # 18.5f

    .line 562
    .line 563
    const/high16 v4, 0x40e00000    # 7.0f

    .line 564
    .line 565
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const/high16 v0, -0x3f000000    # -8.0f

    .line 569
    .line 570
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const/high16 v18, 0x41000000    # 8.0f

    .line 574
    .line 575
    const/high16 v13, 0x40e00000    # 7.0f

    .line 576
    .line 577
    const v14, 0x4111eb85    # 9.12f

    .line 578
    .line 579
    .line 580
    const v15, 0x40bc28f6    # 5.88f

    .line 581
    .line 582
    .line 583
    const/high16 v16, 0x41000000    # 8.0f

    .line 584
    .line 585
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 592
    .line 593
    .line 594
    move-result-object v2

    .line 595
    const/16 v16, 0x3800

    .line 596
    .line 597
    const/16 v17, 0x0

    .line 598
    .line 599
    const/high16 v6, 0x3f800000    # 1.0f

    .line 600
    .line 601
    const/4 v7, 0x0

    .line 602
    const/high16 v12, 0x3f800000    # 1.0f

    .line 603
    .line 604
    const/4 v13, 0x0

    .line 605
    const/4 v14, 0x0

    .line 606
    const/4 v15, 0x0

    .line 607
    const-string v4, ""

    .line 608
    .line 609
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 614
    .line 615
    .line 616
    move-result-object v0

    .line 617
    sput-object v0, Landroidx/compose/material/icons/filled/FaxKt;->_fax:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 618
    .line 619
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 620
    .line 621
    .line 622
    return-object v0
.end method
