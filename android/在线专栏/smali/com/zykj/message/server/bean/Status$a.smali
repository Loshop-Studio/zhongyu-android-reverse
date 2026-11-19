.class Lcom/zykj/message/server/bean/Status$a;
.super Ljava/lang/Object;
.source "SourceFile"

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

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/zykj/message/server/bean/Status;
    .locals 0

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/zykj/message/server/bean/Status;->valueOf(Ljava/lang/String;)Lcom/zykj/message/server/bean/Status;

    move-result-object p1

    return-object p1
.end method

.method public b(I)[Lcom/zykj/message/server/bean/Status;
    .locals 0

    new-array p1, p1, [Lcom/zykj/message/server/bean/Status;

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/zykj/message/server/bean/Status$a;->a(Landroid/os/Parcel;)Lcom/zykj/message/server/bean/Status;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/zykj/message/server/bean/Status$a;->b(I)[Lcom/zykj/message/server/bean/Status;

    move-result-object p1

    return-object p1
.end method
