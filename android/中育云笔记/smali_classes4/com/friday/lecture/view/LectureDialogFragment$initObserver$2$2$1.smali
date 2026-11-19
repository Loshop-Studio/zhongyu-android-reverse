.class final Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.lecture.view.LectureDialogFragment$initObserver$2$2$1"
    f = "LectureDialogFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lcom/friday/lecture/view/LectureDialogFragment;


# direct methods
.method public constructor <init>(Lcom/friday/lecture/view/LectureDialogFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$2$1;->e:Lcom/friday/lecture/view/LectureDialogFragment;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2

    .line 1
    new-instance v0, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$2$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$2$1;->e:Lcom/friday/lecture/view/LectureDialogFragment;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$2$1;-><init>(Lcom/friday/lecture/view/LectureDialogFragment;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$2$1;->d:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final g(Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$2$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$2$1;

    .line 6
    .line 7
    sget-object p2, Lqc/q;->a:Lqc/q;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$2$1;->g(Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$2$1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/List;

    .line 4
    .line 5
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$2$1;->c:I

    .line 9
    .line 10
    if-nez v1, :cond_4

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$2$1;->e:Lcom/friday/lecture/view/LectureDialogFragment;

    .line 16
    .line 17
    invoke-static {p1}, Lcom/friday/lecture/view/LectureDialogFragment;->z(Lcom/friday/lecture/view/LectureDialogFragment;)Lcom/friday/lecture/adapter/CodeAdapter;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    move-object v1, v0

    .line 22
    check-cast v1, Ljava/util/Collection;

    .line 23
    .line 24
    invoke-virtual {p1, v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setList(Ljava/util/Collection;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$2$1;->e:Lcom/friday/lecture/view/LectureDialogFragment;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/friday/lecture/view/LectureDialogFragment;->B(Lcom/friday/lecture/view/LectureDialogFragment;)Lcom/friday/lecture/databinding/LectureDialogFragmentBinding;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-object p1, p1, Lcom/friday/lecture/databinding/LectureDialogFragmentBinding;->t:Landroid/widget/Button;

    .line 34
    .line 35
    check-cast v0, Ljava/lang/Iterable;

    .line 36
    .line 37
    instance-of v1, v0, Ljava/util/Collection;

    .line 38
    .line 39
    const/4 v2, 0x1

    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    move-object v1, v0

    .line 43
    check-cast v1, Ljava/util/Collection;

    .line 44
    .line 45
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_0

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_2

    .line 61
    .line 62
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    check-cast v1, Ljava/lang/String;

    .line 67
    .line 68
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-lez v1, :cond_1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    const/4 v2, 0x0

    .line 76
    :cond_2
    :goto_1
    invoke-virtual {p1, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 77
    .line 78
    .line 79
    iget-object p1, p0, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$2$1;->e:Lcom/friday/lecture/view/LectureDialogFragment;

    .line 80
    .line 81
    invoke-static {p1}, Lcom/friday/lecture/view/LectureDialogFragment;->B(Lcom/friday/lecture/view/LectureDialogFragment;)Lcom/friday/lecture/databinding/LectureDialogFragmentBinding;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iget-object p1, p1, Lcom/friday/lecture/databinding/LectureDialogFragmentBinding;->t:Landroid/widget/Button;

    .line 86
    .line 87
    invoke-virtual {p1}, Landroid/view/View;->isEnabled()Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-eqz p1, :cond_3

    .line 92
    .line 93
    iget-object p1, p0, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$2$1;->e:Lcom/friday/lecture/view/LectureDialogFragment;

    .line 94
    .line 95
    invoke-static {p1}, Lcom/friday/lecture/view/LectureDialogFragment;->B(Lcom/friday/lecture/view/LectureDialogFragment;)Lcom/friday/lecture/databinding/LectureDialogFragmentBinding;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    iget-object p1, p1, Lcom/friday/lecture/databinding/LectureDialogFragmentBinding;->t:Landroid/widget/Button;

    .line 100
    .line 101
    iget-object v0, p0, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$2$1;->e:Lcom/friday/lecture/view/LectureDialogFragment;

    .line 102
    .line 103
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    sget v1, Lcom/friday/lecture/R$color;->white:I

    .line 108
    .line 109
    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 114
    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_3
    iget-object p1, p0, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$2$1;->e:Lcom/friday/lecture/view/LectureDialogFragment;

    .line 118
    .line 119
    invoke-static {p1}, Lcom/friday/lecture/view/LectureDialogFragment;->B(Lcom/friday/lecture/view/LectureDialogFragment;)Lcom/friday/lecture/databinding/LectureDialogFragmentBinding;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    iget-object p1, p1, Lcom/friday/lecture/databinding/LectureDialogFragmentBinding;->t:Landroid/widget/Button;

    .line 124
    .line 125
    iget-object v0, p0, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$2$1;->e:Lcom/friday/lecture/view/LectureDialogFragment;

    .line 126
    .line 127
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    sget v1, Lcom/friday/lecture/R$color;->text_gray:I

    .line 132
    .line 133
    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 138
    .line 139
    .line 140
    :goto_2
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 141
    .line 142
    return-object p1

    .line 143
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 144
    .line 145
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 146
    .line 147
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    throw p1
.end method
