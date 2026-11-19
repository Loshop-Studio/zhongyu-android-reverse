.class public final Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter$ViewHolderViewer;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ViewHolderViewer"
.end annotation


# instance fields
.field public final a:Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBinding;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBinding;)V
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
    iput-object p1, p0, Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter$ViewHolderViewer;->a:Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBinding;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Lcom/zykj/study/bean/SelectModel;Ljava/util/List;Landroid/view/View$OnClickListener;)V
    .locals 2

    .line 1
    const-string v0, "answerList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "option"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "rightList"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "createClickListener"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter$ViewHolderViewer;->a:Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBinding;

    .line 22
    .line 23
    invoke-virtual {p2}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBinding;->setText(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-interface {p1, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    new-instance p1, Lcom/zykj/study/bean/exercise/ChoiceBean;

    .line 43
    .line 44
    invoke-virtual {p2}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-interface {p3, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p3

    .line 52
    if-eqz p3, :cond_0

    .line 53
    .line 54
    sget-object p3, Lcom/zykj/study/bean/exercise/ChoiceStatus;->RIGHT:Lcom/zykj/study/bean/exercise/ChoiceStatus;

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    sget-object p3, Lcom/zykj/study/bean/exercise/ChoiceStatus;->ERROR:Lcom/zykj/study/bean/exercise/ChoiceStatus;

    .line 58
    .line 59
    :goto_0
    invoke-direct {p1, p3}, Lcom/zykj/study/bean/exercise/ChoiceBean;-><init>(Lcom/zykj/study/bean/exercise/ChoiceStatus;)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    new-instance p1, Lcom/zykj/study/bean/exercise/ChoiceBean;

    .line 64
    .line 65
    sget-object p3, Lcom/zykj/study/bean/exercise/ChoiceStatus;->NULL:Lcom/zykj/study/bean/exercise/ChoiceStatus;

    .line 66
    .line 67
    invoke-direct {p1, p3}, Lcom/zykj/study/bean/exercise/ChoiceBean;-><init>(Lcom/zykj/study/bean/exercise/ChoiceStatus;)V

    .line 68
    .line 69
    .line 70
    :goto_1
    invoke-virtual {v0, p1}, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBinding;->setEntity(Lcom/zykj/study/bean/exercise/ChoiceBean;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p2}, Lcom/zykj/study/bean/SelectModel;->isSelectModel()Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    invoke-virtual {v0, p1}, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBinding;->setIsSelected(Z)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, p4}, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBinding;->setClickListener(Landroid/view/View$OnClickListener;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->executePendingBindings()V

    .line 84
    .line 85
    .line 86
    return-void
.end method
