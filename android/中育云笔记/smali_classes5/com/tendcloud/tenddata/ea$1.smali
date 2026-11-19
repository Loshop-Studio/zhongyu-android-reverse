.class final Lcom/tendcloud/tenddata/ea$1;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tendcloud/tenddata/ea;->f(Lcom/tendcloud/tenddata/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field final synthetic val$feature:Lcom/tendcloud/tenddata/a;


# direct methods
.method public constructor <init>(Lcom/tendcloud/tenddata/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/ea$1;->val$feature:Lcom/tendcloud/tenddata/a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/tendcloud/tenddata/ce;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/tendcloud/tenddata/ea$1;->val$feature:Lcom/tendcloud/tenddata/a;

    .line 5
    .line 6
    invoke-static {v0}, Lcom/tendcloud/tenddata/ea;->a(Lcom/tendcloud/tenddata/a;)V

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lcom/tendcloud/tenddata/ea;->b()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/tendcloud/tenddata/ea$1;->val$feature:Lcom/tendcloud/tenddata/a;

    .line 13
    .line 14
    invoke-static {v0}, Lcom/tendcloud/tenddata/ea;->b(Lcom/tendcloud/tenddata/a;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
