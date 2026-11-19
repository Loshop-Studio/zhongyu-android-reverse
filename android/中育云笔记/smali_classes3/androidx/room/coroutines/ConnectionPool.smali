.class public interface abstract Landroidx/room/coroutines/ConnectionPool;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/room/coroutines/ConnectionPool$RollbackException;
    }
.end annotation


# virtual methods
.method public abstract close()V
.end method

.method public abstract useConnection(ZLhd/p;Lvc/c;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(Z",
            "Lhd/p;",
            "Lvc/c<",
            "-TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
