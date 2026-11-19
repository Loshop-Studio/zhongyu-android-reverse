.class public Lcom/zykj/message/server/bean/UserInfo;
.super Ljava/lang/Object;
.source "UserInfo.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/zykj/message/server/bean/UserInfo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private id:Ljava/lang/Long;

.field private password:Ljava/lang/String;

.field private photo:Ljava/lang/String;

.field private realName:Ljava/lang/String;

.field private role:Ljava/lang/Integer;

.field private schoolCode:Ljava/lang/String;

.field private userName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 117
    new-instance v0, Lcom/zykj/message/server/bean/UserInfo$1;

    invoke-direct {v0}, Lcom/zykj/message/server/bean/UserInfo$1;-><init>()V

    sput-object v0, Lcom/zykj/message/server/bean/UserInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 88
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/zykj/message/server/bean/UserInfo;->id:Ljava/lang/Long;

    const-string v0, ""

    .line 89
    iput-object v0, p0, Lcom/zykj/message/server/bean/UserInfo;->schoolCode:Ljava/lang/String;

    .line 90
    iput-object v0, p0, Lcom/zykj/message/server/bean/UserInfo;->userName:Ljava/lang/String;

    .line 91
    iput-object v0, p0, Lcom/zykj/message/server/bean/UserInfo;->realName:Ljava/lang/String;

    .line 92
    iput-object v0, p0, Lcom/zykj/message/server/bean/UserInfo;->password:Ljava/lang/String;

    .line 93
    iput-object v0, p0, Lcom/zykj/message/server/bean/UserInfo;->photo:Ljava/lang/String;

    const/4 v0, 0x0

    .line 94
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/zykj/message/server/bean/UserInfo;->role:Ljava/lang/Integer;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 108
    const-class v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    iput-object v0, p0, Lcom/zykj/message/server/bean/UserInfo;->id:Ljava/lang/Long;

    .line 109
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/zykj/message/server/bean/UserInfo;->schoolCode:Ljava/lang/String;

    .line 110
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/zykj/message/server/bean/UserInfo;->userName:Ljava/lang/String;

    .line 111
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/zykj/message/server/bean/UserInfo;->realName:Ljava/lang/String;

    .line 112
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/zykj/message/server/bean/UserInfo;->password:Ljava/lang/String;

    .line 113
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/zykj/message/server/bean/UserInfo;->photo:Ljava/lang/String;

    .line 114
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/zykj/message/server/bean/UserInfo;->role:Ljava/lang/Integer;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 0

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 98
    iput-object p1, p0, Lcom/zykj/message/server/bean/UserInfo;->id:Ljava/lang/Long;

    .line 99
    iput-object p2, p0, Lcom/zykj/message/server/bean/UserInfo;->schoolCode:Ljava/lang/String;

    .line 100
    iput-object p3, p0, Lcom/zykj/message/server/bean/UserInfo;->userName:Ljava/lang/String;

    .line 101
    iput-object p4, p0, Lcom/zykj/message/server/bean/UserInfo;->realName:Ljava/lang/String;

    .line 102
    iput-object p5, p0, Lcom/zykj/message/server/bean/UserInfo;->password:Ljava/lang/String;

    .line 103
    iput-object p6, p0, Lcom/zykj/message/server/bean/UserInfo;->photo:Ljava/lang/String;

    .line 104
    iput-object p7, p0, Lcom/zykj/message/server/bean/UserInfo;->role:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getId()Ljava/lang/Long;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/zykj/message/server/bean/UserInfo;->id:Ljava/lang/Long;

    return-object v0
.end method

.method public getPassword()Ljava/lang/String;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/zykj/message/server/bean/UserInfo;->password:Ljava/lang/String;

    return-object v0
.end method

.method public getPhoto()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/zykj/message/server/bean/UserInfo;->photo:Ljava/lang/String;

    return-object v0
.end method

.method public getRealName()Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/zykj/message/server/bean/UserInfo;->realName:Ljava/lang/String;

    return-object v0
.end method

.method public getRole()Ljava/lang/Integer;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/zykj/message/server/bean/UserInfo;->role:Ljava/lang/Integer;

    return-object v0
.end method

.method public getSchoolCode()Ljava/lang/String;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/zykj/message/server/bean/UserInfo;->schoolCode:Ljava/lang/String;

    return-object v0
.end method

.method public getUserName()Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/zykj/message/server/bean/UserInfo;->userName:Ljava/lang/String;

    return-object v0
.end method

.method public setId(Ljava/lang/Long;)V
    .locals 0

    .line 20
    iput-object p1, p0, Lcom/zykj/message/server/bean/UserInfo;->id:Ljava/lang/Long;

    return-void
.end method

.method public setPassword(Ljava/lang/String;)V
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/zykj/message/server/bean/UserInfo;->password:Ljava/lang/String;

    return-void
.end method

.method public setPhoto(Ljava/lang/String;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/zykj/message/server/bean/UserInfo;->photo:Ljava/lang/String;

    return-void
.end method

.method public setRealName(Ljava/lang/String;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/zykj/message/server/bean/UserInfo;->realName:Ljava/lang/String;

    return-void
.end method

.method public setRole(Ljava/lang/Integer;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/zykj/message/server/bean/UserInfo;->role:Ljava/lang/Integer;

    return-void
.end method

.method public setSchoolCode(Ljava/lang/String;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/zykj/message/server/bean/UserInfo;->schoolCode:Ljava/lang/String;

    return-void
.end method

.method public setUserName(Ljava/lang/String;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/zykj/message/server/bean/UserInfo;->userName:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 131
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UserInfo{id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/zykj/message/server/bean/UserInfo;->id:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", schoolCode=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/zykj/message/server/bean/UserInfo;->schoolCode:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", userName=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/zykj/message/server/bean/UserInfo;->userName:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", realName=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/zykj/message/server/bean/UserInfo;->realName:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", password=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/zykj/message/server/bean/UserInfo;->password:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", photo=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/zykj/message/server/bean/UserInfo;->photo:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", role="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/zykj/message/server/bean/UserInfo;->role:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 78
    iget-object p2, p0, Lcom/zykj/message/server/bean/UserInfo;->id:Ljava/lang/Long;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 79
    iget-object p2, p0, Lcom/zykj/message/server/bean/UserInfo;->schoolCode:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 80
    iget-object p2, p0, Lcom/zykj/message/server/bean/UserInfo;->userName:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 81
    iget-object p2, p0, Lcom/zykj/message/server/bean/UserInfo;->realName:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 82
    iget-object p2, p0, Lcom/zykj/message/server/bean/UserInfo;->password:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 83
    iget-object p2, p0, Lcom/zykj/message/server/bean/UserInfo;->photo:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 84
    iget-object p2, p0, Lcom/zykj/message/server/bean/UserInfo;->role:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
