.class final Lcom/gyf/immersionbar/NavigationBarObserver;
.super Landroid/database/ContentObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/gyf/immersionbar/NavigationBarObserver$NavigationBarObserverInstance;
    }
.end annotation


# instance fields
.field private mApplication:Landroid/app/Application;

.field private mIsRegister:Ljava/lang/Boolean;

.field private mListeners:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/gyf/immersionbar/OnNavigationBarListener;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 2
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {p0, v0}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    .line 3
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/gyf/immersionbar/NavigationBarObserver;->mIsRegister:Ljava/lang/Boolean;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/gyf/immersionbar/NavigationBarObserver$1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/gyf/immersionbar/NavigationBarObserver;-><init>()V

    return-void
.end method

.method public static getInstance()Lcom/gyf/immersionbar/NavigationBarObserver;
    .locals 1

    .line 1
    invoke-static {}, Lcom/gyf/immersionbar/NavigationBarObserver$NavigationBarObserverInstance;->access$000()Lcom/gyf/immersionbar/NavigationBarObserver;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method


# virtual methods
.method public addOnNavigationBarListener(Lcom/gyf/immersionbar/OnNavigationBarListener;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/gyf/immersionbar/NavigationBarObserver;->mListeners:Ljava/util/ArrayList;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/gyf/immersionbar/NavigationBarObserver;->mListeners:Ljava/util/ArrayList;

    .line 14
    .line 15
    :cond_1
    iget-object v0, p0, Lcom/gyf/immersionbar/NavigationBarObserver;->mListeners:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    iget-object v0, p0, Lcom/gyf/immersionbar/NavigationBarObserver;->mListeners:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    :cond_2
    :goto_0
    return-void
.end method

.method public onChange(Z)V
    .locals 6

    .line 1
    invoke-super {p0, p1}, Landroid/database/ContentObserver;->onChange(Z)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/gyf/immersionbar/NavigationBarObserver;->mApplication:Landroid/app/Application;

    .line 5
    .line 6
    if-eqz p1, :cond_4

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_4

    .line 13
    .line 14
    iget-object p1, p0, Lcom/gyf/immersionbar/NavigationBarObserver;->mListeners:Ljava/util/ArrayList;

    .line 15
    .line 16
    if-eqz p1, :cond_4

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-nez p1, :cond_4

    .line 23
    .line 24
    invoke-static {}, Lcom/gyf/immersionbar/OSUtils;->isMIUI()Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    const/4 v0, 0x0

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    iget-object p1, p0, Lcom/gyf/immersionbar/NavigationBarObserver;->mApplication:Landroid/app/Application;

    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const-string v1, "force_fsg_nav_bar"

    .line 38
    .line 39
    invoke-static {p1, v1, v0}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-static {}, Lcom/gyf/immersionbar/OSUtils;->isEMUI()Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    invoke-static {}, Lcom/gyf/immersionbar/OSUtils;->isEMUI3_x()Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    const-string v1, "navigationbar_is_min"

    .line 55
    .line 56
    if-nez p1, :cond_1

    .line 57
    .line 58
    iget-object p1, p0, Lcom/gyf/immersionbar/NavigationBarObserver;->mApplication:Landroid/app/Application;

    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-static {p1, v1, v0}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    goto :goto_0

    .line 69
    :cond_1
    iget-object p1, p0, Lcom/gyf/immersionbar/NavigationBarObserver;->mApplication:Landroid/app/Application;

    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-static {p1, v1, v0}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    goto :goto_0

    .line 80
    :cond_2
    move p1, v0

    .line 81
    :goto_0
    iget-object v1, p0, Lcom/gyf/immersionbar/NavigationBarObserver;->mListeners:Ljava/util/ArrayList;

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    move v3, v0

    .line 88
    :goto_1
    if-ge v3, v2, :cond_4

    .line 89
    .line 90
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    add-int/lit8 v3, v3, 0x1

    .line 95
    .line 96
    check-cast v4, Lcom/gyf/immersionbar/OnNavigationBarListener;

    .line 97
    .line 98
    const/4 v5, 0x1

    .line 99
    if-eq p1, v5, :cond_3

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_3
    move v5, v0

    .line 103
    :goto_2
    invoke-interface {v4, v5}, Lcom/gyf/immersionbar/OnNavigationBarListener;->onNavigationBarChange(Z)V

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_4
    return-void
.end method

.method public register(Landroid/app/Application;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/gyf/immersionbar/NavigationBarObserver;->mApplication:Landroid/app/Application;

    .line 2
    .line 3
    if-eqz p1, :cond_3

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_3

    .line 10
    .line 11
    iget-object p1, p0, Lcom/gyf/immersionbar/NavigationBarObserver;->mIsRegister:Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_3

    .line 18
    .line 19
    invoke-static {}, Lcom/gyf/immersionbar/OSUtils;->isMIUI()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    const-string p1, "force_fsg_nav_bar"

    .line 26
    .line 27
    invoke-static {p1}, Landroid/provider/Settings$Global;->getUriFor(Ljava/lang/String;)Landroid/net/Uri;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-static {}, Lcom/gyf/immersionbar/OSUtils;->isEMUI()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_2

    .line 37
    .line 38
    invoke-static {}, Lcom/gyf/immersionbar/OSUtils;->isEMUI3_x()Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    const-string v0, "navigationbar_is_min"

    .line 43
    .line 44
    if-nez p1, :cond_1

    .line 45
    .line 46
    invoke-static {v0}, Landroid/provider/Settings$Global;->getUriFor(Ljava/lang/String;)Landroid/net/Uri;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-static {v0}, Landroid/provider/Settings$System;->getUriFor(Ljava/lang/String;)Landroid/net/Uri;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    const/4 p1, 0x0

    .line 57
    :goto_0
    if-eqz p1, :cond_3

    .line 58
    .line 59
    iget-object v0, p0, Lcom/gyf/immersionbar/NavigationBarObserver;->mApplication:Landroid/app/Application;

    .line 60
    .line 61
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    const/4 v1, 0x1

    .line 66
    invoke-virtual {v0, p1, v1, p0}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 67
    .line 68
    .line 69
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 70
    .line 71
    iput-object p1, p0, Lcom/gyf/immersionbar/NavigationBarObserver;->mIsRegister:Ljava/lang/Boolean;

    .line 72
    .line 73
    :cond_3
    return-void
.end method

.method public removeOnNavigationBarListener(Lcom/gyf/immersionbar/OnNavigationBarListener;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lcom/gyf/immersionbar/NavigationBarObserver;->mListeners:Ljava/util/ArrayList;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    :cond_1
    :goto_0
    return-void
.end method
