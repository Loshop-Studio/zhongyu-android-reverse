.class final Lcom/friday/document/view/document/RecycleBinFragment$initView$3$2$onItemRangeRemoved$1$find$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/document/RecycleBinFragment$initView$3$2$onItemRangeRemoved$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.friday.document.view.document.RecycleBinFragment$initView$3$2$onItemRangeRemoved$1$find$1"
    f = "RecycleBinFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/document/view/document/RecycleBinFragment;


# direct methods
.method public constructor <init>(Lcom/friday/document/view/document/RecycleBinFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/view/document/RecycleBinFragment$initView$3$2$onItemRangeRemoved$1$find$1;->d:Lcom/friday/document/view/document/RecycleBinFragment;

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
    new-instance p1, Lcom/friday/document/view/document/RecycleBinFragment$initView$3$2$onItemRangeRemoved$1$find$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/view/document/RecycleBinFragment$initView$3$2$onItemRangeRemoved$1$find$1;->d:Lcom/friday/document/view/document/RecycleBinFragment;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/document/view/document/RecycleBinFragment$initView$3$2$onItemRangeRemoved$1$find$1;-><init>(Lcom/friday/document/view/document/RecycleBinFragment;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/document/RecycleBinFragment$initView$3$2$onItemRangeRemoved$1$find$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/document/RecycleBinFragment$initView$3$2$onItemRangeRemoved$1$find$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/view/document/RecycleBinFragment$initView$3$2$onItemRangeRemoved$1$find$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/view/document/RecycleBinFragment$initView$3$2$onItemRangeRemoved$1$find$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/friday/document/view/document/RecycleBinFragment$initView$3$2$onItemRangeRemoved$1$find$1;->c:I

    .line 5
    .line 6
    if-nez v0, :cond_3

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/friday/document/view/document/RecycleBinFragment$initView$3$2$onItemRangeRemoved$1$find$1;->d:Lcom/friday/document/view/document/RecycleBinFragment;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/friday/document/view/document/BaseDocumentFragment;->D()Landroidx/paging/PagingDataAdapter;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lcom/friday/document/adapter/RecycleBinAdapter;

    .line 18
    .line 19
    invoke-virtual {p1}, Landroidx/paging/PagingDataAdapter;->snapshot()Landroidx/paging/ItemSnapshotList;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Landroidx/paging/ItemSnapshotList;->getItems()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Ljava/lang/Iterable;

    .line 28
    .line 29
    iget-object v0, p0, Lcom/friday/document/view/document/RecycleBinFragment$initView$3$2$onItemRangeRemoved$1$find$1;->d:Lcom/friday/document/view/document/RecycleBinFragment;

    .line 30
    .line 31
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    const/4 v2, 0x0

    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    move-object v3, v1

    .line 47
    check-cast v3, Lcom/friday/document/adapter/MultiModeFileEntity;

    .line 48
    .line 49
    invoke-virtual {v3}, Lcom/friday/document/adapter/MultiModeFileEntity;->getEntity()Lcom/friday/common/entity/FileEntity;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v3}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-virtual {v0}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    check-cast v4, Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 62
    .line 63
    invoke-virtual {v4}, Lcom/friday/document/viewmodel/BaseFileViewModel;->W()Lcom/friday/common/entity/FileEntity;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    if-eqz v4, :cond_1

    .line 68
    .line 69
    invoke-virtual {v4}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    :cond_1
    invoke-static {v3, v2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_0

    .line 78
    .line 79
    return-object v1

    .line 80
    :cond_2
    return-object v2

    .line 81
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 82
    .line 83
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 84
    .line 85
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw p1
.end method
