.class public final Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment$onViewCreated$2;
.super Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/zykj/student/dialogue/ui/detail/AnswerTabFragment$onViewCreated$2",
        "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;",
        "onPageSelected",
        "",
        "position",
        "",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment$onViewCreated$2;->a:Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;

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
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;->onPageSelected(I)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment$onViewCreated$2;->a:Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;

    .line 5
    .line 6
    invoke-static {v0}, Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;->i(Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;)Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->K()Lkotlinx/coroutines/flow/StateFlow;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lp6/k;

    .line 19
    .line 20
    invoke-virtual {v0}, Lp6/k;->q()Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eq p1, v0, :cond_1

    .line 29
    .line 30
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment$onViewCreated$2;->a:Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;

    .line 31
    .line 32
    invoke-static {v0}, Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;->i(Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;)Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    new-instance v1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/a$e;

    .line 37
    .line 38
    if-nez p1, :cond_0

    .line 39
    .line 40
    sget-object p1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;->a:Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    sget-object p1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;->b:Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;

    .line 44
    .line 45
    :goto_0
    invoke-direct {v1, p1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/a$e;-><init>(Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->w(Lcom/zykj/student/dialogue/ui/detail/viewmodel/a;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    return-void
.end method
