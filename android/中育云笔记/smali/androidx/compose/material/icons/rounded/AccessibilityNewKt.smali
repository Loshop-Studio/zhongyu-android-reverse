.class public final Landroidx/compose/material/icons/rounded/AccessibilityNewKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _accessibilityNew:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAccessibilityNew(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/AccessibilityNewKt;->_accessibilityNew:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.AccessibilityNew"

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
    const/high16 v0, 0x41a60000    # 20.75f

    .line 71
    .line 72
    const v2, 0x40dfae14    # 6.99f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v17, -0x406147ae    # -1.24f

    .line 79
    .line 80
    .line 81
    const/high16 v18, -0x40c00000    # -0.75f

    .line 82
    .line 83
    const v13, -0x41f0a3d7    # -0.14f

    .line 84
    .line 85
    .line 86
    const v14, -0x40f33333    # -0.55f

    .line 87
    .line 88
    .line 89
    const v15, -0x40cf5c29    # -0.69f

    .line 90
    .line 91
    .line 92
    const v16, -0x40a147ae    # -0.87f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v17, -0x3f0fae14    # -7.51f

    .line 99
    .line 100
    .line 101
    const v18, 0x3f428f5c    # 0.76f

    .line 102
    .line 103
    .line 104
    const v13, -0x3fe7ae14    # -2.38f

    .line 105
    .line 106
    .line 107
    const v14, 0x3f07ae14    # 0.53f

    .line 108
    .line 109
    .line 110
    const v15, -0x3f5f0a3d    # -5.03f

    .line 111
    .line 112
    .line 113
    const v16, 0x3f428f5c    # 0.76f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v0, -0x3f0fae14    # -7.51f

    .line 120
    .line 121
    .line 122
    const v2, -0x40bd70a4    # -0.76f

    .line 123
    .line 124
    .line 125
    const v4, -0x3f5bd70a    # -5.13f

    .line 126
    .line 127
    .line 128
    const v6, -0x41947ae1    # -0.23f

    .line 129
    .line 130
    .line 131
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v17, -0x406147ae    # -1.24f

    .line 135
    .line 136
    .line 137
    const/high16 v18, 0x3f400000    # 0.75f

    .line 138
    .line 139
    const v13, -0x40f33333    # -0.55f

    .line 140
    .line 141
    .line 142
    const v14, -0x420a3d71    # -0.12f

    .line 143
    .line 144
    .line 145
    const v15, -0x40733333    # -1.1f

    .line 146
    .line 147
    .line 148
    const v16, 0x3e4ccccd    # 0.2f

    .line 149
    .line 150
    .line 151
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v17, 0x3f400000    # 0.75f

    .line 155
    .line 156
    const v18, 0x3fa147ae    # 1.26f

    .line 157
    .line 158
    .line 159
    const v13, -0x41f0a3d7    # -0.14f

    .line 160
    .line 161
    .line 162
    const v14, 0x3f0f5c29    # 0.56f

    .line 163
    .line 164
    .line 165
    const v15, 0x3e4ccccd    # 0.2f

    .line 166
    .line 167
    .line 168
    const v16, 0x3f90a3d7    # 1.13f

    .line 169
    .line 170
    .line 171
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const/high16 v17, 0x40a00000    # 5.0f

    .line 175
    .line 176
    const/high16 v18, 0x3f400000    # 0.75f

    .line 177
    .line 178
    const v13, 0x3fce147b    # 1.61f

    .line 179
    .line 180
    .line 181
    const v14, 0x3eb851ec    # 0.36f

    .line 182
    .line 183
    .line 184
    const v15, 0x40566666    # 3.35f

    .line 185
    .line 186
    .line 187
    const v16, 0x3f1c28f6    # 0.61f

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v0, 0x41400000    # 12.0f

    .line 194
    .line 195
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v17, 0x3f800000    # 1.0f

    .line 199
    .line 200
    const/high16 v18, 0x3f800000    # 1.0f

    .line 201
    .line 202
    const/4 v13, 0x0

    .line 203
    const v14, 0x3f0ccccd    # 0.55f

    .line 204
    .line 205
    .line 206
    const v15, 0x3ee66666    # 0.45f

    .line 207
    .line 208
    .line 209
    const/high16 v16, 0x3f800000    # 1.0f

    .line 210
    .line 211
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const/high16 v0, -0x40800000    # -1.0f

    .line 215
    .line 216
    const v2, -0x4119999a    # -0.45f

    .line 217
    .line 218
    .line 219
    const/high16 v4, 0x3f800000    # 1.0f

    .line 220
    .line 221
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/high16 v0, -0x3f600000    # -5.0f

    .line 225
    .line 226
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/high16 v0, 0x40000000    # 2.0f

    .line 230
    .line 231
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v0, 0x40a00000    # 5.0f

    .line 235
    .line 236
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v0, -0x40800000    # -1.0f

    .line 243
    .line 244
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v0, 0x41100000    # 9.0f

    .line 248
    .line 249
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v17, 0x409fae14    # 4.99f

    .line 253
    .line 254
    .line 255
    const/high16 v18, -0x40c00000    # -0.75f

    .line 256
    .line 257
    const v13, 0x3fd33333    # 1.65f

    .line 258
    .line 259
    .line 260
    const v14, -0x41f0a3d7    # -0.14f

    .line 261
    .line 262
    .line 263
    const v15, 0x4058f5c3    # 3.39f

    .line 264
    .line 265
    .line 266
    const v16, -0x413851ec    # -0.39f

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v17, 0x3f428f5c    # 0.76f

    .line 273
    .line 274
    .line 275
    const v18, -0x405eb852    # -1.26f

    .line 276
    .line 277
    .line 278
    const v13, 0x3f0f5c29    # 0.56f

    .line 279
    .line 280
    .line 281
    const v14, -0x41fae148    # -0.13f

    .line 282
    .line 283
    .line 284
    const v15, 0x3f666666    # 0.9f

    .line 285
    .line 286
    .line 287
    const v16, -0x40cccccd    # -0.7f

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const/high16 v0, 0x40c00000    # 6.0f

    .line 297
    .line 298
    const/high16 v2, 0x41400000    # 12.0f

    .line 299
    .line 300
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v17, 0x40000000    # 2.0f

    .line 304
    .line 305
    const/high16 v18, -0x40000000    # -2.0f

    .line 306
    .line 307
    const v13, 0x3f8ccccd    # 1.1f

    .line 308
    .line 309
    .line 310
    const/4 v14, 0x0

    .line 311
    const/high16 v15, 0x40000000    # 2.0f

    .line 312
    .line 313
    const v16, -0x4099999a    # -0.9f

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v0, -0x4099999a    # -0.9f

    .line 320
    .line 321
    .line 322
    const/high16 v2, -0x40000000    # -2.0f

    .line 323
    .line 324
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v0, 0x3f666666    # 0.9f

    .line 328
    .line 329
    .line 330
    const/high16 v4, 0x40000000    # 2.0f

    .line 331
    .line 332
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v2, 0x40000000    # 2.0f

    .line 336
    .line 337
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 344
    .line 345
    .line 346
    move-result-object v2

    .line 347
    const/16 v16, 0x3800

    .line 348
    .line 349
    const/16 v17, 0x0

    .line 350
    .line 351
    const/high16 v6, 0x3f800000    # 1.0f

    .line 352
    .line 353
    const/high16 v8, 0x3f800000    # 1.0f

    .line 354
    .line 355
    const/4 v7, 0x0

    .line 356
    const/high16 v9, 0x3f800000    # 1.0f

    .line 357
    .line 358
    const/high16 v12, 0x3f800000    # 1.0f

    .line 359
    .line 360
    const/4 v13, 0x0

    .line 361
    const/4 v15, 0x0

    .line 362
    const-string v4, ""

    .line 363
    .line 364
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    sput-object v0, Landroidx/compose/material/icons/rounded/AccessibilityNewKt;->_accessibilityNew:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 373
    .line 374
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 375
    .line 376
    .line 377
    return-object v0
.end method
