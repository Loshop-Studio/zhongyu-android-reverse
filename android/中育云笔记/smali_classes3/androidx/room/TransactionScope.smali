.class public interface abstract Landroidx/room/TransactionScope;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/room/PooledConnection;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Landroidx/room/PooledConnection;"
    }
.end annotation


# virtual methods
.method public abstract rollback(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lvc/c<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract withNestedTransaction(Lhd/p;Lvc/c;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lhd/p;",
            "Lvc/c<",
            "-TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
