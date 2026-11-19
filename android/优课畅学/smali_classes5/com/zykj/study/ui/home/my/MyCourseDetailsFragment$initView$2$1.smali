.class final Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.zykj.study.ui.home.my.MyCourseDetailsFragment$initView$2$1"
    f = "MyCourseDetailsFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$2$1;->c:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

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
    new-instance v0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$2$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$2$1;->c:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$2$1;-><init>(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    check-cast p1, Lkotlin/Result;

    .line 9
    .line 10
    invoke-virtual {p1}, Lkotlin/Result;->j()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, v0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$2$1;->b:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->j()Ljava/lang/Object;

    move-result-object p1

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$2$1;->invoke(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-static {p1}, Lkotlin/Result;->a(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$2$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$2$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$2$1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$2$1;->a:I

    .line 7
    .line 8
    if-nez v1, :cond_5

    .line 9
    .line 10
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/Result;->h(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_4

    .line 18
    .line 19
    invoke-static {v0}, Lkotlin/Result;->g(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    const/4 v1, 0x0

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    move-object p1, v1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-object p1, v0

    .line 29
    :goto_0
    check-cast p1, Ljava/util/Collection;

    .line 30
    .line 31
    if-eqz p1, :cond_3

    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$2$1;->c:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    check-cast p1, Lcom/zykj/study/databinding/FragmentMyCourseDetailsBinding;

    .line 47
    .line 48
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentMyCourseDetailsBinding;->courseCatalog:Lcom/zykj/study/databinding/LayoutMyCourseDetailsCatalogBinding;

    .line 49
    .line 50
    iget-object p1, p1, Lcom/zykj/study/databinding/LayoutMyCourseDetailsCatalogBinding;->multipleStatusView:Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;

    .line 51
    .line 52
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->d()V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$2$1;->c:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    .line 56
    .line 57
    invoke-static {p1}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->F(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)Lcom/zykj/study/adapter/CatalogEditAdapter;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {v0}, Lkotlin/Result;->g(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_2

    .line 66
    .line 67
    move-object v0, v1

    .line 68
    :cond_2
    check-cast v0, Ljava/util/Collection;

    .line 69
    .line 70
    invoke-virtual {p1, v0}, Lcom/chad/library/adapter/base/BaseNodeAdapter;->R(Ljava/util/Collection;)V

    .line 71
    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_3
    :goto_1
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$2$1;->c:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    .line 75
    .line 76
    invoke-virtual {p1}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    check-cast p1, Lcom/zykj/study/databinding/FragmentMyCourseDetailsBinding;

    .line 81
    .line 82
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentMyCourseDetailsBinding;->courseCatalog:Lcom/zykj/study/databinding/LayoutMyCourseDetailsCatalogBinding;

    .line 83
    .line 84
    iget-object p1, p1, Lcom/zykj/study/databinding/LayoutMyCourseDetailsCatalogBinding;->multipleStatusView:Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;

    .line 85
    .line 86
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->f()V

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_4
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$2$1;->c:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    .line 91
    .line 92
    invoke-virtual {p1}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    check-cast p1, Lcom/zykj/study/databinding/FragmentMyCourseDetailsBinding;

    .line 97
    .line 98
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentMyCourseDetailsBinding;->courseCatalog:Lcom/zykj/study/databinding/LayoutMyCourseDetailsCatalogBinding;

    .line 99
    .line 100
    iget-object p1, p1, Lcom/zykj/study/databinding/LayoutMyCourseDetailsCatalogBinding;->multipleStatusView:Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;

    .line 101
    .line 102
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->i()V

    .line 103
    .line 104
    .line 105
    :goto_2
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 106
    .line 107
    return-object p1

    .line 108
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 109
    .line 110
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 111
    .line 112
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw p1
.end method
