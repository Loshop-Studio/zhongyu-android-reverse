.class final Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1;->b(Lcom/liulishuo/okdownload/a;Lcom/liulishuo/okdownload/core/cause/EndCause;Ljava/lang/Exception;Lp1/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.student.dialogue.ui.detail.AnswerPagerFragment$download$2$1$taskEnd$1"
    f = "AnswerPagerFragment.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0x17a
    }
    m = "invokeSuspend"
    n = {
        "zipFile",
        "unpackFile",
        "$i$a$-let-AnswerPagerFragment$download$2$1$taskEnd$1$1",
        "$i$a$-runCatching-AnswerPagerFragment$download$2$1$taskEnd$1$1$1"
    }
    s = {
        "L$3",
        "L$4",
        "I$0",
        "I$1"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:I

.field public g:I

.field public h:I

.field public final synthetic i:Lcom/liulishuo/okdownload/core/cause/EndCause;

.field public final synthetic j:Lcom/liulishuo/okdownload/a;

.field public final synthetic k:Lkotlin/jvm/internal/Ref$ObjectRef;

.field public final synthetic l:Lcom/liulishuo/okdownload/a;

.field public final synthetic m:Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;


# direct methods
.method public constructor <init>(Lcom/liulishuo/okdownload/core/cause/EndCause;Lcom/liulishuo/okdownload/a;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/liulishuo/okdownload/a;Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1;->i:Lcom/liulishuo/okdownload/core/cause/EndCause;

    iput-object p2, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1;->j:Lcom/liulishuo/okdownload/a;

    iput-object p3, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1;->k:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p4, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1;->l:Lcom/liulishuo/okdownload/a;

    iput-object p5, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1;->m:Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7

    new-instance v0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1;

    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1;->i:Lcom/liulishuo/okdownload/core/cause/EndCause;

    iget-object v2, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1;->j:Lcom/liulishuo/okdownload/a;

    iget-object v3, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1;->k:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v4, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1;->l:Lcom/liulishuo/okdownload/a;

    iget-object v5, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1;->m:Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1;-><init>(Lcom/liulishuo/okdownload/core/cause/EndCause;Lcom/liulishuo/okdownload/a;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/liulishuo/okdownload/a;Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Lkotlin/coroutines/Continuation;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1;->h:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1;->e:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ljava/io/File;

    .line 17
    .line 18
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1;->d:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Ljava/io/File;

    .line 21
    .line 22
    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;

    .line 25
    .line 26
    iget-object v2, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, Lcom/liulishuo/okdownload/a;

    .line 29
    .line 30
    iget-object v5, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1;->a:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v5, Lcom/liulishuo/okdownload/a;

    .line 33
    .line 34
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception p1

    .line 39
    goto/16 :goto_1

    .line 40
    .line 41
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 42
    .line 43
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p1

    .line 49
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1;->i:Lcom/liulishuo/okdownload/core/cause/EndCause;

    .line 53
    .line 54
    sget-object v1, Lcom/liulishuo/okdownload/core/cause/EndCause;->a:Lcom/liulishuo/okdownload/core/cause/EndCause;

    .line 55
    .line 56
    if-ne p1, v1, :cond_8

    .line 57
    .line 58
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1;->j:Lcom/liulishuo/okdownload/a;

    .line 59
    .line 60
    invoke-virtual {p1}, Lcom/liulishuo/okdownload/a;->l()Ljava/io/File;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    if-eqz p1, :cond_8

    .line 65
    .line 66
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1;->k:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 67
    .line 68
    iget-object p1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 71
    .line 72
    if-eqz p1, :cond_2

    .line 73
    .line 74
    const/16 v1, 0x64

    .line 75
    .line 76
    invoke-virtual {p1, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->t(I)V

    .line 77
    .line 78
    .line 79
    :cond_2
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1;->j:Lcom/liulishuo/okdownload/a;

    .line 80
    .line 81
    invoke-virtual {p1}, Lcom/liulishuo/okdownload/a;->l()Ljava/io/File;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    if-eqz p1, :cond_a

    .line 86
    .line 87
    iget-object v5, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1;->l:Lcom/liulishuo/okdownload/a;

    .line 88
    .line 89
    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1;->j:Lcom/liulishuo/okdownload/a;

    .line 90
    .line 91
    iget-object v6, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1;->m:Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;

    .line 92
    .line 93
    :try_start_1
    sget-object v7, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 94
    .line 95
    new-instance v7, Ljava/io/File;

    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    invoke-static {p1}, Lkotlin/io/FilesKt;->getNameWithoutExtension(Ljava/io/File;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v9

    .line 105
    invoke-direct {v7, v8, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 109
    .line 110
    .line 111
    move-result-object v8

    .line 112
    new-instance v9, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1$1$1$1;

    .line 113
    .line 114
    invoke-direct {v9, p1, v7, v3}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1$1$1$1;-><init>(Ljava/io/File;Ljava/io/File;Lkotlin/coroutines/Continuation;)V

    .line 115
    .line 116
    .line 117
    iput-object v5, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1;->a:Ljava/lang/Object;

    .line 118
    .line 119
    iput-object v1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1;->b:Ljava/lang/Object;

    .line 120
    .line 121
    iput-object v6, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1;->c:Ljava/lang/Object;

    .line 122
    .line 123
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1;->d:Ljava/lang/Object;

    .line 124
    .line 125
    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    iput-object v7, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1;->e:Ljava/lang/Object;

    .line 130
    .line 131
    iput v4, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1;->f:I

    .line 132
    .line 133
    iput v4, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1;->g:I

    .line 134
    .line 135
    iput v2, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1;->h:I

    .line 136
    .line 137
    invoke-static {v8, v9, p0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 141
    if-ne v2, v0, :cond_3

    .line 142
    .line 143
    return-object v0

    .line 144
    :cond_3
    move-object v0, p1

    .line 145
    move-object p1, v2

    .line 146
    move-object v2, v1

    .line 147
    move-object v1, v6

    .line 148
    :goto_0
    :try_start_2
    check-cast p1, Ljava/util/List;

    .line 149
    .line 150
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 154
    goto :goto_2

    .line 155
    :catchall_1
    move-exception v0

    .line 156
    move-object v2, v0

    .line 157
    move-object v0, p1

    .line 158
    move-object p1, v2

    .line 159
    move-object v2, v1

    .line 160
    move-object v1, v6

    .line 161
    :goto_1
    sget-object v6, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 162
    .line 163
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    :goto_2
    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v6

    .line 175
    if-eqz v6, :cond_5

    .line 176
    .line 177
    move-object v6, p1

    .line 178
    check-cast v6, Ljava/util/List;

    .line 179
    .line 180
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 181
    .line 182
    .line 183
    if-eqz v5, :cond_4

    .line 184
    .line 185
    invoke-virtual {v5}, Lcom/liulishuo/okdownload/a;->b()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v6

    .line 189
    goto :goto_3

    .line 190
    :cond_4
    move-object v6, v3

    .line 191
    :goto_3
    invoke-virtual {v2}, Lcom/liulishuo/okdownload/a;->b()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v7

    .line 195
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v6

    .line 199
    if-eqz v6, :cond_5

    .line 200
    .line 201
    invoke-static {v1}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->w(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;)V

    .line 202
    .line 203
    .line 204
    :cond_5
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 205
    .line 206
    .line 207
    move-result-object v6

    .line 208
    if-eqz v6, :cond_7

    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 211
    .line 212
    .line 213
    if-eqz v5, :cond_6

    .line 214
    .line 215
    invoke-virtual {v5}, Lcom/liulishuo/okdownload/a;->b()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    :cond_6
    invoke-virtual {v2}, Lcom/liulishuo/okdownload/a;->b()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    if-eqz v0, :cond_7

    .line 228
    .line 229
    invoke-static {v1, v4}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->z(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Z)V

    .line 230
    .line 231
    .line 232
    :cond_7
    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    .line 233
    .line 234
    .line 235
    goto :goto_4

    .line 236
    :cond_8
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1;->l:Lcom/liulishuo/okdownload/a;

    .line 237
    .line 238
    if-eqz p1, :cond_9

    .line 239
    .line 240
    invoke-virtual {p1}, Lcom/liulishuo/okdownload/a;->b()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    :cond_9
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1;->j:Lcom/liulishuo/okdownload/a;

    .line 245
    .line 246
    invoke-virtual {p1}, Lcom/liulishuo/okdownload/a;->b()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result p1

    .line 254
    if-eqz p1, :cond_a

    .line 255
    .line 256
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1;->m:Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;

    .line 257
    .line 258
    invoke-static {p1, v4}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->z(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Z)V

    .line 259
    .line 260
    .line 261
    :cond_a
    :goto_4
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1;->k:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 262
    .line 263
    iget-object p1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 264
    .line 265
    check-cast p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 266
    .line 267
    if-eqz p1, :cond_b

    .line 268
    .line 269
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->dismiss()V

    .line 270
    .line 271
    .line 272
    :cond_b
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 273
    .line 274
    return-object p1
.end method
