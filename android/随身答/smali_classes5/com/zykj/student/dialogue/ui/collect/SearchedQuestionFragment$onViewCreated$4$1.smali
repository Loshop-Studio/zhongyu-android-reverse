.class final Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment$onViewCreated$4$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment$onViewCreated$4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lm6/k0;",
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lm6/k0;",
        "it",
        "",
        "<anonymous>",
        "(Lm6/k0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.student.dialogue.ui.collect.SearchedQuestionFragment$onViewCreated$4$1"
    f = "SearchedQuestionFragment.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSearchedQuestionFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchedQuestionFragment.kt\ncom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment$onViewCreated$4$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,176:1\n257#2,2:177\n257#2,2:179\n257#2,2:181\n*S KotlinDebug\n*F\n+ 1 SearchedQuestionFragment.kt\ncom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment$onViewCreated$4$1\n*L\n116#1:177,2\n117#1:179,2\n118#1:181,2\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment$onViewCreated$4$1;->c:Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final a(Lm6/k0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment$onViewCreated$4$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment$onViewCreated$4$1;

    .line 6
    .line 7
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment$onViewCreated$4$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance v0, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment$onViewCreated$4$1;

    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment$onViewCreated$4$1;->c:Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment;

    invoke-direct {v0, v1, p2}, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment$onViewCreated$4$1;-><init>(Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment$onViewCreated$4$1;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm6/k0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment$onViewCreated$4$1;->a(Lm6/k0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment$onViewCreated$4$1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm6/k0;

    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment$onViewCreated$4$1;->a:I

    .line 9
    .line 10
    if-nez v1, :cond_d

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lm6/k0;->b()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v2, 0x0

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    move-object p1, v2

    .line 27
    :cond_0
    check-cast p1, Ljava/util/Collection;

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    const/4 v3, 0x0

    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move p1, v3

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    :goto_0
    move p1, v1

    .line 43
    :goto_1
    iget-object v4, p0, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment$onViewCreated$4$1;->c:Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment;

    .line 44
    .line 45
    invoke-static {v4}, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment;->n(Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment;)Lcom/zykj/student/dialogue/databinding/FragmentSearchedQuestionBinding;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    const-string v5, "binding"

    .line 50
    .line 51
    if-nez v4, :cond_3

    .line 52
    .line 53
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    move-object v4, v2

    .line 57
    :cond_3
    iget-object v4, v4, Lcom/zykj/student/dialogue/databinding/FragmentSearchedQuestionBinding;->g:Landroid/widget/TextView;

    .line 58
    .line 59
    const-string v6, "tvHead"

    .line 60
    .line 61
    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const/16 v6, 0x8

    .line 65
    .line 66
    if-nez p1, :cond_4

    .line 67
    .line 68
    move v7, v3

    .line 69
    goto :goto_2

    .line 70
    :cond_4
    move v7, v6

    .line 71
    :goto_2
    invoke-virtual {v4, v7}, Landroid/view/View;->setVisibility(I)V

    .line 72
    .line 73
    .line 74
    iget-object v4, p0, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment$onViewCreated$4$1;->c:Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment;

    .line 75
    .line 76
    invoke-static {v4}, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment;->n(Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment;)Lcom/zykj/student/dialogue/databinding/FragmentSearchedQuestionBinding;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    if-nez v4, :cond_5

    .line 81
    .line 82
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    move-object v4, v2

    .line 86
    :cond_5
    iget-object v4, v4, Lcom/zykj/student/dialogue/databinding/FragmentSearchedQuestionBinding;->f:Landroid/widget/TextView;

    .line 87
    .line 88
    const-string v7, "tvCreate"

    .line 89
    .line 90
    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    if-nez p1, :cond_6

    .line 94
    .line 95
    move p1, v3

    .line 96
    goto :goto_3

    .line 97
    :cond_6
    move p1, v6

    .line 98
    :goto_3
    invoke-virtual {v4, p1}, Landroid/view/View;->setVisibility(I)V

    .line 99
    .line 100
    .line 101
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment$onViewCreated$4$1;->c:Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment;

    .line 102
    .line 103
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment;->n(Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment;)Lcom/zykj/student/dialogue/databinding/FragmentSearchedQuestionBinding;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    if-nez p1, :cond_7

    .line 108
    .line 109
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    move-object p1, v2

    .line 113
    :cond_7
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/FragmentSearchedQuestionBinding;->d:Landroid/widget/LinearLayout;

    .line 114
    .line 115
    const-string v4, "llEmpty"

    .line 116
    .line 117
    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, Lm6/k0;->b()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    invoke-static {v4}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    if-eqz v4, :cond_9

    .line 129
    .line 130
    invoke-virtual {v0}, Lm6/k0;->b()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    invoke-static {v4}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v5

    .line 138
    if-eqz v5, :cond_8

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_8
    move-object v2, v4

    .line 142
    :goto_4
    check-cast v2, Ljava/util/Collection;

    .line 143
    .line 144
    if-eqz v2, :cond_a

    .line 145
    .line 146
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    if-eqz v2, :cond_9

    .line 151
    .line 152
    goto :goto_5

    .line 153
    :cond_9
    move v1, v3

    .line 154
    :cond_a
    :goto_5
    if-eqz v1, :cond_b

    .line 155
    .line 156
    goto :goto_6

    .line 157
    :cond_b
    move v3, v6

    .line 158
    :goto_6
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 159
    .line 160
    .line 161
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment$onViewCreated$4$1;->c:Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment;

    .line 162
    .line 163
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment;->o(Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment;)Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionListAdapter;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-virtual {v0}, Lm6/k0;->b()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v2

    .line 179
    if-eqz v2, :cond_c

    .line 180
    .line 181
    move-object v0, v1

    .line 182
    :cond_c
    check-cast v0, Ljava/util/List;

    .line 183
    .line 184
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/ListAdapter;->submitList(Ljava/util/List;)V

    .line 185
    .line 186
    .line 187
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 188
    .line 189
    return-object p1

    .line 190
    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 191
    .line 192
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 193
    .line 194
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    throw p1
.end method
