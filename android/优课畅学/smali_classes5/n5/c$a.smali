.class public Ln5/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln5/c;->k(Ljava/lang/String;Lcom/tencent/rtmp/TXLivePlayer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ln5/c;


# direct methods
.method public constructor <init>(Ln5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ln5/c$a;->a:Ln5/c;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "net check loading count = "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Ln5/c$a;->a:Ln5/c;

    .line 12
    .line 13
    invoke-static {v1}, Ln5/c;->a(Ln5/c;)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, " loading time = "

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Ln5/c$a;->a:Ln5/c;

    .line 26
    .line 27
    invoke-static {v1}, Ln5/c;->c(Ln5/c;)J

    .line 28
    .line 29
    .line 30
    move-result-wide v1

    .line 31
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v1, "NetWatcher"

    .line 39
    .line 40
    invoke-static {v1, v0}, Lcom/tencent/rtmp/TXLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Ln5/c$a;->a:Ln5/c;

    .line 44
    .line 45
    invoke-static {v0}, Ln5/c;->a(Ln5/c;)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    const/4 v1, 0x3

    .line 50
    if-ge v0, v1, :cond_0

    .line 51
    .line 52
    iget-object v0, p0, Ln5/c$a;->a:Ln5/c;

    .line 53
    .line 54
    invoke-static {v0}, Ln5/c;->c(Ln5/c;)J

    .line 55
    .line 56
    .line 57
    move-result-wide v0

    .line 58
    const-wide/16 v2, 0x2710

    .line 59
    .line 60
    cmp-long v0, v0, v2

    .line 61
    .line 62
    if-ltz v0, :cond_1

    .line 63
    .line 64
    :cond_0
    iget-object v0, p0, Ln5/c$a;->a:Ln5/c;

    .line 65
    .line 66
    invoke-static {v0}, Ln5/c;->e(Ln5/c;)V

    .line 67
    .line 68
    .line 69
    :cond_1
    iget-object v0, p0, Ln5/c$a;->a:Ln5/c;

    .line 70
    .line 71
    const/4 v1, 0x0

    .line 72
    invoke-static {v0, v1}, Ln5/c;->b(Ln5/c;I)I

    .line 73
    .line 74
    .line 75
    iget-object v0, p0, Ln5/c$a;->a:Ln5/c;

    .line 76
    .line 77
    const-wide/16 v1, 0x0

    .line 78
    .line 79
    invoke-static {v0, v1, v2}, Ln5/c;->d(Ln5/c;J)J

    .line 80
    .line 81
    .line 82
    return-void
.end method
