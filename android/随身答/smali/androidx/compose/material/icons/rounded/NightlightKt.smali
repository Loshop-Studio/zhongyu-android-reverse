.class public final Landroidx/compose/material/icons/rounded/NightlightKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_nightlight",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Nightlight",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getNightlight",
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
        "SMAP\nNightlight.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Nightlight.kt\nandroidx/compose/material/icons/rounded/NightlightKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,47:1\n212#2,12:48\n233#2,18:61\n253#2:98\n174#3:60\n705#4,2:79\n717#4,2:81\n719#4,11:87\n72#5,4:83\n*S KotlinDebug\n*F\n+ 1 Nightlight.kt\nandroidx/compose/material/icons/rounded/NightlightKt\n*L\n29#1:48,12\n30#1:61,18\n30#1:98\n29#1:60\n30#1:79,2\n30#1:81,2\n30#1:87,11\n30#1:83,4\n*E\n"
    }
.end annotation


# static fields
.field private static _nightlight:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNightlight(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/NightlightKt;->_nightlight:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Nightlight"

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
    const v0, 0x41391eb8    # 11.57f

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
    const v17, 0x40d428f6    # 6.63f

    .line 80
    .line 81
    .line 82
    const v18, 0x3f23d70a    # 0.64f

    .line 83
    .line 84
    .line 85
    const v13, 0x401851ec    # 2.38f

    .line 86
    .line 87
    .line 88
    const v14, -0x40e8f5c3    # -0.59f

    .line 89
    .line 90
    .line 91
    const v15, 0x4095c28f    # 4.68f

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
    const v17, 0x3dcccccd    # 0.1f

    .line 101
    .line 102
    .line 103
    const v18, 0x3f5c28f6    # 0.86f

    .line 104
    .line 105
    .line 106
    const v13, 0x3eb33333    # 0.35f

    .line 107
    .line 108
    .line 109
    const v14, 0x3e23d70a    # 0.16f

    .line 110
    .line 111
    .line 112
    const v15, 0x3ed1eb85    # 0.41f

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
    const/high16 v17, 0x41600000    # 14.0f

    .line 122
    .line 123
    const/high16 v18, 0x41400000    # 12.0f

    .line 124
    .line 125
    const v13, 0x417b3333    # 15.7f

    .line 126
    .line 127
    .line 128
    const v14, 0x40b33333    # 5.6f

    .line 129
    .line 130
    .line 131
    const/high16 v15, 0x41600000    # 14.0f

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
    const v0, 0x4089999a    # 4.3f

    .line 140
    .line 141
    .line 142
    const v2, 0x41033333    # 8.2f

    .line 143
    .line 144
    .line 145
    const v4, 0x3fd9999a    # 1.7f

    .line 146
    .line 147
    .line 148
    const v6, 0x40cccccd    # 6.4f

    .line 149
    .line 150
    .line 151
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v17, -0x4247ae14    # -0.09f

    .line 155
    .line 156
    .line 157
    const v18, 0x3f5c28f6    # 0.86f

    .line 158
    .line 159
    .line 160
    const v13, 0x3ea3d70a    # 0.32f

    .line 161
    .line 162
    .line 163
    const v14, 0x3e6147ae    # 0.22f

    .line 164
    .line 165
    .line 166
    const v15, 0x3e851eb8    # 0.26f

    .line 167
    .line 168
    .line 169
    const v16, 0x3f333333    # 0.7f

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const/high16 v17, 0x41600000    # 14.0f

    .line 176
    .line 177
    const/high16 v18, 0x41b00000    # 22.0f

    .line 178
    .line 179
    const v13, 0x418770a4    # 16.93f

    .line 180
    .line 181
    .line 182
    const v14, 0x41ad47ae    # 21.66f

    .line 183
    .line 184
    .line 185
    const/high16 v15, 0x41780000    # 15.5f

    .line 186
    .line 187
    const/high16 v16, 0x41b00000    # 22.0f

    .line 188
    .line 189
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v17, -0x3ee2147b    # -9.87f

    .line 193
    .line 194
    .line 195
    const v18, -0x3ec66666    # -11.6f

    .line 196
    .line 197
    .line 198
    const v13, -0x3f3e6666    # -6.05f

    .line 199
    .line 200
    .line 201
    const/4 v14, 0x0

    .line 202
    const v15, -0x3ed26666    # -10.85f

    .line 203
    .line 204
    .line 205
    const v16, -0x3f53d70a    # -5.38f

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v17, 0x41391eb8    # 11.57f

    .line 212
    .line 213
    .line 214
    const v18, 0x40133333    # 2.3f

    .line 215
    .line 216
    .line 217
    const v13, 0x4097ae14    # 4.74f

    .line 218
    .line 219
    .line 220
    const v14, 0x40cf5c29    # 6.48f

    .line 221
    .line 222
    .line 223
    const v15, 0x40f70a3d    # 7.72f

    .line 224
    .line 225
    .line 226
    const v16, 0x404f5c29    # 3.24f

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    const/16 v16, 0x3800

    .line 240
    .line 241
    const/16 v17, 0x0

    .line 242
    .line 243
    const-string v4, ""

    .line 244
    .line 245
    const/high16 v6, 0x3f800000    # 1.0f

    .line 246
    .line 247
    const/4 v7, 0x0

    .line 248
    const/high16 v8, 0x3f800000    # 1.0f

    .line 249
    .line 250
    const/high16 v9, 0x3f800000    # 1.0f

    .line 251
    .line 252
    const/high16 v12, 0x3f800000    # 1.0f

    .line 253
    .line 254
    const/4 v13, 0x0

    .line 255
    const/4 v14, 0x0

    .line 256
    const/4 v15, 0x0

    .line 257
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    sput-object v0, Landroidx/compose/material/icons/rounded/NightlightKt;->_nightlight:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 266
    .line 267
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    return-object v0
.end method
