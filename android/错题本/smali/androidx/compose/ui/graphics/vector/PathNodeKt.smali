.class public final Landroidx/compose/ui/graphics/vector/PathNodeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0010\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008)\u001a;\u0010\n\u001a\u00020\t*\u00020\u00002\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\u0008\u0012\u0004\u0012\u00020\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001ap\u0010\u0014\u001a\u00020\t2\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000c2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000728\u0008\u0004\u0010\u0013\u001a2\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\u000c\u0008\u000f\u0012\u0008\u0008\u0010\u0012\u0004\u0008\u0008(\u0011\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\u000c\u0008\u000f\u0012\u0008\u0008\u0010\u0012\u0004\u0008\u0008(\u0012\u0012\u0004\u0012\u00020\u00020\u000eH\u0082\u0008\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u001a-\u0010\u0016\u001a\u00020\t2\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000c2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u001a-\u0010\u0018\u001a\u00020\t2\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000c2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0017\"\u0014\u0010\u0019\u001a\u00020\u00008\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\"\u0014\u0010\u001b\u001a\u00020\u00008\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001a\"\u0014\u0010\u001c\u001a\u00020\u00008\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001a\"\u0014\u0010\u001d\u001a\u00020\u00008\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001a\"\u0014\u0010\u001e\u001a\u00020\u00008\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001a\"\u0014\u0010\u001f\u001a\u00020\u00008\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010\u001a\"\u0014\u0010 \u001a\u00020\u00008\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008 \u0010\u001a\"\u0014\u0010!\u001a\u00020\u00008\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008!\u0010\u001a\"\u0014\u0010\"\u001a\u00020\u00008\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\"\u0010\u001a\"\u0014\u0010#\u001a\u00020\u00008\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008#\u0010\u001a\"\u0014\u0010$\u001a\u00020\u00008\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008$\u0010\u001a\"\u0014\u0010%\u001a\u00020\u00008\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008%\u0010\u001a\"\u0014\u0010&\u001a\u00020\u00008\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008&\u0010\u001a\"\u0014\u0010\'\u001a\u00020\u00008\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\'\u0010\u001a\"\u0014\u0010(\u001a\u00020\u00008\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008(\u0010\u001a\"\u0014\u0010)\u001a\u00020\u00008\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008)\u0010\u001a\"\u0014\u0010*\u001a\u00020\u00008\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008*\u0010\u001a\"\u0014\u0010+\u001a\u00020\u00008\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008+\u0010\u001a\"\u0014\u0010,\u001a\u00020\u00008\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008,\u0010\u001a\"\u0014\u0010-\u001a\u00020\u00008\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008-\u0010\u001a\"\u0014\u0010.\u001a\u00020\u00078\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008.\u0010/\"\u0014\u00100\u001a\u00020\u00078\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u00080\u0010/\"\u0014\u00101\u001a\u00020\u00078\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u00081\u0010/\"\u0014\u00102\u001a\u00020\u00078\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u00082\u0010/\"\u0014\u00103\u001a\u00020\u00078\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u00083\u0010/\"\u0014\u00104\u001a\u00020\u00078\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u00084\u0010/\"\u0014\u00105\u001a\u00020\u00078\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u00085\u0010/\"\u0014\u00106\u001a\u00020\u00078\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u00086\u0010/\"\u0014\u00107\u001a\u00020\u00078\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u00087\u0010/\u00a8\u00068"
    }
    d2 = {
        "",
        "Ljava/util/ArrayList;",
        "Landroidx/compose/ui/graphics/vector/PathNode;",
        "Lkotlin/collections/ArrayList;",
        "nodes",
        "",
        "args",
        "",
        "count",
        "Ld6/s;",
        "addPathNodes",
        "(CLjava/util/ArrayList;[FI)V",
        "",
        "numArgs",
        "Lkotlin/Function2;",
        "Lkotlin/ParameterName;",
        "name",
        "subArray",
        "start",
        "nodeFor",
        "pathNodesFromArgs",
        "(Ljava/util/List;[FIILr6/e;)V",
        "pathMoveNodeFromArgs",
        "(Ljava/util/List;[FI)V",
        "pathRelativeMoveNodeFromArgs",
        "RelativeCloseKey",
        "C",
        "CloseKey",
        "RelativeMoveToKey",
        "MoveToKey",
        "RelativeLineToKey",
        "LineToKey",
        "RelativeHorizontalToKey",
        "HorizontalToKey",
        "RelativeVerticalToKey",
        "VerticalToKey",
        "RelativeCurveToKey",
        "CurveToKey",
        "RelativeReflectiveCurveToKey",
        "ReflectiveCurveToKey",
        "RelativeQuadToKey",
        "QuadToKey",
        "RelativeReflectiveQuadToKey",
        "ReflectiveQuadToKey",
        "RelativeArcToKey",
        "ArcToKey",
        "NUM_MOVE_TO_ARGS",
        "I",
        "NUM_LINE_TO_ARGS",
        "NUM_HORIZONTAL_TO_ARGS",
        "NUM_VERTICAL_TO_ARGS",
        "NUM_CURVE_TO_ARGS",
        "NUM_REFLECTIVE_CURVE_TO_ARGS",
        "NUM_QUAD_TO_ARGS",
        "NUM_REFLECTIVE_QUAD_TO_ARGS",
        "NUM_ARC_TO_ARGS",
        "ui-graphics_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPathNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathNode.kt\nandroidx/compose/ui/graphics/vector/PathNodeKt\n*L\n1#1,329:1\n254#1,7:330\n254#1,7:337\n254#1,7:344\n254#1,7:351\n254#1,7:358\n254#1,7:365\n254#1,7:372\n254#1,7:379\n254#1,7:386\n254#1,7:393\n254#1,7:400\n254#1,7:407\n254#1,7:414\n254#1,7:421\n254#1,7:428\n254#1,7:435\n*S KotlinDebug\n*F\n+ 1 PathNode.kt\nandroidx/compose/ui/graphics/vector/PathNodeKt\n*L\n130#1:330,7\n134#1:337,7\n138#1:344,7\n142#1:351,7\n146#1:358,7\n150#1:365,7\n154#1:372,7\n165#1:379,7\n176#1:386,7\n185#1:393,7\n194#1:400,7\n203#1:407,7\n212#1:414,7\n216#1:421,7\n220#1:428,7\n232#1:435,7\n*E\n"
    }
.end annotation


# static fields
.field private static final ArcToKey:C = 'A'

.field private static final CloseKey:C = 'Z'

.field private static final CurveToKey:C = 'C'

.field private static final HorizontalToKey:C = 'H'

.field private static final LineToKey:C = 'L'

.field private static final MoveToKey:C = 'M'

.field private static final NUM_ARC_TO_ARGS:I = 0x7

.field private static final NUM_CURVE_TO_ARGS:I = 0x6

.field private static final NUM_HORIZONTAL_TO_ARGS:I = 0x1

.field private static final NUM_LINE_TO_ARGS:I = 0x2

.field private static final NUM_MOVE_TO_ARGS:I = 0x2

.field private static final NUM_QUAD_TO_ARGS:I = 0x4

.field private static final NUM_REFLECTIVE_CURVE_TO_ARGS:I = 0x4

.field private static final NUM_REFLECTIVE_QUAD_TO_ARGS:I = 0x2

.field private static final NUM_VERTICAL_TO_ARGS:I = 0x1

.field private static final QuadToKey:C = 'Q'

.field private static final ReflectiveCurveToKey:C = 'S'

.field private static final ReflectiveQuadToKey:C = 'T'

.field private static final RelativeArcToKey:C = 'a'

.field private static final RelativeCloseKey:C = 'z'

.field private static final RelativeCurveToKey:C = 'c'

.field private static final RelativeHorizontalToKey:C = 'h'

.field private static final RelativeLineToKey:C = 'l'

.field private static final RelativeMoveToKey:C = 'm'

.field private static final RelativeQuadToKey:C = 'q'

.field private static final RelativeReflectiveCurveToKey:C = 's'

.field private static final RelativeReflectiveQuadToKey:C = 't'

.field private static final RelativeVerticalToKey:C = 'v'

.field private static final VerticalToKey:C = 'V'


# direct methods
.method public static final addPathNodes(CLjava/util/ArrayList;[FI)V
    .locals 11
    .param p1    # Ljava/util/ArrayList;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # [F
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(C",
            "Ljava/util/ArrayList<",
            "Landroidx/compose/ui/graphics/vector/PathNode;",
            ">;[FI)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    sparse-switch p0, :sswitch_data_0

    .line 5
    .line 6
    .line 7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 8
    .line 9
    new-instance p2, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string p3, "Unknown command for: "

    .line 12
    .line 13
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :sswitch_0
    sub-int/2addr p3, v2

    .line 28
    :goto_0
    if-gt v1, p3, :cond_4

    .line 29
    .line 30
    new-instance p0, Landroidx/compose/ui/graphics/vector/PathNode$RelativeVerticalTo;

    .line 31
    .line 32
    aget v0, p2, v1

    .line 33
    .line 34
    invoke-direct {p0, v0}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeVerticalTo;-><init>(F)V

    .line 35
    .line 36
    .line 37
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :sswitch_1
    add-int/lit8 p3, p3, -0x2

    .line 44
    .line 45
    :goto_1
    if-gt v1, p3, :cond_4

    .line 46
    .line 47
    new-instance p0, Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;

    .line 48
    .line 49
    aget v0, p2, v1

    .line 50
    .line 51
    add-int/lit8 v2, v1, 0x1

    .line 52
    .line 53
    aget v2, p2, v2

    .line 54
    .line 55
    invoke-direct {p0, v0, v2}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;-><init>(FF)V

    .line 56
    .line 57
    .line 58
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    add-int/lit8 v1, v1, 0x2

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :sswitch_2
    add-int/lit8 p3, p3, -0x4

    .line 65
    .line 66
    :goto_2
    if-gt v1, p3, :cond_4

    .line 67
    .line 68
    new-instance p0, Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;

    .line 69
    .line 70
    aget v0, p2, v1

    .line 71
    .line 72
    add-int/lit8 v2, v1, 0x1

    .line 73
    .line 74
    aget v2, p2, v2

    .line 75
    .line 76
    add-int/lit8 v3, v1, 0x2

    .line 77
    .line 78
    aget v3, p2, v3

    .line 79
    .line 80
    add-int/lit8 v4, v1, 0x3

    .line 81
    .line 82
    aget v4, p2, v4

    .line 83
    .line 84
    invoke-direct {p0, v0, v2, v3, v4}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;-><init>(FFFF)V

    .line 85
    .line 86
    .line 87
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    add-int/lit8 v1, v1, 0x4

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :sswitch_3
    add-int/lit8 p3, p3, -0x4

    .line 94
    .line 95
    :goto_3
    if-gt v1, p3, :cond_4

    .line 96
    .line 97
    new-instance p0, Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;

    .line 98
    .line 99
    aget v0, p2, v1

    .line 100
    .line 101
    add-int/lit8 v2, v1, 0x1

    .line 102
    .line 103
    aget v2, p2, v2

    .line 104
    .line 105
    add-int/lit8 v3, v1, 0x2

    .line 106
    .line 107
    aget v3, p2, v3

    .line 108
    .line 109
    add-int/lit8 v4, v1, 0x3

    .line 110
    .line 111
    aget v4, p2, v4

    .line 112
    .line 113
    invoke-direct {p0, v0, v2, v3, v4}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;-><init>(FFFF)V

    .line 114
    .line 115
    .line 116
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    add-int/lit8 v1, v1, 0x4

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :sswitch_4
    invoke-static {p1, p2, p3}, Landroidx/compose/ui/graphics/vector/PathNodeKt;->pathRelativeMoveNodeFromArgs(Ljava/util/List;[FI)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :sswitch_5
    add-int/lit8 p3, p3, -0x2

    .line 127
    .line 128
    :goto_4
    if-gt v1, p3, :cond_4

    .line 129
    .line 130
    new-instance p0, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;

    .line 131
    .line 132
    aget v0, p2, v1

    .line 133
    .line 134
    add-int/lit8 v2, v1, 0x1

    .line 135
    .line 136
    aget v2, p2, v2

    .line 137
    .line 138
    invoke-direct {p0, v0, v2}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;-><init>(FF)V

    .line 139
    .line 140
    .line 141
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    add-int/lit8 v1, v1, 0x2

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :sswitch_6
    sub-int/2addr p3, v2

    .line 148
    :goto_5
    if-gt v1, p3, :cond_4

    .line 149
    .line 150
    new-instance p0, Landroidx/compose/ui/graphics/vector/PathNode$RelativeHorizontalTo;

    .line 151
    .line 152
    aget v0, p2, v1

    .line 153
    .line 154
    invoke-direct {p0, v0}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeHorizontalTo;-><init>(F)V

    .line 155
    .line 156
    .line 157
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    add-int/lit8 v1, v1, 0x1

    .line 161
    .line 162
    goto :goto_5

    .line 163
    :sswitch_7
    add-int/lit8 p3, p3, -0x6

    .line 164
    .line 165
    :goto_6
    if-gt v1, p3, :cond_4

    .line 166
    .line 167
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;

    .line 168
    .line 169
    aget v3, p2, v1

    .line 170
    .line 171
    add-int/lit8 p0, v1, 0x1

    .line 172
    .line 173
    aget v4, p2, p0

    .line 174
    .line 175
    add-int/lit8 p0, v1, 0x2

    .line 176
    .line 177
    aget v5, p2, p0

    .line 178
    .line 179
    add-int/lit8 p0, v1, 0x3

    .line 180
    .line 181
    aget v6, p2, p0

    .line 182
    .line 183
    add-int/lit8 p0, v1, 0x4

    .line 184
    .line 185
    aget v7, p2, p0

    .line 186
    .line 187
    add-int/lit8 p0, v1, 0x5

    .line 188
    .line 189
    aget v8, p2, p0

    .line 190
    .line 191
    invoke-direct/range {v2 .. v8}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;-><init>(FFFFFF)V

    .line 192
    .line 193
    .line 194
    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    add-int/lit8 v1, v1, 0x6

    .line 198
    .line 199
    goto :goto_6

    .line 200
    :sswitch_8
    add-int/lit8 p3, p3, -0x7

    .line 201
    .line 202
    move p0, v1

    .line 203
    :goto_7
    if-gt p0, p3, :cond_4

    .line 204
    .line 205
    new-instance v3, Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;

    .line 206
    .line 207
    aget v4, p2, p0

    .line 208
    .line 209
    add-int/lit8 v5, p0, 0x1

    .line 210
    .line 211
    aget v5, p2, v5

    .line 212
    .line 213
    add-int/lit8 v6, p0, 0x2

    .line 214
    .line 215
    aget v6, p2, v6

    .line 216
    .line 217
    add-int/lit8 v7, p0, 0x3

    .line 218
    .line 219
    aget v7, p2, v7

    .line 220
    .line 221
    invoke-static {v7, v0}, Ljava/lang/Float;->compare(FF)I

    .line 222
    .line 223
    .line 224
    move-result v7

    .line 225
    if-eqz v7, :cond_0

    .line 226
    .line 227
    move v7, v2

    .line 228
    goto :goto_8

    .line 229
    :cond_0
    move v7, v1

    .line 230
    :goto_8
    add-int/lit8 v8, p0, 0x4

    .line 231
    .line 232
    aget v8, p2, v8

    .line 233
    .line 234
    invoke-static {v8, v0}, Ljava/lang/Float;->compare(FF)I

    .line 235
    .line 236
    .line 237
    move-result v8

    .line 238
    if-eqz v8, :cond_1

    .line 239
    .line 240
    move v8, v2

    .line 241
    goto :goto_9

    .line 242
    :cond_1
    move v8, v1

    .line 243
    :goto_9
    add-int/lit8 v9, p0, 0x5

    .line 244
    .line 245
    aget v9, p2, v9

    .line 246
    .line 247
    add-int/lit8 v10, p0, 0x6

    .line 248
    .line 249
    aget v10, p2, v10

    .line 250
    .line 251
    invoke-direct/range {v3 .. v10}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;-><init>(FFFZZFF)V

    .line 252
    .line 253
    .line 254
    invoke-interface {p1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    add-int/lit8 p0, p0, 0x7

    .line 258
    .line 259
    goto :goto_7

    .line 260
    :sswitch_9
    sget-object p0, Landroidx/compose/ui/graphics/vector/PathNode$Close;->INSTANCE:Landroidx/compose/ui/graphics/vector/PathNode$Close;

    .line 261
    .line 262
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    return-void

    .line 266
    :sswitch_a
    sub-int/2addr p3, v2

    .line 267
    :goto_a
    if-gt v1, p3, :cond_4

    .line 268
    .line 269
    new-instance p0, Landroidx/compose/ui/graphics/vector/PathNode$VerticalTo;

    .line 270
    .line 271
    aget v0, p2, v1

    .line 272
    .line 273
    invoke-direct {p0, v0}, Landroidx/compose/ui/graphics/vector/PathNode$VerticalTo;-><init>(F)V

    .line 274
    .line 275
    .line 276
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    add-int/lit8 v1, v1, 0x1

    .line 280
    .line 281
    goto :goto_a

    .line 282
    :sswitch_b
    add-int/lit8 p3, p3, -0x2

    .line 283
    .line 284
    :goto_b
    if-gt v1, p3, :cond_4

    .line 285
    .line 286
    new-instance p0, Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;

    .line 287
    .line 288
    aget v0, p2, v1

    .line 289
    .line 290
    add-int/lit8 v2, v1, 0x1

    .line 291
    .line 292
    aget v2, p2, v2

    .line 293
    .line 294
    invoke-direct {p0, v0, v2}, Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;-><init>(FF)V

    .line 295
    .line 296
    .line 297
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    add-int/lit8 v1, v1, 0x2

    .line 301
    .line 302
    goto :goto_b

    .line 303
    :sswitch_c
    add-int/lit8 p3, p3, -0x4

    .line 304
    .line 305
    :goto_c
    if-gt v1, p3, :cond_4

    .line 306
    .line 307
    new-instance p0, Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;

    .line 308
    .line 309
    aget v0, p2, v1

    .line 310
    .line 311
    add-int/lit8 v2, v1, 0x1

    .line 312
    .line 313
    aget v2, p2, v2

    .line 314
    .line 315
    add-int/lit8 v3, v1, 0x2

    .line 316
    .line 317
    aget v3, p2, v3

    .line 318
    .line 319
    add-int/lit8 v4, v1, 0x3

    .line 320
    .line 321
    aget v4, p2, v4

    .line 322
    .line 323
    invoke-direct {p0, v0, v2, v3, v4}, Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;-><init>(FFFF)V

    .line 324
    .line 325
    .line 326
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    add-int/lit8 v1, v1, 0x4

    .line 330
    .line 331
    goto :goto_c

    .line 332
    :sswitch_d
    add-int/lit8 p3, p3, -0x4

    .line 333
    .line 334
    :goto_d
    if-gt v1, p3, :cond_4

    .line 335
    .line 336
    new-instance p0, Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;

    .line 337
    .line 338
    aget v0, p2, v1

    .line 339
    .line 340
    add-int/lit8 v2, v1, 0x1

    .line 341
    .line 342
    aget v2, p2, v2

    .line 343
    .line 344
    add-int/lit8 v3, v1, 0x2

    .line 345
    .line 346
    aget v3, p2, v3

    .line 347
    .line 348
    add-int/lit8 v4, v1, 0x3

    .line 349
    .line 350
    aget v4, p2, v4

    .line 351
    .line 352
    invoke-direct {p0, v0, v2, v3, v4}, Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;-><init>(FFFF)V

    .line 353
    .line 354
    .line 355
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    add-int/lit8 v1, v1, 0x4

    .line 359
    .line 360
    goto :goto_d

    .line 361
    :sswitch_e
    invoke-static {p1, p2, p3}, Landroidx/compose/ui/graphics/vector/PathNodeKt;->pathMoveNodeFromArgs(Ljava/util/List;[FI)V

    .line 362
    .line 363
    .line 364
    return-void

    .line 365
    :sswitch_f
    add-int/lit8 p3, p3, -0x2

    .line 366
    .line 367
    :goto_e
    if-gt v1, p3, :cond_4

    .line 368
    .line 369
    new-instance p0, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;

    .line 370
    .line 371
    aget v0, p2, v1

    .line 372
    .line 373
    add-int/lit8 v2, v1, 0x1

    .line 374
    .line 375
    aget v2, p2, v2

    .line 376
    .line 377
    invoke-direct {p0, v0, v2}, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;-><init>(FF)V

    .line 378
    .line 379
    .line 380
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 381
    .line 382
    .line 383
    add-int/lit8 v1, v1, 0x2

    .line 384
    .line 385
    goto :goto_e

    .line 386
    :sswitch_10
    sub-int/2addr p3, v2

    .line 387
    :goto_f
    if-gt v1, p3, :cond_4

    .line 388
    .line 389
    new-instance p0, Landroidx/compose/ui/graphics/vector/PathNode$HorizontalTo;

    .line 390
    .line 391
    aget v0, p2, v1

    .line 392
    .line 393
    invoke-direct {p0, v0}, Landroidx/compose/ui/graphics/vector/PathNode$HorizontalTo;-><init>(F)V

    .line 394
    .line 395
    .line 396
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    add-int/lit8 v1, v1, 0x1

    .line 400
    .line 401
    goto :goto_f

    .line 402
    :sswitch_11
    add-int/lit8 p3, p3, -0x6

    .line 403
    .line 404
    :goto_10
    if-gt v1, p3, :cond_4

    .line 405
    .line 406
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;

    .line 407
    .line 408
    aget v3, p2, v1

    .line 409
    .line 410
    add-int/lit8 p0, v1, 0x1

    .line 411
    .line 412
    aget v4, p2, p0

    .line 413
    .line 414
    add-int/lit8 p0, v1, 0x2

    .line 415
    .line 416
    aget v5, p2, p0

    .line 417
    .line 418
    add-int/lit8 p0, v1, 0x3

    .line 419
    .line 420
    aget v6, p2, p0

    .line 421
    .line 422
    add-int/lit8 p0, v1, 0x4

    .line 423
    .line 424
    aget v7, p2, p0

    .line 425
    .line 426
    add-int/lit8 p0, v1, 0x5

    .line 427
    .line 428
    aget v8, p2, p0

    .line 429
    .line 430
    invoke-direct/range {v2 .. v8}, Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;-><init>(FFFFFF)V

    .line 431
    .line 432
    .line 433
    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 434
    .line 435
    .line 436
    add-int/lit8 v1, v1, 0x6

    .line 437
    .line 438
    goto :goto_10

    .line 439
    :sswitch_12
    add-int/lit8 p3, p3, -0x7

    .line 440
    .line 441
    move p0, v1

    .line 442
    :goto_11
    if-gt p0, p3, :cond_4

    .line 443
    .line 444
    new-instance v3, Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;

    .line 445
    .line 446
    aget v4, p2, p0

    .line 447
    .line 448
    add-int/lit8 v5, p0, 0x1

    .line 449
    .line 450
    aget v5, p2, v5

    .line 451
    .line 452
    add-int/lit8 v6, p0, 0x2

    .line 453
    .line 454
    aget v6, p2, v6

    .line 455
    .line 456
    add-int/lit8 v7, p0, 0x3

    .line 457
    .line 458
    aget v7, p2, v7

    .line 459
    .line 460
    invoke-static {v7, v0}, Ljava/lang/Float;->compare(FF)I

    .line 461
    .line 462
    .line 463
    move-result v7

    .line 464
    if-eqz v7, :cond_2

    .line 465
    .line 466
    move v7, v2

    .line 467
    goto :goto_12

    .line 468
    :cond_2
    move v7, v1

    .line 469
    :goto_12
    add-int/lit8 v8, p0, 0x4

    .line 470
    .line 471
    aget v8, p2, v8

    .line 472
    .line 473
    invoke-static {v8, v0}, Ljava/lang/Float;->compare(FF)I

    .line 474
    .line 475
    .line 476
    move-result v8

    .line 477
    if-eqz v8, :cond_3

    .line 478
    .line 479
    move v8, v2

    .line 480
    goto :goto_13

    .line 481
    :cond_3
    move v8, v1

    .line 482
    :goto_13
    add-int/lit8 v9, p0, 0x5

    .line 483
    .line 484
    aget v9, p2, v9

    .line 485
    .line 486
    add-int/lit8 v10, p0, 0x6

    .line 487
    .line 488
    aget v10, p2, v10

    .line 489
    .line 490
    invoke-direct/range {v3 .. v10}, Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;-><init>(FFFZZFF)V

    .line 491
    .line 492
    .line 493
    invoke-interface {p1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 494
    .line 495
    .line 496
    add-int/lit8 p0, p0, 0x7

    .line 497
    .line 498
    goto :goto_11

    .line 499
    :cond_4
    return-void

    .line 500
    nop

    .line 501
    :sswitch_data_0
    .sparse-switch
        0x41 -> :sswitch_12
        0x43 -> :sswitch_11
        0x48 -> :sswitch_10
        0x4c -> :sswitch_f
        0x4d -> :sswitch_e
        0x51 -> :sswitch_d
        0x53 -> :sswitch_c
        0x54 -> :sswitch_b
        0x56 -> :sswitch_a
        0x5a -> :sswitch_9
        0x61 -> :sswitch_8
        0x63 -> :sswitch_7
        0x68 -> :sswitch_6
        0x6c -> :sswitch_5
        0x6d -> :sswitch_4
        0x71 -> :sswitch_3
        0x73 -> :sswitch_2
        0x74 -> :sswitch_1
        0x76 -> :sswitch_0
        0x7a -> :sswitch_9
    .end sparse-switch
.end method

.method private static final pathMoveNodeFromArgs(Ljava/util/List;[FI)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/compose/ui/graphics/vector/PathNode;",
            ">;[FI)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x2

    .line 2
    sub-int/2addr p2, v0

    .line 3
    if-ltz p2, :cond_0

    .line 4
    .line 5
    new-instance v1, Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    aget v2, p1, v2

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    aget v3, p1, v3

    .line 12
    .line 13
    invoke-direct {v1, v2, v3}, Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;-><init>(FF)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    :goto_0
    if-gt v0, p2, :cond_0

    .line 20
    .line 21
    new-instance v1, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;

    .line 22
    .line 23
    aget v2, p1, v0

    .line 24
    .line 25
    add-int/lit8 v3, v0, 0x1

    .line 26
    .line 27
    aget v3, p1, v3

    .line 28
    .line 29
    invoke-direct {v1, v2, v3}, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;-><init>(FF)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    add-int/lit8 v0, v0, 0x2

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-void
.end method

.method private static final pathNodesFromArgs(Ljava/util/List;[FIILr6/e;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/compose/ui/graphics/vector/PathNode;",
            ">;[FII",
            "Lr6/e;",
            ")V"
        }
    .end annotation

    .line 1
    sub-int/2addr p2, p3

    .line 2
    const/4 v0, 0x0

    .line 3
    :goto_0
    if-gt v0, p2, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {p4, p1, v1}, Lr6/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {p0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    add-int/2addr v0, p3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-void
.end method

.method private static final pathRelativeMoveNodeFromArgs(Ljava/util/List;[FI)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/compose/ui/graphics/vector/PathNode;",
            ">;[FI)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x2

    .line 2
    sub-int/2addr p2, v0

    .line 3
    if-ltz p2, :cond_0

    .line 4
    .line 5
    new-instance v1, Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    aget v2, p1, v2

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    aget v3, p1, v3

    .line 12
    .line 13
    invoke-direct {v1, v2, v3}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;-><init>(FF)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    :goto_0
    if-gt v0, p2, :cond_0

    .line 20
    .line 21
    new-instance v1, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;

    .line 22
    .line 23
    aget v2, p1, v0

    .line 24
    .line 25
    add-int/lit8 v3, v0, 0x1

    .line 26
    .line 27
    aget v3, p1, v3

    .line 28
    .line 29
    invoke-direct {v1, v2, v3}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;-><init>(FF)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    add-int/lit8 v0, v0, 0x2

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-void
.end method
