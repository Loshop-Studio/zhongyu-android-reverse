.class public final Landroidx/compose/material/icons/rounded/NetworkWifi2BarKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _networkWifi2Bar:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNetworkWifi2Bar(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/NetworkWifi2BarKt;->_networkWifi2Bar:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.NetworkWifi2Bar"

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
    const/high16 v2, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, 0x3f4a3d71    # 0.79f

    .line 78
    .line 79
    .line 80
    const v18, 0x4103d70a    # 8.24f

    .line 81
    .line 82
    .line 83
    const v13, 0x40f66666    # 7.7f

    .line 84
    .line 85
    .line 86
    const/high16 v14, 0x40800000    # 4.0f

    .line 87
    .line 88
    const v15, 0x4071eb85    # 3.78f

    .line 89
    .line 90
    .line 91
    const v16, 0x40b33333    # 5.6f

    .line 92
    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v17, 0x3f3ae148    # 0.73f

    .line 98
    .line 99
    .line 100
    const v18, 0x411b5c29    # 9.71f

    .line 101
    .line 102
    .line 103
    const v13, 0x3eb33333    # 0.35f

    .line 104
    .line 105
    .line 106
    const v14, 0x410a147b    # 8.63f

    .line 107
    .line 108
    .line 109
    const v15, 0x3ea3d70a    # 0.32f

    .line 110
    .line 111
    .line 112
    const v16, 0x4114cccd    # 9.3f

    .line 113
    .line 114
    .line 115
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v0, 0x4128f5c3    # 10.56f

    .line 119
    .line 120
    .line 121
    const v2, 0x412947ae    # 10.58f

    .line 122
    .line 123
    .line 124
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v17, 0x3fb5c28f    # 1.42f

    .line 128
    .line 129
    .line 130
    const/16 v18, 0x0

    .line 131
    .line 132
    const v13, 0x3ec7ae14    # 0.39f

    .line 133
    .line 134
    .line 135
    const v14, 0x3ec7ae14    # 0.39f

    .line 136
    .line 137
    .line 138
    const v15, 0x3f828f5c    # 1.02f

    .line 139
    .line 140
    .line 141
    const v16, 0x3ec7ae14    # 0.39f

    .line 142
    .line 143
    .line 144
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v0, 0x41ba28f6    # 23.27f

    .line 148
    .line 149
    .line 150
    const v2, 0x411b5c29    # 9.71f

    .line 151
    .line 152
    .line 153
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v17, -0x428a3d71    # -0.06f

    .line 157
    .line 158
    .line 159
    const v18, -0x4043d70a    # -1.47f

    .line 160
    .line 161
    .line 162
    const v13, 0x3ed1eb85    # 0.41f

    .line 163
    .line 164
    .line 165
    const v14, -0x412e147b    # -0.41f

    .line 166
    .line 167
    .line 168
    const v15, 0x3ec28f5c    # 0.38f

    .line 169
    .line 170
    .line 171
    const v16, -0x4075c28f    # -1.08f

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v17, 0x41400000    # 12.0f

    .line 178
    .line 179
    const/high16 v18, 0x40800000    # 4.0f

    .line 180
    .line 181
    const v13, 0x41a1c28f    # 20.22f

    .line 182
    .line 183
    .line 184
    const v14, 0x40b33333    # 5.6f

    .line 185
    .line 186
    .line 187
    const v15, 0x41826666    # 16.3f

    .line 188
    .line 189
    .line 190
    const/high16 v16, 0x40800000    # 4.0f

    .line 191
    .line 192
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v0, 0x4156147b    # 13.38f

    .line 199
    .line 200
    .line 201
    const v2, 0x41863d71    # 16.78f

    .line 202
    .line 203
    .line 204
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v18, 0x41400000    # 12.0f

    .line 208
    .line 209
    const v13, 0x41766666    # 15.4f

    .line 210
    .line 211
    .line 212
    const/high16 v14, 0x41480000    # 12.5f

    .line 213
    .line 214
    const v15, 0x415c28f6    # 13.76f

    .line 215
    .line 216
    .line 217
    const/high16 v16, 0x41400000    # 12.0f

    .line 218
    .line 219
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v17, -0x3f670a3d    # -4.78f

    .line 223
    .line 224
    .line 225
    const v18, 0x3fb0a3d7    # 1.38f

    .line 226
    .line 227
    .line 228
    const v13, -0x401eb852    # -1.76f

    .line 229
    .line 230
    .line 231
    const/4 v14, 0x0

    .line 232
    const v15, -0x3fa66666    # -3.4f

    .line 233
    .line 234
    .line 235
    const/high16 v16, 0x3f000000    # 0.5f

    .line 236
    .line 237
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v0, -0x3f766666    # -4.3f

    .line 241
    .line 242
    .line 243
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/high16 v17, 0x41400000    # 12.0f

    .line 247
    .line 248
    const/high16 v18, 0x40c00000    # 6.0f

    .line 249
    .line 250
    const v13, 0x40b051ec    # 5.51f

    .line 251
    .line 252
    .line 253
    const v14, 0x40e28f5c    # 7.08f

    .line 254
    .line 255
    .line 256
    const v15, 0x410ab852    # 8.67f

    .line 257
    .line 258
    .line 259
    const/high16 v16, 0x40c00000    # 6.0f

    .line 260
    .line 261
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v0, 0x411147ae    # 9.08f

    .line 265
    .line 266
    .line 267
    const v2, 0x40447ae1    # 3.07f

    .line 268
    .line 269
    .line 270
    const v4, 0x40cfae14    # 6.49f

    .line 271
    .line 272
    .line 273
    const v6, 0x3f8a3d71    # 1.08f

    .line 274
    .line 275
    .line 276
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v0, 0x4156147b    # 13.38f

    .line 280
    .line 281
    .line 282
    const v2, 0x41863d71    # 16.78f

    .line 283
    .line 284
    .line 285
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    const/16 v16, 0x3800

    .line 296
    .line 297
    const/16 v17, 0x0

    .line 298
    .line 299
    const/high16 v6, 0x3f800000    # 1.0f

    .line 300
    .line 301
    const/high16 v8, 0x3f800000    # 1.0f

    .line 302
    .line 303
    const/4 v7, 0x0

    .line 304
    const/high16 v9, 0x3f800000    # 1.0f

    .line 305
    .line 306
    const/high16 v12, 0x3f800000    # 1.0f

    .line 307
    .line 308
    const/4 v13, 0x0

    .line 309
    const/4 v14, 0x0

    .line 310
    const/4 v15, 0x0

    .line 311
    const-string v4, ""

    .line 312
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
    sput-object v0, Landroidx/compose/material/icons/rounded/NetworkWifi2BarKt;->_networkWifi2Bar:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 322
    .line 323
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    return-object v0
.end method
