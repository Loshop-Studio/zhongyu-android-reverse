.class final Lcom/zykj/study/ui/home/study/StudyListFragment$initData$5;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/study/StudyListFragment;->initData(Lm7/c;)Ljava/lang/Object;
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
    c = "com.zykj.study.ui.home.study.StudyListFragment$initData$5"
    f = "StudyListFragment.kt"
    l = {
        0x42
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/study/ui/home/study/StudyListFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/study/StudyListFragment;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/study/StudyListFragment$initData$5;->b:Lcom/zykj/study/ui/home/study/StudyListFragment;

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

.method public static synthetic c(Landroidx/paging/CombinedLoadStates;)Landroidx/paging/LoadStates;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/study/StudyListFragment$initData$5;->d(Landroidx/paging/CombinedLoadStates;)Landroidx/paging/LoadStates;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/paging/CombinedLoadStates;)Landroidx/paging/LoadStates;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/paging/CombinedLoadStates;->getSource()Landroidx/paging/LoadStates;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/zykj/study/ui/home/study/StudyListFragment$initData$5;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/ui/home/study/StudyListFragment$initData$5;->b:Lcom/zykj/study/ui/home/study/StudyListFragment;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/zykj/study/ui/home/study/StudyListFragment$initData$5;-><init>(Lcom/zykj/study/ui/home/study/StudyListFragment;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/study/StudyListFragment$initData$5;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/ui/home/study/StudyListFragment$initData$5;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/home/study/StudyListFragment$initData$5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/study/StudyListFragment$initData$5;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/study/ui/home/study/StudyListFragment$initData$5;->a:I

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
    iget-object p1, p0, Lcom/zykj/study/ui/home/study/StudyListFragment$initData$5;->b:Lcom/zykj/study/ui/home/study/StudyListFragment;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/zykj/study/ui/home/study/StudyListFragment;->k(Lcom/zykj/study/ui/home/study/StudyListFragment;)Lcom/zykj/study/adapter/CourseStudyAdapter;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    if-nez p1, :cond_2

    .line 34
    .line 35
    const-string p1, "courseStudyAdapter"

    .line 36
    .line 37
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 p1, 0x0

    .line 41
    :cond_2
    invoke-virtual {p1}, Landroidx/paging/PagingDataAdapter;->getLoadStateFlow()Ll8/c;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    new-instance v1, Lcom/zykj/study/ui/home/study/c;

    .line 46
    .line 47
    invoke-direct {v1}, Lcom/zykj/study/ui/home/study/c;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-static {p1, v1}, Ll8/e;->q(Ll8/c;Lx7/l;)Ll8/c;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    new-instance v1, Lcom/zykj/study/ui/home/study/StudyListFragment$initData$5$invokeSuspend$$inlined$filter$1;

    .line 55
    .line 56
    invoke-direct {v1, p1}, Lcom/zykj/study/ui/home/study/StudyListFragment$initData$5$invokeSuspend$$inlined$filter$1;-><init>(Ll8/c;)V

    .line 57
    .line 58
    .line 59
    new-instance p1, Lcom/zykj/study/ui/home/study/StudyListFragment$initData$5$a;

    .line 60
    .line 61
    iget-object v3, p0, Lcom/zykj/study/ui/home/study/StudyListFragment$initData$5;->b:Lcom/zykj/study/ui/home/study/StudyListFragment;

    .line 62
    .line 63
    invoke-direct {p1, v3}, Lcom/zykj/study/ui/home/study/StudyListFragment$initData$5$a;-><init>(Lcom/zykj/study/ui/home/study/StudyListFragment;)V

    .line 64
    .line 65
    .line 66
    iput v2, p0, Lcom/zykj/study/ui/home/study/StudyListFragment$initData$5;->a:I

    .line 67
    .line 68
    invoke-interface {v1, p1, p0}, Ll8/c;->collect(Ll8/d;Lm7/c;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    if-ne p1, v0, :cond_3

    .line 73
    .line 74
    return-object v0

    .line 75
    :cond_3
    :goto_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 76
    .line 77
    return-object p1
.end method
