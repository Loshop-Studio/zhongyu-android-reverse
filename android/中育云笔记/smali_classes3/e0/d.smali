.class public final Le0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/aliyun/ams/emas/push/notification/CPushMessage;
    .locals 2

    .line 1
    new-instance v0, Lcom/aliyun/ams/emas/push/notification/CPushMessage;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, v1}, Lcom/aliyun/ams/emas/push/notification/CPushMessage;-><init>(Landroid/os/Parcel;Le0/d;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public b(I)[Lcom/aliyun/ams/emas/push/notification/CPushMessage;
    .locals 0

    .line 1
    new-array p1, p1, [Lcom/aliyun/ams/emas/push/notification/CPushMessage;

    .line 2
    .line 3
    return-object p1
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Le0/d;->a(Landroid/os/Parcel;)Lcom/aliyun/ams/emas/push/notification/CPushMessage;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Le0/d;->b(I)[Lcom/aliyun/ams/emas/push/notification/CPushMessage;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
