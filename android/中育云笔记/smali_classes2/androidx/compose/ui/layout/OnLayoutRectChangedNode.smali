.class final Landroidx/compose/ui/layout/OnLayoutRectChangedNode;
.super Landroidx/compose/ui/Modifier$Node;
.source "SourceFile"


# instance fields
.field private callback:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field private debounceMillis:J

.field private handle:Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;

.field private throttleMillis:J


# direct methods
.method public constructor <init>(JJLhd/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/Modifier$Node;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Landroidx/compose/ui/layout/OnLayoutRectChangedNode;->throttleMillis:J

    .line 5
    .line 6
    iput-wide p3, p0, Landroidx/compose/ui/layout/OnLayoutRectChangedNode;->debounceMillis:J

    .line 7
    .line 8
    iput-object p5, p0, Landroidx/compose/ui/layout/OnLayoutRectChangedNode;->callback:Lhd/l;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final disposeAndRegister()V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/OnLayoutRectChangedNode;->handle:Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;->unregister()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-wide v2, p0, Landroidx/compose/ui/layout/OnLayoutRectChangedNode;->throttleMillis:J

    .line 9
    .line 10
    iget-wide v4, p0, Landroidx/compose/ui/layout/OnLayoutRectChangedNode;->debounceMillis:J

    .line 11
    .line 12
    iget-object v6, p0, Landroidx/compose/ui/layout/OnLayoutRectChangedNode;->callback:Lhd/l;

    .line 13
    .line 14
    move-object v1, p0

    .line 15
    invoke-static/range {v1 .. v6}, Landroidx/compose/ui/layout/OnLayoutRectChangedModifierKt;->registerOnLayoutRectChanged(Landroidx/compose/ui/node/DelegatableNode;JJLhd/l;)Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, v1, Landroidx/compose/ui/layout/OnLayoutRectChangedNode;->handle:Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;

    .line 20
    .line 21
    return-void
.end method

.method public final getCallback()Lhd/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/OnLayoutRectChangedNode;->callback:Lhd/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getDebounceMillis()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/compose/ui/layout/OnLayoutRectChangedNode;->debounceMillis:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getHandle()Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/OnLayoutRectChangedNode;->handle:Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getThrottleMillis()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/compose/ui/layout/OnLayoutRectChangedNode;->throttleMillis:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public onAttach()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/layout/OnLayoutRectChangedNode;->disposeAndRegister()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onDetach()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/OnLayoutRectChangedNode;->handle:Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;->unregister()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final setCallback(Lhd/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/layout/OnLayoutRectChangedNode;->callback:Lhd/l;

    .line 2
    .line 3
    return-void
.end method

.method public final setDebounceMillis(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Landroidx/compose/ui/layout/OnLayoutRectChangedNode;->debounceMillis:J

    .line 2
    .line 3
    return-void
.end method

.method public final setHandle(Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/layout/OnLayoutRectChangedNode;->handle:Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;

    .line 2
    .line 3
    return-void
.end method

.method public final setThrottleMillis(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Landroidx/compose/ui/layout/OnLayoutRectChangedNode;->throttleMillis:J

    .line 2
    .line 3
    return-void
.end method
