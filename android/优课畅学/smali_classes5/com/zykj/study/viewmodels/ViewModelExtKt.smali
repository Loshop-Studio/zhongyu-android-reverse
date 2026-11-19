.class public abstract Lcom/zykj/study/viewmodels/ViewModelExtKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lcom/zykj/base/BaseViewModel;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;Lx7/l;Lm7/c;)Ljava/lang/Object;
    .locals 14

    .line 1
    move-object/from16 v1, p2

    .line 2
    .line 3
    move-object/from16 v0, p5

    .line 4
    .line 5
    instance-of v2, v0, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchAsyncData$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchAsyncData$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchAsyncData$1;->h:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchAsyncData$1;->h:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchAsyncData$1;

    .line 25
    .line 26
    invoke-direct {v2, v0}, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchAsyncData$1;-><init>(Lm7/c;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchAsyncData$1;->g:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget v4, v2, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchAsyncData$1;->h:I

    .line 36
    .line 37
    const/4 v5, 0x0

    .line 38
    const/4 v6, 0x0

    .line 39
    const/4 v7, 0x1

    .line 40
    if-eqz v4, :cond_2

    .line 41
    .line 42
    if-ne v4, v7, :cond_1

    .line 43
    .line 44
    iget-object p0, v2, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchAsyncData$1;->f:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p0, Li8/e0;

    .line 47
    .line 48
    iget-object p0, v2, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchAsyncData$1;->e:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p0, Lx7/l;

    .line 51
    .line 52
    iget-object p1, v2, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchAsyncData$1;->d:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p1, Lx7/p;

    .line 55
    .line 56
    iget-object p1, v2, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchAsyncData$1;->c:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p1, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 59
    .line 60
    iget-object v1, v2, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchAsyncData$1;->b:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v1, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 63
    .line 64
    iget-object v2, v2, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchAsyncData$1;->a:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v2, Lcom/zykj/base/BaseViewModel;

    .line 67
    .line 68
    :try_start_0
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :catchall_0
    move-exception v0

    .line 73
    move-object v8, v1

    .line 74
    move-object v1, p1

    .line 75
    move-object p1, v8

    .line 76
    move-object v8, p0

    .line 77
    move-object p0, v2

    .line 78
    goto :goto_2

    .line 79
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 80
    .line 81
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 82
    .line 83
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p0

    .line 87
    :cond_2
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    if-eqz v1, :cond_3

    .line 91
    .line 92
    invoke-static {v7}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v1, v0}, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;->setValue(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :cond_3
    :try_start_1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Li8/b0;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    new-instance v11, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchAsyncData$async$1;

    .line 104
    .line 105
    move-object/from16 v0, p3

    .line 106
    .line 107
    invoke-direct {v11, v0, v5}, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchAsyncData$async$1;-><init>(Lx7/p;Lm7/c;)V

    .line 108
    .line 109
    .line 110
    const/4 v12, 0x3

    .line 111
    const/4 v13, 0x0

    .line 112
    const/4 v9, 0x0

    .line 113
    const/4 v10, 0x0

    .line 114
    invoke-static/range {v8 .. v13}, Li8/f;->b(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Li8/e0;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    iput-object p0, v2, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchAsyncData$1;->a:Ljava/lang/Object;

    .line 119
    .line 120
    iput-object p1, v2, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchAsyncData$1;->b:Ljava/lang/Object;

    .line 121
    .line 122
    iput-object v1, v2, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchAsyncData$1;->c:Ljava/lang/Object;

    .line 123
    .line 124
    invoke-static {v0}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    iput-object v0, v2, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchAsyncData$1;->d:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 129
    .line 130
    move-object/from16 v8, p4

    .line 131
    .line 132
    :try_start_2
    iput-object v8, v2, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchAsyncData$1;->e:Ljava/lang/Object;

    .line 133
    .line 134
    invoke-static {v4}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    iput-object v0, v2, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchAsyncData$1;->f:Ljava/lang/Object;

    .line 139
    .line 140
    iput v7, v2, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchAsyncData$1;->h:I

    .line 141
    .line 142
    invoke-interface {v4, v2}, Li8/e0;->u(Lm7/c;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 146
    if-ne v0, v3, :cond_4

    .line 147
    .line 148
    return-object v3

    .line 149
    :cond_4
    move-object p1, v1

    .line 150
    :goto_1
    if-eqz p1, :cond_5

    .line 151
    .line 152
    invoke-static {v6}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    invoke-virtual {p1, p0}, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;->setValue(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    :cond_5
    return-object v0

    .line 160
    :catchall_1
    move-exception v0

    .line 161
    goto :goto_2

    .line 162
    :catchall_2
    move-exception v0

    .line 163
    move-object/from16 v8, p4

    .line 164
    .line 165
    :goto_2
    :try_start_3
    invoke-interface {v8, v0}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    check-cast v2, Ljava/lang/Boolean;

    .line 170
    .line 171
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    if-eqz v2, :cond_6

    .line 176
    .line 177
    invoke-virtual {p0, v0, p1}, Lcom/zykj/base/BaseViewModel;->handlerThrowable(Ljava/lang/Throwable;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 178
    .line 179
    .line 180
    goto :goto_3

    .line 181
    :catchall_3
    move-exception v0

    .line 182
    move-object p0, v0

    .line 183
    goto :goto_4

    .line 184
    :cond_6
    :goto_3
    if-eqz v1, :cond_7

    .line 185
    .line 186
    invoke-static {v6}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    invoke-virtual {v1, p0}, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;->setValue(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    :cond_7
    return-object v5

    .line 194
    :goto_4
    if-eqz v1, :cond_8

    .line 195
    .line 196
    invoke-static {v6}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    invoke-virtual {v1, p1}, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;->setValue(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    :cond_8
    throw p0
.end method

.method public static final b(Lcom/zykj/base/BaseViewModel;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;Lx7/q;)Lkotlinx/coroutines/n;
    .locals 9

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "block"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "error"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Li8/b0;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    new-instance v2, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchData$1;

    .line 21
    .line 22
    const/4 v8, 0x0

    .line 23
    move-object v6, p0

    .line 24
    move-object v7, p1

    .line 25
    move-object v3, p2

    .line 26
    move-object v4, p3

    .line 27
    move-object v5, p4

    .line 28
    invoke-direct/range {v2 .. v8}, Lcom/zykj/study/viewmodels/ViewModelExtKt$launchData$1;-><init>(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;Lx7/q;Lcom/zykj/base/BaseViewModel;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lm7/c;)V

    .line 29
    .line 30
    .line 31
    const/4 v5, 0x3

    .line 32
    const/4 v6, 0x0

    .line 33
    move-object v4, v2

    .line 34
    const/4 v2, 0x0

    .line 35
    const/4 v3, 0x0

    .line 36
    invoke-static/range {v1 .. v6}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method

.method public static synthetic c(Lcom/zykj/base/BaseViewModel;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;Lx7/q;ILjava/lang/Object;)Lkotlinx/coroutines/n;
    .locals 1

    .line 1
    and-int/lit8 p6, p5, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p6, :cond_0

    .line 5
    .line 6
    move-object p1, v0

    .line 7
    :cond_0
    and-int/lit8 p5, p5, 0x2

    .line 8
    .line 9
    if-eqz p5, :cond_1

    .line 10
    .line 11
    move-object p2, v0

    .line 12
    :cond_1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/study/viewmodels/ViewModelExtKt;->b(Lcom/zykj/base/BaseViewModel;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;Lx7/q;)Lkotlinx/coroutines/n;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method
