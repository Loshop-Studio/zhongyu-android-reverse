.class public Lc9/g$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc9/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc9/g$b;->c(Lc9/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lc9/d;

.field public final synthetic b:Lc9/g$b;


# direct methods
.method public constructor <init>(Lc9/g$b;Lc9/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc9/g$b$a;->b:Lc9/g$b;

    .line 2
    .line 3
    iput-object p2, p0, Lc9/g$b$a;->a:Lc9/d;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic c(Lc9/g$b$a;Lc9/d;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lc9/g$b$a;->b:Lc9/g$b;

    .line 2
    .line 3
    invoke-interface {p1, p0, p2}, Lc9/d;->a(Lc9/b;Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic d(Lc9/g$b$a;Lc9/d;Lc9/x;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc9/g$b$a;->b:Lc9/g$b;

    .line 2
    .line 3
    iget-object v0, v0, Lc9/g$b;->b:Lc9/b;

    .line 4
    .line 5
    invoke-interface {v0}, Lc9/b;->isCanceled()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Lc9/g$b$a;->b:Lc9/g$b;

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
    invoke-interface {p1, p0, p2}, Lc9/d;->a(Lc9/b;Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iget-object p0, p0, Lc9/g$b$a;->b:Lc9/g$b;

    .line 25
    .line 26
    invoke-interface {p1, p0, p2}, Lc9/d;->b(Lc9/b;Lc9/x;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public a(Lc9/b;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lc9/g$b$a;->b:Lc9/g$b;

    .line 2
    .line 3
    iget-object p1, p1, Lc9/g$b;->a:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    iget-object v0, p0, Lc9/g$b$a;->a:Lc9/d;

    .line 6
    .line 7
    new-instance v1, Lc9/i;

    .line 8
    .line 9
    invoke-direct {v1, p0, v0, p2}, Lc9/i;-><init>(Lc9/g$b$a;Lc9/d;Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public b(Lc9/b;Lc9/x;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lc9/g$b$a;->b:Lc9/g$b;

    .line 2
    .line 3
    iget-object p1, p1, Lc9/g$b;->a:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    iget-object v0, p0, Lc9/g$b$a;->a:Lc9/d;

    .line 6
    .line 7
    new-instance v1, Lc9/h;

    .line 8
    .line 9
    invoke-direct {v1, p0, v0, p2}, Lc9/h;-><init>(Lc9/g$b$a;Lc9/d;Lc9/x;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
