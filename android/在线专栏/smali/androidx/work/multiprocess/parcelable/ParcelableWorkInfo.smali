.class public Landroidx/work/multiprocess/parcelable/ParcelableWorkInfo;
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


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/work/multiprocess/parcelable/ParcelableWorkInfo;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:[Ljava/lang/String;


# instance fields
.field private final a:Lx0/v;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    .line 1
    sput-object v0, Landroidx/work/multiprocess/parcelable/ParcelableWorkInfo;->b:[Ljava/lang/String;

    .line 2
    new-instance v0, Landroidx/work/multiprocess/parcelable/ParcelableWorkInfo$a;

    invoke-direct {v0}, Landroidx/work/multiprocess/parcelable/ParcelableWorkInfo$a;-><init>()V

    sput-object v0, Landroidx/work/multiprocess/parcelable/ParcelableWorkInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 8

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v2

    .line 5
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-static {v0}, Lf1/x;->f(I)Lx0/v$a;

    move-result-object v3

    .line 6
    invoke-virtual {p1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v0

    invoke-static {v0}, Landroidx/work/a;->g([B)Landroidx/work/a;

    move-result-object v4

    .line 7
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    move-result-object v0

    .line 8
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    .line 9
    invoke-virtual {p1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v0

    invoke-static {v0}, Landroidx/work/a;->g([B)Landroidx/work/a;

    move-result-object v6

    .line 10
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v7

    .line 11
    new-instance p1, Lx0/v;

    move-object v1, p1

    invoke-direct/range {v1 .. v7}, Lx0/v;-><init>(Ljava/util/UUID;Lx0/v$a;Landroidx/work/a;Ljava/util/List;Landroidx/work/a;I)V

    iput-object p1, p0, Landroidx/work/multiprocess/parcelable/ParcelableWorkInfo;->a:Lx0/v;

    return-void
.end method

.method public constructor <init>(Lx0/v;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/work/multiprocess/parcelable/ParcelableWorkInfo;->a:Lx0/v;

    return-void
.end method


# virtual methods
.method public a()Lx0/v;
    .locals 1

    iget-object v0, p0, Landroidx/work/multiprocess/parcelable/ParcelableWorkInfo;->a:Lx0/v;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 1
    iget-object p2, p0, Landroidx/work/multiprocess/parcelable/ParcelableWorkInfo;->a:Lx0/v;

    invoke-virtual {p2}, Lx0/v;->a()Ljava/util/UUID;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 2
    iget-object p2, p0, Landroidx/work/multiprocess/parcelable/ParcelableWorkInfo;->a:Lx0/v;

    invoke-virtual {p2}, Lx0/v;->e()Lx0/v$a;

    move-result-object p2

    invoke-static {p2}, Lf1/x;->h(Lx0/v$a;)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 3
    iget-object p2, p0, Landroidx/work/multiprocess/parcelable/ParcelableWorkInfo;->a:Lx0/v;

    invoke-virtual {p2}, Lx0/v;->b()Landroidx/work/a;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/work/a;->l()[B

    move-result-object p2

    .line 4
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByteArray([B)V

    .line 5
    new-instance p2, Ljava/util/ArrayList;

    iget-object v0, p0, Landroidx/work/multiprocess/parcelable/ParcelableWorkInfo;->a:Lx0/v;

    invoke-virtual {v0}, Lx0/v;->f()Ljava/util/Set;

    move-result-object v0

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 6
    sget-object v0, Landroidx/work/multiprocess/parcelable/ParcelableWorkInfo;->b:[Ljava/lang/String;

    invoke-interface {p2, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    .line 7
    iget-object p2, p0, Landroidx/work/multiprocess/parcelable/ParcelableWorkInfo;->a:Lx0/v;

    invoke-virtual {p2}, Lx0/v;->c()Landroidx/work/a;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/work/a;->l()[B

    move-result-object p2

    .line 8
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByteArray([B)V

    .line 9
    iget-object p2, p0, Landroidx/work/multiprocess/parcelable/ParcelableWorkInfo;->a:Lx0/v;

    invoke-virtual {p2}, Lx0/v;->d()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
