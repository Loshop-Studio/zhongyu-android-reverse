.class public final Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;
.super Lcom/zykj/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final a:Lp3/a;

.field public final b:Landroidx/lifecycle/SavedStateHandle;

.field public final c:I

.field public final d:Ll8/h;

.field public final e:Ll8/q;

.field public final f:Ll8/g;

.field public final g:Ll8/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lp3/a;Landroidx/lifecycle/SavedStateHandle;)V
    .locals 12

    .line 1
    const-string v0, "repository"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "savedStateHandle"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/zykj/base/BaseViewModel;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;->a:Lp3/a;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;->b:Landroidx/lifecycle/SavedStateHandle;

    .line 17
    .line 18
    const-string p1, "arg_pwd_level"

    .line 19
    .line 20
    invoke-virtual {p2, p1}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Ljava/lang/Integer;

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 p1, 0x1

    .line 34
    :goto_0
    iput p1, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;->c:I

    .line 35
    .line 36
    new-instance v0, Lq3/n;

    .line 37
    .line 38
    sget-object p2, Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;->e:Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel$a;

    .line 39
    .line 40
    invoke-virtual {p2, p1}, Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel$a;->a(I)Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    const/16 v10, 0x1ef

    .line 45
    .line 46
    const/4 v11, 0x0

    .line 47
    const/4 v1, 0x0

    .line 48
    const/4 v2, 0x0

    .line 49
    const/4 v3, 0x0

    .line 50
    const/4 v4, 0x0

    .line 51
    const/4 v6, 0x0

    .line 52
    const/4 v7, 0x0

    .line 53
    const/4 v8, 0x0

    .line 54
    const/4 v9, 0x0

    .line 55
    invoke-direct/range {v0 .. v11}, Lq3/n;-><init>(Ljava/lang/String;Ljava/lang/String;ZZLcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;ZLjava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 56
    .line 57
    .line 58
    invoke-static {v0}, Ll8/r;->a(Ljava/lang/Object;)Ll8/h;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iput-object p1, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;->d:Ll8/h;

    .line 63
    .line 64
    invoke-static {p1}, Ll8/e;->b(Ll8/h;)Ll8/q;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iput-object p1, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;->e:Ll8/q;

    .line 69
    .line 70
    const/4 p1, 0x7

    .line 71
    const/4 p2, 0x0

    .line 72
    const/4 v0, 0x0

    .line 73
    invoke-static {p2, p2, v0, p1, v0}, Ll8/m;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Ll8/g;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iput-object p1, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;->f:Ll8/g;

    .line 78
    .line 79
    invoke-static {p1}, Ll8/e;->a(Ll8/g;)Ll8/l;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iput-object p1, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;->g:Ll8/l;

    .line 84
    .line 85
    return-void
.end method

.method public static final synthetic a(Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;)Lp3/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;->a:Lp3/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic b(Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;)Ll8/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;->f:Ll8/g;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic c(Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;)Ll8/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;->d:Ll8/h;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic d(Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;Lcom/zykj/lib/login/ui/teacher/pwd/b;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;->i(Lcom/zykj/lib/login/ui/teacher/pwd/b;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final e()Ll8/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;->g:Ll8/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()Ll8/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;->e:Ll8/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g(Lcom/zykj/lib/login/ui/teacher/pwd/c;)V
    .locals 14

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Lcom/zykj/lib/login/ui/teacher/pwd/c$b;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;->d:Ll8/h;

    .line 11
    .line 12
    :cond_0
    invoke-interface {v0}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    move-object v2, v1

    .line 17
    check-cast v2, Lq3/n;

    .line 18
    .line 19
    move-object v3, p1

    .line 20
    check-cast v3, Lcom/zykj/lib/login/ui/teacher/pwd/c$b;

    .line 21
    .line 22
    invoke-virtual {v3}, Lcom/zykj/lib/login/ui/teacher/pwd/c$b;->a()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    const/16 v12, 0x1fe

    .line 27
    .line 28
    const/4 v13, 0x0

    .line 29
    const/4 v4, 0x0

    .line 30
    const/4 v5, 0x0

    .line 31
    const/4 v6, 0x0

    .line 32
    const/4 v7, 0x0

    .line 33
    const/4 v8, 0x0

    .line 34
    const/4 v9, 0x0

    .line 35
    const/4 v10, 0x0

    .line 36
    const/4 v11, 0x0

    .line 37
    invoke-static/range {v2 .. v13}, Lq3/n;->b(Lq3/n;Ljava/lang/String;Ljava/lang/String;ZZLcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;ZLjava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)Lq3/n;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-interface {v0, v1, v2}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;->j()V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_1
    instance-of v0, p1, Lcom/zykj/lib/login/ui/teacher/pwd/c$a;

    .line 52
    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;->d:Ll8/h;

    .line 56
    .line 57
    :cond_2
    invoke-interface {v0}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    move-object v2, v1

    .line 62
    check-cast v2, Lq3/n;

    .line 63
    .line 64
    move-object v3, p1

    .line 65
    check-cast v3, Lcom/zykj/lib/login/ui/teacher/pwd/c$a;

    .line 66
    .line 67
    invoke-virtual {v3}, Lcom/zykj/lib/login/ui/teacher/pwd/c$a;->a()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    const/16 v12, 0x1fd

    .line 72
    .line 73
    const/4 v13, 0x0

    .line 74
    const/4 v3, 0x0

    .line 75
    const/4 v5, 0x0

    .line 76
    const/4 v6, 0x0

    .line 77
    const/4 v7, 0x0

    .line 78
    const/4 v8, 0x0

    .line 79
    const/4 v9, 0x0

    .line 80
    const/4 v10, 0x0

    .line 81
    const/4 v11, 0x0

    .line 82
    invoke-static/range {v2 .. v13}, Lq3/n;->b(Lq3/n;Ljava/lang/String;Ljava/lang/String;ZZLcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;ZLjava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)Lq3/n;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-interface {v0, v1, v2}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-eqz v1, :cond_2

    .line 91
    .line 92
    invoke-virtual {p0}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;->j()V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_3
    instance-of p1, p1, Lcom/zykj/lib/login/ui/teacher/pwd/c$c;

    .line 97
    .line 98
    if-eqz p1, :cond_4

    .line 99
    .line 100
    invoke-virtual {p0}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;->h()V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 105
    .line 106
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 107
    .line 108
    .line 109
    throw p1
.end method

.method public final h()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;->d:Ll8/h;

    .line 2
    .line 3
    invoke-interface {v0}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lq3/n;

    .line 8
    .line 9
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Li8/b0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v4, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel$performSubmit$1;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-direct {v4, p0, v0, v2}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel$performSubmit$1;-><init>(Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;Lq3/n;Lm7/c;)V

    .line 17
    .line 18
    .line 19
    const/4 v5, 0x3

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-static/range {v1 .. v6}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final i(Lcom/zykj/lib/login/ui/teacher/pwd/b;)V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Li8/b0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel$sendEffect$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, p1, v1}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel$sendEffect$1;-><init>(Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;Lcom/zykj/lib/login/ui/teacher/pwd/b;Lm7/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final j()V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;->d:Ll8/h;

    .line 4
    .line 5
    invoke-interface {v1}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lq3/n;

    .line 10
    .line 11
    invoke-virtual {v1}, Lq3/n;->f()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v1}, Lq3/n;->d()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v1}, Lq3/n;->e()Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    const/4 v5, 0x0

    .line 28
    const/4 v6, 0x1

    .line 29
    const/16 v7, 0x8

    .line 30
    .line 31
    if-lt v4, v7, :cond_0

    .line 32
    .line 33
    invoke-virtual {v1}, Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;->c()Lkotlin/text/Regex;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-virtual {v4, v2}, Lkotlin/text/Regex;->h(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-nez v4, :cond_0

    .line 42
    .line 43
    move v14, v6

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move v14, v5

    .line 46
    :goto_0
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-lt v4, v7, :cond_1

    .line 51
    .line 52
    invoke-virtual {v1}, Lcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;->c()Lkotlin/text/Regex;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v1, v2}, Lkotlin/text/Regex;->h(Ljava/lang/CharSequence;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_1

    .line 61
    .line 62
    move v1, v6

    .line 63
    goto :goto_1

    .line 64
    :cond_1
    move v1, v5

    .line 65
    :goto_1
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-lez v4, :cond_2

    .line 70
    .line 71
    invoke-static {v3, v2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-nez v4, :cond_2

    .line 76
    .line 77
    move/from16 v16, v6

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_2
    move/from16 v16, v5

    .line 81
    .line 82
    :goto_2
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-lez v4, :cond_3

    .line 87
    .line 88
    invoke-static {v3, v2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-eqz v2, :cond_3

    .line 93
    .line 94
    move v2, v6

    .line 95
    goto :goto_3

    .line 96
    :cond_3
    move v2, v5

    .line 97
    :goto_3
    if-eqz v1, :cond_4

    .line 98
    .line 99
    if-eqz v2, :cond_4

    .line 100
    .line 101
    move v12, v6

    .line 102
    goto :goto_4

    .line 103
    :cond_4
    move v12, v5

    .line 104
    :goto_4
    iget-object v1, v0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;->d:Ll8/h;

    .line 105
    .line 106
    :cond_5
    invoke-interface {v1}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    move-object v8, v2

    .line 111
    check-cast v8, Lq3/n;

    .line 112
    .line 113
    if-eqz v16, :cond_6

    .line 114
    .line 115
    const-string v3, "\u4e24\u6b21\u5bc6\u7801\u8f93\u5165\u4e0d\u4e00\u81f4"

    .line 116
    .line 117
    :goto_5
    move-object/from16 v17, v3

    .line 118
    .line 119
    goto :goto_6

    .line 120
    :cond_6
    const-string v3, ""

    .line 121
    .line 122
    goto :goto_5

    .line 123
    :goto_6
    const/16 v18, 0x57

    .line 124
    .line 125
    const/16 v19, 0x0

    .line 126
    .line 127
    const/4 v9, 0x0

    .line 128
    const/4 v10, 0x0

    .line 129
    const/4 v11, 0x0

    .line 130
    const/4 v13, 0x0

    .line 131
    const/4 v15, 0x0

    .line 132
    invoke-static/range {v8 .. v19}, Lq3/n;->b(Lq3/n;Ljava/lang/String;Ljava/lang/String;ZZLcom/zykj/lib/login/ui/teacher/pwd/PasswordSecurityLevel;ZLjava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)Lq3/n;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    invoke-interface {v1, v2, v3}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    if-eqz v2, :cond_5

    .line 141
    .line 142
    return-void
.end method
