.class public final synthetic Landroidx/camera/core/impl/utils/futures/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/concurrent/futures/CallbackToFutureAdapter$Resolver;


# instance fields
.field public final synthetic a:Le1/a;

.field public final synthetic b:Ljava/util/concurrent/ScheduledExecutorService;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Z

.field public final synthetic e:J


# direct methods
.method public synthetic constructor <init>(JLjava/util/concurrent/ScheduledExecutorService;Ljava/lang/Object;ZLe1/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p6, p0, Landroidx/camera/core/impl/utils/futures/c;->a:Le1/a;

    iput-object p3, p0, Landroidx/camera/core/impl/utils/futures/c;->b:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p4, p0, Landroidx/camera/core/impl/utils/futures/c;->c:Ljava/lang/Object;

    iput-boolean p5, p0, Landroidx/camera/core/impl/utils/futures/c;->d:Z

    iput-wide p1, p0, Landroidx/camera/core/impl/utils/futures/c;->e:J

    return-void
.end method


# virtual methods
.method public final attachCompleter(Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-boolean v3, p0, Landroidx/camera/core/impl/utils/futures/c;->d:Z

    iget-wide v4, p0, Landroidx/camera/core/impl/utils/futures/c;->e:J

    iget-object v0, p0, Landroidx/camera/core/impl/utils/futures/c;->a:Le1/a;

    iget-object v1, p0, Landroidx/camera/core/impl/utils/futures/c;->b:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v2, p0, Landroidx/camera/core/impl/utils/futures/c;->c:Ljava/lang/Object;

    move-object v6, p1

    invoke-static/range {v0 .. v6}, Landroidx/camera/core/impl/utils/futures/Futures;->a(Le1/a;Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/Object;ZJLandroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
