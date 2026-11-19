.class public final Lcom/zykj/study/bean/TokenResponse;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/zykj/study/bean/TokenResponse;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final error:Lcom/zykj/study/bean/ErrorRemote;

.field private final result:Lcom/zykj/study/bean/LoginResp;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        alternate = {
            "result"
        }
        value = "data"
    .end annotation
.end field

.field private final success:Z

.field private final targetUrl:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/study/bean/TokenResponse$Creator;

    invoke-direct {v0}, Lcom/zykj/study/bean/TokenResponse$Creator;-><init>()V

    sput-object v0, Lcom/zykj/study/bean/TokenResponse;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/study/bean/TokenResponse;->$stable:I

    return-void
.end method

.method public constructor <init>(ZLcom/zykj/study/bean/ErrorRemote;Lcom/zykj/study/bean/LoginResp;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lcom/zykj/study/bean/TokenResponse;->success:Z

    .line 5
    .line 6
    iput-object p2, p0, Lcom/zykj/study/bean/TokenResponse;->error:Lcom/zykj/study/bean/ErrorRemote;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/zykj/study/bean/TokenResponse;->result:Lcom/zykj/study/bean/LoginResp;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/zykj/study/bean/TokenResponse;->targetUrl:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/study/bean/TokenResponse;ZLcom/zykj/study/bean/ErrorRemote;Lcom/zykj/study/bean/LoginResp;Ljava/lang/String;ILjava/lang/Object;)Lcom/zykj/study/bean/TokenResponse;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-boolean p1, p0, Lcom/zykj/study/bean/TokenResponse;->success:Z

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/zykj/study/bean/TokenResponse;->error:Lcom/zykj/study/bean/ErrorRemote;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/zykj/study/bean/TokenResponse;->result:Lcom/zykj/study/bean/LoginResp;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/zykj/study/bean/TokenResponse;->targetUrl:Ljava/lang/String;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/zykj/study/bean/TokenResponse;->copy(ZLcom/zykj/study/bean/ErrorRemote;Lcom/zykj/study/bean/LoginResp;Ljava/lang/String;)Lcom/zykj/study/bean/TokenResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/study/bean/TokenResponse;->success:Z

    return v0
.end method

.method public final component2()Lcom/zykj/study/bean/ErrorRemote;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/TokenResponse;->error:Lcom/zykj/study/bean/ErrorRemote;

    return-object v0
.end method

.method public final component3()Lcom/zykj/study/bean/LoginResp;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/TokenResponse;->result:Lcom/zykj/study/bean/LoginResp;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/TokenResponse;->targetUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(ZLcom/zykj/study/bean/ErrorRemote;Lcom/zykj/study/bean/LoginResp;Ljava/lang/String;)Lcom/zykj/study/bean/TokenResponse;
    .locals 1

    new-instance v0, Lcom/zykj/study/bean/TokenResponse;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/zykj/study/bean/TokenResponse;-><init>(ZLcom/zykj/study/bean/ErrorRemote;Lcom/zykj/study/bean/LoginResp;Ljava/lang/String;)V

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/study/bean/TokenResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/bean/TokenResponse;

    iget-boolean v1, p0, Lcom/zykj/study/bean/TokenResponse;->success:Z

    iget-boolean v3, p1, Lcom/zykj/study/bean/TokenResponse;->success:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/zykj/study/bean/TokenResponse;->error:Lcom/zykj/study/bean/ErrorRemote;

    iget-object v3, p1, Lcom/zykj/study/bean/TokenResponse;->error:Lcom/zykj/study/bean/ErrorRemote;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/study/bean/TokenResponse;->result:Lcom/zykj/study/bean/LoginResp;

    iget-object v3, p1, Lcom/zykj/study/bean/TokenResponse;->result:Lcom/zykj/study/bean/LoginResp;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/zykj/study/bean/TokenResponse;->targetUrl:Ljava/lang/String;

    iget-object p1, p1, Lcom/zykj/study/bean/TokenResponse;->targetUrl:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getError()Lcom/zykj/study/bean/ErrorRemote;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/TokenResponse;->error:Lcom/zykj/study/bean/ErrorRemote;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getResult()Lcom/zykj/study/bean/LoginResp;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/TokenResponse;->result:Lcom/zykj/study/bean/LoginResp;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSuccess()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/study/bean/TokenResponse;->success:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getTargetUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/TokenResponse;->targetUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lcom/zykj/study/bean/TokenResponse;->success:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/TokenResponse;->error:Lcom/zykj/study/bean/ErrorRemote;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/zykj/study/bean/ErrorRemote;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/TokenResponse;->result:Lcom/zykj/study/bean/LoginResp;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/zykj/study/bean/LoginResp;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/TokenResponse;->targetUrl:Ljava/lang/String;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-boolean v0, p0, Lcom/zykj/study/bean/TokenResponse;->success:Z

    iget-object v1, p0, Lcom/zykj/study/bean/TokenResponse;->error:Lcom/zykj/study/bean/ErrorRemote;

    iget-object v2, p0, Lcom/zykj/study/bean/TokenResponse;->result:Lcom/zykj/study/bean/LoginResp;

    iget-object v3, p0, Lcom/zykj/study/bean/TokenResponse;->targetUrl:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "TokenResponse(success="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", error="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", result="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", targetUrl="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/zykj/study/bean/TokenResponse;->success:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/zykj/study/bean/TokenResponse;->error:Lcom/zykj/study/bean/ErrorRemote;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/zykj/study/bean/ErrorRemote;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    iget-object v0, p0, Lcom/zykj/study/bean/TokenResponse;->result:Lcom/zykj/study/bean/LoginResp;

    if-nez v0, :cond_1

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/zykj/study/bean/LoginResp;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_1
    iget-object p2, p0, Lcom/zykj/study/bean/TokenResponse;->targetUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
