.class final Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel$performSubmit$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;->h()V
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
    c = "com.zykj.lib.login.ui.teacher.pwd.ChangePsdViewModel$performSubmit$1"
    f = "ChangePsdViewModel.kt"
    l = {
        0x7b
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;

.field public final synthetic c:Lq3/n;


# direct methods
.method public constructor <init>(Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;Lq3/n;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel$performSubmit$1;->b:Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel$performSubmit$1;->c:Lq3/n;

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
    new-instance p1, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel$performSubmit$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel$performSubmit$1;->b:Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel$performSubmit$1;->c:Lq3/n;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel$performSubmit$1;-><init>(Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;Lq3/n;Lm7/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel$performSubmit$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel$performSubmit$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel$performSubmit$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel$performSubmit$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v2, v1, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel$performSubmit$1;->a:I

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    if-ne v2, v3, :cond_0

    .line 13
    .line 14
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catch_0
    move-exception v0

    .line 19
    move-object v4, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw v0

    .line 29
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object v2, v1, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel$performSubmit$1;->b:Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;

    .line 33
    .line 34
    invoke-static {v2}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;->c(Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;)Ll8/h;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    :cond_2
    invoke-interface {v2}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    move-object v5, v4

    .line 43
    check-cast v5, Lq3/n;

    .line 44
    .line 45
    const/16 v15, 0x1fb

    .line 46
    .line 47
    const/16 v16, 0x0

    .line 48
    .line 49
    const/4 v6, 0x0

    .line 50
    const/4 v7, 0x0

    .line 51
    const/4 v8, 0x1

    .line 52
    const/4 v9, 0x0

    .line 53
    const/4 v10, 0x0

    .line 54
    const/4 v11, 0x0

    .line 55
    const/4 v12, 0x0

    .line 56
    const/4 v13, 0x0

    .line 57
    const/4 v14, 0x0

    .line 58
    invoke-static/range {v5 .. v16}, Lq3/n;->b(Lq3/n;Ljava/lang/String;Ljava/lang/String;ZZLcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;ZLjava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)Lq3/n;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    invoke-interface {v2, v4, v5}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-eqz v4, :cond_2

    .line 67
    .line 68
    :try_start_1
    iget-object v2, v1, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel$performSubmit$1;->b:Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;

    .line 69
    .line 70
    invoke-static {v2}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;->a(Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;)Lp3/a;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    iget-object v4, v1, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel$performSubmit$1;->c:Lq3/n;

    .line 75
    .line 76
    invoke-virtual {v4}, Lq3/n;->f()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    iput v3, v1, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel$performSubmit$1;->a:I

    .line 81
    .line 82
    invoke-interface {v2, v4, v1}, Lp3/a;->e(Ljava/lang/String;Lm7/c;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    if-ne v2, v0, :cond_3

    .line 87
    .line 88
    return-object v0

    .line 89
    :cond_3
    :goto_0
    iget-object v0, v1, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel$performSubmit$1;->b:Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;

    .line 90
    .line 91
    invoke-static {v0}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;->c(Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;)Ll8/h;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    :cond_4
    invoke-interface {v0}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    move-object v3, v2

    .line 100
    check-cast v3, Lq3/n;

    .line 101
    .line 102
    const/16 v13, 0x1fb

    .line 103
    .line 104
    const/4 v14, 0x0

    .line 105
    const/4 v4, 0x0

    .line 106
    const/4 v5, 0x0

    .line 107
    const/4 v6, 0x0

    .line 108
    const/4 v7, 0x0

    .line 109
    const/4 v8, 0x0

    .line 110
    const/4 v9, 0x0

    .line 111
    const/4 v10, 0x0

    .line 112
    const/4 v11, 0x0

    .line 113
    const/4 v12, 0x0

    .line 114
    invoke-static/range {v3 .. v14}, Lq3/n;->b(Lq3/n;Ljava/lang/String;Ljava/lang/String;ZZLcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;ZLjava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)Lq3/n;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    invoke-interface {v0, v2, v3}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    if-eqz v2, :cond_4

    .line 123
    .line 124
    iget-object v0, v1, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel$performSubmit$1;->b:Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;

    .line 125
    .line 126
    sget-object v2, Lcom/zykj/lib/login/ui/teacher/pwd/b$b;->a:Lcom/zykj/lib/login/ui/teacher/pwd/b$b;

    .line 127
    .line 128
    invoke-static {v0, v2}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;->d(Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;Lcom/zykj/lib/login/ui/teacher/pwd/b;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 129
    .line 130
    .line 131
    goto :goto_2

    .line 132
    :goto_1
    iget-object v0, v1, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel$performSubmit$1;->b:Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;

    .line 133
    .line 134
    invoke-static {v0}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;->c(Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;)Ll8/h;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    :cond_5
    invoke-interface {v5}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    move-object v6, v0

    .line 143
    check-cast v6, Lq3/n;

    .line 144
    .line 145
    const/16 v16, 0x1fb

    .line 146
    .line 147
    const/16 v17, 0x0

    .line 148
    .line 149
    const/4 v7, 0x0

    .line 150
    const/4 v8, 0x0

    .line 151
    const/4 v9, 0x0

    .line 152
    const/4 v10, 0x0

    .line 153
    const/4 v11, 0x0

    .line 154
    const/4 v12, 0x0

    .line 155
    const/4 v13, 0x0

    .line 156
    const/4 v14, 0x0

    .line 157
    const/4 v15, 0x0

    .line 158
    invoke-static/range {v6 .. v17}, Lq3/n;->b(Lq3/n;Ljava/lang/String;Ljava/lang/String;ZZLcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;ZLjava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)Lq3/n;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    invoke-interface {v5, v0, v2}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-eqz v0, :cond_5

    .line 167
    .line 168
    iget-object v0, v1, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel$performSubmit$1;->b:Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;

    .line 169
    .line 170
    new-instance v2, Lcom/zykj/lib/login/ui/teacher/pwd/b$a;

    .line 171
    .line 172
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    if-nez v3, :cond_6

    .line 177
    .line 178
    const-string v3, "\u672a\u77e5\u9519\u8bef"

    .line 179
    .line 180
    :cond_6
    invoke-direct {v2, v3}, Lcom/zykj/lib/login/ui/teacher/pwd/b$a;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    invoke-static {v0, v2}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;->d(Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;Lcom/zykj/lib/login/ui/teacher/pwd/b;)V

    .line 184
    .line 185
    .line 186
    :goto_2
    sget-object v0, Lh7/p;->a:Lh7/p;

    .line 187
    .line 188
    return-object v0
.end method
