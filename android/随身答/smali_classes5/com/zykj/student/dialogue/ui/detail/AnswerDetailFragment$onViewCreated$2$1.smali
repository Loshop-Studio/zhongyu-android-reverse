.class final Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lcom/zykj/student/dialogue/bean/resp/QuestionResp;",
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
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Lcom/zykj/student/dialogue/bean/resp/QuestionResp;"
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
    c = "com.zykj.student.dialogue.ui.detail.AnswerDetailFragment$onViewCreated$2$1"
    f = "AnswerDetailFragment.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAnswerDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnswerDetailFragment.kt\ncom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$2$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,302:1\n257#2,2:303\n257#2,2:305\n257#2,2:307\n*S KotlinDebug\n*F\n+ 1 AnswerDetailFragment.kt\ncom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$2$1\n*L\n131#1:303,2\n132#1:305,2\n133#1:307,2\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$2$1;->c:Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/zykj/student/dialogue/bean/resp/QuestionResp;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$2$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$2$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance v0, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$2$1;

    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$2$1;->c:Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;

    invoke-direct {v0, v1, p2}, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$2$1;-><init>(Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$2$1;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$2$1;->a(Lcom/zykj/student/dialogue/bean/resp/QuestionResp;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$2$1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;

    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$2$1;->a:I

    .line 9
    .line 10
    if-nez v1, :cond_a

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    if-eqz v0, :cond_9

    .line 16
    .line 17
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$2$1;->c:Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;

    .line 18
    .line 19
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;->m(Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;)Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/4 v2, 0x0

    .line 24
    const-string v3, "binding"

    .line 25
    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    move-object v1, v2

    .line 32
    :cond_0
    iget-object v1, v1, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;->m:Landroidx/appcompat/widget/AppCompatTextView;

    .line 33
    .line 34
    const-string v4, "tvUnderstood"

    .line 35
    .line 36
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const/4 v4, 0x0

    .line 40
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 41
    .line 42
    .line 43
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;->m(Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;)Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    if-nez v1, :cond_1

    .line 48
    .line 49
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    move-object v1, v2

    .line 53
    :cond_1
    iget-object v1, v1, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;->g:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 54
    .line 55
    const-string v5, "llClosedState"

    .line 56
    .line 57
    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->getClosed()Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    const/16 v6, 0x8

    .line 65
    .line 66
    if-eqz v5, :cond_2

    .line 67
    .line 68
    move v5, v4

    .line 69
    goto :goto_0

    .line 70
    :cond_2
    move v5, v6

    .line 71
    :goto_0
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 72
    .line 73
    .line 74
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;->m(Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;)Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    if-nez v1, :cond_3

    .line 79
    .line 80
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    move-object v1, v2

    .line 84
    :cond_3
    iget-object v1, v1, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;->n:Landroid/view/View;

    .line 85
    .line 86
    const-string v5, "vClosedDivider"

    .line 87
    .line 88
    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->getClosed()Z

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    if-eqz v5, :cond_4

    .line 96
    .line 97
    move v6, v4

    .line 98
    :cond_4
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 99
    .line 100
    .line 101
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;->m(Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;)Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    if-nez v1, :cond_5

    .line 106
    .line 107
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    move-object v1, v2

    .line 111
    :cond_5
    iget-object v1, v1, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;->l:Landroid/widget/TextView;

    .line 112
    .line 113
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->getSummary()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 118
    .line 119
    .line 120
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;->l(Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;)Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragmentArgs;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-virtual {v1}, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragmentArgs;->a()Z

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    if-eqz v1, :cond_7

    .line 129
    .line 130
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;->m(Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;)Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    if-nez v0, :cond_6

    .line 135
    .line 136
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_6
    move-object v2, v0

    .line 141
    :goto_1
    iget-object v0, v2, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;->m:Landroidx/appcompat/widget/AppCompatTextView;

    .line 142
    .line 143
    sget v1, Lcom/zykj/student/dialogue/R$drawable;->drawable_collect_state:I

    .line 144
    .line 145
    invoke-virtual {v0, v1, v4, v4, v4}, Landroidx/appcompat/widget/AppCompatTextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 146
    .line 147
    .line 148
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;->o(Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;)Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;->l(Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;)Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragmentArgs;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragmentArgs;->c()Z

    .line 157
    .line 158
    .line 159
    move-result p1

    .line 160
    invoke-virtual {v0, p1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->X(Z)V

    .line 161
    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_7
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;->o(Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;)Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->getState()I

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    const/4 v1, 0x2

    .line 173
    if-ne v0, v1, :cond_8

    .line 174
    .line 175
    const/4 v4, 0x1

    .line 176
    :cond_8
    invoke-virtual {p1, v4}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->X(Z)V

    .line 177
    .line 178
    .line 179
    :cond_9
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 180
    .line 181
    return-object p1

    .line 182
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 183
    .line 184
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 185
    .line 186
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    throw p1
.end method
