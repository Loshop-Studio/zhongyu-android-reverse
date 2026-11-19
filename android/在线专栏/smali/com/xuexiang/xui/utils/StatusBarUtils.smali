.class public Lcom/xuexiang/xui/utils/StatusBarUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/utils/StatusBarUtils$IWindowShower;
    }
.end annotation


# static fields
.field private static final STATUSBAR_TYPE_ANDROID6:I = 0x3

.field private static final STATUSBAR_TYPE_DEFAULT:I = 0x0

.field private static final STATUSBAR_TYPE_FLYME:I = 0x2

.field private static final STATUSBAR_TYPE_MIUI:I = 0x1

.field private static final STATUS_BAR_DEFAULT_HEIGHT_DP:I = 0x19

.field private static mStatusBarType:I = 0x0

.field private static sStatusbarHeight:I = -0x1

.field private static sTransparentValue:Ljava/lang/Integer; = null

.field public static sVirtualDensity:F = -1.0f

.field public static sVirtualDensityDpi:F = -1.0f


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "u can\'t instantiate me..."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static Android6SetStatusBarLightMode(Landroid/view/Window;Z)Z
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz p1, :cond_0

    const/16 v1, 0x2000

    goto :goto_0

    :cond_0
    const/16 v1, 0x100

    .line 2
    :goto_0
    invoke-static {p0, v1}, Lcom/xuexiang/xui/utils/StatusBarUtils;->changeStatusBarModeRetainFlag(Landroid/view/Window;I)I

    move-result v1

    .line 3
    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 4
    invoke-static {}, Lcom/xuexiang/xui/utils/DeviceUtils;->isMIUIV9()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    invoke-static {p0, p1}, Lcom/xuexiang/xui/utils/StatusBarUtils;->MIUISetStatusBarLightMode(Landroid/view/Window;Z)Z

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static FlymeSetStatusBarLightMode(Landroid/view/Window;Z)Z
    .locals 5

    const/4 v0, 0x1

    if-eqz p0, :cond_1

    .line 1
    invoke-static {p0, p1}, Lcom/xuexiang/xui/utils/StatusBarUtils;->Android6SetStatusBarLightMode(Landroid/view/Window;Z)Z

    .line 2
    :try_start_0
    invoke-virtual {p0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    .line 3
    const-class v2, Landroid/view/WindowManager$LayoutParams;

    const-string v3, "MEIZU_FLAG_DARK_STATUS_BAR_ICON"

    .line 4
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    .line 5
    const-class v3, Landroid/view/WindowManager$LayoutParams;

    const-string v4, "meizuFlags"

    .line 6
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    .line 7
    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 8
    invoke-virtual {v3, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    const/4 v4, 0x0

    .line 9
    invoke-virtual {v2, v4}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v2

    .line 10
    invoke-virtual {v3, v1}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v4

    if-eqz p1, :cond_0

    or-int p1, v4, v2

    goto :goto_0

    :cond_0
    not-int p1, v2

    and-int/2addr p1, v4

    .line 11
    :goto_0
    invoke-virtual {v3, v1, p1}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V

    .line 12
    invoke-virtual {p0, v1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public static MIUISetStatusBarLightMode(Landroid/view/Window;Z)Z
    .locals 8

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p0, :cond_1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    :try_start_0
    const-string v3, "android.view.MiuiWindowManager$LayoutParams"

    .line 2
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    const-string v4, "EXTRA_FLAG_STATUS_BAR_DARK_MODE"

    .line 3
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    .line 4
    invoke-virtual {v4, v3}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v3

    const-string v4, "setExtraFlags"

    const/4 v5, 0x2

    new-array v6, v5, [Ljava/lang/Class;

    .line 5
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v7, v6, v1

    aput-object v7, v6, v0

    invoke-virtual {v2, v4, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    if-eqz p1, :cond_0

    new-array p1, v5, [Ljava/lang/Object;

    .line 6
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, p1, v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, p1, v0

    invoke-virtual {v2, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-array p1, v5, [Ljava/lang/Object;

    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, p1, v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, p1, v0

    invoke-virtual {v2, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static synthetic access$000(Landroid/view/Window;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/xuexiang/xui/utils/StatusBarUtils;->realHandleDisplayCutoutMode(Landroid/view/Window;Landroid/view/View;)V

    return-void
.end method

.method public static cancelFullScreen(Landroid/app/Activity;)V
    .locals 0

    if-nez p0, :cond_0

    return-void

    .line 7
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    invoke-static {p0}, Lcom/xuexiang/xui/utils/StatusBarUtils;->cancelFullScreen(Landroid/view/Window;)V

    return-void
.end method

.method public static cancelFullScreen(Landroid/app/Activity;II)V
    .locals 0

    if-nez p0, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    invoke-static {p0, p1, p2}, Lcom/xuexiang/xui/utils/StatusBarUtils;->cancelFullScreen(Landroid/view/Window;II)V

    return-void
.end method

.method public static cancelFullScreen(Landroid/view/Window;)V
    .locals 1

    const/4 v0, -0x1

    .line 8
    invoke-static {p0, v0, v0}, Lcom/xuexiang/xui/utils/StatusBarUtils;->cancelFullScreen(Landroid/view/Window;II)V

    return-void
.end method

.method public static cancelFullScreen(Landroid/view/Window;II)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/high16 v0, 0xc000000

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/Window;->clearFlags(I)V

    .line 3
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    const/high16 v0, -0x80000000

    .line 4
    invoke-virtual {p0, v0}, Landroid/view/Window;->addFlags(I)V

    const/4 v0, -0x1

    if-eq p1, v0, :cond_1

    .line 5
    invoke-virtual {p0, p1}, Landroid/view/Window;->setStatusBarColor(I)V

    :cond_1
    if-eq p2, v0, :cond_2

    .line 6
    invoke-virtual {p0, p2}, Landroid/view/Window;->setNavigationBarColor(I)V

    :cond_2
    return-void
.end method

.method private static changeStatusBarModeRetainFlag(Landroid/view/Window;I)I
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    const/16 v0, 0x400

    .line 1
    invoke-static {p0, p1, v0}, Lcom/xuexiang/xui/utils/StatusBarUtils;->retainSystemUiFlag(Landroid/view/Window;II)I

    move-result p1

    const/4 v1, 0x4

    .line 2
    invoke-static {p0, p1, v1}, Lcom/xuexiang/xui/utils/StatusBarUtils;->retainSystemUiFlag(Landroid/view/Window;II)I

    move-result p1

    const/4 v1, 0x2

    .line 3
    invoke-static {p0, p1, v1}, Lcom/xuexiang/xui/utils/StatusBarUtils;->retainSystemUiFlag(Landroid/view/Window;II)I

    move-result p1

    const/16 v1, 0x1000

    .line 4
    invoke-static {p0, p1, v1}, Lcom/xuexiang/xui/utils/StatusBarUtils;->retainSystemUiFlag(Landroid/view/Window;II)I

    move-result p1

    .line 5
    invoke-static {p0, p1, v0}, Lcom/xuexiang/xui/utils/StatusBarUtils;->retainSystemUiFlag(Landroid/view/Window;II)I

    move-result p1

    const/16 v0, 0x200

    .line 6
    invoke-static {p0, p1, v0}, Lcom/xuexiang/xui/utils/StatusBarUtils;->retainSystemUiFlag(Landroid/view/Window;II)I

    move-result p0

    return p0
.end method

.method public static fullScreen(Landroid/app/Activity;)V
    .locals 0

    if-nez p0, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    invoke-static {p0}, Lcom/xuexiang/xui/utils/StatusBarUtils;->fullScreen(Landroid/view/Window;)V

    return-void
.end method

.method public static fullScreen(Landroid/view/Window;)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p0

    const/16 v0, 0x1207

    invoke-virtual {p0, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    return-void
.end method

.method public static getNavigationBarHeight(Landroid/content/Context;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "navigation_bar_height"

    const-string v2, "dimen"

    const-string v3, "android"

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static getStatusBarAPITransparentValue(Landroid/content/Context;)Ljava/lang/Integer;
    .locals 6

    .line 1
    sget-object v0, Lcom/xuexiang/xui/utils/StatusBarUtils;->sTransparentValue:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    .line 3
    invoke-virtual {p0}, Landroid/content/pm/PackageManager;->getSystemSharedLibraryNames()[Ljava/lang/String;

    move-result-object p0

    .line 4
    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v3, v2

    :goto_0
    if-ge v1, v0, :cond_3

    aget-object v4, p0, v1

    const-string v5, "touchwiz"

    .line 5
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const-string v3, "SYSTEM_UI_FLAG_TRANSPARENT_BACKGROUND"

    goto :goto_1

    :cond_1
    const-string v5, "com.sonyericsson.navigationbar"

    .line 6
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    const-string v3, "SYSTEM_UI_FLAG_TRANSPARENT"

    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    if-eqz v3, :cond_4

    .line 7
    :try_start_0
    const-class p0, Landroid/view/View;

    invoke-virtual {p0, v3}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p0

    if-eqz p0, :cond_4

    .line 8
    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v0

    .line 9
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v0, v1, :cond_4

    .line 10
    invoke-virtual {p0, v2}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    sput-object p0, Lcom/xuexiang/xui/utils/StatusBarUtils;->sTransparentValue:Ljava/lang/Integer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    :catch_0
    :cond_4
    sget-object p0, Lcom/xuexiang/xui/utils/StatusBarUtils;->sTransparentValue:Ljava/lang/Integer;

    return-object p0
.end method

.method public static getStatusBarHeight(Landroid/content/Context;)I
    .locals 2

    .line 1
    sget v0, Lcom/xuexiang/xui/utils/StatusBarUtils;->sStatusbarHeight:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 2
    invoke-static {p0}, Lcom/xuexiang/xui/utils/Utils;->getStatusBarHeight(Landroid/content/Context;)I

    move-result p0

    sput p0, Lcom/xuexiang/xui/utils/StatusBarUtils;->sStatusbarHeight:I

    .line 3
    :cond_0
    sget p0, Lcom/xuexiang/xui/utils/StatusBarUtils;->sStatusbarHeight:I

    return p0
.end method

.method private static handleDisplayCutoutMode(Landroid/view/Window;)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1c
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2
    invoke-static {v0}, Landroidx/core/view/u;->U(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-static {p0, v0}, Lcom/xuexiang/xui/utils/StatusBarUtils;->realHandleDisplayCutoutMode(Landroid/view/Window;Landroid/view/View;)V

    goto :goto_0

    .line 4
    :cond_0
    new-instance v1, Lcom/xuexiang/xui/utils/StatusBarUtils$1;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/utils/StatusBarUtils$1;-><init>(Landroid/view/Window;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static initStatusBarStyle(Landroid/app/Activity;Z)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, p1, v0}, Lcom/xuexiang/xui/utils/StatusBarUtils;->initStatusBarStyle(Landroid/app/Activity;ZI)V

    return-void
.end method

.method public static initStatusBarStyle(Landroid/app/Activity;ZI)V
    .locals 0

    .line 2
    invoke-static {p0, p2}, Lcom/xuexiang/xui/utils/StatusBarUtils;->translucent(Landroid/app/Activity;I)V

    if-eqz p1, :cond_0

    .line 3
    invoke-static {p0}, Lcom/xuexiang/xui/utils/StatusBarUtils;->setStatusBarDarkMode(Landroid/app/Activity;)Z

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {p0}, Lcom/xuexiang/xui/utils/StatusBarUtils;->setStatusBarLightMode(Landroid/app/Activity;)Z

    :goto_0
    return-void
.end method

.method public static isFullScreen(Landroid/app/Activity;)Z
    .locals 1

    const/4 v0, 0x0

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object p0

    .line 2
    iget p0, p0, Landroid/view/WindowManager$LayoutParams;->flags:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    and-int/lit16 p0, p0, 0x400

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    const/4 v0, 0x1

    goto :goto_0

    :catch_0
    move-exception p0

    .line 3
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return v0
.end method

.method private static isMIUICustomStatusBarLightModeImpl()Z
    .locals 3

    .line 1
    invoke-static {}, Lcom/xuexiang/xui/utils/DeviceUtils;->isMIUIV9()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x17

    if-ge v0, v2, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-static {}, Lcom/xuexiang/xui/utils/DeviceUtils;->isMIUIV5()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {}, Lcom/xuexiang/xui/utils/DeviceUtils;->isMIUIV6()Z

    move-result v0

    if-nez v0, :cond_2

    .line 3
    invoke-static {}, Lcom/xuexiang/xui/utils/DeviceUtils;->isMIUIV7()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {}, Lcom/xuexiang/xui/utils/DeviceUtils;->isMIUIV8()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :cond_2
    :goto_0
    return v1
.end method

.method public static isNavigationBarExist(Landroid/app/Activity;)Z
    .locals 0

    invoke-static {p0}, Lcom/xuexiang/xui/utils/DensityUtils;->isNavigationBarExist(Landroid/content/Context;)Z

    move-result p0

    return p0
.end method

.method public static isNotchOfficialSupport()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static realHandleDisplayCutoutMode(Landroid/view/Window;Landroid/view/View;)V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1c
    .end annotation

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getRootWindowInsets()Landroid/view/WindowInsets;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1}, Landroid/view/View;->getRootWindowInsets()Landroid/view/WindowInsets;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/WindowInsets;->getDisplayCutout()Landroid/view/DisplayCutout;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object p1

    const/4 v0, 0x1

    .line 4
    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->layoutInDisplayCutoutMode:I

    .line 5
    invoke-virtual {p0, p1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    :cond_0
    return-void
.end method

.method public static retainSystemUiFlag(Landroid/view/Window;II)I
    .locals 0

    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/View;->getSystemUiVisibility()I

    move-result p0

    and-int/2addr p0, p2

    if-ne p0, p2, :cond_0

    or-int/2addr p1, p2

    :cond_0
    return p1
.end method

.method public static setNavigationBarColor(Landroid/app/Activity;I)V
    .locals 0

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/view/Window;->setNavigationBarColor(I)V

    return-void
.end method

.method public static setStatusBarDarkMode(Landroid/app/Activity;)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    .line 1
    :cond_0
    sget v1, Lcom/xuexiang/xui/utils/StatusBarUtils;->mStatusBarType:I

    const/4 v2, 0x1

    if-nez v1, :cond_1

    return v2

    :cond_1
    if-ne v1, v2, :cond_2

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    invoke-static {p0, v0}, Lcom/xuexiang/xui/utils/StatusBarUtils;->MIUISetStatusBarLightMode(Landroid/view/Window;Z)Z

    move-result p0

    return p0

    :cond_2
    const/4 v3, 0x2

    if-ne v1, v3, :cond_3

    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    invoke-static {p0, v0}, Lcom/xuexiang/xui/utils/StatusBarUtils;->FlymeSetStatusBarLightMode(Landroid/view/Window;Z)Z

    move-result p0

    return p0

    :cond_3
    const/4 v3, 0x3

    if-ne v1, v3, :cond_4

    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    invoke-static {p0, v0}, Lcom/xuexiang/xui/utils/StatusBarUtils;->Android6SetStatusBarLightMode(Landroid/view/Window;Z)Z

    move-result p0

    return p0

    :cond_4
    return v2
.end method

.method public static setStatusBarLightMode(Landroid/app/Activity;)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    .line 1
    :cond_0
    invoke-static {}, Lcom/xuexiang/xui/utils/DeviceUtils;->isZTKC2016()Z

    move-result v1

    if-eqz v1, :cond_1

    return v0

    .line 2
    :cond_1
    sget v1, Lcom/xuexiang/xui/utils/StatusBarUtils;->mStatusBarType:I

    if-eqz v1, :cond_2

    .line 3
    invoke-static {p0, v1}, Lcom/xuexiang/xui/utils/StatusBarUtils;->setStatusBarLightMode(Landroid/app/Activity;I)Z

    move-result p0

    return p0

    .line 4
    :cond_2
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    invoke-static {}, Lcom/xuexiang/xui/utils/StatusBarUtils;->isMIUICustomStatusBarLightModeImpl()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-static {v2, v3}, Lcom/xuexiang/xui/utils/StatusBarUtils;->MIUISetStatusBarLightMode(Landroid/view/Window;Z)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 6
    sput v3, Lcom/xuexiang/xui/utils/StatusBarUtils;->mStatusBarType:I

    return v3

    .line 7
    :cond_3
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-static {v2, v3}, Lcom/xuexiang/xui/utils/StatusBarUtils;->FlymeSetStatusBarLightMode(Landroid/view/Window;Z)Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 p0, 0x2

    .line 8
    sput p0, Lcom/xuexiang/xui/utils/StatusBarUtils;->mStatusBarType:I

    return v3

    :cond_4
    const/16 v2, 0x17

    if-lt v1, v2, :cond_5

    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    invoke-static {p0, v3}, Lcom/xuexiang/xui/utils/StatusBarUtils;->Android6SetStatusBarLightMode(Landroid/view/Window;Z)Z

    const/4 p0, 0x3

    .line 10
    sput p0, Lcom/xuexiang/xui/utils/StatusBarUtils;->mStatusBarType:I

    return v3

    :cond_5
    return v0
.end method

.method private static setStatusBarLightMode(Landroid/app/Activity;I)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 11
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    invoke-static {p0, v0}, Lcom/xuexiang/xui/utils/StatusBarUtils;->MIUISetStatusBarLightMode(Landroid/view/Window;Z)Z

    move-result p0

    return p0

    :cond_0
    const/4 v1, 0x2

    if-ne p1, v1, :cond_1

    .line 12
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    invoke-static {p0, v0}, Lcom/xuexiang/xui/utils/StatusBarUtils;->FlymeSetStatusBarLightMode(Landroid/view/Window;Z)Z

    move-result p0

    return p0

    :cond_1
    const/4 v1, 0x3

    if-ne p1, v1, :cond_2

    .line 13
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    invoke-static {p0, v0}, Lcom/xuexiang/xui/utils/StatusBarUtils;->Android6SetStatusBarLightMode(Landroid/view/Window;Z)Z

    move-result p0

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static setVirtualDensity(F)V
    .locals 0

    sput p0, Lcom/xuexiang/xui/utils/StatusBarUtils;->sVirtualDensity:F

    return-void
.end method

.method public static setVirtualDensityDpi(F)V
    .locals 0

    sput p0, Lcom/xuexiang/xui/utils/StatusBarUtils;->sVirtualDensityDpi:F

    return-void
.end method

.method public static showDialog(Landroid/app/Activity;Landroid/app/Dialog;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    new-instance v1, Lcom/xuexiang/xui/utils/StatusBarUtils$3;

    invoke-direct {v1, p1}, Lcom/xuexiang/xui/utils/StatusBarUtils$3;-><init>(Landroid/app/Dialog;)V

    invoke-static {p0, v0, v1}, Lcom/xuexiang/xui/utils/StatusBarUtils;->showWindow(Landroid/app/Activity;Landroid/view/Window;Lcom/xuexiang/xui/utils/StatusBarUtils$IWindowShower;)Z

    return-void
.end method

.method public static showDialogInFullScreen(Landroid/app/Dialog;)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    new-instance v1, Lcom/xuexiang/xui/utils/StatusBarUtils$2;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/utils/StatusBarUtils$2;-><init>(Landroid/app/Dialog;)V

    invoke-static {v0, v1}, Lcom/xuexiang/xui/utils/StatusBarUtils;->showWindowInFullScreen(Landroid/view/Window;Lcom/xuexiang/xui/utils/StatusBarUtils$IWindowShower;)V

    return-void
.end method

.method public static showWindow(Landroid/app/Activity;Landroid/view/Window;Lcom/xuexiang/xui/utils/StatusBarUtils$IWindowShower;)Z
    .locals 1

    if-eqz p0, :cond_1

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x8

    .line 1
    invoke-virtual {p1, v0}, Landroid/view/Window;->addFlags(I)V

    .line 2
    invoke-interface {p2, p1}, Lcom/xuexiang/xui/utils/StatusBarUtils$IWindowShower;->show(Landroid/view/Window;)V

    .line 3
    invoke-static {p0, p1}, Lcom/xuexiang/xui/utils/StatusBarUtils;->syncSystemUiVisibility(Landroid/app/Activity;Landroid/view/Window;)Z

    .line 4
    invoke-virtual {p1, v0}, Landroid/view/Window;->clearFlags(I)V

    const/4 p0, 0x1

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static showWindowInFullScreen(Landroid/view/Window;Lcom/xuexiang/xui/utils/StatusBarUtils$IWindowShower;)V
    .locals 1

    if-eqz p0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x8

    .line 1
    invoke-virtual {p0, v0}, Landroid/view/Window;->addFlags(I)V

    .line 2
    invoke-interface {p1, p0}, Lcom/xuexiang/xui/utils/StatusBarUtils$IWindowShower;->show(Landroid/view/Window;)V

    .line 3
    invoke-static {p0}, Lcom/xuexiang/xui/utils/StatusBarUtils;->fullScreen(Landroid/view/Window;)V

    .line 4
    invoke-virtual {p0, v0}, Landroid/view/Window;->clearFlags(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static supportTransclentStatusBar6()Z
    .locals 1

    invoke-static {}, Lcom/xuexiang/xui/utils/DeviceUtils;->isZUKZ1()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/xuexiang/xui/utils/DeviceUtils;->isZTKC2016()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static supportTranslucent()Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    invoke-static {}, Lcom/xuexiang/xui/utils/DeviceUtils;->isEssentialPhone()Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public static syncSystemUiVisibility(Landroid/app/Activity;Landroid/view/Window;)Z
    .locals 0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 1
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    invoke-static {p0, p1}, Lcom/xuexiang/xui/utils/StatusBarUtils;->syncSystemUiVisibility(Landroid/view/Window;Landroid/view/Window;)Z

    move-result p0

    return p0
.end method

.method public static syncSystemUiVisibility(Landroid/view/Window;Landroid/view/Window;)Z
    .locals 0

    if-eqz p0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/View;->getSystemUiVisibility()I

    move-result p0

    invoke-virtual {p1, p0}, Landroid/view/View;->setSystemUiVisibility(I)V

    const/4 p0, 0x1

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static translucent(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    invoke-static {p0}, Lcom/xuexiang/xui/utils/StatusBarUtils;->translucent(Landroid/view/Window;)V

    return-void
.end method

.method public static translucent(Landroid/app/Activity;I)V
    .locals 0

    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    .line 4
    invoke-static {p0, p1}, Lcom/xuexiang/xui/utils/StatusBarUtils;->translucent(Landroid/view/Window;I)V

    return-void
.end method

.method public static translucent(Landroid/view/Window;)V
    .locals 1

    const/high16 v0, 0x40000000    # 2.0f

    .line 2
    invoke-static {p0, v0}, Lcom/xuexiang/xui/utils/StatusBarUtils;->translucent(Landroid/view/Window;I)V

    return-void
.end method

.method public static translucent(Landroid/view/Window;I)V
    .locals 5
    .annotation build Landroid/annotation/TargetApi;
        value = 0x13
    .end annotation

    .line 5
    invoke-static {}, Lcom/xuexiang/xui/utils/StatusBarUtils;->supportTranslucent()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 6
    :cond_0
    invoke-static {}, Lcom/xuexiang/xui/utils/StatusBarUtils;->isNotchOfficialSupport()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 7
    invoke-static {p0}, Lcom/xuexiang/xui/utils/StatusBarUtils;->handleDisplayCutoutMode(Landroid/view/Window;)V

    .line 8
    :cond_1
    invoke-static {}, Lcom/xuexiang/xui/utils/DeviceUtils;->isMeizu()Z

    move-result v0

    const/high16 v1, 0x4000000

    if-nez v0, :cond_4

    invoke-static {}, Lcom/xuexiang/xui/utils/DeviceUtils;->isMIUI()Z

    move-result v0

    const/16 v2, 0x17

    if-eqz v0, :cond_2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v0, v2, :cond_2

    goto :goto_1

    .line 9
    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v3

    const/16 v4, 0x500

    invoke-virtual {v3, v4}, Landroid/view/View;->setSystemUiVisibility(I)V

    const/high16 v3, -0x80000000

    if-lt v0, v2, :cond_3

    .line 11
    invoke-static {}, Lcom/xuexiang/xui/utils/StatusBarUtils;->supportTransclentStatusBar6()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 12
    invoke-virtual {p0, v1}, Landroid/view/Window;->clearFlags(I)V

    .line 13
    invoke-virtual {p0, v3}, Landroid/view/Window;->addFlags(I)V

    const/4 p1, 0x0

    .line 14
    invoke-virtual {p0, p1}, Landroid/view/Window;->setStatusBarColor(I)V

    goto :goto_0

    .line 15
    :cond_3
    invoke-virtual {p0, v1}, Landroid/view/Window;->clearFlags(I)V

    .line 16
    invoke-virtual {p0, v3}, Landroid/view/Window;->addFlags(I)V

    .line 17
    invoke-virtual {p0, p1}, Landroid/view/Window;->setStatusBarColor(I)V

    :goto_0
    return-void

    .line 18
    :cond_4
    :goto_1
    invoke-virtual {p0, v1, v1}, Landroid/view/Window;->setFlags(II)V

    return-void
.end method
