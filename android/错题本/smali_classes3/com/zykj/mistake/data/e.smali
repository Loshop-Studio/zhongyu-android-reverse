.class public abstract Lcom/zykj/mistake/data/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lr6/c;Lh6/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, Lcom/zykj/mistake/data/UiRequestRunnerKt$runApiRequest$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/mistake/data/UiRequestRunnerKt$runApiRequest$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/mistake/data/UiRequestRunnerKt$runApiRequest$1;->label:I

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
    iput v1, v0, Lcom/zykj/mistake/data/UiRequestRunnerKt$runApiRequest$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/mistake/data/UiRequestRunnerKt$runApiRequest$1;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Lcom/zykj/mistake/data/UiRequestRunnerKt$runApiRequest$1;-><init>(Lh6/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/mistake/data/UiRequestRunnerKt$runApiRequest$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lcom/zykj/mistake/data/UiRequestRunnerKt$runApiRequest$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, Lcom/zykj/mistake/data/UiRequestRunnerKt$runApiRequest$1;->L$0:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p0, Lr6/c;

    .line 39
    .line 40
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p0

    .line 52
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :try_start_1
    sget-object p1, Lkotlinx/coroutines/f0;->a:Lg7/e;

    .line 56
    .line 57
    sget-object p1, Lg7/d;->a:Lg7/d;

    .line 58
    .line 59
    new-instance v2, Lcom/zykj/mistake/data/UiRequestRunnerKt$runApiRequest$resp$1;

    .line 60
    .line 61
    const/4 v4, 0x0

    .line 62
    invoke-direct {v2, p0, v4}, Lcom/zykj/mistake/data/UiRequestRunnerKt$runApiRequest$resp$1;-><init>(Lr6/c;Lh6/c;)V

    .line 63
    .line 64
    .line 65
    iput-object v4, v0, Lcom/zykj/mistake/data/UiRequestRunnerKt$runApiRequest$1;->L$0:Ljava/lang/Object;

    .line 66
    .line 67
    iput v3, v0, Lcom/zykj/mistake/data/UiRequestRunnerKt$runApiRequest$1;->label:I

    .line 68
    .line 69
    invoke-static {p1, v2, v0}, Lkotlinx/coroutines/x;->F(Lh6/h;Lr6/e;Lh6/c;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    if-ne p1, v1, :cond_3

    .line 74
    .line 75
    return-object v1

    .line 76
    :cond_3
    :goto_1
    check-cast p1, Lcom/zykj/mistake/network/ApiResp;

    .line 77
    .line 78
    invoke-virtual {p1}, Lcom/zykj/mistake/network/ApiResp;->getUnAuthorizedRequest()Z

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    if-eqz p0, :cond_4

    .line 83
    .line 84
    sget-object p0, Lcom/zykj/mistake/data/b;->a:Lcom/zykj/mistake/data/b;

    .line 85
    .line 86
    invoke-virtual {p0}, Lcom/zykj/mistake/data/b;->a()V

    .line 87
    .line 88
    .line 89
    new-instance p0, Lcom/zykj/mistake/network/ApiException;

    .line 90
    .line 91
    invoke-virtual {p1}, Lcom/zykj/mistake/network/ApiResp;->getErrorCode()I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    invoke-virtual {p1}, Lcom/zykj/mistake/network/ApiResp;->getErrorMessage()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-direct {p0, v0, p1}, Lcom/zykj/mistake/network/ApiException;-><init>(ILjava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-static {p0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-static {p0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0

    .line 111
    :cond_4
    invoke-virtual {p1}, Lcom/zykj/mistake/network/ApiResp;->getSuccess()Z

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    if-eqz p0, :cond_5

    .line 116
    .line 117
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    return-object p0

    .line 122
    :cond_5
    new-instance p0, Lcom/zykj/mistake/network/ApiException;

    .line 123
    .line 124
    invoke-virtual {p1}, Lcom/zykj/mistake/network/ApiResp;->getErrorCode()I

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    invoke-virtual {p1}, Lcom/zykj/mistake/network/ApiResp;->getErrorMessage()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-direct {p0, v0, p1}, Lcom/zykj/mistake/network/ApiException;-><init>(ILjava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-static {p0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-static {p0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p0
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 143
    return-object p0

    .line 144
    :catchall_0
    move-exception p0

    .line 145
    goto :goto_2

    .line 146
    :catch_0
    move-exception p0

    .line 147
    goto :goto_3

    .line 148
    :goto_2
    instance-of p1, p0, Lretrofit2/HttpException;

    .line 149
    .line 150
    if-eqz p1, :cond_6

    .line 151
    .line 152
    move-object p1, p0

    .line 153
    check-cast p1, Lretrofit2/HttpException;

    .line 154
    .line 155
    invoke-virtual {p1}, Lretrofit2/HttpException;->code()I

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    const/16 v0, 0x191

    .line 160
    .line 161
    if-ne p1, v0, :cond_6

    .line 162
    .line 163
    sget-object p1, Lcom/zykj/mistake/data/b;->a:Lcom/zykj/mistake/data/b;

    .line 164
    .line 165
    invoke-virtual {p1}, Lcom/zykj/mistake/data/b;->a()V

    .line 166
    .line 167
    .line 168
    :cond_6
    invoke-static {p0}, Lcoil3/network/g;->n(Ljava/lang/Throwable;)Lcom/zykj/mistake/network/ApiException;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    invoke-static {p0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    invoke-static {p0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    return-object p0

    .line 181
    :goto_3
    throw p0
.end method

.method public static final b(Lr6/c;Lr6/c;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lcom/zykj/mistake/data/UiRequestRunnerKt$runApiRequest$2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/zykj/mistake/data/UiRequestRunnerKt$runApiRequest$2;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/mistake/data/UiRequestRunnerKt$runApiRequest$2;->label:I

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
    iput v1, v0, Lcom/zykj/mistake/data/UiRequestRunnerKt$runApiRequest$2;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/mistake/data/UiRequestRunnerKt$runApiRequest$2;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Lcom/zykj/mistake/data/UiRequestRunnerKt$runApiRequest$2;-><init>(Lh6/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/zykj/mistake/data/UiRequestRunnerKt$runApiRequest$2;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lcom/zykj/mistake/data/UiRequestRunnerKt$runApiRequest$2;->label:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, Lcom/zykj/mistake/data/UiRequestRunnerKt$runApiRequest$2;->L$1:Ljava/lang/Object;

    .line 37
    .line 38
    move-object p1, p0

    .line 39
    check-cast p1, Lr6/c;

    .line 40
    .line 41
    iget-object p0, v0, Lcom/zykj/mistake/data/UiRequestRunnerKt$runApiRequest$2;->L$0:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p0, Lr6/c;

    .line 44
    .line 45
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    check-cast p2, Lkotlin/Result;

    .line 49
    .line 50
    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p0

    .line 63
    :cond_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    const/4 p2, 0x0

    .line 67
    iput-object p2, v0, Lcom/zykj/mistake/data/UiRequestRunnerKt$runApiRequest$2;->L$0:Ljava/lang/Object;

    .line 68
    .line 69
    iput-object p1, v0, Lcom/zykj/mistake/data/UiRequestRunnerKt$runApiRequest$2;->L$1:Ljava/lang/Object;

    .line 70
    .line 71
    iput v3, v0, Lcom/zykj/mistake/data/UiRequestRunnerKt$runApiRequest$2;->label:I

    .line 72
    .line 73
    invoke-static {p0, v0}, Lcom/zykj/mistake/data/e;->a(Lr6/c;Lh6/c;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    if-ne p0, v1, :cond_3

    .line 78
    .line 79
    return-object v1

    .line 80
    :cond_3
    :goto_1
    invoke-static {p0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    if-nez p2, :cond_4

    .line 85
    .line 86
    check-cast p0, Lcom/zykj/mistake/network/ApiResp;

    .line 87
    .line 88
    :try_start_0
    invoke-interface {p1, p0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-static {p0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    return-object p0

    .line 97
    :catchall_0
    move-exception p0

    .line 98
    invoke-static {p0}, Lcoil3/network/g;->n(Ljava/lang/Throwable;)Lcom/zykj/mistake/network/ApiException;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-static {p0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-static {p0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0

    .line 111
    :catch_0
    move-exception p0

    .line 112
    throw p0

    .line 113
    :cond_4
    invoke-static {p2}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-static {p0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    return-object p0
.end method
