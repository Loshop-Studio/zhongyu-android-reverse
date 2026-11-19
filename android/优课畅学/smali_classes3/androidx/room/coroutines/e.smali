.class public final synthetic Landroidx/room/coroutines/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic a:Landroidx/room/coroutines/ConnectionPoolImpl;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Landroidx/room/coroutines/ConnectionPoolImpl;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/room/coroutines/e;->a:Landroidx/room/coroutines/ConnectionPoolImpl;

    iput-boolean p2, p0, Landroidx/room/coroutines/e;->b:Z

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/room/coroutines/e;->a:Landroidx/room/coroutines/ConnectionPoolImpl;

    iget-boolean v1, p0, Landroidx/room/coroutines/e;->b:Z

    invoke-static {v0, v1}, Landroidx/room/coroutines/ConnectionPoolImpl;->a(Landroidx/room/coroutines/ConnectionPoolImpl;Z)Lh7/p;

    move-result-object v0

    return-object v0
.end method
