.class public final Lcom/friday/paint/view/six/NewStudentPaintFragment;
.super Lcom/friday/paint/view/six/Hilt_NewStudentPaintFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private exitTime:J

.field private qstType:I

.field private screensPermission:Z

.field private submitStatusJob:Lkotlinx/coroutines/g;

.field private final viewModel$delegate:Lqc/d;

.field private final viewModel2$delegate:Lqc/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/friday/paint/view/six/Hilt_NewStudentPaintFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 5
    .line 6
    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lcom/friday/paint/view/six/NewStudentPaintFragment$special$$inlined$activityViewModels$default$1;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Lcom/friday/paint/view/six/NewStudentPaintFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/friday/paint/view/six/NewStudentPaintFragment$special$$inlined$activityViewModels$default$2;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v3, p0}, Lcom/friday/paint/view/six/NewStudentPaintFragment$special$$inlined$activityViewModels$default$2;-><init>(Lhd/a;Landroidx/fragment/app/Fragment;)V

    .line 19
    .line 20
    .line 21
    new-instance v4, Lcom/friday/paint/view/six/NewStudentPaintFragment$special$$inlined$activityViewModels$default$3;

    .line 22
    .line 23
    invoke-direct {v4, p0}, Lcom/friday/paint/view/six/NewStudentPaintFragment$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v0, v1, v2, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lod/c;Lhd/a;Lhd/a;Lhd/a;)Lqc/d;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment;->viewModel$delegate:Lqc/d;

    .line 31
    .line 32
    const-class v0, Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 33
    .line 34
    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v1, Lcom/friday/paint/view/six/NewStudentPaintFragment$special$$inlined$activityViewModels$default$4;

    .line 39
    .line 40
    invoke-direct {v1, p0}, Lcom/friday/paint/view/six/NewStudentPaintFragment$special$$inlined$activityViewModels$default$4;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 41
    .line 42
    .line 43
    new-instance v2, Lcom/friday/paint/view/six/NewStudentPaintFragment$special$$inlined$activityViewModels$default$5;

    .line 44
    .line 45
    invoke-direct {v2, v3, p0}, Lcom/friday/paint/view/six/NewStudentPaintFragment$special$$inlined$activityViewModels$default$5;-><init>(Lhd/a;Landroidx/fragment/app/Fragment;)V

    .line 46
    .line 47
    .line 48
    new-instance v3, Lcom/friday/paint/view/six/NewStudentPaintFragment$special$$inlined$activityViewModels$default$6;

    .line 49
    .line 50
    invoke-direct {v3, p0}, Lcom/friday/paint/view/six/NewStudentPaintFragment$special$$inlined$activityViewModels$default$6;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 51
    .line 52
    .line 53
    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lod/c;Lhd/a;Lhd/a;Lhd/a;)Lqc/d;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object v0, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment;->viewModel2$delegate:Lqc/d;

    .line 58
    .line 59
    return-void
.end method

.method public static final synthetic access$getMBinding(Lcom/friday/paint/view/six/NewStudentPaintFragment;)Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 6
    .line 7
    return-object p0
.end method

.method public static final synthetic access$getQstType$p(Lcom/friday/paint/view/six/NewStudentPaintFragment;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment;->qstType:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic access$getViewModel(Lcom/friday/paint/view/six/NewStudentPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getViewModel2(Lcom/friday/paint/view/six/NewStudentPaintFragment;)Lcom/friday/paint/viewmodel/NewNoteViewModel;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->getViewModel2()Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$handleHomework(Lcom/friday/paint/view/six/NewStudentPaintFragment;Lcom/friday/common/classtest/MqttResponse;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->handleHomework(Lcom/friday/common/classtest/MqttResponse;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$setQstType$p(Lcom/friday/paint/view/six/NewStudentPaintFragment;I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment;->qstType:I

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setScreensPermission$p(Lcom/friday/paint/view/six/NewStudentPaintFragment;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment;->screensPermission:Z

    .line 2
    .line 3
    return-void
.end method

.method private final base64ToBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {p1, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    const-string v1, "decode(...)"

    .line 7
    .line 8
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    array-length v1, p1

    .line 12
    invoke-static {p1, v0, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    .line 13
    .line 14
    .line 15
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    return-object p1

    .line 17
    :catch_0
    move-exception p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    return-object p1
.end method

.method private final getViewModel()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment;->viewModel$delegate:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method private final getViewModel2()Lcom/friday/paint/viewmodel/NewNoteViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment;->viewModel2$delegate:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public static synthetic h0(Lcom/friday/paint/view/six/NewStudentPaintFragment;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->initData$lambda$5(Lcom/friday/paint/view/six/NewStudentPaintFragment;Ljava/lang/String;)V

    return-void
.end method

.method private final handleHomework(Lcom/friday/common/classtest/MqttResponse;)V
    .locals 3

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, v2}, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;-><init>(Lcom/friday/paint/view/six/NewStudentPaintFragment;Lcom/friday/common/classtest/MqttResponse;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenResumed(Lhd/p;)Lkotlinx/coroutines/g;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static synthetic i0(Lcom/friday/paint/view/six/NewStudentPaintFragment;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->initData$lambda$12(Lcom/friday/paint/view/six/NewStudentPaintFragment;Ljava/lang/String;)V

    return-void
.end method

.method private static final initData$lambda$1(Lcom/friday/paint/view/six/NewStudentPaintFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    new-instance p1, Lcom/friday/paint/dialog/HomeworkSubmitConfirmDialog;

    .line 2
    .line 3
    invoke-direct {p1}, Lcom/friday/paint/dialog/HomeworkSubmitConfirmDialog;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ld4/a1;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Ld4/a1;-><init>(Lcom/friday/paint/view/six/NewStudentPaintFragment;Lcom/friday/paint/dialog/HomeworkSubmitConfirmDialog;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lcom/friday/paint/dialog/HomeworkSubmitConfirmDialog;->s(Lhd/a;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-class v0, Lcom/friday/paint/dialog/HomeworkSubmitConfirmDialog;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p1, p0, v0}, Landroidx/fragment/app/DialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method private static final initData$lambda$1$lambda$0(Lcom/friday/paint/view/six/NewStudentPaintFragment;Lcom/friday/paint/dialog/HomeworkSubmitConfirmDialog;)Lqc/q;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->submitSubjectiveHomework()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroidx/fragment/app/DialogFragment;->dismissAllowingStateLoss()V

    .line 5
    .line 6
    .line 7
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 8
    .line 9
    return-object p0
.end method

.method private static final initData$lambda$10(Lcom/friday/paint/view/six/NewStudentPaintFragment;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    new-instance v0, Ld4/z0;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Ld4/z0;-><init>(Lcom/friday/paint/view/six/NewStudentPaintFragment;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method private static final initData$lambda$10$lambda$9(Lcom/friday/paint/view/six/NewStudentPaintFragment;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/Iterable;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x0

    .line 16
    move v2, v1

    .line 17
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_2

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    add-int/lit8 v4, v2, 0x1

    .line 28
    .line 29
    if-gez v2, :cond_0

    .line 30
    .line 31
    invoke-static {}, Lrc/w;->w()V

    .line 32
    .line 33
    .line 34
    :cond_0
    check-cast v3, Lcom/friday/paint/model/NoteListEntity;

    .line 35
    .line 36
    invoke-virtual {v3}, Lcom/friday/paint/model/NoteListEntity;->getInClass()Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-eqz v5, :cond_1

    .line 41
    .line 42
    invoke-virtual {v3, v1}, Lcom/friday/paint/model/NoteListEntity;->setInClass(Z)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    sget-object v5, Lcom/friday/common/entity/PayloadKey;->IN_CLASS:Lcom/friday/common/entity/PayloadKey;

    .line 50
    .line 51
    invoke-virtual {v3, v2, v5}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(ILjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    move v2, v4

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    invoke-virtual {p0, v1}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method private static final initData$lambda$11(Lcom/friday/paint/view/six/NewStudentPaintFragment;Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "TIME_UP"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 16
    .line 17
    iget-object p1, p1, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->p:Landroid/widget/ImageView;

    .line 18
    .line 19
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->j()Landroidx/lifecycle/MutableLiveData;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    const-string v0, "END_CLASS"

    .line 37
    .line 38
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_1

    .line 43
    .line 44
    invoke-static {}, Lcom/blankj/utilcode/util/CacheMemoryUtils;->getInstance()Lcom/blankj/utilcode/util/CacheMemoryUtils;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const-string v0, "answer_cache"

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Lcom/blankj/utilcode/util/CacheMemoryUtils;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 58
    .line 59
    iget-object p1, p1, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->p:Landroid/widget/ImageView;

    .line 60
    .line 61
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    check-cast p1, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 69
    .line 70
    iget-object p1, p1, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->f:Landroid/widget/ImageView;

    .line 71
    .line 72
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 73
    .line 74
    .line 75
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    const/4 v0, 0x1

    .line 80
    invoke-virtual {p1, v0}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->t(Z)V

    .line 81
    .line 82
    .line 83
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    const-class p1, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;

    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {p0, p1}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    const-string p1, "null cannot be cast to non-null type com.friday.paint.dialog.ObjectiveHomeworkSubmitDialog"

    .line 98
    .line 99
    invoke-static {p0, p1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    check-cast p0, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;

    .line 103
    .line 104
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->dismissAllowingStateLoss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 105
    .line 106
    .line 107
    :catch_0
    :cond_1
    return-void
.end method

.method private static final initData$lambda$12(Lcom/friday/paint/view/six/NewStudentPaintFragment;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment;->submitStatusJob:Lkotlinx/coroutines/g;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-static {v0, v2, v1, v2}, Lkotlinx/coroutines/g$a;->a(Lkotlinx/coroutines/g;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    if-eqz p1, :cond_4

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/16 v2, 0x8

    .line 17
    .line 18
    sparse-switch v0, :sswitch_data_0

    .line 19
    .line 20
    .line 21
    goto/16 :goto_0

    .line 22
    .line 23
    :sswitch_0
    const-string v0, "ID_ERROR"

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-nez p1, :cond_1

    .line 30
    .line 31
    goto/16 :goto_0

    .line 32
    .line 33
    :cond_1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 38
    .line 39
    iget-object p0, p0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->p:Landroid/widget/ImageView;

    .line 40
    .line 41
    invoke-virtual {p0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 42
    .line 43
    .line 44
    const-string p0, "\u9898\u76ee\u4e0d\u4e00\u81f4\uff0c\u8bf7\u91cd\u65b0\u63a5\u6536\u968f\u5802\u6d4b\u7b54\u9898"

    .line 45
    .line 46
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :sswitch_1
    const-string v0, "END_CLASS"

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-nez p1, :cond_2

    .line 57
    .line 58
    goto/16 :goto_0

    .line 59
    .line 60
    :cond_2
    invoke-static {}, Lcom/blankj/utilcode/util/CacheMemoryUtils;->getInstance()Lcom/blankj/utilcode/util/CacheMemoryUtils;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    const-string v0, "answer_cache"

    .line 65
    .line 66
    invoke-virtual {p1, v0}, Lcom/blankj/utilcode/util/CacheMemoryUtils;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    check-cast p1, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 74
    .line 75
    iget-object p1, p1, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->p:Landroid/widget/ImageView;

    .line 76
    .line 77
    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    check-cast p1, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 85
    .line 86
    iget-object p1, p1, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->f:Landroid/widget/ImageView;

    .line 87
    .line 88
    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 89
    .line 90
    .line 91
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-virtual {p1, v1}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->t(Z)V

    .line 96
    .line 97
    .line 98
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    const-class p1, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;

    .line 103
    .line 104
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-virtual {p0, p1}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    const-string p1, "null cannot be cast to non-null type com.friday.paint.dialog.ObjectiveHomeworkSubmitDialog"

    .line 113
    .line 114
    invoke-static {p0, p1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    check-cast p0, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;

    .line 118
    .line 119
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->dismissAllowingStateLoss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 120
    .line 121
    .line 122
    :catch_0
    const-string p0, "\u968f\u5802\u6d4b\u5df2\u7ed3\u675f"

    .line 123
    .line 124
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :sswitch_2
    const-string v0, "TIME_UP"

    .line 129
    .line 130
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    if-nez p1, :cond_3

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_3
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    check-cast p1, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 142
    .line 143
    iget-object p1, p1, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->p:Landroid/widget/ImageView;

    .line 144
    .line 145
    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 146
    .line 147
    .line 148
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    invoke-virtual {p0}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->j()Landroidx/lifecycle/MutableLiveData;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 157
    .line 158
    invoke-virtual {p0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    const-string p0, "\u7b54\u9898\u5df2\u622a\u6b62"

    .line 162
    .line 163
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 164
    .line 165
    .line 166
    return-void

    .line 167
    :sswitch_3
    const-string v0, "NORMAL"

    .line 168
    .line 169
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result p1

    .line 173
    if-eqz p1, :cond_4

    .line 174
    .line 175
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    invoke-virtual {p1, v1}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->v(Z)V

    .line 180
    .line 181
    .line 182
    const-string p1, "\u63d0\u4ea4\u7b54\u6848\u6210\u529f"

    .line 183
    .line 184
    invoke-static {p1}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    check-cast p1, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 192
    .line 193
    iget-object p1, p1, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->p:Landroid/widget/ImageView;

    .line 194
    .line 195
    invoke-virtual {p1, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    check-cast p0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 203
    .line 204
    iget-object p0, p0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->p:Landroid/widget/ImageView;

    .line 205
    .line 206
    invoke-virtual {p0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 207
    .line 208
    .line 209
    :cond_4
    :goto_0
    return-void

    .line 210
    nop

    .line 211
    :sswitch_data_0
    .sparse-switch
        -0x76664f19 -> :sswitch_3
        -0x2384eab3 -> :sswitch_2
        0x502568d4 -> :sswitch_1
        0x526cc5c4 -> :sswitch_0
    .end sparse-switch
.end method

.method private static final initData$lambda$14(Lcom/friday/paint/view/six/NewStudentPaintFragment;Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->h()Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lcom/blankj/utilcode/util/CacheMemoryUtils;->getInstance()Lcom/blankj/utilcode/util/CacheMemoryUtils;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v0, "answer_cache"

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Lcom/blankj/utilcode/util/CacheMemoryUtils;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    const-string p1, "\u968f\u5802\u6d4b\u5df2\u7ed3\u675f"

    .line 22
    .line 23
    invoke-static {p1}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const/4 v0, 0x0

    .line 31
    invoke-virtual {p1, v0}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->w(Lcom/friday/common/classtest/MqttResponse;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const/4 v0, 0x1

    .line 39
    invoke-virtual {p1, v0}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->t(Z)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    check-cast p1, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 47
    .line 48
    iget-object p1, p1, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->p:Landroid/widget/ImageView;

    .line 49
    .line 50
    const/16 v0, 0x8

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 60
    .line 61
    iget-object p1, p1, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->f:Landroid/widget/ImageView;

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 64
    .line 65
    .line 66
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    const-class v0, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {p1, v0}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    const-string v0, "null cannot be cast to non-null type com.friday.paint.dialog.ObjectiveHomeworkSubmitDialog"

    .line 81
    .line 82
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    check-cast p1, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;

    .line 86
    .line 87
    invoke-virtual {p1}, Landroidx/fragment/app/DialogFragment;->dismissAllowingStateLoss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :catch_0
    move-exception p1

    .line 92
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 93
    .line 94
    .line 95
    :goto_0
    :try_start_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    const-class v0, Lcom/friday/paint/dialog/ReceiveClassTestDialog;

    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {p1, v0}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    const-string v0, "null cannot be cast to non-null type com.friday.paint.dialog.ReceiveClassTestDialog"

    .line 110
    .line 111
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    check-cast p1, Lcom/friday/paint/dialog/ReceiveClassTestDialog;

    .line 115
    .line 116
    invoke-virtual {p1}, Landroidx/fragment/app/DialogFragment;->dismissAllowingStateLoss()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 117
    .line 118
    .line 119
    :catch_1
    invoke-virtual {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    check-cast p1, Ljava/lang/Iterable;

    .line 128
    .line 129
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    const/4 v0, 0x0

    .line 134
    move v1, v0

    .line 135
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    if-eqz v2, :cond_1

    .line 140
    .line 141
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    add-int/lit8 v3, v1, 0x1

    .line 146
    .line 147
    if-gez v1, :cond_0

    .line 148
    .line 149
    invoke-static {}, Lrc/w;->w()V

    .line 150
    .line 151
    .line 152
    :cond_0
    check-cast v2, Lcom/friday/paint/model/NoteListEntity;

    .line 153
    .line 154
    invoke-virtual {v2, v0}, Lcom/friday/paint/model/NoteListEntity;->setInClass(Z)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    sget-object v4, Lcom/friday/common/entity/PayloadKey;->IN_CLASS:Lcom/friday/common/entity/PayloadKey;

    .line 162
    .line 163
    invoke-virtual {v2, v1, v4}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(ILjava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    move v1, v3

    .line 167
    goto :goto_1

    .line 168
    :cond_1
    return-void
.end method

.method private static final initData$lambda$15(Lcom/friday/paint/view/six/NewStudentPaintFragment;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->p:Landroid/widget/ImageView;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->j()Landroidx/lifecycle/MutableLiveData;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    const-string p0, "\u7b54\u9898\u5df2\u622a\u6b62"

    .line 28
    .line 29
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method private static final initData$lambda$2(Lcom/friday/paint/view/six/NewStudentPaintFragment;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-class v0, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p1, v1}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance p1, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;

    .line 19
    .line 20
    invoke-direct {p1}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const-string v1, "getChildFragmentManager(...)"

    .line 28
    .line 29
    invoke-static {p0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {p1, p0, v0}, Lcom/friday/common/base/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method private static final initData$lambda$4(Lcom/friday/paint/view/six/NewStudentPaintFragment;Landroid/view/View;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getCurrentNoteFragment()Lcom/zykj/view/board/board/BoardFragment;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getCurrentNoteFragment()Lcom/zykj/view/board/board/BoardFragment;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/zykj/view/board/board/BoardFragment;->D1()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-string p0, "\u56fe\u7247\u6570\u91cf\u5df2\u8fbe\u4e0a\u9650\uff0c\u4e0d\u53ef\u7ee7\u7eed\u63d2\u5165"

    .line 21
    .line 22
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getCurrentNoteFragment()Lcom/zykj/view/board/board/BoardFragment;

    .line 27
    .line 28
    .line 29
    sget-object p1, Lf2/c;->a:Lf2/c;

    .line 30
    .line 31
    invoke-virtual {p1}, Lf2/c;->e()Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-nez p1, :cond_2

    .line 36
    .line 37
    const-string p0, "\u7f51\u7edc\u672a\u8fde\u63a5"

    .line 38
    .line 39
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_2
    iget-boolean p1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment;->screensPermission:Z

    .line 44
    .line 45
    if-nez p1, :cond_3

    .line 46
    .line 47
    const-string p0, "\u60a8\u7684\u622a\u56fe\u6743\u9650\u5df2\u5173\u95ed\uff0c\u8bf7\u8054\u7cfb\u5b66\u6821\u5de5\u4f5c\u4eba\u5458\u8fdb\u884c\u5f00\u542f"

    .line 48
    .line 49
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 54
    .line 55
    .line 56
    move-result-wide v0

    .line 57
    iget-wide v2, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment;->exitTime:J

    .line 58
    .line 59
    sub-long/2addr v0, v2

    .line 60
    const-wide/16 v2, 0xbb8

    .line 61
    .line 62
    cmp-long p1, v0, v2

    .line 63
    .line 64
    if-gez p1, :cond_4

    .line 65
    .line 66
    const-string p0, "\u622a\u56fe\u8fc7\u4e8e\u9891\u7e41"

    .line 67
    .line 68
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 73
    .line 74
    .line 75
    move-result-wide v0

    .line 76
    iput-wide v0, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment;->exitTime:J

    .line 77
    .line 78
    const-string p0, "\u6b63\u5728\u622a\u56fe"

    .line 79
    .line 80
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 81
    .line 82
    .line 83
    const-class p0, Lcom/friday/common/entity/MqttEntity;

    .line 84
    .line 85
    invoke-static {p0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    new-instance p1, Lcom/friday/common/entity/MqttEntity;

    .line 90
    .line 91
    sget-object v0, Lcom/friday/common/entity/MqttType;->NONE:Lcom/friday/common/entity/MqttType;

    .line 92
    .line 93
    new-instance v1, Lcom/friday/common/classtest/MqttRequestEntity;

    .line 94
    .line 95
    const/16 v2, 0x2715

    .line 96
    .line 97
    const/4 v3, 0x2

    .line 98
    const/4 v4, 0x0

    .line 99
    invoke-direct {v1, v2, v4, v3, v4}, Lcom/friday/common/classtest/MqttRequestEntity;-><init>(ILcom/friday/common/classtest/RequestScreencastData;ILkotlin/jvm/internal/n;)V

    .line 100
    .line 101
    .line 102
    invoke-static {v1}, Lcom/blankj/utilcode/util/GsonUtils;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    const-string v2, "toJson(...)"

    .line 107
    .line 108
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    const-string v2, "board"

    .line 112
    .line 113
    invoke-direct {p1, v0, v1, v2}, Lcom/friday/common/entity/MqttEntity;-><init>(Lcom/friday/common/entity/MqttType;Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-interface {p0, p1}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    return-void
.end method

.method private static final initData$lambda$5(Lcom/friday/paint/view/six/NewStudentPaintFragment;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, p1, v0}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->saveScreenShoot(Ljava/lang/String;Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private static final initData$lambda$6(Lcom/friday/paint/view/six/NewStudentPaintFragment;Ljava/lang/Boolean;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 6
    .line 7
    iget-object p0, p0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->o:Landroid/widget/ImageView;

    .line 8
    .line 9
    const-string v0, "ivScreenShoot"

    .line 10
    .line 11
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/16 p1, 0x8

    .line 26
    .line 27
    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method private static final initData$lambda$7(Lcom/friday/paint/view/six/NewStudentPaintFragment;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/blankj/utilcode/util/CacheMemoryUtils;->getInstance()Lcom/blankj/utilcode/util/CacheMemoryUtils;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "answer_cache"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/CacheMemoryUtils;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/friday/common/entity/AnswerCache;

    .line 12
    .line 13
    const-class v1, Lcom/friday/common/classtest/MqttResponse;

    .line 14
    .line 15
    invoke-static {p1, v1}, Lcom/blankj/utilcode/util/GsonUtils;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lcom/friday/common/classtest/MqttResponse;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/friday/common/classtest/MqttResponse;->getGuid()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0}, Lcom/friday/common/entity/AnswerCache;->getGuid()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0, p1}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->A(Lcom/friday/common/classtest/MqttResponse;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method private final initObserver()V
    .locals 0

    return-void
.end method

.method public static synthetic j0(Lcom/friday/paint/view/six/NewStudentPaintFragment;Ljava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->submitSubjectiveHomework$lambda$16(Lcom/friday/paint/view/six/NewStudentPaintFragment;Ljava/lang/String;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k0(Lcom/friday/paint/view/six/NewStudentPaintFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->initData$lambda$2(Lcom/friday/paint/view/six/NewStudentPaintFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic l0(Lcom/friday/paint/view/six/NewStudentPaintFragment;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->initData$lambda$11(Lcom/friday/paint/view/six/NewStudentPaintFragment;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic m0(Lcom/friday/paint/view/six/NewStudentPaintFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->initData$lambda$1(Lcom/friday/paint/view/six/NewStudentPaintFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic n0(Lcom/friday/paint/view/six/NewStudentPaintFragment;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->initData$lambda$7(Lcom/friday/paint/view/six/NewStudentPaintFragment;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic o0(Lcom/friday/paint/view/six/NewStudentPaintFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->initData$lambda$4(Lcom/friday/paint/view/six/NewStudentPaintFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic p0(Lcom/friday/paint/view/six/NewStudentPaintFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->initData$lambda$10$lambda$9(Lcom/friday/paint/view/six/NewStudentPaintFragment;)V

    return-void
.end method

.method public static synthetic q0(Lcom/friday/paint/view/six/NewStudentPaintFragment;Lcom/friday/paint/dialog/HomeworkSubmitConfirmDialog;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->initData$lambda$1$lambda$0(Lcom/friday/paint/view/six/NewStudentPaintFragment;Lcom/friday/paint/dialog/HomeworkSubmitConfirmDialog;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r0(Lcom/friday/paint/view/six/NewStudentPaintFragment;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->initData$lambda$14(Lcom/friday/paint/view/six/NewStudentPaintFragment;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic s0(Lcom/friday/paint/view/six/NewStudentPaintFragment;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->initData$lambda$15(Lcom/friday/paint/view/six/NewStudentPaintFragment;Ljava/lang/Object;)V

    return-void
.end method

.method private final saveScreenShoot(Ljava/lang/String;Z)V
    .locals 8

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppCachePath()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    new-instance v2, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string p2, "/"

    .line 20
    .line 21
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string p2, ".webp"

    .line 28
    .line 29
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-direct {p0, p1}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->base64ToBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->WEBP:Landroid/graphics/Bitmap$CompressFormat;

    .line 41
    .line 42
    const/16 v1, 0x46

    .line 43
    .line 44
    invoke-static {p1, p2, v0, v1}, Lcom/blankj/utilcode/util/ImageUtils;->save(Landroid/graphics/Bitmap;Ljava/lang/String;Landroid/graphics/Bitmap$CompressFormat;I)Z

    .line 45
    .line 46
    .line 47
    move-object v3, p2

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    move-object v3, p1

    .line 50
    :goto_0
    sget-object v2, Lk2/n;->a:Lk2/n$a;

    .line 51
    .line 52
    const/4 v6, 0x6

    .line 53
    const/4 v7, 0x0

    .line 54
    const/4 v4, 0x0

    .line 55
    const/4 v5, 0x0

    .line 56
    invoke-static/range {v2 .. v7}, Lk2/n$a;->b(Lk2/n$a;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public static synthetic saveScreenShoot$default(Lcom/friday/paint/view/six/NewStudentPaintFragment;Ljava/lang/String;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x1

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->saveScreenShoot(Ljava/lang/String;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final startBtEnableStatusJob()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment;->submitStatusJob:Lkotlinx/coroutines/g;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/g$a;->a(Lkotlinx/coroutines/g;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    new-instance v6, Lcom/friday/paint/view/six/NewStudentPaintFragment$startBtEnableStatusJob$1;

    .line 15
    .line 16
    invoke-direct {v6, p0, v1}, Lcom/friday/paint/view/six/NewStudentPaintFragment$startBtEnableStatusJob$1;-><init>(Lcom/friday/paint/view/six/NewStudentPaintFragment;Lvc/c;)V

    .line 17
    .line 18
    .line 19
    const/4 v7, 0x3

    .line 20
    const/4 v8, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x0

    .line 23
    invoke-static/range {v3 .. v8}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment;->submitStatusJob:Lkotlinx/coroutines/g;

    .line 28
    .line 29
    return-void
.end method

.method private final submitSubjectiveHomework()V
    .locals 8

    .line 1
    invoke-static {}, Lcom/blankj/utilcode/util/NetworkUtils;->isWifiConnected()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "\u7f51\u7edc\u5f02\u5e38\uff0c\u63d0\u4ea4\u5931\u8d25\uff0c\u8bf7\u91cd\u8bd5\u3002"

    .line 8
    .line 9
    invoke-static {v0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const/4 v0, 0x1

    .line 14
    invoke-virtual {p0, v0}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getCurrentNoteFragment()Lcom/zykj/view/board/board/BoardFragment;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    const-string v0, "\u83b7\u53d6\u5f53\u524d\u9875\u9762\u5931\u8d25"

    .line 24
    .line 25
    invoke-static {v0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 26
    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    invoke-virtual {p0, v0}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    new-instance v5, Ld4/u0;

    .line 34
    .line 35
    invoke-direct {v5, p0}, Ld4/u0;-><init>(Lcom/friday/paint/view/six/NewStudentPaintFragment;)V

    .line 36
    .line 37
    .line 38
    const/4 v6, 0x4

    .line 39
    const/4 v7, 0x0

    .line 40
    const/4 v3, 0x0

    .line 41
    const/4 v4, 0x0

    .line 42
    move-object v1, p0

    .line 43
    invoke-static/range {v1 .. v7}, Lcom/friday/paint/view/six/NewPaintFragment;->save$default(Lcom/friday/paint/view/six/NewPaintFragment;Lcom/zykj/view/board/board/BoardFragment;ZLhd/l;Lhd/l;ILjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method private static final submitSubjectiveHomework$lambda$16(Lcom/friday/paint/view/six/NewStudentPaintFragment;Ljava/lang/String;)Lqc/q;
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p1, p0, v1}, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1;-><init>(Ljava/lang/String;Lcom/friday/paint/view/six/NewStudentPaintFragment;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->startBtEnableStatusJob()V

    .line 18
    .line 19
    .line 20
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 21
    .line 22
    return-object p0
.end method

.method public static synthetic t0(Lcom/friday/paint/view/six/NewStudentPaintFragment;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->initData$lambda$10(Lcom/friday/paint/view/six/NewStudentPaintFragment;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic u0(Lcom/friday/paint/view/six/NewStudentPaintFragment;Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->initData$lambda$6(Lcom/friday/paint/view/six/NewStudentPaintFragment;Ljava/lang/Boolean;)V

    return-void
.end method


# virtual methods
.method public initData()V
    .locals 8

    .line 1
    invoke-super {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->initData()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->initObserver()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 12
    .line 13
    iget-object v0, v0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->r:Landroid/widget/LinearLayout;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 24
    .line 25
    iget-object v0, v0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->p:Landroid/widget/ImageView;

    .line 26
    .line 27
    new-instance v2, Ld4/b1;

    .line 28
    .line 29
    invoke-direct {v2, p0}, Ld4/b1;-><init>(Lcom/friday/paint/view/six/NewStudentPaintFragment;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v2}, Lcom/blankj/utilcode/util/ClickUtils;->applyGlobalDebouncing(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 40
    .line 41
    iget-object v0, v0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->o:Landroid/widget/ImageView;

    .line 42
    .line 43
    const-string v2, "ivScreenShoot"

    .line 44
    .line 45
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getIClassManager()Lj2/b;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-interface {v2}, Lj2/b;->g()Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_0

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    const/16 v1, 0x8

    .line 60
    .line 61
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 69
    .line 70
    iget-object v0, v0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->f:Landroid/widget/ImageView;

    .line 71
    .line 72
    new-instance v1, Ld4/d1;

    .line 73
    .line 74
    invoke-direct {v1, p0}, Ld4/d1;-><init>(Lcom/friday/paint/view/six/NewStudentPaintFragment;)V

    .line 75
    .line 76
    .line 77
    invoke-static {v0, v1}, Lcom/blankj/utilcode/util/ClickUtils;->applyGlobalDebouncing(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 85
    .line 86
    iget-object v0, v0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->o:Landroid/widget/ImageView;

    .line 87
    .line 88
    new-instance v1, Ld4/e1;

    .line 89
    .line 90
    invoke-direct {v1, p0}, Ld4/e1;-><init>(Lcom/friday/paint/view/six/NewStudentPaintFragment;)V

    .line 91
    .line 92
    .line 93
    invoke-static {v0, v1}, Lcom/blankj/utilcode/util/ClickUtils;->applyGlobalDebouncing(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 94
    .line 95
    .line 96
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    new-instance v5, Lcom/friday/paint/view/six/NewStudentPaintFragment$initData$4;

    .line 101
    .line 102
    const/4 v0, 0x0

    .line 103
    invoke-direct {v5, p0, v0}, Lcom/friday/paint/view/six/NewStudentPaintFragment$initData$4;-><init>(Lcom/friday/paint/view/six/NewStudentPaintFragment;Lvc/c;)V

    .line 104
    .line 105
    .line 106
    const/4 v6, 0x3

    .line 107
    const/4 v7, 0x0

    .line 108
    const/4 v3, 0x0

    .line 109
    const/4 v4, 0x0

    .line 110
    invoke-static/range {v2 .. v7}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 111
    .line 112
    .line 113
    const-string v1, "LiveSnapshot"

    .line 114
    .line 115
    const-class v2, Ljava/lang/String;

    .line 116
    .line 117
    invoke-static {v1, v2}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    new-instance v3, Ld4/f1;

    .line 122
    .line 123
    invoke-direct {v3, p0}, Ld4/f1;-><init>(Lcom/friday/paint/view/six/NewStudentPaintFragment;)V

    .line 124
    .line 125
    .line 126
    invoke-interface {v1, p0, v3}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 127
    .line 128
    .line 129
    const-string v1, "mqttServiceStatus"

    .line 130
    .line 131
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 132
    .line 133
    invoke-static {v1, v3}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    new-instance v4, Ld4/g1;

    .line 142
    .line 143
    invoke-direct {v4, p0}, Ld4/g1;-><init>(Lcom/friday/paint/view/six/NewStudentPaintFragment;)V

    .line 144
    .line 145
    .line 146
    invoke-interface {v1, v3, v4}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 147
    .line 148
    .line 149
    const-string v1, "receiveHomework"

    .line 150
    .line 151
    invoke-static {v1, v2}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    new-instance v3, Ld4/h1;

    .line 156
    .line 157
    invoke-direct {v3, p0}, Ld4/h1;-><init>(Lcom/friday/paint/view/six/NewStudentPaintFragment;)V

    .line 158
    .line 159
    .line 160
    invoke-interface {v1, p0, v3}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 161
    .line 162
    .line 163
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    new-instance v3, Lcom/friday/paint/view/six/NewStudentPaintFragment$initData$8;

    .line 168
    .line 169
    invoke-direct {v3, p0, v0}, Lcom/friday/paint/view/six/NewStudentPaintFragment$initData$8;-><init>(Lcom/friday/paint/view/six/NewStudentPaintFragment;Lvc/c;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v1, v3}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenResumed(Lhd/p;)Lkotlinx/coroutines/g;

    .line 173
    .line 174
    .line 175
    const-string v0, "submitHomeworkOver"

    .line 176
    .line 177
    invoke-static {v0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    new-instance v1, Ld4/v0;

    .line 182
    .line 183
    invoke-direct {v1, p0}, Ld4/v0;-><init>(Lcom/friday/paint/view/six/NewStudentPaintFragment;)V

    .line 184
    .line 185
    .line 186
    invoke-interface {v0, p0, v1}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 187
    .line 188
    .line 189
    const-string v0, "requestHomeworkStatusReply"

    .line 190
    .line 191
    invoke-static {v0, v2}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    new-instance v1, Ld4/w0;

    .line 196
    .line 197
    invoke-direct {v1, p0}, Ld4/w0;-><init>(Lcom/friday/paint/view/six/NewStudentPaintFragment;)V

    .line 198
    .line 199
    .line 200
    invoke-interface {v0, p0, v1}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 201
    .line 202
    .line 203
    const-string v0, "submitHomeworkReply"

    .line 204
    .line 205
    invoke-static {v0, v2}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    new-instance v1, Ld4/x0;

    .line 210
    .line 211
    invoke-direct {v1, p0}, Ld4/x0;-><init>(Lcom/friday/paint/view/six/NewStudentPaintFragment;)V

    .line 212
    .line 213
    .line 214
    invoke-interface {v0, p0, v1}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 215
    .line 216
    .line 217
    const-string v0, "homeworkEndClass"

    .line 218
    .line 219
    invoke-static {v0, v2}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    new-instance v1, Ld4/y0;

    .line 224
    .line 225
    invoke-direct {v1, p0}, Ld4/y0;-><init>(Lcom/friday/paint/view/six/NewStudentPaintFragment;)V

    .line 226
    .line 227
    .line 228
    invoke-interface {v0, p0, v1}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 229
    .line 230
    .line 231
    const-string v0, "homeworkTimeUp"

    .line 232
    .line 233
    invoke-static {v0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    new-instance v1, Ld4/c1;

    .line 238
    .line 239
    invoke-direct {v1, p0}, Ld4/c1;-><init>(Lcom/friday/paint/view/six/NewStudentPaintFragment;)V

    .line 240
    .line 241
    .line 242
    invoke-interface {v0, p0, v1}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 243
    .line 244
    .line 245
    const-class v0, Lcom/friday/common/entity/MqttEntity;

    .line 246
    .line 247
    invoke-static {v0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    new-instance v1, Lcom/friday/common/entity/MqttEntity;

    .line 252
    .line 253
    sget-object v2, Lcom/friday/common/entity/MqttType;->REQUEST_HOMEWORK_STATUS:Lcom/friday/common/entity/MqttType;

    .line 254
    .line 255
    sget-object v3, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 256
    .line 257
    invoke-virtual {v3}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 258
    .line 259
    .line 260
    move-result-object v3

    .line 261
    invoke-virtual {v3}, Lcom/friday/common/helper/b;->t()J

    .line 262
    .line 263
    .line 264
    move-result-wide v3

    .line 265
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v3

    .line 269
    const/4 v5, 0x4

    .line 270
    const/4 v6, 0x0

    .line 271
    const/4 v4, 0x0

    .line 272
    invoke-direct/range {v1 .. v6}, Lcom/friday/common/entity/MqttEntity;-><init>(Lcom/friday/common/entity/MqttType;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 273
    .line 274
    .line 275
    invoke-interface {v0, v1}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    return-void
.end method

.method public onResume()V
    .locals 6

    .line 1
    invoke-super {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->onResume()V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v3, Lcom/friday/paint/view/six/NewStudentPaintFragment$onResume$1;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v3, p0, v1}, Lcom/friday/paint/view/six/NewStudentPaintFragment$onResume$1;-><init>(Lcom/friday/paint/view/six/NewStudentPaintFragment;Lvc/c;)V

    .line 12
    .line 13
    .line 14
    const/4 v4, 0x3

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 18
    .line 19
    .line 20
    return-void
.end method
