.class public final Landroidx/compose/material/icons/sharp/PersonPinCircleKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _personPinCircle:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPersonPinCircle(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/PersonPinCircleKt;->_personPinCircle:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.PersonPinCircle"

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
    const/high16 v0, 0x41300000    # 11.0f

    .line 71
    .line 72
    const/high16 v2, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x3f800000    # -4.0f

    .line 78
    .line 79
    const/high16 v18, 0x40000000    # 2.0f

    .line 80
    .line 81
    const v13, -0x4055c28f    # -1.33f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, -0x3f800000    # -4.0f

    .line 86
    .line 87
    const v16, 0x3f2b851f    # 0.67f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, 0x3e23d70a    # 0.16f

    .line 94
    .line 95
    .line 96
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v17, 0x40800000    # 4.0f

    .line 100
    .line 101
    const v18, 0x3feb851f    # 1.84f

    .line 102
    .line 103
    .line 104
    const v13, 0x3f7851ec    # 0.97f

    .line 105
    .line 106
    .line 107
    const v14, 0x3f8f5c29    # 1.12f

    .line 108
    .line 109
    .line 110
    const v15, 0x4019999a    # 2.4f

    .line 111
    .line 112
    .line 113
    const v16, 0x3feb851f    # 1.84f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v0, 0x40800000    # 4.0f

    .line 120
    .line 121
    const v2, -0x40147ae1    # -1.84f

    .line 122
    .line 123
    .line 124
    const v4, 0x4041eb85    # 3.03f

    .line 125
    .line 126
    .line 127
    const v6, -0x40c7ae14    # -0.72f

    .line 128
    .line 129
    .line 130
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v0, 0x41800000    # 16.0f

    .line 134
    .line 135
    const/high16 v2, 0x41500000    # 13.0f

    .line 136
    .line 137
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v17, -0x3f800000    # -4.0f

    .line 141
    .line 142
    const/high16 v18, -0x40000000    # -2.0f

    .line 143
    .line 144
    const/4 v13, 0x0

    .line 145
    const v14, -0x4055c28f    # -1.33f

    .line 146
    .line 147
    .line 148
    const v15, -0x3fd51eb8    # -2.67f

    .line 149
    .line 150
    .line 151
    const/high16 v16, -0x40000000    # -2.0f

    .line 152
    .line 153
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v0, 0x41200000    # 10.0f

    .line 160
    .line 161
    const/high16 v2, 0x41400000    # 12.0f

    .line 162
    .line 163
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v17, 0x40000000    # 2.0f

    .line 167
    .line 168
    const v13, 0x3f8ccccd    # 1.1f

    .line 169
    .line 170
    .line 171
    const/4 v14, 0x0

    .line 172
    const/high16 v15, 0x40000000    # 2.0f

    .line 173
    .line 174
    const v16, -0x4099999a    # -0.9f

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v0, -0x4099999a    # -0.9f

    .line 181
    .line 182
    .line 183
    const/high16 v2, -0x40000000    # -2.0f

    .line 184
    .line 185
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v0, 0x3f666666    # 0.9f

    .line 189
    .line 190
    .line 191
    const/high16 v2, 0x40000000    # 2.0f

    .line 192
    .line 193
    const/high16 v4, -0x40000000    # -2.0f

    .line 194
    .line 195
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v0, 0x41400000    # 12.0f

    .line 205
    .line 206
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v17, 0x41000000    # 8.0f

    .line 210
    .line 211
    const v18, 0x41033333    # 8.2f

    .line 212
    .line 213
    .line 214
    const v13, 0x40866666    # 4.2f

    .line 215
    .line 216
    .line 217
    const/high16 v15, 0x41000000    # 8.0f

    .line 218
    .line 219
    const v16, 0x404e147b    # 3.22f

    .line 220
    .line 221
    .line 222
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v17, -0x3f000000    # -8.0f

    .line 226
    .line 227
    const v18, 0x413ccccd    # 11.8f

    .line 228
    .line 229
    .line 230
    const/4 v13, 0x0

    .line 231
    const v14, 0x40547ae1    # 3.32f

    .line 232
    .line 233
    .line 234
    const v15, -0x3fd51eb8    # -2.67f

    .line 235
    .line 236
    .line 237
    const/high16 v16, 0x40e80000    # 7.25f

    .line 238
    .line 239
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const v18, -0x3ec33333    # -11.8f

    .line 243
    .line 244
    .line 245
    const v13, -0x3f5570a4    # -5.33f

    .line 246
    .line 247
    .line 248
    const v14, -0x3f6e6666    # -4.55f

    .line 249
    .line 250
    .line 251
    const/high16 v15, -0x3f000000    # -8.0f

    .line 252
    .line 253
    const v16, -0x3ef851ec    # -8.48f

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v17, 0x41400000    # 12.0f

    .line 260
    .line 261
    const/high16 v18, 0x40000000    # 2.0f

    .line 262
    .line 263
    const/high16 v13, 0x40800000    # 4.0f

    .line 264
    .line 265
    const v14, 0x40a70a3d    # 5.22f

    .line 266
    .line 267
    .line 268
    const v15, 0x40f9999a    # 7.8f

    .line 269
    .line 270
    .line 271
    const/high16 v16, 0x40000000    # 2.0f

    .line 272
    .line 273
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    const/16 v16, 0x3800

    .line 284
    .line 285
    const/16 v17, 0x0

    .line 286
    .line 287
    const/high16 v6, 0x3f800000    # 1.0f

    .line 288
    .line 289
    const/high16 v8, 0x3f800000    # 1.0f

    .line 290
    .line 291
    const/4 v7, 0x0

    .line 292
    const/high16 v9, 0x3f800000    # 1.0f

    .line 293
    .line 294
    const/high16 v12, 0x3f800000    # 1.0f

    .line 295
    .line 296
    const/4 v13, 0x0

    .line 297
    const/4 v14, 0x0

    .line 298
    const/4 v15, 0x0

    .line 299
    const-string v4, ""

    .line 300
    .line 301
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    sput-object v0, Landroidx/compose/material/icons/sharp/PersonPinCircleKt;->_personPinCircle:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 310
    .line 311
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    return-object v0
.end method
