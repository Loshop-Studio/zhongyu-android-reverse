.class Lcom/gyf/immersionbar/BarConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final mActionBarHeight:I

.field private final mHasNavigationBar:Z

.field private final mInPortrait:Z

.field private final mNavigationBarHeight:I

.field private final mNavigationBarWidth:I

.field private final mSmallestWidthDp:F

.field private final mStatusBarHeight:I


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x1

    .line 16
    if-ne v0, v2, :cond_0

    .line 17
    .line 18
    move v0, v2

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v0, v1

    .line 21
    :goto_0
    iput-boolean v0, p0, Lcom/gyf/immersionbar/BarConfig;->mInPortrait:Z

    .line 22
    .line 23
    invoke-direct {p0, p1}, Lcom/gyf/immersionbar/BarConfig;->getSmallestWidthDp(Landroid/app/Activity;)F

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iput v0, p0, Lcom/gyf/immersionbar/BarConfig;->mSmallestWidthDp:F

    .line 28
    .line 29
    const-string v0, "status_bar_height"

    .line 30
    .line 31
    invoke-direct {p0, p1, v0}, Lcom/gyf/immersionbar/BarConfig;->getInternalDimensionSize(Landroid/content/Context;Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iput v0, p0, Lcom/gyf/immersionbar/BarConfig;->mStatusBarHeight:I

    .line 36
    .line 37
    invoke-direct {p0, p1}, Lcom/gyf/immersionbar/BarConfig;->getActionBarHeight(Landroid/app/Activity;)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iput v0, p0, Lcom/gyf/immersionbar/BarConfig;->mActionBarHeight:I

    .line 42
    .line 43
    invoke-direct {p0, p1}, Lcom/gyf/immersionbar/BarConfig;->getNavigationBarHeight(Landroid/content/Context;)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    iput v0, p0, Lcom/gyf/immersionbar/BarConfig;->mNavigationBarHeight:I

    .line 48
    .line 49
    invoke-direct {p0, p1}, Lcom/gyf/immersionbar/BarConfig;->getNavigationBarWidth(Landroid/content/Context;)I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    iput p1, p0, Lcom/gyf/immersionbar/BarConfig;->mNavigationBarWidth:I

    .line 54
    .line 55
    if-lez v0, :cond_1

    .line 56
    .line 57
    move v1, v2

    .line 58
    :cond_1
    iput-boolean v1, p0, Lcom/gyf/immersionbar/BarConfig;->mHasNavigationBar:Z

    .line 59
    .line 60
    return-void
.end method

.method private getActionBarHeight(Landroid/app/Activity;)I
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .line 1
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    sget v1, Lcom/gyf/immersionbar/R$id;->action_bar_container:I

    invoke-virtual {v0, v1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    .line 3
    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    const v2, 0x10102eb

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 5
    iget v0, v0, Landroid/util/TypedValue;->data:I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/TypedValue;->complexToDimensionPixelSize(ILandroid/util/DisplayMetrics;)I

    move-result p1

    return p1

    :cond_1
    return v0
.end method

.method private getInternalDimensionSize(Landroid/content/Context;Ljava/lang/String;)I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    const-string v2, "dimen"

    .line 7
    .line 8
    const-string v3, "android"

    .line 9
    .line 10
    invoke-virtual {v1, p2, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    if-lez p2, :cond_2

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v2, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    if-lt p2, v1, :cond_0

    .line 33
    .line 34
    return p2

    .line 35
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 44
    .line 45
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    iget p2, p2, Landroid/util/DisplayMetrics;->density:F
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    .line 55
    int-to-float v0, v1

    .line 56
    mul-float/2addr v0, p2

    .line 57
    div-float/2addr v0, p1

    .line 58
    const/4 p1, 0x0

    .line 59
    cmpl-float p1, v0, p1

    .line 60
    .line 61
    const/high16 p2, 0x3f000000    # 0.5f

    .line 62
    .line 63
    if-ltz p1, :cond_1

    .line 64
    .line 65
    add-float/2addr v0, p2

    .line 66
    goto :goto_0

    .line 67
    :cond_1
    sub-float/2addr v0, p2

    .line 68
    :goto_0
    float-to-int p1, v0

    .line 69
    return p1

    .line 70
    :catch_0
    :cond_2
    return v0
.end method

.method private getNavigationBarHeight(Landroid/content/Context;)I
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .line 1
    move-object v0, p1

    check-cast v0, Landroid/app/Activity;

    invoke-direct {p0, v0}, Lcom/gyf/immersionbar/BarConfig;->hasNavBar(Landroid/app/Activity;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    iget-boolean v0, p0, Lcom/gyf/immersionbar/BarConfig;->mInPortrait:Z

    if-eqz v0, :cond_0

    .line 3
    const-string v0, "navigation_bar_height"

    goto :goto_0

    .line 4
    :cond_0
    const-string v0, "navigation_bar_height_landscape"

    .line 5
    :goto_0
    invoke-direct {p0, p1, v0}, Lcom/gyf/immersionbar/BarConfig;->getInternalDimensionSize(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private getNavigationBarWidth(Landroid/content/Context;)I
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .line 1
    move-object v0, p1

    check-cast v0, Landroid/app/Activity;

    invoke-direct {p0, v0}, Lcom/gyf/immersionbar/BarConfig;->hasNavBar(Landroid/app/Activity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    const-string v0, "navigation_bar_width"

    invoke-direct {p0, p1, v0}, Lcom/gyf/immersionbar/BarConfig;->getInternalDimensionSize(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private getSmallestWidthDp(Landroid/app/Activity;)F
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 1
    new-instance v0, Landroid/util/DisplayMetrics;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1, v0}, Landroid/view/Display;->getRealMetrics(Landroid/util/DisplayMetrics;)V

    .line 15
    .line 16
    .line 17
    iget p1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 18
    .line 19
    int-to-float p1, p1

    .line 20
    iget v1, v0, Landroid/util/DisplayMetrics;->density:F

    .line 21
    .line 22
    div-float/2addr p1, v1

    .line 23
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 24
    .line 25
    int-to-float v0, v0

    .line 26
    div-float/2addr v0, v1

    .line 27
    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    return p1
.end method

.method private hasNavBar(Landroid/app/Activity;)Z
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "force_fsg_nav_bar"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-static {v0, v1, v2}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    return v2

    .line 15
    :cond_0
    invoke-static {}, Lcom/gyf/immersionbar/OSUtils;->isEMUI()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-static {}, Lcom/gyf/immersionbar/OSUtils;->isEMUI3_x()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const-string v1, "navigationbar_is_min"

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0, v1, v2}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    return v2

    .line 40
    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v0, v1, v2}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    return v2

    .line 51
    :cond_2
    invoke-virtual {p1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    new-instance v0, Landroid/util/DisplayMetrics;

    .line 60
    .line 61
    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v0}, Landroid/view/Display;->getRealMetrics(Landroid/util/DisplayMetrics;)V

    .line 65
    .line 66
    .line 67
    iget v1, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 68
    .line 69
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 70
    .line 71
    new-instance v3, Landroid/util/DisplayMetrics;

    .line 72
    .line 73
    invoke-direct {v3}, Landroid/util/DisplayMetrics;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, v3}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 77
    .line 78
    .line 79
    iget p1, v3, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 80
    .line 81
    iget v3, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 82
    .line 83
    sub-int/2addr v0, v3

    .line 84
    if-gtz v0, :cond_4

    .line 85
    .line 86
    sub-int/2addr v1, p1

    .line 87
    if-lez v1, :cond_3

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_3
    return v2

    .line 91
    :cond_4
    :goto_0
    const/4 p1, 0x1

    .line 92
    return p1
.end method


# virtual methods
.method public getActionBarHeight()I
    .locals 1

    .line 6
    iget v0, p0, Lcom/gyf/immersionbar/BarConfig;->mActionBarHeight:I

    return v0
.end method

.method public getNavigationBarHeight()I
    .locals 1

    .line 6
    iget v0, p0, Lcom/gyf/immersionbar/BarConfig;->mNavigationBarHeight:I

    return v0
.end method

.method public getNavigationBarWidth()I
    .locals 1

    .line 3
    iget v0, p0, Lcom/gyf/immersionbar/BarConfig;->mNavigationBarWidth:I

    return v0
.end method

.method public getStatusBarHeight()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/gyf/immersionbar/BarConfig;->mStatusBarHeight:I

    .line 2
    .line 3
    return v0
.end method

.method public hasNavigationBar()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/gyf/immersionbar/BarConfig;->mHasNavigationBar:Z

    .line 2
    .line 3
    return v0
.end method

.method public isNavigationAtBottom()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/gyf/immersionbar/BarConfig;->mSmallestWidthDp:F

    .line 2
    .line 3
    const/high16 v1, 0x44160000    # 600.0f

    .line 4
    .line 5
    cmpl-float v0, v0, v1

    .line 6
    .line 7
    if-gez v0, :cond_1

    .line 8
    .line 9
    iget-boolean v0, p0, Lcom/gyf/immersionbar/BarConfig;->mInPortrait:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0

    .line 16
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 17
    return v0
.end method
