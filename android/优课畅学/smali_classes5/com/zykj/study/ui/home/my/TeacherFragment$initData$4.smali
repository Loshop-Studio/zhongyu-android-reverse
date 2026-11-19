.class final Lcom/zykj/study/ui/home/my/TeacherFragment$initData$4;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/my/TeacherFragment;->initData(Lm7/c;)Ljava/lang/Object;
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
    c = "com.zykj.study.ui.home.my.TeacherFragment$initData$4"
    f = "TeacherFragment.kt"
    l = {
        0x43
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/study/ui/home/my/TeacherFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/my/TeacherFragment;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/TeacherFragment$initData$4;->b:Lcom/zykj/study/ui/home/my/TeacherFragment;

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

.method public static synthetic c(Lcom/zykj/study/ui/home/my/TeacherFragment;)Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/my/TeacherFragment$initData$4;->l(Lcom/zykj/study/ui/home/my/TeacherFragment;)Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/zykj/study/ui/home/my/TeacherFragment;)Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/my/TeacherFragment$initData$4;->k(Lcom/zykj/study/ui/home/my/TeacherFragment;)Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;

    move-result-object p0

    return-object p0
.end method

.method public static final k(Lcom/zykj/study/ui/home/my/TeacherFragment;)Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/zykj/study/databinding/FragmentTeacherBinding;

    .line 6
    .line 7
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentTeacherBinding;->msCourse:Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;

    .line 8
    .line 9
    return-object p0
.end method

.method public static final l(Lcom/zykj/study/ui/home/my/TeacherFragment;)Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/zykj/study/databinding/FragmentTeacherBinding;

    .line 6
    .line 7
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentTeacherBinding;->sfCourse:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/zykj/study/ui/home/my/TeacherFragment$initData$4;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/TeacherFragment$initData$4;->b:Lcom/zykj/study/ui/home/my/TeacherFragment;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/zykj/study/ui/home/my/TeacherFragment$initData$4;-><init>(Lcom/zykj/study/ui/home/my/TeacherFragment;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/my/TeacherFragment$initData$4;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/ui/home/my/TeacherFragment$initData$4;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/home/my/TeacherFragment$initData$4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/my/TeacherFragment$initData$4;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/study/ui/home/my/TeacherFragment$initData$4;->a:I

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
    iget-object v1, p0, Lcom/zykj/study/ui/home/my/TeacherFragment$initData$4;->b:Lcom/zykj/study/ui/home/my/TeacherFragment;

    .line 28
    .line 29
    invoke-static {v1}, Lcom/zykj/study/ui/home/my/TeacherFragment;->m(Lcom/zykj/study/ui/home/my/TeacherFragment;)Lcom/zykj/study/adapter/MyTeachCourseAdapter;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    if-nez p1, :cond_2

    .line 34
    .line 35
    const-string p1, "myCourseAdapter"

    .line 36
    .line 37
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 p1, 0x0

    .line 41
    :cond_2
    iget-object v3, p0, Lcom/zykj/study/ui/home/my/TeacherFragment$initData$4;->b:Lcom/zykj/study/ui/home/my/TeacherFragment;

    .line 42
    .line 43
    move-object v4, v3

    .line 44
    new-instance v3, Lcom/zykj/study/ui/home/my/p;

    .line 45
    .line 46
    invoke-direct {v3, v4}, Lcom/zykj/study/ui/home/my/p;-><init>(Lcom/zykj/study/ui/home/my/TeacherFragment;)V

    .line 47
    .line 48
    .line 49
    iget-object v4, p0, Lcom/zykj/study/ui/home/my/TeacherFragment$initData$4;->b:Lcom/zykj/study/ui/home/my/TeacherFragment;

    .line 50
    .line 51
    move-object v5, v4

    .line 52
    new-instance v4, Lcom/zykj/study/ui/home/my/q;

    .line 53
    .line 54
    invoke-direct {v4, v5}, Lcom/zykj/study/ui/home/my/q;-><init>(Lcom/zykj/study/ui/home/my/TeacherFragment;)V

    .line 55
    .line 56
    .line 57
    iput v2, p0, Lcom/zykj/study/ui/home/my/TeacherFragment$initData$4;->a:I

    .line 58
    .line 59
    const/4 v5, 0x0

    .line 60
    const/4 v6, 0x0

    .line 61
    const/16 v8, 0x18

    .line 62
    .line 63
    const/4 v9, 0x0

    .line 64
    move-object v7, p0

    .line 65
    move-object v2, p1

    .line 66
    invoke-static/range {v1 .. v9}, Lcom/zykj/study/utils/BaseFragmentExtKt;->d(Lcom/zykj/base/BaseFragment;Landroidx/paging/PagingDataAdapter;Lx7/a;Lx7/a;Lx7/a;ZLm7/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-ne p1, v0, :cond_3

    .line 71
    .line 72
    return-object v0

    .line 73
    :cond_3
    :goto_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 74
    .line 75
    return-object p1
.end method
