.class public interface abstract Ls0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# virtual methods
.method public abstract A()V
.end method

.method public abstract D(Ls0/e;)Landroid/database/Cursor;
.end method

.method public abstract E(Ls0/e;Landroid/os/CancellationSignal;)Landroid/database/Cursor;
.end method

.method public abstract H(Ljava/lang/String;)Landroid/database/Cursor;
.end method

.method public abstract e()V
.end method

.method public abstract f()V
.end method

.method public abstract g()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract getPath()Ljava/lang/String;
.end method

.method public abstract h(Ljava/lang/String;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/database/SQLException;
        }
    .end annotation
.end method

.method public abstract isOpen()Z
.end method

.method public abstract j(Ljava/lang/String;)Ls0/f;
.end method

.method public abstract p()Z
.end method

.method public abstract v()Z
.end method

.method public abstract x()V
.end method

.method public abstract z(Ljava/lang/String;[Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/database/SQLException;
        }
    .end annotation
.end method
