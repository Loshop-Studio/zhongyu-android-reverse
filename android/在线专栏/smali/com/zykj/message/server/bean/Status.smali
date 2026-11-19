.class public final enum Lcom/zykj/message/server/bean/Status;
.super Ljava/lang/Enum;
.source "SourceFile"

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
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/zykj/message/server/bean/Status;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum b:Lcom/zykj/message/server/bean/Status;

.field public static final enum c:Lcom/zykj/message/server/bean/Status;

.field public static final enum d:Lcom/zykj/message/server/bean/Status;

.field private static final synthetic e:[Lcom/zykj/message/server/bean/Status;


# instance fields
.field private final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lcom/zykj/message/server/bean/Status;

    const-string v1, "LOGIN"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/zykj/message/server/bean/Status;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/zykj/message/server/bean/Status;->b:Lcom/zykj/message/server/bean/Status;

    new-instance v1, Lcom/zykj/message/server/bean/Status;

    const-string v4, "LOGOUT"

    invoke-direct {v1, v4, v3, v2}, Lcom/zykj/message/server/bean/Status;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/zykj/message/server/bean/Status;->c:Lcom/zykj/message/server/bean/Status;

    new-instance v4, Lcom/zykj/message/server/bean/Status;

    const-string v5, "CRACK"

    const/4 v6, 0x2

    const/4 v7, -0x1

    invoke-direct {v4, v5, v6, v7}, Lcom/zykj/message/server/bean/Status;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lcom/zykj/message/server/bean/Status;->d:Lcom/zykj/message/server/bean/Status;

    const/4 v5, 0x3

    new-array v5, v5, [Lcom/zykj/message/server/bean/Status;

    aput-object v0, v5, v2

    aput-object v1, v5, v3

    aput-object v4, v5, v6

    .line 2
    sput-object v5, Lcom/zykj/message/server/bean/Status;->e:[Lcom/zykj/message/server/bean/Status;

    .line 3
    new-instance v0, Lcom/zykj/message/server/bean/Status$a;

    invoke-direct {v0}, Lcom/zykj/message/server/bean/Status$a;-><init>()V

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

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput p3, p0, Lcom/zykj/message/server/bean/Status;->a:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/zykj/message/server/bean/Status;
    .locals 1

    const-class v0, Lcom/zykj/message/server/bean/Status;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/zykj/message/server/bean/Status;

    return-object p0
.end method

.method public static values()[Lcom/zykj/message/server/bean/Status;
    .locals 1

    sget-object v0, Lcom/zykj/message/server/bean/Status;->e:[Lcom/zykj/message/server/bean/Status;

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

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
