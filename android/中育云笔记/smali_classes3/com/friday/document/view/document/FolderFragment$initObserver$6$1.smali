.class final Lcom/friday/document/view/document/FolderFragment$initObserver$6$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/document/FolderFragment$initObserver$6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.friday.document.view.document.FolderFragment$initObserver$6$1"
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
    iput-object p1, p0, Lcom/friday/document/view/document/FolderFragment$initObserver$6$1;->e:Lcom/friday/document/view/document/FolderFragment;

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
    new-instance v0, Lcom/friday/document/view/document/FolderFragment$initObserver$6$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/document/view/document/FolderFragment$initObserver$6$1;->e:Lcom/friday/document/view/document/FolderFragment;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/friday/document/view/document/FolderFragment$initObserver$6$1;-><init>(Lcom/friday/document/view/document/FolderFragment;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/friday/document/view/document/FolderFragment$initObserver$6$1;->d:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final g(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/document/FolderFragment$initObserver$6$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/friday/document/view/document/FolderFragment$initObserver$6$1;

    .line 6
    .line 7
    sget-object p2, Lqc/q;->a:Lqc/q;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcom/friday/document/view/document/FolderFragment$initObserver$6$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/document/FolderFragment$initObserver$6$1;->g(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/friday/document/view/document/FolderFragment$initObserver$6$1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/friday/document/view/document/FolderFragment$initObserver$6$1;->c:I

    .line 9
    .line 10
    if-nez v1, :cond_2

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/friday/document/view/document/FolderFragment$initObserver$6$1;->e:Lcom/friday/document/view/document/FolderFragment;

    .line 16
    .line 17
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string v1, "beginTransaction(...)"

    .line 26
    .line 27
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object v1, p0, Lcom/friday/document/view/document/FolderFragment$initObserver$6$1;->e:Lcom/friday/document/view/document/FolderFragment;

    .line 31
    .line 32
    invoke-static {v1}, Lcom/friday/document/view/document/FolderFragment;->c0(Lcom/friday/document/view/document/FolderFragment;)Lcom/friday/document/view/document/FileListFragment;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v1}, Lcom/friday/document/view/document/FileListFragment;->x()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-static {v1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-nez v1, :cond_1

    .line 45
    .line 46
    iget-object v1, p0, Lcom/friday/document/view/document/FolderFragment$initObserver$6$1;->e:Lcom/friday/document/view/document/FolderFragment;

    .line 47
    .line 48
    invoke-static {v1}, Lcom/friday/document/view/document/FolderFragment;->d0(Lcom/friday/document/view/document/FolderFragment;)Ljava/util/Stack;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v1}, Ljava/util/Stack;->empty()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_0

    .line 57
    .line 58
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 59
    .line 60
    return-object p1

    .line 61
    :cond_0
    iget-object v1, p0, Lcom/friday/document/view/document/FolderFragment$initObserver$6$1;->e:Lcom/friday/document/view/document/FolderFragment;

    .line 62
    .line 63
    invoke-static {v1}, Lcom/friday/document/view/document/FolderFragment;->d0(Lcom/friday/document/view/document/FolderFragment;)Ljava/util/Stack;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 72
    .line 73
    invoke-virtual {p1, v1}, Landroidx/fragment/app/FragmentTransaction;->remove(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    iget-object v0, p0, Lcom/friday/document/view/document/FolderFragment$initObserver$6$1;->e:Lcom/friday/document/view/document/FolderFragment;

    .line 78
    .line 79
    invoke-static {v0}, Lcom/friday/document/view/document/FolderFragment;->c0(Lcom/friday/document/view/document/FolderFragment;)Lcom/friday/document/view/document/FileListFragment;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {p1, v0}, Landroidx/fragment/app/FragmentTransaction;->show(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 88
    .line 89
    .line 90
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 91
    .line 92
    return-object p1

    .line 93
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 94
    .line 95
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 96
    .line 97
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw p1
.end method
