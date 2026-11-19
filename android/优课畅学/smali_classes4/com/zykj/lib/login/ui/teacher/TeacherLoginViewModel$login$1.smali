.class final Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$login$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;->m()V
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
    c = "com.zykj.lib.login.ui.teacher.TeacherLoginViewModel$login$1"
    f = "TeacherLoginViewModel.kt"
    l = {
        0x51
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:I

.field public final synthetic e:Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$login$1;->e:Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;

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
    new-instance p1, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$login$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$login$1;->e:Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$login$1;-><init>(Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$login$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$login$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$login$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$login$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$login$1;->d:I

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
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$login$1;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ljava/lang/String;

    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$login$1;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ljava/lang/String;

    .line 19
    .line 20
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$login$1;->a:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto/16 :goto_1

    .line 28
    .line 29
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 32
    .line 33
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p1

    .line 37
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$login$1;->e:Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;

    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;->f()Landroidx/lifecycle/MutableLiveData;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, Ljava/lang/String;

    .line 51
    .line 52
    const-string v1, ""

    .line 53
    .line 54
    if-nez p1, :cond_2

    .line 55
    .line 56
    move-object p1, v1

    .line 57
    :cond_2
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-nez v3, :cond_3

    .line 62
    .line 63
    sget-object p1, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 64
    .line 65
    sget v0, Lcom/zykj/lib/login/R$string;->please_input_school_code:I

    .line 66
    .line 67
    invoke-virtual {p1, v0}, Lcom/zykj/base/utils/XToastUtils;->info(I)V

    .line 68
    .line 69
    .line 70
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 71
    .line 72
    return-object p1

    .line 73
    :cond_3
    iget-object v3, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$login$1;->e:Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;

    .line 74
    .line 75
    invoke-virtual {v3}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;->i()Landroidx/lifecycle/MutableLiveData;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {v3}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    check-cast v3, Ljava/lang/String;

    .line 84
    .line 85
    if-nez v3, :cond_4

    .line 86
    .line 87
    move-object v3, v1

    .line 88
    :cond_4
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-nez v4, :cond_5

    .line 93
    .line 94
    sget-object p1, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 95
    .line 96
    sget v0, Lcom/zykj/lib/login/R$string;->please_input_user_name:I

    .line 97
    .line 98
    invoke-virtual {p1, v0}, Lcom/zykj/base/utils/XToastUtils;->info(I)V

    .line 99
    .line 100
    .line 101
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 102
    .line 103
    return-object p1

    .line 104
    :cond_5
    iget-object v4, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$login$1;->e:Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;

    .line 105
    .line 106
    invoke-virtual {v4}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;->e()Landroidx/lifecycle/MutableLiveData;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    invoke-virtual {v4}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    check-cast v4, Ljava/lang/String;

    .line 115
    .line 116
    if-nez v4, :cond_6

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_6
    move-object v1, v4

    .line 120
    :goto_0
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    if-nez v4, :cond_7

    .line 125
    .line 126
    sget-object p1, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 127
    .line 128
    sget v0, Lcom/zykj/lib/login/R$string;->please_input_password:I

    .line 129
    .line 130
    invoke-virtual {p1, v0}, Lcom/zykj/base/utils/XToastUtils;->info(I)V

    .line 131
    .line 132
    .line 133
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 134
    .line 135
    return-object p1

    .line 136
    :cond_7
    iget-object v4, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$login$1;->e:Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;

    .line 137
    .line 138
    invoke-virtual {v4}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;->k()Landroidx/lifecycle/MutableLiveData;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    invoke-virtual {v4}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    invoke-static {v2}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    invoke-static {v4, v5}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v4

    .line 154
    if-nez v4, :cond_8

    .line 155
    .line 156
    sget-object p1, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 157
    .line 158
    sget v0, Lcom/zykj/lib/login/R$string;->please_check_agreement:I

    .line 159
    .line 160
    invoke-virtual {p1, v0}, Lcom/zykj/base/utils/XToastUtils;->info(I)V

    .line 161
    .line 162
    .line 163
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 164
    .line 165
    return-object p1

    .line 166
    :cond_8
    iget-object v4, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$login$1;->e:Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;

    .line 167
    .line 168
    invoke-virtual {v4}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;->c()Lp3/a;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    invoke-static {p1}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v5

    .line 176
    iput-object v5, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$login$1;->a:Ljava/lang/Object;

    .line 177
    .line 178
    invoke-static {v3}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    iput-object v5, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$login$1;->b:Ljava/lang/Object;

    .line 183
    .line 184
    invoke-static {v1}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v5

    .line 188
    iput-object v5, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$login$1;->c:Ljava/lang/Object;

    .line 189
    .line 190
    iput v2, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$login$1;->d:I

    .line 191
    .line 192
    invoke-interface {v4, p1, v3, v1, p0}, Lp3/a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm7/c;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    if-ne p1, v0, :cond_9

    .line 197
    .line 198
    return-object v0

    .line 199
    :cond_9
    :goto_1
    check-cast p1, Lcom/zykj/lib/login/bean/LoginInfo;

    .line 200
    .line 201
    if-nez p1, :cond_a

    .line 202
    .line 203
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 204
    .line 205
    return-object p1

    .line 206
    :cond_a
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$login$1;->e:Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;

    .line 207
    .line 208
    invoke-virtual {v0, p1}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;->j(Lcom/zykj/lib/login/bean/LoginInfo;)V

    .line 209
    .line 210
    .line 211
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 212
    .line 213
    return-object p1
.end method
