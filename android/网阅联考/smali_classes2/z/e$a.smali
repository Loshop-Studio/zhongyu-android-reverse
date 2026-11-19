.class public Lz/e$a;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lz/e;


# direct methods
.method public constructor <init>(Lz/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz/e$a;->a:Lz/e;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 1
    iget-object p2, p0, Lz/e$a;->a:Lz/e;

    .line 2
    .line 3
    iget-boolean v0, p2, Lz/e;->c:Z

    .line 4
    .line 5
    invoke-virtual {p2, p1}, Lz/e;->j(Landroid/content/Context;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iput-boolean p1, p2, Lz/e;->c:Z

    .line 10
    .line 11
    iget-object p1, p0, Lz/e$a;->a:Lz/e;

    .line 12
    .line 13
    iget-boolean p1, p1, Lz/e;->c:Z

    .line 14
    .line 15
    if-eq v0, p1, :cond_1

    .line 16
    .line 17
    const-string p1, "ConnectivityMonitor"

    .line 18
    .line 19
    const/4 p2, 0x3

    .line 20
    invoke-static {p1, p2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    new-instance p1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string p2, "connectivity changed, isConnected: "

    .line 32
    .line 33
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object p2, p0, Lz/e$a;->a:Lz/e;

    .line 37
    .line 38
    iget-boolean p2, p2, Lz/e;->c:Z

    .line 39
    .line 40
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    :cond_0
    iget-object p1, p0, Lz/e$a;->a:Lz/e;

    .line 44
    .line 45
    iget-object p2, p1, Lz/e;->b:Lz/c$a;

    .line 46
    .line 47
    iget-boolean p1, p1, Lz/e;->c:Z

    .line 48
    .line 49
    invoke-interface {p2, p1}, Lz/c$a;->a(Z)V

    .line 50
    .line 51
    .line 52
    :cond_1
    return-void
.end method
