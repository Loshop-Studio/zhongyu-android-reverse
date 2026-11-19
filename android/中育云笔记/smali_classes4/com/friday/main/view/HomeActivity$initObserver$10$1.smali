.class final Lcom/friday/main/view/HomeActivity$initObserver$10$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/main/view/HomeActivity$initObserver$10;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.friday.main.view.HomeActivity$initObserver$10$1"
    f = "HomeActivity.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public synthetic d:Z

.field public final synthetic e:Lcom/friday/main/view/HomeActivity;


# direct methods
.method public constructor <init>(Lcom/friday/main/view/HomeActivity;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/main/view/HomeActivity$initObserver$10$1;->e:Lcom/friday/main/view/HomeActivity;

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

.method public static synthetic g(Lcom/friday/main/view/HomeActivity;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/main/view/HomeActivity$initObserver$10$1;->m(Lcom/friday/main/view/HomeActivity;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final m(Lcom/friday/main/view/HomeActivity;)Lqc/q;
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v3, Lcom/friday/main/view/HomeActivity$initObserver$10$1$1$1;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {v3, p0, v2}, Lcom/friday/main/view/HomeActivity$initObserver$10$1$1$1;-><init>(Lcom/friday/main/view/HomeActivity;Lvc/c;)V

    .line 13
    .line 14
    .line 15
    const/4 v4, 0x2

    .line 16
    const/4 v5, 0x0

    .line 17
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 18
    .line 19
    .line 20
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 21
    .line 22
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2

    .line 1
    new-instance v0, Lcom/friday/main/view/HomeActivity$initObserver$10$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/main/view/HomeActivity$initObserver$10$1;->e:Lcom/friday/main/view/HomeActivity;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/friday/main/view/HomeActivity$initObserver$10$1;-><init>(Lcom/friday/main/view/HomeActivity;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput-boolean p1, v0, Lcom/friday/main/view/HomeActivity$initObserver$10$1;->d:Z

    .line 15
    .line 16
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/main/view/HomeActivity$initObserver$10$1;->invoke(ZLvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(ZLvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/friday/main/view/HomeActivity$initObserver$10$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/main/view/HomeActivity$initObserver$10$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/main/view/HomeActivity$initObserver$10$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/friday/main/view/HomeActivity$initObserver$10$1;->d:Z

    .line 2
    .line 3
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lcom/friday/main/view/HomeActivity$initObserver$10$1;->c:I

    .line 7
    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, Lcom/friday/main/view/HomeActivity$initObserver$10$1;->e:Lcom/friday/main/view/HomeActivity;

    .line 16
    .line 17
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-class v0, Lcom/friday/main/view/HuiweiAppUpdateDialog;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {p1, v1}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-nez p1, :cond_0

    .line 32
    .line 33
    new-instance p1, Lcom/friday/main/view/HuiweiAppUpdateDialog;

    .line 34
    .line 35
    invoke-direct {p1}, Lcom/friday/main/view/HuiweiAppUpdateDialog;-><init>()V

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lcom/friday/main/view/HomeActivity$initObserver$10$1;->e:Lcom/friday/main/view/HomeActivity;

    .line 39
    .line 40
    new-instance v2, Lcom/friday/main/view/a;

    .line 41
    .line 42
    invoke-direct {v2, v1}, Lcom/friday/main/view/a;-><init>(Lcom/friday/main/view/HomeActivity;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v2}, Lcom/friday/main/view/HuiweiAppUpdateDialog;->v(Lhd/a;)V

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lcom/friday/main/view/HomeActivity$initObserver$10$1;->e:Lcom/friday/main/view/HomeActivity;

    .line 49
    .line 50
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    const-string v2, "getSupportFragmentManager(...)"

    .line 55
    .line 56
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {p1, v1, v0}, Lcom/friday/common/base/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 67
    .line 68
    return-object p1

    .line 69
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 70
    .line 71
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 72
    .line 73
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw p1
.end method
