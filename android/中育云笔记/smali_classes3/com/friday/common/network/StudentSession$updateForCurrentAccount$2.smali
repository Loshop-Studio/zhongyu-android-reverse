.class final Lcom/friday/common/network/StudentSession$updateForCurrentAccount$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/common/network/StudentSession;->m(Lcom/zykj/message/server/bean/ServerInfo;Lvc/c;)Ljava/lang/Object;
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
    c = "com.friday.common.network.StudentSession$updateForCurrentAccount$2"
    f = "StudentSession.kt"
    l = {
        0x83,
        0x67
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:I

.field public h:I

.field public i:I

.field public final synthetic j:Lcom/friday/common/network/StudentSession;

.field public final synthetic k:Lcom/zykj/message/server/bean/ServerInfo;


# direct methods
.method public constructor <init>(Lcom/friday/common/network/StudentSession;Lcom/zykj/message/server/bean/ServerInfo;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/common/network/StudentSession$updateForCurrentAccount$2;->j:Lcom/friday/common/network/StudentSession;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/common/network/StudentSession$updateForCurrentAccount$2;->k:Lcom/zykj/message/server/bean/ServerInfo;

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
    new-instance p1, Lcom/friday/common/network/StudentSession$updateForCurrentAccount$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/common/network/StudentSession$updateForCurrentAccount$2;->j:Lcom/friday/common/network/StudentSession;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/common/network/StudentSession$updateForCurrentAccount$2;->k:Lcom/zykj/message/server/bean/ServerInfo;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/common/network/StudentSession$updateForCurrentAccount$2;-><init>(Lcom/friday/common/network/StudentSession;Lcom/zykj/message/server/bean/ServerInfo;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/common/network/StudentSession$updateForCurrentAccount$2;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/common/network/StudentSession$updateForCurrentAccount$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/common/network/StudentSession$updateForCurrentAccount$2;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/common/network/StudentSession$updateForCurrentAccount$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/common/network/StudentSession$updateForCurrentAccount$2;->i:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

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
    iget-object v0, p0, Lcom/friday/common/network/StudentSession$updateForCurrentAccount$2;->f:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lcom/zykj/http/bean/HeaderBean;

    .line 20
    .line 21
    iget-object v1, p0, Lcom/friday/common/network/StudentSession$updateForCurrentAccount$2;->e:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Lcom/zykj/message/server/bean/ServerInfo;

    .line 24
    .line 25
    iget-object v2, p0, Lcom/friday/common/network/StudentSession$updateForCurrentAccount$2;->d:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v2, Lcom/friday/common/network/StudentSession;

    .line 28
    .line 29
    iget-object v3, p0, Lcom/friday/common/network/StudentSession$updateForCurrentAccount$2;->c:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v3, Lbe/a;

    .line 32
    .line 33
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    move-object v6, v0

    .line 37
    goto/16 :goto_2

    .line 38
    .line 39
    :catchall_0
    move-exception v0

    .line 40
    move-object p1, v0

    .line 41
    goto/16 :goto_3

    .line 42
    .line 43
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :cond_1
    iget v1, p0, Lcom/friday/common/network/StudentSession$updateForCurrentAccount$2;->g:I

    .line 52
    .line 53
    iget-object v4, p0, Lcom/friday/common/network/StudentSession$updateForCurrentAccount$2;->e:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v4, Lcom/zykj/message/server/bean/ServerInfo;

    .line 56
    .line 57
    iget-object v6, p0, Lcom/friday/common/network/StudentSession$updateForCurrentAccount$2;->d:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v6, Lcom/friday/common/network/StudentSession;

    .line 60
    .line 61
    iget-object v7, p0, Lcom/friday/common/network/StudentSession$updateForCurrentAccount$2;->c:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v7, Lbe/a;

    .line 64
    .line 65
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    move p1, v1

    .line 69
    move-object v1, v4

    .line 70
    goto :goto_0

    .line 71
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iget-object p1, p0, Lcom/friday/common/network/StudentSession$updateForCurrentAccount$2;->j:Lcom/friday/common/network/StudentSession;

    .line 75
    .line 76
    invoke-static {p1}, Lcom/friday/common/network/StudentSession;->e(Lcom/friday/common/network/StudentSession;)Lbe/a;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    iget-object v1, p0, Lcom/friday/common/network/StudentSession$updateForCurrentAccount$2;->j:Lcom/friday/common/network/StudentSession;

    .line 81
    .line 82
    iget-object v6, p0, Lcom/friday/common/network/StudentSession$updateForCurrentAccount$2;->k:Lcom/zykj/message/server/bean/ServerInfo;

    .line 83
    .line 84
    iput-object p1, p0, Lcom/friday/common/network/StudentSession$updateForCurrentAccount$2;->c:Ljava/lang/Object;

    .line 85
    .line 86
    iput-object v1, p0, Lcom/friday/common/network/StudentSession$updateForCurrentAccount$2;->d:Ljava/lang/Object;

    .line 87
    .line 88
    iput-object v6, p0, Lcom/friday/common/network/StudentSession$updateForCurrentAccount$2;->e:Ljava/lang/Object;

    .line 89
    .line 90
    iput v2, p0, Lcom/friday/common/network/StudentSession$updateForCurrentAccount$2;->g:I

    .line 91
    .line 92
    iput v4, p0, Lcom/friday/common/network/StudentSession$updateForCurrentAccount$2;->i:I

    .line 93
    .line 94
    invoke-interface {p1, v5, p0}, Lbe/a;->lock(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    if-ne v4, v0, :cond_3

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_3
    move-object v7, v6

    .line 102
    move-object v6, v1

    .line 103
    move-object v1, v7

    .line 104
    move-object v7, p1

    .line 105
    move p1, v2

    .line 106
    :goto_0
    :try_start_1
    invoke-static {v6}, Lcom/friday/common/network/StudentSession;->d(Lcom/friday/common/network/StudentSession;)Lvd/l;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    invoke-interface {v4}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    check-cast v4, Lcom/zykj/http/bean/HeaderBean;

    .line 115
    .line 116
    invoke-static {v6}, Lcom/friday/common/network/StudentSession;->f(Lcom/friday/common/network/StudentSession;)Lhd/l;

    .line 117
    .line 118
    .line 119
    move-result-object v8

    .line 120
    iput-object v7, p0, Lcom/friday/common/network/StudentSession$updateForCurrentAccount$2;->c:Ljava/lang/Object;

    .line 121
    .line 122
    iput-object v6, p0, Lcom/friday/common/network/StudentSession$updateForCurrentAccount$2;->d:Ljava/lang/Object;

    .line 123
    .line 124
    iput-object v1, p0, Lcom/friday/common/network/StudentSession$updateForCurrentAccount$2;->e:Ljava/lang/Object;

    .line 125
    .line 126
    iput-object v4, p0, Lcom/friday/common/network/StudentSession$updateForCurrentAccount$2;->f:Ljava/lang/Object;

    .line 127
    .line 128
    iput p1, p0, Lcom/friday/common/network/StudentSession$updateForCurrentAccount$2;->g:I

    .line 129
    .line 130
    iput v2, p0, Lcom/friday/common/network/StudentSession$updateForCurrentAccount$2;->h:I

    .line 131
    .line 132
    iput v3, p0, Lcom/friday/common/network/StudentSession$updateForCurrentAccount$2;->i:I

    .line 133
    .line 134
    invoke-interface {v8, p0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 138
    if-ne p1, v0, :cond_4

    .line 139
    .line 140
    :goto_1
    return-object v0

    .line 141
    :cond_4
    move-object v2, v6

    .line 142
    move-object v3, v7

    .line 143
    move-object v6, v4

    .line 144
    :goto_2
    :try_start_2
    check-cast p1, Ljava/lang/Boolean;

    .line 145
    .line 146
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    if-eqz p1, :cond_5

    .line 151
    .line 152
    invoke-static {v2}, Lcom/friday/common/network/StudentSession;->d(Lcom/friday/common/network/StudentSession;)Lvd/l;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1}, Lcom/zykj/message/server/bean/ServerInfo;->a()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v9

    .line 163
    invoke-virtual {v1}, Lcom/zykj/message/server/bean/ServerInfo;->c()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v10

    .line 167
    const/16 v12, 0x13

    .line 168
    .line 169
    const/4 v13, 0x0

    .line 170
    const/4 v7, 0x0

    .line 171
    const/4 v8, 0x0

    .line 172
    const/4 v11, 0x0

    .line 173
    invoke-static/range {v6 .. v13}, Lcom/zykj/http/bean/HeaderBean;->copy$default(Lcom/zykj/http/bean/HeaderBean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/zykj/http/bean/HeaderBean;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-interface {p1, v6, v0}, Lvd/l;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    :cond_5
    sget-object p1, Lqc/q;->a:Lqc/q;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 181
    .line 182
    invoke-interface {v3, v5}, Lbe/a;->unlock(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 186
    .line 187
    return-object p1

    .line 188
    :catchall_1
    move-exception v0

    .line 189
    move-object p1, v0

    .line 190
    move-object v3, v7

    .line 191
    :goto_3
    invoke-interface {v3, v5}, Lbe/a;->unlock(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    throw p1
.end method
