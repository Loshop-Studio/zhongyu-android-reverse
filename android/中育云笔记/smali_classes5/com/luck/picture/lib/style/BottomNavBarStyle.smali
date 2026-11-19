.class public Lcom/luck/picture/lib/style/BottomNavBarStyle;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/luck/picture/lib/style/BottomNavBarStyle;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public c:I

.field public d:I

.field public e:I

.field public f:Ljava/lang/String;

.field public g:I

.field public h:I

.field public i:Ljava/lang/String;

.field public j:I

.field public k:Ljava/lang/String;

.field public l:I

.field public m:I

.field public n:I

.field public o:Ljava/lang/String;

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:I

.field public u:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/luck/picture/lib/style/BottomNavBarStyle$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/luck/picture/lib/style/BottomNavBarStyle$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->u:Z

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->u:Z

    .line 5
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->c:I

    .line 6
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->d:I

    .line 7
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->e:I

    .line 8
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->f:Ljava/lang/String;

    .line 9
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->g:I

    .line 10
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->h:I

    .line 11
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->i:Ljava/lang/String;

    .line 12
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->j:I

    .line 13
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->k:Ljava/lang/String;

    .line 14
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->l:I

    .line 15
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->m:I

    .line 16
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->n:I

    .line 17
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->o:Ljava/lang/String;

    .line 18
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->p:I

    .line 19
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->q:I

    .line 20
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->r:I

    .line 21
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->s:I

    .line 22
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->t:I

    .line 23
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->u:Z

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->k:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->m:I

    .line 2
    .line 3
    return v0
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->l:I

    .line 2
    .line 3
    return v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public g()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public h()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public i()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->n:I

    .line 2
    .line 3
    return v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->o:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public k()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->q:I

    .line 2
    .line 3
    return v0
.end method

.method public l()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->p:I

    .line 2
    .line 3
    return v0
.end method

.method public m()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public n()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public o()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public p()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public q()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->i:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public r()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->j:I

    .line 2
    .line 3
    return v0
.end method

.method public s()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->r:I

    .line 2
    .line 3
    return v0
.end method

.method public t()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->t:I

    .line 2
    .line 3
    return v0
.end method

.method public u()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->s:I

    .line 2
    .line 3
    return v0
.end method

.method public v()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->u:Z

    .line 2
    .line 3
    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    iget p2, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->c:I

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 4
    .line 5
    .line 6
    iget p2, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->d:I

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 9
    .line 10
    .line 11
    iget p2, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->e:I

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 14
    .line 15
    .line 16
    iget-object p2, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->f:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget p2, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->g:I

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 24
    .line 25
    .line 26
    iget p2, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->h:I

    .line 27
    .line 28
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 29
    .line 30
    .line 31
    iget-object p2, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->i:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget p2, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->j:I

    .line 37
    .line 38
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 39
    .line 40
    .line 41
    iget-object p2, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->k:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget p2, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->l:I

    .line 47
    .line 48
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 49
    .line 50
    .line 51
    iget p2, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->m:I

    .line 52
    .line 53
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 54
    .line 55
    .line 56
    iget p2, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->n:I

    .line 57
    .line 58
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 59
    .line 60
    .line 61
    iget-object p2, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->o:Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iget p2, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->p:I

    .line 67
    .line 68
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 69
    .line 70
    .line 71
    iget p2, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->q:I

    .line 72
    .line 73
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 74
    .line 75
    .line 76
    iget p2, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->r:I

    .line 77
    .line 78
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 79
    .line 80
    .line 81
    iget p2, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->s:I

    .line 82
    .line 83
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 84
    .line 85
    .line 86
    iget p2, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->t:I

    .line 87
    .line 88
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 89
    .line 90
    .line 91
    iget-boolean p2, p0, Lcom/luck/picture/lib/style/BottomNavBarStyle;->u:Z

    .line 92
    .line 93
    int-to-byte p2, p2

    .line 94
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 95
    .line 96
    .line 97
    return-void
.end method
