.class public Lz5/i$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz5/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz5/i$b;->g(Lz5/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lz5/f;

.field public final synthetic b:Lz5/i$b;


# direct methods
.method public constructor <init>(Lz5/i$b;Lz5/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz5/i$b$a;->b:Lz5/i$b;

    .line 2
    .line 3
    iput-object p2, p0, Lz5/i$b$a;->a:Lz5/f;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic c(Lz5/i$b$a;Lz5/f;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lz5/i$b$a;->b:Lz5/i$b;

    .line 2
    .line 3
    invoke-interface {p1, p0, p2}, Lz5/f;->b(Lz5/d;Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic d(Lz5/i$b$a;Lz5/f;Lz5/c0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lz5/i$b$a;->b:Lz5/i$b;

    .line 2
    .line 3
    iget-object v0, v0, Lz5/i$b;->b:Lz5/d;

    .line 4
    .line 5
    invoke-interface {v0}, Lz5/d;->isCanceled()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Lz5/i$b$a;->b:Lz5/i$b;

    .line 12
    .line 13
    new-instance p2, Ljava/io/IOException;

    .line 14
    .line 15
    const-string v0, "Canceled"

    .line 16
    .line 17
    invoke-direct {p2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p1, p0, p2}, Lz5/f;->b(Lz5/d;Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iget-object p0, p0, Lz5/i$b$a;->b:Lz5/i$b;

    .line 25
    .line 26
    invoke-interface {p1, p0, p2}, Lz5/f;->a(Lz5/d;Lz5/c0;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public a(Lz5/d;Lz5/c0;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lz5/i$b$a;->b:Lz5/i$b;

    .line 2
    .line 3
    iget-object p1, p1, Lz5/i$b;->a:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    iget-object v0, p0, Lz5/i$b$a;->a:Lz5/f;

    .line 6
    .line 7
    new-instance v1, Lz5/j;

    .line 8
    .line 9
    invoke-direct {v1, p0, v0, p2}, Lz5/j;-><init>(Lz5/i$b$a;Lz5/f;Lz5/c0;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public b(Lz5/d;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lz5/i$b$a;->b:Lz5/i$b;

    .line 2
    .line 3
    iget-object p1, p1, Lz5/i$b;->a:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    iget-object v0, p0, Lz5/i$b$a;->a:Lz5/f;

    .line 6
    .line 7
    new-instance v1, Lz5/k;

    .line 8
    .line 9
    invoke-direct {v1, p0, v0, p2}, Lz5/k;-><init>(Lz5/i$b$a;Lz5/f;Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
