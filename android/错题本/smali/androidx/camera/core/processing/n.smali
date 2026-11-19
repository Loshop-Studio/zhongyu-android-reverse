.class public final synthetic Landroidx/camera/core/processing/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/concurrent/futures/CallbackToFutureAdapter$Resolver;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/camera/core/processing/n;->a:I

    iput-object p1, p0, Landroidx/camera/core/processing/n;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final attachCompleter(Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Landroidx/camera/core/processing/n;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/camera/core/processing/n;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/processing/SurfaceOutputImpl;

    invoke-static {v0, p1}, Landroidx/camera/core/processing/SurfaceOutputImpl;->a(Landroidx/camera/core/processing/SurfaceOutputImpl;Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Landroidx/camera/core/processing/n;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/processing/SurfaceEdge$SettableSurface;

    invoke-static {v0, p1}, Landroidx/camera/core/processing/SurfaceEdge$SettableSurface;->e(Landroidx/camera/core/processing/SurfaceEdge$SettableSurface;Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
