.class public final Lcom/friday/main/view/SearchActivity;
.super Lcom/friday/main/view/Hilt_SearchActivity;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation build Lcom/alibaba/android/arouter/facade/annotation/Route;
    path = "/main/SearchActivity"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/friday/main/view/Hilt_SearchActivity<",
        "Lcom/friday/main/databinding/SearchActivityBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final g:Lqc/d;

.field public final h:Lqc/d;

.field public i:Lcom/friday/common/entity/FileEntity;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Lcom/friday/main/view/Hilt_SearchActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/friday/main/view/SearchActivity$special$$inlined$viewModels$default$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/friday/main/view/SearchActivity$special$$inlined$viewModels$default$1;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Landroidx/lifecycle/ViewModelLazy;

    .line 10
    .line 11
    const-class v2, Lcom/friday/main/viewmodel/SearchViewModel;

    .line 12
    .line 13
    invoke-static {v2}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    new-instance v3, Lcom/friday/main/view/SearchActivity$special$$inlined$viewModels$default$2;

    .line 18
    .line 19
    invoke-direct {v3, p0}, Lcom/friday/main/view/SearchActivity$special$$inlined$viewModels$default$2;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 20
    .line 21
    .line 22
    new-instance v4, Lcom/friday/main/view/SearchActivity$special$$inlined$viewModels$default$3;

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    invoke-direct {v4, v5, p0}, Lcom/friday/main/view/SearchActivity$special$$inlined$viewModels$default$3;-><init>(Lhd/a;Landroidx/activity/ComponentActivity;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/ViewModelLazy;-><init>(Lod/c;Lhd/a;Lhd/a;Lhd/a;)V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Lcom/friday/main/view/SearchActivity;->g:Lqc/d;

    .line 32
    .line 33
    new-instance v0, Lv3/f2;

    .line 34
    .line 35
    invoke-direct {v0}, Lv3/f2;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-static {v0}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, Lcom/friday/main/view/SearchActivity;->h:Lqc/d;

    .line 43
    .line 44
    return-void
.end method

.method public static synthetic N(Lcom/friday/main/view/SearchActivity;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/main/view/SearchActivity;->e0(Lcom/friday/main/view/SearchActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic O(Lcom/friday/main/view/SearchActivity;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/main/view/SearchActivity;->c0(Lcom/friday/main/view/SearchActivity;Lcom/friday/common/entity/FileEntity;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic P(Lcom/friday/main/view/SearchActivity;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/main/view/SearchActivity;->b0(Lcom/friday/main/view/SearchActivity;Lcom/friday/common/entity/FileEntity;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Q(Lcom/friday/main/view/SearchActivity;Landroidx/recyclerview/widget/RecyclerView;Landroidx/paging/CombinedLoadStates;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/main/view/SearchActivity;->f0(Lcom/friday/main/view/SearchActivity;Landroidx/recyclerview/widget/RecyclerView;Landroidx/paging/CombinedLoadStates;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic R(Lcom/friday/main/view/SearchActivity;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/main/view/SearchActivity;->a0(Lcom/friday/main/view/SearchActivity;Lcom/friday/common/entity/FileEntity;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic S()Lcom/friday/main/adapter/SearchAdapter;
    .locals 1

    .line 1
    invoke-static {}, Lcom/friday/main/view/SearchActivity;->h0()Lcom/friday/main/adapter/SearchAdapter;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic T(Lcom/friday/main/view/SearchActivity;ILcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/main/view/SearchActivity;->g0(Lcom/friday/main/view/SearchActivity;ILcom/friday/common/entity/FileEntity;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic U(Lcom/friday/main/view/SearchActivity;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/main/view/SearchActivity;->d0(Lcom/friday/main/view/SearchActivity;Lcom/friday/common/entity/FileEntity;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic V(Lcom/friday/main/view/SearchActivity;)Lcom/friday/main/viewmodel/SearchViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/main/view/SearchActivity;->Y()Lcom/friday/main/viewmodel/SearchViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic W(Lcom/friday/main/view/SearchActivity;)Lcom/friday/main/adapter/SearchAdapter;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/main/view/SearchActivity;->Z()Lcom/friday/main/adapter/SearchAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic X(Lcom/friday/main/view/SearchActivity;Lcom/friday/common/entity/FileEntity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/main/view/SearchActivity;->i:Lcom/friday/common/entity/FileEntity;

    .line 2
    .line 3
    return-void
.end method

.method public static final a0(Lcom/friday/main/view/SearchActivity;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/friday/common/base/BaseActivity;->isShowLoading(Z)V

    .line 3
    .line 4
    .line 5
    if-eqz p1, :cond_2

    .line 6
    .line 7
    sget-object v0, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lcom/friday/common/helper/b;->v()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    sget-object p0, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getOfficePath()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p0, p1}, Lcom/friday/common/helper/c;->m(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    sget-object v0, Lk2/x;->a:Lk2/x$a;

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const-string v2, "getBaseContext(...)"

    .line 36
    .line 37
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const-string v2, "cn.wps.moffice_eng"

    .line 41
    .line 42
    invoke-virtual {v0, v1, v2}, Lk2/x$a;->c(Landroid/content/Context;Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getOfficePath()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {v0, p1}, Lk2/x$a;->b(Ljava/lang/String;)Landroid/content/Intent;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    new-instance p1, Lcom/friday/common/widget/dialog/WPSDownloadDialog;

    .line 61
    .line 62
    invoke-direct {p1}, Lcom/friday/common/widget/dialog/WPSDownloadDialog;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    const-string v0, "getSupportFragmentManager(...)"

    .line 70
    .line 71
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    const-class v0, Lcom/friday/common/widget/dialog/WPSDownloadDialog;

    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {p1, p0, v0}, Lcom/friday/common/widget/dialog/WPSDownloadDialog;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :cond_2
    :goto_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 84
    .line 85
    return-object p0
.end method

.method public static final b0(Lcom/friday/main/view/SearchActivity;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/friday/common/base/BaseActivity;->isShowLoading(Z)V

    .line 3
    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    sget-object v1, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string p1, "12"

    .line 18
    .line 19
    invoke-static {p0, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    const/16 v7, 0x10

    .line 24
    .line 25
    const/4 v8, 0x0

    .line 26
    const/4 v3, 0x1

    .line 27
    const/4 v4, 0x1

    .line 28
    const/4 v6, 0x0

    .line 29
    invoke-static/range {v1 .. v8}, Lcom/friday/common/helper/c;->l(Lcom/friday/common/helper/c;Ljava/lang/String;ZZZLjava/lang/String;ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 33
    .line 34
    return-object p0
.end method

.method public static final c0(Lcom/friday/main/view/SearchActivity;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 5

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    new-instance v2, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->isDir(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/4 v1, 0x0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    :try_start_0
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getZipFilePath()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    new-instance v4, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-static {v0, v2}, Lcom/blankj/utilcode/util/ZipUtils;->unzipFile(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catch_0
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    new-instance v2, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/lang/String;)Z

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, v1}, Lcom/friday/common/base/BaseActivity;->isShowLoading(Z)V

    .line 91
    .line 92
    .line 93
    const-string p0, "\u5fae\u8bfe\u6587\u4ef6\u89e3\u538b\u5931\u8d25\uff0c\u8bf7\u91cd\u8bd5"

    .line 94
    .line 95
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 96
    .line 97
    .line 98
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 99
    .line 100
    return-object p0

    .line 101
    :cond_0
    :goto_0
    invoke-virtual {p0, v1}, Lcom/friday/common/base/BaseActivity;->isShowLoading(Z)V

    .line 102
    .line 103
    .line 104
    sget-object p0, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 105
    .line 106
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    new-instance v1, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-virtual {p0, p1}, Lcom/friday/common/helper/c;->t(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    :cond_1
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 133
    .line 134
    return-object p0
.end method

.method public static final d0(Lcom/friday/main/view/SearchActivity;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/friday/common/base/BaseActivity;->isShowLoading(Z)V

    .line 3
    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getTxtFilePath()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    sget-object v0, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getParentId()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    const/16 v8, 0x78

    .line 32
    .line 33
    const/4 v9, 0x0

    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x0

    .line 37
    const/4 v7, 0x0

    .line 38
    invoke-static/range {v0 .. v9}, Lcom/friday/common/helper/c;->q(Lcom/friday/common/helper/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/friday/common/entity/FromPage;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 42
    .line 43
    return-object p0
.end method

.method public static final e0(Lcom/friday/main/view/SearchActivity;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final f0(Lcom/friday/main/view/SearchActivity;Landroidx/recyclerview/widget/RecyclerView;Landroidx/paging/CombinedLoadStates;)Lqc/q;
    .locals 4

    .line 1
    const-string v0, "loadState"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Landroidx/paging/CombinedLoadStates;->getSource()Landroidx/paging/LoadStates;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Landroidx/paging/LoadStates;->getRefresh()Landroidx/paging/LoadState;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    instance-of v0, v0, Landroidx/paging/LoadState$NotLoading;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    const-string v2, "tvEmpty"

    .line 18
    .line 19
    const/16 v3, 0x8

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p2}, Landroidx/paging/CombinedLoadStates;->getAppend()Landroidx/paging/LoadState;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-virtual {p2}, Landroidx/paging/LoadState;->getEndOfPaginationReached()Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-eqz p2, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/friday/main/view/SearchActivity;->Z()Lcom/friday/main/adapter/SearchAdapter;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-virtual {p2}, Landroidx/paging/PagingDataAdapter;->getItemCount()I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    const/4 v0, 0x1

    .line 42
    if-ge p2, v0, :cond_0

    .line 43
    .line 44
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, Lcom/friday/main/databinding/SearchActivityBinding;

    .line 55
    .line 56
    iget-object p0, p0, Lcom/friday/main/databinding/SearchActivityBinding;->g:Landroid/widget/TextView;

    .line 57
    .line 58
    invoke-static {p0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    check-cast p0, Lcom/friday/main/databinding/SearchActivityBinding;

    .line 76
    .line 77
    iget-object p0, p0, Lcom/friday/main/databinding/SearchActivityBinding;->g:Landroid/widget/TextView;

    .line 78
    .line 79
    invoke-static {p0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 83
    .line 84
    .line 85
    :goto_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 86
    .line 87
    return-object p0
.end method

.method public static final g0(Lcom/friday/main/view/SearchActivity;ILcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 7

    .line 1
    const-string v0, "item"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Lcom/friday/main/R$id;->iv_go:I

    .line 7
    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    const-string p1, "SearchToDetailPath"

    .line 11
    .line 12
    invoke-static {p1}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-interface {p1, p2}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    sget v0, Lcom/friday/main/R$id;->ll_container:I

    .line 24
    .line 25
    if-ne p1, v0, :cond_1

    .line 26
    .line 27
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    new-instance v4, Lcom/friday/main/view/SearchActivity$initView$4$2$1;

    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    invoke-direct {v4, p2, p0, p1}, Lcom/friday/main/view/SearchActivity$initView$4$2$1;-><init>(Lcom/friday/common/entity/FileEntity;Lcom/friday/main/view/SearchActivity;Lvc/c;)V

    .line 35
    .line 36
    .line 37
    const/4 v5, 0x3

    .line 38
    const/4 v6, 0x0

    .line 39
    const/4 v2, 0x0

    .line 40
    const/4 v3, 0x0

    .line 41
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 42
    .line 43
    .line 44
    :cond_1
    :goto_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 45
    .line 46
    return-object p0
.end method

.method public static final h0()Lcom/friday/main/adapter/SearchAdapter;
    .locals 1

    .line 1
    new-instance v0, Lcom/friday/main/adapter/SearchAdapter;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/friday/main/adapter/SearchAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private final i0(Landroidx/appcompat/widget/SearchView;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "mSearchPlate"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string v0, "null cannot be cast to non-null type android.view.View"

    .line 20
    .line 21
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    check-cast p1, Landroid/view/View;

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :catch_0
    move-exception p1

    .line 32
    goto :goto_0

    .line 33
    :catch_1
    move-exception p1

    .line 34
    goto :goto_1

    .line 35
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 36
    .line 37
    .line 38
    goto :goto_2

    .line 39
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 40
    .line 41
    .line 42
    :goto_2
    return-void
.end method


# virtual methods
.method public final Y()Lcom/friday/main/viewmodel/SearchViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/view/SearchActivity;->g:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/main/viewmodel/SearchViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public final Z()Lcom/friday/main/adapter/SearchAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/view/SearchActivity;->h:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/main/adapter/SearchAdapter;

    .line 8
    .line 9
    return-object v0
.end method

.method public getLayoutId()I
    .locals 1

    .line 1
    # RE layout layout/search_activity (0x7f0c0145), APK res/61.xml
    sget v0, Lcom/friday/main/R$layout;->search_activity:I

    .line 2
    .line 3
    return v0
.end method

.method public initData()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/main/view/SearchActivity;->initView()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/friday/main/view/SearchActivity;->initDataSource()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public initDataSource()V
    .locals 6

    .line 1
    invoke-super {p0}, Lcom/friday/common/base/BaseActivity;->initDataSource()V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v3, Lcom/friday/main/view/SearchActivity$initDataSource$1;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v3, p0, v1}, Lcom/friday/main/view/SearchActivity$initDataSource$1;-><init>(Lcom/friday/main/view/SearchActivity;Lvc/c;)V

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
    invoke-virtual {p0}, Lcom/friday/main/view/SearchActivity;->Y()Lcom/friday/main/viewmodel/SearchViewModel;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Lcom/friday/main/viewmodel/SearchViewModel;->r()Landroidx/lifecycle/MutableLiveData;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    new-instance v1, Lv3/b2;

    .line 29
    .line 30
    invoke-direct {v1, p0}, Lv3/b2;-><init>(Lcom/friday/main/view/SearchActivity;)V

    .line 31
    .line 32
    .line 33
    new-instance v2, Lcom/friday/main/view/SearchActivity$b;

    .line 34
    .line 35
    invoke-direct {v2, v1}, Lcom/friday/main/view/SearchActivity$b;-><init>(Lhd/l;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/friday/main/view/SearchActivity;->Y()Lcom/friday/main/viewmodel/SearchViewModel;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Lcom/friday/main/viewmodel/SearchViewModel;->v()Landroidx/lifecycle/MutableLiveData;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    new-instance v1, Lv3/c2;

    .line 50
    .line 51
    invoke-direct {v1, p0}, Lv3/c2;-><init>(Lcom/friday/main/view/SearchActivity;)V

    .line 52
    .line 53
    .line 54
    new-instance v2, Lcom/friday/main/view/SearchActivity$b;

    .line 55
    .line 56
    invoke-direct {v2, v1}, Lcom/friday/main/view/SearchActivity$b;-><init>(Lhd/l;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/friday/main/view/SearchActivity;->Y()Lcom/friday/main/viewmodel/SearchViewModel;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, Lcom/friday/main/viewmodel/SearchViewModel;->t()Landroidx/lifecycle/MutableLiveData;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    new-instance v1, Lv3/d2;

    .line 71
    .line 72
    invoke-direct {v1, p0}, Lv3/d2;-><init>(Lcom/friday/main/view/SearchActivity;)V

    .line 73
    .line 74
    .line 75
    new-instance v2, Lcom/friday/main/view/SearchActivity$b;

    .line 76
    .line 77
    invoke-direct {v2, v1}, Lcom/friday/main/view/SearchActivity$b;-><init>(Lhd/l;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Lcom/friday/main/view/SearchActivity;->Y()Lcom/friday/main/viewmodel/SearchViewModel;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0}, Lcom/friday/main/viewmodel/SearchViewModel;->u()Landroidx/lifecycle/MutableLiveData;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    new-instance v1, Lv3/e2;

    .line 92
    .line 93
    invoke-direct {v1, p0}, Lv3/e2;-><init>(Lcom/friday/main/view/SearchActivity;)V

    .line 94
    .line 95
    .line 96
    new-instance v2, Lcom/friday/main/view/SearchActivity$b;

    .line 97
    .line 98
    invoke-direct {v2, v1}, Lcom/friday/main/view/SearchActivity$b;-><init>(Lhd/l;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 102
    .line 103
    .line 104
    return-void
.end method

.method public initView()V
    .locals 4

    .line 1
    invoke-super {p0}, Lcom/friday/common/base/BaseActivity;->initView()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lcom/friday/main/databinding/SearchActivityBinding;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/friday/main/databinding/SearchActivityBinding;->f:Landroid/widget/ImageView;

    .line 11
    .line 12
    new-instance v1, Lv3/y1;

    .line 13
    .line 14
    invoke-direct {v1, p0}, Lv3/y1;-><init>(Lcom/friday/main/view/SearchActivity;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lcom/friday/main/databinding/SearchActivityBinding;

    .line 25
    .line 26
    iget-object v0, v0, Lcom/friday/main/databinding/SearchActivityBinding;->e:Landroidx/appcompat/widget/Toolbar;

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->setSupportActionBar(Landroidx/appcompat/widget/Toolbar;)V

    .line 29
    .line 30
    .line 31
    const-string v1, ""

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getSupportActionBar()Landroidx/appcompat/app/ActionBar;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const/4 v1, 0x0

    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroidx/appcompat/app/ActionBar;->setDisplayShowTitleEnabled(Z)V

    .line 44
    .line 45
    .line 46
    :cond_0
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Lcom/friday/main/databinding/SearchActivityBinding;

    .line 51
    .line 52
    iget-object v0, v0, Lcom/friday/main/databinding/SearchActivityBinding;->d:Landroidx/appcompat/widget/SearchView;

    .line 53
    .line 54
    sget v2, Lcom/friday/main/R$string;->query_in_all_note:I

    .line 55
    .line 56
    invoke-static {v2}, Lz1/b;->f(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/SearchView;->setQueryHint(Ljava/lang/CharSequence;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SearchView;->setIconified(Z)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SearchView;->setIconifiedByDefault(Z)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Landroidx/appcompat/widget/SearchView;->onActionViewExpanded()V

    .line 70
    .line 71
    .line 72
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-direct {p0, v0}, Lcom/friday/main/view/SearchActivity;->i0(Landroidx/appcompat/widget/SearchView;)V

    .line 76
    .line 77
    .line 78
    new-instance v1, Lcom/friday/main/view/SearchActivity$initView$3$1;

    .line 79
    .line 80
    invoke-direct {v1, p0}, Lcom/friday/main/view/SearchActivity$initView$3$1;-><init>(Lcom/friday/main/view/SearchActivity;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SearchView;->setOnQueryTextListener(Landroidx/appcompat/widget/SearchView$OnQueryTextListener;)V

    .line 84
    .line 85
    .line 86
    const/4 v1, 0x1

    .line 87
    :try_start_0
    sget-object v2, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 88
    .line 89
    const-class v2, Landroidx/appcompat/widget/SearchView;

    .line 90
    .line 91
    const-string v3, "mSearchSrcTextView"

    .line 92
    .line 93
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-virtual {v2, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    const-string v2, "null cannot be cast to non-null type android.widget.TextView"

    .line 105
    .line 106
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    check-cast v0, Landroid/widget/TextView;

    .line 110
    .line 111
    const-class v2, Landroid/widget/TextView;

    .line 112
    .line 113
    const-string v3, "mDeviceProvisionedState"

    .line 114
    .line 115
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-virtual {v2, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 120
    .line 121
    .line 122
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    new-instance v2, Lcom/friday/main/view/SearchActivity$a;

    .line 130
    .line 131
    invoke-direct {v2}, Lcom/friday/main/view/SearchActivity$a;-><init>()V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setCustomInsertionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    .line 135
    .line 136
    .line 137
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 138
    .line 139
    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 143
    goto :goto_0

    .line 144
    :catchall_0
    move-exception v0

    .line 145
    sget-object v2, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 146
    .line 147
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    :goto_0
    invoke-static {v0}, Lkotlin/Result;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    if-eqz v0, :cond_1

    .line 160
    .line 161
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 162
    .line 163
    .line 164
    :cond_1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    check-cast v0, Lcom/friday/main/databinding/SearchActivityBinding;

    .line 169
    .line 170
    iget-object v0, v0, Lcom/friday/main/databinding/SearchActivityBinding;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 171
    .line 172
    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 173
    .line 174
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    invoke-direct {v2, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 182
    .line 183
    .line 184
    new-instance v2, Landroidx/recyclerview/widget/DividerItemDecoration;

    .line 185
    .line 186
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    invoke-direct {v2, v3, v1}, Landroidx/recyclerview/widget/DividerItemDecoration;-><init>(Landroid/content/Context;I)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    sget v3, Lcom/friday/main/R$drawable;->shape_search:I

    .line 198
    .line 199
    invoke-static {v1, v3}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/DividerItemDecoration;->setDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {p0}, Lcom/friday/main/view/SearchActivity;->Z()Lcom/friday/main/adapter/SearchAdapter;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {p0}, Lcom/friday/main/view/SearchActivity;->Z()Lcom/friday/main/adapter/SearchAdapter;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    new-instance v2, Lv3/z1;

    .line 224
    .line 225
    invoke-direct {v2, p0, v0}, Lv3/z1;-><init>(Lcom/friday/main/view/SearchActivity;Landroidx/recyclerview/widget/RecyclerView;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v1, v2}, Landroidx/paging/PagingDataAdapter;->addLoadStateListener(Lhd/l;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {p0}, Lcom/friday/main/view/SearchActivity;->Z()Lcom/friday/main/adapter/SearchAdapter;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    new-instance v1, Lv3/a2;

    .line 236
    .line 237
    invoke-direct {v1, p0}, Lv3/a2;-><init>(Lcom/friday/main/view/SearchActivity;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v0, v1}, Lcom/friday/main/adapter/SearchAdapter;->j(Lhd/p;)V

    .line 241
    .line 242
    .line 243
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 1
    const-string v0, "item"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const v1, 0x102002c

    .line 11
    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    invoke-static {p0}, Lcom/blankj/utilcode/util/KeyboardUtils;->hideSoftInput(Landroid/app/Activity;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    return p1
.end method
