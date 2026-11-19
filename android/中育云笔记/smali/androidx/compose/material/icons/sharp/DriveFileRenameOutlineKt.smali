.class public final Landroidx/compose/material/icons/sharp/DriveFileRenameOutlineKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _driveFileRenameOutline:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDriveFileRenameOutline(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 22

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/DriveFileRenameOutlineKt;->_driveFileRenameOutline:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.DriveFileRenameOutline"

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
    const/4 v2, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 51
    .line 52
    .line 53
    sget-object v18, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v19, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v4, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const/high16 v6, 0x41700000    # 15.0f

    .line 71
    .line 72
    const/high16 v7, 0x41800000    # 16.0f

    .line 73
    .line 74
    invoke-virtual {v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v6, 0x40800000    # 4.0f

    .line 78
    .line 79
    const/high16 v7, -0x3f800000    # -4.0f

    .line 80
    .line 81
    invoke-virtual {v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const/high16 v6, 0x41200000    # 10.0f

    .line 85
    .line 86
    const/4 v8, 0x0

    .line 87
    invoke-virtual {v4, v6, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v4, v8, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    const/16 v16, 0x3800

    .line 101
    .line 102
    const/16 v17, 0x0

    .line 103
    .line 104
    move-object v6, v2

    .line 105
    move-object v2, v4

    .line 106
    const-string v4, ""

    .line 107
    .line 108
    move-object v7, v6

    .line 109
    const/high16 v6, 0x3f800000    # 1.0f

    .line 110
    .line 111
    move-object v9, v7

    .line 112
    const/4 v7, 0x0

    .line 113
    move v12, v8

    .line 114
    const/high16 v8, 0x3f800000    # 1.0f

    .line 115
    .line 116
    move-object v13, v9

    .line 117
    const/high16 v9, 0x3f800000    # 1.0f

    .line 118
    .line 119
    move v14, v12

    .line 120
    const/high16 v12, 0x3f800000    # 1.0f

    .line 121
    .line 122
    move-object v15, v13

    .line 123
    const/4 v13, 0x0

    .line 124
    move/from16 v20, v14

    .line 125
    .line 126
    const/4 v14, 0x0

    .line 127
    move-object/from16 v21, v15

    .line 128
    .line 129
    const/4 v15, 0x0

    .line 130
    move-object/from16 p0, v0

    .line 131
    .line 132
    move-object/from16 v0, v21

    .line 133
    .line 134
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 135
    .line 136
    .line 137
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 142
    .line 143
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 144
    .line 145
    .line 146
    move-result-wide v6

    .line 147
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 151
    .line 152
    .line 153
    move-result v10

    .line 154
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 155
    .line 156
    .line 157
    move-result v11

    .line 158
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 161
    .line 162
    .line 163
    const v4, 0x4140f5c3    # 12.06f

    .line 164
    .line 165
    .line 166
    const v6, 0x40e6147b    # 7.19f

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v4, -0x3eef0a3d    # -9.06f

    .line 173
    .line 174
    .line 175
    const v6, 0x4110f5c3    # 9.06f

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v7, 0x40700000    # 3.75f

    .line 182
    .line 183
    const/4 v12, 0x0

    .line 184
    invoke-virtual {v2, v12, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v2, v7, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    const-string v4, ""

    .line 201
    .line 202
    const/high16 v6, 0x3f800000    # 1.0f

    .line 203
    .line 204
    const/4 v7, 0x0

    .line 205
    const/high16 v12, 0x3f800000    # 1.0f

    .line 206
    .line 207
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 208
    .line 209
    .line 210
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 215
    .line 216
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 217
    .line 218
    .line 219
    move-result-wide v6

    .line 220
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 224
    .line 225
    .line 226
    move-result v10

    .line 227
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 228
    .line 229
    .line 230
    move-result v11

    .line 231
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 234
    .line 235
    .line 236
    const v2, 0x41521cac    # 13.132f

    .line 237
    .line 238
    .line 239
    const v4, 0x40c3ef9e    # 6.123f

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const v2, 0x40226e98    # 2.538f

    .line 246
    .line 247
    .line 248
    const v4, -0x3fdd9168    # -2.538f

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v6, 0x406fdf3b    # 3.748f

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    const-string v4, ""

    .line 271
    .line 272
    const/high16 v6, 0x3f800000    # 1.0f

    .line 273
    .line 274
    const/4 v7, 0x0

    .line 275
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    sput-object v0, Landroidx/compose/material/icons/sharp/DriveFileRenameOutlineKt;->_driveFileRenameOutline:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 284
    .line 285
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    return-object v0
.end method
