.class public final Landroidx/compose/material/icons/outlined/DarkModeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _darkMode:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDarkMode(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/DarkModeKt;->_darkMode:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.DarkMode"

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
    const v0, 0x4115eb85    # 9.37f

    .line 71
    .line 72
    .line 73
    const v2, 0x40b051ec    # 5.51f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, 0x4111999a    # 9.1f

    .line 80
    .line 81
    .line 82
    const/high16 v18, 0x40f00000    # 7.5f

    .line 83
    .line 84
    const v13, 0x41130a3d    # 9.19f

    .line 85
    .line 86
    .line 87
    const v14, 0x40c4cccd    # 6.15f

    .line 88
    .line 89
    .line 90
    const v15, 0x4111999a    # 9.1f

    .line 91
    .line 92
    .line 93
    const v16, 0x40da3d71    # 6.82f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v17, 0x40eccccd    # 7.4f

    .line 100
    .line 101
    .line 102
    const v18, 0x40eccccd    # 7.4f

    .line 103
    .line 104
    .line 105
    const/4 v13, 0x0

    .line 106
    const v14, 0x40828f5c    # 4.08f

    .line 107
    .line 108
    .line 109
    const v15, 0x40547ae1    # 3.32f

    .line 110
    .line 111
    .line 112
    const v16, 0x40eccccd    # 7.4f

    .line 113
    .line 114
    .line 115
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v17, 0x3ffeb852    # 1.99f

    .line 119
    .line 120
    .line 121
    const v18, -0x4175c28f    # -0.27f

    .line 122
    .line 123
    .line 124
    const v13, 0x3f2e147b    # 0.68f

    .line 125
    .line 126
    .line 127
    const/4 v14, 0x0

    .line 128
    const v15, 0x3faccccd    # 1.35f

    .line 129
    .line 130
    .line 131
    const v16, -0x4247ae14    # -0.09f

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v17, 0x41400000    # 12.0f

    .line 138
    .line 139
    const/high16 v18, 0x41980000    # 19.0f

    .line 140
    .line 141
    const v13, 0x418b999a    # 17.45f

    .line 142
    .line 143
    .line 144
    const v14, 0x4189851f    # 17.19f

    .line 145
    .line 146
    .line 147
    const v15, 0x416ee148    # 14.93f

    .line 148
    .line 149
    .line 150
    const/high16 v16, 0x41980000    # 19.0f

    .line 151
    .line 152
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const/high16 v17, -0x3f200000    # -7.0f

    .line 156
    .line 157
    const/high16 v18, -0x3f200000    # -7.0f

    .line 158
    .line 159
    const v13, -0x3f88f5c3    # -3.86f

    .line 160
    .line 161
    .line 162
    const/4 v14, 0x0

    .line 163
    const/high16 v15, -0x3f200000    # -7.0f

    .line 164
    .line 165
    const v16, -0x3fb70a3d    # -3.14f

    .line 166
    .line 167
    .line 168
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v17, 0x4115eb85    # 9.37f

    .line 172
    .line 173
    .line 174
    const v18, 0x40b051ec    # 5.51f

    .line 175
    .line 176
    .line 177
    const/high16 v13, 0x40a00000    # 5.0f

    .line 178
    .line 179
    const v14, 0x41111eb8    # 9.07f

    .line 180
    .line 181
    .line 182
    const v15, 0x40d9eb85    # 6.81f

    .line 183
    .line 184
    .line 185
    const v16, 0x40d1999a    # 6.55f

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v0, 0x40400000    # 3.0f

    .line 195
    .line 196
    const/high16 v2, 0x41400000    # 12.0f

    .line 197
    .line 198
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v17, -0x3ef00000    # -9.0f

    .line 202
    .line 203
    const/high16 v18, 0x41100000    # 9.0f

    .line 204
    .line 205
    const v13, -0x3f60f5c3    # -4.97f

    .line 206
    .line 207
    .line 208
    const/4 v14, 0x0

    .line 209
    const/high16 v15, -0x3ef00000    # -9.0f

    .line 210
    .line 211
    const v16, 0x4080f5c3    # 4.03f

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v0, 0x4080f5c3    # 4.03f

    .line 218
    .line 219
    .line 220
    const/high16 v2, 0x41100000    # 9.0f

    .line 221
    .line 222
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v0, -0x3f7f0a3d    # -4.03f

    .line 226
    .line 227
    .line 228
    const/high16 v2, -0x3ef00000    # -9.0f

    .line 229
    .line 230
    const/high16 v4, 0x41100000    # 9.0f

    .line 231
    .line 232
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v17, -0x42333333    # -0.1f

    .line 236
    .line 237
    .line 238
    const v18, -0x4051eb85    # -1.36f

    .line 239
    .line 240
    .line 241
    const/4 v13, 0x0

    .line 242
    const v14, -0x41147ae1    # -0.46f

    .line 243
    .line 244
    .line 245
    const v15, -0x42dc28f6    # -0.04f

    .line 246
    .line 247
    .line 248
    const v16, -0x40947ae1    # -0.92f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v17, -0x3f733333    # -4.4f

    .line 255
    .line 256
    .line 257
    const v18, 0x4010a3d7    # 2.26f

    .line 258
    .line 259
    .line 260
    const v13, -0x40851eb8    # -0.98f

    .line 261
    .line 262
    .line 263
    const v14, 0x3faf5c29    # 1.37f

    .line 264
    .line 265
    .line 266
    const v15, -0x3fdae148    # -2.58f

    .line 267
    .line 268
    .line 269
    const v16, 0x4010a3d7    # 2.26f

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v17, -0x3f533333    # -5.4f

    .line 276
    .line 277
    .line 278
    const v18, -0x3f533333    # -5.4f

    .line 279
    .line 280
    .line 281
    const v13, -0x3fc147ae    # -2.98f

    .line 282
    .line 283
    .line 284
    const/4 v14, 0x0

    .line 285
    const v15, -0x3f533333    # -5.4f

    .line 286
    .line 287
    .line 288
    const v16, -0x3fe51eb8    # -2.42f

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v17, 0x4010a3d7    # 2.26f

    .line 295
    .line 296
    .line 297
    const v18, -0x3f733333    # -4.4f

    .line 298
    .line 299
    .line 300
    const/4 v13, 0x0

    .line 301
    const v14, -0x401851ec    # -1.81f

    .line 302
    .line 303
    .line 304
    const v15, 0x3f63d70a    # 0.89f

    .line 305
    .line 306
    .line 307
    const v16, -0x3fa51eb8    # -3.42f

    .line 308
    .line 309
    .line 310
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/high16 v17, 0x41400000    # 12.0f

    .line 314
    .line 315
    const/high16 v18, 0x40400000    # 3.0f

    .line 316
    .line 317
    const v13, 0x414eb852    # 12.92f

    .line 318
    .line 319
    .line 320
    const v14, 0x40428f5c    # 3.04f

    .line 321
    .line 322
    .line 323
    const v15, 0x41475c29    # 12.46f

    .line 324
    .line 325
    .line 326
    const/high16 v16, 0x40400000    # 3.0f

    .line 327
    .line 328
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v0, 0x40400000    # 3.0f

    .line 332
    .line 333
    const/high16 v2, 0x41400000    # 12.0f

    .line 334
    .line 335
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    sput-object v0, Landroidx/compose/material/icons/outlined/DarkModeKt;->_darkMode:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 372
    .line 373
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    return-object v0
.end method
