.class public final Landroidx/compose/material/icons/filled/WaterDropKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _waterDrop:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWaterDrop(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/WaterDropKt;->_waterDrop:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.WaterDrop"

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
    const/high16 v2, 0x40000000    # 2.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x3f000000    # -8.0f

    .line 78
    .line 79
    const v18, 0x413ccccd    # 11.8f

    .line 80
    .line 81
    .line 82
    const v13, -0x3f5570a4    # -5.33f

    .line 83
    .line 84
    .line 85
    const v14, 0x4091999a    # 4.55f

    .line 86
    .line 87
    .line 88
    const/high16 v15, -0x3f000000    # -8.0f

    .line 89
    .line 90
    const v16, 0x4107ae14    # 8.48f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v17, 0x41000000    # 8.0f

    .line 97
    .line 98
    const v18, 0x41033333    # 8.2f

    .line 99
    .line 100
    .line 101
    const/4 v13, 0x0

    .line 102
    const v14, 0x409f5c29    # 4.98f

    .line 103
    .line 104
    .line 105
    const v15, 0x40733333    # 3.8f

    .line 106
    .line 107
    .line 108
    const v16, 0x41033333    # 8.2f

    .line 109
    .line 110
    .line 111
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v0, -0x3fb1eb85    # -3.22f

    .line 115
    .line 116
    .line 117
    const v2, -0x3efccccd    # -8.2f

    .line 118
    .line 119
    .line 120
    const/high16 v4, 0x41000000    # 8.0f

    .line 121
    .line 122
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v17, 0x41400000    # 12.0f

    .line 126
    .line 127
    const/high16 v18, 0x40000000    # 2.0f

    .line 128
    .line 129
    const/high16 v13, 0x41a00000    # 20.0f

    .line 130
    .line 131
    const v14, 0x4127ae14    # 10.48f

    .line 132
    .line 133
    .line 134
    const v15, 0x418aa3d7    # 17.33f

    .line 135
    .line 136
    .line 137
    const v16, 0x40d1999a    # 6.55f

    .line 138
    .line 139
    .line 140
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const v0, 0x40fa8f5c    # 7.83f

    .line 147
    .line 148
    .line 149
    const/high16 v2, 0x41600000    # 14.0f

    .line 150
    .line 151
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v17, 0x3f3d70a4    # 0.74f

    .line 155
    .line 156
    .line 157
    const v18, 0x3f1eb852    # 0.62f

    .line 158
    .line 159
    .line 160
    const v13, 0x3ebd70a4    # 0.37f

    .line 161
    .line 162
    .line 163
    const/4 v14, 0x0

    .line 164
    const v15, 0x3f2b851f    # 0.67f

    .line 165
    .line 166
    .line 167
    const v16, 0x3e851eb8    # 0.26f

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v17, 0x4068f5c3    # 3.64f

    .line 174
    .line 175
    .line 176
    const v18, 0x4037ae14    # 2.87f

    .line 177
    .line 178
    .line 179
    const v13, 0x3ed1eb85    # 0.41f

    .line 180
    .line 181
    .line 182
    const v14, 0x400e147b    # 2.22f

    .line 183
    .line 184
    .line 185
    const v15, 0x4011eb85    # 2.28f

    .line 186
    .line 187
    .line 188
    const v16, 0x403eb852    # 2.98f

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v17, 0x3f4a3d71    # 0.79f

    .line 195
    .line 196
    .line 197
    const/high16 v18, 0x3f400000    # 0.75f

    .line 198
    .line 199
    const v13, 0x3edc28f6    # 0.43f

    .line 200
    .line 201
    .line 202
    const v14, -0x435c28f6    # -0.02f

    .line 203
    .line 204
    .line 205
    const v15, 0x3f4a3d71    # 0.79f

    .line 206
    .line 207
    .line 208
    const v16, 0x3ea3d70a    # 0.32f

    .line 209
    .line 210
    .line 211
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v17, -0x40c7ae14    # -0.72f

    .line 215
    .line 216
    .line 217
    const/4 v13, 0x0

    .line 218
    const v14, 0x3ecccccd    # 0.4f

    .line 219
    .line 220
    .line 221
    const v15, -0x415c28f6    # -0.32f

    .line 222
    .line 223
    .line 224
    const v16, 0x3f3ae148    # 0.73f

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v17, -0x3f59eb85    # -5.19f

    .line 231
    .line 232
    .line 233
    const v18, -0x3f7c28f6    # -4.12f

    .line 234
    .line 235
    .line 236
    const v13, -0x3ff7ae14    # -2.13f

    .line 237
    .line 238
    .line 239
    const v14, 0x3e051eb8    # 0.13f

    .line 240
    .line 241
    .line 242
    const v15, -0x3f6c28f6    # -4.62f

    .line 243
    .line 244
    .line 245
    const v16, -0x40747ae1    # -1.09f

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v17, 0x40fa8f5c    # 7.83f

    .line 252
    .line 253
    .line 254
    const/high16 v18, 0x41600000    # 14.0f

    .line 255
    .line 256
    const v13, 0x40e051ec    # 7.01f

    .line 257
    .line 258
    .line 259
    const v14, 0x4166b852    # 14.42f

    .line 260
    .line 261
    .line 262
    const v15, 0x40ebd70a    # 7.37f

    .line 263
    .line 264
    .line 265
    const/high16 v16, 0x41600000    # 14.0f

    .line 266
    .line 267
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    const/16 v16, 0x3800

    .line 278
    .line 279
    const/16 v17, 0x0

    .line 280
    .line 281
    const/high16 v6, 0x3f800000    # 1.0f

    .line 282
    .line 283
    const/high16 v8, 0x3f800000    # 1.0f

    .line 284
    .line 285
    const/4 v7, 0x0

    .line 286
    const/high16 v9, 0x3f800000    # 1.0f

    .line 287
    .line 288
    const/high16 v12, 0x3f800000    # 1.0f

    .line 289
    .line 290
    const/4 v13, 0x0

    .line 291
    const/4 v14, 0x0

    .line 292
    const/4 v15, 0x0

    .line 293
    const-string v4, ""

    .line 294
    .line 295
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    sput-object v0, Landroidx/compose/material/icons/filled/WaterDropKt;->_waterDrop:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 304
    .line 305
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    return-object v0
.end method
