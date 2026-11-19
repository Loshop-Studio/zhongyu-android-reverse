.class public final La3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj2/b;


# static fields
.field public static final a:La3/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La3/b;

    .line 2
    .line 3
    invoke-direct {v0}, La3/b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La3/b;->a:La3/b;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 1

    .line 1
    sget-object v0, Lcom/friday/lecture/floatwindow/options/a;->g:Lcom/friday/lecture/floatwindow/options/a$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/friday/lecture/floatwindow/options/a$a;->a()Lcom/friday/lecture/floatwindow/options/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/friday/lecture/floatwindow/options/a;->h()Lcom/friday/lecture/floatwindow/options/OptionLayout;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p1, 0x4

    .line 18
    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 19
    .line 20
    .line 21
    :cond_1
    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    const-class v0, Lcom/friday/lecture/service/MyMqttService;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/blankj/utilcode/util/ServiceUtils;->stopService(Ljava/lang/Class;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c()V
    .locals 1

    .line 1
    const-class v0, Lcom/friday/common/activity/PusherService;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/blankj/utilcode/util/ServiceUtils;->stopService(Ljava/lang/Class;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d()Z
    .locals 1

    .line 1
    const-class v0, Lcom/friday/common/activity/PusherService;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/blankj/utilcode/util/ServiceUtils;->isServiceRunning(Ljava/lang/Class;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public e(Landroidx/appcompat/app/AppCompatActivity;)V
    .locals 4

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    new-instance v0, Landroidx/lifecycle/ViewModelProvider;

    .line 7
    .line 8
    new-instance v1, Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;

    .line 9
    .line 10
    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const-string v3, "getApp(...)"

    .line 15
    .line 16
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {v1, v2}, Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;-><init>(Landroid/app/Application;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, p1, v1}, Landroidx/lifecycle/ViewModelProvider;-><init>(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/ViewModelProvider$Factory;)V

    .line 23
    .line 24
    .line 25
    const-class p1, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;

    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;->s()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    .line 35
    .line 36
    :catch_0
    return-void
.end method

.method public f(Landroidx/appcompat/app/AppCompatActivity;)V
    .locals 2

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/friday/lecture/view/LectureDialogFragment;

    .line 7
    .line 8
    invoke-direct {v0}, Lcom/friday/lecture/view/LectureDialogFragment;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string v1, "getSupportFragmentManager(...)"

    .line 16
    .line 17
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-class v1, Lcom/friday/lecture/view/LectureDialogFragment;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, p1, v1}, Lcom/friday/common/base/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public g()Z
    .locals 1

    .line 1
    const-class v0, Lcom/friday/lecture/service/MyMqttService;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/blankj/utilcode/util/ServiceUtils;->isServiceRunning(Ljava/lang/Class;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
