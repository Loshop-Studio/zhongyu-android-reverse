.class public Lcom/luck/picture/lib/entity/LocalMedia;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/luck/picture/lib/entity/LocalMedia;",
            ">;"
        }
    .end annotation
.end field

.field public static L:Lv6/b;


# instance fields
.field public A:J

.field public B:Z

.field public C:Ljava/lang/String;

.field public D:Ljava/lang/String;

.field public E:J

.field public F:J

.field public G:Ljava/lang/String;

.field public H:Z

.field public I:Z

.field public J:Z

.field public K:Lcom/luck/picture/lib/entity/LocalMedia;

.field public c:J

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;

.field public k:Ljava/lang/String;

.field public l:J

.field public m:Z

.field public n:Z

.field public o:I

.field public p:I

.field public q:Ljava/lang/String;

.field public r:I

.field public s:Z

.field public t:I

.field public u:I

.field public v:I

.field public w:I

.field public x:I

.field public y:I

.field public z:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/luck/picture/lib/entity/LocalMedia$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/luck/picture/lib/entity/LocalMedia$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/luck/picture/lib/entity/LocalMedia;->CREATOR:Landroid/os/Parcelable$Creator;

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
    iput-wide v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->E:J

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 5

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 4
    iput-wide v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->E:J

    .line 5
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->c:J

    .line 6
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->d:Ljava/lang/String;

    .line 7
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->e:Ljava/lang/String;

    .line 8
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->f:Ljava/lang/String;

    .line 9
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->g:Ljava/lang/String;

    .line 10
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->h:Ljava/lang/String;

    .line 11
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->i:Ljava/lang/String;

    .line 12
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->j:Ljava/lang/String;

    .line 13
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->k:Ljava/lang/String;

    .line 14
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->l:J

    .line 15
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
    iput-boolean v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->m:Z

    .line 16
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    iput-boolean v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->n:Z

    .line 17
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->o:I

    .line 18
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->p:I

    .line 19
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->q:Ljava/lang/String;

    .line 20
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->r:I

    .line 21
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_2

    move v0, v2

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    iput-boolean v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->s:Z

    .line 22
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->t:I

    .line 23
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->u:I

    .line 24
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->v:I

    .line 25
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->w:I

    .line 26
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->x:I

    .line 27
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->y:I

    .line 28
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->z:F

    .line 29
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v3

    iput-wide v3, p0, Lcom/luck/picture/lib/entity/LocalMedia;->A:J

    .line 30
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_3

    move v0, v2

    goto :goto_3

    :cond_3
    move v0, v1

    :goto_3
    iput-boolean v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->B:Z

    .line 31
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->C:Ljava/lang/String;

    .line 32
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->D:Ljava/lang/String;

    .line 33
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v3

    iput-wide v3, p0, Lcom/luck/picture/lib/entity/LocalMedia;->E:J

    .line 34
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v3

    iput-wide v3, p0, Lcom/luck/picture/lib/entity/LocalMedia;->F:J

    .line 35
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->G:Ljava/lang/String;

    .line 36
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_4

    move v0, v2

    goto :goto_4

    :cond_4
    move v0, v1

    :goto_4
    iput-boolean v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->H:Z

    .line 37
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_5

    move v0, v2

    goto :goto_5

    :cond_5
    move v0, v1

    :goto_5
    iput-boolean v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->I:Z

    .line 38
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result p1

    if-eqz p1, :cond_6

    move v1, v2

    :cond_6
    iput-boolean v1, p0, Lcom/luck/picture/lib/entity/LocalMedia;->J:Z

    return-void
.end method

.method public static N()Lcom/luck/picture/lib/entity/LocalMedia;
    .locals 1

    .line 1
    sget-object v0, Lcom/luck/picture/lib/entity/LocalMedia;->L:Lv6/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lv6/b;

    .line 6
    .line 7
    invoke-direct {v0}, Lv6/b;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/luck/picture/lib/entity/LocalMedia;->L:Lv6/b;

    .line 11
    .line 12
    :cond_0
    sget-object v0, Lcom/luck/picture/lib/entity/LocalMedia;->L:Lv6/b;

    .line 13
    .line 14
    invoke-virtual {v0}, Lv6/b;->a()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    invoke-static {}, Lcom/luck/picture/lib/entity/LocalMedia;->a()Lcom/luck/picture/lib/entity/LocalMedia;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :cond_1
    return-object v0
.end method

.method public static a()Lcom/luck/picture/lib/entity/LocalMedia;
    .locals 1

    .line 1
    new-instance v0, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/luck/picture/lib/entity/LocalMedia;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static b()V
    .locals 1

    .line 1
    sget-object v0, Lcom/luck/picture/lib/entity/LocalMedia;->L:Lv6/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lv6/b;->b()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    sput-object v0, Lcom/luck/picture/lib/entity/LocalMedia;->L:Lv6/b;

    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;)Lcom/luck/picture/lib/entity/LocalMedia;
    .locals 8

    .line 1
    invoke-static {}, Lcom/luck/picture/lib/entity/LocalMedia;->a()Lcom/luck/picture/lib/entity/LocalMedia;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1}, Ll6/c;->c(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    new-instance v1, Ljava/io/File;

    .line 12
    .line 13
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-static {p0, v2}, La7/i;->h(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v1, Ljava/io/File;

    .line 26
    .line 27
    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    invoke-virtual {v0, p1}, Lcom/luck/picture/lib/entity/LocalMedia;->n0(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v0, v2}, Lcom/luck/picture/lib/entity/LocalMedia;->p0(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v0, v2}, Lcom/luck/picture/lib/entity/LocalMedia;->d0(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-static {v2}, La7/h;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v0, v2}, Lcom/luck/picture/lib/entity/LocalMedia;->m0(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-static {v2}, La7/h;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v0, v2}, Lcom/luck/picture/lib/entity/LocalMedia;->i0(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/io/File;->length()J

    .line 70
    .line 71
    .line 72
    move-result-wide v2

    .line 73
    invoke-virtual {v0, v2, v3}, Lcom/luck/picture/lib/entity/LocalMedia;->r0(J)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/io/File;->lastModified()J

    .line 77
    .line 78
    .line 79
    move-result-wide v2

    .line 80
    const-wide/16 v4, 0x3e8

    .line 81
    .line 82
    div-long/2addr v2, v4

    .line 83
    invoke-virtual {v0, v2, v3}, Lcom/luck/picture/lib/entity/LocalMedia;->a0(J)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    const-string v3, "Android/data/"

    .line 91
    .line 92
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    const-wide/16 v4, 0x0

    .line 97
    .line 98
    if-nez v3, :cond_3

    .line 99
    .line 100
    const-string v3, "data/user/"

    .line 101
    .line 102
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eqz v2, :cond_1

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_1
    invoke-virtual {v0}, Lcom/luck/picture/lib/entity/LocalMedia;->z()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-static {p0, v1}, La7/h;->i(Landroid/content/Context;Ljava/lang/String;)[Ljava/lang/Long;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    const/4 v2, 0x0

    .line 118
    aget-object v3, v1, v2

    .line 119
    .line 120
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 121
    .line 122
    .line 123
    move-result-wide v6

    .line 124
    cmp-long v3, v6, v4

    .line 125
    .line 126
    if-nez v3, :cond_2

    .line 127
    .line 128
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 129
    .line 130
    .line 131
    move-result-wide v2

    .line 132
    goto :goto_1

    .line 133
    :cond_2
    aget-object v2, v1, v2

    .line 134
    .line 135
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 136
    .line 137
    .line 138
    move-result-wide v2

    .line 139
    :goto_1
    invoke-virtual {v0, v2, v3}, Lcom/luck/picture/lib/entity/LocalMedia;->g0(J)V

    .line 140
    .line 141
    .line 142
    const/4 v2, 0x1

    .line 143
    aget-object v1, v1, v2

    .line 144
    .line 145
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 146
    .line 147
    .line 148
    move-result-wide v1

    .line 149
    invoke-virtual {v0, v1, v2}, Lcom/luck/picture/lib/entity/LocalMedia;->P(J)V

    .line 150
    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_3
    :goto_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 154
    .line 155
    .line 156
    move-result-wide v2

    .line 157
    invoke-virtual {v0, v2, v3}, Lcom/luck/picture/lib/entity/LocalMedia;->g0(J)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    if-eqz v1, :cond_4

    .line 165
    .line 166
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    int-to-long v4, v1

    .line 175
    :cond_4
    invoke-virtual {v0, v4, v5}, Lcom/luck/picture/lib/entity/LocalMedia;->P(J)V

    .line 176
    .line 177
    .line 178
    :goto_3
    invoke-virtual {v0}, Lcom/luck/picture/lib/entity/LocalMedia;->t()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    invoke-static {v1}, Ll6/c;->i(Ljava/lang/String;)Z

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    if-eqz v1, :cond_5

    .line 187
    .line 188
    invoke-static {p0, p1}, La7/h;->k(Landroid/content/Context;Ljava/lang/String;)Lo6/b;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    invoke-virtual {p0}, Lo6/b;->c()I

    .line 193
    .line 194
    .line 195
    move-result p1

    .line 196
    invoke-virtual {v0, p1}, Lcom/luck/picture/lib/entity/LocalMedia;->s0(I)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0}, Lo6/b;->b()I

    .line 200
    .line 201
    .line 202
    move-result p1

    .line 203
    invoke-virtual {v0, p1}, Lcom/luck/picture/lib/entity/LocalMedia;->f0(I)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {p0}, Lo6/b;->a()J

    .line 207
    .line 208
    .line 209
    move-result-wide p0

    .line 210
    invoke-virtual {v0, p0, p1}, Lcom/luck/picture/lib/entity/LocalMedia;->b0(J)V

    .line 211
    .line 212
    .line 213
    return-object v0

    .line 214
    :cond_5
    invoke-virtual {v0}, Lcom/luck/picture/lib/entity/LocalMedia;->t()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    invoke-static {v1}, Ll6/c;->d(Ljava/lang/String;)Z

    .line 219
    .line 220
    .line 221
    move-result v1

    .line 222
    if-eqz v1, :cond_6

    .line 223
    .line 224
    invoke-static {p0, p1}, La7/h;->d(Landroid/content/Context;Ljava/lang/String;)Lo6/b;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    invoke-virtual {p0}, Lo6/b;->a()J

    .line 229
    .line 230
    .line 231
    move-result-wide p0

    .line 232
    invoke-virtual {v0, p0, p1}, Lcom/luck/picture/lib/entity/LocalMedia;->b0(J)V

    .line 233
    .line 234
    .line 235
    return-object v0

    .line 236
    :cond_6
    invoke-static {p0, p1}, La7/h;->f(Landroid/content/Context;Ljava/lang/String;)Lo6/b;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    invoke-virtual {p0}, Lo6/b;->c()I

    .line 241
    .line 242
    .line 243
    move-result p1

    .line 244
    invoke-virtual {v0, p1}, Lcom/luck/picture/lib/entity/LocalMedia;->s0(I)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {p0}, Lo6/b;->b()I

    .line 248
    .line 249
    .line 250
    move-result p0

    .line 251
    invoke-virtual {v0, p0}, Lcom/luck/picture/lib/entity/LocalMedia;->f0(I)V

    .line 252
    .line 253
    .line 254
    return-object v0
.end method


# virtual methods
.method public A()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->k:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public B()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->A:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public C()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->i:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public D()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->t:I

    .line 2
    .line 3
    return v0
.end method

.method public E()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->m:Z

    .line 2
    .line 3
    return v0
.end method

.method public F()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->s:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/luck/picture/lib/entity/LocalMedia;->j()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public G()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/luck/picture/lib/entity/LocalMedia;->n()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public H()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->J:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/luck/picture/lib/entity/LocalMedia;->n()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public I()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->I:Z

    .line 2
    .line 3
    return v0
.end method

.method public J()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->H:Z

    .line 2
    .line 3
    return v0
.end method

.method public K()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->B:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/luck/picture/lib/entity/LocalMedia;->v()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public L()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/entity/LocalMedia;->A()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    xor-int/lit8 v0, v0, 0x1

    .line 10
    .line 11
    return v0
.end method

.method public M()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/entity/LocalMedia;->C()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    xor-int/lit8 v0, v0, 0x1

    .line 10
    .line 11
    return v0
.end method

.method public O()V
    .locals 1

    .line 1
    sget-object v0, Lcom/luck/picture/lib/entity/LocalMedia;->L:Lv6/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lv6/b;->d(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public P(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/luck/picture/lib/entity/LocalMedia;->E:J

    .line 2
    .line 3
    return-void
.end method

.method public Q(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/luck/picture/lib/entity/LocalMedia;->m:Z

    .line 2
    .line 3
    return-void
.end method

.method public R(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/luck/picture/lib/entity/LocalMedia;->r:I

    .line 2
    .line 3
    return-void
.end method

.method public S(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/luck/picture/lib/entity/LocalMedia;->w:I

    .line 2
    .line 3
    return-void
.end method

.method public T(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/luck/picture/lib/entity/LocalMedia;->v:I

    .line 2
    .line 3
    return-void
.end method

.method public U(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/luck/picture/lib/entity/LocalMedia;->x:I

    .line 2
    .line 3
    return-void
.end method

.method public V(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/luck/picture/lib/entity/LocalMedia;->y:I

    .line 2
    .line 3
    return-void
.end method

.method public W(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/luck/picture/lib/entity/LocalMedia;->z:F

    .line 2
    .line 3
    return-void
.end method

.method public X(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/entity/LocalMedia;->G:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public Y(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/luck/picture/lib/entity/LocalMedia;->n:Z

    .line 2
    .line 3
    return-void
.end method

.method public Z(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/entity/LocalMedia;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public a0(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/luck/picture/lib/entity/LocalMedia;->F:J

    .line 2
    .line 3
    return-void
.end method

.method public b0(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/luck/picture/lib/entity/LocalMedia;->l:J

    .line 2
    .line 3
    return-void
.end method

.method public c0(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/luck/picture/lib/entity/LocalMedia;->J:Z

    .line 2
    .line 3
    return-void
.end method

.method public d0(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/entity/LocalMedia;->C:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public e0(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/luck/picture/lib/entity/LocalMedia;->I:Z

    .line 2
    .line 3
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/luck/picture/lib/entity/LocalMedia;->x()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->x()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-static {v1, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_3

    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/luck/picture/lib/entity/LocalMedia;->z()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->z()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-static {v1, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_3

    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/luck/picture/lib/entity/LocalMedia;->s()J

    .line 42
    .line 43
    .line 44
    move-result-wide v3

    .line 45
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->s()J

    .line 46
    .line 47
    .line 48
    move-result-wide v5

    .line 49
    cmp-long v1, v3, v5

    .line 50
    .line 51
    if-nez v1, :cond_2

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    move v0, v2

    .line 55
    :cond_3
    :goto_0
    if-eqz v0, :cond_4

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_4
    const/4 p1, 0x0

    .line 59
    :goto_1
    iput-object p1, p0, Lcom/luck/picture/lib/entity/LocalMedia;->K:Lcom/luck/picture/lib/entity/LocalMedia;

    .line 60
    .line 61
    return v0
.end method

.method public f0(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/luck/picture/lib/entity/LocalMedia;->u:I

    .line 2
    .line 3
    return-void
.end method

.method public g()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/entity/LocalMedia;->x()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/luck/picture/lib/entity/LocalMedia;->G()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/luck/picture/lib/entity/LocalMedia;->n()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :cond_0
    invoke-virtual {p0}, Lcom/luck/picture/lib/entity/LocalMedia;->F()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/luck/picture/lib/entity/LocalMedia;->j()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :cond_1
    invoke-virtual {p0}, Lcom/luck/picture/lib/entity/LocalMedia;->L()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/luck/picture/lib/entity/LocalMedia;->A()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    :cond_2
    invoke-virtual {p0}, Lcom/luck/picture/lib/entity/LocalMedia;->K()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_3

    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/luck/picture/lib/entity/LocalMedia;->v()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    :cond_3
    invoke-virtual {p0}, Lcom/luck/picture/lib/entity/LocalMedia;->M()Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_4

    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/luck/picture/lib/entity/LocalMedia;->C()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    :cond_4
    return-object v0
.end method

.method public g0(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/luck/picture/lib/entity/LocalMedia;->c:J

    .line 2
    .line 3
    return-void
.end method

.method public h()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->E:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public h0(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/luck/picture/lib/entity/LocalMedia;->H:Z

    .line 2
    .line 3
    return-void
.end method

.method public i()Lcom/luck/picture/lib/entity/LocalMedia;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->K:Lcom/luck/picture/lib/entity/LocalMedia;

    .line 2
    .line 3
    return-object v0
.end method

.method public i0(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/entity/LocalMedia;->q:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public j()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->g:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public j0(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/luck/picture/lib/entity/LocalMedia;->p:I

    .line 2
    .line 3
    return-void
.end method

.method public k()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->w:I

    .line 2
    .line 3
    return v0
.end method

.method public k0(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/luck/picture/lib/entity/LocalMedia;->B:Z

    .line 2
    .line 3
    return-void
.end method

.method public l()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->v:I

    .line 2
    .line 3
    return v0
.end method

.method public l0(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/entity/LocalMedia;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public m()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->G:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public m0(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/entity/LocalMedia;->D:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public n()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public n0(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/entity/LocalMedia;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public o()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->F:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public o0(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/luck/picture/lib/entity/LocalMedia;->o:I

    .line 2
    .line 3
    return-void
.end method

.method public p()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->l:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public p0(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/entity/LocalMedia;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public q()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->C:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public q0(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/entity/LocalMedia;->k:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public r()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->u:I

    .line 2
    .line 3
    return v0
.end method

.method public r0(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/luck/picture/lib/entity/LocalMedia;->A:J

    .line 2
    .line 3
    return-void
.end method

.method public s()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->c:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public s0(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/luck/picture/lib/entity/LocalMedia;->t:I

    .line 2
    .line 3
    return-void
.end method

.method public t()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->q:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public u()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->p:I

    .line 2
    .line 3
    return v0
.end method

.method public v()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public w()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->D:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->c:J

    .line 2
    .line 3
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Lcom/luck/picture/lib/entity/LocalMedia;->d:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p2, p0, Lcom/luck/picture/lib/entity/LocalMedia;->e:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object p2, p0, Lcom/luck/picture/lib/entity/LocalMedia;->f:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object p2, p0, Lcom/luck/picture/lib/entity/LocalMedia;->g:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object p2, p0, Lcom/luck/picture/lib/entity/LocalMedia;->h:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object p2, p0, Lcom/luck/picture/lib/entity/LocalMedia;->i:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-object p2, p0, Lcom/luck/picture/lib/entity/LocalMedia;->j:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iget-object p2, p0, Lcom/luck/picture/lib/entity/LocalMedia;->k:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-wide v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->l:J

    .line 47
    .line 48
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 49
    .line 50
    .line 51
    iget-boolean p2, p0, Lcom/luck/picture/lib/entity/LocalMedia;->m:Z

    .line 52
    .line 53
    int-to-byte p2, p2

    .line 54
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 55
    .line 56
    .line 57
    iget-boolean p2, p0, Lcom/luck/picture/lib/entity/LocalMedia;->n:Z

    .line 58
    .line 59
    int-to-byte p2, p2

    .line 60
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 61
    .line 62
    .line 63
    iget p2, p0, Lcom/luck/picture/lib/entity/LocalMedia;->o:I

    .line 64
    .line 65
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 66
    .line 67
    .line 68
    iget p2, p0, Lcom/luck/picture/lib/entity/LocalMedia;->p:I

    .line 69
    .line 70
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 71
    .line 72
    .line 73
    iget-object p2, p0, Lcom/luck/picture/lib/entity/LocalMedia;->q:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iget p2, p0, Lcom/luck/picture/lib/entity/LocalMedia;->r:I

    .line 79
    .line 80
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 81
    .line 82
    .line 83
    iget-boolean p2, p0, Lcom/luck/picture/lib/entity/LocalMedia;->s:Z

    .line 84
    .line 85
    int-to-byte p2, p2

    .line 86
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 87
    .line 88
    .line 89
    iget p2, p0, Lcom/luck/picture/lib/entity/LocalMedia;->t:I

    .line 90
    .line 91
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 92
    .line 93
    .line 94
    iget p2, p0, Lcom/luck/picture/lib/entity/LocalMedia;->u:I

    .line 95
    .line 96
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 97
    .line 98
    .line 99
    iget p2, p0, Lcom/luck/picture/lib/entity/LocalMedia;->v:I

    .line 100
    .line 101
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 102
    .line 103
    .line 104
    iget p2, p0, Lcom/luck/picture/lib/entity/LocalMedia;->w:I

    .line 105
    .line 106
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 107
    .line 108
    .line 109
    iget p2, p0, Lcom/luck/picture/lib/entity/LocalMedia;->x:I

    .line 110
    .line 111
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 112
    .line 113
    .line 114
    iget p2, p0, Lcom/luck/picture/lib/entity/LocalMedia;->y:I

    .line 115
    .line 116
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 117
    .line 118
    .line 119
    iget p2, p0, Lcom/luck/picture/lib/entity/LocalMedia;->z:F

    .line 120
    .line 121
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    .line 122
    .line 123
    .line 124
    iget-wide v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->A:J

    .line 125
    .line 126
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 127
    .line 128
    .line 129
    iget-boolean p2, p0, Lcom/luck/picture/lib/entity/LocalMedia;->B:Z

    .line 130
    .line 131
    int-to-byte p2, p2

    .line 132
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 133
    .line 134
    .line 135
    iget-object p2, p0, Lcom/luck/picture/lib/entity/LocalMedia;->C:Ljava/lang/String;

    .line 136
    .line 137
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    iget-object p2, p0, Lcom/luck/picture/lib/entity/LocalMedia;->D:Ljava/lang/String;

    .line 141
    .line 142
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    iget-wide v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->E:J

    .line 146
    .line 147
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 148
    .line 149
    .line 150
    iget-wide v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->F:J

    .line 151
    .line 152
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 153
    .line 154
    .line 155
    iget-object p2, p0, Lcom/luck/picture/lib/entity/LocalMedia;->G:Ljava/lang/String;

    .line 156
    .line 157
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    iget-boolean p2, p0, Lcom/luck/picture/lib/entity/LocalMedia;->H:Z

    .line 161
    .line 162
    int-to-byte p2, p2

    .line 163
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 164
    .line 165
    .line 166
    iget-boolean p2, p0, Lcom/luck/picture/lib/entity/LocalMedia;->I:Z

    .line 167
    .line 168
    int-to-byte p2, p2

    .line 169
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 170
    .line 171
    .line 172
    iget-boolean p2, p0, Lcom/luck/picture/lib/entity/LocalMedia;->J:Z

    .line 173
    .line 174
    int-to-byte p2, p2

    .line 175
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 176
    .line 177
    .line 178
    return-void
.end method

.method public x()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public y()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->o:I

    .line 2
    .line 3
    return v0
.end method

.method public z()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/entity/LocalMedia;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
