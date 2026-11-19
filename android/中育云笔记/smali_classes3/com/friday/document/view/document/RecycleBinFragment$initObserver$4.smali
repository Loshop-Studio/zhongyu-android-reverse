.class final Lcom/friday/document/view/document/RecycleBinFragment$initObserver$4;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/document/RecycleBinFragment;->initObserver()V
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
    c = "com.friday.document.view.document.RecycleBinFragment$initObserver$4"
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
    iput-object p1, p0, Lcom/friday/document/view/document/RecycleBinFragment$initObserver$4;->d:Lcom/friday/document/view/document/RecycleBinFragment;

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

.method public static synthetic g(Lcom/friday/document/view/document/RecycleBinFragment;Ljava/lang/Boolean;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/document/RecycleBinFragment$initObserver$4;->m(Lcom/friday/document/view/document/RecycleBinFragment;Ljava/lang/Boolean;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final m(Lcom/friday/document/view/document/RecycleBinFragment;Ljava/lang/Boolean;)Lqc/q;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 3
    .line 4
    .line 5
    invoke-static {p0}, Lcom/friday/document/view/document/RecycleBinFragment;->Y(Lcom/friday/document/view/document/RecycleBinFragment;)Lcom/friday/document/databinding/FragmentRecycleBinBinding;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget-object p0, p0, Lcom/friday/document/databinding/FragmentRecycleBinBinding;->i:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setEnabled(Z)V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 19
    .line 20
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/friday/document/view/document/RecycleBinFragment$initObserver$4;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/view/document/RecycleBinFragment$initObserver$4;->d:Lcom/friday/document/view/document/RecycleBinFragment;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/document/view/document/RecycleBinFragment$initObserver$4;-><init>(Lcom/friday/document/view/document/RecycleBinFragment;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/document/RecycleBinFragment$initObserver$4;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/document/RecycleBinFragment$initObserver$4;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/view/document/RecycleBinFragment$initObserver$4;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/view/document/RecycleBinFragment$initObserver$4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/friday/document/view/document/RecycleBinFragment$initObserver$4;->c:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/friday/document/view/document/RecycleBinFragment$initObserver$4;->d:Lcom/friday/document/view/document/RecycleBinFragment;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->j0()Landroidx/lifecycle/MutableLiveData;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object v0, p0, Lcom/friday/document/view/document/RecycleBinFragment$initObserver$4;->d:Lcom/friday/document/view/document/RecycleBinFragment;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v1, p0, Lcom/friday/document/view/document/RecycleBinFragment$initObserver$4;->d:Lcom/friday/document/view/document/RecycleBinFragment;

    .line 30
    .line 31
    new-instance v2, Lcom/friday/document/view/document/a;

    .line 32
    .line 33
    invoke-direct {v2, v1}, Lcom/friday/document/view/document/a;-><init>(Lcom/friday/document/view/document/RecycleBinFragment;)V

    .line 34
    .line 35
    .line 36
    new-instance v1, Lcom/friday/document/view/document/RecycleBinFragment$a;

    .line 37
    .line 38
    invoke-direct {v1, v2}, Lcom/friday/document/view/document/RecycleBinFragment$a;-><init>(Lhd/l;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v0, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 42
    .line 43
    .line 44
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 45
    .line 46
    return-object p1

    .line 47
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1
.end method
