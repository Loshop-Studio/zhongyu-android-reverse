.class public Le/q/g/h;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/q/g/h$a;
    }
.end annotation


# static fields
.field public static volatile a:Le/q/g/h;

.field public static final b:Ljava/util/logging/Logger;

.field public static final c:Le/q/g/h$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 12

    new-instance v0, Le/q/g/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le/q/g/h$a;-><init>(Ld/f/b/c;)V

    sput-object v0, Le/q/g/h;->c:Le/q/g/h$a;

    .line 1
    invoke-virtual {v0}, Le/q/g/h$a;->a()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_7

    .line 2
    sget-object v0, Le/q/g/i/c;->c:Le/q/g/i/c;

    .line 3
    sget-object v0, Le/q/g/i/c;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 4
    invoke-static {v4}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v4

    sget-object v5, Le/q/g/i/c;->a:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v5, v4}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const-string v5, "logger"

    invoke-static {v4, v5}, Ld/f/b/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/util/logging/Logger;->setUseParentHandlers(Z)V

    const/4 v5, 0x3

    invoke-static {v3, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v5

    if-eqz v5, :cond_1

    sget-object v3, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    goto :goto_1

    :cond_1
    const/4 v5, 0x4

    invoke-static {v3, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_2

    sget-object v3, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    goto :goto_1

    :cond_2
    sget-object v3, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    :goto_1
    invoke-virtual {v4, v3}, Ljava/util/logging/Logger;->setLevel(Ljava/util/logging/Level;)V

    sget-object v3, Le/q/g/i/d;->a:Le/q/g/i/d;

    invoke-virtual {v4, v3}, Ljava/util/logging/Logger;->addHandler(Ljava/util/logging/Handler;)V

    goto :goto_0

    .line 5
    :cond_3
    sget-object v0, Le/q/g/a;->e:Le/q/g/a;

    .line 6
    sget-boolean v0, Le/q/g/a;->d:Z

    if-eqz v0, :cond_4

    .line 7
    new-instance v0, Le/q/g/a;

    invoke-direct {v0}, Le/q/g/a;-><init>()V

    goto :goto_2

    :cond_4
    move-object v0, v1

    :goto_2
    if-eqz v0, :cond_5

    goto/16 :goto_9

    .line 8
    :cond_5
    sget-object v0, Le/q/g/b;->f:Le/q/g/b$a;

    .line 9
    sget-boolean v0, Le/q/g/b;->e:Z

    if-eqz v0, :cond_6

    .line 10
    new-instance v1, Le/q/g/b;

    invoke-direct {v1}, Le/q/g/b;-><init>()V

    .line 11
    :cond_6
    invoke-static {v1}, Ld/f/b/d;->c(Ljava/lang/Object;)V

    :goto_3
    move-object v0, v1

    goto/16 :goto_9

    .line 12
    :cond_7
    invoke-static {}, Ljava/security/Security;->getProviders()[Ljava/security/Provider;

    move-result-object v0

    aget-object v0, v0, v2

    const-string v3, "Security.getProviders()[0]"

    invoke-static {v0, v3}, Ld/f/b/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/security/Provider;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v4, "Conscrypt"

    invoke-static {v4, v0}, Ld/f/b/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 13
    sget-object v0, Le/q/g/d;->f:Le/q/g/d$a;

    .line 14
    sget-boolean v0, Le/q/g/d;->e:Z

    if-eqz v0, :cond_8

    .line 15
    new-instance v0, Le/q/g/d;

    .line 16
    invoke-direct {v0}, Le/q/g/d;-><init>()V

    goto :goto_4

    :cond_8
    move-object v0, v1

    :goto_4
    if-eqz v0, :cond_9

    goto/16 :goto_9

    .line 17
    :cond_9
    invoke-static {}, Ljava/security/Security;->getProviders()[Ljava/security/Provider;

    move-result-object v0

    aget-object v0, v0, v2

    invoke-static {v0, v3}, Ld/f/b/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/security/Provider;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v4, "BC"

    invoke-static {v4, v0}, Ld/f/b/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 18
    sget-object v0, Le/q/g/c;->f:Le/q/g/c$a;

    .line 19
    sget-boolean v0, Le/q/g/c;->e:Z

    if-eqz v0, :cond_a

    .line 20
    new-instance v0, Le/q/g/c;

    .line 21
    invoke-direct {v0}, Le/q/g/c;-><init>()V

    goto :goto_5

    :cond_a
    move-object v0, v1

    :goto_5
    if-eqz v0, :cond_b

    goto/16 :goto_9

    .line 22
    :cond_b
    invoke-static {}, Ljava/security/Security;->getProviders()[Ljava/security/Provider;

    move-result-object v0

    aget-object v0, v0, v2

    invoke-static {v0, v3}, Ld/f/b/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/security/Provider;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v3, "OpenJSSE"

    invoke-static {v3, v0}, Ld/f/b/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 23
    sget-object v0, Le/q/g/g;->f:Le/q/g/g$a;

    .line 24
    sget-boolean v0, Le/q/g/g;->e:Z

    if-eqz v0, :cond_c

    .line 25
    new-instance v0, Le/q/g/g;

    .line 26
    invoke-direct {v0}, Le/q/g/g;-><init>()V

    goto :goto_6

    :cond_c
    move-object v0, v1

    :goto_6
    if-eqz v0, :cond_d

    goto/16 :goto_9

    .line 27
    :cond_d
    sget-object v0, Le/q/g/f;->e:Le/q/g/f$a;

    .line 28
    sget-boolean v0, Le/q/g/f;->d:Z

    if-eqz v0, :cond_e

    .line 29
    new-instance v0, Le/q/g/f;

    invoke-direct {v0}, Le/q/g/f;-><init>()V

    goto :goto_7

    :cond_e
    move-object v0, v1

    :goto_7
    if-eqz v0, :cond_f

    goto/16 :goto_9

    :cond_f
    const-string v0, "java.specification.version"

    const-string v3, "unknown"

    .line 30
    invoke-static {v0, v3}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :try_start_0
    const-string v3, "jvmVersion"

    invoke-static {v0, v3}, Ld/f/b/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v3, 0x9

    if-lt v0, v3, :cond_10

    goto :goto_8

    :catch_0
    :cond_10
    const-string v0, "org.eclipse.jetty.alpn.ALPN"

    const/4 v3, 0x1

    :try_start_1
    invoke-static {v0, v3, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    const-string v4, "org.eclipse.jetty.alpn.ALPN$Provider"

    invoke-static {v4, v3, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v4

    const-string v5, "org.eclipse.jetty.alpn.ALPN$ClientProvider"

    invoke-static {v5, v3, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v10

    const-string v5, "org.eclipse.jetty.alpn.ALPN$ServerProvider"

    invoke-static {v5, v3, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v11

    const-string v5, "put"

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Class;

    const-class v7, Ljavax/net/ssl/SSLSocket;

    aput-object v7, v6, v2

    aput-object v4, v6, v3

    invoke-virtual {v0, v5, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    const-string v4, "get"

    new-array v5, v3, [Ljava/lang/Class;

    const-class v6, Ljavax/net/ssl/SSLSocket;

    aput-object v6, v5, v2

    invoke-virtual {v0, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    const-string v4, "remove"

    new-array v3, v3, [Ljava/lang/Class;

    const-class v5, Ljavax/net/ssl/SSLSocket;

    aput-object v5, v3, v2

    invoke-virtual {v0, v4, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    new-instance v0, Le/q/g/e;

    const-string v2, "putMethod"

    invoke-static {v7, v2}, Ld/f/b/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "getMethod"

    invoke-static {v8, v2}, Ld/f/b/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "removeMethod"

    invoke-static {v9, v2}, Ld/f/b/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "clientProviderClass"

    invoke-static {v10, v2}, Ld/f/b/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "serverProviderClass"

    invoke-static {v11, v2}, Ld/f/b/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, v0

    invoke-direct/range {v6 .. v11}, Le/q/g/e;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;)V
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    move-object v1, v0

    :catch_1
    :goto_8
    if-eqz v1, :cond_11

    goto/16 :goto_3

    .line 31
    :cond_11
    new-instance v0, Le/q/g/h;

    invoke-direct {v0}, Le/q/g/h;-><init>()V

    .line 32
    :goto_9
    sput-object v0, Le/q/g/h;->a:Le/q/g/h;

    const-class v0, Le/n;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Le/q/g/h;->b:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljavax/net/ssl/X509TrustManager;)Le/q/i/c;
    .locals 1

    const-string v0, "trustManager"

    invoke-static {p1, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Le/q/i/a;

    invoke-virtual {p0, p1}, Le/q/g/h;->b(Ljavax/net/ssl/X509TrustManager;)Le/q/i/d;

    move-result-object p1

    invoke-direct {v0, p1}, Le/q/i/a;-><init>(Le/q/i/d;)V

    return-object v0
.end method

.method public b(Ljavax/net/ssl/X509TrustManager;)Le/q/i/d;
    .locals 2

    const-string v0, "trustManager"

    invoke-static {p1, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Le/q/i/b;

    invoke-interface {p1}, Ljavax/net/ssl/X509TrustManager;->getAcceptedIssuers()[Ljava/security/cert/X509Certificate;

    move-result-object p1

    const-string v1, "trustManager.acceptedIssuers"

    invoke-static {p1, v1}, Ld/f/b/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v1, p1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/security/cert/X509Certificate;

    invoke-direct {v0, p1}, Le/q/i/b;-><init>([Ljava/security/cert/X509Certificate;)V

    return-object v0
.end method

.method public c(Ljava/lang/String;ILjava/lang/Throwable;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x5

    if-ne p2, v0, :cond_0

    sget-object p2, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    goto :goto_0

    :cond_0
    sget-object p2, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    :goto_0
    sget-object v0, Le/q/g/h;->b:Ljava/util/logging/Logger;

    invoke-virtual {v0, p2, p1, p3}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public d()Ljavax/net/ssl/SSLContext;
    .locals 2

    const-string v0, "TLS"

    invoke-static {v0}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    move-result-object v0

    const-string v1, "SSLContext.getInstance(\"TLS\")"

    invoke-static {v0, v1}, Ld/f/b/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public e(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;
    .locals 3

    const-string v0, "trustManager"

    invoke-static {p1, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0}, Le/q/g/h;->d()Ljavax/net/ssl/SSLContext;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljavax/net/ssl/TrustManager;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x0

    invoke-virtual {v0, p1, v1, p1}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object p1

    const-string v0, "newSSLContext().apply {\n\u2026ll)\n      }.socketFactory"

    invoke-static {p1, v0}, Ld/f/b/d;->d(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No System TLS: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public f()Ljavax/net/ssl/X509TrustManager;
    .locals 4

    invoke-static {}, Ljavax/net/ssl/TrustManagerFactory;->getDefaultAlgorithm()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljavax/net/ssl/TrustManagerFactory;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/TrustManagerFactory;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljavax/net/ssl/TrustManagerFactory;->init(Ljava/security/KeyStore;)V

    const-string v1, "factory"

    invoke-static {v0, v1}, Ld/f/b/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljavax/net/ssl/TrustManagerFactory;->getTrustManagers()[Ljavax/net/ssl/TrustManager;

    move-result-object v0

    invoke-static {v0}, Ld/f/b/d;->c(Ljava/lang/Object;)V

    array-length v1, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    aget-object v1, v0, v3

    instance-of v1, v1, Ljavax/net/ssl/X509TrustManager;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    if-eqz v2, :cond_1

    aget-object v0, v0, v3

    const-string v1, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager"

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, Ljavax/net/ssl/X509TrustManager;

    return-object v0

    :cond_1
    const-string v1, "Unexpected default trust managers: "

    invoke-static {v1}, Lb/a/a/a/a;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "java.util.Arrays.toString(this)"

    invoke-static {v0, v2}, Ld/f/b/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "javaClass.simpleName"

    invoke-static {v0, v1}, Ld/f/b/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
