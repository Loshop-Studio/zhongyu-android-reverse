.class final Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onViewCreated$2$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onViewCreated$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.zykj.student.dialogue.ui.detail.AnswerPagerFragment$onViewCreated$2$2"
    f = "AnswerPagerFragment.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAnswerPagerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnswerPagerFragment.kt\ncom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onViewCreated$2$2\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,579:1\n257#2,2:580\n257#2,2:582\n257#2,2:584\n257#2,2:586\n257#2,2:588\n257#2,2:590\n*S KotlinDebug\n*F\n+ 1 AnswerPagerFragment.kt\ncom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onViewCreated$2$2\n*L\n126#1:580,2\n127#1:582,2\n129#1:584,2\n132#1:586,2\n133#1:588,2\n134#1:590,2\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onViewCreated$2$2;->c:Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final a(Lp6/k;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onViewCreated$2$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onViewCreated$2$2;

    .line 6
    .line 7
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onViewCreated$2$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance v0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onViewCreated$2$2;

    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onViewCreated$2$2;->c:Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;

    invoke-direct {v0, v1, p2}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onViewCreated$2$2;-><init>(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onViewCreated$2$2;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lp6/k;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onViewCreated$2$2;->a(Lp6/k;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onViewCreated$2$2;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lp6/k;

    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onViewCreated$2$2;->a:I

    .line 9
    .line 10
    if-nez v1, :cond_d

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lp6/k;->s()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    const-string v1, "ivFullscreen"

    .line 20
    .line 21
    const-string v2, "photoView"

    .line 22
    .line 23
    const-string v3, "ivStart"

    .line 24
    .line 25
    const/16 v4, 0x8

    .line 26
    .line 27
    const-string v5, "binding"

    .line 28
    .line 29
    const/4 v6, 0x0

    .line 30
    if-eqz p1, :cond_8

    .line 31
    .line 32
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onViewCreated$2$2;->c:Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;

    .line 33
    .line 34
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->w(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onViewCreated$2$2;->c:Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;

    .line 38
    .line 39
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->q(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;)Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-nez p1, :cond_0

    .line 44
    .line 45
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    move-object p1, v6

    .line 49
    :cond_0
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;->e:Landroid/widget/ImageView;

    .line 50
    .line 51
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget-object v3, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onViewCreated$2$2;->c:Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;

    .line 55
    .line 56
    invoke-static {v3, v0}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->o(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Lp6/k;)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    const/4 v7, 0x0

    .line 61
    if-eqz v3, :cond_1

    .line 62
    .line 63
    move v3, v7

    .line 64
    goto :goto_0

    .line 65
    :cond_1
    move v3, v4

    .line 66
    :goto_0
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onViewCreated$2$2;->c:Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;

    .line 70
    .line 71
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->q(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;)Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    if-nez p1, :cond_2

    .line 76
    .line 77
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    move-object p1, v6

    .line 81
    :cond_2
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;->g:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;

    .line 82
    .line 83
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    iget-object v2, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onViewCreated$2$2;->c:Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;

    .line 87
    .line 88
    invoke-static {v2}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->t(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;)Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    const/4 v3, 0x1

    .line 93
    if-eqz v2, :cond_3

    .line 94
    .line 95
    invoke-virtual {v2}, Lcom/zykj/view/board/play/SketchPlayFragment;->c0()Z

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-ne v2, v3, :cond_3

    .line 100
    .line 101
    iget-object v2, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onViewCreated$2$2;->c:Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;

    .line 102
    .line 103
    invoke-static {v2}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->t(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;)Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    if-eqz v2, :cond_3

    .line 108
    .line 109
    invoke-virtual {v2}, Lcom/zykj/view/board/play/SketchPlayFragment;->J()I

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    if-nez v2, :cond_3

    .line 114
    .line 115
    move v2, v3

    .line 116
    goto :goto_1

    .line 117
    :cond_3
    move v2, v7

    .line 118
    :goto_1
    if-eqz v2, :cond_4

    .line 119
    .line 120
    move v2, v7

    .line 121
    goto :goto_2

    .line 122
    :cond_4
    move v2, v4

    .line 123
    :goto_2
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 124
    .line 125
    .line 126
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onViewCreated$2$2;->c:Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;

    .line 127
    .line 128
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->q(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;)Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    if-nez p1, :cond_5

    .line 133
    .line 134
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    move-object p1, v6

    .line 138
    :cond_5
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;->d:Landroid/widget/ImageView;

    .line 139
    .line 140
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onViewCreated$2$2;->c:Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;

    .line 144
    .line 145
    invoke-static {v1}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->t(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;)Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    if-eqz v1, :cond_6

    .line 150
    .line 151
    invoke-virtual {v1}, Lcom/zykj/view/board/play/SketchPlayFragment;->c0()Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    if-ne v1, v3, :cond_6

    .line 156
    .line 157
    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onViewCreated$2$2;->c:Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;

    .line 158
    .line 159
    invoke-static {v1}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->t(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;)Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    if-eqz v1, :cond_6

    .line 164
    .line 165
    invoke-virtual {v1}, Lcom/zykj/view/board/play/SketchPlayFragment;->J()I

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    if-nez v1, :cond_6

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_6
    move v3, v7

    .line 173
    :goto_3
    if-eqz v3, :cond_7

    .line 174
    .line 175
    move v4, v7

    .line 176
    :cond_7
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 177
    .line 178
    .line 179
    goto :goto_4

    .line 180
    :cond_8
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onViewCreated$2$2;->c:Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;

    .line 181
    .line 182
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->q(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;)Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    if-nez p1, :cond_9

    .line 187
    .line 188
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    move-object p1, v6

    .line 192
    :cond_9
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;->g:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;

    .line 193
    .line 194
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 198
    .line 199
    .line 200
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onViewCreated$2$2;->c:Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;

    .line 201
    .line 202
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->q(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;)Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    if-nez p1, :cond_a

    .line 207
    .line 208
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    move-object p1, v6

    .line 212
    :cond_a
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;->e:Landroid/widget/ImageView;

    .line 213
    .line 214
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 218
    .line 219
    .line 220
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onViewCreated$2$2;->c:Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;

    .line 221
    .line 222
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->q(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;)Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    if-nez p1, :cond_b

    .line 227
    .line 228
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    move-object p1, v6

    .line 232
    :cond_b
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;->d:Landroid/widget/ImageView;

    .line 233
    .line 234
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 238
    .line 239
    .line 240
    :goto_4
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onViewCreated$2$2;->c:Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;

    .line 241
    .line 242
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->t(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;)Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    if-eqz p1, :cond_c

    .line 247
    .line 248
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    if-eqz p1, :cond_c

    .line 253
    .line 254
    new-instance v1, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onViewCreated$2$2$1;

    .line 255
    .line 256
    iget-object v2, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onViewCreated$2$2;->c:Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;

    .line 257
    .line 258
    invoke-direct {v1, v2, v0, v6}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onViewCreated$2$2$1;-><init>(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Lp6/k;Lkotlin/coroutines/Continuation;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {p1, v1}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenCreated(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;

    .line 262
    .line 263
    .line 264
    :cond_c
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 265
    .line 266
    return-object p1

    .line 267
    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 268
    .line 269
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 270
    .line 271
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    throw p1
.end method
