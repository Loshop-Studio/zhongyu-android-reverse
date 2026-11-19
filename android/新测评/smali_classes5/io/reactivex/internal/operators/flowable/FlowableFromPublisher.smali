.class public final Lio/reactivex/internal/operators/flowable/FlowableFromPublisher;
.super Lio/reactivex/Flowable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/Flowable<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final publisher:Lq9/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq9/b;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lq9/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq9/b;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lio/reactivex/Flowable;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/FlowableFromPublisher;->publisher:Lq9/b;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public subscribeActual(Lq9/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq9/c;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/FlowableFromPublisher;->publisher:Lq9/b;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lq9/b;->subscribe(Lq9/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
