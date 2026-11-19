.class public Lcom/alibaba/sdk/android/logger/LogBuilder;
.super Ljava/lang/Object;


# instance fields
.field private instanceObject:Ljava/lang/Object;

.field private logInterceptors:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/alibaba/sdk/android/logger/interceptor/ILogInterceptor;",
            ">;"
        }
    .end annotation
.end field

.field private loggerInterceptors:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/alibaba/sdk/android/logger/interceptor/c;",
            ">;"
        }
    .end annotation
.end field

.field private originInterceptorManager:Lcom/alibaba/sdk/android/logger/interceptor/InterceptorManager;

.field private tagGenerator:Lcom/alibaba/sdk/android/logger/b/g;


# direct methods
.method public constructor <init>(Lcom/alibaba/sdk/android/logger/interceptor/InterceptorManager;Ljava/lang/Object;Lcom/alibaba/sdk/android/logger/b/g;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/alibaba/sdk/android/logger/LogBuilder;->logInterceptors:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/alibaba/sdk/android/logger/LogBuilder;->loggerInterceptors:Ljava/util/ArrayList;

    iput-object p1, p0, Lcom/alibaba/sdk/android/logger/LogBuilder;->originInterceptorManager:Lcom/alibaba/sdk/android/logger/interceptor/InterceptorManager;

    iput-object p2, p0, Lcom/alibaba/sdk/android/logger/LogBuilder;->instanceObject:Ljava/lang/Object;

    iput-object p3, p0, Lcom/alibaba/sdk/android/logger/LogBuilder;->tagGenerator:Lcom/alibaba/sdk/android/logger/b/g;

    return-void
.end method


# virtual methods
.method public addLogInterceptor(Lcom/alibaba/sdk/android/logger/interceptor/ILogInterceptor;)Lcom/alibaba/sdk/android/logger/LogBuilder;
    .locals 1

    iget-object v0, p0, Lcom/alibaba/sdk/android/logger/LogBuilder;->logInterceptors:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public addLoggerInterceptor(Lcom/alibaba/sdk/android/logger/interceptor/c;)Lcom/alibaba/sdk/android/logger/LogBuilder;
    .locals 1

    iget-object v0, p0, Lcom/alibaba/sdk/android/logger/LogBuilder;->loggerInterceptors:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public build()Lcom/alibaba/sdk/android/logger/ILog;
    .locals 6

    iget-object v0, p0, Lcom/alibaba/sdk/android/logger/LogBuilder;->originInterceptorManager:Lcom/alibaba/sdk/android/logger/interceptor/InterceptorManager;

    invoke-virtual {v0}, Lcom/alibaba/sdk/android/logger/interceptor/InterceptorManager;->a()Lcom/alibaba/sdk/android/logger/interceptor/InterceptorManager;

    move-result-object v0

    iget-object v1, p0, Lcom/alibaba/sdk/android/logger/LogBuilder;->logInterceptors:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_0

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v4, v4, 0x1

    check-cast v5, Lcom/alibaba/sdk/android/logger/interceptor/ILogInterceptor;

    invoke-virtual {v0, v5}, Lcom/alibaba/sdk/android/logger/interceptor/InterceptorManager;->a(Lcom/alibaba/sdk/android/logger/interceptor/ILogInterceptor;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/alibaba/sdk/android/logger/LogBuilder;->loggerInterceptors:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    :goto_1
    if-ge v3, v2, :cond_1

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v3, v3, 0x1

    check-cast v4, Lcom/alibaba/sdk/android/logger/interceptor/c;

    invoke-virtual {v0, v4}, Lcom/alibaba/sdk/android/logger/interceptor/InterceptorManager;->a(Lcom/alibaba/sdk/android/logger/interceptor/c;)V

    goto :goto_1

    :cond_1
    new-instance v1, Lcom/alibaba/sdk/android/logger/b/f;

    iget-object v2, p0, Lcom/alibaba/sdk/android/logger/LogBuilder;->tagGenerator:Lcom/alibaba/sdk/android/logger/b/g;

    iget-object v3, p0, Lcom/alibaba/sdk/android/logger/LogBuilder;->instanceObject:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Lcom/alibaba/sdk/android/logger/b/g;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lcom/alibaba/sdk/android/logger/b/f;-><init>(Ljava/lang/String;Lcom/alibaba/sdk/android/logger/interceptor/InterceptorManager;)V

    return-object v1
.end method
