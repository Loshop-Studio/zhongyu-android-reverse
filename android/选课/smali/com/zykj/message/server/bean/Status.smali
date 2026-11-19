.class public final enum Lcom/zykj/message/server/bean/Status;
.super Ljava/lang/Enum;
.source "Status.java"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/zykj/message/server/bean/Status;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/zykj/message/server/bean/Status;

.field public static final enum CRACK:Lcom/zykj/message/server/bean/Status;

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/zykj/message/server/bean/Status;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum LOGIN:Lcom/zykj/message/server/bean/Status;

.field public static final enum LOGOUT:Lcom/zykj/message/server/bean/Status;


# instance fields
.field private final status:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 13
    new-instance v0, Lcom/zykj/message/server/bean/Status;

    const-string v1, "LOGIN"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/zykj/message/server/bean/Status;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/zykj/message/server/bean/Status;->LOGIN:Lcom/zykj/message/server/bean/Status;

    new-instance v1, Lcom/zykj/message/server/bean/Status;

    const-string v4, "LOGOUT"

    invoke-direct {v1, v4, v3, v2}, Lcom/zykj/message/server/bean/Status;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/zykj/message/server/bean/Status;->LOGOUT:Lcom/zykj/message/server/bean/Status;

    new-instance v4, Lcom/zykj/message/server/bean/Status;

    const-string v5, "CRACK"

    const/4 v6, 0x2

    const/4 v7, -0x1

    invoke-direct {v4, v5, v6, v7}, Lcom/zykj/message/server/bean/Status;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lcom/zykj/message/server/bean/Status;->CRACK:Lcom/zykj/message/server/bean/Status;

    const/4 v5, 0x3

    new-array v5, v5, [Lcom/zykj/message/server/bean/Status;

    aput-object v0, v5, v2

    aput-object v1, v5, v3

    aput-object v4, v5, v6

    .line 12
    sput-object v5, Lcom/zykj/message/server/bean/Status;->$VALUES:[Lcom/zykj/message/server/bean/Status;

    .line 47
    new-instance v0, Lcom/zykj/message/server/bean/Status$1;

    invoke-direct {v0}, Lcom/zykj/message/server/bean/Status$1;-><init>()V

    sput-object v0, Lcom/zykj/message/server/bean/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 17
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 18
    iput p3, p0, Lcom/zykj/message/server/bean/Status;->status:I

    return-void
.end method

.method public static getStatus(I)Lcom/zykj/message/server/bean/Status;
    .locals 6

    .line 25
    sget-object v0, Lcom/zykj/message/server/bean/Status;->LOGOUT:Lcom/zykj/message/server/bean/Status;

    .line 27
    invoke-static {}, Lcom/zykj/message/server/bean/Status;->values()[Lcom/zykj/message/server/bean/Status;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    .line 28
    invoke-virtual {v4}, Lcom/zykj/message/server/bean/Status;->getStatusCode()I

    move-result v5

    if-ne v5, p0, :cond_0

    move-object v0, v4

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/zykj/message/server/bean/Status;
    .locals 1

    .line 12
    const-class v0, Lcom/zykj/message/server/bean/Status;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/zykj/message/server/bean/Status;

    return-object p0
.end method

.method public static values()[Lcom/zykj/message/server/bean/Status;
    .locals 1

    .line 12
    sget-object v0, Lcom/zykj/message/server/bean/Status;->$VALUES:[Lcom/zykj/message/server/bean/Status;

    invoke-virtual {v0}, [Lcom/zykj/message/server/bean/Status;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/zykj/message/server/bean/Status;

    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getStatusCode()I
    .locals 1

    .line 22
    iget v0, p0, Lcom/zykj/message/server/bean/Status;->status:I

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 39
    invoke-virtual {p0}, Lcom/zykj/message/server/bean/Status;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
