.class public final Lr9/i$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr9/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr9/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Lr9/d;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lr9/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr9/i$b;->a:Ljava/util/concurrent/Executor;

    .line 5
    .line 6
    iput-object p2, p0, Lr9/i$b;->b:Lr9/d;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()La9/w;
    .locals 1

    .line 1
    iget-object v0, p0, Lr9/i$b;->b:Lr9/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lr9/d;->a()La9/w;

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
    iget-object v0, p0, Lr9/i$b;->b:Lr9/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lr9/d;->cancel()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lr9/i$b;->clone()Lr9/d;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lr9/d;
    .locals 3

    .line 2
    new-instance v0, Lr9/i$b;

    iget-object v1, p0, Lr9/i$b;->a:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Lr9/i$b;->b:Lr9/d;

    invoke-interface {v2}, Lr9/d;->clone()Lr9/d;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lr9/i$b;-><init>(Ljava/util/concurrent/Executor;Lr9/d;)V

    return-object v0
.end method

.method public isCanceled()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lr9/i$b;->b:Lr9/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lr9/d;->isCanceled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public j(Lr9/f;)V
    .locals 2

    .line 1
    const-string v0, "callback == null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr9/i$b;->b:Lr9/d;

    .line 7
    .line 8
    new-instance v1, Lr9/i$b$a;

    .line 9
    .line 10
    invoke-direct {v1, p0, p1}, Lr9/i$b$a;-><init>(Lr9/i$b;Lr9/f;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v1}, Lr9/d;->j(Lr9/f;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
