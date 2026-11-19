.class public final Landroidx/compose/material/icons/automirrored/sharp/LiveHelpKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _liveHelp:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLiveHelp(Landroidx/compose/material/icons/Icons$AutoMirrored$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/automirrored/sharp/LiveHelpKt;->_liveHelp:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "AutoMirrored.Sharp.LiveHelp"

    .line 25
    .line 26
    const/high16 v5, 0x41c00000    # 24.0f

    .line 27
    .line 28
    const/high16 v6, 0x41c00000    # 24.0f

    .line 29
    .line 30
    const-wide/16 v7, 0x0

    .line 31
    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v10, 0x1

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
    const/high16 v0, 0x41a80000    # 21.0f

    .line 71
    .line 72
    const/high16 v2, 0x40000000    # 2.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40400000    # 3.0f

    .line 78
    .line 79
    invoke-virtual {v12, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v6, 0x41900000    # 18.0f

    .line 83
    .line 84
    invoke-virtual {v12, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v7, 0x40c00000    # 6.0f

    .line 88
    .line 89
    invoke-virtual {v12, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v12, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const/high16 v8, -0x3fc00000    # -3.0f

    .line 96
    .line 97
    invoke-virtual {v12, v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v12, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const/high16 v0, 0x41500000    # 13.0f

    .line 110
    .line 111
    invoke-virtual {v12, v0, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/high16 v0, -0x40000000    # -2.0f

    .line 115
    .line 116
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v12, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v12, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v4, 0x41711eb8    # 15.07f

    .line 132
    .line 133
    .line 134
    const/high16 v6, 0x41240000    # 10.25f

    .line 135
    .line 136
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v4, -0x4099999a    # -0.9f

    .line 140
    .line 141
    .line 142
    const v6, 0x3f6b851f    # 0.92f

    .line 143
    .line 144
    .line 145
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v17, 0x41500000    # 13.0f

    .line 149
    .line 150
    const/high16 v18, 0x41600000    # 14.0f

    .line 151
    .line 152
    const v13, 0x41573333    # 13.45f

    .line 153
    .line 154
    .line 155
    const v14, 0x413e6666    # 11.9f

    .line 156
    .line 157
    .line 158
    const/high16 v15, 0x41500000    # 13.0f

    .line 159
    .line 160
    const/high16 v16, 0x41480000    # 12.5f

    .line 161
    .line 162
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v4, -0x41000000    # -0.5f

    .line 169
    .line 170
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v17, 0x3f95c28f    # 1.17f

    .line 174
    .line 175
    .line 176
    const v18, -0x3fcae148    # -2.83f

    .line 177
    .line 178
    .line 179
    const/4 v13, 0x0

    .line 180
    const v14, -0x40733333    # -1.1f

    .line 181
    .line 182
    .line 183
    const v15, 0x3ee66666    # 0.45f

    .line 184
    .line 185
    .line 186
    const v16, -0x3ff9999a    # -2.1f

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v4, 0x3f9eb852    # 1.24f

    .line 193
    .line 194
    .line 195
    const v6, -0x405eb852    # -1.26f

    .line 196
    .line 197
    .line 198
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v17, 0x3f170a3d    # 0.59f

    .line 202
    .line 203
    .line 204
    const v18, -0x404b851f    # -1.41f

    .line 205
    .line 206
    .line 207
    const v13, 0x3ebd70a4    # 0.37f

    .line 208
    .line 209
    .line 210
    const v14, -0x4147ae14    # -0.36f

    .line 211
    .line 212
    .line 213
    const v15, 0x3f170a3d    # 0.59f

    .line 214
    .line 215
    .line 216
    const v16, -0x40a3d70a    # -0.86f

    .line 217
    .line 218
    .line 219
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const/high16 v17, -0x40000000    # -2.0f

    .line 223
    .line 224
    const/high16 v18, -0x40000000    # -2.0f

    .line 225
    .line 226
    const/4 v13, 0x0

    .line 227
    const v14, -0x40733333    # -1.1f

    .line 228
    .line 229
    .line 230
    const v15, -0x4099999a    # -0.9f

    .line 231
    .line 232
    .line 233
    const/high16 v16, -0x40000000    # -2.0f

    .line 234
    .line 235
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v4, 0x3f666666    # 0.9f

    .line 239
    .line 240
    .line 241
    invoke-virtual {v12, v0, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v0, 0x41000000    # 8.0f

    .line 245
    .line 246
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v17, 0x40800000    # 4.0f

    .line 250
    .line 251
    const/high16 v18, -0x3f800000    # -4.0f

    .line 252
    .line 253
    const v14, -0x3ff28f5c    # -2.21f

    .line 254
    .line 255
    .line 256
    const v15, 0x3fe51eb8    # 1.79f

    .line 257
    .line 258
    .line 259
    const/high16 v16, -0x3f800000    # -4.0f

    .line 260
    .line 261
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v0, 0x3fe51eb8    # 1.79f

    .line 265
    .line 266
    .line 267
    const/high16 v2, 0x40800000    # 4.0f

    .line 268
    .line 269
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v17, -0x4091eb85    # -0.93f

    .line 273
    .line 274
    .line 275
    const/high16 v18, 0x40100000    # 2.25f

    .line 276
    .line 277
    const v14, 0x3f6147ae    # 0.88f

    .line 278
    .line 279
    .line 280
    const v15, -0x4147ae14    # -0.36f

    .line 281
    .line 282
    .line 283
    const v16, 0x3fd70a3d    # 1.68f

    .line 284
    .line 285
    .line 286
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    const/16 v16, 0x3800

    .line 297
    .line 298
    const/16 v17, 0x0

    .line 299
    .line 300
    const-string v4, ""

    .line 301
    .line 302
    const/high16 v6, 0x3f800000    # 1.0f

    .line 303
    .line 304
    const/4 v7, 0x0

    .line 305
    const/high16 v8, 0x3f800000    # 1.0f

    .line 306
    .line 307
    const/high16 v9, 0x3f800000    # 1.0f

    .line 308
    .line 309
    const/high16 v12, 0x3f800000    # 1.0f

    .line 310
    .line 311
    const/4 v14, 0x0

    .line 312
    const/4 v15, 0x0

    .line 313
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    sput-object v0, Landroidx/compose/material/icons/automirrored/sharp/LiveHelpKt;->_liveHelp:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 322
    .line 323
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    return-object v0
.end method
