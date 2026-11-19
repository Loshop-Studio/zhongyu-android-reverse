.class final Landroidx/paging/SingleRunner$Holder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/paging/SingleRunner;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Holder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\u0008\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0086@\u00a2\u0006\u0002\u0010\u0010J\u001e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\nH\u0086@\u00a2\u0006\u0002\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Landroidx/paging/SingleRunner$Holder;",
        "",
        "singleRunner",
        "Landroidx/paging/SingleRunner;",
        "cancelPreviousInEqualPriority",
        "",
        "(Landroidx/paging/SingleRunner;Z)V",
        "mutex",
        "Lkotlinx/coroutines/sync/Mutex;",
        "previous",
        "Lkotlinx/coroutines/Job;",
        "previousPriority",
        "",
        "onFinish",
        "",
        "job",
        "(Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "tryEnqueue",
        "priority",
        "(ILkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "paging-common_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSingleRunner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleRunner.kt\nandroidx/paging/SingleRunner$Holder\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,125:1\n120#2,10:126\n120#2,10:136\n*S KotlinDebug\n*F\n+ 1 SingleRunner.kt\nandroidx/paging/SingleRunner$Holder\n*L\n94#1:126,10\n113#1:136,10\n*E\n"
    }
.end annotation


# instance fields
.field private final cancelPreviousInEqualPriority:Z

.field private final mutex:Lkotlinx/coroutines/sync/Mutex;

.field private previous:Lkotlinx/coroutines/Job;

.field private previousPriority:I

.field private final singleRunner:Landroidx/paging/SingleRunner;


# direct methods
.method public constructor <init>(Landroidx/paging/SingleRunner;Z)V
    .locals 1

    .line 1
    const-string v0, "singleRunner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Landroidx/paging/SingleRunner$Holder;->singleRunner:Landroidx/paging/SingleRunner;

    .line 10
    .line 11
    iput-boolean p2, p0, Landroidx/paging/SingleRunner$Holder;->cancelPreviousInEqualPriority:Z

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    const/4 p2, 0x0

    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-static {v0, p1, p2}, Lkotlinx/coroutines/sync/MutexKt;->Mutex$default(ZILjava/lang/Object;)Lkotlinx/coroutines/sync/Mutex;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Landroidx/paging/SingleRunner$Holder;->mutex:Lkotlinx/coroutines/sync/Mutex;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final onFinish(Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/Job;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Landroidx/paging/SingleRunner$Holder$onFinish$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Landroidx/paging/SingleRunner$Holder$onFinish$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/paging/SingleRunner$Holder$onFinish$1;->label:I

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
    iput v1, v0, Landroidx/paging/SingleRunner$Holder$onFinish$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/paging/SingleRunner$Holder$onFinish$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Landroidx/paging/SingleRunner$Holder$onFinish$1;-><init>(Landroidx/paging/SingleRunner$Holder;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Landroidx/paging/SingleRunner$Holder$onFinish$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/paging/SingleRunner$Holder$onFinish$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    const/4 v4, 0x0

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget-object p1, v0, Landroidx/paging/SingleRunner$Holder$onFinish$1;->L$2:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Lkotlinx/coroutines/sync/Mutex;

    .line 42
    .line 43
    iget-object v1, v0, Landroidx/paging/SingleRunner$Holder$onFinish$1;->L$1:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, Lkotlinx/coroutines/Job;

    .line 46
    .line 47
    iget-object v0, v0, Landroidx/paging/SingleRunner$Holder$onFinish$1;->L$0:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Landroidx/paging/SingleRunner$Holder;

    .line 50
    .line 51
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    move-object p2, p1

    .line 55
    move-object p1, v1

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p1

    .line 65
    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iget-object p2, p0, Landroidx/paging/SingleRunner$Holder;->mutex:Lkotlinx/coroutines/sync/Mutex;

    .line 69
    .line 70
    iput-object p0, v0, Landroidx/paging/SingleRunner$Holder$onFinish$1;->L$0:Ljava/lang/Object;

    .line 71
    .line 72
    iput-object p1, v0, Landroidx/paging/SingleRunner$Holder$onFinish$1;->L$1:Ljava/lang/Object;

    .line 73
    .line 74
    iput-object p2, v0, Landroidx/paging/SingleRunner$Holder$onFinish$1;->L$2:Ljava/lang/Object;

    .line 75
    .line 76
    iput v3, v0, Landroidx/paging/SingleRunner$Holder$onFinish$1;->label:I

    .line 77
    .line 78
    invoke-interface {p2, v4, v0}, Lkotlinx/coroutines/sync/Mutex;->lock(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    if-ne v0, v1, :cond_3

    .line 83
    .line 84
    return-object v1

    .line 85
    :cond_3
    move-object v0, p0

    .line 86
    :goto_1
    :try_start_0
    iget-object v1, v0, Landroidx/paging/SingleRunner$Holder;->previous:Lkotlinx/coroutines/Job;

    .line 87
    .line 88
    if-ne p1, v1, :cond_4

    .line 89
    .line 90
    iput-object v4, v0, Landroidx/paging/SingleRunner$Holder;->previous:Lkotlinx/coroutines/Job;

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :catchall_0
    move-exception p1

    .line 94
    goto :goto_3

    .line 95
    :cond_4
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    .line 97
    invoke-interface {p2, v4}, Lkotlinx/coroutines/sync/Mutex;->unlock(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 101
    .line 102
    return-object p1

    .line 103
    :goto_3
    invoke-interface {p2, v4}, Lkotlinx/coroutines/sync/Mutex;->unlock(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    throw p1
.end method

.method public final tryEnqueue(ILkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lkotlinx/coroutines/Job;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p3, Landroidx/paging/SingleRunner$Holder$tryEnqueue$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Landroidx/paging/SingleRunner$Holder$tryEnqueue$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/paging/SingleRunner$Holder$tryEnqueue$1;->label:I

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
    iput v1, v0, Landroidx/paging/SingleRunner$Holder$tryEnqueue$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/paging/SingleRunner$Holder$tryEnqueue$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Landroidx/paging/SingleRunner$Holder$tryEnqueue$1;-><init>(Landroidx/paging/SingleRunner$Holder;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Landroidx/paging/SingleRunner$Holder$tryEnqueue$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/paging/SingleRunner$Holder$tryEnqueue$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    const/4 v5, 0x0

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v4, :cond_2

    .line 39
    .line 40
    if-ne v2, v3, :cond_1

    .line 41
    .line 42
    iget p1, v0, Landroidx/paging/SingleRunner$Holder$tryEnqueue$1;->I$0:I

    .line 43
    .line 44
    iget-object p2, v0, Landroidx/paging/SingleRunner$Holder$tryEnqueue$1;->L$2:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p2, Lkotlinx/coroutines/sync/Mutex;

    .line 47
    .line 48
    iget-object v1, v0, Landroidx/paging/SingleRunner$Holder$tryEnqueue$1;->L$1:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, Lkotlinx/coroutines/Job;

    .line 51
    .line 52
    iget-object v0, v0, Landroidx/paging/SingleRunner$Holder$tryEnqueue$1;->L$0:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, Landroidx/paging/SingleRunner$Holder;

    .line 55
    .line 56
    :try_start_0
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    .line 59
    goto/16 :goto_4

    .line 60
    .line 61
    :catchall_0
    move-exception p1

    .line 62
    goto/16 :goto_6

    .line 63
    .line 64
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 65
    .line 66
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 67
    .line 68
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw p1

    .line 72
    :cond_2
    iget p1, v0, Landroidx/paging/SingleRunner$Holder$tryEnqueue$1;->I$0:I

    .line 73
    .line 74
    iget-object p2, v0, Landroidx/paging/SingleRunner$Holder$tryEnqueue$1;->L$2:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p2, Lkotlinx/coroutines/sync/Mutex;

    .line 77
    .line 78
    iget-object v2, v0, Landroidx/paging/SingleRunner$Holder$tryEnqueue$1;->L$1:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v2, Lkotlinx/coroutines/Job;

    .line 81
    .line 82
    iget-object v6, v0, Landroidx/paging/SingleRunner$Holder$tryEnqueue$1;->L$0:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v6, Landroidx/paging/SingleRunner$Holder;

    .line 85
    .line 86
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    iget-object p3, p0, Landroidx/paging/SingleRunner$Holder;->mutex:Lkotlinx/coroutines/sync/Mutex;

    .line 94
    .line 95
    iput-object p0, v0, Landroidx/paging/SingleRunner$Holder$tryEnqueue$1;->L$0:Ljava/lang/Object;

    .line 96
    .line 97
    iput-object p2, v0, Landroidx/paging/SingleRunner$Holder$tryEnqueue$1;->L$1:Ljava/lang/Object;

    .line 98
    .line 99
    iput-object p3, v0, Landroidx/paging/SingleRunner$Holder$tryEnqueue$1;->L$2:Ljava/lang/Object;

    .line 100
    .line 101
    iput p1, v0, Landroidx/paging/SingleRunner$Holder$tryEnqueue$1;->I$0:I

    .line 102
    .line 103
    iput v4, v0, Landroidx/paging/SingleRunner$Holder$tryEnqueue$1;->label:I

    .line 104
    .line 105
    invoke-interface {p3, v5, v0}, Lkotlinx/coroutines/sync/Mutex;->lock(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    if-ne v2, v1, :cond_4

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_4
    move-object v6, p0

    .line 113
    move-object v2, p2

    .line 114
    move-object p2, p3

    .line 115
    :goto_1
    :try_start_1
    iget-object p3, v6, Landroidx/paging/SingleRunner$Holder;->previous:Lkotlinx/coroutines/Job;

    .line 116
    .line 117
    if-eqz p3, :cond_6

    .line 118
    .line 119
    invoke-interface {p3}, Lkotlinx/coroutines/Job;->isActive()Z

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    if-eqz v7, :cond_6

    .line 124
    .line 125
    iget v7, v6, Landroidx/paging/SingleRunner$Holder;->previousPriority:I

    .line 126
    .line 127
    if-lt v7, p1, :cond_6

    .line 128
    .line 129
    if-ne v7, p1, :cond_5

    .line 130
    .line 131
    iget-boolean v7, v6, Landroidx/paging/SingleRunner$Holder;->cancelPreviousInEqualPriority:Z

    .line 132
    .line 133
    if-eqz v7, :cond_5

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_5
    const/4 v4, 0x0

    .line 137
    goto :goto_5

    .line 138
    :cond_6
    :goto_2
    if-eqz p3, :cond_7

    .line 139
    .line 140
    new-instance v7, Landroidx/paging/SingleRunner$CancelIsolatedRunnerException;

    .line 141
    .line 142
    iget-object v8, v6, Landroidx/paging/SingleRunner$Holder;->singleRunner:Landroidx/paging/SingleRunner;

    .line 143
    .line 144
    invoke-direct {v7, v8}, Landroidx/paging/SingleRunner$CancelIsolatedRunnerException;-><init>(Landroidx/paging/SingleRunner;)V

    .line 145
    .line 146
    .line 147
    invoke-interface {p3, v7}, Lkotlinx/coroutines/Job;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 148
    .line 149
    .line 150
    :cond_7
    if-eqz p3, :cond_9

    .line 151
    .line 152
    iput-object v6, v0, Landroidx/paging/SingleRunner$Holder$tryEnqueue$1;->L$0:Ljava/lang/Object;

    .line 153
    .line 154
    iput-object v2, v0, Landroidx/paging/SingleRunner$Holder$tryEnqueue$1;->L$1:Ljava/lang/Object;

    .line 155
    .line 156
    iput-object p2, v0, Landroidx/paging/SingleRunner$Holder$tryEnqueue$1;->L$2:Ljava/lang/Object;

    .line 157
    .line 158
    iput p1, v0, Landroidx/paging/SingleRunner$Holder$tryEnqueue$1;->I$0:I

    .line 159
    .line 160
    iput v3, v0, Landroidx/paging/SingleRunner$Holder$tryEnqueue$1;->label:I

    .line 161
    .line 162
    invoke-interface {p3, v0}, Lkotlinx/coroutines/Job;->join(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p3

    .line 166
    if-ne p3, v1, :cond_8

    .line 167
    .line 168
    :goto_3
    return-object v1

    .line 169
    :cond_8
    move-object v1, v2

    .line 170
    move-object v0, v6

    .line 171
    :goto_4
    move-object v6, v0

    .line 172
    move-object v2, v1

    .line 173
    :cond_9
    iput-object v2, v6, Landroidx/paging/SingleRunner$Holder;->previous:Lkotlinx/coroutines/Job;

    .line 174
    .line 175
    iput p1, v6, Landroidx/paging/SingleRunner$Holder;->previousPriority:I

    .line 176
    .line 177
    :goto_5
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 178
    .line 179
    .line 180
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 181
    invoke-interface {p2, v5}, Lkotlinx/coroutines/sync/Mutex;->unlock(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    return-object p1

    .line 185
    :goto_6
    invoke-interface {p2, v5}, Lkotlinx/coroutines/sync/Mutex;->unlock(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    throw p1
.end method
