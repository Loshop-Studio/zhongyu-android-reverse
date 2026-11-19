.class public abstract Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;
.super Landroidx/databinding/ViewDataBinding;
.source "SourceFile"


# instance fields
.field public final fragmentStudentExercise:Landroidx/fragment/app/FragmentContainerView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final fragmentStudentExercises:Landroidx/constraintlayout/widget/ConstraintLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final imageView17:Landroid/widget/ImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final ivLast:Landroidx/appcompat/widget/AppCompatImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final ivNext:Landroidx/appcompat/widget/AppCompatImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final llGroupSelect:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final llUserSelect:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field protected mEnable:Z
    .annotation runtime Landroidx/databinding/Bindable;
    .end annotation
.end field

.field protected mExamClickListener:Landroid/view/View$OnClickListener;
    .annotation runtime Landroidx/databinding/Bindable;
    .end annotation
.end field

.field protected mFromScore:Z
    .annotation runtime Landroidx/databinding/Bindable;
    .end annotation
.end field

.field protected mViewModel:Lcom/zykj/study/viewmodels/StudentExercisesViewModel;
    .annotation runtime Landroidx/databinding/Bindable;
    .end annotation
.end field

.field public final multipleStatusView:Lcom/zykj/study/view/MultipleStatusView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final toolbar:Lcom/xuexiang/xui/widget/actionbar/TitleBar;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvCourseProgress:Landroid/widget/TextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvUserName:Landroidx/appcompat/widget/AppCompatTextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroidx/fragment/app/FragmentContainerView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/AppCompatImageView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Lcom/zykj/study/view/MultipleStatusView;Lcom/xuexiang/xui/widget/actionbar/TitleBar;Landroid/widget/TextView;Landroidx/appcompat/widget/AppCompatTextView;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->fragmentStudentExercise:Landroidx/fragment/app/FragmentContainerView;

    .line 5
    .line 6
    iput-object p5, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->fragmentStudentExercises:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 7
    .line 8
    iput-object p6, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->imageView17:Landroid/widget/ImageView;

    .line 9
    .line 10
    iput-object p7, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->ivLast:Landroidx/appcompat/widget/AppCompatImageView;

    .line 11
    .line 12
    iput-object p8, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->ivNext:Landroidx/appcompat/widget/AppCompatImageView;

    .line 13
    .line 14
    iput-object p9, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->llGroupSelect:Landroid/widget/LinearLayout;

    .line 15
    .line 16
    iput-object p10, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->llUserSelect:Landroid/widget/LinearLayout;

    .line 17
    .line 18
    iput-object p11, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->multipleStatusView:Lcom/zykj/study/view/MultipleStatusView;

    .line 19
    .line 20
    iput-object p12, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->toolbar:Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 21
    .line 22
    iput-object p13, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->tvCourseProgress:Landroid/widget/TextView;

    .line 23
    .line 24
    iput-object p14, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->tvUserName:Landroidx/appcompat/widget/AppCompatTextView;

    .line 25
    .line 26
    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->bind(Landroid/view/View;Ljava/lang/Object;)Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;

    move-result-object p0

    return-object p0
.end method

.method public static bind(Landroid/view/View;Ljava/lang/Object;)Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;
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
    sget v0, Lcom/zykj/study/R$layout;->fragment_student_exercises:I

    invoke-static {p1, p0, v0}, Landroidx/databinding/ViewDataBinding;->bind(Ljava/lang/Object;Landroid/view/View;I)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;
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

    invoke-static {p0, v0}, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;
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

    invoke-static {p0, p1, p2, v0}, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;
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
    sget v0, Lcom/zykj/study/R$layout;->fragment_student_exercises:I

    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;
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
    sget v0, Lcom/zykj/study/R$layout;->fragment_student_exercises:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v0, v1, v2, p1}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;

    return-object p0
.end method


# virtual methods
.method public getEnable()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->mEnable:Z

    .line 2
    .line 3
    return v0
.end method

.method public getExamClickListener()Landroid/view/View$OnClickListener;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->mExamClickListener:Landroid/view/View$OnClickListener;

    .line 2
    .line 3
    return-object v0
.end method

.method public getFromScore()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->mFromScore:Z

    .line 2
    .line 3
    return v0
.end method

.method public getViewModel()Lcom/zykj/study/viewmodels/StudentExercisesViewModel;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentStudentExercisesBinding;->mViewModel:Lcom/zykj/study/viewmodels/StudentExercisesViewModel;

    .line 2
    .line 3
    return-object v0
.end method

.method public abstract setEnable(Z)V
.end method

.method public abstract setExamClickListener(Landroid/view/View$OnClickListener;)V
    .param p1    # Landroid/view/View$OnClickListener;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract setFromScore(Z)V
.end method

.method public abstract setViewModel(Lcom/zykj/study/viewmodels/StudentExercisesViewModel;)V
    .param p1    # Lcom/zykj/study/viewmodels/StudentExercisesViewModel;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
.end method
