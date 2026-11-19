.class final Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;->i()V
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
    c = "com.zykj.lib.login.ui.teacher.sms.SendSmsViewModel$sendSms$1"
    f = "SendSmsViewModel.kt"
    l = {
        0x38
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1;->c:Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;

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
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1;->c:Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1;-><init>(Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1;->b:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Li8/b0;

    .line 5
    .line 6
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget v2, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1;->a:I

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    if-ne v2, v3, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1;->c:Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;

    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;->f()Lp3/a;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object v1, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1;->b:Ljava/lang/Object;

    .line 39
    .line 40
    iput v3, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1;->a:I

    .line 41
    .line 42
    invoke-interface {p1, p0}, Lp3/a;->g(Lm7/c;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-ne p1, v0, :cond_2

    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1;->c:Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;

    .line 50
    .line 51
    check-cast p1, Ljava/lang/Boolean;

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-eqz p1, :cond_4

    .line 58
    .line 59
    invoke-virtual {v0}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;->c()Lkotlinx/coroutines/n;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    const/4 v4, 0x0

    .line 64
    if-eqz v2, :cond_3

    .line 65
    .line 66
    invoke-static {v2, v4, v3, v4}, Lkotlinx/coroutines/n$a;->a(Lkotlinx/coroutines/n;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    :cond_3
    move-object v2, v4

    .line 70
    new-instance v4, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1$1$1;

    .line 71
    .line 72
    invoke-direct {v4, v0, v2}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1$1$1;-><init>(Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;Lm7/c;)V

    .line 73
    .line 74
    .line 75
    const/4 v5, 0x3

    .line 76
    const/4 v6, 0x0

    .line 77
    const/4 v2, 0x0

    .line 78
    const/4 v3, 0x0

    .line 79
    invoke-static/range {v1 .. v6}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v0, v1}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;->j(Lkotlinx/coroutines/n;)V

    .line 84
    .line 85
    .line 86
    :cond_4
    invoke-virtual {v0}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;->h()Landroidx/lifecycle/MutableLiveData;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-static {p1}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 98
    .line 99
    return-object p1
.end method
