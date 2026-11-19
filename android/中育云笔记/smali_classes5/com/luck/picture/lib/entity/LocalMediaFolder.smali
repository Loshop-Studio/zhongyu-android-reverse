.class public Lcom/luck/picture/lib/entity/LocalMediaFolder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/luck/picture/lib/entity/LocalMediaFolder;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public c:J

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:I

.field public h:Z

.field public i:Ljava/util/ArrayList;

.field public j:I

.field public k:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/luck/picture/lib/entity/LocalMediaFolder$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/luck/picture/lib/entity/LocalMediaFolder$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/luck/picture/lib/entity/LocalMediaFolder;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 2
    iput-wide v0, p0, Lcom/luck/picture/lib/entity/LocalMediaFolder;->c:J

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/luck/picture/lib/entity/LocalMediaFolder;->i:Ljava/util/ArrayList;

    const/4 v0, 0x1

    .line 4
    iput v0, p0, Lcom/luck/picture/lib/entity/LocalMediaFolder;->j:I

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 6
    iput-wide v0, p0, Lcom/luck/picture/lib/entity/LocalMediaFolder;->c:J

    .line 7
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/luck/picture/lib/entity/LocalMediaFolder;->i:Ljava/util/ArrayList;

    const/4 v0, 0x1

    .line 8
    iput v0, p0, Lcom/luck/picture/lib/entity/LocalMediaFolder;->j:I

    .line 9
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/luck/picture/lib/entity/LocalMediaFolder;->c:J

    .line 10
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/luck/picture/lib/entity/LocalMediaFolder;->d:Ljava/lang/String;

    .line 11
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/luck/picture/lib/entity/LocalMediaFolder;->e:Ljava/lang/String;

    .line 12
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/luck/picture/lib/entity/LocalMediaFolder;->f:Ljava/lang/String;

    .line 13
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lcom/luck/picture/lib/entity/LocalMediaFolder;->g:I

    .line 14
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    iput-boolean v1, p0, Lcom/luck/picture/lib/entity/LocalMediaFolder;->h:Z

    .line 15
    sget-object v1, Lcom/luck/picture/lib/entity/LocalMedia;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, p0, Lcom/luck/picture/lib/entity/LocalMediaFolder;->i:Ljava/util/ArrayList;

    .line 16
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lcom/luck/picture/lib/entity/LocalMediaFolder;->j:I

    .line 17
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    move v0, v2

    :goto_1
    iput-boolean v0, p0, Lcom/luck/picture/lib/entity/LocalMediaFolder;->k:Z

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/luck/picture/lib/entity/LocalMediaFolder;->c:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/entity/LocalMediaFolder;->j:I

    .line 2
    .line 3
    return v0
.end method

.method public c()Ljava/util/ArrayList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/entity/LocalMediaFolder;->i:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/entity/LocalMediaFolder;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/entity/LocalMediaFolder;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/entity/LocalMediaFolder;->d:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string v0, "unknown"

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/luck/picture/lib/entity/LocalMediaFolder;->d:Ljava/lang/String;

    .line 13
    .line 14
    return-object v0
.end method

.method public j()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/entity/LocalMediaFolder;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public k()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/luck/picture/lib/entity/LocalMediaFolder;->k:Z

    .line 2
    .line 3
    return v0
.end method

.method public l()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/luck/picture/lib/entity/LocalMediaFolder;->h:Z

    .line 2
    .line 3
    return v0
.end method

.method public m(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/luck/picture/lib/entity/LocalMediaFolder;->c:J

    .line 2
    .line 3
    return-void
.end method

.method public n(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/luck/picture/lib/entity/LocalMediaFolder;->j:I

    .line 2
    .line 3
    return-void
.end method

.method public o(Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/entity/LocalMediaFolder;->i:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-void
.end method

.method public p(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/entity/LocalMediaFolder;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public q(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/entity/LocalMediaFolder;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public r(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/entity/LocalMediaFolder;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public s(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/luck/picture/lib/entity/LocalMediaFolder;->g:I

    .line 2
    .line 3
    return-void
.end method

.method public t(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/luck/picture/lib/entity/LocalMediaFolder;->k:Z

    .line 2
    .line 3
    return-void
.end method

.method public u(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/luck/picture/lib/entity/LocalMediaFolder;->h:Z

    .line 2
    .line 3
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/luck/picture/lib/entity/LocalMediaFolder;->c:J

    .line 2
    .line 3
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Lcom/luck/picture/lib/entity/LocalMediaFolder;->d:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p2, p0, Lcom/luck/picture/lib/entity/LocalMediaFolder;->e:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object p2, p0, Lcom/luck/picture/lib/entity/LocalMediaFolder;->f:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget p2, p0, Lcom/luck/picture/lib/entity/LocalMediaFolder;->g:I

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 24
    .line 25
    .line 26
    iget-boolean p2, p0, Lcom/luck/picture/lib/entity/LocalMediaFolder;->h:Z

    .line 27
    .line 28
    int-to-byte p2, p2

    .line 29
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 30
    .line 31
    .line 32
    iget-object p2, p0, Lcom/luck/picture/lib/entity/LocalMediaFolder;->i:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 35
    .line 36
    .line 37
    iget p2, p0, Lcom/luck/picture/lib/entity/LocalMediaFolder;->j:I

    .line 38
    .line 39
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 40
    .line 41
    .line 42
    iget-boolean p2, p0, Lcom/luck/picture/lib/entity/LocalMediaFolder;->k:Z

    .line 43
    .line 44
    int-to-byte p2, p2

    .line 45
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 46
    .line 47
    .line 48
    return-void
.end method
