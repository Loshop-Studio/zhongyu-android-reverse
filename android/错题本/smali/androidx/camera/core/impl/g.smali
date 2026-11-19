.class public final synthetic Landroidx/camera/core/impl/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/camera/core/impl/g;->a:I

    iput-object p2, p0, Landroidx/camera/core/impl/g;->c:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/camera/core/impl/g;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/camera/core/impl/LiveDataObservable$LiveDataObserverAdapter;Landroidx/camera/core/impl/LiveDataObservable$Result;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Landroidx/camera/core/impl/g;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/impl/g;->b:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/camera/core/impl/g;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/camera/core/impl/g;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/camera/core/impl/g;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/impl/LiveDataObservable;

    iget-object v1, p0, Landroidx/camera/core/impl/g;->b:Ljava/lang/Object;

    check-cast v1, Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/LiveDataObservable;->c(Landroidx/camera/core/impl/LiveDataObservable;Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/camera/core/impl/g;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/impl/DeferrableSurface;

    iget-object v1, p0, Landroidx/camera/core/impl/g;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {v1, v0}, Landroidx/camera/core/impl/DeferrableSurface;->c(Ljava/lang/String;Landroidx/camera/core/impl/DeferrableSurface;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Landroidx/camera/core/impl/g;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/impl/ConstantObservable;

    iget-object v1, p0, Landroidx/camera/core/impl/g;->b:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/core/impl/Observable$Observer;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/ConstantObservable;->a(Landroidx/camera/core/impl/ConstantObservable;Landroidx/camera/core/impl/Observable$Observer;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Landroidx/camera/core/impl/g;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/impl/CameraRepository;

    iget-object v1, p0, Landroidx/camera/core/impl/g;->b:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/core/impl/CameraInternal;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/CameraRepository;->a(Landroidx/camera/core/impl/CameraRepository;Landroidx/camera/core/impl/CameraInternal;)V

    return-void

    :pswitch_3
    iget-object v0, p0, Landroidx/camera/core/impl/g;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/impl/LiveDataObservable$LiveDataObserverAdapter;

    iget-object v1, p0, Landroidx/camera/core/impl/g;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/core/impl/LiveDataObservable$Result;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/LiveDataObservable$LiveDataObserverAdapter;->a(Landroidx/camera/core/impl/LiveDataObservable$LiveDataObserverAdapter;Landroidx/camera/core/impl/LiveDataObservable$Result;)V

    return-void

    :pswitch_4
    iget-object v0, p0, Landroidx/camera/core/impl/g;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/impl/LiveDataObservable;

    iget-object v1, p0, Landroidx/camera/core/impl/g;->b:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/core/impl/LiveDataObservable$LiveDataObserverAdapter;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/LiveDataObservable;->b(Landroidx/camera/core/impl/LiveDataObservable;Landroidx/camera/core/impl/LiveDataObservable$LiveDataObserverAdapter;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
