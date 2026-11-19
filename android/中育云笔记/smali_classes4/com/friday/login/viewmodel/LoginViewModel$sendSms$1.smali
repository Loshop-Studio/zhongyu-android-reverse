.class final Lcom/friday/login/viewmodel/LoginViewModel$sendSms$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/login/viewmodel/LoginViewModel;->o()V
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
    c = "com.friday.login.viewmodel.LoginViewModel$sendSms$1"
    f = "LoginViewModel.kt"
    l = {
        0x88
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:I

.field public f:I

.field public final synthetic g:Lcom/friday/login/viewmodel/LoginViewModel;


# direct methods
.method public constructor <init>(Lcom/friday/login/viewmodel/LoginViewModel;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/login/viewmodel/LoginViewModel$sendSms$1;->g:Lcom/friday/login/viewmodel/LoginViewModel;

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
    .locals 1

    .line 1
    new-instance p1, Lcom/friday/login/viewmodel/LoginViewModel$sendSms$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/login/viewmodel/LoginViewModel$sendSms$1;->g:Lcom/friday/login/viewmodel/LoginViewModel;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/login/viewmodel/LoginViewModel$sendSms$1;-><init>(Lcom/friday/login/viewmodel/LoginViewModel;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/login/viewmodel/LoginViewModel$sendSms$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/login/viewmodel/LoginViewModel$sendSms$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/login/viewmodel/LoginViewModel$sendSms$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/login/viewmodel/LoginViewModel$sendSms$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/login/viewmodel/LoginViewModel$sendSms$1;->f:I

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
    iget-object v0, p0, Lcom/friday/login/viewmodel/LoginViewModel$sendSms$1;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lcom/friday/common/entity/SendSmsBean;

    .line 16
    .line 17
    iget-object v0, p0, Lcom/friday/login/viewmodel/LoginViewModel$sendSms$1;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lcom/friday/login/viewmodel/LoginViewModel;

    .line 20
    .line 21
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catch_0
    move-exception v0

    .line 26
    move-object p1, v0

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 31
    .line 32
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p1

    .line 36
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    :try_start_1
    iget-object p1, p0, Lcom/friday/login/viewmodel/LoginViewModel$sendSms$1;->g:Lcom/friday/login/viewmodel/LoginViewModel;

    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/friday/login/viewmodel/LoginViewModel;->l()Landroidx/lifecycle/MutableLiveData;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Lcom/friday/common/entity/SendSmsBean;

    .line 50
    .line 51
    if-eqz p1, :cond_5

    .line 52
    .line 53
    iget-object v1, p0, Lcom/friday/login/viewmodel/LoginViewModel$sendSms$1;->g:Lcom/friday/login/viewmodel/LoginViewModel;

    .line 54
    .line 55
    invoke-static {v1}, Lcom/friday/login/viewmodel/LoginViewModel;->f(Lcom/friday/login/viewmodel/LoginViewModel;)Ld2/i;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    new-instance v5, Lcom/friday/common/entity/SendSmsBean;

    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/friday/common/entity/SendSmsBean;->getSchoolCode()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    invoke-virtual {p1}, Lcom/friday/common/entity/SendSmsBean;->getUserId()J

    .line 66
    .line 67
    .line 68
    move-result-wide v7

    .line 69
    const-string v9, ""

    .line 70
    .line 71
    invoke-virtual {p1}, Lcom/friday/common/entity/SendSmsBean;->getSn()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v10

    .line 75
    invoke-direct/range {v5 .. v10}, Lcom/friday/common/entity/SendSmsBean;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iput-object v1, p0, Lcom/friday/login/viewmodel/LoginViewModel$sendSms$1;->c:Ljava/lang/Object;

    .line 79
    .line 80
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    iput-object p1, p0, Lcom/friday/login/viewmodel/LoginViewModel$sendSms$1;->d:Ljava/lang/Object;

    .line 85
    .line 86
    iput v2, p0, Lcom/friday/login/viewmodel/LoginViewModel$sendSms$1;->e:I

    .line 87
    .line 88
    iput v3, p0, Lcom/friday/login/viewmodel/LoginViewModel$sendSms$1;->f:I

    .line 89
    .line 90
    invoke-interface {v4, v5, p0}, Ld2/i;->d(Lcom/friday/common/entity/SendSmsBean;Lvc/c;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    if-ne p1, v0, :cond_2

    .line 95
    .line 96
    return-object v0

    .line 97
    :cond_2
    move-object v0, v1

    .line 98
    :goto_0
    check-cast p1, Lcom/zykj/http/bean/ApiResp;

    .line 99
    .line 100
    invoke-virtual {v0}, Lcom/friday/login/viewmodel/LoginViewModel;->k()Landroidx/lifecycle/MutableLiveData;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {p1}, Lcom/zykj/http/bean/ApiResp;->getSuccess()Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    invoke-static {v1}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1}, Lcom/zykj/http/bean/ApiResp;->getSuccess()Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-nez v0, :cond_5

    .line 120
    .line 121
    invoke-virtual {p1}, Lcom/zykj/http/bean/ApiResp;->getError()Lcom/zykj/http/bean/ErrorInfo;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    if-eqz p1, :cond_3

    .line 126
    .line 127
    invoke-virtual {p1}, Lcom/zykj/http/bean/ErrorInfo;->getMessage()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    if-nez p1, :cond_4

    .line 132
    .line 133
    :cond_3
    const-string p1, ""

    .line 134
    .line 135
    :cond_4
    invoke-static {p1}, Lz1/b;->i(Ljava/lang/CharSequence;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 136
    .line 137
    .line 138
    goto :goto_2

    .line 139
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 140
    .line 141
    .line 142
    iget-object p1, p0, Lcom/friday/login/viewmodel/LoginViewModel$sendSms$1;->g:Lcom/friday/login/viewmodel/LoginViewModel;

    .line 143
    .line 144
    invoke-virtual {p1}, Lcom/friday/login/viewmodel/LoginViewModel;->k()Landroidx/lifecycle/MutableLiveData;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    invoke-static {v2}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    :cond_5
    :goto_2
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 156
    .line 157
    return-object p1
.end method
