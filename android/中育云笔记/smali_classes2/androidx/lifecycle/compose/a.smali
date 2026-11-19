.class public final synthetic Landroidx/lifecycle/compose/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Landroidx/lifecycle/LifecycleOwner;

.field public final synthetic d:Landroidx/lifecycle/Lifecycle$State;

.field public final synthetic e:Lhd/a;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lhd/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/compose/a;->c:Landroidx/lifecycle/LifecycleOwner;

    iput-object p2, p0, Landroidx/lifecycle/compose/a;->d:Landroidx/lifecycle/Lifecycle$State;

    iput-object p3, p0, Landroidx/lifecycle/compose/a;->e:Lhd/a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/compose/a;->c:Landroidx/lifecycle/LifecycleOwner;

    iget-object v1, p0, Landroidx/lifecycle/compose/a;->d:Landroidx/lifecycle/Lifecycle$State;

    iget-object v2, p0, Landroidx/lifecycle/compose/a;->e:Lhd/a;

    invoke-static {v0, v1, v2}, Landroidx/lifecycle/compose/DropUnlessLifecycleKt;->a(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lhd/a;)Lqc/q;

    move-result-object v0

    return-object v0
.end method
