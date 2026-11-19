.class public final synthetic Landroidx/lifecycle/compose/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/LifecycleEventObserver;


# instance fields
.field public final synthetic c:Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;

.field public final synthetic d:Lkotlin/jvm/internal/Ref$ObjectRef;

.field public final synthetic e:Lhd/l;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;Lkotlin/jvm/internal/Ref$ObjectRef;Lhd/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/compose/n;->c:Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;

    iput-object p2, p0, Landroidx/lifecycle/compose/n;->d:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p3, p0, Landroidx/lifecycle/compose/n;->e:Lhd/l;

    return-void
.end method


# virtual methods
.method public final onStateChanged(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/compose/n;->c:Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;

    iget-object v1, p0, Landroidx/lifecycle/compose/n;->d:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v2, p0, Landroidx/lifecycle/compose/n;->e:Lhd/l;

    invoke-static {v0, v1, v2, p1, p2}, Landroidx/lifecycle/compose/LifecycleEffectKt;->g(Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;Lkotlin/jvm/internal/Ref$ObjectRef;Lhd/l;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V

    return-void
.end method
