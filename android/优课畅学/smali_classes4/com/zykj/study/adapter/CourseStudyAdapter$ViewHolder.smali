.class public final Lcom/zykj/study/adapter/CourseStudyAdapter$ViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/study/adapter/CourseStudyAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ViewHolder"
.end annotation


# instance fields
.field public final a:Lcom/zykj/study/databinding/ItemStudyBinding;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/study/databinding/ItemStudyBinding;)V
    .locals 1

    .line 1
    const-string v0, "binding"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/zykj/study/adapter/CourseStudyAdapter$ViewHolder;->a:Lcom/zykj/study/databinding/ItemStudyBinding;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View$OnClickListener;Lcom/zykj/study/bean/SelectModel;Lcom/zykj/study/viewmodels/DictViewModel;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "item"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "dictViewModel"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/study/adapter/CourseStudyAdapter$ViewHolder;->a:Lcom/zykj/study/databinding/ItemStudyBinding;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/zykj/study/databinding/ItemStudyBinding;->setClickListener(Landroid/view/View$OnClickListener;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lcom/zykj/study/data/CourseStudyEntity;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Lcom/zykj/study/databinding/ItemStudyBinding;->setEntity(Lcom/zykj/study/data/CourseStudyEntity;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p3}, Lcom/zykj/study/databinding/ItemStudyBinding;->setDictViewModel(Lcom/zykj/study/viewmodels/DictViewModel;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2}, Lcom/zykj/study/bean/SelectModel;->isSelectModel()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    invoke-virtual {v0, p1}, Lcom/zykj/study/databinding/ItemStudyBinding;->setIsSelected(Z)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->executePendingBindings()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final b(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/adapter/CourseStudyAdapter$ViewHolder;->a:Lcom/zykj/study/databinding/ItemStudyBinding;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/zykj/study/databinding/ItemStudyBinding;->setIsSelected(Z)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/zykj/study/adapter/CourseStudyAdapter$ViewHolder;->a:Lcom/zykj/study/databinding/ItemStudyBinding;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->executePendingBindings()V

    .line 9
    .line 10
    .line 11
    return-void
.end method
