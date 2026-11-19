.class public final Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment$initObserver$2$1$1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll8/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment$initObserver$2$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment$initObserver$2$1$1$a;->a:Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(ILm7/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p2, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment$initObserver$2$1$1$a;->a:Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;

    .line 2
    .line 3
    invoke-virtual {p2}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;

    .line 8
    .line 9
    iget-object p2, p2, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;->viewPager:Landroidx/viewpager2/widget/ViewPager2;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p2, p1, v0}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(IZ)V

    .line 13
    .line 14
    .line 15
    iget-object p2, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment$initObserver$2$1$1$a;->a:Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;

    .line 16
    .line 17
    invoke-static {p2, p1}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->q(Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;I)V

    .line 18
    .line 19
    .line 20
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 21
    .line 22
    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment$initObserver$2$1$1$a;->c(ILm7/c;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
