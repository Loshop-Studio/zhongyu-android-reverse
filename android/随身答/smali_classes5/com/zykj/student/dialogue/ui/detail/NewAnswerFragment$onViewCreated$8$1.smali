.class final Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$8$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$8;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lcom/zykj/student/dialogue/ui/detail/viewmodel/c;",
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
        "Lcom/zykj/student/dialogue/ui/detail/viewmodel/c;",
        "it",
        "",
        "<anonymous>",
        "(Lcom/zykj/student/dialogue/ui/detail/viewmodel/c;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.student.dialogue.ui.detail.NewAnswerFragment$onViewCreated$8$1"
    f = "NewAnswerFragment.kt"
    i = {
        0x0
    }
    l = {
        0xd3
    }
    m = "invokeSuspend"
    n = {
        "it"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$8$1;->c:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/zykj/student/dialogue/ui/detail/viewmodel/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$8$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$8$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$8$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance v0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$8$1;

    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$8$1;->c:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    invoke-direct {v0, v1, p2}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$8$1;-><init>(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$8$1;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/c;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$8$1;->a(Lcom/zykj/student/dialogue/ui/detail/viewmodel/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$8$1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/c;

    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v2, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$8$1;->a:I

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    if-ne v2, v3, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    instance-of p1, v0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/c$a;

    .line 32
    .line 33
    if-eqz p1, :cond_4

    .line 34
    .line 35
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$8$1;->c:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    .line 36
    .line 37
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;->t(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;)V

    .line 38
    .line 39
    .line 40
    move-object p1, v0

    .line 41
    check-cast p1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/c$a;

    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/c$a;->a()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_3

    .line 48
    .line 49
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$8$1;->c:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    .line 50
    .line 51
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;->w(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;)Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->O()V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$8$1;->c:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    .line 59
    .line 60
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;->w(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;)Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iput-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$8$1;->b:Ljava/lang/Object;

    .line 69
    .line 70
    iput v3, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$8$1;->a:I

    .line 71
    .line 72
    invoke-virtual {p1, v3, p0}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->D(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    if-ne p1, v1, :cond_2

    .line 77
    .line 78
    return-object v1

    .line 79
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$8$1;->c:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    .line 80
    .line 81
    invoke-static {p1}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {p1}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_3
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$8$1;->c:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    .line 94
    .line 95
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/c$a;->b()Ljava/lang/Throwable;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-static {v0, p1}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;->G(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;Ljava/lang/Throwable;)V

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_4
    instance-of p1, v0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/c$b;

    .line 104
    .line 105
    if-eqz p1, :cond_7

    .line 106
    .line 107
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$8$1;->c:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    .line 108
    .line 109
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;->t(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;)V

    .line 110
    .line 111
    .line 112
    check-cast v0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/c$b;

    .line 113
    .line 114
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/c$b;->a()Z

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    if-eqz p1, :cond_6

    .line 119
    .line 120
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$8$1;->c:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    .line 121
    .line 122
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;->v(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;)Z

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    if-eqz p1, :cond_5

    .line 127
    .line 128
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$8$1;->c:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    .line 129
    .line 130
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 135
    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_5
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$8$1;->c:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    .line 139
    .line 140
    invoke-static {p1}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    sget v0, Lcom/zykj/student/dialogue/R$id;->home_fragment:I

    .line 145
    .line 146
    const/4 v1, 0x0

    .line 147
    invoke-virtual {p1, v0, v1}, Landroidx/navigation/NavController;->popBackStack(IZ)Z

    .line 148
    .line 149
    .line 150
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$8$1;->c:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    .line 151
    .line 152
    const-string v0, "KEY_REFRESH_HOME_PAGE"

    .line 153
    .line 154
    invoke-static {}, Landroidx/core/os/BundleKt;->bundleOf()Landroid/os/Bundle;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-static {p1, v0, v1}, Landroidx/fragment/app/FragmentKt;->setFragmentResult(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 159
    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_6
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment$onViewCreated$8$1;->c:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    .line 163
    .line 164
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/c$b;->b()Ljava/lang/Throwable;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-static {p1, v0}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;->G(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;Ljava/lang/Throwable;)V

    .line 169
    .line 170
    .line 171
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 172
    .line 173
    return-object p1

    .line 174
    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 175
    .line 176
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 177
    .line 178
    .line 179
    throw p1
.end method
