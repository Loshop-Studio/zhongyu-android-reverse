.class public Lr9/t$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La9/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr9/t;->j(Lr9/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lr9/f;

.field public final synthetic b:Lr9/t;


# direct methods
.method public constructor <init>(Lr9/t;Lr9/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr9/t$a;->b:Lr9/t;

    .line 2
    .line 3
    iput-object p2, p0, Lr9/t$a;->a:Lr9/f;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(La9/e;La9/y;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object p1, p0, Lr9/t$a;->b:Lr9/t;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lr9/t;->e(La9/y;)Lr9/c0;

    .line 4
    .line 5
    .line 6
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 7
    :try_start_1
    iget-object p2, p0, Lr9/t$a;->a:Lr9/f;

    .line 8
    .line 9
    iget-object v0, p0, Lr9/t$a;->b:Lr9/t;

    .line 10
    .line 11
    invoke-interface {p2, v0, p1}, Lr9/f;->a(Lr9/d;Lr9/c0;)V
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
    invoke-static {p1}, Lr9/h0;->t(Ljava/lang/Throwable;)V

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
    invoke-static {p1}, Lr9/h0;->t(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lr9/t$a;->c(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public b(La9/e;Ljava/io/IOException;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p2}, Lr9/t$a;->c(Ljava/lang/Throwable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final c(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lr9/t$a;->a:Lr9/f;

    .line 2
    .line 3
    iget-object v1, p0, Lr9/t$a;->b:Lr9/t;

    .line 4
    .line 5
    invoke-interface {v0, v1, p1}, Lr9/f;->b(Lr9/d;Ljava/lang/Throwable;)V
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
    invoke-static {p1}, Lr9/h0;->t(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 14
    .line 15
    .line 16
    return-void
.end method
