.class public final Landroidx/compose/material/icons/twotone/ViewStreamKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _viewStream:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getViewStream(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 29

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/ViewStreamKt;->_viewStream:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

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
    const-string v2, "TwoTone.ViewStream"

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
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/n;)V

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
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

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
    const/high16 v6, 0x41980000    # 19.0f

    .line 71
    .line 72
    const/high16 v7, 0x41880000    # 17.0f

    .line 73
    .line 74
    invoke-virtual {v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v8, 0x40a00000    # 5.0f

    .line 78
    .line 79
    invoke-virtual {v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v9, -0x3f800000    # -4.0f

    .line 83
    .line 84
    invoke-virtual {v4, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v12, 0x41600000    # 14.0f

    .line 88
    .line 89
    invoke-virtual {v4, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v13, 0x41300000    # 11.0f

    .line 99
    .line 100
    invoke-virtual {v4, v8, v13}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v14, 0x40e00000    # 7.0f

    .line 104
    .line 105
    invoke-virtual {v4, v14}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v4, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v15, 0x40800000    # 4.0f

    .line 112
    .line 113
    invoke-virtual {v4, v15}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    const/16 v16, 0x3800

    .line 127
    .line 128
    const/16 v17, 0x0

    .line 129
    .line 130
    move-object/from16 v20, v2

    .line 131
    .line 132
    move-object v2, v4

    .line 133
    const-string v4, ""

    .line 134
    .line 135
    move/from16 v21, v6

    .line 136
    .line 137
    const v6, 0x3e99999a    # 0.3f

    .line 138
    .line 139
    .line 140
    move/from16 v22, v7

    .line 141
    .line 142
    const/4 v7, 0x0

    .line 143
    move/from16 v23, v8

    .line 144
    .line 145
    const v8, 0x3e99999a    # 0.3f

    .line 146
    .line 147
    .line 148
    move/from16 v24, v9

    .line 149
    .line 150
    const/high16 v9, 0x3f800000    # 1.0f

    .line 151
    .line 152
    move/from16 v25, v12

    .line 153
    .line 154
    const/high16 v12, 0x3f800000    # 1.0f

    .line 155
    .line 156
    move/from16 v26, v13

    .line 157
    .line 158
    const/4 v13, 0x0

    .line 159
    move/from16 v27, v14

    .line 160
    .line 161
    const/4 v14, 0x0

    .line 162
    move/from16 v28, v15

    .line 163
    .line 164
    const/4 v15, 0x0

    .line 165
    move-object/from16 p0, v0

    .line 166
    .line 167
    move-object/from16 v0, v20

    .line 168
    .line 169
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 170
    .line 171
    .line 172
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 177
    .line 178
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 179
    .line 180
    .line 181
    move-result-wide v6

    .line 182
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 186
    .line 187
    .line 188
    move-result v10

    .line 189
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 190
    .line 191
    .line 192
    move-result v11

    .line 193
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 196
    .line 197
    .line 198
    const/high16 v0, 0x40400000    # 3.0f

    .line 199
    .line 200
    const/high16 v2, 0x40e00000    # 7.0f

    .line 201
    .line 202
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v0, 0x41200000    # 10.0f

    .line 206
    .line 207
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v17, 0x40000000    # 2.0f

    .line 211
    .line 212
    const/high16 v18, 0x40000000    # 2.0f

    .line 213
    .line 214
    const v14, 0x3f8ccccd    # 1.1f

    .line 215
    .line 216
    .line 217
    const v15, 0x3f666666    # 0.9f

    .line 218
    .line 219
    .line 220
    const/high16 v16, 0x40000000    # 2.0f

    .line 221
    .line 222
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v0, 0x41600000    # 14.0f

    .line 226
    .line 227
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v18, -0x40000000    # -2.0f

    .line 231
    .line 232
    const v13, 0x3f8ccccd    # 1.1f

    .line 233
    .line 234
    .line 235
    const/4 v14, 0x0

    .line 236
    const/high16 v15, 0x40000000    # 2.0f

    .line 237
    .line 238
    const v16, -0x4099999a    # -0.9f

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v12, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v17, -0x40000000    # -2.0f

    .line 248
    .line 249
    const/4 v13, 0x0

    .line 250
    const v14, -0x40733333    # -1.1f

    .line 251
    .line 252
    .line 253
    const v15, -0x4099999a    # -0.9f

    .line 254
    .line 255
    .line 256
    const/high16 v16, -0x40000000    # -2.0f

    .line 257
    .line 258
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v4, 0x40a00000    # 5.0f

    .line 262
    .line 263
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v17, 0x40400000    # 3.0f

    .line 267
    .line 268
    const/high16 v18, 0x40e00000    # 7.0f

    .line 269
    .line 270
    const v13, 0x4079999a    # 3.9f

    .line 271
    .line 272
    .line 273
    const/high16 v14, 0x40a00000    # 5.0f

    .line 274
    .line 275
    const/high16 v15, 0x40400000    # 3.0f

    .line 276
    .line 277
    const v16, 0x40bccccd    # 5.9f

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const/high16 v6, 0x41980000    # 19.0f

    .line 287
    .line 288
    const/high16 v7, 0x41880000    # 17.0f

    .line 289
    .line 290
    invoke-virtual {v12, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const/high16 v6, -0x3f800000    # -4.0f

    .line 297
    .line 298
    invoke-virtual {v12, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v12, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v6, 0x41300000    # 11.0f

    .line 311
    .line 312
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v12, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v0, 0x40800000    # 4.0f

    .line 322
    .line 323
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 333
    .line 334
    .line 335
    move-result-object v2

    .line 336
    const/16 v16, 0x3800

    .line 337
    .line 338
    const/16 v17, 0x0

    .line 339
    .line 340
    const-string v4, ""

    .line 341
    .line 342
    const/high16 v6, 0x3f800000    # 1.0f

    .line 343
    .line 344
    const/4 v7, 0x0

    .line 345
    const/high16 v8, 0x3f800000    # 1.0f

    .line 346
    .line 347
    const/high16 v12, 0x3f800000    # 1.0f

    .line 348
    .line 349
    const/4 v13, 0x0

    .line 350
    const/4 v14, 0x0

    .line 351
    const/4 v15, 0x0

    .line 352
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    sput-object v0, Landroidx/compose/material/icons/twotone/ViewStreamKt;->_viewStream:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 361
    .line 362
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 363
    .line 364
    .line 365
    return-object v0
.end method
