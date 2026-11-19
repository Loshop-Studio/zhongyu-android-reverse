.class final Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel$sendEffect$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;->i(Lcom/zykj/lib/login/ui/teacher/pwd/b;)V
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
    c = "com.zykj.lib.login.ui.teacher.pwd.ChangePsdViewModel$sendEffect$1"
    f = "ChangePsdViewModel.kt"
    l = {
        0x86
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;

.field public final synthetic c:Lcom/zykj/lib/login/ui/teacher/pwd/b;


# direct methods
.method public constructor <init>(Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;Lcom/zykj/lib/login/ui/teacher/pwd/b;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel$sendEffect$1;->b:Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel$sendEffect$1;->c:Lcom/zykj/lib/login/ui/teacher/pwd/b;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 2

    .line 1
    new-instance p1, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel$sendEffect$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel$sendEffect$1;->b:Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel$sendEffect$1;->c:Lcom/zykj/lib/login/ui/teacher/pwd/b;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel$sendEffect$1;-><init>(Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;Lcom/zykj/lib/login/ui/teacher/pwd/b;Lm7/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel$sendEffect$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel$sendEffect$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel$sendEffect$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel$sendEffect$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel$sendEffect$1;->a:I

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
    iget-object p1, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel$sendEffect$1;->b:Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;->b(Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;)Ll8/g;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-object v1, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel$sendEffect$1;->c:Lcom/zykj/lib/login/ui/teacher/pwd/b;

    .line 34
    .line 35
    iput v2, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel$sendEffect$1;->a:I

    .line 36
    .line 37
    invoke-interface {p1, v1, p0}, Ll8/g;->emit(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-ne p1, v0, :cond_2

    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_2
    :goto_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 45
    .line 46
    return-object p1
.end method
