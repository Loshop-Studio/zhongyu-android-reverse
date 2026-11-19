.class Lcom/tendcloud/tenddata/l$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tendcloud/tenddata/l;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tendcloud/tenddata/l;


# direct methods
.method public constructor <init>(Lcom/tendcloud/tenddata/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/l$1;->this$0:Lcom/tendcloud/tenddata/l;

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
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/l$1;->this$0:Lcom/tendcloud/tenddata/l;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/tendcloud/tenddata/l;->a(Lcom/tendcloud/tenddata/l;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/tendcloud/tenddata/l$1;->this$0:Lcom/tendcloud/tenddata/l;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/l;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    :catchall_0
    :cond_0
    return-void
.end method
