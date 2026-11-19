.class public Lp1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp1/d$a;
    }
.end annotation


# static fields
.field public static volatile i:Lp1/d;


# instance fields
.field public final a:Lt1/b;

.field public final b:Lt1/a;

.field public final c:Lr1/f;

.field public final d:Ls1/a$b;

.field public final e:Lv1/a$a;

.field public final f:Lv1/e;

.field public final g:Lu1/g;

.field public final h:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lt1/b;Lt1/a;Lr1/i;Ls1/a$b;Lv1/a$a;Lv1/e;Lu1/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp1/d;->h:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lp1/d;->a:Lt1/b;

    .line 7
    .line 8
    iput-object p3, p0, Lp1/d;->b:Lt1/a;

    .line 9
    .line 10
    iput-object p4, p0, Lp1/d;->c:Lr1/f;

    .line 11
    .line 12
    iput-object p5, p0, Lp1/d;->d:Ls1/a$b;

    .line 13
    .line 14
    iput-object p6, p0, Lp1/d;->e:Lv1/a$a;

    .line 15
    .line 16
    iput-object p7, p0, Lp1/d;->f:Lv1/e;

    .line 17
    .line 18
    iput-object p8, p0, Lp1/d;->g:Lu1/g;

    .line 19
    .line 20
    invoke-static {p4}, Lq1/c;->h(Lr1/i;)Lr1/i;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p2, p1}, Lt1/b;->t(Lr1/i;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public static k()Lp1/d;
    .locals 3

    .line 1
    sget-object v0, Lp1/d;->i:Lp1/d;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    const-class v0, Lp1/d;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lp1/d;->i:Lp1/d;

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    sget-object v1, Lcom/liulishuo/okdownload/OkDownloadProvider;->a:Landroid/content/Context;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    new-instance v2, Lp1/d$a;

    .line 17
    .line 18
    invoke-direct {v2, v1}, Lp1/d$a;-><init>(Landroid/content/Context;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2}, Lp1/d$a;->a()Lp1/d;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    sput-object v1, Lp1/d;->i:Lp1/d;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception v1

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 31
    .line 32
    const-string v2, "context == null"

    .line 33
    .line 34
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v1

    .line 38
    :cond_1
    :goto_0
    monitor-exit v0

    .line 39
    goto :goto_2

    .line 40
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    throw v1

    .line 42
    :cond_2
    :goto_2
    sget-object v0, Lp1/d;->i:Lp1/d;

    .line 43
    .line 44
    return-object v0
.end method


# virtual methods
.method public a()Lr1/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lp1/d;->c:Lr1/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()Lt1/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lp1/d;->b:Lt1/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()Ls1/a$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lp1/d;->d:Ls1/a$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lp1/d;->h:Landroid/content/Context;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()Lt1/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lp1/d;->a:Lt1/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()Lu1/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lp1/d;->g:Lu1/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public g()Lp1/b;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public h()Lv1/a$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lp1/d;->e:Lv1/a$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public i()Lv1/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lp1/d;->f:Lv1/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public j(Lp1/b;)V
    .locals 0

    .line 1
    return-void
.end method
