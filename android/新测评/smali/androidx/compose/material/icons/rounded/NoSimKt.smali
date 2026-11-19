.class public final Landroidx/compose/material/icons/rounded/NoSimKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_noSim",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "NoSim",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getNoSim",
        "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;",
        "material-icons-extended_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nNoSim.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NoSim.kt\nandroidx/compose/material/icons/rounded/NoSimKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,58:1\n212#2,12:59\n233#2,18:72\n253#2:109\n174#3:71\n705#4,2:90\n717#4,2:92\n719#4,11:98\n72#5,4:94\n*S KotlinDebug\n*F\n+ 1 NoSim.kt\nandroidx/compose/material/icons/rounded/NoSimKt\n*L\n29#1:59,12\n30#1:72,18\n30#1:109\n29#1:71\n30#1:90,2\n30#1:92,2\n30#1:98,11\n30#1:94,4\n*E\n"
    }
.end annotation


# static fields
.field private static _noSim:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNoSim(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/NoSimKt;->_noSim:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

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
    const-string v2, "Rounded.NoSim"

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
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    const v0, 0x4045c28f    # 3.09f

    .line 71
    .line 72
    .line 73
    const v2, 0x408e147b    # 4.44f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/16 v17, 0x0

    .line 80
    .line 81
    const v18, 0x3fb47ae1    # 1.41f

    .line 82
    .line 83
    .line 84
    const v13, -0x413851ec    # -0.39f

    .line 85
    .line 86
    .line 87
    const v14, 0x3ec7ae14    # 0.39f

    .line 88
    .line 89
    .line 90
    const v15, -0x413851ec    # -0.39f

    .line 91
    .line 92
    .line 93
    const v16, 0x3f828f5c    # 1.02f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v0, 0x4001eb85    # 2.03f

    .line 100
    .line 101
    .line 102
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v0, -0x420a3d71    # -0.12f

    .line 106
    .line 107
    .line 108
    const v4, 0x3e051eb8    # 0.13f

    .line 109
    .line 110
    .line 111
    invoke-virtual {v12, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/high16 v0, 0x41980000    # 19.0f

    .line 115
    .line 116
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v17, 0x40000000    # 2.0f

    .line 120
    .line 121
    const/high16 v18, 0x40000000    # 2.0f

    .line 122
    .line 123
    const/4 v13, 0x0

    .line 124
    const v14, 0x3f8ccccd    # 1.1f

    .line 125
    .line 126
    .line 127
    const v15, 0x3f666666    # 0.9f

    .line 128
    .line 129
    .line 130
    const/high16 v16, 0x40000000    # 2.0f

    .line 131
    .line 132
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v4, 0x41200000    # 10.0f

    .line 136
    .line 137
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v17, 0x3f7851ec    # 0.97f

    .line 141
    .line 142
    .line 143
    const v18, -0x417ae148    # -0.26f

    .line 144
    .line 145
    .line 146
    const v13, 0x3eb33333    # 0.35f

    .line 147
    .line 148
    .line 149
    const/4 v14, 0x0

    .line 150
    const v15, 0x3f2e147b    # 0.68f

    .line 151
    .line 152
    .line 153
    const v16, -0x42333333    # -0.1f

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v4, 0x3f95c28f    # 1.17f

    .line 160
    .line 161
    .line 162
    invoke-virtual {v12, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v17, 0x3fb47ae1    # 1.41f

    .line 166
    .line 167
    .line 168
    const/16 v18, 0x0

    .line 169
    .line 170
    const v13, 0x3ec7ae14    # 0.39f

    .line 171
    .line 172
    .line 173
    const v14, 0x3ec7ae14    # 0.39f

    .line 174
    .line 175
    .line 176
    const v15, 0x3f828f5c    # 1.02f

    .line 177
    .line 178
    .line 179
    const v16, 0x3ec7ae14    # 0.39f

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const/16 v17, 0x0

    .line 186
    .line 187
    const v18, -0x404b851f    # -1.41f

    .line 188
    .line 189
    .line 190
    const v14, -0x413851ec    # -0.39f

    .line 191
    .line 192
    .line 193
    const v15, 0x3ec7ae14    # 0.39f

    .line 194
    .line 195
    .line 196
    const v16, -0x407d70a4    # -1.02f

    .line 197
    .line 198
    .line 199
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v4, 0x40900000    # 4.5f

    .line 203
    .line 204
    invoke-virtual {v12, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v17, -0x404b851f    # -1.41f

    .line 208
    .line 209
    .line 210
    const/16 v18, 0x0

    .line 211
    .line 212
    const v13, -0x413851ec    # -0.39f

    .line 213
    .line 214
    .line 215
    const v15, -0x407d70a4    # -1.02f

    .line 216
    .line 217
    .line 218
    const v16, -0x413851ec    # -0.39f

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v2, 0x4180e148    # 16.11f

    .line 228
    .line 229
    .line 230
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v4, 0x40a00000    # 5.0f

    .line 234
    .line 235
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v17, -0x40000000    # -2.0f

    .line 239
    .line 240
    const/high16 v18, -0x40000000    # -2.0f

    .line 241
    .line 242
    const/4 v13, 0x0

    .line 243
    const v14, -0x40733333    # -1.1f

    .line 244
    .line 245
    .line 246
    const v15, -0x4099999a    # -0.9f

    .line 247
    .line 248
    .line 249
    const/high16 v16, -0x40000000    # -2.0f

    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v4, -0x3f2051ec    # -6.99f

    .line 255
    .line 256
    .line 257
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v4, 0x40fe6666    # 7.95f

    .line 261
    .line 262
    .line 263
    const v6, 0x40a1eb85    # 5.06f

    .line 264
    .line 265
    .line 266
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    const/16 v16, 0x3800

    .line 280
    .line 281
    const/16 v17, 0x0

    .line 282
    .line 283
    const-string v4, ""

    .line 284
    .line 285
    const/high16 v6, 0x3f800000    # 1.0f

    .line 286
    .line 287
    const/4 v7, 0x0

    .line 288
    const/high16 v8, 0x3f800000    # 1.0f

    .line 289
    .line 290
    const/high16 v9, 0x3f800000    # 1.0f

    .line 291
    .line 292
    const/high16 v12, 0x3f800000    # 1.0f

    .line 293
    .line 294
    const/4 v14, 0x0

    .line 295
    const/4 v15, 0x0

    .line 296
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    sput-object v0, Landroidx/compose/material/icons/rounded/NoSimKt;->_noSim:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 305
    .line 306
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    return-object v0
.end method
