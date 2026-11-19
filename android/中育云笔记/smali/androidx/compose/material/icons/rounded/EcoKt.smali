.class public final Landroidx/compose/material/icons/rounded/EcoKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _eco:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getEco(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/EcoKt;->_eco:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Eco"

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
    const v0, 0x419f999a    # 19.95f

    .line 71
    .line 72
    .line 73
    const v2, 0x40bf0a3d    # 5.97f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x400a3d71    # -1.92f

    .line 80
    .line 81
    .line 82
    const v18, -0x400a3d71    # -1.92f

    .line 83
    .line 84
    .line 85
    const v13, -0x42b33333    # -0.05f

    .line 86
    .line 87
    .line 88
    const v14, -0x407ae148    # -1.04f

    .line 89
    .line 90
    .line 91
    const v15, -0x409c28f6    # -0.89f

    .line 92
    .line 93
    .line 94
    const v16, -0x400f5c29    # -1.88f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v17, 0x4180147b    # 16.01f

    .line 101
    .line 102
    .line 103
    const/high16 v18, 0x40800000    # 4.0f

    .line 104
    .line 105
    const v13, 0x418aa3d7    # 17.33f

    .line 106
    .line 107
    .line 108
    const v14, 0x4080a3d7    # 4.02f

    .line 109
    .line 110
    .line 111
    const v15, 0x418547ae    # 16.66f

    .line 112
    .line 113
    .line 114
    const/high16 v16, 0x40800000    # 4.0f

    .line 115
    .line 116
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v17, 0x40b1999a    # 5.55f

    .line 120
    .line 121
    .line 122
    const v18, 0x40dd1eb8    # 6.91f

    .line 123
    .line 124
    .line 125
    const v13, 0x412fae14    # 10.98f

    .line 126
    .line 127
    .line 128
    const/high16 v14, 0x40800000    # 4.0f

    .line 129
    .line 130
    const v15, 0x40efae14    # 7.49f

    .line 131
    .line 132
    .line 133
    const v16, 0x409f0a3d    # 4.97f

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v17, 0x3db851ec    # 0.09f

    .line 140
    .line 141
    .line 142
    const v18, 0x413e6666    # 11.9f

    .line 143
    .line 144
    .line 145
    const v13, -0x3f947ae1    # -3.68f

    .line 146
    .line 147
    .line 148
    const v14, 0x406b851f    # 3.68f

    .line 149
    .line 150
    .line 151
    const v15, -0x3fb66666    # -3.15f

    .line 152
    .line 153
    .line 154
    const v16, 0x410e6666    # 8.9f

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v17, 0x3c23d70a    # 0.01f

    .line 161
    .line 162
    .line 163
    const/16 v18, 0x0

    .line 164
    .line 165
    const v13, 0x3c23d70a    # 0.01f

    .line 166
    .line 167
    .line 168
    const/4 v14, 0x0

    .line 169
    const v15, 0x3c23d70a    # 0.01f

    .line 170
    .line 171
    .line 172
    const/16 v16, 0x0

    .line 173
    .line 174
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v17, 0x40f570a4    # 7.67f

    .line 178
    .line 179
    .line 180
    const v18, -0x3ef33333    # -8.8f

    .line 181
    .line 182
    .line 183
    const v13, 0x3fc147ae    # 1.51f

    .line 184
    .line 185
    .line 186
    const v14, -0x3f78f5c3    # -4.22f

    .line 187
    .line 188
    .line 189
    const v15, 0x4090a3d7    # 4.52f

    .line 190
    .line 191
    .line 192
    const v16, -0x3f1ae148    # -7.16f

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v17, -0x3f4fae14    # -5.51f

    .line 199
    .line 200
    .line 201
    const/high16 v18, 0x41240000    # 10.25f

    .line 202
    .line 203
    const v13, -0x41a8f5c3    # -0.21f

    .line 204
    .line 205
    .line 206
    const v14, 0x3e3851ec    # 0.18f

    .line 207
    .line 208
    .line 209
    const v15, -0x3f69999a    # -4.7f

    .line 210
    .line 211
    .line 212
    const v16, 0x40651eb8    # 3.58f

    .line 213
    .line 214
    .line 215
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v17, 0x40570a3d    # 3.36f

    .line 219
    .line 220
    .line 221
    const/high16 v18, 0x3f400000    # 0.75f

    .line 222
    .line 223
    const v13, 0x3f866666    # 1.05f

    .line 224
    .line 225
    .line 226
    const v14, 0x3ef5c28f    # 0.48f

    .line 227
    .line 228
    .line 229
    const v15, 0x400ccccd    # 2.2f

    .line 230
    .line 231
    .line 232
    const/high16 v16, 0x3f400000    # 0.75f

    .line 233
    .line 234
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v17, 0x40bd70a4    # 5.92f

    .line 238
    .line 239
    .line 240
    const v18, -0x3fdccccd    # -2.55f

    .line 241
    .line 242
    .line 243
    const v13, 0x40033333    # 2.05f

    .line 244
    .line 245
    .line 246
    const/4 v14, 0x0

    .line 247
    const v15, 0x40851eb8    # 4.16f

    .line 248
    .line 249
    .line 250
    const v16, -0x40b33333    # -0.8f

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v17, 0x419f999a    # 19.95f

    .line 257
    .line 258
    .line 259
    const v18, 0x40bf0a3d    # 5.97f

    .line 260
    .line 261
    .line 262
    const v13, 0x419a3d71    # 19.28f

    .line 263
    .line 264
    .line 265
    const v14, 0x4182147b    # 16.26f

    .line 266
    .line 267
    .line 268
    const v15, 0x41a1d70a    # 20.23f

    .line 269
    .line 270
    .line 271
    const v16, 0x4141999a    # 12.1f

    .line 272
    .line 273
    .line 274
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    const/16 v16, 0x3800

    .line 285
    .line 286
    const/16 v17, 0x0

    .line 287
    .line 288
    const/high16 v6, 0x3f800000    # 1.0f

    .line 289
    .line 290
    const/high16 v8, 0x3f800000    # 1.0f

    .line 291
    .line 292
    const/4 v7, 0x0

    .line 293
    const/high16 v9, 0x3f800000    # 1.0f

    .line 294
    .line 295
    const/high16 v12, 0x3f800000    # 1.0f

    .line 296
    .line 297
    const/4 v13, 0x0

    .line 298
    const/4 v14, 0x0

    .line 299
    const/4 v15, 0x0

    .line 300
    const-string v4, ""

    .line 301
    .line 302
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    sput-object v0, Landroidx/compose/material/icons/rounded/EcoKt;->_eco:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 311
    .line 312
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    return-object v0
.end method
