.class public final Lc9/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc9/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc9/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Lc9/b;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lc9/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc9/g$b;->a:Ljava/util/concurrent/Executor;

    .line 5
    .line 6
    iput-object p2, p0, Lc9/g$b;->b:Lc9/b;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()Ll8/w;
    .locals 1

    .line 1
    iget-object v0, p0, Lc9/g$b;->b:Lc9/b;

    .line 2
    .line 3
    invoke-interface {v0}, Lc9/b;->a()Ll8/w;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public c(Lc9/d;)V
    .locals 2

    .line 1
    const-string v0, "callback == null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lc9/g$b;->b:Lc9/b;

    .line 7
    .line 8
    new-instance v1, Lc9/g$b$a;

    .line 9
    .line 10
    invoke-direct {v1, p0, p1}, Lc9/g$b$a;-><init>(Lc9/g$b;Lc9/d;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v1}, Lc9/b;->c(Lc9/d;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public cancel()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc9/g$b;->b:Lc9/b;

    .line 2
    .line 3
    invoke-interface {v0}, Lc9/b;->cancel()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public clone()Lc9/b;
    .locals 3

    .line 2
    new-instance v0, Lc9/g$b;

    iget-object v1, p0, Lc9/g$b;->a:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Lc9/g$b;->b:Lc9/b;

    invoke-interface {v2}, Lc9/b;->clone()Lc9/b;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lc9/g$b;-><init>(Ljava/util/concurrent/Executor;Lc9/b;)V

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc9/g$b;->clone()Lc9/b;

    move-result-object v0

    return-object v0
.end method

.method public isCanceled()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc9/g$b;->b:Lc9/b;

    .line 2
    .line 3
    invoke-interface {v0}, Lc9/b;->isCanceled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
