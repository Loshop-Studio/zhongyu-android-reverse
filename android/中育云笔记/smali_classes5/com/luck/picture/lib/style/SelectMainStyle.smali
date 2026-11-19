.class public Lcom/luck/picture/lib/style/SelectMainStyle;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/luck/picture/lib/style/SelectMainStyle;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public A:I

.field public B:Z

.field public C:I

.field public D:I

.field public E:I

.field public F:[I

.field public G:I

.field public H:I

.field public I:I

.field public J:[I

.field public K:I

.field public L:I

.field public M:I

.field public N:Ljava/lang/String;

.field public O:I

.field public P:I

.field public Q:I

.field public R:I

.field public S:I

.field public T:[I

.field public U:I

.field public V:[I

.field public W:I

.field public X:I

.field public Y:I

.field public c:I

.field public d:I

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:I

.field public j:I

.field public k:Ljava/lang/String;

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public p:Z

.field public q:Z

.field public r:I

.field public s:Ljava/lang/String;

.field public t:I

.field public u:I

.field public v:I

.field public w:Ljava/lang/String;

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/luck/picture/lib/style/SelectMainStyle$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/luck/picture/lib/style/SelectMainStyle$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/luck/picture/lib/style/SelectMainStyle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->e:Z

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->e:Z

    .line 5
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->c:I

    .line 6
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->d:I

    .line 7
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    iput-boolean v1, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->e:Z

    .line 8
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v1

    if-eqz v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    move v1, v0

    :goto_1
    iput-boolean v1, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->f:Z

    .line 9
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v1

    if-eqz v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    move v1, v0

    :goto_2
    iput-boolean v1, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->g:Z

    .line 10
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v1

    if-eqz v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    move v1, v0

    :goto_3
    iput-boolean v1, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->h:Z

    .line 11
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->i:I

    .line 12
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->j:I

    .line 13
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->k:Ljava/lang/String;

    .line 14
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->l:I

    .line 15
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->m:I

    .line 16
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->n:I

    .line 17
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->o:I

    .line 18
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v1

    if-eqz v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    move v1, v0

    :goto_4
    iput-boolean v1, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->p:Z

    .line 19
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v1

    if-eqz v1, :cond_5

    move v1, v2

    goto :goto_5

    :cond_5
    move v1, v0

    :goto_5
    iput-boolean v1, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->q:Z

    .line 20
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->r:I

    .line 21
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->s:Ljava/lang/String;

    .line 22
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->t:I

    .line 23
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->u:I

    .line 24
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->v:I

    .line 25
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->w:Ljava/lang/String;

    .line 26
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->x:I

    .line 27
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->y:I

    .line 28
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->z:I

    .line 29
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->A:I

    .line 30
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v1

    if-eqz v1, :cond_6

    move v0, v2

    :cond_6
    iput-boolean v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->B:Z

    .line 31
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->C:I

    .line 32
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->D:I

    .line 33
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->E:I

    .line 34
    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object v0

    iput-object v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->F:[I

    .line 35
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->G:I

    .line 36
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->H:I

    .line 37
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->I:I

    .line 38
    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object v0

    iput-object v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->J:[I

    .line 39
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->K:I

    .line 40
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->L:I

    .line 41
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->M:I

    .line 42
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->N:Ljava/lang/String;

    .line 43
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->O:I

    .line 44
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->P:I

    .line 45
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->Q:I

    .line 46
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->R:I

    .line 47
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->S:I

    .line 48
    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object v0

    iput-object v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->T:[I

    .line 49
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->U:I

    .line 50
    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object v0

    iput-object v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->V:[I

    .line 51
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->W:I

    .line 52
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->X:I

    .line 53
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->Y:I

    return-void
.end method


# virtual methods
.method public A()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->R:I

    .line 2
    .line 3
    return v0
.end method

.method public B()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->r:I

    .line 2
    .line 3
    return v0
.end method

.method public C()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public D()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->j:I

    .line 2
    .line 3
    return v0
.end method

.method public E()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->o:I

    .line 2
    .line 3
    return v0
.end method

.method public F()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->i:I

    .line 2
    .line 3
    return v0
.end method

.method public G()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->k:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public H()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->m:I

    .line 2
    .line 3
    return v0
.end method

.method public I()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->l:I

    .line 2
    .line 3
    return v0
.end method

.method public J()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->n:I

    .line 2
    .line 3
    return v0
.end method

.method public K()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->z:I

    .line 2
    .line 3
    return v0
.end method

.method public L()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->v:I

    .line 2
    .line 3
    return v0
.end method

.method public M()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->s:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public N()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->u:I

    .line 2
    .line 3
    return v0
.end method

.method public O()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->t:I

    .line 2
    .line 3
    return v0
.end method

.method public P()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->w:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public Q()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->y:I

    .line 2
    .line 3
    return v0
.end method

.method public R()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->x:I

    .line 2
    .line 3
    return v0
.end method

.method public S()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public T()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->B:Z

    .line 2
    .line 3
    return v0
.end method

.method public U()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->f:Z

    .line 2
    .line 3
    return v0
.end method

.method public V()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->e:Z

    .line 2
    .line 3
    return v0
.end method

.method public W()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->h:Z

    .line 2
    .line 3
    return v0
.end method

.method public X()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->q:Z

    .line 2
    .line 3
    return v0
.end method

.method public Y()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->g:Z

    .line 2
    .line 3
    return v0
.end method

.method public Z()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->p:Z

    .line 2
    .line 3
    return v0
.end method

.method public a()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->L:I

    .line 2
    .line 3
    return v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->M:I

    .line 2
    .line 3
    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->N:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public g()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->O:I

    .line 2
    .line 3
    return v0
.end method

.method public h()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->P:I

    .line 2
    .line 3
    return v0
.end method

.method public i()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->K:I

    .line 2
    .line 3
    return v0
.end method

.method public j()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->G:I

    .line 2
    .line 3
    return v0
.end method

.method public k()[I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->J:[I

    .line 2
    .line 3
    return-object v0
.end method

.method public l()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->I:I

    .line 2
    .line 3
    return v0
.end method

.method public m()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->H:I

    .line 2
    .line 3
    return v0
.end method

.method public n()[I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->V:[I

    .line 2
    .line 3
    return-object v0
.end method

.method public o()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->U:I

    .line 2
    .line 3
    return v0
.end method

.method public p()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->A:I

    .line 2
    .line 3
    return v0
.end method

.method public q()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->X:I

    .line 2
    .line 3
    return v0
.end method

.method public r()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->W:I

    .line 2
    .line 3
    return v0
.end method

.method public s()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->Y:I

    .line 2
    .line 3
    return v0
.end method

.method public t()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->D:I

    .line 2
    .line 3
    return v0
.end method

.method public u()[I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->F:[I

    .line 2
    .line 3
    return-object v0
.end method

.method public v()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->E:I

    .line 2
    .line 3
    return v0
.end method

.method public w()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->C:I

    .line 2
    .line 3
    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    iget p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->c:I

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 4
    .line 5
    .line 6
    iget p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->d:I

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 9
    .line 10
    .line 11
    iget-boolean p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->e:Z

    .line 12
    .line 13
    int-to-byte p2, p2

    .line 14
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 15
    .line 16
    .line 17
    iget-boolean p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->f:Z

    .line 18
    .line 19
    int-to-byte p2, p2

    .line 20
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 21
    .line 22
    .line 23
    iget-boolean p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->g:Z

    .line 24
    .line 25
    int-to-byte p2, p2

    .line 26
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 27
    .line 28
    .line 29
    iget-boolean p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->h:Z

    .line 30
    .line 31
    int-to-byte p2, p2

    .line 32
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 33
    .line 34
    .line 35
    iget p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->i:I

    .line 36
    .line 37
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 38
    .line 39
    .line 40
    iget p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->j:I

    .line 41
    .line 42
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 43
    .line 44
    .line 45
    iget-object p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->k:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    iget p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->l:I

    .line 51
    .line 52
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 53
    .line 54
    .line 55
    iget p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->m:I

    .line 56
    .line 57
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 58
    .line 59
    .line 60
    iget p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->n:I

    .line 61
    .line 62
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 63
    .line 64
    .line 65
    iget p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->o:I

    .line 66
    .line 67
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 68
    .line 69
    .line 70
    iget-boolean p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->p:Z

    .line 71
    .line 72
    int-to-byte p2, p2

    .line 73
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 74
    .line 75
    .line 76
    iget-boolean p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->q:Z

    .line 77
    .line 78
    int-to-byte p2, p2

    .line 79
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 80
    .line 81
    .line 82
    iget p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->r:I

    .line 83
    .line 84
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 85
    .line 86
    .line 87
    iget-object p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->s:Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    iget p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->t:I

    .line 93
    .line 94
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 95
    .line 96
    .line 97
    iget p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->u:I

    .line 98
    .line 99
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 100
    .line 101
    .line 102
    iget p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->v:I

    .line 103
    .line 104
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 105
    .line 106
    .line 107
    iget-object p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->w:Ljava/lang/String;

    .line 108
    .line 109
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    iget p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->x:I

    .line 113
    .line 114
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 115
    .line 116
    .line 117
    iget p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->y:I

    .line 118
    .line 119
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 120
    .line 121
    .line 122
    iget p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->z:I

    .line 123
    .line 124
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 125
    .line 126
    .line 127
    iget p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->A:I

    .line 128
    .line 129
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 130
    .line 131
    .line 132
    iget-boolean p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->B:Z

    .line 133
    .line 134
    int-to-byte p2, p2

    .line 135
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 136
    .line 137
    .line 138
    iget p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->C:I

    .line 139
    .line 140
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 141
    .line 142
    .line 143
    iget p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->D:I

    .line 144
    .line 145
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 146
    .line 147
    .line 148
    iget p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->E:I

    .line 149
    .line 150
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 151
    .line 152
    .line 153
    iget-object p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->F:[I

    .line 154
    .line 155
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V

    .line 156
    .line 157
    .line 158
    iget p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->G:I

    .line 159
    .line 160
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 161
    .line 162
    .line 163
    iget p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->H:I

    .line 164
    .line 165
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 166
    .line 167
    .line 168
    iget p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->I:I

    .line 169
    .line 170
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 171
    .line 172
    .line 173
    iget-object p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->J:[I

    .line 174
    .line 175
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V

    .line 176
    .line 177
    .line 178
    iget p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->K:I

    .line 179
    .line 180
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 181
    .line 182
    .line 183
    iget p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->L:I

    .line 184
    .line 185
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 186
    .line 187
    .line 188
    iget p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->M:I

    .line 189
    .line 190
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 191
    .line 192
    .line 193
    iget-object p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->N:Ljava/lang/String;

    .line 194
    .line 195
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    iget p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->O:I

    .line 199
    .line 200
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 201
    .line 202
    .line 203
    iget p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->P:I

    .line 204
    .line 205
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 206
    .line 207
    .line 208
    iget p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->Q:I

    .line 209
    .line 210
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 211
    .line 212
    .line 213
    iget p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->R:I

    .line 214
    .line 215
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 216
    .line 217
    .line 218
    iget p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->S:I

    .line 219
    .line 220
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 221
    .line 222
    .line 223
    iget-object p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->T:[I

    .line 224
    .line 225
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V

    .line 226
    .line 227
    .line 228
    iget p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->U:I

    .line 229
    .line 230
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 231
    .line 232
    .line 233
    iget-object p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->V:[I

    .line 234
    .line 235
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V

    .line 236
    .line 237
    .line 238
    iget p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->W:I

    .line 239
    .line 240
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 241
    .line 242
    .line 243
    iget p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->X:I

    .line 244
    .line 245
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 246
    .line 247
    .line 248
    iget p2, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->Y:I

    .line 249
    .line 250
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 251
    .line 252
    .line 253
    return-void
.end method

.method public x()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->Q:I

    .line 2
    .line 3
    return v0
.end method

.method public y()[I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->T:[I

    .line 2
    .line 3
    return-object v0
.end method

.method public z()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/style/SelectMainStyle;->S:I

    .line 2
    .line 3
    return v0
.end method
