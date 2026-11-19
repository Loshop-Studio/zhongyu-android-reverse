.class final Lcom/friday/document/viewmodel/ManualSyncViewModel$findSyncFailedList$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/ManualSyncViewModel;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.document.viewmodel.ManualSyncViewModel$findSyncFailedList$1"
    f = "ManualSyncViewModel.kt"
    l = {
        0x26,
        0x26
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/document/viewmodel/ManualSyncViewModel;


# direct methods
.method public constructor <init>(Lcom/friday/document/viewmodel/ManualSyncViewModel;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/viewmodel/ManualSyncViewModel$findSyncFailedList$1;->d:Lcom/friday/document/viewmodel/ManualSyncViewModel;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/friday/document/viewmodel/ManualSyncViewModel$findSyncFailedList$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/viewmodel/ManualSyncViewModel$findSyncFailedList$1;->d:Lcom/friday/document/viewmodel/ManualSyncViewModel;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/document/viewmodel/ManualSyncViewModel$findSyncFailedList$1;-><init>(Lcom/friday/document/viewmodel/ManualSyncViewModel;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/ManualSyncViewModel$findSyncFailedList$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/ManualSyncViewModel$findSyncFailedList$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/viewmodel/ManualSyncViewModel$findSyncFailedList$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/viewmodel/ManualSyncViewModel$findSyncFailedList$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/document/viewmodel/ManualSyncViewModel$findSyncFailedList$1;->c:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x2

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v2, :cond_1

    .line 12
    .line 13
    if-ne v1, v3, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto :goto_2

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lcom/friday/document/viewmodel/ManualSyncViewModel$findSyncFailedList$1;->d:Lcom/friday/document/viewmodel/ManualSyncViewModel;

    .line 35
    .line 36
    invoke-static {p1}, Lcom/friday/document/viewmodel/ManualSyncViewModel;->f(Lcom/friday/document/viewmodel/ManualSyncViewModel;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_4

    .line 41
    .line 42
    iget-object p1, p0, Lcom/friday/document/viewmodel/ManualSyncViewModel$findSyncFailedList$1;->d:Lcom/friday/document/viewmodel/ManualSyncViewModel;

    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/ManualSyncViewModel;->j()Lcom/friday/common/dao/FileDao;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iget-object v1, p0, Lcom/friday/document/viewmodel/ManualSyncViewModel$findSyncFailedList$1;->d:Lcom/friday/document/viewmodel/ManualSyncViewModel;

    .line 49
    .line 50
    invoke-static {v1}, Lcom/friday/document/viewmodel/ManualSyncViewModel;->g(Lcom/friday/document/viewmodel/ManualSyncViewModel;)J

    .line 51
    .line 52
    .line 53
    move-result-wide v4

    .line 54
    iput v2, p0, Lcom/friday/document/viewmodel/ManualSyncViewModel$findSyncFailedList$1;->c:I

    .line 55
    .line 56
    invoke-interface {p1, v4, v5, p0}, Lcom/friday/common/dao/FileDao;->S(JLvc/c;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-ne p1, v0, :cond_3

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    :goto_0
    check-cast p1, Ljava/util/List;

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_4
    iget-object p1, p0, Lcom/friday/document/viewmodel/ManualSyncViewModel$findSyncFailedList$1;->d:Lcom/friday/document/viewmodel/ManualSyncViewModel;

    .line 67
    .line 68
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/ManualSyncViewModel;->j()Lcom/friday/common/dao/FileDao;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iget-object v1, p0, Lcom/friday/document/viewmodel/ManualSyncViewModel$findSyncFailedList$1;->d:Lcom/friday/document/viewmodel/ManualSyncViewModel;

    .line 73
    .line 74
    invoke-static {v1}, Lcom/friday/document/viewmodel/ManualSyncViewModel;->g(Lcom/friday/document/viewmodel/ManualSyncViewModel;)J

    .line 75
    .line 76
    .line 77
    move-result-wide v1

    .line 78
    iput v3, p0, Lcom/friday/document/viewmodel/ManualSyncViewModel$findSyncFailedList$1;->c:I

    .line 79
    .line 80
    invoke-interface {p1, v1, v2, p0}, Lcom/friday/common/dao/FileDao;->n(JLvc/c;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    if-ne p1, v0, :cond_5

    .line 85
    .line 86
    :goto_1
    return-object v0

    .line 87
    :cond_5
    :goto_2
    check-cast p1, Ljava/util/List;

    .line 88
    .line 89
    :goto_3
    iget-object v0, p0, Lcom/friday/document/viewmodel/ManualSyncViewModel$findSyncFailedList$1;->d:Lcom/friday/document/viewmodel/ManualSyncViewModel;

    .line 90
    .line 91
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/ManualSyncViewModel;->i()Landroidx/lifecycle/MutableLiveData;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast p1, Ljava/lang/Iterable;

    .line 96
    .line 97
    new-instance v1, Ljava/util/ArrayList;

    .line 98
    .line 99
    const/16 v2, 0xa

    .line 100
    .line 101
    invoke-static {p1, v2}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 106
    .line 107
    .line 108
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-eqz v2, :cond_6

    .line 117
    .line 118
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    check-cast v2, Lcom/friday/common/entity/FileEntity;

    .line 123
    .line 124
    new-instance v4, Lcom/friday/document/model/ManualSyncEntity;

    .line 125
    .line 126
    const/4 v5, 0x0

    .line 127
    const/4 v6, 0x0

    .line 128
    invoke-direct {v4, v2, v5, v3, v6}, Lcom/friday/document/model/ManualSyncEntity;-><init>(Lcom/friday/common/entity/FileEntity;IILkotlin/jvm/internal/n;)V

    .line 129
    .line 130
    .line 131
    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    goto :goto_4

    .line 135
    :cond_6
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 139
    .line 140
    return-object p1
.end method
