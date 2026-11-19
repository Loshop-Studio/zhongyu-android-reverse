.class public final enum Lb/d/a/d/c/b;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lb/d/a/d/c/b;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lb/d/a/d/c/b;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum b:Lb/d/a/d/c/b;

.field public static final enum c:Lb/d/a/d/c/b;

.field public static final enum d:Lb/d/a/d/c/b;

.field public static final synthetic e:[Lb/d/a/d/c/b;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    new-instance v0, Lb/d/a/d/c/b;

    const-string v1, "LOGIN"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lb/d/a/d/c/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lb/d/a/d/c/b;->b:Lb/d/a/d/c/b;

    new-instance v1, Lb/d/a/d/c/b;

    const-string v4, "LOGOUT"

    invoke-direct {v1, v4, v3, v2}, Lb/d/a/d/c/b;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lb/d/a/d/c/b;->c:Lb/d/a/d/c/b;

    new-instance v4, Lb/d/a/d/c/b;

    const-string v5, "CRACK"

    const/4 v6, 0x2

    const/4 v7, -0x1

    invoke-direct {v4, v5, v6, v7}, Lb/d/a/d/c/b;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lb/d/a/d/c/b;->d:Lb/d/a/d/c/b;

    const/4 v5, 0x3

    new-array v5, v5, [Lb/d/a/d/c/b;

    aput-object v0, v5, v2

    aput-object v1, v5, v3

    aput-object v4, v5, v6

    sput-object v5, Lb/d/a/d/c/b;->e:[Lb/d/a/d/c/b;

    new-instance v0, Lb/d/a/d/c/b$a;

    invoke-direct {v0}, Lb/d/a/d/c/b$a;-><init>()V

    sput-object v0, Lb/d/a/d/c/b;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lb/d/a/d/c/b;
    .locals 1

    const-class v0, Lb/d/a/d/c/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lb/d/a/d/c/b;

    return-object p0
.end method

.method public static values()[Lb/d/a/d/c/b;
    .locals 1

    sget-object v0, Lb/d/a/d/c/b;->e:[Lb/d/a/d/c/b;

    invoke-virtual {v0}, [Lb/d/a/d/c/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb/d/a/d/c/b;

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
