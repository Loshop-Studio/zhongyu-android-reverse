.class public final Lcom/zykj/study/ui/home/study/StudyListFragment$initData$5$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll8/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/study/StudyListFragment$initData$5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/study/StudyListFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/study/StudyListFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/study/ui/home/study/StudyListFragment$initData$5$a;->a:Lcom/zykj/study/ui/home/study/StudyListFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Landroidx/paging/CombinedLoadStates;Lm7/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/zykj/study/ui/home/study/StudyListFragment$initData$5$a;->a:Lcom/zykj/study/ui/home/study/StudyListFragment;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/zykj/study/ui/home/study/StudyListFragment;->k(Lcom/zykj/study/ui/home/study/StudyListFragment;)Lcom/zykj/study/adapter/CourseStudyAdapter;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string p2, "courseStudyAdapter"

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    invoke-static {p2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    move-object p1, v0

    .line 16
    :cond_0
    invoke-virtual {p1}, Landroidx/paging/PagingDataAdapter;->getItemCount()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-lez p1, :cond_3

    .line 21
    .line 22
    iget-object p1, p0, Lcom/zykj/study/ui/home/study/StudyListFragment$initData$5$a;->a:Lcom/zykj/study/ui/home/study/StudyListFragment;

    .line 23
    .line 24
    invoke-static {p1}, Lcom/zykj/study/ui/home/study/StudyListFragment;->k(Lcom/zykj/study/ui/home/study/StudyListFragment;)Lcom/zykj/study/adapter/CourseStudyAdapter;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-nez p1, :cond_1

    .line 29
    .line 30
    invoke-static {p2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    move-object p1, v0

    .line 34
    :cond_1
    invoke-virtual {p1}, Landroidx/paging/PagingDataAdapter;->snapshot()Landroidx/paging/ItemSnapshotList;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Landroidx/paging/ItemSnapshotList;->getItems()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    if-eqz p2, :cond_3

    .line 51
    .line 52
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    check-cast p2, Lcom/zykj/study/bean/SelectModel;

    .line 57
    .line 58
    invoke-virtual {p2}, Lcom/zykj/study/bean/SelectModel;->isSelectModel()Z

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    if-eqz p2, :cond_2

    .line 63
    .line 64
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 65
    .line 66
    return-object p1

    .line 67
    :cond_3
    iget-object p1, p0, Lcom/zykj/study/ui/home/study/StudyListFragment$initData$5$a;->a:Lcom/zykj/study/ui/home/study/StudyListFragment;

    .line 68
    .line 69
    invoke-static {p1}, Lcom/zykj/study/ui/home/study/StudyListFragment;->m(Lcom/zykj/study/ui/home/study/StudyListFragment;)Lcom/zykj/study/viewmodels/StudyViewModel;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/StudyViewModel;->l()Landroidx/lifecycle/MutableLiveData;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    if-eqz p1, :cond_4

    .line 82
    .line 83
    iget-object p1, p0, Lcom/zykj/study/ui/home/study/StudyListFragment$initData$5$a;->a:Lcom/zykj/study/ui/home/study/StudyListFragment;

    .line 84
    .line 85
    invoke-static {p1}, Lcom/zykj/study/ui/home/study/StudyListFragment;->m(Lcom/zykj/study/ui/home/study/StudyListFragment;)Lcom/zykj/study/viewmodels/StudyViewModel;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/StudyViewModel;->l()Landroidx/lifecycle/MutableLiveData;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    :cond_4
    iget-object p1, p0, Lcom/zykj/study/ui/home/study/StudyListFragment$initData$5$a;->a:Lcom/zykj/study/ui/home/study/StudyListFragment;

    .line 97
    .line 98
    invoke-static {p1}, Lcom/zykj/study/ui/home/study/StudyListFragment;->m(Lcom/zykj/study/ui/home/study/StudyListFragment;)Lcom/zykj/study/viewmodels/StudyViewModel;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/StudyViewModel;->f()Landroidx/lifecycle/MutableLiveData;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 110
    .line 111
    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/paging/CombinedLoadStates;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/study/StudyListFragment$initData$5$a;->c(Landroidx/paging/CombinedLoadStates;Lm7/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
