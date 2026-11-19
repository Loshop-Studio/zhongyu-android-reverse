.class public Lcom/alibaba/sdk/android/ams/common/c/d;
.super Ljava/lang/Object;


# static fields
.field private static final a:Lcom/alibaba/sdk/android/ams/common/logger/AmsLogger;

.field private static final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "ServiceLoader"

    invoke-static {v0}, Lcom/alibaba/sdk/android/ams/common/logger/AmsLogger;->getLogger(Ljava/lang/String;)Lcom/alibaba/sdk/android/ams/common/logger/AmsLogger;

    move-result-object v0

    sput-object v0, Lcom/alibaba/sdk/android/ams/common/c/d;->a:Lcom/alibaba/sdk/android/ams/common/logger/AmsLogger;

    const-class v0, Lcom/alibaba/sdk/android/push/d/a/c;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/alibaba/sdk/android/ams/common/c/d;->b:Ljava/lang/String;

    return-void
.end method

.method public static a(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/ClassLoader;",
            ")",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    sget-object v2, Lcom/alibaba/sdk/android/ams/common/c/d;->b:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {v1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v1

    :catch_0
    move-exception p0

    goto :goto_0

    :catchall_0
    move-exception p0

    throw p0

    :goto_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fail to load ams-spi-services for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method
