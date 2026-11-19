.class final Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$3$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lcom/zykj/student/dialogue/ui/detail/viewmodel/b;",
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
        "Lcom/zykj/student/dialogue/ui/detail/viewmodel/b;",
        "it",
        "",
        "<anonymous>",
        "(Lcom/zykj/student/dialogue/ui/detail/viewmodel/b;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.student.dialogue.ui.detail.AnswerDetailFragment$onViewCreated$3$1"
    f = "AnswerDetailFragment.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAnswerDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnswerDetailFragment.kt\ncom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$3$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,302:1\n255#2:303\n*S KotlinDebug\n*F\n+ 1 AnswerDetailFragment.kt\ncom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$3$1\n*L\n207#1:303\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$3$1;->c:Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/zykj/student/dialogue/ui/detail/viewmodel/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$3$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$3$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$3$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance v0, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$3$1;

    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$3$1;->c:Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;

    invoke-direct {v0, v1, p2}, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$3$1;-><init>(Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$3$1;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/b;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$3$1;->a(Lcom/zykj/student/dialogue/ui/detail/viewmodel/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$3$1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/b;

    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$3$1;->a:I

    .line 9
    .line 10
    if-nez v1, :cond_9

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    instance-of p1, v0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/b$a;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    const-string v2, "binding"

    .line 19
    .line 20
    if-eqz p1, :cond_4

    .line 21
    .line 22
    check-cast v0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/b$a;

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/b$a;->c()Z

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$3$1;->c:Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;

    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/b$a;->c()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;->m(Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;)Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-nez v0, :cond_0

    .line 40
    .line 41
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    move-object v0, v1

    .line 45
    :cond_0
    iget-object v0, v0, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;->h:Lcom/zykj/student/dialogue/ui/widget/TouchSwitchMotionLayout;

    .line 46
    .line 47
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->transitionToEnd()V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;->m(Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;)Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    if-nez v0, :cond_2

    .line 56
    .line 57
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    move-object v0, v1

    .line 61
    :cond_2
    iget-object v0, v0, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;->h:Lcom/zykj/student/dialogue/ui/widget/TouchSwitchMotionLayout;

    .line 62
    .line 63
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->transitionToStart()V

    .line 64
    .line 65
    .line 66
    :goto_0
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;->m(Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;)Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    if-nez v0, :cond_3

    .line 71
    .line 72
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    move-object v1, v0

    .line 77
    :goto_1
    iget-object v0, v1, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;->h:Lcom/zykj/student/dialogue/ui/widget/TouchSwitchMotionLayout;

    .line 78
    .line 79
    new-instance v1, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$3$1$1$1;

    .line 80
    .line 81
    invoke-direct {v1, p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$3$1$1$1;-><init>(Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->addTransitionListener(Landroidx/constraintlayout/motion/widget/MotionLayout$TransitionListener;)V

    .line 85
    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_4
    instance-of p1, v0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/b$b;

    .line 89
    .line 90
    if-eqz p1, :cond_8

    .line 91
    .line 92
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$3$1;->c:Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;

    .line 93
    .line 94
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;->m(Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;)Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    if-nez p1, :cond_5

    .line 99
    .line 100
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    move-object p1, v1

    .line 104
    :cond_5
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;->b:Landroid/widget/FrameLayout;

    .line 105
    .line 106
    const-string v0, "flContainer"

    .line 107
    .line 108
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    if-nez p1, :cond_6

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_6
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$3$1;->c:Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;

    .line 119
    .line 120
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;->m(Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;)Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    if-nez p1, :cond_7

    .line 125
    .line 126
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_7
    move-object v1, p1

    .line 131
    :goto_2
    iget-object p1, v1, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;->b:Landroid/widget/FrameLayout;

    .line 132
    .line 133
    const/4 v0, 0x0

    .line 134
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 135
    .line 136
    .line 137
    const/4 v0, 0x0

    .line 138
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    const/high16 v0, 0x3f800000    # 1.0f

    .line 146
    .line 147
    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    const-wide/16 v0, 0x12c

    .line 152
    .line 153
    invoke-virtual {p1, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 154
    .line 155
    .line 156
    :cond_8
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 157
    .line 158
    return-object p1

    .line 159
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 160
    .line 161
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 162
    .line 163
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    throw p1
.end method
