.class Lf1/t$b;
.super Lp0/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf1/t;-><init>(Landroidx/room/h0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lp0/g<",
        "Lf1/r;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic d:Lf1/t;


# direct methods
.method constructor <init>(Lf1/t;Landroidx/room/h0;)V
    .locals 0

    iput-object p1, p0, Lf1/t$b;->d:Lf1/t;

    invoke-direct {p0, p2}, Lp0/g;-><init>(Landroidx/room/h0;)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    return-object v0
.end method

.method public bridge synthetic g(Ls0/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lf1/r;

    invoke-virtual {p0, p1, p2}, Lf1/t$b;->j(Ls0/f;Lf1/r;)V

    return-void
.end method

.method public j(Ls0/f;Lf1/r;)V
    .locals 10

    .line 1
    iget-object v0, p2, Lf1/r;->a:Ljava/lang/String;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 2
    invoke-interface {p1, v1}, Ls0/d;->k(I)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {p1, v1, v0}, Ls0/d;->c(ILjava/lang/String;)V

    .line 4
    :goto_0
    iget-object v0, p2, Lf1/r;->b:Lx0/v$a;

    invoke-static {v0}, Lf1/x;->h(Lx0/v$a;)I

    move-result v0

    const/4 v1, 0x2

    int-to-long v2, v0

    .line 5
    invoke-interface {p1, v1, v2, v3}, Ls0/d;->w(IJ)V

    .line 6
    iget-object v0, p2, Lf1/r;->c:Ljava/lang/String;

    const/4 v1, 0x3

    if-nez v0, :cond_1

    .line 7
    invoke-interface {p1, v1}, Ls0/d;->k(I)V

    goto :goto_1

    .line 8
    :cond_1
    invoke-interface {p1, v1, v0}, Ls0/d;->c(ILjava/lang/String;)V

    .line 9
    :goto_1
    iget-object v0, p2, Lf1/r;->d:Ljava/lang/String;

    const/4 v1, 0x4

    if-nez v0, :cond_2

    .line 10
    invoke-interface {p1, v1}, Ls0/d;->k(I)V

    goto :goto_2

    .line 11
    :cond_2
    invoke-interface {p1, v1, v0}, Ls0/d;->c(ILjava/lang/String;)V

    .line 12
    :goto_2
    iget-object v0, p2, Lf1/r;->e:Landroidx/work/a;

    invoke-static {v0}, Landroidx/work/a;->m(Landroidx/work/a;)[B

    move-result-object v0

    const/4 v1, 0x5

    if-nez v0, :cond_3

    .line 13
    invoke-interface {p1, v1}, Ls0/d;->k(I)V

    goto :goto_3

    .line 14
    :cond_3
    invoke-interface {p1, v1, v0}, Ls0/d;->C(I[B)V

    .line 15
    :goto_3
    iget-object v0, p2, Lf1/r;->f:Landroidx/work/a;

    invoke-static {v0}, Landroidx/work/a;->m(Landroidx/work/a;)[B

    move-result-object v0

    const/4 v1, 0x6

    if-nez v0, :cond_4

    .line 16
    invoke-interface {p1, v1}, Ls0/d;->k(I)V

    goto :goto_4

    .line 17
    :cond_4
    invoke-interface {p1, v1, v0}, Ls0/d;->C(I[B)V

    :goto_4
    const/4 v0, 0x7

    .line 18
    iget-wide v1, p2, Lf1/r;->g:J

    invoke-interface {p1, v0, v1, v2}, Ls0/d;->w(IJ)V

    const/16 v0, 0x8

    .line 19
    iget-wide v1, p2, Lf1/r;->h:J

    invoke-interface {p1, v0, v1, v2}, Ls0/d;->w(IJ)V

    const/16 v0, 0x9

    .line 20
    iget-wide v1, p2, Lf1/r;->i:J

    invoke-interface {p1, v0, v1, v2}, Ls0/d;->w(IJ)V

    const/16 v0, 0xa

    .line 21
    iget v1, p2, Lf1/r;->k:I

    int-to-long v1, v1

    invoke-interface {p1, v0, v1, v2}, Ls0/d;->w(IJ)V

    .line 22
    iget-object v0, p2, Lf1/r;->l:Lx0/a;

    invoke-static {v0}, Lf1/x;->a(Lx0/a;)I

    move-result v0

    const/16 v1, 0xb

    int-to-long v2, v0

    .line 23
    invoke-interface {p1, v1, v2, v3}, Ls0/d;->w(IJ)V

    const/16 v0, 0xc

    .line 24
    iget-wide v1, p2, Lf1/r;->m:J

    invoke-interface {p1, v0, v1, v2}, Ls0/d;->w(IJ)V

    const/16 v0, 0xd

    .line 25
    iget-wide v1, p2, Lf1/r;->n:J

    invoke-interface {p1, v0, v1, v2}, Ls0/d;->w(IJ)V

    const/16 v0, 0xe

    .line 26
    iget-wide v1, p2, Lf1/r;->o:J

    invoke-interface {p1, v0, v1, v2}, Ls0/d;->w(IJ)V

    const/16 v0, 0xf

    .line 27
    iget-wide v1, p2, Lf1/r;->p:J

    invoke-interface {p1, v0, v1, v2}, Ls0/d;->w(IJ)V

    .line 28
    iget-boolean v0, p2, Lf1/r;->q:Z

    const/16 v1, 0x10

    int-to-long v2, v0

    .line 29
    invoke-interface {p1, v1, v2, v3}, Ls0/d;->w(IJ)V

    .line 30
    iget-object p2, p2, Lf1/r;->j:Lx0/c;

    const/16 v0, 0x17

    const/16 v1, 0x16

    const/16 v2, 0x15

    const/16 v3, 0x14

    const/16 v4, 0x13

    const/16 v5, 0x12

    const/16 v6, 0x11

    const/16 v7, 0x18

    if-eqz p2, :cond_6

    .line 31
    invoke-virtual {p2}, Lx0/c;->b()Lx0/o;

    move-result-object v8

    invoke-static {v8}, Lf1/x;->g(Lx0/o;)I

    move-result v8

    int-to-long v8, v8

    .line 32
    invoke-interface {p1, v6, v8, v9}, Ls0/d;->w(IJ)V

    .line 33
    invoke-virtual {p2}, Lx0/c;->g()Z

    move-result v6

    int-to-long v8, v6

    .line 34
    invoke-interface {p1, v5, v8, v9}, Ls0/d;->w(IJ)V

    .line 35
    invoke-virtual {p2}, Lx0/c;->h()Z

    move-result v5

    int-to-long v5, v5

    .line 36
    invoke-interface {p1, v4, v5, v6}, Ls0/d;->w(IJ)V

    .line 37
    invoke-virtual {p2}, Lx0/c;->f()Z

    move-result v4

    int-to-long v4, v4

    .line 38
    invoke-interface {p1, v3, v4, v5}, Ls0/d;->w(IJ)V

    .line 39
    invoke-virtual {p2}, Lx0/c;->i()Z

    move-result v3

    int-to-long v3, v3

    .line 40
    invoke-interface {p1, v2, v3, v4}, Ls0/d;->w(IJ)V

    .line 41
    invoke-virtual {p2}, Lx0/c;->c()J

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, Ls0/d;->w(IJ)V

    .line 42
    invoke-virtual {p2}, Lx0/c;->d()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Ls0/d;->w(IJ)V

    .line 43
    invoke-virtual {p2}, Lx0/c;->a()Lx0/d;

    move-result-object p2

    invoke-static {p2}, Lf1/x;->c(Lx0/d;)[B

    move-result-object p2

    if-nez p2, :cond_5

    .line 44
    invoke-interface {p1, v7}, Ls0/d;->k(I)V

    goto :goto_5

    .line 45
    :cond_5
    invoke-interface {p1, v7, p2}, Ls0/d;->C(I[B)V

    goto :goto_5

    .line 46
    :cond_6
    invoke-interface {p1, v6}, Ls0/d;->k(I)V

    .line 47
    invoke-interface {p1, v5}, Ls0/d;->k(I)V

    .line 48
    invoke-interface {p1, v4}, Ls0/d;->k(I)V

    .line 49
    invoke-interface {p1, v3}, Ls0/d;->k(I)V

    .line 50
    invoke-interface {p1, v2}, Ls0/d;->k(I)V

    .line 51
    invoke-interface {p1, v1}, Ls0/d;->k(I)V

    .line 52
    invoke-interface {p1, v0}, Ls0/d;->k(I)V

    .line 53
    invoke-interface {p1, v7}, Ls0/d;->k(I)V

    :goto_5
    return-void
.end method
