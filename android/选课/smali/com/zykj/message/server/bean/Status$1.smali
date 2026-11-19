.class Lcom/zykj/message/server/bean/Status$1;
.super Ljava/lang/Object;
.source "Status.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/message/server/bean/Status;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/zykj/message/server/bean/Status;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/zykj/message/server/bean/Status;
    .locals 0

    .line 50
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/zykj/message/server/bean/Status;->valueOf(Ljava/lang/String;)Lcom/zykj/message/server/bean/Status;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 47
    invoke-virtual {p0, p1}, Lcom/zykj/message/server/bean/Status$1;->createFromParcel(Landroid/os/Parcel;)Lcom/zykj/message/server/bean/Status;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Lcom/zykj/message/server/bean/Status;
    .locals 0

    .line 55
    new-array p1, p1, [Lcom/zykj/message/server/bean/Status;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 47
    invoke-virtual {p0, p1}, Lcom/zykj/message/server/bean/Status$1;->newArray(I)[Lcom/zykj/message/server/bean/Status;

    move-result-object p1

    return-object p1
.end method
