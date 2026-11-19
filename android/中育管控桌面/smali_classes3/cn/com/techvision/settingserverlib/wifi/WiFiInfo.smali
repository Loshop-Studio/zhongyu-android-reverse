.class public Lcn/com/techvision/settingserverlib/wifi/WiFiInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcn/com/techvision/settingserverlib/wifi/WiFiInfo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:Ljava/lang/String;

.field public b:I

.field public c:Lcn/com/techvision/settingserverlib/wifi/CipherType;

.field public d:Lcn/com/techvision/settingserverlib/wifi/SSIDState;

.field public e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcn/com/techvision/settingserverlib/wifi/WiFiInfo$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lcn/com/techvision/settingserverlib/wifi/WiFiInfo$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcn/com/techvision/settingserverlib/wifi/WiFiInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lcn/com/techvision/settingserverlib/wifi/WiFiInfo;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iput v0, p0, Lcn/com/techvision/settingserverlib/wifi/WiFiInfo;->b:I

    .line 15
    .line 16
    const-class v0, Lcn/com/techvision/settingserverlib/wifi/CipherType;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Lcn/com/techvision/settingserverlib/wifi/CipherType;

    .line 27
    .line 28
    iput-object v0, p0, Lcn/com/techvision/settingserverlib/wifi/WiFiInfo;->c:Lcn/com/techvision/settingserverlib/wifi/CipherType;

    .line 29
    .line 30
    const-class v0, Lcn/com/techvision/settingserverlib/wifi/SSIDState;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Lcn/com/techvision/settingserverlib/wifi/SSIDState;

    .line 41
    .line 42
    iput-object v0, p0, Lcn/com/techvision/settingserverlib/wifi/WiFiInfo;->d:Lcn/com/techvision/settingserverlib/wifi/SSIDState;

    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_0

    .line 49
    .line 50
    const/4 p1, 0x1

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    const/4 p1, 0x0

    .line 53
    :goto_0
    iput-boolean p1, p0, Lcn/com/techvision/settingserverlib/wifi/WiFiInfo;->e:Z

    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcn/com/techvision/settingserverlib/wifi/WiFiInfo;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lcn/com/techvision/settingserverlib/wifi/WiFiInfo;->b:I

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcn/com/techvision/settingserverlib/wifi/WiFiInfo;->c:Lcn/com/techvision/settingserverlib/wifi/CipherType;

    .line 12
    .line 13
    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcn/com/techvision/settingserverlib/wifi/WiFiInfo;->d:Lcn/com/techvision/settingserverlib/wifi/SSIDState;

    .line 17
    .line 18
    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 19
    .line 20
    .line 21
    iget-boolean p2, p0, Lcn/com/techvision/settingserverlib/wifi/WiFiInfo;->e:Z

    .line 22
    .line 23
    int-to-byte p2, p2

    .line 24
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 25
    .line 26
    .line 27
    return-void
.end method
