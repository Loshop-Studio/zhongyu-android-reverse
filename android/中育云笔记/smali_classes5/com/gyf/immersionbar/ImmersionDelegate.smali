.class Lcom/gyf/immersionbar/ImmersionDelegate;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private mBarProperties:Lcom/gyf/immersionbar/BarProperties;

.field private mImmersionBar:Lcom/gyf/immersionbar/ImmersionBar;

.field private mNotchHeight:I

.field private mOnBarListener:Lcom/gyf/immersionbar/OnBarListener;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/app/Dialog;)V
    .locals 1

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iget-object v0, p0, Lcom/gyf/immersionbar/ImmersionDelegate;->mImmersionBar:Lcom/gyf/immersionbar/ImmersionBar;

    if-nez v0, :cond_0

    .line 17
    new-instance v0, Lcom/gyf/immersionbar/ImmersionBar;

    invoke-direct {v0, p1, p2}, Lcom/gyf/immersionbar/ImmersionBar;-><init>(Landroid/app/Activity;Landroid/app/Dialog;)V

    iput-object v0, p0, Lcom/gyf/immersionbar/ImmersionDelegate;->mImmersionBar:Lcom/gyf/immersionbar/ImmersionBar;

    :cond_0
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/gyf/immersionbar/ImmersionDelegate;->mImmersionBar:Lcom/gyf/immersionbar/ImmersionBar;

    if-nez v0, :cond_4

    .line 4
    new-instance v0, Lcom/gyf/immersionbar/ImmersionBar;

    check-cast p1, Landroid/app/Activity;

    invoke-direct {v0, p1}, Lcom/gyf/immersionbar/ImmersionBar;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/gyf/immersionbar/ImmersionDelegate;->mImmersionBar:Lcom/gyf/immersionbar/ImmersionBar;

    return-void

    .line 5
    :cond_0
    instance-of v0, p1, Landroidx/fragment/app/Fragment;

    if-eqz v0, :cond_2

    .line 6
    iget-object v0, p0, Lcom/gyf/immersionbar/ImmersionDelegate;->mImmersionBar:Lcom/gyf/immersionbar/ImmersionBar;

    if-nez v0, :cond_4

    .line 7
    instance-of v0, p1, Landroidx/fragment/app/DialogFragment;

    if-eqz v0, :cond_1

    .line 8
    new-instance v0, Lcom/gyf/immersionbar/ImmersionBar;

    check-cast p1, Landroidx/fragment/app/DialogFragment;

    invoke-direct {v0, p1}, Lcom/gyf/immersionbar/ImmersionBar;-><init>(Landroidx/fragment/app/DialogFragment;)V

    iput-object v0, p0, Lcom/gyf/immersionbar/ImmersionDelegate;->mImmersionBar:Lcom/gyf/immersionbar/ImmersionBar;

    return-void

    .line 9
    :cond_1
    new-instance v0, Lcom/gyf/immersionbar/ImmersionBar;

    check-cast p1, Landroidx/fragment/app/Fragment;

    invoke-direct {v0, p1}, Lcom/gyf/immersionbar/ImmersionBar;-><init>(Landroidx/fragment/app/Fragment;)V

    iput-object v0, p0, Lcom/gyf/immersionbar/ImmersionDelegate;->mImmersionBar:Lcom/gyf/immersionbar/ImmersionBar;

    return-void

    .line 10
    :cond_2
    instance-of v0, p1, Landroid/app/Fragment;

    if-eqz v0, :cond_4

    .line 11
    iget-object v0, p0, Lcom/gyf/immersionbar/ImmersionDelegate;->mImmersionBar:Lcom/gyf/immersionbar/ImmersionBar;

    if-nez v0, :cond_4

    .line 12
    instance-of v0, p1, Landroid/app/DialogFragment;

    if-eqz v0, :cond_3

    .line 13
    new-instance v0, Lcom/gyf/immersionbar/ImmersionBar;

    check-cast p1, Landroid/app/DialogFragment;

    invoke-direct {v0, p1}, Lcom/gyf/immersionbar/ImmersionBar;-><init>(Landroid/app/DialogFragment;)V

    iput-object v0, p0, Lcom/gyf/immersionbar/ImmersionDelegate;->mImmersionBar:Lcom/gyf/immersionbar/ImmersionBar;

    return-void

    .line 14
    :cond_3
    new-instance v0, Lcom/gyf/immersionbar/ImmersionBar;

    check-cast p1, Landroid/app/Fragment;

    invoke-direct {v0, p1}, Lcom/gyf/immersionbar/ImmersionBar;-><init>(Landroid/app/Fragment;)V

    iput-object v0, p0, Lcom/gyf/immersionbar/ImmersionDelegate;->mImmersionBar:Lcom/gyf/immersionbar/ImmersionBar;

    :cond_4
    return-void
.end method

.method private barChanged(Landroid/content/res/Configuration;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/gyf/immersionbar/ImmersionDelegate;->mImmersionBar:Lcom/gyf/immersionbar/ImmersionBar;

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/gyf/immersionbar/ImmersionBar;->initialized()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_4

    .line 10
    .line 11
    iget-object v0, p0, Lcom/gyf/immersionbar/ImmersionDelegate;->mImmersionBar:Lcom/gyf/immersionbar/ImmersionBar;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/gyf/immersionbar/ImmersionBar;->getBarParams()Lcom/gyf/immersionbar/BarParams;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v0, v0, Lcom/gyf/immersionbar/BarParams;->onBarListener:Lcom/gyf/immersionbar/OnBarListener;

    .line 18
    .line 19
    iput-object v0, p0, Lcom/gyf/immersionbar/ImmersionDelegate;->mOnBarListener:Lcom/gyf/immersionbar/OnBarListener;

    .line 20
    .line 21
    if-eqz v0, :cond_4

    .line 22
    .line 23
    iget-object v0, p0, Lcom/gyf/immersionbar/ImmersionDelegate;->mImmersionBar:Lcom/gyf/immersionbar/ImmersionBar;

    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/gyf/immersionbar/ImmersionBar;->getActivity()Landroid/app/Activity;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v1, p0, Lcom/gyf/immersionbar/ImmersionDelegate;->mBarProperties:Lcom/gyf/immersionbar/BarProperties;

    .line 30
    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    new-instance v1, Lcom/gyf/immersionbar/BarProperties;

    .line 34
    .line 35
    invoke-direct {v1}, Lcom/gyf/immersionbar/BarProperties;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v1, p0, Lcom/gyf/immersionbar/ImmersionDelegate;->mBarProperties:Lcom/gyf/immersionbar/BarProperties;

    .line 39
    .line 40
    :cond_0
    iget-object v1, p0, Lcom/gyf/immersionbar/ImmersionDelegate;->mBarProperties:Lcom/gyf/immersionbar/BarProperties;

    .line 41
    .line 42
    iget p1, p1, Landroid/content/res/Configuration;->orientation:I

    .line 43
    .line 44
    const/4 v2, 0x0

    .line 45
    const/4 v3, 0x1

    .line 46
    if-ne p1, v3, :cond_1

    .line 47
    .line 48
    move p1, v3

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    move p1, v2

    .line 51
    :goto_0
    invoke-virtual {v1, p1}, Lcom/gyf/immersionbar/BarProperties;->setPortrait(Z)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p1}, Landroid/view/Display;->getRotation()I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-ne p1, v3, :cond_2

    .line 67
    .line 68
    iget-object p1, p0, Lcom/gyf/immersionbar/ImmersionDelegate;->mBarProperties:Lcom/gyf/immersionbar/BarProperties;

    .line 69
    .line 70
    invoke-virtual {p1, v3}, Lcom/gyf/immersionbar/BarProperties;->setLandscapeLeft(Z)V

    .line 71
    .line 72
    .line 73
    iget-object p1, p0, Lcom/gyf/immersionbar/ImmersionDelegate;->mBarProperties:Lcom/gyf/immersionbar/BarProperties;

    .line 74
    .line 75
    invoke-virtual {p1, v2}, Lcom/gyf/immersionbar/BarProperties;->setLandscapeRight(Z)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    const/4 v1, 0x3

    .line 80
    if-ne p1, v1, :cond_3

    .line 81
    .line 82
    iget-object p1, p0, Lcom/gyf/immersionbar/ImmersionDelegate;->mBarProperties:Lcom/gyf/immersionbar/BarProperties;

    .line 83
    .line 84
    invoke-virtual {p1, v2}, Lcom/gyf/immersionbar/BarProperties;->setLandscapeLeft(Z)V

    .line 85
    .line 86
    .line 87
    iget-object p1, p0, Lcom/gyf/immersionbar/ImmersionDelegate;->mBarProperties:Lcom/gyf/immersionbar/BarProperties;

    .line 88
    .line 89
    invoke-virtual {p1, v3}, Lcom/gyf/immersionbar/BarProperties;->setLandscapeRight(Z)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_3
    iget-object p1, p0, Lcom/gyf/immersionbar/ImmersionDelegate;->mBarProperties:Lcom/gyf/immersionbar/BarProperties;

    .line 94
    .line 95
    invoke-virtual {p1, v2}, Lcom/gyf/immersionbar/BarProperties;->setLandscapeLeft(Z)V

    .line 96
    .line 97
    .line 98
    iget-object p1, p0, Lcom/gyf/immersionbar/ImmersionDelegate;->mBarProperties:Lcom/gyf/immersionbar/BarProperties;

    .line 99
    .line 100
    invoke-virtual {p1, v2}, Lcom/gyf/immersionbar/BarProperties;->setLandscapeRight(Z)V

    .line 101
    .line 102
    .line 103
    :goto_1
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 112
    .line 113
    .line 114
    :cond_4
    return-void
.end method


# virtual methods
.method public get()Lcom/gyf/immersionbar/ImmersionBar;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/gyf/immersionbar/ImmersionDelegate;->mImmersionBar:Lcom/gyf/immersionbar/ImmersionBar;

    .line 2
    .line 3
    return-object v0
.end method

.method public onActivityCreated(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/gyf/immersionbar/ImmersionDelegate;->barChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/gyf/immersionbar/ImmersionDelegate;->mImmersionBar:Lcom/gyf/immersionbar/ImmersionBar;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/gyf/immersionbar/ImmersionBar;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1}, Lcom/gyf/immersionbar/ImmersionDelegate;->barChanged(Landroid/content/res/Configuration;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/gyf/immersionbar/ImmersionDelegate;->mBarProperties:Lcom/gyf/immersionbar/BarProperties;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/gyf/immersionbar/ImmersionDelegate;->mImmersionBar:Lcom/gyf/immersionbar/ImmersionBar;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {v1}, Lcom/gyf/immersionbar/ImmersionBar;->onDestroy()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/gyf/immersionbar/ImmersionDelegate;->mImmersionBar:Lcom/gyf/immersionbar/ImmersionBar;

    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/gyf/immersionbar/ImmersionDelegate;->mImmersionBar:Lcom/gyf/immersionbar/ImmersionBar;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/gyf/immersionbar/ImmersionBar;->onResume()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/gyf/immersionbar/ImmersionDelegate;->mImmersionBar:Lcom/gyf/immersionbar/ImmersionBar;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/gyf/immersionbar/ImmersionBar;->getActivity()Landroid/app/Activity;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lcom/gyf/immersionbar/ImmersionDelegate;->mImmersionBar:Lcom/gyf/immersionbar/ImmersionBar;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/gyf/immersionbar/ImmersionBar;->getActivity()Landroid/app/Activity;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Lcom/gyf/immersionbar/BarConfig;

    .line 18
    .line 19
    invoke-direct {v1, v0}, Lcom/gyf/immersionbar/BarConfig;-><init>(Landroid/app/Activity;)V

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, Lcom/gyf/immersionbar/ImmersionDelegate;->mBarProperties:Lcom/gyf/immersionbar/BarProperties;

    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/gyf/immersionbar/BarConfig;->getStatusBarHeight()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-virtual {v2, v3}, Lcom/gyf/immersionbar/BarProperties;->setStatusBarHeight(I)V

    .line 29
    .line 30
    .line 31
    iget-object v2, p0, Lcom/gyf/immersionbar/ImmersionDelegate;->mBarProperties:Lcom/gyf/immersionbar/BarProperties;

    .line 32
    .line 33
    invoke-virtual {v1}, Lcom/gyf/immersionbar/BarConfig;->hasNavigationBar()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-virtual {v2, v3}, Lcom/gyf/immersionbar/BarProperties;->setNavigationBar(Z)V

    .line 38
    .line 39
    .line 40
    iget-object v2, p0, Lcom/gyf/immersionbar/ImmersionDelegate;->mBarProperties:Lcom/gyf/immersionbar/BarProperties;

    .line 41
    .line 42
    invoke-virtual {v1}, Lcom/gyf/immersionbar/BarConfig;->getNavigationBarHeight()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    invoke-virtual {v2, v3}, Lcom/gyf/immersionbar/BarProperties;->setNavigationBarHeight(I)V

    .line 47
    .line 48
    .line 49
    iget-object v2, p0, Lcom/gyf/immersionbar/ImmersionDelegate;->mBarProperties:Lcom/gyf/immersionbar/BarProperties;

    .line 50
    .line 51
    invoke-virtual {v1}, Lcom/gyf/immersionbar/BarConfig;->getNavigationBarWidth()I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    invoke-virtual {v2, v3}, Lcom/gyf/immersionbar/BarProperties;->setNavigationBarWidth(I)V

    .line 56
    .line 57
    .line 58
    iget-object v2, p0, Lcom/gyf/immersionbar/ImmersionDelegate;->mBarProperties:Lcom/gyf/immersionbar/BarProperties;

    .line 59
    .line 60
    invoke-virtual {v1}, Lcom/gyf/immersionbar/BarConfig;->getActionBarHeight()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    invoke-virtual {v2, v1}, Lcom/gyf/immersionbar/BarProperties;->setActionBarHeight(I)V

    .line 65
    .line 66
    .line 67
    invoke-static {v0}, Lcom/gyf/immersionbar/NotchUtils;->hasNotchScreen(Landroid/app/Activity;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    iget-object v2, p0, Lcom/gyf/immersionbar/ImmersionDelegate;->mBarProperties:Lcom/gyf/immersionbar/BarProperties;

    .line 72
    .line 73
    invoke-virtual {v2, v1}, Lcom/gyf/immersionbar/BarProperties;->setNotchScreen(Z)V

    .line 74
    .line 75
    .line 76
    if-eqz v1, :cond_0

    .line 77
    .line 78
    iget v1, p0, Lcom/gyf/immersionbar/ImmersionDelegate;->mNotchHeight:I

    .line 79
    .line 80
    if-nez v1, :cond_0

    .line 81
    .line 82
    invoke-static {v0}, Lcom/gyf/immersionbar/NotchUtils;->getNotchHeight(Landroid/app/Activity;)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    iput v0, p0, Lcom/gyf/immersionbar/ImmersionDelegate;->mNotchHeight:I

    .line 87
    .line 88
    iget-object v1, p0, Lcom/gyf/immersionbar/ImmersionDelegate;->mBarProperties:Lcom/gyf/immersionbar/BarProperties;

    .line 89
    .line 90
    invoke-virtual {v1, v0}, Lcom/gyf/immersionbar/BarProperties;->setNotchHeight(I)V

    .line 91
    .line 92
    .line 93
    :cond_0
    iget-object v0, p0, Lcom/gyf/immersionbar/ImmersionDelegate;->mOnBarListener:Lcom/gyf/immersionbar/OnBarListener;

    .line 94
    .line 95
    iget-object v1, p0, Lcom/gyf/immersionbar/ImmersionDelegate;->mBarProperties:Lcom/gyf/immersionbar/BarProperties;

    .line 96
    .line 97
    invoke-interface {v0, v1}, Lcom/gyf/immersionbar/OnBarListener;->onBarChange(Lcom/gyf/immersionbar/BarProperties;)V

    .line 98
    .line 99
    .line 100
    :cond_1
    return-void
.end method
