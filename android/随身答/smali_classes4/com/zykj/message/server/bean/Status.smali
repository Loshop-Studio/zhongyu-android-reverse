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

.field public static final synthetic e:[Lcom/zykj/message/server/bean/Status;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lcom/zykj/message/server/bean/Status;

    .line 2
    .line 3
    const-string v1, "LOGIN"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-direct {v0, v1, v2, v3}, Lcom/zykj/message/server/bean/Status;-><init>(Ljava/lang/String;II)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/zykj/message/server/bean/Status;->b:Lcom/zykj/message/server/bean/Status;

    .line 11
    .line 12
    new-instance v1, Lcom/zykj/message/server/bean/Status;

    .line 13
    .line 14
    const-string v4, "LOGOUT"

    .line 15
    .line 16
    invoke-direct {v1, v4, v3, v2}, Lcom/zykj/message/server/bean/Status;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lcom/zykj/message/server/bean/Status;->c:Lcom/zykj/message/server/bean/Status;

    .line 20
    .line 21
    new-instance v2, Lcom/zykj/message/server/bean/Status;

    .line 22
    .line 23
    const/4 v3, 0x2

    .line 24
    const/4 v4, -0x1

    .line 25
    const-string v5, "CRACK"

    .line 26
    .line 27
    invoke-direct {v2, v5, v3, v4}, Lcom/zykj/message/server/bean/Status;-><init>(Ljava/lang/String;II)V

    .line 28
    .line 29
    .line 30
    sput-object v2, Lcom/zykj/message/server/bean/Status;->d:Lcom/zykj/message/server/bean/Status;

    .line 31
    .line 32
    filled-new-array {v0, v1, v2}, [Lcom/zykj/message/server/bean/Status;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sput-object v0, Lcom/zykj/message/server/bean/Status;->e:[Lcom/zykj/message/server/bean/Status;

    .line 37
    .line 38
    new-instance v0, Lcom/zykj/message/server/bean/Status$a;

    .line 39
    .line 40
    invoke-direct {v0}, Lcom/zykj/message/server/bean/Status$a;-><init>()V

    .line 41
    .line 42
    .line 43
    sput-object v0, Lcom/zykj/message/server/bean/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 44
    .line 45
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lcom/zykj/message/server/bean/Status;->a:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/zykj/message/server/bean/Status;
    .locals 1

    .line 1
    const-class v0, Lcom/zykj/message/server/bean/Status;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/zykj/message/server/bean/Status;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/zykj/message/server/bean/Status;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/message/server/bean/Status;->e:[Lcom/zykj/message/server/bean/Status;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/zykj/message/server/bean/Status;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/zykj/message/server/bean/Status;

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
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
