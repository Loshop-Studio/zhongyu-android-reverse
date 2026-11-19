.class Lcom/tendcloud/tenddata/dm$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tendcloud/tenddata/dm;->b(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/tendcloud/tenddata/dm$d;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tendcloud/tenddata/dm;


# direct methods
.method public constructor <init>(Lcom/tendcloud/tenddata/dm;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/dm$1;->this$0:Lcom/tendcloud/tenddata/dm;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public compare(Lcom/tendcloud/tenddata/dm$d;Lcom/tendcloud/tenddata/dm$d;)I
    .locals 4

    .line 2
    iget-wide v0, p1, Lcom/tendcloud/tenddata/dm$d;->score:D

    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v0

    iget-wide v2, p2, Lcom/tendcloud/tenddata/dm$d;->score:D

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 3
    :cond_0
    iget-wide v0, p1, Lcom/tendcloud/tenddata/dm$d;->score:D

    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v0

    iget-wide p1, p2, Lcom/tendcloud/tenddata/dm$d;->score:D

    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide p1

    cmp-long p1, v0, p1

    if-gez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/tendcloud/tenddata/dm$d;

    check-cast p2, Lcom/tendcloud/tenddata/dm$d;

    invoke-virtual {p0, p1, p2}, Lcom/tendcloud/tenddata/dm$1;->compare(Lcom/tendcloud/tenddata/dm$d;Lcom/tendcloud/tenddata/dm$d;)I

    move-result p1

    return p1
.end method
