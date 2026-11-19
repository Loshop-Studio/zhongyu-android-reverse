.class public final Lcom/zykj/student/dialogue/bean/req/CollectSessionReq$Creator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;
    .locals 7

    .line 1
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    sget-object v0, Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    invoke-direct/range {v1 .. v6}, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;-><init>(Ljava/lang/String;ILcom/zykj/student/dialogue/bean/req/JoinTimeReq;II)V

    return-object v1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq$Creator;->createFromParcel(Landroid/os/Parcel;)Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;
    .locals 0

    .line 1
    new-array p1, p1, [Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq$Creator;->newArray(I)[Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;

    move-result-object p1

    return-object p1
.end method
