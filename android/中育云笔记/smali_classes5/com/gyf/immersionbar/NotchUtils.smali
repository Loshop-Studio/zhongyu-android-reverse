.class public Lcom/gyf/immersionbar/NotchUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final NOTCH_HUA_WEI:Ljava/lang/String; = "com.huawei.android.util.HwNotchSizeUtil"

.field private static final NOTCH_OPPO:Ljava/lang/String; = "com.oppo.feature.screen.heteromorphism"

.field private static final NOTCH_VIVO:Ljava/lang/String; = "android.util.FtFeature"

.field private static final NOTCH_XIAO_MI:Ljava/lang/String; = "ro.miui.notch"

.field private static final SYSTEM_PROPERTIES:Ljava/lang/String; = "android.os.SystemProperties"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static dp2px(Landroid/content/Context;I)I
    .locals 1

    .line 1
    int-to-float p1, p1

    .line 2
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-static {v0, p1, p0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    float-to-int p0, p0

    .line 16
    return p0
.end method

.method private static getDisplayCutout(Landroid/app/Activity;)Landroid/view/DisplayCutout;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    if-eqz p0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 3
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/View;->getRootWindowInsets()Landroid/view/WindowInsets;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 4
    invoke-static {p0}, Landroidx/core/view/s1;->a(Landroid/view/WindowInsets;)Landroid/view/DisplayCutout;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static getDisplayCutout(Landroid/view/View;)Landroid/view/DisplayCutout;
    .locals 2

    .line 5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    if-eqz p0, :cond_0

    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getRootWindowInsets()Landroid/view/WindowInsets;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 7
    invoke-static {p0}, Landroidx/core/view/s1;->a(Landroid/view/WindowInsets;)Landroid/view/DisplayCutout;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static getHuaWeiNotchSize(Landroid/content/Context;)[I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    filled-new-array {v0, v0}, [I

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string v1, "com.huawei.android.util.HwNotchSizeUtil"

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-string v1, "getNotchSize"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {p0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, [I
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    return-object p0

    .line 30
    :catch_0
    return-object v0
.end method

.method public static getNotchHeight(Landroid/app/Activity;)I
    .locals 5

    .line 1
    invoke-static {p0}, Lcom/gyf/immersionbar/ImmersionBar;->getStatusBarHeight(Landroid/app/Activity;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p0}, Lcom/gyf/immersionbar/NotchUtils;->getDisplayCutout(Landroid/app/Activity;)Landroid/view/DisplayCutout;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/16 v3, 0x1c

    .line 12
    .line 13
    const/4 v4, 0x1

    .line 14
    if-lt v2, v3, :cond_2

    .line 15
    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    iget p0, p0, Landroid/content/res/Configuration;->orientation:I

    .line 27
    .line 28
    if-ne p0, v4, :cond_0

    .line 29
    .line 30
    invoke-static {v1}, Landroidx/window/layout/g;->a(Landroid/view/DisplayCutout;)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0

    .line 35
    :cond_0
    invoke-static {v1}, Landroidx/window/layout/f;->a(Landroid/view/DisplayCutout;)I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-nez p0, :cond_1

    .line 40
    .line 41
    invoke-static {v1}, Landroidx/window/layout/d;->a(Landroid/view/DisplayCutout;)I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    return p0

    .line 46
    :cond_1
    invoke-static {v1}, Landroidx/window/layout/f;->a(Landroid/view/DisplayCutout;)I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    return p0

    .line 51
    :cond_2
    invoke-static {p0}, Lcom/gyf/immersionbar/NotchUtils;->hasNotchAtXiaoMi(Landroid/content/Context;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    invoke-static {p0}, Lcom/gyf/immersionbar/NotchUtils;->getXiaoMiNotchHeight(Landroid/content/Context;)I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    goto :goto_0

    .line 62
    :cond_3
    const/4 v1, 0x0

    .line 63
    :goto_0
    invoke-static {p0}, Lcom/gyf/immersionbar/NotchUtils;->hasNotchAtHuaWei(Landroid/content/Context;)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_4

    .line 68
    .line 69
    invoke-static {p0}, Lcom/gyf/immersionbar/NotchUtils;->getHuaWeiNotchSize(Landroid/content/Context;)[I

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    aget v1, v1, v4

    .line 74
    .line 75
    :cond_4
    invoke-static {p0}, Lcom/gyf/immersionbar/NotchUtils;->hasNotchAtVIVO(Landroid/content/Context;)Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_5

    .line 80
    .line 81
    const/16 v1, 0x20

    .line 82
    .line 83
    invoke-static {p0, v1}, Lcom/gyf/immersionbar/NotchUtils;->dp2px(Landroid/content/Context;I)I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-ge v1, v0, :cond_5

    .line 88
    .line 89
    move v1, v0

    .line 90
    :cond_5
    invoke-static {p0}, Lcom/gyf/immersionbar/NotchUtils;->hasNotchAtOPPO(Landroid/content/Context;)Z

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    if-eqz p0, :cond_7

    .line 95
    .line 96
    const/16 p0, 0x50

    .line 97
    .line 98
    if-ge p0, v0, :cond_6

    .line 99
    .line 100
    return v0

    .line 101
    :cond_6
    return p0

    .line 102
    :cond_7
    return v1
.end method

.method private static getXiaoMiNotchHeight(Landroid/content/Context;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "dimen"

    .line 6
    .line 7
    const-string v2, "android"

    .line 8
    .line 9
    const-string v3, "notch_height"

    .line 10
    .line 11
    invoke-virtual {v0, v3, v1, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-lez v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    return p0
.end method

.method private static hasNotchAtAndroidP(Landroid/app/Activity;)Z
    .locals 0

    .line 2
    invoke-static {p0}, Lcom/gyf/immersionbar/NotchUtils;->getDisplayCutout(Landroid/app/Activity;)Landroid/view/DisplayCutout;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static hasNotchAtAndroidP(Landroid/view/View;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/gyf/immersionbar/NotchUtils;->getDisplayCutout(Landroid/view/View;)Landroid/view/DisplayCutout;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static hasNotchAtHuaWei(Landroid/content/Context;)Z
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "com.huawei.android.util.HwNotchSizeUtil"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v0, "hasNotchInScreen"

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {p0, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Ljava/lang/Boolean;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 25
    .line 26
    .line 27
    move-result p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    return p0

    .line 29
    :catch_0
    const/4 p0, 0x0

    .line 30
    return p0
.end method

.method private static hasNotchAtOPPO(Landroid/content/Context;)Z
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "com.oppo.feature.screen.heteromorphism"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    return p0

    .line 12
    :catch_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method

.method private static hasNotchAtVIVO(Landroid/content/Context;)Z
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "android.util.FtFeature"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v0, "isFeatureSupport"

    .line 12
    .line 13
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 14
    .line 15
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {p0, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/16 v1, 0x20

    .line 24
    .line 25
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, Ljava/lang/Boolean;

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 40
    .line 41
    .line 42
    move-result p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    return p0

    .line 44
    :catch_0
    const/4 p0, 0x0

    .line 45
    return p0
.end method

.method private static hasNotchAtXiaoMi(Landroid/content/Context;)Z
    .locals 4

    .line 1
    const-string v0, "Xiaomi"

    .line 2
    .line 3
    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-string v0, "android.os.SystemProperties"

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const-string v0, "getInt"

    .line 23
    .line 24
    const-class v2, Ljava/lang/String;

    .line 25
    .line 26
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 27
    .line 28
    filled-new-array {v2, v3}, [Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {p0, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-string v2, "ro.miui.notch"

    .line 37
    .line 38
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    filled-new-array {v2, v3}, [Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v0, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    check-cast p0, Ljava/lang/Integer;

    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 53
    .line 54
    .line 55
    move-result p0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    goto :goto_0

    .line 57
    :catch_0
    :cond_0
    move p0, v1

    .line 58
    :goto_0
    const/4 v0, 0x1

    .line 59
    if-ne p0, v0, :cond_1

    .line 60
    .line 61
    move v1, v0

    .line 62
    :cond_1
    return v1
.end method

.method public static hasNotchScreen(Landroid/app/Activity;)Z
    .locals 1

    if-eqz p0, :cond_1

    .line 1
    invoke-static {p0}, Lcom/gyf/immersionbar/NotchUtils;->hasNotchAtXiaoMi(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-static {p0}, Lcom/gyf/immersionbar/NotchUtils;->hasNotchAtHuaWei(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    invoke-static {p0}, Lcom/gyf/immersionbar/NotchUtils;->hasNotchAtOPPO(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    invoke-static {p0}, Lcom/gyf/immersionbar/NotchUtils;->hasNotchAtVIVO(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 5
    invoke-static {p0}, Lcom/gyf/immersionbar/NotchUtils;->hasNotchAtAndroidP(Landroid/app/Activity;)Z

    move-result p0

    if-eqz p0, :cond_1

    :cond_0
    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static hasNotchScreen(Landroid/view/View;)Z
    .locals 1

    if-eqz p0, :cond_1

    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/gyf/immersionbar/NotchUtils;->hasNotchAtXiaoMi(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/gyf/immersionbar/NotchUtils;->hasNotchAtHuaWei(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/gyf/immersionbar/NotchUtils;->hasNotchAtOPPO(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/gyf/immersionbar/NotchUtils;->hasNotchAtVIVO(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 10
    invoke-static {p0}, Lcom/gyf/immersionbar/NotchUtils;->hasNotchAtAndroidP(Landroid/view/View;)Z

    move-result p0

    if-eqz p0, :cond_1

    :cond_0
    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method
