.class final Lcom/zykj/study/ui/home/my/TeacherFragment$initView$3;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/my/TeacherFragment;->initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
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
    c = "com.zykj.study.ui.home.my.TeacherFragment$initView$3"
    f = "TeacherFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/study/ui/home/my/TeacherFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/my/TeacherFragment;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/TeacherFragment$initView$3;->b:Lcom/zykj/study/ui/home/my/TeacherFragment;

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

.method public static synthetic c(Lcom/zykj/study/ui/home/my/TeacherFragment;Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;Ly2/f;Ly2/f;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/study/ui/home/my/TeacherFragment$initView$3;->k(Lcom/zykj/study/ui/home/my/TeacherFragment;Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;Ly2/f;Ly2/f;I)V

    return-void
.end method

.method public static synthetic d(Lcom/zykj/study/ui/home/my/TeacherFragment;Ly2/g;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/home/my/TeacherFragment$initView$3;->l(Lcom/zykj/study/ui/home/my/TeacherFragment;Ly2/g;I)V

    return-void
.end method

.method public static final k(Lcom/zykj/study/ui/home/my/TeacherFragment;Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;Ly2/f;Ly2/f;I)V
    .locals 0

    .line 1
    new-instance p2, Ly2/i;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {p2, p0}, Ly2/i;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    sget p0, Lcom/zykj/study/R$string;->remove:I

    .line 11
    .line 12
    invoke-virtual {p2, p0}, Ly2/i;->m(I)Ly2/i;

    .line 13
    .line 14
    .line 15
    const/4 p0, -0x1

    .line 16
    invoke-virtual {p2, p0}, Ly2/i;->l(I)Ly2/i;

    .line 17
    .line 18
    .line 19
    sget p0, Lcom/zykj/study/R$color;->white:I

    .line 20
    .line 21
    invoke-virtual {p2, p0}, Ly2/i;->p(I)Ly2/i;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    sget p4, Lcom/zykj/lib/ui/R$dimen;->view_50:I

    .line 29
    .line 30
    invoke-virtual {p0, p4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    invoke-virtual {p2, p0}, Ly2/i;->q(I)Ly2/i;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    sget p1, Lcom/zykj/sketch/R$color;->app_red:I

    .line 42
    .line 43
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getColor(I)I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    invoke-virtual {p2, p0}, Ly2/i;->k(I)Ly2/i;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p3, p2}, Ly2/f;->a(Ly2/i;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public static final l(Lcom/zykj/study/ui/home/my/TeacherFragment;Ly2/g;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ly2/g;->a()V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lcom/zykj/study/ui/home/my/TeacherFragment;->m(Lcom/zykj/study/ui/home/my/TeacherFragment;)Lcom/zykj/study/adapter/MyTeachCourseAdapter;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    const-string p1, "myCourseAdapter"

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    :cond_0
    invoke-virtual {p1, p2}, Landroidx/paging/PagingDataAdapter;->peek(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Lcom/zykj/study/bean/course/CourseDetailsBean;

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/TeacherFragment;->p(Lcom/zykj/study/ui/home/my/TeacherFragment;Lcom/zykj/study/bean/course/CourseDetailsBean;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/zykj/study/ui/home/my/TeacherFragment$initView$3;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/TeacherFragment$initView$3;->b:Lcom/zykj/study/ui/home/my/TeacherFragment;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/zykj/study/ui/home/my/TeacherFragment$initView$3;-><init>(Lcom/zykj/study/ui/home/my/TeacherFragment;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/my/TeacherFragment$initView$3;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/ui/home/my/TeacherFragment$initView$3;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/home/my/TeacherFragment$initView$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/my/TeacherFragment$initView$3;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/study/ui/home/my/TeacherFragment$initView$3;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/TeacherFragment$initView$3;->b:Lcom/zykj/study/ui/home/my/TeacherFragment;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lcom/zykj/study/databinding/FragmentTeacherBinding;

    .line 18
    .line 19
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentTeacherBinding;->rvCourse:Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;

    .line 20
    .line 21
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/TeacherFragment$initView$3;->b:Lcom/zykj/study/ui/home/my/TeacherFragment;

    .line 22
    .line 23
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v0, p1}, Lcom/zykj/study/ui/home/my/TeacherFragment;->l(Lcom/zykj/study/ui/home/my/TeacherFragment;Landroidx/recyclerview/widget/RecyclerView;)V

    .line 27
    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-virtual {p1, v1}, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->setItemViewSwipeEnabled(Z)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v1}, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->setLongPressDragEnabled(Z)V

    .line 34
    .line 35
    .line 36
    new-instance v1, Lcom/zykj/study/ui/home/my/r;

    .line 37
    .line 38
    invoke-direct {v1, v0, p1}, Lcom/zykj/study/ui/home/my/r;-><init>(Lcom/zykj/study/ui/home/my/TeacherFragment;Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v1}, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->setSwipeMenuCreator(Ly2/h;)V

    .line 42
    .line 43
    .line 44
    new-instance v1, Lcom/zykj/study/ui/home/my/s;

    .line 45
    .line 46
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/my/s;-><init>(Lcom/zykj/study/ui/home/my/TeacherFragment;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v1}, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->setOnItemMenuClickListener(Ly2/e;)V

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, Lcom/zykj/study/ui/home/my/TeacherFragment;->m(Lcom/zykj/study/ui/home/my/TeacherFragment;)Lcom/zykj/study/adapter/MyTeachCourseAdapter;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-nez v0, :cond_0

    .line 57
    .line 58
    const-string v0, "myCourseAdapter"

    .line 59
    .line 60
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const/4 v0, 0x0

    .line 64
    :cond_0
    invoke-virtual {p1, v0}, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 65
    .line 66
    .line 67
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 68
    .line 69
    return-object p1

    .line 70
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 71
    .line 72
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 73
    .line 74
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw p1
.end method
