.class final Lio/reactivex/internal/operators/flowable/FlowableHide$HideSubscriber;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/FlowableSubscriber;
.implements Lq9/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/flowable/FlowableHide;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "HideSubscriber"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lio/reactivex/FlowableSubscriber<",
        "TT;>;",
        "Lq9/d;"
    }
.end annotation


# instance fields
.field final downstream:Lq9/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq9/c;"
        }
    .end annotation
.end field

.field upstream:Lq9/d;


# direct methods
.method public constructor <init>(Lq9/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq9/c;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/FlowableHide$HideSubscriber;->downstream:Lq9/c;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/FlowableHide$HideSubscriber;->upstream:Lq9/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lq9/d;->cancel()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onComplete()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/FlowableHide$HideSubscriber;->downstream:Lq9/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lq9/c;->onComplete()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/FlowableHide$HideSubscriber;->downstream:Lq9/c;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lq9/c;->onError(Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/FlowableHide$HideSubscriber;->downstream:Lq9/c;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lq9/c;->onNext(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onSubscribe(Lq9/d;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/FlowableHide$HideSubscriber;->upstream:Lq9/d;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lio/reactivex/internal/subscriptions/SubscriptionHelper;->validate(Lq9/d;Lq9/d;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/FlowableHide$HideSubscriber;->upstream:Lq9/d;

    .line 10
    .line 11
    iget-object p1, p0, Lio/reactivex/internal/operators/flowable/FlowableHide$HideSubscriber;->downstream:Lq9/c;

    .line 12
    .line 13
    invoke-interface {p1, p0}, Lq9/c;->onSubscribe(Lq9/d;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public request(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/FlowableHide$HideSubscriber;->upstream:Lq9/d;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lq9/d;->request(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
