.class final Landroidx/compose/material3/ChipKt$ChipContent$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/layout/MeasurePolicy;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/ChipKt$ChipContent$1;->invoke(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "Landroidx/compose/ui/layout/MeasureScope;",
        "measurables",
        "",
        "Landroidx/compose/ui/layout/Measurable;",
        "constraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "measure-3p2s80s",
        "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipKt$ChipContent$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,2787:1\n116#2,2:2788\n33#2,6:2790\n118#2:2796\n116#2,2:2797\n33#2,6:2799\n118#2:2805\n544#2,2:2806\n33#2,6:2808\n546#2:2814\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipKt$ChipContent$1$1\n*L\n2099#1:2788,2\n2099#1:2790,6\n2099#1:2796\n2106#1:2797,2\n2106#1:2799,6\n2106#1:2805\n2113#1:2806,2\n2113#1:2808,6\n2113#1:2814\n*E\n"
    }
.end annotation


# static fields
.field public static final INSTANCE:Landroidx/compose/material3/ChipKt$ChipContent$1$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/material3/ChipKt$ChipContent$1$1;

    invoke-direct {v0}, Landroidx/compose/material3/ChipKt$ChipContent$1$1;-><init>()V

    sput-object v0, Landroidx/compose/material3/ChipKt$ChipContent$1$1;->INSTANCE:Landroidx/compose/material3/ChipKt$ChipContent$1$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/MeasureScope;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/Measurable;",
            ">;J)",
            "Landroidx/compose/ui/layout/MeasureResult;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    const/4 v4, 0x0

    .line 10
    if-ge v3, v1, :cond_1

    .line 11
    .line 12
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v5

    .line 16
    move-object v6, v5

    .line 17
    check-cast v6, Landroidx/compose/ui/layout/Measurable;

    .line 18
    .line 19
    invoke-static {v6}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    const-string/jumbo v7, "leadingIcon"

    .line 24
    .line 25
    .line 26
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    if-eqz v6, :cond_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move-object v5, v4

    .line 37
    :goto_1
    check-cast v5, Landroidx/compose/ui/layout/Measurable;

    .line 38
    .line 39
    if-eqz v5, :cond_2

    .line 40
    .line 41
    const/16 v12, 0xa

    .line 42
    .line 43
    const/4 v13, 0x0

    .line 44
    const/4 v8, 0x0

    .line 45
    const/4 v9, 0x0

    .line 46
    const/4 v10, 0x0

    .line 47
    const/4 v11, 0x0

    .line 48
    move-wide/from16 v6, p3

    .line 49
    .line 50
    invoke-static/range {v6 .. v13}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    .line 51
    .line 52
    .line 53
    move-result-wide v8

    .line 54
    invoke-interface {v5, v8, v9}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    move-object v6, v1

    .line 59
    goto :goto_2

    .line 60
    :cond_2
    move-object v6, v4

    .line 61
    :goto_2
    invoke-static {v6}, Landroidx/compose/material3/internal/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    invoke-static {v6}, Landroidx/compose/material3/internal/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    move v5, v2

    .line 74
    :goto_3
    if-ge v5, v3, :cond_4

    .line 75
    .line 76
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    move-object v9, v8

    .line 81
    check-cast v9, Landroidx/compose/ui/layout/Measurable;

    .line 82
    .line 83
    invoke-static {v9}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    const-string/jumbo v10, "trailingIcon"

    .line 88
    .line 89
    .line 90
    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v9

    .line 94
    if-eqz v9, :cond_3

    .line 95
    .line 96
    goto :goto_4

    .line 97
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_4
    move-object v8, v4

    .line 101
    :goto_4
    check-cast v8, Landroidx/compose/ui/layout/Measurable;

    .line 102
    .line 103
    if-eqz v8, :cond_5

    .line 104
    .line 105
    const/16 v16, 0xa

    .line 106
    .line 107
    const/16 v17, 0x0

    .line 108
    .line 109
    const/4 v12, 0x0

    .line 110
    const/4 v13, 0x0

    .line 111
    const/4 v14, 0x0

    .line 112
    const/4 v15, 0x0

    .line 113
    move-wide/from16 v10, p3

    .line 114
    .line 115
    invoke-static/range {v10 .. v17}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    .line 116
    .line 117
    .line 118
    move-result-wide v3

    .line 119
    invoke-interface {v8, v3, v4}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    :cond_5
    invoke-static {v4}, Landroidx/compose/material3/internal/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    invoke-static {v4}, Landroidx/compose/material3/internal/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 128
    .line 129
    .line 130
    move-result v5

    .line 131
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 132
    .line 133
    .line 134
    move-result v8

    .line 135
    :goto_5
    if-ge v2, v8, :cond_7

    .line 136
    .line 137
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v9

    .line 141
    check-cast v9, Landroidx/compose/ui/layout/Measurable;

    .line 142
    .line 143
    invoke-static {v9}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v10

    .line 147
    const-string/jumbo v11, "label"

    .line 148
    .line 149
    .line 150
    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v10

    .line 154
    if-eqz v10, :cond_6

    .line 155
    .line 156
    add-int v0, v1, v3

    .line 157
    .line 158
    neg-int v12, v0

    .line 159
    const/4 v14, 0x2

    .line 160
    const/4 v15, 0x0

    .line 161
    const/4 v13, 0x0

    .line 162
    move-wide/from16 v10, p3

    .line 163
    .line 164
    invoke-static/range {v10 .. v15}, Landroidx/compose/ui/unit/ConstraintsKt;->offset-NN6Ew-U$default(JIIILjava/lang/Object;)J

    .line 165
    .line 166
    .line 167
    move-result-wide v10

    .line 168
    invoke-interface {v9, v10, v11}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 169
    .line 170
    .line 171
    move-result-object v9

    .line 172
    invoke-virtual {v9}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    add-int/2addr v0, v1

    .line 177
    add-int/2addr v0, v3

    .line 178
    invoke-virtual {v9}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    invoke-static {v7, v2}, Ljava/lang/Math;->max(II)I

    .line 187
    .line 188
    .line 189
    move-result v12

    .line 190
    new-instance v14, Landroidx/compose/material3/ChipKt$ChipContent$1$1$1;

    .line 191
    .line 192
    move v10, v1

    .line 193
    move-object v11, v4

    .line 194
    move v8, v12

    .line 195
    move v12, v5

    .line 196
    move-object v5, v14

    .line 197
    invoke-direct/range {v5 .. v12}, Landroidx/compose/material3/ChipKt$ChipContent$1$1$1;-><init>(Landroidx/compose/ui/layout/Placeable;IILandroidx/compose/ui/layout/Placeable;ILandroidx/compose/ui/layout/Placeable;I)V

    .line 198
    .line 199
    .line 200
    move v12, v8

    .line 201
    const/4 v15, 0x4

    .line 202
    const/16 v16, 0x0

    .line 203
    .line 204
    const/4 v13, 0x0

    .line 205
    move-object/from16 v10, p1

    .line 206
    .line 207
    move v11, v0

    .line 208
    invoke-static/range {v10 .. v16}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    return-object v0

    .line 213
    :cond_6
    move v10, v1

    .line 214
    move-object v11, v4

    .line 215
    move v12, v5

    .line 216
    add-int/lit8 v2, v2, 0x1

    .line 217
    .line 218
    goto :goto_5

    .line 219
    :cond_7
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 220
    .line 221
    const-string v1, "Collection contains no element matching the predicate."

    .line 222
    .line 223
    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    throw v0
.end method
