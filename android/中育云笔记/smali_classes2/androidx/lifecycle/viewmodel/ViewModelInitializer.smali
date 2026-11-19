.class public final Landroidx/lifecycle/viewmodel/ViewModelInitializer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Landroidx/lifecycle/ViewModel;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final clazz:Lod/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lod/c;"
        }
    .end annotation
.end field

.field private final initializer:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Class;Lhd/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    const-string v0, "clazz"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initializer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-static {p1}, Lgd/a;->c(Ljava/lang/Class;)Lod/c;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Landroidx/lifecycle/viewmodel/ViewModelInitializer;-><init>(Lod/c;Lhd/l;)V

    return-void
.end method

.method public constructor <init>(Lod/c;Lhd/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lod/c;",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    const-string v0, "clazz"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initializer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/lifecycle/viewmodel/ViewModelInitializer;->clazz:Lod/c;

    .line 3
    iput-object p2, p0, Landroidx/lifecycle/viewmodel/ViewModelInitializer;->initializer:Lhd/l;

    return-void
.end method


# virtual methods
.method public final getClazz$lifecycle_viewmodel_release()Lod/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lod/c;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/viewmodel/ViewModelInitializer;->clazz:Lod/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getInitializer$lifecycle_viewmodel_release()Lhd/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/viewmodel/ViewModelInitializer;->initializer:Lhd/l;

    .line 2
    .line 3
    return-object v0
.end method
