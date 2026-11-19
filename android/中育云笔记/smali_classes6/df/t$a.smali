.class public Ldf/t$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lje/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldf/t;->c(Ldf/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Ldf/f;

.field public final synthetic d:Ldf/t;


# direct methods
.method public constructor <init>(Ldf/t;Ldf/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldf/t$a;->d:Ldf/t;

    .line 2
    .line 3
    iput-object p2, p0, Ldf/t$a;->c:Ldf/f;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Lje/e;Ljava/io/IOException;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p2}, Ldf/t$a;->c(Ljava/lang/Throwable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public b(Lje/e;Lje/y;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object p1, p0, Ldf/t$a;->d:Ldf/t;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Ldf/t;->f(Lje/y;)Ldf/c0;

    .line 4
    .line 5
    .line 6
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 7
    :try_start_1
    iget-object p2, p0, Ldf/t$a;->c:Ldf/f;

    .line 8
    .line 9
    iget-object v0, p0, Ldf/t$a;->d:Ldf/t;

    .line 10
    .line 11
    invoke-interface {p2, v0, p1}, Ldf/f;->b(Ldf/d;Ldf/c0;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    invoke-static {p1}, Ldf/h0;->t(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :catchall_1
    move-exception p1

    .line 24
    invoke-static {p1}, Ldf/h0;->t(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1}, Ldf/t$a;->c(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final c(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Ldf/t$a;->c:Ldf/f;

    .line 2
    .line 3
    iget-object v1, p0, Ldf/t$a;->d:Ldf/t;

    .line 4
    .line 5
    invoke-interface {v0, v1, p1}, Ldf/f;->a(Ldf/d;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception p1

    .line 10
    invoke-static {p1}, Ldf/h0;->t(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 14
    .line 15
    .line 16
    return-void
.end method
