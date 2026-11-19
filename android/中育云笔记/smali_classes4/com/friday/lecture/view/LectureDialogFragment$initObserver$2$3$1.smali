.class final Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$3$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.friday.lecture.view.LectureDialogFragment$initObserver$2$3$1"
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
    iput-object p1, p0, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$3$1;->e:Lcom/friday/lecture/view/LectureDialogFragment;

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
    new-instance v0, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$3$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$3$1;->e:Lcom/friday/lecture/view/LectureDialogFragment;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$3$1;-><init>(Lcom/friday/lecture/view/LectureDialogFragment;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$3$1;->d:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final g(Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$3$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$3$1;

    .line 6
    .line 7
    sget-object p2, Lqc/q;->a:Lqc/q;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$3$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$3$1;->g(Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$3$1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/List;

    .line 4
    .line 5
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$3$1;->c:I

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$3$1;->e:Lcom/friday/lecture/view/LectureDialogFragment;

    .line 16
    .line 17
    invoke-static {p1}, Lcom/friday/lecture/view/LectureDialogFragment;->A(Lcom/friday/lecture/view/LectureDialogFragment;)Lcom/friday/lecture/adapter/KeyboardAdapter;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast v0, Ljava/util/Collection;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setList(Ljava/util/Collection;)V

    .line 24
    .line 25
    .line 26
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 27
    .line 28
    return-object p1

    .line 29
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 32
    .line 33
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p1
.end method
