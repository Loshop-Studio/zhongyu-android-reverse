# RE note 本类字节码直接引用的读写或显示接口包括偏好设置、WebView。
.class public final Lcom/zykj/subscriber/MainActivity;
.super Lcom/zykj/subscriber/BaseActivity;
.source "SourceFile"

# interfaces
.implements Lg2/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/subscriber/MainActivity$a;,
        Lcom/zykj/subscriber/MainActivity$b;
    }
.end annotation


# static fields
.field public static final t:Lcom/zykj/subscriber/MainActivity$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static volatile u:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private d:Lt1/a;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private e:Lj2/b;

.field private f:Landroid/view/View;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private g:Landroid/webkit/WebChromeClient$CustomViewCallback;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private h:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private i:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private j:Z

.field private final k:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private l:[Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private m:Z

.field private final n:Lokhttp3/OkHttpClient;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final o:Lcom/zykj/subscriber/receiver/AliMessageReceiver;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private p:Lcom/zykj/subscriber/update/c;

.field private q:Landroidx/appcompat/app/b;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final r:Landroid/content/ServiceConnection;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private s:Landroid/app/ProgressDialog;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/subscriber/MainActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/subscriber/MainActivity$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lcom/zykj/subscriber/MainActivity;->t:Lcom/zykj/subscriber/MainActivity$a;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/zykj/subscriber/MainActivity;->u:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/zykj/subscriber/BaseActivity;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/zykj/subscriber/MainActivity;->c:Ljava/util/Map;

    const-string v0, ""

    .line 2
    iput-object v0, p0, Lcom/zykj/subscriber/MainActivity;->h:Ljava/lang/String;

    .line 3
    iput-object v0, p0, Lcom/zykj/subscriber/MainActivity;->i:Ljava/lang/String;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/zykj/subscriber/MainActivity;->k:Ljava/util/ArrayList;

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    const-string v1, "android.permission.READ_EXTERNAL_STORAGE"

    const-string v2, "android.permission.READ_PHONE_STATE"

    const-string v3, "android.permission.ACCESS_WIFI_STATE"

    .line 5
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    move-result-object v0

    .line 6
    iput-object v0, p0, Lcom/zykj/subscriber/MainActivity;->l:[Ljava/lang/String;

    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcom/zykj/subscriber/MainActivity;->m:Z

    .line 8
    new-instance v1, Lokhttp3/OkHttpClient$Builder;

    invoke-direct {v1}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    const/4 v2, 0x2

    new-array v2, v2, [Lokhttp3/ConnectionSpec;

    .line 9
    sget-object v3, Lokhttp3/ConnectionSpec;->COMPATIBLE_TLS:Lokhttp3/ConnectionSpec;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    sget-object v3, Lokhttp3/ConnectionSpec;->CLEARTEXT:Lokhttp3/ConnectionSpec;

    aput-object v3, v2, v0

    invoke-static {v2}, Lkotlin/collections/j;->i([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, Lokhttp3/OkHttpClient$Builder;->connectionSpecs(Ljava/util/List;)Lokhttp3/OkHttpClient$Builder;

    .line 10
    invoke-virtual {v1}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    move-result-object v0

    .line 11
    iput-object v0, p0, Lcom/zykj/subscriber/MainActivity;->n:Lokhttp3/OkHttpClient;

    .line 12
    new-instance v0, Lcom/zykj/subscriber/receiver/AliMessageReceiver;

    new-instance v1, Lcom/zykj/subscriber/MainActivity$k;

    invoke-direct {v1, p0}, Lcom/zykj/subscriber/MainActivity$k;-><init>(Lcom/zykj/subscriber/MainActivity;)V

    invoke-direct {v0, v1}, Lcom/zykj/subscriber/receiver/AliMessageReceiver;-><init>(Lx2/a;)V

    iput-object v0, p0, Lcom/zykj/subscriber/MainActivity;->o:Lcom/zykj/subscriber/receiver/AliMessageReceiver;

    .line 13
    new-instance v0, Lcom/zykj/subscriber/MainActivity$c;

    invoke-direct {v0, p0}, Lcom/zykj/subscriber/MainActivity$c;-><init>(Lcom/zykj/subscriber/MainActivity;)V

    iput-object v0, p0, Lcom/zykj/subscriber/MainActivity;->r:Landroid/content/ServiceConnection;

    return-void
.end method

.method public static final synthetic A(Lcom/zykj/subscriber/MainActivity;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/subscriber/MainActivity;->i:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic B(Lcom/zykj/subscriber/MainActivity;Lt1/a;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/subscriber/MainActivity;->d:Lt1/a;

    return-void
.end method

.method public static final synthetic C(Lcom/zykj/subscriber/MainActivity;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/zykj/subscriber/MainActivity;->j:Z

    return-void
.end method

.method public static final synthetic D(Lcom/zykj/subscriber/MainActivity;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/zykj/subscriber/MainActivity;->m:Z

    return-void
.end method

.method public static final synthetic E(Lcom/zykj/subscriber/MainActivity;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/subscriber/MainActivity;->f:Landroid/view/View;

    return-void
.end method

.method public static final synthetic F(Lcom/zykj/subscriber/MainActivity;Landroid/webkit/WebChromeClient$CustomViewCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/subscriber/MainActivity;->g:Landroid/webkit/WebChromeClient$CustomViewCallback;

    return-void
.end method

.method public static final synthetic G(Lcom/zykj/subscriber/MainActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/zykj/subscriber/MainActivity;->d0()V

    return-void
.end method

.method private final H(Ljava/lang/String;)Z
    .locals 9

    const/4 v0, 0x0

    .line 1
    :try_start_0
    new-instance v1, Ljava/net/URL;

    invoke-direct {v1, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    iget-object v2, p0, Lcom/zykj/subscriber/MainActivity;->k:Ljava/util/ArrayList;

    .line 3
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Ljava/lang/String;

    .line 4
    invoke-virtual {v1}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v7

    const-string v8, "httpUrl.host"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7, v6, v0, v4, v5}, Le3/l;->n(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_0

    :cond_1
    move-object v3, v5

    .line 5
    :goto_0
    check-cast v3, Ljava/lang/String;

    const/4 v1, 0x1

    if-nez v3, :cond_5

    .line 6
    invoke-virtual {p0, p1}, Lcom/zykj/subscriber/MainActivity;->L(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 7
    sget-object v2, Lcom/zykj/subscriber/MainActivity;->u:Ljava/util/ArrayList;

    .line 8
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 9
    invoke-static {v3, p1}, Lkotlin/jvm/internal/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    return v1

    :cond_3
    const/16 v6, 0x2a

    .line 10
    invoke-static {v3, v6, v0, v4, v5}, Le3/l;->K(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    new-array v7, v1, [C

    aput-char v6, v7, v0

    invoke-static {v3, v7}, Le3/l;->I0(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object v3

    invoke-static {p1, v3, v0, v4, v5}, Le3/l;->C(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    return v1

    :cond_4
    return v0

    :cond_5
    return v1

    :catch_0
    move-exception p1

    .line 11
    invoke-virtual {p1}, Ljava/net/MalformedURLException;->printStackTrace()V

    return v0
.end method

.method private final I()V
    .locals 3

    .line 1
    invoke-static {p0}, Ll2/a;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "cn.com.techvision.appstore"

    .line 3
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "cn.com.techvision.appstore.action.CHECK_UPDATE_SERVICE"

    .line 4
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 5
    iget-object v1, p0, Lcom/zykj/subscriber/MainActivity;->r:Landroid/content/ServiceConnection;

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v1, v2}, Landroid/app/Activity;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    :cond_0
    return-void
.end method

.method private final J()V
    .locals 1

    .line 1
    invoke-static {p0}, Ll2/a;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/zykj/subscriber/MainActivity;->r:Landroid/content/ServiceConnection;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->unbindService(Landroid/content/ServiceConnection;)V

    :cond_0
    return-void
.end method

.method private final K(Ljava/lang/String;Lx2/l;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lx2/l<",
            "-",
            "Ljava/lang/String;",
            "Lo2/r;",
            ">;)V"
        }
    .end annotation

    const-string v0, "http"

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    .line 1
    invoke-static {p1, v0, v1, v2, v3}, Le3/l;->H(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v7, Lcom/zykj/download/work/DownloadFileWorkProxy;

    .line 3
    invoke-static {}, Ld2/b;->a()Landroid/app/Application;

    move-result-object v0

    const-string v1, "context()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    sget-object v2, Lcom/zykj/download/data/AppDatabase;->n:Lcom/zykj/download/data/AppDatabase$a;

    invoke-static {}, Ld2/b;->a()Landroid/app/Application;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Lcom/zykj/download/data/AppDatabase$a;->b(Landroid/content/Context;)Lcom/zykj/download/data/AppDatabase;

    move-result-object v1

    .line 5
    invoke-direct {v7, v0, v1, v3}, Lcom/zykj/download/work/DownloadFileWorkProxy;-><init>(Landroid/content/Context;Lcom/zykj/download/data/AppDatabase;Lcom/zykj/download/work/DownloadFileWork;)V

    .line 6
    invoke-static {p0}, Landroidx/lifecycle/m;->a(Landroidx/lifecycle/l;)Landroidx/lifecycle/g;

    move-result-object v0

    new-instance v1, Lcom/zykj/subscriber/MainActivity$d;

    const/4 v9, 0x0

    move-object v4, v1

    move-object v5, p0

    move-object v6, p1

    move-object v8, p2

    invoke-direct/range {v4 .. v9}, Lcom/zykj/subscriber/MainActivity$d;-><init>(Lcom/zykj/subscriber/MainActivity;Ljava/lang/String;Lcom/zykj/download/work/DownloadFileWorkProxy;Lx2/l;Lq2/d;)V

    invoke-virtual {v0, v1}, Landroidx/lifecycle/g;->k(Lx2/p;)Lf3/m1;

    goto :goto_0

    :cond_0
    const-string p1, "\u65e0\u6cd5\u6253\u5f00\u6587\u4ef6"

    .line 7
    invoke-virtual {p0, p1}, Lcom/zykj/subscriber/BaseActivity;->f(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method private final M(Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Ll2/c;->a:Ll2/c;

    invoke-virtual {v0, p1}, Ll2/c;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 3
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 4
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_0

    add-int/lit8 v3, v2, 0x1

    .line 5
    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v2, v3

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private final N()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/subscriber/MainActivity;->f:Landroid/view/View;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x400

    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    .line 3
    iget-object v0, p0, Lcom/zykj/subscriber/MainActivity;->f:Landroid/view/View;

    const/16 v1, 0x8

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lcom/zykj/subscriber/MainActivity;->f:Landroid/view/View;

    .line 5
    sget v0, Lc2/u;->m:I

    invoke-virtual {p0, v0}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/FrameLayout;

    iget-object v3, p0, Lcom/zykj/subscriber/MainActivity;->f:Landroid/view/View;

    invoke-virtual {v2, v3}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V

    .line 6
    invoke-virtual {p0, v0}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 7
    iget-object v0, p0, Lcom/zykj/subscriber/MainActivity;->g:Landroid/webkit/WebChromeClient$CustomViewCallback;

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {v0}, Landroid/webkit/WebChromeClient$CustomViewCallback;->onCustomViewHidden()V

    .line 8
    :goto_1
    sget v0, Lc2/u;->n:I

    invoke-virtual {p0, v0}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    return-void
.end method

.method private final O(Lcom/zykj/message/server/bean/UserInfo;)V
    .locals 2

    sget-object v0, Lz1/b;->a:Lz1/b;

    new-instance v1, Lcom/zykj/subscriber/MainActivity$e;

    invoke-direct {v1, p1, p0}, Lcom/zykj/subscriber/MainActivity$e;-><init>(Lcom/zykj/message/server/bean/UserInfo;Lcom/zykj/subscriber/MainActivity;)V

    invoke-virtual {v0, v1}, Lz1/b;->b(Lx2/l;)V

    return-void
.end method

.method private final P(Ljava/lang/String;)V
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 2
    invoke-virtual {p1}, Ljava/net/MalformedURLException;->printStackTrace()V

    const/4 v0, 0x0

    .line 3
    :goto_0
    iget-object p1, p0, Lcom/zykj/subscriber/MainActivity;->k:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    if-eqz v0, :cond_0

    .line 4
    iget-object p1, p0, Lcom/zykj/subscriber/MainActivity;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/zykj/subscriber/MainActivity;->k:Ljava/util/ArrayList;

    const-string v0, "zykj.org"

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    return-void
.end method

.method private final Q()V
    .locals 3

    .line 1
    new-instance v0, Ls1/b;

    invoke-direct {v0, p0}, Ls1/b;-><init>(Landroid/app/Activity;)V

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    const-string v2, "android.permission.READ_EXTERNAL_STORAGE"

    .line 2
    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-virtual {v0, v1}, Ls1/b;->l([Ljava/lang/String;)Lrx/Observable;

    return-void
.end method

.method private final R()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/subscriber/MainActivity;->o:Lcom/zykj/subscriber/receiver/AliMessageReceiver;

    .line 2
    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    const-string v2, "com.alibaba.sdk.android.push.RECEIVE"

    .line 3
    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 4
    sget-object v2, Lo2/r;->a:Lo2/r;

    .line 5
    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 6
    sget-object v0, Lz1/b;->a:Lz1/b;

    sget-object v1, Lcom/zykj/subscriber/MainActivity$f;->a:Lcom/zykj/subscriber/MainActivity$f;

    invoke-virtual {v0, v1}, Lz1/b;->g(Lx2/l;)V

    return-void
.end method

.method private final S()V
    .locals 2

    sget-object v0, Lh2/a;->a:Lh2/a;

    new-instance v1, Lcom/zykj/subscriber/MainActivity$g;

    invoke-direct {v1, p0}, Lcom/zykj/subscriber/MainActivity$g;-><init>(Lcom/zykj/subscriber/MainActivity;)V

    invoke-virtual {v0, v1}, Lh2/a;->h(Lx2/l;)V

    return-void
.end method

.method private final T()V
    .locals 2

    sget-object v0, Lz1/b;->a:Lz1/b;

    new-instance v1, Lcom/zykj/subscriber/MainActivity$h;

    invoke-direct {v1, p0}, Lcom/zykj/subscriber/MainActivity$h;-><init>(Lcom/zykj/subscriber/MainActivity;)V

    invoke-virtual {v0, v1}, Lz1/b;->c(Lx2/l;)V

    return-void
.end method

.method private static final U(Lcom/zykj/subscriber/MainActivity;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lc2/u;->h:I

    invoke-virtual {p0, v0}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    invoke-virtual {p0}, Landroid/widget/ImageView;->performClick()Z

    return-void
.end method

.method private final V()V
    .locals 14

    .line 1
    sget-object v0, Lh2/a;->a:Lh2/a;

    invoke-virtual {v0}, Lh2/a;->a()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0}, Lh2/a;->b()Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_1

    return-void

    .line 3
    :cond_1
    invoke-virtual {v0}, Lh2/a;->c()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    return-void

    .line 4
    :cond_2
    invoke-virtual {v0}, Lh2/a;->f()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    const-string v0, ""

    .line 5
    :cond_3
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-nez v2, :cond_4

    const/4 v2, 0x1

    goto :goto_0

    :cond_4
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_d

    const-string v0, "dev"

    .line 6
    invoke-static {v1, v0}, Lkotlin/jvm/internal/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "http://demo.exam.zykj.org/dev"

    goto/16 :goto_5

    :cond_5
    const-string v0, "test"

    .line 7
    invoke-static {v1, v0}, Lkotlin/jvm/internal/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, "https://test.school.zykj.org"

    goto :goto_5

    .line 8
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "."

    .line 9
    filled-new-array {v11}, [Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, v7

    invoke-static/range {v1 .. v6}, Le3/l;->r0(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 10
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, -0x1

    if-eqz v4, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 11
    check-cast v4, Ljava/lang/String;

    const/4 v6, 0x2

    const/4 v12, 0x0

    const-string v13, "api"

    .line 12
    invoke-static {v4, v13, v9, v6, v12}, Le3/l;->H(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    goto :goto_2

    :cond_7
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_8
    const/4 v3, -0x1

    :goto_2
    if-ne v3, v5, :cond_9

    const/4 v3, 0x1

    .line 13
    :cond_9
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    :goto_3
    if-ge v9, v2, :cond_c

    add-int/lit8 v4, v9, 0x1

    if-ne v9, v3, :cond_a

    const-string v5, "school"

    .line 14
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_4

    .line 15
    :cond_a
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    :goto_4
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    sub-int/2addr v5, v10

    if-eq v9, v5, :cond_b

    .line 17
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_b
    move v9, v4

    goto :goto_3

    .line 18
    :cond_c
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply {\n\u2026             }.toString()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    :cond_d
    :goto_5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "apiHost="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "&apiToken="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "&timestamp="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 21
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 22
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x2f

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v0, "navPage.html"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x3f

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x23

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v0, "list"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/zykj/subscriber/MainActivity;->h:Ljava/lang/String;

    .line 23
    iput-object v0, p0, Lcom/zykj/subscriber/MainActivity;->i:Ljava/lang/String;

    .line 24
    sget v0, Lc2/u;->n:I

    invoke-virtual {p0, v0}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    new-instance v1, Lc2/j;

    invoke-direct {v1, p0}, Lc2/j;-><init>(Lcom/zykj/subscriber/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static final W(Lcom/zykj/subscriber/MainActivity;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget v0, Lc2/u;->n:I

    invoke-virtual {p0, v0}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/zykj/subscriber/MainActivity;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 2
    iget-object p0, p0, Lcom/zykj/subscriber/MainActivity;->h:Ljava/lang/String;

    const-string v0, "loadUrl -> "

    invoke-static {v0, p0}, Lkotlin/jvm/internal/l;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "OkHttp"

    invoke-static {v0, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private final X()V
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetJavaScriptEnabled"
        }
    .end annotation

    .line 1
    sget v0, Lc2/u;->j:I

    invoke-virtual {p0, v0}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setEnabled(Z)V

    .line 2
    sget v0, Lc2/u;->n:I

    invoke-virtual {p0, v0}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/webkit/WebView;

    invoke-virtual {v2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 3
    invoke-virtual {p0, v0}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/webkit/WebView;

    sget-object v4, Lc2/h;->a:Lc2/h;

    invoke-virtual {v2, v4}, Landroid/webkit/WebView;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 4
    invoke-virtual {p0, v0}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/webkit/WebView;

    sget-object v4, Lc2/g;->a:Lc2/g;

    invoke-virtual {v2, v4}, Landroid/webkit/WebView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 5
    invoke-static {v3}, Landroid/webkit/WebView;->setWebContentsDebuggingEnabled(Z)V

    .line 6
    invoke-virtual {p0, v0}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/webkit/WebView;

    new-instance v4, Lcom/zykj/subscriber/MainActivity$b;

    invoke-direct {v4, p0}, Lcom/zykj/subscriber/MainActivity$b;-><init>(Lcom/zykj/subscriber/MainActivity;)V

    const-string v5, "JsToJava"

    invoke-virtual {v2, v4, v5}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-virtual {p0, v0}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/webkit/WebView;

    invoke-virtual {v2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 8
    invoke-virtual {p0, v0}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/webkit/WebView;

    invoke-virtual {v2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setAppCacheEnabled(Z)V

    .line 9
    invoke-virtual {p0, v0}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/webkit/WebView;

    invoke-virtual {v2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v2

    invoke-virtual {p0}, Landroid/app/Activity;->getCacheDir()Ljava/io/File;

    move-result-object v4

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/webkit/WebSettings;->setAppCachePath(Ljava/lang/String;)V

    .line 10
    invoke-virtual {p0, v0}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/webkit/WebView;

    invoke-virtual {v2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    .line 11
    invoke-virtual {p0, v0}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/webkit/WebView;

    invoke-virtual {v2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/webkit/WebSettings;->setSupportMultipleWindows(Z)V

    const-string v1, "window"

    .line 12
    invoke-virtual {p0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type android.view.WindowManager"

    invoke-static {v1, v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v1, Landroid/view/WindowManager;

    .line 13
    new-instance v2, Landroid/util/DisplayMetrics;

    invoke-direct {v2}, Landroid/util/DisplayMetrics;-><init>()V

    .line 14
    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/view/Display;->getRealMetrics(Landroid/util/DisplayMetrics;)V

    .line 15
    iget v1, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-double v1, v1

    const/16 v3, 0x64

    int-to-double v3, v3

    mul-double v1, v1, v3

    const/16 v3, 0x4e2

    int-to-double v3, v3

    div-double/2addr v1, v3

    .line 16
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-int v1, v1

    .line 17
    invoke-virtual {p0, v0}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/webkit/WebView;

    invoke-virtual {v2, v1}, Landroid/webkit/WebView;->setInitialScale(I)V

    .line 18
    invoke-virtual {p0, v0}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/webkit/WebView;

    new-instance v2, Lcom/zykj/subscriber/MainActivity$i;

    invoke-direct {v2, p0}, Lcom/zykj/subscriber/MainActivity$i;-><init>(Lcom/zykj/subscriber/MainActivity;)V

    invoke-virtual {v1, v2}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 19
    invoke-virtual {p0, v0}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    new-instance v1, Lcom/zykj/subscriber/MainActivity$j;

    invoke-direct {v1, p0}, Lcom/zykj/subscriber/MainActivity$j;-><init>(Lcom/zykj/subscriber/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    return-void
.end method

.method private static final Y(Landroid/view/View;)Z
    .locals 0

    const/4 p0, 0x1

    return p0
.end method

.method private static final Z(Landroid/view/View;)V
    .locals 0

    return-void
.end method

# RE I/O 读取字符串偏好（SharedPreferences.getString）。
.method private final a0()V
    .locals 3

    .line 1
    invoke-static {p0}, Ll2/b;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "SP_WHITE_URL_JSON"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    if-nez v1, :cond_2

    .line 3
    sget-object v1, Lcom/zykj/subscriber/MainActivity;->u:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 4
    sget-object v1, Lcom/zykj/subscriber/MainActivity;->u:Ljava/util/ArrayList;

    invoke-direct {p0, v0}, Lcom/zykj/subscriber/MainActivity;->M(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_2
    return-void
.end method

.method private final b0()V
    .locals 1

    iget-object v0, p0, Lcom/zykj/subscriber/MainActivity;->e:Lj2/b;

    if-nez v0, :cond_0

    const-string v0, "mainPresenter"

    invoke-static {v0}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lj2/b;->f()V

    return-void
.end method

.method private final c0()V
    .locals 6

    invoke-static {p0}, Landroidx/lifecycle/m;->a(Landroidx/lifecycle/l;)Landroidx/lifecycle/g;

    move-result-object v0

    new-instance v3, Lcom/zykj/subscriber/MainActivity$l;

    const/4 v1, 0x0

    invoke-direct {v3, p0, v1}, Lcom/zykj/subscriber/MainActivity$l;-><init>(Lcom/zykj/subscriber/MainActivity;Lq2/d;)V

    const/4 v2, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lf3/g;->d(Lf3/h0;Lq2/g;Lf3/j0;Lx2/p;ILjava/lang/Object;)Lf3/m1;

    return-void
.end method

.method private final d0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/zykj/subscriber/MainActivity;->q:Landroidx/appcompat/app/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    if-nez v0, :cond_2

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    if-eqz v0, :cond_5

    .line 3
    :cond_3
    new-instance v0, Landroidx/appcompat/app/b$a;

    invoke-direct {v0, p0}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;)V

    const-string v2, "\u63d0\u793a"

    .line 4
    invoke-virtual {v0, v2}, Landroidx/appcompat/app/b$a;->setTitle(Ljava/lang/CharSequence;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    const-string v2, "\u7528\u6237\u8eab\u4efd\u8fc7\u671f\uff0c\u8bf7\u91cd\u65b0\u767b\u5f55"

    .line 5
    invoke-virtual {v0, v2}, Landroidx/appcompat/app/b$a;->setMessage(Ljava/lang/CharSequence;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    .line 6
    invoke-virtual {v0, v1}, Landroidx/appcompat/app/b$a;->setCancelable(Z)Landroidx/appcompat/app/b$a;

    move-result-object v0

    .line 7
    new-instance v1, Lc2/f;

    invoke-direct {v1, p0}, Lc2/f;-><init>(Lcom/zykj/subscriber/MainActivity;)V

    const-string v2, "\u6211\u77e5\u9053\u4e86"

    invoke-virtual {v0, v2, v1}, Landroidx/appcompat/app/b$a;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroidx/appcompat/app/b$a;->create()Landroidx/appcompat/app/b;

    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/zykj/subscriber/MainActivity;->q:Landroidx/appcompat/app/b;

    if-nez v0, :cond_4

    goto :goto_1

    .line 10
    :cond_4
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    :cond_5
    :goto_1
    return-void
.end method

.method private static final e0(Lcom/zykj/subscriber/MainActivity;Landroid/content/DialogInterface;I)V
    .locals 6

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lcom/zykj/subscriber/MainActivity;->q:Landroidx/appcompat/app/b;

    .line 3
    invoke-static {p0}, Landroidx/lifecycle/m;->a(Landroidx/lifecycle/l;)Landroidx/lifecycle/g;

    move-result-object v0

    new-instance v3, Lcom/zykj/subscriber/MainActivity$m;

    invoke-direct {v3, p0, p1}, Lcom/zykj/subscriber/MainActivity$m;-><init>(Lcom/zykj/subscriber/MainActivity;Lq2/d;)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lf3/g;->d(Lf3/h0;Lq2/g;Lf3/j0;Lx2/p;ILjava/lang/Object;)Lf3/m1;

    return-void
.end method

.method public static synthetic g(Landroid/view/View;)Z
    .locals 0

    invoke-static {p0}, Lcom/zykj/subscriber/MainActivity;->Y(Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static synthetic h(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lcom/zykj/subscriber/MainActivity;->Z(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic i(Lcom/zykj/subscriber/MainActivity;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/zykj/subscriber/MainActivity;->e0(Lcom/zykj/subscriber/MainActivity;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic j(Lcom/zykj/subscriber/MainActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/zykj/subscriber/MainActivity;->W(Lcom/zykj/subscriber/MainActivity;)V

    return-void
.end method

.method public static synthetic k(Lcom/zykj/subscriber/MainActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/zykj/subscriber/MainActivity;->U(Lcom/zykj/subscriber/MainActivity;)V

    return-void
.end method

.method public static final synthetic m(Lcom/zykj/subscriber/MainActivity;Ljava/lang/String;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/zykj/subscriber/MainActivity;->H(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic n(Lcom/zykj/subscriber/MainActivity;Ljava/lang/String;Lx2/l;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/zykj/subscriber/MainActivity;->K(Ljava/lang/String;Lx2/l;)V

    return-void
.end method

.method public static final synthetic o(Lcom/zykj/subscriber/MainActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/zykj/subscriber/MainActivity;->h:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic p(Lcom/zykj/subscriber/MainActivity;)Lt1/a;
    .locals 0

    iget-object p0, p0, Lcom/zykj/subscriber/MainActivity;->d:Lt1/a;

    return-object p0
.end method

.method public static final synthetic q(Lcom/zykj/subscriber/MainActivity;)Lj2/b;
    .locals 0

    iget-object p0, p0, Lcom/zykj/subscriber/MainActivity;->e:Lj2/b;

    return-object p0
.end method

.method public static final synthetic r(Lcom/zykj/subscriber/MainActivity;)Lcom/zykj/subscriber/update/c;
    .locals 0

    iget-object p0, p0, Lcom/zykj/subscriber/MainActivity;->p:Lcom/zykj/subscriber/update/c;

    return-object p0
.end method

.method public static final synthetic s(Lcom/zykj/subscriber/MainActivity;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Lcom/zykj/subscriber/MainActivity;->f:Landroid/view/View;

    return-object p0
.end method

.method public static final synthetic t(Lcom/zykj/subscriber/MainActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/zykj/subscriber/MainActivity;->N()V

    return-void
.end method

.method public static final synthetic u(Lcom/zykj/subscriber/MainActivity;Lcom/zykj/message/server/bean/UserInfo;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/zykj/subscriber/MainActivity;->O(Lcom/zykj/message/server/bean/UserInfo;)V

    return-void
.end method

.method public static final synthetic v(Lcom/zykj/subscriber/MainActivity;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/zykj/subscriber/MainActivity;->P(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic w(Lcom/zykj/subscriber/MainActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/zykj/subscriber/MainActivity;->V()V

    return-void
.end method

.method public static final synthetic x(Lcom/zykj/subscriber/MainActivity;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/zykj/subscriber/MainActivity;->j:Z

    return p0
.end method

.method public static final synthetic y(Lcom/zykj/subscriber/MainActivity;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/zykj/subscriber/MainActivity;->m:Z

    return p0
.end method

.method public static final synthetic z(Lcom/zykj/subscriber/MainActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/zykj/subscriber/MainActivity;->b0()V

    return-void
.end method


# virtual methods
.method public final L(Ljava/lang/String;)Ljava/lang/String;
    .locals 11
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x23

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    .line 1
    invoke-static {p1, v0, v1, v2, v3}, Le3/l;->G(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v0

    const-string v4, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    if-eqz v0, :cond_0

    const/16 v6, 0x23

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x6

    const/4 v10, 0x0

    move-object v5, p1

    .line 2
    invoke-static/range {v5 .. v10}, Le3/l;->T(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v0

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v4}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    const/16 v0, 0x3f

    .line 3
    invoke-static {p1, v0, v1, v2, v3}, Le3/l;->G(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v6, 0x3f

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x6

    const/4 v10, 0x0

    move-object v5, p1

    .line 4
    invoke-static/range {v5 .. v10}, Le3/l;->T(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v0

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v4}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    return-object p1
.end method

.method public a(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "\u767d\u540d\u5355\u8bf7\u6c42\u5931\u8d25\uff0c"

    .line 1
    invoke-static {v0, p1}, Lkotlin/jvm/internal/l;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "MainActivity"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/subscriber/BaseActivity;->f(Ljava/lang/String;)V

    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/zykj/subscriber/MainActivity;->u:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 2
    sget-object v0, Lcom/zykj/subscriber/MainActivity;->u:Ljava/util/ArrayList;

    invoke-direct {p0, p1}, Lcom/zykj/subscriber/MainActivity;->M(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    const-string p1, "MainActivity"

    const-string v0, "\u767d\u540d\u5355\u8bf7\u6c42\u6210\u529f\u3002\u3002"

    .line 3
    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    iget-object p1, p0, Lcom/zykj/subscriber/MainActivity;->i:Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/zykj/subscriber/MainActivity;->H(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lcom/zykj/subscriber/MainActivity;->j:Z

    .line 6
    sget p1, Lc2/u;->n:I

    invoke-virtual {p0, p1}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/webkit/WebView;

    iget-object v0, p0, Lcom/zykj/subscriber/MainActivity;->h:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public e()V
    .locals 1

    .line 1
    invoke-static {p0}, Lx0/w;->e(Landroid/content/Context;)Lx0/w;

    move-result-object v0

    invoke-virtual {v0}, Lx0/w;->a()Lx0/q;

    .line 2
    new-instance v0, Lj2/b;

    invoke-direct {v0, p0, p0}, Lj2/b;-><init>(Landroid/content/Context;Lg2/b;)V

    iput-object v0, p0, Lcom/zykj/subscriber/MainActivity;->e:Lj2/b;

    .line 3
    new-instance v0, Lcom/zykj/subscriber/update/c;

    invoke-direct {v0, p0}, Lcom/zykj/subscriber/update/c;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/zykj/subscriber/MainActivity;->p:Lcom/zykj/subscriber/update/c;

    .line 4
    invoke-direct {p0}, Lcom/zykj/subscriber/MainActivity;->S()V

    .line 5
    invoke-direct {p0}, Lcom/zykj/subscriber/MainActivity;->a0()V

    .line 6
    invoke-direct {p0}, Lcom/zykj/subscriber/MainActivity;->R()V

    return-void
.end method

.method public initView()V
    .locals 2

    const/4 v0, 0x4

    new-array v0, v0, [I

    .line 1
    fill-array-data v0, :array_0

    invoke-virtual {p0, v0}, Lcom/zykj/subscriber/BaseActivity;->d([I)V

    .line 2
    sget v0, Lc2/u;->j:I

    invoke-virtual {p0, v0}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    new-instance v1, Lc2/i;

    invoke-direct {v1, p0}, Lc2/i;-><init>(Lcom/zykj/subscriber/MainActivity;)V

    invoke-virtual {v0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$j;)V

    .line 3
    sget v0, Lc2/u;->g:I

    invoke-virtual {p0, v0}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 4
    sget v0, Lc2/u;->f:I

    invoke-virtual {p0, v0}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 5
    sget v0, Lc2/u;->b:I

    invoke-virtual {p0, v0}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setLongClickable(Z)V

    .line 6
    invoke-direct {p0}, Lcom/zykj/subscriber/MainActivity;->X()V

    return-void

    nop

    :array_0
    .array-data 4
        0x7f090130
        0x7f090134
        0x7f090135
        0x7f090139
    .end array-data
.end method

.method public l(I)Landroid/view/View;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/zykj/subscriber/MainActivity;->c:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-nez v1, :cond_1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_0
    return-object v1
.end method

.method public onBackPressed()V
    .locals 2

    .line 1
    sget v0, Lc2/u;->n:I

    invoke-virtual {p0, v0}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/webkit/WebView;

    invoke-virtual {v1}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2
    invoke-virtual {p0, v0}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V

    goto :goto_0

    .line 3
    :cond_0
    invoke-super {p0}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    :goto_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    # RE layout layout/activity_main (0x7f0c001d), APK res/R5.xml
    const p1, 0x7f0c001d

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/subscriber/BaseActivity;->setContentView(I)V

    .line 3
    invoke-direct {p0}, Lcom/zykj/subscriber/MainActivity;->I()V

    .line 4
    invoke-direct {p0}, Lcom/zykj/subscriber/MainActivity;->c0()V

    return-void
.end method

.method protected onDestroy()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/subscriber/MainActivity;->q:Landroidx/appcompat/app/b;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/appcompat/app/e;->dismiss()V

    :goto_0
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/zykj/subscriber/MainActivity;->q:Landroidx/appcompat/app/b;

    .line 3
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onDestroy()V

    .line 4
    sget v1, Lc2/u;->m:I

    invoke-virtual {p0, v1}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 5
    sget v1, Lc2/u;->n:I

    invoke-virtual {p0, v1}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/webkit/WebView;

    const-string v3, "about:blank"

    invoke-virtual {v2, v3}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 6
    invoke-virtual {p0, v1}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/webkit/WebView;

    invoke-virtual {v2}, Landroid/webkit/WebView;->stopLoading()V

    .line 7
    invoke-virtual {p0, v1}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/webkit/WebView;

    invoke-virtual {v2, v0}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 8
    invoke-virtual {p0, v1}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/webkit/WebView;

    invoke-virtual {v1}, Landroid/webkit/WebView;->destroy()V

    .line 9
    invoke-direct {p0}, Lcom/zykj/subscriber/MainActivity;->J()V

    .line 10
    iget-object v1, p0, Lcom/zykj/subscriber/MainActivity;->o:Lcom/zykj/subscriber/receiver/AliMessageReceiver;

    invoke-virtual {p0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 11
    iget-object v1, p0, Lcom/zykj/subscriber/MainActivity;->s:Landroid/app/ProgressDialog;

    if-nez v1, :cond_1

    goto :goto_3

    :cond_1
    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_2

    goto :goto_1

    .line 12
    :cond_2
    invoke-virtual {v1}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result v1

    if-ne v1, v3, :cond_3

    const/4 v2, 0x1

    :cond_3
    :goto_1
    if-eqz v2, :cond_5

    .line 13
    iget-object v1, p0, Lcom/zykj/subscriber/MainActivity;->s:Landroid/app/ProgressDialog;

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {v1}, Landroid/app/ProgressDialog;->dismiss()V

    .line 14
    :cond_5
    :goto_2
    iput-object v0, p0, Lcom/zykj/subscriber/MainActivity;->s:Landroid/app/ProgressDialog;

    :goto_3
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1
    .param p2    # Landroid/view/KeyEvent;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 1
    iget-object v0, p0, Lcom/zykj/subscriber/MainActivity;->f:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/zykj/subscriber/MainActivity;->N()V

    const/4 p1, 0x1

    return p1

    .line 3
    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method protected onResume()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    .line 2
    invoke-direct {p0}, Lcom/zykj/subscriber/MainActivity;->Q()V

    .line 3
    invoke-direct {p0}, Lcom/zykj/subscriber/MainActivity;->T()V

    return-void
.end method

.method public onViewClick(Landroid/view/View;)V
    .locals 4
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 1
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    :goto_0
    const v0, 0x7f090130

    if-nez p1, :cond_1

    goto :goto_1

    .line 2
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v0, :cond_2

    .line 3
    sget p1, Lc2/u;->n:I

    invoke-virtual {p0, p1}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 4
    invoke-virtual {p0, p1}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/webkit/WebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->goBack()V

    goto/16 :goto_4

    :cond_2
    :goto_1
    const v0, 0x7f090134

    if-nez p1, :cond_3

    goto :goto_2

    .line 5
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v0, :cond_4

    .line 6
    sget p1, Lc2/u;->n:I

    invoke-virtual {p0, p1}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoForward()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 7
    invoke-virtual {p0, p1}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/webkit/WebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->goForward()V

    goto :goto_4

    :cond_4
    :goto_2
    const v0, 0x7f090139

    const/4 v1, 0x1

    if-nez p1, :cond_5

    goto :goto_3

    .line 8
    :cond_5
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v0, :cond_6

    .line 9
    sget-object p1, Ll2/d;->a:Ll2/d;

    const-wide/16 v2, 0x0

    invoke-virtual {p1, v2, v3}, Ll2/d;->b(J)V

    .line 10
    invoke-virtual {p0}, Landroid/app/Activity;->getCacheDir()Ljava/io/File;

    move-result-object v0

    const-string v2, "cacheDir"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ll2/d;->a(Ljava/io/File;)V

    .line 11
    sget p1, Lc2/u;->n:I

    invoke-virtual {p0, p1}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->clearCache(Z)V

    .line 12
    invoke-virtual {p0, p1}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/zykj/subscriber/MainActivity;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 13
    invoke-virtual {p0, p1}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/webkit/WebView;

    const-string v0, "javascript:window.location.reload(true)"

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_4

    :cond_6
    :goto_3
    const v0, 0x7f090135

    if-nez p1, :cond_7

    goto :goto_4

    .line 14
    :cond_7
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-ne p1, v0, :cond_8

    .line 15
    iput-boolean v1, p0, Lcom/zykj/subscriber/MainActivity;->j:Z

    .line 16
    sget p1, Lc2/u;->n:I

    invoke-virtual {p0, p1}, Lcom/zykj/subscriber/MainActivity;->l(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/webkit/WebView;

    iget-object v0, p0, Lcom/zykj/subscriber/MainActivity;->h:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :cond_8
    :goto_4
    return-void
.end method
