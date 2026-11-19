.class public final Landroidx/lifecycle/ViewModelLazy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqc/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<VM:",
        "Landroidx/lifecycle/ViewModel;",
        ">",
        "Ljava/lang/Object;",
        "Lqc/d;"
    }
.end annotation


# instance fields
.field private cached:Landroidx/lifecycle/ViewModel;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TVM;"
        }
    .end annotation
.end field

.field private final extrasProducer:Lhd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/a;"
        }
    .end annotation
.end field

.field private final factoryProducer:Lhd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/a;"
        }
    .end annotation
.end field

.field private final storeProducer:Lhd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/a;"
        }
    .end annotation
.end field

.field private final viewModelClass:Lod/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lod/c;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lod/c;Lhd/a;Lhd/a;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lod/c;",
            "Lhd/a;",
            "Lhd/a;",
            ")V"
        }
    .end annotation

    .line 1
    const-string/jumbo v0, "viewModelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "storeProducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "factoryProducer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v1 .. v7}, Landroidx/lifecycle/ViewModelLazy;-><init>(Lod/c;Lhd/a;Lhd/a;Lhd/a;ILkotlin/jvm/internal/n;)V

    return-void
.end method

.method public constructor <init>(Lod/c;Lhd/a;Lhd/a;Lhd/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lod/c;",
            "Lhd/a;",
            "Lhd/a;",
            "Lhd/a;",
            ")V"
        }
    .end annotation

    const-string/jumbo v0, "viewModelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "storeProducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "factoryProducer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extrasProducer"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/lifecycle/ViewModelLazy;->viewModelClass:Lod/c;

    .line 4
    iput-object p2, p0, Landroidx/lifecycle/ViewModelLazy;->storeProducer:Lhd/a;

    .line 5
    iput-object p3, p0, Landroidx/lifecycle/ViewModelLazy;->factoryProducer:Lhd/a;

    .line 6
    iput-object p4, p0, Landroidx/lifecycle/ViewModelLazy;->extrasProducer:Lhd/a;

    return-void
.end method

.method public synthetic constructor <init>(Lod/c;Lhd/a;Lhd/a;Lhd/a;ILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 7
    new-instance p4, Landroidx/lifecycle/t;

    invoke-direct {p4}, Landroidx/lifecycle/t;-><init>()V

    .line 8
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/lifecycle/ViewModelLazy;-><init>(Lod/c;Lhd/a;Lhd/a;Lhd/a;)V

    return-void
.end method

.method private static final _init_$lambda$0()Landroidx/lifecycle/viewmodel/CreationExtras$Empty;
    .locals 1

    .line 1
    sget-object v0, Landroidx/lifecycle/viewmodel/CreationExtras$Empty;->INSTANCE:Landroidx/lifecycle/viewmodel/CreationExtras$Empty;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic a()Landroidx/lifecycle/viewmodel/CreationExtras$Empty;
    .locals 1

    .line 1
    invoke-static {}, Landroidx/lifecycle/ViewModelLazy;->_init_$lambda$0()Landroidx/lifecycle/viewmodel/CreationExtras$Empty;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public getValue()Landroidx/lifecycle/ViewModel;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TVM;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Landroidx/lifecycle/ViewModelLazy;->cached:Landroidx/lifecycle/ViewModel;

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Landroidx/lifecycle/ViewModelLazy;->storeProducer:Lhd/a;

    invoke-interface {v0}, Lhd/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/ViewModelStore;

    .line 4
    iget-object v1, p0, Landroidx/lifecycle/ViewModelLazy;->factoryProducer:Lhd/a;

    invoke-interface {v1}, Lhd/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/ViewModelProvider$Factory;

    .line 5
    iget-object v2, p0, Landroidx/lifecycle/ViewModelLazy;->extrasProducer:Lhd/a;

    invoke-interface {v2}, Lhd/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/lifecycle/viewmodel/CreationExtras;

    .line 6
    sget-object v3, Landroidx/lifecycle/ViewModelProvider;->Companion:Landroidx/lifecycle/ViewModelProvider$Companion;

    invoke-virtual {v3, v0, v1, v2}, Landroidx/lifecycle/ViewModelProvider$Companion;->create(Landroidx/lifecycle/ViewModelStore;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModelProvider;

    move-result-object v0

    iget-object v1, p0, Landroidx/lifecycle/ViewModelLazy;->viewModelClass:Lod/c;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/ViewModelProvider;->get(Lod/c;)Landroidx/lifecycle/ViewModel;

    move-result-object v0

    .line 7
    iput-object v0, p0, Landroidx/lifecycle/ViewModelLazy;->cached:Landroidx/lifecycle/ViewModel;

    :cond_0
    return-object v0
.end method

.method public bridge synthetic getValue()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/lifecycle/ViewModelLazy;->getValue()Landroidx/lifecycle/ViewModel;

    move-result-object v0

    return-object v0
.end method

.method public isInitialized()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/ViewModelLazy;->cached:Landroidx/lifecycle/ViewModel;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method
