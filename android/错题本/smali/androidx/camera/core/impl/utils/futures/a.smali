.class public final synthetic Landroidx/camera/core/impl/utils/futures/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/concurrent/futures/CallbackToFutureAdapter$Resolver;


# instance fields
.field public final synthetic a:Le1/a;

.field public final synthetic b:Ljava/util/concurrent/ScheduledExecutorService;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(JLjava/util/concurrent/ScheduledExecutorService;Le1/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Landroidx/camera/core/impl/utils/futures/a;->a:Le1/a;

    iput-object p3, p0, Landroidx/camera/core/impl/utils/futures/a;->b:Ljava/util/concurrent/ScheduledExecutorService;

    iput-wide p1, p0, Landroidx/camera/core/impl/utils/futures/a;->c:J

    return-void
.end method


# virtual methods
.method public final attachCompleter(Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/camera/core/impl/utils/futures/a;->b:Ljava/util/concurrent/ScheduledExecutorService;

    iget-wide v1, p0, Landroidx/camera/core/impl/utils/futures/a;->c:J

    iget-object v3, p0, Landroidx/camera/core/impl/utils/futures/a;->a:Le1/a;

    invoke-static {v3, v0, v1, v2, p1}, Landroidx/camera/core/impl/utils/futures/Futures;->d(Le1/a;Ljava/util/concurrent/ScheduledExecutorService;JLandroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
