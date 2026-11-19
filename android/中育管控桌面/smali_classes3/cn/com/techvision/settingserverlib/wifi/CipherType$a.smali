.class public Lcn/com/techvision/settingserverlib/wifi/CipherType$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcn/com/techvision/settingserverlib/wifi/CipherType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


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
.method public a(Landroid/os/Parcel;)Lcn/com/techvision/settingserverlib/wifi/CipherType;
    .locals 1

    .line 1
    invoke-static {}, Lcn/com/techvision/settingserverlib/wifi/CipherType;->values()[Lcn/com/techvision/settingserverlib/wifi/CipherType;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    aget-object p1, v0, p1

    .line 10
    .line 11
    return-object p1
.end method

.method public b(I)[Lcn/com/techvision/settingserverlib/wifi/CipherType;
    .locals 0

    .line 1
    new-array p1, p1, [Lcn/com/techvision/settingserverlib/wifi/CipherType;

    .line 2
    .line 3
    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcn/com/techvision/settingserverlib/wifi/CipherType$a;->a(Landroid/os/Parcel;)Lcn/com/techvision/settingserverlib/wifi/CipherType;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcn/com/techvision/settingserverlib/wifi/CipherType$a;->b(I)[Lcn/com/techvision/settingserverlib/wifi/CipherType;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
