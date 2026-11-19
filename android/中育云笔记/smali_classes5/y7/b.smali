.class public abstract Ly7/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Landroid/app/Application;

.field public static b:Z

.field public static c:I

.field public static d:Ljava/lang/String;


# direct methods
.method public static a(Landroid/content/Context;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget p0, p0, Landroid/content/res/Configuration;->screenLayout:I

    .line 10
    .line 11
    and-int/lit8 p0, p0, 0xf

    .line 12
    .line 13
    const/4 v0, 0x3

    .line 14
    if-lt p0, v0, :cond_1

    .line 15
    .line 16
    const/4 v1, 0x4

    .line 17
    if-lt p0, v1, :cond_0

    .line 18
    .line 19
    return v0

    .line 20
    :cond_0
    const/4 p0, 0x2

    .line 21
    return p0

    .line 22
    :cond_1
    const/4 p0, 0x1

    .line 23
    return p0
.end method

.method public static b()Landroid/content/Context;
    .locals 1

    .line 1
    invoke-static {}, Ly7/b;->h()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ly7/b;->a:Landroid/app/Application;

    .line 5
    .line 6
    return-object v0
.end method

.method public static c()Landroid/graphics/Typeface;
    .locals 2

    .line 1
    sget-object v0, Ly7/b;->d:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Ly7/b;->b()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, Ly7/b;->d:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v0, v1}, Lio/github/inflationx/calligraphy3/TypefaceUtils;->load(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    return-object v0
.end method

.method public static d(Ljava/lang/String;)Landroid/graphics/Typeface;
    .locals 1

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object p0, Ly7/b;->d:Ljava/lang/String;

    .line 8
    .line 9
    :cond_0
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    invoke-static {}, Ly7/b;->b()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0, p0}, Lio/github/inflationx/calligraphy3/TypefaceUtils;->load(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :cond_1
    const/4 p0, 0x0

    .line 29
    return-object p0
.end method

.method public static e()I
    .locals 2

    .line 1
    sget-boolean v0, Ly7/b;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget v0, Ly7/b;->c:I

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    invoke-static {}, Ly7/b;->b()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Ly7/b;->a(Landroid/content/Context;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    sput v0, Ly7/b;->c:I

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    sput-boolean v1, Ly7/b;->b:Z

    .line 20
    .line 21
    return v0
.end method

.method public static f(Landroid/app/Application;)V
    .locals 0

    .line 1
    sput-object p0, Ly7/b;->a:Landroid/app/Application;

    .line 2
    .line 3
    return-void
.end method

.method public static g()Z
    .locals 2

    .line 1
    invoke-static {}, Ly7/b;->e()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    if-eq v0, v1, :cond_1

    .line 7
    .line 8
    invoke-static {}, Ly7/b;->e()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x3

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return v0

    .line 18
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 19
    return v0
.end method

.method public static h()V
    .locals 2

    .line 1
    sget-object v0, Ly7/b;->a:Landroid/app/Application;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/ExceptionInInitializerError;

    .line 7
    .line 8
    const-string v1, "\u8bf7\u5148\u5728\u5168\u5c40Application\u4e2d\u8c03\u7528 XUI.init() \u521d\u59cb\u5316\uff01"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method
