.class public final Landroidx/compose/material/icons/rounded/WaterDropKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _waterDrop:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWaterDrop(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/WaterDropKt;->_waterDrop:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.WaterDrop"

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
    const v0, 0x414a8f5c    # 12.66f

    .line 71
    .line 72
    .line 73
    const v2, 0x40251eb8    # 2.58f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x4055c28f    # -1.33f

    .line 80
    .line 81
    .line 82
    const/16 v18, 0x0

    .line 83
    .line 84
    const v13, -0x413d70a4    # -0.38f

    .line 85
    .line 86
    .line 87
    const v14, -0x41570a3d    # -0.33f

    .line 88
    .line 89
    .line 90
    const v15, -0x408ccccd    # -0.95f

    .line 91
    .line 92
    .line 93
    const v16, -0x41570a3d    # -0.33f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v17, 0x40800000    # 4.0f

    .line 100
    .line 101
    const v18, 0x415ccccd    # 13.8f

    .line 102
    .line 103
    .line 104
    const v13, 0x40ce6666    # 6.45f

    .line 105
    .line 106
    .line 107
    const v14, 0x40dc28f6    # 6.88f

    .line 108
    .line 109
    .line 110
    const/high16 v15, 0x40800000    # 4.0f

    .line 111
    .line 112
    const v16, 0x4129eb85    # 10.62f

    .line 113
    .line 114
    .line 115
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const/high16 v17, 0x41000000    # 8.0f

    .line 119
    .line 120
    const v18, 0x41033333    # 8.2f

    .line 121
    .line 122
    .line 123
    const/4 v13, 0x0

    .line 124
    const v14, 0x409f5c29    # 4.98f

    .line 125
    .line 126
    .line 127
    const v15, 0x40733333    # 3.8f

    .line 128
    .line 129
    .line 130
    const v16, 0x41033333    # 8.2f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v0, -0x3fb1eb85    # -3.22f

    .line 137
    .line 138
    .line 139
    const v2, -0x3efccccd    # -8.2f

    .line 140
    .line 141
    .line 142
    const/high16 v4, 0x41000000    # 8.0f

    .line 143
    .line 144
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v17, 0x414a8f5c    # 12.66f

    .line 148
    .line 149
    .line 150
    const v18, 0x40251eb8    # 2.58f

    .line 151
    .line 152
    .line 153
    const/high16 v13, 0x41a00000    # 20.0f

    .line 154
    .line 155
    const v14, 0x4129eb85    # 10.62f

    .line 156
    .line 157
    .line 158
    const v15, 0x418c6666    # 17.55f

    .line 159
    .line 160
    .line 161
    const v16, 0x40dc28f6    # 6.88f

    .line 162
    .line 163
    .line 164
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v0, 0x40fa8f5c    # 7.83f

    .line 171
    .line 172
    .line 173
    const/high16 v2, 0x41600000    # 14.0f

    .line 174
    .line 175
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v17, 0x3f3d70a4    # 0.74f

    .line 179
    .line 180
    .line 181
    const v18, 0x3f1eb852    # 0.62f

    .line 182
    .line 183
    .line 184
    const v13, 0x3ebd70a4    # 0.37f

    .line 185
    .line 186
    .line 187
    const/4 v14, 0x0

    .line 188
    const v15, 0x3f2b851f    # 0.67f

    .line 189
    .line 190
    .line 191
    const v16, 0x3e851eb8    # 0.26f

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v17, 0x4068f5c3    # 3.64f

    .line 198
    .line 199
    .line 200
    const v18, 0x4037ae14    # 2.87f

    .line 201
    .line 202
    .line 203
    const v13, 0x3ed1eb85    # 0.41f

    .line 204
    .line 205
    .line 206
    const v14, 0x400e147b    # 2.22f

    .line 207
    .line 208
    .line 209
    const v15, 0x4011eb85    # 2.28f

    .line 210
    .line 211
    .line 212
    const v16, 0x403eb852    # 2.98f

    .line 213
    .line 214
    .line 215
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v17, 0x3f4a3d71    # 0.79f

    .line 219
    .line 220
    .line 221
    const/high16 v18, 0x3f400000    # 0.75f

    .line 222
    .line 223
    const v13, 0x3edc28f6    # 0.43f

    .line 224
    .line 225
    .line 226
    const v14, -0x435c28f6    # -0.02f

    .line 227
    .line 228
    .line 229
    const v15, 0x3f4a3d71    # 0.79f

    .line 230
    .line 231
    .line 232
    const v16, 0x3ea3d70a    # 0.32f

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v17, -0x40c7ae14    # -0.72f

    .line 239
    .line 240
    .line 241
    const/4 v13, 0x0

    .line 242
    const v14, 0x3ecccccd    # 0.4f

    .line 243
    .line 244
    .line 245
    const v15, -0x415c28f6    # -0.32f

    .line 246
    .line 247
    .line 248
    const v16, 0x3f3ae148    # 0.73f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v17, -0x3f59eb85    # -5.19f

    .line 255
    .line 256
    .line 257
    const v18, -0x3f7c28f6    # -4.12f

    .line 258
    .line 259
    .line 260
    const v13, -0x3ff7ae14    # -2.13f

    .line 261
    .line 262
    .line 263
    const v14, 0x3e051eb8    # 0.13f

    .line 264
    .line 265
    .line 266
    const v15, -0x3f6c28f6    # -4.62f

    .line 267
    .line 268
    .line 269
    const v16, -0x40747ae1    # -1.09f

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v17, 0x40fa8f5c    # 7.83f

    .line 276
    .line 277
    .line 278
    const/high16 v18, 0x41600000    # 14.0f

    .line 279
    .line 280
    const v13, 0x40e051ec    # 7.01f

    .line 281
    .line 282
    .line 283
    const v14, 0x4166b852    # 14.42f

    .line 284
    .line 285
    .line 286
    const v15, 0x40ebd70a    # 7.37f

    .line 287
    .line 288
    .line 289
    const/high16 v16, 0x41600000    # 14.0f

    .line 290
    .line 291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 298
    .line 299
    .line 300
    move-result-object v2

    .line 301
    const/16 v16, 0x3800

    .line 302
    .line 303
    const/16 v17, 0x0

    .line 304
    .line 305
    const/high16 v6, 0x3f800000    # 1.0f

    .line 306
    .line 307
    const/high16 v8, 0x3f800000    # 1.0f

    .line 308
    .line 309
    const/4 v7, 0x0

    .line 310
    const/high16 v9, 0x3f800000    # 1.0f

    .line 311
    .line 312
    const/high16 v12, 0x3f800000    # 1.0f

    .line 313
    .line 314
    const/4 v13, 0x0

    .line 315
    const/4 v14, 0x0

    .line 316
    const/4 v15, 0x0

    .line 317
    const-string v4, ""

    .line 318
    .line 319
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    sput-object v0, Landroidx/compose/material/icons/rounded/WaterDropKt;->_waterDrop:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 328
    .line 329
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    return-object v0
.end method
