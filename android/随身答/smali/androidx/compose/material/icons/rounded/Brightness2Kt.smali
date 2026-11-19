.class public final Landroidx/compose/material/icons/rounded/Brightness2Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_brightness2",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Brightness2",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getBrightness2",
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
        "SMAP\nBrightness2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brightness2.kt\nandroidx/compose/material/icons/rounded/Brightness2Kt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,47:1\n212#2,12:48\n233#2,18:61\n253#2:98\n174#3:60\n705#4,2:79\n717#4,2:81\n719#4,11:87\n72#5,4:83\n*S KotlinDebug\n*F\n+ 1 Brightness2.kt\nandroidx/compose/material/icons/rounded/Brightness2Kt\n*L\n29#1:48,12\n30#1:61,18\n30#1:98\n29#1:60\n30#1:79,2\n30#1:81,2\n30#1:87,11\n30#1:83,4\n*E\n"
    }
.end annotation


# static fields
.field private static _brightness2:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBrightness2(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/Brightness2Kt;->_brightness2:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Brightness2"

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
    const v0, 0x4146e148    # 12.43f

    .line 71
    .line 72
    .line 73
    const v2, 0x40133333    # 2.3f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x3f2bd70a    # -6.63f

    .line 80
    .line 81
    .line 82
    const v18, 0x3f23d70a    # 0.64f

    .line 83
    .line 84
    .line 85
    const v13, -0x3fe7ae14    # -2.38f

    .line 86
    .line 87
    .line 88
    const v14, -0x40e8f5c3    # -0.59f

    .line 89
    .line 90
    .line 91
    const v15, -0x3f6a3d71    # -4.68f

    .line 92
    .line 93
    .line 94
    const v16, -0x4175c28f    # -0.27f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v17, -0x42333333    # -0.1f

    .line 101
    .line 102
    .line 103
    const v18, 0x3f5c28f6    # 0.86f

    .line 104
    .line 105
    .line 106
    const v13, -0x414ccccd    # -0.35f

    .line 107
    .line 108
    .line 109
    const v14, 0x3e23d70a    # 0.16f

    .line 110
    .line 111
    .line 112
    const v15, -0x412e147b    # -0.41f

    .line 113
    .line 114
    .line 115
    const v16, 0x3f23d70a    # 0.64f

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v17, 0x41200000    # 10.0f

    .line 122
    .line 123
    const/high16 v18, 0x41400000    # 12.0f

    .line 124
    .line 125
    const v13, 0x4104cccd    # 8.3f

    .line 126
    .line 127
    .line 128
    const v14, 0x40b33333    # 5.6f

    .line 129
    .line 130
    .line 131
    const/high16 v15, 0x41200000    # 10.0f

    .line 132
    .line 133
    const v16, 0x4109999a    # 8.6f

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v17, -0x3f766666    # -4.3f

    .line 140
    .line 141
    .line 142
    const v18, 0x41033333    # 8.2f

    .line 143
    .line 144
    .line 145
    const/4 v13, 0x0

    .line 146
    const v14, 0x4059999a    # 3.4f

    .line 147
    .line 148
    .line 149
    const v15, -0x40266666    # -1.7f

    .line 150
    .line 151
    .line 152
    const v16, 0x40cccccd    # 6.4f

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v17, 0x3db851ec    # 0.09f

    .line 159
    .line 160
    .line 161
    const v18, 0x3f5c28f6    # 0.86f

    .line 162
    .line 163
    .line 164
    const v13, -0x415c28f6    # -0.32f

    .line 165
    .line 166
    .line 167
    const v14, 0x3e6147ae    # 0.22f

    .line 168
    .line 169
    .line 170
    const v15, -0x417ae148    # -0.26f

    .line 171
    .line 172
    .line 173
    const v16, 0x3f333333    # 0.7f

    .line 174
    .line 175
    .line 176
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v17, 0x4086b852    # 4.21f

    .line 180
    .line 181
    .line 182
    const v18, 0x3f70a3d7    # 0.94f

    .line 183
    .line 184
    .line 185
    const v13, 0x3fa3d70a    # 1.28f

    .line 186
    .line 187
    .line 188
    const v14, 0x3f19999a    # 0.6f

    .line 189
    .line 190
    .line 191
    const v15, 0x402d70a4    # 2.71f

    .line 192
    .line 193
    .line 194
    const v16, 0x3f70a3d7    # 0.94f

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v17, 0x411deb85    # 9.87f

    .line 201
    .line 202
    .line 203
    const v18, -0x3ec66666    # -11.6f

    .line 204
    .line 205
    .line 206
    const v13, 0x40c1999a    # 6.05f

    .line 207
    .line 208
    .line 209
    const/4 v14, 0x0

    .line 210
    const v15, 0x412d999a    # 10.85f

    .line 211
    .line 212
    .line 213
    const v16, -0x3f53d70a    # -5.38f

    .line 214
    .line 215
    .line 216
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v17, -0x3f11eb85    # -7.44f

    .line 220
    .line 221
    .line 222
    const v18, -0x3efe6666    # -8.1f

    .line 223
    .line 224
    .line 225
    const v13, -0x40e3d70a    # -0.61f

    .line 226
    .line 227
    .line 228
    const v14, -0x3f851eb8    # -3.92f

    .line 229
    .line 230
    .line 231
    const v15, -0x3f9a3d71    # -3.59f

    .line 232
    .line 233
    .line 234
    const v16, -0x3f1ae148    # -7.16f

    .line 235
    .line 236
    .line 237
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    const/16 v16, 0x3800

    .line 248
    .line 249
    const/16 v17, 0x0

    .line 250
    .line 251
    const-string v4, ""

    .line 252
    .line 253
    const/high16 v6, 0x3f800000    # 1.0f

    .line 254
    .line 255
    const/4 v7, 0x0

    .line 256
    const/high16 v8, 0x3f800000    # 1.0f

    .line 257
    .line 258
    const/high16 v9, 0x3f800000    # 1.0f

    .line 259
    .line 260
    const/high16 v12, 0x3f800000    # 1.0f

    .line 261
    .line 262
    const/4 v13, 0x0

    .line 263
    const/4 v14, 0x0

    .line 264
    const/4 v15, 0x0

    .line 265
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    sput-object v0, Landroidx/compose/material/icons/rounded/Brightness2Kt;->_brightness2:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 274
    .line 275
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    return-object v0
.end method
