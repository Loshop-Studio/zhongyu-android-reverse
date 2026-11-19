.class public Lt5/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt5/a;->e(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lt5/a;


# direct methods
.method public constructor <init>(Lt5/a;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lt5/a$a;->e:Lt5/a;

    .line 2
    .line 3
    iput-object p2, p0, Lt5/a$a;->c:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lt5/a$a;->d:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lt5/a$a;->e:Lt5/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lt5/a$a;->c:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0, v1}, Le5/a;->d(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, Lt5/a$a;->d:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    const-string v1, "HmsMessageService"

    .line 22
    .line 23
    const-string v2, "receive a new token, refresh the local token"

    .line 24
    .line 25
    invoke-static {v1, v2}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lt5/a$a;->c:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v2, p0, Lt5/a$a;->d:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v0, v1, v2}, Le5/a;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void
.end method
