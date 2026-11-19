.class public final Lcom/luck/picture/lib/config/PictureSelectionConfig;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/luck/picture/lib/config/PictureSelectionConfig;",
            ">;"
        }
    .end annotation
.end field

.field public static N0:Ln6/a;

.field public static O0:Ln6/d;

.field public static P0:Lz6/a;

.field public static Q0:Lq6/l;

.field public static volatile R0:Lcom/luck/picture/lib/config/PictureSelectionConfig;


# instance fields
.field public A:J

.field public A0:Z

.field public B:J

.field public B0:Z

.field public C:J

.field public C0:Z

.field public D:I

.field public D0:Z

.field public E:Z

.field public E0:Z

.field public F:Z

.field public F0:Z

.field public G:Z

.field public G0:Z

.field public H:Z

.field public H0:Z

.field public I:Z

.field public I0:Z

.field public J:Z

.field public J0:Z

.field public K:Z

.field public K0:Z

.field public L:Z

.field public L0:Z

.field public M:Z

.field public M0:Z

.field public N:Z

.field public O:Z

.field public P:Z

.field public Q:Z

.field public R:Ljava/util/List;

.field public S:Ljava/util/List;

.field public T:Z

.field public U:Ljava/lang/String;

.field public V:Ljava/lang/String;

.field public W:Ljava/lang/String;

.field public X:Ljava/lang/String;

.field public Y:Ljava/lang/String;

.field public Z:Ljava/lang/String;

.field public c:I

.field public d:Z

.field public e:Z

.field public e0:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public f0:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public g0:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public h0:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public i0:I

.field public j:I

.field public j0:Z

.field public k:Z

.field public k0:Z

.field public l:I

.field public l0:Z

.field public m:I

.field public m0:I

.field public n:I

.field public n0:Z

.field public o:I

.field public o0:Z

.field public p:I

.field public p0:Z

.field public q:I

.field public q0:Z

.field public r:I

.field public r0:Z

.field public s:I

.field public s0:I

.field public t:I

.field public t0:Z

.field public u:I

.field public u0:Z

.field public v:I

.field public v0:Z

.field public w:I

.field public w0:Z

.field public x:I

.field public x0:Z

.field public y:I

.field public y0:Z

.field public z:J

.field public z0:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/luck/picture/lib/config/PictureSelectionConfig$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/luck/picture/lib/config/PictureSelectionConfig$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 5

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c:I

    .line 4
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->d:Z

    .line 5
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->e:Z

    .line 6
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->f:Ljava/lang/String;

    .line 7
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->g:Ljava/lang/String;

    .line 8
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->h:Ljava/lang/String;

    .line 9
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->i:Ljava/lang/String;

    .line 10
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->j:I

    .line 11
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_2

    move v0, v2

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->k:Z

    .line 12
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->l:I

    .line 13
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->m:I

    .line 14
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->n:I

    .line 15
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->o:I

    .line 16
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->p:I

    .line 17
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->q:I

    .line 18
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->r:I

    .line 19
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->s:I

    .line 20
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->t:I

    .line 21
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->u:I

    .line 22
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->v:I

    .line 23
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->w:I

    .line 24
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->x:I

    .line 25
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->y:I

    .line 26
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v3

    iput-wide v3, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->z:J

    .line 27
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v3

    iput-wide v3, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->A:J

    .line 28
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v3

    iput-wide v3, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->B:J

    .line 29
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v3

    iput-wide v3, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->C:J

    .line 30
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->D:I

    .line 31
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_3

    move v0, v2

    goto :goto_3

    :cond_3
    move v0, v1

    :goto_3
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->E:Z

    .line 32
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_4

    move v0, v2

    goto :goto_4

    :cond_4
    move v0, v1

    :goto_4
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->F:Z

    .line 33
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_5

    move v0, v2

    goto :goto_5

    :cond_5
    move v0, v1

    :goto_5
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->G:Z

    .line 34
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_6

    move v0, v2

    goto :goto_6

    :cond_6
    move v0, v1

    :goto_6
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->H:Z

    .line 35
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_7

    move v0, v2

    goto :goto_7

    :cond_7
    move v0, v1

    :goto_7
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->I:Z

    .line 36
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_8

    move v0, v2

    goto :goto_8

    :cond_8
    move v0, v1

    :goto_8
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->J:Z

    .line 37
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_9

    move v0, v2

    goto :goto_9

    :cond_9
    move v0, v1

    :goto_9
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->K:Z

    .line 38
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_a

    move v0, v2

    goto :goto_a

    :cond_a
    move v0, v1

    :goto_a
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->L:Z

    .line 39
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_b

    move v0, v2

    goto :goto_b

    :cond_b
    move v0, v1

    :goto_b
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->M:Z

    .line 40
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_c

    move v0, v2

    goto :goto_c

    :cond_c
    move v0, v1

    :goto_c
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N:Z

    .line 41
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_d

    move v0, v2

    goto :goto_d

    :cond_d
    move v0, v1

    :goto_d
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->O:Z

    .line 42
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_e

    move v0, v2

    goto :goto_e

    :cond_e
    move v0, v1

    :goto_e
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->P:Z

    .line 43
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_f

    move v0, v2

    goto :goto_f

    :cond_f
    move v0, v1

    :goto_f
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->Q:Z

    .line 44
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->R:Ljava/util/List;

    .line 45
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->S:Ljava/util/List;

    .line 46
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_10

    move v0, v2

    goto :goto_10

    :cond_10
    move v0, v1

    :goto_10
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->T:Z

    .line 47
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->U:Ljava/lang/String;

    .line 48
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->V:Ljava/lang/String;

    .line 49
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->W:Ljava/lang/String;

    .line 50
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->X:Ljava/lang/String;

    .line 51
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->Y:Ljava/lang/String;

    .line 52
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->Z:Ljava/lang/String;

    .line 53
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->e0:Ljava/lang/String;

    .line 54
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->f0:Ljava/lang/String;

    .line 55
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->g0:Ljava/lang/String;

    .line 56
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->h0:Ljava/lang/String;

    .line 57
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->i0:I

    .line 58
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_11

    move v0, v2

    goto :goto_11

    :cond_11
    move v0, v1

    :goto_11
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->j0:Z

    .line 59
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_12

    move v0, v2

    goto :goto_12

    :cond_12
    move v0, v1

    :goto_12
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->k0:Z

    .line 60
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_13

    move v0, v2

    goto :goto_13

    :cond_13
    move v0, v1

    :goto_13
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->l0:Z

    .line 61
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->m0:I

    .line 62
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_14

    move v0, v2

    goto :goto_14

    :cond_14
    move v0, v1

    :goto_14
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->n0:Z

    .line 63
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_15

    move v0, v2

    goto :goto_15

    :cond_15
    move v0, v1

    :goto_15
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->o0:Z

    .line 64
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_16

    move v0, v2

    goto :goto_16

    :cond_16
    move v0, v1

    :goto_16
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->p0:Z

    .line 65
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_17

    move v0, v2

    goto :goto_17

    :cond_17
    move v0, v1

    :goto_17
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->q0:Z

    .line 66
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_18

    move v0, v2

    goto :goto_18

    :cond_18
    move v0, v1

    :goto_18
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->r0:Z

    .line 67
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->s0:I

    .line 68
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_19

    move v0, v2

    goto :goto_19

    :cond_19
    move v0, v1

    :goto_19
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->t0:Z

    .line 69
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_1a

    move v0, v2

    goto :goto_1a

    :cond_1a
    move v0, v1

    :goto_1a
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->u0:Z

    .line 70
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_1b

    move v0, v2

    goto :goto_1b

    :cond_1b
    move v0, v1

    :goto_1b
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->v0:Z

    .line 71
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_1c

    move v0, v2

    goto :goto_1c

    :cond_1c
    move v0, v1

    :goto_1c
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->w0:Z

    .line 72
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_1d

    move v0, v2

    goto :goto_1d

    :cond_1d
    move v0, v1

    :goto_1d
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->x0:Z

    .line 73
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_1e

    move v0, v2

    goto :goto_1e

    :cond_1e
    move v0, v1

    :goto_1e
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->y0:Z

    .line 74
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_1f

    move v0, v2

    goto :goto_1f

    :cond_1f
    move v0, v1

    :goto_1f
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->z0:Z

    .line 75
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_20

    move v0, v2

    goto :goto_20

    :cond_20
    move v0, v1

    :goto_20
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->A0:Z

    .line 76
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_21

    move v0, v2

    goto :goto_21

    :cond_21
    move v0, v1

    :goto_21
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->B0:Z

    .line 77
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_22

    move v0, v2

    goto :goto_22

    :cond_22
    move v0, v1

    :goto_22
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->C0:Z

    .line 78
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_23

    move v0, v2

    goto :goto_23

    :cond_23
    move v0, v1

    :goto_23
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->D0:Z

    .line 79
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_24

    move v0, v2

    goto :goto_24

    :cond_24
    move v0, v1

    :goto_24
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->E0:Z

    .line 80
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_25

    move v0, v2

    goto :goto_25

    :cond_25
    move v0, v1

    :goto_25
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->F0:Z

    .line 81
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_26

    move v0, v2

    goto :goto_26

    :cond_26
    move v0, v1

    :goto_26
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->G0:Z

    .line 82
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_27

    move v0, v2

    goto :goto_27

    :cond_27
    move v0, v1

    :goto_27
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->H0:Z

    .line 83
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_28

    move v0, v2

    goto :goto_28

    :cond_28
    move v0, v1

    :goto_28
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->I0:Z

    .line 84
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_29

    move v0, v2

    goto :goto_29

    :cond_29
    move v0, v1

    :goto_29
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->J0:Z

    .line 85
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_2a

    move v0, v2

    goto :goto_2a

    :cond_2a
    move v0, v1

    :goto_2a
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->K0:Z

    .line 86
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_2b

    move v0, v2

    goto :goto_2b

    :cond_2b
    move v0, v1

    :goto_2b
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->L0:Z

    .line 87
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result p1

    if-eqz p1, :cond_2c

    move v1, v2

    :cond_2c
    iput-boolean v1, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->M0:Z

    return-void
.end method

.method public synthetic constructor <init>(Landroid/os/Parcel;Lcom/luck/picture/lib/config/PictureSelectionConfig$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/luck/picture/lib/config/PictureSelectionConfig;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public static a()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    sput-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 3
    .line 4
    sput-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->Q0:Lq6/l;

    .line 5
    .line 6
    sput-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->O0:Ln6/d;

    .line 7
    .line 8
    invoke-static {}, Lcom/luck/picture/lib/thread/PictureThreadUtils;->j()Ljava/util/concurrent/ExecutorService;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v1}, Lcom/luck/picture/lib/thread/PictureThreadUtils;->e(Ljava/util/concurrent/ExecutorService;)V

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lu6/a;->h()V

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lt6/a;->a()V

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lcom/luck/picture/lib/entity/LocalMedia;->b()V

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Lu6/a;->p(Lcom/luck/picture/lib/entity/LocalMediaFolder;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public static b()Lcom/luck/picture/lib/config/PictureSelectionConfig;
    .locals 1

    .line 1
    invoke-static {}, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/luck/picture/lib/config/PictureSelectionConfig;->g()V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static c()Lcom/luck/picture/lib/config/PictureSelectionConfig;
    .locals 2

    .line 1
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->R0:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->R0:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 13
    .line 14
    invoke-direct {v1}, Lcom/luck/picture/lib/config/PictureSelectionConfig;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->R0:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 18
    .line 19
    sget-object v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->R0:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 20
    .line 21
    invoke-virtual {v1}, Lcom/luck/picture/lib/config/PictureSelectionConfig;->g()V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v1

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    :goto_0
    monitor-exit v0

    .line 28
    goto :goto_2

    .line 29
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    throw v1

    .line 31
    :cond_1
    :goto_2
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->R0:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 32
    .line 33
    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final g()V
    .locals 5

    .line 1
    invoke-static {}, Ll6/d;->c()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iput v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->d:Z

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    iput v1, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->l:I

    .line 12
    .line 13
    new-instance v1, Lz6/a;

    .line 14
    .line 15
    invoke-direct {v1}, Lz6/a;-><init>()V

    .line 16
    .line 17
    .line 18
    sput-object v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->P0:Lz6/a;

    .line 19
    .line 20
    const/16 v1, 0x9

    .line 21
    .line 22
    iput v1, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->m:I

    .line 23
    .line 24
    iput v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->n:I

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    iput v1, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->o:I

    .line 28
    .line 29
    iput v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->p:I

    .line 30
    .line 31
    iput v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->q:I

    .line 32
    .line 33
    iput v1, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->r:I

    .line 34
    .line 35
    const/4 v2, -0x2

    .line 36
    iput v2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->D:I

    .line 37
    .line 38
    iput v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->s:I

    .line 39
    .line 40
    iput v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->t:I

    .line 41
    .line 42
    iput v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->u:I

    .line 43
    .line 44
    iput v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->v:I

    .line 45
    .line 46
    const-wide/16 v2, 0x0

    .line 47
    .line 48
    iput-wide v2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->z:J

    .line 49
    .line 50
    iput-wide v2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->A:J

    .line 51
    .line 52
    iput-wide v2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->B:J

    .line 53
    .line 54
    iput-wide v2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->C:J

    .line 55
    .line 56
    const/16 v2, 0x3c

    .line 57
    .line 58
    iput v2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->w:I

    .line 59
    .line 60
    iput v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->x:I

    .line 61
    .line 62
    const/4 v3, 0x4

    .line 63
    iput v3, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->y:I

    .line 64
    .line 65
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->k:Z

    .line 66
    .line 67
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->Q:Z

    .line 68
    .line 69
    iput-boolean v1, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->E:Z

    .line 70
    .line 71
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->F:Z

    .line 72
    .line 73
    iput-boolean v1, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->G:Z

    .line 74
    .line 75
    iput-boolean v1, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->H:Z

    .line 76
    .line 77
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->T:Z

    .line 78
    .line 79
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->e:Z

    .line 80
    .line 81
    iput-boolean v1, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->I:Z

    .line 82
    .line 83
    iput-boolean v1, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->J:Z

    .line 84
    .line 85
    iput-boolean v1, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->K:Z

    .line 86
    .line 87
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->P:Z

    .line 88
    .line 89
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N:Z

    .line 90
    .line 91
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->O:Z

    .line 92
    .line 93
    const-string v3, ".jpeg"

    .line 94
    .line 95
    iput-object v3, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->f:Ljava/lang/String;

    .line 96
    .line 97
    const-string v3, ".mp4"

    .line 98
    .line 99
    iput-object v3, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->g:Ljava/lang/String;

    .line 100
    .line 101
    const-string v3, "image/jpeg"

    .line 102
    .line 103
    iput-object v3, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->h:Ljava/lang/String;

    .line 104
    .line 105
    const-string v3, "video/mp4"

    .line 106
    .line 107
    iput-object v3, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->i:Ljava/lang/String;

    .line 108
    .line 109
    const-string v3, ""

    .line 110
    .line 111
    iput-object v3, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->U:Ljava/lang/String;

    .line 112
    .line 113
    iput-object v3, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->V:Ljava/lang/String;

    .line 114
    .line 115
    iput-object v3, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->W:Ljava/lang/String;

    .line 116
    .line 117
    new-instance v4, Ljava/util/ArrayList;

    .line 118
    .line 119
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 120
    .line 121
    .line 122
    iput-object v4, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->R:Ljava/util/List;

    .line 123
    .line 124
    iput-object v3, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->X:Ljava/lang/String;

    .line 125
    .line 126
    iput-object v3, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->Y:Ljava/lang/String;

    .line 127
    .line 128
    iput-object v3, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->Z:Ljava/lang/String;

    .line 129
    .line 130
    iput-object v3, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->e0:Ljava/lang/String;

    .line 131
    .line 132
    iput-object v3, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->f0:Ljava/lang/String;

    .line 133
    .line 134
    iput v2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->i0:I

    .line 135
    .line 136
    iput-boolean v1, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->j0:Z

    .line 137
    .line 138
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->k0:Z

    .line 139
    .line 140
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->l0:Z

    .line 141
    .line 142
    const/4 v2, -0x1

    .line 143
    iput v2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->m0:I

    .line 144
    .line 145
    iput-boolean v1, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->n0:Z

    .line 146
    .line 147
    iput-boolean v1, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->o0:Z

    .line 148
    .line 149
    iput-boolean v1, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->p0:Z

    .line 150
    .line 151
    iput-boolean v1, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->q0:Z

    .line 152
    .line 153
    invoke-static {}, La7/j;->e()Z

    .line 154
    .line 155
    .line 156
    move-result v4

    .line 157
    xor-int/2addr v4, v1

    .line 158
    iput-boolean v4, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->r0:Z

    .line 159
    .line 160
    invoke-static {}, Ll6/d;->a()I

    .line 161
    .line 162
    .line 163
    move-result v4

    .line 164
    iput v4, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->s0:I

    .line 165
    .line 166
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->t0:Z

    .line 167
    .line 168
    iput v2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->j:I

    .line 169
    .line 170
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->u0:Z

    .line 171
    .line 172
    iput-boolean v1, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->v0:Z

    .line 173
    .line 174
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->x0:Z

    .line 175
    .line 176
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->y0:Z

    .line 177
    .line 178
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->z0:Z

    .line 179
    .line 180
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->A0:Z

    .line 181
    .line 182
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->B0:Z

    .line 183
    .line 184
    iput-boolean v1, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->L:Z

    .line 185
    .line 186
    iget v2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c:I

    .line 187
    .line 188
    invoke-static {}, Ll6/d;->b()I

    .line 189
    .line 190
    .line 191
    move-result v4

    .line 192
    if-eq v2, v4, :cond_0

    .line 193
    .line 194
    move v2, v1

    .line 195
    goto :goto_0

    .line 196
    :cond_0
    move v2, v0

    .line 197
    :goto_0
    iput-boolean v2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->M:Z

    .line 198
    .line 199
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->C0:Z

    .line 200
    .line 201
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->w0:Z

    .line 202
    .line 203
    iput-boolean v1, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->D0:Z

    .line 204
    .line 205
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->E0:Z

    .line 206
    .line 207
    new-instance v2, Ljava/util/ArrayList;

    .line 208
    .line 209
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 210
    .line 211
    .line 212
    iput-object v2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->S:Ljava/util/List;

    .line 213
    .line 214
    iput-object v3, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->g0:Ljava/lang/String;

    .line 215
    .line 216
    iput-boolean v1, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->F0:Z

    .line 217
    .line 218
    iput-object v3, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->h0:Ljava/lang/String;

    .line 219
    .line 220
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->G0:Z

    .line 221
    .line 222
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->H0:Z

    .line 223
    .line 224
    iput-boolean v1, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->I0:Z

    .line 225
    .line 226
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->J0:Z

    .line 227
    .line 228
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->K0:Z

    .line 229
    .line 230
    iput-boolean v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->L0:Z

    .line 231
    .line 232
    iput-boolean v1, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->M0:Z

    .line 233
    .line 234
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    iget p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c:I

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 4
    .line 5
    .line 6
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->d:Z

    .line 7
    .line 8
    int-to-byte p2, p2

    .line 9
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 10
    .line 11
    .line 12
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->e:Z

    .line 13
    .line 14
    int-to-byte p2, p2

    .line 15
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 16
    .line 17
    .line 18
    iget-object p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->f:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->g:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->h:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->i:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iget p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->j:I

    .line 39
    .line 40
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 41
    .line 42
    .line 43
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->k:Z

    .line 44
    .line 45
    int-to-byte p2, p2

    .line 46
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 47
    .line 48
    .line 49
    iget p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->l:I

    .line 50
    .line 51
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 52
    .line 53
    .line 54
    iget p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->m:I

    .line 55
    .line 56
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 57
    .line 58
    .line 59
    iget p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->n:I

    .line 60
    .line 61
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 62
    .line 63
    .line 64
    iget p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->o:I

    .line 65
    .line 66
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 67
    .line 68
    .line 69
    iget p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->p:I

    .line 70
    .line 71
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 72
    .line 73
    .line 74
    iget p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->q:I

    .line 75
    .line 76
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 77
    .line 78
    .line 79
    iget p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->r:I

    .line 80
    .line 81
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 82
    .line 83
    .line 84
    iget p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->s:I

    .line 85
    .line 86
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 87
    .line 88
    .line 89
    iget p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->t:I

    .line 90
    .line 91
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 92
    .line 93
    .line 94
    iget p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->u:I

    .line 95
    .line 96
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 97
    .line 98
    .line 99
    iget p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->v:I

    .line 100
    .line 101
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 102
    .line 103
    .line 104
    iget p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->w:I

    .line 105
    .line 106
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 107
    .line 108
    .line 109
    iget p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->x:I

    .line 110
    .line 111
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 112
    .line 113
    .line 114
    iget p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->y:I

    .line 115
    .line 116
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 117
    .line 118
    .line 119
    iget-wide v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->z:J

    .line 120
    .line 121
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 122
    .line 123
    .line 124
    iget-wide v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->A:J

    .line 125
    .line 126
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 127
    .line 128
    .line 129
    iget-wide v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->B:J

    .line 130
    .line 131
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 132
    .line 133
    .line 134
    iget-wide v0, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->C:J

    .line 135
    .line 136
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 137
    .line 138
    .line 139
    iget p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->D:I

    .line 140
    .line 141
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 142
    .line 143
    .line 144
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->E:Z

    .line 145
    .line 146
    int-to-byte p2, p2

    .line 147
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 148
    .line 149
    .line 150
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->F:Z

    .line 151
    .line 152
    int-to-byte p2, p2

    .line 153
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 154
    .line 155
    .line 156
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->G:Z

    .line 157
    .line 158
    int-to-byte p2, p2

    .line 159
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 160
    .line 161
    .line 162
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->H:Z

    .line 163
    .line 164
    int-to-byte p2, p2

    .line 165
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 166
    .line 167
    .line 168
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->I:Z

    .line 169
    .line 170
    int-to-byte p2, p2

    .line 171
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 172
    .line 173
    .line 174
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->J:Z

    .line 175
    .line 176
    int-to-byte p2, p2

    .line 177
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 178
    .line 179
    .line 180
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->K:Z

    .line 181
    .line 182
    int-to-byte p2, p2

    .line 183
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 184
    .line 185
    .line 186
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->L:Z

    .line 187
    .line 188
    int-to-byte p2, p2

    .line 189
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 190
    .line 191
    .line 192
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->M:Z

    .line 193
    .line 194
    int-to-byte p2, p2

    .line 195
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 196
    .line 197
    .line 198
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N:Z

    .line 199
    .line 200
    int-to-byte p2, p2

    .line 201
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 202
    .line 203
    .line 204
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->O:Z

    .line 205
    .line 206
    int-to-byte p2, p2

    .line 207
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 208
    .line 209
    .line 210
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->P:Z

    .line 211
    .line 212
    int-to-byte p2, p2

    .line 213
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 214
    .line 215
    .line 216
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->Q:Z

    .line 217
    .line 218
    int-to-byte p2, p2

    .line 219
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 220
    .line 221
    .line 222
    iget-object p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->R:Ljava/util/List;

    .line 223
    .line 224
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 225
    .line 226
    .line 227
    iget-object p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->S:Ljava/util/List;

    .line 228
    .line 229
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 230
    .line 231
    .line 232
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->T:Z

    .line 233
    .line 234
    int-to-byte p2, p2

    .line 235
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 236
    .line 237
    .line 238
    iget-object p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->U:Ljava/lang/String;

    .line 239
    .line 240
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    iget-object p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->V:Ljava/lang/String;

    .line 244
    .line 245
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    iget-object p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->W:Ljava/lang/String;

    .line 249
    .line 250
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    iget-object p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->X:Ljava/lang/String;

    .line 254
    .line 255
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    iget-object p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->Y:Ljava/lang/String;

    .line 259
    .line 260
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    iget-object p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->Z:Ljava/lang/String;

    .line 264
    .line 265
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    iget-object p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->e0:Ljava/lang/String;

    .line 269
    .line 270
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    iget-object p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->f0:Ljava/lang/String;

    .line 274
    .line 275
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    iget-object p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->g0:Ljava/lang/String;

    .line 279
    .line 280
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    iget-object p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->h0:Ljava/lang/String;

    .line 284
    .line 285
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    iget p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->i0:I

    .line 289
    .line 290
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 291
    .line 292
    .line 293
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->j0:Z

    .line 294
    .line 295
    int-to-byte p2, p2

    .line 296
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 297
    .line 298
    .line 299
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->k0:Z

    .line 300
    .line 301
    int-to-byte p2, p2

    .line 302
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 303
    .line 304
    .line 305
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->l0:Z

    .line 306
    .line 307
    int-to-byte p2, p2

    .line 308
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 309
    .line 310
    .line 311
    iget p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->m0:I

    .line 312
    .line 313
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 314
    .line 315
    .line 316
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->n0:Z

    .line 317
    .line 318
    int-to-byte p2, p2

    .line 319
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 320
    .line 321
    .line 322
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->o0:Z

    .line 323
    .line 324
    int-to-byte p2, p2

    .line 325
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 326
    .line 327
    .line 328
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->p0:Z

    .line 329
    .line 330
    int-to-byte p2, p2

    .line 331
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 332
    .line 333
    .line 334
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->q0:Z

    .line 335
    .line 336
    int-to-byte p2, p2

    .line 337
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 338
    .line 339
    .line 340
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->r0:Z

    .line 341
    .line 342
    int-to-byte p2, p2

    .line 343
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 344
    .line 345
    .line 346
    iget p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->s0:I

    .line 347
    .line 348
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 349
    .line 350
    .line 351
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->t0:Z

    .line 352
    .line 353
    int-to-byte p2, p2

    .line 354
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 355
    .line 356
    .line 357
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->u0:Z

    .line 358
    .line 359
    int-to-byte p2, p2

    .line 360
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 361
    .line 362
    .line 363
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->v0:Z

    .line 364
    .line 365
    int-to-byte p2, p2

    .line 366
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 367
    .line 368
    .line 369
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->w0:Z

    .line 370
    .line 371
    int-to-byte p2, p2

    .line 372
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 373
    .line 374
    .line 375
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->x0:Z

    .line 376
    .line 377
    int-to-byte p2, p2

    .line 378
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 379
    .line 380
    .line 381
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->y0:Z

    .line 382
    .line 383
    int-to-byte p2, p2

    .line 384
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 385
    .line 386
    .line 387
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->z0:Z

    .line 388
    .line 389
    int-to-byte p2, p2

    .line 390
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 391
    .line 392
    .line 393
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->A0:Z

    .line 394
    .line 395
    int-to-byte p2, p2

    .line 396
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 397
    .line 398
    .line 399
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->B0:Z

    .line 400
    .line 401
    int-to-byte p2, p2

    .line 402
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 403
    .line 404
    .line 405
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->C0:Z

    .line 406
    .line 407
    int-to-byte p2, p2

    .line 408
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 409
    .line 410
    .line 411
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->D0:Z

    .line 412
    .line 413
    int-to-byte p2, p2

    .line 414
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 415
    .line 416
    .line 417
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->E0:Z

    .line 418
    .line 419
    int-to-byte p2, p2

    .line 420
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 421
    .line 422
    .line 423
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->F0:Z

    .line 424
    .line 425
    int-to-byte p2, p2

    .line 426
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 427
    .line 428
    .line 429
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->G0:Z

    .line 430
    .line 431
    int-to-byte p2, p2

    .line 432
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 433
    .line 434
    .line 435
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->H0:Z

    .line 436
    .line 437
    int-to-byte p2, p2

    .line 438
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 439
    .line 440
    .line 441
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->I0:Z

    .line 442
    .line 443
    int-to-byte p2, p2

    .line 444
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 445
    .line 446
    .line 447
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->J0:Z

    .line 448
    .line 449
    int-to-byte p2, p2

    .line 450
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 451
    .line 452
    .line 453
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->K0:Z

    .line 454
    .line 455
    int-to-byte p2, p2

    .line 456
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 457
    .line 458
    .line 459
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->L0:Z

    .line 460
    .line 461
    int-to-byte p2, p2

    .line 462
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 463
    .line 464
    .line 465
    iget-boolean p2, p0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->M0:Z

    .line 466
    .line 467
    int-to-byte p2, p2

    .line 468
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 469
    .line 470
    .line 471
    return-void
.end method
