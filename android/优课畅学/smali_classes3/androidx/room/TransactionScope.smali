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
.method public abstract rollback(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lm7/c<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract withNestedTransaction(Lx7/p;Lm7/c;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lx7/p;",
            "Lm7/c<",
            "-TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
