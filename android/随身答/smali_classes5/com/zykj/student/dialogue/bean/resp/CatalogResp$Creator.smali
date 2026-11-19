.class public final Lcom/zykj/student/dialogue/bean/resp/CatalogResp$Creator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/student/dialogue/bean/resp/CatalogResp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/zykj/student/dialogue/bean/resp/CatalogResp;",
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
.method public final createFromParcel(Landroid/os/Parcel;)Lcom/zykj/student/dialogue/bean/resp/CatalogResp;
    .locals 11

    .line 1
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v2

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v0, :cond_0

    move v0, v5

    move v5, v6

    move v7, v5

    goto :goto_0

    :cond_0
    move v0, v5

    move v7, v6

    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    move v8, v7

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v7

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v9

    if-eqz v9, :cond_1

    goto :goto_1

    :cond_1
    move v8, v0

    :goto_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v9

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v10

    invoke-direct/range {v1 .. v10}, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;-><init>(JLjava/lang/String;ZIIZII)V

    return-object v1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/student/dialogue/bean/resp/CatalogResp$Creator;->createFromParcel(Landroid/os/Parcel;)Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lcom/zykj/student/dialogue/bean/resp/CatalogResp;
    .locals 0

    .line 1
    new-array p1, p1, [Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/student/dialogue/bean/resp/CatalogResp$Creator;->newArray(I)[Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    move-result-object p1

    return-object p1
.end method
