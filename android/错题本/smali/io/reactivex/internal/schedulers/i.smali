.class public final Lio/reactivex/internal/schedulers/i;
.super Lq5/j;
.source "SourceFile"


# static fields
.field public static final b:Lio/reactivex/internal/schedulers/RxThreadFactory;


# instance fields
.field public final a:Ljava/util/concurrent/ThreadFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string/jumbo v0, "rx2.newthread-priority"

    .line 2
    .line 3
    .line 4
    const/4 v1, 0x5

    .line 5
    invoke-static {v0, v1}, Ljava/lang/Integer;->getInteger(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/16 v1, 0xa

    .line 14
    .line 15
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    new-instance v1, Lio/reactivex/internal/schedulers/RxThreadFactory;

    .line 25
    .line 26
    const-string v2, "RxNewThreadScheduler"

    .line 27
    .line 28
    invoke-direct {v1, v2, v0}, Lio/reactivex/internal/schedulers/RxThreadFactory;-><init>(Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    sput-object v1, Lio/reactivex/internal/schedulers/i;->b:Lio/reactivex/internal/schedulers/RxThreadFactory;

    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lio/reactivex/internal/schedulers/i;->b:Lio/reactivex/internal/schedulers/RxThreadFactory;

    .line 5
    .line 6
    iput-object v0, p0, Lio/reactivex/internal/schedulers/i;->a:Ljava/util/concurrent/ThreadFactory;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Lq5/i;
    .locals 2

    .line 1
    new-instance v0, Lio/reactivex/internal/schedulers/j;

    .line 2
    .line 3
    iget-object v1, p0, Lio/reactivex/internal/schedulers/i;->a:Ljava/util/concurrent/ThreadFactory;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lio/reactivex/internal/schedulers/j;-><init>(Ljava/util/concurrent/ThreadFactory;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
