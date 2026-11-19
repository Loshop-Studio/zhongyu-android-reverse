.class Lcom/tendcloud/tenddata/do$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tendcloud/tenddata/do;->b(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/tendcloud/tenddata/do$a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tendcloud/tenddata/do;


# direct methods
.method public constructor <init>(Lcom/tendcloud/tenddata/do;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/do$1;->this$0:Lcom/tendcloud/tenddata/do;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public compare(Lcom/tendcloud/tenddata/do$a;Lcom/tendcloud/tenddata/do$a;)I
    .locals 3

    .line 2
    iget-wide v0, p1, Lcom/tendcloud/tenddata/do$a;->score:D

    iget-wide p1, p2, Lcom/tendcloud/tenddata/do$a;->score:D

    cmpl-double v2, v0, p1

    if-nez v2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    cmpg-double p1, v0, p1

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
    check-cast p1, Lcom/tendcloud/tenddata/do$a;

    check-cast p2, Lcom/tendcloud/tenddata/do$a;

    invoke-virtual {p0, p1, p2}, Lcom/tendcloud/tenddata/do$1;->compare(Lcom/tendcloud/tenddata/do$a;Lcom/tendcloud/tenddata/do$a;)I

    move-result p1

    return p1
.end method
