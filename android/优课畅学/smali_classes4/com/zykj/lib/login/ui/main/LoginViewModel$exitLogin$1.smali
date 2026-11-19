# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class final Lcom/zykj/lib/login/ui/main/LoginViewModel$exitLogin$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/lib/login/ui/main/LoginViewModel;->a()V
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
    c = "com.zykj.lib.login.ui.main.LoginViewModel$exitLogin$1"
    f = "LoginViewModel.kt"
    l = {
        0x24,
        0x2c
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/lib/login/ui/main/LoginViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/lib/login/ui/main/LoginViewModel;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/lib/login/ui/main/LoginViewModel$exitLogin$1;->b:Lcom/zykj/lib/login/ui/main/LoginViewModel;

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
    new-instance p1, Lcom/zykj/lib/login/ui/main/LoginViewModel$exitLogin$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/lib/login/ui/main/LoginViewModel$exitLogin$1;->b:Lcom/zykj/lib/login/ui/main/LoginViewModel;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/zykj/lib/login/ui/main/LoginViewModel$exitLogin$1;-><init>(Lcom/zykj/lib/login/ui/main/LoginViewModel;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/lib/login/ui/main/LoginViewModel$exitLogin$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/lib/login/ui/main/LoginViewModel$exitLogin$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/lib/login/ui/main/LoginViewModel$exitLogin$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/lib/login/ui/main/LoginViewModel$exitLogin$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/zykj/lib/login/ui/main/LoginViewModel$exitLogin$1;->a:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    if-eq v1, v4, :cond_1

    .line 13
    .line 14
    if-ne v1, v3, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_2

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
    goto :goto_0

    .line 32
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lcom/zykj/lib/login/ui/main/LoginViewModel$exitLogin$1;->b:Lcom/zykj/lib/login/ui/main/LoginViewModel;

    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/zykj/lib/login/ui/main/LoginViewModel;->b()Landroidx/datastore/core/DataStore;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    new-instance v1, Lcom/zykj/lib/login/ui/main/LoginViewModel$exitLogin$1$1;

    .line 42
    .line 43
    invoke-direct {v1, v2}, Lcom/zykj/lib/login/ui/main/LoginViewModel$exitLogin$1$1;-><init>(Lm7/c;)V

    .line 44
    .line 45
    .line 46
    iput v4, p0, Lcom/zykj/lib/login/ui/main/LoginViewModel$exitLogin$1;->a:I

    .line 47
    .line 48
    invoke-interface {p1, v1, p0}, Landroidx/datastore/core/DataStore;->updateData(Lx7/p;Lm7/c;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-ne p1, v0, :cond_3

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/zykj/lib/login/ui/main/LoginViewModel$exitLogin$1;->b:Lcom/zykj/lib/login/ui/main/LoginViewModel;

    .line 56
    .line 57
    invoke-virtual {p1}, Lcom/zykj/lib/login/ui/main/LoginViewModel;->c()Landroidx/datastore/core/DataStore;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    new-instance v1, Lcom/zykj/lib/login/ui/main/LoginViewModel$exitLogin$1$2;

    .line 62
    .line 63
    invoke-direct {v1, v2}, Lcom/zykj/lib/login/ui/main/LoginViewModel$exitLogin$1$2;-><init>(Lm7/c;)V

    .line 64
    .line 65
    .line 66
    iput v3, p0, Lcom/zykj/lib/login/ui/main/LoginViewModel$exitLogin$1;->a:I

    .line 67
    .line 68
    invoke-interface {p1, v1, p0}, Landroidx/datastore/core/DataStore;->updateData(Lx7/p;Lm7/c;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    if-ne p1, v0, :cond_4

    .line 73
    .line 74
    :goto_1
    return-object v0

    .line 75
    :cond_4
    :goto_2
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 76
    .line 77
    return-object p1
.end method
