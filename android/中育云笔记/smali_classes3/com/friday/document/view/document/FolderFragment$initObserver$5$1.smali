.class final Lcom/friday/document/view/document/FolderFragment$initObserver$5$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/document/FolderFragment$initObserver$5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.friday.document.view.document.FolderFragment$initObserver$5$1"
    f = "FolderFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lcom/friday/document/view/document/FolderFragment;


# direct methods
.method public constructor <init>(Lcom/friday/document/view/document/FolderFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/view/document/FolderFragment$initObserver$5$1;->e:Lcom/friday/document/view/document/FolderFragment;

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
    new-instance v0, Lcom/friday/document/view/document/FolderFragment$initObserver$5$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/document/view/document/FolderFragment$initObserver$5$1;->e:Lcom/friday/document/view/document/FolderFragment;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/friday/document/view/document/FolderFragment$initObserver$5$1;-><init>(Lcom/friday/document/view/document/FolderFragment;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/friday/document/view/document/FolderFragment$initObserver$5$1;->d:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final g(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/document/FolderFragment$initObserver$5$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/friday/document/view/document/FolderFragment$initObserver$5$1;

    .line 6
    .line 7
    sget-object p2, Lqc/q;->a:Lqc/q;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcom/friday/document/view/document/FolderFragment$initObserver$5$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/document/FolderFragment$initObserver$5$1;->g(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/friday/document/view/document/FolderFragment$initObserver$5$1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/friday/document/view/document/FolderFragment$initObserver$5$1;->c:I

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/friday/document/view/document/FolderFragment$initObserver$5$1;->e:Lcom/friday/document/view/document/FolderFragment;

    .line 16
    .line 17
    invoke-static {p1}, Lcom/friday/document/view/document/FolderFragment;->d0(Lcom/friday/document/view/document/FolderFragment;)Ljava/util/Stack;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    new-instance v1, Lcom/friday/document/view/document/FileListFragment;

    .line 22
    .line 23
    iget-object v2, p0, Lcom/friday/document/view/document/FolderFragment$initObserver$5$1;->e:Lcom/friday/document/view/document/FolderFragment;

    .line 24
    .line 25
    invoke-virtual {v2}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Lcom/friday/document/viewmodel/FolderViewModel;

    .line 30
    .line 31
    invoke-direct {v1, v2, v3, v0}, Lcom/friday/document/view/document/FileListFragment;-><init>(Lv2/x;Lcom/friday/document/viewmodel/FolderViewModel;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lcom/friday/document/view/document/FolderFragment$initObserver$5$1;->e:Lcom/friday/document/view/document/FolderFragment;

    .line 38
    .line 39
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    sget v0, Lcom/friday/document/R$id;->fragment_list:I

    .line 48
    .line 49
    iget-object v1, p0, Lcom/friday/document/view/document/FolderFragment$initObserver$5$1;->e:Lcom/friday/document/view/document/FolderFragment;

    .line 50
    .line 51
    invoke-static {v1}, Lcom/friday/document/view/document/FolderFragment;->c0(Lcom/friday/document/view/document/FolderFragment;)Lcom/friday/document/view/document/FileListFragment;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {p1, v0, v1}, Landroidx/fragment/app/FragmentTransaction;->add(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iget-object v0, p0, Lcom/friday/document/view/document/FolderFragment$initObserver$5$1;->e:Lcom/friday/document/view/document/FolderFragment;

    .line 60
    .line 61
    invoke-static {v0}, Lcom/friday/document/view/document/FolderFragment;->c0(Lcom/friday/document/view/document/FolderFragment;)Lcom/friday/document/view/document/FileListFragment;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {p1, v0}, Landroidx/fragment/app/FragmentTransaction;->show(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 70
    .line 71
    .line 72
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 73
    .line 74
    return-object p1

    .line 75
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 76
    .line 77
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 78
    .line 79
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p1
.end method
