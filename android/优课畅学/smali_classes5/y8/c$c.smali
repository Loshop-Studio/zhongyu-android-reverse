.class public Ly8/c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly8/h$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly8/c;->H(Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/Runnable;

.field public final synthetic b:Ly8/c;


# direct methods
.method public constructor <init>(Ly8/c;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly8/c$c;->b:Ly8/c;

    .line 2
    .line 3
    iput-object p2, p0, Ly8/c$c;->a:Ljava/lang/Runnable;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Lz8/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly8/c$c;->b:Ly8/c;

    .line 2
    .line 3
    invoke-static {v0}, Ly8/c;->j(Ly8/c;)Ly8/c$d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Ly8/c$c;->b:Ly8/c;

    .line 10
    .line 11
    invoke-static {v0}, Ly8/c;->j(Ly8/c;)Ly8/c$d;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0, p1}, Ly8/c$d;->d(Lz8/c;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, Ly8/c$c;->b:Ly8/c;

    .line 2
    .line 3
    invoke-static {v0}, Ly8/c;->h(Ly8/c;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ly8/c$c;->a:Ljava/lang/Runnable;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public c()V
    .locals 1

    .line 1
    iget-object v0, p0, Ly8/c$c;->b:Ly8/c;

    .line 2
    .line 3
    invoke-static {v0}, Ly8/c;->j(Ly8/c;)Ly8/c$d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Ly8/c$c;->b:Ly8/c;

    .line 10
    .line 11
    invoke-static {v0}, Ly8/c;->j(Ly8/c;)Ly8/c$d;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Ly8/c$d;->a()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public d(Lz8/c;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lz8/c;->w()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p1}, Lz8/c;->b()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    iget-object p1, p0, Ly8/c$c;->b:Ly8/c;

    .line 13
    .line 14
    invoke-static {p1}, Ly8/c;->p(Ly8/c;)Lz8/e;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-wide v2, p1, Lz8/e;->a:J

    .line 19
    .line 20
    sub-long/2addr v0, v2

    .line 21
    const-wide/16 v2, 0x0

    .line 22
    .line 23
    cmp-long p1, v0, v2

    .line 24
    .line 25
    if-lez p1, :cond_1

    .line 26
    .line 27
    iget-object p1, p0, Ly8/c$c;->b:Ly8/c;

    .line 28
    .line 29
    const/16 v2, 0xb

    .line 30
    .line 31
    invoke-virtual {p1, v2, v0, v1}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    iget-object p1, p0, Ly8/c$c;->b:Ly8/c;

    .line 36
    .line 37
    invoke-static {p1}, Ly8/c;->i(Ly8/c;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_2

    .line 42
    .line 43
    iget-object p1, p0, Ly8/c$c;->b:Ly8/c;

    .line 44
    .line 45
    invoke-static {p1}, Ly8/c;->g(Ly8/c;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    :goto_0
    return-void
.end method
