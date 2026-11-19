.class public final Lcom/zykj/huiwei/launcher/providers/OkHttpClientProvide_ProvideHeaderBeanFlowFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La5/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/huiwei/launcher/providers/OkHttpClientProvide_ProvideHeaderBeanFlowFactory$InstanceHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "La5/f;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static create()Lcom/zykj/huiwei/launcher/providers/OkHttpClientProvide_ProvideHeaderBeanFlowFactory;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/providers/OkHttpClientProvide_ProvideHeaderBeanFlowFactory$InstanceHolder;->INSTANCE:Lcom/zykj/huiwei/launcher/providers/OkHttpClientProvide_ProvideHeaderBeanFlowFactory;

    .line 2
    .line 3
    return-object v0
.end method

.method public static provideHeaderBeanFlow()Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/zykj/http/bean/HeaderBean;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/providers/OkHttpClientProvide;->INSTANCE:Lcom/zykj/huiwei/launcher/providers/OkHttpClientProvide;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/providers/OkHttpClientProvide;->provideHeaderBeanFlow()Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, La5/e;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 12
    .line 13
    return-object v0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/providers/OkHttpClientProvide_ProvideHeaderBeanFlowFactory;->get()Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v0

    return-object v0
.end method

.method public get()Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/zykj/http/bean/HeaderBean;",
            ">;"
        }
    .end annotation

    .line 2
    invoke-static {}, Lcom/zykj/huiwei/launcher/providers/OkHttpClientProvide_ProvideHeaderBeanFlowFactory;->provideHeaderBeanFlow()Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v0

    return-object v0
.end method
