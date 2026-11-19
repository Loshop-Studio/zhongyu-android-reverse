.class public Lb7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb7/a$b;
    }
.end annotation


# static fields
.field public static i:J = 0x12cL


# instance fields
.field public a:Landroid/app/Application;

.field public b:Landroid/os/Handler;

.field public c:Lje/v;

.field public d:Lcom/lzy/okgo/model/HttpParams;

.field public e:Lcom/lzy/okgo/model/HttpHeaders;

.field public f:I

.field public g:Lcom/lzy/okgo/cache/CacheMode;

.field public h:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lb7/a;->b:Landroid/os/Handler;

    const/4 v0, 0x3

    .line 4
    iput v0, p0, Lb7/a;->f:I

    const-wide/16 v0, -0x1

    .line 5
    iput-wide v0, p0, Lb7/a;->h:J

    .line 6
    sget-object v0, Lcom/lzy/okgo/cache/CacheMode;->d:Lcom/lzy/okgo/cache/CacheMode;

    iput-object v0, p0, Lb7/a;->g:Lcom/lzy/okgo/cache/CacheMode;

    .line 7
    new-instance v0, Lje/v$a;

    invoke-direct {v0}, Lje/v$a;-><init>()V

    .line 8
    new-instance v1, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;

    const-string v2, "OkGo"

    invoke-direct {v1, v2}, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;-><init>(Ljava/lang/String;)V

    .line 9
    sget-object v2, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor$Level;->f:Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor$Level;

    invoke-virtual {v1, v2}, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->h(Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor$Level;)V

    .line 10
    sget-object v2, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    invoke-virtual {v1, v2}, Lcom/lzy/okgo/interceptor/HttpLoggingInterceptor;->g(Ljava/util/logging/Level;)V

    .line 11
    invoke-virtual {v0, v1}, Lje/v$a;->a(Lje/s;)Lje/v$a;

    .line 12
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/32 v2, 0xea60

    invoke-virtual {v0, v2, v3, v1}, Lje/v$a;->O(JLjava/util/concurrent/TimeUnit;)Lje/v$a;

    .line 13
    invoke-virtual {v0, v2, v3, v1}, Lje/v$a;->R(JLjava/util/concurrent/TimeUnit;)Lje/v$a;

    .line 14
    invoke-virtual {v0, v2, v3, v1}, Lje/v$a;->e(JLjava/util/concurrent/TimeUnit;)Lje/v$a;

    .line 15
    invoke-static {}, Le7/a;->b()Le7/a$c;

    move-result-object v1

    .line 16
    iget-object v2, v1, Le7/a$c;->a:Ljavax/net/ssl/SSLSocketFactory;

    iget-object v1, v1, Le7/a$c;->b:Ljavax/net/ssl/X509TrustManager;

    invoke-virtual {v0, v2, v1}, Lje/v$a;->Q(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)Lje/v$a;

    .line 17
    sget-object v1, Le7/a;->b:Ljavax/net/ssl/HostnameVerifier;

    invoke-virtual {v0, v1}, Lje/v$a;->M(Ljavax/net/ssl/HostnameVerifier;)Lje/v$a;

    .line 18
    invoke-virtual {v0}, Lje/v$a;->c()Lje/v;

    move-result-object v0

    iput-object v0, p0, Lb7/a;->c:Lje/v;

    return-void
.end method

.method public synthetic constructor <init>(Lb7/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lb7/a;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)Lcom/lzy/okgo/request/GetRequest;
    .locals 1

    .line 1
    new-instance v0, Lcom/lzy/okgo/request/GetRequest;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/lzy/okgo/request/GetRequest;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static h()Lb7/a;
    .locals 1

    .line 1
    invoke-static {}, Lb7/a$b;->a()Lb7/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method


# virtual methods
.method public b()Lcom/lzy/okgo/cache/CacheMode;
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/a;->g:Lcom/lzy/okgo/cache/CacheMode;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lb7/a;->h:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public d()Lcom/lzy/okgo/model/HttpHeaders;
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/a;->e:Lcom/lzy/okgo/model/HttpHeaders;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()Lcom/lzy/okgo/model/HttpParams;
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/a;->d:Lcom/lzy/okgo/model/HttpParams;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()Landroid/content/Context;
    .locals 2

    .line 1
    iget-object v0, p0, Lb7/a;->a:Landroid/app/Application;

    .line 2
    .line 3
    const-string v1, "please call OkGo.getInstance().init() first in application!"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lf7/a;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lb7/a;->a:Landroid/app/Application;

    .line 9
    .line 10
    return-object v0
.end method

.method public g()Landroid/os/Handler;
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/a;->b:Landroid/os/Handler;

    .line 2
    .line 3
    return-object v0
.end method

.method public i()Lje/v;
    .locals 2

    .line 1
    iget-object v0, p0, Lb7/a;->c:Lje/v;

    .line 2
    .line 3
    const-string v1, "please call OkGo.getInstance().setOkHttpClient() first in application!"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lf7/a;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lb7/a;->c:Lje/v;

    .line 9
    .line 10
    return-object v0
.end method

.method public j()I
    .locals 1

    .line 1
    iget v0, p0, Lb7/a;->f:I

    .line 2
    .line 3
    return v0
.end method

.method public k(Landroid/app/Application;)Lb7/a;
    .locals 0

    .line 1
    iput-object p1, p0, Lb7/a;->a:Landroid/app/Application;

    .line 2
    .line 3
    return-object p0
.end method
