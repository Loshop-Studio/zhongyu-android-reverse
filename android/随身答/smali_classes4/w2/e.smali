.class public Lw2/e;
.super Lw2/c;
.source "SourceFile"


# instance fields
.field public f:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "idfa"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lw2/c;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lw2/e;->f:Landroid/content/Context;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public i()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "header_tracking_idfa"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/umeng/commonsdk/config/a;->e(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lw2/e;->f:Landroid/content/Context;

    .line 10
    .line 11
    invoke-static {v0}, Lv2/g;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    if-nez v0, :cond_1

    .line 18
    .line 19
    const-string v0, ""

    .line 20
    .line 21
    :cond_1
    return-object v0
.end method
