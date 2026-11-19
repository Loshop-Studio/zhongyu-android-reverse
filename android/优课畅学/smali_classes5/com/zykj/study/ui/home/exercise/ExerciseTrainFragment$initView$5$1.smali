.class final Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$5$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lx7/p;"
    }
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.study.ui.home.exercise.ExerciseTrainFragment$initView$5$1"
    f = "ExerciseTrainFragment.kt"
    l = {
        0x99
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$5$1;->b:Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$5$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$5$1;->b:Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$5$1;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$5$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$5$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$5$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$5$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$5$1;->a:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$5$1;->b:Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->t(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;)Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-object v1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$5$1;->b:Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;

    .line 34
    .line 35
    invoke-static {v1}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->s(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;)Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragmentArgs;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragmentArgs;->b()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    iget-object v3, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$5$1;->b:Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;

    .line 44
    .line 45
    invoke-static {v3}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->s(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;)Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragmentArgs;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {v3}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragmentArgs;->a()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    iput v2, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$5$1;->a:I

    .line 54
    .line 55
    invoke-virtual {p1, v1, v3, p0}, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->t(IILm7/c;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-ne p1, v0, :cond_2

    .line 60
    .line 61
    return-object v0

    .line 62
    :cond_2
    :goto_0
    check-cast p1, Lcom/zykj/study/bean/exercise/ExerciseBean;

    .line 63
    .line 64
    const-string v0, "getString(...)"

    .line 65
    .line 66
    if-eqz p1, :cond_3

    .line 67
    .line 68
    sget-object v1, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 69
    .line 70
    iget-object v2, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$5$1;->b:Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;

    .line 71
    .line 72
    sget v3, Lcom/zykj/study/R$string;->exercise_result_upload_success:I

    .line 73
    .line 74
    invoke-virtual {v2, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-static {v2, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-static {v1, v2}, Le5/o;->d(Lcom/zykj/base/utils/XToastUtils;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$5$1;->b:Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;

    .line 85
    .line 86
    const-string v1, "exercise_upload"

    .line 87
    .line 88
    invoke-static {v1, p1}, Lh7/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    filled-new-array {p1}, [Lkotlin/Pair;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-static {p1}, Landroidx/core/os/BundleKt;->bundleOf([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-static {v0, v1, p1}, Landroidx/fragment/app/FragmentKt;->setFragmentResult(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 101
    .line 102
    .line 103
    iget-object p1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$5$1;->b:Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;

    .line 104
    .line 105
    invoke-static {p1}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    sget-object v0, Lcom/zykj/study/ui/home/exercise/d;->a:Lcom/zykj/study/ui/home/exercise/d$b;

    .line 110
    .line 111
    iget-object v1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$5$1;->b:Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;

    .line 112
    .line 113
    invoke-static {v1}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->s(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;)Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragmentArgs;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-virtual {v1}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragmentArgs;->b()I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    iget-object v2, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$5$1;->b:Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;

    .line 122
    .line 123
    invoke-static {v2}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->s(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;)Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragmentArgs;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    invoke-virtual {v2}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragmentArgs;->a()I

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    iget-object v3, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$5$1;->b:Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;

    .line 132
    .line 133
    invoke-static {v3}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->s(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;)Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragmentArgs;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    invoke-virtual {v3}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragmentArgs;->c()I

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    const/4 v4, 0x0

    .line 142
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/zykj/study/ui/home/exercise/d$b;->a(IIII)Landroidx/navigation/NavDirections;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-virtual {p1, v0}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V

    .line 147
    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_3
    iget-object p1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$5$1;->b:Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;

    .line 151
    .line 152
    invoke-static {p1}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->t(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;)Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->D()Z

    .line 157
    .line 158
    .line 159
    move-result p1

    .line 160
    if-eqz p1, :cond_4

    .line 161
    .line 162
    sget-object p1, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 163
    .line 164
    iget-object v1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$5$1;->b:Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;

    .line 165
    .line 166
    sget v3, Lcom/zykj/study/R$string;->exercise_result_upload_fail:I

    .line 167
    .line 168
    invoke-virtual {v1, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    invoke-static {v1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    invoke-static {p1, v1}, Le5/o;->d(Lcom/zykj/base/utils/XToastUtils;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    :cond_4
    iget-object p1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$5$1;->b:Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;

    .line 179
    .line 180
    invoke-static {p1}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->t(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;)Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-virtual {p1, v2}, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->I(Z)V

    .line 185
    .line 186
    .line 187
    :goto_1
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 188
    .line 189
    return-object p1
.end method
