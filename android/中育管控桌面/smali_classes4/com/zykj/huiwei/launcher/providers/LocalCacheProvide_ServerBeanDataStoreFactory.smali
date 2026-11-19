# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class public final Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide_ServerBeanDataStoreFactory;
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
.field private final contextProvider:La5/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La5/f;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(La5/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La5/f;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide_ServerBeanDataStoreFactory;->contextProvider:La5/f;

    .line 5
    .line 6
    return-void
.end method

.method public static create(La5/f;)Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide_ServerBeanDataStoreFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La5/f;",
            ")",
            "Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide_ServerBeanDataStoreFactory;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide_ServerBeanDataStoreFactory;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide_ServerBeanDataStoreFactory;-><init>(La5/f;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static serverBeanDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Landroidx/datastore/core/DataStore<",
            "Lcom/zykj/huiwei/launcher/proto/a;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide;->INSTANCE:Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide;->serverBeanDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;

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
    check-cast p0, Landroidx/datastore/core/DataStore;

    .line 12
    .line 13
    return-object p0
.end method


# virtual methods
.method public get()Landroidx/datastore/core/DataStore;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/datastore/core/DataStore<",
            "Lcom/zykj/huiwei/launcher/proto/a;",
            ">;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide_ServerBeanDataStoreFactory;->contextProvider:La5/f;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide_ServerBeanDataStoreFactory;->serverBeanDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide_ServerBeanDataStoreFactory;->get()Landroidx/datastore/core/DataStore;

    move-result-object v0

    return-object v0
.end method
