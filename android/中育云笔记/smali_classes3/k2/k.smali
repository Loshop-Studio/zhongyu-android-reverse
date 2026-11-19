.class public Lk2/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile e:Lk2/k;


# instance fields
.field public a:Landroid/view/View;

.field public b:Landroid/widget/TextView;

.field public c:Landroid/view/WindowManager$LayoutParams;

.field public d:Landroid/view/WindowManager;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget v1, Lcom/friday/common/R$layout;->app_toast:I

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lk2/k;->a:Landroid/view/View;

    .line 16
    .line 17
    sget v1, Lcom/friday/common/R$id;->tv_toast:I

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Landroid/widget/TextView;

    .line 24
    .line 25
    iput-object v0, p0, Lk2/k;->b:Landroid/widget/TextView;

    .line 26
    .line 27
    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    .line 28
    .line 29
    invoke-direct {v0}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lk2/k;->c:Landroid/view/WindowManager$LayoutParams;

    .line 33
    .line 34
    const/16 v1, 0x11

    .line 35
    .line 36
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 37
    .line 38
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 39
    .line 40
    const/16 v2, 0x1a

    .line 41
    .line 42
    if-lt v1, v2, :cond_0

    .line 43
    .line 44
    const/16 v1, 0x7f6

    .line 45
    .line 46
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    const/16 v1, 0x7d2

    .line 50
    .line 51
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 52
    .line 53
    :goto_0
    const/4 v1, -0x3

    .line 54
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->format:I

    .line 55
    .line 56
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    sget v2, Lcom/friday/common/R$dimen;->view_120:I

    .line 61
    .line 62
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    float-to-int v1, v1

    .line 67
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 68
    .line 69
    iget-object v0, p0, Lk2/k;->c:Landroid/view/WindowManager$LayoutParams;

    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    sget v1, Lcom/friday/common/R$dimen;->view_30:I

    .line 76
    .line 77
    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDimension(I)F

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    float-to-int p1, p1

    .line 82
    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 83
    .line 84
    iget-object p1, p0, Lk2/k;->c:Landroid/view/WindowManager$LayoutParams;

    .line 85
    .line 86
    const/16 v0, 0x98

    .line 87
    .line 88
    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 89
    .line 90
    iget-object p1, p0, Lk2/k;->a:Landroid/view/View;

    .line 91
    .line 92
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    const-string v0, "window"

    .line 97
    .line 98
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    check-cast p1, Landroid/view/WindowManager;

    .line 103
    .line 104
    iput-object p1, p0, Lk2/k;->d:Landroid/view/WindowManager;

    .line 105
    .line 106
    return-void
.end method

.method public static synthetic a(Lk2/k;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x5dc

    .line 5
    .line 6
    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catch_0
    move-exception v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 12
    .line 13
    .line 14
    :goto_0
    new-instance v0, Lk2/g;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lk2/g;-><init>(Lk2/k;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Lcom/blankj/utilcode/util/ThreadUtils;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static synthetic b(Lk2/k;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, Lk2/k;->d:Landroid/view/WindowManager;

    .line 5
    .line 6
    iget-object p0, p0, Lk2/k;->a:Landroid/view/View;

    .line 7
    .line 8
    invoke-interface {v0, p0}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    :catch_0
    return-void
.end method

.method public static synthetic c(Lk2/k;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, Lk2/k;->d:Landroid/view/WindowManager;

    .line 5
    .line 6
    iget-object p0, p0, Lk2/k;->a:Landroid/view/View;

    .line 7
    .line 8
    invoke-interface {v0, p0}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    :catch_0
    return-void
.end method

.method public static synthetic d(Lk2/k;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0xbb8

    .line 5
    .line 6
    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catch_0
    move-exception v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 12
    .line 13
    .line 14
    :goto_0
    new-instance v0, Lk2/i;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lk2/i;-><init>(Lk2/k;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Lcom/blankj/utilcode/util/ThreadUtils;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static synthetic e(Lk2/k;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lk2/k;->b:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object p1, p0, Lk2/k;->d:Landroid/view/WindowManager;

    .line 7
    .line 8
    iget-object v0, p0, Lk2/k;->a:Landroid/view/View;

    .line 9
    .line 10
    invoke-interface {p1, v0}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    :catch_0
    iget-object p1, p0, Lk2/k;->d:Landroid/view/WindowManager;

    .line 14
    .line 15
    iget-object v0, p0, Lk2/k;->a:Landroid/view/View;

    .line 16
    .line 17
    iget-object v1, p0, Lk2/k;->c:Landroid/view/WindowManager$LayoutParams;

    .line 18
    .line 19
    invoke-interface {p1, v0, v1}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 20
    .line 21
    .line 22
    new-instance p1, Ljava/lang/Thread;

    .line 23
    .line 24
    new-instance v0, Lk2/d;

    .line 25
    .line 26
    invoke-direct {v0, p0}, Lk2/d;-><init>(Lk2/k;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public static synthetic f(Lk2/k;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, Lk2/k;->d:Landroid/view/WindowManager;

    .line 5
    .line 6
    iget-object p0, p0, Lk2/k;->a:Landroid/view/View;

    .line 7
    .line 8
    invoke-interface {v0, p0}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    :catch_0
    return-void
.end method

.method public static synthetic g(Lk2/k;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x2710

    .line 5
    .line 6
    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catch_0
    move-exception v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 12
    .line 13
    .line 14
    :goto_0
    new-instance v0, Lk2/j;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lk2/j;-><init>(Lk2/k;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Lcom/blankj/utilcode/util/ThreadUtils;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static synthetic h(Lk2/k;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lk2/k;->b:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object p1, p0, Lk2/k;->d:Landroid/view/WindowManager;

    .line 7
    .line 8
    iget-object v0, p0, Lk2/k;->a:Landroid/view/View;

    .line 9
    .line 10
    invoke-interface {p1, v0}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    :catch_0
    iget-object p1, p0, Lk2/k;->d:Landroid/view/WindowManager;

    .line 14
    .line 15
    iget-object v0, p0, Lk2/k;->a:Landroid/view/View;

    .line 16
    .line 17
    iget-object v1, p0, Lk2/k;->c:Landroid/view/WindowManager$LayoutParams;

    .line 18
    .line 19
    invoke-interface {p1, v0, v1}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 20
    .line 21
    .line 22
    new-instance p1, Ljava/lang/Thread;

    .line 23
    .line 24
    new-instance v0, Lk2/h;

    .line 25
    .line 26
    invoke-direct {v0, p0}, Lk2/h;-><init>(Lk2/k;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public static synthetic i(Lk2/k;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, Lk2/k;->d:Landroid/view/WindowManager;

    .line 5
    .line 6
    iget-object p0, p0, Lk2/k;->a:Landroid/view/View;

    .line 7
    .line 8
    invoke-interface {v0, p0}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    :catch_0
    return-void
.end method

.method public static synthetic j(Lk2/k;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lk2/k;->b:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object p1, p0, Lk2/k;->d:Landroid/view/WindowManager;

    .line 7
    .line 8
    iget-object v0, p0, Lk2/k;->a:Landroid/view/View;

    .line 9
    .line 10
    invoke-interface {p1, v0}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    :catch_0
    iget-object p1, p0, Lk2/k;->d:Landroid/view/WindowManager;

    .line 14
    .line 15
    iget-object v0, p0, Lk2/k;->a:Landroid/view/View;

    .line 16
    .line 17
    iget-object v1, p0, Lk2/k;->c:Landroid/view/WindowManager$LayoutParams;

    .line 18
    .line 19
    invoke-interface {p1, v0, v1}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 20
    .line 21
    .line 22
    new-instance p1, Ljava/lang/Thread;

    .line 23
    .line 24
    new-instance v0, Lk2/c;

    .line 25
    .line 26
    invoke-direct {v0, p0}, Lk2/c;-><init>(Lk2/k;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public static k(Landroid/content/Context;)Lk2/k;
    .locals 2

    .line 1
    sget-object v0, Lk2/k;->e:Lk2/k;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lk2/k;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lk2/k;->e:Lk2/k;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lk2/k;

    .line 13
    .line 14
    invoke-direct {v1, p0}, Lk2/k;-><init>(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lk2/k;->e:Lk2/k;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    monitor-exit v0

    .line 23
    goto :goto_2

    .line 24
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw p0

    .line 26
    :cond_1
    :goto_2
    sget-object p0, Lk2/k;->e:Lk2/k;

    .line 27
    .line 28
    return-object p0
.end method


# virtual methods
.method public l()V
    .locals 1

    .line 1
    new-instance v0, Lk2/f;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lk2/f;-><init>(Lk2/k;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/blankj/utilcode/util/ThreadUtils;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public m(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lk2/b;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lk2/b;-><init>(Lk2/k;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/blankj/utilcode/util/ThreadUtils;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public n(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lk2/a;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lk2/a;-><init>(Lk2/k;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/blankj/utilcode/util/ThreadUtils;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public o(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lk2/e;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lk2/e;-><init>(Lk2/k;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/blankj/utilcode/util/ThreadUtils;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
