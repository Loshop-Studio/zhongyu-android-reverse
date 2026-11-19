.class final Lcom/zykj/study/ui/home/find/CourseFragment$initView$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/find/CourseFragment;->initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
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
    c = "com.zykj.study.ui.home.find.CourseFragment$initView$2"
    f = "CourseFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/study/ui/home/find/CourseFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/find/CourseFragment;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/find/CourseFragment$initView$2;->b:Lcom/zykj/study/ui/home/find/CourseFragment;

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
    .locals 1

    .line 1
    new-instance p1, Lcom/zykj/study/ui/home/find/CourseFragment$initView$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/ui/home/find/CourseFragment$initView$2;->b:Lcom/zykj/study/ui/home/find/CourseFragment;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/zykj/study/ui/home/find/CourseFragment$initView$2;-><init>(Lcom/zykj/study/ui/home/find/CourseFragment;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/find/CourseFragment$initView$2;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/ui/home/find/CourseFragment$initView$2;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/home/find/CourseFragment$initView$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/find/CourseFragment$initView$2;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/study/ui/home/find/CourseFragment$initView$2;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/study/ui/home/find/CourseFragment$initView$2;->b:Lcom/zykj/study/ui/home/find/CourseFragment;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lcom/zykj/study/databinding/FragmentCourseBinding;

    .line 18
    .line 19
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentCourseBinding;->recycleView:Landroidx/recyclerview/widget/RecyclerView;

    .line 20
    .line 21
    iget-object v0, p0, Lcom/zykj/study/ui/home/find/CourseFragment$initView$2;->b:Lcom/zykj/study/ui/home/find/CourseFragment;

    .line 22
    .line 23
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v0, p1}, Lcom/zykj/study/ui/home/find/CourseFragment;->i(Lcom/zykj/study/ui/home/find/CourseFragment;Landroidx/recyclerview/widget/RecyclerView;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/zykj/study/ui/home/find/CourseFragment;->l()Lcom/zykj/study/adapter/CourseAdapter;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 34
    .line 35
    .line 36
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 37
    .line 38
    return-object p1

    .line 39
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 40
    .line 41
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p1
.end method
