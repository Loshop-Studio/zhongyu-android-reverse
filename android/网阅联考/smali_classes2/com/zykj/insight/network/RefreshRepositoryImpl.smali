.class public final Lcom/zykj/insight/network/RefreshRepositoryImpl;
.super Lr1/a;
.source "SourceFile"


# instance fields
.field public final a:Lcom/zykj/http/bean/HeaderLiveData;

.field public final b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public c:Ljava/lang/StringBuffer;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/http/bean/HeaderLiveData;)V
    .locals 1

    .line 1
    const-string v0, "headerLiveData"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lr1/a;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/insight/network/RefreshRepositoryImpl;->a:Lcom/zykj/http/bean/HeaderLiveData;

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
    iput-object p1, p0, Lcom/zykj/insight/network/RefreshRepositoryImpl;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 18
    .line 19
    new-instance p1, Ljava/lang/StringBuffer;

    .line 20
    .line 21
    invoke-direct {p1}, Ljava/lang/StringBuffer;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lcom/zykj/insight/network/RefreshRepositoryImpl;->c:Ljava/lang/StringBuffer;

    .line 25
    .line 26
    return-void
.end method

.method public static final synthetic b(Lcom/zykj/insight/network/RefreshRepositoryImpl;)Ljava/lang/StringBuffer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/insight/network/RefreshRepositoryImpl;->c:Ljava/lang/StringBuffer;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic c(Lcom/zykj/insight/network/RefreshRepositoryImpl;)Lcom/zykj/http/bean/HeaderLiveData;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/insight/network/RefreshRepositoryImpl;->a:Lcom/zykj/http/bean/HeaderLiveData;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic d(Lcom/zykj/insight/network/RefreshRepositoryImpl;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/insight/network/RefreshRepositoryImpl;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public a(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, Lcom/zykj/insight/network/RefreshRepositoryImpl$refreshToken$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/insight/network/RefreshRepositoryImpl$refreshToken$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/insight/network/RefreshRepositoryImpl$refreshToken$1;->d:I

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
    iput v1, v0, Lcom/zykj/insight/network/RefreshRepositoryImpl$refreshToken$1;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/insight/network/RefreshRepositoryImpl$refreshToken$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/insight/network/RefreshRepositoryImpl$refreshToken$1;-><init>(Lcom/zykj/insight/network/RefreshRepositoryImpl;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/insight/network/RefreshRepositoryImpl$refreshToken$1;->b:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/insight/network/RefreshRepositoryImpl$refreshToken$1;->d:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v4, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    iget-object v0, v0, Lcom/zykj/insight/network/RefreshRepositoryImpl$refreshToken$1;->a:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Lcom/zykj/insight/network/RefreshRepositoryImpl;

    .line 44
    .line 45
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto/16 :goto_2

    .line 49
    .line 50
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p1

    .line 58
    :cond_2
    iget-object v2, v0, Lcom/zykj/insight/network/RefreshRepositoryImpl$refreshToken$1;->a:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v2, Lcom/zykj/insight/network/RefreshRepositoryImpl;

    .line 61
    .line 62
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Lcom/zykj/insight/network/RefreshRepositoryImpl;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-eqz p1, :cond_5

    .line 76
    .line 77
    move-object v2, p0

    .line 78
    :cond_4
    :goto_1
    iget-object p1, v2, Lcom/zykj/insight/network/RefreshRepositoryImpl;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_7

    .line 85
    .line 86
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    new-instance v3, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string p1, " token\u6b63\u5728\u83b7\u53d6\u4e2d"

    .line 99
    .line 100
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    iput-object v2, v0, Lcom/zykj/insight/network/RefreshRepositoryImpl$refreshToken$1;->a:Ljava/lang/Object;

    .line 104
    .line 105
    iput v4, v0, Lcom/zykj/insight/network/RefreshRepositoryImpl$refreshToken$1;->d:I

    .line 106
    .line 107
    const-wide/16 v5, 0x3e8

    .line 108
    .line 109
    invoke-static {v5, v6, v0}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    if-ne p1, v1, :cond_4

    .line 114
    .line 115
    return-object v1

    .line 116
    :cond_5
    iget-object p1, p0, Lcom/zykj/insight/network/RefreshRepositoryImpl;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 117
    .line 118
    const/4 v2, 0x0

    .line 119
    invoke-virtual {p1, v2, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 120
    .line 121
    .line 122
    new-instance p1, Ljava/lang/StringBuffer;

    .line 123
    .line 124
    invoke-direct {p1}, Ljava/lang/StringBuffer;-><init>()V

    .line 125
    .line 126
    .line 127
    iput-object p1, p0, Lcom/zykj/insight/network/RefreshRepositoryImpl;->c:Ljava/lang/StringBuffer;

    .line 128
    .line 129
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    new-instance v2, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    const-string p1, "  \u6b63\u5728\u83b7\u53d6token"

    .line 142
    .line 143
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    new-instance v2, Lcom/zykj/insight/network/RefreshRepositoryImpl$refreshToken$2;

    .line 151
    .line 152
    const/4 v4, 0x0

    .line 153
    invoke-direct {v2, p0, v4}, Lcom/zykj/insight/network/RefreshRepositoryImpl$refreshToken$2;-><init>(Lcom/zykj/insight/network/RefreshRepositoryImpl;Lkotlin/coroutines/Continuation;)V

    .line 154
    .line 155
    .line 156
    iput-object p0, v0, Lcom/zykj/insight/network/RefreshRepositoryImpl$refreshToken$1;->a:Ljava/lang/Object;

    .line 157
    .line 158
    iput v3, v0, Lcom/zykj/insight/network/RefreshRepositoryImpl$refreshToken$1;->d:I

    .line 159
    .line 160
    invoke-static {p1, v2, v0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    if-ne p1, v1, :cond_6

    .line 165
    .line 166
    return-object v1

    .line 167
    :cond_6
    move-object v0, p0

    .line 168
    :goto_2
    move-object v2, v0

    .line 169
    :cond_7
    iget-object p1, v2, Lcom/zykj/insight/network/RefreshRepositoryImpl;->c:Ljava/lang/StringBuffer;

    .line 170
    .line 171
    invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    const-string v0, "accessToken.toString()"

    .line 176
    .line 177
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    return-object p1
.end method
