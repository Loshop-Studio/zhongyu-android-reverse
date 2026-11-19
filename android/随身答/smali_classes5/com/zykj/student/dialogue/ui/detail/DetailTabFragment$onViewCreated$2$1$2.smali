.class final Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment$onViewCreated$2$1$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment$onViewCreated$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lp6/k;",
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
        "Lp6/k;",
        "it",
        "",
        "<anonymous>",
        "(Lp6/k;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.student.dialogue.ui.detail.DetailTabFragment$onViewCreated$2$1$2"
    f = "DetailTabFragment.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDetailTabFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DetailTabFragment.kt\ncom/zykj/student/dialogue/ui/detail/DetailTabFragment$onViewCreated$2$1$2\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,121:1\n257#2,2:122\n257#2,2:124\n257#2,2:126\n257#2,2:128\n774#3:130\n865#3,2:131\n*S KotlinDebug\n*F\n+ 1 DetailTabFragment.kt\ncom/zykj/student/dialogue/ui/detail/DetailTabFragment$onViewCreated$2$1$2\n*L\n71#1:122,2\n72#1:124,2\n74#1:126,2\n75#1:128,2\n78#1:130\n78#1:131,2\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment$onViewCreated$2$1$2;->c:Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final a(Lp6/k;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment$onViewCreated$2$1$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment$onViewCreated$2$1$2;

    .line 6
    .line 7
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment$onViewCreated$2$1$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance v0, Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment$onViewCreated$2$1$2;

    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment$onViewCreated$2$1$2;->c:Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment;

    invoke-direct {v0, v1, p2}, Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment$onViewCreated$2$1$2;-><init>(Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment$onViewCreated$2$1$2;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lp6/k;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment$onViewCreated$2$1$2;->a(Lp6/k;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment$onViewCreated$2$1$2;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lp6/k;

    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment$onViewCreated$2$1$2;->a:I

    .line 9
    .line 10
    if-nez v1, :cond_c

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment$onViewCreated$2$1$2;->c:Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment;

    .line 16
    .line 17
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const/4 v1, 0x0

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    const-string v2, "key_only_public"

    .line 25
    .line 26
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move p1, v1

    .line 32
    :goto_0
    invoke-virtual {v0}, Lp6/k;->n()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-static {v2}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    const/16 v3, 0x8

    .line 41
    .line 42
    const-string v4, "recyclerView"

    .line 43
    .line 44
    const-string v5, "tvEmpty"

    .line 45
    .line 46
    const-string v6, "binding"

    .line 47
    .line 48
    const/4 v7, 0x0

    .line 49
    if-eqz v2, :cond_3

    .line 50
    .line 51
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment$onViewCreated$2$1$2;->c:Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment;

    .line 52
    .line 53
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment;->h(Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment;)Lcom/zykj/student/dialogue/databinding/DialogueFragmentDetailTabBinding;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-nez p1, :cond_1

    .line 58
    .line 59
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    move-object p1, v7

    .line 63
    :cond_1
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/DialogueFragmentDetailTabBinding;->b:Landroid/widget/TextView;

    .line 64
    .line 65
    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 69
    .line 70
    .line 71
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment$onViewCreated$2$1$2;->c:Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment;

    .line 72
    .line 73
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment;->h(Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment;)Lcom/zykj/student/dialogue/databinding/DialogueFragmentDetailTabBinding;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    if-nez p1, :cond_2

    .line 78
    .line 79
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    move-object v7, p1

    .line 84
    :goto_1
    iget-object p1, v7, Lcom/zykj/student/dialogue/databinding/DialogueFragmentDetailTabBinding;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 85
    .line 86
    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 90
    .line 91
    .line 92
    goto/16 :goto_4

    .line 93
    .line 94
    :cond_3
    iget-object v2, p0, Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment$onViewCreated$2$1$2;->c:Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment;

    .line 95
    .line 96
    invoke-static {v2}, Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment;->h(Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment;)Lcom/zykj/student/dialogue/databinding/DialogueFragmentDetailTabBinding;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    if-nez v2, :cond_4

    .line 101
    .line 102
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    move-object v2, v7

    .line 106
    :cond_4
    iget-object v2, v2, Lcom/zykj/student/dialogue/databinding/DialogueFragmentDetailTabBinding;->b:Landroid/widget/TextView;

    .line 107
    .line 108
    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 112
    .line 113
    .line 114
    iget-object v2, p0, Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment$onViewCreated$2$1$2;->c:Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment;

    .line 115
    .line 116
    invoke-static {v2}, Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment;->h(Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment;)Lcom/zykj/student/dialogue/databinding/DialogueFragmentDetailTabBinding;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    if-nez v2, :cond_5

    .line 121
    .line 122
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    move-object v2, v7

    .line 126
    :cond_5
    iget-object v2, v2, Lcom/zykj/student/dialogue/databinding/DialogueFragmentDetailTabBinding;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 127
    .line 128
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 132
    .line 133
    .line 134
    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment$onViewCreated$2$1$2;->c:Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment;

    .line 135
    .line 136
    invoke-static {v1}, Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment;->i(Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment;)Lcom/zykj/student/dialogue/ui/detail/DetailTabAdapter;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    if-nez v1, :cond_6

    .line 141
    .line 142
    const-string v1, "rvAdapter"

    .line 143
    .line 144
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_6
    move-object v7, v1

    .line 149
    :goto_2
    if-eqz p1, :cond_9

    .line 150
    .line 151
    invoke-virtual {v0}, Lp6/k;->n()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v2

    .line 163
    if-eqz v2, :cond_7

    .line 164
    .line 165
    move-object p1, v1

    .line 166
    :cond_7
    check-cast p1, Ljava/lang/Iterable;

    .line 167
    .line 168
    new-instance v1, Ljava/util/ArrayList;

    .line 169
    .line 170
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 171
    .line 172
    .line 173
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    :cond_8
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    if-eqz v2, :cond_b

    .line 182
    .line 183
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    move-object v3, v2

    .line 188
    check-cast v3, Lcom/zykj/student/dialogue/bean/resp/MessageResponse;

    .line 189
    .line 190
    invoke-virtual {v3}, Lcom/zykj/student/dialogue/bean/resp/MessageResponse;->isPrimary()Z

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    if-eqz v3, :cond_8

    .line 195
    .line 196
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    goto :goto_3

    .line 200
    :cond_9
    invoke-virtual {v0}, Lp6/k;->n()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v2

    .line 212
    if-eqz v2, :cond_a

    .line 213
    .line 214
    move-object p1, v1

    .line 215
    :cond_a
    move-object v1, p1

    .line 216
    check-cast v1, Ljava/util/List;

    .line 217
    .line 218
    :cond_b
    invoke-virtual {v7, v1}, Landroidx/recyclerview/widget/ListAdapter;->submitList(Ljava/util/List;)V

    .line 219
    .line 220
    .line 221
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment$onViewCreated$2$1$2;->c:Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment;

    .line 222
    .line 223
    invoke-static {p1, v0}, Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment;->k(Lcom/zykj/student/dialogue/ui/detail/DetailTabFragment;Lp6/k;)V

    .line 224
    .line 225
    .line 226
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 227
    .line 228
    return-object p1

    .line 229
    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 230
    .line 231
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 232
    .line 233
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    throw p1
.end method
