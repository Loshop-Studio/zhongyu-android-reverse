.class public final Lcom/friday/common/entity/TokenResponse$Creator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/friday/common/entity/TokenResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/friday/common/entity/TokenResponse;",
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
.method public final createFromParcel(Landroid/os/Parcel;)Lcom/friday/common/entity/TokenResponse;
    .locals 5

    .line 1
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/friday/common/entity/TokenResponse;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_1

    move-object v2, v3

    goto :goto_1

    :cond_1
    sget-object v2, Lcom/friday/common/entity/ErrorRemote;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    :goto_1
    check-cast v2, Lcom/friday/common/entity/ErrorRemote;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    sget-object v3, Lcom/friday/common/entity/LoginResp;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v3, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v3

    :goto_2
    check-cast v3, Lcom/friday/common/entity/LoginResp;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/friday/common/entity/TokenResponse;-><init>(ZLcom/friday/common/entity/ErrorRemote;Lcom/friday/common/entity/LoginResp;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/friday/common/entity/TokenResponse$Creator;->createFromParcel(Landroid/os/Parcel;)Lcom/friday/common/entity/TokenResponse;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lcom/friday/common/entity/TokenResponse;
    .locals 0

    .line 1
    new-array p1, p1, [Lcom/friday/common/entity/TokenResponse;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/friday/common/entity/TokenResponse$Creator;->newArray(I)[Lcom/friday/common/entity/TokenResponse;

    move-result-object p1

    return-object p1
.end method
