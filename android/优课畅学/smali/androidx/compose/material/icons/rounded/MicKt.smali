.class public final Landroidx/compose/material/icons/rounded/MicKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _mic:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMic(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/MicKt;->_mic:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Mic"

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
    const/high16 v2, 0x41600000    # 14.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x40400000    # 3.0f

    .line 78
    .line 79
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 80
    .line 81
    const v13, 0x3fd47ae1    # 1.66f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, 0x40400000    # 3.0f

    .line 86
    .line 87
    const v16, -0x40547ae1    # -1.34f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v0, 0x41700000    # 15.0f

    .line 94
    .line 95
    const/high16 v2, 0x40a00000    # 5.0f

    .line 96
    .line 97
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 101
    .line 102
    const/4 v13, 0x0

    .line 103
    const v14, -0x402b851f    # -1.66f

    .line 104
    .line 105
    .line 106
    const v15, -0x40547ae1    # -1.34f

    .line 107
    .line 108
    .line 109
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 110
    .line 111
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v0, 0x4055c28f    # 3.34f

    .line 115
    .line 116
    .line 117
    const/high16 v2, 0x41100000    # 9.0f

    .line 118
    .line 119
    const/high16 v4, 0x40a00000    # 5.0f

    .line 120
    .line 121
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v0, 0x40c00000    # 6.0f

    .line 125
    .line 126
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v17, 0x40400000    # 3.0f

    .line 130
    .line 131
    const/high16 v18, 0x40400000    # 3.0f

    .line 132
    .line 133
    const v14, 0x3fd47ae1    # 1.66f

    .line 134
    .line 135
    .line 136
    const v15, 0x3fab851f    # 1.34f

    .line 137
    .line 138
    .line 139
    const/high16 v16, 0x40400000    # 3.0f

    .line 140
    .line 141
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v0, 0x418f47ae    # 17.91f

    .line 148
    .line 149
    .line 150
    const/high16 v2, 0x41300000    # 11.0f

    .line 151
    .line 152
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v17, -0x40851eb8    # -0.98f

    .line 156
    .line 157
    .line 158
    const v18, 0x3f59999a    # 0.85f

    .line 159
    .line 160
    .line 161
    const v13, -0x41051eb8    # -0.49f

    .line 162
    .line 163
    .line 164
    const/4 v14, 0x0

    .line 165
    const v15, -0x4099999a    # -0.9f

    .line 166
    .line 167
    .line 168
    const v16, 0x3eb851ec    # 0.36f

    .line 169
    .line 170
    .line 171
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const/high16 v17, 0x41400000    # 12.0f

    .line 175
    .line 176
    const/high16 v18, 0x41800000    # 16.0f

    .line 177
    .line 178
    const v13, 0x418428f6    # 16.52f

    .line 179
    .line 180
    .line 181
    const v14, 0x41633333    # 14.2f

    .line 182
    .line 183
    .line 184
    const v15, 0x4167851f    # 14.47f

    .line 185
    .line 186
    .line 187
    const/high16 v16, 0x41800000    # 16.0f

    .line 188
    .line 189
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v0, -0x3f623d71    # -4.93f

    .line 193
    .line 194
    .line 195
    const v2, -0x3f7b3333    # -4.15f

    .line 196
    .line 197
    .line 198
    const v4, -0x3f6f5c29    # -4.52f

    .line 199
    .line 200
    .line 201
    const v6, -0x4019999a    # -1.8f

    .line 202
    .line 203
    .line 204
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v17, -0x40851eb8    # -0.98f

    .line 208
    .line 209
    .line 210
    const v18, -0x40a66666    # -0.85f

    .line 211
    .line 212
    .line 213
    const v13, -0x425c28f6    # -0.08f

    .line 214
    .line 215
    .line 216
    const v14, -0x41051eb8    # -0.49f

    .line 217
    .line 218
    .line 219
    const v15, -0x41051eb8    # -0.49f

    .line 220
    .line 221
    .line 222
    const v16, -0x40a66666    # -0.85f

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v17, -0x40800000    # -1.0f

    .line 229
    .line 230
    const v18, 0x3f91eb85    # 1.14f

    .line 231
    .line 232
    .line 233
    const v13, -0x40e3d70a    # -0.61f

    .line 234
    .line 235
    .line 236
    const/4 v14, 0x0

    .line 237
    const v15, -0x40747ae1    # -1.09f

    .line 238
    .line 239
    .line 240
    const v16, 0x3f0a3d71    # 0.54f

    .line 241
    .line 242
    .line 243
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v17, 0x40bd1eb8    # 5.91f

    .line 247
    .line 248
    .line 249
    const v18, 0x40b8f5c3    # 5.78f

    .line 250
    .line 251
    .line 252
    const v13, 0x3efae148    # 0.49f

    .line 253
    .line 254
    .line 255
    const/high16 v14, 0x40400000    # 3.0f

    .line 256
    .line 257
    const v15, 0x4038f5c3    # 2.89f

    .line 258
    .line 259
    .line 260
    const v16, 0x40ab3333    # 5.35f

    .line 261
    .line 262
    .line 263
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v0, 0x41a00000    # 20.0f

    .line 267
    .line 268
    const/high16 v2, 0x41300000    # 11.0f

    .line 269
    .line 270
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v17, 0x3f800000    # 1.0f

    .line 274
    .line 275
    const/high16 v18, 0x3f800000    # 1.0f

    .line 276
    .line 277
    const/4 v13, 0x0

    .line 278
    const v14, 0x3f0ccccd    # 0.55f

    .line 279
    .line 280
    .line 281
    const v15, 0x3ee66666    # 0.45f

    .line 282
    .line 283
    .line 284
    const/high16 v16, 0x3f800000    # 1.0f

    .line 285
    .line 286
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v0, -0x4119999a    # -0.45f

    .line 290
    .line 291
    .line 292
    const/high16 v2, -0x40800000    # -1.0f

    .line 293
    .line 294
    const/high16 v4, 0x3f800000    # 1.0f

    .line 295
    .line 296
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v0, -0x3ffae148    # -2.08f

    .line 300
    .line 301
    .line 302
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v17, 0x40bd1eb8    # 5.91f

    .line 306
    .line 307
    .line 308
    const v18, -0x3f470a3d    # -5.78f

    .line 309
    .line 310
    .line 311
    const v13, 0x404147ae    # 3.02f

    .line 312
    .line 313
    .line 314
    const v14, -0x4123d70a    # -0.43f

    .line 315
    .line 316
    .line 317
    const v15, 0x40ad70a4    # 5.42f

    .line 318
    .line 319
    .line 320
    const v16, -0x3fce147b    # -2.78f

    .line 321
    .line 322
    .line 323
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v17, -0x40800000    # -1.0f

    .line 327
    .line 328
    const v18, -0x406e147b    # -1.14f

    .line 329
    .line 330
    .line 331
    const v13, 0x3dcccccd    # 0.1f

    .line 332
    .line 333
    .line 334
    const v14, -0x40e66666    # -0.6f

    .line 335
    .line 336
    .line 337
    const v15, -0x413851ec    # -0.39f

    .line 338
    .line 339
    .line 340
    const v16, -0x406e147b    # -1.14f

    .line 341
    .line 342
    .line 343
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    const/16 v16, 0x3800

    .line 354
    .line 355
    const/16 v17, 0x0

    .line 356
    .line 357
    const/high16 v6, 0x3f800000    # 1.0f

    .line 358
    .line 359
    const/high16 v8, 0x3f800000    # 1.0f

    .line 360
    .line 361
    const/4 v7, 0x0

    .line 362
    const/high16 v9, 0x3f800000    # 1.0f

    .line 363
    .line 364
    const/high16 v12, 0x3f800000    # 1.0f

    .line 365
    .line 366
    const/4 v13, 0x0

    .line 367
    const/4 v14, 0x0

    .line 368
    const/4 v15, 0x0

    .line 369
    const-string v4, ""

    .line 370
    .line 371
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    sput-object v0, Landroidx/compose/material/icons/rounded/MicKt;->_mic:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 380
    .line 381
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 382
    .line 383
    .line 384
    return-object v0
.end method
