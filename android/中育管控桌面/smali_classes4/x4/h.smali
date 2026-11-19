.class public final Lx4/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Landroidx/lifecycle/viewmodel/CreationExtras;

.field public b:Landroidx/lifecycle/SavedStateHandle;

.field public final c:Z


# direct methods
.method public constructor <init>(Landroidx/lifecycle/viewmodel/CreationExtras;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    iput-boolean v0, p0, Lx4/h;->c:Z

    .line 10
    .line 11
    iput-object p1, p0, Lx4/h;->a:Landroidx/lifecycle/viewmodel/CreationExtras;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lx4/h;->a:Landroidx/lifecycle/viewmodel/CreationExtras;

    .line 3
    .line 4
    return-void
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lx4/h;->b:Landroidx/lifecycle/SavedStateHandle;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lx4/h;->a:Landroidx/lifecycle/viewmodel/CreationExtras;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public c(Landroidx/lifecycle/viewmodel/CreationExtras;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx4/h;->b:Landroidx/lifecycle/SavedStateHandle;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput-object p1, p0, Lx4/h;->a:Landroidx/lifecycle/viewmodel/CreationExtras;

    .line 7
    .line 8
    return-void
.end method
