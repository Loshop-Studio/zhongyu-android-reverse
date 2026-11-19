.class public final Lj3/j$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj3/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj3/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Lj3/b;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lj3/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj3/j$b;->a:Ljava/util/concurrent/Executor;

    .line 5
    .line 6
    iput-object p2, p0, Lj3/j$b;->b:Lj3/b;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public S()Lr2/y;
    .locals 1

    .line 1
    iget-object v0, p0, Lj3/j$b;->b:Lj3/b;

    .line 2
    .line 3
    invoke-interface {v0}, Lj3/b;->S()Lr2/y;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public T()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lj3/j$b;->b:Lj3/b;

    .line 2
    .line 3
    invoke-interface {v0}, Lj3/b;->T()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public U(Lj3/d;)V
    .locals 2

    .line 1
    const-string v0, "callback == null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lj3/j$b;->b:Lj3/b;

    .line 7
    .line 8
    new-instance v1, Lj3/j$b$a;

    .line 9
    .line 10
    invoke-direct {v1, p0, p1}, Lj3/j$b$a;-><init>(Lj3/j$b;Lj3/d;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v1}, Lj3/b;->U(Lj3/d;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public cancel()V
    .locals 1

    .line 1
    iget-object v0, p0, Lj3/j$b;->b:Lj3/b;

    .line 2
    .line 3
    invoke-interface {v0}, Lj3/b;->cancel()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public clone()Lj3/b;
    .locals 3

    .line 2
    new-instance v0, Lj3/j$b;

    iget-object v1, p0, Lj3/j$b;->a:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Lj3/j$b;->b:Lj3/b;

    invoke-interface {v2}, Lj3/b;->clone()Lj3/b;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lj3/j$b;-><init>(Ljava/util/concurrent/Executor;Lj3/b;)V

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lj3/j$b;->clone()Lj3/b;

    move-result-object v0

    return-object v0
.end method
