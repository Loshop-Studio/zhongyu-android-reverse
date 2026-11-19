.class public final Landroidx/compose/material/icons/rounded/ReplayKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _replay:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getReplay(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ReplayKt;->_replay:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Replay"

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
    const/high16 v2, 0x40a00000    # 5.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v0, 0x400d70a4    # 2.21f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v17, -0x40a66666    # -0.85f

    .line 84
    .line 85
    .line 86
    const v18, -0x414ccccd    # -0.35f

    .line 87
    .line 88
    .line 89
    const/4 v13, 0x0

    .line 90
    const v14, -0x4119999a    # -0.45f

    .line 91
    .line 92
    .line 93
    const v15, -0x40f5c28f    # -0.54f

    .line 94
    .line 95
    .line 96
    const v16, -0x40d47ae1    # -0.67f

    .line 97
    .line 98
    .line 99
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v0, -0x3f8ccccd    # -3.8f

    .line 103
    .line 104
    .line 105
    const v2, 0x40728f5c    # 3.79f

    .line 106
    .line 107
    .line 108
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/16 v17, 0x0

    .line 112
    .line 113
    const v18, 0x3f35c28f    # 0.71f

    .line 114
    .line 115
    .line 116
    const v13, -0x41b33333    # -0.2f

    .line 117
    .line 118
    .line 119
    const v14, 0x3e4ccccd    # 0.2f

    .line 120
    .line 121
    .line 122
    const v15, -0x41b33333    # -0.2f

    .line 123
    .line 124
    .line 125
    const v16, 0x3f028f5c    # 0.51f

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v0, 0x40728f5c    # 3.79f

    .line 132
    .line 133
    .line 134
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v17, 0x3f5c28f6    # 0.86f

    .line 138
    .line 139
    .line 140
    const v18, -0x4147ae14    # -0.36f

    .line 141
    .line 142
    .line 143
    const v13, 0x3ea3d70a    # 0.32f

    .line 144
    .line 145
    .line 146
    const v14, 0x3e9eb852    # 0.31f

    .line 147
    .line 148
    .line 149
    const v15, 0x3f5c28f6    # 0.86f

    .line 150
    .line 151
    .line 152
    const v16, 0x3db851ec    # 0.09f

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v0, 0x40e00000    # 7.0f

    .line 159
    .line 160
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v17, 0x40bb851f    # 5.86f

    .line 164
    .line 165
    .line 166
    const v18, 0x40e947ae    # 7.29f

    .line 167
    .line 168
    .line 169
    const v13, 0x406eb852    # 3.73f

    .line 170
    .line 171
    .line 172
    const/4 v14, 0x0

    .line 173
    const v15, 0x40d5c28f    # 6.68f

    .line 174
    .line 175
    .line 176
    const v16, 0x405ae148    # 3.42f

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v17, -0x3f6dc28f    # -4.57f

    .line 183
    .line 184
    .line 185
    const v18, 0x40923d71    # 4.57f

    .line 186
    .line 187
    .line 188
    const v13, -0x410f5c29    # -0.47f

    .line 189
    .line 190
    .line 191
    const v14, 0x401147ae    # 2.27f

    .line 192
    .line 193
    .line 194
    const v15, -0x3fec28f6    # -2.31f

    .line 195
    .line 196
    .line 197
    const v16, 0x40833333    # 4.1f

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const v17, -0x3f18a3d7    # -7.23f

    .line 204
    .line 205
    .line 206
    const v18, -0x3f5fae14    # -5.01f

    .line 207
    .line 208
    .line 209
    const v13, -0x3f9b851f    # -3.57f

    .line 210
    .line 211
    .line 212
    const/high16 v14, 0x3f400000    # 0.75f

    .line 213
    .line 214
    const/high16 v15, -0x3f280000    # -6.75f

    .line 215
    .line 216
    const v16, -0x40266666    # -1.7f

    .line 217
    .line 218
    .line 219
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v17, -0x40851eb8    # -0.98f

    .line 223
    .line 224
    .line 225
    const v18, -0x40a66666    # -0.85f

    .line 226
    .line 227
    .line 228
    const v13, -0x4270a3d7    # -0.07f

    .line 229
    .line 230
    .line 231
    const v14, -0x410a3d71    # -0.48f

    .line 232
    .line 233
    .line 234
    const v15, -0x41051eb8    # -0.49f

    .line 235
    .line 236
    .line 237
    const v16, -0x40a66666    # -0.85f

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v17, -0x40800000    # -1.0f

    .line 244
    .line 245
    const v18, 0x3f90a3d7    # 1.13f

    .line 246
    .line 247
    .line 248
    const v13, -0x40e66666    # -0.6f

    .line 249
    .line 250
    .line 251
    const/4 v14, 0x0

    .line 252
    const v15, -0x4075c28f    # -1.08f

    .line 253
    .line 254
    .line 255
    const v16, 0x3f07ae14    # 0.53f

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v17, 0x41187ae1    # 9.53f

    .line 262
    .line 263
    .line 264
    const v18, 0x40d70a3d    # 6.72f

    .line 265
    .line 266
    .line 267
    const v13, 0x3f1eb852    # 0.62f

    .line 268
    .line 269
    .line 270
    const v14, 0x408c7ae1    # 4.39f

    .line 271
    .line 272
    .line 273
    const v15, 0x4099999a    # 4.8f

    .line 274
    .line 275
    .line 276
    const v16, 0x40f47ae1    # 7.64f

    .line 277
    .line 278
    .line 279
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v17, 0x40c7ae14    # 6.24f

    .line 283
    .line 284
    .line 285
    const v18, -0x3f3851ec    # -6.24f

    .line 286
    .line 287
    .line 288
    const v13, 0x4047ae14    # 3.12f

    .line 289
    .line 290
    .line 291
    const v14, -0x40e3d70a    # -0.61f

    .line 292
    .line 293
    .line 294
    const v15, 0x40b428f6    # 5.63f

    .line 295
    .line 296
    .line 297
    const v16, -0x3fb851ec    # -3.12f

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v17, 0x41400000    # 12.0f

    .line 304
    .line 305
    const/high16 v18, 0x40a00000    # 5.0f

    .line 306
    .line 307
    const v13, 0x41a6b852    # 20.84f

    .line 308
    .line 309
    .line 310
    const v14, 0x4117ae14    # 9.48f

    .line 311
    .line 312
    .line 313
    const v15, 0x4187851f    # 16.94f

    .line 314
    .line 315
    .line 316
    const/high16 v16, 0x40a00000    # 5.0f

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
    sput-object v0, Landroidx/compose/material/icons/rounded/ReplayKt;->_replay:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 355
    .line 356
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 357
    .line 358
    .line 359
    return-object v0
.end method
