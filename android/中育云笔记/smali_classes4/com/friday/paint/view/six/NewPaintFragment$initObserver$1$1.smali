.class final Lcom/friday/paint/view/six/NewPaintFragment$initObserver$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/view/six/NewPaintFragment$initObserver$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.friday.paint.view.six.NewPaintFragment$initObserver$1$1"
    f = "NewPaintFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public synthetic d:Z

.field public final synthetic e:Lcom/friday/paint/view/six/NewPaintFragment;


# direct methods
.method public constructor <init>(Lcom/friday/paint/view/six/NewPaintFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$1$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

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

.method public static synthetic g(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/Throwable;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$1$1;->n(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/Throwable;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$1$1;->p(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final n(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/Throwable;)Lqc/q;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 3
    .line 4
    .line 5
    const-string p0, "\u8be5\u9875\u6570\u636e\u5f02\u5e38"

    .line 6
    .line 7
    new-array p1, p1, [Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {p0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 13
    .line 14
    return-object p0
.end method

.method public static final p(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;)Lqc/q;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 3
    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    :try_start_0
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    new-instance v4, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$1$1$2$1$1;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-direct {v4, p0, p1, v0}, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$1$1$2$1$1;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;Lvc/c;)V

    .line 15
    .line 16
    .line 17
    const/4 v5, 0x3

    .line 18
    const/4 v6, 0x0

    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    .line 24
    :catch_0
    :cond_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 25
    .line 26
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2

    .line 1
    new-instance v0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$1$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$1$1;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput-boolean p1, v0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$1$1;->d:Z

    .line 15
    .line 16
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$1$1;->invoke(ZLvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(ZLvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$1$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$1$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$1$1;->d:Z

    .line 2
    .line 3
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$1$1;->c:I

    .line 7
    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$1$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/friday/paint/view/six/NewPaintFragment;->getCurrentNoteFragment()Lcom/zykj/view/board/board/BoardFragment;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$1$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-virtual {v0, v1}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$1$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 30
    .line 31
    new-instance v1, Lcom/friday/paint/view/six/b;

    .line 32
    .line 33
    invoke-direct {v1, v0}, Lcom/friday/paint/view/six/b;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;)V

    .line 34
    .line 35
    .line 36
    iget-object v2, p0, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$1$1;->e:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 37
    .line 38
    new-instance v3, Lcom/friday/paint/view/six/c;

    .line 39
    .line 40
    invoke-direct {v3, v2}, Lcom/friday/paint/view/six/c;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;)V

    .line 41
    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    invoke-virtual {v0, p1, v2, v1, v3}, Lcom/friday/paint/view/six/NewPaintFragment;->save(Lcom/zykj/view/board/board/BoardFragment;ZLhd/l;Lhd/l;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 48
    .line 49
    return-object p1

    .line 50
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p1
.end method
