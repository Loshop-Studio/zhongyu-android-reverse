.class public final Le/q/g/b;
.super Le/q/g/h;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/q/g/b$b;,
        Le/q/g/b$a;
    }
.end annotation


# static fields
.field public static final e:Z

.field public static final f:Le/q/g/b$a;


# instance fields
.field public final d:Le/q/g/i/h;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Le/q/g/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le/q/g/b$a;-><init>(Ld/f/b/c;)V

    sput-object v0, Le/q/g/b;->f:Le/q/g/b$a;

    sget-object v0, Le/q/g/h;->c:Le/q/g/h$a;

    invoke-virtual {v0}, Le/q/g/h$a;->a()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-lt v0, v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    :goto_0
    sput-boolean v1, Le/q/g/b;->e:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    invoke-direct {p0}, Le/q/g/h;-><init>()V

    const/4 v0, 0x4

    new-array v0, v0, [Le/q/g/i/k;

    sget-object v1, Le/q/g/i/l;->d:Le/q/g/i/l$a;

    const-string v1, "com.android.org.conscrypt"

    const-string v2, "packageName"

    .line 1
    invoke-static {v1, v2}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    :try_start_0
    const-string v3, "com.android.org.conscrypt.OpenSSLSocketImpl"

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".OpenSSLSocketFactoryImpl"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v4, "com.android.org.conscrypt.SSLParametersImpl"

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    new-instance v5, Le/q/g/i/l;

    const-string v6, "paramsClass"

    invoke-static {v4, v6}, Ld/f/b/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v5, v3, v1, v4}, Le/q/g/i/l;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 2
    sget-object v3, Le/q/g/h;->a:Le/q/g/h;

    const/4 v4, 0x5

    const-string v5, "unable to load android socket classes"

    .line 3
    invoke-virtual {v3, v5, v4, v1}, Le/q/g/h;->c(Ljava/lang/String;ILjava/lang/Throwable;)V

    move-object v5, v2

    :goto_0
    const/4 v1, 0x0

    aput-object v5, v0, v1

    .line 4
    new-instance v3, Le/q/g/i/j;

    sget-object v4, Le/q/g/i/f;->c:Le/q/g/i/f$a;

    .line 5
    sget-object v4, Le/q/g/i/f;->b:Le/q/g/i/j$a;

    .line 6
    invoke-direct {v3, v4}, Le/q/g/i/j;-><init>(Le/q/g/i/j$a;)V

    const/4 v4, 0x1

    aput-object v3, v0, v4

    const/4 v3, 0x2

    new-instance v5, Le/q/g/i/j;

    sget-object v6, Le/q/g/i/i;->a:Le/q/g/i/j$a;

    invoke-direct {v5, v6}, Le/q/g/i/j;-><init>(Le/q/g/i/j$a;)V

    aput-object v5, v0, v3

    const/4 v3, 0x3

    new-instance v5, Le/q/g/i/j;

    sget-object v6, Le/q/g/i/g;->a:Le/q/g/i/j$a;

    invoke-direct {v5, v6}, Le/q/g/i/j;-><init>(Le/q/g/i/j$a;)V

    aput-object v5, v0, v3

    invoke-static {v0}, Ld/e/e;->c([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Le/q/g/i/k;

    invoke-interface {v6}, Le/q/g/i/k;->a()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    :try_start_1
    const-string v0, "dalvik.system.CloseGuard"

    .line 7
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v3, "get"

    new-array v5, v1, [Ljava/lang/Class;

    invoke-virtual {v0, v3, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    const-string v5, "open"

    new-array v4, v4, [Ljava/lang/Class;

    const-class v6, Ljava/lang/String;

    aput-object v6, v4, v1

    invoke-virtual {v0, v5, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    const-string v5, "warnIfOpen"

    new-array v1, v1, [Ljava/lang/Class;

    invoke-virtual {v0, v5, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object v0, v2

    move-object v2, v3

    goto :goto_2

    :catch_1
    move-object v0, v2

    move-object v4, v0

    :goto_2
    new-instance v1, Le/q/g/i/h;

    invoke-direct {v1, v2, v4, v0}, Le/q/g/i/h;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    .line 8
    iput-object v1, p0, Le/q/g/b;->d:Le/q/g/i/h;

    return-void
.end method


# virtual methods
.method public a(Ljavax/net/ssl/X509TrustManager;)Le/q/i/c;
    .locals 2

    const-string v0, "trustManager"

    invoke-static {p1, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p1, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Landroid/net/http/X509TrustManagerExtensions;

    invoke-direct {v1, p1}, Landroid/net/http/X509TrustManagerExtensions;-><init>(Ljavax/net/ssl/X509TrustManager;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_0

    new-instance v0, Le/q/g/i/b;

    invoke-direct {v0, p1, v1}, Le/q/g/i/b;-><init>(Ljavax/net/ssl/X509TrustManager;Landroid/net/http/X509TrustManagerExtensions;)V

    :cond_0
    if-eqz v0, :cond_1

    goto :goto_1

    .line 2
    :cond_1
    invoke-super {p0, p1}, Le/q/g/h;->a(Ljavax/net/ssl/X509TrustManager;)Le/q/i/c;

    move-result-object v0

    :goto_1
    return-object v0
.end method

.method public b(Ljavax/net/ssl/X509TrustManager;)Le/q/i/d;
    .locals 6

    const-string v0, "trustManager"

    invoke-static {p1, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "findTrustAnchorByIssuerAndSignature"

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Class;

    const/4 v4, 0x0

    const-class v5, Ljava/security/cert/X509Certificate;

    aput-object v5, v3, v4

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const-string v1, "method"

    invoke-static {v0, v1}, Ld/f/b/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    new-instance v1, Le/q/g/b$b;

    invoke-direct {v1, p1, v0}, Le/q/g/b$b;-><init>(Ljavax/net/ssl/X509TrustManager;Ljava/lang/reflect/Method;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-super {p0, p1}, Le/q/g/h;->b(Ljavax/net/ssl/X509TrustManager;)Le/q/i/d;

    move-result-object v1

    :goto_0
    return-object v1
.end method
