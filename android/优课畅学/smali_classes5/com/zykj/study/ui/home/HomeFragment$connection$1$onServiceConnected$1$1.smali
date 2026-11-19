.class final Lcom/zykj/study/ui/home/HomeFragment$connection$1$onServiceConnected$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/HomeFragment$connection$1$onServiceConnected$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lx7/p;"
    }
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.study.ui.home.HomeFragment$connection$1$onServiceConnected$1$1"
    f = "HomeFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/study/ui/home/HomeFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/HomeFragment;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/HomeFragment$connection$1$onServiceConnected$1$1;->b:Lcom/zykj/study/ui/home/HomeFragment;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static synthetic c(Lcom/zykj/study/ui/home/HomeFragment;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/home/HomeFragment$connection$1$onServiceConnected$1$1;->d(Lcom/zykj/study/ui/home/HomeFragment;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V

    return-void
.end method

.method public static final d(Lcom/zykj/study/ui/home/HomeFragment;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Li8/i0;->b()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v3, Lcom/zykj/study/ui/home/HomeFragment$connection$1$onServiceConnected$1$1$1$1;

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-direct {v3, p0, p1}, Lcom/zykj/study/ui/home/HomeFragment$connection$1$onServiceConnected$1$1$1$1;-><init>(Lcom/zykj/study/ui/home/HomeFragment;Lm7/c;)V

    .line 13
    .line 14
    .line 15
    const/4 v4, 0x2

    .line 16
    const/4 v5, 0x0

    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-static/range {v0 .. v5}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/zykj/study/ui/home/HomeFragment$connection$1$onServiceConnected$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/ui/home/HomeFragment$connection$1$onServiceConnected$1$1;->b:Lcom/zykj/study/ui/home/HomeFragment;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/zykj/study/ui/home/HomeFragment$connection$1$onServiceConnected$1$1;-><init>(Lcom/zykj/study/ui/home/HomeFragment;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/HomeFragment$connection$1$onServiceConnected$1$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/ui/home/HomeFragment$connection$1$onServiceConnected$1$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/home/HomeFragment$connection$1$onServiceConnected$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/HomeFragment$connection$1$onServiceConnected$1$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/study/ui/home/HomeFragment$connection$1$onServiceConnected$1$1;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    new-instance p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/study/ui/home/HomeFragment$connection$1$onServiceConnected$1$1;->b:Lcom/zykj/study/ui/home/HomeFragment;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-direct {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;-><init>(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    sget v0, Lcom/zykj/study/R$string;->tips_upgrade_new_version:I

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->h(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 v0, 0x0

    .line 29
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->e(Z)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->f(Z)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->b(Z)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    sget v0, Lcom/zykj/study/R$string;->to_update:I

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->z(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iget-object v0, p0, Lcom/zykj/study/ui/home/HomeFragment$connection$1$onServiceConnected$1$1;->b:Lcom/zykj/study/ui/home/HomeFragment;

    .line 48
    .line 49
    new-instance v1, Lcom/zykj/study/ui/home/a;

    .line 50
    .line 51
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/a;-><init>(Lcom/zykj/study/ui/home/HomeFragment;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->w(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$i;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->E()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 59
    .line 60
    .line 61
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 62
    .line 63
    return-object p1

    .line 64
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 65
    .line 66
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 67
    .line 68
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw p1
.end method
