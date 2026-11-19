.class final Landroidx/paging/SeparatorState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/paging/SeparatorState$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        "T::TR;>",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private endTerminalSeparatorDeferred:Z

.field private footerAdded:Z

.field private final generator:Lhd/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/q;"
        }
    .end annotation
.end field

.field private headerAdded:Z

.field private mediatorStates:Landroidx/paging/LoadStates;

.field private final pageStash:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/paging/TransformablePage<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field private placeholdersAfter:I

.field private placeholdersBefore:I

.field private final sourceStates:Landroidx/paging/MutableLoadStateCollection;

.field private startTerminalSeparatorDeferred:Z

.field private final terminalSeparatorType:Landroidx/paging/TerminalSeparatorType;


# direct methods
.method public constructor <init>(Landroidx/paging/TerminalSeparatorType;Lhd/q;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/TerminalSeparatorType;",
            "Lhd/q;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "terminalSeparatorType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "generator"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Landroidx/paging/SeparatorState;->terminalSeparatorType:Landroidx/paging/TerminalSeparatorType;

    .line 15
    .line 16
    iput-object p2, p0, Landroidx/paging/SeparatorState;->generator:Lhd/q;

    .line 17
    .line 18
    new-instance p1, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Landroidx/paging/SeparatorState;->pageStash:Ljava/util/List;

    .line 24
    .line 25
    new-instance p1, Landroidx/paging/MutableLoadStateCollection;

    .line 26
    .line 27
    invoke-direct {p1}, Landroidx/paging/MutableLoadStateCollection;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Landroidx/paging/SeparatorState;->sourceStates:Landroidx/paging/MutableLoadStateCollection;

    .line 31
    .line 32
    return-void
.end method

.method public static synthetic a(Lnd/j;Landroidx/paging/TransformablePage;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/paging/SeparatorState;->onDrop$lambda$0(Lnd/j;Landroidx/paging/TransformablePage;)Z

    move-result p0

    return p0
.end method

.method private static final onDrop$lambda$0(Lnd/j;Landroidx/paging/TransformablePage;)Z
    .locals 4

    .line 1
    const-string v0, "stash"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/paging/TransformablePage;->getOriginalPageOffsets()[I

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    array-length v0, p1

    .line 11
    const/4 v1, 0x0

    .line 12
    move v2, v1

    .line 13
    :goto_0
    if-ge v2, v0, :cond_1

    .line 14
    .line 15
    aget v3, p1, v2

    .line 16
    .line 17
    invoke-virtual {p0, v3}, Lnd/j;->g(I)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    return v1
.end method

.method private final transformablePageToStash(Landroidx/paging/TransformablePage;)Landroidx/paging/TransformablePage;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/paging/TransformablePage<",
            "TT;>;)",
            "Landroidx/paging/TransformablePage<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/paging/TransformablePage;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/paging/TransformablePage;->getOriginalPageOffsets()[I

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p1}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-static {v2}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {p1}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-static {v3}, Lrc/g0;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    filled-new-array {v2, v3}, [Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-static {v2}, Lrc/w;->q([Ljava/lang/Object;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {p1}, Landroidx/paging/TransformablePage;->getHintOriginalPageOffset()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    invoke-virtual {p1}, Landroidx/paging/TransformablePage;->getHintOriginalIndices()Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    if-eqz v4, :cond_0

    .line 40
    .line 41
    invoke-static {v4}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    check-cast v4, Ljava/lang/Number;

    .line 46
    .line 47
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    const/4 v4, 0x0

    .line 53
    :goto_0
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-virtual {p1}, Landroidx/paging/TransformablePage;->getHintOriginalIndices()Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    if-eqz v5, :cond_1

    .line 62
    .line 63
    invoke-static {v5}, Lrc/g0;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    check-cast p1, Ljava/lang/Number;

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    goto :goto_1

    .line 74
    :cond_1
    invoke-virtual {p1}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-static {p1}, Lrc/w;->p(Ljava/util/List;)I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    :goto_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    filled-new-array {v4, p1}, [Ljava/lang/Integer;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-static {p1}, Lrc/w;->q([Ljava/lang/Object;)Ljava/util/List;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-direct {v0, v1, v2, v3, p1}, Landroidx/paging/TransformablePage;-><init>([ILjava/util/List;ILjava/util/List;)V

    .line 95
    .line 96
    .line 97
    return-object v0
.end method


# virtual methods
.method public final asRType(Landroidx/paging/PageEvent$Insert;)Landroidx/paging/PageEvent$Insert;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PageEvent$Insert<",
            "TT;>;)",
            "Landroidx/paging/PageEvent$Insert<",
            "TR;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final getEndTerminalSeparatorDeferred()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/paging/SeparatorState;->endTerminalSeparatorDeferred:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getFooterAdded()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/paging/SeparatorState;->footerAdded:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getGenerator()Lhd/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/q;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/SeparatorState;->generator:Lhd/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getHeaderAdded()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/paging/SeparatorState;->headerAdded:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getMediatorStates()Landroidx/paging/LoadStates;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/SeparatorState;->mediatorStates:Landroidx/paging/LoadStates;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPageStash()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/paging/TransformablePage<",
            "TT;>;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/SeparatorState;->pageStash:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPlaceholdersAfter()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/paging/SeparatorState;->placeholdersAfter:I

    .line 2
    .line 3
    return v0
.end method

.method public final getPlaceholdersBefore()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/paging/SeparatorState;->placeholdersBefore:I

    .line 2
    .line 3
    return v0
.end method

.method public final getSourceStates()Landroidx/paging/MutableLoadStateCollection;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/SeparatorState;->sourceStates:Landroidx/paging/MutableLoadStateCollection;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getStartTerminalSeparatorDeferred()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/paging/SeparatorState;->startTerminalSeparatorDeferred:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getTerminalSeparatorType()Landroidx/paging/TerminalSeparatorType;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/SeparatorState;->terminalSeparatorType:Landroidx/paging/TerminalSeparatorType;

    .line 2
    .line 3
    return-object v0
.end method

.method public final onDrop(Landroidx/paging/PageEvent$Drop;)Landroidx/paging/PageEvent$Drop;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PageEvent$Drop<",
            "TT;>;)",
            "Landroidx/paging/PageEvent$Drop<",
            "TR;>;"
        }
    .end annotation

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/paging/SeparatorState;->sourceStates:Landroidx/paging/MutableLoadStateCollection;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Drop;->getLoadType()Landroidx/paging/LoadType;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    sget-object v2, Landroidx/paging/LoadState$NotLoading;->Companion:Landroidx/paging/LoadState$NotLoading$Companion;

    .line 13
    .line 14
    invoke-virtual {v2}, Landroidx/paging/LoadState$NotLoading$Companion;->getIncomplete$paging_common()Landroidx/paging/LoadState$NotLoading;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v0, v1, v2}, Landroidx/paging/MutableLoadStateCollection;->set(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Drop;->getLoadType()Landroidx/paging/LoadType;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sget-object v1, Landroidx/paging/LoadType;->PREPEND:Landroidx/paging/LoadType;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    if-ne v0, v1, :cond_0

    .line 29
    .line 30
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Drop;->getPlaceholdersRemaining()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iput v0, p0, Landroidx/paging/SeparatorState;->placeholdersBefore:I

    .line 35
    .line 36
    iput-boolean v2, p0, Landroidx/paging/SeparatorState;->headerAdded:Z

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Drop;->getLoadType()Landroidx/paging/LoadType;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sget-object v3, Landroidx/paging/LoadType;->APPEND:Landroidx/paging/LoadType;

    .line 44
    .line 45
    if-ne v0, v3, :cond_1

    .line 46
    .line 47
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Drop;->getPlaceholdersRemaining()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    iput v0, p0, Landroidx/paging/SeparatorState;->placeholdersAfter:I

    .line 52
    .line 53
    iput-boolean v2, p0, Landroidx/paging/SeparatorState;->footerAdded:Z

    .line 54
    .line 55
    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/paging/SeparatorState;->pageStash:Ljava/util/List;

    .line 56
    .line 57
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_3

    .line 62
    .line 63
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Drop;->getLoadType()Landroidx/paging/LoadType;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    if-ne v0, v1, :cond_2

    .line 68
    .line 69
    iput-boolean v2, p0, Landroidx/paging/SeparatorState;->startTerminalSeparatorDeferred:Z

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    iput-boolean v2, p0, Landroidx/paging/SeparatorState;->endTerminalSeparatorDeferred:Z

    .line 73
    .line 74
    :cond_3
    :goto_1
    new-instance v0, Lnd/j;

    .line 75
    .line 76
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Drop;->getMinPageOffset()I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Drop;->getMaxPageOffset()I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    invoke-direct {v0, v1, v2}, Lnd/j;-><init>(II)V

    .line 85
    .line 86
    .line 87
    iget-object v1, p0, Landroidx/paging/SeparatorState;->pageStash:Ljava/util/List;

    .line 88
    .line 89
    new-instance v2, Landroidx/paging/o1;

    .line 90
    .line 91
    invoke-direct {v2, v0}, Landroidx/paging/o1;-><init>(Lnd/j;)V

    .line 92
    .line 93
    .line 94
    invoke-static {v1, v2}, Lrc/b0;->L(Ljava/util/List;Lhd/l;)Z

    .line 95
    .line 96
    .line 97
    return-object p1
.end method

.method public final onEvent(Landroidx/paging/PageEvent;Lvc/c;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PageEvent<",
            "TT;>;",
            "Lvc/c<",
            "-",
            "Landroidx/paging/PageEvent<",
            "TR;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Landroidx/paging/SeparatorState$onEvent$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Landroidx/paging/SeparatorState$onEvent$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/paging/SeparatorState$onEvent$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/paging/SeparatorState$onEvent$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/paging/SeparatorState$onEvent$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Landroidx/paging/SeparatorState$onEvent$1;-><init>(Landroidx/paging/SeparatorState;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Landroidx/paging/SeparatorState$onEvent$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/paging/SeparatorState$onEvent$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x3

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v2, :cond_4

    .line 37
    .line 38
    if-eq v2, v5, :cond_3

    .line 39
    .line 40
    if-eq v2, v4, :cond_2

    .line 41
    .line 42
    if-ne v2, v3, :cond_1

    .line 43
    .line 44
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_4

    .line 48
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_4
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    instance-of p2, p1, Landroidx/paging/PageEvent$Insert;

    .line 68
    .line 69
    if-eqz p2, :cond_6

    .line 70
    .line 71
    check-cast p1, Landroidx/paging/PageEvent$Insert;

    .line 72
    .line 73
    iput v5, v0, Landroidx/paging/SeparatorState$onEvent$1;->label:I

    .line 74
    .line 75
    invoke-virtual {p0, p1, v0}, Landroidx/paging/SeparatorState;->onInsert(Landroidx/paging/PageEvent$Insert;Lvc/c;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    if-ne p2, v1, :cond_5

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_5
    :goto_1
    check-cast p2, Landroidx/paging/PageEvent;

    .line 83
    .line 84
    goto :goto_5

    .line 85
    :cond_6
    instance-of p2, p1, Landroidx/paging/PageEvent$Drop;

    .line 86
    .line 87
    if-eqz p2, :cond_7

    .line 88
    .line 89
    check-cast p1, Landroidx/paging/PageEvent$Drop;

    .line 90
    .line 91
    invoke-virtual {p0, p1}, Landroidx/paging/SeparatorState;->onDrop(Landroidx/paging/PageEvent$Drop;)Landroidx/paging/PageEvent$Drop;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    goto :goto_5

    .line 96
    :cond_7
    instance-of p2, p1, Landroidx/paging/PageEvent$LoadStateUpdate;

    .line 97
    .line 98
    if-eqz p2, :cond_9

    .line 99
    .line 100
    check-cast p1, Landroidx/paging/PageEvent$LoadStateUpdate;

    .line 101
    .line 102
    iput v4, v0, Landroidx/paging/SeparatorState$onEvent$1;->label:I

    .line 103
    .line 104
    invoke-virtual {p0, p1, v0}, Landroidx/paging/SeparatorState;->onLoadStateUpdate(Landroidx/paging/PageEvent$LoadStateUpdate;Lvc/c;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    if-ne p2, v1, :cond_8

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_8
    :goto_2
    check-cast p2, Landroidx/paging/PageEvent;

    .line 112
    .line 113
    goto :goto_5

    .line 114
    :cond_9
    instance-of p2, p1, Landroidx/paging/PageEvent$StaticList;

    .line 115
    .line 116
    if-eqz p2, :cond_f

    .line 117
    .line 118
    check-cast p1, Landroidx/paging/PageEvent$StaticList;

    .line 119
    .line 120
    iput v3, v0, Landroidx/paging/SeparatorState$onEvent$1;->label:I

    .line 121
    .line 122
    invoke-virtual {p0, p1, v0}, Landroidx/paging/SeparatorState;->onStaticList(Landroidx/paging/PageEvent$StaticList;Lvc/c;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    if-ne p2, v1, :cond_a

    .line 127
    .line 128
    :goto_3
    return-object v1

    .line 129
    :cond_a
    :goto_4
    check-cast p2, Landroidx/paging/PageEvent;

    .line 130
    .line 131
    :goto_5
    iget-boolean p1, p0, Landroidx/paging/SeparatorState;->endTerminalSeparatorDeferred:Z

    .line 132
    .line 133
    if-eqz p1, :cond_c

    .line 134
    .line 135
    iget-object p1, p0, Landroidx/paging/SeparatorState;->pageStash:Ljava/util/List;

    .line 136
    .line 137
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    if-eqz p1, :cond_b

    .line 142
    .line 143
    goto :goto_6

    .line 144
    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 145
    .line 146
    const-string p2, "deferred endTerm, page stash should be empty"

    .line 147
    .line 148
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    throw p1

    .line 152
    :cond_c
    :goto_6
    iget-boolean p1, p0, Landroidx/paging/SeparatorState;->startTerminalSeparatorDeferred:Z

    .line 153
    .line 154
    if-eqz p1, :cond_e

    .line 155
    .line 156
    iget-object p1, p0, Landroidx/paging/SeparatorState;->pageStash:Ljava/util/List;

    .line 157
    .line 158
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    if-eqz p1, :cond_d

    .line 163
    .line 164
    goto :goto_7

    .line 165
    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 166
    .line 167
    const-string p2, "deferred startTerm, page stash should be empty"

    .line 168
    .line 169
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    throw p1

    .line 173
    :cond_e
    :goto_7
    return-object p2

    .line 174
    :cond_f
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 175
    .line 176
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 177
    .line 178
    .line 179
    throw p1
.end method

.method public final onInsert(Landroidx/paging/PageEvent$Insert;Lvc/c;)Ljava/lang/Object;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PageEvent$Insert<",
            "TT;>;",
            "Lvc/c<",
            "-",
            "Landroidx/paging/PageEvent$Insert<",
            "TR;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    instance-of v3, v2, Landroidx/paging/SeparatorState$onInsert$1;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Landroidx/paging/SeparatorState$onInsert$1;

    iget v4, v3, Landroidx/paging/SeparatorState$onInsert$1;->label:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Landroidx/paging/SeparatorState$onInsert$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Landroidx/paging/SeparatorState$onInsert$1;

    invoke-direct {v3, v0, v2}, Landroidx/paging/SeparatorState$onInsert$1;-><init>(Landroidx/paging/SeparatorState;Lvc/c;)V

    :goto_0
    iget-object v2, v3, Landroidx/paging/SeparatorState$onInsert$1;->result:Ljava/lang/Object;

    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    move-result-object v4

    .line 1
    iget v5, v3, Landroidx/paging/SeparatorState$onInsert$1;->label:I

    packed-switch v5, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    iget-object v1, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$4:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v4, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$3:Ljava/lang/Object;

    check-cast v4, Landroidx/paging/TransformablePage;

    iget-object v5, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$2:Ljava/lang/Object;

    check-cast v5, Ljava/util/ArrayList;

    iget-object v7, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$1:Ljava/lang/Object;

    check-cast v7, Ljava/util/ArrayList;

    iget-object v3, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$0:Ljava/lang/Object;

    check-cast v3, Landroidx/paging/PageEvent$Insert;

    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object v6, v1

    move-object v8, v4

    move-object v1, v7

    :goto_1
    move-object v7, v2

    goto/16 :goto_28

    :pswitch_1
    iget v1, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$2:I

    iget v5, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$1:I

    iget v9, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$0:I

    iget-boolean v10, v3, Landroidx/paging/SeparatorState$onInsert$1;->Z$0:Z

    iget-object v11, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$4:Ljava/lang/Object;

    check-cast v11, Ljava/util/ArrayList;

    iget-object v12, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$3:Ljava/lang/Object;

    check-cast v12, Landroidx/paging/TransformablePage;

    iget-object v13, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$2:Ljava/lang/Object;

    check-cast v13, Ljava/util/ArrayList;

    iget-object v14, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$1:Ljava/lang/Object;

    check-cast v14, Ljava/util/ArrayList;

    iget-object v15, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$0:Ljava/lang/Object;

    check-cast v15, Landroidx/paging/PageEvent$Insert;

    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    goto/16 :goto_23

    :pswitch_2
    iget v1, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$0:I

    iget-boolean v5, v3, Landroidx/paging/SeparatorState$onInsert$1;->Z$0:Z

    iget-object v9, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$5:Ljava/lang/Object;

    check-cast v9, Landroidx/paging/TransformablePage;

    iget-object v10, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$4:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Integer;

    iget-object v11, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$3:Ljava/lang/Object;

    check-cast v11, Landroidx/paging/TransformablePage;

    iget-object v12, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$2:Ljava/lang/Object;

    check-cast v12, Ljava/util/ArrayList;

    iget-object v13, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$1:Ljava/lang/Object;

    check-cast v13, Ljava/util/ArrayList;

    iget-object v14, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$0:Ljava/lang/Object;

    check-cast v14, Landroidx/paging/PageEvent$Insert;

    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    :cond_1
    move-object v6, v2

    move v2, v5

    move-object v8, v9

    move-object v7, v11

    move-object v5, v13

    move-object v11, v10

    goto/16 :goto_1e

    :pswitch_3
    iget v1, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$0:I

    iget-boolean v5, v3, Landroidx/paging/SeparatorState$onInsert$1;->Z$0:Z

    iget-object v9, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$8:Ljava/lang/Object;

    check-cast v9, Ljava/util/ArrayList;

    iget-object v10, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$7:Ljava/lang/Object;

    check-cast v10, Landroidx/paging/TransformablePage;

    iget-object v11, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$6:Ljava/lang/Object;

    check-cast v11, Landroidx/paging/TransformablePage;

    iget-object v12, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$5:Ljava/lang/Object;

    check-cast v12, Ljava/util/Iterator;

    iget-object v13, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$4:Ljava/lang/Object;

    check-cast v13, Ljava/lang/Integer;

    iget-object v14, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$3:Ljava/lang/Object;

    check-cast v14, Landroidx/paging/TransformablePage;

    iget-object v15, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$2:Ljava/lang/Object;

    check-cast v15, Ljava/util/ArrayList;

    iget-object v6, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$1:Ljava/lang/Object;

    check-cast v6, Ljava/util/ArrayList;

    iget-object v8, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$0:Ljava/lang/Object;

    check-cast v8, Landroidx/paging/PageEvent$Insert;

    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    goto/16 :goto_1d

    :pswitch_4
    iget v1, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$0:I

    iget-boolean v5, v3, Landroidx/paging/SeparatorState$onInsert$1;->Z$0:Z

    iget-object v6, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$7:Ljava/lang/Object;

    check-cast v6, Landroidx/paging/TransformablePage;

    iget-object v8, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$6:Ljava/lang/Object;

    check-cast v8, Landroidx/paging/TransformablePage;

    iget-object v9, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$5:Ljava/lang/Object;

    check-cast v9, Ljava/util/Iterator;

    iget-object v10, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$4:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Integer;

    iget-object v11, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$3:Ljava/lang/Object;

    check-cast v11, Landroidx/paging/TransformablePage;

    iget-object v12, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$2:Ljava/lang/Object;

    check-cast v12, Ljava/util/ArrayList;

    iget-object v13, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$1:Ljava/lang/Object;

    check-cast v13, Ljava/util/ArrayList;

    iget-object v14, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$0:Ljava/lang/Object;

    check-cast v14, Landroidx/paging/PageEvent$Insert;

    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object v7, v6

    move-object v15, v14

    move-object v6, v2

    move v2, v5

    move-object v14, v12

    move-object v5, v13

    move-object v12, v10

    move-object v13, v11

    move-object v11, v9

    goto/16 :goto_17

    :pswitch_5
    iget v1, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$0:I

    iget-boolean v5, v3, Landroidx/paging/SeparatorState$onInsert$1;->Z$0:Z

    iget-object v6, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$6:Ljava/lang/Object;

    check-cast v6, Ljava/util/ArrayList;

    iget-object v8, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$5:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Integer;

    iget-object v9, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$4:Ljava/lang/Object;

    check-cast v9, Landroidx/paging/TransformablePage;

    iget-object v10, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$3:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Integer;

    iget-object v11, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$2:Ljava/lang/Object;

    check-cast v11, Ljava/util/ArrayList;

    iget-object v12, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$1:Ljava/lang/Object;

    check-cast v12, Ljava/util/ArrayList;

    iget-object v13, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$0:Ljava/lang/Object;

    check-cast v13, Landroidx/paging/PageEvent$Insert;

    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    goto/16 :goto_15

    :pswitch_6
    iget v1, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$0:I

    iget-boolean v5, v3, Landroidx/paging/SeparatorState$onInsert$1;->Z$0:Z

    iget-object v6, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$7:Ljava/lang/Object;

    check-cast v6, Landroidx/paging/TransformablePage;

    iget-object v8, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$6:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Integer;

    iget-object v9, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$5:Ljava/lang/Object;

    check-cast v9, Landroidx/paging/TransformablePage;

    iget-object v10, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$4:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Integer;

    iget-object v11, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$3:Ljava/lang/Object;

    check-cast v11, Landroidx/paging/TransformablePage;

    iget-object v12, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$2:Ljava/lang/Object;

    check-cast v12, Ljava/util/ArrayList;

    iget-object v13, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$1:Ljava/lang/Object;

    check-cast v13, Ljava/util/ArrayList;

    iget-object v14, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$0:Ljava/lang/Object;

    check-cast v14, Landroidx/paging/PageEvent$Insert;

    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object v7, v6

    move-object v15, v8

    move-object v6, v2

    move v2, v5

    move-object v8, v11

    move-object v11, v9

    move-object v5, v13

    :goto_2
    move-object v13, v12

    move-object v12, v10

    goto/16 :goto_11

    :pswitch_7
    iget v1, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$2:I

    iget v5, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$1:I

    iget v6, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$0:I

    iget-boolean v8, v3, Landroidx/paging/SeparatorState$onInsert$1;->Z$0:Z

    iget-object v9, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$7:Ljava/lang/Object;

    check-cast v9, Ljava/util/ArrayList;

    iget-object v10, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$6:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Integer;

    iget-object v11, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$5:Ljava/lang/Object;

    check-cast v11, Landroidx/paging/TransformablePage;

    iget-object v12, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$4:Ljava/lang/Object;

    check-cast v12, Ljava/lang/Integer;

    iget-object v13, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$3:Ljava/lang/Object;

    check-cast v13, Landroidx/paging/TransformablePage;

    iget-object v14, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$2:Ljava/lang/Object;

    check-cast v14, Ljava/util/ArrayList;

    iget-object v15, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$1:Ljava/lang/Object;

    check-cast v15, Ljava/util/ArrayList;

    iget-object v7, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$0:Ljava/lang/Object;

    check-cast v7, Landroidx/paging/PageEvent$Insert;

    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object/from16 v18, v10

    move-object v10, v12

    move-object v12, v14

    move-object v14, v7

    goto/16 :goto_10

    :pswitch_8
    iget v1, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$0:I

    iget-boolean v5, v3, Landroidx/paging/SeparatorState$onInsert$1;->Z$0:Z

    iget-object v6, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$8:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    iget-object v7, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$7:Ljava/lang/Object;

    check-cast v7, Landroidx/paging/TransformablePage;

    iget-object v8, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$6:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Integer;

    iget-object v9, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$5:Ljava/lang/Object;

    check-cast v9, Landroidx/paging/TransformablePage;

    iget-object v10, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$4:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Integer;

    iget-object v11, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$3:Ljava/lang/Object;

    check-cast v11, Landroidx/paging/TransformablePage;

    iget-object v12, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$2:Ljava/lang/Object;

    check-cast v12, Ljava/util/ArrayList;

    iget-object v13, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$1:Ljava/lang/Object;

    check-cast v13, Ljava/util/ArrayList;

    iget-object v14, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$0:Ljava/lang/Object;

    check-cast v14, Landroidx/paging/PageEvent$Insert;

    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object v15, v6

    move-object v6, v2

    move v2, v5

    move-object v5, v15

    move-object v15, v11

    move-object/from16 v18, v12

    move-object/from16 v19, v13

    move-object v11, v8

    move-object v12, v9

    move-object v13, v10

    move-object v8, v7

    goto/16 :goto_c

    :pswitch_9
    iget-object v1, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$0:Ljava/lang/Object;

    check-cast v1, Landroidx/paging/PageEvent$Insert;

    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    const/4 v5, 0x1

    :cond_2
    const/4 v3, 0x0

    goto/16 :goto_6

    :pswitch_a
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 2
    iget-object v2, v0, Landroidx/paging/SeparatorState;->terminalSeparatorType:Landroidx/paging/TerminalSeparatorType;

    invoke-virtual {v0, v1, v2}, Landroidx/paging/SeparatorState;->terminatesStart(Landroidx/paging/PageEvent$Insert;Landroidx/paging/TerminalSeparatorType;)Z

    move-result v2

    .line 3
    iget-object v5, v0, Landroidx/paging/SeparatorState;->terminalSeparatorType:Landroidx/paging/TerminalSeparatorType;

    invoke-virtual {v0, v1, v5}, Landroidx/paging/SeparatorState;->terminatesEnd(Landroidx/paging/PageEvent$Insert;Landroidx/paging/TerminalSeparatorType;)Z

    move-result v5

    .line 4
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getPages()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    .line 5
    instance-of v7, v6, Ljava/util/Collection;

    if-eqz v7, :cond_4

    move-object v7, v6

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_4

    :cond_3
    const/4 v6, 0x1

    goto :goto_3

    .line 6
    :cond_4
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/paging/TransformablePage;

    .line 7
    invoke-virtual {v7}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_5

    const/4 v6, 0x0

    .line 8
    :goto_3
    iget-boolean v7, v0, Landroidx/paging/SeparatorState;->headerAdded:Z

    if-eqz v7, :cond_7

    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getLoadType()Landroidx/paging/LoadType;

    move-result-object v7

    sget-object v8, Landroidx/paging/LoadType;->PREPEND:Landroidx/paging/LoadType;

    if-ne v7, v8, :cond_7

    if-eqz v6, :cond_6

    goto :goto_4

    :cond_6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Additional prepend event after prepend state is done"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 9
    :cond_7
    :goto_4
    iget-boolean v7, v0, Landroidx/paging/SeparatorState;->footerAdded:Z

    if-eqz v7, :cond_9

    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getLoadType()Landroidx/paging/LoadType;

    move-result-object v7

    sget-object v8, Landroidx/paging/LoadType;->APPEND:Landroidx/paging/LoadType;

    if-ne v7, v8, :cond_9

    if-eqz v6, :cond_8

    goto :goto_5

    :cond_8
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Additional append event after append state is done"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 10
    :cond_9
    :goto_5
    iget-object v7, v0, Landroidx/paging/SeparatorState;->sourceStates:Landroidx/paging/MutableLoadStateCollection;

    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getSourceLoadStates()Landroidx/paging/LoadStates;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroidx/paging/MutableLoadStateCollection;->set(Landroidx/paging/LoadStates;)V

    .line 11
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getMediatorLoadStates()Landroidx/paging/LoadStates;

    move-result-object v7

    iput-object v7, v0, Landroidx/paging/SeparatorState;->mediatorStates:Landroidx/paging/LoadStates;

    .line 12
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getLoadType()Landroidx/paging/LoadType;

    move-result-object v7

    sget-object v8, Landroidx/paging/LoadType;->APPEND:Landroidx/paging/LoadType;

    if-eq v7, v8, :cond_a

    .line 13
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getPlaceholdersBefore()I

    move-result v7

    iput v7, v0, Landroidx/paging/SeparatorState;->placeholdersBefore:I

    .line 14
    :cond_a
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getLoadType()Landroidx/paging/LoadType;

    move-result-object v7

    sget-object v8, Landroidx/paging/LoadType;->PREPEND:Landroidx/paging/LoadType;

    if-eq v7, v8, :cond_b

    .line 15
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getPlaceholdersAfter()I

    move-result v7

    iput v7, v0, Landroidx/paging/SeparatorState;->placeholdersAfter:I

    :cond_b
    if-eqz v6, :cond_12

    if-nez v2, :cond_c

    if-nez v5, :cond_c

    .line 16
    invoke-virtual/range {p0 .. p1}, Landroidx/paging/SeparatorState;->asRType(Landroidx/paging/PageEvent$Insert;)Landroidx/paging/PageEvent$Insert;

    move-result-object v1

    return-object v1

    .line 17
    :cond_c
    iget-boolean v7, v0, Landroidx/paging/SeparatorState;->headerAdded:Z

    if-eqz v7, :cond_d

    iget-boolean v7, v0, Landroidx/paging/SeparatorState;->footerAdded:Z

    if-eqz v7, :cond_d

    .line 18
    invoke-virtual/range {p0 .. p1}, Landroidx/paging/SeparatorState;->asRType(Landroidx/paging/PageEvent$Insert;)Landroidx/paging/PageEvent$Insert;

    move-result-object v1

    return-object v1

    .line 19
    :cond_d
    iget-object v7, v0, Landroidx/paging/SeparatorState;->pageStash:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_12

    if-eqz v2, :cond_f

    if-eqz v5, :cond_f

    .line 20
    iget-boolean v6, v0, Landroidx/paging/SeparatorState;->headerAdded:Z

    if-nez v6, :cond_f

    iget-boolean v6, v0, Landroidx/paging/SeparatorState;->footerAdded:Z

    if-nez v6, :cond_f

    .line 21
    iget-object v2, v0, Landroidx/paging/SeparatorState;->generator:Lhd/q;

    iput-object v1, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$0:Ljava/lang/Object;

    const/4 v5, 0x1

    iput v5, v3, Landroidx/paging/SeparatorState$onInsert$1;->label:I

    const/4 v6, 0x0

    invoke-interface {v2, v6, v6, v3}, Lhd/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_2

    goto/16 :goto_27

    .line 22
    :goto_6
    iput-boolean v3, v0, Landroidx/paging/SeparatorState;->endTerminalSeparatorDeferred:Z

    .line 23
    iput-boolean v3, v0, Landroidx/paging/SeparatorState;->startTerminalSeparatorDeferred:Z

    .line 24
    iput-boolean v5, v0, Landroidx/paging/SeparatorState;->headerAdded:Z

    .line 25
    iput-boolean v5, v0, Landroidx/paging/SeparatorState;->footerAdded:Z

    if-nez v2, :cond_e

    .line 26
    invoke-virtual {v0, v1}, Landroidx/paging/SeparatorState;->asRType(Landroidx/paging/PageEvent$Insert;)Landroidx/paging/PageEvent$Insert;

    move-result-object v1

    return-object v1

    .line 27
    :cond_e
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getLoadType()Landroidx/paging/LoadType;

    move-result-object v4

    .line 28
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getPages()Ljava/util/List;

    .line 29
    filled-new-array {v3}, [I

    move-result-object v5

    invoke-static {v2, v5, v3, v3}, Landroidx/paging/SeparatorsKt;->separatorPage(Ljava/lang/Object;[III)Landroidx/paging/TransformablePage;

    move-result-object v2

    invoke-static {v2}, Lrc/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 30
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getPlaceholdersBefore()I

    move-result v5

    .line 31
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getPlaceholdersAfter()I

    move-result v6

    .line 32
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getSourceLoadStates()Landroidx/paging/LoadStates;

    move-result-object v7

    .line 33
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getMediatorLoadStates()Landroidx/paging/LoadStates;

    move-result-object v8

    move-object v3, v4

    move-object v4, v2

    .line 34
    new-instance v2, Landroidx/paging/PageEvent$Insert;

    const/4 v9, 0x0

    invoke-direct/range {v2 .. v9}, Landroidx/paging/PageEvent$Insert;-><init>(Landroidx/paging/LoadType;Ljava/util/List;IILandroidx/paging/LoadStates;Landroidx/paging/LoadStates;Lkotlin/jvm/internal/n;)V

    return-object v2

    :cond_f
    if-eqz v5, :cond_10

    .line 35
    iget-boolean v3, v0, Landroidx/paging/SeparatorState;->footerAdded:Z

    if-nez v3, :cond_10

    const/4 v5, 0x1

    .line 36
    iput-boolean v5, v0, Landroidx/paging/SeparatorState;->endTerminalSeparatorDeferred:Z

    goto :goto_7

    :cond_10
    const/4 v5, 0x1

    :goto_7
    if-eqz v2, :cond_11

    .line 37
    iget-boolean v2, v0, Landroidx/paging/SeparatorState;->headerAdded:Z

    if-nez v2, :cond_11

    .line 38
    iput-boolean v5, v0, Landroidx/paging/SeparatorState;->startTerminalSeparatorDeferred:Z

    .line 39
    :cond_11
    invoke-virtual/range {p0 .. p1}, Landroidx/paging/SeparatorState;->asRType(Landroidx/paging/PageEvent$Insert;)Landroidx/paging/PageEvent$Insert;

    move-result-object v1

    return-object v1

    .line 40
    :cond_12
    new-instance v7, Ljava/util/ArrayList;

    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getPages()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 41
    new-instance v12, Ljava/util/ArrayList;

    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getPages()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v8

    invoke-direct {v12, v8}, Ljava/util/ArrayList;-><init>(I)V

    if-nez v6, :cond_15

    const/4 v8, 0x0

    .line 42
    :goto_8
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getPages()Ljava/util/List;

    move-result-object v9

    invoke-static {v9}, Lrc/w;->p(Ljava/util/List;)I

    move-result v9

    if-ge v8, v9, :cond_13

    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getPages()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/paging/TransformablePage;

    invoke-virtual {v9}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_13

    add-int/lit8 v8, v8, 0x1

    goto :goto_8

    .line 43
    :cond_13
    invoke-static {v8}, Lxc/a;->c(I)Ljava/lang/Integer;

    move-result-object v9

    .line 44
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getPages()Ljava/util/List;

    move-result-object v10

    invoke-interface {v10, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/paging/TransformablePage;

    .line 45
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getPages()Ljava/util/List;

    move-result-object v10

    invoke-static {v10}, Lrc/w;->p(Ljava/util/List;)I

    move-result v10

    :goto_9
    if-lez v10, :cond_14

    .line 46
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getPages()Ljava/util/List;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroidx/paging/TransformablePage;

    invoke-virtual {v11}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_14

    add-int/lit8 v10, v10, -0x1

    goto :goto_9

    .line 47
    :cond_14
    invoke-static {v10}, Lxc/a;->c(I)Ljava/lang/Integer;

    move-result-object v11

    .line 48
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getPages()Ljava/util/List;

    move-result-object v13

    invoke-interface {v13, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroidx/paging/TransformablePage;

    goto :goto_a

    :cond_15
    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_a
    if-eqz v2, :cond_19

    .line 49
    iget-boolean v2, v0, Landroidx/paging/SeparatorState;->headerAdded:Z

    if-nez v2, :cond_19

    const/4 v2, 0x1

    .line 50
    iput-boolean v2, v0, Landroidx/paging/SeparatorState;->headerAdded:Z

    if-eqz v6, :cond_16

    .line 51
    iget-object v2, v0, Landroidx/paging/SeparatorState;->pageStash:Ljava/util/List;

    invoke-static {v2}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/paging/TransformablePage;

    goto :goto_b

    :cond_16
    invoke-static {v8}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    move-object v2, v8

    .line 52
    :goto_b
    iget-object v13, v0, Landroidx/paging/SeparatorState;->generator:Lhd/q;

    invoke-virtual {v2}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    move-result-object v14

    invoke-static {v14}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v14

    iput-object v1, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$0:Ljava/lang/Object;

    iput-object v7, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$1:Ljava/lang/Object;

    iput-object v12, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$2:Ljava/lang/Object;

    iput-object v8, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$3:Ljava/lang/Object;

    iput-object v9, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$4:Ljava/lang/Object;

    iput-object v10, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$5:Ljava/lang/Object;

    iput-object v11, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$6:Ljava/lang/Object;

    iput-object v2, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$7:Ljava/lang/Object;

    iput-object v7, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$8:Ljava/lang/Object;

    iput-boolean v5, v3, Landroidx/paging/SeparatorState$onInsert$1;->Z$0:Z

    iput v6, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$0:I

    const/4 v15, 0x2

    iput v15, v3, Landroidx/paging/SeparatorState$onInsert$1;->label:I

    const/4 v15, 0x0

    invoke-interface {v13, v15, v14, v3}, Lhd/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v4, :cond_17

    goto/16 :goto_27

    :cond_17
    move-object v14, v1

    move v1, v6

    move-object/from16 v19, v7

    move-object v15, v8

    move-object/from16 v18, v12

    move-object v6, v13

    move-object v8, v2

    move v2, v5

    move-object/from16 v5, v19

    move-object v13, v9

    move-object v12, v10

    .line 53
    :goto_c
    invoke-virtual {v8}, Landroidx/paging/TransformablePage;->getHintOriginalPageOffset()I

    move-result v9

    .line 54
    invoke-virtual {v8}, Landroidx/paging/TransformablePage;->getHintOriginalIndices()Ljava/util/List;

    move-result-object v7

    if-eqz v7, :cond_18

    invoke-static {v7}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    move v10, v7

    goto :goto_d

    :cond_18
    const/4 v10, 0x0

    :goto_d
    const/4 v7, 0x0

    .line 55
    invoke-static/range {v5 .. v10}, Landroidx/paging/SeparatorsKt;->addSeparatorPage(Ljava/util/List;Ljava/lang/Object;Landroidx/paging/TransformablePage;Landroidx/paging/TransformablePage;II)V

    move v6, v1

    move v5, v2

    move-object v10, v12

    move-object v9, v13

    move-object v8, v15

    move-object/from16 v12, v18

    move-object/from16 v7, v19

    goto :goto_e

    :cond_19
    move-object v14, v1

    :goto_e
    if-nez v6, :cond_30

    .line 56
    invoke-static {v9}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v1

    move-object v2, v11

    move-object v11, v8

    move-object v8, v2

    move-object v2, v10

    move-object v10, v9

    move-object v9, v2

    move v2, v5

    move-object v13, v7

    const/4 v5, 0x0

    :goto_f
    if-ge v5, v1, :cond_1b

    .line 57
    invoke-virtual {v14}, Landroidx/paging/PageEvent$Insert;->getPages()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/paging/TransformablePage;

    iget-object v15, v0, Landroidx/paging/SeparatorState;->generator:Lhd/q;

    iput-object v14, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$0:Ljava/lang/Object;

    iput-object v13, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$1:Ljava/lang/Object;

    iput-object v12, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$2:Ljava/lang/Object;

    iput-object v11, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$3:Ljava/lang/Object;

    iput-object v10, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$4:Ljava/lang/Object;

    iput-object v9, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$5:Ljava/lang/Object;

    iput-object v8, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$6:Ljava/lang/Object;

    iput-object v13, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$7:Ljava/lang/Object;

    move-object/from16 v18, v8

    const/4 v8, 0x0

    iput-object v8, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$8:Ljava/lang/Object;

    iput-boolean v2, v3, Landroidx/paging/SeparatorState$onInsert$1;->Z$0:Z

    iput v6, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$0:I

    iput v5, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$1:I

    iput v1, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$2:I

    const/4 v8, 0x3

    iput v8, v3, Landroidx/paging/SeparatorState$onInsert$1;->label:I

    invoke-static {v7, v15, v3}, Landroidx/paging/SeparatorsKt;->insertInternalSeparators(Landroidx/paging/TransformablePage;Lhd/q;Lvc/c;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v4, :cond_1a

    goto/16 :goto_27

    :cond_1a
    move v8, v2

    move-object v2, v7

    move-object v15, v13

    move-object v13, v11

    move-object v11, v9

    move-object v9, v15

    :goto_10
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v17, 0x1

    add-int/lit8 v5, v5, 0x1

    move v2, v8

    move-object v9, v11

    move-object v11, v13

    move-object v13, v15

    move-object/from16 v8, v18

    goto :goto_f

    :cond_1b
    move-object/from16 v18, v8

    .line 58
    invoke-virtual {v14}, Landroidx/paging/PageEvent$Insert;->getLoadType()Landroidx/paging/LoadType;

    move-result-object v1

    sget-object v5, Landroidx/paging/LoadType;->APPEND:Landroidx/paging/LoadType;

    if-ne v1, v5, :cond_1e

    iget-object v1, v0, Landroidx/paging/SeparatorState;->pageStash:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1e

    .line 59
    iget-object v1, v0, Landroidx/paging/SeparatorState;->pageStash:Ljava/util/List;

    invoke-static {v1}, Lrc/g0;->y0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/paging/TransformablePage;

    .line 60
    iget-object v5, v0, Landroidx/paging/SeparatorState;->generator:Lhd/q;

    invoke-virtual {v1}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    move-result-object v7

    invoke-static {v7}, Lrc/g0;->y0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v11}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    invoke-virtual {v11}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    move-result-object v8

    invoke-static {v8}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v8

    iput-object v14, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$0:Ljava/lang/Object;

    iput-object v13, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$1:Ljava/lang/Object;

    iput-object v12, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$2:Ljava/lang/Object;

    iput-object v11, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$3:Ljava/lang/Object;

    iput-object v10, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$4:Ljava/lang/Object;

    iput-object v9, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$5:Ljava/lang/Object;

    move-object/from16 v15, v18

    iput-object v15, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$6:Ljava/lang/Object;

    iput-object v1, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$7:Ljava/lang/Object;

    move-object/from16 p1, v1

    const/4 v1, 0x0

    iput-object v1, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$8:Ljava/lang/Object;

    iput-boolean v2, v3, Landroidx/paging/SeparatorState$onInsert$1;->Z$0:Z

    iput v6, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$0:I

    const/4 v1, 0x4

    iput v1, v3, Landroidx/paging/SeparatorState$onInsert$1;->label:I

    invoke-interface {v5, v7, v8, v3}, Lhd/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_1c

    goto/16 :goto_27

    :cond_1c
    move v5, v6

    move-object v6, v1

    move v1, v5

    move-object/from16 v7, p1

    move-object v8, v11

    move-object v5, v13

    move-object v11, v9

    goto/16 :goto_2

    .line 61
    :goto_11
    invoke-virtual {v8}, Landroidx/paging/TransformablePage;->getHintOriginalPageOffset()I

    move-result v9

    .line 62
    invoke-virtual {v8}, Landroidx/paging/TransformablePage;->getHintOriginalIndices()Ljava/util/List;

    move-result-object v10

    if-eqz v10, :cond_1d

    invoke-static {v10}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    move-result v10

    goto :goto_12

    :cond_1d
    const/4 v10, 0x0

    .line 63
    :goto_12
    invoke-static/range {v5 .. v10}, Landroidx/paging/SeparatorsKt;->addSeparatorPage(Ljava/util/List;Ljava/lang/Object;Landroidx/paging/TransformablePage;Landroidx/paging/TransformablePage;II)V

    move-object v6, v5

    move-object v9, v11

    move-object v10, v12

    move-object v11, v13

    move v5, v2

    move-object v2, v8

    :goto_13
    move-object v13, v14

    move-object v8, v15

    goto :goto_14

    :cond_1e
    move-object/from16 v15, v18

    move v5, v2

    move v1, v6

    move-object v2, v11

    move-object v11, v12

    move-object v6, v13

    goto :goto_13

    .line 64
    :goto_14
    invoke-static {v2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    invoke-direct {v0, v2}, Landroidx/paging/SeparatorState;->transformablePageToStash(Landroidx/paging/TransformablePage;)Landroidx/paging/TransformablePage;

    move-result-object v7

    invoke-virtual {v11, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    iget-object v7, v0, Landroidx/paging/SeparatorState;->generator:Lhd/q;

    iput-object v13, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$0:Ljava/lang/Object;

    iput-object v6, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$1:Ljava/lang/Object;

    iput-object v11, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$2:Ljava/lang/Object;

    iput-object v10, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$3:Ljava/lang/Object;

    iput-object v9, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$4:Ljava/lang/Object;

    iput-object v8, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$5:Ljava/lang/Object;

    iput-object v6, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$6:Ljava/lang/Object;

    const/4 v15, 0x0

    iput-object v15, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$7:Ljava/lang/Object;

    iput-object v15, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$8:Ljava/lang/Object;

    iput-boolean v5, v3, Landroidx/paging/SeparatorState$onInsert$1;->Z$0:Z

    iput v1, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$0:I

    const/4 v12, 0x5

    iput v12, v3, Landroidx/paging/SeparatorState$onInsert$1;->label:I

    invoke-static {v2, v7, v3}, Landroidx/paging/SeparatorsKt;->insertInternalSeparators(Landroidx/paging/TransformablePage;Lhd/q;Lvc/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_1f

    goto/16 :goto_27

    :cond_1f
    move-object v12, v6

    :goto_15
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    invoke-virtual {v13}, Landroidx/paging/PageEvent$Insert;->getPages()Ljava/util/List;

    move-result-object v2

    .line 67
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static {v8}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v7

    const/16 v17, 0x1

    add-int/lit8 v7, v7, 0x1

    invoke-interface {v2, v6, v7}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 68
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 69
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2f

    .line 70
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v10, v8

    move-object v14, v13

    move-object v13, v12

    move-object v12, v11

    move-object v11, v9

    move-object v9, v2

    .line 71
    :goto_16
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_29

    .line 72
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Landroidx/paging/TransformablePage;

    check-cast v6, Landroidx/paging/TransformablePage;

    .line 73
    invoke-virtual {v8}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_25

    .line 74
    iget-object v2, v0, Landroidx/paging/SeparatorState;->generator:Lhd/q;

    invoke-virtual {v6}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    move-result-object v7

    invoke-static {v7}, Lrc/g0;->y0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v8}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    move-result-object v15

    invoke-static {v15}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v15

    iput-object v14, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$0:Ljava/lang/Object;

    iput-object v13, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$1:Ljava/lang/Object;

    iput-object v12, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$2:Ljava/lang/Object;

    iput-object v11, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$3:Ljava/lang/Object;

    iput-object v10, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$4:Ljava/lang/Object;

    iput-object v9, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$5:Ljava/lang/Object;

    iput-object v8, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$6:Ljava/lang/Object;

    iput-object v6, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$7:Ljava/lang/Object;

    move-object/from16 p1, v6

    const/4 v6, 0x0

    iput-object v6, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$8:Ljava/lang/Object;

    iput-boolean v5, v3, Landroidx/paging/SeparatorState$onInsert$1;->Z$0:Z

    iput v1, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$0:I

    const/4 v6, 0x6

    iput v6, v3, Landroidx/paging/SeparatorState$onInsert$1;->label:I

    invoke-interface {v2, v7, v15, v3}, Lhd/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_20

    goto/16 :goto_27

    :cond_20
    move-object/from16 v7, p1

    move-object v6, v2

    move v2, v5

    move-object v5, v13

    move-object v15, v14

    move-object v13, v11

    move-object v14, v12

    move-object v11, v9

    move-object v12, v10

    .line 75
    :goto_17
    invoke-virtual {v15}, Landroidx/paging/PageEvent$Insert;->getLoadType()Landroidx/paging/LoadType;

    move-result-object v9

    sget-object v10, Landroidx/paging/LoadType;->PREPEND:Landroidx/paging/LoadType;

    if-ne v9, v10, :cond_21

    .line 76
    invoke-virtual {v7}, Landroidx/paging/TransformablePage;->getHintOriginalPageOffset()I

    move-result v9

    :goto_18
    move/from16 p1, v1

    goto :goto_19

    .line 77
    :cond_21
    invoke-virtual {v8}, Landroidx/paging/TransformablePage;->getHintOriginalPageOffset()I

    move-result v9

    goto :goto_18

    .line 78
    :goto_19
    invoke-virtual {v15}, Landroidx/paging/PageEvent$Insert;->getLoadType()Landroidx/paging/LoadType;

    move-result-object v1

    if-ne v1, v10, :cond_23

    .line 79
    invoke-virtual {v7}, Landroidx/paging/TransformablePage;->getHintOriginalIndices()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_22

    invoke-static {v1}, Lrc/g0;->y0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    :goto_1a
    move v10, v1

    goto :goto_1b

    .line 80
    :cond_22
    invoke-virtual {v7}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lrc/w;->p(Ljava/util/List;)I

    move-result v1

    goto :goto_1a

    .line 81
    :cond_23
    invoke-virtual {v8}, Landroidx/paging/TransformablePage;->getHintOriginalIndices()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_24

    invoke-static {v1}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    goto :goto_1a

    :cond_24
    const/4 v10, 0x0

    .line 82
    :goto_1b
    invoke-static/range {v5 .. v10}, Landroidx/paging/SeparatorsKt;->addSeparatorPage(Ljava/util/List;Ljava/lang/Object;Landroidx/paging/TransformablePage;Landroidx/paging/TransformablePage;II)V

    move-object v1, v11

    move-object v11, v8

    move-object v8, v15

    move-object v15, v14

    move-object v14, v13

    move-object v13, v12

    move-object v12, v1

    move/from16 v1, p1

    move-object v9, v5

    move-object v10, v7

    move v5, v2

    goto :goto_1c

    :cond_25
    move-object/from16 p1, v6

    move-object v15, v11

    move-object v11, v8

    move-object v8, v14

    move-object v14, v15

    move-object v15, v12

    move-object v12, v9

    move-object v9, v13

    move-object v13, v10

    move-object/from16 v10, p1

    .line 83
    :goto_1c
    invoke-virtual {v11}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_26

    .line 84
    invoke-direct {v0, v11}, Landroidx/paging/SeparatorState;->transformablePageToStash(Landroidx/paging/TransformablePage;)Landroidx/paging/TransformablePage;

    move-result-object v2

    invoke-virtual {v15, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    :cond_26
    iget-object v2, v0, Landroidx/paging/SeparatorState;->generator:Lhd/q;

    iput-object v8, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$0:Ljava/lang/Object;

    iput-object v9, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$1:Ljava/lang/Object;

    iput-object v15, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$2:Ljava/lang/Object;

    iput-object v14, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$3:Ljava/lang/Object;

    iput-object v13, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$4:Ljava/lang/Object;

    iput-object v12, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$5:Ljava/lang/Object;

    iput-object v11, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$6:Ljava/lang/Object;

    iput-object v10, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$7:Ljava/lang/Object;

    iput-object v9, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$8:Ljava/lang/Object;

    iput-boolean v5, v3, Landroidx/paging/SeparatorState$onInsert$1;->Z$0:Z

    iput v1, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$0:I

    const/4 v6, 0x7

    iput v6, v3, Landroidx/paging/SeparatorState$onInsert$1;->label:I

    invoke-static {v11, v2, v3}, Landroidx/paging/SeparatorsKt;->insertInternalSeparators(Landroidx/paging/TransformablePage;Lhd/q;Lvc/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_27

    goto/16 :goto_27

    :cond_27
    move-object v6, v9

    :goto_1d
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    invoke-virtual {v11}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_28

    move-object v10, v11

    :cond_28
    move-object v9, v13

    move-object v13, v6

    move-object v6, v10

    move-object v10, v9

    move-object v9, v12

    move-object v11, v14

    move-object v12, v15

    move-object v14, v8

    goto/16 :goto_16

    .line 87
    :cond_29
    invoke-virtual {v14}, Landroidx/paging/PageEvent$Insert;->getLoadType()Landroidx/paging/LoadType;

    move-result-object v2

    sget-object v6, Landroidx/paging/LoadType;->PREPEND:Landroidx/paging/LoadType;

    if-ne v2, v6, :cond_2b

    iget-object v2, v0, Landroidx/paging/SeparatorState;->pageStash:Ljava/util/List;

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2b

    .line 88
    iget-object v2, v0, Landroidx/paging/SeparatorState;->pageStash:Ljava/util/List;

    invoke-static {v2}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Landroidx/paging/TransformablePage;

    .line 89
    iget-object v2, v0, Landroidx/paging/SeparatorState;->generator:Lhd/q;

    invoke-static {v11}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    invoke-virtual {v11}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    move-result-object v6

    invoke-static {v6}, Lrc/g0;->y0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v9}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    move-result-object v7

    invoke-static {v7}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v7

    iput-object v14, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$0:Ljava/lang/Object;

    iput-object v13, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$1:Ljava/lang/Object;

    iput-object v12, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$2:Ljava/lang/Object;

    iput-object v11, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$3:Ljava/lang/Object;

    iput-object v10, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$4:Ljava/lang/Object;

    iput-object v9, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$5:Ljava/lang/Object;

    const/4 v15, 0x0

    iput-object v15, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$6:Ljava/lang/Object;

    iput-object v15, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$7:Ljava/lang/Object;

    iput-object v15, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$8:Ljava/lang/Object;

    iput-boolean v5, v3, Landroidx/paging/SeparatorState$onInsert$1;->Z$0:Z

    iput v1, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$0:I

    const/16 v8, 0x8

    iput v8, v3, Landroidx/paging/SeparatorState$onInsert$1;->label:I

    invoke-interface {v2, v6, v7, v3}, Lhd/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_1

    goto/16 :goto_27

    .line 90
    :goto_1e
    invoke-virtual {v7}, Landroidx/paging/TransformablePage;->getHintOriginalPageOffset()I

    move-result v9

    .line 91
    invoke-virtual {v7}, Landroidx/paging/TransformablePage;->getHintOriginalIndices()Ljava/util/List;

    move-result-object v10

    if-eqz v10, :cond_2a

    invoke-static {v10}, Lrc/g0;->y0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    move-result v10

    goto :goto_1f

    .line 92
    :cond_2a
    invoke-virtual {v7}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    move-result-object v10

    invoke-static {v10}, Lrc/w;->p(Ljava/util/List;)I

    move-result v10

    .line 93
    :goto_1f
    invoke-static/range {v5 .. v10}, Landroidx/paging/SeparatorsKt;->addSeparatorPage(Ljava/util/List;Ljava/lang/Object;Landroidx/paging/TransformablePage;Landroidx/paging/TransformablePage;II)V

    move-object v13, v5

    move-object v10, v11

    move v5, v2

    :goto_20
    move v6, v1

    goto :goto_21

    :cond_2b
    move-object v7, v11

    goto :goto_20

    .line 94
    :goto_21
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v17, 0x1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v14}, Landroidx/paging/PageEvent$Insert;->getPages()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lrc/w;->p(Ljava/util/List;)I

    move-result v2

    if-gt v1, v2, :cond_2e

    move v10, v5

    move v9, v6

    move-object v11, v13

    move-object v15, v14

    move v5, v1

    move v1, v2

    move-object v13, v12

    move-object v12, v7

    .line 95
    :goto_22
    invoke-virtual {v15}, Landroidx/paging/PageEvent$Insert;->getPages()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/paging/TransformablePage;

    iget-object v6, v0, Landroidx/paging/SeparatorState;->generator:Lhd/q;

    iput-object v15, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$0:Ljava/lang/Object;

    iput-object v11, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$1:Ljava/lang/Object;

    iput-object v13, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$2:Ljava/lang/Object;

    iput-object v12, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$3:Ljava/lang/Object;

    iput-object v11, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$4:Ljava/lang/Object;

    const/4 v8, 0x0

    iput-object v8, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$5:Ljava/lang/Object;

    iput-object v8, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$6:Ljava/lang/Object;

    iput-object v8, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$7:Ljava/lang/Object;

    iput-object v8, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$8:Ljava/lang/Object;

    iput-boolean v10, v3, Landroidx/paging/SeparatorState$onInsert$1;->Z$0:Z

    iput v9, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$0:I

    iput v5, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$1:I

    iput v1, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$2:I

    const/16 v7, 0x9

    iput v7, v3, Landroidx/paging/SeparatorState$onInsert$1;->label:I

    invoke-static {v2, v6, v3}, Landroidx/paging/SeparatorsKt;->insertInternalSeparators(Landroidx/paging/TransformablePage;Lhd/q;Lvc/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_2c

    goto/16 :goto_27

    :cond_2c
    move-object v14, v11

    :goto_23
    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eq v5, v1, :cond_2d

    add-int/lit8 v5, v5, 0x1

    move-object v11, v14

    goto :goto_22

    :cond_2d
    move-object v2, v3

    move v6, v9

    move v5, v10

    move-object v10, v12

    move-object v12, v13

    move-object v1, v14

    move-object v3, v15

    goto :goto_25

    :cond_2e
    move-object v2, v3

    move-object v10, v7

    move-object v1, v13

    :goto_24
    move-object v3, v14

    goto :goto_25

    .line 96
    :cond_2f
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    const-string v2, "Empty collection can\'t be reduced."

    invoke-direct {v1, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_30
    move-object v2, v3

    move-object v1, v7

    goto :goto_24

    :goto_25
    if-eqz v5, :cond_34

    .line 97
    iget-boolean v5, v0, Landroidx/paging/SeparatorState;->footerAdded:Z

    if-nez v5, :cond_34

    const/4 v5, 0x1

    .line 98
    iput-boolean v5, v0, Landroidx/paging/SeparatorState;->footerAdded:Z

    if-eqz v6, :cond_31

    .line 99
    iget-object v5, v0, Landroidx/paging/SeparatorState;->pageStash:Ljava/util/List;

    invoke-static {v5}, Lrc/g0;->y0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/paging/TransformablePage;

    goto :goto_26

    :cond_31
    invoke-static {v10}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    move-object v5, v10

    .line 100
    :goto_26
    iget-object v6, v0, Landroidx/paging/SeparatorState;->generator:Lhd/q;

    invoke-virtual {v5}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    move-result-object v7

    invoke-static {v7}, Lrc/g0;->y0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v7

    iput-object v3, v2, Landroidx/paging/SeparatorState$onInsert$1;->L$0:Ljava/lang/Object;

    iput-object v1, v2, Landroidx/paging/SeparatorState$onInsert$1;->L$1:Ljava/lang/Object;

    iput-object v12, v2, Landroidx/paging/SeparatorState$onInsert$1;->L$2:Ljava/lang/Object;

    iput-object v5, v2, Landroidx/paging/SeparatorState$onInsert$1;->L$3:Ljava/lang/Object;

    iput-object v1, v2, Landroidx/paging/SeparatorState$onInsert$1;->L$4:Ljava/lang/Object;

    const/4 v15, 0x0

    iput-object v15, v2, Landroidx/paging/SeparatorState$onInsert$1;->L$5:Ljava/lang/Object;

    iput-object v15, v2, Landroidx/paging/SeparatorState$onInsert$1;->L$6:Ljava/lang/Object;

    iput-object v15, v2, Landroidx/paging/SeparatorState$onInsert$1;->L$7:Ljava/lang/Object;

    iput-object v15, v2, Landroidx/paging/SeparatorState$onInsert$1;->L$8:Ljava/lang/Object;

    const/16 v8, 0xa

    iput v8, v2, Landroidx/paging/SeparatorState$onInsert$1;->label:I

    invoke-interface {v6, v7, v15, v2}, Lhd/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_32

    :goto_27
    return-object v4

    :cond_32
    move-object v6, v1

    move-object v8, v5

    move-object v5, v12

    goto/16 :goto_1

    .line 101
    :goto_28
    invoke-virtual {v8}, Landroidx/paging/TransformablePage;->getHintOriginalPageOffset()I

    move-result v10

    .line 102
    invoke-virtual {v8}, Landroidx/paging/TransformablePage;->getHintOriginalIndices()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_33

    invoke-static {v2}, Lrc/g0;->y0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    :goto_29
    move v11, v2

    goto :goto_2a

    :cond_33
    invoke-virtual {v8}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lrc/w;->p(Ljava/util/List;)I

    move-result v2

    goto :goto_29

    :goto_2a
    const/4 v9, 0x0

    .line 103
    invoke-static/range {v6 .. v11}, Landroidx/paging/SeparatorsKt;->addSeparatorPage(Ljava/util/List;Ljava/lang/Object;Landroidx/paging/TransformablePage;Landroidx/paging/TransformablePage;II)V

    move-object v12, v5

    :cond_34
    move-object v14, v1

    const/4 v1, 0x0

    .line 104
    iput-boolean v1, v0, Landroidx/paging/SeparatorState;->endTerminalSeparatorDeferred:Z

    .line 105
    iput-boolean v1, v0, Landroidx/paging/SeparatorState;->startTerminalSeparatorDeferred:Z

    .line 106
    invoke-virtual {v3}, Landroidx/paging/PageEvent$Insert;->getLoadType()Landroidx/paging/LoadType;

    move-result-object v2

    sget-object v4, Landroidx/paging/LoadType;->APPEND:Landroidx/paging/LoadType;

    if-ne v2, v4, :cond_35

    .line 107
    iget-object v1, v0, Landroidx/paging/SeparatorState;->pageStash:Ljava/util/List;

    invoke-interface {v1, v12}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_2b

    .line 108
    :cond_35
    iget-object v2, v0, Landroidx/paging/SeparatorState;->pageStash:Ljava/util/List;

    invoke-interface {v2, v1, v12}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    .line 109
    :goto_2b
    invoke-virtual {v3}, Landroidx/paging/PageEvent$Insert;->getLoadType()Landroidx/paging/LoadType;

    move-result-object v13

    .line 110
    invoke-virtual {v3}, Landroidx/paging/PageEvent$Insert;->getPages()Ljava/util/List;

    .line 111
    invoke-virtual {v3}, Landroidx/paging/PageEvent$Insert;->getPlaceholdersBefore()I

    move-result v15

    .line 112
    invoke-virtual {v3}, Landroidx/paging/PageEvent$Insert;->getPlaceholdersAfter()I

    move-result v16

    .line 113
    invoke-virtual {v3}, Landroidx/paging/PageEvent$Insert;->getSourceLoadStates()Landroidx/paging/LoadStates;

    move-result-object v17

    .line 114
    invoke-virtual {v3}, Landroidx/paging/PageEvent$Insert;->getMediatorLoadStates()Landroidx/paging/LoadStates;

    move-result-object v18

    .line 115
    new-instance v12, Landroidx/paging/PageEvent$Insert;

    const/16 v19, 0x0

    invoke-direct/range {v12 .. v19}, Landroidx/paging/PageEvent$Insert;-><init>(Landroidx/paging/LoadType;Ljava/util/List;IILandroidx/paging/LoadStates;Landroidx/paging/LoadStates;Lkotlin/jvm/internal/n;)V

    return-object v12

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onLoadStateUpdate(Landroidx/paging/PageEvent$LoadStateUpdate;Lvc/c;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PageEvent$LoadStateUpdate<",
            "TT;>;",
            "Lvc/c<",
            "-",
            "Landroidx/paging/PageEvent<",
            "TR;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/SeparatorState;->mediatorStates:Landroidx/paging/LoadStates;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/paging/SeparatorState;->sourceStates:Landroidx/paging/MutableLoadStateCollection;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroidx/paging/MutableLoadStateCollection;->snapshot()Landroidx/paging/LoadStates;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p1}, Landroidx/paging/PageEvent$LoadStateUpdate;->getSource()Landroidx/paging/LoadStates;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const-string v2, "null cannot be cast to non-null type androidx.paging.PageEvent<R of androidx.paging.SeparatorState>"

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, Landroidx/paging/PageEvent$LoadStateUpdate;->getMediator()Landroidx/paging/LoadStates;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    invoke-static {p1, v2}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_0
    iget-object v1, p0, Landroidx/paging/SeparatorState;->sourceStates:Landroidx/paging/MutableLoadStateCollection;

    .line 36
    .line 37
    invoke-virtual {p1}, Landroidx/paging/PageEvent$LoadStateUpdate;->getSource()Landroidx/paging/LoadStates;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v1, v3}, Landroidx/paging/MutableLoadStateCollection;->set(Landroidx/paging/LoadStates;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Landroidx/paging/PageEvent$LoadStateUpdate;->getMediator()Landroidx/paging/LoadStates;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iput-object v1, p0, Landroidx/paging/SeparatorState;->mediatorStates:Landroidx/paging/LoadStates;

    .line 49
    .line 50
    invoke-virtual {p1}, Landroidx/paging/PageEvent$LoadStateUpdate;->getMediator()Landroidx/paging/LoadStates;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    const/4 v3, 0x0

    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    invoke-virtual {p1}, Landroidx/paging/PageEvent$LoadStateUpdate;->getMediator()Landroidx/paging/LoadStates;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v1}, Landroidx/paging/LoadStates;->getPrepend()Landroidx/paging/LoadState;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v1}, Landroidx/paging/LoadState;->getEndOfPaginationReached()Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_2

    .line 70
    .line 71
    if-eqz v0, :cond_1

    .line 72
    .line 73
    invoke-virtual {v0}, Landroidx/paging/LoadStates;->getPrepend()Landroidx/paging/LoadState;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    goto :goto_0

    .line 78
    :cond_1
    move-object v1, v3

    .line 79
    :goto_0
    invoke-virtual {p1}, Landroidx/paging/PageEvent$LoadStateUpdate;->getMediator()Landroidx/paging/LoadStates;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-virtual {v4}, Landroidx/paging/LoadStates;->getPrepend()Landroidx/paging/LoadState;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    invoke-static {v1, v4}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-nez v1, :cond_2

    .line 92
    .line 93
    sget-object v0, Landroidx/paging/PageEvent$Insert;->Companion:Landroidx/paging/PageEvent$Insert$Companion;

    .line 94
    .line 95
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    iget v2, p0, Landroidx/paging/SeparatorState;->placeholdersBefore:I

    .line 100
    .line 101
    invoke-virtual {p1}, Landroidx/paging/PageEvent$LoadStateUpdate;->getSource()Landroidx/paging/LoadStates;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-virtual {p1}, Landroidx/paging/PageEvent$LoadStateUpdate;->getMediator()Landroidx/paging/LoadStates;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-virtual {v0, v1, v2, v3, p1}, Landroidx/paging/PageEvent$Insert$Companion;->Prepend(Ljava/util/List;ILandroidx/paging/LoadStates;Landroidx/paging/LoadStates;)Landroidx/paging/PageEvent$Insert;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {p0, p1, p2}, Landroidx/paging/SeparatorState;->onInsert(Landroidx/paging/PageEvent$Insert;Lvc/c;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    return-object p1

    .line 118
    :cond_2
    invoke-virtual {p1}, Landroidx/paging/PageEvent$LoadStateUpdate;->getMediator()Landroidx/paging/LoadStates;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    if-eqz v1, :cond_4

    .line 123
    .line 124
    invoke-virtual {p1}, Landroidx/paging/PageEvent$LoadStateUpdate;->getMediator()Landroidx/paging/LoadStates;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-virtual {v1}, Landroidx/paging/LoadStates;->getAppend()Landroidx/paging/LoadState;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-virtual {v1}, Landroidx/paging/LoadState;->getEndOfPaginationReached()Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-eqz v1, :cond_4

    .line 137
    .line 138
    if-eqz v0, :cond_3

    .line 139
    .line 140
    invoke-virtual {v0}, Landroidx/paging/LoadStates;->getAppend()Landroidx/paging/LoadState;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    :cond_3
    invoke-virtual {p1}, Landroidx/paging/PageEvent$LoadStateUpdate;->getMediator()Landroidx/paging/LoadStates;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-virtual {v0}, Landroidx/paging/LoadStates;->getAppend()Landroidx/paging/LoadState;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-static {v3, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    if-nez v0, :cond_4

    .line 157
    .line 158
    sget-object v0, Landroidx/paging/PageEvent$Insert;->Companion:Landroidx/paging/PageEvent$Insert$Companion;

    .line 159
    .line 160
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    iget v2, p0, Landroidx/paging/SeparatorState;->placeholdersAfter:I

    .line 165
    .line 166
    invoke-virtual {p1}, Landroidx/paging/PageEvent$LoadStateUpdate;->getSource()Landroidx/paging/LoadStates;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    invoke-virtual {p1}, Landroidx/paging/PageEvent$LoadStateUpdate;->getMediator()Landroidx/paging/LoadStates;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    invoke-virtual {v0, v1, v2, v3, p1}, Landroidx/paging/PageEvent$Insert$Companion;->Append(Ljava/util/List;ILandroidx/paging/LoadStates;Landroidx/paging/LoadStates;)Landroidx/paging/PageEvent$Insert;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    invoke-virtual {p0, p1, p2}, Landroidx/paging/SeparatorState;->onInsert(Landroidx/paging/PageEvent$Insert;Lvc/c;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    return-object p1

    .line 183
    :cond_4
    invoke-static {p1, v2}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    return-object p1
.end method

.method public final onStaticList(Landroidx/paging/PageEvent$StaticList;Lvc/c;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PageEvent$StaticList<",
            "TT;>;",
            "Lvc/c<",
            "-",
            "Landroidx/paging/PageEvent<",
            "TR;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Landroidx/paging/SeparatorState$onStaticList$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Landroidx/paging/SeparatorState$onStaticList$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/paging/SeparatorState$onStaticList$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/paging/SeparatorState$onStaticList$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/paging/SeparatorState$onStaticList$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Landroidx/paging/SeparatorState$onStaticList$1;-><init>(Landroidx/paging/SeparatorState;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Landroidx/paging/SeparatorState$onStaticList$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/paging/SeparatorState$onStaticList$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget p1, v0, Landroidx/paging/SeparatorState$onStaticList$1;->I$1:I

    .line 39
    .line 40
    iget v2, v0, Landroidx/paging/SeparatorState$onStaticList$1;->I$0:I

    .line 41
    .line 42
    iget-object v4, v0, Landroidx/paging/SeparatorState$onStaticList$1;->L$2:Ljava/lang/Object;

    .line 43
    .line 44
    iget-object v5, v0, Landroidx/paging/SeparatorState$onStaticList$1;->L$1:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v5, Ljava/util/List;

    .line 47
    .line 48
    iget-object v6, v0, Landroidx/paging/SeparatorState$onStaticList$1;->L$0:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v6, Landroidx/paging/PageEvent$StaticList;

    .line 51
    .line 52
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    move-object v8, v4

    .line 56
    move v4, p1

    .line 57
    move-object p1, v6

    .line 58
    move-object v6, v8

    .line 59
    goto :goto_2

    .line 60
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p1

    .line 68
    :cond_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    new-instance p2, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Landroidx/paging/PageEvent$StaticList;->getData()Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-ltz v2, :cond_7

    .line 85
    .line 86
    const/4 v4, 0x0

    .line 87
    move-object v5, p2

    .line 88
    :goto_1
    invoke-virtual {p1}, Landroidx/paging/PageEvent$StaticList;->getData()Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    add-int/lit8 v6, v4, -0x1

    .line 93
    .line 94
    invoke-static {p2, v6}, Lrc/g0;->p0(Ljava/util/List;I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    invoke-virtual {p1}, Landroidx/paging/PageEvent$StaticList;->getData()Ljava/util/List;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    invoke-static {v6, v4}, Lrc/g0;->p0(Ljava/util/List;I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    iget-object v7, p0, Landroidx/paging/SeparatorState;->generator:Lhd/q;

    .line 107
    .line 108
    iput-object p1, v0, Landroidx/paging/SeparatorState$onStaticList$1;->L$0:Ljava/lang/Object;

    .line 109
    .line 110
    iput-object v5, v0, Landroidx/paging/SeparatorState$onStaticList$1;->L$1:Ljava/lang/Object;

    .line 111
    .line 112
    iput-object v6, v0, Landroidx/paging/SeparatorState$onStaticList$1;->L$2:Ljava/lang/Object;

    .line 113
    .line 114
    iput v4, v0, Landroidx/paging/SeparatorState$onStaticList$1;->I$0:I

    .line 115
    .line 116
    iput v2, v0, Landroidx/paging/SeparatorState$onStaticList$1;->I$1:I

    .line 117
    .line 118
    iput v3, v0, Landroidx/paging/SeparatorState$onStaticList$1;->label:I

    .line 119
    .line 120
    invoke-interface {v7, p2, v6, v0}, Lhd/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p2

    .line 124
    if-ne p2, v1, :cond_3

    .line 125
    .line 126
    return-object v1

    .line 127
    :cond_3
    move v8, v4

    .line 128
    move v4, v2

    .line 129
    move v2, v8

    .line 130
    :goto_2
    if-eqz p2, :cond_4

    .line 131
    .line 132
    invoke-interface {v5, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    :cond_4
    if-eqz v6, :cond_5

    .line 136
    .line 137
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    :cond_5
    if-eq v2, v4, :cond_6

    .line 141
    .line 142
    add-int/lit8 p2, v2, 0x1

    .line 143
    .line 144
    move v2, v4

    .line 145
    move v4, p2

    .line 146
    goto :goto_1

    .line 147
    :cond_6
    move-object v1, v5

    .line 148
    goto :goto_3

    .line 149
    :cond_7
    move-object v1, p2

    .line 150
    :goto_3
    new-instance v0, Landroidx/paging/PageEvent$StaticList;

    .line 151
    .line 152
    invoke-virtual {p1}, Landroidx/paging/PageEvent$StaticList;->getSourceLoadStates()Landroidx/paging/LoadStates;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    invoke-virtual {p1}, Landroidx/paging/PageEvent$StaticList;->getMediatorLoadStates()Landroidx/paging/LoadStates;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    const/16 v6, 0x18

    .line 161
    .line 162
    const/4 v7, 0x0

    .line 163
    const/4 v4, 0x0

    .line 164
    const/4 v5, 0x0

    .line 165
    invoke-direct/range {v0 .. v7}, Landroidx/paging/PageEvent$StaticList;-><init>(Ljava/util/List;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;IIILkotlin/jvm/internal/n;)V

    .line 166
    .line 167
    .line 168
    return-object v0
.end method

.method public final setEndTerminalSeparatorDeferred(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/paging/SeparatorState;->endTerminalSeparatorDeferred:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setFooterAdded(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/paging/SeparatorState;->footerAdded:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setHeaderAdded(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/paging/SeparatorState;->headerAdded:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setMediatorStates(Landroidx/paging/LoadStates;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/paging/SeparatorState;->mediatorStates:Landroidx/paging/LoadStates;

    .line 2
    .line 3
    return-void
.end method

.method public final setPlaceholdersAfter(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/paging/SeparatorState;->placeholdersAfter:I

    .line 2
    .line 3
    return-void
.end method

.method public final setPlaceholdersBefore(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/paging/SeparatorState;->placeholdersBefore:I

    .line 2
    .line 3
    return-void
.end method

.method public final setStartTerminalSeparatorDeferred(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/paging/SeparatorState;->startTerminalSeparatorDeferred:Z

    .line 2
    .line 3
    return-void
.end method

.method public final terminatesEnd(Landroidx/paging/PageEvent$Insert;Landroidx/paging/TerminalSeparatorType;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/paging/PageEvent$Insert<",
            "TT;>;",
            "Landroidx/paging/TerminalSeparatorType;",
            ")Z"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "terminalSeparatorType"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Insert;->getLoadType()Landroidx/paging/LoadType;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v1, Landroidx/paging/LoadType;->PREPEND:Landroidx/paging/LoadType;

    .line 16
    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    iget-boolean p1, p0, Landroidx/paging/SeparatorState;->endTerminalSeparatorDeferred:Z

    .line 20
    .line 21
    return p1

    .line 22
    :cond_0
    sget-object v0, Landroidx/paging/SeparatorState$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 23
    .line 24
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    aget p2, v0, p2

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    if-eq p2, v0, :cond_2

    .line 32
    .line 33
    const/4 v0, 0x2

    .line 34
    if-ne p2, v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Insert;->getSourceLoadStates()Landroidx/paging/LoadStates;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, Landroidx/paging/LoadStates;->getAppend()Landroidx/paging/LoadState;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, Landroidx/paging/LoadState;->getEndOfPaginationReached()Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    return p1

    .line 49
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 50
    .line 51
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_2
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Insert;->getSourceLoadStates()Landroidx/paging/LoadStates;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    invoke-virtual {p2}, Landroidx/paging/LoadStates;->getAppend()Landroidx/paging/LoadState;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    invoke-virtual {p2}, Landroidx/paging/LoadState;->getEndOfPaginationReached()Z

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    if-eqz p2, :cond_4

    .line 68
    .line 69
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Insert;->getMediatorLoadStates()Landroidx/paging/LoadStates;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    if-eqz p1, :cond_3

    .line 74
    .line 75
    invoke-virtual {p1}, Landroidx/paging/LoadStates;->getAppend()Landroidx/paging/LoadState;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    if-eqz p1, :cond_3

    .line 80
    .line 81
    invoke-virtual {p1}, Landroidx/paging/LoadState;->getEndOfPaginationReached()Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-nez p1, :cond_3

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_3
    return v0

    .line 89
    :cond_4
    :goto_0
    const/4 p1, 0x0

    .line 90
    return p1
.end method

.method public final terminatesStart(Landroidx/paging/PageEvent$Insert;Landroidx/paging/TerminalSeparatorType;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/paging/PageEvent$Insert<",
            "TT;>;",
            "Landroidx/paging/TerminalSeparatorType;",
            ")Z"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "terminalSeparatorType"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Insert;->getLoadType()Landroidx/paging/LoadType;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v1, Landroidx/paging/LoadType;->APPEND:Landroidx/paging/LoadType;

    .line 16
    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    iget-boolean p1, p0, Landroidx/paging/SeparatorState;->startTerminalSeparatorDeferred:Z

    .line 20
    .line 21
    return p1

    .line 22
    :cond_0
    sget-object v0, Landroidx/paging/SeparatorState$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 23
    .line 24
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    aget p2, v0, p2

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    if-eq p2, v0, :cond_2

    .line 32
    .line 33
    const/4 v0, 0x2

    .line 34
    if-ne p2, v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Insert;->getSourceLoadStates()Landroidx/paging/LoadStates;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, Landroidx/paging/LoadStates;->getPrepend()Landroidx/paging/LoadState;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, Landroidx/paging/LoadState;->getEndOfPaginationReached()Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    return p1

    .line 49
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 50
    .line 51
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_2
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Insert;->getSourceLoadStates()Landroidx/paging/LoadStates;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    invoke-virtual {p2}, Landroidx/paging/LoadStates;->getPrepend()Landroidx/paging/LoadState;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    invoke-virtual {p2}, Landroidx/paging/LoadState;->getEndOfPaginationReached()Z

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    if-eqz p2, :cond_4

    .line 68
    .line 69
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Insert;->getMediatorLoadStates()Landroidx/paging/LoadStates;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    if-eqz p1, :cond_3

    .line 74
    .line 75
    invoke-virtual {p1}, Landroidx/paging/LoadStates;->getPrepend()Landroidx/paging/LoadState;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    if-eqz p1, :cond_3

    .line 80
    .line 81
    invoke-virtual {p1}, Landroidx/paging/LoadState;->getEndOfPaginationReached()Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-nez p1, :cond_3

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_3
    return v0

    .line 89
    :cond_4
    :goto_0
    const/4 p1, 0x0

    .line 90
    return p1
.end method
