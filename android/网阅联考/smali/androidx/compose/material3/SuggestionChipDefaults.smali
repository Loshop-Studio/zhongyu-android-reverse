.class public final Landroidx/compose/material3/SuggestionChipDefaults;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Landroidx/compose/material3/ExperimentalMaterial3Api;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002JQ\u0010\u000e\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0011H\u0007\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0017\u0010\u0018JQ\u0010\u0019\u001a\u00020\u001a2\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u001f\u001a\u00020\u00042\u0008\u0008\u0002\u0010 \u001a\u00020\u0004H\u0007\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008!\u0010\"J3\u0010#\u001a\u00020$2\u0008\u0008\u0002\u0010%\u001a\u00020\u00112\u0008\u0008\u0002\u0010&\u001a\u00020\u00112\u0008\u0008\u0002\u0010\'\u001a\u00020\u0004H\u0007\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008(\u0010)JQ\u0010*\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0011H\u0007\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008+\u0010\u0018JQ\u0010,\u001a\u00020\u001a2\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u001f\u001a\u00020\u00042\u0008\u0008\u0002\u0010 \u001a\u00020\u0004H\u0007\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008-\u0010\"R\u001c\u0010\u0003\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\u0008\u0005\u0010\u0006R\u001c\u0010\u0008\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\u0008\t\u0010\u0006R\u0011\u0010\n\u001a\u00020\u000b8G\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\r\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006."
    }
    d2 = {
        "Landroidx/compose/material3/SuggestionChipDefaults;",
        "",
        "()V",
        "Height",
        "Landroidx/compose/ui/unit/Dp;",
        "getHeight-D9Ej5fM",
        "()F",
        "F",
        "IconSize",
        "getIconSize-D9Ej5fM",
        "shape",
        "Landroidx/compose/ui/graphics/Shape;",
        "getShape",
        "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;",
        "elevatedSuggestionChipColors",
        "Landroidx/compose/material3/ChipColors;",
        "containerColor",
        "Landroidx/compose/ui/graphics/Color;",
        "labelColor",
        "iconContentColor",
        "disabledContainerColor",
        "disabledLabelColor",
        "disabledIconContentColor",
        "elevatedSuggestionChipColors-5tl4gsc",
        "(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipColors;",
        "elevatedSuggestionChipElevation",
        "Landroidx/compose/material3/ChipElevation;",
        "defaultElevation",
        "pressedElevation",
        "focusedElevation",
        "hoveredElevation",
        "draggedElevation",
        "disabledElevation",
        "elevatedSuggestionChipElevation-aqJV_2Y",
        "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipElevation;",
        "suggestionChipBorder",
        "Landroidx/compose/material3/ChipBorder;",
        "borderColor",
        "disabledBorderColor",
        "borderWidth",
        "suggestionChipBorder-d_3_b6Q",
        "(JJFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipBorder;",
        "suggestionChipColors",
        "suggestionChipColors-5tl4gsc",
        "suggestionChipElevation",
        "suggestionChipElevation-aqJV_2Y",
        "material3_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field private static final Height:F

.field public static final INSTANCE:Landroidx/compose/material3/SuggestionChipDefaults;

.field private static final IconSize:F


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/material3/SuggestionChipDefaults;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/compose/material3/SuggestionChipDefaults;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/compose/material3/SuggestionChipDefaults;->INSTANCE:Landroidx/compose/material3/SuggestionChipDefaults;

    .line 7
    .line 8
    sget-object v0, Landroidx/compose/material3/tokens/SuggestionChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/SuggestionChipTokens;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/SuggestionChipTokens;->getContainerHeight-D9Ej5fM()F

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    sput v1, Landroidx/compose/material3/SuggestionChipDefaults;->Height:F

    .line 15
    .line 16
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/SuggestionChipTokens;->getLeadingIconSize-D9Ej5fM()F

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    sput v0, Landroidx/compose/material3/SuggestionChipDefaults;->IconSize:F

    .line 21
    .line 22
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final elevatedSuggestionChipColors-5tl4gsc(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipColors;
    .locals 24
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .line 1
    move-object/from16 v0, p13

    .line 2
    .line 3
    const v1, 0x4ba9dc15    # 2.226385E7f

    .line 4
    .line 5
    .line 6
    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 7
    .line 8
    .line 9
    and-int/lit8 v2, p15, 0x1

    .line 10
    .line 11
    const/4 v3, 0x6

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    sget-object v2, Landroidx/compose/material3/tokens/SuggestionChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/SuggestionChipTokens;

    .line 15
    .line 16
    invoke-virtual {v2}, Landroidx/compose/material3/tokens/SuggestionChipTokens;->getElevatedContainerColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-static {v2, v0, v3}, Landroidx/compose/material3/ColorSchemeKt;->toColor(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    .line 21
    .line 22
    .line 23
    move-result-wide v4

    .line 24
    move-wide v7, v4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-wide/from16 v7, p1

    .line 27
    .line 28
    :goto_0
    and-int/lit8 v2, p15, 0x2

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    sget-object v2, Landroidx/compose/material3/tokens/SuggestionChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/SuggestionChipTokens;

    .line 33
    .line 34
    invoke-virtual {v2}, Landroidx/compose/material3/tokens/SuggestionChipTokens;->getLabelTextColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-static {v2, v0, v3}, Landroidx/compose/material3/ColorSchemeKt;->toColor(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    .line 39
    .line 40
    .line 41
    move-result-wide v4

    .line 42
    move-wide v9, v4

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move-wide/from16 v9, p3

    .line 45
    .line 46
    :goto_1
    and-int/lit8 v2, p15, 0x4

    .line 47
    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    sget-object v2, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    .line 51
    .line 52
    invoke-virtual {v2, v0, v3}, Landroidx/compose/material3/MaterialTheme;->getColorScheme(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ColorScheme;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v2}, Landroidx/compose/material3/ColorScheme;->getOnSurfaceVariant-0d7_KjU()J

    .line 57
    .line 58
    .line 59
    move-result-wide v4

    .line 60
    move-wide v11, v4

    .line 61
    goto :goto_2

    .line 62
    :cond_2
    move-wide/from16 v11, p5

    .line 63
    .line 64
    :goto_2
    and-int/lit8 v2, p15, 0x8

    .line 65
    .line 66
    if-eqz v2, :cond_3

    .line 67
    .line 68
    sget-object v2, Landroidx/compose/material3/tokens/SuggestionChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/SuggestionChipTokens;

    .line 69
    .line 70
    invoke-virtual {v2}, Landroidx/compose/material3/tokens/SuggestionChipTokens;->getElevatedDisabledContainerColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-static {v2, v0, v3}, Landroidx/compose/material3/ColorSchemeKt;->toColor(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    .line 75
    .line 76
    .line 77
    move-result-wide v4

    .line 78
    const v2, 0x3df5c28f    # 0.12f

    .line 79
    .line 80
    .line 81
    const/4 v6, 0x0

    .line 82
    const/4 v13, 0x0

    .line 83
    const/4 v14, 0x0

    .line 84
    const/16 v15, 0xe

    .line 85
    .line 86
    const/16 v16, 0x0

    .line 87
    .line 88
    move-wide/from16 p1, v4

    .line 89
    .line 90
    move/from16 p3, v2

    .line 91
    .line 92
    move/from16 p4, v6

    .line 93
    .line 94
    move/from16 p5, v13

    .line 95
    .line 96
    move/from16 p6, v14

    .line 97
    .line 98
    move/from16 p7, v15

    .line 99
    .line 100
    move-object/from16 p8, v16

    .line 101
    .line 102
    invoke-static/range {p1 .. p8}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    .line 103
    .line 104
    .line 105
    move-result-wide v4

    .line 106
    move-wide v15, v4

    .line 107
    goto :goto_3

    .line 108
    :cond_3
    move-wide/from16 v15, p7

    .line 109
    .line 110
    :goto_3
    and-int/lit8 v2, p15, 0x10

    .line 111
    .line 112
    if-eqz v2, :cond_4

    .line 113
    .line 114
    sget-object v2, Landroidx/compose/material3/tokens/SuggestionChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/SuggestionChipTokens;

    .line 115
    .line 116
    invoke-virtual {v2}, Landroidx/compose/material3/tokens/SuggestionChipTokens;->getDisabledLabelTextColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-static {v2, v0, v3}, Landroidx/compose/material3/ColorSchemeKt;->toColor(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    .line 121
    .line 122
    .line 123
    move-result-wide v4

    .line 124
    const v2, 0x3ec28f5c    # 0.38f

    .line 125
    .line 126
    .line 127
    const/4 v6, 0x0

    .line 128
    const/4 v13, 0x0

    .line 129
    const/4 v14, 0x0

    .line 130
    const/16 v17, 0xe

    .line 131
    .line 132
    const/16 v18, 0x0

    .line 133
    .line 134
    move-wide/from16 p1, v4

    .line 135
    .line 136
    move/from16 p3, v2

    .line 137
    .line 138
    move/from16 p4, v6

    .line 139
    .line 140
    move/from16 p5, v13

    .line 141
    .line 142
    move/from16 p6, v14

    .line 143
    .line 144
    move/from16 p7, v17

    .line 145
    .line 146
    move-object/from16 p8, v18

    .line 147
    .line 148
    invoke-static/range {p1 .. p8}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    .line 149
    .line 150
    .line 151
    move-result-wide v4

    .line 152
    move-wide/from16 v17, v4

    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_4
    move-wide/from16 v17, p9

    .line 156
    .line 157
    :goto_4
    and-int/lit8 v2, p15, 0x20

    .line 158
    .line 159
    if-eqz v2, :cond_5

    .line 160
    .line 161
    sget-object v2, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    .line 162
    .line 163
    invoke-virtual {v2, v0, v3}, Landroidx/compose/material3/MaterialTheme;->getColorScheme(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ColorScheme;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-virtual {v2}, Landroidx/compose/material3/ColorScheme;->getOnSurface-0d7_KjU()J

    .line 168
    .line 169
    .line 170
    move-result-wide v2

    .line 171
    const v4, 0x3ec28f5c    # 0.38f

    .line 172
    .line 173
    .line 174
    const/4 v5, 0x0

    .line 175
    const/4 v6, 0x0

    .line 176
    const/4 v13, 0x0

    .line 177
    const/16 v14, 0xe

    .line 178
    .line 179
    const/16 v19, 0x0

    .line 180
    .line 181
    move-wide/from16 p1, v2

    .line 182
    .line 183
    move/from16 p3, v4

    .line 184
    .line 185
    move/from16 p4, v5

    .line 186
    .line 187
    move/from16 p5, v6

    .line 188
    .line 189
    move/from16 p6, v13

    .line 190
    .line 191
    move/from16 p7, v14

    .line 192
    .line 193
    move-object/from16 p8, v19

    .line 194
    .line 195
    invoke-static/range {p1 .. p8}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    .line 196
    .line 197
    .line 198
    move-result-wide v2

    .line 199
    move-wide/from16 v19, v2

    .line 200
    .line 201
    goto :goto_5

    .line 202
    :cond_5
    move-wide/from16 v19, p11

    .line 203
    .line 204
    :goto_5
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    if-eqz v2, :cond_6

    .line 209
    .line 210
    const/4 v2, -0x1

    .line 211
    const-string v3, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipColors (Chip.kt:1249)"

    .line 212
    .line 213
    move/from16 v4, p14

    .line 214
    .line 215
    invoke-static {v1, v4, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 216
    .line 217
    .line 218
    :cond_6
    new-instance v1, Landroidx/compose/material3/ChipColors;

    .line 219
    .line 220
    move-object v6, v1

    .line 221
    sget-object v2, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 222
    .line 223
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 224
    .line 225
    .line 226
    move-result-wide v13

    .line 227
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 228
    .line 229
    .line 230
    move-result-wide v21

    .line 231
    const/16 v23, 0x0

    .line 232
    .line 233
    invoke-direct/range {v6 .. v23}, Landroidx/compose/material3/ChipColors;-><init>(JJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 234
    .line 235
    .line 236
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 237
    .line 238
    .line 239
    move-result v2

    .line 240
    if-eqz v2, :cond_7

    .line 241
    .line 242
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 243
    .line 244
    .line 245
    :cond_7
    invoke-interface/range {p13 .. p13}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 246
    .line 247
    .line 248
    return-object v1
.end method

.method public final elevatedSuggestionChipElevation-aqJV_2Y(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipElevation;
    .locals 11
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .line 1
    const v0, 0x42a4ad13

    .line 2
    .line 3
    .line 4
    move-object/from16 v1, p7

    .line 5
    .line 6
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 7
    .line 8
    .line 9
    and-int/lit8 v2, p9, 0x1

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    sget-object v2, Landroidx/compose/material3/tokens/SuggestionChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/SuggestionChipTokens;

    .line 14
    .line 15
    invoke-virtual {v2}, Landroidx/compose/material3/tokens/SuggestionChipTokens;->getElevatedContainerElevation-D9Ej5fM()F

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    move v4, v2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v4, p1

    .line 22
    :goto_0
    and-int/lit8 v2, p9, 0x2

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    sget-object v2, Landroidx/compose/material3/tokens/SuggestionChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/SuggestionChipTokens;

    .line 27
    .line 28
    invoke-virtual {v2}, Landroidx/compose/material3/tokens/SuggestionChipTokens;->getElevatedPressedContainerElevation-D9Ej5fM()F

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    move v5, v2

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v5, p2

    .line 35
    :goto_1
    and-int/lit8 v2, p9, 0x4

    .line 36
    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    sget-object v2, Landroidx/compose/material3/tokens/SuggestionChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/SuggestionChipTokens;

    .line 40
    .line 41
    invoke-virtual {v2}, Landroidx/compose/material3/tokens/SuggestionChipTokens;->getElevatedFocusContainerElevation-D9Ej5fM()F

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    move v6, v2

    .line 46
    goto :goto_2

    .line 47
    :cond_2
    move v6, p3

    .line 48
    :goto_2
    and-int/lit8 v2, p9, 0x8

    .line 49
    .line 50
    if-eqz v2, :cond_3

    .line 51
    .line 52
    sget-object v2, Landroidx/compose/material3/tokens/SuggestionChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/SuggestionChipTokens;

    .line 53
    .line 54
    invoke-virtual {v2}, Landroidx/compose/material3/tokens/SuggestionChipTokens;->getElevatedHoverContainerElevation-D9Ej5fM()F

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    move v7, v2

    .line 59
    goto :goto_3

    .line 60
    :cond_3
    move v7, p4

    .line 61
    :goto_3
    and-int/lit8 v2, p9, 0x10

    .line 62
    .line 63
    if-eqz v2, :cond_4

    .line 64
    .line 65
    sget-object v2, Landroidx/compose/material3/tokens/SuggestionChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/SuggestionChipTokens;

    .line 66
    .line 67
    invoke-virtual {v2}, Landroidx/compose/material3/tokens/SuggestionChipTokens;->getDraggedContainerElevation-D9Ej5fM()F

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    move v8, v2

    .line 72
    goto :goto_4

    .line 73
    :cond_4
    move/from16 v8, p5

    .line 74
    .line 75
    :goto_4
    and-int/lit8 v2, p9, 0x20

    .line 76
    .line 77
    if-eqz v2, :cond_5

    .line 78
    .line 79
    sget-object v2, Landroidx/compose/material3/tokens/SuggestionChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/SuggestionChipTokens;

    .line 80
    .line 81
    invoke-virtual {v2}, Landroidx/compose/material3/tokens/SuggestionChipTokens;->getElevatedDisabledContainerElevation-D9Ej5fM()F

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    move v9, v2

    .line 86
    goto :goto_5

    .line 87
    :cond_5
    move/from16 v9, p6

    .line 88
    .line 89
    :goto_5
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-eqz v2, :cond_6

    .line 94
    .line 95
    const/4 v2, -0x1

    .line 96
    const-string v3, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipElevation (Chip.kt:1286)"

    .line 97
    .line 98
    move/from16 v10, p8

    .line 99
    .line 100
    invoke-static {v0, v10, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 101
    .line 102
    .line 103
    :cond_6
    new-instance v0, Landroidx/compose/material3/ChipElevation;

    .line 104
    .line 105
    const/4 v10, 0x0

    .line 106
    move-object v3, v0

    .line 107
    invoke-direct/range {v3 .. v10}, Landroidx/compose/material3/ChipElevation;-><init>(FFFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 108
    .line 109
    .line 110
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-eqz v2, :cond_7

    .line 115
    .line 116
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 117
    .line 118
    .line 119
    :cond_7
    invoke-interface/range {p7 .. p7}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 120
    .line 121
    .line 122
    return-object v0
.end method

.method public final getHeight-D9Ej5fM()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/SuggestionChipDefaults;->Height:F

    .line 2
    .line 3
    return v0
.end method

.method public final getIconSize-D9Ej5fM()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/SuggestionChipDefaults;->IconSize:F

    .line 2
    .line 3
    return v0
.end method

.method public final getShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;
    .locals 3
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Lkotlin/jvm/JvmName;
        name = "getShape"
    .end annotation

    .line 1
    const v0, 0x2637c157

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v1, -0x1

    .line 14
    const-string v2, "androidx.compose.material3.SuggestionChipDefaults.<get-shape> (Chip.kt:1303)"

    .line 15
    .line 16
    invoke-static {v0, p2, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    sget-object p2, Landroidx/compose/material3/tokens/SuggestionChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/SuggestionChipTokens;

    .line 20
    .line 21
    invoke-virtual {p2}, Landroidx/compose/material3/tokens/SuggestionChipTokens;->getContainerShape()Landroidx/compose/material3/tokens/ShapeKeyTokens;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    const/4 v0, 0x6

    .line 26
    invoke-static {p2, p1, v0}, Landroidx/compose/material3/ShapesKt;->toShape(Landroidx/compose/material3/tokens/ShapeKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 40
    .line 41
    .line 42
    return-object p2
.end method

.method public final suggestionChipBorder-d_3_b6Q(JJFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipBorder;
    .locals 17
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .line 1
    move-object/from16 v0, p6

    .line 2
    .line 3
    const v1, 0x1a2ef0cf

    .line 4
    .line 5
    .line 6
    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 7
    .line 8
    .line 9
    and-int/lit8 v2, p8, 0x1

    .line 10
    .line 11
    const/4 v3, 0x6

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    sget-object v2, Landroidx/compose/material3/tokens/SuggestionChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/SuggestionChipTokens;

    .line 15
    .line 16
    invoke-virtual {v2}, Landroidx/compose/material3/tokens/SuggestionChipTokens;->getFlatOutlineColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-static {v2, v0, v3}, Landroidx/compose/material3/ColorSchemeKt;->toColor(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    .line 21
    .line 22
    .line 23
    move-result-wide v4

    .line 24
    move-wide v7, v4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-wide/from16 v7, p1

    .line 27
    .line 28
    :goto_0
    and-int/lit8 v2, p8, 0x2

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    sget-object v2, Landroidx/compose/material3/tokens/SuggestionChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/SuggestionChipTokens;

    .line 33
    .line 34
    invoke-virtual {v2}, Landroidx/compose/material3/tokens/SuggestionChipTokens;->getFlatDisabledOutlineColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-static {v2, v0, v3}, Landroidx/compose/material3/ColorSchemeKt;->toColor(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    .line 39
    .line 40
    .line 41
    move-result-wide v9

    .line 42
    const v11, 0x3df5c28f    # 0.12f

    .line 43
    .line 44
    .line 45
    const/4 v12, 0x0

    .line 46
    const/4 v13, 0x0

    .line 47
    const/4 v14, 0x0

    .line 48
    const/16 v15, 0xe

    .line 49
    .line 50
    const/16 v16, 0x0

    .line 51
    .line 52
    invoke-static/range {v9 .. v16}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    .line 53
    .line 54
    .line 55
    move-result-wide v2

    .line 56
    move-wide v9, v2

    .line 57
    goto :goto_1

    .line 58
    :cond_1
    move-wide/from16 v9, p3

    .line 59
    .line 60
    :goto_1
    and-int/lit8 v2, p8, 0x4

    .line 61
    .line 62
    if-eqz v2, :cond_2

    .line 63
    .line 64
    sget-object v2, Landroidx/compose/material3/tokens/SuggestionChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/SuggestionChipTokens;

    .line 65
    .line 66
    invoke-virtual {v2}, Landroidx/compose/material3/tokens/SuggestionChipTokens;->getFlatOutlineWidth-D9Ej5fM()F

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    move v11, v2

    .line 71
    goto :goto_2

    .line 72
    :cond_2
    move/from16 v11, p5

    .line 73
    .line 74
    :goto_2
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_3

    .line 79
    .line 80
    const/4 v2, -0x1

    .line 81
    const-string v3, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipBorder (Chip.kt:1226)"

    .line 82
    .line 83
    move/from16 v4, p7

    .line 84
    .line 85
    invoke-static {v1, v4, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 86
    .line 87
    .line 88
    :cond_3
    new-instance v1, Landroidx/compose/material3/ChipBorder;

    .line 89
    .line 90
    const/4 v12, 0x0

    .line 91
    move-object v6, v1

    .line 92
    invoke-direct/range {v6 .. v12}, Landroidx/compose/material3/ChipBorder;-><init>(JJFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 93
    .line 94
    .line 95
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-eqz v2, :cond_4

    .line 100
    .line 101
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 102
    .line 103
    .line 104
    :cond_4
    invoke-interface/range {p6 .. p6}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 105
    .line 106
    .line 107
    return-object v1
.end method

.method public final suggestionChipColors-5tl4gsc(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipColors;
    .locals 22
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .line 1
    move-object/from16 v0, p13

    .line 2
    .line 3
    const v1, 0x7036ed4b

    .line 4
    .line 5
    .line 6
    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 7
    .line 8
    .line 9
    and-int/lit8 v2, p15, 0x1

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    sget-object v2, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 14
    .line 15
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/Color$Companion;->getTransparent-0d7_KjU()J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    move-wide v5, v2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-wide/from16 v5, p1

    .line 22
    .line 23
    :goto_0
    and-int/lit8 v2, p15, 0x2

    .line 24
    .line 25
    const/4 v3, 0x6

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    sget-object v2, Landroidx/compose/material3/tokens/SuggestionChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/SuggestionChipTokens;

    .line 29
    .line 30
    invoke-virtual {v2}, Landroidx/compose/material3/tokens/SuggestionChipTokens;->getLabelTextColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-static {v2, v0, v3}, Landroidx/compose/material3/ColorSchemeKt;->toColor(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    .line 35
    .line 36
    .line 37
    move-result-wide v7

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move-wide/from16 v7, p3

    .line 40
    .line 41
    :goto_1
    and-int/lit8 v2, p15, 0x4

    .line 42
    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    sget-object v2, Landroidx/compose/material3/tokens/SuggestionChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/SuggestionChipTokens;

    .line 46
    .line 47
    invoke-virtual {v2}, Landroidx/compose/material3/tokens/SuggestionChipTokens;->getLeadingIconColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-static {v2, v0, v3}, Landroidx/compose/material3/ColorSchemeKt;->toColor(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    .line 52
    .line 53
    .line 54
    move-result-wide v9

    .line 55
    goto :goto_2

    .line 56
    :cond_2
    move-wide/from16 v9, p5

    .line 57
    .line 58
    :goto_2
    and-int/lit8 v2, p15, 0x8

    .line 59
    .line 60
    if-eqz v2, :cond_3

    .line 61
    .line 62
    sget-object v2, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 63
    .line 64
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/Color$Companion;->getTransparent-0d7_KjU()J

    .line 65
    .line 66
    .line 67
    move-result-wide v11

    .line 68
    move-wide v13, v11

    .line 69
    goto :goto_3

    .line 70
    :cond_3
    move-wide/from16 v13, p7

    .line 71
    .line 72
    :goto_3
    and-int/lit8 v2, p15, 0x10

    .line 73
    .line 74
    if-eqz v2, :cond_4

    .line 75
    .line 76
    sget-object v2, Landroidx/compose/material3/tokens/SuggestionChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/SuggestionChipTokens;

    .line 77
    .line 78
    invoke-virtual {v2}, Landroidx/compose/material3/tokens/SuggestionChipTokens;->getDisabledLabelTextColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-static {v2, v0, v3}, Landroidx/compose/material3/ColorSchemeKt;->toColor(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    .line 83
    .line 84
    .line 85
    move-result-wide v11

    .line 86
    const v2, 0x3ec28f5c    # 0.38f

    .line 87
    .line 88
    .line 89
    const/4 v4, 0x0

    .line 90
    const/4 v15, 0x0

    .line 91
    const/16 v16, 0x0

    .line 92
    .line 93
    const/16 v17, 0xe

    .line 94
    .line 95
    const/16 v18, 0x0

    .line 96
    .line 97
    move-wide/from16 p1, v11

    .line 98
    .line 99
    move/from16 p3, v2

    .line 100
    .line 101
    move/from16 p4, v4

    .line 102
    .line 103
    move/from16 p5, v15

    .line 104
    .line 105
    move/from16 p6, v16

    .line 106
    .line 107
    move/from16 p7, v17

    .line 108
    .line 109
    move-object/from16 p8, v18

    .line 110
    .line 111
    invoke-static/range {p1 .. p8}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    .line 112
    .line 113
    .line 114
    move-result-wide v11

    .line 115
    move-wide v15, v11

    .line 116
    goto :goto_4

    .line 117
    :cond_4
    move-wide/from16 v15, p9

    .line 118
    .line 119
    :goto_4
    and-int/lit8 v2, p15, 0x20

    .line 120
    .line 121
    if-eqz v2, :cond_5

    .line 122
    .line 123
    sget-object v2, Landroidx/compose/material3/tokens/SuggestionChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/SuggestionChipTokens;

    .line 124
    .line 125
    invoke-virtual {v2}, Landroidx/compose/material3/tokens/SuggestionChipTokens;->getDisabledLeadingIconColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-static {v2, v0, v3}, Landroidx/compose/material3/ColorSchemeKt;->toColor(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    .line 130
    .line 131
    .line 132
    move-result-wide v2

    .line 133
    const v4, 0x3ec28f5c    # 0.38f

    .line 134
    .line 135
    .line 136
    const/4 v11, 0x0

    .line 137
    const/4 v12, 0x0

    .line 138
    const/16 v17, 0x0

    .line 139
    .line 140
    const/16 v18, 0xe

    .line 141
    .line 142
    const/16 v19, 0x0

    .line 143
    .line 144
    move-wide/from16 p1, v2

    .line 145
    .line 146
    move/from16 p3, v4

    .line 147
    .line 148
    move/from16 p4, v11

    .line 149
    .line 150
    move/from16 p5, v12

    .line 151
    .line 152
    move/from16 p6, v17

    .line 153
    .line 154
    move/from16 p7, v18

    .line 155
    .line 156
    move-object/from16 p8, v19

    .line 157
    .line 158
    invoke-static/range {p1 .. p8}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    .line 159
    .line 160
    .line 161
    move-result-wide v2

    .line 162
    move-wide/from16 v17, v2

    .line 163
    .line 164
    goto :goto_5

    .line 165
    :cond_5
    move-wide/from16 v17, p11

    .line 166
    .line 167
    :goto_5
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    if-eqz v2, :cond_6

    .line 172
    .line 173
    const/4 v2, -0x1

    .line 174
    const-string v3, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipColors (Chip.kt:1169)"

    .line 175
    .line 176
    move/from16 v4, p14

    .line 177
    .line 178
    invoke-static {v1, v4, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 179
    .line 180
    .line 181
    :cond_6
    new-instance v1, Landroidx/compose/material3/ChipColors;

    .line 182
    .line 183
    move-object v4, v1

    .line 184
    sget-object v2, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 185
    .line 186
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 187
    .line 188
    .line 189
    move-result-wide v11

    .line 190
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 191
    .line 192
    .line 193
    move-result-wide v19

    .line 194
    const/16 v21, 0x0

    .line 195
    .line 196
    invoke-direct/range {v4 .. v21}, Landroidx/compose/material3/ChipColors;-><init>(JJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 197
    .line 198
    .line 199
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 200
    .line 201
    .line 202
    move-result v2

    .line 203
    if-eqz v2, :cond_7

    .line 204
    .line 205
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 206
    .line 207
    .line 208
    :cond_7
    invoke-interface/range {p13 .. p13}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 209
    .line 210
    .line 211
    return-object v1
.end method

.method public final suggestionChipElevation-aqJV_2Y(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipElevation;
    .locals 11
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .line 1
    const v0, 0x73095f49

    .line 2
    .line 3
    .line 4
    move-object/from16 v1, p7

    .line 5
    .line 6
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 7
    .line 8
    .line 9
    and-int/lit8 v2, p9, 0x1

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    sget-object v2, Landroidx/compose/material3/tokens/SuggestionChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/SuggestionChipTokens;

    .line 14
    .line 15
    invoke-virtual {v2}, Landroidx/compose/material3/tokens/SuggestionChipTokens;->getFlatContainerElevation-D9Ej5fM()F

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    move v4, v2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v4, p1

    .line 22
    :goto_0
    and-int/lit8 v2, p9, 0x2

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    move v5, v4

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v5, p2

    .line 29
    :goto_1
    and-int/lit8 v2, p9, 0x4

    .line 30
    .line 31
    if-eqz v2, :cond_2

    .line 32
    .line 33
    move v6, v4

    .line 34
    goto :goto_2

    .line 35
    :cond_2
    move v6, p3

    .line 36
    :goto_2
    and-int/lit8 v2, p9, 0x8

    .line 37
    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    move v7, v4

    .line 41
    goto :goto_3

    .line 42
    :cond_3
    move v7, p4

    .line 43
    :goto_3
    and-int/lit8 v2, p9, 0x10

    .line 44
    .line 45
    if-eqz v2, :cond_4

    .line 46
    .line 47
    sget-object v2, Landroidx/compose/material3/tokens/SuggestionChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/SuggestionChipTokens;

    .line 48
    .line 49
    invoke-virtual {v2}, Landroidx/compose/material3/tokens/SuggestionChipTokens;->getDraggedContainerElevation-D9Ej5fM()F

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    move v8, v2

    .line 54
    goto :goto_4

    .line 55
    :cond_4
    move/from16 v8, p5

    .line 56
    .line 57
    :goto_4
    and-int/lit8 v2, p9, 0x20

    .line 58
    .line 59
    if-eqz v2, :cond_5

    .line 60
    .line 61
    move v9, v4

    .line 62
    goto :goto_5

    .line 63
    :cond_5
    move/from16 v9, p6

    .line 64
    .line 65
    :goto_5
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_6

    .line 70
    .line 71
    const/4 v2, -0x1

    .line 72
    const-string v3, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipElevation (Chip.kt:1202)"

    .line 73
    .line 74
    move/from16 v10, p8

    .line 75
    .line 76
    invoke-static {v0, v10, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 77
    .line 78
    .line 79
    :cond_6
    new-instance v0, Landroidx/compose/material3/ChipElevation;

    .line 80
    .line 81
    const/4 v10, 0x0

    .line 82
    move-object v3, v0

    .line 83
    invoke-direct/range {v3 .. v10}, Landroidx/compose/material3/ChipElevation;-><init>(FFFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 84
    .line 85
    .line 86
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-eqz v2, :cond_7

    .line 91
    .line 92
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 93
    .line 94
    .line 95
    :cond_7
    invoke-interface/range {p7 .. p7}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 96
    .line 97
    .line 98
    return-object v0
.end method
