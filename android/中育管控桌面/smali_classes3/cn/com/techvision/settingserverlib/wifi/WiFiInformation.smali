.class public Lcn/com/techvision/settingserverlib/wifi/WiFiInformation;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcn/com/techvision/settingserverlib/wifi/WiFiInformation;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:Lcn/com/techvision/settingserverlib/wifi/WiFiState;

.field public b:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcn/com/techvision/settingserverlib/wifi/WiFiInformation$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lcn/com/techvision/settingserverlib/wifi/WiFiInformation$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcn/com/techvision/settingserverlib/wifi/WiFiInformation;->CREATOR:Landroid/os/Parcelable$Creator;

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
    const-class v0, Lcn/com/techvision/settingserverlib/wifi/WiFiState;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lcn/com/techvision/settingserverlib/wifi/WiFiState;

    .line 15
    .line 16
    iput-object v0, p0, Lcn/com/techvision/settingserverlib/wifi/WiFiInformation;->a:Lcn/com/techvision/settingserverlib/wifi/WiFiState;

    .line 17
    .line 18
    sget-object v0, Lcn/com/techvision/settingserverlib/wifi/WiFiInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lcn/com/techvision/settingserverlib/wifi/WiFiInformation;->b:Ljava/util/List;

    .line 25
    .line 26
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
    iget-object v0, p0, Lcn/com/techvision/settingserverlib/wifi/WiFiInformation;->a:Lcn/com/techvision/settingserverlib/wifi/WiFiState;

    .line 2
    .line 3
    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Lcn/com/techvision/settingserverlib/wifi/WiFiInformation;->b:Ljava/util/List;

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
