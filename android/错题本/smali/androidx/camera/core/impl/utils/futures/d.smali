.class public final synthetic Landroidx/camera/core/impl/utils/futures/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Z

.field public final synthetic d:Le1/a;


# direct methods
.method public synthetic constructor <init>(Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;Ljava/lang/Object;ZLe1/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/impl/utils/futures/d;->a:Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;

    iput-object p2, p0, Landroidx/camera/core/impl/utils/futures/d;->b:Ljava/lang/Object;

    iput-boolean p3, p0, Landroidx/camera/core/impl/utils/futures/d;->c:Z

    iput-object p4, p0, Landroidx/camera/core/impl/utils/futures/d;->d:Le1/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Landroidx/camera/core/impl/utils/futures/d;->c:Z

    iget-object v1, p0, Landroidx/camera/core/impl/utils/futures/d;->d:Le1/a;

    iget-object v2, p0, Landroidx/camera/core/impl/utils/futures/d;->a:Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;

    iget-object v3, p0, Landroidx/camera/core/impl/utils/futures/d;->b:Ljava/lang/Object;

    invoke-static {v2, v3, v0, v1}, Landroidx/camera/core/impl/utils/futures/Futures;->h(Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;Ljava/lang/Object;ZLe1/a;)V

    return-void
.end method
