.class public Landroidx/work/multiprocess/parcelable/ParcelableConstraints;
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
            "Landroidx/work/multiprocess/parcelable/ParcelableConstraints;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lx0/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/work/multiprocess/parcelable/ParcelableConstraints$a;

    invoke-direct {v0}, Landroidx/work/multiprocess/parcelable/ParcelableConstraints$a;-><init>()V

    sput-object v0, Landroidx/work/multiprocess/parcelable/ParcelableConstraints;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 4

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Lx0/c$a;

    invoke-direct {v0}, Lx0/c$a;-><init>()V

    .line 5
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    invoke-static {v1}, Lf1/x;->e(I)Lx0/o;

    move-result-object v1

    .line 6
    invoke-virtual {v0, v1}, Lx0/c$a;->c(Lx0/o;)Lx0/c$a;

    .line 7
    invoke-static {p1}, Lj1/b;->a(Landroid/os/Parcel;)Z

    move-result v1

    .line 8
    invoke-virtual {v0, v1}, Lx0/c$a;->d(Z)Lx0/c$a;

    .line 9
    invoke-static {p1}, Lj1/b;->a(Landroid/os/Parcel;)Z

    move-result v1

    .line 10
    invoke-virtual {v0, v1}, Lx0/c$a;->e(Z)Lx0/c$a;

    .line 11
    invoke-static {p1}, Lj1/b;->a(Landroid/os/Parcel;)Z

    move-result v1

    .line 12
    invoke-virtual {v0, v1}, Lx0/c$a;->g(Z)Lx0/c$a;

    .line 13
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x17

    if-lt v1, v2, :cond_0

    .line 14
    invoke-static {p1}, Lj1/b;->a(Landroid/os/Parcel;)Z

    move-result v2

    .line 15
    invoke-virtual {v0, v2}, Lx0/c$a;->f(Z)Lx0/c$a;

    :cond_0
    const/16 v2, 0x18

    if-lt v1, v2, :cond_2

    .line 16
    invoke-static {p1}, Lj1/b;->a(Landroid/os/Parcel;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 17
    invoke-virtual {p1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v1

    invoke-static {v1}, Lf1/x;->b([B)Lx0/d;

    move-result-object v1

    .line 18
    invoke-virtual {v1}, Lx0/d;->b()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx0/d$a;

    .line 19
    invoke-virtual {v2}, Lx0/d$a;->a()Landroid/net/Uri;

    move-result-object v3

    .line 20
    invoke-virtual {v2}, Lx0/d$a;->b()Z

    move-result v2

    .line 21
    invoke-virtual {v0, v3, v2}, Lx0/c$a;->a(Landroid/net/Uri;Z)Lx0/c$a;

    goto :goto_0

    .line 22
    :cond_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v1

    .line 23
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lx0/c$a;->h(JLjava/util/concurrent/TimeUnit;)Lx0/c$a;

    .line 24
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v1

    .line 25
    invoke-virtual {v0, v1, v2, v3}, Lx0/c$a;->i(JLjava/util/concurrent/TimeUnit;)Lx0/c$a;

    .line 26
    :cond_2
    invoke-virtual {v0}, Lx0/c$a;->b()Lx0/c;

    move-result-object p1

    iput-object p1, p0, Landroidx/work/multiprocess/parcelable/ParcelableConstraints;->a:Lx0/c;

    return-void
.end method

.method public constructor <init>(Lx0/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/work/multiprocess/parcelable/ParcelableConstraints;->a:Lx0/c;

    return-void
.end method


# virtual methods
.method public a()Lx0/c;
    .locals 1

    iget-object v0, p0, Landroidx/work/multiprocess/parcelable/ParcelableConstraints;->a:Lx0/c;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    iget-object p2, p0, Landroidx/work/multiprocess/parcelable/ParcelableConstraints;->a:Lx0/c;

    invoke-virtual {p2}, Lx0/c;->b()Lx0/o;

    move-result-object p2

    invoke-static {p2}, Lf1/x;->g(Lx0/o;)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 2
    iget-object p2, p0, Landroidx/work/multiprocess/parcelable/ParcelableConstraints;->a:Lx0/c;

    invoke-virtual {p2}, Lx0/c;->f()Z

    move-result p2

    invoke-static {p1, p2}, Lj1/b;->b(Landroid/os/Parcel;Z)V

    .line 3
    iget-object p2, p0, Landroidx/work/multiprocess/parcelable/ParcelableConstraints;->a:Lx0/c;

    invoke-virtual {p2}, Lx0/c;->g()Z

    move-result p2

    invoke-static {p1, p2}, Lj1/b;->b(Landroid/os/Parcel;Z)V

    .line 4
    iget-object p2, p0, Landroidx/work/multiprocess/parcelable/ParcelableConstraints;->a:Lx0/c;

    invoke-virtual {p2}, Lx0/c;->i()Z

    move-result p2

    invoke-static {p1, p2}, Lj1/b;->b(Landroid/os/Parcel;Z)V

    .line 5
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x17

    if-lt p2, v0, :cond_0

    .line 6
    iget-object v0, p0, Landroidx/work/multiprocess/parcelable/ParcelableConstraints;->a:Lx0/c;

    invoke-virtual {v0}, Lx0/c;->h()Z

    move-result v0

    invoke-static {p1, v0}, Lj1/b;->b(Landroid/os/Parcel;Z)V

    :cond_0
    const/16 v0, 0x18

    if-lt p2, v0, :cond_2

    .line 7
    iget-object p2, p0, Landroidx/work/multiprocess/parcelable/ParcelableConstraints;->a:Lx0/c;

    invoke-virtual {p2}, Lx0/c;->e()Z

    move-result p2

    .line 8
    invoke-static {p1, p2}, Lj1/b;->b(Landroid/os/Parcel;Z)V

    if-eqz p2, :cond_1

    .line 9
    iget-object p2, p0, Landroidx/work/multiprocess/parcelable/ParcelableConstraints;->a:Lx0/c;

    invoke-virtual {p2}, Lx0/c;->a()Lx0/d;

    move-result-object p2

    .line 10
    invoke-static {p2}, Lf1/x;->c(Lx0/d;)[B

    move-result-object p2

    .line 11
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByteArray([B)V

    .line 12
    :cond_1
    iget-object p2, p0, Landroidx/work/multiprocess/parcelable/ParcelableConstraints;->a:Lx0/c;

    invoke-virtual {p2}, Lx0/c;->d()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 13
    iget-object p2, p0, Landroidx/work/multiprocess/parcelable/ParcelableConstraints;->a:Lx0/c;

    invoke-virtual {p2}, Lx0/c;->c()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    :cond_2
    return-void
.end method
