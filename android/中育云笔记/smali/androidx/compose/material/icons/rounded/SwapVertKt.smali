.class public final Landroidx/compose/material/icons/rounded/SwapVertKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _swapVert:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSwapVert(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SwapVertKt;->_swapVert:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SwapVert"

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
    const v0, 0x4188147b    # 17.01f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41800000    # 16.0f

    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v0, 0x41300000    # 11.0f

    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v17, -0x40800000    # -1.0f

    .line 84
    .line 85
    const/high16 v18, -0x40800000    # -1.0f

    .line 86
    .line 87
    const/4 v13, 0x0

    .line 88
    const v14, -0x40f33333    # -0.55f

    .line 89
    .line 90
    .line 91
    const v15, -0x4119999a    # -0.45f

    .line 92
    .line 93
    .line 94
    const/high16 v16, -0x40800000    # -1.0f

    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v0, 0x3ee66666    # 0.45f

    .line 100
    .line 101
    .line 102
    const/high16 v2, 0x3f800000    # 1.0f

    .line 103
    .line 104
    const/high16 v4, -0x40800000    # -1.0f

    .line 105
    .line 106
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v0, 0x40c051ec    # 6.01f

    .line 110
    .line 111
    .line 112
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v0, -0x401ae148    # -1.79f

    .line 116
    .line 117
    .line 118
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v17, -0x414ccccd    # -0.35f

    .line 122
    .line 123
    .line 124
    const v18, 0x3f59999a    # 0.85f

    .line 125
    .line 126
    .line 127
    const v13, -0x4119999a    # -0.45f

    .line 128
    .line 129
    .line 130
    const/4 v14, 0x0

    .line 131
    const v15, -0x40d47ae1    # -0.67f

    .line 132
    .line 133
    .line 134
    const v16, 0x3f0a3d71    # 0.54f

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v0, 0x4031eb85    # 2.78f

    .line 141
    .line 142
    .line 143
    const v2, 0x40328f5c    # 2.79f

    .line 144
    .line 145
    .line 146
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v17, 0x3f35c28f    # 0.71f

    .line 150
    .line 151
    .line 152
    const/16 v18, 0x0

    .line 153
    .line 154
    const v13, 0x3e4ccccd    # 0.2f

    .line 155
    .line 156
    .line 157
    const v14, 0x3e428f5c    # 0.19f

    .line 158
    .line 159
    .line 160
    const v15, 0x3f028f5c    # 0.51f

    .line 161
    .line 162
    .line 163
    const v16, 0x3e428f5c    # 0.19f

    .line 164
    .line 165
    .line 166
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v0, -0x3fce147b    # -2.78f

    .line 170
    .line 171
    .line 172
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v17, -0x414ccccd    # -0.35f

    .line 176
    .line 177
    .line 178
    const v18, -0x40a66666    # -0.85f

    .line 179
    .line 180
    .line 181
    const v13, 0x3ea3d70a    # 0.32f

    .line 182
    .line 183
    .line 184
    const v14, -0x416147ae    # -0.31f

    .line 185
    .line 186
    .line 187
    const v15, 0x3db851ec    # 0.09f

    .line 188
    .line 189
    .line 190
    const v16, -0x40a66666    # -0.85f

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const/high16 v0, 0x41800000    # 16.0f

    .line 197
    .line 198
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v0, 0x410a6666    # 8.65f

    .line 205
    .line 206
    .line 207
    const v2, 0x40566666    # 3.35f

    .line 208
    .line 209
    .line 210
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v0, 0x40bb851f    # 5.86f

    .line 214
    .line 215
    .line 216
    const v2, 0x40c47ae1    # 6.14f

    .line 217
    .line 218
    .line 219
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v17, 0x3eb33333    # 0.35f

    .line 223
    .line 224
    .line 225
    const v18, 0x3f59999a    # 0.85f

    .line 226
    .line 227
    .line 228
    const v13, -0x415c28f6    # -0.32f

    .line 229
    .line 230
    .line 231
    const v14, 0x3e9eb852    # 0.31f

    .line 232
    .line 233
    .line 234
    const v15, -0x42333333    # -0.1f

    .line 235
    .line 236
    .line 237
    const v16, 0x3f59999a    # 0.85f

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v0, 0x41000000    # 8.0f

    .line 244
    .line 245
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const/high16 v0, 0x41500000    # 13.0f

    .line 249
    .line 250
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const/high16 v17, 0x3f800000    # 1.0f

    .line 254
    .line 255
    const/high16 v18, 0x3f800000    # 1.0f

    .line 256
    .line 257
    const/4 v13, 0x0

    .line 258
    const v14, 0x3f0ccccd    # 0.55f

    .line 259
    .line 260
    .line 261
    const v15, 0x3ee66666    # 0.45f

    .line 262
    .line 263
    .line 264
    const/high16 v16, 0x3f800000    # 1.0f

    .line 265
    .line 266
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v0, -0x4119999a    # -0.45f

    .line 270
    .line 271
    .line 272
    const/high16 v2, 0x3f800000    # 1.0f

    .line 273
    .line 274
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v0, 0x40dfae14    # 6.99f

    .line 278
    .line 279
    .line 280
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v0, 0x3fe51eb8    # 1.79f

    .line 284
    .line 285
    .line 286
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v17, 0x3eb33333    # 0.35f

    .line 290
    .line 291
    .line 292
    const v18, -0x40a66666    # -0.85f

    .line 293
    .line 294
    .line 295
    const v13, 0x3ee66666    # 0.45f

    .line 296
    .line 297
    .line 298
    const/4 v14, 0x0

    .line 299
    const v15, 0x3f2b851f    # 0.67f

    .line 300
    .line 301
    .line 302
    const v16, -0x40f5c28f    # -0.54f

    .line 303
    .line 304
    .line 305
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v0, 0x4115999a    # 9.35f

    .line 309
    .line 310
    .line 311
    const v2, 0x40566666    # 3.35f

    .line 312
    .line 313
    .line 314
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v17, -0x40cccccd    # -0.7f

    .line 318
    .line 319
    .line 320
    const/16 v18, 0x0

    .line 321
    .line 322
    const v13, -0x41bd70a4    # -0.19f

    .line 323
    .line 324
    .line 325
    const v14, -0x41bd70a4    # -0.19f

    .line 326
    .line 327
    .line 328
    const v15, -0x40fd70a4    # -0.51f

    .line 329
    .line 330
    .line 331
    const v16, -0x41bd70a4    # -0.19f

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 341
    .line 342
    .line 343
    move-result-object v2

    .line 344
    const/16 v16, 0x3800

    .line 345
    .line 346
    const/16 v17, 0x0

    .line 347
    .line 348
    const/high16 v6, 0x3f800000    # 1.0f

    .line 349
    .line 350
    const/high16 v8, 0x3f800000    # 1.0f

    .line 351
    .line 352
    const/4 v7, 0x0

    .line 353
    const/high16 v9, 0x3f800000    # 1.0f

    .line 354
    .line 355
    const/high16 v12, 0x3f800000    # 1.0f

    .line 356
    .line 357
    const/4 v13, 0x0

    .line 358
    const/4 v14, 0x0

    .line 359
    const/4 v15, 0x0

    .line 360
    const-string v4, ""

    .line 361
    .line 362
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    sput-object v0, Landroidx/compose/material/icons/rounded/SwapVertKt;->_swapVert:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 371
    .line 372
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 373
    .line 374
    .line 375
    return-object v0
.end method
