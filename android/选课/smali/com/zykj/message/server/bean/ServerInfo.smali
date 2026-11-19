.class public Lcom/zykj/message/server/bean/ServerInfo;
.super Ljava/lang/Object;
.source "ServerInfo.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/zykj/message/server/bean/ServerInfo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private imToken:Ljava/lang/String;

.field private serverUrl:Ljava/lang/String;

.field private status:Lcom/zykj/message/server/bean/Status;

.field private token:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 80
    new-instance v0, Lcom/zykj/message/server/bean/ServerInfo$1;

    invoke-direct {v0}, Lcom/zykj/message/server/bean/ServerInfo$1;-><init>()V

    sput-object v0, Lcom/zykj/message/server/bean/ServerInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    sget-object v0, Lcom/zykj/message/server/bean/Status;->LOGOUT:Lcom/zykj/message/server/bean/Status;

    iput-object v0, p0, Lcom/zykj/message/server/bean/ServerInfo;->status:Lcom/zykj/message/server/bean/Status;

    const-string v0, ""

    .line 60
    iput-object v0, p0, Lcom/zykj/message/server/bean/ServerInfo;->serverUrl:Ljava/lang/String;

    .line 61
    iput-object v0, p0, Lcom/zykj/message/server/bean/ServerInfo;->token:Ljava/lang/String;

    .line 62
    iput-object v0, p0, Lcom/zykj/message/server/bean/ServerInfo;->imToken:Ljava/lang/String;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 74
    :cond_0
    invoke-static {}, Lcom/zykj/message/server/bean/Status;->values()[Lcom/zykj/message/server/bean/Status;

    move-result-object v1

    aget-object v0, v1, v0

    :goto_0
    iput-object v0, p0, Lcom/zykj/message/server/bean/ServerInfo;->status:Lcom/zykj/message/server/bean/Status;

    .line 75
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/zykj/message/server/bean/ServerInfo;->serverUrl:Ljava/lang/String;

    .line 76
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/zykj/message/server/bean/ServerInfo;->token:Ljava/lang/String;

    .line 77
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/zykj/message/server/bean/ServerInfo;->imToken:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/zykj/message/server/bean/Status;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    iput-object p1, p0, Lcom/zykj/message/server/bean/ServerInfo;->status:Lcom/zykj/message/server/bean/Status;

    .line 67
    iput-object p2, p0, Lcom/zykj/message/server/bean/ServerInfo;->serverUrl:Ljava/lang/String;

    .line 68
    iput-object p3, p0, Lcom/zykj/message/server/bean/ServerInfo;->token:Ljava/lang/String;

    .line 69
    iput-object p4, p0, Lcom/zykj/message/server/bean/ServerInfo;->imToken:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getIMToken()Ljava/lang/String;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/zykj/message/server/bean/ServerInfo;->imToken:Ljava/lang/String;

    return-object v0
.end method

.method public getServerUrl()Ljava/lang/String;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/zykj/message/server/bean/ServerInfo;->serverUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getStatus()Lcom/zykj/message/server/bean/Status;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/zykj/message/server/bean/ServerInfo;->status:Lcom/zykj/message/server/bean/Status;

    return-object v0
.end method

.method public getToken()Ljava/lang/String;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/zykj/message/server/bean/ServerInfo;->token:Ljava/lang/String;

    return-object v0
.end method

.method public setIMToken(Ljava/lang/String;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lcom/zykj/message/server/bean/ServerInfo;->imToken:Ljava/lang/String;

    return-void
.end method

.method public setServerUrl(Ljava/lang/String;)V
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/zykj/message/server/bean/ServerInfo;->serverUrl:Ljava/lang/String;

    return-void
.end method

.method public setStatus(Lcom/zykj/message/server/bean/Status;)V
    .locals 0

    .line 18
    iput-object p1, p0, Lcom/zykj/message/server/bean/ServerInfo;->status:Lcom/zykj/message/server/bean/Status;

    return-void
.end method

.method public setToken(Ljava/lang/String;)V
    .locals 0

    .line 34
    iput-object p1, p0, Lcom/zykj/message/server/bean/ServerInfo;->token:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 94
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ServerInfo{status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/zykj/message/server/bean/ServerInfo;->status:Lcom/zykj/message/server/bean/Status;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", serverUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/zykj/message/server/bean/ServerInfo;->serverUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", token=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/zykj/message/server/bean/ServerInfo;->token:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", imToken=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/zykj/message/server/bean/ServerInfo;->imToken:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

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

    .line 52
    iget-object p2, p0, Lcom/zykj/message/server/bean/ServerInfo;->status:Lcom/zykj/message/server/bean/Status;

    if-nez p2, :cond_0

    const/4 p2, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lcom/zykj/message/server/bean/Status;->ordinal()I

    move-result p2

    :goto_0
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 53
    iget-object p2, p0, Lcom/zykj/message/server/bean/ServerInfo;->serverUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 54
    iget-object p2, p0, Lcom/zykj/message/server/bean/ServerInfo;->token:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 55
    iget-object p2, p0, Lcom/zykj/message/server/bean/ServerInfo;->imToken:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
