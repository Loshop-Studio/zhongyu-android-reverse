.class public final Landroidx/compose/material/icons/filled/CheckroomKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _checkroom:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCheckroom(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/CheckroomKt;->_checkroom:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.Checkroom"

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
    const v0, 0x41accccd    # 21.6f

    .line 71
    .line 72
    .line 73
    const v2, 0x4191999a    # 18.2f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v0, 0x41500000    # 13.0f

    .line 80
    .line 81
    const/high16 v2, 0x413c0000    # 11.75f

    .line 82
    .line 83
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const v0, -0x40970a3d    # -0.91f

    .line 87
    .line 88
    .line 89
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const v17, 0x401b851f    # 2.43f

    .line 93
    .line 94
    .line 95
    const v18, -0x3f7e6666    # -4.05f

    .line 96
    .line 97
    .line 98
    const v13, 0x3fd33333    # 1.65f

    .line 99
    .line 100
    .line 101
    const v14, -0x41051eb8    # -0.49f

    .line 102
    .line 103
    .line 104
    const v15, 0x40333333    # 2.8f

    .line 105
    .line 106
    .line 107
    const v16, -0x3ff51eb8    # -2.17f

    .line 108
    .line 109
    .line 110
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const v17, -0x3fd8f5c3    # -2.61f

    .line 114
    .line 115
    .line 116
    const v18, -0x3fd33333    # -2.7f

    .line 117
    .line 118
    .line 119
    const v13, -0x417ae148    # -0.26f

    .line 120
    .line 121
    .line 122
    const v14, -0x405851ec    # -1.31f

    .line 123
    .line 124
    .line 125
    const v15, -0x4059999a    # -1.3f

    .line 126
    .line 127
    .line 128
    const v16, -0x3fe66666    # -2.4f

    .line 129
    .line 130
    .line 131
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v17, 0x41080000    # 8.5f

    .line 135
    .line 136
    const/high16 v18, 0x40f00000    # 7.5f

    .line 137
    .line 138
    const v13, 0x4128a3d7    # 10.54f

    .line 139
    .line 140
    .line 141
    const v14, 0x40647ae1    # 3.57f

    .line 142
    .line 143
    .line 144
    const/high16 v15, 0x41080000    # 8.5f

    .line 145
    .line 146
    const v16, 0x40a9999a    # 5.3f

    .line 147
    .line 148
    .line 149
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v0, 0x40000000    # 2.0f

    .line 153
    .line 154
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const/high16 v17, 0x41400000    # 12.0f

    .line 158
    .line 159
    const/high16 v18, 0x40c00000    # 6.0f

    .line 160
    .line 161
    const/high16 v13, 0x41280000    # 10.5f

    .line 162
    .line 163
    const v14, 0x40d570a4    # 6.67f

    .line 164
    .line 165
    .line 166
    const v15, 0x4132b852    # 11.17f

    .line 167
    .line 168
    .line 169
    const/high16 v16, 0x40c00000    # 6.0f

    .line 170
    .line 171
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v0, 0x3f2b851f    # 0.67f

    .line 175
    .line 176
    .line 177
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 178
    .line 179
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v17, -0x403c28f6    # -1.53f

    .line 183
    .line 184
    .line 185
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 186
    .line 187
    const/4 v13, 0x0

    .line 188
    const v14, 0x3f570a3d    # 0.84f

    .line 189
    .line 190
    .line 191
    const v15, -0x40cf5c29    # -0.69f

    .line 192
    .line 193
    .line 194
    const v16, 0x3fc28f5c    # 1.52f

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v17, 0x41300000    # 11.0f

    .line 201
    .line 202
    const v18, 0x411fd70a    # 9.99f

    .line 203
    .line 204
    .line 205
    const v13, 0x4136e148    # 11.43f

    .line 206
    .line 207
    .line 208
    const v14, 0x410fd70a    # 8.99f

    .line 209
    .line 210
    .line 211
    const/high16 v15, 0x41300000    # 11.0f

    .line 212
    .line 213
    const v16, 0x41173333    # 9.45f

    .line 214
    .line 215
    .line 216
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v0, 0x3fe147ae    # 1.76f

    .line 220
    .line 221
    .line 222
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v0, 0x4019999a    # 2.4f

    .line 226
    .line 227
    .line 228
    const v2, 0x4191999a    # 18.2f

    .line 229
    .line 230
    .line 231
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v17, 0x40400000    # 3.0f

    .line 235
    .line 236
    const/high16 v18, 0x41a00000    # 20.0f

    .line 237
    .line 238
    const v13, 0x3fd0a3d7    # 1.63f

    .line 239
    .line 240
    .line 241
    const v14, 0x41963d71    # 18.78f

    .line 242
    .line 243
    .line 244
    const v15, 0x40028f5c    # 2.04f

    .line 245
    .line 246
    .line 247
    const/high16 v16, 0x41a00000    # 20.0f

    .line 248
    .line 249
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v0, 0x41100000    # 9.0f

    .line 253
    .line 254
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v17, 0x41accccd    # 21.6f

    .line 261
    .line 262
    .line 263
    const v18, 0x4191999a    # 18.2f

    .line 264
    .line 265
    .line 266
    const v13, 0x41afae14    # 21.96f

    .line 267
    .line 268
    .line 269
    const/high16 v14, 0x41a00000    # 20.0f

    .line 270
    .line 271
    const v15, 0x41b2f5c3    # 22.37f

    .line 272
    .line 273
    .line 274
    const v16, 0x41963d71    # 18.78f

    .line 275
    .line 276
    .line 277
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const/high16 v0, 0x41900000    # 18.0f

    .line 284
    .line 285
    const/high16 v2, 0x40c00000    # 6.0f

    .line 286
    .line 287
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v0, -0x3f700000    # -4.5f

    .line 291
    .line 292
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v0, 0x40900000    # 4.5f

    .line 296
    .line 297
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v0, 0x40c00000    # 6.0f

    .line 301
    .line 302
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    const/16 v16, 0x3800

    .line 313
    .line 314
    const/16 v17, 0x0

    .line 315
    .line 316
    const/high16 v6, 0x3f800000    # 1.0f

    .line 317
    .line 318
    const/high16 v8, 0x3f800000    # 1.0f

    .line 319
    .line 320
    const/4 v7, 0x0

    .line 321
    const/high16 v9, 0x3f800000    # 1.0f

    .line 322
    .line 323
    const/high16 v12, 0x3f800000    # 1.0f

    .line 324
    .line 325
    const/4 v13, 0x0

    .line 326
    const/4 v14, 0x0

    .line 327
    const/4 v15, 0x0

    .line 328
    const-string v4, ""

    .line 329
    .line 330
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    sput-object v0, Landroidx/compose/material/icons/filled/CheckroomKt;->_checkroom:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 339
    .line 340
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    return-object v0
.end method
