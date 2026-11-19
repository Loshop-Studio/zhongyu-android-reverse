.class final Lcom/zykj/study/ui/home/HomeFragment$connection$1$onServiceConnected$1$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/HomeFragment$connection$1$onServiceConnected$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.zykj.study.ui.home.HomeFragment$connection$1$onServiceConnected$1$1$1$1"
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
    iput-object p1, p0, Lcom/zykj/study/ui/home/HomeFragment$connection$1$onServiceConnected$1$1$1$1;->b:Lcom/zykj/study/ui/home/HomeFragment;

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


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/zykj/study/ui/home/HomeFragment$connection$1$onServiceConnected$1$1$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/ui/home/HomeFragment$connection$1$onServiceConnected$1$1$1$1;->b:Lcom/zykj/study/ui/home/HomeFragment;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/zykj/study/ui/home/HomeFragment$connection$1$onServiceConnected$1$1$1$1;-><init>(Lcom/zykj/study/ui/home/HomeFragment;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/HomeFragment$connection$1$onServiceConnected$1$1$1$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/ui/home/HomeFragment$connection$1$onServiceConnected$1$1$1$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/home/HomeFragment$connection$1$onServiceConnected$1$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/HomeFragment$connection$1$onServiceConnected$1$1$1$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/study/ui/home/HomeFragment$connection$1$onServiceConnected$1$1$1$1;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_2

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/study/ui/home/HomeFragment$connection$1$onServiceConnected$1$1$1$1;->b:Lcom/zykj/study/ui/home/HomeFragment;

    .line 12
    .line 13
    invoke-static {p1}, Lcom/zykj/study/ui/home/HomeFragment;->j(Lcom/zykj/study/ui/home/HomeFragment;)Lj1/a;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-interface {p1}, Lj1/a;->e()V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object p1, p0, Lcom/zykj/study/ui/home/HomeFragment$connection$1$onServiceConnected$1$1$1$1;->b:Lcom/zykj/study/ui/home/HomeFragment;

    .line 23
    .line 24
    invoke-static {p1}, Lcom/zykj/study/ui/home/HomeFragment;->j(Lcom/zykj/study/ui/home/HomeFragment;)Lj1/a;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    iget-object v0, p0, Lcom/zykj/study/ui/home/HomeFragment$connection$1$onServiceConnected$1$1$1$1;->b:Lcom/zykj/study/ui/home/HomeFragment;

    .line 31
    .line 32
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {p1, v0}, Lj1/a;->f(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 44
    .line 45
    return-object p1

    .line 46
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1
.end method
