.class final Landroidx/room/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls0/c;
.implements Landroidx/room/j;


# instance fields
.field private final a:Ls0/c;

.field private final b:Landroidx/room/h0$f;

.field private final c:Ljava/util/concurrent/Executor;


# direct methods
.method constructor <init>(Ls0/c;Landroidx/room/h0$f;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/room/a0;->a:Ls0/c;

    .line 3
    iput-object p2, p0, Landroidx/room/a0;->b:Landroidx/room/h0$f;

    .line 4
    iput-object p3, p0, Landroidx/room/a0;->c:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public F()Ls0/b;
    .locals 4

    new-instance v0, Landroidx/room/z;

    iget-object v1, p0, Landroidx/room/a0;->a:Ls0/c;

    invoke-interface {v1}, Ls0/c;->F()Ls0/b;

    move-result-object v1

    iget-object v2, p0, Landroidx/room/a0;->b:Landroidx/room/h0$f;

    iget-object v3, p0, Landroidx/room/a0;->c:Ljava/util/concurrent/Executor;

    invoke-direct {v0, v1, v2, v3}, Landroidx/room/z;-><init>(Ls0/b;Landroidx/room/h0$f;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Landroidx/room/a0;->a:Ls0/c;

    invoke-interface {v0}, Ls0/c;->close()V

    return-void
.end method

.method public getDatabaseName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Landroidx/room/a0;->a:Ls0/c;

    invoke-interface {v0}, Ls0/c;->getDatabaseName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDelegate()Ls0/c;
    .locals 1

    iget-object v0, p0, Landroidx/room/a0;->a:Ls0/c;

    return-object v0
.end method

.method public setWriteAheadLoggingEnabled(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/room/a0;->a:Ls0/c;

    invoke-interface {v0, p1}, Ls0/c;->setWriteAheadLoggingEnabled(Z)V

    return-void
.end method
