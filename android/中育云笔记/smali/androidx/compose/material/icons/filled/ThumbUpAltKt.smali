.class public final Landroidx/compose/material/icons/filled/ThumbUpAltKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _thumbUpAlt:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getThumbUpAlt(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/ThumbUpAltKt;->_thumbUpAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.ThumbUpAlt"

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
    const/high16 v0, 0x41a00000    # 20.0f

    .line 71
    .line 72
    const/high16 v2, 0x40000000    # 2.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40000000    # 2.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, 0x3f800000    # 1.0f

    .line 83
    .line 84
    const/high16 v18, -0x40800000    # -1.0f

    .line 85
    .line 86
    const v13, 0x3f0ccccd    # 0.55f

    .line 87
    .line 88
    .line 89
    const/4 v14, 0x0

    .line 90
    const/high16 v15, 0x3f800000    # 1.0f

    .line 91
    .line 92
    const v16, -0x4119999a    # -0.45f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v0, -0x3ef00000    # -9.0f

    .line 99
    .line 100
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v17, -0x40800000    # -1.0f

    .line 104
    .line 105
    const/4 v13, 0x0

    .line 106
    const v14, -0x40f33333    # -0.55f

    .line 107
    .line 108
    .line 109
    const v15, -0x4119999a    # -0.45f

    .line 110
    .line 111
    .line 112
    const/high16 v16, -0x40800000    # -1.0f

    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v0, 0x41100000    # 9.0f

    .line 118
    .line 119
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v0, 0x41300000    # 11.0f

    .line 123
    .line 124
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v0, 0x41aea3d7    # 21.83f

    .line 131
    .line 132
    .line 133
    const v2, 0x414e147b    # 12.88f

    .line 134
    .line 135
    .line 136
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v17, 0x3e2e147b    # 0.17f

    .line 140
    .line 141
    .line 142
    const v18, -0x40b33333    # -0.8f

    .line 143
    .line 144
    .line 145
    const v13, 0x3de147ae    # 0.11f

    .line 146
    .line 147
    .line 148
    const/high16 v14, -0x41800000    # -0.25f

    .line 149
    .line 150
    const v15, 0x3e2e147b    # 0.17f

    .line 151
    .line 152
    .line 153
    const v16, -0x40fae148    # -0.52f

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v0, 0x41b00000    # 22.0f

    .line 160
    .line 161
    const/high16 v2, 0x41300000    # 11.0f

    .line 162
    .line 163
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v17, -0x40000000    # -2.0f

    .line 167
    .line 168
    const/high16 v18, -0x40000000    # -2.0f

    .line 169
    .line 170
    const/4 v13, 0x0

    .line 171
    const v14, -0x40733333    # -1.1f

    .line 172
    .line 173
    .line 174
    const v15, -0x4099999a    # -0.9f

    .line 175
    .line 176
    .line 177
    const/high16 v16, -0x40000000    # -2.0f

    .line 178
    .line 179
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/high16 v0, -0x3f500000    # -5.5f

    .line 183
    .line 184
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v0, 0x3f6b851f    # 0.92f

    .line 188
    .line 189
    .line 190
    const v2, -0x3f6b3333    # -4.65f

    .line 191
    .line 192
    .line 193
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v17, -0x425c28f6    # -0.08f

    .line 197
    .line 198
    .line 199
    const v18, -0x40d70a3d    # -0.66f

    .line 200
    .line 201
    .line 202
    const v13, 0x3d4ccccd    # 0.05f

    .line 203
    .line 204
    .line 205
    const v14, -0x419eb852    # -0.22f

    .line 206
    .line 207
    .line 208
    const v15, 0x3ca3d70a    # 0.02f

    .line 209
    .line 210
    .line 211
    const v16, -0x41147ae1    # -0.46f

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v17, -0x409eb852    # -0.88f

    .line 218
    .line 219
    .line 220
    const v18, -0x4063d70a    # -1.22f

    .line 221
    .line 222
    .line 223
    const v13, -0x41947ae1    # -0.23f

    .line 224
    .line 225
    .line 226
    const v14, -0x4119999a    # -0.45f

    .line 227
    .line 228
    .line 229
    const v15, -0x40fae148    # -0.52f

    .line 230
    .line 231
    .line 232
    const v16, -0x40a3d70a    # -0.86f

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v0, 0x41600000    # 14.0f

    .line 239
    .line 240
    const/high16 v2, 0x40000000    # 2.0f

    .line 241
    .line 242
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const v0, 0x40f2e148    # 7.59f

    .line 246
    .line 247
    .line 248
    const v2, 0x41068f5c    # 8.41f

    .line 249
    .line 250
    .line 251
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v17, 0x40e00000    # 7.0f

    .line 255
    .line 256
    const v18, 0x411d47ae    # 9.83f

    .line 257
    .line 258
    .line 259
    const v13, 0x40e6b852    # 7.21f

    .line 260
    .line 261
    .line 262
    const v14, 0x410ca3d7    # 8.79f

    .line 263
    .line 264
    .line 265
    const/high16 v15, 0x40e00000    # 7.0f

    .line 266
    .line 267
    const v16, 0x4114cccd    # 9.3f

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v0, 0x40fae148    # 7.84f

    .line 274
    .line 275
    .line 276
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v17, 0x411570a4    # 9.34f

    .line 280
    .line 281
    .line 282
    const/high16 v18, 0x41a00000    # 20.0f

    .line 283
    .line 284
    const/high16 v13, 0x40e00000    # 7.0f

    .line 285
    .line 286
    const v14, 0x4197999a    # 18.95f

    .line 287
    .line 288
    .line 289
    const v15, 0x4100cccd    # 8.05f

    .line 290
    .line 291
    .line 292
    const/high16 v16, 0x41a00000    # 20.0f

    .line 293
    .line 294
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v0, 0x4101c28f    # 8.11f

    .line 298
    .line 299
    .line 300
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const v17, 0x3fdc28f6    # 1.72f

    .line 304
    .line 305
    .line 306
    const v18, -0x4087ae14    # -0.97f

    .line 307
    .line 308
    .line 309
    const v13, 0x3f333333    # 0.7f

    .line 310
    .line 311
    .line 312
    const/4 v14, 0x0

    .line 313
    const v15, 0x3fae147b    # 1.36f

    .line 314
    .line 315
    .line 316
    const v16, -0x41428f5c    # -0.37f

    .line 317
    .line 318
    .line 319
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v0, 0x402a3d71    # 2.66f

    .line 323
    .line 324
    .line 325
    const v2, -0x3f3b3333    # -6.15f

    .line 326
    .line 327
    .line 328
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 335
    .line 336
    .line 337
    move-result-object v2

    .line 338
    const/16 v16, 0x3800

    .line 339
    .line 340
    const/16 v17, 0x0

    .line 341
    .line 342
    const/high16 v6, 0x3f800000    # 1.0f

    .line 343
    .line 344
    const/high16 v8, 0x3f800000    # 1.0f

    .line 345
    .line 346
    const/4 v7, 0x0

    .line 347
    const/high16 v9, 0x3f800000    # 1.0f

    .line 348
    .line 349
    const/high16 v12, 0x3f800000    # 1.0f

    .line 350
    .line 351
    const/4 v13, 0x0

    .line 352
    const/4 v15, 0x0

    .line 353
    const-string v4, ""

    .line 354
    .line 355
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    sput-object v0, Landroidx/compose/material/icons/filled/ThumbUpAltKt;->_thumbUpAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 364
    .line 365
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    return-object v0
.end method
