.class public final Landroidx/compose/material/icons/filled/BuildCircleKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _buildCircle:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBuildCircle(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/BuildCircleKt;->_buildCircle:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.BuildCircle"

    .line 33
    .line 34
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/n;)V

    .line 35
    .line 36
    .line 37
    sget-object v0, Landroidx/compose/ui/graphics/PathFillType;->Companion:Landroidx/compose/ui/graphics/PathFillType$Companion;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/PathFillType$Companion;->getEvenOdd-Rg-k1Os()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 44
    .line 45
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 46
    .line 47
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 48
    .line 49
    .line 50
    move-result-wide v6

    .line 51
    const/4 v0, 0x0

    .line 52
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 53
    .line 54
    .line 55
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 56
    .line 57
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 58
    .line 59
    .line 60
    move-result v10

    .line 61
    sget-object v0, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 62
    .line 63
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 64
    .line 65
    .line 66
    move-result v11

    .line 67
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 68
    .line 69
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    const/high16 v0, 0x41400000    # 12.0f

    .line 73
    .line 74
    const/high16 v2, 0x40000000    # 2.0f

    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v17, 0x40000000    # 2.0f

    .line 80
    .line 81
    const/high16 v18, 0x41400000    # 12.0f

    .line 82
    .line 83
    const v13, 0x40cf5c29    # 6.48f

    .line 84
    .line 85
    .line 86
    const/high16 v14, 0x40000000    # 2.0f

    .line 87
    .line 88
    const/high16 v15, 0x40000000    # 2.0f

    .line 89
    .line 90
    const v16, 0x40cf5c29    # 6.48f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v17, 0x41200000    # 10.0f

    .line 97
    .line 98
    const/high16 v18, 0x41200000    # 10.0f

    .line 99
    .line 100
    const/4 v13, 0x0

    .line 101
    const v14, 0x40b0a3d7    # 5.52f

    .line 102
    .line 103
    .line 104
    const v15, 0x408f5c29    # 4.48f

    .line 105
    .line 106
    .line 107
    const/high16 v16, 0x41200000    # 10.0f

    .line 108
    .line 109
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v0, -0x3f70a3d7    # -4.48f

    .line 113
    .line 114
    .line 115
    const/high16 v2, -0x3ee00000    # -10.0f

    .line 116
    .line 117
    const/high16 v4, 0x41200000    # 10.0f

    .line 118
    .line 119
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v17, 0x41400000    # 12.0f

    .line 123
    .line 124
    const/high16 v18, 0x40000000    # 2.0f

    .line 125
    .line 126
    const/high16 v13, 0x41b00000    # 22.0f

    .line 127
    .line 128
    const v14, 0x40cf5c29    # 6.48f

    .line 129
    .line 130
    .line 131
    const v15, 0x418c28f6    # 17.52f

    .line 132
    .line 133
    .line 134
    const/high16 v16, 0x40000000    # 2.0f

    .line 135
    .line 136
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v0, 0x41873333    # 16.9f

    .line 143
    .line 144
    .line 145
    const v2, 0x4177d70a    # 15.49f

    .line 146
    .line 147
    .line 148
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v0, -0x404ccccd    # -1.4f

    .line 152
    .line 153
    .line 154
    const v2, 0x3fb33333    # 1.4f

    .line 155
    .line 156
    .line 157
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v17, -0x40ca3d71    # -0.71f

    .line 161
    .line 162
    .line 163
    const/16 v18, 0x0

    .line 164
    .line 165
    const v13, -0x41b33333    # -0.2f

    .line 166
    .line 167
    .line 168
    const v14, 0x3e4ccccd    # 0.2f

    .line 169
    .line 170
    .line 171
    const v15, -0x40fd70a4    # -0.51f

    .line 172
    .line 173
    .line 174
    const v16, 0x3e4ccccd    # 0.2f

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v0, -0x3fa5c28f    # -3.41f

    .line 181
    .line 182
    .line 183
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v17, -0x3f9851ec    # -3.62f

    .line 187
    .line 188
    .line 189
    const v18, -0x40b0a3d7    # -0.81f

    .line 190
    .line 191
    .line 192
    const v13, -0x4063d70a    # -1.22f

    .line 193
    .line 194
    .line 195
    const v14, 0x3edc28f6    # 0.43f

    .line 196
    .line 197
    .line 198
    const v15, -0x3fd70a3d    # -2.64f

    .line 199
    .line 200
    .line 201
    const v16, 0x3e2e147b    # 0.17f

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v17, -0x40e8f5c3    # -0.59f

    .line 208
    .line 209
    .line 210
    const v18, -0x3f7ccccd    # -4.1f

    .line 211
    .line 212
    .line 213
    const v13, -0x4071eb85    # -1.11f

    .line 214
    .line 215
    .line 216
    const v14, -0x4071eb85    # -1.11f

    .line 217
    .line 218
    .line 219
    const v15, -0x4059999a    # -1.3f

    .line 220
    .line 221
    .line 222
    const v16, -0x3fcd70a4    # -2.79f

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v0, 0x40166666    # 2.35f

    .line 229
    .line 230
    .line 231
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v0, 0x3fb47ae1    # 1.41f

    .line 235
    .line 236
    .line 237
    const v2, -0x404b851f    # -1.41f

    .line 238
    .line 239
    .line 240
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v0, 0x410947ae    # 8.58f

    .line 244
    .line 245
    .line 246
    const v2, 0x40e570a4    # 7.17f

    .line 247
    .line 248
    .line 249
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v17, 0x40833333    # 4.1f

    .line 253
    .line 254
    .line 255
    const v18, 0x3f170a3d    # 0.59f

    .line 256
    .line 257
    .line 258
    const v13, 0x3fa8f5c3    # 1.32f

    .line 259
    .line 260
    .line 261
    const v14, -0x40ca3d71    # -0.71f

    .line 262
    .line 263
    .line 264
    const v15, 0x403f5c29    # 2.99f

    .line 265
    .line 266
    .line 267
    const v16, -0x40fae148    # -0.52f

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v17, 0x3f4f5c29    # 0.81f

    .line 274
    .line 275
    .line 276
    const v18, 0x4067ae14    # 3.62f

    .line 277
    .line 278
    .line 279
    const v13, 0x3f7ae148    # 0.98f

    .line 280
    .line 281
    .line 282
    const v14, 0x3f7ae148    # 0.98f

    .line 283
    .line 284
    .line 285
    const v15, 0x3f9eb852    # 1.24f

    .line 286
    .line 287
    .line 288
    const v16, 0x4019999a    # 2.4f

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v0, 0x405a3d71    # 3.41f

    .line 295
    .line 296
    .line 297
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v17, 0x41873333    # 16.9f

    .line 301
    .line 302
    .line 303
    const v18, 0x4177d70a    # 15.49f

    .line 304
    .line 305
    .line 306
    const v13, 0x4188b852    # 17.09f

    .line 307
    .line 308
    .line 309
    const v14, 0x416fae14    # 14.98f

    .line 310
    .line 311
    .line 312
    const v15, 0x4188b852    # 17.09f

    .line 313
    .line 314
    .line 315
    const v16, 0x4174cccd    # 15.3f

    .line 316
    .line 317
    .line 318
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 325
    .line 326
    .line 327
    move-result-object v2

    .line 328
    const/16 v16, 0x3800

    .line 329
    .line 330
    const/16 v17, 0x0

    .line 331
    .line 332
    const/high16 v6, 0x3f800000    # 1.0f

    .line 333
    .line 334
    const/high16 v8, 0x3f800000    # 1.0f

    .line 335
    .line 336
    const/4 v7, 0x0

    .line 337
    const/high16 v9, 0x3f800000    # 1.0f

    .line 338
    .line 339
    const/high16 v12, 0x3f800000    # 1.0f

    .line 340
    .line 341
    const/4 v13, 0x0

    .line 342
    const/4 v14, 0x0

    .line 343
    const/4 v15, 0x0

    .line 344
    const-string v4, ""

    .line 345
    .line 346
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    sput-object v0, Landroidx/compose/material/icons/filled/BuildCircleKt;->_buildCircle:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 355
    .line 356
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 357
    .line 358
    .line 359
    return-object v0
.end method
