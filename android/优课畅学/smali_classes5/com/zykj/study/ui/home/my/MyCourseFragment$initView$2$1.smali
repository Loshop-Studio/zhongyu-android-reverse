.class final Lcom/zykj/study/ui/home/my/MyCourseFragment$initView$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/my/MyCourseFragment$initView$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.zykj.study.ui.home.my.MyCourseFragment$initView$2$1"
    f = "MyCourseFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Z

.field public final synthetic c:Lcom/zykj/study/ui/home/my/MyCourseFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/my/MyCourseFragment;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/MyCourseFragment$initView$2$1;->c:Lcom/zykj/study/ui/home/my/MyCourseFragment;

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
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/study/ui/home/my/MyCourseFragment$initView$2$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/study/ui/home/my/MyCourseFragment$initView$2$1;->c:Lcom/zykj/study/ui/home/my/MyCourseFragment;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/zykj/study/ui/home/my/MyCourseFragment$initView$2$1;-><init>(Lcom/zykj/study/ui/home/my/MyCourseFragment;Lm7/c;)V

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
    iput-boolean p1, v0, Lcom/zykj/study/ui/home/my/MyCourseFragment$initView$2$1;->b:Z

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

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/my/MyCourseFragment$initView$2$1;->invoke(ZLm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(ZLm7/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/my/MyCourseFragment$initView$2$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/ui/home/my/MyCourseFragment$initView$2$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/home/my/MyCourseFragment$initView$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/zykj/study/ui/home/my/MyCourseFragment$initView$2$1;->b:Z

    .line 2
    .line 3
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lcom/zykj/study/ui/home/my/MyCourseFragment$initView$2$1;->a:I

    .line 7
    .line 8
    if-nez v1, :cond_2

    .line 9
    .line 10
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/MyCourseFragment$initView$2$1;->c:Lcom/zykj/study/ui/home/my/MyCourseFragment;

    .line 16
    .line 17
    invoke-static {p1}, Lcom/zykj/study/ui/home/my/MyCourseFragment;->l(Lcom/zykj/study/ui/home/my/MyCourseFragment;)Lcom/zykj/study/adapter/MyCourseAdapter;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    const-string p1, "myCourseAdapter"

    .line 24
    .line 25
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    :cond_0
    invoke-virtual {p1}, Landroidx/paging/PagingDataAdapter;->refresh()V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/MyCourseFragment$initView$2$1;->c:Lcom/zykj/study/ui/home/my/MyCourseFragment;

    .line 33
    .line 34
    invoke-static {p1}, Lcom/zykj/study/ui/home/my/MyCourseFragment;->n(Lcom/zykj/study/ui/home/my/MyCourseFragment;)Lcom/zykj/study/viewmodels/NotifyDataChangedViewModel;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-virtual {p1, v0}, Lcom/zykj/study/viewmodels/NotifyDataChangedViewModel;->c(Z)V

    .line 40
    .line 41
    .line 42
    :cond_1
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 43
    .line 44
    return-object p1

    .line 45
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1
.end method
