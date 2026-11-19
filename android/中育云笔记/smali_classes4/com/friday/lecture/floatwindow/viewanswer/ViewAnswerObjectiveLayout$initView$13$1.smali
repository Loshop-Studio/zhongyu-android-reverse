.class public final Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$initView$13$1;
.super Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->t()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;


# direct methods
.method public constructor <init>(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$initView$13$1;->a:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onPageSelected(I)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;->onPageSelected(I)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$initView$13$1;->a:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;

    .line 5
    .line 6
    invoke-static {v0}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->r(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;)Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$TheViewPagerAdapter;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    const-string v2, "theViewPagerAdapter"

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    move-object v0, v1

    .line 19
    :cond_0
    invoke-virtual {v0, p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$b;->b()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Ljava/lang/Iterable;

    .line 30
    .line 31
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$a;

    .line 46
    .line 47
    const/4 v3, 0x0

    .line 48
    invoke-virtual {v0, v3}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$a;->d(Z)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$initView$13$1;->a:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;

    .line 53
    .line 54
    invoke-static {p1}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->r(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;)Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout$TheViewPagerAdapter;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-nez p1, :cond_2

    .line 59
    .line 60
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    move-object v1, p1

    .line 65
    :goto_1
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 66
    .line 67
    .line 68
    return-void
.end method
