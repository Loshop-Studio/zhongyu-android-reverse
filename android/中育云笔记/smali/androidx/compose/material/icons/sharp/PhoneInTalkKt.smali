.class public final Landroidx/compose/material/icons/sharp/PhoneInTalkKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _phoneInTalk:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPhoneInTalk(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/PhoneInTalkKt;->_phoneInTalk:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.PhoneInTalk"

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
    const/high16 v0, 0x41980000    # 19.0f

    .line 71
    .line 72
    const/high16 v2, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40000000    # 2.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, -0x3ef00000    # -9.0f

    .line 83
    .line 84
    const/high16 v18, -0x3ef00000    # -9.0f

    .line 85
    .line 86
    const/4 v13, 0x0

    .line 87
    const v14, -0x3f60f5c3    # -4.97f

    .line 88
    .line 89
    .line 90
    const v15, -0x3f7f0a3d    # -4.03f

    .line 91
    .line 92
    .line 93
    const/high16 v16, -0x3ef00000    # -9.0f

    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v17, 0x40e00000    # 7.0f

    .line 102
    .line 103
    const/high16 v18, 0x40e00000    # 7.0f

    .line 104
    .line 105
    const v13, 0x4077ae14    # 3.87f

    .line 106
    .line 107
    .line 108
    const/4 v14, 0x0

    .line 109
    const/high16 v15, 0x40e00000    # 7.0f

    .line 110
    .line 111
    const v16, 0x404851ec    # 3.13f

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v4, 0x41700000    # 15.0f

    .line 121
    .line 122
    invoke-virtual {v12, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v17, -0x3f600000    # -5.0f

    .line 129
    .line 130
    const/high16 v18, -0x3f600000    # -5.0f

    .line 131
    .line 132
    const/4 v13, 0x0

    .line 133
    const v14, -0x3fcf5c29    # -2.76f

    .line 134
    .line 135
    .line 136
    const v15, -0x3ff0a3d7    # -2.24f

    .line 137
    .line 138
    .line 139
    const/high16 v16, -0x3f600000    # -5.0f

    .line 140
    .line 141
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v17, 0x40400000    # 3.0f

    .line 148
    .line 149
    const/high16 v18, 0x40400000    # 3.0f

    .line 150
    .line 151
    const v13, 0x3fd47ae1    # 1.66f

    .line 152
    .line 153
    .line 154
    const/4 v14, 0x0

    .line 155
    const/high16 v15, 0x40400000    # 3.0f

    .line 156
    .line 157
    const v16, 0x3fab851f    # 1.34f

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v0, 0x41535c29    # 13.21f

    .line 167
    .line 168
    .line 169
    const v2, 0x418af5c3    # 17.37f

    .line 170
    .line 171
    .line 172
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v17, -0x3f2d1eb8    # -6.59f

    .line 176
    .line 177
    .line 178
    const v18, -0x3f2d1eb8    # -6.59f

    .line 179
    .line 180
    .line 181
    const v13, -0x3fcae148    # -2.83f

    .line 182
    .line 183
    .line 184
    const v14, -0x4047ae14    # -1.44f

    .line 185
    .line 186
    .line 187
    const v15, -0x3f5b3333    # -5.15f

    .line 188
    .line 189
    .line 190
    const/high16 v16, -0x3f900000    # -3.75f

    .line 191
    .line 192
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v0, 0x4021eb85    # 2.53f

    .line 196
    .line 197
    .line 198
    const v2, -0x3fde147b    # -2.53f

    .line 199
    .line 200
    .line 201
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v0, 0x4108a3d7    # 8.54f

    .line 205
    .line 206
    .line 207
    const/high16 v2, 0x40400000    # 3.0f

    .line 208
    .line 209
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v0, 0x4041eb85    # 3.03f

    .line 213
    .line 214
    .line 215
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const/high16 v17, 0x41a80000    # 21.0f

    .line 219
    .line 220
    const v18, 0x41a7c28f    # 20.97f

    .line 221
    .line 222
    .line 223
    const v13, 0x401ccccd    # 2.45f

    .line 224
    .line 225
    .line 226
    const v14, 0x4152e148    # 13.18f

    .line 227
    .line 228
    .line 229
    const v15, 0x412d1eb8    # 10.82f

    .line 230
    .line 231
    .line 232
    const v16, 0x41ac6666    # 21.55f

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v0, -0x3f4fae14    # -5.51f

    .line 239
    .line 240
    .line 241
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v0, -0x3f575c29    # -5.27f

    .line 245
    .line 246
    .line 247
    const v2, -0x40e3d70a    # -0.61f

    .line 248
    .line 249
    .line 250
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v0, -0x3fdeb852    # -2.52f

    .line 254
    .line 255
    .line 256
    const v2, 0x402147ae    # 2.52f

    .line 257
    .line 258
    .line 259
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    const/16 v16, 0x3800

    .line 270
    .line 271
    const/16 v17, 0x0

    .line 272
    .line 273
    const-string v4, ""

    .line 274
    .line 275
    const/high16 v6, 0x3f800000    # 1.0f

    .line 276
    .line 277
    const/4 v7, 0x0

    .line 278
    const/high16 v8, 0x3f800000    # 1.0f

    .line 279
    .line 280
    const/high16 v9, 0x3f800000    # 1.0f

    .line 281
    .line 282
    const/high16 v12, 0x3f800000    # 1.0f

    .line 283
    .line 284
    const/4 v13, 0x0

    .line 285
    const/4 v14, 0x0

    .line 286
    const/4 v15, 0x0

    .line 287
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    sput-object v0, Landroidx/compose/material/icons/sharp/PhoneInTalkKt;->_phoneInTalk:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 296
    .line 297
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    return-object v0
.end method
