.class public final synthetic Landroidx/navigation/internal/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/LifecycleEventObserver;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/navigation/internal/b;->a:I

    iput-object p1, p0, Landroidx/navigation/internal/b;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onStateChanged(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/navigation/internal/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/navigation/internal/b;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 9
    .line 10
    const-string v1, "<unused var>"

    .line 11
    .line 12
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string p1, "event"

    .line 16
    .line 17
    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    sget-object p1, Landroidx/lifecycle/Lifecycle$Event;->ON_RESUME:Landroidx/lifecycle/Lifecycle$Event;

    .line 21
    .line 22
    if-ne p2, p1, :cond_0

    .line 23
    .line 24
    sget-object p1, Lcom/zykj/mistake/feature/notebook/detail/a3;->a:Lcom/zykj/mistake/feature/notebook/detail/a3;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->t(Lcom/zykj/mistake/feature/notebook/detail/i3;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void

    .line 30
    :pswitch_0
    iget-object v0, p0, Landroidx/navigation/internal/b;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Landroidx/savedstate/internal/SavedStateRegistryImpl;

    .line 33
    .line 34
    invoke-static {v0, p1, p2}, Landroidx/savedstate/internal/SavedStateRegistryImpl;->a(Landroidx/savedstate/internal/SavedStateRegistryImpl;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_1
    iget-object v0, p0, Landroidx/navigation/internal/b;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Landroidx/navigation/internal/NavControllerImpl;

    .line 41
    .line 42
    invoke-static {v0, p1, p2}, Landroidx/navigation/internal/NavControllerImpl;->g(Landroidx/navigation/internal/NavControllerImpl;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
