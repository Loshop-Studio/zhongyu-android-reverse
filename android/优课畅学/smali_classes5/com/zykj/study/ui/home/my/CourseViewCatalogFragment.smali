.class public final Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;
.super Lcom/zykj/study/ui/home/my/Hilt_CourseViewCatalogFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/home/my/Hilt_CourseViewCatalogFragment<",
        "Lcom/zykj/study/databinding/FragmentCourseViewCatalogBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Lh7/d;

.field public g:Lcom/zykj/study/adapter/CatalogCompleteAdapter;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/Hilt_CourseViewCatalogFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lb5/b0;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lb5/b0;-><init>(Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->c:Lkotlin/LazyThreadSafetyMode;

    .line 10
    .line 11
    new-instance v2, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment$special$$inlined$viewModels$default$1;

    .line 12
    .line 13
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment$special$$inlined$viewModels$default$1;-><init>(Lx7/a;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-class v1, Lcom/zykj/study/viewmodels/CourseViewViewModel;

    .line 21
    .line 22
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment$special$$inlined$viewModels$default$2;

    .line 27
    .line 28
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment$special$$inlined$viewModels$default$2;-><init>(Lh7/d;)V

    .line 29
    .line 30
    .line 31
    new-instance v3, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment$special$$inlined$viewModels$default$3;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-direct {v3, v4, v0}, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment$special$$inlined$viewModels$default$3;-><init>(Lx7/a;Lh7/d;)V

    .line 35
    .line 36
    .line 37
    new-instance v4, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment$special$$inlined$viewModels$default$4;

    .line 38
    .line 39
    invoke-direct {v4, p0, v0}, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment$special$$inlined$viewModels$default$4;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p0, v1, v2, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;->f:Lh7/d;

    .line 47
    .line 48
    return-void
.end method

.method public static synthetic g(Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;Lcom/zykj/study/bean/course/CatalogBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;->o(Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;Lcom/zykj/study/bean/course/CatalogBean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;->s(Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic i(Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;)Landroidx/lifecycle/ViewModelStoreOwner;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;->m(Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;)Landroidx/lifecycle/ViewModelStoreOwner;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;Lcom/zykj/study/bean/teach/GroupMemberProgress;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;->q(Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;Lcom/zykj/study/bean/teach/GroupMemberProgress;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;->r(Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic l(Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;Lcom/zykj/study/bean/course/CatalogBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;->p(Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;Lcom/zykj/study/bean/course/CatalogBean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final m(Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;)Landroidx/lifecycle/ViewModelStoreOwner;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireParentFragment()Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "requireParentFragment(...)"

    .line 6
    .line 7
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public static final o(Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;Lcom/zykj/study/bean/course/CatalogBean;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;->n()Lcom/zykj/study/viewmodels/CourseViewViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/CourseViewViewModel;->f()Landroidx/lifecycle/MutableLiveData;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;->g:Lcom/zykj/study/adapter/CatalogCompleteAdapter;

    .line 18
    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CatalogBean;->getId()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-virtual {p0, p1}, Lcom/zykj/study/adapter/CatalogCompleteAdapter;->j(I)V

    .line 26
    .line 27
    .line 28
    :cond_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 29
    .line 30
    return-object p0
.end method

.method public static final p(Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;Lcom/zykj/study/bean/course/CatalogBean;)Lh7/p;
    .locals 8

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lcom/zykj/study/ui/home/my/o;->a:Lcom/zykj/study/ui/home/my/o$c;

    .line 7
    .line 8
    sget-object v0, Le5/e;->a:Le5/e;

    .line 9
    .line 10
    invoke-virtual {v0}, Le5/e;->c()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;->n()Lcom/zykj/study/viewmodels/CourseViewViewModel;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v2}, Lcom/zykj/study/viewmodels/CourseViewViewModel;->d()Ll8/h;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-interface {v2}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Lcom/zykj/http/bean/HeaderBean;

    .line 27
    .line 28
    invoke-virtual {v2}, Lcom/zykj/http/bean/HeaderBean;->getAccessToken()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;->n()Lcom/zykj/study/viewmodels/CourseViewViewModel;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {v3}, Lcom/zykj/study/viewmodels/CourseViewViewModel;->d()Ll8/h;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-interface {v3}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v3, Lcom/zykj/http/bean/HeaderBean;

    .line 45
    .line 46
    invoke-virtual {v3}, Lcom/zykj/http/bean/HeaderBean;->getServerUrl()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CatalogBean;->getId()I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;->n()Lcom/zykj/study/viewmodels/CourseViewViewModel;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-virtual {v5}, Lcom/zykj/study/viewmodels/CourseViewViewModel;->b()Landroidx/lifecycle/MutableLiveData;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    invoke-virtual {v5}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    check-cast v5, Lcom/zykj/study/bean/course/CourseBean;

    .line 67
    .line 68
    const/4 v6, 0x0

    .line 69
    if-eqz v5, :cond_0

    .line 70
    .line 71
    invoke-virtual {v5}, Lcom/zykj/study/bean/course/CourseBean;->getId()I

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    goto :goto_0

    .line 80
    :cond_0
    move-object v5, v6

    .line 81
    :goto_0
    new-instance v7, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const-string v0, "?token="

    .line 90
    .line 91
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string v0, "&url="

    .line 98
    .line 99
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const-string v0, "#/?entry=mine&catalogId="

    .line 106
    .line 107
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    const-string v0, "&courseId="

    .line 114
    .line 115
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CatalogBean;->getTitle()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;->n()Lcom/zykj/study/viewmodels/CourseViewViewModel;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/CourseViewViewModel;->b()Landroidx/lifecycle/MutableLiveData;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    move-object v2, v0

    .line 142
    check-cast v2, Lcom/zykj/study/bean/course/CourseBean;

    .line 143
    .line 144
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;->n()Lcom/zykj/study/viewmodels/CourseViewViewModel;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/CourseViewViewModel;->g()Landroidx/lifecycle/MutableLiveData;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    check-cast v0, Ljava/lang/Integer;

    .line 157
    .line 158
    if-eqz v0, :cond_1

    .line 159
    .line 160
    invoke-virtual {v0}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v6

    .line 164
    :cond_1
    move-object v4, v6

    .line 165
    const/4 v3, 0x0

    .line 166
    move-object v6, p1

    .line 167
    invoke-virtual/range {v1 .. v6}, Lcom/zykj/study/ui/home/my/o$c;->a(Lcom/zykj/study/bean/course/CourseBean;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroidx/navigation/NavDirections;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    invoke-virtual {p0, p1}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V

    .line 176
    .line 177
    .line 178
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 179
    .line 180
    return-object p0
.end method

.method public static final q(Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;Lcom/zykj/study/bean/teach/GroupMemberProgress;)Lh7/p;
    .locals 7

    .line 1
    invoke-virtual {p1}, Lcom/zykj/study/bean/teach/GroupMemberProgress;->getCatalogs()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    const/16 v2, 0xa

    .line 8
    .line 9
    invoke-static {v0, v2}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lcom/zykj/study/bean/course/CatalogBean;

    .line 31
    .line 32
    new-instance v3, Lcom/zykj/study/bean/SelectModel;

    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;->n()Lcom/zykj/study/viewmodels/CourseViewViewModel;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {v4}, Lcom/zykj/study/viewmodels/CourseViewViewModel;->f()Landroidx/lifecycle/MutableLiveData;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-virtual {v4}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    check-cast v4, Lcom/zykj/study/bean/course/CatalogBean;

    .line 47
    .line 48
    const/4 v5, 0x0

    .line 49
    if-eqz v4, :cond_0

    .line 50
    .line 51
    invoke-virtual {v2}, Lcom/zykj/study/bean/course/CatalogBean;->getId()I

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    invoke-virtual {v4}, Lcom/zykj/study/bean/course/CatalogBean;->getId()I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-ne v6, v4, :cond_0

    .line 60
    .line 61
    const/4 v5, 0x1

    .line 62
    :cond_0
    invoke-direct {v3, v5, v2}, Lcom/zykj/study/bean/SelectModel;-><init>(ZLjava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    invoke-static {v1}, Li7/f0;->U0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iget-object v1, p0, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;->g:Lcom/zykj/study/adapter/CatalogCompleteAdapter;

    .line 74
    .line 75
    if-eqz v1, :cond_2

    .line 76
    .line 77
    invoke-virtual {p1}, Lcom/zykj/study/bean/teach/GroupMemberProgress;->getMembers()I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    invoke-virtual {v1, p1}, Lcom/zykj/study/adapter/CatalogCompleteAdapter;->k(I)V

    .line 82
    .line 83
    .line 84
    :cond_2
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;->g:Lcom/zykj/study/adapter/CatalogCompleteAdapter;

    .line 85
    .line 86
    if-eqz p1, :cond_4

    .line 87
    .line 88
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;->n()Lcom/zykj/study/viewmodels/CourseViewViewModel;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {v1}, Lcom/zykj/study/viewmodels/CourseViewViewModel;->f()Landroidx/lifecycle/MutableLiveData;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    check-cast v1, Lcom/zykj/study/bean/course/CatalogBean;

    .line 101
    .line 102
    if-eqz v1, :cond_3

    .line 103
    .line 104
    invoke-virtual {v1}, Lcom/zykj/study/bean/course/CatalogBean;->getId()I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    goto :goto_1

    .line 109
    :cond_3
    const/4 v1, -0x1

    .line 110
    :goto_1
    invoke-virtual {p1, v1}, Lcom/zykj/study/adapter/CatalogCompleteAdapter;->j(I)V

    .line 111
    .line 112
    .line 113
    :cond_4
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    const/4 v1, 0x0

    .line 118
    const-string v2, "getViewLifecycleOwner(...)"

    .line 119
    .line 120
    if-eqz p1, :cond_5

    .line 121
    .line 122
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-static {p1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    new-instance v0, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment$initData$4$2$1;

    .line 134
    .line 135
    invoke-direct {v0, p0, v1}, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment$initData$4$2$1;-><init>(Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;Lm7/c;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1, v0}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenResumed(Lx7/p;)Lkotlinx/coroutines/n;

    .line 139
    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_5
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;->g:Lcom/zykj/study/adapter/CatalogCompleteAdapter;

    .line 143
    .line 144
    if-eqz p1, :cond_6

    .line 145
    .line 146
    invoke-virtual {p1, v0}, Lcom/zykj/study/adapter/CatalogCompleteAdapter;->i(Ljava/util/List;)V

    .line 147
    .line 148
    .line 149
    :cond_6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-static {p1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    new-instance v0, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment$initData$4$2$2;

    .line 161
    .line 162
    invoke-direct {v0, p0, v1}, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment$initData$4$2$2;-><init>(Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;Lm7/c;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1, v0}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenResumed(Lx7/p;)Lkotlinx/coroutines/n;

    .line 166
    .line 167
    .line 168
    :goto_2
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 169
    .line 170
    return-object p0
.end method

.method public static final r(Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;->n()Lcom/zykj/study/viewmodels/CourseViewViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/CourseViewViewModel;->f()Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;->g:Lcom/zykj/study/adapter/CatalogCompleteAdapter;

    .line 14
    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 p1, -0x1

    .line 18
    invoke-virtual {p0, p1}, Lcom/zykj/study/adapter/CatalogCompleteAdapter;->j(I)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public static final s(Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;Landroid/view/View;)V
    .locals 4

    .line 1
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget v0, Lcom/zykj/study/R$id;->courseManageDialogFragment:I

    .line 6
    .line 7
    new-instance v1, Lcom/zykj/study/ui/home/my/CourseManageDialogFragmentArgs;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;->n()Lcom/zykj/study/viewmodels/CourseViewViewModel;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/CourseViewViewModel;->b()Landroidx/lifecycle/MutableLiveData;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Lcom/zykj/study/bean/course/CourseBean;

    .line 22
    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getId()I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    int-to-long v2, p0

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const-wide/16 v2, 0x0

    .line 32
    .line 33
    :goto_0
    invoke-direct {v1, v2, v3}, Lcom/zykj/study/ui/home/my/CourseManageDialogFragmentArgs;-><init>(J)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Lcom/zykj/study/ui/home/my/CourseManageDialogFragmentArgs;->b()Landroid/os/Bundle;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p1, v0, p0}, Landroidx/navigation/NavController;->navigate(ILandroid/os/Bundle;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public initData(Lm7/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment$initData$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment$initData$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment$initData$1;->c:I

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
    iput v1, v0, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment$initData$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment$initData$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment$initData$1;-><init>(Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment$initData$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment$initData$1;->c:I

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
    iput v3, v0, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment$initData$1;->c:I

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
    new-instance p1, Lcom/zykj/study/adapter/CatalogCompleteAdapter;

    .line 63
    .line 64
    new-instance v0, Lb5/w;

    .line 65
    .line 66
    invoke-direct {v0, p0}, Lb5/w;-><init>(Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;)V

    .line 67
    .line 68
    .line 69
    new-instance v1, Lb5/x;

    .line 70
    .line 71
    invoke-direct {v1, p0}, Lb5/x;-><init>(Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;)V

    .line 72
    .line 73
    .line 74
    invoke-direct {p1, v0, v1}, Lcom/zykj/study/adapter/CatalogCompleteAdapter;-><init>(Lx7/l;Lx7/l;)V

    .line 75
    .line 76
    .line 77
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;->g:Lcom/zykj/study/adapter/CatalogCompleteAdapter;

    .line 78
    .line 79
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;->n()Lcom/zykj/study/viewmodels/CourseViewViewModel;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/CourseViewViewModel;->c()Landroidx/lifecycle/MutableLiveData;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    new-instance v0, Lb5/y;

    .line 88
    .line 89
    invoke-direct {v0, p0}, Lb5/y;-><init>(Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;)V

    .line 90
    .line 91
    .line 92
    new-instance v1, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment$a;

    .line 93
    .line 94
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment$a;-><init>(Lx7/l;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, p0, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 98
    .line 99
    .line 100
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 101
    .line 102
    return-object p1
.end method

.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBinding;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;->n()Lcom/zykj/study/viewmodels/CourseViewViewModel;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p1, p2}, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBinding;->setViewModel(Lcom/zykj/study/viewmodels/CourseViewViewModel;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBinding;

    .line 19
    .line 20
    new-instance p2, Lb5/z;

    .line 21
    .line 22
    invoke-direct {p2, p0}, Lb5/z;-><init>(Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p2}, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBinding;->setOnClick(Landroid/view/View$OnClickListener;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBinding;

    .line 33
    .line 34
    new-instance p2, Lb5/a0;

    .line 35
    .line 36
    invoke-direct {p2, p0}, Lb5/a0;-><init>(Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, p2}, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBinding;->setOnClickManage(Landroid/view/View$OnClickListener;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    check-cast p1, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBinding;

    .line 47
    .line 48
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBinding;->recycler:Landroidx/recyclerview/widget/RecyclerView;

    .line 49
    .line 50
    iget-object p2, p0, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;->g:Lcom/zykj/study/adapter/CatalogCompleteAdapter;

    .line 51
    .line 52
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;->n()Lcom/zykj/study/viewmodels/CourseViewViewModel;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/CourseViewViewModel;->f()Landroidx/lifecycle/MutableLiveData;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    check-cast p1, Lcom/zykj/study/bean/course/CatalogBean;

    .line 68
    .line 69
    if-eqz p1, :cond_0

    .line 70
    .line 71
    iget-object p2, p0, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;->g:Lcom/zykj/study/adapter/CatalogCompleteAdapter;

    .line 72
    .line 73
    if-eqz p2, :cond_0

    .line 74
    .line 75
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CatalogBean;->getId()I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    invoke-virtual {p2, p1}, Lcom/zykj/study/adapter/CatalogCompleteAdapter;->j(I)V

    .line 80
    .line 81
    .line 82
    :cond_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 83
    .line 84
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_course_view_catalog:I

    .line 2
    .line 3
    return v0
.end method

.method public final n()Lcom/zykj/study/viewmodels/CourseViewViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/CourseViewCatalogFragment;->f:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/CourseViewViewModel;

    .line 8
    .line 9
    return-object v0
.end method
