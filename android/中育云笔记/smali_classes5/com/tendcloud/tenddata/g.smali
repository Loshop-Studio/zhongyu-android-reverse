.class public Lcom/tendcloud/tenddata/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/tenddata/g$b;,
        Lcom/tendcloud/tenddata/g$a;
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/String; = "_td_from_codeless"

.field public static final b:Ljava/lang/String; = "1"


# instance fields
.field c:Lcom/tendcloud/tenddata/g$b;

.field private d:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Landroid/app/Activity;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Landroid/os/Handler;

.field private final f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/t;",
            ">;>;"
        }
    .end annotation
.end field

.field private final g:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/tendcloud/tenddata/g$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/WeakHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/tendcloud/tenddata/g;->d:Ljava/util/WeakHashMap;

    .line 10
    .line 11
    new-instance v0, Landroid/os/Handler;

    .line 12
    .line 13
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/tendcloud/tenddata/g;->e:Landroid/os/Handler;

    .line 21
    .line 22
    new-instance v0, Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lcom/tendcloud/tenddata/g;->f:Ljava/util/Map;

    .line 28
    .line 29
    new-instance v0, Ljava/util/HashSet;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lcom/tendcloud/tenddata/g;->g:Ljava/util/Set;

    .line 35
    .line 36
    return-void
.end method

.method public static synthetic a(Lcom/tendcloud/tenddata/g;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tendcloud/tenddata/g;->e:Landroid/os/Handler;

    return-object p0
.end method

.method private a(Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "AddJavascriptInterface"
        }
    .end annotation

    if-nez p1, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    :try_start_0
    instance-of v0, p1, Landroid/webkit/WebView;

    if-eqz v0, :cond_2

    .line 3
    move-object v0, p1

    check-cast v0, Landroid/webkit/WebView;

    .line 4
    iget-object v1, p0, Lcom/tendcloud/tenddata/g;->c:Lcom/tendcloud/tenddata/g$b;

    if-nez v1, :cond_1

    .line 5
    new-instance v1, Lcom/tendcloud/tenddata/g$b;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-direct {v1, p0, v2}, Lcom/tendcloud/tenddata/g$b;-><init>(Lcom/tendcloud/tenddata/g;Ljava/lang/ref/WeakReference;)V

    iput-object v1, p0, Lcom/tendcloud/tenddata/g;->c:Lcom/tendcloud/tenddata/g$b;

    .line 6
    :cond_1
    iget-object v1, p0, Lcom/tendcloud/tenddata/g;->c:Lcom/tendcloud/tenddata/g$b;

    const-string v2, "TDHybridJS2NativeObject"

    invoke-virtual {v0, v1, v2}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0x13

    .line 7
    invoke-static {v1}, Lcom/tendcloud/tenddata/cq;->a(I)Z

    move-result v1

    if-nez v1, :cond_2

    .line 8
    sget-object v1, Lcom/tendcloud/tenddata/s;->a:Lcom/tendcloud/tenddata/s$c;

    const-string v2, "getPath"

    invoke-virtual {v0, v1, v2}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    :cond_2
    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_3

    .line 10
    check-cast p1, Landroid/view/ViewGroup;

    .line 11
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_3

    .line 12
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 13
    invoke-direct {p0, v2}, Lcom/tendcloud/tenddata/g;->a(Landroid/view/View;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :catchall_0
    :cond_3
    :goto_1
    return-void
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation

    .line 14
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 15
    iget-object v0, p0, Lcom/tendcloud/tenddata/g;->d:Ljava/util/WeakHashMap;

    invoke-virtual {v0}, Ljava/util/WeakHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public add(Landroid/app/Activity;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-direct {p0, v0}, Lcom/tendcloud/tenddata/g;->a(Landroid/view/View;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/tendcloud/tenddata/g;->d:Ljava/util/WeakHashMap;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/app/Activity;->getLocalClassName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, p1, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    :catchall_0
    return-void
.end method

.method public b()Z
    .locals 1

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/tendcloud/tenddata/g;->d:Ljava/util/WeakHashMap;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/WeakHashMap;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    return v0
.end method

.method public remove(Landroid/app/Activity;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/tendcloud/tenddata/g;->d:Ljava/util/WeakHashMap;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcom/tendcloud/tenddata/g;->g:Ljava/util/Set;

    .line 17
    .line 18
    monitor-enter p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 19
    :try_start_1
    iget-object v0, p0, Lcom/tendcloud/tenddata/g;->g:Ljava/util/Set;

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Lcom/tendcloud/tenddata/g$a;

    .line 36
    .line 37
    invoke-virtual {v1}, Lcom/tendcloud/tenddata/g$a;->kill()V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/g;->g:Ljava/util/Set;

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 46
    .line 47
    .line 48
    monitor-exit p1

    .line 49
    return-void

    .line 50
    :goto_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    :try_start_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 52
    :catchall_1
    return-void
.end method
