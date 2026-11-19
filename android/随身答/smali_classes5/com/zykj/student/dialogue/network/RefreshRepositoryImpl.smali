.class public final Lcom/zykj/student/dialogue/network/RefreshRepositoryImpl;
.super Lz5/a;
.source "SourceFile"


# instance fields
.field public final a:Lcom/zykj/http/bean/HeaderLiveData;

.field public final b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public c:Ljava/lang/StringBuffer;


# direct methods
.method static constructor <clinit>()V
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
    invoke-direct {p0}, Lz5/a;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/student/dialogue/network/RefreshRepositoryImpl;->a:Lcom/zykj/http/bean/HeaderLiveData;

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
    iput-object p1, p0, Lcom/zykj/student/dialogue/network/RefreshRepositoryImpl;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 18
    .line 19
    new-instance p1, Ljava/lang/StringBuffer;

    .line 20
    .line 21
    invoke-direct {p1}, Ljava/lang/StringBuffer;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lcom/zykj/student/dialogue/network/RefreshRepositoryImpl;->c:Ljava/lang/StringBuffer;

    .line 25
    .line 26
    return-void
.end method

.method public static synthetic b(Lcom/zykj/student/dialogue/network/RefreshRepositoryImpl;Lcom/zykj/message/server/bean/ServerInfo;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/student/dialogue/network/RefreshRepositoryImpl;->c(Lcom/zykj/student/dialogue/network/RefreshRepositoryImpl;Lcom/zykj/message/server/bean/ServerInfo;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lcom/zykj/student/dialogue/network/RefreshRepositoryImpl;Lcom/zykj/message/server/bean/ServerInfo;)Lkotlin/Unit;
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    iget-object v1, p0, Lcom/zykj/student/dialogue/network/RefreshRepositoryImpl;->a:Lcom/zykj/http/bean/HeaderLiveData;

    .line 5
    .line 6
    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    move-object v2, v1

    .line 11
    check-cast v2, Lcom/zykj/http/bean/HeaderBean;

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/ServerInfo;->c()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v6

    .line 19
    const/16 v8, 0x17

    .line 20
    .line 21
    const/4 v9, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v4, 0x0

    .line 24
    const/4 v5, 0x0

    .line 25
    const/4 v7, 0x0

    .line 26
    invoke-static/range {v2 .. v9}, Lcom/zykj/http/bean/HeaderBean;->copy$default(Lcom/zykj/http/bean/HeaderBean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/zykj/http/bean/HeaderBean;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    iget-object v2, p0, Lcom/zykj/student/dialogue/network/RefreshRepositoryImpl;->a:Lcom/zykj/http/bean/HeaderLiveData;

    .line 33
    .line 34
    invoke-virtual {v2, v1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-object v1, p0, Lcom/zykj/student/dialogue/network/RefreshRepositoryImpl;->c:Ljava/lang/StringBuffer;

    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/ServerInfo;->c()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {v1, v0, p1}, Ljava/lang/StringBuffer;->insert(ILjava/lang/String;)Ljava/lang/StringBuffer;

    .line 44
    .line 45
    .line 46
    :cond_1
    iget-object p0, p0, Lcom/zykj/student/dialogue/network/RefreshRepositoryImpl;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 47
    .line 48
    const/4 p1, 0x1

    .line 49
    invoke-virtual {p0, p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 50
    .line 51
    .line 52
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 53
    .line 54
    return-object p0
.end method


# virtual methods
.method public a(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, Lcom/zykj/student/dialogue/network/RefreshRepositoryImpl$refreshToken$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/student/dialogue/network/RefreshRepositoryImpl$refreshToken$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/student/dialogue/network/RefreshRepositoryImpl$refreshToken$1;->c:I

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
    iput v1, v0, Lcom/zykj/student/dialogue/network/RefreshRepositoryImpl$refreshToken$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/student/dialogue/network/RefreshRepositoryImpl$refreshToken$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/student/dialogue/network/RefreshRepositoryImpl$refreshToken$1;-><init>(Lcom/zykj/student/dialogue/network/RefreshRepositoryImpl;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/student/dialogue/network/RefreshRepositoryImpl$refreshToken$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/student/dialogue/network/RefreshRepositoryImpl$refreshToken$1;->c:I

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
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lcom/zykj/student/dialogue/network/RefreshRepositoryImpl;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 54
    .line 55
    const/4 v2, 0x0

    .line 56
    invoke-virtual {p1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-nez p1, :cond_4

    .line 61
    .line 62
    :cond_3
    :goto_1
    iget-object p1, p0, Lcom/zykj/student/dialogue/network/RefreshRepositoryImpl;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_5

    .line 69
    .line 70
    iput v3, v0, Lcom/zykj/student/dialogue/network/RefreshRepositoryImpl$refreshToken$1;->c:I

    .line 71
    .line 72
    const-wide/16 v4, 0x12c

    .line 73
    .line 74
    invoke-static {v4, v5, v0}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    if-ne p1, v1, :cond_3

    .line 79
    .line 80
    return-object v1

    .line 81
    :cond_4
    new-instance p1, Ljava/lang/StringBuffer;

    .line 82
    .line 83
    invoke-direct {p1}, Ljava/lang/StringBuffer;-><init>()V

    .line 84
    .line 85
    .line 86
    iput-object p1, p0, Lcom/zykj/student/dialogue/network/RefreshRepositoryImpl;->c:Ljava/lang/StringBuffer;

    .line 87
    .line 88
    sget-object p1, Lcom/zykj/message/client/MessageClient;->a:Lcom/zykj/message/client/MessageClient;

    .line 89
    .line 90
    new-instance v0, Lk6/h;

    .line 91
    .line 92
    invoke-direct {v0, p0}, Lk6/h;-><init>(Lcom/zykj/student/dialogue/network/RefreshRepositoryImpl;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, v0}, Lcom/zykj/message/client/MessageClient;->n(Lkotlin/jvm/functions/Function1;)V

    .line 96
    .line 97
    .line 98
    :cond_5
    iget-object p1, p0, Lcom/zykj/student/dialogue/network/RefreshRepositoryImpl;->c:Ljava/lang/StringBuffer;

    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    const-string v0, "toString(...)"

    .line 105
    .line 106
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    return-object p1
.end method
