.class final Landroidx/room/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls0/c;
.implements Landroidx/room/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/room/f$b;,
        Landroidx/room/f$c;,
        Landroidx/room/f$a;
    }
.end annotation


# instance fields
.field private final a:Ls0/c;

.field private final b:Landroidx/room/f$a;

.field private final c:Landroidx/room/a;


# direct methods
.method constructor <init>(Ls0/c;Landroidx/room/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/room/f;->a:Ls0/c;

    .line 3
    iput-object p2, p0, Landroidx/room/f;->c:Landroidx/room/a;

    .line 4
    invoke-virtual {p2, p1}, Landroidx/room/a;->f(Ls0/c;)V

    .line 5
    new-instance p1, Landroidx/room/f$a;

    invoke-direct {p1, p2}, Landroidx/room/f$a;-><init>(Landroidx/room/a;)V

    iput-object p1, p0, Landroidx/room/f;->b:Landroidx/room/f$a;

    return-void
.end method


# virtual methods
.method public F()Ls0/b;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/room/f;->b:Landroidx/room/f$a;

    invoke-virtual {v0}, Landroidx/room/f$a;->s()V

    .line 2
    iget-object v0, p0, Landroidx/room/f;->b:Landroidx/room/f$a;

    return-object v0
.end method

.method a()Landroidx/room/a;
    .locals 1

    iget-object v0, p0, Landroidx/room/f;->c:Landroidx/room/a;

    return-object v0
.end method

.method public close()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Landroidx/room/f;->b:Landroidx/room/f$a;

    invoke-virtual {v0}, Landroidx/room/f$a;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 2
    invoke-static {v0}, Lr0/e;->a(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public getDatabaseName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Landroidx/room/f;->a:Ls0/c;

    invoke-interface {v0}, Ls0/c;->getDatabaseName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDelegate()Ls0/c;
    .locals 1

    iget-object v0, p0, Landroidx/room/f;->a:Ls0/c;

    return-object v0
.end method

.method public setWriteAheadLoggingEnabled(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/room/f;->a:Ls0/c;

    invoke-interface {v0, p1}, Ls0/c;->setWriteAheadLoggingEnabled(Z)V

    return-void
.end method
