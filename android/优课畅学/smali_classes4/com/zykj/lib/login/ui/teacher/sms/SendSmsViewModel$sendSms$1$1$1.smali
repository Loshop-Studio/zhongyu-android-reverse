.class final Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.zykj.lib.login.ui.teacher.sms.SendSmsViewModel$sendSms$1$1$1"
    f = "SendSmsViewModel.kt"
    l = {
        0x3f
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public final synthetic i:Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1$1$1;->i:Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;

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
    new-instance p1, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1$1$1;->i:Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1$1$1;-><init>(Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1$1$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1$1$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1$1$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1$1$1;->h:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-ne v1, v3, :cond_0

    .line 12
    .line 13
    iget v1, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1$1$1;->e:I

    .line 14
    .line 15
    iget-object v4, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1$1$1;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v4, Ljava/util/Iterator;

    .line 18
    .line 19
    iget-object v5, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1$1$1;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v5, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;

    .line 22
    .line 23
    iget-object v6, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1$1$1;->a:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v6, Ljava/lang/Iterable;

    .line 26
    .line 27
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 34
    .line 35
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p1

    .line 39
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    const/16 p1, 0x3c

    .line 43
    .line 44
    invoke-static {p1, v3}, Ld8/h;->q(II)Ld8/d;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iget-object v1, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1$1$1;->i:Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;

    .line 49
    .line 50
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    move-object v6, p1

    .line 55
    move-object v5, v1

    .line 56
    move v1, v2

    .line 57
    :cond_2
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_3

    .line 62
    .line 63
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    move-object v7, p1

    .line 68
    check-cast v7, Ljava/lang/Number;

    .line 69
    .line 70
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    invoke-virtual {v5}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;->b()Landroidx/lifecycle/MutableLiveData;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    invoke-static {v7}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    invoke-virtual {v8, v9}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    invoke-static {v6}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v8

    .line 89
    iput-object v8, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1$1$1;->a:Ljava/lang/Object;

    .line 90
    .line 91
    iput-object v5, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1$1$1;->b:Ljava/lang/Object;

    .line 92
    .line 93
    iput-object v4, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1$1$1;->c:Ljava/lang/Object;

    .line 94
    .line 95
    invoke-static {p1}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    iput-object p1, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1$1$1;->d:Ljava/lang/Object;

    .line 100
    .line 101
    iput v1, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1$1$1;->e:I

    .line 102
    .line 103
    iput v7, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1$1$1;->f:I

    .line 104
    .line 105
    iput v2, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1$1$1;->g:I

    .line 106
    .line 107
    iput v3, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1$1$1;->h:I

    .line 108
    .line 109
    const-wide/16 v7, 0x3e8

    .line 110
    .line 111
    invoke-static {v7, v8, p0}, Lkotlinx/coroutines/DelayKt;->b(JLm7/c;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    if-ne p1, v0, :cond_2

    .line 116
    .line 117
    return-object v0

    .line 118
    :cond_3
    iget-object p1, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1$1$1;->i:Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;

    .line 119
    .line 120
    invoke-virtual {p1}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;->h()Landroidx/lifecycle/MutableLiveData;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-static {v2}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 132
    .line 133
    return-object p1
.end method
