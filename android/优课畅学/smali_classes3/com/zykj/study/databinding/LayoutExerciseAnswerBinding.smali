.class public abstract Lcom/zykj/study/databinding/LayoutExerciseAnswerBinding;
.super Landroidx/databinding/ViewDataBinding;
.source "SourceFile"


# instance fields
.field public final answerChoice:Lcom/zykj/study/databinding/ViewEditChoiceBinding;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final answerMicro:Lcom/zykj/study/databinding/ViewMicroBinding;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final btnComplete:Lcom/xuexiang/xui/widget/button/roundbutton/RoundButton;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final btnNext:Lcom/xuexiang/xui/widget/button/roundbutton/RoundButton;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final btnRevision:Lcom/xuexiang/xui/widget/button/roundbutton/RoundButton;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final btnSubmit:Lcom/xuexiang/xui/widget/button/roundbutton/RoundButton;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field protected mEntity:Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;
    .annotation runtime Landroidx/databinding/Bindable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILcom/zykj/study/databinding/ViewEditChoiceBinding;Lcom/zykj/study/databinding/ViewMicroBinding;Lcom/xuexiang/xui/widget/button/roundbutton/RoundButton;Lcom/xuexiang/xui/widget/button/roundbutton/RoundButton;Lcom/xuexiang/xui/widget/button/roundbutton/RoundButton;Lcom/xuexiang/xui/widget/button/roundbutton/RoundButton;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerBinding;->answerChoice:Lcom/zykj/study/databinding/ViewEditChoiceBinding;

    .line 5
    .line 6
    iput-object p5, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerBinding;->answerMicro:Lcom/zykj/study/databinding/ViewMicroBinding;

    .line 7
    .line 8
    iput-object p6, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerBinding;->btnComplete:Lcom/xuexiang/xui/widget/button/roundbutton/RoundButton;

    .line 9
    .line 10
    iput-object p7, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerBinding;->btnNext:Lcom/xuexiang/xui/widget/button/roundbutton/RoundButton;

    .line 11
    .line 12
    iput-object p8, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerBinding;->btnRevision:Lcom/xuexiang/xui/widget/button/roundbutton/RoundButton;

    .line 13
    .line 14
    iput-object p9, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerBinding;->btnSubmit:Lcom/xuexiang/xui/widget/button/roundbutton/RoundButton;

    .line 15
    .line 16
    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/zykj/study/databinding/LayoutExerciseAnswerBinding;
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/zykj/study/databinding/LayoutExerciseAnswerBinding;->bind(Landroid/view/View;Ljava/lang/Object;)Lcom/zykj/study/databinding/LayoutExerciseAnswerBinding;

    move-result-object p0

    return-object p0
.end method

.method public static bind(Landroid/view/View;Ljava/lang/Object;)Lcom/zykj/study/databinding/LayoutExerciseAnswerBinding;
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    sget v0, Lcom/zykj/study/R$layout;->layout_exercise_answer:I

    invoke-static {p1, p0, v0}, Landroidx/databinding/ViewDataBinding;->bind(Ljava/lang/Object;Landroid/view/View;I)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lcom/zykj/study/databinding/LayoutExerciseAnswerBinding;
    .locals 1
    .param p0    # Landroid/view/LayoutInflater;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 3
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/zykj/study/databinding/LayoutExerciseAnswerBinding;->inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lcom/zykj/study/databinding/LayoutExerciseAnswerBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/study/databinding/LayoutExerciseAnswerBinding;
    .locals 1
    .param p0    # Landroid/view/LayoutInflater;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, p1, p2, v0}, Lcom/zykj/study/databinding/LayoutExerciseAnswerBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lcom/zykj/study/databinding/LayoutExerciseAnswerBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lcom/zykj/study/databinding/LayoutExerciseAnswerBinding;
    .locals 1
    .param p0    # Landroid/view/LayoutInflater;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    sget v0, Lcom/zykj/study/R$layout;->layout_exercise_answer:I

    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lcom/zykj/study/databinding/LayoutExerciseAnswerBinding;
    .locals 3
    .param p0    # Landroid/view/LayoutInflater;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 4
    sget v0, Lcom/zykj/study/R$layout;->layout_exercise_answer:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v0, v1, v2, p1}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerBinding;

    return-object p0
.end method


# virtual methods
.method public getEntity()Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerBinding;->mEntity:Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;

    .line 2
    .line 3
    return-object v0
.end method

.method public abstract setEntity(Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;)V
    .param p1    # Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
.end method
