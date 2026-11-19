.class public Lw2/j;
.super Lw2/c;
.source "SourceFile"


# instance fields
.field public f:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "newumid"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lw2/c;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lw2/j;->f:Landroid/content/Context;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public i()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lw2/j;->f:Landroid/content/Context;

    .line 2
    .line 3
    const-string v1, "umid"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {v0, v1, v2}, Lcom/umeng/commonsdk/framework/a;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method
