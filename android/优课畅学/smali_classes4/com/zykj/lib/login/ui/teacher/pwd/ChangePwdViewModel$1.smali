.class final Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;-><init>(Lp3/a;)V
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
    c = "com.zykj.lib.login.ui.teacher.pwd.ChangePwdViewModel$1"
    f = "ChangePwdViewModel.kt"
    l = {
        0x2b
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$1;->b:Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;

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
    new-instance p1, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$1;->b:Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$1;-><init>(Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$1;->a:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$1;->b:Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;->e()Landroidx/lifecycle/MutableLiveData;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {p1}, Landroidx/lifecycle/FlowLiveDataConversions;->asFlow(Landroidx/lifecycle/LiveData;)Ll8/c;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget-object v1, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$1;->b:Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;

    .line 38
    .line 39
    invoke-virtual {v1}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;->d()Landroidx/lifecycle/MutableLiveData;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-static {v1}, Landroidx/lifecycle/FlowLiveDataConversions;->asFlow(Landroidx/lifecycle/LiveData;)Ll8/c;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    new-instance v3, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$1$1;

    .line 48
    .line 49
    const/4 v4, 0x0

    .line 50
    invoke-direct {v3, v4}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$1$1;-><init>(Lm7/c;)V

    .line 51
    .line 52
    .line 53
    invoke-static {p1, v1, v3}, Ll8/e;->k(Ll8/c;Ll8/c;Lx7/q;)Ll8/c;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    new-instance v1, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$1$2;

    .line 58
    .line 59
    iget-object v3, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$1;->b:Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;

    .line 60
    .line 61
    invoke-direct {v1, v3, v4}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$1$2;-><init>(Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;Lm7/c;)V

    .line 62
    .line 63
    .line 64
    iput v2, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$1;->a:I

    .line 65
    .line 66
    invoke-static {p1, v1, p0}, Ll8/e;->i(Ll8/c;Lx7/p;Lm7/c;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-ne p1, v0, :cond_2

    .line 71
    .line 72
    return-object v0

    .line 73
    :cond_2
    :goto_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 74
    .line 75
    return-object p1
.end method
