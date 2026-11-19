.class public final Landroidx/compose/material/icons/filled/WhatshotKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _whatshot:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWhatshot(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/WhatshotKt;->_whatshot:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.Whatshot"

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
    const/high16 v0, 0x41580000    # 13.5f

    .line 71
    .line 72
    const v2, 0x3f2b851f    # 0.67f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v0, 0x4029999a    # 2.65f

    .line 79
    .line 80
    .line 81
    const v2, 0x4099999a    # 4.8f

    .line 82
    .line 83
    .line 84
    const v4, 0x3f3d70a4    # 0.74f

    .line 85
    .line 86
    .line 87
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    .line 90
    const v17, -0x3fa5c28f    # -3.41f

    .line 91
    .line 92
    .line 93
    const v18, 0x406eb852    # 3.73f

    .line 94
    .line 95
    .line 96
    const/4 v13, 0x0

    .line 97
    const v14, 0x4003d70a    # 2.06f

    .line 98
    .line 99
    .line 100
    const v15, -0x40533333    # -1.35f

    .line 101
    .line 102
    .line 103
    const v16, 0x406eb852    # 3.73f

    .line 104
    .line 105
    .line 106
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v17, -0x3f97ae14    # -3.63f

    .line 110
    .line 111
    .line 112
    const v18, -0x3f9147ae    # -3.73f

    .line 113
    .line 114
    .line 115
    const v13, -0x3ffb851f    # -2.07f

    .line 116
    .line 117
    .line 118
    const/4 v14, 0x0

    .line 119
    const v15, -0x3f97ae14    # -3.63f

    .line 120
    .line 121
    .line 122
    const v16, -0x402a3d71    # -1.67f

    .line 123
    .line 124
    .line 125
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v0, 0x3cf5c28f    # 0.03f

    .line 129
    .line 130
    .line 131
    const v2, -0x4147ae14    # -0.36f

    .line 132
    .line 133
    .line 134
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v17, 0x40800000    # 4.0f

    .line 138
    .line 139
    const/high16 v18, 0x41600000    # 14.0f

    .line 140
    .line 141
    const v13, 0x40a6b852    # 5.21f

    .line 142
    .line 143
    .line 144
    const v14, 0x40f051ec    # 7.51f

    .line 145
    .line 146
    .line 147
    const/high16 v15, 0x40800000    # 4.0f

    .line 148
    .line 149
    const v16, 0x4129eb85    # 10.62f

    .line 150
    .line 151
    .line 152
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const/high16 v17, 0x41000000    # 8.0f

    .line 156
    .line 157
    const/high16 v18, 0x41000000    # 8.0f

    .line 158
    .line 159
    const/4 v13, 0x0

    .line 160
    const v14, 0x408d70a4    # 4.42f

    .line 161
    .line 162
    .line 163
    const v15, 0x40651eb8    # 3.58f

    .line 164
    .line 165
    .line 166
    const/high16 v16, 0x41000000    # 8.0f

    .line 167
    .line 168
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v0, -0x3f9ae148    # -3.58f

    .line 172
    .line 173
    .line 174
    const/high16 v2, -0x3f000000    # -8.0f

    .line 175
    .line 176
    const/high16 v4, 0x41000000    # 8.0f

    .line 177
    .line 178
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v17, 0x41580000    # 13.5f

    .line 182
    .line 183
    const v18, 0x3f2b851f    # 0.67f

    .line 184
    .line 185
    .line 186
    const/high16 v13, 0x41a00000    # 20.0f

    .line 187
    .line 188
    const v14, 0x4109c28f    # 8.61f

    .line 189
    .line 190
    .line 191
    const v15, 0x418b47ae    # 17.41f

    .line 192
    .line 193
    .line 194
    const v16, 0x40733333    # 3.8f

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const v0, 0x413b5c29    # 11.71f

    .line 204
    .line 205
    .line 206
    const/high16 v2, 0x41980000    # 19.0f

    .line 207
    .line 208
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v17, -0x3fb1eb85    # -3.22f

    .line 212
    .line 213
    .line 214
    const v18, -0x3fb70a3d    # -3.14f

    .line 215
    .line 216
    .line 217
    const v13, -0x401c28f6    # -1.78f

    .line 218
    .line 219
    .line 220
    const/4 v14, 0x0

    .line 221
    const v15, -0x3fb1eb85    # -3.22f

    .line 222
    .line 223
    .line 224
    const v16, -0x404ccccd    # -1.4f

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v17, 0x4033d70a    # 2.81f

    .line 231
    .line 232
    .line 233
    const v18, -0x3fb851ec    # -3.12f

    .line 234
    .line 235
    .line 236
    const/4 v13, 0x0

    .line 237
    const v14, -0x4030a3d7    # -1.62f

    .line 238
    .line 239
    .line 240
    const v15, 0x3f866666    # 1.05f

    .line 241
    .line 242
    .line 243
    const v16, -0x3fcf5c29    # -2.76f

    .line 244
    .line 245
    .line 246
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v17, 0x4093d70a    # 4.62f

    .line 250
    .line 251
    .line 252
    const v18, -0x3fdae148    # -2.58f

    .line 253
    .line 254
    .line 255
    const v13, 0x3fe28f5c    # 1.77f

    .line 256
    .line 257
    .line 258
    const v14, -0x4147ae14    # -0.36f

    .line 259
    .line 260
    .line 261
    const v15, 0x40666666    # 3.6f

    .line 262
    .line 263
    .line 264
    const v16, -0x40651eb8    # -1.21f

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v17, 0x3f170a3d    # 0.59f

    .line 271
    .line 272
    .line 273
    const v18, 0x408147ae    # 4.04f

    .line 274
    .line 275
    .line 276
    const v13, 0x3ec7ae14    # 0.39f

    .line 277
    .line 278
    .line 279
    const v14, 0x3fa51eb8    # 1.29f

    .line 280
    .line 281
    .line 282
    const v15, 0x3f170a3d    # 0.59f

    .line 283
    .line 284
    .line 285
    const v16, 0x4029999a    # 2.65f

    .line 286
    .line 287
    .line 288
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v17, -0x3f666666    # -4.8f

    .line 292
    .line 293
    .line 294
    const v18, 0x4099999a    # 4.8f

    .line 295
    .line 296
    .line 297
    const/4 v13, 0x0

    .line 298
    const v14, 0x4029999a    # 2.65f

    .line 299
    .line 300
    .line 301
    const v15, -0x3ff66666    # -2.15f

    .line 302
    .line 303
    .line 304
    const v16, 0x4099999a    # 4.8f

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    const/16 v16, 0x3800

    .line 318
    .line 319
    const/16 v17, 0x0

    .line 320
    .line 321
    const/high16 v6, 0x3f800000    # 1.0f

    .line 322
    .line 323
    const/high16 v8, 0x3f800000    # 1.0f

    .line 324
    .line 325
    const/4 v7, 0x0

    .line 326
    const/high16 v9, 0x3f800000    # 1.0f

    .line 327
    .line 328
    const/high16 v12, 0x3f800000    # 1.0f

    .line 329
    .line 330
    const/4 v14, 0x0

    .line 331
    const/4 v15, 0x0

    .line 332
    const-string v4, ""

    .line 333
    .line 334
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    sput-object v0, Landroidx/compose/material/icons/filled/WhatshotKt;->_whatshot:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 343
    .line 344
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    return-object v0
.end method
