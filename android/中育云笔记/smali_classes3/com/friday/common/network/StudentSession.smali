.class public final Lcom/friday/common/network/StudentSession;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lvd/l;

.field public final b:Lhd/a;

.field public final c:Lhd/l;

.field public final d:J

.field public final e:Lhd/l;

.field public final f:Lbe/a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lvd/l;)V
    .locals 10

    const-string v0, "headerBeanFlow"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    new-instance v3, Lh2/g;

    invoke-direct {v3}, Lh2/g;-><init>()V

    .line 11
    new-instance v4, Lcom/friday/common/network/StudentSession$3;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lcom/friday/common/network/StudentSession$3;-><init>(Lvc/c;)V

    .line 12
    new-instance v7, Lcom/friday/common/network/StudentSession$4;

    invoke-direct {v7, v0}, Lcom/friday/common/network/StudentSession$4;-><init>(Lvc/c;)V

    const/16 v8, 0x8

    const/4 v9, 0x0

    const-wide/16 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    .line 13
    invoke-direct/range {v1 .. v9}, Lcom/friday/common/network/StudentSession;-><init>(Lvd/l;Lhd/a;Lhd/l;JLhd/l;ILkotlin/jvm/internal/n;)V

    return-void
.end method

.method public constructor <init>(Lvd/l;Lhd/a;Lhd/l;JLhd/l;)V
    .locals 1

    const-string v0, "headerBeanFlow"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isStudent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fetchServerInfo"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isCurrentAccount"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/friday/common/network/StudentSession;->a:Lvd/l;

    .line 3
    iput-object p2, p0, Lcom/friday/common/network/StudentSession;->b:Lhd/a;

    .line 4
    iput-object p3, p0, Lcom/friday/common/network/StudentSession;->c:Lhd/l;

    .line 5
    iput-wide p4, p0, Lcom/friday/common/network/StudentSession;->d:J

    .line 6
    iput-object p6, p0, Lcom/friday/common/network/StudentSession;->e:Lhd/l;

    const/4 p1, 0x1

    const/4 p2, 0x0

    const/4 p3, 0x0

    .line 7
    invoke-static {p3, p1, p2}, Lbe/f;->b(ZILjava/lang/Object;)Lbe/a;

    move-result-object p1

    iput-object p1, p0, Lcom/friday/common/network/StudentSession;->f:Lbe/a;

    return-void
.end method

.method public synthetic constructor <init>(Lvd/l;Lhd/a;Lhd/l;JLhd/l;ILkotlin/jvm/internal/n;)V
    .locals 7

    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_0

    const-wide/16 p4, 0x1388

    :cond_0
    move-wide v4, p4

    and-int/lit8 p4, p7, 0x10

    if-eqz p4, :cond_1

    .line 8
    new-instance p6, Lcom/friday/common/network/StudentSession$1;

    const/4 p4, 0x0

    invoke-direct {p6, p4}, Lcom/friday/common/network/StudentSession$1;-><init>(Lvc/c;)V

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v6, p6

    .line 9
    invoke-direct/range {v0 .. v6}, Lcom/friday/common/network/StudentSession;-><init>(Lvd/l;Lhd/a;Lhd/l;JLhd/l;)V

    return-void
.end method

.method public static synthetic a()Z
    .locals 1

    .line 1
    invoke-static {}, Lcom/friday/common/network/StudentSession;->b()Z

    move-result v0

    return v0
.end method

.method public static final b()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/friday/common/helper/b;->v()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public static final synthetic c(Lcom/friday/common/network/StudentSession;)Lhd/l;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/common/network/StudentSession;->c:Lhd/l;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic d(Lcom/friday/common/network/StudentSession;)Lvd/l;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/common/network/StudentSession;->a:Lvd/l;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic e(Lcom/friday/common/network/StudentSession;)Lbe/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/common/network/StudentSession;->f:Lbe/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic f(Lcom/friday/common/network/StudentSession;)Lhd/l;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/common/network/StudentSession;->e:Lhd/l;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic g(Lcom/friday/common/network/StudentSession;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/network/StudentSession;->j()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic h(Lcom/friday/common/network/StudentSession;Lcom/zykj/message/server/bean/ServerInfo;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/friday/common/network/StudentSession;->k(Lcom/zykj/message/server/bean/ServerInfo;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method


# virtual methods
.method public final i(Lvc/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, Lcom/friday/common/network/StudentSession$ensureReady$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/friday/common/network/StudentSession$ensureReady$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/common/network/StudentSession$ensureReady$1;->e:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/friday/common/network/StudentSession$ensureReady$1;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/friday/common/network/StudentSession$ensureReady$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/friday/common/network/StudentSession$ensureReady$1;-><init>(Lcom/friday/common/network/StudentSession;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/friday/common/network/StudentSession$ensureReady$1;->c:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/friday/common/network/StudentSession$ensureReady$1;->e:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v4, :cond_1

    .line 38
    .line 39
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :catch_0
    move-exception p1

    .line 44
    goto :goto_3

    .line 45
    :catch_1
    move-exception p1

    .line 46
    goto :goto_4

    .line 47
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Lcom/friday/common/network/StudentSession;->b:Lhd/a;

    .line 59
    .line 60
    invoke-interface {p1}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    check-cast p1, Ljava/lang/Boolean;

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-eqz p1, :cond_7

    .line 71
    .line 72
    invoke-virtual {p0}, Lcom/friday/common/network/StudentSession;->j()Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-eqz p1, :cond_3

    .line 77
    .line 78
    goto :goto_5

    .line 79
    :cond_3
    :try_start_1
    iget-wide v5, p0, Lcom/friday/common/network/StudentSession;->d:J

    .line 80
    .line 81
    new-instance p1, Lcom/friday/common/network/StudentSession$ensureReady$ready$1;

    .line 82
    .line 83
    invoke-direct {p1, p0, v3}, Lcom/friday/common/network/StudentSession$ensureReady$ready$1;-><init>(Lcom/friday/common/network/StudentSession;Lvc/c;)V

    .line 84
    .line 85
    .line 86
    iput v4, v0, Lcom/friday/common/network/StudentSession$ensureReady$1;->e:I

    .line 87
    .line 88
    invoke-static {v5, v6, p1, v0}, Lkotlinx/coroutines/TimeoutKt;->e(JLhd/p;Lvc/c;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    if-ne p1, v1, :cond_4

    .line 93
    .line 94
    return-object v1

    .line 95
    :cond_4
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    .line 96
    .line 97
    if-eqz p1, :cond_5

    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 100
    .line 101
    .line 102
    move-result p1
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 103
    goto :goto_2

    .line 104
    :cond_5
    const/4 p1, 0x0

    .line 105
    :goto_2
    if-eqz p1, :cond_6

    .line 106
    .line 107
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 108
    .line 109
    return-object p1

    .line 110
    :cond_6
    new-instance p1, Lcom/friday/common/network/SessionNotReadyException;

    .line 111
    .line 112
    invoke-direct {p1, v3, v4, v3}, Lcom/friday/common/network/SessionNotReadyException;-><init>(Ljava/lang/Throwable;ILkotlin/jvm/internal/n;)V

    .line 113
    .line 114
    .line 115
    throw p1

    .line 116
    :goto_3
    new-instance v0, Lcom/friday/common/network/SessionNotReadyException;

    .line 117
    .line 118
    invoke-direct {v0, p1}, Lcom/friday/common/network/SessionNotReadyException;-><init>(Ljava/lang/Throwable;)V

    .line 119
    .line 120
    .line 121
    throw v0

    .line 122
    :goto_4
    throw p1

    .line 123
    :cond_7
    :goto_5
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 124
    .line 125
    return-object p1
.end method

.method public final j()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/common/network/StudentSession;->a:Lvd/l;

    .line 2
    .line 3
    invoke-interface {v0}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/http/bean/HeaderBean;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/zykj/http/bean/HeaderBean;->getServerUrl()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    sget-object v2, Lje/r;->k:Lje/r$b;

    .line 16
    .line 17
    invoke-virtual {v2, v1}, Lje/r$b;->f(Ljava/lang/String;)Lje/r;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v1, 0x0

    .line 23
    :goto_0
    if-eqz v1, :cond_2

    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/zykj/http/bean/HeaderBean;->getAccessToken()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    invoke-static {v0}, Lqd/c0;->h0(Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const/4 v0, 0x1

    .line 39
    return v0

    .line 40
    :cond_2
    :goto_1
    const/4 v0, 0x0

    .line 41
    return v0
.end method

.method public final k(Lcom/zykj/message/server/bean/ServerInfo;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/ServerInfo;->b()Lcom/zykj/message/server/bean/Status;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v1, v0

    .line 10
    :goto_0
    sget-object v2, Lcom/zykj/message/server/bean/Status;->d:Lcom/zykj/message/server/bean/Status;

    .line 11
    .line 12
    if-ne v1, v2, :cond_3

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/ServerInfo;->a()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    sget-object v0, Lje/r;->k:Lje/r$b;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lje/r$b;->f(Ljava/lang/String;)Lje/r;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :cond_1
    if-eqz v0, :cond_3

    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/ServerInfo;->c()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    if-eqz p1, :cond_3

    .line 33
    .line 34
    invoke-static {p1}, Lqd/c0;->h0(Ljava/lang/CharSequence;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_2

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    const/4 p1, 0x1

    .line 42
    return p1

    .line 43
    :cond_3
    :goto_1
    const/4 p1, 0x0

    .line 44
    return p1
.end method

.method public final l(Lcom/zykj/message/server/bean/ServerInfo;)Z
    .locals 10

    .line 1
    invoke-virtual {p0, p1}, Lcom/friday/common/network/StudentSession;->k(Lcom/zykj/message/server/bean/ServerInfo;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/friday/common/network/StudentSession;->a:Lvd/l;

    .line 10
    .line 11
    :cond_1
    invoke-interface {v0}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    move-object v2, v1

    .line 16
    check-cast v2, Lcom/zykj/http/bean/HeaderBean;

    .line 17
    .line 18
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/ServerInfo;->a()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/ServerInfo;->c()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    const/16 v8, 0x13

    .line 30
    .line 31
    const/4 v9, 0x0

    .line 32
    const/4 v3, 0x0

    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v7, 0x0

    .line 35
    invoke-static/range {v2 .. v9}, Lcom/zykj/http/bean/HeaderBean;->copy$default(Lcom/zykj/http/bean/HeaderBean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/zykj/http/bean/HeaderBean;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-interface {v0, v1, v2}, Lvd/l;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    const/4 p1, 0x1

    .line 46
    return p1
.end method

.method public final m(Lcom/zykj/message/server/bean/ServerInfo;Lvc/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Lcom/friday/common/network/StudentSession;->k(Lcom/zykj/message/server/bean/ServerInfo;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    iget-wide v0, p0, Lcom/friday/common/network/StudentSession;->d:J

    .line 11
    .line 12
    new-instance v2, Lcom/friday/common/network/StudentSession$updateForCurrentAccount$2;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-direct {v2, p0, p1, v3}, Lcom/friday/common/network/StudentSession$updateForCurrentAccount$2;-><init>(Lcom/friday/common/network/StudentSession;Lcom/zykj/message/server/bean/ServerInfo;Lvc/c;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1, v2, p2}, Lkotlinx/coroutines/TimeoutKt;->e(JLhd/p;Lvc/c;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method
