.class public final Landroidx/compose/runtime/internal/RememberEventDispatcher;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/runtime/RememberManager;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final abandoning:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroidx/compose/runtime/RememberObserver;",
            ">;"
        }
    .end annotation
.end field

.field private final afters:Landroidx/collection/MutableIntList;

.field private currentRememberingList:Landroidx/compose/runtime/collection/MutableVector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/collection/MutableVector<",
            "Landroidx/compose/runtime/RememberObserverHolder;",
            ">;"
        }
    .end annotation
.end field

.field private final leaving:Landroidx/compose/runtime/collection/MutableVector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/collection/MutableVector<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private nestedRemembersLists:Ljava/util/ArrayList;

.field private pausedPlaceholders:Landroidx/collection/MutableScatterMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableScatterMap<",
            "Landroidx/compose/runtime/RecomposeScopeImpl;",
            "Landroidx/compose/runtime/internal/PausedCompositionRemembers;",
            ">;"
        }
    .end annotation
.end field

.field private final pending:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final priorities:Landroidx/collection/MutableIntList;

.field private releasing:Landroidx/collection/MutableScatterSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableScatterSet<",
            "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;",
            ">;"
        }
    .end annotation
.end field

.field private final remembering:Landroidx/compose/runtime/collection/MutableVector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/collection/MutableVector<",
            "Landroidx/compose/runtime/RememberObserverHolder;",
            ">;"
        }
    .end annotation
.end field

.field private final sideEffects:Landroidx/compose/runtime/collection/MutableVector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/collection/MutableVector<",
            "Lhd/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/util/Set;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Landroidx/compose/runtime/RememberObserver;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->abandoning:Ljava/util/Set;

    .line 5
    .line 6
    new-instance p1, Landroidx/compose/runtime/collection/MutableVector;

    .line 7
    .line 8
    const/16 v0, 0x10

    .line 9
    .line 10
    new-array v1, v0, [Landroidx/compose/runtime/RememberObserverHolder;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {p1, v1, v2}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->remembering:Landroidx/compose/runtime/collection/MutableVector;

    .line 17
    .line 18
    iput-object p1, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->currentRememberingList:Landroidx/compose/runtime/collection/MutableVector;

    .line 19
    .line 20
    new-instance p1, Landroidx/compose/runtime/collection/MutableVector;

    .line 21
    .line 22
    new-array v1, v0, [Ljava/lang/Object;

    .line 23
    .line 24
    invoke-direct {p1, v1, v2}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->leaving:Landroidx/compose/runtime/collection/MutableVector;

    .line 28
    .line 29
    new-instance p1, Landroidx/compose/runtime/collection/MutableVector;

    .line 30
    .line 31
    new-array v0, v0, [Lhd/a;

    .line 32
    .line 33
    invoke-direct {p1, v0, v2}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->sideEffects:Landroidx/compose/runtime/collection/MutableVector;

    .line 37
    .line 38
    new-instance p1, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->pending:Ljava/util/List;

    .line 44
    .line 45
    new-instance p1, Landroidx/collection/MutableIntList;

    .line 46
    .line 47
    const/4 v0, 0x1

    .line 48
    const/4 v1, 0x0

    .line 49
    invoke-direct {p1, v2, v0, v1}, Landroidx/collection/MutableIntList;-><init>(IILkotlin/jvm/internal/n;)V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->priorities:Landroidx/collection/MutableIntList;

    .line 53
    .line 54
    new-instance p1, Landroidx/collection/MutableIntList;

    .line 55
    .line 56
    invoke-direct {p1, v2, v0, v1}, Landroidx/collection/MutableIntList;-><init>(IILkotlin/jvm/internal/n;)V

    .line 57
    .line 58
    .line 59
    iput-object p1, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->afters:Landroidx/collection/MutableIntList;

    .line 60
    .line 61
    return-void
.end method

.method private final dispatchRememberList(Landroidx/compose/runtime/collection/MutableVector;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/collection/MutableVector<",
            "Landroidx/compose/runtime/RememberObserverHolder;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p1, Landroidx/compose/runtime/collection/MutableVector;->content:[Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-ge v1, p1, :cond_0

    .line 9
    .line 10
    aget-object v2, v0, v1

    .line 11
    .line 12
    check-cast v2, Landroidx/compose/runtime/RememberObserverHolder;

    .line 13
    .line 14
    invoke-virtual {v2}, Landroidx/compose/runtime/RememberObserverHolder;->getWrapped()Landroidx/compose/runtime/RememberObserver;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iget-object v3, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->abandoning:Ljava/util/Set;

    .line 19
    .line 20
    invoke-interface {v3, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    invoke-interface {v2}, Landroidx/compose/runtime/RememberObserver;->onRemembered()V

    .line 24
    .line 25
    .line 26
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void
.end method

.method private final processPendingLeaving(I)V
    .locals 11

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->pending:Ljava/util/List;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Collection;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_7

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    const/4 v1, 0x0

    .line 13
    move v2, v0

    .line 14
    move-object v3, v1

    .line 15
    move-object v4, v3

    .line 16
    move-object v5, v4

    .line 17
    :goto_0
    iget-object v6, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->afters:Landroidx/collection/MutableIntList;

    .line 18
    .line 19
    iget v7, v6, Landroidx/collection/IntList;->_size:I

    .line 20
    .line 21
    const-string v8, "null cannot be cast to non-null type androidx.collection.MutableIntList"

    .line 22
    .line 23
    const/4 v9, 0x1

    .line 24
    if-ge v2, v7, :cond_2

    .line 25
    .line 26
    invoke-virtual {v6, v2}, Landroidx/collection/IntList;->get(I)I

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    if-gt p1, v6, :cond_1

    .line 31
    .line 32
    iget-object v6, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->pending:Ljava/util/List;

    .line 33
    .line 34
    invoke-interface {v6, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    iget-object v7, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->afters:Landroidx/collection/MutableIntList;

    .line 39
    .line 40
    invoke-virtual {v7, v2}, Landroidx/collection/MutableIntList;->removeAt(I)I

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    iget-object v10, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->priorities:Landroidx/collection/MutableIntList;

    .line 45
    .line 46
    invoke-virtual {v10, v2}, Landroidx/collection/MutableIntList;->removeAt(I)I

    .line 47
    .line 48
    .line 49
    move-result v10

    .line 50
    if-nez v3, :cond_0

    .line 51
    .line 52
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-static {v3}, Lrc/w;->s([Ljava/lang/Object;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    new-instance v5, Landroidx/collection/MutableIntList;

    .line 61
    .line 62
    invoke-direct {v5, v0, v9, v1}, Landroidx/collection/MutableIntList;-><init>(IILkotlin/jvm/internal/n;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v5, v7}, Landroidx/collection/MutableIntList;->add(I)Z

    .line 66
    .line 67
    .line 68
    new-instance v4, Landroidx/collection/MutableIntList;

    .line 69
    .line 70
    invoke-direct {v4, v0, v9, v1}, Landroidx/collection/MutableIntList;-><init>(IILkotlin/jvm/internal/n;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4, v10}, Landroidx/collection/MutableIntList;->add(I)Z

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    invoke-static {v4, v8}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-static {v5, v8}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    invoke-virtual {v5, v7}, Landroidx/collection/MutableIntList;->add(I)Z

    .line 87
    .line 88
    .line 89
    invoke-virtual {v4, v10}, Landroidx/collection/MutableIntList;->add(I)Z

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_2
    if-eqz v3, :cond_7

    .line 97
    .line 98
    invoke-static {v4, v8}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-static {v5, v8}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    sub-int/2addr p1, v9

    .line 109
    :goto_1
    if-ge v0, p1, :cond_6

    .line 110
    .line 111
    add-int/lit8 v1, v0, 0x1

    .line 112
    .line 113
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    move v6, v1

    .line 118
    :goto_2
    if-ge v6, v2, :cond_5

    .line 119
    .line 120
    invoke-virtual {v5, v0}, Landroidx/collection/IntList;->get(I)I

    .line 121
    .line 122
    .line 123
    move-result v7

    .line 124
    invoke-virtual {v5, v6}, Landroidx/collection/IntList;->get(I)I

    .line 125
    .line 126
    .line 127
    move-result v8

    .line 128
    if-lt v7, v8, :cond_3

    .line 129
    .line 130
    if-ne v8, v7, :cond_4

    .line 131
    .line 132
    invoke-virtual {v4, v0}, Landroidx/collection/IntList;->get(I)I

    .line 133
    .line 134
    .line 135
    move-result v7

    .line 136
    invoke-virtual {v4, v6}, Landroidx/collection/IntList;->get(I)I

    .line 137
    .line 138
    .line 139
    move-result v8

    .line 140
    if-ge v7, v8, :cond_4

    .line 141
    .line 142
    :cond_3
    invoke-static {v3, v0, v6}, Landroidx/compose/runtime/internal/RememberEventDispatcherKt;->access$swap(Ljava/util/List;II)V

    .line 143
    .line 144
    .line 145
    invoke-static {v4, v0, v6}, Landroidx/compose/runtime/internal/RememberEventDispatcherKt;->access$swap(Landroidx/collection/MutableIntList;II)V

    .line 146
    .line 147
    .line 148
    invoke-static {v5, v0, v6}, Landroidx/compose/runtime/internal/RememberEventDispatcherKt;->access$swap(Landroidx/collection/MutableIntList;II)V

    .line 149
    .line 150
    .line 151
    :cond_4
    add-int/lit8 v6, v6, 0x1

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_5
    move v0, v1

    .line 155
    goto :goto_1

    .line 156
    :cond_6
    iget-object p1, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->leaving:Landroidx/compose/runtime/collection/MutableVector;

    .line 157
    .line 158
    invoke-virtual {p1}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    invoke-virtual {p1, v0, v3}, Landroidx/compose/runtime/collection/MutableVector;->addAll(ILjava/util/List;)Z

    .line 163
    .line 164
    .line 165
    :cond_7
    return-void
.end method

.method private final recordLeaving(Ljava/lang/Object;III)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Landroidx/compose/runtime/internal/RememberEventDispatcher;->processPendingLeaving(I)V

    .line 2
    .line 3
    .line 4
    if-ltz p4, :cond_0

    .line 5
    .line 6
    if-ge p4, p2, :cond_0

    .line 7
    .line 8
    iget-object p2, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->pending:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->priorities:Landroidx/collection/MutableIntList;

    .line 14
    .line 15
    invoke-virtual {p1, p3}, Landroidx/collection/MutableIntList;->add(I)Z

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->afters:Landroidx/collection/MutableIntList;

    .line 19
    .line 20
    invoke-virtual {p1, p4}, Landroidx/collection/MutableIntList;->add(I)Z

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iget-object p2, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->leaving:Landroidx/compose/runtime/collection/MutableVector;

    .line 25
    .line 26
    invoke-virtual {p2, p1}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public deactivating(Landroidx/compose/runtime/ComposeNodeLifecycleCallback;III)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/compose/runtime/internal/RememberEventDispatcher;->recordLeaving(Ljava/lang/Object;III)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final dispatchAbandons()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->abandoning:Ljava/util/Set;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Collection;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    const-string v0, "Compose:abandons"

    .line 12
    .line 13
    sget-object v1, Landroidx/compose/runtime/internal/Trace;->INSTANCE:Landroidx/compose/runtime/internal/Trace;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Landroidx/compose/runtime/internal/Trace;->beginSection(Ljava/lang/String;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :try_start_0
    iget-object v1, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->abandoning:Ljava/util/Set;

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Landroidx/compose/runtime/RememberObserver;

    .line 36
    .line 37
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 38
    .line 39
    .line 40
    invoke-interface {v2}, Landroidx/compose/runtime/RememberObserver;->onAbandoned()V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception v1

    .line 45
    goto :goto_1

    .line 46
    :cond_0
    sget-object v1, Lqc/q;->a:Lqc/q;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    sget-object v1, Landroidx/compose/runtime/internal/Trace;->INSTANCE:Landroidx/compose/runtime/internal/Trace;

    .line 49
    .line 50
    invoke-virtual {v1, v0}, Landroidx/compose/runtime/internal/Trace;->endSection(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :goto_1
    sget-object v2, Landroidx/compose/runtime/internal/Trace;->INSTANCE:Landroidx/compose/runtime/internal/Trace;

    .line 55
    .line 56
    invoke-virtual {v2, v0}, Landroidx/compose/runtime/internal/Trace;->endSection(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    throw v1

    .line 60
    :cond_1
    return-void
.end method

.method public final dispatchRememberObservers()V
    .locals 6

    .line 1
    const/high16 v0, -0x80000000

    .line 2
    .line 3
    invoke-direct {p0, v0}, Landroidx/compose/runtime/internal/RememberEventDispatcher;->processPendingLeaving(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->leaving:Landroidx/compose/runtime/collection/MutableVector;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_4

    .line 13
    .line 14
    const-string v0, "Compose:onForgotten"

    .line 15
    .line 16
    sget-object v1, Landroidx/compose/runtime/internal/Trace;->INSTANCE:Landroidx/compose/runtime/internal/Trace;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Landroidx/compose/runtime/internal/Trace;->beginSection(Ljava/lang/String;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :try_start_0
    iget-object v1, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->releasing:Landroidx/collection/MutableScatterSet;

    .line 23
    .line 24
    iget-object v2, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->leaving:Landroidx/compose/runtime/collection/MutableVector;

    .line 25
    .line 26
    invoke-virtual {v2}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    add-int/lit8 v2, v2, -0x1

    .line 31
    .line 32
    :goto_0
    const/4 v3, -0x1

    .line 33
    if-ge v3, v2, :cond_3

    .line 34
    .line 35
    iget-object v3, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->leaving:Landroidx/compose/runtime/collection/MutableVector;

    .line 36
    .line 37
    iget-object v3, v3, Landroidx/compose/runtime/collection/MutableVector;->content:[Ljava/lang/Object;

    .line 38
    .line 39
    aget-object v3, v3, v2

    .line 40
    .line 41
    instance-of v4, v3, Landroidx/compose/runtime/RememberObserverHolder;

    .line 42
    .line 43
    if-eqz v4, :cond_0

    .line 44
    .line 45
    move-object v4, v3

    .line 46
    check-cast v4, Landroidx/compose/runtime/RememberObserverHolder;

    .line 47
    .line 48
    invoke-virtual {v4}, Landroidx/compose/runtime/RememberObserverHolder;->getWrapped()Landroidx/compose/runtime/RememberObserver;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    iget-object v5, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->abandoning:Ljava/util/Set;

    .line 53
    .line 54
    invoke-interface {v5, v4}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    invoke-interface {v4}, Landroidx/compose/runtime/RememberObserver;->onForgotten()V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :catchall_0
    move-exception v1

    .line 62
    goto :goto_3

    .line 63
    :cond_0
    :goto_1
    instance-of v4, v3, Landroidx/compose/runtime/ComposeNodeLifecycleCallback;

    .line 64
    .line 65
    if-eqz v4, :cond_2

    .line 66
    .line 67
    if-eqz v1, :cond_1

    .line 68
    .line 69
    invoke-virtual {v1, v3}, Landroidx/collection/ScatterSet;->contains(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-eqz v4, :cond_1

    .line 74
    .line 75
    check-cast v3, Landroidx/compose/runtime/ComposeNodeLifecycleCallback;

    .line 76
    .line 77
    invoke-interface {v3}, Landroidx/compose/runtime/ComposeNodeLifecycleCallback;->onRelease()V

    .line 78
    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_1
    check-cast v3, Landroidx/compose/runtime/ComposeNodeLifecycleCallback;

    .line 82
    .line 83
    invoke-interface {v3}, Landroidx/compose/runtime/ComposeNodeLifecycleCallback;->onDeactivate()V

    .line 84
    .line 85
    .line 86
    :cond_2
    :goto_2
    add-int/lit8 v2, v2, -0x1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_3
    sget-object v1, Lqc/q;->a:Lqc/q;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    .line 91
    sget-object v1, Landroidx/compose/runtime/internal/Trace;->INSTANCE:Landroidx/compose/runtime/internal/Trace;

    .line 92
    .line 93
    invoke-virtual {v1, v0}, Landroidx/compose/runtime/internal/Trace;->endSection(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    goto :goto_4

    .line 97
    :goto_3
    sget-object v2, Landroidx/compose/runtime/internal/Trace;->INSTANCE:Landroidx/compose/runtime/internal/Trace;

    .line 98
    .line 99
    invoke-virtual {v2, v0}, Landroidx/compose/runtime/internal/Trace;->endSection(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    throw v1

    .line 103
    :cond_4
    :goto_4
    iget-object v0, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->remembering:Landroidx/compose/runtime/collection/MutableVector;

    .line 104
    .line 105
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_5

    .line 110
    .line 111
    sget-object v0, Landroidx/compose/runtime/internal/Trace;->INSTANCE:Landroidx/compose/runtime/internal/Trace;

    .line 112
    .line 113
    const-string v1, "Compose:onRemembered"

    .line 114
    .line 115
    invoke-virtual {v0, v1}, Landroidx/compose/runtime/internal/Trace;->beginSection(Ljava/lang/String;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    :try_start_1
    iget-object v2, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->remembering:Landroidx/compose/runtime/collection/MutableVector;

    .line 120
    .line 121
    invoke-direct {p0, v2}, Landroidx/compose/runtime/internal/RememberEventDispatcher;->dispatchRememberList(Landroidx/compose/runtime/collection/MutableVector;)V

    .line 122
    .line 123
    .line 124
    sget-object v2, Lqc/q;->a:Lqc/q;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 125
    .line 126
    invoke-virtual {v0, v1}, Landroidx/compose/runtime/internal/Trace;->endSection(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :catchall_1
    move-exception v0

    .line 131
    sget-object v2, Landroidx/compose/runtime/internal/Trace;->INSTANCE:Landroidx/compose/runtime/internal/Trace;

    .line 132
    .line 133
    invoke-virtual {v2, v1}, Landroidx/compose/runtime/internal/Trace;->endSection(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    throw v0

    .line 137
    :cond_5
    return-void
.end method

.method public final dispatchSideEffects()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->sideEffects:Landroidx/compose/runtime/collection/MutableVector;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    const-string v0, "Compose:sideeffects"

    .line 10
    .line 11
    sget-object v1, Landroidx/compose/runtime/internal/Trace;->INSTANCE:Landroidx/compose/runtime/internal/Trace;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Landroidx/compose/runtime/internal/Trace;->beginSection(Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :try_start_0
    iget-object v1, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->sideEffects:Landroidx/compose/runtime/collection/MutableVector;

    .line 18
    .line 19
    iget-object v2, v1, Landroidx/compose/runtime/collection/MutableVector;->content:[Ljava/lang/Object;

    .line 20
    .line 21
    invoke-virtual {v1}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v3, 0x0

    .line 26
    :goto_0
    if-ge v3, v1, :cond_0

    .line 27
    .line 28
    aget-object v4, v2, v3

    .line 29
    .line 30
    check-cast v4, Lhd/a;

    .line 31
    .line 32
    invoke-interface {v4}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    add-int/lit8 v3, v3, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception v1

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    iget-object v1, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->sideEffects:Landroidx/compose/runtime/collection/MutableVector;

    .line 41
    .line 42
    invoke-virtual {v1}, Landroidx/compose/runtime/collection/MutableVector;->clear()V

    .line 43
    .line 44
    .line 45
    sget-object v1, Lqc/q;->a:Lqc/q;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    sget-object v1, Landroidx/compose/runtime/internal/Trace;->INSTANCE:Landroidx/compose/runtime/internal/Trace;

    .line 48
    .line 49
    invoke-virtual {v1, v0}, Landroidx/compose/runtime/internal/Trace;->endSection(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :goto_1
    sget-object v2, Landroidx/compose/runtime/internal/Trace;->INSTANCE:Landroidx/compose/runtime/internal/Trace;

    .line 54
    .line 55
    invoke-virtual {v2, v0}, Landroidx/compose/runtime/internal/Trace;->endSection(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    throw v1

    .line 59
    :cond_1
    return-void
.end method

.method public endResumingScope(Landroidx/compose/runtime/RecomposeScopeImpl;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->pausedPlaceholders:Landroidx/collection/MutableScatterMap;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroidx/collection/ScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Landroidx/compose/runtime/internal/PausedCompositionRemembers;

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->nestedRemembersLists:Ljava/util/ArrayList;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-static {v1}, Landroidx/compose/runtime/Stack;->pop-impl(Ljava/util/ArrayList;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Landroidx/compose/runtime/collection/MutableVector;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iput-object v1, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->currentRememberingList:Landroidx/compose/runtime/collection/MutableVector;

    .line 26
    .line 27
    :cond_0
    invoke-virtual {v0, p1}, Landroidx/collection/MutableScatterMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    :cond_1
    return-void
.end method

.method public forgetting(Landroidx/compose/runtime/RememberObserverHolder;III)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/compose/runtime/internal/RememberEventDispatcher;->recordLeaving(Ljava/lang/Object;III)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public releasing(Landroidx/compose/runtime/ComposeNodeLifecycleCallback;III)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->releasing:Landroidx/collection/MutableScatterSet;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Landroidx/collection/ScatterSetKt;->mutableScatterSetOf()Landroidx/collection/MutableScatterSet;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->releasing:Landroidx/collection/MutableScatterSet;

    .line 10
    .line 11
    :cond_0
    invoke-virtual {v0, p1}, Landroidx/collection/MutableScatterSet;->plusAssign(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/compose/runtime/internal/RememberEventDispatcher;->recordLeaving(Ljava/lang/Object;III)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public rememberPausingScope(Landroidx/compose/runtime/RecomposeScopeImpl;)V
    .locals 3

    .line 1
    new-instance v0, Landroidx/compose/runtime/internal/PausedCompositionRemembers;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->abandoning:Ljava/util/Set;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroidx/compose/runtime/internal/PausedCompositionRemembers;-><init>(Ljava/util/Set;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->pausedPlaceholders:Landroidx/collection/MutableScatterMap;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-static {}, Landroidx/collection/ScatterMapKt;->mutableScatterMapOf()Landroidx/collection/MutableScatterMap;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iput-object v1, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->pausedPlaceholders:Landroidx/collection/MutableScatterMap;

    .line 17
    .line 18
    :cond_0
    invoke-virtual {v1, p1, v0}, Landroidx/collection/MutableScatterMap;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->currentRememberingList:Landroidx/compose/runtime/collection/MutableVector;

    .line 22
    .line 23
    new-instance v1, Landroidx/compose/runtime/RememberObserverHolder;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-direct {v1, v0, v2}, Landroidx/compose/runtime/RememberObserverHolder;-><init>(Landroidx/compose/runtime/RememberObserver;Landroidx/compose/runtime/Anchor;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v1}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public remembering(Landroidx/compose/runtime/RememberObserverHolder;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->currentRememberingList:Landroidx/compose/runtime/collection/MutableVector;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public sideEffect(Lhd/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/a;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->sideEffects:Landroidx/compose/runtime/collection/MutableVector;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public startResumingScope(Landroidx/compose/runtime/RecomposeScopeImpl;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->pausedPlaceholders:Landroidx/collection/MutableScatterMap;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroidx/collection/ScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Landroidx/compose/runtime/internal/PausedCompositionRemembers;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object p1, v1

    .line 14
    :goto_0
    if-eqz p1, :cond_2

    .line 15
    .line 16
    iget-object v0, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->nestedRemembersLists:Ljava/util/ArrayList;

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    invoke-static {v1, v0, v1}, Landroidx/compose/runtime/Stack;->constructor-impl$default(Ljava/util/ArrayList;ILkotlin/jvm/internal/n;)Ljava/util/ArrayList;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->nestedRemembersLists:Ljava/util/ArrayList;

    .line 26
    .line 27
    :cond_1
    iget-object v1, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->currentRememberingList:Landroidx/compose/runtime/collection/MutableVector;

    .line 28
    .line 29
    invoke-static {v0, v1}, Landroidx/compose/runtime/Stack;->push-impl(Ljava/util/ArrayList;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Landroidx/compose/runtime/internal/PausedCompositionRemembers;->getPausedRemembers()Landroidx/compose/runtime/collection/MutableVector;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Landroidx/compose/runtime/internal/RememberEventDispatcher;->currentRememberingList:Landroidx/compose/runtime/collection/MutableVector;

    .line 37
    .line 38
    :cond_2
    return-void
.end method
