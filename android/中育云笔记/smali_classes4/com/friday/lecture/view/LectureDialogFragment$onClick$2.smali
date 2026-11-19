.class final Lcom/friday/lecture/view/LectureDialogFragment$onClick$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/lecture/view/LectureDialogFragment;->onClick(Landroid/view/View;)V
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
    c = "com.friday.lecture.view.LectureDialogFragment$onClick$2"
    f = "LectureDialogFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/lecture/view/LectureDialogFragment;


# direct methods
.method public constructor <init>(Lcom/friday/lecture/view/LectureDialogFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/lecture/view/LectureDialogFragment$onClick$2;->d:Lcom/friday/lecture/view/LectureDialogFragment;

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
    .locals 1

    .line 1
    new-instance p1, Lcom/friday/lecture/view/LectureDialogFragment$onClick$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/lecture/view/LectureDialogFragment$onClick$2;->d:Lcom/friday/lecture/view/LectureDialogFragment;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/lecture/view/LectureDialogFragment$onClick$2;-><init>(Lcom/friday/lecture/view/LectureDialogFragment;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/lecture/view/LectureDialogFragment$onClick$2;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/lecture/view/LectureDialogFragment$onClick$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/lecture/view/LectureDialogFragment$onClick$2;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/lecture/view/LectureDialogFragment$onClick$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/friday/lecture/view/LectureDialogFragment$onClick$2;->c:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/friday/lecture/view/LectureDialogFragment$onClick$2;->d:Lcom/friday/lecture/view/LectureDialogFragment;

    .line 12
    .line 13
    invoke-static {p1}, Lcom/friday/lecture/view/LectureDialogFragment;->C(Lcom/friday/lecture/view/LectureDialogFragment;)Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->o()Landroidx/lifecycle/MutableLiveData;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    new-instance v0, Le2/a;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-static {v1}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-direct {v0, v1}, Le2/a;-><init>(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lcom/friday/lecture/view/LectureDialogFragment$onClick$2;->d:Lcom/friday/lecture/view/LectureDialogFragment;

    .line 35
    .line 36
    invoke-static {p1}, Lcom/friday/lecture/view/LectureDialogFragment;->C(Lcom/friday/lecture/view/LectureDialogFragment;)Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->m()V

    .line 41
    .line 42
    .line 43
    const-string p1, "EndInClassTest"

    .line 44
    .line 45
    invoke-static {p1}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const/4 v0, 0x0

    .line 50
    invoke-interface {p1, v0}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    const-string p1, "\u5df2\u79bb\u5f00\u8bfe\u5802"

    .line 54
    .line 55
    invoke-static {p1}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Lcom/friday/lecture/view/LectureDialogFragment$onClick$2;->d:Lcom/friday/lecture/view/LectureDialogFragment;

    .line 59
    .line 60
    invoke-static {p1}, Lcom/friday/lecture/view/LectureDialogFragment;->y(Lcom/friday/lecture/view/LectureDialogFragment;)V

    .line 61
    .line 62
    .line 63
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 64
    .line 65
    return-object p1

    .line 66
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 67
    .line 68
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 69
    .line 70
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p1
.end method
