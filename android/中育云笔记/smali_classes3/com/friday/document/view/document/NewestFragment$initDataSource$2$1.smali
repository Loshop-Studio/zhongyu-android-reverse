.class final Lcom/friday/document/view/document/NewestFragment$initDataSource$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/document/NewestFragment$initDataSource$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.friday.document.view.document.NewestFragment$initDataSource$2$1"
    f = "NewestFragment.kt"
    l = {
        0xc9
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lcom/friday/document/view/document/NewestFragment;


# direct methods
.method public constructor <init>(Lcom/friday/document/view/document/NewestFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/view/document/NewestFragment$initDataSource$2$1;->e:Lcom/friday/document/view/document/NewestFragment;

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
    .locals 2

    .line 1
    new-instance v0, Lcom/friday/document/view/document/NewestFragment$initDataSource$2$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/document/view/document/NewestFragment$initDataSource$2$1;->e:Lcom/friday/document/view/document/NewestFragment;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/friday/document/view/document/NewestFragment$initDataSource$2$1;-><init>(Lcom/friday/document/view/document/NewestFragment;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/friday/document/view/document/NewestFragment$initDataSource$2$1;->d:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Landroidx/paging/PagingData;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/document/NewestFragment$initDataSource$2$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/view/document/NewestFragment$initDataSource$2$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/view/document/NewestFragment$initDataSource$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Landroidx/paging/PagingData;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/document/NewestFragment$initDataSource$2$1;->invoke(Landroidx/paging/PagingData;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/friday/document/view/document/NewestFragment$initDataSource$2$1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/paging/PagingData;

    .line 4
    .line 5
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v2, p0, Lcom/friday/document/view/document/NewestFragment$initDataSource$2$1;->c:I

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    if-ne v2, v3, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lcom/friday/document/view/document/NewestFragment$initDataSource$2$1;->e:Lcom/friday/document/view/document/NewestFragment;

    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/friday/document/view/document/BaseDocumentFragment;->D()Landroidx/paging/PagingDataAdapter;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Lcom/friday/document/adapter/DocumentAdapter;

    .line 38
    .line 39
    invoke-static {v0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    iput-object v2, p0, Lcom/friday/document/view/document/NewestFragment$initDataSource$2$1;->d:Ljava/lang/Object;

    .line 44
    .line 45
    iput v3, p0, Lcom/friday/document/view/document/NewestFragment$initDataSource$2$1;->c:I

    .line 46
    .line 47
    invoke-virtual {p1, v0, p0}, Landroidx/paging/PagingDataAdapter;->submitData(Landroidx/paging/PagingData;Lvc/c;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-ne p1, v1, :cond_2

    .line 52
    .line 53
    return-object v1

    .line 54
    :cond_2
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 55
    .line 56
    return-object p1
.end method
