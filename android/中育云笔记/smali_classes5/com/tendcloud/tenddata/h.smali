.class Lcom/tendcloud/tenddata/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/tenddata/h$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/tendcloud/tenddata/n;


# direct methods
.method public constructor <init>(Lcom/tendcloud/tenddata/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/tendcloud/tenddata/h;->a:Lcom/tendcloud/tenddata/n;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()Lcom/tendcloud/tenddata/s;
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Lcom/tendcloud/tenddata/s;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/tendcloud/tenddata/h;->a:Lcom/tendcloud/tenddata/n;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/tendcloud/tenddata/s;-><init>(Lcom/tendcloud/tenddata/n;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    return-object v0

    .line 9
    :catchall_0
    const/4 v0, 0x0

    .line 10
    return-object v0
.end method
