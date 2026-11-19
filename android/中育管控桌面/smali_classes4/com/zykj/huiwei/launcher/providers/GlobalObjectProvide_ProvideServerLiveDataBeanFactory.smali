.class public final Lcom/zykj/huiwei/launcher/providers/GlobalObjectProvide_ProvideServerLiveDataBeanFactory;
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
.field private final module:Lcom/zykj/huiwei/launcher/providers/GlobalObjectProvide;


# direct methods
.method private constructor <init>(Lcom/zykj/huiwei/launcher/providers/GlobalObjectProvide;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/providers/GlobalObjectProvide_ProvideServerLiveDataBeanFactory;->module:Lcom/zykj/huiwei/launcher/providers/GlobalObjectProvide;

    .line 5
    .line 6
    return-void
.end method

.method public static create(Lcom/zykj/huiwei/launcher/providers/GlobalObjectProvide;)Lcom/zykj/huiwei/launcher/providers/GlobalObjectProvide_ProvideServerLiveDataBeanFactory;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/huiwei/launcher/providers/GlobalObjectProvide_ProvideServerLiveDataBeanFactory;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/zykj/huiwei/launcher/providers/GlobalObjectProvide_ProvideServerLiveDataBeanFactory;-><init>(Lcom/zykj/huiwei/launcher/providers/GlobalObjectProvide;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static provideServerLiveDataBean(Lcom/zykj/huiwei/launcher/providers/GlobalObjectProvide;)Landroidx/lifecycle/MutableLiveData;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/huiwei/launcher/providers/GlobalObjectProvide;",
            ")",
            "Landroidx/lifecycle/MutableLiveData<",
            "Lcom/zykj/huiwei/launcher/proto/a;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/providers/GlobalObjectProvide;->provideServerLiveDataBean()Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, La5/e;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Landroidx/lifecycle/MutableLiveData;

    .line 10
    .line 11
    return-object p0
.end method


# virtual methods
.method public get()Landroidx/lifecycle/MutableLiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/MutableLiveData<",
            "Lcom/zykj/huiwei/launcher/proto/a;",
            ">;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/providers/GlobalObjectProvide_ProvideServerLiveDataBeanFactory;->module:Lcom/zykj/huiwei/launcher/providers/GlobalObjectProvide;

    invoke-static {v0}, Lcom/zykj/huiwei/launcher/providers/GlobalObjectProvide_ProvideServerLiveDataBeanFactory;->provideServerLiveDataBean(Lcom/zykj/huiwei/launcher/providers/GlobalObjectProvide;)Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/providers/GlobalObjectProvide_ProvideServerLiveDataBeanFactory;->get()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    return-object v0
.end method
