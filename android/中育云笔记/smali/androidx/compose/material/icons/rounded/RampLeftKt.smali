.class public final Landroidx/compose/material/icons/rounded/RampLeftKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _rampLeft:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRampLeft(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/RampLeftKt;->_rampLeft:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.RampLeft"

    .line 33
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
    const/4 v0, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

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
    const/high16 v0, 0x41400000    # 12.0f

    .line 71
    .line 72
    const/high16 v2, 0x41a80000    # 21.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x40800000    # -1.0f

    .line 78
    .line 79
    const/high16 v18, -0x40800000    # -1.0f

    .line 80
    .line 81
    const v13, -0x40f33333    # -0.55f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, -0x40800000    # -1.0f

    .line 86
    .line 87
    const v16, -0x4119999a    # -0.45f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, 0x40da8f5c    # 6.83f

    .line 94
    .line 95
    .line 96
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v0, -0x409eb852    # -0.88f

    .line 100
    .line 101
    .line 102
    const v2, 0x3f6147ae    # 0.88f

    .line 103
    .line 104
    .line 105
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v17, 0x410b5c29    # 8.71f

    .line 109
    .line 110
    .line 111
    const v18, 0x40f6b852    # 7.71f

    .line 112
    .line 113
    .line 114
    const v13, 0x411bae14    # 9.73f

    .line 115
    .line 116
    .line 117
    const v14, 0x4101999a    # 8.1f

    .line 118
    .line 119
    .line 120
    const v15, 0x4111999a    # 9.1f

    .line 121
    .line 122
    .line 123
    const v16, 0x4101999a    # 8.1f

    .line 124
    .line 125
    .line 126
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/16 v17, 0x0

    .line 130
    .line 131
    const v18, -0x404b851f    # -1.41f

    .line 132
    .line 133
    .line 134
    const v13, -0x413851ec    # -0.39f

    .line 135
    .line 136
    .line 137
    const v14, -0x413851ec    # -0.39f

    .line 138
    .line 139
    .line 140
    const v15, -0x413851ec    # -0.39f

    .line 141
    .line 142
    .line 143
    const v16, -0x407d70a4    # -1.02f

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v0, -0x3fda3d71    # -2.59f

    .line 150
    .line 151
    .line 152
    const v2, 0x4025c28f    # 2.59f

    .line 153
    .line 154
    .line 155
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v17, 0x3fb47ae1    # 1.41f

    .line 159
    .line 160
    .line 161
    const/16 v18, 0x0

    .line 162
    .line 163
    const v13, 0x3ec7ae14    # 0.39f

    .line 164
    .line 165
    .line 166
    const v15, 0x3f828f5c    # 1.02f

    .line 167
    .line 168
    .line 169
    const v16, -0x413851ec    # -0.39f

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v0, 0x4025c28f    # 2.59f

    .line 176
    .line 177
    .line 178
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/16 v17, 0x0

    .line 182
    .line 183
    const v18, 0x3fb47ae1    # 1.41f

    .line 184
    .line 185
    .line 186
    const v14, 0x3ec7ae14    # 0.39f

    .line 187
    .line 188
    .line 189
    const v15, 0x3ec7ae14    # 0.39f

    .line 190
    .line 191
    .line 192
    const v16, 0x3f828f5c    # 1.02f

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v17, -0x404b851f    # -1.41f

    .line 199
    .line 200
    .line 201
    const/16 v18, 0x0

    .line 202
    .line 203
    const v13, -0x413851ec    # -0.39f

    .line 204
    .line 205
    .line 206
    const v15, -0x407d70a4    # -1.02f

    .line 207
    .line 208
    .line 209
    const v16, 0x3ec7ae14    # 0.39f

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v0, 0x41500000    # 13.0f

    .line 216
    .line 217
    const v2, 0x40da8f5c    # 6.83f

    .line 218
    .line 219
    .line 220
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/4 v0, 0x0

    .line 224
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const/high16 v0, 0x41100000    # 9.0f

    .line 228
    .line 229
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v17, 0x409f0a3d    # 4.97f

    .line 233
    .line 234
    .line 235
    const v18, 0x40f3d70a    # 7.62f

    .line 236
    .line 237
    .line 238
    const/4 v13, 0x0

    .line 239
    const v14, 0x4067ae14    # 3.62f

    .line 240
    .line 241
    .line 242
    const v15, 0x4038f5c3    # 2.89f

    .line 243
    .line 244
    .line 245
    const v16, 0x40c70a3d    # 6.22f

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v17, 0x3e0f5c29    # 0.14f

    .line 252
    .line 253
    .line 254
    const v18, 0x3fc3d70a    # 1.53f

    .line 255
    .line 256
    .line 257
    const v13, 0x3f051eb8    # 0.52f

    .line 258
    .line 259
    .line 260
    const v14, 0x3eb33333    # 0.35f

    .line 261
    .line 262
    .line 263
    const v15, 0x3f170a3d    # 0.59f

    .line 264
    .line 265
    .line 266
    const v16, 0x3f8b851f    # 1.09f

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v17, -0x405eb852    # -1.26f

    .line 273
    .line 274
    .line 275
    const v18, 0x3e051eb8    # 0.13f

    .line 276
    .line 277
    .line 278
    const v13, -0x41570a3d    # -0.33f

    .line 279
    .line 280
    .line 281
    const v14, 0x3ea8f5c3    # 0.33f

    .line 282
    .line 283
    .line 284
    const v15, -0x40a147ae    # -0.87f

    .line 285
    .line 286
    .line 287
    const v16, 0x3ecccccd    # 0.4f

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v17, -0x3f89999a    # -3.85f

    .line 294
    .line 295
    .line 296
    const v18, -0x3f9a3d71    # -3.59f

    .line 297
    .line 298
    .line 299
    const v13, -0x40347ae1    # -1.59f

    .line 300
    .line 301
    .line 302
    const v14, -0x407851ec    # -1.06f

    .line 303
    .line 304
    .line 305
    const v15, -0x3fc70a3d    # -2.89f

    .line 306
    .line 307
    .line 308
    const v16, -0x3fee147b    # -2.28f

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v0, 0x40a9999a    # 5.3f

    .line 315
    .line 316
    .line 317
    const/4 v2, 0x0

    .line 318
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v17, 0x41400000    # 12.0f

    .line 322
    .line 323
    const/high16 v18, 0x41a80000    # 21.0f

    .line 324
    .line 325
    const/high16 v13, 0x41500000    # 13.0f

    .line 326
    .line 327
    const v14, 0x41a46666    # 20.55f

    .line 328
    .line 329
    .line 330
    const v15, 0x4148cccd    # 12.55f

    .line 331
    .line 332
    .line 333
    const/high16 v16, 0x41a80000    # 21.0f

    .line 334
    .line 335
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 342
    .line 343
    .line 344
    move-result-object v2

    .line 345
    const/16 v16, 0x3800

    .line 346
    .line 347
    const/16 v17, 0x0

    .line 348
    .line 349
    const/high16 v6, 0x3f800000    # 1.0f

    .line 350
    .line 351
    const/high16 v8, 0x3f800000    # 1.0f

    .line 352
    .line 353
    const/4 v7, 0x0

    .line 354
    const/high16 v9, 0x3f800000    # 1.0f

    .line 355
    .line 356
    const/high16 v12, 0x3f800000    # 1.0f

    .line 357
    .line 358
    const/4 v13, 0x0

    .line 359
    const/4 v14, 0x0

    .line 360
    const/4 v15, 0x0

    .line 361
    const-string v4, ""

    .line 362
    .line 363
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    sput-object v0, Landroidx/compose/material/icons/rounded/RampLeftKt;->_rampLeft:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 372
    .line 373
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    return-object v0
.end method
