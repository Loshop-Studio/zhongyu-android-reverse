.class final Lcom/friday/paint/view/TheSketchFragment$initData$8$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/view/TheSketchFragment$initData$8;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.friday.paint.view.TheSketchFragment$initData$8$1"
    f = "TheSketchFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public synthetic d:Z

.field public final synthetic e:Lcom/friday/paint/view/TheSketchFragment;


# direct methods
.method public constructor <init>(Lcom/friday/paint/view/TheSketchFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/view/TheSketchFragment$initData$8$1;->e:Lcom/friday/paint/view/TheSketchFragment;

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

.method public static synthetic g(Lcom/friday/paint/view/TheSketchFragment;Ljava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/TheSketchFragment$initData$8$1;->m(Lcom/friday/paint/view/TheSketchFragment;Ljava/lang/String;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method private static final m(Lcom/friday/paint/view/TheSketchFragment;Ljava/lang/String;)Lqc/q;
    .locals 8

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "getViewLifecycleOwner(...)"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    new-instance v5, Lcom/friday/paint/view/TheSketchFragment$initData$8$1$1$1;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {v5, p1, p0, v0}, Lcom/friday/paint/view/TheSketchFragment$initData$8$1$1$1;-><init>(Ljava/lang/String;Lcom/friday/paint/view/TheSketchFragment;Lvc/c;)V

    .line 18
    .line 19
    .line 20
    const/4 v6, 0x3

    .line 21
    const/4 v7, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-static/range {v2 .. v7}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    :catch_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 28
    .line 29
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2

    .line 1
    new-instance v0, Lcom/friday/paint/view/TheSketchFragment$initData$8$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/paint/view/TheSketchFragment$initData$8$1;->e:Lcom/friday/paint/view/TheSketchFragment;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/friday/paint/view/TheSketchFragment$initData$8$1;-><init>(Lcom/friday/paint/view/TheSketchFragment;Lvc/c;)V

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
    iput-boolean p1, v0, Lcom/friday/paint/view/TheSketchFragment$initData$8$1;->d:Z

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/TheSketchFragment$initData$8$1;->invoke(ZLvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(ZLvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/TheSketchFragment$initData$8$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/paint/view/TheSketchFragment$initData$8$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/paint/view/TheSketchFragment$initData$8$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/friday/paint/view/TheSketchFragment$initData$8$1;->d:Z

    .line 2
    .line 3
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lcom/friday/paint/view/TheSketchFragment$initData$8$1;->c:I

    .line 7
    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, Lcom/friday/paint/view/TheSketchFragment$initData$8$1;->e:Lcom/friday/paint/view/TheSketchFragment;

    .line 16
    .line 17
    invoke-static {p1}, Lcom/friday/paint/view/TheSketchFragment;->K(Lcom/friday/paint/view/TheSketchFragment;)Lcom/friday/paint/databinding/FragmentTheSketchBinding;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentTheSketchBinding;->c:Lcom/zykj/sketch/core/record/SketchRecorderView;

    .line 22
    .line 23
    iget-object v0, p0, Lcom/friday/paint/view/TheSketchFragment$initData$8$1;->e:Lcom/friday/paint/view/TheSketchFragment;

    .line 24
    .line 25
    new-instance v1, Lcom/friday/paint/view/g;

    .line 26
    .line 27
    invoke-direct {v1, v0}, Lcom/friday/paint/view/g;-><init>(Lcom/friday/paint/view/TheSketchFragment;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v1}, Lcom/zykj/sketch/core/record/SketchRecorderView;->getRecordPath(Lhd/l;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 34
    .line 35
    return-object p1

    .line 36
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 37
    .line 38
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p1
.end method
