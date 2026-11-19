.class public final Lcom/zykj/study/ui/home/my/EditCourseFragment;
.super Lcom/zykj/study/ui/home/my/Hilt_EditCourseFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/home/my/Hilt_EditCourseFragment<",
        "Lcom/zykj/study/databinding/FragmentEditCourseBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Lh7/d;

.field public final g:Lh7/d;

.field public final h:Lh7/d;

.field public i:Ljava/util/List;

.field public final j:Landroidx/navigation/NavArgsLazy;

.field public final k:La6/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/Hilt_EditCourseFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/zykj/study/ui/home/my/EditCourseFragment$special$$inlined$viewModels$default$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/zykj/study/ui/home/my/EditCourseFragment$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->c:Lkotlin/LazyThreadSafetyMode;

    .line 10
    .line 11
    new-instance v2, Lcom/zykj/study/ui/home/my/EditCourseFragment$special$$inlined$viewModels$default$2;

    .line 12
    .line 13
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/my/EditCourseFragment$special$$inlined$viewModels$default$2;-><init>(Lx7/a;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-class v2, Lcom/zykj/study/viewmodels/EditCourseViewModel;

    .line 21
    .line 22
    invoke-static {v2}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    new-instance v3, Lcom/zykj/study/ui/home/my/EditCourseFragment$special$$inlined$viewModels$default$3;

    .line 27
    .line 28
    invoke-direct {v3, v0}, Lcom/zykj/study/ui/home/my/EditCourseFragment$special$$inlined$viewModels$default$3;-><init>(Lh7/d;)V

    .line 29
    .line 30
    .line 31
    new-instance v4, Lcom/zykj/study/ui/home/my/EditCourseFragment$special$$inlined$viewModels$default$4;

    .line 32
    .line 33
    const/4 v5, 0x0

    .line 34
    invoke-direct {v4, v5, v0}, Lcom/zykj/study/ui/home/my/EditCourseFragment$special$$inlined$viewModels$default$4;-><init>(Lx7/a;Lh7/d;)V

    .line 35
    .line 36
    .line 37
    new-instance v6, Lcom/zykj/study/ui/home/my/EditCourseFragment$special$$inlined$viewModels$default$5;

    .line 38
    .line 39
    invoke-direct {v6, p0, v0}, Lcom/zykj/study/ui/home/my/EditCourseFragment$special$$inlined$viewModels$default$5;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p0, v2, v3, v4, v6}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/EditCourseFragment;->f:Lh7/d;

    .line 47
    .line 48
    new-instance v0, Lcom/zykj/study/ui/home/my/EditCourseFragment$special$$inlined$viewModels$default$6;

    .line 49
    .line 50
    invoke-direct {v0, p0}, Lcom/zykj/study/ui/home/my/EditCourseFragment$special$$inlined$viewModels$default$6;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 51
    .line 52
    .line 53
    new-instance v2, Lcom/zykj/study/ui/home/my/EditCourseFragment$special$$inlined$viewModels$default$7;

    .line 54
    .line 55
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/my/EditCourseFragment$special$$inlined$viewModels$default$7;-><init>(Lx7/a;)V

    .line 56
    .line 57
    .line 58
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const-class v1, Lcom/zykj/study/viewmodels/OssTokenViewModel;

    .line 63
    .line 64
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    new-instance v2, Lcom/zykj/study/ui/home/my/EditCourseFragment$special$$inlined$viewModels$default$8;

    .line 69
    .line 70
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/my/EditCourseFragment$special$$inlined$viewModels$default$8;-><init>(Lh7/d;)V

    .line 71
    .line 72
    .line 73
    new-instance v3, Lcom/zykj/study/ui/home/my/EditCourseFragment$special$$inlined$viewModels$default$9;

    .line 74
    .line 75
    invoke-direct {v3, v5, v0}, Lcom/zykj/study/ui/home/my/EditCourseFragment$special$$inlined$viewModels$default$9;-><init>(Lx7/a;Lh7/d;)V

    .line 76
    .line 77
    .line 78
    new-instance v4, Lcom/zykj/study/ui/home/my/EditCourseFragment$special$$inlined$viewModels$default$10;

    .line 79
    .line 80
    invoke-direct {v4, p0, v0}, Lcom/zykj/study/ui/home/my/EditCourseFragment$special$$inlined$viewModels$default$10;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 81
    .line 82
    .line 83
    invoke-static {p0, v1, v2, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/EditCourseFragment;->g:Lh7/d;

    .line 88
    .line 89
    const-class v0, Lcom/zykj/study/viewmodels/DictViewModel;

    .line 90
    .line 91
    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    new-instance v1, Lcom/zykj/study/ui/home/my/EditCourseFragment$special$$inlined$activityViewModels$default$1;

    .line 96
    .line 97
    invoke-direct {v1, p0}, Lcom/zykj/study/ui/home/my/EditCourseFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 98
    .line 99
    .line 100
    new-instance v2, Lcom/zykj/study/ui/home/my/EditCourseFragment$special$$inlined$activityViewModels$default$2;

    .line 101
    .line 102
    invoke-direct {v2, v5, p0}, Lcom/zykj/study/ui/home/my/EditCourseFragment$special$$inlined$activityViewModels$default$2;-><init>(Lx7/a;Landroidx/fragment/app/Fragment;)V

    .line 103
    .line 104
    .line 105
    new-instance v3, Lcom/zykj/study/ui/home/my/EditCourseFragment$special$$inlined$activityViewModels$default$3;

    .line 106
    .line 107
    invoke-direct {v3, p0}, Lcom/zykj/study/ui/home/my/EditCourseFragment$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 108
    .line 109
    .line 110
    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/EditCourseFragment;->h:Lh7/d;

    .line 115
    .line 116
    new-instance v0, Landroidx/navigation/NavArgsLazy;

    .line 117
    .line 118
    const-class v1, Lcom/zykj/study/ui/home/my/EditCourseFragmentArgs;

    .line 119
    .line 120
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    new-instance v2, Lcom/zykj/study/ui/home/my/EditCourseFragment$b;

    .line 125
    .line 126
    invoke-direct {v2, p0}, Lcom/zykj/study/ui/home/my/EditCourseFragment$b;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 127
    .line 128
    .line 129
    invoke-direct {v0, v1, v2}, Landroidx/navigation/NavArgsLazy;-><init>(Le8/c;Lx7/a;)V

    .line 130
    .line 131
    .line 132
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/EditCourseFragment;->j:Landroidx/navigation/NavArgsLazy;

    .line 133
    .line 134
    new-instance v0, La6/l;

    .line 135
    .line 136
    const/4 v1, 0x2

    .line 137
    invoke-direct {v0, p0, v5, v1, v5}, La6/l;-><init>(Landroidx/fragment/app/Fragment;Landroidx/activity/ComponentActivity;ILkotlin/jvm/internal/n;)V

    .line 138
    .line 139
    .line 140
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/EditCourseFragment;->k:La6/l;

    .line 141
    .line 142
    return-void
.end method

.method public static final A(Lcom/zykj/study/ui/home/my/EditCourseFragment;Ljava/lang/String;Landroid/os/Bundle;)Lh7/p;
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
    const-string p1, "grade_id"

    .line 12
    .line 13
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->u()Lcom/zykj/study/viewmodels/EditCourseViewModel;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/EditCourseViewModel;->b()Landroidx/lifecycle/MutableLiveData;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p0, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 33
    .line 34
    return-object p0
.end method

.method public static final B(Lcom/zykj/study/ui/home/my/EditCourseFragment;Ljava/lang/String;Landroid/os/Bundle;)Lh7/p;
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
    const-string p1, "period_id"

    .line 12
    .line 13
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->u()Lcom/zykj/study/viewmodels/EditCourseViewModel;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/EditCourseViewModel;->h()Landroidx/lifecycle/MutableLiveData;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p0, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 33
    .line 34
    return-object p0
.end method

.method public static final E(Lcom/zykj/study/ui/home/my/EditCourseFragment;Landroid/view/View;)V
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

.method public static final F(Lcom/zykj/study/ui/home/my/EditCourseFragment;Landroid/view/MenuItem;)Z
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/study/ui/home/my/EditCourseFragment$setClickAndTextWatch$2$1;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {v3, p0, p1}, Lcom/zykj/study/ui/home/my/EditCourseFragment$setClickAndTextWatch$2$1;-><init>(Lcom/zykj/study/ui/home/my/EditCourseFragment;Lm7/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-static/range {v0 .. v5}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0
.end method

.method public static final G(Lcom/zykj/study/ui/home/my/EditCourseFragment;Landroid/view/View;)V
    .locals 7

    .line 1
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/EditCourseFragment;->k:La6/l;

    .line 2
    .line 3
    invoke-virtual {p1}, La6/l;->o()Lcom/canhub/cropper/CropImageOptions;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p1, Lcom/canhub/cropper/CropImageOptions;->t:Z

    .line 9
    .line 10
    const/16 v0, 0x3c

    .line 11
    .line 12
    iput v0, p1, Lcom/canhub/cropper/CropImageOptions;->u:I

    .line 13
    .line 14
    const/16 v0, 0x25

    .line 15
    .line 16
    iput v0, p1, Lcom/canhub/cropper/CropImageOptions;->v:I

    .line 17
    .line 18
    iget-object v1, p0, Lcom/zykj/study/ui/home/my/EditCourseFragment;->k:La6/l;

    .line 19
    .line 20
    new-instance v4, Lb5/w0;

    .line 21
    .line 22
    invoke-direct {v4, p0}, Lb5/w0;-><init>(Lcom/zykj/study/ui/home/my/EditCourseFragment;)V

    .line 23
    .line 24
    .line 25
    const/4 v5, 0x1

    .line 26
    const/4 v6, 0x0

    .line 27
    const/4 v2, 0x0

    .line 28
    const/4 v3, 0x1

    .line 29
    invoke-static/range {v1 .. v6}, La6/l;->w(La6/l;Landroid/net/Uri;ZLx7/l;ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public static final H(Lcom/zykj/study/ui/home/my/EditCourseFragment;Landroid/net/Uri;)Lh7/p;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-static {p1}, Lcom/blankj/utilcode/util/g0;->e(Landroid/net/Uri;)Ljava/io/File;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const-string v0, "getAbsolutePath(...)"

    .line 15
    .line 16
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->K(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 23
    .line 24
    return-object p0
.end method

.method public static final I(Lcom/zykj/study/ui/home/my/EditCourseFragment;)Lh7/p;
    .locals 4

    .line 1
    sget-object v0, Lcom/zykj/study/ui/home/my/g;->a:Lcom/zykj/study/ui/home/my/g$b;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->u()Lcom/zykj/study/viewmodels/EditCourseViewModel;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lcom/zykj/study/viewmodels/EditCourseViewModel;->h()Landroidx/lifecycle/MutableLiveData;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    check-cast v1, Ljava/lang/Number;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->u()Lcom/zykj/study/viewmodels/EditCourseViewModel;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v2}, Lcom/zykj/study/viewmodels/EditCourseViewModel;->j()Landroidx/lifecycle/MutableLiveData;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v2}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-static {v2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    check-cast v2, Ljava/lang/Number;

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->u()Lcom/zykj/study/viewmodels/EditCourseViewModel;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {v3}, Lcom/zykj/study/viewmodels/EditCourseViewModel;->b()Landroidx/lifecycle/MutableLiveData;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v3}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-static {v3}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    check-cast v3, Ljava/lang/Number;

    .line 61
    .line 62
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    invoke-virtual {v0, v1, v2, v3}, Lcom/zykj/study/ui/home/my/g$b;->a(III)Landroidx/navigation/NavDirections;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {p0, v0}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V

    .line 75
    .line 76
    .line 77
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 78
    .line 79
    return-object p0
.end method

.method public static final J(Lcom/zykj/study/ui/home/my/EditCourseFragment;Landroid/widget/CompoundButton;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->u()Lcom/zykj/study/viewmodels/EditCourseViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/EditCourseViewModel;->m()Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static synthetic g(Lcom/zykj/study/ui/home/my/EditCourseFragment;Ljava/lang/String;Landroid/os/Bundle;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->B(Lcom/zykj/study/ui/home/my/EditCourseFragment;Ljava/lang/String;Landroid/os/Bundle;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/zykj/study/ui/home/my/EditCourseFragment;Ljava/lang/String;Landroid/os/Bundle;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->A(Lcom/zykj/study/ui/home/my/EditCourseFragment;Ljava/lang/String;Landroid/os/Bundle;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/zykj/study/ui/home/my/EditCourseFragment;Landroid/view/MenuItem;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->F(Lcom/zykj/study/ui/home/my/EditCourseFragment;Landroid/view/MenuItem;)Z

    move-result p0

    return p0
.end method

.method public static synthetic j(Lcom/zykj/study/ui/home/my/EditCourseFragment;Ljava/lang/String;Landroid/os/Bundle;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->z(Lcom/zykj/study/ui/home/my/EditCourseFragment;Ljava/lang/String;Landroid/os/Bundle;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lcom/zykj/study/ui/home/my/EditCourseFragment;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->I(Lcom/zykj/study/ui/home/my/EditCourseFragment;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lcom/zykj/study/ui/home/my/EditCourseFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->E(Lcom/zykj/study/ui/home/my/EditCourseFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic m(Lcom/zykj/study/ui/home/my/EditCourseFragment;Landroid/net/Uri;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->H(Lcom/zykj/study/ui/home/my/EditCourseFragment;Landroid/net/Uri;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lcom/zykj/study/ui/home/my/EditCourseFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->G(Lcom/zykj/study/ui/home/my/EditCourseFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic o(Lcom/zykj/study/ui/home/my/EditCourseFragment;Landroid/widget/CompoundButton;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->J(Lcom/zykj/study/ui/home/my/EditCourseFragment;Landroid/widget/CompoundButton;Z)V

    return-void
.end method

.method public static final synthetic p(Lcom/zykj/study/ui/home/my/EditCourseFragment;)Lcom/zykj/study/ui/home/my/EditCourseFragmentArgs;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->s()Lcom/zykj/study/ui/home/my/EditCourseFragmentArgs;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic q(Lcom/zykj/study/ui/home/my/EditCourseFragment;)Lcom/zykj/study/viewmodels/EditCourseViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->u()Lcom/zykj/study/viewmodels/EditCourseViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic r(Lcom/zykj/study/ui/home/my/EditCourseFragment;)Lcom/zykj/study/viewmodels/OssTokenViewModel;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->v()Lcom/zykj/study/viewmodels/OssTokenViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final t()Lcom/zykj/study/viewmodels/DictViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/EditCourseFragment;->h:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/DictViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method private final v()Lcom/zykj/study/viewmodels/OssTokenViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/EditCourseFragment;->g:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/OssTokenViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method private final x(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget v1, Lcom/zykj/study/R$drawable;->divider:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-static {v0, v1, v2}, Landroidx/core/content/res/ResourcesCompat;->getDrawable(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    new-instance v1, Landroidx/recyclerview/widget/DividerItemDecoration;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-direct {v1, v2, v3}, Landroidx/recyclerview/widget/DividerItemDecoration;-><init>(Landroid/content/Context;I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/DividerItemDecoration;->setDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 28
    .line 29
    .line 30
    new-instance v1, Landroidx/recyclerview/widget/DividerItemDecoration;

    .line 31
    .line 32
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const/4 v3, 0x1

    .line 37
    invoke-direct {v1, v2, v3}, Landroidx/recyclerview/widget/DividerItemDecoration;-><init>(Landroid/content/Context;I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/DividerItemDecoration;->setDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    return-void
.end method

.method public static final z(Lcom/zykj/study/ui/home/my/EditCourseFragment;Ljava/lang/String;Landroid/os/Bundle;)Lh7/p;
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
    const-string p1, "subject_id"

    .line 12
    .line 13
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->u()Lcom/zykj/study/viewmodels/EditCourseViewModel;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/EditCourseViewModel;->j()Landroidx/lifecycle/MutableLiveData;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p0, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 33
    .line 34
    return-object p0
.end method


# virtual methods
.method public final C()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/EditCourseFragment;->i:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "coverList"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    move-object v3, v2

    .line 31
    check-cast v3, Lcom/zykj/study/bean/SelectModel;

    .line 32
    .line 33
    invoke-virtual {v3}, Lcom/zykj/study/bean/SelectModel;->isSelectModel()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_3

    .line 52
    .line 53
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, Lcom/zykj/study/bean/SelectModel;

    .line 58
    .line 59
    const/4 v2, 0x0

    .line 60
    invoke-virtual {v1, v2}, Lcom/zykj/study/bean/SelectModel;->setSelectModel(Z)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    return-void
.end method

.method public final D()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/study/databinding/FragmentEditCourseBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentEditCourseBinding;->toolbar:Landroidx/appcompat/widget/Toolbar;

    .line 8
    .line 9
    new-instance v1, Lb5/o0;

    .line 10
    .line 11
    invoke-direct {v1, p0}, Lb5/o0;-><init>(Lcom/zykj/study/ui/home/my/EditCourseFragment;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lcom/zykj/study/databinding/FragmentEditCourseBinding;

    .line 22
    .line 23
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentEditCourseBinding;->toolbar:Landroidx/appcompat/widget/Toolbar;

    .line 24
    .line 25
    new-instance v1, Lb5/p0;

    .line 26
    .line 27
    invoke-direct {v1, p0}, Lb5/p0;-><init>(Lcom/zykj/study/ui/home/my/EditCourseFragment;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/Toolbar;->setOnMenuItemClickListener(Landroidx/appcompat/widget/Toolbar$OnMenuItemClickListener;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Lcom/zykj/study/databinding/FragmentEditCourseBinding;

    .line 38
    .line 39
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentEditCourseBinding;->rlCustomCover:Landroid/widget/RelativeLayout;

    .line 40
    .line 41
    new-instance v1, Lb5/q0;

    .line 42
    .line 43
    invoke-direct {v1, p0}, Lb5/q0;-><init>(Lcom/zykj/study/ui/home/my/EditCourseFragment;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Lcom/zykj/study/databinding/FragmentEditCourseBinding;

    .line 54
    .line 55
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentEditCourseBinding;->etDesc:Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;

    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->s()Lcom/zykj/study/ui/home/my/EditCourseFragmentArgs;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v1}, Lcom/zykj/study/ui/home/my/EditCourseFragmentArgs;->a()Lcom/zykj/study/data/MyCourseEntity;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    if-eqz v1, :cond_0

    .line 66
    .line 67
    invoke-virtual {v1}, Lcom/zykj/study/bean/course/CourseBean;->getDescription()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    if-nez v1, :cond_1

    .line 72
    .line 73
    :cond_0
    const-string v1, ""

    .line 74
    .line 75
    :cond_1
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->setContentText(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    check-cast v0, Lcom/zykj/study/databinding/FragmentEditCourseBinding;

    .line 83
    .line 84
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentEditCourseBinding;->svCatalog:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;

    .line 85
    .line 86
    const-string v1, "svCatalog"

    .line 87
    .line 88
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    new-instance v1, Lb5/r0;

    .line 92
    .line 93
    invoke-direct {v1, p0}, Lb5/r0;-><init>(Lcom/zykj/study/ui/home/my/EditCourseFragment;)V

    .line 94
    .line 95
    .line 96
    invoke-static {v0, v1}, Lcom/zykj/base/ext/BindingAdaptersKt;->onClick(Landroid/view/View;Lx7/a;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    check-cast v0, Lcom/zykj/study/databinding/FragmentEditCourseBinding;

    .line 104
    .line 105
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentEditCourseBinding;->etDesc:Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;

    .line 106
    .line 107
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->getEditText()Landroid/widget/EditText;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    new-instance v1, Le5/j;

    .line 112
    .line 113
    invoke-direct {v1}, Le5/j;-><init>()V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    check-cast v0, Lcom/zykj/study/databinding/FragmentEditCourseBinding;

    .line 124
    .line 125
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentEditCourseBinding;->editText:Landroid/widget/EditText;

    .line 126
    .line 127
    new-instance v1, Le5/j;

    .line 128
    .line 129
    invoke-direct {v1}, Le5/j;-><init>()V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    check-cast v0, Lcom/zykj/study/databinding/FragmentEditCourseBinding;

    .line 140
    .line 141
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentEditCourseBinding;->svPublic:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;

    .line 142
    .line 143
    new-instance v1, Lb5/s0;

    .line 144
    .line 145
    invoke-direct {v1, p0}, Lb5/s0;-><init>(Lcom/zykj/study/ui/home/my/EditCourseFragment;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->G(Landroid/widget/CompoundButton$OnCheckedChangeListener;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;

    .line 149
    .line 150
    .line 151
    return-void
.end method

.method public final K(Ljava/lang/String;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "getViewLifecycleOwner(...)"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    new-instance v5, Lcom/zykj/study/ui/home/my/EditCourseFragment$uploadImage$1;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {v5, p1, p0, v0}, Lcom/zykj/study/ui/home/my/EditCourseFragment$uploadImage$1;-><init>(Ljava/lang/String;Lcom/zykj/study/ui/home/my/EditCourseFragment;Lm7/c;)V

    .line 18
    .line 19
    .line 20
    const/4 v6, 0x3

    .line 21
    const/4 v7, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-static/range {v2 .. v7}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public initData(Lm7/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->w()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/EditCourseFragment;->i:Ljava/util/List;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->s()Lcom/zykj/study/ui/home/my/EditCourseFragmentArgs;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lcom/zykj/study/ui/home/my/EditCourseFragmentArgs;->a()Lcom/zykj/study/data/MyCourseEntity;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_a

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->u()Lcom/zykj/study/viewmodels/EditCourseViewModel;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/EditCourseViewModel;->c()Landroidx/lifecycle/MutableLiveData;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CourseBean;->getId()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-static {v1}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/EditCourseFragment;->i:Ljava/util/List;

    .line 37
    .line 38
    const-string v1, "coverList"

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    if-nez v0, :cond_0

    .line 42
    .line 43
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    move-object v0, v2

    .line 47
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_2

    .line 56
    .line 57
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    move-object v4, v3

    .line 62
    check-cast v4, Lcom/zykj/study/bean/SelectModel;

    .line 63
    .line 64
    invoke-virtual {v4}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    check-cast v4, Lcom/zykj/study/bean/ImageViewInfo;

    .line 69
    .line 70
    invoke-virtual {v4}, Lcom/zykj/study/bean/ImageViewInfo;->getUrl()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CourseBean;->getCover()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-static {v4, v5}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    if-eqz v4, :cond_1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_2
    move-object v3, v2

    .line 86
    :goto_0
    check-cast v3, Lcom/zykj/study/bean/SelectModel;

    .line 87
    .line 88
    const/4 v0, 0x1

    .line 89
    if-eqz v3, :cond_3

    .line 90
    .line 91
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->C()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->u()Lcom/zykj/study/viewmodels/EditCourseViewModel;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {v1}, Lcom/zykj/study/viewmodels/EditCourseViewModel;->o()Landroidx/databinding/ObservableBoolean;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {v1, v0}, Landroidx/databinding/ObservableBoolean;->set(Z)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v3, v0}, Lcom/zykj/study/bean/SelectModel;->setSelectModel(Z)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->u()Lcom/zykj/study/viewmodels/EditCourseViewModel;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/EditCourseViewModel;->k()Landroidx/lifecycle/MutableLiveData;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CourseBean;->getCover()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_3
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CourseBean;->getCover()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    if-eqz v3, :cond_5

    .line 129
    .line 130
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    if-nez v3, :cond_4

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_4
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->u()Lcom/zykj/study/viewmodels/EditCourseViewModel;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/EditCourseViewModel;->o()Landroidx/databinding/ObservableBoolean;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    const/4 v1, 0x0

    .line 146
    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableBoolean;->set(Z)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->u()Lcom/zykj/study/viewmodels/EditCourseViewModel;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/EditCourseViewModel;->f()Landroidx/lifecycle/MutableLiveData;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CourseBean;->getCover()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_5
    :goto_1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->u()Lcom/zykj/study/viewmodels/EditCourseViewModel;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    invoke-virtual {v3}, Lcom/zykj/study/viewmodels/EditCourseViewModel;->o()Landroidx/databinding/ObservableBoolean;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    invoke-virtual {v3, v0}, Landroidx/databinding/ObservableBoolean;->set(Z)V

    .line 174
    .line 175
    .line 176
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/EditCourseFragment;->i:Ljava/util/List;

    .line 177
    .line 178
    if-nez v0, :cond_6

    .line 179
    .line 180
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    move-object v0, v2

    .line 184
    :cond_6
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    :cond_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    if-eqz v1, :cond_8

    .line 193
    .line 194
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    move-object v3, v1

    .line 199
    check-cast v3, Lcom/zykj/study/bean/SelectModel;

    .line 200
    .line 201
    invoke-virtual {v3}, Lcom/zykj/study/bean/SelectModel;->isSelectModel()Z

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    if-eqz v3, :cond_7

    .line 206
    .line 207
    move-object v2, v1

    .line 208
    :cond_8
    check-cast v2, Lcom/zykj/study/bean/SelectModel;

    .line 209
    .line 210
    if-eqz v2, :cond_9

    .line 211
    .line 212
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->u()Lcom/zykj/study/viewmodels/EditCourseViewModel;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/EditCourseViewModel;->k()Landroidx/lifecycle/MutableLiveData;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-virtual {v2}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    check-cast v1, Lcom/zykj/study/bean/ImageViewInfo;

    .line 225
    .line 226
    invoke-virtual {v1}, Lcom/zykj/study/bean/ImageViewInfo;->getUrl()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    :cond_9
    :goto_2
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->u()Lcom/zykj/study/viewmodels/EditCourseViewModel;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/EditCourseViewModel;->l()Landroidx/lifecycle/MutableLiveData;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CourseBean;->getTitle()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->u()Lcom/zykj/study/viewmodels/EditCourseViewModel;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/EditCourseViewModel;->a()Landroidx/lifecycle/MutableLiveData;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CourseBean;->getDescription()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->u()Lcom/zykj/study/viewmodels/EditCourseViewModel;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/EditCourseViewModel;->h()Landroidx/lifecycle/MutableLiveData;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CourseBean;->getPeriodId()I

    .line 272
    .line 273
    .line 274
    move-result v1

    .line 275
    invoke-static {v1}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->u()Lcom/zykj/study/viewmodels/EditCourseViewModel;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/EditCourseViewModel;->b()Landroidx/lifecycle/MutableLiveData;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CourseBean;->getGradeId()I

    .line 291
    .line 292
    .line 293
    move-result v1

    .line 294
    invoke-static {v1}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 295
    .line 296
    .line 297
    move-result-object v1

    .line 298
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->u()Lcom/zykj/study/viewmodels/EditCourseViewModel;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/EditCourseViewModel;->j()Landroidx/lifecycle/MutableLiveData;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CourseBean;->getSubjectId()I

    .line 310
    .line 311
    .line 312
    move-result v1

    .line 313
    invoke-static {v1}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->u()Lcom/zykj/study/viewmodels/EditCourseViewModel;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/EditCourseViewModel;->d()Landroidx/lifecycle/MutableLiveData;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CourseBean;->getLearning()I

    .line 329
    .line 330
    .line 331
    move-result v1

    .line 332
    invoke-static {v1}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->u()Lcom/zykj/study/viewmodels/EditCourseViewModel;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/EditCourseViewModel;->e()Landroidx/lifecycle/MutableLiveData;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CourseBean;->getLikes()I

    .line 348
    .line 349
    .line 350
    move-result v1

    .line 351
    invoke-static {v1}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 352
    .line 353
    .line 354
    move-result-object v1

    .line 355
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->u()Lcom/zykj/study/viewmodels/EditCourseViewModel;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/EditCourseViewModel;->i()Landroidx/lifecycle/MutableLiveData;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CourseBean;->getStatus()Lcom/zykj/study/bean/course/CourseType;

    .line 367
    .line 368
    .line 369
    move-result-object v1

    .line 370
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->u()Lcom/zykj/study/viewmodels/EditCourseViewModel;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/EditCourseViewModel;->m()Landroidx/lifecycle/MutableLiveData;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CourseBean;->isPublic()Z

    .line 382
    .line 383
    .line 384
    move-result v1

    .line 385
    invoke-static {v1}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->u()Lcom/zykj/study/viewmodels/EditCourseViewModel;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/EditCourseViewModel;->n()Landroidx/lifecycle/MutableLiveData;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    invoke-virtual {p1}, Lcom/zykj/study/data/MyCourseEntity;->isSuperviser()Z

    .line 401
    .line 402
    .line 403
    move-result p1

    .line 404
    invoke-static {p1}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 405
    .line 406
    .line 407
    move-result-object p1

    .line 408
    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 409
    .line 410
    .line 411
    :cond_a
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 412
    .line 413
    return-object p1
.end method

.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/study/databinding/FragmentEditCourseBinding;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->u()Lcom/zykj/study/viewmodels/EditCourseViewModel;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p1, p2}, Lcom/zykj/study/databinding/FragmentEditCourseBinding;->setEditCourseViewModel(Lcom/zykj/study/viewmodels/EditCourseViewModel;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lcom/zykj/study/databinding/FragmentEditCourseBinding;

    .line 19
    .line 20
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->t()Lcom/zykj/study/viewmodels/DictViewModel;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-virtual {p1, p2}, Lcom/zykj/study/databinding/FragmentEditCourseBinding;->setDictViewModel(Lcom/zykj/study/viewmodels/DictViewModel;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Lcom/zykj/study/databinding/FragmentEditCourseBinding;

    .line 32
    .line 33
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentEditCourseBinding;->recycleViewSys:Landroidx/recyclerview/widget/RecyclerView;

    .line 34
    .line 35
    new-instance p2, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 36
    .line 37
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const/4 v1, 0x4

    .line 42
    invoke-direct {p2, v0, v1}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 46
    .line 47
    .line 48
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-direct {p0, p1}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->x(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 52
    .line 53
    .line 54
    new-instance p2, Lcom/zykj/study/adapter/CoverAdapter;

    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->u()Lcom/zykj/study/viewmodels/EditCourseViewModel;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iget-object v1, p0, Lcom/zykj/study/ui/home/my/EditCourseFragment;->i:Ljava/util/List;

    .line 61
    .line 62
    if-nez v1, :cond_0

    .line 63
    .line 64
    const-string v1, "coverList"

    .line 65
    .line 66
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    const/4 v1, 0x0

    .line 70
    :cond_0
    invoke-direct {p2, v0, v1}, Lcom/zykj/study/adapter/CoverAdapter;-><init>(Lcom/zykj/study/viewmodels/EditCourseViewModel;Ljava/util/List;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->u()Lcom/zykj/study/viewmodels/EditCourseViewModel;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/EditCourseViewModel;->m()Landroidx/lifecycle/MutableLiveData;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    check-cast p1, Ljava/lang/Boolean;

    .line 89
    .line 90
    if-eqz p1, :cond_1

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    check-cast p2, Lcom/zykj/study/databinding/FragmentEditCourseBinding;

    .line 101
    .line 102
    iget-object p2, p2, Lcom/zykj/study/databinding/FragmentEditCourseBinding;->svPublic:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;

    .line 103
    .line 104
    invoke-virtual {p2, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->H(Z)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;

    .line 105
    .line 106
    .line 107
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->D()V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->y()V

    .line 111
    .line 112
    .line 113
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 114
    .line 115
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_edit_course:I

    .line 2
    .line 3
    return v0
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    :goto_0
    invoke-static {v0}, Lcom/xuexiang/xui/utils/d;->d(Landroid/view/View;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final s()Lcom/zykj/study/ui/home/my/EditCourseFragmentArgs;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/EditCourseFragment;->j:Landroidx/navigation/NavArgsLazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/ui/home/my/EditCourseFragmentArgs;

    .line 8
    .line 9
    return-object v0
.end method

.method public final u()Lcom/zykj/study/viewmodels/EditCourseViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/EditCourseFragment;->f:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/EditCourseViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public final w()Ljava/util/List;
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget v1, Lcom/zykj/study/R$array;->cover:I

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "getStringArray(...)"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Ljava/util/ArrayList;

    .line 17
    .line 18
    array-length v2, v0

    .line 19
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 20
    .line 21
    .line 22
    array-length v2, v0

    .line 23
    const/4 v3, 0x0

    .line 24
    move v4, v3

    .line 25
    :goto_0
    if-ge v4, v2, :cond_0

    .line 26
    .line 27
    aget-object v5, v0, v4

    .line 28
    .line 29
    new-instance v6, Lcom/zykj/study/bean/SelectModel;

    .line 30
    .line 31
    new-instance v7, Lcom/zykj/study/bean/ImageViewInfo;

    .line 32
    .line 33
    invoke-static {v5}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {v7, v5}, Lcom/zykj/study/bean/ImageViewInfo;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-direct {v6, v3, v7}, Lcom/zykj/study/bean/SelectModel;-><init>(ZLjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-interface {v1, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    add-int/lit8 v4, v4, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-static {v1}, Li7/f0;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Lcom/zykj/study/bean/SelectModel;

    .line 53
    .line 54
    const/4 v2, 0x1

    .line 55
    invoke-virtual {v0, v2}, Lcom/zykj/study/bean/SelectModel;->setSelectModel(Z)V

    .line 56
    .line 57
    .line 58
    return-object v1
.end method

.method public final y()V
    .locals 2

    .line 1
    new-instance v0, Lb5/t0;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lb5/t0;-><init>(Lcom/zykj/study/ui/home/my/EditCourseFragment;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "period_id"

    .line 7
    .line 8
    invoke-static {p0, v1, v0}, Landroidx/fragment/app/FragmentKt;->setFragmentResultListener(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lx7/p;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lb5/u0;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lb5/u0;-><init>(Lcom/zykj/study/ui/home/my/EditCourseFragment;)V

    .line 14
    .line 15
    .line 16
    const-string v1, "subject_id"

    .line 17
    .line 18
    invoke-static {p0, v1, v0}, Landroidx/fragment/app/FragmentKt;->setFragmentResultListener(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lx7/p;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Lb5/v0;

    .line 22
    .line 23
    invoke-direct {v0, p0}, Lb5/v0;-><init>(Lcom/zykj/study/ui/home/my/EditCourseFragment;)V

    .line 24
    .line 25
    .line 26
    const-string v1, "grade_id"

    .line 27
    .line 28
    invoke-static {p0, v1, v0}, Landroidx/fragment/app/FragmentKt;->setFragmentResultListener(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lx7/p;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method
