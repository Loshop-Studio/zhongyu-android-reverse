.class final Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$modifyPwd$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;->g()V
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
    c = "com.zykj.lib.login.ui.teacher.pwd.ChangePwdViewModel$modifyPwd$1"
    f = "ChangePwdViewModel.kt"
    l = {
        0x3e,
        0x3f,
        0x42
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public final synthetic c:Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;Ljava/lang/String;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$modifyPwd$1;->c:Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$modifyPwd$1;->d:Ljava/lang/String;

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
    new-instance p1, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$modifyPwd$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$modifyPwd$1;->c:Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$modifyPwd$1;->d:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$modifyPwd$1;-><init>(Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;Ljava/lang/String;Lm7/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$modifyPwd$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$modifyPwd$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$modifyPwd$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$modifyPwd$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$modifyPwd$1;->b:I

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    if-eqz v1, :cond_3

    .line 12
    .line 13
    if-eq v1, v5, :cond_2

    .line 14
    .line 15
    if-eq v1, v3, :cond_1

    .line 16
    .line 17
    if-ne v1, v2, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$modifyPwd$1;->a:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/lang/Throwable;

    .line 22
    .line 23
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    goto :goto_1

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    goto/16 :goto_5

    .line 29
    .line 30
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 31
    .line 32
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 33
    .line 34
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1

    .line 38
    :cond_1
    :try_start_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :catchall_1
    move-exception p1

    .line 43
    goto :goto_2

    .line 44
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$modifyPwd$1;->c:Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;

    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/zykj/base/BaseViewModel;->isDialogVisible()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-static {v5}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {p1, v1}, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;->setValue(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    :try_start_2
    iget-object p1, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$modifyPwd$1;->c:Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;

    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;->f()Lp3/a;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iget-object v1, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$modifyPwd$1;->d:Ljava/lang/String;

    .line 71
    .line 72
    iput v5, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$modifyPwd$1;->b:I

    .line 73
    .line 74
    invoke-interface {p1, v1, p0}, Lp3/a;->e(Ljava/lang/String;Lm7/c;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    if-ne p1, v0, :cond_4

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_4
    :goto_0
    iget-object p1, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$modifyPwd$1;->c:Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;

    .line 82
    .line 83
    invoke-static {p1}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;->a(Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;)Ll8/g;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-static {v5}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    iput v3, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$modifyPwd$1;->b:I

    .line 92
    .line 93
    invoke-interface {p1, v1, p0}, Ll8/g;->emit(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 97
    if-ne p1, v0, :cond_5

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_5
    :goto_1
    iget-object p1, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$modifyPwd$1;->c:Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;

    .line 101
    .line 102
    invoke-virtual {p1}, Lcom/zykj/base/BaseViewModel;->isDialogVisible()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-static {v4}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {p1, v0}, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;->setValue(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    goto :goto_4

    .line 114
    :goto_2
    :try_start_3
    iget-object v1, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$modifyPwd$1;->c:Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;

    .line 115
    .line 116
    invoke-virtual {v1}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-virtual {v1, p1, v3}, Lcom/zykj/base/BaseViewModel;->handlerThrowable(Ljava/lang/Throwable;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;)V

    .line 121
    .line 122
    .line 123
    iget-object v1, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$modifyPwd$1;->c:Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;

    .line 124
    .line 125
    invoke-static {v1}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;->a(Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;)Ll8/g;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-static {v4}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    invoke-static {p1}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    iput-object p1, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$modifyPwd$1;->a:Ljava/lang/Object;

    .line 138
    .line 139
    iput v2, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$modifyPwd$1;->b:I

    .line 140
    .line 141
    invoke-interface {v1, v3, p0}, Ll8/g;->emit(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 145
    if-ne p1, v0, :cond_5

    .line 146
    .line 147
    :goto_3
    return-object v0

    .line 148
    :goto_4
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 149
    .line 150
    return-object p1

    .line 151
    :goto_5
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$modifyPwd$1;->c:Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;

    .line 152
    .line 153
    invoke-virtual {v0}, Lcom/zykj/base/BaseViewModel;->isDialogVisible()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-static {v4}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    invoke-virtual {v0, v1}, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;->setValue(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    throw p1
.end method
