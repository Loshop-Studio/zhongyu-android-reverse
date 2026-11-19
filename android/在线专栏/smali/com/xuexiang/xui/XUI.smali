.class public Lcom/xuexiang/xui/XUI;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static sContext:Landroid/app/Application;

.field private static sDefaultFontAssetPath:Ljava/lang/String;

.field private static sIsTabletChecked:Z

.field private static sScreenType:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static checkScreenSize(Landroid/content/Context;)I
    .locals 2

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p0

    iget p0, p0, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 p0, p0, 0xf

    const/4 v0, 0x3

    if-lt p0, v0, :cond_1

    const/4 v1, 0x4

    if-lt p0, v1, :cond_0

    return v0

    :cond_0
    const/4 p0, 0x2

    return p0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static debug(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/xuexiang/xui/logs/UILog;->debug(Ljava/lang/String;)V

    return-void
.end method

.method public static debug(Z)V
    .locals 0

    .line 2
    invoke-static {p0}, Lcom/xuexiang/xui/logs/UILog;->debug(Z)V

    return-void
.end method

.method public static getContext()Landroid/content/Context;
    .locals 1

    .line 1
    invoke-static {}, Lcom/xuexiang/xui/XUI;->testInitialize()V

    .line 2
    sget-object v0, Lcom/xuexiang/xui/XUI;->sContext:Landroid/app/Application;

    return-object v0
.end method

.method public static getDefaultFontAssetPath()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/xuexiang/xui/XUI;->sDefaultFontAssetPath:Ljava/lang/String;

    return-object v0
.end method

.method public static getDefaultTypeface()Landroid/graphics/Typeface;
    .locals 2

    .line 1
    sget-object v0, Lcom/xuexiang/xui/XUI;->sDefaultFontAssetPath:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Lcom/xuexiang/xui/XUI;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    sget-object v1, Lcom/xuexiang/xui/XUI;->sDefaultFontAssetPath:Ljava/lang/String;

    invoke-static {v0, v1}, Lio/github/inflationx/calligraphy3/TypefaceUtils;->load(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static getDefaultTypeface(Ljava/lang/String;)Landroid/graphics/Typeface;
    .locals 1

    .line 3
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    sget-object p0, Lcom/xuexiang/xui/XUI;->sDefaultFontAssetPath:Ljava/lang/String;

    .line 5
    :cond_0
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 6
    invoke-static {}, Lcom/xuexiang/xui/XUI;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    invoke-static {v0, p0}, Lio/github/inflationx/calligraphy3/TypefaceUtils;->load(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static getMainThemeColor(Landroid/content/Context;)I
    .locals 0

    invoke-static {p0}, Lcom/xuexiang/xui/utils/ThemeUtils;->getMainThemeColor(Landroid/content/Context;)I

    move-result p0

    return p0
.end method

.method public static getScreenType()I
    .locals 2

    .line 1
    sget-boolean v0, Lcom/xuexiang/xui/XUI;->sIsTabletChecked:Z

    if-eqz v0, :cond_0

    .line 2
    sget v0, Lcom/xuexiang/xui/XUI;->sScreenType:I

    return v0

    .line 3
    :cond_0
    invoke-static {}, Lcom/xuexiang/xui/XUI;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/xuexiang/xui/XUI;->checkScreenSize(Landroid/content/Context;)I

    move-result v0

    sput v0, Lcom/xuexiang/xui/XUI;->sScreenType:I

    const/4 v1, 0x1

    .line 4
    sput-boolean v1, Lcom/xuexiang/xui/XUI;->sIsTabletChecked:Z

    return v0
.end method

.method public static init(Landroid/app/Application;)V
    .locals 0

    sput-object p0, Lcom/xuexiang/xui/XUI;->sContext:Landroid/app/Application;

    return-void
.end method

.method public static initFontStyle(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    sput-object p0, Lcom/xuexiang/xui/XUI;->sDefaultFontAssetPath:Ljava/lang/String;

    .line 3
    invoke-static {}, Lm2/d;->b()Lm2/d$a;

    move-result-object v0

    new-instance v1, Lio/github/inflationx/calligraphy3/CalligraphyInterceptor;

    new-instance v2, Lio/github/inflationx/calligraphy3/CalligraphyConfig$Builder;

    invoke-direct {v2}, Lio/github/inflationx/calligraphy3/CalligraphyConfig$Builder;-><init>()V

    .line 4
    invoke-virtual {v2, p0}, Lio/github/inflationx/calligraphy3/CalligraphyConfig$Builder;->setDefaultFontPath(Ljava/lang/String;)Lio/github/inflationx/calligraphy3/CalligraphyConfig$Builder;

    move-result-object p0

    sget v2, Lcom/xuexiang/xui/R$attr;->fontPath:I

    .line 5
    invoke-virtual {p0, v2}, Lio/github/inflationx/calligraphy3/CalligraphyConfig$Builder;->setFontAttrId(I)Lio/github/inflationx/calligraphy3/CalligraphyConfig$Builder;

    move-result-object p0

    .line 6
    invoke-virtual {p0}, Lio/github/inflationx/calligraphy3/CalligraphyConfig$Builder;->build()Lio/github/inflationx/calligraphy3/CalligraphyConfig;

    move-result-object p0

    invoke-direct {v1, p0}, Lio/github/inflationx/calligraphy3/CalligraphyInterceptor;-><init>(Lio/github/inflationx/calligraphy3/CalligraphyConfig;)V

    .line 7
    invoke-virtual {v0, v1}, Lm2/d$a;->a(Lm2/c;)Lm2/d$a;

    move-result-object p0

    .line 8
    invoke-virtual {p0}, Lm2/d$a;->b()Lm2/d;

    move-result-object p0

    .line 9
    invoke-static {p0}, Lm2/d;->c(Lm2/d;)V

    :cond_0
    return-void
.end method

.method public static initTheme(Landroid/app/Activity;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/xuexiang/xui/XUI;->getScreenType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 2
    sget v0, Lcom/xuexiang/xui/R$style;->XUITheme_Phone:I

    invoke-virtual {p0, v0}, Landroid/app/Activity;->setTheme(I)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 3
    sget v0, Lcom/xuexiang/xui/R$style;->XUITheme_Tablet_Small:I

    invoke-virtual {p0, v0}, Landroid/app/Activity;->setTheme(I)V

    goto :goto_0

    .line 4
    :cond_1
    sget v0, Lcom/xuexiang/xui/R$style;->XUITheme_Tablet_Big:I

    invoke-virtual {p0, v0}, Landroid/app/Activity;->setTheme(I)V

    :goto_0
    return-void
.end method

.method public static isTablet()Z
    .locals 2

    invoke-static {}, Lcom/xuexiang/xui/XUI;->getScreenType()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    invoke-static {}, Lcom/xuexiang/xui/XUI;->getScreenType()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

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

.method public static varargs setViewsFont([Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lcom/xuexiang/xui/utils/ViewUtils;->setViewsFont([Landroid/view/View;)V

    return-void
.end method

.method private static testInitialize()V
    .locals 2

    .line 1
    sget-object v0, Lcom/xuexiang/xui/XUI;->sContext:Landroid/app/Application;

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/ExceptionInInitializerError;

    const-string v1, "\u8bf7\u5148\u5728\u5168\u5c40Application\u4e2d\u8c03\u7528 XUI.init() \u521d\u59cb\u5316\uff01"

    invoke-direct {v0, v1}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/String;)V

    throw v0
.end method
