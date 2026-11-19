.class Lcom/tendcloud/tenddata/dq$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tendcloud/tenddata/dq;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tendcloud/tenddata/dq;


# direct methods
.method public constructor <init>(Lcom/tendcloud/tenddata/dq;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/dq$1;->this$0:Lcom/tendcloud/tenddata/dq;

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
    .locals 3

    .line 1
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/tendcloud/tenddata/ch;->C(Landroid/content/Context;)Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v1, Lcom/tendcloud/tenddata/el;

    .line 10
    .line 11
    invoke-direct {v1}, Lcom/tendcloud/tenddata/el;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v2, "env"

    .line 15
    .line 16
    iput-object v2, v1, Lcom/tendcloud/tenddata/el;->b:Ljava/lang/String;

    .line 17
    .line 18
    const-string v2, "arp"

    .line 19
    .line 20
    iput-object v2, v1, Lcom/tendcloud/tenddata/el;->c:Ljava/lang/String;

    .line 21
    .line 22
    iput-object v0, v1, Lcom/tendcloud/tenddata/el;->d:Ljava/util/Map;

    .line 23
    .line 24
    sget-object v0, Lcom/tendcloud/tenddata/a;->ENV:Lcom/tendcloud/tenddata/a;

    .line 25
    .line 26
    iput-object v0, v1, Lcom/tendcloud/tenddata/el;->a:Lcom/tendcloud/tenddata/a;

    .line 27
    .line 28
    invoke-static {}, Lcom/tendcloud/tenddata/cr;->a()Lcom/tendcloud/tenddata/cr;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0, v1}, Lcom/tendcloud/tenddata/cr;->post(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    :catchall_0
    :cond_0
    return-void
.end method
