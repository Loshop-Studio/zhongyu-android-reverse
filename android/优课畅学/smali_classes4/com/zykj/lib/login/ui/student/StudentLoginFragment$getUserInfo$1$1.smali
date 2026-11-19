# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class final Lcom/zykj/lib/login/ui/student/StudentLoginFragment$getUserInfo$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/lib/login/ui/student/StudentLoginFragment;->k(Lcom/zykj/message/server/bean/ServerInfo;)V
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
    c = "com.zykj.lib.login.ui.student.StudentLoginFragment$getUserInfo$1$1"
    f = "StudentLoginFragment.kt"
    l = {
        0x39,
        0x42
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/lib/login/ui/student/StudentLoginFragment;

.field public final synthetic c:Lcom/zykj/message/server/bean/UserInfo;

.field public final synthetic d:Lcom/zykj/message/server/bean/ServerInfo;


# direct methods
.method public constructor <init>(Lcom/zykj/lib/login/ui/student/StudentLoginFragment;Lcom/zykj/message/server/bean/UserInfo;Lcom/zykj/message/server/bean/ServerInfo;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/lib/login/ui/student/StudentLoginFragment$getUserInfo$1$1;->b:Lcom/zykj/lib/login/ui/student/StudentLoginFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/lib/login/ui/student/StudentLoginFragment$getUserInfo$1$1;->c:Lcom/zykj/message/server/bean/UserInfo;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/lib/login/ui/student/StudentLoginFragment$getUserInfo$1$1;->d:Lcom/zykj/message/server/bean/ServerInfo;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 3

    .line 1
    new-instance p1, Lcom/zykj/lib/login/ui/student/StudentLoginFragment$getUserInfo$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/lib/login/ui/student/StudentLoginFragment$getUserInfo$1$1;->b:Lcom/zykj/lib/login/ui/student/StudentLoginFragment;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/lib/login/ui/student/StudentLoginFragment$getUserInfo$1$1;->c:Lcom/zykj/message/server/bean/UserInfo;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/zykj/lib/login/ui/student/StudentLoginFragment$getUserInfo$1$1;->d:Lcom/zykj/message/server/bean/ServerInfo;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/lib/login/ui/student/StudentLoginFragment$getUserInfo$1$1;-><init>(Lcom/zykj/lib/login/ui/student/StudentLoginFragment;Lcom/zykj/message/server/bean/UserInfo;Lcom/zykj/message/server/bean/ServerInfo;Lm7/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/lib/login/ui/student/StudentLoginFragment$getUserInfo$1$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/lib/login/ui/student/StudentLoginFragment$getUserInfo$1$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/lib/login/ui/student/StudentLoginFragment$getUserInfo$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/lib/login/ui/student/StudentLoginFragment$getUserInfo$1$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/zykj/lib/login/ui/student/StudentLoginFragment$getUserInfo$1$1;->a:I

    .line 6
    .line 7
    const-string v2, "build(...)"

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    const/4 v4, 0x1

    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    if-eq v1, v4, :cond_1

    .line 14
    .line 15
    if-ne v1, v3, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    goto/16 :goto_2

    .line 21
    .line 22
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1

    .line 30
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lcom/zykj/lib/login/ui/student/StudentLoginFragment$getUserInfo$1$1;->b:Lcom/zykj/lib/login/ui/student/StudentLoginFragment;

    .line 38
    .line 39
    invoke-static {p1}, Lcom/zykj/lib/login/ui/student/StudentLoginFragment;->i(Lcom/zykj/lib/login/ui/student/StudentLoginFragment;)Lcom/zykj/lib/login/ui/main/LoginViewModel;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-static {}, Lcom/zykj/lib/login/proto/ServerBean;->newBuilder()Lcom/zykj/lib/login/proto/ServerBean$Builder;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    iget-object v5, p0, Lcom/zykj/lib/login/ui/student/StudentLoginFragment$getUserInfo$1$1;->c:Lcom/zykj/message/server/bean/UserInfo;

    .line 48
    .line 49
    invoke-virtual {v5}, Lcom/zykj/message/server/bean/UserInfo;->f()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-virtual {v1, v5}, Lcom/zykj/lib/login/proto/ServerBean$Builder;->setSchoolCode(Ljava/lang/String;)Lcom/zykj/lib/login/proto/ServerBean$Builder;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iget-object v5, p0, Lcom/zykj/lib/login/ui/student/StudentLoginFragment$getUserInfo$1$1;->d:Lcom/zykj/message/server/bean/ServerInfo;

    .line 58
    .line 59
    invoke-virtual {v5}, Lcom/zykj/message/server/bean/ServerInfo;->a()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    invoke-virtual {v1, v5}, Lcom/zykj/lib/login/proto/ServerBean$Builder;->setServerUrl(Ljava/lang/String;)Lcom/zykj/lib/login/proto/ServerBean$Builder;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iget-object v5, p0, Lcom/zykj/lib/login/ui/student/StudentLoginFragment$getUserInfo$1$1;->d:Lcom/zykj/message/server/bean/ServerInfo;

    .line 68
    .line 69
    invoke-virtual {v5}, Lcom/zykj/message/server/bean/ServerInfo;->d()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-virtual {v1, v5}, Lcom/zykj/lib/login/proto/ServerBean$Builder;->setAccessToken(Ljava/lang/String;)Lcom/zykj/lib/login/proto/ServerBean$Builder;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    iget-object v5, p0, Lcom/zykj/lib/login/ui/student/StudentLoginFragment$getUserInfo$1$1;->d:Lcom/zykj/message/server/bean/ServerInfo;

    .line 78
    .line 79
    invoke-virtual {v5}, Lcom/zykj/message/server/bean/ServerInfo;->f()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    if-nez v5, :cond_3

    .line 84
    .line 85
    const-string v5, ""

    .line 86
    .line 87
    :cond_3
    invoke-virtual {v1, v5}, Lcom/zykj/lib/login/proto/ServerBean$Builder;->setWebServerUrl(Ljava/lang/String;)Lcom/zykj/lib/login/proto/ServerBean$Builder;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {v1}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    check-cast v1, Lcom/zykj/lib/login/proto/ServerBean;

    .line 99
    .line 100
    iput v4, p0, Lcom/zykj/lib/login/ui/student/StudentLoginFragment$getUserInfo$1$1;->a:I

    .line 101
    .line 102
    invoke-virtual {p1, v1, p0}, Lcom/zykj/lib/login/ui/main/LoginViewModel;->d(Lcom/zykj/lib/login/proto/ServerBean;Lm7/c;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    if-ne p1, v0, :cond_4

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_4
    :goto_0
    iget-object p1, p0, Lcom/zykj/lib/login/ui/student/StudentLoginFragment$getUserInfo$1$1;->b:Lcom/zykj/lib/login/ui/student/StudentLoginFragment;

    .line 110
    .line 111
    invoke-static {p1}, Lcom/zykj/lib/login/ui/student/StudentLoginFragment;->i(Lcom/zykj/lib/login/ui/student/StudentLoginFragment;)Lcom/zykj/lib/login/ui/main/LoginViewModel;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-static {}, Lcom/zykj/lib/login/proto/UserBean;->newBuilder()Lcom/zykj/lib/login/proto/UserBean$Builder;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    iget-object v4, p0, Lcom/zykj/lib/login/ui/student/StudentLoginFragment$getUserInfo$1$1;->c:Lcom/zykj/message/server/bean/UserInfo;

    .line 120
    .line 121
    invoke-virtual {v4}, Lcom/zykj/message/server/bean/UserInfo;->a()Ljava/lang/Long;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    invoke-virtual {v4}, Ljava/lang/Long;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    invoke-virtual {v1, v4}, Lcom/zykj/lib/login/proto/UserBean$Builder;->setId(Ljava/lang/String;)Lcom/zykj/lib/login/proto/UserBean$Builder;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    iget-object v4, p0, Lcom/zykj/lib/login/ui/student/StudentLoginFragment$getUserInfo$1$1;->c:Lcom/zykj/message/server/bean/UserInfo;

    .line 134
    .line 135
    invoke-virtual {v4}, Lcom/zykj/message/server/bean/UserInfo;->h()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    invoke-virtual {v1, v4}, Lcom/zykj/lib/login/proto/UserBean$Builder;->setUserName(Ljava/lang/String;)Lcom/zykj/lib/login/proto/UserBean$Builder;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    iget-object v4, p0, Lcom/zykj/lib/login/ui/student/StudentLoginFragment$getUserInfo$1$1;->c:Lcom/zykj/message/server/bean/UserInfo;

    .line 144
    .line 145
    invoke-virtual {v4}, Lcom/zykj/message/server/bean/UserInfo;->d()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    invoke-virtual {v1, v4}, Lcom/zykj/lib/login/proto/UserBean$Builder;->setRealName(Ljava/lang/String;)Lcom/zykj/lib/login/proto/UserBean$Builder;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    iget-object v4, p0, Lcom/zykj/lib/login/ui/student/StudentLoginFragment$getUserInfo$1$1;->c:Lcom/zykj/message/server/bean/UserInfo;

    .line 154
    .line 155
    invoke-virtual {v4}, Lcom/zykj/message/server/bean/UserInfo;->b()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    invoke-virtual {v1, v4}, Lcom/zykj/lib/login/proto/UserBean$Builder;->setAvatar(Ljava/lang/String;)Lcom/zykj/lib/login/proto/UserBean$Builder;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    sget-object v4, Lcom/zykj/lib/login/proto/RoleType;->Student:Lcom/zykj/lib/login/proto/RoleType;

    .line 164
    .line 165
    invoke-virtual {v1, v4}, Lcom/zykj/lib/login/proto/UserBean$Builder;->setRole(Lcom/zykj/lib/login/proto/RoleType;)Lcom/zykj/lib/login/proto/UserBean$Builder;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-virtual {v1}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    check-cast v1, Lcom/zykj/lib/login/proto/UserBean;

    .line 177
    .line 178
    iput v3, p0, Lcom/zykj/lib/login/ui/student/StudentLoginFragment$getUserInfo$1$1;->a:I

    .line 179
    .line 180
    invoke-virtual {p1, v1, p0}, Lcom/zykj/lib/login/ui/main/LoginViewModel;->e(Lcom/zykj/lib/login/proto/UserBean;Lm7/c;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    if-ne p1, v0, :cond_5

    .line 185
    .line 186
    :goto_1
    return-object v0

    .line 187
    :cond_5
    :goto_2
    iget-object p1, p0, Lcom/zykj/lib/login/ui/student/StudentLoginFragment$getUserInfo$1$1;->b:Lcom/zykj/lib/login/ui/student/StudentLoginFragment;

    .line 188
    .line 189
    invoke-static {p1}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    invoke-virtual {p1}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 194
    .line 195
    .line 196
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 197
    .line 198
    return-object p1
.end method
