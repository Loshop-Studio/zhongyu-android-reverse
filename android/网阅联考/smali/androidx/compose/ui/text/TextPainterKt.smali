.class public final Landroidx/compose/ui/text/TextPainterKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0098\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0002\u001ak\u0010\n\u001a\u00020\u0006*\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0001H\u0007\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0019\u0010\u001a\u001am\u0010\n\u001a\u00020\u0006*\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001c2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0001H\u0007\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001d\u0010\u001e\u001a\u0085\u0001\u0010\n\u001a\u00020\u0006*\u00020\u000b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f2\u0008\u0008\u0002\u0010#\u001a\u00020$2\u0008\u0008\u0002\u0010%\u001a\u00020&2\u0008\u0008\u0002\u0010\'\u001a\u00020(2\u0008\u0008\u0002\u0010)\u001a\u00020*2\u0014\u0008\u0002\u0010+\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020.0-0,2\u0008\u0008\u0002\u0010/\u001a\u0002002\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0001H\u0007\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u00081\u00102\u001ao\u0010\n\u001a\u00020\u0006*\u00020\u000b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u0002032\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f2\u0008\u0008\u0002\u0010#\u001a\u00020$2\u0008\u0008\u0002\u0010%\u001a\u00020&2\u0008\u0008\u0002\u0010\'\u001a\u00020(2\u0008\u0008\u0002\u0010)\u001a\u00020*2\u0008\u0008\u0002\u0010/\u001a\u0002002\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0001H\u0007\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u00084\u00105\u001a)\u00106\u001a\u000207*\u00020\u000b2\u0006\u0010/\u001a\u0002002\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u00088\u00109\"\u0019\u0010\u0000\u001a\u00020\u0001X\u0080\u0004\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0004\u001a\u0004\u0008\u0002\u0010\u0003\u0082\u0002\u000b\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006:"
    }
    d2 = {
        "DefaultTextBlendMode",
        "Landroidx/compose/ui/graphics/BlendMode;",
        "getDefaultTextBlendMode",
        "()I",
        "I",
        "clip",
        "",
        "Landroidx/compose/ui/graphics/drawscope/DrawTransform;",
        "textLayoutResult",
        "Landroidx/compose/ui/text/TextLayoutResult;",
        "drawText",
        "Landroidx/compose/ui/graphics/drawscope/DrawScope;",
        "brush",
        "Landroidx/compose/ui/graphics/Brush;",
        "topLeft",
        "Landroidx/compose/ui/geometry/Offset;",
        "alpha",
        "",
        "shadow",
        "Landroidx/compose/ui/graphics/Shadow;",
        "textDecoration",
        "Landroidx/compose/ui/text/style/TextDecoration;",
        "drawStyle",
        "Landroidx/compose/ui/graphics/drawscope/DrawStyle;",
        "blendMode",
        "drawText-LVfH_YU",
        "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/graphics/Brush;JFLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V",
        "color",
        "Landroidx/compose/ui/graphics/Color;",
        "drawText-d8-rzKo",
        "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextLayoutResult;JJFLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V",
        "textMeasurer",
        "Landroidx/compose/ui/text/TextMeasurer;",
        "text",
        "Landroidx/compose/ui/text/AnnotatedString;",
        "style",
        "Landroidx/compose/ui/text/TextStyle;",
        "overflow",
        "Landroidx/compose/ui/text/style/TextOverflow;",
        "softWrap",
        "",
        "maxLines",
        "",
        "placeholders",
        "",
        "Landroidx/compose/ui/text/AnnotatedString$Range;",
        "Landroidx/compose/ui/text/Placeholder;",
        "size",
        "Landroidx/compose/ui/geometry/Size;",
        "drawText-JFhB2K4",
        "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextMeasurer;Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextStyle;IZILjava/util/List;JI)V",
        "",
        "drawText-TPWCCtM",
        "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextMeasurer;Ljava/lang/String;JLandroidx/compose/ui/text/TextStyle;IZIJI)V",
        "textLayoutConstraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "textLayoutConstraints-v_w8tDc",
        "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJ)J",
        "ui-text_release"
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
        "SMAP\nTextPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPainter.kt\nandroidx/compose/ui/text/TextPainterKt\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,405:1\n261#2,11:406\n261#2,11:417\n261#2,8:428\n269#2,3:439\n261#2,11:442\n652#3:436\n658#3:437\n646#3:438\n159#4:453\n159#4:454\n*S KotlinDebug\n*F\n+ 1 TextPainter.kt\nandroidx/compose/ui/text/TextPainterKt\n*L\n171#1:406,11\n237#1:417,11\n281#1:428,8\n281#1:439,3\n344#1:442,11\n288#1:436\n301#1:437\n301#1:438\n382#1:453\n394#1:454\n*E\n"
    }
.end annotation


# static fields
.field private static final DefaultTextBlendMode:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/ui/graphics/BlendMode;->Companion:Landroidx/compose/ui/graphics/BlendMode$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/BlendMode$Companion;->getSrcOver-0nO6VwU()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sput v0, Landroidx/compose/ui/text/TextPainterKt;->DefaultTextBlendMode:I

    .line 8
    .line 9
    return-void
.end method

.method private static final clip(Landroidx/compose/ui/graphics/drawscope/DrawTransform;Landroidx/compose/ui/text/TextLayoutResult;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Landroidx/compose/ui/text/TextLayoutResult;->getHasVisualOverflow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroidx/compose/ui/text/TextLayoutResult;->getLayoutInput()Landroidx/compose/ui/text/TextLayoutInput;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Landroidx/compose/ui/text/TextLayoutInput;->getOverflow-gIe3tQ8()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    sget-object v1, Landroidx/compose/ui/text/style/TextOverflow;->Companion:Landroidx/compose/ui/text/style/TextOverflow$Companion;

    .line 16
    .line 17
    invoke-virtual {v1}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getVisible-gIe3tQ8()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-static {v0, v1}, Landroidx/compose/ui/text/style/TextOverflow;->equals-impl0(II)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-virtual {p1}, Landroidx/compose/ui/text/TextLayoutResult;->getSize-YbymL2g()J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntSize;->getWidth-impl(J)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    int-to-float v4, v0

    .line 38
    invoke-virtual {p1}, Landroidx/compose/ui/text/TextLayoutResult;->getSize-YbymL2g()J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntSize;->getHeight-impl(J)I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    int-to-float v5, p1

    .line 47
    const/4 v6, 0x0

    .line 48
    const/16 v7, 0x10

    .line 49
    .line 50
    const/4 v8, 0x0

    .line 51
    move-object v1, p0

    .line 52
    invoke-static/range {v1 .. v8}, Landroidx/compose/ui/graphics/drawscope/c;->d(Landroidx/compose/ui/graphics/drawscope/DrawTransform;FFFFIILjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :cond_0
    return-void
.end method

.method public static final drawText-JFhB2K4(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextMeasurer;Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextStyle;IZILjava/util/List;JI)V
    .locals 18
    .annotation build Landroidx/compose/ui/text/ExperimentalTextApi;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/graphics/drawscope/DrawScope;",
            "Landroidx/compose/ui/text/TextMeasurer;",
            "Landroidx/compose/ui/text/AnnotatedString;",
            "J",
            "Landroidx/compose/ui/text/TextStyle;",
            "IZI",
            "Ljava/util/List<",
            "Landroidx/compose/ui/text/AnnotatedString$Range<",
            "Landroidx/compose/ui/text/Placeholder;",
            ">;>;JI)V"
        }
    .end annotation

    .line 1
    move-object/from16 v15, p0

    .line 2
    .line 3
    const-string v0, "$this$drawText"

    .line 4
    .line 5
    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v0, "textMeasurer"

    .line 9
    .line 10
    .line 11
    move-object/from16 v1, p1

    .line 12
    .line 13
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string/jumbo v0, "text"

    .line 17
    .line 18
    .line 19
    move-object/from16 v2, p2

    .line 20
    .line 21
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string/jumbo v0, "style"

    .line 25
    .line 26
    .line 27
    move-object/from16 v3, p5

    .line 28
    .line 29
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const-string v0, "placeholders"

    .line 33
    .line 34
    move-object/from16 v6, p9

    .line 35
    .line 36
    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    move-wide/from16 v13, p3

    .line 40
    .line 41
    move-wide/from16 v4, p10

    .line 42
    .line 43
    invoke-static {v15, v4, v5, v13, v14}, Landroidx/compose/ui/text/TextPainterKt;->textLayoutConstraints-v_w8tDc(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJ)J

    .line 44
    .line 45
    .line 46
    move-result-wide v7

    .line 47
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 48
    .line 49
    .line 50
    move-result-object v9

    .line 51
    const/4 v11, 0x0

    .line 52
    const/4 v12, 0x0

    .line 53
    const/16 v16, 0x600

    .line 54
    .line 55
    const/16 v17, 0x0

    .line 56
    .line 57
    move-object/from16 v0, p1

    .line 58
    .line 59
    move-object/from16 v1, p2

    .line 60
    .line 61
    move-object/from16 v2, p5

    .line 62
    .line 63
    move/from16 v3, p6

    .line 64
    .line 65
    move/from16 v4, p7

    .line 66
    .line 67
    move/from16 v5, p8

    .line 68
    .line 69
    move-object/from16 v10, p0

    .line 70
    .line 71
    move/from16 v13, v16

    .line 72
    .line 73
    move-object/from16 v14, v17

    .line 74
    .line 75
    invoke-static/range {v0 .. v14}, Landroidx/compose/ui/text/TextMeasurer;->measure-xDpz5zY$default(Landroidx/compose/ui/text/TextMeasurer;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;IZILjava/util/List;JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;ZILjava/lang/Object;)Landroidx/compose/ui/text/TextLayoutResult;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getSize-NH-jbRc()J

    .line 84
    .line 85
    .line 86
    move-result-wide v2

    .line 87
    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getCanvas()Landroidx/compose/ui/graphics/Canvas;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-interface {v4}, Landroidx/compose/ui/graphics/Canvas;->save()V

    .line 92
    .line 93
    .line 94
    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getTransform()Landroidx/compose/ui/graphics/drawscope/DrawTransform;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    invoke-static/range {p3 .. p4}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    invoke-static/range {p3 .. p4}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    invoke-interface {v4, v5, v6}, Landroidx/compose/ui/graphics/drawscope/DrawTransform;->translate(FF)V

    .line 107
    .line 108
    .line 109
    invoke-static {v4, v0}, Landroidx/compose/ui/text/TextPainterKt;->clip(Landroidx/compose/ui/graphics/drawscope/DrawTransform;Landroidx/compose/ui/text/TextLayoutResult;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Landroidx/compose/ui/text/TextLayoutResult;->getMultiParagraph()Landroidx/compose/ui/text/MultiParagraph;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    invoke-interface {v4}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getCanvas()Landroidx/compose/ui/graphics/Canvas;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    const-wide/16 v5, 0x0

    .line 125
    .line 126
    const/4 v7, 0x0

    .line 127
    const/4 v8, 0x0

    .line 128
    const/4 v9, 0x0

    .line 129
    const/16 v10, 0x1e

    .line 130
    .line 131
    move-object/from16 p0, v0

    .line 132
    .line 133
    move-object/from16 p1, v4

    .line 134
    .line 135
    move-wide/from16 p2, v5

    .line 136
    .line 137
    move-object/from16 p4, v7

    .line 138
    .line 139
    move-object/from16 p5, v8

    .line 140
    .line 141
    move-object/from16 p6, v9

    .line 142
    .line 143
    move/from16 p7, p12

    .line 144
    .line 145
    move/from16 p8, v10

    .line 146
    .line 147
    move-object/from16 p9, v11

    .line 148
    .line 149
    invoke-static/range {p0 .. p9}, Landroidx/compose/ui/text/MultiParagraph;->paint-LG529CI$default(Landroidx/compose/ui/text/MultiParagraph;Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IILjava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getCanvas()Landroidx/compose/ui/graphics/Canvas;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-interface {v0}, Landroidx/compose/ui/graphics/Canvas;->restore()V

    .line 157
    .line 158
    .line 159
    invoke-interface {v1, v2, v3}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->setSize-uvyYCjk(J)V

    .line 160
    .line 161
    .line 162
    return-void
.end method

.method public static synthetic drawText-JFhB2K4$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextMeasurer;Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextStyle;IZILjava/util/List;JIILjava/lang/Object;)V
    .locals 16

    .line 1
    move/from16 v0, p13

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x4

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    sget-object v1, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    move-wide v6, v1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-wide/from16 v6, p3

    .line 16
    .line 17
    :goto_0
    and-int/lit8 v1, v0, 0x8

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    sget-object v1, Landroidx/compose/ui/text/TextStyle;->Companion:Landroidx/compose/ui/text/TextStyle$Companion;

    .line 22
    .line 23
    invoke-virtual {v1}, Landroidx/compose/ui/text/TextStyle$Companion;->getDefault()Landroidx/compose/ui/text/TextStyle;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    move-object v8, v1

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move-object/from16 v8, p5

    .line 30
    .line 31
    :goto_1
    and-int/lit8 v1, v0, 0x10

    .line 32
    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    sget-object v1, Landroidx/compose/ui/text/style/TextOverflow;->Companion:Landroidx/compose/ui/text/style/TextOverflow$Companion;

    .line 36
    .line 37
    invoke-virtual {v1}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getClip-gIe3tQ8()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    move v9, v1

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    move/from16 v9, p6

    .line 44
    .line 45
    :goto_2
    and-int/lit8 v1, v0, 0x20

    .line 46
    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    const/4 v1, 0x1

    .line 50
    move v10, v1

    .line 51
    goto :goto_3

    .line 52
    :cond_3
    move/from16 v10, p7

    .line 53
    .line 54
    :goto_3
    and-int/lit8 v1, v0, 0x40

    .line 55
    .line 56
    if-eqz v1, :cond_4

    .line 57
    .line 58
    const v1, 0x7fffffff

    .line 59
    .line 60
    .line 61
    move v11, v1

    .line 62
    goto :goto_4

    .line 63
    :cond_4
    move/from16 v11, p8

    .line 64
    .line 65
    :goto_4
    and-int/lit16 v1, v0, 0x80

    .line 66
    .line 67
    if-eqz v1, :cond_5

    .line 68
    .line 69
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    move-object v12, v1

    .line 74
    goto :goto_5

    .line 75
    :cond_5
    move-object/from16 v12, p9

    .line 76
    .line 77
    :goto_5
    and-int/lit16 v1, v0, 0x100

    .line 78
    .line 79
    if-eqz v1, :cond_6

    .line 80
    .line 81
    sget-object v1, Landroidx/compose/ui/geometry/Size;->Companion:Landroidx/compose/ui/geometry/Size$Companion;

    .line 82
    .line 83
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Size$Companion;->getUnspecified-NH-jbRc()J

    .line 84
    .line 85
    .line 86
    move-result-wide v1

    .line 87
    move-wide v13, v1

    .line 88
    goto :goto_6

    .line 89
    :cond_6
    move-wide/from16 v13, p10

    .line 90
    .line 91
    :goto_6
    and-int/lit16 v0, v0, 0x200

    .line 92
    .line 93
    if-eqz v0, :cond_7

    .line 94
    .line 95
    sget-object v0, Landroidx/compose/ui/graphics/drawscope/DrawScope;->Companion:Landroidx/compose/ui/graphics/drawscope/DrawScope$Companion;

    .line 96
    .line 97
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/drawscope/DrawScope$Companion;->getDefaultBlendMode-0nO6VwU()I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    move v15, v0

    .line 102
    goto :goto_7

    .line 103
    :cond_7
    move/from16 v15, p12

    .line 104
    .line 105
    :goto_7
    move-object/from16 v3, p0

    .line 106
    .line 107
    move-object/from16 v4, p1

    .line 108
    .line 109
    move-object/from16 v5, p2

    .line 110
    .line 111
    invoke-static/range {v3 .. v15}, Landroidx/compose/ui/text/TextPainterKt;->drawText-JFhB2K4(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextMeasurer;Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextStyle;IZILjava/util/List;JI)V

    .line 112
    .line 113
    .line 114
    return-void
.end method

.method public static final drawText-LVfH_YU(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/graphics/Brush;JFLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V
    .locals 12
    .annotation build Landroidx/compose/ui/text/ExperimentalTextApi;
    .end annotation

    .line 1
    move-object v0, p1

    .line 2
    const-string v1, "$this$drawText"

    .line 3
    .line 4
    move-object v2, p0

    .line 5
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v1, "textLayoutResult"

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v1, "brush"

    .line 15
    .line 16
    move-object v4, p2

    .line 17
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    if-nez p6, :cond_0

    .line 21
    .line 22
    invoke-virtual {p1}, Landroidx/compose/ui/text/TextLayoutResult;->getLayoutInput()Landroidx/compose/ui/text/TextLayoutInput;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Landroidx/compose/ui/text/TextLayoutInput;->getStyle()Landroidx/compose/ui/text/TextStyle;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Landroidx/compose/ui/text/TextStyle;->getShadow()Landroidx/compose/ui/graphics/Shadow;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    move-object v6, v1

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move-object/from16 v6, p6

    .line 37
    .line 38
    :goto_0
    if-nez p7, :cond_1

    .line 39
    .line 40
    invoke-virtual {p1}, Landroidx/compose/ui/text/TextLayoutResult;->getLayoutInput()Landroidx/compose/ui/text/TextLayoutInput;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v1}, Landroidx/compose/ui/text/TextLayoutInput;->getStyle()Landroidx/compose/ui/text/TextStyle;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v1}, Landroidx/compose/ui/text/TextStyle;->getTextDecoration()Landroidx/compose/ui/text/style/TextDecoration;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    move-object v7, v1

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    move-object/from16 v7, p7

    .line 55
    .line 56
    :goto_1
    if-nez p8, :cond_2

    .line 57
    .line 58
    invoke-virtual {p1}, Landroidx/compose/ui/text/TextLayoutResult;->getLayoutInput()Landroidx/compose/ui/text/TextLayoutInput;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v1}, Landroidx/compose/ui/text/TextLayoutInput;->getStyle()Landroidx/compose/ui/text/TextStyle;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v1}, Landroidx/compose/ui/text/TextStyle;->getDrawStyle()Landroidx/compose/ui/graphics/drawscope/DrawStyle;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    move-object v8, v1

    .line 71
    goto :goto_2

    .line 72
    :cond_2
    move-object/from16 v8, p8

    .line 73
    .line 74
    :goto_2
    invoke-interface {p0}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getSize-NH-jbRc()J

    .line 79
    .line 80
    .line 81
    move-result-wide v10

    .line 82
    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getCanvas()Landroidx/compose/ui/graphics/Canvas;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-interface {v3}, Landroidx/compose/ui/graphics/Canvas;->save()V

    .line 87
    .line 88
    .line 89
    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getTransform()Landroidx/compose/ui/graphics/drawscope/DrawTransform;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-static/range {p3 .. p4}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    invoke-static/range {p3 .. p4}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 98
    .line 99
    .line 100
    move-result v9

    .line 101
    invoke-interface {v3, v5, v9}, Landroidx/compose/ui/graphics/drawscope/DrawTransform;->translate(FF)V

    .line 102
    .line 103
    .line 104
    invoke-static {v3, p1}, Landroidx/compose/ui/text/TextPainterKt;->clip(Landroidx/compose/ui/graphics/drawscope/DrawTransform;Landroidx/compose/ui/text/TextLayoutResult;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1}, Landroidx/compose/ui/text/TextLayoutResult;->getMultiParagraph()Landroidx/compose/ui/text/MultiParagraph;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-interface {p0}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-interface {v2}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getCanvas()Landroidx/compose/ui/graphics/Canvas;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    invoke-static/range {p5 .. p5}, Ljava/lang/Float;->isNaN(F)Z

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    if-nez v2, :cond_3

    .line 124
    .line 125
    move/from16 v0, p5

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_3
    invoke-virtual {p1}, Landroidx/compose/ui/text/TextLayoutResult;->getLayoutInput()Landroidx/compose/ui/text/TextLayoutInput;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual {v0}, Landroidx/compose/ui/text/TextLayoutInput;->getStyle()Landroidx/compose/ui/text/TextStyle;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-virtual {v0}, Landroidx/compose/ui/text/TextStyle;->getAlpha()F

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    :goto_3
    move-object v2, v3

    .line 141
    move-object v3, v5

    .line 142
    move-object v4, p2

    .line 143
    move v5, v0

    .line 144
    move/from16 v9, p9

    .line 145
    .line 146
    invoke-virtual/range {v2 .. v9}, Landroidx/compose/ui/text/MultiParagraph;->paint-hn5TExg(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V

    .line 147
    .line 148
    .line 149
    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getCanvas()Landroidx/compose/ui/graphics/Canvas;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-interface {v0}, Landroidx/compose/ui/graphics/Canvas;->restore()V

    .line 154
    .line 155
    .line 156
    invoke-interface {v1, v10, v11}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->setSize-uvyYCjk(J)V

    .line 157
    .line 158
    .line 159
    return-void
.end method

.method public static synthetic drawText-LVfH_YU$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/graphics/Brush;JFLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IILjava/lang/Object;)V
    .locals 13

    .line 1
    move/from16 v0, p10

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x4

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    sget-object v1, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    move-wide v6, v1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-wide/from16 v6, p3

    .line 16
    .line 17
    :goto_0
    and-int/lit8 v1, v0, 0x8

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 22
    .line 23
    move v8, v1

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move/from16 v8, p5

    .line 26
    .line 27
    :goto_1
    and-int/lit8 v1, v0, 0x10

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    move-object v9, v2

    .line 33
    goto :goto_2

    .line 34
    :cond_2
    move-object/from16 v9, p6

    .line 35
    .line 36
    :goto_2
    and-int/lit8 v1, v0, 0x20

    .line 37
    .line 38
    if-eqz v1, :cond_3

    .line 39
    .line 40
    move-object v10, v2

    .line 41
    goto :goto_3

    .line 42
    :cond_3
    move-object/from16 v10, p7

    .line 43
    .line 44
    :goto_3
    and-int/lit8 v1, v0, 0x40

    .line 45
    .line 46
    if-eqz v1, :cond_4

    .line 47
    .line 48
    move-object v11, v2

    .line 49
    goto :goto_4

    .line 50
    :cond_4
    move-object/from16 v11, p8

    .line 51
    .line 52
    :goto_4
    and-int/lit16 v0, v0, 0x80

    .line 53
    .line 54
    if-eqz v0, :cond_5

    .line 55
    .line 56
    sget-object v0, Landroidx/compose/ui/graphics/drawscope/DrawScope;->Companion:Landroidx/compose/ui/graphics/drawscope/DrawScope$Companion;

    .line 57
    .line 58
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/drawscope/DrawScope$Companion;->getDefaultBlendMode-0nO6VwU()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    move v12, v0

    .line 63
    goto :goto_5

    .line 64
    :cond_5
    move/from16 v12, p9

    .line 65
    .line 66
    :goto_5
    move-object v3, p0

    .line 67
    move-object v4, p1

    .line 68
    move-object v5, p2

    .line 69
    invoke-static/range {v3 .. v12}, Landroidx/compose/ui/text/TextPainterKt;->drawText-LVfH_YU(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/graphics/Brush;JFLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public static final drawText-TPWCCtM(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextMeasurer;Ljava/lang/String;JLandroidx/compose/ui/text/TextStyle;IZIJI)V
    .locals 20
    .annotation build Landroidx/compose/ui/text/ExperimentalTextApi;
    .end annotation

    .line 1
    move-object/from16 v15, p0

    .line 2
    .line 3
    const-string v0, "$this$drawText"

    .line 4
    .line 5
    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v0, "textMeasurer"

    .line 9
    .line 10
    .line 11
    move-object/from16 v1, p1

    .line 12
    .line 13
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string/jumbo v0, "text"

    .line 17
    .line 18
    .line 19
    move-object/from16 v3, p2

    .line 20
    .line 21
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string/jumbo v0, "style"

    .line 25
    .line 26
    .line 27
    move-object/from16 v8, p5

    .line 28
    .line 29
    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    new-instance v9, Landroidx/compose/ui/text/AnnotatedString;

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x6

    .line 37
    const/4 v7, 0x0

    .line 38
    move-object v2, v9

    .line 39
    invoke-direct/range {v2 .. v7}, Landroidx/compose/ui/text/AnnotatedString;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 40
    .line 41
    .line 42
    const/4 v6, 0x0

    .line 43
    move-wide/from16 v13, p3

    .line 44
    .line 45
    move-wide/from16 v2, p9

    .line 46
    .line 47
    invoke-static {v15, v2, v3, v13, v14}, Landroidx/compose/ui/text/TextPainterKt;->textLayoutConstraints-v_w8tDc(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJ)J

    .line 48
    .line 49
    .line 50
    move-result-wide v10

    .line 51
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 52
    .line 53
    .line 54
    move-result-object v12

    .line 55
    const/16 v16, 0x0

    .line 56
    .line 57
    const/16 v17, 0x0

    .line 58
    .line 59
    const/16 v18, 0x620

    .line 60
    .line 61
    const/16 v19, 0x0

    .line 62
    .line 63
    move-object/from16 v0, p1

    .line 64
    .line 65
    move-object v1, v9

    .line 66
    move-object/from16 v2, p5

    .line 67
    .line 68
    move/from16 v3, p6

    .line 69
    .line 70
    move/from16 v4, p7

    .line 71
    .line 72
    move/from16 v5, p8

    .line 73
    .line 74
    move-wide v7, v10

    .line 75
    move-object v9, v12

    .line 76
    move-object/from16 v10, p0

    .line 77
    .line 78
    move-object/from16 v11, v16

    .line 79
    .line 80
    move/from16 v12, v17

    .line 81
    .line 82
    move/from16 v13, v18

    .line 83
    .line 84
    move-object/from16 v14, v19

    .line 85
    .line 86
    invoke-static/range {v0 .. v14}, Landroidx/compose/ui/text/TextMeasurer;->measure-xDpz5zY$default(Landroidx/compose/ui/text/TextMeasurer;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;IZILjava/util/List;JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;ZILjava/lang/Object;)Landroidx/compose/ui/text/TextLayoutResult;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getSize-NH-jbRc()J

    .line 95
    .line 96
    .line 97
    move-result-wide v2

    .line 98
    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getCanvas()Landroidx/compose/ui/graphics/Canvas;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-interface {v4}, Landroidx/compose/ui/graphics/Canvas;->save()V

    .line 103
    .line 104
    .line 105
    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getTransform()Landroidx/compose/ui/graphics/drawscope/DrawTransform;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    invoke-static/range {p3 .. p4}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    invoke-static/range {p3 .. p4}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    invoke-interface {v4, v5, v6}, Landroidx/compose/ui/graphics/drawscope/DrawTransform;->translate(FF)V

    .line 118
    .line 119
    .line 120
    invoke-static {v4, v0}, Landroidx/compose/ui/text/TextPainterKt;->clip(Landroidx/compose/ui/graphics/drawscope/DrawTransform;Landroidx/compose/ui/text/TextLayoutResult;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0}, Landroidx/compose/ui/text/TextLayoutResult;->getMultiParagraph()Landroidx/compose/ui/text/MultiParagraph;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    invoke-interface {v4}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getCanvas()Landroidx/compose/ui/graphics/Canvas;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    const-wide/16 v5, 0x0

    .line 136
    .line 137
    const/4 v7, 0x0

    .line 138
    const/4 v8, 0x0

    .line 139
    const/4 v9, 0x0

    .line 140
    const/16 v10, 0x1e

    .line 141
    .line 142
    const/4 v11, 0x0

    .line 143
    move-object/from16 p0, v0

    .line 144
    .line 145
    move-object/from16 p1, v4

    .line 146
    .line 147
    move-wide/from16 p2, v5

    .line 148
    .line 149
    move-object/from16 p4, v7

    .line 150
    .line 151
    move-object/from16 p5, v8

    .line 152
    .line 153
    move-object/from16 p6, v9

    .line 154
    .line 155
    move/from16 p7, p11

    .line 156
    .line 157
    move/from16 p8, v10

    .line 158
    .line 159
    move-object/from16 p9, v11

    .line 160
    .line 161
    invoke-static/range {p0 .. p9}, Landroidx/compose/ui/text/MultiParagraph;->paint-LG529CI$default(Landroidx/compose/ui/text/MultiParagraph;Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IILjava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getCanvas()Landroidx/compose/ui/graphics/Canvas;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-interface {v0}, Landroidx/compose/ui/graphics/Canvas;->restore()V

    .line 169
    .line 170
    .line 171
    invoke-interface {v1, v2, v3}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->setSize-uvyYCjk(J)V

    .line 172
    .line 173
    .line 174
    return-void
.end method

.method public static synthetic drawText-TPWCCtM$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextMeasurer;Ljava/lang/String;JLandroidx/compose/ui/text/TextStyle;IZIJIILjava/lang/Object;)V
    .locals 15

    .line 1
    move/from16 v0, p12

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x4

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    sget-object v1, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    move-wide v6, v1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-wide/from16 v6, p3

    .line 16
    .line 17
    :goto_0
    and-int/lit8 v1, v0, 0x8

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    sget-object v1, Landroidx/compose/ui/text/TextStyle;->Companion:Landroidx/compose/ui/text/TextStyle$Companion;

    .line 22
    .line 23
    invoke-virtual {v1}, Landroidx/compose/ui/text/TextStyle$Companion;->getDefault()Landroidx/compose/ui/text/TextStyle;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    move-object v8, v1

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move-object/from16 v8, p5

    .line 30
    .line 31
    :goto_1
    and-int/lit8 v1, v0, 0x10

    .line 32
    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    sget-object v1, Landroidx/compose/ui/text/style/TextOverflow;->Companion:Landroidx/compose/ui/text/style/TextOverflow$Companion;

    .line 36
    .line 37
    invoke-virtual {v1}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getClip-gIe3tQ8()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    move v9, v1

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    move/from16 v9, p6

    .line 44
    .line 45
    :goto_2
    and-int/lit8 v1, v0, 0x20

    .line 46
    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    const/4 v1, 0x1

    .line 50
    move v10, v1

    .line 51
    goto :goto_3

    .line 52
    :cond_3
    move/from16 v10, p7

    .line 53
    .line 54
    :goto_3
    and-int/lit8 v1, v0, 0x40

    .line 55
    .line 56
    if-eqz v1, :cond_4

    .line 57
    .line 58
    const v1, 0x7fffffff

    .line 59
    .line 60
    .line 61
    move v11, v1

    .line 62
    goto :goto_4

    .line 63
    :cond_4
    move/from16 v11, p8

    .line 64
    .line 65
    :goto_4
    and-int/lit16 v1, v0, 0x80

    .line 66
    .line 67
    if-eqz v1, :cond_5

    .line 68
    .line 69
    sget-object v1, Landroidx/compose/ui/geometry/Size;->Companion:Landroidx/compose/ui/geometry/Size$Companion;

    .line 70
    .line 71
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Size$Companion;->getUnspecified-NH-jbRc()J

    .line 72
    .line 73
    .line 74
    move-result-wide v1

    .line 75
    move-wide v12, v1

    .line 76
    goto :goto_5

    .line 77
    :cond_5
    move-wide/from16 v12, p9

    .line 78
    .line 79
    :goto_5
    and-int/lit16 v0, v0, 0x100

    .line 80
    .line 81
    if-eqz v0, :cond_6

    .line 82
    .line 83
    sget-object v0, Landroidx/compose/ui/graphics/drawscope/DrawScope;->Companion:Landroidx/compose/ui/graphics/drawscope/DrawScope$Companion;

    .line 84
    .line 85
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/drawscope/DrawScope$Companion;->getDefaultBlendMode-0nO6VwU()I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    move v14, v0

    .line 90
    goto :goto_6

    .line 91
    :cond_6
    move/from16 v14, p11

    .line 92
    .line 93
    :goto_6
    move-object v3, p0

    .line 94
    move-object/from16 v4, p1

    .line 95
    .line 96
    move-object/from16 v5, p2

    .line 97
    .line 98
    invoke-static/range {v3 .. v14}, Landroidx/compose/ui/text/TextPainterKt;->drawText-TPWCCtM(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextMeasurer;Ljava/lang/String;JLandroidx/compose/ui/text/TextStyle;IZIJI)V

    .line 99
    .line 100
    .line 101
    return-void
.end method

.method public static final drawText-d8-rzKo(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextLayoutResult;JJFLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V
    .locals 13
    .annotation build Landroidx/compose/ui/text/ExperimentalTextApi;
    .end annotation

    .line 1
    move-object v0, p1

    .line 2
    const-string v1, "$this$drawText"

    .line 3
    .line 4
    move-object v2, p0

    .line 5
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v1, "textLayoutResult"

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    if-nez p7, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Landroidx/compose/ui/text/TextLayoutResult;->getLayoutInput()Landroidx/compose/ui/text/TextLayoutInput;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Landroidx/compose/ui/text/TextLayoutInput;->getStyle()Landroidx/compose/ui/text/TextStyle;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Landroidx/compose/ui/text/TextStyle;->getShadow()Landroidx/compose/ui/graphics/Shadow;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object/from16 v1, p7

    .line 30
    .line 31
    :goto_0
    if-nez p8, :cond_1

    .line 32
    .line 33
    invoke-virtual {p1}, Landroidx/compose/ui/text/TextLayoutResult;->getLayoutInput()Landroidx/compose/ui/text/TextLayoutInput;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v3}, Landroidx/compose/ui/text/TextLayoutInput;->getStyle()Landroidx/compose/ui/text/TextStyle;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v3}, Landroidx/compose/ui/text/TextStyle;->getTextDecoration()Landroidx/compose/ui/text/style/TextDecoration;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move-object/from16 v3, p8

    .line 47
    .line 48
    :goto_1
    if-nez p9, :cond_2

    .line 49
    .line 50
    invoke-virtual {p1}, Landroidx/compose/ui/text/TextLayoutResult;->getLayoutInput()Landroidx/compose/ui/text/TextLayoutInput;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    invoke-virtual {v4}, Landroidx/compose/ui/text/TextLayoutInput;->getStyle()Landroidx/compose/ui/text/TextStyle;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-virtual {v4}, Landroidx/compose/ui/text/TextStyle;->getDrawStyle()Landroidx/compose/ui/graphics/drawscope/DrawStyle;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    goto :goto_2

    .line 63
    :cond_2
    move-object/from16 v4, p9

    .line 64
    .line 65
    :goto_2
    invoke-interface {p0}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    invoke-interface {v5}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getSize-NH-jbRc()J

    .line 70
    .line 71
    .line 72
    move-result-wide v6

    .line 73
    invoke-interface {v5}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getCanvas()Landroidx/compose/ui/graphics/Canvas;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    invoke-interface {v8}, Landroidx/compose/ui/graphics/Canvas;->save()V

    .line 78
    .line 79
    .line 80
    invoke-interface {v5}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getTransform()Landroidx/compose/ui/graphics/drawscope/DrawTransform;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    invoke-static/range {p4 .. p5}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 85
    .line 86
    .line 87
    move-result v9

    .line 88
    invoke-static/range {p4 .. p5}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 89
    .line 90
    .line 91
    move-result v10

    .line 92
    invoke-interface {v8, v9, v10}, Landroidx/compose/ui/graphics/drawscope/DrawTransform;->translate(FF)V

    .line 93
    .line 94
    .line 95
    invoke-static {v8, p1}, Landroidx/compose/ui/text/TextPainterKt;->clip(Landroidx/compose/ui/graphics/drawscope/DrawTransform;Landroidx/compose/ui/text/TextLayoutResult;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1}, Landroidx/compose/ui/text/TextLayoutResult;->getLayoutInput()Landroidx/compose/ui/text/TextLayoutInput;

    .line 99
    .line 100
    .line 101
    move-result-object v8

    .line 102
    invoke-virtual {v8}, Landroidx/compose/ui/text/TextLayoutInput;->getStyle()Landroidx/compose/ui/text/TextStyle;

    .line 103
    .line 104
    .line 105
    move-result-object v8

    .line 106
    invoke-virtual {v8}, Landroidx/compose/ui/text/TextStyle;->getBrush()Landroidx/compose/ui/graphics/Brush;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    const/4 v9, 0x1

    .line 111
    const/4 v10, 0x0

    .line 112
    if-eqz v8, :cond_5

    .line 113
    .line 114
    sget-object v11, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 115
    .line 116
    invoke-virtual {v11}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 117
    .line 118
    .line 119
    move-result-wide v11

    .line 120
    cmp-long v11, p2, v11

    .line 121
    .line 122
    if-nez v11, :cond_3

    .line 123
    .line 124
    move v11, v9

    .line 125
    goto :goto_3

    .line 126
    :cond_3
    move v11, v10

    .line 127
    :goto_3
    if-eqz v11, :cond_5

    .line 128
    .line 129
    invoke-virtual {p1}, Landroidx/compose/ui/text/TextLayoutResult;->getMultiParagraph()Landroidx/compose/ui/text/MultiParagraph;

    .line 130
    .line 131
    .line 132
    move-result-object v9

    .line 133
    invoke-interface {p0}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    invoke-interface {v2}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getCanvas()Landroidx/compose/ui/graphics/Canvas;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-static/range {p6 .. p6}, Ljava/lang/Float;->isNaN(F)Z

    .line 142
    .line 143
    .line 144
    move-result v10

    .line 145
    if-nez v10, :cond_4

    .line 146
    .line 147
    move/from16 v0, p6

    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_4
    invoke-virtual {p1}, Landroidx/compose/ui/text/TextLayoutResult;->getLayoutInput()Landroidx/compose/ui/text/TextLayoutInput;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-virtual {v0}, Landroidx/compose/ui/text/TextLayoutInput;->getStyle()Landroidx/compose/ui/text/TextStyle;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-virtual {v0}, Landroidx/compose/ui/text/TextStyle;->getAlpha()F

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    :goto_4
    move-object p0, v9

    .line 163
    move-object p1, v2

    .line 164
    move-object p2, v8

    .line 165
    move/from16 p3, v0

    .line 166
    .line 167
    move-object/from16 p4, v1

    .line 168
    .line 169
    move-object/from16 p5, v3

    .line 170
    .line 171
    move-object/from16 p6, v4

    .line 172
    .line 173
    move/from16 p7, p10

    .line 174
    .line 175
    invoke-virtual/range {p0 .. p7}, Landroidx/compose/ui/text/MultiParagraph;->paint-hn5TExg(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V

    .line 176
    .line 177
    .line 178
    goto :goto_7

    .line 179
    :cond_5
    invoke-virtual {p1}, Landroidx/compose/ui/text/TextLayoutResult;->getMultiParagraph()Landroidx/compose/ui/text/MultiParagraph;

    .line 180
    .line 181
    .line 182
    move-result-object v8

    .line 183
    invoke-interface {p0}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    invoke-interface {v2}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getCanvas()Landroidx/compose/ui/graphics/Canvas;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    sget-object v11, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 192
    .line 193
    invoke-virtual {v11}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 194
    .line 195
    .line 196
    move-result-wide v11

    .line 197
    cmp-long v11, p2, v11

    .line 198
    .line 199
    if-eqz v11, :cond_6

    .line 200
    .line 201
    goto :goto_5

    .line 202
    :cond_6
    move v9, v10

    .line 203
    :goto_5
    if-eqz v9, :cond_7

    .line 204
    .line 205
    move-wide v9, p2

    .line 206
    goto :goto_6

    .line 207
    :cond_7
    invoke-virtual {p1}, Landroidx/compose/ui/text/TextLayoutResult;->getLayoutInput()Landroidx/compose/ui/text/TextLayoutInput;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-virtual {v0}, Landroidx/compose/ui/text/TextLayoutInput;->getStyle()Landroidx/compose/ui/text/TextStyle;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-virtual {v0}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    .line 216
    .line 217
    .line 218
    move-result-wide v9

    .line 219
    :goto_6
    move/from16 v0, p6

    .line 220
    .line 221
    invoke-static {v9, v10, v0}, Landroidx/compose/ui/text/style/TextDrawStyleKt;->modulate-DxMtmZc(JF)J

    .line 222
    .line 223
    .line 224
    move-result-wide v9

    .line 225
    move-object p0, v8

    .line 226
    move-object p1, v2

    .line 227
    move-wide p2, v9

    .line 228
    move-object/from16 p4, v1

    .line 229
    .line 230
    move-object/from16 p5, v3

    .line 231
    .line 232
    move-object/from16 p6, v4

    .line 233
    .line 234
    move/from16 p7, p10

    .line 235
    .line 236
    invoke-virtual/range {p0 .. p7}, Landroidx/compose/ui/text/MultiParagraph;->paint-LG529CI(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V

    .line 237
    .line 238
    .line 239
    :goto_7
    invoke-interface {v5}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getCanvas()Landroidx/compose/ui/graphics/Canvas;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-interface {v0}, Landroidx/compose/ui/graphics/Canvas;->restore()V

    .line 244
    .line 245
    .line 246
    invoke-interface {v5, v6, v7}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->setSize-uvyYCjk(J)V

    .line 247
    .line 248
    .line 249
    return-void
.end method

.method public static synthetic drawText-d8-rzKo$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextLayoutResult;JJFLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IILjava/lang/Object;)V
    .locals 10

    .line 1
    move/from16 v0, p11

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x2

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-wide v1, p2

    .line 15
    :goto_0
    and-int/lit8 v3, v0, 0x4

    .line 16
    .line 17
    if-eqz v3, :cond_1

    .line 18
    .line 19
    sget-object v3, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 20
    .line 21
    invoke-virtual {v3}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 22
    .line 23
    .line 24
    move-result-wide v3

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move-wide v3, p4

    .line 27
    :goto_1
    and-int/lit8 v5, v0, 0x8

    .line 28
    .line 29
    if-eqz v5, :cond_2

    .line 30
    .line 31
    const/high16 v5, 0x7fc00000    # Float.NaN

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_2
    move/from16 v5, p6

    .line 35
    .line 36
    :goto_2
    and-int/lit8 v6, v0, 0x10

    .line 37
    .line 38
    const/4 v7, 0x0

    .line 39
    if-eqz v6, :cond_3

    .line 40
    .line 41
    move-object v6, v7

    .line 42
    goto :goto_3

    .line 43
    :cond_3
    move-object/from16 v6, p7

    .line 44
    .line 45
    :goto_3
    and-int/lit8 v8, v0, 0x20

    .line 46
    .line 47
    if-eqz v8, :cond_4

    .line 48
    .line 49
    move-object v8, v7

    .line 50
    goto :goto_4

    .line 51
    :cond_4
    move-object/from16 v8, p8

    .line 52
    .line 53
    :goto_4
    and-int/lit8 v9, v0, 0x40

    .line 54
    .line 55
    if-eqz v9, :cond_5

    .line 56
    .line 57
    goto :goto_5

    .line 58
    :cond_5
    move-object/from16 v7, p9

    .line 59
    .line 60
    :goto_5
    and-int/lit16 v0, v0, 0x80

    .line 61
    .line 62
    if-eqz v0, :cond_6

    .line 63
    .line 64
    sget-object v0, Landroidx/compose/ui/graphics/drawscope/DrawScope;->Companion:Landroidx/compose/ui/graphics/drawscope/DrawScope$Companion;

    .line 65
    .line 66
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/drawscope/DrawScope$Companion;->getDefaultBlendMode-0nO6VwU()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    goto :goto_6

    .line 71
    :cond_6
    move/from16 v0, p10

    .line 72
    .line 73
    :goto_6
    move-object p2, p0

    .line 74
    move-object p3, p1

    .line 75
    move-wide p4, v1

    .line 76
    move-wide/from16 p6, v3

    .line 77
    .line 78
    move/from16 p8, v5

    .line 79
    .line 80
    move-object/from16 p9, v6

    .line 81
    .line 82
    move-object/from16 p10, v8

    .line 83
    .line 84
    move-object/from16 p11, v7

    .line 85
    .line 86
    move/from16 p12, v0

    .line 87
    .line 88
    invoke-static/range {p2 .. p12}, Landroidx/compose/ui/text/TextPainterKt;->drawText-d8-rzKo(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextLayoutResult;JJFLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public static final getDefaultTextBlendMode()I
    .locals 1

    .line 1
    sget v0, Landroidx/compose/ui/text/TextPainterKt;->DefaultTextBlendMode:I

    .line 2
    .line 3
    return v0
.end method

.method private static final textLayoutConstraints-v_w8tDc(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJ)J
    .locals 7

    .line 1
    sget-object v0, Landroidx/compose/ui/geometry/Size;->Companion:Landroidx/compose/ui/geometry/Size$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Size$Companion;->getUnspecified-NH-jbRc()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    cmp-long v1, p1, v1

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x0

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    move v1, v2

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v1, v3

    .line 16
    :goto_0
    if-nez v1, :cond_2

    .line 17
    .line 18
    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move v1, v3

    .line 30
    goto :goto_2

    .line 31
    :cond_2
    :goto_1
    move v1, v2

    .line 32
    :goto_2
    if-eqz v1, :cond_3

    .line 33
    .line 34
    invoke-interface {p0}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 35
    .line 36
    .line 37
    move-result-wide v4

    .line 38
    invoke-static {v4, v5}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-static {p3, p4}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    sub-float/2addr v1, v4

    .line 47
    float-to-double v4, v1

    .line 48
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 49
    .line 50
    .line 51
    move-result-wide v4

    .line 52
    double-to-float v1, v4

    .line 53
    invoke-static {v1}, Lkotlin/math/MathKt;->roundToInt(F)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    move v4, v1

    .line 58
    move v1, v3

    .line 59
    goto :goto_3

    .line 60
    :cond_3
    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    float-to-double v4, v1

    .line 65
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 66
    .line 67
    .line 68
    move-result-wide v4

    .line 69
    double-to-float v1, v4

    .line 70
    invoke-static {v1}, Lkotlin/math/MathKt;->roundToInt(F)I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    move v4, v1

    .line 75
    :goto_3
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Size$Companion;->getUnspecified-NH-jbRc()J

    .line 76
    .line 77
    .line 78
    move-result-wide v5

    .line 79
    cmp-long v0, p1, v5

    .line 80
    .line 81
    if-nez v0, :cond_4

    .line 82
    .line 83
    move v0, v2

    .line 84
    goto :goto_4

    .line 85
    :cond_4
    move v0, v3

    .line 86
    :goto_4
    if-nez v0, :cond_6

    .line 87
    .line 88
    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-eqz v0, :cond_5

    .line 97
    .line 98
    goto :goto_5

    .line 99
    :cond_5
    move v2, v3

    .line 100
    :cond_6
    :goto_5
    if-eqz v2, :cond_7

    .line 101
    .line 102
    invoke-interface {p0}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 103
    .line 104
    .line 105
    move-result-wide p0

    .line 106
    invoke-static {p0, p1}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    invoke-static {p3, p4}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    sub-float/2addr p0, p1

    .line 115
    float-to-double p0, p0

    .line 116
    invoke-static {p0, p1}, Ljava/lang/Math;->ceil(D)D

    .line 117
    .line 118
    .line 119
    move-result-wide p0

    .line 120
    double-to-float p0, p0

    .line 121
    invoke-static {p0}, Lkotlin/math/MathKt;->roundToInt(F)I

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    goto :goto_6

    .line 126
    :cond_7
    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    .line 127
    .line 128
    .line 129
    move-result p0

    .line 130
    float-to-double p0, p0

    .line 131
    invoke-static {p0, p1}, Ljava/lang/Math;->ceil(D)D

    .line 132
    .line 133
    .line 134
    move-result-wide p0

    .line 135
    double-to-float p0, p0

    .line 136
    invoke-static {p0}, Lkotlin/math/MathKt;->roundToInt(F)I

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    move p0, v3

    .line 141
    :goto_6
    invoke-static {v1, v4, v3, p0}, Landroidx/compose/ui/unit/ConstraintsKt;->Constraints(IIII)J

    .line 142
    .line 143
    .line 144
    move-result-wide p0

    .line 145
    return-wide p0
.end method
