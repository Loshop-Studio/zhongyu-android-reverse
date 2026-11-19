.class public final Lm4/e;
.super Lokio/ForwardingSource;
.source "SourceFile"


# instance fields
.field public a:J

.field public final synthetic b:Lm4/f;


# direct methods
.method public constructor <init>(Lm4/f;Lokio/BufferedSource;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm4/e;->b:Lm4/f;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lokio/ForwardingSource;-><init>(Lokio/Source;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final read(Lokio/Buffer;J)J
    .locals 5

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Lokio/ForwardingSource;->read(Lokio/Buffer;J)J

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    iget-wide v0, p0, Lm4/e;->a:J

    .line 11
    .line 12
    const-wide/16 v2, -0x1

    .line 13
    .line 14
    cmp-long p3, p1, v2

    .line 15
    .line 16
    if-eqz p3, :cond_0

    .line 17
    .line 18
    move-wide v2, p1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-wide/16 v2, 0x0

    .line 21
    .line 22
    :goto_0
    add-long/2addr v0, v2

    .line 23
    iput-wide v0, p0, Lm4/e;->a:J

    .line 24
    .line 25
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    new-instance v0, Lio/reactivex/internal/operators/observable/d;

    .line 30
    .line 31
    invoke-direct {v0, p3}, Lio/reactivex/internal/operators/observable/d;-><init>(Ljava/lang/Long;)V

    .line 32
    .line 33
    .line 34
    invoke-static {}, Lr5/b;->a()Lr5/e;

    .line 35
    .line 36
    .line 37
    move-result-object p3

    .line 38
    invoke-virtual {v0, p3}, Lq5/e;->d(Lq5/j;)Lio/reactivex/internal/operators/observable/j;

    .line 39
    .line 40
    .line 41
    move-result-object p3

    .line 42
    new-instance v0, Landroidx/navigation/d;

    .line 43
    .line 44
    const/16 v1, 0x13

    .line 45
    .line 46
    iget-object v2, p0, Lm4/e;->b:Lm4/f;

    .line 47
    .line 48
    invoke-direct {v0, v1, v2, p0}, Landroidx/navigation/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    new-instance v1, Landroidx/camera/core/impl/d;

    .line 52
    .line 53
    const/16 v2, 0xf

    .line 54
    .line 55
    invoke-direct {v1, v0, v2}, Landroidx/camera/core/impl/d;-><init>(Ljava/lang/Object;I)V

    .line 56
    .line 57
    .line 58
    new-instance v0, Lio/reactivex/internal/observers/LambdaObserver;

    .line 59
    .line 60
    sget-object v2, Lv5/a;->d:Lc8/c;

    .line 61
    .line 62
    sget-object v3, Lv5/a;->b:Lio/reactivex/internal/operators/observable/g;

    .line 63
    .line 64
    sget-object v4, Lv5/a;->c:Lio/reactivex/internal/operators/observable/h;

    .line 65
    .line 66
    invoke-direct {v0, v1, v2, v3, v4}, Lio/reactivex/internal/observers/LambdaObserver;-><init>(Lt5/c;Lt5/c;Lt5/a;Lt5/c;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p3, v0}, Lq5/e;->b(Lq5/g;)V

    .line 70
    .line 71
    .line 72
    return-wide p1
.end method
