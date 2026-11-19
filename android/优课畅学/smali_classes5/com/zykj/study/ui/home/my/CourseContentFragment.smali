# RE note 本类字节码直接引用的读写或显示接口包括JSON、WebView。
.class public final Lcom/zykj/study/ui/home/my/CourseContentFragment;
.super Lcom/zykj/study/ui/home/my/Hilt_CourseContentFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/ui/home/my/CourseContentFragment$CourseDeauthorized;,
        Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/home/my/Hilt_CourseContentFragment<",
        "Lcom/zykj/study/databinding/FragmentCourseContentBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Landroidx/navigation/NavArgsLazy;

.field public final g:Lh7/d;

.field public final h:Lh7/d;

.field public i:Ll8/g;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/Hilt_CourseContentFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/navigation/NavArgsLazy;

    .line 5
    .line 6
    const-class v1, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Lcom/zykj/study/ui/home/my/CourseContentFragment$a;

    .line 13
    .line 14
    invoke-direct {v2, p0}, Lcom/zykj/study/ui/home/my/CourseContentFragment$a;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Landroidx/navigation/NavArgsLazy;-><init>(Le8/c;Lx7/a;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment;->f:Landroidx/navigation/NavArgsLazy;

    .line 21
    .line 22
    new-instance v0, Lcom/zykj/study/ui/home/my/CourseContentFragment$special$$inlined$viewModels$default$1;

    .line 23
    .line 24
    invoke-direct {v0, p0}, Lcom/zykj/study/ui/home/my/CourseContentFragment$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 25
    .line 26
    .line 27
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->c:Lkotlin/LazyThreadSafetyMode;

    .line 28
    .line 29
    new-instance v2, Lcom/zykj/study/ui/home/my/CourseContentFragment$special$$inlined$viewModels$default$2;

    .line 30
    .line 31
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/my/CourseContentFragment$special$$inlined$viewModels$default$2;-><init>(Lx7/a;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-class v1, Lcom/zykj/study/viewmodels/CourseContentViewModel;

    .line 39
    .line 40
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    new-instance v2, Lcom/zykj/study/ui/home/my/CourseContentFragment$special$$inlined$viewModels$default$3;

    .line 45
    .line 46
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/my/CourseContentFragment$special$$inlined$viewModels$default$3;-><init>(Lh7/d;)V

    .line 47
    .line 48
    .line 49
    new-instance v3, Lcom/zykj/study/ui/home/my/CourseContentFragment$special$$inlined$viewModels$default$4;

    .line 50
    .line 51
    const/4 v4, 0x0

    .line 52
    invoke-direct {v3, v4, v0}, Lcom/zykj/study/ui/home/my/CourseContentFragment$special$$inlined$viewModels$default$4;-><init>(Lx7/a;Lh7/d;)V

    .line 53
    .line 54
    .line 55
    new-instance v4, Lcom/zykj/study/ui/home/my/CourseContentFragment$special$$inlined$viewModels$default$5;

    .line 56
    .line 57
    invoke-direct {v4, p0, v0}, Lcom/zykj/study/ui/home/my/CourseContentFragment$special$$inlined$viewModels$default$5;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 58
    .line 59
    .line 60
    invoke-static {p0, v1, v2, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment;->g:Lh7/d;

    .line 65
    .line 66
    new-instance v0, Lb5/i;

    .line 67
    .line 68
    invoke-direct {v0, p0}, Lb5/i;-><init>(Lcom/zykj/study/ui/home/my/CourseContentFragment;)V

    .line 69
    .line 70
    .line 71
    invoke-static {v0}, Lkotlin/a;->b(Lx7/a;)Lh7/d;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment;->h:Lh7/d;

    .line 76
    .line 77
    return-void
.end method

.method public static synthetic g(IIILcom/zykj/study/bean/exercise/ExerciseBean;ZLkotlin/jvm/internal/Ref$ObjectRef;Lcom/zykj/study/ui/home/my/CourseContentFragment;Lcom/zykj/study/bean/exercise/QuestionBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Lcom/zykj/study/ui/home/my/CourseContentFragment;->y(IIILcom/zykj/study/bean/exercise/ExerciseBean;ZLkotlin/jvm/internal/Ref$ObjectRef;Lcom/zykj/study/ui/home/my/CourseContentFragment;Lcom/zykj/study/bean/exercise/QuestionBean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/zykj/study/ui/home/my/CourseContentFragment;Ljava/lang/String;Landroid/os/Bundle;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/home/my/CourseContentFragment;->s(Lcom/zykj/study/ui/home/my/CourseContentFragment;Ljava/lang/String;Landroid/os/Bundle;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/zykj/study/ui/home/my/CourseContentFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/CourseContentFragment;->t(Lcom/zykj/study/ui/home/my/CourseContentFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic j(Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/CourseContentFragment;->x(Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic k(Lcom/zykj/study/ui/home/my/CourseContentFragment;)Lcom/zykj/study/view/CustomX5WebView;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/my/CourseContentFragment;->z(Lcom/zykj/study/ui/home/my/CourseContentFragment;)Lcom/zykj/study/view/CustomX5WebView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic l(Lcom/zykj/study/ui/home/my/CourseContentFragment;)Lcom/zykj/study/viewmodels/CourseContentViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/CourseContentFragment;->p()Lcom/zykj/study/viewmodels/CourseContentViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic m(Lcom/zykj/study/ui/home/my/CourseContentFragment;)Lcom/zykj/study/view/CustomX5WebView;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/CourseContentFragment;->r()Lcom/zykj/study/view/CustomX5WebView;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic n(Lcom/zykj/study/ui/home/my/CourseContentFragment;IIILcom/zykj/study/bean/exercise/GroupStatistic;Z)V
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p5}, Lcom/zykj/study/ui/home/my/CourseContentFragment;->w(IIILcom/zykj/study/bean/exercise/GroupStatistic;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

# RE I/O 写入 JSON（Gson.toJson）。
.method public static final s(Lcom/zykj/study/ui/home/my/CourseContentFragment;Ljava/lang/String;Landroid/os/Bundle;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "bundle"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p1, "exercise_upload"

    .line 12
    .line 13
    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lcom/zykj/study/bean/exercise/ExerciseBean;

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    sget-object p2, Lcom/zykj/study/bean/exercise/ExerciseType;->COMPLETED:Lcom/zykj/study/bean/exercise/ExerciseType;

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Lcom/zykj/study/bean/exercise/ExerciseBean;->setStatus(Lcom/zykj/study/bean/exercise/ExerciseType;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/zykj/study/bean/exercise/ExerciseBean;->getQuestions()Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-interface {p2}, Ljava/util/List;->clear()V

    .line 31
    .line 32
    .line 33
    new-instance p2, Lcom/google/gson/Gson;

    .line 34
    .line 35
    invoke-direct {p2}, Lcom/google/gson/Gson;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p2, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/CourseContentFragment;->r()Lcom/zykj/study/view/CustomX5WebView;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    new-instance p2, Lcom/google/gson/Gson;

    .line 46
    .line 47
    invoke-direct {p2}, Lcom/google/gson/Gson;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    new-instance p2, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    const-string v0, "javascript:updateExercise(\'"

    .line 60
    .line 61
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string p1, "\')"

    .line 68
    .line 69
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    :cond_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 80
    .line 81
    return-object p0
.end method

.method public static final t(Lcom/zykj/study/ui/home/my/CourseContentFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final x(Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->dismiss()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public static final y(IIILcom/zykj/study/bean/exercise/ExerciseBean;ZLkotlin/jvm/internal/Ref$ObjectRef;Lcom/zykj/study/ui/home/my/CourseContentFragment;Lcom/zykj/study/bean/exercise/QuestionBean;)Lh7/p;
    .locals 7

    .line 1
    const-string v0, "questionBean"

    .line 2
    .line 3
    invoke-static {p7, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lcom/zykj/study/ui/home/my/c;->a:Lcom/zykj/study/ui/home/my/c$f;

    .line 7
    .line 8
    invoke-virtual {p3}, Lcom/zykj/study/bean/exercise/ExerciseBean;->getQuestions()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p3

    .line 12
    invoke-interface {p3, p7}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 13
    .line 14
    .line 15
    move-result v5

    .line 16
    move v2, p0

    .line 17
    move v3, p1

    .line 18
    move v4, p2

    .line 19
    move v6, p4

    .line 20
    invoke-virtual/range {v1 .. v6}, Lcom/zykj/study/ui/home/my/c$f;->b(IIIIZ)Landroidx/navigation/NavDirections;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    iget-object p1, p5, Lkotlin/jvm/internal/Ref$ObjectRef;->a:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->dismiss()V

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-static {p6}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1, p0}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V

    .line 38
    .line 39
    .line 40
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 41
    .line 42
    return-object p0
.end method

.method public static final z(Lcom/zykj/study/ui/home/my/CourseContentFragment;)Lcom/zykj/study/view/CustomX5WebView;
    .locals 6

    .line 1
    new-instance v0, Lcom/zykj/study/view/CustomX5WebView;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string p0, "requireContext(...)"

    .line 8
    .line 9
    invoke-static {v1, p0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const/4 v4, 0x6

    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct/range {v0 .. v5}, Lcom/zykj/study/view/CustomX5WebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/n;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method


# virtual methods
.method public initData(Lm7/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lcom/zykj/study/ui/home/my/CourseContentFragment$initData$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/study/ui/home/my/CourseContentFragment$initData$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/ui/home/my/CourseContentFragment$initData$1;->c:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/study/ui/home/my/CourseContentFragment$initData$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/ui/home/my/CourseContentFragment$initData$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/study/ui/home/my/CourseContentFragment$initData$1;-><init>(Lcom/zykj/study/ui/home/my/CourseContentFragment;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/study/ui/home/my/CourseContentFragment$initData$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/ui/home/my/CourseContentFragment$initData$1;->c:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iput v3, v0, Lcom/zykj/study/ui/home/my/CourseContentFragment$initData$1;->c:I

    .line 54
    .line 55
    invoke-super {p0, v0}, Lcom/zykj/base/BaseFragment;->initData(Lm7/c;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-ne p1, v1, :cond_3

    .line 60
    .line 61
    return-object v1

    .line 62
    :cond_3
    :goto_1
    new-instance p1, Lb5/k;

    .line 63
    .line 64
    invoke-direct {p1, p0}, Lb5/k;-><init>(Lcom/zykj/study/ui/home/my/CourseContentFragment;)V

    .line 65
    .line 66
    .line 67
    const-string v0, "exercise_upload"

    .line 68
    .line 69
    invoke-static {p0, v0, p1}, Landroidx/fragment/app/FragmentKt;->setFragmentResultListener(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lx7/p;)V

    .line 70
    .line 71
    .line 72
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 73
    .line 74
    return-object p1
.end method

.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/study/databinding/FragmentCourseContentBinding;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/CourseContentFragment;->p()Lcom/zykj/study/viewmodels/CourseContentViewModel;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p1, p2}, Lcom/zykj/study/databinding/FragmentCourseContentBinding;->setEntity(Lcom/zykj/study/viewmodels/CourseContentViewModel;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lcom/zykj/study/databinding/FragmentCourseContentBinding;

    .line 19
    .line 20
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentCourseContentBinding;->toolbar:Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/CourseContentFragment;->o()Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-virtual {p2}, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;->c()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->t(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    sget p2, Lcom/zykj/study/R$string;->arrow_left_return:I

    .line 35
    .line 36
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->p(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    sget p2, Lcom/zykj/study/R$drawable;->ic_arrow_left:I

    .line 45
    .line 46
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->o(I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    sget v0, Lcom/zykj/study/R$color;->toolbar_back_icon_color:I

    .line 55
    .line 56
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getColor(I)I

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->r(I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    sget v0, Lcom/zykj/lib/ui/R$dimen;->text_9:I

    .line 69
    .line 70
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    int-to-float p2, p2

    .line 75
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->s(F)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    sget v0, Lcom/zykj/lib/ui/R$dimen;->text_9:I

    .line 84
    .line 85
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    int-to-float p2, p2

    .line 90
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->v(F)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    const/4 p2, 0x0

    .line 95
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->q(Z)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    const/4 p2, 0x1

    .line 100
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->l(Z)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    new-instance p2, Lb5/j;

    .line 105
    .line 106
    invoke-direct {p2, p0}, Lb5/j;-><init>(Lcom/zykj/study/ui/home/my/CourseContentFragment;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->n(Landroid/view/View$OnClickListener;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    const-string v0, "getViewLifecycleOwner(...)"

    .line 118
    .line 119
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-static {p2}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    new-instance v4, Lcom/zykj/study/ui/home/my/CourseContentFragment$initView$3$1;

    .line 127
    .line 128
    const/4 p2, 0x0

    .line 129
    invoke-direct {v4, p0, p1, p2}, Lcom/zykj/study/ui/home/my/CourseContentFragment$initView$3$1;-><init>(Lcom/zykj/study/ui/home/my/CourseContentFragment;Lcom/xuexiang/xui/widget/actionbar/TitleBar;Lm7/c;)V

    .line 130
    .line 131
    .line 132
    const/4 v5, 0x3

    .line 133
    const/4 v6, 0x0

    .line 134
    const/4 v2, 0x0

    .line 135
    const/4 v3, 0x0

    .line 136
    invoke-static/range {v1 .. v6}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/CourseContentFragment;->r()Lcom/zykj/study/view/CustomX5WebView;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-virtual {p0, p1}, Lcom/zykj/study/ui/home/my/CourseContentFragment;->u(Lcom/zykj/study/view/CustomX5WebView;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    check-cast p1, Lcom/zykj/study/databinding/FragmentCourseContentBinding;

    .line 151
    .line 152
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentCourseContentBinding;->fmContent:Landroid/widget/FrameLayout;

    .line 153
    .line 154
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/CourseContentFragment;->r()Lcom/zykj/study/view/CustomX5WebView;

    .line 155
    .line 156
    .line 157
    move-result-object p2

    .line 158
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    .line 159
    .line 160
    const/4 v1, -0x1

    .line 161
    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p1, p2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/CourseContentFragment;->r()Lcom/zykj/study/view/CustomX5WebView;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/CourseContentFragment;->o()Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;

    .line 172
    .line 173
    .line 174
    move-result-object p2

    .line 175
    invoke-virtual {p2}, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;->d()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p2

    .line 179
    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 183
    .line 184
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_course_content:I

    .line 2
    .line 3
    return v0
.end method

.method public final o()Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment;->f:Landroidx/navigation/NavArgsLazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;

    .line 8
    .line 9
    return-object v0
.end method

.method public onDestroyView()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/study/databinding/FragmentCourseContentBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentCourseContentBinding;->fmContent:Landroid/widget/FrameLayout;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/CourseContentFragment;->r()Lcom/zykj/study/view/CustomX5WebView;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final p()Lcom/zykj/study/viewmodels/CourseContentViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment;->g:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/CourseContentViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public final q()Ll8/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment;->i:Ll8/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "lessonDeauthorizedFlow"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public final r()Lcom/zykj/study/view/CustomX5WebView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment;->h:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/view/CustomX5WebView;

    .line 8
    .line 9
    return-object v0
.end method

.method public final u(Lcom/zykj/study/view/CustomX5WebView;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/CourseContentFragment;->o()Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, p0, v1}, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava;-><init>(Lcom/zykj/study/ui/home/my/CourseContentFragment;Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;)V

    .line 8
    .line 9
    .line 10
    const-string v1, "flutter_inappwebview"

    .line 11
    .line 12
    invoke-virtual {p1, v0, v1}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Lcom/zykj/study/ui/home/my/CourseContentFragment$CourseDeauthorized;

    .line 16
    .line 17
    invoke-direct {v0, p0}, Lcom/zykj/study/ui/home/my/CourseContentFragment$CourseDeauthorized;-><init>(Lcom/zykj/study/ui/home/my/CourseContentFragment;)V

    .line 18
    .line 19
    .line 20
    const-string v1, "flutter_inappwebview1"

    .line 21
    .line 22
    invoke-virtual {p1, v0, v1}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    sget-object v0, Le5/e;->a:Le5/e;

    .line 26
    .line 27
    invoke-virtual {v0}, Le5/e;->d()Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {p1, v1}, Lcom/zykj/study/view/CustomX5WebView;->g(Ljava/util/List;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Le5/e;->a()Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {p1, v1}, Lcom/zykj/study/view/CustomX5WebView;->g(Ljava/util/List;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Le5/e;->b()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v0}, Li7/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {p1, v0}, Lcom/zykj/study/view/CustomX5WebView;->g(Ljava/util/List;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final v(Lm7/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, Lcom/zykj/study/ui/home/my/CourseContentFragment$isAuthor$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/study/ui/home/my/CourseContentFragment$isAuthor$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/ui/home/my/CourseContentFragment$isAuthor$1;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/study/ui/home/my/CourseContentFragment$isAuthor$1;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/ui/home/my/CourseContentFragment$isAuthor$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/study/ui/home/my/CourseContentFragment$isAuthor$1;-><init>(Lcom/zykj/study/ui/home/my/CourseContentFragment;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/study/ui/home/my/CourseContentFragment$isAuthor$1;->b:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/ui/home/my/CourseContentFragment$isAuthor$1;->d:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object v0, v0, Lcom/zykj/study/ui/home/my/CourseContentFragment$isAuthor$1;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/CourseContentFragment;->o()Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p1}, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;->a()Lcom/zykj/study/bean/course/CourseBean;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    if-eqz p1, :cond_3

    .line 66
    .line 67
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CourseBean;->getUserId()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    goto :goto_1

    .line 72
    :cond_3
    const/4 p1, 0x0

    .line 73
    :goto_1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/CourseContentFragment;->p()Lcom/zykj/study/viewmodels/CourseContentViewModel;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    iput-object p1, v0, Lcom/zykj/study/ui/home/my/CourseContentFragment$isAuthor$1;->a:Ljava/lang/Object;

    .line 78
    .line 79
    iput v3, v0, Lcom/zykj/study/ui/home/my/CourseContentFragment$isAuthor$1;->d:I

    .line 80
    .line 81
    invoke-virtual {v2, v0}, Lcom/zykj/study/viewmodels/CourseContentViewModel;->c(Lm7/c;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    if-ne v0, v1, :cond_4

    .line 86
    .line 87
    return-object v1

    .line 88
    :cond_4
    move-object v4, v0

    .line 89
    move-object v0, p1

    .line 90
    move-object p1, v4

    .line 91
    :goto_2
    invoke-static {v0, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    invoke-static {p1}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    return-object p1
.end method

.method public final w(IIILcom/zykj/study/bean/exercise/GroupStatistic;Z)V
    .locals 13

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/Hilt_CourseContentFragment;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sget v2, Lcom/zykj/study/R$layout;->dialog_statistic:I

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    invoke-static {v1, v2, v3, v4}, Landroidx/databinding/DataBindingUtil;->inflate(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroidx/databinding/ViewDataBinding;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lcom/zykj/study/databinding/DialogStatisticBinding;

    .line 20
    .line 21
    new-instance v8, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 22
    .line 23
    invoke-direct {v8}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 24
    .line 25
    .line 26
    move-object/from16 v2, p4

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Lcom/zykj/study/databinding/DialogStatisticBinding;->setEntity(Lcom/zykj/study/bean/exercise/GroupStatistic;)V

    .line 29
    .line 30
    .line 31
    iget-object v3, v1, Lcom/zykj/study/databinding/DialogStatisticBinding;->imageView18:Landroid/widget/ImageView;

    .line 32
    .line 33
    new-instance v4, Lb5/l;

    .line 34
    .line 35
    invoke-direct {v4, v8}, Lb5/l;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, Lcom/zykj/study/bean/exercise/GroupStatistic;->getQuestionGroups()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    invoke-static {v2}, Li7/f0;->n0(Ljava/util/List;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    move-object v6, v2

    .line 52
    check-cast v6, Lcom/zykj/study/bean/exercise/ExerciseBean;

    .line 53
    .line 54
    if-eqz v6, :cond_0

    .line 55
    .line 56
    invoke-virtual {v1, v6}, Lcom/zykj/study/databinding/DialogStatisticBinding;->setExerciseBean(Lcom/zykj/study/bean/exercise/ExerciseBean;)V

    .line 57
    .line 58
    .line 59
    iget-object v10, v1, Lcom/zykj/study/databinding/DialogStatisticBinding;->recycler:Landroidx/recyclerview/widget/RecyclerView;

    .line 60
    .line 61
    new-instance v11, Lcom/zykj/study/adapter/GroupStatisticAdapter;

    .line 62
    .line 63
    invoke-virtual {v6}, Lcom/zykj/study/bean/exercise/ExerciseBean;->getQuestions()Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v12

    .line 67
    new-instance v2, Lb5/m;

    .line 68
    .line 69
    move-object v9, p0

    .line 70
    move v3, p1

    .line 71
    move v4, p2

    .line 72
    move/from16 v5, p3

    .line 73
    .line 74
    move/from16 v7, p5

    .line 75
    .line 76
    invoke-direct/range {v2 .. v9}, Lb5/m;-><init>(IIILcom/zykj/study/bean/exercise/ExerciseBean;ZLkotlin/jvm/internal/Ref$ObjectRef;Lcom/zykj/study/ui/home/my/CourseContentFragment;)V

    .line 77
    .line 78
    .line 79
    invoke-direct {v11, v12, v2}, Lcom/zykj/study/adapter/GroupStatisticAdapter;-><init>(Ljava/util/List;Lx7/l;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v10, v11}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 83
    .line 84
    .line 85
    :cond_0
    new-instance p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 86
    .line 87
    invoke-direct {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;-><init>(Landroid/content/Context;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    const/4 v0, 0x1

    .line 95
    invoke-virtual {p1, p2, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->l(Landroid/view/View;Z)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->E()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    iput-object p1, v8, Lkotlin/jvm/internal/Ref$ObjectRef;->a:Ljava/lang/Object;

    .line 104
    .line 105
    :cond_1
    return-void
.end method
