.class public final Landroidx/compose/material/icons/filled/InventoryKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _inventory:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getInventory(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/InventoryKt;->_inventory:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.Inventory"

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
    const/high16 v0, 0x41a00000    # 20.0f

    .line 71
    .line 72
    const/high16 v2, 0x40000000    # 2.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40800000    # 4.0f

    .line 78
    .line 79
    invoke-virtual {v12, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, -0x40000000    # -2.0f

    .line 83
    .line 84
    const/high16 v18, 0x40000000    # 2.0f

    .line 85
    .line 86
    const/high16 v13, -0x40800000    # -1.0f

    .line 87
    .line 88
    const/4 v14, 0x0

    .line 89
    const/high16 v15, -0x40000000    # -2.0f

    .line 90
    .line 91
    const v16, 0x3f666666    # 0.9f

    .line 92
    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v6, 0x4040a3d7    # 3.01f

    .line 98
    .line 99
    .line 100
    invoke-virtual {v12, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v17, 0x3f800000    # 1.0f

    .line 104
    .line 105
    const v18, 0x3fd851ec    # 1.69f

    .line 106
    .line 107
    .line 108
    const/4 v13, 0x0

    .line 109
    const v14, 0x3f3851ec    # 0.72f

    .line 110
    .line 111
    .line 112
    const v15, 0x3edc28f6    # 0.43f

    .line 113
    .line 114
    .line 115
    const v16, 0x3fab851f    # 1.34f

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v6, 0x40400000    # 3.0f

    .line 122
    .line 123
    invoke-virtual {v12, v6, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v17, 0x40000000    # 2.0f

    .line 127
    .line 128
    const/high16 v18, 0x40000000    # 2.0f

    .line 129
    .line 130
    const v14, 0x3f8ccccd    # 1.1f

    .line 131
    .line 132
    .line 133
    const v15, 0x3f8ccccd    # 1.1f

    .line 134
    .line 135
    .line 136
    const/high16 v16, 0x40000000    # 2.0f

    .line 137
    .line 138
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v6, 0x41600000    # 14.0f

    .line 142
    .line 143
    invoke-virtual {v12, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v18, -0x40000000    # -2.0f

    .line 147
    .line 148
    const v13, 0x3f666666    # 0.9f

    .line 149
    .line 150
    .line 151
    const/4 v14, 0x0

    .line 152
    const/high16 v15, 0x40000000    # 2.0f

    .line 153
    .line 154
    const v16, -0x4099999a    # -0.9f

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const/high16 v7, 0x41a80000    # 21.0f

    .line 161
    .line 162
    const v8, 0x410b3333    # 8.7f

    .line 163
    .line 164
    .line 165
    invoke-virtual {v12, v7, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v17, 0x3f800000    # 1.0f

    .line 169
    .line 170
    const v18, -0x4027ae14    # -1.69f

    .line 171
    .line 172
    .line 173
    const v13, 0x3f11eb85    # 0.57f

    .line 174
    .line 175
    .line 176
    const v14, -0x414ccccd    # -0.35f

    .line 177
    .line 178
    .line 179
    const/high16 v15, 0x3f800000    # 1.0f

    .line 180
    .line 181
    const v16, -0x4087ae14    # -0.97f

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v7, 0x41b00000    # 22.0f

    .line 188
    .line 189
    invoke-virtual {v12, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const/high16 v17, -0x40000000    # -2.0f

    .line 193
    .line 194
    const/high16 v18, -0x40000000    # -2.0f

    .line 195
    .line 196
    const/4 v13, 0x0

    .line 197
    const v14, -0x40733333    # -1.1f

    .line 198
    .line 199
    .line 200
    const/high16 v15, -0x40800000    # -1.0f

    .line 201
    .line 202
    const/high16 v16, -0x40000000    # -2.0f

    .line 203
    .line 204
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v7, 0x41700000    # 15.0f

    .line 211
    .line 212
    invoke-virtual {v12, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v7, 0x41100000    # 9.0f

    .line 216
    .line 217
    invoke-virtual {v12, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v6, -0x40000000    # -2.0f

    .line 221
    .line 222
    invoke-virtual {v12, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v6, 0x40c00000    # 6.0f

    .line 226
    .line 227
    invoke-virtual {v12, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v12, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v2, 0x40e00000    # 7.0f

    .line 237
    .line 238
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v12, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v12, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v4, 0x41800000    # 16.0f

    .line 248
    .line 249
    const v6, -0x435c28f6    # -0.02f

    .line 250
    .line 251
    .line 252
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    const/16 v16, 0x3800

    .line 266
    .line 267
    const/16 v17, 0x0

    .line 268
    .line 269
    const-string v4, ""

    .line 270
    .line 271
    const/high16 v6, 0x3f800000    # 1.0f

    .line 272
    .line 273
    const/4 v7, 0x0

    .line 274
    const/high16 v8, 0x3f800000    # 1.0f

    .line 275
    .line 276
    const/high16 v9, 0x3f800000    # 1.0f

    .line 277
    .line 278
    const/high16 v12, 0x3f800000    # 1.0f

    .line 279
    .line 280
    const/4 v14, 0x0

    .line 281
    const/4 v15, 0x0

    .line 282
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    sput-object v0, Landroidx/compose/material/icons/filled/InventoryKt;->_inventory:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 291
    .line 292
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    return-object v0
.end method
