.class public final Lcom/zykj/evaluation/network/RefreshRepositoryImpl;
.super Lj7/a;
.source "SourceFile"


# instance fields
.field public final a:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public c:Ljava/lang/StringBuffer;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lkotlinx/coroutines/flow/MutableStateFlow;)V
    .locals 1

    .line 1
    const-string v0, "headerBeanFlow"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lj7/a;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/evaluation/network/RefreshRepositoryImpl;->a:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 10
    .line 11
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lcom/zykj/evaluation/network/RefreshRepositoryImpl;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 18
    .line 19
    new-instance p1, Ljava/lang/StringBuffer;

    .line 20
    .line 21
    invoke-direct {p1}, Ljava/lang/StringBuffer;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lcom/zykj/evaluation/network/RefreshRepositoryImpl;->c:Ljava/lang/StringBuffer;

    .line 25
    .line 26
    return-void
.end method

.method public static synthetic b(Lcom/zykj/evaluation/network/RefreshRepositoryImpl;Lcom/zykj/message/server/bean/ServerInfo;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/evaluation/network/RefreshRepositoryImpl;->c(Lcom/zykj/evaluation/network/RefreshRepositoryImpl;Lcom/zykj/message/server/bean/ServerInfo;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lcom/zykj/evaluation/network/RefreshRepositoryImpl;Lcom/zykj/message/server/bean/ServerInfo;)Lkotlin/Unit;
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    iget-object v1, p0, Lcom/zykj/evaluation/network/RefreshRepositoryImpl;->a:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 5
    .line 6
    :cond_0
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    move-object v3, v2

    .line 11
    check-cast v3, Lcom/zykj/http/bean/HeaderBean;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/ServerInfo;->c()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v7

    .line 17
    const/16 v9, 0x17

    .line 18
    .line 19
    const/4 v10, 0x0

    .line 20
    const/4 v4, 0x0

    .line 21
    const/4 v5, 0x0

    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v8, 0x0

    .line 24
    invoke-static/range {v3 .. v10}, Lcom/zykj/http/bean/HeaderBean;->copy$default(Lcom/zykj/http/bean/HeaderBean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/zykj/http/bean/HeaderBean;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-interface {v1, v2, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    iget-object v1, p0, Lcom/zykj/evaluation/network/RefreshRepositoryImpl;->c:Ljava/lang/StringBuffer;

    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/ServerInfo;->c()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {v1, v0, p1}, Ljava/lang/StringBuffer;->insert(ILjava/lang/String;)Ljava/lang/StringBuffer;

    .line 41
    .line 42
    .line 43
    :cond_1
    iget-object p0, p0, Lcom/zykj/evaluation/network/RefreshRepositoryImpl;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 44
    .line 45
    const/4 p1, 0x1

    .line 46
    invoke-virtual {p0, p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 47
    .line 48
    .line 49
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 50
    .line 51
    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, Lcom/zykj/evaluation/network/RefreshRepositoryImpl$refreshToken$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/zykj/evaluation/network/RefreshRepositoryImpl$refreshToken$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/evaluation/network/RefreshRepositoryImpl$refreshToken$1;->d:I

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
    iput v1, v0, Lcom/zykj/evaluation/network/RefreshRepositoryImpl$refreshToken$1;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/evaluation/network/RefreshRepositoryImpl$refreshToken$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/zykj/evaluation/network/RefreshRepositoryImpl$refreshToken$1;-><init>(Lcom/zykj/evaluation/network/RefreshRepositoryImpl;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/zykj/evaluation/network/RefreshRepositoryImpl$refreshToken$1;->b:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/evaluation/network/RefreshRepositoryImpl$refreshToken$1;->d:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p1, v0, Lcom/zykj/evaluation/network/RefreshRepositoryImpl$refreshToken$1;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object p2, p0, Lcom/zykj/evaluation/network/RefreshRepositoryImpl;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 58
    .line 59
    const/4 v2, 0x0

    .line 60
    invoke-virtual {p2, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    if-nez p2, :cond_4

    .line 65
    .line 66
    :cond_3
    :goto_1
    iget-object p2, p0, Lcom/zykj/evaluation/network/RefreshRepositoryImpl;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 67
    .line 68
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    if-eqz p2, :cond_7

    .line 73
    .line 74
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    iput-object p2, v0, Lcom/zykj/evaluation/network/RefreshRepositoryImpl$refreshToken$1;->a:Ljava/lang/Object;

    .line 79
    .line 80
    iput v3, v0, Lcom/zykj/evaluation/network/RefreshRepositoryImpl$refreshToken$1;->d:I

    .line 81
    .line 82
    const-wide/16 v4, 0x64

    .line 83
    .line 84
    invoke-static {v4, v5, v0}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    if-ne p2, v1, :cond_3

    .line 89
    .line 90
    return-object v1

    .line 91
    :cond_4
    new-instance p2, Ljava/lang/StringBuffer;

    .line 92
    .line 93
    invoke-direct {p2}, Ljava/lang/StringBuffer;-><init>()V

    .line 94
    .line 95
    .line 96
    iput-object p2, p0, Lcom/zykj/evaluation/network/RefreshRepositoryImpl;->c:Ljava/lang/StringBuffer;

    .line 97
    .line 98
    iget-object p2, p0, Lcom/zykj/evaluation/network/RefreshRepositoryImpl;->a:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 99
    .line 100
    invoke-interface {p2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    check-cast p2, Lcom/zykj/http/bean/HeaderBean;

    .line 105
    .line 106
    invoke-virtual {p2}, Lcom/zykj/http/bean/HeaderBean;->getAccessToken()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    if-eqz v0, :cond_6

    .line 111
    .line 112
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-nez v0, :cond_5

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_5
    invoke-virtual {p2}, Lcom/zykj/http/bean/HeaderBean;->getAccessToken()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    if-nez p1, :cond_6

    .line 132
    .line 133
    iget-object p1, p0, Lcom/zykj/evaluation/network/RefreshRepositoryImpl;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 134
    .line 135
    invoke-virtual {p1, v3, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 136
    .line 137
    .line 138
    invoke-virtual {p2}, Lcom/zykj/http/bean/HeaderBean;->getAccessToken()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    return-object p1

    .line 147
    :cond_6
    :goto_2
    sget-object p1, Lcom/zykj/message/client/MessageClient;->a:Lcom/zykj/message/client/MessageClient;

    .line 148
    .line 149
    new-instance p2, Lp5/o;

    .line 150
    .line 151
    invoke-direct {p2, p0}, Lp5/o;-><init>(Lcom/zykj/evaluation/network/RefreshRepositoryImpl;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1, p2}, Lcom/zykj/message/client/MessageClient;->r(Lkotlin/jvm/functions/Function1;)V

    .line 155
    .line 156
    .line 157
    :cond_7
    iget-object p1, p0, Lcom/zykj/evaluation/network/RefreshRepositoryImpl;->c:Ljava/lang/StringBuffer;

    .line 158
    .line 159
    invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    const-string p2, "toString(...)"

    .line 164
    .line 165
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    return-object p1
.end method
