.class final Lcom/tendcloud/tenddata/by$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tendcloud/tenddata/by;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/tendcloud/tenddata/by;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/tendcloud/tenddata/by;
    .locals 1

    .line 2
    :try_start_0
    new-instance v0, Lcom/tendcloud/tenddata/by;

    invoke-direct {v0, p1}, Lcom/tendcloud/tenddata/by;-><init>(Landroid/os/Parcel;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/tendcloud/tenddata/by$1;->createFromParcel(Landroid/os/Parcel;)Lcom/tendcloud/tenddata/by;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Lcom/tendcloud/tenddata/by;
    .locals 0

    .line 2
    :try_start_0
    new-array p1, p1, [Lcom/tendcloud/tenddata/by;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/tendcloud/tenddata/by$1;->newArray(I)[Lcom/tendcloud/tenddata/by;

    move-result-object p1

    return-object p1
.end method
