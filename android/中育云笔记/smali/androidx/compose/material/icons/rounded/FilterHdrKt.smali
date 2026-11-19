.class public final Landroidx/compose/material/icons/rounded/FilterHdrKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _filterHdr:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFilterHdr(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/FilterHdrKt;->_filterHdr:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.FilterHdr"

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
    const/4 v10, 0x0

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
    const v0, 0x41533333    # 13.2f

    .line 71
    .line 72
    .line 73
    const v2, 0x40e23d71    # 7.07f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v0, 0x41240000    # 10.25f

    .line 80
    .line 81
    const/high16 v2, 0x41300000    # 11.0f

    .line 82
    .line 83
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const/high16 v0, 0x40100000    # 2.25f

    .line 87
    .line 88
    const/high16 v2, 0x40400000    # 3.0f

    .line 89
    .line 90
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v17, -0x41b33333    # -0.2f

    .line 94
    .line 95
    .line 96
    const v18, 0x3fb33333    # 1.4f

    .line 97
    .line 98
    .line 99
    const v13, 0x3ea8f5c3    # 0.33f

    .line 100
    .line 101
    .line 102
    const v14, 0x3ee147ae    # 0.44f

    .line 103
    .line 104
    .line 105
    const v15, 0x3e75c28f    # 0.24f

    .line 106
    .line 107
    .line 108
    const v16, 0x3f88f5c3    # 1.07f

    .line 109
    .line 110
    .line 111
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v17, -0x404ccccd    # -1.4f

    .line 115
    .line 116
    .line 117
    const v18, -0x41b33333    # -0.2f

    .line 118
    .line 119
    .line 120
    const v13, -0x411eb852    # -0.44f

    .line 121
    .line 122
    .line 123
    const v14, 0x3ea8f5c3    # 0.33f

    .line 124
    .line 125
    .line 126
    const v15, -0x40770a3d    # -1.07f

    .line 127
    .line 128
    .line 129
    const/high16 v16, 0x3e800000    # 0.25f

    .line 130
    .line 131
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v17, -0x3fb9999a    # -3.1f

    .line 135
    .line 136
    .line 137
    const v18, -0x3f7b851f    # -4.14f

    .line 138
    .line 139
    .line 140
    const v13, -0x4079999a    # -1.05f

    .line 141
    .line 142
    .line 143
    const v14, -0x404ccccd    # -1.4f

    .line 144
    .line 145
    .line 146
    const v15, -0x3fec28f6    # -2.31f

    .line 147
    .line 148
    .line 149
    const v16, -0x3fbb851f    # -3.07f

    .line 150
    .line 151
    .line 152
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v17, -0x40333333    # -1.6f

    .line 156
    .line 157
    .line 158
    const/16 v18, 0x0

    .line 159
    .line 160
    const v13, -0x41333333    # -0.4f

    .line 161
    .line 162
    .line 163
    const v14, -0x40f851ec    # -0.53f

    .line 164
    .line 165
    .line 166
    const v15, -0x40666666    # -1.2f

    .line 167
    .line 168
    .line 169
    const v16, -0x40f851ec    # -0.53f

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const/high16 v0, -0x3f800000    # -4.0f

    .line 176
    .line 177
    const v2, 0x40aa8f5c    # 5.33f

    .line 178
    .line 179
    .line 180
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v17, 0x3f4ccccd    # 0.8f

    .line 184
    .line 185
    .line 186
    const v18, 0x3fce147b    # 1.61f

    .line 187
    .line 188
    .line 189
    const v13, -0x41051eb8    # -0.49f

    .line 190
    .line 191
    .line 192
    const v14, 0x3f2b851f    # 0.67f

    .line 193
    .line 194
    .line 195
    const v15, -0x435c28f6    # -0.02f

    .line 196
    .line 197
    .line 198
    const v16, 0x3fce147b    # 1.61f

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v0, 0x41900000    # 18.0f

    .line 205
    .line 206
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v18, -0x40333333    # -1.6f

    .line 210
    .line 211
    .line 212
    const v13, 0x3f51eb85    # 0.82f

    .line 213
    .line 214
    .line 215
    const/4 v14, 0x0

    .line 216
    const v15, 0x3fa51eb8    # 1.29f

    .line 217
    .line 218
    .line 219
    const v16, -0x408f5c29    # -0.94f

    .line 220
    .line 221
    .line 222
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v0, -0x3f200000    # -7.0f

    .line 226
    .line 227
    const v2, -0x3eeab852    # -9.33f

    .line 228
    .line 229
    .line 230
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v17, -0x40333333    # -1.6f

    .line 234
    .line 235
    .line 236
    const/16 v18, 0x0

    .line 237
    .line 238
    const v13, -0x41333333    # -0.4f

    .line 239
    .line 240
    .line 241
    const v14, -0x40f5c28f    # -0.54f

    .line 242
    .line 243
    .line 244
    const v15, -0x40666666    # -1.2f

    .line 245
    .line 246
    .line 247
    const v16, -0x40f5c28f    # -0.54f

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    const/16 v16, 0x3800

    .line 261
    .line 262
    const/16 v17, 0x0

    .line 263
    .line 264
    const-string v4, ""

    .line 265
    .line 266
    const/high16 v6, 0x3f800000    # 1.0f

    .line 267
    .line 268
    const/4 v7, 0x0

    .line 269
    const/high16 v8, 0x3f800000    # 1.0f

    .line 270
    .line 271
    const/high16 v9, 0x3f800000    # 1.0f

    .line 272
    .line 273
    const/high16 v12, 0x3f800000    # 1.0f

    .line 274
    .line 275
    const/4 v13, 0x0

    .line 276
    const/4 v14, 0x0

    .line 277
    const/4 v15, 0x0

    .line 278
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    sput-object v0, Landroidx/compose/material/icons/rounded/FilterHdrKt;->_filterHdr:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 287
    .line 288
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    return-object v0
.end method
