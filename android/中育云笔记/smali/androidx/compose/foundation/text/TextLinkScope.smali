.class public final Landroidx/compose/foundation/text/TextLinkScope;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final annotators:Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lhd/l;",
            ">;"
        }
    .end annotation
.end field

.field private final initialText:Landroidx/compose/ui/text/AnnotatedString;

.field private text:Landroidx/compose/ui/text/AnnotatedString;

.field private final textLayoutResult$delegate:Landroidx/compose/runtime/MutableState;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/text/AnnotatedString;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/text/TextLinkScope;->initialText:Landroidx/compose/ui/text/AnnotatedString;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x2

    .line 8
    invoke-static {v0, v0, v1, v0}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Landroidx/compose/foundation/text/TextLinkScope;->textLayoutResult$delegate:Landroidx/compose/runtime/MutableState;

    .line 13
    .line 14
    sget-object v0, Landroidx/compose/foundation/text/TextLinkScope$1;->INSTANCE:Landroidx/compose/foundation/text/TextLinkScope$1;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroidx/compose/ui/text/AnnotatedString;->flatMapAnnotations(Lhd/l;)Landroidx/compose/ui/text/AnnotatedString;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Landroidx/compose/foundation/text/TextLinkScope;->text:Landroidx/compose/ui/text/AnnotatedString;

    .line 21
    .line 22
    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateListOf()Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Landroidx/compose/foundation/text/TextLinkScope;->annotators:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 27
    .line 28
    return-void
.end method

.method private final StyleAnnotation([Ljava/lang/Object;Lhd/l;Landroidx/compose/runtime/Composer;I)V
    .locals 7
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Object;",
            "Lhd/l;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    const v0, -0x7c28da43

    .line 2
    .line 3
    .line 4
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 5
    .line 6
    .line 7
    move-result-object p3

    .line 8
    and-int/lit8 v1, p4, 0x30

    .line 9
    .line 10
    const/16 v2, 0x20

    .line 11
    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    invoke-interface {p3, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    move v1, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/16 v1, 0x10

    .line 23
    .line 24
    :goto_0
    or-int/2addr v1, p4

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move v1, p4

    .line 27
    :goto_1
    and-int/lit16 v3, p4, 0x180

    .line 28
    .line 29
    if-nez v3, :cond_3

    .line 30
    .line 31
    invoke-interface {p3, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_2

    .line 36
    .line 37
    const/16 v3, 0x100

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_2
    const/16 v3, 0x80

    .line 41
    .line 42
    :goto_2
    or-int/2addr v1, v3

    .line 43
    :cond_3
    array-length v3, p1

    .line 44
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    const v4, -0x18d4e0f7

    .line 49
    .line 50
    .line 51
    invoke-interface {p3, v4, v3}, Landroidx/compose/runtime/Composer;->startMovableGroup(ILjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    array-length v3, p1

    .line 55
    const/4 v4, 0x0

    .line 56
    move v5, v4

    .line 57
    :goto_3
    if-ge v5, v3, :cond_5

    .line 58
    .line 59
    aget-object v6, p1, v5

    .line 60
    .line 61
    invoke-interface {p3, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    if-eqz v6, :cond_4

    .line 66
    .line 67
    const/4 v6, 0x4

    .line 68
    goto :goto_4

    .line 69
    :cond_4
    move v6, v4

    .line 70
    :goto_4
    or-int/2addr v1, v6

    .line 71
    add-int/lit8 v5, v5, 0x1

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_5
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endMovableGroup()V

    .line 75
    .line 76
    .line 77
    and-int/lit8 v3, v1, 0xe

    .line 78
    .line 79
    if-nez v3, :cond_6

    .line 80
    .line 81
    or-int/lit8 v1, v1, 0x2

    .line 82
    .line 83
    :cond_6
    and-int/lit16 v3, v1, 0x93

    .line 84
    .line 85
    const/16 v5, 0x92

    .line 86
    .line 87
    const/4 v6, 0x1

    .line 88
    if-eq v3, v5, :cond_7

    .line 89
    .line 90
    move v3, v6

    .line 91
    goto :goto_5

    .line 92
    :cond_7
    move v3, v4

    .line 93
    :goto_5
    and-int/lit8 v5, v1, 0x1

    .line 94
    .line 95
    invoke-interface {p3, v3, v5}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-eqz v3, :cond_c

    .line 100
    .line 101
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    if-eqz v3, :cond_8

    .line 106
    .line 107
    const/4 v3, -0x1

    .line 108
    const-string v5, "androidx.compose.foundation.text.TextLinkScope.StyleAnnotation (TextLinkScope.kt:315)"

    .line 109
    .line 110
    invoke-static {v0, v1, v3, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 111
    .line 112
    .line 113
    :cond_8
    new-instance v0, Lkotlin/jvm/internal/b0;

    .line 114
    .line 115
    const/4 v3, 0x2

    .line 116
    invoke-direct {v0, v3}, Lkotlin/jvm/internal/b0;-><init>(I)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, p2}, Lkotlin/jvm/internal/b0;->a(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/b0;->b(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0}, Lkotlin/jvm/internal/b0;->c()I

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    new-array v3, v3, [Ljava/lang/Object;

    .line 130
    .line 131
    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/b0;->d([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-interface {p3, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    and-int/lit8 v1, v1, 0x70

    .line 140
    .line 141
    if-ne v1, v2, :cond_9

    .line 142
    .line 143
    goto :goto_6

    .line 144
    :cond_9
    move v6, v4

    .line 145
    :goto_6
    or-int v1, v3, v6

    .line 146
    .line 147
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    if-nez v1, :cond_a

    .line 152
    .line 153
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 154
    .line 155
    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    if-ne v2, v1, :cond_b

    .line 160
    .line 161
    :cond_a
    new-instance v2, Landroidx/compose/foundation/text/TextLinkScope$StyleAnnotation$1$1;

    .line 162
    .line 163
    invoke-direct {v2, p0, p2}, Landroidx/compose/foundation/text/TextLinkScope$StyleAnnotation$1$1;-><init>(Landroidx/compose/foundation/text/TextLinkScope;Lhd/l;)V

    .line 164
    .line 165
    .line 166
    invoke-interface {p3, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    :cond_b
    check-cast v2, Lhd/l;

    .line 170
    .line 171
    invoke-static {v0, v2, p3, v4}, Landroidx/compose/runtime/EffectsKt;->DisposableEffect([Ljava/lang/Object;Lhd/l;Landroidx/compose/runtime/Composer;I)V

    .line 172
    .line 173
    .line 174
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    if-eqz v0, :cond_d

    .line 179
    .line 180
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 181
    .line 182
    .line 183
    goto :goto_7

    .line 184
    :cond_c
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 185
    .line 186
    .line 187
    :cond_d
    :goto_7
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 188
    .line 189
    .line 190
    move-result-object p3

    .line 191
    if-eqz p3, :cond_e

    .line 192
    .line 193
    new-instance v0, Landroidx/compose/foundation/text/TextLinkScope$StyleAnnotation$2;

    .line 194
    .line 195
    invoke-direct {v0, p0, p1, p2, p4}, Landroidx/compose/foundation/text/TextLinkScope$StyleAnnotation$2;-><init>(Landroidx/compose/foundation/text/TextLinkScope;[Ljava/lang/Object;Lhd/l;I)V

    .line 196
    .line 197
    .line 198
    invoke-interface {p3, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lhd/p;)V

    .line 199
    .line 200
    .line 201
    :cond_e
    return-void
.end method

.method public static synthetic a(Landroidx/compose/foundation/text/TextLinkScope;Landroidx/compose/ui/text/AnnotatedString$Range;Landroidx/compose/foundation/text/TextRangeLayoutMeasureScope;)Landroidx/compose/foundation/text/TextRangeLayoutMeasureResult;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/text/TextLinkScope;->textRange$lambda$0(Landroidx/compose/foundation/text/TextLinkScope;Landroidx/compose/ui/text/AnnotatedString$Range;Landroidx/compose/foundation/text/TextRangeLayoutMeasureScope;)Landroidx/compose/foundation/text/TextRangeLayoutMeasureResult;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$StyleAnnotation(Landroidx/compose/foundation/text/TextLinkScope;[Ljava/lang/Object;Lhd/l;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/text/TextLinkScope;->StyleAnnotation([Ljava/lang/Object;Lhd/l;Landroidx/compose/runtime/Composer;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getAnnotators$p(Landroidx/compose/foundation/text/TextLinkScope;)Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/text/TextLinkScope;->annotators:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$handleLink(Landroidx/compose/foundation/text/TextLinkScope;Landroidx/compose/ui/text/LinkAnnotation;Landroidx/compose/ui/platform/UriHandler;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/text/TextLinkScope;->handleLink(Landroidx/compose/ui/text/LinkAnnotation;Landroidx/compose/ui/platform/UriHandler;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$mergeOrUse(Landroidx/compose/foundation/text/TextLinkScope;Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/SpanStyle;)Landroidx/compose/ui/text/SpanStyle;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/text/TextLinkScope;->mergeOrUse(Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/SpanStyle;)Landroidx/compose/ui/text/SpanStyle;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$shapeForRange(Landroidx/compose/foundation/text/TextLinkScope;Landroidx/compose/ui/text/AnnotatedString$Range;)Landroidx/compose/ui/graphics/Shape;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/foundation/text/TextLinkScope;->shapeForRange(Landroidx/compose/ui/text/AnnotatedString$Range;)Landroidx/compose/ui/graphics/Shape;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final calculateVisibleLinkRange(Landroidx/compose/ui/text/AnnotatedString$Range;Landroidx/compose/ui/text/TextLayoutResult;)Landroidx/compose/ui/text/AnnotatedString$Range;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/text/AnnotatedString$Range<",
            "Landroidx/compose/ui/text/LinkAnnotation;",
            ">;",
            "Landroidx/compose/ui/text/TextLayoutResult;",
            ")",
            "Landroidx/compose/ui/text/AnnotatedString$Range<",
            "Landroidx/compose/ui/text/LinkAnnotation;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Landroidx/compose/ui/text/TextLayoutResult;->getLineCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x2

    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-static {p2, v0, v1, v2, v3}, Landroidx/compose/ui/text/TextLayoutResult;->getLineEnd$default(Landroidx/compose/ui/text/TextLayoutResult;IZILjava/lang/Object;)I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    invoke-virtual {p1}, Landroidx/compose/ui/text/AnnotatedString$Range;->getStart()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-ge v0, p2, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1}, Landroidx/compose/ui/text/AnnotatedString$Range;->getEnd()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    const/16 v6, 0xb

    .line 29
    .line 30
    const/4 v7, 0x0

    .line 31
    const/4 v2, 0x0

    .line 32
    const/4 v3, 0x0

    .line 33
    const/4 v5, 0x0

    .line 34
    move-object v1, p1

    .line 35
    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/text/AnnotatedString$Range;->copy$default(Landroidx/compose/ui/text/AnnotatedString$Range;Ljava/lang/Object;IILjava/lang/String;ILjava/lang/Object;)Landroidx/compose/ui/text/AnnotatedString$Range;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    :cond_0
    return-object v3
.end method

.method private final clipLink(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString$Range;)Landroidx/compose/ui/Modifier;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/ui/text/AnnotatedString$Range<",
            "Landroidx/compose/ui/text/LinkAnnotation;",
            ">;)",
            "Landroidx/compose/ui/Modifier;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/foundation/text/TextLinkScope$clipLink$1;

    .line 2
    .line 3
    invoke-direct {v0, p0, p2}, Landroidx/compose/foundation/text/TextLinkScope$clipLink$1;-><init>(Landroidx/compose/foundation/text/TextLinkScope;Landroidx/compose/ui/text/AnnotatedString$Range;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Landroidx/compose/ui/graphics/GraphicsLayerModifierKt;->graphicsLayer(Landroidx/compose/ui/Modifier;Lhd/l;)Landroidx/compose/ui/Modifier;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method private final handleLink(Landroidx/compose/ui/text/LinkAnnotation;Landroidx/compose/ui/platform/UriHandler;)V
    .locals 1

    .line 1
    instance-of v0, p1, Landroidx/compose/ui/text/LinkAnnotation$Url;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p1}, Landroidx/compose/ui/text/LinkAnnotation;->getLinkInteractionListener()Landroidx/compose/ui/text/LinkInteractionListener;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0, p1}, Landroidx/compose/ui/text/LinkInteractionListener;->onClick(Landroidx/compose/ui/text/LinkAnnotation;)V

    .line 12
    .line 13
    .line 14
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    if-nez v0, :cond_2

    .line 19
    .line 20
    :try_start_0
    check-cast p1, Landroidx/compose/ui/text/LinkAnnotation$Url;

    .line 21
    .line 22
    invoke-virtual {p1}, Landroidx/compose/ui/text/LinkAnnotation$Url;->getUrl()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-interface {p2, p1}, Landroidx/compose/ui/platform/UriHandler;->openUri(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    instance-of p2, p1, Landroidx/compose/ui/text/LinkAnnotation$Clickable;

    .line 31
    .line 32
    if-eqz p2, :cond_2

    .line 33
    .line 34
    invoke-virtual {p1}, Landroidx/compose/ui/text/LinkAnnotation;->getLinkInteractionListener()Landroidx/compose/ui/text/LinkInteractionListener;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    if-eqz p2, :cond_2

    .line 39
    .line 40
    invoke-interface {p2, p1}, Landroidx/compose/ui/text/LinkInteractionListener;->onClick(Landroidx/compose/ui/text/LinkAnnotation;)V

    .line 41
    .line 42
    .line 43
    :catch_0
    :cond_2
    return-void
.end method

.method private final mergeOrUse(Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/SpanStyle;)Landroidx/compose/ui/text/SpanStyle;
    .locals 0

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Landroidx/compose/ui/text/SpanStyle;->merge(Landroidx/compose/ui/text/SpanStyle;)Landroidx/compose/ui/text/SpanStyle;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    return-object p1

    .line 11
    :cond_1
    :goto_0
    return-object p2
.end method

.method private final pathForRangeInRangeCoordinates(Landroidx/compose/ui/text/AnnotatedString$Range;)Landroidx/compose/ui/graphics/Path;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/text/AnnotatedString$Range<",
            "Landroidx/compose/ui/text/LinkAnnotation;",
            ">;)",
            "Landroidx/compose/ui/graphics/Path;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/text/TextLinkScope;->getShouldMeasureLinks()Lhd/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    return-object v1

    .line 19
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/foundation/text/TextLinkScope;->getTextLayoutResult()Landroidx/compose/ui/text/TextLayoutResult;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    invoke-direct {p0, p1, v0}, Landroidx/compose/foundation/text/TextLinkScope;->calculateVisibleLinkRange(Landroidx/compose/ui/text/AnnotatedString$Range;Landroidx/compose/ui/text/TextLayoutResult;)Landroidx/compose/ui/text/AnnotatedString$Range;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-nez p1, :cond_1

    .line 30
    .line 31
    return-object v1

    .line 32
    :cond_1
    invoke-virtual {p1}, Landroidx/compose/ui/text/AnnotatedString$Range;->getStart()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-virtual {p1}, Landroidx/compose/ui/text/AnnotatedString$Range;->getEnd()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/text/TextLayoutResult;->getPathForRange(II)Landroidx/compose/ui/graphics/Path;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {p1}, Landroidx/compose/ui/text/AnnotatedString$Range;->getStart()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    invoke-virtual {v0, v2}, Landroidx/compose/ui/text/TextLayoutResult;->getBoundingBox(I)Landroidx/compose/ui/geometry/Rect;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {p1}, Landroidx/compose/ui/text/AnnotatedString$Range;->getEnd()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    add-int/lit8 v3, v3, -0x1

    .line 57
    .line 58
    invoke-virtual {v0, v3}, Landroidx/compose/ui/text/TextLayoutResult;->getBoundingBox(I)Landroidx/compose/ui/geometry/Rect;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-virtual {p1}, Landroidx/compose/ui/text/AnnotatedString$Range;->getStart()I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    invoke-virtual {v0, v4}, Landroidx/compose/ui/text/TextLayoutResult;->getLineForOffset(I)I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    invoke-virtual {p1}, Landroidx/compose/ui/text/AnnotatedString$Range;->getEnd()I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    add-int/lit8 p1, p1, -0x1

    .line 75
    .line 76
    invoke-virtual {v0, p1}, Landroidx/compose/ui/text/TextLayoutResult;->getLineForOffset(I)I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-ne v4, p1, :cond_2

    .line 81
    .line 82
    invoke-virtual {v3}, Landroidx/compose/ui/geometry/Rect;->getLeft()F

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    invoke-virtual {v2}, Landroidx/compose/ui/geometry/Rect;->getLeft()F

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    goto :goto_0

    .line 95
    :cond_2
    const/4 p1, 0x0

    .line 96
    :goto_0
    invoke-virtual {v2}, Landroidx/compose/ui/geometry/Rect;->getTop()F

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    int-to-long v2, p1

    .line 105
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    int-to-long v4, p1

    .line 110
    const/16 p1, 0x20

    .line 111
    .line 112
    shl-long/2addr v2, p1

    .line 113
    const-wide v6, 0xffffffffL

    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    and-long/2addr v4, v6

    .line 119
    or-long/2addr v2, v4

    .line 120
    invoke-static {v2, v3}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    .line 121
    .line 122
    .line 123
    move-result-wide v2

    .line 124
    const-wide v4, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    xor-long/2addr v2, v4

    .line 130
    invoke-static {v2, v3}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    .line 131
    .line 132
    .line 133
    move-result-wide v2

    .line 134
    invoke-interface {v1, v2, v3}, Landroidx/compose/ui/graphics/Path;->translate-k-4lQ0M(J)V

    .line 135
    .line 136
    .line 137
    :cond_3
    return-object v1
.end method

.method private final shapeForRange(Landroidx/compose/ui/text/AnnotatedString$Range;)Landroidx/compose/ui/graphics/Shape;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/text/AnnotatedString$Range<",
            "Landroidx/compose/ui/text/LinkAnnotation;",
            ">;)",
            "Landroidx/compose/ui/graphics/Shape;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/foundation/text/TextLinkScope;->pathForRangeInRangeCoordinates(Landroidx/compose/ui/text/AnnotatedString$Range;)Landroidx/compose/ui/graphics/Path;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroidx/compose/foundation/text/TextLinkScope$shapeForRange$1$1;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Landroidx/compose/foundation/text/TextLinkScope$shapeForRange$1$1;-><init>(Landroidx/compose/ui/graphics/Path;)V

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    return-object p1
.end method

.method private final textRange(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString$Range;)Landroidx/compose/ui/Modifier;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/ui/text/AnnotatedString$Range<",
            "Landroidx/compose/ui/text/LinkAnnotation;",
            ">;)",
            "Landroidx/compose/ui/Modifier;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/foundation/text/TextRangeLayoutModifier;

    .line 2
    .line 3
    new-instance v1, Landroidx/compose/foundation/text/c;

    .line 4
    .line 5
    invoke-direct {v1, p0, p2}, Landroidx/compose/foundation/text/c;-><init>(Landroidx/compose/foundation/text/TextLinkScope;Landroidx/compose/ui/text/AnnotatedString$Range;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Landroidx/compose/foundation/text/TextRangeLayoutModifier;-><init>(Landroidx/compose/foundation/text/TextRangeScopeMeasurePolicy;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1, v0}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method private static final textRange$lambda$0(Landroidx/compose/foundation/text/TextLinkScope;Landroidx/compose/ui/text/AnnotatedString$Range;Landroidx/compose/foundation/text/TextRangeLayoutMeasureScope;)Landroidx/compose/foundation/text/TextRangeLayoutMeasureResult;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/text/TextLinkScope;->getTextLayoutResult()Landroidx/compose/ui/text/TextLayoutResult;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    sget-object p0, Landroidx/compose/foundation/text/TextLinkScope$textRange$1$layoutResult$1;->INSTANCE:Landroidx/compose/foundation/text/TextLinkScope$textRange$1$layoutResult$1;

    .line 9
    .line 10
    invoke-virtual {p2, v1, v1, p0}, Landroidx/compose/foundation/text/TextRangeLayoutMeasureScope;->layout(IILhd/a;)Landroidx/compose/foundation/text/TextRangeLayoutMeasureResult;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_0
    invoke-direct {p0, p1, v0}, Landroidx/compose/foundation/text/TextLinkScope;->calculateVisibleLinkRange(Landroidx/compose/ui/text/AnnotatedString$Range;Landroidx/compose/ui/text/TextLayoutResult;)Landroidx/compose/ui/text/AnnotatedString$Range;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    if-nez p0, :cond_1

    .line 20
    .line 21
    sget-object p0, Landroidx/compose/foundation/text/TextLinkScope$textRange$1$updatedRange$1;->INSTANCE:Landroidx/compose/foundation/text/TextLinkScope$textRange$1$updatedRange$1;

    .line 22
    .line 23
    invoke-virtual {p2, v1, v1, p0}, Landroidx/compose/foundation/text/TextRangeLayoutMeasureScope;->layout(IILhd/a;)Landroidx/compose/foundation/text/TextRangeLayoutMeasureResult;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :cond_1
    invoke-virtual {p0}, Landroidx/compose/ui/text/AnnotatedString$Range;->getStart()I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    invoke-virtual {p0}, Landroidx/compose/ui/text/AnnotatedString$Range;->getEnd()I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    invoke-virtual {v0, p1, p0}, Landroidx/compose/ui/text/TextLayoutResult;->getPathForRange(II)Landroidx/compose/ui/graphics/Path;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-interface {p0}, Landroidx/compose/ui/graphics/Path;->getBounds()Landroidx/compose/ui/geometry/Rect;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-static {p0}, Landroidx/compose/ui/unit/IntRectKt;->roundToIntRect(Landroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/unit/IntRect;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0}, Landroidx/compose/ui/unit/IntRect;->getWidth()I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    invoke-virtual {p0}, Landroidx/compose/ui/unit/IntRect;->getHeight()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    new-instance v1, Landroidx/compose/foundation/text/TextLinkScope$textRange$1$1;

    .line 57
    .line 58
    invoke-direct {v1, p0}, Landroidx/compose/foundation/text/TextLinkScope$textRange$1$1;-><init>(Landroidx/compose/ui/unit/IntRect;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p2, p1, v0, v1}, Landroidx/compose/foundation/text/TextRangeLayoutMeasureScope;->layout(IILhd/a;)Landroidx/compose/foundation/text/TextRangeLayoutMeasureResult;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0
.end method


# virtual methods
.method public final LinksComposables(Landroidx/compose/runtime/Composer;I)V
    .locals 28
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    const v2, 0x44d294da

    .line 6
    .line 7
    .line 8
    move-object/from16 v3, p1

    .line 9
    .line 10
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    and-int/lit8 v4, v1, 0x6

    .line 15
    .line 16
    const/4 v5, 0x2

    .line 17
    if-nez v4, :cond_1

    .line 18
    .line 19
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-eqz v4, :cond_0

    .line 24
    .line 25
    const/4 v4, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v4, v5

    .line 28
    :goto_0
    or-int/2addr v4, v1

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move v4, v1

    .line 31
    :goto_1
    and-int/lit8 v6, v4, 0x3

    .line 32
    .line 33
    const/4 v7, 0x1

    .line 34
    const/4 v8, 0x0

    .line 35
    if-eq v6, v5, :cond_2

    .line 36
    .line 37
    move v6, v7

    .line 38
    goto :goto_2

    .line 39
    :cond_2
    move v6, v8

    .line 40
    :goto_2
    and-int/lit8 v9, v4, 0x1

    .line 41
    .line 42
    invoke-interface {v3, v6, v9}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    if-eqz v6, :cond_12

    .line 47
    .line 48
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-eqz v6, :cond_3

    .line 53
    .line 54
    const/4 v6, -0x1

    .line 55
    const-string v9, "androidx.compose.foundation.text.TextLinkScope.LinksComposables (TextLinkScope.kt:214)"

    .line 56
    .line 57
    invoke-static {v2, v4, v6, v9}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 58
    .line 59
    .line 60
    :cond_3
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalUriHandler()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    check-cast v2, Landroidx/compose/ui/platform/UriHandler;

    .line 69
    .line 70
    iget-object v6, v0, Landroidx/compose/foundation/text/TextLinkScope;->text:Landroidx/compose/ui/text/AnnotatedString;

    .line 71
    .line 72
    invoke-virtual {v6}, Landroidx/compose/ui/text/AnnotatedString;->length()I

    .line 73
    .line 74
    .line 75
    move-result v9

    .line 76
    invoke-virtual {v6, v8, v9}, Landroidx/compose/ui/text/AnnotatedString;->getLinkAnnotations(II)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    move-object v9, v6

    .line 81
    check-cast v9, Ljava/util/Collection;

    .line 82
    .line 83
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    .line 84
    .line 85
    .line 86
    move-result v9

    .line 87
    move v10, v8

    .line 88
    :goto_3
    if-ge v10, v9, :cond_11

    .line 89
    .line 90
    invoke-interface {v6, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v11

    .line 94
    check-cast v11, Landroidx/compose/ui/text/AnnotatedString$Range;

    .line 95
    .line 96
    invoke-virtual {v11}, Landroidx/compose/ui/text/AnnotatedString$Range;->getStart()I

    .line 97
    .line 98
    .line 99
    move-result v12

    .line 100
    invoke-virtual {v11}, Landroidx/compose/ui/text/AnnotatedString$Range;->getEnd()I

    .line 101
    .line 102
    .line 103
    move-result v13

    .line 104
    if-eq v12, v13, :cond_10

    .line 105
    .line 106
    const v12, 0x529dd428

    .line 107
    .line 108
    .line 109
    invoke-interface {v3, v12}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 110
    .line 111
    .line 112
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v12

    .line 116
    sget-object v13, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 117
    .line 118
    invoke-virtual {v13}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v14

    .line 122
    if-ne v12, v14, :cond_4

    .line 123
    .line 124
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 125
    .line 126
    .line 127
    move-result-object v12

    .line 128
    invoke-interface {v3, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    :cond_4
    move-object v15, v12

    .line 132
    check-cast v15, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 133
    .line 134
    sget-object v12, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 135
    .line 136
    invoke-direct {v0, v12, v11}, Landroidx/compose/foundation/text/TextLinkScope;->clipLink(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString$Range;)Landroidx/compose/ui/Modifier;

    .line 137
    .line 138
    .line 139
    move-result-object v12

    .line 140
    sget-object v14, Landroidx/compose/foundation/text/TextLinkScope$LinksComposables$1$1;->INSTANCE:Landroidx/compose/foundation/text/TextLinkScope$LinksComposables$1$1;

    .line 141
    .line 142
    const/4 v5, 0x0

    .line 143
    invoke-static {v12, v8, v14, v7, v5}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics$default(Landroidx/compose/ui/Modifier;ZLhd/l;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 144
    .line 145
    .line 146
    move-result-object v12

    .line 147
    invoke-direct {v0, v12, v11}, Landroidx/compose/foundation/text/TextLinkScope;->textRange(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString$Range;)Landroidx/compose/ui/Modifier;

    .line 148
    .line 149
    .line 150
    move-result-object v12

    .line 151
    const/4 v14, 0x2

    .line 152
    invoke-static {v12, v15, v8, v14, v5}, Landroidx/compose/foundation/HoverableKt;->hoverable$default(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 153
    .line 154
    .line 155
    move-result-object v12

    .line 156
    sget-object v16, Landroidx/compose/ui/input/pointer/PointerIcon;->Companion:Landroidx/compose/ui/input/pointer/PointerIcon$Companion;

    .line 157
    .line 158
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/input/pointer/PointerIcon$Companion;->getHand()Landroidx/compose/ui/input/pointer/PointerIcon;

    .line 159
    .line 160
    .line 161
    move-result-object v7

    .line 162
    invoke-static {v12, v7, v8, v14, v5}, Landroidx/compose/ui/input/pointer/PointerIconKt;->pointerHoverIcon$default(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/input/pointer/PointerIcon;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 163
    .line 164
    .line 165
    move-result-object v7

    .line 166
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v12

    .line 170
    invoke-interface {v3, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v16

    .line 174
    or-int v12, v12, v16

    .line 175
    .line 176
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v16

    .line 180
    or-int v12, v12, v16

    .line 181
    .line 182
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v14

    .line 186
    if-nez v12, :cond_5

    .line 187
    .line 188
    invoke-virtual {v13}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v12

    .line 192
    if-ne v14, v12, :cond_6

    .line 193
    .line 194
    :cond_5
    new-instance v14, Landroidx/compose/foundation/text/TextLinkScope$LinksComposables$1$2$1;

    .line 195
    .line 196
    invoke-direct {v14, v0, v11, v2}, Landroidx/compose/foundation/text/TextLinkScope$LinksComposables$1$2$1;-><init>(Landroidx/compose/foundation/text/TextLinkScope;Landroidx/compose/ui/text/AnnotatedString$Range;Landroidx/compose/ui/platform/UriHandler;)V

    .line 197
    .line 198
    .line 199
    invoke-interface {v3, v14}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    :cond_6
    move-object/from16 v24, v14

    .line 203
    .line 204
    check-cast v24, Lhd/a;

    .line 205
    .line 206
    const/16 v25, 0x1fc

    .line 207
    .line 208
    const/16 v26, 0x0

    .line 209
    .line 210
    const/4 v14, 0x2

    .line 211
    const/16 v16, 0x0

    .line 212
    .line 213
    const/16 v17, 0x0

    .line 214
    .line 215
    const/16 v18, 0x0

    .line 216
    .line 217
    const/16 v19, 0x0

    .line 218
    .line 219
    const/16 v20, 0x0

    .line 220
    .line 221
    const/16 v21, 0x0

    .line 222
    .line 223
    const/16 v22, 0x0

    .line 224
    .line 225
    const/16 v23, 0x0

    .line 226
    .line 227
    move/from16 v27, v14

    .line 228
    .line 229
    move-object v14, v7

    .line 230
    move/from16 v7, v27

    .line 231
    .line 232
    invoke-static/range {v14 .. v26}, Landroidx/compose/foundation/ClickableKt;->combinedClickable-auXiCPI$default(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Ljava/lang/String;Lhd/a;Lhd/a;ZLhd/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 233
    .line 234
    .line 235
    move-result-object v12

    .line 236
    invoke-static {v12, v3, v8}, Landroidx/compose/foundation/layout/BoxKt;->Box(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v11}, Landroidx/compose/ui/text/AnnotatedString$Range;->getItem()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v12

    .line 243
    check-cast v12, Landroidx/compose/ui/text/LinkAnnotation;

    .line 244
    .line 245
    invoke-virtual {v12}, Landroidx/compose/ui/text/LinkAnnotation;->getStyles()Landroidx/compose/ui/text/TextLinkStyles;

    .line 246
    .line 247
    .line 248
    move-result-object v12

    .line 249
    invoke-static {v12}, Landroidx/compose/foundation/text/TextLinkScopeKt;->access$isNullOrEmpty(Landroidx/compose/ui/text/TextLinkStyles;)Z

    .line 250
    .line 251
    .line 252
    move-result v12

    .line 253
    if-nez v12, :cond_f

    .line 254
    .line 255
    const v12, 0x52aa638f

    .line 256
    .line 257
    .line 258
    invoke-interface {v3, v12}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 259
    .line 260
    .line 261
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v12

    .line 265
    invoke-virtual {v13}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v14

    .line 269
    if-ne v12, v14, :cond_7

    .line 270
    .line 271
    new-instance v12, Landroidx/compose/foundation/text/LinkStateInteractionSourceObserver;

    .line 272
    .line 273
    invoke-direct {v12, v15}, Landroidx/compose/foundation/text/LinkStateInteractionSourceObserver;-><init>(Landroidx/compose/foundation/interaction/InteractionSource;)V

    .line 274
    .line 275
    .line 276
    invoke-interface {v3, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    :cond_7
    check-cast v12, Landroidx/compose/foundation/text/LinkStateInteractionSourceObserver;

    .line 280
    .line 281
    sget-object v14, Lqc/q;->a:Lqc/q;

    .line 282
    .line 283
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v15

    .line 287
    invoke-virtual {v13}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v7

    .line 291
    if-ne v15, v7, :cond_8

    .line 292
    .line 293
    new-instance v15, Landroidx/compose/foundation/text/TextLinkScope$LinksComposables$1$3$1;

    .line 294
    .line 295
    invoke-direct {v15, v12, v5}, Landroidx/compose/foundation/text/TextLinkScope$LinksComposables$1$3$1;-><init>(Landroidx/compose/foundation/text/LinkStateInteractionSourceObserver;Lvc/c;)V

    .line 296
    .line 297
    .line 298
    invoke-interface {v3, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    :cond_8
    check-cast v15, Lhd/p;

    .line 302
    .line 303
    const/4 v7, 0x6

    .line 304
    invoke-static {v14, v15, v3, v7}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lhd/p;Landroidx/compose/runtime/Composer;I)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v12}, Landroidx/compose/foundation/text/LinkStateInteractionSourceObserver;->isHovered()Z

    .line 308
    .line 309
    .line 310
    move-result v14

    .line 311
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 312
    .line 313
    .line 314
    move-result-object v17

    .line 315
    invoke-virtual {v12}, Landroidx/compose/foundation/text/LinkStateInteractionSourceObserver;->isFocused()Z

    .line 316
    .line 317
    .line 318
    move-result v14

    .line 319
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 320
    .line 321
    .line 322
    move-result-object v18

    .line 323
    invoke-virtual {v12}, Landroidx/compose/foundation/text/LinkStateInteractionSourceObserver;->isPressed()Z

    .line 324
    .line 325
    .line 326
    move-result v14

    .line 327
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 328
    .line 329
    .line 330
    move-result-object v19

    .line 331
    invoke-virtual {v11}, Landroidx/compose/ui/text/AnnotatedString$Range;->getItem()Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v14

    .line 335
    check-cast v14, Landroidx/compose/ui/text/LinkAnnotation;

    .line 336
    .line 337
    invoke-virtual {v14}, Landroidx/compose/ui/text/LinkAnnotation;->getStyles()Landroidx/compose/ui/text/TextLinkStyles;

    .line 338
    .line 339
    .line 340
    move-result-object v14

    .line 341
    if-eqz v14, :cond_9

    .line 342
    .line 343
    invoke-virtual {v14}, Landroidx/compose/ui/text/TextLinkStyles;->getStyle()Landroidx/compose/ui/text/SpanStyle;

    .line 344
    .line 345
    .line 346
    move-result-object v14

    .line 347
    move-object/from16 v20, v14

    .line 348
    .line 349
    goto :goto_4

    .line 350
    :cond_9
    move-object/from16 v20, v5

    .line 351
    .line 352
    :goto_4
    invoke-virtual {v11}, Landroidx/compose/ui/text/AnnotatedString$Range;->getItem()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v14

    .line 356
    check-cast v14, Landroidx/compose/ui/text/LinkAnnotation;

    .line 357
    .line 358
    invoke-virtual {v14}, Landroidx/compose/ui/text/LinkAnnotation;->getStyles()Landroidx/compose/ui/text/TextLinkStyles;

    .line 359
    .line 360
    .line 361
    move-result-object v14

    .line 362
    if-eqz v14, :cond_a

    .line 363
    .line 364
    invoke-virtual {v14}, Landroidx/compose/ui/text/TextLinkStyles;->getFocusedStyle()Landroidx/compose/ui/text/SpanStyle;

    .line 365
    .line 366
    .line 367
    move-result-object v14

    .line 368
    move-object/from16 v21, v14

    .line 369
    .line 370
    goto :goto_5

    .line 371
    :cond_a
    move-object/from16 v21, v5

    .line 372
    .line 373
    :goto_5
    invoke-virtual {v11}, Landroidx/compose/ui/text/AnnotatedString$Range;->getItem()Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v14

    .line 377
    check-cast v14, Landroidx/compose/ui/text/LinkAnnotation;

    .line 378
    .line 379
    invoke-virtual {v14}, Landroidx/compose/ui/text/LinkAnnotation;->getStyles()Landroidx/compose/ui/text/TextLinkStyles;

    .line 380
    .line 381
    .line 382
    move-result-object v14

    .line 383
    if-eqz v14, :cond_b

    .line 384
    .line 385
    invoke-virtual {v14}, Landroidx/compose/ui/text/TextLinkStyles;->getHoveredStyle()Landroidx/compose/ui/text/SpanStyle;

    .line 386
    .line 387
    .line 388
    move-result-object v14

    .line 389
    move-object/from16 v22, v14

    .line 390
    .line 391
    goto :goto_6

    .line 392
    :cond_b
    move-object/from16 v22, v5

    .line 393
    .line 394
    :goto_6
    invoke-virtual {v11}, Landroidx/compose/ui/text/AnnotatedString$Range;->getItem()Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v14

    .line 398
    check-cast v14, Landroidx/compose/ui/text/LinkAnnotation;

    .line 399
    .line 400
    invoke-virtual {v14}, Landroidx/compose/ui/text/LinkAnnotation;->getStyles()Landroidx/compose/ui/text/TextLinkStyles;

    .line 401
    .line 402
    .line 403
    move-result-object v14

    .line 404
    if-eqz v14, :cond_c

    .line 405
    .line 406
    invoke-virtual {v14}, Landroidx/compose/ui/text/TextLinkStyles;->getPressedStyle()Landroidx/compose/ui/text/SpanStyle;

    .line 407
    .line 408
    .line 409
    move-result-object v5

    .line 410
    :cond_c
    move-object/from16 v23, v5

    .line 411
    .line 412
    filled-new-array/range {v17 .. v23}, [Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v5

    .line 416
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 417
    .line 418
    .line 419
    move-result v14

    .line 420
    invoke-interface {v3, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    move-result v15

    .line 424
    or-int/2addr v14, v15

    .line 425
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v15

    .line 429
    if-nez v14, :cond_d

    .line 430
    .line 431
    invoke-virtual {v13}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v13

    .line 435
    if-ne v15, v13, :cond_e

    .line 436
    .line 437
    :cond_d
    new-instance v15, Landroidx/compose/foundation/text/TextLinkScope$LinksComposables$1$4$1;

    .line 438
    .line 439
    invoke-direct {v15, v0, v11, v12}, Landroidx/compose/foundation/text/TextLinkScope$LinksComposables$1$4$1;-><init>(Landroidx/compose/foundation/text/TextLinkScope;Landroidx/compose/ui/text/AnnotatedString$Range;Landroidx/compose/foundation/text/LinkStateInteractionSourceObserver;)V

    .line 440
    .line 441
    .line 442
    invoke-interface {v3, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 443
    .line 444
    .line 445
    :cond_e
    check-cast v15, Lhd/l;

    .line 446
    .line 447
    shl-int/lit8 v7, v4, 0x6

    .line 448
    .line 449
    and-int/lit16 v7, v7, 0x380

    .line 450
    .line 451
    invoke-direct {v0, v5, v15, v3, v7}, Landroidx/compose/foundation/text/TextLinkScope;->StyleAnnotation([Ljava/lang/Object;Lhd/l;Landroidx/compose/runtime/Composer;I)V

    .line 452
    .line 453
    .line 454
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 455
    .line 456
    .line 457
    goto :goto_7

    .line 458
    :cond_f
    const v5, 0x52c9580e

    .line 459
    .line 460
    .line 461
    invoke-interface {v3, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 462
    .line 463
    .line 464
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 465
    .line 466
    .line 467
    :goto_7
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 468
    .line 469
    .line 470
    goto :goto_8

    .line 471
    :cond_10
    const v5, 0x52c98e4e

    .line 472
    .line 473
    .line 474
    invoke-interface {v3, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 475
    .line 476
    .line 477
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 478
    .line 479
    .line 480
    :goto_8
    add-int/lit8 v10, v10, 0x1

    .line 481
    .line 482
    const/4 v5, 0x2

    .line 483
    const/4 v7, 0x1

    .line 484
    goto/16 :goto_3

    .line 485
    .line 486
    :cond_11
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 487
    .line 488
    .line 489
    move-result v2

    .line 490
    if-eqz v2, :cond_13

    .line 491
    .line 492
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 493
    .line 494
    .line 495
    goto :goto_9

    .line 496
    :cond_12
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 497
    .line 498
    .line 499
    :cond_13
    :goto_9
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 500
    .line 501
    .line 502
    move-result-object v2

    .line 503
    if-eqz v2, :cond_14

    .line 504
    .line 505
    new-instance v3, Landroidx/compose/foundation/text/TextLinkScope$LinksComposables$2;

    .line 506
    .line 507
    invoke-direct {v3, v0, v1}, Landroidx/compose/foundation/text/TextLinkScope$LinksComposables$2;-><init>(Landroidx/compose/foundation/text/TextLinkScope;I)V

    .line 508
    .line 509
    .line 510
    invoke-interface {v2, v3}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lhd/p;)V

    .line 511
    .line 512
    .line 513
    :cond_14
    return-void
.end method

.method public final applyAnnotators$foundation_release()Landroidx/compose/ui/text/AnnotatedString;
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/TextLinkScope;->annotators:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/compose/foundation/text/TextLinkScope;->text:Landroidx/compose/ui/text/AnnotatedString;

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    new-instance v0, Landroidx/compose/foundation/text/TextAnnotatorScope;

    .line 13
    .line 14
    iget-object v1, p0, Landroidx/compose/foundation/text/TextLinkScope;->text:Landroidx/compose/ui/text/AnnotatedString;

    .line 15
    .line 16
    invoke-direct {v0, v1}, Landroidx/compose/foundation/text/TextAnnotatorScope;-><init>(Landroidx/compose/ui/text/AnnotatedString;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Landroidx/compose/foundation/text/TextLinkScope;->annotators:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v3, 0x0

    .line 26
    :goto_0
    if-ge v3, v2, :cond_1

    .line 27
    .line 28
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    check-cast v4, Lhd/l;

    .line 33
    .line 34
    invoke-interface {v4, v0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    add-int/lit8 v3, v3, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {v0}, Landroidx/compose/foundation/text/TextAnnotatorScope;->getStyledText()Landroidx/compose/ui/text/AnnotatedString;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :goto_1
    iput-object v0, p0, Landroidx/compose/foundation/text/TextLinkScope;->text:Landroidx/compose/ui/text/AnnotatedString;

    .line 45
    .line 46
    return-object v0
.end method

.method public final getInitialText$foundation_release()Landroidx/compose/ui/text/AnnotatedString;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/TextLinkScope;->initialText:Landroidx/compose/ui/text/AnnotatedString;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getShouldMeasureLinks()Lhd/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/a;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/foundation/text/TextLinkScope$shouldMeasureLinks$1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroidx/compose/foundation/text/TextLinkScope$shouldMeasureLinks$1;-><init>(Landroidx/compose/foundation/text/TextLinkScope;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final getText$foundation_release()Landroidx/compose/ui/text/AnnotatedString;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/TextLinkScope;->text:Landroidx/compose/ui/text/AnnotatedString;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTextLayoutResult()Landroidx/compose/ui/text/TextLayoutResult;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/TextLinkScope;->textLayoutResult$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/compose/ui/text/TextLayoutResult;

    .line 8
    .line 9
    return-object v0
.end method

.method public final setText$foundation_release(Landroidx/compose/ui/text/AnnotatedString;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/text/TextLinkScope;->text:Landroidx/compose/ui/text/AnnotatedString;

    .line 2
    .line 3
    return-void
.end method

.method public final setTextLayoutResult(Landroidx/compose/ui/text/TextLayoutResult;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/TextLinkScope;->textLayoutResult$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
