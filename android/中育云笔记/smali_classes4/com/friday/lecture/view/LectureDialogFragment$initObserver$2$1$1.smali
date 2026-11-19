.class final Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.friday.lecture.view.LectureDialogFragment$initObserver$2$1$1"
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
    iput-object p1, p0, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$1$1;->e:Lcom/friday/lecture/view/LectureDialogFragment;

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
    new-instance v0, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$1$1;->e:Lcom/friday/lecture/view/LectureDialogFragment;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$1$1;-><init>(Lcom/friday/lecture/view/LectureDialogFragment;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$1$1;->d:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final g(Lcom/friday/lecture/model/ConnectMode;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$1$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$1$1;

    .line 6
    .line 7
    sget-object p2, Lqc/q;->a:Lqc/q;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/friday/lecture/model/ConnectMode;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$1$1;->g(Lcom/friday/lecture/model/ConnectMode;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$1$1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/friday/lecture/model/ConnectMode;

    .line 4
    .line 5
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$1$1;->c:I

    .line 9
    .line 10
    if-nez v1, :cond_2

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$1$1;->e:Lcom/friday/lecture/view/LectureDialogFragment;

    .line 16
    .line 17
    invoke-static {p1, v0}, Lcom/friday/lecture/view/LectureDialogFragment;->x(Lcom/friday/lecture/view/LectureDialogFragment;Lcom/friday/lecture/model/ConnectMode;)Landroid/text/Spanned;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    iget-object v1, p0, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$1$1;->e:Lcom/friday/lecture/view/LectureDialogFragment;

    .line 24
    .line 25
    invoke-static {v1}, Lcom/friday/lecture/view/LectureDialogFragment;->B(Lcom/friday/lecture/view/LectureDialogFragment;)Lcom/friday/lecture/databinding/LectureDialogFragmentBinding;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iget-object v1, v1, Lcom/friday/lecture/databinding/LectureDialogFragmentBinding;->B:Landroid/widget/TextView;

    .line 30
    .line 31
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    iget-object p1, p0, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$1$1;->e:Lcom/friday/lecture/view/LectureDialogFragment;

    .line 35
    .line 36
    invoke-static {p1}, Lcom/friday/lecture/view/LectureDialogFragment;->B(Lcom/friday/lecture/view/LectureDialogFragment;)Lcom/friday/lecture/databinding/LectureDialogFragmentBinding;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iget-object p1, p1, Lcom/friday/lecture/databinding/LectureDialogFragmentBinding;->F:Landroid/widget/TextView;

    .line 41
    .line 42
    sget-object v1, Lcom/friday/lecture/model/ConnectMode$IP;->INSTANCE:Lcom/friday/lecture/model/ConnectMode$IP;

    .line 43
    .line 44
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    iget-object v2, p0, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$1$1;->e:Lcom/friday/lecture/view/LectureDialogFragment;

    .line 51
    .line 52
    sget v3, Lcom/friday/lecture/R$string;->join_class_password_six:I

    .line 53
    .line 54
    invoke-virtual {v2, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    goto :goto_0

    .line 59
    :cond_1
    iget-object v2, p0, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$1$1;->e:Lcom/friday/lecture/view/LectureDialogFragment;

    .line 60
    .line 61
    sget v3, Lcom/friday/lecture/R$string;->join_class_password:I

    .line 62
    .line 63
    invoke-virtual {v2, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    :goto_0
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 68
    .line 69
    .line 70
    iget-object p1, p0, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$1$1;->e:Lcom/friday/lecture/view/LectureDialogFragment;

    .line 71
    .line 72
    invoke-static {p1}, Lcom/friday/lecture/view/LectureDialogFragment;->B(Lcom/friday/lecture/view/LectureDialogFragment;)Lcom/friday/lecture/databinding/LectureDialogFragmentBinding;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iget-object p1, p1, Lcom/friday/lecture/databinding/LectureDialogFragmentBinding;->A:Landroidx/appcompat/widget/AppCompatTextView;

    .line 77
    .line 78
    sget-object v2, Lcom/friday/lecture/model/ConnectMode$Code;->INSTANCE:Lcom/friday/lecture/model/ConnectMode$Code;

    .line 79
    .line 80
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    invoke-virtual {p1, v2}, Landroid/view/View;->setSelected(Z)V

    .line 85
    .line 86
    .line 87
    iget-object p1, p0, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$1$1;->e:Lcom/friday/lecture/view/LectureDialogFragment;

    .line 88
    .line 89
    invoke-static {p1}, Lcom/friday/lecture/view/LectureDialogFragment;->B(Lcom/friday/lecture/view/LectureDialogFragment;)Lcom/friday/lecture/databinding/LectureDialogFragmentBinding;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    iget-object p1, p1, Lcom/friday/lecture/databinding/LectureDialogFragmentBinding;->G:Landroidx/appcompat/widget/AppCompatTextView;

    .line 94
    .line 95
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    invoke-virtual {p1, v1}, Landroid/view/View;->setSelected(Z)V

    .line 100
    .line 101
    .line 102
    iget-object p1, p0, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$1$1;->e:Lcom/friday/lecture/view/LectureDialogFragment;

    .line 103
    .line 104
    invoke-static {p1}, Lcom/friday/lecture/view/LectureDialogFragment;->A(Lcom/friday/lecture/view/LectureDialogFragment;)Lcom/friday/lecture/adapter/KeyboardAdapter;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-virtual {p1, v0}, Lcom/friday/lecture/adapter/KeyboardAdapter;->l(Lcom/friday/lecture/model/ConnectMode;)V

    .line 109
    .line 110
    .line 111
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 112
    .line 113
    return-object p1

    .line 114
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 115
    .line 116
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 117
    .line 118
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw p1
.end method
