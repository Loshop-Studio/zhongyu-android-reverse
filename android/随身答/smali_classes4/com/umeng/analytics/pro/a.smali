.class public Lcom/umeng/analytics/pro/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lg2/s;

.field public final b:Lg2/b0;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/umeng/analytics/pro/bj$a;

    invoke-direct {v0}, Lcom/umeng/analytics/pro/bj$a;-><init>()V

    invoke-direct {p0, v0}, Lcom/umeng/analytics/pro/a;-><init>(Lcom/umeng/analytics/pro/br;)V

    return-void
.end method

.method public constructor <init>(Lcom/umeng/analytics/pro/br;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lg2/b0;

    invoke-direct {v0}, Lg2/b0;-><init>()V

    iput-object v0, p0, Lcom/umeng/analytics/pro/a;->b:Lg2/b0;

    .line 4
    invoke-interface {p1, v0}, Lcom/umeng/analytics/pro/br;->h(Lg2/c0;)Lg2/s;

    move-result-object p1

    iput-object p1, p0, Lcom/umeng/analytics/pro/a;->a:Lg2/s;

    return-void
.end method


# virtual methods
.method public a(Lcom/umeng/analytics/pro/aq;[B)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/umeng/analytics/pro/a;->b:Lg2/b0;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Lg2/b0;->i([B)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Lcom/umeng/analytics/pro/a;->a:Lg2/s;

    .line 7
    .line 8
    invoke-interface {p1, p2}, Lcom/umeng/analytics/pro/aq;->p(Lg2/s;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/umeng/analytics/pro/a;->b:Lg2/b0;

    .line 12
    .line 13
    invoke-virtual {p1}, Lg2/b0;->k()V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcom/umeng/analytics/pro/a;->a:Lg2/s;

    .line 17
    .line 18
    invoke-virtual {p1}, Lg2/s;->b()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    iget-object p2, p0, Lcom/umeng/analytics/pro/a;->b:Lg2/b0;

    .line 24
    .line 25
    invoke-virtual {p2}, Lg2/b0;->k()V

    .line 26
    .line 27
    .line 28
    iget-object p2, p0, Lcom/umeng/analytics/pro/a;->a:Lg2/s;

    .line 29
    .line 30
    invoke-virtual {p2}, Lg2/s;->b()V

    .line 31
    .line 32
    .line 33
    throw p1
.end method
