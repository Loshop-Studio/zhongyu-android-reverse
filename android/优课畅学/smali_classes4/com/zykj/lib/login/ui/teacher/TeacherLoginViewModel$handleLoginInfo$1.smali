# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class final Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$handleLoginInfo$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;->j(Lcom/zykj/lib/login/bean/LoginInfo;)V
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
    c = "com.zykj.lib.login.ui.teacher.TeacherLoginViewModel$handleLoginInfo$1"
    f = "TeacherLoginViewModel.kt"
    l = {
        0x60,
        0x65,
        0x69,
        0x6c,
        0x70
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public final synthetic c:Lcom/zykj/lib/login/bean/LoginInfo;

.field public final synthetic d:Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/lib/login/bean/LoginInfo;Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$handleLoginInfo$1;->c:Lcom/zykj/lib/login/bean/LoginInfo;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$handleLoginInfo$1;->d:Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;

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
    new-instance p1, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$handleLoginInfo$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$handleLoginInfo$1;->c:Lcom/zykj/lib/login/bean/LoginInfo;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$handleLoginInfo$1;->d:Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$handleLoginInfo$1;-><init>(Lcom/zykj/lib/login/bean/LoginInfo;Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;Lm7/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$handleLoginInfo$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$handleLoginInfo$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$handleLoginInfo$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$handleLoginInfo$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$handleLoginInfo$1;->b:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x5

    .line 9
    const/4 v4, 0x4

    .line 10
    const/4 v5, 0x3

    .line 11
    const/4 v6, 0x2

    .line 12
    const/4 v7, 0x1

    .line 13
    if-eqz v1, :cond_5

    .line 14
    .line 15
    if-eq v1, v7, :cond_4

    .line 16
    .line 17
    if-eq v1, v6, :cond_3

    .line 18
    .line 19
    if-eq v1, v5, :cond_2

    .line 20
    .line 21
    if-eq v1, v4, :cond_1

    .line 22
    .line 23
    if-ne v1, v3, :cond_0

    .line 24
    .line 25
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 26
    .line 27
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
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto/16 :goto_3

    .line 42
    .line 43
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto/16 :goto_2

    .line 47
    .line 48
    :cond_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_4
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_5
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$handleLoginInfo$1;->c:Lcom/zykj/lib/login/bean/LoginInfo;

    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/zykj/lib/login/bean/LoginInfo;->isTeacher()Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-nez p1, :cond_6

    .line 66
    .line 67
    sget-object p1, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 68
    .line 69
    sget v0, Lcom/zykj/lib/login/R$string;->student_center_login:I

    .line 70
    .line 71
    invoke-virtual {p1, v0}, Lcom/zykj/base/utils/XToastUtils;->warning(I)V

    .line 72
    .line 73
    .line 74
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 75
    .line 76
    return-object p1

    .line 77
    :cond_6
    iget-object p1, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$handleLoginInfo$1;->c:Lcom/zykj/lib/login/bean/LoginInfo;

    .line 78
    .line 79
    invoke-virtual {p1}, Lcom/zykj/lib/login/bean/LoginInfo;->getNeedSendSms()Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-eqz p1, :cond_8

    .line 84
    .line 85
    iget-object p1, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$handleLoginInfo$1;->d:Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;

    .line 86
    .line 87
    invoke-static {p1}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;->a(Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;)Ll8/g;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    sget-object v1, Lcom/zykj/lib/login/ui/teacher/a$b;->a:Lcom/zykj/lib/login/ui/teacher/a$b;

    .line 92
    .line 93
    iput v7, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$handleLoginInfo$1;->b:I

    .line 94
    .line 95
    invoke-interface {p1, v1, p0}, Ll8/g;->emit(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    if-ne p1, v0, :cond_7

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_7
    :goto_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 103
    .line 104
    return-object p1

    .line 105
    :cond_8
    iget-object p1, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$handleLoginInfo$1;->c:Lcom/zykj/lib/login/bean/LoginInfo;

    .line 106
    .line 107
    invoke-virtual {p1}, Lcom/zykj/lib/login/bean/LoginInfo;->getNeedChangePwd()Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-eqz p1, :cond_a

    .line 112
    .line 113
    iget-object p1, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$handleLoginInfo$1;->c:Lcom/zykj/lib/login/bean/LoginInfo;

    .line 114
    .line 115
    invoke-virtual {p1}, Lcom/zykj/lib/login/bean/LoginInfo;->getPasswordStrength()I

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    iget-object v1, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$handleLoginInfo$1;->d:Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;

    .line 120
    .line 121
    invoke-static {v1}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;->a(Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;)Ll8/g;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    new-instance v2, Lcom/zykj/lib/login/ui/teacher/a$a;

    .line 126
    .line 127
    invoke-direct {v2, p1}, Lcom/zykj/lib/login/ui/teacher/a$a;-><init>(I)V

    .line 128
    .line 129
    .line 130
    iput p1, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$handleLoginInfo$1;->a:I

    .line 131
    .line 132
    iput v6, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$handleLoginInfo$1;->b:I

    .line 133
    .line 134
    invoke-interface {v1, v2, p0}, Ll8/g;->emit(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    if-ne p1, v0, :cond_9

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_9
    :goto_1
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 142
    .line 143
    return-object p1

    .line 144
    :cond_a
    iget-object p1, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$handleLoginInfo$1;->d:Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;

    .line 145
    .line 146
    invoke-virtual {p1}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;->h()Landroidx/datastore/core/DataStore;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    new-instance v1, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$handleLoginInfo$1$1;

    .line 151
    .line 152
    iget-object v6, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$handleLoginInfo$1;->d:Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;

    .line 153
    .line 154
    invoke-direct {v1, v6, v2}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$handleLoginInfo$1$1;-><init>(Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;Lm7/c;)V

    .line 155
    .line 156
    .line 157
    iput v5, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$handleLoginInfo$1;->b:I

    .line 158
    .line 159
    invoke-interface {p1, v1, p0}, Landroidx/datastore/core/DataStore;->updateData(Lx7/p;Lm7/c;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    if-ne p1, v0, :cond_b

    .line 164
    .line 165
    goto :goto_4

    .line 166
    :cond_b
    :goto_2
    iget-object p1, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$handleLoginInfo$1;->d:Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;

    .line 167
    .line 168
    invoke-virtual {p1}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;->g()Landroidx/datastore/core/DataStore;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    new-instance v1, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$handleLoginInfo$1$2;

    .line 173
    .line 174
    iget-object v5, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$handleLoginInfo$1;->d:Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;

    .line 175
    .line 176
    invoke-direct {v1, v5, v2}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$handleLoginInfo$1$2;-><init>(Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;Lm7/c;)V

    .line 177
    .line 178
    .line 179
    iput v4, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$handleLoginInfo$1;->b:I

    .line 180
    .line 181
    invoke-interface {p1, v1, p0}, Landroidx/datastore/core/DataStore;->updateData(Lx7/p;Lm7/c;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    if-ne p1, v0, :cond_c

    .line 186
    .line 187
    goto :goto_4

    .line 188
    :cond_c
    :goto_3
    iget-object p1, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$handleLoginInfo$1;->d:Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;

    .line 189
    .line 190
    invoke-static {p1}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;->b(Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;)Ll8/g;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    invoke-static {v7}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    iput v3, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$handleLoginInfo$1;->b:I

    .line 199
    .line 200
    invoke-interface {p1, v1, p0}, Ll8/g;->emit(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    if-ne p1, v0, :cond_d

    .line 205
    .line 206
    :goto_4
    return-object v0

    .line 207
    :cond_d
    :goto_5
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 208
    .line 209
    return-object p1
.end method
