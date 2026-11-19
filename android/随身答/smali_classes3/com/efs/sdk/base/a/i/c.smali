.class public final Lcom/efs/sdk/base/a/i/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "https://errlog.umeng.com/api/crashsdk/logcollect"

    .line 5
    .line 6
    iput-object v0, p0, Lcom/efs/sdk/base/a/i/c;->a:Ljava/lang/String;

    .line 7
    .line 8
    const-string v0, "28ef1713347d"

    .line 9
    .line 10
    iput-object v0, p0, Lcom/efs/sdk/base/a/i/c;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {}, Lcom/efs/sdk/base/a/d/a;->a()Lcom/efs/sdk/base/a/c/a;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v0, v0, Lcom/efs/sdk/base/a/c/a;->c:Landroid/content/Context;

    .line 17
    .line 18
    invoke-static {v0}, Lcom/efs/sdk/base/a/h/h;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Lcom/efs/sdk/base/a/i/c;->c:Ljava/lang/String;

    .line 23
    .line 24
    return-void
.end method
