.class public final Landroidx/compose/material/icons/rounded/WatchKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _watch:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWatch(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/WatchKt;->_watch:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Watch"

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
    const/high16 v2, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, -0x3fbd70a4    # -3.04f

    .line 78
    .line 79
    .line 80
    const v18, -0x3f375c29    # -6.27f

    .line 81
    .line 82
    .line 83
    const/4 v13, 0x0

    .line 84
    const v14, -0x3fdd70a4    # -2.54f

    .line 85
    .line 86
    .line 87
    const v15, -0x4067ae14    # -1.19f

    .line 88
    .line 89
    .line 90
    const v16, -0x3f66147b    # -4.81f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v0, -0x40d1eb85    # -0.68f

    .line 97
    .line 98
    .line 99
    const v2, -0x3f7e147b    # -4.06f

    .line 100
    .line 101
    .line 102
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v17, 0x4164f5c3    # 14.31f

    .line 106
    .line 107
    .line 108
    const/16 v18, 0x0

    .line 109
    .line 110
    const v13, 0x4180f5c3    # 16.12f

    .line 111
    .line 112
    .line 113
    const v14, 0x3f35c28f    # 0.71f

    .line 114
    .line 115
    .line 116
    const v15, 0x41747ae1    # 15.28f

    .line 117
    .line 118
    .line 119
    const/16 v16, 0x0

    .line 120
    .line 121
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v0, 0x411b3333    # 9.7f

    .line 125
    .line 126
    .line 127
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v17, -0x40028f5c    # -1.98f

    .line 131
    .line 132
    .line 133
    const v18, 0x3fd5c28f    # 1.67f

    .line 134
    .line 135
    .line 136
    const v13, -0x40851eb8    # -0.98f

    .line 137
    .line 138
    .line 139
    const/4 v14, 0x0

    .line 140
    const v15, -0x40170a3d    # -1.82f

    .line 141
    .line 142
    .line 143
    const v16, 0x3f35c28f    # 0.71f

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v0, -0x40d47ae1    # -0.67f

    .line 150
    .line 151
    .line 152
    const v2, 0x4081eb85    # 4.06f

    .line 153
    .line 154
    .line 155
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v17, 0x40800000    # 4.0f

    .line 159
    .line 160
    const/high16 v18, 0x41400000    # 12.0f

    .line 161
    .line 162
    const v13, 0x40a6147b    # 5.19f

    .line 163
    .line 164
    .line 165
    const v14, 0x40e6147b    # 7.19f

    .line 166
    .line 167
    .line 168
    const/high16 v15, 0x40800000    # 4.0f

    .line 169
    .line 170
    const v16, 0x41173333    # 9.45f

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v0, 0x40433333    # 3.05f

    .line 177
    .line 178
    .line 179
    const v2, 0x40c8a3d7    # 6.27f

    .line 180
    .line 181
    .line 182
    const v4, 0x3f9851ec    # 1.19f

    .line 183
    .line 184
    .line 185
    const v6, 0x4099eb85    # 4.81f

    .line 186
    .line 187
    .line 188
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v0, 0x3f2b851f    # 0.67f

    .line 192
    .line 193
    .line 194
    const v2, 0x4081eb85    # 4.06f

    .line 195
    .line 196
    .line 197
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v17, 0x3ffd70a4    # 1.98f

    .line 201
    .line 202
    .line 203
    const v18, 0x3fd5c28f    # 1.67f

    .line 204
    .line 205
    .line 206
    const v13, 0x3e23d70a    # 0.16f

    .line 207
    .line 208
    .line 209
    const v14, 0x3f75c28f    # 0.96f

    .line 210
    .line 211
    .line 212
    const/high16 v15, 0x3f800000    # 1.0f

    .line 213
    .line 214
    const v16, 0x3fd5c28f    # 1.67f

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v0, 0x4093851f    # 4.61f

    .line 221
    .line 222
    .line 223
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v17, 0x3ffc28f6    # 1.97f

    .line 227
    .line 228
    .line 229
    const v18, -0x402a3d71    # -1.67f

    .line 230
    .line 231
    .line 232
    const v13, 0x3f7ae148    # 0.98f

    .line 233
    .line 234
    .line 235
    const/4 v14, 0x0

    .line 236
    const v15, 0x3fe7ae14    # 1.81f

    .line 237
    .line 238
    .line 239
    const v16, -0x40ca3d71    # -0.71f

    .line 240
    .line 241
    .line 242
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const v0, 0x3f2e147b    # 0.68f

    .line 246
    .line 247
    .line 248
    const v2, -0x3f7e147b    # -4.06f

    .line 249
    .line 250
    .line 251
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v17, 0x41a00000    # 20.0f

    .line 255
    .line 256
    const/high16 v18, 0x41400000    # 12.0f

    .line 257
    .line 258
    const v13, 0x41967ae1    # 18.81f

    .line 259
    .line 260
    .line 261
    const v14, 0x41867ae1    # 16.81f

    .line 262
    .line 263
    .line 264
    const/high16 v15, 0x41a00000    # 20.0f

    .line 265
    .line 266
    const v16, 0x4168a3d7    # 14.54f

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v0, 0x41400000    # 12.0f

    .line 276
    .line 277
    const/high16 v2, 0x40c00000    # 6.0f

    .line 278
    .line 279
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v17, 0x40c00000    # 6.0f

    .line 283
    .line 284
    const/high16 v18, -0x3f400000    # -6.0f

    .line 285
    .line 286
    const/4 v13, 0x0

    .line 287
    const v14, -0x3fac28f6    # -3.31f

    .line 288
    .line 289
    .line 290
    const v15, 0x402c28f6    # 2.69f

    .line 291
    .line 292
    .line 293
    const/high16 v16, -0x3f400000    # -6.0f

    .line 294
    .line 295
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v0, 0x402c28f6    # 2.69f

    .line 299
    .line 300
    .line 301
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v0, -0x3fd3d70a    # -2.69f

    .line 305
    .line 306
    .line 307
    const/high16 v2, -0x3f400000    # -6.0f

    .line 308
    .line 309
    const/high16 v4, 0x40c00000    # 6.0f

    .line 310
    .line 311
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 321
    .line 322
    .line 323
    move-result-object v2

    .line 324
    const/16 v16, 0x3800

    .line 325
    .line 326
    const/16 v17, 0x0

    .line 327
    .line 328
    const/high16 v6, 0x3f800000    # 1.0f

    .line 329
    .line 330
    const/high16 v8, 0x3f800000    # 1.0f

    .line 331
    .line 332
    const/4 v7, 0x0

    .line 333
    const/high16 v9, 0x3f800000    # 1.0f

    .line 334
    .line 335
    const/high16 v12, 0x3f800000    # 1.0f

    .line 336
    .line 337
    const/4 v14, 0x0

    .line 338
    const/4 v15, 0x0

    .line 339
    const-string v4, ""

    .line 340
    .line 341
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    sput-object v0, Landroidx/compose/material/icons/rounded/WatchKt;->_watch:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 350
    .line 351
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    return-object v0
.end method
