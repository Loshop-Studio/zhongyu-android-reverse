.class public Ln5/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/ref/WeakReference;

.field public b:Ljava/lang/ref/WeakReference;

.field public c:I

.field public d:Ljava/lang/String;

.field public e:J

.field public f:J

.field public g:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Ln5/c;->c:I

    .line 6
    .line 7
    const-string v0, ""

    .line 8
    .line 9
    iput-object v0, p0, Ln5/c;->d:Ljava/lang/String;

    .line 10
    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    iput-wide v0, p0, Ln5/c;->e:J

    .line 14
    .line 15
    iput-wide v0, p0, Ln5/c;->f:J

    .line 16
    .line 17
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 18
    .line 19
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Ln5/c;->a:Ljava/lang/ref/WeakReference;

    .line 23
    .line 24
    return-void
.end method

.method public static synthetic a(Ln5/c;)I
    .locals 0

    .line 1
    iget p0, p0, Ln5/c;->c:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic b(Ln5/c;I)I
    .locals 0

    .line 1
    iput p1, p0, Ln5/c;->c:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic c(Ln5/c;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Ln5/c;->e:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static synthetic d(Ln5/c;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Ln5/c;->e:J

    .line 2
    .line 3
    return-wide p1
.end method

.method public static synthetic e(Ln5/c;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ln5/c;->j()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic f(Ln5/c;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 1
    iget-object p0, p0, Ln5/c;->b:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic g(Ln5/c;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ln5/c;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public h()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Ln5/c;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Ln5/c;->c:I

    .line 6
    .line 7
    add-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    iput v0, p0, Ln5/c;->c:I

    .line 10
    .line 11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iput-wide v0, p0, Ln5/c;->f:J

    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public i()V
    .locals 8

    .line 1
    iget-boolean v0, p0, Ln5/c;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-wide v0, p0, Ln5/c;->f:J

    .line 6
    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    cmp-long v0, v0, v2

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-wide v0, p0, Ln5/c;->e:J

    .line 14
    .line 15
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 16
    .line 17
    .line 18
    move-result-wide v4

    .line 19
    iget-wide v6, p0, Ln5/c;->f:J

    .line 20
    .line 21
    sub-long/2addr v4, v6

    .line 22
    add-long/2addr v0, v4

    .line 23
    iput-wide v0, p0, Ln5/c;->e:J

    .line 24
    .line 25
    iput-wide v2, p0, Ln5/c;->f:J

    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final j()V
    .locals 4

    .line 1
    iget-object v0, p0, Ln5/c;->a:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/content/Context;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance v1, Landroid/app/AlertDialog$Builder;

    .line 13
    .line 14
    invoke-direct {v1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, "\u68c0\u6d4b\u5230\u60a8\u7684\u7f51\u7edc\u8f83\u5dee\uff0c\u5efa\u8bae\u5207\u6362\u6e05\u6670\u5ea6"

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Landroid/app/AlertDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    new-instance v2, Ln5/c$b;

    .line 27
    .line 28
    invoke-direct {v2, p0, v0}, Ln5/c$b;-><init>(Ln5/c;Landroid/content/Context;)V

    .line 29
    .line 30
    .line 31
    const/4 v0, -0x3

    .line 32
    const-string v3, "OK"

    .line 33
    .line 34
    invoke-virtual {v1, v0, v3, v2}, Landroid/app/AlertDialog;->setButton(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Landroid/app/Dialog;->show()V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public k(Ljava/lang/String;Lcom/tencent/rtmp/TXLivePlayer;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ln5/c;->g:Z

    .line 3
    .line 4
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ln5/c;->b:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    iput-object p1, p0, Ln5/c;->d:Ljava/lang/String;

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    iput p1, p0, Ln5/c;->c:I

    .line 15
    .line 16
    const-wide/16 p1, 0x0

    .line 17
    .line 18
    iput-wide p1, p0, Ln5/c;->e:J

    .line 19
    .line 20
    iput-wide p1, p0, Ln5/c;->f:J

    .line 21
    .line 22
    const-string p1, "NetWatcher"

    .line 23
    .line 24
    const-string p2, "net check start watch "

    .line 25
    .line 26
    invoke-static {p1, p2}, Lcom/tencent/rtmp/TXLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    new-instance p1, Landroid/os/Handler;

    .line 30
    .line 31
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 36
    .line 37
    .line 38
    new-instance p2, Ln5/c$a;

    .line 39
    .line 40
    invoke-direct {p2, p0}, Ln5/c$a;-><init>(Ln5/c;)V

    .line 41
    .line 42
    .line 43
    const-wide/16 v0, 0x7530

    .line 44
    .line 45
    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public l()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Ln5/c;->g:Z

    .line 3
    .line 4
    iput v0, p0, Ln5/c;->c:I

    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    iput-wide v0, p0, Ln5/c;->e:J

    .line 9
    .line 10
    iput-wide v0, p0, Ln5/c;->f:J

    .line 11
    .line 12
    const-string v0, ""

    .line 13
    .line 14
    iput-object v0, p0, Ln5/c;->d:Ljava/lang/String;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput-object v0, p0, Ln5/c;->b:Ljava/lang/ref/WeakReference;

    .line 18
    .line 19
    const-string v0, "NetWatcher"

    .line 20
    .line 21
    const-string v1, "net check stop watch"

    .line 22
    .line 23
    invoke-static {v0, v1}, Lcom/tencent/rtmp/TXLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method
