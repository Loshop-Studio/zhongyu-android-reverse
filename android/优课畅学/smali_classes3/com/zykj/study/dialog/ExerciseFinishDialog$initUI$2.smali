.class public final Lcom/zykj/study/dialog/ExerciseFinishDialog$initUI$2;
.super Landroidx/viewpager2/adapter/FragmentStateAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/dialog/ExerciseFinishDialog;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/study/dialog/ExerciseFinishDialog;


# direct methods
.method public constructor <init>(Lcom/zykj/study/dialog/ExerciseFinishDialog;Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/Lifecycle;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/dialog/ExerciseFinishDialog$initUI$2;->a:Lcom/zykj/study/dialog/ExerciseFinishDialog;

    .line 2
    .line 3
    invoke-direct {p0, p2, p3}, Landroidx/viewpager2/adapter/FragmentStateAdapter;-><init>(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/Lifecycle;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public createFragment(I)Landroidx/fragment/app/Fragment;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lcom/zykj/study/dialog/ExerciseFinishDetailFragment;->b:Lcom/zykj/study/dialog/ExerciseFinishDetailFragment$a;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/study/dialog/ExerciseFinishDialog$initUI$2;->a:Lcom/zykj/study/dialog/ExerciseFinishDialog;

    .line 6
    .line 7
    invoke-static {v0}, Lcom/zykj/study/dialog/ExerciseFinishDialog;->l(Lcom/zykj/study/dialog/ExerciseFinishDialog;)Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-virtual {v0, v1}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->n(Z)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p1, v0}, Lcom/zykj/study/dialog/ExerciseFinishDetailFragment$a;->a(Ljava/util/List;)Lcom/zykj/study/dialog/ExerciseFinishDetailFragment;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1

    .line 21
    :cond_0
    sget-object p1, Lcom/zykj/study/dialog/ExerciseFinishDetailFragment;->b:Lcom/zykj/study/dialog/ExerciseFinishDetailFragment$a;

    .line 22
    .line 23
    iget-object v0, p0, Lcom/zykj/study/dialog/ExerciseFinishDialog$initUI$2;->a:Lcom/zykj/study/dialog/ExerciseFinishDialog;

    .line 24
    .line 25
    invoke-static {v0}, Lcom/zykj/study/dialog/ExerciseFinishDialog;->l(Lcom/zykj/study/dialog/ExerciseFinishDialog;)Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-virtual {v0, v1}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->n(Z)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p1, v0}, Lcom/zykj/study/dialog/ExerciseFinishDetailFragment$a;->a(Ljava/util/List;)Lcom/zykj/study/dialog/ExerciseFinishDetailFragment;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1
.end method

.method public getItemCount()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method
