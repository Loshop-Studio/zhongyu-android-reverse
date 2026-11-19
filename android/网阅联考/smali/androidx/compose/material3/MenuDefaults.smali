.class public final Landroidx/compose/material3/MenuDefaults;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002JQ\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\nH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u0012"
    }
    d2 = {
        "Landroidx/compose/material3/MenuDefaults;",
        "",
        "()V",
        "DropdownMenuItemContentPadding",
        "Landroidx/compose/foundation/layout/PaddingValues;",
        "getDropdownMenuItemContentPadding",
        "()Landroidx/compose/foundation/layout/PaddingValues;",
        "itemColors",
        "Landroidx/compose/material3/MenuItemColors;",
        "textColor",
        "Landroidx/compose/ui/graphics/Color;",
        "leadingIconColor",
        "trailingIconColor",
        "disabledTextColor",
        "disabledLeadingIconColor",
        "disabledTrailingIconColor",
        "itemColors-5tl4gsc",
        "(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/MenuItemColors;",
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

.field private static final DropdownMenuItemContentPadding:Landroidx/compose/foundation/layout/PaddingValues;

.field public static final INSTANCE:Landroidx/compose/material3/MenuDefaults;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/material3/MenuDefaults;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/compose/material3/MenuDefaults;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/compose/material3/MenuDefaults;->INSTANCE:Landroidx/compose/material3/MenuDefaults;

    .line 7
    .line 8
    invoke-static {}, Landroidx/compose/material3/MenuKt;->access$getDropdownMenuItemHorizontalPadding$p()F

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    int-to-float v1, v1

    .line 14
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-YgX7TsA(FF)Landroidx/compose/foundation/layout/PaddingValues;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, Landroidx/compose/material3/MenuDefaults;->DropdownMenuItemContentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 23
    .line 24
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getDropdownMenuItemContentPadding()Landroidx/compose/foundation/layout/PaddingValues;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/material3/MenuDefaults;->DropdownMenuItemContentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 2
    .line 3
    return-object v0
.end method

.method public final itemColors-5tl4gsc(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/MenuItemColors;
    .locals 20
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .line 1
    move-object/from16 v0, p13

    .line 2
    .line 3
    const v1, -0x4c3506dc

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
    sget-object v2, Landroidx/compose/material3/tokens/MenuTokens;->INSTANCE:Landroidx/compose/material3/tokens/MenuTokens;

    .line 15
    .line 16
    invoke-virtual {v2}, Landroidx/compose/material3/tokens/MenuTokens;->getListItemLabelTextColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

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
    sget-object v2, Landroidx/compose/material3/tokens/MenuTokens;->INSTANCE:Landroidx/compose/material3/tokens/MenuTokens;

    .line 33
    .line 34
    invoke-virtual {v2}, Landroidx/compose/material3/tokens/MenuTokens;->getListItemLeadingIconColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

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
    sget-object v2, Landroidx/compose/material3/tokens/MenuTokens;->INSTANCE:Landroidx/compose/material3/tokens/MenuTokens;

    .line 51
    .line 52
    invoke-virtual {v2}, Landroidx/compose/material3/tokens/MenuTokens;->getListItemTrailingIconColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-static {v2, v0, v3}, Landroidx/compose/material3/ColorSchemeKt;->toColor(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

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
    sget-object v2, Landroidx/compose/material3/tokens/MenuTokens;->INSTANCE:Landroidx/compose/material3/tokens/MenuTokens;

    .line 69
    .line 70
    invoke-virtual {v2}, Landroidx/compose/material3/tokens/MenuTokens;->getListItemDisabledLabelTextColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

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
    const v2, 0x3ec28f5c    # 0.38f

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
    move-wide v13, v4

    .line 107
    goto :goto_3

    .line 108
    :cond_3
    move-wide/from16 v13, p7

    .line 109
    .line 110
    :goto_3
    and-int/lit8 v2, p15, 0x10

    .line 111
    .line 112
    if-eqz v2, :cond_4

    .line 113
    .line 114
    sget-object v2, Landroidx/compose/material3/tokens/MenuTokens;->INSTANCE:Landroidx/compose/material3/tokens/MenuTokens;

    .line 115
    .line 116
    invoke-virtual {v2}, Landroidx/compose/material3/tokens/MenuTokens;->getListItemDisabledLeadingIconColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

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
    const/4 v15, 0x0

    .line 129
    const/16 v16, 0x0

    .line 130
    .line 131
    const/16 v17, 0xe

    .line 132
    .line 133
    const/16 v18, 0x0

    .line 134
    .line 135
    move-wide/from16 p1, v4

    .line 136
    .line 137
    move/from16 p3, v2

    .line 138
    .line 139
    move/from16 p4, v6

    .line 140
    .line 141
    move/from16 p5, v15

    .line 142
    .line 143
    move/from16 p6, v16

    .line 144
    .line 145
    move/from16 p7, v17

    .line 146
    .line 147
    move-object/from16 p8, v18

    .line 148
    .line 149
    invoke-static/range {p1 .. p8}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    .line 150
    .line 151
    .line 152
    move-result-wide v4

    .line 153
    move-wide v15, v4

    .line 154
    goto :goto_4

    .line 155
    :cond_4
    move-wide/from16 v15, p9

    .line 156
    .line 157
    :goto_4
    and-int/lit8 v2, p15, 0x20

    .line 158
    .line 159
    if-eqz v2, :cond_5

    .line 160
    .line 161
    sget-object v2, Landroidx/compose/material3/tokens/MenuTokens;->INSTANCE:Landroidx/compose/material3/tokens/MenuTokens;

    .line 162
    .line 163
    invoke-virtual {v2}, Landroidx/compose/material3/tokens/MenuTokens;->getListItemDisabledTrailingIconColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-static {v2, v0, v3}, Landroidx/compose/material3/ColorSchemeKt;->toColor(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

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
    const/16 v17, 0x0

    .line 177
    .line 178
    const/16 v18, 0xe

    .line 179
    .line 180
    const/16 v19, 0x0

    .line 181
    .line 182
    move-wide/from16 p1, v2

    .line 183
    .line 184
    move/from16 p3, v4

    .line 185
    .line 186
    move/from16 p4, v5

    .line 187
    .line 188
    move/from16 p5, v6

    .line 189
    .line 190
    move/from16 p6, v17

    .line 191
    .line 192
    move/from16 p7, v18

    .line 193
    .line 194
    move-object/from16 p8, v19

    .line 195
    .line 196
    invoke-static/range {p1 .. p8}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    .line 197
    .line 198
    .line 199
    move-result-wide v2

    .line 200
    move-wide/from16 v17, v2

    .line 201
    .line 202
    goto :goto_5

    .line 203
    :cond_5
    move-wide/from16 v17, p11

    .line 204
    .line 205
    :goto_5
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    if-eqz v2, :cond_6

    .line 210
    .line 211
    const/4 v2, -0x1

    .line 212
    const-string v3, "androidx.compose.material3.MenuDefaults.itemColors (Menu.kt:234)"

    .line 213
    .line 214
    move/from16 v4, p14

    .line 215
    .line 216
    invoke-static {v1, v4, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 217
    .line 218
    .line 219
    :cond_6
    new-instance v1, Landroidx/compose/material3/MenuItemColors;

    .line 220
    .line 221
    const/16 v19, 0x0

    .line 222
    .line 223
    move-object v6, v1

    .line 224
    invoke-direct/range {v6 .. v19}, Landroidx/compose/material3/MenuItemColors;-><init>(JJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 225
    .line 226
    .line 227
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 228
    .line 229
    .line 230
    move-result v2

    .line 231
    if-eqz v2, :cond_7

    .line 232
    .line 233
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 234
    .line 235
    .line 236
    :cond_7
    invoke-interface/range {p13 .. p13}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 237
    .line 238
    .line 239
    return-object v1
.end method
