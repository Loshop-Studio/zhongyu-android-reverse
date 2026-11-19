# RE note 本类字节码直接引用的读写或显示接口包括JSON。
.class final Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.friday.login.viewmodel.LoginViewModel$ezyLogin$1$1"
    f = "LoginViewModel.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lcom/friday/login/viewmodel/LoginViewModel;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/friday/login/viewmodel/LoginViewModel;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1$1;->d:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1$1;->e:Lcom/friday/login/viewmodel/LoginViewModel;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2

    .line 1
    new-instance p1, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1$1;->d:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1$1;->e:Lcom/friday/login/viewmodel/LoginViewModel;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1$1;-><init>(Ljava/lang/String;Lcom/friday/login/viewmodel/LoginViewModel;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

# RE I/O 读取 JSON（Gson.fromJson）。
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1$1;->c:I

    .line 5
    .line 6
    if-nez v0, :cond_2

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    new-instance p1, Lje/v$a;

    .line 12
    .line 13
    invoke-direct {p1}, Lje/v$a;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lje/v$a;->c()Lje/v;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    new-instance v0, Lje/w$a;

    .line 21
    .line 22
    invoke-direct {v0}, Lje/w$a;-><init>()V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1$1;->d:Ljava/lang/String;

    .line 26
    .line 27
    new-instance v2, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    const-string v3, "https://hagateway.zykj.org/api/discovery/"

    .line 33
    .line 34
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v0, v1}, Lje/w$a;->p(Ljava/lang/String;)Lje/w$a;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Lje/w$a;->b()Lje/w;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {p1, v0}, Lje/v;->b(Lje/w;)Lje/e;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-interface {p1}, Lje/e;->execute()Lje/y;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p1}, Lje/y;->e()Lje/z;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    const/4 v0, 0x0

    .line 65
    if-eqz p1, :cond_1

    .line 66
    .line 67
    invoke-virtual {p1}, Lje/z;->string()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    if-eqz p1, :cond_1

    .line 72
    .line 73
    iget-object v1, p0, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1$1;->e:Lcom/friday/login/viewmodel/LoginViewModel;

    .line 74
    .line 75
    :try_start_0
    new-instance v2, Lcom/google/gson/Gson;

    .line 76
    .line 77
    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    .line 78
    .line 79
    .line 80
    const-class v3, Lcom/friday/login/service/GatewayBean;

    .line 81
    .line 82
    invoke-virtual {v2, p1, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    check-cast p1, Lcom/friday/login/service/GatewayBean;

    .line 87
    .line 88
    sget-object v2, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 89
    .line 90
    invoke-virtual {v2}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-virtual {p1}, Lcom/friday/login/service/GatewayBean;->getServer()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {v2, p1}, Lcom/friday/common/helper/b;->F(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-static {v1}, Lcom/friday/login/viewmodel/LoginViewModel;->e(Lcom/friday/login/viewmodel/LoginViewModel;)Lvd/l;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    :cond_0
    invoke-interface {p1}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    move-object v2, v1

    .line 110
    check-cast v2, Lcom/zykj/http/bean/HeaderBean;

    .line 111
    .line 112
    sget-object v3, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 113
    .line 114
    invoke-virtual {v3}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    invoke-virtual {v4}, Lcom/friday/common/helper/b;->r()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    invoke-virtual {v3}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-virtual {v3}, Lcom/friday/common/helper/b;->s()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    const/16 v8, 0x13

    .line 131
    .line 132
    const/4 v9, 0x0

    .line 133
    const/4 v3, 0x0

    .line 134
    const/4 v4, 0x0

    .line 135
    const/4 v7, 0x0

    .line 136
    invoke-static/range {v2 .. v9}, Lcom/zykj/http/bean/HeaderBean;->copy$default(Lcom/zykj/http/bean/HeaderBean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/zykj/http/bean/HeaderBean;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    invoke-interface {p1, v1, v2}, Lvd/l;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v1
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 144
    if-eqz v1, :cond_0

    .line 145
    .line 146
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 147
    .line 148
    return-object p1

    .line 149
    :catch_0
    new-instance p1, Lcom/friday/common/util/SyncException;

    .line 150
    .line 151
    const/4 v1, 0x3

    .line 152
    invoke-direct {p1, v0, v0, v1, v0}, Lcom/friday/common/util/SyncException;-><init>(Lcom/friday/common/util/SyncException$Kind;Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 153
    .line 154
    .line 155
    throw p1

    .line 156
    :cond_1
    return-object v0

    .line 157
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 158
    .line 159
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 160
    .line 161
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    throw p1
.end method
