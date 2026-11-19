.class public final Lcom/zykj/huiwei/launcher/providers/OkHttpClientProvide_ProvideResponseOkHttpClientFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La5/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "La5/f;"
    }
.end annotation


# instance fields
.field private final gzipRequestInterceptorProvider:La5/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La5/f;"
        }
    .end annotation
.end field

.field private final headInterceptorProvider:La5/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La5/f;"
        }
    .end annotation
.end field

.field private final networkInterceptorProvider:La5/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La5/f;"
        }
    .end annotation
.end field

.field private final responseInterceptorProvider:La5/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La5/f;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(La5/f;La5/f;La5/f;La5/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La5/f;",
            "La5/f;",
            "La5/f;",
            "La5/f;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/providers/OkHttpClientProvide_ProvideResponseOkHttpClientFactory;->networkInterceptorProvider:La5/f;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/zykj/huiwei/launcher/providers/OkHttpClientProvide_ProvideResponseOkHttpClientFactory;->headInterceptorProvider:La5/f;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/zykj/huiwei/launcher/providers/OkHttpClientProvide_ProvideResponseOkHttpClientFactory;->gzipRequestInterceptorProvider:La5/f;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/zykj/huiwei/launcher/providers/OkHttpClientProvide_ProvideResponseOkHttpClientFactory;->responseInterceptorProvider:La5/f;

    .line 11
    .line 12
    return-void
.end method

.method public static create(La5/f;La5/f;La5/f;La5/f;)Lcom/zykj/huiwei/launcher/providers/OkHttpClientProvide_ProvideResponseOkHttpClientFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La5/f;",
            "La5/f;",
            "La5/f;",
            "La5/f;",
            ")",
            "Lcom/zykj/huiwei/launcher/providers/OkHttpClientProvide_ProvideResponseOkHttpClientFactory;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/zykj/huiwei/launcher/providers/OkHttpClientProvide_ProvideResponseOkHttpClientFactory;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2, p3}, Lcom/zykj/huiwei/launcher/providers/OkHttpClientProvide_ProvideResponseOkHttpClientFactory;-><init>(La5/f;La5/f;La5/f;La5/f;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static provideResponseOkHttpClient(Lcom/zykj/http/interceptor/NetworkInterceptor;Lcom/zykj/http/interceptor/HeadInterceptor;Lcom/zykj/http/interceptor/GzipInterceptor;Lcom/zykj/http/interceptor/RefreshTokenInterceptor;)Lf5/a0;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/providers/OkHttpClientProvide;->INSTANCE:Lcom/zykj/huiwei/launcher/providers/OkHttpClientProvide;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/zykj/huiwei/launcher/providers/OkHttpClientProvide;->provideResponseOkHttpClient(Lcom/zykj/http/interceptor/NetworkInterceptor;Lcom/zykj/http/interceptor/HeadInterceptor;Lcom/zykj/http/interceptor/GzipInterceptor;Lcom/zykj/http/interceptor/RefreshTokenInterceptor;)Lf5/a0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, La5/e;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lf5/a0;

    .line 12
    .line 13
    return-object p0
.end method


# virtual methods
.method public get()Lf5/a0;
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/providers/OkHttpClientProvide_ProvideResponseOkHttpClientFactory;->networkInterceptorProvider:La5/f;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/zykj/http/interceptor/NetworkInterceptor;

    iget-object v1, p0, Lcom/zykj/huiwei/launcher/providers/OkHttpClientProvide_ProvideResponseOkHttpClientFactory;->headInterceptorProvider:La5/f;

    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/zykj/http/interceptor/HeadInterceptor;

    iget-object v2, p0, Lcom/zykj/huiwei/launcher/providers/OkHttpClientProvide_ProvideResponseOkHttpClientFactory;->gzipRequestInterceptorProvider:La5/f;

    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/zykj/http/interceptor/GzipInterceptor;

    iget-object v3, p0, Lcom/zykj/huiwei/launcher/providers/OkHttpClientProvide_ProvideResponseOkHttpClientFactory;->responseInterceptorProvider:La5/f;

    invoke-interface {v3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/zykj/http/interceptor/RefreshTokenInterceptor;

    invoke-static {v0, v1, v2, v3}, Lcom/zykj/huiwei/launcher/providers/OkHttpClientProvide_ProvideResponseOkHttpClientFactory;->provideResponseOkHttpClient(Lcom/zykj/http/interceptor/NetworkInterceptor;Lcom/zykj/http/interceptor/HeadInterceptor;Lcom/zykj/http/interceptor/GzipInterceptor;Lcom/zykj/http/interceptor/RefreshTokenInterceptor;)Lf5/a0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/providers/OkHttpClientProvide_ProvideResponseOkHttpClientFactory;->get()Lf5/a0;

    move-result-object v0

    return-object v0
.end method
