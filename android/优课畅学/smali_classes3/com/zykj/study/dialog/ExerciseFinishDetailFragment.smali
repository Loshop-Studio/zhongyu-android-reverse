.class public final Lcom/zykj/study/dialog/ExerciseFinishDetailFragment;
.super Lcom/zykj/base/BaseFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/dialog/ExerciseFinishDetailFragment$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/base/BaseFragment<",
        "Lcom/zykj/study/databinding/FragmentExerciseFinishDetailBinding;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Lcom/zykj/study/dialog/ExerciseFinishDetailFragment$a;

.field public static final c:I


# instance fields
.field public final a:Lh7/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/study/dialog/ExerciseFinishDetailFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/study/dialog/ExerciseFinishDetailFragment$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/study/dialog/ExerciseFinishDetailFragment;->b:Lcom/zykj/study/dialog/ExerciseFinishDetailFragment$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/study/dialog/ExerciseFinishDetailFragment;->c:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/base/BaseFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lp4/n;

    .line 5
    .line 6
    invoke-direct {v0}, Lp4/n;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/a;->b(Lx7/a;)Lh7/d;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/zykj/study/dialog/ExerciseFinishDetailFragment;->a:Lh7/d;

    .line 14
    .line 15
    return-void
.end method

.method public static synthetic f()Lcom/zykj/study/adapter/StuNameAdapter;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/study/dialog/ExerciseFinishDetailFragment;->i()Lcom/zykj/study/adapter/StuNameAdapter;

    move-result-object v0

    return-object v0
.end method

.method public static final i()Lcom/zykj/study/adapter/StuNameAdapter;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/study/adapter/StuNameAdapter;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/study/adapter/StuNameAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public final g()Lcom/zykj/study/adapter/StuNameAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/dialog/ExerciseFinishDetailFragment;->a:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/adapter/StuNameAdapter;

    .line 8
    .line 9
    return-object v0
.end method

.method public final h()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/study/databinding/FragmentExerciseFinishDetailBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentExerciseFinishDetailBinding;->recyclerViewStudent:Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/study/dialog/ExerciseFinishDetailFragment;->g()Lcom/zykj/study/adapter/StuNameAdapter;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Lcom/zykj/study/utils/CommonDecoration;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    sget v3, Lcom/zykj/lib/ui/R$dimen;->view_8:I

    .line 23
    .line 24
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    sget v4, Lcom/zykj/lib/ui/R$dimen;->view_8:I

    .line 33
    .line 34
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    const/4 v4, 0x0

    .line 39
    invoke-direct {v1, v2, v3, v4}, Lcom/zykj/study/utils/CommonDecoration;-><init>(IIZ)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireArguments()Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string p2, "data"

    .line 6
    .line 7
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/zykj/study/databinding/FragmentExerciseFinishDetailBinding;

    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireArguments()Landroid/os/Bundle;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1, p2}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    if-eqz p2, :cond_1

    .line 26
    .line 27
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-eqz p2, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 p2, 0x0

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    :goto_0
    const/4 p2, 0x1

    .line 37
    :goto_1
    invoke-static {p2}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {v0, p2}, Lcom/zykj/study/databinding/FragmentExerciseFinishDetailBinding;->setIsEmpty(Ljava/lang/Boolean;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/zykj/study/dialog/ExerciseFinishDetailFragment;->g()Lcom/zykj/study/adapter/StuNameAdapter;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/ListAdapter;->submitList(Ljava/util/List;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/zykj/study/dialog/ExerciseFinishDetailFragment;->h()V

    .line 52
    .line 53
    .line 54
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 55
    .line 56
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_exercise_finish_detail:I

    .line 2
    .line 3
    return v0
.end method
