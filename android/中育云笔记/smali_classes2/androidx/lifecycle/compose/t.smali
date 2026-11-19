.class public final synthetic Landroidx/lifecycle/compose/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# instance fields
.field public final synthetic c:Landroidx/lifecycle/LifecycleOwner;

.field public final synthetic d:Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;

.field public final synthetic e:Lhd/l;

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;Lhd/l;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/compose/t;->c:Landroidx/lifecycle/LifecycleOwner;

    iput-object p2, p0, Landroidx/lifecycle/compose/t;->d:Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;

    iput-object p3, p0, Landroidx/lifecycle/compose/t;->e:Lhd/l;

    iput p4, p0, Landroidx/lifecycle/compose/t;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/compose/t;->c:Landroidx/lifecycle/LifecycleOwner;

    iget-object v1, p0, Landroidx/lifecycle/compose/t;->d:Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;

    iget-object v2, p0, Landroidx/lifecycle/compose/t;->e:Lhd/l;

    iget v3, p0, Landroidx/lifecycle/compose/t;->f:I

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, Landroidx/lifecycle/compose/LifecycleEffectKt;->f(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;Lhd/l;ILandroidx/compose/runtime/Composer;I)Lqc/q;

    move-result-object p1

    return-object p1
.end method
