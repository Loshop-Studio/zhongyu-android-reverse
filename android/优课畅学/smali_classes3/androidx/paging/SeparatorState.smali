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

.field private final generator:Lx7/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx7/q;"
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
.method public constructor <init>(Landroidx/paging/TerminalSeparatorType;Lx7/q;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/TerminalSeparatorType;",
            "Lx7/q;",
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
    iput-object p2, p0, Landroidx/paging/SeparatorState;->generator:Lx7/q;

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
    invoke-static {v2}, Li7/f0;->l0(Ljava/util/List;)Ljava/lang/Object;

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
    invoke-static {v3}, Li7/f0;->x0(Ljava/util/List;)Ljava/lang/Object;

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
    invoke-static {v2}, Li7/v;->q([Ljava/lang/Object;)Ljava/util/List;

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
    invoke-static {v4}, Li7/f0;->l0(Ljava/util/List;)Ljava/lang/Object;

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
    invoke-static {v5}, Li7/f0;->x0(Ljava/util/List;)Ljava/lang/Object;

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
    invoke-static {p1}, Li7/v;->p(Ljava/util/List;)I

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
    invoke-static {p1}, Li7/v;->q([Ljava/lang/Object;)Ljava/util/List;

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

.method public final getGenerator()Lx7/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lx7/q;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/SeparatorState;->generator:Lx7/q;

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
    invoke-virtual {v2}, Landroidx/paging/LoadState$NotLoading$Companion;->getIncomplete$paging_common_release()Landroidx/paging/LoadState$NotLoading;

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
    new-instance v0, Ld8/f;

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
    invoke-direct {v0, v1, v2}, Ld8/f;-><init>(II)V

    .line 85
    .line 86
    .line 87
    iget-object v1, p0, Landroidx/paging/SeparatorState;->pageStash:Ljava/util/List;

    .line 88
    .line 89
    new-instance v2, Landroidx/paging/SeparatorState$onDrop$1;

    .line 90
    .line 91
    invoke-direct {v2, v0}, Landroidx/paging/SeparatorState$onDrop$1;-><init>(Ld8/f;)V

    .line 92
    .line 93
    .line 94
    invoke-static {v1, v2}, Li7/a0;->L(Ljava/util/List;Lx7/l;)Z

    .line 95
    .line 96
    .line 97
    return-object p1
.end method

.method public final onEvent(Landroidx/paging/PageEvent;Lm7/c;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PageEvent<",
            "TT;>;",
            "Lm7/c<",
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
    invoke-direct {v0, p0, p2}, Landroidx/paging/SeparatorState$onEvent$1;-><init>(Landroidx/paging/SeparatorState;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Landroidx/paging/SeparatorState$onEvent$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

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
    iget-object p1, v0, Landroidx/paging/SeparatorState$onEvent$1;->L$0:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, Landroidx/paging/SeparatorState;

    .line 47
    .line 48
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto/16 :goto_4

    .line 52
    .line 53
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1

    .line 61
    :cond_2
    iget-object p1, v0, Landroidx/paging/SeparatorState$onEvent$1;->L$0:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p1, Landroidx/paging/SeparatorState;

    .line 64
    .line 65
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_3
    iget-object p1, v0, Landroidx/paging/SeparatorState$onEvent$1;->L$0:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p1, Landroidx/paging/SeparatorState;

    .line 72
    .line 73
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_4
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    instance-of p2, p1, Landroidx/paging/PageEvent$Insert;

    .line 81
    .line 82
    if-eqz p2, :cond_6

    .line 83
    .line 84
    check-cast p1, Landroidx/paging/PageEvent$Insert;

    .line 85
    .line 86
    iput-object p0, v0, Landroidx/paging/SeparatorState$onEvent$1;->L$0:Ljava/lang/Object;

    .line 87
    .line 88
    iput v5, v0, Landroidx/paging/SeparatorState$onEvent$1;->label:I

    .line 89
    .line 90
    invoke-virtual {p0, p1, v0}, Landroidx/paging/SeparatorState;->onInsert(Landroidx/paging/PageEvent$Insert;Lm7/c;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    if-ne p2, v1, :cond_5

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_5
    move-object p1, p0

    .line 98
    :goto_1
    check-cast p2, Landroidx/paging/PageEvent;

    .line 99
    .line 100
    goto :goto_5

    .line 101
    :cond_6
    instance-of p2, p1, Landroidx/paging/PageEvent$Drop;

    .line 102
    .line 103
    if-eqz p2, :cond_7

    .line 104
    .line 105
    check-cast p1, Landroidx/paging/PageEvent$Drop;

    .line 106
    .line 107
    invoke-virtual {p0, p1}, Landroidx/paging/SeparatorState;->onDrop(Landroidx/paging/PageEvent$Drop;)Landroidx/paging/PageEvent$Drop;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    move-object p1, p0

    .line 112
    goto :goto_5

    .line 113
    :cond_7
    instance-of p2, p1, Landroidx/paging/PageEvent$LoadStateUpdate;

    .line 114
    .line 115
    if-eqz p2, :cond_9

    .line 116
    .line 117
    check-cast p1, Landroidx/paging/PageEvent$LoadStateUpdate;

    .line 118
    .line 119
    iput-object p0, v0, Landroidx/paging/SeparatorState$onEvent$1;->L$0:Ljava/lang/Object;

    .line 120
    .line 121
    iput v4, v0, Landroidx/paging/SeparatorState$onEvent$1;->label:I

    .line 122
    .line 123
    invoke-virtual {p0, p1, v0}, Landroidx/paging/SeparatorState;->onLoadStateUpdate(Landroidx/paging/PageEvent$LoadStateUpdate;Lm7/c;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    if-ne p2, v1, :cond_8

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_8
    move-object p1, p0

    .line 131
    :goto_2
    check-cast p2, Landroidx/paging/PageEvent;

    .line 132
    .line 133
    goto :goto_5

    .line 134
    :cond_9
    instance-of p2, p1, Landroidx/paging/PageEvent$StaticList;

    .line 135
    .line 136
    if-eqz p2, :cond_f

    .line 137
    .line 138
    check-cast p1, Landroidx/paging/PageEvent$StaticList;

    .line 139
    .line 140
    iput-object p0, v0, Landroidx/paging/SeparatorState$onEvent$1;->L$0:Ljava/lang/Object;

    .line 141
    .line 142
    iput v3, v0, Landroidx/paging/SeparatorState$onEvent$1;->label:I

    .line 143
    .line 144
    invoke-virtual {p0, p1, v0}, Landroidx/paging/SeparatorState;->onStaticList(Landroidx/paging/PageEvent$StaticList;Lm7/c;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    if-ne p2, v1, :cond_a

    .line 149
    .line 150
    :goto_3
    return-object v1

    .line 151
    :cond_a
    move-object p1, p0

    .line 152
    :goto_4
    check-cast p2, Landroidx/paging/PageEvent;

    .line 153
    .line 154
    :goto_5
    iget-boolean v0, p1, Landroidx/paging/SeparatorState;->endTerminalSeparatorDeferred:Z

    .line 155
    .line 156
    if-eqz v0, :cond_c

    .line 157
    .line 158
    iget-object v0, p1, Landroidx/paging/SeparatorState;->pageStash:Ljava/util/List;

    .line 159
    .line 160
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    if-eqz v0, :cond_b

    .line 165
    .line 166
    goto :goto_6

    .line 167
    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 168
    .line 169
    const-string p2, "deferred endTerm, page stash should be empty"

    .line 170
    .line 171
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    throw p1

    .line 175
    :cond_c
    :goto_6
    iget-boolean v0, p1, Landroidx/paging/SeparatorState;->startTerminalSeparatorDeferred:Z

    .line 176
    .line 177
    if-eqz v0, :cond_e

    .line 178
    .line 179
    iget-object p1, p1, Landroidx/paging/SeparatorState;->pageStash:Ljava/util/List;

    .line 180
    .line 181
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 182
    .line 183
    .line 184
    move-result p1

    .line 185
    if-eqz p1, :cond_d

    .line 186
    .line 187
    goto :goto_7

    .line 188
    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 189
    .line 190
    const-string p2, "deferred startTerm, page stash should be empty"

    .line 191
    .line 192
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    throw p1

    .line 196
    :cond_e
    :goto_7
    return-object p2

    .line 197
    :cond_f
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 198
    .line 199
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 200
    .line 201
    .line 202
    throw p1
.end method

.method public final onInsert(Landroidx/paging/PageEvent$Insert;Lm7/c;)Ljava/lang/Object;
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PageEvent$Insert<",
            "TT;>;",
            "Lm7/c<",
            "-",
            "Landroidx/paging/PageEvent$Insert<",
            "TR;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    instance-of v3, v2, Landroidx/paging/SeparatorState$onInsert$1;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, Landroidx/paging/SeparatorState$onInsert$1;

    .line 13
    .line 14
    iget v4, v3, Landroidx/paging/SeparatorState$onInsert$1;->label:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Landroidx/paging/SeparatorState$onInsert$1;->label:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, Landroidx/paging/SeparatorState$onInsert$1;

    .line 27
    .line 28
    invoke-direct {v3, v0, v2}, Landroidx/paging/SeparatorState$onInsert$1;-><init>(Landroidx/paging/SeparatorState;Lm7/c;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, Landroidx/paging/SeparatorState$onInsert$1;->result:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iget v5, v3, Landroidx/paging/SeparatorState$onInsert$1;->label:I

    .line 38
    .line 39
    packed-switch v5, :pswitch_data_0

    .line 40
    .line 41
    .line 42
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v1

    .line 50
    :pswitch_0
    iget-object v1, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$5:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, Ljava/util/List;

    .line 53
    .line 54
    iget-object v4, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$4:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v4, Landroidx/paging/TransformablePage;

    .line 57
    .line 58
    iget-object v5, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$3:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v5, Ljava/util/ArrayList;

    .line 61
    .line 62
    iget-object v7, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$2:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v7, Ljava/util/ArrayList;

    .line 65
    .line 66
    iget-object v8, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$1:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v8, Landroidx/paging/PageEvent$Insert;

    .line 69
    .line 70
    iget-object v3, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$0:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v3, Landroidx/paging/SeparatorState;

    .line 73
    .line 74
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    move-object v14, v1

    .line 78
    move-object v15, v2

    .line 79
    move-object/from16 v16, v4

    .line 80
    .line 81
    goto/16 :goto_27

    .line 82
    .line 83
    :pswitch_1
    iget v1, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$2:I

    .line 84
    .line 85
    iget v5, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$1:I

    .line 86
    .line 87
    iget v9, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$0:I

    .line 88
    .line 89
    iget-boolean v10, v3, Landroidx/paging/SeparatorState$onInsert$1;->Z$0:Z

    .line 90
    .line 91
    iget-object v11, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$5:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v11, Ljava/util/ArrayList;

    .line 94
    .line 95
    iget-object v12, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$4:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v12, Landroidx/paging/TransformablePage;

    .line 98
    .line 99
    iget-object v13, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$3:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v13, Ljava/util/ArrayList;

    .line 102
    .line 103
    iget-object v14, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$2:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v14, Ljava/util/ArrayList;

    .line 106
    .line 107
    iget-object v15, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$1:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v15, Landroidx/paging/PageEvent$Insert;

    .line 110
    .line 111
    iget-object v6, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$0:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v6, Landroidx/paging/SeparatorState;

    .line 114
    .line 115
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    goto/16 :goto_23

    .line 119
    .line 120
    :pswitch_2
    iget v1, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$0:I

    .line 121
    .line 122
    iget-boolean v5, v3, Landroidx/paging/SeparatorState$onInsert$1;->Z$0:Z

    .line 123
    .line 124
    iget-object v6, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$6:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v6, Landroidx/paging/TransformablePage;

    .line 127
    .line 128
    iget-object v9, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$5:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v9, Ljava/lang/Integer;

    .line 131
    .line 132
    iget-object v10, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$4:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v10, Landroidx/paging/TransformablePage;

    .line 135
    .line 136
    iget-object v11, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$3:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v11, Ljava/util/ArrayList;

    .line 139
    .line 140
    iget-object v12, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$2:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v12, Ljava/util/ArrayList;

    .line 143
    .line 144
    iget-object v13, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$1:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v13, Landroidx/paging/PageEvent$Insert;

    .line 147
    .line 148
    iget-object v14, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$0:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v14, Landroidx/paging/SeparatorState;

    .line 151
    .line 152
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    :cond_1
    move v0, v5

    .line 156
    move-object v8, v6

    .line 157
    move-object v7, v10

    .line 158
    move-object v5, v12

    .line 159
    move-object v6, v2

    .line 160
    move-object v2, v9

    .line 161
    goto/16 :goto_20

    .line 162
    .line 163
    :pswitch_3
    iget v1, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$0:I

    .line 164
    .line 165
    iget-boolean v5, v3, Landroidx/paging/SeparatorState$onInsert$1;->Z$0:Z

    .line 166
    .line 167
    iget-object v6, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$9:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v6, Ljava/util/ArrayList;

    .line 170
    .line 171
    iget-object v9, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$8:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v9, Landroidx/paging/TransformablePage;

    .line 174
    .line 175
    iget-object v10, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$7:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v10, Landroidx/paging/TransformablePage;

    .line 178
    .line 179
    iget-object v11, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$6:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v11, Ljava/util/Iterator;

    .line 182
    .line 183
    iget-object v12, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$5:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v12, Ljava/lang/Integer;

    .line 186
    .line 187
    iget-object v13, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$4:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v13, Landroidx/paging/TransformablePage;

    .line 190
    .line 191
    iget-object v14, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$3:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v14, Ljava/util/ArrayList;

    .line 194
    .line 195
    iget-object v15, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$2:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v15, Ljava/util/ArrayList;

    .line 198
    .line 199
    iget-object v8, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$1:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v8, Landroidx/paging/PageEvent$Insert;

    .line 202
    .line 203
    iget-object v7, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$0:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v7, Landroidx/paging/SeparatorState;

    .line 206
    .line 207
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    :goto_1
    move-object v0, v8

    .line 211
    move-object v8, v11

    .line 212
    move-object v11, v14

    .line 213
    move-object v14, v7

    .line 214
    goto/16 :goto_1e

    .line 215
    .line 216
    :pswitch_4
    iget v1, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$0:I

    .line 217
    .line 218
    iget-boolean v5, v3, Landroidx/paging/SeparatorState$onInsert$1;->Z$0:Z

    .line 219
    .line 220
    iget-object v6, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$8:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v6, Landroidx/paging/TransformablePage;

    .line 223
    .line 224
    iget-object v7, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$7:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast v7, Landroidx/paging/TransformablePage;

    .line 227
    .line 228
    iget-object v8, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$6:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v8, Ljava/util/Iterator;

    .line 231
    .line 232
    iget-object v9, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$5:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v9, Ljava/lang/Integer;

    .line 235
    .line 236
    iget-object v10, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$4:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v10, Landroidx/paging/TransformablePage;

    .line 239
    .line 240
    iget-object v11, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$3:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast v11, Ljava/util/ArrayList;

    .line 243
    .line 244
    iget-object v12, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$2:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v12, Ljava/util/ArrayList;

    .line 247
    .line 248
    iget-object v13, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$1:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast v13, Landroidx/paging/PageEvent$Insert;

    .line 251
    .line 252
    iget-object v14, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$0:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v14, Landroidx/paging/SeparatorState;

    .line 255
    .line 256
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    move-object v0, v6

    .line 260
    move-object v6, v2

    .line 261
    move-object v2, v8

    .line 262
    move-object v8, v7

    .line 263
    move-object v7, v0

    .line 264
    :goto_2
    move v0, v5

    .line 265
    move-object v5, v12

    .line 266
    move-object v15, v14

    .line 267
    move-object v12, v10

    .line 268
    move-object v14, v13

    .line 269
    move-object v13, v11

    .line 270
    move-object v11, v9

    .line 271
    goto/16 :goto_18

    .line 272
    .line 273
    :pswitch_5
    iget v1, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$0:I

    .line 274
    .line 275
    iget-boolean v5, v3, Landroidx/paging/SeparatorState$onInsert$1;->Z$0:Z

    .line 276
    .line 277
    iget-object v6, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$7:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast v6, Ljava/util/ArrayList;

    .line 280
    .line 281
    iget-object v7, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$6:Ljava/lang/Object;

    .line 282
    .line 283
    check-cast v7, Ljava/lang/Integer;

    .line 284
    .line 285
    iget-object v8, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$5:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v8, Landroidx/paging/TransformablePage;

    .line 288
    .line 289
    iget-object v9, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$4:Ljava/lang/Object;

    .line 290
    .line 291
    check-cast v9, Ljava/lang/Integer;

    .line 292
    .line 293
    iget-object v10, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$3:Ljava/lang/Object;

    .line 294
    .line 295
    check-cast v10, Ljava/util/ArrayList;

    .line 296
    .line 297
    iget-object v11, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$2:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v11, Ljava/util/ArrayList;

    .line 300
    .line 301
    iget-object v12, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$1:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast v12, Landroidx/paging/PageEvent$Insert;

    .line 304
    .line 305
    iget-object v13, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$0:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v13, Landroidx/paging/SeparatorState;

    .line 308
    .line 309
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    goto/16 :goto_16

    .line 313
    .line 314
    :pswitch_6
    iget v1, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$0:I

    .line 315
    .line 316
    iget-boolean v5, v3, Landroidx/paging/SeparatorState$onInsert$1;->Z$0:Z

    .line 317
    .line 318
    iget-object v6, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$8:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast v6, Landroidx/paging/TransformablePage;

    .line 321
    .line 322
    iget-object v7, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$7:Ljava/lang/Object;

    .line 323
    .line 324
    check-cast v7, Ljava/lang/Integer;

    .line 325
    .line 326
    iget-object v8, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$6:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast v8, Landroidx/paging/TransformablePage;

    .line 329
    .line 330
    iget-object v9, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$5:Ljava/lang/Object;

    .line 331
    .line 332
    check-cast v9, Ljava/lang/Integer;

    .line 333
    .line 334
    iget-object v10, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$4:Ljava/lang/Object;

    .line 335
    .line 336
    check-cast v10, Landroidx/paging/TransformablePage;

    .line 337
    .line 338
    iget-object v11, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$3:Ljava/lang/Object;

    .line 339
    .line 340
    check-cast v11, Ljava/util/ArrayList;

    .line 341
    .line 342
    iget-object v12, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$2:Ljava/lang/Object;

    .line 343
    .line 344
    check-cast v12, Ljava/util/ArrayList;

    .line 345
    .line 346
    iget-object v13, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$1:Ljava/lang/Object;

    .line 347
    .line 348
    check-cast v13, Landroidx/paging/PageEvent$Insert;

    .line 349
    .line 350
    iget-object v14, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$0:Ljava/lang/Object;

    .line 351
    .line 352
    check-cast v14, Landroidx/paging/SeparatorState;

    .line 353
    .line 354
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    move-object v15, v7

    .line 358
    move-object v7, v6

    .line 359
    move-object v6, v2

    .line 360
    move v2, v5

    .line 361
    move-object v0, v8

    .line 362
    move-object v8, v10

    .line 363
    move-object v5, v12

    .line 364
    :goto_3
    move-object v12, v11

    .line 365
    move-object v11, v9

    .line 366
    goto/16 :goto_13

    .line 367
    .line 368
    :pswitch_7
    iget v1, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$2:I

    .line 369
    .line 370
    iget v5, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$1:I

    .line 371
    .line 372
    iget v6, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$0:I

    .line 373
    .line 374
    iget-boolean v7, v3, Landroidx/paging/SeparatorState$onInsert$1;->Z$0:Z

    .line 375
    .line 376
    iget-object v8, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$8:Ljava/lang/Object;

    .line 377
    .line 378
    check-cast v8, Ljava/util/ArrayList;

    .line 379
    .line 380
    iget-object v9, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$7:Ljava/lang/Object;

    .line 381
    .line 382
    check-cast v9, Ljava/lang/Integer;

    .line 383
    .line 384
    iget-object v10, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$6:Ljava/lang/Object;

    .line 385
    .line 386
    check-cast v10, Landroidx/paging/TransformablePage;

    .line 387
    .line 388
    iget-object v11, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$5:Ljava/lang/Object;

    .line 389
    .line 390
    check-cast v11, Ljava/lang/Integer;

    .line 391
    .line 392
    iget-object v12, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$4:Ljava/lang/Object;

    .line 393
    .line 394
    check-cast v12, Landroidx/paging/TransformablePage;

    .line 395
    .line 396
    iget-object v13, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$3:Ljava/lang/Object;

    .line 397
    .line 398
    check-cast v13, Ljava/util/ArrayList;

    .line 399
    .line 400
    iget-object v14, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$2:Ljava/lang/Object;

    .line 401
    .line 402
    check-cast v14, Ljava/util/ArrayList;

    .line 403
    .line 404
    iget-object v15, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$1:Ljava/lang/Object;

    .line 405
    .line 406
    check-cast v15, Landroidx/paging/PageEvent$Insert;

    .line 407
    .line 408
    move/from16 p1, v1

    .line 409
    .line 410
    iget-object v1, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$0:Ljava/lang/Object;

    .line 411
    .line 412
    check-cast v1, Landroidx/paging/SeparatorState;

    .line 413
    .line 414
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 415
    .line 416
    .line 417
    move-object v0, v1

    .line 418
    move-object/from16 v18, v9

    .line 419
    .line 420
    move-object v9, v11

    .line 421
    move-object v11, v13

    .line 422
    move-object v13, v15

    .line 423
    move/from16 v1, p1

    .line 424
    .line 425
    goto/16 :goto_12

    .line 426
    .line 427
    :pswitch_8
    iget v1, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$0:I

    .line 428
    .line 429
    iget-boolean v5, v3, Landroidx/paging/SeparatorState$onInsert$1;->Z$0:Z

    .line 430
    .line 431
    iget-object v6, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$9:Ljava/lang/Object;

    .line 432
    .line 433
    check-cast v6, Ljava/util/List;

    .line 434
    .line 435
    iget-object v7, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$8:Ljava/lang/Object;

    .line 436
    .line 437
    check-cast v7, Landroidx/paging/TransformablePage;

    .line 438
    .line 439
    iget-object v8, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$7:Ljava/lang/Object;

    .line 440
    .line 441
    check-cast v8, Ljava/lang/Integer;

    .line 442
    .line 443
    iget-object v9, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$6:Ljava/lang/Object;

    .line 444
    .line 445
    check-cast v9, Landroidx/paging/TransformablePage;

    .line 446
    .line 447
    iget-object v10, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$5:Ljava/lang/Object;

    .line 448
    .line 449
    check-cast v10, Ljava/lang/Integer;

    .line 450
    .line 451
    iget-object v11, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$4:Ljava/lang/Object;

    .line 452
    .line 453
    check-cast v11, Landroidx/paging/TransformablePage;

    .line 454
    .line 455
    iget-object v12, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$3:Ljava/lang/Object;

    .line 456
    .line 457
    check-cast v12, Ljava/util/ArrayList;

    .line 458
    .line 459
    iget-object v13, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$2:Ljava/lang/Object;

    .line 460
    .line 461
    check-cast v13, Ljava/util/ArrayList;

    .line 462
    .line 463
    iget-object v14, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$1:Ljava/lang/Object;

    .line 464
    .line 465
    check-cast v14, Landroidx/paging/PageEvent$Insert;

    .line 466
    .line 467
    iget-object v15, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$0:Ljava/lang/Object;

    .line 468
    .line 469
    check-cast v15, Landroidx/paging/SeparatorState;

    .line 470
    .line 471
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 472
    .line 473
    .line 474
    move-object/from16 v18, v6

    .line 475
    .line 476
    move-object v6, v2

    .line 477
    move v2, v5

    .line 478
    move-object/from16 v5, v18

    .line 479
    .line 480
    move-object/from16 v18, v12

    .line 481
    .line 482
    move-object/from16 v19, v13

    .line 483
    .line 484
    move-object/from16 v20, v15

    .line 485
    .line 486
    move-object v12, v9

    .line 487
    move-object v13, v10

    .line 488
    move-object v15, v11

    .line 489
    move-object v11, v8

    .line 490
    move-object v8, v7

    .line 491
    goto/16 :goto_e

    .line 492
    .line 493
    :pswitch_9
    iget-object v1, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$1:Ljava/lang/Object;

    .line 494
    .line 495
    check-cast v1, Landroidx/paging/PageEvent$Insert;

    .line 496
    .line 497
    iget-object v3, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$0:Ljava/lang/Object;

    .line 498
    .line 499
    check-cast v3, Landroidx/paging/SeparatorState;

    .line 500
    .line 501
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 502
    .line 503
    .line 504
    const/4 v5, 0x1

    .line 505
    :goto_4
    const/4 v4, 0x0

    .line 506
    goto/16 :goto_8

    .line 507
    .line 508
    :pswitch_a
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 509
    .line 510
    .line 511
    iget-object v2, v0, Landroidx/paging/SeparatorState;->terminalSeparatorType:Landroidx/paging/TerminalSeparatorType;

    .line 512
    .line 513
    invoke-virtual {v0, v1, v2}, Landroidx/paging/SeparatorState;->terminatesStart(Landroidx/paging/PageEvent$Insert;Landroidx/paging/TerminalSeparatorType;)Z

    .line 514
    .line 515
    .line 516
    move-result v2

    .line 517
    iget-object v5, v0, Landroidx/paging/SeparatorState;->terminalSeparatorType:Landroidx/paging/TerminalSeparatorType;

    .line 518
    .line 519
    invoke-virtual {v0, v1, v5}, Landroidx/paging/SeparatorState;->terminatesEnd(Landroidx/paging/PageEvent$Insert;Landroidx/paging/TerminalSeparatorType;)Z

    .line 520
    .line 521
    .line 522
    move-result v5

    .line 523
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getPages()Ljava/util/List;

    .line 524
    .line 525
    .line 526
    move-result-object v6

    .line 527
    if-eqz v6, :cond_3

    .line 528
    .line 529
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 530
    .line 531
    .line 532
    move-result v7

    .line 533
    if-eqz v7, :cond_3

    .line 534
    .line 535
    :cond_2
    const/4 v6, 0x1

    .line 536
    goto :goto_5

    .line 537
    :cond_3
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 538
    .line 539
    .line 540
    move-result-object v6

    .line 541
    :cond_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 542
    .line 543
    .line 544
    move-result v7

    .line 545
    if-eqz v7, :cond_2

    .line 546
    .line 547
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object v7

    .line 551
    check-cast v7, Landroidx/paging/TransformablePage;

    .line 552
    .line 553
    invoke-virtual {v7}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    .line 554
    .line 555
    .line 556
    move-result-object v7

    .line 557
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 558
    .line 559
    .line 560
    move-result v7

    .line 561
    if-nez v7, :cond_4

    .line 562
    .line 563
    const/4 v6, 0x0

    .line 564
    :goto_5
    iget-boolean v7, v0, Landroidx/paging/SeparatorState;->headerAdded:Z

    .line 565
    .line 566
    if-eqz v7, :cond_6

    .line 567
    .line 568
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getLoadType()Landroidx/paging/LoadType;

    .line 569
    .line 570
    .line 571
    move-result-object v7

    .line 572
    sget-object v8, Landroidx/paging/LoadType;->PREPEND:Landroidx/paging/LoadType;

    .line 573
    .line 574
    if-ne v7, v8, :cond_6

    .line 575
    .line 576
    if-eqz v6, :cond_5

    .line 577
    .line 578
    goto :goto_6

    .line 579
    :cond_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 580
    .line 581
    const-string v2, "Additional prepend event after prepend state is done"

    .line 582
    .line 583
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 584
    .line 585
    .line 586
    throw v1

    .line 587
    :cond_6
    :goto_6
    iget-boolean v7, v0, Landroidx/paging/SeparatorState;->footerAdded:Z

    .line 588
    .line 589
    if-eqz v7, :cond_8

    .line 590
    .line 591
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getLoadType()Landroidx/paging/LoadType;

    .line 592
    .line 593
    .line 594
    move-result-object v7

    .line 595
    sget-object v8, Landroidx/paging/LoadType;->APPEND:Landroidx/paging/LoadType;

    .line 596
    .line 597
    if-ne v7, v8, :cond_8

    .line 598
    .line 599
    if-eqz v6, :cond_7

    .line 600
    .line 601
    goto :goto_7

    .line 602
    :cond_7
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 603
    .line 604
    const-string v2, "Additional append event after append state is done"

    .line 605
    .line 606
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 607
    .line 608
    .line 609
    throw v1

    .line 610
    :cond_8
    :goto_7
    iget-object v7, v0, Landroidx/paging/SeparatorState;->sourceStates:Landroidx/paging/MutableLoadStateCollection;

    .line 611
    .line 612
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getSourceLoadStates()Landroidx/paging/LoadStates;

    .line 613
    .line 614
    .line 615
    move-result-object v8

    .line 616
    invoke-virtual {v7, v8}, Landroidx/paging/MutableLoadStateCollection;->set(Landroidx/paging/LoadStates;)V

    .line 617
    .line 618
    .line 619
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getMediatorLoadStates()Landroidx/paging/LoadStates;

    .line 620
    .line 621
    .line 622
    move-result-object v7

    .line 623
    iput-object v7, v0, Landroidx/paging/SeparatorState;->mediatorStates:Landroidx/paging/LoadStates;

    .line 624
    .line 625
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getLoadType()Landroidx/paging/LoadType;

    .line 626
    .line 627
    .line 628
    move-result-object v7

    .line 629
    sget-object v8, Landroidx/paging/LoadType;->APPEND:Landroidx/paging/LoadType;

    .line 630
    .line 631
    if-eq v7, v8, :cond_9

    .line 632
    .line 633
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getPlaceholdersBefore()I

    .line 634
    .line 635
    .line 636
    move-result v7

    .line 637
    iput v7, v0, Landroidx/paging/SeparatorState;->placeholdersBefore:I

    .line 638
    .line 639
    :cond_9
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getLoadType()Landroidx/paging/LoadType;

    .line 640
    .line 641
    .line 642
    move-result-object v7

    .line 643
    sget-object v8, Landroidx/paging/LoadType;->PREPEND:Landroidx/paging/LoadType;

    .line 644
    .line 645
    if-eq v7, v8, :cond_a

    .line 646
    .line 647
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getPlaceholdersAfter()I

    .line 648
    .line 649
    .line 650
    move-result v7

    .line 651
    iput v7, v0, Landroidx/paging/SeparatorState;->placeholdersAfter:I

    .line 652
    .line 653
    :cond_a
    if-eqz v6, :cond_12

    .line 654
    .line 655
    if-nez v2, :cond_b

    .line 656
    .line 657
    if-nez v5, :cond_b

    .line 658
    .line 659
    invoke-virtual/range {p0 .. p1}, Landroidx/paging/SeparatorState;->asRType(Landroidx/paging/PageEvent$Insert;)Landroidx/paging/PageEvent$Insert;

    .line 660
    .line 661
    .line 662
    move-result-object v1

    .line 663
    return-object v1

    .line 664
    :cond_b
    iget-boolean v7, v0, Landroidx/paging/SeparatorState;->headerAdded:Z

    .line 665
    .line 666
    if-eqz v7, :cond_c

    .line 667
    .line 668
    iget-boolean v7, v0, Landroidx/paging/SeparatorState;->footerAdded:Z

    .line 669
    .line 670
    if-eqz v7, :cond_c

    .line 671
    .line 672
    invoke-virtual/range {p0 .. p1}, Landroidx/paging/SeparatorState;->asRType(Landroidx/paging/PageEvent$Insert;)Landroidx/paging/PageEvent$Insert;

    .line 673
    .line 674
    .line 675
    move-result-object v1

    .line 676
    return-object v1

    .line 677
    :cond_c
    iget-object v7, v0, Landroidx/paging/SeparatorState;->pageStash:Ljava/util/List;

    .line 678
    .line 679
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 680
    .line 681
    .line 682
    move-result v7

    .line 683
    if-eqz v7, :cond_12

    .line 684
    .line 685
    if-eqz v2, :cond_f

    .line 686
    .line 687
    if-eqz v5, :cond_f

    .line 688
    .line 689
    iget-boolean v6, v0, Landroidx/paging/SeparatorState;->headerAdded:Z

    .line 690
    .line 691
    if-nez v6, :cond_f

    .line 692
    .line 693
    iget-boolean v6, v0, Landroidx/paging/SeparatorState;->footerAdded:Z

    .line 694
    .line 695
    if-nez v6, :cond_f

    .line 696
    .line 697
    iget-object v2, v0, Landroidx/paging/SeparatorState;->generator:Lx7/q;

    .line 698
    .line 699
    iput-object v0, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$0:Ljava/lang/Object;

    .line 700
    .line 701
    iput-object v1, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$1:Ljava/lang/Object;

    .line 702
    .line 703
    const/4 v5, 0x1

    .line 704
    iput v5, v3, Landroidx/paging/SeparatorState$onInsert$1;->label:I

    .line 705
    .line 706
    const/4 v6, 0x0

    .line 707
    invoke-interface {v2, v6, v6, v3}, Lx7/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 708
    .line 709
    .line 710
    move-result-object v2

    .line 711
    if-ne v2, v4, :cond_d

    .line 712
    .line 713
    goto/16 :goto_26

    .line 714
    .line 715
    :cond_d
    move-object v3, v0

    .line 716
    goto/16 :goto_4

    .line 717
    .line 718
    :goto_8
    iput-boolean v4, v3, Landroidx/paging/SeparatorState;->endTerminalSeparatorDeferred:Z

    .line 719
    .line 720
    iput-boolean v4, v3, Landroidx/paging/SeparatorState;->startTerminalSeparatorDeferred:Z

    .line 721
    .line 722
    iput-boolean v5, v3, Landroidx/paging/SeparatorState;->headerAdded:Z

    .line 723
    .line 724
    iput-boolean v5, v3, Landroidx/paging/SeparatorState;->footerAdded:Z

    .line 725
    .line 726
    if-nez v2, :cond_e

    .line 727
    .line 728
    invoke-virtual {v3, v1}, Landroidx/paging/SeparatorState;->asRType(Landroidx/paging/PageEvent$Insert;)Landroidx/paging/PageEvent$Insert;

    .line 729
    .line 730
    .line 731
    move-result-object v1

    .line 732
    return-object v1

    .line 733
    :cond_e
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getLoadType()Landroidx/paging/LoadType;

    .line 734
    .line 735
    .line 736
    move-result-object v3

    .line 737
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getPages()Ljava/util/List;

    .line 738
    .line 739
    .line 740
    filled-new-array {v4}, [I

    .line 741
    .line 742
    .line 743
    move-result-object v5

    .line 744
    invoke-static {v2, v5, v4, v4}, Landroidx/paging/SeparatorsKt;->separatorPage(Ljava/lang/Object;[III)Landroidx/paging/TransformablePage;

    .line 745
    .line 746
    .line 747
    move-result-object v2

    .line 748
    invoke-static {v2}, Li7/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 749
    .line 750
    .line 751
    move-result-object v4

    .line 752
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getPlaceholdersBefore()I

    .line 753
    .line 754
    .line 755
    move-result v5

    .line 756
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getPlaceholdersAfter()I

    .line 757
    .line 758
    .line 759
    move-result v6

    .line 760
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getSourceLoadStates()Landroidx/paging/LoadStates;

    .line 761
    .line 762
    .line 763
    move-result-object v7

    .line 764
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getMediatorLoadStates()Landroidx/paging/LoadStates;

    .line 765
    .line 766
    .line 767
    move-result-object v8

    .line 768
    new-instance v2, Landroidx/paging/PageEvent$Insert;

    .line 769
    .line 770
    const/4 v9, 0x0

    .line 771
    invoke-direct/range {v2 .. v9}, Landroidx/paging/PageEvent$Insert;-><init>(Landroidx/paging/LoadType;Ljava/util/List;IILandroidx/paging/LoadStates;Landroidx/paging/LoadStates;Lkotlin/jvm/internal/n;)V

    .line 772
    .line 773
    .line 774
    return-object v2

    .line 775
    :cond_f
    if-eqz v5, :cond_10

    .line 776
    .line 777
    iget-boolean v3, v0, Landroidx/paging/SeparatorState;->footerAdded:Z

    .line 778
    .line 779
    if-nez v3, :cond_10

    .line 780
    .line 781
    const/4 v5, 0x1

    .line 782
    iput-boolean v5, v0, Landroidx/paging/SeparatorState;->endTerminalSeparatorDeferred:Z

    .line 783
    .line 784
    goto :goto_9

    .line 785
    :cond_10
    const/4 v5, 0x1

    .line 786
    :goto_9
    if-eqz v2, :cond_11

    .line 787
    .line 788
    iget-boolean v2, v0, Landroidx/paging/SeparatorState;->headerAdded:Z

    .line 789
    .line 790
    if-nez v2, :cond_11

    .line 791
    .line 792
    iput-boolean v5, v0, Landroidx/paging/SeparatorState;->startTerminalSeparatorDeferred:Z

    .line 793
    .line 794
    :cond_11
    invoke-virtual/range {p0 .. p1}, Landroidx/paging/SeparatorState;->asRType(Landroidx/paging/PageEvent$Insert;)Landroidx/paging/PageEvent$Insert;

    .line 795
    .line 796
    .line 797
    move-result-object v1

    .line 798
    return-object v1

    .line 799
    :cond_12
    new-instance v7, Ljava/util/ArrayList;

    .line 800
    .line 801
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getPages()Ljava/util/List;

    .line 802
    .line 803
    .line 804
    move-result-object v8

    .line 805
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 806
    .line 807
    .line 808
    move-result v8

    .line 809
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 810
    .line 811
    .line 812
    new-instance v12, Ljava/util/ArrayList;

    .line 813
    .line 814
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getPages()Ljava/util/List;

    .line 815
    .line 816
    .line 817
    move-result-object v8

    .line 818
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 819
    .line 820
    .line 821
    move-result v8

    .line 822
    invoke-direct {v12, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 823
    .line 824
    .line 825
    if-nez v6, :cond_15

    .line 826
    .line 827
    const/4 v8, 0x0

    .line 828
    :goto_a
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getPages()Ljava/util/List;

    .line 829
    .line 830
    .line 831
    move-result-object v9

    .line 832
    invoke-static {v9}, Li7/v;->p(Ljava/util/List;)I

    .line 833
    .line 834
    .line 835
    move-result v9

    .line 836
    if-ge v8, v9, :cond_13

    .line 837
    .line 838
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getPages()Ljava/util/List;

    .line 839
    .line 840
    .line 841
    move-result-object v9

    .line 842
    invoke-interface {v9, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 843
    .line 844
    .line 845
    move-result-object v9

    .line 846
    check-cast v9, Landroidx/paging/TransformablePage;

    .line 847
    .line 848
    invoke-virtual {v9}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    .line 849
    .line 850
    .line 851
    move-result-object v9

    .line 852
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 853
    .line 854
    .line 855
    move-result v9

    .line 856
    if-eqz v9, :cond_13

    .line 857
    .line 858
    add-int/lit8 v8, v8, 0x1

    .line 859
    .line 860
    goto :goto_a

    .line 861
    :cond_13
    invoke-static {v8}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 862
    .line 863
    .line 864
    move-result-object v9

    .line 865
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getPages()Ljava/util/List;

    .line 866
    .line 867
    .line 868
    move-result-object v10

    .line 869
    invoke-interface {v10, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 870
    .line 871
    .line 872
    move-result-object v8

    .line 873
    check-cast v8, Landroidx/paging/TransformablePage;

    .line 874
    .line 875
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getPages()Ljava/util/List;

    .line 876
    .line 877
    .line 878
    move-result-object v10

    .line 879
    invoke-static {v10}, Li7/v;->p(Ljava/util/List;)I

    .line 880
    .line 881
    .line 882
    move-result v10

    .line 883
    :goto_b
    if-lez v10, :cond_14

    .line 884
    .line 885
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getPages()Ljava/util/List;

    .line 886
    .line 887
    .line 888
    move-result-object v11

    .line 889
    invoke-interface {v11, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 890
    .line 891
    .line 892
    move-result-object v11

    .line 893
    check-cast v11, Landroidx/paging/TransformablePage;

    .line 894
    .line 895
    invoke-virtual {v11}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    .line 896
    .line 897
    .line 898
    move-result-object v11

    .line 899
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    .line 900
    .line 901
    .line 902
    move-result v11

    .line 903
    if-eqz v11, :cond_14

    .line 904
    .line 905
    add-int/lit8 v10, v10, -0x1

    .line 906
    .line 907
    goto :goto_b

    .line 908
    :cond_14
    invoke-static {v10}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 909
    .line 910
    .line 911
    move-result-object v11

    .line 912
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getPages()Ljava/util/List;

    .line 913
    .line 914
    .line 915
    move-result-object v13

    .line 916
    invoke-interface {v13, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 917
    .line 918
    .line 919
    move-result-object v10

    .line 920
    check-cast v10, Landroidx/paging/TransformablePage;

    .line 921
    .line 922
    goto :goto_c

    .line 923
    :cond_15
    const/4 v8, 0x0

    .line 924
    const/4 v9, 0x0

    .line 925
    const/4 v10, 0x0

    .line 926
    const/4 v11, 0x0

    .line 927
    :goto_c
    if-eqz v2, :cond_19

    .line 928
    .line 929
    iget-boolean v2, v0, Landroidx/paging/SeparatorState;->headerAdded:Z

    .line 930
    .line 931
    if-nez v2, :cond_19

    .line 932
    .line 933
    const/4 v2, 0x1

    .line 934
    iput-boolean v2, v0, Landroidx/paging/SeparatorState;->headerAdded:Z

    .line 935
    .line 936
    if-eqz v6, :cond_16

    .line 937
    .line 938
    iget-object v2, v0, Landroidx/paging/SeparatorState;->pageStash:Ljava/util/List;

    .line 939
    .line 940
    invoke-static {v2}, Li7/f0;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 941
    .line 942
    .line 943
    move-result-object v2

    .line 944
    check-cast v2, Landroidx/paging/TransformablePage;

    .line 945
    .line 946
    goto :goto_d

    .line 947
    :cond_16
    invoke-static {v8}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 948
    .line 949
    .line 950
    move-object v2, v8

    .line 951
    :goto_d
    iget-object v13, v0, Landroidx/paging/SeparatorState;->generator:Lx7/q;

    .line 952
    .line 953
    invoke-virtual {v2}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    .line 954
    .line 955
    .line 956
    move-result-object v14

    .line 957
    invoke-static {v14}, Li7/f0;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 958
    .line 959
    .line 960
    move-result-object v14

    .line 961
    iput-object v0, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$0:Ljava/lang/Object;

    .line 962
    .line 963
    iput-object v1, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$1:Ljava/lang/Object;

    .line 964
    .line 965
    iput-object v7, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$2:Ljava/lang/Object;

    .line 966
    .line 967
    iput-object v12, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$3:Ljava/lang/Object;

    .line 968
    .line 969
    iput-object v8, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$4:Ljava/lang/Object;

    .line 970
    .line 971
    iput-object v9, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$5:Ljava/lang/Object;

    .line 972
    .line 973
    iput-object v10, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$6:Ljava/lang/Object;

    .line 974
    .line 975
    iput-object v11, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$7:Ljava/lang/Object;

    .line 976
    .line 977
    iput-object v2, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$8:Ljava/lang/Object;

    .line 978
    .line 979
    iput-object v7, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$9:Ljava/lang/Object;

    .line 980
    .line 981
    iput-boolean v5, v3, Landroidx/paging/SeparatorState$onInsert$1;->Z$0:Z

    .line 982
    .line 983
    iput v6, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$0:I

    .line 984
    .line 985
    const/4 v15, 0x2

    .line 986
    iput v15, v3, Landroidx/paging/SeparatorState$onInsert$1;->label:I

    .line 987
    .line 988
    const/4 v15, 0x0

    .line 989
    invoke-interface {v13, v15, v14, v3}, Lx7/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 990
    .line 991
    .line 992
    move-result-object v13

    .line 993
    if-ne v13, v4, :cond_17

    .line 994
    .line 995
    goto/16 :goto_26

    .line 996
    .line 997
    :cond_17
    move-object/from16 v20, v0

    .line 998
    .line 999
    move-object v14, v1

    .line 1000
    move v1, v6

    .line 1001
    move-object/from16 v19, v7

    .line 1002
    .line 1003
    move-object v15, v8

    .line 1004
    move-object/from16 v18, v12

    .line 1005
    .line 1006
    move-object v6, v13

    .line 1007
    move-object v8, v2

    .line 1008
    move v2, v5

    .line 1009
    move-object/from16 v5, v19

    .line 1010
    .line 1011
    move-object v13, v9

    .line 1012
    move-object v12, v10

    .line 1013
    :goto_e
    invoke-virtual {v8}, Landroidx/paging/TransformablePage;->getHintOriginalPageOffset()I

    .line 1014
    .line 1015
    .line 1016
    move-result v9

    .line 1017
    invoke-virtual {v8}, Landroidx/paging/TransformablePage;->getHintOriginalIndices()Ljava/util/List;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v7

    .line 1021
    if-eqz v7, :cond_18

    .line 1022
    .line 1023
    invoke-static {v7}, Li7/f0;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v7

    .line 1027
    check-cast v7, Ljava/lang/Number;

    .line 1028
    .line 1029
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 1030
    .line 1031
    .line 1032
    move-result v7

    .line 1033
    move v10, v7

    .line 1034
    goto :goto_f

    .line 1035
    :cond_18
    const/4 v10, 0x0

    .line 1036
    :goto_f
    const/4 v7, 0x0

    .line 1037
    invoke-static/range {v5 .. v10}, Landroidx/paging/SeparatorsKt;->addSeparatorPage(Ljava/util/List;Ljava/lang/Object;Landroidx/paging/TransformablePage;Landroidx/paging/TransformablePage;II)V

    .line 1038
    .line 1039
    .line 1040
    move v6, v1

    .line 1041
    move v5, v2

    .line 1042
    move-object v10, v12

    .line 1043
    move-object v9, v13

    .line 1044
    move-object v8, v15

    .line 1045
    move-object/from16 v12, v18

    .line 1046
    .line 1047
    move-object/from16 v7, v19

    .line 1048
    .line 1049
    goto :goto_10

    .line 1050
    :cond_19
    move-object/from16 v20, v0

    .line 1051
    .line 1052
    move-object v14, v1

    .line 1053
    :goto_10
    if-nez v6, :cond_30

    .line 1054
    .line 1055
    invoke-static {v9}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1056
    .line 1057
    .line 1058
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 1059
    .line 1060
    .line 1061
    move-result v1

    .line 1062
    move-object v2, v12

    .line 1063
    move-object v12, v7

    .line 1064
    move-object v7, v11

    .line 1065
    move-object v11, v2

    .line 1066
    move-object v2, v10

    .line 1067
    move-object v10, v8

    .line 1068
    move-object v8, v2

    .line 1069
    move v2, v5

    .line 1070
    move-object v13, v14

    .line 1071
    move-object/from16 v14, v20

    .line 1072
    .line 1073
    const/4 v5, 0x0

    .line 1074
    :goto_11
    if-ge v5, v1, :cond_1b

    .line 1075
    .line 1076
    invoke-virtual {v13}, Landroidx/paging/PageEvent$Insert;->getPages()Ljava/util/List;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v15

    .line 1080
    invoke-interface {v15, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v15

    .line 1084
    check-cast v15, Landroidx/paging/TransformablePage;

    .line 1085
    .line 1086
    iget-object v0, v14, Landroidx/paging/SeparatorState;->generator:Lx7/q;

    .line 1087
    .line 1088
    iput-object v14, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$0:Ljava/lang/Object;

    .line 1089
    .line 1090
    iput-object v13, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$1:Ljava/lang/Object;

    .line 1091
    .line 1092
    iput-object v12, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$2:Ljava/lang/Object;

    .line 1093
    .line 1094
    iput-object v11, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$3:Ljava/lang/Object;

    .line 1095
    .line 1096
    iput-object v10, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$4:Ljava/lang/Object;

    .line 1097
    .line 1098
    iput-object v9, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$5:Ljava/lang/Object;

    .line 1099
    .line 1100
    iput-object v8, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$6:Ljava/lang/Object;

    .line 1101
    .line 1102
    iput-object v7, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$7:Ljava/lang/Object;

    .line 1103
    .line 1104
    iput-object v12, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$8:Ljava/lang/Object;

    .line 1105
    .line 1106
    move-object/from16 v18, v7

    .line 1107
    .line 1108
    const/4 v7, 0x0

    .line 1109
    iput-object v7, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$9:Ljava/lang/Object;

    .line 1110
    .line 1111
    iput-boolean v2, v3, Landroidx/paging/SeparatorState$onInsert$1;->Z$0:Z

    .line 1112
    .line 1113
    iput v6, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$0:I

    .line 1114
    .line 1115
    iput v5, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$1:I

    .line 1116
    .line 1117
    iput v1, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$2:I

    .line 1118
    .line 1119
    const/4 v7, 0x3

    .line 1120
    iput v7, v3, Landroidx/paging/SeparatorState$onInsert$1;->label:I

    .line 1121
    .line 1122
    invoke-static {v15, v0, v3}, Landroidx/paging/SeparatorsKt;->insertInternalSeparators(Landroidx/paging/TransformablePage;Lx7/q;Lm7/c;)Ljava/lang/Object;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v0

    .line 1126
    if-ne v0, v4, :cond_1a

    .line 1127
    .line 1128
    goto/16 :goto_26

    .line 1129
    .line 1130
    :cond_1a
    move v7, v2

    .line 1131
    move-object v2, v0

    .line 1132
    move-object v0, v14

    .line 1133
    move-object v14, v12

    .line 1134
    move-object v12, v10

    .line 1135
    move-object v10, v8

    .line 1136
    move-object v8, v14

    .line 1137
    :goto_12
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1138
    .line 1139
    .line 1140
    const/16 v17, 0x1

    .line 1141
    .line 1142
    add-int/lit8 v5, v5, 0x1

    .line 1143
    .line 1144
    move v2, v7

    .line 1145
    move-object v8, v10

    .line 1146
    move-object v10, v12

    .line 1147
    move-object v12, v14

    .line 1148
    move-object/from16 v7, v18

    .line 1149
    .line 1150
    move-object v14, v0

    .line 1151
    move-object/from16 v0, p0

    .line 1152
    .line 1153
    goto :goto_11

    .line 1154
    :cond_1b
    move-object/from16 v18, v7

    .line 1155
    .line 1156
    invoke-virtual {v13}, Landroidx/paging/PageEvent$Insert;->getLoadType()Landroidx/paging/LoadType;

    .line 1157
    .line 1158
    .line 1159
    move-result-object v0

    .line 1160
    sget-object v1, Landroidx/paging/LoadType;->APPEND:Landroidx/paging/LoadType;

    .line 1161
    .line 1162
    if-ne v0, v1, :cond_1e

    .line 1163
    .line 1164
    iget-object v0, v14, Landroidx/paging/SeparatorState;->pageStash:Ljava/util/List;

    .line 1165
    .line 1166
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 1167
    .line 1168
    .line 1169
    move-result v0

    .line 1170
    if-nez v0, :cond_1e

    .line 1171
    .line 1172
    iget-object v0, v14, Landroidx/paging/SeparatorState;->pageStash:Ljava/util/List;

    .line 1173
    .line 1174
    invoke-static {v0}, Li7/f0;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v0

    .line 1178
    check-cast v0, Landroidx/paging/TransformablePage;

    .line 1179
    .line 1180
    iget-object v1, v14, Landroidx/paging/SeparatorState;->generator:Lx7/q;

    .line 1181
    .line 1182
    invoke-virtual {v0}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    .line 1183
    .line 1184
    .line 1185
    move-result-object v5

    .line 1186
    invoke-static {v5}, Li7/f0;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v5

    .line 1190
    invoke-static {v10}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1191
    .line 1192
    .line 1193
    invoke-virtual {v10}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    .line 1194
    .line 1195
    .line 1196
    move-result-object v7

    .line 1197
    invoke-static {v7}, Li7/f0;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 1198
    .line 1199
    .line 1200
    move-result-object v7

    .line 1201
    iput-object v14, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$0:Ljava/lang/Object;

    .line 1202
    .line 1203
    iput-object v13, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$1:Ljava/lang/Object;

    .line 1204
    .line 1205
    iput-object v12, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$2:Ljava/lang/Object;

    .line 1206
    .line 1207
    iput-object v11, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$3:Ljava/lang/Object;

    .line 1208
    .line 1209
    iput-object v10, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$4:Ljava/lang/Object;

    .line 1210
    .line 1211
    iput-object v9, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$5:Ljava/lang/Object;

    .line 1212
    .line 1213
    iput-object v8, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$6:Ljava/lang/Object;

    .line 1214
    .line 1215
    move-object/from16 v15, v18

    .line 1216
    .line 1217
    iput-object v15, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$7:Ljava/lang/Object;

    .line 1218
    .line 1219
    iput-object v0, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$8:Ljava/lang/Object;

    .line 1220
    .line 1221
    move-object/from16 p1, v0

    .line 1222
    .line 1223
    const/4 v0, 0x0

    .line 1224
    iput-object v0, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$9:Ljava/lang/Object;

    .line 1225
    .line 1226
    iput-boolean v2, v3, Landroidx/paging/SeparatorState$onInsert$1;->Z$0:Z

    .line 1227
    .line 1228
    iput v6, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$0:I

    .line 1229
    .line 1230
    const/4 v0, 0x4

    .line 1231
    iput v0, v3, Landroidx/paging/SeparatorState$onInsert$1;->label:I

    .line 1232
    .line 1233
    invoke-interface {v1, v5, v7, v3}, Lx7/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1234
    .line 1235
    .line 1236
    move-result-object v0

    .line 1237
    if-ne v0, v4, :cond_1c

    .line 1238
    .line 1239
    goto/16 :goto_26

    .line 1240
    .line 1241
    :cond_1c
    move-object/from16 v7, p1

    .line 1242
    .line 1243
    move v1, v6

    .line 1244
    move-object v6, v0

    .line 1245
    move-object v5, v12

    .line 1246
    move-object v0, v8

    .line 1247
    move-object v8, v10

    .line 1248
    goto/16 :goto_3

    .line 1249
    .line 1250
    :goto_13
    invoke-virtual {v8}, Landroidx/paging/TransformablePage;->getHintOriginalPageOffset()I

    .line 1251
    .line 1252
    .line 1253
    move-result v9

    .line 1254
    invoke-virtual {v8}, Landroidx/paging/TransformablePage;->getHintOriginalIndices()Ljava/util/List;

    .line 1255
    .line 1256
    .line 1257
    move-result-object v10

    .line 1258
    if-eqz v10, :cond_1d

    .line 1259
    .line 1260
    invoke-static {v10}, Li7/f0;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v10

    .line 1264
    check-cast v10, Ljava/lang/Number;

    .line 1265
    .line 1266
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 1267
    .line 1268
    .line 1269
    move-result v10

    .line 1270
    goto :goto_14

    .line 1271
    :cond_1d
    const/4 v10, 0x0

    .line 1272
    :goto_14
    invoke-static/range {v5 .. v10}, Landroidx/paging/SeparatorsKt;->addSeparatorPage(Ljava/util/List;Ljava/lang/Object;Landroidx/paging/TransformablePage;Landroidx/paging/TransformablePage;II)V

    .line 1273
    .line 1274
    .line 1275
    move-object v6, v8

    .line 1276
    move-object v8, v0

    .line 1277
    move-object v0, v6

    .line 1278
    move-object v6, v5

    .line 1279
    move-object v9, v11

    .line 1280
    move-object v10, v12

    .line 1281
    move-object v12, v13

    .line 1282
    move-object v13, v14

    .line 1283
    move-object v7, v15

    .line 1284
    move v5, v2

    .line 1285
    goto :goto_15

    .line 1286
    :cond_1e
    move-object/from16 v15, v18

    .line 1287
    .line 1288
    move v1, v6

    .line 1289
    move-object v0, v10

    .line 1290
    move-object v10, v11

    .line 1291
    move-object v6, v12

    .line 1292
    move v5, v2

    .line 1293
    move-object v12, v13

    .line 1294
    move-object v13, v14

    .line 1295
    move-object v7, v15

    .line 1296
    :goto_15
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1297
    .line 1298
    .line 1299
    invoke-direct {v13, v0}, Landroidx/paging/SeparatorState;->transformablePageToStash(Landroidx/paging/TransformablePage;)Landroidx/paging/TransformablePage;

    .line 1300
    .line 1301
    .line 1302
    move-result-object v2

    .line 1303
    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1304
    .line 1305
    .line 1306
    iget-object v2, v13, Landroidx/paging/SeparatorState;->generator:Lx7/q;

    .line 1307
    .line 1308
    iput-object v13, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$0:Ljava/lang/Object;

    .line 1309
    .line 1310
    iput-object v12, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$1:Ljava/lang/Object;

    .line 1311
    .line 1312
    iput-object v6, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$2:Ljava/lang/Object;

    .line 1313
    .line 1314
    iput-object v10, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$3:Ljava/lang/Object;

    .line 1315
    .line 1316
    iput-object v9, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$4:Ljava/lang/Object;

    .line 1317
    .line 1318
    iput-object v8, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$5:Ljava/lang/Object;

    .line 1319
    .line 1320
    iput-object v7, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$6:Ljava/lang/Object;

    .line 1321
    .line 1322
    iput-object v6, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$7:Ljava/lang/Object;

    .line 1323
    .line 1324
    const/4 v15, 0x0

    .line 1325
    iput-object v15, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$8:Ljava/lang/Object;

    .line 1326
    .line 1327
    iput-object v15, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$9:Ljava/lang/Object;

    .line 1328
    .line 1329
    iput-boolean v5, v3, Landroidx/paging/SeparatorState$onInsert$1;->Z$0:Z

    .line 1330
    .line 1331
    iput v1, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$0:I

    .line 1332
    .line 1333
    const/4 v11, 0x5

    .line 1334
    iput v11, v3, Landroidx/paging/SeparatorState$onInsert$1;->label:I

    .line 1335
    .line 1336
    invoke-static {v0, v2, v3}, Landroidx/paging/SeparatorsKt;->insertInternalSeparators(Landroidx/paging/TransformablePage;Lx7/q;Lm7/c;)Ljava/lang/Object;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v2

    .line 1340
    if-ne v2, v4, :cond_1f

    .line 1341
    .line 1342
    goto/16 :goto_26

    .line 1343
    .line 1344
    :cond_1f
    move-object v11, v6

    .line 1345
    :goto_16
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1346
    .line 1347
    .line 1348
    invoke-virtual {v12}, Landroidx/paging/PageEvent$Insert;->getPages()Ljava/util/List;

    .line 1349
    .line 1350
    .line 1351
    move-result-object v0

    .line 1352
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 1353
    .line 1354
    .line 1355
    move-result v2

    .line 1356
    invoke-static {v7}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1357
    .line 1358
    .line 1359
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 1360
    .line 1361
    .line 1362
    move-result v6

    .line 1363
    const/16 v17, 0x1

    .line 1364
    .line 1365
    add-int/lit8 v6, v6, 0x1

    .line 1366
    .line 1367
    invoke-interface {v0, v2, v6}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 1368
    .line 1369
    .line 1370
    move-result-object v0

    .line 1371
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v0

    .line 1375
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1376
    .line 1377
    .line 1378
    move-result v2

    .line 1379
    if-eqz v2, :cond_2f

    .line 1380
    .line 1381
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1382
    .line 1383
    .line 1384
    move-result-object v2

    .line 1385
    move-object v9, v7

    .line 1386
    move-object v14, v13

    .line 1387
    move-object v13, v12

    .line 1388
    move-object v12, v11

    .line 1389
    move-object v11, v10

    .line 1390
    move-object v10, v8

    .line 1391
    move-object v8, v0

    .line 1392
    :goto_17
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1393
    .line 1394
    .line 1395
    move-result v0

    .line 1396
    if-eqz v0, :cond_29

    .line 1397
    .line 1398
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1399
    .line 1400
    .line 1401
    move-result-object v0

    .line 1402
    move-object v7, v0

    .line 1403
    check-cast v7, Landroidx/paging/TransformablePage;

    .line 1404
    .line 1405
    move-object v6, v2

    .line 1406
    check-cast v6, Landroidx/paging/TransformablePage;

    .line 1407
    .line 1408
    invoke-virtual {v7}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    .line 1409
    .line 1410
    .line 1411
    move-result-object v0

    .line 1412
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 1413
    .line 1414
    .line 1415
    move-result v0

    .line 1416
    if-nez v0, :cond_25

    .line 1417
    .line 1418
    iget-object v0, v14, Landroidx/paging/SeparatorState;->generator:Lx7/q;

    .line 1419
    .line 1420
    invoke-virtual {v6}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    .line 1421
    .line 1422
    .line 1423
    move-result-object v2

    .line 1424
    invoke-static {v2}, Li7/f0;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 1425
    .line 1426
    .line 1427
    move-result-object v2

    .line 1428
    invoke-virtual {v7}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    .line 1429
    .line 1430
    .line 1431
    move-result-object v15

    .line 1432
    invoke-static {v15}, Li7/f0;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 1433
    .line 1434
    .line 1435
    move-result-object v15

    .line 1436
    iput-object v14, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$0:Ljava/lang/Object;

    .line 1437
    .line 1438
    iput-object v13, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$1:Ljava/lang/Object;

    .line 1439
    .line 1440
    iput-object v12, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$2:Ljava/lang/Object;

    .line 1441
    .line 1442
    iput-object v11, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$3:Ljava/lang/Object;

    .line 1443
    .line 1444
    iput-object v10, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$4:Ljava/lang/Object;

    .line 1445
    .line 1446
    iput-object v9, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$5:Ljava/lang/Object;

    .line 1447
    .line 1448
    iput-object v8, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$6:Ljava/lang/Object;

    .line 1449
    .line 1450
    iput-object v7, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$7:Ljava/lang/Object;

    .line 1451
    .line 1452
    iput-object v6, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$8:Ljava/lang/Object;

    .line 1453
    .line 1454
    move-object/from16 p1, v6

    .line 1455
    .line 1456
    const/4 v6, 0x0

    .line 1457
    iput-object v6, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$9:Ljava/lang/Object;

    .line 1458
    .line 1459
    iput-boolean v5, v3, Landroidx/paging/SeparatorState$onInsert$1;->Z$0:Z

    .line 1460
    .line 1461
    iput v1, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$0:I

    .line 1462
    .line 1463
    const/4 v6, 0x6

    .line 1464
    iput v6, v3, Landroidx/paging/SeparatorState$onInsert$1;->label:I

    .line 1465
    .line 1466
    invoke-interface {v0, v2, v15, v3}, Lx7/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1467
    .line 1468
    .line 1469
    move-result-object v2

    .line 1470
    if-ne v2, v4, :cond_20

    .line 1471
    .line 1472
    goto/16 :goto_26

    .line 1473
    .line 1474
    :cond_20
    move-object v6, v2

    .line 1475
    move-object v2, v8

    .line 1476
    move-object v8, v7

    .line 1477
    move-object/from16 v7, p1

    .line 1478
    .line 1479
    goto/16 :goto_2

    .line 1480
    .line 1481
    :goto_18
    invoke-virtual {v14}, Landroidx/paging/PageEvent$Insert;->getLoadType()Landroidx/paging/LoadType;

    .line 1482
    .line 1483
    .line 1484
    move-result-object v9

    .line 1485
    sget-object v10, Landroidx/paging/LoadType;->PREPEND:Landroidx/paging/LoadType;

    .line 1486
    .line 1487
    if-ne v9, v10, :cond_21

    .line 1488
    .line 1489
    invoke-virtual {v7}, Landroidx/paging/TransformablePage;->getHintOriginalPageOffset()I

    .line 1490
    .line 1491
    .line 1492
    move-result v9

    .line 1493
    :goto_19
    move/from16 p1, v0

    .line 1494
    .line 1495
    goto :goto_1a

    .line 1496
    :cond_21
    invoke-virtual {v8}, Landroidx/paging/TransformablePage;->getHintOriginalPageOffset()I

    .line 1497
    .line 1498
    .line 1499
    move-result v9

    .line 1500
    goto :goto_19

    .line 1501
    :goto_1a
    invoke-virtual {v14}, Landroidx/paging/PageEvent$Insert;->getLoadType()Landroidx/paging/LoadType;

    .line 1502
    .line 1503
    .line 1504
    move-result-object v0

    .line 1505
    if-ne v0, v10, :cond_23

    .line 1506
    .line 1507
    invoke-virtual {v7}, Landroidx/paging/TransformablePage;->getHintOriginalIndices()Ljava/util/List;

    .line 1508
    .line 1509
    .line 1510
    move-result-object v0

    .line 1511
    if-eqz v0, :cond_22

    .line 1512
    .line 1513
    invoke-static {v0}, Li7/f0;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 1514
    .line 1515
    .line 1516
    move-result-object v0

    .line 1517
    check-cast v0, Ljava/lang/Number;

    .line 1518
    .line 1519
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 1520
    .line 1521
    .line 1522
    move-result v0

    .line 1523
    :goto_1b
    move v10, v0

    .line 1524
    goto :goto_1c

    .line 1525
    :cond_22
    invoke-virtual {v7}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    .line 1526
    .line 1527
    .line 1528
    move-result-object v0

    .line 1529
    invoke-static {v0}, Li7/v;->p(Ljava/util/List;)I

    .line 1530
    .line 1531
    .line 1532
    move-result v0

    .line 1533
    goto :goto_1b

    .line 1534
    :cond_23
    invoke-virtual {v8}, Landroidx/paging/TransformablePage;->getHintOriginalIndices()Ljava/util/List;

    .line 1535
    .line 1536
    .line 1537
    move-result-object v0

    .line 1538
    if-eqz v0, :cond_24

    .line 1539
    .line 1540
    invoke-static {v0}, Li7/f0;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 1541
    .line 1542
    .line 1543
    move-result-object v0

    .line 1544
    check-cast v0, Ljava/lang/Number;

    .line 1545
    .line 1546
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 1547
    .line 1548
    .line 1549
    move-result v0

    .line 1550
    goto :goto_1b

    .line 1551
    :cond_24
    const/4 v10, 0x0

    .line 1552
    :goto_1c
    invoke-static/range {v5 .. v10}, Landroidx/paging/SeparatorsKt;->addSeparatorPage(Ljava/util/List;Ljava/lang/Object;Landroidx/paging/TransformablePage;Landroidx/paging/TransformablePage;II)V

    .line 1553
    .line 1554
    .line 1555
    move-object v6, v5

    .line 1556
    move-object v9, v7

    .line 1557
    move-object v10, v8

    .line 1558
    move-object v8, v14

    .line 1559
    move-object v7, v15

    .line 1560
    move/from16 v5, p1

    .line 1561
    .line 1562
    move-object v14, v13

    .line 1563
    move-object v13, v12

    .line 1564
    move-object v12, v11

    .line 1565
    move-object v11, v2

    .line 1566
    goto :goto_1d

    .line 1567
    :cond_25
    move-object/from16 p1, v6

    .line 1568
    .line 1569
    move-object v6, v10

    .line 1570
    move-object v10, v7

    .line 1571
    move-object v7, v14

    .line 1572
    move-object v14, v11

    .line 1573
    move-object v11, v8

    .line 1574
    move-object v8, v13

    .line 1575
    move-object v13, v6

    .line 1576
    move-object v6, v12

    .line 1577
    move-object v12, v9

    .line 1578
    move-object/from16 v9, p1

    .line 1579
    .line 1580
    :goto_1d
    invoke-virtual {v10}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    .line 1581
    .line 1582
    .line 1583
    move-result-object v0

    .line 1584
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 1585
    .line 1586
    .line 1587
    move-result v0

    .line 1588
    if-nez v0, :cond_26

    .line 1589
    .line 1590
    invoke-direct {v7, v10}, Landroidx/paging/SeparatorState;->transformablePageToStash(Landroidx/paging/TransformablePage;)Landroidx/paging/TransformablePage;

    .line 1591
    .line 1592
    .line 1593
    move-result-object v0

    .line 1594
    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1595
    .line 1596
    .line 1597
    :cond_26
    iget-object v0, v7, Landroidx/paging/SeparatorState;->generator:Lx7/q;

    .line 1598
    .line 1599
    iput-object v7, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$0:Ljava/lang/Object;

    .line 1600
    .line 1601
    iput-object v8, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$1:Ljava/lang/Object;

    .line 1602
    .line 1603
    iput-object v6, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$2:Ljava/lang/Object;

    .line 1604
    .line 1605
    iput-object v14, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$3:Ljava/lang/Object;

    .line 1606
    .line 1607
    iput-object v13, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$4:Ljava/lang/Object;

    .line 1608
    .line 1609
    iput-object v12, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$5:Ljava/lang/Object;

    .line 1610
    .line 1611
    iput-object v11, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$6:Ljava/lang/Object;

    .line 1612
    .line 1613
    iput-object v10, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$7:Ljava/lang/Object;

    .line 1614
    .line 1615
    iput-object v9, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$8:Ljava/lang/Object;

    .line 1616
    .line 1617
    iput-object v6, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$9:Ljava/lang/Object;

    .line 1618
    .line 1619
    iput-boolean v5, v3, Landroidx/paging/SeparatorState$onInsert$1;->Z$0:Z

    .line 1620
    .line 1621
    iput v1, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$0:I

    .line 1622
    .line 1623
    const/4 v2, 0x7

    .line 1624
    iput v2, v3, Landroidx/paging/SeparatorState$onInsert$1;->label:I

    .line 1625
    .line 1626
    invoke-static {v10, v0, v3}, Landroidx/paging/SeparatorsKt;->insertInternalSeparators(Landroidx/paging/TransformablePage;Lx7/q;Lm7/c;)Ljava/lang/Object;

    .line 1627
    .line 1628
    .line 1629
    move-result-object v2

    .line 1630
    if-ne v2, v4, :cond_27

    .line 1631
    .line 1632
    goto/16 :goto_26

    .line 1633
    .line 1634
    :cond_27
    move-object v15, v6

    .line 1635
    goto/16 :goto_1

    .line 1636
    .line 1637
    :goto_1e
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1638
    .line 1639
    .line 1640
    invoke-virtual {v10}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    .line 1641
    .line 1642
    .line 1643
    move-result-object v2

    .line 1644
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 1645
    .line 1646
    .line 1647
    move-result v2

    .line 1648
    if-nez v2, :cond_28

    .line 1649
    .line 1650
    move-object v2, v10

    .line 1651
    goto :goto_1f

    .line 1652
    :cond_28
    move-object v2, v9

    .line 1653
    :goto_1f
    move-object v9, v12

    .line 1654
    move-object v10, v13

    .line 1655
    move-object v12, v15

    .line 1656
    move-object v13, v0

    .line 1657
    goto/16 :goto_17

    .line 1658
    .line 1659
    :cond_29
    invoke-virtual {v13}, Landroidx/paging/PageEvent$Insert;->getLoadType()Landroidx/paging/LoadType;

    .line 1660
    .line 1661
    .line 1662
    move-result-object v0

    .line 1663
    sget-object v2, Landroidx/paging/LoadType;->PREPEND:Landroidx/paging/LoadType;

    .line 1664
    .line 1665
    if-ne v0, v2, :cond_2b

    .line 1666
    .line 1667
    iget-object v0, v14, Landroidx/paging/SeparatorState;->pageStash:Ljava/util/List;

    .line 1668
    .line 1669
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 1670
    .line 1671
    .line 1672
    move-result v0

    .line 1673
    if-nez v0, :cond_2b

    .line 1674
    .line 1675
    iget-object v0, v14, Landroidx/paging/SeparatorState;->pageStash:Ljava/util/List;

    .line 1676
    .line 1677
    invoke-static {v0}, Li7/f0;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 1678
    .line 1679
    .line 1680
    move-result-object v0

    .line 1681
    move-object v6, v0

    .line 1682
    check-cast v6, Landroidx/paging/TransformablePage;

    .line 1683
    .line 1684
    iget-object v0, v14, Landroidx/paging/SeparatorState;->generator:Lx7/q;

    .line 1685
    .line 1686
    invoke-static {v10}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1687
    .line 1688
    .line 1689
    invoke-virtual {v10}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    .line 1690
    .line 1691
    .line 1692
    move-result-object v2

    .line 1693
    invoke-static {v2}, Li7/f0;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 1694
    .line 1695
    .line 1696
    move-result-object v2

    .line 1697
    invoke-virtual {v6}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    .line 1698
    .line 1699
    .line 1700
    move-result-object v7

    .line 1701
    invoke-static {v7}, Li7/f0;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 1702
    .line 1703
    .line 1704
    move-result-object v7

    .line 1705
    iput-object v14, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$0:Ljava/lang/Object;

    .line 1706
    .line 1707
    iput-object v13, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$1:Ljava/lang/Object;

    .line 1708
    .line 1709
    iput-object v12, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$2:Ljava/lang/Object;

    .line 1710
    .line 1711
    iput-object v11, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$3:Ljava/lang/Object;

    .line 1712
    .line 1713
    iput-object v10, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$4:Ljava/lang/Object;

    .line 1714
    .line 1715
    iput-object v9, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$5:Ljava/lang/Object;

    .line 1716
    .line 1717
    iput-object v6, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$6:Ljava/lang/Object;

    .line 1718
    .line 1719
    const/4 v15, 0x0

    .line 1720
    iput-object v15, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$7:Ljava/lang/Object;

    .line 1721
    .line 1722
    iput-object v15, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$8:Ljava/lang/Object;

    .line 1723
    .line 1724
    iput-object v15, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$9:Ljava/lang/Object;

    .line 1725
    .line 1726
    iput-boolean v5, v3, Landroidx/paging/SeparatorState$onInsert$1;->Z$0:Z

    .line 1727
    .line 1728
    iput v1, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$0:I

    .line 1729
    .line 1730
    const/16 v8, 0x8

    .line 1731
    .line 1732
    iput v8, v3, Landroidx/paging/SeparatorState$onInsert$1;->label:I

    .line 1733
    .line 1734
    invoke-interface {v0, v2, v7, v3}, Lx7/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1735
    .line 1736
    .line 1737
    move-result-object v2

    .line 1738
    if-ne v2, v4, :cond_1

    .line 1739
    .line 1740
    goto/16 :goto_26

    .line 1741
    .line 1742
    :goto_20
    invoke-virtual {v7}, Landroidx/paging/TransformablePage;->getHintOriginalPageOffset()I

    .line 1743
    .line 1744
    .line 1745
    move-result v9

    .line 1746
    invoke-virtual {v7}, Landroidx/paging/TransformablePage;->getHintOriginalIndices()Ljava/util/List;

    .line 1747
    .line 1748
    .line 1749
    move-result-object v10

    .line 1750
    if-eqz v10, :cond_2a

    .line 1751
    .line 1752
    invoke-static {v10}, Li7/f0;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 1753
    .line 1754
    .line 1755
    move-result-object v10

    .line 1756
    check-cast v10, Ljava/lang/Number;

    .line 1757
    .line 1758
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 1759
    .line 1760
    .line 1761
    move-result v10

    .line 1762
    goto :goto_21

    .line 1763
    :cond_2a
    invoke-virtual {v7}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    .line 1764
    .line 1765
    .line 1766
    move-result-object v10

    .line 1767
    invoke-static {v10}, Li7/v;->p(Ljava/util/List;)I

    .line 1768
    .line 1769
    .line 1770
    move-result v10

    .line 1771
    :goto_21
    invoke-static/range {v5 .. v10}, Landroidx/paging/SeparatorsKt;->addSeparatorPage(Ljava/util/List;Ljava/lang/Object;Landroidx/paging/TransformablePage;Landroidx/paging/TransformablePage;II)V

    .line 1772
    .line 1773
    .line 1774
    move-object v9, v2

    .line 1775
    move-object v12, v5

    .line 1776
    move-object v10, v7

    .line 1777
    move v5, v0

    .line 1778
    :cond_2b
    move v6, v1

    .line 1779
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 1780
    .line 1781
    .line 1782
    move-result v0

    .line 1783
    const/16 v17, 0x1

    .line 1784
    .line 1785
    add-int/lit8 v0, v0, 0x1

    .line 1786
    .line 1787
    invoke-virtual {v13}, Landroidx/paging/PageEvent$Insert;->getPages()Ljava/util/List;

    .line 1788
    .line 1789
    .line 1790
    move-result-object v1

    .line 1791
    invoke-static {v1}, Li7/v;->p(Ljava/util/List;)I

    .line 1792
    .line 1793
    .line 1794
    move-result v1

    .line 1795
    if-gt v0, v1, :cond_2e

    .line 1796
    .line 1797
    move v9, v6

    .line 1798
    move-object v15, v13

    .line 1799
    move-object v6, v14

    .line 1800
    move-object v13, v11

    .line 1801
    move-object v11, v12

    .line 1802
    move-object v12, v10

    .line 1803
    move v10, v5

    .line 1804
    move v5, v0

    .line 1805
    :goto_22
    invoke-virtual {v15}, Landroidx/paging/PageEvent$Insert;->getPages()Ljava/util/List;

    .line 1806
    .line 1807
    .line 1808
    move-result-object v0

    .line 1809
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1810
    .line 1811
    .line 1812
    move-result-object v0

    .line 1813
    check-cast v0, Landroidx/paging/TransformablePage;

    .line 1814
    .line 1815
    iget-object v2, v6, Landroidx/paging/SeparatorState;->generator:Lx7/q;

    .line 1816
    .line 1817
    iput-object v6, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$0:Ljava/lang/Object;

    .line 1818
    .line 1819
    iput-object v15, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$1:Ljava/lang/Object;

    .line 1820
    .line 1821
    iput-object v11, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$2:Ljava/lang/Object;

    .line 1822
    .line 1823
    iput-object v13, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$3:Ljava/lang/Object;

    .line 1824
    .line 1825
    iput-object v12, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$4:Ljava/lang/Object;

    .line 1826
    .line 1827
    iput-object v11, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$5:Ljava/lang/Object;

    .line 1828
    .line 1829
    const/4 v7, 0x0

    .line 1830
    iput-object v7, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$6:Ljava/lang/Object;

    .line 1831
    .line 1832
    iput-object v7, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$7:Ljava/lang/Object;

    .line 1833
    .line 1834
    iput-object v7, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$8:Ljava/lang/Object;

    .line 1835
    .line 1836
    iput-object v7, v3, Landroidx/paging/SeparatorState$onInsert$1;->L$9:Ljava/lang/Object;

    .line 1837
    .line 1838
    iput-boolean v10, v3, Landroidx/paging/SeparatorState$onInsert$1;->Z$0:Z

    .line 1839
    .line 1840
    iput v9, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$0:I

    .line 1841
    .line 1842
    iput v5, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$1:I

    .line 1843
    .line 1844
    iput v1, v3, Landroidx/paging/SeparatorState$onInsert$1;->I$2:I

    .line 1845
    .line 1846
    const/16 v7, 0x9

    .line 1847
    .line 1848
    iput v7, v3, Landroidx/paging/SeparatorState$onInsert$1;->label:I

    .line 1849
    .line 1850
    invoke-static {v0, v2, v3}, Landroidx/paging/SeparatorsKt;->insertInternalSeparators(Landroidx/paging/TransformablePage;Lx7/q;Lm7/c;)Ljava/lang/Object;

    .line 1851
    .line 1852
    .line 1853
    move-result-object v2

    .line 1854
    if-ne v2, v4, :cond_2c

    .line 1855
    .line 1856
    goto/16 :goto_26

    .line 1857
    .line 1858
    :cond_2c
    move-object v14, v11

    .line 1859
    :goto_23
    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1860
    .line 1861
    .line 1862
    if-eq v5, v1, :cond_2d

    .line 1863
    .line 1864
    add-int/lit8 v5, v5, 0x1

    .line 1865
    .line 1866
    move-object v11, v14

    .line 1867
    goto :goto_22

    .line 1868
    :cond_2d
    move-object v0, v3

    .line 1869
    move-object v3, v6

    .line 1870
    move v6, v9

    .line 1871
    move v5, v10

    .line 1872
    move-object v10, v12

    .line 1873
    move-object v1, v14

    .line 1874
    move-object v8, v15

    .line 1875
    goto :goto_24

    .line 1876
    :cond_2e
    move-object v0, v3

    .line 1877
    move-object v1, v12

    .line 1878
    move-object v8, v13

    .line 1879
    move-object v3, v14

    .line 1880
    move-object v13, v11

    .line 1881
    goto :goto_24

    .line 1882
    :cond_2f
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 1883
    .line 1884
    const-string v1, "Empty collection can\'t be reduced."

    .line 1885
    .line 1886
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 1887
    .line 1888
    .line 1889
    throw v0

    .line 1890
    :cond_30
    move-object v0, v3

    .line 1891
    move-object v1, v7

    .line 1892
    move-object v13, v12

    .line 1893
    move-object v8, v14

    .line 1894
    move-object/from16 v3, v20

    .line 1895
    .line 1896
    :goto_24
    if-eqz v5, :cond_34

    .line 1897
    .line 1898
    iget-boolean v2, v3, Landroidx/paging/SeparatorState;->footerAdded:Z

    .line 1899
    .line 1900
    if-nez v2, :cond_34

    .line 1901
    .line 1902
    const/4 v5, 0x1

    .line 1903
    iput-boolean v5, v3, Landroidx/paging/SeparatorState;->footerAdded:Z

    .line 1904
    .line 1905
    if-eqz v6, :cond_31

    .line 1906
    .line 1907
    iget-object v2, v3, Landroidx/paging/SeparatorState;->pageStash:Ljava/util/List;

    .line 1908
    .line 1909
    invoke-static {v2}, Li7/f0;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 1910
    .line 1911
    .line 1912
    move-result-object v2

    .line 1913
    check-cast v2, Landroidx/paging/TransformablePage;

    .line 1914
    .line 1915
    goto :goto_25

    .line 1916
    :cond_31
    invoke-static {v10}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1917
    .line 1918
    .line 1919
    move-object v2, v10

    .line 1920
    :goto_25
    iget-object v5, v3, Landroidx/paging/SeparatorState;->generator:Lx7/q;

    .line 1921
    .line 1922
    invoke-virtual {v2}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    .line 1923
    .line 1924
    .line 1925
    move-result-object v6

    .line 1926
    invoke-static {v6}, Li7/f0;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 1927
    .line 1928
    .line 1929
    move-result-object v6

    .line 1930
    iput-object v3, v0, Landroidx/paging/SeparatorState$onInsert$1;->L$0:Ljava/lang/Object;

    .line 1931
    .line 1932
    iput-object v8, v0, Landroidx/paging/SeparatorState$onInsert$1;->L$1:Ljava/lang/Object;

    .line 1933
    .line 1934
    iput-object v1, v0, Landroidx/paging/SeparatorState$onInsert$1;->L$2:Ljava/lang/Object;

    .line 1935
    .line 1936
    iput-object v13, v0, Landroidx/paging/SeparatorState$onInsert$1;->L$3:Ljava/lang/Object;

    .line 1937
    .line 1938
    iput-object v2, v0, Landroidx/paging/SeparatorState$onInsert$1;->L$4:Ljava/lang/Object;

    .line 1939
    .line 1940
    iput-object v1, v0, Landroidx/paging/SeparatorState$onInsert$1;->L$5:Ljava/lang/Object;

    .line 1941
    .line 1942
    const/4 v15, 0x0

    .line 1943
    iput-object v15, v0, Landroidx/paging/SeparatorState$onInsert$1;->L$6:Ljava/lang/Object;

    .line 1944
    .line 1945
    iput-object v15, v0, Landroidx/paging/SeparatorState$onInsert$1;->L$7:Ljava/lang/Object;

    .line 1946
    .line 1947
    iput-object v15, v0, Landroidx/paging/SeparatorState$onInsert$1;->L$8:Ljava/lang/Object;

    .line 1948
    .line 1949
    iput-object v15, v0, Landroidx/paging/SeparatorState$onInsert$1;->L$9:Ljava/lang/Object;

    .line 1950
    .line 1951
    const/16 v7, 0xa

    .line 1952
    .line 1953
    iput v7, v0, Landroidx/paging/SeparatorState$onInsert$1;->label:I

    .line 1954
    .line 1955
    invoke-interface {v5, v6, v15, v0}, Lx7/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1956
    .line 1957
    .line 1958
    move-result-object v0

    .line 1959
    if-ne v0, v4, :cond_32

    .line 1960
    .line 1961
    :goto_26
    return-object v4

    .line 1962
    :cond_32
    move-object v15, v0

    .line 1963
    move-object v7, v1

    .line 1964
    move-object v14, v7

    .line 1965
    move-object/from16 v16, v2

    .line 1966
    .line 1967
    move-object v5, v13

    .line 1968
    :goto_27
    invoke-virtual/range {v16 .. v16}, Landroidx/paging/TransformablePage;->getHintOriginalPageOffset()I

    .line 1969
    .line 1970
    .line 1971
    move-result v18

    .line 1972
    invoke-virtual/range {v16 .. v16}, Landroidx/paging/TransformablePage;->getHintOriginalIndices()Ljava/util/List;

    .line 1973
    .line 1974
    .line 1975
    move-result-object v0

    .line 1976
    if-eqz v0, :cond_33

    .line 1977
    .line 1978
    invoke-static {v0}, Li7/f0;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 1979
    .line 1980
    .line 1981
    move-result-object v0

    .line 1982
    check-cast v0, Ljava/lang/Number;

    .line 1983
    .line 1984
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 1985
    .line 1986
    .line 1987
    move-result v0

    .line 1988
    :goto_28
    move/from16 v19, v0

    .line 1989
    .line 1990
    goto :goto_29

    .line 1991
    :cond_33
    invoke-virtual/range {v16 .. v16}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    .line 1992
    .line 1993
    .line 1994
    move-result-object v0

    .line 1995
    invoke-static {v0}, Li7/v;->p(Ljava/util/List;)I

    .line 1996
    .line 1997
    .line 1998
    move-result v0

    .line 1999
    goto :goto_28

    .line 2000
    :goto_29
    const/16 v17, 0x0

    .line 2001
    .line 2002
    invoke-static/range {v14 .. v19}, Landroidx/paging/SeparatorsKt;->addSeparatorPage(Ljava/util/List;Ljava/lang/Object;Landroidx/paging/TransformablePage;Landroidx/paging/TransformablePage;II)V

    .line 2003
    .line 2004
    .line 2005
    move-object v13, v5

    .line 2006
    move-object/from16 v22, v7

    .line 2007
    .line 2008
    :goto_2a
    const/4 v4, 0x0

    .line 2009
    goto :goto_2b

    .line 2010
    :cond_34
    move-object/from16 v22, v1

    .line 2011
    .line 2012
    goto :goto_2a

    .line 2013
    :goto_2b
    iput-boolean v4, v3, Landroidx/paging/SeparatorState;->endTerminalSeparatorDeferred:Z

    .line 2014
    .line 2015
    iput-boolean v4, v3, Landroidx/paging/SeparatorState;->startTerminalSeparatorDeferred:Z

    .line 2016
    .line 2017
    invoke-virtual {v8}, Landroidx/paging/PageEvent$Insert;->getLoadType()Landroidx/paging/LoadType;

    .line 2018
    .line 2019
    .line 2020
    move-result-object v0

    .line 2021
    sget-object v1, Landroidx/paging/LoadType;->APPEND:Landroidx/paging/LoadType;

    .line 2022
    .line 2023
    if-ne v0, v1, :cond_35

    .line 2024
    .line 2025
    iget-object v0, v3, Landroidx/paging/SeparatorState;->pageStash:Ljava/util/List;

    .line 2026
    .line 2027
    invoke-interface {v0, v13}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 2028
    .line 2029
    .line 2030
    goto :goto_2c

    .line 2031
    :cond_35
    iget-object v0, v3, Landroidx/paging/SeparatorState;->pageStash:Ljava/util/List;

    .line 2032
    .line 2033
    invoke-interface {v0, v4, v13}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    .line 2034
    .line 2035
    .line 2036
    :goto_2c
    invoke-virtual {v8}, Landroidx/paging/PageEvent$Insert;->getLoadType()Landroidx/paging/LoadType;

    .line 2037
    .line 2038
    .line 2039
    move-result-object v21

    .line 2040
    invoke-virtual {v8}, Landroidx/paging/PageEvent$Insert;->getPages()Ljava/util/List;

    .line 2041
    .line 2042
    .line 2043
    invoke-virtual {v8}, Landroidx/paging/PageEvent$Insert;->getPlaceholdersBefore()I

    .line 2044
    .line 2045
    .line 2046
    move-result v23

    .line 2047
    invoke-virtual {v8}, Landroidx/paging/PageEvent$Insert;->getPlaceholdersAfter()I

    .line 2048
    .line 2049
    .line 2050
    move-result v24

    .line 2051
    invoke-virtual {v8}, Landroidx/paging/PageEvent$Insert;->getSourceLoadStates()Landroidx/paging/LoadStates;

    .line 2052
    .line 2053
    .line 2054
    move-result-object v25

    .line 2055
    invoke-virtual {v8}, Landroidx/paging/PageEvent$Insert;->getMediatorLoadStates()Landroidx/paging/LoadStates;

    .line 2056
    .line 2057
    .line 2058
    move-result-object v26

    .line 2059
    new-instance v20, Landroidx/paging/PageEvent$Insert;

    .line 2060
    .line 2061
    const/16 v27, 0x0

    .line 2062
    .line 2063
    invoke-direct/range {v20 .. v27}, Landroidx/paging/PageEvent$Insert;-><init>(Landroidx/paging/LoadType;Ljava/util/List;IILandroidx/paging/LoadStates;Landroidx/paging/LoadStates;Lkotlin/jvm/internal/n;)V

    .line 2064
    .line 2065
    .line 2066
    return-object v20

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

.method public final onLoadStateUpdate(Landroidx/paging/PageEvent$LoadStateUpdate;Lm7/c;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PageEvent$LoadStateUpdate<",
            "TT;>;",
            "Lm7/c<",
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
    invoke-static {}, Li7/v;->n()Ljava/util/List;

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
    invoke-virtual {p0, p1, p2}, Landroidx/paging/SeparatorState;->onInsert(Landroidx/paging/PageEvent$Insert;Lm7/c;)Ljava/lang/Object;

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
    invoke-static {}, Li7/v;->n()Ljava/util/List;

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
    invoke-virtual {p0, p1, p2}, Landroidx/paging/SeparatorState;->onInsert(Landroidx/paging/PageEvent$Insert;Lm7/c;)Ljava/lang/Object;

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

.method public final onStaticList(Landroidx/paging/PageEvent$StaticList;Lm7/c;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PageEvent$StaticList<",
            "TT;>;",
            "Lm7/c<",
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
    invoke-direct {v0, p0, p2}, Landroidx/paging/SeparatorState$onStaticList$1;-><init>(Landroidx/paging/SeparatorState;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Landroidx/paging/SeparatorState$onStaticList$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

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
    iget-object v4, v0, Landroidx/paging/SeparatorState$onStaticList$1;->L$3:Ljava/lang/Object;

    .line 43
    .line 44
    iget-object v5, v0, Landroidx/paging/SeparatorState$onStaticList$1;->L$2:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v5, Ljava/util/List;

    .line 47
    .line 48
    iget-object v6, v0, Landroidx/paging/SeparatorState$onStaticList$1;->L$1:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v6, Landroidx/paging/PageEvent$StaticList;

    .line 51
    .line 52
    iget-object v7, v0, Landroidx/paging/SeparatorState$onStaticList$1;->L$0:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v7, Landroidx/paging/SeparatorState;

    .line 55
    .line 56
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    move-object v9, v4

    .line 60
    move v4, p1

    .line 61
    move-object p1, v6

    .line 62
    move-object v6, v9

    .line 63
    goto :goto_2

    .line 64
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 65
    .line 66
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 67
    .line 68
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw p1

    .line 72
    :cond_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    new-instance p2, Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1}, Landroidx/paging/PageEvent$StaticList;->getData()Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-ltz v2, :cond_7

    .line 89
    .line 90
    const/4 v4, 0x0

    .line 91
    move-object v7, p0

    .line 92
    move-object v5, p2

    .line 93
    :goto_1
    invoke-virtual {p1}, Landroidx/paging/PageEvent$StaticList;->getData()Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    add-int/lit8 v6, v4, -0x1

    .line 98
    .line 99
    invoke-static {p2, v6}, Li7/f0;->o0(Ljava/util/List;I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    invoke-virtual {p1}, Landroidx/paging/PageEvent$StaticList;->getData()Ljava/util/List;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    invoke-static {v6, v4}, Li7/f0;->o0(Ljava/util/List;I)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    iget-object v8, v7, Landroidx/paging/SeparatorState;->generator:Lx7/q;

    .line 112
    .line 113
    iput-object v7, v0, Landroidx/paging/SeparatorState$onStaticList$1;->L$0:Ljava/lang/Object;

    .line 114
    .line 115
    iput-object p1, v0, Landroidx/paging/SeparatorState$onStaticList$1;->L$1:Ljava/lang/Object;

    .line 116
    .line 117
    iput-object v5, v0, Landroidx/paging/SeparatorState$onStaticList$1;->L$2:Ljava/lang/Object;

    .line 118
    .line 119
    iput-object v6, v0, Landroidx/paging/SeparatorState$onStaticList$1;->L$3:Ljava/lang/Object;

    .line 120
    .line 121
    iput v4, v0, Landroidx/paging/SeparatorState$onStaticList$1;->I$0:I

    .line 122
    .line 123
    iput v2, v0, Landroidx/paging/SeparatorState$onStaticList$1;->I$1:I

    .line 124
    .line 125
    iput v3, v0, Landroidx/paging/SeparatorState$onStaticList$1;->label:I

    .line 126
    .line 127
    invoke-interface {v8, p2, v6, v0}, Lx7/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    if-ne p2, v1, :cond_3

    .line 132
    .line 133
    return-object v1

    .line 134
    :cond_3
    move v9, v4

    .line 135
    move v4, v2

    .line 136
    move v2, v9

    .line 137
    :goto_2
    if-eqz p2, :cond_4

    .line 138
    .line 139
    invoke-interface {v5, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    :cond_4
    if-eqz v6, :cond_5

    .line 143
    .line 144
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    :cond_5
    if-eq v2, v4, :cond_6

    .line 148
    .line 149
    add-int/lit8 p2, v2, 0x1

    .line 150
    .line 151
    move v2, v4

    .line 152
    move v4, p2

    .line 153
    goto :goto_1

    .line 154
    :cond_6
    move-object p2, v5

    .line 155
    :cond_7
    new-instance v0, Landroidx/paging/PageEvent$StaticList;

    .line 156
    .line 157
    invoke-virtual {p1}, Landroidx/paging/PageEvent$StaticList;->getSourceLoadStates()Landroidx/paging/LoadStates;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    invoke-virtual {p1}, Landroidx/paging/PageEvent$StaticList;->getMediatorLoadStates()Landroidx/paging/LoadStates;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-direct {v0, p2, v1, p1}, Landroidx/paging/PageEvent$StaticList;-><init>(Ljava/util/List;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)V

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
