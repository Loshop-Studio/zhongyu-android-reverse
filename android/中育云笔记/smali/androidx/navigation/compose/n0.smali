.class public final synthetic Landroidx/navigation/compose/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Landroidx/navigation/NavHostController;

.field public final synthetic d:Landroidx/lifecycle/LifecycleOwner;


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavHostController;Landroidx/lifecycle/LifecycleOwner;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/navigation/compose/n0;->c:Landroidx/navigation/NavHostController;

    iput-object p2, p0, Landroidx/navigation/compose/n0;->d:Landroidx/lifecycle/LifecycleOwner;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/navigation/compose/n0;->c:Landroidx/navigation/NavHostController;

    iget-object v1, p0, Landroidx/navigation/compose/n0;->d:Landroidx/lifecycle/LifecycleOwner;

    check-cast p1, Landroidx/compose/runtime/DisposableEffectScope;

    invoke-static {v0, v1, p1}, Landroidx/navigation/compose/NavHostKt;->x(Landroidx/navigation/NavHostController;Landroidx/lifecycle/LifecycleOwner;Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;

    move-result-object p1

    return-object p1
.end method
