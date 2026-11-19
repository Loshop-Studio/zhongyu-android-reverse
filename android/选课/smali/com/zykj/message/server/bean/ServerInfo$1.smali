.class Lcom/zykj/message/server/bean/ServerInfo$1;
.super Ljava/lang/Object;
.source "ServerInfo.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/message/server/bean/ServerInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/zykj/message/server/bean/ServerInfo;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/zykj/message/server/bean/ServerInfo;
    .locals 1

    .line 83
    new-instance v0, Lcom/zykj/message/server/bean/ServerInfo;

    invoke-direct {v0, p1}, Lcom/zykj/message/server/bean/ServerInfo;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 80
    invoke-virtual {p0, p1}, Lcom/zykj/message/server/bean/ServerInfo$1;->createFromParcel(Landroid/os/Parcel;)Lcom/zykj/message/server/bean/ServerInfo;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Lcom/zykj/message/server/bean/ServerInfo;
    .locals 0

    .line 88
    new-array p1, p1, [Lcom/zykj/message/server/bean/ServerInfo;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 80
    invoke-virtual {p0, p1}, Lcom/zykj/message/server/bean/ServerInfo$1;->newArray(I)[Lcom/zykj/message/server/bean/ServerInfo;

    move-result-object p1

    return-object p1
.end method
