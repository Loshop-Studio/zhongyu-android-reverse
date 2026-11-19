.class public final Landroidx/compose/material/icons/rounded/IcecreamKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _icecream:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getIcecream(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/IcecreamKt;->_icecream:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Icecream"

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
    const v0, 0x41930a3d    # 18.38f

    .line 71
    .line 72
    .line 73
    const v2, 0x40c7ae14    # 6.24f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v17, 0x41400000    # 12.0f

    .line 80
    .line 81
    const/high16 v18, 0x3f800000    # 1.0f

    .line 82
    .line 83
    const v13, 0x418e51ec    # 17.79f

    .line 84
    .line 85
    .line 86
    const v14, 0x404f5c29    # 3.24f

    .line 87
    .line 88
    .line 89
    const v15, 0x41723d71    # 15.14f

    .line 90
    .line 91
    .line 92
    const/high16 v16, 0x3f800000    # 1.0f

    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v0, 0x404f5c29    # 3.24f

    .line 98
    .line 99
    .line 100
    const v2, 0x40b3d70a    # 5.62f

    .line 101
    .line 102
    .line 103
    const v4, 0x40c7ae14    # 6.24f

    .line 104
    .line 105
    .line 106
    const v6, 0x40c6b852    # 6.21f

    .line 107
    .line 108
    .line 109
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const/high16 v17, 0x40400000    # 3.0f

    .line 113
    .line 114
    const/high16 v18, 0x41200000    # 10.0f

    .line 115
    .line 116
    const v13, 0x40828f5c    # 4.08f

    .line 117
    .line 118
    .line 119
    const v14, 0x40d9eb85    # 6.81f

    .line 120
    .line 121
    .line 122
    const/high16 v15, 0x40400000    # 3.0f

    .line 123
    .line 124
    const v16, 0x4104a3d7    # 8.29f

    .line 125
    .line 126
    .line 127
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const/high16 v17, 0x40800000    # 4.0f

    .line 131
    .line 132
    const/high16 v18, 0x40800000    # 4.0f

    .line 133
    .line 134
    const/4 v13, 0x0

    .line 135
    const v14, 0x400d70a4    # 2.21f

    .line 136
    .line 137
    .line 138
    const v15, 0x3fe51eb8    # 1.79f

    .line 139
    .line 140
    .line 141
    const/high16 v16, 0x40800000    # 4.0f

    .line 142
    .line 143
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const v17, 0x3eae147b    # 0.34f

    .line 147
    .line 148
    .line 149
    const v18, -0x435c28f6    # -0.02f

    .line 150
    .line 151
    .line 152
    const v13, 0x3df5c28f    # 0.12f

    .line 153
    .line 154
    .line 155
    const/4 v14, 0x0

    .line 156
    const v15, 0x3e6b851f    # 0.23f

    .line 157
    .line 158
    .line 159
    const v16, -0x435c28f6    # -0.02f

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v0, 0x40751eb8    # 3.83f

    .line 166
    .line 167
    .line 168
    const v2, 0x40e9eb85    # 7.31f

    .line 169
    .line 170
    .line 171
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v17, 0x3fe3d70a    # 1.78f

    .line 175
    .line 176
    .line 177
    const v18, -0x43dc28f6    # -0.01f

    .line 178
    .line 179
    .line 180
    const v13, 0x3ec28f5c    # 0.38f

    .line 181
    .line 182
    .line 183
    const v14, 0x3f3851ec    # 0.72f

    .line 184
    .line 185
    .line 186
    const v15, 0x3fb47ae1    # 1.41f

    .line 187
    .line 188
    .line 189
    const v16, 0x3f35c28f    # 0.71f

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v0, 0x406eb852    # 3.73f

    .line 196
    .line 197
    .line 198
    const v2, -0x3f16147b    # -7.31f

    .line 199
    .line 200
    .line 201
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v17, 0x41880000    # 17.0f

    .line 205
    .line 206
    const/high16 v18, 0x41600000    # 14.0f

    .line 207
    .line 208
    const v13, 0x418651ec    # 16.79f

    .line 209
    .line 210
    .line 211
    const v14, 0x415fae14    # 13.98f

    .line 212
    .line 213
    .line 214
    const v15, 0x41871eb8    # 16.89f

    .line 215
    .line 216
    .line 217
    const/high16 v16, 0x41600000    # 14.0f

    .line 218
    .line 219
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const/high16 v17, 0x40800000    # 4.0f

    .line 223
    .line 224
    const/high16 v18, -0x3f800000    # -4.0f

    .line 225
    .line 226
    const v13, 0x400d70a4    # 2.21f

    .line 227
    .line 228
    .line 229
    const/4 v14, 0x0

    .line 230
    const/high16 v15, 0x40800000    # 4.0f

    .line 231
    .line 232
    const v16, -0x401ae148    # -1.79f

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v17, 0x41930a3d    # 18.38f

    .line 239
    .line 240
    .line 241
    const v18, 0x40c7ae14    # 6.24f

    .line 242
    .line 243
    .line 244
    const/high16 v13, 0x41a80000    # 21.0f

    .line 245
    .line 246
    const v14, 0x4104a3d7    # 8.29f

    .line 247
    .line 248
    .line 249
    const v15, 0x419f5c29    # 19.92f

    .line 250
    .line 251
    .line 252
    const v16, 0x40d9eb85    # 6.81f

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v0, 0x41950a3d    # 18.63f

    .line 262
    .line 263
    .line 264
    const v2, 0x4140cccd    # 12.05f

    .line 265
    .line 266
    .line 267
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v0, -0x3fd147ae    # -2.73f

    .line 271
    .line 272
    .line 273
    const v2, -0x3f5947ae    # -5.21f

    .line 274
    .line 275
    .line 276
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const/high16 v17, 0x41400000    # 12.0f

    .line 280
    .line 281
    const/high16 v18, 0x41600000    # 14.0f

    .line 282
    .line 283
    const v13, 0x41226666    # 10.15f

    .line 284
    .line 285
    .line 286
    const v14, 0x415ca3d7    # 13.79f

    .line 287
    .line 288
    .line 289
    const v15, 0x4130f5c3    # 11.06f

    .line 290
    .line 291
    .line 292
    const/high16 v16, 0x41600000    # 14.0f

    .line 293
    .line 294
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v17, 0x402e147b    # 2.72f

    .line 298
    .line 299
    .line 300
    const v18, -0x40e66666    # -0.6f

    .line 301
    .line 302
    .line 303
    const v13, 0x3f733333    # 0.95f

    .line 304
    .line 305
    .line 306
    const/4 v14, 0x0

    .line 307
    const v15, 0x3ff0a3d7    # 1.88f

    .line 308
    .line 309
    .line 310
    const v16, -0x41a8f5c3    # -0.21f

    .line 311
    .line 312
    .line 313
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const v0, 0x41950a3d    # 18.63f

    .line 317
    .line 318
    .line 319
    const v2, 0x4140cccd    # 12.05f

    .line 320
    .line 321
    .line 322
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 329
    .line 330
    .line 331
    move-result-object v2

    .line 332
    const/16 v16, 0x3800

    .line 333
    .line 334
    const/16 v17, 0x0

    .line 335
    .line 336
    const/high16 v6, 0x3f800000    # 1.0f

    .line 337
    .line 338
    const/high16 v8, 0x3f800000    # 1.0f

    .line 339
    .line 340
    const/4 v7, 0x0

    .line 341
    const/high16 v9, 0x3f800000    # 1.0f

    .line 342
    .line 343
    const/high16 v12, 0x3f800000    # 1.0f

    .line 344
    .line 345
    const/4 v13, 0x0

    .line 346
    const/4 v15, 0x0

    .line 347
    const-string v4, ""

    .line 348
    .line 349
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    sput-object v0, Landroidx/compose/material/icons/rounded/IcecreamKt;->_icecream:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 358
    .line 359
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    return-object v0
.end method
