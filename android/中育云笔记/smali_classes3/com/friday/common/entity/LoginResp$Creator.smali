.class public final Lcom/friday/common/entity/LoginResp$Creator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/friday/common/entity/LoginResp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/friday/common/entity/LoginResp;",
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
.method public final createFromParcel(Landroid/os/Parcel;)Lcom/friday/common/entity/LoginResp;
    .locals 14

    .line 1
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/friday/common/entity/LoginResp;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v7

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v9

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eqz v0, :cond_0

    move v0, v11

    move v11, v12

    goto :goto_0

    :cond_0
    move v0, v11

    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v13

    if-eqz v13, :cond_1

    goto :goto_1

    :cond_1
    move v12, v0

    :goto_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v13

    invoke-direct/range {v1 .. v13}, Lcom/friday/common/entity/LoginResp;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;JILjava/lang/String;ZZLjava/lang/String;)V

    return-object v1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/friday/common/entity/LoginResp$Creator;->createFromParcel(Landroid/os/Parcel;)Lcom/friday/common/entity/LoginResp;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lcom/friday/common/entity/LoginResp;
    .locals 0

    .line 1
    new-array p1, p1, [Lcom/friday/common/entity/LoginResp;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/friday/common/entity/LoginResp$Creator;->newArray(I)[Lcom/friday/common/entity/LoginResp;

    move-result-object p1

    return-object p1
.end method
