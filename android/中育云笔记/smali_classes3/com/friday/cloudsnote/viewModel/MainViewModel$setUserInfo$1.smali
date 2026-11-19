.class final Lcom/friday/cloudsnote/viewModel/MainViewModel$setUserInfo$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/cloudsnote/viewModel/MainViewModel;->g(Lcom/zykj/message/server/bean/UserInfo;)V
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
    c = "com.friday.cloudsnote.viewModel.MainViewModel$setUserInfo$1"
    f = "MainViewModel.kt"
    l = {
        0x2e
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:I

.field public final synthetic e:Lcom/zykj/message/server/bean/UserInfo;

.field public final synthetic f:Lcom/friday/cloudsnote/viewModel/MainViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/message/server/bean/UserInfo;Lcom/friday/cloudsnote/viewModel/MainViewModel;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/cloudsnote/viewModel/MainViewModel$setUserInfo$1;->e:Lcom/zykj/message/server/bean/UserInfo;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/cloudsnote/viewModel/MainViewModel$setUserInfo$1;->f:Lcom/friday/cloudsnote/viewModel/MainViewModel;

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
    new-instance p1, Lcom/friday/cloudsnote/viewModel/MainViewModel$setUserInfo$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/cloudsnote/viewModel/MainViewModel$setUserInfo$1;->e:Lcom/zykj/message/server/bean/UserInfo;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/cloudsnote/viewModel/MainViewModel$setUserInfo$1;->f:Lcom/friday/cloudsnote/viewModel/MainViewModel;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/cloudsnote/viewModel/MainViewModel$setUserInfo$1;-><init>(Lcom/zykj/message/server/bean/UserInfo;Lcom/friday/cloudsnote/viewModel/MainViewModel;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/cloudsnote/viewModel/MainViewModel$setUserInfo$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/cloudsnote/viewModel/MainViewModel$setUserInfo$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/cloudsnote/viewModel/MainViewModel$setUserInfo$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/cloudsnote/viewModel/MainViewModel$setUserInfo$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/cloudsnote/viewModel/MainViewModel$setUserInfo$1;->d:I

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
    iget-object v0, p0, Lcom/friday/cloudsnote/viewModel/MainViewModel$setUserInfo$1;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto/16 :goto_0

    .line 20
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
    sget-object p1, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-object v3, p0, Lcom/friday/cloudsnote/viewModel/MainViewModel$setUserInfo$1;->e:Lcom/zykj/message/server/bean/UserInfo;

    .line 39
    .line 40
    invoke-virtual {v3}, Lcom/zykj/message/server/bean/UserInfo;->b()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    const-string v4, "getRealName(...)"

    .line 45
    .line 46
    invoke-static {v3, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v3}, Lcom/friday/common/helper/b;->I(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    iget-object v3, p0, Lcom/friday/cloudsnote/viewModel/MainViewModel$setUserInfo$1;->e:Lcom/zykj/message/server/bean/UserInfo;

    .line 57
    .line 58
    invoke-virtual {v3}, Lcom/zykj/message/server/bean/UserInfo;->c()Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    const-string v5, "getRole(...)"

    .line 63
    .line 64
    invoke-static {v3, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    invoke-virtual {v1, v3}, Lcom/friday/common/helper/b;->K(I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    iget-object v3, p0, Lcom/friday/cloudsnote/viewModel/MainViewModel$setUserInfo$1;->e:Lcom/zykj/message/server/bean/UserInfo;

    .line 79
    .line 80
    invoke-virtual {v3}, Lcom/zykj/message/server/bean/UserInfo;->a()Ljava/lang/Long;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    const-string v5, "getId(...)"

    .line 85
    .line 86
    invoke-static {v3, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 90
    .line 91
    .line 92
    move-result-wide v6

    .line 93
    invoke-virtual {v1, v6, v7}, Lcom/friday/common/helper/b;->H(J)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    iget-object v3, p0, Lcom/friday/cloudsnote/viewModel/MainViewModel$setUserInfo$1;->e:Lcom/zykj/message/server/bean/UserInfo;

    .line 101
    .line 102
    invoke-virtual {v3}, Lcom/zykj/message/server/bean/UserInfo;->g()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    const-string v6, "getSchoolCode(...)"

    .line 107
    .line 108
    invoke-static {v3, v6}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1, v3}, Lcom/friday/common/helper/b;->A(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppDataPath()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    .line 119
    .line 120
    iget-object v6, p0, Lcom/friday/cloudsnote/viewModel/MainViewModel$setUserInfo$1;->e:Lcom/zykj/message/server/bean/UserInfo;

    .line 121
    .line 122
    invoke-virtual {v6}, Lcom/zykj/message/server/bean/UserInfo;->a()Ljava/lang/Long;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    new-instance v7, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    const-string v1, "userNote"

    .line 138
    .line 139
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-virtual {p1}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    new-instance v6, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    const-string v7, "note"

    .line 168
    .line 169
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    invoke-virtual {p1, v3}, Lcom/friday/common/helper/b;->D(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    iget-object p1, p0, Lcom/friday/cloudsnote/viewModel/MainViewModel$setUserInfo$1;->f:Lcom/friday/cloudsnote/viewModel/MainViewModel;

    .line 183
    .line 184
    invoke-static {p1}, Lcom/friday/cloudsnote/viewModel/MainViewModel;->f(Lcom/friday/cloudsnote/viewModel/MainViewModel;)Lcom/friday/common/dao/UserDao;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    iget-object v3, p0, Lcom/friday/cloudsnote/viewModel/MainViewModel$setUserInfo$1;->e:Lcom/zykj/message/server/bean/UserInfo;

    .line 189
    .line 190
    invoke-virtual {v3}, Lcom/zykj/message/server/bean/UserInfo;->a()Ljava/lang/Long;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    invoke-static {v3, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 198
    .line 199
    .line 200
    move-result-wide v5

    .line 201
    iget-object v3, p0, Lcom/friday/cloudsnote/viewModel/MainViewModel$setUserInfo$1;->e:Lcom/zykj/message/server/bean/UserInfo;

    .line 202
    .line 203
    invoke-virtual {v3}, Lcom/zykj/message/server/bean/UserInfo;->b()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    invoke-static {v3, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    iput-object v1, p0, Lcom/friday/cloudsnote/viewModel/MainViewModel$setUserInfo$1;->c:Ljava/lang/Object;

    .line 215
    .line 216
    iput v2, p0, Lcom/friday/cloudsnote/viewModel/MainViewModel$setUserInfo$1;->d:I

    .line 217
    .line 218
    invoke-interface {p1, v5, v6, v3, p0}, Lcom/friday/common/dao/UserDao;->b(JLjava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    if-ne p1, v0, :cond_2

    .line 223
    .line 224
    return-object v0

    .line 225
    :cond_2
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 226
    .line 227
    return-object p1
.end method
