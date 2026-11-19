.class final Landroidx/room/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls0/c$c;


# instance fields
.field private final a:Ls0/c$c;

.field private final b:Landroidx/room/h0$f;

.field private final c:Ljava/util/concurrent/Executor;


# direct methods
.method constructor <init>(Ls0/c$c;Landroidx/room/h0$f;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/room/b0;->a:Ls0/c$c;

    .line 3
    iput-object p2, p0, Landroidx/room/b0;->b:Landroidx/room/h0$f;

    .line 4
    iput-object p3, p0, Landroidx/room/b0;->c:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public a(Ls0/c$b;)Ls0/c;
    .locals 3

    new-instance v0, Landroidx/room/a0;

    iget-object v1, p0, Landroidx/room/b0;->a:Ls0/c$c;

    invoke-interface {v1, p1}, Ls0/c$c;->a(Ls0/c$b;)Ls0/c;

    move-result-object p1

    iget-object v1, p0, Landroidx/room/b0;->b:Landroidx/room/h0$f;

    iget-object v2, p0, Landroidx/room/b0;->c:Ljava/util/concurrent/Executor;

    invoke-direct {v0, p1, v1, v2}, Landroidx/room/a0;-><init>(Ls0/c;Landroidx/room/h0$f;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method
