.class public final Landroidx/compose/material/icons/rounded/RiceBowlKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _riceBowl:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRiceBowl(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/RiceBowlKt;->_riceBowl:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.RiceBowl"

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
    const/high16 v0, 0x41b00000    # 22.0f

    .line 71
    .line 72
    const/high16 v2, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 78
    .line 79
    .line 80
    const v17, -0x3ee23d71    # -9.86f

    .line 81
    .line 82
    .line 83
    const/high16 v18, -0x3ee00000    # -10.0f

    .line 84
    .line 85
    const/4 v13, 0x0

    .line 86
    const v14, -0x3f50a3d7    # -5.48f

    .line 87
    .line 88
    .line 89
    const v15, -0x3f733333    # -4.4f

    .line 90
    .line 91
    .line 92
    const v16, -0x3ee11eb8    # -9.93f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v17, 0x405b851f    # 3.43f

    .line 99
    .line 100
    .line 101
    const v18, 0x40e47ae1    # 7.14f

    .line 102
    .line 103
    .line 104
    const v13, 0x410851ec    # 8.52f

    .line 105
    .line 106
    .line 107
    const v14, 0x3ff9999a    # 1.95f

    .line 108
    .line 109
    .line 110
    const v15, 0x40a947ae    # 5.29f

    .line 111
    .line 112
    .line 113
    const v16, 0x4080f5c3    # 4.03f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v17, 0x41000000    # 8.0f

    .line 120
    .line 121
    const/high16 v18, 0x41a20000    # 20.25f

    .line 122
    .line 123
    const v13, 0x3dcccccd    # 0.1f

    .line 124
    .line 125
    .line 126
    const v14, 0x414b0a3d    # 12.69f

    .line 127
    .line 128
    .line 129
    const v15, 0x403eb852    # 2.98f

    .line 130
    .line 131
    .line 132
    const v16, 0x419228f6    # 18.27f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v0, 0x3e800000    # 0.25f

    .line 139
    .line 140
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v17, 0x41180000    # 9.5f

    .line 144
    .line 145
    const/high16 v18, 0x41b00000    # 22.0f

    .line 146
    .line 147
    const/high16 v13, 0x41000000    # 8.0f

    .line 148
    .line 149
    const v14, 0x41aaa3d7    # 21.33f

    .line 150
    .line 151
    .line 152
    const v15, 0x410ab852    # 8.67f

    .line 153
    .line 154
    .line 155
    const/high16 v16, 0x41b00000    # 22.0f

    .line 156
    .line 157
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const/high16 v0, 0x40a00000    # 5.0f

    .line 161
    .line 162
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 166
    .line 167
    const/high16 v18, -0x40400000    # -1.5f

    .line 168
    .line 169
    const v13, 0x3f547ae1    # 0.83f

    .line 170
    .line 171
    .line 172
    const/4 v14, 0x0

    .line 173
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 174
    .line 175
    const v16, -0x40d47ae1    # -0.67f

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v0, -0x41800000    # -0.25f

    .line 182
    .line 183
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const/high16 v17, 0x41b00000    # 22.0f

    .line 187
    .line 188
    const/high16 v18, 0x41400000    # 12.0f

    .line 189
    .line 190
    const v13, 0x419c3d71    # 19.53f

    .line 191
    .line 192
    .line 193
    const v14, 0x4196e148    # 18.86f

    .line 194
    .line 195
    .line 196
    const/high16 v15, 0x41b00000    # 22.0f

    .line 197
    .line 198
    const v16, 0x417b0a3d    # 15.69f

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v0, 0x41a00000    # 20.0f

    .line 208
    .line 209
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v0, -0x3f800000    # -4.0f

    .line 213
    .line 214
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v0, 0x40a28f5c    # 5.08f

    .line 218
    .line 219
    .line 220
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v17, 0x41a00000    # 20.0f

    .line 224
    .line 225
    const v13, 0x41931eb8    # 18.39f

    .line 226
    .line 227
    .line 228
    const v14, 0x40cf0a3d    # 6.47f

    .line 229
    .line 230
    .line 231
    const/high16 v15, 0x41a00000    # 20.0f

    .line 232
    .line 233
    const v16, 0x4110cccd    # 9.05f

    .line 234
    .line 235
    .line 236
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v0, 0x41600000    # 14.0f

    .line 243
    .line 244
    const v2, 0x408851ec    # 4.26f

    .line 245
    .line 246
    .line 247
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v0, 0x41400000    # 12.0f

    .line 251
    .line 252
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v0, -0x3f800000    # -4.0f

    .line 256
    .line 257
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v0, 0x408851ec    # 4.26f

    .line 261
    .line 262
    .line 263
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v17, 0x41400000    # 12.0f

    .line 267
    .line 268
    const/high16 v18, 0x40800000    # 4.0f

    .line 269
    .line 270
    const v13, 0x412a3d71    # 10.64f

    .line 271
    .line 272
    .line 273
    const v14, 0x40833333    # 4.1f

    .line 274
    .line 275
    .line 276
    const v15, 0x4134f5c3    # 11.31f

    .line 277
    .line 278
    .line 279
    const/high16 v16, 0x40800000    # 4.0f

    .line 280
    .line 281
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v0, 0x4155c28f    # 13.36f

    .line 285
    .line 286
    .line 287
    const v2, 0x40833333    # 4.1f

    .line 288
    .line 289
    .line 290
    const/high16 v4, 0x41600000    # 14.0f

    .line 291
    .line 292
    const v6, 0x408851ec    # 4.26f

    .line 293
    .line 294
    .line 295
    invoke-virtual {v12, v0, v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const/high16 v0, 0x40800000    # 4.0f

    .line 302
    .line 303
    const/high16 v2, 0x41400000    # 12.0f

    .line 304
    .line 305
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v17, 0x40800000    # 4.0f

    .line 309
    .line 310
    const v18, -0x3f228f5c    # -6.92f

    .line 311
    .line 312
    .line 313
    const/4 v13, 0x0

    .line 314
    const v14, -0x3fc33333    # -2.95f

    .line 315
    .line 316
    .line 317
    const v15, 0x3fce147b    # 1.61f

    .line 318
    .line 319
    .line 320
    const v16, -0x3f4f0a3d    # -5.53f

    .line 321
    .line 322
    .line 323
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v0, 0x41400000    # 12.0f

    .line 327
    .line 328
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v0, 0x40800000    # 4.0f

    .line 332
    .line 333
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    const/16 v16, 0x3800

    .line 344
    .line 345
    const/16 v17, 0x0

    .line 346
    .line 347
    const/high16 v6, 0x3f800000    # 1.0f

    .line 348
    .line 349
    const/high16 v8, 0x3f800000    # 1.0f

    .line 350
    .line 351
    const/4 v7, 0x0

    .line 352
    const/high16 v9, 0x3f800000    # 1.0f

    .line 353
    .line 354
    const/high16 v12, 0x3f800000    # 1.0f

    .line 355
    .line 356
    const/4 v14, 0x0

    .line 357
    const/4 v15, 0x0

    .line 358
    const-string v4, ""

    .line 359
    .line 360
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    sput-object v0, Landroidx/compose/material/icons/rounded/RiceBowlKt;->_riceBowl:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 369
    .line 370
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 371
    .line 372
    .line 373
    return-object v0
.end method
