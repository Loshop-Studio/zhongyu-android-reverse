.class final Lcom/tendcloud/tenddata/ea$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tendcloud/tenddata/fe;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tendcloud/tenddata/ea;->g(Lcom/tendcloud/tenddata/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field final synthetic val$features:Lcom/tendcloud/tenddata/a;


# direct methods
.method public constructor <init>(Lcom/tendcloud/tenddata/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/ea$2;->val$features:Lcom/tendcloud/tenddata/a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onStoreFailed()V
    .locals 0

    return-void
.end method

.method public onStoreSuccess()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/ea$2;->val$features:Lcom/tendcloud/tenddata/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v1, v0}, Lcom/tendcloud/tenddata/cb;->a(ZLcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    .line 7
    :catchall_0
    return-void
.end method
