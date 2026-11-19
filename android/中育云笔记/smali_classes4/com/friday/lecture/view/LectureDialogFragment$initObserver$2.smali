.class final Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/lecture/view/LectureDialogFragment;->initObserver()V
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
    c = "com.friday.lecture.view.LectureDialogFragment$initObserver$2"
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
    iput-object p1, p0, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2;->e:Lcom/friday/lecture/view/LectureDialogFragment;

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
    new-instance v0, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2;->e:Lcom/friday/lecture/view/LectureDialogFragment;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2;-><init>(Lcom/friday/lecture/view/LectureDialogFragment;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2;->d:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2;->d:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Lsd/i0;

    .line 5
    .line 6
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    iget v0, p0, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2;->c:I

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    new-instance v4, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$1;

    .line 17
    .line 18
    iget-object p1, p0, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2;->e:Lcom/friday/lecture/view/LectureDialogFragment;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-direct {v4, p1, v0}, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$1;-><init>(Lcom/friday/lecture/view/LectureDialogFragment;Lvc/c;)V

    .line 22
    .line 23
    .line 24
    const/4 v5, 0x3

    .line 25
    const/4 v6, 0x0

    .line 26
    const/4 v2, 0x0

    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 29
    .line 30
    .line 31
    new-instance v4, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$2;

    .line 32
    .line 33
    iget-object p1, p0, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2;->e:Lcom/friday/lecture/view/LectureDialogFragment;

    .line 34
    .line 35
    invoke-direct {v4, p1, v0}, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$2;-><init>(Lcom/friday/lecture/view/LectureDialogFragment;Lvc/c;)V

    .line 36
    .line 37
    .line 38
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 39
    .line 40
    .line 41
    new-instance v4, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$3;

    .line 42
    .line 43
    iget-object p1, p0, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2;->e:Lcom/friday/lecture/view/LectureDialogFragment;

    .line 44
    .line 45
    invoke-direct {v4, p1, v0}, Lcom/friday/lecture/view/LectureDialogFragment$initObserver$2$3;-><init>(Lcom/friday/lecture/view/LectureDialogFragment;Lvc/c;)V

    .line 46
    .line 47
    .line 48
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 49
    .line 50
    .line 51
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 52
    .line 53
    return-object p1

    .line 54
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p1
.end method
