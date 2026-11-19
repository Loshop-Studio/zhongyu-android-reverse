.class final Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/s;


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
        "Lhd/s;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.document.viewmodel.FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1"
    f = "FolderViewModel.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public synthetic e:Ljava/lang/Object;

.field public synthetic f:Ljava/lang/Object;

.field public synthetic g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lvc/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x5

    .line 2
    invoke-direct {p0, v0, p1}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final g(Landroidx/paging/PagingData;Ljava/lang/Boolean;Ljava/util/List;Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1;

    .line 2
    .line 3
    invoke-direct {v0, p5}, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1;-><init>(Lvc/c;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, v0, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1;->d:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p2, v0, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1;->e:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p3, v0, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1;->f:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p4, v0, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1;->g:Ljava/lang/Object;

    .line 13
    .line 14
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/paging/PagingData;

    check-cast p2, Ljava/lang/Boolean;

    check-cast p3, Ljava/util/List;

    check-cast p4, Lcom/friday/common/entity/FileEntity;

    check-cast p5, Lvc/c;

    invoke-virtual/range {p0 .. p5}, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1;->g(Landroidx/paging/PagingData;Ljava/lang/Boolean;Ljava/util/List;Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/paging/PagingData;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/lang/Boolean;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1;->f:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ljava/util/List;

    .line 12
    .line 13
    iget-object v3, p0, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1;->g:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Lcom/friday/common/entity/FileEntity;

    .line 16
    .line 17
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    iget v4, p0, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1;->c:I

    .line 21
    .line 22
    if-nez v4, :cond_0

    .line 23
    .line 24
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    new-instance p1, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1$1;

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    invoke-direct {p1, v1, v2, v3, v4}, Lcom/friday/document/viewmodel/FolderViewModel$convertStateFlowToPagingDataFlow$1$3$1$1;-><init>(Ljava/lang/Boolean;Ljava/util/List;Lcom/friday/common/entity/FileEntity;Lvc/c;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v0, p1}, Landroidx/paging/PagingDataTransforms;->map(Landroidx/paging/PagingData;Lhd/p;)Landroidx/paging/PagingData;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p1
.end method
