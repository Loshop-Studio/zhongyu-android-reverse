.class final Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lcom/zykj/view/board/simple/e;",
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
        "Lcom/zykj/view/board/simple/e;",
        "state",
        "",
        "<anonymous>",
        "(Lcom/zykj/view/board/simple/e;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.view.board.simple.SimpleFragment$initObserver$1$1$2$1"
    f = "SimpleFragment.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/zykj/view/board/simple/SimpleFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/simple/SimpleFragment;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$2$1;->c:Lcom/zykj/view/board/simple/SimpleFragment;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/zykj/view/board/simple/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$2$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$2$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance v0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$2$1;

    iget-object v1, p0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$2$1;->c:Lcom/zykj/view/board/simple/SimpleFragment;

    invoke-direct {v0, v1, p2}, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$2$1;-><init>(Lcom/zykj/view/board/simple/SimpleFragment;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$2$1;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/zykj/view/board/simple/e;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$2$1;->a(Lcom/zykj/view/board/simple/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$2$1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/view/board/simple/e;

    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$2$1;->a:I

    .line 9
    .line 10
    if-nez v1, :cond_4

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$2$1;->c:Lcom/zykj/view/board/simple/SimpleFragment;

    .line 16
    .line 17
    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleFragment;->o(Lcom/zykj/view/board/simple/SimpleFragment;)Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const/4 v1, 0x0

    .line 22
    const-string v2, "mBinding"

    .line 23
    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    move-object p1, v1

    .line 30
    :cond_0
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->e:Lcom/zykj/view/databinding/ViewIncludeMenuBinding;

    .line 31
    .line 32
    iget-object v3, p1, Lcom/zykj/view/databinding/ViewIncludeMenuBinding;->j:Landroidx/appcompat/widget/AppCompatImageView;

    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/zykj/view/board/simple/e;->j()Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    invoke-virtual {v3, v4}, Landroid/view/View;->setSelected(Z)V

    .line 39
    .line 40
    .line 41
    iget-object v3, p1, Lcom/zykj/view/databinding/ViewIncludeMenuBinding;->i:Landroidx/appcompat/widget/AppCompatImageView;

    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/zykj/view/board/simple/e;->e()Lcom/zykj/view/board/board/n;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-virtual {v4}, Lcom/zykj/view/board/board/n;->d()Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    invoke-virtual {v3, v4}, Landroid/view/View;->setSelected(Z)V

    .line 52
    .line 53
    .line 54
    iget-object v3, p1, Lcom/zykj/view/databinding/ViewIncludeMenuBinding;->f:Landroidx/appcompat/widget/AppCompatImageView;

    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/zykj/view/board/simple/e;->e()Lcom/zykj/view/board/board/n;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-virtual {v4}, Lcom/zykj/view/board/board/n;->c()Z

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    invoke-virtual {v3, v4}, Landroid/view/View;->setSelected(Z)V

    .line 65
    .line 66
    .line 67
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewIncludeMenuBinding;->d:Landroidx/appcompat/widget/AppCompatImageView;

    .line 68
    .line 69
    invoke-virtual {v0}, Lcom/zykj/view/board/simple/e;->e()Lcom/zykj/view/board/board/n;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-virtual {v3}, Lcom/zykj/view/board/board/n;->a()Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    invoke-virtual {p1, v3}, Landroid/view/View;->setSelected(Z)V

    .line 78
    .line 79
    .line 80
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$2$1;->c:Lcom/zykj/view/board/simple/SimpleFragment;

    .line 81
    .line 82
    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleFragment;->o(Lcom/zykj/view/board/simple/SimpleFragment;)Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    if-nez p1, :cond_1

    .line 87
    .line 88
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    move-object p1, v1

    .line 92
    :cond_1
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->f:Lcom/zykj/view/databinding/ViewIncludePenBinding;

    .line 93
    .line 94
    iget-object v3, p1, Lcom/zykj/view/databinding/ViewIncludePenBinding;->l:Landroid/widget/RadioGroup;

    .line 95
    .line 96
    const-string v4, "rgPenType"

    .line 97
    .line 98
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Lcom/zykj/view/board/simple/e;->i()Lcom/zykj/view/board/simple/d;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    invoke-virtual {v4}, Lcom/zykj/view/board/simple/d;->b()I

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    invoke-static {v3, v4}, Lb8/c;->a(Landroid/widget/RadioGroup;I)V

    .line 110
    .line 111
    .line 112
    iget-object v3, p1, Lcom/zykj/view/databinding/ViewIncludePenBinding;->k:Landroid/widget/RadioGroup;

    .line 113
    .line 114
    const-string v4, "rgPenSize"

    .line 115
    .line 116
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0}, Lcom/zykj/view/board/simple/e;->h()Lcom/zykj/view/board/simple/c;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    invoke-virtual {v4}, Lcom/zykj/view/board/simple/c;->a()I

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    invoke-static {v3, v4}, Lb8/c;->a(Landroid/widget/RadioGroup;I)V

    .line 128
    .line 129
    .line 130
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewIncludePenBinding;->j:Landroid/widget/RadioGroup;

    .line 131
    .line 132
    const-string v3, "rgPenColor"

    .line 133
    .line 134
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0}, Lcom/zykj/view/board/simple/e;->g()Lcom/zykj/view/board/board/p;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-virtual {v3}, Lcom/zykj/view/board/board/p;->b()I

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    invoke-static {p1, v3}, Lb8/c;->a(Landroid/widget/RadioGroup;I)V

    .line 146
    .line 147
    .line 148
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$2$1;->c:Lcom/zykj/view/board/simple/SimpleFragment;

    .line 149
    .line 150
    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleFragment;->o(Lcom/zykj/view/board/simple/SimpleFragment;)Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    if-nez p1, :cond_2

    .line 155
    .line 156
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    move-object p1, v1

    .line 160
    :cond_2
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->c:Lcom/zykj/view/databinding/ViewIncludeEraserBinding;

    .line 161
    .line 162
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewIncludeEraserBinding;->d:Landroid/widget/RadioGroup;

    .line 163
    .line 164
    const-string v3, "rgEraserSize"

    .line 165
    .line 166
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0}, Lcom/zykj/view/board/simple/e;->c()Lcom/zykj/view/board/board/g;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    invoke-virtual {v3}, Lcom/zykj/view/board/board/g;->a()I

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    invoke-static {p1, v3}, Lb8/c;->a(Landroid/widget/RadioGroup;I)V

    .line 178
    .line 179
    .line 180
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$2$1;->c:Lcom/zykj/view/board/simple/SimpleFragment;

    .line 181
    .line 182
    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleFragment;->o(Lcom/zykj/view/board/simple/SimpleFragment;)Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    if-nez p1, :cond_3

    .line 187
    .line 188
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    goto :goto_0

    .line 192
    :cond_3
    move-object v1, p1

    .line 193
    :goto_0
    iget-object p1, v1, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->i:Landroidx/appcompat/widget/AppCompatImageView;

    .line 194
    .line 195
    invoke-virtual {v0}, Lcom/zykj/view/board/simple/e;->d()Lcom/zykj/view/board/board/i;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-virtual {v0}, Lcom/zykj/view/board/board/i;->a()I

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 204
    .line 205
    .line 206
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 207
    .line 208
    return-object p1

    .line 209
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 210
    .line 211
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 212
    .line 213
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    throw p1
.end method
