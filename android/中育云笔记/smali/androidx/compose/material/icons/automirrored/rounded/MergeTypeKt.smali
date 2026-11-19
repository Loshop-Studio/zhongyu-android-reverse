.class public final Landroidx/compose/material/icons/automirrored/rounded/MergeTypeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _mergeType:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMergeType(Landroidx/compose/material/icons/Icons$AutoMirrored$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/automirrored/rounded/MergeTypeKt;->_mergeType:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const/4 v10, 0x1

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
    const-string v2, "AutoMirrored.Rounded.MergeType"

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
    const v0, 0x418d999a    # 17.7f

    .line 71
    .line 72
    .line 73
    const v2, 0x419d999a    # 19.7f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/16 v17, 0x0

    .line 80
    .line 81
    const v18, -0x404b851f    # -1.41f

    .line 82
    .line 83
    .line 84
    const v13, 0x3ec7ae14    # 0.39f

    .line 85
    .line 86
    .line 87
    const v14, -0x413851ec    # -0.39f

    .line 88
    .line 89
    .line 90
    const v15, 0x3ec7ae14    # 0.39f

    .line 91
    .line 92
    .line 93
    const v16, -0x407d70a4    # -1.02f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v0, -0x3fd33333    # -2.7f

    .line 100
    .line 101
    .line 102
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v0, 0x415970a4    # 13.59f

    .line 106
    .line 107
    .line 108
    const/high16 v2, 0x41880000    # 17.0f

    .line 109
    .line 110
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const v0, 0x402ccccd    # 2.7f

    .line 114
    .line 115
    .line 116
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v17, 0x3fb47ae1    # 1.41f

    .line 120
    .line 121
    .line 122
    const/16 v18, 0x0

    .line 123
    .line 124
    const v14, 0x3ec7ae14    # 0.39f

    .line 125
    .line 126
    .line 127
    const v15, 0x3f83d70a    # 1.03f

    .line 128
    .line 129
    .line 130
    const v16, 0x3ec7ae14    # 0.39f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v0, 0x410b5c29    # 8.71f

    .line 140
    .line 141
    .line 142
    const/high16 v2, 0x41000000    # 8.0f

    .line 143
    .line 144
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v0, 0x41300000    # 11.0f

    .line 148
    .line 149
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v0, 0x40b2e148    # 5.59f

    .line 153
    .line 154
    .line 155
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v0, -0x3f6947ae    # -4.71f

    .line 159
    .line 160
    .line 161
    const v2, 0x40966666    # 4.7f

    .line 162
    .line 163
    .line 164
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/16 v17, 0x0

    .line 168
    .line 169
    const v18, 0x3fb47ae1    # 1.41f

    .line 170
    .line 171
    .line 172
    const v13, -0x413851ec    # -0.39f

    .line 173
    .line 174
    .line 175
    const v15, -0x413851ec    # -0.39f

    .line 176
    .line 177
    .line 178
    const v16, 0x3f828f5c    # 1.02f

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v17, 0x3fb47ae1    # 1.41f

    .line 185
    .line 186
    .line 187
    const/16 v18, 0x0

    .line 188
    .line 189
    const v13, 0x3ec7ae14    # 0.39f

    .line 190
    .line 191
    .line 192
    const v15, 0x3f828f5c    # 1.02f

    .line 193
    .line 194
    .line 195
    const v16, 0x3ec7ae14    # 0.39f

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v0, 0x4096b852    # 4.71f

    .line 202
    .line 203
    .line 204
    const v2, -0x3f69999a    # -4.7f

    .line 205
    .line 206
    .line 207
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v17, 0x3f170a3d    # 0.59f

    .line 211
    .line 212
    .line 213
    const v18, -0x404b851f    # -1.41f

    .line 214
    .line 215
    .line 216
    const v13, 0x3ec28f5c    # 0.38f

    .line 217
    .line 218
    .line 219
    const v14, -0x413d70a4    # -0.38f

    .line 220
    .line 221
    .line 222
    const v15, 0x3f170a3d    # 0.59f

    .line 223
    .line 224
    .line 225
    const v16, -0x409eb852    # -0.88f

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const/high16 v0, 0x41000000    # 8.0f

    .line 232
    .line 233
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v0, 0x40128f5c    # 2.29f

    .line 237
    .line 238
    .line 239
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const v17, 0x3eb33333    # 0.35f

    .line 243
    .line 244
    .line 245
    const v18, -0x40a66666    # -0.85f

    .line 246
    .line 247
    .line 248
    const v13, 0x3ee66666    # 0.45f

    .line 249
    .line 250
    .line 251
    const/4 v14, 0x0

    .line 252
    const v15, 0x3f2b851f    # 0.67f

    .line 253
    .line 254
    .line 255
    const v16, -0x40f5c28f    # -0.54f

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v0, -0x3fad70a4    # -3.29f

    .line 262
    .line 263
    .line 264
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v17, -0x40ca3d71    # -0.71f

    .line 268
    .line 269
    .line 270
    const/16 v18, 0x0

    .line 271
    .line 272
    const v13, -0x41b33333    # -0.2f

    .line 273
    .line 274
    .line 275
    const v14, -0x41b33333    # -0.2f

    .line 276
    .line 277
    .line 278
    const v15, -0x40fd70a4    # -0.51f

    .line 279
    .line 280
    .line 281
    const v16, -0x41b33333    # -0.2f

    .line 282
    .line 283
    .line 284
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const v0, 0x4105999a    # 8.35f

    .line 288
    .line 289
    .line 290
    const v2, 0x40e4cccd    # 7.15f

    .line 291
    .line 292
    .line 293
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v17, 0x3eb851ec    # 0.36f

    .line 297
    .line 298
    .line 299
    const v18, 0x3f59999a    # 0.85f

    .line 300
    .line 301
    .line 302
    const v13, -0x416147ae    # -0.31f

    .line 303
    .line 304
    .line 305
    const v14, 0x3e9eb852    # 0.31f

    .line 306
    .line 307
    .line 308
    const v15, -0x4247ae14    # -0.09f

    .line 309
    .line 310
    .line 311
    const v16, 0x3f59999a    # 0.85f

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/4 v13, 0x0

    .line 338
    const/4 v14, 0x0

    .line 339
    const/4 v15, 0x0

    .line 340
    const-string v4, ""

    .line 341
    .line 342
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    sput-object v0, Landroidx/compose/material/icons/automirrored/rounded/MergeTypeKt;->_mergeType:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 351
    .line 352
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 353
    .line 354
    .line 355
    return-object v0
.end method
