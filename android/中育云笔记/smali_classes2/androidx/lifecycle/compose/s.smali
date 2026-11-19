.class public final synthetic Landroidx/lifecycle/compose/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Landroidx/lifecycle/LifecycleOwner;

.field public final synthetic d:Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;

.field public final synthetic e:Lhd/l;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;Lhd/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/compose/s;->c:Landroidx/lifecycle/LifecycleOwner;

    iput-object p2, p0, Landroidx/lifecycle/compose/s;->d:Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;

    iput-object p3, p0, Landroidx/lifecycle/compose/s;->e:Lhd/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/compose/s;->c:Landroidx/lifecycle/LifecycleOwner;

    iget-object v1, p0, Landroidx/lifecycle/compose/s;->d:Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;

    iget-object v2, p0, Landroidx/lifecycle/compose/s;->e:Lhd/l;

    check-cast p1, Landroidx/compose/runtime/DisposableEffectScope;

    invoke-static {v0, v1, v2, p1}, Landroidx/lifecycle/compose/LifecycleEffectKt;->s(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;Lhd/l;Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;

    move-result-object p1

    return-object p1
.end method
