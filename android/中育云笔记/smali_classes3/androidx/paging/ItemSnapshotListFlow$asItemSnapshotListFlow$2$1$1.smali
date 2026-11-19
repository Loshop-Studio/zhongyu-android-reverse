.class final Landroidx/paging/ItemSnapshotListFlow$asItemSnapshotListFlow$2$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/paging/ItemSnapshotListFlow$asItemSnapshotListFlow$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/q;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "androidx.paging.ItemSnapshotListFlow$asItemSnapshotListFlow$2$1$1"
    f = "ItemSnapshotListFlow.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field final synthetic $errorCombinedLoadStates:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Landroidx/paging/CombinedLoadStates;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onLoadError:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lhd/l;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Landroidx/paging/CombinedLoadStates;",
            ">;",
            "Lhd/l;",
            "Lvc/c<",
            "-",
            "Landroidx/paging/ItemSnapshotListFlow$asItemSnapshotListFlow$2$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/paging/ItemSnapshotListFlow$asItemSnapshotListFlow$2$1$1;->$errorCombinedLoadStates:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/paging/ItemSnapshotListFlow$asItemSnapshotListFlow$2$1$1;->$onLoadError:Lhd/l;

    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Landroidx/paging/PageStore;Landroidx/paging/PageEvent;Lvc/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PageStore<",
            "TT;>;",
            "Landroidx/paging/PageEvent<",
            "TT;>;",
            "Lvc/c<",
            "-",
            "Landroidx/paging/PageStore<",
            "TT;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/paging/ItemSnapshotListFlow$asItemSnapshotListFlow$2$1$1;

    iget-object v1, p0, Landroidx/paging/ItemSnapshotListFlow$asItemSnapshotListFlow$2$1$1;->$errorCombinedLoadStates:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v2, p0, Landroidx/paging/ItemSnapshotListFlow$asItemSnapshotListFlow$2$1$1;->$onLoadError:Lhd/l;

    invoke-direct {v0, v1, v2, p3}, Landroidx/paging/ItemSnapshotListFlow$asItemSnapshotListFlow$2$1$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lhd/l;Lvc/c;)V

    iput-object p1, v0, Landroidx/paging/ItemSnapshotListFlow$asItemSnapshotListFlow$2$1$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Landroidx/paging/ItemSnapshotListFlow$asItemSnapshotListFlow$2$1$1;->L$1:Ljava/lang/Object;

    sget-object p1, Lqc/q;->a:Lqc/q;

    invoke-virtual {v0, p1}, Landroidx/paging/ItemSnapshotListFlow$asItemSnapshotListFlow$2$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Landroidx/paging/PageStore;

    check-cast p2, Landroidx/paging/PageEvent;

    check-cast p3, Lvc/c;

    invoke-virtual {p0, p1, p2, p3}, Landroidx/paging/ItemSnapshotListFlow$asItemSnapshotListFlow$2$1$1;->invoke(Landroidx/paging/PageStore;Landroidx/paging/PageEvent;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Landroidx/paging/ItemSnapshotListFlow$asItemSnapshotListFlow$2$1$1;->label:I

    .line 5
    .line 6
    if-nez v0, :cond_7

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Landroidx/paging/ItemSnapshotListFlow$asItemSnapshotListFlow$2$1$1;->L$0:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Landroidx/paging/PageStore;

    .line 14
    .line 15
    iget-object v0, p0, Landroidx/paging/ItemSnapshotListFlow$asItemSnapshotListFlow$2$1$1;->L$1:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Landroidx/paging/PageEvent;

    .line 18
    .line 19
    instance-of v1, v0, Landroidx/paging/PageEvent$LoadStateUpdate;

    .line 20
    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    check-cast v0, Landroidx/paging/PageEvent$LoadStateUpdate;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroidx/paging/PageEvent$LoadStateUpdate;->getSource()Landroidx/paging/LoadStates;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Landroidx/paging/LoadStates;->hasError()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_1

    .line 34
    .line 35
    invoke-virtual {v0}, Landroidx/paging/PageEvent$LoadStateUpdate;->getMediator()Landroidx/paging/LoadStates;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    invoke-virtual {v1}, Landroidx/paging/LoadStates;->hasError()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    const/4 v2, 0x1

    .line 46
    if-ne v1, v2, :cond_0

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    return-object p1

    .line 50
    :cond_1
    :goto_0
    iget-object v1, p0, Landroidx/paging/ItemSnapshotListFlow$asItemSnapshotListFlow$2$1$1;->$errorCombinedLoadStates:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 51
    .line 52
    iget-object v2, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v2, Landroidx/paging/CombinedLoadStates;

    .line 55
    .line 56
    invoke-virtual {v0}, Landroidx/paging/PageEvent$LoadStateUpdate;->getSource()Landroidx/paging/LoadStates;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v0}, Landroidx/paging/PageEvent$LoadStateUpdate;->getMediator()Landroidx/paging/LoadStates;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {v2, v3, v0}, Landroidx/paging/MutableCombinedLoadStateCollectionKt;->computeNewState(Landroidx/paging/CombinedLoadStates;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)Landroidx/paging/CombinedLoadStates;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iput-object v0, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 69
    .line 70
    iget-object v0, p0, Landroidx/paging/ItemSnapshotListFlow$asItemSnapshotListFlow$2$1$1;->$onLoadError:Lhd/l;

    .line 71
    .line 72
    iget-object v1, p0, Landroidx/paging/ItemSnapshotListFlow$asItemSnapshotListFlow$2$1$1;->$errorCombinedLoadStates:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 73
    .line 74
    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 75
    .line 76
    invoke-interface {v0, v1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    return-object p1

    .line 80
    :cond_2
    instance-of v1, v0, Landroidx/paging/PageEvent$StaticList;

    .line 81
    .line 82
    if-eqz v1, :cond_3

    .line 83
    .line 84
    new-instance p1, Landroidx/paging/PageStore;

    .line 85
    .line 86
    new-instance v1, Landroidx/paging/TransformablePage;

    .line 87
    .line 88
    check-cast v0, Landroidx/paging/PageEvent$StaticList;

    .line 89
    .line 90
    invoke-virtual {v0}, Landroidx/paging/PageEvent$StaticList;->getData()Ljava/util/List;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    const/4 v3, 0x0

    .line 95
    invoke-direct {v1, v3, v2}, Landroidx/paging/TransformablePage;-><init>(ILjava/util/List;)V

    .line 96
    .line 97
    .line 98
    invoke-static {v1}, Lrc/v;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {v0}, Landroidx/paging/PageEvent$StaticList;->getPlaceholdersBefore()I

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    invoke-virtual {v0}, Landroidx/paging/PageEvent$StaticList;->getPlaceholdersAfter()I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    invoke-direct {p1, v1, v2, v0}, Landroidx/paging/PageStore;-><init>(Ljava/util/List;II)V

    .line 111
    .line 112
    .line 113
    return-object p1

    .line 114
    :cond_3
    instance-of v1, v0, Landroidx/paging/PageEvent$Insert;

    .line 115
    .line 116
    if-eqz v1, :cond_5

    .line 117
    .line 118
    move-object v1, v0

    .line 119
    check-cast v1, Landroidx/paging/PageEvent$Insert;

    .line 120
    .line 121
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getLoadType()Landroidx/paging/LoadType;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    sget-object v3, Landroidx/paging/LoadType;->REFRESH:Landroidx/paging/LoadType;

    .line 126
    .line 127
    if-ne v2, v3, :cond_5

    .line 128
    .line 129
    if-nez p1, :cond_4

    .line 130
    .line 131
    new-instance p1, Landroidx/paging/PageStore;

    .line 132
    .line 133
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getPages()Ljava/util/List;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getPlaceholdersBefore()I

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    invoke-virtual {v1}, Landroidx/paging/PageEvent$Insert;->getPlaceholdersAfter()I

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    invoke-direct {p1, v0, v2, v1}, Landroidx/paging/PageStore;-><init>(Ljava/util/List;II)V

    .line 146
    .line 147
    .line 148
    return-object p1

    .line 149
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 150
    .line 151
    const-string v0, "PageStore should be null on REFRESH. This likely indicates an error in the library. Please file a bug in the Buganizer"

    .line 152
    .line 153
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    throw p1

    .line 157
    :cond_5
    if-eqz p1, :cond_6

    .line 158
    .line 159
    invoke-virtual {p1, v0}, Landroidx/paging/PageStore;->processEvent(Landroidx/paging/PageEvent;)Landroidx/paging/PagingDataEvent;

    .line 160
    .line 161
    .line 162
    return-object p1

    .line 163
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 164
    .line 165
    const-string v0, "PageStore should only be null on REFRESH. This likely indicates an error in the library. Please file a bug in the Buganizer"

    .line 166
    .line 167
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    throw p1

    .line 171
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 172
    .line 173
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 174
    .line 175
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    throw p1
.end method
