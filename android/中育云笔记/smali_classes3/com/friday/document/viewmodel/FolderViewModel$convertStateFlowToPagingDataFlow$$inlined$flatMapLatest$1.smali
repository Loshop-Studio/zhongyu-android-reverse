.class public final Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$$inlined$flatMapLatest$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/FolderViewModel;->I0(Lvd/u;)Lvd/c;
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
    c = "com.friday.document.viewmodel.FolderViewModel$convertStateFlowToPagingDataFlow$$inlined$flatMapLatest$1"
    f = "FolderViewModel.kt"
    l = {
        0xbd
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Lcom/friday/document/viewmodel/FolderViewModel;


# direct methods
.method public constructor <init>(Lvc/c;Lcom/friday/document/viewmodel/FolderViewModel;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$$inlined$flatMapLatest$1;->f:Lcom/friday/document/viewmodel/FolderViewModel;

    .line 2
    .line 3
    const/4 p2, 0x3

    .line 4
    invoke-direct {p0, p2, p1}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lvd/d;

    check-cast p3, Lvc/c;

    invoke-virtual {p0, p1, p2, p3}, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$$inlined$flatMapLatest$1;->invoke(Lvd/d;Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lvd/d;Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;
    .locals 2

    .line 2
    new-instance v0, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$$inlined$flatMapLatest$1;

    iget-object v1, p0, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$$inlined$flatMapLatest$1;->f:Lcom/friday/document/viewmodel/FolderViewModel;

    invoke-direct {v0, p3, v1}, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$$inlined$flatMapLatest$1;-><init>(Lvc/c;Lcom/friday/document/viewmodel/FolderViewModel;)V

    iput-object p1, v0, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$$inlined$flatMapLatest$1;->d:Ljava/lang/Object;

    iput-object p2, v0, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$$inlined$flatMapLatest$1;->e:Ljava/lang/Object;

    sget-object p1, Lqc/q;->a:Lqc/q;

    invoke-virtual {v0, p1}, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$$inlined$flatMapLatest$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$$inlined$flatMapLatest$1;->c:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$$inlined$flatMapLatest$1;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lvd/d;

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto/16 :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$$inlined$flatMapLatest$1;->d:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p1, Lvd/d;

    .line 35
    .line 36
    iget-object v1, p0, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$$inlined$flatMapLatest$1;->e:Ljava/lang/Object;

    .line 37
    .line 38
    move-object v3, v1

    .line 39
    check-cast v3, Lkotlin/Pair;

    .line 40
    .line 41
    new-instance v4, Landroidx/paging/Pager;

    .line 42
    .line 43
    new-instance v5, Landroidx/paging/PagingConfig;

    .line 44
    .line 45
    const/16 v12, 0x3e

    .line 46
    .line 47
    const/4 v13, 0x0

    .line 48
    const/16 v6, 0x14

    .line 49
    .line 50
    const/4 v7, 0x0

    .line 51
    const/4 v8, 0x0

    .line 52
    const/4 v9, 0x0

    .line 53
    const/4 v10, 0x0

    .line 54
    const/4 v11, 0x0

    .line 55
    invoke-direct/range {v5 .. v13}, Landroidx/paging/PagingConfig;-><init>(IIZIIIILkotlin/jvm/internal/n;)V

    .line 56
    .line 57
    .line 58
    new-instance v7, Lcom/friday/document/viewmodel/FolderViewModel$a;

    .line 59
    .line 60
    iget-object v6, p0, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$$inlined$flatMapLatest$1;->f:Lcom/friday/document/viewmodel/FolderViewModel;

    .line 61
    .line 62
    invoke-direct {v7, v3, v6}, Lcom/friday/document/viewmodel/FolderViewModel$a;-><init>(Lkotlin/Pair;Lcom/friday/document/viewmodel/FolderViewModel;)V

    .line 63
    .line 64
    .line 65
    const/4 v8, 0x2

    .line 66
    const/4 v9, 0x0

    .line 67
    const/4 v6, 0x0

    .line 68
    invoke-direct/range {v4 .. v9}, Landroidx/paging/Pager;-><init>(Landroidx/paging/PagingConfig;Ljava/lang/Object;Lhd/a;ILkotlin/jvm/internal/n;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v4}, Landroidx/paging/Pager;->getFlow()Lvd/c;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-static {v3, v4}, Lvd/e;->E(Lvd/c;Lkotlin/coroutines/d;)Lvd/c;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    new-instance v4, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$lambda$3$$inlined$map$1;

    .line 84
    .line 85
    iget-object v5, p0, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$$inlined$flatMapLatest$1;->f:Lcom/friday/document/viewmodel/FolderViewModel;

    .line 86
    .line 87
    invoke-direct {v4, v3, v5}, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$lambda$3$$inlined$map$1;-><init>(Lvd/c;Lcom/friday/document/viewmodel/FolderViewModel;)V

    .line 88
    .line 89
    .line 90
    iget-object v3, p0, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$$inlined$flatMapLatest$1;->f:Lcom/friday/document/viewmodel/FolderViewModel;

    .line 91
    .line 92
    invoke-static {v3}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-static {v4, v3}, Landroidx/paging/CachedPagingDataKt;->cachedIn(Lvd/c;Lsd/i0;)Lvd/c;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    iget-object v4, p0, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$$inlined$flatMapLatest$1;->f:Lcom/friday/document/viewmodel/FolderViewModel;

    .line 101
    .line 102
    invoke-virtual {v4}, Lcom/friday/document/viewmodel/BaseFileViewModel;->Z()Landroidx/lifecycle/MutableLiveData;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    invoke-static {v4}, Landroidx/lifecycle/FlowLiveDataConversions;->asFlow(Landroidx/lifecycle/LiveData;)Lvd/c;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    iget-object v5, p0, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$$inlined$flatMapLatest$1;->f:Lcom/friday/document/viewmodel/FolderViewModel;

    .line 111
    .line 112
    invoke-virtual {v5}, Lcom/friday/document/viewmodel/BaseFileViewModel;->a0()Lvd/l;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    iget-object v6, p0, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$$inlined$flatMapLatest$1;->f:Lcom/friday/document/viewmodel/FolderViewModel;

    .line 117
    .line 118
    invoke-virtual {v6}, Lcom/friday/document/viewmodel/BaseFileViewModel;->Y()Landroidx/lifecycle/MutableLiveData;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    invoke-static {v6}, Landroidx/lifecycle/FlowLiveDataConversions;->asFlow(Landroidx/lifecycle/LiveData;)Lvd/c;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    new-instance v7, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1;

    .line 127
    .line 128
    const/4 v8, 0x0

    .line 129
    invoke-direct {v7, v8}, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1;-><init>(Lvc/c;)V

    .line 130
    .line 131
    .line 132
    invoke-static {v3, v4, v5, v6, v7}, Lvd/e;->j(Lvd/c;Lvd/c;Lvd/c;Lvd/c;Lhd/s;)Lvd/c;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    iget-object v4, p0, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$$inlined$flatMapLatest$1;->f:Lcom/friday/document/viewmodel/FolderViewModel;

    .line 137
    .line 138
    invoke-static {v4}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    invoke-static {v3, v4}, Landroidx/paging/CachedPagingDataKt;->cachedIn(Lvd/c;Lsd/i0;)Lvd/c;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    iput-object v4, p0, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$$inlined$flatMapLatest$1;->d:Ljava/lang/Object;

    .line 151
    .line 152
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    iput-object v1, p0, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$$inlined$flatMapLatest$1;->e:Ljava/lang/Object;

    .line 157
    .line 158
    iput v2, p0, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$$inlined$flatMapLatest$1;->c:I

    .line 159
    .line 160
    invoke-static {p1, v3, p0}, Lvd/e;->t(Lvd/d;Lvd/c;Lvc/c;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    if-ne p1, v0, :cond_2

    .line 165
    .line 166
    return-object v0

    .line 167
    :cond_2
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 168
    .line 169
    return-object p1
.end method
