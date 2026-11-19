.class final Lcom/zykj/study/ui/home/study/StudyListFragment$initView$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/study/StudyListFragment$initView$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.zykj.study.ui.home.study.StudyListFragment$initView$2$1"
    f = "StudyListFragment.kt"
    l = {
        0x58
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Z

.field public final synthetic c:Lcom/zykj/study/ui/home/study/StudyListFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/study/StudyListFragment;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/study/StudyListFragment$initView$2$1;->c:Lcom/zykj/study/ui/home/study/StudyListFragment;

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
    new-instance v0, Lcom/zykj/study/ui/home/study/StudyListFragment$initView$2$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/study/ui/home/study/StudyListFragment$initView$2$1;->c:Lcom/zykj/study/ui/home/study/StudyListFragment;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/zykj/study/ui/home/study/StudyListFragment$initView$2$1;-><init>(Lcom/zykj/study/ui/home/study/StudyListFragment;Lm7/c;)V

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
    iput-boolean p1, v0, Lcom/zykj/study/ui/home/study/StudyListFragment$initView$2$1;->b:Z

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

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/study/StudyListFragment$initView$2$1;->invoke(ZLm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(ZLm7/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/study/StudyListFragment$initView$2$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/ui/home/study/StudyListFragment$initView$2$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/home/study/StudyListFragment$initView$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/zykj/study/ui/home/study/StudyListFragment$initView$2$1;->b:Z

    .line 2
    .line 3
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget v2, p0, Lcom/zykj/study/ui/home/study/StudyListFragment$initView$2$1;->a:I

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    if-ne v2, v3, :cond_0

    .line 13
    .line 14
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1

    .line 26
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    if-eqz v0, :cond_4

    .line 30
    .line 31
    iget-object p1, p0, Lcom/zykj/study/ui/home/study/StudyListFragment$initView$2$1;->c:Lcom/zykj/study/ui/home/study/StudyListFragment;

    .line 32
    .line 33
    invoke-static {p1}, Lcom/zykj/study/ui/home/study/StudyListFragment;->k(Lcom/zykj/study/ui/home/study/StudyListFragment;)Lcom/zykj/study/adapter/CourseStudyAdapter;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-nez p1, :cond_2

    .line 38
    .line 39
    const-string p1, "courseStudyAdapter"

    .line 40
    .line 41
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    :cond_2
    invoke-virtual {p1}, Landroidx/paging/PagingDataAdapter;->refresh()V

    .line 46
    .line 47
    .line 48
    iput-boolean v0, p0, Lcom/zykj/study/ui/home/study/StudyListFragment$initView$2$1;->b:Z

    .line 49
    .line 50
    iput v3, p0, Lcom/zykj/study/ui/home/study/StudyListFragment$initView$2$1;->a:I

    .line 51
    .line 52
    const-wide/16 v2, 0x1f4

    .line 53
    .line 54
    invoke-static {v2, v3, p0}, Lkotlinx/coroutines/DelayKt;->b(JLm7/c;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-ne p1, v1, :cond_3

    .line 59
    .line 60
    return-object v1

    .line 61
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/zykj/study/ui/home/study/StudyListFragment$initView$2$1;->c:Lcom/zykj/study/ui/home/study/StudyListFragment;

    .line 62
    .line 63
    invoke-static {p1}, Lcom/zykj/study/ui/home/study/StudyListFragment;->l(Lcom/zykj/study/ui/home/study/StudyListFragment;)Lcom/zykj/study/viewmodels/NotifyDataChangedViewModel;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    const/4 v0, 0x0

    .line 68
    invoke-virtual {p1, v0}, Lcom/zykj/study/viewmodels/NotifyDataChangedViewModel;->c(Z)V

    .line 69
    .line 70
    .line 71
    :cond_4
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 72
    .line 73
    return-object p1
.end method
