.class public final Landroidx/work/multiprocess/parcelable/ParcelableData;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "BanParcelableUsage"
    }
.end annotation

.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/work/multiprocess/parcelable/ParcelableData$Companion;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/work/multiprocess/parcelable/ParcelableData;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Landroidx/work/multiprocess/parcelable/ParcelableData$Companion;


# instance fields
.field private final data:Landroidx/work/Data;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/work/multiprocess/parcelable/ParcelableData$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/work/multiprocess/parcelable/ParcelableData$Companion;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/work/multiprocess/parcelable/ParcelableData;->Companion:Landroidx/work/multiprocess/parcelable/ParcelableData$Companion;

    .line 8
    .line 9
    new-instance v0, Landroidx/work/multiprocess/parcelable/ParcelableData$Companion$CREATOR$1;

    .line 10
    .line 11
    invoke-direct {v0}, Landroidx/work/multiprocess/parcelable/ParcelableData$Companion$CREATOR$1;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Landroidx/work/multiprocess/parcelable/ParcelableData;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    const-string v0, "inParcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object v0, Landroidx/work/Data;->Companion:Landroidx/work/Data$Companion;

    invoke-virtual {v0, p1}, Landroidx/work/Data$Companion;->fromByteArray([B)Landroidx/work/Data;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    sget-object p1, Landroidx/work/Data;->EMPTY:Landroidx/work/Data;

    :cond_1
    invoke-direct {p0, p1}, Landroidx/work/multiprocess/parcelable/ParcelableData;-><init>(Landroidx/work/Data;)V

    return-void
.end method

.method public constructor <init>(Landroidx/work/Data;)V
    .locals 1

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/work/multiprocess/parcelable/ParcelableData;->data:Landroidx/work/Data;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getData()Landroidx/work/Data;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/work/multiprocess/parcelable/ParcelableData;->data:Landroidx/work/Data;

    .line 2
    .line 3
    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    const-string p2, "parcel"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Landroidx/work/multiprocess/parcelable/ParcelableData;->data:Landroidx/work/Data;

    .line 7
    .line 8
    invoke-virtual {p2}, Landroidx/work/Data;->toByteArray()[B

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByteArray([B)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
