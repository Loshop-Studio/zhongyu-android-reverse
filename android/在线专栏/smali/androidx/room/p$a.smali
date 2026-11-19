.class Landroidx/room/p$a;
.super Landroidx/room/k$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/room/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/room/p;


# direct methods
.method constructor <init>(Landroidx/room/p;)V
    .locals 0

    iput-object p1, p0, Landroidx/room/p$a;->a:Landroidx/room/p;

    invoke-direct {p0}, Landroidx/room/k$a;-><init>()V

    return-void
.end method


# virtual methods
.method public i([Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Landroidx/room/p$a;->a:Landroidx/room/p;

    iget-object v0, v0, Landroidx/room/p;->g:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/room/p$a$a;

    invoke-direct {v1, p0, p1}, Landroidx/room/p$a$a;-><init>(Landroidx/room/p$a;[Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
