.class public final Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment$initView$2$1;
.super Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;->initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment$initView$2$1;->a:Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onChanged()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;->onChanged()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment$initView$2$1;->a:Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;

    .line 5
    .line 6
    invoke-static {v0}, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;->l(Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;)Lcom/zykj/study/adapter/StatisticsAdapter;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Lcom/zykj/study/adapter/StatisticsAdapter;->getItemCount()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x1

    .line 15
    const/4 v3, 0x0

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    move v1, v2

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v1, v3

    .line 21
    :goto_0
    invoke-static {v0, v1}, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;->m(Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;Z)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment$initView$2$1;->a:Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;

    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lcom/zykj/study/databinding/FragmentCourseViewStatisticsBinding;

    .line 31
    .line 32
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentCourseViewStatisticsBinding;->recycler:Landroidx/recyclerview/widget/RecyclerView;

    .line 33
    .line 34
    const-string v1, "recycler"

    .line 35
    .line 36
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment$initView$2$1;->a:Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;

    .line 40
    .line 41
    invoke-static {v1}, Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;->l(Lcom/zykj/study/ui/home/my/CourseViewStatisticsFragment;)Lcom/zykj/study/adapter/StatisticsAdapter;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1}, Lcom/zykj/study/adapter/StatisticsAdapter;->getItemCount()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-lez v1, :cond_1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    move v2, v3

    .line 53
    :goto_1
    if-eqz v2, :cond_2

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    const/16 v3, 0x8

    .line 57
    .line 58
    :goto_2
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 59
    .line 60
    .line 61
    return-void
.end method
