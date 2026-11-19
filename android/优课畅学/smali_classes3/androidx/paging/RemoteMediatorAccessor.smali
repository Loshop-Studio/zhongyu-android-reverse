.class public interface abstract Landroidx/paging/RemoteMediatorAccessor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/paging/RemoteMediatorConnection;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Key:",
        "Ljava/lang/Object;",
        "Value:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Landroidx/paging/RemoteMediatorConnection<",
        "TKey;TValue;>;"
    }
.end annotation


# virtual methods
.method public abstract getState()Ll8/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ll8/q;"
        }
    .end annotation
.end method

.method public abstract initialize(Lm7/c;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm7/c<",
            "-",
            "Landroidx/paging/RemoteMediator$InitializeAction;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
