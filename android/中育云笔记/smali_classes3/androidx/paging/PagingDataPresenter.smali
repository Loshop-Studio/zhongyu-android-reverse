.class public abstract Landroidx/paging/PagingDataPresenter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/paging/PagingDataPresenter$InitialUiReceiver;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final _onPagesUpdatedFlow:Lvd/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvd/k;"
        }
    .end annotation
.end field

.field private final collectFromRunner:Landroidx/paging/SingleRunner;

.field private final combinedLoadStatesCollection:Landroidx/paging/MutableCombinedLoadStateCollection;

.field private hintReceiver:Landroidx/paging/HintReceiver;

.field private final inGetItem:Lvd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvd/l;"
        }
    .end annotation
.end field

.field private volatile lastAccessedIndex:I

.field private volatile lastAccessedIndexUnfulfilled:Z

.field private final loadStateFlow:Lvd/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvd/u;"
        }
    .end annotation
.end field

.field private final mainContext:Lkotlin/coroutines/d;

.field private final onPagesUpdatedListeners:Landroidx/paging/internal/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/internal/CopyOnWriteArrayList<",
            "Lhd/a;",
            ">;"
        }
    .end annotation
.end field

.field private pageStore:Landroidx/paging/PageStore;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/PageStore<",
            "TT;>;"
        }
    .end annotation
.end field

.field private uiReceiver:Landroidx/paging/UiReceiver;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Landroidx/paging/PagingDataPresenter;-><init>(Lkotlin/coroutines/d;Landroidx/paging/PagingData;ILkotlin/jvm/internal/n;)V

    return-void
.end method

.method public constructor <init>(Lkotlin/coroutines/d;Landroidx/paging/PagingData;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/d;",
            "Landroidx/paging/PagingData<",
            "TT;>;)V"
        }
    .end annotation

    const-string v0, "mainContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/paging/PagingDataPresenter;->mainContext:Lkotlin/coroutines/d;

    .line 4
    new-instance p1, Landroidx/paging/PagingDataPresenter$InitialUiReceiver;

    invoke-direct {p1}, Landroidx/paging/PagingDataPresenter$InitialUiReceiver;-><init>()V

    iput-object p1, p0, Landroidx/paging/PagingDataPresenter;->uiReceiver:Landroidx/paging/UiReceiver;

    .line 5
    sget-object p1, Landroidx/paging/PageStore;->Companion:Landroidx/paging/PageStore$Companion;

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroidx/paging/PagingData;->cachedEvent$paging_common()Landroidx/paging/PageEvent$Insert;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    invoke-virtual {p1, v1}, Landroidx/paging/PageStore$Companion;->initial$paging_common(Landroidx/paging/PageEvent$Insert;)Landroidx/paging/PageStore;

    move-result-object p1

    iput-object p1, p0, Landroidx/paging/PagingDataPresenter;->pageStore:Landroidx/paging/PageStore;

    .line 6
    new-instance p1, Landroidx/paging/MutableCombinedLoadStateCollection;

    invoke-direct {p1}, Landroidx/paging/MutableCombinedLoadStateCollection;-><init>()V

    if-eqz p2, :cond_1

    .line 7
    invoke-virtual {p2}, Landroidx/paging/PagingData;->cachedEvent$paging_common()Landroidx/paging/PageEvent$Insert;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Landroidx/paging/PageEvent$Insert;->getSourceLoadStates()Landroidx/paging/LoadStates;

    move-result-object v1

    invoke-virtual {p2}, Landroidx/paging/PageEvent$Insert;->getMediatorLoadStates()Landroidx/paging/LoadStates;

    move-result-object p2

    invoke-virtual {p1, v1, p2}, Landroidx/paging/MutableCombinedLoadStateCollection;->set(Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)V

    .line 8
    :cond_1
    iput-object p1, p0, Landroidx/paging/PagingDataPresenter;->combinedLoadStatesCollection:Landroidx/paging/MutableCombinedLoadStateCollection;

    .line 9
    new-instance p2, Landroidx/paging/internal/CopyOnWriteArrayList;

    invoke-direct {p2}, Landroidx/paging/internal/CopyOnWriteArrayList;-><init>()V

    iput-object p2, p0, Landroidx/paging/PagingDataPresenter;->onPagesUpdatedListeners:Landroidx/paging/internal/CopyOnWriteArrayList;

    .line 10
    new-instance p2, Landroidx/paging/SingleRunner;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {p2, v2, v1, v0}, Landroidx/paging/SingleRunner;-><init>(ZILkotlin/jvm/internal/n;)V

    iput-object p2, p0, Landroidx/paging/PagingDataPresenter;->collectFromRunner:Landroidx/paging/SingleRunner;

    .line 11
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p2}, Lvd/v;->a(Ljava/lang/Object;)Lvd/l;

    move-result-object p2

    iput-object p2, p0, Landroidx/paging/PagingDataPresenter;->inGetItem:Lvd/l;

    .line 12
    invoke-virtual {p1}, Landroidx/paging/MutableCombinedLoadStateCollection;->getStateFlow()Lvd/u;

    move-result-object p1

    iput-object p1, p0, Landroidx/paging/PagingDataPresenter;->loadStateFlow:Lvd/u;

    const/16 p1, 0x40

    .line 13
    sget-object p2, Lkotlinx/coroutines/channels/BufferOverflow;->d:Lkotlinx/coroutines/channels/BufferOverflow;

    invoke-static {v2, p1, p2}, Lvd/q;->a(IILkotlinx/coroutines/channels/BufferOverflow;)Lvd/k;

    move-result-object p1

    iput-object p1, p0, Landroidx/paging/PagingDataPresenter;->_onPagesUpdatedFlow:Lvd/k;

    .line 14
    new-instance p1, Landroidx/paging/y0;

    invoke-direct {p1, p0}, Landroidx/paging/y0;-><init>(Landroidx/paging/PagingDataPresenter;)V

    invoke-virtual {p0, p1}, Landroidx/paging/PagingDataPresenter;->addOnPagesUpdatedListener(Lhd/a;)V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/coroutines/d;Landroidx/paging/PagingData;ILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    .line 15
    invoke-static {}, Lsd/r0;->c()Lsd/t1;

    move-result-object p1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p2, 0x0

    .line 16
    :cond_1
    invoke-direct {p0, p1, p2}, Landroidx/paging/PagingDataPresenter;-><init>(Lkotlin/coroutines/d;Landroidx/paging/PagingData;)V

    return-void
.end method

.method private static final _init_$lambda$0(Landroidx/paging/PagingDataPresenter;)Lqc/q;
    .locals 1

    .line 1
    iget-object p0, p0, Landroidx/paging/PagingDataPresenter;->_onPagesUpdatedFlow:Lvd/k;

    .line 2
    .line 3
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 4
    .line 5
    invoke-interface {p0, v0}, Lvd/k;->a(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static synthetic a(Landroidx/paging/PagingDataPresenter;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/paging/PagingDataPresenter;->_init_$lambda$0(Landroidx/paging/PagingDataPresenter;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getCombinedLoadStatesCollection$p(Landroidx/paging/PagingDataPresenter;)Landroidx/paging/MutableCombinedLoadStateCollection;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/PagingDataPresenter;->combinedLoadStatesCollection:Landroidx/paging/MutableCombinedLoadStateCollection;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getHintReceiver$p(Landroidx/paging/PagingDataPresenter;)Landroidx/paging/HintReceiver;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/PagingDataPresenter;->hintReceiver:Landroidx/paging/HintReceiver;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getInGetItem$p(Landroidx/paging/PagingDataPresenter;)Lvd/l;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/PagingDataPresenter;->inGetItem:Lvd/l;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getLastAccessedIndex$p(Landroidx/paging/PagingDataPresenter;)I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/paging/PagingDataPresenter;->lastAccessedIndex:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic access$getLastAccessedIndexUnfulfilled$p(Landroidx/paging/PagingDataPresenter;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/paging/PagingDataPresenter;->lastAccessedIndexUnfulfilled:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic access$getMainContext$p(Landroidx/paging/PagingDataPresenter;)Lkotlin/coroutines/d;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/PagingDataPresenter;->mainContext:Lkotlin/coroutines/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getOnPagesUpdatedListeners$p(Landroidx/paging/PagingDataPresenter;)Landroidx/paging/internal/CopyOnWriteArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/PagingDataPresenter;->onPagesUpdatedListeners:Landroidx/paging/internal/CopyOnWriteArrayList;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getPageStore$p(Landroidx/paging/PagingDataPresenter;)Landroidx/paging/PageStore;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/paging/PagingDataPresenter;->pageStore:Landroidx/paging/PageStore;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$presentNewList(Landroidx/paging/PagingDataPresenter;Ljava/util/List;IIZLandroidx/paging/LoadStates;Landroidx/paging/LoadStates;Landroidx/paging/HintReceiver;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p8}, Landroidx/paging/PagingDataPresenter;->presentNewList(Ljava/util/List;IIZLandroidx/paging/LoadStates;Landroidx/paging/LoadStates;Landroidx/paging/HintReceiver;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$setLastAccessedIndexUnfulfilled$p(Landroidx/paging/PagingDataPresenter;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/paging/PagingDataPresenter;->lastAccessedIndexUnfulfilled:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setUiReceiver(Landroidx/paging/PagingDataPresenter;Landroidx/paging/UiReceiver;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/paging/PagingDataPresenter;->setUiReceiver(Landroidx/paging/UiReceiver;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final presentNewList(Ljava/util/List;IIZLandroidx/paging/LoadStates;Landroidx/paging/LoadStates;Landroidx/paging/HintReceiver;Lvc/c;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/paging/TransformablePage<",
            "TT;>;>;IIZ",
            "Landroidx/paging/LoadStates;",
            "Landroidx/paging/LoadStates;",
            "Landroidx/paging/HintReceiver;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    move/from16 v4, p4

    .line 10
    .line 11
    move-object/from16 v5, p5

    .line 12
    .line 13
    move-object/from16 v6, p7

    .line 14
    .line 15
    move-object/from16 v7, p8

    .line 16
    .line 17
    instance-of v8, v7, Landroidx/paging/PagingDataPresenter$presentNewList$1;

    .line 18
    .line 19
    if-eqz v8, :cond_0

    .line 20
    .line 21
    move-object v8, v7

    .line 22
    check-cast v8, Landroidx/paging/PagingDataPresenter$presentNewList$1;

    .line 23
    .line 24
    iget v9, v8, Landroidx/paging/PagingDataPresenter$presentNewList$1;->label:I

    .line 25
    .line 26
    const/high16 v10, -0x80000000

    .line 27
    .line 28
    and-int v11, v9, v10

    .line 29
    .line 30
    if-eqz v11, :cond_0

    .line 31
    .line 32
    sub-int/2addr v9, v10

    .line 33
    iput v9, v8, Landroidx/paging/PagingDataPresenter$presentNewList$1;->label:I

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    new-instance v8, Landroidx/paging/PagingDataPresenter$presentNewList$1;

    .line 37
    .line 38
    invoke-direct {v8, v1, v7}, Landroidx/paging/PagingDataPresenter$presentNewList$1;-><init>(Landroidx/paging/PagingDataPresenter;Lvc/c;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    iget-object v7, v8, Landroidx/paging/PagingDataPresenter$presentNewList$1;->result:Ljava/lang/Object;

    .line 42
    .line 43
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v9

    .line 47
    iget v10, v8, Landroidx/paging/PagingDataPresenter$presentNewList$1;->label:I

    .line 48
    .line 49
    const/4 v11, 0x1

    .line 50
    if-eqz v10, :cond_2

    .line 51
    .line 52
    if-ne v10, v11, :cond_1

    .line 53
    .line 54
    iget-boolean v0, v8, Landroidx/paging/PagingDataPresenter$presentNewList$1;->Z$0:Z

    .line 55
    .line 56
    iget v2, v8, Landroidx/paging/PagingDataPresenter$presentNewList$1;->I$1:I

    .line 57
    .line 58
    iget v3, v8, Landroidx/paging/PagingDataPresenter$presentNewList$1;->I$0:I

    .line 59
    .line 60
    iget-object v4, v8, Landroidx/paging/PagingDataPresenter$presentNewList$1;->L$6:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v4, Landroidx/paging/PageStore;

    .line 63
    .line 64
    iget-object v5, v8, Landroidx/paging/PagingDataPresenter$presentNewList$1;->L$5:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v5, Landroidx/paging/HintReceiver;

    .line 67
    .line 68
    iget-object v6, v8, Landroidx/paging/PagingDataPresenter$presentNewList$1;->L$4:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v6, Landroidx/paging/PageStore;

    .line 71
    .line 72
    iget-object v9, v8, Landroidx/paging/PagingDataPresenter$presentNewList$1;->L$3:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v9, Landroidx/paging/HintReceiver;

    .line 75
    .line 76
    iget-object v10, v8, Landroidx/paging/PagingDataPresenter$presentNewList$1;->L$2:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v10, Landroidx/paging/LoadStates;

    .line 79
    .line 80
    iget-object v12, v8, Landroidx/paging/PagingDataPresenter$presentNewList$1;->L$1:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v12, Landroidx/paging/LoadStates;

    .line 83
    .line 84
    iget-object v8, v8, Landroidx/paging/PagingDataPresenter$presentNewList$1;->L$0:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v8, Ljava/util/List;

    .line 87
    .line 88
    :try_start_0
    invoke-static {v7}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 89
    .line 90
    .line 91
    move/from16 v16, v3

    .line 92
    .line 93
    move v3, v2

    .line 94
    move/from16 v2, v16

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :catch_0
    move-exception v0

    .line 98
    goto/16 :goto_5

    .line 99
    .line 100
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 101
    .line 102
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 103
    .line 104
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    throw v0

    .line 108
    :cond_2
    invoke-static {v7}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    if-eqz v4, :cond_4

    .line 112
    .line 113
    if-eqz v5, :cond_3

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 117
    .line 118
    const-string v2, "Cannot dispatch LoadStates in PagingDataPresenter without source LoadStates set."

    .line 119
    .line 120
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw v0

    .line 124
    :cond_4
    :goto_1
    const/4 v7, 0x0

    .line 125
    iput-boolean v7, v1, Landroidx/paging/PagingDataPresenter;->lastAccessedIndexUnfulfilled:Z

    .line 126
    .line 127
    iget-object v7, v1, Landroidx/paging/PagingDataPresenter;->pageStore:Landroidx/paging/PageStore;

    .line 128
    .line 129
    iget-object v10, v1, Landroidx/paging/PagingDataPresenter;->hintReceiver:Landroidx/paging/HintReceiver;

    .line 130
    .line 131
    new-instance v12, Landroidx/paging/PageStore;

    .line 132
    .line 133
    invoke-direct {v12, v0, v2, v3}, Landroidx/paging/PageStore;-><init>(Ljava/util/List;II)V

    .line 134
    .line 135
    .line 136
    iget-object v13, v1, Landroidx/paging/PagingDataPresenter;->pageStore:Landroidx/paging/PageStore;

    .line 137
    .line 138
    const-string v14, "null cannot be cast to non-null type androidx.paging.PlaceholderPaddedList<T of androidx.paging.PagingDataPresenter>"

    .line 139
    .line 140
    invoke-static {v13, v14}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    iput-object v12, v1, Landroidx/paging/PagingDataPresenter;->pageStore:Landroidx/paging/PageStore;

    .line 144
    .line 145
    iput-object v6, v1, Landroidx/paging/PagingDataPresenter;->hintReceiver:Landroidx/paging/HintReceiver;

    .line 146
    .line 147
    :try_start_1
    new-instance v14, Landroidx/paging/PagingDataEvent$Refresh;

    .line 148
    .line 149
    invoke-direct {v14, v12, v13}, Landroidx/paging/PagingDataEvent$Refresh;-><init>(Landroidx/paging/PlaceholderPaddedList;Landroidx/paging/PlaceholderPaddedList;)V

    .line 150
    .line 151
    .line 152
    iput-object v0, v8, Landroidx/paging/PagingDataPresenter$presentNewList$1;->L$0:Ljava/lang/Object;

    .line 153
    .line 154
    iput-object v5, v8, Landroidx/paging/PagingDataPresenter$presentNewList$1;->L$1:Ljava/lang/Object;

    .line 155
    .line 156
    move-object/from16 v13, p6

    .line 157
    .line 158
    iput-object v13, v8, Landroidx/paging/PagingDataPresenter$presentNewList$1;->L$2:Ljava/lang/Object;

    .line 159
    .line 160
    iput-object v6, v8, Landroidx/paging/PagingDataPresenter$presentNewList$1;->L$3:Ljava/lang/Object;

    .line 161
    .line 162
    iput-object v7, v8, Landroidx/paging/PagingDataPresenter$presentNewList$1;->L$4:Ljava/lang/Object;

    .line 163
    .line 164
    iput-object v10, v8, Landroidx/paging/PagingDataPresenter$presentNewList$1;->L$5:Ljava/lang/Object;

    .line 165
    .line 166
    iput-object v12, v8, Landroidx/paging/PagingDataPresenter$presentNewList$1;->L$6:Ljava/lang/Object;

    .line 167
    .line 168
    iput v2, v8, Landroidx/paging/PagingDataPresenter$presentNewList$1;->I$0:I

    .line 169
    .line 170
    iput v3, v8, Landroidx/paging/PagingDataPresenter$presentNewList$1;->I$1:I

    .line 171
    .line 172
    iput-boolean v4, v8, Landroidx/paging/PagingDataPresenter$presentNewList$1;->Z$0:Z

    .line 173
    .line 174
    iput v11, v8, Landroidx/paging/PagingDataPresenter$presentNewList$1;->label:I

    .line 175
    .line 176
    invoke-virtual {v1, v14, v8}, Landroidx/paging/PagingDataPresenter;->presentPagingDataEvent(Landroidx/paging/PagingDataEvent;Lvc/c;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v8
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1

    .line 180
    if-ne v8, v9, :cond_5

    .line 181
    .line 182
    return-object v9

    .line 183
    :cond_5
    move-object v8, v0

    .line 184
    move v0, v4

    .line 185
    move-object v9, v6

    .line 186
    move-object v6, v7

    .line 187
    move-object v4, v12

    .line 188
    move-object v12, v5

    .line 189
    move-object v5, v10

    .line 190
    move-object v10, v13

    .line 191
    :goto_2
    :try_start_2
    sget-object v7, Landroidx/paging/PagingLogger;->INSTANCE:Landroidx/paging/PagingLogger;

    .line 192
    .line 193
    const/4 v13, 0x3

    .line 194
    invoke-virtual {v7, v13}, Landroidx/paging/PagingLogger;->isLoggable(I)Z

    .line 195
    .line 196
    .line 197
    move-result v14

    .line 198
    if-eqz v14, :cond_9

    .line 199
    .line 200
    new-instance v14, Ljava/lang/StringBuilder;

    .line 201
    .line 202
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 203
    .line 204
    .line 205
    const-string v15, "Presenting data (\n                            |   first item: "

    .line 206
    .line 207
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-static {v8}, Lrc/g0;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v15

    .line 214
    check-cast v15, Landroidx/paging/TransformablePage;

    .line 215
    .line 216
    const/4 v13, 0x0

    .line 217
    if-eqz v15, :cond_6

    .line 218
    .line 219
    invoke-virtual {v15}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    .line 220
    .line 221
    .line 222
    move-result-object v15

    .line 223
    if-eqz v15, :cond_6

    .line 224
    .line 225
    invoke-static {v15}, Lrc/g0;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v15

    .line 229
    goto :goto_3

    .line 230
    :cond_6
    move-object v15, v13

    .line 231
    :goto_3
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    const-string v15, "\n                            |   last item: "

    .line 235
    .line 236
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-static {v8}, Lrc/g0;->z0(Ljava/util/List;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v8

    .line 243
    check-cast v8, Landroidx/paging/TransformablePage;

    .line 244
    .line 245
    if-eqz v8, :cond_7

    .line 246
    .line 247
    invoke-virtual {v8}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    .line 248
    .line 249
    .line 250
    move-result-object v8

    .line 251
    if-eqz v8, :cond_7

    .line 252
    .line 253
    invoke-static {v8}, Lrc/g0;->z0(Ljava/util/List;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v8

    .line 257
    goto :goto_4

    .line 258
    :cond_7
    move-object v8, v13

    .line 259
    :goto_4
    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    const-string v8, "\n                            |   placeholdersBefore: "

    .line 263
    .line 264
    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    const-string v2, "\n                            |   placeholdersAfter: "

    .line 271
    .line 272
    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    const-string v2, "\n                            |   hintReceiver: "

    .line 279
    .line 280
    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    const-string v2, "\n                            |   sourceLoadStates: "

    .line 287
    .line 288
    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    const-string v2, "\n                        "

    .line 295
    .line 296
    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    if-eqz v10, :cond_8

    .line 304
    .line 305
    new-instance v3, Ljava/lang/StringBuilder;

    .line 306
    .line 307
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    const-string v2, "|   mediatorLoadStates: "

    .line 314
    .line 315
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    const/16 v2, 0xa

    .line 322
    .line 323
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    :cond_8
    new-instance v3, Ljava/lang/StringBuilder;

    .line 331
    .line 332
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    const-string v2, "|)"

    .line 339
    .line 340
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v2

    .line 347
    invoke-static {v2, v13, v11, v13}, Lqd/s;->p(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    const/4 v3, 0x3

    .line 352
    invoke-virtual {v7, v3, v2, v13}, Landroidx/paging/PagingLogger;->log(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 353
    .line 354
    .line 355
    :cond_9
    if-eqz v0, :cond_a

    .line 356
    .line 357
    iget-object v0, v1, Landroidx/paging/PagingDataPresenter;->combinedLoadStatesCollection:Landroidx/paging/MutableCombinedLoadStateCollection;

    .line 358
    .line 359
    invoke-static {v12}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v0, v12, v10}, Landroidx/paging/MutableCombinedLoadStateCollection;->set(Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)V

    .line 363
    .line 364
    .line 365
    :cond_a
    invoke-virtual {v4}, Landroidx/paging/PageStore;->getSize()I

    .line 366
    .line 367
    .line 368
    move-result v0

    .line 369
    if-nez v0, :cond_b

    .line 370
    .line 371
    iget-object v0, v1, Landroidx/paging/PagingDataPresenter;->hintReceiver:Landroidx/paging/HintReceiver;

    .line 372
    .line 373
    if-eqz v0, :cond_b

    .line 374
    .line 375
    invoke-virtual {v4}, Landroidx/paging/PageStore;->initializeHint()Landroidx/paging/ViewportHint$Initial;

    .line 376
    .line 377
    .line 378
    move-result-object v2

    .line 379
    invoke-interface {v0, v2}, Landroidx/paging/HintReceiver;->processHint(Landroidx/paging/ViewportHint;)V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0

    .line 380
    .line 381
    .line 382
    :cond_b
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 383
    .line 384
    return-object v0

    .line 385
    :catch_1
    move-exception v0

    .line 386
    move-object v6, v7

    .line 387
    move-object v5, v10

    .line 388
    :goto_5
    iput-object v6, v1, Landroidx/paging/PagingDataPresenter;->pageStore:Landroidx/paging/PageStore;

    .line 389
    .line 390
    iput-object v5, v1, Landroidx/paging/PagingDataPresenter;->hintReceiver:Landroidx/paging/HintReceiver;

    .line 391
    .line 392
    throw v0
.end method

.method private final setUiReceiver(Landroidx/paging/UiReceiver;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/paging/PagingDataPresenter;->uiReceiver:Landroidx/paging/UiReceiver;

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/paging/PagingDataPresenter;->uiReceiver:Landroidx/paging/UiReceiver;

    .line 4
    .line 5
    instance-of v1, v0, Landroidx/paging/PagingDataPresenter$InitialUiReceiver;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast v0, Landroidx/paging/PagingDataPresenter$InitialUiReceiver;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/paging/PagingDataPresenter$InitialUiReceiver;->getShouldRetry()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {p1}, Landroidx/paging/UiReceiver;->retry()V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {v0}, Landroidx/paging/PagingDataPresenter$InitialUiReceiver;->getShouldRefresh()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-interface {p1}, Landroidx/paging/UiReceiver;->refresh()V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method


# virtual methods
.method public final addLoadStateListener(Lhd/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/paging/PagingDataPresenter;->combinedLoadStatesCollection:Landroidx/paging/MutableCombinedLoadStateCollection;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroidx/paging/MutableCombinedLoadStateCollection;->addListener(Lhd/l;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final addOnPagesUpdatedListener(Lhd/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/a;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/paging/PagingDataPresenter;->onPagesUpdatedListeners:Landroidx/paging/internal/CopyOnWriteArrayList;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroidx/paging/internal/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final collectFrom(Landroidx/paging/PagingData;Lvc/c;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PagingData<",
            "TT;>;",
            "Lvc/c<",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/PagingDataPresenter;->collectFromRunner:Landroidx/paging/SingleRunner;

    .line 2
    .line 3
    new-instance v2, Landroidx/paging/PagingDataPresenter$collectFrom$2;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v2, p0, p1, v1}, Landroidx/paging/PagingDataPresenter$collectFrom$2;-><init>(Landroidx/paging/PagingDataPresenter;Landroidx/paging/PagingData;Lvc/c;)V

    .line 7
    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v1, 0x0

    .line 12
    move-object v3, p2

    .line 13
    invoke-static/range {v0 .. v5}, Landroidx/paging/SingleRunner;->runInIsolation$default(Landroidx/paging/SingleRunner;ILhd/l;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    if-ne p1, p2, :cond_0

    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 25
    .line 26
    return-object p1
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 4
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/PagingDataPresenter;->inGetItem:Lvd/l;

    .line 2
    .line 3
    :cond_0
    invoke-interface {v0}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-interface {v0, v1, v2}, Lvd/l;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    iput-boolean v0, p0, Landroidx/paging/PagingDataPresenter;->lastAccessedIndexUnfulfilled:Z

    .line 23
    .line 24
    iput p1, p0, Landroidx/paging/PagingDataPresenter;->lastAccessedIndex:I

    .line 25
    .line 26
    sget-object v0, Landroidx/paging/PagingLogger;->INSTANCE:Landroidx/paging/PagingLogger;

    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    invoke-virtual {v0, v1}, Landroidx/paging/PagingLogger;->isLoggable(I)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    new-instance v2, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    const-string v3, "Accessing item index["

    .line 41
    .line 42
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const/16 v3, 0x5d

    .line 49
    .line 50
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    const/4 v3, 0x0

    .line 58
    invoke-virtual {v0, v1, v2, v3}, Landroidx/paging/PagingLogger;->log(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    :cond_1
    iget-object v0, p0, Landroidx/paging/PagingDataPresenter;->hintReceiver:Landroidx/paging/HintReceiver;

    .line 62
    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    iget-object v1, p0, Landroidx/paging/PagingDataPresenter;->pageStore:Landroidx/paging/PageStore;

    .line 66
    .line 67
    invoke-virtual {v1, p1}, Landroidx/paging/PageStore;->createAccessHintForIndex(I)Landroidx/paging/ViewportHint$Access;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-interface {v0, v1}, Landroidx/paging/HintReceiver;->processHint(Landroidx/paging/ViewportHint;)V

    .line 72
    .line 73
    .line 74
    :cond_2
    iget-object v0, p0, Landroidx/paging/PagingDataPresenter;->pageStore:Landroidx/paging/PageStore;

    .line 75
    .line 76
    invoke-virtual {v0, p1}, Landroidx/paging/PageStore;->get(I)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    iget-object v2, p0, Landroidx/paging/PagingDataPresenter;->inGetItem:Lvd/l;

    .line 81
    .line 82
    :cond_3
    invoke-interface {v2}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    move-object v0, p1

    .line 87
    check-cast v0, Ljava/lang/Boolean;

    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 93
    .line 94
    invoke-interface {v2, p1, v0}, Lvd/l;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-eqz p1, :cond_3

    .line 99
    .line 100
    return-object v1
.end method

.method public final getLoadStateFlow()Lvd/u;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lvd/u;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/PagingDataPresenter;->loadStateFlow:Lvd/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOnPagesUpdatedFlow()Lvd/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lvd/c;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/PagingDataPresenter;->_onPagesUpdatedFlow:Lvd/k;

    .line 2
    .line 3
    invoke-static {v0}, Lvd/e;->a(Lvd/k;)Lvd/p;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final getSize()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/PagingDataPresenter;->pageStore:Landroidx/paging/PageStore;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/paging/PageStore;->getSize()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final peek(I)Ljava/lang/Object;
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/PagingDataPresenter;->pageStore:Landroidx/paging/PageStore;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/paging/PageStore;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public abstract presentPagingDataEvent(Landroidx/paging/PagingDataEvent;Lvc/c;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PagingDataEvent<",
            "TT;>;",
            "Lvc/c<",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public final refresh()V
    .locals 4

    .line 1
    sget-object v0, Landroidx/paging/PagingLogger;->INSTANCE:Landroidx/paging/PagingLogger;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-virtual {v0, v1}, Landroidx/paging/PagingLogger;->isLoggable(I)Z

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    const-string v2, "Refresh signal received"

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-virtual {v0, v1, v2, v3}, Landroidx/paging/PagingLogger;->log(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Landroidx/paging/PagingDataPresenter;->uiReceiver:Landroidx/paging/UiReceiver;

    .line 17
    .line 18
    invoke-interface {v0}, Landroidx/paging/UiReceiver;->refresh()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final removeLoadStateListener(Lhd/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/paging/PagingDataPresenter;->combinedLoadStatesCollection:Landroidx/paging/MutableCombinedLoadStateCollection;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroidx/paging/MutableCombinedLoadStateCollection;->removeListener(Lhd/l;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final removeOnPagesUpdatedListener(Lhd/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/a;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/paging/PagingDataPresenter;->onPagesUpdatedListeners:Landroidx/paging/internal/CopyOnWriteArrayList;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroidx/paging/internal/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final retry()V
    .locals 4

    .line 1
    sget-object v0, Landroidx/paging/PagingLogger;->INSTANCE:Landroidx/paging/PagingLogger;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-virtual {v0, v1}, Landroidx/paging/PagingLogger;->isLoggable(I)Z

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    const-string v2, "Retry signal received"

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-virtual {v0, v1, v2, v3}, Landroidx/paging/PagingLogger;->log(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Landroidx/paging/PagingDataPresenter;->uiReceiver:Landroidx/paging/UiReceiver;

    .line 17
    .line 18
    invoke-interface {v0}, Landroidx/paging/UiReceiver;->retry()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final snapshot()Landroidx/paging/ItemSnapshotList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/paging/ItemSnapshotList<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/PagingDataPresenter;->pageStore:Landroidx/paging/PageStore;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/paging/PageStore;->snapshot()Landroidx/paging/ItemSnapshotList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
