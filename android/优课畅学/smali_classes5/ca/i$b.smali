.class public final Lca/i$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lca/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lca/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Lca/d;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lca/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lca/i$b;->a:Ljava/util/concurrent/Executor;

    .line 5
    .line 6
    iput-object p2, p0, Lca/i$b;->b:Lca/d;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()Li9/b0;
    .locals 1

    .line 1
    iget-object v0, p0, Lca/i$b;->b:Lca/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lca/d;->a()Li9/b0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public cancel()V
    .locals 1

    .line 1
    iget-object v0, p0, Lca/i$b;->b:Lca/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lca/d;->cancel()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public clone()Lca/d;
    .locals 3

    .line 2
    new-instance v0, Lca/i$b;

    iget-object v1, p0, Lca/i$b;->a:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Lca/i$b;->b:Lca/d;

    invoke-interface {v2}, Lca/d;->clone()Lca/d;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lca/i$b;-><init>(Ljava/util/concurrent/Executor;Lca/d;)V

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lca/i$b;->clone()Lca/d;

    move-result-object v0

    return-object v0
.end method

.method public d(Lca/f;)V
    .locals 2

    .line 1
    const-string v0, "callback == null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lca/i$b;->b:Lca/d;

    .line 7
    .line 8
    new-instance v1, Lca/i$b$a;

    .line 9
    .line 10
    invoke-direct {v1, p0, p1}, Lca/i$b$a;-><init>(Lca/i$b;Lca/f;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v1}, Lca/d;->d(Lca/f;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public isCanceled()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lca/i$b;->b:Lca/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lca/d;->isCanceled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
