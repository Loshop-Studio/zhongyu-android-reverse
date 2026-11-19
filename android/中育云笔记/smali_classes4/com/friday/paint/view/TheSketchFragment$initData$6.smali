.class final Lcom/friday/paint/view/TheSketchFragment$initData$6;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/view/TheSketchFragment;->initData()V
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
    c = "com.friday.paint.view.TheSketchFragment$initData$6"
    f = "TheSketchFragment.kt"
    l = {
        0x78
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/paint/view/TheSketchFragment;


# direct methods
.method public constructor <init>(Lcom/friday/paint/view/TheSketchFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/view/TheSketchFragment$initData$6;->d:Lcom/friday/paint/view/TheSketchFragment;

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
    invoke-static {p0, p1}, Lcom/friday/paint/view/TheSketchFragment$initData$6;->m(Lcom/friday/paint/view/TheSketchFragment;Ljava/lang/String;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final m(Lcom/friday/paint/view/TheSketchFragment;Ljava/lang/String;)Lqc/q;
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/friday/paint/view/TheSketchFragment;->M(Lcom/friday/paint/view/TheSketchFragment;)Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-virtual {p1, v0}, Lcom/friday/paint/viewmodel/NoteViewModel;->W(Z)V

    .line 7
    .line 8
    .line 9
    invoke-static {p0, v0}, Lcom/friday/paint/view/TheSketchFragment;->N(Lcom/friday/paint/view/TheSketchFragment;Z)V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    invoke-virtual {p0, p1}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 14
    .line 15
    .line 16
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 17
    .line 18
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/friday/paint/view/TheSketchFragment$initData$6;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/paint/view/TheSketchFragment$initData$6;->d:Lcom/friday/paint/view/TheSketchFragment;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/paint/view/TheSketchFragment$initData$6;-><init>(Lcom/friday/paint/view/TheSketchFragment;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/TheSketchFragment$initData$6;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/TheSketchFragment$initData$6;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/paint/view/TheSketchFragment$initData$6;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/paint/view/TheSketchFragment$initData$6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/paint/view/TheSketchFragment$initData$6;->c:I

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
    iput v2, p0, Lcom/friday/paint/view/TheSketchFragment$initData$6;->c:I

    .line 28
    .line 29
    const-wide/16 v1, 0xc8

    .line 30
    .line 31
    invoke-static {v1, v2, p0}, Lkotlinx/coroutines/DelayKt;->b(JLvc/c;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    if-ne p1, v0, :cond_2

    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/friday/paint/view/TheSketchFragment$initData$6;->d:Lcom/friday/paint/view/TheSketchFragment;

    .line 39
    .line 40
    invoke-static {p1}, Lcom/friday/paint/view/TheSketchFragment;->K(Lcom/friday/paint/view/TheSketchFragment;)Lcom/friday/paint/databinding/FragmentTheSketchBinding;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentTheSketchBinding;->c:Lcom/zykj/sketch/core/record/SketchRecorderView;

    .line 45
    .line 46
    iget-object v0, p0, Lcom/friday/paint/view/TheSketchFragment$initData$6;->d:Lcom/friday/paint/view/TheSketchFragment;

    .line 47
    .line 48
    new-instance v1, Lcom/friday/paint/view/f;

    .line 49
    .line 50
    invoke-direct {v1, v0}, Lcom/friday/paint/view/f;-><init>(Lcom/friday/paint/view/TheSketchFragment;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, v1}, Lcom/zykj/sketch/core/record/SketchRecorderView;->getRecordPath(Lhd/l;)V

    .line 54
    .line 55
    .line 56
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 57
    .line 58
    return-object p1
.end method
