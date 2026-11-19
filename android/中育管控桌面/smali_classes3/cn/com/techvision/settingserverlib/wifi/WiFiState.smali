.class public final enum Lcn/com/techvision/settingserverlib/wifi/WiFiState;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcn/com/techvision/settingserverlib/wifi/WiFiState;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcn/com/techvision/settingserverlib/wifi/WiFiState;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum b:Lcn/com/techvision/settingserverlib/wifi/WiFiState;

.field public static final enum c:Lcn/com/techvision/settingserverlib/wifi/WiFiState;

.field public static final enum d:Lcn/com/techvision/settingserverlib/wifi/WiFiState;

.field public static final enum e:Lcn/com/techvision/settingserverlib/wifi/WiFiState;

.field public static final enum f:Lcn/com/techvision/settingserverlib/wifi/WiFiState;

.field public static final synthetic g:[Lcn/com/techvision/settingserverlib/wifi/WiFiState;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lcn/com/techvision/settingserverlib/wifi/WiFiState;

    .line 2
    .line 3
    const-string v1, "DISABLED"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lcn/com/techvision/settingserverlib/wifi/WiFiState;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcn/com/techvision/settingserverlib/wifi/WiFiState;->b:Lcn/com/techvision/settingserverlib/wifi/WiFiState;

    .line 10
    .line 11
    new-instance v1, Lcn/com/techvision/settingserverlib/wifi/WiFiState;

    .line 12
    .line 13
    const-string v2, "DISABLING"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3, v3}, Lcn/com/techvision/settingserverlib/wifi/WiFiState;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lcn/com/techvision/settingserverlib/wifi/WiFiState;->c:Lcn/com/techvision/settingserverlib/wifi/WiFiState;

    .line 20
    .line 21
    new-instance v2, Lcn/com/techvision/settingserverlib/wifi/WiFiState;

    .line 22
    .line 23
    const-string v3, "ENABLED"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4, v4}, Lcn/com/techvision/settingserverlib/wifi/WiFiState;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    sput-object v2, Lcn/com/techvision/settingserverlib/wifi/WiFiState;->d:Lcn/com/techvision/settingserverlib/wifi/WiFiState;

    .line 30
    .line 31
    new-instance v3, Lcn/com/techvision/settingserverlib/wifi/WiFiState;

    .line 32
    .line 33
    const-string v4, "ENABLING"

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    invoke-direct {v3, v4, v5, v5}, Lcn/com/techvision/settingserverlib/wifi/WiFiState;-><init>(Ljava/lang/String;II)V

    .line 37
    .line 38
    .line 39
    sput-object v3, Lcn/com/techvision/settingserverlib/wifi/WiFiState;->e:Lcn/com/techvision/settingserverlib/wifi/WiFiState;

    .line 40
    .line 41
    new-instance v4, Lcn/com/techvision/settingserverlib/wifi/WiFiState;

    .line 42
    .line 43
    const-string v5, "UNKNOWN"

    .line 44
    .line 45
    const/4 v6, 0x4

    .line 46
    invoke-direct {v4, v5, v6, v6}, Lcn/com/techvision/settingserverlib/wifi/WiFiState;-><init>(Ljava/lang/String;II)V

    .line 47
    .line 48
    .line 49
    sput-object v4, Lcn/com/techvision/settingserverlib/wifi/WiFiState;->f:Lcn/com/techvision/settingserverlib/wifi/WiFiState;

    .line 50
    .line 51
    filled-new-array {v0, v1, v2, v3, v4}, [Lcn/com/techvision/settingserverlib/wifi/WiFiState;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, Lcn/com/techvision/settingserverlib/wifi/WiFiState;->g:[Lcn/com/techvision/settingserverlib/wifi/WiFiState;

    .line 56
    .line 57
    new-instance v0, Lcn/com/techvision/settingserverlib/wifi/WiFiState$a;

    .line 58
    .line 59
    invoke-direct {v0}, Lcn/com/techvision/settingserverlib/wifi/WiFiState$a;-><init>()V

    .line 60
    .line 61
    .line 62
    sput-object v0, Lcn/com/techvision/settingserverlib/wifi/WiFiState;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 63
    .line 64
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lcn/com/techvision/settingserverlib/wifi/WiFiState;->a:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcn/com/techvision/settingserverlib/wifi/WiFiState;
    .locals 1

    .line 1
    const-class v0, Lcn/com/techvision/settingserverlib/wifi/WiFiState;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcn/com/techvision/settingserverlib/wifi/WiFiState;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcn/com/techvision/settingserverlib/wifi/WiFiState;
    .locals 1

    .line 1
    sget-object v0, Lcn/com/techvision/settingserverlib/wifi/WiFiState;->g:[Lcn/com/techvision/settingserverlib/wifi/WiFiState;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcn/com/techvision/settingserverlib/wifi/WiFiState;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcn/com/techvision/settingserverlib/wifi/WiFiState;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    iget p2, p0, Lcn/com/techvision/settingserverlib/wifi/WiFiState;->a:I

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
