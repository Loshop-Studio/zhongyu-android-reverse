.class public final enum Lcn/com/techvision/settingserverlib/wifi/SSIDState;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcn/com/techvision/settingserverlib/wifi/SSIDState;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcn/com/techvision/settingserverlib/wifi/SSIDState;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum b:Lcn/com/techvision/settingserverlib/wifi/SSIDState;

.field public static final enum c:Lcn/com/techvision/settingserverlib/wifi/SSIDState;

.field public static final enum d:Lcn/com/techvision/settingserverlib/wifi/SSIDState;

.field public static final enum e:Lcn/com/techvision/settingserverlib/wifi/SSIDState;

.field public static final enum f:Lcn/com/techvision/settingserverlib/wifi/SSIDState;

.field public static final enum g:Lcn/com/techvision/settingserverlib/wifi/SSIDState;

.field public static final enum h:Lcn/com/techvision/settingserverlib/wifi/SSIDState;

.field public static final synthetic i:[Lcn/com/techvision/settingserverlib/wifi/SSIDState;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lcn/com/techvision/settingserverlib/wifi/SSIDState;

    .line 2
    .line 3
    const-string v1, "CONNECTED"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lcn/com/techvision/settingserverlib/wifi/SSIDState;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcn/com/techvision/settingserverlib/wifi/SSIDState;->b:Lcn/com/techvision/settingserverlib/wifi/SSIDState;

    .line 10
    .line 11
    new-instance v1, Lcn/com/techvision/settingserverlib/wifi/SSIDState;

    .line 12
    .line 13
    const-string v2, "CONNECTING"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3, v3}, Lcn/com/techvision/settingserverlib/wifi/SSIDState;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lcn/com/techvision/settingserverlib/wifi/SSIDState;->c:Lcn/com/techvision/settingserverlib/wifi/SSIDState;

    .line 20
    .line 21
    new-instance v2, Lcn/com/techvision/settingserverlib/wifi/SSIDState;

    .line 22
    .line 23
    const-string v3, "DISCONNECTING"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4, v4}, Lcn/com/techvision/settingserverlib/wifi/SSIDState;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    sput-object v2, Lcn/com/techvision/settingserverlib/wifi/SSIDState;->d:Lcn/com/techvision/settingserverlib/wifi/SSIDState;

    .line 30
    .line 31
    new-instance v3, Lcn/com/techvision/settingserverlib/wifi/SSIDState;

    .line 32
    .line 33
    const-string v4, "DISCONNECTED"

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    invoke-direct {v3, v4, v5, v5}, Lcn/com/techvision/settingserverlib/wifi/SSIDState;-><init>(Ljava/lang/String;II)V

    .line 37
    .line 38
    .line 39
    sput-object v3, Lcn/com/techvision/settingserverlib/wifi/SSIDState;->e:Lcn/com/techvision/settingserverlib/wifi/SSIDState;

    .line 40
    .line 41
    new-instance v4, Lcn/com/techvision/settingserverlib/wifi/SSIDState;

    .line 42
    .line 43
    const-string v5, "SUSPENDED"

    .line 44
    .line 45
    const/4 v6, 0x4

    .line 46
    invoke-direct {v4, v5, v6, v6}, Lcn/com/techvision/settingserverlib/wifi/SSIDState;-><init>(Ljava/lang/String;II)V

    .line 47
    .line 48
    .line 49
    sput-object v4, Lcn/com/techvision/settingserverlib/wifi/SSIDState;->f:Lcn/com/techvision/settingserverlib/wifi/SSIDState;

    .line 50
    .line 51
    new-instance v5, Lcn/com/techvision/settingserverlib/wifi/SSIDState;

    .line 52
    .line 53
    const-string v6, "SAVED"

    .line 54
    .line 55
    const/4 v7, 0x5

    .line 56
    invoke-direct {v5, v6, v7, v7}, Lcn/com/techvision/settingserverlib/wifi/SSIDState;-><init>(Ljava/lang/String;II)V

    .line 57
    .line 58
    .line 59
    sput-object v5, Lcn/com/techvision/settingserverlib/wifi/SSIDState;->g:Lcn/com/techvision/settingserverlib/wifi/SSIDState;

    .line 60
    .line 61
    new-instance v6, Lcn/com/techvision/settingserverlib/wifi/SSIDState;

    .line 62
    .line 63
    const-string v7, "NONE"

    .line 64
    .line 65
    const/4 v8, 0x6

    .line 66
    invoke-direct {v6, v7, v8, v8}, Lcn/com/techvision/settingserverlib/wifi/SSIDState;-><init>(Ljava/lang/String;II)V

    .line 67
    .line 68
    .line 69
    sput-object v6, Lcn/com/techvision/settingserverlib/wifi/SSIDState;->h:Lcn/com/techvision/settingserverlib/wifi/SSIDState;

    .line 70
    .line 71
    filled-new-array/range {v0 .. v6}, [Lcn/com/techvision/settingserverlib/wifi/SSIDState;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    sput-object v0, Lcn/com/techvision/settingserverlib/wifi/SSIDState;->i:[Lcn/com/techvision/settingserverlib/wifi/SSIDState;

    .line 76
    .line 77
    new-instance v0, Lcn/com/techvision/settingserverlib/wifi/SSIDState$a;

    .line 78
    .line 79
    invoke-direct {v0}, Lcn/com/techvision/settingserverlib/wifi/SSIDState$a;-><init>()V

    .line 80
    .line 81
    .line 82
    sput-object v0, Lcn/com/techvision/settingserverlib/wifi/SSIDState;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 83
    .line 84
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lcn/com/techvision/settingserverlib/wifi/SSIDState;->a:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcn/com/techvision/settingserverlib/wifi/SSIDState;
    .locals 1

    .line 1
    const-class v0, Lcn/com/techvision/settingserverlib/wifi/SSIDState;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcn/com/techvision/settingserverlib/wifi/SSIDState;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcn/com/techvision/settingserverlib/wifi/SSIDState;
    .locals 1

    .line 1
    sget-object v0, Lcn/com/techvision/settingserverlib/wifi/SSIDState;->i:[Lcn/com/techvision/settingserverlib/wifi/SSIDState;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcn/com/techvision/settingserverlib/wifi/SSIDState;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcn/com/techvision/settingserverlib/wifi/SSIDState;

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
    iget p2, p0, Lcn/com/techvision/settingserverlib/wifi/SSIDState;->a:I

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
