.class public Lj3/o$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr2/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj3/o;->U(Lj3/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lj3/d;

.field public final synthetic b:Lj3/o;


# direct methods
.method public constructor <init>(Lj3/o;Lj3/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lj3/o$a;->b:Lj3/o;

    .line 2
    .line 3
    iput-object p2, p0, Lj3/o$a;->a:Lj3/d;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Lr2/e;Ljava/io/IOException;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p2}, Lj3/o$a;->c(Ljava/lang/Throwable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public b(Lr2/e;Lr2/a0;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object p1, p0, Lj3/o$a;->b:Lj3/o;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lj3/o;->e(Lr2/a0;)Lj3/d0;

    .line 4
    .line 5
    .line 6
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 7
    :try_start_1
    iget-object p2, p0, Lj3/o$a;->a:Lj3/d;

    .line 8
    .line 9
    iget-object v0, p0, Lj3/o$a;->b:Lj3/o;

    .line 10
    .line 11
    invoke-interface {p2, v0, p1}, Lj3/d;->a(Lj3/b;Lj3/d0;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    invoke-static {p1}, Lj3/i0;->s(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 20
    .line 21
    .line 22
    :goto_0
    return-void

    .line 23
    :catchall_1
    move-exception p1

    .line 24
    invoke-static {p1}, Lj3/i0;->s(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lj3/o$a;->c(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final c(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lj3/o$a;->a:Lj3/d;

    .line 2
    .line 3
    iget-object v1, p0, Lj3/o$a;->b:Lj3/o;

    .line 4
    .line 5
    invoke-interface {v0, v1, p1}, Lj3/d;->b(Lj3/b;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :catchall_0
    move-exception p1

    .line 10
    invoke-static {p1}, Lj3/i0;->s(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 14
    .line 15
    .line 16
    :goto_0
    return-void
.end method
