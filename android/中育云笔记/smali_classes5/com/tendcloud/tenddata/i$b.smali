.class Lcom/tendcloud/tenddata/i$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tendcloud/tenddata/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private final mHashCode:I


# direct methods
.method public constructor <init>(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    xor-int/2addr p1, p2

    .line 13
    iput p1, p0, Lcom/tendcloud/tenddata/i$b;->mHashCode:I

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    instance-of v1, p1, Lcom/tendcloud/tenddata/i$b;

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    iget v1, p0, Lcom/tendcloud/tenddata/i$b;->mHashCode:I

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    if-ne v1, p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    return p1

    .line 16
    :catchall_0
    :cond_0
    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/tendcloud/tenddata/i$b;->mHashCode:I

    .line 2
    .line 3
    return v0
.end method
