.class public final synthetic Landroidx/camera/core/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/camera/core/CameraX;

.field public final synthetic c:Landroid/content/Context;

.field public final synthetic d:Ljava/util/concurrent/Executor;

.field public final synthetic e:I

.field public final synthetic f:Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;

.field public final synthetic g:J


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/CameraX;Landroid/content/Context;Ljava/util/concurrent/Executor;ILandroidx/concurrent/futures/CallbackToFutureAdapter$Completer;J)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Landroidx/camera/core/d;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/d;->b:Landroidx/camera/core/CameraX;

    iput-object p2, p0, Landroidx/camera/core/d;->c:Landroid/content/Context;

    iput-object p3, p0, Landroidx/camera/core/d;->d:Ljava/util/concurrent/Executor;

    iput p4, p0, Landroidx/camera/core/d;->e:I

    iput-object p5, p0, Landroidx/camera/core/d;->f:Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;

    iput-wide p6, p0, Landroidx/camera/core/d;->g:J

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/camera/core/CameraX;Ljava/util/concurrent/Executor;JILandroid/content/Context;Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Landroidx/camera/core/d;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/d;->b:Landroidx/camera/core/CameraX;

    iput-object p2, p0, Landroidx/camera/core/d;->d:Ljava/util/concurrent/Executor;

    iput-wide p3, p0, Landroidx/camera/core/d;->g:J

    iput p5, p0, Landroidx/camera/core/d;->e:I

    iput-object p6, p0, Landroidx/camera/core/d;->c:Landroid/content/Context;

    iput-object p7, p0, Landroidx/camera/core/d;->f:Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    .line 1
    iget v0, p0, Landroidx/camera/core/d;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v5, p0, Landroidx/camera/core/d;->f:Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;

    iget-wide v6, p0, Landroidx/camera/core/d;->g:J

    iget-object v1, p0, Landroidx/camera/core/d;->b:Landroidx/camera/core/CameraX;

    iget-object v2, p0, Landroidx/camera/core/d;->c:Landroid/content/Context;

    iget-object v3, p0, Landroidx/camera/core/d;->d:Ljava/util/concurrent/Executor;

    iget v4, p0, Landroidx/camera/core/d;->e:I

    invoke-static/range {v1 .. v7}, Landroidx/camera/core/CameraX;->a(Landroidx/camera/core/CameraX;Landroid/content/Context;Ljava/util/concurrent/Executor;ILandroidx/concurrent/futures/CallbackToFutureAdapter$Completer;J)V

    return-void

    :pswitch_0
    iget-object v9, p0, Landroidx/camera/core/d;->c:Landroid/content/Context;

    iget-object v12, p0, Landroidx/camera/core/d;->f:Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;

    iget-object v8, p0, Landroidx/camera/core/d;->b:Landroidx/camera/core/CameraX;

    iget-object v10, p0, Landroidx/camera/core/d;->d:Ljava/util/concurrent/Executor;

    iget v11, p0, Landroidx/camera/core/d;->e:I

    iget-wide v13, p0, Landroidx/camera/core/d;->g:J

    invoke-static/range {v8 .. v14}, Landroidx/camera/core/CameraX;->e(Landroidx/camera/core/CameraX;Landroid/content/Context;Ljava/util/concurrent/Executor;ILandroidx/concurrent/futures/CallbackToFutureAdapter$Completer;J)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
