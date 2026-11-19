.class final Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;->f0()V
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
    c = "com.zykj.student.dialogue.ui.detail.NewAnswerFragment$uploadFile$1"
    f = "NewAnswerFragment.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1
    }
    l = {
        0x115,
        0x117
    }
    m = "invokeSuspend"
    n = {
        "$this$launch",
        "imageUrlSet",
        "$this$launch",
        "imageUrlSet"
    }
    s = {
        "L$0",
        "L$1",
        "L$0",
        "L$1"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1;->d:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method public static synthetic a(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1;->c(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V

    return-void
.end method

.method public static final c(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;->H(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->dismiss()V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance v0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1;

    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1;->d:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    invoke-direct {v0, v1, p2}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1;-><init>(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkotlinx/coroutines/CoroutineScope;

    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v2, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1;->b:I

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x2

    .line 13
    const/4 v5, 0x1

    .line 14
    if-eqz v2, :cond_2

    .line 15
    .line 16
    if-eq v2, v5, :cond_1

    .line 17
    .line 18
    if-ne v2, v4, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1;->a:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ljava/util/LinkedHashSet;

    .line 23
    .line 24
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    goto/16 :goto_3

    .line 28
    .line 29
    :catch_0
    move-exception p1

    .line 30
    goto/16 :goto_2

    .line 31
    .line 32
    :catch_1
    move-exception p1

    .line 33
    goto/16 :goto_4

    .line 34
    .line 35
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 36
    .line 37
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 38
    .line 39
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p1

    .line 43
    :cond_1
    iget-object v2, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1;->a:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v2, Ljava/util/LinkedHashSet;

    .line 46
    .line 47
    :try_start_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 48
    .line 49
    .line 50
    goto/16 :goto_0

    .line 51
    .line 52
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :try_start_2
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 56
    .line 57
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1;->d:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    .line 61
    .line 62
    new-instance v6, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 63
    .line 64
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    invoke-direct {v6, v7}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;-><init>(Landroid/content/Context;)V

    .line 69
    .line 70
    .line 71
    const-string v7, "\u6b63\u5728\u4e0a\u4f20"

    .line 72
    .line 73
    invoke-virtual {v6, v7}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->f(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    sget-object v7, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->b:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 78
    .line 79
    invoke-virtual {v6, v7}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->g(Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    const/16 v7, 0x64

    .line 84
    .line 85
    const/4 v8, 0x0

    .line 86
    invoke-virtual {v6, v8, v7, v5}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->m(ZIZ)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    invoke-virtual {v6, v8}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->c(Z)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    invoke-virtual {v6}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->n()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    const-string v7, "show(...)"

    .line 99
    .line 100
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-static {p1, v6}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;->F(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;)V

    .line 104
    .line 105
    .line 106
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1;->d:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    .line 107
    .line 108
    new-instance v6, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 109
    .line 110
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    invoke-direct {v6, v7}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;-><init>(Landroid/content/Context;)V

    .line 115
    .line 116
    .line 117
    const-string v7, "\u63d0\u793a"

    .line 118
    .line 119
    invoke-virtual {v6, v7}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->o(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    const-string v7, "\u7f51\u7edc\u8d85\u65f6\uff0c\u63d0\u4ea4\u5931\u8d25"

    .line 124
    .line 125
    invoke-virtual {v6, v7}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->f(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    const-string v7, "\u91cd\u8bd5"

    .line 130
    .line 131
    invoke-virtual {v6, v7}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->k(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    invoke-virtual {v6, v5}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->c(Z)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    iget-object v7, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1;->d:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    .line 140
    .line 141
    new-instance v8, Lcom/zykj/student/dialogue/ui/detail/m;

    .line 142
    .line 143
    invoke-direct {v8, v7}, Lcom/zykj/student/dialogue/ui/detail/m;-><init>(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v6, v8}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->j(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$h;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    invoke-virtual {v6}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->a()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    const-string v7, "build(...)"

    .line 155
    .line 156
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    invoke-static {p1, v6}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;->E(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;)V

    .line 160
    .line 161
    .line 162
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1;->d:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    .line 163
    .line 164
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;->z(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;)Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    iget-object v6, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1;->d:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    .line 169
    .line 170
    invoke-static {v6}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;->A(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;)Lcom/zykj/view/board/board/BoardFragment;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    if-nez v6, :cond_3

    .line 175
    .line 176
    const-string v6, "sketchFragment"

    .line 177
    .line 178
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    move-object v6, v3

    .line 182
    :cond_3
    invoke-virtual {v6}, Lcom/zykj/view/board/board/BoardFragment;->t0()Ljava/util/List;

    .line 183
    .line 184
    .line 185
    move-result-object v6

    .line 186
    iput-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1;->c:Ljava/lang/Object;

    .line 187
    .line 188
    iput-object v2, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1;->a:Ljava/lang/Object;

    .line 189
    .line 190
    iput v5, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1;->b:I

    .line 191
    .line 192
    invoke-virtual {p1, v6, p0}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;->v(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    if-ne p1, v1, :cond_4

    .line 197
    .line 198
    goto :goto_1

    .line 199
    :cond_4
    :goto_0
    check-cast p1, Lkotlinx/coroutines/flow/Flow;

    .line 200
    .line 201
    new-instance v5, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2;

    .line 202
    .line 203
    iget-object v6, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1;->d:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    .line 204
    .line 205
    invoke-direct {v5, v0, v6, v2, v3}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2;-><init>(Lkotlinx/coroutines/CoroutineScope;Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;Ljava/util/LinkedHashSet;Lkotlin/coroutines/Continuation;)V

    .line 206
    .line 207
    .line 208
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    iput-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1;->c:Ljava/lang/Object;

    .line 213
    .line 214
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    iput-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1;->a:Ljava/lang/Object;

    .line 219
    .line 220
    iput v4, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1;->b:I

    .line 221
    .line 222
    invoke-static {p1, v5, p0}, Lkotlinx/coroutines/flow/FlowKt;->first(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object p1
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 226
    if-ne p1, v1, :cond_5

    .line 227
    .line 228
    :goto_1
    return-object v1

    .line 229
    :goto_2
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1;->d:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    .line 230
    .line 231
    invoke-static {v0}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;->t(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;)V

    .line 232
    .line 233
    .line 234
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1;->d:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    .line 235
    .line 236
    invoke-static {v0, p1}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;->G(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;Ljava/lang/Throwable;)V

    .line 237
    .line 238
    .line 239
    :cond_5
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 240
    .line 241
    return-object p1

    .line 242
    :goto_4
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1;->d:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    .line 243
    .line 244
    invoke-static {v0}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;->t(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;)V

    .line 245
    .line 246
    .line 247
    throw p1
.end method
