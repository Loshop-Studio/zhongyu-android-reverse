.class public final synthetic Landroidx/lifecycle/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/LifecycleEventObserver;


# instance fields
.field public final synthetic c:Landroidx/lifecycle/LifecycleController;

.field public final synthetic d:Lkotlinx/coroutines/g;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/LifecycleController;Lkotlinx/coroutines/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/h;->c:Landroidx/lifecycle/LifecycleController;

    iput-object p2, p0, Landroidx/lifecycle/h;->d:Lkotlinx/coroutines/g;

    return-void
.end method


# virtual methods
.method public final onStateChanged(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/h;->c:Landroidx/lifecycle/LifecycleController;

    iget-object v1, p0, Landroidx/lifecycle/h;->d:Lkotlinx/coroutines/g;

    invoke-static {v0, v1, p1, p2}, Landroidx/lifecycle/LifecycleController;->a(Landroidx/lifecycle/LifecycleController;Lkotlinx/coroutines/g;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V

    return-void
.end method
