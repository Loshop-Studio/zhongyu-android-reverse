.class final Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.friday.document.viewmodel.FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1$1"
    f = "FolderViewModel.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Boolean;

.field public final synthetic f:Ljava/util/List;

.field public final synthetic g:Lcom/friday/common/entity/FileEntity;


# direct methods
.method public constructor <init>(Ljava/lang/Boolean;Ljava/util/List;Lcom/friday/common/entity/FileEntity;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1$1;->e:Ljava/lang/Boolean;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1$1;->f:Ljava/util/List;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1$1;->g:Lcom/friday/common/entity/FileEntity;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 4

    .line 1
    new-instance v0, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1$1;->e:Ljava/lang/Boolean;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1$1;->f:Ljava/util/List;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1$1;->g:Lcom/friday/common/entity/FileEntity;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3, p2}, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1$1;-><init>(Ljava/lang/Boolean;Ljava/util/List;Lcom/friday/common/entity/FileEntity;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1$1;->d:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public final g(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1$1;

    .line 6
    .line 7
    sget-object p2, Lqc/q;->a:Lqc/q;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/friday/common/entity/FileEntity;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1$1;->g(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1$1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/friday/common/entity/FileEntity;

    .line 4
    .line 5
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1$1;->c:I

    .line 9
    .line 10
    if-nez v1, :cond_5

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1$1;->e:Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iget-object v1, p0, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1$1;->e:Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    iget-object v1, p0, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1$1;->f:Ljava/util/List;

    .line 33
    .line 34
    check-cast v1, Ljava/lang/Iterable;

    .line 35
    .line 36
    instance-of v2, v1, Ljava/util/Collection;

    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    if-eqz v2, :cond_0

    .line 40
    .line 41
    move-object v2, v1

    .line 42
    check-cast v2, Ljava/util/Collection;

    .line 43
    .line 44
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_0

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_0
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_4

    .line 60
    .line 61
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    check-cast v2, Lcom/friday/common/entity/FileEntity;

    .line 66
    .line 67
    invoke-virtual {v2}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-static {v2, v4}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_1

    .line 80
    .line 81
    const/4 v3, 0x1

    .line 82
    goto :goto_1

    .line 83
    :cond_2
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    iget-object v2, p0, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1$1;->g:Lcom/friday/common/entity/FileEntity;

    .line 88
    .line 89
    if-eqz v2, :cond_3

    .line 90
    .line 91
    invoke-virtual {v2}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    goto :goto_0

    .line 96
    :cond_3
    const/4 v2, 0x0

    .line 97
    :goto_0
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    :cond_4
    :goto_1
    new-instance v1, Lcom/friday/document/adapter/MultiModeFileEntity;

    .line 102
    .line 103
    invoke-direct {v1, p1, v3, v0}, Lcom/friday/document/adapter/MultiModeFileEntity;-><init>(ZZLcom/friday/common/entity/FileEntity;)V

    .line 104
    .line 105
    .line 106
    return-object v1

    .line 107
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 108
    .line 109
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 110
    .line 111
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw p1
.end method
