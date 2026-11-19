.class final Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initPopup$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->l0()V
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
    c = "com.zykj.study.ui.home.my.MyCourseDetailsFragment$initPopup$1$1$1"
    f = "MyCourseDetailsFragment.kt"
    l = {
        0x22b
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initPopup$1$1$1;->b:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

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
    new-instance p1, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initPopup$1$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initPopup$1$1$1;->b:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initPopup$1$1$1;-><init>(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initPopup$1$1$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initPopup$1$1$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initPopup$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initPopup$1$1$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initPopup$1$1$1;->a:I

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
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initPopup$1$1$1;->b:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->K(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-object v1, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initPopup$1$1$1;->b:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    .line 34
    .line 35
    invoke-static {v1}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->E(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)Lcom/zykj/study/ui/home/my/MyCourseDetailsFragmentArgs;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragmentArgs;->a()Lcom/zykj/study/data/MyCourseEntity;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1}, Lcom/zykj/study/bean/course/CourseBean;->getId()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    iput v2, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initPopup$1$1$1;->a:I

    .line 48
    .line 49
    invoke-virtual {p1, v1, p0}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->e(ILm7/c;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    if-ne p1, v0, :cond_2

    .line 54
    .line 55
    return-object v0

    .line 56
    :cond_2
    :goto_0
    invoke-static {v2}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_3

    .line 65
    .line 66
    sget-object p1, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 67
    .line 68
    const-string v0, "\u8bfe\u7a0b\u5df2\u5220\u9664"

    .line 69
    .line 70
    invoke-static {p1, v0}, Le5/o;->d(Lcom/zykj/base/utils/XToastUtils;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initPopup$1$1$1;->b:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    .line 74
    .line 75
    invoke-static {p1}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p1}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 80
    .line 81
    .line 82
    :cond_3
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 83
    .line 84
    return-object p1
.end method
